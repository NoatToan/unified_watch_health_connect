package com.huawei.indoorequip.activity;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.base.AbstractFitnessClient;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.datastruct.QrCodeOrNfcInfo;
import com.huawei.indoorequip.util.DownloadUtil;
import com.huawei.indoorequip.viewmodel.IndoorConnectViewModel;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.up.model.UserInfomation;
import defpackage.eqw;
import defpackage.eru;
import defpackage.etn;
import defpackage.fdy;
import defpackage.hcd;
import defpackage.ivo;
import defpackage.ivq;
import defpackage.jbg;
import defpackage.lsg;
import defpackage.nwa;
import defpackage.nwd;
import defpackage.nxs;
import defpackage.nyx;
import defpackage.nzc;
import defpackage.nzf;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public class IndoorEquipConnectedActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTitleBar f17776a;
    private boolean ab;
    private LinearLayout am;
    private String aq;
    private a as;
    private int au;
    private HealthTextView av;
    private float aw;
    private Bitmap e;
    private BluetoothAdapter g;
    private HealthTextView h;
    private HealthTextView i;
    private Context j;
    private String n;
    private IndoorConnectViewModel p;
    private HealthProgressBar r;
    private HealthTextView s;
    private File t;
    private ImageView u;
    private IndoorEquipConnectedManager v;
    private HealthTextView w;
    private nwa y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Observer f17775c = new Observer() { // from class: com.huawei.indoorequip.activity.IndoorEquipConnectedActivity.3
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            Object obj = objArr[0];
            if (obj instanceof Integer) {
                int unused = IndoorEquipConnectedActivity.f17774b = ((Integer) obj).intValue();
            }
            if (IndoorEquipConnectedActivity.f17775c != null) {
                ObserverManagerUtil.a(IndoorEquipConnectedActivity.f17775c, "SKIP_START_EXERCISE_UI");
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17774b = 0;
    private boolean af = false;
    private boolean ac = false;
    private boolean aa = false;
    private String x = "";
    private boolean ag = true;
    private boolean ak = false;
    private boolean aj = false;
    private boolean z = false;
    private boolean ah = false;
    private boolean ad = false;
    private boolean ae = false;
    private boolean ai = false;
    private boolean an = false;
    private boolean al = false;
    private long ap = 0;
    private NoTitleCustomAlertDialog m = null;
    private CustomTextAlertDialog ao = null;
    private NoTitleCustomAlertDialog l = null;
    private NoTitleCustomAlertDialog q = null;
    private CustomTextAlertDialog o = null;
    private String k = "";
    private nwd f = null;
    private Handler ar = new Handler() { // from class: com.huawei.indoorequip.activity.IndoorEquipConnectedActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            IndoorEquipConnectedActivity.this.d(message.what);
            IndoorEquipConnectedActivity.this.i(message.what);
            int i = message.what;
            if (i == 509) {
                LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is INIT_VARS_WHEN_START_THREAD");
                IndoorEquipConnectedActivity.this.ak = false;
                return;
            }
            if (i == 510) {
                LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is INIT_VARS_WHEN_SERV_ON_CREATE");
                IndoorEquipConnectedActivity.this.q = null;
                return;
            }
            if (i == 617) {
                ReleaseLogUtil.d("R_HL_IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is ACTION_READ_SUCCESS");
                IndoorEquipConnectedActivity.this.an = true;
                IndoorEquipConnectedActivity.this.an();
                IndoorEquipConnectedActivity.this.c();
                IndoorEquipConnectedActivity.this.u();
                return;
            }
            if (i == 618) {
                ReleaseLogUtil.d("R_HL_IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is ACTION_SET_TARGET_SUCCESS");
                IndoorEquipConnectedActivity.this.ab();
                return;
            }
            if (i == 910) {
                IndoorEquipConnectedActivity.this.ai = false;
                return;
            }
            switch (i) {
                case 1007:
                    LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is UPDATE_DEVICE_INFO");
                    if (message.obj instanceof DeviceInformation) {
                        IndoorEquipConnectedActivity.this.e((DeviceInformation) message.obj);
                    }
                    break;
                case 1008:
                    ReleaseLogUtil.d("R_HL_IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is START_EXERCISE");
                    IndoorEquipConnectedActivity.this.at();
                    break;
                case 1009:
                    ReleaseLogUtil.d("R_HL_IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is DOWNLOAD_FINISH");
                    IndoorEquipConnectedActivity.this.x();
                    break;
            }
        }
    };
    private MessageOrStateCallback at = new MessageOrStateCallback() { // from class: com.huawei.indoorequip.activity.IndoorEquipConnectedActivity.4
        @Override // com.huawei.btsportdevice.callback.MessageOrStateCallback
        public void onNewMessage(int i, Bundle bundle) {
            if (IndoorEquipConnectedActivity.this.p != null) {
                IndoorEquipConnectedActivity.this.p.a(i, bundle);
            } else if (i == 912) {
                IndoorEquipConnectedActivity.this.d(bundle);
            }
        }

        @Override // com.huawei.btsportdevice.callback.MessageOrStateCallback
        public void onStateChange(String str) {
            if (IndoorEquipConnectedActivity.this.p != null) {
                IndoorEquipConnectedActivity.this.p.a(str);
            }
        }
    };
    private DownloadUtil.DownloadListener d = new DownloadUtil.DownloadListener() { // from class: nwo
        @Override // com.huawei.indoorequip.util.DownloadUtil.DownloadListener
        public final void onDownloadFinish(boolean z) {
            this.f43866b.d(z);
        }
    };

    public /* synthetic */ void d(boolean z) {
        LogUtil.j("IDEQ_IndoorEquipConnectedActivity", "onDownloadFinish");
        j(1009);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Bundle bundle) {
        String string;
        if (bundle == null) {
            string = "";
        } else {
            string = bundle.getString("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK");
        }
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("IDEQ_IndoorEquipConnectedActivity", "setTargetResponse result is null", string);
            return;
        }
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "control machine is ", string);
        if ("set_target_success".equals(string)) {
            this.ar.sendEmptyMessage(618);
        } else if ("set_target_failed".equals(string)) {
            this.ar.sendEmptyMessage(619);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        IndoorConnectViewModel indoorConnectViewModel = this.p;
        if (indoorConnectViewModel != null) {
            nyx.c(this.aq, indoorConnectViewModel.d(), this.p.e());
        }
        if (hcd.f36391c.containsKey(Integer.valueOf(f17774b))) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "sSportType is " + f17774b);
            if (nzc.a(this.k) == f17774b) {
                LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "mac address is " + nxs.d().c());
                ObserverManagerUtil.e("DEVICE_ASSOCIATION", nxs.d().c(), hcd.e.get(Integer.valueOf(f17774b)));
            } else {
                ObserverManagerUtil.e("DEVICE_ASSOCIATION", new Object[0]);
            }
            f17774b = 0;
            this.ad = true;
            finish();
            return;
        }
        if (ae()) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "Already sporting, START_EXERCISE");
            at();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i) {
        if (i == 612) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is INVALID_DEVICE_INFO");
            b(getString(R.string.ie_invalid_device_info));
            return;
        }
        if (i == 613) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is FAILED_UNLOCK_BT_MODULE");
            b(getString(R.string.ie_unlock_bt_module_failed));
            r();
            return;
        }
        if (i == 619) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is ACTION_SET_TARGET_FAILED");
            ar();
            c(getString(R.string.ie_floatview_tips_connect_failed));
            return;
        }
        if (i != 909) {
            switch (i) {
                case 1001:
                    LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is MSG_SHOW_INVALID_QR_CODE_TOAST");
                    c(getString(R.string.ie_invalid_qrcode));
                    break;
                case 1002:
                    LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is MSG_SHOW_INVALID_NFC_TOAST");
                    c(getString(R.string.ie_invalid_nfc_card));
                    break;
                case 1003:
                    LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is MSG_SHOW_PLEASE_RESCAN_TOAST");
                    c(getString(R.string.ie_no_qrcode_pls_retry));
                    break;
                case 1004:
                    LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is MSG_SHOW_TIPS_WHEN_START_FROM_GYM_BTN");
                    p();
                    break;
                case 1005:
                    LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is MSG_SHOW_TIPS_WHEN_START_HAS_CONNECTED_ALREADY");
                    nwd nwdVar = this.f;
                    if (nwdVar != null) {
                        nwdVar.c();
                    }
                    break;
            }
            return;
        }
        s();
    }

    private boolean ae() {
        if (this.p != null) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "isSportingOrPause" + this.p.getSportStatus());
        }
        IndoorConnectViewModel indoorConnectViewModel = this.p;
        if (indoorConnectViewModel != null) {
            return indoorConnectViewModel.getSportStatus() == 1 || this.p.getSportStatus() == 2;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (i == 302) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is MSG_BT_CONNECTED_SHOW");
            i();
            return;
        }
        if (i == 304) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is MSG_BT_DISCONNECTED_SHOW");
            o();
            return;
        }
        if (i == 309) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is MSG_BT_SERVICE_REDISCOVER_SHOW");
            l();
            return;
        }
        if (i == 311) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is BT_WILL_CONNECTING_SHOW");
            k();
            return;
        }
        if (i == 313) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is MSG_DEVICE_UNSUPPORTED");
            e(getString(R.string.ie_device_unsupported));
            return;
        }
        if (i == 513) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is MSG_SHOW_TIPS_FOR_STATUS_POST_WORKOUT");
            if (this.ak) {
                return;
            }
            this.ak = true;
            e(getString(R.string.tips_when_training_status_post_workout));
            return;
        }
        if (i == 908) {
            n();
            return;
        }
        if (i == 9004) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is MSG_CALL_FINISH_ACTIVITY_LATER");
            r();
        } else if (i == 306) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is MSG_BT_SERVICE_NOT_SUPPORT");
            o();
        } else {
            if (i != 307) {
                return;
            }
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is MSG_BT_RECONNECTING_SHOW");
            m();
        }
    }

    private void n() {
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "in handleMessage, case is FINISH_ACTIVITY");
        if (isFinishing()) {
            return;
        }
        this.ad = true;
        if (!this.ab) {
            nxs.d().m();
        }
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.connecting_hintText) {
            if (this.aj) {
                return;
            }
            if (getString(R.string.tips_when_unsuppor_nfc).equals(this.i.getText()) || getString(R.string.ie_no_qrcode_pls_retry).equals(this.i.getText()) || getString(R.string.ie_invalid_qrcode).equals(this.i.getText())) {
                if (this.y.u()) {
                    LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onClick of scan QRcode(red) button but isWillNotResponseNfcAndQrcode is true, return");
                    return;
                } else {
                    am();
                    return;
                }
            }
            return;
        }
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onClick viewId is ", Integer.valueOf(id));
    }

    private void am() {
        if (ag()) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onClick of scan QRcode(red) button");
            if (lsg.d(this, new String[]{"android.permission.CAMERA"})) {
                ax();
                return;
            } else {
                lsg.a(this, new String[]{"android.permission.CAMERA"}, new PermissionsResultAction() { // from class: com.huawei.indoorequip.activity.IndoorEquipConnectedActivity.2
                    @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onDenied(String str) {
                    }

                    @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onGranted() {
                        IndoorEquipConnectedActivity.this.ax();
                    }
                });
                return;
            }
        }
        LogUtil.j("IDEQ_IndoorEquipConnectedActivity", "onClick of scan QRcode(red) button but cannot response because state of BT is not allowed");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "enter onCreate");
        this.ap = SystemClock.elapsedRealtime();
        nwd nwdVar = new nwd(this, null, null);
        this.f = nwdVar;
        nwdVar.e(this.ar);
        setContentView(R.layout.connected_activity_layout);
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().getDecorView().setSystemUiVisibility(9216);
        getWindow().setStatusBarColor(0);
        this.t = new File(fdy.d("com.huawei.health_ecologydevice_config", "north_device_img_resource", (String) null) + File.separator + "done");
        ad();
        aa();
        ac();
        if (this.y.r()) {
            Intent intent = new Intent("com.huawei.health.FINISH_DISPLAY_ACTIVITY");
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "send LocalBroadcast action is BROADCAST_INTENT_FINISH_DISPLAY_ACTIVITY");
            LocalBroadcastManager.getInstance().sendBroadcast(intent);
        }
        BluetoothManager bluetoothManager = getSystemService("bluetooth") instanceof BluetoothManager ? (BluetoothManager) getSystemService("bluetooth") : null;
        if (bluetoothManager == null || bluetoothManager.getAdapter() == null) {
            ah();
            return;
        }
        this.g = bluetoothManager.getAdapter();
        t();
        if (!this.ab) {
            a();
            z();
        }
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "device type:", this.k);
        getWindow().addFlags(128);
        if (!this.t.exists() || this.t.length() <= 0) {
            return;
        }
        this.am.setVisibility(8);
        initViewTahiti();
    }

    private void ac() {
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "initBoltConnect with not connected device");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.indoorequip.activity.IndoorEquipConnectedActivity.6
            @Override // java.lang.Runnable
            public void run() {
                ivq.e().d(ivo.a().e(true));
                LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "bolt status foot number is ", Integer.valueOf(ivq.e().a()));
                LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "bolt status waist number is ", Integer.valueOf(ivq.e().c()));
                ivo.a().d();
            }
        });
    }

    private void ah() {
        LogUtil.e("IDEQ_IndoorEquipConnectedActivity", "not supported bt");
        qpx.e(HuaweiHealth.a(), getString(this.ah ? R.string.IDS_not_support_bt_the_pad : R.string.ie_no_bt_in_this_phone));
        r();
    }

    private void z() {
        if (this.v == null) {
            IndoorEquipConnectedManager indoorEquipConnectedManager = new IndoorEquipConnectedManager(this.j, new IndoorEquipConnectedManager.OnNfcConnectListener() { // from class: com.huawei.indoorequip.activity.IndoorEquipConnectedActivity.8
                @Override // com.huawei.indoorequip.activity.IndoorEquipConnectedManager.OnNfcConnectListener
                public void onStartTimeChange(long j) {
                    if (IndoorEquipConnectedActivity.this.p != null) {
                        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "mIndoorConnectViewModel set time");
                        IndoorEquipConnectedActivity.this.p.a(j);
                    }
                }

                @Override // com.huawei.indoorequip.activity.IndoorEquipConnectedManager.OnNfcConnectListener
                public void onQrCodeOrNfcInfoSet(QrCodeOrNfcInfo qrCodeOrNfcInfo) {
                    if (IndoorEquipConnectedActivity.this.p != null) {
                        IndoorEquipConnectedActivity.this.p.e(qrCodeOrNfcInfo);
                    }
                }
            }, this.ar);
            this.v = indoorEquipConnectedManager;
            indoorEquipConnectedManager.init();
            this.p.c(this.v);
        }
    }

    private void ad() {
        nwa nwaVarN = nwa.n();
        this.y = nwaVarN;
        nwaVarN.a(false);
        this.aj = false;
        this.ak = false;
        this.an = false;
        Context applicationContext = getApplicationContext();
        this.j = applicationContext;
        jbg.c(applicationContext);
        this.ah = qrs.ah(this.j);
        nwd nwdVar = this.f;
        if (nwdVar != null) {
            nwdVar.c(this.j);
        }
        if (!nzc.a()) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "The Emui version is too low");
            aq();
            return;
        }
        boolean zHasSystemFeature = getPackageManager().hasSystemFeature("android.hardware.nfc");
        this.aj = zHasSystemFeature;
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "this phone supports Nfc? ", Boolean.valueOf(zHasSystemFeature));
        if (!getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            qpx.e(HuaweiHealth.a(), getString(this.ah ? R.string.IDS_not_support_ble_the_pad : R.string.ie_no_ble_in_this_phone));
            LogUtil.j("IDEQ_IndoorEquipConnectedActivity", "no BLE in this phone");
            r();
        } else {
            if (getIntent() != null) {
                boolean booleanExtra = getIntent().getBooleanExtra("isFromHarmonyFa", false);
                this.af = booleanExtra;
                this.ac = booleanExtra || getIntent().getBooleanExtra("ExitApp", false);
            }
            LogUtil.d("IDEQ_IndoorEquipConnectedActivity", "initParams ExitApp ", Boolean.valueOf(this.ac));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onDestroy");
        boolean zAg = ag();
        DownloadUtil.a((DownloadUtil.DownloadListener) null);
        if (!this.ad) {
            if (!this.ab) {
                nxs.d().m();
            }
            if (!zAg) {
                LogUtil.j("IDEQ_IndoorEquipConnectedActivity", "unnormal onDestroy");
                this.as = new a();
                ThreadPoolManager.c().execute(this.as);
            } else {
                r();
            }
        } else {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "normal onDestroy,isBtDisconnected is " + zAg);
            nxs.d().d("IDEQ_IndoorEquipConnectedActivity", true);
            if (zAg) {
                r();
            }
        }
        this.ad = false;
        this.f = null;
        IndoorConnectViewModel indoorConnectViewModel = this.p;
        if (indoorConnectViewModel != null) {
            indoorConnectViewModel.k();
            this.p.unregisterAll();
            this.p.e(!this.y.s());
            this.p = null;
        }
        this.ar.removeCallbacksAndMessages(null);
        this.ar = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onBackPressed BluetoothConnectState:", this.y.m(), ", IsReadCompleted:", Boolean.valueOf(this.an));
        if (ag()) {
            r();
            return;
        }
        if (AbstractFitnessClient.ACTION_GATT_STATE_RECONNECTING.equals(this.y.m()) || AbstractFitnessClient.ACTION_GATT_STATE_CONNECTING.equals(this.y.m()) || AbstractFitnessClient.ACTION_GATT_STATE_CONNECTED.equals(this.y.m())) {
            qpx.e(HuaweiHealth.a(), R.string.ie_back_tips_connecting_pls_wait);
            return;
        }
        if (AbstractFitnessClient.ACTION_SERVICE_DISCOVERIED.equals(this.y.m()) && !this.an) {
            qpx.e(HuaweiHealth.a(), R.string.ie_back_tips_connecting_pls_wait);
            return;
        }
        if (this.ai) {
            qpx.e(HuaweiHealth.a(), R.string.ie_wait_delay_start);
        } else if (this.p == null || this.al) {
            LogUtil.e("IDEQ_IndoorEquipConnectedActivity", "mService is null");
        } else {
            ap();
            this.p.a(true, false);
        }
    }

    private void ap() {
        if (this.af && "31".equals(this.k)) {
            LogUtil.d("IDEQ_IndoorEquipConnectedActivity", "return Fa,don't show toast");
        } else if (!this.ab) {
            qpx.e(HuaweiHealth.a(), R.string.IDS_fitness_equip_blutooth_disconnected);
        }
        this.p.a(true, false);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "enter onNewIntent");
        this.ae = true;
        if (!nzc.a()) {
            LogUtil.j("IDEQ_IndoorEquipConnectedActivity", "The version of Emui is too low");
            aq();
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.l;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onNewIntent, mDialogForDisconnect is showing, return");
            return;
        }
        if (this.z) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onNewIntent, btEnable Is Showing, return");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.ap;
        if (intent != null && jElapsedRealtime > 1000) {
            b(intent);
        } else {
            LogUtil.e("IDEQ_IndoorEquipConnectedActivity", "onNewIntent but intent is null or time too short, timeGapBtwOnCreateAndNow:", Long.valueOf(jElapsedRealtime));
        }
    }

    private void b(final Intent intent) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: nwm
            @Override // java.lang.Runnable
            public final void run() {
                this.f43865c.c(intent);
            }
        });
    }

    public /* synthetic */ void c(Intent intent) {
        String stringExtra = intent.getStringExtra("PAYLOAD_FROM_NFC");
        if (this.v == null) {
            a();
            z();
        }
        if ("android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onNewIntent, action is ACTION_NDEF_DISCOVERED");
            this.v.a(intent);
        } else if (stringExtra != null && !stringExtra.isEmpty()) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onNewIntent, action is from MainActivity and payload from Main is ****", " and mBlueConnectState is ", this.y.m());
            this.v.b(stringExtra);
        } else {
            this.v.c(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ax() {
        ComponentName componentName = new ComponentName(this.j.getPackageName(), "com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity");
        Intent intent = new Intent();
        intent.setComponent(componentName);
        startActivity(intent);
        this.ad = true;
        finish();
    }

    private void f(int i) {
        for (int i2 = 0; !this.y.s() && i2 < i; i2++) {
            SystemClock.sleep(100L);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onActivityResult, requestCode is ", Integer.valueOf(i), ", and resultCode is ", Integer.valueOf(i2));
        if (i2 == 0) {
            if (i == 3 || i == 2) {
                r();
            }
        } else if (i == 2) {
            this.z = false;
            if (v()) {
                LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onActivityResult handlePositive");
                w();
            }
        } else if (i == 1) {
            if (this.g.isEnabled()) {
                y();
            }
        } else {
            LogUtil.d("IDEQ_IndoorEquipConnectedActivity", "else Code is" + i);
        }
        super.onActivityResult(i, i2, intent);
    }

    private void aa() {
        this.u = (ImageView) findViewById(R.id.background);
        this.i = (HealthTextView) findViewById(R.id.connecting_hintText);
        this.av = (HealthTextView) findViewById(R.id.start_hintText);
        this.w = (HealthTextView) findViewById(R.id.instrumentInfoText);
        this.h = (HealthTextView) findViewById(R.id.connectState);
        this.f17776a = (CustomTitleBar) findViewById(R.id.back_button);
        this.i.setOnClickListener(this);
        this.am = (LinearLayout) findViewById(R.id.loading_layout);
        this.r = (HealthProgressBar) findViewById(R.id.loading_iv);
        this.s = (HealthTextView) findViewById(R.id.progress_dialog_desc);
        if (!this.t.exists() || this.t.length() <= 0) {
            this.am.setVisibility(0);
            this.r.setVisibility(4);
        }
        this.f17776a.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: nwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f43867a.b(view);
            }
        });
        if (this.af) {
            t();
            if (nzc.a(this.k) == 264) {
                this.i.setText(getString(R.string.ie_treadmill_connected_hint2));
            } else {
                this.i.setText(getString(R.string.ie_connected_success));
            }
            b(this.av);
            this.av.setVisibility(0);
            c(false);
        }
        nxs.d().e();
        nxs.d().a(getClass().getSimpleName(), this.at);
    }

    public /* synthetic */ void b(View view) {
        onBackPressed();
    }

    protected void a() {
        if (this.p == null) {
            int iA = nzc.a(this.k);
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "initViewModel with sport type: ", Integer.valueOf(iA));
            this.y.e("unknown");
            this.p = (IndoorConnectViewModel) new ViewModelProvider(this).get(IndoorConnectViewModel.class);
            Bundle bundle = new Bundle();
            bundle.putInt("map_tracking_sport_type_sportting", iA);
            bundle.putBoolean("ExitApp", this.ac);
            LogUtil.d("IDEQ_IndoorEquipConnectedActivity", "initViewModel ExitApp ", Boolean.valueOf(this.ac));
            bundle.putInt("sport_target_type_sportting", this.au);
            bundle.putFloat("sport_target_value_sportting", this.aw);
            bundle.putBoolean("isHrControlCourse", !TextUtils.isEmpty(this.n));
            this.p.d(this.ab);
            boolean booleanExtra = getIntent() != null ? getIntent().getBooleanExtra("sendVoice", true) : true;
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "initViewModel isSendVoice ", Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                this.p.j();
            }
            this.p.c(bundle, this.ar);
            if (hcd.f36391c.containsKey(Integer.valueOf(f17774b))) {
                return;
            }
            this.p.observeSportLifeCycle("IDEQ_IndoorEquipConnectedActivity", new SportLifecycle() { // from class: com.huawei.indoorequip.activity.IndoorEquipConnectedActivity.9
                @Override // com.huawei.health.sportservice.SportLifecycle
                public void onStartSport() {
                    LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "initViewModel observeSportLifeCycle onStartSport");
                    IndoorEquipConnectedActivity.this.at();
                }

                @Override // com.huawei.health.sportservice.SportLifecycle
                public void onResumeSport() {
                    LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "initViewModel observeSportLifeCycle onResumeSport");
                    IndoorEquipConnectedActivity.this.at();
                }

                @Override // com.huawei.health.sportservice.SportLifecycle
                public void onPauseSport() {
                    LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "initViewModel observeSportLifeCycle onPauseSport");
                    IndoorEquipConnectedActivity.this.at();
                    IndoorEquipConnectedActivity.this.aa = false;
                }

                @Override // com.huawei.health.sportservice.SportLifecycle
                /* JADX INFO: renamed from: onStopSport */
                public void m825x32b3e3a1() {
                    LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "initViewModel observeSportLifeCycle onStopSport");
                    IndoorEquipConnectedActivity.this.p.a(false, false);
                    IndoorEquipConnectedActivity.this.aa = false;
                }
            });
            this.p.onPreSport();
        }
    }

    public static void e() {
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "enter resetSportType");
        f17774b = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceInformation deviceInformation) {
        IndoorConnectViewModel indoorConnectViewModel;
        if (deviceInformation == null || (indoorConnectViewModel = this.p) == null || indoorConnectViewModel.getSportStatus() == 3) {
            return;
        }
        String manufacturerString = deviceInformation.getManufacturerString();
        String modelString = deviceInformation.getModelString();
        String strH = h(deviceInformation.getDeviceType());
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(manufacturerString) ? "" : manufacturerString.trim());
        sb.append(TextUtils.isEmpty(modelString) ? "" : modelString.trim());
        String str = String.format(strH, sb);
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "updateDeviceInfo, deviceInfo = ", str);
        if (str.length() > 15) {
            this.w.setTextSize(1, 13.0f);
        } else {
            this.w.setTextSize(1, 15.0f);
        }
        c(false);
        this.w.setText(str);
        this.w.setVisibility(0);
        if (nzc.a(this.k) == 264) {
            this.h.setVisibility(0);
        }
    }

    private String h(int i) {
        if (i == 264) {
            return getString(R.string.ie_device_type_attachable_treadmill_string);
        }
        if (i == 265) {
            return getString(R.string.ie_device_type_indoor_cycling_string);
        }
        if (i == 273) {
            return getString(R.string.ie_device_type_cross_trainer_string);
        }
        if (i == 274) {
            return getString(R.string.ie_device_type_row_machine_string);
        }
        if (i == 281) {
            return getString(R.string.ie_device_type_walking_machine_string);
        }
        return "";
    }

    public void c(int i) {
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onCreate, connect to Service");
        this.y.i(false);
        if (AbstractFitnessClient.ACTION_GATT_STATE_CONNECTING.equals(this.y.m())) {
            k();
        } else {
            initViewTahiti();
        }
        b(i);
    }

    private void b(final int i) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: nwk
            @Override // java.lang.Runnable
            public final void run() {
                this.f43863a.a(i);
            }
        });
    }

    public /* synthetic */ void a(int i) {
        f(20);
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "sub thread");
        if (ae() && this.an) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "Already sporting and ReadCompleted, send message START_EXERCISE");
            j(1008);
        } else {
            SystemClock.sleep(i);
            e(getIntent());
        }
    }

    private void e(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("PAYLOAD_FROM_NFC");
            if (ag()) {
                LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onCreate, intent is not null");
                if (this.v == null) {
                    a();
                    z();
                }
                if (stringExtra != null && !stringExtra.isEmpty()) {
                    LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onCreate, start from MainActivity and payload is not empty");
                    nzc.a(getApplicationContext(), "NFC", d(stringExtra));
                    this.v.e(stringExtra);
                    return;
                }
                this.v.b(intent);
                return;
            }
            nzc.a(getApplicationContext(), "Connected", d(stringExtra));
            j(1005);
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onCreate, a session is running already");
            return;
        }
        nzc.a(getApplicationContext(), "Other", "");
        j(1004);
        LogUtil.e("IDEQ_IndoorEquipConnectedActivity", "onCreate, intent is null or a session is running already");
    }

    private String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return etn.e("ble", str);
    }

    private boolean ag() {
        return AbstractFitnessClient.ACTION_GATT_STATE_DISCONNECTED.equals(this.y.m()) || "unknown".equals(this.y.m());
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "IndoorEquipConnectedActivity, onPause");
        super.onPause();
        this.ae = false;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onStart");
        super.onStart();
        if (this.ae) {
            return;
        }
        ao();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        super.onResume();
        if (!nzc.a()) {
            LogUtil.j("IDEQ_IndoorEquipConnectedActivity", "The Emui version too low");
            aq();
            return;
        }
        if (this.g == null) {
            ah();
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.l;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onResume, mDialogForDisconnect is showing, return");
            return;
        }
        if ((!this.g.isEnabled() && !this.z) || !PermissionDialogHelper.c(this)) {
            this.z = true;
            af();
            return;
        }
        getWindow().addFlags(128);
        if (!this.ae || ai()) {
            return;
        }
        ao();
    }

    private void af() {
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "openBlueTooth");
        PermissionDialogHelper.d(this, new PermissionDialogHelper.OpenBlueToothAction() { // from class: com.huawei.indoorequip.activity.IndoorEquipConnectedActivity.10
            @Override // com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.OpenBlueToothAction
            public void onPermissionGranted() {
                try {
                    IndoorEquipConnectedActivity.this.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 2);
                } catch (ActivityNotFoundException unused) {
                    LogUtil.e("IDEQ_IndoorEquipConnectedActivity", "openBlueTooth from activity ActivityNotFoundException!");
                }
            }

            @Override // com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.OpenBlueToothAction
            public void onPermissionDenied() {
                LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "openBlueTooth finishFragment");
                IndoorEquipConnectedActivity.this.r();
            }
        });
    }

    private boolean ai() {
        return PermissionUtil.e(this, PermissionUtil.PermissionType.LOCATION) == PermissionUtil.PermissionResult.GRANTED;
    }

    /* JADX INFO: renamed from: com.huawei.indoorequip.activity.IndoorEquipConnectedActivity$7, reason: invalid class name */
    public class AnonymousClass7 extends CustomPermissionAction {
        AnonymousClass7(Context context) {
            super(context);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            if (!eru.a(IndoorEquipConnectedActivity.this)) {
                IndoorEquipConnectedActivity.this.aj();
            } else {
                IndoorEquipConnectedActivity.this.ak();
            }
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            super.onDenied(str);
            IndoorEquipConnectedActivity.this.r();
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            qrs.c(IndoorEquipConnectedActivity.this, permissionType, (CustomTextAlertDialog) null, new View.OnClickListener() { // from class: nwu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f43871c.d(view);
                }
            }, new View.OnClickListener() { // from class: nwt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f43870a.a(view);
                }
            });
        }

        public /* synthetic */ void a(View view) {
            IndoorEquipConnectedActivity.this.r();
        }

        public /* synthetic */ void d(View view) {
            IndoorEquipConnectedActivity.this.r();
        }
    }

    private void y() {
        PermissionUtil.d(this, q(), new AnonymousClass7(this.j));
    }

    private PermissionUtil.PermissionType q() {
        if (nzc.a(this.k) == 264) {
            return PermissionUtil.PermissionType.STORAGE_LOCATION;
        }
        return PermissionUtil.PermissionType.LOCATION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ak() {
        if (this.ab) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "getSdPermission isFromDetailOrRateControl");
            int i = this.au;
            if (i == 6) {
                ab();
            } else if (i == 2) {
                nxs.d().e(2, new int[]{(int) this.aw});
                this.ar.sendEmptyMessageDelayed(618, 500L);
            } else {
                nxs.d().e(TextUtils.isEmpty(this.n) ? this.au : 0, new int[]{(int) this.aw});
            }
            if (this.aa) {
                LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "permissionToGranted mIsDeviceStarted is true");
                at();
                return;
            }
            return;
        }
        c(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        nxs.d().l();
        a();
        z();
        nxs.d().k();
        this.an = true;
        e(this.v.e(getIntent()));
        u();
        this.y.e(AbstractFitnessClient.ACTION_SERVICE_DISCOVERIED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aj() {
        eqw.d(this, true, new IdialogButtonClickCallback() { // from class: com.huawei.indoorequip.activity.IndoorEquipConnectedActivity.5
            @Override // com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback
            public void onClick(View view) {
                try {
                    IndoorEquipConnectedActivity.this.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1);
                } catch (ActivityNotFoundException unused) {
                    IndoorEquipConnectedActivity.this.z = false;
                    qpx.e(HuaweiHealth.a(), HuaweiHealth.a().getResources().getString(R.string.IDS_btsdk_turn_on_location_new));
                    LogUtil.e("IDEQ_IndoorEquipConnectedActivity", "startActivity REQUEST_GPS_LOCATION fail ");
                }
            }

            @Override // com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback
            public void onCancelClick(View view) {
                IndoorEquipConnectedActivity.this.r();
            }
        });
    }

    private void k() {
        if (!this.af) {
            c(true);
            this.i.setText(getString(R.string.ie_treadmill_connecting_hint));
            this.i.setVisibility(0);
            if (nzc.a(this.k) == 264) {
                this.av.setVisibility(4);
            } else {
                c(this.av);
                this.av.setVisibility(0);
            }
        }
        this.h.setVisibility(4);
        j();
    }

    private void c(HealthTextView healthTextView) {
        healthTextView.setText(getString(R.string.ie_tips_activation_device));
        float fMeasureText = healthTextView.getPaint().measureText(getString(R.string.ie_tips_activation_device));
        int i = (int) ((getResources().getDisplayMetrics().widthPixels * 2) / 3.0f);
        if (fMeasureText >= i) {
            healthTextView.setWidth(i);
        }
    }

    private void i() {
        if (!this.af) {
            this.i.setText(getString(R.string.ie_connected_success_getting_deviceinfo));
            c(true);
            this.i.setVisibility(0);
            this.av.setVisibility(4);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        IndoorEquipConnectedManager indoorEquipConnectedManager = this.v;
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "TIME connected time:", Double.valueOf((jCurrentTimeMillis - (indoorEquipConnectedManager == null ? 0L : indoorEquipConnectedManager.b())) / 1000.0f));
        if (nzc.a(this.k) == 264) {
            as();
        }
    }

    private void m() {
        c(true);
        this.i.setText(getString(R.string.ie_treadmill_connecting_again));
        this.i.setVisibility(0);
        this.av.setVisibility(4);
        this.h.setVisibility(4);
    }

    private void l() {
        c(false);
        if (nzc.a(this.k) == 264) {
            this.h.setText(getString(R.string.ie_device_connected_hint));
            this.h.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "sendSportTypeToRower intent is null");
            return;
        }
        String stringExtra = intent.getStringExtra("PAYLOAD_FROM_NFC");
        if (TextUtils.isEmpty(stringExtra)) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "sendSportTypeToRower payload is null");
            return;
        }
        String strE = etn.e("stype", stringExtra);
        if ("290".equals(strE)) {
            nxs.d().d(21, new int[]{1});
        } else if (!"291".equals(strE)) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "modeType is other type ");
        } else {
            nxs.d().d(21, new int[]{2});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void at() {
        if (this.v.c() && !this.an) {
            ReleaseLogUtil.d("IDEQ_IndoorEquipConnectedActivity", "isFtmp but mIsReadCompleted is false");
            return;
        }
        if (this.al) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "Already START_EXERCISE");
            return;
        }
        if (!ae()) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "isSportingOrPause is not sporting or pause");
            return;
        }
        if (getIntent() != null) {
            int intExtra = getIntent().getIntExtra("KEY_INTENT_COURSE_ENTRANCE", 0);
            String stringExtra = getIntent().getStringExtra("KEY_INTENT_EQUIPMENT_TYPE");
            if (intExtra == 1) {
                LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "start jumpToLongCoach! equipmentType is ", stringExtra);
                if (HealthDevice.HealthDeviceKind.HDK_EXERCISE_BIKE.name().equals(stringExtra)) {
                    nxs.d().b(true);
                }
                ((PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class)).jumpToLongCoach(this.j, intExtra);
                LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "start jumpToLongCoach exit");
            } else {
                au();
            }
            this.y.a(true);
            this.y.c(System.currentTimeMillis());
            this.ad = true;
            this.al = true;
            if (isFinishing()) {
                return;
            }
            finish();
        }
    }

    private void au() {
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "start exercising!");
        Intent intent = new Intent();
        intent.setClass(this, TextUtils.isEmpty(this.n) ? IndoorEquipDisplayActivity.class : HeartRateControlSportActivity.class);
        SportLaunchParams sportLaunchParams = new SportLaunchParams();
        int iA = nzc.a(this.k);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("PAYLOAD_FROM_NFC");
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "start exercising!  payload = ", stringExtra);
            if (!TextUtils.isEmpty(stringExtra)) {
                sportLaunchParams.addExtra("sportMode", etn.e("stype", stringExtra));
            }
        }
        sportLaunchParams.setSportType(iA);
        sportLaunchParams.setSportTarget(this.au);
        sportLaunchParams.setTargetValue(this.aw);
        IndoorConnectViewModel indoorConnectViewModel = this.p;
        if (indoorConnectViewModel != null) {
            sportLaunchParams.addExtra("supportDataRange", indoorConnectViewModel.a());
        }
        QrCodeOrNfcInfo qrCodeOrNfcInfoE = this.v.e();
        if (qrCodeOrNfcInfoE != null) {
            sportLaunchParams.addExtra(MatterDataContans.KEY_MAC_ADDRESS, qrCodeOrNfcInfoE.getBtMac());
            sportLaunchParams.addExtra("deviceName", qrCodeOrNfcInfoE.getBtName());
        }
        sportLaunchParams.addExtra("HEART_RATE_CONTROL_COURSE_ID", this.n);
        sportLaunchParams.addExtra("isHrControlCourse", Boolean.valueOf(!TextUtils.isEmpty(this.n)));
        intent.putExtra("bundle_key_sport_launch_paras", sportLaunchParams);
        intent.putExtra("ExitApp", this.ac);
        intent.putExtra("key_is_keep_connect", this.ab);
        if (!TextUtils.isEmpty(this.n)) {
            intent.putExtra("productId", this.aq);
            intent.putExtra("deviceType", this.k);
            nzc.a(this.aq, this.n, this.k, 1);
        }
        startActivity(intent);
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "start exercising exit");
    }

    private void o() {
        Handler handler = this.ar;
        if (handler != null) {
            handler.removeMessages(1007);
        }
        if (!this.y.t()) {
            ar();
            c(getString(R.string.ie_floatview_tips_connect_failed));
        } else {
            c(getString(R.string.ie_connection_has_broken));
        }
    }

    private void c(String str) {
        c(true);
        this.i.setVisibility(0);
        this.i.setText(str);
        this.av.setVisibility(4);
        this.h.setVisibility(4);
    }

    private void b(String str) {
        this.i.setVisibility(4);
        this.h.setVisibility(4);
        qpx.e(HuaweiHealth.a(), str);
    }

    private void s() {
        c(false);
        this.av.setVisibility(4);
        this.i.setText(getString(R.string.ie_wait_delay_start));
        this.i.setVisibility(0);
        if (nzc.a(this.k) == 264) {
            this.h.setVisibility(0);
        }
        this.w.setVisibility(0);
        this.ai = true;
    }

    private void p() {
        if (this.ak) {
            return;
        }
        if (this.aj) {
            c(getString(this.ah ? R.string.IDS_nfc_close_to_tab_tips_pad : R.string.tips_when_press_nfc_button));
        } else {
            c(getString(R.string.tips_when_unsuppor_nfc));
        }
        this.w.setVisibility(4);
    }

    private void aq() {
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "====enter showTipsForEmuiTooLow()=====");
        h();
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.m;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "DialogForEmuiTooLow is showing");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(getString(this.ah ? R.string.IDS_emui_too_low_tips_pad : R.string.ie_tips_emui_too_low)).a(getString(R.string.ie_button_i_know), new View.OnClickListener() { // from class: nww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f43872c.a(view);
            }
        }).c();
        this.m = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.m.show();
        this.ad = true;
    }

    public /* synthetic */ void a(View view) {
        r();
    }

    private boolean v() {
        return this.j.getSharedPreferences("IDEQ_IndoorEquipConnectedActivity" + CommonUtil.a(getApplicationContext()), 0).getBoolean("IDEQ_IndoorEquipConnectedActivityprivacyDialogConfirm" + CommonUtil.a(getApplicationContext()), false);
    }

    private void ao() {
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "====enter showPrivacyStatementDialog()=====");
        if (v()) {
            if (!this.t.exists()) {
                w();
                return;
            } else if (this.g.isEnabled()) {
                y();
                return;
            } else {
                LogUtil.j("IDEQ_IndoorEquipConnectedActivity", "onCreate, BT is not enable");
                return;
            }
        }
        f();
        CustomTextAlertDialog customTextAlertDialog = this.ao;
        if (customTextAlertDialog != null && customTextAlertDialog.isShowing()) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "showPrivacyStatementDialog is showing");
        } else {
            d();
        }
    }

    private void d() {
        CustomTextAlertDialog customTextAlertDialogC = nzf.c(this, new View.OnClickListener() { // from class: nwq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f43868b.e(view);
            }
        }, new View.OnClickListener() { // from class: nwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f43873b.c(view);
            }
        }, new DialogInterface.OnKeyListener() { // from class: nwv
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.d.d(dialogInterface, i, keyEvent);
            }
        });
        this.ao = customTextAlertDialogC;
        customTextAlertDialogC.show();
    }

    public /* synthetic */ void e(View view) {
        w();
        SharedPreferences.Editor editorEdit = getSharedPreferences("IDEQ_IndoorEquipConnectedActivity" + CommonUtil.a(getApplicationContext()), 0).edit();
        editorEdit.putBoolean("IDEQ_IndoorEquipConnectedActivityprivacyDialogConfirm" + CommonUtil.a(getApplicationContext()), true);
        editorEdit.apply();
        nzc.b(this.j, true);
        b();
        IndoorConnectViewModel indoorConnectViewModel = this.p;
        if (indoorConnectViewModel == null || indoorConnectViewModel.getSportStatus() != 1) {
            return;
        }
        LogUtil.j("IDEQ_IndoorEquipConnectedActivity", "PrivacyDialog Positive and the device  is Sporting");
        this.aa = true;
    }

    public /* synthetic */ void c(View view) {
        nzc.b(this.j, false);
        r();
    }

    public /* synthetic */ boolean d(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0 || !this.ao.isShowing()) {
            return false;
        }
        this.ao.dismiss();
        r();
        return false;
    }

    private void b() {
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo == null) {
            LogUtil.j("IDEQ_IndoorEquipConnectedActivity", "userInfo == null");
            return;
        }
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "isUserInvalid ", Boolean.valueOf(!userInfo.isGenderValid()), Boolean.valueOf(!userInfo.isWeightValid()), Boolean.valueOf(!userInfo.isHeightValid()), Boolean.valueOf(!userInfo.isBirthdayValid()));
    }

    private void w() {
        if (this.g.isEnabled()) {
            if (!this.t.exists()) {
                LogUtil.j("IDEQ_IndoorEquipConnectedActivity", "imgFile not exist");
                DownloadUtil.a(this.d).d((Activity) this, false);
                this.s.setText(getString(R.string.IDS_getting_file));
                this.r.setVisibility(0);
                this.s.setVisibility(0);
                LogUtil.j("IDEQ_IndoorEquipConnectedActivity", "wait download finish");
                return;
            }
            LogUtil.j("IDEQ_IndoorEquipConnectedActivity", "imgFile exist");
            x();
            return;
        }
        LogUtil.j("IDEQ_IndoorEquipConnectedActivity", "onCreate, BT is not enable");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "handleDownLoadResult");
        this.am.setVisibility(8);
        initViewTahiti();
        y();
    }

    private void ar() {
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "====enter showTipsForDisconnect()=====");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.l;
        if (noTitleCustomAlertDialog != null) {
            if (noTitleCustomAlertDialog.isShowing()) {
                return;
            }
            this.l.show();
            this.ad = true;
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogE = nzf.e(this, this.ah, new View.OnClickListener() { // from class: nws
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(view);
            }
        });
        this.l = noTitleCustomAlertDialogE;
        if (noTitleCustomAlertDialogE != null) {
            noTitleCustomAlertDialogE.show();
        }
        this.ad = true;
    }

    public /* synthetic */ void d(View view) {
        r();
    }

    private void e(String str) {
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "====enter showTipsForTooShortOrPostWorkout()=====");
        g();
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.q;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "TipsForTooShortOneButton is showing");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(str).a(getString(R.string.ie_button_i_know), new View.OnClickListener() { // from class: nwr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f43869a.i(view);
            }
        }).c();
        this.q = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.q.show();
        this.ad = true;
    }

    public /* synthetic */ void i(View view) {
        r();
    }

    private void j() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.l;
        if (noTitleCustomAlertDialog == null || !noTitleCustomAlertDialog.isShowing()) {
            return;
        }
        LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "mDialogForDisconnect is showing, dismiss it now");
        this.l.dismiss();
        this.ad = false;
    }

    private void j(int i) {
        Handler handler = this.ar;
        if (handler != null) {
            handler.sendEmptyMessage(i);
        }
    }

    private void g() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.l;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.l.dismiss();
            this.ad = false;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog2 = this.m;
        if (noTitleCustomAlertDialog2 == null || !noTitleCustomAlertDialog2.isShowing()) {
            return;
        }
        this.m.dismiss();
        this.ad = false;
    }

    private void h() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.q;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.q.dismiss();
            this.ad = false;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog2 = this.l;
        if (noTitleCustomAlertDialog2 == null || !noTitleCustomAlertDialog2.isShowing()) {
            return;
        }
        this.l.dismiss();
        this.ad = false;
    }

    private void f() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.q;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.q.dismiss();
            this.q = null;
            this.ad = false;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog2 = this.l;
        if (noTitleCustomAlertDialog2 != null && noTitleCustomAlertDialog2.isShowing()) {
            this.l.dismiss();
            this.l = null;
            this.ad = false;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog3 = this.m;
        if (noTitleCustomAlertDialog3 == null || !noTitleCustomAlertDialog3.isShowing()) {
            return;
        }
        this.m.dismiss();
        this.m = null;
        this.ad = false;
    }

    private void as() {
        String quantityString;
        long jCurrentTimeMillis = System.currentTimeMillis();
        IndoorEquipConnectedManager indoorEquipConnectedManager = this.v;
        double dB = (jCurrentTimeMillis - (indoorEquipConnectedManager == null ? 0L : indoorEquipConnectedManager.b())) / 1000.0f;
        if (dB >= 3.0d) {
            quantityString = getString(R.string.ie_device_connected_hint);
        } else if (dB >= 0.1d) {
            quantityString = getResources().getQuantityString(R.plurals.ie_device_connect_cost_string, (int) Math.floor(dB), Double.valueOf(dB));
        } else {
            quantityString = getResources().getQuantityString(R.plurals.ie_device_connect_cost_string, 0, Double.valueOf(0.1d));
        }
        this.h.setText(quantityString);
        this.h.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.y.s()) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "finishActivity, service is running, stop it");
            this.y.b(true);
        }
        n();
    }

    private void b(boolean z, boolean z2) {
        String strA = nzc.a(this.k, z, z2);
        this.x = strA;
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.x);
        this.e = bitmapDecodeFile;
        this.u.setImageBitmap(bitmapDecodeFile);
    }

    private void c(boolean z) {
        this.ag = z;
        initViewTahiti();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
        al();
        boolean zAf = qrs.af(getApplicationContext());
        if (this.t.exists() && this.t.length() > 0) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "onConfigurationChanged isTahitiModel: ", Boolean.valueOf(zAf));
            if (CommonUtil.bg()) {
                b(zAf, this.ag);
                return;
            } else {
                b(false, this.ag);
                return;
            }
        }
        if (zAf) {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "is TahitiModel default");
            this.u.setImageResource(R.drawable.img_tahiti_connecting);
        } else {
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "not TahitiModel default");
            this.u.setImageResource(R.drawable.img_connecting);
        }
    }

    private void al() {
        if (this.u.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.u.getLayoutParams();
            if (qrs.c((Activity) this)) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                layoutParams.width = (int) (displayMetrics.widthPixels * 0.8f);
                layoutParams.height = -2;
                layoutParams.gravity = 1;
            } else {
                layoutParams.width = -1;
                layoutParams.height = -2;
            }
            this.u.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (CommonUtil.bg()) {
            if (nzc.a(this.k) == 264) {
                this.i.setText(this.ah ? R.string.IDS_treadmill_connect_hint_pad : R.string.ie_treadmill_connected_hint2);
            } else {
                this.i.setText(R.string.ie_connected_success);
            }
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(4);
        }
        b(this.av);
        this.av.setVisibility(0);
    }

    private void b(HealthTextView healthTextView) {
        float fMeasureText;
        if (nzc.a(this.k) == 264) {
            healthTextView.setText(getString(R.string.ie_start_run_hint));
            fMeasureText = healthTextView.getPaint().measureText(getString(R.string.ie_start_run_hint));
        } else {
            healthTextView.setText(getString(R.string.ie_tips_start_exercise));
            fMeasureText = healthTextView.getPaint().measureText(getString(R.string.ie_tips_start_exercise));
        }
        int i = (int) ((getResources().getDisplayMetrics().widthPixels * 2) / 3.0f);
        if (fMeasureText >= i) {
            healthTextView.setWidth(i);
        }
    }

    private void t() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("PAYLOAD_FROM_NFC");
            if (!TextUtils.isEmpty(stringExtra)) {
                LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "payload is not empty");
                this.k = nzc.c(stringExtra);
            } else {
                this.k = intent.getStringExtra("DEVICE_TYPE_INDEX");
            }
            if (TextUtils.isEmpty(this.k)) {
                this.k = "31";
                LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "mDeviceType is empty, set default");
            }
            this.n = intent.getStringExtra("courseId");
            this.aq = intent.getStringExtra("productId");
            this.au = intent.getIntExtra(WorkoutRecord.Extend.COURSE_TARGET_TYPE, -1);
            float floatExtra = intent.getFloatExtra(WorkoutRecord.Extend.COURSE_TARGET_VALUE, 0.0f);
            this.aw = floatExtra;
            LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "mCourseId is ", this.n, "mTargetType is ", Integer.valueOf(this.au), ", mTargetValue is ", Float.valueOf(floatExtra));
            this.ab = nxs.d().h();
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemClock.sleep(2000L);
            Context context = IndoorEquipConnectedActivity.this.j;
            String str = "IndoorEquipServiceRunning" + CommonUtil.a(IndoorEquipConnectedActivity.this.j);
            Context unused = IndoorEquipConnectedActivity.this.j;
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            if (sharedPreferences != null) {
                if (!sharedPreferences.getBoolean("IsIndoorEquipServiceRunning" + CommonUtil.a(IndoorEquipConnectedActivity.this.j), false) || SystemClock.elapsedRealtime() - sharedPreferences.getLong("elapsedRealtime", 0L) >= ProfileExtendConstants.TIME_OUT || SystemClock.elapsedRealtime() - sharedPreferences.getLong("elapsedRealtime", 0L) <= 0) {
                    LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "inDelayRestartRunnable, isIndoorEquipSerRealRunning:", false);
                    return;
                }
                LogUtil.a("IDEQ_IndoorEquipConnectedActivity", "inDelayRestartRunnable, isIndoorEquipSerRealRunning:", true);
            }
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setClass(IndoorEquipConnectedActivity.this.getApplication(), IndoorEquipConnectedActivity.class);
            IndoorEquipConnectedActivity.this.getApplication().startActivity(intent);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
