package wp;

import android.content.Context;
import c22.l3;
import c22.m3;
import java.text.NumberFormat;
import lc.u0;
import mp.k;
import p005kotlin.math.MathKt;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186523a;

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
            try {
                iArr[k.DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.DISTANCE_SWIMMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k.ASCENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k.CALORIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k.RESTING_CALORIES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[k.NON_PACK_WEIGHT_CALORIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[k.PACK_WEIGHT_CALORIES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[k.WIN_RATE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[k.GAMES_WON.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[k.GAMES_AVG_WON.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[k.GAMES_NOT_WON.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[k.STRESS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[k.AVG_WIN_STRESS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[k.AVG_LOSS_STRESS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[k.AVG_DRAW_STRESS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[k.BODY_BATTERY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[k.PACK_WEIGHT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[k.AVG_PACK_WEIGHT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[k.PACE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            f186523a = iArr;
        }
    }

    public static final String a(Context context, Double d14, k kVar, NumberFormat numberFormat, boolean z14, boolean z15) {
        double d15;
        kVar.getClass();
        numberFormat.getClass();
        k.a aVar = k.f120007d;
        switch (a.f186523a[kVar.ordinal()]) {
            case 1:
                l3.a aVar2 = l3.f23124b;
                long jD = MathKt.d(d14.doubleValue() * 1000.0d);
                aVar2.getClass();
                return l3.a.b1(jD);
            case 2:
                l3.a aVar3 = l3.f23124b;
                long jD2 = MathKt.d(d14.doubleValue() * 1000.0d);
                aVar3.getClass();
                return l3.a.b1(jD2);
            case 3:
                l3.a aVar4 = l3.f23124b;
                if (z14) {
                    double dDoubleValue = d14.doubleValue();
                    aVar4.getClass();
                    d15 = dDoubleValue * 1000.0d;
                } else {
                    double dDoubleValue2 = d14.doubleValue();
                    aVar4.getClass();
                    d15 = 1609.344d * dDoubleValue2;
                }
                m3 m3Var = z14 ? m3.KILOMETER : m3.MILE;
                aVar4.getClass();
                return l3.a.O(context, d15, m3Var, numberFormat, false);
            case 4:
                l3.a aVar5 = l3.f23124b;
                double dDoubleValue3 = d14.doubleValue();
                if (!z14) {
                    aVar5.getClass();
                    dDoubleValue3 *= 0.9144d;
                }
                double d16 = dDoubleValue3;
                aVar5.getClass();
                return l3.a.P(context, d16, z14 ? m3.METER : m3.YARD, l3.f23131i, false, null);
            case 5:
                l3.a aVar6 = l3.f23124b;
                double dDoubleValue4 = d14.doubleValue();
                if (!z15) {
                    aVar6.getClass();
                    dDoubleValue4 /= 3.2808399d;
                }
                double d17 = dDoubleValue4;
                aVar6.getClass();
                return l3.a.c0(context, d17, z15, false, false);
            case 6:
            case 7:
            case 8:
            case 9:
                return l3.a.H(l3.f23124b, new l22.a(context), d14.doubleValue(), false);
            case 10:
            case 11:
            case 12:
            case 13:
                l3.a aVar7 = l3.f23124b;
                double dDoubleValue5 = d14.doubleValue();
                aVar7.getClass();
                return l3.a.D1(dDoubleValue5, false);
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                l3.a aVar8 = l3.f23124b;
                double dDoubleValue6 = d14.doubleValue();
                aVar8.getClass();
                return l3.a.B(dDoubleValue6);
            case 19:
            case 20:
                if (d14.doubleValue() > 0.0d) {
                    l3.a aVar9 = l3.f23124b;
                    double dRint = Math.rint(d14.doubleValue()) / 1000.0d;
                    aVar9.getClass();
                    return l3.a.C1(aVar9, context, dRint, z14, false, l3.f23131i, 32);
                }
                l3.a aVar10 = l3.f23124b;
                double dDoubleValue7 = d14.doubleValue();
                aVar10.getClass();
                return l3.a.B(dDoubleValue7);
            case 21:
                l3.a aVar11 = l3.f23124b;
                double dDoubleValue8 = d14.doubleValue();
                aVar11.getClass();
                return aVar11.r0(context, l3.a.p(dDoubleValue8, z14), z14, false, "");
            default:
                u0.r();
                return null;
        }
    }

    public static final boolean b(k kVar) {
        kVar.getClass();
        return x.k(k.BODY_BATTERY, k.STRESS, k.WIN_RATE).contains(kVar);
    }
}
