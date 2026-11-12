package com.huawei.hiar;

import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public class ARAnchor {
    private static final String TAG = "ARAnchor";
    long mNativeHandle;
    private final ARSession mSession;

    private native void nativeDetach(long j, long j2);

    private native ARPose nativeGetPose(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private static native void nativeReleaseAnchor(long j);

    @Deprecated
    public int getId() {
        return 0;
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        long j = this.mNativeHandle;
        return String.format(locale, "ARAnchor{ handle=0x%x, tracking state is %s}", Long.valueOf(j), getTrackingState().name());
    }

    public int hashCode() {
        return Long.valueOf(this.mNativeHandle).hashCode();
    }

    public ARTrackable.TrackingState getTrackingState() {
        return ARTrackable.TrackingState.forNumber(nativeGetTrackingState(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public ARPose getPose() {
        return nativeGetPose(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    protected void finalize() throws Throwable {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeReleaseAnchor(j);
        }
        super.finalize();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ARAnchor) && ((ARAnchor) obj).mNativeHandle == this.mNativeHandle;
    }

    public void detach() {
        nativeDetach(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    ARAnchor(long j, ARSession aRSession) {
        this.mSession = aRSession;
        this.mNativeHandle = j;
    }

    private ARAnchor() {
        this.mSession = null;
        this.mNativeHandle = 0L;
    }
}
