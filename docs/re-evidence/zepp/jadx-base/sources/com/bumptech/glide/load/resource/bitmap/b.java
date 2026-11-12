package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
final class b {
    private static final int c = 128;
    private static final File d = new File("/proc/self/fd");
    private static final int e = 50;
    private static final int f = 700;
    private static volatile b g;
    private volatile int a;
    private volatile boolean b = true;

    private b() {
    }

    public static b a() {
        if (g == null) {
            synchronized (b.class) {
                if (g == null) {
                    g = new b();
                }
            }
        }
        return g;
    }

    private synchronized boolean b() {
        boolean z = true;
        int i = this.a + 1;
        this.a = i;
        if (i >= 50) {
            this.a = 0;
            int length = d.list().length;
            if (length >= 700) {
                z = false;
            }
            this.b = z;
            if (!this.b && Log.isLoggable(Downsampler.f, 5)) {
                Log.w(Downsampler.f, "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit 700");
            }
        }
        return this.b;
    }

    @TargetApi(26)
    public boolean c(int i, int i2, BitmapFactory.Options options, DecodeFormat decodeFormat, boolean z, boolean z2) {
        if (!z || Build.VERSION.SDK_INT < 26 || z2) {
            return false;
        }
        boolean z3 = i >= 128 && i2 >= 128 && b();
        if (z3) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return z3;
    }
}
