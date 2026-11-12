package com.mapbox.maps;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.maps.exception.WorkerThreadException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/ThreadChecker;", "", "()V", "DEBUG_FIELD", "", "DEBUG_LOOKUP_FAILED", "METADATA_KEY", "METADATA_LOOKUP_FAILED", "TAG", "debug", "", "enabled", "isMainThread", "resolveDebugState", "resolveEnabledState", "throwIfNotMainThread", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ThreadChecker {
    private static final String DEBUG_FIELD = "DEBUG";
    private static final String DEBUG_LOOKUP_FAILED = "Unable to lookup build config of application.";
    public static final ThreadChecker INSTANCE;
    private static final String METADATA_KEY = "com.mapbox.maps.ThreadChecker";
    private static final String METADATA_LOOKUP_FAILED = "No boolean metadata found for key com.mapbox.maps.ThreadChecker";
    private static final String TAG = "ThreadChecker";
    private static final boolean debug;
    private static final boolean enabled;

    static {
        ThreadChecker threadChecker = new ThreadChecker();
        INSTANCE = threadChecker;
        enabled = threadChecker.resolveEnabledState();
        debug = threadChecker.resolveDebugState();
    }

    private ThreadChecker() {
    }

    private final boolean isMainThread() {
        return s.g(Thread.currentThread(), Looper.getMainLooper().getThread());
    }

    private final boolean resolveDebugState() {
        try {
            return Class.forName(MapboxSDKCommon.INSTANCE.getContext().getApplicationInfo().packageName + ".BuildConfig").getField(DEBUG_FIELD).getBoolean(null);
        } catch (Exception e4) {
            MapboxLogger.logI(TAG, "Unable to lookup build config of application. " + e4.getLocalizedMessage());
            return false;
        }
    }

    private final boolean resolveEnabledState() {
        try {
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            applicationInfo.getClass();
            Bundle bundle = applicationInfo.metaData;
            if (bundle.containsKey(METADATA_KEY)) {
                return bundle.getBoolean(METADATA_KEY);
            }
            return true;
        } catch (Exception e4) {
            MapboxLogger.logI(TAG, "No boolean metadata found for key com.mapbox.maps.ThreadChecker " + e4.getLocalizedMessage());
            return true;
        }
    }

    public final void throwIfNotMainThread() {
        if ((!(!enabled) && !(!debug)) && !isMainThread()) {
            throw new WorkerThreadException();
        }
    }
}
