package com.github.mikephil.chartingv2.charts;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.github.mikephil.chartingv2.animation.ChartAnimator;
import com.github.mikephil.chartingv2.animation.Easing;
import com.github.mikephil.chartingv2.animation.EasingFunction;
import com.github.mikephil.chartingv2.components.Legend;
import com.github.mikephil.chartingv2.components.MarkerView;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.data.ChartData;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.formatter.DefaultValueFormatter;
import com.github.mikephil.chartingv2.formatter.ValueFormatter;
import com.github.mikephil.chartingv2.highlight.ChartHighlighter;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.chartingv2.interfaces.datasets.IDataSet;
import com.github.mikephil.chartingv2.listener.ChartTouchListener;
import com.github.mikephil.chartingv2.listener.OnChartGestureListener;
import com.github.mikephil.chartingv2.listener.OnChartValueSelectedListener;
import com.github.mikephil.chartingv2.renderer.DataRenderer;
import com.github.mikephil.chartingv2.renderer.LegendRenderer;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"NewApi"})
@Deprecated
public abstract class Chart<T extends ChartData<? extends IDataSet<? extends Entry>>> extends ViewGroup implements ChartInterface {
    public static final String LOG_TAG = "MPAndroidChart";
    public static final int PAINT_CENTER_TEXT = 14;
    public static final int PAINT_DESCRIPTION = 11;
    public static final int PAINT_GRID_BACKGROUND = 4;
    public static final int PAINT_HOLE = 13;
    public static final int PAINT_INFO = 7;
    public static final int PAINT_LEGEND_LABEL = 18;
    protected ChartAnimator mAnimator;
    protected ChartTouchListener mChartTouchListener;
    protected T mData;
    protected ValueFormatter mDefaultFormatter;
    protected Paint mDescPaint;
    protected String mDescription;
    private PointF mDescriptionPosition;
    private boolean mDragDecelerationEnabled;
    private float mDragDecelerationFrictionCoef;
    protected boolean mDrawMarkerViews;
    protected Paint mDrawPaint;
    private float mExtraBottomOffset;
    private float mExtraLeftOffset;
    private float mExtraRightOffset;
    private float mExtraTopOffset;
    private OnChartGestureListener mGestureListener;
    protected boolean mHighLightPerTapEnabled;
    protected ChartHighlighter mHighlighter;
    protected Highlight[] mIndicesToHighlight;
    protected Paint mInfoPaint;
    protected ArrayList<Runnable> mJobs;
    protected Legend mLegend;
    protected LegendRenderer mLegendRenderer;
    protected boolean mLogEnabled;
    protected MarkerView mMarkerView;
    private String mNoDataText;
    private String mNoDataTextDescription;
    private boolean mOffsetsCalculated;
    protected DataRenderer mRenderer;
    protected OnChartValueSelectedListener mSelectionListener;
    protected boolean mTouchEnabled;
    private boolean mUnbind;
    protected ViewPortHandler mViewPortHandler;
    protected XAxis mXAxis;

    /* JADX INFO: renamed from: com.github.mikephil.chartingv2.charts.Chart$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$CompressFormat;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            $SwitchMap$android$graphics$Bitmap$CompressFormat = iArr;
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$CompressFormat[Bitmap.CompressFormat.WEBP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$CompressFormat[Bitmap.CompressFormat.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Chart(Context context) {
        super(context);
        this.mLogEnabled = false;
        this.mData = null;
        this.mHighLightPerTapEnabled = true;
        this.mDragDecelerationEnabled = true;
        this.mDragDecelerationFrictionCoef = 0.9f;
        this.mDescription = "Description";
        this.mTouchEnabled = true;
        this.mNoDataText = "No chart data available.";
        this.mExtraTopOffset = 0.0f;
        this.mExtraRightOffset = 0.0f;
        this.mExtraBottomOffset = 0.0f;
        this.mExtraLeftOffset = 0.0f;
        this.mOffsetsCalculated = false;
        this.mDrawMarkerViews = true;
        this.mJobs = new ArrayList<>();
        this.mUnbind = false;
        init();
    }

    private void unbindDrawables(View view2) {
        if (view2.getBackground() != null) {
            view2.getBackground().setCallback(null);
        }
        if (!(view2 instanceof ViewGroup)) {
            return;
        }
        int i14 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view2;
            if (i14 >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                unbindDrawables(viewGroup.getChildAt(i14));
                i14++;
            }
        }
    }

    public void addViewportJob(Runnable runnable) {
        if (this.mViewPortHandler.hasChartDimens()) {
            post(runnable);
        } else {
            this.mJobs.add(runnable);
        }
    }

    public void animateX(int i14, EasingFunction easingFunction) {
        this.mAnimator.animateX(i14, easingFunction);
    }

    public void animateXY(int i14, int i15, EasingFunction easingFunction, EasingFunction easingFunction2) {
        this.mAnimator.animateXY(i14, i15, easingFunction, easingFunction2);
    }

    public void animateY(int i14, EasingFunction easingFunction) {
        this.mAnimator.animateY(i14, easingFunction);
    }

    public abstract void calcMinMax();

    public void calculateFormatter(float f14, float f15) {
        T t7 = this.mData;
        this.mDefaultFormatter = new DefaultValueFormatter(Utils.getDecimals((t7 == null || t7.getXValCount() < 2) ? Math.max(Math.abs(f14), Math.abs(f15)) : Math.abs(f15 - f14)));
    }

    public abstract void calculateOffsets();

    public void clear() {
        this.mData = null;
        this.mIndicesToHighlight = null;
        invalidate();
    }

    public void clearAllViewportJobs() {
        this.mJobs.clear();
    }

    public void clearValues() {
        this.mData.clearValues();
        invalidate();
    }

    public void disableScroll() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void drawDescription(Canvas canvas) {
        if (this.mDescription.equals("")) {
            return;
        }
        PointF pointF = this.mDescriptionPosition;
        String str = this.mDescription;
        if (pointF == null) {
            canvas.drawText(str, (getWidth() - this.mViewPortHandler.offsetRight()) - 10.0f, (getHeight() - this.mViewPortHandler.offsetBottom()) - 10.0f, this.mDescPaint);
        } else {
            canvas.drawText(str, pointF.x, pointF.y, this.mDescPaint);
        }
    }

    public void drawMarkers(Canvas canvas) {
        Entry entryForHighlight;
        if (this.mMarkerView == null || !this.mDrawMarkerViews || !valuesToHighlight()) {
            return;
        }
        int i14 = 0;
        while (true) {
            Highlight[] highlightArr = this.mIndicesToHighlight;
            if (i14 >= highlightArr.length) {
                return;
            }
            Highlight highlight = highlightArr[i14];
            int xIndex = highlight.getXIndex();
            highlight.getDataSetIndex();
            float f14 = this.mXAxis.mAxisRange;
            float f15 = xIndex;
            if (f15 <= f14 && f15 <= this.mAnimator.getPhaseX() * f14 && (entryForHighlight = this.mData.getEntryForHighlight(this.mIndicesToHighlight[i14])) != null && entryForHighlight.getXIndex() == this.mIndicesToHighlight[i14].getXIndex()) {
                float[] markerPosition = getMarkerPosition(entryForHighlight, highlight);
                if (this.mViewPortHandler.isInBounds(markerPosition[0], markerPosition[1])) {
                    this.mMarkerView.refreshContent(entryForHighlight, highlight);
                    this.mMarkerView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    MarkerView markerView = this.mMarkerView;
                    markerView.layout(0, 0, markerView.getMeasuredWidth(), this.mMarkerView.getMeasuredHeight());
                    float height = markerPosition[1] - this.mMarkerView.getHeight();
                    MarkerView markerView2 = this.mMarkerView;
                    if (height <= 0.0f) {
                        float height2 = markerView2.getHeight();
                        float f16 = markerPosition[1];
                        this.mMarkerView.draw(canvas, markerPosition[0], f16 + (height2 - f16));
                    } else {
                        markerView2.draw(canvas, markerPosition[0], markerPosition[1]);
                    }
                }
            }
            i14++;
        }
    }

    public void enableScroll() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public ChartAnimator getAnimator() {
        return this.mAnimator;
    }

    public PointF getCenter() {
        return new PointF(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.ChartInterface
    public PointF getCenterOfView() {
        return getCenter();
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.ChartInterface
    public PointF getCenterOffsets() {
        return this.mViewPortHandler.getContentCenter();
    }

    public Bitmap getChartBitmap() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.ChartInterface
    public RectF getContentRect() {
        return this.mViewPortHandler.getContentRect();
    }

    public T getData() {
        return this.mData;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.ChartInterface
    public ValueFormatter getDefaultValueFormatter() {
        return this.mDefaultFormatter;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.mDragDecelerationFrictionCoef;
    }

    public List<Entry> getEntriesAtIndex(int i14) {
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < this.mData.getDataSetCount(); i15++) {
            Entry entryForXIndex = this.mData.getDataSetByIndex(i15).getEntryForXIndex(i14);
            if (entryForXIndex != null) {
                arrayList.add(entryForXIndex);
            }
        }
        return arrayList;
    }

    public float getExtraBottomOffset() {
        return this.mExtraBottomOffset;
    }

    public float getExtraLeftOffset() {
        return this.mExtraLeftOffset;
    }

    public float getExtraRightOffset() {
        return this.mExtraRightOffset;
    }

    public float getExtraTopOffset() {
        return this.mExtraTopOffset;
    }

    public Highlight[] getHighlighted() {
        return this.mIndicesToHighlight;
    }

    public ChartHighlighter getHighlighter() {
        return this.mHighlighter;
    }

    public ArrayList<Runnable> getJobs() {
        return this.mJobs;
    }

    public Legend getLegend() {
        return this.mLegend;
    }

    public LegendRenderer getLegendRenderer() {
        return this.mLegendRenderer;
    }

    public abstract float[] getMarkerPosition(Entry entry, Highlight highlight);

    public MarkerView getMarkerView() {
        return this.mMarkerView;
    }

    public OnChartGestureListener getOnChartGestureListener() {
        return this.mGestureListener;
    }

    public Paint getPaint(int i14) {
        if (i14 == 7) {
            return this.mInfoPaint;
        }
        if (i14 != 11) {
            return null;
        }
        return this.mDescPaint;
    }

    public DataRenderer getRenderer() {
        return this.mRenderer;
    }

    public int getValueCount() {
        return this.mData.getYValCount();
    }

    public ViewPortHandler getViewPortHandler() {
        return this.mViewPortHandler;
    }

    public XAxis getXAxis() {
        return this.mXAxis;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.ChartInterface
    public float getXChartMax() {
        return this.mXAxis.mAxisMaximum;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.ChartInterface
    public float getXChartMin() {
        return this.mXAxis.mAxisMinimum;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.ChartInterface
    public int getXValCount() {
        return this.mData.getXValCount();
    }

    public String getXValue(int i14) {
        T t7 = this.mData;
        if (t7 == null || t7.getXValCount() <= i14) {
            return null;
        }
        return this.mData.getXVals().get(i14);
    }

    public float getYMax() {
        return this.mData.getYMax();
    }

    public float getYMin() {
        return this.mData.getYMin();
    }

    @Deprecated
    public void highlightTouch(Highlight highlight) {
        highlightValue(highlight, true);
    }

    public void highlightValue(Highlight highlight, boolean z14) {
        Entry entry = null;
        if (highlight == null) {
            this.mIndicesToHighlight = null;
        } else {
            if (this.mLogEnabled) {
                highlight.toString();
            }
            Entry entryForHighlight = this.mData.getEntryForHighlight(highlight);
            if (entryForHighlight == null || entryForHighlight.getXIndex() != highlight.getXIndex()) {
                this.mIndicesToHighlight = null;
                highlight = null;
            } else {
                this.mIndicesToHighlight = new Highlight[]{highlight};
            }
            entry = entryForHighlight;
        }
        if (z14 && this.mSelectionListener != null) {
            boolean zValuesToHighlight = valuesToHighlight();
            OnChartValueSelectedListener onChartValueSelectedListener = this.mSelectionListener;
            if (zValuesToHighlight) {
                onChartValueSelectedListener.onValueSelected(entry, highlight.getDataSetIndex(), highlight);
            } else {
                onChartValueSelectedListener.onNothingSelected();
            }
        }
        invalidate();
    }

    public void highlightValues(Highlight[] highlightArr) {
        Highlight highlight;
        this.mIndicesToHighlight = highlightArr;
        if (highlightArr == null || highlightArr.length <= 0 || (highlight = highlightArr[0]) == null) {
            this.mChartTouchListener.setLastHighlighted(null);
        } else {
            this.mChartTouchListener.setLastHighlighted(highlight);
        }
        invalidate();
    }

    public void init() {
        setWillNotDraw(false);
        this.mAnimator = new ChartAnimator(new ValueAnimator.AnimatorUpdateListener() { // from class: com.github.mikephil.chartingv2.charts.Chart.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Chart.this.postInvalidate();
            }
        });
        Utils.init(getContext());
        this.mDefaultFormatter = new DefaultValueFormatter(1);
        this.mViewPortHandler = new ViewPortHandler();
        Legend legend = new Legend();
        this.mLegend = legend;
        this.mLegendRenderer = new LegendRenderer(this.mViewPortHandler, legend);
        this.mXAxis = new XAxis();
        Paint paint = new Paint(1);
        this.mDescPaint = paint;
        paint.setColor(-16777216);
        this.mDescPaint.setTextAlign(Paint.Align.RIGHT);
        this.mDescPaint.setTextSize(Utils.convertDpToPixel(9.0f));
        Paint paint2 = new Paint(1);
        this.mInfoPaint = paint2;
        paint2.setColor(Color.rgb(247, PsExtractor.PRIVATE_STREAM_1, 51));
        this.mInfoPaint.setTextAlign(Paint.Align.CENTER);
        this.mInfoPaint.setTextSize(Utils.convertDpToPixel(12.0f));
        this.mDrawPaint = new Paint(4);
    }

    public boolean isDragDecelerationEnabled() {
        return this.mDragDecelerationEnabled;
    }

    public boolean isDrawMarkerViewEnabled() {
        return this.mDrawMarkerViews;
    }

    public boolean isEmpty() {
        T t7 = this.mData;
        return t7 == null || t7.getYValCount() <= 0;
    }

    public boolean isHighlightPerTapEnabled() {
        return this.mHighLightPerTapEnabled;
    }

    public boolean isLogEnabled() {
        return this.mLogEnabled;
    }

    public abstract void notifyDataSetChanged();

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mUnbind) {
            unbindDrawables(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mData != null) {
            if (this.mOffsetsCalculated) {
                return;
            }
            calculateOffsets();
            this.mOffsetsCalculated = true;
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.mNoDataText);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.mNoDataTextDescription);
        float fontSpacing = 0.0f;
        float fCalcTextHeight = !zIsEmpty ? Utils.calcTextHeight(this.mInfoPaint, this.mNoDataText) : 0.0f;
        float fCalcTextHeight2 = !zIsEmpty2 ? Utils.calcTextHeight(this.mInfoPaint, this.mNoDataTextDescription) : 0.0f;
        if (!zIsEmpty && !zIsEmpty2) {
            fontSpacing = this.mInfoPaint.getFontSpacing() - fCalcTextHeight;
        }
        float height = ((getHeight() - ((fCalcTextHeight + fontSpacing) + fCalcTextHeight2)) / 2.0f) + fCalcTextHeight;
        if (!zIsEmpty) {
            canvas.drawText(this.mNoDataText, getWidth() / 2, height, this.mInfoPaint);
            if (!zIsEmpty2) {
                height = height + fCalcTextHeight + fontSpacing;
            }
        }
        if (zIsEmpty2) {
            return;
        }
        canvas.drawText(this.mNoDataTextDescription, getWidth() / 2, height, this.mInfoPaint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            getChildAt(i18).layout(i14, i15, i16, i17);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        int iConvertDpToPixel = (int) Utils.convertDpToPixel(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(iConvertDpToPixel, i14)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(iConvertDpToPixel, i15)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i14, int i15, int i16, int i17) {
        if (i14 > 0 && i15 > 0 && i14 < 10000 && i15 < 10000) {
            this.mViewPortHandler.setChartDimens(i14, i15);
            Iterator<Runnable> it = this.mJobs.iterator();
            while (it.hasNext()) {
                post(it.next());
            }
            this.mJobs.clear();
        }
        notifyDataSetChanged();
        super.onSizeChanged(i14, i15, i16, i17);
    }

    public void removeViewportJob(Runnable runnable) {
        this.mJobs.remove(runnable);
    }

    public boolean saveToGallery(String str, String str2, String str3, Bitmap.CompressFormat compressFormat, int i14) {
        String str4;
        if (i14 < 0 || i14 > 100) {
            i14 = 50;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/DCIM/" + str2);
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        int i15 = AnonymousClass2.$SwitchMap$android$graphics$Bitmap$CompressFormat[compressFormat.ordinal()];
        if (i15 == 1) {
            str4 = "image/png";
            if (!str.endsWith(".png")) {
                str = str.concat(".png");
            }
        } else if (i15 != 2) {
            boolean zEndsWith = str.endsWith(".jpg");
            str4 = MimeTypes.IMAGE_JPEG;
            if (!zEndsWith && !str.endsWith(".jpeg")) {
                str = str.concat(".jpg");
            }
        } else {
            str4 = "image/webp";
            if (!str.endsWith(".webp")) {
                str = str.concat(".webp");
            }
        }
        String str5 = file.getAbsolutePath() + "/" + str;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str5);
            getChartBitmap().compress(compressFormat, i14, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            long length = new File(str5).length();
            ContentValues contentValues = new ContentValues(8);
            contentValues.put("title", str);
            contentValues.put("_display_name", str);
            contentValues.put("date_added", Long.valueOf(jCurrentTimeMillis));
            contentValues.put("mime_type", str4);
            contentValues.put("description", str3);
            contentValues.put(ModelSourceWrapper.ORIENTATION, (Integer) 0);
            contentValues.put("_data", str5);
            contentValues.put("_size", Long.valueOf(length));
            return getContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues) != null;
        } catch (IOException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public boolean saveToPath(String str, String str2) {
        Bitmap chartBitmap = getChartBitmap();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(Environment.getExternalStorageDirectory().getPath() + str2 + "/" + str + ".png");
            chartBitmap.compress(Bitmap.CompressFormat.PNG, 40, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public void setData(T t7) {
        if (t7 == null) {
            return;
        }
        this.mOffsetsCalculated = false;
        this.mData = t7;
        calculateFormatter(t7.getYMin(), t7.getYMax());
        for (IDataSet iDataSet : this.mData.getDataSets()) {
            if (Utils.needsDefaultFormatter(iDataSet.getValueFormatter())) {
                iDataSet.setValueFormatter(this.mDefaultFormatter);
            }
        }
        notifyDataSetChanged();
    }

    public void setDescription(String str) {
        if (str == null) {
            str = "";
        }
        this.mDescription = str;
    }

    public void setDescriptionColor(int i14) {
        this.mDescPaint.setColor(i14);
    }

    public void setDescriptionPosition(float f14, float f15) {
        this.mDescriptionPosition = new PointF(f14, f15);
    }

    public void setDescriptionTextSize(float f14) {
        if (f14 > 16.0f) {
            f14 = 16.0f;
        }
        if (f14 < 6.0f) {
            f14 = 6.0f;
        }
        this.mDescPaint.setTextSize(Utils.convertDpToPixel(f14));
    }

    public void setDescriptionTypeface(Typeface typeface) {
        this.mDescPaint.setTypeface(typeface);
    }

    public void setDragDecelerationEnabled(boolean z14) {
        this.mDragDecelerationEnabled = z14;
    }

    public void setDragDecelerationFrictionCoef(float f14) {
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 >= 1.0f) {
            f14 = 0.999f;
        }
        this.mDragDecelerationFrictionCoef = f14;
    }

    public void setDrawMarkerViews(boolean z14) {
        this.mDrawMarkerViews = z14;
    }

    public void setExtraBottomOffset(float f14) {
        this.mExtraBottomOffset = Utils.convertDpToPixel(f14);
    }

    public void setExtraLeftOffset(float f14) {
        this.mExtraLeftOffset = Utils.convertDpToPixel(f14);
    }

    public void setExtraOffsets(float f14, float f15, float f16, float f17) {
        setExtraLeftOffset(f14);
        setExtraTopOffset(f15);
        setExtraRightOffset(f16);
        setExtraBottomOffset(f17);
    }

    public void setExtraRightOffset(float f14) {
        this.mExtraRightOffset = Utils.convertDpToPixel(f14);
    }

    public void setExtraTopOffset(float f14) {
        this.mExtraTopOffset = Utils.convertDpToPixel(f14);
    }

    public void setHardwareAccelerationEnabled(boolean z14) {
        if (z14) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z14) {
        this.mHighLightPerTapEnabled = z14;
    }

    public void setHighlighter(ChartHighlighter chartHighlighter) {
        this.mHighlighter = chartHighlighter;
    }

    public void setLogEnabled(boolean z14) {
        this.mLogEnabled = z14;
    }

    public void setMarkerView(MarkerView markerView) {
        this.mMarkerView = markerView;
    }

    public void setNoDataText(String str) {
        this.mNoDataText = str;
    }

    public void setNoDataTextDescription(String str) {
        this.mNoDataTextDescription = str;
    }

    public void setOnChartGestureListener(OnChartGestureListener onChartGestureListener) {
        this.mGestureListener = onChartGestureListener;
    }

    public void setOnChartValueSelectedListener(OnChartValueSelectedListener onChartValueSelectedListener) {
        this.mSelectionListener = onChartValueSelectedListener;
    }

    public void setOnTouchListener(ChartTouchListener chartTouchListener) {
        this.mChartTouchListener = chartTouchListener;
    }

    public void setPaint(Paint paint, int i14) {
        if (i14 == 7) {
            this.mInfoPaint = paint;
        } else {
            if (i14 != 11) {
                return;
            }
            this.mDescPaint = paint;
        }
    }

    public void setRenderer(DataRenderer dataRenderer) {
        if (dataRenderer != null) {
            this.mRenderer = dataRenderer;
        }
    }

    public void setTouchEnabled(boolean z14) {
        this.mTouchEnabled = z14;
    }

    public void setUnbindEnabled(boolean z14) {
        this.mUnbind = z14;
    }

    public boolean valuesToHighlight() {
        Highlight[] highlightArr = this.mIndicesToHighlight;
        return (highlightArr == null || highlightArr.length <= 0 || highlightArr[0] == null) ? false : true;
    }

    public void animateX(int i14, Easing.EasingOption easingOption) {
        this.mAnimator.animateX(i14, easingOption);
    }

    public void animateXY(int i14, int i15, Easing.EasingOption easingOption, Easing.EasingOption easingOption2) {
        this.mAnimator.animateXY(i14, i15, easingOption, easingOption2);
    }

    public void animateY(int i14, Easing.EasingOption easingOption) {
        this.mAnimator.animateY(i14, easingOption);
    }

    public void animateX(int i14) {
        this.mAnimator.animateX(i14);
    }

    public void animateXY(int i14, int i15) {
        this.mAnimator.animateXY(i14, i15);
    }

    public void animateY(int i14) {
        this.mAnimator.animateY(i14);
    }

    public Chart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLogEnabled = false;
        this.mData = null;
        this.mHighLightPerTapEnabled = true;
        this.mDragDecelerationEnabled = true;
        this.mDragDecelerationFrictionCoef = 0.9f;
        this.mDescription = "Description";
        this.mTouchEnabled = true;
        this.mNoDataText = "No chart data available.";
        this.mExtraTopOffset = 0.0f;
        this.mExtraRightOffset = 0.0f;
        this.mExtraBottomOffset = 0.0f;
        this.mExtraLeftOffset = 0.0f;
        this.mOffsetsCalculated = false;
        this.mDrawMarkerViews = true;
        this.mJobs = new ArrayList<>();
        this.mUnbind = false;
        init();
    }

    public Chart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.mLogEnabled = false;
        this.mData = null;
        this.mHighLightPerTapEnabled = true;
        this.mDragDecelerationEnabled = true;
        this.mDragDecelerationFrictionCoef = 0.9f;
        this.mDescription = "Description";
        this.mTouchEnabled = true;
        this.mNoDataText = "No chart data available.";
        this.mExtraTopOffset = 0.0f;
        this.mExtraRightOffset = 0.0f;
        this.mExtraBottomOffset = 0.0f;
        this.mExtraLeftOffset = 0.0f;
        this.mOffsetsCalculated = false;
        this.mDrawMarkerViews = true;
        this.mJobs = new ArrayList<>();
        this.mUnbind = false;
        init();
    }

    public void highlightValue(Highlight highlight) {
        highlightValue(highlight, false);
    }

    public void highlightValue(int i14, int i15) {
        if (i14 >= 0 && i15 >= 0 && i14 < this.mData.getXValCount() && i15 < this.mData.getDataSetCount()) {
            highlightValues(new Highlight[]{new Highlight(i14, i15)});
        } else {
            highlightValues(null);
        }
    }

    public boolean saveToGallery(String str, int i14) {
        return saveToGallery(str, "", "MPAndroidChart-Library Save", Bitmap.CompressFormat.JPEG, i14);
    }
}
