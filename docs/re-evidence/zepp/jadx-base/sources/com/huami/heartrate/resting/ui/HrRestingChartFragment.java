package com.huami.heartrate.resting.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.material.timepicker.TimeModel;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.util.Index;
import com.huami.femalehealth.uilib.helper.ChartHelper;
import com.huami.heartrate.R;
import com.huami.heartrate.chart.HRChartHelper;
import com.huami.heartrate.chart.HRChartHelperKt;
import com.huami.heartrate.chart.model.HRDayChartData;
import com.huami.heartrate.dto.RestingHeartRate;
import com.huami.heartrate.koin.KoinExtKt;
import com.huami.heartrate.resting.ui.HrRestingChartFragment;
import com.huami.heartrate.utils.HeartRateTimeUtils;
import com.huami.heartrate.utils.HeartRateTimeUtilsKt;
import com.huami.heartrate.viewmodel.RestingHrViewModel;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.mifit.analytics.Analytics;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.timeutil.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class HrRestingChartFragment extends Fragment {
    private static final String m = "EXTRA_POSITION";
    private static final String n = "EXTRA_USER_ID";
    private static final String o = "EXTRA_USER_AGE";
    private ViewGroup a;
    private RecyclerView b;
    private View c;
    private b d;
    private int e;
    private String f;
    private int g;
    private RestingHrViewModel h;
    private HRChartHelper i;
    private TextView j;
    private TextView k;
    private TextView l;

    public class a implements ViewModelProvider.Factory {
        public a() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NonNull
        public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
            return new RestingHrViewModel(HrRestingChartFragment.this.f);
        }
    }

    public static class b extends BaseQuickAdapter<RestingHeartRate, BaseViewHolder> {
        public b() {
            super(R.layout.heart_rate_item_heart_rate);
        }

        @DrawableRes
        private int b(boolean isNormal) {
            return isNormal ? R.drawable.heart_rate_hol_mark_normal : R.drawable.heart_rate_hol_mark_un_normal;
        }

        private int c() {
            return KoinExtKt.isHollywood() ? 79 : 100;
        }

        private int d() {
            return KoinExtKt.isHollywood() ? 55 : 60;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void convert(BaseViewHolder holder, RestingHeartRate item) {
            String date_y;
            String string;
            int color;
            Context context = holder.itemView.getContext();
            holder.setText(R.id.hr_value, item.getRestingHeartRate() + "");
            Date date = HrRestingChartFragment.parseDate(item.getDate());
            if (date == null) {
                date_y = item.getDate();
            } else {
                Calendar.getInstance().setTime(date);
                date_y = Locale.getDefault().getLanguage().equals(Locale.CHINESE.getLanguage()) ? new SimpleDateFormat(ChartHelper.FMT_MM_DD, Locale.getDefault()).format(date) : TimeUtils.formatDate_y(context, date);
            }
            holder.setText(R.id.hr_date, date_y);
            holder.itemView.setClickable(false);
            TextView textView = (TextView) holder.getView(R.id.hr_mark);
            if (item.getRestingHeartRate() < d()) {
                string = context.getString(R.string.heart_rate_mark_low);
                color = KoinExtKt.isHollywood() ? -1 : ContextCompat.getColor(context, R.color.s15);
                textView.setBackgroundResource(KoinExtKt.isHollywood() ? b(false) : R.drawable.heart_rate_rest_text_bg_low);
            } else if (item.getRestingHeartRate() < d() || item.getRestingHeartRate() > c()) {
                string = context.getString(R.string.heart_rate_mark_high);
                color = KoinExtKt.isHollywood() ? -1 : ContextCompat.getColor(context, R.color.s33);
                textView.setBackgroundResource(KoinExtKt.isHollywood() ? b(false) : R.drawable.heart_rate_rest_text_bg_high);
            } else {
                string = context.getString(R.string.heart_rate_mark_normal);
                color = KoinExtKt.isHollywood() ? -1 : ContextCompat.getColor(context, R.color.s20);
                textView.setBackgroundResource(KoinExtKt.isHollywood() ? b(true) : R.drawable.heart_rate_rest_text_bg_normal);
            }
            textView.setText(string);
            textView.setTextColor(color);
        }
    }

    private void g(HRDayChartData hrDayChartData) {
        this.i.refreshRestHrChart(this.a, hrDayChartData, new Function2() { // from class: fa4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return this.a.p((Index) obj, (HMChart) obj2);
            }
        }, new Function0() { // from class: ea4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrRestingChartFragment.q();
            }
        });
    }

    public static int getDatePosition(long dateTimeInMillis) {
        Calendar calendarK = k();
        Calendar calendar = Calendar.getInstance();
        int monthCount = getMonthCount() - 1;
        calendar.setTimeInMillis(dateTimeInMillis);
        int i = ((calendar.get(1) - calendarK.get(1)) * 12) + (calendar.get(2) - calendarK.get(2));
        if (i >= 0 && i <= monthCount) {
            return i;
        }
        HMLog.e("HrRestingChartFragment", "getDatePosition index error " + i + " " + monthCount, new Object[0]);
        return monthCount;
    }

    public static int getMonthCount() {
        Calendar calendarK = k();
        Calendar calendar = Calendar.getInstance();
        int i = calendarK.get(1);
        int i2 = calendarK.get(2);
        return ((calendar.get(1) - i) * 12) + (calendar.get(2) - i2) + 1;
    }

    public static Calendar getSelectedMonthCalendar(int position) {
        int monthCount = getMonthCount();
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, (position + 1) - monthCount);
        return calendar;
    }

    private void h(View view) {
        this.a = (ViewGroup) view.findViewById(R.id.chart_container);
        this.b = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.c = view.findViewById(R.id.list_container);
        this.j = (TextView) view.findViewById(R.id.text_heart_rate);
        this.k = (TextView) view.findViewById(R.id.text_time);
        this.l = (TextView) view.findViewById(R.id.text_unit);
        view.findViewById(R.id.learn_more).setOnClickListener(new View.OnClickListener() { // from class: z94
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.r(view2);
            }
        });
    }

    private long i(int position) {
        Calendar selectedMonthCalendar = getSelectedMonthCalendar(position);
        selectedMonthCalendar.set(5, selectedMonthCalendar.getActualMaximum(5));
        return selectedMonthCalendar.getTimeInMillis();
    }

    public static Boolean isWatchName() {
        return KoinExtKt.getHeartRateDataDelegate().isWatchName();
    }

    private long j(int position) {
        Calendar selectedMonthCalendar = getSelectedMonthCalendar(position);
        selectedMonthCalendar.set(5, selectedMonthCalendar.getActualMinimum(5));
        return selectedMonthCalendar.getTimeInMillis();
    }

    private static Calendar k() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, GLMapStaticValue.AM_PARAMETERNAME_SHOW_BUILDING_MARK);
        calendar.set(2, 2);
        calendar.set(5, 1);
        return calendar;
    }

    private String l(long time) {
        return HMDataFormatKt.getFormatTime(time, HMPattern.YEAR_ABBR_MONTH, Locale.getDefault());
    }

    private String m(long time) {
        return HMDataFormatKt.getFormatTime(time, HeartRateTimeUtilsKt.isInSameYear(time, System.currentTimeMillis()) ? HMPattern.ABBR_MONTH_DAY : HMPattern.YEAR_ABBR_MONTH_DAY, Locale.getDefault());
    }

    private void n() {
        this.k.setText(HeartRateTimeUtils.INSTANCE.formatTimeYMD(i(this.e)));
        this.i = new HRChartHelper(getContext());
    }

    public static HrRestingChartFragment newInstance(int position, String userId, int age) {
        HrRestingChartFragment hrRestingChartFragment = new HrRestingChartFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(m, position);
        bundle.putString(n, userId);
        bundle.putInt(o, age);
        hrRestingChartFragment.setArguments(bundle);
        return hrRestingChartFragment;
    }

    private void o() {
        this.b.setLayoutManager(new LinearLayoutManager(getContext()));
        b bVar = new b();
        this.d = bVar;
        this.b.setAdapter(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit p(Index index, HMChart hMChart) {
        if (hMChart.getChartDataManager().getChartDataList().getCount() > 0) {
            int index2 = index.getPosiIndex().getIndex();
            z(hMChart.getChartDataManager().getDataByPositionIndex(index2), index2);
        } else {
            z(null, -1);
        }
        return null;
    }

    public static Date parseDate(String formatDate) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(formatDate);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit q() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(View view) {
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(ChartDataList chartDataList) {
        SparseArray<YAxisData> sparseArray;
        ChartDataList chartDataList2;
        float roundUpTen;
        SparseArray<XAxisData> monthXAxis = HRChartHelperKt.getMonthXAxis(getSelectedMonthCalendar(this.e).getTime());
        if (chartDataList == null || chartDataList.getCount() <= 0) {
            sparseArray = new SparseArray<>();
            chartDataList2 = new ChartDataList(new SparseArray(0), monthXAxis.keyAt(0), monthXAxis.keyAt(monthXAxis.size() - 1));
            roundUpTen = 0.0f;
        } else {
            roundUpTen = HRChartHelperKt.getRoundUpTen(chartDataList.getMaxDataValue());
            chartDataList2 = chartDataList;
            sparseArray = HRChartHelperKt.getYAxisData((int) roundUpTen);
        }
        HRDayChartData hRDayChartData = new HRDayChartData(0.0f, roundUpTen + 0.1f, monthXAxis, sparseArray, chartDataList2);
        z(hRDayChartData.getChartDataList().getLastData(), -1);
        g(hRDayChartData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public /* synthetic */ void t(List list) {
        if (list == null || list.isEmpty()) {
            this.c.setVisibility(8);
            return;
        }
        Collections.reverse(list);
        this.d.setNewData(list);
        this.c.setVisibility(0);
        if (KoinExtKt.isHollywood()) {
            int dimension = (int) getResources().getDimension(R.dimen.heart_rate_size_55dp);
            int dimension2 = (int) getResources().getDimension(R.dimen.heart_rate_size_11dp);
            int dimension3 = (int) getResources().getDimension(R.dimen.heart_rate_size_15dp);
            int dimension4 = (int) getResources().getDimension(R.dimen.heart_rate_size_6dp);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, dimension);
            TextView textView = new TextView(getContext());
            textView.setLayoutParams(layoutParams);
            textView.setTextColor(ContextCompat.getColor(getContext(), R.color.heart_rate_black90));
            textView.setTypeface(null, 1);
            textView.setTextSize(18.0f);
            textView.setText(getResources().getText(R.string.heart_rate_last_data));
            textView.setBackgroundResource(R.drawable.hol_bg_card_up);
            textView.setPadding(dimension3, dimension3, 0, dimension4);
            this.d.setHeaderView(textView, 1);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams2.setMargins(dimension2, dimension2, dimension2, 0);
            textView.setLayoutParams(layoutParams2);
            View view = new View(getContext());
            ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-1, dimension3);
            view.setBackgroundResource(R.drawable.hol_bg_card_down);
            view.setLayoutParams(layoutParams3);
            this.d.setFooterView(view);
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams4.setMargins(dimension2, 0, dimension2, 0);
            view.setLayoutParams(layoutParams4);
        }
    }

    private void u() {
        KoinExtKt.launchUrl(HMServerDef.getUrl(KoinExtKt.isHollywood() ? "t/cms.hollywood.faq.heart" : "t/mifit.faq.heart.rate"));
        Analytics.event(getContext(), "Chart_ViewClickRestingHeartHelp");
    }

    private void v() {
        this.h.setRequestTime(j(this.e), i(this.e));
        y();
        x();
    }

    private void w() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.e = arguments.getInt(m, 0);
        this.f = arguments.getString(n);
        this.g = arguments.getInt(o, 0);
    }

    private void x() {
        this.h.getChartDataList().observe(getViewLifecycleOwner(), new Observer() { // from class: ca4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.s((ChartDataList) obj);
            }
        });
    }

    private void y() {
        this.h.getRestingHrsLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: da4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.t((List) obj);
            }
        });
    }

    private void z(ChartData data, int index) {
        boolean z = (data == null || data.getSumValue() == 0.0f) ? false : true;
        this.j.setText(z ? String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf((int) data.getSumValue())) : "--");
        this.l.setVisibility(z ? 0 : 8);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j(this.e));
        if (data != null) {
            calendar.add(5, data.getIndex());
        } else if (-1 != index) {
            calendar.add(5, index);
        }
        this.k.setText((data == null && index == -1) ? l(calendar.getTimeInMillis()) : m(calendar.getTimeInMillis()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        w();
        this.h = (RestingHrViewModel) new ViewModelProvider(this, new a()).get(RestingHrViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return LayoutInflater.from(getContext()).inflate(R.layout.heart_rate_fragment_hr_resting_chart, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        h(view);
        o();
        n();
        v();
    }
}
