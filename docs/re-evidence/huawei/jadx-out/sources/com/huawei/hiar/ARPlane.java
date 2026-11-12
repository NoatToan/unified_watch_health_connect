package com.huawei.hiar;

import android.util.Log;
import java.nio.FloatBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public class ARPlane extends ARTrackableBase {
    private static final String TAG = "ARPlane";

    private native long nativeAcquireSubsumedBy(long j, long j2);

    private native ARPose nativeGetCenterPose(long j, long j2);

    private native float nativeGetExtentX(long j, long j2);

    private native float nativeGetExtentZ(long j, long j2);

    private native int nativeGetLabel(long j, long j2);

    private native float[] nativeGetPolygon(long j, long j2);

    private native int nativeGetType(long j, long j2);

    private native boolean nativeIsPoseInExtents(long j, long j2, ARPose aRPose);

    private native boolean nativeIsPoseInPolygon(long j, long j2, ARPose aRPose);

    @Override // com.huawei.hiar.ARTrackableBase
    public String toString() {
        return String.format(Locale.ENGLISH, "ARPlane: { %s, plane type=%s, center pose= %s }", super.toString(), getType().name(), getCenterPose().toString());
    }

    public boolean isPoseInPolygon(ARPose aRPose) {
        if (aRPose != null) {
            return nativeIsPoseInPolygon(this.mSession.mNativeHandle, this.mNativeHandle, aRPose);
        }
        Log.e(TAG, "ARPlane isPoseInPolygon: input pose is null");
        throw new IllegalArgumentException();
    }

    public boolean isPoseInExtents(ARPose aRPose) {
        if (aRPose != null) {
            return nativeIsPoseInExtents(this.mSession.mNativeHandle, this.mNativeHandle, aRPose);
        }
        Log.e(TAG, "ARPlane isPoseInExtents: input pose is null");
        throw new IllegalArgumentException();
    }

    public PlaneType getType() {
        return PlaneType.forNumber(nativeGetType(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public ARPlane getSubsumedBy() {
        long jNativeAcquireSubsumedBy = nativeAcquireSubsumedBy(this.mSession.mNativeHandle, this.mNativeHandle);
        if (jNativeAcquireSubsumedBy == 0) {
            return null;
        }
        return new ARPlane(jNativeAcquireSubsumedBy, this.mSession);
    }

    public FloatBuffer getPlanePolygon() {
        return FloatBuffer.wrap(nativeGetPolygon(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public SemanticPlaneLabel getLabel() {
        return SemanticPlaneLabel.forNumber(nativeGetLabel(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public float getExtentZ() {
        return nativeGetExtentZ(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public float getExtentX() {
        return nativeGetExtentX(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public enum PlaneType {
        HORIZONTAL_UPWARD_FACING(0),
        HORIZONTAL_DOWNWARD_FACING(1),
        VERTICAL_FACING(2),
        UNKNOWN_FACING(3);

        final int mNativeCode;

        static PlaneType forNumber(int i) {
            for (PlaneType planeType : values()) {
                if (planeType.mNativeCode == i) {
                    return planeType;
                }
            }
            return UNKNOWN_FACING;
        }

        PlaneType(int i) {
            this.mNativeCode = i;
        }
    }

    public enum SemanticPlaneLabel {
        PLANE_OTHER(0),
        PLANE_WALL(1),
        PLANE_FLOOR(2),
        PLANE_SEAT(3),
        PLANE_TABLE(4),
        PLANE_CEILING(5),
        PLANE_DOOR(6),
        PLANE_WINDOW(7),
        PLANE_BED(8);

        final int mNativeCode;

        static SemanticPlaneLabel forNumber(int i) {
            for (SemanticPlaneLabel semanticPlaneLabel : values()) {
                if (semanticPlaneLabel.mNativeCode == i) {
                    return semanticPlaneLabel;
                }
            }
            return PLANE_OTHER;
        }

        SemanticPlaneLabel(int i) {
            this.mNativeCode = i;
        }
    }

    public ARPose getCenterPose() {
        return nativeGetCenterPose(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    ARPlane(long j, ARSession aRSession) {
        super(j, aRSession);
    }

    protected ARPlane() {
        super(0L, null);
    }
}
