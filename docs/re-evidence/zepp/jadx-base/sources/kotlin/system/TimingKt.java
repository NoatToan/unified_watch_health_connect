package kotlin.system;

import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@JvmName(name = "TimingKt")
public final class TimingKt {
    public static final long measureNanoTime(@NotNull Function0<Unit> function0) {
        long jNanoTime = System.nanoTime();
        function0.invoke();
        return System.nanoTime() - jNanoTime;
    }

    public static final long measureTimeMillis(@NotNull Function0<Unit> function0) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        function0.invoke();
        return System.currentTimeMillis() - jCurrentTimeMillis;
    }
}
