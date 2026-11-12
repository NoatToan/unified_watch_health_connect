package com.xiaomi.hm.health.ui.information;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.chart.IChartProvider;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.lib.view.quickadapter.BaseQuickAdapter;
import com.huami.lib.view.quickadapter.BaseViewHolder;
import com.huami.mifit.analytics.Analytics;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.Sleep;
import com.xiaomi.hm.health.training.utils.WebBrowserUtils;
import com.xiaomi.hm.health.ui.heartrate.HRDataManager;
import com.xiaomi.hm.health.ui.heartrate.WholeDayHrChartLineStyleFactory;
import com.xiaomi.hm.health.ui.information.HrRestingChartFragment;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import rx.Observable;
import rx.SingleSubscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes22.dex */
public class HrRestingChartFragment extends Fragment {
    private static final String r = "EXTRA_POSITION";
    private ViewGroup a;
    private ViewGroup b;
    private View c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private RecyclerView i;
    private View j;
    private TextView k;
    private View l;
    private e m;
    private ChartProvider n;
    private ChartDataList o;
    private int p;
    private IChartProvider q = new a();

    public class a extends ChartProvider.StatisChartProvider {
        public a() {
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartContainer */
        public ViewGroup getD() {
            return HrRestingChartFragment.this.a;
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartDataList */
        public ChartDataList getG() {
            return HrRestingChartFragment.this.o;
        }

        @Override // com.huami.chart.chart.IChartProvider
        public DrawConfig getDrawConfig() {
            return HrRestingChartFragment.this.y();
        }

        @Override // com.huami.chart.chart.IChartProvider
        public RenderConfig getRenderConfig() {
            return HrRestingChartFragment.this.z();
        }
    }

    public class b extends SingleSubscriber<List<f>> {
        public b() {
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable error) {
            error.printStackTrace();
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(List<f> restingHeartRates) {
            HrRestingChartFragment.this.U(restingHeartRates);
            HrRestingChartFragment.this.T(restingHeartRates);
        }
    }

    public class c extends SingleSubscriber<List<f>> {
        public c() {
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable error) {
            error.printStackTrace();
            HMLog.w(HrRestingChartFragment.this.getLogTag(), error, "Load resting hr list failed.", new Object[0]);
            HrRestingChartFragment.this.j.setVisibility(8);
            HrRestingChartFragment.this.k.setVisibility(0);
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(List<f> hrList) {
            HrRestingChartFragment.this.m.setNewData(hrList);
            if (hrList.isEmpty()) {
                HrRestingChartFragment.this.j.setVisibility(8);
                HrRestingChartFragment.this.k.setVisibility(0);
            } else {
                HrRestingChartFragment.this.j.setVisibility(0);
                HrRestingChartFragment.this.k.setVisibility(8);
            }
        }
    }

    public class d extends SingleSubscriber<ChartDataList> {
        public d() {
        }

        @Override // rx.SingleSubscriber
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ChartDataList chartDataList) {
            HrRestingChartFragment.this.b.setBackgroundResource(R.drawable.hr_chart_bg);
            HrRestingChartFragment.this.h.setVisibility(8);
            HrRestingChartFragment.this.o = chartDataList;
            HrRestingChartFragment.this.n.createChart(HrRestingChartFragment.this.q, true, false);
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable error) {
            error.printStackTrace();
            HMLog.w(HrRestingChartFragment.this.getLogTag(), error.getMessage(), new Object[0]);
            HrRestingChartFragment.this.b.setBackgroundResource(R.drawable.no_hr_chart_bg);
            HrRestingChartFragment.this.h.setVisibility(0);
            HrRestingChartFragment.this.h.setText(R.string.no_rest_heart_rate);
        }
    }

    public static class e extends BaseQuickAdapter<f, BaseViewHolder> {
        public e() {
            super(R.layout.item_heart_rate);
        }

        @Override // com.huami.lib.view.quickadapter.BaseQuickAdapter
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void convert(BaseViewHolder holder, f item) {
            String date_no_y;
            String string;
            int color;
            Context context = holder.itemView.getContext();
            ((ImageView) holder.getView(R.id.hr_icon)).setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(context, R.drawable.icon_hr).mutate(), ContextCompat.getColorStateList(context, R.color.bf3_list_not_stand)));
            holder.setText(R.id.hr_value, item.b + "");
            Date date = HrRestingChartFragment.parseDate(item.a);
            if (date == null) {
                date_no_y = item.a;
            } else {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                date_no_y = Calendar.getInstance().get(1) == calendar.get(1) ? TimeUtils.formatDate_no_y(BraceletApp.getContext(), date, false) : TimeUtils.formatDate(BraceletApp.getContext(), date);
            }
            holder.setText(R.id.hr_date, date_no_y);
            holder.itemView.setClickable(false);
            holder.getView(R.id.right_arrow).setVisibility(8);
            TextView textView = (TextView) holder.getView(R.id.hr_mark);
            int i = item.b;
            if (i < 60) {
                string = context.getString(R.string.hr_mark_low);
                color = ContextCompat.getColor(context, R.color.hr_tape_fat_burn);
            } else if (i < 60 || i > 100) {
                string = context.getString(R.string.hr_mark_high);
                color = ContextCompat.getColor(context, R.color.hr_main_bg);
            } else {
                string = context.getString(R.string.hr_mark_normal);
                color = ContextCompat.getColor(context, R.color.black40);
            }
            textView.setText(string);
            textView.setTextColor(color);
        }
    }

    public static class f {
        public String a;
        public int b;

        private f() {
        }
    }

    private void A() {
        View view = this.l;
        this.a = (ViewGroup) view.findViewById(R.id.chart_container);
        this.b = (ViewGroup) view.findViewById(R.id.chart_area);
        this.c = view.findViewById(R.id.day_scale);
        this.d = (TextView) view.findViewById(R.id.day_first);
        this.e = (TextView) view.findViewById(R.id.day_first_third);
        this.f = (TextView) view.findViewById(R.id.day_last_third);
        this.g = (TextView) view.findViewById(R.id.day_last);
        this.h = (TextView) view.findViewById(R.id.chart_message);
        this.i = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.j = view.findViewById(R.id.list_container);
        this.k = (TextView) view.findViewById(R.id.empty_view);
        view.findViewById(R.id.btn_intro).setOnClickListener(new View.OnClickListener() { // from class: ga4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.I(view2);
            }
        });
    }

    private int B() {
        Calendar selectedMonthCalendar = getSelectedMonthCalendar(this.p);
        return (selectedMonthCalendar.getActualMaximum(5) - selectedMonthCalendar.getActualMinimum(5)) + 1;
    }

    private String C(int position) {
        Calendar selectedMonthCalendar = getSelectedMonthCalendar(position);
        selectedMonthCalendar.set(5, selectedMonthCalendar.getActualMaximum(5));
        return getDateInFormat(selectedMonthCalendar);
    }

    private String D(int position) {
        Calendar selectedMonthCalendar = getSelectedMonthCalendar(position);
        selectedMonthCalendar.set(5, selectedMonthCalendar.getActualMinimum(5));
        return getDateInFormat(selectedMonthCalendar);
    }

    private static Calendar E() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, GLMapStaticValue.AM_PARAMETERNAME_SHOW_BUILDING_MARK);
        calendar.set(2, 2);
        calendar.set(5, 1);
        return calendar;
    }

    private void F() {
        this.n = new ChartProvider(getContext());
    }

    private void G() {
        this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, TintUtils.tintDrawable(ContextCompat.getDrawable(getContext(), R.drawable.icon_hr_warning), ContextCompat.getColor(getContext(), R.color.hr_main_bg)), (Drawable) null, (Drawable) null);
    }

    private void H() {
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.i = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        e eVar = new e();
        this.m = eVar;
        this.i.setAdapter(eVar);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_hr_resting_chart, (ViewGroup) this.i, false);
        this.l = viewInflate;
        this.m.setHeaderView(viewInflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(View view) {
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f J(HMSummery hMSummery) {
        f fVar = new f();
        fVar.a = hMSummery.date;
        Sleep sleep = hMSummery.sleep;
        fVar.b = sleep != null ? sleep.rhr : hMSummery.rhrDeprecated;
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ArrayList K(List list, List list2) {
        int iB = B();
        TreeMap treeMap = new TreeMap();
        for (int i = 1; i <= iB; i++) {
            treeMap.put(Integer.valueOf(i), 0);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            f fVar = (f) it2.next();
            Date date = parseDate(fVar.a);
            if (date != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                treeMap.put(Integer.valueOf(calendar.get(5)), Integer.valueOf(fVar.b));
            }
        }
        return new ArrayList(treeMap.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SparseArray L(ArrayList arrayList) {
        SparseArray sparseArray = new SparseArray();
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            int iIntValue = ((Integer) arrayList.get(i)).intValue();
            sparseArray.put(i, new ChartData(i, iIntValue));
            if (iIntValue > 0) {
                z = true;
            }
        }
        if (z) {
            return sparseArray;
        }
        throw Exceptions.propagate(new IllegalArgumentException("There is no resting heart rate data in"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ChartDataList M(SparseArray sparseArray) {
        return new ChartDataList(sparseArray, 0, sparseArray.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean N(f fVar) {
        return Boolean.valueOf(fVar.b > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List O(List list) {
        Collections.reverse(list);
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P() {
        float width = (this.c.getWidth() - this.c.getPaddingLeft()) - this.c.getPaddingRight();
        float fMeasureText = this.e.getPaint().measureText(this.e.getText().toString());
        float fMeasureText2 = this.f.getPaint().measureText(this.f.getText().toString());
        float f2 = width / 3.0f;
        ((RelativeLayout.LayoutParams) this.e.getLayoutParams()).leftMargin = (int) (f2 - (fMeasureText / 2.0f));
        this.e.requestLayout();
        ((RelativeLayout.LayoutParams) this.f.getLayoutParams()).rightMargin = (int) (f2 - (fMeasureText2 / 2.0f));
        this.f.requestLayout();
    }

    private void Q() {
        WebBrowserUtils.jump2WebBrowser(getContext(), HMServerDef.getUrl("t/mifit.faq.heart.rate"), getString(R.string.heart_rate_rest));
        Analytics.event(getContext(), "Chart_ViewClickRestingHeartHelp");
    }

    private void R() {
        HRDataManager.getInstance().queryRestingHeartRateInMonth(D(this.p), C(this.p)).map(new Func1() { // from class: ka4
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return HrRestingChartFragment.J((HMSummery) obj);
            }
        }).toList().observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new b());
    }

    private void S() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.p = arguments.getInt(r, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(final List<f> restingHrList) {
        Observable.just(restingHrList).map(new Func1() { // from class: ia4
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.a.K(restingHrList, (List) obj);
            }
        }).map(new Func1() { // from class: aa4
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return HrRestingChartFragment.L((ArrayList) obj);
            }
        }).map(new Func1() { // from class: ja4
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return HrRestingChartFragment.M((SparseArray) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(List<f> restingHrList) {
        Observable.from(restingHrList).filter(new Func1() { // from class: com.xiaomi.hm.health.ui.information.a
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return HrRestingChartFragment.N((HrRestingChartFragment.f) obj);
            }
        }).toList().map(new Func1() { // from class: ba4
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return HrRestingChartFragment.O((List) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new c());
    }

    private void V() {
        View view = this.c;
        if (view == null) {
            return;
        }
        view.post(new Runnable() { // from class: ha4
            @Override // java.lang.Runnable
            public final void run() {
                this.a.P();
            }
        });
    }

    private void W() {
        Calendar selectedMonthCalendar = getSelectedMonthCalendar(this.p);
        int actualMinimum = selectedMonthCalendar.getActualMinimum(5);
        int actualMaximum = selectedMonthCalendar.getActualMaximum(5);
        float f2 = (((actualMaximum - actualMinimum) + 1) * 1.0f) / 3.0f;
        int iCeil = (int) Math.ceil(f2);
        int iCeil2 = (int) Math.ceil(f2 * 2.0f);
        selectedMonthCalendar.set(5, actualMinimum);
        this.d.setText(TimeUtils.formatDate_no_y(getContext(), selectedMonthCalendar.getTime(), true));
        selectedMonthCalendar.set(5, iCeil);
        this.e.setText(TimeUtils.formatDate_no_y(getContext(), selectedMonthCalendar.getTime(), true));
        selectedMonthCalendar.set(5, iCeil2);
        this.f.setText(TimeUtils.formatDate_no_y(getContext(), selectedMonthCalendar.getTime(), true));
        selectedMonthCalendar.set(5, actualMaximum);
        this.g.setText(TimeUtils.formatDate_no_y(getContext(), selectedMonthCalendar.getTime(), true));
    }

    private void X() {
        Boolean boolIsWatchName = isWatchName();
        if (boolIsWatchName == null || !boolIsWatchName.booleanValue()) {
            this.k.setText(R.string.wear_ring_to_measure_rest_hr);
        } else {
            this.k.setText(R.string.wear_watch_to_measure_rest_hr);
        }
    }

    public static String getDateInFormat(Calendar calendar) {
        return String.format(Locale.getDefault(), "%d-%02d-%02d", Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getLogTag() {
        return getClass().getSimpleName() + AESEncryptionHelper.SEPARATOR + getDateInFormat(getSelectedMonthCalendar(this.p));
    }

    public static int getMonthCount() {
        Calendar calendarE = E();
        Calendar calendar = Calendar.getInstance();
        int i = calendarE.get(1);
        int i2 = calendarE.get(2);
        return ((calendar.get(1) - i) * 12) + (calendar.get(2) - i2) + 1;
    }

    public static Calendar getSelectedMonthCalendar(int position) {
        int monthCount = getMonthCount();
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, (position + 1) - monthCount);
        return calendar;
    }

    public static Boolean isWatchName() {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        if (boundDeviceSource != null && boundDeviceSource != HMDeviceSource.VDEVICE) {
            return Boolean.valueOf(ConfigHelperKt.hasFeature(Feature.WATCH_SOURCE_S, boundDeviceSource));
        }
        HMDeviceSource boundDeviceSource2 = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.WATCH);
        if (boundDeviceSource2 == null || boundDeviceSource2 == HMDeviceSource.VDEVICE) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static HrRestingChartFragment newInstance(int position) {
        HrRestingChartFragment hrRestingChartFragment = new HrRestingChartFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(r, position);
        hrRestingChartFragment.setArguments(bundle);
        return hrRestingChartFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Date parseDate(String formatDate) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(formatDate);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DrawConfig y() {
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.whole_day_hr_chart_margin_top);
        if (width == 0) {
            width = getResources().getDisplayMetrics().widthPixels;
        }
        if (height == 0) {
            height = getResources().getDimensionPixelOffset(R.dimen.whole_day_hr_chart_height);
        }
        HMLog.d(getLogTag(), "chartWidth:" + width + ",chartHeight:" + height, new Object[0]);
        return new DrawConfig.Builder(getActivity()).setCanvasHeight(height).setCanvasWidth(width).setDataMarginTop(dimensionPixelOffset).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RenderConfig z() {
        return new RenderConfig.Builder().setLineStyle(WholeDayHrChartLineStyleFactory.create(getContext(), this.o, false)).setAxisStyle(new AxisStyle.Builder(getContext()).setAxisStyle(1).create()).create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getUserVisibleHint()) {
            V();
            W();
        }
        R();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        S();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        H();
        return this.i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        A();
        F();
        G();
        X();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (!isVisibleToUser || getView() == null) {
            return;
        }
        V();
        W();
    }
}
