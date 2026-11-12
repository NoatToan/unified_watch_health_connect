package androidx.datastore.preferences.protobuf;

import defpackage.j73;
import defpackage.q73;
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

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends ByteString.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f2205a;

    public g0(ByteBuffer byteBuffer) {
        s.b(byteBuffer, "buffer");
        this.f2205a = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.f2205a.slice());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.f2205a.asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte byteAt(int i) {
        try {
            return this.f2205a.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f2205a.slice());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer byteBufferSlice = this.f2205a.slice();
        byteBufferSlice.position(i);
        byteBufferSlice.get(bArr, i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString.i
    public boolean e(ByteString byteString, int i, int i2) {
        return substring(0, i2).equals(byteString.substring(i, i2 + i));
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
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
        if (obj instanceof g0) {
            return this.f2205a.equals(((g0) obj).f2205a);
        }
        return obj instanceof j0 ? obj.equals(this) : this.f2205a.equals(byteString.asReadOnlyByteBuffer());
    }

    public final ByteBuffer g(int i, int i2) {
        if (i < this.f2205a.position() || i2 > this.f2205a.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        ByteBuffer byteBufferSlice = this.f2205a.slice();
        byteBufferSlice.position(i - this.f2205a.position());
        byteBufferSlice.limit(i2 - this.f2205a.position());
        return byteBufferSlice;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte internalByteAt(int i) {
        return byteAt(i);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean isValidUtf8() {
        return q0.r(this.f2205a);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public g newCodedInput() {
        return g.h(this.f2205a, true);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public InputStream newInput() {
        return new a();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int partialHash(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f2205a.get(i4);
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i2, int i3) {
        return q0.u(i, this.f2205a, i2, i3 + i2);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int size() {
        return this.f2205a.remaining();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteString substring(int i, int i2) {
        try {
            return new g0(g(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iArrayOffset;
        if (this.f2205a.hasArray()) {
            byteArray = this.f2205a.array();
            iArrayOffset = this.f2205a.arrayOffset() + this.f2205a.position();
            length = this.f2205a.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iArrayOffset = 0;
        }
        return new String(byteArray, iArrayOffset, length, charset);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        if (!this.f2205a.hasArray()) {
            j73.g(g(i, i2 + i), outputStream);
        } else {
            outputStream.write(this.f2205a.array(), this.f2205a.arrayOffset() + this.f2205a.position() + i, i2);
        }
    }

    public class a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f2206a;

        public a() {
            this.f2206a = g0.this.f2205a.slice();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f2206a.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f2206a.mark();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f2206a.hasRemaining()) {
                return this.f2206a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                this.f2206a.reset();
            } catch (InvalidMarkException e) {
                throw new IOException(e);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.f2206a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, this.f2206a.remaining());
            this.f2206a.get(bArr, i, iMin);
            return iMin;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(q73 q73Var) throws IOException {
        q73Var.a(this.f2205a.slice());
    }
}
