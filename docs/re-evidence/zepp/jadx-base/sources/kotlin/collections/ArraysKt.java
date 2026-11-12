package kotlin.collections;

import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class ArraysKt extends ArraysKt___ArraysKt {
    private ArraysKt() {
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static /* bridge */ /* synthetic */ <T> T[] copyInto(@NotNull T[] tArr, @NotNull T[] tArr2, int i, int i2, int i3) {
        return (T[]) ArraysKt___ArraysJvmKt.copyInto(tArr, tArr2, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static /* bridge */ /* synthetic */ <T> T[] copyOfRange(@NotNull T[] tArr, int i, int i2) {
        return (T[]) ArraysKt___ArraysJvmKt.copyOfRange(tArr, i, i2);
    }

    public static /* bridge */ /* synthetic */ <T> T first(@NotNull T[] tArr) {
        return (T) ArraysKt___ArraysKt.first(tArr);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T firstOrNull(@NotNull T[] tArr) {
        return (T) ArraysKt___ArraysKt.firstOrNull(tArr);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T getOrNull(@NotNull T[] tArr, int i) {
        return (T) ArraysKt___ArraysKt.getOrNull(tArr, i);
    }

    public static /* bridge */ /* synthetic */ <T> T last(@NotNull T[] tArr) {
        return (T) ArraysKt___ArraysKt.last(tArr);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T lastOrNull(@NotNull T[] tArr) {
        return (T) ArraysKt___ArraysKt.lastOrNull(tArr);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ <T> T[] plus(@NotNull T[] tArr, T t) {
        return (T[]) ArraysKt___ArraysJvmKt.plus(tArr, t);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ <T> T[] plus(@NotNull T[] tArr, @NotNull T[] tArr2) {
        return (T[]) ArraysKt___ArraysJvmKt.plus((Object[]) tArr, (Object[]) tArr2);
    }

    public static /* bridge */ /* synthetic */ <T> T single(@NotNull T[] tArr) {
        return (T) ArraysKt___ArraysKt.single(tArr);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T singleOrNull(@NotNull T[] tArr) {
        return (T) ArraysKt___ArraysKt.singleOrNull(tArr);
    }
}
