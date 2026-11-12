package com.huawei.featureuserprofile.me;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.featureuserprofile.R;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qre;

/* JADX INFO: loaded from: classes6.dex */
public class UserInfoExplainActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f5605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f5606c;
    private int d;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hw_show_userinfo_explain_activity);
        Intent intent = getIntent();
        if (intent != null) {
            this.d = intent.getIntExtra("key_jump_from", 0);
        }
        LogUtil.a("UserInfoExplainActivity", "mJumpFrom:", Integer.valueOf(this.d));
        c();
    }

    private void c() {
        String strF;
        String strF2;
        this.f5606c = (HealthTextView) findViewById(R.id.user_info_explain_title);
        this.f5605b = (HealthTextView) findViewById(R.id.user_info_explain_content);
        if (this.d == 1) {
            strF = qre.f(R.string.IDS_me_profile_urgent_info_title);
            strF2 = qre.f(R.string.IDS_me_profile_urgent_info_third_content);
        } else {
            strF = qre.f(R.string.IDS_me_profile_person_info_title);
            strF2 = qre.f(R.string.IDS_me_profile_person_info_content);
        }
        this.f5606c.setText(strF);
        this.f5605b.setText(strF2);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
