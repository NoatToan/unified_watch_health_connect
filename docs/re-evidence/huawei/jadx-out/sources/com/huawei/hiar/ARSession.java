package com.huawei.hiar;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.huawei.hiar.common.CloudServiceState;
import com.huawei.hiar.common.FaceHealthCheckState;
import com.huawei.hiar.exceptions.ARCameraPermissionDeniedException;
import com.huawei.hiar.exceptions.ARUnSupportedConfigurationException;
import com.huawei.hiar.listener.CloudServiceEvent;
import com.huawei.hiar.listener.CloudServiceListener;
import com.huawei.hiar.listener.FaceHealthCheckStateEvent;
import com.huawei.hiar.listener.FaceHealthServiceListener;
import com.huawei.hiar.listener.ServiceListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public class ARSession {
    static final int AR_DISPLAY_ROTATION_MAX = 3;
    static final int AR_TRACKABLE_BASE_TRACKABLE = 1095893248;
    static final int AR_TRACKABLE_BODY = 1342177281;
    static final int AR_TRACKABLE_FACE = 1342177282;
    static final int AR_TRACKABLE_HAND = 1342177280;
    static final int AR_TRACKABLE_IMAGE = 1095893252;
    static final int AR_TRACKABLE_NOT_VALID = 0;
    static final int AR_TRACKABLE_OBJECT = 1342177285;
    static final int AR_TRACKABLE_PLANE = 1095893249;
    static final int AR_TRACKABLE_POINT = 1095893250;
    static final int AR_TRACKABLE_TARGET = 1342177288;
    static final int AR_TRACKABLE_UNKNOWN_TO_JAVA = -1;
    static final int AR_TRACKING_STATE_PAUSED = 1;
    static final int AR_TRACKING_STATE_STOPPED = 2;
    static final int AR_TRACKING_STATE_TRACKING = 0;
    public static final int CURRENT_SDK_VERSIONCODE = 158;
    private static final String TAG = "ARSession";
    static String libraryName = "huawei_arengine_jni";
    private Context mContext;
    ARFrame mLastFrame;
    long mNativeHandle;
    protected Object syncObject = new Object();
    private List<ServiceListener> serviceListeners = new ArrayList();

    private native long[] nativeAcquireAllAnchors(long j);

    private native long[] nativeAcquireAllTrackables(long j, int i);

    private native void nativeConfigure(long j, long j2);

    private native long nativeCreateAnchor(long j, ARPose aRPose);

    private static native long nativeCreateSession(Context context);

    private static native void nativeDestroySession(long j);

    private native long nativeGetCameraConfig(long j);

    private native int nativeGetSupportedSemanticMode(long j);

    private native boolean nativeIsSupported(long j, long j2);

    private native void nativePause(long j);

    private native void nativeResume(long j);

    private native void nativeSetCameraTextureName(long j, int i);

    private native void nativeSetCloudServiceAuthInfo(long j, String str);

    private native void nativeSetDisplayGeometry(long j, int i, int i2, int i3);

    private native void nativeSetEnvironmentTextureProbe(long j, float[] fArr);

    private native void nativeSetEnvironmentTextureUpdateMode(long j, int i);

    private native void nativeSetServiceCallback(long j);

    private native void nativeStop(long j);

    private native void nativeUpdate(long j, long j2);

    public ARFrame update() {
        ARFrame aRFrame;
        synchronized (this.syncObject) {
            ARFrame aRFrame2 = new ARFrame(this);
            this.mLastFrame = aRFrame2;
            nativeUpdate(this.mNativeHandle, aRFrame2.mNativeHandle);
            this.mLastFrame.initCamera();
            this.mLastFrame.initLightEstimate();
            aRFrame = this.mLastFrame;
        }
        return aRFrame;
    }

    public void stop() {
        nativeStop(this.mNativeHandle);
        removeServiceListener();
    }

    public void setEnvironmentTextureUpdateMode(EnvironmentTextureUpdateMode environmentTextureUpdateMode) {
        nativeSetEnvironmentTextureUpdateMode(this.mNativeHandle, environmentTextureUpdateMode.mNativeCode);
    }

    public void setEnvironmentTextureProbe(float[] fArr) {
        nativeSetEnvironmentTextureProbe(this.mNativeHandle, fArr);
    }

    public void setDisplayGeometry(int i, int i2, int i3) {
        if (i < 0 || i > 3) {
            Log.e(TAG, String.format(Locale.ENGLISH, "setDisplayGeometry: displayRotation %d out of range(0~3)", Integer.valueOf(i)));
            throw new IllegalArgumentException("displayRoation is out of range");
        }
        if (i2 <= 0 || i3 <= 0) {
            Log.e(TAG, "setDisplayGeometry: width or height is less than or equal to zero");
            throw new IllegalArgumentException("width or height must be greater than zero");
        }
        nativeSetDisplayGeometry(this.mNativeHandle, i, i2, i3);
    }

    @Deprecated
    public void setDisplayGeometry(float f, float f2) {
        if (f <= 0.0f || f2 <= 0.0f) {
            Log.e(TAG, "setDisplayGeometry: width or height is less than or equal to zero");
            throw new IllegalArgumentException("width or height must be greater than zero");
        }
        Context context = this.mContext;
        if (context instanceof Activity) {
            setDisplayGeometry(((Activity) context).getWindowManager().getDefaultDisplay().getRotation(), (int) f, (int) f2);
        } else {
            Log.e(TAG, "The Context set to this session should be instance of Activity whilecalling setDisplayGeometry(float width, float height)");
            throw new IllegalStateException("context should be instance of Activity");
        }
    }

    public void setCloudServiceAuthInfo(String str) {
        nativeSetCloudServiceAuthInfo(this.mNativeHandle, str);
    }

    public void setCameraTextureName(int i) {
        nativeSetCameraTextureName(this.mNativeHandle, i);
    }

    @Deprecated
    public void resume(ARConfigBase aRConfigBase) {
        if (this.mContext.checkSelfPermission("android.permission.CAMERA") != 0) {
            throw new ARCameraPermissionDeniedException();
        }
        if (aRConfigBase == null) {
            throw new ARUnSupportedConfigurationException();
        }
        if (aRConfigBase.mSession == null) {
            aRConfigBase.setSession(this);
        }
        configure(aRConfigBase);
        resume();
    }

    public void resume() {
        nativeResume(this.mNativeHandle);
    }

    @Deprecated
    public void removeAnchors(Collection<ARAnchor> collection) {
        if (collection == null) {
            return;
        }
        Iterator<ARAnchor> it = collection.iterator();
        while (it.hasNext()) {
            it.next().detach();
        }
    }

    public void pause() {
        nativePause(this.mNativeHandle);
    }

    void notifyFaceHealthProcessProgressToListener(int i) {
        FaceHealthServiceListener validFaceHealthServiceListener = getValidFaceHealthServiceListener();
        if (validFaceHealthServiceListener == null) {
            return;
        }
        validFaceHealthServiceListener.handleProcessProgressEvent(i);
    }

    void notifyFaceHealthCheckStateToListener(int i) {
        FaceHealthServiceListener validFaceHealthServiceListener = getValidFaceHealthServiceListener();
        if (validFaceHealthServiceListener == null) {
            return;
        }
        validFaceHealthServiceListener.handleEvent(new FaceHealthCheckStateEvent(this, FaceHealthCheckState.forNumber(i)));
    }

    protected void nativeUpdate4Unity(long j, long j2) {
        nativeUpdate(j, j2);
    }

    @Deprecated
    public boolean isSupported(ARConfigBase aRConfigBase) {
        if (aRConfigBase == null) {
            throw new IllegalArgumentException();
        }
        if (aRConfigBase.mSession == null) {
            aRConfigBase.setSession(this);
        }
        return nativeIsSupported(this.mNativeHandle, aRConfigBase.mNativeHandle);
    }

    public int getSupportedSemanticMode() {
        return nativeGetSupportedSemanticMode(this.mNativeHandle);
    }

    @Deprecated
    public void getProjectionMatrix(float[] fArr, int i, float f, float f2) {
        synchronized (this.syncObject) {
            this.mLastFrame.mCamera.getProjectionMatrix(fArr, i, f, f2);
        }
    }

    public ARCameraConfig getCameraConfig() {
        return new ARCameraConfig(this, nativeGetCameraConfig(this.mNativeHandle));
    }

    public <T extends ARTrackable> Collection<T> getAllTrackables(Class<T> cls) {
        int nativeTrackableFilterFromClass = getNativeTrackableFilterFromClass(cls);
        return nativeTrackableFilterFromClass == -1 ? Collections.EMPTY_LIST : convertNativeTrackablesToCollection(cls, nativeAcquireAllTrackables(this.mNativeHandle, nativeTrackableFilterFromClass));
    }

    @Deprecated
    public Collection<ARPlane> getAllPlanes() {
        return getAllTrackables(ARPlane.class);
    }

    public Collection<ARAnchor> getAllAnchors() {
        return convertNativeAnchorsToCollection(nativeAcquireAllAnchors(this.mNativeHandle));
    }

    protected void finalize() throws Throwable {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeDestroySession(j);
        }
        super.finalize();
    }

    ARTrackable createTrackable(long j) {
        switch (ARTrackableBase.internalGetType(this.mNativeHandle, j)) {
            case AR_TRACKABLE_PLANE /* 1095893249 */:
                Log.d(TAG, "createTrackable: plane");
                return new ARPlane(j, this);
            case AR_TRACKABLE_POINT /* 1095893250 */:
                Log.d(TAG, "createTrackable: point");
                return new ARPoint(j, this);
            case AR_TRACKABLE_IMAGE /* 1095893252 */:
                Log.d(TAG, "createTrackable: point");
                return new ARAugmentedImage(j, this);
            case 1342177280:
                Log.d(TAG, "createTrackable: hand");
                return new ARHand(j, this);
            case AR_TRACKABLE_BODY /* 1342177281 */:
                Log.d(TAG, "createTrackable: body");
                return new ARBody(j, this);
            case AR_TRACKABLE_FACE /* 1342177282 */:
                Log.d(TAG, "createTrackable: face");
                return new ARFace(j, this);
            case AR_TRACKABLE_OBJECT /* 1342177285 */:
                Log.d(TAG, "createTrackable: object");
                return new ARObject(j, this);
            case AR_TRACKABLE_TARGET /* 1342177288 */:
                Log.d(TAG, "createTrackable: target");
                return new ARTarget(j, this);
            default:
                ARTrackableBase.internalReleaseNativeHandle(j);
                return null;
        }
    }

    public ARAnchor createAnchor(ARPose aRPose) {
        return new ARAnchor(nativeCreateAnchor(this.mNativeHandle, aRPose), this);
    }

    <T extends ARTrackable> Collection<T> convertNativeTrackablesToCollection(Class<T> cls, long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            ARTrackable aRTrackableCreateTrackable = createTrackable(j);
            if (aRTrackableCreateTrackable != null) {
                arrayList.add(cls.cast(aRTrackableCreateTrackable));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    Collection<ARAnchor> convertNativeAnchorsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new ARAnchor(j, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void configure(ARConfigBase aRConfigBase) {
        if (aRConfigBase.mSession == null) {
            aRConfigBase.setSession(this);
        }
        nativeConfigure(this.mNativeHandle, aRConfigBase.mNativeHandle);
    }

    public void addServiceListener(ServiceListener serviceListener) {
        if (this.serviceListeners.size() == 0) {
            nativeSetServiceCallback(this.mNativeHandle);
        }
        this.serviceListeners.add(serviceListener);
    }

    @Deprecated
    public ARAnchor addAnchor(ARPose aRPose) {
        return createAnchor(aRPose);
    }

    private void removeServiceListener() {
        List<ServiceListener> list = this.serviceListeners;
        if (list != null && list.size() > 0) {
            this.serviceListeners.clear();
        }
    }

    private void notifyToCloudServiceListener(int i) {
        CloudServiceListener cloudServiceListener;
        Iterator<ServiceListener> it = this.serviceListeners.iterator();
        while (true) {
            if (!it.hasNext()) {
                cloudServiceListener = null;
                break;
            }
            ServiceListener next = it.next();
            if (next instanceof CloudServiceListener) {
                cloudServiceListener = (CloudServiceListener) next;
                break;
            }
        }
        if (cloudServiceListener == null) {
            return;
        }
        cloudServiceListener.handleEvent(new CloudServiceEvent(this, CloudServiceState.forNumber(i)));
    }

    public enum EnvironmentTextureUpdateMode {
        UNKNOWN(-1),
        AUTO(0),
        UPDATE_ONE_TIME(1);

        final int mNativeCode;

        static EnvironmentTextureUpdateMode forNumber(int i) {
            for (EnvironmentTextureUpdateMode environmentTextureUpdateMode : values()) {
                if (environmentTextureUpdateMode.mNativeCode == i) {
                    return environmentTextureUpdateMode;
                }
            }
            return UNKNOWN;
        }

        EnvironmentTextureUpdateMode(int i) {
            this.mNativeCode = i;
        }
    }

    private FaceHealthServiceListener getValidFaceHealthServiceListener() {
        for (ServiceListener serviceListener : this.serviceListeners) {
            if (serviceListener instanceof FaceHealthServiceListener) {
                return (FaceHealthServiceListener) serviceListener;
            }
        }
        return null;
    }

    static int getNativeTrackableFilterFromClass(Class<?> cls) {
        if (cls == ARTrackable.class) {
            return AR_TRACKABLE_BASE_TRACKABLE;
        }
        if (cls == ARPlane.class) {
            return AR_TRACKABLE_PLANE;
        }
        if (cls == ARAugmentedImage.class) {
            return AR_TRACKABLE_IMAGE;
        }
        if (cls == ARPoint.class) {
            return AR_TRACKABLE_POINT;
        }
        if (cls == ARHand.class) {
            return 1342177280;
        }
        if (cls == ARBody.class) {
            return AR_TRACKABLE_BODY;
        }
        if (cls == ARFace.class) {
            return AR_TRACKABLE_FACE;
        }
        if (cls == ARObject.class) {
            return AR_TRACKABLE_OBJECT;
        }
        if (cls == ARTarget.class) {
            return AR_TRACKABLE_TARGET;
        }
        return -1;
    }

    public ARSession(Context context) {
        this.mLastFrame = null;
        String str = TAG;
        Log.d(str, "ARSession: Current SDK Versioncode : 158");
        if (context == null) {
            Log.e(str, "The input parameter context is invalid");
            throw new IllegalArgumentException("The input parameter context is invalid");
        }
        this.mContext = context;
        this.mNativeHandle = nativeCreateSession(context);
        this.mLastFrame = new ARFrame(this);
    }

    static {
        System.loadLibrary(libraryName);
    }
}
