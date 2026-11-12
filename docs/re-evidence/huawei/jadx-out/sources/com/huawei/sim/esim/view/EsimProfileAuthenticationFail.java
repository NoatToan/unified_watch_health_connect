package com.huawei.sim.esim.view;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.sim.esim.qrcode.QrCodeActivity;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;

/* JADX INFO: loaded from: classes15.dex */
public class EsimProfileAuthenticationFail extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f23052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f23053c;
    private HealthButton d;
    private HealthButton e;
    private View f;
    private HealthButton h;
    private int i;
    private HealthTextView j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_esim_profile_fail);
        Intent intent = getIntent();
        if (intent != null) {
            this.f23051a = intent.getIntExtra("mata_report", 1);
            this.i = intent.getIntExtra("esim_new_original_key", 0);
        }
        c();
        e();
    }

    private void c() {
        this.f23053c = findViewById(R.id.double_button);
        this.f = findViewById(R.id.single_button);
        HealthButton healthButton = (HealthButton) findViewById(R.id.esim_profile_cancel);
        this.d = healthButton;
        healthButton.setOnClickListener(this);
        HealthButton healthButton2 = (HealthButton) findViewById(R.id.esim_profile_retry);
        this.h = healthButton2;
        healthButton2.setOnClickListener(this);
        HealthButton healthButton3 = (HealthButton) findViewById(R.id.esim_profile_ok);
        this.e = healthButton3;
        healthButton3.setOnClickListener(this);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.profile_auth_fail_title_bar);
        this.f23052b = customTitleBar;
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimProfileAuthenticationFail.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EsimProfileAuthenticationFail.this.a();
            }
        });
        this.j = (HealthTextView) findViewById(R.id.profile_auth_tips);
    }

    private void e() {
        int i = this.f23051a;
        if (i == 1) {
            this.f23053c.setVisibility(8);
            this.f.setVisibility(0);
            this.j.setText(R.string.IDS_plugin_network_unstable);
            return;
        }
        if (i == 8) {
            this.f23053c.setVisibility(8);
            this.f.setVisibility(0);
            this.j.setText(R.string.IDS_plugin_metadata_no_suitable_esim_account);
        } else if (i == 5) {
            this.f23053c.setVisibility(8);
            this.f.setVisibility(0);
            this.j.setText(R.string.IDS_plugin_eid_is_refused_by_server_new);
        } else if (i == 6) {
            this.f23053c.setVisibility(8);
            this.f.setVisibility(0);
            this.j.setText(R.string.IDS_plugin_matching_id_is_resused_by_server_new);
        } else {
            this.f23053c.setVisibility(8);
            this.f.setVisibility(0);
            this.j.setText(R.string.IDS_plugin_esim_unknonw_failed_new);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.esim_profile_cancel) {
            a();
            return;
        }
        if (view.getId() == R.id.esim_profile_retry) {
            b();
        } else if (view.getId() == R.id.esim_profile_ok) {
            a();
        } else {
            LogUtil.j("EsimProfileAuthenticationFail", "onClick other");
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            a();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Intent intent = new Intent();
        if (this.i == 1) {
            intent.setClass(this, EsimManagerActivity.class);
        } else {
            intent.setClass(this, EsimActivationActivity.class);
        }
        startActivity(intent);
        finish();
    }

    private void b() {
        Intent intent = new Intent(this, (Class<?>) QrCodeActivity.class);
        intent.putExtra("esim_new_original_key", this.i);
        startActivity(intent);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
