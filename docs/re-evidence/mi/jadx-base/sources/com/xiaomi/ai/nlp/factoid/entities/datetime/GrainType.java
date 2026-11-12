package com.xiaomi.ai.nlp.factoid.entities.datetime;

import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;

/* JADX INFO: loaded from: classes7.dex */
public enum GrainType {
    YEAR("year"),
    MONTH("month"),
    WEEK("week"),
    DAY("day"),
    HOUR("hour"),
    MINUTE("minute"),
    SECOND("second"),
    ARBITRARY("arbitrary"),
    PARTOFDAY("part_of_day"),
    RECENT("recent"),
    DATETIME("date_time"),
    DATE(DialWidgetType.DATE);

    private String grainType;

    GrainType(String str) {
        this.grainType = str;
    }

    public String getGrainType() {
        return this.grainType;
    }
}
