import java.util.HashMap;
public class test{

    
     public static void main(String[] args) {
        String x ="====";
        for(int i =0;i<5;i++){
           // System.out.println(i);   
        }
        //System.out.println("int");  
        String msg1 = "Hello";
        String msg2 = msg1;

            System.out.println(msg1 == msg2);  // true

        int a =0;
        int b =0;

            System.out.println(a==b); // true

        int l =0;

            while(true){
        
                l++;
                if(l>=5){
                    break;
            }
        }
        for(int k=0;k<5;k++){
           // System.out.println(k);
        }

        for(int j=5;j>0;j--){
           
        } 
        // System.out.println("====");

        for(int i=0;i<10;i++){
            if(i%2==0){
                continue; //ココの処理以降スキップされまたfor文が続く
            }
            System.out.println(i);  //奇数が出力される
        }
        int i = 0;

        HashMap<Integer,String> num = new HashMap<>();

            num.put(1,"0001");//入力
            num.put(2,"0010");
            num.put(3,"0011");

            num.get(1); //0001が出力
            System.out.println("====");
            System.out.println(Integer.parseInt(num.get(3)));

            System.out.println(String.format("%04d", 1));

            int []hairetu =new int [3];
                hairetu[0]=0;
                hairetu[1]=1;
                hairetu[2]=2;
                System.out.println(hairetu[0]);

            String [] moji01 = new String [3];
                moji01[0]="a";
                moji01[1]="b";
                moji01[2]="c";

                System.out.println(moji01[hairetu[0]]);
                int [][] nijigenn =new int [3][3];

                nijigenn[0][0]=1;
                nijigenn[1][0]=2;
                System.out.println(x);
                System.out.println(nijigenn[1][0]);
            
            
            
            String moto1 ="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
            String rand62[] = moto1.split("");
            String moto2="";

            for(int k=0;k<=5;k++){
                int f =(int)(Math.random()*62+1);
                moto2 = moto2+rand62[f];
            }

            System.out.println();
            System.out.println(x);
            System.out.println("https://suprasia/"+moto2);
            

                


                

        

    }
}