package com.xiaomi.fit.data.common.data.sport;

import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class SportSummary {

    @SerializedName("summary")
    public SummaryData info;
    public SummaryKey key;

    public static class MaxData {
        public static int TYPE_ACTION_COUNT = 6;
        public static int TYPE_CALORIE = 3;
        public static int TYPE_DISTANCE = 2;
        public static int TYPE_DURATION = 1;
        public static int TYPE_PACE = 4;
        public static int TYPE_SPEED = 5;
        public int dataType;
        public MaxKey key;
        public boolean offline;
        public SportBasicReport report;
        public MaxValue value;

        public String toString() {
            return "MaxData{key=" + this.key + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class MaxKey {
        public String key;
        public String sid;
        public long time;

        public String toString() {
            return "MaxKey{, time=" + this.time + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class MaxValue {

        @SerializedName("FieldType")
        public int fieldType;

        @SerializedName("FieldUnit")
        public int fieldUnit;

        @SerializedName("FloatValue")
        public float floatValue;

        @SerializedName("IntValue")
        public long intValue;
    }

    public static class SummaryData {
        public MaxData max_accessory_count;
        public MaxData max_avg_pace;
        public MaxData max_avg_speed;
        public MaxData max_calorie;
        public MaxData max_distance;
        public MaxData max_duration;
        public int total_accessory_count;
        public int total_calorie;
        public int total_count;
        public int total_distance;
        public long total_duration;

        public String toString() {
            return "SummaryData{total_duration=" + this.total_duration + ", total_count=" + this.total_count + ", total_accessory_count=" + this.total_accessory_count + ", total_distance=" + this.total_distance + ", total_calorie=" + this.total_calorie + ", max_duration=" + this.max_duration + ", max_distance=" + this.max_distance + ", max_calorie=" + this.max_calorie + ", max_avg_pace=" + this.max_avg_pace + ", max_avg_speed=" + this.max_avg_speed + ", max_accessory_count=" + this.max_accessory_count + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class SummaryKey {
        public String category;
        public String granularity;
        public String stats_type;
        public long time;
        public int zone_offset;

        public String toString() {
            return "SummaryKey{category='" + this.category + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public String toString() {
        return "SportSummary{key=" + this.key + ", info=" + this.info + AbstractJsonLexerKt.END_OBJ;
    }
}
