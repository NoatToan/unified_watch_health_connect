package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f6936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f6937b;

    public interface a {
        int getNumber();
    }

    public interface b<T extends a> {
    }

    public interface c {
        boolean a();
    }

    public interface d<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        d<E> mutableCopyWithCapacity(int i14);
    }

    static {
        Charset.forName("US-ASCII");
        f6936a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f6937b = bArr;
        ByteBuffer.wrap(bArr);
        i.d(bArr, 0, 0, false);
    }

    private z() {
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
