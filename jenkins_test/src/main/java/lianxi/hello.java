package lianxi;


/**
 * Create By abc on 2020/7/2
 */
public class hello {

    public static int fun(int a,int b){
       return a+b;
    }

    public static void main(String[] args) {
        int res = fun(2, 3);
        System.out.println(res);
    }



}


//        Map<Integer,String> map = new HashMap();

//        map.put(1, "aaa");
//        map.put(2, "bbb");

//        for (Map.Entry<Integer,String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + "=" + entry.getValue());
//        }
//
//        for (Integer key : map.keySet()) {
//            System.out.println(key);
//        }
//        for (String value : map.values()){
//            System.out.println(value);
//        }
//
//        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Integer, String> entry = iterator.next();
//            System.out.println(entry.getKey() + "=" + entry.getValue());
//        }
