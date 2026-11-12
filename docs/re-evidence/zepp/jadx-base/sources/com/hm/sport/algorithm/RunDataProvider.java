package com.hm.sport.algorithm;

/* JADX INFO: loaded from: classes4.dex */
public final class RunDataProvider extends NativeDataProvider {
    public int alignBar(long j, float f) {
        return native_alignBar(j, f, this.mNativeContext);
    }

    public int alignGps(long j, double d, double d2, float f, int i, int i2) {
        return native_alignGps(j, d, d2, f, i, i2, this.mNativeContext);
    }

    public int alignHr(long j, int i) {
        return native_alignHr(j, i, this.mNativeContext);
    }

    public int alignStep(long j, int i) {
        return native_alignStep(j, i, this.mNativeContext);
    }

    public int checkAutoPause(long j) {
        return native_checkAutoPause(j, this.mNativeContext);
    }

    @Override // com.hm.sport.algorithm.NativeDataProvider
    public void destroy() {
        super.destroy();
    }

    public int fusionStep(long j, int i, long j2, int i2, long j3, int i3, long j4, int i4, long j5, int i5) {
        return native_fusionStep(j, i, j2, i2, j3, i3, j4, i4, j5, i5, this.mNativeContext);
    }

    @Override // com.hm.sport.algorithm.NativeDataProvider
    public void init(int i, int i2, int i3, int i4, float f) {
        super.init(i, i2, i3, i4, f);
    }

    public int receiveAccSensor(long j, short[] sArr, short[] sArr2, short[] sArr3) {
        return native_receiveAccSensor(j, sArr, sArr2, sArr3, this.mNativeContext);
    }

    public int receiveBar(long j, float f) {
        return native_receiveBar(j, f, this.mNativeContext);
    }

    public int receiveBlueMonkeyStep(long j, int i) {
        return native_receiveBlueMonkeyStep(j, i, this.mNativeContext);
    }

    public int receiveBrandStep(long j, int i) {
        return native_receiveBrandStep(j, i, this.mNativeContext);
    }

    public int receiveGps(long j, double d, double d2, float f, int i, float f2) {
        return native_receiveGps(j, d, d2, f, i, f2, this.mNativeContext);
    }

    public int receiveHr(long j, int i) {
        return native_receiveHr(j, i, this.mNativeContext);
    }

    public int receiveIndoorResultToLearn(long[] jArr, short[] sArr, int i, float[] fArr, int i2, int i3) {
        return native_receiveIndoorResultToLearn(jArr, sArr, i, fArr, i2, i3, this.mNativeContext);
    }

    public int receiveLearningStepLMatrix(int[] iArr, int i) {
        return native_receiveLearningStepLMatrix(iArr, i, this.mNativeContext);
    }

    public int receivePhoneHubStep(long j, int i) {
        return native_receivePhoneHubStep(j, i, this.mNativeContext);
    }

    public int receiveShoeStep(long j, int i) {
        return native_receiveShoeStep(j, i, this.mNativeContext);
    }

    public int registerAutoPauseCallback(AutoPauseCallback autoPauseCallback) {
        return native_register_callback_autoPause(autoPauseCallback, this.mNativeContext);
    }

    public int registerBarCallback(BarCallback barCallback) {
        return native_register_callback_Bar(barCallback, this.mNativeContext);
    }

    public int registerGpsCallback(GpsCallback gpsCallback) {
        if (gpsCallback != null) {
            return native_register_callback_receiveGps(gpsCallback, this.mNativeContext);
        }
        throw new IllegalArgumentException();
    }

    public int registerHrDataCallback(HRCallback hRCallback) {
        if (hRCallback != null) {
            return native_register_callback_HrData(hRCallback, this.mNativeContext);
        }
        throw new IllegalArgumentException();
    }

    public int registerIndoorLearningArgCallback(IndoorLearningArgCallback indoorLearningArgCallback) {
        return native_register_callback_indoorLearningArg(indoorLearningArgCallback, this.mNativeContext);
    }

    public int registerLogCallback(LogCallback logCallback) {
        return native_register_callback_log(logCallback, this.mNativeContext);
    }

    public int registerStatisticCallback(StatisticCallback statisticCallback) {
        if (statisticCallback != null) {
            return native_register_callback_statisticData(statisticCallback, this.mNativeContext);
        }
        throw new IllegalArgumentException();
    }

    public int registerStepCallback(StepCallback stepCallback) {
        if (stepCallback != null) {
            return native_register_callback_receiveStep(stepCallback, this.mNativeContext);
        }
        throw new IllegalArgumentException();
    }

    public int setAge(int i) {
        return native_setAge(i, this.mNativeContext);
    }

    public int setAutoPauseEnable(int i) {
        return native_setAutoPauseEnable(i, this.mNativeContext);
    }

    public int setAutoPauseSpeed(float f) {
        return native_setAutoPauseSpeed(f, this.mNativeContext);
    }

    public int setHeight(int i) {
        return native_setHeight(i, this.mNativeContext);
    }

    public int setLog(int i, String str) {
        return native_setLog(i, str, this.mNativeContext);
    }

    public int setSex(int i) {
        return native_setSex(i, this.mNativeContext);
    }

    public int setTicker(long j) {
        return super.native_setTicker(j, this.mNativeContext);
    }

    public int setWeight(float f) {
        return native_setWeight(f, this.mNativeContext);
    }

    public int start(long j) {
        return native_start(j, this.mNativeContext);
    }

    public int statisticData(AlignData[] alignDataArr) {
        if (alignDataArr != null) {
            return native_statisticData(alignDataArr, this.mNativeContext);
        }
        throw new IllegalArgumentException();
    }

    public int stop(long j) {
        return native_stop(j, this.mNativeContext);
    }

    public int unregisterAutoPauseCallback(AutoPauseCallback autoPauseCallback) {
        return native_unregister_callback_autoPause(autoPauseCallback, this.mNativeContext);
    }

    public int unregisterBarCallback(BarCallback barCallback) {
        return native_unregister_callback_Bar(barCallback, this.mNativeContext);
    }

    public int unregisterBarCallbackr() {
        return unregisterBarCallback(null);
    }

    public int unregisterGpsCallback(GpsCallback gpsCallback) {
        return native_unregister_callback_receiveGps(gpsCallback, this.mNativeContext);
    }

    public int unregisterHrDataCallback(HRCallback hRCallback) {
        return native_unregister_callback_HrData(hRCallback, this.mNativeContext);
    }

    public int unregisterIndoorLearningArgCallback() {
        return native_unregister_callback_indoorLearningArg(null, this.mNativeContext);
    }

    public int unregisterLogCallback(LogCallback logCallback) {
        return native_unregister_callback_log(logCallback, this.mNativeContext);
    }

    public int unregisterStatisticCallback(StatisticCallback statisticCallback) {
        return native_unregister_callback_statisticData(statisticCallback, this.mNativeContext);
    }

    public int unregisterStepCallback(StepCallback stepCallback) {
        return native_unregister_callback_receiveStep(stepCallback, this.mNativeContext);
    }

    public void init() {
        super.init(-1, 0, 0, 0, 0.0f);
    }

    public int unregisterGpsCallback() {
        return unregisterGpsCallback(null);
    }

    public int unregisterHrDataCallback() {
        return unregisterHrDataCallback(null);
    }

    public int unregisterStatisticCallback() {
        return unregisterStatisticCallback(null);
    }

    public int unregisterStepCallback() {
        return unregisterStepCallback(null);
    }
}
