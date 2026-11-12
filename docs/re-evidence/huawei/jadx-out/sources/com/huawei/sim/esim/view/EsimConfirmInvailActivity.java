package com.huawei.sim.esim.view;

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

/* JADX INFO: loaded from: classes15.dex */
public class EsimConfirmInvailActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTitleBar f23014a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f23015c;
    private HealthButton d;
    private int e = 9999;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_confirm_invail);
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("confirm_error", 9999);
        this.e = intExtra;
        LogUtil.a("EsimConfirmInvailActivity", "the mErrorCode: ", Integer.valueOf(intExtra));
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.confirm_invalid_title_bar);
        this.f23014a = customTitleBar;
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimConfirmInvailActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EsimConfirmInvailActivity.this.startActivity(new Intent(EsimConfirmInvailActivity.this, (Class<?>) EsimActivationActivity.class));
                EsimConfirmInvailActivity.this.finish();
            }
        });
        HealthButton healthButton = (HealthButton) findViewById(R.id.confirm_button);
        this.d = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimConfirmInvailActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EsimConfirmInvailActivity.this.startActivity(new Intent(EsimConfirmInvailActivity.this, (Class<?>) EsimActivationActivity.class));
                EsimConfirmInvailActivity.this.finish();
            }
        });
        this.f23015c = (HealthTextView) findViewById(R.id.confirm_invide_info);
        int i = this.e;
        if (i == 1000) {
            this.f23014a.setTitleText(getResources().getString(R.string.IDS_plugin_sim_esim_conform_code_title));
            this.f23015c.setText(R.string.IDS_plugin_esim_conform_start_failed);
        } else if (i == 3) {
            this.f23014a.setTitleText(getResources().getString(R.string.IDS_plugin_sim_conform_invaid_title));
            this.f23015c.setText(R.string.IDS_plugin_sim_conform_invaid_tip_new);
        } else {
            this.f23014a.setTitleText(getResources().getString(R.string.IDS_plugin_sim_esim_conform_code_title));
            this.f23015c.setText(R.string.IDS_plugin_esim_conform_unkown_new_error);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
