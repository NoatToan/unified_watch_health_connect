package com.google.android.exoplayer2;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerLibraryInfo {
    public static final boolean ASSERTIONS_ENABLED = true;

    @Deprecated
    public static final String DEFAULT_USER_AGENT;
    public static final boolean GL_ASSERTIONS_ENABLED = false;
    public static final String TAG = "ExoPlayer";
    public static final boolean TRACE_ENABLED = true;
    public static final String VERSION = "2.15.0";
    public static final int VERSION_INT = 2015000;
    public static final String VERSION_SLASHY = "ExoPlayerLib/2.15.0";
    private static final HashSet<String> a;
    private static String b;

    static {
        String str = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57);
        sb.append("ExoPlayerLib/2.15.0 (Linux; Android ");
        sb.append(str);
        sb.append(") ");
        sb.append(VERSION_SLASHY);
        DEFAULT_USER_AGENT = sb.toString();
        a = new HashSet<>();
        b = "goog.exo.core";
    }

    private ExoPlayerLibraryInfo() {
    }

    public static synchronized void registerModule(String name) {
        if (a.add(name)) {
            String str = b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(name).length());
            sb.append(str);
            sb.append(", ");
            sb.append(name);
            b = sb.toString();
        }
    }

    public static synchronized String registeredModules() {
        return b;
    }
}
