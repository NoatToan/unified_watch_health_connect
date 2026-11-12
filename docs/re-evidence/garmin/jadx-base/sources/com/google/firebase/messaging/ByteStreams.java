package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;

    private ByteStreams() {
    }

    private static byte[] combineBuffers(Queue<byte[]> queue, int i14) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = queue.remove();
        if (bArrRemove.length == i14) {
            return bArrRemove;
        }
        int length = i14 - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, i14);
        while (length > 0) {
            byte[] bArrRemove2 = queue.remove();
            int iMin = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, i14 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] createBuffer() {
        return new byte[8192];
    }

    public static InputStream limit(InputStream inputStream, long j8) {
        return new LimitedInputStream(inputStream, j8);
    }

    private static int saturatedCast(long j8) {
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j8 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j8;
    }

    public static byte[] toByteArray(InputStream inputStream) {
        return toByteArrayInternal(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] toByteArrayInternal(InputStream inputStream, Queue<byte[]> queue, int i14) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i14) * 2));
        while (i14 < MAX_ARRAY_LEN) {
            int iMin2 = Math.min(iMin, MAX_ARRAY_LEN - i14);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i15 = 0;
            while (i15 < iMin2) {
                int i16 = inputStream.read(bArr, i15, iMin2 - i15);
                if (i16 == -1) {
                    return combineBuffers(queue, i14);
                }
                i15 += i16;
                i14 += i16;
            }
            iMin = saturatedCast(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return combineBuffers(queue, MAX_ARRAY_LEN);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final class LimitedInputStream extends FilterInputStream {
        private long left;
        private long mark;

        public LimitedInputStream(InputStream inputStream, long j8) {
            super(inputStream);
            this.mark = -1L;
            this.left = j8;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.left);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i14) {
            ((FilterInputStream) this).in.mark(i14);
            this.mark = this.left;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i14, int i15) throws IOException {
            long j8 = this.left;
            if (j8 == 0) {
                return -1;
            }
            int i16 = ((FilterInputStream) this).in.read(bArr, i14, (int) Math.min(i15, j8));
            if (i16 != -1) {
                this.left -= (long) i16;
            }
            return i16;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.mark == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.left = this.mark;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j8) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j8, this.left));
            this.left -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.left == 0) {
                return -1;
            }
            int i14 = ((FilterInputStream) this).in.read();
            if (i14 != -1) {
                this.left--;
            }
            return i14;
        }
    }
}
