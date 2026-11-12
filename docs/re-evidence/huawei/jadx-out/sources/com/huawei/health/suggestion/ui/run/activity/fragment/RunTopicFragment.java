package com.huawei.health.suggestion.ui.run.activity.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.adapter.FitSearchRecyAdapter;
import com.huawei.health.suggestion.ui.run.activity.CustomCourseActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import defpackage.btq;
import defpackage.btt;
import defpackage.btx;
import defpackage.gzq;
import defpackage.hjs;
import defpackage.ibn;
import defpackage.idy;
import defpackage.ien;
import defpackage.njy;
import defpackage.pea;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes31.dex */
public class RunTopicFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f9880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthButton f9881b;
    private int e;
    private int f;
    private HealthTextView h;
    private View j;
    private HealthRecycleView m;
    private FitSearchRecyAdapter o;
    private boolean d = false;
    private Map<String, View> i = new HashMap();
    private Handler g = new e(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnFitnessStatusChangeCallback f9882c = new OnFitnessStatusChangeCallback() { // from class: iah
        @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
        public final void onUpdate() {
            this.f37404b.b();
        }
    };

    static /* synthetic */ int d(RunTopicFragment runTopicFragment) {
        int i = runTopicFragment.e;
        runTopicFragment.e = i + 1;
        return i;
    }

    public /* synthetic */ void b() {
        LogUtil.a("Suggestion_RunTopicFragment", "mWorkoutStatusChangeCallback is refreshView");
        this.e = 0;
        d();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f = arguments.getInt("classifyId");
        }
        View viewInflate = layoutInflater.inflate(R.layout.sug_trainevent_recofm, viewGroup, false);
        this.f9880a = viewInflate.findViewById(R.id.sug_content);
        this.i.put("showLoading", viewInflate.findViewById(R.id.loading_layout));
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.net_error_layout);
        this.f9881b = (HealthButton) linearLayout.findViewById(R.id.btn_no_net_work);
        this.i.put("showNetError", linearLayout);
        b(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.no_record_layout);
        this.j = viewFindViewById;
        this.i.put("showNoData", viewFindViewById);
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.sug_train_rcv_events);
        this.m = healthRecycleView;
        healthRecycleView.setItemAnimator(new DefaultItemAnimator());
        ien.b(btx.c(), this.m);
        this.i.put("showData", this.m);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.sug_fitnes_nodata);
        this.h = healthTextView;
        if (this.f == 1) {
            healthTextView.setText(R.string.IDS_sug_no_custom_course);
        } else {
            healthTextView.setText(R.string.IDS_hwh_sug_fitness_recom_nodata);
        }
        FitSearchRecyAdapter fitSearchRecyAdapter = new FitSearchRecyAdapter((Context) Objects.requireNonNull(getActivity()));
        this.o = fitSearchRecyAdapter;
        this.m.setAdapter(fitSearchRecyAdapter);
        this.e = 0;
        k();
        g();
        btt.d().c(new Runnable() { // from class: iaj
            @Override // java.lang.Runnable
            public final void run() {
                this.f37405a.e();
            }
        });
        btq.e().c(this.f9882c, "CUSTOM_COURSE_UPDATE");
        return viewInflate;
    }

    private void k() {
        if (this.f == 1) {
            LogUtil.a("Suggestion_RunTopicFragment", "setRecyclerViewListener current fragment is custom course fragment.");
            this.m.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.RunTopicFragment.3
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    if (RunTopicFragment.this.m.canScrollVertically(1) || !RunTopicFragment.this.d) {
                        return;
                    }
                    LogUtil.a("Suggestion_RunTopicFragment", "method:loadMore()");
                    RunTopicFragment.d(RunTopicFragment.this);
                    RunTopicFragment.this.d();
                }
            });
        }
    }

    private String i() {
        return getResources().getString(R.string.IDS_sug_new).toUpperCase(Locale.ENGLISH);
    }

    private void b(View view) {
        final HealthToolBar healthToolBar = (HealthToolBar) view.findViewById(R.id.toolbar_new);
        this.i.put("showToolBar", healthToolBar);
        healthToolBar.d(View.inflate(getContext(), R.layout.hw_toolbar_bottomview, null));
        healthToolBar.setIcon(2, R.drawable.ic_public_add);
        healthToolBar.setIconTitle(2, i());
        healthToolBar.setOnSingleTapListener(new HealthToolBar.OnSingleTapListener() { // from class: iag
            @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
            public final void onSingleTap(int i) {
                this.f37403a.a(i);
            }
        });
        healthToolBar.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.RunTopicFragment.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (healthToolBar.getHeight() > 0) {
                    if (RunTopicFragment.this.m.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) RunTopicFragment.this.m.getLayoutParams();
                        marginLayoutParams.bottomMargin = healthToolBar.getHeight();
                        RunTopicFragment.this.m.setLayoutParams(marginLayoutParams);
                        healthToolBar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        return;
                    }
                    LogUtil.e("Suggestion_RunTopicFragment", "setRecyclerMarginBottom mRecycleViewFitWorks.getLayoutParams() is invalid.");
                    return;
                }
                LogUtil.j("Suggestion_RunTopicFragment", "onGlobalLayout toolbar.getHeight() is invalid.");
            }
        });
        healthToolBar.setVisibility(8);
    }

    public /* synthetic */ void a(int i) {
        if (qrs.c(500)) {
            LogUtil.j("Suggestion_RunTopicFragment", "setOnSingleTapListener click button too fast.");
            return;
        }
        FragmentActivity activity = getActivity();
        if (i == 2 && activity != null && isAdded()) {
            Intent intent = new Intent();
            intent.setClass(activity, CustomCourseActivity.class);
            startActivity(intent);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HealthRecycleView healthRecycleView = this.m;
        if (healthRecycleView == null || this.o == null) {
            return;
        }
        healthRecycleView.setAdapter(null);
        this.m.setLayoutManager(null);
        this.m.setAdapter(this.o);
        ien.b(btx.c(), this.m);
        this.o.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e() {
        int i = this.f;
        if (i == 0) {
            f();
        } else if (i == 1) {
            this.o.a(i);
            d();
        } else {
            j();
        }
        HashMap map = new HashMap(10);
        map.put("click", 1);
        map.put("type", Integer.valueOf(this.f));
        idy.b("1130053", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f != 1) {
            return;
        }
        LogUtil.a("Suggestion_RunTopicFragment", "getCustomWorks enter...");
        if (this.e == 0) {
            this.g.sendMessage(Message.obtain(this.g, 3, "showLoading"));
        }
        if (!NetworkUtil.i()) {
            LogUtil.e("Suggestion_RunTopicFragment", "getCustomWorks Network isNetworkAvailable.");
            this.g.sendMessage(Message.obtain(this.g, 3, "showNetError"));
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.e("Suggestion_RunTopicFragment", "getCustomWorks courseApi is null.");
            this.g.sendMessage(Message.obtain(this.g, 3, "showNoData"));
            return;
        }
        courseApi.getCoursesBySecondClassifyId(this.e * 30, 30, 0, 1, new UiCallback<List<Workout>>() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.RunTopicFragment.5
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_RunTopicFragment", "getCoursesBySecondClassifyId failed. ", Integer.valueOf(i), ", ", str);
                if (RunTopicFragment.this.e == 0) {
                    RunTopicFragment.this.g.sendMessage(Message.obtain(RunTopicFragment.this.g, 3, "showNoData"));
                }
                RunTopicFragment.this.g.sendEmptyMessage(4);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<Workout> list) {
                RunTopicFragment.this.g.sendMessage(Message.obtain(RunTopicFragment.this.g, 2, list));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<Workout> list) {
        LogUtil.a("Suggestion_RunTopicFragment", "courseApi get data success.");
        if (njy.e(list)) {
            a("showNoData");
            return;
        }
        this.d = list.size() >= 30;
        List<FitWorkout> listB = pea.b(list);
        hjs.b().b(listB);
        if (njy.e(listB)) {
            LogUtil.e("Suggestion_RunTopicFragment", "getCoursesBySecondClassifyId customWorkouts is null.");
            return;
        }
        Iterator<FitWorkout> it = listB.iterator();
        while (it.hasNext()) {
            it.next().setCourseDefineType(1);
        }
        d(listB);
        a("showData");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        for (Map.Entry<String, View> entry : this.i.entrySet()) {
            int i = 0;
            if (str.equals("showData") || str.equals("showNoData")) {
                View value = entry.getValue();
                if (!entry.getKey().equals(str) && !entry.getKey().equals("showToolBar")) {
                    i = 8;
                }
                value.setVisibility(i);
            } else {
                entry.getValue().setVisibility(entry.getKey().equals(str) ? 0 : 8);
            }
        }
    }

    private void f() {
        if (gzq.a() == 204) {
            LogUtil.a("Suggestion_RunTopicFragment", "isOversea");
            d(gzq.a());
        } else {
            h();
        }
    }

    private void h() {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_RunTopicFragment", "getTopicId : courseApi is null.");
        } else {
            courseApi.getCourseTopicList(0, new UiCallback<List<Topic>>() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.RunTopicFragment.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Suggestion_RunTopicFragment", "getCourseTopicList()  errorCode:", Integer.valueOf(i), " error info ", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<Topic> list) {
                    if (njy.e(list)) {
                        LogUtil.j("Suggestion_RunTopicFragment", "initRunCourseTopic data null");
                        return;
                    }
                    for (Topic topic : list) {
                        if (topic != null && "SF006".equals(topic.acquireSerialNum())) {
                            RunTopicFragment.this.d(topic.acquireId());
                            return;
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        LogUtil.a("Suggestion_RunTopicFragment", "----getInitWorks()--");
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_RunTopicFragment", "getInitWorks : courseApi is null.");
        } else {
            courseApi.getCoursesByTopicId(0, i, new UiCallback<List<Workout>>() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.RunTopicFragment.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i2, String str) {
                    LogUtil.j("Suggestion_RunTopicFragment", str, "getInitWorks ==Failed--errorCode:", Integer.valueOf(i2));
                    RunTopicFragment.this.g.sendEmptyMessage(0);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<Workout> list) {
                    RunTopicFragment.this.g.sendMessage(Message.obtain(RunTopicFragment.this.g, 1, ibn.c(pea.b(list))));
                }
            });
        }
    }

    private void j() {
        LogUtil.a("Suggestion_RunTopicFragment", "Suggestion_RunTopicFragment", "----getRecommendWorks()--");
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_RunTopicFragment", "getRecommendWorks : courseApi is null.");
        } else {
            courseApi.getCoursesBySecondClassifyId(this.e * 30, 30, this.f, 0, new UiCallback<List<Workout>>() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.RunTopicFragment.8
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("Suggestion_RunTopicFragment", str, "getCoursesBySecondClassifyId == Failed--errorCode:", Integer.valueOf(i));
                    RunTopicFragment.this.g.sendEmptyMessage(0);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<Workout> list) {
                    RunTopicFragment.this.g.sendMessage(Message.obtain(RunTopicFragment.this.g, 1, pea.b(list)));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<FitWorkout> list) {
        if (this.e == 0) {
            this.o.c();
        }
        if (njy.b(list)) {
            LogUtil.a("Suggestion_RunTopicFragment", "getData Size: ", Integer.valueOf(list.size()));
            this.o.d(list);
        }
        if (this.d) {
            this.o.a();
        } else {
            this.o.d();
        }
    }

    private void l() {
        this.j.setVisibility(0);
        if (LanguageUtil.ba(getContext())) {
            ((ImageView) this.j.findViewById(R.id.iv_sug_fitness_no_data)).setScaleX(-1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f9880a.setVisibility(8);
        l();
        this.o.d();
    }

    private void g() {
        this.f9881b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.RunTopicFragment.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view == null) {
                    LogUtil.e("Suggestion_RunTopicFragment", "mBtnSetNetWork onClick view is null.");
                } else {
                    CommonUtil.t(RunTopicFragment.this.getContext());
                }
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        btq.e().d(this.f9882c, "CUSTOM_COURSE_UPDATE");
        this.f9882c = null;
        super.onDestroy();
    }

    static class e extends BaseHandler<RunTopicFragment> {
        public e(Looper looper, RunTopicFragment runTopicFragment) {
            super(looper, runTopicFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(RunTopicFragment runTopicFragment, Message message) {
            LogUtil.a("Suggestion_RunTopicFragment", "handleMessageWhenReferenceNotNull, message.what = ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 0) {
                runTopicFragment.c();
                return;
            }
            if (i == 1) {
                if (message.obj instanceof List) {
                    runTopicFragment.d((List<FitWorkout>) message.obj);
                }
            } else if (i == 2) {
                if (message.obj instanceof List) {
                    runTopicFragment.b((List<Workout>) message.obj);
                }
            } else if (i == 3) {
                if (message.obj instanceof String) {
                    runTopicFragment.a((String) message.obj);
                }
            } else if (i == 4) {
                runTopicFragment.o.d();
            } else {
                LogUtil.j("Suggestion_RunTopicFragment", "handleMessageWhenReferenceNotNull, message.what = ", Integer.valueOf(message.what));
            }
        }
    }
}
