package com.huawei.ui.device.activity.update;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import defpackage.dmp;
import defpackage.dxm;
import defpackage.eby;
import defpackage.edn;
import defpackage.eej;
import defpackage.eev;
import defpackage.lmf;
import defpackage.lvi;
import defpackage.mgg;
import defpackage.mgi;
import defpackage.mhs;
import defpackage.nva;
import defpackage.nvd;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.rcw;
import defpackage.rcz;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes16.dex */
public class BandUpdateDialogActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f24779a;
    private rcz aa;
    private String ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthButton f24780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f24781c;
    private HealthButton d;
    private rcw e;
    private HealthCheckBox f;
    private mhs g;
    private String i;
    private HealthCheckBox j;
    private boolean k;
    private boolean m;
    private LinearLayout n;
    private HealthTextView p;
    private HealthTextView q;
    private HealthTextView r;
    private HealthTextView s;
    private String t;
    private HealthTextView u;
    private HealthTextView v;
    private HealthTextView w;
    private HealthTextView x;
    private HealthTextView y;
    private LinearLayout z;
    private Context h = null;
    private boolean o = false;
    private String l = null;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.h = this;
        LogUtil.a("BandUpdateDialogActivity", "onCreate()");
        this.e = rcw.b(this.h);
        this.g = mhs.a();
        setContentView(R.layout.activity_device_update_dialog);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int iD = qrs.d(this.h, 24.0f);
        if (!CommonUtil.bg()) {
            attributes.y = iD;
        }
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        if (qrs.af(this.h)) {
            window.setGravity(16);
        } else {
            window.setGravity(80);
        }
        a();
        b();
    }

    private void b() {
        Intent intent = getIntent();
        if (intent != null) {
            this.m = intent.getBooleanExtra("isScale", false);
            this.t = intent.getStringExtra("productId");
            this.ad = intent.getStringExtra("uniqueId");
            this.i = intent.getStringExtra("show_device_name");
            this.k = intent.getBooleanExtra("user_type", false);
            String stringExtra = intent.getStringExtra("mac");
            if (this.m) {
                this.aa = rcz.c();
            }
            if (stringExtra != null) {
                this.l = a(stringExtra);
                LogUtil.a("BandUpdateDialogActivity", "initUpdateMode mac is ", CommonUtil.n(stringExtra), "mMac is ", CommonUtil.n(this.l));
                DeviceInfo deviceInfoB = mgg.b(this.l, "BandUpdateDialogActivity");
                if (deviceInfoB != null) {
                    this.i = deviceInfoB.getDeviceName();
                }
            }
            a(intent);
            LogUtil.a("BandUpdateDialogActivity", "initUpdateMode, mIsShowBox = ", Boolean.valueOf(this.o));
            if (this.o) {
                this.f.setChecked(true);
                this.f24781c.setVisibility(0);
            } else {
                this.f24781c.setVisibility(8);
            }
            i();
            b(intent);
        }
    }

    private void i() {
        DeviceCapability deviceCapabilityA = eej.a(this.l);
        if (deviceCapabilityA == null || !deviceCapabilityA.getIsSupportAutoUpdate()) {
            LogUtil.a("BandUpdateDialogActivity", "enter autoInstall default");
            this.f24779a.setVisibility(8);
            return;
        }
        LogUtil.a("BandUpdateDialogActivity", "enter autoInstall");
        DeviceInfo deviceInfoB = mgg.b(this.l, "BandUpdateDialogActivity");
        if (deviceInfoB == null) {
            return;
        }
        String deviceUdid = deviceInfoB.getDeviceUdid();
        this.f24779a.setVisibility(0);
        c(deviceUdid);
    }

    private void b(Intent intent) {
        if (this.m) {
            this.aa.a(intent.getStringExtra("name"));
            this.aa.j(qrs.a(this.h, intent.getIntExtra("size", 0)));
            rcz rczVar = this.aa;
            rczVar.c(rczVar.f(intent.getStringExtra("message")));
            LogUtil.a("BandUpdateDialogActivity", "scaleNewVersion:", this.aa.g(), "size:", this.aa.o(), "detail:", this.aa.i());
            d(this.aa.g(), this.aa.o(), this.aa.i());
            return;
        }
        this.e.h(intent.getStringExtra("name"));
        nvd.j(String.valueOf(intent.getIntExtra("size", 0)), this.h);
        this.e.j(qrs.a(this.h, intent.getIntExtra("size", 0)));
        rcw rcwVar = this.e;
        rcwVar.f(rcwVar.m(intent.getStringExtra("message")));
        LogUtil.a("BandUpdateDialogActivity", "bandNewVersion:", this.e.b(this.l), "size:", this.e.e(), "detail:", this.e.d());
        d(this.e.b(this.l), this.e.e(), this.e.d());
    }

    private String a(String str) {
        String deviceIdentify;
        int length;
        String deviceIdentify2;
        int length2;
        DeviceInfo deviceInfoC = mgg.c("BandUpdateDialogActivity");
        if (deviceInfoC != null && (length2 = (deviceIdentify2 = deviceInfoC.getDeviceIdentify()).length()) > 4 && str.equalsIgnoreCase(deviceIdentify2.substring(length2 - 4, length2))) {
            return deviceInfoC.getDeviceIdentify();
        }
        DeviceInfo deviceInfoC2 = mgi.c("BandUpdateDialogActivity");
        if (deviceInfoC2 != null && (length = (deviceIdentify = deviceInfoC2.getDeviceIdentify()).length()) > 4 && str.equalsIgnoreCase(deviceIdentify.substring(length - 4, length))) {
            return deviceInfoC2.getDeviceIdentify();
        }
        return "";
    }

    private void a(Intent intent) {
        if (intent == null) {
            return;
        }
        String str = this.t;
        if (str == null) {
            LogUtil.a("BandUpdateDialogActivity", "mProductId is null");
            this.o = intent.getBooleanExtra(ParamConstants.CallbackMethod.ON_SHOW, false);
            return;
        }
        try {
            edn ednVarA = lvi.a(Integer.parseInt(str));
            if (ednVarA.w() == 1) {
                this.o = true;
            } else if (ednVarA.w() == 2) {
                this.o = false;
            } else {
                this.o = intent.getBooleanExtra(ParamConstants.CallbackMethod.ON_SHOW, false);
            }
        } catch (NumberFormatException unused) {
            LogUtil.a("BandUpdateDialogActivity", "mProductId = ", this.t);
            this.o = intent.getBooleanExtra(ParamConstants.CallbackMethod.ON_SHOW, false);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.m) {
            if (nva.c(this.h, this.t) == null && TextUtils.isEmpty(nva.c(this.h, this.t))) {
                LogUtil.a("BandUpdateDialogActivity", "onResume() getScaleCheckNewVersion is empty!");
                finish();
                return;
            }
            return;
        }
        if (nvd.i(this.h, this.l) == null || !TextUtils.isEmpty(nvd.i(this.h, this.l))) {
            return;
        }
        LogUtil.a("BandUpdateDialogActivity", "onResume() getBandCheckNewVersion is empty!");
        finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        CommonUtil.d(this.h);
        super.onDestroy();
        this.h = null;
        if (this.e != null) {
            LogUtil.a("BandUpdateDialogActivity", "ondestroy updateInteractor release");
            this.e = null;
        }
        LogUtil.a("BandUpdateDialogActivity", "onDestroy()");
    }

    private void a() {
        LogUtil.a("BandUpdateDialogActivity", "Enter initView!");
        this.z = (LinearLayout) qsp.a(this, R.id.AppUpdateDialog_show_changelog_band);
        this.u = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_changelog_title_band);
        this.r = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_changelog_application_band);
        this.s = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_changelog_application_value_band);
        this.w = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_changelog_version_band);
        this.y = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_changelog_version_value_band);
        this.x = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_changelog_size_band);
        this.v = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_changelog_size_value_band);
        this.p = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_changelog_detail_band);
        this.q = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_changelog_context_band);
        this.f24780b = (HealthButton) qsp.a(this, R.id.AppUpdateDialog_show_left_band);
        this.d = (HealthButton) qsp.a(this, R.id.AppUpdateDialog_show_right_band);
        this.n = (LinearLayout) qsp.a(this, R.id.AppUpdateDialog_notification_band);
        this.f24781c = (RelativeLayout) qsp.a(this, R.id.AppUpdateDialog_ota_auto_update_band);
        this.f = (HealthCheckBox) qsp.a(this, R.id.AppUpdateDialog_checkbox_band);
        this.f24779a = (RelativeLayout) qsp.a(this, R.id.update_dialog_ota_auto_install_band);
        this.j = (HealthCheckBox) qsp.a(this, R.id.update_dialog_install_checkbox_band);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        LogUtil.a("BandUpdateDialogActivity", "onclick :" + id);
        if (id == R.id.AppUpdateDialog_show_left_band) {
            LogUtil.a("BandUpdateDialogActivity", "user choose not update");
            nvd.q(BaseApplication.getContext());
            c(false);
            finish();
            return;
        }
        if (id == R.id.AppUpdateDialog_show_right_band) {
            if (qrs.r()) {
                LogUtil.j("BandUpdateDialogActivity", "user choose update return");
                return;
            }
            LogUtil.a("BandUpdateDialogActivity", "user choose update");
            LogUtil.a("BandUpdateDialogActivity", "WLAN update show is " + this.o);
            if (this.o) {
                LogUtil.a("BandUpdateDialogActivity", "user choose update mCheckAutoUpdate isChecked = " + this.f.isChecked());
                c();
                Intent intent = new Intent("com.huawei.health.action.ACTION_BAND_UPDATE_DIALOG");
                intent.setPackage(this.h.getPackageName());
                intent.putExtra("band_update_dialog", this.f.isChecked());
                BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
            }
            d();
            c(true);
            return;
        }
        LogUtil.a("BandUpdateDialogActivity", "onClick id is " + id);
    }

    private void c() {
        HashMap map = new HashMap(16);
        if (this.f.isChecked()) {
            this.g.setSwitchSetting("wlan_auto_update", "1", null);
            map.put("type", "1");
        } else {
            this.g.setSwitchSetting("wlan_auto_update", "2", null);
            map.put("type", "0");
        }
        DeviceCapability deviceCapabilityA = eej.a(this.l);
        if (deviceCapabilityA != null && deviceCapabilityA.getIsSupportAutoUpdate()) {
            LogUtil.a("BandUpdateDialogActivity", "enter handleSaveState");
            DeviceInfo deviceInfoB = mgg.b(this.l, "BandUpdateDialogActivity");
            if (deviceInfoB == null) {
                return;
            }
            String deviceUdid = deviceInfoB.getDeviceUdid();
            if (this.j.isChecked()) {
                rcw.b(BaseApplication.getContext()).a(this.l, true);
                mhs.a().setSwitchSetting("auto_update_status", "true", deviceUdid, null);
            } else {
                rcw.b(BaseApplication.getContext()).a(this.l, false);
                mhs.a().setSwitchSetting("auto_update_status", "false", deviceUdid, null);
            }
        }
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090006.value(), map, 0);
    }

    private void c(String str) {
        mhs.a().getSwitchSetting("auto_update_status", str, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.update.BandUpdateDialogActivity.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("BandUpdateDialogActivity", "getAutoSwitchStatus errorCode = ", Integer.valueOf(i));
                if (i == 0 && (obj instanceof String)) {
                    if (TextUtils.equals("true", String.valueOf(obj))) {
                        BandUpdateDialogActivity.this.b("auto_update_status", true);
                    } else {
                        BandUpdateDialogActivity.this.b("auto_update_status", false);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str, final boolean z) {
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.update.BandUpdateDialogActivity.5
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.equals(str, "wlan_auto_update")) {
                    BandUpdateDialogActivity.this.f.setChecked(z);
                } else if (TextUtils.equals(str, "auto_update_status")) {
                    BandUpdateDialogActivity.this.j.setChecked(z);
                } else {
                    LogUtil.j("BandUpdateDialogActivity", "updateUiState error");
                }
            }
        });
    }

    private void d(String str, String str2, String str3) {
        LogUtil.a("BandUpdateDialogActivity", "Enter showAppNewVersion");
        this.z.setVisibility(0);
        this.n.setVisibility(8);
        this.u.setText(this.h.getString(R.string.IDS_ota_update_state_check_new_version));
        this.r.setText(this.h.getString(R.string.IDS_device_msgnotif_applications));
        this.s.setText(this.i);
        this.w.setText(this.h.getString(R.string.IDS_app_update_version));
        this.y.setText(str);
        this.x.setText(this.h.getString(R.string.IDS_app_update_size));
        this.v.setText(str2);
        this.p.setText(this.h.getString(R.string.IDS_app_update_detail));
        this.q.setText(str3);
        this.f24780b.setText(this.h.getString(R.string.IDS_app_update_later));
        this.d.setText(this.h.getString(R.string.IDS_app_update_now));
        this.f24780b.setOnClickListener(this);
        this.d.setOnClickListener(this);
    }

    private void d() {
        LogUtil.a("BandUpdateDialogActivity", "enterBandupdate mIsScale=", Boolean.valueOf(this.m));
        if (this.m) {
            e();
            return;
        }
        Intent intent = new Intent();
        intent.setClass(this.h, UpdateVersionActivity.class);
        intent.putExtra("device_id", this.l);
        try {
            this.h.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("BandUpdateDialogActivity", "enterBandupdate exception");
        }
        finish();
    }

    private void e() {
        eby ebyVar;
        LogUtil.a("BandUpdateDialogActivity", "enterScaleBandUpdate mProductId=", this.t, ", mIsMainUser=", Boolean.valueOf(this.k));
        MeasurableDevice measurableDeviceC = dmp.d().c(this.t, false);
        if (measurableDeviceC == null) {
            LogUtil.j("BandUpdateDialogActivity", "enterScaleBandUpdate bondedDevice is null");
            finish();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("productId", this.t);
        ContentValues contentValues = new ContentValues();
        if (dxm.y(this.t)) {
            if (measurableDeviceC instanceof eby) {
                LogUtil.a("BandUpdateDialogActivity", "is wifi device");
                ebyVar = (eby) measurableDeviceC;
                if (TextUtils.isEmpty(this.ad)) {
                    this.ad = ebyVar.getUniqueId();
                }
            } else {
                ebyVar = null;
            }
            if (!dxm.a(this.t, this.ad) || ebyVar != null) {
                b(intent, true);
            } else {
                b(intent, false);
            }
        } else if (dxm.at(this.t)) {
            b(intent, true);
        } else {
            intent.setClass(this.h, WeightUpdateVersionActivity.class);
            intent.putExtra("isUpdateDialog", true);
            intent.putExtra("user_type", this.k);
        }
        contentValues.put("productId", this.t);
        contentValues.put("uniqueId", this.ad);
        intent.putExtra("commonDeviceInfo", contentValues);
        try {
            this.h.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("BandUpdateDialogActivity", "enterScaleBandUpdate exception");
        }
        finish();
    }

    private void b(Intent intent, boolean z) {
        if (z) {
            intent.setClass(this.h, DeviceMainActivity.class);
            intent.putExtra("view", "WifiVersionDetails");
        } else {
            intent.setClass(this.h, WeightUpdateVersionActivity.class);
            intent.putExtra("isUpdateDialog", true);
            intent.putExtra("user_type", true);
            intent.putExtra("isFromNotify", true);
        }
    }

    private void c(boolean z) {
        if (this.m) {
            LogUtil.j("BandUpdateDialogActivity", "sendOtaUpdateEvent scale is not supported currently.");
            return;
        }
        LogUtil.a("BandUpdateDialogActivity", "enter sendOtaUpdateEvent.");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        DeviceInfo deviceInfoB = mgg.b(this.l, "BandUpdateDialogActivity");
        if (deviceInfoB == null) {
            LogUtil.a("BandUpdateDialogActivity", "enter sendOtaUpdateEvent decide is null.");
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
            LogUtil.a("BandUpdateDialogActivity", "sendOtaUpdateEvent isSelectAutoUpdate::", Boolean.valueOf(this.f.isChecked()));
            if (this.f.isChecked()) {
                linkedHashMap.put("operationID", "3");
            } else {
                linkedHashMap.put("operationID", "4");
            }
        }
        rcw rcwVar = this.e;
        if (rcwVar != null) {
            linkedHashMap.put("deviceNewVersion", rcwVar.b(this.l));
        }
        linkedHashMap.put("versionID", HwVersionManager.b(this.h).h(this.l));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_DEVICE_OTA_UPDATE_80020004.value(), linkedHashMap);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
