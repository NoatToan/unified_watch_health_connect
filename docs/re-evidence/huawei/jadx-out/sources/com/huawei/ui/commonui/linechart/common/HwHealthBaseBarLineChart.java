package com.huawei.ui.commonui.linechart.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.hwcommonmodel.accessibility.ChartTouchHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.linechart.anchor.Layout;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData;
import com.huawei.ui.commonui.linechart.common.touch.HwHealthBarLineChartTouchListener;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthDatasContainer;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.lrd;
import defpackage.lrm;
import defpackage.njy;
import defpackage.qln;
import defpackage.qmh;
import defpackage.qmi;
import defpackage.qmm;
import defpackage.qmn;
import defpackage.qmt;
import defpackage.qnp;
import defpackage.qob;
import defpackage.qqn;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public abstract class HwHealthBaseBarLineChart<T extends HwHealthBaseBarLineData<? extends IHwHealthBarLineDataSet<? extends Entry>>> extends BarLineChartBase<T> {
    public static final int DEFAULT_MAXIMUM_SCALE = 4;
    public static final int GLOBAL_POINT_AXIS_PADDING = 26;
    public static final int GLOBAL_POINT_RADIUS = 2;
    private static final float HALF = 2.0f;
    public static final int MARKER_VIEW_CENTER_HORIZONTAL = -1;
    protected static final d MARKER_VIEW_POSITION_UNSET = null;
    public static final int MAX_NUMBER_OF_DATA_SETS = 3;
    private static final String TAG = "HealthChart_HwHealthBarLineChartBase";
    private String mAccessibilityDescription;
    private final e mAccessibilityListerner;
    protected HwHealthYAxis mAxisFirstParty;
    private float mAxisMinWidthPxY;
    protected qmm mAxisRendererFirstParty;
    protected qmm mAxisRendererSecondParty;
    protected qmm mAxisRendererThirdParty;
    protected HwHealthYAxis mAxisSecondParty;
    protected HwHealthYAxis mAxisThirdParty;
    private WeakReference<Bitmap> mBitmapViewDraw;
    protected Canvas mBitmapViewDrawCanvas;
    protected qln mChartAnchor;
    private GradientDrawable mChartBackground;
    private View mExternalTopView;
    protected qmi mFirstAxisDataRendererArg;
    protected HwHealthTransformer mFirstAxisTransformer;
    private int mGlobalPointColor;
    private ChartTouchHelper mHelper;
    protected List<HwHealthDataContainerGenerator> mHwHealthDataContainerGenerators;
    private boolean mIsGlobalPoint;
    private boolean mIsMarkerViewCenteredWhenEmpty;
    protected boolean mIsMarkerViewEnable;
    private boolean mIsMarkerViewProcessEnable;
    private boolean mIsSizeChanged;
    protected Layout mLayout;
    private Rect mLoadDrawableDrawRect;
    protected d mMarkerViewPosition;
    private float mMarkerViewProcessPositionPx;
    protected MarkerViewSlidingMode mMarkerViewSlidingMode;
    private Canvas mOuterShowCanvas;
    private Object mParseTool;
    private HealthProgressBar mProgressBar;
    private qmt mRingAnimationMgr;
    protected qmi mSecondAxisDataRendererArg;
    protected HwHealthTransformer mSecondAxisTransformer;
    protected qmi mThirdAxisDataRendererArg;
    protected HwHealthTransformer mThirdPartyAxisTransformer;
    private int progressbarBottom;
    private int progressbarLeft;
    private int progressbarRight;
    private int progressbarTop;

    public interface HwHealthDataContainerGenerator {
        IHwHealthDatasContainer newDataContainer();

        boolean typeOf(Class cls);
    }

    public enum MarkerViewSlidingMode {
        ACCORDING_PIXEL,
        ACCORDING_DATA,
        FORCE_ACCORDING_DATA
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public float getExtraBottomOffset() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public float getExtraLeftOffset() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public float getExtraRightOffset() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public float getExtraTopOffset() {
        return 0.0f;
    }

    public int getMonthDaysOfMinTime() {
        return 0;
    }

    protected boolean isDrawYaxisLabelsOnHighLight() {
        return false;
    }

    public abstract void refresh();

    public HwHealthBaseBarLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFirstAxisDataRendererArg = new qmi();
        this.mSecondAxisDataRendererArg = new qmi();
        this.mThirdAxisDataRendererArg = new qmi();
        this.mMarkerViewPosition = MARKER_VIEW_POSITION_UNSET;
        this.mMarkerViewSlidingMode = MarkerViewSlidingMode.ACCORDING_PIXEL;
        this.mIsMarkerViewEnable = false;
        this.mIsMarkerViewProcessEnable = false;
        this.mMarkerViewProcessPositionPx = 0.0f;
        this.mLoadDrawableDrawRect = new Rect();
        this.mAxisMinWidthPxY = Utils.convertDpToPixel(16.0f);
        this.mBitmapViewDraw = null;
        this.mOuterShowCanvas = null;
        this.progressbarLeft = 0;
        this.progressbarTop = 0;
        this.progressbarRight = 0;
        this.progressbarBottom = 0;
        this.mIsGlobalPoint = false;
        this.mIsMarkerViewCenteredWhenEmpty = true;
        this.mIsSizeChanged = false;
        this.mAccessibilityListerner = new e(this);
        initLayout(context, attributeSet, i);
    }

    public HwHealthBaseBarLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFirstAxisDataRendererArg = new qmi();
        this.mSecondAxisDataRendererArg = new qmi();
        this.mThirdAxisDataRendererArg = new qmi();
        this.mMarkerViewPosition = MARKER_VIEW_POSITION_UNSET;
        this.mMarkerViewSlidingMode = MarkerViewSlidingMode.ACCORDING_PIXEL;
        this.mIsMarkerViewEnable = false;
        this.mIsMarkerViewProcessEnable = false;
        this.mMarkerViewProcessPositionPx = 0.0f;
        this.mLoadDrawableDrawRect = new Rect();
        this.mAxisMinWidthPxY = Utils.convertDpToPixel(16.0f);
        this.mBitmapViewDraw = null;
        this.mOuterShowCanvas = null;
        this.progressbarLeft = 0;
        this.progressbarTop = 0;
        this.progressbarRight = 0;
        this.progressbarBottom = 0;
        this.mIsGlobalPoint = false;
        this.mIsMarkerViewCenteredWhenEmpty = true;
        this.mIsSizeChanged = false;
        this.mAccessibilityListerner = new e(this);
        initLayout(context, attributeSet, 0);
    }

    public HwHealthBaseBarLineChart(Context context) {
        super(context);
        this.mFirstAxisDataRendererArg = new qmi();
        this.mSecondAxisDataRendererArg = new qmi();
        this.mThirdAxisDataRendererArg = new qmi();
        this.mMarkerViewPosition = MARKER_VIEW_POSITION_UNSET;
        this.mMarkerViewSlidingMode = MarkerViewSlidingMode.ACCORDING_PIXEL;
        this.mIsMarkerViewEnable = false;
        this.mIsMarkerViewProcessEnable = false;
        this.mMarkerViewProcessPositionPx = 0.0f;
        this.mLoadDrawableDrawRect = new Rect();
        this.mAxisMinWidthPxY = Utils.convertDpToPixel(16.0f);
        this.mBitmapViewDraw = null;
        this.mOuterShowCanvas = null;
        this.progressbarLeft = 0;
        this.progressbarTop = 0;
        this.progressbarRight = 0;
        this.progressbarBottom = 0;
        this.mIsGlobalPoint = false;
        this.mIsMarkerViewCenteredWhenEmpty = true;
        this.mIsSizeChanged = false;
        this.mAccessibilityListerner = new e(this);
        initLayout(context, null, 0);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        initData();
        Context context = getContext();
        setAxisLabel(context);
        injectDataContainer(new HwHealthDataContainerGenerator() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart.2
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart.HwHealthDataContainerGenerator
            public boolean typeOf(Class cls) {
                Class<qob> superclass = qob.class;
                while (true) {
                    if (superclass == null) {
                        return false;
                    }
                    if (superclass.equals(cls)) {
                        return true;
                    }
                    for (Class<?> cls2 : superclass.getInterfaces()) {
                        if (cls2.equals(cls)) {
                            return true;
                        }
                    }
                    superclass = superclass.getSuperclass();
                }
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart.HwHealthDataContainerGenerator
            public IHwHealthDatasContainer newDataContainer() {
                return new qob(HwHealthBaseBarLineChart.this);
            }
        });
        getXAxis().setSpaceMin(0.5f);
        getXAxis().setSpaceMax(0.5f);
        HwHealthMarkerView hwHealthMarkerView = new HwHealthMarkerView(context, R.layout.custom_marker_view, this);
        hwHealthMarkerView.setChartView(this);
        setMarker(hwHealthMarkerView);
        matchEmuiStyle();
        setAxisTextSize(context, context.getResources().getDisplayMetrics().density);
        setYAxisMinWidth(16.0f);
        setBackgroundColor(0);
        fillChartBackground(0, 0);
        this.mLegend.setYOffset(0.0f);
        this.mLegend.setTextColor(qqn.d(R.color.textColorSecondary));
        if (this.mProgressBar == null) {
            HealthProgressBar healthProgressBar = new HealthProgressBar(context);
            this.mProgressBar = healthProgressBar;
            healthProgressBar.setVisibility(8);
            addView(this.mProgressBar);
        }
        this.mRingAnimationMgr = new qmt(this);
        this.mDescription.setTextSize(10.0f);
    }

    private void matchEmuiStyle() {
        setDrawBorders(false);
        getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        getLegend().setEnabled(false);
        getDescription().setEnabled(false);
        enableSpacePreserveForDataOverlay(false);
    }

    public d getMarkerViewPosition() {
        return this.mMarkerViewPosition;
    }

    public void setMarkerViewPosition(d dVar) {
        this.mMarkerViewPosition = dVar;
    }

    private void setAxisLabel(Context context) {
        this.mFirstAxisTransformer = new HwHealthTransformer(context, this.mViewPortHandler);
        this.mSecondAxisTransformer = new HwHealthTransformer(context, this.mViewPortHandler);
        this.mThirdPartyAxisTransformer = new HwHealthTransformer(context, this.mViewPortHandler);
        this.mXAxisRenderer = new HwHealthXAxisRenderer(context, this, this.mViewPortHandler, this.mXAxis, this.mFirstAxisTransformer);
        this.mAxisRendererFirstParty = new qmm(context, this.mViewPortHandler, this.mAxisFirstParty, this.mFirstAxisTransformer, this);
        this.mAxisRendererSecondParty = new qmm(context, this.mViewPortHandler, this.mAxisSecondParty, this.mSecondAxisTransformer, this);
        this.mAxisRendererThirdParty = new qmm(context, this.mViewPortHandler, this.mAxisThirdParty, this.mThirdPartyAxisTransformer, this);
        this.mAxisThirdParty.setDrawGridLines(false);
        this.mAxisThirdParty.setDrawLabels(false);
        this.mAxisThirdParty.setEnabled(false);
        this.mHwHealthDataContainerGenerators = new ArrayList();
    }

    private void setAxisTextSize(Context context, float f) {
        Typeface typefaceCreate = Typeface.create(context.getResources().getString(R.string.textFontFamilyRegular), 0);
        getXAxis().setTextColor(context.getResources().getColor(R.color.textColorSecondary));
        getXAxis().setTypeface(typefaceCreate);
        if (f != 0.0f) {
            getXAxis().setTextSize(context.getResources().getDimension(R.dimen.textSizeCaption) / f);
        }
        this.mAxisFirstParty.setTextColor(context.getResources().getColor(R.color.textColorSecondary));
        this.mAxisFirstParty.setTypeface(typefaceCreate);
        if (f != 0.0f) {
            this.mAxisFirstParty.setTextSize(context.getResources().getDimension(R.dimen.textSizeCaption) / f);
        }
        this.mAxisSecondParty.setTextColor(context.getResources().getColor(R.color.textColorSecondary));
        this.mAxisSecondParty.setTypeface(typefaceCreate);
        if (f != 0.0f) {
            this.mAxisSecondParty.setTextSize(context.getResources().getDimension(R.dimen.textSizeCaption) / f);
        }
        this.mAxisThirdParty.setTextColor(context.getResources().getColor(R.color.textColorSecondary));
        this.mAxisThirdParty.setTypeface(typefaceCreate);
        if (f != 0.0f) {
            this.mAxisThirdParty.setTextSize(context.getResources().getDimension(R.dimen.textSizeCaption) / f);
        }
    }

    private void initData() {
        this.mXAxis = new qmn();
        this.mXAxis.setDrawAxisLine(false);
        this.mAxisLeft = null;
        this.mAxisRight = null;
        this.mLeftAxisTransformer = null;
        this.mRightAxisTransformer = null;
        this.mAxisRendererLeft = null;
        this.mAxisRendererRight = null;
        this.mAxisFirstParty = new HwHealthYAxis(this, HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        this.mAxisSecondParty = new HwHealthYAxis(this, HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY);
        this.mAxisThirdParty = new HwHealthYAxis(this, HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY);
        this.mViewPortHandler = new HwHealthViewPortHandler(getContext());
        this.mChartTouchListener = new HwHealthBarLineChartTouchListener(this, this.mViewPortHandler);
    }

    private void initLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ChartLayoutStyleDef, i, R.style.DefaultChartLayoutStyle);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.ChartLayoutStyleDef_TopWhiteSpaceHeight, 2.4f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R.styleable.ChartLayoutStyleDef_ExtraTopForYLableOffset, 13.5f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R.styleable.ChartLayoutStyleDef_XAxisPaddingWhiteOffset, 40.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(R.styleable.ChartLayoutStyleDef_XAxisTextAreaHeight, 16.0f);
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(R.styleable.ChartLayoutStyleDef_MarkerViewPathwayHeight, 24.0f);
        float dimension6 = typedArrayObtainStyledAttributes.getDimension(R.styleable.ChartLayoutStyleDef_GridLinePaddingLeft, 16.0f);
        float fIntValue = ((Integer) BaseActivity.getSafeRegionWidth().first).intValue();
        float dimension7 = typedArrayObtainStyledAttributes.getDimension(R.styleable.ChartLayoutStyleDef_GridLinePaddingRight, 16.0f);
        float fIntValue2 = ((Integer) BaseActivity.getSafeRegionWidth().second).intValue();
        float dimension8 = typedArrayObtainStyledAttributes.getDimension(R.styleable.ChartLayoutStyleDef_LegendHeight, 0.0f);
        float dimension9 = typedArrayObtainStyledAttributes.getDimension(R.styleable.ChartLayoutStyleDef_XAxisOutsideTextAreaTopOffset, 0.0f);
        float dimension10 = typedArrayObtainStyledAttributes.getDimension(R.styleable.ChartLayoutStyleDef_XAxisOutsideTextAreaHeight, 0.0f);
        float dimension11 = typedArrayObtainStyledAttributes.getDimension(R.styleable.ChartLayoutStyleDef_XAxisOutsideTextAreaBottomOffset, 0.0f);
        float dimension12 = typedArrayObtainStyledAttributes.getDimension(R.styleable.ChartLayoutStyleDef_XAxisDescriptionAreaHeight, 0.0f);
        float dimension13 = typedArrayObtainStyledAttributes.getDimension(R.styleable.ChartLayoutStyleDef_XAxisDescMarginTopWithContent, 0.0f);
        float dimension14 = typedArrayObtainStyledAttributes.getDimension(R.styleable.ChartLayoutStyleDef_XAxisTextFloatingPathWay, 2.5f);
        Layout layout = new Layout(getContext());
        this.mLayout = layout;
        layout.j(dimension).c(dimension2).m(dimension3).l(dimension4).e(dimension5).b(dimension6 + fIntValue, dimension7 + fIntValue2).d(dimension8).k(dimension9).n(dimension10).o(dimension11).f(dimension13).g(dimension12).r(dimension14);
        initLayoutYAxis(typedArrayObtainStyledAttributes);
        initLayoutPadding();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initLayoutYAxis(TypedArray typedArray) {
        float dimension = typedArray.getDimension(R.styleable.ChartLayoutStyleDef_FirstYAxisBoardingPadding, 16.0f);
        float fIntValue = ((Integer) BaseActivity.getSafeRegionWidth().first).intValue();
        float dimension2 = typedArray.getDimension(R.styleable.ChartLayoutStyleDef_FirstYAxisWidth, 24.0f);
        this.mLayout.a(dimension + fIntValue).b(dimension2).i(typedArray.getDimension(R.styleable.ChartLayoutStyleDef_SecondYAxisWidth, 40.0f)).h(typedArray.getDimension(R.styleable.ChartLayoutStyleDef_SecondYAxisBoardingPadding, 0.0f));
    }

    private void initLayoutPadding() {
        this.mLayout.c(getPaddingLeft()).e(getPaddingRight()).a(getPaddingTop()).b(getPaddingBottom());
    }

    public void customLayout(Layout layout) {
        this.mLayout = layout;
        this.mChartAnchor = layout.e(getWidth(), getHeight(), 128.0f);
    }

    public qmi getAxisDataRenderArg(HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependency) {
        if (hwHealthAxisDependency == HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY) {
            return this.mFirstAxisDataRendererArg;
        }
        if (hwHealthAxisDependency == HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY) {
            return this.mSecondAxisDataRendererArg;
        }
        return this.mThirdAxisDataRendererArg;
    }

    public void setAxisDataRenderArg(HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependency, qmi qmiVar) {
        if (hwHealthAxisDependency == HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY) {
            this.mFirstAxisDataRendererArg.e(qmiVar);
        } else if (hwHealthAxisDependency == HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY) {
            this.mSecondAxisDataRendererArg.e(qmiVar);
        } else {
            this.mThirdAxisDataRendererArg.e(qmiVar);
        }
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mTouchEnabled) {
            return this.mChartTouchListener.onTouch(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void enableSpacePreserveForDataOverlay(boolean z) {
        qnp.a(this, z);
    }

    public HwHealthYAxis getAxisFirstParty() {
        return this.mAxisFirstParty;
    }

    public HwHealthYAxis getAxisSecondParty() {
        return this.mAxisSecondParty;
    }

    public HwHealthYAxis getAxisThirdParty() {
        return this.mAxisThirdParty;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == 0) {
            if (this.mLogEnabled) {
                LogUtil.j(TAG, "Preparing... DATA NOT SET.");
                return;
            }
            return;
        }
        if (this.mLogEnabled) {
            LogUtil.a(TAG, "Preparing...");
        }
        if (this.mRenderer != null) {
            this.mRenderer.initBuffers();
        }
        calcMinMax();
        this.mAxisRendererFirstParty.computeAxis(this.mAxisFirstParty.mAxisMinimum, this.mAxisFirstParty.mAxisMaximum, this.mAxisFirstParty.isInverted());
        this.mAxisRendererSecondParty.computeAxis(this.mAxisSecondParty.mAxisMinimum, this.mAxisSecondParty.mAxisMaximum, this.mAxisSecondParty.isInverted());
        this.mAxisRendererThirdParty.computeAxis(this.mAxisThirdParty.mAxisMinimum, this.mAxisThirdParty.mAxisMaximum, this.mAxisThirdParty.isInverted());
        this.mXAxisRenderer.computeAxis(this.mXAxis.mAxisMinimum, this.mXAxis.mAxisMaximum, false);
        if (this.mLegend != null) {
            this.mLegendRenderer.computeLegend(this.mData);
        }
        calculateOffsets();
        ((HwHealthBaseBarLineData) this.mData).notifyDataChanged();
    }

    public void makeReverse(boolean z) {
        this.mLayout.d(z);
        this.mAxisRendererFirstParty.c(z);
        this.mAxisRendererSecondParty.c(z);
        this.mAxisRendererThirdParty.c(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0043  */
    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        boolean z;
        this.mChartAnchor = this.mLayout.e(getWidth(), getHeight(), 128.0f);
        float[] fArr = {0.0f, 0.0f};
        float[] fArr2 = {0.0f, 0.0f};
        if (this.mIsSizeChanged) {
            this.mViewPortHandler.getMatrixTouch().mapPoints(fArr);
            this.mFirstAxisTransformer.pixelsToValue(fArr);
            this.mFirstAxisTransformer.pixelsToValue(fArr2);
            if (Float.compare(fArr[0], fArr2[0]) == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        this.mViewPortHandler.restrainViewPort(this.mChartAnchor.a(), this.mChartAnchor.j(), this.mChartAnchor.b(), this.mChartAnchor.c());
        prepareOffsetMatrix();
        prepareValuePxMatrix();
        if (this.mIsSizeChanged) {
            this.mIsSizeChanged = false;
            if (!z) {
                updateMarkViewValue();
                return;
            }
            if (this.mViewPortHandler instanceof HwHealthViewPortHandler) {
                ((HwHealthViewPortHandler) this.mViewPortHandler).c(new Matrix());
            }
            this.mFirstAxisTransformer.pointValuesToPixel(fArr2);
            this.mFirstAxisTransformer.pointValuesToPixel(fArr);
            float f = fArr[0] - fArr2[0];
            if (Float.isInfinite(f) || Float.isNaN(f)) {
                return;
            }
            Matrix matrix = new Matrix();
            matrix.postTranslate(f, 0.0f);
            if (this.mViewPortHandler instanceof HwHealthViewPortHandler) {
                ((HwHealthViewPortHandler) this.mViewPortHandler).c(matrix);
            }
            updateMarkViewValue();
        }
    }

    private void updateMarkViewValue() {
        d dVar = this.mMarkerViewPosition;
        if (dVar == MARKER_VIEW_POSITION_UNSET || dVar.d <= 0.0f) {
            return;
        }
        highlightValue(this.mMarkerViewPosition.d, false);
    }

    public void setYAxisMinWidth(float f) {
        this.mAxisMinWidthPxY = Utils.convertDpToPixel(f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void prepareOffsetMatrix() {
        this.mSecondAxisTransformer.prepareMatrixOffset(this.mAxisSecondParty.isInverted());
        this.mFirstAxisTransformer.prepareMatrixOffset(this.mAxisFirstParty.isInverted());
        this.mThirdPartyAxisTransformer.prepareMatrixOffset(this.mAxisThirdParty.isInverted());
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void prepareValuePxMatrix() {
        this.mFirstAxisTransformer.prepareMatrixValuePx(this.mXAxis.mAxisMinimum, this.mXAxis.mAxisRange, this.mAxisFirstParty.mAxisRange, this.mAxisFirstParty.mAxisMinimum);
        this.mSecondAxisTransformer.prepareMatrixValuePx(this.mXAxis.mAxisMinimum, this.mXAxis.mAxisRange, this.mAxisSecondParty.mAxisRange, this.mAxisSecondParty.mAxisMinimum);
        this.mThirdPartyAxisTransformer.prepareMatrixValuePx(this.mXAxis.mAxisMinimum, this.mXAxis.mAxisRange, this.mAxisThirdParty.mAxisRange, this.mAxisThirdParty.mAxisMinimum);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        this.mOuterShowCanvas = canvas;
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.mBitmapViewDraw;
        Bitmap bitmapCreateBitmap = weakReference != null ? weakReference.get() : null;
        if (bitmapCreateBitmap == null || !checkBitmapValidate(bitmapCreateBitmap, chartWidth, chartHeight)) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(chartWidth, chartHeight, Bitmap.Config.ARGB_8888);
                this.mBitmapViewDraw = new WeakReference<>(bitmapCreateBitmap);
                this.mBitmapViewDrawCanvas = new Canvas(bitmapCreateBitmap);
            } catch (OutOfMemoryError unused) {
                LogUtil.e(TAG, "create bitmap failed!");
                return;
            }
        }
        if (bitmapCreateBitmap == null) {
            return;
        }
        bitmapCreateBitmap.eraseColor(0);
        preOnDraw(this.mBitmapViewDrawCanvas);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, new Paint());
    }

    private boolean checkBitmapValidate(Bitmap bitmap, int i, int i2) {
        return bitmap != null && bitmap.getWidth() == i && bitmap.getHeight() == i2;
    }

    private void preOnDraw(Canvas canvas) {
        d dVar;
        if (this.mData == 0) {
            return;
        }
        int iCalClipRestoreCount = calClipRestoreCount(canvas, canvas.save());
        clipDataArea(canvas);
        this.mRenderer.drawData(canvas);
        if (!this.mIsMarkerViewProcessEnable && (dVar = this.mMarkerViewPosition) != MARKER_VIEW_POSITION_UNSET) {
            if (!dVar.f23618a) {
                highlightValuePx(correctScrollMoveXValueToContentArea(this.mMarkerViewPosition.f23619b), false);
            } else if (Math.abs(this.mMarkerViewPosition.d + 1.0f) < 0.001f) {
                highlightValuePx(getWidth() / 2.0f, false);
            }
        }
        canvas.restoreToCount(iCalClipRestoreCount);
        int iSave = canvas.save();
        this.mRenderer.drawExtras(canvas);
        canvas.restoreToCount(iSave);
        if (!(this.mXAxisRenderer instanceof HwHealthXAxisRenderer)) {
            LogUtil.j(TAG, "mXAxisRenderer not instanceof HwHealthXAxisRenderer");
            return;
        }
        if (!this.mIsMarkerViewProcessEnable) {
            if (this.mMarkerViewPosition != MARKER_VIEW_POSITION_UNSET) {
                ((HwHealthXAxisRenderer) this.mXAxisRenderer).b(this.mMarkerViewPosition.f23619b);
            }
        } else if (this.mMarkerViewPosition != MARKER_VIEW_POSITION_UNSET) {
            ((HwHealthXAxisRenderer) this.mXAxisRenderer).b(this.mMarkerViewProcessPositionPx);
        }
        int clipRestoreCount = getClipRestoreCount(canvas, canvas.save());
        clipDataArea(canvas);
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
            if (isDrawYaxisLabelsOnHighLight()) {
                this.mAxisRendererFirstParty.renderAxisLabels(canvas);
                this.mAxisRendererSecondParty.renderAxisLabels(canvas);
                this.mAxisRendererThirdParty.renderAxisLabels(canvas);
            }
        }
        canvas.restoreToCount(clipRestoreCount);
    }

    protected void clipDataArea(Canvas canvas) {
        RectF rectF = new RectF(this.mViewPortHandler.getContentRect());
        rectF.bottom += this.mXAxis.getYOffset();
        canvas.clipRect(rectF);
    }

    protected float correctScrollMoveXValueToContentArea(float f) {
        if (this.mIsGlobalPoint) {
            return f;
        }
        if (f > this.mViewPortHandler.contentRight()) {
            return this.mViewPortHandler.contentRight();
        }
        return f < this.mViewPortHandler.contentLeft() ? this.mViewPortHandler.contentLeft() : f;
    }

    private int calClipRestoreCount(Canvas canvas, int i) {
        drawGridBackground(canvas);
        canvas.restoreToCount(i);
        int iSave = canvas.save();
        autoScale();
        computeAxis();
        drawChartBackground(canvas);
        canvas.restoreToCount(iSave);
        this.mAxisRendererFirstParty.e();
        correctRingAnimationStatus();
        renderExternalTopView();
        if (this.mProgressBar.getVisibility() == 0) {
            drawDataLoadingTips(canvas);
        }
        int iSave2 = canvas.save();
        setRenderAxisLine(canvas);
        canvas.restoreToCount(iSave2);
        return canvas.save();
    }

    private int getClipRestoreCount(Canvas canvas, int i) {
        this.mXAxisRenderer.renderAxisLabels(canvas);
        this.mAxisRendererFirstParty.renderAxisLabels(canvas);
        this.mAxisRendererSecondParty.renderAxisLabels(canvas);
        this.mAxisRendererThirdParty.renderAxisLabels(canvas);
        canvas.restoreToCount(i);
        int iSave = canvas.save();
        this.mRenderer.drawValues(canvas);
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        this.mLegendRenderer.renderLegend(canvas);
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        drawDescription(canvas);
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        drawMarkers(canvas);
        canvas.restoreToCount(iSave4);
        return canvas.save();
    }

    private void setRenderAxisLine(Canvas canvas) {
        this.mXAxisRenderer.renderAxisLine(canvas);
        this.mAxisRendererFirstParty.renderAxisLine(canvas);
        this.mAxisRendererSecondParty.renderAxisLine(canvas);
        this.mAxisRendererThirdParty.renderAxisLine(canvas);
        this.mXAxisRenderer.renderGridLines(canvas);
        this.mAxisRendererFirstParty.renderGridLines(canvas);
        this.mAxisRendererSecondParty.renderGridLines(canvas);
        this.mAxisRendererThirdParty.renderGridLines(canvas);
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLimitLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderLimitLines(canvas);
        }
        if (this.mAxisFirstParty.isEnabled() && this.mAxisFirstParty.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererFirstParty.renderLimitLines(canvas);
        }
        if (this.mAxisSecondParty.isEnabled() && this.mAxisSecondParty.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererSecondParty.renderLimitLines(canvas);
        }
        if (this.mAxisThirdParty.isEnabled() && this.mAxisThirdParty.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererThirdParty.renderLimitLines(canvas);
        }
    }

    private void drawDataLoadingTips(Canvas canvas) {
        HwHealthYAxis hwHealthYAxis = this.mAxisFirstParty;
        if (hwHealthYAxis == null || hwHealthYAxis.mEntryCount != 5) {
            return;
        }
        Paint paint = new Paint();
        paint.setColor(qqn.b(getContext(), R.color.textColorSecondary));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(TypedValue.applyDimension(1, 13.0f, getContext().getResources().getDisplayMetrics()));
        String string = getContext().getResources().getString(R.string.IDS_getting_file);
        float fContentWidth = (this.mViewPortHandler.contentWidth() - this.mLoadDrawableDrawRect.width()) - Utils.convertDpToPixel(8.0f);
        if (paint.measureText(string) > fContentWidth) {
            string = string.substring(0, paint.breakText(string, true, fContentWidth, null) - 3) + "...";
        }
        float[] fArr = {0.0f, computeTipsCenterHeightPx()};
        this.mFirstAxisTransformer.pointValuesToPixel(fArr);
        float f = fArr[1];
        float fConvertDpToPixel = Utils.convertDpToPixel(24.0f);
        float fConvertDpToPixel2 = Utils.convertDpToPixel(24.0f);
        float fContentLeft = this.mViewPortHandler.contentLeft() + ((this.mViewPortHandler.contentWidth() - ((Utils.convertDpToPixel(8.0f) + fConvertDpToPixel) + paint.measureText(string))) / 2.0f);
        this.progressbarLeft = (int) fContentLeft;
        float f2 = fConvertDpToPixel2 / 2.0f;
        this.progressbarTop = (int) (f - f2);
        float f3 = fContentLeft + fConvertDpToPixel;
        this.progressbarRight = (int) f3;
        this.progressbarBottom = (int) (f2 + f);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        canvas.drawText(string, (int) (f3 + Utils.convertDpToPixel(8.0f) + (paint.measureText(string) / 2.0f)), (int) ((f - ((fontMetrics.bottom - fontMetrics.top) / 2.0f)) - fontMetrics.top), paint);
    }

    public float computeTipsCenterHeightPx() {
        float f;
        float f2;
        if (!isUpSideDown(this.mFirstAxisTransformer)) {
            f = this.mAxisFirstParty.mEntries[3];
            f2 = this.mAxisFirstParty.mEntries[2];
        } else {
            f = this.mAxisFirstParty.mEntries[1];
            f2 = this.mAxisFirstParty.mEntries[2];
        }
        return (f + f2) / 2.0f;
    }

    private boolean isUpSideDown(Transformer transformer) {
        float[] fArr = {0.0f, this.mViewPortHandler.contentTop()};
        float[] fArr2 = {0.0f, this.mViewPortHandler.contentBottom()};
        transformer.pixelsToValue(fArr);
        transformer.pixelsToValue(fArr2);
        return fArr2[1] > fArr[1];
    }

    private void renderExternalTopView() {
        if (this.mExternalTopView == null) {
            return;
        }
        if (this.mProgressBar.getVisibility() == 0 && this.mExternalTopView.getVisibility() == 0) {
            this.mExternalTopView.setVisibility(4);
        } else {
            if (this.mProgressBar.getVisibility() == 0 || this.mExternalTopView.getVisibility() != 4) {
                return;
            }
            this.mExternalTopView.setVisibility(0);
        }
    }

    protected void utilComputeAxis() {
        if (this.mAxisFirstParty.isEnabled()) {
            this.mAxisRendererFirstParty.computeAxis(this.mAxisFirstParty.mAxisMinimum, this.mAxisFirstParty.mAxisMaximum, this.mAxisFirstParty.isInverted());
        }
        if (this.mAxisSecondParty.isEnabled()) {
            this.mAxisRendererSecondParty.computeAxis(this.mAxisSecondParty.mAxisMinimum, this.mAxisSecondParty.mAxisMaximum, this.mAxisSecondParty.isInverted());
        }
        if (this.mAxisThirdParty.isEnabled()) {
            this.mAxisRendererThirdParty.computeAxis(this.mAxisThirdParty.mAxisMinimum, this.mAxisThirdParty.mAxisMaximum, this.mAxisThirdParty.isInverted());
        }
    }

    protected void computeAxis() {
        utilComputeAxis();
        if (this.mXAxis.isEnabled()) {
            this.mXAxisRenderer.computeAxis(this.mXAxis.mAxisMinimum, this.mXAxis.mAxisMaximum, qmh.e(getContext()));
        }
    }

    private void drawChartBackground(Canvas canvas) {
        GradientDrawable gradientDrawable = this.mChartBackground;
        if (gradientDrawable == null) {
            return;
        }
        gradientDrawable.setBounds(0, 0, (int) this.mViewPortHandler.getChartWidth(), (int) (this.mViewPortHandler.contentBottom() + this.mXAxis.getYOffset()));
        this.mChartBackground.draw(canvas);
    }

    public void highlightDefValue(int i, boolean z) {
        if (this.mMarkerViewPosition == MARKER_VIEW_POSITION_UNSET) {
            this.mMarkerViewPosition = new d(0.0f, 0.0f);
        }
        this.mMarkerViewPosition.f23618a = true;
        this.mMarkerViewPosition.d = i;
        if (z) {
            invalidate();
        }
    }

    public void highlightValue(float f, boolean z) {
        float[] fArr = {f, 0.0f};
        getTransformer(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY).pointValuesToPixel(fArr);
        if (this.mMarkerViewPosition == MARKER_VIEW_POSITION_UNSET) {
            this.mMarkerViewPosition = new d(0.0f, 0.0f);
        }
        this.mMarkerViewPosition.f23618a = false;
        this.mMarkerViewPosition.d = f;
        this.mMarkerViewPosition.f23619b = fArr[0];
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Highlight(this.mMarkerViewPosition.d, 0, -1));
        if (arrayList.size() != 0) {
            highlightValues((Highlight[]) arrayList.toArray(new Highlight[0]), z);
        }
    }

    public void highlightValuePx(float f, boolean z) {
        float[] fArr = {f, 0.0f};
        getTransformer(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY).pixelsToValue(fArr);
        if (this.mMarkerViewPosition == MARKER_VIEW_POSITION_UNSET) {
            this.mMarkerViewPosition = new d(0.0f, 0.0f);
        }
        this.mMarkerViewPosition.f23618a = false;
        if (MarkerViewSlidingMode.ACCORDING_DATA.equals(this.mMarkerViewSlidingMode) || MarkerViewSlidingMode.FORCE_ACCORDING_DATA.equals(this.mMarkerViewSlidingMode)) {
            fArr[0] = ((HwHealthBaseBarLineData) this.mData).getNearestValueForXValue(fArr[0], this, this.mMarkerViewSlidingMode);
        }
        this.mMarkerViewPosition.d = fArr[0];
        getTransformer(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY).pointValuesToPixel(fArr);
        this.mMarkerViewPosition.f23619b = fArr[0];
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Highlight(this.mMarkerViewPosition.d, 0, -1));
        if (arrayList.size() != 0) {
            highlightValues((Highlight[]) arrayList.toArray(new Highlight[0]), z);
        }
    }

    public void highlightValuePxCorrectByUnix(float f, boolean z) {
        boolean z2 = this instanceof HwHealthBaseScrollBarLineChart;
        HwHealthBaseScrollBarLineChart.ChartShowMode chartShowMode = HwHealthBaseScrollBarLineChart.ChartShowMode.SCROLL_MODE;
        if (z2) {
            HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart = (HwHealthBaseScrollBarLineChart) this;
            if (hwHealthBaseScrollBarLineChart.mChartShowMode == chartShowMode) {
                float[] fArr = {f, 0.0f};
                getTransformer(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY).pixelsToValue(fArr);
                float fAcquireRangeCenterValue = hwHealthBaseScrollBarLineChart.mScrollAdapter.acquireRangeCenterValue(correctXWithSafetyEdge((int) fArr[0]));
                float[] fArr2 = {fAcquireRangeCenterValue, 0.0f};
                getTransformer(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY).pointValuesToPixel(fArr2);
                if (this.mMarkerViewPosition == MARKER_VIEW_POSITION_UNSET) {
                    this.mMarkerViewPosition = new d(0.0f, 0.0f);
                }
                this.mMarkerViewPosition.f23618a = false;
                this.mMarkerViewPosition.d = fAcquireRangeCenterValue;
                this.mMarkerViewPosition.f23619b = fArr2[0];
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Highlight(this.mMarkerViewPosition.d, 0, -1));
                if (arrayList.size() != 0) {
                    highlightValues((Highlight[]) arrayList.toArray(new Highlight[0]), z);
                    return;
                }
                return;
            }
        }
        highlightValuePx(f, z);
    }

    private int correctXWithSafetyEdge(int i) {
        boolean z = this instanceof HwHealthBaseScrollBarLineChart;
        HwHealthBaseScrollBarLineChart.ChartShowMode chartShowMode = HwHealthBaseScrollBarLineChart.ChartShowMode.SCROLL_MODE;
        if (z) {
            HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart = (HwHealthBaseScrollBarLineChart) this;
            if (hwHealthBaseScrollBarLineChart.mChartShowMode == chartShowMode) {
                int iAcquireShowRangeMinimum = (int) hwHealthBaseScrollBarLineChart.acquireShowRangeMinimum();
                int iAcquireShowRangeMaximum = (int) hwHealthBaseScrollBarLineChart.acquireShowRangeMaximum();
                if (i <= iAcquireShowRangeMinimum) {
                    return iAcquireShowRangeMinimum + 1;
                }
                if (i >= iAcquireShowRangeMaximum) {
                    return iAcquireShowRangeMaximum - 1;
                }
            }
        }
        return i;
    }

    public Layout acquireLayout() {
        return this.mLayout;
    }

    public qln acquireChartAnchor() {
        return this.mChartAnchor;
    }

    public float resolveYAxisWidth(HwHealthYAxis hwHealthYAxis) {
        if (hwHealthYAxis == this.mAxisFirstParty) {
            return this.mLayout.e();
        }
        if (hwHealthYAxis == this.mAxisSecondParty) {
            return this.mLayout.a();
        }
        return Utils.convertDpToPixel(24.0f);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f23618a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f23619b;
        float d;

        d(float f, float f2) {
            this.d = f;
            this.f23619b = f2;
        }

        public float c() {
            return this.d;
        }

        public void e(float f) {
            this.d = f;
        }
    }

    public void highlightValues(Highlight[] highlightArr, boolean z) {
        if (highlightArr == null) {
            this.mIndicesToHighlight = null;
        } else {
            this.mIndicesToHighlight = (Highlight[]) highlightArr.clone();
        }
        setLastHighlighted(this.mIndicesToHighlight);
        if (z) {
            invalidate();
        }
    }

    public float fetchMarkViewXValPx() {
        d dVar = this.mMarkerViewPosition;
        if (dVar == MARKER_VIEW_POSITION_UNSET) {
            return 0.0f;
        }
        return dVar.f23619b;
    }

    public float fetchMarkViewMinuteValue() {
        d dVar = this.mMarkerViewPosition;
        if (dVar == MARKER_VIEW_POSITION_UNSET) {
            return 0.0f;
        }
        return dVar.d;
    }

    public boolean containsMarkViewShow() {
        return this.mMarkerViewPosition != MARKER_VIEW_POSITION_UNSET;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void calcMinMax() {
        this.mXAxis.calculate(((HwHealthBaseBarLineData) this.mData).getXMin(), ((HwHealthBaseBarLineData) this.mData).getXMax());
        this.mAxisFirstParty.calculate(((HwHealthBaseBarLineData) this.mData).getYMin(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY), ((HwHealthBaseBarLineData) this.mData).getYMax(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY));
        this.mAxisSecondParty.calculate(((HwHealthBaseBarLineData) this.mData).getYMin(HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY), ((HwHealthBaseBarLineData) this.mData).getYMax(HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY));
        this.mAxisThirdParty.calculate(((HwHealthBaseBarLineData) this.mData).getYMin(HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY), ((HwHealthBaseBarLineData) this.mData).getYMax(HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY));
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getLowestVisibleX() {
        if (!qmh.e(getContext())) {
            getTransformer(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY).getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.posForGetLowestVisibleX);
        } else {
            getTransformer(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY).getValuesByTouchPoint(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.posForGetLowestVisibleX);
        }
        return (float) Math.max(this.mXAxis.mAxisMinimum, this.posForGetLowestVisibleX.x);
    }

    public HwHealthTransformer getTransformer(HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependency) {
        if (hwHealthAxisDependency == HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY) {
            return this.mFirstAxisTransformer;
        }
        if (hwHealthAxisDependency == HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY) {
            return this.mSecondAxisTransformer;
        }
        return this.mThirdPartyAxisTransformer;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    @Deprecated
    public Transformer getTransformer(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            return this.mLeftAxisTransformer;
        }
        return this.mRightAxisTransformer;
    }

    public boolean isMarkViewCenteredWhenEmpty() {
        return this.mIsMarkerViewCenteredWhenEmpty;
    }

    public void setMarkViewCenteredWhenEmpty(boolean z) {
        this.mIsMarkerViewCenteredWhenEmpty = z;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getHighestVisibleX() {
        if (!qmh.e(getContext())) {
            getTransformer(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY).getValuesByTouchPoint(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.posForGetHighestVisibleX);
        } else {
            getTransformer(HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY).getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.posForGetHighestVisibleX);
        }
        return (float) Math.min(this.mXAxis.mAxisMaximum, this.posForGetHighestVisibleX.x);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void autoScale() {
        ((HwHealthBaseBarLineData) this.mData).calcMinMaxY(getLowestVisibleX(), getHighestVisibleX());
        this.mXAxis.calculate(((HwHealthBaseBarLineData) this.mData).getXMin(), ((HwHealthBaseBarLineData) this.mData).getXMax());
        if (this.mAxisFirstParty.isEnabled()) {
            this.mAxisFirstParty.calculate(((HwHealthBaseBarLineData) this.mData).getYMin(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY), ((HwHealthBaseBarLineData) this.mData).getYMax(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY));
        }
        if (this.mAxisSecondParty.isEnabled()) {
            this.mAxisSecondParty.calculate(((HwHealthBaseBarLineData) this.mData).getYMin(HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY), ((HwHealthBaseBarLineData) this.mData).getYMax(HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY));
        }
        if (this.mAxisThirdParty.isEnabled()) {
            this.mAxisThirdParty.calculate(((HwHealthBaseBarLineData) this.mData).getYMin(HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY), ((HwHealthBaseBarLineData) this.mData).getYMax(HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY));
        }
        calculateOffsets();
    }

    public HwHealthYAxis getAxis(HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependency) {
        if (hwHealthAxisDependency == HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY) {
            return this.mAxisFirstParty;
        }
        if (hwHealthAxisDependency == HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY) {
            return this.mAxisSecondParty;
        }
        return this.mAxisThirdParty;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    @Deprecated
    public YAxis getAxis(YAxis.AxisDependency axisDependency) {
        throw new RuntimeException("HwHealthBaseLineChart getAxis Deprecated");
    }

    public void fillChartBackground(int i, int i2) {
        this.mChartBackground = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, i2});
    }

    public void setGridColor(int i, int i2) {
        this.mAxisFirstParty.d(i, i2);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void drawMarkers(Canvas canvas) {
        if ((this.mMarker instanceof HwHealthMarkerView) && isDrawMarkersEnabled() && this.mMarkerViewPosition != MARKER_VIEW_POSITION_UNSET) {
            if (!this.mIsMarkerViewProcessEnable) {
                ((HwHealthMarkerView) this.mMarker).c(this.mMarkerViewPosition.f23619b);
            } else {
                ((HwHealthMarkerView) this.mMarker).c(this.mMarkerViewProcessPositionPx);
            }
            if (isMarkerViewEnable()) {
                ((HwHealthMarkerView) this.mMarker).d(!isNeedLoadingAnimation());
                if (isMarkerViewProcessEnable(canvas)) {
                    return;
                }
                boolean z = false;
                for (Highlight highlight : this.mIndicesToHighlight) {
                    Entry entry = getEntry(highlight);
                    if (entry == null) {
                        throw new RuntimeException("entryForXValue must not be null");
                    }
                    if ((entry instanceof HwEntrys) && ((HwEntrys) entry).getEntries().size() != ((HwHealthBaseBarLineData) this.mData).getDataSets().size()) {
                        throw new RuntimeException("markerview entry size error");
                    }
                    float[] fArr = {highlight.getX(), 0.0f};
                    this.mFirstAxisTransformer.pointValuesToPixel(fArr);
                    if (this.mViewPortHandler.isInBoundsX(fArr[0])) {
                        ((HwHealthMarkerView) this.mMarker).a(entry, highlight, ((HwHealthBaseBarLineData) this.mData).getDataSetCount());
                        z = true;
                    }
                }
                if (!z) {
                    ((HwHealthMarkerView) this.mMarker).a();
                }
                if (!this.mIsMarkerViewProcessEnable && this.mMarkerViewPosition != MARKER_VIEW_POSITION_UNSET) {
                    this.mMarker.draw(canvas, this.mMarkerViewPosition.f23619b, 0.0f);
                } else {
                    this.mMarker.draw(canvas, this.mMarkerViewProcessPositionPx, 0.0f);
                }
            }
        }
    }

    private boolean isMarkerViewProcessEnable(Canvas canvas) {
        if (!this.mIsMarkerViewProcessEnable) {
            if (valuesToHighlight()) {
                return false;
            }
            ((HwHealthMarkerView) this.mMarker).a();
            this.mMarker.draw(canvas, this.mMarkerViewPosition.f23619b, 0.0f);
            return true;
        }
        if (valuesToHighlight()) {
            return false;
        }
        ((HwHealthMarkerView) this.mMarker).a();
        this.mMarker.draw(canvas, this.mMarkerViewProcessPositionPx, 0.0f);
        return true;
    }

    private Entry getEntry(Highlight highlight) {
        if (!isManualReferenceLineEnabledAndHighlight()) {
            return ((HwHealthBaseBarLineData) this.mData).getEntryForXValue(highlight.getX(), this);
        }
        HwEntrys hwEntrys = new HwEntrys();
        if (((HwHealthBaseBarLineData) this.mData).getDataSet(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY) instanceof HwHealthLineDataSet) {
            hwEntrys.add(new HwEntrys.HwDataEntry(new HwHealthBaseEntry(highlight.getX(), this.mAxisRendererFirstParty.c()), (HwHealthLineDataSet) ((HwHealthBaseBarLineData) this.mData).getDataSet(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY)));
        }
        return hwEntrys;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    @Deprecated
    public float getAxisRange(YAxis.AxisDependency axisDependency) {
        throw new RuntimeException("HwHealthBaseLineChart getAxisRange Deprecated");
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.mIsSizeChanged = true;
        this.mOnSizeChangedBuffer[1] = 0.0f;
        this.mOnSizeChangedBuffer[0] = this.mOnSizeChangedBuffer[1];
        if (this.mKeepPositionOnRotation) {
            this.mOnSizeChangedBuffer[0] = this.mViewPortHandler.contentLeft();
            this.mOnSizeChangedBuffer[1] = this.mViewPortHandler.contentTop();
            getTransformer(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY).pixelsToValue(this.mOnSizeChangedBuffer);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mKeepPositionOnRotation) {
            getTransformer(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY).pointValuesToPixel(this.mOnSizeChangedBuffer);
            this.mViewPortHandler.centerViewPort(this.mOnSizeChangedBuffer, this);
        } else {
            this.mViewPortHandler.refresh(this.mViewPortHandler.getMatrixTouch(), this, true);
        }
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    @Deprecated
    public boolean isInverted(YAxis.AxisDependency axisDependency) {
        throw new RuntimeException("HwHealthBaseLineChart isInverted Deprecated");
    }

    public void enableOneMinuteOmit(boolean z) {
        if (this.mXAxisRenderer instanceof HwHealthXAxisRenderer) {
            ((HwHealthXAxisRenderer) this.mXAxisRenderer).d(z);
        }
    }

    public void enableOnlyShowMinutes(boolean z) {
        if (this.mXAxisRenderer instanceof HwHealthXAxisRenderer) {
            ((HwHealthXAxisRenderer) this.mXAxisRenderer).a(z);
        }
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return Math.max(this.mAxisFirstParty.mAxisMaximum, this.mAxisSecondParty.mAxisMaximum);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return Math.min(this.mAxisFirstParty.mAxisMinimum, this.mAxisSecondParty.mAxisMinimum);
    }

    public void setOnMarkViewTextNotify(HwHealthMarkerView.OnMarkViewTextNotify onMarkViewTextNotify) {
        if (this.mMarker instanceof HwHealthMarkerView) {
            ((HwHealthMarkerView) this.mMarker).setOnMarkViewTextNotify(onMarkViewTextNotify);
        }
    }

    public void setOnMarkViewGlobalPoint(HwHealthMarkerView.OnMarkViewGlobalPoint onMarkViewGlobalPoint) {
        if (this.mMarker instanceof HwHealthMarkerView) {
            ((HwHealthMarkerView) this.mMarker).setOnMarkViewGlobalPoint(onMarkViewGlobalPoint);
        }
    }

    public boolean isMarkerViewTimeSelected() {
        if (this.mMarker instanceof HwHealthMarkerView) {
            return ((HwHealthMarkerView) this.mMarker).e();
        }
        return false;
    }

    public long queryMarkerViewTimeMills() {
        if (this.mMarker instanceof HwHealthMarkerView) {
            return ((HwHealthMarkerView) this.mMarker).c();
        }
        return 0L;
    }

    public long queryMarkerViewTimeRangeMin() {
        return queryMarkerViewTimeMills();
    }

    public void invalidateForce() {
        Canvas canvas = this.mOuterShowCanvas;
        if (canvas != null && !canvas.isHardwareAccelerated()) {
            draw(this.mOuterShowCanvas);
        } else {
            invalidate();
        }
    }

    public void enableMarkerView(boolean z) {
        this.mIsMarkerViewEnable = z;
        if (!(this.mXAxisRenderer instanceof HwHealthXAxisRenderer)) {
            LogUtil.j(TAG, "enableMarkerView mXAxisRenderer not instanceof HwHealthXAxisRenderer");
            return;
        }
        if (z) {
            getXAxis().setYOffset(Utils.convertPixelsToDp(this.mLayout.h() + this.mLayout.f()));
            setExtraBottomOffset(Utils.convertPixelsToDp(this.mLayout.b()));
            ((HwHealthXAxisRenderer) this.mXAxisRenderer).e(HwHealthXAxisRenderer.Sorption.Y_OFFSET_FLOOR);
            setBackgroundColor(qqn.b(getContext(), R.color.health_chart_extend_background_color));
            fillChartBackground(qqn.b(getContext(), R.color.colorBackground), qqn.b(getContext(), R.color.colorBackground));
            return;
        }
        ((HwHealthXAxisRenderer) this.mXAxisRenderer).e(HwHealthXAxisRenderer.Sorption.Y_OFFSET_CEIL);
        float fI = this.mLayout.i();
        float fG = this.mLayout.g();
        setExtraBottomOffset(Utils.convertPixelsToDp(fI + fG + this.mLayout.c() + this.mLayout.d()));
        setBackgroundColor(0);
        fillChartBackground(0, 0);
    }

    public boolean isMarkerViewEnable() {
        return this.mIsMarkerViewEnable;
    }

    public void setHorizontalAxisFocusLabelIndex(int i) {
        if (this.mXAxisRenderer instanceof HwHealthXAxisRenderer) {
            ((HwHealthXAxisRenderer) this.mXAxisRenderer).d(i);
        }
    }

    public void setManualReferenceLine(float f, int i, String str) {
        this.mAxisRendererFirstParty.b(f, i, str);
    }

    public void enableManualReferenceLine(int i, int i2) {
        this.mAxisRendererFirstParty.d(i, i2);
    }

    public void enableManualFloatLine(float f, int i) {
        this.mAxisRendererFirstParty.c(f, i);
    }

    public void enableManualFloatLineText(int i) {
        this.mAxisRendererFirstParty.e(i);
    }

    public void enableManualReferenceLine(int i, Paint paint, boolean z) {
        this.mAxisRendererFirstParty.c(i, paint);
        enableDataRenderAsBackground(z);
    }

    public void enableManualReferenceLine(int i, int i2, boolean z) {
        this.mAxisRendererFirstParty.d(i, i2);
        enableDataRenderAsBackground(z);
    }

    public void disableManualReferenceLine() {
        this.mAxisRendererFirstParty.e_();
        enableDataRenderAsBackground(false);
    }

    private void enableDataRenderAsBackground(boolean z) {
        if (this.mRenderer instanceof IHwHealthDataRender) {
            ((IHwHealthDataRender) this.mRenderer).usePaintAsBackground(z);
        }
    }

    public boolean isManualReferenceLineEnabled() {
        return this.mAxisRendererFirstParty.h();
    }

    public boolean isManualReferenceLineEnabledAndHighlight() {
        if (isManualReferenceLineEnabled()) {
            return ((IHwHealthDataRender) this.mRenderer).isUsePaintAsBackground();
        }
        return false;
    }

    public float getManualReferenceLineValue() {
        return this.mAxisRendererFirstParty.c();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public boolean valuesToHighlight() {
        if (this.mIsMarkerViewEnable) {
            return super.valuesToHighlight();
        }
        return false;
    }

    public boolean isRenderUsePaintAsBackground() {
        if (this.mRenderer instanceof IHwHealthDataRender) {
            return ((IHwHealthDataRender) this.mRenderer).isUsePaintAsBackground();
        }
        return false;
    }

    public HwHealthDataContainerGenerator queryLineDataContainerGenerator() {
        List<HwHealthDataContainerGenerator> list = this.mHwHealthDataContainerGenerators;
        if (list == null) {
            return null;
        }
        for (HwHealthDataContainerGenerator hwHealthDataContainerGenerator : list) {
            if (hwHealthDataContainerGenerator.typeOf(IHwHealthLineDatasContainer.class)) {
                return hwHealthDataContainerGenerator;
            }
        }
        return null;
    }

    public void injectDataContainer(HwHealthDataContainerGenerator hwHealthDataContainerGenerator) {
        this.mHwHealthDataContainerGenerators.add(0, hwHealthDataContainerGenerator);
    }

    public boolean isDataReady() {
        if (this.mData == 0) {
            return false;
        }
        List<T> dataSets = ((HwHealthBaseBarLineData) this.mData).getDataSets();
        if (njy.e(dataSets)) {
            return false;
        }
        for (T t : dataSets) {
            if (t != null && t.isQuerying()) {
                return false;
            }
        }
        return true;
    }

    protected boolean isNeedLoadingAnimation() {
        return this.mRingAnimationMgr.b();
    }

    private void correctRingAnimationStatus() {
        boolean zIsNeedLoadingAnimation = isNeedLoadingAnimation();
        if (zIsNeedLoadingAnimation && this.mProgressBar.getVisibility() != 0) {
            this.mProgressBar.setVisibility(0);
        }
        if (zIsNeedLoadingAnimation || this.mProgressBar.getVisibility() != 0) {
            return;
        }
        this.mProgressBar.setVisibility(8);
    }

    public qmt acquireRingAnimationMgr() {
        return this.mRingAnimationMgr;
    }

    public void registerExternalTopArea(View view) {
        this.mExternalTopView = view;
    }

    public void setMarkerSlidingMode(MarkerViewSlidingMode markerViewSlidingMode) {
        this.mMarkerViewSlidingMode = markerViewSlidingMode;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        HealthProgressBar healthProgressBar = this.mProgressBar;
        healthProgressBar.measure(healthProgressBar.getLayoutParams().width, this.mProgressBar.getLayoutParams().height);
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt instanceof HealthProgressBar) {
                childAt.layout(this.progressbarLeft, this.progressbarTop, this.progressbarRight, this.progressbarBottom);
            }
        }
    }

    public void setGlobalPoint(Boolean bool, int i) {
        this.mIsGlobalPoint = bool.booleanValue();
        this.mGlobalPointColor = qqn.d(i);
    }

    public boolean getGlobalPointFlag() {
        return this.mIsGlobalPoint;
    }

    public int getGlobalPointColor() {
        return this.mGlobalPointColor;
    }

    protected void initAccessibilityHelper() {
        if (lrd.d()) {
            createAccessibilityHelper();
        } else {
            setAccessibilityListener();
        }
    }

    protected void createAccessibilityHelper() {
        ChartTouchHelper chartTouchHelper = new ChartTouchHelper(this, lrm.class);
        this.mHelper = chartTouchHelper;
        ViewCompat.setAccessibilityDelegate(this, chartTouchHelper);
    }

    protected void setAccessibilityListener() {
        AccessibilityManager accessibilityManagerA = lrd.a();
        if (accessibilityManagerA == null) {
            LogUtil.j(TAG, "accessibilityManager is ", accessibilityManagerA);
        } else {
            accessibilityManagerA.addTouchExplorationStateChangeListener(this.mAccessibilityListerner);
        }
    }

    static class e implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f23620a = true;
        private WeakReference<HwHealthBaseBarLineChart<?>> d;

        e(HwHealthBaseBarLineChart<?> hwHealthBaseBarLineChart) {
            this.d = new WeakReference<>(hwHealthBaseBarLineChart);
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            HwHealthBaseBarLineChart<?> hwHealthBaseBarLineChart = this.d.get();
            if (hwHealthBaseBarLineChart != null && z && this.f23620a) {
                hwHealthBaseBarLineChart.createAccessibilityHelper();
                this.f23620a = false;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        LogUtil.a(TAG, "enter into dispatchHoverEvent");
        ChartTouchHelper chartTouchHelper = this.mHelper;
        if (chartTouchHelper != null && chartTouchHelper.dispatchHoverEvent(motionEvent)) {
            LogUtil.a(TAG, "enter into dispatchHoverEvent != null");
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        LogUtil.a(TAG, "enter into dispatchKeyEvent");
        ChartTouchHelper chartTouchHelper = this.mHelper;
        if (chartTouchHelper != null && chartTouchHelper.dispatchKeyEvent(keyEvent)) {
            LogUtil.a(TAG, "enter into dispatchKeyEvent != null");
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public ChartTouchHelper getAccessibilityHelper() {
        return this.mHelper;
    }

    public void setParseTool(Object obj) {
        this.mParseTool = obj;
    }

    public Object getParseTool() {
        return this.mParseTool;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        initAccessibilityHelper();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AccessibilityManager accessibilityManagerA = lrd.a();
        if (accessibilityManagerA == null) {
            LogUtil.j(TAG, "accessibilityManager is ", accessibilityManagerA);
        } else {
            accessibilityManagerA.removeTouchExplorationStateChangeListener(this.mAccessibilityListerner);
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public String getAccessibilityDescription() {
        return this.mAccessibilityDescription;
    }

    public void setAccessibilityDescription(String str) {
        this.mAccessibilityDescription = str;
    }
}
