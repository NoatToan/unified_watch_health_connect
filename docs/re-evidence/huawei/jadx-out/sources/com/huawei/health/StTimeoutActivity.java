package com.huawei.health;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import health.compact.a.CommonLibUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes24.dex */
public class StTimeoutActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f6165b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LocalBroadcastManager f6166c = null;
    private final BroadcastReceiver d = new BroadcastReceiver() { // from class: com.huawei.health.StTimeoutActivity.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("Login_StTimeoutActivity", "onReceive");
            StTimeoutActivity.this.finish();
        }
    };

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        LogUtil.a("Login_StTimeoutActivity", "onCreate()");
        super.onCreate(bundle);
        Window window = getWindow();
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        onWindowAttributesChanged(attributes);
        this.f6165b = this;
        this.f6166c = LocalBroadcastManager.getInstance();
        a();
        c();
        b();
    }

    private void c() {
        LogUtil.a("Login_StTimeoutActivity", "initView()");
        e();
    }

    private void a() {
        LogUtil.a("Login_StTimeoutActivity", "registerWaitDialogBroadcast()");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("hwid_finish");
        LocalBroadcastManager localBroadcastManager = this.f6166c;
        if (localBroadcastManager != null) {
            localBroadcastManager.registerReceiver(this.d, intentFilter);
        }
    }

    private void d() {
        LogUtil.a("Login_StTimeoutActivity", "unregisterWaitDialogBroadcast()");
        try {
            LocalBroadcastManager localBroadcastManager = this.f6166c;
            if (localBroadcastManager != null) {
                localBroadcastManager.unregisterReceiver(this.d);
            }
        } catch (IllegalArgumentException e) {
            LogUtil.e("Login_StTimeoutActivity", e.getMessage());
        } catch (RuntimeException e2) {
            LogUtil.e("Login_StTimeoutActivity", e2.getMessage());
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        LogUtil.a("Login_StTimeoutActivity", "onDestroy()");
        super.onDestroy();
        d();
    }

    private void e() {
        LogUtil.a("Login_StTimeoutActivity", "initConfirmDialog()");
        String upperCase = this.f6165b.getString(R.string.IDS_hw_common_ui_dialog_confirm).toUpperCase(Locale.getDefault());
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.f6165b);
        builder.e(this.f6165b.getString(R.string.IDS_hw_wechat_rank_show_common_title));
        builder.a(this.f6165b.getString(R.string.IDS_main_sns_member_account_has_been_effective));
        builder.b(upperCase, new View.OnClickListener() { // from class: dcp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31609c.c(view);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void c(View view) {
        LogUtil.a("Login_StTimeoutActivity", "Enter sure()");
        LoginInit.getInstance(this.f6165b).cleanLoginData();
        CommonLibUtil.d(this.f6165b);
        finish();
    }

    private void b() {
        LogUtil.a("Login_StTimeoutActivity", "reportErroeCode().");
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_AUTH_FAILED_85070021.value(), intent.getIntExtra("rspErrorCode", 0));
    }

    @Override // android.app.Activity
    protected void onResume() {
        LogUtil.a("Login_StTimeoutActivity", "onResume()");
        super.onResume();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
