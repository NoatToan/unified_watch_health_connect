package i23;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li23/a;", "Lh23/a;", "<init>", "()V", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends h23.a {
    @Override // h23.c
    public final int d(int i14, int i15) {
        return ThreadLocalRandom.current().nextInt(i14, i15);
    }

    @Override // h23.c
    public final long f(long j8, long j14) {
        return ThreadLocalRandom.current().nextLong(j8, j14);
    }

    @Override // h23.a
    public final Random g() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }
}
