package gb1;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class n<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        db1.m mVar = (db1.m) t14;
        db1.m mVar2 = (db1.m) t7;
        return r13.a.b(mVar != null ? mVar.getPregnancyCycleStart() : null, mVar2 != null ? mVar2.getPregnancyCycleStart() : null);
    }
}
