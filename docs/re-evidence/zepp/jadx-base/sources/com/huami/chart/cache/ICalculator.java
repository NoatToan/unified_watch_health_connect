package com.huami.chart.cache;

/* JADX INFO: loaded from: classes6.dex */
public interface ICalculator {
    float getMappedValueByRaw(float f);

    float getRawValueByMapped(float f);

    float getRealMappedValueByRaw(float f);

    float getScale();
}
