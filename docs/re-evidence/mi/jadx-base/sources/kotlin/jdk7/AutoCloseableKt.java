package kotlin.jdk7;

import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "AutoCloseableKt")
public final class AutoCloseableKt {
    @SinceKotlin(version = "2.0")
    @InlineOnly
    private static final AutoCloseable AutoCloseable(final Function0<Unit> closeAction) {
        Intrinsics.checkNotNullParameter(closeAction, "closeAction");
        return new AutoCloseable() { // from class: kotlin.jdk7.AutoCloseableKt.AutoCloseable.1
            @Override // java.lang.AutoCloseable
            public final void close() {
                closeAction.invoke();
            }
        };
    }

    @SinceKotlin(version = "2.0")
    public static /* synthetic */ void AutoCloseable$annotations() {
    }

    @SinceKotlin(version = "1.2")
    @PublishedApi
    public static final void closeFinally(@Nullable AutoCloseable autoCloseable, @Nullable Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
            }
        }
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final <T extends AutoCloseable, R> R use(T t, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            R rInvoke2 = block.invoke2(t);
            InlineMarker.finallyStart(1);
            closeFinally(t, null);
            InlineMarker.finallyEnd(1);
            return rInvoke2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                closeFinally(t, th);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }
}
