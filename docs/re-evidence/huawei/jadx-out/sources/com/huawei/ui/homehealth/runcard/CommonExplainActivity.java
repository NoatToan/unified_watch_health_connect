package com.huawei.ui.homehealth.runcard;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.homehealth.R;
import defpackage.njy;
import defpackage.vdo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class CommonExplainActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f25744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f25745c;
    private String e = "";
    private String d = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f25743a = new ArrayList();

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cancelMarginAdaptation();
        setContentView(R.layout.activity_common_explain);
        f();
        b();
        d();
    }

    private void f() {
        this.f25744b = (CustomTitleBar) findViewById(R.id.explain_title_bar);
        this.f25745c = (LinearLayout) findViewById(R.id.explain_layout);
    }

    private void b() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.e = intent.getStringExtra("bar_title");
                this.d = intent.getStringExtra("extra_title");
                this.f25743a = intent.getStringArrayListExtra("extra_content");
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.e("Suggestion_CommonExplainActivity", "initData mContentList index out of bounds.");
            }
        }
    }

    private void d() {
        e();
        c();
        a();
    }

    private void e() {
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        this.f25744b.setTitleText(this.e);
    }

    private void c() {
        if (TextUtils.isEmpty(this.d)) {
            return;
        }
        HealthTextView healthTextView = new HealthTextView(this);
        healthTextView.setText(this.d);
        healthTextView.setTextColor(getResources().getColor(R.color.textColorPrimary));
        healthTextView.setTextSize(0, getResources().getDimension(R.dimen.textSizeBody2));
        healthTextView.setTypeface(Typeface.DEFAULT_BOLD);
        healthTextView.setGravity(GravityCompat.START);
        this.f25745c.addView(healthTextView);
    }

    private void a() {
        if (njy.e(this.f25743a)) {
            return;
        }
        int i = 0;
        for (String str : this.f25743a) {
            if (str != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (i != 0 || !TextUtils.isEmpty(this.d)) {
                    layoutParams.topMargin = vdo.b(getApplicationContext(), getResources().getDimension(R.dimen.elementsMarginVerticalM));
                }
                HealthTextView healthTextView = new HealthTextView(this);
                healthTextView.setText(str);
                healthTextView.setTextColor(getResources().getColor(R.color.textColorPrimary));
                healthTextView.setTextSize(0, getResources().getDimension(R.dimen.textSizeBody2));
                healthTextView.setGravity(GravityCompat.START);
                this.f25745c.addView(healthTextView, layoutParams);
                i++;
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
