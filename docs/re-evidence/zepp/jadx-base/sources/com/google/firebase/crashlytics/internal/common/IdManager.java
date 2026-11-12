package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.installations.FirebaseInstallationsApi;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class IdManager implements InstallIdProvider {
    public static final String DEFAULT_VERSION_NAME = "0.0";
    public static final String g = "crashlytics.advertising.id";
    public static final String h = "crashlytics.installation.id";
    public static final String i = "firebase.installation.id";
    public static final String j = "crashlytics.installation.id";
    private static final String l = "SYN_";
    private final l a;
    private final Context b;
    private final String c;
    private final FirebaseInstallationsApi d;
    private final DataCollectionArbiter e;
    private String f;
    private static final Pattern k = Pattern.compile("[^\\p{Alnum}]");
    private static final String m = Pattern.quote(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = firebaseInstallationsApi;
        this.e = dataCollectionArbiter;
        this.a = new l();
    }

    @NonNull
    private synchronized String a(String str, SharedPreferences sharedPreferences) {
        String strD;
        strD = d(UUID.randomUUID().toString());
        Logger.getLogger().v("Created new Crashlytics installation ID: " + strD + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strD).putString(i, str).apply();
        return strD;
    }

    public static String b() {
        return l + UUID.randomUUID().toString();
    }

    @Nullable
    private String c() {
        try {
            return (String) Utils.awaitEvenIfOnMainThread(this.d.getId());
        } catch (Exception e) {
            Logger.getLogger().w("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    private static String d(String str) {
        if (str == null) {
            return null;
        }
        return k.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    public static boolean e(String str) {
        return str != null && str.startsWith(l);
    }

    private String f(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String g(String str) {
        return str.replaceAll(m, "");
    }

    public String getAppIdentifier() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider
    @NonNull
    public synchronized String getCrashlyticsInstallId() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        Logger.getLogger().v("Determining Crashlytics installation ID...");
        SharedPreferences sharedPrefs = CommonUtils.getSharedPrefs(this.b);
        String string = sharedPrefs.getString(i, null);
        Logger.getLogger().v("Cached Firebase Installation ID: " + string);
        if (this.e.isAutomaticDataCollectionEnabled()) {
            String strC = c();
            Logger.getLogger().v("Fetched Firebase Installation ID: " + strC);
            if (strC == null) {
                strC = string == null ? b() : string;
            }
            if (strC.equals(string)) {
                this.f = f(sharedPrefs);
            } else {
                this.f = a(strC, sharedPrefs);
            }
        } else if (e(string)) {
            this.f = f(sharedPrefs);
        } else {
            this.f = a(b(), sharedPrefs);
        }
        if (this.f == null) {
            Logger.getLogger().w("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f = a(b(), sharedPrefs);
        }
        Logger.getLogger().v("Crashlytics installation ID: " + this.f);
        return this.f;
    }

    public String getInstallerPackageName() {
        return this.a.a(this.b);
    }

    public String getModelName() {
        return String.format(Locale.US, "%s/%s", g(Build.MANUFACTURER), g(Build.MODEL));
    }

    public String getOsBuildVersionString() {
        return g(Build.VERSION.INCREMENTAL);
    }

    public String getOsDisplayVersionString() {
        return g(Build.VERSION.RELEASE);
    }
}
