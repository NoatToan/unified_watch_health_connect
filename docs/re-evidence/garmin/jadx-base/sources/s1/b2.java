package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ls1/b2;", "T", "Ls1/a0;", "", "durationMillis", "delay", "Ls1/b0;", "easing", "<init>", "(IILs1/b0;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b2<T> implements a0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f155514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f155515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f155516c;

    public b2(int i14, int i15, b0 b0Var, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? 300 : i14, (i16 & 2) != 0 ? 0 : i15, (i16 & 4) != 0 ? e0.f155560a : b0Var);
    }

    @Override // s1.k
    public final f2 a(c2 c2Var) {
        return new t2(this.f155514a, this.f155515b, this.f155516c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b2) {
            b2 b2Var = (b2) obj;
            if (b2Var.f155514a == this.f155514a && b2Var.f155515b == this.f155515b && p005kotlin.jvm.internal.s.g(b2Var.f155516c, this.f155516c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f155516c.hashCode() + (this.f155514a * 31)) * 31) + this.f155515b;
    }

    @Override // s1.a0, s1.f0, s1.k
    public final k2 a(c2 c2Var) {
        return new t2(this.f155514a, this.f155515b, this.f155516c);
    }

    @Override // s1.f0, s1.k
    public final l2 a(c2 c2Var) {
        return new t2(this.f155514a, this.f155515b, this.f155516c);
    }

    public b2() {
        this(0, 0, null, 7, null);
    }

    public b2(int i14, int i15, b0 b0Var) {
        this.f155514a = i14;
        this.f155515b = i15;
        this.f155516c = b0Var;
    }
}
