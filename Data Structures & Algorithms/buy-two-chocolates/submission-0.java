class Solution {
    public int buyChoco(int[] prices, int money) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<prices.length;i++){
            pq.add(prices[i]);
        }
        int a=pq.poll();
        int b=pq.poll();
        if(a+b<=money){
            return money-(a+b);
        }
        else{
            return money;
        }
        
    }
}