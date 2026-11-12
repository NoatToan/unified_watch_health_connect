package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.model.fitness.FitnessAchieveInfoUseCase;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessActionLibraryActivity;
import com.huawei.health.suggestion.ui.fitness.activity.SportAllCourseActivity;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessAchieveHeadViewHolder;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.idy;
import defpackage.qqf;
import health.compact.a.UnitUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessAchieveHeadViewHolder extends AbsFitnessViewHolder<FitnessAchieveInfoUseCase> implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HealthTextView f9456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImageView f9457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConstraintLayout f9458c;
    private final HealthTextView d;
    private final HealthButton e;
    private final HealthTextView g;
    private final HealthTextView h;
    private final HealthButton i;
    private final HealthTextView j;

    public static /* synthetic */ void a(int i, Object obj) {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void init(FitnessAchieveInfoUseCase fitnessAchieveInfoUseCase) {
        e();
        c();
        c(fitnessAchieveInfoUseCase);
        a();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("Suggestion_FitnessAchieveHeadViewHolder", "view is null");
            return;
        }
        if (isFastClick()) {
            LogUtil.j("Suggestion_FitnessAchieveHeadViewHolder", "FitnessAchieveHeadViewHolder is fast click");
            return;
        }
        if (!(this.itemView.getParent() instanceof RecyclerView)) {
            LogUtil.j("Suggestion_FitnessAchieveHeadViewHolder", "onClick not on RecyclerView");
            return;
        }
        int id = view.getId();
        if (id == R.id.tv_fitness_course_lib) {
            h();
            return;
        }
        if (id == R.id.cl_fitness_enter_area) {
            if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
                LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: hnf
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        FitnessAchieveHeadViewHolder.a(i, obj);
                    }
                }, AnalyticsValue.HEALTH_HOME_GPS_HISTORY_2010015.value());
                return;
            } else {
                d();
                return;
            }
        }
        if (id != R.id.tv_fitness_action_lib) {
            LogUtil.j("Suggestion_FitnessAchieveHeadViewHolder", "onClick nothing happen");
        } else {
            b();
        }
    }

    public void c(FitnessAchieveInfoUseCase fitnessAchieveInfoUseCase) {
        b(fitnessAchieveInfoUseCase);
        a(fitnessAchieveInfoUseCase);
    }

    private void a(FitnessAchieveInfoUseCase fitnessAchieveInfoUseCase) {
        if (fitnessAchieveInfoUseCase == null) {
            c(0L, 0, 0, 0);
            LogUtil.j("Suggestion_FitnessAchieveHeadViewHolder", "setDataAndRefresh fitnessAchieveInfoUseCase null");
        } else {
            c(fitnessAchieveInfoUseCase.getSumExerciseTime(), fitnessAchieveInfoUseCase.getTodayTime(), fitnessAchieveInfoUseCase.getSumDays(), fitnessAchieveInfoUseCase.getExerciseCount());
        }
    }

    private void a() {
        this.i.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.f9458c.setOnClickListener(this);
    }

    private void c() {
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "font/hw-digit-bold.otf");
        this.j.setTypeface(Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf"));
        this.g.setTypeface(typefaceCreateFromAsset);
        this.f9456a.setTypeface(typefaceCreateFromAsset);
        this.h.setTypeface(typefaceCreateFromAsset);
    }

    private void b(FitnessAchieveInfoUseCase fitnessAchieveInfoUseCase) {
        if (fitnessAchieveInfoUseCase == null) {
            a(0);
            LogUtil.j("Suggestion_FitnessAchieveHeadViewHolder", "setDataAndRefresh fitnessAchieveInfoUseCase null");
        } else {
            a(fitnessAchieveInfoUseCase.getSumDays());
        }
    }

    private void b() {
        HashMap map = new HashMap(1);
        map.put("click", 1);
        idy.b(AnalyticsValue.HEALTH_FITNESS_ACTION_LIBRARY_1130027.value(), map);
        Intent intent = new Intent(this.itemView.getContext(), (Class<?>) FitnessActionLibraryActivity.class);
        intent.setFlags(268435456);
        this.itemView.getContext().startActivity(intent);
    }

    private void d() {
        FitnessSessionManager.SessionActivityAction sessionActivityActionD = FitnessSessionManager.b().d();
        if (sessionActivityActionD == null) {
            LogUtil.j("Suggestion_FitnessAchieveHeadViewHolder", "FitnessSessionManager getSessionForActivityAction null");
        } else {
            sessionActivityActionD.startSportHistoryActivity(this.itemView.getContext());
        }
    }

    private void h() {
        HashMap map = new HashMap(2);
        map.put("entrance", this.itemView.getContext().getString(R.string.IDS_FitnessAdvice_all_courses));
        map.put("position", 3);
        idy.b("1130015", map);
        Intent intent = new Intent(this.itemView.getContext(), (Class<?>) SportAllCourseActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("SKIP_ALL_COURSE_KEY", "FITNESS_COURSE");
        this.itemView.getContext().startActivity(intent);
    }

    private void e() {
        qqf.a(this.f9457b, isTahiti(this.itemView.getContext()) ? R.drawable.pic_fitness_tahiti : R.drawable.pic_fitness, qqf.d, 0, 0);
    }

    private void c(long j, int i, int i2, int i3) {
        this.j.setText(UnitUtil.e(j, 1, 0));
        this.g.setText(UnitUtil.e(i, 1, 0));
        this.f9456a.setText(UnitUtil.e(i2, 1, 0));
        this.h.setText(UnitUtil.e(i3, 1, 0));
    }

    private void a(int i) {
        this.d.setText(this.itemView.getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_user_profile_achieve_day, i));
    }
}
