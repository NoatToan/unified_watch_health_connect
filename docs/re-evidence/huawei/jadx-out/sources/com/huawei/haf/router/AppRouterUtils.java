package com.huawei.haf.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.core.AppRouterHelper;
import com.huawei.haf.router.facade.service.ExtrasFormatService;
import health.compact.a.LogUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AppRouterUtils {
    private AppRouterUtils() {
    }

    public static Map<String, String> a(Uri uri) {
        if (uri == null) {
            return Collections.EMPTY_MAP;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        int i = 0;
        do {
            int iIndexOf = encodedQuery.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = encodedQuery.length();
            }
            int iIndexOf2 = encodedQuery.indexOf(61, i);
            if (iIndexOf2 > iIndexOf || iIndexOf2 == -1) {
                iIndexOf2 = iIndexOf;
            }
            String strSubstring = encodedQuery.substring(i, iIndexOf2);
            if (!TextUtils.isEmpty(strSubstring)) {
                map.put(Uri.decode(strSubstring), Uri.decode(iIndexOf2 == iIndexOf ? "" : encodedQuery.substring(iIndexOf2 + 1, iIndexOf)));
            }
            i = iIndexOf + 1;
        } while (i < encodedQuery.length());
        return map;
    }

    public static Uri b(Intent intent) {
        if (intent == null) {
            return null;
        }
        Uri uri = (Uri) intent.getParcelableExtra("NTwe23AtQb8U");
        return uri != null ? uri : intent.getData();
    }

    public static boolean a(Intent intent) {
        return (intent == null || intent.getBundleExtra("FT3uI8SpK7Be") == null) ? false : true;
    }

    public static void b(Context context, Intent intent) {
        intent.setExtrasClassLoader(BaseApplication.b().getClassLoader());
        Bundle bundleExtra = intent.getBundleExtra("FT3uI8SpK7Be");
        if (bundleExtra == null) {
            LogUtil.e("HAF_AppRouterUtils", "bundle == null, intent=", intent);
        } else {
            intent.removeExtra("FT3uI8SpK7Be");
            AppRouterResultReceiver.c(context, bundleExtra);
        }
    }

    public static void e(Intent intent, Guidepost guidepost, NaviCallback naviCallback) {
        intent.putExtra("FT3uI8SpK7Be", AppRouterResultReceiver.e(guidepost, naviCallback));
    }

    public static boolean b(Guidepost guidepost) {
        return (guidepost.h() & 2097152) == 2097152;
    }

    public static boolean c(Guidepost guidepost) {
        return (guidepost.h() & 33554432) == 33554432;
    }

    public static boolean d(Guidepost guidepost) {
        return (guidepost.h() & 16777216) == 16777216;
    }

    public static boolean e(Guidepost guidepost) {
        return (guidepost.h() & 67108864) == 67108864;
    }

    public static String e(String str) {
        int iIndexOf;
        if (TextUtils.isEmpty(str) || str.charAt(0) != '/' || (iIndexOf = str.indexOf(47, 1)) == -1) {
            return "";
        }
        return str.substring(1, iIndexOf);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    public static int b(String str) {
        int iC;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (String str2 : str.toUpperCase(Locale.ENGLISH).split("\\|")) {
            if (!TextUtils.isEmpty(str2)) {
                str2.hashCode();
                switch (str2) {
                    case "DOWNLOAD_AUTO":
                        iC = 4194304;
                        break;
                    case "DOWNLOAD_TIPS":
                        iC = 2097152;
                        break;
                    case "DOWNLOAD_IGNORE":
                        iC = 1048576;
                        break;
                    case "CHINA":
                        iC = 33554432;
                        break;
                    case "LOGIN":
                        iC = 16777216;
                        break;
                    case "MULTIPLE_INSTANCES":
                        iC = 65536;
                        break;
                    case "COLDSTART":
                        iC = 67108864;
                        break;
                    case "RUNNING_PROCESS":
                        iC = 131072;
                        break;
                    default:
                        iC = c(str2);
                        break;
                }
                i |= iC;
            }
        }
        return i;
    }

    private static int c(String str) {
        int iFromExtrasString;
        if (str.startsWith("0X")) {
            try {
                iFromExtrasString = Integer.parseInt(str.substring(2), 16);
            } catch (NumberFormatException e) {
                LogUtil.e("HAF_AppRouterUtils", "parseCustomExtras ex=", LogUtil.c(e));
            }
        } else {
            ExtrasFormatService extrasFormatService = (ExtrasFormatService) AppRouterHelper.a(ExtrasFormatService.class);
            iFromExtrasString = extrasFormatService != null ? extrasFormatService.fromExtrasString(str) : 0;
        }
        int i = iFromExtrasString & 65535;
        if (i == 0) {
            LogUtil.e("HAF_AppRouterUtils", "parseCustomExtras error, strExtras=", str);
        }
        return i;
    }

    public static String a(int i) {
        if (i <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(32);
        if ((i & 65536) == 65536) {
            c(sb, "MULTIPLE_INSTANCES");
        }
        if ((i & 131072) == 131072) {
            c(sb, "RUNNING_PROCESS");
        }
        if ((i & 1048576) == 1048576) {
            c(sb, "DOWNLOAD_IGNORE");
        }
        if ((i & 2097152) == 2097152) {
            c(sb, "DOWNLOAD_TIPS");
        }
        if ((i & 4194304) == 4194304) {
            c(sb, "DOWNLOAD_AUTO");
        }
        if ((i & 16777216) == 16777216) {
            c(sb, "LOGIN");
        }
        if ((i & 33554432) == 33554432) {
            c(sb, "CHINA");
        }
        if ((i & 67108864) == 67108864) {
            c(sb, "COLDSTART");
        }
        a(sb, i & 65535);
        return sb.toString();
    }

    private static void a(StringBuilder sb, int i) {
        if (i > 0) {
            ExtrasFormatService extrasFormatService = (ExtrasFormatService) AppRouterHelper.a(ExtrasFormatService.class);
            String customString = extrasFormatService != null ? extrasFormatService.formatCustomString(i) : null;
            if (!TextUtils.isEmpty(customString)) {
                c(sb, customString);
                return;
            }
            c(sb, "0X" + Integer.toHexString(i).toUpperCase(Locale.ENGLISH));
        }
    }

    private static void c(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('|');
        }
        sb.append(str);
    }
}
