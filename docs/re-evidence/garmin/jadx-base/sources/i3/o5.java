package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class o5 implements o4.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5 f89150a;

    public o5(p5 p5Var) {
        this.f89150a = p5Var;
    }

    @Override // o4.j0
    public final long a() {
        p5 p5Var = this.f89150a;
        long jA = p5Var.f89276f.a();
        if (jA != 16) {
            return jA;
        }
        db dbVar = (db) h5.i.a(p5Var, fb.f88099a);
        if (dbVar != null) {
            long j8 = dbVar.f87862a;
            if (j8 != 16) {
                return j8;
            }
        }
        return ((o4.d0) h5.i.a(p5Var, s2.f89590a)).f128833a;
    }
}
