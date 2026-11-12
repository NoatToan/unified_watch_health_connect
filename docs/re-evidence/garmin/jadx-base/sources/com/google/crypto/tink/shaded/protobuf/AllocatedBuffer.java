package com.google.crypto.tink.shaded.protobuf;

import am.j;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
abstract class AllocatedBuffer {
    public static AllocatedBuffer wrap(byte[] bArr, int i14, int i15) {
        if (i14 < 0 || i15 < 0 || i14 + i15 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i14), Integer.valueOf(i15)));
        }
        return wrapNoCheck(bArr, i14, i15);
    }

    private static AllocatedBuffer wrapNoCheck(final byte[] bArr, final int i14, final int i15) {
        return new AllocatedBuffer() { // from class: com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.2
            private int position;

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public byte[] array() {
                return bArr;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public int arrayOffset() {
                return i14;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public boolean hasArray() {
                return true;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public boolean hasNioBuffer() {
                return false;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public int limit() {
                return i15;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public ByteBuffer nioBuffer() {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public AllocatedBuffer position(int i16) {
                if (i16 < 0 || i16 > i15) {
                    h.s(j.h(i16, "Invalid position: "));
                    return null;
                }
                this.position = i16;
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public int remaining() {
                return i15 - this.position;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public int position() {
                return this.position;
            }
        };
    }

    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract ByteBuffer nioBuffer();

    public abstract int position();

    public abstract AllocatedBuffer position(int i14);

    public abstract int remaining();

    public static AllocatedBuffer wrap(byte[] bArr) {
        return wrapNoCheck(bArr, 0, bArr.length);
    }

    public static AllocatedBuffer wrap(final ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        return new AllocatedBuffer() { // from class: com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.1
            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public byte[] array() {
                return byteBuffer.array();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public int arrayOffset() {
                return byteBuffer.arrayOffset();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public boolean hasArray() {
                return byteBuffer.hasArray();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public boolean hasNioBuffer() {
                return true;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public int limit() {
                return byteBuffer.limit();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public ByteBuffer nioBuffer() {
                return byteBuffer;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public int position() {
                return byteBuffer.position();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public int remaining() {
                return byteBuffer.remaining();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public AllocatedBuffer position(int i14) {
                byteBuffer.position(i14);
                return this;
            }
        };
    }
}
