package kotlin.coroutines.cancellation;

import java.util.concurrent.CancellationException;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* JADX INFO: loaded from: classes23.dex */
public final class CancellationExceptionKt {
    @SinceKotlin(version = "1.4")
    public static /* synthetic */ void CancellationException$annotations() {
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final CancellationException b(Throwable th) {
        CancellationException cancellationException = new CancellationException(th == null ? null : th.toString());
        cancellationException.initCause(th);
        return cancellationException;
    }
}
