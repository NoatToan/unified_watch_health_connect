package com.github.mikephil.chartingv2.data.realm.implementation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import com.github.mikephil.chartingv2.data.realm.base.RealmLineRadarDataSet;
import com.github.mikephil.chartingv2.formatter.DefaultFillFormatter;
import com.github.mikephil.chartingv2.formatter.FillFormatter;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;
import com.github.mikephil.chartingv2.utils.ColorTemplate;
import com.github.mikephil.chartingv2.utils.Utils;
import io.realm.RealmObject;
import io.realm.RealmResults;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RealmLineDataSet<T extends RealmObject> extends RealmLineRadarDataSet<T> implements ILineDataSet {
    private int mCircleColorHole;
    private List<Integer> mCircleColors;
    private float mCircleSize;
    private float mCubicIntensity;
    private DashPathEffect mDashPathEffect;
    private boolean mDrawCircleHole;
    private boolean mDrawCircles;
    private boolean mDrawCubic;
    private boolean mDrawStepped;
    private FillFormatter mFillFormatter;

    public RealmLineDataSet(RealmResults<T> realmResults, String str) {
        super(realmResults, str);
        this.mCircleColors = null;
        this.mCircleColorHole = -1;
        this.mCircleSize = 8.0f;
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
        build(this.results);
        calcMinMax(0, this.results.size());
    }

    @Override // com.github.mikephil.chartingv2.data.realm.base.RealmLineRadarDataSet, com.github.mikephil.chartingv2.data.realm.base.RealmBaseDataSet
    public void build(RealmResults<T> realmResults) {
        super.build(realmResults);
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
        return this.mCircleSize;
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

    public void setCircleSize(float f14) {
        this.mCircleSize = Utils.convertDpToPixel(f14);
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

    public RealmLineDataSet(RealmResults<T> realmResults, String str, String str2) {
        super(realmResults, str, str2);
        this.mCircleColors = null;
        this.mCircleColorHole = -1;
        this.mCircleSize = 8.0f;
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
        build(this.results);
        calcMinMax(0, this.results.size());
    }
}
