package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class b {
    private static final String a = "AtomParsers";
    private static final int b = 1668047728;
    private static final int c = 1835299937;
    private static final int d = 1835365473;
    private static final int e = 1852009571;
    private static final int f = 1852009592;
    private static final int g = 1935832172;
    private static final int h = 1936684398;
    private static final int i = 1937072756;
    private static final int j = 1952807028;
    private static final int k = 1986618469;
    private static final int l = 4;
    private static final byte[] m = Util.getUtf8Bytes("OpusHead");

    public static final class a {
        public final int a;
        public int b;
        public int c;
        public long d;
        private final boolean e;
        private final ParsableByteArray f;
        private final ParsableByteArray g;
        private int h;
        private int i;

        public a(ParsableByteArray stsc, ParsableByteArray chunkOffsets, boolean chunkOffsetsAreLongs) throws ParserException {
            this.g = stsc;
            this.f = chunkOffsets;
            this.e = chunkOffsetsAreLongs;
            chunkOffsets.setPosition(12);
            this.a = chunkOffsets.readUnsignedIntToInt();
            stsc.setPosition(12);
            this.i = stsc.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(stsc.readInt() == 1, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            int i = this.b + 1;
            this.b = i;
            if (i == this.a) {
                return false;
            }
            this.d = this.e ? this.f.readUnsignedLongToLong() : this.f.readUnsignedInt();
            if (this.b == this.h) {
                this.c = this.g.readUnsignedIntToInt();
                this.g.skipBytes(4);
                int i2 = this.i - 1;
                this.i = i2;
                this.h = i2 > 0 ? this.g.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.b$b, reason: collision with other inner class name */
    public interface InterfaceC0148b {
        int a();

        int b();

        int c();
    }

    public static final class c {
        public static final int e = 8;
        public final TrackEncryptionBox[] a;

        @Nullable
        public Format b;
        public int c;
        public int d = 0;

        public c(int numberOfEntries) {
            this.a = new TrackEncryptionBox[numberOfEntries];
        }
    }

    public static final class d implements InterfaceC0148b {
        private final int a;
        private final int b;
        private final ParsableByteArray c;

        public d(com.google.android.exoplayer2.extractor.mp4.a.b stszAtom, Format trackFormat) {
            ParsableByteArray parsableByteArray = stszAtom.y1;
            this.c = parsableByteArray;
            parsableByteArray.setPosition(12);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (MimeTypes.AUDIO_RAW.equals(trackFormat.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(trackFormat.pcmEncoding, trackFormat.channelCount);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    StringBuilder sb = new StringBuilder(88);
                    sb.append("Audio sample size mismatch. stsd sample size: ");
                    sb.append(pcmFrameSize);
                    sb.append(", stsz sample size: ");
                    sb.append(unsignedIntToInt);
                    Log.w(b.a, sb.toString());
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.a = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.b = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.InterfaceC0148b
        public int a() {
            int i = this.a;
            return i == -1 ? this.c.readUnsignedIntToInt() : i;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.InterfaceC0148b
        public int b() {
            return this.b;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.InterfaceC0148b
        public int c() {
            return this.a;
        }
    }

    public static final class e implements InterfaceC0148b {
        private final ParsableByteArray a;
        private final int b;
        private final int c;
        private int d;
        private int e;

        public e(com.google.android.exoplayer2.extractor.mp4.a.b stz2Atom) {
            ParsableByteArray parsableByteArray = stz2Atom.y1;
            this.a = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.c = parsableByteArray.readUnsignedIntToInt() & 255;
            this.b = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.InterfaceC0148b
        public int a() {
            int i = this.c;
            if (i == 8) {
                return this.a.readUnsignedByte();
            }
            if (i == 16) {
                return this.a.readUnsignedShort();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.e & 15;
            }
            int unsignedByte = this.a.readUnsignedByte();
            this.e = unsignedByte;
            return (unsignedByte & 240) >> 4;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.InterfaceC0148b
        public int b() {
            return this.b;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.InterfaceC0148b
        public int c() {
            return -1;
        }
    }

    public static final class f {
        private final int a;
        private final long b;
        private final int c;

        public f(int id, long duration, int rotationDegrees) {
            this.a = id;
            this.b = duration;
            this.c = rotationDegrees;
        }
    }

    private b() {
    }

    public static Pair<Metadata, Metadata> A(com.google.android.exoplayer2.extractor.mp4.a.b udtaAtom) {
        ParsableByteArray parsableByteArray = udtaAtom.y1;
        parsableByteArray.setPosition(8);
        Metadata metadataB = null;
        Metadata metadataT = null;
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i2 = parsableByteArray.readInt();
            int i3 = parsableByteArray.readInt();
            if (i3 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadataB = B(parsableByteArray, position + i2);
            } else if (i3 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadataT = t(parsableByteArray, position + i2);
            }
            parsableByteArray.setPosition(position + i2);
        }
        return Pair.create(metadataB, metadataT);
    }

    @Nullable
    private static Metadata B(ParsableByteArray meta, int limit) {
        meta.skipBytes(8);
        d(meta);
        while (meta.getPosition() < limit) {
            int position = meta.getPosition();
            int i2 = meta.readInt();
            if (meta.readInt() == 1768715124) {
                meta.setPosition(position);
                return k(meta, position + i2);
            }
            meta.setPosition(position + i2);
        }
        return null;
    }

    private static void C(ParsableByteArray parent, int atomType, int position, int size, int trackId, int rotationDegrees, @Nullable DrmInitData drmInitData, c out, int entryIndex) throws ParserException {
        String str;
        DrmInitData drmInitData2;
        String str2;
        ParsableByteArray parsableByteArray = parent;
        int i2 = position;
        int i3 = size;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i2 + 8 + 8);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parent.readUnsignedShort();
        int unsignedShort2 = parent.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position2 = parent.getPosition();
        int iIntValue = atomType;
        if (iIntValue == 1701733238) {
            Pair<Integer, TrackEncryptionBox> pairR = r(parsableByteArray, i2, i3);
            if (pairR != null) {
                iIntValue = ((Integer) pairR.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) pairR.second).schemeType);
                out.a[entryIndex] = (TrackEncryptionBox) pairR.second;
            }
            parsableByteArray.setPosition(position2);
        }
        String str3 = MimeTypes.VIDEO_H263;
        if (iIntValue == 1831958048) {
            str = MimeTypes.VIDEO_MPEG;
        } else {
            str = iIntValue == 1211250227 ? MimeTypes.VIDEO_H263 : null;
        }
        int i4 = -1;
        float fP = 1.0f;
        String str4 = null;
        List<byte[]> listOf = null;
        byte[] bArrQ = null;
        ColorInfo colorInfo = null;
        boolean z = false;
        while (true) {
            if (position2 - i2 >= i3) {
                drmInitData2 = drmInitDataCopyWithSchemeType;
                break;
            }
            parsableByteArray.setPosition(position2);
            int position3 = parent.getPosition();
            String str5 = str3;
            int i5 = parent.readInt();
            if (i5 == 0) {
                drmInitData2 = drmInitDataCopyWithSchemeType;
                if (parent.getPosition() - i2 == i3) {
                    break;
                }
            } else {
                drmInitData2 = drmInitDataCopyWithSchemeType;
            }
            ExtractorUtil.checkContainerInput(i5 > 0, "childAtomSize must be positive");
            int i6 = parent.readInt();
            if (i6 == 1635148611) {
                ExtractorUtil.checkContainerInput(str == null, null);
                parsableByteArray.setPosition(position3 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parent);
                listOf = avcConfig.initializationData;
                out.c = avcConfig.nalUnitLengthFieldLength;
                if (!z) {
                    fP = avcConfig.pixelWidthAspectRatio;
                }
                str4 = avcConfig.codecs;
                str2 = MimeTypes.VIDEO_H264;
            } else if (i6 == 1752589123) {
                ExtractorUtil.checkContainerInput(str == null, null);
                parsableByteArray.setPosition(position3 + 8);
                HevcConfig hevcConfig = HevcConfig.parse(parent);
                listOf = hevcConfig.initializationData;
                out.c = hevcConfig.nalUnitLengthFieldLength;
                str4 = hevcConfig.codecs;
                str2 = MimeTypes.VIDEO_H265;
            } else {
                if (i6 == 1685480259 || i6 == 1685485123) {
                    DolbyVisionConfig dolbyVisionConfig = DolbyVisionConfig.parse(parent);
                    if (dolbyVisionConfig != null) {
                        str4 = dolbyVisionConfig.codecs;
                        str = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                } else if (i6 == 1987076931) {
                    ExtractorUtil.checkContainerInput(str == null, null);
                    str2 = iIntValue == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                } else if (i6 == 1635135811) {
                    ExtractorUtil.checkContainerInput(str == null, null);
                    str = MimeTypes.VIDEO_AV1;
                } else if (i6 == 1681012275) {
                    ExtractorUtil.checkContainerInput(str == null, null);
                    str = str5;
                } else if (i6 == 1702061171) {
                    ExtractorUtil.checkContainerInput(str == null, null);
                    Pair<String, byte[]> pairH = h(parsableByteArray, position3);
                    String str6 = (String) pairH.first;
                    byte[] bArr = (byte[]) pairH.second;
                    if (bArr != null) {
                        listOf = ImmutableList.of(bArr);
                    }
                    str = str6;
                } else if (i6 == 1885434736) {
                    fP = p(parsableByteArray, position3);
                    z = true;
                } else if (i6 == 1937126244) {
                    bArrQ = q(parsableByteArray, position3, i5);
                } else if (i6 == 1936995172) {
                    int unsignedByte = parent.readUnsignedByte();
                    parsableByteArray.skipBytes(3);
                    if (unsignedByte == 0) {
                        int unsignedByte2 = parent.readUnsignedByte();
                        if (unsignedByte2 == 0) {
                            i4 = 0;
                        } else if (unsignedByte2 == 1) {
                            i4 = 1;
                        } else if (unsignedByte2 == 2) {
                            i4 = 2;
                        } else if (unsignedByte2 == 3) {
                            i4 = 3;
                        }
                    }
                } else if (i6 == 1668246642) {
                    int i7 = parent.readInt();
                    boolean z2 = i7 == f;
                    if (z2 || i7 == e) {
                        int unsignedShort3 = parent.readUnsignedShort();
                        int unsignedShort4 = parent.readUnsignedShort();
                        parsableByteArray.skipBytes(2);
                        colorInfo = new ColorInfo(ColorInfo.isoColorPrimariesToColorSpace(unsignedShort3), z2 && (parent.readUnsignedByte() & 128) != 0 ? 1 : 2, ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedShort4), null);
                    } else {
                        String strValueOf = String.valueOf(com.google.android.exoplayer2.extractor.mp4.a.a(i7));
                        Log.w(a, strValueOf.length() != 0 ? "Unsupported color type: ".concat(strValueOf) : new String("Unsupported color type: "));
                    }
                }
                position2 += i5;
                parsableByteArray = parent;
                i2 = position;
                i3 = size;
                str3 = str5;
                drmInitDataCopyWithSchemeType = drmInitData2;
            }
            str = str2;
            position2 += i5;
            parsableByteArray = parent;
            i2 = position;
            i3 = size;
            str3 = str5;
            drmInitDataCopyWithSchemeType = drmInitData2;
        }
        if (str == null) {
            return;
        }
        out.b = new Format.Builder().setId(trackId).setSampleMimeType(str).setCodecs(str4).setWidth(unsignedShort).setHeight(unsignedShort2).setPixelWidthHeightRatio(fP).setRotationDegrees(rotationDegrees).setProjectionData(bArrQ).setStereoMode(i4).setInitializationData(listOf).setDrmInitData(drmInitData2).setColorInfo(colorInfo).build();
    }

    private static boolean a(long[] timestamps, long duration, long editStartTime, long editEndTime) {
        int length = timestamps.length - 1;
        return timestamps[0] <= editStartTime && editStartTime < timestamps[Util.constrainValue(4, 0, length)] && timestamps[Util.constrainValue(timestamps.length - 4, 0, length)] < editEndTime && editEndTime <= duration;
    }

    private static int b(ParsableByteArray parent, int position, int size) throws ParserException {
        int position2 = parent.getPosition();
        while (position2 - position < size) {
            parent.setPosition(position2);
            int i2 = parent.readInt();
            ExtractorUtil.checkContainerInput(i2 > 0, "childAtomSize must be positive");
            if (parent.readInt() == 1702061171) {
                return position2;
            }
            position2 += i2;
        }
        return -1;
    }

    private static int c(int hdlr) {
        if (hdlr == h) {
            return 1;
        }
        if (hdlr == k) {
            return 2;
        }
        if (hdlr == j || hdlr == g || hdlr == i || hdlr == b) {
            return 3;
        }
        return hdlr == 1835365473 ? 5 : -1;
    }

    public static void d(ParsableByteArray meta) {
        int position = meta.getPosition();
        meta.skipBytes(4);
        if (meta.readInt() != 1751411826) {
            position += 4;
        }
        meta.setPosition(position);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x015b  */
    /* JADX WARN: Code duplicated, block: B:105:0x016a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0185  */
    /* JADX WARN: Code duplicated, block: B:138:0x0289  */
    /* JADX WARN: Code duplicated, block: B:140:0x0293  */
    /* JADX WARN: Code duplicated, block: B:141:0x0295  */
    /* JADX WARN: Code duplicated, block: B:144:0x029c  */
    /* JADX WARN: Code duplicated, block: B:146:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:148:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0151  */
    private static void e(ParsableByteArray parent, int atomType, int position, int size, int trackId, String language, boolean isQuickTime, @Nullable DrmInitData drmInitData, c out, int entryIndex) throws ParserException {
        int unsignedShort;
        int iIntValue;
        int unsignedIntToInt;
        DrmInitData drmInitDataCopyWithSchemeType;
        int i2;
        String str;
        String str2;
        List<byte[]> listOf;
        int i3;
        int i4;
        int iB;
        byte[] bArr;
        List<byte[]> listBuildInitializationData;
        int i5 = position;
        int i6 = size;
        parent.setPosition(i5 + 8 + 8);
        if (isQuickTime) {
            unsignedShort = parent.readUnsignedShort();
            parent.skipBytes(6);
        } else {
            parent.skipBytes(8);
            unsignedShort = 0;
        }
        boolean z = true;
        if (unsignedShort == 0 || unsignedShort == 1) {
            int unsignedShort2 = parent.readUnsignedShort();
            parent.skipBytes(6);
            int unsignedFixedPoint1616 = parent.readUnsignedFixedPoint1616();
            if (unsignedShort == 1) {
                parent.skipBytes(16);
            }
            iIntValue = unsignedFixedPoint1616;
            unsignedIntToInt = unsignedShort2;
        } else {
            if (unsignedShort != 2) {
                return;
            }
            parent.skipBytes(16);
            iIntValue = (int) Math.round(parent.readDouble());
            unsignedIntToInt = parent.readUnsignedIntToInt();
            parent.skipBytes(20);
        }
        int position2 = parent.getPosition();
        int iIntValue2 = atomType;
        if (iIntValue2 == 1701733217) {
            Pair<Integer, TrackEncryptionBox> pairR = r(parent, i5, i6);
            if (pairR != null) {
                iIntValue2 = ((Integer) pairR.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitData == null ? null : drmInitData.copyWithSchemeType(((TrackEncryptionBox) pairR.second).schemeType);
                out.a[entryIndex] = (TrackEncryptionBox) pairR.second;
            } else {
                drmInitDataCopyWithSchemeType = drmInitData;
            }
            parent.setPosition(position2);
        } else {
            drmInitDataCopyWithSchemeType = drmInitData;
        }
        String str3 = MimeTypes.AUDIO_RAW;
        if (iIntValue2 == 1633889587) {
            str3 = MimeTypes.AUDIO_AC3;
        } else if (iIntValue2 == 1700998451) {
            str3 = MimeTypes.AUDIO_E_AC3;
        } else if (iIntValue2 == 1633889588) {
            str3 = MimeTypes.AUDIO_AC4;
        } else if (iIntValue2 == 1685353315) {
            str3 = MimeTypes.AUDIO_DTS;
        } else if (iIntValue2 == 1685353320 || iIntValue2 == 1685353324) {
            str3 = MimeTypes.AUDIO_DTS_HD;
        } else if (iIntValue2 == 1685353317) {
            str3 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (iIntValue2 == 1685353336) {
            str3 = MimeTypes.AUDIO_DTS_UHD;
        } else if (iIntValue2 == 1935764850) {
            str3 = MimeTypes.AUDIO_AMR_NB;
        } else {
            if (iIntValue2 != 1935767394) {
                if (iIntValue2 == 1819304813 || iIntValue2 == 1936684916) {
                    i2 = 2;
                } else if (iIntValue2 == 1953984371) {
                    i2 = 268435456;
                } else if (iIntValue2 == 778924082 || iIntValue2 == 778924083) {
                    str3 = MimeTypes.AUDIO_MPEG;
                } else if (iIntValue2 == 1835557169) {
                    str3 = MimeTypes.AUDIO_MPEGH_MHA1;
                } else if (iIntValue2 == 1835560241) {
                    str3 = MimeTypes.AUDIO_MPEGH_MHM1;
                } else if (iIntValue2 == 1634492771) {
                    str3 = MimeTypes.AUDIO_ALAC;
                } else if (iIntValue2 == 1634492791) {
                    str3 = MimeTypes.AUDIO_ALAW;
                } else if (iIntValue2 == 1970037111) {
                    str3 = MimeTypes.AUDIO_MLAW;
                } else if (iIntValue2 == 1332770163) {
                    str3 = MimeTypes.AUDIO_OPUS;
                } else if (iIntValue2 == 1716281667) {
                    str3 = MimeTypes.AUDIO_FLAC;
                } else {
                    i2 = -1;
                    str3 = null;
                }
                str = str3;
                str2 = null;
                listOf = null;
                while (position2 - i5 < i6) {
                    parent.setPosition(position2);
                    i3 = parent.readInt();
                    if (i3 <= 0) {
                        z = false;
                    }
                    ExtractorUtil.checkContainerInput(z, "childAtomSize must be positive");
                    i4 = parent.readInt();
                    if (i4 == 1835557187) {
                        int i7 = i3 - 13;
                        byte[] bArr2 = new byte[i7];
                        parent.setPosition(position2 + 13);
                        parent.readBytes(bArr2, 0, i7);
                        listBuildInitializationData = ImmutableList.of(bArr2);
                    } else {
                        if (i4 != 1702061171 || (isQuickTime && i4 == 2002876005)) {
                            z = true;
                            if (i4 == 1702061171) {
                                iB = position2;
                            } else {
                                iB = b(parent, position2, i3);
                            }
                            if (iB != -1) {
                                Pair<String, byte[]> pairH = h(parent, iB);
                                str = (String) pairH.first;
                                bArr = (byte[]) pairH.second;
                                if (bArr != null) {
                                    if (MimeTypes.AUDIO_AAC.equals(str)) {
                                        AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr);
                                        iIntValue = audioSpecificConfig.sampleRateHz;
                                        unsignedIntToInt = audioSpecificConfig.channelCount;
                                        str2 = audioSpecificConfig.codecs;
                                    }
                                    listOf = ImmutableList.of(bArr);
                                }
                            }
                        } else {
                            if (i4 == 1684103987) {
                                parent.setPosition(position2 + 8);
                                out.b = Ac3Util.parseAc3AnnexFFormat(parent, Integer.toString(trackId), language, drmInitDataCopyWithSchemeType);
                            } else if (i4 == 1684366131) {
                                parent.setPosition(position2 + 8);
                                out.b = Ac3Util.parseEAc3AnnexFFormat(parent, Integer.toString(trackId), language, drmInitDataCopyWithSchemeType);
                            } else if (i4 == 1684103988) {
                                parent.setPosition(position2 + 8);
                                out.b = Ac4Util.parseAc4AnnexEFormat(parent, Integer.toString(trackId), language, drmInitDataCopyWithSchemeType);
                            } else if (i4 == 1684305011) {
                                out.b = new Format.Builder().setId(trackId).setSampleMimeType(str).setChannelCount(unsignedIntToInt).setSampleRate(iIntValue).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(language).build();
                            } else if (i4 == 1682927731) {
                                int i8 = i3 - 8;
                                byte[] bArr3 = m;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i8);
                                parent.setPosition(position2 + 8);
                                parent.readBytes(bArrCopyOf, bArr3.length, i8);
                                listBuildInitializationData = OpusUtil.buildInitializationData(bArrCopyOf);
                            } else if (i4 == 1684425825) {
                                int i9 = i3 - 12;
                                byte[] bArr4 = new byte[i9 + 4];
                                bArr4[0] = 102;
                                z = true;
                                bArr4[1] = 76;
                                bArr4[2] = 97;
                                bArr4[3] = org.threeten.bp.a.m;
                                parent.setPosition(position2 + 12);
                                parent.readBytes(bArr4, 4, i9);
                                listOf = ImmutableList.of(bArr4);
                            } else {
                                z = true;
                                if (i4 == 1634492771) {
                                    int i10 = i3 - 12;
                                    byte[] bArr5 = new byte[i10];
                                    parent.setPosition(position2 + 12);
                                    parent.readBytes(bArr5, 0, i10);
                                    Pair<Integer, Integer> alacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr5);
                                    iIntValue = ((Integer) alacAudioSpecificConfig.first).intValue();
                                    int iIntValue3 = ((Integer) alacAudioSpecificConfig.second).intValue();
                                    listOf = ImmutableList.of(bArr5);
                                    unsignedIntToInt = iIntValue3;
                                }
                            }
                            z = true;
                        }
                        position2 += i3;
                        i5 = position;
                        i6 = size;
                    }
                    listOf = listBuildInitializationData;
                    z = true;
                    position2 += i3;
                    i5 = position;
                    i6 = size;
                }
                if (out.b == null || str == null) {
                }
                out.b = new Format.Builder().setId(trackId).setSampleMimeType(str).setCodecs(str2).setChannelCount(unsignedIntToInt).setSampleRate(iIntValue).setPcmEncoding(i2).setInitializationData(listOf).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(language).build();
                return;
            }
            str3 = MimeTypes.AUDIO_AMR_WB;
        }
        i2 = -1;
        str = str3;
        str2 = null;
        listOf = null;
        while (position2 - i5 < i6) {
            parent.setPosition(position2);
            i3 = parent.readInt();
            if (i3 <= 0) {
                z = false;
            }
            ExtractorUtil.checkContainerInput(z, "childAtomSize must be positive");
            i4 = parent.readInt();
            if (i4 == 1835557187) {
                int i11 = i3 - 13;
                byte[] bArr6 = new byte[i11];
                parent.setPosition(position2 + 13);
                parent.readBytes(bArr6, 0, i11);
                listBuildInitializationData = ImmutableList.of(bArr6);
            } else {
                if (i4 != 1702061171) {
                    z = true;
                    if (i4 == 1702061171) {
                        iB = position2;
                    } else {
                        iB = b(parent, position2, i3);
                    }
                    if (iB != -1) {
                        Pair<String, byte[]> pairH2 = h(parent, iB);
                        str = (String) pairH2.first;
                        bArr = (byte[]) pairH2.second;
                        if (bArr != null) {
                            if (MimeTypes.AUDIO_AAC.equals(str)) {
                                AacUtil.Config audioSpecificConfig2 = AacUtil.parseAudioSpecificConfig(bArr);
                                iIntValue = audioSpecificConfig2.sampleRateHz;
                                unsignedIntToInt = audioSpecificConfig2.channelCount;
                                str2 = audioSpecificConfig2.codecs;
                            }
                            listOf = ImmutableList.of(bArr);
                        }
                    }
                } else {
                    z = true;
                    if (i4 == 1702061171) {
                        iB = position2;
                    } else {
                        iB = b(parent, position2, i3);
                    }
                    if (iB != -1) {
                        Pair<String, byte[]> pairH3 = h(parent, iB);
                        str = (String) pairH3.first;
                        bArr = (byte[]) pairH3.second;
                        if (bArr != null) {
                            if (MimeTypes.AUDIO_AAC.equals(str)) {
                                AacUtil.Config audioSpecificConfig3 = AacUtil.parseAudioSpecificConfig(bArr);
                                iIntValue = audioSpecificConfig3.sampleRateHz;
                                unsignedIntToInt = audioSpecificConfig3.channelCount;
                                str2 = audioSpecificConfig3.codecs;
                            }
                            listOf = ImmutableList.of(bArr);
                        }
                    }
                }
                position2 += i3;
                i5 = position;
                i6 = size;
            }
            listOf = listBuildInitializationData;
            z = true;
            position2 += i3;
            i5 = position;
            i6 = size;
        }
        if (out.b == null) {
        }
    }

    @Nullable
    public static Pair<Integer, TrackEncryptionBox> f(ParsableByteArray parent, int position, int size) throws ParserException {
        int i2 = position + 8;
        String string = null;
        Integer numValueOf = null;
        int i3 = -1;
        int i4 = 0;
        while (i2 - position < size) {
            parent.setPosition(i2);
            int i5 = parent.readInt();
            int i6 = parent.readInt();
            if (i6 == 1718775137) {
                numValueOf = Integer.valueOf(parent.readInt());
            } else if (i6 == 1935894637) {
                parent.skipBytes(4);
                string = parent.readString(4);
            } else if (i6 == 1935894633) {
                i3 = i2;
                i4 = i5;
            }
            i2 += i5;
        }
        if (!C.CENC_TYPE_cenc.equals(string) && !C.CENC_TYPE_cbc1.equals(string) && !C.CENC_TYPE_cens.equals(string) && !C.CENC_TYPE_cbcs.equals(string)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i3 != -1, "schi atom is mandatory");
        TrackEncryptionBox trackEncryptionBoxS = s(parent, i3, i4, string);
        ExtractorUtil.checkContainerInput(trackEncryptionBoxS != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (TrackEncryptionBox) Util.castNonNull(trackEncryptionBoxS));
    }

    @Nullable
    private static Pair<long[], long[]> g(com.google.android.exoplayer2.extractor.mp4.a.C0147a edtsAtom) {
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH = edtsAtom.h(com.google.android.exoplayer2.extractor.mp4.a.r0);
        if (bVarH == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = bVarH.y1;
        parsableByteArray.setPosition(8);
        int iC = com.google.android.exoplayer2.extractor.mp4.a.c(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i2 = 0; i2 < unsignedIntToInt; i2++) {
            jArr[i2] = iC == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i2] = iC == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair<String, byte[]> h(ParsableByteArray parent, int position) {
        parent.setPosition(position + 8 + 4);
        parent.skipBytes(1);
        i(parent);
        parent.skipBytes(2);
        int unsignedByte = parent.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parent.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parent.skipBytes(parent.readUnsignedShort());
        }
        if ((unsignedByte & 32) != 0) {
            parent.skipBytes(2);
        }
        parent.skipBytes(1);
        i(parent);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parent.readUnsignedByte());
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return Pair.create(mimeTypeFromMp4ObjectType, null);
        }
        parent.skipBytes(12);
        parent.skipBytes(1);
        int i2 = i(parent);
        byte[] bArr = new byte[i2];
        parent.readBytes(bArr, 0, i2);
        return Pair.create(mimeTypeFromMp4ObjectType, bArr);
    }

    private static int i(ParsableByteArray data) {
        int unsignedByte = data.readUnsignedByte();
        int i2 = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = data.readUnsignedByte();
            i2 = (i2 << 7) | (unsignedByte & 127);
        }
        return i2;
    }

    private static int j(ParsableByteArray hdlr) {
        hdlr.setPosition(16);
        return hdlr.readInt();
    }

    @Nullable
    private static Metadata k(ParsableByteArray ilst, int limit) {
        ilst.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (ilst.getPosition() < limit) {
            Metadata.Entry entryC = com.google.android.exoplayer2.extractor.mp4.d.c(ilst);
            if (entryC != null) {
                arrayList.add(entryC);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Pair<Long, String> l(ParsableByteArray mdhd) {
        mdhd.setPosition(8);
        int iC = com.google.android.exoplayer2.extractor.mp4.a.c(mdhd.readInt());
        mdhd.skipBytes(iC == 0 ? 8 : 16);
        long unsignedInt = mdhd.readUnsignedInt();
        mdhd.skipBytes(iC == 0 ? 4 : 8);
        int unsignedShort = mdhd.readUnsignedShort();
        StringBuilder sb = new StringBuilder(3);
        sb.append((char) (((unsignedShort >> 10) & 31) + 96));
        sb.append((char) (((unsignedShort >> 5) & 31) + 96));
        sb.append((char) ((unsignedShort & 31) + 96));
        return Pair.create(Long.valueOf(unsignedInt), sb.toString());
    }

    @Nullable
    public static Metadata m(com.google.android.exoplayer2.extractor.mp4.a.C0147a meta) {
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH = meta.h(com.google.android.exoplayer2.extractor.mp4.a.t0);
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH2 = meta.h(com.google.android.exoplayer2.extractor.mp4.a.f1);
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH3 = meta.h(com.google.android.exoplayer2.extractor.mp4.a.g1);
        if (bVarH == null || bVarH2 == null || bVarH3 == null || j(bVarH.y1) != c) {
            return null;
        }
        ParsableByteArray parsableByteArray = bVarH2.y1;
        parsableByteArray.setPosition(12);
        int i2 = parsableByteArray.readInt();
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i3] = parsableByteArray.readString(i4 - 8);
        }
        ParsableByteArray parsableByteArray2 = bVarH3.y1;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int i5 = parsableByteArray2.readInt();
            int i6 = parsableByteArray2.readInt() - 1;
            if (i6 < 0 || i6 >= i2) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(i6);
                Log.w(a, sb.toString());
            } else {
                MdtaMetadataEntry mdtaMetadataEntryF = com.google.android.exoplayer2.extractor.mp4.d.f(parsableByteArray2, position + i5, strArr[i6]);
                if (mdtaMetadataEntryF != null) {
                    arrayList.add(mdtaMetadataEntryF);
                }
            }
            parsableByteArray2.setPosition(position + i5);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static void n(ParsableByteArray parent, int atomType, int position, int trackId, c out) {
        parent.setPosition(position + 8 + 8);
        if (atomType == 1835365492) {
            parent.readNullTerminatedString();
            String nullTerminatedString = parent.readNullTerminatedString();
            if (nullTerminatedString != null) {
                out.b = new Format.Builder().setId(trackId).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    private static long o(ParsableByteArray mvhd) {
        mvhd.setPosition(8);
        mvhd.skipBytes(com.google.android.exoplayer2.extractor.mp4.a.c(mvhd.readInt()) != 0 ? 16 : 8);
        return mvhd.readUnsignedInt();
    }

    private static float p(ParsableByteArray parent, int position) {
        parent.setPosition(position + 8);
        return parent.readUnsignedIntToInt() / parent.readUnsignedIntToInt();
    }

    @Nullable
    private static byte[] q(ParsableByteArray parent, int position, int size) {
        int i2 = position + 8;
        while (i2 - position < size) {
            parent.setPosition(i2);
            int i3 = parent.readInt();
            if (parent.readInt() == 1886547818) {
                return Arrays.copyOfRange(parent.getData(), i2, i3 + i2);
            }
            i2 += i3;
        }
        return null;
    }

    @Nullable
    private static Pair<Integer, TrackEncryptionBox> r(ParsableByteArray parent, int position, int size) throws ParserException {
        Pair<Integer, TrackEncryptionBox> pairF;
        int position2 = parent.getPosition();
        while (position2 - position < size) {
            parent.setPosition(position2);
            int i2 = parent.readInt();
            ExtractorUtil.checkContainerInput(i2 > 0, "childAtomSize must be positive");
            if (parent.readInt() == 1936289382 && (pairF = f(parent, position2, i2)) != null) {
                return pairF;
            }
            position2 += i2;
        }
        return null;
    }

    @Nullable
    private static TrackEncryptionBox s(ParsableByteArray parent, int position, int size, String schemeType) {
        int i2;
        int i3;
        int i4 = position + 8;
        while (true) {
            byte[] bArr = null;
            if (i4 - position >= size) {
                return null;
            }
            parent.setPosition(i4);
            int i5 = parent.readInt();
            if (parent.readInt() == 1952804451) {
                int iC = com.google.android.exoplayer2.extractor.mp4.a.c(parent.readInt());
                parent.skipBytes(1);
                if (iC == 0) {
                    parent.skipBytes(1);
                    i3 = 0;
                    i2 = 0;
                } else {
                    int unsignedByte = parent.readUnsignedByte();
                    i2 = unsignedByte & 15;
                    i3 = (unsignedByte & 240) >> 4;
                }
                boolean z = parent.readUnsignedByte() == 1;
                int unsignedByte2 = parent.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parent.readBytes(bArr2, 0, 16);
                if (z && unsignedByte2 == 0) {
                    int unsignedByte3 = parent.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parent.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z, schemeType, unsignedByte2, bArr2, i3, i2, bArr);
            }
            i4 += i5;
        }
    }

    @Nullable
    private static Metadata t(ParsableByteArray smta, int limit) {
        smta.skipBytes(12);
        while (smta.getPosition() < limit) {
            int position = smta.getPosition();
            int i2 = smta.readInt();
            if (smta.readInt() == 1935766900) {
                if (i2 < 14) {
                    return null;
                }
                smta.skipBytes(5);
                int unsignedByte = smta.readUnsignedByte();
                if (unsignedByte != 12 && unsignedByte != 13) {
                    return null;
                }
                float f2 = unsignedByte == 12 ? 240.0f : 120.0f;
                smta.skipBytes(1);
                return new Metadata(new SmtaMetadataEntry(f2, smta.readUnsignedByte()));
            }
            smta.setPosition(position + i2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x024d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0255  */
    /* JADX WARN: Code duplicated, block: B:111:0x0258  */
    /* JADX WARN: Code duplicated, block: B:116:0x02be  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:136:0x036c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0378  */
    /* JADX WARN: Code duplicated, block: B:150:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:151:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:155:0x03db  */
    /* JADX WARN: Code duplicated, block: B:157:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:160:0x040d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0426  */
    /* JADX WARN: Code duplicated, block: B:166:0x0428  */
    /* JADX WARN: Code duplicated, block: B:168:0x042f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0449  */
    /* JADX WARN: Code duplicated, block: B:176:0x044e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0451  */
    /* JADX WARN: Code duplicated, block: B:179:0x0454  */
    /* JADX WARN: Code duplicated, block: B:180:0x0457  */
    /* JADX WARN: Code duplicated, block: B:182:0x045b  */
    /* JADX WARN: Code duplicated, block: B:184:0x045f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0462  */
    /* JADX WARN: Code duplicated, block: B:189:0x046e  */
    /* JADX WARN: Code duplicated, block: B:191:0x047a  */
    /* JADX WARN: Code duplicated, block: B:192:0x048e  */
    /* JADX WARN: Code duplicated, block: B:195:0x049a  */
    /* JADX WARN: Code duplicated, block: B:197:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:208:0x043e A[EDGE_INSN: B:208:0x043e->B:170:0x043e BREAK  A[LOOP:2: B:153:0x03d6->B:169:0x0436], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x04d1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x017a A[EDGE_INSN: B:223:0x017a->B:63:0x017a BREAK  A[LOOP:7: B:59:0x015d->B:62:0x0165], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b A[LOOP:0: B:51:0x0105->B:53:0x010b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:58:0x0157  */
    /* JADX WARN: Code duplicated, block: B:60:0x015f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0165 A[LOOP:7: B:59:0x015d->B:62:0x0165, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x01a0 A[ADDED_TO_REGION, LOOP:8: B:67:0x01a0->B:69:0x01a4, LOOP_START, PHI: r16 r21 r22
      0x01a0: PHI (r16v10 int) = (r16v3 int), (r16v11 int) binds: [B:66:0x019e, B:69:0x01a4] A[DONT_GENERATE, DONT_INLINE]
      0x01a0: PHI (r21v5 int) = (r21v1 int), (r21v6 int) binds: [B:66:0x019e, B:69:0x01a4] A[DONT_GENERATE, DONT_INLINE]
      0x01a0: PHI (r22v3 int) = (r22v1 int), (r22v5 int) binds: [B:66:0x019e, B:69:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x0228 A[DONT_INVERT, LOOP:9: B:92:0x0228->B:96:0x0232, LOOP_START, PHI: r16
      0x0228: PHI (r16v7 int) = (r16v3 int), (r16v8 int) binds: [B:91:0x0226, B:96:0x0232] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x022a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0232 A[LOOP:9: B:92:0x0228->B:96:0x0232, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0238 A[EDGE_INSN: B:97:0x0238->B:98:0x0239 BREAK  A[LOOP:9: B:92:0x0228->B:96:0x0232]] */
    private static h u(Track track, com.google.android.exoplayer2.extractor.mp4.a.C0147a stblAtom, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        InterfaceC0148b eVar;
        boolean z;
        int unsignedIntToInt;
        int unsignedIntToInt2;
        int unsignedIntToInt3;
        int iC;
        boolean z2;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        int unsignedIntToInt4;
        int i2;
        int i3;
        int i4;
        int i5;
        int unsignedIntToInt5;
        long j2;
        long j3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z3;
        int i14;
        Track track2;
        String str;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        int i15;
        int i16;
        long j4;
        long[] jArr2;
        long j5;
        int i17;
        boolean zA;
        int i18;
        int i19;
        int i20;
        int unsignedIntToInt6;
        int i21;
        int i22;
        long jScaleLargeTimestamp;
        long[] jArr3;
        int i23;
        int[] iArr3;
        long j6;
        long[] jArr4;
        boolean z4;
        int[] iArr4;
        int[] iArr5;
        long[] jArr5;
        int i24;
        boolean z5;
        int i25;
        int i26;
        long[] jArr6;
        int[] iArr6;
        int i27;
        int i28;
        boolean z6;
        long[] jArr7;
        int[] iArr7;
        int[] iArr8;
        long[] jArr8;
        long j7;
        int i29;
        long j8;
        int i30;
        int i31;
        int[] iArr9;
        int[] iArr10;
        long j9;
        int[] iArr11;
        int i32;
        int i33;
        boolean z7;
        long[] jArr9;
        int[] iArr12;
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH = stblAtom.h(com.google.android.exoplayer2.extractor.mp4.a.R0);
        if (bVarH != null) {
            eVar = new d(bVarH, track.format);
        } else {
            com.google.android.exoplayer2.extractor.mp4.a.b bVarH2 = stblAtom.h(com.google.android.exoplayer2.extractor.mp4.a.S0);
            if (bVarH2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            eVar = new e(bVarH2);
        }
        int iB = eVar.b();
        if (iB == 0) {
            return new h(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH3 = stblAtom.h(com.google.android.exoplayer2.extractor.mp4.a.T0);
        if (bVarH3 == null) {
            bVarH3 = (com.google.android.exoplayer2.extractor.mp4.a.b) Assertions.checkNotNull(stblAtom.h(com.google.android.exoplayer2.extractor.mp4.a.U0));
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray = bVarH3.y1;
        ParsableByteArray parsableByteArray2 = ((com.google.android.exoplayer2.extractor.mp4.a.b) Assertions.checkNotNull(stblAtom.h(com.google.android.exoplayer2.extractor.mp4.a.Q0))).y1;
        ParsableByteArray parsableByteArray3 = ((com.google.android.exoplayer2.extractor.mp4.a.b) Assertions.checkNotNull(stblAtom.h(com.google.android.exoplayer2.extractor.mp4.a.N0))).y1;
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH4 = stblAtom.h(com.google.android.exoplayer2.extractor.mp4.a.O0);
        ParsableByteArray parsableByteArray4 = bVarH4 != null ? bVarH4.y1 : null;
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH5 = stblAtom.h(com.google.android.exoplayer2.extractor.mp4.a.P0);
        ParsableByteArray parsableByteArray5 = bVarH5 != null ? bVarH5.y1 : null;
        a aVar = new a(parsableByteArray2, parsableByteArray, z);
        parsableByteArray3.setPosition(12);
        int unsignedIntToInt7 = parsableByteArray3.readUnsignedIntToInt() - 1;
        int unsignedIntToInt8 = parsableByteArray3.readUnsignedIntToInt();
        int unsignedIntToInt9 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            unsignedIntToInt = parsableByteArray5.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            unsignedIntToInt2 = parsableByteArray4.readUnsignedIntToInt();
            if (unsignedIntToInt2 > 0) {
                unsignedIntToInt3 = parsableByteArray4.readUnsignedIntToInt() - 1;
            } else {
                parsableByteArray4 = null;
            }
            iC = eVar.c();
            String str2 = track.format.sampleMimeType;
            if (iC == -1 && ((MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2)) && unsignedIntToInt7 == 0 && unsignedIntToInt == 0 && unsignedIntToInt2 == 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i34 = aVar.a;
                jArr9 = new long[i34];
                iArr12 = new int[i34];
                while (aVar.a()) {
                    int i35 = aVar.b;
                    jArr9[i35] = aVar.d;
                    iArr12[i35] = aVar.c;
                }
                FixedSampleSizeRechunker.Results resultsA = FixedSampleSizeRechunker.a(iC, jArr9, iArr12, unsignedIntToInt9);
                long[] jArr10 = resultsA.offsets;
                int[] iArr13 = resultsA.sizes;
                int i36 = resultsA.maximumSize;
                long[] jArr11 = resultsA.timestamps;
                int[] iArr14 = resultsA.flags;
                long j10 = resultsA.duration;
                i16 = iB;
                jArr = jArr10;
                iArr = iArr13;
                i15 = i36;
                jArr2 = jArr11;
                iArr2 = iArr14;
                j4 = j10;
                track2 = track;
            } else {
                jArrCopyOf = new long[iB];
                iArrCopyOf = new int[iB];
                jArrCopyOf2 = new long[iB];
                iArrCopyOf2 = new int[iB];
                unsignedIntToInt4 = unsignedIntToInt3;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                unsignedIntToInt5 = 0;
                j2 = 0;
                j3 = 0;
                i6 = unsignedIntToInt;
                i7 = unsignedIntToInt9;
                i8 = unsignedIntToInt8;
                i9 = unsignedIntToInt7;
                i10 = unsignedIntToInt2;
                while (true) {
                    i11 = i9;
                    if (i2 < iB) {
                        i12 = i8;
                        i13 = i4;
                        break;
                    }
                    j5 = j3;
                    i17 = i4;
                    zA = true;
                    while (i17 == 0) {
                        zA = aVar.a();
                        if (zA) {
                            break;
                        }
                        int i37 = i8;
                        long j11 = aVar.d;
                        i17 = aVar.c;
                        j5 = j11;
                        i8 = i37;
                        i7 = i7;
                        iB = iB;
                    }
                    i18 = iB;
                    i12 = i8;
                    i19 = i7;
                    if (!zA) {
                        Log.w(a, "Unexpected end of chunk data");
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i2);
                        iB = i2;
                        i13 = i17;
                        break;
                    }
                    if (parsableByteArray5 != null) {
                        while (unsignedIntToInt5 == 0 && i6 > 0) {
                            unsignedIntToInt5 = parsableByteArray5.readUnsignedIntToInt();
                            i5 = parsableByteArray5.readInt();
                            i6--;
                        }
                        unsignedIntToInt5--;
                    }
                    int i38 = i5;
                    jArrCopyOf[i2] = j5;
                    iArrCopyOf[i2] = eVar.a();
                    if (iArrCopyOf[i2] > i3) {
                        i3 = iArrCopyOf[i2];
                    }
                    jArrCopyOf2[i2] = j2 + ((long) i38);
                    if (parsableByteArray4 == null) {
                        i20 = 1;
                    } else {
                        i20 = 0;
                    }
                    iArrCopyOf2[i2] = i20;
                    if (i2 == unsignedIntToInt4) {
                        iArrCopyOf2[i2] = 1;
                        i10--;
                        if (i10 > 0) {
                            unsignedIntToInt4 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray4)).readUnsignedIntToInt() - 1;
                        }
                    }
                    int i39 = unsignedIntToInt4;
                    j2 += (long) i19;
                    unsignedIntToInt6 = i12 - 1;
                    if (unsignedIntToInt6 == 0 || i11 <= 0) {
                        i21 = i19;
                        i22 = i11;
                    } else {
                        unsignedIntToInt6 = parsableByteArray3.readUnsignedIntToInt();
                        i21 = parsableByteArray3.readInt();
                        i22 = i11 - 1;
                    }
                    int i40 = unsignedIntToInt6;
                    long j12 = j5 + ((long) iArrCopyOf[i2]);
                    int i41 = i17 - 1;
                    i2++;
                    j3 = j12;
                    unsignedIntToInt4 = i39;
                    i7 = i21;
                    i4 = i41;
                    iB = i18;
                    i5 = i38;
                    i9 = i22;
                    i8 = i40;
                }
                long j13 = j2 + ((long) i5);
                if (parsableByteArray5 != null) {
                    z3 = true;
                    break;
                }
                while (true) {
                    if (i6 > 0) {
                        z3 = true;
                        break;
                    }
                    if (parsableByteArray5.readUnsignedIntToInt() != 0) {
                        z3 = false;
                        break;
                    }
                    parsableByteArray5.readInt();
                    i6--;
                }
                if (i10 != 0 && i12 == 0 && i13 == 0 && i11 == 0) {
                    i14 = unsignedIntToInt5;
                    if (i14 == 0 && z3) {
                        track2 = track;
                    }
                    jArr = jArrCopyOf;
                    iArr = iArrCopyOf;
                    iArr2 = iArrCopyOf2;
                    i15 = i3;
                    i16 = iB;
                    j4 = j13;
                    jArr2 = jArrCopyOf2;
                } else {
                    i14 = unsignedIntToInt5;
                }
                track2 = track;
                int i42 = track2.id;
                if (z3) {
                    str = "";
                } else {
                    str = ", ctts invalid";
                }
                StringBuilder sb = new StringBuilder(str.length() + WeightingState.state_weight_overload);
                sb.append("Inconsistent stbl box for track ");
                sb.append(i42);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i10);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i12);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i13);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i11);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i14);
                sb.append(str);
                Log.w(a, sb.toString());
                jArr = jArrCopyOf;
                iArr = iArrCopyOf;
                iArr2 = iArrCopyOf2;
                i15 = i3;
                i16 = iB;
                j4 = j13;
                jArr2 = jArrCopyOf2;
            }
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(j4, 1000000L, track2.timescale);
            jArr3 = track2.editListDurations;
            if (jArr3 == null) {
                Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
                return new h(track, jArr, iArr, i15, jArr2, iArr2, jScaleLargeTimestamp);
            }
            if (jArr3.length != 1 && track2.type == 1 && jArr2.length >= 2) {
                long j14 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
                long jScaleLargeTimestamp2 = j14 + Util.scaleLargeTimestamp(track2.editListDurations[0], track2.timescale, track2.movieTimescale);
                i23 = i16;
                if (a(jArr2, j4, j14, jScaleLargeTimestamp2)) {
                    long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(j14 - jArr2[0], track2.format.sampleRate, track2.timescale);
                    iArr3 = iArr2;
                    j6 = j4;
                    long jScaleLargeTimestamp4 = Util.scaleLargeTimestamp(j4 - jScaleLargeTimestamp2, track2.format.sampleRate, track2.timescale);
                    if ((jScaleLargeTimestamp3 != 0 || jScaleLargeTimestamp4 != 0) && jScaleLargeTimestamp3 <= ParserMinimalBase.MAX_INT_L && jScaleLargeTimestamp4 <= ParserMinimalBase.MAX_INT_L) {
                        gaplessInfoHolder.encoderDelay = (int) jScaleLargeTimestamp3;
                        gaplessInfoHolder.encoderPadding = (int) jScaleLargeTimestamp4;
                        Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
                        return new h(track, jArr, iArr, i15, jArr2, iArr3, Util.scaleLargeTimestamp(track2.editListDurations[0], 1000000L, track2.movieTimescale));
                    }
                }
                jArr4 = track2.editListDurations;
                if (jArr4.length != 1 && jArr4[0] == 0) {
                    long j15 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
                    for (int i43 = 0; i43 < jArr2.length; i43++) {
                        jArr2[i43] = Util.scaleLargeTimestamp(jArr2[i43] - j15, 1000000L, track2.timescale);
                    }
                    return new h(track, jArr, iArr, i15, jArr2, iArr3, Util.scaleLargeTimestamp(j6 - j15, 1000000L, track2.timescale));
                }
                if (track2.type == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                iArr4 = new int[jArr4.length];
                iArr5 = new int[jArr4.length];
                jArr5 = (long[]) Assertions.checkNotNull(track2.editListMediaTimes);
                i24 = 0;
                z5 = false;
                i25 = 0;
                i26 = 0;
                while (true) {
                    jArr6 = track2.editListDurations;
                    if (i24 >= jArr6.length) {
                        break;
                    }
                    j9 = jArr5[i24];
                    if (j9 != -1) {
                        i33 = i26;
                        iArr11 = iArr;
                        long jScaleLargeTimestamp5 = Util.scaleLargeTimestamp(jArr6[i24], track2.timescale, track2.movieTimescale);
                        iArr4[i24] = Util.binarySearchFloor(jArr2, j9, true, true);
                        iArr5[i24] = Util.binarySearchCeil(jArr2, j9 + jScaleLargeTimestamp5, z4, false);
                        while (iArr4[i24] < iArr5[i24] && (iArr3[iArr4[i24]] & 1) == 0) {
                            iArr4[i24] = iArr4[i24] + 1;
                        }
                        i25 += iArr5[i24] - iArr4[i24];
                        if (i33 != iArr4[i24]) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        i32 = iArr5[i24];
                        z5 = z7 | z5;
                    } else {
                        iArr11 = iArr;
                        i32 = i26;
                    }
                    i24++;
                    i26 = i32;
                    i15 = i15;
                    iArr = iArr11;
                }
                iArr6 = iArr;
                i27 = i15;
                i28 = 0;
                z6 = z5 | (i25 != i23);
                if (z6) {
                    jArr7 = new long[i25];
                } else {
                    jArr7 = jArr;
                }
                if (z6) {
                    iArr7 = new int[i25];
                } else {
                    iArr7 = iArr6;
                }
                if (z6) {
                    i27 = 0;
                }
                if (z6) {
                    iArr8 = new int[i25];
                } else {
                    iArr8 = iArr3;
                }
                jArr8 = new long[i25];
                j7 = 0;
                i29 = 0;
                while (i28 < track2.editListDurations.length) {
                    j8 = track2.editListMediaTimes[i28];
                    i30 = iArr4[i28];
                    i31 = iArr5[i28];
                    int[] iArr15 = iArr5;
                    if (z6) {
                        int i44 = i31 - i30;
                        System.arraycopy(jArr, i30, jArr7, i29, i44);
                        iArr9 = iArr6;
                        System.arraycopy(iArr9, i30, iArr7, i29, i44);
                        iArr10 = iArr3;
                        System.arraycopy(iArr10, i30, iArr8, i29, i44);
                    } else {
                        iArr9 = iArr6;
                        iArr10 = iArr3;
                    }
                    int i45 = i27;
                    while (i30 < i31) {
                        int[] iArr16 = iArr10;
                        int i46 = i28;
                        long j16 = j7;
                        long[] jArr12 = jArr2;
                        int i47 = i30;
                        jArr8[i29] = Util.scaleLargeTimestamp(j7, 1000000L, track2.movieTimescale) + Util.scaleLargeTimestamp(Math.max(0L, jArr2[i30] - j8), 1000000L, track2.timescale);
                        if (!z6 && iArr7[i29] > i45) {
                            i45 = iArr9[i47];
                        }
                        i29++;
                        i30 = i47 + 1;
                        jArr2 = jArr12;
                        j7 = j16;
                        i28 = i46;
                        iArr10 = iArr16;
                    }
                    iArr3 = iArr10;
                    int i48 = i28;
                    j7 += track2.editListDurations[i48];
                    i28 = i48 + 1;
                    i27 = i45;
                    iArr5 = iArr15;
                    jArr = jArr;
                    jArr2 = jArr2;
                    iArr6 = iArr9;
                    iArr4 = iArr4;
                }
                return new h(track, jArr7, iArr7, i27, jArr8, iArr8, Util.scaleLargeTimestamp(j7, 1000000L, track2.movieTimescale));
            }
            i23 = i16;
            iArr3 = iArr2;
            j6 = j4;
            jArr4 = track2.editListDurations;
            if (jArr4.length != 1) {
            }
            if (track2.type == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            iArr4 = new int[jArr4.length];
            iArr5 = new int[jArr4.length];
            jArr5 = (long[]) Assertions.checkNotNull(track2.editListMediaTimes);
            i24 = 0;
            z5 = false;
            i25 = 0;
            i26 = 0;
            while (true) {
                jArr6 = track2.editListDurations;
                if (i24 >= jArr6.length) {
                    break;
                    break;
                }
                j9 = jArr5[i24];
                if (j9 != -1) {
                    i33 = i26;
                    iArr11 = iArr;
                    long jScaleLargeTimestamp6 = Util.scaleLargeTimestamp(jArr6[i24], track2.timescale, track2.movieTimescale);
                    iArr4[i24] = Util.binarySearchFloor(jArr2, j9, true, true);
                    iArr5[i24] = Util.binarySearchCeil(jArr2, j9 + jScaleLargeTimestamp6, z4, false);
                    while (iArr4[i24] < iArr5[i24]) {
                        iArr4[i24] = iArr4[i24] + 1;
                    }
                    i25 += iArr5[i24] - iArr4[i24];
                    if (i33 != iArr4[i24]) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    i32 = iArr5[i24];
                    z5 = z7 | z5;
                } else {
                    iArr11 = iArr;
                    i32 = i26;
                }
                i24++;
                i26 = i32;
                i15 = i15;
                iArr = iArr11;
            }
            iArr6 = iArr;
            i27 = i15;
            i28 = 0;
            z6 = z5 | (i25 != i23);
            if (z6) {
                jArr7 = new long[i25];
            } else {
                jArr7 = jArr;
            }
            if (z6) {
                iArr7 = new int[i25];
            } else {
                iArr7 = iArr6;
            }
            if (z6) {
                i27 = 0;
            }
            if (z6) {
                iArr8 = new int[i25];
            } else {
                iArr8 = iArr3;
            }
            jArr8 = new long[i25];
            j7 = 0;
            i29 = 0;
            while (i28 < track2.editListDurations.length) {
                j8 = track2.editListMediaTimes[i28];
                i30 = iArr4[i28];
                i31 = iArr5[i28];
                int[] iArr17 = iArr5;
                if (z6) {
                    int i49 = i31 - i30;
                    System.arraycopy(jArr, i30, jArr7, i29, i49);
                    iArr9 = iArr6;
                    System.arraycopy(iArr9, i30, iArr7, i29, i49);
                    iArr10 = iArr3;
                    System.arraycopy(iArr10, i30, iArr8, i29, i49);
                } else {
                    iArr9 = iArr6;
                    iArr10 = iArr3;
                }
                int i410 = i27;
                while (i30 < i31) {
                    int[] iArr18 = iArr10;
                    int i411 = i28;
                    long j17 = j7;
                    long[] jArr13 = jArr2;
                    int i412 = i30;
                    jArr8[i29] = Util.scaleLargeTimestamp(j7, 1000000L, track2.movieTimescale) + Util.scaleLargeTimestamp(Math.max(0L, jArr2[i30] - j8), 1000000L, track2.timescale);
                    if (!z6) {
                    }
                    i29++;
                    i30 = i412 + 1;
                    jArr2 = jArr13;
                    j7 = j17;
                    i28 = i411;
                    iArr10 = iArr18;
                }
                iArr3 = iArr10;
                int i413 = i28;
                j7 += track2.editListDurations[i413];
                i28 = i413 + 1;
                i27 = i410;
                iArr5 = iArr17;
                jArr = jArr;
                jArr2 = jArr2;
                iArr6 = iArr9;
                iArr4 = iArr4;
            }
            return new h(track, jArr7, iArr7, i27, jArr8, iArr8, Util.scaleLargeTimestamp(j7, 1000000L, track2.movieTimescale));
        }
        unsignedIntToInt2 = 0;
        unsignedIntToInt3 = -1;
        iC = eVar.c();
        String str3 = track.format.sampleMimeType;
        if (iC == -1) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (z2) {
            int i310 = aVar.a;
            jArr9 = new long[i310];
            iArr12 = new int[i310];
            while (aVar.a()) {
                int i311 = aVar.b;
                jArr9[i311] = aVar.d;
                iArr12[i311] = aVar.c;
            }
            FixedSampleSizeRechunker.Results resultsA2 = FixedSampleSizeRechunker.a(iC, jArr9, iArr12, unsignedIntToInt9);
            long[] jArr14 = resultsA2.offsets;
            int[] iArr19 = resultsA2.sizes;
            int i312 = resultsA2.maximumSize;
            long[] jArr15 = resultsA2.timestamps;
            int[] iArr110 = resultsA2.flags;
            long j18 = resultsA2.duration;
            i16 = iB;
            jArr = jArr14;
            iArr = iArr19;
            i15 = i312;
            jArr2 = jArr15;
            iArr2 = iArr110;
            j4 = j18;
            track2 = track;
        } else {
            jArrCopyOf = new long[iB];
            iArrCopyOf = new int[iB];
            jArrCopyOf2 = new long[iB];
            iArrCopyOf2 = new int[iB];
            unsignedIntToInt4 = unsignedIntToInt3;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            unsignedIntToInt5 = 0;
            j2 = 0;
            j3 = 0;
            i6 = unsignedIntToInt;
            i7 = unsignedIntToInt9;
            i8 = unsignedIntToInt8;
            i9 = unsignedIntToInt7;
            i10 = unsignedIntToInt2;
            while (true) {
                i11 = i9;
                if (i2 < iB) {
                    i12 = i8;
                    i13 = i4;
                    break;
                }
                j5 = j3;
                i17 = i4;
                zA = true;
                while (i17 == 0) {
                    zA = aVar.a();
                    if (zA) {
                        break;
                        break;
                    }
                    int i313 = i8;
                    long j19 = aVar.d;
                    i17 = aVar.c;
                    j5 = j19;
                    i8 = i313;
                    i7 = i7;
                    iB = iB;
                }
                i18 = iB;
                i12 = i8;
                i19 = i7;
                if (!zA) {
                    Log.w(a, "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i2);
                    iB = i2;
                    i13 = i17;
                    break;
                }
                if (parsableByteArray5 != null) {
                    while (unsignedIntToInt5 == 0) {
                        unsignedIntToInt5 = parsableByteArray5.readUnsignedIntToInt();
                        i5 = parsableByteArray5.readInt();
                        i6--;
                    }
                    unsignedIntToInt5--;
                }
                int i314 = i5;
                jArrCopyOf[i2] = j5;
                iArrCopyOf[i2] = eVar.a();
                if (iArrCopyOf[i2] > i3) {
                    i3 = iArrCopyOf[i2];
                }
                jArrCopyOf2[i2] = j2 + ((long) i314);
                if (parsableByteArray4 == null) {
                    i20 = 1;
                } else {
                    i20 = 0;
                }
                iArrCopyOf2[i2] = i20;
                if (i2 == unsignedIntToInt4) {
                    iArrCopyOf2[i2] = 1;
                    i10--;
                    if (i10 > 0) {
                        unsignedIntToInt4 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray4)).readUnsignedIntToInt() - 1;
                    }
                }
                int i315 = unsignedIntToInt4;
                j2 += (long) i19;
                unsignedIntToInt6 = i12 - 1;
                if (unsignedIntToInt6 == 0) {
                    i21 = i19;
                    i22 = i11;
                } else {
                    i21 = i19;
                    i22 = i11;
                }
                int i414 = unsignedIntToInt6;
                long j110 = j5 + ((long) iArrCopyOf[i2]);
                int i415 = i17 - 1;
                i2++;
                j3 = j110;
                unsignedIntToInt4 = i315;
                i7 = i21;
                i4 = i415;
                iB = i18;
                i5 = i314;
                i9 = i22;
                i8 = i414;
            }
            long j111 = j2 + ((long) i5);
            if (parsableByteArray5 != null) {
                z3 = true;
                break;
            }
            while (true) {
                if (i6 > 0) {
                    z3 = true;
                    break;
                }
                if (parsableByteArray5.readUnsignedIntToInt() != 0) {
                    z3 = false;
                    break;
                }
                parsableByteArray5.readInt();
                i6--;
            }
            if (i10 != 0) {
                i14 = unsignedIntToInt5;
                track2 = track;
                int i416 = track2.id;
                if (z3) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb2 = new StringBuilder(str.length() + WeightingState.state_weight_overload);
                sb2.append("Inconsistent stbl box for track ");
                sb2.append(i416);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(i10);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(i12);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i13);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(i11);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i14);
                sb2.append(str);
                Log.w(a, sb2.toString());
            } else {
                i14 = unsignedIntToInt5;
                track2 = track;
                int i417 = track2.id;
                if (z3) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb3 = new StringBuilder(str.length() + WeightingState.state_weight_overload);
                sb3.append("Inconsistent stbl box for track ");
                sb3.append(i417);
                sb3.append(": remainingSynchronizationSamples ");
                sb3.append(i10);
                sb3.append(", remainingSamplesAtTimestampDelta ");
                sb3.append(i12);
                sb3.append(", remainingSamplesInChunk ");
                sb3.append(i13);
                sb3.append(", remainingTimestampDeltaChanges ");
                sb3.append(i11);
                sb3.append(", remainingSamplesAtTimestampOffset ");
                sb3.append(i14);
                sb3.append(str);
                Log.w(a, sb3.toString());
            }
            jArr = jArrCopyOf;
            iArr = iArrCopyOf;
            iArr2 = iArrCopyOf2;
            i15 = i3;
            i16 = iB;
            j4 = j111;
            jArr2 = jArrCopyOf2;
        }
        jScaleLargeTimestamp = Util.scaleLargeTimestamp(j4, 1000000L, track2.timescale);
        jArr3 = track2.editListDurations;
        if (jArr3 == null) {
            Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
            return new h(track, jArr, iArr, i15, jArr2, iArr2, jScaleLargeTimestamp);
        }
        if (jArr3.length != 1) {
            i23 = i16;
            iArr3 = iArr2;
            j6 = j4;
        } else {
            i23 = i16;
            iArr3 = iArr2;
            j6 = j4;
        }
        jArr4 = track2.editListDurations;
        if (jArr4.length != 1) {
        }
        if (track2.type == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        iArr4 = new int[jArr4.length];
        iArr5 = new int[jArr4.length];
        jArr5 = (long[]) Assertions.checkNotNull(track2.editListMediaTimes);
        i24 = 0;
        z5 = false;
        i25 = 0;
        i26 = 0;
        while (true) {
            jArr6 = track2.editListDurations;
            if (i24 >= jArr6.length) {
                break;
                break;
            }
            j9 = jArr5[i24];
            if (j9 != -1) {
                i33 = i26;
                iArr11 = iArr;
                long jScaleLargeTimestamp7 = Util.scaleLargeTimestamp(jArr6[i24], track2.timescale, track2.movieTimescale);
                iArr4[i24] = Util.binarySearchFloor(jArr2, j9, true, true);
                iArr5[i24] = Util.binarySearchCeil(jArr2, j9 + jScaleLargeTimestamp7, z4, false);
                while (iArr4[i24] < iArr5[i24]) {
                    iArr4[i24] = iArr4[i24] + 1;
                }
                i25 += iArr5[i24] - iArr4[i24];
                if (i33 != iArr4[i24]) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                i32 = iArr5[i24];
                z5 = z7 | z5;
            } else {
                iArr11 = iArr;
                i32 = i26;
            }
            i24++;
            i26 = i32;
            i15 = i15;
            iArr = iArr11;
        }
        iArr6 = iArr;
        i27 = i15;
        i28 = 0;
        z6 = z5 | (i25 != i23);
        if (z6) {
            jArr7 = new long[i25];
        } else {
            jArr7 = jArr;
        }
        if (z6) {
            iArr7 = new int[i25];
        } else {
            iArr7 = iArr6;
        }
        if (z6) {
            i27 = 0;
        }
        if (z6) {
            iArr8 = new int[i25];
        } else {
            iArr8 = iArr3;
        }
        jArr8 = new long[i25];
        j7 = 0;
        i29 = 0;
        while (i28 < track2.editListDurations.length) {
            j8 = track2.editListMediaTimes[i28];
            i30 = iArr4[i28];
            i31 = iArr5[i28];
            int[] iArr111 = iArr5;
            if (z6) {
                int i418 = i31 - i30;
                System.arraycopy(jArr, i30, jArr7, i29, i418);
                iArr9 = iArr6;
                System.arraycopy(iArr9, i30, iArr7, i29, i418);
                iArr10 = iArr3;
                System.arraycopy(iArr10, i30, iArr8, i29, i418);
            } else {
                iArr9 = iArr6;
                iArr10 = iArr3;
            }
            int i419 = i27;
            while (i30 < i31) {
                int[] iArr112 = iArr10;
                int i4110 = i28;
                long j112 = j7;
                long[] jArr16 = jArr2;
                int i4111 = i30;
                jArr8[i29] = Util.scaleLargeTimestamp(j7, 1000000L, track2.movieTimescale) + Util.scaleLargeTimestamp(Math.max(0L, jArr2[i30] - j8), 1000000L, track2.timescale);
                if (!z6) {
                }
                i29++;
                i30 = i4111 + 1;
                jArr2 = jArr16;
                j7 = j112;
                i28 = i4110;
                iArr10 = iArr112;
            }
            iArr3 = iArr10;
            int i4112 = i28;
            j7 += track2.editListDurations[i4112];
            i28 = i4112 + 1;
            i27 = i419;
            iArr5 = iArr111;
            jArr = jArr;
            jArr2 = jArr2;
            iArr6 = iArr9;
            iArr4 = iArr4;
        }
        return new h(track, jArr7, iArr7, i27, jArr8, iArr8, Util.scaleLargeTimestamp(j7, 1000000L, track2.movieTimescale));
    }

    private static c v(ParsableByteArray stsd, int trackId, int rotationDegrees, String language, @Nullable DrmInitData drmInitData, boolean isQuickTime) throws ParserException {
        int i2;
        stsd.setPosition(12);
        int i3 = stsd.readInt();
        c cVar = new c(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            int position = stsd.getPosition();
            int i5 = stsd.readInt();
            ExtractorUtil.checkContainerInput(i5 > 0, "childAtomSize must be positive");
            int i6 = stsd.readInt();
            if (i6 == 1635148593 || i6 == 1635148595 || i6 == 1701733238 || i6 == 1831958048 || i6 == 1836070006 || i6 == 1752589105 || i6 == 1751479857 || i6 == 1932670515 || i6 == 1211250227 || i6 == 1987063864 || i6 == 1987063865 || i6 == 1635135537 || i6 == 1685479798 || i6 == 1685479729 || i6 == 1685481573 || i6 == 1685481521) {
                i2 = position;
                C(stsd, i6, i2, i5, trackId, rotationDegrees, drmInitData, cVar, i4);
            } else if (i6 == 1836069985 || i6 == 1701733217 || i6 == 1633889587 || i6 == 1700998451 || i6 == 1633889588 || i6 == 1685353315 || i6 == 1685353317 || i6 == 1685353320 || i6 == 1685353324 || i6 == 1685353336 || i6 == 1935764850 || i6 == 1935767394 || i6 == 1819304813 || i6 == 1936684916 || i6 == 1953984371 || i6 == 778924082 || i6 == 778924083 || i6 == 1835557169 || i6 == 1835560241 || i6 == 1634492771 || i6 == 1634492791 || i6 == 1970037111 || i6 == 1332770163 || i6 == 1716281667) {
                i2 = position;
                e(stsd, i6, position, i5, trackId, language, isQuickTime, drmInitData, cVar, i4);
            } else {
                if (i6 == 1414810956 || i6 == 1954034535 || i6 == 2004251764 || i6 == 1937010800 || i6 == 1664495672) {
                    w(stsd, i6, position, i5, trackId, language, cVar);
                } else if (i6 == 1835365492) {
                    n(stsd, i6, position, trackId, cVar);
                } else if (i6 == 1667329389) {
                    cVar.b = new Format.Builder().setId(trackId).setSampleMimeType(MimeTypes.APPLICATION_CAMERA_MOTION).build();
                }
                i2 = position;
            }
            stsd.setPosition(i2 + i5);
        }
        return cVar;
    }

    private static void w(ParsableByteArray parent, int atomType, int position, int atomSize, int trackId, String language, c out) {
        parent.setPosition(position + 8 + 8);
        String str = MimeTypes.APPLICATION_TTML;
        ImmutableList immutableListOf = null;
        long j2 = Long.MAX_VALUE;
        if (atomType != 1414810956) {
            if (atomType == 1954034535) {
                int i2 = (atomSize - 8) - 8;
                byte[] bArr = new byte[i2];
                parent.readBytes(bArr, 0, i2);
                immutableListOf = ImmutableList.of(bArr);
                str = MimeTypes.APPLICATION_TX3G;
            } else if (atomType == 2004251764) {
                str = MimeTypes.APPLICATION_MP4VTT;
            } else if (atomType == 1937010800) {
                j2 = 0;
            } else {
                if (atomType != 1664495672) {
                    throw new IllegalStateException();
                }
                out.d = 1;
                str = MimeTypes.APPLICATION_MP4CEA608;
            }
        }
        out.b = new Format.Builder().setId(trackId).setSampleMimeType(str).setLanguage(language).setSubsampleOffsetUs(j2).setInitializationData(immutableListOf).build();
    }

    private static f x(ParsableByteArray tkhd) {
        boolean z;
        tkhd.setPosition(8);
        int iC = com.google.android.exoplayer2.extractor.mp4.a.c(tkhd.readInt());
        tkhd.skipBytes(iC == 0 ? 8 : 16);
        int i2 = tkhd.readInt();
        tkhd.skipBytes(4);
        int position = tkhd.getPosition();
        int i3 = iC == 0 ? 4 : 8;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= i3) {
                z = true;
                break;
            }
            if (tkhd.getData()[position + i5] != -1) {
                z = false;
                break;
            }
            i5++;
        }
        long j2 = C.TIME_UNSET;
        if (z) {
            tkhd.skipBytes(i3);
        } else {
            long unsignedInt = iC == 0 ? tkhd.readUnsignedInt() : tkhd.readUnsignedLongToLong();
            if (unsignedInt != 0) {
                j2 = unsignedInt;
            }
        }
        tkhd.skipBytes(16);
        int i6 = tkhd.readInt();
        int i7 = tkhd.readInt();
        tkhd.skipBytes(4);
        int i8 = tkhd.readInt();
        int i9 = tkhd.readInt();
        if (i6 == 0 && i7 == 65536 && i8 == -65536 && i9 == 0) {
            i4 = 90;
        } else if (i6 == 0 && i7 == -65536 && i8 == 65536 && i9 == 0) {
            i4 = 270;
        } else if (i6 == -65536 && i7 == 0 && i8 == 0 && i9 == -65536) {
            i4 = 180;
        }
        return new f(i2, j2, i4);
    }

    @Nullable
    private static Track y(com.google.android.exoplayer2.extractor.mp4.a.C0147a trak, com.google.android.exoplayer2.extractor.mp4.a.b mvhd, long duration, @Nullable DrmInitData drmInitData, boolean ignoreEditLists, boolean isQuickTime) throws ParserException {
        long[] jArr;
        long[] jArr2;
        com.google.android.exoplayer2.extractor.mp4.a.C0147a c0147aG;
        Pair<long[], long[]> pairG;
        com.google.android.exoplayer2.extractor.mp4.a.C0147a c0147a = (com.google.android.exoplayer2.extractor.mp4.a.C0147a) Assertions.checkNotNull(trak.g(com.google.android.exoplayer2.extractor.mp4.a.h0));
        int iC = c(j(((com.google.android.exoplayer2.extractor.mp4.a.b) Assertions.checkNotNull(c0147a.h(com.google.android.exoplayer2.extractor.mp4.a.t0))).y1));
        if (iC == -1) {
            return null;
        }
        f fVarX = x(((com.google.android.exoplayer2.extractor.mp4.a.b) Assertions.checkNotNull(trak.h(com.google.android.exoplayer2.extractor.mp4.a.p0))).y1);
        long jScaleLargeTimestamp = C.TIME_UNSET;
        long j2 = duration == C.TIME_UNSET ? fVarX.b : duration;
        long jO = o(mvhd.y1);
        if (j2 != C.TIME_UNSET) {
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(j2, 1000000L, jO);
        }
        long j3 = jScaleLargeTimestamp;
        com.google.android.exoplayer2.extractor.mp4.a.C0147a c0147a2 = (com.google.android.exoplayer2.extractor.mp4.a.C0147a) Assertions.checkNotNull(((com.google.android.exoplayer2.extractor.mp4.a.C0147a) Assertions.checkNotNull(c0147a.g(com.google.android.exoplayer2.extractor.mp4.a.i0))).g(com.google.android.exoplayer2.extractor.mp4.a.j0));
        Pair<Long, String> pairL = l(((com.google.android.exoplayer2.extractor.mp4.a.b) Assertions.checkNotNull(c0147a.h(com.google.android.exoplayer2.extractor.mp4.a.s0))).y1);
        c cVarV = v(((com.google.android.exoplayer2.extractor.mp4.a.b) Assertions.checkNotNull(c0147a2.h(com.google.android.exoplayer2.extractor.mp4.a.u0))).y1, fVarX.a, fVarX.c, (String) pairL.second, drmInitData, isQuickTime);
        if (ignoreEditLists || (c0147aG = trak.g(com.google.android.exoplayer2.extractor.mp4.a.q0)) == null || (pairG = g(c0147aG)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairG.first;
            jArr2 = (long[]) pairG.second;
            jArr = jArr3;
        }
        if (cVarV.b == null) {
            return null;
        }
        return new Track(fVarX.a, iC, ((Long) pairL.first).longValue(), jO, j3, cVarV.b, cVarV.d, cVarV.a, cVarV.c, jArr, jArr2);
    }

    public static List<h> z(com.google.android.exoplayer2.extractor.mp4.a.C0147a moov, GaplessInfoHolder gaplessInfoHolder, long duration, @Nullable DrmInitData drmInitData, boolean ignoreEditLists, boolean isQuickTime, Function<Track, Track> modifyTrackFunction) throws ParserException {
        Track trackApply;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < moov.A1.size(); i2++) {
            com.google.android.exoplayer2.extractor.mp4.a.C0147a c0147a = moov.A1.get(i2);
            if (c0147a.a == 1953653099 && (trackApply = modifyTrackFunction.apply(y(c0147a, (com.google.android.exoplayer2.extractor.mp4.a.b) Assertions.checkNotNull(moov.h(com.google.android.exoplayer2.extractor.mp4.a.f0)), duration, drmInitData, ignoreEditLists, isQuickTime))) != null) {
                arrayList.add(u(trackApply, (com.google.android.exoplayer2.extractor.mp4.a.C0147a) Assertions.checkNotNull(((com.google.android.exoplayer2.extractor.mp4.a.C0147a) Assertions.checkNotNull(((com.google.android.exoplayer2.extractor.mp4.a.C0147a) Assertions.checkNotNull(c0147a.g(com.google.android.exoplayer2.extractor.mp4.a.h0))).g(com.google.android.exoplayer2.extractor.mp4.a.i0))).g(com.google.android.exoplayer2.extractor.mp4.a.j0)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }
}
