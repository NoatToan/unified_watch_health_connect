package com.huawei.hiar;

import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public class ARCamera {
    private static final int MATRIX_LEAST_SIZE = 16;
    long mNativeHandle;
    final ARSession mSession;

    private static native long nativeAcquireCamera(long j, long j2);

    private native long nativeCreateCameraIntrinsics(long j);

    private native ARPose nativeDisplayOrientedPose(long j, long j2);

    private native void nativeGetImageIntrinsics(long j, long j2, long j3);

    private native ARPose nativeGetPose(long j, long j2);

    private native void nativeGetProjectionMatrix(long j, long j2, float[] fArr, int i, float f, float f2);

    private native int nativeGetTrackingState(long j, long j2);

    private native void nativeGetViewMatrix(long j, long j2, float[] fArr, int i);

    private static native void nativeReleaseCamera(long j);

    public String toString() {
        Locale locale = Locale.ENGLISH;
        long j = this.mNativeHandle;
        return String.format(locale, "ARCamera: {handle=0x%x, trackingState=%s, pose=%s, DisplayOrientedPose=%s}", Long.valueOf(j), getTrackingState().name(), getPose().toString(), getDisplayOrientedPose().toString());
    }

    public int hashCode() {
        return Long.valueOf(this.mNativeHandle).hashCode();
    }

    public void getViewMatrix(float[] fArr, int i) {
        if (fArr == null || i < 0 || fArr.length < i + 16) {
            throw new IllegalArgumentException();
        }
        nativeGetViewMatrix(this.mSession.mNativeHandle, this.mNativeHandle, fArr, i);
    }

    public ARTrackable.TrackingState getTrackingState() {
        return ARTrackable.TrackingState.forNumber(nativeGetTrackingState(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public void getProjectionMatrix(float[] fArr, int i, float f, float f2) {
        if (fArr == null || fArr.length < i + 16 || Float.compare(f, f2) == 0) {
            throw new IllegalArgumentException();
        }
        if (i < 0 || f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException();
        }
        nativeGetProjectionMatrix(this.mSession.mNativeHandle, this.mNativeHandle, fArr, i, Math.min(f, f2), Math.max(f, f2));
    }

    public ARPose getPose() {
        return nativeGetPose(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public ARPose getDisplayOrientedPose() {
        return nativeDisplayOrientedPose(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public ARCameraIntrinsics getCameraImageIntrinsics() {
        ARCameraIntrinsics aRCameraIntrinsics = new ARCameraIntrinsics(this.mSession, nativeCreateCameraIntrinsics(this.mSession.mNativeHandle));
        nativeGetImageIntrinsics(this.mSession.mNativeHandle, this.mNativeHandle, aRCameraIntrinsics.nativeHandle);
        return aRCameraIntrinsics;
    }

    protected void finalize() throws Throwable {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeReleaseCamera(j);
        }
        super.finalize();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ARCamera) && ((ARCamera) obj).mNativeHandle == this.mNativeHandle;
    }

    ARCamera(ARSession aRSession, ARFrame aRFrame) {
        this.mSession = aRSession;
        this.mNativeHandle = nativeAcquireCamera(aRSession.mNativeHandle, aRFrame.mNativeHandle);
    }

    private ARCamera() {
        this.mSession = null;
        this.mNativeHandle = 0L;
    }
}
