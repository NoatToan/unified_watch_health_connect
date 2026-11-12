package com.huami.watch.companion.ecg.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import com.huami.ecg.chart.EcgGridView;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0013\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0011B%\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0013J\u001a\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0014¨\u0006\u0014"}, d2 = {"Lcom/huami/watch/companion/ecg/view/MidongEcgGridView;", "Lcom/huami/ecg/chart/EcgGridView;", "", "", "data", "", "setData", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class MidongEcgGridView extends EcgGridView {
    public MidongEcgGridView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMinCount = -2.5f;
        this.mMaxCount = 2.5f;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.ecg.chart.EcgGridView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((this.mY * size) / this.mX, 1073741824));
    }

    @Override // com.huami.ecg.chart.EcgGridView
    public void setData(@Nullable List<Float> data) {
        if (data == null) {
            return;
        }
        if (!(!data.isEmpty())) {
            data = null;
        }
        if (data == null) {
            return;
        }
        this.dataList = data;
        this.mPointList.clear();
        this.mItemWidth = this.mViewWidth / (this.mX * 10);
        float f = this.mViewHeight / 2;
        int i = 0;
        int size = this.dataList.size() - 1;
        if (size > 0) {
            while (true) {
                int i2 = i + 1;
                PointF pointF = new PointF();
                pointF.set(i * this.mItemWidth, this.dataList.get(i).floatValue() > 0.0f ? f - (this.mViewHeight * (this.dataList.get(i).floatValue() / this.mMaxCount)) : f + (this.mViewHeight * (this.dataList.get(i).floatValue() / this.mMinCount)));
                this.mPointList.add(pointF);
                if (i2 >= size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        invalidate();
    }

    public MidongEcgGridView(@Nullable Context context) {
        super(context);
        this.mMinCount = -2.5f;
        this.mMaxCount = 2.5f;
    }

    public MidongEcgGridView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMinCount = -2.5f;
        this.mMaxCount = 2.5f;
    }
}
