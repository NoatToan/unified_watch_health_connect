package com.github.mikephil.chartingv2.data;

import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import com.github.mikephil.chartingv2.formatter.DefaultFillFormatter;
import com.github.mikephil.chartingv2.formatter.FillFormatter;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;
import com.github.mikephil.chartingv2.utils.ColorTemplate;
import com.github.mikephil.chartingv2.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class LineDataSet extends LineRadarDataSet<Entry> implements ILineDataSet {
    private int mCircleColorHole;
    private List<Integer> mCircleColors;
    private float mCircleRadius;
    private float mCubicIntensity;
    private DashPathEffect mDashPathEffect;
    private boolean mDrawCircleHole;
    private boolean mDrawCircles;
    private boolean mDrawCubic;
    private boolean mDrawStepped;
    private FillFormatter mFillFormatter;

    public LineDataSet(List<Entry> list, String str) {
        super(list, str);
        this.mCircleColors = null;
        this.mCircleColorHole = -1;
        this.mCircleRadius = 8.0f;
        this.mCubicIntensity = 0.2f;
        this.mDashPathEffect = null;
        this.mFillFormatter = new DefaultFillFormatter();
        this.mDrawCircles = true;
        this.mDrawCubic = false;
        this.mDrawStepped = false;
        this.mDrawCircleHole = true;
        ArrayList arrayList = new ArrayList();
        this.mCircleColors = arrayList;
        arrayList.add(Integer.valueOf(Color.rgb(140, 234, 255)));
    }

    @Override // com.github.mikephil.chartingv2.data.DataSet
    public DataSet<Entry> copy() {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < this.mYVals.size(); i14++) {
            arrayList.add(((Entry) this.mYVals.get(i14)).copy());
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, getLabel());
        lineDataSet.mColors = this.mColors;
        lineDataSet.mCircleRadius = this.mCircleRadius;
        lineDataSet.mCircleColors = this.mCircleColors;
        lineDataSet.mDashPathEffect = this.mDashPathEffect;
        lineDataSet.mDrawCircles = this.mDrawCircles;
        lineDataSet.mDrawCubic = this.mDrawCubic;
        lineDataSet.mHighLightColor = this.mHighLightColor;
        return lineDataSet;
    }

    public void disableDashedLine() {
        this.mDashPathEffect = null;
    }

    public void enableDashedLine(float f14, float f15, float f16) {
        this.mDashPathEffect = new DashPathEffect(new float[]{f14, f15}, f16);
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet
    public int getCircleColor(int i14) {
        List<Integer> list = this.mCircleColors;
        return list.get(i14 % list.size()).intValue();
    }

    public List<Integer> getCircleColors() {
        return this.mCircleColors;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet
    public int getCircleHoleColor() {
        return this.mCircleColorHole;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet
    public float getCircleRadius() {
        return this.mCircleRadius;
    }

    @Deprecated
    public float getCircleSize() {
        return getCircleRadius();
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet
    public float getCubicIntensity() {
        return this.mCubicIntensity;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet
    public DashPathEffect getDashPathEffect() {
        return this.mDashPathEffect;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet
    public FillFormatter getFillFormatter() {
        return this.mFillFormatter;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet
    public boolean isDashedLineEnabled() {
        return this.mDashPathEffect != null;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet
    public boolean isDrawCircleHoleEnabled() {
        return this.mDrawCircleHole;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet
    public boolean isDrawCirclesEnabled() {
        return this.mDrawCircles;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet
    public boolean isDrawCubicEnabled() {
        return this.mDrawCubic;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet
    public boolean isDrawSteppedEnabled() {
        return this.mDrawStepped;
    }

    public void resetCircleColors() {
        this.mCircleColors = new ArrayList();
    }

    public void setCircleColor(int i14) {
        resetCircleColors();
        this.mCircleColors.add(Integer.valueOf(i14));
    }

    public void setCircleColorHole(int i14) {
        this.mCircleColorHole = i14;
    }

    public void setCircleColors(int[] iArr, Context context) {
        ArrayList arrayList = new ArrayList();
        for (int i14 : iArr) {
            arrayList.add(Integer.valueOf(context.getResources().getColor(i14)));
        }
        this.mCircleColors = arrayList;
    }

    public void setCircleRadius(float f14) {
        this.mCircleRadius = Utils.convertDpToPixel(f14);
    }

    @Deprecated
    public void setCircleSize(float f14) {
        setCircleRadius(f14);
    }

    public void setCubicIntensity(float f14) {
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        if (f14 < 0.05f) {
            f14 = 0.05f;
        }
        this.mCubicIntensity = f14;
    }

    public void setDrawCircleHole(boolean z14) {
        this.mDrawCircleHole = z14;
    }

    public void setDrawCircles(boolean z14) {
        this.mDrawCircles = z14;
    }

    public void setDrawCubic(boolean z14) {
        this.mDrawCubic = z14;
    }

    public void setDrawStepped(boolean z14) {
        this.mDrawStepped = z14;
    }

    public void setFillFormatter(FillFormatter fillFormatter) {
        if (fillFormatter == null) {
            this.mFillFormatter = new DefaultFillFormatter();
        } else {
            this.mFillFormatter = fillFormatter;
        }
    }

    public void setCircleColors(int[] iArr) {
        this.mCircleColors = ColorTemplate.createColors(iArr);
    }

    public void setCircleColors(List<Integer> list) {
        this.mCircleColors = list;
    }
}
