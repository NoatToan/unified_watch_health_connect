package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.ByteOrderMark;

/* JADX INFO: loaded from: classes23.dex */
public class BOMInputStream extends ProxyInputStream {
    private static final Comparator<ByteOrderMark> i = new a();
    private final boolean a;
    private final List<ByteOrderMark> b;
    private ByteOrderMark c;
    private int[] d;
    private int e;
    private int f;
    private int g;
    private boolean h;

    public static class a implements Comparator<ByteOrderMark> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ByteOrderMark byteOrderMark, ByteOrderMark byteOrderMark2) {
            int length = byteOrderMark.length();
            int length2 = byteOrderMark2.length();
            if (length > length2) {
                return -1;
            }
            return length2 > length ? 1 : 0;
        }
    }

    public BOMInputStream(InputStream inputStream) {
        this(inputStream, false, ByteOrderMark.UTF_8);
    }

    private ByteOrderMark a() {
        for (ByteOrderMark byteOrderMark : this.b) {
            if (b(byteOrderMark)) {
                return byteOrderMark;
            }
        }
        return null;
    }

    private boolean b(ByteOrderMark byteOrderMark) {
        for (int i2 = 0; i2 < byteOrderMark.length(); i2++) {
            if (byteOrderMark.get(i2) != this.d[i2]) {
                return false;
            }
        }
        return true;
    }

    private int c() throws IOException {
        getBOM();
        int i2 = this.f;
        if (i2 >= this.e) {
            return -1;
        }
        int[] iArr = this.d;
        this.f = i2 + 1;
        return iArr[i2];
    }

    public ByteOrderMark getBOM() throws IOException {
        if (this.d == null) {
            this.e = 0;
            this.d = new int[this.b.get(0).length()];
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    break;
                }
                iArr[i2] = ((FilterInputStream) this).in.read();
                this.e++;
                if (this.d[i2] < 0) {
                    break;
                }
                i2++;
            }
            ByteOrderMark byteOrderMarkA = a();
            this.c = byteOrderMarkA;
            if (byteOrderMarkA != null && !this.a) {
                if (byteOrderMarkA.length() < this.d.length) {
                    this.f = this.c.length();
                } else {
                    this.e = 0;
                }
            }
        }
        return this.c;
    }

    public String getBOMCharsetName() throws IOException {
        getBOM();
        ByteOrderMark byteOrderMark = this.c;
        if (byteOrderMark == null) {
            return null;
        }
        return byteOrderMark.getCharsetName();
    }

    public boolean hasBOM() throws IOException {
        return getBOM() != null;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        this.g = this.f;
        this.h = this.d == null;
        ((FilterInputStream) this).in.mark(i2);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int iC = c();
        return iC >= 0 ? iC : ((FilterInputStream) this).in.read();
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f = this.g;
        if (this.h) {
            this.d = null;
        }
        ((FilterInputStream) this).in.reset();
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long j2;
        int i2 = 0;
        while (true) {
            j2 = i2;
            if (j <= j2 || c() < 0) {
                break;
            }
            i2++;
        }
        return ((FilterInputStream) this).in.skip(j - j2) + j2;
    }

    public BOMInputStream(InputStream inputStream, boolean z) {
        this(inputStream, z, ByteOrderMark.UTF_8);
    }

    public boolean hasBOM(ByteOrderMark byteOrderMark) throws IOException {
        if (this.b.contains(byteOrderMark)) {
            getBOM();
            ByteOrderMark byteOrderMark2 = this.c;
            return byteOrderMark2 != null && byteOrderMark2.equals(byteOrderMark);
        }
        throw new IllegalArgumentException("Stream not configure to detect " + byteOrderMark);
    }

    public BOMInputStream(InputStream inputStream, ByteOrderMark... byteOrderMarkArr) {
        this(inputStream, false, byteOrderMarkArr);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int iC = 0;
        int i4 = 0;
        while (i3 > 0 && iC >= 0) {
            iC = c();
            if (iC >= 0) {
                bArr[i2] = (byte) (iC & 255);
                i3--;
                i4++;
                i2++;
            }
        }
        int i5 = ((FilterInputStream) this).in.read(bArr, i2, i3);
        if (i5 >= 0) {
            return i4 + i5;
        }
        if (i4 > 0) {
            return i4;
        }
        return -1;
    }

    public BOMInputStream(InputStream inputStream, boolean z, ByteOrderMark... byteOrderMarkArr) {
        super(inputStream);
        if (byteOrderMarkArr != null && byteOrderMarkArr.length != 0) {
            this.a = z;
            List<ByteOrderMark> listAsList = Arrays.asList(byteOrderMarkArr);
            Collections.sort(listAsList, i);
            this.b = listAsList;
            return;
        }
        throw new IllegalArgumentException("No BOMs specified");
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
