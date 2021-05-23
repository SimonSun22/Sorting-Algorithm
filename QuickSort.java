public void swap(int left, int right) {
        int temp;
        temp = left;
        left = right;
        right = temp;
}
    
public int findBase(int[] array, int left, int right) {
    int begin = left;
    int end = right-1;
    int key = array[right-1];

    while(begin < end) {
        while(begin<end && array[begin] <= key) {
            begin++;
        }
        while(begin<end && array[end] >= key) {
            end--;
        }
    }
    if (begin != end) swap(array[begin], array[end]);

    return begin;
}

public void QuickSort(int[] array, int left, int right) {

    if (right - left > 1) {

        int ret = findBase(array, left, right);
        QuickSort(array, left, ret);
        QuickSort(array, ret+1, right);
    }
}
