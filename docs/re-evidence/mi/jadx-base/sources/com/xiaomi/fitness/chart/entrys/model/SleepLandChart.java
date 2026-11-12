package com.xiaomi.fitness.chart.entrys.model;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/chart/entrys/model/SleepLandChart;", "", "startPointX", "", "startPointY", "endPointX", "endPointY", "width", "lastWidth", "arcAngleEnable", "", "<init>", "(FFFFFFZ)V", "getStartPointX", "()F", "getStartPointY", "getEndPointX", "getEndPointY", "getWidth", "getLastWidth", "getArcAngleEnable", "()Z", "chart_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepLandChart {
    private final boolean arcAngleEnable;
    private final float endPointX;
    private final float endPointY;
    private final float lastWidth;
    private final float startPointX;
    private final float startPointY;
    private final float width;

    public SleepLandChart(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        this.startPointX = f;
        this.startPointY = f2;
        this.endPointX = f3;
        this.endPointY = f4;
        this.width = f5;
        this.lastWidth = f6;
        this.arcAngleEnable = z;
    }

    public final boolean getArcAngleEnable() {
        return this.arcAngleEnable;
    }

    public final float getEndPointX() {
        return this.endPointX;
    }

    public final float getEndPointY() {
        return this.endPointY;
    }

    public final float getLastWidth() {
        return this.lastWidth;
    }

    public final float getStartPointX() {
        return this.startPointX;
    }

    public final float getStartPointY() {
        return this.startPointY;
    }

    public final float getWidth() {
        return this.width;
    }
}
