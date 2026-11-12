package com.huami.chart.cache;

import defpackage.cc4;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Calculator implements ICalculator {
    public float end;
    public float mappedEnd;
    public float mappedStart;
    public float start;

    public Calculator(Builder builder) {
        this.start = builder.start;
        this.end = builder.end;
        this.mappedStart = builder.mappedStart;
        this.mappedEnd = builder.mappedEnd;
    }

    public float getEnd() {
        return this.end;
    }

    public float getMappedEnd() {
        return this.mappedEnd;
    }

    public float getMappedStart() {
        return this.mappedStart;
    }

    @Override // com.huami.chart.cache.ICalculator
    public /* synthetic */ float getRealMappedValueByRaw(float f) {
        return cc4.a(this, f);
    }

    public float getStart() {
        return this.start;
    }
}
