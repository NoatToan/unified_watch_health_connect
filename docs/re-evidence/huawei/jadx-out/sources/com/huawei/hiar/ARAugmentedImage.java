package com.huawei.hiar;

import java.util.Collection;

/* JADX INFO: loaded from: classes33.dex */
public class ARAugmentedImage extends ARTrackableBase {
    private native String nativeAcquireName(long j, long j2);

    private native ARPose nativeGetCenterPose(long j, long j2);

    private native String nativeGetCloudImageId(long j, long j2);

    private native String nativeGetCloudImageMetadata(long j, long j2);

    private native float nativeGetExtentX(long j, long j2);

    private native float nativeGetExtentZ(long j, long j2);

    private native int nativeGetIndex(long j, long j2);

    @Override // com.huawei.hiar.ARTrackableBase
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.huawei.hiar.ARTrackableBase, com.huawei.hiar.ARTrackable
    public ARTrackable.TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    public String getName() {
        return nativeAcquireName(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public int getIndex() {
        return nativeGetIndex(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public float getExtentZ() {
        return nativeGetExtentZ(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public float getExtentX() {
        return nativeGetExtentX(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public String getCloudImageMetadata() {
        return nativeGetCloudImageMetadata(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public String getCloudImageId() {
        return nativeGetCloudImageId(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public ARPose getCenterPose() {
        return nativeGetCenterPose(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    @Override // com.huawei.hiar.ARTrackableBase, com.huawei.hiar.ARTrackable
    public Collection<ARAnchor> getAnchors() {
        return super.getAnchors();
    }

    @Override // com.huawei.hiar.ARTrackableBase
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    ARAugmentedImage(long j, ARSession aRSession) {
        super(j, aRSession);
    }
}
