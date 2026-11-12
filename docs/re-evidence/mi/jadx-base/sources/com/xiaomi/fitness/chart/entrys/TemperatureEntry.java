package com.xiaomi.fitness.chart.entrys;

import defpackage.hrl;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class TemperatureEntry extends SegmentBarEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f11766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f11767b;
    public float c;
    public float d;

    public TemperatureEntry(List<hrl> list, int i) {
        super(list, i);
    }

    public float a() {
        float f = this.f11767b;
        if (f == 0.0f && this.d == 0.0f) {
            return 0.0f;
        }
        if (f == 0.0f) {
            return this.d;
        }
        float f2 = this.d;
        return f2 == 0.0f ? f : Math.min(f, f2);
    }
}
