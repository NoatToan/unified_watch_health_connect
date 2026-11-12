package androidx.health.platform.client.proto;

import androidx.media3.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    static {
        Processor safeProcessor;
        if (UnsafeProcessor.isAvailable() && !Android.isOnAndroidDevice()) {
            safeProcessor = new UnsafeProcessor();
        } else {
            safeProcessor = new SafeProcessor();
        }
        processor = safeProcessor;
    }

    static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    static boolean isValidUtf8(byte[] bArr, int i, int i2) {
        return processor.isValidUtf8(bArr, i, i2);
    }

    static int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
        return processor.partialIsValidUtf8(i, bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return incompleteStateFor(b2);
        }
        if (i3 == 1) {
            return incompleteStateFor(b2, bArr[i]);
        }
        if (i3 == 2) {
            return incompleteStateFor(b2, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return incompleteStateFor(i);
        }
        if (i3 == 1) {
            return incompleteStateFor(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return incompleteStateFor(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        throw new AssertionError();
    }

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    static int encodedLength(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int iEncodedLengthGeneral = length;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 2048) {
                iEncodedLengthGeneral += encodedLengthGeneral(str, i);
                break;
            }
            iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
            i++;
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i) < 65536) {
                        throw new UnpairedSurrogateException(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    static int encode(String str, byte[] bArr, int i, int i2) {
        return processor.encodeUtf8(str, bArr, i, i2);
    }

    static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    static int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return processor.partialIsValidUtf8(i, byteBuffer, i2, i3);
    }

    static String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(byteBuffer, i, i2);
    }

    static String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bArr, i, i2);
    }

    static void encodeUtf8(String str, ByteBuffer byteBuffer) {
        processor.encodeUtf8(str, byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i;
        while (i3 < i2 - 7 && (byteBuffer.getLong(i3) & ASCII_MASK_LONG) == 0) {
            i3 += 8;
        }
        return i3 - i;
    }

    static abstract class Processor {
        abstract String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException;

        abstract int encodeUtf8(String str, byte[] bArr, int i, int i2);

        abstract void encodeUtf8Direct(String str, ByteBuffer byteBuffer);

        abstract int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3);

        abstract int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3);

        Processor() {
        }

        final boolean isValidUtf8(byte[] bArr, int i, int i2) {
            return partialIsValidUtf8(0, bArr, i, i2) == 0;
        }

        final boolean isValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
            return partialIsValidUtf8(0, byteBuffer, i, i2) == 0;
        }

        final int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                return partialIsValidUtf8(i, byteBuffer.array(), i2 + iArrayOffset, iArrayOffset + i3);
            }
            if (byteBuffer.isDirect()) {
                return partialIsValidUtf8Direct(i, byteBuffer, i2, i3);
            }
            return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
        
            if (r8.get(r9) > (-65)) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
        
            if (r8.get(r9) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int partialIsValidUtf8Default(int i, ByteBuffer byteBuffer, int i2, int i3) {
            byte b2;
            int i4;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b3 = (byte) i;
                if (b3 < -32) {
                    if (b3 >= -62) {
                        i4 = i2 + 1;
                    }
                    return -1;
                }
                if (b3 < -16) {
                    byte b4 = (byte) (~(i >> 8));
                    if (b4 == 0) {
                        int i5 = i2 + 1;
                        byte b5 = byteBuffer.get(i2);
                        if (i5 >= i3) {
                            return Utf8.incompleteStateFor(b3, b5);
                        }
                        i2 = i5;
                        b4 = b5;
                    }
                    if (b4 <= -65 && ((b3 != -32 || b4 >= -96) && (b3 != -19 || b4 < -96))) {
                        i4 = i2 + 1;
                    }
                    return -1;
                }
                byte b6 = (byte) (~(i >> 8));
                if (b6 == 0) {
                    int i6 = i2 + 1;
                    b6 = byteBuffer.get(i2);
                    if (i6 >= i3) {
                        return Utf8.incompleteStateFor(b3, b6);
                    }
                    i2 = i6;
                    b2 = 0;
                } else {
                    b2 = (byte) (i >> 16);
                }
                if (b2 == 0) {
                    int i7 = i2 + 1;
                    byte b7 = byteBuffer.get(i2);
                    if (i7 >= i3) {
                        return Utf8.incompleteStateFor(b3, b6, b7);
                    }
                    i2 = i7;
                    b2 = b7;
                }
                if (b6 <= -65 && (((b3 << Ascii.FS) + (b6 + 112)) >> 30) == 0 && b2 <= -65) {
                    i4 = i2 + 1;
                }
                return -1;
                i2 = i4;
            }
            return partialIsValidUtf8(byteBuffer, i2, i3);
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
            int iEstimateConsecutiveAscii = i + Utf8.estimateConsecutiveAscii(byteBuffer, i, i2);
            while (iEstimateConsecutiveAscii < i2) {
                int i3 = iEstimateConsecutiveAscii + 1;
                byte b2 = byteBuffer.get(iEstimateConsecutiveAscii);
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i3 >= i2) {
                            return b2;
                        }
                        if (b2 < -62 || byteBuffer.get(i3) > -65) {
                            return -1;
                        }
                        iEstimateConsecutiveAscii += 2;
                    } else {
                        if (b2 >= -16) {
                            if (i3 >= i2 - 2) {
                                return Utf8.incompleteStateFor(byteBuffer, b2, i3, i2 - i3);
                            }
                            byte b3 = byteBuffer.get(i3);
                            if (b3 <= -65 && (((b2 << Ascii.FS) + (b3 + 112)) >> 30) == 0 && byteBuffer.get(iEstimateConsecutiveAscii + 2) <= -65) {
                                i3 = iEstimateConsecutiveAscii + 4;
                                if (byteBuffer.get(iEstimateConsecutiveAscii + 3) > -65) {
                                }
                            }
                            return -1;
                        }
                        if (i3 >= i2 - 1) {
                            return Utf8.incompleteStateFor(byteBuffer, b2, i3, i2 - i3);
                        }
                        byte b4 = byteBuffer.get(i3);
                        if (b4 > -65 || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || byteBuffer.get(iEstimateConsecutiveAscii + 2) > -65))) {
                            return -1;
                        }
                        iEstimateConsecutiveAscii += 3;
                    }
                }
                iEstimateConsecutiveAscii = i3;
            }
            return 0;
        }

        final String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            }
            if (byteBuffer.isDirect()) {
                return decodeUtf8Direct(byteBuffer, i, i2);
            }
            return decodeUtf8Default(byteBuffer, i, i2);
        }

        final String decodeUtf8Default(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = byteBuffer.get(i);
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                i++;
                DecodeUtil.handleOneByte(b2, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b3 = byteBuffer.get(i);
                if (DecodeUtil.isOneByte(b3)) {
                    DecodeUtil.handleOneByte(b3, cArr, i5);
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte b4 = byteBuffer.get(i);
                        if (!DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        i++;
                        DecodeUtil.handleOneByte(b4, cArr, i5);
                        i5++;
                    }
                } else if (DecodeUtil.isTwoBytes(b3)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    DecodeUtil.handleTwoBytes(b3, byteBuffer.get(i6), cArr, i5);
                    i5++;
                } else if (DecodeUtil.isThreeBytes(b3)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    DecodeUtil.handleThreeBytes(b3, byteBuffer.get(i6), byteBuffer.get(i + 2), cArr, i5);
                    i5++;
                    i += 3;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    DecodeUtil.handleFourBytes(b3, byteBuffer.get(i6), byteBuffer.get(i + 2), byteBuffer.get(i + 3), cArr, i5);
                    i5 += 2;
                    i += 4;
                }
            }
            return new String(cArr, 0, i5);
        }

        final void encodeUtf8(String str, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                Java8Compatibility.position(byteBuffer, Utf8.encode(str, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(str, byteBuffer);
            } else {
                encodeUtf8Default(str, byteBuffer);
            }
        }

        final void encodeUtf8Default(String str, ByteBuffer byteBuffer) {
            int i;
            int i2;
            int length = str.length();
            int iPosition = byteBuffer.position();
            int i3 = 0;
            while (i3 < length) {
                try {
                    char cCharAt = str.charAt(i3);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i3, (byte) cCharAt);
                    i3++;
                } catch (IndexOutOfBoundsException unused) {
                    i = iPosition;
                }
            }
            if (i3 == length) {
                Java8Compatibility.position(byteBuffer, iPosition + i3);
                return;
            }
            int i4 = iPosition + i3;
            while (i3 < length) {
                char cCharAt2 = str.charAt(i3);
                if (cCharAt2 < 128) {
                    byteBuffer.put(i4, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i5 = i4 + 1;
                    try {
                        byteBuffer.put(i4, (byte) ((cCharAt2 >>> 6) | PsExtractor.AUDIO_STREAM));
                        byteBuffer.put(i5, (byte) ((cCharAt2 & '?') | 128));
                        i4 = i5;
                    } catch (IndexOutOfBoundsException unused2) {
                        i = i5;
                    }
                } else if (cCharAt2 < 55296 || 57343 < cCharAt2) {
                    int i6 = i4 + 1;
                    byteBuffer.put(i4, (byte) ((cCharAt2 >>> '\f') | 224));
                    i4 += 2;
                    byteBuffer.put(i6, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(i4, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    int i7 = i3 + 1;
                    if (i7 != length) {
                        try {
                            char cCharAt3 = str.charAt(i7);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                i2 = i4 + 1;
                                try {
                                    byteBuffer.put(i4, (byte) ((codePoint >>> 18) | 240));
                                    i = i4 + 2;
                                    try {
                                        byteBuffer.put(i2, (byte) (((codePoint >>> 12) & 63) | 128));
                                        i4 += 3;
                                        byteBuffer.put(i, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(i4, (byte) ((codePoint & 63) | 128));
                                        i3 = i7;
                                    } catch (IndexOutOfBoundsException unused3) {
                                    }
                                } catch (IndexOutOfBoundsException unused4) {
                                    i = i2;
                                }
                            } else {
                                i3 = i7;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                            i2 = i4;
                        }
                        i = i2;
                        i3 = i7;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i3) + " at index " + (byteBuffer.position() + Math.max(i3, (i - byteBuffer.position()) + 1)));
                    }
                    throw new UnpairedSurrogateException(i3, length);
                }
                i3++;
                i4++;
            }
            Java8Compatibility.position(byteBuffer, i4);
        }
    }

    static final class SafeProcessor extends Processor {
        SafeProcessor() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
        
            if (r8[r9] > (-65)) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x007f, code lost:
        
            if (r8[r9] > (-65)) goto L53;
         */
        @Override // androidx.health.platform.client.proto.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
            byte b2;
            int i4;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b3 = (byte) i;
                if (b3 < -32) {
                    if (b3 >= -62) {
                        i4 = i2 + 1;
                    }
                    return -1;
                }
                if (b3 < -16) {
                    byte b4 = (byte) (~(i >> 8));
                    if (b4 == 0) {
                        int i5 = i2 + 1;
                        byte b5 = bArr[i2];
                        if (i5 >= i3) {
                            return Utf8.incompleteStateFor(b3, b5);
                        }
                        i2 = i5;
                        b4 = b5;
                    }
                    if (b4 <= -65 && ((b3 != -32 || b4 >= -96) && (b3 != -19 || b4 < -96))) {
                        i4 = i2 + 1;
                    }
                    return -1;
                }
                byte b6 = (byte) (~(i >> 8));
                if (b6 == 0) {
                    int i6 = i2 + 1;
                    b6 = bArr[i2];
                    if (i6 >= i3) {
                        return Utf8.incompleteStateFor(b3, b6);
                    }
                    i2 = i6;
                    b2 = 0;
                } else {
                    b2 = (byte) (i >> 16);
                }
                if (b2 == 0) {
                    int i7 = i2 + 1;
                    byte b7 = bArr[i2];
                    if (i7 >= i3) {
                        return Utf8.incompleteStateFor(b3, b6, b7);
                    }
                    i2 = i7;
                    b2 = b7;
                }
                if (b6 <= -65 && (((b3 << Ascii.FS) + (b6 + 112)) >> 30) == 0 && b2 <= -65) {
                    i4 = i2 + 1;
                }
                return -1;
                i2 = i4;
            }
            return partialIsValidUtf8(bArr, i2, i3);
        }

        @Override // androidx.health.platform.client.proto.Utf8.Processor
        int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
        }

        @Override // androidx.health.platform.client.proto.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = bArr[i];
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                i++;
                DecodeUtil.handleOneByte(b2, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b3 = bArr[i];
                if (DecodeUtil.isOneByte(b3)) {
                    DecodeUtil.handleOneByte(b3, cArr, i5);
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte b4 = bArr[i];
                        if (!DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        i++;
                        DecodeUtil.handleOneByte(b4, cArr, i5);
                        i5++;
                    }
                } else if (DecodeUtil.isTwoBytes(b3)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    DecodeUtil.handleTwoBytes(b3, bArr[i6], cArr, i5);
                    i5++;
                } else if (DecodeUtil.isThreeBytes(b3)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    DecodeUtil.handleThreeBytes(b3, bArr[i6], bArr[i + 2], cArr, i5);
                    i5++;
                    i += 3;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    DecodeUtil.handleFourBytes(b3, bArr[i6], bArr[i + 2], bArr[i + 3], cArr, i5);
                    i5 += 2;
                    i += 4;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // androidx.health.platform.client.proto.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i, i2);
        }

        @Override // androidx.health.platform.client.proto.Utf8.Processor
        int encodeUtf8(String str, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char cCharAt;
            int length = str.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (cCharAt = str.charAt(i7)) < 128) {
                bArr[i5] = (byte) cCharAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char cCharAt2 = str.charAt(i7);
                if (cCharAt2 >= 128 || i8 >= i6) {
                    if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                        bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                        i3 = i8 + 2;
                        bArr[i8 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i8 > i6 - 3) {
                            if (i8 <= i6 - 4) {
                                int i9 = i7 + 1;
                                if (i9 != str.length()) {
                                    char cCharAt3 = str.charAt(i9);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                        bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        bArr[i8 + 3] = (byte) ((codePoint & 63) | 128);
                                        i8 += 4;
                                        i7 = i9;
                                    } else {
                                        i7 = i9;
                                    }
                                }
                                throw new UnpairedSurrogateException(i7 - 1, length);
                            }
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
                                throw new UnpairedSurrogateException(i7, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i8);
                        }
                        bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                        bArr[i8 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i3 = i8 + 3;
                        bArr[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    }
                    i8 = i3;
                } else {
                    bArr[i8] = (byte) cCharAt2;
                    i8++;
                }
                i7++;
            }
            return i8;
        }

        @Override // androidx.health.platform.client.proto.Utf8.Processor
        void encodeUtf8Direct(String str, ByteBuffer byteBuffer) {
            encodeUtf8Default(str, byteBuffer);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i, i2);
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i3 >= i2) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            i += 2;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b2 >= -16) {
                        if (i3 >= i2 - 2) {
                            return Utf8.incompleteStateFor(bArr, i3, i2);
                        }
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && (((b2 << Ascii.FS) + (b3 + 112)) >> 30) == 0 && bArr[i + 2] <= -65) {
                            i3 = i + 4;
                            if (bArr[i + 3] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return Utf8.incompleteStateFor(bArr, i3, i2);
                    }
                    byte b4 = bArr[i3];
                    if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                        i3 = i + 3;
                        if (bArr[i + 2] > -65) {
                        }
                    }
                    return -1;
                }
                i = i3;
            }
            return 0;
        }
    }

    static final class UnsafeProcessor extends Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
        
            if (androidx.health.platform.client.proto.UnsafeUtil.getByte(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
        
            if (androidx.health.platform.client.proto.UnsafeUtil.getByte(r12, r0) > (-65)) goto L59;
         */
        @Override // androidx.health.platform.client.proto.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
            byte b2;
            long j;
            if ((i2 | i3 | (bArr.length - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long j2 = i2;
            long j3 = i3;
            if (i != 0) {
                if (j2 >= j3) {
                    return i;
                }
                byte b3 = (byte) i;
                if (b3 >= -32) {
                    if (b3 < -16) {
                        byte b4 = (byte) (~(i >> 8));
                        if (b4 == 0) {
                            long j4 = j2 + 1;
                            b4 = UnsafeUtil.getByte(bArr, j2);
                            if (j4 >= j3) {
                                return Utf8.incompleteStateFor(b3, b4);
                            }
                            j2 = j4;
                        }
                        if (b4 <= -65 && ((b3 != -32 || b4 >= -96) && (b3 != -19 || b4 < -96))) {
                            j = 1 + j2;
                        }
                        return -1;
                    }
                    byte b5 = (byte) (~(i >> 8));
                    if (b5 == 0) {
                        long j5 = j2 + 1;
                        b5 = UnsafeUtil.getByte(bArr, j2);
                        if (j5 >= j3) {
                            return Utf8.incompleteStateFor(b3, b5);
                        }
                        b2 = 0;
                        j2 = j5;
                    } else {
                        b2 = (byte) (i >> 16);
                    }
                    if (b2 == 0) {
                        long j6 = j2 + 1;
                        b2 = UnsafeUtil.getByte(bArr, j2);
                        if (j6 >= j3) {
                            return Utf8.incompleteStateFor(b3, b5, b2);
                        }
                        j2 = j6;
                    }
                    if (b5 <= -65 && (((b3 << Ascii.FS) + (b5 + 112)) >> 30) == 0 && b2 <= -65) {
                        j = 1 + j2;
                    }
                    return -1;
                    j2 = j;
                } else {
                    if (b3 < -62 || UnsafeUtil.getByte(bArr, j2) > -65) {
                        return -1;
                    }
                    j2++;
                }
            }
            return partialIsValidUtf8(bArr, j2, (int) (j3 - j2));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (androidx.health.platform.client.proto.UnsafeUtil.getByte(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (androidx.health.platform.client.proto.UnsafeUtil.getByte(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (androidx.health.platform.client.proto.UnsafeUtil.getByte(r0) > (-65)) goto L57;
         */
        @Override // androidx.health.platform.client.proto.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3) {
            byte b2;
            long j;
            if ((i2 | i3 | (byteBuffer.limit() - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + ((long) i2);
            long j2 = ((long) (i3 - i2)) + jAddressOffset;
            if (i != 0) {
                if (jAddressOffset >= j2) {
                    return i;
                }
                byte b3 = (byte) i;
                if (b3 < -32) {
                    if (b3 >= -62) {
                        j = 1 + jAddressOffset;
                    }
                    return -1;
                }
                if (b3 < -16) {
                    byte b4 = (byte) (~(i >> 8));
                    if (b4 == 0) {
                        long j3 = jAddressOffset + 1;
                        b4 = UnsafeUtil.getByte(jAddressOffset);
                        if (j3 >= j2) {
                            return Utf8.incompleteStateFor(b3, b4);
                        }
                        jAddressOffset = j3;
                    }
                    if (b4 <= -65 && ((b3 != -32 || b4 >= -96) && (b3 != -19 || b4 < -96))) {
                        j = 1 + jAddressOffset;
                    }
                    return -1;
                }
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    long j4 = jAddressOffset + 1;
                    b5 = UnsafeUtil.getByte(jAddressOffset);
                    if (j4 >= j2) {
                        return Utf8.incompleteStateFor(b3, b5);
                    }
                    b2 = 0;
                    jAddressOffset = j4;
                } else {
                    b2 = (byte) (i >> 16);
                }
                if (b2 == 0) {
                    long j5 = jAddressOffset + 1;
                    b2 = UnsafeUtil.getByte(jAddressOffset);
                    if (j5 >= j2) {
                        return Utf8.incompleteStateFor(b3, b5, b2);
                    }
                    jAddressOffset = j5;
                }
                if (b5 <= -65 && (((b3 << Ascii.FS) + (b5 + 112)) >> 30) == 0 && b2 <= -65) {
                    j = 1 + jAddressOffset;
                }
                return -1;
                jAddressOffset = j;
            }
            return partialIsValidUtf8(jAddressOffset, (int) (j2 - jAddressOffset));
        }

        @Override // androidx.health.platform.client.proto.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            String str = new String(bArr, i, i2, Internal.UTF_8);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(Internal.UTF_8), Arrays.copyOfRange(bArr, i, i2 + i))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // androidx.health.platform.client.proto.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + ((long) i);
            long j = ((long) i2) + jAddressOffset;
            char[] cArr = new char[i2];
            int i3 = 0;
            while (jAddressOffset < j) {
                byte b2 = UnsafeUtil.getByte(jAddressOffset);
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                jAddressOffset++;
                DecodeUtil.handleOneByte(b2, cArr, i3);
                i3++;
            }
            int i4 = i3;
            while (jAddressOffset < j) {
                long j2 = jAddressOffset + 1;
                byte b3 = UnsafeUtil.getByte(jAddressOffset);
                if (DecodeUtil.isOneByte(b3)) {
                    DecodeUtil.handleOneByte(b3, cArr, i4);
                    i4++;
                    jAddressOffset = j2;
                    while (jAddressOffset < j) {
                        byte b4 = UnsafeUtil.getByte(jAddressOffset);
                        if (!DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        jAddressOffset++;
                        DecodeUtil.handleOneByte(b4, cArr, i4);
                        i4++;
                    }
                } else if (DecodeUtil.isTwoBytes(b3)) {
                    if (j2 >= j) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    DecodeUtil.handleTwoBytes(b3, UnsafeUtil.getByte(j2), cArr, i4);
                    i4++;
                } else if (DecodeUtil.isThreeBytes(b3)) {
                    if (j2 >= j - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    DecodeUtil.handleThreeBytes(b3, UnsafeUtil.getByte(j2), UnsafeUtil.getByte(jAddressOffset + 2), cArr, i4);
                    i4++;
                    jAddressOffset = 3 + jAddressOffset;
                } else {
                    if (j2 >= j - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    DecodeUtil.handleFourBytes(b3, UnsafeUtil.getByte(j2), UnsafeUtil.getByte(2 + jAddressOffset), UnsafeUtil.getByte(jAddressOffset + 3), cArr, i4);
                    i4 += 2;
                    jAddressOffset += 4;
                }
            }
            return new String(cArr, 0, i4);
        }

        @Override // androidx.health.platform.client.proto.Utf8.Processor
        int encodeUtf8(String str, byte[] bArr, int i, int i2) {
            long j;
            String str2;
            String str3;
            int i3;
            char cCharAt;
            long j2 = i;
            long j3 = ((long) i2) + j2;
            int length = str.length();
            String str4 = " at index ";
            String str5 = "Failed writing ";
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (cCharAt = str.charAt(i4)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j2, (byte) cCharAt);
                i4++;
                j2++;
            }
            if (i4 == length) {
                return (int) j2;
            }
            while (i4 < length) {
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 < 128 && j2 < j3) {
                    UnsafeUtil.putByte(bArr, j2, (byte) cCharAt2);
                    j2 += j;
                    str2 = str4;
                    str3 = str5;
                } else if (cCharAt2 < 2048 && j2 <= j3 - 2) {
                    UnsafeUtil.putByte(bArr, j2, (byte) ((cCharAt2 >>> 6) | 960));
                    UnsafeUtil.putByte(bArr, j2 + j, (byte) ((cCharAt2 & '?') | 128));
                    str2 = str4;
                    str3 = str5;
                    j2 = 2 + j2;
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j2 > j3 - 3) {
                        str2 = str4;
                        str3 = str5;
                        if (j2 <= j3 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char cCharAt3 = str.charAt(i5);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    UnsafeUtil.putByte(bArr, j2, (byte) ((codePoint >>> 18) | 240));
                                    UnsafeUtil.putByte(bArr, j2 + j, (byte) (((codePoint >>> 12) & 63) | 128));
                                    UnsafeUtil.putByte(bArr, j2 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    UnsafeUtil.putByte(bArr, j2 + 3, (byte) ((codePoint & 63) | 128));
                                    j2 = 4 + j2;
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new UnpairedSurrogateException(i4 - 1, length);
                        }
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                            throw new UnpairedSurrogateException(i4, length);
                        }
                        throw new ArrayIndexOutOfBoundsException(str3 + cCharAt2 + str2 + j2);
                    }
                    UnsafeUtil.putByte(bArr, j2, (byte) ((cCharAt2 >>> '\f') | 480));
                    str2 = str4;
                    str3 = str5;
                    UnsafeUtil.putByte(bArr, j2 + j, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    UnsafeUtil.putByte(bArr, j2 + 2, (byte) ((cCharAt2 & '?') | 128));
                    j2 += 3;
                }
                i4++;
                str4 = str2;
                str5 = str3;
                j = 1;
            }
            return (int) j2;
        }

        @Override // androidx.health.platform.client.proto.Utf8.Processor
        void encodeUtf8Direct(String str, ByteBuffer byteBuffer) {
            long j;
            char c2;
            long j2;
            int i;
            char c3;
            char cCharAt;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            long jLimit = ((long) byteBuffer.limit()) + jAddressOffset;
            int length = str.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i2 = 0;
            while (true) {
                j = 1;
                c2 = 128;
                if (i2 >= length || (cCharAt = str.charAt(i2)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i2++;
                jPosition++;
            }
            if (i2 == length) {
                Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
                return;
            }
            while (i2 < length) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 >= c2 || jPosition >= jLimit) {
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        j2 = jPosition + 2;
                        UnsafeUtil.putByte(jPosition + 1, (byte) ((cCharAt2 & '?') | c2));
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            if (jPosition <= jLimit - 4) {
                                int i3 = i2 + 1;
                                if (i3 != length) {
                                    char cCharAt3 = str.charAt(i3);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | 240));
                                        UnsafeUtil.putByte(jPosition + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                        UnsafeUtil.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                        c3 = 128;
                                        UnsafeUtil.putByte(jPosition + 3, (byte) ((codePoint & 63) | 128));
                                        i2 = i3;
                                        jPosition += 4;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                throw new UnpairedSurrogateException(i2 - 1, length);
                            }
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i = i2 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i)))) {
                                throw new UnpairedSurrogateException(i2, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                        }
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        UnsafeUtil.putByte(jPosition + 1, (byte) (((cCharAt2 >>> 6) & 63) | c2));
                        UnsafeUtil.putByte(jPosition + 2, (byte) ((cCharAt2 & '?') | 128));
                        j2 = jPosition + 3;
                    }
                    jPosition = j2;
                    c3 = 128;
                } else {
                    UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
                    jPosition += j;
                    c3 = c2;
                }
                i2++;
                c2 = c3;
                jLimit = jLimit;
                j = 1;
            }
            Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            int i3 = (int) j;
            while (i2 < 8 - (i3 & 7)) {
                if (UnsafeUtil.getByte(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j++;
            }
            while (true) {
                int i4 = i2 + 8;
                if (i4 > i || (UnsafeUtil.getLong((Object) bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j) & Utf8.ASCII_MASK_LONG) != 0) {
                    break;
                }
                j += 8;
                i2 = i4;
            }
            while (i2 < i) {
                if (UnsafeUtil.getByte(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j++;
            }
            return i;
        }

        private static int unsafeEstimateConsecutiveAscii(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = (int) ((-j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                if (UnsafeUtil.getByte(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j++;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (UnsafeUtil.getLong(j) & Utf8.ASCII_MASK_LONG) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        private static int partialIsValidUtf8(byte[] bArr, long j, int i) {
            long j2;
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bArr, j, i);
            int i2 = i - iUnsafeEstimateConsecutiveAscii;
            long j3 = j + ((long) iUnsafeEstimateConsecutiveAscii);
            while (true) {
                byte b2 = 0;
                while (i2 > 0) {
                    long j4 = j3 + 1;
                    b2 = UnsafeUtil.getByte(bArr, j3);
                    if (b2 < 0) {
                        j3 = j4;
                        break;
                    }
                    i2--;
                    j3 = j4;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (b2 >= -32) {
                    if (b2 >= -16) {
                        if (i3 < 3) {
                            return unsafeIncompleteStateFor(bArr, b2, j3, i3);
                        }
                        i2 -= 4;
                        byte b3 = UnsafeUtil.getByte(bArr, j3);
                        if (b3 <= -65 && (((b2 << Ascii.FS) + (b3 + 112)) >> 30) == 0 && UnsafeUtil.getByte(bArr, 1 + j3) <= -65) {
                            j2 = 3 + j3;
                            if (UnsafeUtil.getByte(bArr, j3 + 2) > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i3 < 2) {
                        return unsafeIncompleteStateFor(bArr, b2, j3, i3);
                    }
                    i2 -= 3;
                    byte b4 = UnsafeUtil.getByte(bArr, j3);
                    if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                        j2 = j3 + 2;
                        if (UnsafeUtil.getByte(bArr, j3 + 1) > -65) {
                        }
                    }
                    return -1;
                    j3 = j2;
                } else {
                    if (i3 == 0) {
                        return b2;
                    }
                    i2 -= 2;
                    if (b2 < -62 || UnsafeUtil.getByte(bArr, j3) > -65) {
                        return -1;
                    }
                    j3++;
                }
            }
        }

        private static int partialIsValidUtf8(long j, int i) {
            long j2;
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(j, i);
            long j3 = j + ((long) iUnsafeEstimateConsecutiveAscii);
            int i2 = i - iUnsafeEstimateConsecutiveAscii;
            while (true) {
                byte b2 = 0;
                while (i2 > 0) {
                    long j4 = j3 + 1;
                    b2 = UnsafeUtil.getByte(j3);
                    if (b2 < 0) {
                        j3 = j4;
                        break;
                    }
                    i2--;
                    j3 = j4;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (b2 >= -32) {
                    if (b2 >= -16) {
                        if (i3 < 3) {
                            return unsafeIncompleteStateFor(j3, b2, i3);
                        }
                        i2 -= 4;
                        byte b3 = UnsafeUtil.getByte(j3);
                        if (b3 <= -65 && (((b2 << Ascii.FS) + (b3 + 112)) >> 30) == 0 && UnsafeUtil.getByte(1 + j3) <= -65) {
                            j2 = 3 + j3;
                            if (UnsafeUtil.getByte(j3 + 2) > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i3 < 2) {
                        return unsafeIncompleteStateFor(j3, b2, i3);
                    }
                    i2 -= 3;
                    byte b4 = UnsafeUtil.getByte(j3);
                    if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                        j2 = j3 + 2;
                        if (UnsafeUtil.getByte(j3 + 1) > -65) {
                        }
                    }
                    return -1;
                    j3 = j2;
                } else {
                    if (i3 == 0) {
                        return b2;
                    }
                    i2 -= 2;
                    if (b2 < -62 || UnsafeUtil.getByte(j3) > -65) {
                        return -1;
                    }
                    j3++;
                }
            }
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return Utf8.incompleteStateFor(i);
            }
            if (i2 == 1) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(bArr, j));
            }
            if (i2 == 2) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(bArr, j), UnsafeUtil.getByte(bArr, j + 1));
            }
            throw new AssertionError();
        }

        private static int unsafeIncompleteStateFor(long j, int i, int i2) {
            if (i2 == 0) {
                return Utf8.incompleteStateFor(i);
            }
            if (i2 == 1) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(j));
            }
            if (i2 == 2) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(j), UnsafeUtil.getByte(j + 1));
            }
            throw new AssertionError();
        }
    }

    static class DecodeUtil {
        private static char highSurrogate(int i) {
            return (char) ((i >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean isNotTrailingByte(byte b2) {
            return b2 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b2) {
            return b2 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b2) {
            return b2 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b2) {
            return b2 < -32;
        }

        private static char lowSurrogate(int i) {
            return (char) ((i & 1023) + 56320);
        }

        private static int trailingByteValue(byte b2) {
            return b2 & okio.Utf8.REPLACEMENT_BYTE;
        }

        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b2, char[] cArr, int i) {
            cArr[i] = (char) b2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b2 < -62 || isNotTrailingByte(b3)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b2 & Ascii.US) << 6) | trailingByteValue(b3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || isNotTrailingByte(b4)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b2 & 15) << 12) | (trailingByteValue(b3) << 6) | trailingByteValue(b4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b3) || (((b2 << Ascii.FS) + (b3 + 112)) >> 30) != 0 || isNotTrailingByte(b4) || isNotTrailingByte(b5)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int iTrailingByteValue = ((b2 & 7) << 18) | (trailingByteValue(b3) << 12) | (trailingByteValue(b4) << 6) | trailingByteValue(b5);
            cArr[i] = highSurrogate(iTrailingByteValue);
            cArr[i + 1] = lowSurrogate(iTrailingByteValue);
        }
    }

    private Utf8() {
    }
}
