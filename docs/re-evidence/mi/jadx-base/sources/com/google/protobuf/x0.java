package com.google.protobuf;

import defpackage.i73;
import defpackage.p73;
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

/* JADX INFO: loaded from: classes5.dex */
public final class x0 extends ByteString.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f9771a;

    public x0(ByteBuffer byteBuffer) {
        d0.b(byteBuffer, "buffer");
        this.f9771a = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.f9771a.slice());
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.f9771a.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
        try {
            return this.f9771a.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f9771a.slice());
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer byteBufferSlice = this.f9771a.slice();
        byteBufferSlice.position(i);
        byteBufferSlice.get(bArr, i2, i3);
    }

    @Override // com.google.protobuf.ByteString.i
    public boolean e(ByteString byteString, int i, int i2) {
        return substring(0, i2).equals(byteString.substring(i, i2 + i));
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
        if (obj instanceof x0) {
            return this.f9771a.equals(((x0) obj).f9771a);
        }
        return obj instanceof d1 ? obj.equals(this) : this.f9771a.equals(byteString.asReadOnlyByteBuffer());
    }

    public final ByteBuffer g(int i, int i2) {
        if (i < this.f9771a.position() || i2 > this.f9771a.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        ByteBuffer byteBufferSlice = this.f9771a.slice();
        byteBufferSlice.position(i - this.f9771a.position());
        byteBufferSlice.limit(i2 - this.f9771a.position());
        return byteBufferSlice;
    }

    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int i) {
        return byteAt(i);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        return v1.r(this.f9771a);
    }

    @Override // com.google.protobuf.ByteString
    public j newCodedInput() {
        return j.j(this.f9771a, true);
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new a();
    }

    @Override // com.google.protobuf.ByteString
    public int partialHash(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f9771a.get(i4);
        }
        return i;
    }

    @Override // com.google.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i2, int i3) {
        return v1.u(i, this.f9771a, i2, i3 + i2);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.f9771a.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int i, int i2) {
        try {
            return new x0(g(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iArrayOffset;
        if (this.f9771a.hasArray()) {
            byteArray = this.f9771a.array();
            iArrayOffset = this.f9771a.arrayOffset() + this.f9771a.position();
            length = this.f9771a.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iArrayOffset = 0;
        }
        return new String(byteArray, iArrayOffset, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        if (!this.f9771a.hasArray()) {
            i73.g(g(i, i2 + i), outputStream);
        } else {
            outputStream.write(this.f9771a.array(), this.f9771a.arrayOffset() + this.f9771a.position() + i, i2);
        }
    }

    public class a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f9772a;

        public a() {
            this.f9772a = x0.this.f9771a.slice();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f9772a.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f9772a.mark();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f9772a.hasRemaining()) {
                return this.f9772a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                this.f9772a.reset();
            } catch (InvalidMarkException e) {
                throw new IOException(e);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.f9772a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, this.f9772a.remaining());
            this.f9772a.get(bArr, i, iMin);
            return iMin;
        }
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(p73 p73Var) throws IOException {
        p73Var.a(this.f9771a.slice());
    }
}
