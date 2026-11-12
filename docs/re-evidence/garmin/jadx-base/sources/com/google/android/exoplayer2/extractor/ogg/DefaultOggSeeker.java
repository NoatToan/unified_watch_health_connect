package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import j20.x;
import java.io.EOFException;
import java.io.IOException;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
final class DefaultOggSeeker implements OggSeeker {
    private static final int DEFAULT_OFFSET = 30000;
    private static final int MATCH_BYTE_RANGE = 100000;
    private static final int MATCH_RANGE = 72000;
    private static final int STATE_IDLE = 4;
    private static final int STATE_READ_LAST_PAGE = 1;
    private static final int STATE_SEEK = 2;
    private static final int STATE_SEEK_TO_END = 0;
    private static final int STATE_SKIP = 3;
    private long end;
    private long endGranule;
    private final OggPageHeader pageHeader;
    private final long payloadEndPosition;
    private final long payloadStartPosition;
    private long positionBeforeSeekToEnd;
    private long start;
    private long startGranule;
    private int state;
    private final StreamReader streamReader;
    private long targetGranule;
    private long totalGranules;

    public final class OggSeekMap implements SeekMap {
        private OggSeekMap() {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return DefaultOggSeeker.this.streamReader.convertGranuleToTime(DefaultOggSeeker.this.totalGranules);
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j8) {
            long jConvertTimeToGranule = DefaultOggSeeker.this.streamReader.convertTimeToGranule(j8);
            return new SeekMap.SeekPoints(new SeekPoint(j8, Util.constrainValue(((((DefaultOggSeeker.this.payloadEndPosition - DefaultOggSeeker.this.payloadStartPosition) * jConvertTimeToGranule) / DefaultOggSeeker.this.totalGranules) + DefaultOggSeeker.this.payloadStartPosition) - 30000, DefaultOggSeeker.this.payloadStartPosition, DefaultOggSeeker.this.payloadEndPosition - 1)));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }
    }

    public DefaultOggSeeker(StreamReader streamReader, long j8, long j14, long j15, long j16, boolean z14) {
        Assertions.checkArgument(j8 >= 0 && j14 > j8);
        this.streamReader = streamReader;
        this.payloadStartPosition = j8;
        this.payloadEndPosition = j14;
        if (j15 == j14 - j8 || z14) {
            this.totalGranules = j16;
            this.state = 4;
        } else {
            this.state = 0;
        }
        this.pageHeader = new OggPageHeader();
    }

    private long getNextSeekPosition(ExtractorInput extractorInput) throws IOException {
        if (this.start == this.end) {
            return -1L;
        }
        long position = extractorInput.getPosition();
        if (!this.pageHeader.skipToNextPage(extractorInput, this.end)) {
            long j8 = this.start;
            if (j8 != position) {
                return j8;
            }
            h.C("No ogg page can be found.");
            return 0L;
        }
        this.pageHeader.populate(extractorInput, false);
        extractorInput.resetPeekPosition();
        long j14 = this.targetGranule;
        OggPageHeader oggPageHeader = this.pageHeader;
        long j15 = oggPageHeader.granulePosition;
        long j16 = j14 - j15;
        int i14 = oggPageHeader.headerSize + oggPageHeader.bodySize;
        if (0 <= j16 && j16 < 72000) {
            return -1L;
        }
        if (j16 < 0) {
            this.end = position;
            this.endGranule = j15;
        } else {
            this.start = extractorInput.getPosition() + ((long) i14);
            this.startGranule = this.pageHeader.granulePosition;
        }
        long j17 = this.end;
        long j18 = this.start;
        if (j17 - j18 < 100000) {
            this.end = j18;
            return j18;
        }
        long position2 = extractorInput.getPosition() - (((long) i14) * (j16 <= 0 ? 2L : 1L));
        long j19 = this.end;
        long j24 = this.start;
        return Util.constrainValue((((j19 - j24) * j16) / (this.endGranule - this.startGranule)) + position2, j24, j19 - 1);
    }

    private void skipToPageOfTargetGranule(ExtractorInput extractorInput) throws ParserException {
        while (true) {
            this.pageHeader.skipToNextPage(extractorInput);
            this.pageHeader.populate(extractorInput, false);
            OggPageHeader oggPageHeader = this.pageHeader;
            if (oggPageHeader.granulePosition > this.targetGranule) {
                extractorInput.resetPeekPosition();
                return;
            } else {
                extractorInput.skipFully(oggPageHeader.headerSize + oggPageHeader.bodySize);
                this.start = extractorInput.getPosition();
                this.startGranule = this.pageHeader.granulePosition;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public OggSeekMap createSeekMap() {
        if (this.totalGranules != 0) {
            return new OggSeekMap();
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public long read(ExtractorInput extractorInput) throws IOException {
        int i14 = this.state;
        if (i14 == 0) {
            long position = extractorInput.getPosition();
            this.positionBeforeSeekToEnd = position;
            this.state = 1;
            long j8 = this.payloadEndPosition - 65307;
            if (j8 > position) {
                return j8;
            }
        } else if (i14 != 1) {
            if (i14 == 2) {
                long nextSeekPosition = getNextSeekPosition(extractorInput);
                if (nextSeekPosition != -1) {
                    return nextSeekPosition;
                }
                this.state = 3;
            } else if (i14 != 3) {
                if (i14 == 4) {
                    return -1L;
                }
                x.h();
                return 0L;
            }
            skipToPageOfTargetGranule(extractorInput);
            this.state = 4;
            return -(this.startGranule + 2);
        }
        this.totalGranules = readGranuleOfLastPage(extractorInput);
        this.state = 4;
        return this.positionBeforeSeekToEnd;
    }

    public long readGranuleOfLastPage(ExtractorInput extractorInput) throws ParserException, EOFException {
        this.pageHeader.reset();
        if (!this.pageHeader.skipToNextPage(extractorInput)) {
            h.m();
            return 0L;
        }
        this.pageHeader.populate(extractorInput, false);
        OggPageHeader oggPageHeader = this.pageHeader;
        extractorInput.skipFully(oggPageHeader.headerSize + oggPageHeader.bodySize);
        long j8 = this.pageHeader.granulePosition;
        while (true) {
            OggPageHeader oggPageHeader2 = this.pageHeader;
            if ((oggPageHeader2.type & 4) == 4 || !oggPageHeader2.skipToNextPage(extractorInput) || extractorInput.getPosition() >= this.payloadEndPosition || !this.pageHeader.populate(extractorInput, true)) {
                break;
            }
            OggPageHeader oggPageHeader3 = this.pageHeader;
            if (!ExtractorUtil.skipFullyQuietly(extractorInput, oggPageHeader3.headerSize + oggPageHeader3.bodySize)) {
                break;
            }
            j8 = this.pageHeader.granulePosition;
        }
        return j8;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public void startSeek(long j8) {
        this.targetGranule = Util.constrainValue(j8, 0L, this.totalGranules - 1);
        this.state = 2;
        this.start = this.payloadStartPosition;
        this.end = this.payloadEndPosition;
        this.startGranule = 0L;
        this.endGranule = this.totalGranules;
    }
}
