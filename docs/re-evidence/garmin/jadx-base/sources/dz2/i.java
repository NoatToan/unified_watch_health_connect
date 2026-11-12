package dz2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import o13.m;
import o13.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldz2/i;", "Ldz2/b;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "util-io_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f61814b;

    public i(File file) {
        file.getClass();
        this.f61814b = m.b(new g(file, 1));
    }

    @Override // dz2.b
    public final int b(int i14, int i15, byte[] bArr) throws IOException {
        bArr.getClass();
        int iMin = Math.min((int) (f().length() - f().getFilePointer()), i15);
        f().readFully(bArr, i14, iMin);
        return iMin;
    }

    @Override // dz2.b
    public final void close() throws IOException {
        f().close();
    }

    @Override // dz2.b
    public final boolean d() {
        return f().getFilePointer() < f().length();
    }

    @Override // dz2.b
    public final byte[] e(int i14) throws IOException {
        int iMin = Math.min(i14, (int) (f().length() - f().getFilePointer()));
        byte[] bArr = new byte[iMin];
        b(0, iMin, bArr);
        return bArr;
    }

    public final RandomAccessFile f() {
        return (RandomAccessFile) this.f61814b.getValue();
    }

    @Override // dz2.b
    /* JADX INFO: renamed from: getSize */
    public final long getF61810d() {
        return f().length();
    }

    @Override // dz2.b
    public final void setPosition(long j8) throws IOException {
        if (j8 < 0) {
            f().seek(0L);
        } else if (j8 < getF61810d()) {
            f().seek(j8);
        } else {
            f().seek(getF61810d());
        }
    }
}
