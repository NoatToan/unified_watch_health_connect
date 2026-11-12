package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.ecologydevice.R;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.datatype.IntermitentJumpData;
import com.huawei.health.device.datatype.SkippingTargetMode;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.webview.WebViewActivity;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class erj {
    public static void b(BaseFragment baseFragment, String str, String str2, elh elhVar) {
        Intent intent = new Intent();
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.operation.activity.WebViewActivity");
        if (!TextUtils.isEmpty(elhVar.p()) && !TextUtils.isEmpty(elhVar.e())) {
            intent.putExtra("url", elg.e().e(str) + "#/type=2/sn=" + str2);
        } else {
            intent.putExtra("url", elg.e().e(str));
        }
        intent.putExtra("productId", str);
        elh elhVarD = ResourceManager.c().d(str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", str2);
        if (elhVarD != null) {
            contentValues.put("name", etn.c(str, elhVarD.l().d()));
            contentValues.put("deviceType", elhVarD.m().name());
        }
        intent.putExtra("commonDeviceInfo", contentValues);
        baseFragment.startActivity(intent);
    }

    public static void a(Activity activity, String str, int i) {
        LogUtil.a("JumpHelper", "showPrivacyActivity");
        Intent intent = new Intent();
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.health.device.ui.privacy.HonorDeviceShowPrivacyActivity");
        if (str != null) {
            LogUtil.a("JumpHelper", "showPrivacyActivity mPrivacyImagePath not null path = ", str);
            intent.putExtra("image_path", str);
        } else {
            LogUtil.j("JumpHelper", "showPrivacyActivity mPrivacyImagePath is null");
        }
        activity.startActivityForResult(intent, i);
    }

    public static void a(BaseFragment baseFragment, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.a("JumpHelper", "startUricAcidPage productId or uniqueId isEmpty ");
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", elg.e().e(str) + "#/type=10");
        intent.putExtra("productId", str);
        elh elhVarD = ResourceManager.c().d(str);
        intent.putExtra("uniqueId", str2);
        if (elhVarD != null) {
            intent.putExtra("name", etn.c(str, elhVarD.l().d()));
            intent.putExtra("deviceType", elhVarD.m().name());
        }
        baseFragment.startActivity(intent);
    }

    /* JADX INFO: renamed from: erj$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f33386c;

        static {
            int[] iArr = new int[HealthDevice.HealthDeviceKind.values().length];
            f33386c = iArr;
            try {
                iArr[HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33386c[HealthDevice.HealthDeviceKind.HDK_BLOOD_OXYGEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33386c[HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33386c[HealthDevice.HealthDeviceKind.HDK_BODY_TEMPERATURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33386c[HealthDevice.HealthDeviceKind.HDK_WEIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void c(BaseFragment baseFragment, HealthDevice.HealthDeviceKind healthDeviceKind) {
        Intent intent = new Intent();
        if (AnonymousClass2.f33386c[healthDeviceKind.ordinal()] != 1) {
            return;
        }
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarHistoryActivity");
        baseFragment.startActivity(intent);
    }

    public static void a(Context context, HealthDevice.HealthDeviceKind healthDeviceKind) {
        if (context == null) {
            LogUtil.j("JumpHelper", "jumpToHomePageActivity, context is null");
            return;
        }
        int i = AnonymousClass2.f33386c[healthDeviceKind.ordinal()];
        if (i != 1) {
            if (i != 3) {
                return;
            }
            c(context);
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.ui.main.stories.template.health.module.HealthDataDetailActivity");
        intent.putExtra("extra_service_id", "BloodSugarCardConstructor");
        intent.putExtra("extra_time_stamp", SharedPreferenceManager.d("blood_sugar_module_id", "latest_one_day_time", 0L));
        intent.putExtra("extra_page_type", 8);
        lsx.c(intent, context);
    }

    public static void d(Context context) {
        AppRouter.c("/home/device").c(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE).e(67108864).b(context);
    }

    public static void e(Context context) {
        if (context == null) {
            LogUtil.j("JumpHelper", "jumpToNetWorkSetting, context is null");
        } else {
            context.startActivity(new Intent("android.settings.SETTINGS"));
        }
    }

    public static void e(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.a("JumpHelper", "jumpToBloodSugarHistory productId or uniqueId isEmpty ");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", str);
        contentValues.put("uniqueId", str2);
        Intent intent = new Intent();
        intent.putExtra("commonDeviceInfo", contentValues);
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.health.ecologydevice.ui.healthdata.activity.BloodSugarHistoryActivity");
        lsx.c(intent, context);
    }

    public static void c(Context context) {
        Intent intent = new Intent();
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity");
        iov.d(context, intent);
    }

    public static void d(final Activity activity, final String str) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: erl
            @Override // java.lang.Runnable
            public final void run() {
                erj.e(activity, str);
            }
        });
    }

    static /* synthetic */ void e(final Activity activity, final String str) {
        String countryCode = LoginInit.getInstance(BaseApplication.getContext()).getCountryCode(null);
        if (TextUtils.isEmpty(countryCode)) {
            countryCode = "SG";
        }
        final String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainTipsResDbankcdn", countryCode);
        if (activity == null) {
            LogUtil.j("JumpHelper", "openDeviceHelpActivity mainActivity is null");
        } else if (TextUtils.isEmpty(noCheckUrl)) {
            LogUtil.j("JumpHelper", "openDeviceHelpActivity url is empty");
        } else {
            LogUtil.d("JumpHelper", "openUserGuideActivity url", noCheckUrl, str);
            activity.runOnUiThread(new Runnable() { // from class: erj.5
                @Override // java.lang.Runnable
                public void run() {
                    Intent intent = new Intent(activity, (Class<?>) WebViewActivity.class);
                    intent.putExtra("WebViewActivity.REQUEST_URL_KEY", noCheckUrl + str);
                    intent.putExtra(Constants.JUMP_MODE_KEY, 8);
                    activity.startActivity(intent);
                }
            });
        }
    }

    public static void e(Context context, String str, njd njdVar) {
        if (njdVar == null) {
            LogUtil.j("JumpHelper", "jumpToTrackDetailActivity pathData is null");
            return;
        }
        ive.c().init(context);
        Bundle bundle = new Bundle();
        bundle.putSerializable("simplifyDatakey", njdVar.c());
        bundle.putString("contentpath", njdVar.b());
        bundle.putString("entrance", str);
        bundle.putBoolean("isAfterSport", false);
        bundle.putBoolean("isNotNeedDeleteFile", false);
        Intent intent = new Intent(context, (Class<?>) TrackDetailActivity.class);
        intent.putExtras(bundle);
        intent.addFlags(268435456);
        iov.d(context, intent);
    }

    public static void b(Context context, boolean z) {
        if (context == null) {
            health.compact.a.util.LogUtil.d("JumpHelper", "startOneKeyActivity, context is null");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(context, "com.huawei.ui.device.activity.adddevice.OneKeyScanActivity");
            intent.putExtra("is_go_rope_jump", z);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            health.compact.a.util.LogUtil.c("JumpHelper", "ActivityNotFoundException e:", e.getMessage());
        }
    }

    public static void a(Context context) {
        if (context == null) {
            health.compact.a.util.LogUtil.d("JumpHelper", "startOneKeyActivity, context is null");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(context, "com.huawei.ui.device.activity.adddevice.OneKeyScanActivity");
            intent.putExtra("is_jump_to_device_detail", true);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            health.compact.a.util.LogUtil.c("JumpHelper", "ActivityNotFoundException e:", e.getMessage());
        }
    }

    public static void a(Context context, int i, int i2, String str) {
        if (context == null) {
            LogUtil.j("JumpHelper", "gotoWarmUp context is null");
            return;
        }
        ArrayList<WorkoutRecord> arrayListB = b();
        pcd pcdVar = new pcd(str);
        pcdVar.f(283);
        pcdVar.a(i);
        pcdVar.b(i2);
        pcdVar.f(true);
        pcdVar.d(false);
        pcdVar.c(1);
        pcdVar.b(R.anim.left_enter_short);
        pcdVar.d(R.anim.activity_no_animation_short);
        pea.b(context, pcdVar, arrayListB);
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("type", 0);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.MOTION_TRACK_1040021.value(), map, 0);
    }

    private static ArrayList<WorkoutRecord> b() {
        WorkoutRecord workoutRecord = new WorkoutRecord();
        workoutRecord.saveVersion(null);
        workoutRecord.saveExerciseTime(new Date().getTime());
        workoutRecord.saveWorkoutId("Y044");
        workoutRecord.savePlanId("");
        ArrayList<WorkoutRecord> arrayList = new ArrayList<>(1);
        arrayList.add(workoutRecord);
        return arrayList;
    }

    public static void d(Context context, int i) {
        if (context == null) {
            LogUtil.e("JumpHelper", "gotoSportHistoryActivity context is null");
            return;
        }
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, Constants.SPORT_HISTORY);
        intent.putExtra(BleConstants.SPORT_TYPE, i);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.j("JumpHelper", "gotoSportHistoryActivity() Not found this activity  ", e.getMessage());
        }
    }

    public static void b(Context context, int i, int i2, IntermitentJumpData intermitentJumpData, String str) {
        if (context == null) {
            LogUtil.e("JumpHelper", "gotoSportHistoryActivity context is null");
            return;
        }
        emh.b().c(new SkippingTargetMode(i, i2, intermitentJumpData));
        SportLaunchParams sportLaunchParams = new SportLaunchParams();
        sportLaunchParams.setSportType(283);
        sportLaunchParams.setSportTarget(i);
        sportLaunchParams.setTrackType(i);
        sportLaunchParams.setTargetValue(i2);
        sportLaunchParams.addExtra("productId", str);
        sportLaunchParams.addExtra("type_intermittent_jump_mode_data", intermitentJumpData);
        Intent intent = new Intent();
        intent.putExtra("bundle_key_sport_launch_paras", sportLaunchParams);
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.indoorequip.activity.IndoorEquipDisplayActivity");
        hai.d(context, intent);
    }

    public static void b(Context context, int i) {
        SharedPreferenceManager.e(context, Integer.toString(20002), "map_tracking_sport_type", Integer.toString(i), new StorageParams());
    }

    public static void a(Context context, String str, String str2) {
        String str3;
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("JumpHelper", "jumpToBloodPressureFaqsH5Page context is null or productId is empty");
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.operation.activity.WebViewActivity");
        String str4 = qqs.e(context) ? "&dark=1" : "&dark=0";
        String str5 = "&lang=" + LanguageUtil.a();
        str2.hashCode();
        if (str2.equals("feature=voice")) {
            str3 = "?feature=voice";
        } else {
            if (!str2.equals("feature=connect")) {
                LogUtil.a("JumpHelper", "jumpToBloodPressureFaqsH5Page pageType is other type");
                return;
            }
            str3 = "?feature=connect";
        }
        intent.putExtra("url", elg.e().e(str) + str3 + str4 + str5);
        iov.d(context, intent);
    }

    public static void b(Context context, String str, String str2) {
        Intent intent = new Intent();
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.ui.device.activity.adddevice.OneKeyScanActivity");
        intent.putExtra("fittings_host_uuid", str);
        intent.putExtra("fittings_host_sn", str2);
        intent.putExtra("isJumpFromFittings", true);
        iov.d(context, intent);
    }
}
