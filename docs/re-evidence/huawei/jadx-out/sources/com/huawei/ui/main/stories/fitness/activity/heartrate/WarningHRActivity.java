package com.huawei.ui.main.stories.fitness.activity.heartrate;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.heartrate.WarningHRActivity;
import com.huawei.ui.main.stories.fitness.activity.heartrate.adapter.HeartRateAbnormalAdapter;
import defpackage.ecu;
import defpackage.eej;
import defpackage.iov;
import defpackage.uel;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class WarningHRActivity extends BaseActivity {
    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_warning_heart_rate);
        d();
    }

    private void d() {
        getWindow().setBackgroundDrawableResource(com.huawei.ui.commonui.R.color.colorSubBackground);
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.heart_rate_recycler);
        healthRecycleView.setLayoutManager(new HealthLinearLayoutManager(this));
        final HeartRateAbnormalAdapter heartRateAbnormalAdapter = new HeartRateAbnormalAdapter();
        healthRecycleView.setAdapter(heartRateAbnormalAdapter);
        ThreadPoolManager.c().execute(new Runnable() { // from class: udz
            @Override // java.lang.Runnable
            public final void run() {
                this.f49975b.b(heartRateAbnormalAdapter);
            }
        });
    }

    public /* synthetic */ void b(final HeartRateAbnormalAdapter heartRateAbnormalAdapter) {
        uel.a("HR_WARNING_DETAIL", 2101, new ResponseCallback() { // from class: udw
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f49971a.d(heartRateAbnormalAdapter, i, (List) obj);
            }
        });
    }

    public /* synthetic */ void d(final HeartRateAbnormalAdapter heartRateAbnormalAdapter, int i, final List list) {
        if (list == null || list.size() == 0) {
            LogUtil.j("HealthHeartRate_WarningHRActivity", "queryModelUnitByDetail data is empty");
        } else {
            runOnUiThread(new Runnable() { // from class: uea
                @Override // java.lang.Runnable
                public final void run() {
                    WarningHRActivity.a(heartRateAbnormalAdapter, list);
                }
            });
        }
    }

    public static /* synthetic */ void a(HeartRateAbnormalAdapter heartRateAbnormalAdapter, List list) {
        heartRateAbnormalAdapter.a(list);
        if (heartRateAbnormalAdapter.a()) {
            heartRateAbnormalAdapter.e(0);
        }
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) WarningHRActivity.class);
        intent.addFlags(268435456);
        intent.setPackage(context.getPackageName());
        iov.d(context, intent);
    }

    public static void d(Context context) {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "HealthHeartRate_WarningHRActivity");
        if (context == null || deviceInfo == null) {
            LogUtil.j("HealthHeartRate_WarningHRActivity", "context or deviceInfo is null");
            return;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            LogUtil.j("HealthHeartRate_WarningHRActivity", "deviceMac is null");
            return;
        }
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC != null && deviceCapabilityC.isSupportContinueHeartRate()) {
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getContext(), "com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity");
            intent.putExtra("device_id", deviceIdentify);
            intent.addFlags(268435456);
            iov.d(context, intent);
            LogUtil.a("HealthHeartRate_WarningHRActivity", "jump to ContinueHeartRateSettingActivity");
            return;
        }
        if (deviceCapabilityC == null || !deviceCapabilityC.isSupportHeartRateEnable() || deviceCapabilityC.isSupportContinueHeartRate()) {
            LogUtil.j("HealthHeartRate_WarningHRActivity", "do nothing");
            return;
        }
        Intent intent2 = new Intent();
        intent2.setClassName(BaseApplication.getContext(), "com.huawei.ui.device.activity.heartrate.HeartRateSettingsActivity");
        intent2.putExtra("device_id", deviceIdentify);
        intent2.addFlags(268435456);
        iov.d(context, intent2);
        LogUtil.a("HealthHeartRate_WarningHRActivity", "jump to HeartRateSettingsActivity");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
