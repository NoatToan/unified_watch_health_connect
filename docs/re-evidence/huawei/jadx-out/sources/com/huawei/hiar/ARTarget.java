package com.huawei.hiar;

/* JADX INFO: loaded from: classes33.dex */
public class ARTarget extends ARTrackableBase {
    private native float[] nativeGetAxisAlignBoundingBox(long j, long j2);

    private native ARPose nativeGetCenterPose(long j, long j2);

    private native int nativeGetLabel(long j, long j2);

    private native float nativeGetRadius(long j, long j2);

    private native int nativeGetShapeType(long j, long j2);

    public TargetShapeType getShapeType() {
        return TargetShapeType.forNumber(nativeGetShapeType(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public float getRadius() {
        return nativeGetRadius(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public enum TargetLabel {
        TARGET_INVALID(-1),
        TARGET_OTHER(0),
        TARGET_SEAT(1),
        TARGET_TABLE(2);

        final int nativeCode;

        static TargetLabel forNumber(int i) {
            for (TargetLabel targetLabel : values()) {
                if (targetLabel.nativeCode == i) {
                    return targetLabel;
                }
            }
            return TARGET_INVALID;
        }

        TargetLabel(int i) {
            this.nativeCode = i;
        }
    }

    public enum TargetShapeType {
        TARGET_SHAPE_INVALID(-1),
        TARGET_SHAPE_OTHER(0),
        TARGET_SHAPE_BOX(1),
        TARGET_SHAPE_CIRCLE(2),
        TARGET_SHAPE_RECT(3);

        final int nativeCode;

        static TargetShapeType forNumber(int i) {
            for (TargetShapeType targetShapeType : values()) {
                if (targetShapeType.nativeCode == i) {
                    return targetShapeType;
                }
            }
            return TARGET_SHAPE_INVALID;
        }

        TargetShapeType(int i) {
            this.nativeCode = i;
        }
    }

    public TargetLabel getLabel() {
        return TargetLabel.forNumber(nativeGetLabel(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public ARPose getCenterPose() {
        return nativeGetCenterPose(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public float[] getAxisAlignBoundingBox() {
        return nativeGetAxisAlignBoundingBox(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    ARTarget(long j, ARSession aRSession) {
        super(j, aRSession);
    }
}
