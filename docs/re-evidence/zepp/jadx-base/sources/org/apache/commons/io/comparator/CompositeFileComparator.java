package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class CompositeFileComparator extends a implements Serializable {
    private static final Comparator<?>[] b = new Comparator[0];
    private static final long serialVersionUID = -2224170307287243428L;
    private final Comparator<File>[] a;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Comparator<?>[], java.util.Comparator<java.io.File>[]] */
    public CompositeFileComparator(Comparator<File>... comparatorArr) {
        if (comparatorArr == null) {
            this.a = b;
            return;
        }
        Comparator<File>[] comparatorArr2 = new Comparator[comparatorArr.length];
        this.a = comparatorArr2;
        System.arraycopy(comparatorArr, 0, comparatorArr2, 0, comparatorArr.length);
    }

    @Override // org.apache.commons.io.comparator.a
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort((List<File>) list);
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('{');
        for (int i = 0; i < this.a.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(this.a[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        int iCompare = 0;
        for (Comparator<File> comparator : this.a) {
            iCompare = comparator.compare(file, file2);
            if (iCompare != 0) {
                break;
            }
        }
        return iCompare;
    }

    @Override // org.apache.commons.io.comparator.a
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Comparator<?>[], java.util.Comparator<java.io.File>[]] */
    public CompositeFileComparator(Iterable<Comparator<File>> iterable) {
        if (iterable == null) {
            this.a = b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Comparator<File>> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        this.a = (Comparator[]) arrayList.toArray(new Comparator[arrayList.size()]);
    }
}
