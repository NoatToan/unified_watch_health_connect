package androidx.health.platform.client.proto;

import defpackage.g73;
import defpackage.n73;
import defpackage.vqd;
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
public final class s0 extends ByteString.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f2531a;

    public s0(ByteBuffer byteBuffer) {
        f0.b(byteBuffer, "buffer");
        this.f2531a = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.f2531a.slice());
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.f2531a.asReadOnlyBuffer();
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public byte byteAt(int i) {
        try {
            return this.f2531a.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f2531a.slice());
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer byteBufferSlice = this.f2531a.slice();
        vqd.c(byteBufferSlice, i);
        byteBufferSlice.get(bArr, i2, i3);
    }

    @Override // androidx.health.platform.client.proto.ByteString.i
    public boolean e(ByteString byteString, int i, int i2) {
        return substring(0, i2).equals(byteString.substring(i, i2 + i));
    }

    @Override // androidx.health.platform.client.proto.ByteString
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
        if (obj instanceof s0) {
            return this.f2531a.equals(((s0) obj).f2531a);
        }
        return obj instanceof v1 ? obj.equals(this) : this.f2531a.equals(byteString.asReadOnlyByteBuffer());
    }

    public final ByteBuffer g(int i, int i2) {
        if (i < this.f2531a.position() || i2 > this.f2531a.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        ByteBuffer byteBufferSlice = this.f2531a.slice();
        vqd.c(byteBufferSlice, i - this.f2531a.position());
        vqd.a(byteBufferSlice, i2 - this.f2531a.position());
        return byteBufferSlice;
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public byte internalByteAt(int i) {
        return byteAt(i);
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public boolean isValidUtf8() {
        return e2.r(this.f2531a);
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public h newCodedInput() {
        return h.i(this.f2531a, true);
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public InputStream newInput() {
        return new a();
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public int partialHash(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f2531a.get(i4);
        }
        return i;
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public int partialIsValidUtf8(int i, int i2, int i3) {
        return e2.u(i, this.f2531a, i2, i3 + i2);
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public int size() {
        return this.f2531a.remaining();
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public ByteString substring(int i, int i2) {
        try {
            return new s0(g(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iArrayOffset;
        if (this.f2531a.hasArray()) {
            byteArray = this.f2531a.array();
            iArrayOffset = this.f2531a.arrayOffset() + this.f2531a.position();
            length = this.f2531a.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iArrayOffset = 0;
        }
        return new String(byteArray, iArrayOffset, length, charset);
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        if (!this.f2531a.hasArray()) {
            g73.g(g(i, i2 + i), outputStream);
        } else {
            outputStream.write(this.f2531a.array(), this.f2531a.arrayOffset() + this.f2531a.position() + i, i2);
        }
    }

    public class a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f2532a;

        public a() {
            this.f2532a = s0.this.f2531a.slice();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f2532a.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            vqd.b(this.f2532a);
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f2532a.hasRemaining()) {
                return this.f2532a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                vqd.d(this.f2532a);
            } catch (InvalidMarkException e) {
                throw new IOException(e);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.f2532a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, this.f2532a.remaining());
            this.f2532a.get(bArr, i, iMin);
            return iMin;
        }
    }

    @Override // androidx.health.platform.client.proto.ByteString
    public void writeTo(n73 n73Var) throws IOException {
        n73Var.a(this.f2531a.slice());
    }
}
