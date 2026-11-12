package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwdevicemodemgr.callback.WearPlaceCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.activity.pairing.DevicePairGuideUtil;
import com.huawei.ui.device.utlis.BluetoothPermisionUtils;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.WearHomeOldActivity;
import com.huawei.ui.homewear21.home.card.WearHomeBaseCard;
import com.huawei.ui.homewear21.home.holder.WearHomeStatusHolder;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class tnf extends WearHomeBaseCard {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f49381c;
    private WearHomeStatusHolder l = null;
    private NoTitleCustomAlertDialog h = null;
    private CustomTextAlertDialog e = null;
    private boolean i = false;
    private CustomAlertDialog f = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49380b = "";
    private BtSwitchStateCallback d = null;
    private final BroadcastReceiver j = new BroadcastReceiver() { // from class: tnf.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras;
            if (intent == null || !"com.huawei.bone.action.BATTERY_LEVEL".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
                return;
            }
            int i = extras.getInt("BATTERY_LEVEL");
            LogUtil.a("MainUI", 0, "WearHomeStatusCard", "battery refresh is received，refreshBattery is", Integer.valueOf(i));
            int iB = mgt.b(tnf.this.mActivity.f26233a);
            String string = extras.getString("DEVICE_MAC");
            tnf.this.c(string);
            if (iB != i && tnf.this.mActivity.f26233a.equals(string)) {
                mgt.d(tnf.this.mActivity.f26233a, i);
            }
            tnf tnfVar = tnf.this;
            tnfVar.c(mgt.b(tnfVar.mActivity.f26233a));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.OnClickListener f49379a = new View.OnClickListener() { // from class: tno
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f49394b.d(view);
        }
    };
    private Runnable g = new Runnable() { // from class: tnq
        @Override // java.lang.Runnable
        public final void run() {
            this.f49395c.f();
        }
    };

    /* synthetic */ void d(View view) {
        if (qrs.r()) {
            return;
        }
        if (this.mActivity.d == null) {
            LogUtil.a("WearHomeStatusCard", "mActivity.mCurrentDeviceInfo == null");
            this.mActivity.d = tfn.a().a(this.mActivity.f26233a);
        }
        b();
    }

    public void b() {
        if (Build.VERSION.SDK_INT > 30) {
            PermissionUtil.d(this.mContext, PermissionUtil.PermissionType.SCAN, new BluetoothPermisionUtils.NearbyPermissionAction(this.mContext) { // from class: tnf.2
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("WearHomeStatusCard", "nearby permission granted");
                    if (iov.d(tnf.this.mActivity)) {
                        tnf.this.m();
                    } else {
                        LogUtil.j("WearHomeStatusCard", "checkBluetoothPermission not ActivityAlive");
                    }
                }
            });
        } else if (this.mActivity.d != null && this.mActivity.d.getDeviceBluetoothType() == 2) {
            PermissionUtil.d(this.mContext, PermissionUtil.PermissionType.LOCATION, new CustomPermissionAction(this.mContext) { // from class: tnf.4
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("WearHomeStatusCard", "location permission ok.");
                    if (!rct.e(tnf.this.mContext)) {
                        tnf.this.y();
                    } else {
                        tnf.this.m();
                    }
                }
            });
        } else {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (maq.b().f()) {
            LogUtil.a("WearHomeStatusCard", "other wear device is Upgrading");
            x();
        } else {
            s();
        }
    }

    /* synthetic */ void f() {
        e(0);
    }

    public tnf(Context context, WearHomeOldActivity wearHomeOldActivity) {
        this.mContext = context;
        this.mActivity = wearHomeOldActivity;
        this.f49381c = BaseApplication.getContext();
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        WearHomeStatusHolder wearHomeStatusHolder = new WearHomeStatusHolder(layoutInflater.inflate(R.layout.wear_home_status_layout, viewGroup, false));
        this.l = wearHomeStatusHolder;
        wearHomeStatusHolder.l().setOnClickListener(this.f49379a);
        t();
        LogUtil.a("WearHomeStatusCard", "getCardViewHolder", this.l);
        return this.l;
    }

    private void t() {
        tqp.c(this.mContext, this.j, "com.huawei.bone.action.BATTERY_LEVEL");
        o();
        h(0);
    }

    private void x() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.mContext).a(this.mContext.getResources().getString(R.string.IDS_main_device_ota_error_message)).c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: tnr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("WearHomeStatusCard", "showTipDialog,click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void deviceConnectionChange(int i) {
        if (this.mActivity == null || this.l == null) {
            return;
        }
        this.mActivity.d().removeCallbacks(this.g);
        i(i);
        h(200);
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void onResume() {
        h(200);
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void onDestroy() {
        tqp.d(this.mContext, this.j);
        tge.b(0);
        if (this.d != null) {
            BTDeviceMgrUtil.c().e(this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: tnj
            @Override // java.lang.Runnable
            public final void run() {
                this.f49390a.h();
            }
        });
    }

    /* synthetic */ void h() {
        LogUtil.a("WearHomeStatusCard", "getHarmonyStatus getValue");
        String strD = lon.c().d("scale_share_harmony_tips");
        DevicePairGuideUtil.e(strD);
        LogUtil.a("WearHomeStatusCard", "getHarmonyStatus scale_share_harmony_tips: ", strD);
        this.mActivity.runOnUiThread(new Runnable() { // from class: tnl
            @Override // java.lang.Runnable
            public final void run() {
                this.f49392b.j();
            }
        });
    }

    /* synthetic */ void j() {
        String string;
        if ("on".equals(DevicePairGuideUtil.b())) {
            string = BaseApplication.getContext().getString(R.string.IDS_btsdk_turn_on_location_harmony);
        } else {
            string = BaseApplication.getContext().getString(R.string.IDS_btsdk_turn_on_location);
        }
        tqp.e(this.mContext, string);
    }

    private void h(int i) {
        if (this.l == null) {
            LogUtil.j("WearHomeStatusCard", "refreshStatusCard mWearHomeStatusHolder == null");
            return;
        }
        e(i);
        c(mgt.b(this.mActivity.f26233a));
        if (mgt.b(this.mActivity.f26233a) != -1) {
            c(mgt.b(this.mActivity.f26233a));
            LogUtil.a("WearHomeStatusCard", "DeviceBatteryInfo.battery is not -1 , battery is ", Integer.valueOf(mgt.b(this.mActivity.f26233a)));
        }
        d(this.mActivity.d);
    }

    private void s() {
        this.mActivity.d().removeMessages(24);
        this.mActivity.d().sendEmptyMessage(24);
    }

    public void i() {
        if (this.l == null) {
            ReleaseLogUtil.e("R_WearHomeStatusCard", "reconnectByClickBluetoothImage mWearHomeStatusHolder == null");
            return;
        }
        if (this.mActivity.d == null) {
            this.mActivity.d = tfn.a().a(this.mActivity.f26233a);
        }
        if (this.mActivity.d != null) {
            this.mActivity.n = this.mActivity.d.getSecurityUuid();
            int deviceConnectState = this.mActivity.d.getDeviceConnectState();
            LogUtil.a("MainUI", 0, "WearHomeStatusCard", "bluetooth status:", Integer.valueOf(deviceConnectState));
            if (deviceConnectState != 2 && deviceConnectState != 1) {
                LogUtil.a("MainUI", 0, "WearHomeStatusCard", "begin connect in ui , name:", this.mActivity.d.getDeviceName());
                if (!c(this.mActivity.d)) {
                    LogUtil.a("WearHomeStatusCard", "onclickReconnect false");
                    return;
                }
                if (this.mActivity.d() == null) {
                    ReleaseLogUtil.e("R_WearHomeStatusCard", "reconnectByClickBluetoothImage messageHandler is null");
                    return;
                }
                this.mActivity.d().removeCallbacks(this.g);
                this.mActivity.d().postDelayed(this.g, 20000L);
                final List<DeviceInfo> listK = tfn.a().k();
                d(listK);
                ThreadPoolManager.c().execute(new Runnable() { // from class: tnf.3
                    @Override // java.lang.Runnable
                    public void run() {
                        String deviceUdid;
                        lvl.a((List<DeviceInfo>) listK, tnf.this.mActivity.d.getDeviceIdentify());
                        if (tnf.this.mActivity.d == null) {
                            LogUtil.j("WearHomeStatusCard", "reconnectByClickBluetoothImage mCurrentDeviceInfo is null");
                            return;
                        }
                        if (!TextUtils.isEmpty(tnf.this.mActivity.d.getDeviceUdid())) {
                            deviceUdid = tnf.this.mActivity.d.getDeviceUdid();
                        } else {
                            deviceUdid = tnf.this.mActivity.d.getSecurityUuid() + "#ANDROID21";
                        }
                        new rfi().b(null, deviceUdid, false, tnf.this.mActivity.d.getDeviceIdentify(), tnf.this.mContext);
                    }
                });
                return;
            }
            LogUtil.a("MainUI", 0, "WearHomeStatusCard", "connected or connecting");
            return;
        }
        LogUtil.a("MainUI", 0, "WearHomeStatusCard", "no device info");
    }

    private void d(List<DeviceInfo> list) {
        if (list == null) {
            LogUtil.a("WearHomeStatusCard", "handleDeviceState deviceInfoLists is null");
            return;
        }
        if (eel.d(this.mActivity.d.getProductType())) {
            for (DeviceInfo deviceInfo : list) {
                if (this.mActivity.d.getDeviceIdentify().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                    deviceInfo.setDeviceActiveState(1);
                    deviceInfo.setDeviceConnectState(1);
                } else if (!eel.d(deviceInfo.getProductType())) {
                    LogUtil.j("WearHomeStatusCard", "handleDeviceState default");
                } else {
                    deviceInfo.setDeviceActiveState(0);
                    deviceInfo.setDeviceConnectState(3);
                }
            }
            return;
        }
        for (DeviceInfo deviceInfo2 : list) {
            if (this.mActivity.d.getDeviceIdentify().equalsIgnoreCase(deviceInfo2.getDeviceIdentify())) {
                deviceInfo2.setDeviceActiveState(1);
                deviceInfo2.setDeviceConnectState(1);
            }
            if (!this.mActivity.d.getDeviceIdentify().equalsIgnoreCase(deviceInfo2.getDeviceIdentify()) && deviceInfo2.getAutoDetectSwitchStatus() != 1 && !rdp.d(this.mActivity.d.getProductType()) && deviceInfo2.getDeviceActiveState() == 1) {
                deviceInfo2.setDeviceActiveState(0);
                deviceInfo2.setDeviceConnectState(3);
            }
        }
        dxx.d().j();
    }

    private boolean c(DeviceInfo deviceInfo) {
        LogUtil.a("MainUI", 0, "Enter onclickReconnect");
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.a("MainUI", 0, "onclickReconnect BT switch is false!");
            p();
            return false;
        }
        LogUtil.a("MainUI", 0, "onclickReconnect close BT Dialog!");
        l();
        if (dxx.d().e(deviceInfo.getDeviceIdentify()) || dxx.d().b().isEmpty()) {
            g(deviceInfo);
            return true;
        }
        e(deviceInfo);
        g(deviceInfo);
        return true;
    }

    private void e(DeviceInfo deviceInfo) {
        LogUtil.a("WearHomeStatusCard", "handleWorkMode set device enable");
        deviceInfo.setDeviceActiveState(1);
        deviceInfo.setDeviceConnectState(1);
    }

    private void e(int i) {
        LogUtil.a("MainUI", 0, "WearHomeStatusCard", "Enter refreshState:", Integer.valueOf(i));
        this.mActivity.d().removeMessages(1001);
        this.mActivity.d().sendEmptyMessageDelayed(1001, i);
    }

    public void e() {
        this.mActivity.d = tfn.a().a(this.mActivity.f26233a);
        if (this.mActivity.d != null) {
            List<DeviceInfo> listK = tfn.a().k();
            if (listK == null || listK.size() == 0) {
                LogUtil.j("WearHomeStatusCard", "(deviceList == null) || (deviceList.size() == 0)");
                return;
            }
            for (DeviceInfo deviceInfo : listK) {
                if (this.mActivity.d.getDeviceIdentify().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                    int deviceConnectState = deviceInfo.getDeviceConnectState();
                    LogUtil.a("MainUI", 0, "WearHomeStatusCard", "dealWithRefreshBlueStatus status ", Integer.valueOf(deviceConnectState));
                    j(this.mActivity.d);
                    i(deviceConnectState);
                    return;
                }
            }
            return;
        }
        i(3);
        LogUtil.a("MainUI", 0, "WearHomeStatusCard", "deviceInfo is null");
    }

    private void g(DeviceInfo deviceInfo) {
        LogUtil.a("WearHomeStatusCard", "startReconnect reconnectCount : ", Integer.valueOf(tge.b()));
        if (deviceInfo != null) {
            SharedPreferenceManager.c(String.valueOf(10), "app_big_data_device_name", deviceInfo.getDeviceName());
        }
        if (tge.b() < 2) {
            this.i = true;
            i(1);
            tge.b(tge.b() + 1);
            LogUtil.a("WearHomeStatusCard", "startReconnect : ", Integer.valueOf(tge.b()));
            return;
        }
        this.i = false;
        i(dxx.d().e(deviceInfo.getProductType()));
        tge.b(0);
    }

    private void j(DeviceInfo deviceInfo) {
        int productType = deviceInfo.getProductType();
        LogUtil.a("MainUI", 0, "WearHomeStatusCard", "Enter updateIdImage ProductType:", Integer.valueOf(productType), " DeviceModel:", deviceInfo.getDeviceModel(), " HiLinkDeviceId:", deviceInfo.getHiLinkDeviceId());
        if (deviceInfo.getProductType() == 10 && (TextUtils.equals(deviceInfo.getDeviceName(), "PORSCHE DESIGN") || TextUtils.equals(deviceInfo.getDeviceModel(), "PORSCHE DESIGN"))) {
            LogUtil.a("MainUI", 0, "WearHomeStatusCard", "Enter updateIdImage : baoshijie!");
            this.l.s().setImageResource(R.mipmap.pic_watch_huawei_porsche);
        } else if (!TextUtils.isEmpty(deviceInfo.getDeviceName()) && deviceInfo.getProductType() == 11 && deviceInfo.getDeviceName().contains("HUAWEI CM-R1P")) {
            this.l.s().setImageResource(R.mipmap.img_home_r1_pro_banner);
        } else if (lvi.n(deviceInfo.getProductType()) || !TextUtils.isEmpty(lvi.d(deviceInfo.getProductType()))) {
            f(deviceInfo);
        } else {
            this.l.s().setImageResource(tfn.a().a(deviceInfo.getProductType()));
        }
    }

    private void f(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("R_WearHomeStatusCard", "enter setSupportDownloadImage");
        ThreadPoolManager.c().execute(new AnonymousClass1(deviceInfo));
    }

    /* JADX INFO: renamed from: tnf$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f49382a;

        AnonymousClass1(DeviceInfo deviceInfo) {
            this.f49382a = deviceInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReleaseLogUtil.d("R_WearHomeStatusCard", "setSupportDownloadImage subThread");
            String strJ = lvi.j(this.f49382a.getProductType());
            if (TextUtils.isEmpty(strJ)) {
                strJ = lvi.d(this.f49382a.getProductType());
            }
            final edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
            if (TextUtils.isEmpty(strJ) || pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
                tnf.this.a(this.f49382a);
                return;
            }
            LogUtil.a("WearHomeStatusCard", "is plugin download uuid:", strJ);
            boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strJ);
            LogUtil.a("WearHomeStatusCard", "is plugin download isPluginAvailable:", Boolean.valueOf(zIsResourcesAvailable));
            if (!zIsResourcesAvailable) {
                tnf.this.a(this.f49382a);
                return;
            }
            WearHomeOldActivity wearHomeOldActivity = tnf.this.mActivity;
            final DeviceInfo deviceInfo = this.f49382a;
            wearHomeOldActivity.runOnUiThread(new Runnable() { // from class: tnu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49411a.a(deviceInfo, pluginInfoByUuid);
                }
            });
        }

        /* synthetic */ void a(DeviceInfo deviceInfo, edl edlVar) {
            ReleaseLogUtil.d("R_WearHomeStatusCard", "setSupportDownloadImage MainThread");
            tnf.this.c(deviceInfo, edlVar);
            tnf.this.e(deviceInfo, edlVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceInfo deviceInfo, edl edlVar) {
        String str;
        if (qrs.x(this.mContext)) {
            str = "dark";
        } else {
            str = CervicalMucusRecord.Sensation.LIGHT;
        }
        String strA = eep.a(edlVar, str, deviceInfo);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("WearHomeStatusCard", "deviceBackground imageName is null");
            this.l.p().setVisibility(8);
            return;
        }
        LogUtil.a("WearHomeStatusCard", "deviceBackground imageName:", strA);
        String str2 = pig.c().e(edlVar.c()) + File.separator + edlVar.c() + File.separator + "img" + File.separator + strA + ".png";
        if (!new File(str2).exists()) {
            LogUtil.j("WearHomeStatusCard", "deviceBackground image file not exists");
            this.l.p().setVisibility(8);
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inInputShareable = true;
        LogUtil.a("WearHomeStatusCard", "deviceBackground have bitmap fetchPluginUuid:", edlVar.c());
        this.l.p().setImageBitmap(BitmapFactory.decodeFile(str2, options));
        this.l.p().setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceInfo deviceInfo, edl edlVar) {
        String strE = eep.e(edlVar, 2, deviceInfo);
        LogUtil.a("WearHomeStatusCard", "HomeImgNew name:", strE);
        if (new File(pig.c().e(edlVar.c()) + File.separator + edlVar.c() + File.separator + "img" + File.separator + strE + ".png").exists()) {
            Bitmap bitmapLoadImageByImageName = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(edlVar, strE);
            if (bitmapLoadImageByImageName == null) {
                LogUtil.j("WearHomeStatusCard", "deviceBitmapTemp is null");
                return;
            }
            int width = bitmapLoadImageByImageName.getWidth();
            int height = bitmapLoadImageByImageName.getHeight();
            LogUtil.a("WearHomeStatusCard", "width:", Integer.valueOf(width), ",height:", Integer.valueOf(height));
            float width2 = this.l.s().getWidth() / width;
            float height2 = this.l.s().getHeight() / height;
            LogUtil.a("WearHomeStatusCard", "background width:", Integer.valueOf(this.l.s().getWidth()), ", background height:", Integer.valueOf(this.l.s().getHeight()));
            Matrix matrix = new Matrix();
            matrix.postScale(width2, height2);
            matrix.reset();
            this.l.s().setImageBitmap(Bitmap.createBitmap(bitmapLoadImageByImageName, 0, 0, width, height, matrix, true));
            return;
        }
        a(deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final DeviceInfo deviceInfo) {
        this.mActivity.runOnUiThread(new Runnable() { // from class: tnm
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b(deviceInfo);
            }
        });
    }

    /* synthetic */ void b(DeviceInfo deviceInfo) {
        if (lvi.f(deviceInfo.getProductType())) {
            this.l.s().setImageResource(R.mipmap.device_icon_band_default_new);
        } else {
            this.l.s().setImageResource(R.mipmap.device_icon_watch_default_new);
        }
    }

    private void o() {
        LogUtil.a("WearHomeStatusCard", "getConnectTip");
        if (this.mActivity.d == null) {
            LogUtil.j("WearHomeStatusCard", "getConnectTip mActivity.mCurrentDeviceInfo == null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: tnf.8
                @Override // java.lang.Runnable
                public void run() {
                    if (tnf.this.mActivity == null || tnf.this.mActivity.d == null) {
                        LogUtil.j("WearHomeStatusCard", "getConnectTip mActivity or mCurrentDeviceInfo is null");
                        return;
                    }
                    edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(tnf.this.mActivity.d.getProductType()));
                    if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
                        return;
                    }
                    tnf.this.f49380b = pluginInfoByUuid.i().c();
                    LogUtil.a("WearHomeStatusCard", "mAwakenDevice = ", tnf.this.f49380b);
                }
            });
        }
    }

    private void i(int i) {
        LogUtil.a("MainUI", 0, "WearHomeStatusCard", "Enter updateBluetoothState isConnect:", Integer.valueOf(i));
        if (i == 2) {
            aa();
        } else if (i == 1 || i == 15) {
            n();
        } else if (i == 9 || i == 13) {
            w();
        } else if (i == 10) {
            if (this.mActivity.d == null) {
                LogUtil.j("MainUI", 0, "WearHomeStatusCard", "current info is empty.");
                return;
            } else if (this.i) {
                tfn.a().c(this.mActivity.d.getDeviceIdentify());
                this.mActivity.finish();
            }
        } else if (i == 5) {
            z();
        } else {
            this.i = false;
            this.l.k().setVisibility(0);
            this.l.l().setVisibility(0);
            this.l.b().setVisibility(8);
            this.l.t().setVisibility(8);
            this.l.m().setVisibility(8);
            this.l.j().setVisibility(8);
            if (!TextUtils.isEmpty(this.f49380b)) {
                this.l.g().setVisibility(0);
                this.l.g().setText(this.f49380b);
            } else {
                this.l.g().setVisibility(8);
            }
            this.l.r().setVisibility(8);
            this.l.f().setText(this.f49381c.getResources().getString(R.string.IDS_myfitnesspal_logout));
            if (this.mActivity.d() != null) {
                this.mActivity.d().removeMessages(1006);
            }
        }
        f(i);
    }

    private void w() {
        this.l.l().setVisibility(0);
        this.l.b().setVisibility(8);
        this.l.t().setVisibility(8);
        this.l.m().setVisibility(8);
        this.l.j().setVisibility(8);
        if (!TextUtils.isEmpty(this.f49380b)) {
            this.l.g().setVisibility(0);
            this.l.g().setText(this.f49380b);
        } else {
            this.l.g().setVisibility(8);
        }
        this.l.r().setVisibility(8);
        this.l.f().setText(this.f49381c.getResources().getString(R.string.IDS_myfitnesspal_logout));
        if (this.i) {
            g();
        }
    }

    private void z() {
        this.i = false;
        this.l.l().setVisibility(0);
        this.l.b().setVisibility(8);
        this.l.t().setVisibility(8);
        this.l.m().setVisibility(8);
        this.l.j().setVisibility(8);
        if (!TextUtils.isEmpty(this.f49380b)) {
            this.l.g().setVisibility(0);
            this.l.g().setText(this.f49380b);
        } else {
            this.l.g().setVisibility(8);
        }
        this.l.r().setVisibility(8);
        this.l.f().setText(this.f49381c.getResources().getString(R.string.IDS_myfitnesspal_logout));
        q();
    }

    private void aa() {
        CustomAlertDialog customAlertDialog = this.f;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
        this.i = false;
        this.mActivity.d = tfn.a().e(this.mActivity.f26233a);
        if (this.mActivity.d != null && eel.d(this.mActivity.d.getProductType())) {
            if (maq.b().c(this.mActivity.f26233a) == 6) {
                this.l.l().setVisibility(8);
                this.l.b().setVisibility(8);
                this.l.t().setVisibility(8);
                this.l.m().setVisibility(8);
                this.l.j().setVisibility(0);
                this.l.f().setText(this.f49381c.getResources().getString(R.string.IDS_ota_update_state_upgrading));
                return;
            }
            this.l.l().setVisibility(8);
            this.l.j().setVisibility(8);
            this.l.b().setVisibility(0);
            this.l.f().setText(this.f49381c.getResources().getString(R.string.IDS_wearhome_connected));
            tge.b(0);
            this.mActivity.d().sendEmptyMessage(1002);
            return;
        }
        v();
    }

    private void f(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        if (this.l.m().getVisibility() == 0) {
            this.l.k().setVisibility(8);
            this.l.m().setVisibility(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 2.0f);
            layoutParams2.setMarginStart(qrs.d(this.mContext, 24.0f));
            this.l.h().setLayoutParams(layoutParams2);
            return;
        }
        if (this.l.t().getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams3.setMarginStart(qrs.d(this.mContext, 24.0f));
            this.l.h().setLayoutParams(layoutParams3);
            layoutParams4.setMarginEnd(qrs.d(this.mContext, 24.0f));
            this.l.k().setLayoutParams(layoutParams4);
            layoutParams.setMarginStart(qrs.d(this.mContext, 8.0f));
            layoutParams.setMarginEnd(qrs.d(this.mContext, 8.0f));
            this.l.t().setLayoutParams(layoutParams);
            int iE = lwr.e().e(this.mActivity.f26233a);
            this.l.c().setText(lwr.e().d(iE));
            this.l.d().setText(this.f49381c.getResources().getString(R.string.IDS_bolt_wear_place));
            if (LanguageUtil.q(this.mContext) || LanguageUtil.f(this.mContext)) {
                this.l.c().setTextSize(2, 16.0f);
                this.l.d().setTextSize(2, 14.0f);
                return;
            } else if (iE == 0 && LanguageUtil.ag(this.mContext)) {
                this.l.c().setTextSize(2, 11.0f);
                this.l.c().setLines(1);
                return;
            } else {
                this.l.c().setTextSize(2, 14.0f);
                this.l.d().setTextSize(2, 12.0f);
                return;
            }
        }
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(qrs.d(this.mContext, 24.0f));
        this.l.h().setLayoutParams(layoutParams);
        layoutParams5.setMarginEnd(qrs.d(this.mContext, 24.0f));
        this.l.k().setLayoutParams(layoutParams5);
    }

    private void g() {
        if (this.e != null) {
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.mContext).e(this.mContext.getResources().getString(R.string.IDS_not_connect_inconsistent_account_title)).a(this.mContext.getResources().getString(R.string.IDS_not_connect_inconsistent_account_content)).e(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: tnn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        }).b();
        this.e = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (this.e.isShowing()) {
            return;
        }
        this.e.show();
    }

    /* synthetic */ void c(View view) {
        LogUtil.a("WearHomeStatusCard", "The user indicates know.");
        this.e.dismiss();
        this.e = null;
    }

    private void q() {
        LogUtil.d("WearHomeStatusCard", "showBandUnavailableDialog");
        boolean zI = CommonUtil.i(this.mContext, "com.huawei.ui.homewear21.home.WearHomeActivity");
        LogUtil.d("WearHomeStatusCard", "isForeground : ", Boolean.valueOf(zI));
        if (zI) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.mContext).a(R.string.IDS_service_area_notice_title).a(this.mActivity.getString(R.string.IDS_band_is_unavailable_tip_string_newphone)).a(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: tnp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.d("WearHomeStatusCard", "onClick showBandUnavailableDialog");
                }
            }).b();
            customTextAlertDialogB.setCancelable(false);
            if (customTextAlertDialogB.isShowing()) {
                return;
            }
            customTextAlertDialogB.show();
        }
    }

    public void a() {
        String deviceIdentify;
        LogUtil.a("MainUI", 0, "WearHomeStatusCard", "Enter GET_BATTETY_LEVEL");
        if (this.mActivity != null && this.mActivity.d != null) {
            deviceIdentify = this.mActivity.d.getDeviceIdentify();
        } else {
            deviceIdentify = "";
        }
        if (deviceIdentify.isEmpty()) {
            tfn.a().h();
        } else {
            tfn.a().d(deviceIdentify);
        }
    }

    public void c() {
        LogUtil.a("WearHomeStatusCard", "Enter GET_WEAR_PLACE_CODE");
        if (this.mActivity != null) {
            if (this.mActivity.d != null) {
                lwt.d().c(this.mActivity.d, new b(this.mActivity), "WearHomeStatusCard");
            } else {
                lwt.d().e(new b(this.mActivity), "WearHomeStatusCard");
            }
            this.mActivity.d().sendEmptyMessageDelayed(1006, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        LogUtil.a("MainUI", 0, "WearHomeStatusCard", "Enter refreshBattery value:", Integer.valueOf(i));
        if (!CommonUtil.x(this.mContext) && this.mActivity.d != null && this.mActivity.d.getDeviceConnectState() == 2) {
            this.mActivity.h = true;
        }
        if (this.mActivity.h) {
            if (maq.b().c(this.mActivity.f26233a) == 6) {
                LogUtil.a("MainUI", 0, "WearHomeStatusCard", "Enter refreshBattery device is OTA");
                return;
            }
            Message messageObtainMessage = this.mActivity.d().obtainMessage();
            messageObtainMessage.what = 1003;
            messageObtainMessage.arg1 = i;
            this.mActivity.d().removeMessages(1003);
            this.mActivity.d().sendMessage(messageObtainMessage);
            return;
        }
        LogUtil.j("MainUI", 0, "WearHomeStatusCard", "updateBluetoothState isConnect is false");
    }

    public void d(Message message) {
        if (this.l == null) {
            LogUtil.j("WearHomeStatusCard", "handlerRefreshBatteryState mWearHomeStatusHolder is null");
            return;
        }
        b(message.arg1);
        this.l.f().setText(this.mContext.getResources().getString(R.string.IDS_wearhome_connected));
        if (this.l.l().getVisibility() == 0) {
            this.l.l().setVisibility(8);
        }
    }

    private void b(int i) {
        LogUtil.a("WearHomeStatusCard", "Enter refreshBatteryState");
        if (eey.d(this.mActivity.d, 112)) {
            d(i);
            return;
        }
        if (i == -1) {
            LogUtil.j("WearHomeStatusCard", "refreshBatteryState BATTERY_INVALID");
            this.l.b().setVisibility(8);
            return;
        }
        if (this.l.b().getVisibility() != 0) {
            this.l.b().setVisibility(0);
        }
        if (LanguageUtil.ba(this.mContext)) {
            this.l.e().setImageDrawable(qqz.e(this.mContext, qrs.d(i)));
        } else {
            this.l.e().setImageDrawable(qrs.d(i));
        }
        String strE = UnitUtil.e(i, 2, 0);
        this.l.a().setText(strE);
        if (lrd.d()) {
            HealthTextView healthTextViewA = this.l.a();
            String strA = qre.a(R.string.accessibility_battery_percent, strE);
            LogUtil.a("WearHomeStatusCard", "isTouchExplorationEnabled batteryDesc is", strA);
            lrd.b(healthTextViewA, strA);
        }
    }

    private void d(int i) {
        if (this.l.m().getVisibility() != 0) {
            this.l.m().setVisibility(0);
        }
        if (i == -1) {
            this.l.i().setText("--");
        } else {
            this.l.i().setText(UnitUtil.e(i, 2, 0));
        }
        mgp mgpVarA = mgt.a(this.mActivity.f26233a);
        int iB = mgpVarA.b();
        int iE = mgpVarA.e();
        if (iB == -1) {
            this.l.o().setText("--");
        } else {
            this.l.o().setText(UnitUtil.e(iB, 2, 0));
        }
        if (iE == -1) {
            this.l.n().setText("--");
        } else {
            this.l.n().setText(UnitUtil.e(iE, 2, 0));
        }
    }

    public void e(Message message) {
        if (this.l == null) {
            LogUtil.j("WearHomeStatusCard", "handlerRefreshWearPlace mWearHomeStatusHolder is null");
            return;
        }
        int i = message.arg1;
        if (this.mActivity.o) {
            this.l.t().setVisibility(0);
            this.l.c().setText(lwr.e().d(i));
            this.l.d().setText(this.f49381c.getResources().getString(R.string.IDS_bolt_wear_place));
            if (i == 240) {
                r();
                return;
            }
            return;
        }
        this.l.t().setVisibility(8);
    }

    private void r() {
        LogUtil.a("WearHomeStatusCard", "showBoltLowTemperatureAndBatteryDialog. ");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.mContext);
        builder.a(String.format(Locale.ROOT, this.mContext.getString(R.string.IDS_bolt_low_temperature_battery_tip), tqp.b(this.mContext, this.mActivity.d.getDeviceIdentify(), true))).a(R.string.sug_dialog_yes, new View.OnClickListener() { // from class: tnf.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("WearHomeStatusCard", "showBoltLowTemperatureAndBatteryDialog click.");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public void d() {
        this.mActivity.d().removeMessages(1006);
        if (this.l == null) {
            LogUtil.j("WearHomeStatusCard", "handlerTimeOutWearPlace mWearHomeStatusHolder is null");
        } else {
            if (this.mActivity.o) {
                this.l.t().setVisibility(0);
                this.l.c().setText(this.f49381c.getResources().getString(R.string.IDS_bolt_wear_unrecognized));
                this.l.d().setText(this.f49381c.getResources().getString(R.string.IDS_bolt_wear_place));
                return;
            }
            this.l.t().setVisibility(8);
        }
    }

    private void v() {
        LogUtil.a("MainUI", "isDeviceOTA :", Integer.valueOf(maq.b().c(this.mActivity.f26233a)));
        if (maq.b().c(this.mActivity.f26233a) == 6) {
            k();
            return;
        }
        this.l.l().setVisibility(8);
        if (eey.d(this.mActivity.d, 112)) {
            this.l.m().setVisibility(0);
        } else {
            this.l.b().setVisibility(0);
        }
        if (this.mActivity.o) {
            this.l.t().setVisibility(0);
        }
        this.l.j().setVisibility(8);
        this.l.f().setText(this.f49381c.getResources().getString(R.string.IDS_wearhome_connected));
        if (this.mActivity.d != null) {
            boolean z = this.mActivity.d.getPowerSaveModel() == 1;
            boolean z2 = mgb.d(this.mActivity.d.getDeviceIdentify()) == 2;
            if (z) {
                if (tqp.e(this.mActivity.d.getProductType())) {
                    this.l.g().setText(this.f49381c.getResources().getString(R.string.IDS_device_power_saving));
                    this.l.r().setText(this.f49381c.getResources().getString(R.string.IDS_quit_power_saving_tip));
                } else {
                    this.l.g().setText(this.f49381c.getResources().getString(R.string.IDS_archi_power_saving));
                    this.l.r().setText(this.f49381c.getResources().getString(R.string.IDS_quit_archi_power_saving));
                }
                this.l.g().setVisibility(0);
                this.l.r().setVisibility(0);
            } else if (z2) {
                this.l.g().setText(this.f49381c.getResources().getString(R.string.IDS_device_family_code));
                this.l.g().setVisibility(0);
                this.l.r().setVisibility(8);
            } else {
                this.l.g().setVisibility(8);
                this.l.r().setVisibility(8);
            }
        }
        tge.b(0);
        this.mActivity.d().sendEmptyMessage(1002);
    }

    private void k() {
        this.l.l().setVisibility(8);
        this.l.b().setVisibility(8);
        this.l.t().setVisibility(8);
        this.l.m().setVisibility(8);
        this.l.j().setVisibility(0);
        this.l.f().setText(this.f49381c.getResources().getString(R.string.IDS_ota_update_state_upgrading));
        this.l.j().setVisibility(0);
    }

    private void n() {
        this.l.l().setVisibility(8);
        this.l.b().setVisibility(8);
        this.l.t().setVisibility(8);
        this.l.m().setVisibility(8);
        this.l.j().setVisibility(0);
        if (!TextUtils.isEmpty(this.f49380b)) {
            this.l.g().setVisibility(0);
            this.l.g().setText(this.f49380b);
        } else {
            this.l.g().setVisibility(8);
        }
        this.l.r().setVisibility(8);
        this.l.f().setText(this.f49381c.getResources().getString(R.string.IDS_device_connecting_21));
    }

    private void i(View view) {
        if (this.mActivity == null || this.mActivity.isDestroyed() || this.mActivity.isFinishing()) {
            return;
        }
        LogUtil.a("WearHomeStatusCard", "enter createAlertDialog");
        if (this.f == null) {
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.mContext);
            builder.b(this.f49381c.getString(R.string.IDS_device_mgr_pair_note_can_not_connect)).a(view).d(R.string.IDS_common_notification_know_tips, new DialogInterface.OnClickListener() { // from class: tni
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LogUtil.a("WearHomeStatusCard", "showAlertDialog onclick PositiveButton");
                }
            });
            CustomAlertDialog customAlertDialogB = builder.b();
            this.f = customAlertDialogB;
            customAlertDialogB.setCancelable(true);
        }
        this.f.show();
    }

    public void d(DeviceInfo deviceInfo) {
        LogUtil.a("MainUI", 0, "Enter processConnectedStateChange ");
        if (deviceInfo != null && BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.a("MainUI", 0, "processConnectedStateChange BT switch is false!");
            p();
        } else {
            LogUtil.a("MainUI", 0, "processConnectedStateChange close BT Dialog!");
            l();
        }
    }

    private void p() {
        if (Build.VERSION.SDK_INT > 30) {
            PermissionUtil.d(this.mContext, PermissionUtil.PermissionType.SCAN, new BluetoothPermisionUtils.NearbyPermissionAction(this.mContext) { // from class: tnf.10
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("WearHomeStatusCard", "preShowOpenSystemBluetoothDialog nearby permission granted");
                    tnf.this.u();
                }
            });
        } else {
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        LogUtil.a("MainUI", 0, "WearHomeStatusCard", "Enter showOpenSystemBluetoothDialog");
        if (tfn.a() == null || tfn.a().n()) {
            LogUtil.a("MainUI", 0, "WearHomeStatusCard", "showOpenSystemBluetoothDialog return");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.h;
        if (noTitleCustomAlertDialog != null) {
            if (noTitleCustomAlertDialog.isShowing()) {
                return;
            }
            this.h.show();
            return;
        }
        LogUtil.a("MainUI", 0, "WearHomeStatusCard", "showOpenSystemBluetoothDialog app");
        String string = this.mActivity.getResources().getString(R.string.IDS_app_name_health);
        String str = String.format(Locale.ENGLISH, this.mActivity.getResources().getString(R.string.IDS_device_bt_open_request_info), string);
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.mContext).a(str).c(this.mActivity.getResources().getString(R.string.IDS_device_bt_open_info_tip)).a(R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: tnv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49413a.j(view);
            }
        }).c(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: tnw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        }).c();
        this.h = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.h.show();
    }

    /* synthetic */ void j(View view) {
        if (tfn.a() != null && tfn.a().n()) {
            tfn.a().c(false);
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.h;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.h = null;
        }
    }

    /* synthetic */ void e(View view) {
        LogUtil.a("MainUI", 0, "WearHomeStatusCard", "showOpenSystemBluetoothDialog positive.");
        if (tfn.a() == null || tfn.a().n()) {
            return;
        }
        this.d = new BtSwitchStateCallback() { // from class: tnk
            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
            public final void onBtSwitchStateCallback(int i) {
                this.f49391b.a(i);
            }
        };
        BTDeviceMgrUtil.c().c(this.d);
    }

    /* synthetic */ void a(int i) {
        LogUtil.a("WearHomeStatusCard", "showOpenSystemBluetoothDialog switchState :", Integer.valueOf(i));
        if (i == 3) {
            BTDeviceMgrUtil.c().e(this.d);
            i();
        }
    }

    private void l() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.h;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (this.mActivity == null) {
            LogUtil.j("MainUI", 0, "WearHomeStatusCard", "received，mActivity is empty");
        } else if (this.mActivity.f26233a == null) {
            LogUtil.j("MainUI", 0, "WearHomeStatusCard", "received，mActivity.mDeviceMac is empty");
        } else {
            if (this.mActivity.f26233a.equals(str)) {
                return;
            }
            LogUtil.a("MainUI", 0, "WearHomeStatusCard", "received，deviceMac:", BTDeviceMgrUtil.c().e(str), "mActivity.mDeviceMac is:", BTDeviceMgrUtil.c().e(this.mActivity.f26233a));
        }
    }

    static class b implements WearPlaceCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<WearHomeOldActivity> f49388c;

        b(WearHomeOldActivity wearHomeOldActivity) {
            this.f49388c = new WeakReference<>(wearHomeOldActivity);
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdevicemodemgr.callback.WearPlaceCallback
        public void onResponse(DeviceInfo deviceInfo, int i) {
            WearHomeOldActivity wearHomeOldActivity = this.f49388c.get();
            if (deviceInfo == null || TextUtils.isEmpty(wearHomeOldActivity.f26233a)) {
                LogUtil.j("WearHomeStatusCard", "WearHomePlaceCallback enter deviceInfo = null or mDeviceMac = null");
                return;
            }
            if (maq.b().c(wearHomeOldActivity.f26233a) == 6) {
                LogUtil.a("MainUI", 0, "WearHomeStatusCard", "Enter refreshWearPlace device is OTA");
                return;
            }
            if (TextUtils.equals(deviceInfo.getDeviceIdentify(), wearHomeOldActivity.f26233a)) {
                if (wearHomeOldActivity.d() == null) {
                    LogUtil.j("WearHomeStatusCard", "activity.getMessageHandler() == null");
                    return;
                }
                LogUtil.a("WearHomeStatusCard", "WearHomePlaceCallback onResponse");
                Message messageObtainMessage = wearHomeOldActivity.d().obtainMessage();
                messageObtainMessage.what = 1005;
                messageObtainMessage.arg1 = i;
                wearHomeOldActivity.d().removeMessages(1005);
                wearHomeOldActivity.d().removeMessages(1006);
                wearHomeOldActivity.d().sendMessage(messageObtainMessage);
            }
        }
    }
}
