package com.huawei.hiar;

import android.media.Image;
import android.util.Log;
import android.view.MotionEvent;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class ARFrame {
    private static final int ALIGN_STATE_PROCESSING = 2;
    private static final int ALIGN_STATE_SUCCESS = 3;
    private static final int MATRIX_OFFSET = 16;
    private static final String TAG = "ARFrame";
    private static final int WORLD_MAPPING_STATE_MAPPED = 2;
    ARCamera mCamera;
    ARLightEstimate mLightEstimate;
    long mNativeHandle;
    ARSession mSession;

    private native long nativeAcquireCameraImage(long j, long j2);

    private native long nativeAcquireDepthImage(long j, long j2);

    private native long nativeAcquireImageMetadata(long j, long j2);

    private native long nativeAcquirePreviewImage(long j, long j2);

    private native long nativeAcquireSceneMesh(long j, long j2);

    private native long[] nativeAcquireUpdatedAnchors(long j, long j2);

    private native long[] nativeAcquireUpdatedTrackables(long j, long j2, int i);

    private static native long nativeCreateFrame(long j);

    private static native void nativeDestroyFrame(long j);

    private native void nativeGetLightEstimate(long j, long j2, long j3);

    private native long nativeGetTimestamp(long j, long j2);

    private native boolean nativeHasDisplayGeometryChanged(long j, long j2);

    private native long[] nativeHitTest(long j, long j2, float f, float f2);

    private native long[] nativeHitTestArea(long j, long j2, float[] fArr);

    private native void nativeTransformDisplayUvCoords(long j, long j2, FloatBuffer floatBuffer, FloatBuffer floatBuffer2);

    native long nativeAcquirePointCloud(long j, long j2);

    public void transformDisplayUvCoords(FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (floatBuffer == null || floatBuffer2 == null) {
            throw new IllegalArgumentException("input parameter is null pointer.");
        }
        if (!floatBuffer.isDirect() || !floatBuffer2.isDirect()) {
            throw new IllegalArgumentException("transformDisplayUvCoords error.");
        }
        nativeTransformDisplayUvCoords(this.mSession.mNativeHandle, this.mNativeHandle, floatBuffer, floatBuffer2);
    }

    @Deprecated
    public boolean isDisplayRotationChanged() {
        return hasDisplayGeometryChanged();
    }

    protected void initLightEstimate() {
        this.mLightEstimate = new ARLightEstimate(this.mSession);
    }

    protected void initCamera() {
        this.mCamera = new ARCamera(this.mSession, this);
    }

    public List<ARHitResult> hitTestArea(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            Log.e(TAG, "hitTest: illegal argument");
            throw new IllegalArgumentException();
        }
        long[] jArrNativeHitTestArea = nativeHitTestArea(this.mSession.mNativeHandle, this.mNativeHandle, fArr);
        if (jArrNativeHitTestArea != null && jArrNativeHitTestArea.length != 0) {
            return getArHitResultsByIds(jArrNativeHitTestArea);
        }
        Log.w(TAG, "hitTest: hitResult null!");
        return null;
    }

    public List<ARHitResult> hitTest(MotionEvent motionEvent) {
        return hitTest(motionEvent.getX(), motionEvent.getY());
    }

    public List<ARHitResult> hitTest(float f, float f2) {
        if (f >= 0.0f && f2 >= 0.0f) {
            return getArHitResultsByIds(nativeHitTest(this.mSession.mNativeHandle, this.mNativeHandle, f, f2));
        }
        Log.e(TAG, "hitTest: illegal argument");
        throw new IllegalArgumentException();
    }

    public boolean hasDisplayGeometryChanged() {
        return nativeHasDisplayGeometryChanged(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    @Deprecated
    public void getViewMatrix(float[] fArr, int i) {
        if (fArr == null || i < 0 || fArr.length < i + 16) {
            Log.e(TAG, "getViewMatrix: illegal argument");
            throw new IllegalArgumentException("length of mViewMatrix is illegal.");
        }
        this.mCamera.getViewMatrix(fArr, i);
    }

    public <T extends ARTrackable> Collection<T> getUpdatedTrackables(Class<T> cls) {
        int nativeTrackableFilterFromClass = ARSession.getNativeTrackableFilterFromClass(cls);
        if (nativeTrackableFilterFromClass == -1) {
            return Collections.EMPTY_LIST;
        }
        return this.mSession.convertNativeTrackablesToCollection(cls, nativeAcquireUpdatedTrackables(this.mSession.mNativeHandle, this.mNativeHandle, nativeTrackableFilterFromClass));
    }

    @Deprecated
    public Collection<ARPlane> getUpdatedPlanes() {
        return getUpdatedTrackables(ARPlane.class);
    }

    public Collection<ARAnchor> getUpdatedAnchors() {
        ARSession aRSession = this.mSession;
        return aRSession.convertNativeAnchorsToCollection(nativeAcquireUpdatedAnchors(aRSession.mNativeHandle, this.mNativeHandle));
    }

    @Deprecated
    public ARTrackable.TrackingState getTrackingState() {
        return this.mCamera.getTrackingState();
    }

    public long getTimestampNs() {
        return nativeGetTimestamp(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    @Deprecated
    public ARPose getPose() {
        return this.mCamera.getDisplayOrientedPose();
    }

    @Deprecated
    public ARPose getPointCloudPose() {
        return ARPose.IDENTITY;
    }

    @Deprecated
    public ARPointCloud getPointCloud() {
        return acquirePointCloud();
    }

    public ARLightEstimate getLightEstimate() {
        nativeGetLightEstimate(this.mSession.mNativeHandle, this.mNativeHandle, this.mLightEstimate.mNativeHandle);
        return this.mLightEstimate;
    }

    public ARImageMetadata getImageMetadata() {
        return new ARImageMetadata(nativeAcquireImageMetadata(this.mSession.mNativeHandle, this.mNativeHandle), this.mSession);
    }

    public ARCamera getCamera() {
        return this.mCamera;
    }

    protected void finalize() throws Throwable {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeDestroyFrame(j);
        }
        super.finalize();
    }

    public ARSceneMesh acquireSceneMesh() {
        return new ARSceneMesh(this.mSession, nativeAcquireSceneMesh(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public Image acquirePreviewImage() {
        return new ARImage(nativeAcquirePreviewImage(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public ARPointCloud acquirePointCloud() {
        return new ARPointCloud(nativeAcquirePointCloud(this.mSession.mNativeHandle, this.mNativeHandle), this.mSession);
    }

    public Image acquireDepthImage() {
        return new ARImage(nativeAcquireDepthImage(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public Image acquireCameraImage() {
        return new ARImage(nativeAcquireCameraImage(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    private List<ARHitResult> getArHitResultsByIds(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            ARHitResult aRHitResult = new ARHitResult(j, this.mSession);
            if (aRHitResult.getTrackable() != null) {
                Log.i(TAG, "getArHitResultsByIds arTrackable:" + aRHitResult.getTrackable().toString());
            }
            arrayList.add(aRHitResult);
        }
        return Collections.unmodifiableList(arrayList);
    }

    ARFrame(ARSession aRSession) {
        this.mSession = aRSession;
        this.mNativeHandle = nativeCreateFrame(aRSession.mNativeHandle);
    }

    protected ARFrame() {
        this.mSession = null;
        this.mNativeHandle = 0L;
        this.mLightEstimate = null;
        this.mCamera = null;
    }
}
