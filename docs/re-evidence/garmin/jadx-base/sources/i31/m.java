package i31;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class m<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        b63.u uVar = ((d31.a) t14).f57330j;
        b63.o oVarB = uVar != null ? uVar.b() : g22.l.d(b63.o.INSTANCE);
        b63.u uVar2 = ((d31.a) t7).f57330j;
        return r13.a.b(oVarB, uVar2 != null ? uVar2.b() : g22.l.d(b63.o.INSTANCE));
    }
}
