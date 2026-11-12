package com.google.firebase.crashlytics.internal.log;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
class QueueFile implements Closeable {
    private static final Logger g = Logger.getLogger(QueueFile.class.getName());
    private static final int h = 4096;
    public static final int i = 16;
    private final RandomAccessFile a;
    public int b;
    private int c;
    private b d;
    private b e;
    private final byte[] f;

    public interface ElementReader {
        void read(InputStream inputStream, int i) throws IOException;
    }

    public class a implements ElementReader {
        public boolean a = true;
        public final /* synthetic */ StringBuilder b;

        public a(StringBuilder sb) {
            this.b = sb;
        }

        @Override // com.google.firebase.crashlytics.internal.log.QueueFile.ElementReader
        public void read(InputStream inputStream, int i) throws IOException {
            if (this.a) {
                this.a = false;
            } else {
                this.b.append(", ");
            }
            this.b.append(i);
        }
    }

    public static class b {
        public static final int c = 4;
        public static final b d = new b(0, 0);
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.a + ", length = " + this.b + "]";
        }
    }

    public final class c extends InputStream {
        private int a;
        private int b;

        public /* synthetic */ c(QueueFile queueFile, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            QueueFile.m(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.b;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            QueueFile.this.v(this.a, bArr, i, i2);
            this.a = QueueFile.this.A(this.a + i2);
            this.b -= i2;
            return i2;
        }

        private c(b bVar) {
            this.a = QueueFile.this.A(bVar.a + 4);
            this.b = bVar.b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.b == 0) {
                return -1;
            }
            QueueFile.this.a.seek(this.a);
            int i = QueueFile.this.a.read();
            this.a = QueueFile.this.A(this.a + 1);
            this.b--;
            return i;
        }
    }

    public QueueFile(File file) throws IOException {
        this.f = new byte[16];
        if (!file.exists()) {
            k(file);
        }
        this.a = n(file);
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int A(int i2) {
        int i3 = this.b;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    private void B(int i2, int i3, int i4, int i5) throws IOException {
        D(this.f, i2, i3, i4, i5);
        this.a.seek(0L);
        this.a.write(this.f);
    }

    private static void C(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    private static void D(byte[] bArr, int... iArr) {
        int i2 = 0;
        for (int i3 : iArr) {
            C(bArr, i2, i3);
            i2 += 4;
        }
    }

    private void h(int i2) throws IOException {
        int i3 = i2 + 4;
        int iT = t();
        if (iT >= i3) {
            return;
        }
        int i4 = this.b;
        do {
            iT += i4;
            i4 <<= 1;
        } while (iT < i3);
        x(i4);
        b bVar = this.e;
        int iA = A(bVar.a + 4 + bVar.b);
        if (iA < this.d.a) {
            FileChannel channel = this.a.getChannel();
            channel.position(this.b);
            long j = iA - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i5 = this.e.a;
        int i6 = this.d.a;
        if (i5 < i6) {
            int i7 = (this.b + i5) - 16;
            B(i4, this.c, i6, i7);
            this.e = new b(i7, this.e.b);
        } else {
            B(i4, this.c, i6, i5);
        }
        this.b = i4;
    }

    private static void k(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileN = n(file2);
        try {
            randomAccessFileN.setLength(4096L);
            randomAccessFileN.seek(0L);
            byte[] bArr = new byte[16];
            D(bArr, 4096, 0, 0, 0);
            randomAccessFileN.write(bArr);
            randomAccessFileN.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileN.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T m(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    private static RandomAccessFile n(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private b q(int i2) throws IOException {
        if (i2 == 0) {
            return b.d;
        }
        this.a.seek(i2);
        return new b(i2, this.a.readInt());
    }

    private void r() throws IOException {
        this.a.seek(0L);
        this.a.readFully(this.f);
        int iS = s(this.f, 0);
        this.b = iS;
        if (iS <= this.a.length()) {
            this.c = s(this.f, 4);
            int iS2 = s(this.f, 8);
            int iS3 = s(this.f, 12);
            this.d = q(iS2);
            this.e = q(iS3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + this.a.length());
    }

    private static int s(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    private int t() {
        return this.b - z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(int i2, byte[] bArr, int i3, int i4) throws IOException {
        int iA = A(i2);
        int i5 = iA + i4;
        int i6 = this.b;
        if (i5 <= i6) {
            this.a.seek(iA);
            this.a.readFully(bArr, i3, i4);
            return;
        }
        int i7 = i6 - iA;
        this.a.seek(iA);
        this.a.readFully(bArr, i3, i7);
        this.a.seek(16L);
        this.a.readFully(bArr, i3 + i7, i4 - i7);
    }

    private void w(int i2, byte[] bArr, int i3, int i4) throws IOException {
        int iA = A(i2);
        int i5 = iA + i4;
        int i6 = this.b;
        if (i5 <= i6) {
            this.a.seek(iA);
            this.a.write(bArr, i3, i4);
            return;
        }
        int i7 = i6 - iA;
        this.a.seek(iA);
        this.a.write(bArr, i3, i7);
        this.a.seek(16L);
        this.a.write(bArr, i3 + i7, i4 - i7);
    }

    private void x(int i2) throws IOException {
        this.a.setLength(i2);
        this.a.getChannel().force(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.a.close();
    }

    public void e(byte[] bArr) throws IOException {
        f(bArr, 0, bArr.length);
    }

    public synchronized void f(byte[] bArr, int i2, int i3) throws IOException {
        int iA;
        m(bArr, "buffer");
        if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        h(i3);
        boolean zL = l();
        if (zL) {
            iA = 16;
        } else {
            b bVar = this.e;
            iA = A(bVar.a + 4 + bVar.b);
        }
        b bVar2 = new b(iA, i3);
        C(this.f, 0, i3);
        w(bVar2.a, this.f, 0, 4);
        w(bVar2.a + 4, bArr, i2, i3);
        B(this.b, this.c + 1, zL ? bVar2.a : this.d.a, bVar2.a);
        this.e = bVar2;
        this.c++;
        if (zL) {
            this.d = bVar2;
        }
    }

    public synchronized void g() throws IOException {
        B(4096, 0, 0, 0);
        this.c = 0;
        b bVar = b.d;
        this.d = bVar;
        this.e = bVar;
        if (this.b > 4096) {
            x(4096);
        }
        this.b = 4096;
    }

    public synchronized void i(ElementReader elementReader) throws IOException {
        int iA = this.d.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            b bVarQ = q(iA);
            elementReader.read(new c(this, bVarQ, null), bVarQ.b);
            iA = A(bVarQ.a + 4 + bVarQ.b);
        }
    }

    public boolean j(int i2, int i3) {
        return (z() + 4) + i2 <= i3;
    }

    public synchronized boolean l() {
        return this.c == 0;
    }

    public synchronized void o(ElementReader elementReader) throws IOException {
        if (this.c > 0) {
            elementReader.read(new c(this, this.d, null), this.d.b);
        }
    }

    public synchronized byte[] p() throws IOException {
        if (l()) {
            return null;
        }
        b bVar = this.d;
        int i2 = bVar.b;
        byte[] bArr = new byte[i2];
        v(bVar.a + 4, bArr, 0, i2);
        return bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(JsonLexerKt.BEGIN_LIST);
        sb.append("fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.e);
        sb.append(", element lengths=[");
        try {
            i(new a(sb));
        } catch (IOException e) {
            g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public synchronized void u() throws IOException {
        if (l()) {
            throw new NoSuchElementException();
        }
        if (this.c == 1) {
            g();
        } else {
            b bVar = this.d;
            int iA = A(bVar.a + 4 + bVar.b);
            v(iA, this.f, 0, 4);
            int iS = s(this.f, 0);
            B(this.b, this.c - 1, iA, this.e.a);
            this.c--;
            this.d = new b(iA, iS);
        }
    }

    public synchronized int y() {
        return this.c;
    }

    public int z() {
        if (this.c == 0) {
            return 16;
        }
        b bVar = this.e;
        int i2 = bVar.a;
        int i3 = this.d.a;
        return i2 >= i3 ? (i2 - i3) + 4 + bVar.b + 16 : (((i2 + 4) + bVar.b) + this.b) - i3;
    }

    public QueueFile(RandomAccessFile randomAccessFile) throws IOException {
        this.f = new byte[16];
        this.a = randomAccessFile;
        r();
    }
}
