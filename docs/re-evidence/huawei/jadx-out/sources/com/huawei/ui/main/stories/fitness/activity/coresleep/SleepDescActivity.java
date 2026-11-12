package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.ddv;
import defpackage.fua;
import defpackage.qrs;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes19.dex */
public class SleepDescActivity extends BaseActivity {
    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sleep_desc);
        d();
    }

    private void d() {
        View viewFindViewById = findViewById(R.id.sleep_record_wear_layout);
        HealthDivider healthDivider = (HealthDivider) findViewById(R.id.divider);
        View viewFindViewById2 = findViewById(R.id.sleep_record_phone_layout);
        if (!fua.c(BaseApplication.getContext())) {
            healthDivider.setVisibility(8);
            viewFindViewById2.setVisibility(8);
        }
        HealthDivider healthDivider2 = (HealthDivider) findViewById(R.id.divider_manual);
        View viewFindViewById3 = findViewById(R.id.sleep_manual_layout);
        if (!fua.c()) {
            healthDivider2.setVisibility(8);
            viewFindViewById3.setVisibility(8);
        }
        ImageView imageView = (ImageView) findViewById(R.id.sleep_record_wear_arrow);
        ImageView imageView2 = (ImageView) findViewById(R.id.sleep_record_phone_arrow);
        ImageView imageView3 = (ImageView) findViewById(R.id.sleep_manual_arrow);
        if (LanguageUtil.ba(this)) {
            imageView.setImageResource(R.drawable.common_ui_arrow_left);
            imageView2.setImageResource(R.drawable.common_ui_arrow_left);
            imageView3.setImageResource(R.drawable.common_ui_arrow_left);
        } else {
            imageView.setImageResource(R.drawable.common_ui_arrow_right);
            imageView2.setImageResource(R.drawable.common_ui_arrow_right);
            imageView3.setImageResource(R.drawable.common_ui_arrow_right);
        }
        if (qrs.v()) {
            HealthTextView healthTextView = (HealthTextView) findViewById(R.id.sleep_record_detection_wear_text);
            HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.sleep_record_detection_phone_text);
            HealthTextView healthTextView3 = (HealthTextView) findViewById(R.id.sleep_manual_text);
            healthTextView.setMaxEms(7);
            qrs.a(healthTextView);
            qrs.a(healthTextView2);
            qrs.a(healthTextView3);
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: tyv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49807b.d(view);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: tyr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49802a.b(view);
            }
        });
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: tyz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        startActivity(new Intent(this, (Class<?>) SuggestActivity.class));
    }

    public /* synthetic */ void b(View view) {
        ddv.b().loadH5ProApp(this, "com.huawei.health.h5.sleepdetection", new H5ProLaunchOption.Builder().addPath("#/aboutPage").addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).setForceDarkMode(1).setImmerse().showStatusBar().setStatusBarTextBlack(true));
    }

    public /* synthetic */ void e(View view) {
        ddv.b().loadH5ProApp(this, "com.huawei.health.h5.sleepdetection", new H5ProLaunchOption.Builder().addPath("#/inputAboutPage").addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).setForceDarkMode(1).setImmerse().showStatusBar().setStatusBarTextBlack(true));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
