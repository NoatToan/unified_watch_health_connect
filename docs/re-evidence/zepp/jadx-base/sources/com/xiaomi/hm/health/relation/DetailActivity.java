package com.xiaomi.hm.health.relation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.timepicker.TimeModel;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.chart.IChartProvider;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.listener.IScrollListener;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.BarStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.HMColor;
import com.huami.chart.util.Index;
import com.huami.mifit.analytics.Analytics;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.relatives.event.EventCareSend;
import com.huami.relatives.event.EventFriendRemoved;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.databases.model.Detail;
import com.xiaomi.hm.health.databases.model.Friend;
import com.xiaomi.hm.health.push.MessageManager;
import com.xiaomi.hm.health.relation.DetailActivity;
import com.xiaomi.hm.health.relation.copy.AvatarManager;
import com.xiaomi.hm.health.relation.copy.HMExpandHeadView;
import com.xiaomi.hm.health.relation.copy.HMScrollView;
import com.xiaomi.hm.health.relation.copy.RelativesHMCircleImageView;
import com.xiaomi.hm.health.relation.copy.SystemBarTintSupport;
import com.xiaomi.hm.health.relation.copy.UnitTextView;
import com.xiaomi.hm.health.relation.event.EventDetailLoad;
import com.xiaomi.hm.health.relation.event.EventFriendLoad;
import com.xiaomi.hm.health.relation.utils.TimeUtils;
import com.xiaomi.hm.health.relation.utils.Utils;
import com.xiaomi.hm.health.relation.view.CareButton;
import defpackage.jc4;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes21.dex */
public class DetailActivity extends BaseTitleActivity implements View.OnClickListener, DetailMenuFragment.OnDialogDismissListener, CareButton.OnStatusChangedListener {
    private static boolean A0 = false;
    private static final String v0 = "DetailActivity";
    private static final String w0 = "friend";
    private static final int x0 = 1;
    private static final long y0 = 86400000;
    private static final int z0 = 30;
    private DetailMenuFragment A;
    private RelativesHMCircleImageView B;
    private TextView C;
    private UnitTextView D;
    private TextView E;
    private TextView F;
    private TextView G;
    private TextView H;
    private TextView I;
    private TextView J;
    private TextView K;
    private TextView L;
    private UnitTextView M;
    private TextView N;
    private CareButton Q;
    private View R;
    private ImageView U;
    private ImageView V;
    private ViewGroup W;
    private ChartProvider X;
    private ViewGroup Y;
    private ChartProvider Z;
    private ChartDataList p0;
    private ChartDataList r0;
    private FriendManager y;
    private LoadingDialog z;
    private Friend x = null;
    private Context O = this;
    public long P = 0;
    private int S = -1;
    private String T = "";
    private List<Detail> m0 = new ArrayList();
    private IChartProvider n0 = new b();
    private IChartProvider o0 = new c();
    public SparseArray<XAxisData> q0 = new SparseArray<>();
    public SparseArray<XAxisData> s0 = new SparseArray<>();
    private boolean t0 = false;
    public boolean u0 = false;

    public static class TooBusyRunnable implements Runnable {
        private View a;
        private Context b;

        public class a implements Animation.AnimationListener {
            public a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                TooBusyRunnable.this.a.setVisibility(8);
                TooBusyRunnable.this.a.clearAnimation();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        public TooBusyRunnable(View view, Context context) {
            this.a = view;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.b, R.anim.relatives_header_notify_out);
            if (animationLoadAnimation == null) {
                this.a.setVisibility(8);
            } else {
                animationLoadAnimation.setAnimationListener(new a());
                this.a.startAnimation(animationLoadAnimation);
            }
        }
    }

    public class a implements HMScrollView.OnHMScrollViewStateChanged {
        public a() {
        }

        @Override // com.xiaomi.hm.health.relation.copy.HMScrollView.OnHMScrollViewStateChanged
        public void onBottomExpand(float f) {
        }

        @Override // com.xiaomi.hm.health.relation.copy.HMScrollView.OnHMScrollViewStateChanged
        public void onExpandViewExpand(float f) {
        }

        @Override // com.xiaomi.hm.health.relation.copy.HMScrollView.OnHMScrollViewStateChanged
        public void onExpandViewExpandStart() {
        }

        @Override // com.xiaomi.hm.health.relation.copy.HMScrollView.OnHMScrollViewStateChanged
        public void onExpandViewRelease(float f) {
        }

        @Override // com.xiaomi.hm.health.relation.copy.HMScrollView.OnHMScrollViewStateChanged
        public void onScrollerScroll(float f) {
            DetailActivity detailActivity = DetailActivity.this;
            if (f > 255.0f) {
                f = 255.0f;
            }
            detailActivity.S = (int) f;
            DetailActivity detailActivity2 = DetailActivity.this;
            detailActivity2.S = detailActivity2.S < 0 ? 0 : DetailActivity.this.S;
            DetailActivity.this.getTitleBarView().setBackgroundColor(Color.argb(DetailActivity.this.S, 255, 255, 255));
            DetailActivity detailActivity3 = DetailActivity.this;
            detailActivity3.setTintColor(Color.argb(detailActivity3.S, 255, 255, 255));
        }
    }

    public class b extends ChartProvider.StatisChartProvider {
        public b() {
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartContainer */
        public ViewGroup getD() {
            return DetailActivity.this.W;
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartDataList */
        public ChartDataList getF() {
            return DetailActivity.this.p0;
        }

        @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
        public Index getCurrentIndex() {
            int count = DetailActivity.this.p0 != null ? DetailActivity.this.p0.getCount() : 0;
            int i = count != 0 ? count - 1 : 0;
            return new Index(i, new BaseIndex(i));
        }

        @Override // com.huami.chart.chart.IChartProvider
        public DrawConfig getDrawConfig() {
            return DetailActivity.this.C(true);
        }

        @Override // com.huami.chart.chart.IChartProvider
        public RenderConfig getRenderConfig() {
            return DetailActivity.this.D(true);
        }
    }

    public class c extends ChartProvider.StatisChartProvider {
        public c() {
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartContainer */
        public ViewGroup getD() {
            return DetailActivity.this.Y;
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartDataList */
        public ChartDataList getF() {
            return DetailActivity.this.r0;
        }

        @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
        public Index getCurrentIndex() {
            int count = DetailActivity.this.p0 != null ? DetailActivity.this.p0.getCount() : 0;
            int i = count != 0 ? count - 1 : 0;
            return new Index(i, new BaseIndex(i));
        }

        @Override // com.huami.chart.chart.IChartProvider
        public DrawConfig getDrawConfig() {
            return DetailActivity.this.C(false);
        }

        @Override // com.huami.chart.chart.IChartProvider
        public RenderConfig getRenderConfig() {
            return DetailActivity.this.D(false);
        }
    }

    public class d implements IScrollListener {
        public d() {
        }

        @Override // com.huami.chart.listener.IScrollListener
        public /* synthetic */ void offset(float f) {
            jc4.a(this, f);
        }

        @Override // com.huami.chart.listener.IScrollListener
        public void onScrollCurrentIndex(Index index) {
        }

        @Override // com.huami.chart.listener.IScrollListener
        public void onStartIndex(Index index) {
        }

        @Override // com.huami.chart.listener.IScrollListener
        public void onStopIndex(Index index) {
            if (index.getPosiIndex().getIndex() >= 0) {
                DetailActivity.this.V(index.getPosiIndex().getIndex());
            }
        }
    }

    public class e implements IScrollListener {
        public e() {
        }

        @Override // com.huami.chart.listener.IScrollListener
        public /* synthetic */ void offset(float f) {
            jc4.a(this, f);
        }

        @Override // com.huami.chart.listener.IScrollListener
        public void onScrollCurrentIndex(Index index) {
        }

        @Override // com.huami.chart.listener.IScrollListener
        public void onStartIndex(Index index) {
        }

        @Override // com.huami.chart.listener.IScrollListener
        public void onStopIndex(Index index) {
            if (index.getPosiIndex().getIndex() >= 0) {
                DetailActivity.this.T(index.getPosiIndex().getIndex());
            }
        }
    }

    public class f implements LoadingDialog.OnAnimEndListener {
        public f() {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onAnimEnd(LoadingDialog loadingDialog) {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onDismiss(LoadingDialog loadingDialog) {
            DetailActivity.this.finish();
        }
    }

    private void B() {
        long jCurrentTimeMillis = System.currentTimeMillis() - 2592000000L;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 30; i2++) {
            jCurrentTimeMillis += 86400000;
            calendar.setTimeInMillis(jCurrentTimeMillis);
            int i3 = calendar.get(1);
            int i4 = calendar.get(6);
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            Integer num = this.x.tz;
            int i5 = i4;
            int i6 = i3;
            arrayList.add(i2, new Detail(null, "", 0, 0, 0, lValueOf, 0, 0, 0L, 0L, Integer.valueOf(num != null ? num.intValue() : -100), 0L, 0L));
            int i7 = i;
            while (i7 < this.m0.size()) {
                Detail detail = this.m0.get(i7);
                calendar2.setTimeInMillis(detail.getCreateTime().longValue());
                int i8 = calendar2.get(1);
                int i9 = calendar2.get(6);
                int i10 = i6;
                if (i10 < i8) {
                    break;
                }
                int i11 = i5;
                if (i10 == i8 && i11 < i9) {
                    break;
                }
                if (i10 == i8 && i11 == i9) {
                    arrayList.set(i2, detail);
                    i++;
                    break;
                } else {
                    i++;
                    i7++;
                    i6 = i10;
                    i5 = i11;
                }
            }
        }
        this.m0 = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DrawConfig C(boolean z) {
        return new DrawConfig.Builder(this.O).setCanvasHeight((z ? this.W : this.Y).getMeasuredHeight()).setCanvasWidth((z ? this.W : this.Y).getMeasuredWidth()).setDataWidth(Language.isChinese() ? ChartUtil.dp2px(this.O, 30.0f) : ChartUtil.dp2px(this.O, 36.0f)).setDataMarginBottom(ChartUtil.dp2px(this.O, 22.0f)).setDataMarginTop(ChartUtil.dp2px(this.O, 15.0f)).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RenderConfig D(boolean z) {
        HMLog.i("DetailActivity", "mSummaryList size " + this.m0.size(), new Object[0]);
        boolean zIsBuildMidong = DifferenceManager.isBuildMidong();
        if (!z) {
            RenderConfig.Builder builder = new RenderConfig.Builder();
            BarStyle.Builder barStyle = new BarStyle.Builder(this.O).setBarStyle(2);
            HMColor[] hMColorArr = new HMColor[3];
            hMColorArr[0] = new HMColor(Color.parseColor(zIsBuildMidong ? "#99985FFC" : "#7E70D0"), Color.parseColor(zIsBuildMidong ? "#985FFC" : "#6655BB"));
            hMColorArr[1] = new HMColor(Color.parseColor(zIsBuildMidong ? "#9941A8FF" : "#9185D7"), Color.parseColor(zIsBuildMidong ? "#41A8FF" : "#7C6EC5"));
            hMColorArr[2] = new HMColor(Color.parseColor(zIsBuildMidong ? "#991AAF4C" : "#06B666"), Color.parseColor(zIsBuildMidong ? "#1AAF4C" : "#049553"));
            return builder.setBarStyle(barStyle.setBarColors(hMColorArr).create()).setAxisStyle(new AxisStyle.Builder(this.O).setXAxisData(this.s0).setAxisStyle(4128).setXAxisLabelBgColor(ContextCompat.getColor(this.O, R.color.s38)).setZeroY(ChartUtil.dp2px(this.O, 22.0f)).setXLabelColor(ContextCompat.getColor(this.O, R.color.s2)).setXLabelSize(ChartUtil.sp2px(this.O, Language.isChinese() ? 9.8f : 8.5f)).setXLabelTypeface(TypefaceManager.get().getTypeface(this.O, Font.KM)).setXLabelMarginTop(ChartUtil.dp2px(this.O, 9.0f)).create()).create();
        }
        int iLoadColor = ViewExtKt.loadColor(this.G, R.color.s30);
        RenderConfig.Builder builder2 = new RenderConfig.Builder();
        BarStyle.Builder clipRange = new BarStyle.Builder(this.O).setBarStyle(2).setClipRange(false);
        HMColor[] hMColorArr2 = new HMColor[1];
        int iAddAlpha = zIsBuildMidong ? NumberExtKt.addAlpha(iLoadColor, 0.4d) : Color.parseColor("#664191E1");
        if (!zIsBuildMidong) {
            iLoadColor = Color.parseColor("#4191E1");
        }
        hMColorArr2[0] = new HMColor(iAddAlpha, iLoadColor);
        return builder2.setBarStyle(clipRange.setBarColors(hMColorArr2).create()).setAxisStyle(new AxisStyle.Builder(this.O).setXAxisData(this.q0).setAxisStyle(4128).setXAxisLabelBgColor(ContextCompat.getColor(this, R.color.s38)).setZeroY(ChartUtil.dp2px(this.O, 22.0f)).setXLabelColor(ContextCompat.getColor(this.O, R.color.s2)).setXLabelSize(ChartUtil.sp2px(this.O, Language.isChinese() ? 9.8f : 8.5f)).setXLabelTypeface(TypefaceManager.get().getTypeface(this.O, Font.KM)).setXLabelMarginTop(ChartUtil.dp2px(this.O, 9.0f)).create()).create();
    }

    private void E(int i, int i2, long j, SparseArray<XAxisData> sparseArray) {
        if (i == i2 - 1) {
            sparseArray.put(i, new XAxisData(i, this.O.getString(R.string.relatives_today)));
            return;
        }
        if (i != i2 - 2) {
            if (j > 0) {
                sparseArray.put(i, new XAxisData(i, TimeUtils.formatDate_no_y(this.O, j, true)));
                return;
            } else {
                sparseArray.put(i, new XAxisData(i, ""));
                return;
            }
        }
        if (Language.isChinese()) {
            sparseArray.put(i, new XAxisData(i, this.O.getString(R.string.relatives_yesterday)));
        } else if (j > 0) {
            sparseArray.put(i, new XAxisData(i, TimeUtils.formatDate_no_y(this.O, j, true)));
        } else {
            sparseArray.put(i, new XAxisData(i, ""));
        }
    }

    private String F(int i) {
        return String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(i));
    }

    private String G(String str) {
        return String.format(Locale.getDefault(), "%.1f", new BigDecimal(str));
    }

    private void H() {
        U();
        this.W = (ViewGroup) findViewById(R.id.step_chart_container);
        ChartProvider chartProvider = new ChartProvider(this, true);
        this.X = chartProvider;
        chartProvider.createChart(this.n0, true, true, true, false);
        this.W.post(new Runnable() { // from class: r61
            @Override // java.lang.Runnable
            public final void run() {
                this.a.I();
            }
        });
        S();
        this.Y = (ViewGroup) findViewById(R.id.sleep_chart_container);
        ChartProvider chartProvider2 = new ChartProvider(this, true);
        this.Z = chartProvider2;
        chartProvider2.createChart(this.o0, true, true, true, false);
        this.Y.post(new Runnable() { // from class: q61
            @Override // java.lang.Runnable
            public final void run() {
                this.a.J();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        this.X.getChart().setIScrollListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        this.Z.getChart().setIScrollListener(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(DialogInterface dialogInterface, int i) {
        FriendManager.getInstance().writeUserGuideState(this, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(DialogInterface dialogInterface, int i) {
        if (!NetUtil.isNetworkConnected(this)) {
            IconToast.showToast(this, R.drawable.relatives_icon_toast_error, getString(R.string.relatives_no_network), 0);
            return;
        }
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.relatives_cancel_loading));
        this.z = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
        this.y.removeFriend(this.x.uid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int M(Detail detail, Detail detail2) {
        return (int) (detail.createTime.longValue() - detail2.createTime.longValue());
    }

    private void N() {
        String dateTime_y;
        RelativesHMCircleImageView relativesHMCircleImageView = this.B;
        Friend friend = this.x;
        AvatarManager.updateAvatarUI(relativesHMCircleImageView, friend.icon, true, friend.getDisplayName());
        setTitleText(this.x.getDisplayName());
        this.Q.setText(this.x.careCountByMe + "");
        Integer num = this.x.tz;
        if (num != null && num.intValue() != -100) {
            this.T = this.x.tz.intValue() > 0 ? getString(R.string.relatives_friend_timezone_prex, new Object[]{Integer.valueOf(this.x.tz.intValue() / 3600)}) : getString(R.string.relatives_friend_timezone_prex_f, new Object[]{Integer.valueOf(Math.abs(this.x.tz.intValue()) / 3600)});
        }
        if (this.x.lastUpdateTime.longValue() == 0) {
            dateTime_y = getString(R.string.relatives_label_no_update);
        } else {
            Integer num2 = this.x.tz;
            if (num2 == null || num2.intValue() == -100) {
                dateTime_y = TimeUtils.formatDateTime_y(RelationExternalsKt.getFriendsAndFamilyInjectDelegate().getAppContext(), this.x.lastUpdateTime.longValue());
            } else {
                TimeZone timeZone = Calendar.getInstance().getTimeZone();
                timeZone.setRawOffset(this.x.tz.intValue() * 1000);
                dateTime_y = TimeUtils.formatDateTime_y(RelationExternalsKt.getFriendsAndFamilyInjectDelegate().getAppContext(), TimeUtils.transformTime(new Date(this.x.lastUpdateTime.longValue()), Calendar.getInstance().getTimeZone(), timeZone).getTime());
            }
        }
        if (Utils.isRTL()) {
            setSubTitleText(getString(R.string.relatives_label_update_time, new Object[]{dateTime_y + this.T}));
        } else {
            setSubTitleText(getString(R.string.relatives_label_update_time, new Object[]{this.T + dateTime_y}));
        }
        this.C.setText(F(this.x.step.intValue()));
        Q(this.D, this.x.sleepTime.intValue());
        String[] weight = FriendUtils.formatWeight(this, FriendUtils.transformWeight(this.x.weight.intValue()));
        ((TextView) findViewById(R.id.weight_title)).setText(getString(R.string.relatives_label_weight, new Object[]{weight[1]}));
        this.E.setText(G(weight[0]));
    }

    private void O() {
        this.Q.setText(this.x.careCountByMe + "");
        setTitleText(this.x.getDisplayName());
        loadDetailInfo();
        N();
    }

    private void P(UnitTextView unitTextView) {
        unitTextView.setValues(F(0), getString(R.string.relatives_unit_hour), F(0), getString(R.string.relatives_unit_min));
    }

    private void Q(UnitTextView unitTextView, int i) {
        unitTextView.setValues(F(i / 60), getString(R.string.relatives_unit_hour), F(i % 60), getString(R.string.relatives_unit_min));
    }

    private void R() {
        if (this.A == null) {
            DetailMenuFragment detailMenuFragmentNewInstance = DetailMenuFragment.newInstance();
            this.A = detailMenuFragmentNewInstance;
            detailMenuFragmentNewInstance.setOnMenuItemClickListener(this);
        }
        this.A.setOnDismissListener(this);
        this.A.show(getSupportFragmentManager(), (String) null);
    }

    private void S() {
        SparseArray sparseArray = new SparseArray();
        if (!this.m0.isEmpty()) {
            int size = this.m0.size();
            for (int i = 0; i < size; i++) {
                Detail detail = this.m0.get(i);
                sparseArray.put(i, detail.getStep() != null ? new ChartData(i, new float[]{detail.deepSleep.intValue(), detail.shallowSleep.intValue(), detail.dt.longValue()}) : new ChartData(i, new float[]{0.0f}));
                E(i, size, detail.createTime.longValue(), this.s0);
            }
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        this.r0 = chartDataList;
        chartDataList.setStart(0);
        this.r0.setEnd(this.m0.size());
        this.r0.setShownCount(11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    public void T(int i) {
        String string;
        int iIntValue;
        if (this.m0.isEmpty()) {
            return;
        }
        Detail detail = this.m0.get(i);
        int iIntValue2 = -100;
        if (detail.tz.intValue() > 0) {
            string = getString(R.string.relatives_friend_timezone_prex, new Object[]{Integer.valueOf(detail.tz.intValue() / 3600)});
        } else {
            string = detail.tz.intValue() == -100 ? this.T : getString(R.string.relatives_friend_timezone_prex_f, new Object[]{Integer.valueOf(Math.abs(detail.tz.intValue()) / 3600)});
        }
        this.K.setText(TimeUtils.formatDate_no_y(RelationExternalsKt.getFriendsAndFamilyInjectDelegate().getAppContext(), detail.createTime.longValue(), false) + string);
        if (detail.getUid().isEmpty()) {
            TextView textView = this.N;
            int i2 = R.string.relatives_data_zero;
            textView.setText(i2);
            this.M.setValues("--", "");
            this.L.setText(i2);
            return;
        }
        Long l = detail.fallSleepTime;
        if (l != null && l.equals(detail.wakeTime)) {
            P(this.M);
            this.N.setText(formatTime(getTimestamp(), -100));
            this.L.setText(formatTime(getTimestamp(), -100));
            return;
        }
        TextView textView2 = this.N;
        long jLongValue = detail.fallSleepTime.longValue();
        Integer num = detail.tz;
        if (num == null) {
            Integer num2 = this.x.tz;
            iIntValue = num2 == null ? -100 : num2.intValue();
        } else {
            iIntValue = num.intValue();
        }
        textView2.setText(formatTime(jLongValue, iIntValue));
        Q(this.M, detail.totalSleeptime.intValue());
        TextView textView3 = this.L;
        long jLongValue2 = detail.wakeTime.longValue();
        Integer num3 = detail.tz;
        if (num3 == null) {
            Integer num4 = this.x.tz;
            if (num4 != null) {
                iIntValue2 = num4.intValue();
            }
        } else {
            iIntValue2 = num3.intValue();
        }
        textView3.setText(formatTime(jLongValue2, iIntValue2));
    }

    private void U() {
        ChartData chartData;
        SparseArray sparseArray = new SparseArray();
        if (!this.m0.isEmpty()) {
            int size = this.m0.size();
            HMLog.i("DetailActivity", "mSummaryList size " + this.m0.size(), new Object[0]);
            for (int i = 0; i < size; i++) {
                Detail detail = this.m0.get(i);
                if (detail.getStep() != null) {
                    HMLog.i("DetailActivity", "inde x " + i + " step " + detail.getStep() + " summery.date " + detail.getCreateTime(), new Object[0]);
                    chartData = new ChartData(i, (float) detail.getStep().intValue());
                } else {
                    chartData = new ChartData(i, 0.0f);
                }
                sparseArray.put(i, chartData);
                E(i, size, detail.createTime.longValue(), this.q0);
            }
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        this.p0 = chartDataList;
        chartDataList.setStart(0);
        this.p0.setEnd(this.m0.size());
        this.p0.setShownCount(11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    public void V(int i) {
        String string;
        if (this.m0.isEmpty()) {
            return;
        }
        Detail detail = this.m0.get(i);
        if (detail.tz.intValue() > 0) {
            string = getString(R.string.relatives_friend_timezone_prex, new Object[]{Integer.valueOf(detail.tz.intValue() / 3600)});
        } else {
            string = detail.tz.intValue() == -100 ? this.T : getString(R.string.relatives_friend_timezone_prex_f, new Object[]{Integer.valueOf(Math.abs(detail.tz.intValue()) / 3600)});
        }
        String[] distance = com.xiaomi.hm.health.relation.chart.util.ChartData.formatDistance(this, detail.distance.intValue());
        this.I.setText(getString(R.string.relatives_label_mileage, new Object[]{distance[1]}));
        this.F.setText(TimeUtils.formatDate_no_y(RelationExternalsKt.getFriendsAndFamilyInjectDelegate().getAppContext(), detail.createTime.longValue(), false) + string);
        if (!detail.getUid().isEmpty()) {
            this.G.setText(F(detail.step.intValue()));
            this.H.setText(distance[0]);
            this.J.setText(F(detail.calorie.intValue()));
        } else {
            TextView textView = this.G;
            int i2 = R.string.relatives_data_zero;
            textView.setText(i2);
            this.H.setText(i2);
            this.J.setText(i2);
        }
    }

    public static Intent createIntent(Context context, Friend friend) {
        Intent intent = new Intent(context, (Class<?>) DetailActivity.class);
        intent.putExtra("friend", friend);
        A0 = false;
        return intent;
    }

    public static Intent createIntentFromService(Context context, Friend friend) {
        Intent intent = new Intent(context, (Class<?>) DetailActivity.class);
        intent.putExtra("friend", friend);
        A0 = true;
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        R();
    }

    private void hideProgressDialog() {
        LoadingDialog loadingDialog = this.z;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.z.hide();
        this.z.dismiss();
    }

    public String formatTime(long j, int i) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        if (i == -100) {
            return simpleDateFormat.format(new Date(j * 1000));
        }
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        timeZone.setRawOffset(i * 1000);
        return simpleDateFormat.format(Long.valueOf(TimeUtils.transformTime(new Date(j * 1000), Calendar.getInstance().getTimeZone(), timeZone).getTime()));
    }

    public long getTimestamp() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5));
        return calendar.getTimeInMillis();
    }

    public void loadDetailInfo() {
        this.y.loadDetailInfo(this.x.uid, this.x.lastDetailUpdateTime.longValue() < this.x.lastUpdateTime.longValue());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (1 == i && i2 == -1) {
            this.x.remarkName = intent.getStringExtra("username");
            N();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Friend friend;
        int id = view.getId();
        if (id != R.id.care_button) {
            if (id == R.id.action_remark) {
                startActivityForResult(RemarkActivity.createIntent(this, this.x), 1);
                return;
            } else if (id == R.id.action_remove_friend) {
                new AlertDialogFragment.Builder(this).setTitle(R.string.relatives_friend_unfollow_confirm_title).setMessage(R.string.relatives_friend_unfollow_confirm_body).setPositiveButton(R.string.relatives_friend_unfollow_confirm_yes, new DialogInterface.OnClickListener() { // from class: n61
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.a.L(dialogInterface, i);
                    }
                }).setNegativeButton(R.string.relatives_friend_unfollow_confirm_no, (DialogInterface.OnClickListener) null).show(getSupportFragmentManager());
                return;
            } else {
                if (id == R.id.more_button) {
                    R();
                    return;
                }
                return;
            }
        }
        if (!NetUtil.isNetworkConnected(this)) {
            IconToast.showToast(this, R.drawable.relatives_icon_toast_error, getString(R.string.relatives_no_network), 0);
            return;
        }
        if (!this.y.readUserGuideState(this)) {
            new AlertDialogFragment.Builder(this).setMessage(R.string.relatives_friend_new_user_guide).setNeutralButton(R.string.relatives_friend_new_user_guide_ok, new DialogInterface.OnClickListener() { // from class: o61
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.K(dialogInterface, i);
                }
            }).show(getSupportFragmentManager());
            return;
        }
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.relatives_relation_loading));
        this.z = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
        if (isFinishing() || this.y == null || (friend = this.x) == null || friend.uid == null) {
            return;
        }
        Analytics.event(this, "Relatives_CareFor");
        this.y.sendCareToFriend(this, this.x.uid, this.t0);
        this.t0 = false;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.relatives_activity_detail);
        getRightImage().setOnClickListener(new View.OnClickListener() { // from class: p61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
        Intent intent = getIntent();
        if (intent != null) {
            this.x = (Friend) intent.getParcelableExtra("friend");
        }
        Friend friend = this.x;
        if (friend == null) {
            CustomToast.makeText(this, R.string.relatives_toast_user_info_error, 0);
            return;
        }
        FriendFragKt.setUnifyTitleStyle(this, friend.getDisplayName());
        setRightImageRes(R.drawable.common_title_more, R.color.s1);
        TextViewCompat.setAutoSizeTextTypeWithDefaults(getTitleTextView(), 1);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(getTitleTextView(), 6, 14, 2, 2);
        TimeZone timeZone = TimeZone.getDefault();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        this.P = (jCurrentTimeMillis - (jCurrentTimeMillis % 86400)) - ((long) (timeZone.getRawOffset() / 1000));
        this.u0 = Language.isEnglish();
        CareButton careButton = (CareButton) findViewById(R.id.care_button);
        this.Q = careButton;
        careButton.setOnClickListener(this);
        this.Q.setOnStatusChangedListener(this);
        this.Q.setText(this.x.careCountByMe + "");
        this.R = findViewById(R.id.toast_view);
        HMScrollView hMScrollView = (HMScrollView) findViewById(R.id.scroll_view);
        HMExpandHeadView hMExpandHeadView = (HMExpandHeadView) findViewById(R.id.header_view);
        ViewGroup.LayoutParams layoutParams = hMExpandHeadView.getLayoutParams();
        int iDip2px = Utils.dip2px(this.O, 270.0f) + BaseTitleActivity.getStatusBarHeight(this.O);
        layoutParams.height = iDip2px;
        hMScrollView.setHeadViewRawHeight(iDip2px);
        hMExpandHeadView.setLayoutParams(layoutParams);
        hMScrollView.setHeadView(hMExpandHeadView);
        hMScrollView.setOnHMScrollViewStateChanged(new a());
        RelativesHMCircleImageView relativesHMCircleImageView = (RelativesHMCircleImageView) findViewById(R.id.detail_icon);
        this.B = relativesHMCircleImageView;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) relativesHMCircleImageView.getLayoutParams();
        marginLayoutParams.setMargins(0, Utils.dip2px(this.O, 48.9f) + BaseTitleActivity.getStatusBarHeight(this.O) + marginLayoutParams.topMargin, 0, 0);
        this.C = (TextView) findViewById(R.id.step);
        this.D = (UnitTextView) findViewById(R.id.sleep);
        this.E = (TextView) findViewById(R.id.weight);
        this.F = (TextView) findViewById(R.id.activity_date);
        this.K = (TextView) findViewById(R.id.sleep_date);
        this.J = (TextView) findViewById(R.id.day_heat);
        this.G = (TextView) findViewById(R.id.day_step);
        String[] distance = com.xiaomi.hm.health.relation.chart.util.ChartData.formatDistance(this, 0);
        TextView textView = (TextView) findViewById(R.id.distance_title);
        this.I = textView;
        textView.setText(getString(R.string.relatives_label_mileage, new Object[]{distance[1]}));
        this.H = (TextView) findViewById(R.id.day_mileage);
        UnitTextView unitTextView = (UnitTextView) findViewById(R.id.day_sleep);
        this.M = unitTextView;
        unitTextView.setValues("--", "");
        this.L = (TextView) findViewById(R.id.get_up_time);
        this.N = (TextView) findViewById(R.id.day_sleep_start);
        this.U = (ImageView) findViewById(R.id.step_icon);
        this.V = (ImageView) findViewById(R.id.sleep_icon);
        if (!DifferenceManager.isBuildMidong()) {
            this.U.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.relatives_icon_friend_step_mifit));
            this.V.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.relatives_icon_friend_sleep_mifit));
        }
        N();
        H();
        MessageManager.getDefault(getApplicationContext()).register(this);
        this.y = FriendManager.getInstance();
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.relatives_relation_data_loading));
        this.z = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(true);
        if (A0) {
            this.y.loadFriendList(0, 10, true, false, true, true);
        } else {
            O();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.relatives_menu_detail, menu);
        return true;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MessageManager.getDefault(getApplicationContext()).unregister(this);
    }

    @Override // com.xiaomi.hm.health.relation.DetailMenuFragment.OnDialogDismissListener
    public void onDismiss() {
        if (SystemBarTintSupport.isSupport(this)) {
            getWindow().getDecorView().destroyDrawingCache();
            return;
        }
        View viewFindViewById = findViewById(android.R.id.content);
        if (viewFindViewById != null) {
            viewFindViewById.destroyDrawingCache();
        }
    }

    public void onEvent(EventDetailLoad eventDetailLoad) {
        if (eventDetailLoad.uid.equals(this.x.uid)) {
            hideProgressDialog();
            HMLog.i("DetailActivity", "EventDetailLoad:" + eventDetailLoad.success, new Object[0]);
            if (!eventDetailLoad.success) {
                IconToast.showError(this, getString(R.string.relatives_load_fail));
                return;
            }
            List<Detail> list = eventDetailLoad.items;
            this.m0 = list;
            Collections.sort(list, new Comparator() { // from class: s61
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DetailActivity.M((Detail) obj, (Detail) obj2);
                }
            });
            B();
            U();
            this.X.createChart(this.n0, true, true, true, false);
            V(this.m0.size() - 1);
            S();
            this.Z.createChart(this.o0, true, true, true, false);
            T(this.m0.size() - 1);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_more) {
            return super.onOptionsItemSelected(menuItem);
        }
        R();
        return true;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Analytics.event(this, "Relatives_Details");
    }

    @Override // com.xiaomi.hm.health.relation.view.CareButton.OnStatusChangedListener
    public void onStatusChanged(View view, int i) {
        if (i == 2) {
            this.R.setVisibility(0);
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.relatives_header_notify_in);
            if (animationLoadAnimation != null) {
                this.R.startAnimation(animationLoadAnimation);
            }
            View view2 = this.R;
            view2.postDelayed(new TooBusyRunnable(view2, this), 1500L);
        }
    }

    public void onEvent(EventFriendRemoved eventFriendRemoved) {
        if (eventFriendRemoved.uid.equals(this.x.uid)) {
            if (eventFriendRemoved.code == 1) {
                this.z.setSuccess(getString(R.string.relatives_cancel_focus_success), new f());
            } else {
                hideProgressDialog();
                IconToast.showError(this, getString(R.string.relatives_cancel_focus_fail));
                this.Q.setEnabled(true);
            }
            Utils.hideProgressDialog(this);
        }
    }

    public void onEvent(EventCareSend eventCareSend) {
        if (eventCareSend.uid.equals(this.x.uid)) {
            if (eventCareSend.success) {
                this.z.setSuccess(getString(R.string.relatives_love_success));
                Friend friend = this.x;
                friend.careCountByMe = Integer.valueOf(friend.careCountByMe.intValue() + 1);
                N();
                this.Q.onLoadFinished();
                return;
            }
            hideProgressDialog();
            IconToast.showError(this, getString(R.string.relatives_love_fail));
            this.Q.onLoadFinished();
        }
    }

    public void onEvent(EventFriendLoad eventFriendLoad) {
        int i = eventFriendLoad.resultCode;
        if (i != 0 && eventFriendLoad.errorTips) {
            if (i == -2) {
                CustomToast.makeText(this, R.string.relatives_no_network_connection, 1).show();
            } else {
                CustomToast.makeText(this, R.string.relatives_friend_list_get_error, 1).show();
            }
        }
        List<Friend> list = eventFriendLoad.friends;
        if (list != null && list.size() != 0) {
            for (Friend friend : eventFriendLoad.friends) {
                if (friend.uid.length() > 0 && friend.uid.equals(this.x.uid)) {
                    this.x = friend;
                    O();
                    return;
                }
            }
            return;
        }
        CustomToast.makeText(this, R.string.relatives_toast_user_info_error, 0);
    }
}
