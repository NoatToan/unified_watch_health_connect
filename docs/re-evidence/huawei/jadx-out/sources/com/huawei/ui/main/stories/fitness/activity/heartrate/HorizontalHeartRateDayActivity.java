package com.huawei.ui.main.stories.fitness.activity.heartrate;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SpinnerAdapter;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthDataMarkDateTrigger;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.ClassType;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.DateType;
import com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder;
import com.huawei.ui.commonui.spinner.HealthSpinner;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.heartrate.HorizontalHeartRateDayActivity;
import com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder;
import com.huawei.ui.main.stories.fitness.views.base.chart.DayLineHorizontalClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.heartrate.DayHeartRateDoubleViewHorizontalDataObserverView;
import com.huawei.ui.main.stories.fitness.views.heartrate.MultiViewHorizontalDataObserverView;
import com.huawei.ui.main.stories.fitness.views.heartrate.ScrollChartHorizontalObserverBradycardiaAlarmView;
import com.huawei.ui.main.stories.fitness.views.heartrate.ScrollChartHorizontalObserverHRView;
import com.huawei.ui.main.stories.fitness.views.heartrate.ScrollChartHorizontalObserverRestHRView;
import com.huawei.ui.main.stories.fitness.views.heartrate.ScrollChartHorizontalObserverSportHRView;
import com.huawei.ui.main.stories.fitness.views.heartrate.ScrollChartHorizontalObserverWarningHRView;
import defpackage.njy;
import defpackage.qnh;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class HorizontalHeartRateDayActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f26897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ObserveredClassifiedView f26898b;
    private HealthCalendar d;
    private Context e;
    private String g;
    private DayHeartRateDoubleViewHorizontalDataObserverView h;
    private CustomTitleBar i;
    private String j;
    private HeartRateLineChartHolder l;
    private DataInfos m;
    private long n;
    private ViewStub o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26899c = 0;
    private final List<Integer> f = new ArrayList(4);
    private List<String> k = new ArrayList(4);

    public static /* synthetic */ boolean c(DataInfos dataInfos) {
        return true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(0);
        setContentView(R.layout.layout_horizontal_linechart);
        this.e = this;
        c();
        g();
        if (i()) {
            return;
        }
        h();
        c(true);
    }

    private void g() {
        b();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.table_chart_container);
        this.o = (ViewStub) findViewById(R.id.horizontal_heart_rate_linechart_tips);
        ObserveredClassifiedView observeredClassifiedViewF = f();
        linearLayout.addView(observeredClassifiedViewF, new LinearLayout.LayoutParams(-1, -1));
        observeredClassifiedViewF.init(this.l);
        if (njy.e(this.f, this.f26899c)) {
            return;
        }
        this.h.setCurrentItem(this.f26899c);
        observeredClassifiedViewF.setJumpTableChartTimeId((int) TimeUnit.MILLISECONDS.toMinutes(qnh.e(this.n)));
    }

    private void a() {
        String[] strArrE = e(this.f, this);
        HealthSpinner titleSpinner = this.i.getTitleSpinner();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, com.huawei.ui.commonui.R.layout.health_commonui_spinner_item_appbar, strArrE);
        arrayAdapter.setDropDownViewResource(R.layout.hwspinner_dropdown_item);
        if (titleSpinner != null) {
            titleSpinner.setListShadowEnabled(true);
            titleSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
            titleSpinner.setSelection(this.f26899c, true);
            titleSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.HorizontalHeartRateDayActivity.1
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    HorizontalHeartRateDayActivity.this.f26899c = i;
                    HorizontalHeartRateDayActivity.this.h.setCurrentItem(HorizontalHeartRateDayActivity.this.f26899c);
                }
            });
        }
    }

    private String[] e(List<Integer> list, Context context) {
        if (context == null || njy.e(list)) {
            return new String[]{""};
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            String string = context.getResources().getString(iIntValue);
            if (iIntValue != 0 && string != null) {
                arrayList.add(string);
            }
        }
        if (njy.e(arrayList)) {
            return new String[]{""};
        }
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = (String) arrayList.get(i);
        }
        return strArr;
    }

    private void b() {
        this.i = (CustomTitleBar) findViewById(R.id.heart_rate_day_titlebar);
        a();
    }

    private void c() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Health_HeartRateHorizontalActivity", "the HorizontalHeartRateDayActivityNew intent is null,pls check");
            finish();
            return;
        }
        e();
        this.n = intent.getLongExtra(ObserveredClassifiedView.JUMP_TIME_ID, System.currentTimeMillis());
        String stringExtra = intent.getStringExtra(ObserveredClassifiedView.JUMP_DATA_LAYER_ID);
        Serializable serializableExtra = intent.getSerializableExtra(ObserveredClassifiedView.JUMP_DATA_TYPE);
        if (serializableExtra instanceof DataInfos) {
            this.m = (DataInfos) serializableExtra;
        }
        e(stringExtra);
        HeartRateLineChartHolder heartRateLineChartHolder = new HeartRateLineChartHolder(this.e);
        this.l = heartRateLineChartHolder;
        heartRateLineChartHolder.spetifiyDataTypeUnit(new IChartLayerHolder.DataTypeFilter() { // from class: udu
            @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder.DataTypeFilter
            public final boolean isAccept(DataInfos dataInfos) {
                return HorizontalHeartRateDayActivity.c(dataInfos);
            }
        }, this.g);
        DataInfos dataInfos = this.m;
        if (dataInfos == null || !dataInfos.isSupportHorzontal()) {
            finish();
        }
    }

    private void e(String str) {
        if ("default".equals(str)) {
            this.f26899c = 0;
            return;
        }
        Iterator<String> it = this.k.iterator();
        while (it.hasNext() && !it.next().equals(str)) {
            this.f26899c++;
        }
        if (this.f26899c >= 4) {
            this.f26899c = 0;
        }
    }

    private void e() {
        this.f.clear();
        this.f.add(Integer.valueOf(R.string.IDS_main_watch_heart_rate_string));
        this.f.add(Integer.valueOf(R.string.IDS_hw_health_show_healthdata_resting_heart_bmp));
        this.f.add(Integer.valueOf(R.string.IDS_heartrate_raise_alarm));
        this.f.add(Integer.valueOf(R.string.IDS_heartrate_bradycardia_alarm));
        this.k = Arrays.asList(HwHealthChartHolder.LAYER_ID_NORMAL_HR, HwHealthChartHolder.LAYER_ID_REST_HR, HwHealthChartHolder.LAYER_ID_WARNING_HR, HwHealthChartHolder.LAYER_ID_BRADYCARDIA);
        this.g = getString(R.string.IDS_main_watch_heart_rate_unit_string);
        this.j = getString(R.string.IDS_main_watch_heart_rate_string);
    }

    private ObserveredClassifiedView f() {
        DayLineHorizontalClassifiedView dayLineHorizontalClassifiedView = new DayLineHorizontalClassifiedView(this) { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.HorizontalHeartRateDayActivity.2
            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView
            public String convertFloat2TextShow(float f) {
                return UnitUtil.e((int) f, 1, 0);
            }
        };
        dayLineHorizontalClassifiedView.setStepDatatype(DataInfos.query(d(), DateType.DATE_DAY));
        dayLineHorizontalClassifiedView.setHighlightedEntryParser(this.l);
        dayLineHorizontalClassifiedView.selectDataLayerId(HwHealthChartHolder.LAYER_ID_NORMAL_HR);
        dayLineHorizontalClassifiedView.initLandscapeCalendarView(this, this.d, new HealthDataMarkDateTrigger(46019, new int[]{47055, 47005}), true);
        this.f26898b = dayLineHorizontalClassifiedView;
        b(dayLineHorizontalClassifiedView, true);
        return dayLineHorizontalClassifiedView;
    }

    private <T extends ObserveredClassifiedView> void b(T t, boolean z) {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.horizontal_popup_view, (ViewGroup) null);
        this.f26897a = viewInflate;
        DayHeartRateDoubleViewHorizontalDataObserverView dayHeartRateDoubleViewHorizontalDataObserverView = (DayHeartRateDoubleViewHorizontalDataObserverView) viewInflate.findViewById(R.id.day_heartrate_muti_data_view);
        this.h = dayHeartRateDoubleViewHorizontalDataObserverView;
        dayHeartRateDoubleViewHorizontalDataObserverView.setHost(t);
        this.h.b(c(t), b(t), z);
        t.enableObserverView(this.h);
    }

    private <T extends ObserveredClassifiedView> List<ScrollChartHorizontalObserverHRView> c(T t) {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new ScrollChartHorizontalObserverSportHRView(this, t, this.j));
        ScrollChartHorizontalObserverRestHRView scrollChartHorizontalObserverRestHRView = new ScrollChartHorizontalObserverRestHRView(this, t, getString(R.string.IDS_hw_health_show_healthdata_resting_heart_bmp));
        scrollChartHorizontalObserverRestHRView.setAvgCalculator(this.l.h());
        arrayList.add(scrollChartHorizontalObserverRestHRView);
        ScrollChartHorizontalObserverWarningHRView scrollChartHorizontalObserverWarningHRView = new ScrollChartHorizontalObserverWarningHRView(this, t, getString(R.string.IDS_heartrate_raise_alarm));
        scrollChartHorizontalObserverWarningHRView.setScrollChartVisitor(this.l);
        arrayList.add(scrollChartHorizontalObserverWarningHRView);
        ScrollChartHorizontalObserverBradycardiaAlarmView scrollChartHorizontalObserverBradycardiaAlarmView = new ScrollChartHorizontalObserverBradycardiaAlarmView(this, t, getString(R.string.IDS_heartrate_bradycardia_alarm));
        scrollChartHorizontalObserverBradycardiaAlarmView.goneDivider();
        scrollChartHorizontalObserverBradycardiaAlarmView.setScrollChartVisitor(this.l);
        arrayList.add(scrollChartHorizontalObserverBradycardiaAlarmView);
        return arrayList;
    }

    private <T extends ObserveredClassifiedView> List<HwHealthChartHolder.c> b(T t) {
        HwHealthChartHolder.c cVar = new HwHealthChartHolder.c();
        cVar.a(t.getStepDataType());
        cVar.e(HwHealthChartHolder.LAYER_ID_REST_HR);
        HwHealthChartHolder.c cVar2 = new HwHealthChartHolder.c();
        cVar2.a(t.getStepDataType());
        cVar2.e(HwHealthChartHolder.LAYER_ID_WARNING_HR);
        HwHealthChartHolder.c cVar3 = new HwHealthChartHolder.c();
        cVar3.a(t.getStepDataType());
        cVar3.e(HwHealthChartHolder.LAYER_ID_BRADYCARDIA);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(MultiViewHorizontalDataObserverView.f27293c);
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        return arrayList;
    }

    public ClassType d() {
        return ClassType.TYPE_HEART_RATE;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        ObserveredClassifiedView observeredClassifiedView;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || intent == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("selectedDate");
        if (!(serializableExtra instanceof HealthCalendar) || (observeredClassifiedView = this.f26898b) == null) {
            return;
        }
        HealthCalendar healthCalendar = (HealthCalendar) serializableExtra;
        this.d = healthCalendar;
        observeredClassifiedView.processCalendarSelect(healthCalendar);
    }

    private boolean i() {
        LogUtil.d("Health_HeartRateHorizontalActivity", "isTipsHasShown ", 10006, " ", "heart_rate_horizontal_chart_tips_shown");
        String strE = SharedPreferenceManager.e(this.e, String.valueOf(10006), "heart_rate_horizontal_chart_tips_shown");
        if (!TextUtils.isEmpty(strE)) {
            LogUtil.a("Health_HeartRateHorizontalActivity", "isTipsHasShown bFlag:", Boolean.valueOf(Boolean.parseBoolean(strE)));
            return Boolean.parseBoolean(strE);
        }
        LogUtil.a("Health_HeartRateHorizontalActivity", "isTipsHasShown return default");
        return false;
    }

    private void h() {
        ViewStub viewStub = this.o;
        if (viewStub != null) {
            final View viewInflate = viewStub.inflate();
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.horizontal_linechart_relativelayout);
            if (relativeLayout != null) {
                relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: udt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        viewInflate.setVisibility(8);
                    }
                });
            }
        }
    }

    private void c(boolean z) {
        LogUtil.a("Health_HeartRateHorizontalActivity", "saveTipsHasShown bFlag:", Boolean.valueOf(z));
        LogUtil.d("Health_HeartRateHorizontalActivity", "saveTipsHasShown ", 10006, " ", "heart_rate_horizontal_chart_tips_shown");
        SharedPreferenceManager.e(this.e, String.valueOf(10006), "heart_rate_horizontal_chart_tips_shown", Boolean.toString(z), new StorageParams());
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
