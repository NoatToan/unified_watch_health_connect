package o72;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i3.e5;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class g3 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(2041649109);
        final int i15 = 0;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            float f14 = 8;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarA = c2.l.A(aVar, 0.0f, f14, 1);
            c2.l.f(rVarA, o0VarE);
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r rVarF = c2.x2.f(c2.l.A(aVar, f14, 0.0f, 2), 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            final i53.f fVarA = i53.a.a(new b82.g1("On", "Off", null, null, 12, null), new b82.g1("On", "Off", null, null, 12, null), new b82.g1("On", "Off", null, null, 12, null), new b82.g1("On", "Off", null, null, 12, null));
            final i53.f fVarA2 = i53.a.a(new b82.g1("Walking", null, null, null, 14, null), new b82.g1("Running", null, null, null, 14, null), new b82.g1("Cycling", null, null, null, 14, null), new b82.g1("Swimming", null, null, null, 14, null));
            final i53.f fVarA3 = i53.a.a(new b82.g1("Very Long Activity Name", null, null, null, 14, null), new b82.g1("Running", null, null, null, 14, null), new b82.g1("Cycling", null, null, null, 14, null));
            final i53.f fVarA4 = i53.a.a(new b82.g1("Watts", null, null, null, 14, null), new b82.g1("W/kg", null, null, null, 14, null));
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(0, o0VarE);
            }
            final p3.n1 n1Var = (p3.n1) objQ;
            int intValue = n1Var.getIntValue();
            boolean zR = o0VarE.r(context) | o0VarE.r(fVarA);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new e23.l() { // from class: o72.f3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i16 = i15;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i16) {
                            case 0:
                                n1Var.t(iIntValue);
                                Toast.makeText(context, sn.a.e(iIntValue, "Selected segment[", "] ", ((b82.g1) fVarA.get(iIntValue)).f16582a), 0).show();
                                break;
                            case 1:
                                n1Var.t(iIntValue);
                                Toast.makeText(context, sn.a.e(iIntValue, "Selected segment[", "] ", ((b82.g1) fVarA.get(iIntValue)).f16582a), 0).show();
                                break;
                            case 2:
                                n1Var.t(iIntValue);
                                Toast.makeText(context, sn.a.e(iIntValue, "Selected segment[", "] ", ((b82.g1) fVarA.get(iIntValue)).f16582a), 0).show();
                                break;
                            default:
                                n1Var.t(iIntValue);
                                Toast.makeText(context, sn.a.e(iIntValue, "Selected segment[", "] ", ((b82.g1) fVarA.get(iIntValue)).f16582a), 0).show();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            }
            b82.k1.a(fVarA, intValue, null, null, 0.0f, (e23.l) objQ2, o0VarE, 0, 28);
            c2.l.f(rVarA, o0VarE);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = e5.o(0, o0VarE);
            }
            final p3.n1 n1Var2 = (p3.n1) objQ3;
            int intValue2 = n1Var2.getIntValue();
            boolean zR2 = o0VarE.r(context) | o0VarE.r(fVarA2);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == c2565a) {
                final int i16 = 1;
                objQ4 = new e23.l() { // from class: o72.f3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i17 = i16;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i17) {
                            case 0:
                                n1Var2.t(iIntValue);
                                Toast.makeText(context, sn.a.e(iIntValue, "Selected segment[", "] ", ((b82.g1) fVarA2.get(iIntValue)).f16582a), 0).show();
                                break;
                            case 1:
                                n1Var2.t(iIntValue);
                                Toast.makeText(context, sn.a.e(iIntValue, "Selected segment[", "] ", ((b82.g1) fVarA2.get(iIntValue)).f16582a), 0).show();
                                break;
                            case 2:
                                n1Var2.t(iIntValue);
                                Toast.makeText(context, sn.a.e(iIntValue, "Selected segment[", "] ", ((b82.g1) fVarA2.get(iIntValue)).f16582a), 0).show();
                                break;
                            default:
                                n1Var2.t(iIntValue);
                                Toast.makeText(context, sn.a.e(iIntValue, "Selected segment[", "] ", ((b82.g1) fVarA2.get(iIntValue)).f16582a), 0).show();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ4);
            }
            b82.k1.a(fVarA2, intValue2, null, null, 0.0f, (e23.l) objQ4, o0VarE, 3072, 20);
            c2.l.f(rVarA, o0VarE);
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = e5.o(0, o0VarE);
            }
            final p3.n1 n1Var3 = (p3.n1) objQ5;
            int intValue3 = n1Var3.getIntValue();
            boolean zR3 = o0VarE.r(context) | o0VarE.r(fVarA3);
            Object objQ6 = o0VarE.q();
            if (zR3 || objQ6 == c2565a) {
                final int i17 = 2;
                objQ6 = new e23.l() { // from class: o72.f3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i18 = i17;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i18) {
                            case 0:
                                n1Var3.t(iIntValue);
                                Toast.makeText(context, sn.a.e(iIntValue, "Selected segment[", "] ", ((b82.g1) fVarA3.get(iIntValue)).f16582a), 0).show();
                                break;
                            case 1:
                                n1Var3.t(iIntValue);
                                Toast.makeText(context, sn.a.e(iIntValue, "Selected segment[", "] ", ((b82.g1) fVarA3.get(iIntValue)).f16582a), 0).show();
                                break;
                            case 2:
                                n1Var3.t(iIntValue);
                                Toast.makeText(context, sn.a.e(iIntValue, "Selected segment[", "] ", ((b82.g1) fVarA3.get(iIntValue)).f16582a), 0).show();
                                break;
                            default:
                                n1Var3.t(iIntValue);
                                Toast.makeText(context, sn.a.e(iIntValue, "Selected segment[", "] ", ((b82.g1) fVarA3.get(iIntValue)).f16582a), 0).show();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ6);
            }
            b82.k1.a(fVarA3, intValue3, null, null, 0.0f, (e23.l) objQ6, o0VarE, 0, 28);
            c2.l.f(rVarA, o0VarE);
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = e5.o(0, o0VarE);
            }
            final p3.n1 n1Var4 = (p3.n1) objQ7;
            int intValue4 = n1Var4.getIntValue();
            boolean zR4 = o0VarE.r(context) | o0VarE.r(fVarA4);
            Object objQ8 = o0VarE.q();
            if (zR4 || objQ8 == c2565a) {
                final int i18 = 3;
                objQ8 = new e23.l() { // from class: o72.f3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i19 = i18;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i19) {
                            case 0:
                                n1Var4.t(iIntValue);
                                Toast.makeText(context, sn.a.e(iIntValue, "Selected segment[", "] ", ((b82.g1) fVarA4.get(iIntValue)).f16582a), 0).show();
                                break;
                            case 1:
                                n1Var4.t(iIntValue);
                                Toast.makeText(context, sn.a.e(iIntValue, "Selected segment[", "] ", ((b82.g1) fVarA4.get(iIntValue)).f16582a), 0).show();
                                break;
                            case 2:
                                n1Var4.t(iIntValue);
                                Toast.makeText(context, sn.a.e(iIntValue, "Selected segment[", "] ", ((b82.g1) fVarA4.get(iIntValue)).f16582a), 0).show();
                                break;
                            default:
                                n1Var4.t(iIntValue);
                                Toast.makeText(context, sn.a.e(iIntValue, "Selected segment[", "] ", ((b82.g1) fVarA4.get(iIntValue)).f16582a), 0).show();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ8);
            }
            b82.k1.a(fVarA4, intValue4, null, null, 0.0f, (e23.l) objQ8, o0VarE, 3072, 20);
            c2.l.f(c2.l.A(aVar, 0.0f, 24, 1), o0VarE);
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                objQ9 = p3.p0.n("");
                o0VarE.K(objQ9);
            }
            p3.p1 p1Var = (p3.p1) objQ9;
            String str = (String) p1Var.getF182175a();
            x5.v.f188954b.getClass();
            p006l2.a2 a2Var = new p006l2.a2(0, (Boolean) null, x5.v.f188957e, 0, (x5.f0) null, (Boolean) null, (z5.c) null, 123, (p005kotlin.jvm.internal.j) null);
            Object objQ10 = o0VarE.q();
            if (objQ10 == c2565a) {
                objQ10 = new jv0.c(p1Var, n1Var, n1Var2, n1Var3, n1Var4, 12);
                o0VarE.K(objQ10);
            }
            l72.p1.a(str, null, "Enter segment index [0-3] to select for all", 1, false, false, a2Var, 0L, null, null, null, null, null, (e23.l) objQ10, o0VarE, 1576320, 24576, 16306);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z1(i14, 25);
        }
    }
}
