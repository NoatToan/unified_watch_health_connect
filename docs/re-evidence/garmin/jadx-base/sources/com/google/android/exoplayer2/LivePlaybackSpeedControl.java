package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes13.dex */
public interface LivePlaybackSpeedControl {
    float getAdjustedPlaybackSpeed(long j8, long j14);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration);

    void setTargetLiveOffsetOverrideUs(long j8);
}
