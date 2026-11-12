package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.base.Preconditions;
import com.google.common.io.ByteProcessor;
import com.google.common.io.ElementTypesAreNonnullByDefault;
import com.google.common.io.ParametricNullness;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class aoy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final OutputStream f641b = new OutputStream() { // from class: aoy.1
        @Override // java.io.OutputStream
        public void write(int i) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            Preconditions.checkNotNull(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            Preconditions.checkNotNull(bArr);
            Preconditions.checkPositionIndexes(i, i2 + i, bArr.length);
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }
    };

    public static byte[] b() {
        return new byte[8192];
    }

    public static long e(InputStream inputStream, OutputStream outputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(outputStream);
        byte[] bArrB = b();
        long j = 0;
        while (true) {
            int i = inputStream.read(bArrB);
            if (i == -1) {
                return j;
            }
            outputStream.write(bArrB, 0, i);
            j += (long) i;
        }
    }

    private static byte[] c(InputStream inputStream, Queue<byte[]> queue, int i) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = inputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return e(queue, i);
                }
                i2 += i3;
                i += i3;
            }
            iMin = apn.c(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return e(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] e(Queue<byte[]> queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = queue.remove();
        if (bArrRemove.length == i) {
            return bArrRemove;
        }
        int length = i - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, i);
        while (length > 0) {
            byte[] bArrRemove2 = queue.remove();
            int iMin = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        return c(inputStream, new ArrayDeque(20), 0);
    }

    public static byte[] a(InputStream inputStream, long j) throws IOException {
        Preconditions.checkArgument(j >= 0, "expectedSize (%s) must be non-negative", j);
        if (j > 2147483639) {
            throw new OutOfMemoryError(j + " bytes is too large to fit in a byte array");
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            int i3 = i - i2;
            int i4 = inputStream.read(bArr, i3, i2);
            if (i4 == -1) {
                return Arrays.copyOf(bArr, i3);
            }
            i2 -= i4;
        }
        int i5 = inputStream.read();
        if (i5 == -1) {
            return bArr;
        }
        ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) i5});
        return c(inputStream, arrayDeque, i + 1);
    }

    public static long e(InputStream inputStream) throws IOException {
        byte[] bArrB = b();
        long j = 0;
        while (true) {
            long j2 = inputStream.read(bArrB);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    public static InputStream d(InputStream inputStream, long j) {
        return new a(inputStream, j);
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class a extends FilterInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f642b;
        private long d;

        a(InputStream inputStream, long j) {
            super(inputStream);
            this.f642b = -1L;
            Preconditions.checkNotNull(inputStream);
            Preconditions.checkArgument(j >= 0, "limit must be non-negative");
            this.d = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(this.in.available(), this.d);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public void mark(int i) {
            synchronized (this) {
                this.in.mark(i);
                this.f642b = this.d;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.d == 0) {
                return -1;
            }
            int i = this.in.read();
            if (i != -1) {
                this.d--;
            }
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.d;
            if (j == 0) {
                return -1;
            }
            int i3 = this.in.read(bArr, i, (int) Math.min(i2, j));
            if (i3 != -1) {
                this.d -= (long) i3;
            }
            return i3;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public void reset() throws IOException {
            synchronized (this) {
                if (!this.in.markSupported()) {
                    throw new IOException("Mark not supported");
                }
                if (this.f642b == -1) {
                    throw new IOException("Mark not set");
                }
                this.in.reset();
                this.d = this.f642b;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            long jSkip = this.in.skip(Math.min(j, this.d));
            this.d -= jSkip;
            return jSkip;
        }
    }

    public static long e(InputStream inputStream, long j) throws IOException {
        byte[] bArr = null;
        long j2 = 0;
        while (j2 < j) {
            long j3 = j - j2;
            long jB = b(inputStream, j3);
            if (jB == 0) {
                int iMin = (int) Math.min(j3, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (bArr == null) {
                    bArr = new byte[iMin];
                }
                jB = inputStream.read(bArr, 0, iMin);
                if (jB == -1) {
                    break;
                }
            }
            j2 += jB;
        }
        return j2;
    }

    private static long b(InputStream inputStream, long j) throws IOException {
        int iAvailable = inputStream.available();
        if (iAvailable == 0) {
            return 0L;
        }
        return inputStream.skip(Math.min(iAvailable, j));
    }

    @ParametricNullness
    public static <T> T b(InputStream inputStream, ByteProcessor<T> byteProcessor) throws IOException {
        int i;
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(byteProcessor);
        byte[] bArrB = b();
        do {
            i = inputStream.read(bArrB);
            if (i == -1) {
                break;
            }
        } while (byteProcessor.processBytes(bArrB, 0, i));
        return byteProcessor.getResult();
    }

    public static int c(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(bArr);
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(i2)));
        }
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 == -1) {
                break;
            }
            i3 += i4;
        }
        return i3;
    }
}
