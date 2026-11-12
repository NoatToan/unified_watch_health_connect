package sg2;

import c2.a0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gl1.y;
import java.util.List;
import lc.u0;
import o4.d0;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.x;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final class r {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159269a;

        static {
            int[] iArr = new int[mt2.i.values().length];
            try {
                iArr[mt2.i.CUSTOM_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mt2.i.PACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mt2.i.SPEED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f159269a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, lt2.b bVar, ah2.e eVar, Integer num, ag2.c.a aVar, boolean z14, final String str, e23.q qVar, p3.m mVar, int i14) {
        o0 o0Var;
        double d14;
        double d15;
        o0 o0Var2;
        double dB;
        String str2;
        Float f14;
        float fFloatValue;
        Float f15;
        final double d16;
        String strP;
        Float f16;
        Float f17;
        Float f18;
        mt2.j jVar = bVar.f114873d;
        double d17 = bVar.f114872c;
        double dB2 = bVar.f114871b;
        mt2.i iVar = bVar.f114870a;
        qVar.getClass();
        o0 o0VarE = mVar.E(-1384693457);
        int i15 = i14 | (o0VarE.B(bVar) ? 32 : 16) | (o0VarE.B(eVar) ? 256 : 128) | (o0VarE.B(num) ? 2048 : 1024) | (o0VarE.k(aVar.ordinal()) ? 16384 : 8192) | (o0VarE.h(z14) ? 131072 : 65536) | (o0VarE.B(str) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(qVar) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            int iIntValue = num != null ? num.intValue() : 0;
            double d18 = d17 - dB2;
            o13.p pVar = new o13.p(Double.valueOf(dB2 - d18), Double.valueOf(d18 + d17));
            mt2.i iVar2 = mt2.i.SPEED;
            B b14 = pVar.f128595b;
            A a14 = pVar.f128594a;
            if (iVar == iVar2) {
                rg2.b bVar2 = rg2.b.f152669a;
                double dDoubleValue = ((Number) a14).doubleValue();
                bVar2.getClass();
                Double dValueOf = Double.valueOf(z14 ? dDoubleValue * 3.6d : dDoubleValue * 2.23694d);
                double dDoubleValue2 = ((Number) b14).doubleValue();
                pVar = new o13.p(dValueOf, Double.valueOf(z14 ? dDoubleValue2 * 3.6d : dDoubleValue2 * 2.23694d));
                d14 = d17;
            } else if (iVar == mt2.i.CUSTOM_POWER && jVar == mt2.j.PERCENT) {
                rg2.b bVar3 = rg2.b.f152669a;
                double dDoubleValue3 = ((Number) a14).doubleValue();
                bVar3.getClass();
                d14 = d17;
                double d19 = iIntValue;
                double d24 = dDoubleValue3 * d19;
                double d25 = 100;
                pVar = new o13.p(Double.valueOf(d24 / d25), Double.valueOf((((Number) b14).doubleValue() * d19) / d25));
            } else {
                d14 = d17;
                if (iVar == mt2.i.PACE) {
                    pVar = new o13.p(b14, a14);
                }
            }
            final o13.p pVar2 = pVar;
            mt2.i iVar3 = mt2.i.CUSTOM_POWER;
            if (iVar == iVar3 && jVar == mt2.j.PERCENT) {
                rg2.b.f152669a.getClass();
                d15 = 1609.344d;
                dB2 = MathKt.b((((double) iIntValue) * dB2) / ((double) 100));
            } else {
                d15 = 1609.344d;
                if (iVar == mt2.i.PACE) {
                    rg2.b.f152669a.getClass();
                    dB2 = (z14 ? 1000.0d / dB2 : 1609.344d / dB2) * ((double) 1000);
                }
            }
            if (iVar == iVar3 && jVar == mt2.j.PERCENT) {
                rg2.b.f152669a.getClass();
                o0Var2 = o0VarE;
                dB = MathKt.b((((double) iIntValue) * d14) / ((double) 100));
            } else {
                o0Var2 = o0VarE;
                if (iVar == mt2.i.PACE) {
                    rg2.b.f152669a.getClass();
                    dB = z14 ? (1000.0d / d14) * ((double) 1000) : (d15 / d14) * ((double) 1000);
                } else {
                    dB = d14;
                }
            }
            if (eVar == null || (str2 = eVar.f3289a) == null) {
                str2 = "";
            }
            int i16 = a.f159269a[iVar.ordinal()];
            double dFloatValue = 0.0d;
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 3) {
                        if (eVar != null && (f18 = eVar.f3290b) != null) {
                            fFloatValue = f18.floatValue();
                            d16 = fFloatValue;
                        }
                    } else if (eVar != null && (f17 = eVar.f3290b) != null) {
                        double dFloatValue2 = f17.floatValue();
                        rg2.b.f152669a.getClass();
                        dFloatValue = z14 ? dFloatValue2 * 3.6d : dFloatValue2 * 2.23694d;
                    }
                } else if (eVar != null && (f16 = eVar.f3290b) != null) {
                    double dFloatValue3 = f16.floatValue();
                    rg2.b.f152669a.getClass();
                    if (dFloatValue3 != 0.0d) {
                        double d26 = dFloatValue3 / ((double) 1000);
                        dFloatValue = z14 ? 1000.0d / d26 : d15 / d26;
                    }
                }
                d16 = dFloatValue;
            } else {
                if (jVar == mt2.j.PERCENT) {
                    rg2.b bVar4 = rg2.b.f152669a;
                    if (eVar != null && (f15 = eVar.f3290b) != null) {
                        dFloatValue = f15.floatValue();
                    }
                    bVar4.getClass();
                    dFloatValue = (((double) iIntValue) * dFloatValue) / ((double) 100);
                } else if (eVar != null && (f14 = eVar.f3290b) != null) {
                    fFloatValue = f14.floatValue();
                    d16 = fFloatValue;
                }
                d16 = dFloatValue;
            }
            if (iVar == mt2.i.POWER_CURVE) {
                o0Var2.C(1761337367);
                strP = y.P(R.string.lbl_power_curve_range_target_format, new Object[]{qVar.invoke(aVar, Double.valueOf(dB2), Boolean.valueOf(z14)), qVar.invoke(aVar, Double.valueOf(dB), Boolean.valueOf(z14))}, o0Var2);
                o0Var2.g0(false);
            } else {
                o0Var2.C(1761569681);
                strP = y.P(R.string.value_colon_value, new Object[]{y.P(R.string.x_target, new Object[]{y.Q(o0Var2, aVar.f3219b)}, o0Var2), y.P(R.string.lbl_value_range_no_spaces_with_unit, new Object[]{qVar.invoke(aVar, Double.valueOf(dB2), Boolean.valueOf(z14)), qVar.invoke(aVar, Double.valueOf(dB), Boolean.valueOf(z14)), String.valueOf(str)}, o0Var2)}, o0Var2);
                o0Var2.g0(false);
            }
            final String str3 = strP;
            final String str4 = str2;
            o0 o0Var3 = o0Var2;
            f.a(rVar, 0L, z3.f.c(-1493207133, new e23.q() { // from class: sg2.p
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    ((a0) obj).getClass();
                    if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                        x1 x1Var2 = p3.n.f135158a;
                        gl.c.f77766a.getClass();
                        n.a(null, x.k(d0.a(gl.c.a(mVar2).l()), d0.a(gl.c.a(mVar2).e()), d0.a(gl.c.a(mVar2).l())), 1, pVar2, d16, str4, str, str3, null, mVar2, 100663680);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var2), o0Var3, 390, 2);
            o0Var = o0Var3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.n(rVar, bVar, eVar, num, aVar, z14, str, qVar, i14, 14);
        }
    }

    public static final void b(h4.r rVar, lt2.b bVar, ah2.e eVar, ag2.c.a aVar, zf2.d dVar, p3.m mVar, int i14) {
        ag2.c.a aVar2;
        o13.p pVar;
        List listK;
        String str;
        Float f14;
        Double dValueOf = Double.valueOf(6.0d);
        Double dValueOf2 = Double.valueOf(1.0d);
        mt2.i iVar = bVar.f114870a;
        dVar.getClass();
        o0 o0VarE = mVar.E(601231742);
        int i15 = i14 | (o0VarE.B(bVar) ? 32 : 16) | (o0VarE.B(eVar) ? 256 : 128) | (o0VarE.k(aVar.ordinal()) ? 2048 : 1024) | (o0VarE.k(dVar.ordinal()) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            final int i16 = bVar.f114877h;
            mt2.i iVar2 = mt2.i.HEART_RATE_ZONE;
            if (iVar == iVar2) {
                pVar = new o13.p(dValueOf2, dValueOf);
            } else {
                pVar = (dVar == zf2.d.D || dVar == zf2.d.f204599k0) ? new o13.p(dValueOf2, Double.valueOf(8.0d)) : new o13.p(dValueOf2, dValueOf);
            }
            final o13.p pVar2 = pVar;
            if (iVar == iVar2) {
                o0VarE.C(1281870336);
                gl.c.f77766a.getClass();
                listK = x.k(d0.a(gl.c.a(o0VarE).g()), d0.a(gl.c.a(o0VarE).c()), d0.a(gl.c.a(o0VarE).e()), d0.a(gl.c.a(o0VarE).i()), d0.a(gl.c.a(o0VarE).l()));
                o0VarE.g0(false);
            } else {
                o0VarE.C(1282151041);
                if (dVar == zf2.d.D || dVar == zf2.d.f204599k0) {
                    o0VarE.C(1282248288);
                    gl.c.f77766a.getClass();
                    listK = x.k(d0.a(gl.c.a(o0VarE).g()), d0.a(gl.c.a(o0VarE).c()), d0.a(gl.c.a(o0VarE).e()), d0.a(gl.c.a(o0VarE).r()), d0.a(gl.c.a(o0VarE).h()), d0.a(gl.c.a(o0VarE).l()), d0.a(gl.c.a(o0VarE).j()));
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1282636160);
                    gl.c.f77766a.getClass();
                    listK = x.k(d0.a(gl.c.a(o0VarE).g()), d0.a(gl.c.a(o0VarE).c()), d0.a(gl.c.a(o0VarE).e()), d0.a(gl.c.a(o0VarE).i()), d0.a(gl.c.a(o0VarE).l()));
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            }
            final List list = listK;
            final double dFloatValue = (eVar == null || (f14 = eVar.f3290b) == null) ? 0.0d : f14.floatValue();
            if (eVar == null || (str = eVar.f3289a) == null) {
                str = "";
            }
            aVar2 = aVar;
            final String str2 = str;
            final String strP = y.P(R.string.value_colon_value, new Object[]{y.P(R.string.x_target, new Object[]{y.Q(o0VarE, aVar2.f3219b)}, o0VarE), y.P(R.string.zone_x, new Object[]{String.valueOf(i16)}, o0VarE)}, o0VarE);
            f.a(rVar, 0L, z3.f.c(-639445878, new e23.q() { // from class: sg2.q
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((a0) obj).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        x1 x1Var2 = p3.n.f135158a;
                        n.a(null, list, Integer.valueOf(i16 - 1), pVar2, dFloatValue, str2, null, strP, null, mVar2, 102236160);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 390, 2);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(rVar, bVar, eVar, aVar2, dVar, i14, 2);
        }
    }

    public static final void c(h4.r rVar, lt2.a aVar, ah2.e eVar, ag2.c.a aVar2, String str, p3.m mVar, int i14) {
        ag2.c.a aVar3;
        String str2;
        Integer numValueOf;
        int i15;
        double d14 = aVar.f114867b;
        o0 o0VarE = mVar.E(456644038);
        int i16 = i14 | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.B(eVar) ? 256 : 128) | (o0VarE.k(aVar2.ordinal()) ? 2048 : 1024) | (o0VarE.B(str) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            double d15 = 20;
            double d16 = d14 - d15;
            if (d16 < 0.0d) {
                d16 = 0.0d;
            }
            o13.p pVar = new o13.p(Double.valueOf(d16), Double.valueOf(d15 + d14));
            if (eVar == null || (str2 = eVar.f3289a) == null) {
                str2 = "";
            }
            aVar3 = aVar2;
            String strP = y.P(R.string.x_target, new Object[]{y.Q(o0VarE, aVar3.f3219b)}, o0VarE);
            mt2.b bVar = aVar.f114868c;
            String strP2 = null;
            if (bVar != null) {
                int i17 = zg2.f.a.f204700g[bVar.ordinal()];
                if (i17 == 1) {
                    i15 = R.string.above_value;
                } else {
                    if (i17 != 2) {
                        u0.r();
                        return;
                    }
                    i15 = R.string.below_value;
                }
                numValueOf = Integer.valueOf(i15);
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                o0VarE.C(1721662884);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1721662885);
                strP2 = y.P(numValueOf.intValue(), new Object[]{String.valueOf(d14)}, o0VarE);
                o0VarE.g0(false);
            }
            f.a(rVar, 0L, z3.f.c(4110290, new ak0.h(aVar, pVar, eVar, str2, str, y.P(R.string.value_colon_value, new Object[]{strP, strP2 != null ? strP2 : ""}, o0VarE), 24), o0VarE), o0VarE, 390, 2);
        } else {
            aVar3 = aVar2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(rVar, aVar, eVar, aVar3, str, i14, 1);
        }
    }
}
