package com.google.android.exoplayer2.text.subrip;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class a implements Subtitle {
    private final Cue[] a;
    private final long[] b;

    public a(Cue[] cues, long[] cueTimesUs) {
        this.a = cues;
        this.b = cueTimesUs;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long timeUs) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.b, timeUs, true, false);
        if (iBinarySearchFloor != -1) {
            Cue[] cueArr = this.a;
            if (cueArr[iBinarySearchFloor] != Cue.EMPTY) {
                return Collections.singletonList(cueArr[iBinarySearchFloor]);
            }
        }
        return Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int index) {
        Assertions.checkArgument(index >= 0);
        Assertions.checkArgument(index < this.b.length);
        return this.b[index];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.b.length;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long timeUs) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.b, timeUs, false, false);
        if (iBinarySearchCeil < this.b.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
