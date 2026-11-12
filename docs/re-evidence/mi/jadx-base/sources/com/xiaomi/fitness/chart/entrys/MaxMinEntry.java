package com.xiaomi.fitness.chart.entrys;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class MaxMinEntry extends RecyclerBarEntry {
    public float averageY;
    public float maxY;
    public float minY;

    public MaxMinEntry(float f, float f2, long j, int i) {
        super(f, f2, j, i);
    }

    public static float getTheMinNumber(List<MaxMinEntry> list) {
        if (list == null || list.size() == 0) {
            return 0.0f;
        }
        float fMin = 80.0f;
        for (int i = 0; i < list.size(); i++) {
            MaxMinEntry maxMinEntry = list.get(i);
            float f = maxMinEntry.maxY;
            if (f > 0.0f) {
                fMin = Math.min(fMin, f);
            }
            float f2 = maxMinEntry.minY;
            if (f2 > 0.0f) {
                fMin = Math.min(fMin, f2);
            }
            float y = maxMinEntry.getY();
            if (y > 0.0f) {
                fMin = Math.min(fMin, y);
            }
        }
        return fMin;
    }

    public float getAverageY() {
        return this.averageY;
    }

    public float getMaxY() {
        return this.maxY;
    }

    public float getMinY() {
        return this.minY;
    }

    public void setAverageY(float f) {
        this.averageY = f;
    }

    public void setMaxY(float f) {
        this.maxY = f;
    }

    public void setMinY(float f) {
        this.minY = f;
    }

    public MaxMinEntry(float f, float[] fArr) {
        super(f, fArr);
    }
}
