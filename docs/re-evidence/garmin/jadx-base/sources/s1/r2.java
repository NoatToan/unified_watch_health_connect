package s1;

import p005kotlin.Metadata;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls1/r2;", "Ls1/r;", "V", "Ls1/k2;", "", "delayMillis", "<init>", "(I)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r2<V extends r> implements k2<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f155734a;

    public /* synthetic */ r2(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14);
    }

    @Override // s1.k2
    public final int b() {
        return 0;
    }

    @Override // s1.f2
    public final V d(long j8, V v14, V v15, V v16) {
        return v16;
    }

    @Override // s1.f2
    public final V f(long j8, V v14, V v15, V v16) {
        return j8 < ((long) this.f155734a) * 1000000 ? v14 : v15;
    }

    @Override // s1.k2
    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getF155734a() {
        return this.f155734a;
    }

    public r2(int i14) {
        this.f155734a = i14;
    }

    public r2() {
        this(0, 1, null);
    }
}
