package com.huami.watch.dataflow.chart.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import com.huami.watch.dataflow.chart.base.Chart.Item;
import com.huami.watch.dataflow.chart.data.ChartDataLoader;
import com.huami.watch.dataflow.chart.util.ChartUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseChart<T extends Chart.Item> implements Chart, Chart.Item {
    public BaseChartView<? extends BaseChart<T>> mContainer;
    public Context mContext;
    public float mDensity;
    public float mDensityScale;
    public final List<T> mItems = new ArrayList();
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

    public void addItem(T t) {
        synchronized (this.mItems) {
            this.mItems.add(t);
            onItemsChanged(this.mItems);
        }
    }

    public void addItems(List<? extends T> list) {
        synchronized (this.mItems) {
            this.mItems.addAll(list);
            onItemsChanged(this.mItems);
        }
    }

    public void clearItems() {
        synchronized (this.mItems) {
            this.mItems.clear();
            onItemsChanged(this.mItems);
        }
    }

    public void doScroll(float f) {
    }

    @Override // com.huami.watch.dataflow.chart.base.Chart
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

    public Renderer getRenderer() {
        return this.mRenderer;
    }

    public float getScroll() {
        return this.mScroll;
    }

    public int itemsCount() {
        return this.mItems.size();
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

    public void sortItems() {
    }

    @Override // com.huami.watch.dataflow.chart.base.Chart
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
