package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.io.ByteSource;
import com.google.common.io.ElementTypesAreNonnullByDefault;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class ape extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private InputStream f647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator<? extends ByteSource> f648c;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public ape(Iterator<? extends ByteSource> it) throws IOException {
        this.f648c = (Iterator) Preconditions.checkNotNull(it);
        e();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f647b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f647b = null;
            }
        }
    }

    private void e() throws IOException {
        close();
        if (this.f648c.hasNext()) {
            this.f647b = this.f648c.next().openStream();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f647b;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f647b;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read();
            if (i != -1) {
                return i;
            }
            e();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Preconditions.checkNotNull(bArr);
        while (true) {
            InputStream inputStream = this.f647b;
            if (inputStream == null) {
                return -1;
            }
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                return i3;
            }
            e();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        InputStream inputStream = this.f647b;
        if (inputStream == null || j <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(j);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f647b.skip(j - 1) + 1;
    }
}
