package com.mi.fitness.menstrual.data;

import com.xiaomi.fitness.common.utils.TimeDateUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class MenstrualPredictDateRequest {
    public int currentDate;
    public int nextCycleEnd;
    public int nextCycleStart;
    public int nextOvulationDay;

    public String toString() {
        return "MenstrualPredictDateRequest{currentDate=" + this.currentDate + "currentLocalDate=" + TimeDateUtil.getDateSimpleLocalFormat(this.currentDate) + ", nextCycleStart=" + this.nextCycleStart + ", nextCycleStartLocalDate=" + TimeDateUtil.getDateSimpleLocalFormat(this.nextCycleStart) + ", nextCycleEnd=" + this.nextCycleEnd + ", nextCycleEndLocalDate=" + TimeDateUtil.getDateSimpleLocalFormat(this.nextCycleEnd) + ", nextOvulationDay=" + this.nextOvulationDay + ", nextOvulationDayLocalDate=" + TimeDateUtil.getDateSimpleLocalFormat(this.nextOvulationDay) + AbstractJsonLexerKt.END_OBJ;
    }
}
