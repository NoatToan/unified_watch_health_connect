package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;

/* JADX INFO: loaded from: classes20.dex */
public class zpl extends OutputStream implements OutputStreamWithSplitZipSupport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f54439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f54441c;
    private RandomAccessFile d;
    private zqn e;
    private File h;

    public zpl(File file) throws ZipException, FileNotFoundException {
        this(file, -1L);
    }

    public zpl(File file, long j) throws ZipException, FileNotFoundException {
        this.e = new zqn();
        if (j >= 0 && j < 65536) {
            throw new ZipException("split length less than minimum allowed split length of 65536 Bytes");
        }
        this.d = new RandomAccessFile(file, RandomAccessFileMode.WRITE.getValue());
        this.f54441c = j;
        this.h = file;
        this.f54440b = 0;
        this.f54439a = 0L;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= 0) {
            return;
        }
        long j = this.f54441c;
        if (j == -1) {
            this.d.write(bArr, i, i2);
            this.f54439a += (long) i2;
            return;
        }
        long j2 = this.f54439a;
        if (j2 >= j) {
            d();
            this.d.write(bArr, i, i2);
            this.f54439a = i2;
            return;
        }
        long j3 = i2;
        if (j2 + j3 > j) {
            if (e(bArr)) {
                d();
                this.d.write(bArr, i, i2);
                this.f54439a = j3;
                return;
            } else {
                this.d.write(bArr, i, (int) (this.f54441c - this.f54439a));
                d();
                RandomAccessFile randomAccessFile = this.d;
                long j4 = this.f54441c - this.f54439a;
                randomAccessFile.write(bArr, i + ((int) j4), (int) (j3 - j4));
                this.f54439a = j3 - (this.f54441c - this.f54439a);
                return;
            }
        }
        this.d.write(bArr, i, i2);
        this.f54439a += j3;
    }

    private void d() throws IOException {
        String str;
        String strC = zqk.c(this.h.getName());
        String absolutePath = this.h.getAbsolutePath();
        if (this.h.getParent() == null) {
            str = "";
        } else {
            str = this.h.getParent() + System.getProperty("file.separator");
        }
        String str2 = ".z0" + (this.f54440b + 1);
        if (this.f54440b >= 9) {
            str2 = ".z" + (this.f54440b + 1);
        }
        File file = new File(str + strC + str2);
        this.d.close();
        if (file.exists()) {
            throw new IOException("split file: " + file.getName() + " already exists in the current directory, cannot rename this file");
        }
        if (!this.h.renameTo(file)) {
            throw new IOException("cannot rename newly created split file");
        }
        this.h = new File(absolutePath);
        this.d = new RandomAccessFile(this.h, RandomAccessFileMode.WRITE.getValue());
        this.f54440b++;
    }

    private boolean e(byte[] bArr) {
        int iA = this.e.a(bArr);
        for (HeaderSignature headerSignature : HeaderSignature.values()) {
            if (headerSignature != HeaderSignature.SPLIT_ZIP && headerSignature.getValue() == iA) {
                return true;
            }
        }
        return false;
    }

    public boolean b(int i) throws ZipException {
        if (i < 0) {
            throw new ZipException("negative buffersize for checkBufferSizeAndStartNextSplitFile");
        }
        if (c(i)) {
            return false;
        }
        try {
            d();
            this.f54439a = 0L;
            return true;
        } catch (IOException e) {
            throw new ZipException(e);
        }
    }

    private boolean c(int i) {
        long j = this.f54441c;
        return j < 65536 || this.f54439a + ((long) i) <= j;
    }

    public void a(long j) throws IOException {
        this.d.seek(j);
    }

    public int a(int i) throws IOException {
        return this.d.skipBytes(i);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.d.close();
    }

    @Override // net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport
    public long getFilePointer() throws IOException {
        return this.d.getFilePointer();
    }

    public boolean e() {
        return this.f54441c != -1;
    }

    public long c() {
        return this.f54441c;
    }

    @Override // net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport
    public int getCurrentSplitFileCounter() {
        return this.f54440b;
    }
}
