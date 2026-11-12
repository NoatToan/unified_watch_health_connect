package com.sensetime.senseid.sdk.liveness.silent;

import android.graphics.Rect;
import android.os.SystemClock;
import com.sensetime.senseid.sdk.liveness.silent.common.HandleResult;
import com.sensetime.senseid.sdk.liveness.silent.common.network.AbstractHttpUtils;
import com.sensetime.senseid.sdk.liveness.silent.common.type.ResultCode;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceDistance;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceOcclusion;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceState;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
abstract class AbstractSilentLivenessLibrary extends AbstractLivenessLibrary {
    private static final float INTERACTIVE_OCCLUSION_BROW_ALIGN = 0.2f;
    private static final float INTERACTIVE_OCCLUSION_EYE_ALIGN = 0.2f;
    private static final float INTERACTIVE_OCCLUSION_MOUTH_ALIGN = 0.1f;
    private static final float INTERACTIVE_OCCLUSION_NOSE_ALIGN = 0.1f;
    private static boolean sLibraryLoaded = false;
    private DetectResult mDetectResult;
    private int mStatus;
    private int mPassDuration = 3000;
    private int mPassFrames = 4;
    private boolean mNeedBrowOcclusion = false;

    public class SilentState implements LivenessState {
        private SilentState() {
        }

        @Override // com.sensetime.senseid.sdk.liveness.silent.LivenessState
        public void checkResult(DetectResult detectResult) {
            int i;
            int i2;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - AbstractSilentLivenessLibrary.this.mStartTime;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            AbstractSilentLivenessLibrary abstractSilentLivenessLibrary = AbstractSilentLivenessLibrary.this;
            long j = jElapsedRealtime2 - abstractSilentLivenessLibrary.mFirstFrameTime;
            long j2 = abstractSilentLivenessLibrary.mDetectTimeout;
            if (j2 > 0 && jElapsedRealtime > j2) {
                abstractSilentLivenessLibrary.mStartTime = -1L;
                if (!abstractSilentLivenessLibrary.stop()) {
                    AbstractSilentLivenessLibrary.this.release();
                    return;
                }
                if (detectResult != null) {
                    byte[] result = AbstractSilentLivenessLibrary.this.getResult();
                    if (result != null && result.length > 0) {
                        detectResult.protobuf = Arrays.copyOf(result, result.length);
                    }
                    DetectResult imagesAndFaces = AbstractSilentLivenessLibrary.this.getImagesAndFaces();
                    if (imagesAndFaces == null) {
                        AbstractSilentLivenessLibrary.this.release();
                        AbstractSilentLivenessLibrary.this.processDetectResult(detectResult, j, null);
                        return;
                    }
                    detectResult.left = imagesAndFaces.left;
                    detectResult.top = imagesAndFaces.top;
                    detectResult.right = imagesAndFaces.right;
                    detectResult.bottom = imagesAndFaces.bottom;
                    List<byte[]> list = imagesAndFaces.images;
                    if (list != null && !list.isEmpty()) {
                        detectResult.images = list;
                    }
                    AbstractSilentLivenessLibrary.this.release();
                    AbstractSilentLivenessLibrary.this.processDetectResult(detectResult, j, new Rect(detectResult.left, detectResult.top, detectResult.right, detectResult.bottom));
                    return;
                }
                return;
            }
            if ((detectResult != null && ((i2 = detectResult.faceDistance) == -1 || i2 == 1)) || (i = detectResult.faceState) == 2 || i == 3) {
                abstractSilentLivenessLibrary.prepare(1);
            } else if (detectResult.passed) {
                abstractSilentLivenessLibrary.mStartTime = -1L;
                if (!abstractSilentLivenessLibrary.stop()) {
                    AbstractSilentLivenessLibrary.this.release();
                    return;
                }
                byte[] result2 = AbstractSilentLivenessLibrary.this.getResult();
                if (result2 != null && result2.length > 0) {
                    detectResult.protobuf = Arrays.copyOf(result2, result2.length);
                }
                DetectResult imagesAndFaces2 = AbstractSilentLivenessLibrary.this.getImagesAndFaces();
                if (imagesAndFaces2 == null) {
                    AbstractSilentLivenessLibrary.this.release();
                    AbstractSilentLivenessLibrary.this.processDetectResult(detectResult, j, null);
                    return;
                }
                detectResult.left = imagesAndFaces2.left;
                detectResult.top = imagesAndFaces2.top;
                detectResult.right = imagesAndFaces2.right;
                detectResult.bottom = imagesAndFaces2.bottom;
                detectResult.images = imagesAndFaces2.images;
                AbstractSilentLivenessLibrary.this.release();
                AbstractSilentLivenessLibrary.this.processDetectResult(detectResult, j, new Rect(detectResult.left, detectResult.top, detectResult.right, detectResult.bottom));
                return;
            }
            AbstractSilentLivenessLibrary.this.onStatusUpdate(detectResult.faceState, detectResult.faceOcclusion, detectResult.faceDistance);
        }
    }

    static {
        try {
            System.loadLibrary("stidsilent_liveness");
            System.loadLibrary("jni_liveness_silent");
            sLibraryLoaded = true;
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    public AbstractSilentLivenessLibrary() {
        this.mStatus = sLibraryLoaded ? 0 : -1;
    }

    private native HandleResult nativeCreateWrapperHandle(String str);

    private native void nativeDestroyWrapperHandle(Object obj);

    private native DetectResult nativeGetImagesAndFaces(Object obj);

    private native int nativeInitLicense(String str, String str2);

    private native int nativeWrapperAddSequentialInfo(Object obj, int i, String str);

    private native int nativeWrapperBegin(Object obj, int i, int i2, int i3);

    private native int nativeWrapperEnd(Object obj);

    private native byte[] nativeWrapperGetResult(Object obj);

    private native DetectResult nativeWrapperInput(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z, double d);

    private native int nativeWrapperSetStaticInfo(Object obj, int i, String str);

    @Override // com.sensetime.senseid.sdk.liveness.silent.common.AbstractFinanceLibrary
    public void changeLibraryStatus(int i) {
        this.mStatus = i;
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary
    public int createWrapperHandle(String str) {
        HandleResult handleResultNativeCreateWrapperHandle = nativeCreateWrapperHandle(str);
        if (handleResultNativeCreateWrapperHandle.getResultCode() == 0) {
            this.mHandle = handleResultNativeCreateWrapperHandle.getHandle();
        }
        return handleResultNativeCreateWrapperHandle.getResultCode();
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary
    public synchronized void destroyWrapperHandle() {
        nativeDestroyWrapperHandle(this.mHandle);
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.common.AbstractFinanceLibrary
    public AbstractHttpUtils getHttpUtils() {
        return new SilentLivenessHttpUtils();
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.common.AbstractFinanceLibrary
    public int getLibraryState() {
        return this.mStatus;
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary
    public String getVersionName() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.common.AbstractFinanceLibrary
    public int initLicense(String str, String str2) {
        return nativeInitLicense(str, str2);
    }

    public abstract void notifyError(ResultCode resultCode);

    @Override // com.sensetime.senseid.sdk.liveness.silent.common.AbstractFinanceLibrary
    public void notifyNetworkBegin() {
    }

    public abstract void onStatusUpdate(@FaceState int i, FaceOcclusion faceOcclusion, @FaceDistance int i2);

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary
    public ResultCode prepare(int i) {
        ResultCode resultCodePrepare = super.prepare(i);
        setState(new SilentState());
        return resultCodePrepare;
    }

    public abstract void processDetectResult(DetectResult detectResult, long j, Rect rect);

    public void setBrowOcclusion(boolean z) {
        this.mNeedBrowOcclusion = z;
    }

    public void setPassDurationAndFrames(int i, int i2) {
        this.mPassDuration = i;
        this.mPassFrames = i2;
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary
    public void wrapperAddSequentialInfo(int i, String str) {
        nativeWrapperAddSequentialInfo(this.mHandle, i, str);
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary
    public int wrapperBegin(int i) {
        int i2;
        int i3 = this.mPassDuration;
        if (i3 >= 0 && (i2 = this.mPassFrames) >= 0) {
            return nativeWrapperBegin(this.mHandle, i, i3, i2);
        }
        notifyError(ResultCode.STID_E_INVALID_ARGUMENTS);
        return -1;
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary
    public int wrapperEnd() {
        return nativeWrapperEnd(this.mHandle);
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary
    public synchronized DetectResult wrapperGetImagesAndFaces() {
        return nativeGetImagesAndFaces(this.mHandle);
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary
    public FaceOcclusion wrapperGetOcclusion() {
        int i;
        if (this.mNeedBrowOcclusion) {
            i = this.mDetectResult.browScore >= 0.20000000298023224d ? 2 : 1;
        } else {
            i = 0;
        }
        DetectResult detectResult = this.mDetectResult;
        return new FaceOcclusion(i, detectResult.eyeScore >= 0.20000000298023224d ? 2 : 1, detectResult.noseScore >= 0.10000000149011612d ? 2 : 1, detectResult.mouthScore < 0.10000000149011612d ? 1 : 2);
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary
    public synchronized byte[] wrapperGetResult() {
        return nativeWrapperGetResult(this.mHandle);
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary
    public DetectResult wrapperInput(byte[] bArr, int i, int i2, int i3, int i4, int i5, double d) {
        DetectResult detectResultNativeWrapperInput = nativeWrapperInput(this.mHandle, bArr, i, i2, i3, i4, i5, this.mNeedBrowOcclusion, d);
        this.mDetectResult = detectResultNativeWrapperInput;
        return detectResultNativeWrapperInput;
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary
    public void wrapperSetStaticInfo(int i, String str) {
        nativeWrapperSetStaticInfo(this.mHandle, i, str);
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary
    public boolean wrapperStateValid(int i) {
        return 3 == i;
    }
}
