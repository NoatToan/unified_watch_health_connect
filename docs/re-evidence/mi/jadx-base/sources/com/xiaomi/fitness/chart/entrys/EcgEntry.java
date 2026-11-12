package com.xiaomi.fitness.chart.entrys;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class EcgEntry extends MaxMinEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<Float> f11750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<Float> f11751b;

    public EcgEntry(int i, float f, long j, int i2) {
        super(i, f, j, i2);
        this.f11750a = new ArrayList();
        this.f11751b = new ArrayList();
    }
}
