package com.xiaomi.hm.health.webapi.account.model;

import com.google.gson.annotations.SerializedName;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.network.base.model.Bean;
import com.xiaomi.hm.health.Constant;

/* JADX INFO: loaded from: classes22.dex */
public class HMBeanConfig extends Bean {

    @SerializedName("androidappNotifySettings")
    private Object A;

    @SerializedName("quietMode")
    private Object B;

    @SerializedName(HMAccountWebAPI.MILI_CONFIG_EXTRA_WEATHER)
    private String Q;

    @SerializedName("watchApps")
    private String R;

    @SerializedName("liftWristTime")
    private String S;

    @SerializedName("hrDetectFreq")
    private int T;

    @SerializedName("disconnectRemind")
    private String U;

    @SerializedName("phoneNotifyDelayEnable")
    private boolean V;

    @SerializedName("wearHand")
    private String a;

    @SerializedName("enableConnectedBtAdv")
    private boolean c;

    @SerializedName("goalStepsCount")
    private int d;

    @SerializedName("hasHeartRate")
    private boolean e;

    @SerializedName("inComingCallNotifyTime")
    private int f;

    @SerializedName("incallContactNotifyEnabled")
    private boolean g;

    @SerializedName("incallNotifyEnabled")
    private boolean h;

    @SerializedName("mOpenSleepNotify")
    private boolean i;

    @SerializedName("sleepAssist")
    private boolean j;

    @SerializedName("smsContactNotifyEnabled")
    private boolean k;

    @SerializedName("smsNotifyEnabled")
    private boolean l;

    @SerializedName("unit")
    private int m;

    @SerializedName("vibrate")
    private boolean n;

    @SerializedName("alarmNotifyEnabled")
    private boolean o;

    @SerializedName("weightMergeResult")
    private boolean p;

    @SerializedName("lightColor")
    private String r;

    @SerializedName("screenLock")
    private int s;

    @SerializedName("sedentaryRemind")
    private Object u;

    @SerializedName("emailNotifyEnabled")
    private boolean v;

    @SerializedName("avoidDisturdMode")
    private boolean y;

    @SerializedName("iosappNotifySettings")
    private Object z;

    @SerializedName("dayReportNoti")
    private String b = Constant.OFF;

    @SerializedName("weightUnit")
    private int q = -1;

    @SerializedName("proDisplay")
    private byte t = 9;

    @SerializedName("liftWristBrightView")
    private boolean w = false;

    @SerializedName("goalRemind")
    private boolean x = true;

    @SerializedName("unlockScreenType")
    private int C = -1;

    @SerializedName("timePanelType")
    private int D = 0;

    @SerializedName("timePanelLang")
    private int E = 0;

    @SerializedName("antiLost")
    private boolean F = false;

    @SerializedName("isNotificationOn")
    private boolean G = false;

    @SerializedName("checkNotification")
    private boolean H = false;

    @SerializedName("flipWrist")
    private boolean I = false;

    @SerializedName("incallNameDisplayEnabled")
    private boolean J = true;

    @SerializedName("smsNameDisplayEnabled")
    private boolean K = true;

    @SerializedName("shoePlaceMode")
    private String L = "LEFT_SHOE";

    @SerializedName("wholeHeartRate")
    private boolean M = false;

    @SerializedName("dialSetting")
    private int N = 0;

    @SerializedName("longPressSettings")
    private int O = 0;

    @SerializedName("hrDetectType")
    private int P = 0;

    @SerializedName("weightBfsUnit")
    private int W = 0;

    public String getAndroidappNotifySettings() {
        Object obj = this.A;
        return obj == null ? "" : obj.toString();
    }

    public String getDayReportNoti() {
        return this.b;
    }

    public int getDialSetting() {
        return this.N;
    }

    public String getDisconnectRemind() {
        return this.U;
    }

    public int getGoalStepsCount() {
        return this.d;
    }

    public int getHrDetectFreq() {
        return this.T;
    }

    public int getHrDetectType() {
        return this.P;
    }

    public int getInComingCallNotifyTime() {
        return this.f;
    }

    public String getIosappNotifySettings() {
        Object obj = this.z;
        return obj == null ? "" : obj.toString();
    }

    public String getLiftWristTime() {
        return this.S;
    }

    public String getLightColor() {
        return this.r;
    }

    public int getLongPressSettings() {
        return this.O;
    }

    @Override // com.huami.network.base.model.Bean
    public String[] getParses() {
        return new String[0];
    }

    public byte getProDisplay() {
        return this.t;
    }

    public String getQuietMode() {
        Object obj = this.B;
        return obj == null ? "" : obj.toString();
    }

    public int getScreenLock() {
        return this.s;
    }

    public String getSedentaryRemind() {
        Object obj = this.u;
        return obj == null ? "" : obj.toString();
    }

    public String getShoePlaceMode() {
        return this.L;
    }

    public int getTimePanelLang() {
        return this.E;
    }

    public int getTimePanelType() {
        return this.D;
    }

    public int getUnit() {
        return this.m;
    }

    public int getUnlockScreenType() {
        return this.C;
    }

    public String getWatchApps() {
        return this.R;
    }

    public String getWearHand() {
        return this.a;
    }

    public String getWeatherSetting() {
        return this.Q;
    }

    public int getWeightBfsUnit() {
        return this.W;
    }

    public int getWeightUnit() {
        return this.q;
    }

    public boolean isAlarmNotifyEnabled() {
        return this.o;
    }

    public boolean isAntiLost() {
        return this.F;
    }

    public boolean isAvoidDisturdMode() {
        return this.y;
    }

    public boolean isCheckNotification() {
        return this.H;
    }

    public boolean isEmailNotifyEnabled() {
        return this.v;
    }

    public boolean isEnableConnectedBtAdv() {
        return this.c;
    }

    public boolean isFlipWrist() {
        return this.I;
    }

    public boolean isGoalRemind() {
        return this.x;
    }

    public boolean isHasHeartRate() {
        return this.e;
    }

    public boolean isIncallContactNotifyEnabled() {
        return this.g;
    }

    public boolean isIncallNameDisplayEnabled() {
        return this.J;
    }

    public boolean isIncallNotifyEnabled() {
        return this.h;
    }

    public boolean isLiftWristBrightView() {
        return this.w;
    }

    public boolean isNotificationOn() {
        return this.G;
    }

    public boolean isPhoneNotifyDelayEnable() {
        return this.V;
    }

    public boolean isSleepAssist() {
        return this.j;
    }

    public boolean isSmsContactNotifyEnabled() {
        return this.k;
    }

    public boolean isSmsNameDisplayEnabled() {
        return this.K;
    }

    public boolean isSmsNotifyEnabled() {
        return this.l;
    }

    public boolean isVibrate() {
        return this.n;
    }

    public boolean isWeightMergeResult() {
        return this.p;
    }

    public boolean isWholeHeartRate() {
        return this.M;
    }

    public boolean ismOpenSleepNotify() {
        return this.i;
    }

    public void setAlarmNotifyEnabled(boolean z) {
        this.o = z;
    }

    public void setAndroidappNotifySettings(String str) {
        this.A = str;
    }

    public void setAntiLost(boolean z) {
        this.F = z;
    }

    public void setAvoidDisturdMode(boolean z) {
        this.y = z;
    }

    public void setCheckNotification(boolean z) {
        this.H = z;
    }

    public void setDayReportNoti(String str) {
        this.b = str;
    }

    public void setDialSetting(int i) {
        this.N = i;
    }

    public void setDisconnectRemind(String str) {
        this.U = str;
    }

    public void setEmailNotifyEnabled(boolean z) {
        this.v = z;
    }

    public void setEnableConnectedBtAdv(boolean z) {
        this.c = z;
    }

    public void setFlipWrist(boolean z) {
        this.I = z;
    }

    public void setGoalRemind(boolean z) {
        this.x = z;
    }

    public void setGoalStepsCount(int i) {
        this.d = i;
    }

    public void setHasHeartRate(boolean z) {
        this.e = z;
    }

    public void setHrDetectFreq(int i) {
        this.T = i;
    }

    public void setHrDetectType(int i) {
        this.P = i;
    }

    public void setInComingCallNotifyTime(int i) {
        this.f = i;
    }

    public void setIncallContactNotifyEnabled(boolean z) {
        this.g = z;
    }

    public void setIncallNameDisplayEnabled(boolean z) {
        this.J = z;
    }

    public void setIncallNotifyEnabled(boolean z) {
        this.h = z;
    }

    public void setIosappNotifySettings(String str) {
        this.z = str;
    }

    public void setLiftWristBrightView(boolean z) {
        this.w = z;
    }

    public void setLiftWristTime(String str) {
        this.S = str;
    }

    public void setLightColor(String str) {
        this.r = str;
    }

    public void setLongPressSettings(int i) {
        this.O = i;
    }

    public void setNotificationOn(boolean z) {
        this.G = z;
    }

    public void setPhoneNotifyDelayEnable(boolean z) {
        this.V = z;
    }

    public void setProDisplay(byte b) {
        this.t = b;
    }

    public void setQuietMode(String str) {
        this.B = str;
    }

    public void setScreenLock(int i) {
        this.s = i;
    }

    public void setSedentaryRemind(String str) {
        this.u = str;
    }

    public void setShoePlaceMode(String str) {
        this.L = str;
    }

    public void setSleepAssist(boolean z) {
        this.j = z;
    }

    public void setSmsContactNotifyEnabled(boolean z) {
        this.k = z;
    }

    public void setSmsNameDisplayEnabled(boolean z) {
        this.K = z;
    }

    public void setSmsNotifyEnabled(boolean z) {
        this.l = z;
    }

    public void setTimePanelLang(int i) {
        this.E = i;
    }

    public void setTimePanelType(int i) {
        this.D = i;
    }

    public void setUnit(int i) {
        this.m = i;
    }

    public void setUnlockScreenType(int i) {
        this.C = i;
    }

    public void setVibrate(boolean z) {
        this.n = z;
    }

    public void setWatchApps(String str) {
        this.R = str;
    }

    public void setWearHand(String str) {
        this.a = str;
    }

    public void setWeatherSetting(String str) {
        this.Q = str;
    }

    public void setWeightBfsUnit(int i) {
        this.W = i;
    }

    public void setWeightMergeResult(boolean z) {
        this.p = z;
    }

    public void setWeightUnit(int i) {
        this.q = i;
    }

    public void setWholeHeartRate(boolean z) {
        this.M = z;
    }

    public void setmOpenSleepNotify(boolean z) {
        this.i = z;
    }
}
