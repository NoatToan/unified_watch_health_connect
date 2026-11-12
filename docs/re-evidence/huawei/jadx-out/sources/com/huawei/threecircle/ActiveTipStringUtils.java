package com.huawei.threecircle;

import android.content.Context;
import com.huawei.caloriecalculate.ActivityCaloriesCalculateApi;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.chh;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.security.SecureRandom;
import java.util.HashMap;

/* JADX INFO: loaded from: classes15.dex */
public class ActiveTipStringUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f23177a = {R.string.IDS_hw_health_active_record_tips_one_one, R.string.IDS_hw_health_active_record_tips_one_two, R.string.IDS_hw_health_active_record_tips_one_three};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f23179c = {R.string.IDS_hw_health_active_record_tips_three_one, R.string.IDS_hw_health_active_record_tips_three_two, R.string.IDS_hw_health_active_record_tips_three_three, R.string.IDS_hw_health_active_record_tips_three_four};
    private static final int[] d = {R.string.IDS_hw_health_active_record_tips_four_one, R.string.IDS_hw_health_active_record_tips_four_two, R.string.IDS_hw_health_active_record_tips_four_three};
    private static final int[] i = {R.string.IDS_hw_health_active_record_tips_five_calories_one, R.string.IDS_hw_health_active_record_tips_five_calories_two};
    private static final int[] j = {R.string.IDS_hw_health_active_record_tips_title_one, R.string.IDS_hw_health_active_record_tips_title_two, R.string.IDS_hw_health_active_record_tips_title_three, R.string.IDS_hw_health_active_record_tips_title_four};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f23178b = {R.string.IDS_active_tip_workout_1, R.string.IDS_active_tip_workout_2, R.string.IDS_active_tip_workout_3, R.string.IDS_active_tip_workout_4, R.string.IDS_active_tip_workout_5};
    private static final int[] e = {R.string.IDS_active_tip_heat_1, R.string.IDS_active_tip_heat_2, R.string.IDS_active_tip_heat_3, R.string.IDS_active_tip_heat_4};

    public enum TipType {
        STAND_HOUR,
        WORKOUT,
        CALORIES,
        TASK_SUBSCRIBE,
        TASK_BONUS_GET,
        TASK_BONUS_USE,
        TASK_STAND_HOUR,
        TASK_WORKOUT,
        TASK_CALORIES
    }

    private static int b(int i2) {
        return i2 >= 3 ? 257 : 258;
    }

    public static HashMap<String, String> d(int i2, TipType tipType) {
        LogUtil.a("SCUI_ActiveTipStringUtils", "get tip context with value: ", Integer.valueOf(i2), " type: ", tipType);
        HashMap<String, String> map = new HashMap<>(3);
        map.put("title_key", e());
        int iOrdinal = tipType.ordinal();
        if (iOrdinal == 0) {
            map.put("description_key", qre.a(R.string.IDS_active_tip_hour, qre.e(R.plurals.IDS_single_circle_active_target_desc, i2, UnitUtil.e(i2, 1, 0))));
            map.put("button_key", a(0));
            return map;
        }
        if (iOrdinal == 1) {
            d(map, i2);
            return map;
        }
        if (iOrdinal != 2) {
            return map;
        }
        a(map, i2);
        return map;
    }

    public static HashMap<String, Object> d(int i2, TipType tipType, int i3, int i4, int i5, int i6) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("icon_key", Integer.valueOf(e(tipType)));
        String strC = c(R.plurals.IDS_active_task_point, i4);
        String strC2 = c(R.plurals.IDS_active_task_unfinish_days, i3);
        switch (tipType.ordinal()) {
            case 3:
                String strC3 = c(R.plurals.IDS_user_profile_achieve_num_day, i6);
                String strC4 = c(R.plurals.IDS_active_task_point, i5);
                map.put("title_key", qre.f(R.string.IDS_active_task_tip_subscribe_title));
                map.put("description_key", qre.a(R.string.IDS_active_task_tip_subscribe_text, strC3, strC4));
                map.put("button_key", qre.f(R.string.IDS_active_task_tip_subscribe_button));
                break;
            case 4:
                map.put("title_key", qre.f(R.string.IDS_active_task_tip_get_title));
                map.put("description_key", qre.a(R.string.IDS_active_task_tip_get_text, strC));
                map.put("button_key", qre.f(R.string.IDS_active_task_tip_get_button));
                break;
            case 5:
                map.put("title_key", qre.f(R.string.IDS_active_task_tip_use_title));
                map.put("description_key", qre.a(R.string.IDS_active_task_tip_use_text, strC));
                map.put("button_key", qre.f(R.string.IDS_active_task_tip_use_button));
                break;
            case 6:
                String strE = qre.e(R.plurals.IDS_hour_string_21, i2, Integer.valueOf(i2));
                map.put("title_key", qre.f(R.string.IDS_active_task_tip_hour_title));
                map.put("description_key", qre.a(R.string.IDS_active_task_tip_hour_text, strC2, strE));
                map.put("button_key", a(0));
                break;
            case 7:
                String strC5 = c(R.plurals.IDS_min_insert_unit, i2);
                map.put("title_key", qre.f(R.string.IDS_active_task_tip_workout_title));
                map.put("description_key", qre.a(R.string.IDS_active_task_tip_workout_text, strC5, strC2));
                map.put("sport_type_key", String.valueOf(258));
                map.put("button_key", a(258));
                map.put("sport_diff_time_key", String.valueOf(i2));
                break;
            case 8:
                int iA = a(i2, 258);
                String strC6 = c(R.plurals.IDS_min_insert_unit, iA);
                map.put("title_key", qre.f(R.string.IDS_active_task_tip_calories_title));
                map.put("description_key", qre.a(R.string.IDS_active_task_tip_calories_text, strC2, strC6));
                map.put("sport_type_key", String.valueOf(258));
                map.put("button_key", a(258));
                map.put("sport_diff_time_key", String.valueOf(iA));
                break;
            default:
                map.putAll(d(i2, tipType));
                break;
        }
        return map;
    }

    private static void d(HashMap<String, String> map, int i2) {
        int iB;
        String strA;
        if (LanguageUtil.l(BaseApplication.b())) {
            int[] iArr = f23179c;
            int iD = d(iArr.length);
            iB = b(iD);
            String strF = qre.f(R.string.IDS_hw_health_active_record_tips_five_workout);
            int[] iArr2 = f23177a;
            String strConcat = qre.f(iArr2[d(iArr2.length)]).concat(e(i2)).concat(qre.f(iArr[iD]));
            int[] iArr3 = d;
            strA = strConcat.concat(qre.f(iArr3[d(iArr3.length)])).concat(strF);
        } else {
            int[] iArr4 = f23178b;
            int iD2 = d(iArr4.length);
            iB = b(iD2);
            strA = qre.a(iArr4[iD2], e(i2));
        }
        map.put("sport_diff_time_key", String.valueOf(i2));
        map.put("description_key", strA);
        map.put("sport_type_key", String.valueOf(iB));
        map.put("button_key", a(iB));
    }

    private static void a(HashMap<String, String> map, int i2) {
        int iB;
        int iMax;
        String strA;
        if (LanguageUtil.l(BaseApplication.b())) {
            int[] iArr = f23179c;
            int iD = d(iArr.length);
            iB = b(iD);
            int[] iArr2 = i;
            String strF = qre.f(iArr2[d(iArr2.length)]);
            iMax = Math.max(1, a(i2, iB));
            int[] iArr3 = f23177a;
            String strConcat = qre.f(iArr3[d(iArr3.length)]).concat(e(iMax)).concat(qre.f(iArr[iD]));
            int[] iArr4 = d;
            strA = strConcat.concat(qre.f(iArr4[d(iArr4.length)])).concat(strF);
        } else {
            int[] iArr5 = e;
            int iD2 = d(iArr5.length);
            iB = b(iD2);
            iMax = Math.max(1, a(i2, iB));
            strA = qre.a(iArr5[iD2], e(iMax));
        }
        map.put("sport_diff_time_key", String.valueOf(iMax));
        map.put("description_key", strA);
        map.put("sport_type_key", String.valueOf(iB));
        map.put("button_key", a(iB));
    }

    private static String e(int i2) {
        return qre.e(R.plurals.IDS_min_insert_unit, i2, UnitUtil.e(i2, 1, 0));
    }

    public static int a(int i2, int i3) {
        ActivityCaloriesCalculateApi activityCaloriesCalculateApi = (ActivityCaloriesCalculateApi) Services.b("BaseSportModel", ActivityCaloriesCalculateApi.class);
        activityCaloriesCalculateApi.initUserInfo(chh.a(((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo()));
        int i4 = i3 == 258 ? 0 : 1;
        float f = i2 / 1000.0f;
        long jCalculateDurationByCalories = activityCaloriesCalculateApi.calculateDurationByCalories(f, i3, i4);
        LogUtil.a("SCUI_ActiveTipStringUtils", "time: ", Long.valueOf(jCalculateDurationByCalories), "intensity: ", Integer.valueOf(i4), "mSportType:", Integer.valueOf(i3), "calories:", Float.valueOf(f));
        return (int) jCalculateDurationByCalories;
    }

    public static boolean c() {
        Context contextB = BaseApplication.b();
        if (!VersionControlUtil.isSupportOperationAccount()) {
            return false;
        }
        if (!Utils.o()) {
            return true;
        }
        return ((OperationUtilsApi) Services.b("PluginOperation", OperationUtilsApi.class)).isSupportCountry(LoginInit.getInstance(contextB).getAccountInfo(1010), "ai-threeCircle-001", com.huawei.hwcommonmodel.R.array.three_circle_task_country_code);
    }

    private static String e() {
        int[] iArr = j;
        return qre.f(iArr[d(iArr.length)]);
    }

    private static String a(int i2) {
        if (i2 == 257) {
            return qre.f(R.string.IDS_fitness_walk);
        }
        if (i2 == 258) {
            return qre.f(R.string.IDS_main_time_line_start_workout);
        }
        return qre.f(R.string.IDS_active_mark_stand);
    }

    private static int e(TipType tipType) {
        int iOrdinal = tipType.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 6) {
                        if (iOrdinal != 7) {
                            if (iOrdinal != 8) {
                                if (Utils.o()) {
                                    return R.drawable.ic_record_tips_task_oversea;
                                }
                                return R.drawable.ic_record_tips_task;
                            }
                        }
                    }
                }
                return R.drawable.ic_record_tips_kcal;
            }
            return R.drawable.ic_record_tips_workout;
        }
        return R.drawable.ic_record_tips_hours;
    }

    private static String c(int i2, int i3) {
        return qre.e(i2, i3, UnitUtil.e(i3, 1, 0));
    }

    private static int d(int i2) {
        return new SecureRandom().nextInt(i2);
    }
}
