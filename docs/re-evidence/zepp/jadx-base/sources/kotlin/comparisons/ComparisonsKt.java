package kotlin.comparisons;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ComparisonsKt extends b {
    private ComparisonsKt() {
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static /* bridge */ /* synthetic */ <T extends Comparable<? super T>> T maxOf(@NotNull T t, @NotNull T t2) {
        return (T) a.maxOf(t, t2);
    }
}
