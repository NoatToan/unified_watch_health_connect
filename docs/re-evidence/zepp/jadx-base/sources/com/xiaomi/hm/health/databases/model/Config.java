package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
@Deprecated
public class Config {
    private Boolean A;
    private String B;
    private String C;
    private String D;
    private Integer E;
    private Integer F;
    private Integer G;
    private Boolean H;
    private Boolean I;
    private Boolean J;
    private Boolean K;
    private Boolean L;
    private Boolean M;
    private String N;
    private Integer O;
    private Boolean P;
    private Integer Q;
    private Integer R;
    private Integer S;
    private String T;
    private String U;
    private String V;
    private Integer W;
    private String X;
    private Boolean Y;
    private Long a;
    private Boolean b;
    private String c;
    private Integer d;
    private Boolean e;
    private Integer f;
    private String g;
    private Integer h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Integer l;
    private Boolean m;
    private String n;
    private Boolean o;
    private Integer p;
    private Boolean q;
    private Boolean r;
    private Boolean s;
    private Boolean t;
    private Integer u;
    private Byte v;
    private String w;
    private Boolean x;
    private Boolean y;
    private Boolean z;

    public Config(Long l, Boolean bool, String str, Integer num, Boolean bool2, Integer num2, String str2, Integer num3, Boolean bool3, Boolean bool4, Boolean bool5, Integer num4, Boolean bool6, String str3, Boolean bool7, Integer num5, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Integer num6, Byte b, String str4, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, String str5, String str6, String str7, Integer num7, Integer num8, Integer num9, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, String str8, Integer num10, Boolean bool22, Integer num11, Integer num12, Integer num13, String str9, String str10, String str11, Integer num14, String str12, Boolean bool23) {
        this.a = l;
        this.b = bool;
        this.c = str;
        this.d = num;
        this.e = bool2;
        this.f = num2;
        this.g = str2;
        this.h = num3;
        this.i = bool3;
        this.j = bool4;
        this.k = bool5;
        this.l = num4;
        this.m = bool6;
        this.n = str3;
        this.o = bool7;
        this.p = num5;
        this.q = bool8;
        this.r = bool9;
        this.s = bool10;
        this.t = bool11;
        this.u = num6;
        this.v = b;
        this.w = str4;
        this.x = bool12;
        this.y = bool13;
        this.z = bool14;
        this.A = bool15;
        this.B = str5;
        this.C = str6;
        this.D = str7;
        this.E = num7;
        this.F = num8;
        this.G = num9;
        this.H = bool16;
        this.I = bool17;
        this.J = bool18;
        this.K = bool19;
        this.L = bool20;
        this.M = bool21;
        this.N = str8;
        this.O = num10;
        this.P = bool22;
        this.Q = num11;
        this.R = num12;
        this.S = num13;
        this.T = str9;
        this.U = str10;
        this.V = str11;
        this.W = num14;
        this.X = str12;
        this.Y = bool23;
    }

    public Boolean getAlarmNotifyEnabled() {
        return this.b;
    }

    public String getAndroidappNotifySettings() {
        return this.C;
    }

    public Boolean getAntiLost() {
        return this.H;
    }

    public Boolean getAvoidDisturdMode() {
        return this.A;
    }

    public Boolean getCheckNotification() {
        return this.J;
    }

    public String getDayReportNoti() {
        return this.c;
    }

    public Integer getDialSetting() {
        return this.Q;
    }

    public String getDisconnectRemind() {
        return this.X;
    }

    public Integer getDisconnectedReminder() {
        return this.d;
    }

    public Boolean getEmailNotifyEnabled() {
        return this.x;
    }

    public Boolean getEnableConnectedBtAdv() {
        return this.e;
    }

    public Boolean getFlipWrist() {
        return this.K;
    }

    public Boolean getGoalRemind() {
        return this.z;
    }

    public Integer getGoalStepsCount() {
        return this.f;
    }

    public Boolean getHasHeartRate() {
        return this.t;
    }

    public Integer getHrDetectFreq() {
        return this.W;
    }

    public Integer getHrDetectType() {
        return this.S;
    }

    public Long getId() {
        return this.a;
    }

    public Integer getInComingCallNotifyTime() {
        return this.h;
    }

    public Boolean getIncallContactNotifyEnabled() {
        return this.r;
    }

    public Boolean getIncallNameDisplayEnabled() {
        return this.L;
    }

    public Boolean getIncallNotifyEnabled() {
        return this.k;
    }

    public String getIosappNotifySettings() {
        return this.B;
    }

    public Boolean getIsNotificationOn() {
        return this.I;
    }

    public Boolean getLiftWristBrightView() {
        return this.y;
    }

    public String getLiftWristTime() {
        return this.V;
    }

    public String getLightColor() {
        return this.g;
    }

    public Integer getLongPressSettings() {
        return this.R;
    }

    public Boolean getMOpenSleepNotify() {
        return this.i;
    }

    public Boolean getPhoneNotifyDelayEnable() {
        return this.Y;
    }

    public Byte getProDisplay() {
        return this.v;
    }

    public String getQuietMode() {
        return this.D;
    }

    public Integer getScreenLock() {
        return this.u;
    }

    public String getSedentaryRemind() {
        return this.w;
    }

    public String getShoePlaceMode() {
        return this.N;
    }

    public Boolean getSleepAssist() {
        return this.s;
    }

    public Boolean getSmsContactNotifyEnabled() {
        return this.q;
    }

    public Boolean getSmsNameDisplayEnabled() {
        return this.M;
    }

    public Boolean getSmsNotifyEnabled() {
        return this.j;
    }

    public Integer getTimePanelLang() {
        return this.G;
    }

    public Integer getTimePanelType() {
        return this.F;
    }

    public Integer getUnit() {
        return this.l;
    }

    public Integer getUnlockScreenType() {
        return this.E;
    }

    public Boolean getVibrate() {
        return this.m;
    }

    public String getWatchApps() {
        return this.U;
    }

    public String getWearHand() {
        return this.n;
    }

    public String getWeatherSetting() {
        return this.T;
    }

    public Integer getWeightBfsUnit() {
        return this.O;
    }

    public Boolean getWeightMergeResult() {
        return this.o;
    }

    public Integer getWeightUnit() {
        return this.p;
    }

    public Boolean getWholeHeartRate() {
        return this.P;
    }

    public void setAlarmNotifyEnabled(Boolean bool) {
        this.b = bool;
    }

    public void setAndroidappNotifySettings(String str) {
        this.C = str;
    }

    public void setAntiLost(Boolean bool) {
        this.H = bool;
    }

    public void setAvoidDisturdMode(Boolean bool) {
        this.A = bool;
    }

    public void setCheckNotification(Boolean bool) {
        this.J = bool;
    }

    public void setDayReportNoti(String str) {
        this.c = str;
    }

    public void setDialSetting(Integer num) {
        this.Q = num;
    }

    public void setDisconnectRemind(String str) {
        this.X = str;
    }

    public void setDisconnectedReminder(Integer num) {
        this.d = num;
    }

    public void setEmailNotifyEnabled(Boolean bool) {
        this.x = bool;
    }

    public void setEnableConnectedBtAdv(Boolean bool) {
        this.e = bool;
    }

    public void setFlipWrist(Boolean bool) {
        this.K = bool;
    }

    public void setGoalRemind(Boolean bool) {
        this.z = bool;
    }

    public void setGoalStepsCount(Integer num) {
        this.f = num;
    }

    public void setHasHeartRate(Boolean bool) {
        this.t = bool;
    }

    public void setHrDetectFreq(Integer num) {
        this.W = num;
    }

    public void setHrDetectType(Integer num) {
        this.S = num;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setInComingCallNotifyTime(Integer num) {
        this.h = num;
    }

    public void setIncallContactNotifyEnabled(Boolean bool) {
        this.r = bool;
    }

    public void setIncallNameDisplayEnabled(Boolean bool) {
        this.L = bool;
    }

    public void setIncallNotifyEnabled(Boolean bool) {
        this.k = bool;
    }

    public void setIosappNotifySettings(String str) {
        this.B = str;
    }

    public void setIsNotificationOn(Boolean bool) {
        this.I = bool;
    }

    public void setLiftWristBrightView(Boolean bool) {
        this.y = bool;
    }

    public void setLiftWristTime(String str) {
        this.V = str;
    }

    public void setLightColor(String str) {
        this.g = str;
    }

    public void setLongPressSettings(Integer num) {
        this.R = num;
    }

    public void setMOpenSleepNotify(Boolean bool) {
        this.i = bool;
    }

    public void setPhoneNotifyDelayEnable(Boolean bool) {
        this.Y = bool;
    }

    public void setProDisplay(Byte b) {
        this.v = b;
    }

    public void setQuietMode(String str) {
        this.D = str;
    }

    public void setScreenLock(Integer num) {
        this.u = num;
    }

    public void setSedentaryRemind(String str) {
        this.w = str;
    }

    public void setShoePlaceMode(String str) {
        this.N = str;
    }

    public void setSleepAssist(Boolean bool) {
        this.s = bool;
    }

    public void setSmsContactNotifyEnabled(Boolean bool) {
        this.q = bool;
    }

    public void setSmsNameDisplayEnabled(Boolean bool) {
        this.M = bool;
    }

    public void setSmsNotifyEnabled(Boolean bool) {
        this.j = bool;
    }

    public void setTimePanelLang(Integer num) {
        this.G = num;
    }

    public void setTimePanelType(Integer num) {
        this.F = num;
    }

    public void setUnit(Integer num) {
        this.l = num;
    }

    public void setUnlockScreenType(Integer num) {
        this.E = num;
    }

    public void setVibrate(Boolean bool) {
        this.m = bool;
    }

    public void setWatchApps(String str) {
        this.U = str;
    }

    public void setWearHand(String str) {
        this.n = str;
    }

    public void setWeatherSetting(String str) {
        this.T = str;
    }

    public void setWeightBfsUnit(Integer num) {
        this.O = num;
    }

    public void setWeightMergeResult(Boolean bool) {
        this.o = bool;
    }

    public void setWeightUnit(Integer num) {
        this.p = num;
    }

    public void setWholeHeartRate(Boolean bool) {
        this.P = bool;
    }

    public Config() {
    }
}
