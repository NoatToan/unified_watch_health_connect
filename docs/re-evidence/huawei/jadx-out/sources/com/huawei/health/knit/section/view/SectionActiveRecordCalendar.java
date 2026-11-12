package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.knit.section.listener.OnCalendarSelectDataCallback;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarView;
import com.huawei.ui.commonui.calendarview.HealthMark;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.view.threeCircle.ThreeCircleView;
import defpackage.fsj;
import defpackage.ftz;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qjj;
import defpackage.qpx;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionActiveRecordCalendar extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f7718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f7719c;
    private HealthCalendarView d;
    private int e;
    private View f;
    private ImageView i;

    private int a(float f) {
        return (int) (f * 1000.0f);
    }

    public SectionActiveRecordCalendar(Context context) {
        super(context);
    }

    public SectionActiveRecordCalendar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionActiveRecordCalendar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        if (this.f == null) {
            this.f7717a = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_active_record_calendar, (ViewGroup) this, false);
            this.f = viewInflate;
            HealthCalendarView healthCalendarView = (HealthCalendarView) viewInflate.findViewById(R.id.hcv_active_record_calendar);
            this.d = healthCalendarView;
            healthCalendarView.setModeOnlyWeekView();
            this.d.a(true);
            this.d.setIsSelectFutureDate(false);
            this.d.setIsSetGrayFutureDate(true);
            this.d.setSelectGrayDate(false);
            this.d.setWeekStart(2);
            this.d.setMarkerViewClickable(true);
            this.i = (ImageView) this.f.findViewById(R.id.active_record_arrow_left);
            this.f7718b = (HealthTextView) this.f.findViewById(R.id.tv_active_record_date);
            if (Utils.o()) {
                this.f7718b.setCompoundDrawables(null, null, null, null);
            }
            this.f7719c = (ImageView) this.f.findViewById(R.id.active_record_arrow_right);
            e();
        }
        d();
        return this.f;
    }

    private void e() {
        HealthCalendarView healthCalendarView = this.d;
        if (healthCalendarView != null) {
            a(healthCalendarView.getCurrentWeekCalendars());
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionActiveRecordCalendar";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionActiveRecordCalendar", " enter bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionActiveRecordCalendar", "no need to bind");
            return;
        }
        setOnCalendarSelectDataCallback(map);
        setDialogCalendarClickCallBack(map);
        d(map);
        c(map);
        setCurWeekThreeCircle(map);
        setWeekChangeCallback(map);
        qsp.a(this.f7718b, qqw.d((Map) map, "BAR_CHART_DATE_TEXT", ""), true);
        this.e = qqw.c(map, "IS_DATA_TYPE_DAY", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getStartCalendarString() {
        return UnitUtil.a(new Date(1530374400000L), 20);
    }

    private void c(HashMap<String, Object> map) {
        Object obj = map.get("CALENDAR_START_DAY");
        if (obj instanceof Long) {
            Long l = (Long) obj;
            long jLongValue = l.longValue();
            LogUtil.a("SectionActiveRecordCalendar", "updateCalendarStartTime ", l);
            this.d.setRangeGray(null, new HealthCalendar(jLongValue - 86400000));
        }
    }

    private void setCurWeekThreeCircle(HashMap<String, Object> map) {
        long jLongValue;
        Object obj = map.get("BAR_DATA_INFOS");
        Object obj2 = map.get("BAR_CHART_CURRENT_DAY");
        List arrayList = new ArrayList(16);
        Object obj3 = map.get("CALENDAR_START_DAY");
        if (njy.b(obj, fsj.class)) {
            arrayList = (List) obj;
        }
        if (obj3 instanceof Long) {
            Long l = (Long) obj3;
            jLongValue = l.longValue();
            LogUtil.a("SectionActiveRecordCalendar", "updateCalendarStartTime ", l);
        } else {
            jLongValue = 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (obj2 instanceof Long) {
            jCurrentTimeMillis = ((Long) obj2).longValue();
        }
        long jE = lsl.e(jCurrentTimeMillis, 2, 0);
        Map<String, HealthCalendar> map2 = new HashMap<>(16);
        for (int i = 0; i < arrayList.size(); i++) {
            ThreeCircleView threeCircleView = new ThreeCircleView(BaseApplication.b(), 1);
            a(threeCircleView);
            HealthMark healthMark = new HealthMark();
            healthMark.a(qrs.d(this.f7717a, 2.0f));
            HealthCalendar healthCalendar = new HealthCalendar();
            healthCalendar.setTime(new Date(lsl.c(jE, i)));
            fsj fsjVar = (fsj) arrayList.get(i);
            if (e(healthCalendar) || b(jLongValue, healthCalendar)) {
                LogUtil.a("SectionActiveRecordCalendar", "update gray circle");
                setFutureCircleGray(threeCircleView);
                a(map2, healthCalendar, threeCircleView, healthMark);
            } else {
                c(threeCircleView, fsjVar);
                a(map2, healthCalendar, threeCircleView, healthMark);
            }
        }
        this.d.e(map2);
    }

    private void a(View view) {
        int iD = qrs.d(BaseApplication.b(), 30.0f);
        view.setLayoutParams(new FrameLayout.LayoutParams(iD, iD));
    }

    private void a(Map<String, HealthCalendar> map, HealthCalendar healthCalendar, View view, HealthMark healthMark) {
        healthMark.e(view);
        healthCalendar.addMark(healthMark);
        map.put(healthCalendar.toString(), healthCalendar);
    }

    private boolean e(HealthCalendar healthCalendar) {
        return HiDateUtil.p(System.currentTimeMillis()) < qjj.d(healthCalendar);
    }

    private boolean b(long j, HealthCalendar healthCalendar) {
        return qjj.d(healthCalendar) < qjj.d(new HealthCalendar(j));
    }

    private void setFutureCircleGray(ThreeCircleView threeCircleView) {
        ftz.d(ftz.e, threeCircleView);
    }

    private void setDialogCalendarClickCallBack(HashMap<String, Object> map) {
        if (map.get("CLICK_EVENT_LISTENER") instanceof View.OnClickListener) {
            View.OnClickListener onClickListener = (View.OnClickListener) map.get("CLICK_EVENT_LISTENER");
            HealthTextView healthTextView = this.f7718b;
            if (healthTextView != null) {
                healthTextView.setOnClickListener(onClickListener);
            }
            e();
        }
    }

    private void c(ThreeCircleView threeCircleView, fsj fsjVar) {
        ftz.d(ftz.b(fsjVar.ag()), threeCircleView);
        if (fsjVar.ag()) {
            threeCircleView.a("firstCircle", a(fsjVar.b()), a(d(fsjVar.c(), fsjVar.b())));
        } else {
            threeCircleView.a("firstCircle", fsjVar.u(), d(fsjVar.x(), fsjVar.u()));
        }
        threeCircleView.a("secondCircle", fsjVar.g(), d(fsjVar.i(), fsjVar.g()));
        threeCircleView.a("thirdCircle", fsjVar.p(), d(fsjVar.q(), fsjVar.p()));
    }

    private int d(int i, float f) {
        if (Float.compare(f, 0.0f) == 0) {
            return 0;
        }
        return i;
    }

    private void setWeekChangeCallback(HashMap<String, Object> map) {
        Object obj = map.get("CALENDAR_START_DAY");
        if (obj instanceof Long) {
            final long jLongValue = ((Long) obj).longValue();
            final HealthCalendar healthCalendar = new HealthCalendar(jLongValue);
            if (map.get("BAR_CHART_CALENDAR_CLICK_EVENT") instanceof OnCalendarSelectDataCallback) {
                final OnCalendarSelectDataCallback onCalendarSelectDataCallback = (OnCalendarSelectDataCallback) map.get("BAR_CHART_CALENDAR_CLICK_EVENT");
                HealthCalendarView healthCalendarView = this.d;
                if (healthCalendarView == null) {
                    return;
                }
                healthCalendarView.setOnWeekChangeListener(new HealthCalendarView.OnWeekChangeListener() { // from class: fvb
                    @Override // com.huawei.ui.commonui.calendarview.HealthCalendarView.OnWeekChangeListener
                    public final void onWeekChange(List list) {
                        this.e.d(jLongValue, onCalendarSelectDataCallback, healthCalendar, list);
                    }
                });
            }
        }
    }

    public /* synthetic */ void d(long j, OnCalendarSelectDataCallback onCalendarSelectDataCallback, HealthCalendar healthCalendar, List list) {
        LogUtil.a("SectionActiveRecordCalendar", "onWeekChange enter ", list == null ? null : Integer.valueOf(list.size()));
        int i = this.e;
        int i2 = i == 0 ? 0 : i - 1;
        if (njy.c(list, i2)) {
            if (((HealthCalendar) list.get(i2)).transformCalendar().getTimeInMillis() < j) {
                onCalendarSelectDataCallback.onCalendarSelect(healthCalendar, true);
            } else {
                onCalendarSelectDataCallback.onCalendarSelect((HealthCalendar) list.get(i2), true);
            }
        }
        a((List<HealthCalendar>) list);
    }

    private void a(List<HealthCalendar> list) {
        if (njy.e(list)) {
            return;
        }
        HealthCalendar healthCalendar = list.get(0);
        HealthCalendar healthCalendar2 = list.get(list.size() - 1);
        long jD = qjj.d(healthCalendar);
        long jE = qjj.e(healthCalendar2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis >= jD && jCurrentTimeMillis <= jE) {
            this.f7719c.setVisibility(4);
            this.d.setForbiddenSwipeNextWeek(true);
        } else {
            this.f7719c.setVisibility(0);
            this.d.setForbiddenSwipeNextWeek(false);
        }
    }

    private void setOnCalendarSelectDataCallback(HashMap<String, Object> map) {
        if (map.get("BAR_COMMON_MARK_CHANGE_CALL_BACK") instanceof OnCalendarSelectDataCallback) {
            final OnCalendarSelectDataCallback onCalendarSelectDataCallback = (OnCalendarSelectDataCallback) map.get("BAR_COMMON_MARK_CHANGE_CALL_BACK");
            HealthCalendarView healthCalendarView = this.d;
            if (healthCalendarView != null) {
                healthCalendarView.setOnCalendarSelectListener(new HealthCalendarView.OnCalendarSelectListener() { // from class: com.huawei.health.knit.section.view.SectionActiveRecordCalendar.1
                    @Override // com.huawei.ui.commonui.calendarview.HealthCalendarView.OnCalendarSelectListener
                    public void onCalendarOutOfRange(HealthCalendar healthCalendar) {
                        if (Utils.o()) {
                            return;
                        }
                        qpx.e(BaseApplication.b(), BaseApplication.b().getString(R.string.IDS_hw_health_active_record_out_of_bound_tips, SectionActiveRecordCalendar.this.getStartCalendarString()));
                    }

                    @Override // com.huawei.ui.commonui.calendarview.HealthCalendarView.OnCalendarSelectListener
                    public void onCalendarSelect(HealthCalendar healthCalendar, boolean z) {
                        if (SectionActiveRecordCalendar.this.getKnitFragment() == null) {
                            LogUtil.e("SectionActiveRecordCalendar", "KnitFragment is null in onCalendarSelect");
                            return;
                        }
                        FragmentActivity activity = SectionActiveRecordCalendar.this.getKnitFragment().getActivity();
                        if (activity == null) {
                            LogUtil.e("SectionActiveRecordCalendar", "activity is null in onCalendarSelect");
                            return;
                        }
                        onCalendarSelectDataCallback.onCalendarSelect(healthCalendar, z);
                        if (z) {
                            SectionActiveRecordCalendar.this.setBiCollect(2);
                        }
                        CustomTitleBar customTitleBar = (CustomTitleBar) activity.findViewById(R.id.knit_health_detail_title_bar);
                        if (customTitleBar == null) {
                            LogUtil.j("SectionActiveRecordCalendar", "CustomTitleBar is null in onCalendarSelect");
                        } else if (HiDateUtil.d(healthCalendar.transformCalendar().getTimeInMillis()) > HiDateUtil.d(System.currentTimeMillis())) {
                            customTitleBar.setRightSoftkeyVisibility(8);
                        } else {
                            customTitleBar.setRightSoftkeyVisibility(0);
                        }
                    }
                });
            }
        }
    }

    private void d(HashMap<String, Object> map) {
        Object obj = map.get("BAR_COMMON_CALENDER_EVENT");
        if (obj instanceof HealthCalendar) {
            this.d.a((HealthCalendar) obj);
        }
        Object obj2 = map.get("CALENDAR_START_DAY");
        long jLongValue = obj2 instanceof Long ? ((Long) obj2).longValue() : 1530374400000L;
        Object obj3 = map.get("BAR_CHART_CURRENT_DAY");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (obj3 instanceof Long) {
            jCurrentTimeMillis = ((Long) obj3).longValue();
        }
        if (HiDateUtil.s(jCurrentTimeMillis)[0] == HiDateUtil.s(jLongValue)[0]) {
            this.i.setVisibility(4);
            this.d.setForbiddenSwipePreWeek(true);
        } else {
            this.i.setVisibility(0);
            this.d.setForbiddenSwipePreWeek(false);
        }
    }

    private void d() {
        if (LanguageUtil.ba(this.f7717a)) {
            this.i.setBackground(ContextCompat.getDrawable(this.f7717a, R.drawable.common_right_arrow_click_selector));
            this.f7719c.setBackground(ContextCompat.getDrawable(this.f7717a, R.drawable.common_left_arrow_click_selector));
        } else {
            this.i.setBackground(ContextCompat.getDrawable(this.f7717a, R.drawable.common_left_arrow_click_selector));
            this.f7719c.setBackground(ContextCompat.getDrawable(this.f7717a, R.drawable.common_right_arrow_click_selector));
        }
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionActiveRecordCalendar.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SectionActiveRecordCalendar.this.d.e(true);
                SectionActiveRecordCalendar.this.setBiCollect(1);
            }
        });
        this.f7719c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionActiveRecordCalendar.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SectionActiveRecordCalendar.this.d.b(true);
                SectionActiveRecordCalendar.this.setBiCollect(1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBiCollect(int i) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("switchType", Integer.valueOf(i));
        lmf.d().c(this.f7717a, AnalyticsValue.HEALTH_HOME_CIRCLE_RING_1040107.value(), map, 0);
    }
}
