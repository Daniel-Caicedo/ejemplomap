/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import modelo.Cliente;

/**
 *
 * @author daniel_f.caicedo
 */
public class Ejemplomap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<Cliente> listcac= new LinkedList<>();
        Map<Integer,LinkedList<Cliente>> map1 = new HashMap<>();
        
        listcac.add(new Cliente("david","1130","Uao"));
         listcac.add( new Cliente("andre","130","tigo"));
          listcac.add(new Cliente("pao","1330","sura"));
           listcac.add(new Cliente("jaun","2130","herbalife"));
            listcac.add(new Cliente("dani","1430","paraco"));
        
        map1.put(3, listcac);
       
         Map<Integer,Cliente> map2= new LinkedHashMap<>();
          Map<Integer,Cliente> map3= new TreeMap<>();
         
          
//          map1.put(55, new Cliente("david","1130","Uao"));
//          map1.put(3, new Cliente("andre","130","tigo"));
//          map1.put(10, new Cliente("pao","1330","sura"));
//          map1.put(40, new Cliente("jaun","2130","herbalife"));
//          map1.put(5, new Cliente("dani","1430","paraco"));
          
          map2.put(55, new Cliente("david","1130","Uao"));
          map2.put(3, new Cliente("andre","130","tigo"));
          map2.put(10, new Cliente("pao","1330","sura"));
          map2.put(40, new Cliente("jaun","2130","herbalife"));
          map2.put(5, new Cliente("dani","1430","paraco"));
          
          
          map3.put(55, new Cliente("david","1130","Uao"));
          map3.put(3, new Cliente("andre","130","tigo"));
          map3.put(10, new Cliente("pao","1330","sura"));
          map3.put(40, new Cliente("jaun","2130","herbalife"));
          map3.put(5, new Cliente("dani","1430","paraco"));
          
          
//          String m1= mostradatos(map1);
          String m2= mostradatos(map2);
          String m3= mostradatos(map2);
//          System.out.println(m1);
          System.out.println("____________");
           System.out.println(m2);
            System.out.println("____________");
           System.out.println(m2);
    }
    public static String mostradatos(Map<Integer, Cliente>m){
    
    String mostrar ="";
    
        Iterator<Map.Entry<Integer,Cliente>>it= m.entrySet().iterator();
        
        while (it.hasNext()) {
            Map.Entry<Integer, Cliente> next = it.next();
            mostrar+= next.getKey()+","+next.getValue()+"\n";
        }
    return mostrar;
    }
}
