package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.miui.tsmclient.model.ErrorCode;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class flb {
    public static final boolean e;

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean f;
    public static final File g;
    public static volatile flb h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public int f17893b;

    @GuardedBy("this")
    public boolean c = true;
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17892a = ErrorCode.ERROR_CODE_INVALID_PARAM;

    static {
        int i = Build.VERSION.SDK_INT;
        e = i < 29;
        f = i >= 28;
        g = new File("/proc/self/fd");
    }

    @VisibleForTesting
    public flb() {
    }

    public static flb b() {
        if (h == null) {
            synchronized (flb.class) {
                try {
                    if (h == null) {
                        h = new flb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return e && !this.d.get();
    }

    public final int c() {
        if (e()) {
            return 500;
        }
        return this.f17892a;
    }

    public final synchronized boolean d() {
        try {
            boolean z = true;
            int i = this.f17893b + 1;
            this.f17893b = i;
            if (i >= 50) {
                this.f17893b = 0;
                int length = g.list().length;
                long jC = c();
                if (length >= jC) {
                    z = false;
                }
                this.c = z;
                if (!z && Log.isLoggable("Downsampler", 5)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                    sb.append(length);
                    sb.append(", limit ");
                    sb.append(jC);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public boolean f(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (!f) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (a()) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (z2) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (i < 0 || i2 < 0) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (d()) {
            return true;
        }
        Log.isLoggable("HardwareConfig", 2);
        return false;
    }

    @TargetApi(26)
    public boolean g(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean zF = f(i, i2, z, z2);
        if (zF) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zF;
    }

    public void h() {
        ulq.b();
        this.d.set(true);
    }
}
