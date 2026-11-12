package com.google.android.exoplayer2.util;

import android.os.Trace;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes3.dex */
public final class TraceUtil {
    private TraceUtil() {
    }

    @RequiresApi(18)
    private static void a(String sectionName) {
        Trace.beginSection(sectionName);
    }

    @RequiresApi(18)
    private static void b() {
        Trace.endSection();
    }

    public static void beginSection(String sectionName) {
        if (Util.SDK_INT >= 18) {
            a(sectionName);
        }
    }

    public static void endSection() {
        if (Util.SDK_INT >= 18) {
            b();
        }
    }
}
