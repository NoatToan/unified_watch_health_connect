package com.google.crypto.tink.shaded.protobuf;

import com.google.common.primitives.UnsignedBytes;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class IterableByteBufferInputStream extends InputStream {
    private long currentAddress;
    private byte[] currentArray;
    private int currentArrayOffset;
    private ByteBuffer currentByteBuffer;
    private int currentByteBufferPos;
    private int currentIndex;
    private int dataSize = 0;
    private boolean hasArray;
    private Iterator<ByteBuffer> iterator;

    public IterableByteBufferInputStream(Iterable<ByteBuffer> iterable) {
        this.iterator = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.dataSize++;
        }
        this.currentIndex = -1;
        if (getNextByteBuffer()) {
            return;
        }
        this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
        this.currentIndex = 0;
        this.currentByteBufferPos = 0;
        this.currentAddress = 0L;
    }

    private boolean getNextByteBuffer() {
        this.currentIndex++;
        if (!this.iterator.hasNext()) {
            return false;
        }
        ByteBuffer next = this.iterator.next();
        this.currentByteBuffer = next;
        this.currentByteBufferPos = next.position();
        if (this.currentByteBuffer.hasArray()) {
            this.hasArray = true;
            this.currentArray = this.currentByteBuffer.array();
            this.currentArrayOffset = this.currentByteBuffer.arrayOffset();
        } else {
            this.hasArray = false;
            this.currentAddress = UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentArray = null;
        }
        return true;
    }

    private void updateCurrentByteBufferPos(int i14) {
        int i15 = this.currentByteBufferPos + i14;
        this.currentByteBufferPos = i15;
        if (i15 == this.currentByteBuffer.limit()) {
            getNextByteBuffer();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i14, int i15) {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        int iLimit = this.currentByteBuffer.limit();
        int i16 = this.currentByteBufferPos;
        int i17 = iLimit - i16;
        if (i15 > i17) {
            i15 = i17;
        }
        if (this.hasArray) {
            System.arraycopy(this.currentArray, i16 + this.currentArrayOffset, bArr, i14, i15);
            updateCurrentByteBufferPos(i15);
            return i15;
        }
        int iPosition = this.currentByteBuffer.position();
        this.currentByteBuffer.position(this.currentByteBufferPos);
        this.currentByteBuffer.get(bArr, i14, i15);
        this.currentByteBuffer.position(iPosition);
        updateCurrentByteBufferPos(i15);
        return i15;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        if (this.hasArray) {
            int i14 = this.currentArray[this.currentByteBufferPos + this.currentArrayOffset] & UnsignedBytes.MAX_VALUE;
            updateCurrentByteBufferPos(1);
            return i14;
        }
        int i15 = UnsafeUtil.getByte(((long) this.currentByteBufferPos) + this.currentAddress) & UnsignedBytes.MAX_VALUE;
        updateCurrentByteBufferPos(1);
        return i15;
    }
}
