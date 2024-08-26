import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="calculator" width=500 height=500></applet>*/
public class calculator extends Applet implements ActionListener{
TextField t=new TextField(20);
double a,b1,c;
Button b[]=new Button[20];
int i,x,f=0;
String s[]={"0","1","2","3","4","5","6","7","8","9","+","-","*","/","=",".","<-","c","1/x","s"},s1;
public void init(){
setLayout(null);
t=new TextField(20);
for(i=0;i<20;i++){
b[i]=new Button(s[i]);
add(b[i]);
}
t.setBounds(30,20,200,50);
add(t);
x=40;
for(i=7;i<=9;i++){
b[i].setBounds(x,80,35,30);
x+=40;
}
x=40;
for(i=4;i<=6;i++){
b[i].setBounds(x,120,35,30);
x+=40;
}
x=40;
for(i=1;i<=3;i++){
b[i].setBounds(x,160,35,30);
x+=40;
}
x=40;
b[0].setBounds(x,200,35,30);
for(i=10;i<=11;i++){
x+=40;
b[i].setBounds(x,200,35,30);
}
x=40;
for(i=12;i<=14;i++){
b[i].setBounds(x,240,35,30);
x+=40;
}
x=80;
for(i=15;i<=19;i++){
b[i].setBounds(160,x,35,30);
x+=40;
}
for(i=0;i<20;i++){
b[i].addActionListener(this);
}
}
public void actionPerformed(ActionEvent e){
for(i=0;i<10;i++){
if(e.getSource()==b[i]){
if(t.getText().equals("")){
t.setText(b[i].getLabel());
}
else{
t.setText(t.getText()+b[i].getLabel());
}
}
}
if(e.getSource()==b[16]){
       String tt=t.getText();
String Res="";
for(int i=0; i<tt.length()-1; i++){
 Res+=tt.charAt(i);
}
if(tt.equals("")){
t.setText("0");
}
else{
t.setText(Res);
}
}
if(e.getSource()==b[17]){
t.setText("");
}
if(e.getSource()==b[15]){
f++;
if(f==1){
t.setText(t.getText()+".");
}
}
for(i=10;i<=13;i++){
if(e.getSource()==b[i]){
a=Double.parseDouble(t.getText());
t.setText("");
s1=b[i].getLabel();
f=0;
}
}

if(e.getSource()==b[14]){
b1=Double.parseDouble(t.getText());
if(s1.equals("+")){
c=b1+a;
}
else if(s1.equals("-")){
c=-b1+a;
}
else if(s1.equals("*")){
c=b1*a;
}
else if(s1.equals("/")){
c=a/b1;
}
t.setText(Double.toString(c));
}

if(e.getSource()==b[19]){
b1=Double.parseDouble(t.getText());
c=Math.sqrt(b1);
t.setText(Double.toString(c));
}
else if(e.getSource()==b[18]){
b1=Double.parseDouble(t.getText());
c=1/b1;
t.setText(Double.toString(c));
}
}
}