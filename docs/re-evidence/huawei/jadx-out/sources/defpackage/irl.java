package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.TypefaceSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.google.gson.Gson;
import com.huawei.health.R;
import com.huawei.health.interactor.MainInteractors;
import com.huawei.health.utils.MainInteractorsUtils;
import com.huawei.hms.support.hwid.common.constants.CommonConstant;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwcloudmodel.https.HttpResCallBack;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.HomeOverseaPrivacyDialog;
import com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class irl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SpannableString f37998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37999c;
    private Context d;
    private int e;
    private View f;
    private List<Integer> h = new ArrayList(2);
    private String i;
    private String j;

    public irl(Context context, String str, int i, String str2) {
        if (context == null) {
            LogUtil.j("SignAgreementDialog", "SignAgreementDialog context is null");
            return;
        }
        this.d = context;
        this.f37997a = str;
        this.e = i;
        this.j = str2;
    }

    public void b() {
        if (fns.a() || MainInteractorsUtils.f10361a) {
            ReleaseLogUtil.d("R_SignAgreementDialog", "showAgreementDialog isBaseServiceModel is true, isShowSer is ", Boolean.valueOf(MainInteractorsUtils.f10361a));
            return;
        }
        String string = this.d.getString(R.string.IDS_placeholders_hwh_user_agreement);
        String string2 = this.d.getString(R.string.IDS_placeholders_hwh_privacy_statement);
        ArrayList arrayList = new ArrayList();
        int i = this.e;
        if (i == 1) {
            arrayList.add(Integer.valueOf(AgrConstant.HEALTH_AGREEMENT_CODE));
            this.i = this.d.getString(R.string.IDS_hwh_change_notice_user_agreement);
            this.f37999c = this.d.getString(R.string.IDS_hwh_privacy_change_notice_one, string);
            this.f37998b = d(string);
            b(string, "HealthUserAgreement");
        } else if (i == 2) {
            arrayList.add(10009);
            this.i = this.d.getString(R.string.IDS_hwh_change_notice_privacy_statement);
            this.f37999c = this.d.getString(R.string.IDS_hwh_privacy_change_notice_one, string2);
            this.f37998b = d(string2);
            b(string2, "HealthPrivacy");
        } else if (i == 3) {
            arrayList.add(Integer.valueOf(AgrConstant.HEALTH_AGREEMENT_CODE));
            arrayList.add(10009);
            this.i = this.d.getString(R.string.IDS_hwh_change_notice_both);
            this.f37999c = this.d.getString(R.string.IDS_hwh_privacy_change_notice_two, string, string2);
            if (LoginInit.getInstance(BaseApplication.getContext()).isKoreaCountry()) {
                this.f37998b = new SpannableString(this.d.getString(R.string.IDS_hwh_change_notice_detail_both_korea, string, string2, this.d.getString(R.string.IDS_hwh_location_service_terms), this.d.getString(R.string.IDS_hwh_location_info_terms)));
            } else {
                this.f37998b = new SpannableString(qre.a(R.string.IDS_hwh_change_notice_detail_both, string, string2));
            }
            b(string, "HealthUserAgreement");
            b(string2, "HealthPrivacy");
        } else {
            this.i = this.d.getString(R.string.IDS_hwh_change_notice_user_agreement);
            this.f37999c = this.d.getString(R.string.IDS_hwh_privacy_change_notice_one, string);
            this.f37998b = d(string);
            b(string, "HealthUserAgreement");
        }
        if (LoginInit.getInstance(BaseApplication.getContext()).isKoreaCountry()) {
            b(this.d.getString(R.string.IDS_hwh_location_service_terms), "LocationServiceTerms");
            b(this.d.getString(R.string.IDS_hwh_location_info_terms), "LocationInfoTerms");
        }
        this.h = arrayList;
        e(this.d);
        a();
    }

    private SpannableString d(String str) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isKoreaCountry()) {
            return new SpannableString(qre.a(R.string.IDS_hwh_change_notice_detail_one_korea, str, this.d.getString(R.string.IDS_hwh_location_service_terms), this.d.getString(R.string.IDS_hwh_location_info_terms)));
        }
        return new SpannableString(qre.a(R.string.IDS_hwh_change_notice_detail_one, str));
    }

    private void e(Context context) {
        View viewInflate = View.inflate(context, R.layout.hw_health_agr_sign_dialog, null);
        this.f = viewInflate;
        ((HealthTextView) viewInflate.findViewById(R.id.hw_health_notice_change_text)).setText(this.f37999c);
        HealthTextView healthTextView = (HealthTextView) this.f.findViewById(R.id.hw_health_agr_sign_service);
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        healthTextView.setHighlightColor(ContextCompat.getColor(context, android.R.color.transparent));
        healthTextView.setText(this.f37998b);
    }

    private void b(String str, String str2) {
        int iIndexOf = this.f37998b.toString().indexOf(str);
        if (iIndexOf != -1) {
            wmt wmtVar = new wmt(this.d, str2);
            this.f37998b.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf, str.length() + iIndexOf, 33);
            this.f37998b.setSpan(wmtVar, iIndexOf, str.length() + iIndexOf, 17);
        }
    }

    private void a() {
        String upperCase = this.d.getString(R.string.IDS_hw_show_agree).toUpperCase(Locale.ROOT);
        d(this.d, 0);
        CustomViewDialog.Builder builderD = new CustomViewDialog.Builder(this.d).a(this.i).d(this.f);
        if (this.e == 2 && CommonUtil.j(LoginInit.getInstance(this.d).getAccountInfo(1009)) == 7) {
            upperCase = this.d.getString(R.string.IDS_hw_show_confirm).toUpperCase(Locale.ENGLISH);
        } else {
            builderD.c(this.d.getString(R.string.IDS_hw_show_cancel).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: iri
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37993b.b(view);
                }
            });
        }
        builderD.a(upperCase, new View.OnClickListener() { // from class: irl.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (LoginInit.getInstance(irl.this.d).isKidAccount()) {
                    Intent intent = new Intent();
                    intent.putExtra("requestCode", SleepBaseBarLineChartProvider.MSG_UPDATE_DATA_ORIGINAL_ICON);
                    intent.putExtra(CommonConstant.REALNAMERESULT.KEY_VERIFY_TYPE, "1");
                    intent.setClassName(irl.this.d, "com.huawei.health.HuaweiLoginActivity");
                    ((Activity) irl.this.d).startActivityForResult(intent, 6013);
                    return;
                }
                irl.this.d();
                HomeOverseaPrivacyDialog.e(irl.this.d);
            }
        });
        CustomViewDialog customViewDialogD = builderD.d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
    }

    /* synthetic */ void b(View view) {
        e();
    }

    public void d() {
        wjs.b(this.f37997a, this.j, true, this.h, new HttpResCallBack() { // from class: irj
            @Override // com.huawei.hwcloudmodel.https.HttpResCallBack
            public final void onFinished(int i, String str) {
                LogUtil.a("SignAgreementDialog", "AgrSignDialog_signAgrHttp onFinished ", str);
            }
        });
        d(this.d, 2);
        SharedPreferenceManager.e(this.d, Integer.toString(10000), "agr_if_agree_authorize", "1", new StorageParams());
        ReleaseLogUtil.d("R_SignAgreementDialog", "showUserAgreeDialog, key_wether_to_auth is true");
        KeyValDbManager.d(this.d).b("key_wether_to_auth", String.valueOf(true));
        SharedPreferenceManager.a(this.d, true);
        SharedPreferenceManager.e(this.d, Integer.toString(10000), "key_wether_to_auth", String.valueOf(true), new StorageParams());
        AuthorizationUtils.b();
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "agr_authorized_versions", new Gson().toJson(this.h), new StorageParams());
    }

    public void e() {
        d(this.d, 1);
        lmf.d().b(this.d);
        MainInteractors.b();
    }

    private void d(Context context, int i) {
        HashMap map = new HashMap();
        map.put("type", Integer.valueOf(i));
        lmf.d().c(context, AnalyticsValue.HEALTH_SHOW_SIGN_AGREEMENT_2040081.value(), map, 0);
    }
}
