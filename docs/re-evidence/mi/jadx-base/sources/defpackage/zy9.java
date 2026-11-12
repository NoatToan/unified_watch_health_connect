package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zy9<T> implements pei<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f41801a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static int a() {
        return f41801a;
    }

    public final zy9<T> b() {
        return c(a(), false, true);
    }

    public final zy9<T> c(int i, boolean z, boolean z2) {
        x3h.e(i, "capacity");
        return t5l.k(new cz9(this, i, z2, z, hua.c));
    }

    public final zy9<T> d() {
        return t5l.k(new dz9(this));
    }

    public final zy9<T> e() {
        return t5l.k(new fz9(this));
    }
}
