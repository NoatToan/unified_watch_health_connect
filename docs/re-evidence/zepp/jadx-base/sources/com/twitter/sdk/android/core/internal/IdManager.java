package com.twitter.sdk.android.core.internal;

import android.content.Context;
import android.os.Build;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStore;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStoreImpl;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes18.dex */
public class IdManager {
    public static final String h = "com.twitter.sdk.android.COLLECT_IDENTIFIERS_ENABLED";
    public static final String i = "com.twitter.sdk.android.AdvertisingPreferences";
    public static final String j = "installation_uuid";
    private static final Pattern k = Pattern.compile("[^\\p{Alnum}]");
    private static final String l = Pattern.quote(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
    private final ReentrantLock a;
    private final boolean b;
    private final String c;
    private final PreferenceStore d;
    public b e;
    public a f;
    public boolean g;

    public IdManager(Context context) {
        this(context, new PreferenceStoreImpl(context, i));
    }

    private String a() {
        this.a.lock();
        try {
            String string = this.d.get().getString(j, null);
            if (string == null) {
                string = b(UUID.randomUUID().toString());
                PreferenceStore preferenceStore = this.d;
                preferenceStore.save(preferenceStore.edit().putString(j, string));
            }
            return string;
        } finally {
            this.a.unlock();
        }
    }

    private String b(String str) {
        if (str == null) {
            return null;
        }
        return k.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    private String d(String str) {
        return str.replaceAll(l, "");
    }

    public synchronized a c() {
        if (!this.g) {
            this.f = this.e.c();
            this.g = true;
        }
        return this.f;
    }

    public String getAdvertisingId() {
        a aVarC;
        if (!this.b || (aVarC = c()) == null) {
            return null;
        }
        return aVarC.a;
    }

    public String getAppIdentifier() {
        return this.c;
    }

    public String getDeviceUUID() {
        if (!this.b) {
            return "";
        }
        String string = this.d.get().getString(j, null);
        return string == null ? a() : string;
    }

    public String getModelName() {
        return String.format(Locale.US, "%s/%s", d(Build.MANUFACTURER), d(Build.MODEL));
    }

    public String getOsBuildVersionString() {
        return d(Build.VERSION.INCREMENTAL);
    }

    public String getOsDisplayVersionString() {
        return d(Build.VERSION.RELEASE);
    }

    public String getOsVersionString() {
        return getOsDisplayVersionString() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + getOsBuildVersionString();
    }

    public Boolean isLimitAdTrackingEnabled() {
        a aVarC;
        if (!this.b || (aVarC = c()) == null) {
            return null;
        }
        return Boolean.valueOf(aVarC.b);
    }

    public IdManager(Context context, PreferenceStore preferenceStore) {
        this(context, preferenceStore, new b(context, preferenceStore));
    }

    public IdManager(Context context, PreferenceStore preferenceStore, b bVar) {
        this.a = new ReentrantLock();
        if (context != null) {
            this.c = context.getPackageName();
            this.e = bVar;
            this.d = preferenceStore;
            boolean booleanResourceValue = CommonUtils.getBooleanResourceValue(context, h, true);
            this.b = booleanResourceValue;
            if (booleanResourceValue) {
                return;
            }
            Twitter.getLogger().d("Twitter", "Device ID collection disabled for " + context.getPackageName());
            return;
        }
        throw new IllegalArgumentException("appContext must not be null");
    }
}
