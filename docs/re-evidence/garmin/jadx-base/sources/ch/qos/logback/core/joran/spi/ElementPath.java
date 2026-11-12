package ch.qos.logback.core.joran.spi;

import am.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ElementPath {
    ArrayList<String> partList;

    public ElementPath(String str) {
        String[] strArrSplit;
        this.partList = new ArrayList<>();
        if (str == null || (strArrSplit = str.split("/")) == null) {
            return;
        }
        for (String str2 : strArrSplit) {
            if (str2.length() > 0) {
                this.partList.add(str2);
            }
        }
    }

    private boolean equalityCheck(String str, String str2) {
        return str.equalsIgnoreCase(str2);
    }

    public ElementPath duplicate() {
        ElementPath elementPath = new ElementPath();
        elementPath.partList.addAll(this.partList);
        return elementPath;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ElementPath)) {
            return false;
        }
        ElementPath elementPath = (ElementPath) obj;
        if (elementPath.size() != size()) {
            return false;
        }
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            if (!equalityCheck(get(i14), elementPath.get(i14))) {
                return false;
            }
        }
        return true;
    }

    public String get(int i14) {
        return this.partList.get(i14);
    }

    public List<String> getCopyOfPartList() {
        return new ArrayList(this.partList);
    }

    public String peekLast() {
        if (this.partList.isEmpty()) {
            return null;
        }
        return this.partList.get(this.partList.size() - 1);
    }

    public void pop() {
        if (this.partList.isEmpty()) {
            return;
        }
        ArrayList<String> arrayList = this.partList;
        arrayList.remove(arrayList.size() - 1);
    }

    public void push(String str) {
        this.partList.add(str);
    }

    public int size() {
        return this.partList.size();
    }

    public String toStableString() {
        StringBuilder sb3 = new StringBuilder();
        Iterator<String> it = this.partList.iterator();
        while (it.hasNext()) {
            j.y(sb3, "[", it.next(), "]");
        }
        return sb3.toString();
    }

    public String toString() {
        return toStableString();
    }

    public ElementPath() {
        this.partList = new ArrayList<>();
    }

    public ElementPath(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        this.partList = arrayList;
        arrayList.addAll(list);
    }
}
