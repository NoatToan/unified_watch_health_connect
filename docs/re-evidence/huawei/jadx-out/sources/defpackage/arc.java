package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ElementTypesAreNonnullByDefault;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class arc {
    public static boolean e(@CheckForNull Throwable th, Class<? extends Throwable> cls) {
        return cls.isInstance(th);
    }

    public static void e(Throwable th) {
        Preconditions.checkNotNull(th);
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
