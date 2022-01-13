import { Component, OnInit } from '@angular/core';
import{CatalogueService} from '../services/catalogue.service';
import { Router } from '@angular/router';
import {Product} from '../model/product.model';




@Component({
  selector: 'app-produits',
  templateUrl: './produits.component.html',
  styleUrls: ['./produits.component.css']
})
export class ProduitsComponent implements OnInit {

   public produits:any;
   public size:number=5;
   public currentpage:number;
   public totalPages:number=0;
   public pages:Array<number>;
   public currentKeyword:string="";


  constructor(private catService:CatalogueService, private router:Router) { }

  ngOnInit(): void {

  }
  onGetProducts(){
    this.catService.getProducts(this.currentpage, this.size)
       .subscribe(data=>{
             this.totalPages=data["page"].totalPages;
             this.pages= new Array<number>(this.totalPages);
             this.produits=data;
           },err=>{
              console.log(err);

       });
  }
  onPageProduct(i) {
    this.currentpage=i;
    this.chercherProduits();
    }
 onChercher(form:any) {
     this.currentpage=0;
     this.currentKeyword=form.keyword;
     this.chercherProduits();
     }
  chercherProduits() {

  this.catService.getProductsByKeyword(this.currentKeyword,this.currentpage,this.size )
         .subscribe(data=>{

               this.totalPages=data["page"].totalPages;
               this.pages= new Array<number>(this.totalPages);
               this.produits=data;
             },err=>{
                console.log(err);

         });
    }
    onDeleteProduct(p){
       let conf=confirm("etes vous sur?");
       if(conf)
       this.catService.deleteResource(p._links.self.href)
         .subscribe(data=>{
           this.chercherProduits();

         },err=>{
           console.log("err");
         })
    }
 }





