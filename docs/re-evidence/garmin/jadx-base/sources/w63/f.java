package w63;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes3.dex */
public interface f extends f0, WritableByteChannel {
    long G3(g0 g0Var);

    f O3(h hVar);

    f T2(long j8);

    f Z0();

    e d();

    f d4(int i14, int i15, String str);

    f e0(long j8);

    @Override // w63.f0, java.io.Flushable
    void flush();

    f h1(String str);

    f l3();

    f p4(int i14, int i15, byte[] bArr);

    OutputStream t4();

    f write(byte[] bArr);

    f writeByte(int i14);

    f writeInt(int i14);

    f writeShort(int i14);
}
