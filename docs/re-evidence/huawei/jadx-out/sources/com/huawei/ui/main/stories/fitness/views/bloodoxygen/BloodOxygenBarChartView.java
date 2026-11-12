package com.huawei.ui.main.stories.fitness.views.bloodoxygen;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.main.stories.BarChartRender;
import defpackage.ukk;

/* JADX INFO: loaded from: classes43.dex */
public class BloodOxygenBarChartView extends HwHealthBarChart {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnMostChangedListener f27194c;
    private OnDataChangedListener d;

    public interface OnDataChangedListener {
        void onDataChangedListener(float f, float f2);
    }

    public interface OnMostChangedListener {
        void onMostChangedListener(float f, float f2);
    }

    public BloodOxygenBarChartView(Context context) {
        super(context);
        e();
    }

    private void e() {
        LogUtil.e("BloodOxygenBarChartView", "BloodOxygenBarChartView initStyle!");
        this.mRenderer = new BloodOxygenBarChartRenderer(this, this, this.mAnimator, this.mViewPortHandler);
        this.mAxisRendererFirstParty = new ukk(getContext(), this.mViewPortHandler, this.mAxisFirstParty, this.mFirstAxisTransformer, this);
        this.mAxisRendererSecondParty = new ukk(getContext(), this.mViewPortHandler, this.mAxisSecondParty, this.mSecondAxisTransformer, this);
        enableMarkerView(true);
        enableSpacePreserveForDataOverlay(true);
        ((BloodOxygenBarChartRenderer) this.mRenderer).a(new BarChartRender.OnTimeChangedListener() { // from class: uko
            @Override // com.huawei.ui.main.stories.BarChartRender.OnTimeChangedListener
            public final void onTimeChangedListener(float f, float f2) {
                this.f50294b.e(f, f2);
            }
        });
        ((BloodOxygenBarChartRenderer) this.mRenderer).e(new BloodOxygenBarChartRenderer.OnMostValueChangedListener() { // from class: ukt
            @Override // com.huawei.ui.main.stories.fitness.views.bloodoxygen.BloodOxygenBarChartRenderer.OnMostValueChangedListener
            public final void onMostValueChangedListener(float f, float f2) {
                this.e.a(f, f2);
            }
        });
    }

    public /* synthetic */ void e(float f, float f2) {
        OnDataChangedListener onDataChangedListener = this.d;
        if (onDataChangedListener != null) {
            onDataChangedListener.onDataChangedListener(f, f2);
        }
    }

    public /* synthetic */ void a(float f, float f2) {
        OnMostChangedListener onMostChangedListener = this.f27194c;
        if (onMostChangedListener != null) {
            onMostChangedListener.onMostChangedListener(f, f2);
        }
    }

    public void setOnDataChangedListener(OnDataChangedListener onDataChangedListener) {
        this.d = onDataChangedListener;
    }

    public void setOnMostChangedListener(OnMostChangedListener onMostChangedListener) {
        this.f27194c = onMostChangedListener;
    }
}
