package defpackage;

import java.lang.reflect.Array;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class ij1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f21186a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f21187b = null;
    public h c = null;
    public f d = null;
    public g e = null;
    public e f = null;
    public d g = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f21188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f21189b;
        public final /* synthetic */ Object c;

        public a(Class cls, int i, Object obj) {
            this.f21188a = cls;
            this.f21189b = i;
            this.c = obj;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!h04.I(obj, this.f21188a) || Array.getLength(obj) != this.f21189b) {
                return false;
            }
            for (int i = 0; i < this.f21189b; i++) {
                Object obj2 = Array.get(this.c, i);
                Object obj3 = Array.get(obj, i);
                if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class b extends o8i<boolean[]> {
        @Override // defpackage.o8i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final boolean[] a(int i) {
            return new boolean[i];
        }
    }

    public static final class c extends o8i<byte[]> {
        @Override // defpackage.o8i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final byte[] a(int i) {
            return new byte[i];
        }
    }

    public static final class d extends o8i<double[]> {
        @Override // defpackage.o8i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final double[] a(int i) {
            return new double[i];
        }
    }

    public static final class e extends o8i<float[]> {
        @Override // defpackage.o8i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final float[] a(int i) {
            return new float[i];
        }
    }

    public static final class f extends o8i<int[]> {
        @Override // defpackage.o8i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final int[] a(int i) {
            return new int[i];
        }
    }

    public static final class g extends o8i<long[]> {
        @Override // defpackage.o8i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final long[] a(int i) {
            return new long[i];
        }
    }

    public static final class h extends o8i<short[]> {
        @Override // defpackage.o8i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final short[] a(int i) {
            return new short[i];
        }
    }

    public static <T> HashSet<T> a(T[] tArr) {
        if (tArr == null) {
            return new HashSet<>();
        }
        HashSet<T> hashSet = new HashSet<>(tArr.length);
        for (T t : tArr) {
            hashSet.add(t);
        }
        return hashSet;
    }

    public static Object b(Object obj) {
        return new a(obj.getClass(), Array.getLength(obj), obj);
    }

    public static <T> T[] j(T[] tArr, T t) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (tArr[i] == t) {
                if (i == 0) {
                    return tArr;
                }
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length));
                System.arraycopy(tArr, 0, tArr2, 1, i);
                tArr2[0] = t;
                int i2 = i + 1;
                int i3 = length - i2;
                if (i3 > 0) {
                    System.arraycopy(tArr, i2, tArr2, i2, i3);
                }
                return tArr2;
            }
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + 1));
        if (length > 0) {
            System.arraycopy(tArr, 0, tArr3, 1, length);
        }
        tArr3[0] = t;
        return tArr3;
    }

    public b c() {
        if (this.f21186a == null) {
            this.f21186a = new b();
        }
        return this.f21186a;
    }

    public c d() {
        if (this.f21187b == null) {
            this.f21187b = new c();
        }
        return this.f21187b;
    }

    public d e() {
        if (this.g == null) {
            this.g = new d();
        }
        return this.g;
    }

    public e f() {
        if (this.f == null) {
            this.f = new e();
        }
        return this.f;
    }

    public f g() {
        if (this.d == null) {
            this.d = new f();
        }
        return this.d;
    }

    public g h() {
        if (this.e == null) {
            this.e = new g();
        }
        return this.e;
    }

    public h i() {
        if (this.c == null) {
            this.c = new h();
        }
        return this.c;
    }
}
