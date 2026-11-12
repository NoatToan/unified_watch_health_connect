package com.huami.moving.sport.ui.view.chart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.BackgroundShader;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.MultiColorLine;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.BackgroundStyle;
import com.huami.chart.style.BarStyle;
import com.huami.chart.style.GoalLineStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.MultiLineStyle;
import com.huami.chart.style.NoDataStyle;
import com.huami.chart.style.PointStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.moving.sport.ui.R;
import com.huami.moving.sport.ui.activity.SportDetailChartsLandscapeActivity;
import com.huami.moving.sport.ui.view.chart.dataprovider.AltiType;
import com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.BaseType;
import com.huami.moving.sport.ui.view.chart.dataprovider.BoatingFreType;
import com.huami.moving.sport.ui.view.chart.dataprovider.BodyStatusType;
import com.huami.moving.sport.ui.view.chart.dataprovider.CadenceType;
import com.huami.moving.sport.ui.view.chart.dataprovider.GolfAngleType;
import com.huami.moving.sport.ui.view.chart.dataprovider.GolfBeatType;
import com.huami.moving.sport.ui.view.chart.dataprovider.GolfUpDownTimeType;
import com.huami.moving.sport.ui.view.chart.dataprovider.HeartType;
import com.huami.moving.sport.ui.view.chart.dataprovider.PaceType;
import com.huami.moving.sport.ui.view.chart.dataprovider.PowerMeterType;
import com.huami.moving.sport.ui.view.chart.dataprovider.PressureType;
import com.huami.moving.sport.ui.view.chart.dataprovider.RopeSkipingFreqType;
import com.huami.moving.sport.ui.view.chart.dataprovider.SpeedType;
import com.huami.moving.sport.ui.view.chart.dataprovider.Spo2Type;
import com.huami.moving.sport.ui.view.chart.dataprovider.StepFreqType;
import com.huami.moving.sport.ui.view.chart.dataprovider.StepType;
import com.huami.moving.sport.ui.view.chart.dataprovider.StrokeSpeedType;
import com.huami.moving.sport.ui.view.chart.overlying.OverlyingHelper;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SportDiagramView extends RelativeLayout {
    private static final String H = SportDiagramView.class.getSimpleName();
    private static final int I = 18;
    private Context A;
    private Paint B;
    private float C;
    private float D;
    private long E;
    private int F;
    private b G;
    private BaseDataProvider a;
    private BaseType b;
    private TextView c;
    private LinearLayout d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private View m;
    private View n;
    private View o;
    private LinearLayoutCompat p;
    private LinearLayoutCompat q;
    private TextView r;
    private ImageView s;
    private RelativeLayout t;
    private LinearLayout u;
    private ChartProvider v;
    private ChartDataList w;
    private List<ChartDataList> x;
    private SparseArray<XAxisData> y;
    private SparseArray<YAxisData> z;

    public class a extends ChartProvider.StatisChartProvider {
        public a() {
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartContainer */
        public ViewGroup getA() {
            return SportDiagramView.this.t;
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartDataList */
        public ChartDataList getB() {
            SportDiagramView.this.w.setMaxValue(((YAxisData) SportDiagramView.this.z.valueAt(SportDiagramView.this.z.size() - 1)).getValue());
            SportDiagramView.this.w.setMinValue(((YAxisData) SportDiagramView.this.z.valueAt(0)).getValue());
            return SportDiagramView.this.w;
        }

        @Override // com.huami.chart.chart.IChartProvider
        public DrawConfig getDrawConfig() {
            return SportDiagramView.this.q();
        }

        @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getMultiChartDataList */
        public ChartDataList[] getMultiList() {
            if (SportDiagramView.this.x == null) {
                return null;
            }
            for (ChartDataList chartDataList : SportDiagramView.this.x) {
                chartDataList.setMaxValue(((YAxisData) SportDiagramView.this.z.valueAt(SportDiagramView.this.z.size() - 1)).getValue());
                chartDataList.setMinValue(((YAxisData) SportDiagramView.this.z.valueAt(0)).getValue());
            }
            return (ChartDataList[]) SportDiagramView.this.x.toArray(new ChartDataList[0]);
        }

        @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
        public ChartDataList[] getPointChartDataList() {
            return new ChartDataList[]{SportDiagramView.this.w};
        }

        @Override // com.huami.chart.chart.IChartProvider
        public RenderConfig getRenderConfig() {
            SportDiagramView sportDiagramView = SportDiagramView.this;
            return sportDiagramView.r(sportDiagramView.a);
        }
    }

    public class b extends Handler {
        private final WeakReference<Context> a;

        public b(Context context) {
            this.a = new WeakReference<>(context);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.a.get() != null) {
                super.handleMessage(message);
                if (message.what == 18) {
                    SportDiagramView.this.a = (BaseDataProvider) message.obj;
                    SportDiagramView sportDiagramView = SportDiagramView.this;
                    sportDiagramView.y = sportDiagramView.a.getXAxisData();
                    SportDiagramView sportDiagramView2 = SportDiagramView.this;
                    sportDiagramView2.w = sportDiagramView2.a.getDataList();
                    SportDiagramView sportDiagramView3 = SportDiagramView.this;
                    sportDiagramView3.x = sportDiagramView3.a.getMultiDataList();
                    SportDiagramView sportDiagramView4 = SportDiagramView.this;
                    sportDiagramView4.z = sportDiagramView4.a.getYAxisData();
                    SportDiagramView sportDiagramView5 = SportDiagramView.this;
                    sportDiagramView5.b = sportDiagramView5.a.getType();
                    if (!(SportDiagramView.this.b instanceof BodyStatusType)) {
                        OverlyingHelper.INSTANCE.addTypeChartList(SportDiagramView.this.b, SportDiagramView.this.w, SportDiagramView.this.z);
                    }
                    SportDiagramView.this.x();
                }
            }
        }
    }

    public SportDiagramView(Context context) {
        this(context, null);
    }

    private float getChartMarginLeft() {
        return getStandardMargin() + this.C + (this.D / 2.0f);
    }

    private float getChartMarginRight() {
        return getStandardMargin() + (this.D / 2.0f);
    }

    private float getStandardMargin() {
        return ChartUtil.dp2px(this.A, 13.4f);
    }

    private float getXMarginLeft() {
        return getStandardMargin() + this.C + ChartUtil.dp2px(this.A, 7.3f);
    }

    private float getXMarginRight() {
        return ChartUtil.dp2px(this.A, 25.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DrawConfig q() {
        return new DrawConfig.Builder(this.A).setCanvasWidth(this.t.getMeasuredWidth()).setCanvasHeight(this.t.getMeasuredHeight()).setDataMarginRight(getChartMarginRight()).setDataWidth(ChartUtil.dp2px(this.A, this.b instanceof PressureType ? 1.5f : 5.0f)).setDataMarginTop(ChartUtil.dp2px(this.A, 30.0f)).setDataMarginLeft(getChartMarginLeft()).setDataMarginBottom(ChartUtil.dp2px(this.A, 45.0f)).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x01a3  */
    public RenderConfig r(BaseDataProvider baseDataProvider) {
        int i;
        Context context = this.A;
        int i2 = R.color.p3;
        int color = ContextCompat.getColor(context, i2);
        int[] iArr = {Color.parseColor("#CCFF5850"), Color.parseColor("#80FF5850"), Color.parseColor("#40FF5850"), 0};
        BaseType baseType = this.b;
        if ((baseType instanceof AltiType) || (baseType instanceof StrokeSpeedType)) {
            color = ContextCompat.getColor(this.A, R.color.s33);
            iArr = new int[]{Color.parseColor("#CCFFAB03"), Color.parseColor("#80FFAB03"), Color.parseColor("#40FFAB03"), 0};
        } else if ((baseType instanceof PaceType) || (baseType instanceof SpeedType)) {
            color = ContextCompat.getColor(this.A, R.color.s15);
            iArr = new int[]{Color.parseColor("#CC00A0DC"), Color.parseColor("#8000A0DC"), Color.parseColor("#4000A0DC"), 0};
        } else if (baseType instanceof BodyStatusType) {
            color = Color.parseColor("#4A8DFF");
            iArr = new int[]{Color.parseColor("#334A8DFF"), Color.parseColor("#224A8DFF"), Color.parseColor("#114A8DFF"), Color.parseColor("#004A8DFF"), 0, 0};
        } else if (baseType instanceof GolfAngleType) {
            color = ContextCompat.getColor(this.A, R.color.s20);
            iArr = new int[]{Color.parseColor("#CC02AF8D"), Color.parseColor("#8002AF8D"), Color.parseColor("#4002AF8D"), 0};
        } else if (baseType instanceof GolfBeatType) {
            color = ContextCompat.getColor(this.A, R.color.s33);
            iArr = new int[]{Color.parseColor("#CCFFAB03"), Color.parseColor("#80FFAB03"), Color.parseColor("#40FFAB03"), 0};
        } else if (baseType instanceof GolfUpDownTimeType) {
            color = ContextCompat.getColor(this.A, i2);
            iArr = new int[]{0, 0, 0};
        } else if (baseType instanceof PowerMeterType) {
            color = ContextCompat.getColor(this.A, R.color.s25);
            iArr = new int[]{Color.parseColor("#CC985FFC"), Color.parseColor("#80985FFC"), Color.parseColor("#40985FFC"), 0};
        }
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        if (this.b instanceof Spo2Type) {
            sparseArray.put(0, new YAxisData(80.0f, "80%"));
            sparseArray.put(1, new YAxisData(90.0f, "90%"));
        }
        SparseArray<YAxisData> sparseArray2 = this.z;
        if (sparseArray2 != null && sparseArray2.size() > 0) {
            this.C = t(this.z);
        }
        SparseArray<XAxisData> sparseArray3 = this.y;
        if (sparseArray3 != null && sparseArray3.size() > 0) {
            this.D = s(this.y);
        }
        int samplingInterval = this.a.getTrackData().getSamplingInterval();
        BaseType baseType2 = this.b;
        if (baseType2 instanceof HeartType) {
            if (samplingInterval > 15) {
                i = samplingInterval * 2;
            } else {
                i = 30;
            }
        } else if (baseType2 instanceof BodyStatusType) {
            i = -1;
        } else if (samplingInterval > 3) {
            i = samplingInterval * 2;
        } else {
            i = 6;
        }
        RenderConfig.Builder builder = new RenderConfig.Builder();
        AxisStyle.Builder xSubLabelSize = new AxisStyle.Builder(this.A).setAxisStyle(32994).setZeroX(getStandardMargin() + this.C).setXAxisMarginLeft(getXMarginLeft()).setXAxisMarginRight(getXMarginRight()).setZeroY(ChartUtil.dp2px(this.A, 43.0f)).setYAxisMarginBottom(ChartUtil.dp2px(this.A, 40.3f)).setYLabelMarginYAxis(0.0f).setXLabelMarginTop(ChartUtil.dp2px(this.A, 12.0f)).setXLabelSize(ChartUtil.sp2px(this.A, 12.0f)).setYLabelSize(ChartUtil.sp2px(this.A, 12.0f)).setXSubLabelSize(ChartUtil.sp2px(this.A, 10.0f));
        Resources resources = getResources();
        int i3 = R.color.s3;
        AxisStyle.Builder xSubLabelColor = xSubLabelSize.setYLabelColor(resources.getColor(i3)).setXLabelColor(getResources().getColor(i3)).setXSubLabelColor(getResources().getColor(R.color.s2));
        Resources resources2 = getResources();
        int i4 = R.color.s4;
        RenderConfig.Builder noDataStyle = builder.setAxisStyle(xSubLabelColor.setXAxisLineColor(resources2.getColor(i4)).setXAxisLineWidth(ChartUtil.dp2px(this.A, 0.66f)).setXAxisScaleLineHeight(ChartUtil.dp2px(this.A, 3.0f)).setXAxisScaleLineColor(getResources().getColor(i4)).setXAxisData(this.y).setYAxisData(this.z).setYAxisScaleDatas(sparseArray).setYAxisScaleLongDashColor(Color.parseColor("#8D8D8D")).setYAxisScaleLineWidth(ChartUtil.dp2px(this.A, 0.5f)).setYAxisRight(true).create()).setNoDataStyle(new NoDataStyle.Builder(this.A).setNoDataLabel(baseDataProvider.getNoDataStr()).setNoDataStyle(2).setNoDataLabelColor(getResources().getColor(R.color.white30)).setNoDataLabelSize(ChartUtil.sp2px(this.A, 10.7f)).create());
        BaseType baseType3 = this.b;
        if ((baseType3 instanceof StepType) || (baseType3 instanceof StepFreqType) || (baseType3 instanceof BoatingFreType) || (baseType3 instanceof RopeSkipingFreqType) || (baseType3 instanceof CadenceType) || (baseType3 instanceof Spo2Type)) {
            float fDp2px = ChartUtil.dp2px(this.A, 1.2f);
            if (this.b instanceof Spo2Type) {
                fDp2px = ChartUtil.dp2px(this.A, 4.0f);
            }
            noDataStyle.setPointStyle(new PointStyle.Builder(this.A).setPointStyle(2).setPointSize(fDp2px).setPointColor(ContextCompat.getColor(this.A, R.color.s20)).create());
        } else if (baseType3 instanceof PressureType) {
            noDataStyle.setBarStyle(new BarStyle.Builder(this.A).setBarStyle(2).create());
        } else {
            MultiColorLine[] multiColorLineArr = {new MultiColorLine(new float[]{-20.0f, -5.0f}, getResources().getColor(i2)), new MultiColorLine(new float[]{-5.0f, 5.0f}, getResources().getColor(R.color.s33)), new MultiColorLine(new float[]{5.0f, 20.0f}, getResources().getColor(R.color.s20))};
            BaseType baseType4 = this.b;
            boolean z = (baseType4 instanceof GolfUpDownTimeType) || (baseType4 instanceof GolfAngleType) || (baseType4 instanceof GolfBeatType);
            LineStyle.Builder lineStyle = new LineStyle.Builder(this.A).setLineStyle(4);
            if (!(this.b instanceof BodyStatusType)) {
                multiColorLineArr = null;
            }
            noDataStyle.setLineStyle(lineStyle.setMultiColorLines(multiColorLineArr).setLineWidth(ChartUtil.dp2px(this.A, 2.0f)).setLineColor(color).setShadowColors(iArr).setSinglePointSize(z ? 6.0f : 0.0f).showGapPoint(z).setDisconnectLineGap(i).create());
        }
        if (this.b instanceof GolfUpDownTimeType) {
            noDataStyle.setMultiLineStyle(new MultiLineStyle.Builder(this.A).setLineColors(new int[]{getResources().getColor(R.color.s15)}).setLineWidth(ChartUtil.dp2px(this.A, 2.0f)).setSinglePointSize(6.0f).showGapPoint(true).setLineStyle(4).create());
        }
        if (this.b instanceof BodyStatusType) {
            noDataStyle.setBackgroundStyle(new BackgroundStyle.Builder(this.A).setBackgroundStyle(32).setBackgroundShader(new BackgroundShader(0.0f, 20.0f, 0.0f, -20.0f, new int[]{Color.parseColor("#2602AF8D"), Color.parseColor("#2602AF8D"), Color.parseColor("#1AFFAB03"), Color.parseColor("#1AFFAB03"), Color.parseColor("#1AFF5850"), Color.parseColor("#1AFF5850")}, new float[]{0.0f, 0.375f, 0.375f, 0.625f, 0.625f, 1.0f}, Shader.TileMode.CLAMP)).create());
        }
        noDataStyle.setGoalLineStyle(new GoalLineStyle.Builder(this.A).setGoalLineStyle(baseDataProvider.shouldDrawGoalLine() ? 2 : 1).setDashLineInterval(new float[]{12.0f, 7.0f}).setGoalLineColor(new int[]{getResources().getColor(R.color.black20)}).setGoalLineWidth(ChartUtil.dp2px(this.A, 1.0f)).setGoalLineMarginStart(getChartMarginLeft()).setGoalLineMarginEnd(getChartMarginRight()).setGoals(baseDataProvider.getGoalValues() != null ? baseDataProvider.getGoalValues() : new float[]{baseDataProvider.getGoalValue()}).create());
        return noDataStyle.create();
    }

    private float s(SparseArray<XAxisData> sparseArray) {
        float f = 0.0f;
        for (int i = 0; i < sparseArray.size(); i++) {
            XAxisData xAxisData = sparseArray.get(i);
            if (xAxisData != null) {
                float fCalculateTextWidth = ChartUtil.calculateTextWidth(u(null, getResources().getColor(R.color.white40), ChartUtil.sp2px(this.A, 12.0f)), xAxisData.getTitle());
                if (f < fCalculateTextWidth) {
                    f = fCalculateTextWidth;
                }
            }
        }
        return f;
    }

    private float t(SparseArray<YAxisData> sparseArray) {
        float f = 0.0f;
        for (int i = 0; i < sparseArray.size(); i++) {
            YAxisData yAxisData = sparseArray.get(i);
            if (yAxisData != null) {
                float fCalculateTextWidth = ChartUtil.calculateTextWidth(u(null, getResources().getColor(R.color.white40), ChartUtil.sp2px(this.A, 12.0f)), yAxisData.getTitle());
                if (f < fCalculateTextWidth) {
                    f = fCalculateTextWidth;
                }
            }
        }
        return f;
    }

    private Paint u(Typeface typeface, int i, float f) {
        this.B.reset();
        this.B.setAntiAlias(true);
        this.B.setColor(i);
        this.B.setTextSize(f);
        if (typeface != null) {
            this.B.setTypeface(typeface);
        }
        return this.B;
    }

    private void v() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.moving_ui_diagram_container);
        this.t = relativeLayout;
        this.t.setLayoutParams((LinearLayout.LayoutParams) relativeLayout.getLayoutParams());
        this.c = (TextView) findViewById(R.id.moving_ui_diagram_title);
        this.d = (LinearLayout) findViewById(R.id.moving_ui_diagram_labels_layout);
        this.e = (TextView) findViewById(R.id.moving_ui_diagram_subtitle1);
        this.f = (TextView) findViewById(R.id.moving_ui_diagram_subtitle2);
        this.g = (TextView) findViewById(R.id.moving_ui_diagram_subtitle3);
        this.h = (TextView) findViewById(R.id.moving_ui_diagram_subtitle4);
        this.i = (TextView) findViewById(R.id.moving_ui_diagram_subtitle_name1);
        this.j = (TextView) findViewById(R.id.moving_ui_diagram_subtitle_name2);
        this.k = (TextView) findViewById(R.id.moving_ui_diagram_subtitle_name3);
        this.l = (TextView) findViewById(R.id.moving_ui_diagram_subtitle_name4);
        this.n = findViewById(R.id.moving_ui_diagram_first_sub_layout);
        this.m = findViewById(R.id.moving_ui_diagram_second_sub_layout);
        this.o = findViewById(R.id.moving_ui_diagram_subtitle_split_3);
        this.p = (LinearLayoutCompat) findViewById(R.id.moving_ui_diagram_sub3);
        this.q = (LinearLayoutCompat) findViewById(R.id.moving_ui_diagram_sub4);
        this.r = (TextView) findViewById(R.id.moving_ui_diagram_unit);
        this.s = (ImageView) findViewById(R.id.moving_ui_diagram_chart_icon);
        this.u = (LinearLayout) findViewById(R.id.body_status_bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(View view) {
        SportDetailChartsLandscapeActivity.INSTANCE.show(getContext(), this.a, this.w, this.x, this.y, this.z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (!this.a.shouldShow()) {
            setVisibility(8);
            return;
        }
        if (this.a.isEmpty()) {
            setVisibility(8);
            return;
        }
        this.c.setText(this.a.getTitle());
        String[] firstValueLabel = this.a.getFirstValueLabel();
        String[] secondValueLabel = this.a.getSecondValueLabel();
        if (firstValueLabel.length == 0 || secondValueLabel.length == 0) {
            this.n.setVisibility(8);
        } else {
            if (firstValueLabel.length > 1) {
                this.e.setText(firstValueLabel[0]);
                this.i.setText(firstValueLabel[1]);
            }
            if (secondValueLabel.length > 1) {
                this.f.setText(secondValueLabel[0]);
                this.j.setText(secondValueLabel[1]);
            }
        }
        String[] thirdValueLabel = this.a.getThirdValueLabel();
        String[] forthValueLabel = this.a.getForthValueLabel();
        if (thirdValueLabel != null && thirdValueLabel.length > 1) {
            this.p.setVisibility(0);
            this.g.setText(thirdValueLabel[0]);
            this.k.setText(thirdValueLabel[1]);
        }
        if (forthValueLabel != null && forthValueLabel.length > 1) {
            this.o.setVisibility(0);
            this.q.setVisibility(0);
            this.h.setText(forthValueLabel[0]);
            this.l.setText(forthValueLabel[1]);
        }
        this.r.setText(this.a.getDataUnit());
        this.s.setVisibility(y() ? 0 : 8);
        this.s.setOnClickListener(new View.OnClickListener() { // from class: u97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.w(view);
            }
        });
        this.v.createChart(new a(), false, false, false);
        BaseType baseType = this.b;
        if (baseType instanceof BodyStatusType) {
            this.d.setVisibility(8);
            this.u.setVisibility(0);
            return;
        }
        if (baseType instanceof PressureType) {
            this.d.setVisibility(0);
            this.u.setVisibility(0);
            this.u.findViewById(R.id.moving_ui_bottom_status_icon_1).setVisibility(0);
            this.u.findViewById(R.id.moving_ui_bottom_status_label_1).setVisibility(0);
            TextView textView = (TextView) this.u.findViewById(R.id.moving_ui_bottom_status_label_2);
            TextView textView2 = (TextView) this.u.findViewById(R.id.moving_ui_bottom_status_label_3);
            TextView textView3 = (TextView) this.u.findViewById(R.id.moving_ui_bottom_status_label_4);
            textView.setText(R.string.moving_ui_chart_pressure_normal);
            textView2.setText(R.string.moving_ui_chart_pressure_medium);
            textView3.setText(R.string.moving_ui_chart_pressure_high);
            return;
        }
        if (!(baseType instanceof GolfUpDownTimeType)) {
            this.d.setVisibility(0);
            this.u.setVisibility(8);
            return;
        }
        this.d.setVisibility(0);
        this.u.setVisibility(0);
        TextView textView4 = (TextView) this.u.findViewById(R.id.moving_ui_bottom_status_icon_1);
        textView4.setVisibility(0);
        textView4.setBackgroundResource(R.drawable.shape_rect_p3_corner_4);
        TextView textView5 = (TextView) this.u.findViewById(R.id.moving_ui_bottom_status_label_1);
        textView5.setVisibility(0);
        textView5.setText(R.string.moving_ui_chart_golf_up_time);
        TextView textView6 = (TextView) this.u.findViewById(R.id.moving_ui_bottom_status_icon_2);
        textView6.setVisibility(0);
        textView6.setBackgroundResource(R.drawable.shape_rect_s15_corner_4);
        TextView textView7 = (TextView) this.u.findViewById(R.id.moving_ui_bottom_status_label_2);
        textView7.setVisibility(0);
        textView7.setText(R.string.moving_ui_chart_golf_down_time);
        this.u.findViewById(R.id.moving_ui_bottom_status_icon_3).setVisibility(8);
        this.u.findViewById(R.id.moving_ui_bottom_status_icon_4).setVisibility(8);
        this.u.findViewById(R.id.moving_ui_bottom_status_label_3).setVisibility(8);
        this.u.findViewById(R.id.moving_ui_bottom_status_label_4).setVisibility(8);
    }

    private boolean y() {
        return !(this.b instanceof BodyStatusType);
    }

    public final void refreshUI(BaseDataProvider baseDataProvider) {
        if (baseDataProvider == null) {
            return;
        }
        Message message = new Message();
        message.what = 18;
        message.obj = baseDataProvider;
        this.G.sendMessage(message);
    }

    public void setIdAndType(long j, int i) {
        this.E = j;
        this.F = i;
    }

    public SportDiagramView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = new Paint(1);
        this.C = 0.0f;
        this.D = 0.0f;
        this.E = -1L;
        this.F = 1;
        this.A = context;
        LayoutInflater.from(context).inflate(R.layout.moving_ui_sport_detail_common_diagram_view, this);
        v();
        refreshUI(null);
        this.v = new ChartProvider(this.A, true);
        this.G = new b(context);
    }
}
