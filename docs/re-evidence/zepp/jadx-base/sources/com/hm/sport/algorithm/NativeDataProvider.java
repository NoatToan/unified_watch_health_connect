package com.hm.sport.algorithm;

import android.util.Log;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class NativeDataProvider {
    public static final String TAG = "NDP";
    public long mNativeContext = 0;

    static {
        Log.i(TAG, "loadLibrary");
        System.loadLibrary("sport-run");
    }

    public static int getRingSize() {
        return 100;
    }

    public static int getStepSize() {
        return 10;
    }

    public void destroy() {
        native_finalize(this.mNativeContext);
        Log.i(TAG, "destroy mNativeContext:" + this.mNativeContext);
    }

    public void init(int i, int i2, int i3, int i4, float f) {
        Log.i(TAG, "init before qqq:");
        long jNative_init = native_init(new WeakReference(this), i, i2, i3, i4, f);
        this.mNativeContext = jNative_init;
        if (jNative_init == 0) {
            throw new IllegalStateException("native ptr is 0");
        }
        Log.i(TAG, "init mNativeContext:" + this.mNativeContext);
    }

    public native int native_alignBar(long j, float f, long j2);

    public native int native_alignGps(long j, double d, double d2, float f, int i, int i2, long j2);

    public native int native_alignHr(long j, int i, long j2);

    public native int native_alignStep(long j, int i, long j2);

    public native int native_checkAutoPause(long j, long j2);

    public native int native_finalize(long j);

    public native int native_fusionStep(long j, int i, long j2, int i2, long j3, int i3, long j4, int i4, long j5, int i5, long j6);

    public native long native_init(Object obj, int i, int i2, int i3, int i4, float f);

    public native int native_receiveAccSensor(long j, short[] sArr, short[] sArr2, short[] sArr3, long j2);

    public native int native_receiveBar(long j, float f, long j2);

    public native int native_receiveBlueMonkeyStep(long j, int i, long j2);

    public native int native_receiveBrandStep(long j, int i, long j2);

    public native int native_receiveGps(long j, double d, double d2, float f, int i, float f2, long j2);

    public native int native_receiveHr(long j, int i, long j2);

    public native int native_receiveIndoorResultToLearn(long[] jArr, short[] sArr, int i, float[] fArr, int i2, int i3, long j);

    public native int native_receiveLearningStepLMatrix(int[] iArr, int i, long j);

    public native int native_receivePhoneHubStep(long j, int i, long j2);

    public native int native_receiveShoeStep(long j, int i, long j2);

    public native int native_register_callback_Bar(BarCallback barCallback, long j);

    public native int native_register_callback_HrData(HRCallback hRCallback, long j);

    public native int native_register_callback_autoPause(AutoPauseCallback autoPauseCallback, long j);

    public native int native_register_callback_indoorLearningArg(IndoorLearningArgCallback indoorLearningArgCallback, long j);

    public native int native_register_callback_log(LogCallback logCallback, long j);

    public native int native_register_callback_receiveGps(GpsCallback gpsCallback, long j);

    public native int native_register_callback_receiveStep(StepCallback stepCallback, long j);

    public native int native_register_callback_statisticData(StatisticCallback statisticCallback, long j);

    public native int native_setAge(int i, long j);

    public native int native_setAutoPauseEnable(int i, long j);

    public native int native_setAutoPauseSpeed(float f, long j);

    public native int native_setHeight(int i, long j);

    public native int native_setLog(int i, String str, long j);

    public native int native_setSex(int i, long j);

    public native int native_setTicker(long j, long j2);

    public native int native_setWeight(float f, long j);

    public native int native_start(long j, long j2);

    public native int native_statisticData(AlignData[] alignDataArr, long j);

    public native int native_stop(long j, long j2);

    public native int native_unregister_callback_Bar(BarCallback barCallback, long j);

    public native int native_unregister_callback_HrData(HRCallback hRCallback, long j);

    public native int native_unregister_callback_autoPause(AutoPauseCallback autoPauseCallback, long j);

    public native int native_unregister_callback_indoorLearningArg(IndoorLearningArgCallback indoorLearningArgCallback, long j);

    public native int native_unregister_callback_log(LogCallback logCallback, long j);

    public native int native_unregister_callback_receiveGps(GpsCallback gpsCallback, long j);

    public native int native_unregister_callback_receiveStep(StepCallback stepCallback, long j);

    public native int native_unregister_callback_statisticData(StatisticCallback statisticCallback, long j);
}
