package com.xiaomi.fitness.common;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class ManualItem implements Serializable {

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    public long end_time;

    @SerializedName(alternate = {"Timestamp", SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME}, value = "time")
    public long time;

    @SerializedName(alternate = {"stress", "MeasureValue", "duration"}, value = "hrm")
    public int value;

    public String toString() {
        return "ManualItem{time=" + this.time + ", end_time=" + this.end_time + ", value=" + this.value + AbstractJsonLexerKt.END_OBJ;
    }
}
