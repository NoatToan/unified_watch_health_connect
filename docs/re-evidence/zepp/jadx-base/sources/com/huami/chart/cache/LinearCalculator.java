package com.huami.chart.cache;

import com.huami.chart.util.ChartUtil;

/* JADX INFO: loaded from: classes6.dex */
public class LinearCalculator extends Calculator {
    private static final String a = "LinearCalculator";

    public LinearCalculator(Builder builder) {
        super(builder);
    }

    @Override // com.huami.chart.cache.ICalculator
    public float getMappedValueByRaw(float f) {
        return (getScale() * (f - this.start)) + this.mappedStart;
    }

    @Override // com.huami.chart.cache.ICalculator
    public float getRawValueByMapped(float f) {
        return ((f - this.mappedStart) / getScale()) + this.start;
    }

    @Override // com.huami.chart.cache.ICalculator
    public float getScale() {
        float f = this.mappedEnd;
        float f2 = this.mappedStart;
        float f3 = f - f2;
        if (ChartUtil.isEquals(f, f2)) {
            return f3;
        }
        return ChartUtil.isEquals(this.end, this.start) ? this.mappedEnd - this.mappedStart : (this.mappedEnd - this.mappedStart) / (this.end - this.start);
    }
}
