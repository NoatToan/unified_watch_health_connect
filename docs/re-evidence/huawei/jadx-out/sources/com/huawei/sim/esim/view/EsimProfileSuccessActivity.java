package com.huawei.sim.esim.view;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.sim.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.eej;
import defpackage.npz;

/* JADX INFO: loaded from: classes15.dex */
public class EsimProfileSuccessActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23059a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f23060c;
    private HealthButton d;
    private ImageView e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_confirm_success);
        HealthButton healthButton = (HealthButton) findViewById(R.id.confirm_button);
        this.d = healthButton;
        healthButton.setOnClickListener(this);
        if (getIntent() != null) {
            this.f23059a = getIntent().getBooleanExtra("confirm_status", false);
        }
        this.e = (ImageView) findViewById(R.id.confirm_success_image);
        this.f23060c = (HealthTextView) findViewById(R.id.confirm_sucess_tips);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f23059a) {
            this.f23060c.setVisibility(0);
            this.e.setImageResource(R.drawable.sim_verify_success);
        } else {
            this.f23060c.setVisibility(4);
            this.e.setImageResource(R.drawable.sim_open_esim_success);
        }
        npz.b().d(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.confirm_button) {
            startActivity(new Intent(this, (Class<?>) ((eej.c() == null || !eej.c().isSupportNewEsim()) ? WirelessManagerActivity.class : EsimManagerActivity.class)));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
