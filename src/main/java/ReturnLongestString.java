
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        int count = 0;
        String result = "";
        for (String item: arr) {
          if (count == 0) {
            count = item.length();
          } else {
            if (item.length() > count) {
                count = item.length();
                result = item;
            }
          }
        }
        return result;
    }
}
