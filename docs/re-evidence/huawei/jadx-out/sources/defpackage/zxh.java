package defpackage;

import java.util.concurrent.TimeUnit;
import org.eclipse.californium.elements.util.ClockUtil;

/* JADX INFO: loaded from: classes20.dex */
public class zxh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final long f54730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f54731b;

    public zxh(int i) {
        this(i, ClockUtil.c());
    }

    public zxh(int i, long j) {
        this.f54731b = i;
        this.f54730a = j;
    }

    public int e() {
        return this.f54731b;
    }

    public boolean d(zvf zvfVar) {
        Integer numQ = zvfVar.getOptions().q();
        if (numQ == null) {
            return true;
        }
        return b(this.f54730a, this.f54731b, ClockUtil.c(), numQ.intValue());
    }

    public static boolean b(long j, int i, long j2, int i2) {
        if (i >= i2 || i2 - i >= 8388608) {
            return (i > i2 && ((long) (i - i2)) > 8388608) || j2 > j + TimeUnit.SECONDS.toNanos(128L);
        }
        return true;
    }
}
