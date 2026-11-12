package f2;

import f5.a1;
import java.util.Map;
import p005kotlin.Metadata;
import p008y1.b2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f68300a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f2/r0$a", "Lf5/a1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p13.k0 f68301a;

        public a() {
            p13.k0 k0Var = p13.k0.f134949a;
            k0Var.getClass();
            this.f68301a = k0Var;
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getHeight */
        public final int getF81749c() {
            return 0;
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getWidth */
        public final int getF81748b() {
            return 0;
        }

        @Override // f5.a1
        public final Map<f5.a, Integer> p() {
            return this.f68301a;
        }

        @Override // f5.a1
        public final void q() {
        }
    }

    static {
        a aVar = new a();
        p13.j0 j0Var = p13.j0.f134944a;
        b2 b2Var = b2.Vertical;
        f68300a = new z(null, 0, false, 0.0f, aVar, 0.0f, false, o53.c0.a(t13.h.f161748a), zf.b.c(), 0, new ep0.a(28), new ep0.a(29), j0Var, 0, 0, 0, false, b2Var, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public static final p0 a(int i14, p3.m mVar, int i15) {
        if ((i15 & 1) != 0) {
            i14 = 0;
        }
        x1 x1Var = p3.n.f135158a;
        Object[] objArr = new Object[0];
        p0.f68259w.getClass();
        d4.l lVar = p0.f68260x;
        boolean zK = mVar.k(i14) | mVar.k(0);
        Object objQ = mVar.q();
        if (zK) {
            objQ = new a51.c(i14, 3);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new a51.c(i14, 3);
                mVar.K(objQ);
            }
        }
        return (p0) d4.a.c(objArr, lVar, (e23.a) objQ, mVar, 0);
    }
}
