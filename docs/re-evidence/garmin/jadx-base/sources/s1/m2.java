package s1;

import p005kotlin.Metadata;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Ls1/m2;", "Ls1/r;", "V", "Ls1/l2;", "Ls1/s;", "anims", "<init>", "(Ls1/s;)V", "Ls1/g0;", "anim", "(Ls1/g0;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m2<V extends r> implements l2<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f155637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V f155638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V f155639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f155640d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"s1/m2$a", "Ls1/s;", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g0 f155641a;

        public a(g0 g0Var) {
            this.f155641a = g0Var;
        }

        @Override // s1.s
        public final g0 get(int i14) {
            return this.f155641a;
        }
    }

    public m2(g0 g0Var) {
        this(new a(g0Var));
    }

    @Override // s1.f2
    public final long c(V v14, V v15, V v16) {
        int f155674c = v14.getF155674c();
        long jMax = 0;
        for (int i14 = 0; i14 < f155674c; i14++) {
            jMax = Math.max(jMax, this.f155637a.get(i14).b(v14.a(i14), v15.a(i14), v16.a(i14)));
        }
        return jMax;
    }

    @Override // s1.f2
    public final V d(long j8, V v14, V v15, V v16) {
        if (this.f155639c == null) {
            this.f155639c = (V) v16.c();
        }
        V v17 = this.f155639c;
        if (v17 == null) {
            p005kotlin.jvm.internal.s.m("velocityVector");
            throw null;
        }
        int f155674c = v17.getF155674c();
        int i14 = 0;
        while (true) {
            V v18 = this.f155639c;
            if (i14 >= f155674c) {
                if (v18 != null) {
                    return v18;
                }
                p005kotlin.jvm.internal.s.m("velocityVector");
                throw null;
            }
            if (v18 == null) {
                p005kotlin.jvm.internal.s.m("velocityVector");
                throw null;
            }
            v18.e(this.f155637a.get(i14).c(v14.a(i14), v15.a(i14), v16.a(i14), j8), i14);
            i14++;
        }
    }

    @Override // s1.f2
    public final V e(V v14, V v15, V v16) {
        if (this.f155640d == null) {
            this.f155640d = (V) v16.c();
        }
        V v17 = this.f155640d;
        if (v17 == null) {
            p005kotlin.jvm.internal.s.m("endVelocityVector");
            throw null;
        }
        int f155674c = v17.getF155674c();
        int i14 = 0;
        while (true) {
            V v18 = this.f155640d;
            if (i14 >= f155674c) {
                if (v18 != null) {
                    return v18;
                }
                p005kotlin.jvm.internal.s.m("endVelocityVector");
                throw null;
            }
            if (v18 == null) {
                p005kotlin.jvm.internal.s.m("endVelocityVector");
                throw null;
            }
            v18.e(this.f155637a.get(i14).e(v14.a(i14), v15.a(i14), v16.a(i14)), i14);
            i14++;
        }
    }

    @Override // s1.f2
    public final V f(long j8, V v14, V v15, V v16) {
        if (this.f155638b == null) {
            this.f155638b = (V) v14.c();
        }
        V v17 = this.f155638b;
        if (v17 == null) {
            p005kotlin.jvm.internal.s.m("valueVector");
            throw null;
        }
        int f155674c = v17.getF155674c();
        int i14 = 0;
        while (true) {
            V v18 = this.f155638b;
            if (i14 >= f155674c) {
                if (v18 != null) {
                    return v18;
                }
                p005kotlin.jvm.internal.s.m("valueVector");
                throw null;
            }
            if (v18 == null) {
                p005kotlin.jvm.internal.s.m("valueVector");
                throw null;
            }
            v18.e(this.f155637a.get(i14).d(v14.a(i14), v15.a(i14), v16.a(i14), j8), i14);
            i14++;
        }
    }

    public m2(s sVar) {
        this.f155637a = sVar;
    }
}
