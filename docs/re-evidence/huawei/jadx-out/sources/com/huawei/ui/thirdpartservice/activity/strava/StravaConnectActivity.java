package com.huawei.ui.thirdpartservice.activity.strava;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.thirdpartservice.R;
import com.huawei.ui.thirdpartservice.activity.BaseConnectActivity;
import com.huawei.ui.thirdpartservice.activity.strava.StravaConnectActivity;
import com.huawei.ui.thirdpartservice.syncdata.constants.StravaInfo;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import com.huawei.ui.thirdpartservice.syncdata.oauth.OauthManager;
import com.huawei.ui.thirdpartservice.syncdata.strava.StravaConfig;
import defpackage.qri;
import defpackage.wxs;
import defpackage.xcf;
import defpackage.xcj;

/* JADX INFO: loaded from: classes3.dex */
public class StravaConnectActivity extends BaseConnectActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StravaConfig f29126b = new StravaConfig();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StravaInfo f29127c;

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29127c = xcf.b(LoginInit.getInstance(this).getAccountInfo(1009));
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public void checkConnectStatus() {
        xcj.c().checkConnectStatus(new wxs(this));
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public void initView() {
        ((CustomTitleBar) findViewById(R.id.title_bar)).setTitleText(getString(R.string.IDS_sync_strava_data_name));
        ((ImageView) findViewById(R.id.logo_img)).setImageResource(R.mipmap.ic_service_3rd_party_strava);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.sport_connect_content);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.sport_connect_tip);
        HealthTextView healthTextView3 = (HealthTextView) findViewById(R.id.sport_connect_content1);
        HealthTextView healthTextView4 = (HealthTextView) findViewById(R.id.sport_connect_content2);
        HealthTextView healthTextView5 = (HealthTextView) findViewById(R.id.sport_connect_content3);
        HealthTextView healthTextView6 = (HealthTextView) findViewById(R.id.sport_connect_content4);
        HealthTextView healthTextView7 = (HealthTextView) findViewById(R.id.sport_connect_content5);
        HealthTextView healthTextView8 = (HealthTextView) findViewById(R.id.sport_connect_content6);
        HealthTextView healthTextView9 = (HealthTextView) findViewById(R.id.sport_connect_instruct);
        healthTextView2.setGravity(17);
        healthTextView2.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        a(healthTextView3, healthTextView5);
        c(healthTextView4);
        healthTextView.setGravity(17);
        healthTextView.setText(getString(R.string.IDS_sync_strava_connect_title));
        healthTextView.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        healthTextView6.setText(getString(R.string.IDS_sync_strava_tip4, new Object[]{4}));
        healthTextView7.setText(getString(R.string.IDS_sync_strava_tip5, new Object[]{5}));
        healthTextView8.setText(getString(R.string.IDS_sync_strava_tip6, new Object[]{6}));
        healthTextView9.setText(getString(R.string.IDS_sync_strava_instruct));
        healthTextView9.setGravity(17);
        healthTextView9.setTypeface(Typeface.DEFAULT, 1);
        e();
    }

    private void c(HealthTextView healthTextView) {
        String string = getString(R.string.IDS_sync_strava_splice_str3);
        SpannableString spannableString = new SpannableString(getString(R.string.IDS_sync_strava_tip2, new Object[]{2, string}));
        int iIndexOf = spannableString.toString().indexOf(string);
        int length = string.length();
        final String string2 = BaseApplication.getContext().getResources().getString(R.string.strava_privacy_url);
        qri.d(spannableString, iIndexOf, length + iIndexOf, new ClickableSpan() { // from class: com.huawei.ui.thirdpartservice.activity.strava.StravaConnectActivity.2
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                if (TextUtils.isEmpty(string2)) {
                    return;
                }
                StravaConnectActivity.this.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(string2)));
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(-16776961);
                textPaint.setUnderlineText(true);
            }
        });
        healthTextView.setText(spannableString);
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void a(HealthTextView healthTextView, HealthTextView healthTextView2) {
        SpannableString spannableString;
        SpannableString spannableString2;
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009);
        String string = getString(R.string.IDS_sync_strava_splice_str1);
        String string2 = getString(R.string.IDS_sync_strava_splice_str2);
        if (String.valueOf(7).equals(accountInfo)) {
            spannableString = new SpannableString(getString(R.string.IDS_sync_strava_tip1_europe, new Object[]{1, string, string2}));
            spannableString2 = new SpannableString(getString(R.string.IDS_sync_strava_tip3_europe, new Object[]{3, getString(R.string.IDS_sync_strava_splice_str4)}));
            qri.a(spannableString2, getString(R.string.IDS_sync_strava_splice_str4), new StyleSpan(1));
        } else {
            spannableString = new SpannableString(getString(R.string.IDS_sync_strava_tip1, new Object[]{1, string, string2}));
            spannableString2 = new SpannableString(getString(R.string.IDS_sync_strava_tip3, new Object[]{3}));
        }
        qri.a(spannableString, string, new StyleSpan(1));
        qri.a(spannableString, string2, new StyleSpan(1));
        healthTextView.setText(spannableString);
        healthTextView2.setText(spannableString2);
    }

    private void e() {
        HealthButton healthButton = (HealthButton) findViewById(R.id.health_connect_button);
        Drawable drawable = ContextCompat.getDrawable(this, R.mipmap.btn_strava_connectwith_orange);
        if (drawable != null) {
            ViewGroup.LayoutParams layoutParams = healthButton.getLayoutParams();
            layoutParams.height = drawable.getIntrinsicHeight();
            layoutParams.width = drawable.getIntrinsicWidth();
            healthButton.setLayoutParams(layoutParams);
            healthButton.setBackground(drawable);
        }
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: wxt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52581a.c(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        openOauthPage();
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public String getAccountType() {
        return SyncDataConstant.BI_VALUE_ACCOUNT_TYPE_STRAVA;
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public String getGrsKey() {
        return "domain_strava_oauth";
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public String getAuthorizationUrl() {
        return StravaInfo.STRAVA_AUTHORIZATION_URL;
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public String getRedirectUri() {
        return StravaInfo.STRAVA_REDIRECT_URI;
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public String getClientId() {
        return this.f29127c.getClientId();
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public OauthManager createOauthManager() {
        return xcj.c();
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public String getTag() {
        return "StravaConnectActivity";
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public Intent createDisconnectIntent() {
        return new Intent(this, (Class<?>) StravaHealthActivity.class);
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public void checkSupport(final BaseConnectActivity.CheckSupportCallBack checkSupportCallBack) {
        super.checkSupport(checkSupportCallBack);
        this.f29126b.b(new Handler(Looper.getMainLooper()), LoginInit.getInstance(this).getAccountInfo(1010), new StravaConfig.StravaCountryCallback() { // from class: wxv
            @Override // com.huawei.ui.thirdpartservice.syncdata.strava.StravaConfig.StravaCountryCallback
            public final void onStravaCountryCallback(boolean z) {
                StravaConnectActivity.b(checkSupportCallBack, z);
            }
        });
    }

    public static /* synthetic */ void b(BaseConnectActivity.CheckSupportCallBack checkSupportCallBack, boolean z) {
        LogUtil.a("StravaConnectActivity", "mStravaConfig isSupport ", Boolean.valueOf(z));
        checkSupportCallBack.checkResult(z);
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f29126b.b();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
