package com.huawei.ui.main.stories.userprofile.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;

/* JADX INFO: loaded from: classes19.dex */
public class WorkModeConflictDialogActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f29049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthButton f29051c;
    private HealthTextView d;
    private Context e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = this;
        LogUtil.a("WorkModeConflictDialogActivity", "onCreate()");
        setContentView(R.layout.activity_personal_center_dialog);
        Window window = getWindow();
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        onWindowAttributesChanged(attributes);
        c();
        b();
    }

    private void b() {
        LogUtil.a("WorkModeConflictDialogActivity", "initUpdateMode()");
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("content");
            this.f29050b = stringExtra;
            this.d.setText(stringExtra);
        }
    }

    private void c() {
        LogUtil.a("WorkModeConflictDialogActivity", "initView()");
        this.f29049a = (HealthTextView) findViewById(R.id.dialog_title_activity);
        this.d = (HealthTextView) findViewById(R.id.dialog_content_activity);
        this.f29051c = (HealthButton) findViewById(R.id.dialog_show_true_but);
        this.f29049a.setText(this.e.getResources().getString(R.string.IDS_hw_health_show_common_dialog_title));
        this.f29051c.setText(this.e.getResources().getString(R.string.IDS_user_permission_know));
        this.f29051c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.userprofile.activity.WorkModeConflictDialogActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("WorkModeConflictDialogActivity", "onClick");
                WorkModeConflictDialogActivity.this.finish();
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
