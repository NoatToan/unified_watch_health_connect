package com.huawei.health.suggestion.ui.fitness.activity.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.model.WorkoutListBean;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.sport.view.FitnessCardView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseStateActivity;
import com.huawei.health.suggestion.ui.callback.UiPagingCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.pricetagbean.PriceTagBean;
import com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.btt;
import defpackage.btx;
import defpackage.buh;
import defpackage.gzx;
import defpackage.hjg;
import defpackage.hjs;
import defpackage.hkj;
import defpackage.iec;
import defpackage.ien;
import defpackage.ies;
import defpackage.ifp;
import defpackage.njy;
import defpackage.pcd;
import defpackage.pea;
import defpackage.ped;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes31.dex */
public class RecommendListFragment extends Fragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f9214a;
    private int ab;
    private HealthRecycleView ac;
    private int ad;
    private HealthCheckBox ag;
    private Integer[] ah;
    private float aj;
    private Integer[] al;
    private Integer[] an;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LoadMoreRecyclerViewAdapter f9215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<String> f9216c;
    private BaseStateActivity e;
    private View f;
    private LinearLayout g;
    private Context i;
    private Integer[] k;
    private int l;
    private ImageView m;
    private Integer[] n;
    private View o;
    private HealthTextView p;
    private boolean q;
    private int s;
    private boolean t;
    private Integer u;
    private View v;
    private LinearLayoutManager w;
    private Integer[] y;
    private int z;
    private int x = -1;
    private int af = 1;
    private List<Integer> ae = new ArrayList(10);
    private List<FitWorkout> ai = new ArrayList(10);
    private boolean r = false;
    private ArrayList<String> j = new ArrayList<>(10);
    private ArrayList<String> h = new ArrayList<>(10);
    private HashMap<Integer, SparseBooleanArray> aa = new HashMap<>();
    private SparseBooleanArray d = new SparseBooleanArray();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        s();
        this.i = getActivity();
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseStateActivity) {
            this.e = (BaseStateActivity) activity;
        }
        View viewB = b(layoutInflater, viewGroup);
        u();
        if (this.s != 1) {
            this.l = 0;
            this.ab = 0;
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.1
                @Override // java.lang.Runnable
                public void run() {
                    RecommendListFragment.this.q();
                }
            });
            return viewB;
        }
        this.p.setText(R.string.sug_join_no_record);
        return viewB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public void q() {
        long j;
        String strE = buh.e(l());
        if (StringUtils.j(strE)) {
            String[] strArrSplit = strE.split("_");
            if (strArrSplit.length > 1) {
                try {
                    j = Long.parseLong(strArrSplit[1]);
                } catch (NumberFormatException unused) {
                    LogUtil.e("Suggestion_RecoListFm", "all fitness course number format exception");
                    j = 0;
                }
            } else {
                j = 0;
            }
        } else {
            j = 0;
        }
        if (j == 0 || System.currentTimeMillis() - j > 600000) {
            this.r = true;
            c();
            return;
        }
        final List listC = ies.c(strE, FitWorkout[].class);
        BaseStateActivity baseStateActivity = this.e;
        if (baseStateActivity != null) {
            baseStateActivity.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.8
                @Override // java.lang.Runnable
                public void run() {
                    RecommendListFragment.this.e((List<FitWorkout>) listC);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String l() {
        return "allFitnessCourses" + LanguageUtil.a() + this.z;
    }

    private void s() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.s = arguments.getInt("type");
            this.z = arguments.getInt("index");
            this.t = arguments.getBoolean("isAddCourse", false);
            try {
                this.f9216c = arguments.getStringArrayList("addCourseId");
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.e("Suggestion_RecoListFm", "get addCourseId list fail");
            }
            b();
        }
    }

    private View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sug_trainevent_recofm, viewGroup, false);
        this.f = viewInflate.findViewById(R.id.sug_content);
        this.v = viewInflate.findViewById(R.id.no_record_layout);
        View viewFindViewById = viewInflate.findViewById(R.id.sug_tv_jonied_deleMode);
        this.o = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        HealthCheckBox healthCheckBox = (HealthCheckBox) viewInflate.findViewById(R.id.sug_tv_jonied_all);
        this.ag = healthCheckBox;
        healthCheckBox.setOnClickListener(this);
        this.g = (LinearLayout) viewInflate.findViewById(R.id.plan_confirm_add_course);
        this.f9214a = (HealthButton) viewInflate.findViewById(R.id.plan_confirm_add_course_btn);
        if (this.t) {
            this.g.setVisibility(0);
        }
        this.f9214a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putStringArrayListExtra("courseIdList", RecommendListFragment.this.j);
                intent.putStringArrayListExtra("courseNameList", RecommendListFragment.this.h);
                RecommendListFragment.this.getActivity().setResult(-1, intent);
                RecommendListFragment.this.getActivity().finish();
            }
        });
        this.ac = (HealthRecycleView) viewInflate.findViewById(R.id.sug_train_rcv_events);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.ac.setItemAnimator(defaultItemAnimator);
        HealthLinearLayoutManager healthLinearLayoutManager = new HealthLinearLayoutManager(this.i, 1, false);
        this.w = healthLinearLayoutManager;
        ien.a(this.i, this.ac, healthLinearLayoutManager);
        this.p = (HealthTextView) viewInflate.findViewById(R.id.sug_fitnes_nodata);
        this.m = (ImageView) viewInflate.findViewById(R.id.iv_sug_fitness_no_data);
        hkj.d(a(), this.ag);
        this.aj = hjg.a();
        r();
        this.ac.setAdapter(this.f9215b);
        y();
        this.f9215b.setOnMoreListener(new LoadMoreRecyclerViewAdapter.OnMoreListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.14
            @Override // com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter.OnMoreListener
            public void onLoadingMore() {
                RecommendListFragment.this.p();
            }
        });
        return viewInflate;
    }

    private void r() {
        this.f9215b = new LoadMoreRecyclerViewAdapter<FitWorkout>(new ArrayList(), this.ac, R.layout.sug_fitness_list_item) { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.13
            @Override // com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void convert(RecyclerHolder recyclerHolder, int i, FitWorkout fitWorkout) {
                LogUtil.a("Suggestion_RecoListFm", "convert, holder.itemView.getWidth() = ", Integer.valueOf(recyclerHolder.itemView.getWidth()));
                if (!Utils.o()) {
                    HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.tv_fe_name);
                    healthTextView.setMaxLines(1);
                    healthTextView.setSingleLine(true);
                    healthTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
                SpannableString spannableStringC = gzx.c(BaseApplication.getContext(), "\\d+.\\d+|\\d+", gzx.d(com.huawei.health.basefitnessadvice.R.plurals.sug_fitness_personjoin, fitWorkout.acquireUsers(), UnitUtil.e(fitWorkout.acquireUsers(), 1, 0)), com.huawei.health.basefitnessadvice.R.style.sug_reco_train_num, com.huawei.health.basefitnessadvice.R.style.sug_reco_train_desc);
                float fB = ped.b(fitWorkout.acquireCalorie() * RecommendListFragment.this.aj);
                recyclerHolder.a(R.id.tv_plan_peoples_num, spannableStringC).a(R.id.tv_fe_name, StringUtils.c((Object) fitWorkout.acquireName())).a(R.id.tv_level, iec.c(fitWorkout.acquireDifficulty())).a(R.id.tv_parameter_num, String.format(Locale.ROOT, RecommendListFragment.this.getString(com.huawei.health.basefitnessadvice.R.string.sug_fitness_min), ped.m(fitWorkout.acquireDuration()))).a(R.id.tv_Kcal, gzx.d(R.plurals.sug_chart_kcals, (int) fB, ped.f(fB)));
                if (fitWorkout.isLongExplainVideoCourse()) {
                    RecommendListFragment.this.d(recyclerHolder);
                } else {
                    recyclerHolder.d(R.id.tv_level).setVisibility(0);
                    recyclerHolder.d(R.id.tv_Kcal).setVisibility(0);
                    RecommendListFragment recommendListFragment = RecommendListFragment.this;
                    recommendListFragment.e(recyclerHolder, recommendListFragment.getResources().getDimensionPixelSize(R.dimen.hw_group_16));
                }
                HealthCheckBox healthCheckBox = (HealthCheckBox) recyclerHolder.d(R.id.plan_add_course_checkbox);
                healthCheckBox.setChecked(RecommendListFragment.this.d.get(i, false));
                healthCheckBox.setClickable(false);
                RecommendListFragment.this.a(recyclerHolder, healthCheckBox, i, fitWorkout, getItemViewType(i));
                RecommendListFragment.this.b(recyclerHolder, fitWorkout, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(RecyclerHolder recyclerHolder) {
        if (recyclerHolder == null) {
            LogUtil.j("Suggestion_RecoListFm", "setLongExplainVideoCourse holder is null.");
            return;
        }
        recyclerHolder.d(R.id.tv_level).setVisibility(8);
        recyclerHolder.d(R.id.tv_Kcal).setVisibility(8);
        e(recyclerHolder, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(RecyclerHolder recyclerHolder, int i) {
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.tv_parameter_num);
        if (healthTextView.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) healthTextView.getLayoutParams();
            layoutParams.setMarginStart(i);
            layoutParams.baselineToBaseline = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RecyclerHolder recyclerHolder, final HealthCheckBox healthCheckBox, final int i, final FitWorkout fitWorkout, int i2) {
        FitnessCardView fitnessCardView = (FitnessCardView) recyclerHolder.d(R.id.recycle_item);
        if (this.t) {
            healthCheckBox.setVisibility(0);
            fitnessCardView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    RecommendListFragment.this.c(i, fitWorkout, healthCheckBox);
                }
            });
        }
        ImageView imageView = (ImageView) recyclerHolder.d(R.id.sug_img_item_pic);
        String str = imageView.getTag() instanceof String ? (String) imageView.getTag() : null;
        if (TextUtils.isEmpty(str) || !str.equals(fitWorkout.acquirePicture())) {
            imageView.setTag(fitWorkout.acquirePicture());
            recyclerHolder.d(R.id.sug_img_item_pic, fitWorkout.acquirePicture(), qqf.d);
        }
        if (i2 != 1 || recyclerHolder.d(R.id.sug_view_space) == null) {
            return;
        }
        if (i == 0) {
            recyclerHolder.d(R.id.sug_view_space).setVisibility(0);
        } else if (qrs.af(this.i) && i == 1) {
            recyclerHolder.d(R.id.sug_view_space).setVisibility(0);
        } else {
            recyclerHolder.d(R.id.sug_view_space).setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(RecyclerHolder recyclerHolder, FitWorkout fitWorkout, int i) {
        ViewGroup.LayoutParams layoutParams = recyclerHolder.itemView.findViewById(R.id.new_imageView).getLayoutParams();
        layoutParams.height = -2;
        b(recyclerHolder, fitWorkout);
        List<PriceTagBean> listAcquirePriceTagBeanList = fitWorkout.acquirePriceTagBeanList();
        if (fitWorkout.getCornerImgDisplay() == 1) {
            String strE = pea.e(listAcquirePriceTagBeanList);
            if (!TextUtils.isEmpty(strE)) {
                layoutParams.height = (int) getContext().getResources().getDimension(R.dimen.health_common_21dp);
                recyclerHolder.e(R.id.new_imageView, 0);
                qqf.d(strE, (HealthImageView) recyclerHolder.itemView.findViewById(R.id.new_imageView), 0.0f, qqf.d, 0.0f, 0.0f);
            }
        }
        recyclerHolder.itemView.findViewById(R.id.new_imageView).setLayoutParams(layoutParams);
        if (Utils.j()) {
            recyclerHolder.e(R.id.tv_plan_peoples_num, 0);
        } else {
            recyclerHolder.e(R.id.tv_plan_peoples_num, 8);
        }
        if (qrs.ac()) {
            recyclerHolder.e(R.id.tv_plan_peoples_num, 8);
        }
        if (this.s == 1) {
            c(recyclerHolder, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, FitWorkout fitWorkout, HealthCheckBox healthCheckBox) {
        if (healthCheckBox.isChecked()) {
            if (this.j.contains(fitWorkout.acquireId())) {
                this.j.remove(fitWorkout.acquireId());
                this.h.remove(fitWorkout.acquireName());
            }
            healthCheckBox.setChecked(false);
            this.d.put(i, false);
            LogUtil.a("Suggestion_RecoListFm", "set workout ", fitWorkout.acquireId(), " pos ", Integer.valueOf(i), "  false");
            return;
        }
        if (!this.j.contains(fitWorkout.acquireId())) {
            ArrayList<String> arrayList = this.f9216c;
            if (arrayList != null && arrayList.contains(fitWorkout.acquireId())) {
                qpx.e(getContext(), R.string.IDS_plan_has_add_course);
                return;
            } else {
                this.j.add(fitWorkout.acquireId());
                this.h.add(fitWorkout.acquireName());
            }
        }
        healthCheckBox.setChecked(true);
        this.d.put(i, true);
        LogUtil.a("Suggestion_RecoListFm", "set workout ", fitWorkout.acquireId(), " pos ", Integer.valueOf(i), "  true");
    }

    private void b(RecyclerHolder recyclerHolder, FitWorkout fitWorkout) {
        if (LanguageUtil.o(BaseApplication.getContext()) || LanguageUtil.q(BaseApplication.getContext())) {
            ien.a(fitWorkout, (ImageView) recyclerHolder.d(R.id.new_imageView));
        } else {
            recyclerHolder.e(R.id.new_imageView, 8);
        }
    }

    private void y() {
        this.f9215b.setOnItemClickListener(new LoadMoreRecyclerViewAdapter.OnItemClickListener<FitWorkout>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.12
            @Override // com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter.OnItemClickListener
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onItemClicked(RecyclerHolder recyclerHolder, int i, FitWorkout fitWorkout) {
                if (!RecommendListFragment.this.q) {
                    pcd pcdVar = new pcd(fitWorkout.acquireId());
                    pcdVar.a("AllTraining");
                    pea.a(btx.c(), fitWorkout, pcdVar);
                    return;
                }
                recyclerHolder.d(R.id.sug_rv_checkbox).performClick();
            }
        });
    }

    private void u() {
        this.f9215b.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.15
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                super.onChanged();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2) {
                super.onItemRangeChanged(i, i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2, Object obj) {
                super.onItemRangeChanged(i, i2, obj);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i, int i2) {
                super.onItemRangeInserted(i, i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i, int i2) {
                RecommendListFragment.this.f9215b.remove(i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeMoved(int i, int i2, int i3) {
                super.onItemRangeMoved(i, i2, i3);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.a("Suggestion_RecoListFm", "onConfigurationChanged, FitnessCommonUtil.setRecyclerViewLayout");
        ien.a(this.i, this.ac, this.w);
    }

    private void c(RecyclerHolder recyclerHolder, int i) {
        if (this.q) {
            hkj.d(this.ae, recyclerHolder, i);
        } else {
            recyclerHolder.e(R.id.sug_rv_checkbox, 8);
        }
        recyclerHolder.d(R.id.sug_rv_checkbox).setTag(Integer.valueOf(i));
        recyclerHolder.e(R.id.sug_rv_checkbox, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        LogUtil.a("Suggestion_RecoListFm", "up to loadMore currpage:", Integer.valueOf(this.l), "mPageFlag:", Integer.valueOf(this.ab), "--->dataSize: ", Integer.valueOf(this.f9215b.size()));
        int i = this.l;
        if (i <= 0 || this.ab + 1 != i) {
            return;
        }
        this.ab = i;
        c();
    }

    public void c() {
        if (this.f9215b == null) {
            return;
        }
        int i = this.s;
        if (i == 1) {
            k();
        } else if (i == 2) {
            t();
        } else {
            o();
        }
    }

    private void o() {
        n();
    }

    private void t() {
        LogUtil.a("Suggestion_RecoListFm", "Suggestion_RecoListFm", "----getRecommendWorks()--");
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_RecoListFm", "getRecommendWorks : courseApi is null.");
        } else {
            courseApi.getRecommendCourses("FITNESS_COURSE", new WorkoutListBean(this.l * 10, 10, this.x, this.al, this.an, this.n, this.k, 0), new UiPagingCallback<List<Workout>>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.20
                @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
                public void onFailureFirst(int i, String str) {
                    LogUtil.j("Suggestion_RecoListFm", str, "==Failed--errorcode:", Integer.valueOf(i));
                    RecommendListFragment.this.m();
                }

                @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccessFirst(List<Workout> list) {
                    final List<FitWorkout> listB = ien.b(pea.b(list), "FITNESS_COURSE");
                    int iE = ifp.e((Object) buh.e("total"));
                    if (njy.b(listB) && RecommendListFragment.this.s == 2 && iE > 0) {
                        ArrayList<FitWorkout> arrayListE = hjs.b().c(listB).e(listB);
                        RecommendListFragment.this.ad = iE;
                        listB = gzx.b(arrayListE, RecommendListFragment.this.l * 10, 10, RecommendListFragment.this.ad);
                    }
                    if (RecommendListFragment.this.e != null) {
                        RecommendListFragment.this.e.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.20.1
                            @Override // java.lang.Runnable
                            public void run() {
                                RecommendListFragment.this.e((List<FitWorkout>) listB);
                            }
                        });
                    }
                }
            });
        }
    }

    private void n() {
        this.v.setVisibility(8);
        LogUtil.a("Suggestion_RecoListFm", "Suggestion_RecoListFm", "----getRecommendAllWorks()--");
        WorkoutListBean workoutListBean = new WorkoutListBean();
        d(workoutListBean);
        workoutListBean.setWorkoutType(new Integer[]{1});
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_RecoListFm", "getRecommendFilterWorks : courseApi is null.");
            return;
        }
        Integer primaryClassifyId = workoutListBean.getPrimaryClassifyId();
        this.u = primaryClassifyId;
        courseApi.d(workoutListBean, c(primaryClassifyId));
    }

    private UiPagingCallback<List<Workout>> c(final Integer num) {
        return new UiPagingCallback<List<Workout>>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccessFirst(List<Workout> list) {
                final List<FitWorkout> listB = pea.b(list);
                int iE = ifp.e((Object) buh.e("total"));
                if (njy.b(listB) && RecommendListFragment.this.s == 2 && iE > 0) {
                    ArrayList<FitWorkout> arrayListE = hjs.b().c(listB).e(listB);
                    RecommendListFragment.this.ad = iE;
                    listB = gzx.b(arrayListE, RecommendListFragment.this.l * 10, 10, RecommendListFragment.this.ad);
                }
                if (RecommendListFragment.this.r) {
                    RecommendListFragment.this.r = false;
                    if (njy.b(listB)) {
                        buh.d(RecommendListFragment.this.l(), ies.c(listB) + "_" + System.currentTimeMillis());
                    }
                }
                LogUtil.a("Suggestion_RecoListFm", "getCallback, value is ", num, ", mHistoryPrimaryIndex is ", RecommendListFragment.this.u);
                Integer num2 = num;
                if (num2 == null || num2.equals(RecommendListFragment.this.u)) {
                    if (RecommendListFragment.this.e != null) {
                        RecommendListFragment.this.e.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.2.5
                            @Override // java.lang.Runnable
                            public void run() {
                                RecommendListFragment.this.e((List<FitWorkout>) listB);
                            }
                        });
                        return;
                    }
                    return;
                }
                LogUtil.j("Suggestion_RecoListFm", "getCallback, value is not mHistoryPrimaryIndex");
            }

            @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
            public void onFailureFirst(int i, String str) {
                LogUtil.j("Suggestion_RecoListFm", str, "==Failed-- errorcode:", Integer.valueOf(i));
                RecommendListFragment.this.m();
            }
        };
    }

    private void d(WorkoutListBean workoutListBean) {
        workoutListBean.setPageStart(this.l * 10);
        workoutListBean.setPageSize(10);
        workoutListBean.setSupportWear(this.x);
        int i = this.z;
        if (i != 0) {
            workoutListBean.setPrimaryClassifyId(Integer.valueOf(i));
        }
        Integer[] numArr = this.y;
        if (numArr != null && numArr.length > 0) {
            workoutListBean.setDifficulty(numArr);
        }
        Integer[] numArr2 = this.ah;
        if (numArr2 != null && numArr2.length > 0) {
            workoutListBean.setSecondClassifyList(numArr2);
        }
        Integer[] numArr3 = this.an;
        if (numArr3 != null && numArr3.length > 0) {
            workoutListBean.setTrainingPoints(numArr3);
        }
        Integer[] numArr4 = this.k;
        if (numArr4 != null && numArr4.length > 0) {
            workoutListBean.setEquipments(numArr4);
        }
        workoutListBean.setWorkoutRank(Integer.valueOf(this.af));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<FitWorkout> list) {
        if (this.l == 0) {
            this.f9215b.clear();
        }
        if (njy.b(list)) {
            LogUtil.a("Suggestion_RecoListFm", "getData Size: ", Integer.valueOf(list.size()));
            d(list);
        } else {
            this.f9215b.noMoreLoad();
            this.ag.setEnabled(true);
        }
        v();
        f();
    }

    private void f() {
        BaseStateActivity baseStateActivity = this.e;
        if (baseStateActivity != null) {
            if (((Boolean) baseStateActivity.mLoadingView.getTag()).booleanValue()) {
                this.e.finishLoading();
            } else {
                this.e.mLoadingView.setTag(true);
            }
        }
    }

    private void k() {
        LogUtil.a("Suggestion_RecoListFm", "Suggestion_RecoListFm", "----getJoinedWorks()--");
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_RecoListFm", "getJoinedWorks : courseApi is null.");
        } else {
            courseApi.getJoinedCourses(new WorkoutListBean(0, Integer.MAX_VALUE, this.al, this.n, this.an, this.x, this.k, false), new AnonymousClass3());
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment$3, reason: invalid class name */
    class AnonymousClass3 extends UiPagingCallback<List<Workout>> {
        AnonymousClass3() {
        }

        @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
        public void onFailureFirst(int i, String str) {
            LogUtil.j("Suggestion_RecoListFm", str, "==Failed--errorcode:", Integer.valueOf(i));
            RecommendListFragment.this.m();
        }

        @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccessFirst(List<Workout> list) {
            final List<FitWorkout> listB = ien.b(pea.b(list), "FITNESS_COURSE");
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.3.1
                @Override // java.lang.Runnable
                public void run() {
                    final List<FitWorkout> listA = hjs.b().a(hjs.b().c(listB).e(listB));
                    if (RecommendListFragment.this.e != null) {
                        RecommendListFragment.this.e.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.3.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                RecommendListFragment.this.e((List<FitWorkout>) listA);
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.l == 0) {
            this.f9215b.clear();
        }
        f();
        if (this.f9215b.size() == 0) {
            this.f.setVisibility(8);
            w();
        } else {
            this.f9215b.loadError();
        }
    }

    private void w() {
        this.v.setVisibility(0);
        this.p.setText(R.string.IDS_plugin_achievement_network_error_msg_content_2);
        if (LanguageUtil.ba(this.i)) {
            this.m.setImageDrawable(qqz.e(this.i, R.drawable.ic_recommend_list_no_network));
        } else {
            this.m.setImageResource(R.drawable.ic_recommend_list_no_network);
        }
    }

    private void aa() {
        this.v.setVisibility(0);
        this.p.setText(R.string.IDS_hwh_sug_fitness_recom_nodata);
        if (LanguageUtil.ba(this.i)) {
            this.m.setImageDrawable(qqz.e(this.i, R.drawable.ic_collect_course));
        } else {
            this.m.setImageResource(R.drawable.ic_collect_course);
        }
    }

    private void d(List<FitWorkout> list) {
        this.l++;
        if (this.s == 1 || b(list)) {
            this.f9215b.noMoreLoad(list);
            this.ag.setEnabled(true);
        } else {
            this.f9215b.enableMoreLoad(list);
            this.ag.setEnabled(true);
        }
    }

    private boolean b(List<FitWorkout> list) {
        return this.s == 2 && list.size() >= this.ad;
    }

    private void v() {
        if (this.f9215b.size() <= 0) {
            this.f.setVisibility(8);
            aa();
            this.ae.clear();
            this.q = false;
            return;
        }
        this.f.setVisibility(0);
        this.v.setVisibility(8);
        hkj.d(a(), this.ag);
    }

    private void b() {
        if (this.t) {
            if (this.aa.get(Integer.valueOf(this.z)) == null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                this.aa.put(Integer.valueOf(this.z), sparseBooleanArray);
                this.d = sparseBooleanArray;
                return;
            }
            this.d = this.aa.get(Integer.valueOf(this.z));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.sug_tv_jonied_deleMode) {
            h();
        } else if (R.id.sug_rv_checkbox == view.getId()) {
            b(view);
        } else if (R.id.sug_tv_jonied_all == view.getId()) {
            g();
        }
    }

    private void g() {
        if (this.ag.isChecked()) {
            d();
        } else {
            this.ag.setText(com.huawei.ui.commonui.R.string.IDS_contact_delete_select_all);
            this.ae.clear();
        }
        this.f9215b.notifyDataSetChanged();
    }

    private void d() {
        this.ag.setText(com.huawei.ui.commonui.R.string.IDS_contact_delete_uncheck_all);
        if (this.f9215b.isCanLoadMore()) {
            hkj.c(this.ae, this.w.findLastVisibleItemPosition() + 1);
        } else {
            hkj.c(this.ae, this.f9215b.size());
        }
    }

    private void b(View view) {
        if (view.getTag() instanceof Integer) {
            Integer num = (Integer) view.getTag();
            if (view instanceof HealthCheckBox) {
                if (((HealthCheckBox) view).isChecked()) {
                    this.ae.add(num);
                } else if (this.ae.contains(num)) {
                    this.ae.remove(num);
                }
            }
        }
    }

    private void h() {
        if (this.ae.isEmpty()) {
            boolean z = this.q;
            this.q = !z;
            if (!z) {
                this.ag.setVisibility(0);
            } else {
                this.ag.setVisibility(8);
            }
            this.f9215b.notifyDataSetChanged();
            return;
        }
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.ag.setChecked(false);
        this.ag.setText(com.huawei.ui.commonui.R.string.IDS_contact_delete_select_all);
        if (this.ae.size() > 0) {
            this.ag.postDelayed(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.5
                @Override // java.lang.Runnable
                public void run() {
                    RecommendListFragment.this.i();
                }
            }, 20L);
        } else {
            this.ag.setVisibility(8);
        }
        this.q = false;
        this.f9215b.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Collections.sort(this.ae, new Comparator<Integer>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(Integer num, Integer num2) {
                return num2.intValue() - num.intValue();
            }
        });
        Iterator<Integer> it = this.ae.iterator();
        while (it.hasNext()) {
            this.f9215b.notifyItemRemoved(it.next().intValue());
        }
        this.ae.clear();
        this.ag.setVisibility(8);
        if (e()) {
            if (this.ag.getParent().getParent() instanceof View) {
                ((View) this.ag.getParent().getParent()).setVisibility(8);
            }
            this.f.setVisibility(8);
            aa();
        }
    }

    private boolean e() {
        return this.f9215b.size() == 0 && !this.f9215b.isCanLoadMore();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && gzx.e(this.f9215b)) {
            hkj.d(a(), this.ag);
        }
    }

    private boolean a() {
        return this.s == 1 && gzx.e(this.f9215b) && this.f9215b.size() > 0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.s == 1) {
            this.l = 0;
            this.ab = 0;
            this.ac.scrollToPosition(0);
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.10
                @Override // java.lang.Runnable
                public void run() {
                    RecommendListFragment.this.c();
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.s == 1) {
            hjs.b().e();
        }
    }

    private void x() {
        LogUtil.d("Suggestion_RecoListFm", "showDeleteDialog ", "enter");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(getContext());
        builder.a(getString(R.string.IDS_hwh_sug_healthdata_deleteing)).a(getString(R.string.IDS_plugin_fitnessadvice_ok).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("Suggestion_RecoListFm", "it is positive");
                RecommendListFragment.this.ai.clear();
                Iterator it = RecommendListFragment.this.ae.iterator();
                while (it.hasNext()) {
                    Object obj = RecommendListFragment.this.f9215b.get(((Integer) it.next()).intValue());
                    if (obj instanceof FitWorkout) {
                        RecommendListFragment.this.ai.add((FitWorkout) obj);
                    }
                }
                LogUtil.a("Suggestion_RecoListFm", "delete fitworkout size:", Integer.valueOf(RecommendListFragment.this.ae.size()));
                CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
                if (courseApi != null) {
                    courseApi.deleteUserJoinedCourses(pea.f(RecommendListFragment.this.ai), new UiPagingCallback<String>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.6.2
                        @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
                        public void onFailureFirst(int i, String str) {
                            LogUtil.e("Suggestion_RecoListFm", "delete workout error ", str, "--errorcode:", Integer.valueOf(i));
                            Toast.makeText(RecommendListFragment.this.getContext(), str, 1).show();
                        }

                        @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
                        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                        public void onSuccessFirst(String str) {
                            RecommendListFragment.this.j();
                            hjs.b().d(RecommendListFragment.this.ai);
                        }
                    });
                } else {
                    LogUtil.j("Suggestion_RecoListFm", "showDeleteDialog : courseApi is null.");
                }
            }
        }).d(getString(com.huawei.health.servicesui.R.string.IDS_plugin_fitnessadvice_cancal), new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.RecommendListFragment.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("Suggestion_RecoListFm", "it is negative");
            }
        });
        builder.c().show();
    }
}
