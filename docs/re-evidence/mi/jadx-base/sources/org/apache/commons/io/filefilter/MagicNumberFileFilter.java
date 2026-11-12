package org.apache.commons.io.filefilter;

import defpackage.dvc;
import defpackage.r00;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class MagicNumberFileFilter extends r00 implements Serializable {
    private static final long serialVersionUID = -547733176983104172L;
    private final long byteOffset;
    private final byte[] magicNumbers;

    public MagicNumberFileFilter(byte[] bArr) {
        this(bArr, 0L);
    }

    @Override // defpackage.r00, defpackage.yuc, java.io.FileFilter
    public boolean accept(File file) throws Throwable {
        if (file != null && file.isFile() && file.canRead()) {
            RandomAccessFile randomAccessFile = null;
            try {
                byte[] bArr = new byte[this.magicNumbers.length];
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile2.seek(this.byteOffset);
                    int i = randomAccessFile2.read(bArr);
                    byte[] bArr2 = this.magicNumbers;
                    if (i != bArr2.length) {
                        dvc.a(randomAccessFile2);
                        return false;
                    }
                    boolean zEquals = Arrays.equals(bArr2, bArr);
                    dvc.a(randomAccessFile2);
                    return zEquals;
                } catch (IOException unused) {
                    randomAccessFile = randomAccessFile2;
                    dvc.a(randomAccessFile);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    dvc.a(randomAccessFile);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    @Override // defpackage.r00
    public String toString() {
        return super.toString() + "(" + new String(this.magicNumbers) + "," + this.byteOffset + ")";
    }

    public MagicNumberFileFilter(String str) {
        this(str, 0L);
    }

    public MagicNumberFileFilter(String str, long j) {
        if (str != null) {
            if (str.length() == 0) {
                throw new IllegalArgumentException("The magic number must contain at least one byte");
            }
            if (j >= 0) {
                this.magicNumbers = str.getBytes();
                this.byteOffset = j;
                return;
            }
            throw new IllegalArgumentException("The offset cannot be negative");
        }
        throw new IllegalArgumentException("The magic number cannot be null");
    }

    public MagicNumberFileFilter(byte[] bArr, long j) {
        if (bArr != null) {
            if (bArr.length == 0) {
                throw new IllegalArgumentException("The magic number must contain at least one byte");
            }
            if (j >= 0) {
                byte[] bArr2 = new byte[bArr.length];
                this.magicNumbers = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.byteOffset = j;
                return;
            }
            throw new IllegalArgumentException("The offset cannot be negative");
        }
        throw new IllegalArgumentException("The magic number cannot be null");
    }
}
