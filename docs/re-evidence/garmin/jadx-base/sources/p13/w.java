package p13;

import java.util.Collections;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class w {
    public static q13.b a(q13.b bVar) {
        bVar.g();
        bVar.f142105c = true;
        return bVar.f142104b > 0 ? bVar : q13.b.f142102d;
    }

    public static q13.b b() {
        return new q13.b(0, 1, null);
    }

    public static <T> List<T> c(T t7) {
        List<T> listSingletonList = Collections.singletonList(t7);
        listSingletonList.getClass();
        return listSingletonList;
    }
}
