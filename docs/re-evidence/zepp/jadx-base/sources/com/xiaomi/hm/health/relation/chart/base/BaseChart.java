package com.xiaomi.hm.health.relation.chart.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import com.xiaomi.hm.health.relation.chart.base.Chart.Item;
import com.xiaomi.hm.health.relation.chart.data.ChartDataLoader;
import com.xiaomi.hm.health.relation.chart.util.ChartUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BaseChart<T extends Chart.Item> implements Chart, Chart.Item {
    public BaseChartView<? extends BaseChart<T>> mContainer;
    public Context mContext;
    public float mDensity;
    public float mDensityScale;
    public List<T> mItems = new ArrayList();
    public ChartDataLoader.LoadCallback mLoadCallback;
    public float mPaddingBottom;
    public float mPaddingLeft;
    public float mPaddingRight;
    public float mPaddingTop;
    public BaseChart<? extends T> mParent;
    public RectF mRect;
    public Renderer mRenderer;
    public float mScroll;

    public BaseChart(Context context) {
        this.mDensity = ChartUtil.getDensity(context);
        this.mDensityScale = ChartUtil.getDensityScale(context);
        this.mContext = context;
    }

    public void doScroll(float f) {
    }

    @Override // com.xiaomi.hm.health.relation.chart.base.Chart
    public void draw(Canvas canvas) {
        draw(canvas, 1.0f);
    }

    public abstract void draw(Canvas canvas, RectF rectF, float f);

    public void fillItems(List<? extends T> list) {
        synchronized (this.mItems) {
            this.mItems.clear();
            this.mItems.addAll(list);
            onItemsChanged(this.mItems);
        }
    }

    public BaseChartView<? extends BaseChart<T>> getContainer() {
        return this.mContainer;
    }

    public Context getContext() {
        return this.mContext;
    }

    public List<T> getItems() {
        return this.mItems;
    }

    public float getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public float getPaddingLeft() {
        return this.mPaddingLeft;
    }

    public float getPaddingRight() {
        return this.mPaddingRight;
    }

    public float getPaddingTop() {
        return this.mPaddingTop;
    }

    public BaseChart<? extends T> getParent() {
        return this.mParent;
    }

    public RectF getRect() {
        return this.mRect;
    }

    public float getScroll() {
        return this.mScroll;
    }

    public void notifyChanged() {
    }

    public void onItemsChanged(List<T> list) {
    }

    public void onRectChanged(RectF rectF) {
    }

    public void scroll(float f) {
        this.mScroll += f;
        doScroll(f);
        notifyChanged();
    }

    public void scrollTo(float f) {
        float f2 = f - this.mScroll;
        this.mScroll = f;
        doScroll(f2);
        notifyChanged();
    }

    public void setContainer(BaseChartView<? extends BaseChart<T>> baseChartView) {
        this.mContainer = baseChartView;
    }

    public void setLoadCallback(ChartDataLoader.LoadCallback loadCallback) {
        this.mLoadCallback = loadCallback;
    }

    public void setPadding(float f, float f2, float f3, float f4) {
        this.mPaddingLeft = f;
        this.mPaddingTop = f2;
        this.mPaddingRight = f3;
        this.mPaddingBottom = f4;
        notifyChanged();
    }

    public void setParent(BaseChart<? extends T> baseChart) {
        this.mParent = baseChart;
    }

    public void setRect(Rect rect) {
        RectF rectF = new RectF(rect);
        this.mRect = rectF;
        onRectChanged(rectF);
        notifyChanged();
    }

    public void setRenderer(Renderer renderer) {
        this.mRenderer = renderer;
    }

    @Override // com.xiaomi.hm.health.relation.chart.base.Chart
    public void draw(Canvas canvas, float f) {
        draw(canvas, this.mRect, f);
    }

    public void draw(Canvas canvas, float f, boolean z) {
        draw(canvas, this.mRect, f, z);
    }

    public void draw(Canvas canvas, RectF rectF, float f, boolean z) {
        draw(canvas, rectF, f);
    }

    public void setRect(RectF rectF) {
        this.mRect = rectF;
        onRectChanged(rectF);
        notifyChanged();
    }
}
