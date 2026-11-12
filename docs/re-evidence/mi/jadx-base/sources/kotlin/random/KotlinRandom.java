package kotlin.random;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class KotlinRandom extends java.util.Random {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;

    @NotNull
    private final Random impl;
    private boolean seedInitialized;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public KotlinRandom(@NotNull Random impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    @NotNull
    public final Random getImpl() {
        return this.impl;
    }

    @Override // java.util.Random
    public int next(int i) {
        return this.impl.nextBits(i);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.impl.nextBoolean();
    }

    @Override // java.util.Random
    public void nextBytes(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.impl.nextBytes(bytes);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.impl.nextDouble();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.impl.nextFloat();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.impl.nextInt();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.impl.nextLong();
    }

    @Override // java.util.Random
    public void setSeed(long j) {
        if (this.seedInitialized) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.seedInitialized = true;
    }

    @Override // java.util.Random
    public int nextInt(int i) {
        return this.impl.nextInt(i);
    }
}
