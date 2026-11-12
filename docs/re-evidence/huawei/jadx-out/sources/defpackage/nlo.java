package defpackage;

import com.huawei.hwhealthdatamgr.R;

/* JADX INFO: loaded from: classes11.dex */
public class nlo {
    public static String c(int i, int i2) {
        switch (i) {
            case 1:
                return qre.e(R.plurals.IDS_fa_tip_today_not_complete_goal_2, i2, Integer.valueOf(i2));
            case 2:
                return qre.e(R.plurals.IDS_fa_tip_today_not_complete_goal_3, i2, Integer.valueOf(i2));
            case 3:
                return qre.e(R.plurals.IDS_fa_tip_today_not_complete_goal_4, i2, Integer.valueOf(i2));
            case 4:
                return qre.e(R.plurals.IDS_fa_tip_today_not_complete_goal_5, i2, Integer.valueOf(i2));
            case 5:
                return qre.e(R.plurals.IDS_fa_tip_today_not_complete_goal_6, i2, Integer.valueOf(i2));
            case 6:
                return qre.e(R.plurals.IDS_fa_tip_today_not_complete_goal_7, i2, Integer.valueOf(i2));
            default:
                return qre.e(R.plurals.IDS_fa_tip_today_not_complete_goal_1, i2, Integer.valueOf(i2));
        }
    }

    public static String d(int i, String str) {
        if (i == 1) {
            return qre.a(R.string.IDS_fa_tip_new_sport_2, str);
        }
        if (i == 2) {
            return qre.a(R.string.IDS_fa_tip_new_sport_3, str);
        }
        if (i == 3) {
            return qre.a(R.string.IDS_fa_tip_new_sport_4, str);
        }
        return qre.a(R.string.IDS_fa_tip_new_sport_1, str);
    }

    public static String b(int i, int i2) {
        if (i == 1) {
            return qre.a(R.string.IDS_fa_tip_join_symbol, qre.a(R.string.IDS_fa_tip_low_step_2_p1, 7), qre.e(R.plurals.IDS_fa_tip_low_step_2_p2, i2, Integer.valueOf(i2)));
        }
        if (i == 2) {
            return qre.f(R.string.IDS_fa_tip_low_step_3);
        }
        if (i == 3) {
            return qre.a(R.string.IDS_fa_tip_low_step_4, 7);
        }
        return qre.e(R.plurals.IDS_fa_tip_low_step_1, i2, Integer.valueOf(i2));
    }

    public static String a(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z = i2 > 30;
        switch (i) {
            case 1:
                if (z) {
                    i4 = R.plurals.IDS_fa_tip_multi_day_not_complete_goal_2_over_30_days;
                } else {
                    i4 = R.plurals.IDS_fa_tip_multi_day_not_complete_goal_2;
                }
                return qre.e(i4, i2, Integer.valueOf(i2));
            case 2:
                if (z) {
                    i5 = R.plurals.IDS_fa_tip_multi_day_not_complete_goal_3_over_30_days;
                } else {
                    i5 = R.plurals.IDS_fa_tip_multi_day_not_complete_goal_3;
                }
                return qre.e(i5, i2, Integer.valueOf(i2));
            case 3:
                return qre.f(R.string.IDS_fa_tip_multi_day_not_complete_goal_4);
            case 4:
                if (z) {
                    i6 = R.plurals.IDS_fa_tip_multi_day_not_complete_goal_5_over_30_days;
                } else {
                    i6 = R.plurals.IDS_fa_tip_multi_day_not_complete_goal_5;
                }
                return qre.e(i6, i2, Integer.valueOf(i2));
            case 5:
                return qre.a(R.string.IDS_fa_tip_join_symbol, qre.e(R.plurals.IDS_fa_tip_multi_day_not_complete_goal_6_p1, 1, 1), qre.e(R.plurals.IDS_fa_tip_multi_day_not_complete_goal_6_p2, i3, Integer.valueOf(i3)));
            case 6:
                if (z) {
                    i7 = R.plurals.IDS_fa_tip_multi_day_not_complete_goal_7_over_30_days;
                } else {
                    i7 = R.plurals.IDS_fa_tip_multi_day_not_complete_goal_7;
                }
                return qre.e(i7, i2, Integer.valueOf(i2));
            default:
                if (z) {
                    i8 = R.plurals.IDS_fa_tip_multi_day_not_complete_goal_1_over_30_days;
                } else {
                    i8 = R.plurals.IDS_fa_tip_multi_day_not_complete_goal_1;
                }
                return qre.e(i8, i2, Integer.valueOf(i2));
        }
    }

    public static int b(int i) {
        return qrf.d(i);
    }

    public static String e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z = i2 > 30;
        switch (i) {
            case 1:
                if (z) {
                    i3 = R.plurals.IDS_fa_tip_multi_day_complete_goal_2_over_30_days;
                } else {
                    i3 = R.plurals.IDS_fa_tip_multi_day_complete_goal_2;
                }
                return qre.e(i3, i2, Integer.valueOf(i2));
            case 2:
                if (z) {
                    i4 = R.plurals.IDS_fa_tip_multi_day_complete_goal_3_over_30_days;
                } else {
                    i4 = R.plurals.IDS_fa_tip_multi_day_complete_goal_3;
                }
                return qre.e(i4, i2, Integer.valueOf(i2));
            case 3:
                if (z) {
                    i5 = R.plurals.IDS_fa_tip_multi_day_complete_goal_4_over_30_days;
                } else {
                    i5 = R.plurals.IDS_fa_tip_multi_day_complete_goal_4;
                }
                return qre.e(i5, i2, Integer.valueOf(i2));
            case 4:
                if (z) {
                    i6 = R.plurals.IDS_fa_tip_multi_day_complete_goal_5_over_30_days;
                } else {
                    i6 = R.plurals.IDS_fa_tip_multi_day_complete_goal_5;
                }
                return qre.e(i6, i2, Integer.valueOf(i2));
            case 5:
                if (z) {
                    i7 = R.plurals.IDS_fa_tip_multi_day_complete_goal_6_over_30_days;
                } else {
                    i7 = R.plurals.IDS_fa_tip_multi_day_complete_goal_6;
                }
                return qre.e(i7, i2, Integer.valueOf(i2));
            case 6:
                if (z) {
                    i8 = R.plurals.IDS_fa_tip_multi_day_complete_goal_7_over_30_days;
                } else {
                    i8 = R.plurals.IDS_fa_tip_multi_day_complete_goal_7;
                }
                return qre.e(i8, i2, Integer.valueOf(i2));
            default:
                if (z) {
                    i9 = R.plurals.IDS_fa_tip_multi_day_complete_goal_1_over_30_days;
                } else {
                    i9 = R.plurals.IDS_fa_tip_multi_day_complete_goal_1;
                }
                return qre.e(i9, i2, Integer.valueOf(i2));
        }
    }
}
