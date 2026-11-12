package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wrr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final asr f38297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bsr f38298b;
    public final int c;
    public final int d;

    public wrr(int i, int i2, aw6 aw6Var) {
        this.c = i;
        this.d = i2;
        this.f38298b = new bsr(h(i, i2), aw6Var);
        this.f38297a = zx5.b(a().getAlgorithmName(), b(), f(), e(), c(), i2);
    }

    public static int h(int i, int i2) throws IllegalArgumentException {
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i % i2 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i3 = i / i2;
        if (i3 != 1) {
            return i3;
        }
        throw new IllegalArgumentException("height / layers must be greater than 1");
    }

    public aw6 a() {
        return this.f38298b.b();
    }

    public int b() {
        return this.f38298b.c();
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.f38298b.f().d().c();
    }

    public int f() {
        return this.f38298b.g();
    }

    public bsr g() {
        return this.f38298b;
    }
}
