package javazoom.jl.decoder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import org.cybergarage.upnp.Argument;

/* JADX INFO: loaded from: classes23.dex */
public class InputStreamSource implements Source {
    private final InputStream a;

    public InputStreamSource(InputStream inputStream) {
        Objects.requireNonNull(inputStream, Argument.IN);
        this.a = inputStream;
    }

    @Override // javazoom.jl.decoder.Source
    public boolean isSeekable() {
        return false;
    }

    @Override // javazoom.jl.decoder.Source
    public long length() {
        return -1L;
    }

    @Override // javazoom.jl.decoder.Source
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.a.read(bArr, i, i2);
    }

    @Override // javazoom.jl.decoder.Source
    public long seek(long j) {
        return -1L;
    }

    @Override // javazoom.jl.decoder.Source
    public long tell() {
        return -1L;
    }

    @Override // javazoom.jl.decoder.Source
    public boolean willReadBlock() {
        return true;
    }
}
