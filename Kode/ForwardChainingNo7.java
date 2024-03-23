public class ForwardChainingNo7{
    static boolean A=true, B, C, D, E=true, F, G, H, I, J, K;

    public static void main(String[] args) {
            if (A==true && B==true) {
                System.out.println("C bernilai benar");
                C=true;
                if (C==true) {
                    D=true;
                    System.out.println("D bernilai benar");
                }else if(C==false){
                    D=false;
                }
            } else if(A==false || B==false){
                C=false;
            } 

            if (A==true && E==true){
                F=true;
                System.out.println("F bernilai benar");
            } else if(A==false || E==false){
                F=false;
            }

            if(A==true){
                G=true;
                System.out.println("G bernilai benar");
            }else if(A==false){
                G=false;
            }

            if(F==true && G==true){
                D=true;
                System.out.println("D bernilai benar");
            }else if(F==false || G==false){
                D=false;
            }

            if(G==true && E==true){
                H=true;
                System.out.println("H bernilai benar");
            }else if(G==false || E==false){
                H=false;
            }

            if(C==true && H==true){
                I=true;
                System.out.println("I bernilai benar");
            } else if(C==false || H==false){
                I=false;
            }

            if(I==true && A==true){
                J=true;
                System.out.println("J bernilai benar");
            } else if(I==false || A==false){
                J=false;
            }

            if(G==true){
                J=true;
                System.out.println("J bernilai benar");
            } else if(G==false){
                J=false;
            }

            if(J==true){
                K=true;
                System.out.println("K bernilai benar");
            }else if(J==false){
                K=false;
            }

            if (K==true) {
                System.out.println("Jadi kesimpulan dari metode forward chaining ini, K bernilai benar");
            }
    }
}