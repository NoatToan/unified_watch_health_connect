package com.huawei.health.suggestion.ui.run.activity.fragment.runplan;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.datepicker.HealthDatePicker;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.gzx;
import defpackage.ibe;
import defpackage.ibl;
import defpackage.lsl;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class SetCompeteDateFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f9905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f9906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f9907c;
    private HealthDatePicker d;
    private Calendar e;
    private RelativeLayout g;
    private HealthColumnLinearLayout j;
    private HealthTextView k;
    private ImageView l;
    private long m;
    private HealthProgressBar n;
    private RunPlanCreateActivity.OnNextPageListener o;
    private List<View> i = new ArrayList();
    private List<View> h = new ArrayList();
    private Handler f = new Handler(Looper.getMainLooper()) { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.SetCompeteDateFragment.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                SetCompeteDateFragment.this.c();
            }
        }
    };

    public static SetCompeteDateFragment b() {
        return new SetCompeteDateFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9906b = getContext();
        View viewInflate = layoutInflater.inflate(R.layout.sug_frag_competition_date, viewGroup, false);
        d(viewInflate);
        return viewInflate;
    }

    private void d(View view) {
        if (view == null) {
            LogUtil.e("Suggestion_CompetitionDateFragment", "initView view is null.");
            return;
        }
        HealthColumnRelativeLayout healthColumnRelativeLayout = (HealthColumnRelativeLayout) view.findViewById(R.id.layout_tips);
        this.g = (RelativeLayout) healthColumnRelativeLayout.findViewById(R.id.layout_bubbles);
        this.n = (HealthProgressBar) healthColumnRelativeLayout.findViewById(R.id.tips_image_progress);
        this.l = (ImageView) healthColumnRelativeLayout.findViewById(R.id.tips_image);
        HealthTextView healthTextView = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_question);
        healthTextView.setText(getString(R.string.IDS_sug_compete_date));
        this.i.add(healthTextView);
        this.j = (HealthColumnLinearLayout) healthColumnRelativeLayout.findViewById(R.id.layout_summary);
        this.k = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_summary);
        HealthTextView healthTextView2 = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_comments);
        this.f9907c = healthTextView2;
        healthTextView2.setVisibility(0);
        this.i.add(this.f9907c);
        this.h.add(this.f9907c);
        HealthCardView healthCardView = (HealthCardView) view.findViewById(R.id.competition_date_select_layout);
        this.i.add(healthCardView);
        this.h.add(healthCardView);
        BaseActivity.setViewSafeRegion(true, this.f9907c, healthCardView);
        HealthButton healthButton = (HealthButton) view.findViewById(R.id.sug_btn_next);
        this.f9905a = healthButton;
        this.i.add(healthButton);
        this.h.add(this.f9905a);
        this.d = (HealthDatePicker) view.findViewById(R.id.event_date_picker);
        c();
        ibe.a(true, this.i);
        ibl.a(this.f9906b, 80, this.n, this.l);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            LogUtil.a("Suggestion_CompetitionDateFragment", "isHidden fragment.");
        } else {
            this.g.setVisibility(0);
            ibe.a(true, this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.m);
        gregorianCalendar.add(5, 28);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(this.m);
        gregorianCalendar2.add(5, 112);
        this.f9907c.setText(gzx.c(BaseApplication.b(), R.string.IDS_sug_compete_date_tip, UnitUtil.a(gregorianCalendar.getTime(), 20), UnitUtil.a(gregorianCalendar2.getTime(), 20)));
        this.d.setmIsSupportLunarSwitch(false);
        this.d.setmIsWestern(true);
        this.d.e(gregorianCalendar, gregorianCalendar2);
        this.d.d(gregorianCalendar.get(1), gregorianCalendar.get(2) + 1, gregorianCalendar.get(5));
        this.e = Calendar.getInstance();
        this.f9905a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.SetCompeteDateFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FragmentActivity activity = SetCompeteDateFragment.this.getActivity();
                if (activity != null && !qrs.c(500)) {
                    if (SetCompeteDateFragment.this.o != null) {
                        SetCompeteDateFragment.this.o.backLock();
                        ibe.a(false, SetCompeteDateFragment.this.h);
                        SetCompeteDateFragment.this.d();
                        ibe.a(SetCompeteDateFragment.this.g, SetCompeteDateFragment.this.j, SetCompeteDateFragment.this.o, true);
                        return;
                    }
                    activity.finish();
                    return;
                }
                LogUtil.j("Suggestion_CompetitionDateFragment", "mBtnNext onClick activity is null or click too fast.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.k.setText(DateFormat.format("yyyy-MM-dd", e()));
    }

    public void a() {
        this.f.sendEmptyMessage(1);
    }

    public void c(long j) {
        this.m = j;
    }

    public long e() {
        Calendar calendar = this.e;
        if (calendar == null) {
            return 0L;
        }
        calendar.set(this.d.getYear(), this.d.getMonth() - 1, this.d.getDayOfMonth());
        return lsl.c(this.e.getTimeInMillis());
    }

    public void c(RunPlanCreateActivity.OnNextPageListener onNextPageListener) {
        this.o = onNextPageListener;
    }
}
