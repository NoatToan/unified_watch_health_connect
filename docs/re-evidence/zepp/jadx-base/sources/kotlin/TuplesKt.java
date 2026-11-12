package kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@JvmName(name = "TuplesKt")
public final class TuplesKt {
    @NotNull
    public static final <A, B> Pair<A, B> to(A a, B b) {
        return new Pair<>(a, b);
    }

    @NotNull
    public static final <T> List<T> toList(@NotNull Pair<? extends T, ? extends T> pair) {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Object[]{pair.getFirst(), pair.getSecond()});
    }

    @NotNull
    public static final <T> List<T> toList(@NotNull Triple<? extends T, ? extends T, ? extends T> triple) {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Object[]{triple.getFirst(), triple.getSecond(), triple.getThird()});
    }
}
