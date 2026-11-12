package com.xiaomi.hm.health.bt.model;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class HMStatisticInfo {
    private int a = -1;
    private int b = -1;
    private int c = -1;
    private int d = -1;
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private int o = -1;
    private int p = -1;
    private int q = -1;
    private int r = -1;
    private int s = -1;
    private int t = -1;
    private int u = -1;
    private int v = -1;
    private int w = -1;
    private int x = -1;
    private int y = -1;
    private int z = -1;
    private int A = -1;
    private int B = -1;
    private int C = -1;
    private long D = -1;
    private int E = -1;
    private int F = -1;
    private int G = -1;
    private int H = -1;

    public static HMStatisticInfo fromJsonString(String jsonStr) {
        HMStatisticInfo hMStatisticInfo = new HMStatisticInfo();
        try {
            JSONObject jSONObject = new JSONObject(jsonStr);
            hMStatisticInfo.setUpTime(jSONObject.optInt("upTime"));
            hMStatisticInfo.setRebootCount(jSONObject.optInt("rebootCount"));
            hMStatisticInfo.setDisconnectCount(jSONObject.optInt("disconnectCount"));
            hMStatisticInfo.setKeyCount(jSONObject.optInt("keyCount"));
            hMStatisticInfo.setLiftWristCount(jSONObject.optInt("liftWristCount"));
            hMStatisticInfo.setVibrateTime(jSONObject.optInt("vibrateTime"));
            hMStatisticInfo.setLcdTime(jSONObject.optInt("lcdTime"));
            hMStatisticInfo.setFlashTime(jSONObject.optInt("flashTime"));
            hMStatisticInfo.setPpgTime(jSONObject.optInt("ppgTime"));
            hMStatisticInfo.setConnectionTime(jSONObject.optInt("connectionTime"));
            hMStatisticInfo.setPhoneNotifyCount(jSONObject.optInt("phoneNotifyCount"));
            hMStatisticInfo.setAppNotifyCount(jSONObject.optInt("appNotifyCount"));
            hMStatisticInfo.setResumeTime(jSONObject.optInt("resumeTime"));
            hMStatisticInfo.setAlgorithmTime(jSONObject.optInt("algorithmTime"));
            hMStatisticInfo.setHardwareRebootCount(jSONObject.optInt("hardwareRebootCount"));
            hMStatisticInfo.setLastChargeTs(jSONObject.optLong("lastcharge") * 1000);
            hMStatisticInfo.setTotalRunTime(jSONObject.optInt("totalRunTime"));
            hMStatisticInfo.setTotalSleepTime(jSONObject.optInt("totalSleepTime"));
            hMStatisticInfo.setSixAxisTime(jSONObject.optInt("sixAxisTime"));
            hMStatisticInfo.setSedentarinessCount(jSONObject.optInt("sedentarinessCount"));
            hMStatisticInfo.setReconnectCount1(jSONObject.optInt("reconnectCount1"));
            hMStatisticInfo.setReconnectCount2(jSONObject.optInt("reconnectCount2"));
            hMStatisticInfo.setReconnectCount3(jSONObject.optInt("reconnectCount3"));
            hMStatisticInfo.setReconnectCount4(jSONObject.optInt("reconnectCount4"));
        } catch (Exception unused) {
        }
        return hMStatisticInfo;
    }

    public int getAdc() {
        return this.z;
    }

    public int getAdcOffset() {
        return this.y;
    }

    public int getAlgorithmTime() {
        return this.o;
    }

    public int getAppNotifyCount() {
        return this.l;
    }

    public int getAvePowerWaste() {
        return this.x;
    }

    public int getConnectionTime() {
        return this.k;
    }

    public int getDisconnectCount() {
        return this.d;
    }

    public int getExceptionOfSensor() {
        return this.A;
    }

    public int getFlashTime() {
        return this.i;
    }

    public int getHardwareRebootCount() {
        return this.c;
    }

    public int getKeyCount() {
        return this.e;
    }

    public long getLastChargeTs() {
        return this.D;
    }

    public int getLcdTime() {
        return this.h;
    }

    public int getLiftWristCount() {
        return this.f;
    }

    public int getMcuStatus() {
        return this.B;
    }

    public int getNoInterruptCount() {
        return this.p;
    }

    public int getNoSleepTime() {
        return this.C;
    }

    public int getPercentOfHigLatency() {
        return this.w;
    }

    public int getPercentOfLowLatency() {
        return this.u;
    }

    public int getPercentOfMedLatency() {
        return this.v;
    }

    public int getPhoneNotifyCount() {
        return this.m;
    }

    public int getPpgTime() {
        return this.j;
    }

    public int getRebootCount() {
        return this.b;
    }

    public int getReconnectCount1() {
        return this.q;
    }

    public int getReconnectCount2() {
        return this.r;
    }

    public int getReconnectCount3() {
        return this.s;
    }

    public int getReconnectCount4() {
        return this.t;
    }

    public int getResumeTime() {
        return this.n;
    }

    public int getSedentarinessCount() {
        return this.H;
    }

    public int getSixAxisTime() {
        return this.G;
    }

    public int getTotalRunTime() {
        return this.E;
    }

    public int getTotalSleepTime() {
        return this.F;
    }

    public int getUpTime() {
        return this.a;
    }

    public int getVibrateTime() {
        return this.g;
    }

    public void setAdc(int adc) {
        this.z = adc;
    }

    public void setAdcOffset(int adcOffset) {
        this.y = adcOffset;
    }

    public void setAlgorithmTime(int algorithmTime) {
        this.o = algorithmTime;
    }

    public void setAppNotifyCount(int count) {
        this.l = count;
    }

    public void setAvePowerWaste(int avePowerWaste) {
        this.x = avePowerWaste;
    }

    public void setConnectionTime(int connectionTime) {
        this.k = connectionTime;
    }

    public void setDisconnectCount(int disconnectCount) {
        this.d = disconnectCount;
    }

    public void setExceptionOfSensor(int exceptionOfSensor) {
        this.A = exceptionOfSensor;
    }

    public void setFlashTime(int flashTime) {
        this.i = flashTime;
    }

    public void setHardwareRebootCount(int hardwareRebootCount) {
        this.c = hardwareRebootCount;
    }

    public void setKeyCount(int keyCount) {
        this.e = keyCount;
    }

    public void setLastChargeTs(long ts) {
        this.D = ts;
    }

    public void setLcdTime(int lcdTime) {
        this.h = lcdTime;
    }

    public void setLiftWristCount(int count) {
        this.f = count;
    }

    public void setMcuStatus(int mcuStatus) {
        this.B = mcuStatus;
    }

    public void setNoInterruptCount(int noInterruptCount) {
        this.p = noInterruptCount;
    }

    public void setNoSleepTime(int noSleepTime) {
        this.C = noSleepTime;
    }

    public void setPercentOfHigLatency(int percentOfHigLatency) {
        this.w = percentOfHigLatency;
    }

    public void setPercentOfLowLatency(int percentOfLowLatency) {
        this.u = percentOfLowLatency;
    }

    public void setPercentOfMedLatency(int percentOfMedLatency) {
        this.v = percentOfMedLatency;
    }

    public void setPhoneNotifyCount(int count) {
        this.m = count;
    }

    public void setPpgTime(int ppgTime) {
        this.j = ppgTime;
    }

    public void setRebootCount(int rebootCount) {
        this.b = rebootCount;
    }

    public void setReconnectCount1(int reconnectCount1) {
        this.q = reconnectCount1;
    }

    public void setReconnectCount2(int reconnectCount2) {
        this.r = reconnectCount2;
    }

    public void setReconnectCount3(int reconnectCount3) {
        this.s = reconnectCount3;
    }

    public void setReconnectCount4(int reconnectCount4) {
        this.t = reconnectCount4;
    }

    public void setResumeTime(int resumeTime) {
        this.n = resumeTime;
    }

    public void setSedentarinessCount(int sedentarinessCount) {
        this.H = sedentarinessCount;
    }

    public void setSixAxisTime(int sixAxisTime) {
        this.G = sixAxisTime;
    }

    public void setTotalRunTime(int totalRunTime) {
        this.E = totalRunTime;
    }

    public void setTotalSleepTime(int totalSleepTime) {
        this.F = totalSleepTime;
    }

    public void setUpTime(int upTime) {
        this.a = upTime;
    }

    public void setVibrateTime(int vibrateTime) {
        this.g = vibrateTime;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("upTime", this.a);
            jSONObject.put("rebootCount", this.b);
            jSONObject.put("disconnectCount", this.d);
            jSONObject.put("keyCount", this.e);
            jSONObject.put("liftWristCount", this.f);
            jSONObject.put("ppgTime", this.j);
            jSONObject.put("vibrateTime", this.g);
            jSONObject.put("lcdTime", this.h);
            jSONObject.put("flashTime", this.i);
            jSONObject.put("connectionTime", this.k);
            jSONObject.put("appNotifyCount", this.l);
            jSONObject.put("phoneNotifyCount", this.m);
            jSONObject.put("resumeTime", this.n);
            jSONObject.put("algorithmTime", this.o);
            jSONObject.put("hardwareRebootCount", this.c);
            jSONObject.put("lastcharge", this.D / 1000);
            jSONObject.put("totalRunTime", this.E);
            jSONObject.put("totalSleepTime", this.F);
            jSONObject.put("sixAxisTime", this.G);
            jSONObject.put("sedentarinessCount", this.H);
            jSONObject.put("reconnectCount1", this.q);
            jSONObject.put("reconnectCount2", this.r);
            jSONObject.put("reconnectCount3", this.s);
            jSONObject.put("reconnectCount4", this.t);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toJsonString() {
        return toJson().toString();
    }

    public String toString() {
        return "HMStatisticInfo{upTime=" + this.a + ", rebootCount=" + this.b + ", disconnectCount=" + this.d + ", keyCount=" + this.e + ", liftWristCount=" + this.f + ", vibrateTime=" + this.g + ", lcdTime=" + this.h + ", flashTime=" + this.i + ", ppgTime=" + this.j + ", connectionTime=" + this.k + ", appNotifyCount=" + this.l + ", phoneNotifyCount=" + this.m + ", resumeTime=" + this.n + ", algorithmTime=" + this.o + ", totalRunTime=" + this.E + ", totalSleepTime=" + this.F + ", sixAxisTime=" + this.G + ", sedentarinessCount=" + this.H + '}';
    }
}
