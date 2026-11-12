package com.google.android.exoplayer2.extractor;

import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class VorbisUtil {
    private static final String TAG = "VorbisUtil";

    public static final class CodeBook {
        public final int dimensions;
        public final int entries;
        public final boolean isOrdered;
        public final long[] lengthMap;
        public final int lookupType;

        public CodeBook(int i14, int i15, long[] jArr, int i16, boolean z14) {
            this.dimensions = i14;
            this.entries = i15;
            this.lengthMap = jArr;
            this.lookupType = i16;
            this.isOrdered = z14;
        }
    }

    public static final class CommentHeader {
        public final String[] comments;
        public final int length;
        public final String vendor;

        public CommentHeader(String str, String[] strArr, int i14) {
            this.vendor = str;
            this.comments = strArr;
            this.length = i14;
        }
    }

    public static final class Mode {
        public final boolean blockFlag;
        public final int mapping;
        public final int transformType;
        public final int windowType;

        public Mode(boolean z14, int i14, int i15, int i16) {
            this.blockFlag = z14;
            this.windowType = i14;
            this.transformType = i15;
            this.mapping = i16;
        }
    }

    public static final class VorbisIdHeader {
        public final int bitrateMaximum;
        public final int bitrateMinimum;
        public final int bitrateNominal;
        public final int blockSize0;
        public final int blockSize1;
        public final int channels;
        public final byte[] data;
        public final boolean framingFlag;
        public final int sampleRate;
        public final int version;

        public VorbisIdHeader(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, boolean z14, byte[] bArr) {
            this.version = i14;
            this.channels = i15;
            this.sampleRate = i16;
            this.bitrateMaximum = i17;
            this.bitrateNominal = i18;
            this.bitrateMinimum = i19;
            this.blockSize0 = i24;
            this.blockSize1 = i25;
            this.framingFlag = z14;
            this.data = bArr;
        }
    }

    private VorbisUtil() {
    }

    public static int iLog(int i14) {
        int i15 = 0;
        while (i14 > 0) {
            i15++;
            i14 >>>= 1;
        }
        return i15;
    }

    private static long mapType1QuantValues(long j8, long j14) {
        return (long) Math.floor(Math.pow(j8, 1.0d / j14));
    }

    public static Metadata parseVorbisComments(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < list.size(); i14++) {
            String str = list.get(i14);
            String[] strArrSplitAtFirst = Util.splitAtFirst(str, "=");
            if (strArrSplitAtFirst.length != 2) {
                String strValueOf = String.valueOf(str);
                Log.w(TAG, strValueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(strValueOf) : new String("Failed to parse Vorbis comment: "));
            } else if (strArrSplitAtFirst[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.fromPictureBlock(new ParsableByteArray(Base64.decode(strArrSplitAtFirst[1], 0))));
                } catch (RuntimeException e4) {
                    Log.w(TAG, "Failed to parse vorbis picture", e4);
                }
            } else {
                arrayList.add(new VorbisComment(strArrSplitAtFirst[0], strArrSplitAtFirst[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static CodeBook readBook(VorbisBitArray vorbisBitArray) throws ParserException {
        if (vorbisBitArray.readBits(24) != 5653314) {
            int position = vorbisBitArray.getPosition();
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
            sb3.append(position);
            throw ParserException.createForMalformedContainer(sb3.toString(), null);
        }
        int bits = vorbisBitArray.readBits(16);
        int bits2 = vorbisBitArray.readBits(24);
        long[] jArr = new long[bits2];
        boolean bit = vorbisBitArray.readBit();
        long jMapType1QuantValues = 0;
        if (bit) {
            int bits3 = vorbisBitArray.readBits(5) + 1;
            int i14 = 0;
            while (i14 < bits2) {
                int bits4 = vorbisBitArray.readBits(iLog(bits2 - i14));
                for (int i15 = 0; i15 < bits4 && i14 < bits2; i15++) {
                    jArr[i14] = bits3;
                    i14++;
                }
                bits3++;
            }
        } else {
            boolean bit2 = vorbisBitArray.readBit();
            for (int i16 = 0; i16 < bits2; i16++) {
                if (!bit2) {
                    jArr[i16] = vorbisBitArray.readBits(5) + 1;
                } else if (vorbisBitArray.readBit()) {
                    jArr[i16] = vorbisBitArray.readBits(5) + 1;
                } else {
                    jArr[i16] = 0;
                }
            }
        }
        int bits5 = vorbisBitArray.readBits(4);
        if (bits5 > 2) {
            StringBuilder sb4 = new StringBuilder(53);
            sb4.append("lookup type greater than 2 not decodable: ");
            sb4.append(bits5);
            throw ParserException.createForMalformedContainer(sb4.toString(), null);
        }
        if (bits5 == 1 || bits5 == 2) {
            vorbisBitArray.skipBits(32);
            vorbisBitArray.skipBits(32);
            int bits6 = vorbisBitArray.readBits(4) + 1;
            vorbisBitArray.skipBits(1);
            if (bits5 != 1) {
                jMapType1QuantValues = ((long) bits2) * ((long) bits);
            } else if (bits != 0) {
                jMapType1QuantValues = mapType1QuantValues(bits2, bits);
            }
            vorbisBitArray.skipBits((int) (jMapType1QuantValues * ((long) bits6)));
        }
        return new CodeBook(bits, bits2, jArr, bits5, bit);
    }

    private static void readFloors(VorbisBitArray vorbisBitArray) throws ParserException {
        int bits = vorbisBitArray.readBits(6) + 1;
        for (int i14 = 0; i14 < bits; i14++) {
            int bits2 = vorbisBitArray.readBits(16);
            if (bits2 == 0) {
                vorbisBitArray.skipBits(8);
                vorbisBitArray.skipBits(16);
                vorbisBitArray.skipBits(16);
                vorbisBitArray.skipBits(6);
                vorbisBitArray.skipBits(8);
                int bits3 = vorbisBitArray.readBits(4) + 1;
                for (int i15 = 0; i15 < bits3; i15++) {
                    vorbisBitArray.skipBits(8);
                }
            } else {
                if (bits2 != 1) {
                    StringBuilder sb3 = new StringBuilder(52);
                    sb3.append("floor type greater than 1 not decodable: ");
                    sb3.append(bits2);
                    throw ParserException.createForMalformedContainer(sb3.toString(), null);
                }
                int bits4 = vorbisBitArray.readBits(5);
                int[] iArr = new int[bits4];
                int i16 = -1;
                for (int i17 = 0; i17 < bits4; i17++) {
                    int bits5 = vorbisBitArray.readBits(4);
                    iArr[i17] = bits5;
                    if (bits5 > i16) {
                        i16 = bits5;
                    }
                }
                int i18 = i16 + 1;
                int[] iArr2 = new int[i18];
                for (int i19 = 0; i19 < i18; i19++) {
                    iArr2[i19] = vorbisBitArray.readBits(3) + 1;
                    int bits6 = vorbisBitArray.readBits(2);
                    if (bits6 > 0) {
                        vorbisBitArray.skipBits(8);
                    }
                    for (int i24 = 0; i24 < (1 << bits6); i24++) {
                        vorbisBitArray.skipBits(8);
                    }
                }
                vorbisBitArray.skipBits(2);
                int bits7 = vorbisBitArray.readBits(4);
                int i25 = 0;
                int i26 = 0;
                for (int i27 = 0; i27 < bits4; i27++) {
                    i25 += iArr2[iArr[i27]];
                    while (i26 < i25) {
                        vorbisBitArray.skipBits(bits7);
                        i26++;
                    }
                }
            }
        }
    }

    private static void readMappings(int i14, VorbisBitArray vorbisBitArray) throws ParserException {
        int bits = vorbisBitArray.readBits(6) + 1;
        for (int i15 = 0; i15 < bits; i15++) {
            int bits2 = vorbisBitArray.readBits(16);
            if (bits2 != 0) {
                StringBuilder sb3 = new StringBuilder(52);
                sb3.append("mapping type other than 0 not supported: ");
                sb3.append(bits2);
                Log.e(TAG, sb3.toString());
            } else {
                int bits3 = vorbisBitArray.readBit() ? vorbisBitArray.readBits(4) + 1 : 1;
                if (vorbisBitArray.readBit()) {
                    int bits4 = vorbisBitArray.readBits(8) + 1;
                    for (int i16 = 0; i16 < bits4; i16++) {
                        int i17 = i14 - 1;
                        vorbisBitArray.skipBits(iLog(i17));
                        vorbisBitArray.skipBits(iLog(i17));
                    }
                }
                if (vorbisBitArray.readBits(2) != 0) {
                    throw ParserException.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (bits3 > 1) {
                    for (int i18 = 0; i18 < i14; i18++) {
                        vorbisBitArray.skipBits(4);
                    }
                }
                for (int i19 = 0; i19 < bits3; i19++) {
                    vorbisBitArray.skipBits(8);
                    vorbisBitArray.skipBits(8);
                    vorbisBitArray.skipBits(8);
                }
            }
        }
    }

    private static Mode[] readModes(VorbisBitArray vorbisBitArray) {
        int bits = vorbisBitArray.readBits(6) + 1;
        Mode[] modeArr = new Mode[bits];
        for (int i14 = 0; i14 < bits; i14++) {
            modeArr[i14] = new Mode(vorbisBitArray.readBit(), vorbisBitArray.readBits(16), vorbisBitArray.readBits(16), vorbisBitArray.readBits(8));
        }
        return modeArr;
    }

    private static void readResidues(VorbisBitArray vorbisBitArray) throws ParserException {
        int bits = vorbisBitArray.readBits(6) + 1;
        for (int i14 = 0; i14 < bits; i14++) {
            if (vorbisBitArray.readBits(16) > 2) {
                throw ParserException.createForMalformedContainer("residueType greater than 2 is not decodable", null);
            }
            vorbisBitArray.skipBits(24);
            vorbisBitArray.skipBits(24);
            vorbisBitArray.skipBits(24);
            int bits2 = vorbisBitArray.readBits(6) + 1;
            vorbisBitArray.skipBits(8);
            int[] iArr = new int[bits2];
            for (int i15 = 0; i15 < bits2; i15++) {
                iArr[i15] = ((vorbisBitArray.readBit() ? vorbisBitArray.readBits(5) : 0) * 8) + vorbisBitArray.readBits(3);
            }
            for (int i16 = 0; i16 < bits2; i16++) {
                for (int i17 = 0; i17 < 8; i17++) {
                    if ((iArr[i16] & (1 << i17)) != 0) {
                        vorbisBitArray.skipBits(8);
                    }
                }
            }
        }
    }

    public static CommentHeader readVorbisCommentHeader(ParsableByteArray parsableByteArray, boolean z14, boolean z15) throws ParserException {
        if (z14) {
            verifyVorbisHeaderCapturePattern(3, parsableByteArray, false);
        }
        String string = parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt());
        int length = string.length();
        long littleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
        String[] strArr = new String[(int) littleEndianUnsignedInt];
        int length2 = length + 15;
        for (int i14 = 0; i14 < littleEndianUnsignedInt; i14++) {
            String string2 = parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt());
            strArr[i14] = string2;
            length2 = length2 + 4 + string2.length();
        }
        if (z15 && (parsableByteArray.readUnsignedByte() & 1) == 0) {
            throw ParserException.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new CommentHeader(string, strArr, length2 + 1);
    }

    public static VorbisIdHeader readVorbisIdentificationHeader(ParsableByteArray parsableByteArray) throws ParserException {
        verifyVorbisHeaderCapturePattern(1, parsableByteArray, false);
        int littleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int littleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        if (littleEndianInt <= 0) {
            littleEndianInt = -1;
        }
        int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
        if (littleEndianInt2 <= 0) {
            littleEndianInt2 = -1;
        }
        int littleEndianInt3 = parsableByteArray.readLittleEndianInt();
        if (littleEndianInt3 <= 0) {
            littleEndianInt3 = -1;
        }
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        return new VorbisIdHeader(littleEndianUnsignedIntToInt, unsignedByte, littleEndianUnsignedIntToInt2, littleEndianInt, littleEndianInt2, littleEndianInt3, (int) Math.pow(2.0d, unsignedByte2 & 15), (int) Math.pow(2.0d, (unsignedByte2 & PsExtractor.VIDEO_STREAM_MASK) >> 4), (parsableByteArray.readUnsignedByte() & 1) > 0, Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit()));
    }

    public static Mode[] readVorbisModes(ParsableByteArray parsableByteArray, int i14) throws ParserException {
        verifyVorbisHeaderCapturePattern(5, parsableByteArray, false);
        int unsignedByte = parsableByteArray.readUnsignedByte() + 1;
        VorbisBitArray vorbisBitArray = new VorbisBitArray(parsableByteArray.getData());
        vorbisBitArray.skipBits(parsableByteArray.getPosition() * 8);
        for (int i15 = 0; i15 < unsignedByte; i15++) {
            readBook(vorbisBitArray);
        }
        int bits = vorbisBitArray.readBits(6) + 1;
        for (int i16 = 0; i16 < bits; i16++) {
            if (vorbisBitArray.readBits(16) != 0) {
                throw ParserException.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        readFloors(vorbisBitArray);
        readResidues(vorbisBitArray);
        readMappings(i14, vorbisBitArray);
        Mode[] modes = readModes(vorbisBitArray);
        if (vorbisBitArray.readBit()) {
            return modes;
        }
        throw ParserException.createForMalformedContainer("framing bit after modes not set as expected", null);
    }

    public static boolean verifyVorbisHeaderCapturePattern(int i14, ParsableByteArray parsableByteArray, boolean z14) throws ParserException {
        if (parsableByteArray.bytesLeft() < 7) {
            if (z14) {
                return false;
            }
            int iBytesLeft = parsableByteArray.bytesLeft();
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("too short header: ");
            sb3.append(iBytesLeft);
            throw ParserException.createForMalformedContainer(sb3.toString(), null);
        }
        if (parsableByteArray.readUnsignedByte() != i14) {
            if (z14) {
                return false;
            }
            String strValueOf = String.valueOf(Integer.toHexString(i14));
            throw ParserException.createForMalformedContainer(strValueOf.length() != 0 ? "expected header type ".concat(strValueOf) : new String("expected header type "), null);
        }
        if (parsableByteArray.readUnsignedByte() == 118 && parsableByteArray.readUnsignedByte() == 111 && parsableByteArray.readUnsignedByte() == 114 && parsableByteArray.readUnsignedByte() == 98 && parsableByteArray.readUnsignedByte() == 105 && parsableByteArray.readUnsignedByte() == 115) {
            return true;
        }
        if (z14) {
            return false;
        }
        throw ParserException.createForMalformedContainer("expected characters 'vorbis'", null);
    }

    public static CommentHeader readVorbisCommentHeader(ParsableByteArray parsableByteArray) {
        return readVorbisCommentHeader(parsableByteArray, true, true);
    }
}
