package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hihealth.util.HiScopeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.operation.utils.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes10.dex */
public class lpu {
    public static boolean c(Uri uri) {
        String queryParameter = uri.getQueryParameter("client_id");
        Map<String, String> mapA = a();
        HashMap map = new HashMap();
        map.put("appId", queryParameter);
        lpz lpzVar = (lpz) oet.d().b(GRSManager.c(BaseApplication.getContext()).getUrl(HealthEngineRequestManager.GRS_KEY) + "/healthkit-healthapp/v1/appInfos", mapA, map, lpz.class);
        if (lpzVar == null) {
            ReleaseLogUtil.a("R_HiH_AutoLoginUtils", "isAuthPermitted, thirdAuthPermissionRsp is null");
            return false;
        }
        if (CollectionUtils.a(lpzVar.b())) {
            ReleaseLogUtil.a("R_HiH_AutoLoginUtils", "isAuthPermitted, appInfos size is 0");
            return false;
        }
        return "true".equals(lpzVar.b().get(0).a());
    }

    public static String b(Uri uri) {
        String queryParameter = uri.getQueryParameter("scope");
        HashMap map = new HashMap();
        try {
            String strReplace = URLEncoder.encode(queryParameter, StandardCharsets.UTF_8.name()).replace(Marker.ANY_NON_NULL_MARKER, Constants.PERCENT_20);
            Map<String, String> mapA = a();
            lpt lptVar = (lpt) oet.d().b(GRSManager.c(BaseApplication.getContext()).getUrl(HealthEngineRequestManager.GRS_KEY) + "/healthkit-healthapp/v1/healthScopes?originalScopes=" + strReplace, mapA, map, lpt.class);
            if (lptVar == null) {
                ReleaseLogUtil.a("R_HiH_AutoLoginUtils", "getScopes, getScopeRsp is null");
                return null;
            }
            if (TextUtils.isEmpty(lptVar.d())) {
                ReleaseLogUtil.a("R_HiH_AutoLoginUtils", "getScopes, healthScopes is empty");
                return null;
            }
            return lptVar.d();
        } catch (UnsupportedEncodingException unused) {
            ReleaseLogUtil.a("R_HiH_AutoLoginUtils", "getScopes, encode scopes error");
            return null;
        }
    }

    public static String d(Uri uri, String str, Context context) {
        String strC = c(uri, context, str);
        if (TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.a("R_HiH_AutoLoginUtils", "getOAuthUrl, queryUrl is empty");
            return "";
        }
        HashMap map = new HashMap();
        map.put("Content-type", "application/x-www-form-urlencoded");
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015));
        String str2 = (String) oet.d().b(GRSManager.c(BaseApplication.getContext()).getUrl("domainMyHuaweiOauthLogin") + "/oauth2/v3/authorize?" + strC, map, null, String.class);
        if (TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.a("R_HiH_AutoLoginUtils", "getOAuthUrl, OAuthPage is empty");
            return null;
        }
        return GRSManager.c(BaseApplication.getContext()).getUrl("domainMyHuaweiOauthLogin") + a(str2) + (b(context) ? "&forceDarkMode=1" : "") + "&isImmerse&showStatusBar&statusBarTextBlack";
    }

    private static String a(String str) {
        int iIndexOf = str.indexOf("action");
        if (iIndexOf < 0) {
            ReleaseLogUtil.a("R_HiH_AutoLoginUtils", "parseOAuthPage, can't find attribute of action");
            return "";
        }
        int iIndexOf2 = str.indexOf("\"", iIndexOf) + 1;
        int iIndexOf3 = str.indexOf("\"", iIndexOf2);
        if (iIndexOf2 <= 0 || iIndexOf2 > iIndexOf3) {
            ReleaseLogUtil.a("R_HiH_AutoLoginUtils", "parseOAuthPage, can't find action");
            return "";
        }
        String strSubstring = str.substring(iIndexOf2, iIndexOf3);
        if (!TextUtils.isEmpty(strSubstring)) {
            return strSubstring;
        }
        ReleaseLogUtil.a("R_HiH_AutoLoginUtils", "parseOAuthPage, can't find value of action");
        return "";
    }

    private static String c(Uri uri, Context context, String str) {
        String strEncode;
        StringBuilder sb = new StringBuilder("client_id=");
        try {
            String strEncode2 = URLEncoder.encode(str, StandardCharsets.UTF_8.name());
            if (CommonUtil.cl()) {
                strEncode = URLEncoder.encode(GRSManager.c(BaseApplication.getContext()).getUrl("domainOAuthLogin") + "/sandbox/cch5/healthkit/oauth-h5/oauth-callback.html", StandardCharsets.UTF_8.name());
            } else {
                strEncode = URLEncoder.encode(GRSManager.c(BaseApplication.getContext()).getUrl("domainOAuthLogin") + "/cch5/healthkit/oauth-h5/oauth-callback.html", StandardCharsets.UTF_8.name());
            }
            String strReplace = strEncode2.replace(Marker.ANY_NON_NULL_MARKER, Constants.PERCENT_20);
            sb.append(uri.getQueryParameter("client_id"));
            sb.append("&response_type=code&isNeedLogin=true&access_type=offline&display=touch&redirect_uri=");
            sb.append(strEncode);
            sb.append("&scope=");
            sb.append(strReplace);
            sb.append("&");
            String queryParameter = uri.getQueryParameter("state");
            if (!TextUtils.isEmpty(queryParameter)) {
                sb.append("state=");
                sb.append(queryParameter);
                sb.append("&");
            }
            boolean zB = b(context);
            sb.append("themeName=");
            sb.append(zB ? "dark" : CervicalMucusRecord.Sensation.LIGHT);
            sb.append("&lang=");
            String strZ = CommonUtil.z();
            if ("zh-CHT".equals(strZ)) {
                strZ = "zh-Hant";
            }
            sb.append(strZ);
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            ReleaseLogUtil.a("R_HiH_AutoLoginUtils", "getQueryUrl, encode scopes error, scopes:" + str);
            return "";
        }
    }

    private static boolean b(Context context) {
        if (context != null) {
            return Build.VERSION.SDK_INT > 28 && (context.getResources().getConfiguration().uiMode & 48) == 32;
        }
        LogUtil.j("AutoLoginUtils", "isDarkMode, contxet is null");
        return false;
    }

    private static Map<String, String> a() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015);
        HashMap map = new HashMap(16);
        map.put("Content-type", "application/json");
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + accountInfo);
        map.put("x-client-id", HiScopeUtil.b(BaseApplication.getContext(), BaseApplication.getContext().getPackageName()));
        map.put(CloudParamKeys.X_TS, String.valueOf(System.currentTimeMillis()));
        map.put("x-version", CommonUtil.c(BaseApplication.getContext()));
        map.put("x-caller-trace-id", String.valueOf(ltb.h()) + Math.random());
        return map;
    }

    public static void b(String str) {
        HashMap map = new HashMap();
        map.put("appId", str);
        map.put("cacheable", "false");
        oet.d().e(GRSManager.c(BaseApplication.getContext()).getUrl(HealthEngineRequestManager.GRS_KEY) + "/healthkit-healthapp/v1/thirdAuthInfos", a(), map, lps.class, new ResultCallback<lps>() { // from class: lpu.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(lps lpsVar) {
                ReleaseLogUtil.d("R_HiH_AutoLoginUtils", "refreshAuthInfo, refreshAuthInfo succeed");
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.e("R_HiH_AutoLoginUtils", "refreshAuthInfo, refreshAuthInfo fail");
            }
        });
    }
}
