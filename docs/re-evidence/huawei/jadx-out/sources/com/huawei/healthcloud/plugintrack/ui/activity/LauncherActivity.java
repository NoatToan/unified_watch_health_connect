package com.huawei.healthcloud.plugintrack.ui.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.ui.commonui.base.BaseActivity;

/* JADX INFO: loaded from: classes10.dex */
public class LauncherActivity extends BaseActivity {
    private Handler e = new Handler();

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        setContentView(R.layout.activity_launcher);
        this.e.post(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.LauncherActivity.4
            @Override // java.lang.Runnable
            public void run() {
                LauncherActivity.this.finish();
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
