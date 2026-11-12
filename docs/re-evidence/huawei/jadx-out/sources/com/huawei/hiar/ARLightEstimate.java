package com.huawei.hiar;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public class ARLightEstimate {
    static final String TAG = "ARLightEstimate";
    long mNativeHandle;
    private final ARSession mSession;

    private native ByteBuffer nativeAcquireEnvironmentTexture(long j, long j2);

    private static native long nativeCreateLightEstimate(long j);

    private static native void nativeDestroyLightEstimate(long j);

    private native int nativeGetLightShadowType(long j, long j2);

    private native float nativeGetPixelIntensity(long j, long j2);

    private native float[] nativeGetPrimaryLightDirection(long j, long j2);

    private native float nativeGetPrimaryLightIntensity(long j, long j2);

    private native float nativeGetShadowStrength(long j, long j2);

    private native float[] nativeGetSphericalHarmonicCoefficients(long j, long j2);

    private native int nativeGetState(long j, long j2);

    private native float[] nativegetPrimaryLightColor(long j, long j2);

    public String toString() {
        Locale locale = Locale.ENGLISH;
        long j = this.mNativeHandle;
        return String.format(locale, "ARLightEstimate: { handle= 0x%x, light estimate with state %s, intensity %s }", Long.valueOf(j), getState().name(), Float.valueOf(getPixelIntensity()));
    }

    @Deprecated
    public boolean isValid() {
        return getState() == State.VALID;
    }

    public State getState() {
        return State.forNumber(nativeGetState(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public float[] getSphericalHarmonicCoefficients() {
        return nativeGetSphericalHarmonicCoefficients(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public float getShadowStrength() {
        return nativeGetShadowStrength(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public float getPrimaryLightIntensity() {
        return nativeGetPrimaryLightIntensity(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public float[] getPrimaryLightDirection() {
        return nativeGetPrimaryLightDirection(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public float[] getPrimaryLightColor() {
        return nativegetPrimaryLightColor(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public float getPixelIntensity() {
        return nativeGetPixelIntensity(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public LightShadowType getLightShadowType() {
        return LightShadowType.forNumber(nativeGetLightShadowType(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    protected void finalize() throws Throwable {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeDestroyLightEstimate(j);
        }
        super.finalize();
    }

    public enum LightShadowType {
        SHDOW_TYPE_UNKNOW(-1),
        SHADOW_TYPE_NONE(0),
        SHADOW_TYPE_HARD(1),
        SHADOW_TYPE_SOFT(2);

        final int nativeCode;

        static LightShadowType forNumber(int i) {
            for (LightShadowType lightShadowType : values()) {
                if (lightShadowType.nativeCode == i) {
                    return lightShadowType;
                }
            }
            return SHDOW_TYPE_UNKNOW;
        }

        LightShadowType(int i) {
            this.nativeCode = i;
        }
    }

    public enum State {
        UNKNOWN_STATE(-1),
        NOT_VALID(0),
        VALID(1);

        final int nativeCode;

        static State forNumber(int i) {
            for (State state : values()) {
                if (state.nativeCode == i) {
                    return state;
                }
            }
            return UNKNOWN_STATE;
        }

        State(int i) {
            this.nativeCode = i;
        }
    }

    public ByteBuffer acquireEnvironmentTexture() {
        ByteBuffer byteBufferNativeAcquireEnvironmentTexture = nativeAcquireEnvironmentTexture(this.mSession.mNativeHandle, this.mNativeHandle);
        if (byteBufferNativeAcquireEnvironmentTexture != null) {
            return byteBufferNativeAcquireEnvironmentTexture.asReadOnlyBuffer();
        }
        Log.e(TAG, "acquire environment texture is null.");
        return null;
    }

    ARLightEstimate(ARSession aRSession) {
        this.mSession = aRSession;
        this.mNativeHandle = nativeCreateLightEstimate(aRSession.mNativeHandle);
    }

    protected ARLightEstimate() {
        this.mSession = null;
        this.mNativeHandle = 0L;
    }
}
