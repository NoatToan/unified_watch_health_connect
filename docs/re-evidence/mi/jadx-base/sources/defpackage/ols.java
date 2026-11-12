package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class ols extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enumeration f29282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputStream f29283b;

    public ols(Enumeration enumeration) throws IOException {
        this.f29282a = enumeration;
        a();
    }

    public final void a() throws IOException {
        InputStream inputStream = this.f29283b;
        if (inputStream != null) {
            inputStream.close();
        }
        if (this.f29282a.hasMoreElements()) {
            this.f29283b = new FileInputStream((File) this.f29282a.nextElement());
        } else {
            this.f29283b = null;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f29283b;
        if (inputStream != null) {
            inputStream.close();
            this.f29283b = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f29283b;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read();
            if (i != -1) {
                return i;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f29283b == null) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        do {
            int i3 = this.f29283b.read(bArr, i, i2);
            if (i3 > 0) {
                return i3;
            }
            a();
        } while (this.f29283b != null);
        return -1;
    }
}
