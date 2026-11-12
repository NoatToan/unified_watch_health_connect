package org.eclipse.californium.elements.util;

/* JADX INFO: loaded from: classes20.dex */
public class ClockUtil {
    private static volatile Realtime e = new Realtime() { // from class: org.eclipse.californium.elements.util.ClockUtil.3
        @Override // org.eclipse.californium.elements.util.ClockUtil.Realtime
        public long nanoRealtime() {
            return System.nanoTime();
        }
    };

    public interface Realtime {
        long nanoRealtime();
    }

    public static long c() {
        return e.nanoRealtime();
    }
}
