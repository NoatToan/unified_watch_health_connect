package com.huami.watch.dataflow.model.health.process;

import android.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public final class DataAnalysis {
    private static final String a = "DataAnalysis";
    private static final int b = 6;

    static {
        String simpleName = DataAnalysis.class.getSimpleName();
        try {
            System.loadLibrary("dataProcess");
            Log.i(simpleName, "DataAnalysis version:" + getVersion());
        } catch (Exception e) {
            Log.e(a, e.toString());
        }
    }

    public static void dataPostProcess(PersonInfo personInfo, DaySportData daySportData, DaySportData daySportData2, DaySportData daySportData3, double d, double d2, int i) {
        dataPostProcessNative(personInfo, daySportData, daySportData2, daySportData3, d, d2, i);
    }

    public static void dataPostProcessNative(PersonInfo personInfo, DaySportData daySportData, DaySportData daySportData2, DaySportData daySportData3, double d, double d2, int i) {
        byte[] hrBinaryData;
        byte[] bArr;
        int length;
        int i2;
        byte[] bArr2;
        int length2;
        if (daySportData2 == null) {
            return;
        }
        if (daySportData != null) {
            byte[] binaryData = daySportData.getBinaryData();
            int length3 = binaryData.length;
            hrBinaryData = daySportData.getHrBinaryData();
            length = hrBinaryData.length;
            bArr = binaryData;
            i2 = length3;
        } else {
            hrBinaryData = null;
            bArr = null;
            length = 0;
            i2 = 0;
        }
        byte[] binaryData2 = daySportData2.getBinaryData();
        int length4 = binaryData2.length;
        byte[] hrBinaryData2 = daySportData2.getHrBinaryData();
        int length5 = hrBinaryData2.length;
        if (daySportData3 != null) {
            byte[] binaryData3 = daySportData3.getBinaryData();
            length2 = binaryData3.length;
            bArr2 = binaryData3;
        } else {
            bArr2 = null;
            length2 = 0;
        }
        String str = a;
        Log.d(str, "init params info:" + personInfo.toString());
        Log.d(str, "yData length:" + i2 + " tData length:" + length4 + " nData length:" + length2);
        StringBuilder sb = new StringBuilder();
        sb.append("yHrData lenght:");
        sb.append(length);
        sb.append(" tHrData length:");
        sb.append(length5);
        Log.d(str, sb.toString());
        initData(personInfo, 60, bArr, i2, binaryData2, length4, bArr2, length2);
        initHRData(hrBinaryData, length, hrBinaryData2, length5);
        setBandType(6);
        setSleepVariationParameters(d, d2, i);
        processData();
        SleepInfo sleepInfo = new SleepInfo(daySportData2.getDay());
        StepsInfo stepsInfo = new StepsInfo(daySportData2.getDay());
        Log.d(str, "sleepInfo >> " + sleepInfo.toString() + "StepsInfo >> " + stepsInfo.toString());
        getData(sleepInfo, stepsInfo);
        getSleepQualityScores(sleepInfo);
        daySportData2.setSleepInfo(sleepInfo);
        daySportData2.setStepsInfo(stepsInfo);
        destoryData();
    }

    public static native void destoryData();

    public static native void getData(SleepInfo sleepInfo, StepsInfo stepsInfo);

    public static native double getDefaultDailyCaloriesGoal(PersonInfo personInfo);

    public static native void getSleepQualityScores(SleepInfo sleepInfo);

    public static native String getVersion();

    public static native synchronized void initData(PersonInfo personInfo, int i, byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, int i4);

    public static native void initHRData(byte[] bArr, int i, byte[] bArr2, int i2);

    public static native void processData();

    public static native void setBandType(int i);

    public static native void setSleepVariationParameters(double d, double d2, int i);
}
