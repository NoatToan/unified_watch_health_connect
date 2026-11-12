package com.huawei.ui.device.activity.update;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IOTAResultAIDLCallback;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressindicator.HealthProgressIndicator;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import defpackage.edj;
import defpackage.eej;
import defpackage.eev;
import defpackage.eey;
import defpackage.lxb;
import defpackage.maq;
import defpackage.max;
import defpackage.maz;
import defpackage.mbc;
import defpackage.mgg;
import defpackage.mhs;
import defpackage.nvd;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.ram;
import defpackage.rcr;
import defpackage.rcw;
import defpackage.xjt;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.text.DecimalFormatSymbols;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceOtaActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f24786a = 50;
    private HealthTextView aa;
    private RelativeLayout ab;
    private HealthButton ac;
    private HealthTextView ad;
    private HealthTextView ae;
    private HealthTextView af;
    private HealthTextView ah;
    private c ai;
    private CustomTextAlertDialog e;
    private ImageView f;
    private long g;
    private HealthProgressIndicator h;
    private DeviceInfo i;
    private LayoutInflater j;
    private String m;
    private rcw q;
    private HealthTextView r;
    private LinearLayout u;
    private long x;
    private HealthTextView y;
    private LinearLayout z;
    private int v = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24787b = null;
    private int p = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f24788c = null;
    private boolean k = true;
    private boolean o = false;
    private int t = 0;
    private CustomAlertDialog l = null;
    private boolean n = false;
    private String w = "";
    private final BroadcastReceiver d = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.update.DeviceOtaActivity.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Parcelable parcelableExtra;
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "mConnectStateChangedReceiver(): mUpgradeHandler = ", DeviceOtaActivity.this.ai, ",intent = ", intent.getAction());
            if (context == null || DeviceOtaActivity.this.ai == null || !"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || (parcelableExtra = intent.getParcelableExtra("deviceinfo")) == null) {
                return;
            }
            if (!(parcelableExtra instanceof DeviceInfo)) {
                LogUtil.a("DeviceOtaActivity", "! parcelableExtra instanceof DeviceInfo ");
                return;
            }
            DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
            if (!TextUtils.equals(deviceInfo.getDeviceIdentify(), DeviceOtaActivity.this.m)) {
                LogUtil.j("DeviceOtaActivity", "!TextUtils.equals(deviceIdentify, mMacAddress)");
                return;
            }
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "mConnectStateChangedReceiver(): state = ", Integer.valueOf(deviceConnectState), ",deviceInfo = ", CommonUtil.n(deviceInfo.toString()));
            DeviceOtaActivity.this.e(deviceConnectState);
        }
    };
    private IOTAResultAIDLCallback.Stub s = new IOTAResultAIDLCallback.Stub() { // from class: com.huawei.ui.device.activity.update.DeviceOtaActivity.1
        @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
        public void onFileTransferState(int i) {
            if (DeviceOtaActivity.this.ai != null) {
                Message messageObtainMessage = DeviceOtaActivity.this.ai.obtainMessage();
                if (DeviceOtaActivity.this.q != null) {
                    messageObtainMessage.what = 4;
                    messageObtainMessage.arg1 = i;
                    DeviceOtaActivity.this.ai.sendMessage(messageObtainMessage);
                }
            }
        }

        @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
        public void onUpgradeFailed(int i, String str) {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "onUpgradeFailed: onUpgradeFailed = ", Integer.valueOf(i), " errorMessage = ", str, " mRequestCount ", Integer.valueOf(DeviceOtaActivity.this.v));
            if (i == 109020) {
                maq.b().b(DeviceOtaActivity.this.m, DeviceOtaActivity.this.s);
                ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "handleMessage registerBackgroundCallBack");
                DeviceOtaActivity.this.t = 0;
                return;
            }
            if (i == 109019) {
                maq.b().e(DeviceOtaActivity.this.m, 6);
                maq.b().d(DeviceOtaActivity.this.s);
                ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "handleMessage registerOTACallBack");
                DeviceOtaActivity.this.t = 0;
                return;
            }
            LogUtil.a("DeviceOtaActivity", "onUpgradeFailed default");
            if (i != 1 || DeviceOtaActivity.this.t != 1) {
                if (DeviceOtaActivity.this.ai != null) {
                    Message messageObtainMessage = DeviceOtaActivity.this.ai.obtainMessage();
                    messageObtainMessage.what = 6;
                    messageObtainMessage.arg1 = i;
                    if (DeviceOtaActivity.this.n) {
                        messageObtainMessage.arg2 = 1;
                        DeviceOtaActivity.this.n = false;
                    } else {
                        messageObtainMessage.arg2 = 0;
                    }
                    if (i == 109002 && !TextUtils.isEmpty(str)) {
                        try {
                            int unused = DeviceOtaActivity.f24786a = Integer.parseInt(str);
                        } catch (NumberFormatException unused2) {
                            LogUtil.e("DeviceOtaActivity", "NumberFormatException");
                            xjt.ap("NumberFormatException");
                        }
                        ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "battery low value ：", Integer.valueOf(DeviceOtaActivity.f24786a));
                    }
                    DeviceOtaActivity.this.ai.sendMessage(messageObtainMessage);
                } else {
                    LogUtil.j("DeviceOtaActivity", "onUpgradeFailed default.");
                }
            } else {
                ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "device has already failed");
            }
            DeviceOtaActivity.this.e(6, i);
            DeviceOtaActivity.this.m();
        }

        @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
        public void onFileRespond(int i) {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "onFileRespond: checkResult = ", Integer.valueOf(i));
            if (DeviceOtaActivity.this.ai != null) {
                c cVar = DeviceOtaActivity.this.ai;
                if (i != 0) {
                    DeviceOtaActivity.this.u();
                    Message messageObtainMessage = cVar.obtainMessage();
                    messageObtainMessage.what = 5;
                    cVar.sendMessage(messageObtainMessage);
                    DeviceOtaActivity.this.g = System.currentTimeMillis();
                    DeviceOtaActivity.this.e(5, i);
                } else {
                    LogUtil.a("DeviceOtaActivity", "onFileRespond DeviceUpgradeCallback");
                    Message messageObtainMessage2 = cVar.obtainMessage();
                    messageObtainMessage2.what = 6;
                    messageObtainMessage2.arg1 = 1002;
                    cVar.sendMessage(messageObtainMessage2);
                    DeviceOtaActivity.this.e(6, 1002);
                }
                DeviceOtaActivity.this.m();
            }
        }

        @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
        public void onFileTransferReport(String str) {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "mOtaResultAidlCallback，transferWay: ", str);
            try {
                String strOptString = new JSONObject(str).optString("transferWay");
                if (TextUtils.isEmpty(strOptString) || strOptString.equals(DeviceOtaActivity.this.w)) {
                    return;
                }
                DeviceOtaActivity.this.w = strOptString;
                if (DeviceOtaActivity.this.ai != null) {
                    DeviceOtaActivity.this.ai.sendEmptyMessage(9);
                }
            } catch (JSONException e) {
                LogUtil.e("DeviceOtaActivity", "onFileTransferReport JSONException e:", ExceptionUtils.c(e));
                xjt.ap("onFileTransferReport JSONException");
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        SharedPreferenceManager.d(BaseApplication.getContext(), System.currentTimeMillis(), "EXCE_OTA_APP_UPG_TRANS_STOP_TIME");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "handleConnectChange state is,", Integer.valueOf(i));
        if (i == 2) {
            LogUtil.a("DeviceOtaActivity", "device connected");
            this.k = true;
            return;
        }
        if (i == 3) {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "mConnectStateChangedReceiver V2 mUpdateStatus = ", Integer.valueOf(g()));
            if (g() != 12) {
                d(this.f24787b.getString(R.string.IDS_music_management_disconnection));
                maq.b().e(this.m, 7);
                maq.b().h();
                maq.b().g();
            }
            this.k = false;
            return;
        }
        if (i != 4) {
            LogUtil.a("DeviceOtaActivity", "handleConnectChange default");
        } else if (g() != 12) {
            d(this.f24787b.getString(R.string.IDS_device_switch_device_connect_fail));
            maq.b().e(this.m, 7);
            maq.b().h();
            maq.b().g();
        }
    }

    private int g() {
        return maq.b().c(this.m);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f24787b = this;
        if (getSystemService("layout_inflater") instanceof LayoutInflater) {
            this.j = (LayoutInflater) getSystemService("layout_inflater");
        }
        ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "onCreate()");
        this.q = rcw.b(this.f24787b);
        if (getIntent() != null) {
            boolean booleanExtra = getIntent().getBooleanExtra("is_package_already_exists", false);
            this.o = booleanExtra;
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "onCreate mIsPackageAlreadyExists = ", Boolean.valueOf(booleanExtra));
            this.m = getIntent().getStringExtra("device_id");
        }
        this.ai = new c(this);
        setContentView(R.layout.activity_device_ota_new);
        boolean zIsEmpty = TextUtils.isEmpty(this.m);
        ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "onCreate isEmpty = ", Boolean.valueOf(zIsEmpty));
        if (zIsEmpty) {
            finish();
            return;
        }
        this.i = maq.b().e(this.m);
        h();
        n();
        v();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "onNewIntent enter");
        v();
    }

    private void h() {
        ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "Enter initView!");
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this, R.id.update_error_layout);
        this.ab = relativeLayout;
        relativeLayout.setVisibility(0);
        this.aa = (HealthTextView) qsp.a(this, R.id.update_error_text);
        HealthProgressIndicator healthProgressIndicator = (HealthProgressIndicator) qsp.a(this, R.id.download_ota_animation);
        this.h = healthProgressIndicator;
        healthProgressIndicator.setWaitingAnimationEnabled(false);
        this.h.setProgress(0);
        this.r = (HealthTextView) qsp.a(this, R.id.text_percent);
        this.y = (HealthTextView) qsp.a(this, R.id.text_per_sign);
        ImageView imageView = (ImageView) qsp.a(this, R.id.image_check_logo);
        this.f = imageView;
        imageView.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) qsp.a(this, R.id.progress_circle_download);
        this.u = linearLayout;
        linearLayout.setVisibility(0);
        if (LanguageUtil.z(this.f24787b)) {
            this.u.setLayoutDirection(0);
        }
        this.y.setText(String.valueOf(new DecimalFormatSymbols(Locale.getDefault()).getPercent()));
        this.ae = (HealthTextView) qsp.a(this, R.id.version_text);
        this.ah = (HealthTextView) qsp.a(this, R.id.version_download);
        this.af = (HealthTextView) qsp.a(this, R.id.version_size_text);
        this.ad = (HealthTextView) qsp.a(this, R.id.update_log_content);
        this.z = (LinearLayout) qsp.a(this, R.id.update_button_layout);
        HealthButton healthButton = (HealthButton) qsp.a(this, R.id.update_button);
        this.ac = healthButton;
        healthButton.setOnClickListener(this);
        ((CustomTitleBar) qsp.a(this, R.id.update_title)).setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.DeviceOtaActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DeviceOtaActivity.this.onBackPressed();
            }
        });
        f();
    }

    private void f() {
        HwVersionManager hwVersionManagerB = HwVersionManager.b(BaseApplication.getContext());
        this.ae.setText(hwVersionManagerB.j(this.m));
        DeviceInfo deviceInfoE = maq.b().e(this.m);
        if (deviceInfoE == null) {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "initView deviceInfo is null");
            this.ad.setText(R.string.IDS_settings_one_level_menu_settings_no_content);
        } else {
            t();
            String strI = nvd.i(BaseApplication.getContext(), hwVersionManagerB.j(this.m), deviceInfoE.getDeviceIdentify());
            if (!TextUtils.isEmpty(strI)) {
                this.af.setVisibility(0);
            }
            String strC = nvd.c(BaseApplication.getContext(), hwVersionManagerB.j(this.m), deviceInfoE.getDeviceIdentify());
            if (LanguageUtil.z(this.f24787b)) {
                strI = Constants.LRM_STR + strI;
            }
            this.af.setText(this.f24787b.getString(R.string.IDS_bundle_size, strI));
            if (TextUtils.isEmpty(strC)) {
                this.ad.setText(R.string.IDS_settings_one_level_menu_settings_no_content);
            } else {
                this.ad.setText(strC);
            }
        }
        q();
        rcr.a(this.ac, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        String str;
        DeviceInfo deviceInfoE = maq.b().e(this.m);
        if (deviceInfoE == null) {
            LogUtil.j("DeviceOtaActivity", "setTransferTips deviceInfo is null");
            return;
        }
        String str2 = String.format(Locale.ENGLISH, this.f24787b.getString(R.string.IDS_update_phone_transmission), deviceInfoE.getDeviceName());
        if (qrs.ah(BaseApplication.getContext())) {
            str2 = String.format(Locale.ENGLISH, this.f24787b.getString(R.string.IDS_update_pad_transmission), deviceInfoE.getDeviceName());
        }
        if ("wifi".equals(this.w)) {
            boolean zO = Utils.o();
            if (zO) {
                str = String.format(Locale.ENGLISH, this.f24787b.getString(R.string.IDS_update_phone_transmission_wifi), deviceInfoE.getDeviceName());
            } else {
                str = String.format(Locale.ENGLISH, this.f24787b.getString(R.string.IDS_update_phone_transmission_wlan), deviceInfoE.getDeviceName());
            }
            if (!qrs.ah(BaseApplication.getContext())) {
                str2 = str;
            } else if (zO) {
                str2 = String.format(Locale.ENGLISH, this.f24787b.getString(R.string.IDS_update_pad_transmission_wifi), deviceInfoE.getDeviceName());
            } else {
                str2 = String.format(Locale.ENGLISH, this.f24787b.getString(R.string.IDS_update_pad_transmission_wlan), deviceInfoE.getDeviceName());
            }
        }
        this.aa.setText(str2);
        LogUtil.a("DeviceOtaActivity", "setTransferTips end");
    }

    private void q() {
        this.ab.setVisibility(0);
        this.z.setVisibility(8);
        this.ah.setText(R.string.IDS_ota_update_state_upgrading_new);
        a(0);
    }

    static class c extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<DeviceOtaActivity> f24799c;

        c(DeviceOtaActivity deviceOtaActivity) {
            this.f24799c = new WeakReference<>(deviceOtaActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null) {
                ReleaseLogUtil.e("DEVMGR_DeviceOtaActivity", "UpgradeHandler message is null");
                return;
            }
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "UpgradeHandler message is,", Integer.valueOf(message.what));
            DeviceOtaActivity deviceOtaActivity = this.f24799c.get();
            if (deviceOtaActivity != null) {
                switch (message.what) {
                    case 4:
                        deviceOtaActivity.a(message.arg1);
                        maq.b().e(false);
                        break;
                    case 5:
                        if (deviceOtaActivity.t != 1) {
                            deviceOtaActivity.p();
                            maq.b().e(true);
                            LogUtil.a("DeviceOtaActivity", "MSG_UPGRADE_SUCCESS");
                        } else {
                            LogUtil.a("DeviceOtaActivity", "is already failed");
                        }
                        break;
                    case 6:
                    case 7:
                        LogUtil.a("DeviceOtaActivity", "MSG message.what:", Integer.valueOf(message.what), "message.arg1:", Integer.valueOf(message.arg1));
                        mbc.b().e();
                        deviceOtaActivity.d(e(message, deviceOtaActivity));
                        break;
                    case 8:
                        deviceOtaActivity.d(R.string.IDS_device_ear_state_error);
                        break;
                    case 9:
                        deviceOtaActivity.t();
                        break;
                    default:
                        LogUtil.a("DeviceOtaActivity", "UpgradeHandler default");
                        break;
                }
                return;
            }
            ReleaseLogUtil.e("DEVMGR_DeviceOtaActivity", "UpgradeHandler activity is null");
        }

        private String e(Message message, DeviceOtaActivity deviceOtaActivity) {
            DeviceInfo deviceInfoE = maq.b().e(deviceOtaActivity.m);
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "handFailed msg is,", Integer.valueOf(message.arg1));
            switch (message.arg1) {
                case 1:
                    if (deviceInfoE == null) {
                        return String.format(Locale.ENGLISH, deviceOtaActivity.f24787b.getString(R.string.IDS_settings_firmware_upgrade_band_upgrade_timeout), deviceOtaActivity.f24787b.getString(R.string.IDS_scan_device));
                    }
                    return String.format(Locale.ENGLISH, deviceOtaActivity.f24787b.getString(R.string.IDS_settings_firmware_upgrade_band_upgrade_timeout), deviceInfoE.getDeviceName());
                case 104002:
                case 109002:
                    String strE = UnitUtil.e(DeviceOtaActivity.f24786a, 2, 0);
                    LogUtil.a("DeviceOtaActivity", "battery : ", strE);
                    if (deviceInfoE == null) {
                        return String.format(Locale.ENGLISH, deviceOtaActivity.f24787b.getString(R.string.IDS_settings_firmware_upgrade_low_battery), deviceOtaActivity.f24787b.getString(R.string.IDS_scan_device), strE);
                    }
                    return String.format(Locale.ENGLISH, deviceOtaActivity.f24787b.getString(R.string.IDS_settings_firmware_upgrade_low_battery), deviceInfoE.getDeviceName(), strE);
                case 104003:
                    return deviceOtaActivity.f24787b.getString(R.string.IDS_settings_firmware_upgrade_file_not_exist);
                case 109025:
                    String strE2 = UnitUtil.e(20.0d, 2, 0);
                    LogUtil.a("DeviceOtaActivity", "earBattery : ", strE2);
                    return String.format(Locale.ENGLISH, deviceOtaActivity.f24787b.getString(R.string.IDS_device_ear_low_battery), strE2);
                default:
                    return c(message, deviceOtaActivity, deviceInfoE);
            }
        }

        private String c(Message message, DeviceOtaActivity deviceOtaActivity, DeviceInfo deviceInfo) {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "handleFailedMessage msg is,", Integer.valueOf(message.arg1));
            xjt.ap("handleFailedMessage msg is," + message.arg1);
            int i = message.arg1;
            if (i == 1002) {
                return deviceOtaActivity.f24787b.getString(R.string.IDS_settings_firmware_upgrade_crc_check_failed);
            }
            if (i == 104007) {
                return deviceOtaActivity.f24787b.getString(R.string.IDS_music_management_disconnection);
            }
            if (i == 109018) {
                return deviceOtaActivity.f24787b.getString(R.string.IDS_ota_update_high_temperature_error);
            }
            if (deviceInfo == null) {
                return String.format(Locale.ENGLISH, deviceOtaActivity.f24787b.getString(R.string.IDS_settings_firmware_upgrade_default_failed), deviceOtaActivity.f24787b.getString(R.string.IDS_scan_device));
            }
            return deviceOtaActivity.f24787b.getResources().getString(R.string.IDS_settings_firmware_upgrade_default_failed, deviceInfo.getDeviceName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (this.p == i) {
            return;
        }
        this.p = i;
        if (i >= 99) {
            this.ah.setText(R.string.IDS_ota_update_waiting);
        } else {
            this.ah.setText(R.string.IDS_ota_update_state_upgrading_new);
        }
        this.r.setText(UnitUtil.e(i, 1, 0));
        this.h.setProgress(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (this.f24787b == null) {
            return;
        }
        o();
        b();
        c(str);
        this.t = 1;
        a(0);
        this.ab.setVisibility(8);
        this.z.setVisibility(0);
        this.f.setVisibility(0);
        this.u.setVisibility(8);
        this.ab.setVisibility(0);
        this.ah.setText(R.string.IDS_device_ota_send_failed);
        this.ac.getBackground().setAlpha(255);
        this.ac.setClickable(true);
        this.ac.setText(R.string.IDS_retry);
        rcr.a(this.ac, this);
    }

    private void c(String str) {
        CustomTextAlertDialog customTextAlertDialog = this.e;
        if (customTextAlertDialog == null || !customTextAlertDialog.isShowing()) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this).a(R.string.IDS_device_ota_send_failed).a(str).a(R.string.IDS_ota_update_know, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.DeviceOtaActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "showOtaErrorDialog click");
                }
            }).b();
            this.e = customTextAlertDialogB;
            if (customTextAlertDialogB == null || customTextAlertDialogB.isShowing()) {
                return;
            }
            this.e.setCancelable(false);
            this.e.show();
        }
    }

    private void v() {
        if (maq.b().i(this.m)) {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "has Transfer() device");
            d(this.f24787b.getString(R.string.IDS_main_device_ota_error_message));
        } else {
            s();
        }
    }

    private void s() {
        DeviceInfo deviceInfoE = maq.b().e(this.m);
        if (deviceInfoE != null && deviceInfoE.getDeviceConnectState() == 2) {
            if (g() == 6) {
                maq.b().d(this.s);
                ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "startTransferForWear registerOTACallBack");
                this.t = 0;
                d();
                return;
            }
            if (g() == 4) {
                maq.b().b(this.m, this.s);
                ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "startTransferForWear registerBackgroundCallBack");
                this.t = 0;
                d();
                return;
            }
            if (g() == 5 && !TextUtils.isEmpty(maq.b().e())) {
                d(maq.b().e());
                ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "startTransferForWear show transfer error");
                xjt.ap("startTransferForWear show transfer error");
                return;
            }
            c(deviceInfoE);
            return;
        }
        boolean zB = SharedPreferenceManager.b(String.valueOf(1003), "flag_ota_update_success", false);
        if (deviceInfoE == null) {
            if (zB) {
                ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "startTransferForWear OTA update succeed");
                finish();
                return;
            }
        } else if (zB && deviceInfoE.getDeviceConnectState() == 4) {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "startTransferForWear OTA update succeed and device reboot");
            this.ah.setText(R.string.IDS_settings_firmware_upgrade_band_transfer_finish);
            finish();
            return;
        }
        d(this.f24787b.getString(R.string.IDS_music_management_disconnection));
    }

    private void c(DeviceInfo deviceInfo) {
        if (max.c().e()) {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "not isAllowUpgrade");
            d(max.c().d(4));
        } else if (eey.d(deviceInfo, 112)) {
            a();
        } else {
            mbc.b().e(false);
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        DeviceInfo deviceInfoE = maq.b().e(this.m);
        if (deviceInfoE == null || deviceInfoE.getDeviceConnectState() != 2) {
            d(this.f24787b.getString(R.string.IDS_music_management_disconnection));
            return;
        }
        c cVar = this.ai;
        if (cVar != null) {
            cVar.sendEmptyMessageDelayed(8, 30000L);
        }
        lxb.c().a(deviceInfoE, new EarPhoneResponseCallback() { // from class: com.huawei.ui.device.activity.update.DeviceOtaActivity.3
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
            public void onResponse(int i, edj edjVar) {
                if (DeviceOtaActivity.this.ai != null) {
                    DeviceOtaActivity.this.ai.removeMessages(8);
                }
                if (edjVar == null) {
                    DeviceOtaActivity.this.d(R.string.IDS_device_ear_state_error);
                    LogUtil.j("DeviceOtaActivity", "checkEarPhoneState onResponse earPhoneInfo is null");
                    return;
                }
                LogUtil.a("DeviceOtaActivity", "checkEarPhoneState() earPhoneInfo.getDeviceStatus() is ", Integer.valueOf(edjVar.e()));
                if (edjVar.e() != 3) {
                    DeviceOtaActivity.this.d(R.string.IDS_device_ear_state);
                } else {
                    mbc.b().e(false);
                    DeviceOtaActivity.this.l();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final int i) {
        LogUtil.a("DeviceOtaActivity", "showEarphoneDialog enter");
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.update.DeviceOtaActivity.10
            @Override // java.lang.Runnable
            public void run() {
                if (DeviceOtaActivity.this.f24787b != null) {
                    if (DeviceOtaActivity.this.j != null) {
                        View viewInflate = DeviceOtaActivity.this.j.inflate(R.layout.activity_device_ota_transmission_dialog, (ViewGroup) null);
                        if (viewInflate == null) {
                            LogUtil.j("DeviceOtaActivity", "showEarphoneDialog autoItemView is null.");
                            return;
                        }
                        ((HealthTextView) viewInflate.findViewById(R.id.band_transmission_title)).setText(DeviceOtaActivity.this.f24787b.getString(i));
                        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(DeviceOtaActivity.this.f24787b).a(viewInflate).a(R.string.IDS_device_ignore, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.update.DeviceOtaActivity.10.3
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i2) {
                                LogUtil.a("DeviceOtaActivity", "showEarphoneDialog setNegativeButton");
                                mbc.b().e(true);
                                DeviceOtaActivity.this.l();
                            }
                        }).d(R.string.IDS_retry, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.update.DeviceOtaActivity.10.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i2) {
                                LogUtil.a("DeviceOtaActivity", "showEarphoneDialog setPositiveButton");
                                DeviceOtaActivity.this.a();
                            }
                        }).b();
                        if (customAlertDialogB == null || customAlertDialogB.isShowing()) {
                            return;
                        }
                        LogUtil.a("DeviceOtaActivity", "showEarphoneDialog show");
                        customAlertDialogB.setCancelable(false);
                        customAlertDialogB.show();
                        return;
                    }
                    LogUtil.j("DeviceOtaActivity", "showEarphoneDialog mInflater == null");
                    return;
                }
                LogUtil.j("DeviceOtaActivity", "showEarphoneDialog mContext == null");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        String strB = rcw.b(BaseApplication.getContext()).b(this.m);
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "band new version is not exist");
            finish();
            return;
        }
        if (this.o) {
            maq.b().c(this.m, strB, "is_package_already_exists", this.s);
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "requestTransferForWear mIsPackageAlreadyExists");
        } else {
            String strD = rcw.b(BaseApplication.getContext()).d(this.m);
            if (this.i != null && !HwVersionManager.b(this.f24787b).d(this.m, this.i.getSecurityDeviceId())) {
                ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "band new package is not exist");
                finish();
                return;
            } else {
                if (TextUtils.equals(strB, HwVersionManager.b(this.f24787b).e(this.m))) {
                    ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "requestTransferForWear current Device is latest");
                    maq.b().e(this.m, 0);
                    maz.d().b();
                    HwVersionManager.b(this.f24787b).l(this.m);
                    max.c().d(this.m, 0);
                    finish();
                    return;
                }
                b(strB, strD);
            }
        }
        this.x = System.currentTimeMillis();
        this.t = 0;
    }

    private void b(String str, String str2) {
        DeviceCapability deviceCapabilityA = eej.a(this.m);
        if (deviceCapabilityA == null || !deviceCapabilityA.getIsSupportDeviceRequestCheck()) {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "manualStartTransfer");
            maq.b().c(this.m, str, str2, this.s);
        } else {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "manualStartTransfer queryDeviceTransmitMode");
            if (this.ai != null) {
                Message messageObtain = Message.obtain();
                messageObtain.arg1 = 1;
                messageObtain.what = 7;
                this.ai.sendMessageDelayed(messageObtain, 30000L);
            }
            mbc.b().e(this.m, new b(this, str, str2));
        }
        o();
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<DeviceOtaActivity> f24797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f24798c;
        private String d;

        b(DeviceOtaActivity deviceOtaActivity, String str, String str2) {
            this.f24797b = new WeakReference<>(deviceOtaActivity);
            this.f24798c = str;
            this.d = str2;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "queryDeviceTransmitMode() errorCode = ", Integer.valueOf(i));
            DeviceOtaActivity deviceOtaActivity = this.f24797b.get();
            if (deviceOtaActivity == null) {
                return;
            }
            if (deviceOtaActivity.ai != null) {
                deviceOtaActivity.ai.removeMessages(7);
            }
            maq.b().c(deviceOtaActivity.m, this.f24798c, this.d, deviceOtaActivity.s);
            deviceOtaActivity.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!eey.d(this.i, 147)) {
            ReleaseLogUtil.e("DEVMGR_DeviceOtaActivity", "checkWifiState device not supportAutoChangeWifiP2P");
            return;
        }
        if (!k()) {
            ReleaseLogUtil.e("DEVMGR_DeviceOtaActivity", "isShowDialog is false");
            return;
        }
        if (ram.d(this.i)) {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "checkWlanState isSupportWlanTransmit");
            i();
        } else {
            if (ram.b(this.f24787b)) {
                return;
            }
            r();
        }
    }

    private void o() {
        SharedPreferenceManager.d(String.valueOf(1003), "show_open_wlan_dialog_count", 0);
    }

    private boolean k() {
        int iC = SharedPreferenceManager.c(String.valueOf(1003), "show_open_wlan_dialog_count", 0);
        ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "isShowDialog showOpenWlanDialogCount:", Integer.valueOf(iC));
        return iC < 1;
    }

    private void i() {
        mhs.a().getSwitchSetting("auto_open_wlan_status", this.i.getDeviceIdentify(), new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.update.DeviceOtaActivity.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "getWlanTransmitSwitch errorCode:", Integer.valueOf(i));
                if (i != 0 || !(obj instanceof String)) {
                    LogUtil.j("DeviceOtaActivity", "getWlanTransmitSwitch fail");
                    return;
                }
                String strValueOf = String.valueOf(obj);
                ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "getWlanTransmitSwitch info:", strValueOf);
                if (!"1".equals(strValueOf)) {
                    if (ram.b(DeviceOtaActivity.this.f24787b)) {
                        ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "getWlanTransmitSwitch WifiEnabled is true");
                        return;
                    } else {
                        DeviceOtaActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.update.DeviceOtaActivity.7.3
                            @Override // java.lang.Runnable
                            public void run() {
                                DeviceOtaActivity.this.r();
                            }
                        });
                        return;
                    }
                }
                LogUtil.j("DeviceOtaActivity", "getWlanTransmitSwitch is AUTO_OPEN_WLAN_OPEN");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        String string;
        String string2;
        ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "showOpenWlanDialog enter");
        if (this.f24787b == null) {
            LogUtil.j("DeviceOtaActivity", "showOpenWlanDialog mContext == null");
            return;
        }
        if (Utils.o()) {
            string = this.f24787b.getResources().getString(R.string.IDS_transmit_with_wlan_title_oversea);
            string2 = this.f24787b.getResources().getString(R.string.IDS_transmit_with_wlan_message_oversea);
        } else {
            string = this.f24787b.getResources().getString(R.string.IDS_transmit_with_wlan_title);
            string2 = this.f24787b.getResources().getString(R.string.IDS_transmit_with_wlan_message);
        }
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.f24787b).b(string).e(string2).a(R.string.IDS_profile_set_later, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.update.DeviceOtaActivity.8
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "showOpenWlanDialog click later");
                SharedPreferenceManager.d(String.valueOf(1003), "show_open_wlan_dialog_count", 1);
                DeviceOtaActivity.this.b();
            }
        }).d(R.string.IDS_dialog_checkbox_confirm, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.update.DeviceOtaActivity.9
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "showOpenWlanDialog click ok");
                DeviceOtaActivity.this.b();
                try {
                    DeviceOtaActivity.this.startActivityForResult(new Intent("android.settings.WIFI_SETTINGS"), 100);
                } catch (ActivityNotFoundException e) {
                    LogUtil.e("DeviceOtaActivity", "showOpenWlanDialog ActivityNotFoundException:", ExceptionUtils.c(e));
                    xjt.ap("showOpenWlanDialog ActivityNotFoundException");
                }
            }
        }).e(false).b();
        this.l = customAlertDialogB;
        customAlertDialogB.show();
        e();
    }

    private void e() {
        int iC = SharedPreferenceManager.c(String.valueOf(1003), "show_open_wlan_dialog_count", 0) + 1;
        ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "addShowDialogCount count:", Integer.valueOf(iC));
        SharedPreferenceManager.d(String.valueOf(1003), "show_open_wlan_dialog_count", iC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        CustomAlertDialog customAlertDialog = this.l;
        if (customAlertDialog != null) {
            customAlertDialog.cancel();
            this.l.dismiss();
            this.l = null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        this.t = 2;
        this.ab.setVisibility(8);
        this.z.setVisibility(0);
        a(100);
        this.ac.setClickable(true);
        this.ac.setText(R.string.IDS_social_clearup_storage_button_finish);
        this.ah.setText(R.string.IDS_settings_firmware_upgrade_band_transfer_finish);
        c cVar = this.ai;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
            this.ai = null;
        }
        o();
        b();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.q != null && g() == 4) {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "onBackPressed show notification");
            maz.d().b(this.m);
            maz.d().e(1, max.c().i(this.m));
        }
        super.onBackPressed();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.q != null) {
            maq.b().h();
            maq.b().g();
        }
        this.s = null;
        c cVar = this.ai;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
            this.ai = null;
        }
        u();
        this.f24787b = null;
        LogUtil.a("DeviceOtaActivity", "onDestroy()");
        CommonUtil.d(this.f24787b);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtil.a("DeviceOtaActivity", "onclick ");
        if (view.getId() == R.id.update_button) {
            if (this.t == 1) {
                ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "mIsConnected", Boolean.valueOf(this.k));
                if (!this.k) {
                    d(this.f24787b.getString(R.string.IDS_device_switch_device_connect_fail));
                    return;
                } else {
                    j();
                    return;
                }
            }
            finish();
        }
    }

    private void j() {
        if (this.q.i(this.q.d(this.m))) {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "re startTransferOtaFile");
            h();
            this.n = true;
            this.v = 0;
            maq.b().e(this.m, 0);
            v();
            return;
        }
        LogUtil.a("DeviceOtaActivity", "ota file is not exist");
        finish();
    }

    private void n() {
        ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "enter registerConnectStateBroadcast");
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastReceiver broadcastReceiver = this.d;
        this.f24788c = broadcastReceiver;
        BroadcastManagerUtil.c(this.f24787b, broadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (this.f24788c == null) {
            return;
        }
        try {
            unregisterReceiver(this.d);
            this.f24788c = null;
        } catch (IllegalArgumentException e) {
            LogUtil.a("DeviceOtaActivity", e.getMessage());
        }
    }

    private void b(LinkedHashMap<String, String> linkedHashMap, int i) {
        ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "enter setEventErrorMsg errorMsg = ", Integer.valueOf(i));
        if (linkedHashMap == null) {
            LogUtil.a("DeviceOtaActivity", "setEventErrorMsg map is null.");
            return;
        }
        if (i == 1) {
            linkedHashMap.put("errorID", "106");
            return;
        }
        if (i == 1002) {
            linkedHashMap.put("errorID", "107");
        } else if (i != 104007) {
            linkedHashMap.put("errorID", "105");
        } else {
            linkedHashMap.put("errorID", "104");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2) {
        ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "enter sentOtaTransferEvent. errorMsg=", i2 + "state is,", Integer.valueOf(i));
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        DeviceInfo deviceInfoB = mgg.b(this.m, "DeviceOtaActivity");
        if (deviceInfoB == null) {
            ReleaseLogUtil.d("DEVMGR_DeviceOtaActivity", "enter sentOtaTransferEvent device is null.");
            return;
        }
        int productType = deviceInfoB.getProductType();
        if (productType != -1) {
            linkedHashMap.put(DeviceCategoryFragment.DEVICE_TYPE, String.valueOf(productType));
            linkedHashMap.put("device_classfication", String.valueOf(eev.d(productType)));
        }
        if (i == 6) {
            linkedHashMap.put("operationID", "8");
            b(linkedHashMap, i2);
        } else {
            linkedHashMap.put("operationID", "7");
            long j = this.x;
            if (j > 0) {
                long j2 = this.g;
                if (j2 > 0) {
                    long j3 = j2 - j;
                    if (j3 > 0) {
                        linkedHashMap.put("OTATime", String.valueOf(j3));
                        maq.b().d(this.m, linkedHashMap, this.g - this.x);
                    }
                }
            }
        }
        linkedHashMap.put("deviceNewVersion", this.q.b(this.m));
        linkedHashMap.put("versionID", HwVersionManager.b(this.f24787b).h(this.m));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_DEVICE_OTA_UPDATE_80020004.value(), linkedHashMap);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
