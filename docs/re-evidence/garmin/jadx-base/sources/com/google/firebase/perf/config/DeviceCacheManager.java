package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import cd0.f;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceCacheManager {
    private static final String PREFS_NAME = "FirebasePerfSharedPrefs";
    private static DeviceCacheManager instance;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final ExecutorService serialExecutor;
    private volatile SharedPreferences sharedPref;

    public DeviceCacheManager(ExecutorService executorService) {
        this.serialExecutor = executorService;
    }

    public static void clearInstance() {
        instance = null;
    }

    private Context getFirebaseApplicationContext() {
        try {
            FirebaseApp.getInstance();
            return FirebaseApp.getInstance().getApplicationContext();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static synchronized DeviceCacheManager getInstance() {
        try {
            if (instance == null) {
                instance = new DeviceCacheManager(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setContext$0(Context context) {
        if (this.sharedPref != null || context == null) {
            return;
        }
        this.sharedPref = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    public void clear(String str) {
        if (str == null) {
            logger.debug("Key is null. Cannot clear nullable key");
        } else {
            this.sharedPref.edit().remove(str).apply();
        }
    }

    public boolean containsKey(String str) {
        return (this.sharedPref == null || str == null || !this.sharedPref.contains(str)) ? false : true;
    }

    public Optional<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.debug("Key is null when getting boolean value on device cache.");
            return Optional.absent();
        }
        if (this.sharedPref == null) {
            setContext(getFirebaseApplicationContext());
            if (this.sharedPref == null) {
                return Optional.absent();
            }
        }
        if (!this.sharedPref.contains(str)) {
            return Optional.absent();
        }
        try {
            return Optional.of(Boolean.valueOf(this.sharedPref.getBoolean(str, false)));
        } catch (ClassCastException e4) {
            logger.debug("Key %s from sharedPreferences has type other than long: %s", str, e4.getMessage());
            return Optional.absent();
        }
    }

    public Optional<Double> getDouble(String str) {
        if (str == null) {
            logger.debug("Key is null when getting double value on device cache.");
            return Optional.absent();
        }
        if (this.sharedPref == null) {
            setContext(getFirebaseApplicationContext());
            if (this.sharedPref == null) {
                return Optional.absent();
            }
        }
        if (!this.sharedPref.contains(str)) {
            return Optional.absent();
        }
        try {
            try {
                return Optional.of(Double.valueOf(Double.longBitsToDouble(this.sharedPref.getLong(str, 0L))));
            } catch (ClassCastException unused) {
                return Optional.of(Double.valueOf(Float.valueOf(this.sharedPref.getFloat(str, 0.0f)).doubleValue()));
            }
        } catch (ClassCastException e4) {
            logger.debug("Key %s from sharedPreferences has type other than double: %s", str, e4.getMessage());
            return Optional.absent();
        }
    }

    public Optional<Long> getLong(String str) {
        if (str == null) {
            logger.debug("Key is null when getting long value on device cache.");
            return Optional.absent();
        }
        if (this.sharedPref == null) {
            setContext(getFirebaseApplicationContext());
            if (this.sharedPref == null) {
                return Optional.absent();
            }
        }
        if (!this.sharedPref.contains(str)) {
            return Optional.absent();
        }
        try {
            return Optional.of(Long.valueOf(this.sharedPref.getLong(str, 0L)));
        } catch (ClassCastException e4) {
            logger.debug("Key %s from sharedPreferences has type other than long: %s", str, e4.getMessage());
            return Optional.absent();
        }
    }

    public Optional<String> getString(String str) {
        if (str == null) {
            logger.debug("Key is null when getting String value on device cache.");
            return Optional.absent();
        }
        if (this.sharedPref == null) {
            setContext(getFirebaseApplicationContext());
            if (this.sharedPref == null) {
                return Optional.absent();
            }
        }
        if (!this.sharedPref.contains(str)) {
            return Optional.absent();
        }
        try {
            return Optional.of(this.sharedPref.getString(str, ""));
        } catch (ClassCastException e4) {
            logger.debug("Key %s from sharedPreferences has type other than String: %s", str, e4.getMessage());
            return Optional.absent();
        }
    }

    public synchronized void setContext(Context context) {
        if (this.sharedPref == null && context != null) {
            this.serialExecutor.execute(new f(19, this, context));
        }
    }

    public boolean setValue(String str, String str2) {
        if (str == null) {
            logger.debug("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.sharedPref == null) {
            setContext(getFirebaseApplicationContext());
            if (this.sharedPref == null) {
                return false;
            }
        }
        SharedPreferences sharedPreferences = this.sharedPref;
        if (str2 == null) {
            sharedPreferences.edit().remove(str).apply();
            return true;
        }
        sharedPreferences.edit().putString(str, str2).apply();
        return true;
    }

    public boolean setValue(String str, boolean z14) {
        if (str == null) {
            logger.debug("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.sharedPref == null) {
            setContext(getFirebaseApplicationContext());
            if (this.sharedPref == null) {
                return false;
            }
        }
        this.sharedPref.edit().putBoolean(str, z14).apply();
        return true;
    }

    public boolean setValue(String str, double d14) {
        if (str == null) {
            logger.debug("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.sharedPref == null) {
            setContext(getFirebaseApplicationContext());
            if (this.sharedPref == null) {
                return false;
            }
        }
        this.sharedPref.edit().putLong(str, Double.doubleToRawLongBits(d14)).apply();
        return true;
    }

    public boolean setValue(String str, long j8) {
        if (str == null) {
            logger.debug("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.sharedPref == null) {
            setContext(getFirebaseApplicationContext());
            if (this.sharedPref == null) {
                return false;
            }
        }
        this.sharedPref.edit().putLong(str, j8).apply();
        return true;
    }
}
