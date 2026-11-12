package com.huami.algo.healthcare;

/* JADX INFO: loaded from: classes5.dex */
public class Spo2Info {
    public int[] odEventResultArray;
    public int[] processSpo2ResultArray;
    public String osaProcessesJsonString = "";
    public String osaEventsJsonString = "";
    public int sleepStartTimeStamp = 0;
    public int sleepStopTimeStamp = 0;
    public int osaEventArrayLength = 0;
    public int odiMonitorTime = 0;
    public float odiValue = 0.0f;
    public int sleepBreathingScore = 0;
    public int sleepBreathingScoreCode = 0;
    public int processSpo2ResultArrayLength = 0;

    public void setInfos(int i, int i2, float f, int i3, int i4) {
        this.osaEventArrayLength = i;
        this.odiMonitorTime = i2;
        this.odiValue = f;
        this.sleepBreathingScore = i3;
        this.sleepBreathingScoreCode = i4;
    }
}
