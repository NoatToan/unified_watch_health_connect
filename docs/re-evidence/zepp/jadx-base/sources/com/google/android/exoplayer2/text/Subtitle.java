package com.google.android.exoplayer2.text;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface Subtitle {
    List<Cue> getCues(long timeUs);

    long getEventTime(int index);

    int getEventTimeCount();

    int getNextEventTimeIndex(long timeUs);
}
