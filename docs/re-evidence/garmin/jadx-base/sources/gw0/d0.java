package gw0;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        pv0.a aVar = (pv0.a) t7;
        pv0.a aVar2 = (pv0.a) t14;
        return r13.a.b(aVar != null ? Integer.valueOf(aVar.ordinal()) : null, aVar2 != null ? Integer.valueOf(aVar2.ordinal()) : null);
    }
}
