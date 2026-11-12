package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.huawei.devicepair.model.StartPairOption;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IAddDeviceStateAIDLCallback;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.DirectConnectDeviceActivity;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class tpb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f49479c = new Object();
    private static tpb d;
    private String m;
    private Activity e = null;
    private CustomProgressDialog n = null;
    private CustomProgressDialog.Builder o = null;
    private CustomTextAlertDialog j = null;
    private String h = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49480a = "";
    private String l = "";
    private boolean f = false;
    private int k = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f49481b = 104;
    private rcv g = null;
    private Map<String, Integer> i = new HashMap(16);

    private tpb() {
        m();
    }

    public static tpb c() {
        tpb tpbVar;
        synchronized (f49479c) {
            if (d == null) {
                d = new tpb();
            }
            tpbVar = d;
        }
        return tpbVar;
    }

    public void j() {
        p();
    }

    private static void p() {
        synchronized (f49479c) {
            d = null;
        }
    }

    public void c(Activity activity) {
        if (activity != null) {
            this.e = activity;
        }
    }

    public void e(String str, String str2, String str3, int i, boolean z) {
        this.h = str;
        this.f49480a = str2;
        this.l = str3;
        this.k = i;
        d(str3);
        this.f = z;
    }

    private void m() {
        this.i.put("00M005", 57);
        this.i.put("00M0AA", 71);
        this.i.put("00N0A8", 65);
        this.i.put("00N0A6", 35);
        this.i.put("00N0A7", 35);
        this.i.put("00N0AA", 74);
        this.i.put("00M0A2", 72);
        this.i.put("00M0A3", 72);
        this.i.put("00M0A4", 72);
        this.i.put("00M0A5", 72);
        this.i.put("00M0AS", 82);
        this.i.put("00M0AN", 72);
        this.i.put("00M0A6", 72);
        this.i.put("00M0AT", 72);
        this.i.put("00M0B3", 76);
        this.i.put("00M0B4", 76);
        this.i.put("00M0B9", 76);
        this.i.put("00M0BA", 76);
        this.i.put("00M0BB", 76);
        this.i.put("00M0BE", 78);
        this.i.put("00M0BF", 78);
        this.i.put("00M0BL", 78);
        this.i.put("00M0BM", 78);
        this.i.put("00M0BG", 71);
        this.i.put("00M0BH", 71);
        this.i.put("00M0BI", 79);
        this.i.put("00M0BJ", 79);
        this.i.put("00M0B5", 80);
        this.i.put("00M0A0", 71);
        this.i.put("00M0A1", 71);
        this.i.put("00M0A9", 71);
        this.i.put("00M0AD", 71);
        this.i.put("00M0AE", 71);
        this.i.put("00M0AF", 61);
        this.i.put("00M0AG", 61);
        this.i.put("00M0A7", 73);
        this.i.put("00M0A8", 73);
        this.i.put("00M0B2", 75);
        this.i.put("00M0B6", 77);
        this.i.put("00M0B7", 77);
        this.i.put("00M0BN", 81);
        this.i.put("00M0BO", 73);
        this.i.put("00M0BP", 73);
        this.i.put("00M0BW", 83);
        this.i.put("00M0BX", 84);
        l();
        o();
    }

    private void l() {
        this.i.put("00M0C0", 72);
        this.i.put("00M0BZ", 89);
        this.i.put("00M0BY", 89);
        this.i.put("00M0D5", 89);
        this.i.put("00M0E9", 89);
        this.i.put("00M0EA", 89);
        this.i.put("00M0AR", 77);
        this.i.put("00M0C2", 72);
        this.i.put("00M0C7", 85);
        this.i.put("00M0C8", 85);
        this.i.put("00M0C9", 85);
        this.i.put("00M0CA", 85);
        this.i.put("00M0CB", 85);
        this.i.put("00M0CC", 85);
        this.i.put("00M0CD", 85);
        this.i.put("00M0CE", 85);
        this.i.put("00M0CF", 85);
        this.i.put("00M0CG", 85);
        this.i.put("00M0DQ", 85);
        this.i.put("00M0C4", 90);
        this.i.put("00M0C5", 83);
        this.i.put("00M0C6", 83);
        this.i.put("00M0D0", 88);
        this.i.put("00M0CS", 71);
        this.i.put("00M0CT", 71);
        this.i.put("00M0CU", 71);
        this.i.put("00M0CV", 71);
        this.i.put("00M0D7", 71);
        this.i.put("00M0D8", 71);
        this.i.put("00M0CW", 79);
        this.i.put("00M0CY", 79);
        this.i.put("00M0D1", 61);
        this.i.put("00M0D2", 72);
        this.i.put("00M0D3", 72);
        this.i.put("00M0D4", 93);
        this.i.put("00M0CM", 86);
        this.i.put("00M0CO", 86);
        this.i.put("00M0CP", 86);
        this.i.put("00M0E8", 86);
        this.i.put("00M0EW", 86);
        this.i.put("00M0DF", 71);
        this.i.put("00M0DG", 71);
        this.i.put("00M0DH", 71);
        this.i.put("00M0DI", 71);
        this.i.put("00M0DJ", 71);
        this.i.put("00M0DK", 71);
        this.i.put("00M0DL", 71);
        this.i.put("00M0DM", 71);
        this.i.put("00M0DS", 71);
        this.i.put("00M0DT", 71);
        this.i.put("00M0EG", 71);
        this.i.put("00M0DN", 79);
        this.i.put("00M0DO", 79);
        this.i.put("00M0DB", 94);
        this.i.put("00M0DC", 94);
        this.i.put("00M0DV", 97);
        this.i.put("00M0DZ", 97);
        this.i.put("00M0E2", 97);
        this.i.put("00M0E6", 97);
        this.i.put("00M0EB", 99);
        this.i.put("00M0EE", 99);
        this.i.put("00M0EC", 99);
        this.i.put("00M0EF", 99);
        this.i.put("00M0EK", 101);
        this.i.put("00M0EL", 101);
        this.i.put("00M0EM", 101);
        this.i.put("00M0EH", 100);
        this.i.put("00M0EI", 100);
        this.i.put("00M0EJ", 100);
    }

    private void o() {
        this.i.put("00M0ER", 103);
        this.i.put("00M0ET", 103);
        this.i.put("00M0EU", 103);
        this.i.put("00M0EX", 106);
        this.i.put("00M0FC", 106);
        this.i.put("00M0EY", 106);
        this.i.put("00M0F1", 107);
        this.i.put("00M0F2", 108);
        this.i.put("00M0F3", 108);
        this.i.put("00M0F4", 108);
        this.i.put("00M0F5", 108);
        this.i.put("00M0FK", 108);
        this.i.put("00M0EV", 105);
        this.i.put("00M0F9", 112);
        this.i.put("00M0FB", 112);
        this.i.put("00M0FJ", 112);
        this.i.put("00M0FF", 115);
        this.i.put("00M0FG", 115);
        this.i.put("00M0FH", 115);
        this.i.put("00M0F7", 110);
        this.i.put("00M0F8", 111);
        this.i.put("00M0FO", 117);
        this.i.put("00M0FP", 117);
        this.i.put("00M0FS", 117);
        this.i.put("00M0FQ", 117);
        this.i.put("00M0FT", 117);
        Map<String, Integer> map = this.i;
        Integer numValueOf = Integer.valueOf(Constants.MAX_PRO_BOTTOM_MARGIN_PAD);
        map.put("00M0FV", numValueOf);
        this.i.put("00M0FW", numValueOf);
        this.i.put("00M0FX", numValueOf);
        this.i.put("00M0FN", Integer.valueOf(AgrConstant.HEALTH_AGREEMENT_CODE));
    }

    public boolean h() {
        boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(this.m);
        LogUtil.a("DirectConnectDeviceManager", "isHasResource is ", Boolean.valueOf(zIsResourcesAvailable));
        return zIsResourcesAvailable;
    }

    public void i() {
        if (a(this.l) && !this.f) {
            LogUtil.a("DirectConnectDeviceManager", "startConnectDevice go to page device.");
            Activity activity = this.e;
            if (activity == null || activity.isFinishing()) {
                LogUtil.j("DirectConnectDeviceManager", "startConnectDevice mActivity is null.");
                return;
            }
            String strI = lvi.a(this.k).i();
            if (cjk.d().isSupportH5Pair(this.h)) {
                String strJ = lvi.j(this.k);
                ArrayList arrayList = new ArrayList();
                arrayList.add(strJ);
                cjk.d().startPair(this.e, StartPairOption.builder().c(this.f49480a).d(arrayList).d(this.h).a("wear_watch").e(false).a());
                this.e.finish();
                return;
            }
            Intent intent = new Intent(this.e, (Class<?>) DevicePairGuideActivity.class);
            intent.putExtra("pairGuideProductType", this.k);
            intent.putExtra("pairGuideProductName", strI);
            intent.putExtra("pairGuideSelectName", this.h);
            intent.putExtra("pairGuideFromScanList", true);
            intent.putExtra("pairGuideFromNearDiscovery", true);
            intent.putExtra("pairGuideSelectAddress", this.f49480a);
            intent.putExtra("pairGuideDeviceMode", 100008);
            this.e.startActivityForResult(intent, 1);
            Activity activity2 = this.e;
            if (activity2 instanceof DirectConnectDeviceActivity) {
                ((DirectConnectDeviceActivity) activity2).b();
                return;
            }
            return;
        }
        LogUtil.a("DirectConnectDeviceManager", "startConnectDevice other device.");
        DeviceParameter deviceParameter = new DeviceParameter();
        deviceParameter.setBluetoothType(rcv.a(this.k));
        deviceParameter.setProductType(this.k);
        deviceParameter.setDeviceNameInfo(this.h);
        deviceParameter.setMac(this.f49480a);
        deviceParameter.setIsSupportHeartRate(false);
        deviceParameter.setProductPin("");
        c(deviceParameter);
        k();
    }

    private void c(DeviceParameter deviceParameter) {
        this.g = rcv.a(BaseApplication.getContext());
        qzd.c(BaseApplication.getContext()).e((IAddDeviceStateAIDLCallback) null);
        List<DeviceInfo> listB = this.g.b();
        if (listB == null || listB.isEmpty()) {
            this.g.a(deviceParameter, "", null);
            return;
        }
        int size = listB.size();
        LogUtil.a("DirectConnectDeviceManager", "handleDeviceConnect connectDeviceSize :", Integer.valueOf(size));
        if (size == 1) {
            c(deviceParameter, listB);
        } else {
            b(deviceParameter, listB);
        }
    }

    private void c(DeviceParameter deviceParameter, List<DeviceInfo> list) {
        DeviceInfo deviceInfo = list.get(0);
        boolean zD = eel.d(deviceInfo.getProductType());
        int autoDetectSwitchStatus = deviceInfo.getAutoDetectSwitchStatus();
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        LogUtil.a("DirectConnectDeviceManager", "handleSingleConnectedDevice isAw70Connected: ", Boolean.valueOf(zD), ", deviceWorkMode: ", Integer.valueOf(autoDetectSwitchStatus), ", connectedMacAddress: ", CommonUtil.n(deviceIdentify));
        if (!zD) {
            this.g.a(deviceParameter, deviceIdentify, null);
            return;
        }
        if (autoDetectSwitchStatus == 1) {
            this.g.a(deviceParameter, "", null);
        } else if (autoDetectSwitchStatus != 0) {
            LogUtil.j("DirectConnectDeviceManager", "handleSingleConnectedDevice occur error.");
        } else {
            this.g.a(deviceParameter, deviceIdentify, null);
        }
    }

    private void b(DeviceParameter deviceParameter, List<DeviceInfo> list) {
        for (DeviceInfo deviceInfo : list) {
            if (!eel.d(deviceInfo.getProductType())) {
                LogUtil.a("DirectConnectDeviceManager", "handleMoreConnectedDevice disconnect one no aw70 device.");
                this.g.a(deviceParameter, deviceInfo.getDeviceIdentify(), null);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Activity activity = this.e;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.e.finish();
    }

    public void f() {
        LogUtil.a("DirectConnectDeviceManager", "Enter handleDirectConnect mAppEnvironmentState: ", Integer.valueOf(this.f49481b));
        if (Build.VERSION.SDK_INT <= 30) {
            ReleaseLogUtil.e("R_DirectConnectDeviceManager", "goDevicePairPage Phone is below to Android 12");
            q();
        } else {
            PermissionUtil.d(this.e, PermissionUtil.PermissionType.SCAN, new AnonymousClass4(this.e));
        }
    }

    /* JADX INFO: renamed from: tpb$4, reason: invalid class name */
    class AnonymousClass4 extends CustomPermissionAction {
        AnonymousClass4(Context context) {
            super(context);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            tpb.this.q();
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            qpx.e(tpb.this.e, R.string.IDS_nearby_permission_exception);
            tpb.this.e.finish();
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            qrs.c(tpb.this.e, permissionType, (CustomTextAlertDialog) null, new View.OnClickListener() { // from class: tpc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49485b.b(view);
                }
            }, new View.OnClickListener() { // from class: tpf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49495b.c(view);
                }
            });
        }

        /* synthetic */ void b(View view) {
            tpb.this.e.finish();
        }

        /* synthetic */ void c(View view) {
            tpb.this.e.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        switch (this.f49481b) {
            case 100:
            case 101:
            case 103:
                n();
                break;
            case 102:
            case 105:
                g();
                break;
            case 104:
            default:
                LogUtil.j("DirectConnectDeviceManager", "handleDirectConnect mAppEnvironmentState is unknown.");
                if (this.e != null) {
                    LogUtil.a("DirectConnectDeviceManager", "handleDirectConnect Enter goAppMainPage.");
                    Intent launchIntentForPackage = this.e.getPackageManager().getLaunchIntentForPackage(this.e.getPackageName());
                    launchIntentForPackage.putExtra("directConnectDevice", "directConnectDevice");
                    launchIntentForPackage.addFlags(67108864);
                    this.e.startActivity(launchIntentForPackage);
                }
                k();
                break;
        }
    }

    private void n() {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: tpb.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("DirectConnectDeviceManager", "browsingToLogin onResponse errorCode: ", Integer.valueOf(i));
                    if (i == 0) {
                        tpb.this.r();
                    } else {
                        tpb.this.k();
                    }
                }
            }, "");
        } else {
            r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        LogUtil.a("DirectConnectDeviceManager", "Enter handleLogin mAppEnvironmentState: ", Integer.valueOf(this.f49481b));
        int i = this.f49481b;
        if (i == 100 || i == 101) {
            g();
        } else if (i == 103) {
            i();
        } else {
            LogUtil.j("DirectConnectDeviceManager", "handleLogin mAppEnvironmentState is unknown.");
            k();
        }
    }

    public void g() {
        LogUtil.a("DirectConnectDeviceManager", "Enter downloadDeviceResource.");
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            y();
            return;
        }
        v();
        if (!w()) {
            ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).addDownloadIndexAllCallBack(new DownloadResultCallBack() { // from class: tpb.5
                @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack
                public void setDownloadStatus(int i, int i2) {
                    if (i != 0) {
                        ReleaseLogUtil.d("DirectConnectDeviceManager", "downLoad index_all status: ", Integer.valueOf(i));
                        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).onDownloadIndexAllDestroy();
                        tpb tpbVar = tpb.this;
                        tpbVar.d(tpbVar.l);
                        if (!tpb.this.w()) {
                            tpb.this.y();
                        } else {
                            tpb.this.s();
                        }
                    }
                }
            });
            ReleaseLogUtil.d("DirectConnectDeviceManager", "downLoad index_all");
            ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexAll();
            return;
        }
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w() {
        return (this.k == -1 || TextUtils.isEmpty(this.m)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(this.m)) {
            i();
            return;
        }
        pis pisVarE = piu.c().e(this.m);
        if (pisVarE != null) {
            EzPluginManager.b().c(pisVarE);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(lvi.d(this.k));
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexByUuidList(arrayList, null);
    }

    private void v() {
        CustomProgressDialog customProgressDialog = this.n;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            LogUtil.a("DirectConnectDeviceManager", "startDownLoadProgress progress bar is already exist.");
            return;
        }
        Activity activity = this.e;
        if (activity == null || activity.isFinishing()) {
            LogUtil.j("DirectConnectDeviceManager", "startDownLoadProgress mActivity is finished.");
            return;
        }
        this.n = new CustomProgressDialog(this.e);
        CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.e);
        this.o = builder;
        builder.e(this.e.getResources().getString(R.string.IDS_hw_health_wear_update_device_resource_text)).e(new View.OnClickListener() { // from class: tpb.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("DirectConnectDeviceManager", "startDownLoadProgress onClick cancel.");
                tpb.this.t();
            }
        });
        CustomProgressDialog customProgressDialogC = this.o.c();
        this.n = customProgressDialogC;
        customProgressDialogC.setCanceledOnTouchOutside(false);
        this.n.show();
        this.o.b(0);
        this.o.b(ltc.c(0.0d, 2, 0));
        LogUtil.a("DirectConnectDeviceManager", "startDownLoadProgress mCustomProgressDialog show.");
    }

    public void a(int i) {
        if (i == -1) {
            LogUtil.a("DirectConnectDeviceManager", "showDownloadProgress progress is error.");
            rdt.b(100100, "");
            t();
            return;
        }
        CustomProgressDialog customProgressDialog = this.n;
        if (customProgressDialog == null || !customProgressDialog.isShowing() || i < 0) {
            return;
        }
        String strC = ltc.c(i, 2, 0);
        this.o.b(i);
        this.o.b(strC);
    }

    public void a() {
        LogUtil.a("DirectConnectDeviceManager", "Enter closeProgress.");
        CustomProgressDialog customProgressDialog = this.n;
        if (customProgressDialog == null || this.e == null) {
            LogUtil.j("DirectConnectDeviceManager", "closeProgress mCustomProgressDialog or mActivity is null.");
        } else {
            if (!customProgressDialog.isShowing() || this.e.isFinishing()) {
                return;
            }
            LogUtil.a("DirectConnectDeviceManager", "closeProgress cancel.");
            this.n.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        LogUtil.a("DirectConnectDeviceManager", "Enter handleCancel.");
        pis pisVarE = piu.c().e(lvi.d(this.k));
        if (pisVarE != null) {
            EzPluginManager.b().c(pisVarE);
        }
        x();
    }

    private void x() {
        a();
        y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        CustomTextAlertDialog customTextAlertDialog = this.j;
        if (customTextAlertDialog != null && customTextAlertDialog.isShowing()) {
            LogUtil.j("DirectConnectDeviceManager", "showErrorLayoutDialog mDownloadErrorDialog is showing.");
            return;
        }
        Activity activity = this.e;
        if (activity == null || activity.isFinishing()) {
            LogUtil.j("DirectConnectDeviceManager", "showErrorLayoutDialog mActivity is finished.");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            u();
        } else {
            this.e.runOnUiThread(new Runnable() { // from class: tpb.2
                @Override // java.lang.Runnable
                public void run() {
                    tpb.this.u();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.e);
        builder.a(R.string.IDS_service_area_notice_title).b(R.string.IDS_device_device_list_update_failed).a(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: tpb.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (tpb.this.j != null) {
                    tpb.this.j.dismiss();
                    tpb.this.j = null;
                    tpb.this.k();
                }
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        this.j = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.j.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        int i = this.k;
        LogUtil.a("DirectConnectDeviceManager", "enter GetProduct: ", str, " ProductType: ", Integer.valueOf(i), " uuid: ", this.m);
        int i2 = this.k;
        if (i2 != -1) {
            String strD = lvi.d(i2);
            this.m = strD;
            if (!TextUtils.isEmpty(strD)) {
                return;
            }
        }
        for (edv edvVar : ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getUuids()) {
            if (edvVar != null) {
                List<String> listE = edvVar.e();
                if (!coq.d(listE) && !TextUtils.isEmpty(str) && listE.contains(str)) {
                    this.k = edvVar.b();
                    this.m = edvVar.c();
                    return;
                }
            }
        }
    }

    public int d() {
        if (!AuthorizationUtils.c(BaseApplication.getContext())) {
            LogUtil.j("DirectConnectDeviceManager", "checkDeviceDownloadState user no agree privacy.");
            this.f49481b = 100;
            return 100;
        }
        boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(this.m);
        if (Utils.h()) {
            if (!LoginInit.getInstance(BaseApplication.getContext()).getIsLogined()) {
                if (!zIsResourcesAvailable) {
                    LogUtil.j("DirectConnectDeviceManager", "checkDeviceDownloadState account no login and no device resource.");
                    this.f49481b = 101;
                } else {
                    LogUtil.a("DirectConnectDeviceManager", "checkDeviceDownloadState account no login but has device resource.");
                    this.f49481b = 103;
                }
                return this.f49481b;
            }
        } else if (!zIsResourcesAvailable) {
            LogUtil.j("DirectConnectDeviceManager", "checkDeviceDownloadState no cloud and no device resource.");
            this.f49481b = 105;
            return 105;
        }
        if (!zIsResourcesAvailable) {
            LogUtil.j("DirectConnectDeviceManager", "checkDeviceDownloadState no device resource.");
            this.f49481b = 102;
        }
        return this.f49481b;
    }

    public static boolean e() {
        LogUtil.a("DirectConnectDeviceManager", "Enter isFirstOpenAppToDirectConnect.");
        if (CommonUtil.af(BaseApplication.getContext()) || e(BaseApplication.getContext(), BaseApplication.getContext().getPackageName())) {
            LogUtil.a("DirectConnectDeviceManager", "isMainActivityToDirectConnect is system app.");
            return AuthorizationUtils.c(BaseApplication.getContext());
        }
        boolean zEquals = "NOT_FIRST_OPEN_APP_DIRECT_DEVICE".equals(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "FIRST_OPEN_APP_DIRECT_DEVICE"));
        if (!zEquals) {
            LogUtil.a("DirectConnectDeviceManager", "isMainActivityToDirectConnect isDirectlyJump is false.");
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "FIRST_OPEN_APP_DIRECT_DEVICE", "NOT_FIRST_OPEN_APP_DIRECT_DEVICE", null);
        }
        return zEquals && AuthorizationUtils.c(BaseApplication.getContext());
    }

    private static boolean e(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("DirectConnectDeviceManager", "isSystemApp context or packageName is empty.");
            return false;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            return (applicationInfo == null || (applicationInfo.flags & 1) == 0) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("DirectConnectDeviceManager", "isSystemApp occur NameNotFoundException.");
        }
    }

    public static void b() {
        LogUtil.a("DirectConnectDeviceManager", "Enter setDownloadResourceFlag.");
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "DIRECT_CONNECT_DOWNLOAD_RESOURCE", "DIRECT_CONNECT_DOWNLOAD_RESOURCE", null);
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DirectConnectDeviceManager", "isConnectTypeActivity moduleId is empty.");
            return false;
        }
        return w();
    }

    public int e(String str, Intent intent) {
        this.k = -1;
        if (!TextUtils.isEmpty(str) && this.i.get(str) != null) {
            this.k = this.i.get(str).intValue();
        }
        if (this.k == -1) {
            LogUtil.j("DirectConnectDeviceManager", "getDeviceProductType moduleId is empty.");
            this.k = intent.getIntExtra("DEVICE_PRODUCT_TYPE", -1);
        }
        d(str);
        return this.k;
    }
}
