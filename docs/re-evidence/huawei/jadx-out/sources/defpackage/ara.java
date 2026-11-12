package defpackage;

import com.google.common.util.concurrent.ElementTypesAreNonnullByDefault;
import java.util.concurrent.locks.LockSupport;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class ara {
    public static void c(@CheckForNull Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, 2147483647999999999L));
    }
}
