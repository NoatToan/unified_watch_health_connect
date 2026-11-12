package pp;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import gl1.y;
import java.util.Map;
import lc.u0;
import m92.o;
import mp.j;
import mp.k;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f139527a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139528a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.TIME_INDOOR_ROWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f139528a = iArr;
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f139527a = 280;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0158  */
    /* JADX WARN: Code duplicated, block: B:98:0x014b  */
    public static final void a(k kVar, final yp.f fVar, final yp.b bVar, final o82.g gVar, final String str, boolean z14, boolean z15, final i53.c<? extends j> cVar, final i53.d<j, Boolean> dVar, final p<? super o82.g, ? super Map<j, Boolean>, Unit> pVar, m mVar, final int i14) {
        int i15;
        k kVar2;
        o0 o0Var;
        boolean z16;
        boolean z17;
        z3.e eVarC;
        kVar.getClass();
        gVar.getClass();
        cVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(1638687550);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(kVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(gVar.ordinal()) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(str) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.h(z15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.B(cVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.B(dVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i14) == 0) {
            i15 |= o0VarE.r(pVar) ? 536870912 : 268435456;
        }
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            x1 x1Var = n.f135158a;
            int i16 = wp.c.a.f186522a[kVar.ordinal()];
            int i17 = R.string.lbl_time_totals;
            switch (i16) {
                case 1:
                case 2:
                    String strQ = y.Q(o0VarE, i17);
                    z16 = z14;
                    z17 = z15;
                    z3.e eVarC2 = z3.f.c(-61321538, new ki1.f(kVar, gVar, str, z14, z15, dVar, bVar), o0VarE);
                    if (cVar.isEmpty()) {
                        o0VarE.C(1543991688);
                        o0VarE.g0(false);
                        eVarC = null;
                    } else {
                        o0VarE.C(1544045101);
                        eVarC = z3.f.c(-988266909, new na0.a(dVar, cVar, pVar, gVar, 23), o0VarE);
                        o0VarE.g0(false);
                    }
                    kVar2 = kVar;
                    o0Var = o0VarE;
                    o.a(null, strQ, null, null, eVarC2, eVarC, z3.f.c(2133314240, new ha0.e(fVar, kVar2, z16, z17), o0VarE), o0Var, 1597440, 13);
                    break;
                case 3:
                case 4:
                    i17 = R.string.lbl_distance_totals;
                    String strQ2 = y.Q(o0VarE, i17);
                    z16 = z14;
                    z17 = z15;
                    z3.e eVarC3 = z3.f.c(-61321538, new ki1.f(kVar, gVar, str, z14, z15, dVar, bVar), o0VarE);
                    if (cVar.isEmpty()) {
                        o0VarE.C(1543991688);
                        o0VarE.g0(false);
                        eVarC = null;
                    } else {
                        o0VarE.C(1544045101);
                        eVarC = z3.f.c(-988266909, new na0.a(dVar, cVar, pVar, gVar, 23), o0VarE);
                        o0VarE.g0(false);
                    }
                    kVar2 = kVar;
                    o0Var = o0VarE;
                    o.a(null, strQ2, null, null, eVarC3, eVarC, z3.f.c(2133314240, new ha0.e(fVar, kVar2, z16, z17), o0VarE), o0Var, 1597440, 13);
                    break;
                case 5:
                    i17 = R.string.lbl_ascent_totals;
                    String strQ3 = y.Q(o0VarE, i17);
                    z16 = z14;
                    z17 = z15;
                    z3.e eVarC4 = z3.f.c(-61321538, new ki1.f(kVar, gVar, str, z14, z15, dVar, bVar), o0VarE);
                    if (cVar.isEmpty()) {
                        o0VarE.C(1543991688);
                        o0VarE.g0(false);
                        eVarC = null;
                    } else {
                        o0VarE.C(1544045101);
                        eVarC = z3.f.c(-988266909, new na0.a(dVar, cVar, pVar, gVar, 23), o0VarE);
                        o0VarE.g0(false);
                    }
                    kVar2 = kVar;
                    o0Var = o0VarE;
                    o.a(null, strQ3, null, null, eVarC4, eVarC, z3.f.c(2133314240, new ha0.e(fVar, kVar2, z16, z17), o0VarE), o0Var, 1597440, 13);
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    i17 = R.string.lbl_calories_totals;
                    String strQ4 = y.Q(o0VarE, i17);
                    z16 = z14;
                    z17 = z15;
                    z3.e eVarC5 = z3.f.c(-61321538, new ki1.f(kVar, gVar, str, z14, z15, dVar, bVar), o0VarE);
                    if (cVar.isEmpty()) {
                        o0VarE.C(1543991688);
                        o0VarE.g0(false);
                        eVarC = null;
                    } else {
                        o0VarE.C(1544045101);
                        eVarC = z3.f.c(-988266909, new na0.a(dVar, cVar, pVar, gVar, 23), o0VarE);
                        o0VarE.g0(false);
                    }
                    kVar2 = kVar;
                    o0Var = o0VarE;
                    o.a(null, strQ4, null, null, eVarC5, eVarC, z3.f.c(2133314240, new ha0.e(fVar, kVar2, z16, z17), o0VarE), o0Var, 1597440, 13);
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                    i17 = R.string.gaming_daily_win_rates;
                    String strQ5 = y.Q(o0VarE, i17);
                    z16 = z14;
                    z17 = z15;
                    z3.e eVarC6 = z3.f.c(-61321538, new ki1.f(kVar, gVar, str, z14, z15, dVar, bVar), o0VarE);
                    if (cVar.isEmpty()) {
                        o0VarE.C(1543991688);
                        o0VarE.g0(false);
                        eVarC = null;
                    } else {
                        o0VarE.C(1544045101);
                        eVarC = z3.f.c(-988266909, new na0.a(dVar, cVar, pVar, gVar, 23), o0VarE);
                        o0VarE.g0(false);
                    }
                    kVar2 = kVar;
                    o0Var = o0VarE;
                    o.a(null, strQ5, null, null, eVarC6, eVarC, z3.f.c(2133314240, new ha0.e(fVar, kVar2, z16, z17), o0VarE), o0Var, 1597440, 13);
                    break;
                case 14:
                case 15:
                case 16:
                case 17:
                    i17 = R.string.allday_stress_average_stress;
                    String strQ6 = y.Q(o0VarE, i17);
                    z16 = z14;
                    z17 = z15;
                    z3.e eVarC7 = z3.f.c(-61321538, new ki1.f(kVar, gVar, str, z14, z15, dVar, bVar), o0VarE);
                    if (cVar.isEmpty()) {
                        o0VarE.C(1543991688);
                        o0VarE.g0(false);
                        eVarC = null;
                    } else {
                        o0VarE.C(1544045101);
                        eVarC = z3.f.c(-988266909, new na0.a(dVar, cVar, pVar, gVar, 23), o0VarE);
                        o0VarE.g0(false);
                    }
                    kVar2 = kVar;
                    o0Var = o0VarE;
                    o.a(null, strQ6, null, null, eVarC7, eVarC, z3.f.c(2133314240, new ha0.e(fVar, kVar2, z16, z17), o0VarE), o0Var, 1597440, 13);
                    break;
                case 18:
                    i17 = R.string.body_battery_impact;
                    String strQ7 = y.Q(o0VarE, i17);
                    z16 = z14;
                    z17 = z15;
                    z3.e eVarC8 = z3.f.c(-61321538, new ki1.f(kVar, gVar, str, z14, z15, dVar, bVar), o0VarE);
                    if (cVar.isEmpty()) {
                        o0VarE.C(1543991688);
                        o0VarE.g0(false);
                        eVarC = null;
                    } else {
                        o0VarE.C(1544045101);
                        eVarC = z3.f.c(-988266909, new na0.a(dVar, cVar, pVar, gVar, 23), o0VarE);
                        o0VarE.g0(false);
                    }
                    kVar2 = kVar;
                    o0Var = o0VarE;
                    o.a(null, strQ7, null, null, eVarC8, eVarC, z3.f.c(2133314240, new ha0.e(fVar, kVar2, z16, z17), o0VarE), o0Var, 1597440, 13);
                    break;
                case 19:
                case 20:
                case 21:
                    i17 = R.string.lbl_pack_weight;
                    String strQ8 = y.Q(o0VarE, i17);
                    z16 = z14;
                    z17 = z15;
                    z3.e eVarC9 = z3.f.c(-61321538, new ki1.f(kVar, gVar, str, z14, z15, dVar, bVar), o0VarE);
                    if (cVar.isEmpty()) {
                        o0VarE.C(1543991688);
                        o0VarE.g0(false);
                        eVarC = null;
                    } else {
                        o0VarE.C(1544045101);
                        eVarC = z3.f.c(-988266909, new na0.a(dVar, cVar, pVar, gVar, 23), o0VarE);
                        o0VarE.g0(false);
                    }
                    kVar2 = kVar;
                    o0Var = o0VarE;
                    o.a(null, strQ8, null, null, eVarC9, eVarC, z3.f.c(2133314240, new ha0.e(fVar, kVar2, z16, z17), o0VarE), o0Var, 1597440, 13);
                    break;
                default:
                    u0.r();
                    break;
            }
            return;
        }
        kVar2 = kVar;
        o0Var = o0VarE;
        z16 = z14;
        z17 = z15;
        o0Var.e();
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final boolean z18 = z16;
            final k kVar3 = kVar2;
            final boolean z19 = z17;
            p2VarI0.f135219d = new p() { // from class: pp.e
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h.a(kVar3, fVar, bVar, gVar, str, z18, z19, cVar, dVar, pVar, (m) obj, p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
