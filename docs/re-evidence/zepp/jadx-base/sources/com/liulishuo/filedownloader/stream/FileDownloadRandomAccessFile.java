package com.liulishuo.filedownloader.stream;

import com.liulishuo.filedownloader.util.FileDownloadHelper;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadRandomAccessFile implements FileDownloadOutputStream {
    private final BufferedOutputStream a;
    private final FileDescriptor b;
    private final RandomAccessFile c;

    public static class Creator implements FileDownloadHelper.OutputStreamCreator {
        @Override // com.liulishuo.filedownloader.util.FileDownloadHelper.OutputStreamCreator
        public FileDownloadOutputStream create(File file) throws IOException {
            return new FileDownloadRandomAccessFile(file);
        }

        @Override // com.liulishuo.filedownloader.util.FileDownloadHelper.OutputStreamCreator
        public boolean supportSeek() {
            return true;
        }
    }

    public FileDownloadRandomAccessFile(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.c = randomAccessFile;
        this.b = randomAccessFile.getFD();
        this.a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    @Override // com.liulishuo.filedownloader.stream.FileDownloadOutputStream
    public void close() throws IOException {
        this.a.close();
        this.c.close();
    }

    @Override // com.liulishuo.filedownloader.stream.FileDownloadOutputStream
    public void flushAndSync() throws IOException {
        this.a.flush();
        this.b.sync();
    }

    @Override // com.liulishuo.filedownloader.stream.FileDownloadOutputStream
    public void seek(long j) throws IOException {
        this.c.seek(j);
    }

    @Override // com.liulishuo.filedownloader.stream.FileDownloadOutputStream
    public void setLength(long j) throws IOException {
        this.c.setLength(j);
    }

    @Override // com.liulishuo.filedownloader.stream.FileDownloadOutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }
}
