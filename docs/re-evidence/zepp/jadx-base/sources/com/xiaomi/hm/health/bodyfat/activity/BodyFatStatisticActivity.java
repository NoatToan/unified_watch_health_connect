package com.xiaomi.hm.health.bodyfat.activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.listener.IScrollListener;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.GoalLineStyle;
import com.huami.chart.style.LineJoinStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.view.basetitle.SystemBarTintManager;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BFTransToChartUtil;
import com.xiaomi.hm.health.bodyfat.utils.BodyFatTimeUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class BodyFatStatisticActivity extends BaseTitleActivity implements View.OnClickListener {
    private static final String Z = "BodyFatStatisticActivity";
    private static final int m0 = 0;
    private static final int n0 = 1;
    private static final int o0 = Color.parseColor("#17B56C");
    private static final int p0 = Color.parseColor("#FFA500");
    private static final int q0 = 17;
    private static final int r0 = 18;
    private RelativeLayout A;
    private TextView B;
    private TextView C;
    private TextView D;
    private TextView E;
    private TextView F;
    private RelativeLayout G;
    private RelativeLayout H;
    private ImageButton I;
    private ImageButton J;
    private TextView K;
    private List<WeightInfos> M;
    private List<WeightInfos> N;
    private ChartProvider O;
    private ChartProvider P;
    private boolean Q;
    private boolean R;
    private ChartDataList S;
    private ChartDataList Y;
    private RelativeLayout y;
    private RelativeLayout z;
    private Context x = this;
    private long L = -1;
    private int[] T = {6, 9, 12};
    private int U = 0;
    private IScrollListener V = new a();
    private IScrollListener W = new b();
    private Handler X = new c();

    public class a implements IScrollListener {
        public a() {
        }

        @Override // com.huami.chart.listener.IScrollListener
        public void offset(float f) {
            BodyFatStatisticActivity.this.O.getChart().getHmTouchManager().setCurrentOffset(f);
        }

        @Override // com.huami.chart.listener.IScrollListener
        public void onScrollCurrentIndex(Index index) {
        }

        @Override // com.huami.chart.listener.IScrollListener
        public void onStartIndex(Index index) {
        }

        @Override // com.huami.chart.listener.IScrollListener
        public void onStopIndex(Index index) {
            HMLog.d(BodyFatStatisticActivity.Z, "click xIndex " + index, new Object[0]);
            Message messageObtainMessage = BodyFatStatisticActivity.this.X.obtainMessage();
            messageObtainMessage.what = 18;
            messageObtainMessage.arg1 = index.getPosiIndex().getIndex();
            BodyFatStatisticActivity.this.X.sendMessage(messageObtainMessage);
            HMLog.d(BodyFatStatisticActivity.Z, "Slide_BodyFat", new Object[0]);
            Analytics.event(BodyFatStatisticActivity.this.x, StatEvent.EVENT_BODYFAT_STATISTIC_OPERATION, "Slide_BodyFat");
            if (BodyFatStatisticActivity.this.R) {
                BodyFatStatisticActivity.this.R = false;
                return;
            }
            BodyFatStatisticActivity.this.Q = true;
            BodyFatStatisticActivity.this.O.getChart().getHmTouchManager().setCurrentOffset(index);
            BodyFatStatisticActivity.this.O.getChart().onScrollStoped();
        }
    }

    public class b implements IScrollListener {
        public b() {
        }

        @Override // com.huami.chart.listener.IScrollListener
        public void offset(float f) {
            BodyFatStatisticActivity.this.P.getChart().getHmTouchManager().setCurrentOffset(f);
        }

        @Override // com.huami.chart.listener.IScrollListener
        public void onScrollCurrentIndex(Index index) {
        }

        @Override // com.huami.chart.listener.IScrollListener
        public void onStartIndex(Index index) {
        }

        @Override // com.huami.chart.listener.IScrollListener
        public void onStopIndex(Index index) {
            HMLog.d(BodyFatStatisticActivity.Z, "click xIndex " + index, new Object[0]);
            Message messageObtainMessage = BodyFatStatisticActivity.this.X.obtainMessage();
            messageObtainMessage.what = 17;
            messageObtainMessage.arg1 = index.getPosiIndex().getIndex();
            BodyFatStatisticActivity.this.X.sendMessage(messageObtainMessage);
            HMLog.d(BodyFatStatisticActivity.Z, "Slide_Weight", new Object[0]);
            Analytics.event(BodyFatStatisticActivity.this.x, StatEvent.EVENT_BODYFAT_STATISTIC_OPERATION, "Slide_Weight");
            if (BodyFatStatisticActivity.this.Q) {
                BodyFatStatisticActivity.this.Q = false;
                return;
            }
            BodyFatStatisticActivity.this.R = true;
            BodyFatStatisticActivity.this.P.getChart().getHmTouchManager().setCurrentOffset(index);
            BodyFatStatisticActivity.this.P.getChart().onScrollStoped();
        }
    }

    public class c extends Handler {
        public c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeightInfos weightInfos;
            WeightInfos weightInfos2;
            super.handleMessage(message);
            int i = message.what;
            if (i == 17) {
                int i2 = message.arg1;
                if (BodyFatStatisticActivity.this.M == null || BodyFatStatisticActivity.this.M.size() <= 0 || i2 >= BodyFatStatisticActivity.this.M.size() || i2 < 0 || (weightInfos2 = (WeightInfos) BodyFatStatisticActivity.this.M.get(i2)) == null) {
                    return;
                }
                BodyFatStatisticActivity.this.M(weightInfos2);
                return;
            }
            if (i == 18) {
                int i3 = message.arg1;
                if (BodyFatStatisticActivity.this.N == null || BodyFatStatisticActivity.this.N.size() <= 0 || i3 >= BodyFatStatisticActivity.this.N.size() || i3 < 0 || (weightInfos = (WeightInfos) BodyFatStatisticActivity.this.N.get(i3)) == null) {
                    return;
                }
                BodyFatStatisticActivity.this.L(weightInfos);
            }
        }
    }

    public class d extends ChartProvider.StatisChartProvider {
        public final /* synthetic */ long a;

        public d(long j) {
            this.a = j;
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartContainer */
        public ViewGroup getD() {
            return BodyFatStatisticActivity.this.z;
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartDataList */
        public ChartDataList getG() {
            return BodyFatStatisticActivity.this.Y;
        }

        @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
        public Index getCurrentIndex() {
            int count = BodyFatStatisticActivity.this.S.getCount() - 1;
            return new Index(count, new BaseIndex(count));
        }

        @Override // com.huami.chart.chart.IChartProvider
        public DrawConfig getDrawConfig() {
            return BodyFatStatisticActivity.this.H(this.a, 1);
        }

        @Override // com.huami.chart.chart.IChartProvider
        public RenderConfig getRenderConfig() {
            return BodyFatStatisticActivity.this.I(this.a, 1);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BodyFatStatisticActivity.this.P.getChart().setIScrollListener(BodyFatStatisticActivity.this.V);
        }
    }

    public class f extends ChartProvider.StatisChartProvider {
        public final /* synthetic */ long a;

        public f(long j) {
            this.a = j;
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartContainer */
        public ViewGroup getD() {
            return BodyFatStatisticActivity.this.y;
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartDataList */
        public ChartDataList getG() {
            float fK = BodyFatStatisticActivity.this.K();
            ChartDataList chartDataList = BodyFatStatisticActivity.this.S;
            if (fK <= BodyFatStatisticActivity.this.S.getMaxValue()) {
                fK = BodyFatStatisticActivity.this.S.getMaxValue();
            }
            chartDataList.setMaxValue(fK);
            return BodyFatStatisticActivity.this.S;
        }

        @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
        public Index getCurrentIndex() {
            int count = BodyFatStatisticActivity.this.S.getCount() - 1;
            return new Index(count, new BaseIndex(count));
        }

        @Override // com.huami.chart.chart.IChartProvider
        public DrawConfig getDrawConfig() {
            return BodyFatStatisticActivity.this.H(this.a, 0);
        }

        @Override // com.huami.chart.chart.IChartProvider
        public RenderConfig getRenderConfig() {
            return BodyFatStatisticActivity.this.I(this.a, 0);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BodyFatStatisticActivity.this.O.getChart().setIScrollListener(BodyFatStatisticActivity.this.W);
        }
    }

    private void G(long j) {
        this.Y.setShownCount(this.T[this.U]);
        this.P.createChart(new d(j), true, true, true, true, true);
        this.z.post(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DrawConfig H(long j, int i) {
        return new DrawConfig.Builder(this.x).setCanvasWidth((i == 0 ? this.y : this.z).getMeasuredWidth()).setCanvasHeight((i == 0 ? this.y : this.z).getMeasuredHeight()).setDataMarginTop(ChartUtil.dp2px(this.x, 18.0f)).setDataMarginBottom(ChartUtil.dp2px(this.x, 28.0f)).setDataWidth(ChartUtil.dp2px(this.x, 50.5f) * this.T[this.U]).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RenderConfig I(long j, int i) {
        int[] iArr = i == 0 ? new int[]{Color.parseColor("#3306B666"), Color.parseColor("#2206B666"), Color.parseColor("#1106B666"), 0} : new int[]{Color.parseColor("#33FF8810"), Color.parseColor("#22FF8810"), Color.parseColor("#11FF8810"), 0};
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        float fK = K();
        boolean z = fK > 0.0f && i == 0;
        RenderConfig.Builder lineJoinStyle = new RenderConfig.Builder().setLineStyle(new LineStyle.Builder(this.x).setLineStyle(4).setShadowColors(iArr).setLineColor(i == 0 ? o0 : p0).setLineWidth(ChartUtil.dp2px(this.x, 1.0f)).create()).setLineJoinStyle(new LineJoinStyle.Builder(this.x).setLineJointColor(i == 0 ? o0 : p0).setLineJointStyle(8).setLineJointSize(ChartUtil.dp2px(this.x, 1.65f)).create());
        if (i != 0) {
            return lineJoinStyle.create();
        }
        return lineJoinStyle.setGoalLineStyle(new GoalLineStyle.Builder(this.x).setGoalLineStyle(z ? 10 : 1).setGoalLineLabelPosition(GoalLineStyle.GoalLineLabelPosition.END).setGoalLineWidth(ChartUtil.dp2px(this.x, 0.3f)).setGoalLineColor(new int[]{ContextCompat.getColor(this.x, R.color.black20)}).setDashLineInterval(new float[]{20.0f, 10.0f, 20.0f, 10.0f}).setGoals(new float[]{fK}).setGoalLineLabelSize(ChartUtil.sp2px(this.x, 10.0f)).setGoalLabels(new String[]{HMWeightUtils.getWeightValueStringForDisplay(fK, weightUnit) + BFCallback.getUnitManager().getWeightUnitString(weightUnit)}).create()).create();
    }

    private void J(long j) {
        this.S.setShownCount(this.T[this.U]);
        this.O.createChart(new f(j), true, true, true, true, true);
        this.y.post(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float K() {
        UserInfos info = UserInfoManager.getManager().getInfo(this.L);
        return HMWeightUtils.scaleFloat((info == null || info.getTargetWeight() == null) ? 0.0f : info.getTargetWeight().floatValue(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(WeightInfos weightInfos) {
        if (weightInfos != null) {
            HMLog.d(Z, "update Weight :" + HMWeightUtils.toString(weightInfos), new Object[0]);
            Float body_fat = weightInfos.getBody_fat();
            if (body_fat == null) {
                HMLog.d(Z, "bdyFat null", new Object[0]);
                return;
            }
            HMLog.d(Z, "bdyFat " + body_fat, new Object[0]);
            this.C.setText(BodyFatTimeUtils.INSTANCE.formatDateTime_no_y((Context) this, weightInfos.getTimestamp().longValue(), false));
            this.E.setText(String.format(Locale.getDefault(), "%.1f", Float.valueOf(HMWeightUtils.scaleFloatToDown(body_fat.floatValue(), 1))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(WeightInfos weightInfos) {
        if (weightInfos != null) {
            HMLog.d(Z, "update Weight :" + HMWeightUtils.toString(weightInfos), new Object[0]);
            float fFloatValue = weightInfos.getWeight().floatValue();
            float f2 = fFloatValue >= 150.0f ? 149.0f : fFloatValue;
            int weightUnit = BFCallback.getUnitManager().getWeightUnit();
            HMLog.d(Z, "setInitValue KG :" + f2, new Object[0]);
            HMLog.d(Z, "setInitValue value = " + HMWeightUtils.convertFromKg(f2, weightUnit), new Object[0]);
            this.B.setText(BodyFatTimeUtils.INSTANCE.formatDateTime_no_y((Context) this, weightInfos.getTimestamp().longValue(), false));
            this.D.setText(HMWeightUtils.getWeightValueStringForDisplay(fFloatValue, weightUnit));
            HMLog.d(Z, "unit = " + weightUnit, new Object[0]);
            this.F.setText(HMWeightUtils.toUnitStr(getApplicationContext(), weightUnit));
        }
    }

    private void initView() {
        this.y = (RelativeLayout) findViewById(R.id.weight_container);
        this.z = (RelativeLayout) findViewById(R.id.bfat_container);
        this.A = (RelativeLayout) findViewById(R.id.bfat_time_layout);
        this.B = (TextView) findViewById(R.id.weight_time);
        this.C = (TextView) findViewById(R.id.bfat_time);
        this.D = (TextView) findViewById(R.id.weight_value);
        this.E = (TextView) findViewById(R.id.bfat_value);
        this.F = (TextView) findViewById(R.id.weight_unit);
        this.G = (RelativeLayout) findViewById(R.id.weight_info_layout);
        this.H = (RelativeLayout) findViewById(R.id.bfat_info_layout);
        this.I = (ImageButton) findViewById(R.id.weight_zoom_out);
        this.J = (ImageButton) findViewById(R.id.weight_zoom_in);
        int i = this.U;
        if (i == 0) {
            this.I.setEnabled(false);
            this.J.setEnabled(true);
        } else if (i == 2) {
            this.I.setEnabled(true);
            this.J.setEnabled(false);
        }
        this.I.setOnClickListener(this);
        this.J.setOnClickListener(this);
        this.K = (TextView) findViewById(R.id.bfat_no_info);
    }

    public void adapterLayout() {
        if (new SystemBarTintManager(this).getConfig().hasNavigtionBar()) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) ViewUtils.dp2px(this.x, 85.0f));
            this.G.setLayoutParams(layoutParams);
            this.H.setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) ViewUtils.dp2px(this.x, 108.0f));
            this.G.setLayoutParams(layoutParams2);
            this.H.setLayoutParams(layoutParams2);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.weight_zoom_in) {
            int i = this.U;
            if (i < 2) {
                this.U = i + 1;
            }
            int i2 = this.U;
            if (i2 == 0) {
                this.I.setEnabled(false);
                this.J.setEnabled(true);
            } else if (i2 == 1) {
                this.I.setEnabled(true);
                this.J.setEnabled(true);
            } else if (i2 == 2) {
                this.I.setEnabled(true);
                this.J.setEnabled(false);
            }
            J(this.L);
            G(this.L);
            HMLog.d(Z, "narrow....", new Object[0]);
            Analytics.event(this.x, StatEvent.EVENT_BODYFAT_STATISTIC_OPERATION, "Narrow");
            return;
        }
        if (id == R.id.weight_zoom_out) {
            int i3 = this.U;
            if (i3 > 0) {
                this.U = i3 - 1;
            }
            int i4 = this.U;
            if (i4 == 0) {
                this.I.setEnabled(false);
                this.J.setEnabled(true);
            } else if (i4 == 1) {
                this.I.setEnabled(true);
                this.J.setEnabled(true);
            } else if (i4 == 2) {
                this.I.setEnabled(true);
                this.J.setEnabled(false);
            }
            J(this.L);
            G(this.L);
            Analytics.event(this.x, StatEvent.EVENT_BODYFAT_STATISTIC_OPERATION, "Enlarge");
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        HMLog.d(Z, "onCreate", new Object[0]);
        setContentView(R.layout.activity_bodyfat_statistic);
        BFTitleStyleKt.setUnifyTitleStyle(this, getString(R.string.bf3_static_title), null);
        initView();
        this.L = getIntent().getLongExtra("UID", -1L);
        this.M = WeightInfoManager.getManager().getBodyFatInfosAsc(this.L);
        this.N = WeightInfoManager.getManager().getBodyFatInfosAsc(this.L);
        this.O = new ChartProvider(this.x, true);
        this.P = new ChartProvider(this.x, true);
        adapterLayout();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HMLog.d(Z, "onDestroy", new Object[0]);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.S = BFTransToChartUtil.getInstance().createWeightDataOld(this.L);
        this.Y = BFTransToChartUtil.getInstance().createBdyFatDataOld(this.L);
        J(this.L);
        G(this.L);
        ChartDataList chartDataList = this.Y;
        if (chartDataList == null || chartDataList.getCount() == 0) {
            this.H.setVisibility(4);
            this.A.setVisibility(8);
            this.K.setVisibility(0);
        } else {
            this.A.setVisibility(0);
            this.H.setVisibility(0);
            this.K.setVisibility(4);
        }
        setTitleText(R.string.statistic);
        WeightInfos latestBdfatInfo = WeightInfoManager.getManager().getLatestBdfatInfo(this.L);
        M(latestBdfatInfo);
        L(latestBdfatInfo);
    }
}
