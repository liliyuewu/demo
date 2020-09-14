package Uitls;

import java.util.*;

/**
 * 字符组合工具类
 */
public class CombineUtils {


    /**
     * 将数数字数组，转换成字符数组
     * @param arrStr
     * @return
     */
    public static List<String[]> digitsConvertLetters(Integer[] arrStr){
        Map<Integer, List<String>> digitsMap = getDigitsMap();

        List<String[]> dataList = new ArrayList<String[]>();

        for(int i=0;i<arrStr.length;i++){
            //先将多个list中的数据都添加到同一个集合中作为数据源
            List<String> lettersList = digitsMap.get(arrStr[i]);
            if(lettersList.size() > 0){//没有数据的集合不能强行转换为数组
                String[] letterArr = (String[]) lettersList.toArray();
                dataList.add(letterArr);
            }
        }
        return  makeupLetters(dataList,0,null);
    }


    /**
     * 获取数字和字母的对应关系
     * @return
     */
    private static Map<Integer, List<String>> getDigitsMap(){
        Map<Integer, List<String>> digitsMap = new HashMap<>();
        digitsMap = new HashMap<>();
        digitsMap.put(0, Arrays.asList(""));
        digitsMap.put(1,Arrays.asList(""));
        digitsMap.put(2,Arrays.asList("A","B","C"));
        digitsMap.put(3,Arrays.asList("D","E","F"));
        digitsMap.put(4,Arrays.asList("G","H","I"));
        digitsMap.put(5,Arrays.asList("J","K","L"));
        digitsMap.put(6,Arrays.asList("M","N","O"));
        digitsMap.put(7,Arrays.asList("P","Q","R","S"));
        digitsMap.put(8,Arrays.asList("T","U","V"));
        digitsMap.put(9,Arrays.asList("W","X","Y","Z"));
        return  digitsMap;
    }

    /**
     * 递归算法组合
     * @param dataList
     * @param index
     * @param resultList
     * @return
     */
    private static List<String[]> makeupLetters(List<String[]> dataList, int index, List<String[]> resultList){
        if(index==dataList.size()){
            return resultList;
        }

        List<String[]> resultList0=new ArrayList<String[]>();
        if(index==0){//第一列数组默认有多少个字母就添加多少个排列数据
            String[] dataArr=dataList.get(0);
            for(String s : dataArr){
                resultList0.add(new String[]{s});
            }
        }else{
            String[] dataArr=dataList.get(index);
            for(String[] dataArr0: resultList){
                for(String s : dataArr){
                    //复制数组并扩充新元素
                    String[] dataArrCopy=new String[dataArr0.length+1];
                    System.arraycopy(dataArr0, 0, dataArrCopy, 0, dataArr0.length);
                    dataArrCopy[dataArrCopy.length-1]=s;
                    //追加到结果集
                    resultList0.add(dataArrCopy);
                }
            }
        }
        return makeupLetters(dataList,++index,resultList0);
    }

    /**
     * 打印结果
     * @param resultList
     */
    public static void printResult(List<String[]>  resultList){
        for(int i=0;i<resultList.size();i++){
            String[] letterArr=resultList.get(i);
            System.out.print(" ");
            for(String s: letterArr){
                System.out.print(s);
            }
        }
    }
}
