package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes13.dex */
public final class DummyExtractorOutput implements ExtractorOutput {
    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public TrackOutput track(int i14, int i15) {
        return new DummyTrackOutput();
    }
}
