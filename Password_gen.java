
import java.util.Random;
import javax.swing.JTextArea;
import javax.swing.JTextPane;




public class Password_gen {

        public void display(String name,JTextPane JTextpane1,JTextPane JTextpane2,JTextPane JTextpane3,JTextPane JTextpane4)throws Exception
        {
            
            String input = name;
            int a = input.length();
             String f[] = new String[a];
            String betterIdea = null;
            String app;
            System.out.println(a);
             if(a>=5)
             {
                 JTextpane4.setText("processing");
            char b[] = new char[a];
            char t[] = new char[a]; 
            StringBuilder c[] = new StringBuilder[a];
            //Random r =new Random(20);
            //String b[] = input.split("");
             //Random rand = new Random(); 
  
        // Generate random integers in range 0 to 999 
              
              
                  Random rand1 = new Random(); 
  
        // Generate random integers in range 0 to 999
              int rand_int1 = rand1.nextInt(20);
              int rand_int2 = rand1.nextInt(5);
              int rand_int3 = rand1.nextInt(7);
              int rand_int4 = rand1.nextInt(9);
              int rand_int5 = rand1.nextInt(11);
              int rand_int6 = rand1.nextInt(13);
              char ca = (char)(rand1.nextInt(26) + 'a');
                 //System.out.print(ca);
            for(int i=0;i<a;i++)
            {
              b[i] = input.charAt(i);
              t[i] =b[i];
             
            }
            for(int j=1;j<=3;j++)
            {
                if(j==1)
                {
            for(int i=0;i<=a;i++)
            {
            if(i==0)
            {
               b[i] = Character.toUpperCase(input.charAt(0));
               //System.out.print(b[i]);
                betterIdea = b[i] + input.substring(1);
            }
            else if(i==a)
            {
               StringBuilder sb1 = new StringBuilder(betterIdea); 
                // Appending the boolean value 
                sb1.append("@"+rand_int1+""+rand_int2);
                 //System.out.print(sb1);
                 c[j]=sb1;
               
            }
               
            
            }
            JTextpane1.setText(c[j].toString());
            //System.out.println(c[j]);
            }
                
          if(j==2)
                {
                    //System.out.println(t[0]);
            for(int i=0;i<=a;i++)
            {
            if(i==1)
            {
               b[i] = Character.toUpperCase(input.charAt(1));
               //System.out.print(b[i]);
                betterIdea =  b[i] + input.substring(2);
            }
            else if(i==a)
            {
               StringBuilder sb1 = new StringBuilder(betterIdea); 
                // Appending the boolean value 
                sb1.append("$"+rand_int3+""+rand_int4);
                 //System.out.print(sb1);
                 c[j]=sb1;
               
            }
               
            
            }
            //System.out.println(t[0]+""+c[j]);
            JTextpane2.setText((t[0]+""+c[j]).toString());
            }
                
            if(j==3)
                {
                    //System.out.println(t[0]);
            for(int i=0;i<=a;i++)
            {
            if(i==2)
            {
               b[i] = Character.toUpperCase(input.charAt(0));
               //System.out.print(b[i]);
                betterIdea =  b[i] + input.substring(1);
            }
            else if(i==a)
            {
               StringBuilder sb1 = new StringBuilder(betterIdea); 
                // Appending the boolean value 
                sb1.append(ca+""+"@#"+rand_int5+""+rand_int6);
                 //System.out.print(sb1);
                 c[j]=sb1;
               
            }
               
            
            }
            //System.out.println(c[j]);
            JTextpane3.setText(c[j].toString());
            }
                
            
            }  
         
           for(int j=1;j<=3;j++) 
           {
               if(j!=2)
               {
                   //f[j] = c[j].toString();
               System.out.println("password"+j+":"+c[j]);
               //JTextpane1.setText(f[j]);
               }
               else
               {
                //f[j] = c[j].toString();   
               System.out.println("password"+j+":"+t[0]+c[j]); 
                 //JTextpane1.setText(t[0]+f[j]);
               }
           }
            
            
        }
        
        else
        {
            JTextpane4.setText("Please enter atleast 5 letter word!!!");
            System.out.println("Entered word has only "+a+" letters."+"\nplease enter atleast 5 letter word!!!");
        }
                
                
    }
}

