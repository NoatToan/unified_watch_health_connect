package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls1/j1;", "T", "Ls1/f0;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFLjava/lang/Object;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j1<T> implements f0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f155614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f155615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f155616c;

    public /* synthetic */ j1(float f14, float f15, Object obj, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 1.0f : f14, (i14 & 2) != 0 ? 1500.0f : f15, (i14 & 4) != 0 ? null : obj);
    }

    @Override // s1.k
    public final f2 a(c2 c2Var) {
        T t7 = this.f155616c;
        return new s2(this.f155614a, this.f155615b, t7 == null ? null : (r) c2Var.a().invoke(t7));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            if (j1Var.f155614a == this.f155614a && j1Var.f155615b == this.f155615b && p005kotlin.jvm.internal.s.g(j1Var.f155616c, this.f155616c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        T t7 = this.f155616c;
        return Float.hashCode(this.f155615b) + q6.f.d(this.f155614a, (t7 != null ? t7.hashCode() : 0) * 31, 31);
    }

    public j1(float f14, float f15, T t7) {
        this.f155614a = f14;
        this.f155615b = f15;
        this.f155616c = t7;
    }

    public j1() {
        this(0.0f, 0.0f, null, 7, null);
    }

    @Override // s1.f0, s1.k
    public final l2 a(c2 c2Var) {
        T t7 = this.f155616c;
        return new s2(this.f155614a, this.f155615b, t7 == null ? null : (r) c2Var.a().invoke(t7));
    }
}
