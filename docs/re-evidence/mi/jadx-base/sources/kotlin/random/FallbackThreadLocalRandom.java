package kotlin.random;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FallbackThreadLocalRandom extends AbstractPlatformRandom {

    @NotNull
    private final FallbackThreadLocalRandom$implStorage$1 implStorage = new ThreadLocal<java.util.Random>() { // from class: kotlin.random.FallbackThreadLocalRandom$implStorage$1
        @Override // java.lang.ThreadLocal
        public java.util.Random initialValue() {
            return new java.util.Random();
        }
    };

    @Override // kotlin.random.AbstractPlatformRandom
    @NotNull
    public java.util.Random getImpl() {
        java.util.Random random = get();
        Intrinsics.checkNotNullExpressionValue(random, "get(...)");
        return random;
    }
}
