package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DvbSubtitleReader implements ElementaryStreamReader {
    private final List<TsPayloadReader.DvbSubtitleInfo> a;
    private final TrackOutput[] b;
    private boolean c;
    private int d;
    private int e;
    private long f;

    public DvbSubtitleReader(List<TsPayloadReader.DvbSubtitleInfo> subtitleInfos) {
        this.a = subtitleInfos;
        this.b = new TrackOutput[subtitleInfos.size()];
    }

    private boolean a(ParsableByteArray data, int expectedValue) {
        if (data.bytesLeft() == 0) {
            return false;
        }
        if (data.readUnsignedByte() != expectedValue) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray data) {
        if (this.c) {
            if (this.d != 2 || a(data, 32)) {
                if (this.d != 1 || a(data, 0)) {
                    int position = data.getPosition();
                    int iBytesLeft = data.bytesLeft();
                    for (TrackOutput trackOutput : this.b) {
                        data.setPosition(position);
                        trackOutput.sampleData(data, iBytesLeft);
                    }
                    this.e += iBytesLeft;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        for (int i = 0; i < this.b.length; i++) {
            TsPayloadReader.DvbSubtitleInfo dvbSubtitleInfo = this.a.get(i);
            idGenerator.generateNewId();
            TrackOutput trackOutputTrack = extractorOutput.track(idGenerator.getTrackId(), 3);
            trackOutputTrack.format(new Format.Builder().setId(idGenerator.getFormatId()).setSampleMimeType(MimeTypes.APPLICATION_DVBSUBS).setInitializationData(Collections.singletonList(dvbSubtitleInfo.initializationData)).setLanguage(dvbSubtitleInfo.language).build());
            this.b[i] = trackOutputTrack;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
        if (this.c) {
            for (TrackOutput trackOutput : this.b) {
                trackOutput.sampleMetadata(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long pesTimeUs, int flags) {
        if ((flags & 4) == 0) {
            return;
        }
        this.c = true;
        this.f = pesTimeUs;
        this.e = 0;
        this.d = 2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.c = false;
    }
}
