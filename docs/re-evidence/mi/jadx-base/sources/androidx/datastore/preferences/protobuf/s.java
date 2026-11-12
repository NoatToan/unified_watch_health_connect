package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f2252a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f2253b = Charset.forName("ISO-8859-1");
    public static final byte[] c;
    public static final ByteBuffer d;
    public static final androidx.datastore.preferences.protobuf.g e;

    public interface a extends i<Boolean> {
    }

    public interface b extends i<Double> {
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
    }

    public interface g extends i<Integer> {
    }

    public interface h extends i<Long> {
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
        e = androidx.datastore.preferences.protobuf.g.i(bArr);
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

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i2, int i3) {
        int i4 = i(i3, bArr, i2, i3);
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public static int f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return q0.s(bArr);
    }

    public static Object h(Object obj, Object obj2) {
        return ((b0) obj).toBuilder().m((b0) obj2).buildPartial();
    }

    public static int i(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f2252a);
    }
}
