package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.a;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes13.dex */
public final class AdtsExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new a(11);
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    private static final int MAX_PACKET_SIZE = 2048;
    private static final int MAX_SNIFF_BYTES = 8192;
    private static final int NUM_FRAMES_FOR_AVERAGE_FRAME_SIZE = 1000;
    private int averageFrameSize;
    private ExtractorOutput extractorOutput;
    private long firstFramePosition;
    private long firstSampleTimestampUs;
    private final int flags;
    private boolean hasCalculatedAverageFrameSize;
    private boolean hasOutputSeekMap;
    private final ParsableByteArray packetBuffer;
    private final AdtsReader reader;
    private final ParsableByteArray scratch;
    private final ParsableBitArray scratchBits;
    private boolean startedPacket;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AdtsExtractor(int i14) {
        this.flags = (i14 & 2) != 0 ? i14 | 1 : i14;
        this.reader = new AdtsReader(true);
        this.packetBuffer = new ParsableByteArray(2048);
        this.averageFrameSize = -1;
        this.firstFramePosition = -1L;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        this.scratch = parsableByteArray;
        this.scratchBits = new ParsableBitArray(parsableByteArray.getData());
    }

    private void calculateAverageFrameSize(ExtractorInput extractorInput) throws ParserException {
        if (this.hasCalculatedAverageFrameSize) {
            return;
        }
        this.averageFrameSize = -1;
        extractorInput.resetPeekPosition();
        long j8 = 0;
        if (extractorInput.getPosition() == 0) {
            peekId3Header(extractorInput);
        }
        int i14 = 0;
        int i15 = 0;
        while (true) {
            try {
                if (extractorInput.peekFully(this.scratch.getData(), 0, 2, true)) {
                    this.scratch.setPosition(0);
                    if (!AdtsReader.isAdtsSyncWord(this.scratch.readUnsignedShort())) {
                        break;
                    }
                    if (extractorInput.peekFully(this.scratch.getData(), 0, 4, true)) {
                        this.scratchBits.setPosition(14);
                        int bits = this.scratchBits.readBits(13);
                        if (bits <= 6) {
                            this.hasCalculatedAverageFrameSize = true;
                            throw ParserException.createForMalformedContainer("Malformed ADTS stream", null);
                        }
                        j8 += (long) bits;
                        i15++;
                        if (i15 != 1000 && extractorInput.advancePeekPosition(bits - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i14 = i15;
            break;
        }
        extractorInput.resetPeekPosition();
        if (i14 > 0) {
            this.averageFrameSize = (int) (j8 / ((long) i14));
        } else {
            this.averageFrameSize = -1;
        }
        this.hasCalculatedAverageFrameSize = true;
    }

    private static int getBitrateFromFrameSize(int i14, long j8) {
        return (int) ((((long) (i14 * 8)) * 1000000) / j8);
    }

    private SeekMap getConstantBitrateSeekMap(long j8, boolean z14) {
        return new ConstantBitrateSeekMap(j8, this.firstFramePosition, getBitrateFromFrameSize(this.averageFrameSize, this.reader.getSampleDurationUs()), this.averageFrameSize, z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new AdtsExtractor()};
    }

    private void maybeOutputSeekMap(long j8, boolean z14) {
        if (this.hasOutputSeekMap) {
            return;
        }
        boolean z15 = (this.flags & 1) != 0 && this.averageFrameSize > 0;
        if (z15 && this.reader.getSampleDurationUs() == C.TIME_UNSET && !z14) {
            return;
        }
        if (!z15 || this.reader.getSampleDurationUs() == C.TIME_UNSET) {
            this.extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        } else {
            this.extractorOutput.seekMap(getConstantBitrateSeekMap(j8, (this.flags & 2) != 0));
        }
        this.hasOutputSeekMap = true;
    }

    private int peekId3Header(ExtractorInput extractorInput) {
        int i14 = 0;
        while (true) {
            extractorInput.peekFully(this.scratch.getData(), 0, 10);
            this.scratch.setPosition(0);
            if (this.scratch.readUnsignedInt24() != 4801587) {
                break;
            }
            this.scratch.skipBytes(3);
            int synchSafeInt = this.scratch.readSynchSafeInt();
            i14 += synchSafeInt + 10;
            extractorInput.advancePeekPosition(synchSafeInt);
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i14);
        if (this.firstFramePosition == -1) {
            this.firstFramePosition = i14;
        }
        return i14;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.reader.createTracks(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException {
        Assertions.checkStateNotNull(this.extractorOutput);
        long length = extractorInput.getLength();
        int i14 = this.flags;
        if ((i14 & 2) != 0 || ((i14 & 1) != 0 && length != -1)) {
            calculateAverageFrameSize(extractorInput);
        }
        int i15 = extractorInput.read(this.packetBuffer.getData(), 0, 2048);
        boolean z14 = i15 == -1;
        maybeOutputSeekMap(length, z14);
        if (z14) {
            return -1;
        }
        this.packetBuffer.setPosition(0);
        this.packetBuffer.setLimit(i15);
        if (!this.startedPacket) {
            this.reader.packetStarted(this.firstSampleTimestampUs, 4);
            this.startedPacket = true;
        }
        this.reader.consume(this.packetBuffer);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j8, long j14) {
        this.startedPacket = false;
        this.reader.seek();
        this.firstSampleTimestampUs = j14;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        int iPeekId3Header = peekId3Header(extractorInput);
        int i14 = iPeekId3Header;
        int i15 = 0;
        int i16 = 0;
        do {
            extractorInput.peekFully(this.scratch.getData(), 0, 2);
            this.scratch.setPosition(0);
            if (AdtsReader.isAdtsSyncWord(this.scratch.readUnsignedShort())) {
                i15++;
                if (i15 >= 4 && i16 > 188) {
                    return true;
                }
                extractorInput.peekFully(this.scratch.getData(), 0, 4);
                this.scratchBits.setPosition(14);
                int bits = this.scratchBits.readBits(13);
                if (bits <= 6) {
                    i14++;
                    extractorInput.resetPeekPosition();
                    extractorInput.advancePeekPosition(i14);
                } else {
                    extractorInput.advancePeekPosition(bits - 6);
                    i16 += bits;
                }
            } else {
                i14++;
                extractorInput.resetPeekPosition();
                extractorInput.advancePeekPosition(i14);
            }
            i15 = 0;
            i16 = 0;
        } while (i14 - iPeekId3Header < 8192);
        return false;
    }

    public AdtsExtractor() {
        this(0);
    }
}
