package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.elements.util.ClockUtil;
import org.slf4j.Logger;
import org.slf4j.event.Level;

/* JADX INFO: loaded from: classes20.dex */
public class zzk {
    private static final boolean d = !Boolean.FALSE.equals(zzp.e("COAP_LOGGING_FILTER"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f54814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f54815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54816c;
    private final Logger e;
    private long g;

    public zzk(String str, long j, long j2) {
        this(str, j, j2, TimeUnit.NANOSECONDS);
    }

    public zzk(String str, long j, long j2, TimeUnit timeUnit) {
        this.e = aaex.a(str);
        this.f54816c = j;
        this.f54815b = timeUnit.toNanos(j2);
        this.g = ClockUtil.c();
    }

    public void e(String str, Object... objArr) {
        if (this.e.isWarnEnabled()) {
            a(Level.WARN, str, objArr);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.e.isInfoEnabled()) {
            a(Level.INFO, str, objArr);
        }
    }

    public void c(String str, Object... objArr) {
        if (this.e.isDebugEnabled()) {
            a(Level.DEBUG, str, objArr);
        }
    }

    private void a(Level level, String str, Object... objArr) {
        boolean z;
        if (d) {
            long jC = ClockUtil.c();
            long j = this.f54815b;
            long j2 = this.g;
            synchronized (this) {
                long j3 = this.f54814a;
                z = j3 < this.f54816c;
                if ((j + j2) - jC > 0) {
                    this.f54814a = j3 + 1;
                } else {
                    this.g = jC;
                    if (!z) {
                        int length = objArr.length;
                        objArr = Arrays.copyOf(objArr, length + 1);
                        objArr[length] = Long.valueOf(this.f54814a);
                        str = str + " ({} additional errors.)";
                        z = true;
                    }
                    this.f54814a = 0L;
                }
            }
        } else {
            z = true;
        }
        if (z) {
            int i = AnonymousClass4.d[level.ordinal()];
            if (i == 1) {
                this.e.error(str, objArr);
                return;
            }
            if (i == 2) {
                this.e.warn(str, objArr);
                return;
            }
            if (i == 3) {
                this.e.info(str, objArr);
            } else if (i == 4) {
                this.e.debug(str, objArr);
            } else {
                if (i != 5) {
                    return;
                }
                this.e.trace(str, objArr);
            }
        }
    }

    /* JADX INFO: renamed from: zzk$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[Level.values().length];
            d = iArr;
            try {
                iArr[Level.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[Level.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[Level.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[Level.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[Level.TRACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }
}
