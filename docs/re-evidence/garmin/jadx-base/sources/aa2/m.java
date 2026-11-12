package aa2;

import b21.fb;
import b21.l4;
import ca0.b1;
import ca0.i0;
import lc.m0;
import lc.y;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import z10.d1;
import z10.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f2348b;

    public /* synthetic */ m(m0 m0Var, int i14) {
        this.f2347a = i14;
        this.f2348b = m0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f2347a;
        m0 m0Var = this.f2348b;
        switch (i14) {
            case 0:
                y.k("PASSCODE_COMPLETE_ROUTE", m0Var);
                break;
            case 1:
                m0Var.m();
                break;
            case 2:
                m0Var.n();
                break;
            case 3:
                k23.d dVarB = s0.f105811a.b(b21.c.g.class);
                boolean z14 = y.f111902i;
                m0Var.o(dVarB, true);
                break;
            case 4:
                k23.d dVarB2 = s0.f105811a.b(b21.c.g.class);
                boolean z15 = y.f111902i;
                m0Var.o(dVarB2, true);
                break;
            case 5:
                k23.d dVarB3 = s0.f105811a.b(b21.c.g.class);
                boolean z16 = y.f111902i;
                m0Var.o(dVarB3, true);
                break;
            case 6:
                y.l(m0Var, fb.e.INSTANCE);
                break;
            case 7:
                if (!d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                    y.l(m0Var, new l4.u0((f0) null, 1, (p005kotlin.jvm.internal.j) null));
                } else {
                    y.l(m0Var, l4.g0.INSTANCE);
                }
                break;
            case 8:
                y.l(m0Var, new l4.i((String) null, 1, (p005kotlin.jvm.internal.j) null));
                break;
            case 9:
                m0Var.getClass();
                y.l(m0Var, new l4.n(new ro0.i(ro0.l.NUTRITION, "AUTO_ADJUST_CALORIE_GOAL")));
                break;
            case 10:
                y.l(m0Var, l4.f0.INSTANCE);
                break;
            case 11:
                m0Var.n();
                break;
            case 12:
                m0Var.n();
                break;
            case 13:
                m0Var.n();
                break;
            case 14:
                m0Var.n();
                break;
            case 15:
                m0Var.n();
                break;
            case 16:
                m0Var.n();
                break;
            case 17:
                y.l(m0Var, i0.g.INSTANCE);
                break;
            case 18:
                m0Var.n();
                break;
            case 19:
                y.l(m0Var, i0.k.INSTANCE);
                break;
            case 20:
                y.l(m0Var, i0.s.INSTANCE);
                break;
            case 21:
                m0Var.h(new ca0.k(16), b1.g.INSTANCE);
                break;
            case 22:
                m0Var.h(new ca0.k(16), b1.g.INSTANCE);
                break;
            case 23:
                m0Var.h(new ca0.k(16), b1.g.INSTANCE);
                break;
            case 24:
                m0Var.n();
                break;
            case 25:
                y.l(m0Var, b1.h.INSTANCE);
                break;
            case 26:
                m0Var.n();
                break;
            case 27:
                m0Var.n();
                break;
            case 28:
                m0Var.h(new ca0.k(16), b1.g.INSTANCE);
                break;
            default:
                y.l(m0Var, b1.o.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
