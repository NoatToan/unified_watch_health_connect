package com.huawei.ui.homehealth.device.devicelist;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwdevice.mainprocess.mgr.hwdevicemodemgr.callback.WearPlaceCallback;
import com.huawei.hwdevice.phoneprocess.mgr.hwmenstrualmanager.bean.MenstrualSwitchStatus;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.beans.TitleBean;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity;
import com.huawei.ui.device.activity.pairing.EarphonePairActivity;
import com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter;
import com.huawei.ui.homehealth.device.callback.HonorPrivacyCallback;
import com.huawei.ui.homehealth.device.callback.ReconnectCallback;
import com.huawei.ui.homehealth.device.sitting.RecommendedItem;
import com.huawei.ui.homehealth.device.util.ReconnectUtils;
import com.huawei.ui.homehealth.device.view.DeviceItemDecoration;
import com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity;
import com.huawei.ui.homehealth.view.CloudReconnectFailDialog;
import com.huawei.ui.main.stories.userprofile.activity.WorkModeConflictDialogActivity;
import defpackage.dru;
import defpackage.drw;
import defpackage.dxx;
import defpackage.dxy;
import defpackage.ecu;
import defpackage.eej;
import defpackage.eel;
import defpackage.eey;
import defpackage.efl;
import defpackage.elc;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.era;
import defpackage.etn;
import defpackage.lsg;
import defpackage.lvi;
import defpackage.lvl;
import defpackage.lwt;
import defpackage.lxb;
import defpackage.maq;
import defpackage.mfs;
import defpackage.mgh;
import defpackage.miq;
import defpackage.njy;
import defpackage.qqp;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qst;
import defpackage.qtv;
import defpackage.rcv;
import defpackage.rcw;
import defpackage.rdp;
import defpackage.rdt;
import defpackage.rek;
import defpackage.res;
import defpackage.rfi;
import defpackage.roq;
import defpackage.rtk;
import defpackage.rty;
import defpackage.rum;
import defpackage.sox;
import defpackage.tfn;
import defpackage.tqp;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceMoreListActivity extends BaseActivity {
    private UserLabelServiceApi ab;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f25277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CardDeviceAdapter f25278c;
    private DeviceInfo h;
    private CustomTitleBar j;
    private HealthButton s;
    private String x;
    private HealthRecycleView y;
    private List<dru> u = new ArrayList(16);
    private List<dru> w = new ArrayList(16);
    private CustomTextAlertDialog d = null;
    private PermissionsResultAction v = null;
    private Handler i = new d(this);
    private ExecutorService g = Executors.newCachedThreadPool();
    private HashMap<String, Integer> aa = new HashMap<>(16);
    private boolean k = true;
    private boolean q = false;
    private boolean m = false;
    private boolean n = false;
    private int e = 0;
    private boolean r = false;
    private boolean o = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NoTitleCustomAlertDialog f25276a = null;
    private final BroadcastReceiver p = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler;
            if (context == null || intent == null || (handler = DeviceMoreListActivity.this.i) == null) {
                return;
            }
            if ("com.huawei.bone.action.DEVICE_THIRD_DELETE".equals(intent.getAction())) {
                handler.sendEmptyMessage(35);
                return;
            }
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || "com.huawei.health.action.CLOUD_CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                try {
                    if (intent.getParcelableExtra("deviceinfo") instanceof DeviceInfo) {
                        DeviceMoreListActivity.this.b((DeviceInfo) intent.getParcelableExtra("deviceinfo"), handler);
                        return;
                    }
                    return;
                } catch (ClassCastException unused) {
                    LogUtil.e("DeviceMoreListActivity", "DeviceInfo deviceInfo error ClassCastException");
                    return;
                }
            }
            if ("com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS".equals(intent.getAction())) {
                DeviceMoreListActivity.this.a();
                return;
            }
            if ("broadcast_receiver_user_setting".equals(intent.getAction()) && CommonUtil.i(context, "com.huawei.health.MainActivity")) {
                String stringExtra = intent.getStringExtra("pairGuideSelectAddress");
                LogUtil.a("DeviceMoreListActivity", "mNonLocalBroadcastReceiver() device Pair failed");
                DeviceMoreListActivity.this.e(stringExtra);
                return;
            }
            LogUtil.j("DeviceMoreListActivity", "mNonLocalBroadcastReceiver()  intent : ", intent.getAction());
        }
    };
    private BroadcastReceiver t = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.6
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("DeviceMoreListActivity", "mPairBroadcastReceiver intent is null");
            } else if ("com.huawei.health.action.PAIR_DEVICE_SUCCESS".equals(intent.getAction())) {
                LogUtil.a("DeviceMoreListActivity", "pair device success");
                DeviceMoreListActivity.this.finish();
            }
        }
    };
    private final BroadcastReceiver f = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.8
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = DeviceMoreListActivity.this.i;
            if (handler == null) {
                return;
            }
            if (intent == null) {
                LogUtil.j("DeviceMoreListActivity", "mDeviceBatteryOrRemainingTimeReceiver intent is null");
                return;
            }
            if ("com.huawei.bone.action.BATTERY_LEVEL".equals(intent.getAction())) {
                if (intent.getExtras() != null) {
                    handler.sendEmptyMessage(34);
                }
            } else if ("com.huawei.bone.action.REMAINING_TIME".equals(intent.getAction())) {
                handler.sendEmptyMessage(34);
            }
        }
    };
    private HonorPrivacyCallback l = new HonorPrivacyCallback() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.13
        @Override // com.huawei.ui.homehealth.device.callback.HonorPrivacyCallback
        public void signResult(rum.e eVar) {
            if (eVar == null) {
                LogUtil.j("DeviceMoreListActivity", "mHonorPrivacyCallback parameter is null.");
                return;
            }
            if (!eVar.a()) {
                LogUtil.j("DeviceMoreListActivity", "mHonorPrivacyCallback refresh page after delete device.");
                if (DeviceMoreListActivity.this.f25278c != null) {
                    DeviceMoreListActivity.this.f25278c.c(false);
                }
                DeviceMoreListActivity.this.a();
                return;
            }
            int iD = eVar.d();
            int iB = eVar.b();
            LogUtil.a("DeviceMoreListActivity", "mHonorPrivacyCallback position: ", Integer.valueOf(iD), ", clickType: ", Integer.valueOf(iB));
            if (iB == 3) {
                DeviceMoreListActivity.this.e(iD, (View) null);
                return;
            }
            if (iB != 4) {
                LogUtil.j("DeviceMoreListActivity", "mHonorPrivacyCallback clickType is unknown.");
            } else {
                if (eVar.e() == null || !(eVar.e().i() instanceof dxy)) {
                    return;
                }
                DeviceMoreListActivity.this.a((dxy) eVar.e().i());
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void loadApplicationTheme() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e() {
        return this.x;
    }

    public void d(String str) {
        this.x = str;
    }

    private void o() {
        LogUtil.a("DeviceMoreListActivity", "enter registerBatteryBroadcast");
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.BATTERY_LEVEL");
        intentFilter.addAction("com.huawei.bone.action.BATTERY_LEVEL");
        intentFilter.addAction("com.huawei.bone.action.REMAINING_TIME");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.f, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void s() {
        try {
            BaseApplication.getContext().unregisterReceiver(this.f);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("DeviceMoreListActivity", "unRegisterBatteryBroadcast IllegalArgumentException");
        }
    }

    private void n() {
        LogUtil.a("DeviceMoreListActivity", "enter registerNonLocalBroadcastReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.health.action.CLOUD_CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.DEVICE_THIRD_DELETE");
        intentFilter.addAction("com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS");
        intentFilter.addAction("broadcast_receiver_user_setting");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.p, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void y() {
        try {
            BaseApplication.getContext().unregisterReceiver(this.p);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("DeviceMoreListActivity", "unRegisterNonLocalBroadcastReceiver IllegalArgumentException");
        }
    }

    private void p() {
        LogUtil.a("DeviceMoreListActivity", "showBandUnavailableDialog");
        if (CommonUtil.i(this.f25277b, "com.huawei.health.MainActivity")) {
            CustomTextAlertDialog customTextAlertDialog = this.d;
            if (customTextAlertDialog != null && customTextAlertDialog.isShowing()) {
                LogUtil.j("DeviceMoreListActivity", "showBandUnavailableDialog Already show!");
                return;
            }
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f25277b).a(R.string.IDS_service_area_notice_title).a(this.f25277b.getString(R.string.IDS_band_is_unavailable_tip_string_newphone)).a(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: rot
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.j("DeviceMoreListActivity", "view onClick");
                }
            }).b();
            this.d = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            if (this.d.isShowing() || isFinishing()) {
                return;
            }
            this.d.show();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.o = false;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        qrs.e();
    }

    /* JADX INFO: loaded from: classes17.dex */
    static class d extends BaseHandler<DeviceMoreListActivity> {
        d(DeviceMoreListActivity deviceMoreListActivity) {
            super(deviceMoreListActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(DeviceMoreListActivity deviceMoreListActivity, Message message) {
            switch (message.what) {
                case 30:
                    LogUtil.a("DeviceMoreListActivity", "connect device", Integer.valueOf(message.what));
                    if (message.obj instanceof String) {
                        String str = (String) message.obj;
                        if (!TextUtils.isEmpty(str) && str.equals(deviceMoreListActivity.e())) {
                            removeMessages(31);
                            deviceMoreListActivity.f25278c.c(false);
                            deviceMoreListActivity.d((String) null);
                        }
                        deviceMoreListActivity.f25278c.c(false);
                        deviceMoreListActivity.f25278c.c();
                        deviceMoreListActivity.a();
                        DeviceCapability deviceCapabilityC = eej.c();
                        DeviceInfo deviceInfoJ = tfn.a().j();
                        if (deviceCapabilityC != null && deviceCapabilityC.isSupportWatchFace() && deviceInfoJ != null && (deviceInfoJ.getPowerSaveModel() != 1 || !tqp.e(deviceInfoJ.getProductType()))) {
                            tqp.g(BaseApplication.getContext());
                        }
                        if (deviceCapabilityC != null && deviceCapabilityC.isSupportMenstrual()) {
                            b(deviceInfoJ);
                            break;
                        }
                    }
                    break;
                case 31:
                    LogUtil.a("DeviceMoreListActivity", "handleMessageWhenReferenceNotNull device connect time out");
                    removeMessages(31);
                    d(deviceMoreListActivity, message);
                    break;
                case 32:
                    c(deviceMoreListActivity, message);
                    break;
                case 33:
                default:
                    b(message, deviceMoreListActivity);
                    break;
                case 34:
                    deviceMoreListActivity.f25278c.notifyDataSetChanged();
                    break;
            }
        }

        private void d(DeviceMoreListActivity deviceMoreListActivity, Message message) {
            deviceMoreListActivity.f25278c.c(false);
            deviceMoreListActivity.a();
            if (message.arg1 == 1 && deviceMoreListActivity.o) {
                c(message, deviceMoreListActivity);
            }
        }

        private void c(Message message, final DeviceMoreListActivity deviceMoreListActivity) {
            if (!(message.obj instanceof dxy)) {
                LogUtil.j("DeviceMoreListActivity", "cloudDeviceDialog message.obj instanceof DeviceInfoForWear");
                return;
            }
            final dxy dxyVar = (dxy) message.obj;
            if (message.arg2 == 1) {
                LogUtil.a("DeviceMoreListActivity", "cloudDeviceDialog clickFrom = 1");
                if (ReconnectUtils.e(dxyVar.e()) && dxyVar.g() >= 85 && dxyVar.g() != 275) {
                    ReconnectUtils.a(dxyVar.e(), "e2");
                    return;
                } else {
                    rtk.e(deviceMoreListActivity.f25277b, dxx.d().e(dxyVar.g()));
                    return;
                }
            }
            CloudReconnectFailDialog.Builder builder = new CloudReconnectFailDialog.Builder(deviceMoreListActivity.f25277b);
            builder.a(dxyVar.g(), lvi.a(dxyVar.g()).b()).b(new ReconnectCallback() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.d.4
                @Override // com.huawei.ui.homehealth.device.callback.ReconnectCallback
                public void reconnect() {
                    deviceMoreListActivity.d(dxyVar.d());
                    deviceMoreListActivity.f25278c.c(true);
                    deviceMoreListActivity.a();
                    deviceMoreListActivity.b(dxyVar, 1);
                }
            });
            CloudReconnectFailDialog cloudReconnectFailDialogE = builder.e();
            cloudReconnectFailDialogE.setCanceledOnTouchOutside(false);
            if (cloudReconnectFailDialogE.isShowing() || deviceMoreListActivity.isFinishing()) {
                return;
            }
            cloudReconnectFailDialogE.show();
        }

        private void c(DeviceMoreListActivity deviceMoreListActivity, Message message) {
            if (message.obj instanceof String) {
                String str = (String) message.obj;
                ReleaseLogUtil.d("R_DeviceMoreListActivity", "handlerDisconnectMessage deviceId: ", CommonUtil.n(str), " reconnectDevice: ", CommonUtil.n(deviceMoreListActivity.e()));
                if (!TextUtils.isEmpty(str) && str.equals(deviceMoreListActivity.e())) {
                    removeMessages(31);
                    deviceMoreListActivity.f25278c.c(false);
                    deviceMoreListActivity.d((String) null);
                }
                deviceMoreListActivity.a();
                if (deviceMoreListActivity.o && deviceMoreListActivity.f25278c.a() == 3) {
                    deviceMoreListActivity.f25278c.c();
                    HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
                    hwGetDevicesParameter.setDeviceIdentify(str);
                    List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, "DeviceMoreListActivity");
                    if (!njy.e(deviceList)) {
                        DeviceInfo deviceInfo = deviceList.get(0);
                        if (ReconnectUtils.e(deviceInfo) && deviceInfo.getProductType() >= 85 && deviceInfo.getProductType() != 275) {
                            ReconnectUtils.a(deviceInfo, "e2");
                            return;
                        }
                    }
                    rtk.e(deviceMoreListActivity.f25277b, dxx.d().e(message.arg1));
                }
            }
        }

        private void b(DeviceInfo deviceInfo) {
            new miq().e(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.d.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("DeviceMoreListActivity", "queryMenstrualSwitch errorCode:", Integer.valueOf(i));
                    if (i == 0 && (obj instanceof MenstrualSwitchStatus)) {
                        LogUtil.a("DeviceMoreListActivity", "device connected sendMenstrualSwitchInMain");
                        sox.d().a((MenstrualSwitchStatus) obj);
                    }
                }
            });
            sox.d().c(deviceInfo);
        }

        private void b(Message message, DeviceMoreListActivity deviceMoreListActivity) {
            int i = message.what;
            if (i == 12) {
                LogUtil.a("DeviceMoreListActivity", "DEVICE_GET_CURRENT_INFO_LIST message");
                if (message.obj instanceof List) {
                    deviceMoreListActivity.u.clear();
                    deviceMoreListActivity.u.addAll((List) message.obj);
                }
                deviceMoreListActivity.k();
                return;
            }
            if (i != 33) {
                if (i == 45 || i == 35) {
                    LogUtil.a("DeviceMoreListActivity", "MSG_DEVICE_DELETE or MSG_UPDATE_DEVICE_LIST message: ", Integer.valueOf(message.what));
                    deviceMoreListActivity.a();
                    return;
                } else {
                    if (i == 36) {
                        removeMessages(31);
                        deviceMoreListActivity.f25278c.c(false);
                        deviceMoreListActivity.a();
                        deviceMoreListActivity.c(message.arg1);
                        return;
                    }
                    LogUtil.j("DeviceMoreListActivity", "message default");
                    return;
                }
            }
            LogUtil.a("DeviceMoreListActivity", "msg_connect_change state:", Boolean.valueOf(deviceMoreListActivity.f25278c.d()), "message: ", Integer.valueOf(message.what));
            if (!(message.obj instanceof String)) {
                LogUtil.j("DeviceMoreListActivity", "!(message.obj instanceof String)");
            } else {
                if (!rtk.e((String) message.obj)) {
                    LogUtil.j("DeviceMoreListActivity", "isContinueConnecting false");
                    return;
                }
                deviceMoreListActivity.d((String) message.obj);
                deviceMoreListActivity.f25278c.c(true);
                deviceMoreListActivity.a();
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cancelAdaptRingRegion();
        LogUtil.a("DeviceMoreListActivity", "onCreate()");
        setContentView(R.layout.more_device_all_list);
        this.f25277b = this;
        if (CommonUtil.ck()) {
            n();
            o();
        }
        Handler handler = this.i;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(40, 10000L);
        }
        mfs.c(this, -1);
        UserLabelServiceApi userLabelServiceApi = (UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class);
        this.ab = userLabelServiceApi;
        userLabelServiceApi.registerCallback(4);
        this.ab.registerCallback(5);
        h();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.n = false;
        this.o = true;
        if (this.k) {
            c();
        }
        a();
        f();
        ExecutorService executorService = this.g;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.11
                @Override // java.lang.Runnable
                public void run() {
                    List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "DeviceMoreListActivity");
                    if (deviceList != null && !deviceList.isEmpty()) {
                        tfn.a().h();
                    }
                    DeviceMoreListActivity.this.d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.n && this.o) {
            lwt.d().e(new e(this), "DeviceMoreListActivity");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
        g();
    }

    private void j() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.select_device_detail_title_bar);
        this.j = customTitleBar;
        customTitleBar.setTitleText(this.f25277b.getString(R.string.IDS_hw_common_ui_xlistview_footer_hint_moredevice));
        this.j.setTitleTextColor(this.f25277b.getResources().getColor(R.color.textColorPrimary));
        this.j.setRightButtonVisibility(0);
        this.j.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_appbar_more), qre.f(R.string.accessibility_more_item));
        this.j.setTitleBarBackgroundColor(this.f25277b.getResources().getColor(R.color.colorSubBackground));
        this.j.setRightButtonOnClickListener(new View.OnClickListener() { // from class: rox
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47553c.e(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        ArrayList arrayList = new ArrayList(Arrays.asList(getResources().getString(R.string.IDS_device_wifi_my_qrcode_sweep_code_add), getResources().getString(R.string.IDS_hw_device_manager_add_device)));
        if (qst.c() && rty.d()) {
            arrayList.add(getResources().getString(R.string.IDS_device_auto_switch));
            rek.a("autoSwitch");
        }
        new PopViewList(this.f25277b, this.j, arrayList).b(new PopViewList.PopViewClickListener() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.14
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public void setOnClick(int i) {
                if (i == 0) {
                    LoginInit.getInstance(DeviceMoreListActivity.this.f25277b).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.14.1
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i2, Object obj) {
                            if (i2 == 0) {
                                PermissionUtil.d(DeviceMoreListActivity.this.f25277b, PermissionUtil.PermissionType.CAMERA, DeviceMoreListActivity.this.v);
                            }
                        }
                    }, "");
                } else {
                    if (i == 1) {
                        DeviceMoreListActivity.this.t();
                        return;
                    }
                    if (i == 2) {
                        DeviceMoreListActivity.this.q();
                    }
                    LogUtil.j("DeviceMoreListActivity", "position is null");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        Context context = this.f25277b;
        if (context == null) {
            LogUtil.j("DeviceMoreListActivity", "mContext is null");
        } else {
            rdp.a(context);
        }
    }

    private void h() {
        this.v = new CustomPermissionAction(this.f25277b) { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.15
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("DeviceMoreListActivity", "mQrCodeAction onGranted");
                DeviceMoreListActivity.this.i();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a("DeviceMoreListActivity", "mQrCodeAction onDenied");
                DeviceMoreListActivity.this.i();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.a("DeviceMoreListActivity", "mQrCodeAction onForeverDenied");
                DeviceMoreListActivity.this.i();
            }
        };
        j();
        HealthButton healthButton = (HealthButton) qsp.a(this, R.id.add_device_click);
        this.y = (HealthRecycleView) qsp.a(this, R.id.card_device_list);
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: ror
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(view);
            }
        });
        HealthButton healthButton2 = (HealthButton) qsp.a(this, R.id.more_device_click);
        this.s = healthButton2;
        healthButton2.setOnClickListener(new View.OnClickListener() { // from class: row
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47552b.i(view);
            }
        });
        l();
    }

    public /* synthetic */ void c(View view) {
        if (qrs.r()) {
            return;
        }
        t();
    }

    public /* synthetic */ void i(View view) {
        if (qrs.r() || this.q) {
            return;
        }
        this.q = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f25277b == null) {
            LogUtil.j("DeviceMoreListActivity", "gotoScan mContext is null");
            return;
        }
        rtk.d(this.f25277b, new Intent(this.f25277b, (Class<?>) QrCodeScanningActivity.class), "QrCodeScanningActivity");
        m();
    }

    private void m() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.action.PAIR_DEVICE_SUCCESS");
        LocalBroadcastManager.getInstance().registerReceiver(this.t, intentFilter);
    }

    private void l() {
        CardDeviceAdapter cardDeviceAdapter = new CardDeviceAdapter(this.f25277b, this, new CardDeviceAdapter.PersonalItemReconnectListener() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.16
            @Override // com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.PersonalItemReconnectListener
            public void onReconnect(dxy dxyVar) {
                LogUtil.a("DeviceMoreListActivity", "setRecyclerView onReconnect");
                DeviceMoreListActivity.this.c(dxyVar);
            }

            @Override // com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.PersonalItemReconnectListener
            public void onPersonalEquipment(int i, View view) {
                LogUtil.a("DeviceMoreListActivity", "setRecyclerView onPersonalEquipment");
                DeviceMoreListActivity.this.d(i, view);
            }

            @Override // com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.PersonalItemReconnectListener
            public void onMoreEquipment() {
                LogUtil.a("DeviceMoreListActivity", "setRecyclerView onMoreEquipment");
                if (qrs.r()) {
                    return;
                }
                DeviceMoreListActivity.this.t();
            }
        });
        this.f25278c = cardDeviceAdapter;
        cardDeviceAdapter.c(this.w);
        this.y.setAdapter(this.f25278c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(dxy dxyVar) {
        dru druVar = new dru();
        druVar.d(1);
        druVar.c(dxyVar);
        if (rum.e(this.f25277b, druVar)) {
            rum.e eVar = new rum.e();
            eVar.e(druVar);
            eVar.b(new RecommendedItem());
            eVar.a(-1);
            eVar.e(4);
            rum.a(this.f25277b, eVar, this.l);
            return;
        }
        a(dxyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, View view) {
        if (!qrs.r() && i >= 0 && i < this.u.size()) {
            dru druVar = this.u.get(i);
            if (rum.e(this.f25277b, druVar)) {
                rum.e eVar = new rum.e();
                eVar.e(druVar);
                eVar.b(new RecommendedItem());
                eVar.a(i);
                eVar.e(3);
                rum.a(this.f25277b, eVar, this.l);
                return;
            }
            e(i, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(dxy dxyVar) {
        rcw.b(this.f25277b).g(dxyVar.d());
        b(dxyVar, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, View view) {
        dru druVar = this.u.get(i);
        boolean zD = this.f25278c.d();
        if (druVar.e() == 0) {
            LogUtil.a("DeviceMoreListActivity", "DeviceManagerCardNoDeviceValueViewHolder onItemClick postion ", Integer.valueOf(i));
            final elh elhVar = (elh) druVar.i();
            ContentValues contentValuesD = druVar.d();
            final String asString = contentValuesD != null ? contentValuesD.getAsString("uniqueId") : "";
            final String strT = elhVar.t();
            if (TextUtils.isEmpty(strT)) {
                strT = druVar.d().getAsString("productId");
                elhVar.l(strT);
            }
            if (elhVar.d().size() <= 0) {
                b(i, elhVar, contentValuesD);
                return;
            } else if ("1".equals(elhVar.g()) || BleConstants.BLE_THIRD_DEVICE_H5.equals(elhVar.n().b())) {
                PermissionDialogHelper.d(this, new PermissionDialogHelper.OpenBlueToothAction() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.20
                    @Override // com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.OpenBlueToothAction
                    public void onPermissionGranted() {
                        if ("1".equals(elhVar.g())) {
                            LogUtil.a("DeviceMoreListActivity", "deviceConnect onPermissionGranted switchToH5ProIntro");
                            etn.c(DeviceMoreListActivity.this.f25277b, elhVar, strT, asString);
                        } else {
                            LogUtil.a("DeviceMoreListActivity", "deviceConnect onPermissionGranted startWebViewActivity");
                            DeviceMoreListActivity.this.c(strT, asString, elhVar.n().b());
                        }
                    }

                    @Override // com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.OpenBlueToothAction
                    public void onPermissionDenied() {
                        LogUtil.a("DeviceMoreListActivity", "Permission onPermissionDenied");
                    }
                });
                return;
            } else {
                d(elhVar, contentValuesD, asString);
                return;
            }
        }
        if (druVar.e() == 1) {
            b(druVar, zD);
            return;
        }
        if (druVar.e() == 3) {
            startActivity(efl.a(druVar));
            return;
        }
        if (druVar.e() == 4) {
            b(druVar, view);
        } else if (druVar.e() == 6) {
            new elc().a(this, druVar.d().getAsString("mac"));
        } else {
            LogUtil.j("DeviceMoreListActivity", "other device");
        }
    }

    private void b(dru druVar, View view) {
        Bundle bundle = view != null ? ActivityOptionsCompat.makeSceneTransitionAnimation(this, Pair.create(view, TitleBean.RIGHT_BTN_TYPE_SHARE)).toBundle() : null;
        Intent intent = new Intent();
        intent.putExtra("common_device_name", druVar.b());
        intent.setClass(this.f25277b, MoreSportDeviceActivity.class);
        try {
            if (bundle != null) {
                startActivity(intent, bundle);
            } else {
                startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("DeviceMoreListActivity", "MoreSportDeviceActivity ActivityNotFoundException");
        }
    }

    private void d(elh elhVar, ContentValues contentValues, String str) {
        if ("4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c".equals(elhVar.t())) {
            b(contentValues);
            return;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.setAction("SWITCH_PLUGINDEVICE");
        bundle.putString("arg1", "DeviceInfoList");
        bundle.putString("productId", elhVar.t());
        bundle.putString("uniqueId", str);
        intent.setPackage(roq.f47547c);
        intent.setClassName(roq.f47547c, "com.huawei.health.device.ui.DeviceMainActivity");
        bundle.putParcelable("commonDeviceInfo", contentValues);
        intent.putExtras(bundle);
        rtk.d(this.f25277b, intent, "com.huawei.health.device.ui.DeviceMainActivity");
    }

    private void b(ContentValues contentValues) {
        LogUtil.a("DeviceMoreListActivity", "enter doJumpNemoActivity...");
        String asString = contentValues.getAsString("uniqueId");
        if (era.a(contentValues)) {
            Intent intent = new Intent(this, (Class<?>) DeviceMainActivity.class);
            intent.putExtra("PID_FROM_QRCODE", "ZAA6");
            intent.putExtra("productId", contentValues.getAsString("productId"));
            intent.putExtra("Device_Type", "082");
            intent.putExtra("macAddress", asString);
            startActivity(intent);
        } else {
            LogUtil.a("DeviceMoreListActivity", "enter enmo");
            new elc().a(this, asString);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getContext().getPackageName());
        intent.setClassName(BaseApplication.getContext().getPackageName(), "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", elg.e().e(str));
        intent.putExtra("productId", str);
        elh elhVarD = ResourceManager.c().d(str);
        intent.putExtra("uniqueId", str2);
        if (elhVarD != null) {
            if (elhVarD.l() != null) {
                intent.putExtra("name", elo.a(str, elhVarD.l().d()));
            }
            if (elhVarD.m() != null) {
                intent.putExtra("deviceType", elhVarD.m().name());
            }
            if (elhVarD.v() != null) {
                intent.putExtra(Constants.KEY_BLE_SCAN_MODE, elhVarD.v().c());
            }
        }
        intent.putExtra("bleIntroductionType", str3);
        startActivity(intent);
    }

    private void b(final int i, final elh elhVar, final ContentValues contentValues) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f25277b);
        builder.b(R.string.IDS_device_selection_cancel_unbind_device);
        builder.c(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: rov
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47550a.e(contentValues, elhVar, i, view);
            }
        });
        builder.a(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: rou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.j("DeviceMoreListActivity", "onClick");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void e(ContentValues contentValues, elh elhVar, int i, View view) {
        if (contentValues == null || elhVar == null) {
            return;
        }
        String asString = contentValues.getAsString("uniqueId");
        if (drw.e().l(asString)) {
            drw.e().e(elhVar.t(), asString);
            this.u.remove(i);
            this.f25278c.notifyDataSetChanged();
            Intent intent = new Intent();
            intent.setAction("com.huawei.bone.action.DEVICE_THIRD_DELETE");
            intent.setPackage(BaseApplication.getAppPackage());
            this.f25277b.sendBroadcast(intent, LocalBroadcast.f36595c);
        }
    }

    private void b(dru druVar, boolean z) {
        String str;
        LogUtil.a("DeviceMoreListActivity", "onItemClick wear");
        dxy dxyVar = (dxy) druVar.i();
        if (z && (str = this.x) != null && !str.equals(dxyVar.d()) && dxyVar.b() != 2) {
            LogUtil.j("DeviceMoreListActivity", "other devices is connection,can not start activity.");
            return;
        }
        if (dxyVar.b() == 2) {
            rtk.d(this.f25277b, dxyVar);
        } else if (dxyVar.h()) {
            rdt.e(4);
            rtk.c(this.f25277b, dxyVar, druVar.f());
        } else {
            rtk.d(this.f25277b, dxyVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(dxy dxyVar, int i) {
        if (maq.b().f()) {
            LogUtil.a("DeviceMoreListActivity", "user choose connect other wear device is OTAing");
            b(R.string.IDS_main_device_ota_error_message);
            return;
        }
        final List<DeviceInfo> listD = lvl.d();
        b(dxyVar, listD);
        String strD = dxyVar.d();
        final DownloadCloudDeviceResource downloadCloudDeviceResource = new DownloadCloudDeviceResource();
        if (dxyVar.h()) {
            LogUtil.a("DeviceMoreListActivity", "deviceInfoForWear.getIsCloudDevice()");
            res.d().b(true);
            res.d().a(dxyVar.g(), dxyVar.i(), strD, this);
            strD = dxyVar.g() + com.huawei.openalliance.ad.constant.Constants.LINK + dxyVar.d();
        } else {
            downloadCloudDeviceResource.e();
        }
        final String str = strD;
        final boolean zH = dxyVar.h();
        final String strF = dxyVar.f();
        this.g.execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.4
            @Override // java.lang.Runnable
            public void run() {
                lvl.a((List<DeviceInfo>) listD, str);
                new rfi().b(downloadCloudDeviceResource, strF, zH, str, DeviceMoreListActivity.this.f25277b);
            }
        });
        this.i.sendMessageDelayed(rtk.c(zH, dxyVar, i), 20000L);
        LogUtil.a("DeviceMoreListActivity", "device connect time out");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        DeviceInfo next;
        LogUtil.a("DeviceMoreListActivity", "gotoConflictDialogActivity enter");
        if (this.f25277b == null) {
            LogUtil.j("DeviceMoreListActivity", "gotoConflictDialogActivity mContext is null");
            return;
        }
        List<DeviceInfo> listG = dxx.d().g();
        if (listG == null) {
            next = null;
            break;
        }
        Iterator<DeviceInfo> it = listG.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getDeviceConnectState() == 2) {
                LogUtil.a("DeviceMoreListActivity", "gotoConflictDialogActivity find connected device");
                break;
            }
        }
        if (next == null) {
            LogUtil.j("DeviceMoreListActivity", "gotoConflictDialogActivity connectedDevice is null");
            return;
        }
        String str = String.format(Locale.ROOT, this.f25277b.getString(R.string.IDS_work_mode_conflict_dialog_content), d(next.getProductType()), d(i));
        Intent intent = new Intent();
        intent.putExtra("content", str);
        intent.setClass(this.f25277b, WorkModeConflictDialogActivity.class);
        rtk.d(this.f25277b, intent, "WorkModeConflictDialogActivity");
    }

    private String d(int i) {
        DeviceInfo deviceInfoE = dxx.d().e();
        if (deviceInfoE == null) {
            return com.huawei.hms.hihealth.data.DeviceInfo.STR_TYPE_UNKNOWN;
        }
        String strI = "PORSCHE DESIGN";
        if ((TextUtils.isEmpty(deviceInfoE.getDeviceName()) || !"PORSCHE DESIGN".equals(deviceInfoE.getDeviceName())) && (TextUtils.isEmpty(deviceInfoE.getDeviceModel()) || !"PORSCHE DESIGN".equals(deviceInfoE.getDeviceModel()))) {
            strI = lvi.a(i).i();
        }
        LogUtil.a("DeviceMoreListActivity", "transDeviceProductTypeIntToStr: mDeviceProductType ", strI);
        return strI;
    }

    private void b(dxy dxyVar, List<DeviceInfo> list) {
        if (dxyVar == null || list == null) {
            return;
        }
        if (eel.d(dxyVar.g())) {
            LogUtil.a("DeviceMoreListActivity", "handleWorkMode goingReConnected == AW70");
            for (DeviceInfo deviceInfo : list) {
                if (dxyVar.d().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                    LogUtil.a("DeviceMoreListActivity", "Reconnected AW70 set device enable");
                    deviceInfo.setDeviceActiveState(1);
                    deviceInfo.setDeviceConnectState(1);
                } else if (eel.d(deviceInfo.getProductType())) {
                    LogUtil.a("DeviceMoreListActivity", "Connected AW70 target device disable");
                    deviceInfo.setDeviceActiveState(0);
                    deviceInfo.setDeviceConnectState(3);
                } else {
                    LogUtil.j("DeviceMoreListActivity", "handleDeviceState is other");
                }
            }
            return;
        }
        LogUtil.a("DeviceMoreListActivity", "handleWorkMode goingConnected == DeviceWorkMode.BAND_MODE");
        for (DeviceInfo deviceInfo2 : list) {
            if (dxyVar.d().equalsIgnoreCase(deviceInfo2.getDeviceIdentify())) {
                LogUtil.a("DeviceMoreListActivity", "handleWorkMode set device enable");
                deviceInfo2.setDeviceActiveState(1);
                deviceInfo2.setDeviceConnectState(1);
            }
            if (!dxyVar.d().equalsIgnoreCase(deviceInfo2.getDeviceIdentify()) && deviceInfo2.getAutoDetectSwitchStatus() != 1 && !rdp.d(dxyVar.g()) && deviceInfo2.getDeviceActiveState() == 1) {
                LogUtil.a("DeviceMoreListActivity", "handleWorkMode target device disable");
                deviceInfo2.setDeviceActiveState(0);
                deviceInfo2.setDeviceConnectState(3);
            }
        }
        dxx.d().j();
    }

    private void b(int i) {
        if (this.f25277b == null) {
            LogUtil.j("DeviceMoreListActivity", "showTipDialog mContext is null");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f25277b).a(this.f25277b.getResources().getString(i)).c(R.string.IDS_ota_update_know, new View.OnClickListener() { // from class: roz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.j("DeviceMoreListActivity", "showTipDialog，click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public void a() {
        LogUtil.a("DeviceMoreListActivity", "enter initList");
        this.u.clear();
        ExecutorService executorService = this.g;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.5
                @Override // java.lang.Runnable
                public void run() {
                    ArrayList arrayList = new ArrayList(16);
                    ArrayList arrayList2 = new ArrayList(16);
                    DeviceMoreListActivity.this.d((List<dru>) arrayList, (List<dru>) arrayList2);
                    arrayList.addAll(efl.b());
                    ArrayList<dru> arrayListC = rtk.c();
                    if (njy.b(arrayListC)) {
                        DeviceMoreListActivity.this.d((List<dru>) arrayList, arrayListC);
                        arrayList.addAll(arrayListC);
                    }
                    Collections.sort(arrayList2);
                    Collections.sort(arrayList);
                    arrayList.addAll(0, arrayList2);
                    Handler handler = DeviceMoreListActivity.this.i;
                    if (handler == null) {
                        return;
                    }
                    Message messageObtainMessage = handler.obtainMessage();
                    messageObtainMessage.obj = arrayList;
                    messageObtainMessage.what = 12;
                    handler.sendMessage(messageObtainMessage);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<dru> list, ArrayList<dru> arrayList) {
        Iterator<dru> it = list.iterator();
        while (it.hasNext()) {
            dru next = it.next();
            if (next.d() != null) {
                String asString = next.d().getAsString("mac");
                if (!TextUtils.isEmpty(asString)) {
                    for (dru druVar : arrayList) {
                        if (druVar.d() != null && asString.equals(druVar.d().getAsString("uniqueId"))) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<dru> list, List<dru> list2) {
        ArrayList<dxy> arrayListJ = lvl.j();
        int iD = d(arrayListJ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(16);
        int i = 0;
        this.e = 0;
        this.r = false;
        Iterator<dxy> it = arrayListJ.iterator();
        while (it.hasNext()) {
            e(it.next(), iD, jCurrentTimeMillis, arrayList);
        }
        for (dxy dxyVar : arrayListJ) {
            dru druVar = new dru();
            druVar.d(1);
            druVar.c(1);
            druVar.b(dxyVar.k());
            druVar.c(dxyVar);
            if (dxyVar.c() == 1 && dxyVar.b() == 2 && !rdp.d(dxyVar.g())) {
                b(jCurrentTimeMillis, iD, dxyVar, druVar);
                d(list2, druVar);
                iD = iD;
            } else {
                if (!this.q && dxyVar.h() && lvl.a() > 3 && !rdp.d(dxyVar.g())) {
                    i++;
                    LogUtil.a("DeviceMoreListActivity", "WearDeviceUtils.getCloudDeviceCount():", Integer.valueOf(lvl.a()), "cloudCount:", Integer.valueOf(i));
                    if ((this.e == 1 && i > 2) || i > 3) {
                        break;
                    }
                }
                e(list, arrayList, dxyVar, druVar);
            }
            iD = iD;
        }
        LogUtil.a("DeviceMoreListActivity", "has wear deviceInfoForWears : ", arrayListJ.toArray());
        d(list, list2, arrayList);
    }

    private void e(dxy dxyVar, int i, long j, List<dru> list) {
        if (rdp.d(dxyVar.g())) {
            dru druVar = new dru();
            druVar.d(1);
            druVar.c(1);
            druVar.b(dxyVar.k());
            druVar.c(dxyVar);
            if (dxyVar.h()) {
                this.e++;
                druVar.d(dxyVar.j());
                LogUtil.a("DeviceMoreListActivity", "deviceInfoForWear name: ", dxyVar.i(), "deviceInfoForWear last connected time:", Long.valueOf(dxyVar.j()));
            } else if (dxyVar.c() == 1 && dxyVar.b() == 2) {
                this.n = true;
                b(j, i, dxyVar, druVar);
            } else {
                druVar.d(dxyVar.j());
                LogUtil.a("DeviceMoreListActivity", "deviceInfoForWear name: ", dxyVar.i(), "deviceInfoForWear last connected time:", Long.valueOf(dxyVar.j()));
            }
            list.add(druVar);
        }
    }

    private void d(List<dru> list, List<dru> list2, List<dru> list3) {
        String strSubstring;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (dru druVar : list3) {
            if (druVar.i() instanceof dxy) {
                String strI = ((dxy) druVar.i()).i();
                if (!strI.contains(com.huawei.openalliance.ad.constant.Constants.LINK)) {
                    strSubstring = "";
                } else {
                    strSubstring = strI.substring(0, strI.lastIndexOf(com.huawei.openalliance.ad.constant.Constants.LINK));
                }
                if (linkedHashMap.containsKey(strSubstring)) {
                    ((List) linkedHashMap.get(strSubstring)).add(druVar);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(druVar);
                    linkedHashMap.put(strSubstring, arrayList);
                }
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            dru druVar2 = new dru();
            List<dru> list4 = (List) entry.getValue();
            if (njy.b(list4)) {
                Collections.sort(list4);
                dru druVar3 = list4.get(0);
                if (list4.size() == 1) {
                    this.r = true;
                    druVar2 = druVar3;
                } else {
                    this.r = false;
                    this.n = false;
                    druVar2.d(4);
                    druVar2.d(druVar3.c());
                    druVar2.c((String) entry.getKey());
                    druVar2.b(list4);
                }
                if (druVar3.i() instanceof dxy) {
                    b(list, list2, druVar3, druVar2);
                }
            }
        }
        d();
    }

    private void b(List<dru> list, List<dru> list2, dru druVar, dru druVar2) {
        if (((dxy) druVar.i()).b() == 2) {
            rtk.a(list2, druVar2);
        } else {
            list.add(druVar2);
        }
    }

    private void e(List<dru> list, List<dru> list2, dxy dxyVar, dru druVar) {
        druVar.d(dxyVar.j());
        LogUtil.a("DeviceMoreListActivity", "deviceInfoForWear name: ", dxyVar.i(), "deviceInfoForWear last connected time:", Long.valueOf(dxyVar.j()));
        if (rdp.d(dxyVar.g())) {
            return;
        }
        list.add(druVar);
    }

    private void b(long j, int i, dxy dxyVar, dru druVar) {
        if (i > 1) {
            druVar.d(((long) this.aa.get(dxyVar.d()).intValue()) + j);
            LogUtil.a("DeviceMoreListActivity", "DEFAULT_CONNECTED_DEVICE_NUMBER : ", dxyVar.i(), this.aa.get(dxyVar.d()));
        } else {
            druVar.d(j);
        }
        LogUtil.a("DeviceMoreListActivity", "deviceInfoForWear name: ", dxyVar.i(), "deviceInfoForWear current connected time:", Long.valueOf(j), ",compareTime:", Long.valueOf(druVar.c()));
    }

    private void d(List<dru> list, dru druVar) {
        if (!list.isEmpty()) {
            Object objI = list.get(0).i();
            if (objI instanceof dxy) {
                if (((dxy) objI).b() == 2) {
                    LogUtil.a("DeviceMoreListActivity", "add to normal");
                    b(list, druVar);
                    return;
                } else {
                    LogUtil.a("DeviceMoreListActivity", "add to first");
                    list.add(0, druVar);
                    return;
                }
            }
            return;
        }
        list.add(druVar);
    }

    private void b(List<dru> list, dru druVar) {
        if (list.size() > 1) {
            list.add(1, druVar);
        } else {
            list.add(druVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        String str;
        for (dru druVar : this.u) {
            if (druVar.i() instanceof dxy) {
                dxy dxyVar = (dxy) druVar.i();
                CardDeviceAdapter cardDeviceAdapter = this.f25278c;
                if (cardDeviceAdapter != null && cardDeviceAdapter.d() && (str = this.x) != null && str.equals(dxyVar.d())) {
                    dxyVar.b(1);
                }
            }
        }
        g();
    }

    private void g() {
        int i;
        this.w.clear();
        if (qrs.af(this.f25277b) && this.u.size() == 1) {
            this.w.addAll(this.u);
            dru druVar = new dru();
            druVar.d(2);
            this.w.add(druVar);
        } else {
            this.w.addAll(this.u);
        }
        this.f25278c.c(this.w);
        if (qrs.af(this.f25277b)) {
            if (this.y.getItemDecorationCount() > 0 && this.y.getItemDecorationAt(0) != null) {
                this.y.removeItemDecorationAt(0);
            }
            this.y.addItemDecoration(new DeviceItemDecoration(qqp.a(this.f25277b, 12.0f), 0));
            i = 2;
        } else {
            i = 1;
        }
        this.y.setLayoutManager(new GridLayoutManager(this.f25277b, i, 1, false) { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.12
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        boolean z = this.e == 1 && this.r && lvl.a() - this.e > 2;
        boolean z2 = lvl.a() - this.e > 3;
        if ((z || z2) && !this.q) {
            this.s.setVisibility(0);
        } else {
            this.s.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(DeviceInfo deviceInfo, Handler handler) {
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.obj = deviceInfo.getDeviceIdentify();
        LogUtil.a("DeviceMoreListActivity", "deviceInfo.getDeviceConnectState():", Integer.valueOf(deviceInfo.getDeviceConnectState()));
        if (deviceInfo.getDeviceConnectState() == 2) {
            messageObtainMessage.what = 30;
            handler.sendMessage(messageObtainMessage);
            c(deviceInfo);
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 3 || deviceInfo.getDeviceConnectState() == 4) {
            messageObtainMessage.what = 32;
            messageObtainMessage.arg1 = deviceInfo.getProductType();
            handler.sendMessage(messageObtainMessage);
            dxx.d().f(-1);
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 1 || deviceInfo.getDeviceConnectState() == 9 || deviceInfo.getDeviceConnectState() == 10) {
            messageObtainMessage.what = 33;
            messageObtainMessage.arg1 = deviceInfo.getDeviceConnectState();
            handler.sendMessage(messageObtainMessage);
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 6 || deviceInfo.getDeviceConnectState() == 5) {
            handler.removeMessages(36);
            Message messageObtain = Message.obtain();
            messageObtain.arg1 = deviceInfo.getProductType();
            messageObtain.what = 36;
            messageObtain.obj = messageObtainMessage.obj;
            handler.sendMessage(messageObtain);
            if (deviceInfo.getDeviceConnectState() == 5) {
                p();
                return;
            }
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 11) {
            a(deviceInfo);
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 12) {
            e(deviceInfo);
        } else if (deviceInfo.getDeviceConnectState() == 15) {
            d(deviceInfo, handler, messageObtainMessage);
        } else {
            LogUtil.j("DeviceMoreListActivity", "mNonLocalBroadcastReceiver() other state");
        }
    }

    private void d(DeviceInfo deviceInfo, Handler handler, Message message) {
        if (!CommonUtil.i(this.f25277b, "com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity")) {
            LogUtil.j("DeviceMoreListActivity", "activity is not isForeground");
            return;
        }
        this.h = deviceInfo;
        mgh.a(this);
        message.what = 33;
        message.arg1 = deviceInfo.getDeviceConnectState();
        handler.sendMessage(message);
    }

    private void a(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceFactoryReset() == 1) {
            if (AgreementDeclarationActivity.d || BasePairManagerJsApi.isOpen) {
                LogUtil.j("DeviceMoreListActivity", "oobe already is open");
                return;
            }
            if (this != BaseApplication.getActivity()) {
                LogUtil.j("DeviceMoreListActivity", "not current activity");
                return;
            }
            Intent intent = new Intent();
            intent.setClass(this.f25277b, AgreementDeclarationActivity.class);
            intent.putExtra("pairGuideSelectAddress", deviceInfo.getDeviceIdentify());
            Bundle bundle = new Bundle();
            bundle.putParcelable("deviceInfo", deviceInfo);
            intent.putExtras(bundle);
            intent.putExtra("device_country_code", deviceInfo.getCountryCode());
            intent.putExtra("device_emui_version", deviceInfo.getEmuiVersion());
            rtk.d(this.f25277b, intent, "AgreementDeclarationActivity");
        }
    }

    private void e(DeviceInfo deviceInfo) {
        d(deviceInfo);
    }

    private void d(DeviceInfo deviceInfo) {
        if (!CommonUtil.i(this.f25277b, "com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity")) {
            LogUtil.j("DeviceMoreListActivity", "activity is not isForeground");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f25276a;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.f25276a.cancel();
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(String.format(Locale.ENGLISH, getString(R.string.IDS_kid_oobe_pair_tips), deviceInfo.getDeviceName())).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("DeviceMoreListActivity", "showKidAccountNotSupportPairDialog, click");
            }
        }).c();
        this.f25276a = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (this.f25276a.isShowing() || isFinishing()) {
            return;
        }
        this.f25276a.show();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        UserLabelServiceApi userLabelServiceApi = this.ab;
        if (userLabelServiceApi != null) {
            userLabelServiceApi.unRegisterCallback(4);
            this.ab.unRegisterCallback(5);
        }
        this.f25277b = null;
        if (CommonUtil.ck()) {
            s();
            y();
            u();
        }
    }

    private void c(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 112);
        LogUtil.a("DeviceMoreListActivity", "afterConnectedProcess. isSupportEarPhone: ", Boolean.valueOf(zD));
        if (zD && CommonUtil.i(this.f25277b, "com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity")) {
            LogUtil.a("DeviceMoreListActivity", "afterConnectedProcess. in");
            lxb.c().b(deviceInfo, new AnonymousClass2(deviceInfo));
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity$2, reason: invalid class name */
    public class AnonymousClass2 implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f25286b;

        AnonymousClass2(DeviceInfo deviceInfo) {
            this.f25286b = deviceInfo;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            DeviceMoreListActivity deviceMoreListActivity = DeviceMoreListActivity.this;
            final DeviceInfo deviceInfo = this.f25286b;
            deviceMoreListActivity.runOnUiThread(new Runnable() { // from class: roy
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(deviceInfo);
                }
            });
        }

        public /* synthetic */ void d(DeviceInfo deviceInfo) {
            Intent intent = new Intent();
            intent.setClass(DeviceMoreListActivity.this.f25277b, EarphonePairActivity.class);
            intent.putExtra("device_identify", deviceInfo.getDeviceIdentify());
            DeviceMoreListActivity.this.startActivity(intent);
        }
    }

    private void u() {
        res.d().c();
        try {
            if (this.t != null) {
                LogUtil.a("DeviceMoreListActivity", "mPairBroadcastReceiver mReceiver != null");
                LocalBroadcastManager.getInstance().unregisterReceiver(this.t);
                this.t = null;
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.e("DeviceMoreListActivity", "unregisterPairBroadcastReceiver is error");
        }
    }

    private int d(ArrayList<dxy> arrayList) {
        ArrayList arrayList2 = new ArrayList(16);
        int i = 0;
        for (dxy dxyVar : arrayList) {
            if (dxyVar.c() == 1 && dxyVar.b() == 2) {
                i++;
                dru druVar = new dru();
                druVar.c(dxyVar);
                druVar.d(dxyVar.j());
                arrayList2.add(druVar);
            }
        }
        if (i > 1) {
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((dru) arrayList2.get(i2)).i() instanceof dxy) {
                    dxy dxyVar2 = (dxy) ((dru) arrayList2.get(i2)).i();
                    LogUtil.d("DeviceMoreListActivity", "getConnectedDevices connectedDevice name:", dxyVar2.i());
                    this.aa.put(dxyVar2.d(), Integer.valueOf((size - i2) * 10));
                }
            }
        }
        LogUtil.a("DeviceMoreListActivity", "getConnectedDevices connectedCount:", Integer.valueOf(i));
        return i;
    }

    private void c() {
        LogUtil.a("DeviceMoreListActivity", "enter checkEnableDevice");
        ExecutorService executorService = this.g;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.10
                @Override // java.lang.Runnable
                public void run() {
                    if (BTDeviceMgrUtil.c().h() != 3) {
                        LogUtil.j("DeviceMoreListActivity", "checkEnableDevice bluetooth off");
                        return;
                    }
                    List<DeviceInfo> listG = dxx.d().g();
                    if (listG == null || listG.size() <= 0) {
                        LogUtil.j("DeviceMoreListActivity", "checkEnableDevice return");
                        return;
                    }
                    Iterator<dxy> it = lvl.j().iterator();
                    int i = 0;
                    while (it.hasNext() && (!rdp.d(it.next().g()) || (i = i + 1) <= 1)) {
                    }
                    for (DeviceInfo deviceInfo : listG) {
                        if (i != 2 || !rdp.d(deviceInfo.getProductType())) {
                            if (deviceInfo.getDeviceBluetoothType() == 2 && deviceInfo.getDeviceActiveState() == 1 && (deviceInfo.getDeviceConnectState() == 3 || deviceInfo.getDeviceConnectState() == 4)) {
                                DeviceMoreListActivity.this.b(deviceInfo, listG);
                            }
                        }
                    }
                    deviceInfo = null;
                    DeviceMoreListActivity.this.b(deviceInfo, listG);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(DeviceInfo deviceInfo, List<DeviceInfo> list) {
        if (deviceInfo != null) {
            LogUtil.a("DeviceMoreListActivity", "reconnect active device ", deviceInfo);
            deviceInfo.setDeviceConnectState(1);
            tfn.a().d(list, deviceInfo.getDeviceIdentify());
            d(deviceInfo.getDeviceIdentify());
            this.f25278c.c(true);
            this.k = false;
            Handler handler = this.i;
            if (handler == null) {
                return;
            }
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = 45;
            handler.sendMessage(messageObtainMessage);
            handler.sendMessageDelayed(rtk.c(0, deviceInfo.getProductType()), 20000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(str);
        rcv.a(this.f25277b).b((List<String>) arrayList, true);
    }

    private void f() {
        ExecutorService executorService = this.g;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.9
                @Override // java.lang.Runnable
                public void run() {
                    if (DeviceMoreListActivity.this.m) {
                        return;
                    }
                    List<DeviceInfo> listG = dxx.d().g();
                    if (listG == null || listG.isEmpty()) {
                        LogUtil.j("DeviceMoreListActivity", "enter applyLocationPermission deviceList is null");
                        return;
                    }
                    for (DeviceInfo deviceInfo : listG) {
                        if (deviceInfo != null && deviceInfo.getDeviceActiveState() == 1 && deviceInfo.getDeviceConnectState() == 2) {
                            DeviceMoreListActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.9.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    DeviceMoreListActivity.this.b();
                                    DeviceMoreListActivity.this.m = true;
                                }
                            });
                            return;
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("DeviceMoreListActivity", "in add Location Permissions.");
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        if (lsg.d(this.f25277b, strArr)) {
            return;
        }
        lsg.a(this, strArr, null);
        CommonUtil.k(this.f25277b, "android.permission.ACCESS_COARSE_LOCATION");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == 2) {
            qtv.e(intent, this, qtv.c(i2, true, intent.getIntExtra("product_type", -1), true));
        }
        if (i == 608) {
            ReleaseLogUtil.d("DeviceMoreListActivity", "SENSITIVE_PERMISSION_STATUS resultCode", Integer.valueOf(i2));
            res.d().c(String.valueOf(i2));
            if (i2 == -1) {
                SharedPreferenceManager.c("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", SensitivePermissionStatus.RESTART.getValue());
                res.d().a("DeviceMoreListActivity", intent);
                res.d().b();
                return;
            }
            rdp.e(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity.7
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i3, Object obj) {
                    if (i3 == -1) {
                        res.d().e(DeviceMoreListActivity.this.f25277b);
                    } else {
                        res.d().c(String.valueOf(608));
                        res.d().b();
                    }
                }
            }, this.f25277b);
            return;
        }
        mgh.a(i, i2, intent, this.h);
    }

    private void r() {
        rdp.a((ComponentActivity) this);
    }

    /* JADX INFO: loaded from: classes17.dex */
    static class e implements WearPlaceCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<DeviceMoreListActivity> f25301b;

        e(DeviceMoreListActivity deviceMoreListActivity) {
            this.f25301b = new WeakReference<>(deviceMoreListActivity);
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdevicemodemgr.callback.WearPlaceCallback
        public void onResponse(DeviceInfo deviceInfo, int i) {
            DeviceMoreListActivity deviceMoreListActivity = this.f25301b.get();
            if (deviceInfo != null) {
                Handler handler = deviceMoreListActivity.i;
                if (handler == null) {
                    return;
                }
                handler.sendEmptyMessage(34);
                return;
            }
            LogUtil.j("DeviceMoreListActivity", "WearHomePlaceCallback enter deviceInfo = null");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
