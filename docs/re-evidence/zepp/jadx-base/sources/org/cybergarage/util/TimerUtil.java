package org.cybergarage.util;

/* JADX INFO: loaded from: classes23.dex */
public final class TimerUtil {
    public static final void wait(int i) {
        try {
            Thread.sleep(i);
        } catch (Exception unused) {
        }
    }

    public static final void waitRandom(int i) {
        try {
            Thread.sleep((int) (Math.random() * ((double) i)));
        } catch (Exception unused) {
        }
    }
}
