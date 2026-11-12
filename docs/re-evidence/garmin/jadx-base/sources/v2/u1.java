package v2;

import kotlin.h4;
import p005kotlin.Unit;
import p3.y3;
import v2.w1.a;
import v2.w1.b;
import v2.w1.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f175172b;

    public /* synthetic */ u1(w1 w1Var, int i14) {
        this.f175171a = i14;
        this.f175172b = w1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f175171a) {
            case 0:
                w1 w1Var = this.f175172b;
                ge1.b.T(w1Var.getCoroutineScope(), null, null, w1Var.new b(null), 3);
                return Boolean.TRUE;
            case 1:
                y3 y3Var = kotlin.t1.f91503u;
                w1 w1Var2 = this.f175172b;
                w1Var2.f175206q = (h4) h5.i.a(w1Var2, y3Var);
                w1Var2.f175194e.f181368d = w1Var2.Z1();
                if (w1Var2.Z1() && w1Var2.f175207r == null) {
                    w1Var2.f175207r = ge1.b.T(w1Var2.getCoroutineScope(), null, null, new y1(w1Var2, null), 3);
                } else if (!w1Var2.Z1()) {
                    o53.c2 c2Var = w1Var2.f175207r;
                    if (c2Var != null) {
                        c2Var.c(null);
                    }
                    w1Var2.f175207r = null;
                }
                return Unit.INSTANCE;
            case 2:
                h5.k.d(this.f175172b);
                return Unit.INSTANCE;
            case 3:
                h5.k.d(this.f175172b);
                return Unit.INSTANCE;
            case 4:
                return w1.b.a(this.f175172b);
            case 5:
                return w1.b.a(this.f175172b) != null ? s1.f175167b : s1.f175166a;
            case 6:
                w1 w1Var3 = this.f175172b;
                ge1.b.T(w1Var3.getCoroutineScope(), null, null, w1Var3.new c(null), 3);
                return Boolean.TRUE;
            case 7:
                w1 w1Var4 = this.f175172b;
                return Boolean.valueOf(w1Var4.a2(w1Var4.f175197h.a()));
            case 8:
                return this.f175172b.f175192c.f175039a.b().f167839c.toString();
            case 9:
                w1 w1Var5 = this.f175172b;
                if (!w1Var5.Z1()) {
                    u1.n0 n0Var = w1Var5.f175202m;
                    if (n0Var.getIsAttached()) {
                        m4.i0.E0(n0Var.f167631h);
                    }
                } else if (!w1Var5.f175196g) {
                    w1Var5.b2().show();
                }
                return Boolean.TRUE;
            case 10:
                w1 w1Var6 = this.f175172b;
                if (!w1Var6.Z1()) {
                    u1.n0 n0Var2 = w1Var6.f175202m;
                    if (n0Var2.getIsAttached()) {
                        m4.i0.E0(n0Var2.f167631h);
                    }
                }
                w1Var6.f175194e.D(w2.j0.Selection);
                return Boolean.TRUE;
            case 11:
                w1 w1Var7 = this.f175172b;
                ge1.b.T(w1Var7.getCoroutineScope(), null, null, w1Var7.new a(null), 3);
                return Boolean.TRUE;
            case 12:
                w1 w1Var8 = this.f175172b;
                if (w1Var8.f175210w != null) {
                    w1Var8.b2().show();
                } else {
                    w1Var8.c2(true);
                }
                return Unit.INSTANCE;
            default:
                this.f175172b.f175194e.D(w2.j0.Selection);
                return Unit.INSTANCE;
        }
    }
}
