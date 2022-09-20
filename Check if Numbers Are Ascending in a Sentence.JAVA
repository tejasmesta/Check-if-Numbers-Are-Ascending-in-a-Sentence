class Solution {
    public boolean areNumbersAscending(String s) 
    {
        int n = s.length();
        
        int prev = Integer.MAX_VALUE;
        
        int i = 0;
        
        while(i<n)
        {
            char c = s.charAt(i);
            
            if(Character.isDigit(c))
            {
                String ss = c+"";
                
                i++;
                
                while(i<n && Character.isDigit(s.charAt(i)))
                {
                    ss+=s.charAt(i);
                    i++;
                }
                
                System.out.print(ss+" ");
                
                System.out.println(prev);
                
                if(prev==Integer.MAX_VALUE)
                {
                    prev = Integer.parseInt(ss);
                }
                else
                {
                    if(Integer.parseInt(ss)<=prev)
                        return false;
                    prev = Integer.parseInt(ss);
                }
            }
            
            i++;
        }
        
        return true;
    }
}
