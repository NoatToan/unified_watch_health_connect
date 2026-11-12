package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class DummyTrackOutput implements TrackOutput {
    private final byte[] readBuffer = new byte[4096];

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public void format(Format format) {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i14, boolean z14, int i15) throws EOFException {
        int i16 = dataReader.read(this.readBuffer, 0, Math.min(this.readBuffer.length, i14));
        if (i16 != -1) {
            return i16;
        }
        if (z14) {
            return -1;
        }
        h.m();
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public void sampleMetadata(long j8, int i14, int i15, int i16, TrackOutput.CryptoData cryptoData) {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i14, int i15) {
        parsableByteArray.skipBytes(i14);
    }
}
