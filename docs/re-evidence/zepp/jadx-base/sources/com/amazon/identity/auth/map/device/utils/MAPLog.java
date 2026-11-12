package com.amazon.identity.auth.map.device.utils;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.identity.auth.device.utils.DefaultLibraryInfo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class MAPLog {
    private static final String ENG = "eng";
    private static final int FLAVOR_INDEX = 2;
    public static boolean IS_FIRST_PARTY_DEBUG_BUILD = isFirstPartyDebugBuild();
    private static final String LOG_TAG = "com.amazon.identity.auth.map.device.utils.MAPLog";
    private static final String LOG_TAG_PII = "com.amazon.identity.pii";
    private static final String MATCHER_PATTERN = "^(?:(.*?)_)??(?:([^_]*)_)?([0-9]+)$";
    private static final String NO_MESSAGE = "N/A";
    private static final int NUM_GROUPS = 3;
    private static final String OBSCURED = "<obscured>";
    private static final String PII_STRING = ".PII";
    private static final String SEPARATOR = ":";
    private static final String USERDEBUG = "userdebug";

    public static int d(String str, String str2) {
        return Log.d(str, str2);
    }

    public static int e(String str, String str2) {
        return Log.e(str, str2);
    }

    public static String getStackTraceString(Throwable th) {
        return Log.getStackTraceString(th);
    }

    private static String getUpdatedMessage(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer(str);
        if (!TextUtils.isEmpty(str2)) {
            stringBuffer.append(":");
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    public static int i(String str, String str2) {
        return Log.i(str, str2);
    }

    private static boolean isFirstPartyDebugBuild() {
        try {
            String str = Build.VERSION.INCREMENTAL;
            if (TextUtils.isEmpty(str)) {
                w(LOG_TAG, "Incremental version was empty");
                return false;
            }
            Pattern patternCompile = Pattern.compile(MATCHER_PATTERN);
            String str2 = LOG_TAG;
            pii(str2, "Extracting verison incremental", "Build.VERSION.INCREMENTAL: " + str);
            Matcher matcher = patternCompile.matcher(str);
            if (!matcher.find()) {
                pii(str2, "Incremental version '%s' was in invalid format.", "ver=" + str);
                return false;
            }
            if (matcher.groupCount() < 3) {
                e(str2, "Error parsing build version string.");
                return false;
            }
            String strGroup = matcher.group(2);
            pii(str2, "Extracting flavor", "Build flavor: " + strGroup);
            if (!TextUtils.isEmpty(strGroup) && (strGroup.equals(USERDEBUG) || strGroup.equals(ENG))) {
                i(str2, "MAP is running on 1st party debug");
                return true;
            }
            return false;
        } catch (Exception e) {
            e(LOG_TAG, e.getMessage(), e);
        }
    }

    public static boolean isLoggable(String str, int i) {
        return Log.isLoggable(str, i);
    }

    private static int logPii(String str, String str2, String str3, Throwable th, int i) {
        if (th != null) {
            return i == 4 ? Log.i(str, getUpdatedMessage(str2, str3), th) : Log.d(str, getUpdatedMessage(str2, str3), th);
        }
        return i == 4 ? Log.i(str, getUpdatedMessage(str2, str3)) : Log.d(str, getUpdatedMessage(str2, str3));
    }

    public static int pii(String str, String str2, String str3) {
        return pii(str, str2, str3, null);
    }

    public static int println(int i, String str, String str2) {
        return Log.println(i, str, str2);
    }

    public static int v(String str, String str2) {
        return Log.v(str, str2);
    }

    public static int w(String str, String str2) {
        return Log.w(str, str2);
    }

    public static int wtf(String str, Throwable th) {
        return Log.wtf(str, th);
    }

    public static int d(String str, String str2, Throwable th) {
        return Log.d(str, str2, th);
    }

    public static int e(String str, String str2, Throwable th) {
        return Log.e(str, str2, th);
    }

    public static int i(String str, String str2, Throwable th) {
        return Log.i(str, str2, th);
    }

    public static int pii(String str, String str2, String str3, Throwable th) {
        if (str == null) {
            str = "NULL_TAG";
        }
        String str4 = str + PII_STRING;
        char c = 3;
        if (IS_FIRST_PARTY_DEBUG_BUILD) {
            c = 4;
        } else {
            if (DefaultLibraryInfo.isProd() && Log.isLoggable(LOG_TAG_PII, 3)) {
                return logPii(str4, str2, str3, th, 3);
            }
            if (!DefaultLibraryInfo.isProd()) {
                return logPii(str4, str2, str3, th, 3);
            }
            str3 = OBSCURED;
        }
        if (th != null) {
            return c == 4 ? Log.i(str4, getUpdatedMessage(str2, str3), th) : Log.d(str4, getUpdatedMessage(str2, str3), th);
        }
        return c == 4 ? Log.i(str4, getUpdatedMessage(str2, str3)) : Log.d(str4, getUpdatedMessage(str2, str3));
    }

    public static int v(String str, String str2, Throwable th) {
        return Log.v(str, str2, th);
    }

    public static int w(String str, Throwable th) {
        return Log.w(str, "N/A", th);
    }

    public static int wtf(String str, String str2) {
        return Log.wtf(str, str2);
    }

    public static int w(String str, String str2, Throwable th) {
        return Log.w(str, str2, th);
    }

    public static int wtf(String str, String str2, Throwable th) {
        return Log.wtf(str, str2, th);
    }
}
