package com.google.android.exoplayer2.text.ssa;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class b implements Subtitle {
    private final List<List<Cue>> a;
    private final List<Long> b;

    public b(List<List<Cue>> cues, List<Long> cueTimesUs) {
        this.a = cues;
        this.b = cueTimesUs;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long timeUs) {
        int iBinarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) this.b, Long.valueOf(timeUs), true, false);
        return iBinarySearchFloor == -1 ? Collections.emptyList() : this.a.get(iBinarySearchFloor);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int index) {
        Assertions.checkArgument(index >= 0);
        Assertions.checkArgument(index < this.b.size());
        return this.b.get(index).longValue();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.b.size();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long timeUs) {
        int iBinarySearchCeil = Util.binarySearchCeil((List<? extends Comparable<? super Long>>) this.b, Long.valueOf(timeUs), false, false);
        if (iBinarySearchCeil < this.b.size()) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
