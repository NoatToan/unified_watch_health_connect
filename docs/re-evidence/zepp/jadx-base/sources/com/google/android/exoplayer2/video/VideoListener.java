package com.google.android.exoplayer2.video;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface VideoListener {
    void onRenderedFirstFrame();

    void onSurfaceSizeChanged(int width, int height);

    @Deprecated
    void onVideoSizeChanged(int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio);

    void onVideoSizeChanged(VideoSize videoSize);
}
