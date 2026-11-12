package com.sensetime.senseid.sdk.liveness.silent;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.sensetime.senseid.sdk.liveness.silent.common.AbstractFinanceLibrary;
import com.sensetime.senseid.sdk.liveness.silent.common.type.PixelFormat;
import com.sensetime.senseid.sdk.liveness.silent.common.type.ResultCode;
import com.sensetime.senseid.sdk.liveness.silent.common.type.Size;
import com.sensetime.senseid.sdk.liveness.silent.common.util.DeviceUtil;
import com.sensetime.senseid.sdk.liveness.silent.common.util.NetworkUtil;
import com.sensetime.senseid.sdk.liveness.silent.type.BoundInfo;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceOcclusion;

/* JADX INFO: loaded from: classes18.dex */
abstract class AbstractLivenessLibrary extends AbstractFinanceLibrary {
    private static final long DEFAULT_LIVING_DETECTING_TIME = 10000;
    private static final float DEFAULT_RATE_FACE_CLOSE = 0.8f;
    private static final float DEFAULT_RATE_FACE_FAR = 0.4f;
    public long mStartTime = -1;
    public long mFirstFrameTime = -1;
    public long mDetectTimeout = 10000;
    public Object mHandle = null;
    private boolean mIsSensorListenerSet = false;
    private float mRateFaceFar = 0.4f;
    private float mRateFaceClose = 0.8f;
    private SensorManager mSensorManager = null;
    private Context mApplicationContext = null;
    private LivenessState mState = null;
    private String mCustomerId = null;
    private int mSensorType = -1;
    private String mSequentialInfo = null;
    private boolean mIsAddInfo = false;
    private SensorEventListener mSensorListener = new SensorEventListener() { // from class: com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            AbstractLivenessLibrary abstractLivenessLibrary;
            StringBuilder sb;
            float f;
            if (AbstractLivenessLibrary.this.mIsAddInfo) {
                return;
            }
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                AbstractLivenessLibrary.this.mSensorType = NativeSensorInfoKey.ACCLERATION.getValue();
                abstractLivenessLibrary = AbstractLivenessLibrary.this;
                sb = new StringBuilder();
                sb.append(sensorEvent.values[0]);
                sb.append(" ");
                sb.append(sensorEvent.values[1]);
                sb.append(" ");
                f = sensorEvent.values[2];
            } else {
                if (type == 2) {
                    AbstractLivenessLibrary.this.mSensorType = NativeSensorInfoKey.MAGNETIC_FIELD.getValue();
                    AbstractLivenessLibrary.this.mSequentialInfo = sensorEvent.values[0] + " " + sensorEvent.values[1] + " " + sensorEvent.values[2] + " ";
                    return;
                }
                if (type == 9) {
                    AbstractLivenessLibrary.this.mSensorType = NativeSensorInfoKey.GRAVITY.getValue();
                    abstractLivenessLibrary = AbstractLivenessLibrary.this;
                    sb = new StringBuilder();
                    sb.append(sensorEvent.values[0]);
                    sb.append(" ");
                    sb.append(sensorEvent.values[1]);
                    sb.append(" ");
                    f = sensorEvent.values[2];
                } else {
                    if (type != 11) {
                        return;
                    }
                    AbstractLivenessLibrary.this.mSensorType = NativeSensorInfoKey.ROTATION_RATE.getValue();
                    abstractLivenessLibrary = AbstractLivenessLibrary.this;
                    sb = new StringBuilder();
                    sb.append(sensorEvent.values[0]);
                    sb.append(" ");
                    sb.append(sensorEvent.values[1]);
                    sb.append(" ");
                    f = sensorEvent.values[2];
                }
            }
            sb.append(f);
            sb.append(" ");
            abstractLivenessLibrary.mSequentialInfo = sb.toString();
        }
    };

    private void addSequentialInfo(int i, String str) {
        if (getLibraryState() != 3 || i < 0 || TextUtils.isEmpty(str)) {
            return;
        }
        wrapperAddSequentialInfo(i, str);
    }

    private void generateFaceDistance(DetectResult detectResult, Rect rect) {
        float f;
        float f2;
        int i;
        int i2 = rect.right - rect.left;
        int i3 = rect.bottom - rect.top;
        if (i2 < i3) {
            f = detectResult.right - detectResult.left;
            f2 = i2;
        } else {
            f = detectResult.bottom - detectResult.top;
            f2 = i3;
        }
        float f3 = f / f2;
        float f4 = this.mRateFaceFar;
        if (f4 <= 0.0f || f3 >= f4) {
            float f5 = this.mRateFaceClose;
            i = (f5 <= 0.0f || f3 <= f5) ? 0 : -1;
        } else {
            i = 1;
        }
        detectResult.faceDistance = i;
    }

    private void generateFaceState(DetectResult detectResult, Rect rect, BoundInfo boundInfo) {
        int i;
        if (detectResult.faceCount <= 0) {
            i = 1;
        } else {
            if (rect != null) {
                Rect rect2 = new Rect(detectResult.left, detectResult.top, detectResult.right, detectResult.bottom);
                if (!rect.contains(rect2)) {
                    detectResult.faceState = 2;
                    return;
                }
                if (boundInfo != null && Math.sqrt(Math.pow(rect2.centerX() - boundInfo.getX(), 2.0d) + Math.pow(rect2.centerY() - boundInfo.getY(), 2.0d)) > boundInfo.getRadius()) {
                    detectResult.faceState = 2;
                    return;
                }
                FaceOcclusion faceOcclusionWrapperGetOcclusion = wrapperGetOcclusion();
                detectResult.faceOcclusion = faceOcclusionWrapperGetOcclusion;
                detectResult.faceState = faceOcclusionWrapperGetOcclusion.isOcclusion() ? 3 : detectResult.faceState;
                return;
            }
            i = -1;
        }
        detectResult.faceState = i;
    }

    private void registerSensorListener() {
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager == null) {
            return;
        }
        sensorManager.registerListener(this.mSensorListener, sensorManager.getDefaultSensor(1), 3);
        SensorManager sensorManager2 = this.mSensorManager;
        sensorManager2.registerListener(this.mSensorListener, sensorManager2.getDefaultSensor(11), 3);
        SensorManager sensorManager3 = this.mSensorManager;
        sensorManager3.registerListener(this.mSensorListener, sensorManager3.getDefaultSensor(9), 3);
        SensorManager sensorManager4 = this.mSensorManager;
        sensorManager4.registerListener(this.mSensorListener, sensorManager4.getDefaultSensor(2), 3);
        this.mIsSensorListenerSet = true;
    }

    private void setStaticInfo(int i, String str) {
        if (getLibraryState() != 3 || i < 0 || TextUtils.isEmpty(str)) {
            return;
        }
        wrapperSetStaticInfo(i, str);
    }

    private ResultCode start(int i) {
        if (getLibraryState() != 2 && getLibraryState() != 4 && getLibraryState() != 3) {
            return ResultCode.STID_E_CALL_API_IN_WRONG_STATE;
        }
        if (wrapperBegin(i) != 0) {
            changeLibraryStatus(-1);
            return ResultCode.STID_E_CHECK_CONFIG_FAIL;
        }
        changeLibraryStatus(3);
        if (!this.mIsSensorListenerSet) {
            registerSensorListener();
        }
        setStaticInfo(NativeStaticInfoKey.DEVICE.getKeyValue(), Build.MODEL);
        setStaticInfo(NativeStaticInfoKey.OS.getKeyValue(), "Android");
        setStaticInfo(NativeStaticInfoKey.SDK_VERSION.getKeyValue(), getVersionName());
        setStaticInfo(NativeStaticInfoKey.SYS_VERSION.getKeyValue(), Build.VERSION.RELEASE);
        setStaticInfo(NativeStaticInfoKey.IS_ROOT.getKeyValue(), String.valueOf(DeviceUtil.isRoot()));
        setStaticInfo(NativeStaticInfoKey.CUSTOMER_ID.getKeyValue(), this.mCustomerId);
        return ResultCode.OK;
    }

    private void unregisterSensorListener() {
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager == null) {
            return;
        }
        sensorManager.unregisterListener(this.mSensorListener);
    }

    public abstract void cancel();

    @Override // com.sensetime.senseid.sdk.liveness.silent.common.AbstractFinanceLibrary
    public int createHandleMethod(String str) {
        return createWrapperHandle(str);
    }

    public abstract int createWrapperHandle(String str);

    public abstract void destroyWrapperHandle();

    public DetectResult getImagesAndFaces() {
        if (getLibraryState() != 4) {
            return null;
        }
        return wrapperGetImagesAndFaces();
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public String getNetworkType() {
        Context context = this.mApplicationContext;
        return context == null ? "unknown" : NetworkUtil.getCurrentNetworkType(context);
    }

    public byte[] getResult() {
        if (getLibraryState() != 4) {
            return null;
        }
        return wrapperGetResult();
    }

    public abstract String getVersionName();

    public ResultCode init(Context context, String str, String str2, String str3) {
        if (context != null) {
            this.mSensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
            this.mCustomerId = context.getPackageName();
            this.mApplicationContext = context.getApplicationContext();
        }
        ResultCode resultCodeCheckLicense = checkLicense(str, str2);
        if (resultCodeCheckLicense != ResultCode.OK) {
            return resultCodeCheckLicense;
        }
        this.mStartTime = -1L;
        return createHandle(str3);
    }

    public void inputData(byte[] bArr, PixelFormat pixelFormat, Size size, Rect rect, boolean z, int i, BoundInfo boundInfo) {
        if (this.mHandle == null || bArr == null || bArr.length <= 0 || size == null || rect == null || i < 0 || !wrapperStateValid(getLibraryState())) {
            return;
        }
        if (this.mStartTime < 0) {
            this.mStartTime = SystemClock.elapsedRealtime();
        }
        if (this.mFirstFrameTime < 0) {
            this.mFirstFrameTime = SystemClock.elapsedRealtime();
        }
        int i2 = i / 90;
        if (this.mIsSensorListenerSet) {
            this.mIsAddInfo = true;
            addSequentialInfo(this.mSensorType, this.mSequentialInfo);
            this.mIsAddInfo = false;
        }
        DetectResult detectResultWrapperInput = wrapperInput(bArr, pixelFormat.getCode(), size.getWidth(), size.getHeight(), pixelFormat.getStride() * size.getWidth(), i2, System.currentTimeMillis() / 1000.0d);
        if (detectResultWrapperInput.faceCount > 0) {
            generateFaceDistance(detectResultWrapperInput, rect);
        }
        generateFaceState(detectResultWrapperInput, rect, boundInfo);
        this.mState.checkResult(detectResultWrapperInput);
    }

    public ResultCode prepare(int i) {
        ResultCode resultCodeStart = start(i);
        ResultCode resultCode = ResultCode.OK;
        return resultCodeStart != resultCode ? resultCodeStart : resultCode;
    }

    public void release() {
        if (this.mHandle != null) {
            this.mFirstFrameTime = -1L;
            if (getLibraryState() == 2 || getLibraryState() == 3 || getLibraryState() == 4 || getLibraryState() == -1) {
                stop();
                destroyWrapperHandle();
                this.mHandle = null;
                changeLibraryStatus(0);
            }
        }
    }

    public abstract void setDetectTimeout(long j);

    public boolean setFaceDistanceRate(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f || f > 1.0f || f2 > 1.0f) {
            return false;
        }
        if (f2 != 0.0f && Float.compare(f, f2) >= 0) {
            return false;
        }
        this.mRateFaceFar = f;
        this.mRateFaceClose = f2;
        return true;
    }

    public void setState(LivenessState livenessState) {
        this.mState = livenessState;
    }

    public boolean stop() {
        if (getLibraryState() != 3) {
            return false;
        }
        int iWrapperEnd = wrapperEnd();
        unregisterSensorListener();
        if (iWrapperEnd == 0) {
            changeLibraryStatus(4);
            return true;
        }
        changeLibraryStatus(-1);
        return false;
    }

    public abstract void wrapperAddSequentialInfo(int i, String str);

    public abstract int wrapperBegin(int i);

    public abstract int wrapperEnd();

    public abstract DetectResult wrapperGetImagesAndFaces();

    @NonNull
    public abstract FaceOcclusion wrapperGetOcclusion();

    public abstract byte[] wrapperGetResult();

    public abstract DetectResult wrapperInput(byte[] bArr, int i, int i2, int i3, int i4, int i5, double d);

    public abstract void wrapperSetStaticInfo(int i, String str);

    public abstract boolean wrapperStateValid(int i);
}
