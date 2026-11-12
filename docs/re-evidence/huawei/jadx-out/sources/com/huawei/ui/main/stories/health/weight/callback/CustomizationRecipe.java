package com.huawei.ui.main.stories.health.weight.callback;

import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.health.weight.callback.CustomizationRecipe;
import defpackage.iun;
import defpackage.nkf;
import defpackage.vng;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.util.Calendar;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@H5ProService(name = CustomizationRecipe.TAG, users = {"9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class CustomizationRecipe {
    private static final double DEFAULT_GOAL = 0.0d;
    private static final String TAG = "CustomizationRecipe";

    private CustomizationRecipe() {
    }

    @H5ProMethod(name = "getUnit")
    public static void getUnit(CustomizationRecipeCbk<Boolean> customizationRecipeCbk) {
        if (customizationRecipeCbk == null) {
            LogUtil.j(TAG, "getUnit callback is null");
        } else {
            customizationRecipeCbk.onSuccess(Boolean.valueOf(UnitUtil.f()));
        }
    }

    @H5ProMethod(name = "getUserPreference")
    public static void getUserPreference(final String str, final CustomizationRecipeCbk<String> customizationRecipeCbk) {
        LogUtil.a(TAG, "getUserPreference key ", str);
        if (customizationRecipeCbk == null) {
            LogUtil.j(TAG, "getUserPreference callback is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "getUserPreference key is empty");
            customizationRecipeCbk.onFailure(-1, "key is empty");
        } else if (Objects.equals(str, "custom.custom_recipes")) {
            getUserPreferenceValue(str, customizationRecipeCbk);
        } else if (!Objects.equals(str, "custom.weight_goal_daily_diff")) {
            customizationRecipeCbk.onFailure(-1, str);
        } else {
            vng.c((ResponseCallback<WeightTargetDifferences>) new ResponseCallback() { // from class: vgb
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    CustomizationRecipe.lambda$getUserPreference$0(str, customizationRecipeCbk, i, (WeightTargetDifferences) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$getUserPreference$0(String str, CustomizationRecipeCbk customizationRecipeCbk, int i, WeightTargetDifferences weightTargetDifferences) {
        if (i != 0) {
            getUserPreferenceValue(str, customizationRecipeCbk);
        } else {
            customizationRecipeCbk.onSuccess(String.valueOf(weightTargetDifferences.c() / 1000.0d));
        }
    }

    @H5ProMethod(name = "getWeightGoal")
    public static void getWeightGoal(CustomizationRecipeCbk<Double> customizationRecipeCbk) {
        if (customizationRecipeCbk == null) {
            LogUtil.j(TAG, "getWeightGoal callback is null");
        } else {
            getWeightGoalLast(customizationRecipeCbk);
        }
    }

    @H5ProMethod(name = "saveUserPreference")
    public static void saveUserPreference(String str, String str2, CustomizationRecipeCbk<Integer> customizationRecipeCbk) {
        LogUtil.a(TAG, "saveUserPreference key ", str, " value ", str2);
        if (customizationRecipeCbk == null) {
            LogUtil.j(TAG, "saveUserPreference callback is null");
            return;
        }
        if (Objects.equals(str, "custom.custom_recipes")) {
            HiUserPreference hiUserPreference = new HiUserPreference();
            hiUserPreference.setKey(str);
            hiUserPreference.setValue(str2);
            if (HiHealthManager.d(BaseApplication.getContext()).setUserPreference(hiUserPreference)) {
                customizationRecipeCbk.onSuccess(0);
                return;
            }
        }
        customizationRecipeCbk.onFailure(-1, "saveUserPreference errCode -1");
    }

    @H5ProMethod(name = "saveWeightGoal")
    public static void saveWeightGoal(final double d, final double d2, final CustomizationRecipeCbk<Object> customizationRecipeCbk) {
        if (customizationRecipeCbk == null) {
            LogUtil.j(TAG, "saveWeightGoal callback is null");
        } else {
            LogUtil.a(TAG, "saveWeightGoal targetWeight is", Double.valueOf(d), ",dailyDiff ", Double.valueOf(d2));
            vng.d((ResponseCallback<Double>) new ResponseCallback() { // from class: vga
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    CustomizationRecipe.lambda$saveWeightGoal$2(d2, d, customizationRecipeCbk, i, (Double) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$saveWeightGoal$2(double d, double d2, final CustomizationRecipeCbk customizationRecipeCbk, int i, Double d3) {
        long j;
        double d4 = 1000.0d * d;
        if (CommonUtil.b(d3.doubleValue()) || d4 == 0.0d) {
            j = 0;
        } else {
            int iA = vng.a(d4, d3.doubleValue(), d2);
            Calendar calendar = Calendar.getInstance();
            calendar.add(6, iA);
            long timeInMillis = calendar.getTimeInMillis();
            LogUtil.a(TAG, "saveWeightGoal totalDay ", Integer.valueOf(iA), " endTimeMillis ", Long.valueOf(timeInMillis));
            j = timeInMillis;
        }
        HiGoalInfo hiGoalInfo = new HiGoalInfo();
        hiGoalInfo.setGoalType(5);
        hiGoalInfo.setGoalValue(d2);
        DietDiaryRepository.saveWeightGoalAsync(new WeightTargetDifferences(d4, System.currentTimeMillis(), j, 0), false, MultiUsersManager.INSTANCE.getMainUser().n(), hiGoalInfo, iun.c(), new IBaseResponseCallback() { // from class: vfz
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                CustomizationRecipe.lambda$saveWeightGoal$1(customizationRecipeCbk, i2, obj);
            }
        });
    }

    public static /* synthetic */ void lambda$saveWeightGoal$1(CustomizationRecipeCbk customizationRecipeCbk, int i, Object obj) {
        if (i == 0) {
            customizationRecipeCbk.onSuccess(obj);
            return;
        }
        customizationRecipeCbk.onFailure(i, "saveWeightGoal object " + obj);
    }

    @H5ProMethod(name = "getWeightTargetDifferences")
    public static void getWeightTargetDifferences(final CustomizationRecipeCbk<WeightTargetDifferences> customizationRecipeCbk) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.health.weight.callback.CustomizationRecipe.3
            @Override // java.lang.Runnable
            public void run() {
                WeightTargetDifferences weightTargetDifferencesE = vng.e();
                CustomizationRecipeCbk customizationRecipeCbk2 = customizationRecipeCbk;
                if (customizationRecipeCbk2 != null) {
                    customizationRecipeCbk2.onSuccess(weightTargetDifferencesE);
                }
            }
        });
    }

    private static void getUserPreferenceValue(String str, CustomizationRecipeCbk<String> customizationRecipeCbk) {
        String value;
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference(str);
        if (userPreference == null || TextUtils.isEmpty(userPreference.getValue())) {
            LogUtil.d(TAG, "getUserPreferenceValue is null or value valid fail", "0");
            value = "0";
        } else {
            value = userPreference.getValue();
            LogUtil.d(TAG, "getUserPreferenceValue ", value);
        }
        customizationRecipeCbk.onSuccess(value);
    }

    private static void getWeightGoalLast(final CustomizationRecipeCbk<Double> customizationRecipeCbk) {
        nkf.a().a(new ResponseCallback<Float>() { // from class: com.huawei.ui.main.stories.health.weight.callback.CustomizationRecipe.2
            @Override // com.huawei.hwbasemgr.ResponseCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, Float f) {
                LogUtil.j(CustomizationRecipe.TAG, "getWeightGoalLast data ", f);
                if (f == null) {
                    customizationRecipeCbk.onSuccess(Double.valueOf(0.0d));
                } else {
                    customizationRecipeCbk.onSuccess(Double.valueOf(Double.parseDouble(String.valueOf(f))));
                }
            }
        });
    }
}
