package androidx.health.platform.client.proto;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f7708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f7709b;

    public interface a {
        int getNumber();
    }

    public interface b<T extends a> {
    }

    public interface c {
        boolean isInRange(int i14);
    }

    public interface d<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        d<E> mutableCopyWithCapacity(int i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Charset.forName("US-ASCII");
        f7708a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f7709b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new j.b(bArr, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0).g(0);
        } catch (InvalidProtocolBufferException e4) {
            yc.l2.t(e4);
        }
    }

    private l0() {
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        j20.x.l(str);
    }

    public static int b(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }
}
