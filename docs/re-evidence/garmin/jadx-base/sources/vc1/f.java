package vc1;

import c2.b0;
import c2.j;
import c2.l;
import c2.t2;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import e23.q;
import h4.k;
import h4.r;
import h5.e0;
import ho.x;
import i3.e5;
import l72.x0;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:78:0x0146  */
    public static final void a(final Long l14, final long j8, final Long l15, final long j14, final Double d14, final long j15, final sc1.a aVar, final Double d15, final Double d16, final Double d17, final Double d18, final Double d19, m mVar, final int i14) {
        Double dValueOf;
        Integer numValueOf;
        Integer numValueOf2;
        int iIntValue;
        aVar.getClass();
        o0 o0VarE = mVar.E(246531519);
        int i15 = i14 | (o0VarE.B(l14) ? 4 : 2) | (o0VarE.l(j8) ? 32 : 16) | (o0VarE.B(l15) ? 256 : 128) | (o0VarE.l(j14) ? 2048 : 1024) | (o0VarE.B(d14) ? 16384 : 8192) | (o0VarE.l(j15) ? 131072 : 65536) | (o0VarE.B(d15) ? 8388608 : 4194304) | (o0VarE.B(d16) ? 67108864 : 33554432) | (o0VarE.B(d17) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, ((i15 & 306783379) == 306783378 && (((o0VarE.B(d18) ? (char) 4 : (char) 2) | (o0VarE.B(d19) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            x1 x1Var = n.f135158a;
            if (d14 != null) {
                Double dH = d17 != null ? u0.h(d14.doubleValue(), d17) : null;
                if (dH != null) {
                    double dDoubleValue = dH.doubleValue();
                    l3.a aVar2 = l3.f23124b;
                    boolean zC = mg0.b.c();
                    aVar2.getClass();
                    dValueOf = Double.valueOf(l3.a.u(dDoubleValue, zC));
                } else {
                    dValueOf = null;
                }
            } else {
                dValueOf = null;
            }
            Double d24 = dValueOf;
            if (d18 != null) {
                double dDoubleValue2 = d18.doubleValue();
                l3.a aVar3 = l3.f23124b;
                boolean zC2 = mg0.b.c();
                aVar3.getClass();
                numValueOf = Integer.valueOf(l3.a.u(dDoubleValue2, zC2));
            } else {
                numValueOf = null;
            }
            if (d19 != null) {
                double dDoubleValue3 = d19.doubleValue();
                l3.a aVar4 = l3.f23124b;
                boolean zC3 = mg0.b.c();
                aVar4.getClass();
                numValueOf2 = Integer.valueOf(l3.a.u(dDoubleValue3, zC3));
            } else {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                Integer numE = numValueOf != null ? b71.i.e(numValueOf2.intValue(), numValueOf) : null;
                if (numE != null) {
                    iIntValue = numE.intValue();
                } else {
                    iIntValue = 0;
                }
            } else {
                iIntValue = 0;
            }
            final int iAbs = Math.abs(iIntValue) / 2;
            l3.a aVar5 = l3.f23124b;
            boolean zC4 = mg0.b.c();
            aVar5.getClass();
            l3.a.e1(l3.a.u(iAbs, zC4));
            r.a aVar6 = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar6, o0VarE);
            h5.g.V.getClass();
            e0.a aVar7 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            x0 x0Var = x0.f111346a;
            r rVarF = x2.f(aVar6, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97918c;
            float f16 = eVar.f97920e;
            org.apache.commons.lang3.e.j(bVar2);
            r rVarB = l.B(rVarF, f14, f15, f16, eVar.f97919d);
            z3.e eVarC = z3.f.c(-2102568242, new q() { // from class: vc1.d
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i16;
                    Long lValueOf;
                    String strConcat;
                    String str;
                    b92.a aVar8;
                    Long lValueOf2;
                    int i17;
                    int i18;
                    Double d25;
                    String strConcat2;
                    String str2;
                    t2 t2Var = (t2) obj;
                    m mVar2 = (m) obj2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    t2Var.getClass();
                    if ((iIntValue2 & 6) == 0) {
                        iIntValue2 |= mVar2.B(t2Var) ? 4 : 2;
                    }
                    int i19 = iIntValue2;
                    if (mVar2.n(i19 & 1, (i19 & 19) != 18)) {
                        x1 x1Var2 = n.f135158a;
                        Long l16 = l14;
                        sc1.a aVar9 = aVar;
                        if (l16 == null || (d25 = d15) == null) {
                            i16 = R.string.no_duration_value;
                            mVar2.C(193503732);
                            mVar2.f();
                        } else {
                            mVar2.C(192658579);
                            x0 x0Var2 = x0.f111346a;
                            if (aVar9 == sc1.a.Time) {
                                mVar2.C(192736885);
                                l3.a aVar10 = l3.f23124b;
                                long jLongValue = l16.longValue();
                                aVar10.getClass();
                                strConcat2 = l3.a.e1(jLongValue);
                                if (strConcat2 == null) {
                                    strConcat2 = sn.a.h(mVar2, -1933442696, R.string.no_duration_value, mVar2);
                                } else {
                                    mVar2.C(-1933445331);
                                    mVar2.f();
                                }
                                mVar2.f();
                            } else {
                                mVar2.C(192920033);
                                l3.a aVar11 = l3.f23124b;
                                double dDoubleValue4 = d25.doubleValue();
                                boolean zC5 = mg0.b.c();
                                aVar11.getClass();
                                String strE1 = l3.a.e1(l3.a.u(dDoubleValue4, zC5));
                                strConcat2 = strE1 != null ? strE1.concat(StringUtils.SPACE) : null;
                                if (strConcat2 == null) {
                                    strConcat2 = sn.a.h(mVar2, -1933433192, R.string.no_duration_value, mVar2);
                                } else {
                                    mVar2.C(-1933439423);
                                    mVar2.f();
                                }
                                mVar2.f();
                            }
                            String str3 = strConcat2;
                            if (aVar9 == sc1.a.Pace) {
                                mVar2.C(-1933429047);
                                l3.a aVar12 = l3.f23124b;
                                boolean zC6 = mg0.b.c();
                                aVar12.getClass();
                                String strQ = gl1.y.Q(mVar2, l3.a.N1(zC6));
                                mVar2.f();
                                str2 = strQ;
                            } else {
                                mVar2.C(193304463);
                                mVar2.f();
                                str2 = null;
                            }
                            String strQ2 = gl1.y.Q(mVar2, R.string.lbl_personal_records_current_record);
                            x0.a aVar13 = new x0.a(j8, null);
                            int i24 = (i19 & 14) | (x0.f111348c << 24);
                            i16 = R.string.no_duration_value;
                            x0Var2.a(i24, 112, null, t2Var, null, null, str3, strQ2, str2, aVar13, mVar2);
                            mVar2.f();
                        }
                        x0 x0Var3 = x0.f111346a;
                        sc1.a aVar14 = sc1.a.Time;
                        Double d26 = d16;
                        if (aVar9 == aVar14) {
                            mVar2.C(193613782);
                            l3.f23124b.getClass();
                            strConcat = l3.a.g1(l15);
                            if (strConcat == null) {
                                strConcat = sn.a.h(mVar2, -1933414440, i16, mVar2);
                            } else {
                                mVar2.C(-1933417044);
                                mVar2.f();
                            }
                            mVar2.f();
                        } else {
                            mVar2.C(193787909);
                            l3.a aVar15 = l3.f23124b;
                            if (d26 != null) {
                                double dDoubleValue5 = d26.doubleValue();
                                boolean zC7 = mg0.b.c();
                                aVar15.getClass();
                                lValueOf = Long.valueOf(l3.a.u(dDoubleValue5, zC7));
                            } else {
                                lValueOf = null;
                            }
                            aVar15.getClass();
                            String strG1 = l3.a.g1(lValueOf);
                            strConcat = strG1 != null ? strG1.concat(StringUtils.SPACE) : null;
                            if (strConcat == null) {
                                strConcat = sn.a.h(mVar2, -1933405320, i16, mVar2);
                            } else {
                                mVar2.C(-1933411427);
                                mVar2.f();
                            }
                            mVar2.f();
                        }
                        String str4 = strConcat;
                        sc1.a aVar16 = sc1.a.Pace;
                        if (aVar9 == aVar16) {
                            mVar2.C(-1933401431);
                            l3.a aVar17 = l3.f23124b;
                            boolean zC8 = mg0.b.c();
                            aVar17.getClass();
                            String strQ3 = gl1.y.Q(mVar2, l3.a.N1(zC8));
                            mVar2.f();
                            str = strQ3;
                        } else {
                            mVar2.C(194160559);
                            mVar2.f();
                            str = null;
                        }
                        String strQ4 = gl1.y.Q(mVar2, R.string.proj_rtp_projection);
                        x0.a aVar18 = new x0.a(j14, null);
                        if (aVar9 == aVar16) {
                            mVar2.C(194399291);
                            String strQ5 = gl1.y.Q(mVar2, R.string.proj_rtp_projection);
                            l3.a aVar19 = l3.f23124b;
                            if (d26 != null) {
                                double dDoubleValue6 = d26.doubleValue();
                                boolean zC9 = mg0.b.c();
                                aVar19.getClass();
                                lValueOf2 = Long.valueOf(l3.a.u(dDoubleValue6, zC9));
                            } else {
                                lValueOf2 = null;
                            }
                            aVar19.getClass();
                            String strG2 = l3.a.g1(lValueOf2);
                            if (strG2 == null) {
                                strG2 = null;
                            }
                            if (strG2 == null) {
                                strG2 = sn.a.h(mVar2, -1933379912, R.string.no_duration_value, mVar2);
                            } else {
                                mVar2.C(-1933386639);
                                mVar2.f();
                            }
                            if (mg0.b.c()) {
                                i17 = -1933376840;
                                i18 = R.string.lbl_per_kilometer;
                            } else {
                                i17 = -1933375309;
                                i18 = R.string.lbl_per_mile;
                            }
                            String strH = sn.a.h(mVar2, i17, i18, mVar2);
                            String strP = gl1.y.P(R.string.lbl_value1_or_value2, new Object[]{gl1.y.Q(mVar2, R.string.lbl_plus), gl1.y.Q(mVar2, R.string.lbl_minus)}, mVar2);
                            String strQ6 = gl1.y.Q(mVar2, R.string.lbl_time_unit_seconds);
                            StringBuilder sbL = e5.l(strQ5, StringUtils.SPACE, strG2, StringUtils.SPACE, strH);
                            sbL.append(", ");
                            sbL.append(strP);
                            sbL.append(StringUtils.SPACE);
                            sbL.append(iAbs);
                            sbL.append(strQ6);
                            b92.a aVarA = wz1.a.a(sbL.toString());
                            mVar2.f();
                            aVar8 = aVarA;
                        } else {
                            mVar2.C(195230184);
                            mVar2.f();
                            aVar8 = null;
                        }
                        int i25 = b92.a.f16960b;
                        x0Var3.a((i19 & 14) | (x0.f111348c << 24), 48, aVar8, t2Var, null, null, str4, strQ4, str, aVar18, mVar2);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            int i16 = (x0.f111348c << 6) | 48;
            x0Var.e(rVarB, eVarC, o0VarE, i16, 0);
            if (d14 == null || d24 == null) {
                o0VarE = o0VarE;
                o0VarE.C(384770381);
                o0VarE.g0(false);
            } else {
                o0VarE.C(383683490);
                r rVarF2 = x2.f(aVar6, 1.0f);
                bVar2.getClass();
                bVar2.getClass();
                bVar2.getClass();
                float f17 = eVar.f97921f;
                bVar2.getClass();
                r rVarB2 = l.B(rVarF2, f15, f17, f16, f16);
                z3.e eVarC2 = z3.f.c(-1927522135, new x(aVar, d14, d24, j15, 3), o0VarE);
                o0VarE = o0VarE;
                x0Var.e(rVarB2, eVarC2, o0VarE, i16, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(l14, j8, l15, j14, d14, j15, aVar, d15, d16, d17, d18, d19, i14) { // from class: vc1.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Long f177063a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f177064b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Long f177065c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f177066d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Double f177067e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f177068f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ sc1.a f177069g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ Double f177070h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ Double f177071i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ Double f177072j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ Double f177073k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ Double f177074l;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1572865);
                    f.a(this.f177063a, this.f177064b, this.f177065c, this.f177066d, this.f177067e, this.f177068f, this.f177069g, this.f177070h, this.f177071i, this.f177072j, this.f177073k, this.f177074l, (m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
