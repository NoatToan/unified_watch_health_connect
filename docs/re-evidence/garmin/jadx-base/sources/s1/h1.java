package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls1/h1;", "T", "Ls1/a0;", "", "delay", "<init>", "(I)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h1<T> implements a0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f155591a;

    public /* synthetic */ h1(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14);
    }

    @Override // s1.f0, s1.k
    public final <V extends r> k2<V> a(c2<T, V> c2Var) {
        return new r2(this.f155591a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h1) && ((h1) obj).f155591a == this.f155591a;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF155591a() {
        return this.f155591a;
    }

    public h1(int i14) {
        this.f155591a = i14;
    }

    public h1() {
        this(0, 1, null);
    }
}
