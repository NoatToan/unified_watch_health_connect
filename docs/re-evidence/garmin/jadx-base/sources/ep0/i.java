package ep0;

import am.x0;
import c22.c3;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class i<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f64888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f64889b;

    public i(Comparator comparator, b bVar) {
        this.f64888a = comparator;
        this.f64889b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        c3 c3Var;
        c3 c3Var2;
        int iCompare = this.f64888a.compare(t7, t14);
        if (iCompare != 0) {
            return iCompare;
        }
        x0 x0Var = ((y) t7).f64911h;
        String strA = null;
        b bVar = this.f64889b;
        String strA2 = (x0Var == null || (c3Var2 = x0Var.f4360c) == null) ? null : dh.b.A(bVar.f64861a, c3Var2);
        x0 x0Var2 = ((y) t14).f64911h;
        if (x0Var2 != null && (c3Var = x0Var2.f4360c) != null) {
            strA = dh.b.A(bVar.f64861a, c3Var);
        }
        return r13.a.b(strA2, strA);
    }
}
