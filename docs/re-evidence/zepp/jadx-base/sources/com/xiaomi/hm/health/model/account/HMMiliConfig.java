package com.xiaomi.hm.health.model.account;

import android.text.TextUtils;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.databases.model.Config;

/* JADX INFO: loaded from: classes21.dex */
public class HMMiliConfig {
    public static final String BLUE = "BLUE";
    public static final String GREEN = "GREEN";
    public static final int INCOMING_CALL_DEFAULT = 259;
    public static final int INCOMING_CALL_DEFAULT_SEC = 3;
    public static final int INCOMING_CALL_DISABLE_BIT = 256;
    public static final String LEFT_HAND = "LEFT_HAND";
    public static final String LEFT_SHOE = "LEFT_SHOE";
    public static final String ONBODY = "ONBODY";
    public static final String ONBODY_IOS = "PENDANT";
    public static final String ORANGE = "ORANGE";
    public static final String RED = "RED";
    public static final String RIGHT_HAND = "RIGHT_HAND";
    public static final String RIGHT_SHOE = "RIGHT_SHOE";
    private static final String TAG = "HMMiliConfig";
    private String androidappNotifySettings;
    private boolean avoidDisturdMode;
    private String disconnectRemind;
    private boolean emailNotifyEnabled;
    private Integer hrDetectFreq;
    private Integer hrDetectType;
    private transient long id;
    private String iosappNotifySettings;
    private String liftWristTime;
    private boolean phoneNotifyDelayEnable;
    private String quietMode;
    private String sedentaryRemind;
    private String watchApps;
    private String weatherSetting;
    private String wearHand = "LEFT_HAND";
    private String dayReportNoti = Constant.OFF;
    private String lightColor = BLUE;
    private boolean enableConnectedBtAdv = false;
    private int goalStepsCount = 0;
    private boolean hasHeartRate = false;
    private int inComingCallNotifyTime = 259;
    private boolean incallContactNotifyEnabled = false;
    private boolean incallNotifyEnabled = false;
    private boolean mOpenSleepNotify = false;
    private boolean sleepAssist = false;
    private boolean smsContactNotifyEnabled = false;
    private boolean smsNotifyEnabled = false;
    private int unit = 0;
    private boolean vibrate = false;
    private boolean alarmNotifyEnabled = false;
    private boolean weightMergeResult = false;
    private int weightUnit = 0;
    private int screenLock = 0;
    private byte proDisplay = 9;
    private boolean liftWristBrightView = false;
    private boolean goalRemind = true;
    private int unlockScreenType = -1;
    private int timePanelType = 0;
    private int timePanelLang = 0;
    private boolean antiLost = false;
    private boolean isNotificationOn = false;
    private boolean checkNotification = false;
    private boolean flipWrist = false;
    private boolean incallNameDisplayEnabled = true;
    private boolean smsNameDisplayEnabled = true;
    private String shoePlaceMode = "LEFT_SHOE";
    private int weightBfsUnit = 0;
    private boolean wholeHeartRate = false;
    private int dialSetting = 0;
    private int longPressSettings = 0;

    public static HMMiliConfig getHMMiliConfig(Config config) {
        if (config == null) {
            return null;
        }
        HMMiliConfig hMMiliConfig = new HMMiliConfig();
        hMMiliConfig.wearHand = TextUtils.isEmpty(config.getWearHand()) ? "LEFT_HAND" : config.getWearHand();
        hMMiliConfig.dayReportNoti = TextUtils.isEmpty(config.getDayReportNoti()) ? Constant.OFF : config.getDayReportNoti();
        hMMiliConfig.lightColor = TextUtils.isEmpty(config.getLightColor()) ? BLUE : config.getLightColor();
        hMMiliConfig.enableConnectedBtAdv = config.getEnableConnectedBtAdv() == null ? false : config.getEnableConnectedBtAdv().booleanValue();
        hMMiliConfig.goalStepsCount = config.getGoalStepsCount() == null ? 0 : config.getGoalStepsCount().intValue();
        hMMiliConfig.hasHeartRate = config.getHasHeartRate() == null ? false : config.getHasHeartRate().booleanValue();
        hMMiliConfig.inComingCallNotifyTime = config.getInComingCallNotifyTime() == null ? 259 : config.getInComingCallNotifyTime().intValue();
        hMMiliConfig.incallContactNotifyEnabled = config.getIncallContactNotifyEnabled() == null ? false : config.getIncallContactNotifyEnabled().booleanValue();
        hMMiliConfig.incallNotifyEnabled = config.getIncallNotifyEnabled() == null ? false : config.getIncallNotifyEnabled().booleanValue();
        hMMiliConfig.mOpenSleepNotify = config.getMOpenSleepNotify() == null ? false : config.getMOpenSleepNotify().booleanValue();
        hMMiliConfig.sleepAssist = config.getSleepAssist() == null ? false : config.getSleepAssist().booleanValue();
        hMMiliConfig.smsContactNotifyEnabled = config.getSmsContactNotifyEnabled() == null ? false : config.getSmsContactNotifyEnabled().booleanValue();
        hMMiliConfig.smsNotifyEnabled = config.getSmsNotifyEnabled() == null ? false : config.getSmsNotifyEnabled().booleanValue();
        hMMiliConfig.unit = config.getUnit() == null ? 0 : config.getUnit().intValue();
        hMMiliConfig.vibrate = config.getVibrate() == null ? false : config.getVibrate().booleanValue();
        hMMiliConfig.alarmNotifyEnabled = config.getAlarmNotifyEnabled() == null ? false : config.getAlarmNotifyEnabled().booleanValue();
        hMMiliConfig.weightMergeResult = config.getWeightMergeResult() == null ? false : config.getWeightMergeResult().booleanValue();
        hMMiliConfig.weightUnit = config.getWeightUnit() == null ? 0 : config.getWeightUnit().intValue();
        hMMiliConfig.screenLock = config.getScreenLock() == null ? 0 : config.getScreenLock().intValue();
        hMMiliConfig.proDisplay = config.getProDisplay() == null ? (byte) 9 : config.getProDisplay().byteValue();
        hMMiliConfig.sedentaryRemind = config.getSedentaryRemind() == null ? "" : config.getSedentaryRemind();
        hMMiliConfig.emailNotifyEnabled = config.getEmailNotifyEnabled() == null ? false : config.getEmailNotifyEnabled().booleanValue();
        hMMiliConfig.liftWristBrightView = config.getLiftWristBrightView() == null ? false : config.getLiftWristBrightView().booleanValue();
        hMMiliConfig.goalRemind = config.getGoalRemind() == null ? false : config.getGoalRemind().booleanValue();
        hMMiliConfig.avoidDisturdMode = config.getAvoidDisturdMode() == null ? false : config.getAvoidDisturdMode().booleanValue();
        hMMiliConfig.iosappNotifySettings = config.getIosappNotifySettings() == null ? "" : config.getIosappNotifySettings();
        hMMiliConfig.androidappNotifySettings = config.getAndroidappNotifySettings() == null ? "" : config.getAndroidappNotifySettings();
        hMMiliConfig.quietMode = config.getQuietMode() == null ? "" : config.getQuietMode();
        hMMiliConfig.unlockScreenType = config.getUnlockScreenType() == null ? -1 : config.getUnlockScreenType().intValue();
        hMMiliConfig.weightBfsUnit = config.getWeightBfsUnit() == null ? 0 : config.getWeightBfsUnit().intValue();
        hMMiliConfig.timePanelType = config.getTimePanelType() == null ? 0 : config.getTimePanelType().intValue();
        hMMiliConfig.timePanelLang = config.getTimePanelLang() == null ? 0 : config.getTimePanelLang().intValue();
        hMMiliConfig.antiLost = config.getAntiLost() == null ? false : config.getAntiLost().booleanValue();
        hMMiliConfig.isNotificationOn = config.getIsNotificationOn() == null ? false : config.getIsNotificationOn().booleanValue();
        hMMiliConfig.checkNotification = config.getCheckNotification() == null ? false : config.getCheckNotification().booleanValue();
        hMMiliConfig.flipWrist = config.getFlipWrist() == null ? false : config.getFlipWrist().booleanValue();
        hMMiliConfig.incallNameDisplayEnabled = config.getIncallNameDisplayEnabled() == null ? true : config.getIncallNameDisplayEnabled().booleanValue();
        hMMiliConfig.smsNameDisplayEnabled = config.getSmsNameDisplayEnabled() == null ? true : config.getSmsNameDisplayEnabled().booleanValue();
        hMMiliConfig.shoePlaceMode = TextUtils.isEmpty(config.getShoePlaceMode()) ? "LEFT_SHOE" : config.getShoePlaceMode();
        hMMiliConfig.id = config.getId() == null ? 0L : config.getId().longValue();
        hMMiliConfig.wholeHeartRate = config.getWholeHeartRate() == null ? false : config.getWholeHeartRate().booleanValue();
        hMMiliConfig.dialSetting = config.getDialSetting() == null ? 0 : config.getDialSetting().intValue();
        hMMiliConfig.longPressSettings = config.getLongPressSettings() == null ? 0 : config.getLongPressSettings().intValue();
        hMMiliConfig.hrDetectType = Integer.valueOf(config.getHrDetectType() != null ? config.getHrDetectType().intValue() : 0);
        hMMiliConfig.hrDetectFreq = Integer.valueOf(config.getHrDetectFreq() != null ? config.getHrDetectFreq().intValue() : 1);
        hMMiliConfig.weatherSetting = config.getWeatherSetting() == null ? "" : config.getWeatherSetting();
        hMMiliConfig.watchApps = config.getWatchApps() == null ? "" : config.getWatchApps();
        hMMiliConfig.liftWristTime = config.getLiftWristTime() == null ? "" : config.getLiftWristTime();
        hMMiliConfig.disconnectRemind = config.getDisconnectRemind() != null ? config.getDisconnectRemind() : "";
        if (config.getPhoneNotifyDelayEnable() == null) {
            hMMiliConfig.setPhoneNotifyDelayEnable(hMMiliConfig.incallNotifyEnabled);
        } else {
            hMMiliConfig.setPhoneNotifyDelayEnable(config.getPhoneNotifyDelayEnable().booleanValue());
        }
        return hMMiliConfig;
    }

    public void disableInComingCallTime() {
        this.incallNotifyEnabled = false;
        this.inComingCallNotifyTime |= 256;
        HMLog.d(TAG, "disable incoming = " + this.inComingCallNotifyTime, new Object[0]);
    }

    public void enableInComingCallTime() {
        this.incallNotifyEnabled = true;
        this.inComingCallNotifyTime &= 255;
        HMLog.d(TAG, "enable incoming = " + this.inComingCallNotifyTime, new Object[0]);
    }

    public String getAndroidappNotifySettings() {
        return this.androidappNotifySettings;
    }

    public void getConfig(Config config) {
        config.setWearHand(this.wearHand);
        config.setDayReportNoti(this.dayReportNoti);
        config.setLightColor(this.lightColor);
        config.setEnableConnectedBtAdv(Boolean.valueOf(this.enableConnectedBtAdv));
        config.setGoalStepsCount(Integer.valueOf(this.goalStepsCount));
        config.setHasHeartRate(Boolean.valueOf(this.hasHeartRate));
        config.setInComingCallNotifyTime(Integer.valueOf(this.inComingCallNotifyTime));
        config.setIncallContactNotifyEnabled(Boolean.valueOf(this.incallContactNotifyEnabled));
        config.setIncallNotifyEnabled(Boolean.valueOf(this.incallNotifyEnabled));
        config.setMOpenSleepNotify(Boolean.valueOf(this.mOpenSleepNotify));
        config.setSleepAssist(Boolean.valueOf(this.sleepAssist));
        config.setSmsContactNotifyEnabled(Boolean.valueOf(this.smsContactNotifyEnabled));
        config.setSmsNotifyEnabled(Boolean.valueOf(this.smsNotifyEnabled));
        config.setUnit(Integer.valueOf(this.unit));
        config.setVibrate(Boolean.valueOf(this.vibrate));
        config.setAlarmNotifyEnabled(Boolean.valueOf(this.alarmNotifyEnabled));
        config.setWeightMergeResult(Boolean.valueOf(this.weightMergeResult));
        config.setWeightUnit(Integer.valueOf(this.weightUnit));
        config.setScreenLock(Integer.valueOf(this.screenLock));
        config.setProDisplay(Byte.valueOf(this.proDisplay));
        config.setSedentaryRemind(this.sedentaryRemind);
        config.setEmailNotifyEnabled(Boolean.valueOf(this.emailNotifyEnabled));
        config.setLiftWristBrightView(Boolean.valueOf(this.liftWristBrightView));
        config.setGoalRemind(Boolean.valueOf(this.goalRemind));
        config.setAvoidDisturdMode(Boolean.valueOf(this.avoidDisturdMode));
        config.setIosappNotifySettings(this.iosappNotifySettings);
        config.setAndroidappNotifySettings(this.androidappNotifySettings);
        config.setQuietMode(this.quietMode);
        config.setUnlockScreenType(Integer.valueOf(this.unlockScreenType));
        config.setTimePanelType(Integer.valueOf(this.timePanelType));
        config.setTimePanelLang(Integer.valueOf(this.timePanelLang));
        config.setAntiLost(Boolean.valueOf(this.antiLost));
        config.setIsNotificationOn(Boolean.valueOf(this.isNotificationOn));
        config.setCheckNotification(Boolean.valueOf(this.checkNotification));
        config.setFlipWrist(Boolean.valueOf(this.flipWrist));
        config.setIncallNameDisplayEnabled(Boolean.valueOf(this.incallNameDisplayEnabled));
        config.setSmsNameDisplayEnabled(Boolean.valueOf(this.smsNameDisplayEnabled));
        config.setShoePlaceMode(this.shoePlaceMode);
        config.setWeightBfsUnit(Integer.valueOf(this.weightBfsUnit));
        config.setId(Long.valueOf(this.id));
        config.setWholeHeartRate(Boolean.valueOf(this.wholeHeartRate));
        config.setDialSetting(Integer.valueOf(this.dialSetting));
        config.setLongPressSettings(Integer.valueOf(this.longPressSettings));
        config.setHrDetectType(this.hrDetectType);
        config.setHrDetectFreq(this.hrDetectFreq);
        config.setWeatherSetting(this.weatherSetting);
        config.setWatchApps(this.watchApps);
        config.setLiftWristTime(this.liftWristTime);
        config.setDisconnectRemind(this.disconnectRemind);
        config.setPhoneNotifyDelayEnable(Boolean.valueOf(this.phoneNotifyDelayEnable));
    }

    public String getDayReportNoti() {
        return this.dayReportNoti;
    }

    public int getDialSetting() {
        return this.dialSetting;
    }

    public String getDisconnectRemind() {
        return this.disconnectRemind;
    }

    public int getGoalStepsCount() {
        return this.goalStepsCount;
    }

    public Integer getHrDetectFreq() {
        return this.hrDetectFreq;
    }

    public Integer getHrDetectType() {
        return this.hrDetectType;
    }

    public int getInComingCallNotifyTime() {
        int i = this.inComingCallNotifyTime & 255;
        if (i >= 3) {
            return i;
        }
        setInComingCallNotifyTime(3);
        return 3;
    }

    public String getIosappNotifySettings() {
        return this.iosappNotifySettings;
    }

    public String getLiftWristTime() {
        return this.liftWristTime;
    }

    public String getLightColor() {
        return this.lightColor;
    }

    public int getLongPressSettings() {
        return this.longPressSettings;
    }

    public byte getProDisplay() {
        return this.proDisplay;
    }

    public String getQuietMode() {
        return this.quietMode;
    }

    public int getScreenLock() {
        return this.screenLock;
    }

    public String getSedentaryRemind() {
        return this.sedentaryRemind;
    }

    public String getShoePlaceMode() {
        return this.shoePlaceMode;
    }

    public int getTimePanelLang() {
        return this.timePanelLang;
    }

    public int getTimePanelType() {
        return this.timePanelType;
    }

    public int getUnit() {
        return this.unit;
    }

    public int getUnlockScreenType() {
        return this.unlockScreenType;
    }

    public String getWatchApps() {
        return this.watchApps;
    }

    public String getWearHand() {
        return this.wearHand;
    }

    public String getWeatherSetting() {
        return this.weatherSetting;
    }

    public int getWeightBfsUnit() {
        return this.weightBfsUnit;
    }

    public int getWeightUnit() {
        return this.weightUnit;
    }

    public boolean isAlarmNotifyEnabled() {
        return this.alarmNotifyEnabled;
    }

    public boolean isAntiLost() {
        return this.antiLost;
    }

    public boolean isAvoidDisturdMode() {
        return this.avoidDisturdMode;
    }

    public boolean isCheckNotification() {
        return this.checkNotification;
    }

    public boolean isEmailNotifyEnabled() {
        return this.emailNotifyEnabled;
    }

    public boolean isEnableConnectedBtAdv() {
        return this.enableConnectedBtAdv;
    }

    public boolean isFlipWrist() {
        return this.flipWrist;
    }

    public boolean isGoalRemind() {
        return this.goalRemind;
    }

    public boolean isHasHeartRate() {
        return this.hasHeartRate;
    }

    public boolean isInComingCallEnabled() {
        if (this.incallNotifyEnabled) {
            enableInComingCallTime();
        } else {
            disableInComingCallTime();
        }
        HMLog.d(TAG, "isInComingCallEnabled = " + this.incallNotifyEnabled, new Object[0]);
        return this.incallNotifyEnabled;
    }

    public boolean isIncallContactNotifyEnabled() {
        return this.incallContactNotifyEnabled;
    }

    public boolean isIncallNameDisplayEnabled() {
        return this.incallNameDisplayEnabled;
    }

    @Deprecated
    public boolean isIncallNotifyEnabled() {
        return this.incallNotifyEnabled;
    }

    public boolean isLiftWristBrightView() {
        return this.liftWristBrightView;
    }

    public boolean isNotificationOn() {
        return this.isNotificationOn;
    }

    public boolean isPhoneNotifyDelayEnable() {
        return this.phoneNotifyDelayEnable;
    }

    public boolean isSleepAssist() {
        return this.sleepAssist;
    }

    public boolean isSmsContactNotifyEnabled() {
        return this.smsContactNotifyEnabled;
    }

    public boolean isSmsNameDisplayEnabled() {
        return this.smsNameDisplayEnabled;
    }

    public boolean isSmsNotifyEnabled() {
        return this.smsNotifyEnabled;
    }

    public boolean isValid() {
        int i;
        boolean z = !TextUtils.isEmpty(this.lightColor) && !TextUtils.isEmpty(this.wearHand) && this.goalStepsCount > 0 && ((i = this.inComingCallNotifyTime) == -1 || i >= 0);
        HMLog.d(TAG, "isValid=" + z + ", " + this, new Object[0]);
        return z;
    }

    public boolean isVibrate() {
        return this.vibrate;
    }

    public boolean isWeightMergeResult() {
        return this.weightMergeResult;
    }

    public boolean isWholeHeartRate() {
        return this.wholeHeartRate;
    }

    public boolean ismOpenSleepNotify() {
        return this.mOpenSleepNotify;
    }

    public void setAlarmNotifyEnabled(boolean z) {
        this.alarmNotifyEnabled = z;
    }

    public void setAndroidappNotifySettings(String str) {
        this.androidappNotifySettings = str;
    }

    public void setAntiLost(boolean z) {
        this.antiLost = z;
    }

    public void setAvoidDisturdMode(boolean z) {
        this.avoidDisturdMode = z;
    }

    public void setCheckNotification(boolean z) {
        this.checkNotification = z;
    }

    public void setDayReportNoti(String str) {
        this.dayReportNoti = str;
    }

    public void setDialSetting(int i) {
        this.dialSetting = i;
    }

    public void setDisconnectRemind(String str) {
        this.disconnectRemind = str;
    }

    public void setEmailNotifyEnabled(boolean z) {
        this.emailNotifyEnabled = z;
    }

    public void setEnableConnectedBtAdv(boolean z) {
        this.enableConnectedBtAdv = z;
    }

    public void setFlipWrist(boolean z) {
        this.flipWrist = z;
    }

    public void setGoalRemind(boolean z) {
        this.goalRemind = z;
    }

    public void setGoalStepsCount(int i) {
        this.goalStepsCount = i;
    }

    public void setHasHeartRate(boolean z) {
        this.hasHeartRate = z;
    }

    public void setHrDetectFreq(Integer num) {
        this.hrDetectFreq = num;
    }

    public void setHrDetectType(Integer num) {
        this.hrDetectType = num;
    }

    public void setInComingCallNotifyTime(int i) {
        if (this.incallNotifyEnabled) {
            this.inComingCallNotifyTime = i & 255;
        } else {
            this.inComingCallNotifyTime = i | 256;
        }
    }

    public void setIncallContactNotifyEnabled(boolean z) {
        this.incallContactNotifyEnabled = z;
    }

    public void setIncallNameDisplayEnabled(boolean z) {
        this.incallNameDisplayEnabled = z;
    }

    @Deprecated
    public void setIncallNotifyEnabled(boolean z) {
        this.incallNotifyEnabled = z;
    }

    public void setIosappNotifySettings(String str) {
        this.iosappNotifySettings = str;
    }

    public void setLiftWristBrightView(boolean z) {
        this.liftWristBrightView = z;
    }

    public void setLiftWristTime(String str) {
        this.liftWristTime = str;
    }

    public void setLightColor(String str) {
        this.lightColor = str;
    }

    public void setLongPressSettings(int i) {
        this.longPressSettings = i;
    }

    public void setNotificationOn(boolean z) {
        this.isNotificationOn = z;
    }

    public void setPhoneNotifyDelayEnable(boolean z) {
        this.phoneNotifyDelayEnable = z;
    }

    public void setProDisplay(byte b) {
        this.proDisplay = b;
    }

    public void setQuietMode(String str) {
        this.quietMode = str;
    }

    public void setScreenLock(int i) {
        this.screenLock = i;
    }

    public void setSedentaryRemind(String str) {
        this.sedentaryRemind = str;
    }

    public void setShoePlaceMode(String str) {
        this.shoePlaceMode = str;
    }

    public void setSleepAssist(boolean z) {
        this.sleepAssist = z;
    }

    public void setSmsContactNotifyEnabled(boolean z) {
        this.smsContactNotifyEnabled = z;
    }

    public void setSmsNameDisplayEnabled(boolean z) {
        this.smsNameDisplayEnabled = z;
    }

    public void setSmsNotifyEnabled(boolean z) {
        this.smsNotifyEnabled = z;
    }

    public void setTimePanelLang(int i) {
        this.timePanelLang = i;
    }

    public void setTimePanelType(int i) {
        this.timePanelType = i;
    }

    public void setUnit(int i) {
        this.unit = i;
    }

    public void setUnlockScreenType(int i) {
        this.unlockScreenType = i;
    }

    public void setVibrate(boolean z) {
        this.vibrate = z;
    }

    public void setWatchApps(String str) {
        this.watchApps = str;
    }

    public void setWearHand(String str) {
        this.wearHand = str;
    }

    public void setWeatherSetting(String str) {
        this.weatherSetting = str;
    }

    public void setWeightBfsUnit(int i) {
        this.weightBfsUnit = i;
    }

    public void setWeightMergeResult(boolean z) {
        this.weightMergeResult = z;
    }

    public void setWeightUnit(int i) {
        this.weightUnit = i;
    }

    public void setWholeHeartRate(boolean z) {
        this.wholeHeartRate = z;
    }

    public void setmOpenSleepNotify(boolean z) {
        this.mOpenSleepNotify = z;
    }

    public String toString() {
        return HMHttpUtils.getGson().toJson(this, HMMiliConfig.class);
    }
}
