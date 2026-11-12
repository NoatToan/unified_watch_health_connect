package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;

/* JADX INFO: loaded from: classes3.dex */
public class DataCollectionConfigStorage {

    @VisibleForTesting
    public static final String DATA_COLLECTION_DEFAULT_ENABLED = "firebase_data_collection_default_enabled";
    private static final String e = "com.google.firebase.common.prefs:";
    private final Context a;
    private final SharedPreferences b;
    private final Publisher c;
    private boolean d;

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher) {
        Context contextA = a(context);
        this.a = contextA;
        this.b = contextA.getSharedPreferences(e + str, 0);
        this.c = publisher;
        this.d = b();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : ContextCompat.createDeviceProtectedStorageContext(context);
    }

    private boolean b() {
        return this.b.contains(DATA_COLLECTION_DEFAULT_ENABLED) ? this.b.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED, true) : c();
    }

    private boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(DATA_COLLECTION_DEFAULT_ENABLED)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void d(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.c.publish(new Event<>(DataCollectionDefaultChange.class, new DataCollectionDefaultChange(z)));
        }
    }

    public synchronized boolean isEnabled() {
        return this.d;
    }

    public synchronized void setEnabled(Boolean bool) {
        try {
            if (bool == null) {
                this.b.edit().remove(DATA_COLLECTION_DEFAULT_ENABLED).apply();
                d(c());
            } else {
                boolean zEquals = Boolean.TRUE.equals(bool);
                this.b.edit().putBoolean(DATA_COLLECTION_DEFAULT_ENABLED, zEquals).apply();
                d(zEquals);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
