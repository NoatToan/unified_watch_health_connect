package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.activity.crodtest.BeiDouCrowdTestActivity;
import com.huawei.ui.device.interactors.NotificationPushInteractor;
import health.compact.a.CloudUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class qtv {
    public static Map<String, Integer> c(int i, boolean z, int i2, boolean z2) {
        HashMap map = new HashMap(16);
        map.put("resultCode", Integer.valueOf(i));
        map.put("isFromTag", Integer.valueOf(z ? 1 : 0));
        map.put("selectDeviceProductType", Integer.valueOf(i2));
        map.put("isFinish", Integer.valueOf(z2 ? 1 : 0));
        return map;
    }

    public static void e(Intent intent, Activity activity, Map<String, Integer> map) {
        if (map == null || intent == null || activity == null) {
            return;
        }
        if (map.get("resultCode").intValue() != 2) {
            LogUtil.j("AfterPairEnterActivityUtils", "result code is not pair code");
            return;
        }
        String stringExtra = intent.getStringExtra("device_id");
        boolean booleanExtra = intent.getBooleanExtra("is_support_notification", false);
        boolean booleanExtra2 = intent.getBooleanExtra("is_jump_to_device_detail", false);
        int iIntValue = map.get("selectDeviceProductType").intValue();
        boolean zD = d();
        DeviceInfo deviceInfoC = mgg.c(stringExtra, "AfterPairEnterActivityUtils");
        boolean z = booleanExtra && zD && iIntValue != 32;
        boolean zA = lua.a(String.valueOf(10008), "beidouStatus", false);
        LogUtil.a("AfterPairEnterActivityUtils", "isNeedOpenBeidou: ", Boolean.valueOf(zA));
        if (!z) {
            a(zA, activity, deviceInfoC, map, stringExtra, booleanExtra2);
            return;
        }
        boolean zD2 = eey.d(deviceInfoC, 283);
        LogUtil.a("AfterPairEnterActivityUtils", "enterActivity intentNotification");
        if (CloudUtils.a()) {
            a();
        }
        if (!zD2) {
            d(stringExtra, activity, map, a(deviceInfoC));
        } else {
            d(stringExtra, activity, map, zA);
        }
    }

    private static void a(boolean z, Activity activity, DeviceInfo deviceInfo, Map<String, Integer> map, String str, boolean z2) {
        boolean z3 = map.get("isFromTag").intValue() == 1;
        boolean z4 = map.get("isFinish").intValue() == 1;
        if (!eey.d(deviceInfo, 283)) {
            if (a(deviceInfo)) {
                rgd.c(str, activity, z3, z4);
                return;
            } else {
                a(str, activity, z3, z4, z2);
                return;
            }
        }
        if (z) {
            Intent intent = new Intent();
            intent.setClass(activity, BeiDouCrowdTestActivity.class);
            intent.putExtra("deviceinfo", deviceInfo);
            intent.putExtra("isFromWear", z3);
            activity.startActivity(intent);
            return;
        }
        a(str, activity, z3, z4, z2);
    }

    private static boolean a(DeviceInfo deviceInfo) {
        rgg rggVarD = rgd.d(deviceInfo, true);
        return (!rggVarD.e() || rggVarD.b() || rggVarD.a() == 0) ? false : true;
    }

    private static boolean d() {
        NotificationPushInteractor notificationPushInteractor = new NotificationPushInteractor(BaseApplication.getContext());
        boolean zB = notificationPushInteractor.b();
        String switchSettingFromLocal = mhs.a().getSwitchSettingFromLocal("KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG", 10001);
        boolean z = !zB || (zB && !Boolean.parseBoolean(switchSettingFromLocal));
        LogUtil.a("AfterPairEnterActivityUtils", "isAuthorizeEnabled:", Boolean.valueOf(zB), " value:", switchSettingFromLocal);
        if (!rcv.a(BaseApplication.getContext()).g()) {
            LogUtil.a("AfterPairEnterActivityUtils", "not support intelligent");
            notificationPushInteractor.b(cio.d, 0);
        }
        return z;
    }

    private static void a() {
        LogUtil.a("AfterPairEnterActivityUtils", "syncSampleConfig enter");
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(900000000);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    private static void a(String str, Activity activity, boolean z, boolean z2, boolean z3) {
        try {
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getContext(), "com.huawei.ui.homewear21.home.WearHomeActivity");
            intent.putExtra("isFromWear", z);
            intent.putExtra("device_id", str);
            intent.putExtra("is_jump_to_device_detail", z3);
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("AfterPairEnterActivityUtils", "ActivityNotFoundException e:", e.getMessage());
        }
        if (z2) {
            activity.finish();
        }
    }

    private static void d(String str, Activity activity, Map<String, Integer> map, boolean z) {
        boolean z2 = map.get("isFromTag").intValue() == 1;
        boolean z3 = map.get("isFinish").intValue() == 1;
        try {
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getContext(), "com.huawei.ui.device.activity.notification.NotificationOpenActivity");
            intent.putExtra("isFromWear", z2);
            intent.putExtra("isShowWalletOobeActivity", z);
            intent.putExtra("device_id", str);
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("AfterPairEnterActivityUtils", "ActivityNotFoundException e:", e.getMessage());
        }
        if (z3) {
            activity.finish();
        }
    }
}
