package dj;

import android.os.Build;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f59866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f59867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final File f59868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile t f59869h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59872c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f59873d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59870a = 20000;

    static {
        f59866e = Build.VERSION.SDK_INT < 29;
        f59867f = true;
        f59868g = new File("/proc/self/fd");
    }

    public static t a() {
        if (f59869h == null) {
            synchronized (t.class) {
                try {
                    if (f59869h == null) {
                        f59869h = new t();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return f59869h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f59870a;
    }

    public final boolean c(int i14, int i15, boolean z14, boolean z15) {
        boolean z16;
        if (z14 && f59867f && ((!f59866e || this.f59873d.get()) && !z15 && i14 >= 0 && i15 >= 0)) {
            synchronized (this) {
                try {
                    int i16 = this.f59871b + 1;
                    this.f59871b = i16;
                    if (i16 >= 50) {
                        this.f59871b = 0;
                        this.f59872c = ((long) f59868g.list().length) < ((long) b());
                    }
                    z16 = this.f59872c;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (z16) {
                return true;
            }
        }
        return false;
    }
}
