package com.github.mikephil.charting.charts;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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
import androidx.annotation.RequiresApi;
import coil.util.Utils;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import defpackage.ca7;
import defpackage.cu3;
import defpackage.dn5;
import defpackage.erc;
import defpackage.fmq;
import defpackage.fu3;
import defpackage.gu3;
import defpackage.hu3;
import defpackage.hwq;
import defpackage.k0d;
import defpackage.lz5;
import defpackage.r7c;
import defpackage.ttc;
import defpackage.u7h;
import defpackage.wx5;
import defpackage.wye;
import defpackage.yee;
import defpackage.zsc;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Chart<T extends fu3<? extends erc<? extends Entry>>> extends ViewGroup implements hu3 {
    public static final String LOG_TAG = "MPAndroidChart";
    public static final int PAINT_CENTER_TEXT = 14;
    public static final int PAINT_DESCRIPTION = 11;
    public static final int PAINT_GRID_BACKGROUND = 4;
    public static final int PAINT_HOLE = 13;
    public static final int PAINT_INFO = 7;
    public static final int PAINT_LEGEND_LABEL = 18;
    protected cu3 mAnimator;
    protected ChartTouchListener mChartTouchListener;
    protected T mData;
    protected wx5 mDefaultValueFormatter;
    protected Paint mDescPaint;
    protected lz5 mDescription;
    private boolean mDragDecelerationEnabled;
    private float mDragDecelerationFrictionCoef;
    protected boolean mDrawMarkers;
    private float mExtraBottomOffset;
    private float mExtraLeftOffset;
    private float mExtraRightOffset;
    private float mExtraTopOffset;
    private com.github.mikephil.charting.listener.b mGestureListener;
    protected boolean mHighLightPerTapEnabled;
    protected zsc mHighlighter;
    protected r7c[] mIndicesToHighlight;
    protected Paint mInfoPaint;
    protected ArrayList<Runnable> mJobs;
    protected Legend mLegend;
    protected yee mLegendRenderer;
    protected boolean mLogEnabled;
    protected ttc mMarker;
    protected float mMaxHighlightDistance;
    private String mNoDataText;
    private boolean mOffsetsCalculated;
    protected dn5 mRenderer;
    protected u7h mSelectionListener;
    protected boolean mTouchEnabled;
    private boolean mUnbind;
    protected hwq mViewPortHandler;
    protected XAxis mXAxis;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Chart.this.postInvalidate();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7769b;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            f7769b = iArr;
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7769b[Bitmap.CompressFormat.WEBP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7769b[Bitmap.CompressFormat.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Paint.Align.values().length];
            f7768a = iArr2;
            try {
                iArr2[Paint.Align.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7768a[Paint.Align.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
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
        this.mDefaultValueFormatter = new wx5(0);
        this.mTouchEnabled = true;
        this.mNoDataText = "No chart data available.";
        this.mViewPortHandler = new hwq();
        this.mExtraTopOffset = 0.0f;
        this.mExtraRightOffset = 0.0f;
        this.mExtraBottomOffset = 0.0f;
        this.mExtraLeftOffset = 0.0f;
        this.mOffsetsCalculated = false;
        this.mMaxHighlightDistance = 0.0f;
        this.mDrawMarkers = true;
        this.mJobs = new ArrayList<>();
        this.mUnbind = false;
        init();
    }

    private void unbindDrawables(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                unbindDrawables(viewGroup.getChildAt(i));
                i++;
            }
        }
    }

    public void addViewportJob(Runnable runnable) {
        if (this.mViewPortHandler.u()) {
            post(runnable);
        } else {
            this.mJobs.add(runnable);
        }
    }

    @RequiresApi(11)
    public void animateX(int i, ca7.c0 c0Var) {
        this.mAnimator.b(i, c0Var);
    }

    @RequiresApi(11)
    public void animateXY(int i, int i2, ca7.c0 c0Var, ca7.c0 c0Var2) {
        this.mAnimator.e(i, i2, c0Var, c0Var2);
    }

    @RequiresApi(11)
    public void animateY(int i, ca7.c0 c0Var) {
        this.mAnimator.g(i, c0Var);
    }

    public abstract void calcMinMax();

    public abstract void calculateOffsets();

    public void clear() {
        this.mData = null;
        this.mOffsetsCalculated = false;
        this.mIndicesToHighlight = null;
        this.mChartTouchListener.d(null);
        invalidate();
    }

    public void clearAllViewportJobs() {
        this.mJobs.clear();
    }

    public void clearValues() {
        this.mData.h();
        invalidate();
    }

    public void disableScroll() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void drawDescription(Canvas canvas) {
        float height;
        float width;
        lz5 lz5Var = this.mDescription;
        if (lz5Var == null || !lz5Var.isEnabled()) {
            return;
        }
        wye wyeVarA = this.mDescription.a();
        this.mDescPaint.setTypeface(this.mDescription.getTypeface());
        this.mDescPaint.setTextSize(this.mDescription.getTextSize());
        this.mDescPaint.setColor(this.mDescription.getTextColor());
        this.mDescPaint.setTextAlign(this.mDescription.c());
        if (wyeVarA == null) {
            width = (getWidth() - this.mViewPortHandler.J()) - this.mDescription.getXOffset();
            height = (getHeight() - this.mViewPortHandler.H()) - this.mDescription.getYOffset();
        } else {
            float f = wyeVarA.c;
            height = wyeVarA.d;
            width = f;
        }
        canvas.drawText(this.mDescription.b(), width, height, this.mDescPaint);
    }

    public void drawMarkers(Canvas canvas) {
        if (this.mMarker == null || !isDrawMarkersEnabled() || !valuesToHighlight()) {
            return;
        }
        int i = 0;
        while (true) {
            r7c[] r7cVarArr = this.mIndicesToHighlight;
            if (i >= r7cVarArr.length) {
                return;
            }
            r7c r7cVar = r7cVarArr[i];
            erc ercVarI = this.mData.i(r7cVar.d());
            Entry entryN = this.mData.n(this.mIndicesToHighlight[i]);
            int iC = ercVarI.c(entryN);
            if (entryN != null && iC <= ercVarI.O0() * this.mAnimator.h()) {
                float[] markerPosition = getMarkerPosition(r7cVar);
                if (this.mViewPortHandler.z(markerPosition[0], markerPosition[1])) {
                    this.mMarker.b(entryN, r7cVar);
                    this.mMarker.a(canvas, markerPosition[0], markerPosition[1]);
                }
            }
            i++;
        }
    }

    public void enableScroll() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public cu3 getAnimator() {
        return this.mAnimator;
    }

    public wye getCenter() {
        return wye.c(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    public wye getCenterOfView() {
        return getCenter();
    }

    public wye getCenterOffsets() {
        return this.mViewPortHandler.o();
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

    public RectF getContentRect() {
        return this.mViewPortHandler.p();
    }

    public T getData() {
        return this.mData;
    }

    public k0d getDefaultValueFormatter() {
        return this.mDefaultValueFormatter;
    }

    public lz5 getDescription() {
        return this.mDescription;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.mDragDecelerationFrictionCoef;
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

    public r7c getHighlightByTouchPoint(float f, float f2) {
        if (this.mData == null) {
            return null;
        }
        return getHighlighter().a(f, f2);
    }

    public r7c[] getHighlighted() {
        return this.mIndicesToHighlight;
    }

    public zsc getHighlighter() {
        return this.mHighlighter;
    }

    public ArrayList<Runnable> getJobs() {
        return this.mJobs;
    }

    public Legend getLegend() {
        return this.mLegend;
    }

    public yee getLegendRenderer() {
        return this.mLegendRenderer;
    }

    public ttc getMarker() {
        return this.mMarker;
    }

    public float[] getMarkerPosition(r7c r7cVar) {
        return new float[]{r7cVar.e(), r7cVar.f()};
    }

    @Deprecated
    public ttc getMarkerView() {
        return getMarker();
    }

    @Override // defpackage.hu3
    public float getMaxHighlightDistance() {
        return this.mMaxHighlightDistance;
    }

    public abstract /* synthetic */ int getMaxVisibleCount();

    public com.github.mikephil.charting.listener.b getOnChartGestureListener() {
        return null;
    }

    public ChartTouchListener getOnTouchListener() {
        return this.mChartTouchListener;
    }

    public Paint getPaint(int i) {
        if (i == 7) {
            return this.mInfoPaint;
        }
        if (i != 11) {
            return null;
        }
        return this.mDescPaint;
    }

    public dn5 getRenderer() {
        return this.mRenderer;
    }

    public hwq getViewPortHandler() {
        return this.mViewPortHandler;
    }

    public XAxis getXAxis() {
        return this.mXAxis;
    }

    public float getXChartMax() {
        return this.mXAxis.mAxisMaximum;
    }

    public float getXChartMin() {
        return this.mXAxis.mAxisMinimum;
    }

    public float getXRange() {
        return this.mXAxis.mAxisRange;
    }

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
        return this.mData.t();
    }

    public float getYMin() {
        return this.mData.v();
    }

    public void highlightValue(r7c r7cVar) {
        highlightValue(r7cVar, false);
    }

    public void highlightValues(r7c[] r7cVarArr) {
        this.mIndicesToHighlight = r7cVarArr;
        setLastHighlighted(r7cVarArr);
        invalidate();
    }

    public void init() {
        setWillNotDraw(false);
        this.mAnimator = new cu3(new a());
        fmq.v(getContext());
        this.mMaxHighlightDistance = fmq.e(500.0f);
        this.mDescription = new lz5();
        Legend legend = new Legend();
        this.mLegend = legend;
        this.mLegendRenderer = new yee(this.mViewPortHandler, legend);
        this.mXAxis = new XAxis();
        this.mDescPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.mInfoPaint = paint;
        paint.setColor(Color.rgb(247, SportReportBaseParser.ReportType.descentCount, 51));
        this.mInfoPaint.setTextAlign(Paint.Align.CENTER);
        this.mInfoPaint.setTextSize(fmq.e(12.0f));
    }

    public boolean isDragDecelerationEnabled() {
        return this.mDragDecelerationEnabled;
    }

    @Deprecated
    public boolean isDrawMarkerViewsEnabled() {
        return isDrawMarkersEnabled();
    }

    public boolean isDrawMarkersEnabled() {
        return this.mDrawMarkers;
    }

    public boolean isEmpty() {
        T t = this.mData;
        return t == null || t.m() <= 0;
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
        if (!TextUtils.isEmpty(this.mNoDataText)) {
            wye center = getCenter();
            int i = b.f7768a[this.mInfoPaint.getTextAlign().ordinal()];
            if (i == 1) {
                center.c = 0.0f;
                canvas.drawText(this.mNoDataText, 0.0f, center.d, this.mInfoPaint);
            } else {
                if (i != 2) {
                    canvas.drawText(this.mNoDataText, center.c, center.d, this.mInfoPaint);
                    return;
                }
                float f = (float) (((double) center.c) * 2.0d);
                center.c = f;
                canvas.drawText(this.mNoDataText, f, center.d, this.mInfoPaint);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iE = (int) fmq.e(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(iE, i)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(iE, i2)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            if (this.mLogEnabled) {
                StringBuilder sb = new StringBuilder();
                sb.append("Setting chart dimens, width: ");
                sb.append(i);
                sb.append(", height: ");
                sb.append(i2);
            }
            this.mViewPortHandler.O(i, i2);
        } else if (this.mLogEnabled) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("*Avoiding* setting chart dimens! width: ");
            sb2.append(i);
            sb2.append(", height: ");
            sb2.append(i2);
        }
        notifyDataSetChanged();
        Iterator<Runnable> it = this.mJobs.iterator();
        while (it.hasNext()) {
            post(it.next());
        }
        this.mJobs.clear();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void removeViewportJob(Runnable runnable) {
        this.mJobs.remove(runnable);
    }

    public boolean saveToGallery(String str, String str2, String str3, Bitmap.CompressFormat compressFormat, int i) {
        String str4;
        if (i < 0 || i > 100) {
            i = 50;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/DCIM/" + str2);
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        int i2 = b.f7769b[compressFormat.ordinal()];
        if (i2 == 1) {
            str4 = "image/png";
            if (!str.endsWith(".png")) {
                str = str + ".png";
            }
        } else if (i2 != 2) {
            boolean zEndsWith = str.endsWith(".jpg");
            str4 = Utils.MIME_TYPE_JPEG;
            if (!zEndsWith && !str.endsWith(".jpeg")) {
                str = str + ".jpg";
            }
        } else {
            boolean zEndsWith2 = str.endsWith(".webp");
            str4 = Utils.MIME_TYPE_WEBP;
            if (!zEndsWith2) {
                str = str + ".webp";
            }
        }
        String str5 = file.getAbsolutePath() + "/" + str;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str5);
            getChartBitmap().compress(compressFormat, i, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            long length = new File(str5).length();
            ContentValues contentValues = new ContentValues(8);
            contentValues.put("title", str);
            contentValues.put("_display_name", str);
            contentValues.put("date_added", Long.valueOf(jCurrentTimeMillis));
            contentValues.put("mime_type", str4);
            contentValues.put("description", str3);
            contentValues.put("orientation", (Integer) 0);
            contentValues.put("_data", str5);
            contentValues.put("_size", Long.valueOf(length));
            return getContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues) != null;
        } catch (IOException e) {
            e.printStackTrace();
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
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void setData(T t) {
        this.mData = t;
        this.mOffsetsCalculated = false;
        if (t == null) {
            return;
        }
        setupDefaultFormatter(t.v(), t.t());
        for (erc ercVar : this.mData.l()) {
            if (ercVar.G0() || ercVar.d0() == this.mDefaultValueFormatter) {
                ercVar.t0(this.mDefaultValueFormatter);
            }
        }
        notifyDataSetChanged();
    }

    public void setDescription(lz5 lz5Var) {
        this.mDescription = lz5Var;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.mDragDecelerationEnabled = z;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.mDragDecelerationFrictionCoef = f;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public void setDrawMarkers(boolean z) {
        this.mDrawMarkers = z;
    }

    public void setExtraBottomOffset(float f) {
        this.mExtraBottomOffset = fmq.e(f);
    }

    public void setExtraLeftOffset(float f) {
        this.mExtraLeftOffset = fmq.e(f);
    }

    public void setExtraOffsets(float f, float f2, float f3, float f4) {
        setExtraLeftOffset(f);
        setExtraTopOffset(f2);
        setExtraRightOffset(f3);
        setExtraBottomOffset(f4);
    }

    public void setExtraRightOffset(float f) {
        this.mExtraRightOffset = fmq.e(f);
    }

    public void setExtraTopOffset(float f) {
        this.mExtraTopOffset = fmq.e(f);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.mHighLightPerTapEnabled = z;
    }

    public void setHighlighter(gu3 gu3Var) {
        this.mHighlighter = gu3Var;
    }

    public void setLastHighlighted(r7c[] r7cVarArr) {
        r7c r7cVar;
        if (r7cVarArr == null || r7cVarArr.length <= 0 || (r7cVar = r7cVarArr[0]) == null) {
            this.mChartTouchListener.d(null);
        } else {
            this.mChartTouchListener.d(r7cVar);
        }
    }

    public void setLogEnabled(boolean z) {
        this.mLogEnabled = z;
    }

    public void setMarker(ttc ttcVar) {
        this.mMarker = ttcVar;
    }

    @Deprecated
    public void setMarkerView(ttc ttcVar) {
        setMarker(ttcVar);
    }

    public void setMaxHighlightDistance(float f) {
        this.mMaxHighlightDistance = fmq.e(f);
    }

    public void setNoDataText(String str) {
        this.mNoDataText = str;
    }

    public void setNoDataTextAlignment(Paint.Align align) {
        this.mInfoPaint.setTextAlign(align);
    }

    public void setNoDataTextColor(int i) {
        this.mInfoPaint.setColor(i);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.mInfoPaint.setTypeface(typeface);
    }

    public void setOnChartGestureListener(com.github.mikephil.charting.listener.b bVar) {
    }

    public void setOnChartValueSelectedListener(u7h u7hVar) {
    }

    public void setOnTouchListener(ChartTouchListener chartTouchListener) {
        this.mChartTouchListener = chartTouchListener;
    }

    public void setPaint(Paint paint, int i) {
        if (i == 7) {
            this.mInfoPaint = paint;
        } else {
            if (i != 11) {
                return;
            }
            this.mDescPaint = paint;
        }
    }

    public void setRenderer(dn5 dn5Var) {
        if (dn5Var != null) {
            this.mRenderer = dn5Var;
        }
    }

    public void setTouchEnabled(boolean z) {
        this.mTouchEnabled = z;
    }

    public void setUnbindEnabled(boolean z) {
        this.mUnbind = z;
    }

    public void setupDefaultFormatter(float f, float f2) {
        T t = this.mData;
        this.mDefaultValueFormatter.b(fmq.i((t == null || t.m() < 2) ? Math.max(Math.abs(f), Math.abs(f2)) : Math.abs(f2 - f)));
    }

    public boolean valuesToHighlight() {
        r7c[] r7cVarArr = this.mIndicesToHighlight;
        return (r7cVarArr == null || r7cVarArr.length <= 0 || r7cVarArr[0] == null) ? false : true;
    }

    @RequiresApi(11)
    public void animateX(int i) {
        this.mAnimator.a(i);
    }

    @RequiresApi(11)
    public void animateXY(int i, int i2, ca7.c0 c0Var) {
        this.mAnimator.d(i, i2, c0Var);
    }

    @RequiresApi(11)
    public void animateY(int i) {
        this.mAnimator.f(i);
    }

    @RequiresApi(11)
    public void animateXY(int i, int i2) {
        this.mAnimator.c(i, i2);
    }

    public void highlightValue(r7c r7cVar, boolean z) {
        if (r7cVar == null) {
            this.mIndicesToHighlight = null;
        } else {
            if (this.mLogEnabled) {
                StringBuilder sb = new StringBuilder();
                sb.append("Highlighted: ");
                sb.append(r7cVar.toString());
            }
            if (this.mData.n(r7cVar) == null) {
                this.mIndicesToHighlight = null;
            } else {
                this.mIndicesToHighlight = new r7c[]{r7cVar};
            }
        }
        setLastHighlighted(this.mIndicesToHighlight);
        invalidate();
    }

    public void highlightValue(float f, int i, int i2) {
        highlightValue(f, i, i2, true);
    }

    public void highlightValue(float f, int i) {
        highlightValue(f, i, -1, true);
    }

    public void highlightValue(float f, float f2, int i, int i2) {
        highlightValue(f, f2, i, i2, true);
    }

    public void highlightValue(float f, float f2, int i) {
        highlightValue(f, f2, i, -1, true);
    }

    public void highlightValue(float f, int i, int i2, boolean z) {
        highlightValue(f, Float.NaN, i, i2, z);
    }

    public void highlightValue(float f, int i, boolean z) {
        highlightValue(f, Float.NaN, i, -1, z);
    }

    public Chart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLogEnabled = false;
        this.mData = null;
        this.mHighLightPerTapEnabled = true;
        this.mDragDecelerationEnabled = true;
        this.mDragDecelerationFrictionCoef = 0.9f;
        this.mDefaultValueFormatter = new wx5(0);
        this.mTouchEnabled = true;
        this.mNoDataText = "No chart data available.";
        this.mViewPortHandler = new hwq();
        this.mExtraTopOffset = 0.0f;
        this.mExtraRightOffset = 0.0f;
        this.mExtraBottomOffset = 0.0f;
        this.mExtraLeftOffset = 0.0f;
        this.mOffsetsCalculated = false;
        this.mMaxHighlightDistance = 0.0f;
        this.mDrawMarkers = true;
        this.mJobs = new ArrayList<>();
        this.mUnbind = false;
        init();
    }

    public void highlightValue(float f, float f2, int i, int i2, boolean z) {
        if (i >= 0 && i < this.mData.j()) {
            highlightValue(new r7c(f, f2, i, i2), z);
        } else {
            highlightValue((r7c) null, z);
        }
    }

    public void highlightValue(float f, float f2, int i, boolean z) {
        highlightValue(f, f2, i, -1, z);
    }

    public boolean saveToGallery(String str, int i) {
        return saveToGallery(str, "", "MPAndroidChart-Library Save", Bitmap.CompressFormat.PNG, i);
    }

    public boolean saveToGallery(String str) {
        return saveToGallery(str, "", "MPAndroidChart-Library Save", Bitmap.CompressFormat.PNG, 40);
    }

    public Chart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mLogEnabled = false;
        this.mData = null;
        this.mHighLightPerTapEnabled = true;
        this.mDragDecelerationEnabled = true;
        this.mDragDecelerationFrictionCoef = 0.9f;
        this.mDefaultValueFormatter = new wx5(0);
        this.mTouchEnabled = true;
        this.mNoDataText = "No chart data available.";
        this.mViewPortHandler = new hwq();
        this.mExtraTopOffset = 0.0f;
        this.mExtraRightOffset = 0.0f;
        this.mExtraBottomOffset = 0.0f;
        this.mExtraLeftOffset = 0.0f;
        this.mOffsetsCalculated = false;
        this.mMaxHighlightDistance = 0.0f;
        this.mDrawMarkers = true;
        this.mJobs = new ArrayList<>();
        this.mUnbind = false;
        init();
    }
}
