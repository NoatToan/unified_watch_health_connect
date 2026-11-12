package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseMediaChunkOutput implements ChunkExtractor.TrackOutputProvider {
    private static final String c = "BaseMediaChunkOutput";
    private final int[] a;
    private final SampleQueue[] b;

    public BaseMediaChunkOutput(int[] trackTypes, SampleQueue[] sampleQueues) {
        this.a = trackTypes;
        this.b = sampleQueues;
    }

    public int[] getWriteIndices() {
        int[] iArr = new int[this.b.length];
        int i = 0;
        while (true) {
            SampleQueue[] sampleQueueArr = this.b;
            if (i >= sampleQueueArr.length) {
                return iArr;
            }
            iArr[i] = sampleQueueArr[i].getWriteIndex();
            i++;
        }
    }

    public void setSampleOffsetUs(long sampleOffsetUs) {
        for (SampleQueue sampleQueue : this.b) {
            sampleQueue.setSampleOffsetUs(sampleOffsetUs);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider
    public TrackOutput track(int id, int type) {
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unmatched track of type: ");
                sb.append(type);
                Log.e(c, sb.toString());
                return new DummyTrackOutput();
            }
            if (type == iArr[i]) {
                return this.b[i];
            }
            i++;
        }
    }
}
