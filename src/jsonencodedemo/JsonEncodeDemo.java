/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonencodedemo;


import org.json.simple.JSONObject;

class JsonEncodeDemo {

   public static void main(String[] args){
      JSONObject obj = new JSONObject();

      obj.put("name", "Jordan");
      obj.put("school", "BYUI");
      obj.put("age", new Integer(31));
      obj.put("year", new Integer(2015));
      obj.put("is_student", new Boolean(true));

      System.out.print(obj);
   }
}