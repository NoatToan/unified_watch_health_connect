package uu;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import gg1.o0;
import java.text.DecimalFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luu/p;", "", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f172734a = 0;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172735a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.badges.service.model.k.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.badges.service.model.k.LONG_DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.badges.service.model.k.SHORT_DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.badges.service.model.k.ACTIVITY_COUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.badges.service.model.k.DAYS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.badges.service.model.k.MI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.badges.service.model.k.STEPS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.badges.service.model.k.SECONDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.badges.service.model.k.CHALLENGES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.badges.service.model.k.KILO_CALORIES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.badges.service.model.k.WEEKS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.badges.service.model.k.LIKES.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.badges.service.model.k.YD_M.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f172735a = iArr;
        }
    }

    static {
        new p();
    }

    private p() {
    }

    public static final String a(Context context, double d14, double d15, int i14, boolean z14, o0 o0Var, boolean z15) {
        com.garmin.android.apps.connectmobile.badges.service.model.k kVar;
        m3 m3Var;
        context.getClass();
        o0Var.getClass();
        if (d14 >= d15) {
            String string = context.getString(R.string.lbl_completed);
            string.getClass();
            return string;
        }
        com.garmin.android.apps.connectmobile.badges.service.model.k[] kVarArrValues = com.garmin.android.apps.connectmobile.badges.service.model.k.values();
        int length = kVarArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                kVar = null;
                break;
            }
            kVar = kVarArrValues[i15];
            if (kVar.f30610a == i14) {
                break;
            }
            i15++;
        }
        int i16 = kVar == null ? -1 : a.f172735a[kVar.ordinal()];
        int i17 = R.string.badges_lbl_progress_description_mi;
        int i18 = R.string.badges_lbl_progress_description_m;
        switch (i16) {
            case 1:
                o0 o0Var2 = o0.METRIC;
                if (o0Var == o0Var2) {
                    m3Var = m3.KILOMETER;
                } else {
                    m3Var = (o0Var == o0.STATUTE_UK && z15) ? m3.METER : m3.MILE;
                }
                l3.f23124b.getClass();
                double dJ = l3.a.j(d14, m3Var);
                double dG = l3.a.g(d15, m3.METER, m3Var);
                double dJ2 = oe2.f.j(dJ, dG);
                double dW = oe2.f.W(dG);
                String str = l3.f23130h.format(dJ2);
                String str2 = l3.f23130h.format(dW);
                if (o0Var == o0Var2) {
                    i17 = R.string.badges_lbl_progress_description_km;
                } else if (o0Var == o0.STATUTE_UK && z15) {
                    i17 = R.string.badges_lbl_progress_description_m;
                }
                String string2 = context.getString(i17, str, str2);
                string2.getClass();
                return z14 ? oi0.c.A(context, new o(0), string2) : string2;
            case 2:
                o0 o0Var3 = o0.METRIC;
                m3 m3Var2 = (o0Var == o0Var3 || (o0Var == o0.STATUTE_UK && z15)) ? m3.METER : m3.FOOT;
                l3.f23124b.getClass();
                double dJ3 = l3.a.j(d14, m3Var2);
                double dG2 = l3.a.g(d15, m3.METER, m3Var2);
                double dJ4 = oe2.f.j(dJ3, dG2);
                double dW2 = oe2.f.W(dG2);
                String str3 = l3.f23130h.format(dJ4);
                String str4 = l3.f23130h.format(dW2);
                if (o0Var != o0Var3 && (o0Var != o0.STATUTE_UK || !z15)) {
                    i18 = R.string.badges_lbl_progress_description_ft;
                }
                String string3 = context.getString(i18, str3, str4);
                string3.getClass();
                return z14 ? oi0.c.A(context, new o(1), string3) : string3;
            case 3:
                l3.f23124b.getClass();
                String string4 = context.getString(R.string.badges_lbl_progress_description_activities, l3.a.Z0((int) d14), l3.a.Z0((int) d15));
                string4.getClass();
                return string4;
            case 4:
                l3.f23124b.getClass();
                String string5 = context.getString(R.string.badges_lbl_progress_description_days, l3.a.Z0((int) d14), l3.a.Z0((int) d15));
                string5.getClass();
                return string5;
            case 5:
                l3.a aVar = l3.f23124b;
                m3 m3Var3 = m3.MILE;
                DecimalFormat decimalFormat = l3.f23126d;
                aVar.getClass();
                String string6 = context.getString(R.string.badges_lbl_progress_description_mi, l3.a.O(context, d14, m3Var3, decimalFormat, false), l3.a.P(context, d15, m3Var3, l3.f23126d, false, null));
                string6.getClass();
                return z14 ? oi0.c.A(context, new o(2), string6) : string6;
            case 6:
                l3.f23124b.getClass();
                String string7 = context.getString(R.string.badges_lbl_progress_description_steps, l3.a.Z0((int) d14), l3.a.Z0((int) d15));
                string7.getClass();
                return string7;
            case 7:
                l3.f23124b.getClass();
                double d16 = 1000;
                String strP0 = l3.a.P0(context, (long) (d14 * d16), false);
                String strP1 = l3.a.P0(context, (long) (d15 * d16), false);
                String string8 = context.getString(R.string.lbl_value1_of_value2, strP0, strP1);
                string8.getClass();
                if (!z14) {
                    return string8;
                }
                String string9 = context.getString(R.string.lbl_value1_of_value2, strP0, strP1);
                string9.getClass();
                return oi0.c.A(context, new o(3), string9);
            case 8:
                l3.f23124b.getClass();
                String string10 = context.getString(R.string.badges_lbl_progress_description_challenges, l3.a.Z0((int) d14), l3.a.Z0((int) d15));
                string10.getClass();
                return string10;
            case 9:
                l3.f23124b.getClass();
                String string11 = context.getString(R.string.badges_lbl_progress_description_calories, l3.a.Z0((int) d14), l3.a.Z0((int) d15));
                string11.getClass();
                return string11;
            case 10:
                l3.f23124b.getClass();
                String string12 = context.getString(R.string.badges_lbl_progress_description_weeks, l3.a.Z0((int) d14), l3.a.Z0((int) d15));
                string12.getClass();
                return string12;
            case 11:
                l3.f23124b.getClass();
                String string13 = context.getString(R.string.badges_lbl_progress_description_likes, l3.a.Z0((int) d14), l3.a.Z0((int) d15));
                string13.getClass();
                return string13;
            case 12:
                o0 o0Var4 = o0.METRIC;
                m3 m3Var4 = (o0Var == o0Var4 || (o0Var == o0.STATUTE_UK && z15)) ? m3.METER : m3.YARD;
                l3.f23124b.getClass();
                double dJ5 = l3.a.j(d14, m3Var4);
                double dG3 = l3.a.g(d15, m3.METER, m3Var4);
                double dJ6 = oe2.f.j(dJ5, dG3);
                double dW3 = oe2.f.W(dG3);
                String str5 = l3.f23130h.format(dJ6);
                String str6 = l3.f23130h.format(dW3);
                if (o0Var != o0Var4 && (o0Var != o0.STATUTE_UK || !z15)) {
                    i18 = R.string.badges_lbl_progress_description_yd;
                }
                String string14 = context.getString(i18, str5, str6);
                string14.getClass();
                return z14 ? oi0.c.A(context, new o(4), string14) : string14;
            default:
                l3.f23124b.getClass();
                String string15 = context.getString(R.string.lbl_value1_of_value2, l3.a.Z0((int) d14), l3.a.Z0((int) d15));
                string15.getClass();
                return string15;
        }
    }

    public static final ColorMatrixColorFilter c(boolean z14) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(z14 ? 0.0f : 1.0f);
        return new ColorMatrixColorFilter(colorMatrix);
    }
}
