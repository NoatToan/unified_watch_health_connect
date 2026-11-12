package com.huawei.sim.multisim.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.CompoundButton;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.lon;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes15.dex */
public class EsimCuccAgreementActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthCheckBox f23129b;
    private HealthButton d;
    private CustomTitleBar e;
    private HealthTextView h;
    private String j = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Float f23128c = Float.valueOf(1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Float f23127a = Float.valueOf(0.4f);

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_esim_cucc_agreement);
        LogUtil.a("EsimCuccAgreementActivity", "onCreate");
        Intent intent = getIntent();
        if (intent != null) {
            this.j = intent.getStringExtra("fakeMobile");
        }
        a();
        e();
    }

    private void e() {
        this.h = (HealthTextView) findViewById(R.id.esim_cucc_fake_mobile);
        this.f23129b = (HealthCheckBox) findViewById(R.id.esim_cucc_checkbox);
        this.d = (HealthButton) findViewById(R.id.esim_cucc_authn_agree_button);
        this.h.setText(this.j);
        this.d.setEnabled(false);
        this.d.setAlpha(f23127a.floatValue());
        this.f23129b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.sim.multisim.activity.EsimCuccAgreementActivity$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f23130a.d(compoundButton, z);
            }
        });
        b();
        this.d.setOnClickListener(new View.OnClickListener() { // from class: pwv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45919a.e(view);
            }
        });
    }

    /* synthetic */ void d(CompoundButton compoundButton, boolean z) {
        LogUtil.a("EsimCuccAgreementActivity", "esimCuccCheckBox onClick");
        this.d.setEnabled(z);
        if (this.d.isEnabled()) {
            this.d.setAlpha(f23128c.floatValue());
        } else {
            this.d.setAlpha(f23127a.floatValue());
        }
    }

    public /* synthetic */ void e(View view) {
        LogUtil.a("EsimCuccAgreementActivity", "esimCuccAuthnAgreeButton onClick");
        Intent intent = new Intent();
        intent.putExtra("cuccAgreementAgree", true);
        setResult(-1, intent);
        finish();
    }

    private void a() {
        this.e = (CustomTitleBar) findViewById(R.id.esim_cucc_authn_bar);
        if (LanguageUtil.ba(this)) {
            this.e.setLeftButtonDrawable(getDrawable(R.drawable.back_button_mirror), qre.f(R.string.accessibility_go_back));
        } else {
            this.e.setLeftButtonDrawable(getDrawable(R.drawable.back_button), qre.f(R.string.accessibility_go_back));
        }
        this.e.setLeftButtonClickable(true);
        this.e.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: pww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45920a.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        LogUtil.a("EsimCuccAgreementActivity", "setCustomTitleBar finish");
        finish();
    }

    private void b() {
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.esim_cucc_checkbox_text);
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        healthTextView.setHighlightColor(0);
        String string = getString(R.string.IDS_esim_cucc_cert_service_agreement);
        String string2 = getString(R.string.IDS_esim_cucc_authn_obtain_number, new Object[]{string});
        SpannableString spannableString = new SpannableString(string2);
        int iIndexOf = spannableString.toString().indexOf(string);
        if (iIndexOf == -1) {
            healthTextView.setText(string2);
            return;
        }
        final H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().showStatusBar().setStatusBarTextBlack(true).setForceDarkMode(0).build();
        spannableString.setSpan(new ClickableSpan() { // from class: com.huawei.sim.multisim.activity.EsimCuccAgreementActivity.5
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                String str;
                LogUtil.a("EsimCuccAgreementActivity", "ClickableSpan_onClick");
                if (qrs.r()) {
                    LogUtil.a("EsimCuccAgreementActivity", "isFastClick");
                    return;
                }
                if (LanguageUtil.l(EsimCuccAgreementActivity.this)) {
                    str = lon.c().d("domain_cucc_cert_service_agreement_cn") + "/html/oauth/protocol2.html";
                } else {
                    str = lon.c().d("domain_cucc_cert_service_agreement_en") + "/html/oauth/protocol_en.html";
                }
                LogUtil.a("EsimCuccAgreementActivity", "getCuccAgreement url = ", str);
                H5ProClient.startH5LightApp(EsimCuccAgreementActivity.this, str, h5ProLaunchOptionBuild);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(EsimCuccAgreementActivity.this.getResources().getColor(R.color.textColorPrimaryActivated));
                textPaint.setTypeface(Typeface.create(EsimCuccAgreementActivity.this.getString(R.string.textFontFamilyMedium), 0));
                textPaint.setUnderlineText(false);
            }
        }, iIndexOf, string.length() + iIndexOf, 33);
        healthTextView.setText(spannableString);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("EsimCuccAgreementActivity", "onDestroy()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
        LogUtil.a("EsimCuccAgreementActivity", "initViewTahiti()");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        LogUtil.a("EsimCuccAgreementActivity", "onBackPressed()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
