package com.google.android.exoplayer2.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class AtomicFile {
    private static final String c = "AtomicFile";
    private final File a;
    private final File b;

    public static final class a extends OutputStream {
        private final FileOutputStream a;
        private boolean b = false;

        public a(File file) throws FileNotFoundException {
            this.a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            this.b = true;
            flush();
            try {
                this.a.getFD().sync();
            } catch (IOException e) {
                Log.w(AtomicFile.c, "Failed to sync file descriptor:", e);
            }
            this.a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int b) throws IOException {
            this.a.write(b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b) throws IOException {
            this.a.write(b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b, int off, int len) throws IOException {
            this.a.write(b, off, len);
        }
    }

    public AtomicFile(File baseName) {
        this.a = baseName;
        this.b = new File(String.valueOf(baseName.getPath()).concat(".bak"));
    }

    private void a() {
        if (this.b.exists()) {
            this.a.delete();
            this.b.renameTo(this.a);
        }
    }

    public void delete() {
        this.a.delete();
        this.b.delete();
    }

    public void endWrite(OutputStream str) throws IOException {
        str.close();
        this.b.delete();
    }

    public boolean exists() {
        return this.a.exists() || this.b.exists();
    }

    public InputStream openRead() throws FileNotFoundException {
        a();
        return new FileInputStream(this.a);
    }

    public OutputStream startWrite() throws IOException {
        if (this.a.exists()) {
            if (this.b.exists()) {
                this.a.delete();
            } else if (!this.a.renameTo(this.b)) {
                String strValueOf = String.valueOf(this.a);
                String strValueOf2 = String.valueOf(this.b);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 37 + strValueOf2.length());
                sb.append("Couldn't rename file ");
                sb.append(strValueOf);
                sb.append(" to backup file ");
                sb.append(strValueOf2);
                Log.w(c, sb.toString());
            }
        }
        try {
            return new a(this.a);
        } catch (FileNotFoundException e) {
            File parentFile = this.a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                String strValueOf3 = String.valueOf(this.a);
                StringBuilder sb2 = new StringBuilder(strValueOf3.length() + 16);
                sb2.append("Couldn't create ");
                sb2.append(strValueOf3);
                throw new IOException(sb2.toString(), e);
            }
            try {
                return new a(this.a);
            } catch (FileNotFoundException e2) {
                String strValueOf4 = String.valueOf(this.a);
                StringBuilder sb3 = new StringBuilder(strValueOf4.length() + 16);
                sb3.append("Couldn't create ");
                sb3.append(strValueOf4);
                throw new IOException(sb3.toString(), e2);
            }
        }
    }
}
