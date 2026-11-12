package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.template.BaseActivity;
import defpackage.qsp;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes19.dex */
public class RqNoNetworkActivity extends BaseActivity {
    private CustomTitleBar d;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.rq_activity_rq_no_network);
        a();
    }

    private void a() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("title_name");
            CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.no_network_titlebar);
            this.d = customTitleBar;
            customTitleBar.setTitleText(stringExtra);
            this.d.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.RqNoNetworkActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    RqNoNetworkActivity.this.finish();
                }
            });
        }
        ((HealthButton) qsp.a(this, R.id.rq_net_setting_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.RqNoNetworkActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view != null) {
                    CommonUtil.t(RqNoNetworkActivity.this);
                    RqNoNetworkActivity.this.finish();
                }
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
