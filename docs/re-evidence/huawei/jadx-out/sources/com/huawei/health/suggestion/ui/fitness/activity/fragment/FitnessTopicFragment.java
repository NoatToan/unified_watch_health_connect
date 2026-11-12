package com.huawei.health.suggestion.ui.fitness.activity.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.WorkoutListBean;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessTopicActivity;
import com.huawei.health.suggestion.ui.fitness.adapter.FitnessTopicRecyAdapter;
import com.huawei.health.suggestion.ui.fitness.module.FitnessTopicDeleteModel;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.btt;
import defpackage.btx;
import defpackage.hjs;
import defpackage.ien;
import defpackage.njy;
import defpackage.pea;
import defpackage.qpn;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessTopicFragment extends BaseFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTitleBar f9194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bundle f9195b;
    private HealthCheckBox d;
    private HealthButton e;
    private FitnessTopicRecyAdapter g;
    private LinearLayout h;
    private Intent j;
    private LinearLayout k;
    private int m;
    private HealthTextView n;
    private View o;
    private HealthRecycleView q;
    private LinearLayout r;
    private RelativeLayout s;
    private HealthTextView t;
    private int u;
    private int w;
    private String x;
    private boolean i = true;
    private List<Integer> p = new ArrayList(10);
    private boolean f = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FitnessTopicDeleteModel f9196c = new FitnessTopicDeleteModel();
    private List<FitWorkout> v = new ArrayList(10);
    private Handler l = new Handler(Looper.getMainLooper()) { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessTopicFragment.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.e("Suggestion_FitnessTopicFragment", "handleMessage(), message == null");
                return;
            }
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            FitnessTopicFragment.this.f();
        }
    };

    static /* synthetic */ int l(FitnessTopicFragment fitnessTopicFragment) {
        int i = fitnessTopicFragment.m;
        fitnessTopicFragment.m = i + 1;
        return i;
    }

    public static FitnessTopicFragment a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        FitnessTopicFragment fitnessTopicFragment = new FitnessTopicFragment();
        fitnessTopicFragment.setArguments(bundle);
        return fitnessTopicFragment;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.w = arguments.getInt("type");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.sug_fragment_fit_topic, viewGroup, false);
        e(viewInflate);
        return viewInflate;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.btn_no_net_work) {
            LogUtil.a("Suggestion_FitnessTopicFragment", "view == mButtonNoNet");
            CommonUtil.t(getContext());
            return;
        }
        if (view.getId() == R.id.reload_layout) {
            if (this.i) {
                this.i = false;
                a();
                return;
            }
            return;
        }
        if (view.getId() == R.id.sug_tv_jonied_deleMode) {
            LogUtil.a("Suggestion_FitnessTopicFragment", "view == R.id.sug_tv_jonied_deleMode");
            b();
        } else if (view.getId() == R.id.sug_tv_jonied_all) {
            LogUtil.a("Suggestion_FitnessTopicFragment", "view == R.id.sug_tv_jonied_all");
            d();
        } else {
            LogUtil.a("Suggestion_FitnessTopicFragment", "invalid branch");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        HealthRecycleView healthRecycleView = this.q;
        if (healthRecycleView == null || this.g == null) {
            return;
        }
        healthRecycleView.setAdapter(null);
        this.q.setLayoutManager(null);
        this.q.setAdapter(this.g);
        ien.b(getContext(), this.q);
        this.g.notifyDataSetChanged();
    }

    public HealthRecycleView c() {
        return this.q;
    }

    private void b() {
        if (this.p.isEmpty()) {
            boolean z = this.f;
            this.f = !z;
            if (!z) {
                this.d.setVisibility(0);
            } else {
                this.d.setVisibility(8);
            }
            this.f9196c.saveIssDeleteMode(this.f);
            this.g.b(this.f9196c, true);
            return;
        }
        l();
    }

    private void d() {
        if (this.d.isChecked()) {
            this.d.setText(com.huawei.ui.commonui.R.string.IDS_contact_delete_uncheck_all);
            for (int i = 0; i < this.g.b().size(); i++) {
                if (!this.p.contains(Integer.valueOf(i))) {
                    this.p.add(Integer.valueOf(i));
                }
            }
        } else {
            this.d.setText(com.huawei.ui.commonui.R.string.IDS_contact_delete_select_all);
            this.p.clear();
        }
        this.f9196c.saveSelects(this.p);
        this.g.b(this.f9196c, true);
    }

    private void l() {
        LogUtil.d("Suggestion_FitnessTopicFragment", "showDeleteDialog ", "enter");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(getContext());
        builder.a(getString(R.string.IDS_hwh_sug_healthdata_deleteing)).a(getString(R.string.IDS_plugin_fitnessadvice_ok).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessTopicFragment.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("Suggestion_FitnessTopicFragment", "it is positive");
                LogUtil.a("Suggestion_FitnessTopicFragment", "mSelectedList:", FitnessTopicFragment.this.p);
                List<FitWorkout> listB = FitnessTopicFragment.this.g.b();
                FitnessTopicFragment.this.v.clear();
                Iterator it = FitnessTopicFragment.this.p.iterator();
                while (it.hasNext()) {
                    FitnessTopicFragment.this.v.add(listB.get(((Integer) it.next()).intValue()));
                }
                LogUtil.a("Suggestion_FitnessTopicFragment", "delete fitworkout size:", Integer.valueOf(FitnessTopicFragment.this.p.size()));
                CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
                if (courseApi != null) {
                    courseApi.deleteUserJoinedCourses(pea.f(FitnessTopicFragment.this.v), new UiCallback<String>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessTopicFragment.9.4
                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        public void onFailure(int i, String str) {
                            LogUtil.e("Suggestion_FitnessTopicFragment", "delete workout error ", str, "--errorcode:", Integer.valueOf(i));
                            Toast.makeText(btx.c(), str, 1).show();
                        }

                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(String str) {
                            FitnessTopicFragment.this.g();
                            hjs.b().d(FitnessTopicFragment.this.v);
                        }
                    });
                } else {
                    LogUtil.j("Suggestion_FitnessTopicFragment", "showDeleteDialog : courseApi is null.");
                }
            }
        }).d(getString(com.huawei.health.servicesui.R.string.IDS_plugin_fitnessadvice_cancal), new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessTopicFragment.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("Suggestion_FitnessTopicFragment", "it is negative");
            }
        });
        builder.c().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.d.setChecked(false);
        this.d.setText(com.huawei.ui.commonui.R.string.IDS_contact_delete_select_all);
        LogUtil.a("Suggestion_FitnessTopicFragment", "mDeleteModel.acquireSelects().size():", Integer.valueOf(this.f9196c.acquireSelects().size()));
        if (this.f9196c.acquireSelects().size() > 0) {
            this.d.postDelayed(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessTopicFragment.8
                @Override // java.lang.Runnable
                public void run() {
                    FitnessTopicFragment.this.e();
                }
            }, 20L);
        } else {
            this.d.setVisibility(8);
        }
        this.f = false;
        this.f9196c.saveIssDeleteMode(false);
        this.g.b(this.f9196c, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Collections.sort(this.p, new Comparator<Integer>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessTopicFragment.7
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(Integer num, Integer num2) {
                return num2.intValue() - num.intValue();
            }
        });
        Iterator<Integer> it = this.p.iterator();
        while (it.hasNext()) {
            this.g.notifyItemRemoved(it.next().intValue());
        }
        this.p.clear();
        this.d.setVisibility(8);
        if ((this.g.b() == null || this.g.b().size() <= 0) && (this.d.getParent() instanceof View)) {
            ((View) this.d.getParent()).setVisibility(8);
            this.k.setVisibility(0);
            this.r.setVisibility(4);
        }
    }

    private void e(View view) {
        this.o = view.findViewById(R.id.sug_loading_layout);
        this.q = (HealthRecycleView) view.findViewById(R.id.recyclerView_topic);
        this.r = (LinearLayout) view.findViewById(R.id.sug_layout_net_error);
        this.k = (LinearLayout) view.findViewById(R.id.sug_reco_workoutlist_nodata);
        this.e = (HealthButton) view.findViewById(R.id.btn_no_net_work);
        this.s = (RelativeLayout) view.findViewById(R.id.reload_layout);
        this.h = (LinearLayout) view.findViewById(R.id.sug_jonied_selectall);
        this.t = (HealthTextView) view.findViewById(R.id.sug_tv_jonied_deleMode);
        this.d = (HealthCheckBox) view.findViewById(R.id.sug_tv_jonied_all);
        this.n = (HealthTextView) view.findViewById(R.id.sug_fitnes_nodata);
        this.t.setOnClickListener(this);
        this.d.setOnClickListener(this);
        Intent intent = getActivity() == null ? null : getActivity().getIntent();
        this.j = intent;
        if (this.w != 8) {
            this.g = new FitnessTopicRecyAdapter(this.q);
        } else if (intent != null) {
            this.f9195b = intent.getBundleExtra("bundlekey");
            this.g = new FitnessTopicRecyAdapter(this.q, this.w, this.f9195b);
        }
        this.g.e(new FitnessTopicRecyAdapter.LoadMoreListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessTopicFragment.10
            @Override // com.huawei.health.suggestion.ui.fitness.adapter.FitnessTopicRecyAdapter.LoadMoreListener
            public void loadMore() {
                LogUtil.a("Suggestion_FitnessTopicFragment", "loadMore(), load more data");
                if (FitnessTopicFragment.this.u != -1) {
                    FitnessTopicFragment.this.i();
                }
            }
        });
        this.g.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessTopicFragment.6
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i, int i2) {
                FitnessTopicFragment.this.g.b().remove(i);
            }
        });
        ien.b(getContext(), this.q);
        this.q.setNestedScrollingEnabled(false);
        this.q.setAdapter(this.g);
        this.e.setOnClickListener(this);
        this.s.setOnClickListener(this);
        btt.d().c(new d(this));
    }

    static class d implements Runnable {
        private WeakReference<FitnessTopicFragment> e;

        d(FitnessTopicFragment fitnessTopicFragment) {
            this.e = new WeakReference<>(fitnessTopicFragment);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<FitnessTopicFragment> weakReference = this.e;
            if (weakReference == null) {
                LogUtil.e("Suggestion_FitnessTopicFragment", "GetDataRunnable mWeakReference is null.");
                return;
            }
            FitnessTopicFragment fitnessTopicFragment = weakReference.get();
            if (fitnessTopicFragment == null) {
                LogUtil.e("Suggestion_FitnessTopicFragment", "GetDataRunnable fragment is null.");
            } else {
                fitnessTopicFragment.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LogUtil.a("Suggestion_FitnessTopicFragment", "handleInitCustomTitleBar()");
        if (!(getActivity() instanceof FitnessTopicActivity)) {
            LogUtil.e("Suggestion_FitnessTopicFragment", "activity is null.or activity not FitnessTopicActivity.");
            return;
        }
        final FitnessTopicActivity fitnessTopicActivity = (FitnessTopicActivity) getActivity();
        CustomTitleBar customTitleBarD = fitnessTopicActivity.d();
        this.f9194a = customTitleBarD;
        customTitleBarD.setDoubleClickEnable(true);
        this.f9194a.setBackToTopListener(new CustomTitleBar.BackToTopListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessTopicFragment.12
            @Override // com.huawei.ui.commonui.titlebar.CustomTitleBar.BackToTopListener
            public void backToTop() {
                HealthRecycleView healthRecycleViewC;
                LogUtil.a("Suggestion_FitnessTopicFragment", "double clicked, backToTop()");
                HealthViewPager healthViewPagerA = fitnessTopicActivity.a();
                if (healthViewPagerA.getAdapter() instanceof qpn) {
                    qpn qpnVar = (qpn) healthViewPagerA.getAdapter();
                    if (!(qpnVar.getItem(healthViewPagerA.getCurrentItem()) instanceof FitnessTopicFragment) || (healthRecycleViewC = ((FitnessTopicFragment) qpnVar.getItem(healthViewPagerA.getCurrentItem())).c()) == null) {
                        return;
                    }
                    healthRecycleViewC.smoothScrollToPosition(0);
                }
            }
        });
    }

    public void a() {
        if (this.j == null) {
            return;
        }
        o();
        if (this.u == -1) {
            b(false);
            e eVar = new e(this);
            CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            if (courseApi == null) {
                LogUtil.j("Suggestion_FitnessTopicFragment", "getData : courseApi is null.");
                return;
            } else {
                courseApi.getJoinedCourses(new WorkoutListBean(0, Integer.MAX_VALUE, (Integer[]) null, (Integer[]) null, (Integer[]) null, -1, (Integer[]) null, false), eVar);
                return;
            }
        }
        i();
    }

    static class e extends UiCallback<List<Workout>> {
        private WeakReference<FitnessTopicFragment> d;

        e(FitnessTopicFragment fitnessTopicFragment) {
            this.d = new WeakReference<>(fitnessTopicFragment);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Suggestion_FitnessTopicFragment", "GetDataUiCallback ", str, " == Failed--errorCode: ", Integer.valueOf(i));
            WeakReference<FitnessTopicFragment> weakReference = this.d;
            if (weakReference == null) {
                LogUtil.e("Suggestion_FitnessTopicFragment", "GetDataUiCallback onFailure mWeakReference is null.");
                return;
            }
            FitnessTopicFragment fitnessTopicFragment = weakReference.get();
            if (fitnessTopicFragment != null) {
                if (!fitnessTopicFragment.m()) {
                    fitnessTopicFragment.i = true;
                    fitnessTopicFragment.j();
                    return;
                } else {
                    LogUtil.j("Suggestion_FitnessTopicFragment", "GetDataUiCallback onFailure isActivityDestroyed");
                    return;
                }
            }
            LogUtil.e("Suggestion_FitnessTopicFragment", "GetDataUiCallback onFailure fitnessTopicFragment is null.");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Workout> list) {
            LogUtil.a("Suggestion_FitnessTopicFragment", "GetDataUiCallback onSuccess!");
            WeakReference<FitnessTopicFragment> weakReference = this.d;
            if (weakReference == null) {
                LogUtil.e("Suggestion_FitnessTopicFragment", "GetDataUiCallback onSuccess mWeakReference is null.");
                return;
            }
            FitnessTopicFragment fitnessTopicFragment = weakReference.get();
            if (fitnessTopicFragment != null) {
                if (!fitnessTopicFragment.m()) {
                    fitnessTopicFragment.i = true;
                    fitnessTopicFragment.j();
                    if (njy.e(list)) {
                        fitnessTopicFragment.h.setVisibility(8);
                        fitnessTopicFragment.r.setVisibility(8);
                        fitnessTopicFragment.k.setVisibility(0);
                        return;
                    }
                    fitnessTopicFragment.h.setVisibility(0);
                    fitnessTopicFragment.r.setVisibility(8);
                    fitnessTopicFragment.k.setVisibility(8);
                    fitnessTopicFragment.f9196c.saveIssDeleteMode(fitnessTopicFragment.f);
                    fitnessTopicFragment.f9196c.saveSelects(fitnessTopicFragment.p);
                    fitnessTopicFragment.g.e(fitnessTopicFragment.f9196c, true, hjs.b().a(pea.b(list)));
                    return;
                }
                LogUtil.j("Suggestion_FitnessTopicFragment", "GetDataUiCallback onSuccess isActivityDestroyed");
                return;
            }
            LogUtil.e("Suggestion_FitnessTopicFragment", "GetDataUiCallback onSuccess fitnessTopicFragment is null.");
        }
    }

    private void b(final boolean z) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessTopicFragment.15
                @Override // java.lang.Runnable
                public void run() {
                    FitnessTopicFragment.this.g.b(z);
                }
            });
        }
    }

    private void o() {
        this.u = this.j.getIntExtra("intent_key_topicid", -1);
        if (this.j.getStringExtra("intent_key_topicname") != null) {
            this.x = this.j.getStringExtra("intent_key_topicname");
        }
        int i = this.u;
        LogUtil.a("Suggestion_FitnessTopicFragment", "mTopicId:", Integer.valueOf(i), "-mTopicName:", this.x);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessTopicFragment.3
                @Override // java.lang.Runnable
                public void run() {
                    if (FitnessTopicFragment.this.u == -1) {
                        FitnessTopicFragment.this.n.setText(R.string.sug_join_no_record);
                        FitnessTopicFragment.this.g.b(btx.c().getString(R.string.IDS_FitnessAdvice_previous_train));
                    } else {
                        FitnessTopicFragment.this.g.b(FitnessTopicFragment.this.x);
                    }
                    FitnessTopicFragment.this.k.setVisibility(4);
                    FitnessTopicFragment.this.r.setVisibility(4);
                    FitnessTopicFragment.this.n();
                }
            });
        }
    }

    private void c(int i) {
        this.l.sendMessage(Message.obtain(this.l, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        c(1);
        switch (this.w) {
            case 0:
                h();
                break;
            case 1:
                h();
                break;
            case 2:
                b(5);
                break;
            case 3:
                b(10);
                break;
            case 4:
                b(15);
                break;
            case 5:
                b(20);
                break;
            case 6:
                b(25);
                break;
            case 7:
                b(3);
                break;
            case 8:
                h();
                break;
        }
    }

    private void h() {
        c cVar = new c(this);
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_FitnessTopicFragment", "getWorkoutsByTopicIdAndRefresh : courseApi is null.");
        } else {
            courseApi.getCoursesByTopicId(this.m, this.u, cVar);
        }
    }

    static class c extends UiCallback<List<Workout>> {
        private WeakReference<FitnessTopicFragment> d;

        c(FitnessTopicFragment fitnessTopicFragment) {
            this.d = new WeakReference<>(fitnessTopicFragment);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            WeakReference<FitnessTopicFragment> weakReference = this.d;
            if (weakReference == null) {
                LogUtil.e("Suggestion_FitnessTopicFragment", "GetWorkoutsAndRefreshUiCallback onFailure mWeakReference is null.");
                return;
            }
            FitnessTopicFragment fitnessTopicFragment = weakReference.get();
            if (fitnessTopicFragment != null) {
                if (!fitnessTopicFragment.m()) {
                    fitnessTopicFragment.i = true;
                    LogUtil.e("Suggestion_FitnessTopicFragment", "GetWorkoutsAndRefreshUiCallback ", str, "==Failed--errorcode:", Integer.valueOf(i));
                    fitnessTopicFragment.g.b(false);
                    fitnessTopicFragment.j();
                    if (fitnessTopicFragment.m == 0) {
                        fitnessTopicFragment.h.setVisibility(8);
                        fitnessTopicFragment.r.setVisibility(0);
                        fitnessTopicFragment.k.setVisibility(4);
                    }
                    LogUtil.e("Suggestion_FitnessTopicFragment", "getWorkoutsByTopicIdAndRefresh(), load data failed");
                    return;
                }
                LogUtil.j("Suggestion_FitnessTopicFragment", "GetWorkoutsAndRefreshUiCallback onFailure isActivityDestroyed");
                return;
            }
            LogUtil.e("Suggestion_FitnessTopicFragment", "GetWorkoutsAndRefreshUiCallback onFailure fitnessTopicFragment is null.");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Workout> list) {
            if (njy.e(list)) {
                LogUtil.j("Suggestion_FitnessTopicFragment", "GetWorkoutsAndRefreshUiCallback onSuccess fitnessFitWorkouts is null");
                return;
            }
            WeakReference<FitnessTopicFragment> weakReference = this.d;
            if (weakReference == null) {
                LogUtil.e("Suggestion_FitnessTopicFragment", "GetWorkoutsAndRefreshUiCallback onSuccess mWeakReference is null.");
                return;
            }
            FitnessTopicFragment fitnessTopicFragment = weakReference.get();
            if (fitnessTopicFragment != null) {
                if (!fitnessTopicFragment.m()) {
                    fitnessTopicFragment.i = true;
                    FitnessTopicFragment.l(fitnessTopicFragment);
                    fitnessTopicFragment.j();
                    fitnessTopicFragment.r.setVisibility(8);
                    fitnessTopicFragment.h.setVisibility(8);
                    fitnessTopicFragment.k.setVisibility(8);
                    List<FitWorkout> listE = fitnessTopicFragment.e(pea.b(list));
                    if (fitnessTopicFragment.w == 8) {
                        listE = fitnessTopicFragment.a(listE);
                    }
                    fitnessTopicFragment.g.d(fitnessTopicFragment.f9196c, false, listE);
                    return;
                }
                LogUtil.j("Suggestion_FitnessTopicFragment", "GetWorkoutsAndRefreshUiCallback onSuccess isActivityDestroyed");
                return;
            }
            LogUtil.e("Suggestion_FitnessTopicFragment", "GetWorkoutsAndRefreshUiCallback onSuccess fitnessTopicFragment is null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<FitWorkout> a(List<FitWorkout> list) {
        ArrayList arrayList = new ArrayList(2);
        if (!njy.e(list)) {
            for (FitWorkout fitWorkout : list) {
                if (fitWorkout != null) {
                    if ("R001".equals(fitWorkout.acquireId())) {
                        arrayList.add(fitWorkout);
                    } else if ("R002".equals(fitWorkout.acquireId())) {
                        arrayList.add(fitWorkout);
                    }
                }
            }
        }
        return arrayList;
    }

    private void b(int i) {
        b bVar = new b(this);
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_FitnessTopicFragment", "getWorkoutsByType : courseApi is null.");
        } else {
            courseApi.getCourseByType(this.u, i, this.m, bVar);
        }
    }

    static class b extends UiCallback<List<Workout>> {
        private WeakReference<FitnessTopicFragment> e;

        b(FitnessTopicFragment fitnessTopicFragment) {
            this.e = new WeakReference<>(fitnessTopicFragment);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            WeakReference<FitnessTopicFragment> weakReference = this.e;
            if (weakReference == null) {
                LogUtil.e("Suggestion_FitnessTopicFragment", "GetWorkoutsByTypeUiCallback onFailure mWeakReference is null.");
                return;
            }
            FitnessTopicFragment fitnessTopicFragment = weakReference.get();
            if (fitnessTopicFragment != null) {
                if (!fitnessTopicFragment.m()) {
                    fitnessTopicFragment.i = true;
                    LogUtil.e("Suggestion_FitnessTopicFragment", "GetWorkoutsByTypeUiCallback ", str, " ==Failed--errorCode: ", Integer.valueOf(i));
                    fitnessTopicFragment.g.b(false);
                    fitnessTopicFragment.j();
                    if (fitnessTopicFragment.m == 0) {
                        fitnessTopicFragment.h.setVisibility(8);
                        fitnessTopicFragment.r.setVisibility(0);
                        fitnessTopicFragment.k.setVisibility(4);
                    }
                    LogUtil.e("Suggestion_FitnessTopicFragment", "getWorkoutsByWorkoutType, load data failed");
                    return;
                }
                LogUtil.j("Suggestion_FitnessTopicFragment", "GetWorkoutsByTypeUiCallback onFailure isActivityDestroyed");
                return;
            }
            LogUtil.e("Suggestion_FitnessTopicFragment", "GetWorkoutsByTypeUiCallback onFailure fitnessTopicFragment is null.");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Workout> list) {
            if (njy.e(list)) {
                LogUtil.j("Suggestion_FitnessTopicFragment", "GetWorkoutsByTypeUiCallback onSuccess fitnessFitWorkouts is null");
                return;
            }
            WeakReference<FitnessTopicFragment> weakReference = this.e;
            if (weakReference == null) {
                LogUtil.e("Suggestion_FitnessTopicFragment", "GetWorkoutsByTypeUiCallback onSuccess mWeakReference is null.");
                return;
            }
            FitnessTopicFragment fitnessTopicFragment = weakReference.get();
            if (fitnessTopicFragment != null) {
                if (!fitnessTopicFragment.m()) {
                    fitnessTopicFragment.i = true;
                    FitnessTopicFragment.l(fitnessTopicFragment);
                    fitnessTopicFragment.j();
                    fitnessTopicFragment.r.setVisibility(8);
                    fitnessTopicFragment.h.setVisibility(8);
                    fitnessTopicFragment.k.setVisibility(8);
                    fitnessTopicFragment.g.d(fitnessTopicFragment.f9196c, false, fitnessTopicFragment.e(pea.b(list)));
                    return;
                }
                LogUtil.j("Suggestion_FitnessTopicFragment", "GetWorkoutsByTypeUiCallback onSuccess isActivityDestroyed");
                return;
            }
            LogUtil.j("Suggestion_FitnessTopicFragment", "GetWorkoutsByTypeUiCallback onSuccess fitnessTopicFragment is null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<FitWorkout> e(List<FitWorkout> list) {
        ArrayList arrayList = new ArrayList(10);
        if (!njy.e(list)) {
            for (FitWorkout fitWorkout : list) {
                if (!arrayList.contains(fitWorkout)) {
                    arrayList.add(fitWorkout);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        return getActivity() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessTopicFragment.1
                @Override // java.lang.Runnable
                public void run() {
                    FitnessTopicFragment.this.o.setVisibility(0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessTopicFragment.2
                @Override // java.lang.Runnable
                public void run() {
                    FitnessTopicFragment.this.o.setVisibility(8);
                }
            });
        }
    }
}
