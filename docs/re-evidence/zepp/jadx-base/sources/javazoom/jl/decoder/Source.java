package javazoom.jl.decoder;

import java.io.IOException;

/* JADX INFO: loaded from: classes23.dex */
public interface Source {
    public static final long LENGTH_UNKNOWN = -1;

    boolean isSeekable();

    long length();

    int read(byte[] bArr, int i, int i2) throws IOException;

    long seek(long j);

    long tell();

    boolean willReadBlock();
}
