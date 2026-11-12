package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.build.AbstractStreamBuilder;

/* JADX INFO: loaded from: classes46.dex */
public class BOMInputStream extends ProxyInputStream {
    private static final Comparator<ByteOrderMark> ByteOrderMarkLengthComparator = Comparator.comparing(new Function() { // from class: org.apache.commons.io.input.BOMInputStream$$ExternalSyntheticLambda1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Integer.valueOf(((ByteOrderMark) obj).length());
        }
    }).reversed();
    private final List<ByteOrderMark> boms;
    private ByteOrderMark byteOrderMark;
    private int fbIndex;
    private int fbLength;
    private int[] firstBytes;
    private final boolean include;
    private int markFbIndex;
    private boolean markedAtStart;

    public static class Builder extends AbstractStreamBuilder<BOMInputStream, Builder> {
        private static final ByteOrderMark[] DEFAULT = {ByteOrderMark.UTF_8};
        private ByteOrderMark[] byteOrderMarks = DEFAULT;
        private boolean include;

        static ByteOrderMark getDefaultByteOrderMark() {
            return DEFAULT[0];
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public BOMInputStream get() throws IOException {
            return new BOMInputStream(getInputStream(), this.include, this.byteOrderMarks);
        }

        public Builder setByteOrderMarks(ByteOrderMark... byteOrderMarkArr) {
            this.byteOrderMarks = byteOrderMarkArr != null ? (ByteOrderMark[]) byteOrderMarkArr.clone() : DEFAULT;
            return this;
        }

        public Builder setInclude(boolean z) {
            this.include = z;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public BOMInputStream(InputStream inputStream) {
        this(inputStream, false, Builder.DEFAULT);
    }

    @Deprecated
    public BOMInputStream(InputStream inputStream, boolean z) {
        this(inputStream, z, Builder.DEFAULT);
    }

    @Deprecated
    public BOMInputStream(InputStream inputStream, boolean z, ByteOrderMark... byteOrderMarkArr) {
        super(inputStream);
        if (IOUtils.length(byteOrderMarkArr) == 0) {
            throw new IllegalArgumentException("No BOMs specified");
        }
        this.include = z;
        List<ByteOrderMark> listAsList = Arrays.asList(byteOrderMarkArr);
        listAsList.sort(ByteOrderMarkLengthComparator);
        this.boms = listAsList;
    }

    @Deprecated
    public BOMInputStream(InputStream inputStream, ByteOrderMark... byteOrderMarkArr) {
        this(inputStream, false, byteOrderMarkArr);
    }

    private ByteOrderMark find() {
        return this.boms.stream().filter(new Predicate() { // from class: org.apache.commons.io.input.BOMInputStream$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f$0.matches((ByteOrderMark) obj);
            }
        }).findFirst().orElse(null);
    }

    public ByteOrderMark getBOM() throws IOException {
        if (this.firstBytes == null) {
            this.fbLength = 0;
            this.firstBytes = new int[this.boms.get(0).length()];
            int i = 0;
            while (true) {
                int[] iArr = this.firstBytes;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = this.in.read();
                this.fbLength++;
                if (this.firstBytes[i] < 0) {
                    break;
                }
                i++;
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

    public String getBOMCharsetName() throws IOException {
        getBOM();
        ByteOrderMark byteOrderMark = this.byteOrderMark;
        if (byteOrderMark == null) {
            return null;
        }
        return byteOrderMark.getCharsetName();
    }

    public boolean hasBOM() throws IOException {
        return getBOM() != null;
    }

    public boolean hasBOM(ByteOrderMark byteOrderMark) throws IOException {
        if (!this.boms.contains(byteOrderMark)) {
            throw new IllegalArgumentException("Stream not configured to detect " + byteOrderMark);
        }
        return Objects.equals(getBOM(), byteOrderMark);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
            this.markFbIndex = this.fbIndex;
            this.markedAtStart = this.firstBytes == null;
            this.in.mark(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean matches(ByteOrderMark byteOrderMark) {
        for (int i = 0; i < byteOrderMark.length(); i++) {
            if (byteOrderMark.get(i) != this.firstBytes[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int firstBytes = readFirstBytes();
        return firstBytes >= 0 ? firstBytes : this.in.read();
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int firstBytes = 0;
        int i3 = 0;
        while (i2 > 0 && firstBytes >= 0) {
            firstBytes = readFirstBytes();
            if (firstBytes >= 0) {
                bArr[i] = (byte) (firstBytes & 255);
                i2--;
                i3++;
                i++;
            }
        }
        int i4 = this.in.read(bArr, i, i2);
        if (i4 >= 0) {
            return i3 + i4;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    private int readFirstBytes() throws IOException {
        getBOM();
        int i = this.fbIndex;
        if (i >= this.fbLength) {
            return -1;
        }
        int[] iArr = this.firstBytes;
        this.fbIndex = i + 1;
        return iArr[i];
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        synchronized (this) {
            this.fbIndex = this.markFbIndex;
            if (this.markedAtStart) {
                this.firstBytes = null;
            }
            this.in.reset();
        }
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long j2;
        int i = 0;
        while (true) {
            j2 = i;
            if (j <= j2 || readFirstBytes() < 0) {
                break;
            }
            i++;
        }
        return this.in.skip(j - j2) + j2;
    }
}
