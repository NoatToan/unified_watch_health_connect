package com.huawei.health.suggestion.ui.fitness.activity.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.ui.adapter.MyCourseAdapter;
import com.huawei.health.suggestion.ui.adapter.MySingleCourseAdapter;
import com.huawei.health.suggestion.ui.fitness.module.FitnessTopicDeleteModel;
import com.huawei.health.suggestion.ui.run.activity.CustomCourseActivity;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.WorkoutPackageInfo;
import com.huawei.pluginfitnessadvice.audio.SleepAudioSeries;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.scrollview.ScrollViewListener;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import defpackage.btq;
import defpackage.btx;
import defpackage.fxl;
import defpackage.gzc;
import defpackage.hjs;
import defpackage.iei;
import defpackage.ien;
import defpackage.iov;
import defpackage.lmf;
import defpackage.njy;
import defpackage.pea;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessCourseBehaviorFragment extends BaseFragment implements View.OnClickListener {
    private LinearLayout aa;
    private HealthTextView ab;
    private LinearLayout ac;
    private MySingleCourseAdapter ad;
    private HealthSubHeader ag;
    private RelativeLayout ah;
    private HealthRecycleView ai;
    private HealthTextView aj;
    private HealthRecycleView ak;
    private HealthCardView al;
    private RecyclerView.ItemDecoration am;
    private HealthSubHeader an;
    private int ao;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthButton f9164c;
    private AppCompatImageView d;
    private RelativeLayout f;
    private int h;
    private DeleteModeListener k;
    private HealthScrollView l;
    private HealthCardView m;
    private HealthToolBar r;
    private boolean t;
    private View u;
    private MyCourseAdapter v;
    private LinearLayout w;
    private LinearLayout y;
    private HealthTextView z;
    private static final int e = BaseApplication.b().getResources().getDimensionPixelSize(R.dimen.elementsMarginHorizontalM);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f9162b = BaseApplication.b().getResources().getDimensionPixelSize(R.dimen.health_bar_recycler_margin_top);
    private int af = 0;
    private boolean p = true;
    private List<Integer> ae = new ArrayList(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9163a = false;
    private FitnessTopicDeleteModel n = new FitnessTopicDeleteModel();
    private List<Object> ar = new ArrayList(10);
    private List<SleepAudioSeries> j = new ArrayList(10);
    private List<SleepAudioSeries> o = new ArrayList(10);
    private List<SleepAudioSeries> g = new ArrayList(10);
    private boolean q = true;
    private boolean s = false;
    private int i = 0;
    private OnFitnessStatusChangeCallback ap = new OnFitnessStatusChangeCallback() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.4
        @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
        public void onUpdate() {
            LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "mWorkoutStatusChangeCallback is refreshView");
            FitnessCourseBehaviorFragment.this.q = true;
        }
    };
    private MyCourseAdapter.OnItemClickListener x = new MyCourseAdapter.OnItemClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.14
        @Override // com.huawei.health.suggestion.ui.adapter.MyCourseAdapter.OnItemClickListener
        public void onItemClick() {
            FitnessCourseBehaviorFragment.this.ag();
        }
    };
    private HealthToolBar.OnSingleTapListener as = new HealthToolBar.OnSingleTapListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.12
        @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
        public void onSingleTap(int i2) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "click select all");
                FitnessCourseBehaviorFragment.this.m();
                return;
            }
            if (njy.b(FitnessCourseBehaviorFragment.this.ae) || njy.b(FitnessCourseBehaviorFragment.this.o)) {
                FitnessCourseBehaviorFragment.this.an();
            }
        }
    };

    public interface DeleteModeListener {
        void deleteItem(int i);
    }

    private int a(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? 1 : 3;
        }
        return 2;
    }

    private int c(int i2) {
        if (i2 != 5) {
            return i2 != 6 ? 0 : 1;
        }
        return 2;
    }

    static /* synthetic */ int g(FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment) {
        int i2 = fitnessCourseBehaviorFragment.i;
        fitnessCourseBehaviorFragment.i = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        List<Object> listB = this.v.b();
        List<SleepAudioSeries> listB2 = this.ad.b();
        if (njy.e(listB) && njy.e(listB2)) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "selectAllStatus workouts and singleCourseWorkouts is empty");
            return;
        }
        int size = this.ae.size();
        int size2 = this.o.size();
        if (njy.e(listB) && njy.b(listB2)) {
            if (size2 == listB2.size() && this.af == 0) {
                m();
                return;
            } else {
                l();
                return;
            }
        }
        if (njy.b(listB) && njy.e(listB2)) {
            if (size == listB.size() && this.af == 0) {
                m();
                return;
            } else {
                l();
                return;
            }
        }
        if (size + size2 == listB.size() + listB2.size() && this.af == 0) {
            m();
        } else {
            l();
        }
    }

    private void l() {
        this.r.setIconTitleColor(2, getString(com.huawei.health.suggestion.R.string.IDS_contact_delete_select_all), com.huawei.health.suggestion.R.color.textColorPrimary);
        this.r.setIcon(2, com.huawei.health.suggestion.R.drawable.sug_joined_selectall_normal);
        this.af = 0;
        DeleteModeListener deleteModeListener = this.k;
        if (deleteModeListener != null) {
            deleteModeListener.deleteItem(this.ao);
        }
    }

    public static FitnessCourseBehaviorFragment c(int i2, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("type", i2);
        bundle.putInt("category", i3);
        FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment = new FitnessCourseBehaviorFragment();
        fitnessCourseBehaviorFragment.setArguments(bundle);
        return fitnessCourseBehaviorFragment;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.ao = arguments.getInt("type");
            int i2 = arguments.getInt("category", 0);
            this.h = i2;
            LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "onCreate.mType", Integer.valueOf(this.ao), " mCourseCategory:", Integer.valueOf(i2));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(com.huawei.health.suggestion.R.layout.sug_fragment_course_behavior, viewGroup, false);
        e(viewInflate);
        this.s = false;
        btq.e().c(this.ap, "WORKOUT_DELETE");
        btq.e().c(this.ap, "WORKOUT_FINISHED");
        btq.e().c(this.ap, "COLLECTION_ADD");
        btq.e().c(this.ap, "COLLECTION_DELETE");
        btq.e().c(this.ap, "CUSTOM_COURSE_UPDATE");
        return viewInflate;
    }

    public void e(View view) {
        this.u = view.findViewById(com.huawei.health.suggestion.R.id.sug_loading_layout);
        d(view);
        this.f = (RelativeLayout) view.findViewById(com.huawei.health.suggestion.R.id.course_behavior_container);
        a(view);
        this.ai = (HealthRecycleView) view.findViewById(com.huawei.health.suggestion.R.id.recyclerView_topic);
        this.w = (LinearLayout) view.findViewById(com.huawei.health.suggestion.R.id.course_behavior_marketing_layout);
        this.ac = (LinearLayout) view.findViewById(com.huawei.health.suggestion.R.id.sug_layout_net_error);
        this.aa = (LinearLayout) view.findViewById(com.huawei.health.suggestion.R.id.sug_reco_workoutlist_nodata);
        this.ab = (HealthTextView) view.findViewById(com.huawei.health.suggestion.R.id.sug_fitnes_nodata1);
        this.z = (HealthTextView) view.findViewById(com.huawei.health.suggestion.R.id.sug_fitnes_nodata);
        this.f9164c = (HealthButton) view.findViewById(com.huawei.health.suggestion.R.id.btn_no_net_work);
        this.aj = (HealthTextView) view.findViewById(com.huawei.health.suggestion.R.id.tips_no_net_work);
        this.d = (AppCompatImageView) view.findViewById(com.huawei.health.suggestion.R.id.btn_add_course);
        this.ah = (RelativeLayout) view.findViewById(com.huawei.health.suggestion.R.id.reload_layout);
        c(view);
        HealthCardView healthCardView = (HealthCardView) view.findViewById(com.huawei.health.suggestion.R.id.course_behavior_cardview);
        this.m = healthCardView;
        BaseActivity.setViewSafeRegion(true, healthCardView);
        ac();
        aa();
        this.v.d(this.x);
        ien.d(getContext(), this.ai, true, true);
        this.ai.setHasFixedSize(true);
        this.ak.setHasFixedSize(true);
        this.d.setOnClickListener(this);
        this.ai.setAdapter(this.v);
        this.ak.setAdapter(this.ad);
        this.ai.setNestedScrollingEnabled(false);
        this.ak.setNestedScrollingEnabled(false);
        this.ai.setLayoutManager(new FitnessCourseLinearLayoutManager(getContext()));
        ae();
        if (this.ao == 0) {
            fxl.e(getContext(), this.w, w());
        }
        this.f9164c.setOnClickListener(this);
        this.ab.setVisibility(8);
        this.ah.setOnClickListener(this);
        int i2 = this.ao;
        if (i2 == 1) {
            this.z.setText(com.huawei.health.suggestion.R.string.IDS_FitnessAdvice_no_collected_workout);
        } else if (i2 == 0) {
            this.z.setText(ien.b(this.h) ? com.huawei.health.suggestion.R.string.IDS_course_no_used_record : com.huawei.health.suggestion.R.string.IDS_FitnessAdvice_no_downloaded_workout);
        } else {
            this.z.setText(this.h == 258 ? com.huawei.health.suggestion.R.string.IDS_sug_no_custom_course : com.huawei.health.suggestion.R.string.IDS_FitnessAdvice_no_purchased_workout);
        }
    }

    private void aa() {
        MySingleCourseAdapter mySingleCourseAdapter = new MySingleCourseAdapter(this.ak.getContext(), this.j, this.h);
        this.ad = mySingleCourseAdapter;
        mySingleCourseAdapter.a(new MySingleCourseAdapter.OnItemClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.15
            @Override // com.huawei.health.suggestion.ui.adapter.MySingleCourseAdapter.OnItemClickListener
            public void onItemCheckBoxClick(View view, int i2) {
                if (!njy.e(FitnessCourseBehaviorFragment.this.j, i2)) {
                    SleepAudioSeries sleepAudioSeries = (SleepAudioSeries) FitnessCourseBehaviorFragment.this.j.get(i2);
                    LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "onItemCheckBoxClick : name = ", sleepAudioSeries.getName());
                    if (view instanceof HealthCheckBox) {
                        boolean zIsChecked = ((HealthCheckBox) view).isChecked();
                        LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "onItemCheckBoxClick : checked = ", Boolean.valueOf(zIsChecked));
                        if (!zIsChecked) {
                            FitnessCourseBehaviorFragment.this.o.remove(sleepAudioSeries);
                            sleepAudioSeries.setIsSelected(0);
                        } else {
                            sleepAudioSeries.setIsSelected(1);
                            FitnessCourseBehaviorFragment.this.o.add(sleepAudioSeries);
                        }
                    }
                    FitnessCourseBehaviorFragment.this.ag();
                    return;
                }
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "mCollectSingleCourseData position is OutOfBounds");
            }
        });
    }

    private void a(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(com.huawei.health.suggestion.R.id.layout_single_course);
        this.y = linearLayout;
        linearLayout.setVisibility(8);
        this.al = (HealthCardView) view.findViewById(com.huawei.health.suggestion.R.id.course_behavior_cardview_single_course);
        HealthSubHeader healthSubHeader = (HealthSubHeader) view.findViewById(com.huawei.health.suggestion.R.id.sub_header_single_course_title);
        this.an = healthSubHeader;
        healthSubHeader.setRightDrawable(com.huawei.health.suggestion.R.drawable.ic_arrow_up);
        this.an.setMoreText("");
        this.an.setPaddingStartEnd(0.0f, 0.0f);
        this.an.setSubHeaderBackgroundColor(ContextCompat.getColor(BaseApplication.b(), com.huawei.health.suggestion.R.color.transparent));
        this.ak = (HealthRecycleView) view.findViewById(com.huawei.health.suggestion.R.id.recyclerView_single_course);
        HealthSubHeader healthSubHeader2 = (HealthSubHeader) view.findViewById(com.huawei.health.suggestion.R.id.sub_header_series_course_title);
        this.ag = healthSubHeader2;
        healthSubHeader2.setRightDrawable(com.huawei.health.suggestion.R.drawable.ic_arrow_up);
        this.ag.setMoreText("");
        this.ag.setPaddingStartEnd(0.0f, 0.0f);
        ah();
        this.ag.setSubHeaderBackgroundColor(ContextCompat.getColor(BaseApplication.b(), com.huawei.health.suggestion.R.color.transparent));
    }

    private void ah() {
        this.an.setMoreViewClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (FitnessCourseBehaviorFragment.this.al.getVisibility() == 0) {
                    FitnessCourseBehaviorFragment.this.al.setVisibility(8);
                    FitnessCourseBehaviorFragment.this.an.setRightDrawable(com.huawei.health.suggestion.R.drawable.ic_arrow_down);
                } else {
                    FitnessCourseBehaviorFragment.this.al.setVisibility(0);
                    FitnessCourseBehaviorFragment.this.an.setRightDrawable(com.huawei.health.suggestion.R.drawable.ic_arrow_up);
                }
            }
        });
        this.ag.setMoreViewClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.20
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (FitnessCourseBehaviorFragment.this.m.getVisibility() == 0) {
                    FitnessCourseBehaviorFragment.this.m.setVisibility(8);
                    FitnessCourseBehaviorFragment.this.ag.setRightDrawable(com.huawei.health.suggestion.R.drawable.ic_arrow_down);
                } else {
                    FitnessCourseBehaviorFragment.this.m.setVisibility(0);
                    FitnessCourseBehaviorFragment.this.ag.setRightDrawable(com.huawei.health.suggestion.R.drawable.ic_arrow_up);
                }
            }
        });
    }

    private void ae() {
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), qrs.af(BaseApplication.b()) ? 6 : 3) { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.7
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
        this.ak.setLayoutManager(gridLayoutManager);
        RecyclerView.ItemDecoration itemDecoration = new RecyclerView.ItemDecoration() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.19
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                super.getItemOffsets(rect, view, recyclerView, state);
                int spanCount = gridLayoutManager.getSpanCount();
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition < spanCount) {
                    rect.top = FitnessCourseBehaviorFragment.f9162b;
                } else {
                    rect.top = 0;
                }
                rect.bottom = FitnessCourseBehaviorFragment.f9162b;
                int i2 = ((spanCount - 1) * FitnessCourseBehaviorFragment.e) / spanCount;
                int i3 = (childAdapterPosition % spanCount) * (FitnessCourseBehaviorFragment.e - i2);
                rect.left = i3;
                rect.right = i2 - i3;
            }
        };
        this.am = itemDecoration;
        this.ak.addItemDecoration(itemDecoration);
    }

    private void d(View view) {
        HealthScrollView healthScrollView = (HealthScrollView) view.findViewById(com.huawei.health.suggestion.R.id.course_behavior_scroll_view);
        this.l = healthScrollView;
        healthScrollView.setIsForceScrollListener(true);
        this.l.setScrollViewListener(new ScrollViewListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.17
            @Override // com.huawei.ui.commonui.scrollview.ScrollViewListener
            public void onScrollChanged(HealthScrollView healthScrollView2, int i2, int i3, int i4, int i5) {
                if (i3 == healthScrollView2.getChildAt(0).getMeasuredHeight() - healthScrollView2.getMeasuredHeight() && qrs.c(500) && FitnessCourseBehaviorFragment.this.v.a()) {
                    LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "BOTTOM SCROLL");
                    FitnessCourseBehaviorFragment.g(FitnessCourseBehaviorFragment.this);
                    FitnessCourseBehaviorFragment.this.c();
                }
            }
        });
    }

    private void ac() {
        if (qrs.p()) {
            ViewGroup.LayoutParams layoutParams = this.ai.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).bottomMargin = BaseApplication.b().getResources().getDimensionPixelSize(com.huawei.health.suggestion.R.dimen.health_common_12dp);
            }
        }
        MyCourseAdapter myCourseAdapter = new MyCourseAdapter(this.ai);
        this.v = myCourseAdapter;
        myCourseAdapter.d(this.ao);
        this.v.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.3
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i2, int i3) {
                List<Object> listB = FitnessCourseBehaviorFragment.this.v.b();
                if (!njy.e(listB)) {
                    listB.remove(i2);
                }
                if (FitnessCourseBehaviorFragment.this.k != null) {
                    FitnessCourseBehaviorFragment.this.k.deleteItem(FitnessCourseBehaviorFragment.this.ao);
                    FitnessCourseBehaviorFragment.this.n.saveIssDeleteMode(false);
                }
            }
        });
    }

    private int w() {
        return this.h != 137 ? 4051 : 4052;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (this.ao == 2 || ien.b(this.h)) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        HealthRecycleView healthRecycleView = this.ai;
        if (healthRecycleView != null && this.v != null) {
            healthRecycleView.setAdapter(null);
            this.ai.setLayoutManager(null);
            this.ai.setAdapter(this.v);
            ien.d(getContext(), this.ai, true, true);
            this.v.notifyDataSetChanged();
        }
        HealthRecycleView healthRecycleView2 = this.ak;
        if (healthRecycleView2 == null || this.ad == null) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "initViewTahiti, mSingleCourseRecyclerView is null or mMySingleCourseAdapter is null.");
            return;
        }
        healthRecycleView2.setLayoutManager(null);
        RecyclerView.ItemDecoration itemDecoration = this.am;
        if (itemDecoration != null) {
            this.ak.removeItemDecoration(itemDecoration);
            this.am = null;
        }
        ae();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.q) {
            this.i = 0;
            c();
            this.q = false;
        }
        if (this.s && ien.b(this.h)) {
            c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.s = true;
    }

    public void c() {
        String str;
        ak();
        int i2 = this.h;
        if (i2 == 4) {
            str = "";
        } else if (i2 == 5 || i2 == 6 || i2 == 7) {
            z();
            return;
        } else if (i2 == 257) {
            str = "WALKING_COURSE";
        } else if (i2 == 258) {
            str = "RUNNING_COURSE";
        } else {
            str = "FITNESS_COURSE";
        }
        int i3 = this.ao;
        if (i3 == 3) {
            this.v.d(3);
            x();
        } else if (i3 == 1) {
            this.v.b("collect");
            c(2, str);
        } else if (i3 == 2) {
            c(3, str);
        } else {
            this.v.b("downloaded");
            c(1, str);
        }
    }

    private void z() {
        if (ad() == 1) {
            k();
            return;
        }
        final CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "getSleepRelaxCourse : courseApi is null.");
            return;
        }
        final int iA = a(this.ao);
        if (iA == 3) {
            this.y.setVisibility(8);
        } else {
            this.y.setVisibility(0);
        }
        final int iC = c(this.h);
        LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "getSleepOrRelaxCourseCourse : courseCategory = ", Integer.valueOf(iC), " opeType = ", Integer.valueOf(iA));
        ThreadPoolManager.c().execute(new Runnable() { // from class: hic
            @Override // java.lang.Runnable
            public final void run() {
                this.f36760a.c(iA, iC, courseApi);
            }
        });
    }

    public /* synthetic */ void c(int i2, int i3, CourseApi courseApi) {
        courseApi.getAudioBehaviorList(new gzc.b().c(i2).e(2).a(i3).d(50).b(this.i + 1).c(), new b(this, i2));
    }

    static class b extends UiCallback<List<SleepAudioSeries>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<FitnessCourseBehaviorFragment> f9182b;
        private final int e;

        public b(FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment, int i) {
            this.f9182b = new WeakReference<>(fitnessCourseBehaviorFragment);
            this.e = i;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggestion_FitnessCourseBehaviorFragment", "onFailure errorCode =", Integer.valueOf(i), " errorInfo =", str);
            FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment = this.f9182b.get();
            if (fitnessCourseBehaviorFragment != null) {
                fitnessCourseBehaviorFragment.a(false);
                if (fitnessCourseBehaviorFragment.i == 0) {
                    fitnessCourseBehaviorFragment.o();
                    return;
                } else {
                    fitnessCourseBehaviorFragment.u();
                    return;
                }
            }
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "AudioBehaviorDataCalBack onFailure fragment == null");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<SleepAudioSeries> list) {
            LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "onSuccess data = ", list.toString(), " opeType = ", Integer.valueOf(this.e));
            FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment = this.f9182b.get();
            if (fitnessCourseBehaviorFragment != null) {
                fitnessCourseBehaviorFragment.e(list, this.e);
                fitnessCourseBehaviorFragment.u();
            } else {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "AudioBehaviorDataCalBack onSuccess fragment == null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<SleepAudioSeries> list, int i2) {
        if (njy.e(list)) {
            if (this.i == 0) {
                o();
            }
            a(false);
        } else {
            if (i2 == 2 || i2 == 1) {
                d(list);
                af();
                ai();
                d(false, false);
                return;
            }
            LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "opeType is not COLLECTION");
            e(list);
        }
    }

    private void ai() {
        if (njy.b(this.j)) {
            int size = this.j.size();
            LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "collectSingleCourseData is collectSingleCourseData.size = ", Integer.valueOf(size), " collectSingleCourseData = ", this.j.toString());
            this.an.setVisibility(0);
            this.y.setVisibility(0);
            if (this.k != null) {
                this.n.saveIssDeleteMode(this.t);
                this.k.deleteItem(this.ao);
            }
            this.ad.notifyDataSetChanged();
            return;
        }
        LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "collectSingleCourseData is empty");
        this.y.setVisibility(8);
        this.an.setVisibility(8);
    }

    private void af() {
        if (njy.b(this.g)) {
            LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "collectSeriesCourseData is collectSeriesCourseData.size = ", Integer.valueOf(this.g.size()));
            this.ag.setVisibility(0);
            this.m.setVisibility(0);
            e(this.g);
            return;
        }
        LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "collectSeriesCourseData is empty");
        this.ag.setVisibility(8);
        this.m.setVisibility(8);
    }

    private void d(List<SleepAudioSeries> list) {
        if (njy.e(list)) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "getSingleAndSeriesCourseData data is empty");
            return;
        }
        this.f9163a = true;
        if (njy.b(this.g)) {
            this.g.clear();
        }
        if (njy.b(this.j)) {
            this.j.clear();
        }
        LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "getSingleAndSeriesCourseData data = ", list.toString());
        for (int i2 = 0; i2 < list.size(); i2++) {
            SleepAudioSeries sleepAudioSeries = list.get(i2);
            if (sleepAudioSeries == null) {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "courseData is null");
            } else {
                int infoType = sleepAudioSeries.getInfoType();
                if (infoType == 0) {
                    this.j.add(sleepAudioSeries);
                } else if (infoType == 1) {
                    this.g.add(sleepAudioSeries);
                } else {
                    LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "type is not audio and series type = ", Integer.valueOf(infoType));
                }
            }
        }
        LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "getSingleAndSeriesCourseData : collectSingleCourseData = ", this.j, " collectSeriesCourseData = ", this.g);
    }

    private void e(List<SleepAudioSeries> list) {
        if (!isAdded() || njy.e(list)) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "dataCollectionSuccess activity or workouts is invalid.");
            return;
        }
        j();
        a(list.size() >= 50);
        this.p = true;
        this.f9163a = true;
        h(new ArrayList(list));
    }

    private void x() {
        if (ad() == 1) {
            LogUtil.e("Suggestion_FitnessCourseBehaviorFragment", "getDataCustom Network isNetworkAvailable.");
            k();
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.e("Suggestion_FitnessCourseBehaviorFragment", "getDataCustom courseApi is null.");
        } else {
            courseApi.getCoursesBySecondClassifyId(this.i * 50, 50, 0, 1, new d(this));
        }
    }

    static class d extends UiCallback<List<Workout>> {
        WeakReference<FitnessCourseBehaviorFragment> e;

        public d(FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment) {
            this.e = new WeakReference<>(fitnessCourseBehaviorFragment);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            WeakReference<FitnessCourseBehaviorFragment> weakReference = this.e;
            if (weakReference == null) {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "CustomCoursesCallback onFailure mReference is null.");
                return;
            }
            FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment = weakReference.get();
            if (fitnessCourseBehaviorFragment != null) {
                LogUtil.e("Suggestion_FitnessCourseBehaviorFragment", "getDataCustom mType = ", Integer.valueOf(fitnessCourseBehaviorFragment.ao), " failed. ", Integer.valueOf(i), ", ", str);
                fitnessCourseBehaviorFragment.a(false);
                if (fitnessCourseBehaviorFragment.i == 0) {
                    fitnessCourseBehaviorFragment.o();
                    return;
                } else {
                    fitnessCourseBehaviorFragment.u();
                    return;
                }
            }
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "CustomCoursesCallback onFailure fragment is null.");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Workout> list) {
            WeakReference<FitnessCourseBehaviorFragment> weakReference = this.e;
            if (weakReference == null) {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "CustomCoursesCallback onSuccess mReference is null.");
                return;
            }
            FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment = weakReference.get();
            if (fitnessCourseBehaviorFragment == null) {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "CustomCoursesCallback onSuccess fragment is null.");
                return;
            }
            List<FitWorkout> listB = pea.b(list);
            if (njy.e(listB)) {
                fitnessCourseBehaviorFragment.a(false);
                if (fitnessCourseBehaviorFragment.i == 0) {
                    fitnessCourseBehaviorFragment.o();
                    return;
                }
                return;
            }
            Iterator<FitWorkout> it = listB.iterator();
            while (it.hasNext()) {
                it.next().setCourseDefineType(1);
            }
            fitnessCourseBehaviorFragment.c(pea.f(listB));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (getActivity() == null || !isAdded()) {
            LogUtil.e("Suggestion_FitnessCourseBehaviorFragment", "dealWithGetDataFailed0rIsEmpty activity is null or is not added.");
        } else {
            HandlerExecutor.b(new Runnable() { // from class: hib
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36759c.g();
                }
            });
        }
    }

    public /* synthetic */ void g() {
        al();
        u();
        this.p = true;
        this.ac.setVisibility(8);
        d(true, false);
        v();
        this.f9163a = false;
        if (this.k != null) {
            this.n.saveIssDeleteMode(this.t);
            this.k.deleteItem(this.ao);
        } else {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "dealWithGetDataFailed0rIsEmpty mDeleteModeListener is null");
        }
        this.v.a(this.n, true, new ArrayList(0));
    }

    private void al() {
        int iA = a(this.ao);
        if ((iA == 2 || iA == 1) && ien.b(this.h)) {
            this.j.clear();
            this.g.clear();
            MySingleCourseAdapter mySingleCourseAdapter = this.ad;
            if (mySingleCourseAdapter != null) {
                mySingleCourseAdapter.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        u();
        this.aj.setText(com.huawei.health.suggestion.R.string.IDS_network_error);
        this.f9164c.setVisibility(0);
        this.d.setVisibility(8);
        this.p = true;
        this.ac.setVisibility(0);
        d(false, false);
        this.f9163a = false;
        this.v.a(this.n, true, new ArrayList(new ArrayList(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int ad() {
        return !CommonUtil.ab(BaseApplication.b()) ? 1 : 0;
    }

    private void c(int i2, String str) {
        if (ad() == 1) {
            k();
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "getCourseData : courseApi is null.");
        } else {
            courseApi.getUserCourseList(this.i * 50, 50, i2, str, new c(this));
        }
    }

    static class c extends UiCallback<List<Workout>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<FitnessCourseBehaviorFragment> f9183c;

        c(FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment) {
            this.f9183c = new WeakReference<>(fitnessCourseBehaviorFragment);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            WeakReference<FitnessCourseBehaviorFragment> weakReference = this.f9183c;
            if (weakReference == null) {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "CollectionCoursesCallback onFailure mReference is null.");
                return;
            }
            FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment = weakReference.get();
            if (fitnessCourseBehaviorFragment == null) {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "CollectionCoursesCallback onFailure fragment is null.");
                return;
            }
            LogUtil.e("Suggestion_FitnessCourseBehaviorFragment", str, "Failed,errorCode:", Integer.valueOf(i));
            fitnessCourseBehaviorFragment.a(false);
            if (fitnessCourseBehaviorFragment.i == 0) {
                fitnessCourseBehaviorFragment.o();
            } else {
                fitnessCourseBehaviorFragment.u();
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Workout> list) {
            WeakReference<FitnessCourseBehaviorFragment> weakReference = this.f9183c;
            if (weakReference == null) {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "CollectionCoursesCallback onSuccess mReference is null.");
                return;
            }
            FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment = weakReference.get();
            if (fitnessCourseBehaviorFragment != null) {
                if (fitnessCourseBehaviorFragment.ad() == 1) {
                    fitnessCourseBehaviorFragment.k();
                    return;
                } else {
                    if (njy.e(list)) {
                        if (fitnessCourseBehaviorFragment.i == 0) {
                            fitnessCourseBehaviorFragment.o();
                        }
                        fitnessCourseBehaviorFragment.a(false);
                        return;
                    }
                    fitnessCourseBehaviorFragment.c(list);
                    return;
                }
            }
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "CollectionCoursesCallback onSuccess fragment is null.");
        }
    }

    private void h(final List<Object> list) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "refreshDataWhenSuccess activity is null");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.2
                @Override // java.lang.Runnable
                public void run() {
                    FitnessCourseBehaviorFragment.this.u();
                    FitnessCourseBehaviorFragment.this.d(false, true);
                    FitnessCourseBehaviorFragment.this.ac.setVisibility(8);
                    FitnessCourseBehaviorFragment.this.v();
                    if (FitnessCourseBehaviorFragment.this.i == 0) {
                        FitnessCourseBehaviorFragment.this.v.a(FitnessCourseBehaviorFragment.this.n, true, list);
                    } else {
                        FitnessCourseBehaviorFragment.this.v.b(FitnessCourseBehaviorFragment.this.n, true, list);
                    }
                    if (FitnessCourseBehaviorFragment.this.k != null) {
                        FitnessCourseBehaviorFragment.this.n.saveIssDeleteMode(FitnessCourseBehaviorFragment.this.t);
                        FitnessCourseBehaviorFragment.this.k.deleteItem(FitnessCourseBehaviorFragment.this.ao);
                    } else {
                        LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "refreshDataWhenSuccess mDeleteModeListener is null");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<Workout> list) {
        if (!isAdded() || njy.e(list)) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "dataCollectionSuccess activity or workouts is invalid.");
            return;
        }
        j();
        int i2 = this.h;
        if (i2 != 258 && i2 != 257) {
            list = b(list);
        }
        a(list.size() >= 50);
        if (njy.e(list)) {
            if (this.i == 0) {
                o();
                return;
            }
            u();
            this.f9163a = false;
            this.p = true;
            return;
        }
        this.p = true;
        this.f9163a = true;
        h(new ArrayList(list));
    }

    private void j() {
        this.r.setIconVisible(2, 8);
        this.r.setIconVisible(1, 8);
        this.r.setVisibility(8);
        this.ae.clear();
        this.t = false;
        v();
        this.n.saveIssDeleteMode(this.t);
        this.n.saveSelects(this.ae);
    }

    private List<Workout> b(List<Workout> list) {
        ArrayList arrayList = new ArrayList(10);
        for (Workout workout : list) {
            if (workout != null) {
                if (this.h == 4) {
                    arrayList.add(workout);
                } else {
                    FitWorkout fitWorkoutD = pea.d(workout);
                    if (fitWorkoutD != null && fitWorkoutD.getWorkoutType() == 1 && (this.h == 0 || fitWorkoutD.getCategory() == this.h)) {
                        arrayList.add(workout);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.1
                @Override // java.lang.Runnable
                public void run() {
                    FitnessCourseBehaviorFragment.this.v.b(z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.5
                @Override // java.lang.Runnable
                public void run() {
                    FitnessCourseBehaviorFragment.this.u.setVisibility(8);
                }
            });
        }
    }

    private void ak() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.10
                @Override // java.lang.Runnable
                public void run() {
                    FitnessCourseBehaviorFragment.this.ac.setVisibility(8);
                    FitnessCourseBehaviorFragment.this.u.setVisibility(0);
                    FitnessCourseBehaviorFragment.this.v();
                }
            });
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.huawei.health.suggestion.R.id.btn_no_net_work) {
            CommonUtil.t(getContext());
            return;
        }
        if (view.getId() == com.huawei.health.suggestion.R.id.reload_layout) {
            if (this.p) {
                this.p = false;
                c();
                return;
            }
            return;
        }
        if (view.getId() == com.huawei.health.suggestion.R.id.btn_add_course) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                if (this.h == 258) {
                    b(activity);
                    HashMap map = new HashMap(10);
                    map.put("click", 1);
                    lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_SPORT_TAP_ALL_RUNNING_COURSE_1120018.value(), map, 0);
                    return;
                }
                JumpUtil.a(btx.c(), this.h, 3, "FITNESS_COURSE");
            }
            HashMap map2 = new HashMap(10);
            map2.put("click", 1);
            map2.put(BleConstants.SPORT_TYPE, 10001);
            lmf.d().c(BaseApplication.b(), AnalyticsValue.EVENT_CLICK_FITNESS_COURSE_MORE.value(), map2, 0);
            return;
        }
        LogUtil.d("Suggestion_FitnessCourseBehaviorFragment", "else onClick ");
    }

    private void b(FragmentActivity fragmentActivity) {
        if (this.ao == 3) {
            iov.d(btx.c(), new Intent(fragmentActivity, (Class<?>) CustomCourseActivity.class));
        } else {
            JumpUtil.a(btx.c(), this.h, 3, "RUNNING_COURSE");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        int i2 = this.af;
        if (i2 == 1) {
            this.af = 0;
        } else if (i2 == 0) {
            this.af = 1;
        } else {
            LogUtil.d("Suggestion_FitnessCourseBehaviorFragment", "else mSelectType ");
        }
        if (this.af == 1) {
            this.r.setIconTitleColor(2, qre.f(R.string.IDS_contact_delete_uncheck_all), R.color.textColorPrimary);
            this.r.setIcon(2, com.huawei.health.suggestion.R.drawable.sug_joined_selectall_checked);
            for (int i3 = 0; i3 < this.v.b().size(); i3++) {
                if (!this.ae.contains(Integer.valueOf(i3))) {
                    this.ae.add(Integer.valueOf(i3));
                }
            }
        } else {
            this.r.setIconTitleColor(2, qre.f(R.string.IDS_contact_delete_select_all), R.color.textColorPrimary);
            this.r.setIcon(2, com.huawei.health.suggestion.R.drawable.sug_joined_selectall_normal);
            this.ae.clear();
        }
        ab();
        this.n.saveSelects(this.ae);
        DeleteModeListener deleteModeListener = this.k;
        if (deleteModeListener != null) {
            deleteModeListener.deleteItem(this.ao);
            this.n.saveIssDeleteMode(this.t);
        }
        this.v.a(this.n, true);
    }

    private void ab() {
        List<SleepAudioSeries> listB = this.ad.b();
        if (njy.e(listB)) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "handleSingleCourse singleAudioCourse is empty");
            return;
        }
        if (this.af == 1) {
            j(listB);
        } else {
            a(listB);
        }
        this.ad.notifyDataSetChanged();
    }

    private void a(List<SleepAudioSeries> list) {
        if (njy.e(list)) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "clearSingleCourse singleAudioCourse is empty");
            return;
        }
        this.o.clear();
        for (SleepAudioSeries sleepAudioSeries : list) {
            if (sleepAudioSeries != null) {
                sleepAudioSeries.setIsSelected(0);
            }
        }
    }

    private void j(List<SleepAudioSeries> list) {
        if (njy.e(list)) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "selectAllSingleCourse singleAudioCourse is empty");
            return;
        }
        for (SleepAudioSeries sleepAudioSeries : list) {
            if (sleepAudioSeries != null && !this.o.contains(sleepAudioSeries)) {
                this.o.add(sleepAudioSeries);
                sleepAudioSeries.setIsSelected(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(getContext());
        builder.a(getString(com.huawei.health.suggestion.R.string.IDS_hwh_sug_healthdata_deleteing)).a(getString(com.huawei.health.suggestion.R.string.IDS_plugin_fitnessadvice_ok).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FitnessCourseBehaviorFragment.this.r();
            }
        }).d(getString(com.huawei.health.servicesui.R.string.IDS_plugin_fitnessadvice_cancal), new View.OnClickListener() { // from class: hhz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        });
        builder.c().show();
    }

    public /* synthetic */ void b(View view) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("page", Integer.valueOf(this.ao));
        map.put("type", 0);
        map.put("from", Integer.valueOf(iei.b(this.h)));
        lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_FITNESS_MY_COURSE_1130030.value(), map, 0);
        LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "it is negative");
    }

    private void d(Object obj) {
        if (obj instanceof Workout) {
            Workout workout = (Workout) obj;
            FitWorkout fitWorkoutD = pea.d(workout);
            if (fitWorkoutD != null) {
                if (fitWorkoutD.getCourseBelongInfoByType(0) != null) {
                    fitWorkoutD.setCourseBelongType(1);
                } else {
                    fitWorkoutD.setCourseBelongType(0);
                }
                this.ar.add(fitWorkoutD);
                return;
            }
            WorkoutPackageInfo workoutPackageInfoA = pea.a(workout);
            if (workoutPackageInfoA != null) {
                workoutPackageInfoA.setCourseBelongType(2);
                workoutPackageInfoA.saveId(workoutPackageInfoA.getWorkoutPackageId());
                this.ar.add(workoutPackageInfoA);
                return;
            }
            return;
        }
        if (obj instanceof SleepAudioSeries) {
            this.ar.add((SleepAudioSeries) obj);
        } else {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "object unknown type");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        t();
        List<Object> listB = this.v.b();
        if (listB == null) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "showDeleteDialog allWorkout is null");
            return;
        }
        this.ar.clear();
        for (Integer num : this.ae) {
            if (njy.e(listB, num.intValue())) {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "allWorkout isOutOfBounds ");
            } else {
                d(listB.get(num.intValue()));
            }
        }
        int i2 = this.ao;
        if (i2 == 3) {
            s();
        } else if (i2 == 1) {
            q();
        } else {
            p();
        }
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("page", Integer.valueOf(this.ao));
        map.put("type", 2);
        map.put("from", Integer.valueOf(iei.b(this.h)));
        lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_FITNESS_MY_COURSE_1130030.value(), map, 0);
    }

    private void t() {
        LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", " deleteAudioSingleCourse = ", this.o);
        int size = 0;
        if (njy.e(this.o)) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "deleteAudioSingleCourse deleteCollectSleepCourses is empty");
            for (SleepAudioSeries sleepAudioSeries : this.ad.b()) {
                sleepAudioSeries.setIsShowCheckBox(0);
                sleepAudioSeries.setIsSelected(0);
            }
            this.ad.notifyDataSetChanged();
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "deleteAudioSingleCourse : courseApi is null");
            return;
        }
        int i2 = this.ao;
        if (i2 == 0) {
            size = this.o.size();
            b(courseApi, this.o);
        } else if (i2 == 1) {
            Iterator<SleepAudioSeries> it = this.o.iterator();
            while (it.hasNext()) {
                size++;
                e(courseApi, it.next().getId());
            }
        } else {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "delete Audio Single mType= ", Integer.valueOf(i2));
        }
        if (size == this.o.size()) {
            this.o.clear();
        }
    }

    private void b(CourseApi courseApi, List<SleepAudioSeries> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SleepAudioSeries> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getId()));
        }
        courseApi.deletePlayRecord(arrayList, new h(arrayList, this));
    }

    static class h extends UiCallback<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<Integer> f9185a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<FitnessCourseBehaviorFragment> f9186c;

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
        }

        public h(List<Integer> list, FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment) {
            this.f9185a = list;
            this.f9186c = new WeakReference<>(fitnessCourseBehaviorFragment);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            WeakReference<FitnessCourseBehaviorFragment> weakReference = this.f9186c;
            if (weakReference == null) {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "DeleteUsedAudioSingleCourses onSuccess mReference is null.");
                return;
            }
            FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment = weakReference.get();
            if (fitnessCourseBehaviorFragment == null) {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "DeleteUsedAudioSingleCourses onSuccess fragment is null.");
                return;
            }
            Iterator<Integer> it = this.f9185a.iterator();
            while (it.hasNext()) {
                fitnessCourseBehaviorFragment.e(it.next().intValue());
            }
        }
    }

    private void e(CourseApi courseApi, int i2) {
        courseApi.operateFavoriteAudio(i2, 2, new a(i2, this));
    }

    static class a extends UiCallback<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<FitnessCourseBehaviorFragment> f9181a;
        int e;

        public a(int i, FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment) {
            this.e = i;
            this.f9181a = new WeakReference<>(fitnessCourseBehaviorFragment);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "DeleteCollectedAudioSingleCourses onFailure seriesId=", Integer.valueOf(this.e));
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            WeakReference<FitnessCourseBehaviorFragment> weakReference = this.f9181a;
            if (weakReference == null) {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "DeleteCollectedAudioSingleCourses onSuccess mReference is null.");
                return;
            }
            FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment = weakReference.get();
            if (fitnessCourseBehaviorFragment != null) {
                fitnessCourseBehaviorFragment.e(this.e);
            } else {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "DeleteCollectedAudioSingleCourses onSuccess fragment is null.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2) {
        LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "doDeleteAudioSingleCourse seriesId=", Integer.valueOf(i2));
        List<SleepAudioSeries> listB = this.ad.b();
        if (njy.e(listB)) {
            LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "doDeleteAudioSingleCourse audioSeriesList is empty");
            return;
        }
        Iterator<SleepAudioSeries> it = listB.iterator();
        while (it.hasNext()) {
            SleepAudioSeries next = it.next();
            if (next.getId() == i2) {
                it.remove();
            } else {
                next.setIsShowCheckBox(0);
                next.setIsSelected(0);
            }
        }
        this.t = false;
        this.n.saveIssDeleteMode(false);
        this.v.a(this.n, true);
        d(0);
        DeleteModeListener deleteModeListener = this.k;
        if (deleteModeListener != null) {
            deleteModeListener.deleteItem(this.ao);
        }
        this.r.setVisibility(8);
        this.ad.notifyDataSetChanged();
        if (njy.e(listB)) {
            this.j.clear();
            this.an.setVisibility(8);
            this.al.setVisibility(8);
            d(true, false);
        }
    }

    private void s() {
        if (njy.b((Object) this.ar, Workout.class)) {
            for (Workout workout : njy.b((List) this.ar, Workout.class)) {
                if (workout != null) {
                    final String strAcquireId = workout.acquireId();
                    if (TextUtils.isEmpty(strAcquireId)) {
                        LogUtil.e("Suggestion_FitnessCourseBehaviorFragment", "doDeleteCustom workoutId is invalid.");
                        return;
                    }
                    CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
                    if (courseApi == null) {
                        LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "deleteUserDefinedWorkout copy courseApi is null.");
                        return;
                    }
                    courseApi.deleteUserDefinedWorkout(strAcquireId, 1, new UiCallback<String>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.8
                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        public void onFailure(int i2, String str) {
                            LogUtil.e("Suggestion_FitnessCourseBehaviorFragment", "deleteUserDefinedWorkout errCode = ", Integer.valueOf(i2), ", errInfo = ", str);
                            qpx.e(BaseApplication.b(), str);
                        }

                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(String str) {
                            LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "deleteUserDefinedWorkout onSuccess workoutId is ", strAcquireId);
                        }
                    });
                }
            }
            y();
        }
    }

    private void c(CourseApi courseApi, List<Workout> list) {
        courseApi.deleteUserJoinedCourses(list, new i(list, this));
    }

    static class i extends UiCallback<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<FitnessCourseBehaviorFragment> f9187c;
        List<Workout> e;

        public i(List<Workout> list, FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment) {
            this.e = list;
            this.f9187c = new WeakReference<>(fitnessCourseBehaviorFragment);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggestion_FitnessCourseBehaviorFragment", "delete workout error ", str, "--errorcode:", Integer.valueOf(i));
            qpx.b(BaseApplication.b(), str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            WeakReference<FitnessCourseBehaviorFragment> weakReference = this.f9187c;
            if (weakReference == null) {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "DeleteJoinedFitnessCourses onSuccess mReference is null.");
                return;
            }
            FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment = weakReference.get();
            if (fitnessCourseBehaviorFragment != null) {
                fitnessCourseBehaviorFragment.y();
                hjs.b().d(pea.b(this.e));
            } else {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "DeleteJoinedFitnessCourses onSuccess fragment is null.");
            }
        }
    }

    private void e(CourseApi courseApi, List<SleepAudioSeries> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SleepAudioSeries> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getId()));
        }
        courseApi.deletePlayRecord(arrayList, new g(this));
    }

    static class g extends UiCallback<Boolean> {
        WeakReference<FitnessCourseBehaviorFragment> d;

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
        }

        public g(FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment) {
            this.d = new WeakReference<>(fitnessCourseBehaviorFragment);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            WeakReference<FitnessCourseBehaviorFragment> weakReference = this.d;
            if (weakReference == null) {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "DeleteJoinedSleepCourses onSuccess mReference is null.");
                return;
            }
            FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment = weakReference.get();
            if (fitnessCourseBehaviorFragment != null) {
                fitnessCourseBehaviorFragment.y();
            } else {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "DeleteJoinedSleepCourses onSuccess fragment is null.");
            }
        }
    }

    private void p() {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "deleteJoined : courseApi is null.");
            return;
        }
        if (njy.e(this.ar)) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "mToDelWorkouts is null.");
        } else if (njy.b((Object) this.ar, Workout.class)) {
            c(courseApi, njy.b((List) this.ar, Workout.class));
        } else if (njy.b((Object) this.ar, SleepAudioSeries.class)) {
            e(courseApi, njy.b((List) this.ar, SleepAudioSeries.class));
        }
    }

    private void a(CourseApi courseApi, List<Workout> list) {
        for (Workout workout : list) {
            if (workout != null) {
                String strAcquireId = workout.acquireId();
                if (workout instanceof WorkoutPackageInfo) {
                    WorkoutPackageInfo workoutPackageInfo = (WorkoutPackageInfo) workout;
                    LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "delete series course:", workoutPackageInfo.getWorkoutPackageId(), " ", Integer.valueOf(workout.getCourseBelongType()));
                    courseApi.uncollectCourse(workoutPackageInfo.getWorkoutPackageId(), workout.getCourseBelongType());
                } else {
                    LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "delete course:", strAcquireId);
                    courseApi.uncollectCourse(strAcquireId);
                }
                y();
            }
        }
    }

    private void d(CourseApi courseApi, List<SleepAudioSeries> list) {
        Iterator<SleepAudioSeries> it = list.iterator();
        while (it.hasNext()) {
            courseApi.operateFavoriteAudio(it.next().getId(), 2, new e(this));
        }
    }

    static class e extends UiCallback<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<FitnessCourseBehaviorFragment> f9184a;

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
        }

        public e(FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment) {
            this.f9184a = new WeakReference<>(fitnessCourseBehaviorFragment);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            WeakReference<FitnessCourseBehaviorFragment> weakReference = this.f9184a;
            if (weakReference == null) {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "DeleteCollectedSleepCourse onSuccess mReference is null.");
                return;
            }
            FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment = weakReference.get();
            if (fitnessCourseBehaviorFragment != null) {
                fitnessCourseBehaviorFragment.y();
            } else {
                LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "DeleteCollectedSleepCourse onSuccess fragment is null.");
            }
        }
    }

    private void q() {
        if (this.ar == null) {
            LogUtil.e("Suggestion_FitnessCourseBehaviorFragment", "mToDelWorkouts is null");
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "deleteCollect : courseApi is null.");
        } else if (njy.b((Object) this.ar, Workout.class)) {
            a(courseApi, njy.b((List) this.ar, Workout.class));
        } else if (njy.b((Object) this.ar, SleepAudioSeries.class)) {
            d(courseApi, njy.b((List) this.ar, SleepAudioSeries.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "mDeleteModel.acquireSelects().size():", Integer.valueOf(this.n.acquireSelects().size()));
        if (this.n.acquireSelects().size() > 0) {
            HandlerExecutor.c(new Runnable() { // from class: hia
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36758a.n();
                }
            }, 20L);
        } else {
            this.r.setIconVisible(2, 8);
            this.r.setIconVisible(1, 8);
            v();
            this.r.setVisibility(8);
        }
        this.t = false;
        this.n.saveIssDeleteMode(false);
        this.v.a(this.n, true);
        d(0);
        btq.e().e("WORKOUT_DELETE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Collections.sort(this.ae, new Comparator<Integer>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.6
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(Integer num, Integer num2) {
                return num2.intValue() - num.intValue();
            }
        });
        Iterator<Integer> it = this.ae.iterator();
        while (it.hasNext()) {
            this.v.notifyItemRemoved(it.next().intValue());
        }
        this.ae.clear();
        if (this.af == 1) {
            m();
        }
        this.f9163a = true;
        this.t = false;
        v();
        this.n.saveSelects(this.ae);
        this.r.setVisibility(8);
        this.n.saveIssDeleteMode(false);
        if (this.v.b() != null && this.v.b().size() == 0) {
            if ((a(this.ao) == 2 || a(this.ao) == 1) && ien.b(this.h)) {
                this.g.clear();
                this.ag.setVisibility(8);
                this.m.setVisibility(8);
            }
            d(true, false);
            this.ac.setVisibility(8);
            this.f9163a = false;
        }
        this.k.deleteItem(this.ao);
        this.v.a(this.n, true);
        this.ai.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z, boolean z2) {
        int iA = a(this.ao);
        LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "isNoRecordOrContainerLayoutShow :", "opeType = ", Integer.valueOf(iA), " mCourseCategory = ", Integer.valueOf(this.h));
        if ((iA != 2 && iA != 1) || !ien.b(this.h)) {
            LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "opeType is not collection is show = ", Boolean.valueOf(z));
            if (z) {
                this.aa.setVisibility(0);
            } else {
                this.aa.setVisibility(8);
            }
            if (z2) {
                this.f.setVisibility(0);
                return;
            } else {
                this.f.setVisibility(8);
                return;
            }
        }
        LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "isNoRecordLayoutShow :", "collectSingleCourseData.size() = ", Integer.valueOf(this.j.size()), "; collectSeriesCourseData.size() = ", Integer.valueOf(this.g.size()));
        if (njy.e(this.j) && njy.e(this.g)) {
            this.aa.setVisibility(0);
            this.f.setVisibility(8);
        } else {
            this.aa.setVisibility(8);
            this.f.setVisibility(0);
        }
        if (ad() == 1) {
            this.aa.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        hjs.b().e();
        btq.e().d(this.ap, "WORKOUT_DELETE");
        btq.e().d(this.ap, "WORKOUT_FINISHED");
        btq.e().d(this.ap, "COLLECTION_ADD");
        btq.e().d(this.ap, "COLLECTION_DELETE");
        btq.e().d(this.ap, "CUSTOM_COURSE_UPDATE");
        this.ap = null;
        super.onDestroy();
    }

    private void c(View view) {
        HealthToolBar healthToolBar = (HealthToolBar) view.findViewById(com.huawei.health.suggestion.R.id.select_view);
        this.r = healthToolBar;
        healthToolBar.d(View.inflate(getContext(), R.layout.hw_toolbar_bottomview, null));
        healthToolBar.setIcon(1, com.huawei.health.suggestion.R.drawable.ic_public_delete);
        healthToolBar.setIconTitle(1, qre.f(R.string.IDS_music_management_delete));
        healthToolBar.setIcon(2, com.huawei.health.suggestion.R.drawable.sug_joined_selectall_normal);
        healthToolBar.setIconTitle(2, qre.f(R.string.IDS_contact_delete_select_all));
        healthToolBar.setOnSingleTapListener(this.as);
        healthToolBar.setVisibility(8);
        healthToolBar.a(getActivity());
    }

    public void e(boolean z) {
        LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "setDeleteModeListener ", Boolean.valueOf(z));
        b(z);
        this.t = z;
        if (this.ao == 2 || ien.b(this.h)) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(this.t ? 8 : 0);
        }
        this.r.setVisibility(this.t ? 0 : 8);
        if (this.t) {
            this.r.setIconEnabled(1, true);
            this.r.setIconEnabled(2, true);
            this.r.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.13
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    if (FitnessCourseBehaviorFragment.this.r.getHeight() > 0) {
                        FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment = FitnessCourseBehaviorFragment.this;
                        fitnessCourseBehaviorFragment.d(fitnessCourseBehaviorFragment.r.getHeight());
                    }
                    FitnessCourseBehaviorFragment.this.r.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            });
        } else {
            d(0);
        }
        this.n.saveSelects(this.ae);
        this.n.saveIssDeleteMode(this.t);
        this.v.a(this.n, true);
    }

    private void b(boolean z) {
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            SleepAudioSeries sleepAudioSeries = this.j.get(i2);
            if (sleepAudioSeries != null) {
                sleepAudioSeries.setIsShowCheckBox(z ? 1 : 0);
            }
        }
        this.ad.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i2) {
        if (this.r == null) {
            LogUtil.j("Suggestion_FitnessCourseBehaviorFragment", "setRecyclerMarginBottom, mHealthToolbar is null.");
        } else if (this.l.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
            marginLayoutParams.bottomMargin = i2;
            this.l.setLayoutParams(marginLayoutParams);
            this.ai.requestLayout();
        }
    }

    public void a(DeleteModeListener deleteModeListener) {
        this.k = deleteModeListener;
    }

    public boolean i() {
        return this.f9163a;
    }

    public boolean h() {
        int size = this.g.size() + this.j.size();
        LogUtil.a("Suggestion_FitnessCourseBehaviorFragment", "hasRecordForSleepOrDecompress courseDataSize = ", Integer.valueOf(size));
        return size > 0;
    }

    public int d() {
        return this.ao;
    }

    public int a() {
        return this.o.size() + this.ae.size();
    }

    public boolean f() {
        return this.t;
    }

    static class FitnessCourseLinearLayoutManager extends HealthLinearLayoutManager {
        FitnessCourseLinearLayoutManager(Context context) {
            super(context);
        }

        @Override // com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e) {
                LogUtil.e("Suggestion_FitnessCourseBehaviorFragment", LogAnonymous.b(e));
            }
        }
    }
}
