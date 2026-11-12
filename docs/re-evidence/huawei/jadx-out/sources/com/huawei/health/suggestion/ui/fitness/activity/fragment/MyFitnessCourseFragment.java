package com.huawei.health.suggestion.ui.fitness.activity.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.adapter.MyCourseAdapter;
import com.huawei.health.suggestion.ui.fitness.activity.MyFitnessCourseActivity;
import com.huawei.health.suggestion.ui.fitness.activity.SportAllCourseActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.btq;
import defpackage.btt;
import defpackage.btx;
import defpackage.hjs;
import defpackage.ien;
import defpackage.njy;
import defpackage.pea;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class MyFitnessCourseFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f9205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MyCourseAdapter f9206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f9207c;
    private boolean d = true;
    private HealthSubHeader e;
    private OnFitnessStatusChangeCallback g;
    private b h;
    private LinearLayout i;
    private HealthRecycleView j;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.sug_fragment_my_fitness_course, viewGroup, false);
        c(viewInflate);
        this.h = new b(this);
        this.g = new OnFitnessStatusChangeCallback() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.MyFitnessCourseFragment.4
            @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
            public void onUpdate() {
                MyFitnessCourseFragment.this.d = true;
            }
        };
        btq.e().c(this.g, "WORKOUT_FINISHED");
        btq.e().c(this.g, "WORKOUT_DELETE");
        return viewInflate;
    }

    private void c(View view) {
        if (view == null) {
            LogUtil.e("Suggestion_MyFitnessCourseFragment", "initLayout(), view == null");
            return;
        }
        this.e = (HealthSubHeader) view.findViewById(R.id.head_my_fitness_course);
        if (getContext() != null && (LanguageUtil.v(getContext()) || LanguageUtil.az(getContext()))) {
            this.e.setSubHeaderTitleScaleTextSize(0.75f);
        }
        this.f9207c = (RelativeLayout) view.findViewById(R.id.my_fitness_course_recycler_layout);
        this.j = (HealthRecycleView) view.findViewById(R.id.my_fitness_course_recycler_view);
        this.i = (LinearLayout) view.findViewById(R.id.my_fitness_no_course_layout);
        this.f9205a = (HealthButton) view.findViewById(R.id.choose_fitness_course_button);
        this.e.setMoreTextVisibility(4);
        e();
        MyCourseAdapter myCourseAdapter = new MyCourseAdapter(this.j);
        this.f9206b = myCourseAdapter;
        this.j.setAdapter(myCourseAdapter);
        ien.b(getContext(), this.j);
        this.j.setHasFixedSize(true);
        this.j.setNestedScrollingEnabled(false);
        this.h = new b(this);
        btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.MyFitnessCourseFragment.5
            @Override // java.lang.Runnable
            public void run() {
                MyFitnessCourseFragment myFitnessCourseFragment = MyFitnessCourseFragment.this;
                myFitnessCourseFragment.d(myFitnessCourseFragment.h);
            }
        });
    }

    private void e() {
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.MyFitnessCourseFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    LogUtil.a("Suggestion_MyFitnessCourseFragment", "mChooseButton onClick, isFastClick");
                } else {
                    MyFitnessCourseFragment.this.startActivity(new Intent(btx.c(), (Class<?>) MyFitnessCourseActivity.class));
                }
            }
        });
        this.f9205a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.MyFitnessCourseFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    LogUtil.a("Suggestion_MyFitnessCourseFragment", "mChooseButton onClick, isFastClick");
                    return;
                }
                Intent intent = new Intent(btx.c(), (Class<?>) SportAllCourseActivity.class);
                intent.putExtra("SKIP_ALL_COURSE_KEY", "FITNESS_COURSE");
                MyFitnessCourseFragment.this.startActivity(intent);
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        HealthRecycleView healthRecycleView = this.j;
        if (healthRecycleView == null || this.f9206b == null) {
            return;
        }
        healthRecycleView.setAdapter(null);
        this.j.setLayoutManager(null);
        this.j.setAdapter(this.f9206b);
        ien.b(getContext(), this.j);
        this.f9206b.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(b bVar) {
        if (bVar == null) {
            LogUtil.e("Suggestion_MyFitnessCourseFragment", "getDataAndRefreshWorkoutData", "uiCallback is null");
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_MyFitnessCourseFragment", "getDataAndRefreshWorkoutData : courseApi is null.");
        } else {
            courseApi.getUserCourseList(0, 50, 1, "FITNESS_COURSE", bVar);
        }
    }

    static class b extends UiCallback<List<Workout>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        MyFitnessCourseFragment f9212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<MyFitnessCourseFragment> f9213b;
        private boolean e = true;

        b(MyFitnessCourseFragment myFitnessCourseFragment) {
            WeakReference<MyFitnessCourseFragment> weakReference = new WeakReference<>(myFitnessCourseFragment);
            this.f9213b = weakReference;
            this.f9212a = weakReference.get();
        }

        public void c(boolean z) {
            this.e = z;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            if (!this.e) {
                LogUtil.e("Suggestion_MyFitnessCourseFragment", "MyUiCallbackFitnessCourse() mEnable=false ");
                return;
            }
            MyFitnessCourseFragment myFitnessCourseFragment = this.f9212a;
            if (myFitnessCourseFragment == null || myFitnessCourseFragment.f9206b == null) {
                return;
            }
            this.f9212a.f9206b.notifyDataSetChanged();
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Workout> list) {
            LogUtil.a("Suggestion_MyFitnessCourseFragment", "MyUiCallbackFitnessCourse(", Integer.valueOf(hashCode()), ") onSuccess()");
            if (this.f9212a == null) {
                return;
            }
            if (njy.e(list)) {
                LogUtil.j("Suggestion_MyFitnessCourseFragment", "my running Workout data == null");
                return;
            }
            List<FitWorkout> listA = hjs.b().a(pea.b(list));
            if (listA.isEmpty()) {
                LogUtil.j("Suggestion_MyFitnessCourseFragment", "reorderList is empty!");
                return;
            }
            ArrayList arrayList = new ArrayList(2);
            int i = 1;
            for (FitWorkout fitWorkout : listA) {
                if (fitWorkout != null && fitWorkout.getWorkoutType() == 1) {
                    if (i > 2) {
                        break;
                    }
                    arrayList.add(fitWorkout);
                    i++;
                }
            }
            if (njy.e(arrayList)) {
                this.f9212a.f9207c.setVisibility(8);
                this.f9212a.i.setVisibility(0);
            } else {
                this.f9212a.f9207c.setVisibility(0);
                this.f9212a.i.setVisibility(8);
            }
            if (this.f9212a.f9206b != null) {
                this.f9212a.f9206b.e(true, arrayList);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LogUtil.a("Suggestion_MyFitnessCourseFragment", "onStart");
        if (this.d) {
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.MyFitnessCourseFragment.3
                @Override // java.lang.Runnable
                public void run() {
                    MyFitnessCourseFragment myFitnessCourseFragment = MyFitnessCourseFragment.this;
                    myFitnessCourseFragment.d(myFitnessCourseFragment.h);
                }
            });
            this.d = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f9206b == null && this.g == null) {
            return;
        }
        this.f9206b = null;
        btq.e().d(this.g, "WORKOUT_FINISHED");
        btq.e().d(this.g, "WORKOUT_DELETE");
        this.g = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.h.c(false);
        super.onDestroyView();
    }
}
