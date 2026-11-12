package com.google.common.io;

import am.j;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import org.apache.commons.lang3.e;
import v.e0;
import vb.h;
import yc.l2;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() { // from class: com.google.common.io.ByteStreams.1
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i14, int i15) {
            Preconditions.checkNotNull(bArr);
            Preconditions.checkPositionIndexes(i14, i15 + i14, bArr.length);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            Preconditions.checkNotNull(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i14) {
        }
    };
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;
    private static final int ZERO_COPY_CHUNK_SIZE = 524288;

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

    @CanIgnoreReturnValue
    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        Preconditions.checkNotNull(readableByteChannel);
        Preconditions.checkNotNull(writableByteChannel);
        long jWrite = 0;
        if (!(readableByteChannel instanceof FileChannel)) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(createBuffer());
            while (readableByteChannel.read(byteBufferWrap) != -1) {
                Java8Compatibility.flip(byteBufferWrap);
                while (byteBufferWrap.hasRemaining()) {
                    jWrite += (long) writableByteChannel.write(byteBufferWrap);
                }
                Java8Compatibility.clear(byteBufferWrap);
            }
            return jWrite;
        }
        FileChannel fileChannel = (FileChannel) readableByteChannel;
        long jPosition = fileChannel.position();
        long j8 = jPosition;
        while (true) {
            WritableByteChannel writableByteChannel2 = writableByteChannel;
            long jTransferTo = fileChannel.transferTo(j8, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, writableByteChannel2);
            j8 += jTransferTo;
            fileChannel.position(j8);
            if (jTransferTo <= 0 && j8 >= fileChannel.size()) {
                return j8 - jPosition;
            }
            writableByteChannel = writableByteChannel2;
        }
    }

    public static byte[] createBuffer() {
        return new byte[8192];
    }

    @CanIgnoreReturnValue
    public static long exhaust(InputStream inputStream) {
        byte[] bArrCreateBuffer = createBuffer();
        long j8 = 0;
        while (true) {
            long j14 = inputStream.read(bArrCreateBuffer);
            if (j14 == -1) {
                return j8;
            }
            j8 += j14;
        }
    }

    public static InputStream limit(InputStream inputStream, long j8) {
        return new LimitedInputStream(inputStream, j8);
    }

    public static ByteArrayDataInput newDataInput(byte[] bArr, int i14) {
        Preconditions.checkPositionIndex(i14, bArr.length);
        return newDataInput(new ByteArrayInputStream(bArr, i14, bArr.length - i14));
    }

    public static ByteArrayDataOutput newDataOutput(int i14) {
        if (i14 >= 0) {
            return newDataOutput(new ByteArrayOutputStream(i14));
        }
        h.s(j.h(i14, "Invalid size: "));
        return null;
    }

    public static OutputStream nullOutputStream() {
        return NULL_OUTPUT_STREAM;
    }

    @CanIgnoreReturnValue
    public static int read(InputStream inputStream, byte[] bArr, int i14, int i15) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(bArr);
        if (i15 < 0) {
            e.v(e0.f(i15, "len (", ") cannot be negative"));
            return 0;
        }
        Preconditions.checkPositionIndexes(i14, i14 + i15, bArr.length);
        int i16 = 0;
        while (i16 < i15) {
            int i17 = inputStream.read(bArr, i14 + i16, i15 - i16);
            if (i17 == -1) {
                break;
            }
            i16 += i17;
        }
        return i16;
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <T> T readBytes(InputStream inputStream, ByteProcessor<T> byteProcessor) throws IOException {
        int i14;
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(byteProcessor);
        byte[] bArrCreateBuffer = createBuffer();
        do {
            i14 = inputStream.read(bArrCreateBuffer);
            if (i14 == -1) {
                break;
            }
        } while (byteProcessor.processBytes(bArrCreateBuffer, 0, i14));
        return byteProcessor.getResult();
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i14, int i15) throws IOException {
        int i16 = read(inputStream, bArr, i14, i15);
        if (i16 != i15) {
            throw new EOFException(j.g(i16, i15, "reached end of stream after reading ", " bytes; ", " bytes expected"));
        }
    }

    public static void skipFully(InputStream inputStream, long j8) throws IOException {
        long jSkipUpTo = skipUpTo(inputStream, j8);
        if (jSkipUpTo < j8) {
            throw new EOFException(j.i(j8, " bytes expected", ds.e0.k(jSkipUpTo, "reached end of stream after skipping ", " bytes; ")));
        }
    }

    private static long skipSafely(InputStream inputStream, long j8) throws IOException {
        int iAvailable = inputStream.available();
        if (iAvailable == 0) {
            return 0L;
        }
        return inputStream.skip(Math.min(iAvailable, j8));
    }

    public static long skipUpTo(InputStream inputStream, long j8) throws IOException {
        byte[] bArr = null;
        long j14 = 0;
        while (j14 < j8) {
            long j15 = j8 - j14;
            long jSkipSafely = skipSafely(inputStream, j15);
            if (jSkipSafely == 0) {
                int iMin = (int) Math.min(j15, 8192L);
                if (bArr == null) {
                    bArr = new byte[iMin];
                }
                jSkipSafely = inputStream.read(bArr, 0, iMin);
                if (jSkipSafely == -1) {
                    break;
                }
            }
            j14 += jSkipSafely;
        }
        return j14;
    }

    public static byte[] toByteArray(InputStream inputStream, long j8) throws IOException {
        Preconditions.checkArgument(j8 >= 0, "expectedSize (%s) must be non-negative", j8);
        if (j8 > 2147483639) {
            throw new OutOfMemoryError(j8 + " bytes is too large to fit in a byte array");
        }
        int i14 = (int) j8;
        byte[] bArr = new byte[i14];
        int i15 = i14;
        while (i15 > 0) {
            int i16 = i14 - i15;
            int i17 = inputStream.read(bArr, i16, i15);
            if (i17 == -1) {
                return Arrays.copyOf(bArr, i16);
            }
            i15 -= i17;
        }
        int i18 = inputStream.read();
        if (i18 == -1) {
            return bArr;
        }
        ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) i18});
        return toByteArrayInternal(inputStream, arrayDeque, i14 + 1);
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
            iMin = IntMath.saturatedMultiply(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return combineBuffers(queue, MAX_ARRAY_LEN);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static class ByteArrayDataInputStream implements ByteArrayDataInput {
        final DataInput input;

        public ByteArrayDataInputStream(ByteArrayInputStream byteArrayInputStream) {
            this.input = new DataInputStream(byteArrayInputStream);
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.input.readBoolean();
            } catch (IOException e4) {
                l2.p(e4);
                return false;
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public byte readByte() {
            try {
                return this.input.readByte();
            } catch (EOFException e4) {
                l2.p(e4);
                return (byte) 0;
            } catch (IOException e14) {
                h.q(e14);
                return (byte) 0;
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public char readChar() {
            try {
                return this.input.readChar();
            } catch (IOException e4) {
                l2.p(e4);
                return (char) 0;
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public double readDouble() {
            try {
                return this.input.readDouble();
            } catch (IOException e4) {
                l2.p(e4);
                return 0.0d;
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public float readFloat() {
            try {
                return this.input.readFloat();
            } catch (IOException e4) {
                l2.p(e4);
                return 0.0f;
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] bArr) {
            try {
                this.input.readFully(bArr);
            } catch (IOException e4) {
                l2.p(e4);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readInt() {
            try {
                return this.input.readInt();
            } catch (IOException e4) {
                l2.p(e4);
                return 0;
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public String readLine() {
            try {
                return this.input.readLine();
            } catch (IOException e4) {
                l2.p(e4);
                return null;
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public long readLong() {
            try {
                return this.input.readLong();
            } catch (IOException e4) {
                l2.p(e4);
                return 0L;
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public short readShort() {
            try {
                return this.input.readShort();
            } catch (IOException e4) {
                l2.p(e4);
                return (short) 0;
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public String readUTF() {
            try {
                return this.input.readUTF();
            } catch (IOException e4) {
                l2.p(e4);
                return null;
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.input.readUnsignedByte();
            } catch (IOException e4) {
                l2.p(e4);
                return 0;
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.input.readUnsignedShort();
            } catch (IOException e4) {
                l2.p(e4);
                return 0;
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int skipBytes(int i14) {
            try {
                return this.input.skipBytes(i14);
            } catch (IOException e4) {
                l2.p(e4);
                return 0;
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] bArr, int i14, int i15) {
            try {
                this.input.readFully(bArr, i14, i15);
            } catch (IOException e4) {
                l2.p(e4);
            }
        }
    }

    public static class ByteArrayDataOutputStream implements ByteArrayDataOutput {
        final ByteArrayOutputStream byteArrayOutputStream;
        final DataOutput output;

        public ByteArrayDataOutputStream(ByteArrayOutputStream byteArrayOutputStream) {
            this.byteArrayOutputStream = byteArrayOutputStream;
            this.output = new DataOutputStream(byteArrayOutputStream);
        }

        @Override // com.google.common.io.ByteArrayDataOutput
        public byte[] toByteArray() {
            return this.byteArrayOutputStream.toByteArray();
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(int i14) {
            try {
                this.output.write(i14);
            } catch (IOException e4) {
                h.q(e4);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBoolean(boolean z14) {
            try {
                this.output.writeBoolean(z14);
            } catch (IOException e4) {
                h.q(e4);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeByte(int i14) {
            try {
                this.output.writeByte(i14);
            } catch (IOException e4) {
                h.q(e4);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBytes(String str) {
            try {
                this.output.writeBytes(str);
            } catch (IOException e4) {
                h.q(e4);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChar(int i14) {
            try {
                this.output.writeChar(i14);
            } catch (IOException e4) {
                h.q(e4);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChars(String str) {
            try {
                this.output.writeChars(str);
            } catch (IOException e4) {
                h.q(e4);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeDouble(double d14) {
            try {
                this.output.writeDouble(d14);
            } catch (IOException e4) {
                h.q(e4);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeFloat(float f14) {
            try {
                this.output.writeFloat(f14);
            } catch (IOException e4) {
                h.q(e4);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeInt(int i14) {
            try {
                this.output.writeInt(i14);
            } catch (IOException e4) {
                h.q(e4);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeLong(long j8) {
            try {
                this.output.writeLong(j8);
            } catch (IOException e4) {
                h.q(e4);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeShort(int i14) {
            try {
                this.output.writeShort(i14);
            } catch (IOException e4) {
                h.q(e4);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeUTF(String str) {
            try {
                this.output.writeUTF(str);
            } catch (IOException e4) {
                h.q(e4);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] bArr) {
            try {
                this.output.write(bArr);
            } catch (IOException e4) {
                h.q(e4);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] bArr, int i14, int i15) {
            try {
                this.output.write(bArr, i14, i15);
            } catch (IOException e4) {
                h.q(e4);
            }
        }
    }

    public static ByteArrayDataInput newDataInput(byte[] bArr) {
        return newDataInput(new ByteArrayInputStream(bArr));
    }

    public static ByteArrayDataInput newDataInput(ByteArrayInputStream byteArrayInputStream) {
        return new ByteArrayDataInputStream((ByteArrayInputStream) Preconditions.checkNotNull(byteArrayInputStream));
    }

    public static ByteArrayDataOutput newDataOutput() {
        return newDataOutput(new ByteArrayOutputStream());
    }

    public static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    public static ByteArrayDataOutput newDataOutput(ByteArrayOutputStream byteArrayOutputStream) {
        return new ByteArrayDataOutputStream((ByteArrayOutputStream) Preconditions.checkNotNull(byteArrayOutputStream));
    }

    public static final class LimitedInputStream extends FilterInputStream {
        private long left;
        private long mark;

        public LimitedInputStream(InputStream inputStream, long j8) {
            super(inputStream);
            this.mark = -1L;
            Preconditions.checkNotNull(inputStream);
            Preconditions.checkArgument(j8 >= 0, "limit must be non-negative");
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

    @CanIgnoreReturnValue
    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(outputStream);
        byte[] bArrCreateBuffer = createBuffer();
        long j8 = 0;
        while (true) {
            int i14 = inputStream.read(bArrCreateBuffer);
            if (i14 == -1) {
                return j8;
            }
            outputStream.write(bArrCreateBuffer, 0, i14);
            j8 += (long) i14;
        }
    }

    public static byte[] toByteArray(InputStream inputStream) {
        Preconditions.checkNotNull(inputStream);
        return toByteArrayInternal(inputStream, new ArrayDeque(20), 0);
    }
}
