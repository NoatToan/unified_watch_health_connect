package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes4.dex */
public final class ConnectionErrorMessages {
    private static final SimpleArrayMap<String, String> zaof = new SimpleArrayMap<>();

    private ConnectionErrorMessages() {
    }

    public static String getAppName(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String getDefaultNotificationChannelName(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }

    public static String getErrorDialogButtonMessage(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_button);
        }
        if (i != 2) {
            return i != 3 ? resources.getString(android.R.string.ok) : resources.getString(R.string.common_google_play_services_enable_button);
        }
        return resources.getString(R.string.common_google_play_services_update_button);
    }

    public static String getErrorMessage(Context context, int i) {
        Resources resources = context.getResources();
        String appName = getAppName(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, appName);
        }
        if (i == 2) {
            return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, appName);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, appName);
        }
        if (i == 5) {
            return zaa(context, "common_google_play_services_invalid_account_text", appName);
        }
        if (i == 7) {
            return zaa(context, "common_google_play_services_network_error_text", appName);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, appName);
        }
        if (i == 20) {
            return zaa(context, "common_google_play_services_restricted_profile_text", appName);
        }
        switch (i) {
            case 16:
                return zaa(context, "common_google_play_services_api_unavailable_text", appName);
            case 17:
                return zaa(context, "common_google_play_services_sign_in_failed_text", appName);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, appName);
            default:
                return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, appName);
        }
    }

    public static String getErrorNotificationMessage(Context context, int i) {
        return i == 6 ? zaa(context, "common_google_play_services_resolution_required_text", getAppName(context)) : getErrorMessage(context, i);
    }

    public static String getErrorNotificationTitle(Context context, int i) {
        String strZaa = i == 6 ? zaa(context, "common_google_play_services_resolution_required_title") : getErrorTitle(context, i);
        return strZaa == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : strZaa;
    }

    public static String getErrorTitle(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return zaa(context, "common_google_play_services_invalid_account_title");
            case 7:
                return zaa(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                return null;
            case 17:
                return zaa(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return zaa(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String zaa(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strZaa = zaa(context, str);
        if (strZaa == null) {
            strZaa = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strZaa, str2);
    }

    private static String zaa(Context context, String str) {
        SimpleArrayMap<String, String> simpleArrayMap = zaof;
        synchronized (simpleArrayMap) {
            try {
                String str2 = simpleArrayMap.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    String strValueOf = String.valueOf(str);
                    if (strValueOf.length() != 0) {
                        "Missing resource: ".concat(strValueOf);
                    }
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    simpleArrayMap.put(str, string);
                    return string;
                }
                String strValueOf2 = String.valueOf(str);
                if (strValueOf2.length() != 0) {
                    "Got empty resource: ".concat(strValueOf2);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
