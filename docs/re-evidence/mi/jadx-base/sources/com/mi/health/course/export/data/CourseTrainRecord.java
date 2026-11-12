package com.mi.health.course.export.data;

import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class CourseTrainRecord {
    int calories;
    int duration;
    public String name;
    SportRecord sportRecord;

    @SerializedName("order_number")
    public int trainTimes;
    int type;

    public static class SportRecord {
        public String did;
        public int sport_type;
        public long time;
    }

    public String toString() {
        return "GetTrainRecord{name='" + this.name + "', trainTimes=" + this.trainTimes + AbstractJsonLexerKt.END_OBJ;
    }
}
