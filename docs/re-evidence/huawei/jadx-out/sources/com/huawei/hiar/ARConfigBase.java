package com.huawei.hiar;

import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public abstract class ARConfigBase {
    private static final String[] AR_TYPE_STRINGS = {"worldAR", "bodyAR", "handGestureAR", "handSkeletonAR", "faceAR", "imageAR"};
    public static final String AR_TYPE_UNSUPPORTED_MESSAGE = "ARType is unsupported.";
    protected static final int BODY_AR = 2;
    private static final int DEFAULT_SIZE = 16;
    public static final int ENABLE_CLOUD_ANCHOR = 16;
    public static final int ENABLE_CLOUD_AUGMENTED_IMAGE = 32;
    public static final int ENABLE_CLOUD_OBJECT_RECOGNITION = 1024;
    public static final int ENABLE_DEPTH = 1;
    public static final int ENABLE_FLASH_MODE_TORCH = 128;
    public static final int ENABLE_HEALTH_DEVICE = 64;
    public static final int ENABLE_MASK = 2;
    public static final int ENABLE_MESH = 4;
    public static final int ENABLE_NULL = 0;
    protected static final int FACE_AR = 16;
    protected static final int HAND_AR = 4;
    protected static final int IMAGE_AR = 128;
    protected static final int INSTANT_AR = 512;
    public static final int LIGHT_MODE_ALL = 65535;
    public static final int LIGHT_MODE_AMBIENT_INTENSITY = 1;
    public static final int LIGHT_MODE_ENVIRONMENT_LIGHTING = 2;
    public static final int LIGHT_MODE_ENVIRONMENT_TEXTURE = 4;
    public static final int LIGHT_MODE_NONE = 0;
    private static final String M_SESSION_IS_NULL = "mSession is null!";
    public static final int OFFSET_1 = 1;
    public static final int OFFSET_10 = 10;
    public static final int OFFSET_2 = 2;
    public static final int OFFSET_3 = 3;
    public static final int OFFSET_4 = 4;
    public static final int OFFSET_5 = 5;
    public static final int OFFSET_6 = 6;
    public static final int OFFSET_7 = 7;
    public static final int OFFSET_9 = 9;

    @Deprecated
    public static final int SEMANTIC_BOX = 2;
    public static final int SEMANTIC_NONE = 0;
    public static final int SEMANTIC_PLANE = 1;
    public static final int SEMANTIC_TARGET = 2;
    private static final String TAG = "ARConfigBase";
    protected static final int WORLD_AR = 1;
    long mNativeHandle;
    ARSession mSession;

    private static native long nativeCreate(long j);

    private static native void nativeDestroy(long j);

    private native int nativeGetArType(long j, long j2);

    private native long nativeGetAugmentedImageDatabase(long j, long j2);

    private native int nativeGetCameraLensFacing(long j, long j2);

    private native long nativeGetEnableItem(long j, long j2);

    private native long nativeGetFaceDetectMode(long j, long j2);

    private native int nativeGetFocusMode(long j, long j2);

    private native int nativeGetHandFindingMode(long j, long j2);

    private native int nativeGetImageInputMode(long j, long j2);

    private native int[] nativeGetInputSurfaceTypes(long j, long j2);

    private native Surface[] nativeGetInputSurfaces(long j, long j2);

    private native int nativeGetLightEstimationMode(long j, long j2);

    private native long nativeGetMaxMapSize(long j, long j2);

    private native int nativeGetPlaneFindingMode(long j, long j2);

    private native int nativeGetPowerMode(long j, long j2);

    private native int nativeGetSemanticMode(long j, long j2);

    private native int nativeGetUpdateMode(long j, long j2);

    private native void nativeSetArType(long j, long j2, int i);

    private native void nativeSetAugmentedImageDatabase(long j, long j2, long j3);

    private native void nativeSetCameraLensFacing(long j, long j2, int i);

    private native void nativeSetEnableItem(long j, long j2, long j3);

    private native void nativeSetFaceDetectMode(long j, long j2, long j3);

    private native void nativeSetFocusMode(long j, long j2, int i);

    private native void nativeSetHandFindingMode(long j, long j2, int i);

    private native void nativeSetImageInputMode(long j, long j2, int i);

    private native void nativeSetLightEstimationMode(long j, long j2, int i);

    private native void nativeSetMaxMapSize(long j, long j2, long j3);

    private native void nativeSetPlaneFindingMode(long j, long j2, int i);

    private native void nativeSetPowerMode(long j, long j2, int i);

    private native void nativeSetPreviewSize(long j, long j2, int i, int i2);

    private native void nativeSetSemanticMode(long j, long j2, int i);

    private native void nativeSetUpdateMode(long j, long j2, int i);

    public String toString() {
        Locale locale = Locale.ENGLISH;
        String arTypeString = getArTypeString();
        CameraLensFacing cameraLensFacing = getCameraLensFacing();
        UpdateMode updateMode = getUpdateMode();
        int lightingMode = getLightingMode();
        return String.format(locale, "ARConfigBase: { AR type %s, CameraLensFacing=%s, UpdateMode=%s,  LightingMode=%s, PlaneFindingMode=%s }", arTypeString, cameraLensFacing, updateMode, Integer.valueOf(lightingMode), getPlaneFindingMode());
    }

    public void setUpdateMode(UpdateMode updateMode) {
        nativeSetUpdateMode(this.mSession.mNativeHandle, this.mNativeHandle, updateMode.mNativeCode);
    }

    void setSession(ARSession aRSession) {
        this.mSession = aRSession;
        this.mNativeHandle = nativeCreate(aRSession.mNativeHandle);
    }

    public void setSemanticMode(int i) {
        nativeSetSemanticMode(this.mSession.mNativeHandle, this.mNativeHandle, i);
    }

    public void setPreviewSize(int i, int i2) {
        nativeSetPreviewSize(this.mSession.mNativeHandle, this.mNativeHandle, i, i2);
        ARServiceProxy.setPreviewSize(i, i2);
    }

    public void setPowerMode(PowerMode powerMode) {
        nativeSetPowerMode(this.mSession.mNativeHandle, this.mNativeHandle, powerMode.mNativeCode);
    }

    void setPlaneFindingMode(PlaneFindingMode planeFindingMode) {
        nativeSetPlaneFindingMode(this.mSession.mNativeHandle, this.mNativeHandle, planeFindingMode.mNativeCode);
    }

    public void setMaxMapSize(long j) {
        nativeSetMaxMapSize(this.mSession.mNativeHandle, this.mNativeHandle, j);
    }

    public void setLightingMode(int i) {
        nativeSetLightEstimationMode(this.mSession.mNativeHandle, this.mNativeHandle, i);
    }

    public void setImageInputMode(ImageInputMode imageInputMode) {
        ARSession aRSession = this.mSession;
        if (aRSession != null) {
            nativeSetImageInputMode(aRSession.mNativeHandle, this.mNativeHandle, imageInputMode.mNativeCode);
        } else {
            Log.e(TAG, M_SESSION_IS_NULL);
            throw new IllegalArgumentException(M_SESSION_IS_NULL);
        }
    }

    @Deprecated
    void setHandFindingMode(HandFindingMode handFindingMode) {
        nativeSetHandFindingMode(this.mSession.mNativeHandle, this.mNativeHandle, handFindingMode.mNativeCode);
    }

    public void setFocusMode(FocusMode focusMode) {
        nativeSetFocusMode(this.mSession.mNativeHandle, this.mNativeHandle, focusMode.mNativeCode);
    }

    void setFaceDetectMode(long j) {
        nativeSetFaceDetectMode(this.mSession.mNativeHandle, this.mNativeHandle, j);
    }

    public void setEnableItem(long j) {
        nativeSetEnableItem(this.mSession.mNativeHandle, this.mNativeHandle, j);
    }

    void setCameraLensFacing(CameraLensFacing cameraLensFacing) {
        ARSession aRSession;
        if (cameraLensFacing == null || (aRSession = this.mSession) == null) {
            Log.e(TAG, "Parameter is null!");
            throw new IllegalArgumentException("Parameter is null!");
        }
        nativeSetCameraLensFacing(aRSession.mNativeHandle, this.mNativeHandle, cameraLensFacing.nativeCode);
    }

    void setAugmentedImageDatabase(ARAugmentedImageDatabase aRAugmentedImageDatabase) {
        nativeSetAugmentedImageDatabase(this.mSession.mNativeHandle, this.mNativeHandle, aRAugmentedImageDatabase.mNativeDatabaseHandle);
    }

    void setArType(int i) {
        ARSession aRSession = this.mSession;
        if (aRSession != null) {
            nativeSetArType(aRSession.mNativeHandle, this.mNativeHandle, i);
        } else {
            Log.e(TAG, M_SESSION_IS_NULL);
            throw new IllegalArgumentException(M_SESSION_IS_NULL);
        }
    }

    public UpdateMode getUpdateMode() {
        return UpdateMode.forNumber(nativeGetUpdateMode(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public int getSemanticMode() {
        return nativeGetSemanticMode(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public PowerMode getPowerMode() {
        return PowerMode.forNumber(nativeGetPowerMode(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    PlaneFindingMode getPlaneFindingMode() {
        return PlaneFindingMode.forNumber(nativeGetPlaneFindingMode(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public long getMaxMapSize() {
        return nativeGetMaxMapSize(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public int getLightingMode() {
        return nativeGetLightEstimationMode(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public List<Surface> getImageInputSurfaces() {
        ARSession aRSession = this.mSession;
        if (aRSession != null) {
            return Arrays.asList(nativeGetInputSurfaces(aRSession.mNativeHandle, this.mNativeHandle));
        }
        Log.e(TAG, M_SESSION_IS_NULL);
        throw new IllegalArgumentException(M_SESSION_IS_NULL);
    }

    public List<SurfaceType> getImageInputSurfaceTypes() {
        ARSession aRSession = this.mSession;
        if (aRSession == null) {
            Log.e(TAG, M_SESSION_IS_NULL);
            throw new IllegalArgumentException(M_SESSION_IS_NULL);
        }
        int[] iArrNativeGetInputSurfaceTypes = nativeGetInputSurfaceTypes(aRSession.mNativeHandle, this.mNativeHandle);
        ArrayList arrayList = new ArrayList(iArrNativeGetInputSurfaceTypes.length);
        for (int i : iArrNativeGetInputSurfaceTypes) {
            arrayList.add(SurfaceType.forNumber(i));
        }
        return arrayList;
    }

    public ImageInputMode getImageInputMode() {
        ARSession aRSession = this.mSession;
        if (aRSession != null) {
            return ImageInputMode.forNumber(nativeGetImageInputMode(aRSession.mNativeHandle, this.mNativeHandle));
        }
        Log.e(TAG, M_SESSION_IS_NULL);
        throw new IllegalArgumentException(M_SESSION_IS_NULL);
    }

    @Deprecated
    HandFindingMode getHandFindingMode() {
        return HandFindingMode.forNumber(nativeGetHandFindingMode(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public FocusMode getFocusMode() {
        return FocusMode.forNumber(nativeGetFocusMode(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    long getFaceDetectMode() {
        return nativeGetFaceDetectMode(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public long getEnableItem() {
        return nativeGetEnableItem(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    CameraLensFacing getCameraLensFacing() {
        return CameraLensFacing.forNumber(nativeGetCameraLensFacing(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public enum FaceDetectMode {
        UNKNOWN_MODE(-1),
        HEALTH_ENABLE_HEART_RATE(1),
        HEALTH_ENABLE_BREATH_RATE(2),
        HEALTH_ENABLE_LIVE_DETECTION(4),
        HEALTH_ENABLE_DEFAULT(7),
        HEALTH_ENABLE_SP02(8),
        HEALTH_ENABLE_STRESS(16),
        FACE_ENABLE_MESH(256),
        FACE_ENABLE_BLEND_SHAPE(512),
        FACE_ENABLE_MULTIFACE(2048),
        FACE_ENABLE_DEFAULT(768);

        final long mNativeCode;

        public long getEnumValue() {
            return this.mNativeCode;
        }

        static FaceDetectMode forNumber(long j) {
            for (FaceDetectMode faceDetectMode : values()) {
                if (faceDetectMode.mNativeCode == j) {
                    return faceDetectMode;
                }
            }
            return UNKNOWN_MODE;
        }

        FaceDetectMode(long j) {
            this.mNativeCode = j;
        }
    }

    ARAugmentedImageDatabase getAugmentedImageDatabase() {
        long jNativeGetAugmentedImageDatabase = nativeGetAugmentedImageDatabase(this.mSession.mNativeHandle, this.mNativeHandle);
        if (jNativeGetAugmentedImageDatabase == 0) {
            return null;
        }
        return new ARAugmentedImageDatabase(this.mSession, jNativeGetAugmentedImageDatabase);
    }

    protected void finalize() throws Throwable {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeDestroy(j);
        }
        super.finalize();
    }

    private String getArTypeString() {
        StringBuilder sb = new StringBuilder(16);
        int arType = getArType();
        int i = 1;
        for (String str : AR_TYPE_STRINGS) {
            if ((arType & i) > 0) {
                sb.append(str);
            }
            i <<= 1;
        }
        return sb.toString();
    }

    public enum CameraLensFacing {
        UNKNOWN(-1),
        REAR(0),
        FRONT(1);

        final int nativeCode;

        static CameraLensFacing forNumber(int i) {
            for (CameraLensFacing cameraLensFacing : values()) {
                if (cameraLensFacing.nativeCode == i) {
                    return cameraLensFacing;
                }
            }
            return UNKNOWN;
        }

        CameraLensFacing(int i) {
            this.nativeCode = i;
        }
    }

    public enum FocusMode {
        UNKNOWN(-1),
        FIXED_FOCUS(0),
        AUTO_FOCUS(1);

        final int mNativeCode;

        static FocusMode forNumber(int i) {
            for (FocusMode focusMode : values()) {
                if (focusMode.mNativeCode == i) {
                    return focusMode;
                }
            }
            return UNKNOWN;
        }

        FocusMode(int i) {
            this.mNativeCode = i;
        }
    }

    @Deprecated
    public enum HandFindingMode {
        UNKNOWN_MODE(-1),
        DISABLED(0),
        ENABLE_2D(1),
        ENABLE_3D(2);

        final int mNativeCode;

        static HandFindingMode forNumber(int i) {
            for (HandFindingMode handFindingMode : values()) {
                if (handFindingMode.mNativeCode == i) {
                    return handFindingMode;
                }
            }
            return UNKNOWN_MODE;
        }

        HandFindingMode(int i) {
            this.mNativeCode = i;
        }
    }

    public enum ImageInputMode {
        UNKNOWN_INPUT_MODE(-2),
        NON_INPUT(0),
        EXTERNAL_INPUT_ALL(-1);

        final int mNativeCode;

        static ImageInputMode forNumber(int i) {
            for (ImageInputMode imageInputMode : values()) {
                if (imageInputMode.mNativeCode == i) {
                    return imageInputMode;
                }
            }
            return UNKNOWN_INPUT_MODE;
        }

        ImageInputMode(int i) {
            this.mNativeCode = i;
        }
    }

    public enum PlaneFindingMode {
        UNKNOWN(-1),
        DISABLED(0),
        ENABLE(3),
        HORIZONTAL_ONLY(1),
        VERTICAL_ONLY(2);

        final int mNativeCode;

        static PlaneFindingMode forNumber(int i) {
            for (PlaneFindingMode planeFindingMode : values()) {
                if (planeFindingMode.mNativeCode == i) {
                    return planeFindingMode;
                }
            }
            return UNKNOWN;
        }

        PlaneFindingMode(int i) {
            this.mNativeCode = i;
        }
    }

    public enum PowerMode {
        UNKNOWN(-1),
        NORMAL(0),
        POWER_SAVING(1),
        ULTRA_POWER_SAVING(2),
        PERFORMANCE_FIRST(3);

        final int mNativeCode;

        static PowerMode forNumber(int i) {
            for (PowerMode powerMode : values()) {
                if (powerMode.mNativeCode == i) {
                    return powerMode;
                }
            }
            return UNKNOWN;
        }

        PowerMode(int i) {
            this.mNativeCode = i;
        }
    }

    public enum SurfaceType {
        UNKNOWN_SURFACE_TYPE(-1),
        PREVIEW(0),
        VGA(1),
        METADATA(2),
        DEPTH(4);

        final int mNativeCode;

        static SurfaceType forNumber(int i) {
            for (SurfaceType surfaceType : values()) {
                if (surfaceType.mNativeCode == i) {
                    return surfaceType;
                }
            }
            return UNKNOWN_SURFACE_TYPE;
        }

        SurfaceType(int i) {
            this.mNativeCode = i;
        }
    }

    public enum UpdateMode {
        UNKNOWN(-1),
        BLOCKING(0),
        LATEST_CAMERA_IMAGE(1);

        final int mNativeCode;

        static UpdateMode forNumber(int i) {
            for (UpdateMode updateMode : values()) {
                if (updateMode.mNativeCode == i) {
                    return updateMode;
                }
            }
            return UNKNOWN;
        }

        UpdateMode(int i) {
            this.mNativeCode = i;
        }
    }

    private int getArType() {
        return nativeGetArType(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    ARConfigBase(ARSession aRSession) {
        if (aRSession == null) {
            Log.e(TAG, M_SESSION_IS_NULL);
            throw new IllegalArgumentException(M_SESSION_IS_NULL);
        }
        this.mSession = aRSession;
        this.mNativeHandle = nativeCreate(aRSession.mNativeHandle);
    }

    ARConfigBase() {
        this.mSession = null;
        this.mNativeHandle = 0L;
    }
}
