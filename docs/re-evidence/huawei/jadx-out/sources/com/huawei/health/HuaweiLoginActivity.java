package com.huawei.health;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.interactor.MainInteractors;
import com.huawei.hms.support.account.AccountAuthManager;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.request.AccountAuthParamsHelper;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.hwid.common.constants.CommonConstant;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.ScopeManager;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import defpackage.qre;
import defpackage.qri;
import defpackage.wmt;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class HuaweiLoginActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f6115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6117c = 0;
    private boolean d = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReleaseLogUtil.d("PLGLOGIN_HuaweiLoginActivity", "onCreate");
        Window window = getWindow();
        window.setFlags(67108864, 67108864);
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = 0;
        attributes.height = 0;
        onWindowAttributesChanged(attributes);
        this.f6115a = this;
        b();
    }

    private void b() {
        ReleaseLogUtil.d("PLGLOGIN_HuaweiLoginActivity", "initView()");
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        this.f6116b = intent.getIntExtra("callbackIndex", 0);
        int intExtra = intent.getIntExtra("requestCode", 0);
        int intExtra2 = intent.getIntExtra(CommonConstant.REALNAMERESULT.KEY_VERIFY_TYPE, 0);
        this.f6117c = intExtra2;
        if (intExtra <= 0) {
            finish();
            return;
        }
        if (intExtra == 6009) {
            e();
            return;
        }
        if (intExtra == 6012) {
            b(intent);
            return;
        }
        if (intExtra != 6011) {
            ReleaseLogUtil.d("PLGLOGIN_HuaweiLoginActivity", "initView requestCode == ", Integer.valueOf(intExtra));
        } else if (intExtra2 > 0) {
            c();
        } else {
            d();
        }
    }

    private void e() {
        ReleaseLogUtil.d("PLGLOGIN_HuaweiLoginActivity", "startAccountLogin()");
        String[] scopeList = ScopeManager.getScopeList();
        ArrayList arrayList = new ArrayList(64);
        for (String str : scopeList) {
            arrayList.add(new Scope(str));
        }
        startActivityForResult(AccountAuthManager.getService((Activity) this, new AccountAuthParamsHelper(AccountAuthParams.DEFAULT_AUTH_REQUEST_PARAM).setScopeList(arrayList).setAuthorizationCode().setAccessToken().setUid().setMobileNumber().setProfile().createParams()).getSignInIntent(), 6009);
        this.d = true;
    }

    private void c() {
        ReleaseLogUtil.d("PLGLOGIN_HuaweiLoginActivity", "enter kidAccountProtocolDialog.");
        if (TextUtils.isEmpty(SharedPreferenceUtil.getInstance(this.f6115a).getGuardianAccount())) {
            ReleaseLogUtil.d("PLGLOGIN_HuaweiLoginActivity", "kidAccountProtocolDialog is adult.");
            setResult(-1);
            finish();
        } else {
            View viewInflate = View.inflate(this.f6115a, R.layout.kid_account_protocol_dialog, null);
            e(viewInflate);
            CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.f6115a).b(this.f6115a.getString(R.string.IDS_kid_account_notice)).a(viewInflate).a(R.string.IDS_hw_show_cancel, new DialogInterface.OnClickListener() { // from class: dbj
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f31591c.e(dialogInterface, i);
                }
            }).d(R.string.IDS_hw_authorize, new DialogInterface.OnClickListener() { // from class: dbi
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f31590c.b(dialogInterface, i);
                }
            }).b();
            customAlertDialogB.setCancelable(false);
            customAlertDialogB.show();
        }
    }

    public /* synthetic */ void e(DialogInterface dialogInterface, int i) {
        ReleaseLogUtil.e("PLGLOGIN_HuaweiLoginActivity", "finish MainAcitivity for cause: don't authorize kid account.");
        MainInteractors.b();
        finish();
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        ReleaseLogUtil.d("PLGLOGIN_HuaweiLoginActivity", "authorize kid account.");
        d();
    }

    private void e(View view) {
        SpannableString spannableString;
        String strF;
        String strF2;
        if (view == null) {
            ReleaseLogUtil.e("PLGLOGIN_HuaweiLoginActivity", "initKidProtocolView view is null");
            return;
        }
        String strF3 = qre.f(R.string.IDS_kid_analyze_new_data);
        String strF4 = qre.f(R.string.IDS_kid_analyze_three_data);
        SpannableString spannableString2 = new SpannableString(qre.a(R.string.IDS_kid_agreement_modify_three, strF3, strF4));
        a(spannableString2, strF3);
        a(spannableString2, strF4);
        ((HealthTextView) view.findViewById(R.id.kid_agreement_three)).setText(spannableString2);
        String strF5 = qre.f(R.string.IDS_hwh_family_health_zone);
        String strF6 = qre.f(R.string.IDS_kid_community_new_notice);
        SpannableString spannableString3 = new SpannableString(qre.a(R.string.IDS_kid_agreement_new_four, strF5, strF6));
        a(spannableString3, strF5);
        a(spannableString3, strF6);
        ((HealthTextView) view.findViewById(R.id.kid_agreement_four)).setText(spannableString3);
        String strF7 = qre.f(R.string.IDS_placeholders_hwh_privacy_statement);
        String strF8 = qre.f(R.string.IDS_placeholders_hwh_user_agreement);
        boolean zIsKoreaCountry = LoginInit.getInstance(BaseApplication.b()).isKoreaCountry();
        if (zIsKoreaCountry) {
            strF = qre.f(R.string.IDS_hwh_location_service_terms);
            strF2 = qre.f(R.string.IDS_hwh_location_info_terms);
            spannableString = new SpannableString(qre.a(R.string.IDS_kid_agreement_korea, strF8, strF7, strF, strF2));
        } else {
            spannableString = new SpannableString(qre.a(R.string.IDS_kid_agreement_new_five, strF8, strF7));
            strF = "";
            strF2 = "";
        }
        wmt wmtVar = new wmt(this.f6115a, "HealthUserAgreement", false);
        wmt wmtVar2 = new wmt(this.f6115a, "HealthPrivacy", false);
        b(spannableString, strF8, wmtVar);
        b(spannableString, strF7, wmtVar2);
        if (zIsKoreaCountry) {
            b(spannableString, strF, new wmt(this.f6115a, "LocationServiceTerms", false));
            b(spannableString, strF2, new wmt(this.f6115a, "LocationInfoTerms", false));
        }
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.kid_agreement_five);
        healthTextView.setText(spannableString);
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void d() {
        if (CommonUtil.z(this.f6115a)) {
            a();
        } else {
            i();
        }
    }

    private void a() {
        ThirdPartyLoginManager.getInstance().checkUserPassword(this, "1", new IBaseResponseCallback() { // from class: com.huawei.health.HuaweiLoginActivity.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0) {
                    ReleaseLogUtil.d("PLGLOGIN_HuaweiLoginActivity", "judgeIsKidAndNeedAuth checkUserPassword success");
                    HuaweiLoginActivity.this.setResult(-1);
                } else {
                    ReleaseLogUtil.e("PLGLOGIN_HuaweiLoginActivity", "checkUserPassword user close", Integer.valueOf(i));
                    HuaweiLoginActivity.this.setResult(0);
                    if (HuaweiLoginActivity.this.f6117c > 0) {
                        MainInteractors.b();
                    }
                }
                HuaweiLoginActivity.this.finish();
            }
        });
    }

    private void i() {
        ReleaseLogUtil.d("PLGLOGIN_HuaweiLoginActivity", "enter verifyPassWordByHms().");
        String hMSPackageName = HMSPackageManager.getInstance(this.f6115a).getHMSPackageName();
        if (TextUtils.isEmpty(hMSPackageName)) {
            ReleaseLogUtil.e("PLGLOGIN_HuaweiLoginActivity", "checkPassWordByHms: not install hms.");
            return;
        }
        SharedPreferenceUtil sharedPreferenceUtil = SharedPreferenceUtil.getInstance(this.f6115a);
        String accountType = sharedPreferenceUtil.getAccountType();
        int i = "1".equals(accountType) ? 3 : 0;
        try {
            Intent intent = new Intent(com.huawei.hms.support.api.entity.common.CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("hwid://com.huawei.hwid/VerifyPassword"));
            intent.setPackage(hMSPackageName);
            intent.putExtra("VERIFY_PASSWORD_TYPE", i);
            intent.putExtra(SyncDataConstant.BI_KEY_ACCOUNT_TYPE, accountType);
            if (i == 3) {
                Context context = this.f6115a;
                int iN = CommonUtil.n(context, LoginInit.getInstance(context).getAccountInfo(1009));
                String guardianAccount = sharedPreferenceUtil.getGuardianAccount();
                String guardianUid = sharedPreferenceUtil.getGuardianUid();
                intent.putExtra("VERIFY_PASSWORD_TYPE", "granted");
                intent.putExtra(HwPayConstant.KEY_USER_NAME, guardianAccount);
                intent.putExtra(JsbMapKeyNames.H5_USER_ID, guardianUid);
                intent.putExtra("siteId", iN);
            }
            startActivityForResult(intent, SleepBaseBarLineChartProvider.MSG_UPDATE_DATA_ORIGINAL_ICON);
        } catch (ActivityNotFoundException unused) {
            ReleaseLogUtil.a("PLGLOGIN_HuaweiLoginActivity", "verifyPassWordByHms error.");
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ReleaseLogUtil.d("PLGLOGIN_HuaweiLoginActivity", "onActivityResult requestCode=", Integer.valueOf(i), "resultCode=", Integer.valueOf(i2));
        if (i == 6009) {
            ReleaseLogUtil.d("PLGLOGIN_HuaweiLoginActivity", "onActivityResult for account sdk login.");
            this.d = false;
            HuaweiLoginManager.getInstance().handleLoginRequest(intent, this.f6116b);
            finish();
            return;
        }
        if (i == 6011) {
            ReleaseLogUtil.d("PLGLOGIN_HuaweiLoginActivity", "onActivityResult for verify passWord.");
            setResult(i2);
            if (this.f6117c > 0 && i2 == 0) {
                System.exit(0);
            }
            finish();
        }
    }

    private void b(Intent intent) {
        String stringExtra = intent.getStringExtra("requestParam");
        if (TextUtils.isEmpty(stringExtra)) {
            ReleaseLogUtil.e("PLGLOGIN_HuaweiLoginActivity", "qrCodeAuthorize tempCode is empty");
        } else {
            ThirdPartyLoginManager.getInstance().qrCodeAuthorize(this, stringExtra, new IBaseResponseCallback() { // from class: com.huawei.health.HuaweiLoginActivity.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    ReleaseLogUtil.d("PLGLOGIN_HuaweiLoginActivity", "qrCodeAuthorize response ");
                    HuaweiLoginActivity.this.finish();
                }
            });
        }
    }

    private void a(SpannableString spannableString, String str) {
        qri.e(spannableString, str, R.string.textFontFamilyMedium);
        qri.b(spannableString, str, R.color.textColorPrimary);
    }

    private void b(SpannableString spannableString, String str, wmt wmtVar) {
        qri.e(spannableString, str, R.string.textFontFamilyMedium);
        qri.a(spannableString, str, wmtVar);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.d("PLGLOGIN_HuaweiLoginActivity", "onDestroy");
        if (this.d) {
            ReleaseLogUtil.e("PLGLOGIN_HuaweiLoginActivity", "onDestroy login not finished");
            HuaweiLoginManager.getInstance().handleLoginRequest(null, this.f6116b);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
