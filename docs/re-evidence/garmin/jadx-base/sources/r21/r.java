package r21;

import b82.g0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.common.base.Ascii;
import ds.e0;
import gl1.y;
import i3.e5;
import i3.g4;
import j23.t;
import java.math.BigDecimal;
import java.util.ArrayList;
import o72.h3;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.u;
import p3.l0;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class r {
    public static final void a(h4.r rVar, final boolean z14, final boolean z15, String str, String str2, String str3, String str4, final double d14, final double d15, final double d16, final double d17, final double d18, final double d19, final double d24, double d25, final e23.l lVar, final e23.l lVar2, e23.l lVar3, final boolean z16, String str5, p3.m mVar, final int i14) {
        String str6;
        final h4.r rVar2;
        final String str7;
        final String str8;
        final double d26;
        final e23.l lVar4;
        final String str9;
        final String str10;
        double d27;
        int i15;
        e23.l lVar5;
        String str11;
        h4.r rVar3;
        String str12;
        String str13;
        String str14;
        double dDoubleValue;
        double dDoubleValue2;
        String str15;
        ArrayList arrayList;
        double dC;
        i53.c cVarH;
        i53.c cVarH2;
        final double d28;
        ArrayList arrayList2;
        int i16;
        int i17;
        i53.c cVar;
        e23.l lVar6;
        int i18;
        n1 n1Var;
        Object obj;
        o0 o0VarE = mVar.E(1078033065);
        int i19 = i14 | 6 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.h(z15) ? 256 : 128) | 74752;
        boolean zB = o0VarE.B(str4);
        char c14 = Ascii.MIN;
        int i24 = i19 | (zB ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.m(d14) ? 8388608 : 4194304) | (o0VarE.m(d15) ? 67108864 : 33554432) | (o0VarE.m(d16) ? 536870912 : 268435456);
        int i25 = (o0VarE.r(lVar) ? 131072 : 65536) | 0 | (o0VarE.m(d17) ? (char) 4 : (char) 2) | (o0VarE.m(d18) ? 32 : 16) | (o0VarE.m(d19) ? (char) 256 : (char) 128) | (o0VarE.m(d24) ? 2048 : 1024) | 24576;
        if (o0VarE.r(lVar2)) {
            c14 = Ascii.MIN;
        }
        int i26 = i25 | c14 | 817889280;
        if (o0VarE.n(i24 & 1, ((i24 & 306783379) == 306783378 && (i26 & 306783379) == 306783378) ? false : true)) {
            o0VarE.G0();
            int i27 = i14 & 1;
            p3.m.a aVar = p3.m.f135153a;
            if (i27 == 0 || o0VarE.o0()) {
                h4.r.a aVar2 = h4.r.S;
                String strQ = y.Q(o0VarE, R.string.gak_lbl_kg);
                String strQ2 = y.Q(o0VarE, R.string.gak_lbl_lbs);
                String strQ3 = y.Q(o0VarE, R.string.gak_lbl_st);
                int i28 = i24 & (-523265);
                Object objQ = o0VarE.q();
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new qv1.l(15);
                    o0VarE.K(objQ);
                }
                d27 = 13.9d;
                i15 = i28;
                lVar5 = (e23.l) objQ;
                str11 = "";
                rVar3 = aVar2;
                str12 = strQ;
                str13 = strQ2;
                str14 = strQ3;
            } else {
                o0VarE.e();
                rVar3 = rVar;
                str13 = str2;
                str14 = str3;
                d27 = d25;
                lVar5 = lVar3;
                str11 = str5;
                i15 = i24 & (-523265);
                str12 = str;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            String str16 = str12;
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            String str17 = str13;
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = e5.o((int) d14, o0VarE);
            }
            n1 n1Var2 = (n1) objQ2;
            if (z14) {
                dDoubleValue = d15;
            } else if (z15) {
                o13.p<Integer, Double> pVarB = b(d17);
                dDoubleValue = n1Var2.getIntValue() == pVarB.f128594a.intValue() ? pVarB.f128595b.doubleValue() : d27;
            } else {
                dDoubleValue = d16;
            }
            if (z14) {
                dDoubleValue2 = d18;
            } else if (z15) {
                o13.p<Integer, Double> pVarB2 = b(d24);
                int iIntValue = pVarB2.f128594a.intValue();
                dDoubleValue2 = pVarB2.f128595b.doubleValue();
                if (n1Var2.getIntValue() != iIntValue) {
                    dDoubleValue2 = 0.0d;
                }
            } else {
                dDoubleValue2 = d19;
            }
            k42.b.f102880a.getClass();
            int iIntValue2 = k42.b.t(dDoubleValue2).intValue();
            int iM = k42.b.m(dDoubleValue2);
            int iIntValue3 = k42.b.t(dDoubleValue).intValue();
            int iM2 = k42.b.m(dDoubleValue);
            ArrayList arrayList3 = new ArrayList();
            if (z15) {
                dC = t.c(b(d14).f128595b.doubleValue(), 0.0d, dDoubleValue);
                arrayList = arrayList3;
                str15 = str14;
            } else {
                str15 = str14;
                arrayList = arrayList3;
                dC = t.c(d14, 0.0d, dDoubleValue);
            }
            Object objQ3 = o0VarE.q();
            if (objQ3 == r61) {
                objQ3 = e5.o(k42.b.t(dC).intValue(), o0VarE);
            }
            final n1 n1Var3 = (n1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == r61) {
                objQ4 = e5.o(k42.b.m(dC), o0VarE);
            }
            final n1 n1Var4 = (n1) objQ4;
            if (z15 && n1Var2.getIntValue() == ((int) d17)) {
                cVarH = i53.a.e(new j23.l(n1Var2.getIntValue() == 0 ? 2 : 0, iIntValue3));
            } else {
                cVarH = (z15 && n1Var2.getIntValue() == ((int) d24)) ? e0.h(iIntValue2, 13) : e0.h(iIntValue2, r62);
            }
            i53.c cVar2 = cVarH;
            if (n1Var3.getIntValue() == r62) {
                cVarH2 = e0.h(0, iM2);
            } else {
                cVarH2 = n1Var3.getIntValue() == iIntValue2 ? e0.h(iM, 9) : e0.h(0, 9);
            }
            i53.c cVarE = i53.a.e(u.C(new String[]{(!z16 || z14) ? str16 : null, (z16 && z14) ? null : str17}));
            if (z15) {
                o0VarE.C(-2078511059);
                int iE = t.e(b(d14).f128594a.intValue(), (int) d24, (int) d17);
                Unit unit = Unit.INSTANCE;
                boolean zK = o0VarE.k(iE);
                Object objQ5 = o0VarE.q();
                if (zK || objQ5 == c2565a) {
                    n1Var = n1Var2;
                    objQ5 = new q(iE, n1Var, null);
                    o0VarE.K(objQ5);
                } else {
                    n1Var = n1Var2;
                }
                l0.e((e23.p) objQ5, unit, o0VarE);
                final i53.c cVarE2 = i53.a.e(new j23.l(new BigDecimal(String.valueOf(d24)).intValue(), new BigDecimal(String.valueOf(d17)).intValue()));
                int iIndexOf = cVarE2.indexOf(Integer.valueOf(t.e(n1Var.getIntValue(), ((Number) h0.b0(cVarE2)).intValue(), ((Number) h0.m0(cVarE2)).intValue())));
                str15 = str15;
                z3.e eVarC = z3.f.c(1183107743, new h3(str15, 8), o0VarE);
                boolean zB2 = o0VarE.B(cVarE2);
                int i29 = i26 & 3670016;
                i16 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                boolean zB3 = (i29 == 1048576) | zB2 | ((i26 & 14) == 4) | o0VarE.B(n1Var3) | o0VarE.B(n1Var4);
                i17 = 131072;
                boolean z17 = zB3 | ((i26 & 458752) == 131072);
                Object objQ6 = o0VarE.q();
                if (z17 || objQ6 == r61) {
                    final n1 n1Var5 = n1Var;
                    d28 = d27;
                    obj = new e23.l() { // from class: r21.o
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            int iIntValue4 = ((Number) cVarE2.get(((Integer) obj2).intValue())).intValue();
                            n1 n1Var6 = n1Var5;
                            n1Var6.t(iIntValue4);
                            lVar2.invoke(Integer.valueOf(n1Var6.getIntValue()));
                            int intValue = n1Var6.getIntValue();
                            double d29 = d17;
                            int i30 = (int) d29;
                            double d34 = intValue == i30 ? (d29 - ((double) i30)) * 14.0d : d28;
                            n1 n1Var7 = n1Var3;
                            double intValue2 = n1Var7.getIntValue();
                            n1 n1Var8 = n1Var4;
                            double intValue3 = (((double) n1Var8.getIntValue()) * 0.1d) + intValue2;
                            if (intValue3 <= d34) {
                                d34 = intValue3;
                            }
                            n1Var7.t((int) d34);
                            n1Var8.t(MathKt.b((d34 - ((double) n1Var7.getIntValue())) * ((double) 10)));
                            lVar.invoke(Double.valueOf((((double) n1Var8.getIntValue()) * 0.1d) + ((double) n1Var7.getIntValue())));
                            return Unit.INSTANCE;
                        }
                    };
                    n1Var3 = n1Var3;
                    n1Var4 = n1Var4;
                    o0VarE.K(obj);
                } else {
                    d28 = d27;
                    obj = objQ6;
                }
                r82.p pVar = new r82.p(cVarE2, iIndexOf, null, null, eVarC, 0.0f, false, false, null, null, (e23.l) obj, 1004, null);
                arrayList2 = arrayList;
                arrayList2.add(pVar);
                o0VarE.g0(false);
            } else {
                d28 = d27;
                arrayList2 = arrayList;
                cVar2 = cVar2;
                i16 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                i17 = 131072;
                o0VarE.C(-2076623655);
                o0VarE.g0(false);
            }
            int iIndexOf2 = cVar2.indexOf(Integer.valueOf(t.e(n1Var3.getIntValue(), ((Number) h0.b0(cVar2)).intValue(), ((Number) h0.m0(cVar2)).intValue())));
            d.f149483a.getClass();
            z3.e eVar = d.f149484b;
            int i30 = i26 & 458752;
            boolean zB4 = o0VarE.B(n1Var3) | o0VarE.B(cVar2) | o0VarE.k(r62) | o0VarE.B(n1Var4) | o0VarE.B(cVarH2) | o0VarE.k(iIntValue2) | (i30 == i17);
            Object objQ7 = o0VarE.q();
            if (zB4 || objQ7 == r61) {
                cVar = cVar2;
                objQ7 = new g4(cVar, r62, cVarH2, iIntValue2, lVar, n1Var3, n1Var4);
                o0VarE.K(objQ7);
            } else {
                cVar = cVar2;
            }
            arrayList2.add(new r82.p(cVar, iIndexOf2, null, null, eVar, 0.0f, false, false, null, null, (e23.l) objQ7, 1004, null));
            int iIndexOf3 = cVarH2.indexOf(Integer.valueOf(t.e(n1Var4.getIntValue(), ((Number) h0.b0(cVarH2)).intValue(), ((Number) h0.m0(cVarH2)).intValue())));
            boolean z18 = (i15 & 3670016) == i16;
            Object objQ8 = o0VarE.q();
            if (z18 || objQ8 == r61) {
                str6 = str4;
                objQ8 = new o60.b(str6, 14);
                o0VarE.K(objQ8);
            } else {
                str6 = str4;
            }
            e23.l lVar7 = (e23.l) objQ8;
            z3.e eVarC2 = z3.f.c(492703706, new g0(z15, str17, 5, (byte) 0), o0VarE);
            boolean zB5 = o0VarE.B(n1Var4) | o0VarE.B(cVarH2) | (i30 == i17) | o0VarE.B(n1Var3);
            Object objQ9 = o0VarE.q();
            if (zB5 || objQ9 == r61) {
                objQ9 = new p(cVarH2, lVar, n1Var4, n1Var3, 0);
                o0VarE.K(objQ9);
            }
            arrayList2.add(new r82.p(cVarH2, iIndexOf3, lVar7, null, eVarC2, 0.0f, false, false, null, null, (e23.l) objQ9, 1000, null));
            if (z15) {
                lVar6 = lVar5;
                i18 = 0;
                o0VarE.C(-2074497799);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2074686155);
                Object objQ10 = o0VarE.q();
                if (objQ10 == r61) {
                    lVar6 = lVar5;
                    objQ10 = new qe2.c(lVar6, 8);
                    o0VarE.K(objQ10);
                } else {
                    lVar6 = lVar5;
                }
                arrayList2.add(new r82.p(cVarE, 0, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ10, 1022, null));
                i18 = 0;
                o0VarE.g0(false);
            }
            h4.r rVar4 = rVar3;
            r82.k.c(rVar4, i53.a.e(arrayList2), o0VarE, 6, i18);
            lVar4 = lVar6;
            str7 = str17;
            rVar2 = rVar4;
            d26 = d28;
            str8 = str15;
            str9 = str11;
            str10 = str16;
        } else {
            str6 = str4;
            o0VarE.e();
            rVar2 = rVar;
            str7 = str2;
            str8 = str3;
            d26 = d25;
            lVar4 = lVar3;
            str9 = str5;
            str10 = str;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final String str18 = str6;
            p2VarI0.f135219d = new e23.p(z14, z15, str10, str7, str8, str18, d14, d15, d16, d17, d18, d19, d24, d26, lVar, lVar2, lVar4, z16, str9, i14) { // from class: r21.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f149511b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f149512c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f149513d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f149514e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ String f149515f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ String f149516g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ double f149517h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ double f149518i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ double f149519j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ double f149520k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ double f149521l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ double f149522m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ double f149523n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ double f149524o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ e23.l f149525p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ e23.l f149526q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ e23.l f149527r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ boolean f149528t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ String f149529v;

                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iT = p0.t(1);
                    r.a(this.f149510a, this.f149511b, this.f149512c, this.f149513d, this.f149514e, this.f149515f, this.f149516g, this.f149517h, this.f149518i, this.f149519j, this.f149520k, this.f149521l, this.f149522m, this.f149523n, this.f149524o, this.f149525p, this.f149526q, this.f149527r, this.f149528t, this.f149529v, (p3.m) obj2, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final o13.p<Integer, Double> b(double d14) {
        int i14 = (int) d14;
        double d15 = 10;
        return new o13.p<>(Integer.valueOf(i14), Double.valueOf(Math.rint(((d14 - ((double) i14)) * 14.0d) * d15) / d15));
    }
}
