package com.huawei.health.suggestion.ui.run.activity.fragment.runplan;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarView;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.gzx;
import defpackage.ibe;
import defpackage.ibl;
import defpackage.ltb;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class StartTrainDateFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9909a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthColumnLinearLayout f9911c;
    private RelativeLayout e;
    private RunPlanCreateActivity.OnNextPageListener f;
    private HealthTextView g;
    private HealthTextView h;
    private ImageView j;
    private HealthProgressBar m;
    private long i = System.currentTimeMillis();
    private List<View> d = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<View> f9910b = new ArrayList();

    public static StartTrainDateFragment a() {
        return new StartTrainDateFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9909a = getContext();
        View viewInflate = layoutInflater.inflate(R.layout.sug_frag_start_train_date, viewGroup, false);
        c(viewInflate);
        return viewInflate;
    }

    private void c(View view) {
        HealthColumnRelativeLayout healthColumnRelativeLayout = (HealthColumnRelativeLayout) view.findViewById(R.id.layout_tips);
        this.e = (RelativeLayout) healthColumnRelativeLayout.findViewById(R.id.layout_bubbles);
        this.m = (HealthProgressBar) healthColumnRelativeLayout.findViewById(R.id.tips_image_progress);
        this.j = (ImageView) healthColumnRelativeLayout.findViewById(R.id.tips_image);
        HealthTextView healthTextView = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_question);
        healthTextView.setText(getString(R.string.IDS_sug_start_train));
        this.d.add(healthTextView);
        this.f9911c = (HealthColumnLinearLayout) healthColumnRelativeLayout.findViewById(R.id.layout_summary);
        this.h = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_summary);
        HealthSubHeader healthSubHeader = (HealthSubHeader) view.findViewById(R.id.sub_header_train_date);
        healthSubHeader.setSubHeaderBackgroundColor(ContextCompat.getColor(this.f9909a, R.color.common_transparent));
        this.d.add(healthSubHeader);
        this.f9910b.add(healthSubHeader);
        HealthCardView healthCardView = (HealthCardView) view.findViewById(R.id.card_view_start_train_date);
        this.d.add(healthCardView);
        this.f9910b.add(healthCardView);
        BaseActivity.setViewSafeRegion(true, healthSubHeader, healthCardView);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.start_train_time);
        this.g = healthTextView2;
        healthTextView2.setText(c());
        HealthCalendarView healthCalendarView = (HealthCalendarView) view.findViewById(R.id.start_train_calendar_view);
        healthCalendarView.a(true);
        HealthCalendar healthCalendar = new HealthCalendar();
        Date dateB = ltb.b();
        healthCalendar.setTime(dateB);
        HealthCalendar healthCalendar2 = new HealthCalendar();
        healthCalendar2.setTime(new Date(dateB.getTime() + 518400000));
        e(healthCalendarView, healthCalendar, healthCalendar2);
        ibe.a(true, this.d);
        ibl.a(this.f9909a, 45, this.m, this.j);
    }

    private void e(HealthCalendarView healthCalendarView, HealthCalendar healthCalendar, HealthCalendar healthCalendar2) {
        healthCalendarView.setRange(healthCalendar, healthCalendar2, false);
        healthCalendarView.c(false);
        healthCalendarView.setMonthViewIsScroll(false);
        healthCalendarView.setOnCalendarSelectListener(new HealthCalendarView.OnCalendarSelectListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.StartTrainDateFragment.1
            @Override // com.huawei.ui.commonui.calendarview.HealthCalendarView.OnCalendarSelectListener
            public void onCalendarOutOfRange(HealthCalendar healthCalendar3) {
            }

            @Override // com.huawei.ui.commonui.calendarview.HealthCalendarView.OnCalendarSelectListener
            public void onCalendarSelect(HealthCalendar healthCalendar3, boolean z) {
                FragmentActivity activity = StartTrainDateFragment.this.getActivity();
                if (activity != null && !qrs.c(500)) {
                    if (StartTrainDateFragment.this.f == null) {
                        activity.finish();
                        return;
                    }
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(healthCalendar3.getYear(), healthCalendar3.getMonth() - 1, healthCalendar3.getDay());
                    if (calendar.get(6) != Calendar.getInstance().get(6)) {
                        LogUtil.a("Suggestion_StartTrainDateFragment", "plan start date:", calendar.getTime().toString());
                        calendar.set(11, 0);
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                    }
                    StartTrainDateFragment.this.i = calendar.getTimeInMillis();
                    StartTrainDateFragment.this.g.setText(StartTrainDateFragment.this.c());
                    StartTrainDateFragment.this.f.backLock();
                    ibe.a(false, StartTrainDateFragment.this.f9910b);
                    ibe.a(StartTrainDateFragment.this.e, StartTrainDateFragment.this.f9911c, StartTrainDateFragment.this.f, true);
                    return;
                }
                LogUtil.j("Suggestion_StartTrainDateFragment", "calendarView onCalendarSelect activity is null or click too fast.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        Date date = new Date(this.i);
        String strA = UnitUtil.a(date, 20);
        if (ltb.ac(date)) {
            this.h.setText(this.f9909a.getString(R.string.IDS_detail_sleep_bottom_btu_day_txt));
            return gzx.c(this.f9909a, R.string.IDS_run_plan_calendar_title, strA, this.h.getText());
        }
        if (ltb.c(date, new Date(ltb.b().getTime() + 86400000))) {
            this.h.setText(this.f9909a.getString(R.string.IDS_sug_tomorrow));
            return gzx.c(this.f9909a, R.string.IDS_run_plan_calendar_title, strA, this.h.getText());
        }
        this.h.setText(DateFormat.format("yyyy-MM-dd", date));
        return strA;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            LogUtil.a("Suggestion_StartTrainDateFragment", "isHidden fragment.");
        } else {
            this.e.setVisibility(0);
            ibe.a(true, this.d);
        }
    }

    public long d() {
        return this.i;
    }

    public void b(RunPlanCreateActivity.OnNextPageListener onNextPageListener) {
        this.f = onNextPageListener;
    }
}
