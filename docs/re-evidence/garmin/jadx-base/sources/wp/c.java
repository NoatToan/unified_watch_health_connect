package wp;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import d53.w;
import java.text.DecimalFormat;
import java.util.ArrayList;
import lc.u0;
import mp.k;
import o13.p;
import oi0.h;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186522a;

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
            f186522a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ArrayList arrayList, Context context, boolean z14, boolean z15, Double d14, String str, String str2, k kVar) {
        qp.b bVar;
        p pVar;
        p pVar2;
        if (d14 != null) {
            int[] iArr = a.f186522a;
            int i14 = iArr[kVar.ordinal()];
            int i15 = (i14 == 1 || i14 == 2) ? R.string.no_duration_value : R.string.no_value;
            if (!s.c(d14, 0.0d) || d.b(kVar)) {
                switch (iArr[kVar.ordinal()]) {
                    case 1:
                        l3.a aVar = l3.f23124b;
                        long jD = MathKt.d(d14.doubleValue() * 1000.0d);
                        aVar.getClass();
                        pVar = new p(l3.a.b1(jD), new h(context).d(MathKt.d(d14.doubleValue()), true));
                        pVar2 = pVar;
                        break;
                    case 2:
                        l3.a aVar2 = l3.f23124b;
                        long jD2 = MathKt.d(d14.doubleValue() * 1000.0d);
                        aVar2.getClass();
                        pVar = new p(l3.a.b1(jD2), new h(context).d(MathKt.d(d14.doubleValue()), true));
                        pVar2 = pVar;
                        break;
                    case 3:
                        l3.a aVar3 = l3.f23124b;
                        double dDoubleValue = d14.doubleValue();
                        DecimalFormat decimalFormat = l3.f23126d;
                        aVar3.getClass();
                        String strQ = l3.a.Q(context, dDoubleValue, decimalFormat, true, z14);
                        pVar = new p(strQ, oi0.c.A(context, new b(2), b(context, strQ).toString()));
                        pVar2 = pVar;
                        break;
                    case 4:
                        l3.a aVar4 = l3.f23124b;
                        double dDoubleValue2 = d14.doubleValue();
                        aVar4.getClass();
                        String strP = l3.a.P(context, dDoubleValue2, z14 ? m3.METER : m3.YARD, l3.f23131i, true, null);
                        pVar = new p(strP, oi0.c.A(context, new b(3), b(context, strP).toString()));
                        pVar2 = pVar;
                        break;
                    case 5:
                        l3.a aVar5 = l3.f23124b;
                        double dDoubleValue3 = d14.doubleValue();
                        aVar5.getClass();
                        String strC0 = l3.a.c0(context, dDoubleValue3, z15, true, false);
                        pVar = new p(strC0, oi0.c.A(context, new b(4), b(context, strC0).toString()));
                        pVar2 = pVar;
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        String strH = l3.a.H(l3.f23124b, new l22.a(context), d14.doubleValue(), false);
                        pVar = new p(strH, oi0.c.A(context, new b(5), new SpannableStringBuilder(strH).toString()));
                        pVar2 = pVar;
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        l3.a aVar6 = l3.f23124b;
                        double dDoubleValue4 = d14.doubleValue();
                        aVar6.getClass();
                        String strA0 = l3.a.A0(context, dDoubleValue4, 0);
                        pVar2 = new p(strA0, oi0.c.A(context, new b(6), strA0));
                        break;
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        l3.a aVar7 = l3.f23124b;
                        double dDoubleValue5 = d14.doubleValue();
                        aVar7.getClass();
                        String strB = l3.a.B(dDoubleValue5);
                        pVar2 = new p(strB, oi0.c.A(context, new wl.a(24), strB));
                        break;
                    case 18:
                        l3.a aVar8 = l3.f23124b;
                        double dB = MathKt.b(d14.doubleValue());
                        aVar8.getClass();
                        String strB2 = l3.a.B(dB);
                        pVar2 = new p(strB2, oi0.c.A(context, new wl.a(25), strB2));
                        break;
                    case 19:
                    case 20:
                        String strC1 = l3.a.C1(l3.f23124b, context, d14.doubleValue() / 1000.0d, z14, false, null, 56);
                        pVar2 = new p(strC1, oi0.c.A(context, new wl.a(26), strC1));
                        break;
                    case 21:
                        l3.a aVar9 = l3.f23124b;
                        double dDoubleValue6 = d14.doubleValue();
                        aVar9.getClass();
                        String strR0 = aVar9.r0(context, l3.a.p(dDoubleValue6, z14), z14, true, "");
                        pVar2 = new p(strR0, oi0.c.A(context, new wl.a(27), strR0));
                        break;
                    default:
                        u0.r();
                        break;
                }
            }
            pVar2 = new p(context.getString(i15), oi0.c.A(context, new b(1), context.getString(i15)));
            String str3 = (String) pVar2.f128594a;
            String str4 = (String) pVar2.f128595b;
            if (str3 == null) {
                str3 = "";
            }
            bVar = new qp.b(str3, str4, str, str2);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            arrayList.add(bVar);
        }
    }

    public static final SpannableStringBuilder b(Context context, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int length = spannableStringBuilder.length();
        String string = context.getString(R.string.no_value);
        string.getClass();
        int length2 = u.y(str, string, false) ? string.length() : w.G(' ', 0, 6, str);
        if (length2 != -1) {
            spannableStringBuilder.setSpan(new TextAppearanceSpan(context, R.style.GCMCardPrimaryValueUnit), length2, length, 18);
        }
        return spannableStringBuilder;
    }
}
