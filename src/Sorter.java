public class Sorter {
    public static int[] sortIncreasing(int[] pChaosNums){
        int[] sortedNums = new int[pChaosNums.length];
        for(int i = 0; i < pChaosNums.length; i++){
            sortedNums[calculateNewIndex(pChaosNums, i, '>')] = pChaosNums[i];
        }
        return sortedNums;
    }
    public static int[] sortDecreasing(int[] pChaosNums){
        int[] sortedNums = new int[pChaosNums.length];
        for(int i = 0; i < pChaosNums.length; i++){
            sortedNums[calculateNewIndex(pChaosNums, i, '<')] = pChaosNums[i];
        }
        return sortedNums;
    }
    private static int calculateNewIndex(int[] pChaosNums, int pCurrentIndex, char pGreaterOrSmaller){
        int finalIndex = 0;
        for(int i = 0; i < pChaosNums.length; i++){
            if(i == pCurrentIndex){
            } else if (pGreaterOrSmaller == '>') {
                if(pChaosNums[pCurrentIndex]>pChaosNums[i]){finalIndex++;}
            } else if (pGreaterOrSmaller == '<') {
                if(pChaosNums[pCurrentIndex]<pChaosNums[i]){finalIndex++;}
            }
        }
        return finalIndex;
    }
    public static void main(String[] args) {
        int[] chaosNums = new int[]{5, 2, 8, 5, 4, 9, 6, -1};
        int[] sortedNumsIncreasing = Sorter.sortIncreasing(chaosNums);
        int[] sortedNumsDecreasing = Sorter.sortDecreasing(chaosNums);
        System.out.print("Chaos Numbers: ");
        for (int i = 0; i < chaosNums.length; i++){
            System.out.print("(" + chaosNums[i] + ")");
        }
        System.out.println("");
        System.out.print("Sorted Numbers Increasing: ");
        for (int i = 0; i < sortedNumsIncreasing.length; i++){
            System.out.print("(" + sortedNumsIncreasing[i] + ")");
        }
        System.out.println("");
        System.out.print("Sorted Numbers Decreasing: ");
        for (int i = 0; i < sortedNumsDecreasing.length; i++){
            System.out.print("(" + sortedNumsDecreasing[i] + ")");
        }
    }
}