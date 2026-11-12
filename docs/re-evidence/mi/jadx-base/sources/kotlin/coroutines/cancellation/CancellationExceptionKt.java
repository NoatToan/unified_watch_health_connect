package kotlin.coroutines.cancellation;

import java.util.concurrent.CancellationException;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nCancellationException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellationException.kt\nkotlin/coroutines/cancellation/CancellationExceptionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
public final class CancellationExceptionKt {
    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final CancellationException CancellationException(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @SinceKotlin(version = "1.4")
    public static /* synthetic */ void CancellationException$annotations() {
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final CancellationException CancellationException(Throwable th) {
        CancellationException cancellationException = new CancellationException(th != null ? th.toString() : null);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
