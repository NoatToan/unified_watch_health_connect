package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Pair;
import defpackage.njh;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\n¢\u0006\u0004\b\u0003\u0010\u0004\u001a,\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\n¢\u0006\u0004\b\u0005\u0010\u0004\u001a8\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a8\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a,\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0087\n¢\u0006\u0004\b\u0003\u0010\f\u001a,\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0087\n¢\u0006\u0004\b\u0005\u0010\f\u001a8\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\b¢\u0006\u0004\b\u0007\u0010\r\u001a8\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"F", "S", "Lnjh;", "component1", "(Lnjh;)Ljava/lang/Object;", "component2", "Lkotlin/Pair;", "toKotlinPair", "(Lnjh;)Lkotlin/Pair;", "toAndroidXPair", "(Lkotlin/Pair;)Lnjh;", "Landroid/util/Pair;", "(Landroid/util/Pair;)Ljava/lang/Object;", "(Landroid/util/Pair;)Lkotlin/Pair;", "toAndroidPair", "(Lkotlin/Pair;)Landroid/util/Pair;", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
public final class PairKt {
    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(@NotNull njh<F, S> njhVar) {
        return njhVar.f27979a;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(@NotNull njh<F, S> njhVar) {
        return njhVar.f27980b;
    }

    @NotNull
    public static final <F, S> Pair<F, S> toAndroidPair(@NotNull kotlin.Pair<? extends F, ? extends S> pair) {
        return new Pair<>(pair.getFirst(), pair.getSecond());
    }

    @NotNull
    public static final <F, S> njh<F, S> toAndroidXPair(@NotNull kotlin.Pair<? extends F, ? extends S> pair) {
        return new njh<>(pair.getFirst(), pair.getSecond());
    }

    @NotNull
    public static final <F, S> kotlin.Pair<F, S> toKotlinPair(@NotNull njh<F, S> njhVar) {
        return new kotlin.Pair<>(njhVar.f27979a, njhVar.f27980b);
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(@NotNull Pair<F, S> pair) {
        return (F) pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(@NotNull Pair<F, S> pair) {
        return (S) pair.second;
    }

    @NotNull
    public static final <F, S> kotlin.Pair<F, S> toKotlinPair(@NotNull Pair<F, S> pair) {
        return new kotlin.Pair<>(pair.first, pair.second);
    }
}
