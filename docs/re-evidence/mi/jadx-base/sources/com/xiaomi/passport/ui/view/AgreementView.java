package com.xiaomi.passport.ui.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.xiaomi.account.passportsdk.account_sso.R;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.passport.ui.data.PhoneAccount;
import com.xiaomi.passport.ui.internal.util.LinkSpanHelper;
import com.xiaomi.passport.ui.license.AgreementAndPrivacyHelper;
import com.xiaomi.passport.ui.license.LoginAgreementAndPrivacy;
import com.xiaomi.passport.ui.utils.PassportPageIntent;
import com.xiaomi.phonenum.data.AccountCertification;

/* JADX INFO: loaded from: classes11.dex */
public class AgreementView extends FrameLayout {
    private static final String TAG = "AgreementView";
    private CheckBox mCbUserAgreement;
    private AccountCertification.Source mLicenseExtraOperatorSource;
    private LoginAgreementAndPrivacy mLoginAgreementAndPrivacy;
    private TextView mTvUserAgreement;

    public static class LinkClickListener implements LinkSpanHelper.OnSpanLinkClickListener {
        public final Context appContext;

        public LinkClickListener(Context context) {
            this.appContext = context;
        }

        @Override // com.xiaomi.passport.ui.internal.util.LinkSpanHelper.OnSpanLinkClickListener
        public void onLinkClicked(View view, String str) {
            Intent externalWebPageIntentWithBestEffort = PassportPageIntent.getExternalWebPageIntentWithBestEffort(this.appContext, str);
            externalWebPageIntentWithBestEffort.addFlags(268435456);
            this.appContext.startActivity(externalWebPageIntentWithBestEffort);
        }
    }

    public AgreementView(Context context) {
        super(context);
        initView(context);
    }

    private String getOperatorAgreement(LoginAgreementAndPrivacy.Type type, String str, String str2, String str3, String str4) {
        int i;
        str.hashCode();
        switch (str) {
            case "MOBILE":
                if (type != LoginAgreementAndPrivacy.Type.APP_JOIN) {
                    i = R.string.passport_user_agreement_hint_with_mobile;
                    break;
                } else {
                    i = R.string.passport_user_agreement_hint_3rd_app_mobile;
                    break;
                }
                break;
            case "UNICOM":
                if (type != LoginAgreementAndPrivacy.Type.APP_JOIN) {
                    i = R.string.passport_user_agreement_hint_with_unicom;
                    break;
                } else {
                    i = R.string.passport_user_agreement_hint_3rd_app_with_unicom;
                    break;
                }
                break;
            case "TELECOM":
                if (type != LoginAgreementAndPrivacy.Type.APP_JOIN) {
                    i = R.string.passport_user_agreement_hint_with_telecom;
                    break;
                } else {
                    i = R.string.passport_user_agreement_hint_3rd_app_with_telecom;
                    break;
                }
                break;
            default:
                if (type != LoginAgreementAndPrivacy.Type.APP_JOIN) {
                    i = R.string.passport_user_agreement_hint_default;
                    break;
                } else {
                    i = R.string.passport_user_agreement_hint_3rd_app;
                    break;
                }
                break;
        }
        if (type != LoginAgreementAndPrivacy.Type.APP_JOIN) {
            return getContext().getString(i, str2, str3, str4);
        }
        Context context = getContext();
        LoginAgreementAndPrivacy loginAgreementAndPrivacy = this.mLoginAgreementAndPrivacy;
        return context.getString(i, loginAgreementAndPrivacy.tripartiteAppAgreementUrl, loginAgreementAndPrivacy.tripartiteAppPrivacyUrl, str2, str3, str4);
    }

    private void initView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.passport_layout_agreement_view, this);
        this.mCbUserAgreement = (CheckBox) findViewById(R.id.user_agreement_checkbox);
        this.mTvUserAgreement = (TextView) findViewById(R.id.user_agreement_hint);
    }

    public String getAppAgreement() {
        LoginAgreementAndPrivacy loginAgreementAndPrivacy = this.mLoginAgreementAndPrivacy;
        LoginAgreementAndPrivacy.Type type = loginAgreementAndPrivacy == null ? LoginAgreementAndPrivacy.Type.DEF : loginAgreementAndPrivacy.type;
        Context context = getContext();
        String userAgreementUrl = AgreementAndPrivacyHelper.getUserAgreementUrl();
        String userPrivacyUrl = AgreementAndPrivacyHelper.getUserPrivacyUrl();
        if (type != LoginAgreementAndPrivacy.Type.APP_JOIN) {
            if (type == LoginAgreementAndPrivacy.Type.APP_CUSTOM) {
                return this.mLoginAgreementAndPrivacy.tripartiteAppCustomLicense;
            }
            AccountCertification.Source source = this.mLicenseExtraOperatorSource;
            return source != null ? getOperatorAgreement(type, source.f14012a, userAgreementUrl, userPrivacyUrl, source.f14013b) : context.getString(R.string.passport_user_agreement_hint_default, userAgreementUrl, userPrivacyUrl);
        }
        AccountCertification.Source source2 = this.mLicenseExtraOperatorSource;
        if (source2 != null) {
            return getOperatorAgreement(type, source2.f14012a, userAgreementUrl, userPrivacyUrl, source2.f14013b);
        }
        int i = R.string.passport_user_agreement_hint_3rd_app;
        LoginAgreementAndPrivacy loginAgreementAndPrivacy2 = this.mLoginAgreementAndPrivacy;
        return context.getString(i, loginAgreementAndPrivacy2.tripartiteAppAgreementUrl, loginAgreementAndPrivacy2.tripartiteAppPrivacyUrl, userAgreementUrl, userPrivacyUrl);
    }

    public boolean isUserAgreedProtocol() {
        return this.mCbUserAgreement.isChecked();
    }

    public void setCheckBoxVisibility(int i) {
        this.mCbUserAgreement.setVisibility(i);
    }

    public void setLoginAgreementAndPrivacy(LoginAgreementAndPrivacy loginAgreementAndPrivacy) {
        this.mLoginAgreementAndPrivacy = loginAgreementAndPrivacy;
        AccountLogger.log(TAG, "setLoginAgreementAndPrivacy>>>" + this.mLoginAgreementAndPrivacy);
    }

    public void setUserAgreementSelected(boolean z) {
        this.mCbUserAgreement.setChecked(z);
    }

    public void updateUserAgreement(PhoneAccount[] phoneAccountArr) {
        if (phoneAccountArr != null && phoneAccountArr.length > 0) {
            for (PhoneAccount phoneAccount : phoneAccountArr) {
                if (phoneAccount != null && this.mLicenseExtraOperatorSource == null) {
                    this.mLicenseExtraOperatorSource = phoneAccount.accountCertification.d;
                }
            }
        }
        LoginAgreementAndPrivacy loginAgreementAndPrivacy = this.mLoginAgreementAndPrivacy;
        if (loginAgreementAndPrivacy != null && !TextUtils.isEmpty(loginAgreementAndPrivacy.normalTextHexColor)) {
            this.mTvUserAgreement.setTextColor(Color.parseColor(this.mLoginAgreementAndPrivacy.normalTextHexColor));
        }
        String appAgreement = getAppAgreement();
        this.mTvUserAgreement.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView = this.mTvUserAgreement;
        Context context = getContext();
        LoginAgreementAndPrivacy loginAgreementAndPrivacy2 = this.mLoginAgreementAndPrivacy;
        textView.setText(LinkSpanHelper.adaptLinkStyleAndAction(context, appAgreement, loginAgreementAndPrivacy2 == null ? null : loginAgreementAndPrivacy2.clickLineHexColor, loginAgreementAndPrivacy2 == null || loginAgreementAndPrivacy2.isShowClinkLineUnderLine, new LinkClickListener(getContext().getApplicationContext())));
    }

    public AgreementView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public AgreementView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }
}
