package com.huawei.ui.device.activity.appmarket;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.device.R;
import defpackage.lyy;
import defpackage.xjt;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class HwSmartAppMarketLoadingActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f24241a = new d(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24243c;
    private CustomTextAlertDialog d;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.layout_smart_market_loading);
        this.f24242b = this;
        d();
        e();
    }

    private void d() {
        ((HealthProgressBar) findViewById(R.id.app_market_progressbar)).setLayerType(1, null);
    }

    /* JADX INFO: renamed from: com.huawei.ui.device.activity.appmarket.HwSmartAppMarketLoadingActivity$2, reason: invalid class name */
    public class AnonymousClass2 implements PingCallback {
        AnonymousClass2() {
        }

        @Override // com.huawei.health.deviceconnect.callback.PingCallback
        public void onPingResult(int i) {
            ReleaseLogUtil.d("DEVMGR_HwSmartAppMarketLoadingActivity", "pingDevice resultCode:", Integer.valueOf(i));
            if (!HwSmartAppMarketLoadingActivity.this.f24243c) {
                if (HwSmartAppMarketLoadingActivity.this.f24241a != null) {
                    HwSmartAppMarketLoadingActivity.this.f24241a.removeMessages(1);
                }
                if (HwSmartAppMarketLoadingActivity.this.isFinishing() || HwSmartAppMarketLoadingActivity.this.isDestroyed()) {
                    ReleaseLogUtil.d("DEVMGR_HwSmartAppMarketLoadingActivity", "pingDevice canceled");
                    return;
                }
                if (i == 207 || i == 202) {
                    lyy.b().d(0);
                    HwSmartAppMarketLoadingActivity.this.finish();
                    HwSmartAppMarketLoadingActivity.this.overridePendingTransition(0, 0);
                    return;
                }
                HwSmartAppMarketLoadingActivity.this.runOnUiThread(new Runnable() { // from class: quk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.b();
                    }
                });
                return;
            }
            ReleaseLogUtil.d("DEVMGR_HwSmartAppMarketLoadingActivity", "pingDevice time out");
            xjt.j("pingDevice time out");
        }

        public /* synthetic */ void b() {
            HwSmartAppMarketLoadingActivity.this.a();
        }
    }

    private void e() {
        this.f24243c = false;
        lyy.b().b(new AnonymousClass2());
        d dVar = this.f24241a;
        if (dVar != null) {
            dVar.sendEmptyMessageDelayed(1, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ReleaseLogUtil.d("DEVMGR_HwSmartAppMarketLoadingActivity", "showMarketOverTimeDialog");
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.f24242b);
        builder.a(R.string.IDS_application_market_dialog_title);
        builder.b(R.string.IDS_sms_get_device_failed);
        builder.a(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.appmarket.HwSmartAppMarketLoadingActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("HwSmartAppMarketLoadingActivity", "showMarketOverTimeDialog click button known");
                HwSmartAppMarketLoadingActivity.this.finish();
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        this.d = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (this.d.isShowing()) {
            return;
        }
        this.d.show();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("HwSmartAppMarketLoadingActivity", "onDestroy");
        super.onDestroy();
        this.d = null;
    }

    static class d extends BaseHandler<HwSmartAppMarketLoadingActivity> {
        public d(HwSmartAppMarketLoadingActivity hwSmartAppMarketLoadingActivity) {
            super(hwSmartAppMarketLoadingActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(HwSmartAppMarketLoadingActivity hwSmartAppMarketLoadingActivity, Message message) {
            if (message.what == 1) {
                LogUtil.a("HwSmartAppMarketLoadingActivity", "visit webView timeout");
                hwSmartAppMarketLoadingActivity.f24243c = true;
                hwSmartAppMarketLoadingActivity.a();
                return;
            }
            LogUtil.j("HwSmartAppMarketLoadingActivity", "handleMessageWhenReferenceNotNull default what");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
