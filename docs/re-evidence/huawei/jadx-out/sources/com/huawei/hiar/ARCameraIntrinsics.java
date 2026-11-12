package com.huawei.hiar;

/* JADX INFO: loaded from: classes33.dex */
public class ARCameraIntrinsics {
    private static final int ARRAY_LENS_FIVE = 5;
    private static final int ARRAY_LENS_TWO = 2;
    private final ARSession arSession;
    long nativeHandle;

    private native void nativeDestroyCameraIntrinsics(long j, long j2);

    private native void nativeGetDistortions(long j, long j2, float[] fArr);

    private native void nativeGetFocalLength(long j, long j2, float[] fArr);

    private native void nativeGetImageDimensions(long j, long j2, int[] iArr);

    private native void nativeGetPrincipalPoint(long j, long j2, float[] fArr);

    public float[] getPrincipalPoint() {
        float[] fArr = new float[2];
        nativeGetPrincipalPoint(this.arSession.mNativeHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public int[] getImageDimensions() {
        int[] iArr = new int[2];
        nativeGetImageDimensions(this.arSession.mNativeHandle, this.nativeHandle, iArr);
        return iArr;
    }

    public float[] getFocalLength() {
        float[] fArr = new float[2];
        nativeGetFocalLength(this.arSession.mNativeHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float[] getDistortions() {
        float[] fArr = new float[5];
        nativeGetDistortions(this.arSession.mNativeHandle, this.nativeHandle, fArr);
        return fArr;
    }

    protected void finalize() throws Throwable {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyCameraIntrinsics(this.arSession.mNativeHandle, j);
        }
        super.finalize();
    }

    ARCameraIntrinsics(ARSession aRSession, long j) {
        this.arSession = aRSession;
        this.nativeHandle = j;
    }
}
