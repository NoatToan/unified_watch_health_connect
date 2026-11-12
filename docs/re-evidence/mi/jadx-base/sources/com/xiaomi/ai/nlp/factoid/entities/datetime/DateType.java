package com.xiaomi.ai.nlp.factoid.entities.datetime;

import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;

/* JADX INFO: loaded from: classes7.dex */
public enum DateType {
    DATE(DialWidgetType.DATE, "yyyy-MM-dd"),
    LUNARDATE("lunar_date", "yyyy-MM-dd"),
    DATETIME("date_time", ParserHelper.DATA_FORMAT4),
    DURATION("duration", ParserHelper.DATA_FORMAT4);

    private String format;
    private String type;

    DateType(String str, String str2) {
        this.type = str;
        this.format = str2;
    }

    public String getFormat() {
        return this.format;
    }

    public String getType() {
        return this.type;
    }
}
