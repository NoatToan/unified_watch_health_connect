package com.github.mikephil.chartingv2.buffer;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class AbstractBuffer<T> {
    public final float[] buffer;
    protected float phaseX = 1.0f;
    protected float phaseY = 1.0f;
    protected int mFrom = 0;
    protected int mTo = 0;
    protected int index = 0;

    public AbstractBuffer(int i14) {
        this.buffer = new float[i14];
    }

    public abstract void feed(T t7);

    public void limitFrom(int i14) {
        if (i14 < 0) {
            i14 = 0;
        }
        this.mFrom = i14;
    }

    public void limitTo(int i14) {
        if (i14 < 0) {
            i14 = 0;
        }
        this.mTo = i14;
    }

    public void reset() {
        this.index = 0;
    }

    public void setPhases(float f14, float f15) {
        this.phaseX = f14;
        this.phaseY = f15;
    }

    public int size() {
        return this.buffer.length;
    }
}
