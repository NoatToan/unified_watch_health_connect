package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f9618a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f9619b = Charset.forName("ISO-8859-1");
    public static final byte[] c;
    public static final ByteBuffer d;
    public static final j e;

    public interface a extends i<Boolean> {
        @Override // com.google.protobuf.d0.i, com.google.protobuf.d0.f
        i<Boolean> a(int i);

        boolean getBoolean(int i);

        void p(boolean z);

        boolean s(int i, boolean z);
    }

    public interface b extends i<Double> {
        @Override // com.google.protobuf.d0.i, com.google.protobuf.d0.f
        i<Double> a(int i);
    }

    public interface c {
        int getNumber();
    }

    public interface d<T extends c> {
        T findValueByNumber(int i);
    }

    public interface e {
        boolean isInRange(int i);
    }

    public interface f extends i<Float> {
        void J(float f);

        float M(int i, float f);

        @Override // 
        i<Float> a(int i);

        float getFloat(int i);
    }

    public interface g extends i<Integer> {
        int K(int i, int i2);

        void Q(int i);

        @Override // com.google.protobuf.d0.i, com.google.protobuf.d0.f
        i<Integer> a(int i);

        int getInt(int i);
    }

    public interface h extends i<Long> {
        @Override // com.google.protobuf.d0.i, com.google.protobuf.d0.f
        i<Long> a(int i);
    }

    public interface i<E> extends List<E>, RandomAccess {
        i<E> a(int i);

        void b();

        boolean c();
    }

    static {
        byte[] bArr = new byte[0];
        c = bArr;
        d = ByteBuffer.wrap(bArr);
        e = j.k(bArr);
    }

    public static <T> T a(T t) {
        t.getClass();
        return t;
    }

    public static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static <T extends q0> T c(Class<T> cls) {
        try {
            java.lang.reflect.Method method = cls.getMethod("getDefaultInstance", new Class[0]);
            return (T) method.invoke(method, new Object[0]);
        } catch (Exception e2) {
            throw new RuntimeException("Failed to get default instance for " + cls, e2);
        }
    }

    public static int d(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public static int f(byte[] bArr, int i2, int i3) {
        int iL = l(i3, bArr, i2, i3);
        if (iL == 0) {
            return 1;
        }
        return iL;
    }

    public static int g(c cVar) {
        return cVar.getNumber();
    }

    public static int h(List<? extends c> list) {
        Iterator<? extends c> it = list.iterator();
        int iG = 1;
        while (it.hasNext()) {
            iG = (iG * 31) + g(it.next());
        }
        return iG;
    }

    public static int i(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean j(byte[] bArr) {
        return v1.s(bArr);
    }

    public static Object k(Object obj, Object obj2) {
        return ((q0) obj).toBuilder().mergeFrom((q0) obj2).buildPartial();
    }

    public static int l(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static String m(byte[] bArr) {
        return new String(bArr, f9618a);
    }
}
