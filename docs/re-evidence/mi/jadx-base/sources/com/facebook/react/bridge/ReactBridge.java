package com.facebook.react.bridge;

import android.os.SystemClock;
import com.facebook.soloader.SoLoader;

/* JADX INFO: loaded from: classes4.dex */
public class ReactBridge {
    private static boolean sDidInit = false;
    private static volatile long sLoadEndTime;
    private static volatile long sLoadStartTime;

    public static long getLoadEndTime() {
        return sLoadEndTime;
    }

    public static long getLoadStartTime() {
        return sLoadStartTime;
    }

    public static synchronized void staticInit() {
        if (sDidInit) {
            return;
        }
        sDidInit = true;
        sLoadStartTime = SystemClock.uptimeMillis();
        com.facebook.systrace.Systrace.c(0L, "ReactBridge.staticInit::load:reactnativejni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
        SoLoader.q("reactnativejni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
        com.facebook.systrace.Systrace.g(0L);
        sLoadEndTime = SystemClock.uptimeMillis();
    }
}
