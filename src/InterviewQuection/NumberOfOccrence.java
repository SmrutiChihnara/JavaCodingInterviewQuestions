package InterviewQuection;

public class NumberOfOccrence {
    public static void getData( char []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j]&&arr[j]!=' ')
                {
                    count++;
                    arr[j]=' ';
                }
            }
            if(arr[i]!=' '&&count>1)
            System.out.println(arr[i]+"  "+count);
        }

    }

    public static void main(String[] args) {
        getData("helloWorld".toCharArray());
    }
}
