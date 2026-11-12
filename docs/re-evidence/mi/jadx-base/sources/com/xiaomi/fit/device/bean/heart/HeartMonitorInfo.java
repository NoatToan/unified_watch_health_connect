package com.xiaomi.fit.device.bean.heart;

import com.xiaomi.hm.health.bt.sdk.data.HrFreq;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class HeartMonitorInfo implements Serializable {
    public boolean active;
    public boolean assistSleepOn;
    public int frequency;
    public int mode;
    public boolean pressure;
    public boolean supportAssistSleep;
    public boolean supportWarningSport;
    public boolean warning;
    public boolean warningSport;
    public int warningSportValue;
    public int warningValue;

    public HrFreq getHrFreq() {
        int i = this.frequency;
        if (i == 1) {
            return HrFreq.FREQ_1;
        }
        if (i == 5) {
            return HrFreq.FREQ_5;
        }
        return i == 10 ? HrFreq.FREQ_10 : HrFreq.FREQ_30;
    }

    public String toString() {
        return "HeartMonitorInfo{mode=" + this.mode + ", frequency=" + this.frequency + ", warning=" + this.warning + ", warningValue=" + this.warningValue + ", active=" + this.active + ", pressure=" + this.pressure + ", supportAssistSleep=" + this.supportAssistSleep + ", assistSleepOn=" + this.assistSleepOn + ", supportWarningSport=" + this.supportWarningSport + ", warningSport=" + this.warningSport + ", warningSportValue=" + this.warningSportValue + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public HeartMonitorInfo m219clone() {
        HeartMonitorInfo heartMonitorInfo = new HeartMonitorInfo();
        heartMonitorInfo.mode = this.mode;
        heartMonitorInfo.frequency = this.frequency;
        heartMonitorInfo.warning = this.warning;
        heartMonitorInfo.pressure = this.pressure;
        heartMonitorInfo.supportAssistSleep = this.supportAssistSleep;
        heartMonitorInfo.assistSleepOn = this.assistSleepOn;
        heartMonitorInfo.supportWarningSport = this.supportWarningSport;
        heartMonitorInfo.warningSport = this.warningSport;
        heartMonitorInfo.warningValue = this.warningSportValue;
        return heartMonitorInfo;
    }
}
