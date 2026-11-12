package f10;

import a11.f0;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import c22.q3;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.material.timepicker.TimeModel;
import d53.t;
import d53.w;
import ds.e0;
import h4.r;
import i3.e5;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l72.c1;
import o13.u;
import org.joda.time.DateTimeConstants;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import p13.y;
import p3.d0;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import r82.p;

/* JADX INFO: loaded from: classes7.dex */
public final class m {
    @SuppressLint({"DefaultLocale"})
    public static final void a(r rVar, i53.c cVar, i53.c cVar2, int i14, int i15, e23.l lVar, e23.l lVar2, p3.m mVar, int i16) {
        r rVar2;
        o0 o0Var;
        n1 n1Var;
        n1 n1Var2;
        o0 o0VarE = mVar.E(-1047926582);
        int i17 = i16 | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.B(cVar2) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024) | (o0VarE.k(i15) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            o0VarE.G0();
            if ((i16 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            ArrayList arrayList = new ArrayList();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(0, o0VarE);
            }
            n1 n1Var3 = (n1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = e5.o(59, o0VarE);
            }
            n1 n1Var4 = (n1) objQ2;
            a.f67802a.getClass();
            z3.e eVar = a.f67803b;
            boolean z14 = ((((i17 & 896) ^ 384) > 256 && o0VarE.B(cVar2)) || (i17 & 384) == 256) | ((((i17 & 112) ^ 48) > 32 && o0VarE.B(cVar)) || (i17 & 48) == 32);
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                h hVar = new h(cVar, cVar2, lVar, n1Var4, n1Var3, 1);
                n1Var = n1Var4;
                n1Var2 = n1Var3;
                o0VarE.K(hVar);
                objQ3 = hVar;
            } else {
                n1Var2 = n1Var3;
                n1Var = n1Var4;
            }
            arrayList.add(new p(cVar, i14, null, null, eVar, 0.0f, false, false, null, null, (e23.l) objQ3, 1004, null));
            i53.c cVarE = i53.a.e(new j23.l(n1Var2.getIntValue(), n1Var.getIntValue()));
            ArrayList arrayList2 = new ArrayList(y.r(cVarE, 10));
            Iterator<E> it = cVarE.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                x0 x0Var = x0.f105818a;
                arrayList2.add(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1)));
            }
            arrayList.add(new p(i53.a.e(arrayList2), i15, null, null, null, 0.0f, false, false, null, null, lVar2, 1020, null));
            rVar2 = rVar;
            o0Var = o0VarE;
            r82.k.c(rVar2, i53.a.e(arrayList), o0Var, 6, 0);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            rVar2 = rVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(rVar2, cVar, cVar2, i14, i15, lVar, lVar2, i16, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0188  */
    /* JADX WARN: Code duplicated, block: B:106:0x0192  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x0120  */
    /* JADX WARN: Code duplicated, block: B:97:0x012a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0154  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(String str, i53.c<Integer> cVar, i53.c<Integer> cVar2, Long l14, String str2, String str3, e23.a<Unit> aVar, e23.l<? super Long, Unit> lVar, p3.m mVar, int i14, int i15) {
        int i16;
        String strQ;
        String str4;
        boolean z14;
        o0 o0Var;
        String str5;
        p2 p2VarI0;
        String str6;
        Object objQ;
        p3.m.a.C2565a c2565a;
        n1 n1Var;
        Object objQ2;
        n1 n1Var2;
        o13.p pVar;
        boolean z15;
        Object objQ3;
        int i17;
        int i18;
        str.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1816325707);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(cVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(l14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            if ((i15 & 16) == 0) {
                strQ = str2;
                int i19 = o0VarE.B(strQ) ? 16384 : 8192;
                i16 |= i19;
            } else {
                strQ = str2;
            }
            i16 |= i19;
        } else {
            strQ = str2;
        }
        int i24 = i15 & 32;
        if (i24 == 0) {
            if ((196608 & i14) == 0) {
                str4 = str3;
                i16 |= o0VarE.B(str4) ? 131072 : 65536;
            }
            if ((1572864 & i14) != 0) {
                if (o0VarE.r(aVar)) {
                    i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            }
            if ((12582912 & i14) == 0) {
                if (o0VarE.r(lVar)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i16 |= i17;
            }
            if ((4793491 & i16) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if ((i15 & 16) != 0) {
                        strQ = gl1.y.Q(o0VarE, R.string.lbl_ok);
                        i16 &= -57345;
                    }
                    if (i24 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    str4 = str6;
                } else {
                    o0VarE.e();
                    if ((i15 & 16) != 0) {
                        i16 &= -57345;
                    }
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = e5.o(0, o0VarE);
                }
                n1Var = (n1) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = e5.o(0, o0VarE);
                }
                n1Var2 = (n1) objQ2;
                if (l14 != null) {
                    long j8 = 60;
                    pVar = new o13.p(Integer.valueOf(((int) (l14.longValue() / j8)) % cVar.size()), Integer.valueOf(((int) (l14.longValue() % j8)) % 60));
                } else {
                    pVar = new o13.p(0, 0);
                }
                int iIntValue = ((Number) pVar.f128594a).intValue();
                int iIntValue2 = ((Number) pVar.f128595b).intValue();
                c1 c1Var = c1.f110940a;
                z3.e eVarC = z3.f.c(-1078207377, new k(cVar, cVar2, iIntValue, iIntValue2, n1Var, n1Var2, 1), o0VarE);
                z15 = (i16 & 29360128) == 8388608;
                objQ3 = o0VarE.q();
                if (z15 || objQ3 == c2565a) {
                    objQ3 = new e(lVar, n1Var, n1Var2, 0);
                    o0VarE.K(objQ3);
                }
                e23.a<Unit> aVar2 = (e23.a) objQ3;
                int i25 = i16 << 3;
                o0Var = o0VarE;
                String str7 = str4;
                c1Var.a(true, str, null, eVarC, null, strQ, false, false, aVar2, str7, aVar, o0Var, (i25 & 458752) | (i25 & 112) | 3078 | ((i16 << 12) & 1879048192), (i16 >> 18) & 14, 212);
                str5 = str7;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str5 = str4;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.l(str, cVar, cVar2, l14, strQ, str5, aVar, lVar, i14, i15);
            }
        }
        i16 |= 196608;
        str4 = str3;
        if ((1572864 & i14) != 0) {
            if (o0VarE.r(aVar)) {
                i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i18 = 524288;
            }
            i16 |= i18;
        }
        if ((12582912 & i14) == 0) {
            if (o0VarE.r(lVar)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i16 |= i17;
        }
        if ((4793491 & i16) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if ((i15 & 16) != 0) {
                    strQ = gl1.y.Q(o0VarE, R.string.lbl_ok);
                    i16 &= -57345;
                }
                if (i24 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                str4 = str6;
            } else {
                if ((i15 & 16) != 0) {
                    strQ = gl1.y.Q(o0VarE, R.string.lbl_ok);
                    i16 &= -57345;
                }
                if (i24 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                str4 = str6;
            }
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(0, o0VarE);
            }
            n1Var = (n1) objQ;
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = e5.o(0, o0VarE);
            }
            n1Var2 = (n1) objQ2;
            if (l14 != null) {
                long j14 = 60;
                pVar = new o13.p(Integer.valueOf(((int) (l14.longValue() / j14)) % cVar.size()), Integer.valueOf(((int) (l14.longValue() % j14)) % 60));
            } else {
                pVar = new o13.p(0, 0);
            }
            int iIntValue3 = ((Number) pVar.f128594a).intValue();
            int iIntValue4 = ((Number) pVar.f128595b).intValue();
            c1 c1Var2 = c1.f110940a;
            z3.e eVarC2 = z3.f.c(-1078207377, new k(cVar, cVar2, iIntValue3, iIntValue4, n1Var, n1Var2, 1), o0VarE);
            if ((i16 & 29360128) == 8388608) {
            }
            objQ3 = o0VarE.q();
            if (z15) {
                objQ3 = new e(lVar, n1Var, n1Var2, 0);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new e(lVar, n1Var, n1Var2, 0);
                o0VarE.K(objQ3);
            }
            e23.a<Unit> aVar3 = (e23.a) objQ3;
            int i26 = i16 << 3;
            o0Var = o0VarE;
            String str8 = str4;
            c1Var2.a(true, str, null, eVarC2, null, strQ, false, false, aVar3, str8, aVar, o0Var, (i26 & 458752) | (i26 & 112) | 3078 | ((i16 << 12) & 1879048192), (i16 >> 18) & 14, 212);
            str5 = str8;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str5 = str4;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.l(str, cVar, cVar2, l14, strQ, str5, aVar, lVar, i14, i15);
        }
    }

    @SuppressLint({"DefaultLocale"})
    public static final void c(r rVar, i53.c cVar, i53.c cVar2, int i14, int i15, e23.l lVar, e23.l lVar2, p3.m mVar, int i16) {
        r rVar2;
        o0 o0Var;
        n1 n1Var;
        n1 n1Var2;
        o0 o0VarE = mVar.E(-1473660062);
        int i17 = i16 | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.B(cVar2) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024) | (o0VarE.k(i15) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            ArrayList arrayList = new ArrayList();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(((Number) h0.b0(cVar2)).intValue(), o0VarE);
            }
            n1 n1Var3 = (n1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = e5.o(((Number) h0.m0(cVar2)).intValue(), o0VarE);
            }
            n1 n1Var4 = (n1) objQ2;
            a.f67802a.getClass();
            z3.e eVar = a.f67804c;
            boolean z14 = ((i17 & 896) == 256) | ((i17 & 112) == 32);
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                h hVar = new h(cVar, cVar2, lVar, n1Var4, n1Var3, 0);
                n1Var = n1Var4;
                n1Var2 = n1Var3;
                o0VarE.K(hVar);
                objQ3 = hVar;
            } else {
                n1Var2 = n1Var3;
                n1Var = n1Var4;
            }
            arrayList.add(new p(cVar, i14, null, null, eVar, 0.0f, false, false, null, null, (e23.l) objQ3, 1004, null));
            i53.c cVarE = i53.a.e(new j23.l(n1Var2.getIntValue(), n1Var.getIntValue()));
            ArrayList arrayList2 = new ArrayList(y.r(cVarE, 10));
            Iterator<E> it = cVarE.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                x0 x0Var = x0.f105818a;
                arrayList2.add(String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1)));
            }
            arrayList.add(new p(i53.a.e(arrayList2), i15, null, null, null, 0.0f, false, false, null, null, lVar2, 1020, null));
            rVar2 = rVar;
            o0Var = o0VarE;
            r82.k.c(rVar2, i53.a.e(arrayList), o0Var, 6, 0);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            rVar2 = rVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(rVar2, cVar, cVar2, i14, i15, lVar, lVar2, i16, 0);
        }
    }

    public static final void d(final String str, i53.c cVar, i53.c cVar2, final double d14, final e23.a aVar, final e23.l lVar, p3.m mVar, final int i14) {
        o0 o0Var;
        final i53.c cVar3;
        final i53.c cVar4;
        int i15;
        i53.c cVarE;
        i53.c cVarH;
        double dI;
        o0 o0VarE = mVar.E(1957670046);
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2) | SyslogConstants.LOG_LOCAL2 | (o0VarE.m(d14) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                i15 = i16 & (-1009);
                cVarE = i53.a.e(new j23.l(0, mg0.b.c() ? 130 : 80));
                cVarH = e0.h(0, 9);
            } else {
                o0VarE.e();
                i15 = i16 & (-1009);
                cVarE = cVar;
                cVarH = cVar2;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(((Number) h0.b0(cVarE)).intValue(), o0VarE);
            }
            n1 n1Var = (n1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = e5.o(((Number) h0.b0(cVarH)).intValue(), o0VarE);
            }
            n1 n1Var2 = (n1) objQ2;
            if (mg0.b.c()) {
                l3.f23124b.getClass();
                dI = l3.a.i(d14, q3.KILOMETER_PER_HOUR);
            } else {
                l3.f23124b.getClass();
                dI = l3.a.i(d14, q3.MILE_PER_HOUR);
            }
            double d15 = dI;
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
            DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0", decimalFormatSymbols);
            String strValueOf = String.valueOf(decimalFormatSymbols.getDecimalSeparator());
            String str2 = decimalFormat.format(d15);
            str2.getClass();
            List listW = w.W(str2, new String[]{strValueOf});
            ArrayList arrayList = new ArrayList();
            Iterator it = listW.iterator();
            while (it.hasNext()) {
                Integer numI = t.i((String) it.next());
                if (numI != null) {
                    arrayList.add(numI);
                }
            }
            int iIndexOf = cVarE.contains(arrayList.get(0)) ? cVarE.indexOf(arrayList.get(0)) : 0;
            int iIndexOf2 = cVarH.contains(arrayList.get(1)) ? cVarH.indexOf(arrayList.get(1)) : 0;
            c1 c1Var = c1.f110940a;
            cVar3 = cVarE;
            cVar4 = cVarH;
            z3.e eVarC = z3.f.c(1526607098, new k(cVarE, cVarH, iIndexOf, iIndexOf2, n1Var, n1Var2, 0), o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_ok);
            boolean z14 = (458752 & i15) == 131072;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == p3.m.a.f135155b) {
                objQ3 = new e(lVar, n1Var, n1Var2, 1);
                o0VarE.K(objQ3);
            }
            o0Var = o0VarE;
            c1Var.a(true, str, null, eVarC, null, strQ, false, false, (e23.a) objQ3, null, aVar, o0Var, ((i15 << 3) & 112) | 3078, (i15 >> 12) & 14, 724);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            cVar3 = cVar;
            cVar4 = cVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(str, cVar3, cVar4, d14, aVar, lVar, i14) { // from class: f10.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f67869a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i53.c f67870b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i53.c f67871c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ double f67872d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.a f67873e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.l f67874f;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    m.d(this.f67869a, this.f67870b, this.f67871c, this.f67872d, this.f67873e, this.f67874f, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void e(r rVar, final i53.c cVar, final i53.c cVar2, final i53.c cVar3, final int i14, final int i15, final int i16, String str, String str2, String str3, final e23.l lVar, final e23.l lVar2, final e23.l lVar3, p3.m mVar, final int i17) {
        o0 o0Var;
        final r rVar2;
        final String str4;
        final String str5;
        final String str6;
        r rVar3;
        String str7;
        String str8;
        String str9;
        o0 o0VarE = mVar.E(-1312370855);
        int i18 = i17 | 6 | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.B(cVar2) ? 256 : 128) | (o0VarE.B(cVar3) ? 2048 : 1024) | (o0VarE.k(i14) ? 16384 : 8192) | (o0VarE.k(i15) ? 131072 : 65536) | (o0VarE.k(i16) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 918552576;
        if (o0VarE.n(i18 & 1, (306783379 & i18) != 306783378)) {
            o0VarE.G0();
            if ((i17 & 1) == 0 || o0VarE.o0()) {
                rVar3 = r.S;
                str7 = ":";
                str8 = "";
                str9 = ":";
            } else {
                o0VarE.e();
                rVar3 = rVar;
                str7 = str;
                str9 = str2;
                str8 = str3;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            String str10 = str9;
            String str11 = str8;
            o0Var = o0VarE;
            rVar2 = rVar3;
            r82.k.c(rVar2, i53.a.a(new p(cVar, i14, null, null, z3.f.c(491425315, new as.p(str7, 21), o0VarE), 0.0f, false, false, null, null, lVar, 1004, null), new p(cVar2, i15, null, null, z3.f.c(-19586844, new as.p(str10, 22), o0VarE), 0.0f, false, false, null, null, lVar2, 1004, null), new p(cVar3, i16, null, null, z3.f.c(-530599003, new as.p(str11, 23), o0VarE), 0.0f, false, false, null, null, lVar3, 1004, null)), o0Var, 6, 0);
            str4 = str7;
            str5 = str10;
            str6 = str11;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            str4 = str;
            str5 = str2;
            str6 = str3;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(cVar, cVar2, cVar3, i14, i15, i16, str4, str5, str6, lVar, lVar2, lVar3, i17) { // from class: f10.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i53.c f67825b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i53.c f67826c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ i53.c f67827d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f67828e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f67829f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ int f67830g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ String f67831h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ String f67832i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ String f67833j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ e23.l f67834k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ e23.l f67835l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ e23.l f67836m;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    m.e(this.f67824a, this.f67825b, this.f67826c, this.f67827d, this.f67828e, this.f67829f, this.f67830g, this.f67831h, this.f67832i, this.f67833j, this.f67834k, this.f67835l, this.f67836m, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:105:0x0220  */
    /* JADX WARN: Code duplicated, block: B:108:0x022d  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:75:0x0111  */
    /* JADX WARN: Code duplicated, block: B:86:0x0199  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01db  */
    /* JADX WARN: Code duplicated, block: B:99:0x01eb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(String str, i53.c<Integer> cVar, i53.c<Integer> cVar2, i53.c<Integer> cVar3, Long l14, boolean z14, e23.l<? super Long, Unit> lVar, p3.m mVar, int i14, int i15) {
        String str2;
        int i16;
        boolean z15;
        int i17;
        int i18;
        boolean z16;
        o0 o0Var;
        String str3;
        boolean z17;
        p2 p2VarI0;
        String str4;
        boolean z18;
        Context context;
        Object objQ;
        p3.m.a.C2565a c2565a;
        n1 n1Var;
        Object objQ2;
        n1 n1Var2;
        Object objQ3;
        n1 n1Var3;
        String str5;
        Object objQ4;
        n1 n1Var4;
        boolean zR;
        Object objQ5;
        d0 d0VarF;
        u uVar;
        String str6;
        int i19;
        boolean z19;
        Object objQ6;
        boolean z24;
        Object objQ7;
        o0 o0VarE = mVar.E(-1728979755);
        int i24 = i15 & 1;
        if (i24 != 0) {
            i16 = i14 | 6;
            str2 = str;
        } else {
            str2 = str;
            i16 = i14 | (o0VarE.B(str2) ? 4 : 2);
        }
        int i25 = i16 | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.B(cVar2) ? 256 : 128) | (o0VarE.B(cVar3) ? 2048 : 1024) | (o0VarE.B(l14) ? 16384 : 8192);
        int i26 = i15 & 32;
        if (i26 == 0) {
            if ((i14 & 196608) == 0) {
                z15 = z14;
                i25 |= o0VarE.h(z15) ? 131072 : 65536;
            }
            if (o0VarE.r(lVar)) {
                i17 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i17 = 524288;
            }
            i18 = i25 | i17;
            if ((599187 & i18) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i18 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i24 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i26 != 0) {
                        z15 = false;
                    }
                } else {
                    o0VarE.e();
                    str4 = str2;
                }
                z18 = z15;
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = e5.o(0, o0VarE);
                }
                n1Var = (n1) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = e5.o(0, o0VarE);
                }
                n1Var2 = (n1) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = e5.o(0, o0VarE);
                }
                n1Var3 = (n1) objQ3;
                str5 = str4;
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = e5.o(0, o0VarE);
                }
                n1Var4 = (n1) objQ4;
                zR = o0VarE.r(context);
                objQ5 = o0VarE.q();
                if (zR || objQ5 == c2565a) {
                    objQ5 = new af0.e(context, n1Var, n1Var2, n1Var3);
                    o0VarE.K(objQ5);
                }
                d0VarF = p0.f((e23.a) objQ5);
                if (l14 != null || l14.longValue() <= 0) {
                    uVar = uVar;
                } else {
                    d0VarF = d0VarF;
                    long j8 = 60;
                    uVar = new u(Integer.valueOf(((int) (l14.longValue() / ((long) DateTimeConstants.SECONDS_PER_HOUR))) % cVar.size()), Integer.valueOf(((int) (l14.longValue() / j8)) % cVar2.size()), Integer.valueOf(((int) (l14.longValue() % j8)) % cVar3.size()));
                }
                int iIntValue = ((Number) uVar.f128605a).intValue();
                int iIntValue2 = ((Number) uVar.f128606b).intValue();
                int iIntValue3 = ((Number) uVar.f128607c).intValue();
                c1 c1Var = c1.f110940a;
                if (z18) {
                    str6 = (String) d0VarF.getF182175a();
                } else {
                    str6 = str5;
                }
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_done);
                String strQ2 = gl1.y.Q(o0VarE, R.string.common_cancel);
                z3.e eVarC = z3.f.c(1834484729, new j(cVar, cVar2, cVar3, iIntValue, iIntValue2, iIntValue3, n1Var, n1Var2, n1Var3, n1Var4), o0VarE);
                i19 = i18 & 3670016;
                if (i19 == 1048576) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objQ6 = o0VarE.q();
                if (z19 || objQ6 == c2565a) {
                    objQ6 = new f0(lVar, n1Var4, 5);
                    o0VarE.K(objQ6);
                }
                e23.a<Unit> aVar = (e23.a) objQ6;
                z24 = i19 == 1048576;
                objQ7 = o0VarE.q();
                if (z24 || objQ7 == c2565a) {
                    objQ7 = new e40.g(lVar, 22);
                    o0VarE.K(objQ7);
                }
                o0Var = o0VarE;
                c1Var.a(true, str6, null, eVarC, null, strQ, false, false, aVar, strQ2, (e23.a) objQ7, o0Var, 3078, 0, 212);
                str3 = str5;
                z17 = z18;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str3 = str2;
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(str3, cVar, cVar2, cVar3, l14, z17, lVar, i14, i15);
            }
        }
        i25 |= 196608;
        z15 = z14;
        if (o0VarE.r(lVar)) {
            i17 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        } else {
            i17 = 524288;
        }
        i18 = i25 | i17;
        if ((599187 & i18) != 599186) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i18 & 1, z16)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i24 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i26 != 0) {
                    z15 = false;
                }
            } else {
                if (i24 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i26 != 0) {
                    z15 = false;
                }
            }
            z18 = z15;
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(0, o0VarE);
            }
            n1Var = (n1) objQ;
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = e5.o(0, o0VarE);
            }
            n1Var2 = (n1) objQ2;
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = e5.o(0, o0VarE);
            }
            n1Var3 = (n1) objQ3;
            str5 = str4;
            objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = e5.o(0, o0VarE);
            }
            n1Var4 = (n1) objQ4;
            zR = o0VarE.r(context);
            objQ5 = o0VarE.q();
            if (zR) {
                objQ5 = new af0.e(context, n1Var, n1Var2, n1Var3);
                o0VarE.K(objQ5);
            } else {
                objQ5 = new af0.e(context, n1Var, n1Var2, n1Var3);
                o0VarE.K(objQ5);
            }
            d0VarF = p0.f((e23.a) objQ5);
            u uVar2 = l14 != null ? new u(0, 0, 0) : new u(0, 0, 0);
            uVar = uVar2;
            int iIntValue4 = ((Number) uVar.f128605a).intValue();
            int iIntValue5 = ((Number) uVar.f128606b).intValue();
            int iIntValue6 = ((Number) uVar.f128607c).intValue();
            c1 c1Var2 = c1.f110940a;
            if (z18) {
                str6 = (String) d0VarF.getF182175a();
            } else {
                str6 = str5;
            }
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_done);
            String strQ4 = gl1.y.Q(o0VarE, R.string.common_cancel);
            z3.e eVarC2 = z3.f.c(1834484729, new j(cVar, cVar2, cVar3, iIntValue4, iIntValue5, iIntValue6, n1Var, n1Var2, n1Var3, n1Var4), o0VarE);
            i19 = i18 & 3670016;
            if (i19 == 1048576) {
                z19 = true;
            } else {
                z19 = false;
            }
            objQ6 = o0VarE.q();
            if (z19) {
                objQ6 = new f0(lVar, n1Var4, 5);
                o0VarE.K(objQ6);
            } else {
                objQ6 = new f0(lVar, n1Var4, 5);
                o0VarE.K(objQ6);
            }
            e23.a<Unit> aVar2 = (e23.a) objQ6;
            if (i19 == 1048576) {
            }
            objQ7 = o0VarE.q();
            if (z24) {
                objQ7 = new e40.g(lVar, 22);
                o0VarE.K(objQ7);
            } else {
                objQ7 = new e40.g(lVar, 22);
                o0VarE.K(objQ7);
            }
            o0Var = o0VarE;
            c1Var2.a(true, str6, null, eVarC2, null, strQ3, false, false, aVar2, strQ4, (e23.a) objQ7, o0Var, 3078, 0, 212);
            str3 = str5;
            z17 = z18;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str3 = str2;
            z17 = z15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.n(str3, cVar, cVar2, cVar3, l14, z17, lVar, i14, i15);
        }
    }
}
