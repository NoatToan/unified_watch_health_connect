package u42;

import a51.c;
import androidx.room.a0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import gl1.y;
import l72.c1;
import o62.g0;
import p005kotlin.Unit;
import p3.l1;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p50.d;
import sk0.k1;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    public static final void a(final double d14, final int i14, final e23.a<Unit> aVar, final l<? super Double, Unit> lVar, m mVar, final int i15) {
        o0 o0Var;
        e23.a<Unit> aVar2;
        o0 o0VarO = a0.o(aVar, lVar, mVar, 1468053737);
        int i16 = i15 | (o0VarO.m(d14) ? 4 : 2) | (o0VarO.k(i14) ? 32 : 16) | (o0VarO.r(aVar) ? 256 : 128) | (o0VarO.r(lVar) ? 2048 : 1024);
        if (o0VarO.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object[] objArr = new Object[0];
            int i17 = i16 & 112;
            boolean z14 = i17 == 32;
            Object objQ = o0VarO.q();
            m.a aVar3 = m.f135153a;
            if (z14) {
                objQ = new c(i14, 10);
                o0VarO.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new c(i14, 10);
                    o0VarO.K(objQ);
                }
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarO, 0);
            Object[] objArr2 = new Object[0];
            boolean z15 = i17 == 32;
            Object objQ2 = o0VarO.q();
            if (z15) {
                objQ2 = new c(i14, 11);
                o0VarO.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new c(i14, 11);
                    o0VarO.K(objQ2);
                }
            }
            p1 p1Var2 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarO, 0);
            Object[] objArr3 = new Object[0];
            boolean zB = ((i16 & 14) == 4) | o0VarO.B(p1Var) | o0VarO.B(p1Var2);
            Object objQ3 = o0VarO.q();
            if (zB) {
                objQ3 = new g0(d14, p1Var, p1Var2);
                o0VarO.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new g0(d14, p1Var, p1Var2);
                    o0VarO.K(objQ3);
                }
            }
            l1 l1Var = (l1) d4.a.e(objArr3, (e23.a) objQ3, o0VarO, 0);
            Object[] objArr4 = new Object[0];
            Object objQ4 = o0VarO.q();
            aVar3.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ4 == c2565a) {
                objQ4 = new u1.p1(5);
                o0VarO.K(objQ4);
            }
            n1 n1Var = (n1) d4.a.e(objArr4, (e23.a) objQ4, o0VarO, 48);
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarO, R.string.lbl_weight);
            String strQ2 = y.Q(o0VarO, R.string.lbl_done);
            String strQ3 = y.Q(o0VarO, R.string.lbl_cancel);
            e eVarC = f.c(266303045, new k1(l1Var, p1Var2, p1Var, n1Var), o0VarO);
            boolean zB2 = ((i16 & 7168) == 2048) | o0VarO.B(p1Var2) | o0VarO.B(n1Var) | o0VarO.B(l1Var);
            int i18 = i16 & 896;
            boolean z16 = zB2 | (i18 == 256);
            Object objQ5 = o0VarO.q();
            if (z16 || objQ5 == c2565a) {
                d dVar = new d(13, lVar, aVar, n1Var, l1Var, p1Var2);
                aVar2 = aVar;
                o0VarO.K(dVar);
                objQ5 = dVar;
            } else {
                aVar2 = aVar;
            }
            e23.a<Unit> aVar4 = (e23.a) objQ5;
            boolean z17 = i18 == 256;
            Object objQ6 = o0VarO.q();
            if (z17 || objQ6 == c2565a) {
                objQ6 = new u11.b(aVar2, 3);
                o0VarO.K(objQ6);
            }
            o0Var = o0VarO;
            c1Var.a(true, strQ, null, eVarC, null, strQ2, false, false, aVar4, strQ3, (e23.a) objQ6, o0Var, 3078, 0, 212);
        } else {
            o0Var = o0VarO;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(d14, i14, aVar, lVar, i15) { // from class: u42.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ double f168623a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f168624b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ e23.a f168625c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ l f168626d;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    b.a(this.f168623a, this.f168624b, this.f168625c, this.f168626d, (m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final double b(boolean z14, boolean z15, boolean z16, double d14) {
        if (z15 && !z14 && z16) {
            l3.f23124b.getClass();
            return (d14 / 6350.0d) * ((double) 1000);
        }
        if (!z15 && !z14 && z16) {
            l3.f23124b.getClass();
            return d14 * 2.20462d;
        }
        if (!z14 || z16) {
            return d14;
        }
        l3.f23124b.getClass();
        return d14 / 2.20462d;
    }
}
