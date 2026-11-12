package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import androidx.core.view.j;
import ch.qos.logback.core.spi.AbstractComponentTracker;
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
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import j20.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    public static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z14) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z14;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            int i14 = this.index + 1;
            this.index = i14;
            if (i14 == this.length) {
                return false;
            }
            boolean z14 = this.chunkOffsetsAreLongs;
            ParsableByteArray parsableByteArray = this.chunkOffsets;
            this.offset = z14 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i15 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i15;
                this.nextSamplesPerChunkChangeIndex = i15 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    public interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    public static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i14) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i14];
        }
    }

    public static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom, Format format) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    StringBuilder sb3 = new StringBuilder(88);
                    sb3.append("Audio sample size mismatch. stsd sample size: ");
                    sb3.append(pcmFrameSize);
                    sb3.append(", stsz sample size: ");
                    sb3.append(unsignedIntToInt);
                    Log.w(AtomParsers.TAG, sb3.toString());
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i14 = this.fixedSampleSize;
            return i14 == -1 ? this.data.readUnsignedIntToInt() : i14;
        }
    }

    public static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i14 = this.fieldSize;
            if (i14 == 8) {
                return this.data.readUnsignedByte();
            }
            if (i14 == 16) {
                return this.data.readUnsignedShort();
            }
            int i15 = this.sampleIndex;
            this.sampleIndex = i15 + 1;
            if (i15 % 2 != 0) {
                return this.currentByte & 15;
            }
            int unsignedByte = this.data.readUnsignedByte();
            this.currentByte = unsignedByte;
            return (unsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
    }

    public static final class TkhdData {
        private final long duration;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f52999id;
        private final int rotationDegrees;

        public TkhdData(int i14, long j8, int i15) {
            this.f52999id = i14;
            this.duration = j8;
            this.rotationDegrees = i15;
        }
    }

    private AtomParsers() {
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j8, long j14, long j15) {
        int length = jArr.length - 1;
        return jArr[0] <= j14 && j14 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j15 && j15 <= j8;
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i14, int i15, int i16) throws ParserException {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i15, null);
        while (position - i15 < i16) {
            parsableByteArray.setPosition(position);
            int i17 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i17 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i14) {
                return position;
            }
            position += i17;
        }
        return -1;
    }

    private static int getTrackTypeForHdlr(int i14) {
        if (i14 == TYPE_soun) {
            return 1;
        }
        if (i14 == TYPE_vide) {
            return 2;
        }
        if (i14 == TYPE_text || i14 == TYPE_sbtl || i14 == TYPE_subt || i14 == TYPE_clcp) {
            return 3;
        }
        return i14 == 1835365473 ? 5 : -1;
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0171  */
    /* JADX WARN: Code duplicated, block: B:102:0x0174  */
    /* JADX WARN: Code duplicated, block: B:105:0x0183  */
    /* JADX WARN: Code duplicated, block: B:108:0x019a  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:145:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:149:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:151:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:153:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0168  */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i14, int i15, int i16, int i17, String str, boolean z14, DrmInitData drmInitData, StsdData stsdData, int i18) throws ParserException {
        int unsignedShort;
        int unsignedFixedPoint1616;
        int i19;
        int unsignedIntToInt;
        String str2;
        String str3;
        int i24;
        String str4;
        String str5;
        List<byte[]> listOf;
        int i25;
        boolean z15;
        int i26;
        int iFindBoxPosition;
        byte[] bArr;
        boolean z16;
        int i27 = i15;
        int i28 = i16;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i27 + 16);
        if (z14) {
            unsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            unsignedShort = 0;
        }
        if (unsignedShort == 0 || unsignedShort == 1) {
            int unsignedShort2 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            unsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            i19 = parsableByteArray.readInt();
            if (unsignedShort == 1) {
                parsableByteArray.skipBytes(16);
            }
            unsignedIntToInt = unsignedShort2;
        } else {
            if (unsignedShort != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            unsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(20);
            i19 = 0;
        }
        int position = parsableByteArray.getPosition();
        int iIntValue = i14;
        if (iIntValue == 1701733217) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i27, i28);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i18] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        if (iIntValue == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (iIntValue == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (iIntValue == 1633889588) {
            str2 = MimeTypes.AUDIO_AC4;
        } else if (iIntValue == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (iIntValue == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (iIntValue == 1685353336) {
            str2 = MimeTypes.AUDIO_DTS_X;
        } else if (iIntValue == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else {
            if (iIntValue != 1935767394) {
                str3 = MimeTypes.AUDIO_RAW;
                if (iIntValue == 1819304813 || iIntValue == 1936684916) {
                    i24 = 2;
                } else if (iIntValue == 1953984371) {
                    i24 = 268435456;
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str2 = MimeTypes.AUDIO_MPEG;
                } else if (iIntValue == 1835557169) {
                    str2 = MimeTypes.AUDIO_MPEGH_MHA1;
                } else if (iIntValue == 1835560241) {
                    str2 = MimeTypes.AUDIO_MPEGH_MHM1;
                } else if (iIntValue == 1634492771) {
                    str2 = MimeTypes.AUDIO_ALAC;
                } else if (iIntValue == 1634492791) {
                    str2 = MimeTypes.AUDIO_ALAW;
                } else if (iIntValue == 1970037111) {
                    str2 = MimeTypes.AUDIO_MLAW;
                } else if (iIntValue == 1332770163) {
                    str2 = MimeTypes.AUDIO_OPUS;
                } else if (iIntValue == 1716281667) {
                    str2 = MimeTypes.AUDIO_FLAC;
                } else if (iIntValue == 1835823201) {
                    str2 = MimeTypes.AUDIO_TRUEHD;
                } else {
                    i24 = -1;
                    str3 = null;
                }
                str4 = str3;
                str5 = null;
                listOf = null;
                while (position - i27 < i28) {
                    parsableByteArray.setPosition(position);
                    i25 = parsableByteArray.readInt();
                    if (i25 > 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    ExtractorUtil.checkContainerInput(z15, "childAtomSize must be positive");
                    i26 = parsableByteArray.readInt();
                    if (i26 == 1835557187) {
                        int i29 = i25 - 13;
                        byte[] bArr2 = new byte[i29];
                        parsableByteArray.setPosition(position + 13);
                        parsableByteArray.readBytes(bArr2, 0, i29);
                        listOf = ImmutableList.of(bArr2);
                    } else {
                        if (i26 != 1702061171 || (z14 && i26 == 2002876005)) {
                            if (i26 == 1702061171) {
                                iFindBoxPosition = position;
                            } else {
                                iFindBoxPosition = findBoxPosition(parsableByteArray, Atom.TYPE_esds, position, i25);
                            }
                            if (iFindBoxPosition != -1) {
                                Pair<String, byte[]> esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindBoxPosition);
                                str4 = (String) esdsFromParent.first;
                                bArr = (byte[]) esdsFromParent.second;
                                if (bArr != null) {
                                    if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                        AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr);
                                        unsignedFixedPoint1616 = audioSpecificConfig.sampleRateHz;
                                        unsignedIntToInt = audioSpecificConfig.channelCount;
                                        str5 = audioSpecificConfig.codecs;
                                    }
                                    listOf = ImmutableList.of(bArr);
                                }
                            }
                        } else {
                            if (i26 == 1684103987) {
                                parsableByteArray.setPosition(position + 8);
                                stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i17), str, drmInitDataCopyWithSchemeType);
                            } else if (i26 == 1684366131) {
                                parsableByteArray.setPosition(position + 8);
                                stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i17), str, drmInitDataCopyWithSchemeType);
                            } else if (i26 == 1684103988) {
                                parsableByteArray.setPosition(position + 8);
                                stsdData.format = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i17), str, drmInitDataCopyWithSchemeType);
                            } else if (i26 == 1684892784) {
                                if (i19 <= 0) {
                                    StringBuilder sb3 = new StringBuilder(60);
                                    sb3.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                    sb3.append(i19);
                                    throw ParserException.createForMalformedContainer(sb3.toString(), null);
                                }
                                unsignedFixedPoint1616 = i19;
                                unsignedIntToInt = 2;
                            } else if (i26 == 1684305011) {
                                stsdData.format = new Format.Builder().setId(i17).setSampleMimeType(str4).setChannelCount(unsignedIntToInt).setSampleRate(unsignedFixedPoint1616).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str).build();
                            } else if (i26 == 1682927731) {
                                int i30 = i25 - 8;
                                byte[] bArr3 = opusMagic;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i30);
                                parsableByteArray.setPosition(position + 8);
                                parsableByteArray.readBytes(bArrCopyOf, bArr3.length, i30);
                                listOf = OpusUtil.buildInitializationData(bArrCopyOf);
                            } else if (i26 == 1684425825) {
                                byte[] bArr4 = new byte[i25 - 8];
                                bArr4[0] = 102;
                                bArr4[1] = 76;
                                bArr4[2] = 97;
                                bArr4[3] = 67;
                                parsableByteArray.setPosition(position + 12);
                                parsableByteArray.readBytes(bArr4, 4, i25 - 12);
                                listOf = ImmutableList.of(bArr4);
                            } else if (i26 == 1634492771) {
                                int i34 = i25 - 12;
                                byte[] bArr5 = new byte[i34];
                                parsableByteArray.setPosition(position + 12);
                                parsableByteArray.readBytes(bArr5, 0, i34);
                                Pair<Integer, Integer> alacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr5);
                                int iIntValue2 = ((Integer) alacAudioSpecificConfig.first).intValue();
                                int iIntValue3 = ((Integer) alacAudioSpecificConfig.second).intValue();
                                listOf = ImmutableList.of(bArr5);
                                unsignedFixedPoint1616 = iIntValue2;
                                unsignedIntToInt = iIntValue3;
                            } else {
                                z16 = false;
                            }
                            z16 = false;
                        }
                        position += i25;
                        i27 = i15;
                        i28 = i16;
                    }
                    position += i25;
                    i27 = i15;
                    i28 = i16;
                }
                if (stsdData.format == null || str4 == null) {
                }
                stsdData.format = new Format.Builder().setId(i17).setSampleMimeType(str4).setCodecs(str5).setChannelCount(unsignedIntToInt).setSampleRate(unsignedFixedPoint1616).setPcmEncoding(i24).setInitializationData(listOf).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str).build();
                return;
            }
            str2 = MimeTypes.AUDIO_AMR_WB;
        }
        str3 = str2;
        i24 = -1;
        str4 = str3;
        str5 = null;
        listOf = null;
        while (position - i27 < i28) {
            parsableByteArray.setPosition(position);
            i25 = parsableByteArray.readInt();
            if (i25 > 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            ExtractorUtil.checkContainerInput(z15, "childAtomSize must be positive");
            i26 = parsableByteArray.readInt();
            if (i26 == 1835557187) {
                int i210 = i25 - 13;
                byte[] bArr6 = new byte[i210];
                parsableByteArray.setPosition(position + 13);
                parsableByteArray.readBytes(bArr6, 0, i210);
                listOf = ImmutableList.of(bArr6);
            } else {
                if (i26 != 1702061171) {
                    if (i26 == 1702061171) {
                        iFindBoxPosition = position;
                    } else {
                        iFindBoxPosition = findBoxPosition(parsableByteArray, Atom.TYPE_esds, position, i25);
                    }
                    if (iFindBoxPosition != -1) {
                        Pair<String, byte[]> esdsFromParent2 = parseEsdsFromParent(parsableByteArray, iFindBoxPosition);
                        str4 = (String) esdsFromParent2.first;
                        bArr = (byte[]) esdsFromParent2.second;
                        if (bArr != null) {
                            if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                AacUtil.Config audioSpecificConfig2 = AacUtil.parseAudioSpecificConfig(bArr);
                                unsignedFixedPoint1616 = audioSpecificConfig2.sampleRateHz;
                                unsignedIntToInt = audioSpecificConfig2.channelCount;
                                str5 = audioSpecificConfig2.codecs;
                            }
                            listOf = ImmutableList.of(bArr);
                        }
                    }
                } else {
                    if (i26 == 1702061171) {
                        iFindBoxPosition = position;
                    } else {
                        iFindBoxPosition = findBoxPosition(parsableByteArray, Atom.TYPE_esds, position, i25);
                    }
                    if (iFindBoxPosition != -1) {
                        Pair<String, byte[]> esdsFromParent3 = parseEsdsFromParent(parsableByteArray, iFindBoxPosition);
                        str4 = (String) esdsFromParent3.first;
                        bArr = (byte[]) esdsFromParent3.second;
                        if (bArr != null) {
                            if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                AacUtil.Config audioSpecificConfig3 = AacUtil.parseAudioSpecificConfig(bArr);
                                unsignedFixedPoint1616 = audioSpecificConfig3.sampleRateHz;
                                unsignedIntToInt = audioSpecificConfig3.channelCount;
                                str5 = audioSpecificConfig3.codecs;
                            }
                            listOf = ImmutableList.of(bArr);
                        }
                    }
                }
                position += i25;
                i27 = i15;
                i28 = i16;
            }
            position += i25;
            i27 = i15;
            i28 = i16;
        }
        if (stsdData.format == null) {
        }
    }

    public static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i14, int i15) throws ParserException {
        int i16 = i14 + 8;
        int i17 = -1;
        int i18 = 0;
        String string = null;
        Integer numValueOf = null;
        while (i16 - i14 < i15) {
            parsableByteArray.setPosition(i16);
            int i19 = parsableByteArray.readInt();
            int i24 = parsableByteArray.readInt();
            if (i24 == 1718775137) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i24 == 1935894637) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i24 == 1935894633) {
                i17 = i16;
                i18 = i19;
            }
            i16 += i19;
        }
        if (!C.CENC_TYPE_cenc.equals(string) && !C.CENC_TYPE_cbc1.equals(string) && !C.CENC_TYPE_cens.equals(string) && !C.CENC_TYPE_cbcs.equals(string)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i17 != -1, "schi atom is mandatory");
        TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i17, i18, string);
        ExtractorUtil.checkContainerInput(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (TrackEncryptionBox) Util.castNonNull(schiFromParent));
    }

    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_elst);
        if (leafAtomOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i14 = 0; i14 < unsignedIntToInt; i14++) {
            jArr[i14] = fullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i14] = fullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                h.s("Unsupported media rate.");
                return null;
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair<String, byte[]> parseEsdsFromParent(ParsableByteArray parsableByteArray, int i14) {
        parsableByteArray.setPosition(i14 + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return Pair.create(mimeTypeFromMp4ObjectType, null);
        }
        parsableByteArray.skipBytes(12);
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        return Pair.create(mimeTypeFromMp4ObjectType, bArr);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i14 = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i14 = (i14 << 7) | (unsignedByte & 127);
        }
        return i14;
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i14) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i14) {
            Metadata.Entry ilstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 4 : 8);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append((char) (((unsignedShort >> 10) & 31) + 96));
        sb3.append((char) (((unsignedShort >> 5) & 31) + 96));
        sb3.append((char) ((unsignedShort & 31) + 96));
        return Pair.create(Long.valueOf(unsignedInt), sb3.toString());
    }

    public static Metadata parseMdtaFromMeta(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_hdlr);
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_keys);
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_ilst);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || parseHdlr(leafAtomOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType2.data;
        parsableByteArray.setPosition(12);
        int i14 = parsableByteArray.readInt();
        String[] strArr = new String[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i15] = parsableByteArray.readString(i16 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int i17 = parsableByteArray2.readInt();
            int i18 = parsableByteArray2.readInt() - 1;
            if (i18 < 0 || i18 >= i14) {
                v.e(52, i18, "Skipped metadata with unknown key index: ", TAG);
            } else {
                MdtaMetadataEntry mdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + i17, strArr[i18]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            }
            parsableByteArray2.setPosition(position + i17);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i14, int i15, int i16, StsdData stsdData) {
        parsableByteArray.setPosition(i15 + 16);
        if (i14 == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String nullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (nullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i16).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    private static long parseMvhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        parsableByteArray.skipBytes(Atom.parseFullAtomVersion(parsableByteArray.readInt()) != 0 ? 16 : 8);
        return parsableByteArray.readUnsignedInt();
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i14) {
        parsableByteArray.setPosition(i14 + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i14, int i15) {
        int i16 = i14 + 8;
        while (i16 - i14 < i15) {
            parsableByteArray.setPosition(i16);
            int i17 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i16, i17 + i16);
            }
            i16 += i17;
        }
        return null;
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i14, int i15) throws ParserException {
        Pair<Integer, TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i14 < i15) {
            parsableByteArray.setPosition(position);
            int i16 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i16 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i16)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i16;
        }
        return null;
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i14, int i15, String str) {
        int i16;
        int i17;
        int i18 = i14 + 8;
        while (true) {
            byte[] bArr = null;
            if (i18 - i14 >= i15) {
                return null;
            }
            parsableByteArray.setPosition(i18);
            int i19 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i17 = 0;
                    i16 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i16 = unsignedByte & 15;
                    i17 = (unsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                }
                boolean z14 = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z14 && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z14, str, unsignedByte2, bArr2, i17, i16, bArr);
            }
            i18 += i19;
        }
    }

    private static Metadata parseSmta(ParsableByteArray parsableByteArray, int i14) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i14) {
            int position = parsableByteArray.getPosition();
            int i15 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1935766900) {
                if (i15 < 14) {
                    return null;
                }
                parsableByteArray.skipBytes(5);
                int unsignedByte = parsableByteArray.readUnsignedByte();
                if (unsignedByte != 12 && unsignedByte != 13) {
                    return null;
                }
                float f14 = unsignedByte == 12 ? 240.0f : 120.0f;
                parsableByteArray.skipBytes(1);
                return new Metadata(new SmtaMetadataEntry(f14, parsableByteArray.readUnsignedByte()));
            }
            parsableByteArray.setPosition(position + i15);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15, types: [int] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [int] */
    /* JADX WARN: Type inference failed for: r12v16, types: [int] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    private static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z14;
        int unsignedIntToInt;
        int unsignedIntToInt2;
        int unsignedIntToInt3;
        boolean z15;
        long j8;
        long[] jArrCopyOf;
        int i14;
        int i15;
        long j14;
        boolean z16;
        int[] iArr;
        long[] jArr;
        ?? r14;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int i16;
        boolean z17;
        int i17;
        int i18;
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_stsz);
        if (leafAtomOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafAtomOfType, track.format);
        } else {
            Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_stz2);
            if (leafAtomOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafAtomOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_stco);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_co64));
            z14 = true;
        } else {
            z14 = false;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType3.data;
        ParsableByteArray parsableByteArray2 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_stsc))).data;
        ParsableByteArray parsableByteArray3 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_stts))).data;
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(Atom.TYPE_stss);
        ParsableByteArray parsableByteArray4 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(Atom.TYPE_ctts);
        ParsableByteArray parsableByteArray5 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z14);
        parsableByteArray3.setPosition(12);
        int unsignedIntToInt4 = parsableByteArray3.readUnsignedIntToInt() - 1;
        int unsignedIntToInt5 = parsableByteArray3.readUnsignedIntToInt();
        int unsignedIntToInt6 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            unsignedIntToInt = parsableByteArray5.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            unsignedIntToInt3 = parsableByteArray4.readUnsignedIntToInt();
            if (unsignedIntToInt3 > 0) {
                unsignedIntToInt2 = parsableByteArray4.readUnsignedIntToInt() - 1;
                z15 = false;
            } else {
                unsignedIntToInt2 = -1;
                z15 = false;
                parsableByteArray4 = null;
            }
        } else {
            unsignedIntToInt2 = -1;
            unsignedIntToInt3 = 0;
            z15 = false;
        }
        int fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
        String str = track.format.sampleMimeType;
        boolean z18 = (fixedSampleSize == -1 || !((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && unsignedIntToInt4 == 0 && unsignedIntToInt == 0 && unsignedIntToInt3 == 0)) ? z15 ? 1 : 0 : true;
        SampleSizeBox sampleSizeBox = stz2SampleSizeBox;
        if (z18) {
            int i19 = chunkIterator.length;
            long[] jArr2 = new long[i19];
            int[] iArr8 = new int[i19];
            while (chunkIterator.moveNext()) {
                int i24 = chunkIterator.index;
                jArr2[i24] = chunkIterator.offset;
                iArr8[i24] = chunkIterator.numSamples;
            }
            FixedSampleSizeRechunker.Results resultsRechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr2, iArr8, unsignedIntToInt6);
            long[] jArr3 = resultsRechunk.offsets;
            iArr = resultsRechunk.sizes;
            int i25 = resultsRechunk.maximumSize;
            long[] jArr4 = resultsRechunk.timestamps;
            int[] iArr9 = resultsRechunk.flags;
            j14 = resultsRechunk.duration;
            jArr = jArr3;
            r14 = i25;
            jArrCopyOf = jArr4;
            iArr2 = iArr9;
            j8 = 0;
        } else {
            long[] jArr5 = new long[sampleCount];
            j8 = 0;
            int[] iArrCopyOf = new int[sampleCount];
            jArrCopyOf = new long[sampleCount];
            ParsableByteArray parsableByteArray6 = parsableByteArray5;
            int[] iArrCopyOf2 = new int[sampleCount];
            ParsableByteArray parsableByteArray7 = parsableByteArray4;
            int unsignedIntToInt7 = unsignedIntToInt2;
            int i26 = z15 ? 1 : 0;
            int i27 = i26;
            int i28 = i27 == true ? 1 : 0;
            int i29 = i28;
            long j15 = 0;
            long j16 = 0;
            int i30 = unsignedIntToInt;
            int i34 = unsignedIntToInt6;
            int i35 = unsignedIntToInt5;
            int i36 = unsignedIntToInt4;
            int i37 = i29 == true ? 1 : 0;
            while (true) {
                if (i26 >= sampleCount) {
                    boolean z19 = sampleCount == true ? 1 : 0;
                    i14 = i35;
                    i15 = i28;
                    break;
                }
                long j17 = j16;
                int i38 = i28;
                boolean zMoveNext = true;
                while (i38 == 0) {
                    zMoveNext = chunkIterator.moveNext();
                    if (!zMoveNext) {
                        break;
                    }
                    int i39 = i35;
                    long j18 = chunkIterator.offset;
                    i38 = chunkIterator.numSamples;
                    j17 = j18;
                    i35 = i39;
                    i34 = i34;
                    sampleCount = sampleCount == true ? 1 : 0;
                }
                int i44 = sampleCount;
                i14 = i35;
                int i45 = i34;
                if (!zMoveNext) {
                    Log.w(TAG, "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr5, i26);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i26);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i26);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i26);
                    jArr5 = jArrCopyOf2;
                    sampleCount = i26;
                    i15 = i38;
                    break;
                }
                if (parsableByteArray6 != null) {
                    int unsignedIntToInt8 = i29 == true ? 1 : 0;
                    while (unsignedIntToInt8 == 0 && i30 > 0) {
                        unsignedIntToInt8 = parsableByteArray6.readUnsignedIntToInt();
                        i27 = parsableByteArray6.readInt();
                        i30--;
                    }
                    i29 = unsignedIntToInt8 - 1;
                }
                jArr5[i26] = j17;
                int nextSampleSize = sampleSizeBox.readNextSampleSize();
                iArrCopyOf[i26] = nextSampleSize;
                if (nextSampleSize > i37) {
                    i37 = nextSampleSize;
                }
                jArrCopyOf[i26] = j15 + ((long) i27);
                iArrCopyOf2[i26] = parsableByteArray7 == null ? 1 : z15 ? 1 : 0;
                if (i26 == unsignedIntToInt7) {
                    iArrCopyOf2[i26] = 1;
                    unsignedIntToInt3--;
                    if (unsignedIntToInt3 > 0) {
                        unsignedIntToInt7 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray7)).readUnsignedIntToInt() - 1;
                    }
                }
                j15 += (long) i45;
                int unsignedIntToInt9 = i14 - 1;
                if (unsignedIntToInt9 != 0 || i36 <= 0) {
                    i34 = i45;
                } else {
                    unsignedIntToInt9 = parsableByteArray3.readUnsignedIntToInt();
                    i36--;
                    i34 = parsableByteArray3.readInt();
                }
                i35 = unsignedIntToInt9;
                long j19 = j17 + ((long) iArrCopyOf[i26]);
                i28 = i38 - 1;
                i26++;
                j16 = j19;
                sampleCount = i44 == true ? 1 : 0;
            }
            j14 = j15 + ((long) i27);
            if (parsableByteArray6 == null) {
                z16 = true;
                break;
            }
            while (true) {
                if (i30 <= 0) {
                    z16 = true;
                    break;
                }
                if (parsableByteArray6.readUnsignedIntToInt() != 0) {
                    z16 = z15 ? 1 : 0;
                    break;
                }
                parsableByteArray6.readInt();
                i30--;
            }
            if (unsignedIntToInt3 != 0 || i14 != 0 || i15 != 0 || i36 != 0 || i29 != 0 || !z16) {
                int i46 = track.f53000id;
                String str2 = !z16 ? ", ctts invalid" : "";
                StringBuilder sb3 = new StringBuilder(str2.length() + 262);
                sb3.append("Inconsistent stbl box for track ");
                sb3.append(i46);
                sb3.append(": remainingSynchronizationSamples ");
                sb3.append(unsignedIntToInt3);
                j.m(i14, i15, ", remainingSamplesAtTimestampDelta ", ", remainingSamplesInChunk ", sb3);
                j.m(i36, i29 == true ? 1 : 0 ? 1 : 0, ", remainingTimestampDeltaChanges ", ", remainingSamplesAtTimestampOffset ", sb3);
                sb3.append(str2);
                Log.w(TAG, sb3.toString());
            }
            iArr = iArrCopyOf;
            jArr = jArr5;
            r14 = i37 == true ? 1 : 0;
            iArr2 = iArrCopyOf2;
        }
        long j24 = j14;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j24, 1000000L, track.timescale);
        long[] jArr6 = track.editListDurations;
        if (jArr6 == null) {
            Util.scaleLargeTimestampsInPlace(jArrCopyOf, 1000000L, track.timescale);
            return new TrackSampleTable(track, jArr, iArr, r14 == true ? 1 : 0, jArrCopyOf, iArr2, jScaleLargeTimestamp);
        }
        int[] iArr10 = iArr;
        int i47 = sampleCount;
        int[] iArr11 = iArr10;
        if (jArr6.length == 1 && track.type == 1 && jArrCopyOf.length >= 2) {
            long j25 = ((long[]) Assertions.checkNotNull(track.editListMediaTimes))[z15 ? 1 : 0];
            long jScaleLargeTimestamp2 = j25 + Util.scaleLargeTimestamp(track.editListDurations[z15 ? 1 : 0], track.timescale, track.movieTimescale);
            long[] jArr7 = jArr;
            long[] jArr8 = jArrCopyOf;
            jArrCopyOf = jArr8;
            if (canApplyEditWithGaplessInfo(jArr8, j24, j25, jScaleLargeTimestamp2)) {
                long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(j25 - jArrCopyOf[z15 ? 1 : 0], track.format.sampleRate, track.timescale);
                long jScaleLargeTimestamp4 = Util.scaleLargeTimestamp(j24 - jScaleLargeTimestamp2, track.format.sampleRate, track.timescale);
                if (jScaleLargeTimestamp3 != j8 || jScaleLargeTimestamp4 != j8) {
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    j24 = j24;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    j24 = j24;
                    if (jScaleLargeTimestamp3 <= 2147483647L && jScaleLargeTimestamp4 <= 2147483647L) {
                        gaplessInfoHolder.encoderDelay = (int) jScaleLargeTimestamp3;
                        gaplessInfoHolder.encoderPadding = (int) jScaleLargeTimestamp4;
                        Util.scaleLargeTimestampsInPlace(jArrCopyOf, 1000000L, track.timescale);
                        return new TrackSampleTable(track, jArr7, iArr11, r14 == true ? 1 : 0, jArrCopyOf, iArr2, Util.scaleLargeTimestamp(track.editListDurations[z15 ? 1 : 0], 1000000L, track.movieTimescale));
                    }
                }
            }
            iArr3 = iArr11;
            iArr3 = iArr11;
            iArr3 = iArr11;
            j24 = j24;
            iArr3 = iArr11;
            iArr3 = iArr11;
            iArr3 = iArr11;
            j24 = j24;
            jArr = jArr7;
            iArr3 = iArr11;
        }
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        long[] jArr9 = track.editListDurations;
        if (jArr9.length == 1 && jArr9[z15 ? 1 : 0] == j8) {
            long j26 = ((long[]) Assertions.checkNotNull(track.editListMediaTimes))[z15 ? 1 : 0];
            for (int i48 = z15 ? 1 : 0; i48 < jArrCopyOf.length; i48++) {
                jArrCopyOf[i48] = Util.scaleLargeTimestamp(jArrCopyOf[i48] - j26, 1000000L, track.timescale);
            }
            return new TrackSampleTable(track, jArr, iArr3, r14 == true ? 1 : 0, jArrCopyOf, iArr2, Util.scaleLargeTimestamp(j24 - j26, 1000000L, track.timescale));
        }
        boolean z24 = track.type == 1 ? true : z15 ? 1 : 0;
        int[] iArr12 = new int[jArr9.length];
        int[] iArr13 = new int[jArr9.length];
        long[] jArr10 = (long[]) Assertions.checkNotNull(track.editListMediaTimes);
        int i49 = z15 ? 1 : 0;
        boolean z25 = i49 == true ? 1 : 0;
        int i54 = z25 ? 1 : 0;
        int i55 = i54;
        boolean z26 = z25;
        while (true) {
            long[] jArr11 = track.editListDurations;
            iArr4 = iArr13;
            if (i49 >= jArr11.length) {
                break;
            }
            int[] iArr14 = iArr12;
            long[] jArr12 = jArr10;
            long j27 = jArr12[i49];
            if (j27 != -1) {
                long j28 = jArr11[i49];
                i16 = i49;
                boolean z27 = z26 ? 1 : 0;
                long jScaleLargeTimestamp5 = Util.scaleLargeTimestamp(j28, track.timescale, track.movieTimescale);
                iArr7 = iArr14;
                iArr7[i16 == true ? 1 : 0] = Util.binarySearchFloor(jArrCopyOf, j27, true, true);
                long j29 = j27 + jScaleLargeTimestamp5;
                z17 = z15;
                iArr4[i16 == true ? 1 : 0] = Util.binarySearchCeil(jArrCopyOf, j29, z24, z17);
                while (true) {
                    i17 = iArr7[i16 == true ? 1 : 0];
                    i18 = iArr4[i16 == true ? 1 : 0];
                    if (i17 >= i18 || (iArr2[i17] & 1) != 0) {
                        break;
                    }
                    iArr7[i16 == true ? 1 : 0] = i17 + 1;
                }
                i54 += i18 - i17;
                z26 = (z27 ? 1 : 0) | (i55 != i17 ? true : z17 ? 1 : 0);
                i55 = i18;
            } else {
                iArr7 = iArr14;
                i16 = i49;
                boolean z28 = z26 ? 1 : 0;
                z17 = z15;
            }
            jArr10 = jArr12;
            z15 = z17;
            iArr13 = iArr4;
            i49 = i16 + 1;
            iArr12 = iArr7;
            z26 = z26;
        }
        int[] iArr15 = iArr12;
        boolean z29 = z15;
        boolean z34 = (z26 ? 1 : 0 ? 1 : 0) | (i54 != i47 ? true : z29);
        long[] jArr13 = z34 != 0 ? new long[i54] : jArr;
        if (z34 != 0) {
            iArr6 = new int[i54];
        } else {
            iArr5 = iArr3;
        }
        if (z34 != 0) {
            iArr5 = iArr6;
            r14 = z29;
        }
        int[] iArr16 = z34 != 0 ? new int[i54] : iArr2;
        long[] jArr14 = new long[i54];
        ?? r15 = z29;
        long j34 = j8;
        boolean z35 = z34;
        int[] iArr17 = iArr3;
        ?? r16 = r14;
        ?? r17 = z29;
        while (r17 < track.editListDurations.length) {
            long j35 = track.editListMediaTimes[r17];
            int i56 = iArr15[r17];
            boolean z36 = z35;
            int i57 = iArr4[r17];
            ?? r38 = r16;
            if (z36 != 0) {
                int i58 = i57 - i56;
                System.arraycopy(jArr, i56, jArr13, r15, i58);
                System.arraycopy(iArr17, i56, iArr5, r15, i58);
                System.arraycopy(iArr2, i56, iArr16, r15, i58);
            }
            int i59 = r38 == true ? 1 : 0;
            int[] iArr18 = iArr17;
            ?? r18 = r15;
            while (i56 < i57) {
                long[] jArr15 = jArr;
                int[] iArr19 = iArr18;
                long jScaleLargeTimestamp6 = Util.scaleLargeTimestamp(j34, 1000000L, track.movieTimescale);
                long j36 = jArrCopyOf[i56] - j35;
                long[] jArr16 = jArrCopyOf;
                int[] iArr20 = iArr2;
                long j37 = j8;
                jArr14[r18] = jScaleLargeTimestamp6 + Util.scaleLargeTimestamp(Math.max(j37, j36), 1000000L, track.timescale);
                if (z36 != 0 && iArr5[r18] > i59) {
                    i59 = iArr19[i56];
                }
                i56++;
                j8 = j37;
                jArr = jArr15;
                iArr18 = iArr19;
                iArr2 = iArr20;
                jArrCopyOf = jArr16;
                i59 = i59;
                r18++;
            }
            j34 += track.editListDurations[r17];
            z35 = z36;
            jArr = jArr;
            iArr17 = iArr18;
            iArr2 = iArr2;
            jArrCopyOf = jArrCopyOf;
            r16 = i59;
            r17++;
            r15 = r18;
        }
        return new TrackSampleTable(track, jArr13, iArr5, r16, jArr14, iArr16, Util.scaleLargeTimestamp(j34, 1000000L, track.movieTimescale));
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i14, int i15, String str, DrmInitData drmInitData, boolean z14) throws ParserException {
        parsableByteArray.setPosition(12);
        int i16 = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(i16);
        int i17 = 0;
        while (i17 < i16) {
            int position = parsableByteArray.getPosition();
            int i18 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i18 > 0, "childAtomSize must be positive");
            int i19 = parsableByteArray.readInt();
            if (i19 == 1635148593 || i19 == 1635148595 || i19 == 1701733238 || i19 == 1831958048 || i19 == 1836070006 || i19 == 1752589105 || i19 == 1751479857 || i19 == 1932670515 || i19 == 1211250227 || i19 == 1987063864 || i19 == 1987063865 || i19 == 1635135537 || i19 == 1685479798 || i19 == 1685479729 || i19 == 1685481573 || i19 == 1685481521) {
                StsdData stsdData2 = stsdData;
                int i24 = i17;
                parseVideoSampleEntry(parsableByteArray, i19, position, i18, i14, i15, drmInitData, stsdData2, i24);
                stsdData = stsdData2;
                i17 = i24;
            } else if (i19 == 1836069985 || i19 == 1701733217 || i19 == 1633889587 || i19 == 1700998451 || i19 == 1633889588 || i19 == 1835823201 || i19 == 1685353315 || i19 == 1685353317 || i19 == 1685353320 || i19 == 1685353324 || i19 == 1685353336 || i19 == 1935764850 || i19 == 1935767394 || i19 == 1819304813 || i19 == 1936684916 || i19 == 1953984371 || i19 == 778924082 || i19 == 778924083 || i19 == 1835557169 || i19 == 1835560241 || i19 == 1634492771 || i19 == 1634492791 || i19 == 1970037111 || i19 == 1332770163 || i19 == 1716281667) {
                StsdData stsdData3 = stsdData;
                parseAudioSampleEntry(parsableByteArray, i19, position, i18, i14, str, z14, drmInitData, stsdData3, i17);
                stsdData = stsdData3;
            } else if (i19 == 1414810956 || i19 == 1954034535 || i19 == 2004251764 || i19 == 1937010800 || i19 == 1664495672) {
                parseTextSampleEntry(parsableByteArray, i19, position, i18, i14, str, stsdData);
            } else if (i19 == 1835365492) {
                parseMetaDataSampleEntry(parsableByteArray, i19, position, i14, stsdData);
            } else if (i19 == 1667329389) {
                stsdData.format = new Format.Builder().setId(i14).setSampleMimeType(MimeTypes.APPLICATION_CAMERA_MOTION).build();
            }
            parsableByteArray.setPosition(position + i18);
            i17++;
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i14, int i15, int i16, int i17, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i15 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        ImmutableList immutableListOf = null;
        long j8 = Long.MAX_VALUE;
        if (i14 != 1414810956) {
            if (i14 == 1954034535) {
                int i18 = i16 - 16;
                byte[] bArr = new byte[i18];
                parsableByteArray.readBytes(bArr, 0, i18);
                immutableListOf = ImmutableList.of(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i14 == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i14 == 1937010800) {
                j8 = 0;
            } else if (i14 != 1664495672) {
                x.h();
                return;
            } else {
                stsdData.requiredSampleTransformation = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            }
        }
        stsdData.format = new Format.Builder().setId(i17).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j8).setInitializationData(immutableListOf).build();
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j8;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        int i14 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i15 = fullAtomVersion == 0 ? 4 : 8;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            j8 = C.TIME_UNSET;
            if (i17 >= i15) {
                parsableByteArray.skipBytes(i15);
                break;
            }
            if (parsableByteArray.getData()[position + i17] != -1) {
                long unsignedInt = fullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt == 0) {
                    break;
                }
                j8 = unsignedInt;
                break;
            }
            i17++;
        }
        parsableByteArray.skipBytes(16);
        int i18 = parsableByteArray.readInt();
        int i19 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i24 = parsableByteArray.readInt();
        int i25 = parsableByteArray.readInt();
        if (i18 == 0 && i19 == 65536 && i24 == -65536 && i25 == 0) {
            i16 = 90;
        } else if (i18 == 0 && i19 == -65536 && i24 == 65536 && i25 == 0) {
            i16 = 270;
        } else if (i18 == -65536 && i19 == 0 && i24 == 0 && i25 == -65536) {
            i16 = 180;
        }
        return new TkhdData(i14, j8, i16);
    }

    private static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j8, DrmInitData drmInitData, boolean z14, boolean z15) throws ParserException {
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType;
        Pair<long[], long[]> edts;
        Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) Assertions.checkNotNull(containerAtom.getContainerAtomOfType(Atom.TYPE_mdia));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(Atom.TYPE_hdlr))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData tkhd = parseTkhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_tkhd))).data);
        long jScaleLargeTimestamp = C.TIME_UNSET;
        long j14 = j8 == C.TIME_UNSET ? tkhd.duration : j8;
        long mvhd = parseMvhd(leafAtom.data);
        if (j14 != C.TIME_UNSET) {
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(j14, 1000000L, mvhd);
        }
        long j15 = jScaleLargeTimestamp;
        Atom.ContainerAtom containerAtom3 = (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(Atom.TYPE_minf))).getContainerAtomOfType(Atom.TYPE_stbl));
        Pair<Long, String> mdhd = parseMdhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(Atom.TYPE_mdhd))).data);
        StsdData stsd = parseStsd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom3.getLeafAtomOfType(Atom.TYPE_stsd))).data, tkhd.f52999id, tkhd.rotationDegrees, (String) mdhd.second, drmInitData, z15);
        if (z14 || (containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_edts)) == null || (edts = parseEdts(containerAtomOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.format == null) {
            return null;
        }
        return new Track(tkhd.f52999id, trackTypeForHdlr, ((Long) mdhd.first).longValue(), mvhd, j15, stsd.format, stsd.requiredSampleTransformation, stsd.trackEncryptionBoxes, stsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static List<TrackSampleTable> parseTraks(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, long j8, DrmInitData drmInitData, boolean z14, boolean z15, Function<Track, Track> function) {
        Track trackApply;
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < containerAtom.containerChildren.size(); i14++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i14);
            if (containerAtom2.type == 1953653099 && (trackApply = function.apply(parseTrak(containerAtom2, (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_mvhd)), j8, drmInitData, z14, z15))) != null) {
                arrayList.add(parseStbl(trackApply, (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(Atom.TYPE_mdia))).getContainerAtomOfType(Atom.TYPE_minf))).getContainerAtomOfType(Atom.TYPE_stbl)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static Pair<Metadata, Metadata> parseUdta(Atom.LeafAtom leafAtom) {
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        Metadata udtaMeta = null;
        Metadata smta = null;
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i14 = parsableByteArray.readInt();
            int i15 = parsableByteArray.readInt();
            if (i15 == 1835365473) {
                parsableByteArray.setPosition(position);
                udtaMeta = parseUdtaMeta(parsableByteArray, position + i14);
            } else if (i15 == 1936553057) {
                parsableByteArray.setPosition(position);
                smta = parseSmta(parsableByteArray, position + i14);
            }
            parsableByteArray.setPosition(position + i14);
        }
        return Pair.create(udtaMeta, smta);
    }

    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i14) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i14) {
            int position = parsableByteArray.getPosition();
            int i15 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + i15);
            }
            parsableByteArray.setPosition(position + i15);
        }
        return null;
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i14, int i15, int i16, int i17, int i18, DrmInitData drmInitData, StsdData stsdData, int i19) throws ParserException {
        String str;
        byte[] bArr;
        float f14;
        List<byte[]> list;
        String str2;
        int i24 = i15;
        int i25 = i16;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i24 + 16);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int iIntValue = i14;
        if (iIntValue == 1701733238) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i24, i25);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i19] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str3 = MimeTypes.VIDEO_H263;
        if (iIntValue == 1831958048) {
            str = MimeTypes.VIDEO_MPEG;
        } else {
            str = iIntValue == 1211250227 ? MimeTypes.VIDEO_H263 : null;
        }
        float paspFromParent = 1.0f;
        byte[] projFromParent = null;
        String str4 = null;
        List<byte[]> listOf = null;
        int i26 = -1;
        int iIsoColorPrimariesToColorSpace = -1;
        int i27 = -1;
        int iIsoTransferCharacteristicsToColorTransfer = -1;
        ByteBuffer byteBufferAllocateHdrStaticInfo = null;
        boolean z14 = false;
        while (position - i24 < i25) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int i28 = parsableByteArray.readInt();
            if (i28 == 0 && parsableByteArray.getPosition() - i15 == i25) {
                break;
            }
            ExtractorUtil.checkContainerInput(i28 > 0, "childAtomSize must be positive");
            int i29 = parsableByteArray.readInt();
            if (i29 == 1635148611) {
                ExtractorUtil.checkContainerInput(str == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
                listOf = avcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                if (!z14) {
                    paspFromParent = avcConfig.pixelWidthHeightRatio;
                }
                str4 = avcConfig.codecs;
                str2 = MimeTypes.VIDEO_H264;
            } else if (i29 == 1752589123) {
                ExtractorUtil.checkContainerInput(str == null, null);
                parsableByteArray.setPosition(position2 + 8);
                HevcConfig hevcConfig = HevcConfig.parse(parsableByteArray);
                listOf = hevcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                if (!z14) {
                    paspFromParent = hevcConfig.pixelWidthHeightRatio;
                }
                str4 = hevcConfig.codecs;
                str2 = MimeTypes.VIDEO_H265;
            } else {
                if (i29 == 1685480259 || i29 == 1685485123) {
                    drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                    iIntValue = iIntValue;
                    str3 = str3;
                    bArr = projFromParent;
                    f14 = paspFromParent;
                    list = listOf;
                    DolbyVisionConfig dolbyVisionConfig = DolbyVisionConfig.parse(parsableByteArray);
                    if (dolbyVisionConfig != null) {
                        str4 = dolbyVisionConfig.codecs;
                        str = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                } else if (i29 == 1987076931) {
                    ExtractorUtil.checkContainerInput(str == null, null);
                    str2 = iIntValue == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                } else {
                    if (i29 == 1635135811) {
                        ExtractorUtil.checkContainerInput(str == null, null);
                        str2 = MimeTypes.VIDEO_AV1;
                    } else if (i29 == 1668050025) {
                        if (byteBufferAllocateHdrStaticInfo == null) {
                            byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                        }
                        ByteBuffer byteBuffer = byteBufferAllocateHdrStaticInfo;
                        byteBuffer.position(21);
                        byteBuffer.putShort(parsableByteArray.readShort());
                        byteBuffer.putShort(parsableByteArray.readShort());
                        byteBufferAllocateHdrStaticInfo = byteBuffer;
                    } else if (i29 == 1835295606) {
                        if (byteBufferAllocateHdrStaticInfo == null) {
                            byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                        }
                        ByteBuffer byteBuffer2 = byteBufferAllocateHdrStaticInfo;
                        short s8 = parsableByteArray.readShort();
                        short s14 = parsableByteArray.readShort();
                        short s15 = parsableByteArray.readShort();
                        short s16 = parsableByteArray.readShort();
                        short s17 = parsableByteArray.readShort();
                        short s18 = parsableByteArray.readShort();
                        List<byte[]> list2 = listOf;
                        short s19 = parsableByteArray.readShort();
                        byte[] bArr2 = projFromParent;
                        short s24 = parsableByteArray.readShort();
                        long unsignedInt = parsableByteArray.readUnsignedInt();
                        long unsignedInt2 = parsableByteArray.readUnsignedInt();
                        byteBuffer2.position(1);
                        byteBuffer2.putShort(s17);
                        byteBuffer2.putShort(s18);
                        byteBuffer2.putShort(s8);
                        byteBuffer2.putShort(s14);
                        byteBuffer2.putShort(s15);
                        byteBuffer2.putShort(s16);
                        byteBuffer2.putShort(s19);
                        byteBuffer2.putShort(s24);
                        byteBuffer2.putShort((short) (unsignedInt / AbstractComponentTracker.LINGERING_TIMEOUT));
                        byteBuffer2.putShort((short) (unsignedInt2 / AbstractComponentTracker.LINGERING_TIMEOUT));
                        byteBufferAllocateHdrStaticInfo = byteBuffer2;
                        listOf = list2;
                        projFromParent = bArr2;
                        paspFromParent = paspFromParent;
                    } else {
                        drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                        iIntValue = iIntValue;
                        str3 = str3;
                        bArr = projFromParent;
                        f14 = paspFromParent;
                        list = listOf;
                        if (i29 == 1681012275) {
                            ExtractorUtil.checkContainerInput(str == null, null);
                            str = str3;
                        } else if (i29 == 1702061171) {
                            ExtractorUtil.checkContainerInput(str == null, null);
                            Pair<String, byte[]> esdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                            String str5 = (String) esdsFromParent.first;
                            byte[] bArr3 = (byte[]) esdsFromParent.second;
                            listOf = bArr3 != null ? ImmutableList.of(bArr3) : list;
                            str = str5;
                            projFromParent = bArr;
                            paspFromParent = f14;
                        } else if (i29 == 1885434736) {
                            paspFromParent = parsePaspFromParent(parsableByteArray, position2);
                            listOf = list;
                            projFromParent = bArr;
                            z14 = true;
                        } else {
                            if (i29 == 1937126244) {
                                projFromParent = parseProjFromParent(parsableByteArray, position2, i28);
                                listOf = list;
                            } else if (i29 == 1936995172) {
                                int unsignedByte = parsableByteArray.readUnsignedByte();
                                parsableByteArray.skipBytes(3);
                                if (unsignedByte == 0) {
                                    int unsignedByte2 = parsableByteArray.readUnsignedByte();
                                    if (unsignedByte2 == 0) {
                                        i26 = 0;
                                    } else if (unsignedByte2 == 1) {
                                        i26 = 1;
                                    } else if (unsignedByte2 == 2) {
                                        i26 = 2;
                                    } else if (unsignedByte2 == 3) {
                                        i26 = 3;
                                    }
                                }
                            } else if (i29 == 1668246642) {
                                int i30 = parsableByteArray.readInt();
                                if (i30 == TYPE_nclx || i30 == TYPE_nclc) {
                                    int unsignedShort3 = parsableByteArray.readUnsignedShort();
                                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                                    parsableByteArray.skipBytes(2);
                                    boolean z15 = i28 == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                    iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedShort3);
                                    i27 = z15 ? 1 : 2;
                                    iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                                } else {
                                    String strValueOf = String.valueOf(Atom.getAtomTypeString(i30));
                                    Log.w(TAG, strValueOf.length() != 0 ? "Unsupported color type: ".concat(strValueOf) : new String("Unsupported color type: "));
                                }
                            }
                            paspFromParent = f14;
                        }
                    }
                    position += i28;
                    i24 = i15;
                    i25 = i16;
                    stsdData2 = stsdData;
                    iIntValue = iIntValue;
                    str3 = str3;
                    drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                }
                listOf = list;
                projFromParent = bArr;
                paspFromParent = f14;
                position += i28;
                i24 = i15;
                i25 = i16;
                stsdData2 = stsdData;
                iIntValue = iIntValue;
                str3 = str3;
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
            }
            str = str2;
            position += i28;
            i24 = i15;
            i25 = i16;
            stsdData2 = stsdData;
            iIntValue = iIntValue;
            str3 = str3;
            drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
        }
        DrmInitData drmInitData2 = drmInitDataCopyWithSchemeType;
        byte[] bArr4 = projFromParent;
        float f15 = paspFromParent;
        List<byte[]> list3 = listOf;
        if (str == null) {
            return;
        }
        Format.Builder drmInitData3 = new Format.Builder().setId(i17).setSampleMimeType(str).setCodecs(str4).setWidth(unsignedShort).setHeight(unsignedShort2).setPixelWidthHeightRatio(f15).setRotationDegrees(i18).setProjectionData(bArr4).setStereoMode(i26).setInitializationData(list3).setDrmInitData(drmInitData2);
        int i34 = iIsoColorPrimariesToColorSpace;
        int i35 = i27;
        int i36 = iIsoTransferCharacteristicsToColorTransfer;
        if (i34 != -1 || i35 != -1 || i36 != -1 || byteBufferAllocateHdrStaticInfo != null) {
            drmInitData3.setColorInfo(new ColorInfo(i34, i35, i36, byteBufferAllocateHdrStaticInfo != null ? byteBufferAllocateHdrStaticInfo.array() : null));
        }
        stsdData.format = drmInitData3.build();
    }
}
