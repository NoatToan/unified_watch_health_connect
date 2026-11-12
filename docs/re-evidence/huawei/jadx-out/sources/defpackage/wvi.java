package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class wvi {
    public static void c(Context context, View view) {
        if (context == null || view == null) {
            LogUtil.j("TermsUtil", "putAgreementText param is null");
            return;
        }
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.hw_health_service_item_one);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.hw_health_service_item_two);
        HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.hw_health_service_item_three);
        HealthTextView healthTextView4 = (HealthTextView) view.findViewById(R.id.hw_health_service_item_four);
        HealthTextView healthTextView5 = (HealthTextView) view.findViewById(R.id.hw_health_service_item_five);
        HealthTextView healthTextView6 = (HealthTextView) view.findViewById(R.id.hw_health_service_item_six);
        HealthTextView healthTextView7 = (HealthTextView) view.findViewById(R.id.hw_health_service_item_seven);
        HealthTextView healthTextView8 = (HealthTextView) view.findViewById(R.id.hw_health_service_item_eight);
        HealthTextView healthTextView9 = (HealthTextView) view.findViewById(R.id.hw_health_service_item_nine);
        healthTextView3.getPaint().setFakeBoldText(true);
        healthTextView4.getPaint().setFakeBoldText(true);
        b(context, healthTextView8, healthTextView9);
        healthTextView.setText(e());
        healthTextView2.setText(context.getString(R.string.IDS_hwh_agreement_public_two));
        healthTextView3.setText(context.getString(R.string.IDS_hwh_agreement_public_three));
        healthTextView4.setText(context.getString(R.string.IDS_hwh_agreement_oversea_one));
        healthTextView5.setText(context.getString(R.string.IDS_hwh_agreement_public_four));
        if (!Utils.o()) {
            healthTextView4.setText(context.getString(R.string.IDS_hwh_agreement_china_one));
            healthTextView6.setText(context.getString(R.string.IDS_hwh_agreement_china_two));
            healthTextView7.setText(context.getString(R.string.IDS_hwh_agreement_china_three));
            healthTextView8.setText(context.getString(R.string.IDS_hwh_agreement_china_four));
            healthTextView9.setVisibility(8);
        }
        if (Utils.o() && Utils.h()) {
            healthTextView6.setText(context.getString(R.string.IDS_hwh_agreement_europe_one));
            healthTextView7.setVisibility(8);
        }
        if (Utils.h()) {
            return;
        }
        healthTextView6.setText(context.getString(R.string.IDS_hwh_agreement_other_one));
        healthTextView7.setVisibility(8);
    }

    public static SpannableString e() {
        return b(BaseApplication.getContext());
    }

    public static SpannableString b(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        SpannableString spannableString;
        String string = context.getString(R.string.IDS_sentences_network);
        String string2 = context.getString(R.string.IDS_sentences_location);
        String string3 = context.getString(R.string.IDS_sentences_camera);
        String string4 = context.getString(R.string.IDS_sentences_microphone);
        String string5 = context.getString(R.string.IDS_sentences_contacts);
        String string6 = context.getString(R.string.IDS_sentences_call_log);
        String string7 = context.getString(R.string.IDS_sentences_storage);
        String string8 = context.getString(R.string.IDS_sentences_phone);
        String string9 = context.getString(R.string.IDS_sentences_short_message);
        String string10 = context.getString(R.string.IDS_sentences_calendar);
        String string11 = context.getString(R.string.IDS_sentences_physical_activity);
        String string12 = context.getString(R.string.IDS_sentences_nearby_devices);
        String string13 = context.getString(R.string.IDS_sentences_image_video);
        String string14 = context.getString(R.string.IDS_sentences_music_audio);
        String string15 = context.getString(R.string.IDS_sentences_file);
        if (PermissionUtil.f()) {
            str2 = string12;
            str3 = string11;
            str4 = string10;
            str5 = string9;
            str6 = string8;
            str = string;
            str7 = string6;
            str8 = string5;
            str9 = string4;
            str10 = string3;
            str11 = string2;
            spannableString = new SpannableString(context.getString(LoginInit.getInstance(context).isKoreaCountry() ? R.string.IDS_privacy_notice_service_new_2026_4_korea_api33 : R.string.IDS_privacy_notice_service_new_2026_4_api33, string, string2, string3, string4, string5, string6, string13, string14, string15, str6, str5, str4, str3, str2));
            a(spannableString, string13);
            a(spannableString, string14);
            a(spannableString, string15);
        } else {
            str = string;
            str2 = string12;
            str3 = string11;
            str4 = string10;
            str5 = string9;
            str6 = string8;
            str7 = string6;
            str8 = string5;
            str9 = string4;
            str10 = string3;
            str11 = string2;
            spannableString = new SpannableString(context.getString(LoginInit.getInstance(context).isKoreaCountry() ? R.string.IDS_privacy_notice_service_new_2025_5_korea : R.string.IDS_privacy_notice_service_new_2025_5, str, str11, str10, str9, str8, str7, string7, str6, str5, str4, str3, str2));
            a(spannableString, string7);
        }
        a(spannableString, str);
        a(spannableString, str11);
        a(spannableString, str10);
        a(spannableString, str9);
        a(spannableString, str8);
        a(spannableString, str7);
        c(spannableString, str6);
        a(spannableString, str5);
        a(spannableString, str4);
        a(spannableString, str3);
        a(spannableString, str2);
        return spannableString;
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            int iOptInt = new JSONObject(str).optInt("errorCode");
            if (iOptInt != 0) {
                LogUtil.j("TermsUtil", "isPrivacySuccess errorCode:", Integer.valueOf(iOptInt));
                OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_AGREEMENT_SIGNING_85070027.value(), iOptInt);
                return false;
            }
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_AGREEMENT_SIGNING_85070027.value(), 0);
            return true;
        } catch (JSONException e) {
            LogUtil.e("TermsUtil", "isPrivacySuccess JSONException, ", LogAnonymous.c(e));
        }
    }

    public static void a(SpannableString spannableString, String str) {
        int iIndexOf;
        if (spannableString == null || TextUtils.isEmpty(str) || (iIndexOf = spannableString.toString().indexOf(str)) == -1) {
            return;
        }
        spannableString.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf, str.length() + iIndexOf, 33);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(BaseApplication.getContext(), R.color.textColorPrimary)), iIndexOf, str.length() + iIndexOf, 33);
    }

    public static void c(SpannableString spannableString, String str) {
        int iLastIndexOf;
        if (spannableString == null || TextUtils.isEmpty(str) || (iLastIndexOf = spannableString.toString().lastIndexOf(str)) == -1) {
            return;
        }
        spannableString.setSpan(new TypefaceSpan(Constants.FONT), iLastIndexOf, str.length() + iLastIndexOf, 33);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(BaseApplication.getContext(), R.color.textColorPrimary)), iLastIndexOf, str.length() + iLastIndexOf, 33);
    }

    private static void b(Context context, HealthTextView healthTextView, HealthTextView healthTextView2) {
        if (Utils.o()) {
            healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
            healthTextView.setHighlightColor(context.getResources().getColor(android.R.color.transparent));
            healthTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            healthTextView2.setHighlightColor(context.getResources().getColor(android.R.color.transparent));
            String string = context.getString(R.string.IDS_hw_show_setting_about_service_item);
            String strTrim = context.getString(R.string.IDS_hwh_privacy_notice_title).trim();
            SpannableString spannableString = new SpannableString(context.getString(R.string.IDS_hwh_agreement_europe_and_other_two, strTrim));
            int iIndexOf = spannableString.toString().indexOf(strTrim);
            if (iIndexOf >= 0) {
                wmt wmtVar = new wmt(context, "HealthPrivacy");
                spannableString.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf, strTrim.length() + iIndexOf, 33);
                spannableString.setSpan(wmtVar, iIndexOf, strTrim.length() + iIndexOf, 17);
            }
            healthTextView.setText(spannableString);
            SpannableString spannableString2 = new SpannableString(context.getString(R.string.IDS_hwh_agreement_europe_and_other_three, string));
            int iIndexOf2 = spannableString2.toString().indexOf(string);
            if (iIndexOf2 >= 0) {
                wmt wmtVar2 = new wmt(context, "HealthUserAgreement");
                spannableString2.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf2, string.length() + iIndexOf2, 33);
                spannableString2.setSpan(wmtVar2, iIndexOf2, string.length() + iIndexOf2, 17);
            }
            healthTextView2.setText(spannableString2);
        }
    }

    public static void c(HealthTextView healthTextView) {
        String strA;
        if (healthTextView == null) {
            LogUtil.j("TermsUtil", "clickableText textView is null");
            return;
        }
        Context context = healthTextView.getContext();
        String string = context.getString(R.string.IDS_hwh_about_privacy_notice);
        String string2 = context.getString(R.string.IDS_hw_show_setting_about_service_item);
        boolean zIsKoreaCountry = LoginInit.getInstance(BaseApplication.getContext()).isKoreaCountry();
        if (zIsKoreaCountry) {
            strA = qre.a(R.string.IDS_hwh_me_about_privacy_agreement_korea, string2, string, qre.f(R.string.IDS_hwh_location_service_terms), qre.f(R.string.IDS_hwh_location_info_terms));
        } else {
            strA = qre.a(R.string.IDS_hwh_me_about_privacy_agreement, string2, qre.f(R.string.IDS_hw_about_service_and), string);
        }
        SpannableString spannableString = new SpannableString(strA);
        c(spannableString, string2, "HealthUserAgreement", context);
        c(spannableString, string, "HealthPrivacy", context);
        if (zIsKoreaCountry) {
            c(spannableString, qre.f(R.string.IDS_hwh_location_service_terms), "LocationServiceTerms", context);
            c(spannableString, qre.f(R.string.IDS_hwh_location_info_terms), "LocationInfoTerms", context);
        }
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        healthTextView.setHighlightColor(ContextCompat.getColor(context, android.R.color.transparent));
        healthTextView.setText(spannableString);
    }

    private static void c(SpannableString spannableString, String str, String str2, Context context) {
        int iIndexOf = spannableString.toString().indexOf(str);
        if (iIndexOf == -1) {
            ReleaseLogUtil.d("TermsUtil", "setSpan index ", Integer.valueOf(iIndexOf), " spannableString ", spannableString, " text ", str, " type ", str2);
        } else {
            qri.a(spannableString, str, new TypefaceSpan(Constants.FONT));
            qri.a(spannableString, str, new wmt(context, str2));
        }
    }

    public static String b() {
        return BaseApplication.getContext().getString(R.string.IDS_hw_health_rights, 2014, 2026);
    }

    public static void d() {
        LogUtil.a("TermsUtil", "enter initUserShareStatus:", niz.b());
        Context context = BaseApplication.getContext();
        ioi ioiVarD = ioi.d();
        if (TextUtils.isEmpty(niz.b())) {
            if (Utils.o()) {
                String strA = iox.a("ai-analysis-001");
                if (TextUtils.isEmpty(strA) || LoginInit.getInstance(context).isKidAccount()) {
                    return;
                }
                boolean zEquals = "1".equals(strA);
                LogUtil.a("TermsUtil", "initUserShareStatus couldSwitch：", Boolean.valueOf(zEquals));
                ioiVarD.e(11, zEquals, null, null);
                return;
            }
            if (String.valueOf(0).equals(SharedPreferenceManager.e(context, Integer.toString(10000), "ove_bi_dialog_first_in"))) {
                ioiVarD.e(11, false, null, null);
                return;
            } else {
                LogUtil.a("TermsUtil", "overseaBiFirstIn is not zero");
                ioiVarD.e(11, !LoginInit.getInstance(context).isKidAccount(), null, null);
                return;
            }
        }
        ioiVarD.e(11, String.valueOf(true).equals(niz.b()), null, null);
    }
}
