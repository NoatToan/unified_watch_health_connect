package s1;

import p005kotlin.Metadata;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls1/n2;", "Ls1/r;", "V", "Ls1/j2;", "Ls1/h0;", "floatDecaySpec", "<init>", "(Ls1/h0;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n2<V extends r> implements j2<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f155667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V f155668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V f155669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f155670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f155671e;

    public n2(h0 h0Var) {
        this.f155667a = h0Var;
        this.f155671e = h0Var.getF155595a();
    }

    @Override // s1.j2
    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getF155671e() {
        return this.f155671e;
    }

    @Override // s1.j2
    public final V b(long j8, V v14, V v15) {
        if (this.f155668b == null) {
            this.f155668b = (V) v14.c();
        }
        V v16 = this.f155668b;
        if (v16 == null) {
            p005kotlin.jvm.internal.s.m("valueVector");
            throw null;
        }
        int f155674c = v16.getF155674c();
        int i14 = 0;
        while (true) {
            V v17 = this.f155668b;
            if (i14 >= f155674c) {
                if (v17 != null) {
                    return v17;
                }
                p005kotlin.jvm.internal.s.m("valueVector");
                throw null;
            }
            if (v17 == null) {
                p005kotlin.jvm.internal.s.m("valueVector");
                throw null;
            }
            v17.e(this.f155667a.e(v14.a(i14), v15.a(i14), j8), i14);
            i14++;
        }
    }

    @Override // s1.j2
    public final long c(V v14, V v15) {
        if (this.f155669c == null) {
            this.f155669c = (V) v14.c();
        }
        V v16 = this.f155669c;
        if (v16 == null) {
            p005kotlin.jvm.internal.s.m("velocityVector");
            throw null;
        }
        int f155674c = v16.getF155674c();
        long jMax = 0;
        for (int i14 = 0; i14 < f155674c; i14++) {
            v14.getClass();
            jMax = Math.max(jMax, this.f155667a.b(v15.a(i14)));
        }
        return jMax;
    }

    @Override // s1.j2
    public final V d(long j8, V v14, V v15) {
        if (this.f155669c == null) {
            this.f155669c = (V) v14.c();
        }
        V v16 = this.f155669c;
        if (v16 == null) {
            p005kotlin.jvm.internal.s.m("velocityVector");
            throw null;
        }
        int f155674c = v16.getF155674c();
        int i14 = 0;
        while (true) {
            V v17 = this.f155669c;
            if (i14 >= f155674c) {
                if (v17 != null) {
                    return v17;
                }
                p005kotlin.jvm.internal.s.m("velocityVector");
                throw null;
            }
            if (v17 == null) {
                p005kotlin.jvm.internal.s.m("velocityVector");
                throw null;
            }
            v14.getClass();
            v17.e(this.f155667a.d(v15.a(i14), j8), i14);
            i14++;
        }
    }

    @Override // s1.j2
    public final V e(V v14, V v15) {
        if (this.f155670d == null) {
            this.f155670d = (V) v14.c();
        }
        V v16 = this.f155670d;
        if (v16 == null) {
            p005kotlin.jvm.internal.s.m("targetVector");
            throw null;
        }
        int f155674c = v16.getF155674c();
        int i14 = 0;
        while (true) {
            V v17 = this.f155670d;
            if (i14 >= f155674c) {
                if (v17 != null) {
                    return v17;
                }
                p005kotlin.jvm.internal.s.m("targetVector");
                throw null;
            }
            if (v17 == null) {
                p005kotlin.jvm.internal.s.m("targetVector");
                throw null;
            }
            v17.e(this.f155667a.c(v14.a(i14), v15.a(i14)), i14);
            i14++;
        }
    }
}
