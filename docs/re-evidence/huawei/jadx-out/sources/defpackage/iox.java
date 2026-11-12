package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.servicesapi.R;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class iox {
    public static String a(int i) {
        String strB = ioi.d().b("cloud_user_privacy" + i);
        LogUtil.a("PrivacyUtils", "getUserPrivacy privacyId：", Integer.valueOf(i), " result:", strB);
        return strB;
    }

    public static String a(String str) {
        String userPrivacyFromCloud = ((OperationUtilsApi) Services.b("PluginOperation", OperationUtilsApi.class)).getUserPrivacyFromCloud(str);
        LogUtil.a("PrivacyUtils", "getUserPrivacyFromCloud type：", str, " result:", userPrivacyFromCloud);
        return userPrivacyFromCloud;
    }

    public static String c(int i) {
        String str;
        LogUtil.a("PrivacyUtils", "getUserPrivacyDefaultStatus privacyId：", Integer.valueOf(i));
        String strA = a(i);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        if (i == 11) {
            str = "ai-analysis-001";
        } else if (i == 12) {
            str = "content-recommendation-001";
        } else {
            ReleaseLogUtil.d("PrivacyUtils", "getUserPrivacyDefaultStatus privacyId ", Integer.valueOf(i));
            return "";
        }
        String strA2 = a(str);
        if (!TextUtils.isEmpty(strA2)) {
            return String.valueOf(strA2.equals("1"));
        }
        return String.valueOf(false);
    }

    public static void d(boolean z) {
        LogUtil.a("PrivacyUtils", "switchAnalysisPrivacy isOpen：", Boolean.valueOf(z));
        b(z);
        ioi.d().e(11, z, null, null);
        dmg.a().setUserCollectionSwitch(z);
    }

    private static void b(boolean z) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (z) {
            map.put("type", "1");
            map.put("service_improvement_status", "0");
        } else {
            map.put("type", "2");
            map.put("service_improvement_status", "1");
        }
        String strValue = AnalyticsValue.HEALTH_MINE_SETTINGS_IMPROVE_PLAN_2040021.value();
        Context contextB = BaseApplication.b();
        lmf.d().c(contextB, strValue, map, 0);
        lmf.d().b(contextB);
        KeyValDbManager.d(contextB).b("key_user_experience_plan_check_box", String.valueOf(z));
    }

    public static void d(String str, int i, long j, int i2) {
        LogUtil.a("PrivacyUtils", "saveSpForPrivacyDialog key：", str, " showCount:", Integer.valueOf(i), " lastShowTime:", Long.valueOf(j), " showKeepCount:", Integer.valueOf(i2));
        HashMap map = new HashMap(3);
        map.put(SmartMsgConstant.MSG_SHOW_COUNT, String.valueOf(i));
        map.put(ContentRecord.LAST_SHOW_TIME, String.valueOf(j));
        map.put("showKeep", String.valueOf(i2));
        lua.f(String.valueOf(1004), str, HiJsonUtil.d(map));
    }

    public static Map<String, String> d(String str) {
        String strE = lua.e(String.valueOf(1004), str, "");
        LogUtil.a("PrivacyUtils", "getSpFromPrivacyDialog key：", str, " json:", strE);
        return (Map) HiJsonUtil.d(strE, new TypeToken<Map<String, String>>() { // from class: com.huawei.health.userprofilemgr.utils.PrivacyUtils$1
        }.getType());
    }

    public static void b(String str) {
        LogUtil.a("PrivacyUtils", "refreshLastShowTimeToSp key：", str);
        d(str, 3, lsl.r(System.currentTimeMillis()), 1);
    }

    public static void e(String str) {
        String strE = SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10000), "agr_if_privacy_authorize_details");
        List arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strE)) {
            try {
                arrayList = (List) qqt.c(strE, new TypeToken<ArrayList<String>>() { // from class: com.huawei.health.userprofilemgr.utils.PrivacyUtils$2
                }.getType());
            } catch (JsonSyntaxException unused) {
                LogUtil.e("PrivacyUtils", "saveAuthorizedFinishMsg json syntax exception: ", strE);
            }
        }
        arrayList.add(String.valueOf(System.currentTimeMillis()));
        arrayList.add("118,10009");
        arrayList.add(BaseApplication.i());
        arrayList.add(str);
        arrayList.add(LoginInit.getInstance(BaseApplication.b()).getHuidOrDefault());
        String string = arrayList.toString();
        LogUtil.a("PrivacyUtils", "saveAuthorizedFinishMsg str ：", string);
        SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10000), "agr_if_privacy_authorize_details", string, new StorageParams());
    }

    public static String c(Context context, int i) {
        int i2;
        if (LoginInit.getInstance(context).isKoreaCountry()) {
            i2 = R.string.IDS_hwh_agreement_singapore;
        } else if (i == 8) {
            i2 = R.string.IDS_hwh_agreement_russia;
        } else {
            i2 = R.string.IDS_hwh_agreement_hong_kong;
        }
        return qre.a(context, R.string.IDS_hwh_agreement_save_area, qre.b(context, i2));
    }

    public static String b() {
        Locale locale = Locale.getDefault();
        String script = locale.getScript();
        String language = locale.getLanguage();
        if (!TextUtils.isEmpty(script)) {
            language = language + "_" + script;
        }
        return language + "_" + locale.getCountry();
    }

    public static View b(Context context) {
        if (context == null) {
            LogUtil.j("PrivacyUtils", "getOpenAnalysisDialogView param invalid.");
            return null;
        }
        String strF = qre.f(R.string.IDS_hwh_privacy_analysis_and_improvement);
        SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_open_analysis_item_one, strF));
        c(spannableString, strF);
        String strF2 = qre.f(R.string.IDS_open_analysis_name);
        SpannableString spannableString2 = new SpannableString(qre.a(R.string.IDS_open_analysis_item_two, strF2, strF));
        c(spannableString2, strF2);
        c(spannableString2, strF);
        return c(context, spannableString, spannableString2, d(), c());
    }

    public static View d(Context context, Class cls) {
        if (context == null || cls == null) {
            LogUtil.j("PrivacyUtils", "getAnalysisAndImprovementDialogView param invalid.");
            return null;
        }
        SpannableString spannableString = new SpannableString(qre.f(R.string.IDS_hw_dialog_analysis_improvement_item_one));
        String strF = qre.f(R.string.IDS_hwh_privacy_here);
        SpannableString spannableString2 = new SpannableString(qre.a(R.string.IDS_hw_dialog_analysis_improvement_item_four, strF));
        int iIndexOf = spannableString2.toString().indexOf(strF);
        if (iIndexOf != -1) {
            ClickableSpan clickableSpanB = b(context, cls);
            spannableString2.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf, strF.length() + iIndexOf, 33);
            spannableString2.setSpan(clickableSpanB, iIndexOf, strF.length() + iIndexOf, 33);
        }
        return c(context, spannableString, spannableString2, d(), c());
    }

    private static SpannableString d() {
        String strF = qre.f(R.string.IDS_hw_app_improvement);
        String strF2 = qre.f(R.string.IDS_hw_personalized_content_recommendation);
        SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_hw_dialog_analysis_improvement_item_two, strF, strF2));
        c(spannableString, strF);
        c(spannableString, strF2);
        return spannableString;
    }

    private static SpannableString c() {
        String strF = qre.f(R.string.IDS_hw_create_workout_route);
        SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_hw_dialog_analysis_improvement_item_three, strF));
        c(spannableString, strF);
        return spannableString;
    }

    private static ClickableSpan b(final Context context, final Class cls) {
        return new ClickableSpan() { // from class: iox.3
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                LogUtil.a("PrivacyUtils", "getClickableSpan onClick");
                if (qrs.r()) {
                    LogUtil.a("PrivacyUtils", "getClickableSpan isFastClick");
                    return;
                }
                Intent intent = new Intent(context, (Class<?>) cls);
                intent.putExtra("Agreement_key", "HealthPrivacy");
                intent.putExtra("Is_show_cancel_key", false);
                intent.addFlags(268435456);
                iov.d(context, intent);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setColor(qre.e(R.color.common_colorAccent));
                textPaint.setUnderlineText(false);
            }
        };
    }

    private static View c(Context context, SpannableString spannableString, SpannableString spannableString2, SpannableString spannableString3, SpannableString spannableString4) {
        View viewInflate = View.inflate(context, R.layout.dialog_ternary_form, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.hw_health_start_title);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.hw_health_end_title);
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.hw_health_secondary_item_one);
        HealthTextView healthTextView4 = (HealthTextView) viewInflate.findViewById(R.id.hw_health_secondary_item_two);
        healthTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        healthTextView.setText(spannableString);
        healthTextView2.setText(spannableString2);
        healthTextView3.setText(spannableString3);
        healthTextView4.setText(spannableString4);
        return viewInflate;
    }

    private static void c(SpannableString spannableString, String str) {
        qri.a(spannableString, str, new StyleSpan(1));
        qri.a(spannableString, str, new ForegroundColorSpan(qre.e(R.color.doctor_card_message_text_color)));
    }

    public static boolean e(Context context) {
        return context != null && CommonUtil.j(LoginInit.getInstance(context).getAccountInfo(1009)) == 7;
    }
}
