package com.xiaomi.hm.health.relation.chart.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class BarChart extends BaseChart<BarItem> {
    public float mItemPadding;
    public int mMaxItemValue;
    public int mMinItemValue;
    public boolean mMirrored;
    public boolean mNeedRealign;
    public Axis mXAxis;
    public Axis mYAxis;

    public static abstract class Axis extends BaseChart<Chart.Item> {
        public int offset;
        public int stroke;
        public int value;

        public Axis(Context context) {
            super(context);
        }
    }

    public static class BarItemComparator implements Comparator<BarItem>, Serializable {
        @Override // java.util.Comparator
        public int compare(BarItem barItem, BarItem barItem2) {
            return barItem.index - barItem2.index;
        }
    }

    public static class XAxis extends Axis {
        public XAxis(Context context) {
            super(context);
        }

        @Override // com.xiaomi.hm.health.relation.chart.base.BaseChart
        public void draw(Canvas canvas, RectF rectF, float f) {
            canvas.drawRect(rectF, this.mRenderer.paint);
        }
    }

    public BarChart(Context context) {
        super(context);
    }

    @Override // com.xiaomi.hm.health.relation.chart.base.BaseChart
    public void draw(Canvas canvas, RectF rectF, float f) {
        synchronized (this.mItems) {
            int size = this.mItems.size();
            for (int i = 0; i < size; i++) {
                ((BarItem) this.mItems.get(i)).draw(canvas, f, this.mMirrored);
            }
        }
        Axis axis = this.mXAxis;
        if (axis != null) {
            axis.draw(canvas, f);
        }
        Axis axis2 = this.mYAxis;
        if (axis2 != null) {
            axis2.draw(canvas, f);
        }
    }

    public int getMaxItemValue() {
        return this.mMaxItemValue;
    }

    public int getMinItemValue() {
        return this.mMinItemValue;
    }

    public float itemHeight(RectF rectF, BarItem barItem) {
        int i = barItem.value;
        int i2 = this.mMaxItemValue;
        if (i >= i2) {
            return (rectF.height() - this.mPaddingTop) - this.mPaddingBottom;
        }
        return ((rectF.height() - this.mPaddingTop) - this.mPaddingBottom) * (i / i2);
    }

    public boolean itemNeedDraw(BarItem barItem) {
        return true;
    }

    public float itemOffsetX(RectF rectF, BarItem barItem) {
        return (rectF.width() / this.mItems.size()) * this.mItems.indexOf(barItem);
    }

    public float itemWidth(RectF rectF, BarItem barItem) {
        return (rectF.width() / this.mItems.size()) - (this.mItemPadding * 2.0f);
    }

    @Override // com.xiaomi.hm.health.relation.chart.base.BaseChart
    public void notifyChanged() {
        synchronized (this.mItems) {
            realignItems(this.mRect, this.mItems);
        }
    }

    @Override // com.xiaomi.hm.health.relation.chart.base.BaseChart
    public void onItemsChanged(List<BarItem> list) {
        for (BarItem barItem : list) {
            barItem.mDensity = this.mDensity;
            barItem.mDensityScale = this.mDensityScale;
        }
        this.mNeedRealign = true;
    }

    @Override // com.xiaomi.hm.health.relation.chart.base.BaseChart
    public void onRectChanged(RectF rectF) {
        if (this.mXAxis != null) {
            RectF rectF2 = new RectF();
            rectF2.left = rectF.left;
            float f = rectF.bottom;
            Axis axis = this.mXAxis;
            rectF2.top = f - axis.stroke;
            rectF2.right = rectF.right;
            rectF2.bottom = f;
            axis.setRect(rectF2);
        }
        if (this.mYAxis != null) {
            RectF rectF3 = new RectF();
            rectF3.left = rectF.left;
            rectF3.top = rectF.top;
            float f2 = rectF.left;
            Axis axis2 = this.mYAxis;
            rectF3.right = f2 + axis2.stroke;
            rectF3.bottom = rectF.bottom;
            axis2.setRect(rectF3);
        }
        this.mNeedRealign = true;
    }

    public void realignItems(RectF rectF, List<? extends BarItem> list) {
        RectF rectF2;
        float fItemWidth;
        if (rectF == null || list == null || list.size() == 0) {
            return;
        }
        for (BarItem barItem : list) {
            if (itemNeedDraw(barItem)) {
                barItem.needDraw = true;
                if (this.mNeedRealign || (rectF2 = barItem.mRect) == null) {
                    if (barItem.mRect == null) {
                        barItem.mRect = new RectF();
                    }
                    rectF2 = barItem.mRect;
                    fItemWidth = itemWidth(rectF, barItem);
                    float fItemHeight = itemHeight(rectF, barItem);
                    if (this.mMirrored) {
                        float f = rectF.top + this.mPaddingTop;
                        rectF2.top = f;
                        rectF2.bottom = f + fItemHeight;
                    } else {
                        float f2 = rectF.bottom - this.mPaddingBottom;
                        rectF2.bottom = f2;
                        rectF2.top = f2 - fItemHeight;
                    }
                } else {
                    fItemWidth = rectF2.width();
                }
                float f3 = rectF.left + this.mItemPadding;
                rectF2.left = f3;
                rectF2.right = f3 + fItemWidth;
                rectF2.offset(itemOffsetX(rectF, barItem), 0.0f);
            } else {
                barItem.needDraw = false;
            }
        }
        this.mNeedRealign = false;
    }

    public void setItemPadding(float f) {
        this.mItemPadding = f;
    }

    public void setMaxItemValue(int i) {
        this.mMaxItemValue = i;
    }

    public void setMinItemValue(int i) {
        this.mMinItemValue = i;
    }

    public void setNeedRealign(boolean z) {
        this.mNeedRealign = z;
    }

    public static class BarItem extends BaseChart<Chart.Item> {
        public int index;
        public boolean needDraw;
        public int scope;
        public int value;

        public BarItem(Context context) {
            super(context);
        }

        @Override // com.xiaomi.hm.health.relation.chart.base.BaseChart
        public void draw(Canvas canvas, RectF rectF, float f) {
            if (!this.needDraw || this.mRenderer == null) {
                return;
            }
            float fWidth = rectF.left + (rectF.width() / 2.0f);
            float f2 = rectF.bottom;
            float fWidth2 = rectF.left + (rectF.width() / 2.0f);
            float fHeight = rectF.bottom - (rectF.height() * f);
            this.mRenderer.paint.setStrokeWidth(rectF.width());
            canvas.drawLine(fWidth, f2, fWidth2, fHeight, this.mRenderer.paint);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Value : " + this.value);
            sb.append(" , ");
            sb.append("Index : " + this.index);
            sb.append(" , ");
            sb.append("Scope : " + this.scope);
            sb.append(" , ");
            sb.append("NeedDrow : " + this.needDraw);
            return sb.toString();
        }

        @Override // com.xiaomi.hm.health.relation.chart.base.BaseChart
        public void draw(Canvas canvas, RectF rectF, float f, boolean z) {
            if (!this.needDraw || this.mRenderer == null) {
                return;
            }
            if (z) {
                float fWidth = rectF.left + (rectF.width() / 2.0f);
                float f2 = rectF.top;
                float fWidth2 = rectF.left + (rectF.width() / 2.0f);
                float fHeight = rectF.top + (rectF.height() * f);
                this.mRenderer.paint.setStrokeWidth(rectF.width());
                canvas.drawLine(fWidth, f2, fWidth2, fHeight, this.mRenderer.paint);
                return;
            }
            draw(canvas, rectF, f);
        }
    }
}
