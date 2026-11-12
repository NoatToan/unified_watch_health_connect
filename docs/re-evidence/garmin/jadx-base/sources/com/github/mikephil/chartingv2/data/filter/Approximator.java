package com.github.mikephil.chartingv2.data.filter;

import com.github.mikephil.chartingv2.data.Entry;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class Approximator {
    private boolean[] keep;
    private float mDeltaRatio;
    private float mScaleRatio;
    private double mTolerance;
    private ApproximatorType mType;

    /* JADX INFO: renamed from: com.github.mikephil.chartingv2.data.filter.Approximator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$chartingv2$data$filter$Approximator$ApproximatorType;

        static {
            int[] iArr = new int[ApproximatorType.values().length];
            $SwitchMap$com$github$mikephil$chartingv2$data$filter$Approximator$ApproximatorType = iArr;
            try {
                iArr[ApproximatorType.DOUGLAS_PEUCKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$data$filter$Approximator$ApproximatorType[ApproximatorType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum ApproximatorType {
        NONE,
        DOUGLAS_PEUCKER
    }

    public Approximator() {
        this.mType = ApproximatorType.DOUGLAS_PEUCKER;
        this.mTolerance = 0.0d;
        this.mScaleRatio = 1.0f;
        this.mDeltaRatio = 1.0f;
        this.mType = ApproximatorType.NONE;
    }

    private void algorithmDouglasPeucker(List<Entry> list, double d14, int i14, int i15) {
        int i16 = i14 + 1;
        if (i15 <= i16) {
            return;
        }
        Entry entry = list.get(i14);
        Entry entry2 = list.get(i15);
        double d15 = 0.0d;
        int i17 = 0;
        while (i16 < i15) {
            double dCalcAngleBetweenLines = calcAngleBetweenLines(entry, entry2, entry, list.get(i16));
            if (dCalcAngleBetweenLines > d15) {
                i17 = i16;
                d15 = dCalcAngleBetweenLines;
            }
            i16++;
        }
        if (d15 > d14) {
            this.keep[i17] = true;
            int i18 = i17;
            algorithmDouglasPeucker(list, d14, i14, i18);
            algorithmDouglasPeucker(list, d14, i18, i15);
        }
    }

    private List<Entry> reduceWithDouglasPeuker(List<Entry> list, double d14) {
        if (d14 <= 0.0d || list.size() < 3) {
            return list;
        }
        boolean[] zArr = this.keep;
        zArr[0] = true;
        zArr[list.size() - 1] = true;
        algorithmDouglasPeucker(list, d14, 0, list.size() - 1);
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < list.size(); i14++) {
            if (this.keep[i14]) {
                Entry entry = list.get(i14);
                arrayList.add(new Entry(entry.getVal(), entry.getXIndex()));
            }
        }
        return arrayList;
    }

    public double calcAngle(Entry entry, Entry entry2) {
        return (Math.atan2(entry2.getVal() - entry.getVal(), entry2.getXIndex() - entry.getXIndex()) * 180.0d) / 3.141592653589793d;
    }

    public double calcAngleBetweenLines(Entry entry, Entry entry2, Entry entry3, Entry entry4) {
        return Math.abs(calcAngleWithRatios(entry, entry2) - calcAngleWithRatios(entry3, entry4));
    }

    public double calcAngleWithRatios(Entry entry, Entry entry2) {
        return (Math.atan2((entry2.getVal() * this.mScaleRatio) - (entry.getVal() * this.mScaleRatio), (entry2.getXIndex() * this.mDeltaRatio) - (entry.getXIndex() * this.mDeltaRatio)) * 180.0d) / 3.141592653589793d;
    }

    public double calcPointToLineDistance(Entry entry, Entry entry2, Entry entry3) {
        float xIndex = entry2.getXIndex() - entry.getXIndex();
        return ((double) Math.abs(((entry2.getVal() - entry.getVal()) * (entry3.getXIndex() - entry.getXIndex())) - ((entry3.getVal() - entry.getVal()) * xIndex))) / Math.sqrt(((entry2.getVal() - entry.getVal()) * (entry2.getVal() - entry.getVal())) + (xIndex * xIndex));
    }

    public List<Entry> filter(List<Entry> list, double d14) {
        if (d14 <= 0.0d) {
            return list;
        }
        this.keep = new boolean[list.size()];
        return AnonymousClass1.$SwitchMap$com$github$mikephil$chartingv2$data$filter$Approximator$ApproximatorType[this.mType.ordinal()] != 1 ? list : reduceWithDouglasPeuker(list, d14);
    }

    public void setRatios(float f14, float f15) {
        this.mDeltaRatio = f14;
        this.mScaleRatio = f15;
    }

    public void setTolerance(double d14) {
        this.mTolerance = d14;
    }

    public void setType(ApproximatorType approximatorType) {
        this.mType = approximatorType;
    }

    public void setup(ApproximatorType approximatorType, double d14) {
        this.mType = approximatorType;
        this.mTolerance = d14;
    }

    public Approximator(ApproximatorType approximatorType, double d14) {
        this.mType = ApproximatorType.DOUGLAS_PEUCKER;
        this.mTolerance = 0.0d;
        this.mScaleRatio = 1.0f;
        this.mDeltaRatio = 1.0f;
        setup(approximatorType, d14);
    }

    public List<Entry> filter(List<Entry> list) {
        return filter(list, this.mTolerance);
    }
}
