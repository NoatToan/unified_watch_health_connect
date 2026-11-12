package kotlin.reflect.jvm.internal.pcollections;

/* JADX INFO: loaded from: classes23.dex */
final class b<V> {
    public static final b<Object> f = new b<>();
    private final long a;
    private final V b;
    private final b<V> c;
    private final b<V> d;
    private final int e;

    private b() {
        this.e = 0;
        this.a = 0L;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    private long b() {
        b<V> bVar = this.c;
        return bVar.e == 0 ? this.a : bVar.b() + this.a;
    }

    private static <V> b<V> e(long j, V v, b<V> bVar, b<V> bVar2) {
        int i = ((b) bVar).e;
        int i2 = ((b) bVar2).e;
        if (i + i2 > 1) {
            if (i >= i2 * 5) {
                b<V> bVar3 = ((b) bVar).c;
                b<V> bVar4 = ((b) bVar).d;
                if (((b) bVar4).e < ((b) bVar3).e * 2) {
                    long j2 = ((b) bVar).a;
                    return new b<>(j2 + j, ((b) bVar).b, bVar3, new b(-j2, v, bVar4.g(((b) bVar4).a + j2), bVar2));
                }
                b<V> bVar5 = ((b) bVar4).c;
                b<V> bVar6 = ((b) bVar4).d;
                long j3 = ((b) bVar4).a;
                long j4 = ((b) bVar).a + j3 + j;
                V v2 = ((b) bVar4).b;
                b bVar7 = new b(-j3, ((b) bVar).b, bVar3, bVar5.g(((b) bVar5).a + j3));
                long j5 = ((b) bVar).a;
                long j6 = ((b) bVar4).a;
                return new b<>(j4, v2, bVar7, new b((-j5) - j6, v, bVar6.g(((b) bVar6).a + j6 + j5), bVar2));
            }
            if (i2 >= i * 5) {
                b<V> bVar8 = ((b) bVar2).c;
                b<V> bVar9 = ((b) bVar2).d;
                if (((b) bVar8).e < ((b) bVar9).e * 2) {
                    long j7 = ((b) bVar2).a;
                    return new b<>(j7 + j, ((b) bVar2).b, new b(-j7, v, bVar, bVar8.g(((b) bVar8).a + j7)), bVar9);
                }
                b<V> bVar10 = ((b) bVar8).c;
                b<V> bVar11 = ((b) bVar8).d;
                long j8 = ((b) bVar8).a;
                long j9 = ((b) bVar2).a;
                long j10 = j8 + j9 + j;
                V v3 = ((b) bVar8).b;
                b bVar12 = new b((-j9) - j8, v, bVar, bVar10.g(((b) bVar10).a + j8 + j9));
                long j11 = ((b) bVar8).a;
                return new b<>(j10, v3, bVar12, new b(-j11, ((b) bVar2).b, bVar11.g(((b) bVar11).a + j11), bVar9));
            }
        }
        return new b<>(j, v, bVar, bVar2);
    }

    private b<V> f(b<V> bVar, b<V> bVar2) {
        return (bVar == this.c && bVar2 == this.d) ? this : e(this.a, this.b, bVar, bVar2);
    }

    private b<V> g(long j) {
        return (this.e == 0 || j == this.a) ? this : new b<>(j, this.b, this.c, this.d);
    }

    public V a(long j) {
        if (this.e == 0) {
            return null;
        }
        long j2 = this.a;
        if (j < j2) {
            return this.c.a(j - j2);
        }
        return j > j2 ? this.d.a(j - j2) : this.b;
    }

    public b<V> c(long j) {
        if (this.e == 0) {
            return this;
        }
        long j2 = this.a;
        if (j < j2) {
            return f(this.c.c(j - j2), this.d);
        }
        if (j > j2) {
            return f(this.c, this.d.c(j - j2));
        }
        b<V> bVar = this.c;
        if (bVar.e == 0) {
            b<V> bVar2 = this.d;
            return bVar2.g(bVar2.a + j2);
        }
        b<V> bVar3 = this.d;
        if (bVar3.e == 0) {
            return bVar.g(bVar.a + j2);
        }
        long jB = bVar3.b();
        long j3 = this.a;
        long j4 = jB + j3;
        V vA = this.d.a(j4 - j3);
        b<V> bVarC = this.d.c(j4 - this.a);
        b<V> bVarG = bVarC.g((bVarC.a + this.a) - j4);
        b<V> bVar4 = this.c;
        return e(j4, vA, bVar4.g((bVar4.a + this.a) - j4), bVarG);
    }

    public b<V> d(long j, V v) {
        if (this.e == 0) {
            return new b<>(j, v, this, this);
        }
        long j2 = this.a;
        if (j < j2) {
            return f(this.c.d(j - j2, v), this.d);
        }
        if (j > j2) {
            return f(this.c, this.d.d(j - j2, v));
        }
        return v == this.b ? this : new b<>(j, v, this.c, this.d);
    }

    private b(long j, V v, b<V> bVar, b<V> bVar2) {
        this.a = j;
        this.b = v;
        this.c = bVar;
        this.d = bVar2;
        this.e = bVar.e + 1 + bVar2.e;
    }
}
