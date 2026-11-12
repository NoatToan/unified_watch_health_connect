package com.twitter.sdk.android.core.internal.scribe;

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

/* JADX INFO: loaded from: classes18.dex */
public class QueueFile implements Closeable {
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

        @Override // com.twitter.sdk.android.core.internal.scribe.QueueFile.ElementReader
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
            QueueFile.g(bArr, "buffer");
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
            QueueFile.this.m(this.a, bArr, i, i2);
            this.a = QueueFile.this.p(this.a + i2);
            this.b -= i2;
            return i2;
        }

        private c(b bVar) {
            this.a = QueueFile.this.p(bVar.a + 4);
            this.b = bVar.b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.b == 0) {
                return -1;
            }
            QueueFile.this.a.seek(this.a);
            int i = QueueFile.this.a.read();
            this.a = QueueFile.this.p(this.a + 1);
            this.b--;
            return i;
        }
    }

    public QueueFile(File file) throws IOException {
        this.f = new byte[16];
        if (!file.exists()) {
            f(file);
        }
        this.a = h(file);
        j();
    }

    private void e(int i2) throws IOException {
        int i3 = i2 + 4;
        int iL = l();
        if (iL >= i3) {
            return;
        }
        int i4 = this.b;
        do {
            iL += i4;
            i4 <<= 1;
        } while (iL < i3);
        o(i4);
        b bVar = this.e;
        int iP = p(bVar.a + 4 + bVar.b);
        if (iP < this.d.a) {
            FileChannel channel = this.a.getChannel();
            channel.position(this.b);
            long j = iP - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i5 = this.e.a;
        int i6 = this.d.a;
        if (i5 < i6) {
            int i7 = (this.b + i5) - 16;
            q(i4, this.c, i6, i7);
            this.e = new b(i7, this.e.b);
        } else {
            q(i4, this.c, i6, i5);
        }
        this.b = i4;
    }

    private static void f(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileH = h(file2);
        try {
            randomAccessFileH.setLength(4096L);
            randomAccessFileH.seek(0L);
            byte[] bArr = new byte[16];
            s(bArr, 4096, 0, 0, 0);
            randomAccessFileH.write(bArr);
            randomAccessFileH.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileH.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T g(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    private static RandomAccessFile h(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private b i(int i2) throws IOException {
        if (i2 == 0) {
            return b.d;
        }
        this.a.seek(i2);
        return new b(i2, this.a.readInt());
    }

    private void j() throws IOException {
        this.a.seek(0L);
        this.a.readFully(this.f);
        int iK = k(this.f, 0);
        this.b = iK;
        if (iK <= this.a.length()) {
            this.c = k(this.f, 4);
            int iK2 = k(this.f, 8);
            int iK3 = k(this.f, 12);
            this.d = i(iK2);
            this.e = i(iK3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + this.a.length());
    }

    private static int k(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    private int l() {
        return this.b - usedBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i2, byte[] bArr, int i3, int i4) throws IOException {
        int iP = p(i2);
        int i5 = iP + i4;
        int i6 = this.b;
        if (i5 <= i6) {
            this.a.seek(iP);
            this.a.readFully(bArr, i3, i4);
            return;
        }
        int i7 = i6 - iP;
        this.a.seek(iP);
        this.a.readFully(bArr, i3, i7);
        this.a.seek(16L);
        this.a.readFully(bArr, i3 + i7, i4 - i7);
    }

    private void n(int i2, byte[] bArr, int i3, int i4) throws IOException {
        int iP = p(i2);
        int i5 = iP + i4;
        int i6 = this.b;
        if (i5 <= i6) {
            this.a.seek(iP);
            this.a.write(bArr, i3, i4);
            return;
        }
        int i7 = i6 - iP;
        this.a.seek(iP);
        this.a.write(bArr, i3, i7);
        this.a.seek(16L);
        this.a.write(bArr, i3 + i7, i4 - i7);
    }

    private void o(int i2) throws IOException {
        this.a.setLength(i2);
        this.a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int p(int i2) {
        int i3 = this.b;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    private void q(int i2, int i3, int i4, int i5) throws IOException {
        s(this.f, i2, i3, i4, i5);
        this.a.seek(0L);
        this.a.write(this.f);
    }

    private static void r(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    private static void s(byte[] bArr, int... iArr) {
        int i2 = 0;
        for (int i3 : iArr) {
            r(bArr, i2, i3);
            i2 += 4;
        }
    }

    public void add(byte[] bArr) throws IOException {
        add(bArr, 0, bArr.length);
    }

    public synchronized void clear() throws IOException {
        q(4096, 0, 0, 0);
        this.c = 0;
        b bVar = b.d;
        this.d = bVar;
        this.e = bVar;
        if (this.b > 4096) {
            o(4096);
        }
        this.b = 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.a.close();
    }

    public synchronized void forEach(ElementReader elementReader) throws IOException {
        int iP = this.d.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            b bVarI = i(iP);
            elementReader.read(new c(this, bVarI, null), bVarI.b);
            iP = p(bVarI.a + 4 + bVarI.b);
        }
    }

    public boolean hasSpaceFor(int i2, int i3) {
        return (usedBytes() + 4) + i2 <= i3;
    }

    public synchronized boolean isEmpty() {
        return this.c == 0;
    }

    public synchronized byte[] peek() throws IOException {
        if (isEmpty()) {
            return null;
        }
        b bVar = this.d;
        int i2 = bVar.b;
        byte[] bArr = new byte[i2];
        m(bVar.a + 4, bArr, 0, i2);
        return bArr;
    }

    public synchronized void remove() throws IOException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (this.c == 1) {
            clear();
        } else {
            b bVar = this.d;
            int iP = p(bVar.a + 4 + bVar.b);
            m(iP, this.f, 0, 4);
            int iK = k(this.f, 0);
            q(this.b, this.c - 1, iP, this.e.a);
            this.c--;
            this.d = new b(iP, iK);
        }
    }

    public synchronized int size() {
        return this.c;
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
            forEach(new a(sb));
        } catch (IOException e) {
            g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public int usedBytes() {
        if (this.c == 0) {
            return 16;
        }
        b bVar = this.e;
        int i2 = bVar.a;
        int i3 = this.d.a;
        return i2 >= i3 ? (i2 - i3) + 4 + bVar.b + 16 : (((i2 + 4) + bVar.b) + this.b) - i3;
    }

    public synchronized void add(byte[] bArr, int i2, int i3) throws IOException {
        int iP;
        g(bArr, "buffer");
        if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        e(i3);
        boolean zIsEmpty = isEmpty();
        if (zIsEmpty) {
            iP = 16;
        } else {
            b bVar = this.e;
            iP = p(bVar.a + 4 + bVar.b);
        }
        b bVar2 = new b(iP, i3);
        r(this.f, 0, i3);
        n(bVar2.a, this.f, 0, 4);
        n(bVar2.a + 4, bArr, i2, i3);
        q(this.b, this.c + 1, zIsEmpty ? bVar2.a : this.d.a, bVar2.a);
        this.e = bVar2;
        this.c++;
        if (zIsEmpty) {
            this.d = bVar2;
        }
    }

    public QueueFile(RandomAccessFile randomAccessFile) throws IOException {
        this.f = new byte[16];
        this.a = randomAccessFile;
        j();
    }

    public synchronized void peek(ElementReader elementReader) throws IOException {
        if (this.c > 0) {
            elementReader.read(new c(this, this.d, null), this.d.b);
        }
    }
}
