package o61;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class m<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        k kVar = (k) t14;
        k kVar2 = (k) t7;
        return r13.a.b(kVar != null ? kVar.h() : null, kVar2 != null ? kVar2.h() : null);
    }
}
