package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;

/* JADX INFO: loaded from: classes20.dex */
public class zpc extends RandomAccessFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File[] f54424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RandomAccessFile f54425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54426c;
    private byte[] d;
    private String e;
    private long j;

    public zpc(File file, String str, File[] fileArr) throws IOException {
        super(file, str);
        this.d = new byte[1];
        this.f54426c = 0;
        super.close();
        if (RandomAccessFileMode.WRITE.getValue().equals(str)) {
            throw new IllegalArgumentException("write mode is not allowed for NumberedSplitRandomAccessFile");
        }
        a(fileArr);
        this.f54425b = new RandomAccessFile(file, str);
        this.f54424a = fileArr;
        this.j = file.length();
        this.e = str;
    }

    @Override // java.io.RandomAccessFile
    public int read() throws IOException {
        if (read(this.d) == -1) {
            return -1;
        }
        return this.d[0] & 255;
    }

    @Override // java.io.RandomAccessFile
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.RandomAccessFile
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f54425b.read(bArr, i, i2);
        if (i3 != -1) {
            return i3;
        }
        int i4 = this.f54426c;
        if (i4 == this.f54424a.length - 1) {
            return -1;
        }
        e(i4 + 1);
        return read(bArr, i, i2);
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public void write(int i) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public void write(byte[] bArr, int i, int i2) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.RandomAccessFile
    public void seek(long j) throws IOException {
        int i = (int) (j / this.j);
        if (i != this.f54426c) {
            e(i);
        }
        this.f54425b.seek(j - (((long) i) * this.j));
    }

    @Override // java.io.RandomAccessFile
    public long getFilePointer() throws IOException {
        return this.f54425b.getFilePointer();
    }

    @Override // java.io.RandomAccessFile
    public long length() throws IOException {
        return this.f54425b.length();
    }

    @Override // java.io.RandomAccessFile, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        RandomAccessFile randomAccessFile = this.f54425b;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        super.close();
    }

    public void b(long j) throws IOException {
        this.f54425b.seek(j);
    }

    public void b() throws IOException {
        e(this.f54424a.length - 1);
    }

    private void e(int i) throws IOException {
        if (this.f54426c == i) {
            return;
        }
        if (i > this.f54424a.length - 1) {
            throw new IOException("split counter greater than number of split files");
        }
        RandomAccessFile randomAccessFile = this.f54425b;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        this.f54425b = new RandomAccessFile(this.f54424a[i], this.e);
        this.f54426c = i;
    }

    private void a(File[] fileArr) throws IOException {
        int i = 1;
        for (File file : fileArr) {
            String strD = zqk.d(file);
            try {
                if (i != Integer.parseInt(strD)) {
                    throw new IOException("Split file number " + i + " does not exist");
                }
                i++;
            } catch (NumberFormatException unused) {
                throw new IOException("Split file extension not in expected format. Found: " + strD + " expected of format: .001, .002, etc");
            }
        }
    }
}
