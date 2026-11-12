package com.google.protobuf;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import tn.k;
import v.e0;

/* JADX INFO: loaded from: classes2.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    public static class DecodeUtil {
        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b14, byte b15, byte b16, byte b17, char[] cArr, int i14) throws InvalidProtocolBufferException {
            if (!isNotTrailingByte(b15)) {
                if ((((b15 + 112) + (b14 << Ascii.FS)) >> 30) == 0 && !isNotTrailingByte(b16) && !isNotTrailingByte(b17)) {
                    int iTrailingByteValue = ((b14 & 7) << 18) | (trailingByteValue(b15) << 12) | (trailingByteValue(b16) << 6) | trailingByteValue(b17);
                    cArr[i14] = highSurrogate(iTrailingByteValue);
                    cArr[i14 + 1] = lowSurrogate(iTrailingByteValue);
                    return;
                }
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b14, char[] cArr, int i14) {
            cArr[i14] = (char) b14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b14, byte b15, byte b16, char[] cArr, int i14) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b15) || ((b14 == -32 && b15 < -96) || ((b14 == -19 && b15 >= -96) || isNotTrailingByte(b16)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i14] = (char) (((b14 & Ascii.SI) << 12) | (trailingByteValue(b15) << 6) | trailingByteValue(b16));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b14, byte b15, char[] cArr, int i14) throws InvalidProtocolBufferException {
            if (b14 < -62 || isNotTrailingByte(b15)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i14] = (char) (((b14 & Ascii.US) << 6) | trailingByteValue(b15));
        }

        private static char highSurrogate(int i14) {
            return (char) ((i14 >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b14) {
            return b14 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b14) {
            return b14 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b14) {
            return b14 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b14) {
            return b14 < -32;
        }

        private static char lowSurrogate(int i14) {
            return (char) ((i14 & 1023) + 56320);
        }

        private static int trailingByteValue(byte b14) {
            return b14 & 63;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i14, int i15) {
            super(k.e(i14, i15, "Unpaired surrogate at index ", " of "));
        }
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    public static String decodeUtf8(ByteBuffer byteBuffer, int i14, int i15) {
        return processor.decodeUtf8(byteBuffer, i14, i15);
    }

    public static int encode(CharSequence charSequence, byte[] bArr, int i14, int i15) {
        return processor.encodeUtf8(charSequence, bArr, i14, i15);
    }

    public static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i14 = 0;
        while (i14 < length && charSequence.charAt(i14) < 128) {
            i14++;
        }
        int iEncodedLengthGeneral = length;
        while (i14 < length) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt >= 2048) {
                iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i14);
                break;
            }
            iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
            i14++;
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        a.g(((long) iEncodedLengthGeneral) + 4294967296L);
        return 0;
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i14) {
        int length = charSequence.length();
        int i15 = 0;
        while (i14 < length) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt < 2048) {
                i15 += (127 - cCharAt) >>> 31;
            } else {
                i15 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i14) < 65536) {
                        throw new UnpairedSurrogateException(i14, length);
                    }
                    i14++;
                }
            }
            i14++;
        }
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i14, int i15) {
        int i16 = i15 - 7;
        int i17 = i14;
        while (i17 < i16 && (byteBuffer.getLong(i17) & ASCII_MASK_LONG) == 0) {
            i17 += 8;
        }
        return i17 - i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i14, int i15, int i16) {
        if (i16 == 0) {
            return incompleteStateFor(i14);
        }
        if (i16 == 1) {
            return incompleteStateFor(i14, byteBuffer.get(i15));
        }
        if (i16 == 2) {
            return incompleteStateFor(i14, byteBuffer.get(i15), byteBuffer.get(i15 + 1));
        }
        e0.l();
        return 0;
    }

    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static int partialIsValidUtf8(int i14, byte[] bArr, int i15, int i16) {
        return processor.partialIsValidUtf8(i14, bArr, i15, i16);
    }

    public static String decodeUtf8(byte[] bArr, int i14, int i15) {
        return processor.decodeUtf8(bArr, i14, i15);
    }

    public static int partialIsValidUtf8(int i14, ByteBuffer byteBuffer, int i15, int i16) {
        return processor.partialIsValidUtf8(i14, byteBuffer, i15, i16);
    }

    public static abstract class Processor {
        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i14, int i15) {
            int iEstimateConsecutiveAscii = i14 + Utf8.estimateConsecutiveAscii(byteBuffer, i14, i15);
            while (iEstimateConsecutiveAscii < i15) {
                int i16 = iEstimateConsecutiveAscii + 1;
                byte b14 = byteBuffer.get(iEstimateConsecutiveAscii);
                if (b14 >= 0) {
                    iEstimateConsecutiveAscii = i16;
                } else if (b14 < -32) {
                    if (i16 >= i15) {
                        return b14;
                    }
                    if (b14 < -62 || byteBuffer.get(i16) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b14 >= -16) {
                        if (i16 >= i15 - 2) {
                            return Utf8.incompleteStateFor(byteBuffer, b14, i16, i15 - i16);
                        }
                        int i17 = iEstimateConsecutiveAscii + 2;
                        byte b15 = byteBuffer.get(i16);
                        if (b15 <= -65) {
                            if ((((b15 + 112) + (b14 << Ascii.FS)) >> 30) == 0) {
                                int i18 = iEstimateConsecutiveAscii + 3;
                                if (byteBuffer.get(i17) <= -65) {
                                    iEstimateConsecutiveAscii += 4;
                                    if (byteBuffer.get(i18) > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    if (i16 >= i15 - 1) {
                        return Utf8.incompleteStateFor(byteBuffer, b14, i16, i15 - i16);
                    }
                    int i19 = iEstimateConsecutiveAscii + 2;
                    byte b16 = byteBuffer.get(i16);
                    if (b16 > -65 || ((b14 == -32 && b16 < -96) || ((b14 == -19 && b16 >= -96) || byteBuffer.get(i19) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }

        public final String decodeUtf8(ByteBuffer byteBuffer, int i14, int i15) {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i14, i15);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i14, i15) : decodeUtf8Default(byteBuffer, i14, i15);
        }

        public abstract String decodeUtf8(byte[] bArr, int i14, int i15);

        public final String decodeUtf8Default(ByteBuffer byteBuffer, int i14, int i15) throws InvalidProtocolBufferException {
            if ((i14 | i15 | ((byteBuffer.limit() - i14) - i15)) < 0) {
                a.l("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i14), Integer.valueOf(i15)});
                return null;
            }
            int i16 = i14 + i15;
            char[] cArr = new char[i15];
            int i17 = 0;
            while (i14 < i16) {
                byte b14 = byteBuffer.get(i14);
                if (!DecodeUtil.isOneByte(b14)) {
                    break;
                }
                i14++;
                DecodeUtil.handleOneByte(b14, cArr, i17);
                i17++;
            }
            int i18 = i17;
            while (i14 < i16) {
                int i19 = i14 + 1;
                byte b15 = byteBuffer.get(i14);
                if (DecodeUtil.isOneByte(b15)) {
                    int i24 = i18 + 1;
                    DecodeUtil.handleOneByte(b15, cArr, i18);
                    int i25 = i19;
                    while (i25 < i16) {
                        byte b16 = byteBuffer.get(i25);
                        if (!DecodeUtil.isOneByte(b16)) {
                            break;
                        }
                        i25++;
                        DecodeUtil.handleOneByte(b16, cArr, i24);
                        i24++;
                    }
                    i18 = i24;
                    i14 = i25;
                } else if (DecodeUtil.isTwoBytes(b15)) {
                    if (i19 >= i16) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i14 += 2;
                    DecodeUtil.handleTwoBytes(b15, byteBuffer.get(i19), cArr, i18);
                    i18++;
                } else if (DecodeUtil.isThreeBytes(b15)) {
                    if (i19 >= i16 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i26 = i14 + 2;
                    i14 += 3;
                    DecodeUtil.handleThreeBytes(b15, byteBuffer.get(i19), byteBuffer.get(i26), cArr, i18);
                    i18++;
                } else {
                    if (i19 >= i16 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b17 = byteBuffer.get(i19);
                    int i27 = i14 + 3;
                    byte b18 = byteBuffer.get(i14 + 2);
                    i14 += 4;
                    DecodeUtil.handleFourBytes(b15, b17, b18, byteBuffer.get(i27), cArr, i18);
                    i18 += 2;
                }
            }
            return new String(cArr, 0, i18);
        }

        public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i14, int i15);

        public abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i14, int i15);

        public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                Java8Compatibility.position(byteBuffer, Utf8.encode(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        public final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
            int length = charSequence.length();
            int iPosition = byteBuffer.position();
            int i14 = 0;
            while (i14 < length) {
                try {
                    char cCharAt = charSequence.charAt(i14);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i14, (byte) cCharAt);
                    i14++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i14 == length) {
                Java8Compatibility.position(byteBuffer, iPosition + i14);
                return;
            }
            iPosition += i14;
            while (i14 < length) {
                char cCharAt2 = charSequence.charAt(i14);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i15 = iPosition + 1;
                    try {
                        byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        byteBuffer.put(i15, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i15;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i15;
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i16 = i14 + 1;
                        if (i16 != length) {
                            try {
                                char cCharAt3 = charSequence.charAt(i16);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i17 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        int i18 = iPosition + 2;
                                        try {
                                            byteBuffer.put(i17, (byte) (((codePoint >>> 12) & 63) | 128));
                                            iPosition += 3;
                                            byteBuffer.put(i18, (byte) (((codePoint >>> 6) & 63) | 128));
                                            byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                            i14 = i16;
                                        } catch (IndexOutOfBoundsException unused3) {
                                            i14 = i16;
                                            iPosition = i18;
                                        }
                                    } catch (IndexOutOfBoundsException unused4) {
                                        iPosition = i17;
                                        i14 = i16;
                                    }
                                } else {
                                    i14 = i16;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                            i14 = i16;
                            a.d(charSequence.charAt(i14), Math.max(i14, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position());
                            return;
                        }
                        throw new UnpairedSurrogateException(i14, length);
                    }
                    int i19 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    byteBuffer.put(i19, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i14++;
                iPosition++;
            }
            Java8Compatibility.position(byteBuffer, iPosition);
        }

        public abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        public final boolean isValidUtf8(byte[] bArr, int i14, int i15) {
            return partialIsValidUtf8(0, bArr, i14, i15) == 0;
        }

        public abstract int partialIsValidUtf8(int i14, byte[] bArr, int i15, int i16);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int partialIsValidUtf8Default(int i14, ByteBuffer byteBuffer, int i15, int i16) {
            byte b14;
            int i17;
            int i18;
            if (i14 != 0) {
                if (i15 >= i16) {
                    return i14;
                }
                byte b15 = (byte) i14;
                if (b15 < -32) {
                    if (b15 >= -62) {
                        i18 = i15 + 1;
                    }
                    return -1;
                }
                if (b15 < -16) {
                    byte b16 = (byte) (~(i14 >> 8));
                    if (b16 == 0) {
                        int i19 = i15 + 1;
                        byte b17 = byteBuffer.get(i15);
                        if (i19 >= i16) {
                            return Utf8.incompleteStateFor(b15, b17);
                        }
                        i15 = i19;
                        b16 = b17;
                    }
                    if (b16 <= -65 && ((b15 != -32 || b16 >= -96) && (b15 != -19 || b16 < -96))) {
                        i18 = i15 + 1;
                    }
                    return -1;
                }
                byte b18 = (byte) (~(i14 >> 8));
                if (b18 == 0) {
                    i17 = i15 + 1;
                    b18 = byteBuffer.get(i15);
                    if (i17 >= i16) {
                        return Utf8.incompleteStateFor(b15, b18);
                    }
                    b14 = 0;
                } else {
                    b14 = (byte) (i14 >> 16);
                    i17 = i15;
                }
                if (b14 == 0) {
                    int i24 = i17 + 1;
                    byte b19 = byteBuffer.get(i17);
                    if (i24 >= i16) {
                        return Utf8.incompleteStateFor(b15, b18, b19);
                    }
                    b14 = b19;
                    i17 = i24;
                }
                if (b18 <= -65) {
                    if ((((b18 + 112) + (b15 << Ascii.FS)) >> 30) == 0 && b14 <= -65) {
                        i15 = i17 + 1;
                    }
                }
                return -1;
                i15 = i18;
            }
            return partialIsValidUtf8(byteBuffer, i15, i16);
        }

        public abstract int partialIsValidUtf8Direct(int i14, ByteBuffer byteBuffer, int i15, int i16);

        public final boolean isValidUtf8(ByteBuffer byteBuffer, int i14, int i15) {
            return partialIsValidUtf8(0, byteBuffer, i14, i15) == 0;
        }

        public final int partialIsValidUtf8(int i14, ByteBuffer byteBuffer, int i15, int i16) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                return partialIsValidUtf8(i14, byteBuffer.array(), i15 + iArrayOffset, iArrayOffset + i16);
            }
            if (byteBuffer.isDirect()) {
                return partialIsValidUtf8Direct(i14, byteBuffer, i15, i16);
            }
            return partialIsValidUtf8Default(i14, byteBuffer, i15, i16);
        }
    }

    public static boolean isValidUtf8(byte[] bArr, int i14, int i15) {
        return processor.isValidUtf8(bArr, i14, i15);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i14, int i15) {
        if (i14 > -12 || i15 > -65) {
            return -1;
        }
        return i14 ^ (i15 << 8);
    }

    public static final class UnsafeProcessor extends Processor {
        public static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j8, int i14) {
            int i15 = 0;
            if (i14 < 16) {
                return 0;
            }
            int i16 = 8 - (((int) j8) & 7);
            while (i15 < i16) {
                long j14 = 1 + j8;
                if (UnsafeUtil.getByte(bArr, j8) < 0) {
                    return i15;
                }
                i15++;
                j8 = j14;
            }
            while (true) {
                int i17 = i15 + 8;
                if (i17 > i14 || (UnsafeUtil.getLong((Object) bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j8) & Utf8.ASCII_MASK_LONG) != 0) {
                    break;
                }
                j8 += 8;
                i15 = i17;
            }
            while (i15 < i14) {
                long j15 = j8 + 1;
                if (UnsafeUtil.getByte(bArr, j8) < 0) {
                    return i15;
                }
                i15++;
                j8 = j15;
            }
            return i14;
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i14, long j8, int i15) {
            if (i15 == 0) {
                return Utf8.incompleteStateFor(i14);
            }
            if (i15 == 1) {
                return Utf8.incompleteStateFor(i14, UnsafeUtil.getByte(bArr, j8));
            }
            if (i15 == 2) {
                return Utf8.incompleteStateFor(i14, UnsafeUtil.getByte(bArr, j8), UnsafeUtil.getByte(bArr, j8 + 1));
            }
            e0.l();
            return 0;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i14, int i15) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bArr, i14, i15, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i14, i15 + i14))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i14, int i15) throws InvalidProtocolBufferException {
            if ((i14 | i15 | ((byteBuffer.limit() - i14) - i15)) < 0) {
                a.l("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i14), Integer.valueOf(i15)});
                return null;
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + ((long) i14);
            long j8 = ((long) i15) + jAddressOffset;
            char[] cArr = new char[i15];
            int i16 = 0;
            while (jAddressOffset < j8) {
                byte b14 = UnsafeUtil.getByte(jAddressOffset);
                if (!DecodeUtil.isOneByte(b14)) {
                    break;
                }
                jAddressOffset++;
                DecodeUtil.handleOneByte(b14, cArr, i16);
                i16++;
            }
            int i17 = i16;
            while (jAddressOffset < j8) {
                long j14 = jAddressOffset + 1;
                byte b15 = UnsafeUtil.getByte(jAddressOffset);
                if (DecodeUtil.isOneByte(b15)) {
                    int i18 = i17 + 1;
                    DecodeUtil.handleOneByte(b15, cArr, i17);
                    long j15 = j14;
                    while (j15 < j8) {
                        byte b16 = UnsafeUtil.getByte(j15);
                        if (!DecodeUtil.isOneByte(b16)) {
                            break;
                        }
                        j15++;
                        DecodeUtil.handleOneByte(b16, cArr, i18);
                        i18++;
                    }
                    i17 = i18;
                    jAddressOffset = j15;
                } else if (DecodeUtil.isTwoBytes(b15)) {
                    if (j14 >= j8) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    DecodeUtil.handleTwoBytes(b15, UnsafeUtil.getByte(j14), cArr, i17);
                    i17++;
                } else if (DecodeUtil.isThreeBytes(b15)) {
                    if (j14 >= j8 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j16 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    DecodeUtil.handleThreeBytes(b15, UnsafeUtil.getByte(j14), UnsafeUtil.getByte(j16), cArr, i17);
                    i17++;
                } else {
                    if (j14 >= j8 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b17 = UnsafeUtil.getByte(j14);
                    long j17 = jAddressOffset + 3;
                    byte b18 = UnsafeUtil.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    DecodeUtil.handleFourBytes(b15, b17, b18, UnsafeUtil.getByte(j17), cArr, i17);
                    i17 += 2;
                }
            }
            return new String(cArr, 0, i17);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i14, int i15) {
            long j8;
            long j14;
            int i16;
            char cCharAt;
            long j15 = i14;
            long j16 = ((long) i15) + j15;
            int length = charSequence.length();
            if (length > i15 || bArr.length - i15 < i14) {
                a.d(charSequence.charAt(length - 1), i14 + i15);
                return 0;
            }
            int i17 = 0;
            while (true) {
                j8 = 1;
                if (i17 >= length || (cCharAt = charSequence.charAt(i17)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j15, (byte) cCharAt);
                i17++;
                j15 = 1 + j15;
            }
            if (i17 == length) {
                return (int) j15;
            }
            while (i17 < length) {
                char cCharAt2 = charSequence.charAt(i17);
                if (cCharAt2 < 128 && j15 < j16) {
                    UnsafeUtil.putByte(bArr, j15, (byte) cCharAt2);
                    j14 = j8;
                    j15 += j8;
                } else if (cCharAt2 >= 2048 || j15 > j16 - 2) {
                    j14 = j8;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j15 > j16 - 3) {
                        if (j15 > j16 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i16 = i17 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i16)))) {
                                throw new UnpairedSurrogateException(i17, length);
                            }
                            a.e(cCharAt2, j15);
                            return 0;
                        }
                        int i18 = i17 + 1;
                        if (i18 != length) {
                            char cCharAt3 = charSequence.charAt(i18);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                UnsafeUtil.putByte(bArr, j15, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                UnsafeUtil.putByte(bArr, j15 + j14, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j17 = j15 + 3;
                                UnsafeUtil.putByte(bArr, 2 + j15, (byte) (((codePoint >>> 6) & 63) | 128));
                                j15 += 4;
                                UnsafeUtil.putByte(bArr, j17, (byte) ((codePoint & 63) | 128));
                                i17 = i18;
                            } else {
                                i17 = i18;
                            }
                        }
                        throw new UnpairedSurrogateException(i17 - 1, length);
                    }
                    UnsafeUtil.putByte(bArr, j15, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j18 = 2 + j15;
                    UnsafeUtil.putByte(bArr, j15 + j14, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j15 += 3;
                    UnsafeUtil.putByte(bArr, j18, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j14 = j8;
                    long j19 = j15 + j14;
                    UnsafeUtil.putByte(bArr, j15, (byte) ((cCharAt2 >>> 6) | 960));
                    j15 += 2;
                    UnsafeUtil.putByte(bArr, j19, (byte) ((cCharAt2 & '?') | 128));
                }
                i17++;
                j8 = j14;
            }
            return (int) j15;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j8;
            long j14;
            int i14;
            char cCharAt;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            long jLimit = ((long) byteBuffer.limit()) + jAddressOffset;
            int length = charSequence.length();
            if (length > jLimit - jPosition) {
                a.d(charSequence.charAt(length - 1), byteBuffer.limit());
                return;
            }
            int i15 = 0;
            while (true) {
                j8 = 1;
                if (i15 >= length || (cCharAt = charSequence.charAt(i15)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i15++;
                jPosition = 1 + jPosition;
            }
            if (i15 == length) {
                Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
                return;
            }
            while (i15 < length) {
                char cCharAt2 = charSequence.charAt(i15);
                if (cCharAt2 < 128 && jPosition < jLimit) {
                    UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
                    j14 = j8;
                    jPosition += j8;
                } else if (cCharAt2 >= 2048 || jPosition > jLimit - 2) {
                    j14 = j8;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                        if (jPosition > jLimit - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i14 = i15 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i14)))) {
                                throw new UnpairedSurrogateException(i15, length);
                            }
                            a.e(cCharAt2, jPosition);
                            return;
                        }
                        int i16 = i15 + 1;
                        if (i16 != length) {
                            char cCharAt3 = charSequence.charAt(i16);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                UnsafeUtil.putByte(jPosition + j14, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j15 = jPosition + 3;
                                UnsafeUtil.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                jPosition += 4;
                                UnsafeUtil.putByte(j15, (byte) ((codePoint & 63) | 128));
                                i15 = i16;
                            } else {
                                i15 = i16;
                            }
                        }
                        throw new UnpairedSurrogateException(i15 - 1, length);
                    }
                    UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j16 = jPosition + 2;
                    UnsafeUtil.putByte(jPosition + j14, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    jPosition += 3;
                    UnsafeUtil.putByte(j16, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j14 = j8;
                    long j17 = jPosition + j14;
                    UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                    jPosition += 2;
                    UnsafeUtil.putByte(j17, (byte) ((cCharAt2 & '?') | 128));
                }
                i15++;
                j8 = j14;
                jAddressOffset = jAddressOffset;
            }
            Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int partialIsValidUtf8(int i14, byte[] bArr, int i15, int i16) {
            byte b14;
            long j8;
            if ((i15 | i16 | (bArr.length - i16)) < 0) {
                a.l("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i15), Integer.valueOf(i16)});
                return 0;
            }
            long j14 = i15;
            long j15 = i16;
            if (i14 != 0) {
                if (j14 >= j15) {
                    return i14;
                }
                byte b15 = (byte) i14;
                if (b15 < -32) {
                    if (b15 >= -62) {
                        long j16 = 1 + j14;
                        if (UnsafeUtil.getByte(bArr, j14) <= -65) {
                            j14 = j16;
                        }
                    }
                    return -1;
                }
                if (b15 < -16) {
                    byte b16 = (byte) (~(i14 >> 8));
                    if (b16 == 0) {
                        long j17 = j14 + 1;
                        b16 = UnsafeUtil.getByte(bArr, j14);
                        if (j17 >= j15) {
                            return Utf8.incompleteStateFor(b15, b16);
                        }
                        j14 = j17;
                    }
                    if (b16 <= -65 && ((b15 != -32 || b16 >= -96) && (b15 != -19 || b16 < -96))) {
                        j8 = j14 + 1;
                    }
                    return -1;
                }
                byte b17 = (byte) (~(i14 >> 8));
                if (b17 == 0) {
                    long j18 = j14 + 1;
                    b17 = UnsafeUtil.getByte(bArr, j14);
                    if (j18 >= j15) {
                        return Utf8.incompleteStateFor(b15, b17);
                    }
                    b14 = 0;
                    j14 = j18;
                } else {
                    b14 = (byte) (i14 >> 16);
                }
                if (b14 == 0) {
                    long j19 = j14 + 1;
                    b14 = UnsafeUtil.getByte(bArr, j14);
                    if (j19 >= j15) {
                        return Utf8.incompleteStateFor(b15, b17, b14);
                    }
                    j14 = j19;
                }
                if (b17 <= -65) {
                    if ((((b17 + 112) + (b15 << Ascii.FS)) >> 30) == 0 && b14 <= -65) {
                        j8 = j14 + 1;
                    }
                }
                return -1;
                j14 = j8;
            }
            return partialIsValidUtf8(bArr, j14, (int) (j15 - j14));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int partialIsValidUtf8Direct(int i14, ByteBuffer byteBuffer, int i15, int i16) {
            byte b14;
            long j8;
            if ((i15 | i16 | (byteBuffer.limit() - i16)) < 0) {
                a.l("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i15), Integer.valueOf(i16)});
                return 0;
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + ((long) i15);
            long j14 = ((long) (i16 - i15)) + jAddressOffset;
            if (i14 != 0) {
                if (jAddressOffset >= j14) {
                    return i14;
                }
                byte b15 = (byte) i14;
                if (b15 < -32) {
                    if (b15 >= -62) {
                        j8 = 1 + jAddressOffset;
                    }
                    return -1;
                }
                if (b15 < -16) {
                    byte b16 = (byte) (~(i14 >> 8));
                    if (b16 == 0) {
                        long j15 = jAddressOffset + 1;
                        b16 = UnsafeUtil.getByte(jAddressOffset);
                        if (j15 >= j14) {
                            return Utf8.incompleteStateFor(b15, b16);
                        }
                        jAddressOffset = j15;
                    }
                    if (b16 <= -65 && ((b15 != -32 || b16 >= -96) && (b15 != -19 || b16 < -96))) {
                        j8 = 1 + jAddressOffset;
                    }
                    return -1;
                }
                byte b17 = (byte) (~(i14 >> 8));
                if (b17 == 0) {
                    long j16 = jAddressOffset + 1;
                    b17 = UnsafeUtil.getByte(jAddressOffset);
                    if (j16 >= j14) {
                        return Utf8.incompleteStateFor(b15, b17);
                    }
                    b14 = 0;
                    jAddressOffset = j16;
                } else {
                    b14 = (byte) (i14 >> 16);
                }
                if (b14 == 0) {
                    long j17 = jAddressOffset + 1;
                    b14 = UnsafeUtil.getByte(jAddressOffset);
                    if (j17 >= j14) {
                        return Utf8.incompleteStateFor(b15, b17, b14);
                    }
                    jAddressOffset = j17;
                }
                if (b17 <= -65) {
                    if ((((b17 + 112) + (b15 << Ascii.FS)) >> 30) == 0 && b14 <= -65) {
                        j8 = 1 + jAddressOffset;
                    }
                }
                return -1;
                jAddressOffset = j8;
            }
            return partialIsValidUtf8(jAddressOffset, (int) (j14 - jAddressOffset));
        }

        private static int unsafeIncompleteStateFor(long j8, int i14, int i15) {
            if (i15 == 0) {
                return Utf8.incompleteStateFor(i14);
            }
            if (i15 == 1) {
                return Utf8.incompleteStateFor(i14, UnsafeUtil.getByte(j8));
            }
            if (i15 == 2) {
                return Utf8.incompleteStateFor(i14, UnsafeUtil.getByte(j8), UnsafeUtil.getByte(j8 + 1));
            }
            e0.l();
            return 0;
        }

        private static int unsafeEstimateConsecutiveAscii(long j8, int i14) {
            if (i14 < 16) {
                return 0;
            }
            int i15 = (int) ((-j8) & 7);
            int i16 = i15;
            while (i16 > 0) {
                long j14 = 1 + j8;
                if (UnsafeUtil.getByte(j8) < 0) {
                    return i15 - i16;
                }
                i16--;
                j8 = j14;
            }
            int i17 = i14 - i15;
            while (i17 >= 8 && (UnsafeUtil.getLong(j8) & Utf8.ASCII_MASK_LONG) == 0) {
                j8 += 8;
                i17 -= 8;
            }
            return i14 - i17;
        }

        private static int partialIsValidUtf8(byte[] bArr, long j8, int i14) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bArr, j8, i14);
            int i15 = i14 - iUnsafeEstimateConsecutiveAscii;
            long j14 = j8 + ((long) iUnsafeEstimateConsecutiveAscii);
            while (true) {
                byte b14 = 0;
                while (i15 > 0) {
                    long j15 = j14 + 1;
                    b14 = UnsafeUtil.getByte(bArr, j14);
                    if (b14 < 0) {
                        j14 = j15;
                        break;
                    }
                    i15--;
                    j14 = j15;
                }
                if (i15 == 0) {
                    return 0;
                }
                int i16 = i15 - 1;
                if (b14 < -32) {
                    if (i16 == 0) {
                        return b14;
                    }
                    i15 -= 2;
                    if (b14 >= -62) {
                        long j16 = 1 + j14;
                        if (UnsafeUtil.getByte(bArr, j14) <= -65) {
                            j14 = j16;
                        }
                    }
                    return -1;
                }
                if (b14 < -16) {
                    if (i16 < 2) {
                        return unsafeIncompleteStateFor(bArr, b14, j14, i16);
                    }
                    i15 -= 3;
                    long j17 = 1 + j14;
                    byte b15 = UnsafeUtil.getByte(bArr, j14);
                    if (b15 <= -65 && ((b14 != -32 || b15 >= -96) && (b14 != -19 || b15 < -96))) {
                        j14 += 2;
                        if (UnsafeUtil.getByte(bArr, j17) > -65) {
                        }
                    }
                    return -1;
                }
                if (i16 < 3) {
                    return unsafeIncompleteStateFor(bArr, b14, j14, i16);
                }
                i15 -= 4;
                long j18 = 1 + j14;
                byte b16 = UnsafeUtil.getByte(bArr, j14);
                if (b16 <= -65) {
                    if ((((b16 + 112) + (b14 << Ascii.FS)) >> 30) == 0) {
                        long j19 = 2 + j14;
                        if (UnsafeUtil.getByte(bArr, j18) <= -65) {
                            j14 += 3;
                            if (UnsafeUtil.getByte(bArr, j19) > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
        }

        private static int partialIsValidUtf8(long j8, int i14) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(j8, i14);
            long j14 = j8 + ((long) iUnsafeEstimateConsecutiveAscii);
            int i15 = i14 - iUnsafeEstimateConsecutiveAscii;
            while (true) {
                byte b14 = 0;
                while (i15 > 0) {
                    long j15 = j14 + 1;
                    b14 = UnsafeUtil.getByte(j14);
                    if (b14 < 0) {
                        j14 = j15;
                        break;
                    }
                    i15--;
                    j14 = j15;
                }
                if (i15 == 0) {
                    return 0;
                }
                int i16 = i15 - 1;
                if (b14 < -32) {
                    if (i16 == 0) {
                        return b14;
                    }
                    i15 -= 2;
                    if (b14 >= -62) {
                        long j16 = 1 + j14;
                        if (UnsafeUtil.getByte(j14) <= -65) {
                            j14 = j16;
                        }
                    }
                    return -1;
                }
                if (b14 < -16) {
                    if (i16 < 2) {
                        return unsafeIncompleteStateFor(j14, b14, i16);
                    }
                    i15 -= 3;
                    long j17 = 1 + j14;
                    byte b15 = UnsafeUtil.getByte(j14);
                    if (b15 <= -65 && ((b14 != -32 || b15 >= -96) && (b14 != -19 || b15 < -96))) {
                        j14 += 2;
                        if (UnsafeUtil.getByte(j17) > -65) {
                        }
                    }
                    return -1;
                }
                if (i16 < 3) {
                    return unsafeIncompleteStateFor(j14, b14, i16);
                }
                i15 -= 4;
                long j18 = 1 + j14;
                byte b16 = UnsafeUtil.getByte(j14);
                if (b16 <= -65) {
                    if ((((b16 + 112) + (b14 << Ascii.FS)) >> 30) == 0) {
                        long j19 = 2 + j14;
                        if (UnsafeUtil.getByte(j18) <= -65) {
                            j14 += 3;
                            if (UnsafeUtil.getByte(j19) > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i14, int i15, int i16) {
        if (i14 > -12 || i15 > -65 || i16 > -65) {
            return -1;
        }
        return (i14 ^ (i15 << 8)) ^ (i16 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i14, int i15) {
        byte b14 = bArr[i14 - 1];
        int i16 = i15 - i14;
        if (i16 == 0) {
            return incompleteStateFor(b14);
        }
        if (i16 == 1) {
            return incompleteStateFor(b14, bArr[i14]);
        }
        if (i16 == 2) {
            return incompleteStateFor(b14, bArr[i14], bArr[i14 + 1]);
        }
        e0.l();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i14) {
        if (i14 > -12) {
            return -1;
        }
        return i14;
    }

    public static final class SafeProcessor extends Processor {
        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i14, int i15) {
            while (i14 < i15) {
                int i16 = i14 + 1;
                byte b14 = bArr[i14];
                if (b14 < 0) {
                    if (b14 < -32) {
                        if (i16 >= i15) {
                            return b14;
                        }
                        if (b14 >= -62) {
                            i14 += 2;
                            if (bArr[i16] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b14 < -16) {
                        if (i16 >= i15 - 1) {
                            return Utf8.incompleteStateFor(bArr, i16, i15);
                        }
                        int i17 = i14 + 2;
                        byte b15 = bArr[i16];
                        if (b15 <= -65 && ((b14 != -32 || b15 >= -96) && (b14 != -19 || b15 < -96))) {
                            i14 += 3;
                            if (bArr[i17] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i16 >= i15 - 2) {
                        return Utf8.incompleteStateFor(bArr, i16, i15);
                    }
                    int i18 = i14 + 2;
                    byte b16 = bArr[i16];
                    if (b16 <= -65) {
                        if ((((b16 + 112) + (b14 << Ascii.FS)) >> 30) == 0) {
                            int i19 = i14 + 3;
                            if (bArr[i18] <= -65) {
                                i14 += 4;
                                if (bArr[i19] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i14 = i16;
            }
            return 0;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i14, int i15) throws InvalidProtocolBufferException {
            if ((i14 | i15 | ((bArr.length - i14) - i15)) < 0) {
                a.l("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i14), Integer.valueOf(i15)});
                return null;
            }
            int i16 = i14 + i15;
            char[] cArr = new char[i15];
            int i17 = 0;
            while (i14 < i16) {
                byte b14 = bArr[i14];
                if (!DecodeUtil.isOneByte(b14)) {
                    break;
                }
                i14++;
                DecodeUtil.handleOneByte(b14, cArr, i17);
                i17++;
            }
            int i18 = i17;
            while (i14 < i16) {
                int i19 = i14 + 1;
                byte b15 = bArr[i14];
                if (DecodeUtil.isOneByte(b15)) {
                    int i24 = i18 + 1;
                    DecodeUtil.handleOneByte(b15, cArr, i18);
                    int i25 = i19;
                    while (i25 < i16) {
                        byte b16 = bArr[i25];
                        if (!DecodeUtil.isOneByte(b16)) {
                            break;
                        }
                        i25++;
                        DecodeUtil.handleOneByte(b16, cArr, i24);
                        i24++;
                    }
                    i18 = i24;
                    i14 = i25;
                } else if (DecodeUtil.isTwoBytes(b15)) {
                    if (i19 >= i16) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i14 += 2;
                    DecodeUtil.handleTwoBytes(b15, bArr[i19], cArr, i18);
                    i18++;
                } else if (DecodeUtil.isThreeBytes(b15)) {
                    if (i19 >= i16 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i26 = i14 + 2;
                    i14 += 3;
                    DecodeUtil.handleThreeBytes(b15, bArr[i19], bArr[i26], cArr, i18);
                    i18++;
                } else {
                    if (i19 >= i16 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b17 = bArr[i19];
                    int i27 = i14 + 3;
                    byte b18 = bArr[i14 + 2];
                    i14 += 4;
                    DecodeUtil.handleFourBytes(b15, b17, b18, bArr[i27], cArr, i18);
                    i18 += 2;
                }
            }
            return new String(cArr, 0, i18);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i14, int i15) {
            return decodeUtf8Default(byteBuffer, i14, i15);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i14, int i15) {
            int i16;
            int i17;
            char cCharAt;
            int length = charSequence.length();
            int i18 = i15 + i14;
            int i19 = 0;
            while (i19 < length && (i17 = i19 + i14) < i18 && (cCharAt = charSequence.charAt(i19)) < 128) {
                bArr[i17] = (byte) cCharAt;
                i19++;
            }
            if (i19 == length) {
                return i14 + length;
            }
            int i24 = i14 + i19;
            while (i19 < length) {
                char cCharAt2 = charSequence.charAt(i19);
                if (cCharAt2 < 128 && i24 < i18) {
                    bArr[i24] = (byte) cCharAt2;
                    i24++;
                } else if (cCharAt2 < 2048 && i24 <= i18 - 2) {
                    int i25 = i24 + 1;
                    bArr[i24] = (byte) ((cCharAt2 >>> 6) | 960);
                    i24 += 2;
                    bArr[i25] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i24 > i18 - 3) {
                        if (i24 > i18 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i16 = i19 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i16)))) {
                                throw new UnpairedSurrogateException(i19, length);
                            }
                            a.n(cCharAt2, i24);
                            return 0;
                        }
                        int i26 = i19 + 1;
                        if (i26 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i26);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i24] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                bArr[i24 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i27 = i24 + 3;
                                bArr[i24 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i24 += 4;
                                bArr[i27] = (byte) ((codePoint & 63) | 128);
                                i19 = i26;
                            } else {
                                i19 = i26;
                            }
                        }
                        throw new UnpairedSurrogateException(i19 - 1, length);
                    }
                    bArr[i24] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i28 = i24 + 2;
                    bArr[i24 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i24 += 3;
                    bArr[i28] = (byte) ((cCharAt2 & '?') | 128);
                }
                i19++;
            }
            return i24;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int partialIsValidUtf8(int i14, byte[] bArr, int i15, int i16) {
            byte b14;
            int i17;
            int i18;
            if (i14 != 0) {
                if (i15 >= i16) {
                    return i14;
                }
                byte b15 = (byte) i14;
                if (b15 < -32) {
                    if (b15 >= -62) {
                        i18 = i15 + 1;
                    }
                    return -1;
                }
                if (b15 < -16) {
                    byte b16 = (byte) (~(i14 >> 8));
                    if (b16 == 0) {
                        int i19 = i15 + 1;
                        byte b17 = bArr[i15];
                        if (i19 >= i16) {
                            return Utf8.incompleteStateFor(b15, b17);
                        }
                        i15 = i19;
                        b16 = b17;
                    }
                    if (b16 <= -65 && ((b15 != -32 || b16 >= -96) && (b15 != -19 || b16 < -96))) {
                        i18 = i15 + 1;
                    }
                    return -1;
                }
                byte b18 = (byte) (~(i14 >> 8));
                if (b18 == 0) {
                    i17 = i15 + 1;
                    b18 = bArr[i15];
                    if (i17 >= i16) {
                        return Utf8.incompleteStateFor(b15, b18);
                    }
                    b14 = 0;
                } else {
                    b14 = (byte) (i14 >> 16);
                    i17 = i15;
                }
                if (b14 == 0) {
                    int i24 = i17 + 1;
                    byte b19 = bArr[i17];
                    if (i24 >= i16) {
                        return Utf8.incompleteStateFor(b15, b18, b19);
                    }
                    b14 = b19;
                    i17 = i24;
                }
                if (b18 <= -65) {
                    if ((((b18 + 112) + (b15 << Ascii.FS)) >> 30) == 0 && b14 <= -65) {
                        i15 = i17 + 1;
                    }
                }
                return -1;
                i15 = i18;
            }
            return partialIsValidUtf8(bArr, i15, i16);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int partialIsValidUtf8Direct(int i14, ByteBuffer byteBuffer, int i15, int i16) {
            return partialIsValidUtf8Default(i14, byteBuffer, i15, i16);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i14, int i15) {
            while (i14 < i15 && bArr[i14] >= 0) {
                i14++;
            }
            if (i14 >= i15) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i14, i15);
        }
    }
}
