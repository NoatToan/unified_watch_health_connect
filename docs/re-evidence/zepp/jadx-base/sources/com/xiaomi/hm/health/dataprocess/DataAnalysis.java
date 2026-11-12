package com.xiaomi.hm.health.dataprocess;

import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes20.dex */
public class DataAnalysis {
    private static final int ANALYSIS_TYPE = 0;
    public static final int ANALYSIS_TYPE_MILI = 0;
    public static final int ANALYSIS_TYPE_SHOES = 1;
    private static final String TAG = "DataAnalysis";
    private static Boolean sleepState;

    static {
        try {
            System.loadLibrary("dataProcess");
            HMLog.wtf(TAG, "DataAnalysis version:" + getVersion(), new Object[0]);
        } catch (Throwable th) {
            HMLog.wtf(TAG, "Throwable:" + th, new Object[0]);
        }
        sleepState = Boolean.FALSE;
    }

    public static synchronized void dataDestory() {
        destoryData();
    }

    public static synchronized void dataInit(UserInfo userInfo, DaySportData daySportData, DaySportData daySportData2, DaySportData daySportData3) {
        byte[] binaryHRDataOrigin;
        byte[] bArr;
        int i;
        int length;
        byte[] bArr2;
        int length2;
        if (daySportData2 == null) {
            return;
        }
        if (daySportData != null) {
            byte[] algoBinaryData = daySportData.getAlgoBinaryData();
            int length3 = algoBinaryData.length;
            binaryHRDataOrigin = daySportData.getBinaryHRDataOrigin();
            if (binaryHRDataOrigin != null) {
                length = binaryHRDataOrigin.length;
                bArr = algoBinaryData;
                i = length3;
            } else {
                bArr = algoBinaryData;
                i = length3;
                length = 0;
            }
        } else {
            binaryHRDataOrigin = null;
            bArr = null;
            length = 0;
            i = 0;
        }
        byte[] algoBinaryData2 = daySportData2.getAlgoBinaryData();
        int length4 = algoBinaryData2.length;
        byte[] binaryHRDataOrigin2 = daySportData2.getBinaryHRDataOrigin();
        int length5 = binaryHRDataOrigin2 != null ? binaryHRDataOrigin2.length : 0;
        if (daySportData3 != null) {
            byte[] algoBinaryData3 = daySportData3.getAlgoBinaryData();
            bArr2 = algoBinaryData3;
            length2 = algoBinaryData3.length;
        } else {
            bArr2 = null;
            length2 = 0;
        }
        initData(0, userInfo, 10, bArr, i, algoBinaryData2, length4, bArr2, length2);
        initHRData(binaryHRDataOrigin, length, binaryHRDataOrigin2, length5);
    }

    public static synchronized void dataPostProcess(UserInfo userInfo, ShoesDaySportData shoesDaySportData) {
        if (shoesDaySportData == null) {
            return;
        }
        byte[] binaryData = shoesDaySportData.getBinaryData();
        initData(1, userInfo, 10, null, 0, binaryData, binaryData.length, null, 0);
        processData(1);
        StepsInfo stepsInfo = new StepsInfo();
        stepsInfo.setSportDay(shoesDaySportData.getSportDay());
        getData(1, null, stepsInfo);
        HMLog.i(TAG, stepsInfo.toString(), new Object[0]);
        shoesDaySportData.setStepsInfo(stepsInfo);
        destoryData();
    }

    public static synchronized void dataProcess(DaySportData daySportData) {
        if (daySportData == null) {
            return;
        }
        setRemDetectionStatus(0);
        processData(0);
        SleepInfo sleepInfo = new SleepInfo(daySportData.getTimestamp());
        StepsInfo stepsInfo = new StepsInfo();
        stepsInfo.setSportDay(daySportData.getSportDay());
        sleepInfo.setIs24Sleep(sleepState);
        getData(0, sleepInfo, stepsInfo);
        HMLog.i(TAG, sleepInfo.toString(), new Object[0]);
        HMLog.i(TAG, stepsInfo.toString(), new Object[0]);
        daySportData.setSleepInfo(sleepInfo);
        daySportData.setStepsInfo(stepsInfo);
    }

    private static native void destoryData();

    public static int[] getCalAndDis(int i, int i2, int i3, int i4, UserInfo userInfo) {
        int realCal;
        int i5;
        HMLog.i(TAG, "realtimeStep:" + i + ",existSteps:" + i2 + ",existDis:" + i3 + ",existCal" + i4, new Object[0]);
        StringBuilder sb = new StringBuilder();
        sb.append("UserInfo:");
        sb.append(userInfo);
        HMLog.i(TAG, sb.toString(), new Object[0]);
        if (i2 <= 0 || i3 <= 0 || i4 <= 0) {
            float f = userInfo.height;
            float f2 = userInfo.weight;
            int i6 = (int) (((double) i) * (f <= 0.0f ? 0.714d : (((double) f) * 0.42d) / 100.0d));
            realCal = getRealCal(i, userInfo.gender, f, f2, userInfo.age);
            i5 = i6;
        } else {
            float f3 = i / i2;
            i5 = (int) (i3 * f3);
            realCal = (int) (i4 * f3);
        }
        HMLog.i(TAG, "dis:" + i5 + ",cal:" + realCal, new Object[0]);
        return new int[]{i5, realCal};
    }

    private static native void getData(int i, SleepInfo sleepInfo, StepsInfo stepsInfo);

    private static int getRealCal(int i, int i2, float f, float f2, int i3) {
        double d = (((double) 65) * 1.0d) / 60.0d;
        double d2 = (i2 == 1 ? ((((double) (f2 * 10.0f)) + (((double) f) * 6.25d)) - ((double) (i3 * 5))) + 5.0d : ((((double) (f2 * 10.0f)) + (((double) f) * 6.25d)) - ((double) (i3 * 5))) - 161.0d) / 1440.0d;
        if (d2 > 0.0d) {
            d = d2;
        }
        return (int) (((d * ((double) i)) * ((((double) f) * 1.7d) - 90.0d)) / 9000.0d);
    }

    public static native String getVersion();

    private static native void initData(int i, UserInfo userInfo, int i2, byte[] bArr, int i3, byte[] bArr2, int i4, byte[] bArr3, int i5);

    private static native void initHRData(byte[] bArr, int i, byte[] bArr2, int i2);

    private static native void processData(int i);

    public static native void set24HoursSleepDetectionStatus(int i);

    public static native void setAlgoVersionValue(int i);

    public static native void setDaySleepDetectionStatus(int i);

    public static void setIs24HoursSleepDetectionStatus(Boolean bool) {
        sleepState = bool;
    }

    public static native void setRemDetectionStatus(int i);

    public static native void setSleepResultOfLastThirtyDays(int[] iArr, int[] iArr2, int i);

    public static native void setUserModifySleep(int i, int i2);
}
