package kotlin.system;

import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@JvmName(name = "TimingKt")
public final class TimingKt {
    public static final long measureNanoTime(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long jNanoTime = System.nanoTime();
        block.invoke();
        return System.nanoTime() - jNanoTime;
    }

    public static final long measureTimeMillis(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long jCurrentTimeMillis = System.currentTimeMillis();
        block.invoke();
        return System.currentTimeMillis() - jCurrentTimeMillis;
    }
}
