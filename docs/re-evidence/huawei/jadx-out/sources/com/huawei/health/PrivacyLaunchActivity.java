package com.huawei.health;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity;

/* JADX INFO: loaded from: classes23.dex */
public class PrivacyLaunchActivity extends BaseActivity {
    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) ServiceItemActivity.class);
        intent.putExtra("Agreement_key", "HealthPrivacy");
        intent.putExtra("Is_show_cancel_key", false);
        intent.addFlags(268435456);
        startActivity(intent);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
