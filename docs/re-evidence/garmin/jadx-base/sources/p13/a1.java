package p13;

import java.util.Collections;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
public class a1 {
    public static q13.g a(q13.g gVar) {
        q13.c<E, ?> cVar = gVar.f142145a;
        cVar.b();
        return cVar.f142129i > 0 ? gVar : q13.g.f142144b;
    }

    public static <T> Set<T> b(T t7) {
        Set<T> setSingleton = Collections.singleton(t7);
        setSingleton.getClass();
        return setSingleton;
    }
}
