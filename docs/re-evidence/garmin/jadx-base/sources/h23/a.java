package h23;

import java.util.Random;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh23/a;", "Lh23/c;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends c {
    @Override // h23.c
    public final int a(int i14) {
        return ((-i14) >> 31) & (g().nextInt() >>> (32 - i14));
    }

    @Override // h23.c
    public final int b() {
        return g().nextInt();
    }

    @Override // h23.c
    public final int c(int i14) {
        return g().nextInt(i14);
    }

    @Override // h23.c
    public final long e() {
        return g().nextLong();
    }

    public abstract Random g();
}
