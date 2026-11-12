package w63;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public interface g extends g0, ReadableByteChannel {
    long E0(h hVar);

    void E3(long j8);

    boolean F1();

    boolean F3(long j8, h hVar);

    long G1();

    byte[] J2();

    long L0();

    String P2(Charset charset);

    long V3(f0 f0Var);

    boolean b(long j8);

    String c1(long j8);

    /* JADX INFO: renamed from: d */
    e getF183329b();

    void e2(e eVar, long j8);

    h h0(long j8);

    int j1(w wVar);

    @o13.e
    e j3();

    long o3(long j8, h hVar);

    b0 peek();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    String s1();

    void skip(long j8);

    long t1(h hVar);

    InputStream v4();

    h z0();
}
