package com.huawei.ui.homewear21.home.legal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.constant.TransferBusinessType;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import com.huawei.pluginachievement.gltexture.util.FileUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.adapter.WearHomeLegalRecyclerAdapter;
import com.huawei.ui.homewear21.home.bean.WearHomeXmlParseBean;
import com.huawei.ui.homewear21.home.listener.WearHomeListener;
import defpackage.cpk;
import defpackage.edy;
import defpackage.lsp;
import defpackage.lvb;
import defpackage.lwg;
import defpackage.mgg;
import defpackage.mhp;
import defpackage.nvd;
import defpackage.pil;
import defpackage.qpx;
import defpackage.qsp;
import defpackage.tll;
import defpackage.tpd;
import defpackage.vxc;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeLegalInformationActivity extends BaseActivity implements IBaseResponseCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeviceSettingsInteractors f26345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26346c;
    private Context e;
    private String g;
    private Context j;
    private String k;
    private CommonDialog21 l;
    private int n;
    private WearHomeLegalRecyclerAdapter o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26344a = "software_license_service_agreement";
    public String d = "";
    private List<tll> i = new ArrayList(16);
    private String s = BaseApplication.getContext().getFilesDir() + "/source/";
    private c f = new c(this);
    private String h = "";
    private String m = "";

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.legal_information_activity);
        this.j = this;
        Context context = BaseApplication.getContext();
        this.e = context;
        this.f26345b = DeviceSettingsInteractors.e(context);
        g();
        a();
        f();
    }

    private void g() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("device_id");
        this.d = stringExtra;
        if (stringExtra == null) {
            this.d = "";
        }
        this.h = intent.getStringExtra("device_name");
        this.n = intent.getIntExtra("product_type", 0);
        this.m = intent.getStringExtra("wear_legal_come_from");
        lwg.d().c(this);
    }

    private void f() {
        j();
        h();
    }

    private void h() {
        this.o.b(new WearHomeListener() { // from class: com.huawei.ui.homewear21.home.legal.WearHomeLegalInformationActivity.1
            @Override // com.huawei.ui.homewear21.home.listener.WearHomeListener
            public void onItemClick(int i) throws Throwable {
                DeviceInfo deviceInfoB = mgg.b(WearHomeLegalInformationActivity.this.d, "WearHomeLegalInformationActivity");
                if (deviceInfoB != null) {
                    WearHomeLegalInformationActivity.this.f26346c = deviceInfoB.getDeviceConnectState();
                    WearHomeLegalInformationActivity.this.k = deviceInfoB.getSoftVersion();
                    WearHomeLegalInformationActivity.this.g = deviceInfoB.getDeviceModel();
                }
                if (i >= 0 && i < WearHomeLegalInformationActivity.this.i.size()) {
                    int iD = ((tll) WearHomeLegalInformationActivity.this.i.get(i)).d();
                    LogUtil.a("WearHomeLegalInformationActivity", "onItemClick legalType： ", Integer.valueOf(iD));
                    if (iD != 0) {
                        if (iD == 1) {
                            WearHomeLegalInformationActivity wearHomeLegalInformationActivity = WearHomeLegalInformationActivity.this;
                            wearHomeLegalInformationActivity.b("open_source.zip", 11, "/NOTICE-all.html", wearHomeLegalInformationActivity.j.getString(R.string.IDS_setting_wearhome_open_source_license));
                            return;
                        }
                        if (iD == 2) {
                            WearHomeLegalInformationActivity.this.b();
                            return;
                        }
                        if (iD == 3) {
                            tpd.d(WearHomeLegalInformationActivity.this.j, 3, WearHomeLegalInformationActivity.this.n);
                            return;
                        }
                        if (iD != 4 && iD != 5) {
                            if (iD == 10) {
                                tpd.d(WearHomeLegalInformationActivity.this.j, 10, WearHomeLegalInformationActivity.this.n);
                                return;
                            }
                            switch (iD) {
                                case 14:
                                case 15:
                                    break;
                                case 16:
                                    WearHomeLegalInformationActivity wearHomeLegalInformationActivity2 = WearHomeLegalInformationActivity.this;
                                    wearHomeLegalInformationActivity2.b("webview_license_source.zip", 25, "/webview_license_source.html", wearHomeLegalInformationActivity2.j.getString(R.string.IDS_setting_wearhome_system_webView_license));
                                    break;
                                default:
                                    LogUtil.j("WearHomeLegalInformationActivity", "position is null");
                                    break;
                            }
                            return;
                        }
                    }
                    WearHomeLegalInformationActivity.this.b(iD);
                    return;
                }
                LogUtil.j("WearHomeLegalInformationActivity", "position is wrong ");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (i == 0) {
            tpd.e(this.j, "HealthUserPrivacyStatement", this.d, this.h, this.n, this.m);
            return;
        }
        if (i == 4) {
            tpd.e(this.j, "WatchHealthUserAgreement", this.d, this.h, this.n, this.m);
            return;
        }
        if (i == 5) {
            tpd.e(this.j, "WatchHealthHarmonyOSAgreement", this.d, this.h, this.n, this.m);
            return;
        }
        if (i == 14) {
            tpd.e(this.j, "SagaPrivacyStatement", "", "", this.n, this.m);
        } else if (i == 15) {
            tpd.e(this.j, "SagaPersonalInfoCollection", "", "", this.n, this.m);
        } else {
            LogUtil.j("WearHomeLegalInformationActivity", "position is null");
        }
    }

    private String d(String str, int i) {
        if (this.f26346c == 2) {
            String strE = cpk.e(b(str, i), "");
            if (!TextUtils.isEmpty(strE) && strE.contains(",")) {
                String[] strArrSplit = strE.split(",");
                if (strArrSplit.length == 2) {
                    String str2 = strArrSplit[0];
                    String str3 = strArrSplit[1];
                    if (!TextUtils.isEmpty(str2) && str2.equals(this.k)) {
                        return str3;
                    }
                }
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2, int i) {
        cpk.d(b(str2, i), this.k + "," + str);
    }

    private String b(String str, int i) {
        return lsp.b(this.j, this.g + this.n + this.d + str + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str, final int i, final String str2, final String str3) {
        String strD = d(str, i);
        if (!TextUtils.isEmpty(strD)) {
            String strC = CommonUtil.c(this.s);
            if (pil.e(strD, strC) > 0) {
                LogUtil.a("WearHomeLegalInformationActivity", "Load the ", str, " file from the cache");
                tpd.b(strC + str2, str3, this.j);
                return;
            }
        }
        if (c()) {
            mhp mhpVar = new mhp();
            mhpVar.d(this.d);
            mhpVar.a(str);
            mhpVar.c(i);
            mhpVar.e(TransferFileReqType.FILEREQUEST_DELIVERY);
            mhpVar.e(false);
            lvb.e().b(TransferBusinessType.FIVE_FORTY_FOUR, mhpVar, new IAppTransferFileResultAIDLCallback.Stub() { // from class: com.huawei.ui.homewear21.home.legal.WearHomeLegalInformationActivity.4
                @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
                public void onFileRespond(int i2, String str4) {
                    WearHomeLegalInformationActivity.this.m();
                    if (str4 != null) {
                        String strC2 = CommonUtil.c(WearHomeLegalInformationActivity.this.s);
                        if (pil.e(str4, strC2) > 0) {
                            WearHomeLegalInformationActivity.this.d(str4, str, i);
                            tpd.b(strC2 + str2, str3, WearHomeLegalInformationActivity.this.j);
                        }
                    }
                }

                @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
                public void onUpgradeFailed(int i2, String str4) {
                    LogUtil.j("WearHomeLegalInformationActivity", "getOpenSourceFile open source onFailure :", Integer.valueOf(i2));
                    WearHomeLegalInformationActivity.this.d();
                }

                @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
                public void onFileTransferState(int i2, String str4) {
                    LogUtil.a("WearHomeLegalInformationActivity", "getOpenSourceFile open source onProgress :", Integer.valueOf(i2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.f.removeMessages(1);
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.homewear21.home.legal.WearHomeLegalInformationActivity.3
            @Override // java.lang.Runnable
            public void run() {
                WearHomeLegalInformationActivity.this.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f.removeMessages(1);
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.homewear21.home.legal.WearHomeLegalInformationActivity.2
            @Override // java.lang.Runnable
            public void run() {
                WearHomeLegalInformationActivity.this.e();
                qpx.b(WearHomeLegalInformationActivity.this.j, BaseApplication.getContext().getString(R.string.IDS_setting_wearhome_obtain_failed));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() throws Throwable {
        String strD = d("app_open_source.zip", 13);
        if (!TextUtils.isEmpty(strD)) {
            String strC = CommonUtil.c(this.s);
            int iE = pil.e(strD, strC);
            new ArrayList(16);
            if (iE > 0) {
                LogUtil.a("WearHomeLegalInformationActivity", "Load the app_open_source file from the cache");
                a(tpd.d(strC));
                return;
            }
        }
        if (c()) {
            final mhp mhpVar = new mhp();
            mhpVar.a("app_open_source.zip");
            mhpVar.c(13);
            mhpVar.e(false);
            mhpVar.d(null);
            lvb.e().e(mhpVar, new ITransferSleepAndDFXFileCallback.Stub() { // from class: com.huawei.ui.homewear21.home.legal.WearHomeLegalInformationActivity.5
                @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
                public void onSuccess(int i, String str, String str2) throws Throwable {
                    WearHomeLegalInformationActivity.this.m();
                    FileUtil.e(WearHomeLegalInformationActivity.this.j).d(WearHomeLegalInformationActivity.this.s);
                    String strC2 = CommonUtil.c(WearHomeLegalInformationActivity.this.s);
                    int iE2 = pil.e(str, strC2);
                    ArrayList<WearHomeXmlParseBean> arrayList = new ArrayList<>(16);
                    if (iE2 > 0) {
                        WearHomeLegalInformationActivity.this.d(str, mhpVar.f(), mhpVar.n());
                        arrayList = tpd.d(strC2);
                    }
                    WearHomeLegalInformationActivity.this.a(arrayList);
                }

                @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("WearHomeLegalInformationActivity", "source statement onFailure :", str);
                    WearHomeLegalInformationActivity.this.d();
                }

                @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
                public void onProgress(int i, String str) {
                    LogUtil.a("WearHomeLegalInformationActivity", "source statement onProgress :", Integer.valueOf(i));
                }
            });
        }
    }

    private boolean c() {
        LogUtil.a("WearHomeLegalInformationActivity", "enter getDeviceState");
        int i = this.f26346c;
        if (i == 2) {
            LogUtil.a("WearHomeLegalInformationActivity", "enter DEVICE_DISCONNECTED", Integer.valueOf(i));
            i();
            this.f.sendEmptyMessageDelayed(1, 60000L);
            return true;
        }
        qpx.b(this.j, BaseApplication.getContext().getString(R.string.IDS_setting_wearhome_device_disconnected));
        LogUtil.a("WearHomeLegalInformationActivity", "enter connectState =", Integer.valueOf(this.f26346c));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ArrayList<WearHomeXmlParseBean> arrayList) {
        try {
            Intent intent = new Intent(this.j, (Class<?>) WearHomeOpenSourceStatementActivity.class);
            Bundle bundle = new Bundle();
            if (!arrayList.isEmpty()) {
                bundle.putParcelableArrayList("openSourceStatementName", arrayList);
            }
            intent.putExtras(bundle);
            this.j.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WearHomeLegalInformationActivity", "openSourceActivity ActivityNotFoundException");
        }
    }

    private void i() {
        if (this.l == null) {
            new CommonDialog21(this.j, R.style.app_update_dialogActivity);
            CommonDialog21 commonDialog21B = CommonDialog21.b(this.j);
            this.l = commonDialog21B;
            commonDialog21B.b(this.j.getString(R.string.IDS_sns_waiting));
            this.l.setCancelable(false);
        }
        if (isFinishing()) {
            return;
        }
        LogUtil.a("WearHomeLegalInformationActivity", "showLoadingDialog mLoadingDialog.show()");
        this.l.c();
    }

    public void e() {
        CommonDialog21 commonDialog21;
        if (isFinishing() || (commonDialog21 = this.l) == null) {
            return;
        }
        commonDialog21.dismiss();
        this.l = null;
        LogUtil.a("WearHomeLegalInformationActivity", "destroy mLoadingDialog");
    }

    private void j() {
        ((CustomTitleBar) qsp.a(this, R.id.wear_home_legal)).setTitleText(BaseApplication.getContext().getString(R.string.IDS_setting_wearhome_legal_information));
        HealthRecycleView healthRecycleView = (HealthRecycleView) qsp.a(this, R.id.legal_information);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        healthRecycleView.b(false);
        healthRecycleView.e(false);
        if (this.i != null) {
            WearHomeLegalRecyclerAdapter wearHomeLegalRecyclerAdapter = new WearHomeLegalRecyclerAdapter(this.j, this.i, "legalAdapter");
            this.o = wearHomeLegalRecyclerAdapter;
            healthRecycleView.setAdapter(wearHomeLegalRecyclerAdapter);
        }
    }

    private void a() {
        DeviceCapability deviceCapabilityE = this.f26345b.e(this.d);
        this.i = new ArrayList(5);
        if (deviceCapabilityE != null && deviceCapabilityE.isSupportLegalPrivacy()) {
            this.i.add(new tll(BaseApplication.getContext().getString(R.string.IDS_setting_wearhome_privacy_BG_statement), 0));
        }
        DeviceInfo deviceInfoC = mgg.c(this.d, "WearHomeLegalInformationActivity");
        if (deviceInfoC != null && (deviceInfoC.getProductType() == 80 || deviceInfoC.getProductType() == 107)) {
            int productType = deviceInfoC.getProductType();
            this.n = productType;
            this.i.add(new tll(a(productType), 14));
            if (!Utils.o()) {
                this.i.add(new tll(BaseApplication.getContext().getString(R.string.IDS_hwh_personal_info), 15));
            }
        }
        e(deviceCapabilityE, deviceInfoC);
        if (deviceCapabilityE != null && deviceCapabilityE.isSupportLegalOpenSource()) {
            this.i.add(new tll(BaseApplication.getContext().getString(R.string.IDS_setting_wearhome_open_source_license), 1));
        }
        if (deviceCapabilityE != null && deviceCapabilityE.isSupportLegalServiceStatement()) {
            this.i.add(new tll(BaseApplication.getContext().getString(R.string.IDS_setting_wearhome_basic_service_statement), 3));
        }
        if (deviceCapabilityE != null && deviceCapabilityE.isSupportLegalSourceStatement()) {
            this.i.add(new tll(BaseApplication.getContext().getString(R.string.IDS_setting_wearhome_application_open_source_statement), 2));
        }
        String strG = nvd.g(this.j, this.d);
        if (!TextUtils.isEmpty(strG) && "1".equals(strG)) {
            this.i.add(new tll(BaseApplication.getContext().getString(R.string.IDS_enterprise_statement), 10));
        }
        LogUtil.a("WearHomeLegalInformationActivity", "isSupportLegalSystemWebView ", deviceCapabilityE == null ? " null" : Boolean.valueOf(deviceCapabilityE.isSupportLegalSystemWebView()));
        if (deviceCapabilityE == null || !deviceCapabilityE.isSupportLegalSystemWebView()) {
            return;
        }
        this.i.add(new tll(BaseApplication.getContext().getString(R.string.IDS_setting_wearhome_system_webView_license), 16));
    }

    private void e(DeviceCapability deviceCapability, DeviceInfo deviceInfo) {
        if (deviceCapability != null) {
            if (deviceCapability.isSupportLegalUserAgreement() || deviceCapability.isSupportHarmonyAgreement()) {
                e(deviceInfo, deviceCapability);
            }
        }
    }

    private String a(int i) {
        if (i == 80) {
            return getString(R.string.IDS_setting_wearhome_saga_privacy_statement);
        }
        if (i == 107) {
            return getString(R.string.IDS_setting_wearhome_libra_privacy_statement);
        }
        return "";
    }

    private void e(DeviceInfo deviceInfo, DeviceCapability deviceCapability) {
        if (deviceInfo == null) {
            LogUtil.a("WearHomeLegalInformationActivity", "currentDeviceInfo is null");
        } else if (a(deviceInfo) || deviceCapability.isSupportHarmonyAgreement()) {
            this.i.add(new tll(BaseApplication.getContext().getString(R.string.IDS_setting_wearhome_harmony_os_agreement), 5));
        } else {
            this.i.add(new tll(BaseApplication.getContext().getString(R.string.IDS_setting_wearhome_end_user_agreement), 4));
        }
    }

    private boolean a(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.c("R_WearHomeLegalInformationActivity", "isShowHarmoneyOSAgreement currentDeviceInfo is null");
            return false;
        }
        if (this.n == 0) {
            this.n = deviceInfo.getProductType();
        }
        String hiLinkDeviceId = deviceInfo.getHiLinkDeviceId();
        edy edyVarD = vxc.d(this.n, hiLinkDeviceId);
        ReleaseLogUtil.c("R_WearHomeLegalInformationActivity", "isShowHarmoneyOSAgreement mProductType:", Integer.valueOf(this.n), ",hiLinkDeviceId:", hiLinkDeviceId, ",userLicenseInfo:", Boolean.valueOf(Objects.isNull(edyVarD)));
        if (edyVarD == null) {
            ReleaseLogUtil.c("R_WearHomeLegalInformationActivity", "isShowHarmoneyOSAgreement mProductType:", Integer.valueOf(this.n), ",userLicenseInfo is null");
            return false;
        }
        List<String> listD = edyVarD.d();
        String strE = edyVarD.e();
        if (CollectionUtils.a(listD) || !"software_license_service_agreement".equals(strE) || !listD.contains(hiLinkDeviceId)) {
            ReleaseLogUtil.c("R_WearHomeLegalInformationActivity", "isShowHarmoneyOSAgreement not match device");
            return false;
        }
        ReleaseLogUtil.c("R_WearHomeLegalInformationActivity", "isShowHarmoneyOSAgreement match device");
        return true;
    }

    static class c extends Handler {
        WeakReference<WearHomeLegalInformationActivity> d;

        c(WearHomeLegalInformationActivity wearHomeLegalInformationActivity) {
            this.d = new WeakReference<>(wearHomeLegalInformationActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            WearHomeLegalInformationActivity wearHomeLegalInformationActivity = this.d.get();
            if (wearHomeLegalInformationActivity != null && message.what == 1) {
                LogUtil.a("WearHomeLegalInformationActivity", "handleMessage time out start");
                wearHomeLegalInformationActivity.d();
                LogUtil.a("WearHomeLegalInformationActivity", "handleMessage time out end");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e();
        this.f.removeMessages(1);
        lwg.d().d(this);
    }

    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
    /* JADX INFO: renamed from: onResponse */
    public void a(int i, Object obj) {
        if (isFinishing()) {
            return;
        }
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
