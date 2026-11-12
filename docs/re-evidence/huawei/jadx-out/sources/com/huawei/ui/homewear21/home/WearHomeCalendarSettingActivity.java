package com.huawei.ui.homewear21.home;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.homewear21.R;
import defpackage.ffv;
import defpackage.ltd;
import defpackage.lvi;
import defpackage.njy;
import defpackage.qec;
import defpackage.qhq;
import defpackage.qqe;
import defpackage.qrs;
import defpackage.tfn;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeCalendarSettingActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f26210b = "WearHomeCalendarSettingActivity";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceInfo f26211c;
    private HealthSwitchButton d;
    private String e;

    public static class c implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<WearHomeCalendarSettingActivity> f26216a;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        private c(WearHomeCalendarSettingActivity wearHomeCalendarSettingActivity) {
            this.f26216a = new WeakReference<>(wearHomeCalendarSettingActivity);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x006e  */
        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            final Boolean boolValueOf;
            ReleaseLogUtil.d(WearHomeCalendarSettingActivity.f26210b, "onResult errorCode: ", Integer.valueOf(i), ", data: ", obj);
            if (obj instanceof List) {
                List list = (List) obj;
                if (njy.e(list) || !njy.b(obj, HiSampleConfig.class)) {
                    boolValueOf = null;
                } else {
                    HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                    String str = WearHomeCalendarSettingActivity.f26210b;
                    int size = list.size();
                    LogUtil.a(str, "calendar switch num : ", Integer.valueOf(size), ", config : ", hiSampleConfig.getConfigData(), ", modifyTime : ", Long.valueOf(hiSampleConfig.getModifiedTime()));
                    boolValueOf = Boolean.valueOf("1".equals(ffv.a(hiSampleConfig.getConfigData(), "calendarToDeviceSwitch")));
                }
            } else {
                boolValueOf = null;
            }
            HandlerExecutor.c(new Runnable() { // from class: tgd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49092b.d(boolValueOf);
                }
            });
        }

        public /* synthetic */ void d(Boolean bool) {
            WearHomeCalendarSettingActivity wearHomeCalendarSettingActivity = this.f26216a.get();
            if (wearHomeCalendarSettingActivity == null || wearHomeCalendarSettingActivity.isFinishing()) {
                LogUtil.j(WearHomeCalendarSettingActivity.f26210b, "activity is finished");
                return;
            }
            boolean zE = qqe.e(BaseApplication.getContext());
            ReleaseLogUtil.d(WearHomeCalendarSettingActivity.f26210b, "hasCalendarPermission: ", Boolean.valueOf(zE), " finalIsOpenSwitch: ", bool);
            if (bool == null) {
                wearHomeCalendarSettingActivity.c(zE);
                return;
            }
            if (zE) {
                wearHomeCalendarSettingActivity.d.setChecked(bool.booleanValue());
            } else if (bool.booleanValue()) {
                wearHomeCalendarSettingActivity.c(false);
            } else {
                wearHomeCalendarSettingActivity.d.setChecked(false);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.wear_home_other_settings_camera_layout);
        clearBackgroundDrawable();
        Intent intent = getIntent();
        if (intent != null) {
            this.e = intent.getStringExtra("device_id");
        }
        if (TextUtils.isEmpty(this.e)) {
            LogUtil.j(f26210b, "mDeviceMac is empty");
            this.f26211c = tfn.a().j();
        } else {
            this.f26211c = tfn.a().a(this.e);
        }
        b();
    }

    private void b() {
        ((CustomTitleBar) findViewById(R.id.setting_device_title_bar)).setTitleText(getString(R.string.IDS_app_name_calendar));
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.setting_switch_description);
        DeviceInfo deviceInfo = this.f26211c;
        if (deviceInfo != null && lvi.f(deviceInfo.getProductType())) {
            healthTextView.setText(getResources().getString(R.string.IDS_sync_calendar_to_band));
        } else {
            healthTextView.setText(getResources().getString(R.string.IDS_sync_calendar_to_watch));
        }
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) findViewById(R.id.setting_camera_switch_button);
        this.d = healthSwitchButton;
        healthSwitchButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homewear21.home.WearHomeCalendarSettingActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!(view instanceof CompoundButton)) {
                    LogUtil.a(WearHomeCalendarSettingActivity.f26210b, "view not CompoundButton");
                    return;
                }
                boolean zIsChecked = ((CompoundButton) view).isChecked();
                LogUtil.a(WearHomeCalendarSettingActivity.f26210b, "onclick, isChecked: ", Boolean.valueOf(zIsChecked));
                if (!zIsChecked || qqe.e(BaseApplication.getContext())) {
                    WearHomeCalendarSettingActivity.this.d(zIsChecked);
                } else {
                    WearHomeCalendarSettingActivity.this.d();
                }
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        LogUtil.a(f26210b, "onStart");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900100019");
        qhq.b("9001", arrayList, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a(f26210b, "request CalendarPermissions");
        PermissionsResultAction permissionsResultAction = new PermissionsResultAction() { // from class: com.huawei.ui.homewear21.home.WearHomeCalendarSettingActivity.1
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a(WearHomeCalendarSettingActivity.f26210b, "CalendarPermission Granted");
                WearHomeCalendarSettingActivity.this.c(true);
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a(WearHomeCalendarSettingActivity.f26210b, "CalendarPermission Denied");
                if (!WearHomeCalendarSettingActivity.this.shouldShowRequestPermissionRationale("android.permission.READ_CALENDAR")) {
                    LogUtil.a(WearHomeCalendarSettingActivity.f26210b, "show calendarPermission setting guide");
                    qrs.b(WearHomeCalendarSettingActivity.this, PermissionUtil.PermissionType.CALENDAR);
                }
                WearHomeCalendarSettingActivity.this.c(false);
            }
        };
        ltd.e().e(this, new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"}, permissionsResultAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        LogUtil.a(f26210b, "setAndSaveSwitchStatus : ", Boolean.valueOf(z));
        this.d.setChecked(z);
        d(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a(f26210b, "isOpen: ", Boolean.valueOf(z), ", currentTime: ", Long.valueOf(jCurrentTimeMillis));
        qhq.d("9001", "900100019", ffv.e("calendarToDeviceSwitch", z ? "1" : "0"), new b(z, jCurrentTimeMillis), jCurrentTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.d.setChecked(z);
    }

    public static class b implements HiDataOperateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f26214a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f26215c;
        private final WeakReference<WearHomeCalendarSettingActivity> d;

        private b(WearHomeCalendarSettingActivity wearHomeCalendarSettingActivity, boolean z, long j) {
            this.d = new WeakReference<>(wearHomeCalendarSettingActivity);
            this.f26215c = z;
            this.f26214a = j;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
        public void onResult(int i, Object obj) {
            LogUtil.a(WearHomeCalendarSettingActivity.f26210b, "saveSampleConfig errorCode: ", Integer.valueOf(i), ", object: ", obj, ", isOpen: ", Boolean.valueOf(this.f26215c), ", modifyTime: ", Long.valueOf(this.f26214a));
            if (1 != i) {
                if (this.f26215c) {
                    qec.b().syncCalendarSwitch(1);
                } else {
                    qec.b().syncCalendarSwitch(7);
                }
                HandlerExecutor.c(new Runnable() { // from class: tga
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.b();
                    }
                });
            }
        }

        public /* synthetic */ void b() {
            WearHomeCalendarSettingActivity wearHomeCalendarSettingActivity = this.d.get();
            if (wearHomeCalendarSettingActivity == null || wearHomeCalendarSettingActivity.isFinishing()) {
                return;
            }
            wearHomeCalendarSettingActivity.a(this.f26215c);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
