package p13;

import java.util.Collections;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
public class t0 extends s0 {
    public static int a(int i14) {
        if (i14 < 0) {
            return i14;
        }
        if (i14 < 3) {
            return i14 + 1;
        }
        if (i14 < 1073741824) {
            return (int) ((i14 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> b(o13.p<? extends K, ? extends V> pVar) {
        pVar.getClass();
        Map<K, V> mapSingletonMap = Collections.singletonMap(pVar.f128594a, pVar.f128595b);
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
