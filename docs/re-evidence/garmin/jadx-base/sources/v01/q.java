package v01;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class q<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        j23.g<b63.v> gVar = ((g21.o) t7).f75466d;
        b63.v vVar = gVar != null ? (b63.v) gVar.getStart() : null;
        j23.g<b63.v> gVar2 = ((g21.o) t14).f75466d;
        return r13.a.b(vVar, gVar2 != null ? (b63.v) gVar2.getStart() : null);
    }
}
