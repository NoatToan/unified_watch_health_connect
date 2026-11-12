package p13;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class f0 extends e0 {
    public static ArrayList K(CopyOnWriteArraySet copyOnWriteArraySet) {
        copyOnWriteArraySet.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArraySet) {
            if (al2.p.class.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
