package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.tradeservice.R;
import com.huawei.health.tradeservice.pay.IPayEnvCheckCallback;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.iap.Iap;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iap.entity.IsEnvReadyReq;
import com.huawei.hms.iap.entity.IsEnvReadyResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.watchface.api.HwWatchFaceManager;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ily {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f37806a;

    public static String c(String str, double d) {
        String strA = a(d);
        if (LanguageUtil.ap(BaseApplication.b())) {
            strA = qhu.a(strA);
        }
        return com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_currency_money, e(str), strA);
    }

    public static String a(double d) {
        return b(d(d, 1, 2));
    }

    private static String b(String str) {
        try {
            return aej.a(new BigDecimal(str)).toPlainString();
        } catch (NumberFormatException unused) {
            LogUtil.d("TradeServiceCommonUtils", "NumberFormatException");
            return str;
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("TradeServiceCommonUtils", "currency is empty");
            return "";
        }
        if ("CNY".equals(str)) {
            return "¥";
        }
        try {
            return Currency.getInstance(str).getSymbol();
        } catch (IllegalArgumentException unused) {
            LogUtil.e("TradeServiceCommonUtils", "Currency exception");
            return "";
        }
    }

    public static void b(String str, String str2, TextView textView) {
        if (TextUtils.isEmpty(str) || textView == null) {
            return;
        }
        Context contextB = BaseApplication.b();
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf = spannableString.toString().indexOf(str2);
        if (iIndexOf != -1) {
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(contextB, R.color.emui_accent)), iIndexOf, str2.length() + iIndexOf, 33);
            spannableString.setSpan(new AbsoluteSizeSpan(contextB.getResources().getDimensionPixelSize(R.dimen.textSizeBody2)), iIndexOf, str2.length() + iIndexOf, 33);
        }
        textView.setText(spannableString);
    }

    public static void a(String str, String str2, TextView textView, int i) {
        if (TextUtils.isEmpty(str) || textView == null) {
            return;
        }
        Context contextB = BaseApplication.b();
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf = spannableString.toString().indexOf(str2);
        if (iIndexOf != -1) {
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(contextB, i)), iIndexOf, str2.length() + iIndexOf, 33);
        }
        textView.setText(spannableString);
    }

    public static double e(double d, int i) {
        return UnitUtil.d(d, b(d, i));
    }

    public static String d(double d, int i, int i2) {
        return UnitUtil.e(e(d, i2), i, b(d, i2));
    }

    private static int b(double d, int i) {
        if (i > -1) {
            return i;
        }
        double d2 = UnitUtil.d(d, 2);
        if (d2 - UnitUtil.d(d, 0) == 0.0d) {
            return 0;
        }
        return d2 - UnitUtil.d(d, 1) == 0.0d ? 1 : 2;
    }

    public static int a() {
        return CommonUtil.n(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), fxl.d());
    }

    public static String c(String str) {
        LogUtil.b("TradeServiceCommonUtils", "getPayType", str);
        Map<String, String> mapD = d();
        if (TextUtils.isEmpty(str) || !mapD.containsKey(str)) {
            return "";
        }
        return mapD.get(str);
    }

    private static Map<String, String> d() {
        HashMap map = new HashMap();
        map.put("4", com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_ali_pay));
        map.put("17", com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_wechat_pay));
        map.put("31", com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_huawei_pay));
        map.put("3", com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_cridil_pay));
        map.put("16", com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_debit_pay));
        map.put(HealthZonePushReceiver.PRESSURE_NOTIFY, com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_ant_credit_pay));
        map.put("44", com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_ant_credit_pay));
        map.put("6", com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_call_fee));
        map.put("0", com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_flower_coin));
        map.put("21", com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_flower_coin_card));
        map.put(HealthZonePushReceiver.DEAUTH_EVENT_NOTIFY, com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_broken_money));
        map.put("19", com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_gift_cards));
        map.put("13", com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_pay_pal));
        map.put("69", com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_paysafecard));
        return map;
    }

    public static String b() {
        if (CommonUtil.cl()) {
            return "10135307";
        }
        return "10414141";
    }

    public static HashMap<String, String> b(HashMap<String, String> map) {
        HashMap<String, String> map2 = new HashMap<>();
        if (map == null) {
            LogUtil.e("TradeServiceCommonUtils", "encodeRequestParams params = null");
            return map2;
        }
        for (String str : map.keySet()) {
            try {
                map2.put(str, URLEncoder.encode(map.get(str), StandardCharsets.UTF_8.name()));
            } catch (UnsupportedEncodingException | IllegalStateException unused) {
                LogUtil.d("TradeServiceCommonUtils", "encodeRequestParams exception");
            }
        }
        return map2;
    }

    public static void d(int i, Context context) {
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("event", Integer.valueOf(i));
        lmf.d().c(context, AnalyticsValue.VIP_RETAIN_POP.value(), map, 0);
    }

    public static void e(Activity activity, boolean z, final IPayEnvCheckCallback iPayEnvCheckCallback) {
        Task<IsEnvReadyResult> taskIsEnvReady;
        if (iPayEnvCheckCallback == null) {
            LogUtil.e("TradeServiceCommonUtils", "checkPayEnv failed, payCallback is null...");
            return;
        }
        if (CommonUtil.az()) {
            LogUtil.b("TradeServiceCommonUtils", "current version is GP-version, won`t guide to install hms");
            if (z) {
                taskIsEnvReady = Iap.getIapClient(activity.getApplicationContext(), b()).isEnvReady(g());
            } else {
                taskIsEnvReady = Iap.getIapClient(activity.getApplicationContext(), b()).isEnvReady();
            }
        } else if (z) {
            taskIsEnvReady = Iap.getIapClient(activity, b()).isEnvReady(g());
        } else {
            taskIsEnvReady = Iap.getIapClient(activity, b()).isEnvReady();
        }
        if (taskIsEnvReady == null) {
            LogUtil.d("TradeServiceCommonUtils", "checkPayEnv failed, create iap-task failed");
            iPayEnvCheckCallback.onResponse(1003);
        } else {
            taskIsEnvReady.addOnSuccessListener(new OnSuccessListener<IsEnvReadyResult>() { // from class: ily.5
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(IsEnvReadyResult isEnvReadyResult) {
                    iPayEnvCheckCallback.onResponse(0);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: ily.3
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    if (exc instanceof IapApiException) {
                        Status status = ((IapApiException) exc).getStatus();
                        if (status != null) {
                            int statusCode = status.getStatusCode();
                            if (statusCode == 60050) {
                                iPayEnvCheckCallback.onResponse(1001);
                            } else if (statusCode == 60054) {
                                iPayEnvCheckCallback.onResponse(1002);
                            } else {
                                iPayEnvCheckCallback.onResponse(1003);
                            }
                            LogUtil.d("TradeServiceCommonUtils", "IAP-SDK return failed, sdk status code: " + statusCode);
                            return;
                        }
                        iPayEnvCheckCallback.onResponse(1003);
                        LogUtil.d("TradeServiceCommonUtils", "IAP-SDK return failed, but sdk-status is null");
                        return;
                    }
                    if (exc instanceof ResolvableApiException) {
                        iPayEnvCheckCallback.onResponse(1015);
                        LogUtil.d("TradeServiceCommonUtils", "IAP-SDK return failed, user canceled");
                    } else {
                        iPayEnvCheckCallback.onResponse(1003);
                        LogUtil.d("TradeServiceCommonUtils", "IAP-SDK return failed, unknown exception, type: " + exc.getClass().getSimpleName());
                    }
                }
            });
        }
    }

    private static IsEnvReadyReq g() {
        IsEnvReadyReq isEnvReadyReq = new IsEnvReadyReq();
        String strE = e();
        if (!TextUtils.isEmpty(strE)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("accountInfo", strE);
                isEnvReadyReq.setReservedInfor(jSONObject.toString());
                return isEnvReadyReq;
            } catch (JSONException e) {
                LogUtil.d("TradeServiceCommonUtils", "jsonException:", ExceptionUtils.c(e));
            }
        }
        return isEnvReadyReq;
    }

    public static String e() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applicationId", b());
            jSONObject.put("routeMode", "fullsdk");
            String accountInfo = LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1014);
            if (TextUtils.isEmpty(accountInfo)) {
                LogUtil.e("TradeServiceCommonUtils", "getAccountInfo countryCode isEmpty");
                return "";
            }
            jSONObject.put("countryCode", accountInfo);
            String accountInfo2 = LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1015);
            if (TextUtils.isEmpty(accountInfo2)) {
                LogUtil.e("TradeServiceCommonUtils", "getAccountInfo accessToken isEmpty");
                return "";
            }
            jSONObject.put("accessToken", accountInfo2);
            String accountInfo3 = LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1011);
            if (TextUtils.isEmpty(accountInfo3)) {
                LogUtil.e("TradeServiceCommonUtils", "getAccountInfo huid isEmpty");
                return "";
            }
            jSONObject.put(HwWatchFaceManager.CLIENT_ID, accountInfo3);
            String string = jSONObject.toString();
            LogUtil.c("TradeServiceCommonUtils", "getAccountInfo accountInfo : ", string);
            return string;
        } catch (JSONException e) {
            ReleaseLogUtil.a("TradeServiceCommonUtils", "getAccountInfo jsonException: ", ExceptionUtils.c(e));
            return "";
        }
    }

    public static void a(String str) {
        f37806a = str;
    }

    public static String c() {
        return f37806a;
    }
}
