package com.huawei.ui.main.stories.fitness.activity.coresleep.base;

import android.os.Bundle;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.qsp;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes19.dex */
public class BaseCoreSleepActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HealthTextView f26868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HealthTextView f26869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HealthTextView f26870c;
    public HealthTextView d;
    public HealthTextView e;
    public HealthTextView f;
    public HealthTextView g;
    public HealthTextView h;
    public HealthTextView i;
    public HealthTextView j;
    public HealthTextView k;
    public HealthTextView l;
    public HealthTextView m;
    public HealthTextView n;
    public HealthTextView o;
    public HealthTextView p;
    private HealthTextView q;
    private HealthTextView r;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b();
    }

    private void b() {
        this.f = (HealthTextView) findViewById(R.id.standard_reference);
        this.p = (HealthTextView) findViewById(R.id.user_score);
        this.j = (HealthTextView) findViewById(R.id.sleep_status);
        this.i = (HealthTextView) findViewById(R.id.sleep_status_content);
        this.f26870c = (HealthTextView) findViewById(R.id.sleep_explain_title_1);
        this.e = (HealthTextView) findViewById(R.id.sleep_explain_content_1);
        this.f26868a = (HealthTextView) findViewById(R.id.sleep_explain_title_2);
        this.f26869b = (HealthTextView) findViewById(R.id.sleep_explain_content_2);
        this.n = (HealthTextView) findViewById(R.id.text_view_8);
        this.k = (HealthTextView) findViewById(R.id.text_view_9);
        this.g = (HealthTextView) findViewById(R.id.text_view_10);
        this.l = (HealthTextView) findViewById(R.id.text_view_11);
        this.o = (HealthTextView) findViewById(R.id.text_view_12);
        this.h = (HealthTextView) findViewById(R.id.sleep_reference_title);
        this.d = (HealthTextView) findViewById(R.id.sleep_reference);
        this.m = (HealthTextView) findViewById(R.id.text_view_14);
        this.q = (HealthTextView) findViewById(R.id.text_suggest_references);
        this.r = (HealthTextView) findViewById(R.id.text_days_sleep_references);
        if (LanguageUtil.br(this)) {
            d(this.q);
            d(this.r);
        }
        if (LanguageUtil.f(BaseApplication.b())) {
            return;
        }
        qsp.a(this.f26870c, false);
        qsp.a(this.e, false);
        qsp.a(this.f26868a, false);
        qsp.a(this.f26869b, false);
    }

    public static void d(HealthTextView healthTextView) {
        if (healthTextView == null) {
            LogUtil.j("BaseCoreSleepActivity", "HealthTextView is null");
        } else {
            healthTextView.setAutoTextInfo(14, 1, 2);
        }
    }
}
