package ys2;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lys2/f;", "Lys2/e;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f199221a;

    public f(File file) {
        file.getClass();
        this.f199221a = new RandomAccessFile(file, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
    }

    @Override // ys2.e
    public final int a(int i14, int i15, byte[] bArr) throws IOException {
        bArr.getClass();
        RandomAccessFile randomAccessFile = this.f199221a;
        int iMin = Math.min((int) (randomAccessFile.length() - randomAccessFile.getFilePointer()), i15);
        int i16 = 0;
        while (i16 < iMin) {
            int i17 = randomAccessFile.read(bArr, i14 + i16, iMin - i16);
            if (i17 == -1) {
                break;
            }
            i16 += i17;
        }
        return i16;
    }

    @Override // ys2.e
    public final void b(int i14) throws IOException {
        if (i14 < getSize()) {
            this.f199221a.seek(i14);
        }
    }

    @Override // ys2.e
    public final void close() throws IOException {
        this.f199221a.close();
    }

    @Override // ys2.e
    public final int getSize() {
        return (int) this.f199221a.length();
    }
}
