package defpackage;

import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.lang.reflect.Array;
import java.util.HashSet;

/* JADX INFO: loaded from: classes21.dex */
public final class aht {
    private a e = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f426b = null;
    private h g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f427c = null;
    private j h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f425a = null;
    private c d = null;

    public a b() {
        if (this.e == null) {
            this.e = new a();
        }
        return this.e;
    }

    public d e() {
        if (this.f426b == null) {
            this.f426b = new d();
        }
        return this.f426b;
    }

    public h f() {
        if (this.g == null) {
            this.g = new h();
        }
        return this.g;
    }

    public b d() {
        if (this.f427c == null) {
            this.f427c = new b();
        }
        return this.f427c;
    }

    public j j() {
        if (this.h == null) {
            this.h = new j();
        }
        return this.h;
    }

    public e c() {
        if (this.f425a == null) {
            this.f425a = new e();
        }
        return this.f425a;
    }

    public c a() {
        if (this.d == null) {
            this.d = new c();
        }
        return this.d;
    }

    public static final class a extends PrimitiveArrayBuilder<boolean[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final boolean[] _constructArray(int i) {
            return new boolean[i];
        }
    }

    public static final class d extends PrimitiveArrayBuilder<byte[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final byte[] _constructArray(int i) {
            return new byte[i];
        }
    }

    public static final class h extends PrimitiveArrayBuilder<short[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final short[] _constructArray(int i) {
            return new short[i];
        }
    }

    public static final class b extends PrimitiveArrayBuilder<int[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int[] _constructArray(int i) {
            return new int[i];
        }
    }

    public static final class j extends PrimitiveArrayBuilder<long[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final long[] _constructArray(int i) {
            return new long[i];
        }
    }

    public static final class e extends PrimitiveArrayBuilder<float[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final float[] _constructArray(int i) {
            return new float[i];
        }
    }

    public static final class c extends PrimitiveArrayBuilder<double[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final double[] _constructArray(int i) {
            return new double[i];
        }
    }

    public static Object b(final Object obj) {
        final int length = Array.getLength(obj);
        final Class<?> cls = obj.getClass();
        return new Object() { // from class: aht.3
            public boolean equals(Object obj2) {
                if (obj2 == this) {
                    return true;
                }
                if (!ahw.e(obj2, (Class<?>) cls) || Array.getLength(obj2) != length) {
                    return false;
                }
                for (int i = 0; i < length; i++) {
                    Object obj3 = Array.get(obj, i);
                    Object obj4 = Array.get(obj2, i);
                    if (obj3 != obj4 && obj3 != null && !obj3.equals(obj4)) {
                        return false;
                    }
                }
                return true;
            }
        };
    }

    public static <T> HashSet<T> b(T[] tArr) {
        if (tArr != null) {
            HashSet<T> hashSet = new HashSet<>(tArr.length);
            for (T t : tArr) {
                hashSet.add(t);
            }
            return hashSet;
        }
        return new HashSet<>();
    }

    public static <T> T[] d(T[] tArr, T t) {
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
}
