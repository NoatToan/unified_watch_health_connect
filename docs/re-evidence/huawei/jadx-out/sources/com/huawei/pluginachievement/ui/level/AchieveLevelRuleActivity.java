package com.huawei.pluginachievement.ui.level;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.pluginachievement.R;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.out;
import defpackage.qqz;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveLevelRuleActivity extends BaseActivity implements View.OnClickListener {
    private ImageView e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.achieve_level_rule);
        b();
    }

    private void b() {
        ImageView imageView = (ImageView) out.d(this, R.id.achieve_level_rule_navigation_left_button);
        this.e = imageView;
        imageView.setOnClickListener(this);
        if (LanguageUtil.ba(this)) {
            this.e.setImageDrawable(qqz.e(this, R.mipmap.ic_health_nav_back_black));
        } else {
            this.e.setImageDrawable(getResources().getDrawable(R.mipmap.ic_health_nav_back_black));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (R.id.achieve_level_rule_navigation_left_button == view.getId()) {
            finish();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
