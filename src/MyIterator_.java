import java.util.List;

public class MyIterator_ implements Iterator {

    private List<Integer> list;
    private int currentIndex = 0;

    public MyIterator_(List<Integer> list) {
        this.list = list;
    }

    @Override
    public Boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            return null;
        }
        return list.get(currentIndex++);
    }

    public List<Integer> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "MyIterator_{" +
                "list=" + list +
                '}';
    }
}
