package org.apache.commons.io.input;

import androidx.browser.trusted.c;
import com.google.firebase.messaging.l;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.IOUtils;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class BOMInputStream extends ProxyInputStream {
    private static final Comparator<ByteOrderMark> ByteOrderMarkLengthComparator = new c(24);
    private final List<ByteOrderMark> boms;
    private ByteOrderMark byteOrderMark;
    private int fbIndex;
    private int fbLength;
    private int[] firstBytes;
    private final boolean include;
    private int markFbIndex;
    private boolean markedAtStart;

    public BOMInputStream(InputStream inputStream, boolean z14, ByteOrderMark... byteOrderMarkArr) {
        super(inputStream);
        if (IOUtils.length(byteOrderMarkArr) == 0) {
            h.s("No BOMs specified");
            throw null;
        }
        this.include = z14;
        List<ByteOrderMark> listAsList = Arrays.asList(byteOrderMarkArr);
        listAsList.sort(ByteOrderMarkLengthComparator);
        this.boms = listAsList;
    }

    private ByteOrderMark find() {
        for (ByteOrderMark byteOrderMark : this.boms) {
            if (matches(byteOrderMark)) {
                return byteOrderMark;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(ByteOrderMark byteOrderMark, ByteOrderMark byteOrderMark2) {
        return Integer.compare(byteOrderMark2.length(), byteOrderMark.length());
    }

    private boolean matches(ByteOrderMark byteOrderMark) {
        for (int i14 = 0; i14 < byteOrderMark.length(); i14++) {
            if (byteOrderMark.get(i14) != this.firstBytes[i14]) {
                return false;
            }
        }
        return true;
    }

    private int readFirstBytes() {
        getBOM();
        int i14 = this.fbIndex;
        if (i14 >= this.fbLength) {
            return -1;
        }
        int[] iArr = this.firstBytes;
        this.fbIndex = i14 + 1;
        return iArr[i14];
    }

    public ByteOrderMark getBOM() {
        if (this.firstBytes == null) {
            this.fbLength = 0;
            this.firstBytes = new int[this.boms.get(0).length()];
            int i14 = 0;
            while (true) {
                int[] iArr = this.firstBytes;
                if (i14 >= iArr.length) {
                    break;
                }
                iArr[i14] = ((FilterInputStream) this).in.read();
                this.fbLength++;
                if (this.firstBytes[i14] < 0) {
                    break;
                }
                i14++;
            }
            ByteOrderMark byteOrderMarkFind = find();
            this.byteOrderMark = byteOrderMarkFind;
            if (byteOrderMarkFind != null && !this.include) {
                if (byteOrderMarkFind.length() < this.firstBytes.length) {
                    this.fbIndex = this.byteOrderMark.length();
                } else {
                    this.fbLength = 0;
                }
            }
        }
        return this.byteOrderMark;
    }

    public String getBOMCharsetName() {
        getBOM();
        ByteOrderMark byteOrderMark = this.byteOrderMark;
        if (byteOrderMark == null) {
            return null;
        }
        return byteOrderMark.getCharsetName();
    }

    public boolean hasBOM(ByteOrderMark byteOrderMark) {
        if (!this.boms.contains(byteOrderMark)) {
            l.j(byteOrderMark, "Stream not configure to detect ");
            return false;
        }
        getBOM();
        ByteOrderMark byteOrderMark2 = this.byteOrderMark;
        return byteOrderMark2 != null && byteOrderMark2.equals(byteOrderMark);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i14) {
        this.markFbIndex = this.fbIndex;
        this.markedAtStart = this.firstBytes == null;
        ((FilterInputStream) this).in.mark(i14);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i14, int i15) throws IOException {
        int firstBytes = 0;
        int i16 = 0;
        while (i15 > 0 && firstBytes >= 0) {
            firstBytes = readFirstBytes();
            if (firstBytes >= 0) {
                bArr[i14] = (byte) (firstBytes & 255);
                i15--;
                i16++;
                i14++;
            }
        }
        int i17 = ((FilterInputStream) this).in.read(bArr, i14, i15);
        if (i17 >= 0) {
            return i16 + i17;
        }
        if (i16 > 0) {
            return i16;
        }
        return -1;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            this.fbIndex = this.markFbIndex;
            if (this.markedAtStart) {
                this.firstBytes = null;
            }
            ((FilterInputStream) this).in.reset();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j8) {
        long j14;
        int i14 = 0;
        while (true) {
            j14 = i14;
            if (j8 <= j14 || readFirstBytes() < 0) {
                break;
            }
            i14++;
        }
        return ((FilterInputStream) this).in.skip(j8 - j14) + j14;
    }

    public BOMInputStream(InputStream inputStream, boolean z14) {
        this(inputStream, z14, ByteOrderMark.UTF_8);
    }

    public BOMInputStream(InputStream inputStream, ByteOrderMark... byteOrderMarkArr) {
        this(inputStream, false, byteOrderMarkArr);
    }

    public BOMInputStream(InputStream inputStream) {
        this(inputStream, false, ByteOrderMark.UTF_8);
    }

    public boolean hasBOM() {
        return getBOM() != null;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int firstBytes = readFirstBytes();
        return firstBytes >= 0 ? firstBytes : ((FilterInputStream) this).in.read();
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
