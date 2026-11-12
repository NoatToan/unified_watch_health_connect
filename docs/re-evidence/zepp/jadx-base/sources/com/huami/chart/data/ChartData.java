package com.huami.chart.data;

import com.huami.chart.util.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class ChartData extends BaseData {
    private float[] c;
    private ColorSegmentBar[] d;

    public ChartData(int i, float f) {
        super(new BaseIndex(i));
        this.c = new float[]{f};
    }

    public boolean equals(Object obj) {
        ChartData chartData = (ChartData) obj;
        return getStart() == chartData.getStart() && getEnd() == chartData.getEnd() && getSumValue() == chartData.getSumValue();
    }

    public ColorSegmentBar[] getColorSegmentBars() {
        return this.d;
    }

    public float getMaxVlue() {
        float fMax = 0.0f;
        if (this.c == null) {
            return 0.0f;
        }
        int i = 0;
        while (true) {
            float[] fArr = this.c;
            if (i >= fArr.length) {
                return fMax;
            }
            fMax = Math.max(fMax, fArr[i]);
            i++;
        }
    }

    public float getMinVlue() {
        float fMin = 0.0f;
        if (this.c == null) {
            return 0.0f;
        }
        int i = 0;
        while (true) {
            float[] fArr = this.c;
            if (i >= fArr.length) {
                return fMin;
            }
            fMin = Math.min(fMin, fArr[i]);
            i++;
        }
    }

    public float getSumValue() {
        float f = 0.0f;
        if (this.c == null) {
            return 0.0f;
        }
        int i = 0;
        while (true) {
            float[] fArr = this.c;
            if (i >= fArr.length) {
                return f;
            }
            f += fArr[i];
            i++;
        }
    }

    public float[] getValues() {
        return this.c;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "[(" + getStart() + ", " + getEnd() + ") : " + getSumValue() + "]";
    }

    public ChartData(int i, float[] fArr) {
        super(new BaseIndex(i));
        this.c = fArr;
    }

    public ChartData(int i, ArrayList<Float> arrayList) {
        super(new BaseIndex(i));
        this.c = Utils.transListToArray(arrayList);
    }

    public ChartData(BaseIndex baseIndex, float f) {
        super(baseIndex);
        this.c = new float[]{f};
    }

    public ChartData(BaseIndex baseIndex, float[] fArr) {
        super(baseIndex);
        this.c = fArr;
    }

    public ChartData(BaseIndex baseIndex, ArrayList<Float> arrayList) {
        super(baseIndex);
        this.c = Utils.transListToArray(arrayList);
    }

    public ChartData(BaseIndex baseIndex, ColorSegmentBar[] colorSegmentBarArr) {
        super(baseIndex);
        this.d = colorSegmentBarArr;
    }

    public ChartData(int i, ColorSegmentBar[] colorSegmentBarArr) {
        super(new BaseIndex(i));
        this.d = colorSegmentBarArr;
    }
}
