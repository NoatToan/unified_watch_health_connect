package com.huawei.health;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.common.util.VersionIsCloud;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.ContentProviderUtil;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.iqp;
import defpackage.qrs;
import defpackage.wtz;
import health.compact.a.CloudImpl;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;

/* JADX INFO: loaded from: classes6.dex */
public class ServiceAreaAlertActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f6162c = null;
    private Context d;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = this;
        setContentView(R.layout.show_service_area_alert_layout);
        String strE = SharedPreferenceManager.e(this.d, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country");
        if (iqp.b(this.d)) {
            strE = "TW";
        }
        if (!TextUtils.isEmpty(strE)) {
            a(strE);
        } else {
            c();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        String string;
        super.onActivityResult(i, i2, intent);
        if (i != 6005 || i2 != 0 || intent == null || (extras = intent.getExtras()) == null || this.f6162c == null) {
            return;
        }
        if (extras.containsKey("service_area_country") && extras.getString("service_area_country") != null) {
            string = extras.getString("service_area_country");
        } else {
            string = "";
        }
        if (iqp.b(this.d)) {
            this.f6162c.setText("中国台湾");
        } else {
            this.f6162c.setText(string);
        }
        String strB = wtz.b(string);
        SharedPreferenceManager.e(this.d, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country", strB, null);
        ContentProviderUtil.getInstance(this.d).setCountryCode(strB, null);
        LogUtil.a("Login_ServiceAreaAlertActivity", "onActivityResult, mCountryText = ", string, "  strCountry = ", strB);
    }

    private void c() {
        ((CustomTitleBar) findViewById(R.id.third_party_title_bar)).setLeftButtonOnClickListener(new View.OnClickListener() { // from class: dck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31606c.a(view);
            }
        });
        this.f6162c = (HealthTextView) findViewById(R.id.service_area_country);
        String strB = b();
        if (iqp.b(this.d)) {
            strB = "中国台湾";
        }
        this.f6162c.setText(strB);
        ((LinearLayout) findViewById(R.id.service_area_country_layout)).setOnClickListener(new View.OnClickListener() { // from class: dcl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31607c.i(view);
            }
        });
        d();
    }

    public /* synthetic */ void a(View view) {
        a();
    }

    public /* synthetic */ void i(View view) {
        startActivityForResult(new Intent(this.d, (Class<?>) SelectCountryListActivity.class), 6005);
    }

    private void d() {
        if (LanguageUtil.ba(this.d)) {
            ((ImageView) findViewById(R.id.service_area_select_button)).setBackgroundResource(com.huawei.ui.commonui.R.drawable.common_ui_arrow_left);
        }
        HealthButton healthButton = (HealthButton) findViewById(R.id.service_area_cancel_bottom);
        if (LanguageUtil.ap(this.d)) {
            healthButton.setTextSize(1, 13.0f);
        }
        String upperCase = getString(R.string.IDS_settings_button_cancal).toUpperCase(Locale.getDefault());
        HealthButton healthButton2 = (HealthButton) findViewById(R.id.service_area_agree_bottom);
        String upperCase2 = getString(R.string.IDS_startup_next).toUpperCase(Locale.getDefault());
        if (qrs.ac()) {
            if (upperCase2.length() > upperCase.length()) {
                healthButton.setText(d(upperCase));
            } else {
                healthButton2.setText(d(upperCase2));
            }
            i();
        } else {
            healthButton.setText(upperCase);
            healthButton2.setText(upperCase2);
        }
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: dcj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31605a.c(view);
            }
        });
        healthButton2.setOnClickListener(new View.OnClickListener() { // from class: dch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        SharedPreferenceManager.e(this.d, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country", "", null);
        moveTaskToBack(true);
    }

    public /* synthetic */ void b(View view) {
        g();
    }

    private void g() {
        String string = this.f6162c.getText().toString();
        if (iqp.b(this.d)) {
            string = "中国台湾";
        }
        String strB = wtz.b(string);
        LogUtil.a("Login_ServiceAreaAlertActivity", "startBtn setOnClickListener strCountryName = ", string, "strCountry = ", strB);
        SharedPreferenceManager.e(this.d, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country", strB, null);
        if (Utils.k() || LoginInit.getInstance(this.d).isBrowseMode()) {
            SharedPreferenceUtil.getInstance(BaseApplication.getContext()).setCountryCode(strB);
            SharedPreferenceUtil.updateLastCountryCode(strB);
        }
        if ("cn".equalsIgnoreCase(strB)) {
            HuaweiLoginManager.setCloudVersion("1", null);
        } else {
            HuaweiLoginManager.setCloudVersion("0", null);
        }
        boolean zIsOverseaJudgeByCountry = CloudImpl.e(this.d).isOverseaJudgeByCountry(strB);
        if (zIsOverseaJudgeByCountry) {
            HuaweiLoginManager.setIsAllowedLoginValueToDB(this.d, "1");
            LogUtil.a("Login_ServiceAreaAlertActivity", "judgeIfInAccountArea HWUserProfileMgr.ACCOUNT_AREA !");
        } else {
            HuaweiLoginManager.setIsAllowedLoginValueToDB(this.d, "0");
            LogUtil.a("Login_ServiceAreaAlertActivity", "judgeIfInAccountArea HWUserProfileMgr.NO_ACCOUNT_AREA !");
        }
        VersionIsCloud.setIfNeedShowAreaAlert(this.d, "0");
        ReleaseLogUtil.d("Login_ServiceAreaAlertActivity", "judgeIfInAccountArea countryCode:", strB, " isOverseaJudgeByCountry:", Boolean.valueOf(zIsOverseaJudgeByCountry));
        if (zIsOverseaJudgeByCountry) {
            e();
        } else {
            e(this.d);
        }
    }

    private void e() {
        setResult(0, new Intent());
        finish();
        if (LanguageUtil.ba(this.d)) {
            overridePendingTransition(R.anim.right_enter, R.anim.right_exit);
        } else {
            overridePendingTransition(R.anim.left_enter, R.anim.left_exit);
        }
    }

    private String b() {
        String iSO3Country;
        List<String> listA = wtz.a();
        if (listA == null || listA.size() <= 0) {
            return null;
        }
        String str = listA.get(0);
        Locale locale = getResources().getConfiguration().locale;
        String strB = wtz.b(locale);
        try {
            iSO3Country = locale.getISO3Country();
        } catch (MissingResourceException unused) {
            LogUtil.e("Login_ServiceAreaAlertActivity", "MissingResourceException");
            iSO3Country = "";
        }
        if (!TextUtils.isEmpty(iSO3Country) && ("TWN".equalsIgnoreCase(iSO3Country) || "HKG".equalsIgnoreCase(iSO3Country) || "MAC".equalsIgnoreCase(iSO3Country))) {
            LogUtil.a("Login_ServiceAreaAlertActivity", "getInitDisplayCountry sensitive country");
            return strB;
        }
        for (String str2 : listA) {
            if (str2.equalsIgnoreCase(strB)) {
                str = str2;
                break;
            }
        }
        LogUtil.a("Login_ServiceAreaAlertActivity", "strDisplayCountry initServiceAreaView() , strDisplayCountry=", str);
        return str;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("Login_ServiceAreaAlertActivity", "onBackPressed()");
        a();
    }

    private void a() {
        LogUtil.a("Login_ServiceAreaAlertActivity", "quitApplication()");
        Intent intent = new Intent();
        intent.setAction("com.huawei.commonui.CLEAN_ACTIVITY");
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
        finish();
    }

    private void a(String str) {
        String countryCode = SharedPreferenceUtil.getInstance(BaseApplication.getContext()).getCountryCode();
        ReleaseLogUtil.d("Login_ServiceAreaAlertActivity", "nextMain strCountry= ", str, " countryCode= ", countryCode);
        if (!TextUtils.isEmpty(countryCode) && !countryCode.equals(str)) {
            str = countryCode;
        }
        if (Utils.k() || LoginInit.getInstance(this.d).isBrowseMode()) {
            SharedPreferenceUtil.getInstance(BaseApplication.getContext()).setCountryCode(str);
            SharedPreferenceUtil.updateLastCountryCode(str);
        }
        if ("cn".equalsIgnoreCase(str)) {
            HuaweiLoginManager.setCloudVersion("1", null);
        } else {
            HuaweiLoginManager.setCloudVersion("0", null);
        }
        if (CloudImpl.e(this.d).isOverseaJudgeByCountry(str)) {
            CommonUtil.aa("1");
            HuaweiLoginManager.setIsAllowedLoginValueToDB(this.d, "1");
            SharedPreferenceUtil.getInstance(BaseApplication.getContext()).setSiteID(CloudImpl.e(this.d).getSiteIdByCountry(str), null);
            ReleaseLogUtil.d("Login_ServiceAreaAlertActivity", "judgeIfInAccountArea HWUserProfileMgr.ACCOUNT_AREA !");
        } else {
            CommonUtil.aa("0");
            HuaweiLoginManager.setIsAllowedLoginValueToDB(this.d, "0");
            ReleaseLogUtil.d("Login_ServiceAreaAlertActivity", "judgeIfInAccountArea HWUserProfileMgr.NO_ACCOUNT_AREA !");
        }
        VersionIsCloud.setIfNeedShowAreaAlert(this.d, "0");
        setResult(0, new Intent());
        finish();
        if (LanguageUtil.ba(this.d)) {
            overridePendingTransition(R.anim.right_enter, R.anim.right_exit);
        } else {
            overridePendingTransition(R.anim.left_enter, R.anim.left_exit);
        }
    }

    private String d(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(0, "  ");
        sb.append("  ");
        return sb.toString();
    }

    private void i() {
        ((HealthTextView) findViewById(R.id.service_area_info_value)).setTextSize(1, 24.0f);
    }

    private void e(Context context) {
        String string = context.getString(R.string.IDS_settings_restore_factory_settings_dialog_title);
        String string2 = context.getString(R.string.IDS_hw_show_no_cloud_account_msg);
        String upperCase = context.getString(R.string.IDS_hw_health_show_healthdata_confirm).toUpperCase();
        String upperCase2 = context.getString(R.string.IDS_modify_country_now).toUpperCase();
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(context);
        builder.e(string).a(string2).b(upperCase2, new View.OnClickListener() { // from class: dcg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        }).a(upperCase, new View.OnClickListener() { // from class: dci
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31604c.e(view);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void d(View view) {
        ReleaseLogUtil.d("Login_ServiceAreaAlertActivity", "checkShowNoCloudDialog cancel");
        startActivityForResult(new Intent(this.d, (Class<?>) SelectCountryListActivity.class), 6005);
        SharedPreferenceManager.e(this.d, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country", "", null);
    }

    public /* synthetic */ void e(View view) {
        ReleaseLogUtil.d("Login_ServiceAreaAlertActivity", "checkShowNoCloudDialog ok");
        e();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
