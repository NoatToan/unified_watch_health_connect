package kotlin;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class DeepRecursiveKt {

    @NotNull
    private static final Object a;

    static {
        Result.Companion companion = Result.Companion;
        a = Result.m3845constructorimpl(kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED());
    }

    @ExperimentalStdlibApi
    private static /* synthetic */ void a() {
    }

    private static /* synthetic */ void b() {
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalStdlibApi
    public static final <T, R> R invoke(@NotNull DeepRecursiveFunction<T, R> deepRecursiveFunction, T t) {
        return (R) new DeepRecursiveScopeImpl(deepRecursiveFunction.getBlock$kotlin_stdlib(), t).e();
    }
}
