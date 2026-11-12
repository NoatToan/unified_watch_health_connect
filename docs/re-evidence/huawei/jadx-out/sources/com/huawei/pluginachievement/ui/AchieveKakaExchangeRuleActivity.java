package com.huawei.pluginachievement.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.pluginachievement.manager.model.KakaRedeemInfo;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.otl;
import defpackage.pap;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveKakaExchangeRuleActivity extends BaseActivity implements AchieveObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22061a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22062b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22063c = AwarenessConstants.REGISTER_SUCCESS_CODE;
    private otl d;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.achieve_kaka_exchange_rule);
        clearBackgroundDrawable();
        otl otlVarB = otl.b(this);
        this.d = otlVarB;
        otlVarB.c((AchieveObserver) this);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(KakaConstants.EXCHANGE_REDEEM_INFO)) {
            KakaRedeemInfo kakaRedeemInfo = (KakaRedeemInfo) intent.getParcelableExtra(KakaConstants.EXCHANGE_REDEEM_INFO);
            if (kakaRedeemInfo != null) {
                this.f22061a = kakaRedeemInfo.getDailyLimit();
                this.f22062b = kakaRedeemInfo.getExchangeProportion();
                this.f22063c = kakaRedeemInfo.getRedeemableKaka();
            }
        } else {
            j();
        }
        e();
    }

    private void e() {
        String strValueOf;
        String strValueOf2;
        c(R.id.kk_exchange_rule_text1, getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_1, new Object[]{1}));
        a();
        c(R.id.kk_exchange_rule_text3, getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_3, new Object[]{2}));
        if (LanguageUtil.au(this) || LanguageUtil.ay(this)) {
            strValueOf = String.valueOf(2.1d);
        } else {
            strValueOf = UnitUtil.e(2.1d, 1, 1);
        }
        int i = this.f22062b;
        int i2 = i > 0 ? i : 1;
        int iAbs = i > 0 ? 1 : Math.abs(i);
        c(R.id.kk_exchange_rule_text4, getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_4, new Object[]{strValueOf, Integer.valueOf(iAbs), Integer.valueOf(i2)}));
        c(R.id.kk_exchange_rule_text5, getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_5, new Object[]{Integer.valueOf(i2), Integer.valueOf(iAbs)}));
        if (LanguageUtil.au(this) || LanguageUtil.ay(this)) {
            strValueOf2 = String.valueOf(2.2d);
        } else {
            strValueOf2 = UnitUtil.e(2.2d, 1, 1);
        }
        c(R.id.kk_exchange_rule_text6, getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_6, new Object[]{strValueOf2}));
        e(getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_9), getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_10, new Object[]{200}), R.id.kk_exchange_rule_text9);
        c(R.id.kk_exchange_rule_text11, getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_11, new Object[]{200}));
        e(getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_12), getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_13, new Object[]{Integer.valueOf(this.f22061a)}), R.id.kk_exchange_rule_text12);
        f();
        c(R.id.kk_exchange_rule_text16, getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_16, new Object[]{3}));
        d();
    }

    private void a() {
        GRSManager.c(this).d("domainMVmall", new GrsQueryCallback() { // from class: com.huawei.pluginachievement.ui.AchieveKakaExchangeRuleActivity.5
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(final String str) {
                AchieveKakaExchangeRuleActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.pluginachievement.ui.AchieveKakaExchangeRuleActivity.5.4
                    @Override // java.lang.Runnable
                    public void run() {
                        AchieveKakaExchangeRuleActivity.this.c(R.id.kk_exchange_rule_text2, AchieveKakaExchangeRuleActivity.this.getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_2, new Object[]{str}));
                    }
                });
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("PLGACHIEVE_AchieveKakaExchangeRuleActivity", "onCallBackFail index = ", Integer.valueOf(i));
            }
        });
    }

    private void f() {
        Resources resources = getResources();
        int i = R.plurals.IDS_plugin_achievement_kaka_exchange_point_kaka_value;
        int i2 = this.f22063c;
        e(getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_14), getString(R.string.IDS_kaka_exc_rule_22, new Object[]{UnitUtil.e(100.0d, 1, 0), UnitUtil.e(200.0d, 1, 0), UnitUtil.e(300.0d, 1, 0), UnitUtil.e(400.0d, 1, 0), UnitUtil.e(500.0d, 1, 0), resources.getQuantityString(i, i2, Integer.valueOf(i2)), pap.a(0, 0)}), R.id.kk_exchange_rule_text14);
    }

    private void d() {
        String string = getString(R.string.IDS_plugin_achievement_kk_kaka_rule);
        c(getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_17_fixed, new Object[]{string}), string, R.id.kk_exchange_rule_text17);
        String string2 = getString(R.string.IDS_plugin_achievement_kaka_rule_string_vmall);
        c(getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_18_fixed, new Object[]{string2}), string2, R.id.kk_exchange_rule_text18);
        c(R.id.kk_exchange_rule_text19, getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_19_fixed));
        c(R.id.kk_exchange_rule_text23, getString(R.string.IDS_kaka_exc_rule_23, new Object[]{getString(R.string.IDS_plugin_achievement_kaka_exchange_points), getString(R.string.IDS_ka_exc_points_remain)}));
        c(R.id.kk_exchange_rule_text24, getString(R.string.IDS_kaka_exc_rule_24, new Object[]{getString(R.string.IDS_plugin_achievement_kaka_exchange_points)}));
        c(R.id.kk_exchange_rule_text20, getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_20_fixed));
        h();
    }

    private void h() {
        c(R.id.kk_exchange_rule_text21, getString(R.string.IDS_plugin_achievement_kaka_exchange_rule_21_fixed, new Object[]{String.format(Locale.ENGLISH, TimeModel.NUMBER_FORMAT, Integer.valueOf(KakaConstants.HOT_LINE)), UnitUtil.a(e(8), 1), UnitUtil.a(e(20), 1)}));
    }

    private Date e(int i) {
        Date date = new Date();
        date.setHours(i);
        date.setMinutes(0);
        return date;
    }

    private void e(String str, String str2, int i) {
        if (!LanguageUtil.o(this)) {
            str2 = "\u3000" + str2;
        }
        int length = str.length();
        int length2 = str2.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + str2);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(this, R.style.achieve_kaka_rule_detail_txt), length, length2 + length, 33);
        HealthTextView healthTextView = (HealthTextView) findViewById(i);
        if (healthTextView != null) {
            healthTextView.setText(spannableStringBuilder);
        }
    }

    private void c(String str, String str2, final int i) {
        int iLastIndexOf = str.lastIndexOf(str2);
        if (iLastIndexOf == -1) {
            LogUtil.e("PLGACHIEVE_AchieveKakaExchangeRuleActivity", "initRedeemedBrief not find linkName in brief");
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ClickableSpan() { // from class: com.huawei.pluginachievement.ui.AchieveKakaExchangeRuleActivity.3
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                if (i == R.id.kk_exchange_rule_text17) {
                    AchieveKakaExchangeRuleActivity.this.c();
                } else if (i == R.id.kk_exchange_rule_text18) {
                    AchieveKakaExchangeRuleActivity.this.b();
                } else {
                    LogUtil.j("PLGACHIEVE_AchieveKakaExchangeRuleActivity", "initRedeemedBrief cannot find the view");
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(ContextCompat.getColor(AchieveKakaExchangeRuleActivity.this.getBaseContext(), R.color.colorAccent));
            }
        }, iLastIndexOf, str2.length() + iLastIndexOf, 33);
        HealthTextView healthTextView = (HealthTextView) findViewById(i);
        if (healthTextView == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaExchangeRuleActivity", "initRedeemedBrief: briefView is null, " + i);
        } else {
            healthTextView.setText(spannableString);
            healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Intent intent = new Intent();
        intent.setClassName(this, PersonalData.CLASS_NAME_PERSONAL_KAKA_DETAIL);
        Bundle bundle = new Bundle();
        bundle.putString(RemoteMessageConst.Notification.TAG, "rule");
        intent.putExtra(RemoteMessageConst.Notification.TAG, bundle);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        String url = GRSManager.c(this).getUrl("domainMVmall");
        if (TextUtils.isEmpty(url)) {
            LogUtil.j("PLGACHIEVE_AchieveKakaExchangeRuleActivity", "gotoPointsMall domainHost is empty!");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.d(), "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", url + KakaConstants.HUAWEI_PONITS_RULES_PATH);
        pap.c(this, intent);
    }

    private void j() {
        HashMap map = new HashMap(8);
        map.put("type", "1");
        otl otlVar = this.d;
        if (otlVar != null) {
            otlVar.a(15, map);
        }
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, final UserAchieveWrapper userAchieveWrapper) {
        if (userAchieveWrapper == null) {
            LogUtil.e("PLGACHIEVE_AchieveKakaExchangeRuleActivity", "onDataChanged null");
            return;
        }
        if (userAchieveWrapper.getContentType() != 15) {
            LogUtil.e("PLGACHIEVE_AchieveKakaExchangeRuleActivity", "ContentType error");
            return;
        }
        String resultCode = userAchieveWrapper.getResultCode();
        if (!"0".equals(resultCode)) {
            LogUtil.e("PLGACHIEVE_AchieveKakaExchangeRuleActivity", "resultCode error:", resultCode);
        } else {
            runOnUiThread(new Runnable() { // from class: oxn
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a(userAchieveWrapper);
                }
            });
        }
    }

    public /* synthetic */ void a(UserAchieveWrapper userAchieveWrapper) {
        b(userAchieveWrapper.getRedeemInfo());
    }

    private void b(KakaRedeemInfo kakaRedeemInfo) {
        if (kakaRedeemInfo == null) {
            LogUtil.a("PLGACHIEVE_AchieveKakaExchangeRuleActivity", "redeemInfo null");
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaExchangeRuleActivity", "initParameterInfo: ", kakaRedeemInfo.toString());
        this.f22061a = kakaRedeemInfo.getDailyLimit();
        this.f22062b = kakaRedeemInfo.getExchangeProportion();
        this.f22063c = kakaRedeemInfo.getRedeemableKaka();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, CharSequence charSequence) {
        HealthTextView healthTextView = (HealthTextView) findViewById(i);
        if (healthTextView != null) {
            healthTextView.setText(charSequence);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        otl otlVar = this.d;
        if (otlVar != null) {
            otlVar.d(this);
        }
        this.d = null;
    }
}
