import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule }   from '@angular/router';
import { HelloComponent } from './hello/hello.component';
import { Component2Component } from './component2/component2.component';

@NgModule({
  imports:      [ HttpClientModule, BrowserModule ],
  declarations: [ AppComponent, HelloComponent, Component2Component ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
