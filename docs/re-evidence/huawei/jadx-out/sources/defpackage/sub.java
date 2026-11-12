package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.AppRouterResultReceiver;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.core.AppRouterHandleException;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.homehealth.R;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CompileParameterUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class sub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String[] f48698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f48699b;
    private static String[] i;
    private static final String[] d = {"https://url.cloud.huawei.com/1Lfn1eswP6?a=", "https://urldre.cloud.huawei.com/97J6mTfn5S?a=", "https://url.cloud.huawei.com/a1jJk451Uk", "https://urldre.cloud.huawei.com/a1mpQudURi", "http://contentcenter-drcn.platform.hicloud.com/cch5/health/qr/qr.html", "https://url.cloud.huawei.com/1xbRdNHELC"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String[] f48700c = null;
    private static String[] e = null;

    public static boolean f(String str) {
        return c(str, d);
    }

    public static boolean i(String str) {
        if (i == null) {
            i = BaseApplication.b().getResources().getStringArray(R.array.user_guid_urls);
        }
        return c(str, i);
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("QrCodeUtils", "isAccountUrl url is empty.");
            return false;
        }
        for (String str2 : BaseApplication.b().getResources().getStringArray(R.array.account_qr_code_urls)) {
            if (str.toUpperCase(Locale.ENGLISH).contains(str2.toUpperCase(Locale.ENGLISH))) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(String str) {
        if (f48698a == null) {
            f48698a = BaseApplication.b().getResources().getStringArray(R.array.H5_URLS);
        }
        return c(str, f48698a);
    }

    public static boolean c(String str) {
        if (f48699b == null) {
            f48699b = BaseApplication.b().getResources().getStringArray(R.array.download_app_urls);
        }
        return c(str, f48699b);
    }

    private static boolean c(String str, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : strArr) {
            if (str.toUpperCase(Locale.ENGLISH).startsWith(str2.toUpperCase(Locale.ENGLISH))) {
                return true;
            }
        }
        return false;
    }

    public static String d(String str, String str2) {
        int length;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return "";
        }
        String str3 = "&" + str + "=";
        int iIndexOf = str2.indexOf(str3);
        if (iIndexOf == -1 || (length = iIndexOf + str3.length()) >= str2.length()) {
            return "";
        }
        String strSubstring = str2.substring(length);
        if (strSubstring.startsWith("&")) {
            return "";
        }
        int iIndexOf2 = strSubstring.indexOf("&");
        return iIndexOf2 == -1 ? strSubstring : strSubstring.substring(0, iIndexOf2);
    }

    public static void a(Activity activity) {
        qpx.e(BaseApplication.b(), R.string.IDS_device_wifi_my_qrcode_error_qrcode);
        if (activity == null) {
            LogUtil.j("QrCodeUtils", "linkError() activity is null");
        } else {
            activity.finish();
        }
    }

    public static void e(Activity activity) {
        qpx.e(BaseApplication.b(), R.string.IDS_device_wifi_my_qrcode_overdue);
        if (activity == null) {
            LogUtil.j("QrCodeUtils", "linkExpired() activity is null");
        } else {
            activity.finish();
        }
    }

    public static boolean a(Context context) {
        if (context == null) {
            LogUtil.j("QrCodeUtils", "isMainActivityJumpDirectly context is null");
            return false;
        }
        boolean zEquals = "not_jump_directly".equals(SharedPreferenceManager.e(context, Integer.toString(10000), "SP_SCHEME_MAIN_ACTIVITY_JUMP_DIRECTLY"));
        if (!zEquals) {
            SharedPreferenceManager.e(context, Integer.toString(10000), "SP_SCHEME_MAIN_ACTIVITY_JUMP_DIRECTLY", "not_jump_directly", null);
        }
        return zEquals && AuthorizationUtils.c(context);
    }

    public static void a(Context context, Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(BleConstants.KEY_PATH);
        LogUtil.a("QrCodeUtils", "handleDeepLink queryParameter=", str);
        if (TextUtils.isEmpty(queryParameter)) {
            LogUtil.j("QrCodeUtils", "handleDeepLink path == null");
            return;
        }
        String strSubstring = str.substring(str.indexOf(queryParameter));
        int iIndexOf = strSubstring.indexOf("&");
        int iIndexOf2 = strSubstring.indexOf("?");
        LogUtil.a("QrCodeUtils", "first '&' index is:", Integer.valueOf(iIndexOf), " first '?' index is:", Integer.valueOf(iIndexOf2));
        if (iIndexOf != -1 && (iIndexOf2 == -1 || iIndexOf < iIndexOf2)) {
            strSubstring = strSubstring.replaceFirst("&", "?");
        }
        try {
            AppRouter.e(Uri.parse("huaweischeme://healthapp/" + strSubstring)).a(context, c(context, strSubstring));
        } catch (AppRouterHandleException e2) {
            ReleaseLogUtil.a("R_QrCode_QrCodeUtils", "handleDeepLink path:", strSubstring, ", exception:", e2.getMessage());
        }
    }

    private static AppRouterResultReceiver c(final Context context, final String str) {
        return new AppRouterResultReceiver() { // from class: sub.2
            @Override // com.huawei.haf.router.AppRouterResultReceiver
            public void a(Guidepost guidepost, int i2) {
                LogUtil.a("QrCodeUtils", "handleDeepLink onRouteResult, resultCode=", Integer.valueOf(i2));
                if (i2 != 10) {
                    sub.d(context);
                }
            }

            @Override // com.huawei.haf.router.AppRouterResultReceiver, com.huawei.haf.router.NaviPluginCallback
            public void onPluginFound(Guidepost guidepost, String str2) {
                LogUtil.a("QrCodeUtils", "handleDeepLink onPluginFound, pluginName=", str2);
            }

            @Override // com.huawei.haf.router.AppRouterResultReceiver, com.huawei.haf.router.NaviPluginCallback
            public void onPluginLost(Guidepost guidepost, String str2) {
                LogUtil.a("QrCodeUtils", "handleDeepLink onPluginLost, pluginName=", str2);
                sub.d(context);
            }

            @Override // com.huawei.haf.router.AppRouterResultReceiver, com.huawei.haf.router.NaviPluginCallback
            public void onPluginNone(Guidepost guidepost) {
                LogUtil.a("QrCodeUtils", "handleDeepLink onPluginNone, pathQuery=", str);
                sub.d(context);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context) {
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    public static boolean j(String str) {
        if (f48700c == null) {
            f48700c = BaseApplication.b().getResources().getStringArray(R.array.special_qr_code_urls);
            String strE = CompileParameterUtil.e("APP_DOWNLOAD_SPECIAL_QR_CODE_URL");
            if (!TextUtils.isEmpty(strE)) {
                String[] strArr = f48700c;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
                f48700c = strArr2;
                strArr2[strArr2.length - 1] = strE;
            }
        }
        return c(str, f48700c);
    }

    public static boolean d(String str) {
        Uri uri = Uri.parse(str);
        String path = uri.getPath();
        String query = uri.getQuery();
        LogUtil.a("QrCodeUtils", "isShortcutDownloadUrl, path=", path, "  ", query);
        return ("/1Lfn1eswP6".equals(path) || "/97J6mTfn5S".equals(path)) && TextUtils.isEmpty(query);
    }

    public static boolean a(String str) {
        if (e == null) {
            e = BaseApplication.b().getResources().getStringArray(R.array.OTHER_DEVICE_URL);
        }
        return c(str, e);
    }
}
