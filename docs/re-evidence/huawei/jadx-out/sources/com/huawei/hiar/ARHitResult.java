package com.huawei.hiar;

import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public class ARHitResult {
    static final String TAG = "ARHitResult";
    long mNativeHandle;
    final ARSession mSession;

    private native long nativeAcquireTrackable(long j, long j2);

    private native long nativeCreateAnchor(long j, long j2);

    private static native void nativeDestroyHitResult(long j);

    private native float nativeGetDistance(long j, long j2);

    private native ARPose nativeGetPose(long j, long j2);

    public String toString() {
        return String.format(Locale.ENGLISH, "AR hit result: { hit on pose: %s, with distance %f }", getHitPose().toString(), Float.valueOf(getDistance()));
    }

    public int hashCode() {
        return Long.valueOf(this.mNativeHandle).hashCode();
    }

    public ARTrackable getTrackable() {
        return this.mSession.createTrackable(nativeAcquireTrackable(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public ARPose getHitPose() {
        return nativeGetPose(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public float getDistance() {
        return nativeGetDistance(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    protected void finalize() throws Throwable {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeDestroyHitResult(j);
        }
        super.finalize();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ARHitResult) && ((ARHitResult) obj).mNativeHandle == this.mNativeHandle;
    }

    public ARAnchor createAnchor() {
        return new ARAnchor(nativeCreateAnchor(this.mSession.mNativeHandle, this.mNativeHandle), this.mSession);
    }

    ARHitResult(long j, ARSession aRSession) {
        this.mSession = aRSession;
        this.mNativeHandle = j;
    }

    protected ARHitResult() {
        this.mSession = null;
        this.mNativeHandle = 0L;
    }
}
