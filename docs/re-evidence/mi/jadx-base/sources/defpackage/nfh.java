package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes5.dex */
public final class nfh {
    public static void a(Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, 2147483647999999999L));
    }
}
