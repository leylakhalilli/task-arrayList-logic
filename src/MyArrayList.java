public class MyArrayList<Y> {
    private int index = 0;
    private Y[] arr;

    public MyArrayList() {
        arr = (Y[]) new Object[3];
    }

    public void add(Y newElement) {
        arr[index++] = newElement;
        if (index >= arr.length) {
            Y newArray[] = (Y[]) new Object[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
            }
            arr = newArray;
        }
    }

    public int getSize() {
        return index;
    }

    public Y index(int index) {
        return arr[index];
    }
}

