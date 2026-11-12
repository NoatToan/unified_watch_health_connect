package com.amazon.identity.auth.device.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import com.amazon.identity.auth.device.dataobject.Scope;
import com.amazon.identity.auth.device.datastore.DatabaseHelper;
import com.amazon.identity.auth.map.device.utils.MAPLog;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class MAPUtils {
    private static final String AMAZON_HOST = ".amazon.";
    private static final String HOST_TYPE = "host.type";
    private static final String LOG_TAG = "com.amazon.identity.auth.device.utils.MAPUtils";
    private static SQLiteDatabase MAPdatabase = null;
    private static final String PATH_AP = "/ap/";
    private static final String PATH_AP_FORGOT_PASSWORD = "/ap/forgotpassword";
    private static final String PATH_GP = "/gp/yourstore/home";
    private static final String PROTOCOL = "http";

    public enum SCOPE_MODIFIER {
        LOCAL,
        REMOTE,
        ALL
    }

    private MAPUtils() throws Exception {
        throw new Exception("This class is not instantiable!");
    }

    public static boolean areScopesLocalAndValid(AppInfo appInfo, String[] strArr) {
        return areScopesValid(appInfo, strArr, SCOPE_MODIFIER.LOCAL);
    }

    public static boolean areScopesRemoteAndValid(AppInfo appInfo, String[] strArr) {
        return areScopesValid(appInfo, strArr, SCOPE_MODIFIER.REMOTE);
    }

    public static boolean areScopesValid(AppInfo appInfo, String[] strArr) {
        return areScopesValid(appInfo, strArr, SCOPE_MODIFIER.ALL);
    }

    public static boolean contains(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static SQLiteDatabase deleteDatabase(Context context) {
        try {
            String str = LOG_TAG;
            MAPLog.d(str, "deleteDatabase so we can create it from scratch");
            MAPLog.d(str, "deleteDatabase was successful : " + context.deleteDatabase(DatabaseHelper.MAP_DB_NAME));
        } catch (SQLiteException e) {
            MAPLog.d(LOG_TAG, "deleteDatabase exception: " + e.getMessage());
        }
        return MAPdatabase;
    }

    public static String getAppName(Context context) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : context.getPackageName());
    }

    public static String getDeviceId() {
        return "some-device-id";
    }

    public static String getHostType(Context context, String str) {
        String string = "www";
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.containsKey(HOST_TYPE)) {
                return "www";
            }
            string = applicationInfo.metaData.getString(HOST_TYPE);
            MAPLog.pii(LOG_TAG, "Host Type", "hostType=" + string + " package=" + str);
            return string;
        } catch (PackageManager.NameNotFoundException unused) {
            MAPLog.d(LOG_TAG, "No host type found in package " + str);
            return string;
        }
    }

    public static synchronized SQLiteDatabase getMAPdatabase(Context context) {
        if (MAPdatabase == null) {
            try {
                MAPdatabase = new DatabaseHelper(context).getWritableDatabase();
            } catch (SQLiteException unused) {
                deleteDatabase(context);
                MAPdatabase = new DatabaseHelper(context).getWritableDatabase();
            }
        }
        return MAPdatabase;
    }

    public static Set<String> getSetDifference(String[] strArr, String[] strArr2) {
        if (strArr == null) {
            return new HashSet();
        }
        if (strArr2 == null) {
            return new HashSet(Arrays.asList(strArr));
        }
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        hashSet.removeAll(Arrays.asList(strArr2));
        return hashSet;
    }

    public static String getVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            MAPLog.w(LOG_TAG, "Unable to get verison info from app" + e.getMessage());
            return ACRAConstants.NOT_AVAILABLE;
        }
    }

    public static boolean isDevo(Context context) {
        if (context == null) {
            return false;
        }
        return getHostType(context, context.getPackageName()).equalsIgnoreCase("development");
    }

    public static boolean isMAPUrl(String str) {
        if (str == null) {
            MAPLog.i(LOG_TAG, "URL is null");
            return false;
        }
        try {
            URL url = new URL(str);
            String protocol = url.getProtocol();
            if (!TextUtils.isEmpty(protocol) && protocol.contains("http")) {
                String host = url.getHost();
                if (!TextUtils.isEmpty(host) && host.contains(AMAZON_HOST)) {
                    String path = url.getPath();
                    boolean zIsEmpty = TextUtils.isEmpty(path);
                    boolean zStartsWith = path.startsWith(PATH_AP);
                    boolean zEquals = path.equals(PATH_GP);
                    boolean zEquals2 = path.equals(PATH_AP_FORGOT_PASSWORD);
                    MAPLog.d(LOG_TAG, " isEmpty=" + zIsEmpty + "startsWithAP=" + zStartsWith + "equalsGP=" + zEquals + "equalsForgotPassword=" + zEquals2);
                    if (!zIsEmpty && ((zStartsWith && !zEquals2) || zEquals)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (MalformedURLException unused) {
            MAPLog.pii(LOG_TAG, "MalformedURLException", " url=" + str);
            return false;
        }
    }

    public static void resetDatabaseInstance() {
        MAPdatabase = null;
    }

    public static String toDelimitedString(String[] strArr, String str) {
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        int i = 0;
        String string = "";
        while (i < strArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(strArr[i].trim());
            sb.append(i == strArr.length + (-1) ? "" : str);
            string = sb.toString();
            i++;
        }
        return string;
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    public static String[] toStringArray(String str, String str2) {
        if (str == null || str.trim().length() <= 0) {
            return null;
        }
        return str.trim().split("[" + str2 + "]");
    }

    private static boolean areScopesValid(AppInfo appInfo, String[] strArr, SCOPE_MODIFIER scope_modifier) {
        String str = LOG_TAG;
        MAPLog.i(str, "areScopesValid : modifier=" + scope_modifier.name() + " scopes=" + Arrays.toString(strArr));
        if (strArr == null || strArr.length == 0) {
            MAPLog.w(str, "Scopes are invalid: array is either null or empty");
            return false;
        }
        if (appInfo == null || appInfo.getAllowedScopes() == null) {
            MAPLog.w(str, "Scopes are invalid: either appInfo is null or allowedScopes is null");
            return false;
        }
        HashSet hashSet = new HashSet(Arrays.asList(appInfo.getAllowedScopes()));
        MAPLog.i(str, "allowedScopeSet : " + hashSet);
        for (String str2 : strArr) {
            if (str2 == null || !hashSet.contains(str2)) {
                MAPLog.w(LOG_TAG, "Invalid scope: " + str2 + " (it's either null or not part of the allowed set)");
                return false;
            }
            if (scope_modifier == SCOPE_MODIFIER.REMOTE && Scope.isLocal(str2)) {
                MAPLog.w(LOG_TAG, "Invalid scope: " + str2 + " is local!");
                return false;
            }
            if (scope_modifier == SCOPE_MODIFIER.LOCAL && !Scope.isLocal(str2)) {
                MAPLog.w(LOG_TAG, "Invalid scope: " + str2 + " is remote!");
            }
        }
        return true;
    }
}
