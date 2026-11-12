package com.xiaomi.fit.fitness.sleep.algo.stage.data;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class SleepStageSummary {
    public int avgBreathRate;
    public int breathQuality;
    public int breathQualityState;
    public SleepRateArray breathRateArray;
    public int breathRateState;
    public short deepDuration;
    public boolean hasRem;
    public boolean hasStage;
    public short lightDuration;
    public short remDuration;
    public int sleepDuration;
    public byte sleepIdx;
    public long sleepIntoTs;
    public long sleepOutofTs;
    public SleepStage[] stages;
    public byte wakeCount;
    public short wakeDuration;

    public int getSleepRateArraySize() {
        byte[] bArr;
        SleepRateArray sleepRateArray = this.breathRateArray;
        if (sleepRateArray == null || (bArr = sleepRateArray.valueArray) == null) {
            return 0;
        }
        return bArr.length;
    }

    public String toString() {
        return "SleepStageSummary{sleepIdx=" + ((int) this.sleepIdx) + ", sleepIntoTs=" + this.sleepIntoTs + ", sleepOutofTs=" + this.sleepOutofTs + ", wakeDuration=" + ((int) this.wakeDuration) + ", lightDuration=" + ((int) this.lightDuration) + ", remDuration=" + ((int) this.remDuration) + ", deepDuration=" + ((int) this.deepDuration) + ", sleepDuration=" + this.sleepDuration + ", wakeCount=" + ((int) this.wakeCount) + ", breathQualityState=" + this.breathQualityState + ", breathQuality=" + this.breathQuality + ", breathRateState=" + this.breathRateState + ", avgBreathRate=" + this.avgBreathRate + ", breathRateArraySize=" + getSleepRateArraySize() + AbstractJsonLexerKt.END_OBJ;
    }
}
