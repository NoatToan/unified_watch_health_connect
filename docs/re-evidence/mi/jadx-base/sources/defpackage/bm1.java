package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class bm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f4354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f4355b;

    public static final class a extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FileOutputStream f4356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f4357b = false;

        public a(File file) throws FileNotFoundException {
            this.f4356a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f4357b) {
                return;
            }
            this.f4357b = true;
            flush();
            try {
                this.f4356a.getFD().sync();
            } catch (IOException e) {
                toe.i("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.f4356a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f4356a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f4356a.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f4356a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f4356a.write(bArr, i, i2);
        }
    }

    public bm1(File file) {
        this.f4354a = file;
        this.f4355b = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    public void a() {
        this.f4354a.delete();
        this.f4355b.delete();
    }

    public void b(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f4355b.delete();
    }

    public boolean c() {
        return this.f4354a.exists() || this.f4355b.exists();
    }

    public InputStream d() throws FileNotFoundException {
        e();
        return new FileInputStream(this.f4354a);
    }

    public final void e() {
        if (this.f4355b.exists()) {
            this.f4354a.delete();
            this.f4355b.renameTo(this.f4354a);
        }
    }

    public OutputStream f() throws IOException {
        if (this.f4354a.exists()) {
            if (this.f4355b.exists()) {
                this.f4354a.delete();
            } else if (!this.f4354a.renameTo(this.f4355b)) {
                String strValueOf = String.valueOf(this.f4354a);
                String strValueOf2 = String.valueOf(this.f4355b);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 37 + strValueOf2.length());
                sb.append("Couldn't rename file ");
                sb.append(strValueOf);
                sb.append(" to backup file ");
                sb.append(strValueOf2);
                toe.h("AtomicFile", sb.toString());
            }
        }
        try {
            return new a(this.f4354a);
        } catch (FileNotFoundException e) {
            File parentFile = this.f4354a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                String strValueOf3 = String.valueOf(this.f4354a);
                StringBuilder sb2 = new StringBuilder(strValueOf3.length() + 16);
                sb2.append("Couldn't create ");
                sb2.append(strValueOf3);
                throw new IOException(sb2.toString(), e);
            }
            try {
                return new a(this.f4354a);
            } catch (FileNotFoundException e2) {
                String strValueOf4 = String.valueOf(this.f4354a);
                StringBuilder sb3 = new StringBuilder(strValueOf4.length() + 16);
                sb3.append("Couldn't create ");
                sb3.append(strValueOf4);
                throw new IOException(sb3.toString(), e2);
            }
        }
    }
}
