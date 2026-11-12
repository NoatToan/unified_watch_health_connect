package com.google.android.exoplayer2.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public final class AtomicFile {
    private static final String TAG = "AtomicFile";
    private final File backupName;
    private final File baseName;

    public AtomicFile(File file) {
        this.baseName = file;
        this.backupName = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    private void restoreBackup() {
        if (this.backupName.exists()) {
            this.baseName.delete();
            this.backupName.renameTo(this.baseName);
        }
    }

    public void delete() {
        this.baseName.delete();
        this.backupName.delete();
    }

    public void endWrite(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.backupName.delete();
    }

    public boolean exists() {
        return this.baseName.exists() || this.backupName.exists();
    }

    public InputStream openRead() {
        restoreBackup();
        return new FileInputStream(this.baseName);
    }

    public OutputStream startWrite() throws IOException {
        if (this.baseName.exists()) {
            boolean zExists = this.backupName.exists();
            File file = this.baseName;
            if (zExists) {
                file.delete();
            } else if (!file.renameTo(this.backupName)) {
                String strValueOf = String.valueOf(this.baseName);
                String strValueOf2 = String.valueOf(this.backupName);
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 37);
                sb3.append("Couldn't rename file ");
                sb3.append(strValueOf);
                sb3.append(" to backup file ");
                sb3.append(strValueOf2);
                Log.w(TAG, sb3.toString());
            }
        }
        try {
            return new AtomicFileOutputStream(this.baseName);
        } catch (FileNotFoundException e4) {
            File parentFile = this.baseName.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                String strValueOf3 = String.valueOf(this.baseName);
                StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 16);
                sb4.append("Couldn't create ");
                sb4.append(strValueOf3);
                throw new IOException(sb4.toString(), e4);
            }
            try {
                return new AtomicFileOutputStream(this.baseName);
            } catch (FileNotFoundException e14) {
                String strValueOf4 = String.valueOf(this.baseName);
                StringBuilder sb5 = new StringBuilder(strValueOf4.length() + 16);
                sb5.append("Couldn't create ");
                sb5.append(strValueOf4);
                throw new IOException(sb5.toString(), e14);
            }
        }
    }

    public static final class AtomicFileOutputStream extends OutputStream {
        private boolean closed = false;
        private final FileOutputStream fileOutputStream;

        public AtomicFileOutputStream(File file) {
            this.fileOutputStream = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            flush();
            try {
                this.fileOutputStream.getFD().sync();
            } catch (IOException e4) {
                Log.w(AtomicFile.TAG, "Failed to sync file descriptor:", e4);
            }
            this.fileOutputStream.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.fileOutputStream.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i14) throws IOException {
            this.fileOutputStream.write(i14);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.fileOutputStream.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i14, int i15) throws IOException {
            this.fileOutputStream.write(bArr, i14, i15);
        }
    }
}
