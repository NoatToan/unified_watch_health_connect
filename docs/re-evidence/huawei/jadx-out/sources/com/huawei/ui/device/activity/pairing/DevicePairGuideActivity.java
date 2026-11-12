package com.huawei.ui.device.activity.pairing;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.clockwork.companion.partnerapi.SmartWatchInfo;
import com.huawei.callback.DeviceStatusCallback;
import com.huawei.datatype.DeviceStatusParam;
import com.huawei.datatype.GoogleDeviceCache;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IAddDeviceStateAIDLCallback;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity;
import com.huawei.ui.device.interactors.CompatibilityInteractor;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.interactors.NotificationPushInteractor;
import defpackage.edl;
import defpackage.eel;
import defpackage.fks;
import defpackage.lmf;
import defpackage.loj;
import defpackage.lsy;
import defpackage.ltd;
import defpackage.lvb;
import defpackage.lvi;
import defpackage.lvk;
import defpackage.mgh;
import defpackage.qpx;
import defpackage.qql;
import defpackage.qrs;
import defpackage.qtk;
import defpackage.qyz;
import defpackage.qzd;
import defpackage.rcv;
import defpackage.rcw;
import defpackage.rcy;
import defpackage.rdj;
import defpackage.rdp;
import defpackage.rdt;
import defpackage.res;
import defpackage.xjt;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IllegalFormatConversionException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class DevicePairGuideActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f24606a;
    public CompatibilityInteractor aa;
    public ImageView ab;
    public LinearLayout ac;
    public HealthTextView ad;
    public CustomTitleBar ae;
    public edl ag;
    public DeviceInfo ah;
    public String ai;
    public String aj;
    public RelativeLayout ak;
    public rcv al;
    public RelativeLayout am;
    public HealthScrollView an;
    public DeviceSettingsInteractors ao;
    public int aq;
    public HealthButton as;
    public HealthProgressBar at;
    public HealthColumnLinearLayout au;
    public HealthColumnLinearLayout av;
    public HealthTextView aw;
    public HealthButton ax;
    public HealthButton ay;
    protected boolean az;
    public LinearLayout ba;
    public qyz bc;
    public boolean bd;
    public boolean be;
    public boolean bf;
    public boolean bg;
    public boolean bi;
    public ImageView bn;
    public String bo;
    public String bp;
    public LinearLayout br;
    public HealthTextView bs;
    public ImageView bt;
    public HealthTextView bv;
    public HealthTextView bw;
    public LinearLayout bx;
    public HealthTextView by;
    public LinearLayout bz;
    public int ca;
    public ImageView cb;
    public LinearLayout cc;
    public HealthTextView cd;
    public HealthTextView ce;
    public ImageView cf;
    public LinearLayout cg;
    public HealthTextView ch;
    public HealthTextView ci;
    public HealthTextView cj;
    public HealthTextView ck;
    public HealthTextView cl;
    public RelativeLayout cm;
    public RelativeLayout cn;
    public RelativeLayout co;
    public RelativeLayout cp;
    public HealthTextView cq;
    public HealthTextView cr;
    public RelativeLayout cs;
    public HealthTextView ct;
    public LinearLayout cu;
    public LinearLayout cv;
    public RelativeLayout cw;
    public ImageView cx;
    public HealthTextView cy;
    public ImageView cz;
    public AnimationDrawable d;
    public RelativeLayout da;
    public HealthTextView db;
    public HealthTextView dc;
    protected String de;
    public HealthTextView df;
    public HealthButton dg;
    public int dh;
    public LinearLayout di;
    public HealthTextView dj;
    public HealthTextView dk;
    public HealthButton dl;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public String f3do;
    public HealthTextView dp;
    public HealthTextView dq;
    public HealthTextView ds;
    public HealthCheckBox dt;
    public LinearLayout du;
    private CustomPermissionAction dz;
    public boolean e;
    private Context ea;
    private d eb;
    private NotificationPushInteractor eh;
    private boolean ei;
    private boolean ej;
    private g ek;
    public HealthCheckBox f;
    public HealthTextView g;
    public HealthCheckBox h;
    public LinearLayout i;
    public LinearLayout j;
    public ImageView k;
    public ImageView l;
    public HealthTextView m;
    public RelativeLayout n;
    public AnimationDrawable p;
    public AnimationDrawable q;
    public RelativeLayout r;
    public HealthTextView s;
    public AnimationDrawable t;
    public HealthButton u;
    public HealthColumnLinearLayout v;
    public HealthButton w;
    public HealthButton x;
    public LinearLayout y;
    private static final String[] dr = {"android.permission.READ_PHONE_STATE"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f24605c = false;
    public String dm = "";
    public boolean bj = false;
    public boolean bl = false;
    public Handler bb = new h(this);
    public CustomAlertDialog z = null;
    public DeviceCapability af = null;
    public boolean bh = false;
    public DeviceCapability ap = null;
    public boolean bm = false;
    public final int[] dd = {R.string.IDS_device_paring_tip_des_info_21};
    public final int[] o = {R.string.IDS_aw_binding_tips};
    public boolean bk = false;
    public List<String> dn = new ArrayList(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24607b = true;
    public BroadcastReceiver bq = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.j("DEVMGR_DevicePairGuideActivity", "NetBroadcastReceiver intent is null");
                return;
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (!CommonUtil.ab(DevicePairGuideActivity.this.ea)) {
                    LogUtil.j("DEVMGR_DevicePairGuideActivity", "net work is error");
                } else {
                    DevicePairGuideActivity.this.bc.d(DevicePairGuideActivity.this);
                    DevicePairGuideActivity.this.ac();
                }
            }
        }
    };
    public CompoundButton.OnCheckedChangeListener bu = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.8
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "mWlanAutoDownloadCheckBox ,isChecked is ", Boolean.valueOf(z));
        }
    };
    private boolean ed = false;
    private IAddDeviceStateAIDLCallback.Stub dv = new b(this.bb);
    private boolean ef = false;
    private boolean eg = false;
    private final int[] dy = {R.string.IDS_device_pair_guide_b3_tip1_ex, R.string.IDS_device_pair_guide_b3_tip2_ex, R.string.IDS_device_pair_guide_b3_tip3};
    private final int[] dx = {R.string.IDS_device_paring_type_le_des_info_21};
    private final int[] ee = {R.string.IDS_select_device_connect_grus_change_tip_1, R.string.IDS_select_device_connect_grus_change_tip_2, R.string.IDS_device_pair_guide_b3_tip3};
    private DialogInterface.OnKeyListener eo = new DialogInterface.OnKeyListener() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.6
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            if (i2 != 4 || keyEvent.getAction() != 0 || DevicePairGuideActivity.this.z == null || !DevicePairGuideActivity.this.z.isShowing()) {
                return false;
            }
            DevicePairGuideActivity.this.z.dismiss();
            DevicePairGuideActivity.this.z = null;
            DevicePairGuideActivity.this.finish();
            return false;
        }
    };
    private final BroadcastReceiver dw = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.10
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if (DevicePairGuideActivity.this.bc != null && DevicePairGuideActivity.this.bc.h()) {
                LogUtil.j("DEVMGR_DevicePairGuideActivity", "mConnectStateChangedReceiver isShowMidWare is false");
                return;
            }
            if (DevicePairGuideActivity.this.f24607b) {
                LogUtil.j("DEVMGR_DevicePairGuideActivity", "The device is downloading resources");
                return;
            }
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "mConnectStateChangedReceiver : intent is ", intent.getAction());
            if (context != null) {
                if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    if (!DevicePairGuideActivity.this.bl) {
                        DevicePairGuideActivity.this.e(intent);
                        return;
                    } else {
                        LogUtil.a("DEVMGR_DevicePairGuideActivity", "The watch is being restored to factory.");
                        return;
                    }
                }
                if ("com.huawei.bone.action.REQUEST_BIND_DEVICE".equals(intent.getAction()) && !TextUtils.isEmpty(intent.getStringExtra("connect_status"))) {
                    DevicePairGuideActivity.this.c(intent);
                    return;
                }
                if ("com.huawei.health.action.AddDeviceStatusChanged".equals(intent.getAction())) {
                    try {
                        DevicePairGuideActivity.this.dv.onAddDeviceState(intent.getIntExtra("status", 0));
                        return;
                    } catch (RemoteException e2) {
                        LogUtil.a("DEVMGR_DevicePairGuideActivity", "mAddDeviceStateAidlCallback exception：", e2.getMessage());
                        return;
                    }
                }
                LogUtil.j("DEVMGR_DevicePairGuideActivity", "mConnectStateChangedReceiver other state");
            }
        }
    };
    protected final DeviceStatusCallback ar = new DeviceStatusCallback() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.7
        @Override // com.huawei.callback.DeviceStatusCallback
        public void onDeviceConnectedChanged(DeviceInfo deviceInfo, int i2, DeviceStatusParam deviceStatusParam) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "enter onDeviceConnectedChanged");
            if (deviceInfo == null || deviceStatusParam == null) {
                LogUtil.j("DEVMGR_DevicePairGuideActivity", "onDeviceConnectedChanged device == null");
                return;
            }
            if (DevicePairGuideActivity.this.f24607b || (DevicePairGuideActivity.this.bc != null && DevicePairGuideActivity.this.bc.h())) {
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "The device is downloading resources or is midware");
                return;
            }
            if (DevicePairGuideActivity.this.bl) {
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "The watch is being restored to factory.");
                return;
            }
            if (!deviceStatusParam.isDeviceConnectDirectly()) {
                if (!DevicePairGuideActivity.this.ef) {
                    DevicePairGuideActivity.this.e(deviceInfo, deviceStatusParam.getErrorCode());
                    return;
                } else {
                    LogUtil.j("DEVMGR_DevicePairGuideActivity", "this call back device is pair success");
                    return;
                }
            }
            LogUtil.j("DEVMGR_DevicePairGuideActivity", "dealStateChange isDeviceConnectDirectly is true.");
            DevicePairGuideActivity.this.n();
        }
    };
    private final BroadcastReceiver ec = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.14
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"broadcast_receiver_user_setting".equals(intent.getAction())) {
                return;
            }
            int intExtra = intent.getIntExtra("error_code", 0);
            if (DevicePairGuideActivity.this.bc == null) {
                LogUtil.j("DEVMGR_DevicePairGuideActivity", "mHelper is null");
                return;
            }
            if (intExtra == 100000) {
                DevicePairGuideActivity.this.bc.q();
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "on Receive showPair Success Result");
                return;
            }
            xjt.aj("oobe error");
            DevicePairGuideActivity.this.bc.b(0, intExtra);
            if (intExtra == -1) {
                DevicePairGuideActivity.this.ej = true;
            }
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "on Receive showPair failure Result", Integer.valueOf(intExtra));
            if (TextUtils.isEmpty(DevicePairGuideActivity.this.dm)) {
                LogUtil.j("DEVMGR_DevicePairGuideActivity", "mTempMac is empty");
                return;
            }
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(DevicePairGuideActivity.this.dm);
            DevicePairGuideActivity.this.al.b((List<String>) arrayList, true);
        }
    };

    static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<DevicePairGuideActivity> f24617b;
        private Map<String, Object> e;

        public a(DevicePairGuideActivity devicePairGuideActivity, Map<String, Object> map) {
            this.f24617b = new WeakReference<>(devicePairGuideActivity);
            this.e = map;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            DevicePairGuideActivity devicePairGuideActivity;
            if (i != 0 || obj == null || (devicePairGuideActivity = this.f24617b.get()) == null || devicePairGuideActivity.isFinishing()) {
                return;
            }
            rdt.e(this.e, devicePairGuideActivity.ca);
            if (devicePairGuideActivity.bc != null) {
                rdt.a(devicePairGuideActivity.bf);
            }
        }
    }

    static class h extends Handler {
        WeakReference<DevicePairGuideActivity> d;

        h(DevicePairGuideActivity devicePairGuideActivity) {
            this.d = new WeakReference<>(devicePairGuideActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            DevicePairGuideActivity devicePairGuideActivity = this.d.get();
            if (devicePairGuideActivity == null || message == null) {
                LogUtil.j("DEVMGR_DevicePairGuideActivity", "handleMessage activity or msg is null.");
                return;
            }
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "Enter handleMessage(): ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 0) {
                devicePairGuideActivity.bc.t();
                return;
            }
            if (i == 1) {
                e(message, devicePairGuideActivity);
                return;
            }
            if (i == 2) {
                removeMessages(12);
                removeMessages(16);
                if (devicePairGuideActivity.bc != null) {
                    devicePairGuideActivity.bc.q();
                    return;
                }
                return;
            }
            if (i == 3) {
                a(message, devicePairGuideActivity);
                return;
            }
            if (i == 4) {
                devicePairGuideActivity.a(false);
                return;
            }
            if (i == 5) {
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "MSG_ENABLE_RIGHT_BTN");
                devicePairGuideActivity.e(true);
                return;
            }
            if (i == 7) {
                a(devicePairGuideActivity);
                return;
            }
            if (i == 8) {
                devicePairGuideActivity.c(message.arg1);
                return;
            }
            if (i == 14) {
                qtk.e(devicePairGuideActivity.ea, devicePairGuideActivity);
            } else if (i == 15) {
                d(devicePairGuideActivity);
            } else {
                c(message);
            }
        }

        private void d(DevicePairGuideActivity devicePairGuideActivity) {
            if (devicePairGuideActivity.bc != null) {
                LogUtil.j("DEVMGR_DevicePairGuideActivity", "MemberAndViewHelper: Entering");
                devicePairGuideActivity.bc.c(devicePairGuideActivity);
            }
        }

        private void a(DevicePairGuideActivity devicePairGuideActivity) {
            removeMessages(12);
            removeMessages(16);
            if (devicePairGuideActivity.bc != null) {
                devicePairGuideActivity.bc.b(1, 1001002);
            }
        }

        private void a(Message message, DevicePairGuideActivity devicePairGuideActivity) {
            removeMessages(12);
            removeMessages(16);
            int i = message.arg1;
            if (devicePairGuideActivity.bc != null) {
                devicePairGuideActivity.bc.b(0, i);
            }
        }

        private void e(Message message, DevicePairGuideActivity devicePairGuideActivity) {
            devicePairGuideActivity.w();
            if (devicePairGuideActivity.bc == null) {
                LogUtil.j("DEVMGR_DevicePairGuideActivity", "helper is null.");
            } else {
                devicePairGuideActivity.bc.e(message);
            }
        }

        private void c(Message message) {
            DevicePairGuideActivity devicePairGuideActivity = this.d.get();
            int i = message.what;
            if (i != 16) {
                switch (i) {
                    case 9:
                        devicePairGuideActivity.aa.b("getDeviceList");
                        devicePairGuideActivity.aa.b("unbindDevicesByTypes");
                        devicePairGuideActivity.aa.b("getWearData");
                        devicePairGuideActivity.b(false);
                        break;
                    case 10:
                        devicePairGuideActivity.a(true);
                        break;
                    case 11:
                        devicePairGuideActivity.d();
                        break;
                    case 12:
                        ReleaseLogUtil.e("DEVMGR_DevicePairGuideActivity", "pair device time out");
                        xjt.l("pair device time out");
                        if (devicePairGuideActivity.bc != null) {
                            devicePairGuideActivity.bc.b(0, 1000000);
                        }
                        break;
                    case 13:
                        if (devicePairGuideActivity.bc != null && (message.obj instanceof Boolean)) {
                            Boolean bool = (Boolean) message.obj;
                            boolean zBooleanValue = bool.booleanValue();
                            LogUtil.a("DEVMGR_DevicePairGuideActivity", "MemberAndViewHelper.MSG_CONNECT_SCAN_BLUETOOTH isOpenTestButton:", bool);
                            devicePairGuideActivity.bc.a(zBooleanValue);
                            break;
                        }
                        break;
                    default:
                        LogUtil.j("DEVMGR_DevicePairGuideActivity", "no support message: ", Integer.valueOf(message.what));
                        break;
                }
                return;
            }
            ReleaseLogUtil.e("DEVMGR_DevicePairGuideActivity", "pair device phone permission not allow");
            xjt.l("pair device phone permission not allow");
            if (devicePairGuideActivity.bc != null) {
                devicePairGuideActivity.bc.b(0, 16);
            }
        }
    }

    private void q() {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "Enter registerPairBroadcast");
        try {
            BroadcastManagerUtil.c(this, this.ec, new IntentFilter("broadcast_receiver_user_setting"), LocalBroadcast.f36595c, null);
        } catch (IllegalStateException unused) {
            LogUtil.e("DEVMGR_DevicePairGuideActivity", "registerPairBroadcast IllegalStateException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Intent intent) {
        ReleaseLogUtil.d("DEVMGR_DevicePairGuideActivity", "enter dealInitiatedConnectionState");
        if (this.ef) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "dealInitiatedConnectionState pair success done");
            return;
        }
        String stringExtra = intent.getStringExtra("deviceName");
        if (TextUtils.isEmpty(this.f3do) || !this.f3do.equals(stringExtra)) {
            LogUtil.j("DEVMGR_DevicePairGuideActivity", "dealInitiatedConnectionState mSelectDeviceName:", this.f3do);
            return;
        }
        if (this.ad == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        HealthColumnLinearLayout healthColumnLinearLayout = this.v;
        if (healthColumnLinearLayout != null) {
            healthColumnLinearLayout.setVisibility(0);
        }
        LinearLayout linearLayout = this.ac;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        try {
            this.ad.setText(String.format(Locale.ENGLISH, this.ea.getString(R.string.IDS_blite_guide_paire_current_device), stringExtra));
            this.ad.setVisibility(0);
        } catch (IllegalFormatConversionException unused) {
            LogUtil.e("DEVMGR_DevicePairGuideActivity", "string format is exception");
        }
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "dealInitiatedConnectionState deviceName:", stringExtra);
    }

    private boolean e(Parcelable parcelable) {
        if (parcelable == null) {
            return false;
        }
        if (!(parcelable instanceof DeviceInfo)) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "! parcelableExtra instanceof DeviceInfo ");
            return false;
        }
        if (!this.ef) {
            return true;
        }
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "pair success done ");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Intent intent) {
        if (intent.getBooleanExtra("isDeviceConnectDirectly", false)) {
            LogUtil.j("DEVMGR_DevicePairGuideActivity", "dealStateChange isDeviceConnectDirectly is true.");
            n();
            return;
        }
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
            if (e(parcelableExtra)) {
                e((DeviceInfo) parcelableExtra, intent.getIntExtra("connect_error_code", 0));
            }
        } catch (ClassCastException unused) {
            LogUtil.e("DEVMGR_DevicePairGuideActivity", "dealStateChange ClassCastException");
        } catch (Exception unused2) {
            LogUtil.e("DEVMGR_DevicePairGuideActivity", "dealStateChange Exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceInfo deviceInfo, int i2) {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "deviceInfo.getDeviceFactoryReset():", Integer.valueOf(deviceInfo.getDeviceFactoryReset()));
        if (deviceInfo.getProductType() != -1) {
            if (10 != deviceInfo.getProductType() && (TextUtils.isEmpty(this.ai) || !this.ai.equals(deviceInfo.getDeviceIdentify()))) {
                LogUtil.j("DEVMGR_DevicePairGuideActivity", "This device does not have the correspond capability");
                return;
            }
            if (!CommonUtil.bu() && !CommonUtil.ca() && this.aq != deviceInfo.getProductType()) {
                LogUtil.j("DEVMGR_DevicePairGuideActivity", "mDeviceProductType is ", Integer.valueOf(this.aq), "getProductType() is : ", Integer.valueOf(deviceInfo.getProductType()), "getDeviceName is ", deviceInfo.getDeviceName());
                Context context = this.f24606a;
                qpx.b(context, context.getResources().getString(R.string.IDS_device_type_error));
            }
        }
        if (this.bf) {
            this.dm = this.ai;
        }
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "mDeviceProductType is ", Integer.valueOf(this.aq), "getProductType() is : ", Integer.valueOf(deviceInfo.getProductType()));
        ReleaseLogUtil.d("DEVMGR_DevicePairGuideActivity", "dealStateChange deviceName :", CommonUtil.n(deviceInfo.getDeviceName()), "state : ", Integer.valueOf(deviceConnectState), " errorCode:" + i2);
        d dVar = this.eb;
        if (dVar != null) {
            ReleaseLogUtil.d("DEVMGR_DevicePairGuideActivity", "dealStateChange ConnectTimeoutHandler connectState:", Integer.valueOf(deviceConnectState));
            if (deviceConnectState != 1) {
                return;
            }
            dVar.e();
            this.eb = null;
        }
        e(deviceConnectState, i2, deviceInfo);
    }

    private void e(int i2, int i3, DeviceInfo deviceInfo) {
        Handler handler;
        qyz qyzVar = this.bc;
        if (qyzVar == null || (handler = this.bb) == null) {
            LogUtil.j("DEVMGR_DevicePairGuideActivity", "parseConnectState mHelper or mHandler is null");
            return;
        }
        switch (i2) {
            case 1:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                qyzVar.c(deviceInfo);
                break;
            case 2:
                c(deviceInfo);
                break;
            case 3:
                AgreementDeclarationActivity.d = false;
                a(deviceInfo, i3);
                break;
            case 4:
                a(deviceInfo, i3, i2);
                break;
            case 5:
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "mConnectStateChangedReceiver : state is ", Integer.valueOf(i2));
                this.bb.sendEmptyMessage(5);
                this.bb.sendEmptyMessage(7);
                this.dm = "";
                break;
            case 6:
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "mConnectStateChangedReceiver : DEVICE_WORK_MODE_CONFLICT is ", Integer.valueOf(i2));
                Message messageObtainMessage = this.bb.obtainMessage();
                messageObtainMessage.what = 3;
                messageObtainMessage.arg1 = 6;
                this.bb.sendMessage(messageObtainMessage);
                this.dm = "";
                break;
            case 7:
            case 8:
            default:
                LogUtil.j("DEVMGR_DevicePairGuideActivity", "unknown connectState : ", Integer.valueOf(i2));
                break;
            case 12:
                e(deviceInfo);
                break;
            case 15:
                handler.removeMessages(12);
                this.bc.a(deviceInfo, 600000);
                a(deviceInfo);
                break;
        }
    }

    private void a(DeviceInfo deviceInfo) {
        this.ah = deviceInfo;
        mgh.a(this);
    }

    private void e(DeviceInfo deviceInfo) {
        this.bc.a(deviceInfo);
        this.bc.e(this);
    }

    private void c(DeviceInfo deviceInfo) {
        if (!CompileParameterUtil.c("IS_SUPPORT_NEW_ADD_MODE", false) && this.aq != deviceInfo.getProductType() && !CommonUtil.bu()) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "device connect state not match wanted device");
            Context context = this.f24606a;
            qpx.b(context, context.getResources().getString(R.string.IDS_device_type_error));
        }
        if (this.ef) {
            LogUtil.j("DEVMGR_DevicePairGuideActivity", "pair success");
            return;
        }
        this.ef = true;
        this.dm = deviceInfo.getDeviceIdentify();
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "DeviceConnectState : DEVICE_CONNECTED");
        this.ah = deviceInfo;
        Message messageObtainMessage = this.bb.obtainMessage();
        messageObtainMessage.what = 2;
        messageObtainMessage.obj = deviceInfo;
        this.bb.sendMessage(messageObtainMessage);
        this.bb.sendEmptyMessage(5);
    }

    private void a(DeviceInfo deviceInfo, int i2) {
        if (rcv.a(this.aq) != deviceInfo.getDeviceBluetoothType() && deviceInfo.getDeviceBluetoothType() != -1) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "receive connect disconnect: device protocal is not equal");
            return;
        }
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "DEVICE_DISCONNECTED ,mac is ", BTDeviceMgrUtil.c().e(deviceInfo.getDeviceIdentify()), ",mTempMac:", BTDeviceMgrUtil.c().e(this.dm));
        this.bb.sendEmptyMessage(5);
        if (deviceInfo.getProductType() == 10 && this.aq == 10) {
            Message messageObtainMessage = this.bb.obtainMessage();
            messageObtainMessage.what = 3;
            messageObtainMessage.arg1 = i2;
            this.bb.sendMessage(messageObtainMessage);
            return;
        }
        if (this.ej && this.dm.equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
            ReleaseLogUtil.d("DEVMGR_DevicePairGuideActivity", "oobe time out do not fresh msg");
            return;
        }
        if (this.dm.equalsIgnoreCase(deviceInfo.getDeviceIdentify()) && !this.ed) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "discovery and scan msg");
            Message messageObtainMessage2 = this.bb.obtainMessage();
            messageObtainMessage2.what = 3;
            messageObtainMessage2.arg1 = i2;
            this.bb.sendMessage(messageObtainMessage2);
            this.dm = "";
            return;
        }
        if (this.ed) {
            this.ed = false;
        }
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "state is DeviceConnectState.DEVICE_DISCONNECTED");
    }

    private void a(DeviceInfo deviceInfo, int i2, int i3) {
        if (rcv.a(this.aq) != deviceInfo.getDeviceBluetoothType() && deviceInfo.getDeviceBluetoothType() != -1) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "receive connect failed: device protocal is not equal");
            return;
        }
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "mConnectStateChangedReceiver : state is ", Integer.valueOf(i3), ",mTempMac:", BTDeviceMgrUtil.c().e(this.dm));
        if (!TextUtils.isEmpty(deviceInfo.getDeviceIdentify()) && !deviceInfo.getDeviceIdentify().equals(this.dm)) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "not the current device state, ignore");
        } else {
            d(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i2) {
        this.bb.sendEmptyMessage(5);
        Message messageObtainMessage = this.bb.obtainMessage();
        messageObtainMessage.what = 3;
        messageObtainMessage.arg1 = i2;
        this.bb.sendMessage(messageObtainMessage);
        this.dm = "";
    }

    static class g extends BaseHandler<DevicePairGuideActivity> {
        g(Looper looper, DevicePairGuideActivity devicePairGuideActivity) {
            super(looper, devicePairGuideActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(DevicePairGuideActivity devicePairGuideActivity, Message message) {
            int i = message.what;
            if (i == 100) {
                ((IBaseResponseCallback) message.obj).a(-1, "getbinddevice from timmeout");
            } else {
                if (i == 101) {
                    if (message.obj instanceof IBaseResponseCallback) {
                        ((IBaseResponseCallback) message.obj).a(0, true);
                        return;
                    }
                    return;
                }
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "no support msg : ", Integer.valueOf(message.what));
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "Enter onCreate():");
        super.onCreate(bundle);
        qyz qyzVar = new qyz();
        this.bc = qyzVar;
        qyzVar.a(this);
        this.ea = BaseApplication.getContext();
        this.f24606a = this;
        this.ek = new g(Looper.getMainLooper(), this);
        this.al = rcv.a(BaseApplication.getContext());
        r();
        lvk.b("DEVMGR_DevicePairGuideActivity", this.ar);
        q();
        t();
        int i2 = this.aq;
        int i3 = this.dh;
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "onCreate mDeviceProductType is ", Integer.valueOf(i2), ", mSaveDeviceProductType is ", Integer.valueOf(i3), ", mDeviceProductName is ", this.aj, ", mIsPairSuccessFlag is ", Boolean.valueOf(this.be), ", mName is ", this.bo, ", mPin is ", this.de, ", mIsCloudDevice ", Boolean.valueOf(this.az), ", mIsFromNearDiscovery is", Boolean.valueOf(this.bg));
        setContentView(R.layout.activity_device_pairing_guide_black);
        if (this.bf) {
            this.f3do = this.bo;
        }
        this.eh = new NotificationPushInteractor(this.ea);
        this.bc.j();
        this.bc.i();
        this.bc.g();
        BaseActivity.cancelLayoutById(this.cw, this.y);
    }

    private void t() {
        if (getIntent() != null) {
            int intExtra = getIntent().getIntExtra("pairGuideProductType", -1);
            this.aq = intExtra;
            this.dh = intExtra;
            this.aj = getIntent().getStringExtra("pairGuideProductName");
            this.be = getIntent().getBooleanExtra("pairGuideW1Success", false);
            this.bf = getIntent().getBooleanExtra("pairGuideFromScanList", false);
            this.bg = getIntent().getBooleanExtra("pairGuideFromNearDiscovery", false);
            this.bi = getIntent().getBooleanExtra("IS_PROC", false);
            this.bo = getIntent().getStringExtra("pairGuideSelectName");
            this.de = getIntent().getStringExtra("pairGuideProductPin");
            this.ai = getIntent().getStringExtra("pairGuideSelectAddress");
            f();
            this.bd = getIntent().getBooleanExtra("DOWNLOAD_RESOURCE", false);
            this.az = getIntent().getBooleanExtra("cloudDevicePair", false);
            this.bp = getIntent().getStringExtra("kind_id");
            try {
                this.dn = getIntent().getStringArrayListExtra(BasePairManagerJsApi.UUID_LIST);
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.e("DEVMGR_DevicePairGuideActivity", "ArrayIndexOutOfBoundsException get uuid list");
            }
            this.ei = getIntent().getIntExtra("isHeartRateDevice", 0) == 1;
            int intExtra2 = getIntent().getIntExtra("pairGuideDeviceMode", 0);
            this.ca = intExtra2;
            rdt.b(intExtra2, this.bo);
            return;
        }
        LogUtil.j("DEVMGR_DevicePairGuideActivity", "initListView() intent is null");
    }

    public void e() {
        if (lvi.n(this.aq)) {
            this.ag = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(this.aq));
        }
    }

    private void f() {
        if (this.bf) {
            List<DeviceInfo> listB = rcv.a(BaseApplication.getContext()).b();
            if (listB == null || listB.size() == 0) {
                LogUtil.j("DEVMGR_DevicePairGuideActivity", "dealIsConnectedAgainPair connectedDeviceList is null or size is 0");
                return;
            }
            for (DeviceInfo deviceInfo : listB) {
                int deviceConnectState = deviceInfo.getDeviceConnectState();
                LogUtil.d("DEVMGR_DevicePairGuideActivity", "dealIsConnectedAgainPair connectState: ", Integer.valueOf(deviceConnectState), " deviceInfo.getDeviceIdentify(): ", CommonUtil.n(deviceInfo.getDeviceIdentify()), " mDeviceAddress", CommonUtil.n(this.ai));
                if (deviceInfo.getDeviceConnectState() == 2 && deviceInfo.getDeviceIdentify().equals(this.ai)) {
                    this.ed = true;
                    return;
                }
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        Context context;
        RelativeLayout relativeLayout = this.cw;
        if (relativeLayout == null || (context = this.ea) == null) {
            return;
        }
        relativeLayout.setPadding((int) context.getResources().getDimension(R.dimen.maxPaddingEnd), 0, (int) this.ea.getResources().getDimension(R.dimen.maxPaddingEnd), 0);
    }

    static class i implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<DevicePairGuideActivity> f24626c;

        i(DevicePairGuideActivity devicePairGuideActivity) {
            this.f24626c = new WeakReference<>(devicePairGuideActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(final int i, final Object obj) {
            final DevicePairGuideActivity devicePairGuideActivity = this.f24626c.get();
            if (devicePairGuideActivity == null) {
                return;
            }
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "WearBindCallBack isHuaweiWearBinded errCode:", Integer.valueOf(i), " objData:", obj);
            devicePairGuideActivity.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.i.2
                @Override // java.lang.Runnable
                public void run() {
                    if (i != 0) {
                        devicePairGuideActivity.b(false);
                        return;
                    }
                    CompatibilityInteractor.WearDeviceState wearDeviceState = (CompatibilityInteractor.WearDeviceState) obj;
                    LogUtil.a("DEVMGR_DevicePairGuideActivity", "WearBindCallBack state:", wearDeviceState);
                    if (wearDeviceState == CompatibilityInteractor.WearDeviceState.NO_BIND_DEVICE) {
                        devicePairGuideActivity.b(false);
                    } else {
                        LogUtil.a("DEVMGR_DevicePairGuideActivity", "WearBindCallBack isHuaweiWearBinded Enter else");
                        devicePairGuideActivity.x();
                    }
                }
            });
        }
    }

    public void b() {
        this.bh = this.eh.b();
    }

    public void d() {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "Enter checkCompatibility");
        this.aa.a(this.ek, this.aq, new i(this));
    }

    public void j() {
        d dVar = new d(this);
        this.eb = dVar;
        dVar.b();
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<DevicePairGuideActivity> f24621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f24622c = new Runnable() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.d.5
            @Override // java.lang.Runnable
            public void run() {
                DevicePairGuideActivity devicePairGuideActivity = (DevicePairGuideActivity) d.this.f24621b.get();
                if (devicePairGuideActivity != null) {
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(d.this.f24620a);
                    devicePairGuideActivity.al.b((List<String>) arrayList, true);
                    ReleaseLogUtil.d("DEVMGR_DevicePairGuideActivity", "ConnectTimeoutHandler timeoutRunnable unPair");
                    devicePairGuideActivity.d(-1);
                }
            }
        };

        public d(DevicePairGuideActivity devicePairGuideActivity) {
            this.f24621b = new WeakReference<>(devicePairGuideActivity);
            this.f24620a = devicePairGuideActivity.ai;
        }

        public void b() {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "ConnectTimeoutHandler startCheck");
            DevicePairGuideActivity devicePairGuideActivity = this.f24621b.get();
            if (devicePairGuideActivity != null) {
                devicePairGuideActivity.bb.postDelayed(this.f24622c, 60000L);
            }
        }

        public void e() {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "ConnectTimeoutHandler stopCheck");
            DevicePairGuideActivity devicePairGuideActivity = this.f24621b.get();
            if (devicePairGuideActivity != null) {
                devicePairGuideActivity.bb.removeCallbacks(this.f24622c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        int iA = rcv.a(rcv.b(this.bo));
        String str = this.bo;
        int iB = rcv.b(str);
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "AddDevice, device.Type is ", Integer.valueOf(iA), ", mName is ", str, "deviceType is", Integer.valueOf(iB), "mDeviceAddress is", BTDeviceMgrUtil.c().e(this.ai));
        a(this.al.b(), rcy.e(this.aq), true);
        rcw.b(this.ea).g(this.ai);
    }

    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<DevicePairGuideActivity> f24619c;

        c(DevicePairGuideActivity devicePairGuideActivity) {
            this.f24619c = new WeakReference<>(devicePairGuideActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            DevicePairGuideActivity devicePairGuideActivity = this.f24619c.get();
            if (devicePairGuideActivity == null) {
                return;
            }
            if (i == 0 && "SURE".equals(obj)) {
                CommonUtil.aj(BaseApplication.getContext());
            }
            LogUtil.e("DEVMGR_DevicePairGuideActivity", "Enter showDialogToMigrate finish");
            devicePairGuideActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        LogUtil.e("DEVMGR_DevicePairGuideActivity", "Enter showLowVersionDialog");
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.13
            @Override // java.lang.Runnable
            public void run() {
                List<DeviceInfo> listG = fks.d().g();
                if (listG == null || listG.size() <= 0 || !CompatibilityInteractor.c(BaseApplication.getContext())) {
                    DevicePairGuideActivity.this.b(false);
                    return;
                }
                if (!DevicePairGuideActivity.this.aa.c(listG)) {
                    DevicePairGuideActivity.this.b(false);
                } else if (DevicePairGuideActivity.this.aa.d(listG) == null) {
                    DevicePairGuideActivity.this.b(false);
                } else {
                    DevicePairGuideActivity.this.aa.b(DevicePairGuideActivity.this.f24606a, null, new c(DevicePairGuideActivity.this));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (this.aa.a(BaseApplication.getContext())) {
            h();
        } else if (CompatibilityInteractor.c(BaseApplication.getContext())) {
            y();
        } else {
            b(false);
        }
    }

    public static class f implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<DevicePairGuideActivity> f24625b;

        public f(DevicePairGuideActivity devicePairGuideActivity) {
            this.f24625b = null;
            this.f24625b = new WeakReference<>(devicePairGuideActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            DevicePairGuideActivity devicePairGuideActivity = this.f24625b.get();
            if (devicePairGuideActivity == null) {
                return;
            }
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "unbindDeviceList Enter callback errCode:", Integer.valueOf(i));
            devicePairGuideActivity.bb.removeMessages(9);
            devicePairGuideActivity.b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final List<DeviceInfo> list) {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "Enter showunBindDialog");
        this.bb.post(new Runnable() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.11
            @Override // java.lang.Runnable
            public void run() {
                List list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    LogUtil.a("DEVMGR_DevicePairGuideActivity", "showDialogToMigrate deviceInfoList is null ");
                    DevicePairGuideActivity.this.bb.sendEmptyMessage(4);
                    return;
                }
                String string = BaseApplication.getContext().getResources().getString(R.string.IDS_compatibility_note_unbind_new_2);
                String string2 = BaseApplication.getContext().getResources().getString(R.string.IDS_app_name);
                StringBuilder sb = new StringBuilder(16);
                sb.append(String.format(Locale.ENGLISH, string, string2));
                for (DeviceInfo deviceInfo : list) {
                    if (deviceInfo != null && lvi.h(deviceInfo.getProductType())) {
                        sb.append(qyz.f46978a);
                        sb.append(deviceInfo.getDeviceName());
                    }
                }
                View viewInflate = LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.dialog_migrate_low_version, (ViewGroup) null);
                ((HealthCheckBox) viewInflate.findViewById(R.id.compatibility_remind)).setVisibility(8);
                ((HealthTextView) viewInflate.findViewById(R.id.compatibility_content)).setText(sb.toString());
                if (DevicePairGuideActivity.this.bc != null) {
                    CustomAlertDialog.Builder builderE = DevicePairGuideActivity.this.bc.e();
                    if (builderE == null) {
                        LogUtil.j("DEVMGR_DevicePairGuideActivity", "showDialogToMigrate builder is null");
                        return;
                    }
                    builderE.a(viewInflate);
                    if (DevicePairGuideActivity.this.z == null || !DevicePairGuideActivity.this.z.isShowing()) {
                        DevicePairGuideActivity.this.z = builderE.b();
                        DevicePairGuideActivity.this.z.setCanceledOnTouchOutside(false);
                        DevicePairGuideActivity.this.z.setCancelable(false);
                        DevicePairGuideActivity.this.z.show();
                        DevicePairGuideActivity.this.z.setOnKeyListener(DevicePairGuideActivity.this.eo);
                        return;
                    }
                    return;
                }
                LogUtil.j("DEVMGR_DevicePairGuideActivity", "showUnBindDialog mHelper is null");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtil.d("DEVMGR_DevicePairGuideActivity", "enter checkWearAppBindDeviceList method");
        lsy.a(new Runnable() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.12
            @Override // java.lang.Runnable
            public void run() {
                List<DeviceInfo> listI = DevicePairGuideActivity.this.al.i();
                if (listI != null && !listI.isEmpty()) {
                    LogUtil.a("DEVMGR_DevicePairGuideActivity", "migrateWearDeviceList health has device");
                    DevicePairGuideActivity.this.bb.sendEmptyMessage(4);
                } else {
                    DevicePairGuideActivity.this.al.b(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.12.5
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i2, Object obj) {
                            LogUtil.a("DEVMGR_DevicePairGuideActivity", "checkWearAppBindDeviceList errorCode：", Integer.valueOf(i2));
                            if (i2 == 0 && (obj instanceof List)) {
                                DevicePairGuideActivity.this.a((List<DeviceInfo>) obj);
                            } else {
                                DevicePairGuideActivity.this.bb.sendEmptyMessage(4);
                            }
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (this.bf) {
            this.bb.sendEmptyMessage(1);
            if (z) {
                this.bb.sendEmptyMessageDelayed(10, 2000L);
                return;
            } else {
                a(true);
                return;
            }
        }
        this.bb.sendEmptyMessage(0);
    }

    static class e implements IBaseResponseCallback {
        WeakReference<DevicePairGuideActivity> e;

        e(DevicePairGuideActivity devicePairGuideActivity) {
            this.e = null;
            this.e = new WeakReference<>(devicePairGuideActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(final int i, final Object obj) {
            final DevicePairGuideActivity devicePairGuideActivity = this.e.get();
            if (devicePairGuideActivity == null) {
                return;
            }
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "ClickWearBindCallBack isHuaweiWearBinded errCode:", Integer.valueOf(i), " objData:", obj);
            devicePairGuideActivity.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.e.4
                @Override // java.lang.Runnable
                public void run() {
                    if (i == 0) {
                        CompatibilityInteractor.WearDeviceState wearDeviceState = (CompatibilityInteractor.WearDeviceState) obj;
                        LogUtil.a("DEVMGR_DevicePairGuideActivity", "ClickWearBindCallBack state:", wearDeviceState);
                        if (wearDeviceState == CompatibilityInteractor.WearDeviceState.NO_BIND_DEVICE) {
                            devicePairGuideActivity.bb.sendEmptyMessage(4);
                            return;
                        }
                        LogUtil.a("DEVMGR_DevicePairGuideActivity", "ClickWearBindCallBack isHuaweiWearBinded Enter else.");
                        if (devicePairGuideActivity.aa.a(BaseApplication.getContext())) {
                            devicePairGuideActivity.h();
                            return;
                        } else if (CompatibilityInteractor.c(BaseApplication.getContext())) {
                            devicePairGuideActivity.y();
                            return;
                        } else {
                            devicePairGuideActivity.bb.sendEmptyMessage(4);
                            return;
                        }
                    }
                    devicePairGuideActivity.bb.sendEmptyMessage(4);
                }
            });
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        qyz qyzVar;
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "Enter onClick():");
        int id = view.getId();
        if (id == R.id.pair_guide_left_cancel_layout) {
            g();
            return;
        }
        if (id == R.id.pair_guide_right_btn_layout) {
            k();
            if (!CompileParameterUtil.c("IS_SUPPORT_NEW_ADD_MODE", false) || (qyzVar = this.bc) == null) {
                return;
            }
            qyzVar.s();
            return;
        }
        if (id == R.id.cancel_button) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "R.id.cancel_button enter");
            i();
        } else {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "unknown view : ", Integer.valueOf(view.getId()));
        }
    }

    private void g() {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "onClick():cancel");
        if (!qrs.r()) {
            qyz qyzVar = this.bc;
            if (qyzVar != null) {
                qyzVar.r();
            }
            c();
            finish();
            return;
        }
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "click too fast");
    }

    private void k() {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "onClick():btn right");
        if (!qrs.r()) {
            int i2 = this.aq;
            if ((i2 == 32 || i2 == 10) && this.dk.getText().toString().equalsIgnoreCase(this.ea.getResources().getString(R.string.IDS_device_fragment_pairing_btn_open_android_wear))) {
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "onClick():btn_right, W1 guide.");
                z();
                return;
            }
            if (this.dk.getText().toString().equalsIgnoreCase(this.ea.getResources().getString(R.string.IDS_sns_compelete).toUpperCase(Locale.ENGLISH)) || this.dk.getText().toString().equalsIgnoreCase(this.ea.getResources().getString(R.string.IDS_startup_next).toUpperCase(Locale.ENGLISH))) {
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "mConnectStateChangedReceiver(): setResult is ", 2);
                a();
                Intent intent = new Intent();
                intent.putExtra("device_id", this.dm);
                intent.putExtra("product_type", this.aq);
                setResult(2, intent);
                String strE = SharedPreferenceManager.e(this.ea, String.valueOf(10008), "first_pair_success_status");
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "onClick() value is ", strE);
                if (!"true".equals(strE)) {
                    SharedPreferenceManager.e(this.ea, String.valueOf(10008), "first_pair_success_status", "true", null);
                }
                m();
                finish();
                return;
            }
            this.aa.a(this.ek, this.aq, new e(this));
            return;
        }
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "click too fast");
    }

    private void m() {
        Intent intent = new Intent();
        intent.setPackage(this.ea.getPackageName());
        intent.setClassName(this, "com.huawei.ui.homewear21.home.WearHomeActivity");
        intent.putExtra("device_id", this.dm);
        startActivity(intent);
    }

    private void i() {
        if (this.e) {
            this.bc.d();
            return;
        }
        e(4, 1);
        if (TextUtils.isEmpty(this.dm) && !TextUtils.isEmpty(this.ai)) {
            LogUtil.j("DEVMGR_DevicePairGuideActivity", "mTempMac is empty");
            this.dm = this.ai;
        }
        if (TextUtils.isEmpty(this.dm)) {
            return;
        }
        ReleaseLogUtil.d("DEVMGR_DevicePairGuideActivity", "mTempMac is not empty.");
        xjt.l("user cancel pair device");
        c();
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(this.dm);
        this.al.b((List<String>) arrayList, true);
        finish();
    }

    public void a() {
        HashMap map = new HashMap(16);
        map.put("devicename", lvi.e(this.aq, this.bo, this.bi));
        if (this.aa.a(BaseApplication.getContext())) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "migrate_success");
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "getMessageCenterFromWear begin ", strE);
            if (!"true".equals(strE)) {
                lsy.a(new Runnable() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.3
                    @Override // java.lang.Runnable
                    public void run() {
                        StorageParams storageParams = new StorageParams(0);
                        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "migrate_wear_time", "" + System.currentTimeMillis(), storageParams);
                        fks.d().e(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.3.2
                            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                            /* JADX INFO: renamed from: onResponse */
                            public void a(int i2, Object obj) {
                                LogUtil.a("DEVMGR_DevicePairGuideActivity", "getMessageCenterFromWear response");
                            }
                        });
                    }
                });
            }
        } else {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "getMessageCenterFromWear enter else:", SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "migrate_success"));
        }
        new rdj().a(this.dm, BaseApplication.getContext(), new a(this, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        ReleaseLogUtil.d("DEVMGR_DevicePairGuideActivity", "enter startAddDevice():");
        this.ej = false;
        e(false);
        List<DeviceInfo> listB = this.al.b();
        int i2 = this.aq;
        if (i2 == 11) {
            ArrayList<String> arrayList = new ArrayList<>(16);
            if ("HUAWEI CM-R1P".equals(this.bo) || this.ea.getString(R.string.IDS_huawei_r1_pro_content).equals(this.bo) || this.ea.getString(R.string.IDS_device_r1_pro_name_title).equals(this.bo)) {
                arrayList.add("HUAWEI CM-R1P");
            } else {
                arrayList.add("HUAWEI AM-R1");
            }
            a(listB, arrayList, false);
            return;
        }
        a(listB, rcy.e(i2), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z) {
        this.eg = z;
        this.dz = new CustomPermissionAction(this.ea) { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.4
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                DevicePairGuideActivity.f24605c = true;
                if (z) {
                    DevicePairGuideActivity.this.aa();
                } else {
                    DevicePairGuideActivity.this.v();
                }
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                super.onDenied(str);
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "requestPermissions Permission onDenied");
                DevicePairGuideActivity.this.e(5, 1);
                xjt.l("requestPermissions Permission onDenied");
                DevicePairGuideActivity.this.bb.sendEmptyMessage(16);
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "requestPermissions Permission onForeverDenied");
                DevicePairGuideActivity.this.e(5, 3);
                xjt.l("requestPermissions Permission onForeverDenied");
                DevicePairGuideActivity.this.bb.sendEmptyMessage(16);
                DevicePairGuideActivity.this.u();
            }
        };
        PermissionUtil.d(this, PermissionUtil.PermissionType.PHONE_STATE, this.dz);
    }

    public void e(int i2, int i3) {
        HashMap map = new HashMap(16);
        map.put("Result", 2);
        map.put("deviceType", "HDK_WEAR");
        map.put("Action", Integer.valueOf(i3));
        map.put("Page", Integer.valueOf(i2));
        map.put("deviceName", this.bo);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.UNAUTHORIZED_DEVICE_PAIRING_FAILURE.value(), map, 0);
    }

    private void a(List<DeviceInfo> list, ArrayList<String> arrayList, boolean z) {
        String str;
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "addDeviceForConnectedAndDisconnected isFromAutoFind is ", Boolean.valueOf(z));
        this.ef = false;
        if (TextUtils.isEmpty(this.ai)) {
            str = null;
        } else {
            str = this.ai;
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "addDeviceForConnectedAndDisconnected macAddress ", BTDeviceMgrUtil.c().e(str));
        }
        qzd.c(this.ea).e(this.dv);
        if (rdp.d(this.aq) || list == null || list.isEmpty()) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "connectedDeviceInfo is null");
            DeviceParameter deviceParameterO = o();
            deviceParameterO.setNameFilter(arrayList);
            deviceParameterO.setMac(str);
            this.al.a(deviceParameterO, "", this.dv);
            return;
        }
        if (list.size() == 1) {
            c(list, arrayList, str);
        } else {
            e(list, arrayList, str);
        }
    }

    private void e(List<DeviceInfo> list, ArrayList<String> arrayList, String str) {
        if (eel.d(this.aq)) {
            for (DeviceInfo deviceInfo : list) {
                if (eel.d(deviceInfo.getProductType())) {
                    LogUtil.a("DEVMGR_DevicePairGuideActivity", "startAddDevice has one connected aw70 device and want another aw70 device");
                    DeviceParameter deviceParameterO = o();
                    deviceParameterO.setNameFilter(arrayList);
                    deviceParameterO.setMac(str);
                    this.al.a(deviceParameterO, deviceInfo.getDeviceIdentify(), this.dv);
                    return;
                }
            }
            return;
        }
        for (DeviceInfo deviceInfo2 : list) {
            if (!eel.d(deviceInfo2.getProductType(), deviceInfo2.getAutoDetectSwitchStatus())) {
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "startAddDevice has one connected device is other device");
                DeviceParameter deviceParameterO2 = o();
                deviceParameterO2.setNameFilter(arrayList);
                deviceParameterO2.setMac(str);
                this.al.a(deviceParameterO2, deviceInfo2.getDeviceIdentify(), this.dv);
                return;
            }
        }
    }

    private void c(List<DeviceInfo> list, ArrayList<String> arrayList, String str) {
        DeviceInfo deviceInfo = list.get(0);
        boolean zD = eel.d(this.aq);
        boolean zD2 = eel.d(deviceInfo.getProductType());
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        DeviceParameter deviceParameterO = o();
        deviceParameterO.setNameFilter(arrayList);
        deviceParameterO.setMac(str);
        if (!zD2) {
            if (zD) {
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "startAddDevice has one connected other device and want another aw70 device");
                this.al.a(deviceParameterO, "", this.dv);
                return;
            } else {
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "startAddDevice has one connected other device and want another other device");
                this.al.a(deviceParameterO, deviceIdentify, this.dv);
                return;
            }
        }
        if (zD2 && deviceInfo.getAutoDetectSwitchStatus() == 1) {
            if (zD) {
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "startAddDevice has one connected aw70 device in run mode and want another aw70 device");
                this.al.a(deviceParameterO, deviceIdentify, this.dv);
                return;
            } else {
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "startAddDevice has one connected aw70 device in run mode and want another other device");
                this.al.a(deviceParameterO, "", this.dv);
                return;
            }
        }
        if (zD2 && deviceInfo.getAutoDetectSwitchStatus() == 0) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "startAddDevice has one connected aw70 device and want another other device/aw70 device");
            this.al.a(deviceParameterO, deviceIdentify, this.dv);
        } else {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "startAddDevice other condition");
        }
    }

    private void z() {
        PackageInfo packageInfo;
        PackageManager packageManager = this.ea.getPackageManager();
        try {
            packageInfo = packageManager.getPackageInfo("com.google.android.wearable.app.cn", 0);
        } catch (PackageManager.NameNotFoundException e2) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "onClick() androidWearNameCn, error is ", e2.getMessage());
            try {
                packageInfo = packageManager.getPackageInfo("com.google.android.wearable.app", 0);
            } catch (PackageManager.NameNotFoundException e3) {
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "onClick() androidWearName, error is ", e3.getMessage());
                if (CommonUtil.ab(this.ea)) {
                    if (loj.c(55)) {
                        LogUtil.a("DEVMGR_DevicePairGuideActivity", "Enter gotoChinese ");
                        b((Context) this);
                    } else {
                        Context context = this.ea;
                        qpx.b(context, context.getString(R.string.IDS_device_hauwei_watch_download_android_wear_tips));
                    }
                } else {
                    Context context2 = this.ea;
                    qpx.b(context2, context2.getString(R.string.CS_network_connect_error));
                }
                packageInfo = null;
            }
        }
        if (packageInfo == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(packageInfo.packageName);
        ResolveInfo next = this.ea.getPackageManager().queryIntentActivities(intent, 0).iterator().next();
        if (next != null) {
            String str = next.activityInfo.packageName;
            String str2 = next.activityInfo.name;
            Intent intent2 = new Intent("android.intent.action.MAIN");
            intent2.addCategory("android.intent.category.LAUNCHER");
            intent2.setComponent(new ComponentName(str, str2));
            startActivity(intent2);
        }
    }

    private void b(Context context) {
        LogUtil.e("DEVMGR_DevicePairGuideActivity", "enterHuaweiAppStore():");
        if (!CommonUtil.ab(this.ea)) {
            LogUtil.e("DEVMGR_DevicePairGuideActivity", "Network is not Connected!");
            qpx.b(context, R.string.CS_network_connect_error);
        } else {
            lsy.a(new Runnable() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.5
                @Override // java.lang.Runnable
                public void run() {
                    DevicePairGuideActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.5.4
                        @Override // java.lang.Runnable
                        public void run() {
                            boolean zL = DevicePairGuideActivity.this.l();
                            LogUtil.a("DEVMGR_DevicePairGuideActivity", "isInstallFlag is ", Boolean.valueOf(zL));
                            if (zL) {
                                LogUtil.a("DEVMGR_DevicePairGuideActivity", "openOemAppstore not install.");
                            } else {
                                qpx.b(DevicePairGuideActivity.this.ea, DevicePairGuideActivity.this.ea.getString(R.string.IDS_device_hauwei_watch_download_android_wear_tips));
                            }
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this);
        builder.e(this.ea.getString(com.huawei.ui.commonui.R.string.IDS_hwh_home_other_permissions_title)).a(this.ea.getString(R.string.IDS_hwh_home_other_permissions_content)).b(this.ea.getString(R.string.IDS_main_btn_state_settings).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qrs.al(DevicePairGuideActivity.this);
            }
        }).a(this.ea.getString(R.string.IDS_hw_health_show_common_dialog_cancle_button).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("DEVMGR_DevicePairGuideActivity", "handlePermission negative.");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCanceledOnTouchOutside(false);
        customTextAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", " enter openOemAppstore()");
        if (!CommonUtil.b(this.ea)) {
            return false;
        }
        try {
            Intent intent = new Intent("com.huawei.appmarket.intent.action.AppDetail");
            intent.setPackage("com.huawei.appmarket");
            intent.addFlags(268435456);
            intent.putExtra("APP_PACKAGENAME", "com.google.android.wearable.app.cn");
            PackageManager packageManager = getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo activityInfoResolveActivityInfo = intent.resolveActivityInfo(packageManager, 65536);
            if (activityInfoResolveActivityInfo == null || !activityInfoResolveActivityInfo.exported) {
                return true;
            }
            qrs.c(intent, activityInfoResolveActivityInfo.packageName, this.ea, getString(R.string.IDS_tip_permission_setting));
            return true;
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("DEVMGR_DevicePairGuideActivity", "Exception localActivityNotFoundException is ", e2.getMessage());
            return false;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "Enter onActivityResult()");
        super.onActivityResult(i2, i3, intent);
        qyz qyzVar = this.bc;
        if (qyzVar != null) {
            qyzVar.a(i2, i3, intent);
        }
    }

    static class b extends IAddDeviceStateAIDLCallback.Stub {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f24618c;

        b(Handler handler) {
            this.f24618c = handler;
        }

        @Override // com.huawei.hwservicesmgr.IAddDeviceStateAIDLCallback
        public void onAddDeviceState(int i) throws RemoteException {
            Handler handler = this.f24618c;
            if (handler == null) {
                return;
            }
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = 8;
            messageObtainMessage.arg1 = i;
            this.f24618c.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2) {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "deviceStateChanged(): state:", Integer.valueOf(i2));
        if (i2 == 1) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "mAddDeviceStateAidlCallback(): user open swtich");
            this.bb.sendEmptyMessage(5);
            int i3 = this.aq;
            if (i3 == 32 || i3 == 10) {
                finish();
            }
        } else if (i2 == 2) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "mAddDeviceStateAidlCallback(): open switch fail");
            Message messageObtainMessage = this.bb.obtainMessage();
            messageObtainMessage.what = 3;
            messageObtainMessage.arg1 = 0;
            this.bb.sendMessage(messageObtainMessage);
        } else if (i2 == 3) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "mAddDeviceStateAidlCallback(): cancel swtich open");
        } else if (i2 == 5) {
            try {
                SmartWatchInfo smartWatchInfoD = lvb.e().d();
                if (smartWatchInfoD != null) {
                    LogUtil.a("DEVMGR_DevicePairGuideActivity", "getPendingPairingSmartWatchInfo cacherssi:", Integer.valueOf(smartWatchInfoD.getRssiValue()));
                    GoogleDeviceCache.QrBleCache qrBleCache = new GoogleDeviceCache.QrBleCache();
                    qrBleCache.setBluetoothDevice(smartWatchInfoD.getBluetoothDevice());
                    qrBleCache.setRssi(smartWatchInfoD.getRssiValue());
                    qrBleCache.setTime(smartWatchInfoD.getTimeStampMs());
                    GoogleDeviceCache.getInstance().saveCache(qrBleCache);
                } else {
                    LogUtil.a("DEVMGR_DevicePairGuideActivity", "get smart watch info failed");
                }
            } catch (RemoteException e2) {
                LogUtil.e("DEVMGR_DevicePairGuideActivity", "get smart watch info error, msg:", e2.getMessage());
            }
            qql.a(this);
        } else {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "no support state : :", Integer.valueOf(i2));
        }
        if (i2 == 4) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "AddDeviceState.DEVICE_BT_ENABLE_SCAN MSG_ENABLE_RIGHT_BTN");
            this.bb.sendEmptyMessage(5);
        }
    }

    private void r() {
        try {
            IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
            intentFilter.setPriority(800);
            intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("com.huawei.bone.action.REQUEST_BIND_DEVICE");
            intentFilter.addAction("com.huawei.health.action.AddDeviceStatusChanged");
            BroadcastManagerUtil.c(this, this.dw, intentFilter, LocalBroadcast.f36595c, null);
        } catch (IllegalStateException unused) {
            LogUtil.e("DEVMGR_DevicePairGuideActivity", "registerConnectStateBroadcast IllegalStateException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "enter showPairProcess()");
        this.bj = true;
        this.cb.setVisibility(8);
        this.bt.setVisibility(8);
        this.am.setVisibility(8);
        this.y.setVisibility(8);
        this.da.setVisibility(0);
        this.ak.setVisibility(0);
        this.cf.setVisibility(0);
        this.cr.setVisibility(8);
        this.df.setVisibility(8);
        this.du.setVisibility(8);
        this.i.setVisibility(8);
        this.cx.setVisibility(8);
        if (eel.d(this.aq)) {
            this.s.setVisibility(0);
        } else {
            this.s.setVisibility(8);
            this.dc.setVisibility(8);
            this.dc.setText(this.ea.getString(R.string.IDS_blite_guide_paire_opt_title));
        }
        this.ds.setVisibility(8);
        a(this.aq);
        if (eel.d(this.aq)) {
            return;
        }
        this.d.start();
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "showPairProcess start anim.");
    }

    private void a(int i2) {
        if (i2 != 1) {
            if (i2 != 21) {
                if (i2 != 7) {
                    if (i2 != 8) {
                        if (i2 != 18 && i2 != 19 && i2 != 44 && i2 != 45) {
                            switch (i2) {
                                case 12:
                                case 13:
                                case 15:
                                    break;
                                case 14:
                                    break;
                                default:
                                    e(i2);
                                    break;
                            }
                            return;
                        }
                        p();
                        return;
                    }
                }
            }
            s();
            return;
        }
        this.dc.setVisibility(0);
        this.cz.setImageResource(R.drawable.icon_hand_pair);
    }

    private void e(int i2) {
        if (i2 != 10) {
            if (i2 == 11) {
                this.dc.setVisibility(0);
                this.cz.setImageResource(R.drawable.icon_head_setpair);
                return;
            }
            if (i2 == 23) {
                qyz qyzVar = this.bc;
                if (qyzVar != null) {
                    qyzVar.m();
                    return;
                }
                return;
            }
            if (i2 == 24) {
                qyz qyzVar2 = this.bc;
                if (qyzVar2 != null) {
                    qyzVar2.o();
                    return;
                }
                return;
            }
            if (i2 != 32) {
                if (i2 == 36) {
                    qyz qyzVar3 = this.bc;
                    if (qyzVar3 != null) {
                        qyzVar3.k();
                        return;
                    }
                    return;
                }
                if (i2 == 37) {
                    qyz qyzVar4 = this.bc;
                    if (qyzVar4 != null) {
                        qyzVar4.l();
                        return;
                    }
                    return;
                }
                qyz qyzVar5 = this.bc;
                if (qyzVar5 != null) {
                    qyzVar5.c(i2);
                    return;
                }
                return;
            }
        }
        this.dc.setVisibility(0);
        this.cz.setImageResource(R.drawable.icon_watch_pair);
        this.cc.setVisibility(8);
    }

    private void p() {
        this.cz.setImageResource(R.drawable.icon_hand_pair);
        this.cr.setVisibility(8);
        String string = this.ea.getString(this.dd[0], this.aj);
        this.dc.setVisibility(0);
        this.dc.setText(string);
    }

    private void s() {
        this.cz.setImageResource(R.drawable.icon_watch_pair);
        this.cr.setVisibility(8);
        String string = this.ea.getString(this.dd[0], this.aj);
        this.dc.setVisibility(0);
        this.dc.setText(string);
    }

    private void ab() {
        try {
            unregisterReceiver(this.dw);
            unregisterReceiver(this.ec);
            ac();
        } catch (IllegalArgumentException e2) {
            LogUtil.a("DEVMGR_DevicePairGuideActivity", e2.getMessage());
        } catch (IllegalStateException unused) {
            LogUtil.e("DEVMGR_DevicePairGuideActivity", "unregisterBroadcast IllegalStateException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        try {
            BroadcastReceiver broadcastReceiver = this.bq;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.e("DEVMGR_DevicePairGuideActivity", "unregisterBroadcastReceiver is error");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "Enter onStart():");
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "Enter onRestart():");
        super.onRestart();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "Enter onResume():");
        e(true);
        super.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "Enter onPause():");
        super.onPause();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "Enter onStop():");
        super.onStop();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "Enter onDestroy():");
        super.onDestroy();
        f24605c = false;
        AgreementDeclarationActivity.d = false;
        this.bj = false;
        d dVar = this.eb;
        if (dVar != null) {
            dVar.e();
        }
        lvk.c("DEVMGR_DevicePairGuideActivity");
        ab();
        this.aa.b("getDeviceList");
        this.aa.b("unbindDevicesByTypes");
        this.aa.b("getWearData");
        Handler handler = this.bb;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        qyz qyzVar = this.bc;
        if (qyzVar != null) {
            qyzVar.r();
            this.bc.b();
            this.bc.c();
            this.bc = null;
        }
        this.be = false;
        this.bl = false;
        ltd.e().d(this.dz);
        this.dz = null;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4 && this.bj) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "Enter onBackPressed():");
        qyz qyzVar = this.bc;
        if (qyzVar != null) {
            qyzVar.r();
        }
        c();
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "enter isEnableScanButton isEnable:", Boolean.valueOf(z));
        this.cc.setEnabled(z);
    }

    private DeviceParameter o() {
        DeviceParameter deviceParameter = new DeviceParameter();
        deviceParameter.setBluetoothType(rcv.a(this.aq));
        deviceParameter.setProductType(this.aq);
        deviceParameter.setDeviceNameInfo(this.bo);
        deviceParameter.setIsSupportHeartRate(this.ei);
        deviceParameter.setProductPin(this.de);
        int i2 = this.aq;
        LogUtil.a("DEVMGR_DevicePairGuideActivity", "getAddDeviceParametere mDeviceProductType: ", Integer.valueOf(i2), " DeviceInfoManager.isDeviceBand(mDeviceProductType): ", Boolean.valueOf(lvi.f(i2)), " mIsOnlyShowHeartRate: ", Boolean.valueOf(this.ei));
        deviceParameter.setIsBand(lvi.f(this.aq));
        return deviceParameter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        HealthColumnLinearLayout healthColumnLinearLayout = this.v;
        if (healthColumnLinearLayout != null) {
            healthColumnLinearLayout.setVisibility(8);
        }
        LinearLayout linearLayout = this.ac;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public void c() {
        if (this.az) {
            int i2 = this.aq;
            LogUtil.a("DEVMGR_DevicePairGuideActivity", "mDeviceProductType:", Integer.valueOf(i2), "mName:", this.bo);
            if (TextUtils.isEmpty(this.bo)) {
                rdt.d(100116, "2");
            }
            res.d().b(this.aq, this.bo);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
