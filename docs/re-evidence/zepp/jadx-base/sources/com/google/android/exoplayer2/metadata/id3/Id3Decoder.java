package com.google.android.exoplayer2.metadata.id3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {
    public static final int ID3_HEADER_LENGTH = 10;
    public static final int ID3_TAG = 4801587;
    public static final FramePredicate NO_FRAMES_PREDICATE = new FramePredicate() { // from class: oc4
        @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i2, int i3, int i4, int i5, int i6) {
            return Id3Decoder.w(i2, i3, i4, i5, i6);
        }
    };
    private static final String b = "Id3Decoder";
    private static final int c = 128;
    private static final int d = 64;
    private static final int e = 32;
    private static final int f = 8;
    private static final int g = 4;
    private static final int h = 64;
    private static final int i = 2;
    private static final int j = 1;
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 3;

    @Nullable
    private final FramePredicate a;

    public interface FramePredicate {
        boolean evaluate(int majorVersion, int id0, int id1, int id2, int id3);
    }

    public static final class a {
        private final int a;
        private final boolean b;
        private final int c;

        public a(int majorVersion, boolean isUnsynchronized, int framesSize) {
            this.a = majorVersion;
            this.b = isUnsynchronized;
            this.c = framesSize;
        }
    }

    public Id3Decoder() {
        this(null);
    }

    private static byte[] b(byte[] data, int from, int to) {
        return to <= from ? Util.EMPTY_BYTE_ARRAY : Arrays.copyOfRange(data, from, to);
    }

    private static ApicFrame c(ParsableByteArray id3Data, int frameSize, int majorVersion) throws UnsupportedEncodingException {
        int iV;
        String strConcat;
        int unsignedByte = id3Data.readUnsignedByte();
        String strS = s(unsignedByte);
        int i2 = frameSize - 1;
        byte[] bArr = new byte[i2];
        id3Data.readBytes(bArr, 0, i2);
        if (majorVersion == 2) {
            String strValueOf = String.valueOf(Ascii.toLowerCase(new String(bArr, 0, 3, "ISO-8859-1")));
            strConcat = strValueOf.length() != 0 ? "image/".concat(strValueOf) : new String("image/");
            if ("image/jpg".equals(strConcat)) {
                strConcat = MimeTypes.IMAGE_JPEG;
            }
            iV = 2;
        } else {
            iV = v(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, iV, "ISO-8859-1"));
            if (lowerCase.indexOf(47) != -1) {
                strConcat = lowerCase;
            } else if (lowerCase.length() != 0) {
                strConcat = "image/".concat(lowerCase);
            } else {
                lowerCase = new String("image/");
                strConcat = lowerCase;
            }
        }
        int i3 = bArr[iV + 1] & 255;
        int i4 = iV + 2;
        int iU = u(bArr, i4, unsignedByte);
        return new ApicFrame(strConcat, new String(bArr, i4, iU - i4, strS), i3, b(bArr, iU + r(unsignedByte), i2));
    }

    private static BinaryFrame d(ParsableByteArray id3Data, int frameSize, String id) {
        byte[] bArr = new byte[frameSize];
        id3Data.readBytes(bArr, 0, frameSize);
        return new BinaryFrame(id, bArr);
    }

    private static ChapterFrame e(ParsableByteArray id3Data, int frameSize, int majorVersion, boolean unsignedIntFrameSizeHack, int frameHeaderSize, @Nullable FramePredicate framePredicate) throws UnsupportedEncodingException {
        int position = id3Data.getPosition();
        int iV = v(id3Data.getData(), position);
        String str = new String(id3Data.getData(), position, iV - position, "ISO-8859-1");
        id3Data.setPosition(iV + 1);
        int i2 = id3Data.readInt();
        int i3 = id3Data.readInt();
        long unsignedInt = id3Data.readUnsignedInt();
        long j2 = unsignedInt == 4294967295L ? -1L : unsignedInt;
        long unsignedInt2 = id3Data.readUnsignedInt();
        long j3 = unsignedInt2 == 4294967295L ? -1L : unsignedInt2;
        ArrayList arrayList = new ArrayList();
        int i4 = position + frameSize;
        while (id3Data.getPosition() < i4) {
            Id3Frame id3FrameH = h(majorVersion, id3Data, unsignedIntFrameSizeHack, frameHeaderSize, framePredicate);
            if (id3FrameH != null) {
                arrayList.add(id3FrameH);
            }
        }
        return new ChapterFrame(str, i2, i3, j2, j3, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static ChapterTocFrame f(ParsableByteArray id3Data, int frameSize, int majorVersion, boolean unsignedIntFrameSizeHack, int frameHeaderSize, @Nullable FramePredicate framePredicate) throws UnsupportedEncodingException {
        int position = id3Data.getPosition();
        int iV = v(id3Data.getData(), position);
        String str = new String(id3Data.getData(), position, iV - position, "ISO-8859-1");
        id3Data.setPosition(iV + 1);
        int unsignedByte = id3Data.readUnsignedByte();
        boolean z = (unsignedByte & 2) != 0;
        boolean z2 = (unsignedByte & 1) != 0;
        int unsignedByte2 = id3Data.readUnsignedByte();
        String[] strArr = new String[unsignedByte2];
        for (int i2 = 0; i2 < unsignedByte2; i2++) {
            int position2 = id3Data.getPosition();
            int iV2 = v(id3Data.getData(), position2);
            strArr[i2] = new String(id3Data.getData(), position2, iV2 - position2, "ISO-8859-1");
            id3Data.setPosition(iV2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i3 = position + frameSize;
        while (id3Data.getPosition() < i3) {
            Id3Frame id3FrameH = h(majorVersion, id3Data, unsignedIntFrameSizeHack, frameHeaderSize, framePredicate);
            if (id3FrameH != null) {
                arrayList.add(id3FrameH);
            }
        }
        return new ChapterTocFrame(str, z, z2, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    @Nullable
    private static CommentFrame g(ParsableByteArray id3Data, int frameSize) throws UnsupportedEncodingException {
        if (frameSize < 4) {
            return null;
        }
        int unsignedByte = id3Data.readUnsignedByte();
        String strS = s(unsignedByte);
        byte[] bArr = new byte[3];
        id3Data.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = frameSize - 4;
        byte[] bArr2 = new byte[i2];
        id3Data.readBytes(bArr2, 0, i2);
        int iU = u(bArr2, 0, unsignedByte);
        String str2 = new String(bArr2, 0, iU, strS);
        int iR = iU + r(unsignedByte);
        return new CommentFrame(str, str2, m(bArr2, iR, u(bArr2, iR, unsignedByte), strS));
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0198  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x01db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ea A[Catch: all -> 0x012e, UnsupportedEncodingException -> 0x0222, Merged into TryCatch #1 {all -> 0x012e, UnsupportedEncodingException -> 0x0222, blocks: (B:91:0x011c, B:159:0x01f4, B:162:0x0222, B:93:0x0124, B:102:0x013d, B:104:0x0145, B:112:0x015f, B:121:0x0177, B:132:0x0192, B:139:0x01a4, B:145:0x01b3, B:150:0x01cb, B:156:0x01e5, B:157:0x01ea), top: B:169:0x0112 }] */
    @Nullable
    private static Id3Frame h(int majorVersion, ParsableByteArray id3Data, boolean unsignedIntFrameSizeHack, int frameHeaderSize, @Nullable FramePredicate framePredicate) {
        int unsignedIntToInt;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Id3Frame id3FrameD;
        int unsignedByte = id3Data.readUnsignedByte();
        int unsignedByte2 = id3Data.readUnsignedByte();
        int unsignedByte3 = id3Data.readUnsignedByte();
        int unsignedByte4 = majorVersion >= 3 ? id3Data.readUnsignedByte() : 0;
        if (majorVersion == 4) {
            unsignedIntToInt = id3Data.readUnsignedIntToInt();
            if (!unsignedIntFrameSizeHack) {
                unsignedIntToInt = (((unsignedIntToInt >> 24) & 255) << 21) | (unsignedIntToInt & 255) | (((unsignedIntToInt >> 8) & 255) << 7) | (((unsignedIntToInt >> 16) & 255) << 14);
            }
        } else {
            unsignedIntToInt = majorVersion == 3 ? id3Data.readUnsignedIntToInt() : id3Data.readUnsignedInt24();
        }
        int iX = unsignedIntToInt;
        int unsignedShort = majorVersion >= 3 ? id3Data.readUnsignedShort() : 0;
        if (unsignedByte == 0 && unsignedByte2 == 0 && unsignedByte3 == 0 && unsignedByte4 == 0 && iX == 0 && unsignedShort == 0) {
            id3Data.setPosition(id3Data.limit());
            return null;
        }
        int position = id3Data.getPosition() + iX;
        if (position > id3Data.limit()) {
            Log.w(b, "Frame size exceeds remaining tag data");
            id3Data.setPosition(id3Data.limit());
            return null;
        }
        if (framePredicate != null) {
            i2 = position;
            if (!framePredicate.evaluate(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4)) {
                id3Data.setPosition(i2);
                return null;
            }
        } else {
            i2 = position;
        }
        if (majorVersion == 3) {
            int i3 = unsignedShort;
            z2 = (i3 & 128) != 0;
            z3 = (i3 & 64) != 0;
            z = (i3 & 32) != 0;
            z5 = z2;
            z4 = false;
        } else {
            int i4 = unsignedShort;
            if (majorVersion == 4) {
                boolean z6 = (i4 & 64) != 0;
                boolean z7 = (i4 & 8) != 0;
                boolean z8 = (i4 & 4) != 0;
                z4 = (i4 & 2) != 0;
                boolean z9 = (i4 & 1) != 0;
                z = z6;
                z2 = z9;
                z5 = z7;
                z3 = z8;
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
        }
        if (z5 || z3) {
            Log.w(r4, "Skipping unsupported compressed or encrypted frame");
            id3Data.setPosition(i2);
            return null;
        }
        if (z) {
            iX--;
            id3Data.skipBytes(1);
        }
        if (z2) {
            iX -= 4;
            id3Data.skipBytes(4);
        }
        if (z4) {
            iX = x(id3Data, iX);
        }
        try {
            if (unsignedByte == 84 && unsignedByte2 == 88 && unsignedByte3 == 88 && (majorVersion == 2 || unsignedByte4 == 88)) {
                id3FrameD = o(id3Data, iX);
            } else if (unsignedByte == 84) {
                id3FrameD = n(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
            } else if (unsignedByte == 87 && unsignedByte2 == 88 && unsignedByte3 == 88 && (majorVersion == 2 || unsignedByte4 == 88)) {
                id3FrameD = q(id3Data, iX);
            } else if (unsignedByte == 87) {
                id3FrameD = p(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
            } else if (unsignedByte == 80 && unsignedByte2 == 82 && unsignedByte3 == 73 && unsignedByte4 == 86) {
                id3FrameD = l(id3Data, iX);
            } else if (unsignedByte == 71 && unsignedByte2 == 69 && unsignedByte3 == 79 && (unsignedByte4 == 66 || majorVersion == 2)) {
                id3FrameD = i(id3Data, iX);
            } else if (majorVersion == 2) {
                if (unsignedByte == 80 && unsignedByte2 == 73 && unsignedByte3 == 67) {
                    id3FrameD = c(id3Data, iX, majorVersion);
                } else if (unsignedByte != 67 && unsignedByte2 == 79 && unsignedByte3 == 77 && (unsignedByte4 == 77 || majorVersion == 2)) {
                    id3FrameD = g(id3Data, iX);
                } else if (unsignedByte != 67 && unsignedByte2 == 72 && unsignedByte3 == 65 && unsignedByte4 == 80) {
                    id3FrameD = e(id3Data, iX, majorVersion, unsignedIntFrameSizeHack, frameHeaderSize, framePredicate);
                } else if (unsignedByte != 67 && unsignedByte2 == 84 && unsignedByte3 == 79 && unsignedByte4 == 67) {
                    id3FrameD = f(id3Data, iX, majorVersion, unsignedIntFrameSizeHack, frameHeaderSize, framePredicate);
                } else if (unsignedByte != 77 && unsignedByte2 == 76 && unsignedByte3 == 76 && unsignedByte4 == 84) {
                    id3FrameD = k(id3Data, iX);
                } else {
                    id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                }
            } else if (unsignedByte == 65 && unsignedByte2 == 80 && unsignedByte3 == 73 && unsignedByte4 == 67) {
                id3FrameD = c(id3Data, iX, majorVersion);
            } else if (unsignedByte != 67) {
                if (unsignedByte != 67) {
                    if (unsignedByte != 67) {
                        if (unsignedByte != 77) {
                            id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                        } else {
                            id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                        }
                    } else if (unsignedByte != 77) {
                        id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    } else {
                        id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    }
                } else if (unsignedByte != 67) {
                    if (unsignedByte != 77) {
                        id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    } else {
                        id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    }
                } else if (unsignedByte != 77) {
                    id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                } else {
                    id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                }
            } else if (unsignedByte != 67) {
                if (unsignedByte != 67) {
                    if (unsignedByte != 77) {
                        id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    } else {
                        id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    }
                } else if (unsignedByte != 77) {
                    id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                } else {
                    id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                }
            } else if (unsignedByte != 67) {
                if (unsignedByte != 77) {
                    id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                } else {
                    id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                }
            } else if (unsignedByte != 77) {
                id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
            } else {
                id3FrameD = d(id3Data, iX, t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
            }
            if (id3FrameD == null) {
                String strT = t(majorVersion, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4);
                StringBuilder sb = new StringBuilder(String.valueOf(strT).length() + 50);
                sb.append("Failed to decode frame: id=");
                sb.append(strT);
                sb.append(", frameSize=");
                sb.append(iX);
                Log.w(b, sb.toString());
            }
            id3Data.setPosition(i2);
            return id3FrameD;
        } catch (UnsupportedEncodingException unused) {
            Log.w(r4, "Unsupported character encoding");
            return null;
        } finally {
            id3Data.setPosition(i2);
        }
    }

    private static GeobFrame i(ParsableByteArray id3Data, int frameSize) throws UnsupportedEncodingException {
        int unsignedByte = id3Data.readUnsignedByte();
        String strS = s(unsignedByte);
        int i2 = frameSize - 1;
        byte[] bArr = new byte[i2];
        id3Data.readBytes(bArr, 0, i2);
        int iV = v(bArr, 0);
        String str = new String(bArr, 0, iV, "ISO-8859-1");
        int i3 = iV + 1;
        int iU = u(bArr, i3, unsignedByte);
        String strM = m(bArr, i3, iU, strS);
        int iR = iU + r(unsignedByte);
        int iU2 = u(bArr, iR, unsignedByte);
        return new GeobFrame(str, strM, m(bArr, iR, iU2, strS), b(bArr, iU2 + r(unsignedByte), i2));
    }

    @Nullable
    private static a j(ParsableByteArray data) {
        if (data.bytesLeft() < 10) {
            Log.w(b, "Data too short to be an ID3 tag");
            return null;
        }
        int unsignedInt24 = data.readUnsignedInt24();
        boolean z = false;
        if (unsignedInt24 != 4801587) {
            String strValueOf = String.valueOf(String.format("%06X", Integer.valueOf(unsignedInt24)));
            Log.w(b, strValueOf.length() != 0 ? "Unexpected first three bytes of ID3 tag header: 0x".concat(strValueOf) : new String("Unexpected first three bytes of ID3 tag header: 0x"));
            return null;
        }
        int unsignedByte = data.readUnsignedByte();
        data.skipBytes(1);
        int unsignedByte2 = data.readUnsignedByte();
        int synchSafeInt = data.readSynchSafeInt();
        if (unsignedByte == 2) {
            if ((unsignedByte2 & 64) != 0) {
                Log.w(b, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (unsignedByte == 3) {
            if ((unsignedByte2 & 64) != 0) {
                int i2 = data.readInt();
                data.skipBytes(i2);
                synchSafeInt -= i2 + 4;
            }
        } else {
            if (unsignedByte != 4) {
                StringBuilder sb = new StringBuilder(57);
                sb.append("Skipped ID3 tag with unsupported majorVersion=");
                sb.append(unsignedByte);
                Log.w(b, sb.toString());
                return null;
            }
            if ((unsignedByte2 & 64) != 0) {
                int synchSafeInt2 = data.readSynchSafeInt();
                data.skipBytes(synchSafeInt2 - 4);
                synchSafeInt -= synchSafeInt2;
            }
            if ((unsignedByte2 & 16) != 0) {
                synchSafeInt -= 10;
            }
        }
        if (unsignedByte < 4 && (unsignedByte2 & 128) != 0) {
            z = true;
        }
        return new a(unsignedByte, z, synchSafeInt);
    }

    private static MlltFrame k(ParsableByteArray id3Data, int frameSize) {
        int unsignedShort = id3Data.readUnsignedShort();
        int unsignedInt24 = id3Data.readUnsignedInt24();
        int unsignedInt25 = id3Data.readUnsignedInt24();
        int unsignedByte = id3Data.readUnsignedByte();
        int unsignedByte2 = id3Data.readUnsignedByte();
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(id3Data);
        int i2 = ((frameSize - 10) * 8) / (unsignedByte + unsignedByte2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int bits = parsableBitArray.readBits(unsignedByte);
            int bits2 = parsableBitArray.readBits(unsignedByte2);
            iArr[i3] = bits;
            iArr2[i3] = bits2;
        }
        return new MlltFrame(unsignedShort, unsignedInt24, unsignedInt25, iArr, iArr2);
    }

    private static PrivFrame l(ParsableByteArray id3Data, int frameSize) throws UnsupportedEncodingException {
        byte[] bArr = new byte[frameSize];
        id3Data.readBytes(bArr, 0, frameSize);
        int iV = v(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iV, "ISO-8859-1"), b(bArr, iV + 1, frameSize));
    }

    private static String m(byte[] data, int from, int to, String charsetName) throws UnsupportedEncodingException {
        return (to <= from || to > data.length) ? "" : new String(data, from, to - from, charsetName);
    }

    @Nullable
    private static TextInformationFrame n(ParsableByteArray id3Data, int frameSize, String id) throws UnsupportedEncodingException {
        if (frameSize < 1) {
            return null;
        }
        int unsignedByte = id3Data.readUnsignedByte();
        String strS = s(unsignedByte);
        int i2 = frameSize - 1;
        byte[] bArr = new byte[i2];
        id3Data.readBytes(bArr, 0, i2);
        return new TextInformationFrame(id, null, new String(bArr, 0, u(bArr, 0, unsignedByte), strS));
    }

    @Nullable
    private static TextInformationFrame o(ParsableByteArray id3Data, int frameSize) throws UnsupportedEncodingException {
        if (frameSize < 1) {
            return null;
        }
        int unsignedByte = id3Data.readUnsignedByte();
        String strS = s(unsignedByte);
        int i2 = frameSize - 1;
        byte[] bArr = new byte[i2];
        id3Data.readBytes(bArr, 0, i2);
        int iU = u(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iU, strS);
        int iR = iU + r(unsignedByte);
        return new TextInformationFrame("TXXX", str, m(bArr, iR, u(bArr, iR, unsignedByte), strS));
    }

    private static UrlLinkFrame p(ParsableByteArray id3Data, int frameSize, String id) throws UnsupportedEncodingException {
        byte[] bArr = new byte[frameSize];
        id3Data.readBytes(bArr, 0, frameSize);
        return new UrlLinkFrame(id, null, new String(bArr, 0, v(bArr, 0), "ISO-8859-1"));
    }

    @Nullable
    private static UrlLinkFrame q(ParsableByteArray id3Data, int frameSize) throws UnsupportedEncodingException {
        if (frameSize < 1) {
            return null;
        }
        int unsignedByte = id3Data.readUnsignedByte();
        String strS = s(unsignedByte);
        int i2 = frameSize - 1;
        byte[] bArr = new byte[i2];
        id3Data.readBytes(bArr, 0, i2);
        int iU = u(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iU, strS);
        int iR = iU + r(unsignedByte);
        return new UrlLinkFrame("WXXX", str, m(bArr, iR, v(bArr, iR), "ISO-8859-1"));
    }

    private static int r(int encodingByte) {
        return (encodingByte == 0 || encodingByte == 3) ? 1 : 2;
    }

    private static String s(int encodingByte) {
        if (encodingByte == 1) {
            return "UTF-16";
        }
        if (encodingByte != 2) {
            return encodingByte != 3 ? "ISO-8859-1" : "UTF-8";
        }
        return "UTF-16BE";
    }

    private static String t(int majorVersion, int frameId0, int frameId1, int frameId2, int frameId3) {
        return majorVersion == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(frameId0), Integer.valueOf(frameId1), Integer.valueOf(frameId2)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(frameId0), Integer.valueOf(frameId1), Integer.valueOf(frameId2), Integer.valueOf(frameId3));
    }

    private static int u(byte[] data, int fromIndex, int encoding) {
        int iV = v(data, fromIndex);
        if (encoding == 0 || encoding == 3) {
            return iV;
        }
        while (iV < data.length - 1) {
            if (iV % 2 == 0 && data[iV + 1] == 0) {
                return iV;
            }
            iV = v(data, iV + 1);
        }
        return data.length;
    }

    private static int v(byte[] data, int fromIndex) {
        while (fromIndex < data.length) {
            if (data[fromIndex] == 0) {
                return fromIndex;
            }
            fromIndex++;
        }
        return data.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean w(int i2, int i3, int i4, int i5, int i6) {
        return false;
    }

    private static int x(ParsableByteArray data, int length) {
        byte[] data2 = data.getData();
        int position = data.getPosition();
        int i2 = position;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= position + length) {
                return length;
            }
            if ((data2[i2] & 255) == 255 && data2[i3] == 0) {
                System.arraycopy(data2, i2 + 2, data2, i3, (length - (i2 - position)) - 2);
                length--;
            }
            i2 = i3;
        }
    }

    private static boolean y(ParsableByteArray id3Data, int majorVersion, int frameHeaderSize, boolean unsignedIntFrameSizeHack) {
        int unsignedInt24;
        long unsignedInt25;
        int unsignedShort;
        int i2;
        int position = id3Data.getPosition();
        while (true) {
            try {
                boolean z = true;
                if (id3Data.bytesLeft() < frameHeaderSize) {
                    id3Data.setPosition(position);
                    return true;
                }
                if (majorVersion >= 3) {
                    unsignedInt24 = id3Data.readInt();
                    unsignedInt25 = id3Data.readUnsignedInt();
                    unsignedShort = id3Data.readUnsignedShort();
                } else {
                    unsignedInt24 = id3Data.readUnsignedInt24();
                    unsignedInt25 = id3Data.readUnsignedInt24();
                    unsignedShort = 0;
                }
                if (unsignedInt24 == 0 && unsignedInt25 == 0 && unsignedShort == 0) {
                    id3Data.setPosition(position);
                    return true;
                }
                if (majorVersion == 4 && !unsignedIntFrameSizeHack) {
                    if ((8421504 & unsignedInt25) != 0) {
                        id3Data.setPosition(position);
                        return false;
                    }
                    unsignedInt25 = (((unsignedInt25 >> 24) & 255) << 21) | (unsignedInt25 & 255) | (((unsignedInt25 >> 8) & 255) << 7) | (((unsignedInt25 >> 16) & 255) << 14);
                }
                if (majorVersion == 4) {
                    i2 = (unsignedShort & 64) != 0 ? 1 : 0;
                    if ((unsignedShort & 1) == 0) {
                        z = false;
                    }
                } else {
                    if (majorVersion == 3) {
                        i2 = (unsignedShort & 32) != 0 ? 1 : 0;
                        if ((unsignedShort & 128) == 0) {
                        }
                    } else {
                        i2 = 0;
                    }
                    z = false;
                }
                if (z) {
                    i2 += 4;
                }
                if (unsignedInt25 < i2) {
                    id3Data.setPosition(position);
                    return false;
                }
                if (id3Data.bytesLeft() < unsignedInt25) {
                    id3Data.setPosition(position);
                    return false;
                }
                id3Data.skipBytes((int) unsignedInt25);
            } catch (Throwable th) {
                id3Data.setPosition(position);
                throw th;
            }
        }
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    @Nullable
    public Metadata decode(MetadataInputBuffer inputBuffer, ByteBuffer buffer) {
        return decode(buffer.array(), buffer.limit());
    }

    public Id3Decoder(@Nullable FramePredicate framePredicate) {
        this.a = framePredicate;
    }

    @Nullable
    public Metadata decode(byte[] data, int size) {
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(data, size);
        a aVarJ = j(parsableByteArray);
        if (aVarJ == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i2 = aVarJ.a == 2 ? 6 : 10;
        int iX = aVarJ.c;
        if (aVarJ.b) {
            iX = x(parsableByteArray, aVarJ.c);
        }
        parsableByteArray.setLimit(position + iX);
        boolean z = false;
        if (!y(parsableByteArray, aVarJ.a, i2, false)) {
            if (aVarJ.a != 4 || !y(parsableByteArray, 4, i2, true)) {
                int i3 = aVarJ.a;
                StringBuilder sb = new StringBuilder(56);
                sb.append("Failed to validate ID3 tag with majorVersion=");
                sb.append(i3);
                Log.w(b, sb.toString());
                return null;
            }
            z = true;
        }
        while (parsableByteArray.bytesLeft() >= i2) {
            Id3Frame id3FrameH = h(aVarJ.a, parsableByteArray, z, i2, this.a);
            if (id3FrameH != null) {
                arrayList.add(id3FrameH);
            }
        }
        return new Metadata(arrayList);
    }
}
