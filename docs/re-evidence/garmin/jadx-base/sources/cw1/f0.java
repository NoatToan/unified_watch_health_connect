package cw1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.messaging.Constants;
import g02.b2;
import i3.ba;
import i3.e5;
import i3.eh;
import i3.mh;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p006l2.a2;
import p006l2.z1;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import p3.x3;
import z2.t2;
import z2.u2;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 {
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    public static final void a(int i14, e23.a aVar, String str, p3.m mVar, boolean z14) {
        String str2;
        p3.o0 o0VarE = mVar.E(-2061619331);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(331000616);
                str2 = str + StringUtils.SPACE + gl1.y.Q(o0VarE, R.string.selected);
                o0VarE.g0(false);
            } else {
                o0VarE.C(331065840);
                o0VarE.g0(false);
                str2 = str;
            }
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, str2);
            b92.a aVarB = c0235a.b();
            boolean z15 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new ca0.v0(aVar, 28);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ca0.v0(aVar, 28);
                    o0VarE.K(objQ);
                }
            }
            int i16 = b92.a.f16960b;
            r.a(null, str, aVarB, z14, false, (e23.a) objQ, o0VarE, ((i15 << 3) & 112) | ((i15 << 6) & 7168), 17);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new af1.g(str, z14, aVar, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    public static final void b(final Double d14, final String str, final double d15, final e23.l lVar, p3.m mVar, final int i14) {
        String str2;
        p3.o0 o0VarE = mVar.E(-1392019093);
        int i15 = i14 | (o0VarE.B(d14) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.m(d15) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            if (d14 != null) {
                l3.f23124b.getClass();
                str2 = l3.f23131i.format(d14.doubleValue());
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            Object[] objArr = {str2};
            x5.l0.f188876d.getClass();
            d4.l lVar2 = x5.l0.f188877e;
            boolean zB = o0VarE.B(str2);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = new a90.c(str2, 3);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a90.c(str2, 3);
                    o0VarE.K(objQ);
                }
            }
            final p3.p1 p1VarF = d4.a.f(objArr, lVar2, (e23.a) objQ, o0VarE, 0);
            final m4.q qVar = (m4.q) o0VarE.A(kotlin.t1.f91491i);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new com.google.accompanist.drawablepainter.a(19);
                o0VarE.K(objQ2);
            }
            final p3.p1 p1Var = (p3.p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = kg.f.b(o0VarE);
            }
            final a2.j jVar = (a2.j) objQ3;
            final p3.p1 p1VarK = xy2.b.k(jVar, o0VarE, 6);
            d92.b.f58623a.getClass();
            p3.v.a(u2.f201804a.c(new t2(d92.b.a(o0VarE).k().a(), o4.d0.c(0.4f, d92.b.a(o0VarE).k().a(), 14), null)), z3.f.c(-364188501, new e23.p() { // from class: cw1.y
                /* JADX WARN: Code duplicated, block: B:12:0x005a  */
                /* JADX WARN: Code duplicated, block: B:22:0x0118  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    z3.e eVarC;
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        final p3.p1 p1Var2 = p1VarF;
                        x5.l0 l0Var = (x5.l0) p1Var2.getF182175a();
                        boolean zB2 = mVar2.B(p1Var2);
                        final p3.p1 p1Var3 = p1Var;
                        boolean zB3 = zB2 | mVar2.B(p1Var3) | mVar2.m(0.0d);
                        final double d16 = d15;
                        boolean zM = zB3 | mVar2.m(d16);
                        final e23.l lVar3 = lVar;
                        boolean zB4 = zM | mVar2.B(lVar3);
                        Object objQ4 = mVar2.q();
                        p3.m.a aVar2 = p3.m.f135153a;
                        if (zB4) {
                            e23.l lVar4 = new e23.l() { // from class: cw1.a0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    String str3;
                                    x5.l0 l0Var2 = (x5.l0) obj3;
                                    l0Var2.getClass();
                                    s5.c cVar = l0Var2.f188878a;
                                    boolean zJ = d53.w.J(cVar.f157138b);
                                    String str4 = cVar.f157138b;
                                    boolean z14 = false;
                                    Double dF = !zJ ? d53.s.f(d53.u.v(str4, ",", "", false)) : d53.s.f(str4);
                                    if (dF != null) {
                                        double dDoubleValue = dF.doubleValue();
                                        l3.f23124b.getClass();
                                        str3 = l3.f23131i.format(dDoubleValue);
                                        str3.getClass();
                                    } else {
                                        str3 = null;
                                    }
                                    String str5 = str3 != null ? str3 : "";
                                    int length = str5.length();
                                    p1Var2.setValue(x5.l0.a(l0Var2, str5, og.a.l(length, length), 4));
                                    if (dF != null) {
                                        double dDoubleValue2 = dF.doubleValue();
                                        if (0.0d > dDoubleValue2 || dDoubleValue2 > d16) {
                                            z14 = true;
                                        }
                                    }
                                    Boolean boolValueOf = Boolean.valueOf(z14);
                                    p3.p1 p1Var4 = p1Var3;
                                    p1Var4.setValue(boolValueOf);
                                    e23.l lVar5 = lVar3;
                                    if (lVar5 != null) {
                                        if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                                            dF = Double.valueOf(-1.0d);
                                        }
                                        lVar5.invoke(dF);
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(lVar4);
                            objQ4 = lVar4;
                        } else {
                            aVar2.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                e23.l lVar5 = new e23.l() { // from class: cw1.a0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.l
                                    public final Object invoke(Object obj3) {
                                        String str3;
                                        x5.l0 l0Var2 = (x5.l0) obj3;
                                        l0Var2.getClass();
                                        s5.c cVar = l0Var2.f188878a;
                                        boolean zJ = d53.w.J(cVar.f157138b);
                                        String str4 = cVar.f157138b;
                                        boolean z14 = false;
                                        Double dF = !zJ ? d53.s.f(d53.u.v(str4, ",", "", false)) : d53.s.f(str4);
                                        if (dF != null) {
                                            double dDoubleValue = dF.doubleValue();
                                            l3.f23124b.getClass();
                                            str3 = l3.f23131i.format(dDoubleValue);
                                            str3.getClass();
                                        } else {
                                            str3 = null;
                                        }
                                        String str5 = str3 != null ? str3 : "";
                                        int length = str5.length();
                                        p1Var2.setValue(x5.l0.a(l0Var2, str5, og.a.l(length, length), 4));
                                        if (dF != null) {
                                            double dDoubleValue2 = dF.doubleValue();
                                            if (0.0d > dDoubleValue2 || dDoubleValue2 > d16) {
                                                z14 = true;
                                            }
                                        }
                                        Boolean boolValueOf = Boolean.valueOf(z14);
                                        p3.p1 p1Var4 = p1Var3;
                                        p1Var4.setValue(boolValueOf);
                                        e23.l lVar6 = lVar3;
                                        if (lVar6 != null) {
                                            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                                                dF = Double.valueOf(-1.0d);
                                            }
                                            lVar6.invoke(dF);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(lVar5);
                                objQ4 = lVar5;
                            }
                        }
                        e23.l lVar6 = (e23.l) objQ4;
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarF = d92.c.f(j92.f.f97933j, mVar2);
                        x3 x3Var = p1VarK;
                        z3.e eVarC2 = z3.f.c(1094545487, new b0(x3Var, p1Var2, 0), mVar2);
                        g.f56037a.getClass();
                        z3.e eVar = g.f56038b;
                        z3.e eVarC3 = z3.f.c(-2100356206, new a51.l(p1Var2, lVar3, p1Var3, x3Var), mVar2);
                        boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
                        String str3 = str;
                        if (zBooleanValue) {
                            mVar2.C(-449033915);
                            eVarC = z3.f.c(1882528615, new c0(d16, str3), mVar2);
                            mVar2.f();
                        } else {
                            mVar2.C(-448579021);
                            mVar2.f();
                            eVarC = null;
                        }
                        z3.e eVar2 = eVarC;
                        boolean zBooleanValue2 = ((Boolean) p1Var3.getF182175a()).booleanValue();
                        q02.a aVar3 = new q02.a(fb1.c.n(StringUtils.SPACE, str3), false);
                        x5.v.f188954b.getClass();
                        int i16 = x5.v.f188957e;
                        x5.p.f188918b.getClass();
                        a2 a2Var = new a2(0, (Boolean) null, i16, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        m4.q qVar2 = qVar;
                        boolean zR = mVar2.r(qVar2);
                        Object objQ5 = mVar2.q();
                        if (zR) {
                            objQ5 = new b82.k0(qVar2, 1);
                            mVar2.K(objQ5);
                        } else {
                            aVar2.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new b82.k0(qVar2, 1);
                                mVar2.K(objQ5);
                            }
                        }
                        z1 z1Var = new z1((e23.l) objQ5, null, null, null, null, null, 62, null);
                        ba baVar = ba.f87580a;
                        long jE = ds.e0.e(mVar2);
                        long jB = j20.x.b(mVar2);
                        long jB2 = j20.x.b(mVar2);
                        long jB3 = j20.x.b(mVar2);
                        long jB4 = j20.x.b(mVar2);
                        o4.d0.f128823b.getClass();
                        long j8 = o4.d0.f128831j;
                        long jB5 = sn.a.b(mVar2);
                        long jB6 = sn.a.b(mVar2);
                        long jB7 = sn.a.b(mVar2);
                        long j14 = o4.d0.f128832k;
                        baVar.getClass();
                        eh.b(l0Var, lVar6, rVarF, false, x0VarF, eVarC2, eVar, null, eVarC3, eVar2, zBooleanValue2, aVar3, a2Var, z1Var, true, 0, 0, jVar, null, ba.c(0L, jB, jB2, jB3, jB4, jE, null, j8, j8, j8, j8, 0L, 0L, jB5, jB6, jB7, j14, mVar2, 2139588111), mVar2, 819462528, 12779520, 6, 2886936);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(d14, str, d15, lVar, i14) { // from class: cw1.z

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Double f56256a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f56257b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ double f56258c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e23.l f56259d;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(24961);
                    f0.b(this.f56256a, this.f56257b, this.f56258c, this.f56259d, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x010b  */
    public static final void c(jv1.o oVar, String str, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        String strG;
        String strD;
        p3.o0 o0VarE = mVar.E(1183025556);
        int i15 = i14 | (o0VarE.B(oVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, oVar.f101106b);
            double d14 = oVar.f101107c;
            double d15 = oVar.f101108d;
            if (!Double.isNaN(d14) && !Double.isNaN(d15) && d14 != Double.MIN_VALUE && d15 != Double.MAX_VALUE) {
                l3.f23124b.getClass();
                strG = j20.x.d(l3.f23131i.format(d14), "-", l3.f23131i.format(d15), StringUtils.SPACE, str);
            } else if (Double.isNaN(d14) || Double.isNaN(d15) || d14 == Double.MIN_VALUE || d15 != Double.MAX_VALUE) {
                strG = "";
            } else {
                l3.f23124b.getClass();
                strG = e5.g(l3.f23131i.format(d14), "+ ", str);
            }
            if (z14) {
                o0VarE.C(-986938685);
                strD = j20.x.d(strQ, StringUtils.SPACE, strG, StringUtils.SPACE, gl1.y.Q(o0VarE, R.string.selected));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-986859480);
                o0VarE.g0(false);
                strD = strQ + StringUtils.SPACE + strG;
            }
            b92.a aVarA = wz1.a.a(strD);
            boolean z15 = (i15 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new a03.h0(aVar, 17);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a03.h0(aVar, 17);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            int i16 = b92.a.f16960b;
            r.b(null, strQ, strG, aVarA, z14, false, lVar, o0VarE, (i15 << 6) & 57344, 33);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.g((Object) oVar, (Object) str, z14, (Object) aVar, i14, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final jv1.p pVar, final boolean z14, e23.a<Unit> aVar, final e23.p<? super jv1.o, ? super Double, Unit> pVar2, boolean z15, int i14, int i15, p3.m mVar, final int i16, final int i17) throws Throwable {
        int i18;
        int i19;
        int i24;
        int i25;
        e23.a<Unit> aVar2;
        p3.o0 o0Var;
        boolean z16;
        final int i26;
        final int i27;
        p3.o0 o0Var2;
        p3.p1 p1Var;
        String str;
        aVar.getClass();
        pVar2.getClass();
        p3.o0 o0VarE = mVar.E(-400816486);
        int i28 = i16 | (o0VarE.r(pVar) ? 4 : 2);
        if ((i16 & 48) == 0) {
            i28 |= o0VarE.h(z14) ? 32 : 16;
        }
        int i29 = i28 | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(pVar2) ? 2048 : 1024);
        int i30 = i17 & 16;
        int i34 = i30 != 0 ? i29 | 24576 : i29 | (o0VarE.h(z15) ? 16384 : 8192);
        int i35 = i17 & 32;
        if (i35 != 0) {
            i19 = i34 | 196608;
            i18 = i14;
        } else {
            i18 = i14;
            i19 = i34 | (o0VarE.k(i18) ? 131072 : 65536);
        }
        int i36 = i17 & 64;
        if (i36 != 0) {
            i25 = i19 | 1572864;
            i24 = i15;
        } else {
            i24 = i15;
            i25 = i19 | (o0VarE.k(i24) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        if (o0VarE.n(i25 & 1, (599187 & i25) != 599186)) {
            boolean z17 = i30 != 0 ? false : z15;
            int i37 = i35 != 0 ? 0 : i18;
            int i38 = i36 != 0 ? 0 : i24;
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            gg1.o0 o0Var3 = pVar.f101112d;
            l3.f23124b.getClass();
            String strG1 = l3.a.G1(context, o0Var3);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(pVar.f101110b);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var2 = (p3.p1) objQ;
            boolean z18 = o0Var3 == gg1.o0.METRIC || o0Var3 == gg1.o0.STATUTE_UK;
            double d14 = z18 ? 1.0d : 3.2808399d;
            Double d15 = pVar.f101111c;
            Double dC = d15 != null ? p6.b.c(d14, d15) : null;
            double d16 = z18 ? 30000.0d : 100000.0d;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(dC);
                o0VarE.K(objQ2);
            }
            final p3.p1 p1Var3 = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var4 = (p3.p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p3.p1 p1Var5 = (p3.p1) objQ4;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarB = u1.a2.b(x2.d(aVar3, 1.0f), u1.a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            boolean z19 = z17;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            int i39 = i37;
            h5.e0.a aVar4 = h5.g.a.f81805b;
            int i44 = i38;
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
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            final double d17 = d14;
            int i45 = i25;
            p3.p1 p1Var6 = p1Var2;
            b2.a(c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), z19, i39, i44, gl1.y.Q(o0VarE, R.string.lbl_cycling_ability_tell_us_more_elevation_course), gl1.y.Q(o0VarE, R.string.lbl_cycling_ability_tell_us_more_elevation_course_description), null, null, null, o0VarE, (i25 >> 9) & 8176, 448);
            z16 = z19;
            o0VarE.C(145613109);
            for (jv1.o oVar : pVar.f101109a) {
                boolean zG = p005kotlin.jvm.internal.s.g((jv1.o) p1Var6.getF182175a(), oVar);
                if (oVar instanceof jv1.o.a) {
                    o0VarE.C(1017921426);
                    String strQ = gl1.y.Q(o0VarE, oVar.f101106b);
                    boolean zB = o0VarE.B(oVar);
                    Object objQ5 = o0VarE.q();
                    if (zB || objQ5 == p3.m.a.f135155b) {
                        p1Var = p1Var6;
                        objQ5 = new ca0.j1(15, (jv1.o.a) oVar, p1Var);
                        o0VarE.K(objQ5);
                    } else {
                        p1Var = p1Var6;
                    }
                    a(0, (e23.a) objQ5, strQ, o0VarE, zG);
                    o0VarE.g0(false);
                    str = strG1;
                } else {
                    p1Var = p1Var6;
                    o0VarE.C(1018177827);
                    boolean zB2 = o0VarE.B(oVar);
                    Object objQ6 = o0VarE.q();
                    if (zB2 || objQ6 == p3.m.a.f135155b) {
                        objQ6 = new ak0.m(oVar, 29, p1Var3, p1Var);
                        o0VarE.K(objQ6);
                    }
                    str = strG1;
                    c(oVar, str, zG, (e23.a) objQ6, o0VarE, 0);
                    o0VarE.g0(false);
                }
                strG1 = str;
                p1Var6 = p1Var;
            }
            final p3.p1 p1Var7 = p1Var6;
            String str2 = strG1;
            o0VarE.g0(false);
            if (((jv1.o) p1Var7.getF182175a()) instanceof jv1.o.a) {
                o0VarE.C(219834855);
                h4.r.a aVar5 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar5, j92.b.f97899b.f97920e), o0VarE);
                Double d18 = (Double) p1Var3.getF182175a();
                Object objQ7 = o0VarE.q();
                if (objQ7 == p3.m.a.f135155b) {
                    objQ7 = new am.c1(p1Var4, p1Var3, 4);
                    o0VarE.K(objQ7);
                }
                b(d18, str2, d16, (e23.l) objQ7, o0VarE, 24960);
                o0Var2 = o0VarE;
                o0Var2.g0(false);
            } else {
                o0Var2.C(220348990);
                o0Var2.g0(false);
            }
            if (z14) {
                o0Var2 = o0VarE;
                o0Var2.C(220386686);
                e(o0Var2, 0);
                o0Var2.g0(false);
            } else {
                o0Var2 = o0VarE;
                o0Var2.C(220417438);
                o0Var2.g0(false);
            }
            c2.l.f(b0Var.a(h4.r.S, 1.0f, true), o0Var2);
            final boolean z24 = (((jv1.o) p1Var7.getF182175a()) == null || ((!(((jv1.o) p1Var7.getF182175a()) instanceof jv1.o.a) || ((Double) p1Var3.getF182175a()) == null || ((Boolean) p1Var4.getF182175a()).booleanValue()) && (((jv1.o) p1Var7.getF182175a()) instanceof jv1.o.a))) ? false : true;
            z3.e eVarC = z3.f.c(-600456593, new am.l1(p1Var5, 5, (byte) 0), o0Var2);
            final boolean z25 = z18;
            o0Var = o0Var2;
            b82.c.b(null, null, eVarC, z3.f.c(1978912112, new e23.p() { // from class: cw1.d0
                /* JADX WARN: Code duplicated, block: B:12:0x0051  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        l72.f0 f0Var = l72.f0.f110999a;
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        String strQ2 = gl1.y.Q(mVar2, R.string.lbl_next);
                        final boolean z26 = z25;
                        boolean zH = mVar2.h(z26);
                        final double d19 = d17;
                        boolean zM = zH | mVar2.m(d19);
                        final e23.p pVar3 = pVar2;
                        boolean zB3 = zM | mVar2.B(pVar3);
                        Object objQ8 = mVar2.q();
                        if (zB3) {
                            final p3.p1 p1Var8 = p1Var7;
                            final p3.p1 p1Var9 = p1Var3;
                            e23.a aVar6 = new e23.a() { // from class: cw1.x
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.a
                                public final Object invoke() {
                                    p3.p1 p1Var10 = p1Var8;
                                    boolean z27 = ((jv1.o) p1Var10.getF182175a()) instanceof jv1.o.a;
                                    e23.p pVar4 = pVar3;
                                    Double dH = null;
                                    if (z27) {
                                        boolean z28 = z26;
                                        p3.p1 p1Var11 = p1Var9;
                                        if (z28) {
                                            dH = (Double) p1Var11.getF182175a();
                                        } else {
                                            Double d24 = (Double) p1Var11.getF182175a();
                                            if (d24 != null) {
                                                dH = lc.u0.h(d19, d24);
                                            }
                                        }
                                        pVar4.invoke((jv1.o) p1Var10.getF182175a(), dH);
                                    } else {
                                        pVar4.invoke((jv1.o) p1Var10.getF182175a(), null);
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar6);
                            objQ8 = aVar6;
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                final p3.p1 p1Var10 = p1Var7;
                                final p3.p1 p1Var11 = p1Var3;
                                e23.a aVar7 = new e23.a() { // from class: cw1.x
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.a
                                    public final Object invoke() {
                                        p3.p1 p1Var12 = p1Var10;
                                        boolean z27 = ((jv1.o) p1Var12.getF182175a()) instanceof jv1.o.a;
                                        e23.p pVar4 = pVar3;
                                        Double dH = null;
                                        if (z27) {
                                            boolean z28 = z26;
                                            p3.p1 p1Var13 = p1Var11;
                                            if (z28) {
                                                dH = (Double) p1Var13.getF182175a();
                                            } else {
                                                Double d24 = (Double) p1Var13.getF182175a();
                                                if (d24 != null) {
                                                    dH = lc.u0.h(d19, d24);
                                                }
                                            }
                                            pVar4.invoke((jv1.o) p1Var12.getF182175a(), dH);
                                        } else {
                                            pVar4.invoke((jv1.o) p1Var12.getF182175a(), null);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(aVar7);
                                objQ8 = aVar7;
                            }
                        }
                        f0Var.d(384, 1, (e23.a) objQ8, rVarF, strQ2, mVar2, null, z24);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var2), 0L, o0Var, 3456, 19);
            o0Var.g0(true);
            if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                o0Var.C(-710344423);
                boolean z26 = (i45 & 896) == 256;
                Object objQ8 = o0Var.q();
                if (z26 || objQ8 == p3.m.a.f135155b) {
                    aVar2 = aVar;
                    objQ8 = new a11.a0(aVar2, p1Var5, 5);
                    o0Var.K(objQ8);
                } else {
                    aVar2 = aVar;
                }
                e23.a aVar6 = (e23.a) objQ8;
                Object objQ9 = o0Var.q();
                if (objQ9 == p3.m.a.f135155b) {
                    objQ9 = new k(p1Var5, 2);
                    o0Var.K(objQ9);
                }
                lg.d.h(aVar6, (e23.a) objQ9, o0Var, 48);
                o0Var.g0(false);
            } else {
                aVar2 = aVar;
                o0Var.C(-710083992);
                o0Var.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
            i26 = i39;
            i27 = i44;
        } else {
            aVar2 = aVar;
            o0Var = o0VarE;
            o0Var.e();
            z16 = z15;
            i26 = i18;
            i27 = i24;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final e23.a<Unit> aVar7 = aVar2;
            final boolean z27 = z16;
            p2VarI0.f135219d = new e23.p() { // from class: cw1.e0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    ((Integer) obj2).getClass();
                    f0.d(pVar, z14, aVar7, pVar2, z27, i26, i27, (p3.m) obj, p3.p0.t(i16 | 1), i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void e(p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(1885597162);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarF, f14, eVar.f97918c);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_course_demands_set_course_footer_message);
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(strQ, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.garmin.android.apps.connectmobile.workouts.data.model.e0(i14, 23);
        }
    }
}
