package com.huawei.hiar;

import com.huawei.hiar.exceptions.ARFatalException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes33.dex */
public final class ARFace extends ARTrackableBase {
    private static final int DEFAULT_SIZE = 60;
    private static final int MAX_PROGRESS = 100;
    private static final int PARAMETER_FACE_HEALTH_CHECK_STATUS = 13;
    private static final int PARAMETER_FACE_HEALTH_PROC_PROGRESS = 14;

    private native long nativeAcquireBlendShapes(long j, long j2);

    private native long nativeAcquireGeometry(long j, long j2);

    private native int nativeGetHealthParameterCount(long j, long j2);

    private native int[] nativeGetHealthParameterTypeArray(long j, long j2);

    private native float[] nativeGetHealthParameterValueArray(long j, long j2);

    private native ARPose nativeGetPose(long j, long j2);

    public ARPose getPose() {
        return nativeGetPose(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public HashMap<HealthParameter, Float> getHealthParameters() {
        float[] fArrNativeGetHealthParameterValueArray = nativeGetHealthParameterValueArray(this.mSession.mNativeHandle, this.mNativeHandle);
        int[] iArrNativeGetHealthParameterTypeArray = nativeGetHealthParameterTypeArray(this.mSession.mNativeHandle, this.mNativeHandle);
        if (iArrNativeGetHealthParameterTypeArray.length != fArrNativeGetHealthParameterValueArray.length) {
            throw new ARFatalException("Unexpected array length!");
        }
        HashMap<HealthParameter, Float> map = new HashMap<>(60);
        for (int i = 0; i < iArrNativeGetHealthParameterTypeArray.length; i++) {
            int i2 = iArrNativeGetHealthParameterTypeArray[i];
            if (i2 == 13) {
                this.mSession.notifyFaceHealthCheckStateToListener((int) Math.floor(fArrNativeGetHealthParameterValueArray[i]));
            } else if (i2 == 14) {
                int iFloor = (int) Math.floor(fArrNativeGetHealthParameterValueArray[i] * 100.0f);
                if (iFloor >= 100) {
                    iFloor = 100;
                }
                this.mSession.notifyFaceHealthProcessProgressToListener(iFloor);
            } else {
                map.put(HealthParameter.forNumber(i2), Float.valueOf(fArrNativeGetHealthParameterValueArray[i]));
            }
        }
        return map;
    }

    public int getHealthParameterCount() {
        return nativeGetHealthParameterCount(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public enum HealthParameter {
        UNKNOWN_TYPE(-1),
        PARAMETER_INVALID(0),
        PARAMETER_HEART_RATE(1),
        PARAMETER_HEART_RATE_SNR(2),
        PARAMETER_HEART_RATE_CONFIDENCE(3),
        PARAMETER_BREATH_RATE(4),
        PARAMETER_BREATH_RATE_SNR(5),
        PARAMETER_BREATH_RATE_CONFIDENCE(6),
        PARAMETER_FACE_AGE(7),
        PARAMETER_GENDER_MALE_WEIGHT(8),
        PARAMETER_GENDER_FEMALE_WEIGHT(9),
        PARAMETER_HEART_WAVE(15),
        PARAMETER_SPO2_VALUE(16);

        final int nativeCode;

        static HealthParameter forNumber(int i) {
            for (HealthParameter healthParameter : values()) {
                if (healthParameter.nativeCode == i) {
                    return healthParameter;
                }
            }
            return UNKNOWN_TYPE;
        }

        HealthParameter(int i) {
            this.nativeCode = i;
        }
    }

    public ARFaceGeometry getFaceGeometry() {
        return new ARFaceGeometry(this.mSession, nativeAcquireGeometry(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public ARFaceBlendShapes getFaceBlendShapes() {
        return new ARFaceBlendShapes(this.mSession, nativeAcquireBlendShapes(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    ARFace(long j, ARSession aRSession) {
        super(j, aRSession);
    }

    private ARFace() {
        super(0L, null);
    }
}
