package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IFlushResult;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import com.huawei.ui.homehealth.threecirclecard.uitls.BottomMessageInfoEnum;
import com.huawei.ui.homewear21.home.WearHomeOtherSettingActivity;
import com.huawei.ui.main.stories.fitness.activity.active.KnitActiveHoursActivity;
import com.huawei.ui.main.stories.fitness.activity.active.KnitActiveRecordActivity;
import com.huawei.ui.main.stories.fitness.activity.calorie.FitnessCalorieDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.sportintensity.FitnessSportIntensityDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity;
import com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper;
import com.huawei.ui.main.stories.me.util.StepCounterSupportUtil;
import com.huawei.ui.main.stories.utils.FitnessUtils;
import defpackage.ffv;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.EnvironmentInfo;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes17.dex */
public class tdy {
    public static int d() {
        if ("threeCircleCard".equals(tbf.e())) {
            return 1;
        }
        return "threeLeafCard".equals(tbf.e()) ? 2 : 0;
    }

    public static void a(Context context, int i) {
        if (context == null) {
            return;
        }
        String usetId = LoginInit.getInstance(context).getUsetId();
        String strC = KeyValDbManager.d(context).c(usetId + "step_sum_dvalue");
        double d = TextUtils.isEmpty(strC) ? 0.0d : CommonUtils.d(strC, 0.0d);
        double dB = b(context, d);
        LogUtil.a("TwoModelUtils", "otherDeviceSteps=", Double.valueOf(d), "  totalSteps=", Integer.valueOf(i), "actualOtherDeviceSteps=", Double.valueOf(dB));
        if (i <= 0 || dB / ((double) i) < 0.20000000298023224d || dB < 500.0d) {
            LogUtil.a("TwoModelUtils", "(otherDeviceSteps/(float) steps)=", Double.valueOf(d / ((double) i)));
        } else if (uin.e().a() >= 2) {
            a(context);
        }
    }

    private static double b(Context context, double d) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "first_day_run_record");
        LogUtil.a("TwoModelUtils", "acquireActualOtherDeviceSteps firstRunText", strE);
        if (TextUtils.isEmpty(strE)) {
            SharedPreferenceManager.e(context, Integer.toString(10000), "first_day_run_record", "false#" + System.currentTimeMillis() + "#" + d, new StorageParams());
            d = 0.0d;
        } else {
            try {
                String[] strArrSplit = strE.split("#");
                if (strArrSplit != null && strArrSplit.length == 3 && "false".equals(strArrSplit[0]) && lsl.aa(Long.parseLong(strArrSplit[1]))) {
                    d -= Double.parseDouble(strArrSplit[2]);
                }
            } catch (Exception e) {
                LogUtil.e("TwoModelUtils", "acquireActualOtherDeviceSteps e", LogAnonymous.b(e));
            }
        }
        LogUtil.a("TwoModelUtils", "acquireActualOtherDeviceSteps actualOtherDeviceSteps", Double.valueOf(d));
        return d;
    }

    private static void a(Context context) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "show_data_origin_tips_times");
        LogUtil.a("TwoModelUtils", "showOtherDeviceStepsMoreThanTwentyPercentTips storeText=", strE);
        if (TextUtils.isEmpty(strE)) {
            ObserverManagerUtil.e("TIPS_OTHER_DEVICES_SYNC_STEPS", 6);
            return;
        }
        String[] strArrSplit = strE.split("#");
        try {
            if (strArrSplit.length <= 1 || !"1".equals(strArrSplit[1]) || !lsl.aa(Long.parseLong(strArrSplit[0]))) {
                ObserverManagerUtil.e("TIPS_OTHER_DEVICES_SYNC_STEPS", 6);
            } else {
                LogUtil.a("TwoModelUtils", "showOtherDeviceStepsMoreThanTwentyPercentTips already tips twice! return.");
            }
        } catch (NumberFormatException unused) {
            LogUtil.e("TwoModelUtils", "showOtherDeviceStepsMoreThanTwentyPercentTips NumberFormatException");
        }
    }

    public static void d(HealthOpenSDK healthOpenSDK, Context context, int i, int i2) {
        ujq.b(1);
        e(healthOpenSDK, context, i, i2);
        LogUtil.a("TwoModelUtils", "steps = " + i);
    }

    public static void e(HealthOpenSDK healthOpenSDK, Context context, int i, int i2) {
        String string;
        d(healthOpenSDK);
        int iB = StepCounterSupportUtil.b(BaseApplication.getContext());
        if (i <= 0 && iB == 3) {
            if (EnvironmentInfo.m()) {
                string = context.getString(R.string.IDS_home_computer_no_detail_tips);
            } else if (qrs.ah(com.huawei.haf.application.BaseApplication.b())) {
                string = context.getString(R.string.IDS_home_pad_no_detail_tips);
            } else {
                string = context.getString(R.string.IDS_hwh_home_phone_not_support_step_no_detail_tips);
            }
            Toast.makeText(context, string, 0).show();
            return;
        }
        StepModuleChartStorageHelper.b(true);
        Intent intent = new Intent(context, (Class<?>) FitnessStepDetailActivity.class);
        intent.putExtra("today_current_steps_total", i);
        intent.putExtra("today_current_distance_total", i2);
        iov.d(context, intent);
        swi.c(1);
    }

    private static void d(final HealthOpenSDK healthOpenSDK) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: tea
            @Override // java.lang.Runnable
            public final void run() {
                tdy.e(healthOpenSDK);
            }
        });
    }

    static /* synthetic */ void e(HealthOpenSDK healthOpenSDK) {
        if (healthOpenSDK != null) {
            healthOpenSDK.e((IFlushResult) null);
        }
    }

    public static void b(HealthOpenSDK healthOpenSDK, Context context, int i) {
        d(healthOpenSDK);
        Intent intent = new Intent(context, (Class<?>) FitnessSportIntensityDetailActivity.class);
        intent.putExtra("today_current_middle_and_high_total", i);
        iov.d(context, intent);
        swi.c(1);
    }

    public static void a(HealthOpenSDK healthOpenSDK, Context context, int i) {
        d(healthOpenSDK);
        ujq.d();
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.setClass(context, FitnessCalorieDetailActivity.class);
        intent.putExtra("bundle_key_data", bundle);
        intent.putExtra("today_current_colories_total", i * 1000);
        iov.d(context, intent);
        swi.c(1);
    }

    public static void e(Context context) {
        b(context);
        KnitActiveHoursActivity.e(context);
        swi.c(1);
    }

    private static void b(Context context) {
        ujq.b(3);
        HashMap map = new HashMap(3);
        map.put("click", "1");
        map.put("from", 1);
        map.put("event", 1);
        lmf.d().c(context, AnalyticsValue.HEALTH_HOME_ACTIVE_HOUR_1040092.value(), map, 0);
    }

    public static void a(Context context, int i, int[] iArr, int[] iArr2, String str) {
        HashMap map = new HashMap();
        map.put("click", "1");
        LogUtil.a("TwoModelUtils", "clickThreeCircleDetail step:", Integer.valueOf(iArr[3]), " mActive:", Integer.valueOf(iArr[2]));
        Intent intent = new Intent(context, (Class<?>) KnitActiveRecordActivity.class);
        intent.putExtra("current_total_step", iArr[3]);
        intent.putExtra("current_total_intensity", iArr[1]);
        intent.putExtra("current_total_active", iArr[2]);
        intent.putExtra("cur_calorie_goal", iArr2[0] * 1000);
        intent.putExtra("current_total_distance", iArr[4]);
        intent.putExtra("current_total_calorie", iArr[0]);
        intent.putExtra("current_total_calorie", i);
        intent.putExtra("current_total_floor", iArr[5]);
        intent.putExtra("cur_step_goal", iArr2[3]);
        intent.putExtra("cur_intensity_goal", iArr2[1]);
        intent.putExtra("cur_active_goal", iArr2[2]);
        a(map, iArr, iArr2);
        iov.d(context, intent);
        map.put("from", str);
        lmf.d().c(context, AnalyticsValue.HEALTH_HOME_CIRCLE_RING_1040091.value(), map, 0);
    }

    private static void a(Map<String, Object> map, int[] iArr, int[] iArr2) {
        String[] strArr = {"calorie", "MVPA", "activity"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            if (i2 >= i3 && i3 > 0) {
                arrayList.add(strArr[i]);
            }
        }
        if (arrayList.size() == 3) {
            arrayList.add("perfect");
        }
        map.put("status", arrayList);
    }

    public static void d(int[] iArr) {
        String str = System.currentTimeMillis() + "#" + iArr[0] + "#" + iArr[1] + "#" + iArr[2] + "#" + iArr[3] + "#" + iArr[4] + "#" + iArr[5] + "#" + iArr[6];
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "three_circle_data_version_2", str, null);
        LogUtil.a("TwoModelUtils", "saveCircleData to sp", str);
    }

    public static void e(int[] iArr) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "three_circle_data_version_2");
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        LogUtil.a("TwoModelUtils", "getCircleDataFromSp circleVal=", strE);
        String[] strArrSplit = strE.split("#");
        if (FitnessUtils.a(CommonUtil.i(strArrSplit[0]), System.currentTimeMillis())) {
            if (iArr.length + 1 > strArrSplit.length) {
                LogUtil.a("TwoModelUtils", "getCircleDataFromSp more length");
                return;
            }
            for (int i = 1; i < iArr.length + 1; i++) {
                iArr[i - 1] = CommonUtil.j(strArrSplit[i]);
            }
        }
    }

    public static void b(int[] iArr) {
        String str = System.currentTimeMillis() + "#" + iArr[0] + "#" + iArr[1] + "#" + iArr[2] + "#" + iArr[3];
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "three_circle_goal_version_2", str, null);
        LogUtil.a("TwoModelUtils", "goalVal to sp", str);
    }

    public static void c(int[] iArr) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "three_circle_goal_version_2");
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        LogUtil.a("TwoModelUtils", "getCircleGoalFromSp goalVal=", strE);
        String[] strArrSplit = strE.split("#");
        if (strArrSplit.length == 5 && FitnessUtils.a(CommonUtil.i(strArrSplit[0]), System.currentTimeMillis())) {
            for (int i = 1; i < 5; i++) {
                iArr[i - 1] = CommonUtil.j(strArrSplit[i]);
            }
        }
    }

    public static void c(DeviceInfo deviceInfo, Context context) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_TwoModelUtils", "goToGeneralSetting deviceInfo == null");
            return;
        }
        boolean zIsBrowseMode = LoginInit.getInstance(context).isBrowseMode();
        ReleaseLogUtil.d("TwoModelUtils", "goToGeneralSetting isBrowseMode", Boolean.valueOf(zIsBrowseMode));
        if (zIsBrowseMode) {
            LoginInit.getInstance(context).browsingToLogin(new IBaseResponseCallback() { // from class: tdy.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    ReleaseLogUtil.d("TwoModelUtils", "goToGeneralSetting browsingToLogin", Integer.valueOf(i));
                }
            }, "");
            return;
        }
        if (qst.c()) {
            rpq.c(FeatureType.DEVICE_SETTING).jumpToFeaturePage(deviceInfo, new SimpleChain.Emitter() { // from class: tdz
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public final void onSuccess(Object[] objArr) {
                    LogUtil.a("TwoModelUtils", "goToGeneralSetting jumpToFeaturePage");
                }
            });
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("device_id", deviceInfo.getDeviceIdentify());
        intent.setClass(context, WearHomeOtherSettingActivity.class);
        iov.d(context, intent);
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT <= 28) {
            return false;
        }
        Context context = BaseApplication.getContext();
        return (qrs.ah(context) || !lro.d(context) || StepCounterSupportUtil.b(context) == 3 || ContextCompat.checkSelfPermission(context, "android.permission.ACTIVITY_RECOGNITION") == 0) ? false : true;
    }

    public static void c() {
        c("ACTIVITY_I");
        ipb.b("3");
        ltd.e().e(BaseApplication.getActivity(), new String[]{"android.permission.ACTIVITY_RECOGNITION"}, new PermissionsResultAction() { // from class: tdy.2
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                ReleaseLogUtil.d("TwoModelUtils", "ACTIVITY_RECOGNITION is Granted");
                ipb.b("1");
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                ReleaseLogUtil.d("TwoModelUtils", "ACTIVITY_RECOGNITION is onDenied");
                ipb.b("2");
                sik.d(BaseApplication.getActivity(), qre.f(R.string.IDS_hwh_permission_guide_activity_reconnition));
            }
        });
    }

    public static int b(String str) {
        return lua.b(Integer.toString(10000), "ClickPermissionCount" + str, 0);
    }

    public static void c(String str) {
        int iB = b(str) + 1;
        ReleaseLogUtil.d("TwoModelUtils", "addShowPermissionCount with ", Integer.valueOf(iB), " type: ", str);
        lua.c(Integer.toString(10000), "ClickPermissionCount" + str, iB);
    }

    public static boolean e() {
        return !lsl.aa(lua.d(Integer.toString(10000), "PermissionBiTime", 0L));
    }

    public static void h() {
        lua.a(Integer.toString(10000), "PermissionBiTime", System.currentTimeMillis());
    }

    public static String b(int i, int i2, int i3) {
        if (LanguageUtil.l(BaseApplication.getContext())) {
            return String.valueOf(i);
        }
        return UnitUtil.e(i, i2, i3);
    }

    public static SpannableString e(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        str.indexOf(str2);
        qri.a(spannableString, str2, new ForegroundColorSpan(qre.e(R.color.textColorPrimary)));
        qri.a(spannableString, str2, new AbsoluteSizeSpan(qre.b(R.dimen.textSizeSubTitle1)));
        qri.a(spannableString, str2, new qli(qrr.e()));
        return spannableString;
    }

    public static boolean b() {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.a("TwoModelUtils", "isShowHealthLife isBrowseMode");
            return ffv.t();
        }
        boolean zN = ffv.n();
        boolean zL = ffv.l();
        LogUtil.a("TwoModelUtils", "isShowHealthLife isJoinHealthModel:", Boolean.valueOf(zN), ", isHealthLife:", Boolean.valueOf(zL));
        return (zN || zL) ? zL : ffv.t();
    }

    public static boolean c(final ResponseCallback<Boolean> responseCallback) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.a("TwoModelUtils", "isShowHealthLife2 isBrowseMode");
            if (responseCallback != null) {
                responseCallback.onResponse(0, Boolean.valueOf(ffv.t()));
            }
            return ffv.t();
        }
        boolean zN = ffv.n();
        boolean zL = ffv.l();
        LogUtil.a("TwoModelUtils", "isShowHealthLife2 isJoinHealthModel:", Boolean.valueOf(zN), ", isHealthLife:", Boolean.valueOf(zL));
        if (!zN && !zL) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: tdx
                @Override // java.lang.Runnable
                public final void run() {
                    ffv.a((ResponseCallback<Boolean>) responseCallback);
                }
            });
            return ffv.t();
        }
        if (responseCallback != null) {
            responseCallback.onResponse(0, Boolean.valueOf(zL));
        }
        return zL;
    }

    public static List<tdr> b(final Context context, qfj qfjVar) {
        List<String> listB = b(qfjVar);
        if (njy.e(listB)) {
            return Collections.EMPTY_LIST;
        }
        int size = listB.size();
        String str = listB.get(lsw.b(size));
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("R_TwoModelUtils", "getBottomMessageInfo id ", str);
            return Collections.EMPTY_LIST;
        }
        tdr tdrVar = new tdr();
        tdrVar.e(BottomMessageInfoEnum.getBackgroundColorId(str));
        tdrVar.d(R.dimen.textSizeBody2);
        Drawable drawableC = qre.c(BottomMessageInfoEnum.getIconId(str));
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            drawableC = qqz.e(context, drawableC);
        }
        tdrVar.e(drawableC);
        tdrVar.e(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.threecirclecard.uitls.TwoModelUtils$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffv.a(context, Uri.parse("").buildUpon().build());
            }
        });
        String strF = qre.f(BottomMessageInfoEnum.getNameId(str));
        if (size == 1) {
            c(tdrVar, qre.f(R.string.IDS_life_task_complete));
            e(tdrVar, strF, strF, BottomMessageInfoEnum.getColorId(str));
        } else {
            String strE = UnitUtil.e(size, 1, 0);
            if (LanguageUtil.f(BaseApplication.getContext())) {
                e(tdrVar, qre.e(R.plurals.IDS_life_task_complete_more_chinese, size, strF, strE), strF, BottomMessageInfoEnum.getColorId(str));
            } else {
                SpannableString spannableString = new SpannableString(qre.e(R.plurals.IDS_life_task_complete_more, size, strE));
                qri.b(spannableString, spannableString.toString(), R.color.textColorPrimary);
                qri.e(spannableString, spannableString.toString(), R.string.textFontFamilyRegular);
                tdrVar.c(spannableString);
            }
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(tdrVar);
        return arrayList;
    }

    private static List<String> b(qfj qfjVar) {
        if (qfjVar == null) {
            ReleaseLogUtil.e("R_TwoModelUtils", "getDiffIdList resp is null");
            return Collections.EMPTY_LIST;
        }
        List<String> listC = qfjVar.c(sqw.c(qfjVar));
        if (njy.e(listC)) {
            return Collections.EMPTY_LIST;
        }
        final ArrayList arrayList = new ArrayList();
        qfj qfjVarF = ffv.f();
        if (qfjVarF != null) {
            arrayList.addAll(qfjVarF.c(sqw.c(qfjVarF)));
        }
        if (njy.e(arrayList)) {
            return listC;
        }
        listC.removeIf(new Predicate() { // from class: teb
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return arrayList.contains((String) obj);
            }
        });
        LogUtil.a("TwoModelUtils", "getDiffIdList completeIdList ", listC);
        return listC;
    }

    private static void c(tdr tdrVar, String str) {
        SpannableString spannableString = new SpannableString(str);
        qri.b(spannableString, str, R.color.textColorPrimary);
        qri.e(spannableString, str, R.string.textFontFamilyRegular);
        tdrVar.a(spannableString);
    }

    private static void e(tdr tdrVar, String str, String str2, int i) {
        SpannableString spannableString = new SpannableString(str);
        qri.b(spannableString, str, R.color.textColorPrimary);
        qri.e(spannableString, str, R.string.textFontFamilyRegular);
        qri.b(spannableString, str2, i);
        qri.e(spannableString, str2, R.string.textFontFamilyMedium);
        tdrVar.c(spannableString);
    }
}
