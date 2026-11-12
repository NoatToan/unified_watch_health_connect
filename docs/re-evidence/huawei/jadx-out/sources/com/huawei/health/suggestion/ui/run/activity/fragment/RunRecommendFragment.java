package com.huawei.health.suggestion.ui.run.activity.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.SportAllCourseActivity;
import com.huawei.health.suggestion.ui.run.adapter.FitnessCourseHorizontalAdapter;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.btx;
import defpackage.ien;
import defpackage.iov;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class RunRecommendFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FitnessCourseHorizontalAdapter f9877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f9878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f9879c;
    private RelativeLayout d;
    private ArrayList<FitWorkout> e = new ArrayList<>();
    private HealthSubHeader i;

    public static RunRecommendFragment d() {
        return new RunRecommendFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("Suggestion_RunCourseRecommend", "onCreateView");
        View viewInflate = View.inflate(BaseApplication.b(), R.layout.sug_fragment_recomend_run_course, null);
        BaseActivity.setViewSafeRegion(false, viewInflate);
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.hw_health_recommend_run_course_title);
        this.i = healthSubHeader;
        healthSubHeader.setMoreTextVisibility(4);
        this.i.setMoreLayoutVisibility(4);
        this.i.setSubHeaderBackgroundColor(ContextCompat.getColor(viewInflate.getContext(), com.huawei.health.servicesui.R.color.common_transparent));
        this.f9878b = (HealthTextView) viewInflate.findViewById(R.id.hw_show_health_data_inputweight_top_date);
        this.i.setMoreLayoutVisibility(8);
        this.f9879c = getContext();
        c(viewInflate);
        Bundle arguments = getArguments();
        if (arguments != null && njy.e(this.e)) {
            try {
                this.e = arguments.getParcelableArrayList("recommendCourse");
            } catch (ArrayIndexOutOfBoundsException e) {
                LogUtil.e("Suggestion_RunCourseRecommend", "onCreateView", LogAnonymous.b(e));
            }
        }
        if (njy.b(this.e)) {
            LogUtil.a("Suggestion_RunCourseRecommend", " mRecommendWorkoutList", Integer.valueOf(this.e.size()));
            d(this.e);
        }
        return viewInflate;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        super.initViewTahiti();
    }

    private void d(final List<FitWorkout> list) {
        FragmentActivity activity = getActivity();
        if (activity == null || !isAdded()) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: iaf
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c(list);
            }
        });
    }

    public /* synthetic */ void c(List list) {
        this.d.setVisibility(0);
        this.f9877a.c(list);
        if (ien.e(this.f9879c)) {
            return;
        }
        this.i.setHeadTitleText(this.f9879c.getResources().getText(R.string.IDS_fitness_advice_run_all_running_courses).toString());
        this.f9878b.setVisibility(8);
        this.i.setMoreLayoutVisibility(0);
    }

    private void c(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.head_recommend_run_course);
        this.d = relativeLayout;
        relativeLayout.setVisibility(8);
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.head_recommend_run_course_recycler);
        FitnessCourseHorizontalAdapter fitnessCourseHorizontalAdapter = new FitnessCourseHorizontalAdapter();
        this.f9877a = fitnessCourseHorizontalAdapter;
        healthRecycleView.setAdapter(fitnessCourseHorizontalAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(btx.c());
        linearLayoutManager.setOrientation(0);
        healthRecycleView.setLayoutManager(linearLayoutManager);
        healthRecycleView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.RunRecommendFragment.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                return false;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public void onRequestDisallowInterceptTouchEvent(boolean z) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.RunRecommendFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (qrs.r()) {
                    LogUtil.a("Suggestion_RunCourseRecommend", "onClick, isFastClick");
                    return;
                }
                Intent intent = new Intent(RunRecommendFragment.this.f9879c, (Class<?>) SportAllCourseActivity.class);
                intent.putExtra("SKIP_ALL_COURSE_KEY", "RUNNING_COURSE");
                iov.d(RunRecommendFragment.this.f9879c, intent);
                HashMap map = new HashMap(1);
                map.put("click", 1);
                lmf.d().c(RunRecommendFragment.this.getContext(), AnalyticsValue.HEALTH_SPORT_TAP_ALL_RUNNING_COURSE_1120018.value(), map, 0);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        LogUtil.a("Suggestion_RunCourseRecommend", "onStop() enter");
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        LogUtil.a("Suggestion_RunCourseRecommend", "onDestroyView() enter!");
        super.onDestroyView();
    }
}
