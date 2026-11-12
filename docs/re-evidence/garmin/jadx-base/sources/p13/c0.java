package p13;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class c0 extends b0 {
    public static <T extends Comparable<? super T>> void t(List<T> list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> void u(List<T> list, Comparator<? super T> comparator) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
