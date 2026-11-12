package com.huami.watch.companion.firstbeat;

import android.animation.Animator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.huami.watch.companion.R;
import com.huami.watch.companion.dataflow.FirstbeatData;
import com.huami.watch.companion.util.ChartTimeUtil;
import com.huami.watch.dataflow.chart.StatisticChart;
import com.huami.watch.dataflow.chart.StatisticChartView;
import com.huami.watch.dataflow.chart.data.AsyncChartDataLoader;
import com.huami.watch.dataflow.chart.data.ChartDataLoader;
import com.huami.watch.dataflow.model.firstbeat.bean.VO2maxDataItem;
import com.huami.watch.util.DateDay;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes16.dex */
public class VO2maxChartFragment extends Fragment {
    private String[] a;
    private StatisticChartView b;
    private DateDay c;
    private DateDay d;
    private c e;
    private int f;
    private int g;
    private TextView h;
    private TextView i;
    private View j;
    private TextView k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VO2maxChartFragment.this.b.clearData();
            VO2maxChartFragment.this.b.loadStatisticData(0, true);
            VO2maxChartFragment.this.b.offsetTo(0);
        }
    }

    public class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            VO2maxChartFragment.this.b.setNotDrawBars(false);
            VO2maxChartFragment.this.b.refresh();
        }
    }

    public class c extends AsyncChartDataLoader {
        private boolean c = true;
        private ChartDataLoader.LoadCallback d;

        public class a implements ChartDataLoader.LoadCallback {
            public a() {
            }

            @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
            public boolean hasData(int i) {
                int iOffsetDay;
                if (i > 0) {
                    return false;
                }
                int i2 = VO2maxChartFragment.this.f;
                if (i2 == 0) {
                    iOffsetDay = VO2maxChartFragment.this.d.offsetDay(VO2maxChartFragment.this.c);
                } else if (i2 != 1) {
                    iOffsetDay = i2 != 2 ? 0 : VO2maxChartFragment.this.d.offsetMonth(VO2maxChartFragment.this.c);
                } else {
                    iOffsetDay = VO2maxChartFragment.this.d.offsetWeek(VO2maxChartFragment.this.c);
                }
                return i >= iOffsetDay;
            }

            @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
            public ChartDataLoader.ItemData loadData(int i, boolean z) {
                VO2maxDataItem vO2maxDataItemRequestVO2maxData;
                StatisticChartView.StatisticChartData statisticChartDataO = VO2maxChartFragment.this.o();
                int i2 = VO2maxChartFragment.this.f;
                if (i2 == 0) {
                    DateDay dateDayAdd = VO2maxChartFragment.this.c.add(i);
                    statisticChartDataO.date = ChartTimeUtil.formatDateForDayMode(VO2maxChartFragment.this.getContext(), dateDayAdd);
                    vO2maxDataItemRequestVO2maxData = FirstbeatData.requestVO2maxData(dateDayAdd.str());
                } else if (i2 == 1) {
                    DateDay weekStartDay = VO2maxChartFragment.this.c.addWeek(i).getWeekStartDay();
                    VO2maxChartFragment vO2maxChartFragment = VO2maxChartFragment.this;
                    statisticChartDataO.date = vO2maxChartFragment.formatDateForWeekMode(vO2maxChartFragment.getContext(), weekStartDay);
                    vO2maxDataItemRequestVO2maxData = FirstbeatData.requestVO2maxWeekMonthMax(VO2maxChartFragment.this.g, weekStartDay.str(), true);
                } else if (i2 != 2) {
                    VO2maxChartFragment.this.c.add(i);
                    statisticChartDataO.date = "";
                    vO2maxDataItemRequestVO2maxData = null;
                } else {
                    DateDay dateDayAddMonth = VO2maxChartFragment.this.c.addMonth(i);
                    DateDay monthStartDay = dateDayAddMonth.getMonthStartDay();
                    String dateForMonthMode = ChartTimeUtil.formatDateForMonthMode(VO2maxChartFragment.this.getActivity(), monthStartDay, dateDayAddMonth.getMonthEndDay());
                    if (dateForMonthMode != null) {
                        statisticChartDataO.date = dateForMonthMode;
                    } else {
                        statisticChartDataO.date = VO2maxChartFragment.this.a[monthStartDay.month() - 1];
                    }
                    vO2maxDataItemRequestVO2maxData = FirstbeatData.requestVO2maxWeekMonthMax(VO2maxChartFragment.this.g, monthStartDay.str(), false);
                }
                if (vO2maxDataItemRequestVO2maxData != null) {
                    VO2maxChartFragment.correctionVO2maxChartData(vO2maxDataItemRequestVO2maxData);
                    if (VO2maxChartFragment.this.g == 1) {
                        statisticChartDataO.hrValue = Util.INSTANCE.formatVo2max(Float.valueOf(vO2maxDataItemRequestVO2maxData.getVo2maxRun()));
                    } else if (VO2maxChartFragment.this.g == 6) {
                        statisticChartDataO.hrValue = Util.INSTANCE.formatVo2max(Float.valueOf(vO2maxDataItemRequestVO2maxData.getVo2maxWalk()));
                    }
                } else {
                    statisticChartDataO.hrValue = 0;
                }
                return statisticChartDataO;
            }

            @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
            public void onDataLoaded(ChartDataLoader.ItemData itemData, boolean z) {
                if (c.this.c) {
                    c.this.c = false;
                    VO2maxChartFragment.this.p();
                }
            }

            /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
            @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
            public void onToItem(int i) {
                int vo2max;
                if (VO2maxChartFragment.this.isAdded()) {
                    VO2maxDataItem vO2maxDataItemRequestVO2maxData = null;
                    int i2 = VO2maxChartFragment.this.f;
                    if (i2 == 0) {
                        vO2maxDataItemRequestVO2maxData = FirstbeatData.requestVO2maxData(VO2maxChartFragment.this.c.add(i).str());
                    } else if (i2 == 1) {
                        vO2maxDataItemRequestVO2maxData = FirstbeatData.requestVO2maxWeekMonthMax(VO2maxChartFragment.this.g, VO2maxChartFragment.this.c.addWeek(i).getWeekStartDay().str(), true);
                    } else if (i2 == 2) {
                        vO2maxDataItemRequestVO2maxData = FirstbeatData.requestVO2maxWeekMonthMax(VO2maxChartFragment.this.g, VO2maxChartFragment.this.c.addMonth(i).getMonthStartDay().str(), false);
                    }
                    if (vO2maxDataItemRequestVO2maxData == null) {
                        vo2max = -1;
                    } else if (VO2maxChartFragment.this.g == 1) {
                        vo2max = Util.INSTANCE.formatVo2max(Float.valueOf(vO2maxDataItemRequestVO2maxData.getVo2maxRun()));
                    } else if (VO2maxChartFragment.this.g == 6) {
                        vo2max = Util.INSTANCE.formatVo2max(Float.valueOf(vO2maxDataItemRequestVO2maxData.getVo2maxWalk()));
                    } else {
                        vo2max = -1;
                    }
                    String[] stringArray = VO2maxChartFragment.this.getResources().getStringArray(R.array.vo2_max_level_status);
                    int fitnessLevelByVO2max = FirstBeatUtil.getFitnessLevelByVO2max(vo2max);
                    if (fitnessLevelByVO2max < 1 || fitnessLevelByVO2max > 7 || vo2max < 0) {
                        VO2maxChartFragment.this.h.setText(R.string.empty_value);
                    } else {
                        VO2maxChartFragment.this.h.setText(stringArray[fitnessLevelByVO2max - 1]);
                    }
                    if (vo2max != -1) {
                        VO2maxChartFragment.this.i.setText(String.valueOf(vo2max));
                        VO2maxChartFragment.this.j.setVisibility(0);
                        VO2maxChartFragment.this.k.setVisibility(8);
                    } else {
                        VO2maxChartFragment.this.i.setText(R.string.empty_value);
                        VO2maxChartFragment.this.j.setVisibility(8);
                        VO2maxChartFragment.this.k.setVisibility(0);
                    }
                }
            }
        }

        public c() {
            a aVar = new a();
            this.d = aVar;
            setLoadCallback(aVar);
        }
    }

    public static void correctionVO2maxChartData(VO2maxDataItem vO2maxDataItem) {
        if (vO2maxDataItem == null) {
            return;
        }
        if (vO2maxDataItem.getVo2maxRun() < 0.0f) {
            vO2maxDataItem.setVo2maxRun(0.0f);
        } else if (vO2maxDataItem.getVo2maxRun() > 105.0f) {
            vO2maxDataItem.setVo2maxRun(105.0f);
        }
        if (vO2maxDataItem.getVo2maxWalk() < 0.0f) {
            vO2maxDataItem.setVo2maxWalk(0.0f);
        } else if (vO2maxDataItem.getVo2maxWalk() > 105.0f) {
            vO2maxDataItem.setVo2maxWalk(105.0f);
        }
    }

    private void initView(View view) {
        this.b = (StatisticChartView) view.findViewById(R.id.chart);
        this.h = (TextView) view.findViewById(R.id.status_info);
        this.i = (TextView) view.findViewById(R.id.status_value);
        this.j = view.findViewById(R.id.vo2max_status_layout);
        this.k = (TextView) view.findViewById(R.id.tv_no_data);
    }

    private void m() {
        StatisticChart.StatisticChartAttr statisticChartAttr = new StatisticChart.StatisticChartAttr();
        statisticChartAttr.mode = 256;
        statisticChartAttr.drawLineX = true;
        statisticChartAttr.valueArrayY = new int[]{20, 40, 60, 80, 100};
        statisticChartAttr.maxValue = 105;
        statisticChartAttr.minValue = 0;
        this.b.setInterceptable(false);
        this.b.setChartAttr(statisticChartAttr);
        this.b.setNotDrawBars(false);
        this.b.setScrollable(true);
        c cVar = new c();
        this.e = cVar;
        this.b.setDataLoader(cVar);
        int i = this.f;
        if (i == 0) {
            this.b.updateBarItemCount(11);
        } else if (i == 1) {
            this.b.updateBarItemCount(7);
        } else if (i == 2) {
            this.b.updateBarItemCount(5);
        }
        this.b.attach();
    }

    private void n() {
        this.e.cancel();
        this.b.post(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StatisticChartView.StatisticChartData o() {
        return new StatisticChartView.StatisticChartData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        Animator animatorAnimRefresh = this.b.animRefresh();
        animatorAnimRefresh.cancel();
        if (animatorAnimRefresh.isStarted()) {
            return;
        }
        animatorAnimRefresh.addListener(new b());
        animatorAnimRefresh.setDuration(300L);
        animatorAnimRefresh.start();
    }

    public String formatDateForWeekMode(Context context, DateDay dateDay) {
        if (context == null) {
            return ChartTimeUtil.format(dateDay);
        }
        DateDay dateDay2 = DateDay.today();
        DateDay dateDayAdd = dateDay.add(6);
        if (!dateDay2.before(dateDay) && !dateDay2.after(dateDayAdd) && !getResources().getConfiguration().locale.getCountry().equals("RO")) {
            return context.getResources().getString(R.string.current_week);
        }
        return ChartTimeUtil.format(context, dateDay) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + ChartTimeUtil.format(context, dateDayAdd);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f = arguments.getInt("mode", 0);
            this.g = arguments.getInt("sport_type", 1);
        }
        this.a = getResources().getStringArray(R.array.month_titles);
        this.d = DateDay.from(FirstbeatData.getVO2MaxStartDay(this.g));
        this.c = DateDay.from(FirstbeatData.getStopDay());
        initView(getView());
        m();
        n();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_vo2max_chart, viewGroup, false);
    }
}
