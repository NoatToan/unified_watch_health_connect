package f2;

import f5.v1;
import g2.t0;
import g2.u0;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf2/b0;", "Lg2/u0;", "Lf2/a0;", "Lf2/n;", "itemProvider", "Lg2/r0;", "measureScope", "", "defaultMainAxisSpacing", "<init>", "(Lf2/n;Lg2/r0;I)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b0 extends u0<a0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f68175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2.r0 f68176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f68177d;

    public b0(n nVar, g2.r0 r0Var, int i14) {
        this.f68175b = nVar;
        this.f68176c = r0Var;
        this.f68177d = i14;
    }

    @Override // g2.u0
    public final t0 a(int i14, int i15, int i16, long j8) {
        return d(i14, i15, i16, this.f68177d, j8);
    }

    public abstract a0 c(int i14, Object obj, Object obj2, int i15, int i16, List<? extends v1> list, long j8, int i17, int i18);

    public final a0 d(int i14, int i15, int i16, int i17, long j8) {
        int iK;
        n nVar = this.f68175b;
        Object key = nVar.getKey(i14);
        Object objF = nVar.f(i14);
        List<v1> listB = b(this.f68176c, i14, j8);
        if (g6.a.h(j8)) {
            iK = g6.a.l(j8);
        } else {
            if (!g6.a.g(j8)) {
                b2.e.a("does not have fixed height");
            }
            iK = g6.a.k(j8);
        }
        return c(i14, key, objF, iK, i17, listB, j8, i15, i16);
    }
}
