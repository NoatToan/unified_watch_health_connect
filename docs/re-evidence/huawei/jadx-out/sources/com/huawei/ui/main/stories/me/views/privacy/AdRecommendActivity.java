package com.huawei.ui.main.stories.me.views.privacy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.main.R;
import defpackage.ddv;
import defpackage.ioi;
import defpackage.qrs;
import defpackage.wmq;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes19.dex */
public class AdRecommendActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private wmq f28549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthSwitchButton f28550c;
    private HealthTextView d;
    private Context e;
    private ioi f;
    private HealthSwitchButton i;
    private HealthSwitchButton j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ad_recommend);
        this.e = this;
        c();
        this.f = ioi.d();
        this.f28549b = wmq.a(getApplicationContext());
        e(this.f);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f28548a) {
            e();
            this.f28548a = false;
        }
    }

    private void c() {
        this.j = (HealthSwitchButton) findViewById(R.id.ad_recommend_master_switch);
        this.f28550c = (HealthSwitchButton) findViewById(R.id.ad_recommend_hw_switch);
        this.i = (HealthSwitchButton) findViewById(R.id.ad_recommend_third_switch);
        this.d = (HealthTextView) findViewById(R.id.ad_recommend_hw_des);
        d();
        this.j.setOnClickListener(this);
        this.f28550c.setOnClickListener(this);
        this.i.setOnClickListener(this);
    }

    private void d() {
        String string = getResources().getString(R.string.IDS_hwh_ad_recommend_more);
        SpannableString spannableString = new SpannableString(getResources().getString(R.string.IDS_hwh_ad_huawei_content, string));
        int iIndexOf = spannableString.toString().indexOf(string);
        if (iIndexOf <= -1) {
            LogUtil.j("AdRecommendActivity", "setAdHwDes index ", Integer.valueOf(iIndexOf));
            return;
        }
        spannableString.setSpan(new ClickableSpan() { // from class: com.huawei.ui.main.stories.me.views.privacy.AdRecommendActivity.2
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                if (qrs.r()) {
                    return;
                }
                AdRecommendActivity.this.b();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(ContextCompat.getColor(AdRecommendActivity.this.e, R.color.common_colorAccent));
                textPaint.setUnderlineText(false);
            }
        }, iIndexOf, string.length() + iIndexOf, 33);
        this.d.setText(spannableString);
        this.d.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: vwj
            @Override // java.lang.Runnable
            public final void run() {
                this.f51654b.a();
            }
        });
    }

    public /* synthetic */ void a() {
        String str = GRSManager.c(this.e).getUrl("domainContentcenterDbankcdnNew") + "/cch5/PPS/ads/ad-personalized.htm?country=CN&language=zh-cn&version=latest";
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        Intent intentCreateWebViewIntent = ddv.b().createWebViewIntent(this.e, bundle, 268435456);
        if (intentCreateWebViewIntent != null) {
            this.e.startActivity(intentCreateWebViewIntent);
        }
    }

    private void e(ioi ioiVar) {
        String strC = ioiVar.c(13);
        String strC2 = ioiVar.c(14);
        String strC3 = ioiVar.c(15);
        LogUtil.a("AdRecommendActivity", "initPersonalSwitch personalInitValue=", strC, " personalHwValue=", strC2, " personalThirdValue=", strC3);
        boolean z = true;
        this.j.setChecked(TextUtils.isEmpty(strC) || "true".equals(strC));
        this.f28550c.setChecked(TextUtils.isEmpty(strC2) || "true".equals(strC2));
        HealthSwitchButton healthSwitchButton = this.i;
        if (!TextUtils.isEmpty(strC3) && !"true".equals(strC3)) {
            z = false;
        }
        healthSwitchButton.setChecked(z);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean zIsChecked;
        if ((view instanceof HealthSwitchButton) && qrs.d((Activity) this)) {
            HealthSwitchButton healthSwitchButton = (HealthSwitchButton) view;
            healthSwitchButton.setChecked(!healthSwitchButton.isChecked());
            LogUtil.a("AdRecommendActivity", "onClick show no network dialog");
            return;
        }
        int id = view.getId();
        if (id == R.id.ad_recommend_master_switch) {
            zIsChecked = this.j.isChecked();
            this.f28548a = true;
            this.f28550c.setChecked(zIsChecked);
            this.i.setChecked(zIsChecked);
        } else if (id == R.id.ad_recommend_hw_switch) {
            zIsChecked = this.f28550c.isChecked();
            this.f28548a = true;
            if (zIsChecked && !this.j.isChecked()) {
                this.j.setChecked(zIsChecked);
            } else if (this.i.isChecked() == zIsChecked && this.j.isChecked() != zIsChecked) {
                this.j.setChecked(zIsChecked);
            }
        } else if (id == R.id.ad_recommend_third_switch) {
            this.f28548a = true;
            zIsChecked = this.i.isChecked();
            if (zIsChecked && !this.j.isChecked()) {
                this.j.setChecked(zIsChecked);
            } else if (this.f28550c.isChecked() == zIsChecked && this.j.isChecked() != zIsChecked) {
                this.j.setChecked(zIsChecked);
            }
        } else {
            LogUtil.j("AdRecommendActivity", "onClick unknown switch button");
            zIsChecked = false;
        }
        LogUtil.a("AdRecommendActivity", "onClick isChecked = ", Boolean.valueOf(zIsChecked));
    }

    private void e() {
        LogUtil.a("AdRecommendActivity", "savePersonalPrivacySettings");
        this.f28549b.a(13, this.j.isChecked());
        this.f28549b.a(14, this.f28550c.isChecked());
        this.f28549b.a(15, this.i.isChecked());
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
