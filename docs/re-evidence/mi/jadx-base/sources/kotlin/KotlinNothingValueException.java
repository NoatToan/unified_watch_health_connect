package kotlin;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.4")
@PublishedApi
public final class KotlinNothingValueException extends RuntimeException {
    public KotlinNothingValueException() {
    }

    public KotlinNothingValueException(@Nullable String str) {
        super(str);
    }

    public KotlinNothingValueException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public KotlinNothingValueException(@Nullable Throwable th) {
        super(th);
    }
}
