package rr0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h5.e0;
import java.util.List;
import l72.x0;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class u {
    public static final void a(Integer num, Integer num2, p3.m mVar, int i14, int i15) {
        Integer num3;
        int i16;
        Integer num4;
        int i17;
        Integer num5;
        o0 o0VarE = mVar.E(1032054865);
        int i18 = i15 & 1;
        if (i18 != 0) {
            i16 = i14 | 6;
            num3 = num;
        } else {
            num3 = num;
            i16 = (o0VarE.B(num3) ? 4 : 2) | i14;
        }
        int i19 = i15 & 2;
        if (i19 != 0) {
            i17 = i16 | 48;
            num4 = num2;
        } else {
            num4 = num2;
            i17 = i16 | (o0VarE.B(num4) ? 32 : 16);
        }
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            num5 = i18 != 0 ? null : num3;
            Integer num6 = i19 != 0 ? null : num4;
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            x00.a aVar = new x00.a(context);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(aVar2, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
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
            b0 b0Var = b0.f22601a;
            String strE = aVar.e();
            x0 x0Var = x0.f111346a;
            d92.b.f58625c.getClass();
            x0Var.e(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), z3.f.c(1073823586, new h(aVar, num5, strE, context, num6, 1), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
            o0VarE.g0(true);
            num4 = num6;
        } else {
            o0VarE.e();
            num5 = num3;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mg2.o(num5, num4, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    public static final void b(ir0.e eVar, DateTime dateTime, e23.l<? super DateTime, Unit> lVar, p3.m mVar, int i14) {
        boolean z14;
        lVar.getClass();
        o0 o0VarE = mVar.E(-255717826);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | (o0VarE.r(dateTime) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
            b0 b0Var = b0.f22601a;
            if (eVar == null || !eVar.m()) {
                z14 = true;
                o0VarE.C(-1885308783);
                d.f154198a.getClass();
                d(null, dateTime, null, false, null, null, d.f154199b, o0VarE, (i15 & 112) | 1572864, 61);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1885096278);
                d(eVar.f94793a, dateTime, null, false, null, null, z3.f.c(1729485459, new t(eVar, 1), o0VarE), o0VarE, (i15 & 112) | 1572864, 60);
                List<ir0.f> list = eVar.f94793a;
                List listG0 = list != null ? h0.G0(list) : null;
                boolean z15 = (i15 & 896) == 256;
                Object objQ = o0VarE.q();
                if (z15) {
                    objQ = new qe2.c(lVar, 14);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new qe2.c(lVar, 14);
                        o0VarE.K(objQ);
                    }
                }
                e(listG0, (e23.l) objQ, o0VarE, 0);
                o0VarE.g0(false);
                z14 = true;
            }
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(eVar, dateTime, lVar, i14, 25);
        }
    }

    public static final void c(ir0.e eVar, String str, DateTime dateTime, DateTime dateTime2, o13.p pVar, p3.m mVar, int i14) {
        int i15;
        eVar.getClass();
        o0 o0VarE = mVar.E(-1054934336);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(dateTime) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(dateTime2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(pVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15 >> 3;
            d(eVar.f94793a, dateTime, dateTime2, true, str, pVar, z3.f.c(-1567462031, new t(eVar, 0), o0VarE), o0VarE, (i16 & 896) | (i16 & 112) | 1575936 | ((i15 << 9) & 57344) | ((i15 << 3) & 458752), 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(eVar, str, dateTime, dateTime2, pVar, i14, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0135  */
    /* JADX WARN: Code duplicated, block: B:103:0x0163  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:90:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:95:0x0102  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
    public static final void d(List<ir0.f> list, DateTime dateTime, DateTime dateTime2, boolean z14, String str, o13.p<String, String> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, p3.m mVar, int i14, int i15) {
        int i16;
        DateTime dateTime3;
        int i17;
        boolean z15;
        int i18;
        int i19;
        int i24;
        int i25;
        o13.p<String, String> pVar3;
        int i26;
        boolean z16;
        o0 o0Var;
        List<ir0.f> list2;
        DateTime dateTime4;
        boolean z17;
        o13.p<String, String> pVar4;
        String str2;
        p2 p2VarI0;
        List<ir0.f> list3;
        DateTime dateTime5;
        boolean z18;
        String str3;
        Context context;
        String strJ;
        Object objQ;
        p3.m.a.C2565a c2565a;
        CustomBarChart customBarChart;
        Object objQ2;
        boolean z19;
        int i27;
        o0 o0VarE = mVar.E(-1027702107);
        int i28 = i15 & 1;
        if (i28 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(list) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        int i29 = i15 & 4;
        if (i29 == 0) {
            if ((i14 & 384) == 0) {
                dateTime3 = dateTime2;
                i16 |= o0VarE.r(dateTime3) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 16;
                if (i19 != 0) {
                    if ((i14 & 24576) == 0) {
                        if (o0VarE.B(str)) {
                            i24 = 16384;
                        } else {
                            i24 = 8192;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 32;
                    if (i25 != 0) {
                        if ((196608 & i14) == 0) {
                            pVar3 = pVar;
                            if (o0VarE.B(pVar3)) {
                                i26 = 131072;
                            } else {
                                i26 = 65536;
                            }
                            i16 |= i26;
                        }
                        if ((1572864 & i14) == 0) {
                            if (o0VarE.r(pVar2)) {
                                i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i27 = 524288;
                            }
                            i16 |= i27;
                        }
                        if ((599187 & i16) != 599186) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (o0VarE.n(i16 & 1, z16)) {
                            if (i28 != 0) {
                                list3 = null;
                            } else {
                                list3 = list;
                            }
                            if (i29 != 0) {
                                dateTime5 = null;
                            } else {
                                dateTime5 = dateTime3;
                            }
                            if (i17 != 0) {
                                z18 = false;
                            } else {
                                z18 = z15;
                            }
                            if (i19 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            x1 x1Var = p3.n.f135158a;
                            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                            x00.a aVar = new x00.a(context);
                            if (str3 == null) {
                                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 220767702, R.string.common_lbl_weekly_totals, o0VarE, false);
                            } else {
                                o0VarE.C(220767423);
                                o0VarE.g0(false);
                                strJ = str3;
                            }
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            c2565a = p3.m.a.f135155b;
                            if (objQ == c2565a) {
                                objQ = new CustomBarChart(context);
                                o0VarE.K(objQ);
                            }
                            customBarChart = (CustomBarChart) objQ;
                            objQ2 = o0VarE.q();
                            if (objQ2 == c2565a) {
                                z19 = z18;
                                objQ2 = new rz.a(customBarChart, new qr0.a(context, dateTime, dateTime5, z18, pVar3), new qr0.b(customBarChart, z19), new k00.j(customBarChart), null, null, 48, null);
                                o0VarE.K(objQ2);
                            } else {
                                z19 = z18;
                            }
                            qy0.d dVar = new qy0.d(customBarChart, (rz.a) objQ2, list3, aVar, 14);
                            list2 = list3;
                            o0Var = o0VarE;
                            m92.o.a(null, strJ, null, null, z3.f.c(2066222629, dVar, o0VarE), null, z3.f.c(-1544783961, new a3.d(pVar2, 29), o0VarE), o0Var, 1597440, 45);
                            dateTime4 = dateTime5;
                            str2 = str3;
                            z17 = z19;
                            pVar4 = pVar3;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            list2 = list;
                            dateTime4 = dateTime3;
                            z17 = z15;
                            pVar4 = pVar3;
                            str2 = str;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new da0.n(list2, dateTime, dateTime4, z17, str2, pVar4, pVar2, i14, i15);
                        }
                    }
                    i16 |= 196608;
                    pVar3 = pVar;
                    if ((1572864 & i14) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i27 = 524288;
                        }
                        i16 |= i27;
                    }
                    if ((599187 & i16) != 599186) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i16 & 1, z16)) {
                        if (i28 != 0) {
                            list3 = null;
                        } else {
                            list3 = list;
                        }
                        if (i29 != 0) {
                            dateTime5 = null;
                        } else {
                            dateTime5 = dateTime3;
                        }
                        if (i17 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i19 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        x1 x1Var2 = p3.n.f135158a;
                        context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                        x00.a aVar2 = new x00.a(context);
                        if (str3 == null) {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 220767702, R.string.common_lbl_weekly_totals, o0VarE, false);
                        } else {
                            o0VarE.C(220767423);
                            o0VarE.g0(false);
                            strJ = str3;
                        }
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new CustomBarChart(context);
                            o0VarE.K(objQ);
                        }
                        customBarChart = (CustomBarChart) objQ;
                        objQ2 = o0VarE.q();
                        if (objQ2 == c2565a) {
                            z19 = z18;
                            objQ2 = new rz.a(customBarChart, new qr0.a(context, dateTime, dateTime5, z18, pVar3), new qr0.b(customBarChart, z19), new k00.j(customBarChart), null, null, 48, null);
                            o0VarE.K(objQ2);
                        } else {
                            z19 = z18;
                        }
                        qy0.d dVar2 = new qy0.d(customBarChart, (rz.a) objQ2, list3, aVar2, 14);
                        list2 = list3;
                        o0Var = o0VarE;
                        m92.o.a(null, strJ, null, null, z3.f.c(2066222629, dVar2, o0VarE), null, z3.f.c(-1544783961, new a3.d(pVar2, 29), o0VarE), o0Var, 1597440, 45);
                        dateTime4 = dateTime5;
                        str2 = str3;
                        z17 = z19;
                        pVar4 = pVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        list2 = list;
                        dateTime4 = dateTime3;
                        z17 = z15;
                        pVar4 = pVar3;
                        str2 = str;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new da0.n(list2, dateTime, dateTime4, z17, str2, pVar4, pVar2, i14, i15);
                    }
                }
                i16 |= 24576;
                i25 = i15 & 32;
                if (i25 != 0) {
                    if ((196608 & i14) == 0) {
                        pVar3 = pVar;
                        if (o0VarE.B(pVar3)) {
                            i26 = 131072;
                        } else {
                            i26 = 65536;
                        }
                        i16 |= i26;
                    }
                    if ((1572864 & i14) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i27 = 524288;
                        }
                        i16 |= i27;
                    }
                    if ((599187 & i16) != 599186) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i16 & 1, z16)) {
                        if (i28 != 0) {
                            list3 = null;
                        } else {
                            list3 = list;
                        }
                        if (i29 != 0) {
                            dateTime5 = null;
                        } else {
                            dateTime5 = dateTime3;
                        }
                        if (i17 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i19 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        x1 x1Var3 = p3.n.f135158a;
                        context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                        x00.a aVar3 = new x00.a(context);
                        if (str3 == null) {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 220767702, R.string.common_lbl_weekly_totals, o0VarE, false);
                        } else {
                            o0VarE.C(220767423);
                            o0VarE.g0(false);
                            strJ = str3;
                        }
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new CustomBarChart(context);
                            o0VarE.K(objQ);
                        }
                        customBarChart = (CustomBarChart) objQ;
                        objQ2 = o0VarE.q();
                        if (objQ2 == c2565a) {
                            z19 = z18;
                            objQ2 = new rz.a(customBarChart, new qr0.a(context, dateTime, dateTime5, z18, pVar3), new qr0.b(customBarChart, z19), new k00.j(customBarChart), null, null, 48, null);
                            o0VarE.K(objQ2);
                        } else {
                            z19 = z18;
                        }
                        qy0.d dVar3 = new qy0.d(customBarChart, (rz.a) objQ2, list3, aVar3, 14);
                        list2 = list3;
                        o0Var = o0VarE;
                        m92.o.a(null, strJ, null, null, z3.f.c(2066222629, dVar3, o0VarE), null, z3.f.c(-1544783961, new a3.d(pVar2, 29), o0VarE), o0Var, 1597440, 45);
                        dateTime4 = dateTime5;
                        str2 = str3;
                        z17 = z19;
                        pVar4 = pVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        list2 = list;
                        dateTime4 = dateTime3;
                        z17 = z15;
                        pVar4 = pVar3;
                        str2 = str;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new da0.n(list2, dateTime, dateTime4, z17, str2, pVar4, pVar2, i14, i15);
                    }
                }
                i16 |= 196608;
                pVar3 = pVar;
                if ((1572864 & i14) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i27 = 524288;
                    }
                    i16 |= i27;
                }
                if ((599187 & i16) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i28 != 0) {
                        list3 = null;
                    } else {
                        list3 = list;
                    }
                    if (i29 != 0) {
                        dateTime5 = null;
                    } else {
                        dateTime5 = dateTime3;
                    }
                    if (i17 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i19 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i25 != 0) {
                        pVar3 = null;
                    }
                    x1 x1Var4 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    x00.a aVar4 = new x00.a(context);
                    if (str3 == null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 220767702, R.string.common_lbl_weekly_totals, o0VarE, false);
                    } else {
                        o0VarE.C(220767423);
                        o0VarE.g0(false);
                        strJ = str3;
                    }
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new CustomBarChart(context);
                        o0VarE.K(objQ);
                    }
                    customBarChart = (CustomBarChart) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        z19 = z18;
                        objQ2 = new rz.a(customBarChart, new qr0.a(context, dateTime, dateTime5, z18, pVar3), new qr0.b(customBarChart, z19), new k00.j(customBarChart), null, null, 48, null);
                        o0VarE.K(objQ2);
                    } else {
                        z19 = z18;
                    }
                    qy0.d dVar4 = new qy0.d(customBarChart, (rz.a) objQ2, list3, aVar4, 14);
                    list2 = list3;
                    o0Var = o0VarE;
                    m92.o.a(null, strJ, null, null, z3.f.c(2066222629, dVar4, o0VarE), null, z3.f.c(-1544783961, new a3.d(pVar2, 29), o0VarE), o0Var, 1597440, 45);
                    dateTime4 = dateTime5;
                    str2 = str3;
                    z17 = z19;
                    pVar4 = pVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    list2 = list;
                    dateTime4 = dateTime3;
                    z17 = z15;
                    pVar4 = pVar3;
                    str2 = str;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new da0.n(list2, dateTime, dateTime4, z17, str2, pVar4, pVar2, i14, i15);
                }
            }
            i16 |= 3072;
            z15 = z14;
            i19 = i15 & 16;
            if (i19 != 0) {
                if ((i14 & 24576) == 0) {
                    if (o0VarE.B(str)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 32;
                if (i25 != 0) {
                    if ((196608 & i14) == 0) {
                        pVar3 = pVar;
                        if (o0VarE.B(pVar3)) {
                            i26 = 131072;
                        } else {
                            i26 = 65536;
                        }
                        i16 |= i26;
                    }
                    if ((1572864 & i14) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i27 = 524288;
                        }
                        i16 |= i27;
                    }
                    if ((599187 & i16) != 599186) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i16 & 1, z16)) {
                        if (i28 != 0) {
                            list3 = null;
                        } else {
                            list3 = list;
                        }
                        if (i29 != 0) {
                            dateTime5 = null;
                        } else {
                            dateTime5 = dateTime3;
                        }
                        if (i17 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i19 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        x1 x1Var5 = p3.n.f135158a;
                        context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                        x00.a aVar5 = new x00.a(context);
                        if (str3 == null) {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 220767702, R.string.common_lbl_weekly_totals, o0VarE, false);
                        } else {
                            o0VarE.C(220767423);
                            o0VarE.g0(false);
                            strJ = str3;
                        }
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new CustomBarChart(context);
                            o0VarE.K(objQ);
                        }
                        customBarChart = (CustomBarChart) objQ;
                        objQ2 = o0VarE.q();
                        if (objQ2 == c2565a) {
                            z19 = z18;
                            objQ2 = new rz.a(customBarChart, new qr0.a(context, dateTime, dateTime5, z18, pVar3), new qr0.b(customBarChart, z19), new k00.j(customBarChart), null, null, 48, null);
                            o0VarE.K(objQ2);
                        } else {
                            z19 = z18;
                        }
                        qy0.d dVar5 = new qy0.d(customBarChart, (rz.a) objQ2, list3, aVar5, 14);
                        list2 = list3;
                        o0Var = o0VarE;
                        m92.o.a(null, strJ, null, null, z3.f.c(2066222629, dVar5, o0VarE), null, z3.f.c(-1544783961, new a3.d(pVar2, 29), o0VarE), o0Var, 1597440, 45);
                        dateTime4 = dateTime5;
                        str2 = str3;
                        z17 = z19;
                        pVar4 = pVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        list2 = list;
                        dateTime4 = dateTime3;
                        z17 = z15;
                        pVar4 = pVar3;
                        str2 = str;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new da0.n(list2, dateTime, dateTime4, z17, str2, pVar4, pVar2, i14, i15);
                    }
                }
                i16 |= 196608;
                pVar3 = pVar;
                if ((1572864 & i14) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i27 = 524288;
                    }
                    i16 |= i27;
                }
                if ((599187 & i16) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i28 != 0) {
                        list3 = null;
                    } else {
                        list3 = list;
                    }
                    if (i29 != 0) {
                        dateTime5 = null;
                    } else {
                        dateTime5 = dateTime3;
                    }
                    if (i17 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i19 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i25 != 0) {
                        pVar3 = null;
                    }
                    x1 x1Var6 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    x00.a aVar6 = new x00.a(context);
                    if (str3 == null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 220767702, R.string.common_lbl_weekly_totals, o0VarE, false);
                    } else {
                        o0VarE.C(220767423);
                        o0VarE.g0(false);
                        strJ = str3;
                    }
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new CustomBarChart(context);
                        o0VarE.K(objQ);
                    }
                    customBarChart = (CustomBarChart) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        z19 = z18;
                        objQ2 = new rz.a(customBarChart, new qr0.a(context, dateTime, dateTime5, z18, pVar3), new qr0.b(customBarChart, z19), new k00.j(customBarChart), null, null, 48, null);
                        o0VarE.K(objQ2);
                    } else {
                        z19 = z18;
                    }
                    qy0.d dVar6 = new qy0.d(customBarChart, (rz.a) objQ2, list3, aVar6, 14);
                    list2 = list3;
                    o0Var = o0VarE;
                    m92.o.a(null, strJ, null, null, z3.f.c(2066222629, dVar6, o0VarE), null, z3.f.c(-1544783961, new a3.d(pVar2, 29), o0VarE), o0Var, 1597440, 45);
                    dateTime4 = dateTime5;
                    str2 = str3;
                    z17 = z19;
                    pVar4 = pVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    list2 = list;
                    dateTime4 = dateTime3;
                    z17 = z15;
                    pVar4 = pVar3;
                    str2 = str;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new da0.n(list2, dateTime, dateTime4, z17, str2, pVar4, pVar2, i14, i15);
                }
            }
            i16 |= 24576;
            i25 = i15 & 32;
            if (i25 != 0) {
                if ((196608 & i14) == 0) {
                    pVar3 = pVar;
                    if (o0VarE.B(pVar3)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i16 |= i26;
                }
                if ((1572864 & i14) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i27 = 524288;
                    }
                    i16 |= i27;
                }
                if ((599187 & i16) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i28 != 0) {
                        list3 = null;
                    } else {
                        list3 = list;
                    }
                    if (i29 != 0) {
                        dateTime5 = null;
                    } else {
                        dateTime5 = dateTime3;
                    }
                    if (i17 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i19 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i25 != 0) {
                        pVar3 = null;
                    }
                    x1 x1Var7 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    x00.a aVar7 = new x00.a(context);
                    if (str3 == null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 220767702, R.string.common_lbl_weekly_totals, o0VarE, false);
                    } else {
                        o0VarE.C(220767423);
                        o0VarE.g0(false);
                        strJ = str3;
                    }
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new CustomBarChart(context);
                        o0VarE.K(objQ);
                    }
                    customBarChart = (CustomBarChart) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        z19 = z18;
                        objQ2 = new rz.a(customBarChart, new qr0.a(context, dateTime, dateTime5, z18, pVar3), new qr0.b(customBarChart, z19), new k00.j(customBarChart), null, null, 48, null);
                        o0VarE.K(objQ2);
                    } else {
                        z19 = z18;
                    }
                    qy0.d dVar7 = new qy0.d(customBarChart, (rz.a) objQ2, list3, aVar7, 14);
                    list2 = list3;
                    o0Var = o0VarE;
                    m92.o.a(null, strJ, null, null, z3.f.c(2066222629, dVar7, o0VarE), null, z3.f.c(-1544783961, new a3.d(pVar2, 29), o0VarE), o0Var, 1597440, 45);
                    dateTime4 = dateTime5;
                    str2 = str3;
                    z17 = z19;
                    pVar4 = pVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    list2 = list;
                    dateTime4 = dateTime3;
                    z17 = z15;
                    pVar4 = pVar3;
                    str2 = str;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new da0.n(list2, dateTime, dateTime4, z17, str2, pVar4, pVar2, i14, i15);
                }
            }
            i16 |= 196608;
            pVar3 = pVar;
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(pVar2)) {
                    i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i27 = 524288;
                }
                i16 |= i27;
            }
            if ((599187 & i16) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i28 != 0) {
                    list3 = null;
                } else {
                    list3 = list;
                }
                if (i29 != 0) {
                    dateTime5 = null;
                } else {
                    dateTime5 = dateTime3;
                }
                if (i17 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i19 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i25 != 0) {
                    pVar3 = null;
                }
                x1 x1Var8 = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                x00.a aVar8 = new x00.a(context);
                if (str3 == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 220767702, R.string.common_lbl_weekly_totals, o0VarE, false);
                } else {
                    o0VarE.C(220767423);
                    o0VarE.g0(false);
                    strJ = str3;
                }
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new CustomBarChart(context);
                    o0VarE.K(objQ);
                }
                customBarChart = (CustomBarChart) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    z19 = z18;
                    objQ2 = new rz.a(customBarChart, new qr0.a(context, dateTime, dateTime5, z18, pVar3), new qr0.b(customBarChart, z19), new k00.j(customBarChart), null, null, 48, null);
                    o0VarE.K(objQ2);
                } else {
                    z19 = z18;
                }
                qy0.d dVar8 = new qy0.d(customBarChart, (rz.a) objQ2, list3, aVar8, 14);
                list2 = list3;
                o0Var = o0VarE;
                m92.o.a(null, strJ, null, null, z3.f.c(2066222629, dVar8, o0VarE), null, z3.f.c(-1544783961, new a3.d(pVar2, 29), o0VarE), o0Var, 1597440, 45);
                dateTime4 = dateTime5;
                str2 = str3;
                z17 = z19;
                pVar4 = pVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                list2 = list;
                dateTime4 = dateTime3;
                z17 = z15;
                pVar4 = pVar3;
                str2 = str;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(list2, dateTime, dateTime4, z17, str2, pVar4, pVar2, i14, i15);
            }
        }
        i16 |= 384;
        dateTime3 = dateTime2;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            i19 = i15 & 16;
            if (i19 != 0) {
                if ((i14 & 24576) == 0) {
                    if (o0VarE.B(str)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 32;
                if (i25 != 0) {
                    if ((196608 & i14) == 0) {
                        pVar3 = pVar;
                        if (o0VarE.B(pVar3)) {
                            i26 = 131072;
                        } else {
                            i26 = 65536;
                        }
                        i16 |= i26;
                    }
                    if ((1572864 & i14) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i27 = 524288;
                        }
                        i16 |= i27;
                    }
                    if ((599187 & i16) != 599186) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i16 & 1, z16)) {
                        if (i28 != 0) {
                            list3 = null;
                        } else {
                            list3 = list;
                        }
                        if (i29 != 0) {
                            dateTime5 = null;
                        } else {
                            dateTime5 = dateTime3;
                        }
                        if (i17 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i19 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        x1 x1Var9 = p3.n.f135158a;
                        context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                        x00.a aVar9 = new x00.a(context);
                        if (str3 == null) {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 220767702, R.string.common_lbl_weekly_totals, o0VarE, false);
                        } else {
                            o0VarE.C(220767423);
                            o0VarE.g0(false);
                            strJ = str3;
                        }
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new CustomBarChart(context);
                            o0VarE.K(objQ);
                        }
                        customBarChart = (CustomBarChart) objQ;
                        objQ2 = o0VarE.q();
                        if (objQ2 == c2565a) {
                            z19 = z18;
                            objQ2 = new rz.a(customBarChart, new qr0.a(context, dateTime, dateTime5, z18, pVar3), new qr0.b(customBarChart, z19), new k00.j(customBarChart), null, null, 48, null);
                            o0VarE.K(objQ2);
                        } else {
                            z19 = z18;
                        }
                        qy0.d dVar9 = new qy0.d(customBarChart, (rz.a) objQ2, list3, aVar9, 14);
                        list2 = list3;
                        o0Var = o0VarE;
                        m92.o.a(null, strJ, null, null, z3.f.c(2066222629, dVar9, o0VarE), null, z3.f.c(-1544783961, new a3.d(pVar2, 29), o0VarE), o0Var, 1597440, 45);
                        dateTime4 = dateTime5;
                        str2 = str3;
                        z17 = z19;
                        pVar4 = pVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        list2 = list;
                        dateTime4 = dateTime3;
                        z17 = z15;
                        pVar4 = pVar3;
                        str2 = str;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new da0.n(list2, dateTime, dateTime4, z17, str2, pVar4, pVar2, i14, i15);
                    }
                }
                i16 |= 196608;
                pVar3 = pVar;
                if ((1572864 & i14) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i27 = 524288;
                    }
                    i16 |= i27;
                }
                if ((599187 & i16) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i28 != 0) {
                        list3 = null;
                    } else {
                        list3 = list;
                    }
                    if (i29 != 0) {
                        dateTime5 = null;
                    } else {
                        dateTime5 = dateTime3;
                    }
                    if (i17 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i19 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i25 != 0) {
                        pVar3 = null;
                    }
                    x1 x1Var10 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    x00.a aVar10 = new x00.a(context);
                    if (str3 == null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 220767702, R.string.common_lbl_weekly_totals, o0VarE, false);
                    } else {
                        o0VarE.C(220767423);
                        o0VarE.g0(false);
                        strJ = str3;
                    }
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new CustomBarChart(context);
                        o0VarE.K(objQ);
                    }
                    customBarChart = (CustomBarChart) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        z19 = z18;
                        objQ2 = new rz.a(customBarChart, new qr0.a(context, dateTime, dateTime5, z18, pVar3), new qr0.b(customBarChart, z19), new k00.j(customBarChart), null, null, 48, null);
                        o0VarE.K(objQ2);
                    } else {
                        z19 = z18;
                    }
                    qy0.d dVar10 = new qy0.d(customBarChart, (rz.a) objQ2, list3, aVar10, 14);
                    list2 = list3;
                    o0Var = o0VarE;
                    m92.o.a(null, strJ, null, null, z3.f.c(2066222629, dVar10, o0VarE), null, z3.f.c(-1544783961, new a3.d(pVar2, 29), o0VarE), o0Var, 1597440, 45);
                    dateTime4 = dateTime5;
                    str2 = str3;
                    z17 = z19;
                    pVar4 = pVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    list2 = list;
                    dateTime4 = dateTime3;
                    z17 = z15;
                    pVar4 = pVar3;
                    str2 = str;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new da0.n(list2, dateTime, dateTime4, z17, str2, pVar4, pVar2, i14, i15);
                }
            }
            i16 |= 24576;
            i25 = i15 & 32;
            if (i25 != 0) {
                if ((196608 & i14) == 0) {
                    pVar3 = pVar;
                    if (o0VarE.B(pVar3)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i16 |= i26;
                }
                if ((1572864 & i14) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i27 = 524288;
                    }
                    i16 |= i27;
                }
                if ((599187 & i16) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i28 != 0) {
                        list3 = null;
                    } else {
                        list3 = list;
                    }
                    if (i29 != 0) {
                        dateTime5 = null;
                    } else {
                        dateTime5 = dateTime3;
                    }
                    if (i17 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i19 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i25 != 0) {
                        pVar3 = null;
                    }
                    x1 x1Var11 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    x00.a aVar11 = new x00.a(context);
                    if (str3 == null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 220767702, R.string.common_lbl_weekly_totals, o0VarE, false);
                    } else {
                        o0VarE.C(220767423);
                        o0VarE.g0(false);
                        strJ = str3;
                    }
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new CustomBarChart(context);
                        o0VarE.K(objQ);
                    }
                    customBarChart = (CustomBarChart) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        z19 = z18;
                        objQ2 = new rz.a(customBarChart, new qr0.a(context, dateTime, dateTime5, z18, pVar3), new qr0.b(customBarChart, z19), new k00.j(customBarChart), null, null, 48, null);
                        o0VarE.K(objQ2);
                    } else {
                        z19 = z18;
                    }
                    qy0.d dVar11 = new qy0.d(customBarChart, (rz.a) objQ2, list3, aVar11, 14);
                    list2 = list3;
                    o0Var = o0VarE;
                    m92.o.a(null, strJ, null, null, z3.f.c(2066222629, dVar11, o0VarE), null, z3.f.c(-1544783961, new a3.d(pVar2, 29), o0VarE), o0Var, 1597440, 45);
                    dateTime4 = dateTime5;
                    str2 = str3;
                    z17 = z19;
                    pVar4 = pVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    list2 = list;
                    dateTime4 = dateTime3;
                    z17 = z15;
                    pVar4 = pVar3;
                    str2 = str;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new da0.n(list2, dateTime, dateTime4, z17, str2, pVar4, pVar2, i14, i15);
                }
            }
            i16 |= 196608;
            pVar3 = pVar;
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(pVar2)) {
                    i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i27 = 524288;
                }
                i16 |= i27;
            }
            if ((599187 & i16) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i28 != 0) {
                    list3 = null;
                } else {
                    list3 = list;
                }
                if (i29 != 0) {
                    dateTime5 = null;
                } else {
                    dateTime5 = dateTime3;
                }
                if (i17 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i19 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i25 != 0) {
                    pVar3 = null;
                }
                x1 x1Var12 = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                x00.a aVar12 = new x00.a(context);
                if (str3 == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 220767702, R.string.common_lbl_weekly_totals, o0VarE, false);
                } else {
                    o0VarE.C(220767423);
                    o0VarE.g0(false);
                    strJ = str3;
                }
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new CustomBarChart(context);
                    o0VarE.K(objQ);
                }
                customBarChart = (CustomBarChart) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    z19 = z18;
                    objQ2 = new rz.a(customBarChart, new qr0.a(context, dateTime, dateTime5, z18, pVar3), new qr0.b(customBarChart, z19), new k00.j(customBarChart), null, null, 48, null);
                    o0VarE.K(objQ2);
                } else {
                    z19 = z18;
                }
                qy0.d dVar12 = new qy0.d(customBarChart, (rz.a) objQ2, list3, aVar12, 14);
                list2 = list3;
                o0Var = o0VarE;
                m92.o.a(null, strJ, null, null, z3.f.c(2066222629, dVar12, o0VarE), null, z3.f.c(-1544783961, new a3.d(pVar2, 29), o0VarE), o0Var, 1597440, 45);
                dateTime4 = dateTime5;
                str2 = str3;
                z17 = z19;
                pVar4 = pVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                list2 = list;
                dateTime4 = dateTime3;
                z17 = z15;
                pVar4 = pVar3;
                str2 = str;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(list2, dateTime, dateTime4, z17, str2, pVar4, pVar2, i14, i15);
            }
        }
        i16 |= 3072;
        z15 = z14;
        i19 = i15 & 16;
        if (i19 != 0) {
            if ((i14 & 24576) == 0) {
                if (o0VarE.B(str)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i16 |= i24;
            }
            i25 = i15 & 32;
            if (i25 != 0) {
                if ((196608 & i14) == 0) {
                    pVar3 = pVar;
                    if (o0VarE.B(pVar3)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i16 |= i26;
                }
                if ((1572864 & i14) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i27 = 524288;
                    }
                    i16 |= i27;
                }
                if ((599187 & i16) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i28 != 0) {
                        list3 = null;
                    } else {
                        list3 = list;
                    }
                    if (i29 != 0) {
                        dateTime5 = null;
                    } else {
                        dateTime5 = dateTime3;
                    }
                    if (i17 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i19 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i25 != 0) {
                        pVar3 = null;
                    }
                    x1 x1Var13 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    x00.a aVar13 = new x00.a(context);
                    if (str3 == null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 220767702, R.string.common_lbl_weekly_totals, o0VarE, false);
                    } else {
                        o0VarE.C(220767423);
                        o0VarE.g0(false);
                        strJ = str3;
                    }
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new CustomBarChart(context);
                        o0VarE.K(objQ);
                    }
                    customBarChart = (CustomBarChart) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        z19 = z18;
                        objQ2 = new rz.a(customBarChart, new qr0.a(context, dateTime, dateTime5, z18, pVar3), new qr0.b(customBarChart, z19), new k00.j(customBarChart), null, null, 48, null);
                        o0VarE.K(objQ2);
                    } else {
                        z19 = z18;
                    }
                    qy0.d dVar13 = new qy0.d(customBarChart, (rz.a) objQ2, list3, aVar13, 14);
                    list2 = list3;
                    o0Var = o0VarE;
                    m92.o.a(null, strJ, null, null, z3.f.c(2066222629, dVar13, o0VarE), null, z3.f.c(-1544783961, new a3.d(pVar2, 29), o0VarE), o0Var, 1597440, 45);
                    dateTime4 = dateTime5;
                    str2 = str3;
                    z17 = z19;
                    pVar4 = pVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    list2 = list;
                    dateTime4 = dateTime3;
                    z17 = z15;
                    pVar4 = pVar3;
                    str2 = str;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new da0.n(list2, dateTime, dateTime4, z17, str2, pVar4, pVar2, i14, i15);
                }
            }
            i16 |= 196608;
            pVar3 = pVar;
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(pVar2)) {
                    i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i27 = 524288;
                }
                i16 |= i27;
            }
            if ((599187 & i16) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i28 != 0) {
                    list3 = null;
                } else {
                    list3 = list;
                }
                if (i29 != 0) {
                    dateTime5 = null;
                } else {
                    dateTime5 = dateTime3;
                }
                if (i17 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i19 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i25 != 0) {
                    pVar3 = null;
                }
                x1 x1Var14 = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                x00.a aVar14 = new x00.a(context);
                if (str3 == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 220767702, R.string.common_lbl_weekly_totals, o0VarE, false);
                } else {
                    o0VarE.C(220767423);
                    o0VarE.g0(false);
                    strJ = str3;
                }
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new CustomBarChart(context);
                    o0VarE.K(objQ);
                }
                customBarChart = (CustomBarChart) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    z19 = z18;
                    objQ2 = new rz.a(customBarChart, new qr0.a(context, dateTime, dateTime5, z18, pVar3), new qr0.b(customBarChart, z19), new k00.j(customBarChart), null, null, 48, null);
                    o0VarE.K(objQ2);
                } else {
                    z19 = z18;
                }
                qy0.d dVar14 = new qy0.d(customBarChart, (rz.a) objQ2, list3, aVar14, 14);
                list2 = list3;
                o0Var = o0VarE;
                m92.o.a(null, strJ, null, null, z3.f.c(2066222629, dVar14, o0VarE), null, z3.f.c(-1544783961, new a3.d(pVar2, 29), o0VarE), o0Var, 1597440, 45);
                dateTime4 = dateTime5;
                str2 = str3;
                z17 = z19;
                pVar4 = pVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                list2 = list;
                dateTime4 = dateTime3;
                z17 = z15;
                pVar4 = pVar3;
                str2 = str;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(list2, dateTime, dateTime4, z17, str2, pVar4, pVar2, i14, i15);
            }
        }
        i16 |= 24576;
        i25 = i15 & 32;
        if (i25 != 0) {
            if ((196608 & i14) == 0) {
                pVar3 = pVar;
                if (o0VarE.B(pVar3)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i16 |= i26;
            }
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(pVar2)) {
                    i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i27 = 524288;
                }
                i16 |= i27;
            }
            if ((599187 & i16) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i28 != 0) {
                    list3 = null;
                } else {
                    list3 = list;
                }
                if (i29 != 0) {
                    dateTime5 = null;
                } else {
                    dateTime5 = dateTime3;
                }
                if (i17 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i19 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i25 != 0) {
                    pVar3 = null;
                }
                x1 x1Var15 = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                x00.a aVar15 = new x00.a(context);
                if (str3 == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 220767702, R.string.common_lbl_weekly_totals, o0VarE, false);
                } else {
                    o0VarE.C(220767423);
                    o0VarE.g0(false);
                    strJ = str3;
                }
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new CustomBarChart(context);
                    o0VarE.K(objQ);
                }
                customBarChart = (CustomBarChart) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    z19 = z18;
                    objQ2 = new rz.a(customBarChart, new qr0.a(context, dateTime, dateTime5, z18, pVar3), new qr0.b(customBarChart, z19), new k00.j(customBarChart), null, null, 48, null);
                    o0VarE.K(objQ2);
                } else {
                    z19 = z18;
                }
                qy0.d dVar15 = new qy0.d(customBarChart, (rz.a) objQ2, list3, aVar15, 14);
                list2 = list3;
                o0Var = o0VarE;
                m92.o.a(null, strJ, null, null, z3.f.c(2066222629, dVar15, o0VarE), null, z3.f.c(-1544783961, new a3.d(pVar2, 29), o0VarE), o0Var, 1597440, 45);
                dateTime4 = dateTime5;
                str2 = str3;
                z17 = z19;
                pVar4 = pVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                list2 = list;
                dateTime4 = dateTime3;
                z17 = z15;
                pVar4 = pVar3;
                str2 = str;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(list2, dateTime, dateTime4, z17, str2, pVar4, pVar2, i14, i15);
            }
        }
        i16 |= 196608;
        pVar3 = pVar;
        if ((1572864 & i14) == 0) {
            if (o0VarE.r(pVar2)) {
                i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i27 = 524288;
            }
            i16 |= i27;
        }
        if ((599187 & i16) != 599186) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i28 != 0) {
                list3 = null;
            } else {
                list3 = list;
            }
            if (i29 != 0) {
                dateTime5 = null;
            } else {
                dateTime5 = dateTime3;
            }
            if (i17 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            if (i19 != 0) {
                str3 = null;
            } else {
                str3 = str;
            }
            if (i25 != 0) {
                pVar3 = null;
            }
            x1 x1Var16 = p3.n.f135158a;
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            x00.a aVar16 = new x00.a(context);
            if (str3 == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 220767702, R.string.common_lbl_weekly_totals, o0VarE, false);
            } else {
                o0VarE.C(220767423);
                o0VarE.g0(false);
                strJ = str3;
            }
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomBarChart(context);
                o0VarE.K(objQ);
            }
            customBarChart = (CustomBarChart) objQ;
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                z19 = z18;
                objQ2 = new rz.a(customBarChart, new qr0.a(context, dateTime, dateTime5, z18, pVar3), new qr0.b(customBarChart, z19), new k00.j(customBarChart), null, null, 48, null);
                o0VarE.K(objQ2);
            } else {
                z19 = z18;
            }
            qy0.d dVar16 = new qy0.d(customBarChart, (rz.a) objQ2, list3, aVar16, 14);
            list2 = list3;
            o0Var = o0VarE;
            m92.o.a(null, strJ, null, null, z3.f.c(2066222629, dVar16, o0VarE), null, z3.f.c(-1544783961, new a3.d(pVar2, 29), o0VarE), o0Var, 1597440, 45);
            dateTime4 = dateTime5;
            str2 = str3;
            z17 = z19;
            pVar4 = pVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            list2 = list;
            dateTime4 = dateTime3;
            z17 = z15;
            pVar4 = pVar3;
            str2 = str;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.n(list2, dateTime, dateTime4, z17, str2, pVar4, pVar2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x017d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(List<ir0.f> list, e23.l<? super DateTime, Unit> lVar, p3.m mVar, int i14) {
        c42.e0 e0Var;
        p2 p2VarI0;
        int i15;
        String strD;
        Object obj;
        o0 o0VarE = mVar.E(-488722216);
        int i16 = 32;
        int i17 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        int i18 = 1;
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (list == null || list.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    e0Var = new c42.e0(lVar, i14, 21, list);
                }
            } else {
                x00.a aVar = new x00.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                h4.r rVarE = u1.n.e(h4.r.S, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                float f15 = eVar.f97920e;
                bVar.getClass();
                float f16 = eVar.f97918c;
                bVar.getClass();
                bVar.getClass();
                h4.r rVarB = c2.l.B(rVarE, f14, f16, f15, f15);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarB, o0VarE);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                o0VarE.C(130802412);
                for (ir0.f fVar : list) {
                    LocalDate localDateB = fVar.b();
                    DateTime dateTimeAtStartOfDay = localDateB != null ? localDateB.toDateTimeAtStartOfDay() : null;
                    if (dateTimeAtStartOfDay != null) {
                        o0VarE.C(2125220981);
                        Integer numG = oe2.f.g(fVar.f94797b, fVar.f());
                        DateTime dateTimePlusDays = dateTimeAtStartOfDay.plusDays(6);
                        dateTimePlusDays.getClass();
                        String strL = aVar.f188234b.l(dateTimeAtStartOfDay, dateTimePlusDays, pi0.f.SHORT_MONTH_NO_WEEKDAY);
                        if (numG == null || (strD = String.valueOf(numG.intValue())) == null) {
                            strD = aVar.d();
                        }
                        String strA = aVar.f188233a.a(R.string.lbl_step_details_percent_of_goal, strD);
                        z3.e eVarC = z3.f.c(1495083011, new o72.b(29, aVar, fVar), o0VarE);
                        h4.r.a aVar3 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarA = c2.l.A(aVar3, 0.0f, j92.b.f97899b.f97918c, i18);
                        int i19 = ((i17 & 112) == i16 ? i18 : 0) | (o0VarE.r(dateTimeAtStartOfDay) ? 1 : 0);
                        Object objQ = o0VarE.q();
                        if (i19 == 0) {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                obj = objQ;
                                Object eVar2 = new ci0.e(lVar, dateTimeAtStartOfDay, 8);
                                o0VarE.K(eVar2);
                                obj = eVar2;
                            }
                        } else {
                            obj = objQ;
                            Object eVar3 = new ci0.e(lVar, dateTimeAtStartOfDay, 8);
                            o0VarE.K(eVar3);
                            obj = eVar3;
                        }
                        obj = objQ;
                        i15 = i18;
                        l72.l.d(strL, strA, eVarC, rVarA, null, false, (e23.a) obj, o0VarE, 384, 48);
                        o0VarE.g0(false);
                    } else {
                        i15 = i18;
                        o0VarE.C(2126907536);
                        o0VarE.g0(false);
                    }
                    i18 = i15;
                    aVar = aVar;
                    i16 = 32;
                }
                o0VarE.g0(false);
                o0VarE.g0(i18);
                x1 x1Var2 = p3.n.f135158a;
            }
            p2VarI0.f135219d = e0Var;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            e0Var = new c42.e0(lVar, i14, 22, list);
            p2VarI0.f135219d = e0Var;
        }
    }
}
