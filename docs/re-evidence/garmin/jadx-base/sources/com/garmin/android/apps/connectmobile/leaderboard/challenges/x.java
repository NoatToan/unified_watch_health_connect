package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import am.c2;
import android.content.Context;
import android.icu.text.CompactDecimalFormat;
import android.text.TextUtils;
import android.text.format.DateUtils;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.VivoKidAdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.VivoKidAdHocChallengePlayerDTO;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.Seconds;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/x;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f37955a = new x();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37957b;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.leaderboard.model.s.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38308d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38309e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38307c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38316l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38317m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38313i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38311g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38314j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38310f.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f37956a = iArr;
            int[] iArr2 = new int[com.garmin.android.apps.connectmobile.leaderboard.model.o.values().length];
            try {
                iArr2[com.garmin.android.apps.connectmobile.leaderboard.model.o.VIRTUAL_HIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.garmin.android.apps.connectmobile.leaderboard.model.o.VIRTUAL_CLIMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            f37957b = iArr2;
        }
    }

    private x() {
    }

    public static final String a(Context context, double d14, double d15, int i14, gg1.o0 o0Var, boolean z14) {
        String str;
        o0Var.getClass();
        String strA = uu.p.a(context, d14, d15, i14, false, o0Var, true);
        int i15 = d15 == 0.0d ? 0 : (int) ((d14 / d15) * 100.0d);
        if (z14) {
            String string = context.getString(R.string.lbl_percentage);
            string.getClass();
            str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i15)}, 1));
        } else {
            String string2 = context.getString(R.string.lbl_percentage_complete);
            string2.getClass();
            str = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(i15)}, 1));
        }
        String string3 = context.getString(R.string.string_space_bullet_string_pattern, strA, str);
        string3.getClass();
        return string3;
    }

    public static final String b(Context context, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var, gg1.o0 o0Var) {
        a0Var.getClass();
        o0Var.getClass();
        DateTime badgeEarnedDate = a0Var.getBadgeEarnedDate();
        Double badgeProgressValue = a0Var.getBadgeProgressValue();
        double dDoubleValue = badgeProgressValue != null ? badgeProgressValue.doubleValue() : 0.0d;
        Double badgeTargetValue = a0Var.getBadgeTargetValue();
        double dDoubleValue2 = badgeTargetValue != null ? badgeTargetValue.doubleValue() : 0.0d;
        Integer badgeUnitId = a0Var.getBadgeUnitId();
        int iIntValue = badgeUnitId != null ? badgeUnitId.intValue() : 0;
        if (badgeEarnedDate == null) {
            return a(context, dDoubleValue, dDoubleValue2, iIntValue, o0Var, true);
        }
        String string = g22.k.k(badgeEarnedDate) ? context.getString(R.string.challenge_leaderboard_header_today_label) : h(f37955a, context, a0Var.getBadgeEarnedDate(), true, true);
        string.getClass();
        String string2 = context.getString(R.string.lbl_completed_date, string);
        string2.getClass();
        return string2;
    }

    public static final String c(Context context, com.garmin.android.apps.connectmobile.leaderboard.model.p pVar, gg1.o0 o0Var) {
        com.garmin.android.apps.connectmobile.badges.service.model.k kVar;
        m3 m3Var;
        String string;
        String string2;
        pVar.getClass();
        o0Var.getClass();
        Double badgeTargetValue = pVar.getBadgeTargetValue();
        double dDoubleValue = badgeTargetValue != null ? badgeTargetValue.doubleValue() : 0.0d;
        Integer badgeUnitId = pVar.getBadgeUnitId();
        int iIntValue = badgeUnitId != null ? badgeUnitId.intValue() : 0;
        boolean z14 = pVar.C() == com.garmin.android.apps.connectmobile.leaderboard.model.o.VIRTUAL_CLIMB;
        int i14 = uu.p.f172734a;
        com.garmin.android.apps.connectmobile.badges.service.model.k[] kVarArrValues = com.garmin.android.apps.connectmobile.badges.service.model.k.values();
        int length = kVarArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                kVar = null;
                break;
            }
            kVar = kVarArrValues[i15];
            if (kVar.f30610a == iIntValue) {
                break;
            }
            i15++;
        }
        switch (kVar == null ? -1 : uu.p.a.f172735a[kVar.ordinal()]) {
            case 1:
                gg1.o0 o0Var2 = gg1.o0.METRIC;
                if (o0Var == o0Var2) {
                    m3Var = m3.KILOMETER;
                } else {
                    m3Var = (o0Var == gg1.o0.STATUTE_UK && z14) ? m3.METER : m3.MILE;
                }
                l3.f23124b.getClass();
                String str = l3.f23130h.format(oe2.f.W(l3.a.j(dDoubleValue, m3Var)));
                if (o0Var == o0Var2) {
                    string = context.getString(R.string.lbl_km);
                } else {
                    string = (o0Var == gg1.o0.STATUTE_UK && z14) ? context.getString(R.string.lbl_meter) : context.getString(R.string.lbl_mile);
                }
                string.getClass();
                string2 = context.getString(R.string.string_space_string_pattern, str, string);
                string2.getClass();
                break;
            case 2:
                gg1.o0 o0Var3 = gg1.o0.METRIC;
                m3 m3Var2 = (o0Var == o0Var3 || (o0Var == gg1.o0.STATUTE_UK && z14)) ? m3.METER : m3.FOOT;
                l3.f23124b.getClass();
                String str2 = l3.f23130h.format(oe2.f.W(l3.a.j(dDoubleValue, m3Var2)));
                String string3 = (o0Var == o0Var3 || (o0Var == gg1.o0.STATUTE_UK && z14)) ? context.getString(R.string.lbl_m) : context.getString(R.string.lbl_ft);
                string3.getClass();
                string2 = context.getString(R.string.string_space_string_pattern, str2, string3);
                string2.getClass();
                break;
            case 3:
                l3.f23124b.getClass();
                string2 = context.getString(R.string.lbl_common_number_of_activities, l3.a.Z0((int) dDoubleValue));
                string2.getClass();
                break;
            case 4:
                l3.f23124b.getClass();
                string2 = context.getString(R.string.mct_next_phase_days, l3.a.Z0((int) dDoubleValue));
                string2.getClass();
                break;
            case 5:
                l3.a aVar = l3.f23124b;
                m3 m3Var3 = m3.MILE;
                DecimalFormat decimalFormat = l3.f23126d;
                aVar.getClass();
                string2 = l3.a.O(context, dDoubleValue, m3Var3, decimalFormat, true);
                break;
            case 6:
                l3.f23124b.getClass();
                string2 = context.getString(R.string.steps_with_label, l3.a.Z0((int) dDoubleValue));
                string2.getClass();
                break;
            case 7:
                double dW = oe2.f.W(dDoubleValue / 3600.0d);
                l3.f23124b.getClass();
                string2 = context.getString(R.string.lbl_plural_more_than_one_hour, l3.f23130h.format(dW));
                string2.getClass();
                break;
            default:
                string2 = "";
                break;
        }
        CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance(Locale.getDefault(), CompactDecimalFormat.CompactStyle.SHORT);
        Integer approximateValue = pVar.getApproximateValue();
        String str3 = compactDecimalFormat.format(Integer.valueOf(approximateValue != null ? approximateValue.intValue() : 0));
        com.garmin.android.apps.connectmobile.leaderboard.model.o oVarC = pVar.C();
        int i16 = oVarC != null ? a.f37957b[oVarC.ordinal()] : -1;
        if (i16 == 1) {
            String string4 = context.getString(R.string.social_adventure_approximate_steps, string2, str3);
            string4.getClass();
            return string4;
        }
        if (i16 != 2) {
            return string2;
        }
        String string5 = context.getString(R.string.social_adventure_approximate_floors_climbed, string2, str3);
        string5.getClass();
        return string5;
    }

    public static final String d(Context context, String str) {
        if (TextUtils.isEmpty(str) || str.equals("low") || str.equals("moderate") || str.equals("high")) {
            String string = context.getString(R.string.social_steps_challenge);
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.challenge_step_level_title, str);
        string2.getClass();
        return string2;
    }

    public static String e(Context context, DateTime dateTime) {
        DateTime dateTimeNow = DateTime.now();
        if (dateTime == null) {
            return "";
        }
        int iAbs = Math.abs(Days.daysBetween(dateTimeNow, dateTime).getDays());
        if (g22.k.k(dateTime)) {
            String string = context.getString(R.string.challenge_leaderboard_header_today_label);
            string.getClass();
            return string;
        }
        if (g22.k.l(dateTime)) {
            String string2 = context.getString(R.string.common_tomorrow);
            string2.getClass();
            return string2;
        }
        if (iAbs >= 7) {
            return c22.j0.n(dateTime, 'M');
        }
        c22.j0.f23099a.getClass();
        return c22.j0.v(dateTime);
    }

    public static final String f(Context context, DateTime dateTime, DateTime dateTime2) {
        context.getClass();
        if (dateTime == null || dateTime2 == null) {
            return "";
        }
        int hours = (int) ((Hours.hoursBetween(dateTime, dateTime2).getHours() / 24.0f) + 0.5f);
        DateTime dateTimeWithTimeAtStartOfDay = dateTime.withTimeAtStartOfDay();
        DateTime dateTimePlusDays = dateTimeWithTimeAtStartOfDay.plusDays(hours);
        DateTime dateTimeMinusSeconds = dateTimePlusDays.minusSeconds(1);
        DateTime dateTimeNow = DateTime.now();
        boolean zIsAfter = dateTimeNow.isAfter(dateTimeWithTimeAtStartOfDay);
        x xVar = f37955a;
        if (!zIsAfter) {
            xVar.getClass();
            String string = context.getString(R.string.lbl_starts, e(context, dateTimeWithTimeAtStartOfDay));
            string.getClass();
            return string;
        }
        if (dateTimeNow.isBefore(dateTimePlusDays)) {
            xVar.getClass();
            String string2 = context.getString(R.string.lbl_group_challenge_ends, e(context, dateTimeMinusSeconds));
            string2.getClass();
            return string2;
        }
        xVar.getClass();
        String string3 = context.getString(R.string.lbl_group_challenge_ended, e(context, dateTimeMinusSeconds));
        string3.getClass();
        return string3;
    }

    public static String g(Context context, DateTime dateTime, boolean z14, boolean z15, boolean z16) {
        DateTime dateTimeNow = DateTime.now();
        if (dateTime == null) {
            return "";
        }
        int iAbs = Math.abs(Days.daysBetween(dateTimeNow, dateTime).getDays());
        int minutes = Minutes.minutesBetween(dateTimeNow, dateTime).getMinutes();
        boolean z17 = false;
        int seconds = iAbs == 0 ? Seconds.secondsBetween(dateTimeNow, dateTime).getSeconds() : 0;
        if (z14 && z15) {
            z17 = true;
        }
        if (iAbs != 0 || minutes < 0 || seconds <= 0) {
            if (DateUtils.isToday(dateTime.getMillis() + 86400000)) {
                String string = context.getString(R.string.social_elapsed_time_yesterday);
                string.getClass();
                return string;
            }
            if (g22.k.l(dateTime)) {
                String string2 = context.getString(R.string.common_tomorrow);
                string2.getClass();
                return string2;
            }
            if (iAbs >= 7) {
                return c22.j0.n(dateTime, 'L');
            }
            c22.j0.f23099a.getClass();
            return c22.j0.v(dateTime);
        }
        if (minutes <= 1) {
            if (z17) {
                String string3 = context.getString(R.string.common_minutes_left_capped_singular);
                string3.getClass();
                return string3;
            }
            String string4 = context.getString(R.string.lbl_time_unit_1_minute);
            string4.getClass();
            return string4;
        }
        if (minutes < 60) {
            if (z17) {
                String string5 = context.getString(R.string.common_minutes_left_capped_plural, String.valueOf(minutes));
                string5.getClass();
                return string5;
            }
            String string6 = context.getString(R.string.lbl_plural_more_than_one_minute, String.valueOf(minutes));
            string6.getClass();
            return string6;
        }
        if (minutes == 60) {
            if (z17) {
                String string7 = context.getString(R.string.common_hours_left_capped_singular);
                string7.getClass();
                return string7;
            }
            String string8 = context.getString(R.string.lbl_plural_one_hour, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            string8.getClass();
            return string8;
        }
        int i14 = minutes / 60;
        int i15 = minutes % 60;
        if (i15 == 0) {
            if (z17) {
                String string9 = context.getString(R.string.common_hours_left_capped_plural, String.valueOf(i14));
                string9.getClass();
                return string9;
            }
            String string10 = context.getString(R.string.lbl_plural_more_than_one_hour, String.valueOf(i14));
            string10.getClass();
            return string10;
        }
        if (z16) {
            String string11 = i14 > 1 ? context.getString(R.string.lbl_hours_and_minutes, String.valueOf(i14), String.valueOf(i15)) : context.getString(R.string.lbl_one_hour_x_mins, Integer.valueOf(i15));
            string11.getClass();
            if (!z17) {
                return string11;
            }
            String string12 = context.getString(R.string.common_time_left, string11);
            string12.getClass();
            return string12;
        }
        String string13 = context.getString(R.string.challenge_h_min, Integer.valueOf(i14), Integer.valueOf(i15));
        string13.getClass();
        if (!z17) {
            return string13;
        }
        String string14 = context.getString(R.string.common_time_left, string13);
        string14.getClass();
        return string14;
    }

    public static /* synthetic */ String h(x xVar, Context context, DateTime dateTime, boolean z14, boolean z15) {
        xVar.getClass();
        return g(context, dateTime, z14, z15, false);
    }

    public static String i(LocalDate localDate, boolean z14) {
        if (z14) {
            return c22.j0.a(localDate.toDateTimeAtStartOfDay(), 'F');
        }
        c22.j0 j0Var = c22.j0.f23099a;
        DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
        j0Var.getClass();
        return c22.j0.k(dateTimeAtStartOfDay, 'L');
    }

    public static final String j(Context context, DateTime dateTime, DateTime dateTime2, boolean z14, boolean z15) {
        context.getClass();
        if (dateTime == null || dateTime2 == null) {
            return "";
        }
        int hours = (int) ((Hours.hoursBetween(dateTime, dateTime2).getHours() / 24.0f) + 0.5f);
        DateTime dateTimeWithTimeAtStartOfDay = dateTime.withTimeAtStartOfDay();
        DateTime dateTimePlusDays = dateTimeWithTimeAtStartOfDay.plusDays(hours);
        DateTime dateTimeMinusSeconds = dateTimePlusDays.minusSeconds(1);
        DateTime dateTimeNow = DateTime.now();
        boolean zIsAfter = dateTimeNow.isAfter(dateTimeWithTimeAtStartOfDay);
        x xVar = f37955a;
        if (!zIsAfter) {
            if (Days.daysBetween(dateTimeNow, dateTimeWithTimeAtStartOfDay).getDays() == 0) {
                if (!z15) {
                    String string = context.getString(R.string.common_starts_in, h(xVar, context, dateTimeWithTimeAtStartOfDay, z14, zIsAfter));
                    string.getClass();
                    return string;
                }
                xVar.getClass();
                String string2 = context.getString(R.string.common_starts_in, g(context, dateTimeWithTimeAtStartOfDay, z14, zIsAfter, true));
                string2.getClass();
                return string2;
            }
            if (!z15) {
                String string3 = context.getString(R.string.lbl_starts, h(xVar, context, dateTimeWithTimeAtStartOfDay, z14, zIsAfter));
                string3.getClass();
                return string3;
            }
            xVar.getClass();
            String string4 = context.getString(R.string.lbl_starts, g(context, dateTimeWithTimeAtStartOfDay, z14, zIsAfter, true));
            string4.getClass();
            return string4;
        }
        if (!dateTimeNow.isBefore(dateTimePlusDays)) {
            if (!z15) {
                String string5 = context.getString(R.string.lbl_group_challenge_ended, h(xVar, context, dateTimeMinusSeconds, true, true));
                string5.getClass();
                return string5;
            }
            xVar.getClass();
            String string6 = context.getString(R.string.lbl_group_challenge_ended, g(context, dateTimeMinusSeconds, true, true, true));
            string6.getClass();
            return string6;
        }
        if (!dateTimeNow.isBefore(dateTimePlusDays.minusDays(1))) {
            if (!z15) {
                return h(xVar, context, dateTimeMinusSeconds, true, true);
            }
            xVar.getClass();
            return g(context, dateTimeMinusSeconds, true, true, true);
        }
        if (!z15) {
            String string7 = context.getString(R.string.lbl_group_challenge_ends, h(xVar, context, dateTimeMinusSeconds, true, true));
            string7.getClass();
            return string7;
        }
        xVar.getClass();
        String string8 = context.getString(R.string.lbl_group_challenge_ends, g(context, dateTimeMinusSeconds, true, true, true));
        string8.getClass();
        return string8;
    }

    public static final String k(Context context, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var, String str) {
        List<com.garmin.android.apps.connectmobile.leaderboard.model.b0> listA;
        String string;
        context.getClass();
        str.getClass();
        StringBuilder sb3 = new StringBuilder();
        if (a0Var != null && (listA = a0Var.A()) != null && !listA.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int size = a0Var.A().size();
            boolean z14 = false;
            for (int i14 = 0; i14 < size; i14++) {
                com.garmin.android.apps.connectmobile.leaderboard.model.b0 b0Var = a0Var.A().get(i14);
                if (str.equals(b0Var.getDisplayName())) {
                    z14 = true;
                } else {
                    String strA = c22.p0.a(b0Var.getFullName(), b0Var.getDisplayName());
                    if (strA == null) {
                        strA = "";
                    }
                    arrayList.add(strA);
                }
            }
            if (arrayList.size() > 0) {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    sb3.append((String) arrayList.get(i15));
                    if (i15 < arrayList.size() - 1) {
                        sb3.append(", ");
                    }
                }
            }
            if (z14) {
                if (arrayList.size() >= 2) {
                    string = context.getString(R.string.social_multiple_people_and_you, sb3.toString());
                    string.getClass();
                } else if (arrayList.size() == 1) {
                    string = context.getString(R.string.social_one_person_and_you, sb3.toString());
                    string.getClass();
                } else {
                    string = context.getString(R.string.lbl_you);
                    string.getClass();
                }
                sb3.setLength(0);
                sb3.append(string);
            }
        }
        return sb3.toString();
    }

    public static final String l(Context context, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var, gg1.o0 o0Var) {
        a0Var.getClass();
        o0Var.getClass();
        Double badgeProgressValue = a0Var.getBadgeProgressValue();
        double dDoubleValue = badgeProgressValue != null ? badgeProgressValue.doubleValue() : 0.0d;
        Double badgeTargetValue = a0Var.getBadgeTargetValue();
        double dDoubleValue2 = badgeTargetValue != null ? badgeTargetValue.doubleValue() : 0.0d;
        Integer badgeUnitId = a0Var.getBadgeUnitId();
        String string = context.getString(R.string.string_space_bullet_string_pattern, uu.p.a(context, dDoubleValue, dDoubleValue2, badgeUnitId != null ? badgeUnitId.intValue() : 0, false, o0Var, false), j(context, a0Var.getStartDate(), a0Var.getEndDate(), true, false));
        string.getClass();
        return string;
    }

    public static final String m(Context context, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var, gg1.o0 o0Var) {
        a0Var.getClass();
        o0Var.getClass();
        Double badgeProgressValue = a0Var.getBadgeProgressValue();
        double dDoubleValue = badgeProgressValue != null ? badgeProgressValue.doubleValue() : 0.0d;
        Double badgeTargetValue = a0Var.getBadgeTargetValue();
        double dDoubleValue2 = badgeTargetValue != null ? badgeTargetValue.doubleValue() : 0.0d;
        Integer badgeUnitId = a0Var.getBadgeUnitId();
        String string = context.getString(R.string.string_space_bullet_string_pattern, uu.p.a(context, dDoubleValue, dDoubleValue2, badgeUnitId != null ? badgeUnitId.intValue() : 0, true, o0Var, false), j(context, a0Var.getStartDate(), a0Var.getEndDate(), true, true));
        string.getClass();
        return string;
    }

    public static final String n(Context context, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var) {
        List<String> listF;
        context.getClass();
        if (a0Var == null || (listF = a0Var.F()) == null || listF.isEmpty() || a0Var.F().size() < 2) {
            return "";
        }
        String string = context.getString(R.string.social_challenge_team_versus_team, a0Var.F().get(0), a0Var.F().get(1));
        string.getClass();
        return string;
    }

    public static final String o(Context context, AdHocChallengeDTO adHocChallengeDTO, boolean z14) {
        String strJ;
        String strJ2;
        if (adHocChallengeDTO == null) {
            return "";
        }
        DateTime dateTimeN = !TextUtils.isEmpty(adHocChallengeDTO.f37994h) ? c22.j0.N(adHocChallengeDTO.f37994h, false) : null;
        DateTime dateTimeN2 = TextUtils.isEmpty(adHocChallengeDTO.f37995i) ? null : c22.j0.N(adHocChallengeDTO.f37995i, false);
        if (dateTimeN == null || dateTimeN2 == null) {
            return "";
        }
        int hours = (int) ((Hours.hoursBetween(dateTimeN, dateTimeN2).getHours() / 24.0f) + 0.5f);
        DateTime dateTimeWithTimeAtStartOfDay = dateTimeN.withTimeAtStartOfDay();
        DateTime dateTimeMinusSeconds = dateTimeWithTimeAtStartOfDay.plusDays(hours).minusSeconds(1);
        DateTime dateTimeNow = DateTime.now();
        boolean zIsAfter = dateTimeNow.isAfter(dateTimeN);
        if (z14 && zIsAfter) {
            return j(context, dateTimeN, dateTimeN2, z14, false);
        }
        if (Math.abs(Days.daysBetween(dateTimeNow, dateTimeWithTimeAtStartOfDay).getDays()) < 365) {
            strJ = c22.j0.m(dateTimeWithTimeAtStartOfDay);
        } else {
            c22.j0.f23099a.getClass();
            strJ = c22.j0.j(dateTimeWithTimeAtStartOfDay);
        }
        if (Math.abs(Days.daysBetween(dateTimeNow, dateTimeMinusSeconds).getDays()) < 365) {
            strJ2 = c22.j0.m(dateTimeMinusSeconds);
        } else {
            c22.j0.f23099a.getClass();
            strJ2 = c22.j0.j(dateTimeMinusSeconds);
        }
        return hours == 1 ? strJ : context.getString(R.string.string_line_string_pattern, strJ, strJ2);
    }

    public static final String p(Context context, AdHocChallengeDTO adHocChallengeDTO) {
        String str;
        return (adHocChallengeDTO == null || (str = adHocChallengeDTO.f37990d) == null || str.length() <= 0) ? context.getString(R.string.challenge_title) : adHocChallengeDTO.f37990d;
    }

    public static final String q(int i14, Context context) {
        context.getClass();
        if (i14 == 0) {
            String string = context.getString(R.string.social_steps_challenge);
            string.getClass();
            return string;
        }
        l3.f23124b.getClass();
        String string2 = context.getString(R.string.challenge_step_level_title, l3.a.a1(i14));
        string2.getClass();
        return string2;
    }

    public static final String r(Context context, com.garmin.android.apps.connectmobile.leaderboard.model.s sVar, double d14) {
        sVar.getClass();
        switch (a.f37956a[sVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                l3.a aVar = l3.f23124b;
                m3 m3Var = am.j.z(f12.l.f68084a) ? m3.KILOMETER : m3.MILE;
                DecimalFormat decimalFormat = l3.f23129g;
                aVar.getClass();
                return l3.a.O(context, d14, m3Var, decimalFormat, true);
            case 6:
                return l3.a.H(l3.f23124b, new l22.a(context), d14, true);
            case 7:
            case 8:
            case 9:
                NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
                numberFormat.setMaximumFractionDigits(0);
                numberFormat.setRoundingMode(RoundingMode.HALF_UP);
                String str = numberFormat.format(d14);
                str.getClass();
                return str;
            case 10:
                m3 m3Var2 = am.j.z(f12.l.f68084a) ? m3.METER : m3.YARD;
                l3.f23124b.getClass();
                return l3.a.P(context, d14, m3Var2, l3.f23131i, true, context.getString(R.string.no_value));
            default:
                return "";
        }
    }

    public static final c2 s(AdHocChallengeDTO adHocChallengeDTO) {
        com.garmin.android.apps.connectmobile.leaderboard.model.w wVar;
        adHocChallengeDTO.getClass();
        com.garmin.android.apps.connectmobile.leaderboard.model.w.a aVar = com.garmin.android.apps.connectmobile.leaderboard.model.w.f38366b;
        int i14 = adHocChallengeDTO.f37987a;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.leaderboard.model.w[] wVarArrValues = com.garmin.android.apps.connectmobile.leaderboard.model.w.values();
        int length = wVarArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                wVar = com.garmin.android.apps.connectmobile.leaderboard.model.w.UNKNOWN;
                break;
            }
            wVar = wVarArrValues[i15];
            if (wVar.f38375a == i14) {
                break;
            }
            i15++;
        }
        return wVar == com.garmin.android.apps.connectmobile.leaderboard.model.w.VIVOKID_TEAM ? c2.VIVOKID_TEAM_CHALLENGE : c2.VIVOKID_ADHOC_CHALLENGE;
    }

    public static final boolean t(AdHocChallengeDTO adHocChallengeDTO) {
        return adHocChallengeDTO != null && (adHocChallengeDTO instanceof VivoKidAdHocChallengeDTO);
    }

    public static final boolean u(Context context) {
        return hb2.j.b(context, "com.garmin.android.apps.vivokid") || hb2.j.b(context, "com.garmin.android.apps.vivokid.beta");
    }

    public static final boolean v() {
        bv.b.f21239a.getClass();
        bv.b.a();
        return k1.f37122a.l0();
    }

    public static void w(e23.a aVar, Context context) {
        new androidx.appcompat.app.e.a(context).setTitle(R.string.social_weekly_steps_challenge).setMessage(R.string.msg_implicit_consent_badge_auto_challenge_prerequisite).setPositiveButton(R.string.lbl_join, new c32.a(aVar, 6)).setNegativeButton(R.string.smart_scale_device_setup_connections_invite_maybe_later, new mt0.y(3)).create().show();
    }

    public static ot0.a x(AdHocChallengePlayerDTO adHocChallengePlayerDTO, b12.b bVar, b12.b bVar2) {
        adHocChallengePlayerDTO.getClass();
        boolean z14 = (adHocChallengePlayerDTO instanceof VivoKidAdHocChallengePlayerDTO) && ((VivoKidAdHocChallengePlayerDTO) adHocChallengePlayerDTO).f38050p != -1;
        return new ot0.a(adHocChallengePlayerDTO.f38007a, adHocChallengePlayerDTO.f38008b, adHocChallengePlayerDTO.f38009c, adHocChallengePlayerDTO.f38010d, adHocChallengePlayerDTO.f38011e, adHocChallengePlayerDTO.f38012f, adHocChallengePlayerDTO.f38013g, adHocChallengePlayerDTO.f38014h, Boolean.valueOf(z14), z14 ? ((VivoKidAdHocChallengePlayerDTO) adHocChallengePlayerDTO).f38050p : -1, bVar, bVar2);
    }
}
