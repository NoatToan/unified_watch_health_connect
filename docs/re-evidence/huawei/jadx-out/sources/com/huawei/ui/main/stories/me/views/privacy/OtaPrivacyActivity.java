package com.huawei.ui.main.stories.me.views.privacy;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.lvb;
import defpackage.qri;
import defpackage.qrs;
import health.compact.a.GRSManager;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class OtaPrivacyActivity extends BaseActivity {
    private DeviceInfo e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ota_privacy);
        LogUtil.a("OtaPrivacyActivity", "onCreate");
        e();
    }

    private void e() {
        Intent intent = getIntent();
        if (intent == null || intent.getExtras() == null) {
            LogUtil.j("OtaPrivacyActivity", "initData intent is null");
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("deviceInfo");
        if (!(parcelableExtra instanceof DeviceInfo)) {
            LogUtil.j("OtaPrivacyActivity", "parcelableExtra is not instanceof deviceInfo");
            return;
        }
        this.e = (DeviceInfo) parcelableExtra;
        if (intent.getBooleanExtra("OTA_SHOW_EUR_TYPE", false)) {
            c();
        }
    }

    private void c() {
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.ota_privacy_content_tv);
        final String strB = b();
        LogUtil.a("OtaPrivacyActivity", "legalUrl:", strB);
        String string = getResources().getString(R.string.IDS_ota_privacy_content2);
        String string2 = getResources().getString(R.string.IDS_eur_phone_pair_here);
        SpannableString spannableString = new SpannableString(String.format(Locale.ENGLISH, string, string2));
        qri.a(spannableString, string2, new ClickableSpan() { // from class: com.huawei.ui.main.stories.me.views.privacy.OtaPrivacyActivity.3
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                if (qrs.c(500)) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("url", strB);
                AppRouter.c("/PluginOperation/WebViewActivity").d(bundle).b(OtaPrivacyActivity.this);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                if (textPaint != null) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(ContextCompat.getColor(OtaPrivacyActivity.this, R.color.common_colorAccent));
                    textPaint.setUnderlineText(false);
                }
            }
        });
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        healthTextView.setHighlightColor(ContextCompat.getColor(this, android.R.color.transparent));
        healthTextView.setText(spannableString);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005f  */
    protected String b() {
        String str;
        String[] stringArray = getResources().getStringArray(R.array.device_ota_legal_urls);
        String commonCountryCode = GRSManager.c(BaseApplication.b()).getCommonCountryCode();
        if (TextUtils.isEmpty(commonCountryCode)) {
            commonCountryCode = "cn";
        }
        if (g()) {
            if (stringArray.length >= 2) {
                str = stringArray[1] + commonCountryCode + d();
            } else {
                str = "";
            }
        } else if (stringArray.length >= 1) {
            str = stringArray[0] + commonCountryCode + d();
        } else {
            str = "";
        }
        return str + "&branchid=0";
    }

    private boolean g() {
        DeviceCapability deviceCapability;
        Map<String, DeviceCapability> mapD = lvb.e().d(3, "", "OtaPrivacyActivity");
        if (mapD != null) {
            LogUtil.j("OtaPrivacyActivity", "filter deviceCapabilityMap is null");
            deviceCapability = mapD.get(this.e.getDeviceIdentify());
        } else {
            deviceCapability = null;
        }
        if (this.e.getSportVersion() == 1) {
            return true;
        }
        return (this.e.getSportVersion() == 0 || deviceCapability == null || !deviceCapability.isSupportSmartWatchVersionStatus()) ? false : true;
    }

    private String d() {
        return Constants.LANGUAGE + a();
    }

    private String a() {
        Locale locale = Locale.getDefault();
        String script = locale.getScript();
        String language = locale.getLanguage();
        if (!TextUtils.isEmpty(script)) {
            language = language + "_" + script;
        }
        return language + "_" + locale.getCountry();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
