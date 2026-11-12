package com.huawei.ui.homehealth.devicemanagercard;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btcommon.BluetoothSwitchStateUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity;
import com.huawei.ui.device.activity.pairing.DevicePairGuideUtil;
import com.huawei.ui.device.utlis.BluetoothPermisionUtils;
import com.huawei.ui.device.views.animation.ActivityAnimationCallback;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.callback.ReconnectCallback;
import com.huawei.ui.homehealth.view.CloudReconnectFailDialog;
import defpackage.dxx;
import defpackage.edl;
import defpackage.eel;
import defpackage.eem;
import defpackage.eep;
import defpackage.lmf;
import defpackage.lon;
import defpackage.lvb;
import defpackage.lvi;
import defpackage.lvl;
import defpackage.lwo;
import defpackage.maq;
import defpackage.meo;
import defpackage.mgg;
import defpackage.mgh;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qtv;
import defpackage.rct;
import defpackage.rcv;
import defpackage.rcw;
import defpackage.rdp;
import defpackage.rdt;
import defpackage.res;
import defpackage.rfi;
import defpackage.rfn;
import defpackage.rfp;
import defpackage.rtk;
import defpackage.tfi;
import defpackage.tfn;
import defpackage.tqp;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class OldDeviceManagerWearNoConnect extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f25400a;
    private HealthProgressBar aa;
    private LinearLayout ac;
    private NoTitleCustomAlertDialog ad;
    private LinearLayout ah;
    private Rect ai;
    private HealthTextView aj;
    private PopViewList al;
    private HealthButton an;
    private rfn d;
    private Context f;
    private BluetoothSwitchStateUtil g;
    private HealthButton h;
    private ImageView k;
    private DeviceInfo l;
    private HealthTextView m;
    private CustomTitleBar n;
    private LinearLayout o;
    private RelativeLayout q;
    private HealthTextView r;
    private boolean v;
    private int y;
    private HealthTextView z;
    private String w = "";
    private String s = "";
    private String t = "";
    private int p = 0;
    private boolean x = false;
    private int af = 0;
    private Handler u = new c(this);
    private NoTitleCustomAlertDialog i = null;
    private CustomTextAlertDialog ag = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomTextAlertDialog f25402c = null;
    private boolean ab = false;
    private String e = "";
    private final BroadcastReceiver ae = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.devicemanagercard.OldDeviceManagerWearNoConnect.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("DeviceManagerWearNoConnect", "mNonLocalBroadcastReceiver(): intent is null");
                return;
            }
            LogUtil.a("DeviceManagerWearNoConnect", "mNonLocalBroadcastReceiver(): intent :", intent.getAction());
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || "com.huawei.health.action.CLOUD_CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                OldDeviceManagerWearNoConnect.this.d(intent);
                return;
            }
            if ("broadcast_receiver_user_setting".equals(intent.getAction())) {
                LogUtil.a("DeviceManagerWearNoConnect", "mNonLocalBroadcastReceiver() device Pair failed");
                OldDeviceManagerWearNoConnect.this.ab = false;
                OldDeviceManagerWearNoConnect.this.u.removeMessages(101);
                Message messageObtainMessage = OldDeviceManagerWearNoConnect.this.u.obtainMessage();
                messageObtainMessage.what = 101;
                OldDeviceManagerWearNoConnect.this.u.sendMessage(messageObtainMessage);
                OldDeviceManagerWearNoConnect.this.d(intent.getStringExtra("pairGuideSelectAddress"));
                return;
            }
            LogUtil.a("DeviceManagerWearNoConnect", "onReceive Action else branch");
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ActivityAnimationCallback f25401b = new ActivityAnimationCallback() { // from class: com.huawei.ui.homehealth.devicemanagercard.OldDeviceManagerWearNoConnect.2
        @Override // com.huawei.ui.device.views.animation.ActivityAnimationCallback
        public void onProcessExit(boolean z) {
            LogUtil.a("DeviceManagerWearNoConnect", "mActivityAnimationCallback onProcessExit:", Boolean.valueOf(z));
            if (z) {
                OldDeviceManagerWearNoConnect.this.overridePendingTransition(R.anim.activity_no_animation, R.anim.activity_no_animation);
                OldDeviceManagerWearNoConnect oldDeviceManagerWearNoConnect = OldDeviceManagerWearNoConnect.this;
                oldDeviceManagerWearNoConnect.moveTaskToBack(oldDeviceManagerWearNoConnect.v);
            }
            OldDeviceManagerWearNoConnect.this.finishAndRemoveTask();
        }
    };
    private final BtSwitchStateCallback j = new BtSwitchStateCallback() { // from class: com.huawei.ui.homehealth.devicemanagercard.OldDeviceManagerWearNoConnect.1
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
        public void onBtSwitchStateCallback(int i) {
            if (OldDeviceManagerWearNoConnect.this.g == null) {
                return;
            }
            OldDeviceManagerWearNoConnect.this.g.d(OldDeviceManagerWearNoConnect.this.j);
            LogUtil.a("DeviceManagerWearNoConnect", "onBtSwitchStateCallback bluetoothSwitchState:", Integer.valueOf(i));
            if (i == 3) {
                OldDeviceManagerWearNoConnect.this.q();
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent) {
        Parcelable parcelableExtra;
        String str;
        String str2;
        try {
            try {
                parcelableExtra = intent.getParcelableExtra("deviceinfo");
            } catch (BadParcelableException unused) {
                LogUtil.e("DeviceManagerWearNoConnect", "dealDeviceConnectState BadParcelableException");
                parcelableExtra = null;
            }
            if (!(parcelableExtra instanceof DeviceInfo)) {
                LogUtil.j("DeviceManagerWearNoConnect", "mNonLocalBroadcastReceiver objectData is null or not deviceInfo");
                return;
            }
            DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
            Message messageObtainMessage = this.u.obtainMessage();
            messageObtainMessage.obj = deviceInfo.getDeviceIdentify();
            LogUtil.a("DeviceManagerWearNoConnect", "dealDeviceConnectState connect status: ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
            if ((!this.x || (str2 = this.s) == null || !str2.equals(deviceInfo.getDeviceName())) && ((str = this.w) == null || !str.equals(messageObtainMessage.obj))) {
                LogUtil.j("DeviceManagerWearNoConnect", "other device state changed");
                return;
            }
            b(deviceInfo, messageObtainMessage);
        } catch (ClassCastException unused2) {
            LogUtil.e("DeviceManagerWearNoConnect", "DeviceInfo deviceInfo error ClassCastException");
        }
    }

    private void b(DeviceInfo deviceInfo, Message message) {
        switch (deviceInfo.getDeviceConnectState()) {
            case 1:
            case 9:
            case 10:
            case 13:
                LogUtil.a("DeviceManagerWearNoConnect", "mNonLocalBroadcastReceiver() DEVICE_CONNECTING");
                message.what = 1;
                message.arg1 = deviceInfo.getDeviceConnectState();
                this.u.sendMessage(message);
                break;
            case 2:
                message.what = 102;
                this.u.sendMessage(message);
                this.ab = false;
                LogUtil.a("DeviceManagerWearNoConnect", "device_connected");
                break;
            case 3:
                this.ab = false;
                message.what = 104;
                this.u.sendMessage(message);
                break;
            case 4:
                this.ab = false;
                break;
            case 5:
                message.obj = deviceInfo.getDeviceIdentify();
                message.what = 103;
                this.u.sendMessage(message);
                break;
            case 6:
            case 7:
            case 8:
            case 12:
            case 14:
            default:
                LogUtil.j("DeviceManagerWearNoConnect", "mNonLocalBroadcastReceiver default state");
                break;
            case 11:
                c(deviceInfo);
                break;
            case 15:
                e(deviceInfo, this.u, message);
                break;
        }
    }

    private void c(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceFactoryReset() == 1) {
            this.u.removeMessages(101);
            if (AgreementDeclarationActivity.d) {
                LogUtil.j("DeviceManagerWearNoConnect", "oobe already is open");
                return;
            }
            Intent intent = new Intent(this, (Class<?>) AgreementDeclarationActivity.class);
            intent.putExtra("pairGuideSelectAddress", deviceInfo.getDeviceIdentify());
            Bundle bundle = new Bundle();
            bundle.putParcelable("deviceInfo", deviceInfo);
            intent.putExtras(bundle);
            intent.putExtra("device_country_code", deviceInfo.getCountryCode());
            intent.putExtra("device_emui_version", deviceInfo.getEmuiVersion());
            startActivity(intent);
            LogUtil.a("DeviceManagerWearNoConnect", "device_connected and go to oobe");
        }
    }

    private void e(DeviceInfo deviceInfo, Handler handler, Message message) {
        if (!CommonUtil.i(this.f, "com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity")) {
            LogUtil.j("DeviceManagerWearNoConnect", "activity is not foreground");
            return;
        }
        mgh.a(this);
        message.what = 1;
        message.arg1 = deviceInfo.getDeviceConnectState();
        this.u.sendMessage(message);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f = BaseApplication.getContext();
        this.f25400a = this;
        LogUtil.a("DeviceManagerWearNoConnect", "onCreate()");
        f();
        e();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void loadApplicationTheme() {
        Intent intent = getIntent();
        if (intent != null) {
            this.v = intent.getBooleanExtra("FROM_SMART_LIFE", false);
            this.ai = intent.getSourceBounds();
            if (this.v) {
                LogUtil.a("DeviceManagerWearNoConnect", "loadApplicationTheme from smartLift");
                tqp.e(this, 2);
                return;
            } else {
                tqp.e(this, 1);
                return;
            }
        }
        tqp.e(this, 1);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        s();
        res.d().c();
        BluetoothSwitchStateUtil bluetoothSwitchStateUtil = this.g;
        if (bluetoothSwitchStateUtil != null) {
            bluetoothSwitchStateUtil.a();
        }
        Handler handler = this.u;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.u = null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        c(true);
    }

    private void c(boolean z) {
        if (this.d != null && this.v) {
            LogUtil.a("DeviceManagerWearNoConnect", "onBackPressed startExit");
            this.d.e(this.f25401b);
        } else if (z) {
            super.onBackPressed();
            tqp.c(this);
        } else {
            finish();
            tqp.c(this);
        }
    }

    private void e() {
        j();
        Intent intent = getIntent();
        if (intent != null) {
            c(intent);
            if (lvi.n(this.y)) {
                LogUtil.a("DeviceManagerWearNoConnect", "is plugin download");
                String strJ = lvi.j(this.y);
                LogUtil.a("DeviceManagerWearNoConnect", "is plugin download uuid:", strJ);
                boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strJ);
                LogUtil.a("DeviceManagerWearNoConnect", "is plugin download pluginAvailable:", Boolean.valueOf(zIsResourcesAvailable));
                c(strJ);
                a(zIsResourcesAvailable, strJ);
            } else {
                o();
            }
        }
        List<DeviceInfo> listD = lvl.d();
        if (listD == null || listD.size() == 0 || this.w == null) {
            LogUtil.j("DeviceManagerWearNoConnect", "(deviceList == null) || (deviceList.size() == 0) || (mIdentify == null)");
            return;
        }
        for (DeviceInfo deviceInfo : listD) {
            if (deviceInfo != null && this.w.equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                d(deviceInfo);
                i();
                this.l = deviceInfo;
                if (deviceInfo.getDeviceConnectState() == 1) {
                    this.u.sendEmptyMessage(100);
                    this.u.sendEmptyMessageDelayed(101, 20000L);
                    break;
                } else {
                    if (deviceInfo.getDeviceConnectState() != 2) {
                        LogUtil.j("DeviceManagerWearNoConnect", "deviceInfo.getDeviceConnectState() ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                        break;
                    }
                    this.aa.setVisibility(8);
                    e(this.w);
                    finish();
                    break;
                }
            }
        }
        a(intent);
    }

    private void a(Intent intent) {
        if (this.v && this.ai != null) {
            getWindow().setBackgroundDrawableResource(R.color.common_transparent);
            rfn rfnVar = new rfn();
            this.d = rfnVar;
            rfnVar.b(getIntent().getBooleanExtra("isClick", false));
            this.d.c(this, intent, this.v);
            return;
        }
        getWindow().setBackgroundDrawableResource(R.color.colorBackground);
    }

    private void c(String str) {
        LogUtil.a("DeviceManagerWearNoConnect", "getConnectTip");
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(str);
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            return;
        }
        String strC = pluginInfoByUuid.i().c();
        this.e = strC;
        LogUtil.a("DeviceManagerWearNoConnect", "mAwakenDevice = ", strC);
    }

    private void d(DeviceInfo deviceInfo) {
        LogUtil.a("DeviceManagerWearNoConnect", "ProductType is ", Integer.valueOf(deviceInfo.getProductType()));
        if (deviceInfo.getProductType() < 34) {
            this.q.setVisibility(8);
            return;
        }
        String strC = tqp.c(deviceInfo);
        if (this.x || TextUtils.isEmpty(strC) || TextUtils.isEmpty(strC.trim()) || deviceInfo.getProductType() == 11) {
            this.q.setVisibility(8);
        } else {
            this.q.setVisibility(0);
            this.r.setText(tqp.c(deviceInfo));
        }
    }

    private void c(Intent intent) {
        this.x = intent.getBooleanExtra("is_cloud_device", false);
        this.s = intent.getStringExtra("device_name");
        boolean booleanExtra = intent.getBooleanExtra("device_only_one", false);
        this.w = intent.getStringExtra("device_identify");
        this.p = intent.getIntExtra("device_picID", 0);
        String strA = tqp.a(this.f, this.w, this.s, booleanExtra, false);
        this.t = strA;
        LogUtil.a("DeviceManagerWearNoConnect", "initData() mDeviceName:", this.s, " mDeviceTitleName ", strA, "mIdentify:", BTDeviceMgrUtil.c().e(this.w), "mDevicePicture:", Integer.valueOf(this.p));
        this.n.setTitleText(this.t);
        this.y = intent.getIntExtra(DeviceCategoryFragment.DEVICE_TYPE, -1);
        this.v = intent.getBooleanExtra("FROM_SMART_LIFE", false);
        this.ai = intent.getSourceBounds();
        LogUtil.a("DeviceManagerWearNoConnect", "current device Type :", Integer.valueOf(this.y));
    }

    private void o() {
        if (!TextUtils.isEmpty(this.s) && this.s.contains("HUAWEI AM-R1")) {
            this.k.setBackgroundResource(R.mipmap.img_device_r1_pic1);
            return;
        }
        try {
            this.k.setBackgroundResource(this.p);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("DeviceManagerWearNoConnect", "Resources NotFoundException");
        }
    }

    private void a(boolean z, String str) {
        if (z) {
            edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(str);
            if (pluginInfoByUuid != null) {
                String strE = eep.e(pluginInfoByUuid, 4, mgg.c(this.w, "DeviceManagerWearNoConnect"));
                LogUtil.a("DeviceManagerWearNoConnect", "is plugin download image:", strE);
                this.k.setImageBitmap(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(pluginInfoByUuid, strE));
                return;
            }
            if (lvi.f(this.y)) {
                this.k.setImageResource(R.mipmap.device_icon_band_default);
                return;
            } else {
                this.k.setImageResource(R.mipmap.device_icon_watch_default);
                return;
            }
        }
        this.k.setImageResource(R.mipmap.img_huawei_grus_pic1);
    }

    private void f() {
        setContentView(R.layout.device_manager_wear_reconnect);
        this.n = (CustomTitleBar) qsp.a(this, R.id.no_connect_detail_title_bar);
        this.k = (ImageView) qsp.a(this, R.id.no_connect_device_img);
        this.ah = (LinearLayout) qsp.a(this, R.id.no_connect_layout);
        this.aj = (HealthTextView) qsp.a(this, R.id.bolt_connect_awaken_tv);
        this.ah.setVisibility(0);
        this.q = (RelativeLayout) qsp.a(this, R.id.device_sn_layout);
        this.r = (HealthTextView) qsp.a(this, R.id.device_sn_value_text);
        LinearLayout linearLayout = (LinearLayout) qsp.a(this, R.id.no_connect_loading_layout);
        this.ac = linearLayout;
        linearLayout.setVisibility(8);
        this.aj.setVisibility(8);
        HealthProgressBar healthProgressBar = (HealthProgressBar) qsp.a(this, R.id.no_connect_loading_img);
        this.aa = healthProgressBar;
        healthProgressBar.setLayerType(1, null);
        this.h = (HealthButton) qsp.a(this, R.id.no_connect_button_connect);
        this.an = (HealthButton) qsp.a(this, R.id.no_connect_button_delete);
        this.z = (HealthTextView) qsp.a(this, R.id.no_connect_text);
        this.m = (HealthTextView) qsp.a(this, R.id.device_detection_text);
        this.o = (LinearLayout) qsp.a(this, R.id.device_detection_layout);
        if (LanguageUtil.f(this.f)) {
            this.o.setOrientation(0);
        } else {
            this.o.setOrientation(1);
        }
        this.h.setOnClickListener(this);
        this.an.setOnClickListener(this);
        this.m.setOnClickListener(this);
        if (qrs.ac()) {
            qrs.a(this.z);
            qrs.a(this.z);
        }
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.no_connect_detail_title_bar);
        this.n = customTitleBar;
        customTitleBar.setTitleTextColor(getResources().getColor(R.color.textColorPrimary));
        this.n.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: sgg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48022b.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        c(false);
    }

    private void i() {
        if (tqp.h()) {
            LogUtil.a("DeviceManagerWearNoConnect", "show detection entrance");
            this.n.setRightButtonVisibility(0);
            this.n.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_more), qre.f(R.string.accessibility_more_item));
            this.n.setTitleBarBackgroundColor(this.f.getResources().getColor(R.color.colorSubBackground));
            final ArrayList arrayList = new ArrayList(16);
            arrayList.add(BaseApplication.getContext().getString(R.string.IDS_wear_diagnostic_analysis));
            this.n.setRightButtonOnClickListener(new View.OnClickListener() { // from class: sgi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48024a.d(arrayList, view);
                }
            });
            this.o.setVisibility(0);
            return;
        }
        this.o.setVisibility(8);
        this.n.setRightButtonVisibility(8);
    }

    public /* synthetic */ void d(final ArrayList arrayList, View view) {
        PopViewList popViewList = new PopViewList(this.f, (View) this.n, (ArrayList<String>) arrayList, true, false);
        this.al = popViewList;
        popViewList.b(new PopViewList.PopViewClickListener() { // from class: sgh
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i) {
                this.e.e(arrayList, i);
            }
        });
    }

    public /* synthetic */ void e(ArrayList arrayList, int i) {
        if (i < 0 || i >= arrayList.size()) {
            LogUtil.j("DeviceManagerWearNoConnect", "position out of size");
        } else if (TextUtils.isEmpty((String) arrayList.get(i))) {
            LogUtil.j("DeviceManagerWearNoConnect", "type is null");
        } else {
            a("REMOTE_TYPE");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("DeviceManagerWearNoConnect", "onClick view is null");
            return;
        }
        int id = view.getId();
        if (id == R.id.no_connect_button_connect) {
            if (maq.b().f()) {
                LogUtil.a("DeviceManagerWearNoConnect", "user choose connect, other wear device is Upgrading");
                p();
                return;
            } else {
                b();
                return;
            }
        }
        if (id == R.id.no_connect_button_delete) {
            rdt.e(2);
            d();
        } else if (id != R.id.device_detection_text) {
            LogUtil.j("DeviceManagerWearNoConnect", "onClick other");
        } else {
            a("LOCAL_TYPE");
        }
    }

    private void a(String str) {
        int i;
        ReleaseLogUtil.d("Dfx_DeviceManagerWearNoConnect", "enter startDetection");
        if ("LOCAL_TYPE".equals(str)) {
            i = 1;
        } else if ("REMOTE_TYPE".equals(str)) {
            i = 2;
        } else {
            LogUtil.d("DeviceManagerWearNoConnect", "startConnectDetection else");
            i = -1;
        }
        lwo.c().e(this.l, i);
    }

    private void b() {
        if (Build.VERSION.SDK_INT > 30) {
            PermissionUtil.d(this.f25400a, PermissionUtil.PermissionType.SCAN, new BluetoothPermisionUtils.NearbyPermissionAction(this.f25400a) { // from class: com.huawei.ui.homehealth.devicemanagercard.OldDeviceManagerWearNoConnect.4
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("DeviceManagerWearNoConnect", "nearby permission granted");
                    OldDeviceManagerWearNoConnect.this.h();
                }
            });
        } else if (lvi.a(this.y).b() == 2) {
            PermissionUtil.d(this.f25400a, PermissionUtil.PermissionType.LOCATION, new CustomPermissionAction(this.f25400a) { // from class: com.huawei.ui.homehealth.devicemanagercard.OldDeviceManagerWearNoConnect.9
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("DeviceManagerWearNoConnect", "location permission ok.");
                    if (!rct.e(OldDeviceManagerWearNoConnect.this.f25400a)) {
                        OldDeviceManagerWearNoConnect.this.k();
                    } else {
                        OldDeviceManagerWearNoConnect.this.h();
                    }
                }
            });
        } else {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.devicemanagercard.OldDeviceManagerWearNoConnect.6
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("DeviceManagerWearNoConnect", "getHarmonyStatus getValue");
                String strD = lon.c().d("scale_share_harmony_tips");
                DevicePairGuideUtil.e(strD);
                LogUtil.a("DeviceManagerWearNoConnect", "getHarmonyStatus scale_share_harmony_tips: ", strD);
                OldDeviceManagerWearNoConnect.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.devicemanagercard.OldDeviceManagerWearNoConnect.6.5
                    @Override // java.lang.Runnable
                    public void run() {
                        String string;
                        if ("on".equals(DevicePairGuideUtil.b())) {
                            string = BaseApplication.getContext().getString(R.string.IDS_btsdk_turn_on_location_harmony);
                        } else {
                            string = BaseApplication.getContext().getString(R.string.IDS_btsdk_turn_on_location);
                        }
                        tqp.e(OldDeviceManagerWearNoConnect.this.f25400a, string);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (BTDeviceMgrUtil.c().h() != 3) {
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f25400a).a(this.f.getResources().getString(R.string.IDS_device_bluetooth_open_request)).a(R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: sge
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48021a.c(view);
                }
            }).c(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: sgd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.h(view);
                }
            }).c();
            this.i = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
            this.i.show();
            return;
        }
        d(0);
    }

    public /* synthetic */ void c(View view) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.i;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.i = null;
        }
    }

    public /* synthetic */ void h(View view) {
        g();
    }

    private void g() {
        BTDeviceMgrUtil.c().c(new BtSwitchStateCallback() { // from class: com.huawei.ui.homehealth.devicemanagercard.OldDeviceManagerWearNoConnect.7
            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
            public void onBtSwitchStateCallback(int i) {
                LogUtil.a("DeviceManagerWearNoConnect", "openBluetooth switchState :", Integer.valueOf(i));
                if (i == 3) {
                    BTDeviceMgrUtil.c().e(this);
                    OldDeviceManagerWearNoConnect.this.d(0);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        this.ab = true;
        if (dxx.d().e(this.w)) {
            c(i);
            return;
        }
        e(c());
        Handler handler = this.u;
        if (handler != null) {
            handler.sendEmptyMessage(100);
            this.u.sendMessageDelayed(b(i), 20000L);
        }
    }

    private Message b(int i) {
        Message messageObtainMessage = this.u.obtainMessage();
        messageObtainMessage.what = 101;
        messageObtainMessage.arg1 = i;
        return messageObtainMessage;
    }

    private DeviceInfo c() {
        List<DeviceInfo> listD = lvl.d();
        if (listD == null) {
            LogUtil.j("DeviceManagerWearNoConnect", "findTargetDevice mDeviceInfoList is null");
            return null;
        }
        for (DeviceInfo deviceInfo : listD) {
            if (deviceInfo instanceof CloudDeviceInfo) {
                CloudDeviceInfo cloudDeviceInfo = (CloudDeviceInfo) deviceInfo;
                if (cloudDeviceInfo.getIsCloudDevice() && cloudDeviceInfo.getDeviceName().equals(this.s)) {
                    LogUtil.a("DeviceManagerWearNoConnect", "getIsCloudDevice find");
                    return deviceInfo;
                }
            } else if (deviceInfo.getDeviceIdentify().equalsIgnoreCase(this.w)) {
                LogUtil.a("DeviceManagerWearNoConnect", "findTargetDevice find");
                return deviceInfo;
            }
        }
        LogUtil.a("DeviceManagerWearNoConnect", "findTargetDevice not find");
        return null;
    }

    private void e(DeviceInfo deviceInfo) {
        final boolean z;
        final String deviceProfileId;
        final String str;
        if (deviceInfo == null) {
            LogUtil.j("DeviceManagerWearNoConnect", "handleWorkMode goingConnectDevice is null");
            return;
        }
        final List<DeviceInfo> listD = lvl.d();
        if (listD == null) {
            LogUtil.j("DeviceManagerWearNoConnect", "handleWorkMode deviceInfoList is null");
            return;
        }
        boolean zD = eel.d(deviceInfo.getProductType());
        LogUtil.a("DeviceManagerWearNoConnect", "handleWorkMode goingReConnected is not AW70");
        Iterator<DeviceInfo> it = listD.iterator();
        while (it.hasNext()) {
            c(deviceInfo, it.next(), zD);
        }
        rcw.b(BaseApplication.getContext()).g(deviceInfo.getDeviceIdentify());
        String strB = b(deviceInfo);
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (deviceInfo instanceof CloudDeviceInfo) {
            res.d().b(true);
            CloudDeviceInfo cloudDeviceInfo = (CloudDeviceInfo) deviceInfo;
            res.d().a(deviceInfo.getProductType(), deviceInfo.getDeviceName(), deviceIdentify, this);
            LogUtil.a("DeviceManagerWearNoConnect", "goingConnectDevice getIsCloudDevice");
            String str2 = cloudDeviceInfo.getProductType() + Constants.LINK + cloudDeviceInfo.getDeviceIdentify();
            deviceProfileId = cloudDeviceInfo.getDeviceProfileId();
            z = true;
            str = str2;
        } else {
            z = false;
            deviceProfileId = strB;
            str = deviceIdentify;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.devicemanagercard.OldDeviceManagerWearNoConnect.8
            @Override // java.lang.Runnable
            public void run() {
                lvl.a((List<DeviceInfo>) listD, str);
                new rfi().b(null, deviceProfileId, z, str, OldDeviceManagerWearNoConnect.this.f);
            }
        });
    }

    private String b(DeviceInfo deviceInfo) {
        if (!TextUtils.isEmpty(deviceInfo.getDeviceUdid())) {
            return deviceInfo.getDeviceUdid();
        }
        return deviceInfo.getSecurityUuid() + "#ANDROID21";
    }

    private void c(DeviceInfo deviceInfo, DeviceInfo deviceInfo2, boolean z) {
        if (deviceInfo2 == null) {
            LogUtil.j("DeviceManagerWearNoConnect", "handleWorkMode deviceInfoList info is null");
            return;
        }
        if (deviceInfo.getDeviceIdentify().equalsIgnoreCase(deviceInfo2.getDeviceIdentify())) {
            LogUtil.a("DeviceManagerWearNoConnect", "handleWorkMode set device enable identify ", BTDeviceMgrUtil.c().e(deviceInfo.getDeviceIdentify()));
            deviceInfo2.setDeviceActiveState(1);
            deviceInfo2.setDeviceConnectState(1);
            return;
        }
        if (z) {
            if (eel.d(deviceInfo2.getProductType()) && deviceInfo2.getDeviceActiveState() == 1) {
                LogUtil.a("DeviceManagerWearNoConnect", "handleWorkMode set aw70 device disable identify ", BTDeviceMgrUtil.c().e(deviceInfo2.getDeviceIdentify()));
                deviceInfo2.setDeviceActiveState(0);
                deviceInfo2.setDeviceConnectState(3);
                return;
            }
            return;
        }
        if (deviceInfo2.getAutoDetectSwitchStatus() == 1 || rdp.d(deviceInfo.getProductType()) || deviceInfo2.getDeviceActiveState() != 1) {
            return;
        }
        LogUtil.a("DeviceManagerWearNoConnect", "handleWorkMode set band mode device disable identify ", BTDeviceMgrUtil.c().e(deviceInfo2.getDeviceIdentify()));
        deviceInfo2.setDeviceActiveState(0);
        deviceInfo2.setDeviceConnectState(3);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("DeviceManagerWearNoConnect", "requestCode：", Integer.valueOf(i), "resultCode：", Integer.valueOf(i2));
        if (i == 1 && i2 == 2) {
            qtv.e(intent, this, qtv.c(i2, true, intent.getIntExtra("product_type", -1), true));
        }
        if (i == 608) {
            ReleaseLogUtil.d("DeviceManagerWearNoConnect", "SENSITIVE_PERMISSION_STATUS resultCode", Integer.valueOf(i2));
            res.d().c(String.valueOf(i2));
            if (i2 == -1) {
                SharedPreferenceManager.c("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", SensitivePermissionStatus.RESTART.getValue());
                res.d().a("DeviceManagerWearNoConnect", intent);
                res.d().b();
                return;
            }
            rdp.e(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.devicemanagercard.OldDeviceManagerWearNoConnect.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i3, Object obj) {
                    if (i3 == -1) {
                        res.d().e();
                    } else {
                        res.d().c(String.valueOf(608));
                        res.d().b();
                    }
                }
            }, this.f25400a);
            return;
        }
        mgh.a(i, i2, intent, this.l);
    }

    private void c(int i) {
        if (this.af < 2) {
            lvl.a(tfn.a().k(), this.w);
            this.af++;
            Handler handler = this.u;
            if (handler != null) {
                handler.sendEmptyMessage(100);
                this.u.sendMessageDelayed(b(i), 20000L);
                return;
            }
            return;
        }
        DeviceInfo deviceInfoC = mgg.c("DeviceManagerWearNoConnect");
        if (deviceInfoC != null) {
            i(dxx.d().e(deviceInfoC.getProductType()));
            this.af = 0;
        }
    }

    private void i(View view) {
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.f25400a);
        builder.b(this.f.getString(R.string.IDS_device_mgr_pair_note_can_not_connect)).a(view).d(R.string.IDS_common_notification_know_tips, new DialogInterface.OnClickListener() { // from class: sgk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("DeviceManagerWearNoConnect", "showAlertDialog onclick PositiveButton");
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        customAlertDialogB.setCancelable(true);
        if (isFinishing()) {
            return;
        }
        customAlertDialogB.show();
    }

    private void n() {
        LogUtil.a("DeviceManagerWearNoConnect", "Enter sendDeviceListChangeBroadcast()");
        if (CommonUtil.ck()) {
            eem.a(tfn.a().k(), "DeviceManagerWearNoConnect");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        String deviceName;
        String strB;
        LogUtil.a("DeviceManagerWearNoConnect", "Enter unbindDevice");
        List<DeviceInfo> listD = lvl.d();
        DeviceInfo deviceInfo = null;
        if (listD == null || listD.isEmpty()) {
            deviceName = "";
        } else {
            LogUtil.a("DeviceManagerWearNoConnect", "delete mac :", BTDeviceMgrUtil.c().e(this.w));
            deviceName = "";
            int iIndexOf = -1;
            for (DeviceInfo deviceInfo2 : listD) {
                if (deviceInfo2.getDeviceIdentify().equals(this.w)) {
                    if (deviceInfo2 instanceof CloudDeviceInfo) {
                        strB = b(deviceInfo2, (CloudDeviceInfo) deviceInfo2);
                    } else {
                        iIndexOf = listD.indexOf(deviceInfo2);
                        deviceName = deviceInfo2.getDeviceName();
                        strB = deviceInfo2.getSecurityUuid() + "#ANDROID21";
                    }
                    rcw.b(BaseApplication.getContext()).b(deviceInfo2);
                    tfi.c(strB);
                    deviceInfo = deviceInfo2;
                }
            }
            if (!this.x) {
                LogUtil.a("DeviceManagerWearNoConnect", "!mIsCloudDevice:");
                if (iIndexOf != -1) {
                    meo.a().e(listD.get(iIndexOf));
                    listD.remove(iIndexOf);
                    lvb.e().a(deviceName);
                    LogUtil.a("DeviceManagerWearNoConnect", "deleteDevice");
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(this.w);
                    tfn.a().b(arrayList, true);
                }
            }
        }
        rdt.b(deviceName);
        lmf.d().c(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        n();
        lvb.e().b("deleteDevice", deviceInfo, 0, "");
        finish();
        tqp.c(this);
    }

    private String b(DeviceInfo deviceInfo, CloudDeviceInfo cloudDeviceInfo) {
        String smartDeviceUdid = cloudDeviceInfo.getSmartDeviceUdid();
        if (TextUtils.isEmpty(smartDeviceUdid) && deviceInfo.getSecurityUuid() != null) {
            smartDeviceUdid = deviceInfo.getSecurityUuid() + "#ANDROID21";
        }
        LogUtil.a("DeviceManagerWearNoConnect", "deviceUuid length:", Integer.valueOf(smartDeviceUdid.length()));
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(this.w);
        tfn.a().b(arrayList, true);
        lvl.a(deviceInfo);
        return smartDeviceUdid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        LogUtil.a("DeviceManagerWearNoConnect", "Enter openWearHome");
        Intent intent = new Intent();
        intent.setClassName(this.f25400a, "com.huawei.ui.homewear21.home.WearHomeActivity");
        intent.putExtra("device_id", str);
        if (this.v && this.ai != null) {
            intent.putExtra("FROM_SMART_LIFE", true);
            intent.putExtra("FROM_NO_CONNECT_SMART_LIFE", true);
            intent.setSourceBounds(this.ai);
            rfp.a(this.d);
        }
        rtk.d(this.f25400a, intent, "com.huawei.ui.homewear21.home.WearHomeActivity");
    }

    static class c extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<OldDeviceManagerWearNoConnect> f25412c;

        c(OldDeviceManagerWearNoConnect oldDeviceManagerWearNoConnect) {
            this.f25412c = new WeakReference<>(oldDeviceManagerWearNoConnect);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            OldDeviceManagerWearNoConnect oldDeviceManagerWearNoConnect = this.f25412c.get();
            if (oldDeviceManagerWearNoConnect == null || message == null) {
                return;
            }
            LogUtil.a("DeviceManagerWearNoConnect", "receive message is:", Integer.valueOf(message.what));
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case 100:
                        e(oldDeviceManagerWearNoConnect);
                        break;
                    case 101:
                        a(oldDeviceManagerWearNoConnect);
                        e(oldDeviceManagerWearNoConnect, message);
                        break;
                    case 102:
                        b(message, oldDeviceManagerWearNoConnect);
                        break;
                    case 103:
                        b(oldDeviceManagerWearNoConnect);
                        break;
                    case 104:
                        d(oldDeviceManagerWearNoConnect);
                        break;
                    default:
                        LogUtil.j("DeviceManagerWearNoConnect", "handleMessage default");
                        break;
                }
                return;
            }
            LogUtil.a("DeviceManagerWearNoConnect", "handleMessage connecting");
            if (oldDeviceManagerWearNoConnect.ab) {
                oldDeviceManagerWearNoConnect.e(message.arg1);
            }
        }

        private void d(OldDeviceManagerWearNoConnect oldDeviceManagerWearNoConnect) {
            oldDeviceManagerWearNoConnect.aa.setVisibility(8);
            oldDeviceManagerWearNoConnect.ah.setVisibility(0);
            oldDeviceManagerWearNoConnect.ac.setVisibility(8);
            oldDeviceManagerWearNoConnect.aj.setVisibility(8);
            oldDeviceManagerWearNoConnect.h.setClickable(true);
            oldDeviceManagerWearNoConnect.an.setClickable(true);
        }

        private void b(Message message, OldDeviceManagerWearNoConnect oldDeviceManagerWearNoConnect) {
            if (message.obj instanceof String) {
                oldDeviceManagerWearNoConnect.aa.setVisibility(8);
                if (!oldDeviceManagerWearNoConnect.x) {
                    oldDeviceManagerWearNoConnect.e((String) message.obj);
                    oldDeviceManagerWearNoConnect.finish();
                    return;
                } else {
                    LogUtil.j("DeviceManagerWearNoConnect", "is cloud device");
                    return;
                }
            }
            LogUtil.a("DeviceManagerWearNoConnect", "handleMessage connect success message info is null");
        }

        private void b(OldDeviceManagerWearNoConnect oldDeviceManagerWearNoConnect) {
            oldDeviceManagerWearNoConnect.aa.setVisibility(8);
            oldDeviceManagerWearNoConnect.ah.setVisibility(0);
            oldDeviceManagerWearNoConnect.ac.setVisibility(8);
            oldDeviceManagerWearNoConnect.aj.setVisibility(8);
            oldDeviceManagerWearNoConnect.h.setClickable(true);
            oldDeviceManagerWearNoConnect.an.setClickable(true);
            oldDeviceManagerWearNoConnect.m();
        }

        private void a(OldDeviceManagerWearNoConnect oldDeviceManagerWearNoConnect) {
            oldDeviceManagerWearNoConnect.aa.setVisibility(8);
            oldDeviceManagerWearNoConnect.ah.setVisibility(0);
            oldDeviceManagerWearNoConnect.ac.setVisibility(8);
            oldDeviceManagerWearNoConnect.aj.setVisibility(8);
            oldDeviceManagerWearNoConnect.h.setClickable(true);
            oldDeviceManagerWearNoConnect.an.setClickable(true);
        }

        private void e(OldDeviceManagerWearNoConnect oldDeviceManagerWearNoConnect, Message message) {
            if (oldDeviceManagerWearNoConnect.f25400a == null) {
                LogUtil.j("DeviceManagerWearNoConnect", "showConnectTimeoutHints activity.mActivityContext == null");
            } else {
                if (message.arg1 == 1) {
                    LogUtil.a("DeviceManagerWearNoConnect", "showConnectTimeoutHints clickFrom = 1");
                    rtk.e(oldDeviceManagerWearNoConnect.f25400a, dxx.d().e(oldDeviceManagerWearNoConnect.y));
                    return;
                }
                c(oldDeviceManagerWearNoConnect);
            }
        }

        private void c(final OldDeviceManagerWearNoConnect oldDeviceManagerWearNoConnect) {
            CloudReconnectFailDialog.Builder builder = new CloudReconnectFailDialog.Builder(oldDeviceManagerWearNoConnect.f25400a);
            builder.a(oldDeviceManagerWearNoConnect.y, lvi.a(oldDeviceManagerWearNoConnect.y).b()).b(new ReconnectCallback() { // from class: com.huawei.ui.homehealth.devicemanagercard.OldDeviceManagerWearNoConnect.c.3
                @Override // com.huawei.ui.homehealth.device.callback.ReconnectCallback
                public void reconnect() {
                    oldDeviceManagerWearNoConnect.d(1);
                }
            });
            CloudReconnectFailDialog cloudReconnectFailDialogE = builder.e();
            cloudReconnectFailDialogE.setCanceledOnTouchOutside(false);
            if (cloudReconnectFailDialogE.isShowing()) {
                return;
            }
            cloudReconnectFailDialogE.show();
        }

        private void e(OldDeviceManagerWearNoConnect oldDeviceManagerWearNoConnect) {
            oldDeviceManagerWearNoConnect.aa.setVisibility(0);
            oldDeviceManagerWearNoConnect.ah.setVisibility(8);
            oldDeviceManagerWearNoConnect.ac.setVisibility(0);
            if (!TextUtils.isEmpty(oldDeviceManagerWearNoConnect.e)) {
                oldDeviceManagerWearNoConnect.aj.setVisibility(0);
                oldDeviceManagerWearNoConnect.aj.setText(oldDeviceManagerWearNoConnect.e);
            }
            oldDeviceManagerWearNoConnect.h.setClickable(false);
            oldDeviceManagerWearNoConnect.an.setClickable(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        LogUtil.a("DeviceManagerWearNoConnect", "accountSwitch status:", Integer.valueOf(i));
        if (i != 9) {
            if (i == 10) {
                q();
                return;
            } else if (i != 13) {
                LogUtil.j("DeviceManagerWearNoConnect", "handleMessage default");
                return;
            }
        }
        a();
    }

    private void a() {
        if (this.f25402c == null) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f).e(this.f.getResources().getString(R.string.IDS_not_connect_inconsistent_account_title)).a(this.f.getResources().getString(R.string.IDS_not_connect_inconsistent_account_content)).e(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: sgo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48044b.e(view);
                }
            }).b();
            this.f25402c = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            if (this.f25402c.isShowing() || isFinishing()) {
                return;
            }
            this.f25402c.show();
        }
    }

    public /* synthetic */ void e(View view) {
        LogUtil.a("DeviceManagerWearNoConnect", "The user confirms know.");
        this.f25402c.dismiss();
        this.f25402c = null;
    }

    private void j() {
        LogUtil.a("DeviceManagerWearNoConnect", "registerWearBroadcast");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.health.action.CLOUD_CONNECTION_STATE_CHANGED");
        intentFilter.addAction("broadcast_receiver_user_setting");
        BroadcastManagerUtil.c(this.f, this.ae, intentFilter, LocalBroadcast.f36595c, null);
        this.g = new BluetoothSwitchStateUtil(this.f25400a);
    }

    private void s() {
        try {
            LogUtil.a("DeviceManagerWearNoConnect", "unregisterWearBroadcast");
            this.f.unregisterReceiver(this.ae);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("DeviceManagerWearNoConnect", "unregisterWearBroadcast IllegalArgumentException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        LogUtil.d("DeviceManagerWearNoConnect", "showBandUnavailableDialog");
        boolean zI = CommonUtil.i(this.f25400a, "com.huawei.ui.homehealth.devicemanagercard.DeviceManagerWearNoConnect");
        LogUtil.d("DeviceManagerWearNoConnect", "isForeground : ", Boolean.valueOf(zI));
        if (!zI) {
            LogUtil.j("DeviceManagerWearNoConnect", "showBandUnavailableDialog isForeground is false");
            return;
        }
        CustomTextAlertDialog customTextAlertDialog = this.ag;
        if (customTextAlertDialog != null && customTextAlertDialog.isShowing()) {
            LogUtil.d("DeviceManagerWearNoConnect", "showBandUnavailableDialog Already show!");
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f25400a).a(R.string.IDS_service_area_notice_title).a(this.f25400a.getString(R.string.IDS_band_is_unavailable_tip_string_newphone)).a(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: sgb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("DeviceManagerWearNoConnect", "showBandUnavailableDialog onClick");
            }
        }).b();
        this.ag = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (this.ag.isShowing()) {
            return;
        }
        this.ag.show();
    }

    private void p() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f25400a).a(this.f.getResources().getString(R.string.IDS_main_device_ota_error_message)).c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: sgf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("DeviceManagerWearNoConnect", "showTipDialog,click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void d() {
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            if (Build.VERSION.SDK_INT > 30) {
                PermissionUtil.d(this.f25400a, PermissionUtil.PermissionType.SCAN, new BluetoothPermisionUtils.NearbyPermissionAction(this.f25400a) { // from class: com.huawei.ui.homehealth.devicemanagercard.OldDeviceManagerWearNoConnect.3
                    @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onGranted() {
                        LogUtil.a("DeviceManagerWearNoConnect", "checkBluetoothState nearby permission granted");
                        OldDeviceManagerWearNoConnect.this.l();
                    }
                });
                return;
            } else {
                l();
                return;
            }
        }
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f25400a).a(this.f.getResources().getString(R.string.IDS_device_bluetooth_open_request)).c(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: sgj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.f(view);
            }
        }).a(R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: sgl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.g(view);
            }
        }).c();
        this.ad = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.ad.show();
    }

    public /* synthetic */ void f(View view) {
        LogUtil.a("DeviceManagerWearNoConnect", "user choose open bluetooth");
        BluetoothSwitchStateUtil bluetoothSwitchStateUtil = this.g;
        if (bluetoothSwitchStateUtil == null) {
            return;
        }
        bluetoothSwitchStateUtil.e(this.j);
    }

    public /* synthetic */ void g(View view) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.ad;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.ad = null;
        }
        LogUtil.a("DeviceManagerWearNoConnect", "user choose cancel open bluetooth");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(str);
        rcv.a(this.f).b((List<String>) arrayList, true);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
