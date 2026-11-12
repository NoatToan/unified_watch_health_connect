package z33;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f202205a;

    public interface a {
        int getNumber();
    }

    public interface b<T extends a> {
        T findValueByNumber(int i14);
    }

    static {
        byte[] bArr = new byte[0];
        f202205a = bArr;
        ByteBuffer.wrap(bArr);
    }
}
