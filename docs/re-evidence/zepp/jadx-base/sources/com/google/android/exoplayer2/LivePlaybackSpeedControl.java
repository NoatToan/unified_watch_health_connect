package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public interface LivePlaybackSpeedControl {
    float getAdjustedPlaybackSpeed(long liveOffsetUs, long bufferedDurationUs);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration);

    void setTargetLiveOffsetOverrideUs(long liveOffsetUs);
}
