package com.google.protobuf;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes2.dex */
final class NioByteString extends ByteString.LeafByteString {
    private final ByteBuffer buffer;

    public NioByteString(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer slice(int i14, int i15) {
        if (i14 < this.buffer.position() || i15 > this.buffer.limit() || i14 > i15) {
            e.s("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i14), Integer.valueOf(i15)});
            return null;
        }
        ByteBuffer byteBufferSlice = this.buffer.slice();
        Java8Compatibility.position(byteBufferSlice, i14 - this.buffer.position());
        Java8Compatibility.limit(byteBufferSlice, i15 - this.buffer.position());
        return byteBufferSlice;
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.buffer.slice());
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i14) {
        try {
            return this.buffer.get(i14);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw e4;
        } catch (IndexOutOfBoundsException e14) {
            throw new ArrayIndexOutOfBoundsException(e14.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i14, int i15, int i16) {
        ByteBuffer byteBufferSlice = this.buffer.slice();
        Java8Compatibility.position(byteBufferSlice, i14);
        byteBufferSlice.get(bArr, i15, i16);
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof NioByteString) {
            return this.buffer.equals(((NioByteString) obj).buffer);
        }
        return obj instanceof RopeByteString ? obj.equals(this) : this.buffer.equals(byteString.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString.LeafByteString
    public boolean equalsRange(ByteString byteString, int i14, int i15) {
        return substring(0, i15).equals(byteString.substring(i14, i15 + i14));
    }

    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int i14) {
        return byteAt(i14);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        return Utf8.isValidUtf8(this.buffer);
    }

    @Override // com.google.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.buffer, true);
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new InputStream() { // from class: com.google.protobuf.NioByteString.1
            private final ByteBuffer buf;

            {
                this.buf = NioByteString.this.buffer.slice();
            }

            @Override // java.io.InputStream
            public int available() {
                return this.buf.remaining();
            }

            @Override // java.io.InputStream
            public void mark(int i14) {
                Java8Compatibility.mark(this.buf);
            }

            @Override // java.io.InputStream
            public boolean markSupported() {
                return true;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i14, int i15) {
                if (!this.buf.hasRemaining()) {
                    return -1;
                }
                int iMin = Math.min(i15, this.buf.remaining());
                this.buf.get(bArr, i14, iMin);
                return iMin;
            }

            @Override // java.io.InputStream
            public void reset() throws IOException {
                try {
                    Java8Compatibility.reset(this.buf);
                } catch (InvalidMarkException e4) {
                    throw new IOException(e4);
                }
            }

            @Override // java.io.InputStream
            public int read() {
                if (this.buf.hasRemaining()) {
                    return this.buf.get() & UnsignedBytes.MAX_VALUE;
                }
                return -1;
            }
        };
    }

    @Override // com.google.protobuf.ByteString
    public int partialHash(int i14, int i15, int i16) {
        for (int i17 = i15; i17 < i15 + i16; i17++) {
            i14 = (i14 * 31) + this.buffer.get(i17);
        }
        return i14;
    }

    @Override // com.google.protobuf.ByteString
    public int partialIsValidUtf8(int i14, int i15, int i16) {
        return Utf8.partialIsValidUtf8(i14, this.buffer, i15, i16 + i15);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.buffer.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int i14, int i15) {
        try {
            return new NioByteString(slice(i14, i15));
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw e4;
        } catch (IndexOutOfBoundsException e14) {
            throw new ArrayIndexOutOfBoundsException(e14.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iPosition;
        if (this.buffer.hasArray()) {
            byteArray = this.buffer.array();
            iPosition = this.buffer.position() + this.buffer.arrayOffset();
            length = this.buffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iPosition = 0;
        }
        return new String(byteArray, iPosition, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(ByteOutput byteOutput) {
        byteOutput.writeLazy(this.buffer.slice());
    }

    @Override // com.google.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i14, int i15) throws IOException {
        if (!this.buffer.hasArray()) {
            ByteBufferWriter.write(slice(i14, i15 + i14), outputStream);
            return;
        }
        outputStream.write(this.buffer.array(), this.buffer.position() + this.buffer.arrayOffset() + i14, i15);
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }
}
