package com.google.android.exoplayer2.metadata.id3;

import com.garmin.proto.generated.a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.v;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.lang3.CharEncoding;

/* JADX INFO: loaded from: classes13.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    public static final int ID3_TAG = 4801587;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    public static final FramePredicate NO_FRAMES_PREDICATE = new a(17);
    private static final String TAG = "Id3Decoder";
    private final FramePredicate framePredicate;

    public interface FramePredicate {
        boolean evaluate(int i14, int i15, int i16, int i17, int i18);
    }

    public static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int i14, boolean z14, int i15) {
            this.majorVersion = i14;
            this.isUnsynchronized = z14;
            this.framesSize = i15;
        }
    }

    public Id3Decoder(FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i14, int i15) {
        return i15 <= i14 ? Util.EMPTY_BYTE_ARRAY : Arrays.copyOfRange(bArr, i14, i15);
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i14, int i15) {
        int iIndexOfZeroByte;
        String lowerCase;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i16 = i14 - 1;
        byte[] bArr = new byte[i16];
        parsableByteArray.readBytes(bArr, 0, i16);
        if (i15 == 2) {
            String strValueOf = String.valueOf(Ascii.toLowerCase(new String(bArr, 0, 3, "ISO-8859-1")));
            lowerCase = strValueOf.length() != 0 ? "image/".concat(strValueOf) : new String("image/");
            if ("image/jpg".equals(lowerCase)) {
                lowerCase = MimeTypes.IMAGE_JPEG;
            }
            iIndexOfZeroByte = 2;
        } else {
            iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
            lowerCase = Ascii.toLowerCase(new String(bArr, 0, iIndexOfZeroByte, "ISO-8859-1"));
            if (lowerCase.indexOf(47) == -1) {
                lowerCase = lowerCase.length() != 0 ? "image/".concat(lowerCase) : new String("image/");
            }
        }
        int i17 = bArr[iIndexOfZeroByte + 1] & UnsignedBytes.MAX_VALUE;
        int i18 = iIndexOfZeroByte + 2;
        int iIndexOfEos = indexOfEos(bArr, i18, unsignedByte);
        return new ApicFrame(lowerCase, new String(bArr, i18, iIndexOfEos - i18, charsetName), i17, copyOfRangeIfValid(bArr, iIndexOfEos + delimiterLength(unsignedByte), i16));
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsableByteArray, int i14, String str) {
        byte[] bArr = new byte[i14];
        parsableByteArray.readBytes(bArr, 0, i14);
        return new BinaryFrame(str, bArr);
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i14, int i15, boolean z14, int i16, FramePredicate framePredicate) throws Throwable {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, "ISO-8859-1");
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int i17 = parsableByteArray.readInt();
        int i18 = parsableByteArray.readInt();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        if (unsignedInt == 4294967295L) {
            unsignedInt = -1;
        }
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        long j8 = unsignedInt2 == 4294967295L ? -1L : unsignedInt2;
        ArrayList arrayList = new ArrayList();
        int i19 = position + i14;
        while (parsableByteArray.getPosition() < i19) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i15, parsableByteArray, z14, i16, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new ChapterFrame(str, i17, i18, unsignedInt, j8, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i14, int i15, boolean z14, int i16, FramePredicate framePredicate) throws Throwable {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, "ISO-8859-1");
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        boolean z15 = (unsignedByte & 2) != 0;
        boolean z16 = (unsignedByte & 1) != 0;
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[unsignedByte2];
        for (int i17 = 0; i17 < unsignedByte2; i17++) {
            int position2 = parsableByteArray.getPosition();
            int iIndexOfZeroByte2 = indexOfZeroByte(parsableByteArray.getData(), position2);
            strArr[i17] = new String(parsableByteArray.getData(), position2, iIndexOfZeroByte2 - position2, "ISO-8859-1");
            parsableByteArray.setPosition(iIndexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i18 = position + i14;
        while (parsableByteArray.getPosition() < i18) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i15, parsableByteArray, z14, i16, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new ChapterTocFrame(str, z15, z16, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i14) {
        if (i14 < 4) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i15 = i14 - 4;
        byte[] bArr2 = new byte[i15];
        parsableByteArray.readBytes(bArr2, 0, i15);
        int iIndexOfEos = indexOfEos(bArr2, 0, unsignedByte);
        String str2 = new String(bArr2, 0, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, iDelimiterLength, indexOfEos(bArr2, iDelimiterLength, unsignedByte), charsetName));
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0214 A[Catch: all -> 0x01f5, UnsupportedEncodingException -> 0x0242, TRY_LEAVE, TryCatch #1 {UnsupportedEncodingException -> 0x0242, blocks: (B:174:0x0214, B:162:0x01f0, B:171:0x0205, B:172:0x020a), top: B:185:0x010b }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8, types: [com.google.android.exoplayer2.metadata.id3.Id3Frame] */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.google.android.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.google.android.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13, types: [int] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v9, types: [int] */
    private static Id3Frame decodeFrame(int i14, ParsableByteArray parsableByteArray, boolean z14, int i15, FramePredicate framePredicate) throws Throwable {
        int unsignedIntToInt;
        ?? r14;
        boolean z15;
        boolean z16;
        ?? r15;
        boolean z17;
        ?? r16;
        ?? r17;
        ?? r18;
        int i16;
        ParsableByteArray parsableByteArray2;
        Id3Frame id3FrameDecodeBinaryFrame;
        ?? r19;
        ?? r110;
        int i17 = i14;
        ParsableByteArray parsableByteArray3 = parsableByteArray;
        int unsignedByte = parsableByteArray3.readUnsignedByte();
        int unsignedByte2 = parsableByteArray3.readUnsignedByte();
        int unsignedByte3 = parsableByteArray3.readUnsignedByte();
        boolean z18 = false;
        int unsignedByte4 = i17 >= 3 ? parsableByteArray3.readUnsignedByte() : 0;
        if (i17 == 4) {
            unsignedIntToInt = parsableByteArray3.readUnsignedIntToInt();
            if (!z14) {
                unsignedIntToInt = (((unsignedIntToInt >> 24) & 255) << 21) | (unsignedIntToInt & 255) | (((unsignedIntToInt >> 8) & 255) << 7) | (((unsignedIntToInt >> 16) & 255) << 14);
            }
        } else {
            unsignedIntToInt = i17 == 3 ? parsableByteArray3.readUnsignedIntToInt() : parsableByteArray3.readUnsignedInt24();
        }
        int iRemoveUnsynchronization = unsignedIntToInt;
        int unsignedShort = i17 >= 3 ? parsableByteArray3.readUnsignedShort() : 0;
        if (unsignedByte == 0 && unsignedByte2 == 0 && unsignedByte3 == 0 && unsignedByte4 == 0 && iRemoveUnsynchronization == 0 && unsignedShort == 0) {
            parsableByteArray3.setPosition(parsableByteArray3.limit());
            return null;
        }
        int position = parsableByteArray3.getPosition() + iRemoveUnsynchronization;
        if (position > parsableByteArray3.limit()) {
            Log.w(TAG, "Frame size exceeds remaining tag data");
            parsableByteArray3.setPosition(parsableByteArray3.limit());
            return null;
        }
        if (framePredicate != null) {
            r14 = unsignedByte2;
            if (!framePredicate.evaluate(i17, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4)) {
                i17 = i17;
                parsableByteArray3.setPosition(position);
                return null;
            }
        } else {
            r14 = unsignedByte2;
        }
        i17 = i17;
        if (i17 == 3) {
            z15 = (unsignedShort & 128) != 0;
            boolean z19 = (unsignedShort & 64) != 0;
            z16 = (unsignedShort & 32) != 0;
            z17 = false;
            z18 = z15;
            r15 = z19;
        } else if (i17 == 4) {
            boolean z24 = (unsignedShort & 64) != 0;
            boolean z25 = (unsignedShort & 8) != 0;
            r16 = (unsignedShort & 4) != 0 ? 1 : 0;
            z17 = (unsignedShort & 2) != 0;
            z18 = (unsignedShort & 1) != 0;
            z16 = z24;
            z15 = z18;
            z18 = z25;
            r15 = r16;
        } else {
            z15 = false;
            z16 = false;
            r15 = 0;
            z17 = false;
        }
        if (z18 || r15 != 0) {
            Log.w(TAG, "Skipping unsupported compressed or encrypted frame");
            parsableByteArray3.setPosition(position);
            return null;
        }
        if (z16) {
            iRemoveUnsynchronization--;
            parsableByteArray3.skipBytes(1);
        }
        if (z15) {
            iRemoveUnsynchronization -= 4;
            parsableByteArray3.skipBytes(4);
        }
        if (z17) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray3, iRemoveUnsynchronization);
        }
        try {
            try {
                try {
                    try {
                        if (unsignedByte == 84 && r14 == 88 && unsignedByte3 == 88 && (i17 == 2 || unsignedByte4 == 88)) {
                            id3FrameDecodeBinaryFrame = decodeTxxxFrame(parsableByteArray3, iRemoveUnsynchronization);
                        } else if (unsignedByte == 84) {
                            id3FrameDecodeBinaryFrame = decodeTextInformationFrame(parsableByteArray3, iRemoveUnsynchronization, getFrameId(i17, unsignedByte, r14, unsignedByte3, unsignedByte4));
                        } else if (unsignedByte == 87 && r14 == 88 && unsignedByte3 == 88 && (i17 == 2 || unsignedByte4 == 88)) {
                            id3FrameDecodeBinaryFrame = decodeWxxxFrame(parsableByteArray3, iRemoveUnsynchronization);
                        } else if (unsignedByte == 87) {
                            id3FrameDecodeBinaryFrame = decodeUrlLinkFrame(parsableByteArray3, iRemoveUnsynchronization, getFrameId(i17, unsignedByte, r14, unsignedByte3, unsignedByte4));
                        } else {
                            if (unsignedByte != 80 || r14 != 82 || unsignedByte3 != 73 || unsignedByte4 != 86) {
                                if (unsignedByte == 71 && r14 == 69 && unsignedByte3 == 79 && (unsignedByte4 == 66 || i17 == 2)) {
                                    id3FrameDecodeBinaryFrame = decodeGeobFrame(parsableByteArray3, iRemoveUnsynchronization);
                                } else {
                                    r16 = 0;
                                    try {
                                        if (i17 != 2 ? unsignedByte == 65 && r14 == 80 && unsignedByte3 == 73 && unsignedByte4 == 67 : unsignedByte == 80 && r14 == 73 && unsignedByte3 == 67) {
                                            id3FrameDecodeBinaryFrame = decodeApicFrame(parsableByteArray3, iRemoveUnsynchronization, i17);
                                        } else if (unsignedByte == 67 && r14 == 79 && unsignedByte3 == 77 && (unsignedByte4 == 77 || i17 == 2)) {
                                            id3FrameDecodeBinaryFrame = decodeCommentFrame(parsableByteArray3, iRemoveUnsynchronization);
                                        } else if (unsignedByte == 67 && r14 == 72 && unsignedByte3 == 65 && unsignedByte4 == 80) {
                                            r19 = r14;
                                            unsignedByte3 = unsignedByte3;
                                            iRemoveUnsynchronization = iRemoveUnsynchronization;
                                            i16 = unsignedByte4;
                                            try {
                                                id3FrameDecodeBinaryFrame = decodeChapterFrame(parsableByteArray3, iRemoveUnsynchronization, i17, z14, i15, framePredicate);
                                                i17 = i14;
                                                r14 = parsableByteArray;
                                                r16 = r16;
                                            } catch (UnsupportedEncodingException unused) {
                                                r14 = parsableByteArray;
                                                Log.w(TAG, "Unsupported character encoding");
                                                r14.setPosition(position);
                                                return r16;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r17 = parsableByteArray;
                                                r17.setPosition(position);
                                                throw th;
                                            }
                                        } else {
                                            r18 = r14;
                                            unsignedByte3 = unsignedByte3;
                                            iRemoveUnsynchronization = iRemoveUnsynchronization;
                                            i16 = unsignedByte4;
                                            if (unsignedByte == 67 && r18 == 84 && unsignedByte3 == 79 && i16 == 67) {
                                                i17 = i14;
                                                ParsableByteArray parsableByteArray4 = parsableByteArray;
                                                id3FrameDecodeBinaryFrame = decodeChapterTOCFrame(parsableByteArray4, iRemoveUnsynchronization, i17, z14, i15, framePredicate);
                                                r14 = parsableByteArray4;
                                                r19 = r18;
                                                r16 = r16;
                                            } else {
                                                i17 = i14;
                                                parsableByteArray2 = parsableByteArray;
                                                if (unsignedByte == 77 && r18 == 76 && unsignedByte3 == 76 && i16 == 84) {
                                                    id3FrameDecodeBinaryFrame = decodeMlltFrame(parsableByteArray2, iRemoveUnsynchronization);
                                                } else {
                                                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray2, iRemoveUnsynchronization, getFrameId(i17, unsignedByte, r18, unsignedByte3, i16));
                                                    r14 = parsableByteArray2;
                                                    r19 = r18;
                                                    r16 = r16;
                                                }
                                            }
                                        }
                                        r110 = r16;
                                        i16 = unsignedByte4;
                                        r14 = parsableByteArray3;
                                        r19 = r14;
                                        r16 = r110;
                                    } catch (UnsupportedEncodingException unused2) {
                                        r14 = parsableByteArray3;
                                    }
                                }
                                if (id3FrameDecodeBinaryFrame == null) {
                                    r14 = parsableByteArray2;
                                    r19 = r18;
                                    r16 = r16;
                                    String frameId = getFrameId(i17, unsignedByte, r19, unsignedByte3, i16);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(frameId).length() + 50);
                                    sb3.append("Failed to decode frame: id=");
                                    sb3.append(frameId);
                                    sb3.append(", frameSize=");
                                    sb3.append(iRemoveUnsynchronization);
                                    Log.w(TAG, sb3.toString());
                                }
                                r14 = parsableByteArray2;
                                r19 = r18;
                                r16 = r16;
                                r14.setPosition(position);
                                return id3FrameDecodeBinaryFrame;
                            }
                            id3FrameDecodeBinaryFrame = decodePrivFrame(parsableByteArray3, iRemoveUnsynchronization);
                        }
                        r110 = 0;
                        i16 = unsignedByte4;
                        r14 = parsableByteArray3;
                        r19 = r14;
                        r16 = r110;
                        if (id3FrameDecodeBinaryFrame == null) {
                            r14 = parsableByteArray2;
                            r19 = r18;
                            r16 = r16;
                            String frameId2 = getFrameId(i17, unsignedByte, r19, unsignedByte3, i16);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(frameId2).length() + 50);
                            sb4.append("Failed to decode frame: id=");
                            sb4.append(frameId2);
                            sb4.append(", frameSize=");
                            sb4.append(iRemoveUnsynchronization);
                            Log.w(TAG, sb4.toString());
                        }
                        r14 = parsableByteArray2;
                        r19 = r18;
                        r16 = r16;
                        r14.setPosition(position);
                        return id3FrameDecodeBinaryFrame;
                    } catch (UnsupportedEncodingException unused3) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r17 = parsableByteArray3;
                }
            } catch (Throwable th5) {
                th = th5;
                r17 = r14;
            }
        } catch (UnsupportedEncodingException unused4) {
            r14 = parsableByteArray3;
            r16 = 0;
        }
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i14) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i15 = i14 - 1;
        byte[] bArr = new byte[i15];
        parsableByteArray.readBytes(bArr, 0, i15);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        String str = new String(bArr, 0, iIndexOfZeroByte, "ISO-8859-1");
        int i16 = iIndexOfZeroByte + 1;
        int iIndexOfEos = indexOfEos(bArr, i16, unsignedByte);
        String strDecodeStringIfValid = decodeStringIfValid(bArr, i16, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        int iIndexOfEos2 = indexOfEos(bArr, iDelimiterLength, unsignedByte);
        return new GeobFrame(str, strDecodeStringIfValid, decodeStringIfValid(bArr, iDelimiterLength, iIndexOfEos2, charsetName), copyOfRangeIfValid(bArr, iIndexOfEos2 + delimiterLength(unsignedByte), i15));
    }

    private static Id3Header decodeHeader(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 10) {
            Log.w(TAG, "Data too short to be an ID3 tag");
            return null;
        }
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        if (unsignedInt24 != 4801587) {
            String str = String.format("%06X", Integer.valueOf(unsignedInt24));
            Log.w(TAG, str.length() != 0 ? "Unexpected first three bytes of ID3 tag header: 0x".concat(str) : new String("Unexpected first three bytes of ID3 tag header: 0x"));
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int synchSafeInt = parsableByteArray.readSynchSafeInt();
        if (unsignedByte == 2) {
            if ((unsignedByte2 & 64) != 0) {
                Log.w(TAG, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (unsignedByte == 3) {
            if ((unsignedByte2 & 64) != 0) {
                int i14 = parsableByteArray.readInt();
                parsableByteArray.skipBytes(i14);
                synchSafeInt -= i14 + 4;
            }
        } else {
            if (unsignedByte != 4) {
                v.e(57, unsignedByte, "Skipped ID3 tag with unsupported majorVersion=", TAG);
                return null;
            }
            if ((unsignedByte2 & 64) != 0) {
                int synchSafeInt2 = parsableByteArray.readSynchSafeInt();
                parsableByteArray.skipBytes(synchSafeInt2 - 4);
                synchSafeInt -= synchSafeInt2;
            }
            if ((unsignedByte2 & 16) != 0) {
                synchSafeInt -= 10;
            }
        }
        return new Id3Header(unsignedByte, unsignedByte < 4 && (unsignedByte2 & 128) != 0, synchSafeInt);
    }

    private static MlltFrame decodeMlltFrame(ParsableByteArray parsableByteArray, int i14) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        int unsignedInt25 = parsableByteArray.readUnsignedInt24();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i15 = ((i14 - 10) * 8) / (unsignedByte + unsignedByte2);
        int[] iArr = new int[i15];
        int[] iArr2 = new int[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            int bits = parsableBitArray.readBits(unsignedByte);
            int bits2 = parsableBitArray.readBits(unsignedByte2);
            iArr[i16] = bits;
            iArr2[i16] = bits2;
        }
        return new MlltFrame(unsignedShort, unsignedInt24, unsignedInt25, iArr, iArr2);
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i14) {
        byte[] bArr = new byte[i14];
        parsableByteArray.readBytes(bArr, 0, i14);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iIndexOfZeroByte, "ISO-8859-1"), copyOfRangeIfValid(bArr, iIndexOfZeroByte + 1, i14));
    }

    private static String decodeStringIfValid(byte[] bArr, int i14, int i15, String str) {
        return (i15 <= i14 || i15 > bArr.length) ? "" : new String(bArr, i14, i15 - i14, str);
    }

    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i14, String str) {
        if (i14 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i15 = i14 - 1;
        byte[] bArr = new byte[i15];
        parsableByteArray.readBytes(bArr, 0, i15);
        return new TextInformationFrame(str, null, new String(bArr, 0, indexOfEos(bArr, 0, unsignedByte), charsetName));
    }

    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i14) {
        if (i14 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i15 = i14 - 1;
        byte[] bArr = new byte[i15];
        parsableByteArray.readBytes(bArr, 0, i15);
        int iIndexOfEos = indexOfEos(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        return new TextInformationFrame("TXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfEos(bArr, iDelimiterLength, unsignedByte), charsetName));
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i14, String str) {
        byte[] bArr = new byte[i14];
        parsableByteArray.readBytes(bArr, 0, i14);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), "ISO-8859-1"));
    }

    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsableByteArray, int i14) {
        if (i14 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i15 = i14 - 1;
        byte[] bArr = new byte[i15];
        parsableByteArray.readBytes(bArr, 0, i15);
        int iIndexOfEos = indexOfEos(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfZeroByte(bArr, iDelimiterLength), "ISO-8859-1"));
    }

    private static int delimiterLength(int i14) {
        return (i14 == 0 || i14 == 3) ? 1 : 2;
    }

    private static String getCharsetName(int i14) {
        if (i14 == 1) {
            return "UTF-16";
        }
        if (i14 != 2) {
            return i14 != 3 ? "ISO-8859-1" : "UTF-8";
        }
        return CharEncoding.UTF_16BE;
    }

    private static String getFrameId(int i14, int i15, int i16, int i17, int i18) {
        return i14 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18));
    }

    private static int indexOfEos(byte[] bArr, int i14, int i15) {
        int iIndexOfZeroByte = indexOfZeroByte(bArr, i14);
        if (i15 == 0 || i15 == 3) {
            return iIndexOfZeroByte;
        }
        while (iIndexOfZeroByte < bArr.length - 1) {
            if ((iIndexOfZeroByte - i14) % 2 == 0 && bArr[iIndexOfZeroByte + 1] == 0) {
                return iIndexOfZeroByte;
            }
            iIndexOfZeroByte = indexOfZeroByte(bArr, iIndexOfZeroByte + 1);
        }
        return bArr.length;
    }

    private static int indexOfZeroByte(byte[] bArr, int i14) {
        while (i14 < bArr.length) {
            if (bArr[i14] == 0) {
                return i14;
            }
            i14++;
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(int i14, int i15, int i16, int i17, int i18) {
        return false;
    }

    private static int removeUnsynchronization(ParsableByteArray parsableByteArray, int i14) {
        byte[] data = parsableByteArray.getData();
        int position = parsableByteArray.getPosition();
        int i15 = position;
        while (true) {
            int i16 = i15 + 1;
            if (i16 >= position + i14) {
                return i14;
            }
            if ((data[i15] & UnsignedBytes.MAX_VALUE) == 255 && data[i16] == 0) {
                System.arraycopy(data, i15 + 2, data, i16, (i14 - (i15 - position)) - 2);
                i14--;
            }
            i15 = i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean validateFrames(ParsableByteArray parsableByteArray, int i14, int i15, boolean z14) {
        int unsignedInt24;
        long unsignedInt25;
        int unsignedShort;
        int i16;
        int position = parsableByteArray.getPosition();
        while (true) {
            try {
                boolean z15 = true;
                if (parsableByteArray.bytesLeft() < i15) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i14 >= 3) {
                    unsignedInt24 = parsableByteArray.readInt();
                    unsignedInt25 = parsableByteArray.readUnsignedInt();
                    unsignedShort = parsableByteArray.readUnsignedShort();
                } else {
                    unsignedInt24 = parsableByteArray.readUnsignedInt24();
                    unsignedInt25 = parsableByteArray.readUnsignedInt24();
                    unsignedShort = 0;
                }
                if (unsignedInt24 == 0 && unsignedInt25 == 0 && unsignedShort == 0) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i14 == 4 && !z14) {
                    if ((8421504 & unsignedInt25) != 0) {
                        parsableByteArray.setPosition(position);
                        return false;
                    }
                    unsignedInt25 = (((unsignedInt25 >> 24) & 255) << 21) | (unsignedInt25 & 255) | (((unsignedInt25 >> 8) & 255) << 7) | (((unsignedInt25 >> 16) & 255) << 14);
                }
                if (i14 == 4) {
                    i16 = (unsignedShort & 64) != 0 ? 1 : 0;
                    if ((unsignedShort & 1) == 0) {
                        z15 = false;
                    }
                } else if (i14 == 3) {
                    i16 = (unsignedShort & 32) != 0 ? 1 : 0;
                    if ((unsignedShort & 128) == 0) {
                        z15 = false;
                    }
                } else {
                    i16 = 0;
                    z15 = false;
                }
                if (z15) {
                    i16 += 4;
                }
                if (unsignedInt25 < i16) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                if (parsableByteArray.bytesLeft() < unsignedInt25) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                parsableByteArray.skipBytes((int) unsignedInt25);
            } catch (Throwable th3) {
                parsableByteArray.setPosition(position);
                throw th3;
            }
        }
    }

    public Metadata decode(byte[] bArr, int i14) throws Throwable {
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i14);
        Id3Header id3HeaderDecodeHeader = decodeHeader(parsableByteArray);
        if (id3HeaderDecodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i15 = id3HeaderDecodeHeader.majorVersion == 2 ? 6 : 10;
        int iRemoveUnsynchronization = id3HeaderDecodeHeader.framesSize;
        if (id3HeaderDecodeHeader.isUnsynchronized) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, id3HeaderDecodeHeader.framesSize);
        }
        parsableByteArray.setLimit(position + iRemoveUnsynchronization);
        boolean z14 = false;
        if (!validateFrames(parsableByteArray, id3HeaderDecodeHeader.majorVersion, i15, false)) {
            if (id3HeaderDecodeHeader.majorVersion != 4 || !validateFrames(parsableByteArray, 4, i15, true)) {
                v.e(56, id3HeaderDecodeHeader.majorVersion, "Failed to validate ID3 tag with majorVersion=", TAG);
                return null;
            }
            z14 = true;
        }
        while (parsableByteArray.bytesLeft() >= i15) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(id3HeaderDecodeHeader.majorVersion, parsableByteArray, z14, i15, this.framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new Metadata(arrayList);
    }

    public Id3Decoder() {
        this(null);
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    public Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }
}
