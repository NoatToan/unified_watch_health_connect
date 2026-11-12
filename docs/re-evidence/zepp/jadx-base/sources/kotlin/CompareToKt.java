package kotlin;

import kotlin.internal.InlineOnly;

/* JADX INFO: loaded from: classes23.dex */
public final class CompareToKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final <T> int a(Comparable<? super T> comparable, T t) {
        return comparable.compareTo(t);
    }
}
