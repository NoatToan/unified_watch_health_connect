package com.google.android.exoplayer2.extractor.wav;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.a;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import i3.e5;
import j20.x;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes13.dex */
public final class WavExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new a(14);
    private static final int STATE_READING_FILE_TYPE = 0;
    private static final int STATE_READING_FORMAT = 2;
    private static final int STATE_READING_RF64_SAMPLE_DATA_SIZE = 1;
    private static final int STATE_READING_SAMPLE_DATA = 4;
    private static final int STATE_SKIPPING_TO_SAMPLE_DATA = 3;
    private static final String TAG = "WavExtractor";
    private static final int TARGET_SAMPLES_PER_SECOND = 10;
    private ExtractorOutput extractorOutput;
    private OutputWriter outputWriter;
    private TrackOutput trackOutput;
    private int state = 0;
    private long rf64SampleDataSize = -1;
    private int dataStartPosition = -1;
    private long dataEndPosition = -1;

    public interface OutputWriter {
        void init(int i14, long j8);

        void reset(long j8);

        boolean sampleData(ExtractorInput extractorInput, long j8);
    }

    public static final class PassthroughOutputWriter implements OutputWriter {
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private long outputFrameCount;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeBytes;
        private final TrackOutput trackOutput;
        private final WavFormat wavFormat;

        public PassthroughOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat, String str, int i14) throws ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int i15 = (wavFormat.numChannels * wavFormat.bitsPerSample) / 8;
            int i16 = wavFormat.blockSize;
            if (i16 == i15) {
                int i17 = wavFormat.frameRateHz;
                int i18 = i17 * i15 * 8;
                int iMax = Math.max(i15, (i17 * i15) / 10);
                this.targetSampleSizeBytes = iMax;
                this.format = new Format.Builder().setSampleMimeType(str).setAverageBitrate(i18).setPeakBitrate(i18).setMaxInputSize(iMax).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(i14).build();
                return;
            }
            StringBuilder sb3 = new StringBuilder(50);
            sb3.append("Expected block size: ");
            sb3.append(i15);
            sb3.append("; got: ");
            sb3.append(i16);
            throw ParserException.createForMalformedContainer(sb3.toString(), null);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void init(int i14, long j8) {
            this.extractorOutput.seekMap(new WavSeekMap(this.wavFormat, 1, i14, j8));
            this.trackOutput.format(this.format);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j8) {
            this.startTimeUs = j8;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public boolean sampleData(ExtractorInput extractorInput, long j8) {
            int i14;
            int i15;
            long j14 = j8;
            while (j14 > 0 && (i14 = this.pendingOutputBytes) < (i15 = this.targetSampleSizeBytes)) {
                int iSampleData = this.trackOutput.sampleData((DataReader) extractorInput, (int) Math.min(i15 - i14, j14), true);
                if (iSampleData == -1) {
                    j14 = 0;
                } else {
                    this.pendingOutputBytes += iSampleData;
                    j14 -= (long) iSampleData;
                }
            }
            WavFormat wavFormat = this.wavFormat;
            int i16 = wavFormat.blockSize;
            int i17 = this.pendingOutputBytes / i16;
            if (i17 > 0) {
                long jScaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, wavFormat.frameRateHz);
                int i18 = i17 * i16;
                int i19 = this.pendingOutputBytes - i18;
                this.trackOutput.sampleMetadata(jScaleLargeTimestamp, 1, i18, i19, null);
                this.outputFrameCount += (long) i17;
                this.pendingOutputBytes = i19;
            }
            return j14 <= 0;
        }
    }

    private void assertInitialized() {
        Assertions.checkStateNotNull(this.trackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new WavExtractor()};
    }

    private void readFileType(ExtractorInput extractorInput) throws ParserException {
        Assertions.checkState(extractorInput.getPosition() == 0);
        int i14 = this.dataStartPosition;
        if (i14 != -1) {
            extractorInput.skipFully(i14);
            this.state = 4;
        } else {
            if (!WavHeaderReader.checkFileType(extractorInput)) {
                throw ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
            }
            extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
            this.state = 1;
        }
    }

    private void readFormat(ExtractorInput extractorInput) throws ParserException {
        WavFormat format = WavHeaderReader.readFormat(extractorInput);
        int i14 = format.formatType;
        if (i14 == 17) {
            this.outputWriter = new ImaAdPcmOutputWriter(this.extractorOutput, this.trackOutput, format);
        } else if (i14 == 6) {
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, MimeTypes.AUDIO_ALAW, -1);
        } else if (i14 == 7) {
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, MimeTypes.AUDIO_MLAW, -1);
        } else {
            int pcmEncodingForType = WavUtil.getPcmEncodingForType(i14, format.bitsPerSample);
            if (pcmEncodingForType == 0) {
                int i15 = format.formatType;
                StringBuilder sb3 = new StringBuilder(40);
                sb3.append("Unsupported WAV format type: ");
                sb3.append(i15);
                throw ParserException.createForUnsupportedContainerFeature(sb3.toString());
            }
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, MimeTypes.AUDIO_RAW, pcmEncodingForType);
        }
        this.state = 3;
    }

    private void readRf64SampleDataSize(ExtractorInput extractorInput) {
        this.rf64SampleDataSize = WavHeaderReader.readRf64SampleDataSize(extractorInput);
        this.state = 2;
    }

    private int readSampleData(ExtractorInput extractorInput) {
        Assertions.checkState(this.dataEndPosition != -1);
        return ((OutputWriter) Assertions.checkNotNull(this.outputWriter)).sampleData(extractorInput, this.dataEndPosition - extractorInput.getPosition()) ? -1 : 0;
    }

    private void skipToSampleData(ExtractorInput extractorInput) {
        Pair<Long, Long> pairSkipToSampleData = WavHeaderReader.skipToSampleData(extractorInput);
        this.dataStartPosition = ((Long) pairSkipToSampleData.first).intValue();
        long jLongValue = ((Long) pairSkipToSampleData.second).longValue();
        long j8 = this.rf64SampleDataSize;
        if (j8 != -1 && jLongValue == 4294967295L) {
            jLongValue = j8;
        }
        this.dataEndPosition = ((long) this.dataStartPosition) + jLongValue;
        long length = extractorInput.getLength();
        if (length != -1) {
            long j14 = this.dataEndPosition;
            if (j14 > length) {
                StringBuilder sb3 = new StringBuilder(69);
                sb3.append("Data exceeds input length: ");
                sb3.append(j14);
                sb3.append(", ");
                sb3.append(length);
                Log.w(TAG, sb3.toString());
                this.dataEndPosition = length;
            }
        }
        ((OutputWriter) Assertions.checkNotNull(this.outputWriter)).init(this.dataStartPosition, this.dataEndPosition);
        this.state = 4;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException {
        assertInitialized();
        int i14 = this.state;
        if (i14 == 0) {
            readFileType(extractorInput);
            return 0;
        }
        if (i14 == 1) {
            readRf64SampleDataSize(extractorInput);
            return 0;
        }
        if (i14 == 2) {
            readFormat(extractorInput);
            return 0;
        }
        if (i14 == 3) {
            skipToSampleData(extractorInput);
            return 0;
        }
        if (i14 == 4) {
            return readSampleData(extractorInput);
        }
        x.h();
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j8, long j14) {
        this.state = j8 == 0 ? 0 : 4;
        OutputWriter outputWriter = this.outputWriter;
        if (outputWriter != null) {
            outputWriter.reset(j14);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return WavHeaderReader.checkFileType(extractorInput);
    }

    public static final class ImaAdPcmOutputWriter implements OutputWriter {
        private static final int[] INDEX_TABLE = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] STEP_TABLE = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private final ParsableByteArray decodedData;
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private final int framesPerBlock;
        private final byte[] inputData;
        private long outputFrameCount;
        private int pendingInputBytes;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeFrames;
        private final TrackOutput trackOutput;
        private final WavFormat wavFormat;

        public ImaAdPcmOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat) throws ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int iMax = Math.max(1, wavFormat.frameRateHz / 10);
            this.targetSampleSizeFrames = iMax;
            ParsableByteArray parsableByteArray = new ParsableByteArray(wavFormat.extraData);
            parsableByteArray.readLittleEndianUnsignedShort();
            int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
            this.framesPerBlock = littleEndianUnsignedShort;
            int i14 = wavFormat.numChannels;
            int i15 = (((wavFormat.blockSize - (i14 * 4)) * 8) / (wavFormat.bitsPerSample * i14)) + 1;
            if (littleEndianUnsignedShort == i15) {
                int iCeilDivide = Util.ceilDivide(iMax, littleEndianUnsignedShort);
                this.inputData = new byte[wavFormat.blockSize * iCeilDivide];
                this.decodedData = new ParsableByteArray(iCeilDivide * numOutputFramesToBytes(littleEndianUnsignedShort, i14));
                int i16 = ((wavFormat.frameRateHz * wavFormat.blockSize) * 8) / littleEndianUnsignedShort;
                this.format = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_RAW).setAverageBitrate(i16).setPeakBitrate(i16).setMaxInputSize(numOutputFramesToBytes(iMax, i14)).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(2).build();
                return;
            }
            StringBuilder sb3 = new StringBuilder(56);
            sb3.append("Expected frames per block: ");
            sb3.append(i15);
            sb3.append("; got: ");
            sb3.append(littleEndianUnsignedShort);
            throw ParserException.createForMalformedContainer(sb3.toString(), null);
        }

        private void decode(byte[] bArr, int i14, ParsableByteArray parsableByteArray) {
            for (int i15 = 0; i15 < i14; i15++) {
                for (int i16 = 0; i16 < this.wavFormat.numChannels; i16++) {
                    decodeBlockForChannel(bArr, i15, i16, parsableByteArray.getData());
                }
            }
            int iNumOutputFramesToBytes = numOutputFramesToBytes(this.framesPerBlock * i14);
            parsableByteArray.setPosition(0);
            parsableByteArray.setLimit(iNumOutputFramesToBytes);
        }

        private void decodeBlockForChannel(byte[] bArr, int i14, int i15, byte[] bArr2) {
            WavFormat wavFormat = this.wavFormat;
            int i16 = wavFormat.blockSize;
            int i17 = wavFormat.numChannels;
            int i18 = (i15 * 4) + (i14 * i16);
            int i19 = (i17 * 4) + i18;
            int i24 = (i16 / i17) - 4;
            int iConstrainValue = (short) (((bArr[i18 + 1] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i18] & UnsignedBytes.MAX_VALUE));
            int iMin = Math.min(bArr[i18 + 2] & UnsignedBytes.MAX_VALUE, 88);
            int i25 = STEP_TABLE[iMin];
            int i26 = ((i14 * this.framesPerBlock * i17) + i15) * 2;
            bArr2[i26] = (byte) (iConstrainValue & 255);
            bArr2[i26 + 1] = (byte) (iConstrainValue >> 8);
            for (int i27 = 0; i27 < i24 * 2; i27++) {
                byte b14 = bArr[((i27 / 8) * i17 * 4) + i19 + ((i27 / 2) % 4)];
                int i28 = i27 % 2 == 0 ? b14 & Ascii.SI : (b14 & UnsignedBytes.MAX_VALUE) >> 4;
                int iC = e5.c(i28 & 7, 2, 1, i25) >> 3;
                if ((i28 & 8) != 0) {
                    iC = -iC;
                }
                iConstrainValue = Util.constrainValue(iConstrainValue + iC, -32768, 32767);
                i26 += i17 * 2;
                bArr2[i26] = (byte) (iConstrainValue & 255);
                bArr2[i26 + 1] = (byte) (iConstrainValue >> 8);
                int i29 = iMin + INDEX_TABLE[i28];
                int[] iArr = STEP_TABLE;
                iMin = Util.constrainValue(i29, 0, iArr.length - 1);
                i25 = iArr[iMin];
            }
        }

        private int numOutputBytesToFrames(int i14) {
            return i14 / (this.wavFormat.numChannels * 2);
        }

        private int numOutputFramesToBytes(int i14) {
            return numOutputFramesToBytes(i14, this.wavFormat.numChannels);
        }

        private void writeSampleMetadata(int i14) {
            long jScaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, this.wavFormat.frameRateHz);
            int iNumOutputFramesToBytes = numOutputFramesToBytes(i14);
            this.trackOutput.sampleMetadata(jScaleLargeTimestamp, 1, iNumOutputFramesToBytes, this.pendingOutputBytes - iNumOutputFramesToBytes, null);
            this.outputFrameCount += (long) i14;
            this.pendingOutputBytes -= iNumOutputFramesToBytes;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void init(int i14, long j8) {
            this.extractorOutput.seekMap(new WavSeekMap(this.wavFormat, this.framesPerBlock, i14, j8));
            this.trackOutput.format(this.format);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j8) {
            this.pendingInputBytes = 0;
            this.startTimeUs = j8;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0038 A[LOOP:0: B:6:0x001e->B:12:0x0038, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x003e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x001b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        /* JADX WARN: Code duplicated, block: B:9:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public boolean sampleData(com.google.android.exoplayer2.extractor.ExtractorInput r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.targetSampleSizeFrames
                int r1 = r6.pendingOutputBytes
                int r1 = r6.numOutputBytesToFrames(r1)
                int r0 = r0 - r1
                int r1 = r6.framesPerBlock
                int r0 = com.google.android.exoplayer2.util.Util.ceilDivide(r0, r1)
                com.google.android.exoplayer2.extractor.wav.WavFormat r1 = r6.wavFormat
                int r1 = r1.blockSize
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.pendingInputBytes
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.inputData
                int r5 = r6.pendingInputBytes
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.pendingInputBytes
                int r4 = r4 + r3
                r6.pendingInputBytes = r4
                goto L1e
            L3e:
                int r7 = r6.pendingInputBytes
                com.google.android.exoplayer2.extractor.wav.WavFormat r8 = r6.wavFormat
                int r8 = r8.blockSize
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.inputData
                com.google.android.exoplayer2.util.ParsableByteArray r9 = r6.decodedData
                r6.decode(r8, r7, r9)
                int r8 = r6.pendingInputBytes
                com.google.android.exoplayer2.extractor.wav.WavFormat r9 = r6.wavFormat
                int r9 = r9.blockSize
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.pendingInputBytes = r8
                com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.decodedData
                int r7 = r7.limit()
                com.google.android.exoplayer2.extractor.TrackOutput r8 = r6.trackOutput
                com.google.android.exoplayer2.util.ParsableByteArray r9 = r6.decodedData
                r8.sampleData(r9, r7)
                int r8 = r6.pendingOutputBytes
                int r8 = r8 + r7
                r6.pendingOutputBytes = r8
                int r7 = r6.numOutputBytesToFrames(r8)
                int r8 = r6.targetSampleSizeFrames
                if (r7 < r8) goto L75
                r6.writeSampleMetadata(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.pendingOutputBytes
                int r7 = r6.numOutputBytesToFrames(r7)
                if (r7 <= 0) goto L82
                r6.writeSampleMetadata(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.sampleData(com.google.android.exoplayer2.extractor.ExtractorInput, long):boolean");
        }

        private static int numOutputFramesToBytes(int i14, int i15) {
            return i14 * 2 * i15;
        }
    }
}
