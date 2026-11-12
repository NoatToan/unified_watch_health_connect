package com.huawei.health.airsharing;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.hauwei.health.distributedservice.R;
import com.huawei.android.airsharing.api.ProjectionDevice;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.airsharing.helper.AirSharingHelper;
import com.huawei.health.airsharing.ui.DeviceListAdapter;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.RewardMethods;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ecs;
import defpackage.lmf;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes24.dex */
public class WirelessProjectionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f6175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f6176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AirSharingHelper f6177c;
    private DeviceListAdapter d;
    private HealthTextView e;
    private CustomTextAlertDialog f;
    private CustomViewDialog g;
    private CustomTextAlertDialog h;
    private CustomViewDialog i;
    private CustomViewDialog j;
    private Handler k;
    private CustomTextAlertDialog l;
    private AnimationDrawable o;
    private ListView p;
    private LinearLayout t;
    private int q = 0;
    private boolean n = false;
    private boolean m = false;

    static /* synthetic */ int b(WirelessProjectionManager wirelessProjectionManager, int i) {
        int i2 = wirelessProjectionManager.q + i;
        wirelessProjectionManager.q = i2;
        return i2;
    }

    public WirelessProjectionManager(Context context) {
        this.f6175a = context;
        AirSharingHelper airSharingHelperE = AirSharingHelper.e();
        this.f6177c = airSharingHelperE;
        airSharingHelperE.d(BaseApplication.b());
        this.f6177c.e(new a());
        this.k = new d(Looper.getMainLooper(), this);
    }

    public void d() {
        Context context = this.f6175a;
        if (context == null) {
            LogUtil.j("Distribute_WirelessProjectionManager", "WirelessProjectionManager not init.");
            return;
        }
        if (ecs.g(context)) {
            String strE = SharedPreferenceManager.e(this.f6175a, Integer.toString(1019), "projection_last_device_id");
            LogUtil.a("Distribute_WirelessProjectionManager", "lastDeviceId:", strE);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            this.k.sendMessageDelayed(this.k.obtainMessage(1006, strE), 1000L);
        }
    }

    public int i() {
        LogUtil.a("Distribute_WirelessProjectionManager", "startWirelessProjection.");
        this.m = true;
        Context context = this.f6175a;
        if (context == null) {
            LogUtil.j("Distribute_WirelessProjectionManager", "WirelessProjectionManager not init.");
            return 4;
        }
        if (!ecs.g(context)) {
            CustomTextAlertDialog customTextAlertDialog = this.l;
            if (customTextAlertDialog != null && customTextAlertDialog.isShowing()) {
                return 3;
            }
            a();
            return 3;
        }
        if (this.f6177c.g()) {
            d(this.f6177c.j());
            return 1;
        }
        return j();
    }

    public void c() {
        LogUtil.a("Distribute_WirelessProjectionManager", "destroy.");
        AirSharingHelper airSharingHelper = this.f6177c;
        if (airSharingHelper != null) {
            airSharingHelper.d();
        }
        Handler handler = this.k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.k = null;
        }
        this.f6175a = null;
    }

    public void a(boolean z) {
        AirSharingHelper airSharingHelper = this.f6177c;
        if (airSharingHelper != null) {
            airSharingHelper.c(z);
        }
    }

    public void b(boolean z) {
        LogUtil.a("Distribute_WirelessProjectionManager", "setIsCanPreSearch:", Boolean.valueOf(z));
        this.f6177c.a(z);
    }

    public void c(boolean z) {
        this.n = z;
    }

    static class d extends BaseHandler<WirelessProjectionManager> {
        private d(Looper looper, WirelessProjectionManager wirelessProjectionManager) {
            super(looper, wirelessProjectionManager);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(WirelessProjectionManager wirelessProjectionManager, Message message) {
            if (message != null) {
                switch (message.what) {
                    case 1006:
                        WirelessProjectionManager.e(wirelessProjectionManager, message);
                        break;
                    case 1007:
                        ReleaseLogUtil.d("R_Distribute_WirelessProjectionManager", "in handleMessage, case is MSG_HIDE_SCAN_DEVICES_DIALOG");
                        if (wirelessProjectionManager.g != null && wirelessProjectionManager.g.isShowing()) {
                            wirelessProjectionManager.g.dismiss();
                            wirelessProjectionManager.g();
                            break;
                        }
                        break;
                    case 1008:
                        ReleaseLogUtil.d("R_Distribute_WirelessProjectionManager", "in handleMessage, case is MSG_SHOW_DISPLAY_DEVICES_DIALOG");
                        wirelessProjectionManager.e();
                        break;
                    case 1009:
                        ReleaseLogUtil.d("R_Distribute_WirelessProjectionManager", "in handleMessage, case is MSG_ADD_DISPLAY_DEVICE_DIALOG");
                        wirelessProjectionManager.c(message);
                        break;
                    case 1010:
                        ReleaseLogUtil.d("R_Distribute_WirelessProjectionManager", "in handleMessage, case is MSG_REMOVE_DISPLAY_DEVICE_DIALOG");
                        wirelessProjectionManager.a(message);
                        break;
                    case 1011:
                        ReleaseLogUtil.d("R_Distribute_WirelessProjectionManager", "in handleMessage, case is MSG_SHOW_CONNECT_DEVICE_DIALOG");
                        wirelessProjectionManager.d(message);
                        break;
                    case 1012:
                        ReleaseLogUtil.d("R_Distribute_WirelessProjectionManager", "in handleMessage, case is MSG_HIDE_CONNECT_DEVICE_DIALOG");
                        if (wirelessProjectionManager.j != null && wirelessProjectionManager.j.isShowing()) {
                            wirelessProjectionManager.o.stop();
                            wirelessProjectionManager.j.dismiss();
                            wirelessProjectionManager.g();
                            break;
                        }
                        break;
                    case 1013:
                        ReleaseLogUtil.d("R_Distribute_WirelessProjectionManager", "in handleMessage, case is MSG_SHOW_CONNECT_DEVICE_FAILED_DIALOG");
                        if (wirelessProjectionManager.h == null || !wirelessProjectionManager.h.isShowing()) {
                            wirelessProjectionManager.b();
                        }
                        break;
                }
            }
            LogUtil.j("Distribute_WirelessProjectionManager", "in createInstanceOfHandler, no msg is received.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(WirelessProjectionManager wirelessProjectionManager, Message message) {
        LogUtil.a("Distribute_WirelessProjectionManager", "in handleMessage, case is MSG_START_PROJECTION_DEVICE_PRE_SEARCH");
        String str = (String) message.obj;
        wirelessProjectionManager.f6177c.a(true);
        wirelessProjectionManager.f6177c.d(str);
    }

    private int j() {
        if (this.f6177c.f()) {
            LogUtil.a("Distribute_WirelessProjectionManager", "mIsLastDeviceExist is true, connectToDevice");
            CustomTextAlertDialog customTextAlertDialog = this.f;
            if (customTextAlertDialog != null && customTextAlertDialog.isShowing()) {
                return 2;
            }
            e(this.f6177c.c().getDeviceName());
            return 2;
        }
        CustomViewDialog customViewDialog = this.g;
        if (customViewDialog == null || !customViewDialog.isShowing()) {
            if (this.f6177c.h()) {
                this.f6177c.o();
            }
            this.f6177c.n();
            return 0;
        }
        LogUtil.a("Distribute_WirelessProjectionManager", "in handleMessage, mDialogStartScanDevices.isShowing() is ", Boolean.valueOf(this.g.isShowing()));
        return 4;
    }

    protected void a() {
        LogUtil.a("Distribute_WirelessProjectionManager", "showProjectionPreDeviceDialog...");
        if (this.f6175a == null) {
            return;
        }
        if (this.l == null) {
            this.l = new CustomTextAlertDialog.Builder(this.f6175a).e(this.f6175a.getResources().getString(R.string.ie_enable_wlan_prompt)).a(this.f6175a.getResources().getString(R.string.ie_enable_wlan_tips)).b((Boolean) true).b(this.f6175a.getResources().getString(R.string.ie_enable_wlan), new View.OnClickListener() { // from class: com.huawei.health.airsharing.WirelessProjectionManager.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    WirelessProjectionManager.this.h();
                }
            }).a(this.f6175a.getResources().getString(R.string.IDS_settings_button_cancal_ios_btn), new View.OnClickListener() { // from class: com.huawei.health.airsharing.WirelessProjectionManager.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    WirelessProjectionManager.this.g();
                }
            }).b();
        }
        this.l.setCancelable(false);
        this.l.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        ecs.a(BaseApplication.b(), true);
        this.k.postDelayed(new Runnable() { // from class: com.huawei.health.airsharing.WirelessProjectionManager.4
            @Override // java.lang.Runnable
            public void run() {
                WirelessProjectionManager.b(WirelessProjectionManager.this, 200);
                if (ecs.g(BaseApplication.b()) || WirelessProjectionManager.this.q >= 1600) {
                    LogUtil.a("Distribute_WirelessProjectionManager", "mTotalUpdateWifiStateDelayMillis delay ", Integer.valueOf(WirelessProjectionManager.this.q), "ms");
                    WirelessProjectionManager.this.f6177c.n();
                    WirelessProjectionManager.this.q = 0;
                    WirelessProjectionManager.this.k.removeCallbacks(this);
                    return;
                }
                LogUtil.a("Distribute_WirelessProjectionManager", "mTotalUpdateWifiStateDelayMillis postDelayed delay   ", Integer.valueOf(WirelessProjectionManager.this.q), "ms");
                WirelessProjectionManager.this.k.postDelayed(this, 200L);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LogUtil.a("Distribute_WirelessProjectionManager", "showStartScanDevicesDialog...");
        if (this.f6175a == null) {
            return;
        }
        if (!this.m) {
            LogUtil.a("Distribute_WirelessProjectionManager", "showStartScanDevicesDialog mIsClickStartScan false");
            return;
        }
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: dcy
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.f();
                }
            });
            return;
        }
        if (this.g == null) {
            View viewInflate = View.inflate(this.f6175a, R.layout.scan_miracast_devices_dialog, null);
            if (viewInflate != null) {
                this.t = (LinearLayout) viewInflate.findViewById(R.id.scan_device_linearlayout);
                this.p = (ListView) viewInflate.findViewById(R.id.miracast_device_list);
            }
            this.g = new CustomViewDialog.Builder(this.f6175a).a(this.f6175a.getResources().getString(R.string.ie_miracast)).d(true).d(viewInflate).a(this.f6175a.getResources().getString(R.string.IDS_settings_button_cancal), new View.OnClickListener() { // from class: dcw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.b(view);
                }
            }).d();
        }
        CustomViewDialog customViewDialog = this.g;
        if (customViewDialog != null) {
            customViewDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: dcx
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f31616c.e(dialogInterface);
                }
            });
        }
        DeviceListAdapter deviceListAdapter = this.d;
        if (deviceListAdapter != null) {
            deviceListAdapter.d();
        }
        LinearLayout linearLayout = this.t;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        ListView listView = this.p;
        if (listView != null) {
            listView.setVisibility(8);
        }
        this.g.setCancelable(false);
        if (this.g.isShowing()) {
            return;
        }
        this.g.show();
    }

    public /* synthetic */ void b(View view) {
        this.f6177c.m();
        g();
    }

    public /* synthetic */ void e(DialogInterface dialogInterface) {
        this.m = false;
    }

    protected void e() {
        LogUtil.a("Distribute_WirelessProjectionManager", "showDisplayDevicesDialog...");
        if (this.g == null || this.p == null) {
            return;
        }
        LinearLayout linearLayout = this.t;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.p.setVisibility(0);
        if (this.d == null) {
            this.d = new DeviceListAdapter(this.f6175a);
        }
        this.p.setAdapter((ListAdapter) this.d);
        this.p.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.health.airsharing.WirelessProjectionManager.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                ProjectionDevice projectionDevice;
                WirelessProjectionManager.this.c(1007);
                if (WirelessProjectionManager.this.d.getItem(i) instanceof ProjectionDevice) {
                    projectionDevice = (ProjectionDevice) WirelessProjectionManager.this.d.getItem(i);
                    WirelessProjectionManager.this.e(1011, projectionDevice);
                } else {
                    projectionDevice = null;
                }
                WirelessProjectionManager.this.f6177c.c(projectionDevice);
            }
        });
    }

    private void d(String str) {
        LogUtil.a("Distribute_WirelessProjectionManager", "showCloseProjectionDialog...");
        Context context = this.f6175a;
        if (context == null) {
            return;
        }
        if (this.i == null) {
            View viewInflate = View.inflate(context, R.layout.close_projection_connection_dialog, null);
            this.e = (HealthTextView) viewInflate.findViewById(R.id.projection_device_name);
            this.i = new CustomViewDialog.Builder(this.f6175a).a(this.f6175a.getResources().getString(R.string.ie_miracast)).d(viewInflate).a(this.f6175a.getResources().getString(R.string.ie_disconnect), new View.OnClickListener() { // from class: com.huawei.health.airsharing.WirelessProjectionManager.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    WirelessProjectionManager.this.f6177c.a();
                    WirelessProjectionManager.this.g();
                }
            }).c(this.f6175a.getResources().getString(R.string.IDS_settings_button_cancal_ios_btn), new View.OnClickListener() { // from class: com.huawei.health.airsharing.WirelessProjectionManager.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    WirelessProjectionManager.this.g();
                    LogUtil.a("Distribute_WirelessProjectionManager", "setNegativeButton in showCloseProjectionDialog!");
                }
            }).d();
        }
        this.e.setText(str);
        this.i.setCancelable(false);
        this.i.show();
    }

    protected void e(String str) {
        LogUtil.a("Distribute_WirelessProjectionManager", "showProjectionPreDeviceDialog...");
        if (this.f6175a == null) {
            return;
        }
        if (this.f == null) {
            final HashMap map = new HashMap(1);
            map.put("click", 1);
            this.f = new CustomTextAlertDialog.Builder(this.f6175a).e(this.f6175a.getResources().getString(R.string.ie_miracast)).a(String.format(Locale.ENGLISH, this.f6175a.getResources().getString(R.string.ie_projection_pre_device), str)).b((Boolean) true).b(this.f6175a.getResources().getString(R.string.ie_projection), new View.OnClickListener() { // from class: com.huawei.health.airsharing.WirelessProjectionManager.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ProjectionDevice projectionDeviceC = WirelessProjectionManager.this.f6177c.c();
                    WirelessProjectionManager.this.c(projectionDeviceC.getDeviceName());
                    WirelessProjectionManager.this.f6177c.c(projectionDeviceC);
                    WirelessProjectionManager.this.f6177c.l();
                    map.put("action", 0);
                    lmf.d().c(WirelessProjectionManager.this.f6175a, AnalyticsValue.DISTRIBUTE_CONNECT_LAST_DEVICE_11130050.value(), map, 0);
                }
            }).a(this.f6175a.getResources().getString(R.string.IDS_settings_button_cancal_ios_btn), new View.OnClickListener() { // from class: com.huawei.health.airsharing.WirelessProjectionManager.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    WirelessProjectionManager.this.f6177c.o();
                    WirelessProjectionManager.this.f6177c.n();
                    map.put("action", 1);
                    lmf.d().c(WirelessProjectionManager.this.f6175a, AnalyticsValue.DISTRIBUTE_CONNECT_LAST_DEVICE_11130050.value(), map, 0);
                }
            }).b();
        }
        this.f.setCancelable(false);
        this.f.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        LogUtil.a("Distribute_WirelessProjectionManager", "showConnectDeviceDialog...");
        Context context = this.f6175a;
        if (context == null) {
            return;
        }
        if (this.j == null) {
            View viewInflate = View.inflate(context, R.layout.connect_miracast_device_dialog, null);
            this.f6176b = (HealthTextView) viewInflate.findViewById(R.id.connect_miracast_device);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.connect_miracast_device_progress_anim);
            if (imageView.getDrawable() instanceof AnimationDrawable) {
                this.o = (AnimationDrawable) imageView.getDrawable();
            }
            this.j = new CustomViewDialog.Builder(this.f6175a).a(this.f6175a.getResources().getString(R.string.ie_miracast)).d(viewInflate).a(this.f6175a.getResources().getString(R.string.IDS_settings_button_cancal), new View.OnClickListener() { // from class: com.huawei.health.airsharing.WirelessProjectionManager.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("Distribute_WirelessProjectionManager", "Cancel the connection to the device.");
                    WirelessProjectionManager.this.f6177c.b();
                    WirelessProjectionManager.this.g();
                }
            }).d();
        }
        this.f6176b.setText(String.format(Locale.ENGLISH, this.f6175a.getResources().getString(R.string.ie_connecting_to), str));
        this.j.setCancelable(false);
        this.j.show();
        this.o.start();
    }

    protected void b() {
        LogUtil.a("Distribute_WirelessProjectionManager", "showConnectDeviceFailedDialog...");
        if (this.f6175a == null) {
            return;
        }
        if (this.h == null) {
            this.h = new CustomTextAlertDialog.Builder(this.f6175a).e(this.f6175a.getResources().getString(R.string.ie_connect_failed_prompt)).a(this.f6175a.getResources().getString(R.string.tips_connect_failed)).b((Boolean) true).b(this.f6175a.getResources().getString(R.string.ie_i_know), new View.OnClickListener() { // from class: com.huawei.health.airsharing.WirelessProjectionManager.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    WirelessProjectionManager.this.g();
                }
            }).b();
        }
        this.h.setCancelable(false);
        this.h.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        if (message == null || this.d == null || !(message.obj instanceof ProjectionDevice)) {
            return;
        }
        this.d.c((ProjectionDevice) message.obj);
    }

    protected void a(Message message) {
        if (message == null || this.d == null || !(message.obj instanceof ProjectionDevice)) {
            return;
        }
        this.d.a((ProjectionDevice) message.obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        CustomViewDialog customViewDialog = this.j;
        if ((customViewDialog == null || !customViewDialog.isShowing()) && (message.obj instanceof ProjectionDevice)) {
            c(((ProjectionDevice) message.obj).getDeviceName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (i == 3501) {
            f();
        } else if (i == 3503) {
            f();
        }
    }

    public class a implements AirSharingHelper.EventCallback {
        public a() {
        }

        @Override // com.huawei.health.airsharing.helper.AirSharingHelper.EventCallback
        public boolean onEvent(int i, String str) {
            if (i == 3005) {
                LogUtil.a("Distribute_ProjectionEventCallback", "Successful disconnection");
            }
            if (i == 3006) {
                LogUtil.a("Distribute_ProjectionEventCallback", "Stop scanning");
            }
            ReleaseLogUtil.d("R_Distribute_ProjectionEventCallback", RewardMethods.ON_EVENT, Integer.valueOf(i));
            WirelessProjectionManager.this.d(i);
            return false;
        }

        @Override // com.huawei.health.airsharing.helper.AirSharingHelper.EventCallback
        public void onDisplayUpdate(int i, String str, String str2, int i2) {
            LogUtil.a("Distribute_ProjectionEventCallback", "deviceId:", Integer.valueOf(i), "firstDevice:", str, "secondDevice:", str2, "secondDeviceId:", Integer.valueOf(i2));
        }

        @Override // com.huawei.health.airsharing.helper.AirSharingHelper.EventCallback
        public void onMirrorUpdate(int i, String str, String str2, int i2, boolean z) {
            LogUtil.a("Distribute_ProjectionEventCallback", "deviceId:", Integer.valueOf(i), "firstDevice:", str, "secondDevice:", str2, "secondDeviceId:", Integer.valueOf(i2));
        }

        @Override // com.huawei.health.airsharing.helper.AirSharingHelper.EventCallback
        public void onProjectionDeviceUpdate(int i, ProjectionDevice projectionDevice) {
            switch (i) {
                case 3001:
                    ReleaseLogUtil.d("R_Distribute_ProjectionEventCallback", "Device add");
                    if (projectionDevice != null) {
                        int capability = projectionDevice.getCapability();
                        ReleaseLogUtil.d("R_Distribute_ProjectionEventCallback", "Device add capability:", Integer.valueOf(capability));
                        if ((capability & 1) == 1) {
                            if (WirelessProjectionManager.this.g != null && WirelessProjectionManager.this.g.isShowing()) {
                                WirelessProjectionManager.this.c(1008);
                            }
                            WirelessProjectionManager.this.e(1009, projectionDevice);
                            HashMap map = new HashMap(2);
                            map.put("click", 1);
                            map.put("deviceName", projectionDevice.getDeviceName());
                            lmf.d().c(WirelessProjectionManager.this.f6175a, AnalyticsValue.DISTRIBUTE_GET_PROJECTION_DEVICE_1130049.value(), map, 0);
                        }
                        break;
                    }
                    break;
                case 3002:
                    ReleaseLogUtil.d("R_Distribute_ProjectionEventCallback", "Device remove");
                    WirelessProjectionManager.this.e(1010, projectionDevice);
                    break;
                case 3003:
                    ReleaseLogUtil.d("R_Distribute_ProjectionEventCallback", "Device connect succeed");
                    WirelessProjectionManager.this.c(1012);
                    break;
                case 3004:
                    ReleaseLogUtil.e("R_Distribute_ProjectionEventCallback", "Device connect failed");
                    WirelessProjectionManager.this.c(1012);
                    WirelessProjectionManager.this.c(1013);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        Handler handler = this.k;
        if (handler != null) {
            handler.sendEmptyMessage(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, Object obj) {
        Handler handler = this.k;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = i;
            messageObtainMessage.obj = obj;
            this.k.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("Distribute_WirelessProjectionManager", "hideSystemNavBar", Boolean.valueOf(this.n), Boolean.valueOf(this.f6175a instanceof Activity));
        Context context = this.f6175a;
        if ((context instanceof Activity) && this.n) {
            ((Activity) context).getWindow().getDecorView().setSystemUiVisibility(5894);
        }
    }
}
