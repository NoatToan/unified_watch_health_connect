package e2;

import f5.a1;
import java.util.Map;
import p005kotlin.Metadata;
import p008y1.b2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f62479a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"e2/k0$a", "Lf5/a1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p13.k0 f62480a;

        public a() {
            p13.k0 k0Var = p13.k0.f134949a;
            k0Var.getClass();
            this.f62480a = k0Var;
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getHeight */
        public final int getF68912b() {
            return 0;
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getWidth */
        public final int getF68911a() {
            return 0;
        }

        @Override // f5.a1
        public final Map<f5.a, Integer> p() {
            return this.f62480a;
        }

        @Override // f5.a1
        public final void q() {
        }
    }

    static {
        y yVar = null;
        int i14 = 0;
        boolean z14 = false;
        float f14 = 0.0f;
        float f15 = 0.0f;
        boolean z15 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z16 = false;
        f62479a = new x(yVar, i14, z14, f14, new a(), f15, z15, o53.c0.a(t13.h.f161748a), zf.b.c(), g6.b.b(0, 0, 15), p13.j0.f134944a, i15, i16, i17, z16, b2.Vertical, 0, 0, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    public static final i0 a(int i14, int i15, int i16, p3.m mVar) {
        boolean z14 = true;
        if ((i16 & 1) != 0) {
            i14 = 0;
        }
        x1 x1Var = p3.n.f135158a;
        Object[] objArr = new Object[0];
        i0.f62432x.getClass();
        d4.l lVar = i0.f62433y;
        boolean z15 = (((i15 & 14) ^ 6) > 4 && mVar.k(i14)) || (i15 & 6) == 4;
        if ((((i15 & 112) ^ 48) <= 32 || !mVar.k(0)) && (i15 & 48) != 32) {
            z14 = false;
        }
        boolean z16 = z15 | z14;
        Object objQ = mVar.q();
        if (z16) {
            objQ = new a51.c(i14, 2);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new a51.c(i14, 2);
                mVar.K(objQ);
            }
        }
        return (i0) d4.a.c(objArr, lVar, (e23.a) objQ, mVar, 0);
    }
}
