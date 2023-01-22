class Casechange{
public static void main(String[]args){
String s="SolvERIN TECHDsGD God OF devIL";
StringBuffer str=new StringBuffer(s);
for(int i=0;i<s.length();i++){
char c=s.charAt(i);
if(Character.isLowerCase(c)){
str.set charAt (i,Character.toUpperCase(c));}
else if(Character.isUpperCase(c)){
str.set charAt(i,Character.toLowerCase(c));}
}}
System.out.println(str);
}}

