package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import j20.x;

/* JADX INFO: loaded from: classes13.dex */
public final class DtsReader implements ElementaryStreamReader {
    private static final int HEADER_SIZE = 18;
    private static final int STATE_FINDING_SYNC = 0;
    private static final int STATE_READING_HEADER = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private int bytesRead;
    private Format format;
    private String formatId;
    private final String language;
    private TrackOutput output;
    private long sampleDurationUs;
    private int sampleSize;
    private int syncBytes;
    private final ParsableByteArray headerScratchBytes = new ParsableByteArray(new byte[18]);
    private int state = 0;
    private long timeUs = C.TIME_UNSET;

    public DtsReader(String str) {
        this.language = str;
    }

    private boolean continueRead(ParsableByteArray parsableByteArray, byte[] bArr, int i14) {
        int iMin = Math.min(parsableByteArray.bytesLeft(), i14 - this.bytesRead);
        parsableByteArray.readBytes(bArr, this.bytesRead, iMin);
        int i15 = this.bytesRead + iMin;
        this.bytesRead = i15;
        return i15 == i14;
    }

    private void parseHeader() {
        byte[] data = this.headerScratchBytes.getData();
        if (this.format == null) {
            Format dtsFormat = DtsUtil.parseDtsFormat(data, this.formatId, this.language, null);
            this.format = dtsFormat;
            this.output.format(dtsFormat);
        }
        this.sampleSize = DtsUtil.getDtsFrameSize(data);
        this.sampleDurationUs = (int) ((((long) DtsUtil.parseDtsAudioSampleCount(data)) * 1000000) / ((long) this.format.sampleRate));
    }

    private boolean skipToNextSync(ParsableByteArray parsableByteArray) {
        while (parsableByteArray.bytesLeft() > 0) {
            int i14 = this.syncBytes << 8;
            this.syncBytes = i14;
            int unsignedByte = i14 | parsableByteArray.readUnsignedByte();
            this.syncBytes = unsignedByte;
            if (DtsUtil.isSyncWord(unsignedByte)) {
                byte[] data = this.headerScratchBytes.getData();
                int i15 = this.syncBytes;
                data[0] = (byte) ((i15 >> 24) & 255);
                data[1] = (byte) ((i15 >> 16) & 255);
                data[2] = (byte) ((i15 >> 8) & 255);
                data[3] = (byte) (i15 & 255);
                this.bytesRead = 4;
                this.syncBytes = 0;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        Assertions.checkStateNotNull(this.output);
        while (parsableByteArray.bytesLeft() > 0) {
            int i14 = this.state;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        x.h();
                        return;
                    }
                    int iMin = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                    this.output.sampleData(parsableByteArray, iMin);
                    int i15 = this.bytesRead + iMin;
                    this.bytesRead = i15;
                    int i16 = this.sampleSize;
                    if (i15 == i16) {
                        long j8 = this.timeUs;
                        if (j8 != C.TIME_UNSET) {
                            this.output.sampleMetadata(j8, 1, i16, 0, null);
                            this.timeUs += this.sampleDurationUs;
                        }
                        this.state = 0;
                    }
                } else if (continueRead(parsableByteArray, this.headerScratchBytes.getData(), 18)) {
                    parseHeader();
                    this.headerScratchBytes.setPosition(0);
                    this.output.sampleData(this.headerScratchBytes, 18);
                    this.state = 2;
                }
            } else if (skipToNextSync(parsableByteArray)) {
                this.state = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j8, int i14) {
        if (j8 != C.TIME_UNSET) {
            this.timeUs = j8;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.syncBytes = 0;
        this.timeUs = C.TIME_UNSET;
    }
}
