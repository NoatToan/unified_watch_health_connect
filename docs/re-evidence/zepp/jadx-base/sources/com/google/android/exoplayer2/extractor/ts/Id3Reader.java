package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes2.dex */
public final class Id3Reader implements ElementaryStreamReader {
    private static final String g = "Id3Reader";
    private final ParsableByteArray a = new ParsableByteArray(10);
    private TrackOutput b;
    private boolean c;
    private long d;
    private int e;
    private int f;

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray data) {
        Assertions.checkStateNotNull(this.b);
        if (this.c) {
            int iBytesLeft = data.bytesLeft();
            int i = this.f;
            if (i < 10) {
                int iMin = Math.min(iBytesLeft, 10 - i);
                System.arraycopy(data.getData(), data.getPosition(), this.a.getData(), this.f, iMin);
                if (this.f + iMin == 10) {
                    this.a.setPosition(0);
                    if (73 != this.a.readUnsignedByte() || 68 != this.a.readUnsignedByte() || 51 != this.a.readUnsignedByte()) {
                        Log.w(g, "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    } else {
                        this.a.skipBytes(3);
                        this.e = this.a.readSynchSafeInt() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iBytesLeft, this.e - this.f);
            this.b.sampleData(data, iMin2);
            this.f += iMin2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        idGenerator.generateNewId();
        TrackOutput trackOutputTrack = extractorOutput.track(idGenerator.getTrackId(), 5);
        this.b = trackOutputTrack;
        trackOutputTrack.format(new Format.Builder().setId(idGenerator.getFormatId()).setSampleMimeType(MimeTypes.APPLICATION_ID3).build());
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
        int i;
        Assertions.checkStateNotNull(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            this.b.sampleMetadata(this.d, 1, i, 0, null);
            this.c = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long pesTimeUs, int flags) {
        if ((flags & 4) == 0) {
            return;
        }
        this.c = true;
        this.d = pesTimeUs;
        this.e = 0;
        this.f = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.c = false;
    }
}
