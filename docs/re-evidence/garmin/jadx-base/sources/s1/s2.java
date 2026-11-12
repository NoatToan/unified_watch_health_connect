package s1;

import p005kotlin.Metadata;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Ls1/s2;", "Ls1/r;", "V", "Ls1/l2;", "", "dampingRatio", "stiffness", "Ls1/s;", "anims", "<init>", "(FFLs1/s;)V", "visibilityThreshold", "(FFLs1/r;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s2<V extends r> implements l2<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m2<V> f155739a;

    public /* synthetic */ s2(float f14, float f15, r rVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 1.0f : f14, (i14 & 2) != 0 ? 1500.0f : f15, (i14 & 4) != 0 ? null : rVar);
    }

    @Override // s1.l2, s1.f2
    public final boolean a() {
        this.f155739a.getClass();
        return false;
    }

    @Override // s1.f2
    public final long c(V v14, V v15, V v16) {
        return this.f155739a.c(v14, v15, v16);
    }

    @Override // s1.f2
    public final V d(long j8, V v14, V v15, V v16) {
        return (V) this.f155739a.d(j8, v14, v15, v16);
    }

    @Override // s1.f2
    public final V e(V v14, V v15, V v16) {
        return (V) this.f155739a.e(v14, v15, v16);
    }

    @Override // s1.f2
    public final V f(long j8, V v14, V v15, V v16) {
        return (V) this.f155739a.f(j8, v14, v15, v16);
    }

    private s2(float f14, float f15, s sVar) {
        this.f155739a = new m2<>(sVar);
    }

    public s2(float f14, float f15, V v14) {
        s h2Var;
        int[] iArr = i2.f155600a;
        if (v14 != null) {
            h2Var = new g2(v14, f14, f15);
        } else {
            h2Var = new h2(f14, f15);
        }
        this(f14, f15, h2Var);
    }
}
