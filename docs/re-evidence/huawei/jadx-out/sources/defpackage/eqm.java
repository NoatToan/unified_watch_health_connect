package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.huawei.ecologydevice.R;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.VersionVerifyUtilApi;
import com.huawei.health.device.callback.VersionNoSupportCallback;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.ble.BleJsInteractionCompact;
import com.huawei.pluginmgr.hwwear.bean.DeviceDownloadSourceInfo;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eqm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomProgressDialog.Builder f33362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTextAlertDialog f33363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private est f33364c;
    private Activity d;
    private CustomProgressDialog e;
    private DownloadResultCallBack f;
    private boolean g;
    private String h;
    private esw i;
    private Handler j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private ArrayList<String> q;

    /* JADX INFO: renamed from: eqm$3, reason: invalid class name */
    class AnonymousClass3 extends est {
        AnonymousClass3() {
        }

        @Override // defpackage.ess
        public void onSuccess() {
            LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "onSuccess");
            VersionVerifyUtilApi versionVerifyUtilApi = (VersionVerifyUtilApi) Services.b("PluginDevice", VersionVerifyUtilApi.class);
            if (!versionVerifyUtilApi.isPublishVersion(eqm.this.o, eqm.this.m)) {
                versionVerifyUtilApi.noSupportDevice(eqm.this.d, eqm.this.d, new VersionNoSupportCallback() { // from class: eqn
                    @Override // com.huawei.health.device.callback.VersionNoSupportCallback
                    public final void onDialogClose() {
                        this.f33368c.e();
                    }
                });
                return;
            }
            if (eqm.this.g) {
                etn.b(eqm.this.d, eqm.this.o);
            } else {
                eqm.this.i();
            }
            eqm.this.e("");
        }

        /* synthetic */ void e() {
            eqm.this.e("");
        }

        @Override // defpackage.ess
        public void onDownload(final int i) {
            eqm.this.j.post(new Runnable() { // from class: equ
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a(i);
                }
            });
        }

        /* synthetic */ void a(int i) {
            if (i == 0) {
                LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "onDownload");
                eqm.this.g();
            }
            eqm.this.b(i);
        }

        @Override // defpackage.ess
        public void onFailure(int i) {
            LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "onFailure");
            if (eqm.this.d == null) {
                LogUtil.j("PluginDevice_ThirdDeviceQrCodeHelper", "activity is null");
            } else {
                eqm eqmVar = eqm.this;
                eqmVar.e(eqmVar.d.getString(R.string.IDS_downlod_device_error));
            }
        }
    }

    public eqm(Activity activity, String str, String str2, String str3) {
        this(activity, str, str2, str3, null);
    }

    public eqm(Activity activity, String str, String str2, String str3, String str4) {
        this.j = new Handler(Looper.getMainLooper());
        this.f = new DownloadResultCallBack() { // from class: eqm.5
            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack
            public void setDownloadStatus(int i, int i2) {
                if (i == 0) {
                    return;
                }
                LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "setDownloadStatus status: ", Integer.valueOf(i));
                if (i == 1) {
                    piq.e().c();
                    eqm.this.h();
                } else {
                    eqm eqmVar = eqm.this;
                    eqmVar.e(eqmVar.d.getString(R.string.IDS_downlod_device_error));
                }
                ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).onDownloadIndexAllDestroy();
            }
        };
        this.f33364c = new AnonymousClass3();
        this.d = activity;
        this.l = str;
        this.k = str2;
        this.n = str3;
        this.h = str4;
    }

    public void c(String str, boolean z) {
        this.g = z;
        a(str);
    }

    public void a(final String str) {
        LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "initDownloadData");
        if (this.d == null) {
            LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "startDownloadResource activity is null");
            return;
        }
        if (TextUtils.isEmpty(this.n) || TextUtils.isEmpty(str)) {
            LogUtil.j("PluginDevice_ThirdDeviceQrCodeHelper", "smartProductId or kindName is null");
            d();
            return;
        }
        if (!CommonUtil.ab(this.d)) {
            e(this.d.getString(R.string.IDS_network_check));
            return;
        }
        if (Utils.o()) {
            this.j.post(new Runnable() { // from class: eqo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33369b.f();
                }
            });
            return;
        }
        this.m = str;
        if (lql.a(this.d)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: eqq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33372b.d(str);
                }
            });
        } else {
            ProductMapParseUtil.a(BaseApplication.getContext());
            g(str);
        }
    }

    /* synthetic */ void d(String str) {
        if (lql.b(BaseApplication.getContext(), 2)) {
            g(str);
        } else {
            LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "download map fail");
            e(this.d.getString(R.string.IDS_downlod_device_error));
        }
    }

    private void g(String str) {
        LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "initDownloadData");
        ProductMapInfo productMapInfoD = ProductMap.d(this.n);
        if (productMapInfoD == null) {
            LogUtil.j("PluginDevice_ThirdDeviceQrCodeHelper", "startDownloadResource sportProductInfo is null");
            e(this.d.getString(R.string.IDS_downlod_device_error));
            return;
        }
        this.o = productMapInfoD.f();
        this.q = new ArrayList<>(16);
        if (TextUtils.isEmpty(this.o)) {
            LogUtil.j("PluginDevice_ThirdDeviceQrCodeHelper", "startDownloadResource sportProductInfo is null");
            e(this.d.getString(R.string.IDS_downlod_device_error));
        } else {
            this.q.add(this.o);
            this.i = new esw(this.d, str, 1, this.q, this.f33364c);
            a();
        }
    }

    private void a() {
        DownloadManagerApi downloadManagerApi = (DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class);
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            LogUtil.j("PluginDevice_ThirdDeviceQrCodeHelper", "downloadResource net is error");
            e(this.d.getString(R.string.IDS_network_check));
        } else {
            downloadManagerApi.addDownloadIndexAllCallBack(this.f);
            ReleaseLogUtil.d("EcologyDevice_ThirdDeviceQrCodeHelper", "downLoad index_all");
            downloadManagerApi.downloadIndexAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        List<pjc> listC = piq.e().c(this.q.get(0));
        if (njy.b(listC)) {
            DeviceDownloadSourceInfo deviceDownloadSourceInfoG = listC.get(0).g();
            if (deviceDownloadSourceInfoG != null && deviceDownloadSourceInfoG.getSite() == 1) {
                LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "deviceDownloadSource site = 1");
                this.i.e(deviceDownloadSourceInfoG);
            }
            this.i.b();
            return;
        }
        e(this.d.getString(R.string.IDS_downlod_device_error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str) {
        this.j.post(new Runnable() { // from class: eqp
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b(str);
            }
        });
    }

    /* synthetic */ void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            c(str);
        }
        c();
        d();
        b();
    }

    private void c(String str) {
        Activity activity = this.d;
        if (activity == null) {
            LogUtil.j("PluginDevice_ThirdDeviceQrCodeHelper", "activity is null");
        } else {
            qpx.b(activity, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "startDownLoadProgress");
        CustomProgressDialog customProgressDialog = this.e;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "startDownLoadProgress exists");
            return;
        }
        this.e = new CustomProgressDialog(this.d);
        CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.d);
        this.f33362a = builder;
        builder.e(this.d.getString(R.string.IDS_app_update_updating)).e(new View.OnClickListener() { // from class: eqm.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "startDownLoadProgress onclick cancel");
                eqm.this.j();
            }
        });
        CustomProgressDialog customProgressDialogC = this.f33362a.c();
        this.e = customProgressDialogC;
        customProgressDialogC.setCanceledOnTouchOutside(false);
        if (this.d.isFinishing()) {
            return;
        }
        this.e.show();
        this.f33362a.b(0);
        this.f33362a.b(UnitUtil.e(0.0d, 2, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        CustomProgressDialog customProgressDialog = this.e;
        if (customProgressDialog == null || !customProgressDialog.isShowing() || i <= 0) {
            return;
        }
        this.f33362a.b(i);
        this.f33362a.b(UnitUtil.e(i, 2, 0));
    }

    private void c() {
        LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "enter closeProgress");
        CustomProgressDialog customProgressDialog = this.e;
        if (customProgressDialog == null || !customProgressDialog.isShowing() || this.d.isFinishing()) {
            return;
        }
        this.e.cancel();
        LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "enter closeProgress cancel");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "enter handleCancel");
        e(this.d.getString(R.string.IDS_downlod_device_error));
        if (TextUtils.isEmpty(this.o) || njy.e(this.q)) {
            LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "productId or mUuidList is empty");
            return;
        }
        Iterator<String> it = this.q.iterator();
        while (it.hasNext()) {
            pis pisVarE = piu.c().e(it.next());
            if (pisVarE != null) {
                EzPluginManager.b().c(pisVarE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (TextUtils.isEmpty(this.o)) {
            LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "productId is null");
            return;
        }
        elh elhVarD = ResourceManager.c().d(this.o);
        if (elhVarD == null) {
            LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "productInfo is null");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", this.o);
        contentValues.put("uniqueId", this.k);
        contentValues.put("name", elhVarD.l().d());
        contentValues.put("deviceType", elhVarD.m().name());
        new BleJsInteractionCompact().startH5Pro(this.d, "com.huawei.health.device." + this.o, contentValues, e());
    }

    private String e() {
        if ("O06A".equals(this.n)) {
            return "#/?mac=" + this.k + "&healthProductId=" + this.o;
        }
        if (TextUtils.isEmpty(this.h)) {
            return "#/?sn=" + this.l;
        }
        return "#/?sn=" + this.l + "&ex" + this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        CustomTextAlertDialog customTextAlertDialog = this.f33363b;
        if (customTextAlertDialog != null && customTextAlertDialog.isShowing()) {
            LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "showIsOverseaTipsDialog Already show!");
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.d).b(R.string.IDS_health_third_ecg_qr_tip).a(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: eqm.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (eqm.this.f33363b != null) {
                    eqm.this.f33363b.dismiss();
                }
                eqm.this.d();
            }
        }).b();
        this.f33363b = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (this.f33363b.isShowing()) {
            return;
        }
        this.f33363b.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Activity activity = this.d;
        if (activity == null || "MainActivity".equals(activity.getClass().getSimpleName())) {
            return;
        }
        this.d.finish();
    }

    private void b() {
        LogUtil.a("PluginDevice_ThirdDeviceQrCodeHelper", "downloadClean");
        CustomProgressDialog customProgressDialog = this.e;
        if (customProgressDialog != null) {
            if (customProgressDialog.isShowing()) {
                this.e.dismiss();
            }
            this.e = null;
        }
        CustomProgressDialog.Builder builder = this.f33362a;
        if (builder != null) {
            builder.e((View.OnClickListener) null);
            this.f33362a = null;
        }
        CustomTextAlertDialog customTextAlertDialog = this.f33363b;
        if (customTextAlertDialog != null) {
            if (customTextAlertDialog.isShowing()) {
                this.f33363b.dismiss();
            }
            this.f33363b = null;
        }
        esw eswVar = this.i;
        if (eswVar != null) {
            eswVar.a();
        }
        this.f33364c = null;
        this.j = null;
        this.d = null;
        this.k = null;
        this.l = null;
        this.n = null;
    }
}
