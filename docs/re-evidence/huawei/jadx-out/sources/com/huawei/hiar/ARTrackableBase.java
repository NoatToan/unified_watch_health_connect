package com.huawei.hiar;

import java.util.Collection;
import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public class ARTrackableBase implements ARTrackable {
    private static final String TAG = "ARTrackableBase";
    final long mNativeHandle;
    final ARSession mSession;

    private native long nativeCreateAnchor(long j, long j2, ARPose aRPose);

    private native long[] nativeGetAnchors(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private static native int nativeGetType(long j, long j2);

    private static native void nativeReleaseTrackable(long j);

    public String toString() {
        Locale locale = Locale.ENGLISH;
        long j = this.mNativeHandle;
        return String.format(locale, "trackableHandle= 0x%x, trackingState=%s, anchors=%s", Long.valueOf(j), getTrackingState(), getAnchors().toString());
    }

    public int hashCode() {
        return Long.valueOf(this.mNativeHandle).hashCode();
    }

    @Override // com.huawei.hiar.ARTrackable
    public ARTrackable.TrackingState getTrackingState() {
        return ARTrackable.TrackingState.forNumber(nativeGetTrackingState(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    @Override // com.huawei.hiar.ARTrackable
    public Collection<ARAnchor> getAnchors() {
        ARSession aRSession = this.mSession;
        return aRSession.convertNativeAnchorsToCollection(nativeGetAnchors(aRSession.mNativeHandle, this.mNativeHandle));
    }

    protected void finalize() {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeReleaseTrackable(j);
        }
        super.finalize();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ARTrackableBase) && ((ARTrackableBase) obj).mNativeHandle == this.mNativeHandle;
    }

    @Override // com.huawei.hiar.ARTrackable
    public ARAnchor createAnchor(ARPose aRPose) {
        return new ARAnchor(nativeCreateAnchor(this.mSession.mNativeHandle, this.mNativeHandle, aRPose), this.mSession);
    }

    static void internalReleaseNativeHandle(long j) {
        nativeReleaseTrackable(j);
    }

    static int internalGetType(long j, long j2) {
        return nativeGetType(j, j2);
    }

    ARTrackableBase(long j, ARSession aRSession) {
        this.mSession = aRSession;
        this.mNativeHandle = j;
    }
}
