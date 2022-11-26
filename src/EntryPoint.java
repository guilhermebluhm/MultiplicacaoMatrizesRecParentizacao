public class EntryPoint {

    public static void main(String[] args) {

        int v[] = {200,2,30,20,5};
        System.out.println("minimal cost: " + matrix_chain_rec(v, 1, v.length - 1));

    }

    static int matrix_chain_rec(int p[], int i, int j){

        if(i == j)
            return 0;

        int min = Integer.MAX_VALUE;

        for(int k = i ; k <= j - 1 ; k+=1){

            int q = matrix_chain_rec(p, i, k) +
                    matrix_chain_rec(p, k+1, j) +
                    p[i - 1] * p[k] * p[j];

            if(q < min){
                min = q;
            }
        }

        return min;
    }

}
