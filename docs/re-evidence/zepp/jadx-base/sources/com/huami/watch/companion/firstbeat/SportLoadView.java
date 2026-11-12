package com.huami.watch.companion.firstbeat;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.watch.companion.R;
import com.huami.watch.companion.dataflow.FirstbeatData;
import com.huami.watch.companion.ui.view.HuaMiFontTextView;
import com.huami.watch.companion.util.ChartTimeUtil;
import com.huami.watch.dataflow.chart.StatisticChart;
import com.huami.watch.dataflow.chart.StatisticChartView;
import com.huami.watch.dataflow.chart.data.AsyncChartDataLoader;
import com.huami.watch.dataflow.chart.data.ChartDataLoader;
import com.huami.watch.dataflow.model.firstbeat.SportLoadManager;
import com.huami.watch.dataflow.model.firstbeat.bean.SportLoadDataItem;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public class SportLoadView extends FrameLayout {
    public static final int CHART_SPORT_LOAD_MAX_SIZE = 28;
    public static final int CHART_SPORT_LOAD_MAX_VALUE = 1400;
    private static final String m = "SportLoadView";
    private DialView a;
    private HuaMiFontTextView b;
    private TextView c;
    private StatisticChartView d;
    private b e;
    private DateDay f;
    private DateDay g;
    private TextView h;
    private TextView i;
    private View j;
    private TextView k;
    private StatisticChart.StatisticChartAttr l;

    public class a implements Animator.AnimatorListener {
        public a() {
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
            SportLoadView.this.d.setNotDrawBars(false);
            SportLoadView.this.d.refresh();
        }
    }

    public class b extends AsyncChartDataLoader {
        private boolean c = true;

        public class a implements ChartDataLoader.LoadCallback {
            public final /* synthetic */ SportLoadView a;

            public a(SportLoadView sportLoadView) {
                this.a = sportLoadView;
            }

            @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
            public boolean hasData(int i) {
                return i <= 0 && i >= SportLoadView.this.g.offsetDay(SportLoadView.this.f);
            }

            @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
            public ChartDataLoader.ItemData loadData(int i, boolean z) {
                StatisticChartView.StatisticChartData statisticChartDataU = SportLoadView.this.u();
                DateDay dateDayAdd = SportLoadView.this.f.add(i);
                statisticChartDataU.date = ChartTimeUtil.formatDateForDayMode(SportLoadView.this.getContext(), dateDayAdd);
                SportLoadDataItem sportLoadDataItemRequestSportLoadDayInfo = FirstbeatData.requestSportLoadDayInfo(dateDayAdd.str());
                if (sportLoadDataItemRequestSportLoadDayInfo != null) {
                    statisticChartDataU.hrValue = sportLoadDataItemRequestSportLoadDayInfo.getWeeklyTLSum();
                } else {
                    statisticChartDataU.hrValue = 0;
                }
                if (statisticChartDataU.hrValue < 0) {
                    statisticChartDataU.hrValue = 0;
                    Log.w(SportLoadView.m, dateDayAdd.toString() + ",sport load value < 0", new Object[0]);
                }
                return statisticChartDataU;
            }

            @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
            public void onDataLoaded(ChartDataLoader.ItemData itemData, boolean z) {
                if (b.this.c) {
                    b.this.c = false;
                    SportLoadView.this.v();
                }
            }

            @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
            public void onToItem(int i) {
                int weeklyTLSum;
                SportLoadDataItem sportLoadDataItemRequestSportLoadDayInfo = FirstbeatData.requestSportLoadDayInfo(SportLoadView.this.f.add(i).str());
                int i2 = 0;
                if (sportLoadDataItemRequestSportLoadDayInfo != null) {
                    SportLoadView.this.j.setVisibility(0);
                    SportLoadView.this.k.setVisibility(8);
                    weeklyTLSum = sportLoadDataItemRequestSportLoadDayInfo.getWeeklyTLSum();
                    SportLoadView.this.h.setText(FirstBeatUtil.getSuggestTextByCurrentLoad(SportLoadView.this.getContext(), sportLoadDataItemRequestSportLoadDayInfo.getWeeklyTLSum(), sportLoadDataItemRequestSportLoadDayInfo.getWeeklyTLSumOptimalMin(), sportLoadDataItemRequestSportLoadDayInfo.getWeeklyTLSumOptimalMax(), sportLoadDataItemRequestSportLoadDayInfo.getWeeklyTLSumOverreaching()));
                } else {
                    SportLoadView.this.h.setText(R.string.watch_sports_load_suggest_status_less);
                    SportLoadView.this.j.setVisibility(8);
                    SportLoadView.this.k.setVisibility(0);
                    weeklyTLSum = 0;
                }
                if (weeklyTLSum < 0) {
                    SportLoadView.this.h.setText(R.string.watch_sports_load_suggest_status_less);
                    SportLoadView.this.j.setVisibility(8);
                    SportLoadView.this.k.setVisibility(0);
                } else {
                    i2 = weeklyTLSum;
                }
                SportLoadView.this.i.setText(String.valueOf(i2));
            }
        }

        public b() {
            setLoadCallback(new a(SportLoadView.this));
        }
    }

    public SportLoadView(@NonNull Context context) {
        super(context);
        n();
    }

    private Pair<Integer, int[]> m() {
        Iterator<SportLoadDataItem> it2 = SportLoadManager.getManager().get(this.g.str(), this.f.str()).iterator();
        int i = 1400;
        while (it2.hasNext()) {
            int weeklyTLSum = it2.next().getWeeklyTLSum();
            if (i < weeklyTLSum) {
                i = weeklyTLSum;
            }
        }
        if (i % 10 != 0) {
            i = ((i / 10) + 1) * 10;
        }
        int i2 = i % 7;
        if (i2 != 0) {
            i += 7 - i2;
        }
        int i3 = i / 7;
        int[] iArr = new int[8];
        int i4 = 0;
        int i5 = 0;
        while (i4 <= i) {
            iArr[i5] = i4;
            i4 += i3;
            i5++;
        }
        return new Pair<>(Integer.valueOf(i), iArr);
    }

    private void n() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_sports_load, (ViewGroup) this, true);
        this.a = (DialView) findViewById(R.id.dv_sports_load);
        this.b = (HuaMiFontTextView) findViewById(R.id.tv_sports_load_value);
        this.c = (TextView) findViewById(R.id.tv_sports_load_level);
        this.h = (TextView) findViewById(R.id.status_info);
        this.i = (TextView) findViewById(R.id.status_value);
        this.d = (StatisticChartView) findViewById(R.id.chart);
        this.j = findViewById(R.id.sport_load_status_layout);
        this.k = (TextView) findViewById(R.id.tv_no_data);
        this.a.setColor(new int[]{w(R.color.s15), w(R.color.s20), w(R.color.s51)});
        o();
        TextView textView = (TextView) findViewById(R.id.jp_hint_text);
        Util util = Util.INSTANCE;
        if (!util.isJapanese()) {
            textView.setVisibility(8);
        } else {
            textView.setText(util.onlySupportSomeDevices());
            textView.setVisibility(0);
        }
    }

    private void o() {
        this.g = DateDay.from(FirstbeatData.getSportLoadStartDay());
        DateDay dateDayFrom = DateDay.from(FirstbeatData.getStopDay());
        this.f = dateDayFrom;
        if (dateDayFrom.offsetDay(this.g) + 1 > 28) {
            this.g = this.f.add(-27);
        }
        StatisticChart.StatisticChartAttr statisticChartAttr = new StatisticChart.StatisticChartAttr();
        this.l = statisticChartAttr;
        statisticChartAttr.mode = 256;
        statisticChartAttr.drawLineX = true;
        statisticChartAttr.minValue = 0;
        statisticChartAttr.mainColor = -12874497;
        statisticChartAttr.drawShadow = false;
        this.d.setInterceptable(true);
        this.d.setChartAttr(this.l);
        this.d.setNotDrawBars(false);
        this.d.setScrollable(true);
        b bVar = new b();
        this.e = bVar;
        this.d.setDataLoader(bVar);
        this.d.updateBarItemCount(11);
        this.d.attach();
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Pair<Integer, int[]> pair) {
        StatisticChart.StatisticChartAttr statisticChartAttr = this.l;
        statisticChartAttr.valueArrayY = (int[]) pair.second;
        statisticChartAttr.maxValue = ((Integer) pair.first).intValue() + 200;
        this.d.postInvalidate();
        t();
    }

    private void q() {
        Rx.io(new ObservableOnSubscribe() { // from class: sa7
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.r(observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: ta7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                this.a.p((Pair) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.d.clearData();
        this.d.loadStatisticData(0, true);
        this.d.offsetTo(0);
    }

    private void t() {
        this.e.cancel();
        this.d.post(new Runnable() { // from class: ua7
            @Override // java.lang.Runnable
            public final void run() {
                this.a.s();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StatisticChartView.StatisticChartData u() {
        return new StatisticChartView.StatisticChartData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        Animator animatorAnimRefresh = this.d.animRefresh();
        animatorAnimRefresh.cancel();
        if (animatorAnimRefresh.isStarted()) {
            return;
        }
        animatorAnimRefresh.addListener(new a());
        animatorAnimRefresh.setDuration(300L);
        animatorAnimRefresh.start();
    }

    @ColorInt
    private int w(@ColorRes int i) {
        return ContextCompat.getColor(getContext(), i);
    }

    public void setPercent(float f) {
        this.a.setPercent(f);
    }

    public void setSportsLoadDvLevel(String str) {
        this.c.setText(str);
        this.c.setVisibility(0);
    }

    public void setSportsLoadValue(int i) {
        this.b.setText(String.valueOf(i));
    }

    public SportLoadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        n();
    }

    public SportLoadView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        n();
    }
}
