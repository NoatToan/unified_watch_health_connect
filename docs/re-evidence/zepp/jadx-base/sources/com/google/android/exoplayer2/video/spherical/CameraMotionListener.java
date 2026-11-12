package com.google.android.exoplayer2.video.spherical;

/* JADX INFO: loaded from: classes3.dex */
public interface CameraMotionListener {
    void onCameraMotion(long timeUs, float[] rotation);

    void onCameraMotionReset();
}
