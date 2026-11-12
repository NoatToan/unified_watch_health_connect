package com.huawei.sim.multisim.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.npz;
import defpackage.pxk;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class MultiSimAuthActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f23140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthButton f23141b;
    private CustomTitleBar f;
    private HealthTextView h;
    private HealthTextView i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f23142c = null;
    private String e = "";
    private int d = 1;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("MultiSimAuthActivity", "onCreate");
        this.f23142c = this;
        setContentView(R.layout.activity_multi_sim_auth);
        Intent intent = getIntent();
        if (intent != null) {
            this.e = intent.getStringExtra("simImsi");
            this.d = intent.getIntExtra("cardType", 1);
        }
        b();
        e();
    }

    private void b() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.multi_sim_auth_title_bar);
        this.f = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.i = (HealthTextView) findViewById(R.id.multi_sim_auth_notice);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.multi_sim_auth_tip);
        this.h = healthTextView;
        healthTextView.setVisibility(8);
        HealthButton healthButton = (HealthButton) findViewById(R.id.multi_sim_auth_agree);
        this.f23141b = healthButton;
        healthButton.setOnClickListener(this);
        HealthButton healthButton2 = (HealthButton) findViewById(R.id.multi_sim_auth_cancel);
        this.f23140a = healthButton2;
        healthButton2.setOnClickListener(this);
    }

    private void e() {
        LogUtil.a("MultiSimAuthActivity", "setViewData()");
        this.i.setText(String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_plugin_multi_sim_get_device_info), pxk.b(this.f23142c, this.e, this.d), npz.b().f()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.multi_sim_auth_agree) {
            LogUtil.a("MultiSimAuthActivity", "onClick agree button");
            a();
        } else if (view.getId() == R.id.multi_sim_auth_cancel) {
            LogUtil.a("MultiSimAuthActivity", "onClick cancel button");
            d();
        } else {
            LogUtil.j("MultiSimAuthActivity", "onClick other");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("MultiSimAuthActivity", "onClick back button");
        d();
    }

    private void a() {
        npz.b().b(pxk.d(this.e, this.d));
        npz.b().b(true);
        pxk.d(this.f23142c, this.e, pxk.e(this.e, this.d));
        finish();
    }

    private void d() {
        npz.b().b(false);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
