package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class HRDetect {

    @SerializedName("abnormalHeartbeatEnable")
    @Expose
    private boolean abnormalHeartbeatEnable;

    @SerializedName("activeEnable")
    @Expose
    private boolean activeEnable;

    @SerializedName("lowSpo2WarningEnable")
    @Expose
    private boolean lowSpo2WarningEnable;

    @SerializedName("lowWarningEnable")
    @Expose
    private boolean lowWarningEnable;

    @SerializedName("needMigrationHRWay")
    @Expose
    private boolean needMigrationHRWay;

    @SerializedName("pressureEnable")
    @Expose
    private boolean pressureEnable;

    @SerializedName("relaxReminder")
    @Expose
    private boolean relaxReminder;

    @SerializedName("sleepAssistEnable")
    @Expose
    private boolean sleepAssistEnable;

    @SerializedName("sleepBreathQualityEnable")
    @Expose
    private boolean sleepBreathQualityEnable;

    @SerializedName("spo2Enable")
    @Expose
    private boolean spo2Enable;

    @SerializedName("sportHRCheckEnable")
    @Expose
    private boolean sportHRCheckEnable;

    @SerializedName("warningEnable")
    @Expose
    private boolean warningEnable;

    @SerializedName("type")
    @Expose
    private int type = 0;

    @SerializedName("freq")
    @Expose
    private int freq = 30;

    @SerializedName("warningValue")
    @Expose
    private int warningValue = 100;

    @SerializedName("lowWarningValue")
    @Expose
    private int lowWarningValue = 0;

    @SerializedName("lowSpo2WarningValue")
    @Expose
    private int lowSpo2WarningValue = 0;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HRDetect hRDetect = (HRDetect) obj;
        return this.type == hRDetect.type && this.freq == hRDetect.freq && this.warningEnable == hRDetect.warningEnable && this.lowWarningEnable == hRDetect.lowWarningEnable && this.activeEnable == hRDetect.activeEnable && this.pressureEnable == hRDetect.pressureEnable && this.relaxReminder == hRDetect.relaxReminder && this.warningValue == hRDetect.warningValue && this.lowWarningValue == hRDetect.lowWarningValue && this.sleepAssistEnable == hRDetect.sleepAssistEnable && this.needMigrationHRWay == hRDetect.needMigrationHRWay && this.sportHRCheckEnable == hRDetect.sportHRCheckEnable && this.abnormalHeartbeatEnable == hRDetect.abnormalHeartbeatEnable && this.sleepBreathQualityEnable == hRDetect.sleepBreathQualityEnable && this.spo2Enable == hRDetect.spo2Enable && this.lowSpo2WarningEnable == hRDetect.lowSpo2WarningEnable && this.lowSpo2WarningValue == hRDetect.lowSpo2WarningValue;
    }

    public int getFreq() {
        return this.freq;
    }

    public int getLowSpo2WarningValue() {
        return this.lowSpo2WarningValue;
    }

    public int getLowWarningValue() {
        return this.lowWarningValue;
    }

    public int getType() {
        return this.type;
    }

    public int getWarningValue() {
        return this.warningValue;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.sleepBreathQualityEnable ? 1 : 0) + 31) * 31) + (this.warningEnable ? 1 : 0)) * 31) + (this.sleepAssistEnable ? 1 : 0)) * 31) + (this.relaxReminder ? 1 : 0)) * 31) + (this.spo2Enable ? 1 : 0)) * 31) + (this.pressureEnable ? 1 : 0)) * 31) + (this.sportHRCheckEnable ? 1 : 0)) * 31) + this.freq) * 31) + this.warningValue) * 31) + (this.activeEnable ? 1 : 0)) * 31) + this.type) * 31) + (this.needMigrationHRWay ? 1 : 0)) * 31) + (this.abnormalHeartbeatEnable ? 1 : 0)) * 31) + this.lowWarningValue) * 31) + (this.lowSpo2WarningEnable ? 1 : 0)) * 31) + this.lowSpo2WarningValue) * 31) + (this.lowWarningEnable ? 1 : 0);
    }

    public boolean isAbnormalHeartbeatEnable() {
        return this.abnormalHeartbeatEnable;
    }

    public boolean isActiveEnable() {
        return this.activeEnable;
    }

    public boolean isLowSpo2WarningEnable() {
        return this.lowSpo2WarningEnable;
    }

    public boolean isLowWarningEnable() {
        return this.lowWarningEnable;
    }

    public boolean isNeedMigrationHRWay() {
        return this.needMigrationHRWay;
    }

    public boolean isPressureEnable() {
        return this.pressureEnable;
    }

    public boolean isRelaxReminder() {
        return this.relaxReminder;
    }

    public boolean isSleepAssistEnable() {
        return this.sleepAssistEnable;
    }

    public boolean isSleepBreathQualityEnable() {
        return this.sleepBreathQualityEnable;
    }

    public boolean isSpo2Enable() {
        return this.spo2Enable;
    }

    public boolean isSportHRCheckEnable() {
        return this.sportHRCheckEnable;
    }

    public boolean isWarningEnable() {
        return this.warningEnable;
    }

    public void setAbnormalHeartbeatEnable(boolean z) {
        this.abnormalHeartbeatEnable = z;
    }

    public void setActiveEnable(boolean z) {
        this.activeEnable = z;
    }

    public void setFreq(int i) {
        this.freq = i;
    }

    public void setLowSpo2WarningEnable(boolean z) {
        this.lowSpo2WarningEnable = z;
    }

    public void setLowSpo2WarningValue(int i) {
        this.lowSpo2WarningValue = i;
    }

    public void setLowWarningEnable(boolean z) {
        this.lowWarningEnable = z;
    }

    public void setLowWarningValue(int i) {
        this.lowWarningValue = i;
    }

    public void setNeedMigrationHRWay(boolean z) {
        this.needMigrationHRWay = z;
    }

    public void setPressureEnable(boolean z) {
        this.pressureEnable = z;
    }

    public void setRelaxReminder(boolean z) {
        this.relaxReminder = z;
    }

    public void setSleepAssistEnable(boolean z) {
        this.sleepAssistEnable = z;
    }

    public void setSleepBreathQualityEnable(boolean z) {
        this.sleepBreathQualityEnable = z;
    }

    public void setSpo2Enable(boolean z) {
        this.spo2Enable = z;
    }

    public void setSportHRCheckEnable(boolean z) {
        this.sportHRCheckEnable = z;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setWarningEnable(boolean z) {
        this.warningEnable = z;
    }

    public void setWarningValue(int i) {
        this.warningValue = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HRDetect.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("type");
        sb.append('=');
        sb.append(this.type);
        sb.append(',');
        sb.append("freq");
        sb.append('=');
        sb.append(this.freq);
        sb.append(',');
        sb.append("warningEnable");
        sb.append('=');
        sb.append(this.warningEnable);
        sb.append(',');
        sb.append("lowWarningEnable");
        sb.append('=');
        sb.append(this.lowWarningEnable);
        sb.append(',');
        sb.append("activeEnable");
        sb.append('=');
        sb.append(this.activeEnable);
        sb.append(',');
        sb.append("pressureEnable");
        sb.append('=');
        sb.append(this.pressureEnable);
        sb.append(',');
        sb.append("relaxReminder");
        sb.append('=');
        sb.append(this.relaxReminder);
        sb.append(',');
        sb.append("warningValue");
        sb.append('=');
        sb.append(this.warningValue);
        sb.append(',');
        sb.append("lowWarningValue");
        sb.append('=');
        sb.append(this.lowWarningValue);
        sb.append(',');
        sb.append("sleepAssistEnable");
        sb.append('=');
        sb.append(this.sleepAssistEnable);
        sb.append(',');
        sb.append("needMigrationHRWay");
        sb.append('=');
        sb.append(this.needMigrationHRWay);
        sb.append(',');
        sb.append("sportHRCheckEnable");
        sb.append('=');
        sb.append(this.sportHRCheckEnable);
        sb.append(',');
        sb.append("abnormalHeartbeatEnable");
        sb.append('=');
        sb.append(this.abnormalHeartbeatEnable);
        sb.append(',');
        sb.append("sleepBreathQualityEnable");
        sb.append('=');
        sb.append(this.sleepBreathQualityEnable);
        sb.append(',');
        sb.append("spo2Enable");
        sb.append('=');
        sb.append(this.spo2Enable);
        sb.append(',');
        sb.append("lowSpo2WarningEnable");
        sb.append('=');
        sb.append(this.lowSpo2WarningEnable);
        sb.append(',');
        sb.append("lowSpo2WarningValue");
        sb.append('=');
        sb.append(this.lowSpo2WarningValue);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
