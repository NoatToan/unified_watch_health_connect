package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: classes14.dex */
public final class BaseMediaChunkOutput implements ChunkExtractor.TrackOutputProvider {
    private static final String TAG = "BaseMediaChunkOutput";
    private final SampleQueue[] sampleQueues;
    private final int[] trackTypes;

    public BaseMediaChunkOutput(int[] iArr, SampleQueue[] sampleQueueArr) {
        this.trackTypes = iArr;
        this.sampleQueues = sampleQueueArr;
    }

    public int[] getWriteIndices() {
        int[] iArr = new int[this.sampleQueues.length];
        int i14 = 0;
        while (true) {
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            if (i14 >= sampleQueueArr.length) {
                return iArr;
            }
            iArr[i14] = sampleQueueArr[i14].getWriteIndex();
            i14++;
        }
    }

    public void setSampleOffsetUs(long j8) {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.setSampleOffsetUs(j8);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider
    public TrackOutput track(int i14, int i15) {
        int i16 = 0;
        while (true) {
            int[] iArr = this.trackTypes;
            if (i16 >= iArr.length) {
                StringBuilder sb3 = new StringBuilder(36);
                sb3.append("Unmatched track of type: ");
                sb3.append(i15);
                Log.e(TAG, sb3.toString());
                return new DummyTrackOutput();
            }
            if (i15 == iArr[i16]) {
                return this.sampleQueues[i16];
            }
            i16++;
        }
    }
}
