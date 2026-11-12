package com.xiaomi.fitness.chart.entrys.model;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/chart/entrys/model/SportItemModel;", "", "chartValue", "", "value", "time", "", "<init>", "(FFJ)V", "itemChartValue", "getItemChartValue", "()F", "itemValue", "getItemValue", "itemTime", "getItemTime", "()J", "pointX", "getPointX", "setPointX", "(F)V", "pointY", "getPointY", "setPointY", "chart_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportItemModel {
    private final float itemChartValue;
    private final long itemTime;
    private final float itemValue;
    private float pointX;
    private float pointY;

    public SportItemModel(float f, float f2, long j) {
        this.itemChartValue = f;
        this.itemValue = f2;
        this.itemTime = j;
    }

    public final float getItemChartValue() {
        return this.itemChartValue;
    }

    public final long getItemTime() {
        return this.itemTime;
    }

    public final float getItemValue() {
        return this.itemValue;
    }

    public final float getPointX() {
        return this.pointX;
    }

    public final float getPointY() {
        return this.pointY;
    }

    public final void setPointX(float f) {
        this.pointX = f;
    }

    public final void setPointY(float f) {
        this.pointY = f;
    }
}
