package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface jpf {
    void close();

    int getSize();

    int i(int i, byte[] bArr, int i2, int i3);

    boolean isClosed();

    byte k(int i);

    long l();

    int m(int i, byte[] bArr, int i2, int i3);

    void n(int i, jpf jpfVar, int i2, int i3);

    long o() throws UnsupportedOperationException;

    ByteBuffer p();
}
