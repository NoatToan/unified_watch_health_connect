package com.huawei.ui.device.activity.update;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import defpackage.dad;
import defpackage.eej;
import defpackage.eev;
import defpackage.eey;
import defpackage.lmf;
import defpackage.maq;
import defpackage.mgg;
import defpackage.mhs;
import defpackage.nvd;
import defpackage.qqp;
import defpackage.qrs;
import defpackage.rcw;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class WearDeviceUpdateDialogActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthCheckBox f24829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private rcw f24830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthCheckBox f24831c;
    private LinearLayout d;
    private LinearLayout e;
    private String f;
    private String i;
    private View j;
    private LayoutInflater l;
    private boolean n;
    private mhs o;
    private HealthTextView q;
    private HealthTextView r;
    private LinearLayout t;
    private Context g = null;
    private boolean k = false;
    private String m = null;
    private final BroadcastReceiver h = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.update.WearDeviceUpdateDialogActivity.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("WearDeviceUpdateDialogActivity", "mDeviceStatusReceiver intent is null");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                LogUtil.j("WearDeviceUpdateDialogActivity", "mDeviceStatusReceiver action is null");
                return;
            }
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                LogUtil.a("WearDeviceUpdateDialogActivity", "mDeviceStatusReceiver ACTION_CONNECTION_STATE_CHANGED");
                Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                DeviceInfo deviceInfo = parcelableExtra instanceof DeviceInfo ? (DeviceInfo) parcelableExtra : null;
                if (deviceInfo == null || deviceInfo.getDeviceIdentify() == null || deviceInfo.getDeviceIdentify().equals(WearDeviceUpdateDialogActivity.this.m)) {
                    LogUtil.j("WearDeviceUpdateDialogActivity", "mDeviceStatusReceiver other");
                    return;
                }
                LogUtil.j("WearDeviceUpdateDialogActivity", "mDeviceStatusReceiver deviceInfo changed");
                maq.b().c(true);
                WearDeviceUpdateDialogActivity.this.finish();
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = this;
        LogUtil.a("WearDeviceUpdateDialogActivity", "onCreate()");
        this.f24830b = rcw.b(this.g);
        this.o = mhs.a();
        Window window = getWindow();
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        onWindowAttributesChanged(attributes);
        c();
        e();
        setFinishOnTouchOutside(false);
        b();
        overridePendingTransition(R.anim.push_activity_in, 0);
    }

    private void b() {
        BroadcastManagerUtil.c(this.g, this.h, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    private void h() {
        try {
            LogUtil.a("WearDeviceUpdateDialogActivity", "Enter unregisterBindDeviceBroadcast()!");
            unregisterReceiver(this.h);
        } catch (IllegalArgumentException e) {
            LogUtil.e("WearDeviceUpdateDialogActivity", "unregisterBindDeviceBroadcast failed:", ExceptionUtils.c(e));
        }
    }

    private void e() {
        Intent intent = getIntent();
        if (intent != null) {
            this.i = intent.getStringExtra("show_device_name");
            String stringExtra = intent.getStringExtra("mac");
            this.m = stringExtra;
            LogUtil.a("WearDeviceUpdateDialogActivity", "initUpdateMode mMac is ", CommonUtil.n(stringExtra));
            DeviceInfo deviceInfoB = mgg.b(this.m, "WearDeviceUpdateDialogActivity");
            if (deviceInfoB == null) {
                LogUtil.j("WearDeviceUpdateDialogActivity", "initUpdateMode deviceInfo is null");
                finish();
                return;
            }
            this.i = deviceInfoB.getDeviceName();
            this.n = eey.d(deviceInfoB, 108) && !Utils.k();
            this.f = deviceInfoB.getDeviceUdid();
            boolean booleanExtra = intent.getBooleanExtra(ParamConstants.CallbackMethod.ON_SHOW, false);
            this.k = booleanExtra;
            LogUtil.a("WearDeviceUpdateDialogActivity", "initUpdateMode, mIsShowBox = ", Boolean.valueOf(booleanExtra));
            b(intent.getStringExtra("name"), intent.getStringExtra("type"));
            g();
        }
    }

    private void g() {
        mhs.a().getSwitchSetting("wlan_auto_update", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.update.WearDeviceUpdateDialogActivity.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("WearDeviceUpdateDialogActivity", "initUpdateMode errorCode = ", Integer.valueOf(i), " objectData ", obj);
                if (i != 0 || !(obj instanceof String)) {
                    WearDeviceUpdateDialogActivity.this.c(false);
                } else {
                    WearDeviceUpdateDialogActivity.this.c(!"2".equals((String) obj));
                }
            }
        });
    }

    public boolean a() {
        return ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isSupportPairCheckedOtaAutoUpdateSwitch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final boolean z) {
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.update.WearDeviceUpdateDialogActivity.5
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    WearDeviceUpdateDialogActivity.this.e.setVisibility(8);
                    WearDeviceUpdateDialogActivity.this.f24829a.setChecked(true);
                } else if (!WearDeviceUpdateDialogActivity.this.k) {
                    WearDeviceUpdateDialogActivity.this.e.setVisibility(8);
                } else {
                    if (!Utils.o()) {
                        WearDeviceUpdateDialogActivity.this.f24829a.setChecked(true);
                    } else {
                        WearDeviceUpdateDialogActivity.this.f24829a.setChecked(WearDeviceUpdateDialogActivity.this.a());
                    }
                    WearDeviceUpdateDialogActivity.this.e.setVisibility(0);
                }
                WearDeviceUpdateDialogActivity.this.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        DeviceCapability deviceCapabilityA = eej.a(this.m);
        if (deviceCapabilityA == null || !deviceCapabilityA.getIsSupportAutoUpdate() || this.n) {
            LogUtil.j("WearDeviceUpdateDialogActivity", "setAutoUpdateStatus autoInstall is not support");
            this.d.setVisibility(8);
            j();
            return;
        }
        LogUtil.a("WearDeviceUpdateDialogActivity", "enter autoInstall");
        DeviceInfo deviceInfoB = mgg.b(this.m, "WearDeviceUpdateDialogActivity");
        if (deviceInfoB == null) {
            LogUtil.j("WearDeviceUpdateDialogActivity", "setAutoUpdateStatus currentDeviceInfo == null");
            j();
        } else {
            mhs.a().getSwitchSetting("auto_update_status", deviceInfoB.getDeviceUdid(), new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.update.WearDeviceUpdateDialogActivity.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("WearDeviceUpdateDialogActivity", "getAutoSwitchStatus errorCode = ", Integer.valueOf(i));
                    if (i != 0 || !(obj instanceof String)) {
                        WearDeviceUpdateDialogActivity.this.c("false");
                    } else {
                        WearDeviceUpdateDialogActivity.this.c(String.valueOf(obj));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final String str) {
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.update.WearDeviceUpdateDialogActivity.2
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.equals("true", str)) {
                    WearDeviceUpdateDialogActivity.this.d.setVisibility(8);
                } else {
                    if (!Utils.o()) {
                        WearDeviceUpdateDialogActivity.this.f24831c.setChecked(true);
                    } else {
                        WearDeviceUpdateDialogActivity.this.f24831c.setChecked(WearDeviceUpdateDialogActivity.this.a());
                    }
                    WearDeviceUpdateDialogActivity.this.d.setVisibility(0);
                }
                WearDeviceUpdateDialogActivity.this.j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.j("WearDeviceUpdateDialogActivity", "showDialog Entering");
        if (qrs.ac() && (this.t.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.t.getLayoutParams();
            layoutParams.height = qqp.a(this, 300.0f);
            this.t.setLayoutParams(layoutParams);
        }
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this, R.style.UpdateVersionCustomDialog).d(R.string.IDS_ota_update_state_check_new_version).a(this.j).a(R.string.IDS_app_update_later, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.update.WearDeviceUpdateDialogActivity.7
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                WearDeviceUpdateDialogActivity.this.finish();
            }
        }).d(R.string.IDS_app_update_now, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.update.WearDeviceUpdateDialogActivity.9
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (!qrs.r()) {
                    WearDeviceUpdateDialogActivity.this.f();
                    WearDeviceUpdateDialogActivity.this.d();
                    WearDeviceUpdateDialogActivity.this.b(true);
                    return;
                }
                LogUtil.j("WearDeviceUpdateDialogActivity", "user choose update return");
            }
        }).b();
        if (customAlertDialogB == null || customAlertDialogB.isShowing()) {
            return;
        }
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        DeviceInfo deviceInfoB;
        if (this.e.getVisibility() == 0) {
            HashMap map = new HashMap(16);
            if (this.f24829a.isChecked()) {
                this.o.setSwitchSetting("wlan_auto_update", "1", null);
                map.put("type", "1");
                d(true);
            } else {
                this.o.setSwitchSetting("wlan_auto_update", "2", null);
                map.put("type", "0");
            }
            map.put("click", 1);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090006.value(), map, 0);
        }
        if (this.d.getVisibility() != 0 || (deviceInfoB = mgg.b(this.m, "WearDeviceUpdateDialogActivity")) == null) {
            return;
        }
        LogUtil.a("WearDeviceUpdateDialogActivity", "enter mCheckAutoInstall");
        HashMap map2 = new HashMap(16);
        String deviceUdid = deviceInfoB.getDeviceUdid();
        if (this.f24831c.isChecked()) {
            rcw.b(BaseApplication.getContext()).a(this.m, true);
            mhs.a().setSwitchSetting("auto_update_status", "true", deviceUdid, null);
            map2.put("type", "1");
        } else {
            rcw.b(BaseApplication.getContext()).a(this.m, false);
            mhs.a().setSwitchSetting("auto_update_status", "false", deviceUdid, null);
            map2.put("type", "0");
        }
        map2.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090037.value(), map2, 0);
    }

    private void d(boolean z) {
        if (this.n) {
            HwOtaUpgradeManager.d().c(this.f, String.valueOf(z));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (nvd.i(this.g, this.m) == null || !TextUtils.isEmpty(nvd.i(this.g, this.m))) {
            return;
        }
        LogUtil.a("WearDeviceUpdateDialogActivity", "onResume() getBandCheckNewVersion is empty!");
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        CommonUtil.d(this.g);
        super.onDestroy();
        this.g = null;
        if (this.f24830b != null) {
            LogUtil.a("WearDeviceUpdateDialogActivity", "onDestroy updateInteractor release");
            this.f24830b = null;
        }
        h();
        LogUtil.a("WearDeviceUpdateDialogActivity", "onDestroy()");
    }

    private void c() {
        LogUtil.a("WearDeviceUpdateDialogActivity", "Enter initView!");
        if (getSystemService("layout_inflater") instanceof LayoutInflater) {
            this.l = (LayoutInflater) getSystemService("layout_inflater");
        }
        LayoutInflater layoutInflater = this.l;
        if (layoutInflater == null) {
            LogUtil.j("WearDeviceUpdateDialogActivity", "initView mInflater is null.");
            finish();
            return;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_device_update_new_dialog, (ViewGroup) null);
        this.j = viewInflate;
        if (viewInflate == null) {
            LogUtil.j("WearDeviceUpdateDialogActivity", "initView view is null.");
            finish();
            return;
        }
        this.r = (HealthTextView) viewInflate.findViewById(R.id.band_detail);
        this.t = (LinearLayout) this.j.findViewById(R.id.update_dialog_ll);
        this.e = (LinearLayout) this.j.findViewById(R.id.AppUpdateDialog_ota_auto_update_band);
        this.f24829a = (HealthCheckBox) this.j.findViewById(R.id.AppUpdateDialog_checkbox_band);
        this.q = (HealthTextView) this.j.findViewById(R.id.AppUpdateDialog_wlan_auto_update_band);
        if (Utils.o()) {
            this.q.setText(R.string.IDS_wlan_auto_update_device_new_overseas);
        } else {
            this.q.setText(R.string.IDS_wlan_auto_update_device_new);
        }
        this.d = (LinearLayout) this.j.findViewById(R.id.update_dialog_ota_auto_install_band);
        this.f24831c = (HealthCheckBox) this.j.findViewById(R.id.update_dialog_install_checkbox_band);
    }

    private void b(String str, String str2) {
        String string;
        LogUtil.a("WearDeviceUpdateDialogActivity", "Enter showAppNewVersion", str2);
        if (!TextUtils.isEmpty(str2) && str2.equals("2")) {
            string = this.g.getString(R.string.IDS_enterprise_Updates_content);
        } else {
            string = String.format(Locale.ENGLISH, this.g.getString(R.string.IDS_device_update_detail), str, this.i);
        }
        this.r.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.n) {
            d(this.f24829a.isChecked());
            Intent intent = new Intent();
            intent.putExtra("UNIQUE_ID", this.f);
            intent.setClassName(BaseApplication.getContext().getPackageName(), ComponentInfo.PluginWearAbility_A_0);
            dad.c().launchActivity(this.g, intent);
            finish();
            return;
        }
        LogUtil.a("WearDeviceUpdateDialogActivity", "enterBandUpdate enter");
        try {
            Intent intent2 = new Intent();
            intent2.setClass(this.g, UpdateVersionActivity.class);
            intent2.putExtra("device_id", this.m);
            this.g.startActivity(intent2);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("WearDeviceUpdateDialogActivity", "enterDeviceOtaActivity e ", ExceptionUtils.c(e));
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        LogUtil.a("WearDeviceUpdateDialogActivity", "enter sendOtaUpdateEvent.");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        DeviceInfo deviceInfoB = mgg.b(this.m, "WearDeviceUpdateDialogActivity");
        if (deviceInfoB == null) {
            LogUtil.a("WearDeviceUpdateDialogActivity", "enter sendOtaUpdateEvent decide is null.");
            return;
        }
        int productType = deviceInfoB.getProductType();
        if (productType != -1) {
            linkedHashMap.put(DeviceCategoryFragment.DEVICE_TYPE, String.valueOf(productType));
            linkedHashMap.put("device_classfication", String.valueOf(eev.d(productType)));
        }
        if (!z) {
            linkedHashMap.put("operationID", "1");
        } else {
            LogUtil.a("WearDeviceUpdateDialogActivity", "sendOtaUpdateEvent isSelectAutoUpdate::", Boolean.valueOf(this.f24829a.isChecked()));
            if (this.f24829a.isChecked()) {
                linkedHashMap.put("operationID", "3");
            } else {
                linkedHashMap.put("operationID", "4");
            }
        }
        rcw rcwVar = this.f24830b;
        if (rcwVar != null) {
            linkedHashMap.put("deviceNewVersion", rcwVar.b(this.m));
        }
        linkedHashMap.put("versionID", HwVersionManager.b(this.g).h(this.m));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_DEVICE_OTA_UPDATE_80020004.value(), linkedHashMap);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
