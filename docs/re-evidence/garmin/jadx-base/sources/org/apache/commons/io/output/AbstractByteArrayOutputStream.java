package org.apache.commons.io.output;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.input.ClosedInputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractByteArrayOutputStream extends OutputStream {
    static final int DEFAULT_SIZE = 1024;
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    protected int count;
    private byte[] currentBuffer;
    private int currentBufferIndex;
    private int filledBufferSum;
    private final List<byte[]> buffers = new ArrayList();
    private boolean reuseBuffers = true;

    @FunctionalInterface
    public interface InputStreamConstructor<T extends InputStream> {
        T construct(byte[] bArr, int i14, int i15);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void needNewBuffer(int i14) {
        if (this.currentBufferIndex < this.buffers.size() - 1) {
            this.filledBufferSum += this.currentBuffer.length;
            int i15 = this.currentBufferIndex + 1;
            this.currentBufferIndex = i15;
            this.currentBuffer = this.buffers.get(i15);
            return;
        }
        byte[] bArr = this.currentBuffer;
        if (bArr == null) {
            this.filledBufferSum = 0;
        } else {
            i14 = Math.max(bArr.length << 1, i14 - this.filledBufferSum);
            this.filledBufferSum += this.currentBuffer.length;
        }
        this.currentBufferIndex++;
        byte[] bArr2 = new byte[i14];
        this.currentBuffer = bArr2;
        this.buffers.add(bArr2);
    }

    public abstract void reset();

    public void resetImpl() {
        this.count = 0;
        this.filledBufferSum = 0;
        this.currentBufferIndex = 0;
        if (this.reuseBuffers) {
            this.currentBuffer = this.buffers.get(0);
            return;
        }
        this.currentBuffer = null;
        int length = this.buffers.get(0).length;
        this.buffers.clear();
        needNewBuffer(length);
        this.reuseBuffers = true;
    }

    public abstract int size();

    public abstract byte[] toByteArray();

    public byte[] toByteArrayImpl() {
        int i14 = this.count;
        if (i14 == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[i14];
        int i15 = 0;
        for (byte[] bArr2 : this.buffers) {
            int iMin = Math.min(bArr2.length, i14);
            System.arraycopy(bArr2, 0, bArr, i15, iMin);
            i15 += iMin;
            i14 -= iMin;
            if (i14 == 0) {
                break;
            }
        }
        return bArr;
    }

    public abstract InputStream toInputStream();

    public <T extends InputStream> InputStream toInputStream(InputStreamConstructor<T> inputStreamConstructor) {
        int i14 = this.count;
        if (i14 == 0) {
            return ClosedInputStream.CLOSED_INPUT_STREAM;
        }
        ArrayList arrayList = new ArrayList(this.buffers.size());
        for (byte[] bArr : this.buffers) {
            int iMin = Math.min(bArr.length, i14);
            arrayList.add(inputStreamConstructor.construct(bArr, 0, iMin));
            i14 -= iMin;
            if (i14 == 0) {
                break;
            }
        }
        this.reuseBuffers = false;
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    @Deprecated
    public String toString() {
        return new String(toByteArray(), Charset.defaultCharset());
    }

    public abstract int write(InputStream inputStream);

    @Override // java.io.OutputStream
    public abstract void write(int i14);

    @Override // java.io.OutputStream
    public abstract void write(byte[] bArr, int i14, int i15);

    public int writeImpl(InputStream inputStream) throws IOException {
        int i14 = this.count - this.filledBufferSum;
        byte[] bArr = this.currentBuffer;
        int i15 = inputStream.read(bArr, i14, bArr.length - i14);
        int i16 = 0;
        while (i15 != -1) {
            i16 += i15;
            i14 += i15;
            this.count += i15;
            byte[] bArr2 = this.currentBuffer;
            if (i14 == bArr2.length) {
                needNewBuffer(bArr2.length);
                i14 = 0;
            }
            byte[] bArr3 = this.currentBuffer;
            i15 = inputStream.read(bArr3, i14, bArr3.length - i14);
        }
        return i16;
    }

    public abstract void writeTo(OutputStream outputStream);

    public void writeToImpl(OutputStream outputStream) throws IOException {
        int i14 = this.count;
        for (byte[] bArr : this.buffers) {
            int iMin = Math.min(bArr.length, i14);
            outputStream.write(bArr, 0, iMin);
            i14 -= iMin;
            if (i14 == 0) {
                return;
            }
        }
    }

    public String toString(String str) {
        return new String(toByteArray(), str);
    }

    public String toString(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public void writeImpl(int i14) {
        int i15 = this.count;
        int i16 = i15 - this.filledBufferSum;
        if (i16 == this.currentBuffer.length) {
            needNewBuffer(i15 + 1);
            i16 = 0;
        }
        this.currentBuffer[i16] = (byte) i14;
        this.count++;
    }

    public void writeImpl(byte[] bArr, int i14, int i15) {
        int i16 = this.count;
        int i17 = i16 + i15;
        int i18 = i16 - this.filledBufferSum;
        int i19 = i15;
        while (i19 > 0) {
            int iMin = Math.min(i19, this.currentBuffer.length - i18);
            System.arraycopy(bArr, (i14 + i15) - i19, this.currentBuffer, i18, iMin);
            i19 -= iMin;
            if (i19 > 0) {
                needNewBuffer(i17);
                i18 = 0;
            }
        }
        this.count = i17;
    }
}
