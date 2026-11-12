package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter;
import com.huawei.health.suggestion.ui.fitness.helper.RecyclerHolder;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.ui.fitness.mvp.CourseDetailProvider;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.WorkoutAction;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hnc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RecyclerHolder f36950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f36951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseRecyclerViewAdapter<Motion> f36952c;
    private LinearLayout d;
    private LinearLayout e;
    private CourseDetailProvider f;
    private List<Motion> g;
    private hmt h;
    private Context i;
    private LinearLayout j;
    private View k;
    private LinearLayout l;
    private View m;
    private HealthRecycleView n;
    private HealthTextView o;
    private LinearLayout q;
    private RecyclerHolder s;

    public hnc(Context context, CourseDetailProvider courseDetailProvider) {
        context = context == null ? BaseApplication.b() : context;
        this.i = context;
        this.f = courseDetailProvider;
        this.m = LayoutInflater.from(context).inflate(R.layout.sug_fitness_activity_detail_action, (ViewGroup) null);
        f();
    }

    public void b(hmt hmtVar) {
        this.h = hmtVar;
    }

    private void f() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.m.findViewById(R.id.recv_train_detail);
        this.n = healthRecycleView;
        healthRecycleView.setNestedScrollingEnabled(false);
        BaseActivity.setViewSafeRegion(false, this.n);
        this.l = (LinearLayout) this.m.findViewById(R.id.sug_run_workout_warm_up);
        this.f36951b = (LinearLayout) this.m.findViewById(R.id.sug_run_workout_adjustment);
        this.s = new RecyclerHolder(this.l);
        LinearLayout linearLayout = (LinearLayout) this.m.findViewById(R.id.layout_warm_up);
        this.q = linearLayout;
        BaseActivity.setViewSafeRegion(false, this.l, this.f36951b, linearLayout);
        this.d = (LinearLayout) this.m.findViewById(R.id.layout_action_list);
        this.j = (LinearLayout) this.m.findViewById(R.id.layout_cooldown);
        this.f36950a = new RecyclerHolder(this.f36951b);
        BaseActivity.setViewSafeRegion(false, this.m.findViewById(R.id.sug_run_workout_take_exercise_text), this.m.findViewById(R.id.sug_run_workout_adjustment_text));
        this.n.setLayoutManager(new LinearLayoutManager(this.i));
        this.k = this.m.findViewById(R.id.sug_actions_pay_lock);
        this.o = (HealthTextView) this.m.findViewById(R.id.sug_actions_pay_lock_hint);
        this.e = (LinearLayout) this.m.findViewById(R.id.sug_actions_detail_layout);
    }

    public View d() {
        return this.m;
    }

    public void e() {
        if (this.f.isRunModelCourse()) {
            a();
        } else {
            c();
            j();
        }
        this.n.setAdapter(this.f36952c);
        this.f36952c.notifyDataSetChanged();
    }

    private void j() {
        this.f36952c.setOnItemClickListener(new BaseRecyclerViewAdapter.OnItemClickListener() { // from class: hmy
            @Override // com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter.OnItemClickListener
            public final void onItemClicked(RecyclerHolder recyclerHolder, int i, Object obj) {
                this.e.b(recyclerHolder, i, obj);
            }
        });
    }

    /* synthetic */ void b(RecyclerHolder recyclerHolder, int i, Object obj) {
        BaseRecyclerViewAdapter<Motion> baseRecyclerViewAdapter = this.f36952c;
        if (baseRecyclerViewAdapter == null || baseRecyclerViewAdapter.get(i) == null) {
            BaseRecyclerViewAdapter<Motion> baseRecyclerViewAdapter2 = this.f36952c;
            ReleaseLogUtil.e("Suggestion_CourseActionViewHolder", "action onclick failed with adapter = ", baseRecyclerViewAdapter2, " mAdapter.get(position) = ", baseRecyclerViewAdapter2.get(i));
            return;
        }
        iei.a(this.f36952c.get(i));
        if (this.f36952c.get(i).getDescription() == null || this.f.isRunModelCourse()) {
            ReleaseLogUtil.e("Suggestion_CourseActionViewHolder", "mAdapter.setOnItemClickListener1: null==mAdapter.get(position).getDescription() = false");
            return;
        }
        hmt hmtVar = this.h;
        if (hmtVar != null) {
            hmtVar.b(i, this.g);
        }
    }

    private void a() {
        this.f36952c = new BaseRecyclerViewAdapter<Motion>(new ArrayList(), R.layout.sug_run_rec_train_detail) { // from class: hnc.4
            @Override // com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void convert(RecyclerHolder recyclerHolder, int i, Motion motion) {
                if (recyclerHolder == null || motion == null) {
                    ReleaseLogUtil.e("Suggestion_CourseActionViewHolder", "holder or itemData is null");
                } else {
                    hnc.e(recyclerHolder, motion.acquireName(), iek.a(hnc.this.i, motion.acquireGroups(), motion.acquireMeasurementValue(), motion.acquireMeasurementType()), gzx.d(R.plurals.IDS_plugin_fitnessadvice_second_nogap, motion.acquireGap(), UnitUtil.e(motion.acquireGap(), 1, 0)), !(i == getItemCount() - 1 || getItemCount() <= 1));
                }
            }
        };
    }

    private void c() {
        this.f36952c = new BaseRecyclerViewAdapter<Motion>(new ArrayList(), R.layout.sug_fitness_rec_train_detail) { // from class: hnc.3
            @Override // com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void convert(RecyclerHolder recyclerHolder, int i, Motion motion) {
                String strC;
                if (LanguageUtil.ba(hnc.this.i) && !LanguageUtil.br(hnc.this.i)) {
                    strC = gzx.c(hnc.this.i, R.string.sug_fitness_grop_sec_rtl, UnitUtil.e(Math.round(motion.acquireDuration() / 1000.0f), 1, 0), UnitUtil.e(motion.acquireGroups(), 1, 0));
                } else {
                    strC = gzx.c(hnc.this.i, R.string.sug_fitness_grop_sec, UnitUtil.e(motion.acquireGroups(), 1, 0), UnitUtil.e(Math.round(motion.acquireDuration() / 1000.0f), 1, 0));
                }
                recyclerHolder.c(R.id.sug_fitness_iv_train_pic, motion.acquirePicUrl(), hnc.this.i.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultCornerRadiusS)).b(R.id.tv_train_title_adv, motion.acquireName()).b(R.id.tv_train_n_adv, strC);
                if (qrs.ac()) {
                    recyclerHolder.e(R.id.sug_fitness_rec_gap).setVisibility(8);
                    recyclerHolder.e(R.id.sug_fitness_iv_rest).setVisibility(8);
                    recyclerHolder.e(R.id.three_fold_fonts_view).setVisibility(0);
                    recyclerHolder.b(R.id.sug_fitness_rec_gap_three, gzx.d(R.plurals.IDS_plugin_fitnessadvice_second_nogap, motion.acquireGap(), UnitUtil.e(motion.acquireGap(), 1, 0)));
                } else {
                    recyclerHolder.b(R.id.sug_fitness_rec_gap, gzx.d(R.plurals.IDS_plugin_fitnessadvice_second_nogap, motion.acquireGap(), UnitUtil.e(motion.acquireGap(), 1, 0)));
                }
                if (i == getItemCount() - 1) {
                    recyclerHolder.e(R.id.tv_train_seg_adv, 8);
                }
            }
        };
    }

    public void e(FitWorkout fitWorkout) {
        if (fitWorkout == null) {
            ReleaseLogUtil.e("Suggestion_CourseActionViewHolder", "bindRunWorkoutAction with null workout");
            return;
        }
        if (this.f.isFreeCourse()) {
            b();
        }
        if (!fitWorkout.isRunModelCourse()) {
            LogUtil.a("Suggestion_CourseActionViewHolder", "mIsRunWorkout()==false");
            c(8, 8);
        } else {
            c(gzx.e(fitWorkout.acquireWarmUpRunAction()) ? 0 : 8, gzx.e(fitWorkout.acquireCoolDownRunAction()) ? 0 : 8);
            c(this.s, fitWorkout.acquireWarmUpRunAction());
            c(this.f36950a, fitWorkout.acquireCoolDownRunAction());
        }
    }

    public void d(List<Motion> list) {
        this.g = list;
        BaseRecyclerViewAdapter<Motion> baseRecyclerViewAdapter = this.f36952c;
        if (baseRecyclerViewAdapter != null) {
            baseRecyclerViewAdapter.refreshDataChange(list);
        }
    }

    public void e(String str) {
        View view = this.k;
        if (view != null) {
            view.setVisibility(0);
        }
        HealthTextView healthTextView = this.o;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
        LinearLayout linearLayout = this.e;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public void b() {
        LinearLayout linearLayout = this.e;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        View view = this.k;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void c(RecyclerHolder recyclerHolder, WorkoutAction workoutAction) {
        ReleaseLogUtil.d("Suggestion_CourseActionViewHolder", "showAction() enter");
        if (gzx.e(workoutAction)) {
            AtomicAction action = workoutAction.getAction();
            if (action == null) {
                LogUtil.j("Suggestion_CourseActionViewHolder", "bindRunAction action is null.");
                return;
            }
            String name = action.getName();
            int group = workoutAction.getGroup();
            int iAcquireMeasurementValue = workoutAction.acquireMeasurementValue();
            if (workoutAction.acquireMeasurementType() == 1) {
                iAcquireMeasurementValue = workoutAction.acquireMeasurementValue() * 1000;
            }
            int iAcquireMeasurementType = workoutAction.acquireMeasurementType();
            LogUtil.a("Suggestion_CourseActionViewHolder", "groups:", Integer.valueOf(group), "measurementValue:", Integer.valueOf(iAcquireMeasurementValue), "measurementType", Integer.valueOf(iAcquireMeasurementType));
            e(recyclerHolder, name, iek.a(this.m.getContext(), group, iAcquireMeasurementValue, iAcquireMeasurementType), gzx.d(R.plurals.IDS_plugin_fitnessadvice_second_nogap, workoutAction.getGap(), UnitUtil.e(workoutAction.getGap(), 1, 0)), false);
        }
    }

    private void c(int i, int i2) {
        this.l.setVisibility(i);
        this.q.setVisibility(i);
        this.j.setVisibility(i2);
        this.f36951b.setVisibility(i2);
        this.d.setVisibility((i2 == 0 || i == 0) ? 0 : 8);
    }

    public static void e(RecyclerHolder recyclerHolder, String str, String str2, String str3, boolean z) {
        if (qrs.ac()) {
            recyclerHolder.e(R.id.tv_train_title_adv, 8).e(R.id.tv_train_n_adv, 8).e(R.id.sug_fitness_rec_gap, 8).e(R.id.sug_fitness_iv_rest, 8).e(R.id.sug_run_three, 0);
            recyclerHolder.b(R.id.tv_train_title_adv, str).b(R.id.tv_train_n_adv_three, str2).b(R.id.sug_fitness_rec_gap_three, str3);
        } else {
            recyclerHolder.b(R.id.tv_train_title_adv, str).b(R.id.tv_train_n_adv, str2).b(R.id.sug_fitness_rec_gap, str3);
        }
        if (z) {
            recyclerHolder.e(R.id.tv_train_seg_adv, 0);
        } else {
            recyclerHolder.e(R.id.tv_train_seg_adv, 8);
        }
    }

    public void c(int i) {
        View view = this.m;
        if (view != null) {
            view.setVisibility(i);
        }
    }
}
