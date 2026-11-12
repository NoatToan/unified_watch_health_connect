package com.google.android.exoplayer2.extractor.ts;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes13.dex */
public final class H262Reader implements ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private static final int START_USER_DATA = 178;
    private final CsdBuffer csdBuffer;
    private String formatId;
    private long frameDurationUs;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private boolean sampleHasPicture;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean startedFirstSample;
    private long totalBytesWritten;
    private final NalUnitTargetBuffer userData;
    private final ParsableByteArray userDataParsable;
    private final UserDataReader userDataReader;

    public static final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        private boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        public CsdBuffer(int i14) {
            this.data = new byte[i14];
        }

        public void onData(byte[] bArr, int i14, int i15) {
            if (this.isFilling) {
                int i16 = i15 - i14;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i17 = this.length;
                if (length < i17 + i16) {
                    this.data = Arrays.copyOf(bArr2, (i17 + i16) * 2);
                }
                System.arraycopy(bArr, i14, this.data, this.length, i16);
                this.length += i16;
            }
        }

        public boolean onStartCode(int i14, int i15) {
            if (this.isFilling) {
                int i16 = this.length - i15;
                this.length = i16;
                if (this.sequenceExtensionPosition != 0 || i14 != H262Reader.START_EXTENSION) {
                    this.isFilling = false;
                    return true;
                }
                this.sequenceExtensionPosition = i16;
            } else if (i14 == H262Reader.START_SEQUENCE_HEADER) {
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.sequenceExtensionPosition = 0;
        }
    }

    public H262Reader(UserDataReader userDataReader) {
        this.userDataReader = userDataReader;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new CsdBuffer(128);
        if (userDataReader != null) {
            this.userData = new NalUnitTargetBuffer(START_USER_DATA, 128);
            this.userDataParsable = new ParsableByteArray();
        } else {
            this.userData = null;
            this.userDataParsable = null;
        }
        this.pesTimeUs = C.TIME_UNSET;
        this.sampleTimeUs = C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:20:0x0098  */
    private static Pair<Format, Long> parseCsdBuffer(CsdBuffer csdBuffer, String str) {
        float f14;
        int i14;
        float f15;
        int i15;
        long j8;
        double[] dArr;
        double d14;
        int i16;
        int i17;
        byte[] bArrCopyOf = Arrays.copyOf(csdBuffer.data, csdBuffer.length);
        int i18 = bArrCopyOf[4] & UnsignedBytes.MAX_VALUE;
        byte b14 = bArrCopyOf[5];
        int i19 = (i18 << 4) | ((b14 & UnsignedBytes.MAX_VALUE) >> 4);
        int i24 = ((b14 & Ascii.SI) << 8) | (bArrCopyOf[6] & UnsignedBytes.MAX_VALUE);
        int i25 = (bArrCopyOf[7] & 240) >> 4;
        if (i25 == 2) {
            f14 = i24 * 4;
            i14 = i19 * 3;
        } else {
            if (i25 != 3) {
                if (i25 != 4) {
                    f15 = 1.0f;
                } else {
                    f14 = i24 * 121;
                    i14 = i19 * 100;
                }
                Format formatBuild = new Format.Builder().setId(str).setSampleMimeType(MimeTypes.VIDEO_MPEG2).setWidth(i19).setHeight(i24).setPixelWidthHeightRatio(f15).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
                i15 = (bArrCopyOf[7] & Ascii.SI) - 1;
                if (i15 >= 0) {
                    dArr = FRAME_RATE_VALUES;
                    if (i15 < dArr.length) {
                        d14 = dArr[i15];
                        byte b15 = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                        i16 = (b15 & 96) >> 5;
                        i17 = b15 & Ascii.US;
                        if (i16 != i17) {
                            d14 *= (((double) i16) + 1.0d) / ((double) (i17 + 1));
                        }
                        j8 = (long) (1000000.0d / d14);
                    } else {
                        j8 = 0;
                    }
                } else {
                    j8 = 0;
                }
                return Pair.create(formatBuild, Long.valueOf(j8));
            }
            f14 = i24 * 16;
            i14 = i19 * 9;
        }
        f15 = f14 / i14;
        Format formatBuild2 = new Format.Builder().setId(str).setSampleMimeType(MimeTypes.VIDEO_MPEG2).setWidth(i19).setHeight(i24).setPixelWidthHeightRatio(f15).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
        i15 = (bArrCopyOf[7] & Ascii.SI) - 1;
        if (i15 >= 0) {
            dArr = FRAME_RATE_VALUES;
            if (i15 < dArr.length) {
                d14 = dArr[i15];
                byte b16 = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                i16 = (b16 & 96) >> 5;
                i17 = b16 & Ascii.US;
                if (i16 != i17) {
                    d14 *= (((double) i16) + 1.0d) / ((double) (i17 + 1));
                }
                j8 = (long) (1000000.0d / d14);
            } else {
                j8 = 0;
            }
        } else {
            j8 = 0;
        }
        return Pair.create(formatBuild2, Long.valueOf(j8));
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        boolean z14;
        int i14;
        Assertions.checkStateNotNull(this.output);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += (long) parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i15 = iFindNalUnit + 3;
            int i16 = parsableByteArray.getData()[i15] & UnsignedBytes.MAX_VALUE;
            int i17 = iFindNalUnit - position;
            if (!this.hasOutputFormat) {
                if (i17 > 0) {
                    this.csdBuffer.onData(data, position, iFindNalUnit);
                }
                if (this.csdBuffer.onStartCode(i16, i17 < 0 ? -i17 : 0)) {
                    Pair<Format, Long> csdBuffer = parseCsdBuffer(this.csdBuffer, (String) Assertions.checkNotNull(this.formatId));
                    this.output.format((Format) csdBuffer.first);
                    this.frameDurationUs = ((Long) csdBuffer.second).longValue();
                    this.hasOutputFormat = true;
                }
            }
            NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
            if (nalUnitTargetBuffer != null) {
                if (i17 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(data, position, iFindNalUnit);
                    i14 = 0;
                } else {
                    i14 = -i17;
                }
                if (this.userData.endNalUnit(i14)) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.userData;
                    ((ParsableByteArray) Util.castNonNull(this.userDataParsable)).reset(this.userData.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
                    ((UserDataReader) Util.castNonNull(this.userDataReader)).consume(this.sampleTimeUs, this.userDataParsable);
                }
                if (i16 == START_USER_DATA && parsableByteArray.getData()[iFindNalUnit + 2] == 1) {
                    this.userData.startNalUnit(i16);
                }
            }
            if (i16 == 0 || i16 == START_SEQUENCE_HEADER) {
                int i18 = iLimit - iFindNalUnit;
                if (this.sampleHasPicture && this.hasOutputFormat) {
                    long j8 = this.sampleTimeUs;
                    if (j8 != C.TIME_UNSET) {
                        this.output.sampleMetadata(j8, this.sampleIsKeyframe ? 1 : 0, ((int) (this.totalBytesWritten - this.samplePosition)) - i18, i18, null);
                    }
                }
                if (!this.startedFirstSample || this.sampleHasPicture) {
                    this.samplePosition = this.totalBytesWritten - ((long) i18);
                    long j14 = this.pesTimeUs;
                    if (j14 == C.TIME_UNSET) {
                        long j15 = this.sampleTimeUs;
                        j14 = j15 != C.TIME_UNSET ? j15 + this.frameDurationUs : -9223372036854775807L;
                    }
                    this.sampleTimeUs = j14;
                    this.sampleIsKeyframe = false;
                    this.pesTimeUs = C.TIME_UNSET;
                    z14 = true;
                    this.startedFirstSample = true;
                } else {
                    z14 = true;
                }
                this.sampleHasPicture = i16 == 0 ? z14 : false;
            } else {
                if (i16 == 184) {
                    this.sampleIsKeyframe = true;
                }
                iLimit = iLimit;
            }
            iLimit = iLimit;
            position = i15;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(data, position, iLimit);
        }
        NalUnitTargetBuffer nalUnitTargetBuffer3 = this.userData;
        if (nalUnitTargetBuffer3 != null) {
            nalUnitTargetBuffer3.appendToNalUnit(data, position, iLimit);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        UserDataReader userDataReader = this.userDataReader;
        if (userDataReader != null) {
            userDataReader.createTracks(extractorOutput, trackIdGenerator);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j8, int i14) {
        this.pesTimeUs = j8;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
        this.pesTimeUs = C.TIME_UNSET;
        this.sampleTimeUs = C.TIME_UNSET;
    }

    public H262Reader() {
        this(null);
    }
}
