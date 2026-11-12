package com.huawei.ui.device.activity.update;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.huawei.fullscenarioservice.pluginwearota.callback.InitCallback;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.ExecuteMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
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
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressindicator.HealthProgressIndicator;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.update.UpdateVersionActivity;
import defpackage.ecu;
import defpackage.edl;
import defpackage.edn;
import defpackage.eej;
import defpackage.eel;
import defpackage.eep;
import defpackage.eeq;
import defpackage.eev;
import defpackage.eey;
import defpackage.lmf;
import defpackage.lsk;
import defpackage.lvi;
import defpackage.lxm;
import defpackage.maq;
import defpackage.max;
import defpackage.maz;
import defpackage.mbc;
import defpackage.mbe;
import defpackage.mes;
import defpackage.mga;
import defpackage.mgg;
import defpackage.mhs;
import defpackage.mio;
import defpackage.nvd;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.ram;
import defpackage.rcw;
import defpackage.rdt;
import defpackage.xjt;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class UpdateVersionActivity extends BaseActivity implements View.OnClickListener {
    private String ae;
    private HealthTextView af;
    private HealthTextView ag;
    private ImageView ah;
    private HealthCardView ai;
    private HealthTextView ak;
    private String al;
    private LinearLayout am;
    private RelativeLayout ao;
    private LinearLayout ap;
    private String aq;
    private HealthButton ar;
    private HealthTextView as;
    private HealthCardView at;
    private HealthTextView au;
    private HealthTextView av;
    private HealthTextView aw;
    private rcw ax;
    private HealthTextView az;
    private LinearLayout ba;
    private String d;
    private HealthTextView g;
    private ImageView h;
    private CustomTitleBar i;
    private HealthCardView j;
    private RelativeLayout k;
    private RelativeLayout l;
    private ImageView m;
    private ImageView n;
    private HealthProgressIndicator o;
    private HealthProgressIndicator p;
    private String q;
    private int r;
    private RelativeLayout s;
    private DeviceInfo t;
    private ImageView v;
    private boolean y;
    private Context f = null;
    private int aj = -1;
    private BroadcastReceiver e = null;
    private boolean u = true;
    private boolean z = false;
    private boolean ad = false;
    private boolean ab = false;
    private CustomTextAlertDialog x = null;
    private CustomTextAlertDialog ay = null;
    private CustomTextAlertDialog an = null;
    private boolean ac = false;
    private boolean aa = false;
    private ram.c w = new ram.c(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24812c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f24810a = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            LogUtil.a("UpdateVersionActivity", "onReceive: action = ", action);
            if ("action_app_check_new_version_state".equals(action)) {
                UpdateVersionActivity.this.a(intent);
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f24811b = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.11
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Parcelable parcelableExtra;
            LogUtil.a("UpdateVersionActivity", "mConnectStateChangedReceiver(): intent = ", intent.getAction());
            if (context == null || !"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || (parcelableExtra = intent.getParcelableExtra("deviceinfo")) == null) {
                return;
            }
            if (!(parcelableExtra instanceof DeviceInfo)) {
                LogUtil.a("UpdateVersionActivity", "! parcelableExtra instanceof DeviceInfo ");
                return;
            }
            DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
            if (!TextUtils.equals(deviceInfo.getDeviceIdentify(), UpdateVersionActivity.this.ae)) {
                LogUtil.j("UpdateVersionActivity", "!TextUtils.equals(deviceIdentify, mMacAddress)");
                return;
            }
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "mConnectStateChangedReceiver(): state = ", Integer.valueOf(deviceConnectState));
            if (deviceConnectState == 2) {
                UpdateVersionActivity.this.ao.setVisibility(8);
                UpdateVersionActivity.this.u = true;
            } else if (deviceConnectState == 3) {
                UpdateVersionActivity updateVersionActivity = UpdateVersionActivity.this;
                updateVersionActivity.a(updateVersionActivity.f.getString(R.string.IDS_music_management_disconnection));
                UpdateVersionActivity.this.u = false;
            } else if (deviceConnectState == 4) {
                UpdateVersionActivity updateVersionActivity2 = UpdateVersionActivity.this;
                updateVersionActivity2.a(updateVersionActivity2.f.getString(R.string.IDS_device_switch_device_connect_fail));
            } else {
                LogUtil.a("UpdateVersionActivity", "mConnectStateChangedReceiver() default");
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent) {
        int intExtra = intent.getIntExtra("state", -1);
        int intExtra2 = intent.getIntExtra("result", -1);
        String stringExtra = intent.getStringExtra("extra_band_imei");
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "updateAppState: state = ", intExtra + ", result = ", Integer.valueOf(intExtra2));
        if (!TextUtils.equals(stringExtra, this.ae)) {
            LogUtil.j("UpdateVersionActivity", "deviceId != mMacAddress");
            return;
        }
        intent.getStringExtra("content");
        a(intExtra, intExtra2);
        e(intExtra, intExtra2);
        c(intExtra, intExtra2);
    }

    private void a(int i, int i2) {
        switch (i) {
            case 10:
                ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "STATE_CHECK_NEW_VERSION_START: mUpdateInteractors.mUpdateStatus = ", Integer.valueOf(n()));
                break;
            case 11:
                ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "STATE_CHECK_NEW_VERSION_FAILED: mUpdateInteractors.mUpdateStatus = ", Integer.valueOf(n()));
                if (n() == 1) {
                    if (i2 == 0) {
                        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "No New Version");
                        c();
                        v();
                        maq.b().c(false);
                    } else {
                        d(i2);
                        xjt.ap("STATE_CHECK_NEW_VERSION_FAILED");
                    }
                }
                break;
            case 12:
                ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "STATE_CHECK_NEW_VERSION_SUCCESS: mUpdateInteractors.mUpdateStatus = ", Integer.valueOf(n()));
                nvd.c(i2, this.f, nvd.i(this.f, this.ae), this.ae);
                ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "STATE_CHECK_NEW_VERSION_SUCCESS: mBandNewVersion = ", this.ax.b(this.ae));
                break;
            default:
                LogUtil.a("UpdateVersionActivity", "updateAppStateOne default");
                break;
        }
    }

    private void e(int i, int i2) {
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "updateAppStateTwo: getOtaStatus:", Integer.valueOf(n()), ", state:", Integer.valueOf(i));
        if (i != 20) {
            switch (i) {
                case 30:
                    if (n() == 1) {
                        maq.b().e(this.ae, 2);
                    }
                    break;
                case 31:
                    if (n() == 2) {
                        d(this.f.getString(R.string.IDS_update_get_changelog_failed));
                    }
                    break;
                case 32:
                    int iN = n();
                    if (i2 != 13) {
                        if (iN == 2 || iN == 4) {
                            ac();
                        }
                        if (iN == 6) {
                            ram.c(this.f, false, this.ae);
                            finish();
                        }
                    } else {
                        maq.b().e(this.ae, 2);
                        d();
                    }
                    break;
                default:
                    LogUtil.a("UpdateVersionActivity", "updateAppStateTwo default");
                    break;
            }
        }
    }

    private void ac() {
        String strJ = HwVersionManager.b(BaseApplication.getContext()).j(this.ae);
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "refreshVersionPage: bandCurrentVersion:", this.d, ", bandNewVersion:", strJ);
        if (TextUtils.isEmpty(this.d) || TextUtils.isEmpty(strJ)) {
            v();
            return;
        }
        DeviceCapability deviceCapabilityC = eej.c();
        if (this.d.equals(strJ)) {
            v();
        } else {
            e(strJ, deviceCapabilityC);
        }
    }

    private void e(String str, DeviceCapability deviceCapability) {
        maq.b().a(this.ae, 1);
        if (deviceCapability != null && deviceCapability.getIsSupportNotifyDeviceNewVersion()) {
            this.w.sendEmptyMessageDelayed(1, 5000L);
            mbe mbeVar = new mbe();
            mbeVar.b(this.ae);
            mbeVar.d(str);
            mbeVar.c(CommonUtil.i(nvd.e(BaseApplication.getContext(), this.ae, str)));
            mbeVar.e(System.currentTimeMillis() / 1000);
            mbeVar.a(1);
            mbeVar.e(0);
            String strJ = nvd.j(this.f, this.ae);
            if (!TextUtils.isEmpty(strJ)) {
                mbeVar.d(lsk.a(strJ, 10));
            }
            ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "setUpdateMessage sendUpdateMessage");
            mbc.b().e(mbeVar, strJ, new e(this));
            return;
        }
        d();
    }

    public static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<UpdateVersionActivity> f24828c;

        e(UpdateVersionActivity updateVersionActivity) {
            this.f24828c = new WeakReference<>(updateVersionActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(final int i, Object obj) {
            ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "STATE_CHECK_NEW_VERSION_SUCCESS: errorCode = ", Integer.valueOf(i));
            final UpdateVersionActivity updateVersionActivity = this.f24828c.get();
            if (updateVersionActivity == null) {
                return;
            }
            updateVersionActivity.w.removeMessages(1);
            updateVersionActivity.runOnUiThread(new Runnable() { // from class: rak
                @Override // java.lang.Runnable
                public final void run() {
                    UpdateVersionActivity.e.c(i, updateVersionActivity);
                }
            });
        }

        public static /* synthetic */ void c(int i, UpdateVersionActivity updateVersionActivity) {
            if (i == 109023) {
                updateVersionActivity.v();
                return;
            }
            if (i == 109028) {
                updateVersionActivity.v();
                updateVersionActivity.c();
                qpx.e(updateVersionActivity.f, updateVersionActivity.f.getResources().getString(R.string.IDS_device_ear_upgrading));
            } else if (i == 109024) {
                updateVersionActivity.z = true;
                updateVersionActivity.d();
            } else {
                updateVersionActivity.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        nvd.h("", this.ae, this.f);
        nvd.a("", this.ae, this.f);
        nvd.c("", this.ae, this.f);
    }

    private void c(int i, int i2) {
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "STATE_DOWNLOAD_APP: otaStatus = ", Integer.valueOf(n()), ",state = ", Integer.valueOf(i));
        switch (i) {
            case 19:
                w();
                break;
            case 20:
            default:
                LogUtil.a("UpdateVersionActivity", "updateAppStateThree default");
                break;
            case 21:
                b(i2);
                break;
            case 22:
                String strE = ram.e(this.f, i2);
                b(strE);
                xjt.ap(strE);
                break;
            case 23:
                maq.b().c(true);
                CustomTextAlertDialog customTextAlertDialog = this.x;
                if (customTextAlertDialog != null && customTextAlertDialog.isShowing()) {
                    this.x.dismiss();
                }
                al();
                b(23, i2);
                nvd.d(this.t, "1", "m3");
                if (nvd.o(this.f)) {
                    ram.c(this.f, false, this.ae);
                }
                finish();
                break;
        }
    }

    private void d(int i) {
        String string;
        if (i == 1) {
            string = this.f.getResources().getString(R.string.IDS_update_network_abnormal);
        } else if (i == 2) {
            string = this.f.getResources().getString(R.string.IDS_update_server_error);
        } else if (i == 4) {
            string = this.f.getString(R.string.IDS_settings_firmware_upgrade_phone_low_battery);
            if (qrs.ah(BaseApplication.getContext())) {
                string = this.f.getString(R.string.IDS_pad_phone_low_battery, UnitUtil.e(10.0d, 2, 0));
            }
        } else {
            string = this.f.getResources().getString(R.string.IDS_update_unknown_error);
        }
        d(string);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f = this;
        d((Activity) this);
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "onCreate()");
        p();
        if (TextUtils.isEmpty(this.ae) && TextUtils.isEmpty(this.al)) {
            ReleaseLogUtil.e("DEVMGR_UpdateVersionActivity", "onCreate macAddress and mPhdDeviceUdid isEmpty");
            finish();
        } else {
            i();
        }
    }

    private void d(final Activity activity) {
        LogUtil.a("UpdateVersionActivity", "applyWindowInset activity:", activity);
        final ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(android.R.id.content);
        boolean zX = qrs.x(activity);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(activity.getWindow(), activity.getWindow().getDecorView());
        boolean z = !zX;
        insetsController.setAppearanceLightStatusBars(z);
        insetsController.setAppearanceLightNavigationBars(z);
        ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OnApplyWindowInsetsListener() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.12
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
                LogUtil.a("UpdateVersionActivity", "onApplyWindowInsets activity:", activity, " insets:", insets);
                viewGroup.setPadding(0, 0, 0, insets.bottom);
                return windowInsetsCompat;
            }
        });
    }

    private void i() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.14
            @Override // java.lang.Runnable
            public void run() {
                List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "UpdateVersionActivity");
                if (deviceList == null) {
                    ecu.d().executeDeviceRelatedLogic(ExecuteMode.FORCE_INIT_PHONE_SERVICE, null, "UpdateVersionActivity");
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e2) {
                        LogUtil.e("UpdateVersionActivity", "getCurrentDeviceInfo InterruptedException ", ExceptionUtils.c(e2));
                        xjt.ap("getCurrentDeviceInfo InterruptedException");
                    }
                    deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "UpdateVersionActivity");
                }
                LogUtil.a("UpdateVersionActivity", "deviceList ", deviceList);
                if (deviceList == null || deviceList.size() <= 0) {
                    UpdateVersionActivity.this.t = null;
                    UpdateVersionActivity.this.w.sendEmptyMessage(2);
                    return;
                }
                for (DeviceInfo deviceInfo : deviceList) {
                    if ((!TextUtils.isEmpty(UpdateVersionActivity.this.al) && UpdateVersionActivity.this.al.equals(deviceInfo.getDeviceUdid())) || (!TextUtils.isEmpty(UpdateVersionActivity.this.ae) && UpdateVersionActivity.this.ae.equals(deviceInfo.getDeviceIdentify()))) {
                        UpdateVersionActivity.this.t = deviceInfo;
                        break;
                    }
                }
                UpdateVersionActivity.this.w.sendEmptyMessage(2);
            }
        });
    }

    public void e() {
        DeviceInfo deviceInfo = this.t;
        if (deviceInfo == null) {
            LogUtil.j("UpdateVersionActivity", "onCreate deviceInfo == null");
            Intent intent = new Intent();
            intent.setClassName(this, "com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity");
            startActivity(intent);
            finish();
            return;
        }
        this.al = deviceInfo.getDeviceUdid();
        this.ae = this.t.getDeviceIdentify();
        boolean zK = Utils.k();
        LogUtil.j("UpdateVersionActivity", "onCreate isOverseaCloud ", Boolean.valueOf(zK));
        if (eey.d(this.t, 108) && !zK) {
            o();
            return;
        }
        e(this.t);
        this.d = this.t.getSoftVersion();
        this.aq = this.t.getDeviceSplicingProductVersion();
        this.q = this.t.getDeviceOStVersion();
        boolean z = false;
        if (eel.d(this.t.getProductType())) {
            this.ac = true;
        } else {
            this.ac = false;
        }
        this.ax = rcw.b(this.f);
        setContentView(R.layout.activity_update_version_new);
        getWindow().setFlags(16777216, 16777216);
        maq.b().o();
        if (eey.d(this.t, 58) || (eey.d(this.t, 108) && zK)) {
            z = true;
        }
        this.f24812c = z;
        t();
        m();
        nvd.d(this.t, "0", "m0");
    }

    private void p() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("UpdateVersionActivity", "onCreate it == null");
            finish();
        } else {
            this.ae = intent.getStringExtra("device_id");
            this.al = intent.getStringExtra("UNIQUE_ID");
            this.u = intent.getBooleanExtra("connect_status", true);
        }
    }

    private void o() {
        HwOtaUpgradeManager.d().c(this.al, new InitCallback() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.19
            @Override // com.huawei.fullscenarioservice.pluginwearota.callback.InitCallback
            public void onInitComplete(int i) {
                LogUtil.a("UpdateVersionActivity", "onInitComplete code:", Integer.valueOf(i));
                Message messageObtainMessage = UpdateVersionActivity.this.w.obtainMessage();
                messageObtainMessage.what = 3;
                messageObtainMessage.arg1 = i;
                messageObtainMessage.obj = UpdateVersionActivity.this.al;
                UpdateVersionActivity.this.w.sendMessage(messageObtainMessage);
            }
        });
    }

    private void m() {
        maz.d().b();
        maq.b().c(true);
        DeviceCapability deviceCapabilityA = eej.a(this.ae);
        if (deviceCapabilityA != null && deviceCapabilityA.getIsSupportAutoUpdate()) {
            LogUtil.a("UpdateVersionActivity", "mIsSupportBackground is true");
            this.aa = true;
        }
        int iN = n();
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "initData otaStatus is,", Integer.valueOf(iN));
        if (iN == 6) {
            LogUtil.a("UpdateVersionActivity", "onCreate, device is OTAing");
            ram.c(this.f, false, this.ae);
            finish();
        } else if (iN == 4 || iN == 5) {
            LogUtil.a("UpdateVersionActivity", "onCreate, device is background transfer or failed");
            xjt.ap("onCreate, device is background transfer or failed");
            ram.c(this.f, false, this.ae);
            finish();
        } else if (iN == 3) {
            LogUtil.a("UpdateVersionActivity", "onCreate, device is background downloading");
            w();
            b(max.c().b(this.ae));
            ai();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("action_app_check_new_version_state");
            BroadcastManagerUtil.c(this.f, this.f24810a, intentFilter, LocalBroadcast.f36595c, null);
        } else if (iN == 2 && !TextUtils.isEmpty(maq.b().d())) {
            LogUtil.a("UpdateVersionActivity", "onCreate, device is background download failed");
            xjt.ap("onCreate, device is background download failed");
            w();
            maq.b().e(this.ae, 3);
            b(maq.b().d());
        } else if (iN == 1) {
            u();
            ai();
            ad();
        } else {
            s();
            ad();
        }
        f();
    }

    private void ad() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_app_check_new_version_state");
        Context context = this.f;
        if (context != null) {
            BroadcastManagerUtil.c(context, this.f24810a, intentFilter, LocalBroadcast.f36595c, null);
        }
    }

    private void f() {
        if (aa()) {
            mhs.a().getSwitchSetting("auto_update_status", this.al, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.17
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "getSwitchStatus errorCode = ", Integer.valueOf(i));
                    if (i == 0 && (obj instanceof String)) {
                        if (TextUtils.equals("true", String.valueOf(obj))) {
                            UpdateVersionActivity.this.y = true;
                        } else {
                            UpdateVersionActivity.this.y = false;
                        }
                    }
                    ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "mIsSupportAutoUpdate:", Boolean.valueOf(UpdateVersionActivity.this.y));
                }
            });
        }
    }

    private void s() {
        LogUtil.a("UpdateVersionActivity", "enter initUpdate()");
        ai();
        maq.b().e(this.ae, 0);
        ab();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.a("UpdateVersionActivity", "onResume()");
        nvd.e(this.f, true);
        super.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        LogUtil.a("UpdateVersionActivity", "onPause()");
        nvd.e(this.f, false);
        super.onPause();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("UpdateVersionActivity", "onBackPressed()");
        if (this.ad) {
            aq();
            return;
        }
        if (this.ab) {
            q();
            return;
        }
        if (this.ax != null) {
            int iN = n();
            ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "onBackPressed() status = ", Integer.valueOf(iN));
            if (iN == 0) {
                super.onBackPressed();
            } else if (iN == 3) {
                k();
            } else {
                super.onBackPressed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int n() {
        return maq.b().c(this.ae);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        CommonUtil.d(this.f);
        nvd.e(this.f, false);
        super.onDestroy();
        this.w.removeCallbacksAndMessages(null);
        ax();
        this.e = null;
        au();
        this.f24810a = null;
        j();
        if (this.ax != null && n() != 3 && n() != 4 && n() != 12 && n() != 6) {
            maq.b().e(this.ae, 0);
            LogUtil.a("UpdateVersionActivity", "onDestroy updateInteractor release");
        }
        this.f = null;
        LogUtil.a("UpdateVersionActivity", "onDestroy()");
    }

    private void j() {
        CustomTextAlertDialog customTextAlertDialog = this.x;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
            this.x = null;
        }
        CustomTextAlertDialog customTextAlertDialog2 = this.ay;
        if (customTextAlertDialog2 != null) {
            customTextAlertDialog2.dismiss();
            this.ay = null;
        }
        CustomTextAlertDialog customTextAlertDialog3 = this.an;
        if (customTextAlertDialog3 != null) {
            customTextAlertDialog3.dismiss();
            this.an = null;
        }
    }

    private void t() {
        LogUtil.a("UpdateVersionActivity", "Enter initView!");
        this.i = (CustomTitleBar) qsp.a(this, R.id.update_title);
        this.ao = (RelativeLayout) qsp.a(this, R.id.update_error_layout);
        this.as = (HealthTextView) qsp.a(this, R.id.update_error_text);
        this.k = (RelativeLayout) qsp.a(this, R.id.detection_circle);
        this.n = (ImageView) qsp.a(this, R.id.detection_check_logo);
        this.o = (HealthProgressIndicator) qsp.a(this, R.id.detection_ota_animation);
        this.l = (RelativeLayout) qsp.a(this, R.id.detection_end);
        this.m = (ImageView) qsp.a(this, R.id.detection_end_check_logo);
        this.s = (RelativeLayout) qsp.a(this, R.id.download_circle);
        this.am = (LinearLayout) qsp.a(this, R.id.progress_circle_download);
        this.p = (HealthProgressIndicator) qsp.a(this, R.id.download_ota_animation);
        this.ag = (HealthTextView) qsp.a(this, R.id.text_percent);
        this.ak = (HealthTextView) qsp.a(this, R.id.text_per_sign);
        this.v = (ImageView) qsp.a(this, R.id.image_check_logo);
        this.ak.setText(String.valueOf(new DecimalFormatSymbols(Locale.getDefault()).getPercent()));
        this.ba = (LinearLayout) qsp.a(this, R.id.version_text_layout);
        this.az = (HealthTextView) qsp.a(this, R.id.version_text);
        this.av = (HealthTextView) qsp.a(this, R.id.version_download);
        this.au = (HealthTextView) qsp.a(this, R.id.version_size_text);
        this.ai = (HealthCardView) qsp.a(this, R.id.new_version_layout);
        this.ah = (ImageView) qsp.a(this, R.id.new_settings_switch);
        this.af = (HealthTextView) qsp.a(this, R.id.new_version_name);
        this.j = (HealthCardView) qsp.a(this, R.id.current_version_layout);
        this.h = (ImageView) qsp.a(this, R.id.current_settings_switch);
        this.g = (HealthTextView) qsp.a(this, R.id.current_version_name);
        this.at = (HealthCardView) qsp.a(this, R.id.update_log_layout);
        this.aw = (HealthTextView) qsp.a(this, R.id.update_log_content);
        this.ap = (LinearLayout) qsp.a(this, R.id.update_button_layout);
        this.ar = (HealthButton) qsp.a(this, R.id.update_button);
        this.ai.setOnClickListener(this);
        this.j.setOnClickListener(this);
        this.ar.setOnClickListener(this);
        if (LanguageUtil.z(this.f)) {
            this.am.setLayoutDirection(0);
        }
        r();
    }

    private void r() {
        String string;
        Context context = this.f;
        if (context == null) {
            string = "";
        } else {
            string = context.getResources().getString(R.string.IDS_device_wear_home_device_ota_upgrade);
        }
        this.i.setTitleText(string);
        this.i.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UpdateVersionActivity.this.onBackPressed();
            }
        });
        this.r = as();
    }

    private void ag() {
        if (this.f24812c) {
            return;
        }
        if (e(this.r) || aa() || ram.d(this.t)) {
            LogUtil.a("UpdateVersionActivity", "show setting");
            this.i.setRightButtonVisibility(0);
            this.i.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.device_update_setting), qre.f(R.string.IDS_main_btn_state_settings));
            this.i.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.20
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (qrs.r()) {
                        LogUtil.j("UpdateVersionActivity", "onClick setting isFastClick");
                        return;
                    }
                    LogUtil.a("UpdateVersionActivity", "onClick enter setting");
                    Intent intent = new Intent();
                    intent.setClass(UpdateVersionActivity.this.f, UpdateSettingActivity.class);
                    UpdateVersionActivity updateVersionActivity = UpdateVersionActivity.this;
                    intent.putExtra("device_support_wlan", updateVersionActivity.e(updateVersionActivity.r));
                    intent.putExtra("device_support_auto", UpdateVersionActivity.this.aa());
                    intent.putExtra("device_support_wlan_transmit", ram.d(UpdateVersionActivity.this.t));
                    intent.putExtra("device_unique", UpdateVersionActivity.this.al);
                    intent.putExtra("device_id", UpdateVersionActivity.this.ae);
                    UpdateVersionActivity.this.startActivityForResult(intent, 101);
                }
            });
        }
    }

    private int as() {
        int productType;
        DeviceInfo deviceInfoE = maq.b().e(this.ae);
        if (deviceInfoE == null) {
            LogUtil.a("UpdateVersionActivity", "Enter showDeviceType() deviceInfo = null ");
            productType = -1;
        } else {
            this.ax.d(deviceInfoE.getProductType());
            LogUtil.a("UpdateVersionActivity", "Enter showDeviceType() getProductType() productType ", Integer.valueOf(deviceInfoE.getProductType()));
            productType = deviceInfoE.getProductType();
        }
        edn ednVarA = lvi.a(productType);
        if (lvi.n(productType)) {
            String strJ = lvi.j(productType);
            LogUtil.a("UpdateVersionActivity", "is plugin download uuid:", strJ);
            boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strJ);
            LogUtil.a("UpdateVersionActivity", "is plugin download pluginAvaiable:", Boolean.valueOf(zIsResourcesAvailable));
            if (zIsResourcesAvailable) {
                c(strJ);
                return productType;
            }
            ae();
            return productType;
        }
        if (ednVarA.u() != 0) {
            this.n.setImageDrawable(BaseApplication.getContext().getResources().getDrawable(ednVarA.u()));
            this.m.setImageDrawable(BaseApplication.getContext().getResources().getDrawable(ednVarA.u()));
        }
        return productType;
    }

    private void c(String str) {
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(str);
        if (pluginInfoByUuid != null) {
            String strE = eep.e(pluginInfoByUuid, 3, mgg.c(this.ae, "UpdateVersionActivity"));
            LogUtil.a("UpdateVersionActivity", "is plugin download image:", strE);
            if (strE == null) {
                ae();
                return;
            } else {
                this.n.setImageBitmap(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(pluginInfoByUuid, strE));
                this.m.setImageBitmap(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(pluginInfoByUuid, strE));
                return;
            }
        }
        ae();
    }

    private void ae() {
        rcw rcwVar = this.ax;
        if (rcwVar != null) {
            if (lvi.f(rcwVar.b())) {
                this.n.setImageResource(R.mipmap.device_icon_band_default);
                this.m.setImageResource(R.mipmap.device_icon_band_default);
            } else {
                this.n.setImageResource(R.mipmap.device_icon_watch_default);
                this.m.setImageResource(R.mipmap.device_icon_watch_default);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (!this.u) {
            LogUtil.j("UpdateVersionActivity", "onclick device disconnected");
            qpx.e(this.f, R.string.IDS_hw_health_wear_connect_device_disconnect);
            return;
        }
        if (id == R.id.update_button) {
            rdt.c(2);
            bc();
        } else if (id == R.id.new_version_layout) {
            d();
        } else if (id == R.id.current_version_layout) {
            ao();
        } else {
            LogUtil.j("UpdateVersionActivity", "onclick, default");
        }
    }

    private void bc() {
        if (this.ac) {
            LogUtil.a("UpdateVersionActivity", "onclick mIsCurrentDeviceAw70");
            ba();
            return;
        }
        int iN = n();
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "updateDeviceVersion otaStatus is: ", Integer.valueOf(iN));
        if (iN == 0) {
            LogUtil.a("UpdateVersionActivity", "HwOtaConstants.STATUS_INITIAL ");
            ab();
        }
        boolean z = this.ad;
        if (z && iN == 2) {
            z();
            return;
        }
        if (z && iN == 3) {
            LogUtil.a("UpdateVersionActivity", "onCreate, device is background downloading");
            w();
            b(max.c().b(this.ae));
        }
        if (iN == 4 || iN == 5 || iN == 6) {
            LogUtil.a("UpdateVersionActivity", "onclick, device is background transfer or failed");
            ram.c(this.f, false, this.ae);
            finish();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_app_check_new_version_state");
        Context context = this.f;
        if (context == null) {
            ReleaseLogUtil.e("DEVMGR_UpdateVersionActivity", "updateDeviceVersion mContext is null");
        } else {
            BroadcastManagerUtil.c(context, this.f24810a, intentFilter, LocalBroadcast.f36595c, null);
        }
    }

    private void z() {
        LogUtil.a("UpdateVersionActivity", "processDownloadLogic HwOtaConstants.STATUS_PULL_CHANGE_LOG");
        if (nvd.s(BaseApplication.getContext(), this.ae)) {
            ram.e(this, this.t, true);
            return;
        }
        if (this.f24812c) {
            ay();
        } else if (this.z) {
            ram.c(this.f, true, this.ae);
            finish();
        } else {
            b();
        }
    }

    private void ay() {
        String strJ = HwVersionManager.b(BaseApplication.getContext()).j(this.ae);
        mbe mbeVar = new mbe();
        mbeVar.b(this.ae);
        mbeVar.d(strJ);
        mbeVar.c(CommonUtil.i(nvd.e(BaseApplication.getContext(), this.ae, strJ)));
        mbeVar.e(System.currentTimeMillis() / 1000);
        mbeVar.a(1);
        mbeVar.e(0);
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "updateDealSupportDetect sendUpdateMessage");
        mbc.b().d(mbeVar);
        this.ar.setClickable(false);
        this.ar.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize_disable));
        this.ar.setText(R.string.IDS_ota_update_watch);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0038  */
    private void ba() {
        boolean z;
        String strB = mga.b();
        if (TextUtils.isEmpty(strB)) {
            z = false;
        } else {
            long jC = lxm.b().c(strB);
            LogUtil.a("UpdateVersionActivity", "onclick lastSyncTime is ", Long.valueOf(jC));
            if (System.currentTimeMillis() - jC > 600000) {
                LogUtil.a("UpdateVersionActivity", "onclick isNeedSync ");
                z = true;
            } else {
                z = false;
            }
        }
        String strI = nvd.i(this.f, this.ae);
        DeviceCapability deviceCapabilityA = eej.a(this.ae);
        if (deviceCapabilityA != null && deviceCapabilityA.isNeedSyncBeforeOta() && z && !TextUtils.isEmpty(strI)) {
            mbc.b().a(this.ae, new b(this));
        } else {
            at();
        }
    }

    private void ao() {
        this.ad = false;
        this.ab = true;
        this.i.setTitleText(this.f.getString(R.string.IDS_ota_update_now_version));
        this.i.setRightButtonVisibility(8);
        this.ao.setVisibility(8);
        this.k.setVisibility(8);
        this.l.setVisibility(0);
        this.s.setVisibility(8);
        this.ba.setVisibility(0);
        this.ai.setVisibility(8);
        this.j.setVisibility(8);
        this.at.setVisibility(0);
        this.ap.setVisibility(8);
        this.au.setVisibility(8);
        this.av.setVisibility(8);
        ap();
        this.o.setWaitingAnimationEnabled(false);
        this.p.setWaitingAnimationEnabled(false);
    }

    private void ap() {
        if (this.t == null) {
            this.aw.setText(R.string.IDS_settings_one_level_menu_settings_no_content);
        } else {
            ah();
        }
    }

    private void ah() {
        if (LanguageUtil.ba(this.f)) {
            this.az.setGravity(5);
            this.az.setTextDirection(3);
        } else {
            this.az.setGravity(3);
            this.az.setTextDirection(5);
        }
        if (!TextUtils.isEmpty(this.aq) && this.aq.length() > 2) {
            this.az.setText(this.aq);
        } else {
            this.az.setText(this.d);
        }
        String strI = nvd.i(BaseApplication.getContext(), this.t.getSoftVersion(), this.t.getDeviceIdentify());
        String strC = nvd.c(BaseApplication.getContext(), this.t.getSoftVersion(), this.t.getDeviceIdentify());
        if (!TextUtils.isEmpty(strI)) {
            this.au.setVisibility(0);
        }
        e(strI);
        if (TextUtils.isEmpty(strC)) {
            this.aw.setText(R.string.IDS_settings_one_level_menu_settings_no_content);
        } else {
            this.aw.setText(strC);
        }
    }

    static class b implements IBaseResponseCallback {
        WeakReference<UpdateVersionActivity> d;

        b(UpdateVersionActivity updateVersionActivity) {
            this.d = new WeakReference<>(updateVersionActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            UpdateVersionActivity updateVersionActivity = this.d.get();
            if (updateVersionActivity == null) {
                LogUtil.j("UpdateVersionActivity", "fragment is null");
                return;
            }
            String strE = eeq.e((byte[]) obj);
            LogUtil.a("UpdateVersionActivity", "getSwitch berfore onResponse objData = ", strE);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            int iA = strE.length() >= 2 ? lsk.a(strE.substring(strE.length() - 2), 10) : 0;
            LogUtil.a("UpdateVersionActivity", "onResponse errorcode = ", Integer.valueOf(i), ", and value =", Integer.valueOf(iA));
            if (iA == 1) {
                updateVersionActivity.av();
            } else {
                updateVersionActivity.at();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void at() {
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.16
            @Override // java.lang.Runnable
            public void run() {
                if (!UpdateVersionActivity.this.ad && UpdateVersionActivity.this.n() == 0) {
                    ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "HwOtaConstants.STATUS_INITIAL ");
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("action_app_check_new_version_state");
                    BroadcastManagerUtil.c(UpdateVersionActivity.this.f, UpdateVersionActivity.this.f24810a, intentFilter, LocalBroadcast.f36595c, null);
                    UpdateVersionActivity.this.ab();
                }
                if (UpdateVersionActivity.this.ad && UpdateVersionActivity.this.n() == 2) {
                    ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "HwOtaConstants.STATUS_PULL_CHANGE_LOG");
                    UpdateVersionActivity.this.b();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void av() {
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.1
            @Override // java.lang.Runnable
            public void run() {
                if (UpdateVersionActivity.this.f != null) {
                    LogUtil.a("UpdateVersionActivity", "showNeedSyncDialog enter");
                    new CustomAlertDialog.Builder(UpdateVersionActivity.this.f).a(View.inflate(UpdateVersionActivity.this.f, R.layout.dialog_sync_before_ota, null)).d(R.string.IDS_ota_update_goto_home, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.1.5
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            LogUtil.a("UpdateVersionActivity", "start mNeedSyncDialog, user click Positive button! ");
                            Intent intent = new Intent();
                            intent.setPackage(UpdateVersionActivity.this.f.getPackageName());
                            intent.setClassName(UpdateVersionActivity.this.f.getPackageName(), "com.huawei.health.MainActivity");
                            intent.setFlags(67108864);
                            intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME);
                            UpdateVersionActivity.this.startActivity(intent);
                        }
                    }).a(R.string.IDS_app_update_now_ios_btn, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.1.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "start mNeedSyncDialog, user click Negative button!");
                            UpdateVersionActivity.this.at();
                        }
                    }).b().show();
                }
            }
        });
    }

    /* JADX INFO: renamed from: com.huawei.ui.device.activity.update.UpdateVersionActivity$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {
        AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!UpdateVersionActivity.this.f24812c) {
                UpdateVersionActivity.this.h();
            } else {
                mes.b().b(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.3.4
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        int iIntValue = (i == 0 && (obj instanceof Integer)) ? ((Integer) obj).intValue() : -1;
                        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "getLockscreenStatus lockScreenStatus", Integer.valueOf(iIntValue));
                        if (iIntValue != 3) {
                            UpdateVersionActivity.this.h();
                        } else {
                            UpdateVersionActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.3.4.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    UpdateVersionActivity.this.d(UpdateVersionActivity.this.f.getString(R.string.IDS_unlock_your_watch));
                                }
                            });
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        u();
        this.w.postDelayed(new AnonymousClass3(), 2000L);
        HashMap map = new HashMap(20);
        map.put("state", "device");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010032.value(), map, 0);
        max.c().b(this.ae, 25);
    }

    private void u() {
        LogUtil.a("UpdateVersionActivity", "Enter initViewForCheck!");
        this.ad = false;
        this.ab = false;
        Context context = this.f;
        if (context == null) {
            LogUtil.a("UpdateVersionActivity", "mContext is null, initViewForCheck failed");
            return;
        }
        this.i.setTitleText(context.getResources().getString(R.string.IDS_device_wear_home_device_ota_upgrade));
        ag();
        this.ao.setVisibility(8);
        this.k.setVisibility(0);
        this.ba.setVisibility(0);
        this.l.setVisibility(8);
        this.s.setVisibility(8);
        this.j.setVisibility(0);
        if (LanguageUtil.ba(this.f)) {
            this.ah.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.h.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            this.ah.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.h.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        this.j.setClickable(false);
        this.ai.setClickable(false);
        this.at.setVisibility(8);
        this.ap.setVisibility(0);
        y();
    }

    private void y() {
        if (this.t == null) {
            LogUtil.j("UpdateVersionActivity", "onCreate deviceInfo == null");
        }
        HwVersionManager hwVersionManagerB = HwVersionManager.b(BaseApplication.getContext());
        String strJ = hwVersionManagerB.j(this.ae);
        String strC = hwVersionManagerB.c(this.ae);
        if (LanguageUtil.ba(this.f)) {
            this.af.setGravity(5);
            this.g.setGravity(5);
            this.af.setTextDirection(3);
            this.g.setTextDirection(3);
        } else {
            this.af.setGravity(3);
            this.g.setGravity(3);
            this.af.setTextDirection(5);
            this.g.setTextDirection(5);
        }
        if (!TextUtils.isEmpty(strJ) && !strJ.equals(this.d)) {
            this.ai.setVisibility(0);
            if (!TextUtils.isEmpty(strC)) {
                this.af.setText(strC);
            } else {
                this.af.setText(strJ);
            }
        } else {
            this.ai.setVisibility(8);
        }
        LogUtil.a("UpdateVersionActivity", "initViewForCheckView mBandVersion :", this.d, " mDeviceOStVersion ", this.q, " mSplicingProductVersion ", this.aq, " checkNewBandVersion ", strJ, " bandOsNewVersion ", strC);
        if (TextUtils.isEmpty(this.q)) {
            if (!TextUtils.isEmpty(this.aq) && this.aq.length() > 2) {
                this.g.setText(this.aq);
            } else {
                this.g.setText(this.d);
            }
        } else {
            this.g.setText(this.q);
        }
        as();
        this.o.setWaitingAnimationEnabled(true);
        this.p.setWaitingAnimationEnabled(false);
        this.az.setText(R.string.IDS_update_checking);
        this.au.setVisibility(8);
        this.av.setVisibility(8);
        this.ar.setClickable(false);
        this.ar.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize_disable));
        this.ar.setText(R.string.IDS_ota_update_button_check_version);
    }

    private void q() {
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "Enter initViewForCheck!");
        this.ad = false;
        this.ab = false;
        this.i.setTitleText(this.f.getResources().getString(R.string.IDS_device_wear_home_device_ota_upgrade));
        ag();
        this.ao.setVisibility(8);
        this.k.setVisibility(8);
        this.ba.setVisibility(0);
        this.l.setVisibility(0);
        this.s.setVisibility(8);
        this.j.setVisibility(0);
        if (LanguageUtil.ba(this.f)) {
            this.ah.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.h.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            this.ah.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.h.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        this.ai.setClickable(true);
        this.j.setClickable(true);
        this.at.setVisibility(8);
        this.ap.setVisibility(0);
        x();
    }

    private void x() {
        HwVersionManager hwVersionManagerB = HwVersionManager.b(BaseApplication.getContext());
        String strJ = hwVersionManagerB.j(this.ae);
        String strC = hwVersionManagerB.c(this.ae);
        if (LanguageUtil.ba(this.f)) {
            this.af.setGravity(5);
            this.g.setGravity(5);
            this.af.setTextDirection(3);
            this.g.setTextDirection(3);
        } else {
            this.af.setGravity(3);
            this.g.setGravity(3);
            this.af.setTextDirection(5);
            this.g.setTextDirection(5);
        }
        if (!TextUtils.isEmpty(strJ) && !strJ.equals(this.d)) {
            this.ai.setVisibility(0);
            this.az.setText(R.string.IDS_ota_update_state_check_new_version);
            if (!TextUtils.isEmpty(strC)) {
                this.af.setText(strC);
            } else {
                this.af.setText(strJ);
            }
        } else {
            this.az.setText(R.string.IDS_hwh_me_settings_app_update);
            this.ai.setVisibility(8);
        }
        LogUtil.a("UpdateVersionActivity", "initViewCurrentForCheckView mBandVersion :", this.d, " mDeviceOStVersion ", this.q, " mSplicingProductVersion ", this.aq, " checkNewBandVersion ", strJ, " bandOsNewVersion ", strC);
        if (TextUtils.isEmpty(this.q)) {
            if (!TextUtils.isEmpty(this.aq) && this.aq.length() > 2) {
                this.g.setText(this.aq);
            } else {
                this.g.setText(this.d);
            }
        } else {
            this.g.setText(this.q);
        }
        this.o.setWaitingAnimationEnabled(false);
        this.p.setWaitingAnimationEnabled(false);
        this.au.setVisibility(8);
        this.av.setVisibility(8);
        this.ar.setClickable(true);
        this.ar.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize));
        this.ar.setText(R.string.IDS_ota_update_button_check_version);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "Enter initViewForNoVersion! ");
        Context context = this.f;
        if (context == null) {
            ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "initViewForNoVersion mContext is null");
            return;
        }
        this.ad = false;
        this.ab = false;
        this.i.setTitleText(context.getResources().getString(R.string.IDS_device_wear_home_device_ota_upgrade));
        ag();
        this.ao.setVisibility(8);
        this.k.setVisibility(8);
        this.l.setVisibility(0);
        this.ba.setVisibility(0);
        this.s.setVisibility(8);
        this.ai.setVisibility(8);
        this.j.setVisibility(0);
        if (LanguageUtil.ba(this.f)) {
            this.ah.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.h.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            this.ah.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.h.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        this.j.setClickable(true);
        this.at.setVisibility(8);
        this.ap.setVisibility(0);
        this.au.setVisibility(8);
        this.av.setVisibility(8);
        this.ar.setClickable(true);
        this.ar.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.button_background_emphasize));
        this.ar.setText(R.string.IDS_ota_update_button_check_version);
        this.az.setText(R.string.IDS_hwh_me_settings_app_update);
        this.o.setWaitingAnimationEnabled(false);
        this.p.setWaitingAnimationEnabled(false);
        maq.b().e(this.ae, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "Enter showCheckFailedLayout!");
        this.ad = false;
        this.ab = false;
        this.ao.setVisibility(0);
        this.k.setVisibility(8);
        this.l.setVisibility(0);
        this.s.setVisibility(8);
        this.ba.setVisibility(0);
        this.ai.setVisibility(8);
        this.au.setVisibility(8);
        this.j.setVisibility(0);
        if (LanguageUtil.ba(this.f)) {
            this.ah.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.h.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            this.ah.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.h.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        this.j.setClickable(true);
        this.at.setVisibility(8);
        this.ap.setVisibility(0);
        this.ar.setClickable(true);
        this.ar.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize));
        this.az.setText(R.string.IDS_ota_check_version_failed_title);
        this.ar.setText(R.string.IDS_ota_update_button_check_version);
        this.as.setText(str);
        this.o.setWaitingAnimationEnabled(false);
        this.p.setWaitingAnimationEnabled(false);
        maq.b().e(this.ae, 0);
    }

    private void aq() {
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "Enter showDetectionNewVersion");
        this.ad = false;
        this.ab = false;
        maq.b().e(this.ae, 0);
        this.i.setTitleText(this.f.getResources().getString(R.string.IDS_device_wear_home_device_ota_upgrade));
        ag();
        this.ao.setVisibility(8);
        this.k.setVisibility(8);
        this.l.setVisibility(0);
        this.s.setVisibility(8);
        this.ba.setVisibility(0);
        this.ai.setVisibility(0);
        this.j.setVisibility(0);
        if (LanguageUtil.ba(this.f)) {
            this.ah.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.h.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            this.ah.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.h.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        this.ai.setClickable(true);
        this.j.setClickable(true);
        this.at.setVisibility(8);
        this.ap.setVisibility(0);
        this.au.setVisibility(8);
        this.av.setVisibility(8);
        this.az.setText(R.string.IDS_ota_update_state_check_new_version);
        this.ar.setClickable(true);
        this.ar.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize));
        this.ar.setText(R.string.IDS_ota_update_button_check_version);
        af();
        this.o.setWaitingAnimationEnabled(false);
        this.p.setWaitingAnimationEnabled(false);
    }

    private void af() {
        if (LanguageUtil.ba(this.f)) {
            this.af.setGravity(5);
            this.g.setGravity(5);
            this.af.setTextDirection(3);
            this.g.setTextDirection(3);
        } else {
            this.af.setGravity(3);
            this.g.setGravity(3);
            this.af.setTextDirection(5);
            this.g.setTextDirection(5);
        }
        HwVersionManager hwVersionManagerB = HwVersionManager.b(BaseApplication.getContext());
        String strN = nvd.n(BaseApplication.getContext(), this.ae);
        if (!TextUtils.isEmpty(strN)) {
            this.af.setText(strN);
        } else {
            this.af.setText(hwVersionManagerB.j(this.ae));
        }
        if (TextUtils.isEmpty(this.q)) {
            if (!TextUtils.isEmpty(this.aq) && this.aq.length() > 2) {
                this.g.setText(this.aq);
                return;
            } else {
                this.g.setText(this.d);
                return;
            }
        }
        this.g.setText(this.q);
    }

    public void d() {
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "Enter showAppNewVersion");
        if (this.f == null) {
            ReleaseLogUtil.e("DEVMGR_UpdateVersionActivity", "showAppNewVersion mContext == null");
            return;
        }
        if (nvd.s(BaseApplication.getContext(), this.ae)) {
            ram.e(this, this.t, false);
        }
        this.ad = true;
        this.ab = false;
        maq.b().e(this.ae, 2);
        this.i.setTitleText(this.f.getString(R.string.IDS_ota_update_new_version));
        this.i.setRightButtonVisibility(8);
        this.ao.setVisibility(8);
        this.k.setVisibility(8);
        this.l.setVisibility(0);
        this.s.setVisibility(8);
        this.ba.setVisibility(0);
        this.ai.setVisibility(8);
        this.j.setVisibility(8);
        this.at.setVisibility(0);
        this.ap.setVisibility(0);
        this.au.setVisibility(8);
        this.av.setVisibility(8);
        this.ar.setClickable(true);
        this.ar.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize));
        if (this.f24812c) {
            this.ar.setText(R.string.IDS_ota_watch_install);
        } else {
            this.ar.setText(R.string.IDS_update_and_download);
        }
        am();
    }

    private void am() {
        HwVersionManager hwVersionManagerB = HwVersionManager.b(BaseApplication.getContext());
        if (LanguageUtil.ba(this.f)) {
            this.az.setGravity(5);
            this.az.setTextDirection(3);
        } else {
            this.az.setGravity(3);
            this.az.setTextDirection(5);
        }
        this.az.setText(hwVersionManagerB.j(this.ae));
        if (this.t == null) {
            this.aw.setText(R.string.IDS_settings_one_level_menu_settings_no_content);
        } else {
            String strI = nvd.i(BaseApplication.getContext(), hwVersionManagerB.j(this.ae), this.t.getDeviceIdentify());
            if (this.f24812c) {
                strI = nvd.d(BaseApplication.getContext(), hwVersionManagerB.j(this.ae), this.ae);
            }
            if (!TextUtils.isEmpty(strI)) {
                this.au.setVisibility(0);
            }
            e(strI);
            String strC = nvd.c(BaseApplication.getContext(), hwVersionManagerB.j(this.ae), this.t.getDeviceIdentify());
            if (this.f24812c) {
                strC = nvd.b(BaseApplication.getContext(), hwVersionManagerB.j(this.ae), this.ae);
            }
            if (TextUtils.isEmpty(strC)) {
                this.aw.setText(R.string.IDS_settings_one_level_menu_settings_no_content);
            } else {
                this.aw.setText(strC);
            }
        }
        this.o.setWaitingAnimationEnabled(false);
        this.p.setWaitingAnimationEnabled(false);
    }

    private void e(String str) {
        Context context = this.f;
        if (context == null) {
            ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "setDeviceSizeText mContext is null");
            return;
        }
        if (LanguageUtil.z(context)) {
            str = com.huawei.openalliance.ad.constant.Constants.LRM_STR + str;
        }
        this.au.setText(this.f.getString(R.string.IDS_bundle_size, str));
    }

    private void w() {
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "Enter initViewForDownload!");
        this.ad = false;
        this.ab = false;
        this.ao.setVisibility(8);
        this.k.setVisibility(8);
        this.l.setVisibility(8);
        this.s.setVisibility(0);
        this.v.setVisibility(8);
        this.am.setVisibility(0);
        this.ba.setVisibility(0);
        this.ai.setVisibility(8);
        this.j.setVisibility(8);
        this.at.setVisibility(0);
        this.av.setVisibility(0);
        this.au.setVisibility(8);
        this.ap.setVisibility(8);
        this.o.setWaitingAnimationEnabled(false);
        this.p.setWaitingAnimationEnabled(false);
        b(0);
        this.av.setText(R.string.IDS_update_downloading);
        HwVersionManager hwVersionManagerB = HwVersionManager.b(BaseApplication.getContext());
        this.az.setText(hwVersionManagerB.j(this.ae));
        if (this.t == null) {
            this.aw.setText(R.string.IDS_settings_one_level_menu_settings_no_content);
        } else {
            String strI = nvd.i(BaseApplication.getContext(), hwVersionManagerB.j(this.ae), this.t.getDeviceIdentify());
            if (!TextUtils.isEmpty(strI)) {
                this.au.setVisibility(0);
            }
            String strC = nvd.c(BaseApplication.getContext(), hwVersionManagerB.j(this.ae), this.t.getDeviceIdentify());
            e(strI);
            if (TextUtils.isEmpty(strC)) {
                this.aw.setText(R.string.IDS_settings_one_level_menu_settings_no_content);
            } else {
                this.aw.setText(strC);
            }
        }
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "initViewForDownload() mUpdateStatus :", Integer.valueOf(n()));
    }

    private void b(int i) {
        if (this.aj == i) {
            return;
        }
        this.aj = i;
        this.ag.setText(UnitUtil.e(i, 1, 0));
        this.p.setProgress(i);
    }

    private void al() {
        this.av.setText(R.string.IDS_bundle_downloaded_prompt);
        b(100);
        this.ar.setClickable(false);
        this.ar.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize_disable));
    }

    private void b(String str) {
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "showErrorMsg(): tipText = ", str);
        this.ad = true;
        this.ab = false;
        this.ao.setVisibility(0);
        this.k.setVisibility(8);
        this.l.setVisibility(8);
        this.s.setVisibility(0);
        this.am.setVisibility(8);
        this.v.setVisibility(0);
        this.o.setWaitingAnimationEnabled(false);
        this.p.setWaitingAnimationEnabled(false);
        this.p.setProgress(0);
        this.az.setVisibility(0);
        this.au.setVisibility(0);
        this.av.setVisibility(0);
        this.ap.setVisibility(0);
        this.ar.setClickable(true);
        this.ar.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize));
        this.ar.setText(this.f.getText(R.string.IDS_retry));
        this.as.setText(str);
        this.av.setText(R.string.IDS_update_download_failed);
        if (LanguageUtil.ba(this.f)) {
            this.az.setGravity(5);
            this.az.setTextDirection(3);
        } else {
            this.az.setGravity(3);
            this.az.setTextDirection(5);
        }
        this.az.setText(HwVersionManager.b(this.f).j(this.ae));
        Context context = this.f;
        e(nvd.i(context, nvd.i(context, this.ae), this.ae));
        maq.b().e(this.ae, 2);
        this.ax.c(this.ae);
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "showErrorMsg() mUpdateStatus :", Integer.valueOf(n()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "showErrorMsg(): tipText = ", str);
        this.ax.c(this.ae);
        this.ad = false;
        this.ab = false;
        this.ao.setVisibility(0);
        this.k.setVisibility(8);
        this.l.setVisibility(0);
        this.s.setVisibility(8);
        this.ba.setVisibility(8);
        this.ai.setVisibility(8);
        this.at.setVisibility(8);
        this.j.setVisibility(0);
        if (LanguageUtil.ba(this.f)) {
            this.af.setGravity(5);
            this.g.setGravity(5);
            this.af.setTextDirection(3);
            this.g.setTextDirection(3);
            this.ah.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.h.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            this.ah.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.h.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.af.setTextDirection(5);
            this.g.setTextDirection(5);
            this.af.setGravity(3);
            this.g.setGravity(3);
        }
        this.j.setClickable(true);
        this.ap.setVisibility(0);
        this.o.setWaitingAnimationEnabled(false);
        this.p.setWaitingAnimationEnabled(false);
        b(0);
        this.ar.setClickable(true);
        this.ar.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize));
        this.ar.setText(this.f.getText(R.string.IDS_ota_update_button_check_version));
        this.as.setText(str);
        if (!TextUtils.isEmpty(this.aq) && this.aq.length() > 2) {
            this.g.setText(this.aq);
        } else {
            this.g.setText(this.d);
        }
        maq.b().e(this.ae, 0);
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "showErrorMsg() mUpdateStatus :", Integer.valueOf(n()));
        au();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "doCheckAppNewVersion: mUpdateInteractors.mUpdateStatus = ", n() + "mIsConnected:", Boolean.valueOf(this.u));
        if (n() == 0) {
            maq.b().e(this.ae, 1);
        }
        if (this.u) {
            this.ax.a(this.ae);
        } else {
            d(this.f.getString(R.string.IDS_music_management_disconnection));
        }
    }

    public void b() {
        boolean zE = maq.b().e(nvd.h(BaseApplication.getContext(), nvd.i(this.f, this.ae), this.ae));
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "handleAppNewVersionOk: checkMemory = ", Boolean.valueOf(zE));
        if (!zE) {
            b(this.f.getString(R.string.IDS_update_low_memory));
            return;
        }
        boolean zJ = mio.j();
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "handleAppNewVersionOk: wifiConnected = ", Boolean.valueOf(zJ), " CommonUtil.isHuaweiSystem() ", Boolean.valueOf(CommonUtil.bg()));
        if (CommonUtil.bg()) {
            b(zJ);
        } else if (!zJ) {
            a();
        } else {
            g();
        }
    }

    private void b(boolean z) {
        if (!z) {
            a();
            return;
        }
        int iD = mio.d();
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "checkIsEmuiWifiType: wifiType = ", Integer.valueOf(iD));
        if (iD == 2) {
            an();
        } else {
            g();
        }
    }

    private void a() {
        if (rcw.b(BaseApplication.getContext()).a()) {
            aj();
        } else {
            g();
        }
    }

    private void aj() {
        if (this.f == null || this.ay != null) {
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f).a(R.string.IDS_service_area_notice_title).b(R.string.IDS_ota_update_is_roaming).a(R.string.IDS_update_new_version_ok, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("UpdateVersionActivity", "start wifiDialog, user click Negative button!");
                UpdateVersionActivity.this.ay.dismiss();
                UpdateVersionActivity.this.ay = null;
                UpdateVersionActivity.this.g();
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("UpdateVersionActivity", "start wifiDialog, user click Positive button!");
                UpdateVersionActivity.this.ay.dismiss();
                UpdateVersionActivity.this.ay = null;
            }
        }).b();
        this.ay = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.ay.show();
    }

    private void an() {
        if (this.f == null || this.an != null) {
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f).a(R.string.IDS_service_area_notice_title).b(R.string.IDS_ota_update_new_is_roaming).a(R.string.IDS_update_new_version_ok, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("UpdateVersionActivity", "showAppPersonalHotspotNetDialog, user click Negative button!");
                UpdateVersionActivity.this.an.dismiss();
                UpdateVersionActivity.this.an = null;
                UpdateVersionActivity.this.g();
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("UpdateVersionActivity", "showAppPersonalHotspotNetDialog, user click Positive button!");
                UpdateVersionActivity.this.an.dismiss();
                UpdateVersionActivity.this.an = null;
            }
        }).b();
        this.an = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.an.show();
    }

    private void ar() {
        if (this.f == null || this.x != null) {
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f).a(R.string.IDS_service_area_notice_title).b(R.string.IDS_settings_firmware_upgrade_ensure_exit).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("UpdateVersionActivity", "start showExitUpdateDialog, user click Negative button! ");
                UpdateVersionActivity.this.l();
                UpdateVersionActivity.this.x.dismiss();
                UpdateVersionActivity.this.x = null;
                UpdateVersionActivity.this.finish();
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("UpdateVersionActivity", "showExitUpdateDialog ok click");
                UpdateVersionActivity.this.x.dismiss();
                UpdateVersionActivity.this.x = null;
            }
        }).b();
        this.x = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.x.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (n() == 3) {
            this.ax.c(this.ae);
            maq.b().e(this.ae, 0);
            ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "wear device,cancle downloading file!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "doDownloadAppFile: mUpdateInteractors.mUpdateStatus = ", Integer.valueOf(n()));
        w();
        if (n() == 3) {
            ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "doDownloadAppFile, device is background downloading");
            w();
            b(max.c().b(this.ae));
        } else if (n() == 4 || n() == 5) {
            ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "doDownloadAppFile, device is background transfer or failed");
            ram.c(this.f, false, this.ae);
            finish();
        } else {
            this.ax.c(this.ae);
            this.ax.e(this.ae);
            maq.b().b(true);
            nvd.d(this.t, "1", "m1");
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_app_check_new_version_state");
        Context context = this.f;
        if (context == null) {
            ReleaseLogUtil.e("DEVMGR_UpdateVersionActivity", "doDownloadAppFile mContext is null");
        } else {
            BroadcastManagerUtil.c(context, this.f24810a, intentFilter, LocalBroadcast.f36595c, null);
        }
    }

    private void ai() {
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastReceiver broadcastReceiver = this.f24811b;
        this.e = broadcastReceiver;
        Context context = this.f;
        if (context == null) {
            ReleaseLogUtil.e("DEVMGR_UpdateVersionActivity", "registerConnectStateBroadcast mContext is null");
        } else {
            BroadcastManagerUtil.c(context, broadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
        }
    }

    private void ax() {
        Context context;
        if (this.e == null || (context = this.f) == null) {
            ReleaseLogUtil.e("DEVMGR_UpdateVersionActivity", "mConnectChangedReceiver is :", this.f24811b, "mContext is:", this.f);
            return;
        }
        try {
            context.unregisterReceiver(this.f24811b);
        } catch (IllegalArgumentException e2) {
            LogUtil.a("UpdateVersionActivity", e2.getMessage());
        }
    }

    private void au() {
        BroadcastReceiver broadcastReceiver = this.f24810a;
        if (broadcastReceiver == null) {
            return;
        }
        try {
            this.f.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e2) {
            LogUtil.a("UpdateVersionActivity", e2.getMessage());
        }
    }

    private void b(int i, int i2) {
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "enter sendOtaEvent errorMsg=", Integer.valueOf(i2));
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        DeviceInfo deviceInfo = this.t;
        if (deviceInfo == null) {
            LogUtil.a("UpdateVersionActivity", "enter sendOtaEvent device is null.");
            return;
        }
        int productType = deviceInfo.getProductType();
        LogUtil.a("UpdateVersionActivity", "sendOtaEvent deviceType=", Integer.valueOf(productType));
        if (productType != -1) {
            linkedHashMap.put(DeviceCategoryFragment.DEVICE_TYPE, String.valueOf(productType));
            linkedHashMap.put("device_classfication", String.valueOf(eev.d(productType)));
        }
        if (i == 23) {
            linkedHashMap.put("operationID", "5");
        } else {
            linkedHashMap.put("operationID", "6");
            if (i2 == 3) {
                linkedHashMap.put("errorID", "102");
            } else if (i2 != 4) {
                linkedHashMap.put("errorID", "103");
            } else {
                linkedHashMap.put("errorID", "101");
            }
        }
        rcw rcwVar = this.ax;
        if (rcwVar != null) {
            linkedHashMap.put("deviceNewVersion", rcwVar.b(this.ae));
            linkedHashMap.put("versionID", HwVersionManager.b(this.f).h(this.ae));
        } else {
            LogUtil.a("UpdateVersionActivity", "sendOtaEvent UpdateInteractors is null.");
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_DEVICE_OTA_UPDATE_80020004.value(), linkedHashMap);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("UpdateVersionActivity", "onActivityResult resultCode:", Integer.valueOf(i2), " requestCode:", Integer.valueOf(i));
        if (i == 101) {
            if (i2 == 1000) {
                this.y = true;
            } else if (i2 == 2000) {
                this.y = false;
            } else {
                LogUtil.j("UpdateVersionActivity", "onActivityResult error");
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    private void k() {
        if (this.ac || !e(this.r) || !this.aa) {
            LogUtil.a("UpdateVersionActivity", "handleBack, AW70 or notSupportWlan mIsCurrentDeviceAw70：", Boolean.valueOf(this.ac), "isSupportWlan :", Boolean.valueOf(e(this.r)), "mIsSupportBackground :", Boolean.valueOf(this.aa));
            ar();
            return;
        }
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "handleBack, wear device isSupportAuto:", Boolean.valueOf(aa()), " mIsAutoUpdateEnable :", Boolean.valueOf(this.y), "not remind : ", Boolean.valueOf(nvd.c(BaseApplication.getContext())));
        if (aa() && !this.y && !nvd.c(BaseApplication.getContext())) {
            ak();
        } else {
            aw();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aw() {
        ReleaseLogUtil.d("DEVMGR_UpdateVersionActivity", "startBackgroundUpdate enter");
        maq.b().h(this.ae);
        au();
        finish();
    }

    private void ak() {
        LogUtil.a("UpdateVersionActivity", "showAutoUpdateDialog enter");
        View viewInflate = View.inflate(this.f, R.layout.dialog_device_auto_tip, null);
        final HealthCheckBox healthCheckBox = (HealthCheckBox) qsp.a(viewInflate, R.id.device_auto_layout_checkbox);
        healthCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.9
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LogUtil.a("UpdateVersionActivity", "showAutoUpdateDialog onCheckedChanged:", Boolean.valueOf(z));
            }
        });
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.f).d(R.string.IDS_watchface_note).a(viewInflate).a(R.string.IDS_open_later, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.15
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("UpdateVersionActivity", "showAutoUpdateDialog, user click Negative button!");
                UpdateVersionActivity.this.aw();
                nvd.c(BaseApplication.getContext(), healthCheckBox.isChecked());
                mhs.a().setSwitchSetting("auto_update_status", "false", UpdateVersionActivity.this.al, null);
                rcw.b(BaseApplication.getContext()).a(UpdateVersionActivity.this.ae, false);
                HashMap map = new HashMap(16);
                map.put("click", 1);
                map.put("type", "1");
                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090037.value(), map, 0);
            }
        }).d(R.string.IDS_common_enable_button, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.update.UpdateVersionActivity.13
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("UpdateVersionActivity", "showAutoUpdateDialog, user click Positive button!");
                UpdateVersionActivity.this.aw();
                nvd.c(BaseApplication.getContext(), healthCheckBox.isChecked());
                mhs.a().setSwitchSetting("auto_update_status", "true", UpdateVersionActivity.this.al, null);
                rcw.b(BaseApplication.getContext()).a(UpdateVersionActivity.this.ae, true);
            }
        }).b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i) {
        edn ednVarA = lvi.a(i);
        if (ednVarA.w() == 1) {
            return true;
        }
        if (ednVarA.w() == 2) {
            return false;
        }
        if (!eel.d(i) && 12 != i) {
            return true;
        }
        LogUtil.j("UpdateVersionActivity", "not support wlan");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean aa() {
        DeviceCapability deviceCapabilityA = eej.a(this.ae);
        return deviceCapabilityA != null && deviceCapabilityA.getIsSupportAutoUpdate();
    }

    private void e(DeviceInfo deviceInfo) {
        String strC = nvd.c(deviceInfo.getSecurityDeviceId(), BaseApplication.getContext());
        if (TextUtils.isEmpty(strC) || !strC.equals(deviceInfo.getDeviceOtaPackageName())) {
            nvd.k(deviceInfo.getSecurityDeviceId(), deviceInfo.getDeviceOtaPackageName(), this.f);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
