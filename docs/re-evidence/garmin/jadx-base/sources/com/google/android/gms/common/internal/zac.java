package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import h7.e;
import java.util.Locale;
import p1.k1;

/* JADX INFO: loaded from: classes14.dex */
public final class zac {

    @GuardedBy("cache")
    private static final k1 zaa = new k1();

    @GuardedBy("cache")
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String zab(Context context, int i14) {
        Resources resources = context.getResources();
        if (i14 == 1) {
            return resources.getString(R.string.common_google_play_services_install_button);
        }
        if (i14 != 2) {
            return i14 != 3 ? resources.getString(android.R.string.ok) : resources.getString(R.string.common_google_play_services_enable_button);
        }
        return resources.getString(R.string.common_google_play_services_update_button);
    }

    public static String zac(Context context, int i14) {
        Resources resources = context.getResources();
        String strZaa = zaa(context);
        if (i14 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strZaa);
        }
        if (i14 == 2) {
            return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strZaa);
        }
        if (i14 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strZaa);
        }
        if (i14 == 5) {
            return zag(context, "common_google_play_services_invalid_account_text", strZaa);
        }
        if (i14 == 7) {
            return zag(context, "common_google_play_services_network_error_text", strZaa);
        }
        if (i14 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strZaa);
        }
        if (i14 == 20) {
            return zag(context, "common_google_play_services_restricted_profile_text", strZaa);
        }
        switch (i14) {
            case 16:
                return zag(context, "common_google_play_services_api_unavailable_text", strZaa);
            case 17:
                return zag(context, "common_google_play_services_sign_in_failed_text", strZaa);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strZaa);
            default:
                return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, strZaa);
        }
    }

    public static String zad(Context context, int i14) {
        return (i14 == 6 || i14 == 19) ? zag(context, "common_google_play_services_resolution_required_text", zaa(context)) : zac(context, i14);
    }

    public static String zae(Context context, int i14) {
        String strZah = i14 == 6 ? zah(context, "common_google_play_services_resolution_required_title") : zaf(context, i14);
        return strZah == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : strZah;
    }

    public static String zaf(Context context, int i14) {
        Resources resources = context.getResources();
        if (i14 == 1) {
            return resources.getString(R.string.common_google_play_services_install_title);
        }
        if (i14 == 2) {
            return resources.getString(R.string.common_google_play_services_update_title);
        }
        if (i14 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_title);
        }
        if (i14 == 5) {
            return zah(context, "common_google_play_services_invalid_account_title");
        }
        if (i14 == 7) {
            return zah(context, "common_google_play_services_network_error_title");
        }
        if (i14 == 17) {
            return zah(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i14 != 20) {
            return null;
        }
        return zah(context, "common_google_play_services_restricted_profile_title");
    }

    private static String zag(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strZah = zah(context, str);
        if (strZah == null) {
            strZah = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strZah, str2);
    }

    private static String zah(Context context, String str) {
        k1 k1Var = zaa;
        synchronized (k1Var) {
            try {
                Locale locale = e.a(context.getResources().getConfiguration()).f82328a.get(0);
                if (!locale.equals(zab)) {
                    k1Var.clear();
                    zab = locale;
                }
                String str2 = (String) k1Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                k1Var.put(str, string);
                return string;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
