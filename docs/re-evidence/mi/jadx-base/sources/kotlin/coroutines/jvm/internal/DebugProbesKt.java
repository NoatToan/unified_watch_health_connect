package kotlin.coroutines.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted, all sources:
  classes2.dex
  com.mi.health_3.46.1-346001_minAPI26(arm64-v8a)(nodpi)_apkmirror.com.apk:DebugProbesKt.bin
 */
/* JADX INFO: loaded from: classes2.dex */
public final class DebugProbesKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> Continuation<T> probeCoroutineCreated(@NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return completion;
    }

    @SinceKotlin(version = "1.3")
    public static final void probeCoroutineResumed(@NotNull Continuation<?> frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    @SinceKotlin(version = "1.3")
    public static final void probeCoroutineSuspended(@NotNull Continuation<?> frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
    }
}
