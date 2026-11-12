package com.huawei.health.h5pro.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Window;
import android.webkit.MimeTypeMap;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URLConnection;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class GeneralUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f6990c = Pattern.compile("^[-\\+]?[\\d]*$");
    private static int e = 0;

    private GeneralUtil() {
    }

    public static <T> T getReferent(WeakReference<T> weakReference) {
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static boolean isSafePath(String str) {
        return (TextUtils.isEmpty(str) || str.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE)) ? false : true;
    }

    public static String getFileSafePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String path = Uri.parse(str).getPath();
        return TextUtils.isEmpty(path) ? "" : getFileSafePath(new File(path));
    }

    public static String getFileSafePath(File file) {
        if (file == null) {
            return "";
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException e2) {
            LogUtil.e("H5PRO_GeneralUtil", "getFileSafePath: ioException-> " + e2.getMessage());
            return "";
        }
    }

    public static boolean isNumbers(String str) {
        return !TextUtils.isEmpty(str) && f6990c.matcher(str).matches();
    }

    public static boolean isShouldSelfProtection(Context context, String str, String[] strArr, boolean z) {
        if (TextUtils.isEmpty(str) || context == null || strArr == null || strArr.length == 0) {
            return false;
        }
        for (String str2 : strArr) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return z;
    }

    public static String getMimeType(String str) {
        String contentTypeFor;
        if (TextUtils.isEmpty(str)) {
            LogUtil.w("H5PRO_GeneralUtil", "getMimeType: url is empty");
            return "";
        }
        if (str.contains("#")) {
            str = str.replace("#", "%23");
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            contentTypeFor = "";
        } else {
            contentTypeFor = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            if (!TextUtils.isEmpty(contentTypeFor)) {
                return contentTypeFor;
            }
        }
        LogUtil.w("H5PRO_GeneralUtil", "getMimeType: extension failed -> " + str);
        try {
            contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str);
        } catch (StringIndexOutOfBoundsException e2) {
            LogUtil.e("H5PRO_GeneralUtil", "getMimeType: exception -> " + e2.getMessage());
        }
        if (!TextUtils.isEmpty(contentTypeFor)) {
            return contentTypeFor;
        }
        LogUtil.w("H5PRO_GeneralUtil", "getMimeType: mimeType is empty -> " + str);
        return "";
    }

    public static int getHostAppVersionCode(Context context) {
        PackageInfo packageInfo;
        synchronized (GeneralUtil.class) {
            int i = e;
            if (i == 0 && context != null) {
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException e2) {
                    LogUtil.e("H5PRO_GeneralUtil", "getHostAppVersionCode: exception -> " + e2.getMessage());
                    packageInfo = null;
                }
                int i2 = packageInfo != null ? packageInfo.versionCode : 0;
                e = i2;
                return i2;
            }
            return i;
        }
    }

    public static void setAppearanceLightStatusBars(Activity activity, boolean z) {
        if (activity == null || activity.getApplicationInfo().targetSdkVersion < 35) {
            return;
        }
        Window window = activity.getWindow();
        if (window == null) {
            LogUtil.w("H5PRO_GeneralUtil", "setAppearanceLightStatusBars: window is null");
            return;
        }
        WindowInsetsControllerCompat windowInsetsController = ViewCompat.getWindowInsetsController(window.getDecorView());
        if (windowInsetsController == null) {
            windowInsetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        }
        windowInsetsController.setAppearanceLightStatusBars(z);
    }
}
