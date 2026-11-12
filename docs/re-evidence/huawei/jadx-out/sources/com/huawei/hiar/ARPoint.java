package com.huawei.hiar;

import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public class ARPoint extends ARTrackableBase {
    static final int AR_POINT_ORIENTATION_ESTIMATED_SURFACE_NORMAL = 1;
    static final int AR_POINT_ORIENTATION_INITIALIZED_TO_IDENTITY = 0;

    private native int nativeGetOrientationMode(long j, long j2);

    private native ARPose nativeGetPose(long j, long j2);

    @Override // com.huawei.hiar.ARTrackableBase
    public String toString() {
        return String.format(Locale.ENGLISH, "ARPoint: { %s, pose=%s, orientationMode=%s }", super.toString(), getPose().toString(), getOrientationMode().name());
    }

    public enum OrientationMode {
        UNKNOWN_MODE(-1),
        INITIALIZED_TO_IDENTITY(0),
        ESTIMATED_SURFACE_NORMAL(1);

        private final int nativeCode;

        static OrientationMode forNumber(int i) {
            for (OrientationMode orientationMode : values()) {
                if (orientationMode.nativeCode == i) {
                    return orientationMode;
                }
            }
            return UNKNOWN_MODE;
        }

        OrientationMode(int i) {
            this.nativeCode = i;
        }
    }

    ARPose getPose() {
        return nativeGetPose(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public OrientationMode getOrientationMode() {
        return OrientationMode.forNumber(nativeGetOrientationMode(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    ARPoint(long j, ARSession aRSession) {
        super(j, aRSession);
    }

    protected ARPoint() {
        super(0L, null);
    }
}
