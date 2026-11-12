package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.DecoderOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public abstract class SubtitleOutputBuffer extends DecoderOutputBuffer implements Subtitle {
    private long subsampleOffsetUs;
    private Subtitle subtitle;

    @Override // com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        this.subtitle = null;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j8) {
        return ((Subtitle) Assertions.checkNotNull(this.subtitle)).getCues(j8 - this.subsampleOffsetUs);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i14) {
        return ((Subtitle) Assertions.checkNotNull(this.subtitle)).getEventTime(i14) + this.subsampleOffsetUs;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return ((Subtitle) Assertions.checkNotNull(this.subtitle)).getEventTimeCount();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j8) {
        return ((Subtitle) Assertions.checkNotNull(this.subtitle)).getNextEventTimeIndex(j8 - this.subsampleOffsetUs);
    }

    public void setContent(long j8, Subtitle subtitle, long j14) {
        this.timeUs = j8;
        this.subtitle = subtitle;
        if (j14 != Long.MAX_VALUE) {
            j8 = j14;
        }
        this.subsampleOffsetUs = j8;
    }
}
