package h2;

import f5.a1;
import java.util.Map;
import p005kotlin.Metadata;
import p008y1.b2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f80983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f80984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f80985c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h2/o0$a", "Lf5/a1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p13.k0 f80986a;

        public a() {
            p13.k0 k0Var = p13.k0.f134949a;
            k0Var.getClass();
            this.f80986a = k0Var;
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
            return this.f80986a;
        }

        @Override // f5.a1
        public final void q() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h2/o0$b", "Lg6/c;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements g6.c {
        @Override // g6.c
        /* JADX INFO: renamed from: getDensity */
        public final float getF75991a() {
            return 1.0f;
        }

        @Override // g6.i
        /* JADX INFO: renamed from: r0 */
        public final float getF75992b() {
            return 1.0f;
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f80983a = 56;
        b bVar = new b();
        f80984b = bVar;
        f80985c = new b0(p13.j0.f134944a, 0, 0, 0, b2.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, z1.u.b.f200876a, new a(), false, null, null, o53.c0.a(t13.h.f161748a), bVar, g6.b.b(0, 0, 15), 393216, null);
    }

    public static final long a(v vVar, int i14) {
        long f80845b = (((((long) i14) * ((long) (vVar.getF80845b() + vVar.getF80846c()))) + ((long) vVar.b())) + ((long) vVar.getF80847d())) - ((long) vVar.getF80846c());
        int iA = (int) (vVar.getF80848e() == b2.Horizontal ? vVar.a() >> 32 : vVar.a() & 4294967295L);
        long jE = f80845b - ((long) (iA - j23.t.e(vVar.getF80858o().c(iA, vVar.getF80845b(), vVar.b(), vVar.getF80847d()), 0, iA)));
        if (jE < 0) {
            return 0L;
        }
        return jE;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    public static final h2.b b(int i14, e23.a aVar, p3.m mVar, int i15, int i16) {
        boolean z14 = true;
        if ((i16 & 1) != 0) {
            i14 = 0;
        }
        x1 x1Var = p3.n.f135158a;
        Object[] objArr = new Object[0];
        h2.b.M.getClass();
        d4.l lVar = h2.b.N;
        boolean z15 = ((((i15 & 14) ^ 6) > 4 && mVar.k(i14)) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && mVar.i(0.0f)) || (i15 & 48) == 32);
        if ((((i15 & 896) ^ 384) <= 256 || !mVar.B(aVar)) && (i15 & 384) != 256) {
            z14 = false;
        }
        boolean z16 = z15 | z14;
        Object objQ = mVar.q();
        if (z16) {
            objQ = new ag0.a(i14, aVar, 5);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new ag0.a(i14, aVar, 5);
                mVar.K(objQ);
            }
        }
        h2.b bVar = (h2.b) d4.a.c(objArr, lVar, (e23.a) objQ, mVar, 0);
        bVar.L.setValue(aVar);
        return bVar;
    }
}
