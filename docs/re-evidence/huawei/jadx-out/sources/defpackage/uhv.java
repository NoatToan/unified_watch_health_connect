package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import com.huawei.caloriecalculate.ActivityCaloriesCalculateApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CalculateDistanceUtils;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class uhv {
    public static CharSequence e(Context context, int i, uht uhtVar) {
        int iRound = Math.round(i / 1000.0f);
        int iD = d(iRound);
        Resources resources = context.getResources();
        if (iD == -1) {
            if (uhtVar != null && uhtVar.a()) {
                uhtVar.d(iD);
            }
            return resources.getString(R.string.IDS_hw_common_ui_have_step_less);
        }
        if (uhtVar != null && uhtVar.a()) {
            uhtVar.d(iD);
        }
        String strE = UnitUtil.e(iRound, 1, 0);
        d dVar = new d();
        e(iD, iRound, resources, dVar, uhtVar);
        if (dVar.f50106c == null) {
            if (uhtVar != null) {
                uhtVar.d(-1);
            }
            return resources.getString(R.string.IDS_hw_common_ui_have_step_less);
        }
        String str = String.format(Locale.ROOT, context.getResources().getString(R.string.IDS_hw_common_ui_have_consumed), strE, dVar.d);
        int iIndexOf = dVar.d.indexOf(dVar.f50106c);
        if (iIndexOf == -1) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf2 = str.indexOf(dVar.d) + iIndexOf;
        qri.d(spannableString, iIndexOf2, dVar.f50106c.length() + iIndexOf2, new ForegroundColorSpan(Color.parseColor("#FB6522")));
        return spannableString;
    }

    private static int d(int i) {
        if (i < 25) {
            return -1;
        }
        int i2 = i % 300;
        if (i2 < 25 || i2 >= 275) {
            return 3;
        }
        int i3 = i % 250;
        if (i3 < 25 || i3 >= 225) {
            return 2;
        }
        int i4 = i % 150;
        return (i4 < 25 || i4 >= 125) ? 1 : 0;
    }

    private static void e(int i, int i2, Resources resources, d dVar, uht uhtVar) {
        float f = i2 * 1.0f;
        int iRound = Math.round(f / 50.0f);
        int iRound2 = Math.round(f / 150.0f);
        int iRound3 = Math.round(f / 250.0f);
        int iRound4 = Math.round(f / 300.0f);
        if (i == 0) {
            dVar.f50106c = UnitUtil.e(iRound, 1, 0);
            dVar.d = resources.getQuantityString(R.plurals.IDS_hw_common_ui_egg_string, iRound, dVar.f50106c);
        } else if (i == 1) {
            dVar.f50106c = UnitUtil.e(iRound2, 1, 0);
            dVar.d = resources.getQuantityString(R.plurals.IDS_hw_common_ui_icecream_string, iRound2, dVar.f50106c);
            iRound = iRound2;
        } else if (i == 2) {
            dVar.f50106c = UnitUtil.e(iRound3, 1, 0);
            dVar.d = resources.getQuantityString(R.plurals.IDS_hw_common_ui_hamburger_string, iRound3, dVar.f50106c);
            iRound = iRound3;
        } else if (i == 3) {
            dVar.f50106c = UnitUtil.e(iRound4, 1, 0);
            dVar.d = resources.getQuantityString(R.plurals.IDS_hw_common_ui_chicken_leg_string, iRound4, dVar.f50106c);
            iRound = iRound4;
        } else {
            LogUtil.a("SCUI_StepUnitUtil", "wrong indexOfArray");
            iRound = 0;
        }
        if (uhtVar != null) {
            uhtVar.a(iRound);
        }
    }

    public static double b(float f) {
        LogUtil.a("SCUI_StepUnitUtil", "getCalculateDistance totalStep ", Float.valueOf(f));
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo != null) {
            return CalculateDistanceUtils.e((int) f, userInfo.getHeightOrDefaultValue()) * 1000.0d;
        }
        return 0.0d;
    }

    public static double d(float f) {
        ActivityCaloriesCalculateApi activityCaloriesCalculateApi = (ActivityCaloriesCalculateApi) Services.b("BaseSportModel", ActivityCaloriesCalculateApi.class);
        activityCaloriesCalculateApi.initUserInfo(chh.a(((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo()));
        return activityCaloriesCalculateApi != null ? activityCaloriesCalculateApi.calculateCaloriesOnlyStep((int) f) * 1000.0f : 0.0f;
    }

    public static int b(float f, int i, int i2) {
        long jCalculateDurationByCalories;
        ActivityCaloriesCalculateApi activityCaloriesCalculateApi = (ActivityCaloriesCalculateApi) Services.b("BaseSportModel", ActivityCaloriesCalculateApi.class);
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        if (activityCaloriesCalculateApi == null || userProfileMgrApi == null) {
            jCalculateDurationByCalories = 0;
        } else {
            activityCaloriesCalculateApi.initUserInfo(chh.a(userProfileMgrApi.getUserInfo()));
            jCalculateDurationByCalories = activityCaloriesCalculateApi.calculateDurationByCalories(f, i, i2);
        }
        return (int) jCalculateDurationByCalories;
    }

    public static String b(int i) {
        int i2;
        int i3;
        int iD = d(i);
        if (iD == 0) {
            i2 = R.plurals.IDS_hw_common_equi_egg;
            i3 = 50;
        } else if (iD == 1) {
            i2 = R.plurals.IDS_hw_common_equi_icecream;
            i3 = 150;
        } else if (iD == 2) {
            i2 = R.plurals.IDS_hw_common_equi_hamburger;
            i3 = 250;
        } else if (iD == 3) {
            i2 = R.plurals.IDS_hw_common_equi_chicken_leg;
            i3 = 300;
        } else {
            i2 = R.string.IDS_hw_common_ui_have_step_less;
            i3 = 1;
        }
        LogUtil.a("SCUI_StepUnitUtil", "foodType ", Integer.valueOf(iD), "transferCalorie ", Integer.valueOf(i3));
        if (iD < 0) {
            return BaseApplication.getContext().getResources().getString(i2);
        }
        float f = (i * 1.0f) / i3;
        String strE = UnitUtil.e(Math.round(f), 1, 0);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        return BaseApplication.getContext().getResources().getQuantityString(i2, Math.round(f), strE);
    }

    public static void d(Context context) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        if (context instanceof FitnessStepDetailActivity) {
            ((FitnessStepDetailActivity) context).c(context.getResources().getString(R.string.IDS_fitness_goal_achieved));
        }
    }

    public static void e(Context context, float f, float f2) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        int iRound = Math.round(f2 - f);
        if (context instanceof FitnessStepDetailActivity) {
            ((FitnessStepDetailActivity) context).c(context.getResources().getQuantityString(R.plurals.IDS_fitness_completed_goal, iRound, UnitUtil.e(iRound, 1, 0)));
        }
    }

    public static void c(Context context, int i) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        if (context instanceof FitnessStepDetailActivity) {
            ((FitnessStepDetailActivity) context).e(i);
        }
    }

    public static int e(float f, int i) {
        return Math.max(Math.round((f * 100.0f) / i), 1);
    }

    /* JADX INFO: loaded from: classes43.dex */
    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f50106c;
        String d;

        private d() {
        }
    }

    public static boolean e() {
        Pair<Long, Integer> pairC = c();
        Long l = (Long) pairC.first;
        long jLongValue = l.longValue();
        Integer num = (Integer) pairC.second;
        int iIntValue = num.intValue();
        com.huawei.hwlogsmodel.LogUtil.a("SCUI_StepUnitUtil", "isWeChatShouldHideBySp showTimes ", num, " lastShowTime ", l);
        if (jLongValue == 0 && iIntValue == 0) {
            return false;
        }
        return iIntValue >= 3 || System.currentTimeMillis() - jLongValue <= 2592000000L;
    }

    private static Pair<Long, Integer> c() {
        String strH = lua.h(Integer.toString(10104), "STEP_DETAIL_BIND_WECHAT_TIME_AND_INTERVAL");
        if (TextUtils.isEmpty(strH)) {
            return new Pair<>(0L, 0);
        }
        String[] strArrSplit = strH.split("#");
        if (strArrSplit.length == 2) {
            return new Pair<>(Long.valueOf(CommonUtil.m(BaseApplication.getContext(), strArrSplit[0])), Integer.valueOf(CommonUtil.n(BaseApplication.getContext(), strArrSplit[1])));
        }
        return new Pair<>(0L, 0);
    }

    public static void d() {
        Integer num = (Integer) c().second;
        int iIntValue = num.intValue();
        com.huawei.hwlogsmodel.LogUtil.a("SCUI_StepUnitUtil", "setWeChatIsSHow times ", num);
        lua.a(Integer.toString(10104), "STEP_DETAIL_BIND_WECHAT_TIME_AND_INTERVAL", System.currentTimeMillis() + "#" + (iIntValue + 1));
    }
}
