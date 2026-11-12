package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import java.time.Period;
import java.time.temporal.TemporalAmount;

/* JADX INFO: loaded from: classes.dex */
public class PeriodConverter extends AbstractConverter<Period> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter
    public Period convertInternal(Object obj) {
        if (obj instanceof TemporalAmount) {
            return Period.from((TemporalAmount) obj);
        }
        return obj instanceof Integer ? Period.ofDays(((Integer) obj).intValue()) : Period.parse(convertToStr(obj));
    }
}
