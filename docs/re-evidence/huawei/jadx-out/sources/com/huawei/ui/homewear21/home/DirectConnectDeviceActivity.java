package com.huawei.ui.homewear21.home;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.homewear21.R;
import defpackage.qtv;
import defpackage.tpb;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes43.dex */
public class DirectConnectDeviceActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private tpb f26190a = null;
    private c d = null;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_direct_connect_loading);
        LogUtil.a("DirectConnectDeviceActivity", "onCreate handle direct connect device.");
        e();
        tpb tpbVarC = tpb.c();
        this.f26190a = tpbVarC;
        tpbVarC.c(this);
        this.f26190a.f();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("DirectConnectDeviceActivity", "Enter onDestroy.");
        b();
        tpb.c().j();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("DirectConnectDeviceActivity", "onActivityResult requestCode: ", Integer.valueOf(i), ", resultCode: ", Integer.valueOf(i2));
        if (i == 1 && i2 == 2 && intent != null) {
            qtv.e(intent, this, qtv.c(i2, true, intent.getIntExtra("product_type", -1), true));
        } else {
            finish();
        }
    }

    static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<DirectConnectDeviceActivity> f26192a;

        c(DirectConnectDeviceActivity directConnectDeviceActivity) {
            this.f26192a = new WeakReference<>(directConnectDeviceActivity);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("DirectConnectDeviceActivity", "onReceive intent is null.");
                return;
            }
            DirectConnectDeviceActivity directConnectDeviceActivity = this.f26192a.get();
            if (directConnectDeviceActivity != null) {
                if (directConnectDeviceActivity.f26190a == null) {
                    LogUtil.j("DirectConnectDeviceActivity", "onReceive mDeviceManager is null.");
                    return;
                }
                if ("com.huawei.health.action.DOWNLOAD_SINGLE_DEVICE_PROCESS".equals(intent.getAction())) {
                    directConnectDeviceActivity.f26190a.a(intent.getIntExtra("progress", -1));
                    return;
                } else {
                    if ("com.huawei.health.action.ACTION_BACKGROUND_DOWNLOAD_DEVICE".equals(intent.getAction())) {
                        directConnectDeviceActivity.f26190a.a();
                        if (!directConnectDeviceActivity.f26190a.h()) {
                            directConnectDeviceActivity.c();
                            return;
                        } else {
                            directConnectDeviceActivity.f26190a.i();
                            return;
                        }
                    }
                    LogUtil.j("DirectConnectDeviceActivity", "onReceive intent: ", intent.getAction());
                    return;
                }
            }
            LogUtil.j("DirectConnectDeviceActivity", "onReceive activity is null.");
        }
    }

    private void e() {
        LogUtil.a("DirectConnectDeviceActivity", "Enter registerProcessBroadcast.");
        this.d = new c(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.action.DOWNLOAD_SINGLE_DEVICE_PROCESS");
        intentFilter.addAction("com.huawei.health.action.ACTION_BACKGROUND_DOWNLOAD_DEVICE");
        LocalBroadcastManager.getInstance().registerReceiver(this.d, intentFilter);
    }

    public void b() {
        LogUtil.a("DirectConnectDeviceActivity", "Enter unregisterProcessBroadcast");
        if (this.d == null) {
            LogUtil.j("DirectConnectDeviceActivity", "unregisterProcessBroadcast mProcessBroadcastReceiver is null.");
            return;
        }
        try {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.d);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("DirectConnectDeviceActivity", "unregisterProcessBroadcast IllegalArgumentException.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("DirectConnectDeviceActivity", "Enter showNoSupportDevicePairDialog.");
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this);
        builder.e(getResources().getString(R.string.IDS_qrcode_no_support_device_title));
        builder.a(getResources().getString(R.string.IDS_device_mgr_no_support_device_tips));
        builder.b(getResources().getString(R.string.IDS_common_notification_know_tips), new View.OnClickListener() { // from class: com.huawei.ui.homewear21.home.DirectConnectDeviceActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DirectConnectDeviceActivity.this.finish();
            }
        });
        if (isFinishing()) {
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
