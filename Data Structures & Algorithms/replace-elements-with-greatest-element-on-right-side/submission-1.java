
class Solution {
    public int[] replaceElements(int[] arr) {
        int bag = -1;
        for(int i = arr.length-1;i>=0;i--){
            int curele = arr[i];

            arr[i]=bag;

            if(curele>bag){
                bag = curele;
            }
        }
    return arr;
    }
}
