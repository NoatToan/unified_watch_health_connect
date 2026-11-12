package dx0;

import as.h;
import c2.q0;
import c2.x2;
import c22.h0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f02.t;
import gl1.y;
import h4.r;
import java.text.NumberFormat;
import java.util.ArrayList;
import o4.d0;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.jvm.internal.j;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import p5.v;
import ww0.i;
import z72.k;
import z72.l;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:152:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:160:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:169:0x0305 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x0307  */
    /* JADX WARN: Code duplicated, block: B:172:0x0310  */
    /* JADX WARN: Code duplicated, block: B:173:0x0312  */
    /* JADX WARN: Code duplicated, block: B:175:0x0315 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x031f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0342  */
    /* JADX WARN: Code duplicated, block: B:183:0x034c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0359  */
    /* JADX WARN: Code duplicated, block: B:187:0x0365  */
    /* JADX WARN: Code duplicated, block: B:190:0x036b  */
    /* JADX WARN: Code duplicated, block: B:192:0x0373  */
    /* JADX WARN: Code duplicated, block: B:194:0x0377  */
    /* JADX WARN: Code duplicated, block: B:86:0x0135  */
    /* JADX WARN: Code duplicated, block: B:87:0x0143  */
    public static final void a(e eVar, int i14, int i15, LocalDate localDate, h0 h0Var, h0 h0Var2, h0 h0Var3, m mVar, int i16, int i17) {
        int i18;
        o0 o0Var;
        Double d14;
        Double dValueOf;
        boolean z14;
        String strQ;
        a aVar;
        String str;
        String str2;
        boolean z15;
        boolean z16;
        boolean z17;
        d0 d0VarA;
        d0 d0VarA2;
        Object objQ;
        boolean z18;
        Float fValueOf;
        int i19;
        boolean z19;
        LocalDate localDate2;
        LocalDate localDate3;
        j jVar;
        LocalDate localDate4;
        boolean z24;
        h0 h0Var4 = h0Var3;
        boolean z25 = eVar.f61468b;
        o0 o0VarE = mVar.E(1253342418);
        if ((i16 & 6) == 0) {
            i18 = (o0VarE.B(eVar) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= o0VarE.k(i14) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i18 |= o0VarE.k(i15) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i18 |= o0VarE.r(localDate) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i18 |= (32768 & i16) == 0 ? o0VarE.B(h0Var) : o0VarE.r(h0Var) ? 16384 : 8192;
        }
        if ((196608 & i16) == 0) {
            i18 |= (262144 & i16) == 0 ? o0VarE.B(h0Var2) : o0VarE.r(h0Var2) ? 131072 : 65536;
        }
        int i24 = i17 & 64;
        int i25 = 1572864;
        if (i24 != 0) {
            i18 |= i25;
        } else if ((1572864 & i16) == 0) {
            i25 = (2097152 & i16) == 0 ? o0VarE.B(h0Var4) : o0VarE.r(h0Var4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            i18 |= i25;
        }
        if (o0VarE.n(i18 & 1, (599187 & i18) != 599186)) {
            h0 h0Var5 = i24 != 0 ? null : h0Var4;
            x1 x1Var = n.f135158a;
            LocalDate localDatePlusDays = localDate.plusDays(i14 - 1);
            ArrayList arrayList = new ArrayList();
            t.f67748a.getClass();
            gl.c cVar = gl.c.f77766a;
            cVar.getClass();
            gl.e eVar2 = gl.c.f77767b;
            long j8 = eVar2.f77787j;
            cVar.getClass();
            long j14 = eVar2.f77800p0;
            cVar.getClass();
            long j15 = eVar2.f77817y;
            boolean z26 = eVar.f61471e;
            boolean z27 = eVar.f61469c;
            boolean z28 = eVar.f61472f;
            a aVar2 = eVar.f61467a;
            boolean z29 = eVar.f61470d;
            if (z25 || z27) {
                h0Var5 = h0Var5;
                aVar2 = aVar2;
                d14 = null;
                arrayList.add(new l(1.0f, j8, null));
            } else {
                if (z26 || z29) {
                    h0Var5 = h0Var5;
                    if (aVar2 != a.REPORT) {
                        dValueOf = Double.valueOf(((double) Math.min(i14, i15)) / ((double) i15));
                        z14 = true;
                    } else {
                        z14 = false;
                        dValueOf = null;
                    }
                    double d15 = i15;
                    double dC = (h0Var != null ? h0Var.c() : 0.0d) / d15;
                    if (dC > 0.0d) {
                        arrayList.add(new l((float) dC, j14, null));
                    }
                    if (h0Var2 != null && (z28 || z29)) {
                        if (h0Var == null || (localDate3 = h0Var.f23062b) == null) {
                            localDate3 = localDate;
                        }
                        float days = Days.daysBetween(localDate3, h0Var2.f23061a).getDays() - 1;
                        if (days > 0.0f) {
                            jVar = null;
                            arrayList.add(new l(days / i15, j8, null));
                        } else {
                            jVar = null;
                        }
                        double dC2 = h0Var2.c();
                        if (dC2 > 0.0d) {
                            arrayList.add(new l((float) (dC2 / d15), j15, jVar));
                        }
                        double days2 = Days.daysBetween(h0Var2.f23062b, localDate.plusDays(i15 - 1)).getDays();
                        if (days2 > 0.0d) {
                            arrayList.add(new l((float) (days2 / d15), j8, null));
                        }
                    } else if (h0Var5 == null || z28 || eVar.f61473g != i.NONE) {
                        if (h0Var != null) {
                            localDatePlusDays.getClass();
                            z19 = j23.g.a.a(h0Var, localDatePlusDays);
                            if (!z19 || z26) {
                                localDatePlusDays = localDatePlusDays;
                                j15 = j15;
                                arrayList.add(new l((float) (1.0d - dC), j8, null));
                            } else {
                                arrayList.clear();
                                d14 = null;
                                arrayList.add(new l(1.0f, j8, null));
                            }
                        } else {
                            localDatePlusDays = localDatePlusDays;
                        }
                        localDatePlusDays = localDatePlusDays;
                        if (z19) {
                        }
                        localDatePlusDays = localDatePlusDays;
                        j15 = j15;
                        arrayList.add(new l((float) (1.0d - dC), j8, null));
                    } else {
                        if (h0Var == null || (localDate2 = h0Var.f23062b) == null) {
                            localDate2 = localDate;
                        }
                        double days3 = Days.daysBetween(localDate2, h0Var5.f23061a).getDays() - 1;
                        if (days3 > 0.0d) {
                            arrayList.add(new l((float) (days3 / d15), j8, null));
                        }
                        int iC = h0Var5.c();
                        h0Var5 = h0Var5;
                        double d16 = iC;
                        if (d16 > 0.0d) {
                            arrayList.add(new l((float) (d16 / d15), j8, null));
                        }
                    }
                    j15 = j15;
                    localDatePlusDays = localDatePlusDays;
                } else {
                    if (h0Var != null) {
                        localDatePlusDays.getClass();
                        localDate4 = localDatePlusDays;
                        z24 = j23.g.a.a(h0Var, localDatePlusDays);
                        if (z24) {
                            arrayList.add(new l(1.0f, j14, null));
                        } else {
                            arrayList.add(new l(1.0f, j8, null));
                        }
                        j15 = j15;
                        aVar2 = aVar2;
                        localDatePlusDays = localDate4;
                        dValueOf = null;
                        z14 = false;
                    } else {
                        localDate4 = localDatePlusDays;
                    }
                    if (z24) {
                        arrayList.add(new l(1.0f, j14, null));
                    } else {
                        arrayList.add(new l(1.0f, j8, null));
                    }
                    j15 = j15;
                    aVar2 = aVar2;
                    localDatePlusDays = localDate4;
                    dValueOf = null;
                    z14 = false;
                }
                strQ = y.Q(o0VarE, R.string.no_value_card);
                String strQ2 = y.Q(o0VarE, R.string.mct_no_data_available);
                if (!z25 || z27) {
                    aVar = aVar2;
                    str = strQ;
                } else {
                    aVar = aVar2;
                    str = (aVar == a.REPORT || i14 <= 0) ? "" : NumberFormat.getIntegerInstance().format(Integer.valueOf(i14));
                }
                if (dValueOf == null) {
                    str2 = str;
                    d0VarA2 = null;
                } else {
                    if (h0Var != null) {
                        localDatePlusDays.getClass();
                        str2 = str;
                        z15 = true;
                        z16 = j23.g.a.a(h0Var, localDatePlusDays);
                        if (z16) {
                            d0VarA2 = d0.a(j14);
                        } else {
                            if (h0Var2 != null) {
                                localDatePlusDays.getClass();
                                if (j23.g.a.a(h0Var2, localDatePlusDays) == z15) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            } else {
                                z17 = false;
                            }
                            if (z17 || !(z28 || z29)) {
                                d0VarA = d0.a(j8);
                            } else {
                                d0VarA = d0.a(j15);
                            }
                            d0VarA2 = d0VarA;
                        }
                    } else {
                        str2 = str;
                        z15 = true;
                    }
                    if (z16) {
                        d0VarA2 = d0.a(j14);
                    } else {
                        if (h0Var2 != null) {
                            localDatePlusDays.getClass();
                            if (j23.g.a.a(h0Var2, localDatePlusDays) == z15) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            d0VarA = d0.a(j8);
                        } else {
                            d0VarA = d0.a(j8);
                        }
                        d0VarA2 = d0VarA;
                    }
                }
                r rVarA = x2.a(r.S, gl.b.q(o0VarE, R.dimen.gauge_chart_size_small), gl.b.q(o0VarE, R.dimen.gauge_chart_size_small));
                objQ = o0VarE.q();
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    z18 = true;
                    objQ = new dv0.n(1);
                    o0VarE.K(objQ);
                } else {
                    z18 = true;
                }
                r rVarC = v.c((e23.l) objQ, rVarA, z18);
                i53.f fVarJ = i53.a.j(arrayList);
                if (dValueOf != null) {
                    fValueOf = Float.valueOf((float) dValueOf.doubleValue());
                } else {
                    fValueOf = null;
                }
                if (aVar != a.REPORT) {
                    i19 = 8;
                } else {
                    i19 = 4;
                }
                float f14 = i19;
                g6.f.a aVar3 = g6.f.f75994b;
                h0Var4 = h0Var5;
                o0Var = o0VarE;
                k.c(rVarC, fVarJ, fValueOf, d0VarA2, f14, z14 ? 3.0f : 0.0f, z3.f.c(-2116319568, new h(str2, eVar, strQ, strQ2, i14, h0Var, localDatePlusDays), o0VarE), o0Var, 12582912, 16);
            }
            dValueOf = d14;
            z14 = false;
            strQ = y.Q(o0VarE, R.string.no_value_card);
            String strQ3 = y.Q(o0VarE, R.string.mct_no_data_available);
            if (z25) {
                aVar = aVar2;
                str = strQ;
            } else {
                aVar = aVar2;
                str = strQ;
            }
            if (dValueOf == null) {
                str2 = str;
                d0VarA2 = null;
            } else {
                if (h0Var != null) {
                    localDatePlusDays.getClass();
                    str2 = str;
                    z15 = true;
                    if (j23.g.a.a(h0Var, localDatePlusDays)) {
                    }
                    if (z16) {
                        d0VarA2 = d0.a(j14);
                    } else {
                        if (h0Var2 != null) {
                            localDatePlusDays.getClass();
                            if (j23.g.a.a(h0Var2, localDatePlusDays) == z15) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            d0VarA = d0.a(j8);
                        } else {
                            d0VarA = d0.a(j8);
                        }
                        d0VarA2 = d0VarA;
                    }
                } else {
                    str2 = str;
                    z15 = true;
                }
                if (z16) {
                    d0VarA2 = d0.a(j14);
                } else {
                    if (h0Var2 != null) {
                        localDatePlusDays.getClass();
                        if (j23.g.a.a(h0Var2, localDatePlusDays) == z15) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        d0VarA = d0.a(j8);
                    } else {
                        d0VarA = d0.a(j8);
                    }
                    d0VarA2 = d0VarA;
                }
            }
            r rVarA2 = x2.a(r.S, gl.b.q(o0VarE, R.dimen.gauge_chart_size_small), gl.b.q(o0VarE, R.dimen.gauge_chart_size_small));
            objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                z18 = true;
                objQ = new dv0.n(1);
                o0VarE.K(objQ);
            } else {
                z18 = true;
            }
            r rVarC2 = v.c((e23.l) objQ, rVarA2, z18);
            i53.f fVarJ2 = i53.a.j(arrayList);
            if (dValueOf != null) {
                fValueOf = Float.valueOf((float) dValueOf.doubleValue());
            } else {
                fValueOf = null;
            }
            if (aVar != a.REPORT) {
                i19 = 8;
            } else {
                i19 = 4;
            }
            float f15 = i19;
            g6.f.a aVar4 = g6.f.f75994b;
            h0Var4 = h0Var5;
            o0Var = o0VarE;
            k.c(rVarC2, fVarJ2, fValueOf, d0VarA2, f15, z14 ? 3.0f : 0.0f, z3.f.c(-2116319568, new h(str2, eVar, strQ, strQ3, i14, h0Var, localDatePlusDays), o0VarE), o0Var, 12582912, 16);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        h0 h0Var6 = h0Var4;
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(eVar, i14, i15, localDate, h0Var, h0Var2, h0Var6, i16, i17);
        }
    }

    public static final void b(e eVar, ww0.l lVar, m mVar, int i14) {
        int i15;
        e eVar2;
        LocalDate localDate;
        Integer predictedCycleLength;
        Integer cycleDay;
        o0 o0VarE = mVar.E(336104450);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(lVar) : o0VarE.r(lVar) ? 32 : 16;
        }
        int iIntValue = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (lVar != null && (cycleDay = lVar.getCycleDay()) != null) {
                iIntValue = cycleDay.intValue();
            }
            int iIntValue2 = (lVar == null || (predictedCycleLength = lVar.getPredictedCycleLength()) == null) ? iIntValue : predictedCycleLength.intValue();
            if (lVar == null || (localDate = lVar.getStartDate()) == null) {
                localDate = new LocalDate();
            }
            eVar2 = eVar;
            a(eVar2, iIntValue, iIntValue2, localDate, lVar != null ? lVar.z() : null, lVar != null ? lVar.q() : null, lVar != null ? lVar.s() : null, o0VarE, (i15 & 14) | 2392064, 0);
        } else {
            eVar2 = eVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(eVar2, lVar, i14, 25);
        }
    }

    public static final void c(e eVar, ww0.n nVar, m mVar, int i14) {
        int i15;
        e eVar2;
        nVar.getClass();
        o0 o0VarE = mVar.E(1898529494);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(nVar) : o0VarE.r(nVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int iF = nVar.f();
            LocalDate startDate = nVar.getStartDate();
            if (startDate == null) {
                startDate = new LocalDate();
            }
            eVar2 = eVar;
            a(eVar2, 0, iF, startDate, nVar.m(), nVar.i(), null, o0VarE, (i15 & 14) | 294960, 64);
        } else {
            eVar2 = eVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(eVar2, nVar, i14, 24);
        }
    }
}
