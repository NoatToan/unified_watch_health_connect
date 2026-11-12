package com.huami.algo.healthcare;

/* JADX INFO: loaded from: classes5.dex */
public class HealthCare {
    public ECGException ecg_flag = new ECGException(false);
    private long nativeHandle;

    public class ECGException {
        public boolean BIOID_SIGNAL_QUALITY;

        public ECGException(boolean z) {
            this.BIOID_SIGNAL_QUALITY = z;
        }
    }

    static {
        System.loadLibrary("HealthCare");
    }

    public HealthCare(int i) {
        initialise(i);
    }

    private native void SetHealthParameter(boolean z, boolean z2, boolean z3, boolean z4, double d, int i, int i2, double d2, double d3, double d4, double d5, int i3, double d6);

    private native float getLnRMSSD();

    private native int get_RTFilter_State();

    private native void initialise(int i);

    public native void AFibdetector(String str);

    public native double[] BPChange(double[] dArr, double[] dArr2);

    public native boolean BioID_DataAPI(double[] dArr, double[] dArr2, String str, String str2, ECGException eCGException);

    public native double[] GetCardiacMeasure();

    public native double GetFatigue();

    public native double[][] GetFullEvaluation();

    public native double[] GetHealthMeasure();

    public native double[] GetHealthRec();

    public native int[] GetHealthScore();

    public native int[] GetHealthWeights();

    public native int[] GetThreshs();

    public native void Init_RTFilter();

    public native void LoadECG(double[] dArr);

    public native void PCdetector();

    public native void STSBdetector();

    public native void SetHealthScore(boolean z, double d, double d2, double d3, double d4, int[] iArr, double[] dArr, double[] dArr2, int[] iArr2, double[] dArr3, double[] dArr4, double[] dArr5, double[] dArr6, double[] dArr7, double[] dArr8, double[] dArr9, double[] dArr10, double[] dArr11, double[] dArr12, double[] dArr13);

    public native double[] Smooth(double[] dArr);

    @Deprecated
    public native int addModel(float[] fArr);

    public native int bioIdMatch(float[] fArr, float[] fArr2, int i);

    @Deprecated
    public native int bioIdMatchWithResult(SmoothResult smoothResult);

    @Deprecated
    public native ProcessResult bioIdPreProcessWithResult(SmoothResult smoothResult);

    public native ProcessResult bioIdPreprocess(float[] fArr);

    @Deprecated
    public native float[] buildEnrolledModel(float[] fArr, boolean z);

    public native void calculateSpo2ValidInfo(Spo2Info spo2Info);

    public native int deinitEcgFilter();

    public native void deinitFilter();

    public native DiseaseResult detectDiseaseForMedicalTreatment(float[] fArr, int i);

    public native DiseaseResult detectEcgDisease(float[] fArr, int i);

    public native void dispose();

    public native void fitProcessSpo2Info(Spo2Info spo2Info);

    public native int getAFResult(float[] fArr, int i);

    public native double getAFibProb();

    public native int getAverageHR();

    public native int getCurrentHR();

    public native String getEcgApiVersion(int i);

    public native EcgBeats getEcgBeats(float[] fArr, int i);

    public native int getEcgQualityFlag();

    public native float[] getEnrolledModel(float[] fArr, int i, boolean z);

    public native int getHR();

    @Deprecated
    public int getHRV() {
        return getHRVScore(getHRVRmssd());
    }

    public native float getHRVRmssd();

    @Deprecated
    public native int getHRVScore(float f);

    public native int getNoisePercent();

    public native EcgNoise[] getNoisePosition();

    public native long[] getNoiseTimePeriod();

    public native int[] getPACts();

    public native int[] getPVCts();

    public native int getParam(String str);

    public native float getQuality();

    @Deprecated
    public native int[] getRPeaksWithSmooth(float[] fArr);

    public native double[] getReport();

    public native int getRpeaksAmplitudeAvg();

    public native int getRpeaksAmplitudeMax();

    public native double[] getSTSBinfo();

    public native String getSpo2AlgoVersion();

    public native int[] getSpo2ScoreAndDispCode(int i, float f);

    public native String getVersion();

    public native int initEcgFilter(int i);

    public native void initFilter(boolean z);

    public native int registerLogCallback(AlgoLogCallback algoLogCallback);

    public native int resetParam();

    public native void setFRcoef(float f, float f2);

    public void setHealthParameter(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3, float f, float f2, int i4, float f3, int i5, float f4) {
        SetHealthParameter(z, z2, z3, z4, i, i2, i3, f, f2, i4, f3, i5, f4);
    }

    public native int setParam(String str, int i);

    public native void setSaturatedVoltage(double d);

    @Deprecated
    public native float smooth(float f);

    public native CommonSmoothResult smoothForDiagnose(float[] fArr);

    public native CommonSmoothResult smoothForDoctor(float[] fArr);

    public native CommonSmoothResult smoothForDoctorEnhance(float[] fArr, int i);

    @Deprecated
    public native float smoothForDoctorRealTime(float f);

    public native CommonSmoothResult smoothForNoise(float[] fArr);

    public native SmoothResult smoothForOffline(float[] fArr, int i);

    public native SmoothResult smoothForOfflineWithModel(float[] fArr, float[] fArr2, int i);

    public native float smoothForOnline(float f);

    public native CommonSmoothResult smoothForPowerFrequence(float[] fArr);

    @Deprecated
    public native float[] smoothHis(float[] fArr);

    @Deprecated
    public native SmoothResult smoothHisWithRPeaks(float[] fArr);

    @Deprecated
    public native float[] smoothWithModel(float[] fArr, float[] fArr2);

    public native int unregisterLogCallback();
}
