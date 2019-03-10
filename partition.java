public class partition{
  public static void switchPlace(int[] data, int first, int second){
    int temp = first;
    data[first] = data[second];
    data[second] = data[temp];
  }
  public static int partition (int [] data, int start, int end){
    int randnum = (int)(Math.random() * (end - start) + start);
    int partit = data[randnum];
    boolean startTrue = false;
    boolean endTrue = false;
    while (start < end){
      if (data[start] < partit){
        start++;
      }else{
        startTrue = true;
      }
      if (data[end] > partit){
        end--;
      }else{
        endTrue = true;
      }
      if ((endTrue && startTrue) && start < end){
        switchPlace(data, start, end);
      }
    }
    //return last position of partition.
    return end;
  }
}
