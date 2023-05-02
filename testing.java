class Multiplex{  
static int multiplex(int a,int b){return a*b;}  
static int multiplex(int a,int b,int c){return a*b*c;}  
}  
class TestOverloading1{  
public static void main(String[] args){  
System.out.println(Multiplex.multiplex(15,15));  
System.out.println(Multiplex.multiplex(11,11,11));  
}}  