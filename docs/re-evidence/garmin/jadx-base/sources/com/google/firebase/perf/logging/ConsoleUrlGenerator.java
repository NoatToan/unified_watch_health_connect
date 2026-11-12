package com.google.firebase.perf.logging;

import androidx.room.a0;
import com.nimbusds.jose.shaded.gson.internal.a;
import tn.k;

/* JADX INFO: loaded from: classes2.dex */
public final class ConsoleUrlGenerator {
    private static final String URL_BASE_PATH = "https://console.firebase.google.com";
    private static final String UTM_MEDIUM = "android-ide";
    private static final String UTM_SOURCE = "perf-android-sdk";

    public static String generateCustomTraceUrl(String str, String str2, String str3) {
        return a.h(getRootUrl(str, str2), "/troubleshooting/trace/DURATION_TRACE/", str3, "?utm_source=perf-android-sdk&utm_medium=android-ide");
    }

    public static String generateDashboardUrl(String str, String str2) {
        return k.g(getRootUrl(str, str2), "/trends?utm_source=perf-android-sdk&utm_medium=android-ide");
    }

    public static String generateScreenTraceUrl(String str, String str2, String str3) {
        return a.h(getRootUrl(str, str2), "/troubleshooting/trace/SCREEN_TRACE/", str3, "?utm_source=perf-android-sdk&utm_medium=android-ide");
    }

    private static String getRootUrl(String str, String str2) {
        return a0.j("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
    }
}
