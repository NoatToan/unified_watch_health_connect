package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class DataCollectionArbiter {
    private static final String i = "firebase_crashlytics_collection_enabled";
    private final SharedPreferences a;
    private final FirebaseApp b;
    private final Object c;
    public TaskCompletionSource<Void> d;
    public boolean e;
    private boolean f;

    @Nullable
    private Boolean g;
    private final TaskCompletionSource<Void> h;

    public DataCollectionArbiter(FirebaseApp firebaseApp) {
        Object obj = new Object();
        this.c = obj;
        this.d = new TaskCompletionSource<>();
        this.e = false;
        this.f = false;
        this.h = new TaskCompletionSource<>();
        Context applicationContext = firebaseApp.getApplicationContext();
        this.b = firebaseApp;
        this.a = CommonUtils.getSharedPrefs(applicationContext);
        Boolean boolB = b();
        this.g = boolB == null ? a(applicationContext) : boolB;
        synchronized (obj) {
            if (isAutomaticDataCollectionEnabled()) {
                this.d.trySetResult(null);
                this.e = true;
            }
        }
    }

    @Nullable
    private Boolean a(Context context) {
        Boolean boolD = d(context);
        if (boolD == null) {
            this.f = false;
            return null;
        }
        this.f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolD));
    }

    @Nullable
    private Boolean b() {
        if (!this.a.contains(i)) {
            return null;
        }
        this.f = false;
        return Boolean.valueOf(this.a.getBoolean(i, true));
    }

    private void c(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (this.g == null) {
            str = "global Firebase setting";
        } else {
            str = this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        Logger.getLogger().d(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    @Nullable
    private static Boolean d(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(i)) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean(i));
        } catch (PackageManager.NameNotFoundException e) {
            Logger.getLogger().e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private static void e(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean(i, bool.booleanValue());
        } else {
            editorEdit.remove(i);
        }
        editorEdit.commit();
    }

    public void grantDataCollectionPermission(boolean z) {
        if (!z) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.h.trySetResult(null);
    }

    public synchronized boolean isAutomaticDataCollectionEnabled() {
        boolean zBooleanValue;
        Boolean bool = this.g;
        zBooleanValue = bool != null ? bool.booleanValue() : this.b.isDataCollectionDefaultEnabled();
        c(zBooleanValue);
        return zBooleanValue;
    }

    public synchronized void setCrashlyticsDataCollectionEnabled(@Nullable Boolean bool) {
        if (bool != null) {
            try {
                this.f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g = bool != null ? bool : a(this.b.getApplicationContext());
        e(this.a, bool);
        synchronized (this.c) {
            if (isAutomaticDataCollectionEnabled()) {
                if (!this.e) {
                    this.d.trySetResult(null);
                    this.e = true;
                }
            } else if (this.e) {
                this.d = new TaskCompletionSource<>();
                this.e = false;
            }
        }
    }

    public Task<Void> waitForAutomaticDataCollectionEnabled() {
        Task<Void> task;
        synchronized (this.c) {
            task = this.d.getTask();
        }
        return task;
    }

    public Task<Void> waitForDataCollectionPermission(Executor executor) {
        return Utils.race(executor, this.h.getTask(), waitForAutomaticDataCollectionEnabled());
    }
}
