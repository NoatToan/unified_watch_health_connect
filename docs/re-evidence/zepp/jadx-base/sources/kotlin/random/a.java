package kotlin.random;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
final class a extends java.util.Random {

    @NotNull
    private static final C1160a c = new C1160a(null);

    @Deprecated
    private static final long serialVersionUID = 0;

    @NotNull
    private final Random a;
    private boolean b;

    /* JADX INFO: renamed from: kotlin.random.a$a, reason: collision with other inner class name */
    public static final class C1160a {
        private C1160a() {
        }

        public /* synthetic */ C1160a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(@NotNull Random random) {
        this.a = random;
    }

    @NotNull
    public final Random a() {
        return this.a;
    }

    @Override // java.util.Random
    public int next(int i) {
        return this.a.nextBits(i);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.a.nextBoolean();
    }

    @Override // java.util.Random
    public void nextBytes(@NotNull byte[] bArr) {
        this.a.nextBytes(bArr);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.a.nextDouble();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.a.nextFloat();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.a.nextInt();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.a.nextLong();
    }

    @Override // java.util.Random
    public void setSeed(long j) {
        if (this.b) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.b = true;
    }

    @Override // java.util.Random
    public int nextInt(int i) {
        return this.a.nextInt(i);
    }
}
