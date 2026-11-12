package com.airbnb.lottie.utils;

import android.os.Trace;
import h7.j;
import hb.a;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class LottieTrace {
    private static final int MAX_DEPTH = 5;
    private final String[] sections = new String[5];
    private final long[] startTimeNs = new long[5];
    private int traceDepth = 0;
    private int depthPastMaxDepth = 0;

    public void beginSection(String str) {
        int i14 = this.traceDepth;
        if (i14 == 5) {
            this.depthPastMaxDepth++;
            return;
        }
        this.sections[i14] = str;
        this.startTimeNs[i14] = System.nanoTime();
        int i15 = j.f82330a;
        Trace.beginSection(str);
        this.traceDepth++;
    }

    public float endSection(String str) {
        int i14 = this.depthPastMaxDepth;
        if (i14 > 0) {
            this.depthPastMaxDepth = i14 - 1;
            return 0.0f;
        }
        int i15 = this.traceDepth - 1;
        this.traceDepth = i15;
        if (i15 == -1) {
            h.z("Can't end trace section. There are none.");
            return 0.0f;
        }
        if (str.equals(this.sections[i15])) {
            int i16 = j.f82330a;
            Trace.endSection();
            return (System.nanoTime() - this.startTimeNs[this.traceDepth]) / 1000000.0f;
        }
        h.z(am.j.o(this.sections[this.traceDepth], ".", a.l("Unbalanced trace call ", str, ". Expected ")));
        return 0.0f;
    }
}
