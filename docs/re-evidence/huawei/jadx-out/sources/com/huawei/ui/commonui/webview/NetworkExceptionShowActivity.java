package com.huawei.ui.commonui.webview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwnetworkmodel.NetworkStatusListener;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes16.dex */
public class NetworkExceptionShowActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTitleBar f24048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f24049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NetworkStatusListener f24050c;
    private Context d;
    private boolean e = false;
    private ImageView f;
    private HealthTextView g;
    private String h;
    private HealthButton j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(R.anim.activity_no_animation, R.anim.activity_no_animation);
        setContentView(R.layout.network_exception_error);
        this.d = this;
        a();
        d();
        c();
    }

    private void a() {
        this.f24048a = (CustomTitleBar) findViewById(R.id.titlebar_panel);
        this.f = (ImageView) findViewById(R.id.set_network_info_image);
        this.g = (HealthTextView) findViewById(R.id.tv_network_info);
        this.j = (HealthButton) findViewById(R.id.btn_set_network);
    }

    private void d() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("NetworkExceptionShowActivity", "intent is null.");
            return;
        }
        this.h = intent.getStringExtra("extraTitleBarText");
        this.f24049b = intent.getStringExtra("className");
        this.e = intent.getBooleanExtra("server_exception_flag", false);
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            this.e = false;
        }
        if (TextUtils.isEmpty(this.h)) {
            this.h = getString(R.string.IDS_hwh_home_group_network_error);
        }
        this.f24048a.setTitleText(this.h);
        if (this.e) {
            this.g.setText(R.string.IDS_hwh_home_group_server_exception);
            this.j.setVisibility(8);
        }
    }

    private void c() {
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.webview.NetworkExceptionShowActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NetworkExceptionShowActivity networkExceptionShowActivity = NetworkExceptionShowActivity.this;
                networkExceptionShowActivity.e(networkExceptionShowActivity.b());
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.webview.NetworkExceptionShowActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NetworkExceptionShowActivity networkExceptionShowActivity = NetworkExceptionShowActivity.this;
                networkExceptionShowActivity.e(networkExceptionShowActivity.b());
            }
        });
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.webview.NetworkExceptionShowActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent("android.settings.WIRELESS_SETTINGS");
                intent.setClassName(BaseApplication.getAppPackage(), NetworkExceptionShowActivity.this.f24049b);
                NetworkExceptionShowActivity.this.startActivity(intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        if (this.e) {
            return;
        }
        if (z) {
            if (TextUtils.isEmpty(this.f24049b)) {
                LogUtil.j("NetworkExceptionShowActivity", "refreshActivityData mLastClassName is empty.");
                return;
            }
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getAppPackage(), this.f24049b);
            intent.setFlags(603979776);
            startActivity(intent);
            finish();
            overridePendingTransition(R.anim.activity_no_animation, R.anim.activity_no_animation);
            return;
        }
        Toast.makeText(BaseApplication.getContext(), this.d.getResources().getString(R.string.IDS_connect_error), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        return CommonUtil.ab(BaseApplication.getContext());
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        NetworkStatusListener networkStatusListener = this.f24050c;
        if (networkStatusListener != null) {
            networkStatusListener.unregister(BaseApplication.getContext());
            this.f24050c = null;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
