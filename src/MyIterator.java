public class MyIterator {

    private Integer[] array;

    public MyIterator(Integer[] array) {
        this.array = array;
    }

    public Iterator iterator() {
        Iterator it = new Iterator() {

            private int currentIndex = 0;

            @Override
            public Boolean hasNext() {
                return currentIndex < array.length;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    return null;
                }
                return array[currentIndex++];
            }
        };
        return it;
    }
}
