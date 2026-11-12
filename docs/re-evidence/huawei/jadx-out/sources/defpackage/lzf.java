package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.R;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lzf {
    private lzf() {
    }

    public int c(Context context) {
        if (!CommonUtil.ab(context)) {
            LogUtil.d("AppMarketUtil", "getNetworkStatus not connect");
            return 2;
        }
        if (CommonUtil.ah(context)) {
            return 1;
        }
        if (e(context)) {
            return 0;
        }
        LogUtil.j("AppMarketUtil", "unknown network type");
        return 2;
    }

    private boolean e(Context context) {
        return CommonUtil.o(context) == 1;
    }

    public static boolean d() {
        DeviceInfo deviceInfoC = mgg.c("AppMarketUtil");
        if (deviceInfoC == null) {
            LogUtil.j("AppMarketUtil", "isDeviceVersionNotSupport, deviceInfo is null");
            return false;
        }
        String strB = b(deviceInfoC);
        if (TextUtils.isEmpty(strB)) {
            LogUtil.j("AppMarketUtil", "isDeviceVersionNotSupport, strongGuide is empty, so support");
            return false;
        }
        String softVersion = deviceInfoC.getSoftVersion();
        LogUtil.a("AppMarketUtil", "strongGuide :", strB, ", softVersion:", softVersion);
        int iIndexOf = strB.indexOf(AwarenessConstants.SECOND_ACTION_SPLITE_TAG);
        if (iIndexOf != -1) {
            strB = strB.substring(iIndexOf + 1).trim();
        }
        String[] strArrSplit = strB.split("\\.");
        String[] strArrSplit2 = softVersion.split("\\.");
        if (strArrSplit.length != strArrSplit2.length) {
            LogUtil.j("AppMarketUtil", "isDeviceVersionNotSupport, version length not equals");
            return false;
        }
        return d(strArrSplit, strArrSplit2);
    }

    private static String b(DeviceInfo deviceInfo) {
        JSONObject jSONObjectB = eev.b(deviceInfo.getHiLinkDeviceId());
        if (jSONObjectB == null) {
            LogUtil.j("AppMarketUtil", "getStrongGuideConfig aiTipsProduct is null");
            return "";
        }
        if (jSONObjectB.has("strong_guide")) {
            try {
                String string = jSONObjectB.getString("strong_guide");
                LogUtil.a("AppMarketUtil", "getStrongGuideConfig strongGuide:", string);
                return string;
            } catch (JSONException unused) {
                LogUtil.e("AppMarketUtil", "getStrongGuideConfig, JSONException");
                return "";
            }
        }
        LogUtil.j("AppMarketUtil", "getStrongGuideConfig aiTipsProduct not has strong_guide");
        return "";
    }

    private static boolean d(String[] strArr, String[] strArr2) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String strD = d(strArr[i]);
            String strD2 = d(strArr2[i]);
            if (TextUtils.isEmpty(strD) || TextUtils.isEmpty(strD2)) {
                LogUtil.j("AppMarketUtil", "minVersion or currentVersion is illegal");
                break;
            }
            int iJ = CommonUtil.j(strD);
            int iJ2 = CommonUtil.j(strD2);
            if (iJ2 < iJ) {
                LogUtil.d("AppMarketUtil", "index ", Integer.valueOf(i), " soft version less than min version");
                return true;
            }
            if (iJ2 > iJ) {
                LogUtil.d("AppMarketUtil", "index ", Integer.valueOf(i), " soft version more than min version");
                return false;
            }
            LogUtil.d("AppMarketUtil", "index ", Integer.valueOf(i), " soft version equals min version");
        }
        return false;
    }

    private static String d(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public void b(DeviceCapability deviceCapability, IBaseResponseCallback iBaseResponseCallback) {
        if (deviceCapability == null) {
            LogUtil.j("AppMarketUtil", "showAppMarket, deviceCapability is null");
            iBaseResponseCallback.a(0, null);
            return;
        }
        if (deviceCapability.isSupportMarketFace() && !Utils.o()) {
            LogUtil.a("AppMarketUtil", "showAppMarket, deviceCapability isSupportMarketFace and not oversea");
            iBaseResponseCallback.a(1, null);
            return;
        }
        if (c()) {
            LogUtil.j("AppMarketUtil", "showAppMarket, not login");
            iBaseResponseCallback.a(0, null);
        } else if (a(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010))) {
            LogUtil.j("AppMarketUtil", "countryCode is not support");
            iBaseResponseCallback.a(0, null);
        } else if (!deviceCapability.isSupportMarketParams()) {
            LogUtil.j("AppMarketUtil", "showAppMarket, deviceCapability is not support MarketParams");
            iBaseResponseCallback.a(0, null);
        } else {
            LogUtil.a("AppMarketUtil", "showAppMarket, deviceCapability isSupportMarketParams");
            iBaseResponseCallback.a(1, null);
        }
    }

    private boolean c() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo) || "0".equals(accountInfo)) {
            return true;
        }
        LogUtil.a("AppMarketUtil", "isNotLogin, userId is normal value, so has login");
        return false;
    }

    public SpannableString e(ClickableSpan clickableSpan, ClickableSpan clickableSpan2) {
        String string = BaseApplication.getContext().getString(R.string.IDS_application_market_internet);
        String string2 = BaseApplication.getContext().getString(R.string.IDS_application_market_storage);
        String string3 = BaseApplication.getContext().getString(R.string.IDS_application_market_user_agreement);
        String string4 = BaseApplication.getContext().getString(R.string.IDS_application_market_privacy_agreement);
        String string5 = BaseApplication.getContext().getString(R.string.IDS_application_market_privacy_content_statement, string, string2, string3, string4);
        if (qrs.ah(BaseApplication.getContext())) {
            string5 = BaseApplication.getContext().getString(R.string.IDS_app_market_pad_privacy_statement, string, string2, string3, string4);
        }
        SpannableString spannableString = new SpannableString(string5);
        int iIndexOf = spannableString.toString().indexOf(string);
        if (iIndexOf != -1) {
            spannableString.setSpan(new StyleSpan(1), iIndexOf, string.length() + iIndexOf, 17);
        }
        int iIndexOf2 = spannableString.toString().indexOf(string2);
        if (iIndexOf2 != -1) {
            spannableString.setSpan(new StyleSpan(1), iIndexOf2, string2.length() + iIndexOf2, 17);
        }
        int iIndexOf3 = spannableString.toString().indexOf(string3);
        if (iIndexOf3 != -1) {
            spannableString.setSpan(Integer.valueOf(BaseApplication.getContext().getResources().getColor(R.color.common_colorAccent_pressed)), iIndexOf3, string3.length() + iIndexOf3, 33);
            spannableString.setSpan(clickableSpan, iIndexOf3, string3.length() + iIndexOf3, 17);
        }
        int iIndexOf4 = spannableString.toString().indexOf(string4);
        if (iIndexOf4 != -1) {
            spannableString.setSpan(Integer.valueOf(BaseApplication.getContext().getResources().getColor(R.color.common_colorAccent_pressed)), iIndexOf4, string4.length() + iIndexOf4, 33);
            spannableString.setSpan(clickableSpan2, iIndexOf4, string4.length() + iIndexOf4, 17);
        }
        return spannableString;
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("AppMarketUtil", "countryCode is empty");
            return true;
        }
        for (String str2 : BaseApplication.getContext().getResources().getStringArray(com.huawei.hwdevicemgr.R.array.not_support_app_market_code)) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public void d(final IBaseResponseCallback iBaseResponseCallback) {
        if (Utils.k()) {
            LogUtil.a("AppMarketUtil", "is oversea and no cloud");
            if (!SharedPreferenceManager.d(BaseApplication.getContext())) {
                a(iBaseResponseCallback, 0);
                return;
            } else {
                a(iBaseResponseCallback, 1);
                return;
            }
        }
        mhs.a().getSwitchSetting("app_market_privacy_service_status", new IBaseResponseCallback() { // from class: lzf.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("DEVMGR_AppMarketUtil", "showAppMarketView errorCode :", Integer.valueOf(i));
                if (i == 0 && (obj instanceof String)) {
                    String str = (String) obj;
                    ReleaseLogUtil.d("DEVMGR_AppMarketUtil", "appmarket_service_status :", str);
                    if ("2".equals(str)) {
                        SharedPreferenceManager.c(BaseApplication.getContext(), false);
                        lzf.this.a(iBaseResponseCallback, 0);
                        return;
                    } else {
                        SharedPreferenceManager.c(BaseApplication.getContext(), true);
                        lzf.this.a(iBaseResponseCallback, 1);
                        return;
                    }
                }
                if (!SharedPreferenceManager.d(BaseApplication.getContext())) {
                    lzf.this.a(iBaseResponseCallback, 0);
                } else {
                    lzf.this.a(iBaseResponseCallback, 1);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IBaseResponseCallback iBaseResponseCallback, int i) {
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i, null);
        }
    }

    public static lzf a() {
        return a.f41191a;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final lzf f41191a = new lzf();
    }

    public static String c(String str) {
        return BaseApplication.getAppPackage() + "." + str;
    }

    public static String b(String str) {
        return str + "_deviceinfo";
    }

    public static void a(Context context, Intent intent, String str) {
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.a("AppMarketUtil", str, ": ActivityNotFoundException");
        }
    }

    public static String b() {
        return CompileParameterUtil.e("CONTENT_CENTER_TEST");
    }

    public static String e(String str) {
        return (!TextUtils.isEmpty(str) && str.length() > 3) ? str.substring(str.length() - 3) : str;
    }
}
