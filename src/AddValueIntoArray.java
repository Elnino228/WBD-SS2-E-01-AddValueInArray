public class AddValueIntoArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int value=6;
        int index=1;
        int[] newArr=addValue(value,index,arr);
        if (newArr==null)
            System.out.println("Can not add value!");
        else {
            System.out.println("New Array: ");
            for (int i=0;i<newArr.length;i++){
                System.out.println(newArr[i]+"\t");
            }
        }
    }
    public  static int[] addValue(int value,int index,int[] arr){
        if (index<0 || index>=arr.length){
            System.out.println("Index is invalid");
            return null;
        }
        int[] newArray=new int[arr.length+1];
        int j=0;
        for (int i=0;i<newArray.length;i++){
            if (i==index){
                newArray[i]=value;
            }else {
                newArray[i]=arr[j];
                j++;
            }
        }
        return newArray;
    }
}
