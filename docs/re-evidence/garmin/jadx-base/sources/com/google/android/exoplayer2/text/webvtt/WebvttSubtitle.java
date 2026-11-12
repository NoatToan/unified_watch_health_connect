package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
final class WebvttSubtitle implements Subtitle {
    private final List<WebvttCueInfo> cueInfos;
    private final long[] cueTimesUs;
    private final long[] sortedCueTimesUs;

    public WebvttSubtitle(List<WebvttCueInfo> list) {
        this.cueInfos = Collections.unmodifiableList(new ArrayList(list));
        this.cueTimesUs = new long[list.size() * 2];
        for (int i14 = 0; i14 < list.size(); i14++) {
            WebvttCueInfo webvttCueInfo = list.get(i14);
            int i15 = i14 * 2;
            long[] jArr = this.cueTimesUs;
            jArr[i15] = webvttCueInfo.startTimeUs;
            jArr[i15 + 1] = webvttCueInfo.endTimeUs;
        }
        long[] jArr2 = this.cueTimesUs;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.sortedCueTimesUs = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getCues$0(WebvttCueInfo webvttCueInfo, WebvttCueInfo webvttCueInfo2) {
        return Long.compare(webvttCueInfo.startTimeUs, webvttCueInfo2.startTimeUs);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i14 = 0; i14 < this.cueInfos.size(); i14++) {
            long[] jArr = this.cueTimesUs;
            int i15 = i14 * 2;
            if (jArr[i15] <= j8 && j8 < jArr[i15 + 1]) {
                WebvttCueInfo webvttCueInfo = this.cueInfos.get(i14);
                Cue cue = webvttCueInfo.cue;
                if (cue.line == -3.4028235E38f) {
                    arrayList2.add(webvttCueInfo);
                } else {
                    arrayList.add(cue);
                }
            }
        }
        Collections.sort(arrayList2, new a(1));
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            arrayList.add(((WebvttCueInfo) arrayList2.get(i16)).cue.buildUpon().setLine((-1) - i16, 1).build());
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i14) {
        Assertions.checkArgument(i14 >= 0);
        Assertions.checkArgument(i14 < this.sortedCueTimesUs.length);
        return this.sortedCueTimesUs[i14];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.sortedCueTimesUs.length;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j8) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.sortedCueTimesUs, j8, false, false);
        if (iBinarySearchCeil < this.sortedCueTimesUs.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
