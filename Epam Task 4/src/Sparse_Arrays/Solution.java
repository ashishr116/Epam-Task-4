package Sparse_Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the matchingStrings function below.
   static int[] matchingStrings(String[] strings, String[] queries) {
int n=queries.length;
int res[]=new int[n];
LinkedHashMap<String, Integer> hm=new LinkedHashMap<String, Integer>();
for (int k = 0; k < strings.length; k++) {

    if(hm.containsKey(strings[k]))
    {
        int p=hm.get(strings[k]);
        p=p+1;
        hm.put(strings[k],p);
    }
    else
    {
        hm.put(strings[k],1);
    }
}
for(int k=0;k<queries.length;k++)
{
    if(hm.containsKey(queries[k]))
   {res[k]=hm.get(queries[k]);

   } 
   else
   {
       res[k]=0;
   }
}

return res;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
