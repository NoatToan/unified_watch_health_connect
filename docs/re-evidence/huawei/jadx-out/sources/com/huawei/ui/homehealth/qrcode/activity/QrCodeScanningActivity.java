package com.huawei.ui.homehealth.qrcode.activity;

import android.R;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.media3.common.C;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.braintreepayments.api.PayPalRequest;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.BuildConfig;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.qrcode.CodeValueUtil;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hms.network.embedded.u3;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.hwid.common.constants.CommonConstant;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.Product;
import com.huawei.trade.datatype.ProductInfo;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.device.activity.adddevice.OneKeyScanActivity;
import com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler;
import com.huawei.ui.thirdpartservice.activity.healthkit.HealthKitActivity;
import com.huawei.watchface.api.HwWatchFaceManager;
import defpackage.ddv;
import defpackage.dmp;
import defpackage.dti;
import defpackage.ecu;
import defpackage.eqm;
import defpackage.etn;
import defpackage.fod;
import defpackage.gsm;
import defpackage.iov;
import defpackage.irz;
import defpackage.lsy;
import defpackage.mgh;
import defpackage.qpx;
import defpackage.qqt;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qtv;
import defpackage.rdp;
import defpackage.ssj;
import defpackage.ssy;
import defpackage.sts;
import defpackage.sty;
import defpackage.sub;
import defpackage.teg;
import defpackage.wzw;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.Sha256;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes.dex */
public class QrCodeScanningActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CountDownLatch f25695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f25696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f25697c;
    private boolean d = false;
    private boolean e;
    private String i;
    private Bundle j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        this.f25696b = this;
        Intent intent = getIntent();
        if (intent != null) {
            this.j = intent.getExtras();
        }
        Window window = getWindow();
        window.setFormat(-2);
        window.setBackgroundDrawableResource(R.color.transparent);
        this.e = false;
        this.d = false;
        e();
        i();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("QrCodeScanningActivity", "activity is Resume");
        if (!this.d && this.e) {
            LogUtil.a("QrCodeScanningActivity", "activity is resume and finished");
            finish();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.e = true;
        LogUtil.a("QrCodeScanningActivity", "activity is onPause");
    }

    private void d(final ssj ssjVar) {
        rdp.e(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == -1) {
                    ssjVar.c(QrCodeScanningActivity.this);
                } else {
                    ssjVar.d(String.valueOf(608));
                    ssjVar.g();
                }
            }
        }, this.f25696b);
    }

    private void e() {
        if (!c()) {
            LogUtil.a("QrCodeScanningActivity", "not support initCodeValuePlatform");
            return;
        }
        CodeValueUtil.b(getApplication(), String.valueOf(BuildConfig.HMS_APPLICATION_ID));
        if (!CommonUtil.bu()) {
            CodeValueUtil.c();
        }
        this.f25695a = new CountDownLatch(1);
        GRSManager.c(this).d("domainQrcodeMatchRules", new GrsQueryCallback() { // from class: com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity.5
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                CodeValueUtil.b(str, new CodeValueUtil.RuleResultCallback() { // from class: com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity.5.3
                    @Override // com.huawei.health.qrcode.CodeValueUtil.RuleResultCallback
                    public void onResponse(String str2, CodeValueUtil.d dVar) {
                        if (dVar != null && dVar.d() > 0) {
                            LogUtil.a("QrCodeScanningActivity", "initCodeValuePlatform, onUpdate rules size: ", Integer.valueOf(dVar.d()), " with cachePath:", str2);
                        } else {
                            ReleaseLogUtil.e("R_QrCode_QrCodeScanningActivity", "initCodeValuePlatform rules update failed");
                        }
                        QrCodeScanningActivity.this.f25695a.countDown();
                    }
                });
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("QrCodeScanningActivity", "initCodeValuePlatform, get grs is fail");
                QrCodeScanningActivity.this.f25695a.countDown();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("R_QrCode_QrCodeScanningActivity", "onActivityResult requestCode: ", Integer.valueOf(i), " resultCode: ", Integer.valueOf(i2));
        this.d = true;
        super.onActivityResult(i, i2, intent);
        if (i == 608) {
            ReleaseLogUtil.d("QrCodeScanningActivity", "SENSITIVE_PERMISSION_STATUS resultCode", Integer.valueOf(i2));
            QrCodeBaseHandler qrCodeBaseHandlerC = sty.e().c();
            if (!(qrCodeBaseHandlerC instanceof ssj)) {
                LogUtil.j("QrCodeScanningActivity", "SELECT_DEVICE_REQUEST_CODE qrCoderHandler not DeviceQrCodeHandler");
                if (isFinishing()) {
                    return;
                }
                finish();
                return;
            }
            ssj ssjVar = (ssj) qrCodeBaseHandlerC;
            ssjVar.d(String.valueOf(i2));
            if (i2 == -1) {
                SharedPreferenceManager.c("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", SensitivePermissionStatus.RESTART.getValue());
                ssjVar.a(intent);
                ssjVar.g();
                return;
            }
            d(ssjVar);
        }
        b(i, i2, intent);
        e(i, i2, intent);
        d(i, i2, intent);
    }

    protected void e(int i, int i2, Intent intent) {
        if (i == 102) {
            QrCodeBaseHandler qrCodeBaseHandlerC = sty.e().c();
            if (!(qrCodeBaseHandlerC instanceof ssj)) {
                LogUtil.j("QrCodeScanningActivity", "BLUETOOTH_CODE qrCoderHandler not DeviceQrCodeHandler");
                if (isFinishing()) {
                    return;
                }
                finish();
                return;
            }
            ssj ssjVar = (ssj) qrCodeBaseHandlerC;
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (i2 == 0 || defaultAdapter == null || !defaultAdapter.isEnabled()) {
                ssjVar.i();
                LogUtil.a("QrCodeScanningActivity", "stopScanAndCloseTimer");
                if (isFinishing()) {
                    return;
                }
                finish();
                return;
            }
            ssjVar.h();
        }
        if (i != 3 && i2 == 0) {
            LogUtil.a("R_QrCode_QrCodeScanningActivity", "requestCode is not REQUEST_GPS_LOCATION, resultCode is zero, finish activity");
            finish();
            return;
        }
        if (i == 3) {
            i();
            return;
        }
        if (i == 1) {
            if (i2 == 2) {
                qtv.e(intent, this, qtv.c(i2, true, intent.getIntExtra("product_type", -1), true));
                return;
            } else {
                finish();
                return;
            }
        }
        if (i2 == -1 && i == 4) {
            int iC = gsm.c(intent);
            if (iC == 0) {
                u(gsm.b(intent).trim());
            } else if (iC == 2) {
                qrs.e((Activity) this, 4);
            } else {
                finish();
            }
        }
    }

    private void b(int i, int i2, Intent intent) {
        if (i != 10006) {
            return;
        }
        LogUtil.a("QrCodeScanningActivity", "requestCode IS :", Integer.valueOf(i));
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "QrCodeScanningActivity");
        if (deviceInfo == null) {
            qpx.e(BaseApplication.getContext(), com.huawei.ui.homehealth.R.string.verrify_account_disconnect_device);
            finish();
        } else if (!TextUtils.equals(this.f25697c, deviceInfo.getDeviceName())) {
            qpx.e(BaseApplication.getContext(), com.huawei.ui.homehealth.R.string.verrify_account_disconnect_device);
            finish();
        } else {
            if (i2 == -1) {
                mgh.a(deviceInfo, 1, Integer.parseInt(this.i));
            } else {
                mgh.a(deviceInfo, 0, Integer.parseInt(this.i));
            }
            finish();
        }
    }

    private void d(int i, int i2, Intent intent) {
        int iC = gsm.c(intent);
        if (i == 5) {
            if (i2 == -1 && iC == 0) {
                sty.e(this.j, CommonConstant.AckQrLoginVerifyValue.VERIFY_RESULT_OK, "");
            }
            finish();
        }
    }

    private void u(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("R_QrCode_QrCodeScanningActivity", "parseQrCodeResult content is null");
            d();
            return;
        }
        LogUtil.a("QrCodeScanningActivity", "parseQrCodeResult content: ", str);
        if (h(str)) {
            LogUtil.a("QrCodeScanningActivity", "parseQrCodeResult SnCode is match");
            o(str);
            return;
        }
        if (j(str)) {
            LogUtil.a("QrCodeScanningActivity", "parseQrCodeResult NFCCode is match");
            x(str);
            return;
        }
        if (a(str)) {
            if (!Utils.o()) {
                LogUtil.a("QrCodeScanningActivity", "parseQrCodeResult LargeScreenQrCode is match");
                sty.e(this.j, PayPalRequest.LANDING_PAGE_TYPE_LOGIN, "");
                a(this.f25696b, str);
                return;
            } else {
                qpx.e(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(com.huawei.ui.homehealth.R.string.wallet_unenable_country));
                finish();
                return;
            }
        }
        if (b(str)) {
            t(str);
            return;
        }
        if (i(str)) {
            LogUtil.a("QrCodeScanningActivity", "parseQrCodeResult ThirdDeviceCode is match");
            c(str);
        } else if (!CommonUtil.cl() ? !(!str.contains("sns.hicloud") || !str.contains("/g/")) : !(!str.contains("lfsnstest01.hwcloudtest") || !str.contains("/g/"))) {
            LogUtil.a("QrCodeScanningActivity", "parseQrCodeResult go to group");
            r(str);
        } else {
            k(str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    private void m(String str) {
        byte b2;
        String str2;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("QrCodeScanningActivity", "jumpThirdH5Page content is null");
            return;
        }
        if (sts.a(str)) {
            finish();
            return;
        }
        LogUtil.a("QrCodeScanningActivity", "jumpThirdH5Page: not common h5pro app url, continue.");
        String[] strArrSplit = str.split(str.contains("cloudtest") ? "#//" : Constants.H5PRO_PAGE_PREFIX);
        int length = strArrSplit.length;
        if (length > 1) {
            String str3 = strArrSplit[length - 1];
            str3.hashCode();
            switch (str3) {
                case "vipPrivilege":
                    b2 = 0;
                    break;
                case "exclusiveGuard":
                    b2 = 1;
                    break;
                case "exchangeVouchers":
                    b2 = 2;
                    break;
                case "vipActivate":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                irz.b(this.f25696b, 0, 3);
                finish();
                return;
            }
            if (b2 == 1) {
                irz.b(this.f25696b, 0, 2);
                finish();
                return;
            }
            if (b2 == 2) {
                str2 = "MembersExchange";
            } else if (b2 == 3) {
                irz.b(this.f25696b, 0, 1);
                finish();
                return;
            } else {
                LogUtil.j("QrCodeScanningActivity", "jumpVipH5Page suffix is not exist");
                str2 = "";
            }
            p(str2);
            return;
        }
        q(str);
    }

    private void p(String str) {
        if (Utils.m()) {
            qpx.e(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(com.huawei.ui.homehealth.R.string.wallet_unenable_country));
            finish();
            return;
        }
        if (TextUtils.isEmpty(str)) {
            qpx.e(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(com.huawei.ui.homehealth.R.string.ie_invalid_qrcode));
            finish();
            return;
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath(Constants.H5PRO_PAGE_PREFIX + str + "?from=0");
        ddv.b().loadH5ProApp(this.f25696b, "com.huawei.health.h5.vip", builder);
        finish();
    }

    private void q(String str) {
        if (Utils.o()) {
            qpx.e(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(com.huawei.ui.homehealth.R.string.IDS_health_ecg_qr_tip));
            finish();
            return;
        }
        H5proUtil.initH5pro();
        H5ProClient.startH5LightApp(this.f25696b, str + "?jumpFrom=1", (H5ProLaunchOption) null);
        finish();
    }

    private void r(String str) {
        if (Utils.o()) {
            if (!CommonUtil.ab(BaseApplication.getContext())) {
                qpx.e(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(com.huawei.ui.commonui.R.string.IDS_network_connect_error));
            } else {
                qpx.e(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(com.huawei.ui.commonui.R.string.IDS_device_wifi_my_qrcode_error_qrcode));
            }
            finish();
            return;
        }
        sty.e(this.j, MessageConstant.GROUP_MEDAL_TYPE, "");
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/?joinGroupQr=" + str);
        ddv.b().loadH5ProApp(this.f25696b, "com.huawei.health.h5.groups", builder);
        finish();
    }

    private void i() {
        LogUtil.a("R_QrCode_QrCodeScanningActivity", "startQrCode");
        gsm.a(this, 4);
    }

    private void o(String str) {
        sty.e().e(this, str, this.j);
    }

    private void k(final String str) {
        if (str == null) {
            return;
        }
        lsy.a(new Runnable() { // from class: ssg
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(str);
            }
        });
    }

    public /* synthetic */ void d(String str) {
        try {
            if (g(str)) {
                Uri uri = Uri.parse(str);
                if (uri.isOpaque()) {
                    LogUtil.j("QrCodeScanningActivity", "This isn't a hierarchical URI.");
                    d();
                    return;
                }
                String query = uri.getQuery();
                if (TextUtils.isEmpty(query)) {
                    LogUtil.j("R_QrCode_QrCodeScanningActivity", "handleDecode null query");
                    d();
                    return;
                }
                String queryParameter = uri.getQueryParameter("a");
                if (TextUtils.isEmpty(queryParameter)) {
                    ReleaseLogUtil.e("R_QrCode_QrCodeScanningActivity", "inValidAction");
                    d();
                    return;
                }
                if (!"deeplink".equals(queryParameter) && !CmcdConfiguration.KEY_DEADLINE.equals(queryParameter)) {
                    String strSubstring = query.substring(query.indexOf(queryParameter) + queryParameter.length());
                    LogUtil.a("QrCodeScanningActivity", "action:", queryParameter, ", qrResult:", strSubstring);
                    d(queryParameter, strSubstring);
                    return;
                }
                LogUtil.a("R_QrCode_QrCodeScanningActivity", "handleDecode appRouter");
                sub.a(this.f25696b, uri, query);
            }
        } catch (NumberFormatException e) {
            e = e;
            LogUtil.e("R_QrCode_QrCodeScanningActivity", e.getClass().getSimpleName());
            d();
        } catch (PatternSyntaxException e2) {
            e = e2;
            LogUtil.e("R_QrCode_QrCodeScanningActivity", e.getClass().getSimpleName());
            d();
        } catch (IllegalArgumentException unused) {
            LogUtil.e("R_QrCode_QrCodeScanningActivity", "IllegalArgumentException");
            d();
        }
    }

    private boolean g(String str) {
        if (!str.toUpperCase(Locale.ENGLISH).startsWith("http".toUpperCase(Locale.ENGLISH))) {
            LogUtil.e("QrCodeScanningActivity", "url not start with http");
            if (!n(str)) {
                l(str);
            }
            return false;
        }
        if (!Utils.o() && ssy.e(str)) {
            LogUtil.a("QrCodeScanningActivity", "old device qr.");
            ssy.c(this);
            return false;
        }
        if (sub.j(str)) {
            return true;
        }
        if (sub.b(str)) {
            m(str);
            return false;
        }
        if (sub.f(str)) {
            return true;
        }
        LogUtil.a("R_QrCode_QrCodeScanningActivity", "other url qrcode");
        s(str);
        return false;
    }

    private void l(String str) {
        Uri uri = Uri.parse(str);
        if (uri.isOpaque()) {
            LogUtil.j("QrCodeScanningActivity", "This isn't a hierarchical URI.");
            d();
            return;
        }
        String host = uri.getHost();
        if (TextUtils.isEmpty(host) || !host.equals("healthapp")) {
            d();
            return;
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equals("huaweischeme")) {
            d();
            return;
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path) || (!path.equals("/router/device/accountVerify") && !path.equals("/devicemgr"))) {
            d();
            return;
        }
        if (path.equals("/router/device/accountVerify")) {
            this.f25697c = uri.getQueryParameter("btn");
            DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "QrCodeScanningActivity");
            if (deviceInfo == null) {
                qpx.e(this, com.huawei.ui.homehealth.R.string.verrify_account_no_device);
                finish();
                return;
            } else if (!TextUtils.equals(this.f25697c, deviceInfo.getDeviceName())) {
                qpx.e(this, com.huawei.ui.homehealth.R.string.verrify_account_no_device);
                finish();
                return;
            } else {
                this.i = uri.getQueryParameter("trace");
                mgh.a(this);
                return;
            }
        }
        if (path.equals("/devicemgr")) {
            a(CommonUtils.j(uri.getQueryParameter("deviceMgrType")), uri);
        } else {
            LogUtil.a("R_QrCode_QrCodeScanningActivity", "is other path");
        }
    }

    private void a(int i, Uri uri) {
        LogUtil.a("QrCodeScanningActivity", "handleDeviceMgrType deviceMgrType: ", Integer.valueOf(i));
        if (i == 70) {
            teg.c(this, uri.getQueryParameter("subMac"), this.j);
            finish();
        }
    }

    private boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("QrCodeScanningActivity", "content is empty");
            return false;
        }
        if (str.length() == 11) {
            return true;
        }
        LogUtil.j("QrCodeScanningActivity", "sn code does not match the length");
        return false;
    }

    private boolean i(String str) {
        String[] strArrSplit = str.split("_");
        if (str.startsWith(u3.m) && strArrSplit.length == 3 && strArrSplit[1].length() == 4) {
            return true;
        }
        if (str.startsWith("RG01")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String string = sb.reverse().toString();
            if (string.length() >= 10) {
                return "5B60".equals(string.substring(10, 14));
            }
            return false;
        }
        if (str.startsWith("VivaChek-VGM60-") || str.startsWith("VivaChek-VGM6801-")) {
            return true;
        }
        LogUtil.a("QrCodeScanningActivity", "is other third device");
        return false;
    }

    private void c(final String str) {
        if (new wzw().e(402)) {
            f(str);
            return;
        }
        LogUtil.a("QrCodeScanningActivity", "showHealthKit enter");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() { // from class: com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity.1
            @Override // androidx.activity.result.ActivityResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onActivityResult(ActivityResult activityResult) {
                LogUtil.a("QrCodeScanningActivity", "result:", Integer.valueOf(activityResult.getResultCode()));
                QrCodeScanningActivity.this.f(str);
            }
        });
        Intent intent = new Intent(this, (Class<?>) HealthKitActivity.class);
        intent.putExtra("key_health_kit_authorization_to_thread_device", true);
        activityResultLauncherRegisterForActivityResult.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str) {
        String str2;
        String str3;
        LogUtil.a("QrCodeScanningActivity", "downloadDeviceResource");
        if (str.startsWith("RG01")) {
            str2 = "O0DH";
            str3 = str;
        } else if (str.startsWith("VivaChek-VGM60-")) {
            String[] strArrSplit = str.split(com.huawei.openalliance.ad.constant.Constants.LINK);
            str3 = strArrSplit[strArrSplit.length - 1];
            str2 = "O0DE";
        } else if (str.startsWith("VivaChek-VGM6801-")) {
            String[] strArrSplit2 = str.split(com.huawei.openalliance.ad.constant.Constants.LINK);
            str3 = strArrSplit2[strArrSplit2.length - 1];
            str2 = "O0DG";
        } else {
            String[] strArrSplit3 = str.split("_");
            str2 = strArrSplit3[1];
            str3 = strArrSplit3[strArrSplit3.length - 1];
        }
        LogUtil.a("QrCodeScanningActivity", "downloadDeviceResource : serialNumber is ", CommonUtil.n(str3));
        new eqm(this, str, str3, str2).a("HDK_BLOOD_PRESSURE");
    }

    private boolean j(String str) {
        LogUtil.a("QrCodeScanningActivity", "checkMACCode starting and content = ", CommonUtil.n(str));
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("QrCodeScanningActivity", "checkMACCode content is empty and return false");
            return false;
        }
        String strE = etn.e("ble", str);
        return !TextUtils.isEmpty(strE) && strE.matches("^([A-Fa-f0-9]{2}[-,:]){5}[A-Fa-f0-9]{2}$") && "54".equals(etn.e(FitRunPlayAudio.PLAY_TYPE_T, str));
    }

    private void x(String str) {
        LogUtil.j("QrCodeScanningActivity", "startBindWaitingFragmentByNfc");
        String strE = etn.e("ble", str);
        LogUtil.a("QrCodeScanningActivity", "startBindGuideFragmentByNfc getParameter: mac is ", CommonUtil.n(strE));
        boolean zG = dmp.d().g(strE);
        boolean zC = dti.d(this, "M00F", strE).c();
        LogUtil.a("QrCodeScanningActivity", "startDeviceMainActByNfc hagrid scale isBondedDevice,", Boolean.valueOf(zG), ",isDeviceConnect,", Boolean.valueOf(zC));
        if (zG && zC) {
            finish();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("BLE_FROM_QRCODE", etn.e("ble", str));
        intent.putExtra("DEVICE_TYPE_INDEX", etn.e(FitRunPlayAudio.PLAY_TYPE_T, str));
        intent.putExtra("PID_FROM_QRCODE", etn.e(u3.m, str));
        intent.putExtra("isBondedDevice", zG);
        intent.putExtra("KEY_TO_GET_START_FROM_QRCODE", true);
        intent.putExtra("isNfcConnect", true);
        LogUtil.a("QrCodeScanningActivity", "startBindWaitingFragmentByNfc put isNfcConnect is true");
        intent.setClass(this, DeviceMainActivity.class);
        this.f25696b.startActivity(intent);
        finish();
    }

    private void s(String str) {
        if (sub.i(str)) {
            LogUtil.a("R_QrCode_QrCodeScanningActivity", "jumpToBrowser：start webview");
            sty.e(this.j, "guide", "");
            y(str);
            ((QrCodeScanningActivity) this.f25696b).finish();
            return;
        }
        if (sub.e(str)) {
            LogUtil.a("R_QrCode_QrCodeScanningActivity", "jumpToAccountBrowser：start webview");
            y(str);
            ((QrCodeScanningActivity) this.f25696b).finish();
        } else {
            if (n(str)) {
                return;
            }
            if (sub.d(str)) {
                iov.d(this.f25696b, new Intent(this, (Class<?>) OneKeyScanActivity.class));
                finish();
                return;
            }
            e(str);
        }
    }

    private boolean n(String str) {
        if (!c()) {
            LogUtil.a("QrCodeScanningActivity", "isJumpIntentFromPlatform, not support codevalueplatform");
            return false;
        }
        CountDownLatch countDownLatch = this.f25695a;
        if (countDownLatch != null) {
            try {
                if (!countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)) {
                    LogUtil.j("QrCodeScanningActivity", "isJumpIntentFromPlatform codeValueRules update timeout");
                }
            } catch (InterruptedException unused) {
                LogUtil.e("QrCodeScanningActivity", "isJumpIntentFromPlatform InterruptedException");
            }
        }
        CodeValueUtil.d dVarB = CodeValueUtil.b();
        if (dVarB == null || dVarB.d() <= 0) {
            ReleaseLogUtil.d("R_QrCode_QrCodeScanningActivity", "isJumpIntentFromPlatform get rules failed");
        } else {
            LogUtil.a("QrCodeScanningActivity", "isJumpIntentFromPlatform codeValueRules size is ", Integer.valueOf(dVarB.d()));
        }
        Intent intentA = CodeValueUtil.a(str, dVarB);
        if (intentA != null) {
            try {
                startActivityForResult(intentA, 0);
                ReleaseLogUtil.d("R_QrCode_QrCodeScanningActivity", "isJumpIntentFromPlatform jump intent success");
                return true;
            } catch (ActivityNotFoundException unused2) {
                LogUtil.e("QrCodeScanningActivity", "isJumpIntentFromPlatform activity not found");
                return false;
            }
        }
        LogUtil.j("QrCodeScanningActivity", "isJumpIntentFromPlatform,jumpIntent is null");
        return false;
    }

    private boolean c() {
        if (!Utils.o() && CommonUtil.bg()) {
            return true;
        }
        LogUtil.a("QrCodeScanningActivity", "isOversea:", Boolean.valueOf(Utils.o()), " isHuaweiSystem:", Boolean.valueOf(CommonUtil.bg()), " lower than Android7:", false);
        return false;
    }

    private void e(final String str) {
        LogUtil.a("R_QrCode_QrCodeScanningActivity", "checkBrows");
        if (sub.c(str)) {
            sty.e(this.j, "downloadApp", "");
        }
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity.2
            @Override // java.lang.Runnable
            public void run() {
                Intent intent = new Intent(com.huawei.hms.support.api.entity.common.CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str).normalizeScheme());
                if (intent.resolveActivity(QrCodeScanningActivity.this.getPackageManager()) != null) {
                    QrCodeScanningActivity.this.a(intent, str);
                } else {
                    QrCodeScanningActivity.this.d();
                }
            }
        });
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("QrCodeScanningActivity", "Content is empty");
            return false;
        }
        if (str.split("\\?")[0].matches("^https://id[0-9]*\\.cloud\\.huawei\\.com/qrcode/login\\.jsp$")) {
            return true;
        }
        LogUtil.j("QrCodeScanningActivity", "Large Screen QrCode is not matching");
        return false;
    }

    private void a(Context context, String str) {
        boolean z = CommonUtil.z(context);
        int hwidVersionCode = com.huawei.common.util.Utils.getHwidVersionCode(context);
        LogUtil.a("QrCodeScanningActivity", "Current HMS Core Version = ", Integer.valueOf(hwidVersionCode));
        if (!z && hwidVersionCode < 60300300) {
            LogUtil.a("QrCodeScanningActivity", "HMS Core Version is lower than 6.3.0.300");
            a();
            return;
        }
        if (!z) {
            Intent intent = new Intent(com.huawei.hms.support.api.entity.common.CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("hwid://com.huawei.hwid/QrCodeProcess"));
            intent.setPackage(HMSPackageManager.getInstance(context).getHMSPackageName());
            intent.putExtra(HwWatchFaceManager.CLIENT_ID, String.valueOf(BuildConfig.HMS_APPLICATION_ID));
            intent.putExtra("QR_CODE", str);
            startActivityForResult(intent, 5);
        } else {
            Uri uri = Uri.parse(str);
            String queryParameter = uri.getQueryParameter("qRCode");
            int iJ = CommonUtils.j(uri.getQueryParameter("qrSiteID"));
            LogUtil.a("QrCodeScanningActivity", "qrCode = ", queryParameter, " qrSiteID = ", Integer.valueOf(iJ));
            d(queryParameter, iJ);
        }
        LogUtil.a("QrCodeScanningActivity", "Login in Large Screen finished");
    }

    private void d(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("QrCodeScanningActivity", "The qrCode is empty.");
        } else {
            ThirdPartyLoginManager.getInstance().qrCodeAuthLogin(BaseApplication.getActivity(), str, i, "0", new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    if (i2 == 0) {
                        LogUtil.a("QrCodeScanningActivity", "QrAuthLoginResult isSuccess()");
                        sty.e(QrCodeScanningActivity.this.j, CommonConstant.AckQrLoginVerifyValue.VERIFY_RESULT_OK, "");
                    } else {
                        LogUtil.j("QrCodeScanningActivity", "QrAuthLoginResult fail:", Integer.valueOf(i2));
                    }
                    QrCodeScanningActivity.this.finish();
                }
            });
        }
    }

    private void a() {
        LogUtil.a("QrCodeScanningActivity", "showHmsUpdateDialog dialog in main thread");
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f25696b).a(com.huawei.ui.commonui.R.string.IDS_hw_wechat_rank_show_common_title).b(com.huawei.ui.commonui.R.string.IDS_hwh_home_health_login_update_hwid).a(com.huawei.ui.homehealth.R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: ssk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48634b.d(view);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void d(View view) {
        finish();
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("QrCodeScanningActivity", "Large Screen Vip QrCode is empty");
            return false;
        }
        String str2 = str.split("\\?")[0];
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("QrCodeScanningActivity", "Large Screen Vip QrCode Prefix is empty");
            return false;
        }
        Uri uri = Uri.parse(str);
        if (uri.isOpaque()) {
            LogUtil.j("QrCodeScanningActivity", "This isn't a hierarchical URI.");
            return false;
        }
        String queryParameter = uri.getQueryParameter("a");
        String queryParameter2 = uri.getQueryParameter(BleConstants.KEY_PATH);
        LogUtil.a("QrCodeScanningActivity", uri.getQueryParameterNames(), " paraOfAction = ", queryParameter, " paraOfPath = ", queryParameter2);
        return str2.matches("^https://url\\.cloud\\.huawei\\.com/1Lfn1eswP6$") && CmcdConfiguration.KEY_DEADLINE.equals(queryParameter) && "abc/xyz".equals(queryParameter2);
    }

    private void t(String str) {
        LogUtil.a("QrCodeScanningActivity", "parseQrCodeResult LargeScreenVipQrCode is match");
        if (Utils.o()) {
            LogUtil.a("QrCodeScanningActivity", "account is oversea, not support");
            qpx.e(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(com.huawei.ui.homehealth.R.string.wallet_unenable_country));
            finish();
            return;
        }
        sty.e(this.j, "vip", "");
        Uri uri = Uri.parse(str);
        if (!a(uri)) {
            LogUtil.j("QrCodeScanningActivity", "large screen qrCode is inValid: ", str);
            qpx.e(BaseApplication.getContext(), com.huawei.ui.homehealth.R.string.IDS_device_wifi_my_qrcode_error_qrcode);
            finish();
        } else {
            String queryParameter = uri.getQueryParameter(JsbMapKeyNames.H5_USER_ID);
            String queryParameter2 = uri.getQueryParameter(HwPayConstant.KEY_USER_NAME);
            String queryParameter3 = uri.getQueryParameter("productId");
            if (b(queryParameter, queryParameter2)) {
                v(queryParameter3);
            }
            finish();
        }
    }

    private boolean a(Uri uri) {
        return (TextUtils.isEmpty(uri.getQueryParameter(JsbMapKeyNames.H5_USER_ID)) || TextUtils.isEmpty(uri.getQueryParameter(HwPayConstant.KEY_USER_NAME)) || TextUtils.isEmpty(uri.getQueryParameter("productId"))) ? false : true;
    }

    private boolean b(String str, String str2) {
        String accountInfo = LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).getAccountInfo(1011);
        if (!Sha256.d(accountInfo, "SHA-256").equalsIgnoreCase(str)) {
            LogUtil.j("QrCodeScanningActivity", "app huid is not match with large screen");
            qpx.e(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(com.huawei.ui.homehealth.R.string.IDS_vip_account_not_match_tip, str2));
            sty.e(this.j, "vip_failed", "");
            return false;
        }
        LogUtil.a("QrCodeScanningActivity", "app huid is matching with large screen: ", accountInfo);
        return true;
    }

    private void v(final String str) {
        final PayApi payApi = (PayApi) Services.b("TradeService", PayApi.class);
        payApi.getProductDetails(str, new IBaseResponseCallback() { // from class: ssf
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f48584c.e(str, payApi, i, obj);
            }
        });
    }

    public /* synthetic */ void e(String str, PayApi payApi, int i, Object obj) {
        if (i != 0) {
            LogUtil.e("QrCodeScanningActivity", "getProductDetails failed, cause errorCode is: ", Integer.valueOf(i), ", productId = ", str);
            qpx.e(BaseApplication.getContext(), com.huawei.ui.commonui.R.string.IDS_system_error);
        } else if (!(obj instanceof Product)) {
            LogUtil.e("QrCodeScanningActivity", "getProductDetails failed, cause objData is: ", obj, ", productId = ", str);
            qpx.e(BaseApplication.getContext(), com.huawei.ui.commonui.R.string.IDS_system_error);
        } else {
            Product product = (Product) obj;
            LogUtil.a("QrCodeScanningActivity", "getProductSummaryInfo success: ", product.toString());
            d(str, payApi, product);
        }
    }

    private void d(String str, final PayApi payApi, Product product) {
        final ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId(str);
        productInfo.setPurchasePolicy(product.getPurchasePolicy());
        productInfo.setProductName(product.getProductName());
        productInfo.setClientVersion(fod.e(this.f25696b));
        productInfo.setTrigResType("1000");
        productInfo.setTrigResName("会员开通");
        productInfo.setTrigResMemberPrice("0");
        if (product.getSubscriptionPromotion() != null && product.getSubscriptionPromotion().getPromotionId() != null) {
            final String promotionId = product.getSubscriptionPromotion().getPromotionId();
            payApi.promotionInfoQuery(str, promotionId, product.getSubscriptionPromotion().getPromotionPolicyId(), new IBaseResponseCallback() { // from class: ssi
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.d.d(productInfo, promotionId, payApi, i, obj);
                }
            });
        } else {
            payApi.buyByProductId(this, 10000, qqt.b(productInfo));
        }
    }

    public /* synthetic */ void d(ProductInfo productInfo, String str, PayApi payApi, int i, Object obj) {
        if ((obj instanceof Integer) && ((Integer) obj).intValue() == 0) {
            productInfo.setPromotionId(str);
        }
        payApi.buyByProductId(this, 10000, qqt.b(productInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Intent intent, String str) {
        String string;
        if (sub.a(str)) {
            string = qre.f(com.huawei.ui.homehealth.R.string.IDS_other_device_code_tip);
        } else {
            string = this.f25696b.getString(com.huawei.ui.homehealth.R.string.IDS_home_scan_jump_browser_tip, this.f25696b.getResources().getString(com.huawei.ui.homehealth.R.string.IDS_home_scan_jump_third_app));
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f25696b);
        builder.a(string).a(this.f25696b.getString(com.huawei.ui.homehealth.R.string.IDS_hw_common_ui_dialog_confirm), new View.OnClickListener() { // from class: com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("QrCodeScanningActivity", "start browser");
                try {
                    QrCodeScanningActivity.this.startActivity(intent);
                    if (QrCodeScanningActivity.this.f25696b instanceof QrCodeScanningActivity) {
                        ((QrCodeScanningActivity) QrCodeScanningActivity.this.f25696b).finish();
                    }
                } catch (ActivityNotFoundException unused) {
                    LogUtil.e("QrCodeScanningActivity", "ActivityNotFoundException");
                    QrCodeScanningActivity.this.d();
                }
            }
        }).d(this.f25696b.getString(com.huawei.ui.homehealth.R.string.IDS_hw_health_show_common_dialog_cancle_button), new View.OnClickListener() { // from class: com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (QrCodeScanningActivity.this.f25696b instanceof QrCodeScanningActivity) {
                    ((QrCodeScanningActivity) QrCodeScanningActivity.this.f25696b).finish();
                }
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void y(String str) {
        Intent intent = new Intent(this.f25696b, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", str);
        this.f25696b.startActivity(intent);
    }

    private void d(String str, String str2) {
        sty.e().e(str, str2, this.j, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        sty.e().b(this.j, this);
    }

    public void b() {
        LogUtil.a("QrCodeScanningActivity", "into restartScan.");
        i();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("QrCodeScanningActivity", "onBackPressed");
        super.onBackPressed();
        health.compact.a.util.LogUtil.a("QrCodeScanningActivity", "cancel to select device");
        ObserverManagerUtil.e("DEVICE_ASSOCIATION", 152);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
