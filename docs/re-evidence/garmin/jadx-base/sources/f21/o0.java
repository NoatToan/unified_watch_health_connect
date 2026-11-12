package f21;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.n9;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.koin.java.KoinJavaComponent;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i53.f<m92.h0.e.a> f68603a = i53.a.a(new m92.h0.e.a(0.0f, 1700.0f), new m92.h0.e.a(1.0f, 2200.0f), new m92.h0.e.a(2.0f, 2200.0f), new m92.h0.e.a(3.0f, 2100.0f), new m92.h0.e.a(4.0f, 100.0f), new m92.h0.e.a(5.0f, 0.0f), new m92.h0.e.a(6.0f, 1986.0f), new m92.h0.e.a(7.0f, 1700.0f), new m92.h0.e.a(8.0f, 2200.0f), new m92.h0.e.a(9.0f, 2200.0f), new m92.h0.e.a(10.0f, 2100.0f), new m92.h0.e.a(11.0f, 100.0f), new m92.h0.e.a(12.0f, 0.0f), new m92.h0.e.a(13.0f, 1986.0f), new m92.h0.e.a(14.0f, 1700.0f), new m92.h0.e.a(15.0f, 2200.0f), new m92.h0.e.a(16.0f, 2200.0f), new m92.h0.e.a(17.0f, 2100.0f), new m92.h0.e.a(18.0f, 100.0f), new m92.h0.e.a(19.0f, 0.0f), new m92.h0.e.a(20.0f, 1986.0f), new m92.h0.e.a(21.0f, 1700.0f), new m92.h0.e.a(22.0f, 2200.0f), new m92.h0.e.a(23.0f, 2200.0f), new m92.h0.e.a(24.0f, 2100.0f), new m92.h0.e.a(25.0f, 100.0f), new m92.h0.e.a(26.0f, 0.0f), new m92.h0.e.a(27.0f, 1986.0f), new m92.h0.e.a(28.0f, 1700.0f), new m92.h0.e.a(29.0f, 2200.0f), new m92.h0.e.a(30.0f, 2200.0f), new m92.h0.e.a(31.0f, 2100.0f), new m92.h0.e.a(32.0f, 100.0f), new m92.h0.e.a(33.0f, 0.0f), new m92.h0.e.a(34.0f, 1986.0f), new m92.h0.e.a(35.0f, 1700.0f), new m92.h0.e.a(36.0f, 2200.0f), new m92.h0.e.a(37.0f, 2200.0f), new m92.h0.e.a(38.0f, 2100.0f), new m92.h0.e.a(39.0f, 100.0f), new m92.h0.e.a(40.0f, 0.0f), new m92.h0.e.a(41.0f, 1986.0f), new m92.h0.e.a(42.0f, 1700.0f), new m92.h0.e.a(43.0f, 2200.0f), new m92.h0.e.a(44.0f, 2200.0f), new m92.h0.e.a(45.0f, 2100.0f), new m92.h0.e.a(46.0f, 100.0f), new m92.h0.e.a(47.0f, 0.0f), new m92.h0.e.a(48.0f, 1986.0f), new m92.h0.e.a(49.0f, 1700.0f), new m92.h0.e.a(50.0f, 2200.0f), new m92.h0.e.a(51.0f, 2200.0f), new m92.h0.e.a(52.0f, 2100.0f));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i53.f<m92.h0.e.a> f68604b = i53.a.a(new m92.h0.e.a(0.0f, 500.0f), new m92.h0.e.a(1.0f, 800.0f), new m92.h0.e.a(2.0f, 1200.0f), new m92.h0.e.a(3.0f, 750.0f), new m92.h0.e.a(4.0f, 750.0f), new m92.h0.e.a(5.0f, 946.0f), new m92.h0.e.a(6.0f, 1834.0f), new m92.h0.e.a(7.0f, 500.0f), new m92.h0.e.a(8.0f, 800.0f), new m92.h0.e.a(9.0f, 1200.0f), new m92.h0.e.a(10.0f, 750.0f), new m92.h0.e.a(11.0f, 750.0f), new m92.h0.e.a(12.0f, 946.0f), new m92.h0.e.a(13.0f, 1834.0f), new m92.h0.e.a(14.0f, 500.0f), new m92.h0.e.a(15.0f, 800.0f), new m92.h0.e.a(16.0f, 1200.0f), new m92.h0.e.a(17.0f, 750.0f), new m92.h0.e.a(18.0f, 750.0f), new m92.h0.e.a(19.0f, 946.0f), new m92.h0.e.a(20.0f, 1834.0f), new m92.h0.e.a(21.0f, 500.0f), new m92.h0.e.a(22.0f, 800.0f), new m92.h0.e.a(23.0f, 1200.0f), new m92.h0.e.a(24.0f, 750.0f), new m92.h0.e.a(25.0f, 750.0f), new m92.h0.e.a(26.0f, 946.0f), new m92.h0.e.a(27.0f, 1834.0f), new m92.h0.e.a(28.0f, 500.0f), new m92.h0.e.a(29.0f, 800.0f), new m92.h0.e.a(30.0f, 1200.0f), new m92.h0.e.a(31.0f, 750.0f), new m92.h0.e.a(32.0f, 750.0f), new m92.h0.e.a(33.0f, 946.0f), new m92.h0.e.a(34.0f, 1834.0f), new m92.h0.e.a(35.0f, 500.0f), new m92.h0.e.a(36.0f, 800.0f), new m92.h0.e.a(37.0f, 1200.0f), new m92.h0.e.a(38.0f, 750.0f), new m92.h0.e.a(39.0f, 750.0f), new m92.h0.e.a(40.0f, 946.0f), new m92.h0.e.a(41.0f, 1834.0f), new m92.h0.e.a(42.0f, 500.0f), new m92.h0.e.a(43.0f, 800.0f), new m92.h0.e.a(44.0f, 1200.0f), new m92.h0.e.a(45.0f, 750.0f), new m92.h0.e.a(46.0f, 750.0f), new m92.h0.e.a(47.0f, 946.0f), new m92.h0.e.a(48.0f, 1834.0f), new m92.h0.e.a(49.0f, 500.0f), new m92.h0.e.a(50.0f, 800.0f), new m92.h0.e.a(51.0f, 1200.0f), new m92.h0.e.a(52.0f, 750.0f));

    /* JADX WARN: Code duplicated, block: B:96:0x019e  */
    public static final void a(b63.o oVar, b63.o oVar2, boolean z14, i53.f fVar, g21.v vVar, i53.f fVar2, pi0.e eVar, p3.m mVar, int i14) {
        int i15;
        b63.o oVar3;
        Double dValueOf;
        oVar.getClass();
        oVar2.getClass();
        fVar.getClass();
        fVar2.getClass();
        p3.o0 o0VarE = mVar.E(944353701);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(oVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            oVar3 = oVar2;
            i15 |= o0VarE.r(oVar3) ? 32 : 16;
        } else {
            oVar3 = oVar2;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(fVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.k(vVar == null ? -1 : vVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= (262144 & i14) == 0 ? o0VarE.B(fVar2) : o0VarE.r(fVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= (2097152 & i14) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            char c14 = 6;
            if (objQ == p3.m.a.f135155b) {
                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                o0VarE.K(objQ);
            }
            v21.e eVar2 = (v21.e) objQ;
            DateTime dateTimeK = vb.h.k(oVar);
            DateTime dateTimeK2 = vb.h.k(oVar3);
            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMM");
            dateTimeFormatterForPattern.getClass();
            List<String> listE = c02.a.e(dateTimeK, dateTimeK2, dateTimeFormatterForPattern);
            ArrayList arrayList = new ArrayList(p13.y.r(fVar, 10));
            Iterator<E> it = fVar.iterator();
            while (it.hasNext()) {
                char c15 = c14;
                k01.k kVar = ((k01.l) it.next()).f102096c;
                arrayList.add(kVar != null ? kVar.f102072a : null);
                c14 = c15;
            }
            i53.f<m92.h0.e.a> fVarG = c02.a.g(i53.a.e(arrayList));
            ArrayList arrayList2 = new ArrayList(p13.y.r(fVar, 10));
            Iterator<E> it3 = fVar.iterator();
            while (it3.hasNext()) {
                k01.k kVar2 = ((k01.l) it3.next()).f102097d;
                arrayList2.add(kVar2 != null ? kVar2.f102072a : null);
            }
            i53.f<m92.h0.e.a> fVarG2 = c02.a.g(i53.a.e(arrayList2));
            ArrayList arrayList3 = new ArrayList(p13.y.r(fVar2, 10));
            Iterator<E> it4 = fVar2.iterator();
            while (it4.hasNext()) {
                l42.f fVar3 = (l42.f) it4.next();
                if (fVar3 != null) {
                    v21.f fVar4 = v21.f.f175333a;
                    l42.g weightAverageDto = fVar3.getWeightAverageDto();
                    fVar4.getClass();
                    double dQ = v21.f.q(weightAverageDto, vVar);
                    if (Double.isNaN(dQ)) {
                        dValueOf = null;
                    } else {
                        dValueOf = Double.valueOf(dQ);
                    }
                } else {
                    dValueOf = null;
                }
                arrayList3.add(dValueOf);
            }
            i53.f<m92.h0.e.a> fVarG3 = c02.a.g(i53.a.e(arrayList3));
            v21.f.f175333a.getClass();
            b(oVar, fVarG, fVarG2, fVarG3, vVar, z14, v21.f.A(oVar, oVar2) + 1, listE, eVar, eVar2, o0VarE, (57358 & i15) | ((i15 << 9) & 458752) | 134217728 | ((i15 << 6) & 234881024));
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(oVar, oVar3, z14, fVar, vVar, fVar2, eVar, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(b63.o oVar, i53.f fVar, i53.f fVar2, i53.f fVar3, g21.v vVar, boolean z14, int i14, List list, pi0.e eVar, v21.e eVar2, p3.m mVar, int i15) {
        int i16;
        p3.o0 o0Var;
        o4.d0 d0VarA;
        boolean z15;
        boolean z16;
        e23.l lVar;
        boolean z17;
        e23.l lVarE;
        i53.f fVarB;
        p3.o0 o0VarE = mVar.E(-791022341);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.r(oVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= (i15 & 512) == 0 ? o0VarE.B(fVar2) : o0VarE.r(fVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= (i15 & 4096) == 0 ? o0VarE.B(fVar3) : o0VarE.r(fVar3) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.k(vVar == null ? -1 : vVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i16 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            i16 |= o0VarE.k(i14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i15) == 0) {
            i16 |= o0VarE.r(list) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i16 |= (134217728 & i15) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            i16 |= o0VarE.r(eVar2) ? 536870912 : 268435456;
        }
        int i17 = i16;
        if (o0VarE.n(i17 & 1, (i17 & 306783379) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            f02.u.f67749a.getClass();
            long jC = f02.u.c(o0VarE);
            long jB = f02.u.b(o0VarE);
            if (vVar == null) {
                o0Var = o0VarE;
                o0Var.C(1139747799);
                o0Var.g0(false);
                d0VarA = null;
            } else {
                o0Var = o0VarE;
                o0Var.C(36766058);
                long jA = g21.w.a(vVar, o0Var);
                o0Var.g0(false);
                d0VarA = o4.d0.a(jA);
            }
            float fG = w02.b0.g(v21.d.f175298b, o0Var);
            if (vVar == null) {
                z15 = false;
            } else {
                if (fVar3 == null || fVar3.isEmpty()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            o13.p pVarC = v21.f.c(v21.f.f175333a, fVar3);
            Float f14 = (Float) pVarC.f128594a;
            Float f15 = (Float) pVarC.f128595b;
            o0Var.C(36782174);
            ArrayList arrayList = new ArrayList();
            if (z15) {
                z16 = false;
                lVar = null;
                o0Var.C(1721146031);
                o0Var.g0(false);
            } else {
                o0Var.C(1718470607);
                float f16 = i14;
                float fJ = v21.f.j(p13.h0.C0(fVar, fVar2));
                float f17 = l0.f68589a;
                ArrayList arrayList2 = new ArrayList();
                Iterator<E> it = fVar.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new m92.l0(new m92.h0.e.b((m92.h0.e.a) it.next(), jB, null), true, false, 4, null));
                }
                x1 x1Var2 = p3.n.f135158a;
                p3.o0 o0Var2 = o0Var;
                o0Var = o0Var2;
                arrayList.add(new g21.y(l0.c(fG, jB, f16, fJ, arrayList2, o0Var2), fVar, p13.w.c(new j82.f(gl1.y.Q(o0Var, R.string.lbl_calories), new j82.g.a(jB, null), null, 4, null)), p13.w.c(new k(fVar, jB, 2))));
                v21.f fVar4 = v21.f.f175333a;
                ArrayList arrayListC0 = p13.h0.C0(fVar, fVar2);
                fVar4.getClass();
                lVar = null;
                arrayList.add(new g21.y(l0.d(fVar2, f16, Float.valueOf(v21.f.j(arrayListC0)), o0Var, (i17 >> 6) & 14), fVar2, p13.w.c(new j82.f(gl1.y.Q(o0Var, R.string.lbl_goal), new j82.g.e(jC, null), null, 4, null)), p13.w.c(new k(fVar2, jC, 3))));
                z16 = false;
                o0Var.g0(false);
            }
            if (vVar == null || d0VarA == 0) {
                z17 = z16;
                o0Var.C(1722714383);
                o0Var.g0(z17);
            } else {
                o0Var.C(1721258468);
                if (fVar3 == null) {
                    o0Var.C(1721331255);
                    o0Var.g0(z16);
                    lVarE = lVar;
                    z17 = z16;
                } else {
                    o0Var.C(1721331256);
                    z17 = z16;
                    lVarE = l0.e(fVar3, i14, f14, f15, d0VarA.f128833a, o0Var);
                    o0Var.g0(z17);
                }
                if (fVar3 == null || (fVarB = i53.a.j(fVar3)) == null) {
                    fVarB = j53.l.b();
                }
                arrayList.add(new g21.y(lVarE, fVarB, l0.h(z15, vVar, false, o0Var, (i17 >> 9) & 112, 4), p13.w.c(new l(fVar3, context, vVar, d0VarA, 1))));
                o0Var.g0(z17);
            }
            o0Var.g0(z17);
            String strQ = gl1.y.Q(o0Var, R.string.avg_daily_calories);
            v21.f.f175333a.getClass();
            int i18 = i17 >> 6;
            l0.b(oVar, strQ, arrayList, z14, gl1.y.Q(o0Var, (vVar == null || !z14) ? R.string.weight_no_data_for_time_period : R.string.common_no_data), list, Float.valueOf(v21.f.j(p13.h0.C0(fVar2, fVar))), f14, f15, eVar, eVar2, o0Var, (i17 & 14) | (i18 & 7168) | (i18 & 458752) | 1073741824 | ((i17 << 3) & 1879048192), (i17 >> 27) & 14, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e2.b(oVar, fVar, fVar2, fVar3, vVar, z14, i14, list, eVar, eVar2, i15);
        }
    }
}
