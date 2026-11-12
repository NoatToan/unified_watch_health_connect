package com.google.protobuf;

import am.j;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.messaging.l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import v.e0;
import vb.h;
import yc.l2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    CodedInputStreamReader wrapper;

    private CodedInputStream() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public static int decodeZigZag32(int i14) {
        return (-(i14 & 1)) ^ (i14 >>> 1);
    }

    public static long decodeZigZag64(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer, boolean z14) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z14);
        }
        if (byteBuffer.isDirect() && UnsafeDirectNioDecoder.isSupported()) {
            return new UnsafeDirectNioDecoder(byteBuffer, z14);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, iRemaining, true);
    }

    public static int readRawVarint32(int i14, InputStream inputStream) throws IOException {
        if ((i14 & 128) == 0) {
            return i14;
        }
        int i15 = i14 & 127;
        int i16 = 7;
        while (i16 < 32) {
            int i17 = inputStream.read();
            if (i17 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i15 |= (i17 & 127) << i16;
            if ((i17 & 128) == 0) {
                return i15;
            }
            i16 += 7;
        }
        while (i16 < 64) {
            int i18 = inputStream.read();
            if (i18 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i18 & 128) == 0) {
                return i15;
            }
            i16 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public abstract void checkLastTagWas(int i14);

    public void checkRecursionLimit() throws InvalidProtocolBufferException {
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean z14);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd();

    public abstract void popLimit(int i14);

    public abstract int pushLimit(int i14);

    public abstract boolean readBool();

    public abstract byte[] readByteArray();

    public abstract ByteBuffer readByteBuffer();

    public abstract ByteString readBytes();

    public abstract double readDouble();

    public abstract int readEnum();

    public abstract int readFixed32();

    public abstract long readFixed64();

    public abstract float readFloat();

    public abstract <T extends MessageLite> T readGroup(int i14, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite);

    public abstract void readGroup(int i14, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite);

    public abstract int readInt32();

    public abstract long readInt64();

    public abstract <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite);

    public abstract void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite);

    public abstract byte readRawByte();

    public abstract byte[] readRawBytes(int i14);

    public abstract int readRawLittleEndian32();

    public abstract long readRawLittleEndian64();

    public abstract int readRawVarint32();

    public abstract long readRawVarint64();

    public abstract long readRawVarint64SlowPath();

    public abstract int readSFixed32();

    public abstract long readSFixed64();

    public abstract int readSInt32();

    public abstract long readSInt64();

    public abstract String readString();

    public abstract String readStringRequireUtf8();

    public abstract int readTag();

    public abstract int readUInt32();

    public abstract long readUInt64();

    @Deprecated
    public abstract void readUnknownGroup(int i14, MessageLite.Builder builder);

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i14) {
        if (i14 < 0) {
            h.s(j.h(i14, "Recursion limit cannot be negative: "));
            return 0;
        }
        int i15 = this.recursionLimit;
        this.recursionLimit = i14;
        return i15;
    }

    public final int setSizeLimit(int i14) {
        if (i14 < 0) {
            h.s(j.h(i14, "Size limit cannot be negative: "));
            return 0;
        }
        int i15 = this.sizeLimit;
        this.sizeLimit = i14;
        return i15;
    }

    public final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(int i14);

    @Deprecated
    public abstract boolean skipField(int i14, CodedOutputStream codedOutputStream);

    public void skipMessage() throws InvalidProtocolBufferException {
        boolean zSkipField;
        do {
            int tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            zSkipField = skipField(tag);
            this.recursionDepth--;
        } while (zSkipField);
    }

    public abstract void skipRawBytes(int i14);

    public final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    public static final class ArrayDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private ArrayDecoder(byte[] bArr, int i14, int i15, boolean z14) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = bArr;
            this.limit = i15 + i14;
            this.pos = i14;
            this.startPos = i14;
            this.immutable = z14;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i14 = this.limit + this.bufferSizeAfterLimit;
            this.limit = i14;
            int i15 = i14 - this.startPos;
            int i16 = this.currentLimit;
            if (i15 <= i16) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i17 = i15 - i16;
            this.bufferSizeAfterLimit = i17;
            this.limit = i14 - i17;
        }

        private void skipRawVarint() throws InvalidProtocolBufferException {
            if (this.limit - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws InvalidProtocolBufferException {
            for (int i14 = 0; i14 < 10; i14++) {
                byte[] bArr = this.buffer;
                int i15 = this.pos;
                this.pos = i15 + 1;
                if (bArr[i15] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws InvalidProtocolBufferException {
            for (int i14 = 0; i14 < 10; i14++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i14) throws InvalidProtocolBufferException {
            if (this.lastTag != i14) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z14) {
            this.enableAliasing = z14;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i14 = this.currentLimit;
            if (i14 == Integer.MAX_VALUE) {
                return -1;
            }
            return i14 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i14) {
            this.currentLimit = i14;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i14) throws InvalidProtocolBufferException {
            if (i14 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i14 + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i15 = this.currentLimit;
            if (totalBytesRead > i15) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i15;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i14 = this.limit;
                int i15 = this.pos;
                if (rawVarint32 <= i14 - i15) {
                    ByteBuffer byteBufferWrap = (this.immutable || !this.enableAliasing) ? ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i15, i15 + rawVarint32)) : ByteBuffer.wrap(this.buffer, i15, rawVarint32).slice();
                    this.pos += rawVarint32;
                    return byteBufferWrap;
                }
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i14 = this.limit;
                int i15 = this.pos;
                if (rawVarint32 <= i14 - i15) {
                    ByteString byteStringWrap = (this.immutable && this.enableAliasing) ? ByteString.wrap(this.buffer, i15, rawVarint32) : ByteString.copyFrom(this.buffer, i15, rawVarint32);
                    this.pos += rawVarint32;
                    return byteStringWrap;
                }
            }
            return rawVarint32 == 0 ? ByteString.EMPTY : ByteString.wrap(readRawBytes(rawVarint32));
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i14, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i14, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws InvalidProtocolBufferException {
            int i14 = this.pos;
            if (i14 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i14 + 1;
            return bArr[i14];
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i14) throws InvalidProtocolBufferException {
            if (i14 > 0) {
                int i15 = this.limit;
                int i16 = this.pos;
                if (i14 <= i15 - i16) {
                    int i17 = i14 + i16;
                    this.pos = i17;
                    return Arrays.copyOfRange(this.buffer, i16, i17);
                }
            }
            if (i14 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i14 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws InvalidProtocolBufferException {
            int i14 = this.pos;
            if (this.limit - i14 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i14 + 4;
            return ((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i14] & UnsignedBytes.MAX_VALUE) | ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws InvalidProtocolBufferException {
            int i14 = this.pos;
            if (this.limit - i14 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i14 + 8;
            return ((((long) bArr[i14 + 7]) & 255) << 56) | (((long) bArr[i14]) & 255) | ((((long) bArr[i14 + 1]) & 255) << 8) | ((((long) bArr[i14 + 2]) & 255) << 16) | ((((long) bArr[i14 + 3]) & 255) << 24) | ((((long) bArr[i14 + 4]) & 255) << 32) | ((((long) bArr[i14 + 5]) & 255) << 40) | ((((long) bArr[i14 + 6]) & 255) << 48);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() {
            int i14;
            int i15 = this.pos;
            int i16 = this.limit;
            if (i16 != i15) {
                byte[] bArr = this.buffer;
                int i17 = i15 + 1;
                byte b14 = bArr[i15];
                if (b14 >= 0) {
                    this.pos = i17;
                    return b14;
                }
                if (i16 - i17 >= 9) {
                    int i18 = i15 + 2;
                    int i19 = (bArr[i17] << 7) ^ b14;
                    if (i19 < 0) {
                        i14 = i19 ^ (-128);
                    } else {
                        int i24 = i15 + 3;
                        int i25 = (bArr[i18] << Ascii.SO) ^ i19;
                        if (i25 >= 0) {
                            i14 = i25 ^ 16256;
                        } else {
                            int i26 = i15 + 4;
                            int i27 = i25 ^ (bArr[i24] << Ascii.NAK);
                            if (i27 < 0) {
                                i14 = (-2080896) ^ i27;
                            } else {
                                i24 = i15 + 5;
                                byte b15 = bArr[i26];
                                int i28 = (i27 ^ (b15 << Ascii.FS)) ^ 266354560;
                                if (b15 < 0) {
                                    i26 = i15 + 6;
                                    if (bArr[i24] < 0) {
                                        i24 = i15 + 7;
                                        if (bArr[i26] < 0) {
                                            i26 = i15 + 8;
                                            if (bArr[i24] < 0) {
                                                i24 = i15 + 9;
                                                if (bArr[i26] < 0) {
                                                    int i29 = i15 + 10;
                                                    if (bArr[i24] >= 0) {
                                                        i18 = i29;
                                                        i14 = i28;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i14 = i28;
                                }
                                i14 = i28;
                            }
                            i18 = i26;
                        }
                        i18 = i24;
                    }
                    this.pos = i18;
                    return i14;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j8;
            long j14;
            long j15;
            int i14 = this.pos;
            int i15 = this.limit;
            if (i15 != i14) {
                byte[] bArr = this.buffer;
                int i16 = i14 + 1;
                byte b14 = bArr[i14];
                if (b14 >= 0) {
                    this.pos = i16;
                    return b14;
                }
                if (i15 - i16 >= 9) {
                    int i17 = i14 + 2;
                    int i18 = (bArr[i16] << 7) ^ b14;
                    if (i18 < 0) {
                        j8 = i18 ^ (-128);
                    } else {
                        int i19 = i14 + 3;
                        int i24 = (bArr[i17] << Ascii.SO) ^ i18;
                        if (i24 >= 0) {
                            j8 = i24 ^ 16256;
                            i17 = i19;
                        } else {
                            int i25 = i14 + 4;
                            int i26 = i24 ^ (bArr[i19] << Ascii.NAK);
                            if (i26 < 0) {
                                long j16 = (-2080896) ^ i26;
                                i17 = i25;
                                j8 = j16;
                            } else {
                                long j17 = i26;
                                i17 = i14 + 5;
                                long j18 = j17 ^ (((long) bArr[i25]) << 28);
                                if (j18 >= 0) {
                                    j15 = 266354560;
                                } else {
                                    int i27 = i14 + 6;
                                    long j19 = j18 ^ (((long) bArr[i17]) << 35);
                                    if (j19 < 0) {
                                        j14 = -34093383808L;
                                    } else {
                                        i17 = i14 + 7;
                                        j18 = j19 ^ (((long) bArr[i27]) << 42);
                                        if (j18 >= 0) {
                                            j15 = 4363953127296L;
                                        } else {
                                            i27 = i14 + 8;
                                            j19 = j18 ^ (((long) bArr[i17]) << 49);
                                            if (j19 < 0) {
                                                j14 = -558586000294016L;
                                            } else {
                                                i17 = i14 + 9;
                                                long j24 = (j19 ^ (((long) bArr[i27]) << 56)) ^ 71499008037633920L;
                                                if (j24 < 0) {
                                                    int i28 = i14 + 10;
                                                    if (bArr[i17] >= 0) {
                                                        i17 = i28;
                                                    }
                                                }
                                                j8 = j24;
                                            }
                                        }
                                    }
                                    j8 = j19 ^ j14;
                                    i17 = i27;
                                }
                                j8 = j18 ^ j15;
                            }
                        }
                    }
                    this.pos = i17;
                    return j8;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
            long j8 = 0;
            for (int i14 = 0; i14 < 64; i14 += 7) {
                byte rawByte = readRawByte();
                j8 |= ((long) (rawByte & Ascii.DEL)) << i14;
                if ((rawByte & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j8;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i14 = this.limit;
                int i15 = this.pos;
                if (rawVarint32 <= i14 - i15) {
                    String str = new String(this.buffer, i15, rawVarint32, Internal.UTF_8);
                    this.pos += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i14 = this.limit;
                int i15 = this.pos;
                if (rawVarint32 <= i14 - i15) {
                    String strDecodeUtf8 = Utf8.decodeUtf8(this.buffer, i15, rawVarint32);
                    this.pos += rawVarint32;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i14, MessageLite.Builder builder) throws InvalidProtocolBufferException {
            readGroup(i14, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i14, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i14);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i14);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i14);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i14);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i14);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i14), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int rawLittleEndian32 = readRawLittleEndian32();
            codedOutputStream.writeUInt32NoTag(i14);
            codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i14) throws InvalidProtocolBufferException {
            if (i14 >= 0) {
                int i15 = this.limit;
                int i16 = this.pos;
                if (i14 <= i15 - i16) {
                    this.pos = i16 + i14;
                    return;
                }
            }
            if (i14 >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i14, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i14, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i14) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i14);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i14), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public static final class IterableDirectByteBufferDecoder extends CodedInputStream {
        private int bufferSizeAfterCurrentLimit;
        private long currentAddress;
        private ByteBuffer currentByteBuffer;
        private long currentByteBufferLimit;
        private long currentByteBufferPos;
        private long currentByteBufferStartPos;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private final Iterable<ByteBuffer> input;
        private final Iterator<ByteBuffer> iterator;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;

        private IterableDirectByteBufferDecoder(Iterable<ByteBuffer> iterable, int i14, boolean z14) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.totalBufferSize = i14;
            this.input = iterable;
            this.iterator = iterable.iterator();
            this.immutable = z14;
            this.totalBytesRead = 0;
            this.startOffset = 0;
            if (i14 != 0) {
                tryGetNextByteBuffer();
                return;
            }
            this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
            this.currentByteBufferPos = 0L;
            this.currentByteBufferStartPos = 0L;
            this.currentByteBufferLimit = 0L;
            this.currentAddress = 0L;
        }

        private long currentRemaining() {
            return this.currentByteBufferLimit - this.currentByteBufferPos;
        }

        private void getNextByteBuffer() throws InvalidProtocolBufferException {
            if (!this.iterator.hasNext()) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            tryGetNextByteBuffer();
        }

        private void readRawBytesTo(byte[] bArr, int i14, int i15) throws InvalidProtocolBufferException {
            if (i15 < 0 || i15 > remaining()) {
                if (i15 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i15 != 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i16 = i15;
            while (i16 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i16, (int) currentRemaining());
                long j8 = iMin;
                UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, (i15 - i16) + i14, j8);
                i16 -= iMin;
                this.currentByteBufferPos += j8;
            }
        }

        private void recomputeBufferSizeAfterLimit() {
            int i14 = this.totalBufferSize + this.bufferSizeAfterCurrentLimit;
            this.totalBufferSize = i14;
            int i15 = i14 - this.startOffset;
            int i16 = this.currentLimit;
            if (i15 <= i16) {
                this.bufferSizeAfterCurrentLimit = 0;
                return;
            }
            int i17 = i15 - i16;
            this.bufferSizeAfterCurrentLimit = i17;
            this.totalBufferSize = i14 - i17;
        }

        private int remaining() {
            return (int) ((((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
        }

        private void skipRawVarint() throws InvalidProtocolBufferException {
            for (int i14 = 0; i14 < 10; i14++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer slice(int i14, int i15) {
            int iPosition = this.currentByteBuffer.position();
            int iLimit = this.currentByteBuffer.limit();
            ByteBuffer byteBuffer = this.currentByteBuffer;
            try {
                try {
                    byteBuffer.position(i14);
                    byteBuffer.limit(i15);
                    ByteBuffer byteBufferSlice = this.currentByteBuffer.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } catch (Throwable th3) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th3;
            }
        }

        private void tryGetNextByteBuffer() {
            ByteBuffer next = this.iterator.next();
            this.currentByteBuffer = next;
            this.totalBytesRead += (int) (this.currentByteBufferPos - this.currentByteBufferStartPos);
            long jPosition = next.position();
            this.currentByteBufferPos = jPosition;
            this.currentByteBufferStartPos = jPosition;
            this.currentByteBufferLimit = this.currentByteBuffer.limit();
            long jAddressOffset = UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentAddress = jAddressOffset;
            this.currentByteBufferPos += jAddressOffset;
            this.currentByteBufferStartPos += jAddressOffset;
            this.currentByteBufferLimit += jAddressOffset;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i14) throws InvalidProtocolBufferException {
            if (this.lastTag != i14) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z14) {
            this.enableAliasing = z14;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i14 = this.currentLimit;
            if (i14 == Integer.MAX_VALUE) {
                return -1;
            }
            return i14 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) ((((long) (this.totalBytesRead - this.startOffset)) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() {
            return (((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos == ((long) this.totalBufferSize);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i14) {
            this.currentLimit = i14;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i14) throws InvalidProtocolBufferException {
            if (i14 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i14 + getTotalBytesRead();
            int i15 = this.currentLimit;
            if (totalBytesRead > i15) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i15;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j8 = rawVarint32;
                if (j8 <= currentRemaining()) {
                    if (this.immutable || !this.enableAliasing) {
                        byte[] bArr = new byte[rawVarint32];
                        UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j8);
                        this.currentByteBufferPos += j8;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j14 = this.currentByteBufferPos + j8;
                    this.currentByteBufferPos = j14;
                    long j15 = this.currentAddress;
                    return slice((int) ((j14 - j15) - j8), (int) (j14 - j15));
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return ByteBuffer.wrap(bArr2);
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j8 = rawVarint32;
                long j14 = this.currentByteBufferLimit;
                long j15 = this.currentByteBufferPos;
                if (j8 <= j14 - j15) {
                    if (this.immutable && this.enableAliasing) {
                        int i14 = (int) (j15 - this.currentAddress);
                        ByteString byteStringWrap = ByteString.wrap(slice(i14, rawVarint32 + i14));
                        this.currentByteBufferPos += j8;
                        return byteStringWrap;
                    }
                    byte[] bArr = new byte[rawVarint32];
                    UnsafeUtil.copyMemory(j15, bArr, 0L, j8);
                    this.currentByteBufferPos += j8;
                    return ByteString.wrap(bArr);
                }
            }
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (!this.immutable || !this.enableAliasing) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return ByteString.wrap(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (rawVarint32 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(rawVarint32, (int) currentRemaining());
                int i15 = (int) (this.currentByteBufferPos - this.currentAddress);
                arrayList.add(ByteString.wrap(slice(i15, i15 + iMin)));
                rawVarint32 -= iMin;
                this.currentByteBufferPos += (long) iMin;
            }
            return ByteString.copyFrom(arrayList);
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i14, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i14, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws InvalidProtocolBufferException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j8 = this.currentByteBufferPos;
            this.currentByteBufferPos = 1 + j8;
            return UnsafeUtil.getByte(j8);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i14) throws InvalidProtocolBufferException {
            if (i14 >= 0) {
                long j8 = i14;
                if (j8 <= currentRemaining()) {
                    byte[] bArr = new byte[i14];
                    UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j8);
                    this.currentByteBufferPos += j8;
                    return bArr;
                }
            }
            if (i14 >= 0 && i14 <= remaining()) {
                byte[] bArr2 = new byte[i14];
                readRawBytesTo(bArr2, 0, i14);
                return bArr2;
            }
            if (i14 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i14 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() {
            if (currentRemaining() < 4) {
                return (readRawByte() & UnsignedBytes.MAX_VALUE) | ((readRawByte() & UnsignedBytes.MAX_VALUE) << 8) | ((readRawByte() & UnsignedBytes.MAX_VALUE) << 16) | ((readRawByte() & UnsignedBytes.MAX_VALUE) << 24);
            }
            long j8 = this.currentByteBufferPos;
            this.currentByteBufferPos = 4 + j8;
            return ((UnsafeUtil.getByte(j8 + 3) & UnsignedBytes.MAX_VALUE) << 24) | (UnsafeUtil.getByte(j8) & UnsignedBytes.MAX_VALUE) | ((UnsafeUtil.getByte(1 + j8) & UnsignedBytes.MAX_VALUE) << 8) | ((UnsafeUtil.getByte(2 + j8) & UnsignedBytes.MAX_VALUE) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws InvalidProtocolBufferException {
            char c14;
            long rawByte;
            byte rawByte2;
            if (currentRemaining() >= 8) {
                long j8 = this.currentByteBufferPos;
                this.currentByteBufferPos = 8 + j8;
                c14 = '8';
                rawByte = (((long) UnsafeUtil.getByte(j8)) & 255) | ((((long) UnsafeUtil.getByte(1 + j8)) & 255) << 8) | ((((long) UnsafeUtil.getByte(2 + j8)) & 255) << 16) | ((((long) UnsafeUtil.getByte(3 + j8)) & 255) << 24) | ((((long) UnsafeUtil.getByte(4 + j8)) & 255) << 32) | ((((long) UnsafeUtil.getByte(5 + j8)) & 255) << 40) | ((((long) UnsafeUtil.getByte(6 + j8)) & 255) << 48);
                rawByte2 = UnsafeUtil.getByte(j8 + 7);
            } else {
                c14 = '8';
                rawByte = (((long) readRawByte()) & 255) | ((((long) readRawByte()) & 255) << 8) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48);
                rawByte2 = readRawByte();
            }
            return rawByte | ((((long) rawByte2) & 255) << c14);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() {
            int i14;
            long j8 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j8) {
                long j14 = j8 + 1;
                byte b14 = UnsafeUtil.getByte(j8);
                if (b14 >= 0) {
                    this.currentByteBufferPos++;
                    return b14;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j15 = 2 + j8;
                    int i15 = (UnsafeUtil.getByte(j14) << 7) ^ b14;
                    if (i15 < 0) {
                        i14 = i15 ^ (-128);
                    } else {
                        long j16 = 3 + j8;
                        int i16 = (UnsafeUtil.getByte(j15) << Ascii.SO) ^ i15;
                        if (i16 >= 0) {
                            i14 = i16 ^ 16256;
                        } else {
                            long j17 = 4 + j8;
                            int i17 = i16 ^ (UnsafeUtil.getByte(j16) << Ascii.NAK);
                            if (i17 < 0) {
                                i14 = (-2080896) ^ i17;
                            } else {
                                j16 = 5 + j8;
                                byte b15 = UnsafeUtil.getByte(j17);
                                int i18 = (i17 ^ (b15 << Ascii.FS)) ^ 266354560;
                                if (b15 < 0) {
                                    j17 = 6 + j8;
                                    if (UnsafeUtil.getByte(j16) < 0) {
                                        j16 = 7 + j8;
                                        if (UnsafeUtil.getByte(j17) < 0) {
                                            j17 = 8 + j8;
                                            if (UnsafeUtil.getByte(j16) < 0) {
                                                j16 = 9 + j8;
                                                if (UnsafeUtil.getByte(j17) < 0) {
                                                    long j18 = j8 + 10;
                                                    if (UnsafeUtil.getByte(j16) >= 0) {
                                                        i14 = i18;
                                                        j15 = j18;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i14 = i18;
                                }
                                i14 = i18;
                            }
                            j15 = j17;
                        }
                        j15 = j16;
                    }
                    this.currentByteBufferPos = j15;
                    return i14;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j8;
            long j14;
            long j15;
            long j16 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j16) {
                long j17 = j16 + 1;
                byte b14 = UnsafeUtil.getByte(j16);
                if (b14 >= 0) {
                    this.currentByteBufferPos++;
                    return b14;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j18 = 2 + j16;
                    int i14 = (UnsafeUtil.getByte(j17) << 7) ^ b14;
                    if (i14 < 0) {
                        j8 = i14 ^ (-128);
                    } else {
                        long j19 = 3 + j16;
                        int i15 = (UnsafeUtil.getByte(j18) << Ascii.SO) ^ i14;
                        if (i15 >= 0) {
                            j8 = i15 ^ 16256;
                            j18 = j19;
                        } else {
                            long j24 = 4 + j16;
                            int i16 = i15 ^ (UnsafeUtil.getByte(j19) << Ascii.NAK);
                            if (i16 < 0) {
                                j8 = (-2080896) ^ i16;
                                j18 = j24;
                            } else {
                                long j25 = 5 + j16;
                                long j26 = (((long) UnsafeUtil.getByte(j24)) << 28) ^ ((long) i16);
                                if (j26 >= 0) {
                                    j15 = 266354560;
                                } else {
                                    long j27 = 6 + j16;
                                    long j28 = j26 ^ (((long) UnsafeUtil.getByte(j25)) << 35);
                                    if (j28 < 0) {
                                        j14 = -34093383808L;
                                    } else {
                                        j25 = 7 + j16;
                                        j26 = j28 ^ (((long) UnsafeUtil.getByte(j27)) << 42);
                                        if (j26 >= 0) {
                                            j15 = 4363953127296L;
                                        } else {
                                            j27 = 8 + j16;
                                            j28 = j26 ^ (((long) UnsafeUtil.getByte(j25)) << 49);
                                            if (j28 < 0) {
                                                j14 = -558586000294016L;
                                            } else {
                                                j25 = 9 + j16;
                                                long j29 = (j28 ^ (((long) UnsafeUtil.getByte(j27)) << 56)) ^ 71499008037633920L;
                                                if (j29 < 0) {
                                                    long j34 = j16 + 10;
                                                    if (UnsafeUtil.getByte(j25) >= 0) {
                                                        j18 = j34;
                                                        j8 = j29;
                                                    }
                                                } else {
                                                    j8 = j29;
                                                    j18 = j25;
                                                }
                                            }
                                        }
                                    }
                                    j8 = j14 ^ j28;
                                    j18 = j27;
                                }
                                j8 = j15 ^ j26;
                                j18 = j25;
                            }
                        }
                    }
                    this.currentByteBufferPos = j18;
                    return j8;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
            long j8 = 0;
            for (int i14 = 0; i14 < 64; i14 += 7) {
                byte rawByte = readRawByte();
                j8 |= ((long) (rawByte & Ascii.DEL)) << i14;
                if ((rawByte & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j8;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j8 = rawVarint32;
                long j14 = this.currentByteBufferLimit;
                long j15 = this.currentByteBufferPos;
                if (j8 <= j14 - j15) {
                    byte[] bArr = new byte[rawVarint32];
                    UnsafeUtil.copyMemory(j15, bArr, 0L, j8);
                    String str = new String(bArr, Internal.UTF_8);
                    this.currentByteBufferPos += j8;
                    return str;
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return new String(bArr2, Internal.UTF_8);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j8 = rawVarint32;
                long j14 = this.currentByteBufferLimit;
                long j15 = this.currentByteBufferPos;
                if (j8 <= j14 - j15) {
                    String strDecodeUtf8 = Utf8.decodeUtf8(this.currentByteBuffer, (int) (j15 - this.currentByteBufferStartPos), rawVarint32);
                    this.currentByteBufferPos += j8;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 >= 0 && rawVarint32 <= remaining()) {
                byte[] bArr = new byte[rawVarint32];
                readRawBytesTo(bArr, 0, rawVarint32);
                return Utf8.decodeUtf8(bArr, 0, rawVarint32);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i14, MessageLite.Builder builder) throws InvalidProtocolBufferException {
            readGroup(i14, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startOffset = (int) ((((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i14, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i14);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i14);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i14);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i14);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i14);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i14), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int rawLittleEndian32 = readRawLittleEndian32();
            codedOutputStream.writeUInt32NoTag(i14);
            codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i14) throws InvalidProtocolBufferException {
            if (i14 < 0 || i14 > (((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
                if (i14 >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            while (i14 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i14, (int) currentRemaining());
                i14 -= iMin;
                this.currentByteBufferPos += (long) iMin;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i14, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i14, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i14) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i14);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i14), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public static final class StreamDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final InputStream input;
        private int lastTag;
        private int pos;
        private RefillCallback refillCallback;
        private int totalBytesRetired;

        public interface RefillCallback {
            void onRefill();
        }

        public class SkippedDataSink implements RefillCallback {
            private ByteArrayOutputStream byteArrayStream;
            private int lastPos;

            private SkippedDataSink() {
                this.lastPos = StreamDecoder.this.pos;
            }

            public ByteBuffer getSkippedData() {
                ByteArrayOutputStream byteArrayOutputStream = this.byteArrayStream;
                StreamDecoder streamDecoder = StreamDecoder.this;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(streamDecoder.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                }
                byteArrayOutputStream.write(streamDecoder.buffer, this.lastPos, StreamDecoder.this.pos);
                return ByteBuffer.wrap(this.byteArrayStream.toByteArray());
            }

            @Override // com.google.protobuf.CodedInputStream.StreamDecoder.RefillCallback
            public void onRefill() {
                if (this.byteArrayStream == null) {
                    this.byteArrayStream = new ByteArrayOutputStream();
                }
                this.byteArrayStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                this.lastPos = 0;
            }
        }

        private StreamDecoder(InputStream inputStream, int i14) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.refillCallback = null;
            Internal.checkNotNull(inputStream, "input");
            this.input = inputStream;
            this.buffer = new byte[i14];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        private static int available(InputStream inputStream) throws InvalidProtocolBufferException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e4) {
                e4.setThrownFromInputStream();
                throw e4;
            }
        }

        private static int read(InputStream inputStream, byte[] bArr, int i14, int i15) throws InvalidProtocolBufferException {
            try {
                return inputStream.read(bArr, i14, i15);
            } catch (InvalidProtocolBufferException e4) {
                e4.setThrownFromInputStream();
                throw e4;
            }
        }

        private ByteString readBytesSlowPath(int i14) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i14);
            if (rawBytesSlowPathOneChunk != null) {
                return ByteString.copyFrom(rawBytesSlowPathOneChunk);
            }
            int i15 = this.pos;
            int i16 = this.bufferSize;
            int length = i16 - i15;
            this.totalBytesRetired += i16;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i14 - length);
            byte[] bArr = new byte[i14];
            System.arraycopy(this.buffer, i15, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        private byte[] readRawBytesSlowPath(int i14, boolean z14) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i14);
            if (rawBytesSlowPathOneChunk != null) {
                return z14 ? (byte[]) rawBytesSlowPathOneChunk.clone() : rawBytesSlowPathOneChunk;
            }
            int i15 = this.pos;
            int i16 = this.bufferSize;
            int length = i16 - i15;
            this.totalBytesRetired += i16;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i14 - length);
            byte[] bArr = new byte[i14];
            System.arraycopy(this.buffer, i15, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] readRawBytesSlowPathOneChunk(int i14) throws InvalidProtocolBufferException {
            if (i14 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            if (i14 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i15 = this.totalBytesRetired;
            int i16 = this.pos;
            int i17 = i15 + i16 + i14;
            if (i17 - this.sizeLimit > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i18 = this.currentLimit;
            if (i17 > i18) {
                skipRawBytes((i18 - i15) - i16);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i19 = this.bufferSize - i16;
            int i24 = i14 - i19;
            if (i24 >= 4096 && i24 > available(this.input)) {
                return null;
            }
            byte[] bArr = new byte[i14];
            System.arraycopy(this.buffer, this.pos, bArr, 0, i19);
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            while (i19 < i14) {
                int i25 = read(this.input, bArr, i19, i14 - i19);
                if (i25 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += i25;
                i19 += i25;
            }
            return bArr;
        }

        private List<byte[]> readRawBytesSlowPathRemainingChunks(int i14) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i14 > 0) {
                int iMin = Math.min(i14, 4096);
                byte[] bArr = new byte[iMin];
                int i15 = 0;
                while (i15 < iMin) {
                    int i16 = this.input.read(bArr, i15, iMin - i15);
                    if (i16 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += i16;
                    i15 += i16;
                }
                i14 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i14 = this.bufferSize + this.bufferSizeAfterLimit;
            this.bufferSize = i14;
            int i15 = this.totalBytesRetired + i14;
            int i16 = this.currentLimit;
            if (i15 <= i16) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i17 = i15 - i16;
            this.bufferSizeAfterLimit = i17;
            this.bufferSize = i14 - i17;
        }

        private void refillBuffer(int i14) throws InvalidProtocolBufferException {
            if (tryRefillBuffer(i14)) {
                return;
            }
            if (i14 <= (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        private static long skip(InputStream inputStream, long j8) throws InvalidProtocolBufferException {
            try {
                return inputStream.skip(j8);
            } catch (InvalidProtocolBufferException e4) {
                e4.setThrownFromInputStream();
                throw e4;
            }
        }

        private void skipRawBytesSlowPath(int i14) throws InvalidProtocolBufferException {
            if (i14 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i15 = this.totalBytesRetired;
            int i16 = this.pos;
            int i17 = i15 + i16 + i14;
            int i18 = this.currentLimit;
            if (i17 > i18) {
                skipRawBytes((i18 - i15) - i16);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i19 = 0;
            if (this.refillCallback == null) {
                this.totalBytesRetired = i15 + i16;
                int i24 = this.bufferSize - i16;
                this.bufferSize = 0;
                this.pos = 0;
                i19 = i24;
                while (i19 < i14) {
                    try {
                        long j8 = i14 - i19;
                        long jSkip = skip(this.input, j8);
                        if (jSkip < 0 || jSkip > j8) {
                            throw new IllegalStateException(this.input.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i19 += (int) jSkip;
                        }
                    } finally {
                        this.totalBytesRetired += i19;
                        recomputeBufferSizeAfterLimit();
                    }
                }
            }
            if (i19 >= i14) {
                return;
            }
            int i25 = this.bufferSize;
            int i26 = i25 - this.pos;
            this.pos = i25;
            refillBuffer(1);
            while (true) {
                int i27 = i14 - i26;
                int i28 = this.bufferSize;
                if (i27 <= i28) {
                    this.pos = i27;
                    return;
                } else {
                    i26 += i28;
                    this.pos = i28;
                    refillBuffer(1);
                }
            }
        }

        private void skipRawVarint() throws InvalidProtocolBufferException {
            if (this.bufferSize - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws InvalidProtocolBufferException {
            for (int i14 = 0; i14 < 10; i14++) {
                byte[] bArr = this.buffer;
                int i15 = this.pos;
                this.pos = i15 + 1;
                if (bArr[i15] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws InvalidProtocolBufferException {
            for (int i14 = 0; i14 < 10; i14++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private boolean tryRefillBuffer(int i14) throws InvalidProtocolBufferException {
            int i15 = this.pos;
            if (i15 + i14 <= this.bufferSize) {
                h.z(e0.f(i14, "refillBuffer() called when ", " bytes were already available in buffer"));
                return false;
            }
            int i16 = this.sizeLimit;
            int i17 = this.totalBytesRetired;
            if (i14 > (i16 - i17) - i15 || i17 + i15 + i14 > this.currentLimit) {
                return false;
            }
            RefillCallback refillCallback = this.refillCallback;
            if (refillCallback != null) {
                refillCallback.onRefill();
            }
            int i18 = this.pos;
            if (i18 > 0) {
                int i19 = this.bufferSize;
                if (i19 > i18) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i18, bArr, 0, i19 - i18);
                }
                this.totalBytesRetired += i18;
                this.bufferSize -= i18;
                this.pos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i24 = this.bufferSize;
            int i25 = read(inputStream, bArr2, i24, Math.min(bArr2.length - i24, (this.sizeLimit - this.totalBytesRetired) - i24));
            if (i25 == 0 || i25 < -1 || i25 > this.buffer.length) {
                l.f(i25, this.input.getClass());
                return false;
            }
            if (i25 <= 0) {
                return false;
            }
            this.bufferSize += i25;
            recomputeBufferSizeAfterLimit();
            if (this.bufferSize >= i14) {
                return true;
            }
            return tryRefillBuffer(i14);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i14) throws InvalidProtocolBufferException {
            if (this.lastTag != i14) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z14) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i14 = this.currentLimit;
            if (i14 == Integer.MAX_VALUE) {
                return -1;
            }
            return i14 - (this.totalBytesRetired + this.pos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() {
            return this.pos == this.bufferSize && !tryRefillBuffer(1);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i14) {
            this.currentLimit = i14;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i14) throws InvalidProtocolBufferException {
            if (i14 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i15 = this.totalBytesRetired + this.pos + i14;
            int i16 = this.currentLimit;
            if (i15 > i16) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = i15;
            recomputeBufferSizeAfterLimit();
            return i16;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            int i14 = this.bufferSize;
            int i15 = this.pos;
            if (rawVarint32 > i14 - i15 || rawVarint32 <= 0) {
                if (rawVarint32 >= 0) {
                    return readRawBytesSlowPath(rawVarint32, false);
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.buffer, i15, i15 + rawVarint32);
            this.pos += rawVarint32;
            return bArrCopyOfRange;
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            int i14 = this.bufferSize;
            int i15 = this.pos;
            if (rawVarint32 <= i14 - i15 && rawVarint32 > 0) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i15, i15 + rawVarint32));
                this.pos += rawVarint32;
                return byteBufferWrap;
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 >= 0) {
                return ByteBuffer.wrap(readRawBytesSlowPath(rawVarint32, true));
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            int i14 = this.bufferSize;
            int i15 = this.pos;
            if (rawVarint32 <= i14 - i15 && rawVarint32 > 0) {
                ByteString byteStringCopyFrom = ByteString.copyFrom(this.buffer, i15, rawVarint32);
                this.pos += rawVarint32;
                return byteStringCopyFrom;
            }
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 >= 0) {
                return readBytesSlowPath(rawVarint32);
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i14, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i14, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws InvalidProtocolBufferException {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i14 = this.pos;
            this.pos = i14 + 1;
            return bArr[i14];
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i14) {
            int i15 = this.pos;
            if (i14 > this.bufferSize - i15 || i14 <= 0) {
                return readRawBytesSlowPath(i14, false);
            }
            int i16 = i14 + i15;
            this.pos = i16;
            return Arrays.copyOfRange(this.buffer, i15, i16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws InvalidProtocolBufferException {
            int i14 = this.pos;
            if (this.bufferSize - i14 < 4) {
                refillBuffer(4);
                i14 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i14 + 4;
            return ((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i14] & UnsignedBytes.MAX_VALUE) | ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws InvalidProtocolBufferException {
            int i14 = this.pos;
            if (this.bufferSize - i14 < 8) {
                refillBuffer(8);
                i14 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i14 + 8;
            return ((((long) bArr[i14 + 7]) & 255) << 56) | (((long) bArr[i14]) & 255) | ((((long) bArr[i14 + 1]) & 255) << 8) | ((((long) bArr[i14 + 2]) & 255) << 16) | ((((long) bArr[i14 + 3]) & 255) << 24) | ((((long) bArr[i14 + 4]) & 255) << 32) | ((((long) bArr[i14 + 5]) & 255) << 40) | ((((long) bArr[i14 + 6]) & 255) << 48);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() {
            int i14;
            int i15 = this.pos;
            int i16 = this.bufferSize;
            if (i16 != i15) {
                byte[] bArr = this.buffer;
                int i17 = i15 + 1;
                byte b14 = bArr[i15];
                if (b14 >= 0) {
                    this.pos = i17;
                    return b14;
                }
                if (i16 - i17 >= 9) {
                    int i18 = i15 + 2;
                    int i19 = (bArr[i17] << 7) ^ b14;
                    if (i19 < 0) {
                        i14 = i19 ^ (-128);
                    } else {
                        int i24 = i15 + 3;
                        int i25 = (bArr[i18] << Ascii.SO) ^ i19;
                        if (i25 >= 0) {
                            i14 = i25 ^ 16256;
                        } else {
                            int i26 = i15 + 4;
                            int i27 = i25 ^ (bArr[i24] << Ascii.NAK);
                            if (i27 < 0) {
                                i14 = (-2080896) ^ i27;
                            } else {
                                i24 = i15 + 5;
                                byte b15 = bArr[i26];
                                int i28 = (i27 ^ (b15 << Ascii.FS)) ^ 266354560;
                                if (b15 < 0) {
                                    i26 = i15 + 6;
                                    if (bArr[i24] < 0) {
                                        i24 = i15 + 7;
                                        if (bArr[i26] < 0) {
                                            i26 = i15 + 8;
                                            if (bArr[i24] < 0) {
                                                i24 = i15 + 9;
                                                if (bArr[i26] < 0) {
                                                    int i29 = i15 + 10;
                                                    if (bArr[i24] >= 0) {
                                                        i18 = i29;
                                                        i14 = i28;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i14 = i28;
                                }
                                i14 = i28;
                            }
                            i18 = i26;
                        }
                        i18 = i24;
                    }
                    this.pos = i18;
                    return i14;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j8;
            long j14;
            long j15;
            int i14 = this.pos;
            int i15 = this.bufferSize;
            if (i15 != i14) {
                byte[] bArr = this.buffer;
                int i16 = i14 + 1;
                byte b14 = bArr[i14];
                if (b14 >= 0) {
                    this.pos = i16;
                    return b14;
                }
                if (i15 - i16 >= 9) {
                    int i17 = i14 + 2;
                    int i18 = (bArr[i16] << 7) ^ b14;
                    if (i18 < 0) {
                        j8 = i18 ^ (-128);
                    } else {
                        int i19 = i14 + 3;
                        int i24 = (bArr[i17] << Ascii.SO) ^ i18;
                        if (i24 >= 0) {
                            j8 = i24 ^ 16256;
                            i17 = i19;
                        } else {
                            int i25 = i14 + 4;
                            int i26 = i24 ^ (bArr[i19] << Ascii.NAK);
                            if (i26 < 0) {
                                long j16 = (-2080896) ^ i26;
                                i17 = i25;
                                j8 = j16;
                            } else {
                                long j17 = i26;
                                i17 = i14 + 5;
                                long j18 = j17 ^ (((long) bArr[i25]) << 28);
                                if (j18 >= 0) {
                                    j15 = 266354560;
                                } else {
                                    int i27 = i14 + 6;
                                    long j19 = j18 ^ (((long) bArr[i17]) << 35);
                                    if (j19 < 0) {
                                        j14 = -34093383808L;
                                    } else {
                                        i17 = i14 + 7;
                                        j18 = j19 ^ (((long) bArr[i27]) << 42);
                                        if (j18 >= 0) {
                                            j15 = 4363953127296L;
                                        } else {
                                            i27 = i14 + 8;
                                            j19 = j18 ^ (((long) bArr[i17]) << 49);
                                            if (j19 < 0) {
                                                j14 = -558586000294016L;
                                            } else {
                                                i17 = i14 + 9;
                                                long j24 = (j19 ^ (((long) bArr[i27]) << 56)) ^ 71499008037633920L;
                                                if (j24 < 0) {
                                                    int i28 = i14 + 10;
                                                    if (bArr[i17] >= 0) {
                                                        i17 = i28;
                                                    }
                                                }
                                                j8 = j24;
                                            }
                                        }
                                    }
                                    j8 = j19 ^ j14;
                                    i17 = i27;
                                }
                                j8 = j18 ^ j15;
                            }
                        }
                    }
                    this.pos = i17;
                    return j8;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
            long j8 = 0;
            for (int i14 = 0; i14 < 64; i14 += 7) {
                byte rawByte = readRawByte();
                j8 |= ((long) (rawByte & Ascii.DEL)) << i14;
                if ((rawByte & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j8;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i14 = this.bufferSize;
                int i15 = this.pos;
                if (rawVarint32 <= i14 - i15) {
                    String str = new String(this.buffer, i15, rawVarint32, Internal.UTF_8);
                    this.pos += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (rawVarint32 > this.bufferSize) {
                return new String(readRawBytesSlowPath(rawVarint32, false), Internal.UTF_8);
            }
            refillBuffer(rawVarint32);
            String str2 = new String(this.buffer, this.pos, rawVarint32, Internal.UTF_8);
            this.pos += rawVarint32;
            return str2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            byte[] rawBytesSlowPath;
            int rawVarint32 = readRawVarint32();
            int i14 = this.pos;
            int i15 = this.bufferSize;
            if (rawVarint32 <= i15 - i14 && rawVarint32 > 0) {
                rawBytesSlowPath = this.buffer;
                this.pos = i14 + rawVarint32;
            } else {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                i14 = 0;
                if (rawVarint32 <= i15) {
                    refillBuffer(rawVarint32);
                    rawBytesSlowPath = this.buffer;
                    this.pos = rawVarint32;
                } else {
                    rawBytesSlowPath = readRawBytesSlowPath(rawVarint32, false);
                }
            }
            return Utf8.decodeUtf8(rawBytesSlowPath, i14, rawVarint32);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i14, MessageLite.Builder builder) throws InvalidProtocolBufferException {
            readGroup(i14, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i14, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i14);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i14);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i14);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i14);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i14);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i14), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int rawLittleEndian32 = readRawLittleEndian32();
            codedOutputStream.writeUInt32NoTag(i14);
            codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i14) throws InvalidProtocolBufferException {
            int i15 = this.bufferSize;
            int i16 = this.pos;
            if (i14 > i15 - i16 || i14 < 0) {
                skipRawBytesSlowPath(i14);
            } else {
                this.pos = i16 + i14;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i14, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i14, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i14) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i14);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i14), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public static final class UnsafeDirectNioDecoder extends CodedInputStream {
        private final long address;
        private final ByteBuffer buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;

        private UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean z14) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = byteBuffer;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            this.limit = ((long) byteBuffer.limit()) + jAddressOffset;
            long jPosition = jAddressOffset + ((long) byteBuffer.position());
            this.pos = jPosition;
            this.startPos = jPosition;
            this.immutable = z14;
        }

        private int bufferPos(long j8) {
            return (int) (j8 - this.address);
        }

        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void recomputeBufferSizeAfterLimit() {
            long j8 = this.limit + ((long) this.bufferSizeAfterLimit);
            this.limit = j8;
            int i14 = (int) (j8 - this.startPos);
            int i15 = this.currentLimit;
            if (i14 <= i15) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i16 = i14 - i15;
            this.bufferSizeAfterLimit = i16;
            this.limit = j8 - ((long) i16);
        }

        private int remaining() {
            return (int) (this.limit - this.pos);
        }

        private void skipRawVarint() throws InvalidProtocolBufferException {
            if (remaining() >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws InvalidProtocolBufferException {
            for (int i14 = 0; i14 < 10; i14++) {
                long j8 = this.pos;
                this.pos = 1 + j8;
                if (UnsafeUtil.getByte(j8) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws InvalidProtocolBufferException {
            for (int i14 = 0; i14 < 10; i14++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer slice(long j8, long j14) {
            int iPosition = this.buffer.position();
            int iLimit = this.buffer.limit();
            ByteBuffer byteBuffer = this.buffer;
            try {
                try {
                    byteBuffer.position(bufferPos(j8));
                    byteBuffer.limit(bufferPos(j14));
                    ByteBuffer byteBufferSlice = this.buffer.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException e4) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionTruncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                    invalidProtocolBufferExceptionTruncatedMessage.initCause(e4);
                    throw invalidProtocolBufferExceptionTruncatedMessage;
                }
            } catch (Throwable th3) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th3;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i14) throws InvalidProtocolBufferException {
            if (this.lastTag != i14) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z14) {
            this.enableAliasing = z14;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i14 = this.currentLimit;
            if (i14 == Integer.MAX_VALUE) {
                return -1;
            }
            return i14 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (this.pos - this.startPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i14) {
            this.currentLimit = i14;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i14) throws InvalidProtocolBufferException {
            if (i14 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i14 + getTotalBytesRead();
            int i15 = this.currentLimit;
            if (totalBytesRead > i15) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i15;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return Internal.EMPTY_BYTE_BUFFER;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable || !this.enableAliasing) {
                byte[] bArr = new byte[rawVarint32];
                long j8 = rawVarint32;
                UnsafeUtil.copyMemory(this.pos, bArr, 0L, j8);
                this.pos += j8;
                return ByteBuffer.wrap(bArr);
            }
            long j14 = this.pos;
            long j15 = rawVarint32;
            ByteBuffer byteBufferSlice = slice(j14, j14 + j15);
            this.pos += j15;
            return byteBufferSlice;
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable && this.enableAliasing) {
                long j8 = this.pos;
                long j14 = rawVarint32;
                ByteBuffer byteBufferSlice = slice(j8, j8 + j14);
                this.pos += j14;
                return ByteString.wrap(byteBufferSlice);
            }
            byte[] bArr = new byte[rawVarint32];
            long j15 = rawVarint32;
            UnsafeUtil.copyMemory(this.pos, bArr, 0L, j15);
            this.pos += j15;
            return ByteString.wrap(bArr);
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i14, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i14, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws InvalidProtocolBufferException {
            long j8 = this.pos;
            if (j8 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 1 + j8;
            return UnsafeUtil.getByte(j8);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i14) throws InvalidProtocolBufferException {
            if (i14 < 0 || i14 > remaining()) {
                if (i14 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i14 == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArr = new byte[i14];
            long j8 = this.pos;
            long j14 = i14;
            slice(j8, j8 + j14).get(bArr);
            this.pos += j14;
            return bArr;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws InvalidProtocolBufferException {
            long j8 = this.pos;
            if (this.limit - j8 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 4 + j8;
            return ((UnsafeUtil.getByte(j8 + 3) & UnsignedBytes.MAX_VALUE) << 24) | (UnsafeUtil.getByte(j8) & UnsignedBytes.MAX_VALUE) | ((UnsafeUtil.getByte(1 + j8) & UnsignedBytes.MAX_VALUE) << 8) | ((UnsafeUtil.getByte(2 + j8) & UnsignedBytes.MAX_VALUE) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws InvalidProtocolBufferException {
            long j8 = this.pos;
            if (this.limit - j8 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 8 + j8;
            return ((((long) UnsafeUtil.getByte(j8 + 7)) & 255) << 56) | (((long) UnsafeUtil.getByte(j8)) & 255) | ((((long) UnsafeUtil.getByte(1 + j8)) & 255) << 8) | ((((long) UnsafeUtil.getByte(2 + j8)) & 255) << 16) | ((((long) UnsafeUtil.getByte(3 + j8)) & 255) << 24) | ((((long) UnsafeUtil.getByte(4 + j8)) & 255) << 32) | ((((long) UnsafeUtil.getByte(5 + j8)) & 255) << 40) | ((((long) UnsafeUtil.getByte(6 + j8)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r3) < 0) goto L34;
         */
        @Override // com.google.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int readRawVarint32() {
            int i14;
            long j8 = this.pos;
            if (this.limit != j8) {
                long j14 = 1 + j8;
                byte b14 = UnsafeUtil.getByte(j8);
                if (b14 >= 0) {
                    this.pos = j14;
                    return b14;
                }
                if (this.limit - j14 >= 9) {
                    long j15 = 2 + j8;
                    int i15 = (UnsafeUtil.getByte(j14) << 7) ^ b14;
                    if (i15 < 0) {
                        i14 = i15 ^ (-128);
                    } else {
                        long j16 = 3 + j8;
                        int i16 = i15 ^ (UnsafeUtil.getByte(j15) << Ascii.SO);
                        if (i16 >= 0) {
                            i14 = i16 ^ 16256;
                        } else {
                            j15 = 4 + j8;
                            int i17 = i16 ^ (UnsafeUtil.getByte(j16) << Ascii.NAK);
                            if (i17 < 0) {
                                i14 = (-2080896) ^ i17;
                            } else {
                                j16 = 5 + j8;
                                byte b15 = UnsafeUtil.getByte(j15);
                                int i18 = (i17 ^ (b15 << Ascii.FS)) ^ 266354560;
                                if (b15 < 0) {
                                    j15 = 6 + j8;
                                    if (UnsafeUtil.getByte(j16) < 0) {
                                        j16 = 7 + j8;
                                        if (UnsafeUtil.getByte(j15) < 0) {
                                            j15 = 8 + j8;
                                            if (UnsafeUtil.getByte(j16) < 0) {
                                                j16 = j8 + 9;
                                                if (UnsafeUtil.getByte(j15) < 0) {
                                                    j15 = 10 + j8;
                                                }
                                            }
                                        }
                                    }
                                    i14 = i18;
                                }
                                i14 = i18;
                            }
                        }
                        j15 = j16;
                    }
                    this.pos = j15;
                    return i14;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j8;
            long j14;
            long j15;
            int i14;
            long j16 = this.pos;
            if (this.limit != j16) {
                long j17 = 1 + j16;
                byte b14 = UnsafeUtil.getByte(j16);
                if (b14 >= 0) {
                    this.pos = j17;
                    return b14;
                }
                if (this.limit - j17 >= 9) {
                    long j18 = 2 + j16;
                    int i15 = (UnsafeUtil.getByte(j17) << 7) ^ b14;
                    if (i15 >= 0) {
                        long j19 = 3 + j16;
                        int i16 = i15 ^ (UnsafeUtil.getByte(j18) << Ascii.SO);
                        if (i16 >= 0) {
                            j8 = i16 ^ 16256;
                            j18 = j19;
                        } else {
                            j18 = 4 + j16;
                            int i17 = i16 ^ (UnsafeUtil.getByte(j19) << Ascii.NAK);
                            if (i17 < 0) {
                                i14 = (-2080896) ^ i17;
                            } else {
                                long j24 = 5 + j16;
                                long j25 = ((long) i17) ^ (((long) UnsafeUtil.getByte(j18)) << 28);
                                if (j25 >= 0) {
                                    j15 = 266354560;
                                } else {
                                    long j26 = 6 + j16;
                                    long j27 = j25 ^ (((long) UnsafeUtil.getByte(j24)) << 35);
                                    if (j27 < 0) {
                                        j14 = -34093383808L;
                                    } else {
                                        j24 = 7 + j16;
                                        j25 = j27 ^ (((long) UnsafeUtil.getByte(j26)) << 42);
                                        if (j25 >= 0) {
                                            j15 = 4363953127296L;
                                        } else {
                                            j26 = 8 + j16;
                                            j27 = j25 ^ (((long) UnsafeUtil.getByte(j24)) << 49);
                                            if (j27 < 0) {
                                                j14 = -558586000294016L;
                                            } else {
                                                long j28 = j16 + 9;
                                                long j29 = (j27 ^ (((long) UnsafeUtil.getByte(j26)) << 56)) ^ 71499008037633920L;
                                                if (j29 < 0) {
                                                    long j34 = j16 + 10;
                                                    if (UnsafeUtil.getByte(j28) >= 0) {
                                                        j18 = j34;
                                                        j8 = j29;
                                                    }
                                                } else {
                                                    j8 = j29;
                                                    j18 = j28;
                                                }
                                            }
                                        }
                                    }
                                    j8 = j14 ^ j27;
                                    j18 = j26;
                                }
                                j8 = j15 ^ j25;
                                j18 = j24;
                            }
                        }
                        this.pos = j18;
                        return j8;
                    }
                    i14 = i15 ^ (-128);
                    j8 = i14;
                    this.pos = j18;
                    return j8;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
            long j8 = 0;
            for (int i14 = 0; i14 < 64; i14 += 7) {
                byte rawByte = readRawByte();
                j8 |= ((long) (rawByte & Ascii.DEL)) << i14;
                if ((rawByte & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j8;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[rawVarint32];
            long j8 = rawVarint32;
            UnsafeUtil.copyMemory(this.pos, bArr, 0L, j8);
            String str = new String(bArr, Internal.UTF_8);
            this.pos += j8;
            return str;
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                String strDecodeUtf8 = Utf8.decodeUtf8(this.buffer, bufferPos(this.pos), rawVarint32);
                this.pos += (long) rawVarint32;
                return strDecodeUtf8;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i14, MessageLite.Builder builder) throws InvalidProtocolBufferException {
            readGroup(i14, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i14, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i14);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i14);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i14);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i14);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i14);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i14), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int rawLittleEndian32 = readRawLittleEndian32();
            codedOutputStream.writeUInt32NoTag(i14);
            codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i14) throws InvalidProtocolBufferException {
            if (i14 >= 0 && i14 <= remaining()) {
                this.pos += (long) i14;
            } else {
                if (i14 >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i14, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i14, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i14) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i14);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i14), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
        boolean zSkipField;
        do {
            int tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            zSkipField = skipField(tag, codedOutputStream);
            this.recursionDepth--;
        } while (zSkipField);
    }

    public static int readRawVarint32(InputStream inputStream) throws IOException {
        int i14 = inputStream.read();
        if (i14 != -1) {
            return readRawVarint32(i14, inputStream);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static CodedInputStream newInstance(InputStream inputStream, int i14) {
        if (i14 <= 0) {
            h.s("bufferSize must be > 0");
            return null;
        }
        if (inputStream == null) {
            return newInstance(Internal.EMPTY_BYTE_ARRAY);
        }
        return new StreamDecoder(inputStream, i14);
    }

    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable) {
        if (!UnsafeDirectNioDecoder.isSupported()) {
            return newInstance(new IterableByteBufferInputStream(iterable));
        }
        return newInstance(iterable, false);
    }

    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable, boolean z14) {
        int i14 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : iterable) {
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i14 |= 1;
            } else {
                i14 = byteBuffer.isDirect() ? i14 | 2 : i14 | 4;
            }
        }
        if (i14 == 2) {
            return new IterableDirectByteBufferDecoder(iterable, iRemaining, z14);
        }
        return newInstance(new IterableByteBufferInputStream(iterable));
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i14, int i15) {
        return newInstance(bArr, i14, i15, false);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i14, int i15, boolean z14) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(bArr, i14, i15, z14);
        try {
            arrayDecoder.pushLimit(i15);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e4) {
            l2.t(e4);
            return null;
        }
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }
}
