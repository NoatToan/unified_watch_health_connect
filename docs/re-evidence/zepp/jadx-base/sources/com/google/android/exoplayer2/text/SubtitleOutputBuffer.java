package com.google.android.exoplayer2.text;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.OutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SubtitleOutputBuffer extends OutputBuffer implements Subtitle {

    @Nullable
    private Subtitle b;
    private long c;

    @Override // com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        this.b = null;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long timeUs) {
        return ((Subtitle) Assertions.checkNotNull(this.b)).getCues(timeUs - this.c);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int index) {
        return ((Subtitle) Assertions.checkNotNull(this.b)).getEventTime(index) + this.c;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return ((Subtitle) Assertions.checkNotNull(this.b)).getEventTimeCount();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long timeUs) {
        return ((Subtitle) Assertions.checkNotNull(this.b)).getNextEventTimeIndex(timeUs - this.c);
    }

    public void setContent(long timeUs, Subtitle subtitle, long subsampleOffsetUs) {
        this.timeUs = timeUs;
        this.b = subtitle;
        if (subsampleOffsetUs != Long.MAX_VALUE) {
            timeUs = subsampleOffsetUs;
        }
        this.c = timeUs;
    }
}
