package com.xiaomi.fitness.health.curse.data;

import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public class CursePeriodRes$Result$Period implements Serializable {
    public int cycle;
    public int end;
    public String id;
    public long lastModifyTime;
    public long menstrualEndTime;
    public long menstrualPeriod;
    public long month;
    public String userId;

    public int getInDays() {
        return TimeDateUtil.getIntervalDay(this.menstrualPeriod, this.menstrualEndTime) + 1;
    }

    public boolean isEnd() {
        return this.end == 1;
    }

    public String toString() {
        return "Period{id='" + this.id + "', menstrualPeriod=" + new LocalDate(this.menstrualPeriod) + ", menstrualEndTime=" + new LocalDate(this.menstrualEndTime) + ", end=" + this.end + ", cycle=" + this.cycle + ", month=" + this.month + ", lastModifyTime=" + this.lastModifyTime + AbstractJsonLexerKt.END_OBJ;
    }
}
