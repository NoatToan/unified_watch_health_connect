package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import java.time.Duration;
import java.time.temporal.TemporalAmount;

/* JADX INFO: loaded from: classes.dex */
public class DurationConverter extends AbstractConverter<Duration> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter
    public Duration convertInternal(Object obj) {
        if (obj instanceof TemporalAmount) {
            return Duration.from((TemporalAmount) obj);
        }
        return obj instanceof Long ? Duration.ofMillis(((Long) obj).longValue()) : Duration.parse(convertToStr(obj));
    }
}
