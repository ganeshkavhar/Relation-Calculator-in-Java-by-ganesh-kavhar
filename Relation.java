Code :<br />
import java.awt.*;<br />
import javax.swing.*;<br />
import java.io.*;</p>
<p>class flam<br />
{<br />
  static int a_count[]=new int[30];<br />
  static int b_count[]=new int[30];<br />
}</p>
<p>class  flames1<br />
{<br />
  public static void main(String args[])<br />
  {<br />
   String s1,s2;<br />
   int i,j,len,sum=0;<br />
   int result[]=new int[30];<br />
   char str1[],str2[];<br />
   s1=JOptionPane.showInputDialog(“Enter name of the Boy”);<br />
   s2=JOptionPane.showInputDialog(“Enter name of the Girl:”);<br />
   str1=s1.toCharArray();<br />
   str2=s2.toCharArray();<br />
   flam ob=new flam();</p>
<p>   for(i=0;i<s1.length();i++)<br />
   {<br />
    if(str1[i]==’A’ || str1[i]==’a’)<br />
    {<br />
     ob.a_count[0]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’B’ || str1[i]==’b’)<br />
    {<br />
     ob.a_count[1]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’C’ || str1[i]==’c’)<br />
    {<br />
     ob.a_count[2]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’D’ || str1[i]==’d’)<br />
    {<br />
     ob.a_count[3]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’E’ || str1[i]==’e’)<br />
    {<br />
     ob.a_count[4]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’F’ || str1[i]==’f’)<br />
    {<br />
     ob.a_count[5]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’G’ || str1[i]==’g’)<br />
    {<br />
     ob.a_count[6]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’H’ || str1[i]==’h’)<br />
    {<br />
     ob.a_count[7]++;<br />
    }<br />
    else<br />
    if(str1[i]==’I’ || str1[i]==’i’)<br />
    {<br />
     ob.a_count[8]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’J’ || str1[i]==’j’)<br />
    {<br />
     ob.a_count[9]++;<br />
    }<br />
    else<br />
    if(str1[i]==’K’ || str1[i]==’k’)<br />
    {<br />
     ob.a_count[10]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’L’ || str1[i]==’l’)<br />
    {<br />
     ob.a_count[11]++;<br />
    }<br />
    else<br />
    if(str1[i]==’M’ || str1[i]==’m’)<br />
    {<br />
     ob.a_count[12]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’N’ || str1[i]==’n’)<br />
    {<br />
     ob.a_count[13]++;<br />
    }<br />
    else<br />
    if(str1[i]==’O’ || str1[i]==’o’)<br />
    {<br />
     ob.a_count[14]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’P’ || str1[i]==’p’)<br />
    {<br />
     ob.a_count[15]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’Q’ || str1[i]==’q’)<br />
    {<br />
     ob.a_count[16]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’R’ || str1[i]==’r’)<br />
    {<br />
     ob.a_count[17]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’S’ || str1[i]==’s’)<br />
    {<br />
     ob.a_count[18]++;<br />
    }<br />
    else<br />
    if(str1[i]==’T’ || str1[i]==’t’)<br />
    {<br />
     ob.a_count[19]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’U’ || str1[i]==’u’)<br />
    {<br />
     ob.a_count[20]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’V’ || str1[i]==’v’)<br />
    {<br />
     ob.a_count[21]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’W’ || str1[i]==’w’)<br />
    {<br />
     ob.a_count[22]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’X’ || str1[i]==’x’)<br />
    {<br />
     ob.a_count[23]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’Y’ || str1[i]==’y’)<br />
    {<br />
     ob.a_count[24]++;<br />
    }</p>
<p>    else<br />
    if(str1[i]==’Z’ || str1[i]==’z’)<br />
    {<br />
     ob.a_count[25]++;<br />
    }<br />
  }</p>
<p>  for(i=0;i<s2.length();i++)<br />
  {<br />
    if(str2[i]==’A’ || str2[i]==’a’)<br />
    {<br />
     ob.b_count[0]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’B’ || str2[i]==’b’)<br />
    {<br />
     ob.b_count[1]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’C’ || str2[i]==’c’)<br />
    {<br />
     ob.b_count[2]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’D’ || str2[i]==’d’)<br />
    {<br />
     ob.b_count[3]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’E’ || str2[i]==’e’)<br />
    {<br />
     ob.b_count[4]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’F’ || str2[i]==’f’)<br />
    {<br />
     ob.b_count[5]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’G’ || str2[i]==’g’)<br />
    {<br />
     ob.b_count[6]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’H’ || str2[i]==’h’)<br />
    {<br />
     ob.b_count[7]++;<br />
    }<br />
    else<br />
    if(str2[i]==’I’ || str2[i]==’i’)<br />
    {<br />
     ob.b_count[8]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’J’ || str2[i]==’j’)<br />
    {<br />
     ob.b_count[9]++;<br />
    }<br />
    else<br />
    if(str2[i]==’K’ || str2[i]==’k’)<br />
    {<br />
     ob.b_count[10]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’L’ || str2[i]==’l’)<br />
    {<br />
     ob.b_count[11]++;<br />
    }<br />
    else<br />
    if(str2[i]==’M’ || str2[i]==’m’)<br />
    {<br />
     ob.b_count[12]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’N’ || str2[i]==’n’)<br />
    {<br />
     ob.b_count[13]++;<br />
    }<br />
    else<br />
    if(str2[i]==’O’ || str2[i]==’o’)<br />
    {<br />
     ob.b_count[14]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’P’ || str2[i]==’p’)<br />
    {<br />
     ob.b_count[15]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’Q’ || str2[i]==’q’)<br />
    {<br />
     ob.b_count[16]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’R’ || str2[i]==’r’)<br />
    {<br />
     ob.b_count[17]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’S’ || str2[i]==’s’)<br />
    {<br />
     ob.b_count[18]++;<br />
    }<br />
    else<br />
    if(str2[i]==’T’ || str2[i]==’t’)<br />
    {<br />
     ob.b_count[19]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’U’ || str2[i]==’u’)<br />
    {<br />
     ob.b_count[20]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’V’ || str2[i]==’v’)<br />
    {<br />
     ob.b_count[21]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’W’ || str2[i]==’w’)<br />
    {<br />
     ob.b_count[22]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’X’ || str2[i]==’x’)<br />
    {<br />
     ob.b_count[23]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’Y’ || str2[i]==’y’)<br />
    {<br />
     ob.b_count[24]++;<br />
    }</p>
<p>    else<br />
    if(str2[i]==’Z’ || str2[i]==’z’)<br />
    {<br />
     ob.b_count[25]++;<br />
    }<br />
  }</p>
<p>   for(i=0;i<26;i++)<br />
   result[i]=Math.abs(ob.a_count[i]-ob.b_count[i]);</p>
<p>   for(i=0;i<26;i++)<br />
   sum=sum+result[i];</p>
<p>   if(sum==1)<br />
   JOptionPane.showMessageDialog(null,”SISTER”,”The Relationship<br />
is”,JOptionPane.INFORMATION_MESSAGE);<br />
   else<br />
   if(sum==2 || sum==4 || sum==7 || sum==9)<br />
   JOptionPane.showMessageDialog(null,”ENEMIES”,”The Relationship<br />
is”,JOptionPane.INFORMATION_MESSAGE);<br />
   else<br />
   if(sum==3 || sum==5 || sum==14)<br />
   JOptionPane.showMessageDialog(null,”FRIENDS”,”The Relationship<br />
is”,JOptionPane.INFORMATION_MESSAGE);<br />
   else<br />
   if(sum==6 || sum==11 || sum==15)<br />
   JOptionPane.showMessageDialog(null,”MARRIAGE”,”The Relationship<br />
is”,JOptionPane.INFORMATION_MESSAGE);<br />
   else<br />
   if(sum==10)<br />
   JOptionPane.showMessageDialog(null,”LOVE”,”The Relationship<br />
is”,JOptionPane.INFORMATION_MESSAGE);<br />
   else<br />
   if(sum==8 || sum==12 || sum==13)<br />
   JOptionPane.showMessageDialog(null,”AFFECTION”,”The Relationship<br />
is”,JOptionPane.INFORMATION_MESSAGE);<br />
   else<br />
   JOptionPane.showMessageDialog(null,”Not available in this Version”);<br />
   System.exit(0);<br />
 }<br />
}<br />
