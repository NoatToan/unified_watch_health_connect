package com.huawei.hiar;

/* JADX INFO: loaded from: classes33.dex */
public class ARObject extends ARTrackableBase {
    private native ARPose nativeGetCenterPose(long j, long j2);

    private native int nativeGetObjectAnchorId(long j, long j2);

    private native int nativeGetObjectIndex(long j, long j2);

    private native String nativeGetObjectName(long j, long j2);

    @Override // com.huawei.hiar.ARTrackableBase, com.huawei.hiar.ARTrackable
    public ARTrackable.TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    public int getObjectID() {
        return nativeGetObjectIndex(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public int getObjectAnchorId() {
        return nativeGetObjectAnchorId(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public String getName() {
        return nativeGetObjectName(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public ARPose getCenterPose() {
        return nativeGetCenterPose(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    ARObject(long j, ARSession aRSession) {
        super(j, aRSession);
    }
}
