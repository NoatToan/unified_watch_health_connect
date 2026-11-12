package com.google.crypto.tink.shaded.protobuf;

import fb1.c;
import j20.x;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    CodedOutputStreamWriter wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.hasUnsafeArrayOperations();

    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        public AbstractBufferedEncoder(int i14) {
            super();
            if (i14 < 0) {
                h.s("bufferSize must be >= 0");
                throw null;
            }
            byte[] bArr = new byte[Math.max(i14, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
        }

        public final void buffer(byte b14) {
            byte[] bArr = this.buffer;
            int i14 = this.position;
            this.position = i14 + 1;
            bArr[i14] = b14;
            this.totalBytesWritten++;
        }

        public final void bufferFixed32NoTag(int i14) {
            byte[] bArr = this.buffer;
            int i15 = this.position;
            int i16 = i15 + 1;
            this.position = i16;
            bArr[i15] = (byte) (i14 & 255);
            int i17 = i15 + 2;
            this.position = i17;
            bArr[i16] = (byte) ((i14 >> 8) & 255);
            int i18 = i15 + 3;
            this.position = i18;
            bArr[i17] = (byte) ((i14 >> 16) & 255);
            this.position = i15 + 4;
            bArr[i18] = (byte) ((i14 >> 24) & 255);
            this.totalBytesWritten += 4;
        }

        public final void bufferFixed64NoTag(long j8) {
            byte[] bArr = this.buffer;
            int i14 = this.position;
            int i15 = i14 + 1;
            this.position = i15;
            bArr[i14] = (byte) (j8 & 255);
            int i16 = i14 + 2;
            this.position = i16;
            bArr[i15] = (byte) ((j8 >> 8) & 255);
            int i17 = i14 + 3;
            this.position = i17;
            bArr[i16] = (byte) ((j8 >> 16) & 255);
            int i18 = i14 + 4;
            this.position = i18;
            bArr[i17] = (byte) (255 & (j8 >> 24));
            int i19 = i14 + 5;
            this.position = i19;
            bArr[i18] = (byte) (((int) (j8 >> 32)) & 255);
            int i24 = i14 + 6;
            this.position = i24;
            bArr[i19] = (byte) (((int) (j8 >> 40)) & 255);
            int i25 = i14 + 7;
            this.position = i25;
            bArr[i24] = (byte) (((int) (j8 >> 48)) & 255);
            this.position = i14 + 8;
            bArr[i25] = (byte) (((int) (j8 >> 56)) & 255);
            this.totalBytesWritten += 8;
        }

        public final void bufferInt32NoTag(int i14) {
            if (i14 >= 0) {
                bufferUInt32NoTag(i14);
            } else {
                bufferUInt64NoTag(i14);
            }
        }

        public final void bufferTag(int i14, int i15) {
            bufferUInt32NoTag(WireFormat.makeTag(i14, i15));
        }

        public final void bufferUInt32NoTag(int i14) {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j8 = this.position;
                while (true) {
                    int i15 = i14 & (-128);
                    byte[] bArr = this.buffer;
                    if (i15 == 0) {
                        int i16 = this.position;
                        this.position = i16 + 1;
                        UnsafeUtil.putByte(bArr, i16, (byte) i14);
                        this.totalBytesWritten += (int) (((long) this.position) - j8);
                        return;
                    }
                    int i17 = this.position;
                    this.position = i17 + 1;
                    UnsafeUtil.putByte(bArr, i17, (byte) ((i14 & 127) | 128));
                    i14 >>>= 7;
                }
            } else {
                while (true) {
                    int i18 = i14 & (-128);
                    byte[] bArr2 = this.buffer;
                    if (i18 == 0) {
                        int i19 = this.position;
                        this.position = i19 + 1;
                        bArr2[i19] = (byte) i14;
                        this.totalBytesWritten++;
                        return;
                    }
                    int i24 = this.position;
                    this.position = i24 + 1;
                    bArr2[i24] = (byte) ((i14 & 127) | 128);
                    this.totalBytesWritten++;
                    i14 >>>= 7;
                }
            }
        }

        public final void bufferUInt64NoTag(long j8) {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j14 = this.position;
                while (true) {
                    long j15 = j8 & (-128);
                    byte[] bArr = this.buffer;
                    if (j15 == 0) {
                        int i14 = this.position;
                        this.position = i14 + 1;
                        UnsafeUtil.putByte(bArr, i14, (byte) j8);
                        this.totalBytesWritten += (int) (((long) this.position) - j14);
                        return;
                    }
                    int i15 = this.position;
                    this.position = i15 + 1;
                    UnsafeUtil.putByte(bArr, i15, (byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                }
            } else {
                while (true) {
                    long j16 = j8 & (-128);
                    byte[] bArr2 = this.buffer;
                    if (j16 == 0) {
                        int i16 = this.position;
                        this.position = i16 + 1;
                        bArr2[i16] = (byte) j8;
                        this.totalBytesWritten++;
                        return;
                    }
                    int i17 = this.position;
                    this.position = i17 + 1;
                    bArr2[i17] = (byte) ((((int) j8) & 127) | 128);
                    this.totalBytesWritten++;
                    j8 >>>= 7;
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    public static final class HeapNioEncoder extends ArrayEncoder {
        private final ByteBuffer byteBuffer;
        private int initialPosition;

        public HeapNioEncoder(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream.ArrayEncoder, com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() {
            this.byteBuffer.position(this.initialPosition + getTotalBytesWritten());
        }
    }

    public static int computeBoolSize(int i14, boolean z14) {
        return computeBoolSizeNoTag(z14) + computeTagSize(i14);
    }

    public static int computeBoolSizeNoTag(boolean z14) {
        return 1;
    }

    public static int computeByteArraySize(int i14, byte[] bArr) {
        return computeByteArraySizeNoTag(bArr) + computeTagSize(i14);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i14, ByteBuffer byteBuffer) {
        return computeByteBufferSizeNoTag(byteBuffer) + computeTagSize(i14);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i14, ByteString byteString) {
        return computeBytesSizeNoTag(byteString) + computeTagSize(i14);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int i14, double d14) {
        return computeDoubleSizeNoTag(d14) + computeTagSize(i14);
    }

    public static int computeDoubleSizeNoTag(double d14) {
        return 8;
    }

    public static int computeEnumSize(int i14, int i15) {
        return computeEnumSizeNoTag(i15) + computeTagSize(i14);
    }

    public static int computeEnumSizeNoTag(int i14) {
        return computeInt32SizeNoTag(i14);
    }

    public static int computeFixed32Size(int i14, int i15) {
        return computeFixed32SizeNoTag(i15) + computeTagSize(i14);
    }

    public static int computeFixed32SizeNoTag(int i14) {
        return 4;
    }

    public static int computeFixed64Size(int i14, long j8) {
        return computeFixed64SizeNoTag(j8) + computeTagSize(i14);
    }

    public static int computeFixed64SizeNoTag(long j8) {
        return 8;
    }

    public static int computeFloatSize(int i14, float f14) {
        return computeFloatSizeNoTag(f14) + computeTagSize(i14);
    }

    public static int computeFloatSizeNoTag(float f14) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i14, MessageLite messageLite) {
        return computeGroupSizeNoTag(messageLite) + (computeTagSize(i14) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite) messageLite).getSerializedSize(schema);
    }

    public static int computeInt32Size(int i14, int i15) {
        return computeInt32SizeNoTag(i15) + computeTagSize(i14);
    }

    public static int computeInt32SizeNoTag(int i14) {
        if (i14 >= 0) {
            return computeUInt32SizeNoTag(i14);
        }
        return 10;
    }

    public static int computeInt64Size(int i14, long j8) {
        return computeInt64SizeNoTag(j8) + computeTagSize(i14);
    }

    public static int computeInt64SizeNoTag(long j8) {
        return computeUInt64SizeNoTag(j8);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i14, LazyFieldLite lazyFieldLite) {
        return computeLazyFieldSize(3, lazyFieldLite) + computeUInt32Size(2, i14) + (computeTagSize(1) * 2);
    }

    public static int computeLazyFieldSize(int i14, LazyFieldLite lazyFieldLite) {
        return computeLazyFieldSizeNoTag(lazyFieldLite) + computeTagSize(i14);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    public static int computeLengthDelimitedFieldSize(int i14) {
        return computeUInt32SizeNoTag(i14) + i14;
    }

    public static int computeMessageSetExtensionSize(int i14, MessageLite messageLite) {
        return computeMessageSize(3, messageLite) + computeUInt32Size(2, i14) + (computeTagSize(1) * 2);
    }

    public static int computeMessageSize(int i14, MessageLite messageLite) {
        return computeMessageSizeNoTag(messageLite) + computeTagSize(i14);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite, Schema schema) {
        return computeLengthDelimitedFieldSize(((AbstractMessageLite) messageLite).getSerializedSize(schema));
    }

    public static int computePreferredBufferSize(int i14) {
        if (i14 > 4096) {
            return 4096;
        }
        return i14;
    }

    public static int computeRawMessageSetExtensionSize(int i14, ByteString byteString) {
        return computeBytesSize(3, byteString) + computeUInt32Size(2, i14) + (computeTagSize(1) * 2);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i14) {
        return computeUInt32SizeNoTag(i14);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j8) {
        return computeUInt64SizeNoTag(j8);
    }

    public static int computeSFixed32Size(int i14, int i15) {
        return computeSFixed32SizeNoTag(i15) + computeTagSize(i14);
    }

    public static int computeSFixed32SizeNoTag(int i14) {
        return 4;
    }

    public static int computeSFixed64Size(int i14, long j8) {
        return computeSFixed64SizeNoTag(j8) + computeTagSize(i14);
    }

    public static int computeSFixed64SizeNoTag(long j8) {
        return 8;
    }

    public static int computeSInt32Size(int i14, int i15) {
        return computeSInt32SizeNoTag(i15) + computeTagSize(i14);
    }

    public static int computeSInt32SizeNoTag(int i14) {
        return computeUInt32SizeNoTag(encodeZigZag32(i14));
    }

    public static int computeSInt64Size(int i14, long j8) {
        return computeSInt64SizeNoTag(j8) + computeTagSize(i14);
    }

    public static int computeSInt64SizeNoTag(long j8) {
        return computeUInt64SizeNoTag(encodeZigZag64(j8));
    }

    public static int computeStringSize(int i14, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i14);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = Utf8.encodedLength(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i14) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i14, 0));
    }

    public static int computeUInt32Size(int i14, int i15) {
        return computeUInt32SizeNoTag(i15) + computeTagSize(i14);
    }

    public static int computeUInt32SizeNoTag(int i14) {
        if ((i14 & (-128)) == 0) {
            return 1;
        }
        if ((i14 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i14) == 0) {
            return 3;
        }
        return (i14 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i14, long j8) {
        return computeUInt64SizeNoTag(j8) + computeTagSize(i14);
    }

    public static int computeUInt64SizeNoTag(long j8) {
        int i14;
        if (((-128) & j8) == 0) {
            return 1;
        }
        if (j8 < 0) {
            return 10;
        }
        if (((-34359738368L) & j8) != 0) {
            j8 >>>= 28;
            i14 = 6;
        } else {
            i14 = 2;
        }
        if (((-2097152) & j8) != 0) {
            i14 += 2;
            j8 >>>= 14;
        }
        return (j8 & (-16384)) != 0 ? i14 + 1 : i14;
    }

    public static int encodeZigZag32(int i14) {
        return (i14 >> 31) ^ (i14 << 1);
    }

    public static long encodeZigZag64(long j8) {
        return (j8 >> 63) ^ (j8 << 1);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new HeapNioEncoder(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            return UnsafeDirectNioEncoder.isSupported() ? newUnsafeInstance(byteBuffer) : newSafeInstance(byteBuffer);
        }
        h.s("ByteBuffer is read-only");
        return null;
    }

    public static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new SafeDirectNioEncoder(byteBuffer);
    }

    public static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new UnsafeDirectNioEncoder(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() == 0) {
            return;
        }
        h.z("Did not write as much data as expected.");
    }

    public abstract void flush();

    public abstract int getTotalBytesWritten();

    public final void inefficientWriteStringNoTag(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws OutOfSpaceException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e4) {
            throw e4;
        } catch (IndexOutOfBoundsException e14) {
            throw new OutOfSpaceException(e14);
        }
    }

    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
    public abstract void write(byte b14);

    @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer);

    @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i14, int i15);

    public abstract void writeBool(int i14, boolean z14);

    public final void writeBoolNoTag(boolean z14) {
        write(z14 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i14, byte[] bArr);

    public abstract void writeByteArray(int i14, byte[] bArr, int i15, int i16);

    public final void writeByteArrayNoTag(byte[] bArr) {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i14, int i15);

    public abstract void writeByteBuffer(int i14, ByteBuffer byteBuffer);

    public abstract void writeBytes(int i14, ByteString byteString);

    public abstract void writeBytesNoTag(ByteString byteString);

    public final void writeDouble(int i14, double d14) {
        writeFixed64(i14, Double.doubleToRawLongBits(d14));
    }

    public final void writeDoubleNoTag(double d14) {
        writeFixed64NoTag(Double.doubleToRawLongBits(d14));
    }

    public final void writeEnum(int i14, int i15) {
        writeInt32(i14, i15);
    }

    public final void writeEnumNoTag(int i14) {
        writeInt32NoTag(i14);
    }

    public abstract void writeFixed32(int i14, int i15);

    public abstract void writeFixed32NoTag(int i14);

    public abstract void writeFixed64(int i14, long j8);

    public abstract void writeFixed64NoTag(long j8);

    public final void writeFloat(int i14, float f14) {
        writeFixed32(i14, Float.floatToRawIntBits(f14));
    }

    public final void writeFloatNoTag(float f14) {
        writeFixed32NoTag(Float.floatToRawIntBits(f14));
    }

    @Deprecated
    public final void writeGroup(int i14, MessageLite messageLite) {
        writeTag(i14, 3);
        writeGroupNoTag(messageLite);
        writeTag(i14, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite, Schema schema) {
        schema.writeTo(messageLite, this.wrapper);
    }

    public abstract void writeInt32(int i14, int i15);

    public abstract void writeInt32NoTag(int i14);

    public final void writeInt64(int i14, long j8) {
        writeUInt64(i14, j8);
    }

    public final void writeInt64NoTag(long j8) {
        writeUInt64NoTag(j8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer);

    @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i14, int i15);

    public abstract void writeMessage(int i14, MessageLite messageLite);

    public abstract void writeMessage(int i14, MessageLite messageLite, Schema schema);

    public abstract void writeMessageNoTag(MessageLite messageLite);

    public abstract void writeMessageNoTag(MessageLite messageLite, Schema schema);

    public abstract void writeMessageSetExtension(int i14, MessageLite messageLite);

    public final void writeRawByte(int i14) {
        write((byte) i14);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer);

    public final void writeRawBytes(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i14) {
        writeFixed32NoTag(i14);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j8) {
        writeFixed64NoTag(j8);
    }

    public abstract void writeRawMessageSetExtension(int i14, ByteString byteString);

    @Deprecated
    public final void writeRawVarint32(int i14) {
        writeUInt32NoTag(i14);
    }

    @Deprecated
    public final void writeRawVarint64(long j8) {
        writeUInt64NoTag(j8);
    }

    public final void writeSFixed32(int i14, int i15) {
        writeFixed32(i14, i15);
    }

    public final void writeSFixed32NoTag(int i14) {
        writeFixed32NoTag(i14);
    }

    public final void writeSFixed64(int i14, long j8) {
        writeFixed64(i14, j8);
    }

    public final void writeSFixed64NoTag(long j8) {
        writeFixed64NoTag(j8);
    }

    public final void writeSInt32(int i14, int i15) {
        writeUInt32(i14, encodeZigZag32(i15));
    }

    public final void writeSInt32NoTag(int i14) {
        writeUInt32NoTag(encodeZigZag32(i14));
    }

    public final void writeSInt64(int i14, long j8) {
        writeUInt64(i14, encodeZigZag64(j8));
    }

    public final void writeSInt64NoTag(long j8) {
        writeUInt64NoTag(encodeZigZag64(j8));
    }

    public abstract void writeString(int i14, String str);

    public abstract void writeStringNoTag(String str);

    public abstract void writeTag(int i14, int i15);

    public abstract void writeUInt32(int i14, int i15);

    public abstract void writeUInt32NoTag(int i14);

    public abstract void writeUInt64(int i14, long j8);

    public abstract void writeUInt64NoTag(long j8);

    public static class ArrayEncoder extends CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        public ArrayEncoder(byte[] bArr, int i14, int i15) {
            super();
            if (bArr == null) {
                x.l("buffer");
                throw null;
            }
            int i16 = i14 + i15;
            if ((i14 | i15 | (bArr.length - i16)) < 0) {
                e.s("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i14), Integer.valueOf(i15)});
                throw null;
            }
            this.buffer = bArr;
            this.offset = i14;
            this.position = i14;
            this.limit = i16;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.limit - this.position;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) throws OutOfSpaceException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, iRemaining);
                this.position += iRemaining;
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(iRemaining)), e4);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeBool(int i14, boolean z14) throws OutOfSpaceException {
            writeTag(i14, 0);
            write(z14 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeByteArray(int i14, byte[] bArr, int i15, int i16) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeByteArrayNoTag(bArr, i15, i16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] bArr, int i14, int i15) throws OutOfSpaceException {
            writeUInt32NoTag(i15);
            write(bArr, i14, i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i14, ByteBuffer byteBuffer) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeBytes(int i14, ByteString byteString) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) throws OutOfSpaceException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeFixed32(int i14, int i15) throws OutOfSpaceException {
            writeTag(i14, 5);
            writeFixed32NoTag(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i14) throws OutOfSpaceException {
            try {
                byte[] bArr = this.buffer;
                int i15 = this.position;
                int i16 = i15 + 1;
                this.position = i16;
                bArr[i15] = (byte) (i14 & 255);
                int i17 = i15 + 2;
                this.position = i17;
                bArr[i16] = (byte) ((i14 >> 8) & 255);
                int i18 = i15 + 3;
                this.position = i18;
                bArr[i17] = (byte) ((i14 >> 16) & 255);
                this.position = i15 + 4;
                bArr[i18] = (byte) ((i14 >> 24) & 255);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeFixed64(int i14, long j8) throws OutOfSpaceException {
            writeTag(i14, 1);
            writeFixed64NoTag(j8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j8) throws OutOfSpaceException {
            try {
                byte[] bArr = this.buffer;
                int i14 = this.position;
                int i15 = i14 + 1;
                this.position = i15;
                bArr[i14] = (byte) (((int) j8) & 255);
                int i16 = i14 + 2;
                this.position = i16;
                bArr[i15] = (byte) (((int) (j8 >> 8)) & 255);
                int i17 = i14 + 3;
                this.position = i17;
                bArr[i16] = (byte) (((int) (j8 >> 16)) & 255);
                int i18 = i14 + 4;
                this.position = i18;
                bArr[i17] = (byte) (((int) (j8 >> 24)) & 255);
                int i19 = i14 + 5;
                this.position = i19;
                bArr[i18] = (byte) (((int) (j8 >> 32)) & 255);
                int i24 = i14 + 6;
                this.position = i24;
                bArr[i19] = (byte) (((int) (j8 >> 40)) & 255);
                int i25 = i14 + 7;
                this.position = i25;
                bArr[i24] = (byte) (((int) (j8 >> 48)) & 255);
                this.position = i14 + 8;
                bArr[i25] = (byte) (((int) (j8 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeInt32(int i14, int i15) throws OutOfSpaceException {
            writeTag(i14, 0);
            writeInt32NoTag(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i14) throws OutOfSpaceException {
            if (i14 >= 0) {
                writeUInt32NoTag(i14);
            } else {
                writeUInt64NoTag(i14);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i14, int i15) throws OutOfSpaceException {
            write(bArr, i14, i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeMessage(int i14, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i14, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i14);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws OutOfSpaceException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            write(byteBufferDuplicate);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i14, ByteString byteString) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i14);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeString(int i14, String str) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws OutOfSpaceException {
            int i14 = this.position;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    this.position = Utf8.encode(str, this.buffer, this.position, spaceLeft());
                    return;
                }
                int i15 = i14 + iComputeUInt32SizeNoTag2;
                this.position = i15;
                int iEncode = Utf8.encode(str, this.buffer, i15, spaceLeft());
                this.position = i14;
                writeUInt32NoTag((iEncode - i14) - iComputeUInt32SizeNoTag2);
                this.position = iEncode;
            } catch (Utf8.UnpairedSurrogateException e4) {
                this.position = i14;
                inefficientWriteStringNoTag(str, e4);
            } catch (IndexOutOfBoundsException e14) {
                throw new OutOfSpaceException(e14);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeTag(int i14, int i15) throws OutOfSpaceException {
            writeUInt32NoTag(WireFormat.makeTag(i14, i15));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeUInt32(int i14, int i15) throws OutOfSpaceException {
            writeTag(i14, 0);
            writeUInt32NoTag(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i14) throws OutOfSpaceException {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS || Android.isOnAndroidDevice() || spaceLeft() < 5) {
                while (true) {
                    int i15 = i14 & (-128);
                    byte[] bArr = this.buffer;
                    if (i15 == 0) {
                        int i16 = this.position;
                        this.position = i16 + 1;
                        bArr[i16] = (byte) i14;
                        return;
                    } else {
                        try {
                            int i17 = this.position;
                            this.position = i17 + 1;
                            bArr[i17] = (byte) ((i14 & 127) | 128);
                            i14 >>>= 7;
                        } catch (IndexOutOfBoundsException e4) {
                            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
                        }
                    }
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
                }
            }
            int i18 = i14 & (-128);
            byte[] bArr2 = this.buffer;
            if (i18 == 0) {
                int i19 = this.position;
                this.position = i19 + 1;
                UnsafeUtil.putByte(bArr2, i19, (byte) i14);
                return;
            }
            int i24 = this.position;
            this.position = i24 + 1;
            UnsafeUtil.putByte(bArr2, i24, (byte) (i14 | 128));
            int i25 = i14 >>> 7;
            int i26 = i25 & (-128);
            byte[] bArr3 = this.buffer;
            if (i26 == 0) {
                int i27 = this.position;
                this.position = i27 + 1;
                UnsafeUtil.putByte(bArr3, i27, (byte) i25);
                return;
            }
            int i28 = this.position;
            this.position = i28 + 1;
            UnsafeUtil.putByte(bArr3, i28, (byte) (i25 | 128));
            int i29 = i14 >>> 14;
            int i30 = i29 & (-128);
            byte[] bArr4 = this.buffer;
            if (i30 == 0) {
                int i34 = this.position;
                this.position = i34 + 1;
                UnsafeUtil.putByte(bArr4, i34, (byte) i29);
                return;
            }
            int i35 = this.position;
            this.position = i35 + 1;
            UnsafeUtil.putByte(bArr4, i35, (byte) (i29 | 128));
            int i36 = i14 >>> 21;
            int i37 = i36 & (-128);
            byte[] bArr5 = this.buffer;
            if (i37 == 0) {
                int i38 = this.position;
                this.position = i38 + 1;
                UnsafeUtil.putByte(bArr5, i38, (byte) i36);
                return;
            }
            int i39 = this.position;
            this.position = i39 + 1;
            UnsafeUtil.putByte(bArr5, i39, (byte) (i36 | 128));
            byte[] bArr6 = this.buffer;
            int i44 = this.position;
            this.position = i44 + 1;
            UnsafeUtil.putByte(bArr6, i44, (byte) (i14 >>> 28));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeUInt64(int i14, long j8) throws OutOfSpaceException {
            writeTag(i14, 0);
            writeUInt64NoTag(j8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j8) throws OutOfSpaceException {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS || spaceLeft() < 10) {
                while (true) {
                    long j14 = j8 & (-128);
                    byte[] bArr = this.buffer;
                    if (j14 == 0) {
                        int i14 = this.position;
                        this.position = i14 + 1;
                        bArr[i14] = (byte) j8;
                        return;
                    } else {
                        try {
                            int i15 = this.position;
                            this.position = i15 + 1;
                            bArr[i15] = (byte) ((((int) j8) & 127) | 128);
                            j8 >>>= 7;
                        } catch (IndexOutOfBoundsException e4) {
                            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
                        }
                    }
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
                }
            }
            while (true) {
                long j15 = j8 & (-128);
                byte[] bArr2 = this.buffer;
                if (j15 == 0) {
                    int i16 = this.position;
                    this.position = i16 + 1;
                    UnsafeUtil.putByte(bArr2, i16, (byte) j8);
                    return;
                } else {
                    int i17 = this.position;
                    this.position = i17 + 1;
                    UnsafeUtil.putByte(bArr2, i17, (byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) throws OutOfSpaceException {
            write(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeByteArray(int i14, byte[] bArr) throws OutOfSpaceException {
            writeByteArray(i14, bArr, 0, bArr.length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) throws OutOfSpaceException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeMessage(int i14, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void write(byte[] bArr, int i14, int i15) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i14, this.buffer, this.position, i15);
                this.position += i15;
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i15)), e4);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void write(byte b14) throws OutOfSpaceException {
            try {
                byte[] bArr = this.buffer;
                int i14 = this.position;
                this.position = i14 + 1;
                bArr[i14] = b14;
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
            }
        }
    }

    public static final class OutputStreamEncoder extends AbstractBufferedEncoder {
        private final OutputStream out;

        public OutputStreamEncoder(OutputStream outputStream, int i14) {
            super(i14);
            if (outputStream != null) {
                this.out = outputStream;
            } else {
                x.l("out");
                throw null;
            }
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i14) throws IOException {
            if (this.limit - this.position < i14) {
                doFlush();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i14 = this.limit;
            int i15 = this.position;
            int i16 = i14 - i15;
            byte[] bArr = this.buffer;
            if (i16 >= iRemaining) {
                byteBuffer.get(bArr, i15, iRemaining);
                this.position += iRemaining;
                this.totalBytesWritten += iRemaining;
                return;
            }
            int i17 = i14 - i15;
            byteBuffer.get(bArr, i15, i17);
            int i18 = iRemaining - i17;
            this.position = this.limit;
            this.totalBytesWritten += i17;
            doFlush();
            while (true) {
                int i19 = this.limit;
                byte[] bArr2 = this.buffer;
                if (i18 <= i19) {
                    byteBuffer.get(bArr2, 0, i18);
                    this.position = i18;
                    this.totalBytesWritten += i18;
                    return;
                } else {
                    byteBuffer.get(bArr2, 0, i19);
                    this.out.write(this.buffer, 0, this.limit);
                    int i24 = this.limit;
                    i18 -= i24;
                    this.totalBytesWritten += i24;
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBool(int i14, boolean z14) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i14, 0);
            buffer(z14 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int i14, byte[] bArr, int i15, int i16) throws IOException {
            writeTag(i14, 2);
            writeByteArrayNoTag(bArr, i15, i16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i14, int i15) throws IOException {
            writeUInt32NoTag(i15);
            write(bArr, i14, i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteBuffer(int i14, ByteBuffer byteBuffer) throws IOException {
            writeTag(i14, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytes(int i14, ByteString byteString) throws IOException {
            writeTag(i14, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32(int i14, int i15) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i14, 5);
            bufferFixed32NoTag(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i14) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64(int i14, long j8) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i14, 1);
            bufferFixed64NoTag(j8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j8) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32(int i14, int i15) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i14, 0);
            bufferInt32NoTag(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i14) throws IOException {
            if (i14 >= 0) {
                writeUInt32NoTag(i14);
            } else {
                writeUInt64NoTag(i14);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i14, int i15) throws IOException {
            write(bArr, i14, i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int i14, MessageLite messageLite) throws IOException {
            writeTag(i14, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i14, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i14);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            write(byteBufferDuplicate);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i14, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i14);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeString(int i14, String str) throws IOException {
            writeTag(i14, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int iEncodedLength;
            try {
                int length = str.length() * 3;
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i14 = iComputeUInt32SizeNoTag + length;
                int i15 = this.limit;
                if (i14 > i15) {
                    byte[] bArr = new byte[length];
                    int iEncode = Utf8.encode(str, bArr, 0, length);
                    writeUInt32NoTag(iEncode);
                    writeLazy(bArr, 0, iEncode);
                    return;
                }
                if (i14 > i15 - this.position) {
                    doFlush();
                }
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i16 = this.position;
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i17 = i16 + iComputeUInt32SizeNoTag2;
                        this.position = i17;
                        int iEncode2 = Utf8.encode(str, this.buffer, i17, this.limit - i17);
                        this.position = i16;
                        iEncodedLength = (iEncode2 - i16) - iComputeUInt32SizeNoTag2;
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = iEncode2;
                    } else {
                        iEncodedLength = Utf8.encodedLength(str);
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = Utf8.encode(str, this.buffer, this.position, iEncodedLength);
                    }
                    this.totalBytesWritten += iEncodedLength;
                } catch (Utf8.UnpairedSurrogateException e4) {
                    this.totalBytesWritten -= this.position - i16;
                    this.position = i16;
                    throw e4;
                } catch (ArrayIndexOutOfBoundsException e14) {
                    throw new OutOfSpaceException(e14);
                }
            } catch (Utf8.UnpairedSurrogateException e15) {
                inefficientWriteStringNoTag(str, e15);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeTag(int i14, int i15) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i14, i15));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32(int i14, int i15) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i14, 0);
            bufferUInt32NoTag(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i14) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64(int i14, long j8) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i14, 0);
            bufferUInt64NoTag(j8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j8) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int i14, byte[] bArr) throws IOException {
            writeByteArray(i14, bArr, 0, bArr.length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int i14, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i14, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] bArr, int i14, int i15) throws IOException {
            int i16 = this.limit;
            int i17 = this.position;
            int i18 = i16 - i17;
            byte[] bArr2 = this.buffer;
            if (i18 >= i15) {
                System.arraycopy(bArr, i14, bArr2, i17, i15);
                this.position += i15;
                this.totalBytesWritten += i15;
                return;
            }
            int i19 = i16 - i17;
            System.arraycopy(bArr, i14, bArr2, i17, i19);
            int i24 = i14 + i19;
            int i25 = i15 - i19;
            this.position = this.limit;
            this.totalBytesWritten += i19;
            doFlush();
            if (i25 <= this.limit) {
                System.arraycopy(bArr, i24, this.buffer, 0, i25);
                this.position = i25;
            } else {
                this.out.write(bArr, i24, i25);
            }
            this.totalBytesWritten += i25;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte b14) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b14);
        }
    }

    public static final class SafeDirectNioEncoder extends CodedOutputStream {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        public SafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = byteBuffer.position();
        }

        private void encode(String str) throws OutOfSpaceException {
            try {
                Utf8.encodeUtf8(str, this.buffer);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(e4);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() {
            this.originalBuffer.position(this.buffer.position());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.buffer.remaining();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] bArr, int i14, int i15) throws OutOfSpaceException {
            try {
                this.buffer.put(bArr, i14, i15);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(e4);
            } catch (BufferOverflowException e14) {
                throw new OutOfSpaceException(e14);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBool(int i14, boolean z14) throws OutOfSpaceException {
            writeTag(i14, 0);
            write(z14 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int i14, byte[] bArr, int i15, int i16) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeByteArrayNoTag(bArr, i15, i16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i14, int i15) throws OutOfSpaceException {
            writeUInt32NoTag(i15);
            write(bArr, i14, i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteBuffer(int i14, ByteBuffer byteBuffer) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytes(int i14, ByteString byteString) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws OutOfSpaceException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32(int i14, int i15) throws OutOfSpaceException {
            writeTag(i14, 5);
            writeFixed32NoTag(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i14) throws OutOfSpaceException {
            try {
                this.buffer.putInt(i14);
            } catch (BufferOverflowException e4) {
                throw new OutOfSpaceException(e4);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64(int i14, long j8) throws OutOfSpaceException {
            writeTag(i14, 1);
            writeFixed64NoTag(j8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j8) throws OutOfSpaceException {
            try {
                this.buffer.putLong(j8);
            } catch (BufferOverflowException e4) {
                throw new OutOfSpaceException(e4);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32(int i14, int i15) throws OutOfSpaceException {
            writeTag(i14, 0);
            writeInt32NoTag(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i14) throws OutOfSpaceException {
            if (i14 >= 0) {
                writeUInt32NoTag(i14);
            } else {
                writeUInt64NoTag(i14);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i14, int i15) throws OutOfSpaceException {
            write(bArr, i14, i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int i14, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i14, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i14);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws OutOfSpaceException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            write(byteBufferDuplicate);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i14, ByteString byteString) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i14);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeString(int i14, String str) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws OutOfSpaceException {
            int iPosition = this.buffer.position();
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    encode(str);
                    return;
                }
                int iPosition2 = this.buffer.position() + iComputeUInt32SizeNoTag2;
                this.buffer.position(iPosition2);
                encode(str);
                int iPosition3 = this.buffer.position();
                this.buffer.position(iPosition);
                writeUInt32NoTag(iPosition3 - iPosition2);
                this.buffer.position(iPosition3);
            } catch (Utf8.UnpairedSurrogateException e4) {
                this.buffer.position(iPosition);
                inefficientWriteStringNoTag(str, e4);
            } catch (IllegalArgumentException e14) {
                throw new OutOfSpaceException(e14);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeTag(int i14, int i15) throws OutOfSpaceException {
            writeUInt32NoTag(WireFormat.makeTag(i14, i15));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32(int i14, int i15) throws OutOfSpaceException {
            writeTag(i14, 0);
            writeUInt32NoTag(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i14) throws OutOfSpaceException {
            while (true) {
                int i15 = i14 & (-128);
                ByteBuffer byteBuffer = this.buffer;
                if (i15 == 0) {
                    byteBuffer.put((byte) i14);
                    return;
                }
                try {
                    byteBuffer.put((byte) ((i14 & 127) | 128));
                    i14 >>>= 7;
                } catch (BufferOverflowException e4) {
                    throw new OutOfSpaceException(e4);
                }
                throw new OutOfSpaceException(e4);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64(int i14, long j8) throws OutOfSpaceException {
            writeTag(i14, 0);
            writeUInt64NoTag(j8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j8) throws OutOfSpaceException {
            while (true) {
                long j14 = (-128) & j8;
                ByteBuffer byteBuffer = this.buffer;
                if (j14 == 0) {
                    byteBuffer.put((byte) j8);
                    return;
                }
                try {
                    byteBuffer.put((byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                } catch (BufferOverflowException e4) {
                    throw new OutOfSpaceException(e4);
                }
                throw new OutOfSpaceException(e4);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws OutOfSpaceException {
            write(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int i14, byte[] bArr) throws OutOfSpaceException {
            writeByteArray(i14, bArr, 0, bArr.length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int i14, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws OutOfSpaceException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte b14) throws OutOfSpaceException {
            try {
                this.buffer.put(b14);
            } catch (BufferOverflowException e4) {
                throw new OutOfSpaceException(e4);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                this.buffer.put(byteBuffer);
            } catch (BufferOverflowException e4) {
                throw new OutOfSpaceException(e4);
            }
        }
    }

    public static final class UnsafeDirectNioEncoder extends CodedOutputStream {
        private final long address;
        private final ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final ByteBuffer originalBuffer;
        private long position;

        public UnsafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            this.initialPosition = jPosition;
            long jLimit = jAddressOffset + ((long) byteBuffer.limit());
            this.limit = jLimit;
            this.oneVarintLimit = jLimit - 10;
            this.position = jPosition;
        }

        private int bufferPos(long j8) {
            return (int) (j8 - this.address);
        }

        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void repositionBuffer(long j8) {
            this.buffer.position(bufferPos(j8));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() {
            this.originalBuffer.position(bufferPos(this.position));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.position - this.initialPosition);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.limit - this.position);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] bArr, int i14, int i15) throws OutOfSpaceException {
            if (bArr != null && i14 >= 0 && i15 >= 0 && bArr.length - i15 >= i14) {
                long j8 = i15;
                long j14 = this.limit - j8;
                long j15 = this.position;
                if (j14 >= j15) {
                    UnsafeUtil.copyMemory(bArr, i14, j15, j8);
                    this.position += j8;
                    return;
                }
            }
            if (bArr != null) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(i15)));
            }
            x.l("value");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBool(int i14, boolean z14) throws OutOfSpaceException {
            writeTag(i14, 0);
            write(z14 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int i14, byte[] bArr, int i15, int i16) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeByteArrayNoTag(bArr, i15, i16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i14, int i15) throws OutOfSpaceException {
            writeUInt32NoTag(i15);
            write(bArr, i14, i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteBuffer(int i14, ByteBuffer byteBuffer) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytes(int i14, ByteString byteString) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws OutOfSpaceException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32(int i14, int i15) throws OutOfSpaceException {
            writeTag(i14, 5);
            writeFixed32NoTag(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i14) {
            this.buffer.putInt(bufferPos(this.position), i14);
            this.position += 4;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64(int i14, long j8) throws OutOfSpaceException {
            writeTag(i14, 1);
            writeFixed64NoTag(j8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j8) {
            this.buffer.putLong(bufferPos(this.position), j8);
            this.position += 8;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32(int i14, int i15) throws OutOfSpaceException {
            writeTag(i14, 0);
            writeInt32NoTag(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i14) throws OutOfSpaceException {
            if (i14 >= 0) {
                writeUInt32NoTag(i14);
            } else {
                writeUInt64NoTag(i14);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i14, int i15) throws OutOfSpaceException {
            write(bArr, i14, i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int i14, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i14, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i14);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws OutOfSpaceException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            write(byteBufferDuplicate);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i14, ByteString byteString) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i14);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeString(int i14, String str) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws OutOfSpaceException {
            long j8 = this.position;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    int iEncodedLength = Utf8.encodedLength(str);
                    writeUInt32NoTag(iEncodedLength);
                    repositionBuffer(this.position);
                    Utf8.encodeUtf8(str, this.buffer);
                    this.position += (long) iEncodedLength;
                    return;
                }
                int iBufferPos = bufferPos(this.position) + iComputeUInt32SizeNoTag2;
                this.buffer.position(iBufferPos);
                Utf8.encodeUtf8(str, this.buffer);
                int iPosition = this.buffer.position() - iBufferPos;
                writeUInt32NoTag(iPosition);
                this.position += (long) iPosition;
            } catch (Utf8.UnpairedSurrogateException e4) {
                this.position = j8;
                repositionBuffer(j8);
                inefficientWriteStringNoTag(str, e4);
            } catch (IllegalArgumentException e14) {
                throw new OutOfSpaceException(e14);
            } catch (IndexOutOfBoundsException e15) {
                throw new OutOfSpaceException(e15);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeTag(int i14, int i15) throws OutOfSpaceException {
            writeUInt32NoTag(WireFormat.makeTag(i14, i15));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32(int i14, int i15) throws OutOfSpaceException {
            writeTag(i14, 0);
            writeUInt32NoTag(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i14) throws OutOfSpaceException {
            if (this.position <= this.oneVarintLimit) {
                while (true) {
                    int i15 = i14 & (-128);
                    long j8 = this.position;
                    if (i15 == 0) {
                        this.position = 1 + j8;
                        UnsafeUtil.putByte(j8, (byte) i14);
                        return;
                    } else {
                        this.position = j8 + 1;
                        UnsafeUtil.putByte(j8, (byte) ((i14 & 127) | 128));
                        i14 >>>= 7;
                    }
                }
            } else {
                while (true) {
                    long j14 = this.position;
                    if (j14 >= this.limit) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j14), Long.valueOf(this.limit), 1));
                    }
                    if ((i14 & (-128)) == 0) {
                        this.position = 1 + j14;
                        UnsafeUtil.putByte(j14, (byte) i14);
                        return;
                    } else {
                        this.position = j14 + 1;
                        UnsafeUtil.putByte(j14, (byte) ((i14 & 127) | 128));
                        i14 >>>= 7;
                    }
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64(int i14, long j8) throws OutOfSpaceException {
            writeTag(i14, 0);
            writeUInt64NoTag(j8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j8) throws OutOfSpaceException {
            if (this.position <= this.oneVarintLimit) {
                while (true) {
                    long j14 = j8 & (-128);
                    long j15 = this.position;
                    if (j14 == 0) {
                        this.position = 1 + j15;
                        UnsafeUtil.putByte(j15, (byte) j8);
                        return;
                    } else {
                        this.position = j15 + 1;
                        UnsafeUtil.putByte(j15, (byte) ((((int) j8) & 127) | 128));
                        j8 >>>= 7;
                    }
                }
            } else {
                while (true) {
                    long j16 = this.position;
                    if (j16 >= this.limit) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j16), Long.valueOf(this.limit), 1));
                    }
                    if ((j8 & (-128)) == 0) {
                        this.position = 1 + j16;
                        UnsafeUtil.putByte(j16, (byte) j8);
                        return;
                    } else {
                        this.position = j16 + 1;
                        UnsafeUtil.putByte(j16, (byte) ((((int) j8) & 127) | 128));
                        j8 >>>= 7;
                    }
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws OutOfSpaceException {
            write(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int i14, byte[] bArr) throws OutOfSpaceException {
            writeByteArray(i14, bArr, 0, bArr.length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int i14, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws OutOfSpaceException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte b14) throws OutOfSpaceException {
            long j8 = this.position;
            if (j8 < this.limit) {
                this.position = 1 + j8;
                UnsafeUtil.putByte(j8, b14);
                return;
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j8), Long.valueOf(this.limit), 1));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                int iRemaining = byteBuffer.remaining();
                repositionBuffer(this.position);
                this.buffer.put(byteBuffer);
                this.position += (long) iRemaining;
            } catch (BufferOverflowException e4) {
                throw new OutOfSpaceException(e4);
            }
        }
    }

    private CodedOutputStream() {
    }

    public final void writeRawByte(byte b14) {
        write(b14);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) {
        messageLite.writeTo(this);
    }

    public final void writeRawBytes(byte[] bArr, int i14, int i15) {
        write(bArr, i14, i15);
    }

    public static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        private final ByteOutput out;

        public ByteOutputEncoder(ByteOutput byteOutput, int i14) {
            super(i14);
            if (byteOutput != null) {
                this.out = byteOutput;
            } else {
                x.l("out");
                throw null;
            }
        }

        private void doFlush() {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i14) {
            if (this.limit - this.position < i14) {
                doFlush();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.write(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBool(int i14, boolean z14) {
            flushIfNotAvailable(11);
            bufferTag(i14, 0);
            buffer(z14 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int i14, byte[] bArr, int i15, int i16) {
            writeTag(i14, 2);
            writeByteArrayNoTag(bArr, i15, i16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i14, int i15) {
            writeUInt32NoTag(i15);
            write(bArr, i14, i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteBuffer(int i14, ByteBuffer byteBuffer) {
            writeTag(i14, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytes(int i14, ByteString byteString) {
            writeTag(i14, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32(int i14, int i15) {
            flushIfNotAvailable(14);
            bufferTag(i14, 5);
            bufferFixed32NoTag(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i14) {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64(int i14, long j8) {
            flushIfNotAvailable(18);
            bufferTag(i14, 1);
            bufferFixed64NoTag(j8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j8) {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32(int i14, int i15) {
            flushIfNotAvailable(20);
            bufferTag(i14, 0);
            bufferInt32NoTag(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i14) {
            if (i14 >= 0) {
                writeUInt32NoTag(i14);
            } else {
                writeUInt64NoTag(i14);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.writeLazy(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int i14, MessageLite messageLite) {
            writeTag(i14, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i14, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i14);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            write(byteBufferDuplicate);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i14, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i14);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeString(int i14, String str) throws OutOfSpaceException {
            writeTag(i14, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws OutOfSpaceException {
            int length = str.length() * 3;
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i14 = iComputeUInt32SizeNoTag + length;
            int i15 = this.limit;
            if (i14 > i15) {
                byte[] bArr = new byte[length];
                int iEncode = Utf8.encode(str, bArr, 0, length);
                writeUInt32NoTag(iEncode);
                writeLazy(bArr, 0, iEncode);
                return;
            }
            if (i14 > i15 - this.position) {
                doFlush();
            }
            int i16 = this.position;
            try {
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    int iEncodedLength = Utf8.encodedLength(str);
                    bufferUInt32NoTag(iEncodedLength);
                    this.position = Utf8.encode(str, this.buffer, this.position, iEncodedLength);
                    this.totalBytesWritten += iEncodedLength;
                    return;
                }
                int i17 = i16 + iComputeUInt32SizeNoTag2;
                this.position = i17;
                int iEncode2 = Utf8.encode(str, this.buffer, i17, this.limit - i17);
                this.position = i16;
                int i18 = (iEncode2 - i16) - iComputeUInt32SizeNoTag2;
                bufferUInt32NoTag(i18);
                this.position = iEncode2;
                this.totalBytesWritten += i18;
            } catch (Utf8.UnpairedSurrogateException e4) {
                this.totalBytesWritten -= this.position - i16;
                this.position = i16;
                inefficientWriteStringNoTag(str, e4);
            } catch (IndexOutOfBoundsException e14) {
                throw new OutOfSpaceException(e14);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeTag(int i14, int i15) {
            writeUInt32NoTag(WireFormat.makeTag(i14, i15));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32(int i14, int i15) {
            flushIfNotAvailable(20);
            bufferTag(i14, 0);
            bufferUInt32NoTag(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i14) {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64(int i14, long j8) {
            flushIfNotAvailable(20);
            bufferTag(i14, 0);
            bufferUInt64NoTag(j8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j8) {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int i14, byte[] bArr) {
            writeByteArray(i14, bArr, 0, bArr.length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int i14, MessageLite messageLite, Schema schema) {
            writeTag(i14, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] bArr, int i14, int i15) {
            flush();
            this.out.write(bArr, i14, i15);
            this.totalBytesWritten += i15;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i14, int i15) {
            flush();
            this.out.writeLazy(bArr, i14, i15);
            this.totalBytesWritten += i15;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte b14) {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b14);
        }
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public final void writeRawBytes(ByteString byteString) {
        byteString.writeTo(this);
    }

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(String str) {
            super(c.n("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
        }

        public OutOfSpaceException() {
            super(MESSAGE);
        }

        public OutOfSpaceException(Throwable th3) {
            super(MESSAGE, th3);
        }

        public OutOfSpaceException(String str, Throwable th3) {
            super(c.n("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th3);
        }
    }

    public static int computeMessageSize(int i14, MessageLite messageLite, Schema schema) {
        return computeMessageSizeNoTag(messageLite, schema) + computeTagSize(i14);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    @Deprecated
    public static int computeGroupSize(int i14, MessageLite messageLite, Schema schema) {
        return computeGroupSizeNoTag(messageLite, schema) + (computeTagSize(i14) * 2);
    }

    @Deprecated
    public final void writeGroup(int i14, MessageLite messageLite, Schema schema) {
        writeTag(i14, 3);
        writeGroupNoTag(messageLite, schema);
        writeTag(i14, 4);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i14) {
        return new OutputStreamEncoder(outputStream, i14);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i14, int i15) {
        return new ArrayEncoder(bArr, i14, i15);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i14) {
        return newInstance(byteBuffer);
    }

    public static CodedOutputStream newInstance(ByteOutput byteOutput, int i14) {
        if (i14 >= 0) {
            return new ByteOutputEncoder(byteOutput, i14);
        }
        h.s("bufferSize must be positive");
        return null;
    }
}
