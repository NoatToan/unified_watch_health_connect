package af1;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import i3.mh;
import i3.ve;
import o53.f0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public static final void a(int i14, e23.a aVar, String str, p3.m mVar, boolean z14) {
        o0 o0VarE = mVar.E(-926493756);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            ve.a(x2.d(r.S, 1.0f), null, tn.k.b(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(1922218399, new g(z14, str, aVar, 0, (byte) 0), o0VarE), o0VarE, 12582918, 122);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(aVar, z14, str, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0399  */
    /* JADX WARN: Code duplicated, block: B:133:0x03f5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(u82.f<ve1.c> fVar, qe1.i iVar, we1.d dVar, p3.m mVar, int i14) {
        int i15;
        String strJ;
        Double dValueOf;
        boolean z14;
        Float fValueOf;
        boolean z15;
        Integer num;
        Integer num2;
        we1.d dVar2 = dVar;
        fVar.getClass();
        dVar2.getClass();
        String str = dVar2.f184786k;
        c2 c2Var = dVar2.f184785j;
        o0 o0VarE = mVar.E(642310707);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(iVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(dVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarG = f0.G(dVar2.f184790o, o0VarE);
            f12.l.f68084a.getClass();
            boolean z16 = TextUtils.isEmpty(f12.l.a.a().w()) || f12.l.a.a().w().equals("MALE");
            ve1.c cVarA = fVar.a();
            int iIntValue = (cVarA == null || (num2 = cVarA.f177674b) == null) ? 0 : num2.intValue();
            ve1.c cVarA2 = fVar.a();
            e eVar = cVarA2 != null ? cVarA2.f177675c : null;
            ve1.c cVarA3 = fVar.a();
            String string = cVarA3 != null ? cVarA3.f177673a : null;
            b63.o.Companion companion = b63.o.INSTANCE;
            b63.o oVarD = g22.l.d(companion);
            if (string == null) {
                string = oVarD.toString();
            }
            b63.o oVarB = b63.o.Companion.b(companion, string);
            int iCompareTo = oVarD.compareTo(oVarB);
            if (iCompareTo == 0) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1214675170, R.string.mct_lbl_today, o0VarE, false);
            } else if (iCompareTo != 1) {
                o0VarE.C(999921468);
                o0VarE.g0(false);
                strJ = com.nimbusds.jose.shaded.gson.internal.a.i("EEEE, MMM d", j0.K(oVarB.toString(), "yyyy-MM-dd"));
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1214673202, R.string.social_elapsed_time_yesterday, o0VarE, false);
            }
            if (eVar != null) {
                o.f3110a.getClass();
                dValueOf = Double.valueOf(o.a(iIntValue, z16, iVar, eVar));
            } else {
                dValueOf = null;
            }
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarD = x2.d(c2.l.C(aVar, 0.0f, eVar2.f97921f, 0.0f, 0.0f, 13), 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            z zVarA = y.a(kVar, aVar2, o0VarE, 48);
            String str2 = strJ;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            ve1.c cVarA4 = fVar.a();
            if (((cVarA4 == null || (num = cVarA4.f177674b) == null) ? 0 : num.intValue()) != 0) {
                o0VarE.C(2058624162);
                j92.f fVar3 = d92.b.f58624b;
                fVar3.getClass();
                x0 x0Var = j92.f.f97931h;
                int i16 = iIntValue;
                e eVar4 = eVar;
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), o0VarE), o0VarE, 0, 0, 131070);
                bVar.getClass();
                c2.l.f(x2.h(aVar, eVar2.f97922g), o0VarE);
                if (dValueOf != null) {
                    o0VarE = o0VarE;
                    fValueOf = Float.valueOf((float) dValueOf.doubleValue());
                } else {
                    o0VarE = o0VarE;
                    fValueOf = null;
                }
                g6.f.a aVar4 = g6.f.f75994b;
                fVar3.getClass();
                n.a(i16, fValueOf, 200, 10, d92.c.b(j92.f.f97928e, o0VarE), o0VarE, 3456);
                h4.g.a aVar5 = h4.d.a.f81536n;
                bVar.getClass();
                r rVarF = x2.f(c2.l.C(aVar, eVar2.f97920e, 0.0f, 0.0f, 0.0f, 14), 1.0f);
                z zVarA2 = y.a(kVar, aVar5, o0VarE, 48);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC2 = h4.k.c(rVarF, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar2, rVarC2, o0VarE);
                if (eVar4 != null) {
                    o0VarE.C(1785601962);
                    bVar.getClass();
                    r rVarC3 = c2.l.C(aVar, 0.0f, eVar2.f97922g, 0.0f, 0.0f, 13);
                    String strQ = gl1.y.Q(o0VarE, eVar4.f3082a);
                    fVar3.getClass();
                    mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), o0VarE), o0VarE, 0, 0, 131068);
                    bVar.getClass();
                    float f14 = eVar2.f97918c;
                    bVar.getClass();
                    r rVarC4 = c2.l.C(aVar, 0.0f, f14, 0.0f, eVar2.f97918c, 5);
                    String strQ2 = gl1.y.Q(o0VarE, eVar4.f3083b);
                    fVar3.getClass();
                    mh.c(strQ2, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    z15 = false;
                    o0VarE.g0(false);
                } else {
                    z15 = false;
                    o0VarE.C(1786307336);
                    o0VarE.g0(false);
                }
                z14 = true;
                o0VarE.g0(true);
                o0VarE.g0(z15);
                dVar2 = dVar;
            } else {
                z14 = true;
                o0VarE.C(2060116440);
                boolean zR = o0VarE.r(context);
                Object objQ = o0VarE.q();
                p3.m.a aVar6 = p3.m.f135153a;
                if (zR) {
                    objQ = new a42.d(context, 1);
                    o0VarE.K(objQ);
                } else {
                    aVar6.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a42.d(context, 1);
                        o0VarE.K(objQ);
                    }
                }
                a(0, (e23.a) objQ, str, o0VarE, ((Boolean) c2Var.getF182175a()).booleanValue());
                v60.a aVar7 = (v60.a) p1VarG.getF182175a();
                if (!(aVar7 != null && aVar7.f175792a) || ((Boolean) c2Var.getF182175a()).booleanValue()) {
                    dVar2 = dVar;
                    o0VarE.C(2060691769);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(2060494764);
                    v60.a aVar8 = (v60.a) p1VarG.getF182175a();
                    String str3 = aVar8 != null ? aVar8.f175793b : null;
                    dVar2 = dVar;
                    boolean zR2 = o0VarE.r(dVar2);
                    Object objQ2 = o0VarE.q();
                    if (zR2) {
                        objQ2 = new c(dVar2, 1);
                        o0VarE.K(objQ2);
                    } else {
                        aVar6.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new c(dVar2, 1);
                            o0VarE.K(objQ2);
                        }
                    }
                    b.a(str3, str, (e23.a) objQ2, o0VarE, 0);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(fVar, iVar, dVar2, i14, 3);
        }
    }
}
