package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigMetadataClient {

    @VisibleForTesting
    public static final long LAST_FETCH_TIME_IN_MILLIS_NO_FETCH_YET = -1;

    @VisibleForTesting
    public static final int e = 0;
    private static final long f = -1;
    private static final String h = "fetch_timeout_in_seconds";
    private static final String i = "minimum_fetch_interval_in_seconds";
    private static final String j = "last_fetch_status";
    private static final String k = "last_fetch_time_in_millis";
    private static final String l = "last_fetch_etag";
    private static final String m = "backoff_end_time_in_millis";
    private static final String n = "num_failed_fetches";
    private final SharedPreferences a;
    private final Object b = new Object();
    private final Object c = new Object();
    public static final Date d = new Date(-1);

    @VisibleForTesting
    public static final Date g = new Date(-1);

    public static class a {
        private int a;
        private Date b;

        public a(int i, Date date) {
            this.a = i;
            this.b = date;
        }

        public Date a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    public ConfigMetadataClient(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public a a() {
        a aVar;
        synchronized (this.c) {
            aVar = new a(this.a.getInt(n, 0), new Date(this.a.getLong(m, -1L)));
        }
        return aVar;
    }

    @Nullable
    public String b() {
        return this.a.getString(l, null);
    }

    public int c() {
        return this.a.getInt(j, 0);
    }

    @WorkerThread
    public void clear() {
        synchronized (this.b) {
            this.a.edit().clear().commit();
        }
    }

    public Date d() {
        return new Date(this.a.getLong(k, -1L));
    }

    public void e() {
        f(0, g);
    }

    public void f(int i2, Date date) {
        synchronized (this.c) {
            this.a.edit().putInt(n, i2).putLong(m, date.getTime()).apply();
        }
    }

    public void g(String str) {
        synchronized (this.b) {
            this.a.edit().putString(l, str).apply();
        }
    }

    public long getFetchTimeoutInSeconds() {
        return this.a.getLong(h, 60L);
    }

    public FirebaseRemoteConfigInfo getInfo() {
        FirebaseRemoteConfigInfoImpl firebaseRemoteConfigInfoImplBuild;
        synchronized (this.b) {
            long j2 = this.a.getLong(k, -1L);
            int i2 = this.a.getInt(j, 0);
            firebaseRemoteConfigInfoImplBuild = FirebaseRemoteConfigInfoImpl.a().b(i2).withLastSuccessfulFetchTimeInMillis(j2).a(new FirebaseRemoteConfigSettings.Builder().setFetchTimeoutInSeconds(this.a.getLong(h, 60L)).setMinimumFetchIntervalInSeconds(this.a.getLong(i, ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS)).build()).build();
        }
        return firebaseRemoteConfigInfoImplBuild;
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.a.getLong(i, ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS);
    }

    public void h() {
        synchronized (this.b) {
            this.a.edit().putInt(j, 1).apply();
        }
    }

    public void i(Date date) {
        synchronized (this.b) {
            this.a.edit().putInt(j, -1).putLong(k, date.getTime()).apply();
        }
    }

    public void j() {
        synchronized (this.b) {
            this.a.edit().putInt(j, 2).apply();
        }
    }

    @WorkerThread
    public void setConfigSettings(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.b) {
            this.a.edit().putLong(h, firebaseRemoteConfigSettings.getFetchTimeoutInSeconds()).putLong(i, firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds()).commit();
        }
    }

    public void setConfigSettingsWithoutWaitingOnDiskWrite(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.b) {
            this.a.edit().putLong(h, firebaseRemoteConfigSettings.getFetchTimeoutInSeconds()).putLong(i, firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds()).apply();
        }
    }
}
