package com.huawei.ui.main.stories.me.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwcloudmodel.agreement.AgrHttp;
import com.huawei.hwcloudmodel.https.HttpResCallBack;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Action;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.main.R;
import defpackage.nzc;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.wme;
import defpackage.wmt;
import defpackage.wvi;
import health.compact.a.CommonLibUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class ServiceModelSettingActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f28459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RadioButton f28460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f28461c;
    private RadioButton d;
    private LinearLayout e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_service_model_setting);
        this.f28461c = this;
        h();
    }

    private void h() {
        this.f28459a = (LinearLayout) findViewById(R.id.full_service_layout);
        this.e = (LinearLayout) findViewById(R.id.basic_service_layout);
        this.f28459a.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.f28460b = (RadioButton) findViewById(R.id.full_service_radio_button);
        this.d = (RadioButton) findViewById(R.id.basic_service_radio_button);
        this.f28460b.setClickable(false);
        this.d.setClickable(false);
        d(SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isDestroyed() || isFinishing()) {
            LogUtil.j("ServiceModelSettingActivity", "onClick activity isDestroyed or isFinishing is null");
            return;
        }
        if (qrs.c(750)) {
            LogUtil.a("ServiceModelSettingActivity", "onClick is too fast");
            return;
        }
        if (view == this.f28459a) {
            e();
        } else if (view == this.e) {
            b();
        } else {
            LogUtil.j("ServiceModelSettingActivity", "onClick click to other view");
        }
    }

    private void e() {
        if (this.f28460b.isChecked()) {
            return;
        }
        d(false);
        j();
    }

    private void b() {
        if (this.d.isChecked()) {
            return;
        }
        d(true);
        g();
    }

    private void j() {
        LogUtil.a("ServiceModelSettingActivity", "showFullServiceDialog in");
        String string = this.f28461c.getString(com.huawei.ui.commonui.R.string.IDS_hw_health_full_service);
        CustomTextAlertDialog.Builder builderB = new CustomTextAlertDialog.Builder(this.f28461c).e(string).a(this.f28461c.getString(com.huawei.ui.commonui.R.string.IDS_hw_health_full_service_label)).a(com.huawei.ui.commonui.R.string.IDS_user_permission_ok, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.ServiceModelSettingActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ServiceModelSettingActivity.this.c(false);
                CommonLibUtil.d(ServiceModelSettingActivity.this.f28461c);
            }
        }).e(com.huawei.ui.commonui.R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.ServiceModelSettingActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("ServiceModelSettingActivity", "showFullServiceDialog onClick to cancel");
                ServiceModelSettingActivity.this.d(true);
            }
        }).b((Boolean) true);
        CustomTextAlertDialog customTextAlertDialogB = builderB.b();
        builderB.c().setBackground(this.f28461c.getDrawable(com.huawei.ui.commonui.R.drawable.button_background_emphasize));
        builderB.c().setTextColor(this.f28461c.getColor(com.huawei.ui.commonui.R.color.common_color_white));
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    private void g() {
        LogUtil.a("ServiceModelSettingActivity", "showBasicServiceDialog in");
        CustomTextAlertDialog.Builder builderE = new CustomTextAlertDialog.Builder(this.f28461c).e(this.f28461c.getString(R.string.IDS_hw_health_base_service)).d(c()).a(com.huawei.ui.commonui.R.string.IDS_device_release_user_profile_agree_and_continue, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.ServiceModelSettingActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ServiceModelSettingActivity.this.c(true);
                ServiceModelSettingActivity.this.d();
            }
        }).e(com.huawei.ui.commonui.R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.ServiceModelSettingActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("ServiceModelSettingActivity", "showBasicServiceDialog onClick to cancel");
                ServiceModelSettingActivity.this.d(false);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builderE.b();
        builderE.c().setBackground(this.f28461c.getDrawable(R.drawable.button_background_emphasize));
        builderE.c().setTextColor(this.f28461c.getColor(R.color.white));
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    private SpannableString c() {
        String string = this.f28461c.getResources().getString(R.string.IDS_sentences_network);
        String string2 = this.f28461c.getResources().getString(R.string.IDS_hw_show_setting_about_service_item);
        String string3 = this.f28461c.getResources().getString(R.string.IDS_hwh_about_privacy_notice);
        String string4 = this.f28461c.getString(R.string.IDS_hw_health_base_service_content2, string, string2, string3);
        SpannableString spannableString = new SpannableString(string4);
        wvi.a(spannableString, string);
        int iIndexOf = string4.indexOf(string2);
        int length = string2.length() + iIndexOf;
        spannableString.setSpan(new wmt(this.f28461c, "HealthUserAgreement"), iIndexOf, length, 33);
        spannableString.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf, length, 33);
        int iIndexOf2 = string4.indexOf(string3);
        int length2 = string3.length() + iIndexOf2;
        spannableString.setSpan(new wmt(this.f28461c, "HealthPrivacy"), iIndexOf2, length2, 33);
        spannableString.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf2, length2, 33);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        f();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        SharedPreferenceManager.a(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", z);
        SharedPreferenceManager.a(Integer.toString(PrebakedEffectId.RT_FLY), "is_agree_full_service_model", !z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        this.f28460b.setChecked(!z);
        this.d.setChecked(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        final LoginInit loginInit = LoginInit.getInstance(this.f28461c);
        final wme wmeVar = new wme(this);
        if (!loginInit.getIsLogined() || Utils.k()) {
            LogUtil.a("ServiceModelSettingActivity", "stopHealth isOverseaNoCloudVersion = true or logout");
            SharedPreferenceManager.e(this.f28461c, Integer.toString(10005), "hw_health_terms_authorize_china", "", null);
            wmeVar.d(this.f28461c);
            e(this.f28461c);
            i();
            return;
        }
        if (qrs.d((Activity) this)) {
            d(false);
            c(false);
            LogUtil.a("ServiceModelSettingActivity", "cancelAuth show no network dialog");
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: vve
            @Override // java.lang.Runnable
            public final void run() {
                this.f51618a.e(wmeVar, loginInit);
            }
        });
    }

    public /* synthetic */ void e(wme wmeVar, LoginInit loginInit) {
        c(this.f28461c, wmeVar, loginInit);
    }

    private void c(final Context context, final wme wmeVar, LoginInit loginInit) {
        String url = GRSManager.c(context).getUrl("agreementservice");
        String accountInfo = loginInit.getAccountInfo(1015);
        if (TextUtils.isEmpty(accountInfo) || TextUtils.isEmpty(url) || context == null) {
            LogUtil.j("ServiceModelSettingActivity", "cancelSignAgreement token or url is empty, context is null");
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(Integer.valueOf(AgrConstant.HEALTH_AGREEMENT_CODE));
        arrayList.add(10009);
        String accountInfo2 = loginInit.getAccountInfo(1010);
        String country = context.getResources().getConfiguration().locale.getCountry();
        String language = context.getResources().getConfiguration().locale.getLanguage();
        new AgrHttp().signHttpReq(accountInfo, url, false, arrayList, accountInfo2, language + "_" + country, new HttpResCallBack() { // from class: com.huawei.ui.main.stories.me.activity.ServiceModelSettingActivity.4
            @Override // com.huawei.hwcloudmodel.https.HttpResCallBack
            public void onFinished(int i, String str) {
                if (i != 200 || !wvi.c(str)) {
                    LogUtil.a("ServiceModelSettingActivity", "cancelSignAgreement_result resultCode ", Integer.valueOf(i));
                    qpx.e(context, R.string.IDS_deauthorization_fail);
                } else {
                    LogUtil.a("ServiceModelSettingActivity", "cancelSignAgreement_result ", str);
                    wmeVar.d(context);
                    ServiceModelSettingActivity.this.e(context);
                    ServiceModelSettingActivity.this.i();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        SharedPreferenceManager.e(context, Integer.toString(10000), "agr_last_query_time", "", null);
        SharedPreferenceManager.e(context, Integer.toString(10000), "if_first_agr_sign", "", null);
        SharedPreferenceManager.e(context, Integer.toString(10000), "hw_health_show_grant_pwd", Integer.toString(0), null);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("IDEQ_IndoorEquipConnectedActivity" + CommonUtil.a(context), 0).edit();
        editorEdit.putBoolean("IDEQ_IndoorEquipConnectedActivityprivacyDialogConfirm" + CommonUtil.a(context), false);
        editorEdit.apply();
        nzc.b(context, false);
    }

    private void f() {
        Intent intent = new Intent();
        intent.setAction(Action.ACTION_HW_ACCOUNT_LOGOUT);
        intent.putExtra(JsbMapKeyNames.H5_USER_ID, LoginInit.getInstance(this.f28461c).getAccountInfo(1011));
        intent.setPackage(this.f28461c.getPackageName());
        this.f28461c.sendBroadcast(intent, SecurityConstant.e);
    }

    private void a() {
        AppRouter.c("/home/main").c(com.huawei.operation.utils.Constants.HOME_TAB_NAME, com.huawei.operation.utils.Constants.HOME).b(this.f28461c);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
