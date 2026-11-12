package g2;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import f5.i2;
import f5.j2;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public static final void a(final e23.a aVar, final h4.r rVar, final z0 z0Var, final q0 q0Var, p3.m mVar, final int i14) {
        p3.o0 o0VarE = mVar.E(1055276397);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.B(rVar) ? 32 : 16) | (o0VarE.B(z0Var) ? 256 : 128) | (o0VarE.B(q0Var) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            final p3.p1 p1VarQ = p3.p0.q(aVar, o0VarE);
            o1.a(z3.f.c(-933153643, new e23.q() { // from class: g2.l0
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    h4.r rVarThen;
                    d4.c cVar = (d4.c) obj;
                    p3.m mVar2 = (p3.m) obj2;
                    ((Integer) obj3).getClass();
                    p3.x1 x1Var2 = p3.n.f135158a;
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    int i16 = 27;
                    if (objQ == c2565a) {
                        objQ = new h0(cVar, new et1.a2(p1VarQ, 27));
                        mVar2.K(objQ);
                    }
                    final h0 h0Var = (h0) objQ;
                    Object objQ2 = mVar2.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new j2(new j0(h0Var));
                        mVar2.K(objQ2);
                    }
                    final j2 j2Var = (j2) objQ2;
                    final z0 z0Var2 = z0Var;
                    if (z0Var2 != null) {
                        mVar2.C(1743490539);
                        final x1 x1Var3 = z0Var2.f75312a;
                        if (x1Var3 == null) {
                            mVar2.C(887527095);
                            x1Var3 = y1.f75309a;
                            if (x1Var3 != null) {
                                mVar2.C(1345554384);
                                mVar2.f();
                            } else {
                                mVar2.C(1345603457);
                                View view2 = (View) mVar2.A(AndroidCompositionLocals_androidKt.f6046f);
                                boolean zB = mVar2.B(view2);
                                Object objQ3 = mVar2.q();
                                if (zB || objQ3 == c2565a) {
                                    Object tag = view2.getTag(R.id.compose_prefetch_scheduler);
                                    objQ3 = tag instanceof x1 ? (x1) tag : null;
                                    if (objQ3 == null) {
                                        objQ3 = new a(view2);
                                        view2.setTag(R.id.compose_prefetch_scheduler, objQ3);
                                    }
                                    mVar2.K(objQ3);
                                }
                                mVar2.f();
                                x1Var3 = (x1) objQ3;
                            }
                        } else {
                            mVar2.C(887526010);
                        }
                        mVar2.f();
                        Object[] objArr = {z0Var2, h0Var, j2Var, x1Var3};
                        boolean zB2 = mVar2.B(z0Var2) | mVar2.r(h0Var) | mVar2.r(j2Var) | mVar2.r(x1Var3);
                        Object objQ4 = mVar2.q();
                        if (zB2 || objQ4 == c2565a) {
                            objQ4 = new e23.l() { // from class: g2.n0
                                @Override // e23.l
                                public final Object invoke(Object obj4) {
                                    t1 t1Var = new t1(h0Var, j2Var, x1Var3);
                                    z0 z0Var3 = z0Var2;
                                    z0Var3.f75315d = t1Var;
                                    return new o0(z0Var3);
                                }
                            };
                            mVar2.K(objQ4);
                        }
                        p3.l0.d(objArr, (e23.l) objQ4, mVar2);
                    } else {
                        mVar2.C(1737291469);
                    }
                    mVar2.f();
                    int i17 = a1.f75024a;
                    h4.r rVar2 = rVar;
                    if (z0Var2 == null || (rVarThen = rVar2.then(new c2(z0Var2))) == null) {
                        rVarThen = rVar2;
                    }
                    boolean zB3 = mVar2.B(h0Var);
                    q0 q0Var2 = q0Var;
                    boolean zB4 = zB3 | mVar2.B(q0Var2);
                    Object objQ5 = mVar2.q();
                    if (zB4 || objQ5 == c2565a) {
                        objQ5 = new ew1.r1(i16, h0Var, q0Var2);
                        mVar2.K(objQ5);
                    }
                    i2.a(j2Var, rVarThen, (e23.p) objQ5, mVar2, 8, 0);
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(rVar, z0Var, q0Var, i14) { // from class: g2.m0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h4.r f75171b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ z0 f75172c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ q0 f75173d;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(1);
                    p0.a(this.f75170a, this.f75171b, this.f75172c, this.f75173d, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
