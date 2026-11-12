package com.huawei.ui.homehealth.qrcode.activity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler;
import defpackage.lsy;
import defpackage.qpx;
import defpackage.rdp;
import defpackage.ssj;
import defpackage.sty;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes3.dex */
public class QrCodeSchemeActivity extends BaseActivity {
    private Bundle e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25707b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25706a = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(getIntent());
    }

    private void d(final ssj ssjVar) {
        rdp.e(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.qrcode.activity.QrCodeSchemeActivity.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == -1) {
                    ssjVar.c(QrCodeSchemeActivity.this);
                } else {
                    ssjVar.d(String.valueOf(608));
                    ssjVar.g();
                }
            }
        }, this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LogUtil.a("onNewIntent", new Object[0]);
        a(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 102) {
            QrCodeBaseHandler qrCodeBaseHandlerC = sty.e().c();
            if (!(qrCodeBaseHandlerC instanceof ssj)) {
                LogUtil.j("QrCodeSchemeActivity", "BLUETOOTH_CODE qrCoderHandler not DeviceQrCodeHandler");
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
                LogUtil.a("QrCodeSchemeActivity", "stopScanAndCloseTimer");
                if (isFinishing()) {
                    return;
                }
                finish();
                return;
            }
            ssjVar.h();
        }
        if (i == 1) {
            if (i2 == 2 && intent != null) {
                if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
                    b();
                    return;
                } else {
                    a(intent.getStringExtra("device_id"));
                    return;
                }
            }
            finish();
        }
        a(i, i2, intent);
    }

    protected void a(int i, int i2, Intent intent) {
        if (i == 608) {
            ReleaseLogUtil.d("QrCodeSchemeActivity", "SENSITIVE_PERMISSION_STATUS resultCode", Integer.valueOf(i2));
            QrCodeBaseHandler qrCodeBaseHandlerC = sty.e().c();
            if (!(qrCodeBaseHandlerC instanceof ssj)) {
                LogUtil.j("QrCodeSchemeActivity", "SELECT_DEVICE_REQUEST_CODE qrCoderHandler not DeviceQrCodeHandler");
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
    }

    private void a(Intent intent) {
        if (intent != null) {
            this.e = intent.getExtras();
        }
        boolean z = (intent == null || TextUtils.isEmpty(intent.getStringExtra("schemeQrCode"))) ? false : true;
        boolean z2 = this.e != null;
        if (z || z2) {
            d();
            this.f25707b = z2 ? this.e.getString("schemeQrCode") : intent.getStringExtra("schemeQrCode");
            this.f25706a = true;
            LogUtil.a("QrCodeSchemeActivity", "KEY_NEED_SOURCE_INFO=", Boolean.valueOf(intent.getBooleanExtra("isAddSourceInfo", false)));
            if (z2 && !intent.getBooleanExtra("isAddSourceInfo", false)) {
                this.e.putBoolean("sschemeQrCode", this.f25706a);
            }
            e(this.f25707b);
            return;
        }
        ReleaseLogUtil.e("R_QrCode_QrCodeSchemeActivity", "intent invalid");
        b();
    }

    private void b() {
        Intent intent = new Intent();
        intent.setClassName(this, "com.huawei.health.MainActivity");
        startActivity(intent);
        finish();
    }

    private void a(String str) {
        Intent intent = new Intent();
        intent.setClassName(this, "com.huawei.ui.homewear21.home.WearHomeActivity");
        intent.putExtra("device_id", str);
        startActivity(intent);
        finish();
    }

    protected void d() {
        LogUtil.a("QrCodeSchemeActivity", "initView");
        setContentView(R.layout.activity_qrcode_loading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        if (sty.e(str) && this.e != null) {
            Bundle bundle = new Bundle(this.e);
            bundle.putBoolean("isFromOut", true);
            sty.e().e(str, str2, bundle, this);
            return;
        }
        sty.e().e(str, str2, this.e, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        sty.e().b(this.e, this);
    }

    public static void e() {
        qpx.e(BaseApplication.getContext(), R.string.IDS_device_wifi_my_qrcode_error_qrcode);
    }

    public void c() {
        e(this.f25707b);
    }

    private void e(final String str) {
        LogUtil.a("QrCodeSchemeActivity", "startFromScheme");
        lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.qrcode.activity.QrCodeSchemeActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    LogUtil.d("QrCodeSchemeActivity", "content:", str);
                    String str2 = str.split("\\&")[0];
                    String[] strArrSplit = str2.split("\\=");
                    if (strArrSplit != null && strArrSplit.length >= 2) {
                        String str3 = strArrSplit[1];
                        String strReplace = str.replace(str2, "");
                        LogUtil.d("QrCodeSchemeActivity", "action:", str3, "|qrResultAction:", str2, "|qrResult:", strReplace);
                        QrCodeSchemeActivity.this.a(str3, strReplace);
                        return;
                    }
                    QrCodeSchemeActivity.this.a();
                } catch (NumberFormatException e) {
                    e = e;
                    LogUtil.e("R_QrCode_QrCodeSchemeActivity", e.getClass().getSimpleName());
                    QrCodeSchemeActivity.this.a();
                } catch (PatternSyntaxException e2) {
                    e = e2;
                    LogUtil.e("R_QrCode_QrCodeSchemeActivity", e.getClass().getSimpleName());
                    QrCodeSchemeActivity.this.a();
                } catch (IllegalArgumentException unused) {
                    LogUtil.e("R_QrCode_QrCodeSchemeActivity", "IllegalArgumentException");
                    QrCodeSchemeActivity.this.a();
                }
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("R_QrCode_QrCodeSchemeActivity", "schemeQrCode is empty");
            return false;
        }
        try {
            String[] strArrSplit = str.split("\\&")[0].split("\\=");
            if (strArrSplit.length >= 2) {
                return strArrSplit[1].equals("c");
            }
        } catch (PatternSyntaxException unused) {
            LogUtil.e("R_QrCode_QrCodeSchemeActivity", "PatternSyntaxException");
            e();
        } catch (IllegalArgumentException unused2) {
            LogUtil.e("R_QrCode_QrCodeSchemeActivity", "IllegalArgumentException");
            e();
        }
        return false;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
