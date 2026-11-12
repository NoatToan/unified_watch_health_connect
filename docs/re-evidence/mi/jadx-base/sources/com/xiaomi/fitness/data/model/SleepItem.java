package com.xiaomi.fitness.data.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.statistics.StatConstants;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class SleepItem implements Comparable<SleepItem>, Serializable {

    @SerializedName(StatConstants.PARAM_END)
    public long endTime;

    @SerializedName("seg_end")
    public Boolean segEnd;

    @SerializedName("state")
    public int sleepState;

    @SerializedName(StatConstants.PARAM_START)
    public long startTime;

    public String toString() {
        return "SleepItem{startTime=" + this.startTime + ", endTime=" + this.endTime + ", sleepState=" + this.sleepState + ", segEnd=" + this.segEnd + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // java.lang.Comparable
    public int compareTo(SleepItem sleepItem) {
        return (int) (this.startTime - sleepItem.startTime);
    }
}
