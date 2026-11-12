package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/vi;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class vi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vi f90035a = new vi();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f90036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f90037c;

    static {
        g6.f.a aVar = g6.f.f75994b;
        long jE = dh.b.e(16, 8);
        f90036b = jE;
        f90037c = 200;
        new l5(jE, null);
    }

    private vi() {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    public static fj a(int i14, p3.m mVar, int i15) {
        float f14 = ej.f88035a;
        p3.x1 x1Var = p3.n.f135158a;
        int iF0 = ((g6.c) mVar.A(kotlin.t1.f91490h)).f0(f14);
        boolean zK = ((((i15 & 14) ^ 6) > 4 && mVar.k(i14)) || (i15 & 6) == 4) | mVar.k(iF0);
        Object objQ = mVar.q();
        if (zK) {
            objQ = new fj(i14, iF0, null);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new fj(i14, iF0, null);
                mVar.K(objQ);
            }
        }
        return (fj) objQ;
    }
}
