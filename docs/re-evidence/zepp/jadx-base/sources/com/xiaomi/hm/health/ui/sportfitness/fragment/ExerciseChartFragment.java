package com.xiaomi.hm.health.ui.sportfitness.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.BarStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.HMColor;
import com.huami.chart.util.Index;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.eventbus.EventViewPagerSlideEnableChanged;
import com.xiaomi.hm.health.ui.sportfitness.enums.ExerciseTimeFilterType;
import com.xiaomi.hm.health.ui.sportfitness.event.EventUpdateStatUI;
import com.xiaomi.hm.health.ui.sportfitness.manager.ExerciseInfoManager;
import com.xiaomi.hm.health.ui.sportfitness.manager.ExerciseTypeChooseManager;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import com.xiaomi.hm.health.ui.sportfitness.model.ExerciseInfo;
import com.xiaomi.hm.health.ui.sportfitness.view.ExerciseHeaderCount;
import de.greenrobot.event.EventBus;
import defpackage.nc4;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class ExerciseChartFragment extends Fragment {
    private static final int A = 34;
    private static final float B = 6.0f;
    private static final float C = 45.0f;
    private static final float D = 10.0f;
    private static final float E = 25.0f;
    private static final int F = 9;
    private static final int G = 19;
    private static final String r = "ExerciseChartFragment";
    private static final String s = "statBy";
    private static final String t = "range";
    private static final int u = 0;
    private static final int v = 1;
    private static final int w = 200;
    private static final int x = 7;
    private static final int y = 12;
    private static final int z = 33;
    private Context a;
    private ChartProvider b;
    private List<ExerciseInfo> c;
    private ExerciseInfoManager d;
    private ExerciseTimeFilterType e;
    private String f;
    private SimpleDateFormat g;
    private Calendar h;
    private int i;
    private Handler j;
    private boolean k;
    private ViewGroup l;
    private LinearLayout m;
    private RelativeLayout n;
    private LinearLayout o;
    private Map<Integer, ExerciseInfo> p = new HashMap();
    private List<ExerciseInfo> q = new ArrayList();

    public class a extends ChartProvider.StatisChartProvider {
        public a() {
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartContainer */
        public ViewGroup getA() {
            return ExerciseChartFragment.this.l;
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartDataList */
        public ChartDataList getB() {
            return ExerciseChartFragment.this.i();
        }

        @Override // com.huami.chart.chart.IChartProvider
        public DrawConfig getDrawConfig() {
            return ExerciseChartFragment.this.j();
        }

        @Override // com.huami.chart.chart.IChartProvider
        public RenderConfig getRenderConfig() {
            return ExerciseChartFragment.this.k();
        }
    }

    public class b implements Runnable {

        public class a implements ITouchListener {
            public a() {
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(Index i) {
                HMLog.d(ExerciseChartFragment.r, "onDown... " + i, new Object[0]);
                if (ExerciseChartFragment.this.k) {
                    return;
                }
                ExerciseChartFragment.this.j.sendEmptyMessageDelayed(1, 200L);
                ExerciseChartFragment.this.k = true;
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(Index i) {
                EventBus.getDefault().post(new EventViewPagerSlideEnableChanged(true));
                if (ExerciseChartFragment.this.k) {
                    ExerciseChartFragment.this.j.removeMessages(1);
                    ExerciseChartFragment.this.k = false;
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExerciseChartFragment.this.b.getChart().registerTouchListener(new a());
        }
    }

    public static class c extends Handler {
        private final WeakReference<ExerciseChartFragment> a;

        public c(ExerciseChartFragment dialog) {
            this.a = new WeakReference<>(dialog);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (this.a.get() == null || msg.what != 1) {
                return;
            }
            EventBus.getDefault().post(new EventViewPagerSlideEnableChanged(false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ChartDataList i() {
        SparseArray sparseArray = new SparseArray();
        Calendar calendar = Calendar.getInstance();
        if (this.c != null) {
            if (this.e == ExerciseTimeFilterType.YEAR) {
                this.c = l(calendar);
            }
            for (ExerciseInfo exerciseInfo : this.c) {
                calendar.setTimeInMillis(exerciseInfo.startTime * 1000);
                ExerciseTimeFilterType exerciseTimeFilterType = this.e;
                if (exerciseTimeFilterType == ExerciseTimeFilterType.WEEK) {
                    int i = calendar.get(7);
                    int i2 = i != 1 ? i - 1 : 7;
                    HMLog.d(r, "week day:" + i2, new Object[0]);
                    exerciseInfo.day = i2;
                } else if (exerciseTimeFilterType == ExerciseTimeFilterType.MONTH) {
                    exerciseInfo.day = calendar.get(5);
                }
                HMLog.d(r, "exercise day:" + exerciseInfo.day + ",real day:" + TimeUtils.formatDate_no_y(BraceletApp.getContext(), calendar.getTime(), false), new Object[0]);
                int i3 = (int) exerciseInfo.costTime;
                int i4 = (int) exerciseInfo.distance;
                boolean z2 = ExerciseTypeChooseManager.getInstance().getHeaderMainDataType() == 0;
                HistoryRecordManager.getInstance().isOverSea();
                ChartData chartData = new ChartData(exerciseInfo.day - 1, z2 ? i4 : i3);
                sparseArray.put(chartData.getIndex(), chartData);
            }
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setMinValue(0.0f);
        chartDataList.setStart(0);
        ExerciseTimeFilterType exerciseTimeFilterType2 = this.e;
        if (exerciseTimeFilterType2 == ExerciseTimeFilterType.WEEK) {
            chartDataList.setEnd(6);
        } else if (exerciseTimeFilterType2 == ExerciseTimeFilterType.MONTH) {
            chartDataList.setEnd(this.i - 1);
        } else {
            chartDataList.setEnd(11);
        }
        return chartDataList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DrawConfig j() {
        float f;
        ExerciseTimeFilterType exerciseTimeFilterType = this.e;
        if (exerciseTimeFilterType == ExerciseTimeFilterType.WEEK) {
            f = 22.5f;
        } else {
            f = exerciseTimeFilterType == ExerciseTimeFilterType.MONTH ? 5.0f : 12.5f;
        }
        float f2 = 6.0f + f;
        return new DrawConfig.Builder(this.a).setCanvasHeight(this.l.getMeasuredHeight()).setCanvasWidth(this.l.getMeasuredWidth()).setDataMarginTop(0.0f).setDataMarginLeft(ChartUtil.dp2px(this.a, f2)).setDataMarginRight(ChartUtil.dp2px(this.a, f2)).setDataWidth(ChartUtil.dp2px(this.a, f * 2.0f)).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RenderConfig k() {
        return new RenderConfig.Builder().setBarStyle(new BarStyle.Builder(this.a).setBarStyle(2).setBarColors(new HMColor[]{new HMColor(ContextCompat.getColor(this.a, R.color.exercise_chart_bar_color), ContextCompat.getColor(this.a, R.color.exercise_chart_bar_highlight_color))}).create()).setAxisStyle(new AxisStyle.Builder(this.a).setXLabelColor(-15684665).setXLabelSize(ChartUtil.sp2px(this.a, 12.0f)).create()).create();
    }

    private List<ExerciseInfo> l(Calendar cal) {
        for (ExerciseInfo exerciseInfo : this.c) {
            cal.setTimeInMillis(exerciseInfo.startTime * 1000);
            int i = cal.get(2) + 1;
            ExerciseInfo exerciseInfo2 = this.p.get(Integer.valueOf(i));
            if (exerciseInfo2 != null) {
                exerciseInfo2.day = i;
                exerciseInfo2.costTime = exerciseInfo.costTime + exerciseInfo2.costTime;
                exerciseInfo2.distance = exerciseInfo.distance + exerciseInfo2.distance;
                this.p.put(Integer.valueOf(i), exerciseInfo2);
            } else {
                ExerciseInfo exerciseInfo3 = new ExerciseInfo();
                exerciseInfo3.day = i;
                exerciseInfo3.costTime = exerciseInfo.costTime;
                exerciseInfo3.distance = exerciseInfo.distance;
                this.p.put(Integer.valueOf(i), exerciseInfo3);
            }
        }
        Iterator<Map.Entry<Integer, ExerciseInfo>> it2 = this.p.entrySet().iterator();
        while (it2.hasNext()) {
            this.q.add(it2.next().getValue());
        }
        return this.q;
    }

    private void m() {
        if (this.c == null) {
            return;
        }
        this.b.createChart(new a(), true, false);
        this.l.post(new b());
    }

    public static ExerciseChartFragment newInstance(ExerciseTimeFilterType filterType, String range) {
        ExerciseChartFragment exerciseChartFragment = new ExerciseChartFragment();
        Bundle bundle = new Bundle();
        bundle.putString("range", range);
        bundle.putSerializable(s, filterType);
        exerciseChartFragment.setArguments(bundle);
        return exerciseChartFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StringBuilder sb = new StringBuilder();
        sb.append("onCreate... ");
        sb.append(getArguments() == null ? " null.... " : "not null");
        HMLog.d(r, sb.toString(), new Object[0]);
        this.a = getActivity();
        this.j = new c(this);
        this.b = new ChartProvider(this.a);
        this.g = new SimpleDateFormat("yyyy-MM", Locale.getDefault());
        this.d = ExerciseInfoManager.getInstance();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.e = (ExerciseTimeFilterType) arguments.getSerializable(s);
            this.f = arguments.getString("range");
            HMLog.d(r, "mStatRange==" + this.f, new Object[0]);
            this.c = this.d.getExerciseInfosByKey(this.f);
            if (this.e == ExerciseTimeFilterType.MONTH) {
                this.h = Calendar.getInstance();
                if (!TextUtils.isEmpty(this.f)) {
                    try {
                        this.h.setTime(this.g.parse(this.f.split("X")[0]));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                this.i = this.h.getActualMaximum(5);
            }
        }
        EventBus.getDefault().register(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int i = 0;
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_exercise_chart, container, false);
        this.l = (ViewGroup) viewGroup.findViewById(R.id.chart_container);
        this.m = (LinearLayout) viewGroup.findViewById(R.id.week_xaxis_layout);
        this.n = (RelativeLayout) viewGroup.findViewById(R.id.month_xaxis_layout);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.year_xaxis_layout);
        this.o = linearLayout;
        ExerciseTimeFilterType exerciseTimeFilterType = this.e;
        if (exerciseTimeFilterType == ExerciseTimeFilterType.WEEK) {
            this.m.setVisibility(0);
            this.n.setVisibility(8);
            this.o.setVisibility(8);
            int childCount = this.m.getChildCount();
            String[] stringArray = this.a.getResources().getStringArray(R.array.weeks_short);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != 0 && i2 != childCount - 1) {
                    ((TextView) this.m.getChildAt(i2)).setText(stringArray[i2]);
                }
            }
            if (!TextUtils.isEmpty(this.f)) {
                String[] strArrSplit = this.f.split("X");
                Date stringToDate = TimeUtils.parseStringToDate("yyyy-MM-dd", strArrSplit[0]);
                Date stringToDate2 = TimeUtils.parseStringToDate("yyyy-MM-dd", strArrSplit[1]);
                ((TextView) this.m.getChildAt(0)).setText(TimeUtils.formatDate_no_y(getContext(), stringToDate, true));
                ((TextView) this.m.getChildAt(childCount - 1)).setText(TimeUtils.formatDate_no_y(getContext(), stringToDate2, true));
            }
        } else if (exerciseTimeFilterType == ExerciseTimeFilterType.MONTH) {
            this.n.setVisibility(0);
            this.m.setVisibility(8);
            this.o.setVisibility(8);
            float f = (ExerciseHeaderCount.screenWidthDp - 12.0f) / this.i;
            TextView textView = (TextView) this.n.findViewById(R.id.month_xaxis_start);
            TextView textView2 = (TextView) this.n.findViewById(R.id.month_xaxis_10);
            TextView textView3 = (TextView) this.n.findViewById(R.id.month_xaxis_20);
            TextView textView4 = (TextView) this.n.findViewById(R.id.month_xaxis_end);
            int iDp2px = (int) ViewUtils.dp2px(this.a, 5.0f);
            this.h.set(5, 1);
            textView.setText(TimeUtils.formatDate_no_y(getContext(), this.h.getTime(), true));
            float f2 = iDp2px;
            textView2.setTranslationX((ChartUtil.dp2px(this.a, f) * 9.0f) - f2);
            this.h.set(5, 10);
            textView2.setText(TimeUtils.formatDate_no_y(getContext(), this.h.getTime(), true));
            textView3.setTranslationX((ChartUtil.dp2px(this.a, f) * 19.0f) - f2);
            this.h.set(5, 20);
            textView3.setText(TimeUtils.formatDate_no_y(getContext(), this.h.getTime(), true));
            this.h.set(5, this.i);
            textView4.setText(TimeUtils.formatDate_no_y(getContext(), this.h.getTime(), true));
        } else {
            linearLayout.setVisibility(0);
            this.n.setVisibility(8);
            this.m.setVisibility(8);
            int childCount2 = this.o.getChildCount();
            while (i < childCount2) {
                TextView textView5 = (TextView) this.o.getChildAt(i);
                i++;
                textView5.setText(String.valueOf(i));
            }
        }
        m();
        return viewGroup;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(EventUpdateStatUI event) {
        m();
    }
}
