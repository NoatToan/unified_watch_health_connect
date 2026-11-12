package com.huawei.sim.esim.qrcode;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.esim.view.EsimProfileActivity;
import com.huawei.sim.esim.view.EsimProfileAuthenticationFail;
import com.huawei.sim.esim.view.EsimProfileBtFailActivity;
import com.huawei.sim.esim.view.ScanFailActivity;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import defpackage.gsm;
import defpackage.lrx;
import defpackage.lsd;
import defpackage.npz;
import defpackage.pvf;
import defpackage.pxi;
import defpackage.pxk;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.xjt;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class QrCodeActivity extends BaseActivity {
    private Context d;
    private int h;
    private CommonDialog21 f = null;
    private String i = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f22972b = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.qrcode.QrCodeActivity.4
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("QrCodeActivity", "mBaseResponseCallback the errCode:", Integer.valueOf(i));
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBaseResponseCallback f22973c = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.qrcode.QrCodeActivity.3
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("QrCodeActivity", "errCode:", Integer.valueOf(i));
        }
    };
    private Handler e = new Handler();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f22971a = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.qrcode.QrCodeActivity.5
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(final int i, final Object obj) {
            LogUtil.a("QrCodeActivity", "mAuthResponseCallback the error:", Integer.valueOf(i));
            QrCodeActivity.this.e.post(new Runnable() { // from class: com.huawei.sim.esim.qrcode.QrCodeActivity.5.2
                /* JADX WARN: Code duplicated, block: B:17:0x0074  */
                /* JADX WARN: Code duplicated, block: B:20:0x0090  */
                @Override // java.lang.Runnable
                public void run() {
                    boolean z;
                    boolean z2;
                    if (i == 0) {
                        String json = null;
                        try {
                            if (obj instanceof lsd) {
                                json = new Gson().toJson(((lsd) obj).b(), lrx.class);
                                if (((lsd) obj).a() != 1) {
                                    z = true;
                                }
                                Intent intent = new Intent(QrCodeActivity.this, (Class<?>) EsimProfileActivity.class);
                                intent.putExtra("eSim_profile", json);
                                LogUtil.d("QrCodeActivity", "the data:", json);
                                z2 = !new pvf().d(QrCodeActivity.this.i) || z;
                                intent.putExtra("confirm_status", z2);
                                intent.putExtra("esim_new_original_key", QrCodeActivity.this.h);
                                QrCodeActivity.this.startActivity(intent);
                                if (!z2) {
                                    pxi.c("true", "enabled_entry", String.valueOf(i), "", "offline", pxi.j());
                                }
                                QrCodeActivity.this.finish();
                                QrCodeActivity.this.d();
                                return;
                            }
                            json = new Gson().toJson(obj, lrx.class);
                        } catch (JsonIOException unused) {
                            LogUtil.e("QrCodeActivity", "mAuthResponseCallback objData JsonIOException");
                        }
                        z = false;
                        Intent intent2 = new Intent(QrCodeActivity.this, (Class<?>) EsimProfileActivity.class);
                        intent2.putExtra("eSim_profile", json);
                        LogUtil.d("QrCodeActivity", "the data:", json);
                        if (new pvf().d(QrCodeActivity.this.i)) {
                        }
                        intent2.putExtra("confirm_status", z2);
                        intent2.putExtra("esim_new_original_key", QrCodeActivity.this.h);
                        QrCodeActivity.this.startActivity(intent2);
                        if (!z2) {
                            pxi.c("true", "enabled_entry", String.valueOf(i), "", "offline", pxi.j());
                        }
                        QrCodeActivity.this.finish();
                        QrCodeActivity.this.d();
                        return;
                    }
                    Object obj2 = obj;
                    QrCodeActivity.this.b(i, obj2 instanceof Integer ? ((Integer) obj2).intValue() : -1);
                    pxi.c("false", "enabled_entry", String.valueOf(i), "", "offline", pxi.j());
                }
            });
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = this;
        npz.b().b(this.f22973c);
        Intent intent = getIntent();
        if (intent != null) {
            this.h = intent.getIntExtra("esim_new_original_key", 0);
        }
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        c();
    }

    private void c() {
        LogUtil.a("QrCodeActivity", "startScan");
        gsm.a(this, 10);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        npz.b().a(this.f22973c);
        npz.b().h(this.f22971a);
        d();
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    public boolean e() {
        if (new pvf().a(this.i)) {
            LogUtil.e("QrCodeActivity", "qrCode is invalid");
            xjt.q("qrCode is invalid");
            Intent intent = new Intent(this, (Class<?>) ScanFailActivity.class);
            intent.putExtra("esim_new_original_key", this.h);
            startActivity(intent);
            finish();
            return false;
        }
        if (npz.b().c() == 2) {
            LogUtil.a("QrCodeActivity", "bluetooth connected");
            pxk.e("", false);
            c(com.huawei.sim.R.string.IDS_plugin_sim_loading_profile);
            npz.b().e(this.i, this.f22972b, this.f22971a);
            return true;
        }
        Intent intent2 = new Intent(this, (Class<?>) EsimProfileBtFailActivity.class);
        intent2.putExtra("esim_new_original_key", this.h);
        startActivity(intent2);
        finish();
        return true;
    }

    private void c(int i) {
        LogUtil.a("QrCodeActivity", "showLoadingDialog()");
        if (isFinishing()) {
            return;
        }
        CommonDialog21 commonDialog21 = this.f;
        if (commonDialog21 == null) {
            new CommonDialog21(this, com.huawei.sim.R.style.common_dialog21);
            CommonDialog21 commonDialog21B = CommonDialog21.b(this);
            this.f = commonDialog21B;
            commonDialog21B.b(getResources().getString(i));
            this.f.setCancelable(false);
            this.f.c();
            LogUtil.a("QrCodeActivity", "mLoadingUserInformationDialog.show()");
            return;
        }
        commonDialog21.b(getResources().getString(i));
        this.f.c();
        LogUtil.a("QrCodeActivity", "mLoadingUserInformationDialog.show()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (isFinishing()) {
            return;
        }
        LogUtil.a("QrCodeActivity", "enter dismissLoadingDialog()");
        CommonDialog21 commonDialog21 = this.f;
        if (commonDialog21 == null || !commonDialog21.isShowing()) {
            return;
        }
        LogUtil.a("QrCodeActivity", "dismissLoadingDialog()");
        this.f.cancel();
        this.f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2) {
        CommonDialog21 commonDialog21 = this.f;
        if (commonDialog21 == null || !commonDialog21.isShowing()) {
            return;
        }
        if (i2 == -2) {
            Intent intent = new Intent(this, (Class<?>) EsimProfileBtFailActivity.class);
            intent.putExtra("confirm_status", new pvf().d(this.i));
            intent.putExtra("esim_new_original_key", this.h);
            startActivity(intent);
            finish();
            d();
            return;
        }
        a(i);
    }

    private void a(int i) {
        Intent intent = new Intent(this, (Class<?>) EsimProfileAuthenticationFail.class);
        intent.putExtra("mata_report", i);
        intent.putExtra("esim_new_original_key", this.h);
        startActivity(intent);
        finish();
        d();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("QrCodeActivity", "onActivityResult requestCode:", Integer.valueOf(i), ",resultCode:", Integer.valueOf(i2));
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            LogUtil.a("QrCodeActivity", "resultCode is zero, finish activity");
            finish();
            return;
        }
        if (i2 == -1 && i == 10) {
            int iC = gsm.c(intent);
            if (iC == 0) {
                b(intent);
            } else if (iC == 2) {
                qrs.e((Activity) this, 10);
            } else {
                finish();
            }
        }
    }

    private void b(Intent intent) {
        String strF = pxk.f();
        String strB = gsm.b(intent);
        this.i = strB;
        if (TextUtils.isEmpty(strB)) {
            LogUtil.j("QrCodeActivity", "invalid image");
            xjt.q("invalid image");
            qpx.b(this.d, com.huawei.sim.R.string.IDS_plugin_sim_scan_qrcode_picture_toast);
            finish();
            return;
        }
        if (this.i.contains("1$esim.yhdzd.chinamobile.com") || this.i.contains("1$esim.yhdzd.chinamobile.com".toUpperCase(Locale.ENGLISH)) || this.i.contains(strF)) {
            LogUtil.j("QrCodeActivity", "invalid download address.");
            xjt.q("invalid download address.");
            qpx.b(this.d, this.d.getResources().getString(com.huawei.sim.R.string.IDS_update_download_failed));
            finish();
            return;
        }
        e();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
