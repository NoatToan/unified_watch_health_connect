package p13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class y extends x {
    public static <T> int r(Iterable<? extends T> iterable, int i14) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i14;
    }

    public static ArrayList s(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            d0.v(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
