package com.huawei.ui.homehealth.device.devicelist;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwdevicemodemgr.callback.WearPlaceCallback;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity;
import com.huawei.ui.device.activity.pairing.DevicePairGuideUtil;
import com.huawei.ui.device.utlis.BluetoothPermisionUtils;
import com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter;
import com.huawei.ui.homehealth.device.callback.ReconnectCallback;
import com.huawei.ui.homehealth.device.view.DeviceItemDecoration;
import com.huawei.ui.homehealth.view.CloudReconnectFailDialog;
import com.huawei.ui.main.stories.userprofile.activity.WorkModeConflictDialogActivity;
import defpackage.dru;
import defpackage.dxx;
import defpackage.dxy;
import defpackage.edl;
import defpackage.lon;
import defpackage.lvi;
import defpackage.lvl;
import defpackage.lwt;
import defpackage.maq;
import defpackage.mgh;
import defpackage.qqp;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.rct;
import defpackage.rcw;
import defpackage.rdp;
import defpackage.res;
import defpackage.rfi;
import defpackage.rtk;
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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class MoreSportDeviceActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f25302a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f25304c;
    private CardDeviceAdapter e;
    private HealthTextView g;
    private Context h;
    private HealthTextView k;
    private DeviceInfo m;
    private HealthButton q;
    private String s;
    private HealthRecycleView x;
    private List<dru> t = new ArrayList(16);
    private Handler n = new d(this);
    private CustomTextAlertDialog i = null;
    private String f = "";
    private boolean l = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NoTitleCustomAlertDialog f25303b = null;
    private String d = "";
    private boolean p = false;
    private NoTitleCustomAlertDialog j = null;
    private final BroadcastReceiver r = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler;
            DeviceInfo deviceInfo;
            if (context == null || intent == null || (handler = MoreSportDeviceActivity.this.n) == null) {
                return;
            }
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || "com.huawei.health.action.CLOUD_CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                try {
                    if (!(intent.getParcelableExtra("deviceinfo") instanceof DeviceInfo) || (deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo")) == null) {
                        return;
                    }
                    MoreSportDeviceActivity.this.a(deviceInfo, handler);
                    return;
                } catch (ClassCastException unused) {
                    LogUtil.e("MoreSportDeviceActivity", "DeviceInfo deviceInfo error ClassCastException");
                    return;
                }
            }
            if ("com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS".equals(intent.getAction())) {
                MoreSportDeviceActivity.this.a(false);
            } else {
                LogUtil.j("MoreSportDeviceActivity", "mNonLocalBroadcastReceiver()  intent : ", intent.getAction());
            }
        }
    };
    private final BroadcastReceiver o = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = MoreSportDeviceActivity.this.n;
            if (handler == null || intent == null || !"com.huawei.bone.action.BATTERY_LEVEL".equals(intent.getAction()) || intent.getExtras() == null) {
                return;
            }
            handler.sendEmptyMessage(34);
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void loadApplicationTheme() {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        LogUtil.a("MoreSportDeviceActivity", "onCreate()");
        getWindow().setBackgroundDrawable(getResources().getDrawable(R.drawable.more_sport_layout_bg));
        getWindow().setLayout(-1, -1);
        setContentView(R.layout.more_sport_device_layout);
        this.h = this;
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("MoreSportDeviceActivity", "intent == null");
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("common_device_name");
        this.f = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            LogUtil.j("MoreSportDeviceActivity", "TextUtils.isEmpty(mCommonName)");
            finish();
        } else {
            d();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        LogUtil.a("MoreSportDeviceActivity", "onStart");
        if (CommonUtil.ck()) {
            f();
            i();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.l = false;
        g();
        a(true);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity.2
            @Override // java.lang.Runnable
            public void run() {
                tfn.a().h();
                lwt.d().e(new e(MoreSportDeviceActivity.this), "MoreSportDeviceActivity");
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void f() {
        LogUtil.a("MoreSportDeviceActivity", "enter registerNonLocalBroadcastReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.health.action.CLOUD_CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.DEVICE_THIRD_DELETE");
        intentFilter.addAction("com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS");
        intentFilter.addAction("broadcast_receiver_user_setting");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.r, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void k() {
        try {
            BaseApplication.getContext().unregisterReceiver(this.r);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("MoreSportDeviceActivity", "unRegisterNonLocalBroadcastReceiver IllegalArgumentException");
        }
    }

    private void i() {
        LogUtil.a("MoreSportDeviceActivity", "enter registerBatteryBroadcast");
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.BATTERY_LEVEL");
        intentFilter.addAction("com.huawei.bone.action.BATTERY_LEVEL");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.o, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void n() {
        try {
            BaseApplication.getContext().unregisterReceiver(this.o);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("MoreSportDeviceActivity", "unRegisterBatteryBroadcast IllegalArgumentException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DeviceInfo deviceInfo, Handler handler) {
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.obj = deviceInfo.getDeviceIdentify();
        LogUtil.a("MoreSportDeviceActivity", "deviceInfo.getDeviceConnectState():", Integer.valueOf(deviceInfo.getDeviceConnectState()));
        if (deviceInfo.getDeviceConnectState() == 2) {
            messageObtainMessage.what = 30;
            handler.sendMessage(messageObtainMessage);
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
                l();
                return;
            }
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 11) {
            if (deviceInfo.getDeviceFactoryReset() == 1 && CommonUtil.i(this.h, "com.huawei.health.MainActivity")) {
                Intent intent = new Intent();
                intent.setClass(this.h, AgreementDeclarationActivity.class);
                intent.putExtra("pairGuideSelectAddress", deviceInfo.getDeviceIdentify());
                Bundle bundle = new Bundle();
                bundle.putParcelable("deviceInfo", deviceInfo);
                intent.putExtras(bundle);
                intent.putExtra("device_country_code", deviceInfo.getCountryCode());
                intent.putExtra("device_emui_version", deviceInfo.getEmuiVersion());
                rtk.d(this.h, intent, "AgreementDeclarationActivity");
                return;
            }
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 12) {
            b(deviceInfo);
        } else {
            a(deviceInfo, handler, messageObtainMessage);
        }
    }

    private void a(DeviceInfo deviceInfo, Handler handler, Message message) {
        if (deviceInfo.getDeviceConnectState() == 15) {
            if (!CommonUtil.i(this.h, "com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity")) {
                LogUtil.j("MoreSportDeviceActivity", "activity is not foreground");
                return;
            }
            this.m = deviceInfo;
            mgh.a(this);
            message.what = 33;
            message.arg1 = deviceInfo.getDeviceConnectState();
            handler.sendMessage(message);
            return;
        }
        LogUtil.j("MoreSportDeviceActivity", "mNonLocalBroadcastReceiver() other state");
    }

    private void b(DeviceInfo deviceInfo) {
        e(deviceInfo);
    }

    private void e(DeviceInfo deviceInfo) {
        if (!CommonUtil.i(this.h, "com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity")) {
            LogUtil.j("MoreSportDeviceActivity", "activity is not foreground");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.j;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.j.cancel();
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(String.format(Locale.ENGLISH, getString(R.string.IDS_kid_oobe_pair_tips), deviceInfo.getDeviceName())).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("MoreSportDeviceActivity", "showKidAccountNotSupportPairDialog, click");
            }
        }).c();
        this.j = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (this.j.isShowing() || isFinishing()) {
            return;
        }
        this.j.show();
    }

    private void l() {
        LogUtil.a("MoreSportDeviceActivity", "showBandUnavailableDialog");
        if (CommonUtil.i(this.h, "com.huawei.health.MainActivity")) {
            CustomTextAlertDialog customTextAlertDialog = this.i;
            if (customTextAlertDialog != null && customTextAlertDialog.isShowing()) {
                LogUtil.j("MoreSportDeviceActivity", "showBandUnavailableDialog Already show!");
                return;
            }
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.h).a(R.string.IDS_service_area_notice_title).a(this.h.getString(R.string.IDS_band_is_unavailable_tip_string_newphone)).a(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: rph
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.j("MoreSportDeviceActivity", "view onClick");
                }
            }).b();
            this.i = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            if (this.i.isShowing() || isFinishing()) {
                return;
            }
            this.i.show();
        }
    }

    private void d() {
        this.k = (HealthTextView) qsp.a(this, R.id.empty_tv);
        this.g = (HealthTextView) qsp.a(this, R.id.common_name_tv);
        this.x = (HealthRecycleView) qsp.a(this, R.id.sport_list);
        this.f25302a = (RelativeLayout) qsp.a(this, R.id.more_sport_layout);
        this.f25304c = (HealthTextView) qsp.a(this, R.id.awaken_tv);
        this.q = (HealthButton) qsp.a(this, R.id.reconnect_all_device_button);
        this.f25302a.setOnClickListener(new View.OnClickListener() { // from class: rpf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47559b.d(view);
            }
        });
        this.q.setOnClickListener(new View.OnClickListener() { // from class: rpe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(view);
            }
        });
        this.g.setText(this.f);
        o();
    }

    public /* synthetic */ void d(View view) {
        onBackPressed();
    }

    public /* synthetic */ void e(View view) {
        this.p = true;
        a();
    }

    private void a() {
        if (!rct.e(this.h)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity.9
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("MoreSportDeviceActivity", "getHarmonyStatus getValue");
                    String strD = lon.c().d("scale_share_harmony_tips");
                    DevicePairGuideUtil.e(strD);
                    LogUtil.a("MoreSportDeviceActivity", "getHarmonyStatus scale_share_harmony_tips: ", strD);
                    MoreSportDeviceActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity.9.2
                        @Override // java.lang.Runnable
                        public void run() {
                            String string;
                            if ("on".equals(DevicePairGuideUtil.b())) {
                                string = BaseApplication.getContext().getString(R.string.IDS_btsdk_turn_on_location_harmony);
                            } else {
                                string = BaseApplication.getContext().getString(R.string.IDS_btsdk_turn_on_location);
                            }
                            tqp.e(MoreSportDeviceActivity.this.h, string);
                        }
                    });
                }
            });
        } else {
            c();
        }
    }

    private void c() {
        if (Build.VERSION.SDK_INT > 30) {
            PermissionUtil.d(this.h, PermissionUtil.PermissionType.SCAN, new BluetoothPermisionUtils.NearbyPermissionAction(this.h) { // from class: com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity.7
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("MoreSportDeviceActivity", "checkBluetoothPermission nearby permission granted");
                    MoreSportDeviceActivity.this.j();
                }
            });
        } else {
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (BTDeviceMgrUtil.c().h() != 3) {
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.h).a(this.h.getResources().getString(R.string.IDS_device_bluetooth_open_request)).a(R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: rpb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.b(view);
                }
            }).c(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: rpa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47557a.f(view);
                }
            }).c();
            this.f25303b = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
            this.f25303b.show();
            return;
        }
        this.l = false;
        g();
        a(true);
    }

    public /* synthetic */ void b(View view) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f25303b;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.f25303b = null;
        }
    }

    public /* synthetic */ void f(View view) {
        e();
        this.l = false;
        g();
        a(true);
    }

    private void e() {
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1002);
    }

    private void o() {
        if (this.t.size() > 6) {
            this.k.setVisibility(4);
        } else {
            this.k.setVisibility(8);
        }
        CardDeviceAdapter cardDeviceAdapter = new CardDeviceAdapter(this.h, this, new CardDeviceAdapter.PersonalItemReconnectListener() { // from class: com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity.10
            @Override // com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.PersonalItemReconnectListener
            public void onReconnect(dxy dxyVar) {
                LogUtil.a("MoreSportDeviceActivity", "setRecyclerView onReconnect");
                MoreSportDeviceActivity.this.d(dxyVar);
            }

            @Override // com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.PersonalItemReconnectListener
            public void onPersonalEquipment(int i, View view) {
                LogUtil.a("MoreSportDeviceActivity", "setRecyclerView onPersonalEquipment");
                MoreSportDeviceActivity.this.b(i);
            }

            @Override // com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.PersonalItemReconnectListener
            public void onMoreEquipment() {
                LogUtil.a("MoreSportDeviceActivity", "onMoreEquipment");
            }
        });
        this.e = cardDeviceAdapter;
        cardDeviceAdapter.c(this.t);
        this.x.setAdapter(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (!qrs.r() && i >= 0 && i < this.t.size()) {
            d(i);
        }
    }

    private void d(int i) {
        e(this.t.get(i), this.e.d());
    }

    private void e(dru druVar, boolean z) {
        String str;
        LogUtil.a("MoreSportDeviceActivity", "onItemClick wear");
        dxy dxyVar = (dxy) druVar.i();
        if (z && (str = this.s) != null && !str.equals(dxyVar.d()) && dxyVar.b() != 2) {
            LogUtil.j("MoreSportDeviceActivity", "other devices is connection,can not start activity.");
            return;
        }
        if (dxyVar.b() == 2) {
            a(dxyVar.d());
        } else if (dxyVar.h()) {
            c(dxyVar);
        } else {
            a(dxyVar.d());
        }
    }

    private void c(dxy dxyVar) {
        Intent intent = new Intent();
        intent.setClassName(this.h, "com.huawei.ui.homehealth.devicemanagercard.DeviceManagerWearNoConnect");
        intent.putExtra("is_cloud_device", dxyVar.h());
        intent.putExtra("device_name", dxyVar.i());
        intent.putExtra("device_identify", dxyVar.d());
        intent.putExtra("device_picID", dxyVar.o());
        intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, dxyVar.g());
        rtk.d(this.h, intent, "com.huawei.ui.homehealth.devicemanagercard.DeviceManagerWearNoConnect");
        tqp.e(this.h);
        LogUtil.a("MoreSportDeviceActivity", "onclick wear not connected name:", dxyVar.i(), "device_type :", Integer.valueOf(dxyVar.g()));
        finish();
    }

    private void a(String str) {
        LogUtil.a("MoreSportDeviceActivity", "Enter openWearHome");
        if (maq.b().c(str) == 6) {
            LogUtil.a("MoreSportDeviceActivity", "wear device is OTAing");
            Intent intent = new Intent();
            intent.setClassName(this.h, "com.huawei.ui.device.activity.update.UpdateVersionActivity");
            intent.putExtra("device_id", str);
            rtk.d(this.h, intent, "com.huawei.ui.device.activity.update.UpdateVersionActivity");
        } else {
            SharedPreferenceManager.e(this.h, String.valueOf(10099), "key_ui_nps_enter_wear_home", "true", null);
            Intent intent2 = new Intent();
            intent2.setClassName(this.h, "com.huawei.ui.homewear21.home.WearHomeActivity");
            intent2.putExtra("device_id", str);
            rtk.d(this.h, intent2, "com.huawei.ui.homewear21.home.WearHomeActivity");
            tqp.e(this.h);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(dxy dxyVar) {
        rcw.b(this.h).g(dxyVar.d());
        e(dxyVar, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(dxy dxyVar, int i) {
        if (maq.b().f()) {
            LogUtil.a("MoreSportDeviceActivity", "user choose connect other wear device is OTAing");
            e(R.string.IDS_main_device_ota_error_message);
            return;
        }
        final List<DeviceInfo> listD = lvl.d();
        a(dxyVar, listD);
        String strD = dxyVar.d();
        final DownloadCloudDeviceResource downloadCloudDeviceResource = new DownloadCloudDeviceResource();
        if (dxyVar.h()) {
            LogUtil.a("MoreSportDeviceActivity", "deviceInfoForWear.getIsCloudDevice()");
            res.d().a(dxyVar.g(), dxyVar.i(), strD, this);
            strD = dxyVar.g() + Constants.LINK + dxyVar.d();
        } else {
            downloadCloudDeviceResource.e();
        }
        final String str = strD;
        final boolean zH = dxyVar.h();
        final String strF = dxyVar.f();
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity.6
            @Override // java.lang.Runnable
            public void run() {
                lvl.a((List<DeviceInfo>) listD, str);
                new rfi().b(downloadCloudDeviceResource, strF, zH, str, MoreSportDeviceActivity.this.h);
            }
        });
        this.n.removeMessages(31);
        this.n.sendMessageDelayed(rtk.c(zH, dxyVar, i), 20000L);
        LogUtil.a("MoreSportDeviceActivity", "device connect time out");
    }

    private void e(int i) {
        if (this.h == null) {
            LogUtil.j("MoreSportDeviceActivity", "showTipDialog mContext is null");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.h).a(this.h.getResources().getString(i)).c(R.string.IDS_ota_update_know, new View.OnClickListener() { // from class: rpd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.j("MoreSportDeviceActivity", "showTipDialog，click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void a(dxy dxyVar, List<DeviceInfo> list) {
        if (dxyVar == null || list == null) {
            return;
        }
        LogUtil.a("MoreSportDeviceActivity", "handleWorkMode goingConnected == DeviceWorkMode.BAND_MODE");
        for (DeviceInfo deviceInfo : list) {
            if (dxyVar.d().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                LogUtil.a("MoreSportDeviceActivity", "handleWorkMode set device enable");
                deviceInfo.setDeviceActiveState(1);
                deviceInfo.setDeviceConnectState(1);
            }
        }
        dxx.d().j();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
        h();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        LogUtil.a("MoreSportDeviceActivity", "onStop");
        if (CommonUtil.ck()) {
            n();
            k();
        }
        Handler handler = this.n;
        if (handler != null) {
            handler.removeMessages(31);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1002) {
            LogUtil.a("MoreSportDeviceActivity", "onActivityResult BLUETOOTH_CODE");
        }
        if (i == 608) {
            ReleaseLogUtil.d("MoreSportDeviceActivity", "SENSITIVE_PERMISSION_STATUS resultCode", Integer.valueOf(i2));
            res.d().c(String.valueOf(i2));
            if (i2 == -1) {
                SharedPreferenceManager.c("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", SensitivePermissionStatus.RESTART.getValue());
                res.d().a("MoreSportDeviceActivity", intent);
                res.d().b();
                return;
            }
            rdp.e(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity.15
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i3, Object obj) {
                    if (i3 == -1) {
                        res.d().e(MoreSportDeviceActivity.this.h);
                    } else {
                        res.d().c(String.valueOf(608));
                        res.d().b();
                    }
                }
            }, this.h);
            return;
        }
        mgh.a(i, i2, intent, this.m);
    }

    public void a(final boolean z) {
        LogUtil.a("MoreSportDeviceActivity", "enter initList");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity.5
            @Override // java.lang.Runnable
            public void run() {
                MoreSportDeviceActivity.this.c(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        String strSubstring;
        LogUtil.a("MoreSportDeviceActivity", "enter initSportList");
        ArrayList<dxy> arrayListJ = lvl.j();
        ArrayList arrayList = new ArrayList(16);
        int iG = -1;
        for (dxy dxyVar : arrayListJ) {
            String strI = dxyVar.i();
            if (!strI.contains(Constants.LINK)) {
                strSubstring = "";
            } else {
                strSubstring = strI.substring(0, strI.lastIndexOf(Constants.LINK));
            }
            LogUtil.a("MoreSportDeviceActivity", "initDeviceList deviceName:", strI);
            if (rdp.d(dxyVar.g()) && TextUtils.equals(strSubstring, this.f)) {
                iG = dxyVar.g();
                if (TextUtils.isEmpty(this.d)) {
                    c(lvi.j(dxyVar.g()));
                }
                dru druVar = new dru();
                druVar.d(1);
                druVar.c(2);
                druVar.c(dxyVar);
                druVar.b(dxyVar.k());
                druVar.d(dxyVar.j());
                arrayList.add(druVar);
            }
        }
        LogUtil.a("MoreSportDeviceActivity", "has wear sportDeviceList.size:", Integer.valueOf(arrayList.size()), "; sportDeviceList:", arrayList);
        Collections.sort(arrayList);
        Handler handler = this.n;
        if (handler == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.obj = arrayList;
        messageObtainMessage.what = 12;
        messageObtainMessage.arg1 = !z ? 1 : 0;
        handler.sendMessage(messageObtainMessage);
        if (z) {
            handler.sendMessageDelayed(rtk.c(0, iG), 20000L);
        }
    }

    private void c(String str) {
        LogUtil.a("MoreSportDeviceActivity", "getConnectTip");
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(str);
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            return;
        }
        String strC = pluginInfoByUuid.i().c();
        this.d = strC;
        LogUtil.a("MoreSportDeviceActivity", "mAwakenDevice = ", strC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        return this.s;
    }

    public void b(String str) {
        this.s = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        DeviceInfo next;
        LogUtil.a("MoreSportDeviceActivity", "gotoConflictDialogActivity enter");
        if (this.h == null) {
            LogUtil.j("MoreSportDeviceActivity", "gotoConflictDialogActivity mContext is null");
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
                LogUtil.a("MoreSportDeviceActivity", "gotoConflictDialogActivity find connected device");
                break;
            }
        }
        if (next == null) {
            LogUtil.j("MoreSportDeviceActivity", "gotoConflictDialogActivity connectedDevice is null");
            return;
        }
        String str = String.format(Locale.ENGLISH, this.h.getString(R.string.IDS_work_mode_conflict_dialog_content), f(next.getProductType()), f(i));
        Intent intent = new Intent();
        intent.putExtra("content", str);
        intent.setClass(this.h, WorkModeConflictDialogActivity.class);
        rtk.d(this.h, intent, "WorkModeConflictDialogActivity");
    }

    private String f(int i) {
        DeviceInfo deviceInfoE = dxx.d().e();
        if (deviceInfoE == null) {
            return com.huawei.hms.hihealth.data.DeviceInfo.STR_TYPE_UNKNOWN;
        }
        String strI = "PORSCHE DESIGN";
        if ((TextUtils.isEmpty(deviceInfoE.getDeviceName()) || !"PORSCHE DESIGN".equals(deviceInfoE.getDeviceName())) && (TextUtils.isEmpty(deviceInfoE.getDeviceModel()) || !"PORSCHE DESIGN".equals(deviceInfoE.getDeviceModel()))) {
            strI = lvi.a(i).i();
        }
        LogUtil.a("MoreSportDeviceActivity", "transDeviceProductTypeIntToStr: mDeviceProductType ", strI);
        return strI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        String str;
        this.l = false;
        for (dru druVar : this.t) {
            if (druVar.i() instanceof dxy) {
                dxy dxyVar = (dxy) druVar.i();
                boolean z = (dxyVar.b() == 2 || dxyVar.b() == 1 || dxyVar.h()) ? false : true;
                int iH = BTDeviceMgrUtil.c().h();
                if (i == 0 && iH == 3 && z) {
                    a(dxyVar);
                } else {
                    CardDeviceAdapter cardDeviceAdapter = this.e;
                    if (cardDeviceAdapter != null && cardDeviceAdapter.d() && (str = this.s) != null && str.equals(dxyVar.d())) {
                        dxyVar.b(1);
                    } else if (z) {
                        this.l = true;
                    } else {
                        LogUtil.j("MoreSportDeviceActivity", "setDeviceList other mode");
                    }
                }
            }
        }
        this.p = false;
        h();
        this.f25304c.setText(this.d);
        g();
    }

    private void a(final dxy dxyVar) {
        this.l = false;
        final List<DeviceInfo> listG = dxx.d().g();
        dxyVar.b(1);
        a(dxyVar, listG);
        if (this.p) {
            final DownloadCloudDeviceResource downloadCloudDeviceResource = new DownloadCloudDeviceResource();
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    lvl.a((List<DeviceInfo>) listG, dxyVar.d());
                    new rfi().b(downloadCloudDeviceResource, dxyVar.f(), false, dxyVar.d(), MoreSportDeviceActivity.this.h);
                }
            });
        } else {
            tfn.a().d(listG, dxyVar.d());
        }
    }

    private void g() {
        this.q.setClickable(this.l);
        this.q.setEnabled(this.l);
        if (this.l) {
            this.q.setOnClickListener(new View.OnClickListener() { // from class: rpc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47558c.g(view);
                }
            });
        } else {
            this.q.setOnClickListener(null);
        }
    }

    public /* synthetic */ void g(View view) {
        this.p = true;
        a();
    }

    private void h() {
        if (this.t.size() > 6) {
            this.k.setVisibility(4);
        } else {
            this.k.setVisibility(8);
        }
        this.e.c(this.t);
        if (this.x.getItemDecorationCount() > 0 && this.x.getItemDecorationAt(0) != null) {
            this.x.removeItemDecorationAt(0);
        }
        this.x.addItemDecoration(new DeviceItemDecoration(qqp.a(this.h, 12.0f), 0));
        this.x.setLayoutManager(new GridLayoutManager(this.h, 2, 1, false) { // from class: com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity.12
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
    }

    static class d extends BaseHandler<MoreSportDeviceActivity> {
        d(MoreSportDeviceActivity moreSportDeviceActivity) {
            super(moreSportDeviceActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(MoreSportDeviceActivity moreSportDeviceActivity, Message message) {
            switch (message.what) {
                case 30:
                    LogUtil.a("MoreSportDeviceActivity", "connect device", Integer.valueOf(message.what));
                    if (message.obj instanceof String) {
                        String str = (String) message.obj;
                        if (!TextUtils.isEmpty(str) && str.equals(moreSportDeviceActivity.b())) {
                            removeMessages(31);
                            moreSportDeviceActivity.e.c(false);
                            moreSportDeviceActivity.b((String) null);
                        }
                        moreSportDeviceActivity.e.c(false);
                        moreSportDeviceActivity.e.c();
                        moreSportDeviceActivity.a(false);
                        lwt.d().e(new e(moreSportDeviceActivity), "MoreSportDeviceActivity");
                    }
                    break;
                case 31:
                    LogUtil.a("MoreSportDeviceActivity", "handleMessageWhenReferenceNotNull device connect time out");
                    removeMessages(31);
                    moreSportDeviceActivity.e.c(false);
                    moreSportDeviceActivity.a(false);
                    if (message.arg1 == 1) {
                        b(message, moreSportDeviceActivity);
                    }
                    break;
                case 32:
                    d(message, moreSportDeviceActivity);
                    break;
                case 33:
                default:
                    a(message, moreSportDeviceActivity);
                    break;
                case 34:
                    moreSportDeviceActivity.e.notifyDataSetChanged();
                    break;
            }
        }

        private void b(Message message, final MoreSportDeviceActivity moreSportDeviceActivity) {
            if (!(message.obj instanceof dxy)) {
                LogUtil.j("MoreSportDeviceActivity", "cloudDeviceDialog message.obj instanceof DeviceInfoForWear");
                return;
            }
            final dxy dxyVar = (dxy) message.obj;
            if (message.arg2 == 1) {
                LogUtil.a("MoreSportDeviceActivity", "cloudDeviceDialog clickFrom = 1");
                rtk.e(moreSportDeviceActivity.h, dxx.d().e(dxyVar.g()));
                return;
            }
            CloudReconnectFailDialog.Builder builder = new CloudReconnectFailDialog.Builder(moreSportDeviceActivity.h);
            builder.a(dxyVar.g(), lvi.a(dxyVar.g()).b()).b(new ReconnectCallback() { // from class: com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity.d.1
                @Override // com.huawei.ui.homehealth.device.callback.ReconnectCallback
                public void reconnect() {
                    moreSportDeviceActivity.b(dxyVar.d());
                    moreSportDeviceActivity.e.c(true);
                    moreSportDeviceActivity.a(false);
                    moreSportDeviceActivity.e(dxyVar, 1);
                }
            });
            CloudReconnectFailDialog cloudReconnectFailDialogE = builder.e();
            cloudReconnectFailDialogE.setCanceledOnTouchOutside(false);
            if (cloudReconnectFailDialogE.isShowing() || moreSportDeviceActivity.isFinishing()) {
                return;
            }
            cloudReconnectFailDialogE.show();
        }

        private void a(Message message, MoreSportDeviceActivity moreSportDeviceActivity) {
            int i = message.what;
            if (i == 12) {
                LogUtil.a("MoreSportDeviceActivity", "DEVICE_GET_CURRENT_INFO_LIST message");
                if (message.obj instanceof List) {
                    moreSportDeviceActivity.t.clear();
                    moreSportDeviceActivity.t.addAll((List) message.obj);
                }
                moreSportDeviceActivity.a(message.arg1);
                return;
            }
            if (i == 33) {
                LogUtil.a("MoreSportDeviceActivity", "msg_connect_change state:", Boolean.valueOf(moreSportDeviceActivity.e.d()), "message: ", Integer.valueOf(message.what));
                if (message.obj instanceof String) {
                    moreSportDeviceActivity.b((String) message.obj);
                }
                moreSportDeviceActivity.e.c(true);
                moreSportDeviceActivity.a(false);
                return;
            }
            if (i == 35) {
                LogUtil.a("MoreSportDeviceActivity", "MSG_DEVICE_DELETE message: ", Integer.valueOf(message.what));
                moreSportDeviceActivity.a(false);
            } else {
                if (i == 36) {
                    removeMessages(31);
                    moreSportDeviceActivity.e.c(false);
                    moreSportDeviceActivity.a(false);
                    moreSportDeviceActivity.c(message.arg1);
                    return;
                }
                LogUtil.j("MoreSportDeviceActivity", "message default");
            }
        }

        private void d(Message message, MoreSportDeviceActivity moreSportDeviceActivity) {
            if (message.obj instanceof String) {
                String str = (String) message.obj;
                if (!TextUtils.isEmpty(str) && str.equals(moreSportDeviceActivity.b())) {
                    removeMessages(31);
                    moreSportDeviceActivity.e.c(false);
                    moreSportDeviceActivity.b((String) null);
                }
                moreSportDeviceActivity.a(false);
                if (moreSportDeviceActivity.e.a() == 3) {
                    moreSportDeviceActivity.e.c();
                    rtk.e(moreSportDeviceActivity.h, dxx.d().e(message.arg1));
                }
            }
        }
    }

    static class e implements WearPlaceCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<MoreSportDeviceActivity> f25318c;

        e(MoreSportDeviceActivity moreSportDeviceActivity) {
            this.f25318c = new WeakReference<>(moreSportDeviceActivity);
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdevicemodemgr.callback.WearPlaceCallback
        public void onResponse(DeviceInfo deviceInfo, int i) {
            MoreSportDeviceActivity moreSportDeviceActivity = this.f25318c.get();
            if (deviceInfo != null) {
                Handler handler = moreSportDeviceActivity.n;
                if (handler == null) {
                    return;
                }
                handler.sendEmptyMessage(34);
                return;
            }
            LogUtil.j("MoreSportDeviceActivity", "WearHomePlaceCallback enter deviceInfo = null");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
