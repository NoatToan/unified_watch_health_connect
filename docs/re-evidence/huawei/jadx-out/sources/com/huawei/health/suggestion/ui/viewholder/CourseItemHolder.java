package com.huawei.health.suggestion.ui.viewholder;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.module.FitnessTopicDeleteModel;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.WorkoutPackageInfo;
import com.huawei.pluginfitnessadvice.audio.SleepAudioPackage;
import com.huawei.pluginfitnessadvice.audio.SleepAudioSeries;
import com.huawei.pluginfitnessadvice.h5pro.SeriesCourseH5Repository;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.btx;
import defpackage.ddv;
import defpackage.gzx;
import defpackage.haa;
import defpackage.hjs;
import defpackage.iec;
import defpackage.njy;
import defpackage.pcd;
import defpackage.pea;
import defpackage.ped;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class CourseItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f10208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f10209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ClickItemCount f10210c;
    private HealthDivider d;
    private HealthTextView e;
    private HealthCheckBox f;
    private HealthTextView g;
    private HealthTextView h;
    private FitnessTopicDeleteModel i;
    private final HealthTextView j;
    private LinearLayout k;
    private RelativeLayout l;
    private int m;
    private final ImageView n;
    private RelativeLayout o;
    private View r;

    public interface ClickItemCount {
        void onClickCheckBoxItem();
    }

    private int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 2;
        }
        return 3;
    }

    public CourseItemHolder(View view) {
        super(view);
        this.m = 0;
        this.o = (RelativeLayout) view.findViewById(R.id.recycle_item);
        this.h = (HealthTextView) view.findViewById(R.id.course_title);
        this.k = (LinearLayout) view.findViewById(R.id.layout_trained_difficulty_duration);
        this.g = (HealthTextView) view.findViewById(R.id.course_trained);
        this.f10208a = (HealthTextView) view.findViewById(R.id.course_difficulty);
        this.e = (HealthTextView) view.findViewById(R.id.course_duration);
        this.f10209b = (ImageView) view.findViewById(R.id.recycle_item_picture);
        this.d = (HealthDivider) view.findViewById(R.id.course_item_divider);
        this.l = (RelativeLayout) view.findViewById(R.id.sug_course_checkable);
        this.f = (HealthCheckBox) view.findViewById(R.id.sug_course_checkbox);
        this.r = view.findViewById(R.id.sug_course_view_space);
        this.j = (HealthTextView) view.findViewById(R.id.course_tag);
        this.n = (ImageView) view.findViewById(R.id.series_course_shadow);
    }

    public void e(int i) {
        this.d.setVisibility(i);
    }

    public void a(int i) {
        View view = this.r;
        if (view == null) {
            return;
        }
        view.setVisibility(i);
    }

    public void d(FitnessTopicDeleteModel fitnessTopicDeleteModel, String str, boolean z, Object obj) {
        if (!(obj instanceof Workout)) {
            LogUtil.j("SportCourseItemViewHolder", "setDataAndRefresh workout == null");
            return;
        }
        final Workout workout = (Workout) obj;
        if (z && fitnessTopicDeleteModel != null) {
            this.i = fitnessTopicDeleteModel;
            a();
        }
        e(workout);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.viewholder.CourseItemHolder.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.c(500)) {
                    if (CourseItemHolder.this.i != null && CourseItemHolder.this.i.issDeleteMode()) {
                        CourseItemHolder.this.f.performClick();
                        return;
                    }
                    FitWorkout fitWorkoutD = pea.d(workout);
                    WorkoutPackageInfo workoutPackageInfoA = pea.a(workout);
                    if (fitWorkoutD != null) {
                        CourseItemHolder.this.b(fitWorkoutD);
                        return;
                    }
                    if (workoutPackageInfoA != null) {
                        int enableNewUrl = workoutPackageInfoA.getEnableNewUrl();
                        LogUtil.a("SportCourseItemViewHolder", "workoutPackageInfo isEnableNewUrl ", Integer.valueOf(enableNewUrl));
                        if (enableNewUrl != 1) {
                            CourseItemHolder.this.e(workoutPackageInfoA.getWorkoutPackageId());
                            return;
                        } else {
                            JumpUtil.a(BaseApplication.getContext(), workoutPackageInfoA.getWorkoutPackageId(), 1);
                            return;
                        }
                    }
                    LogUtil.j("SportCourseItemViewHolder", "setDataAndRefresh workout is null");
                    return;
                }
                LogUtil.j("SportCourseItemViewHolder", "itemView click too fast.");
            }
        });
    }

    public void b(FitnessTopicDeleteModel fitnessTopicDeleteModel, Object obj) {
        if (!(obj instanceof SleepAudioSeries)) {
            LogUtil.j("SportCourseItemViewHolder", "setSleepCourse audio is null");
            return;
        }
        final SleepAudioSeries sleepAudioSeries = (SleepAudioSeries) obj;
        if (fitnessTopicDeleteModel != null) {
            this.i = fitnessTopicDeleteModel;
            a();
        }
        c(sleepAudioSeries);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.viewholder.CourseItemHolder.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.c(500)) {
                    if (CourseItemHolder.this.i != null && CourseItemHolder.this.i.issDeleteMode()) {
                        CourseItemHolder.this.f.performClick();
                        return;
                    }
                    int enableNewUrl = sleepAudioSeries.getEnableNewUrl();
                    LogUtil.a("SportCourseItemViewHolder", "itemView isEnableNewUrl ", Integer.valueOf(enableNewUrl));
                    if (enableNewUrl != 1) {
                        CourseItemHolder.this.d(sleepAudioSeries);
                        return;
                    } else {
                        JumpUtil.a(BaseApplication.getContext(), Integer.toString(sleepAudioSeries.getId()), 2);
                        return;
                    }
                }
                LogUtil.j("SportCourseItemViewHolder", "itemView click too fast.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(SleepAudioSeries sleepAudioSeries) {
        Intent intent = new Intent();
        intent.setClassName(this.itemView.getContext(), "com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity");
        intent.addFlags(268435456);
        intent.putExtra("id", Integer.toString(sleepAudioSeries.getId()));
        intent.putExtra("from", d(this.m));
        this.itemView.getContext().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(FitWorkout fitWorkout) {
        pcd pcdVar = new pcd(fitWorkout.acquireId());
        pcdVar.s(fitWorkout.acquireId());
        pcdVar.a(b());
        if (fitWorkout.getCourseDefineType() == 1) {
            pcdVar.i(1);
        }
        pea.a(this.itemView.getContext(), fitWorkout, pcdVar);
    }

    private String b() {
        int i = this.m;
        if (i == 0) {
            return "2";
        }
        if (i == 1) {
            return "1";
        }
        if (i == 2) {
            return "3";
        }
        if (i == 3) {
            return "4";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        ddv.b().initH5Pro();
        H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("tradeApi", ddv.b().getCommonJsModule("tradeApi")).addCustomizeJsModule("mediaCenter", ddv.b().getCommonJsModule("mediaCenter")).enableOnPauseCallback().setImmerse().showStatusBar().setStatusBarTextBlack(true).addCustomizeArg("workoutPackageId", str).setForceDarkMode(0).build();
        SeriesCourseH5Repository.registerService();
        H5ProClient.startH5MiniProgram(BaseApplication.getContext(), "com.huawei.health.h5.course", h5ProLaunchOptionBuild);
    }

    private void e(Workout workout) {
        if (workout == null) {
            LogUtil.j("SportCourseItemViewHolder", "showCourseWorkout workout is null");
            return;
        }
        FitWorkout fitWorkoutD = pea.d(workout);
        if (fitWorkoutD != null) {
            c(fitWorkoutD);
        } else {
            c(pea.a(workout));
        }
    }

    private void c() {
        this.g.setMaxWidth(Integer.MAX_VALUE);
        this.f10208a.setMaxWidth(Integer.MAX_VALUE);
        this.e.setMaxWidth(Integer.MAX_VALUE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            layoutParams.rightMargin = qre.b(R.dimen.margin_xs);
        } else {
            layoutParams.leftMargin = qre.b(R.dimen.margin_xs);
        }
        this.e.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = 0;
        this.f10208a.setLayoutParams(layoutParams2);
        this.f10208a.setGravity(GravityCompat.START);
        this.k.setOrientation(1);
    }

    private void c(WorkoutPackageInfo workoutPackageInfo) {
        if (workoutPackageInfo == null) {
            LogUtil.j("SportCourseItemViewHolder", "setWorkoutPackageInfo workout is null");
            return;
        }
        this.h.setText(workoutPackageInfo.getWorkoutPackageName());
        this.g.setText(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_sug_series_course_exercised, workoutPackageInfo.getWorkoutFinishCount().intValue(), workoutPackageInfo.getWorkoutFinishCount(), workoutPackageInfo.getWorkoutTotalCount()));
        this.f10208a.setText("");
        Integer commodityFlag = workoutPackageInfo.getCommodityFlag();
        Long expireTime = workoutPackageInfo.getExpireTime();
        String squarePicture = workoutPackageInfo.getSquarePicture();
        if (TextUtils.isEmpty(squarePicture)) {
            squarePicture = workoutPackageInfo.getTopicPreviewPicUrl();
        }
        qqf.b(this.f10209b, squarePicture, qqf.e, 0, R.drawable.sug_bg_trining_defuct);
        a(true, commodityFlag.intValue());
        if (commodityFlag.intValue() != 1 || expireTime == null) {
            this.e.setText("");
            LogUtil.j("SportCourseItemViewHolder", "setWorkoutPackageInfo expireTime is null or commodityFlag is no paid");
        } else {
            this.e.setText(a(expireTime.longValue()));
        }
    }

    private void c(SleepAudioSeries sleepAudioSeries) {
        if (sleepAudioSeries == null) {
            LogUtil.j("SportCourseItemViewHolder", "setHeartideStressInfo workout is null");
            return;
        }
        qqf.b(this.f10209b, sleepAudioSeries.getSmallImage(), qqf.e, 0, R.drawable.sug_bg_trining_defuct);
        e(true, sleepAudioSeries.getIsVip());
        this.h.setText(sleepAudioSeries.getName());
        b(Integer.toString(sleepAudioSeries.getId()));
        this.f10208a.setText("");
        long expireTime = sleepAudioSeries.getExpireTime();
        int i = this.m;
        if (i == 0 || i == 1) {
            this.e.setText("");
            LogUtil.a("SportCourseItemViewHolder", "mFragmentType= ", Integer.valueOf(this.m));
        } else {
            this.e.setText(a(expireTime));
        }
    }

    private String a(long j) {
        String string;
        if (j <= 0) {
            string = "";
        } else {
            string = BaseApplication.getContext().getResources().getString(R.string.IDS_sug_series_course_expiration, UnitUtil.d("yyyy/M/d", j));
        }
        if (j == -1) {
            string = BaseApplication.getContext().getResources().getString(R.string.IDS_sug_series_course_permanently_effective);
        } else if (j != -2) {
            LogUtil.j("SportCourseItemViewHolder", "setWorkoutPackageInfo expireTime is invalidation");
        } else {
            string = BaseApplication.getContext().getResources().getString(R.string.IDS_sug_series_course_expired);
        }
        LogUtil.a("SportCourseItemViewHolder", "workout Info expireTime= ", Long.valueOf(j));
        return string;
    }

    private void b(final String str) {
        final CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("SportCourseItemViewHolder", "getSleepRelaxCourse : courseApi is null.");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: idj
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(courseApi, str);
                }
            });
        }
    }

    public /* synthetic */ void d(CourseApi courseApi, String str) {
        courseApi.queryAudiosPackageBySeriesId(str, new UiCallback<List<SleepAudioPackage>>() { // from class: com.huawei.health.suggestion.ui.viewholder.CourseItemHolder.1
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                LogUtil.j("SportCourseItemViewHolder", "errcode = ", Integer.valueOf(i), ", errorInfo = ", str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<SleepAudioPackage> list) {
                if (!njy.e(list)) {
                    CourseItemHolder.this.a(list);
                } else {
                    LogUtil.j("SportCourseItemViewHolder", "onSuccess data is null");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<SleepAudioPackage> list) {
        for (SleepAudioPackage sleepAudioPackage : list) {
            if (sleepAudioPackage.getSleepAudioSeries() == null) {
                LogUtil.j("SportCourseItemViewHolder", "sleepAudioSeries is null");
            } else {
                int displayStyle = sleepAudioPackage.getSleepAudioSeries().getDisplayStyle();
                if (displayStyle == 1) {
                    if (njy.e(sleepAudioPackage.getSleepAudioInfoList())) {
                        LogUtil.j("SportCourseItemViewHolder", "sleepAudioInfoList is null");
                    } else {
                        e(sleepAudioPackage, haa.b(sleepAudioPackage.getSleepAudioInfoList()));
                    }
                } else if (displayStyle == 2) {
                    if (njy.e(sleepAudioPackage.getSleepAudioGroupList())) {
                        LogUtil.j("SportCourseItemViewHolder", "sleepAudioGroupList is null");
                    } else {
                        e(sleepAudioPackage, haa.c(sleepAudioPackage.getSleepAudioGroupList()));
                    }
                } else {
                    LogUtil.j("SportCourseItemViewHolder", "wrong style:", Integer.valueOf(displayStyle));
                }
            }
        }
    }

    private void e(SleepAudioPackage sleepAudioPackage, String str) {
        if (str.equals(BaseApplication.getContext().getResources().getString(com.huawei.health.servicesui.R.string.IDS_sleep_decompression_not_played))) {
            this.g.setText(sleepAudioPackage.getSleepAudioSeries().getAudioDescription());
        } else {
            this.g.setText(str);
        }
    }

    private void g() {
        this.o.setMinimumHeight(BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_95dp));
        this.n.setVisibility(0);
    }

    private void h() {
        this.j.setVisibility(0);
        this.j.setText(btx.c().getResources().getString(R.string.IDS_vip));
        this.j.setTextColor(btx.c().getColor(R.color.color_fitness_card_member_icon));
        this.j.setBackground(ContextCompat.getDrawable(BaseApplication.getContext(), R.drawable.sug_my_course_member_tag_new));
    }

    private void e() {
        this.j.setVisibility(0);
        this.j.setText(btx.c().getResources().getString(R.string.IDS_sug_series_course_pay));
        this.j.setTextColor(btx.c().getColor(R.color.emui_subtab_text_on));
        this.j.setBackground(ContextCompat.getDrawable(BaseApplication.getContext(), R.drawable.sug_my_course_pay_tag_new));
    }

    private void e(boolean z, int i) {
        if (z) {
            g();
        }
        if (i == 1) {
            h();
        } else if (i == 2) {
            e();
        } else {
            this.j.setVisibility(8);
        }
    }

    private void a(boolean z, int i) {
        if (z) {
            g();
        }
        if (i == 2) {
            h();
        } else if (i == 1) {
            e();
        } else {
            this.j.setVisibility(8);
        }
    }

    private void c(FitWorkout fitWorkout) {
        if (qrs.u() || qrs.a(3.4f) || d()) {
            c();
        }
        this.h.setText(fitWorkout.acquireName());
        this.e.setText(gzx.c(btx.c(), R.string.sug_fitness_min, ped.m(fitWorkout.acquireDuration())));
        this.f10208a.setText(iec.c(fitWorkout.acquireDifficulty()));
        if (fitWorkout.getIntervals() == -4 && !fitWorkout.isLongExplainVideoCourse()) {
            this.g.setVisibility(8);
        } else {
            this.g.setVisibility(0);
            this.g.setText(a(fitWorkout));
        }
        if (fitWorkout.getCourseDefineType() == 1) {
            e(fitWorkout);
        } else if (!TextUtils.isEmpty(fitWorkout.getTopicPreviewPicUrl())) {
            qqf.b(this.f10209b, fitWorkout.getTopicPreviewPicUrl(), qqf.e, 0, R.drawable.sug_bg_trining_defuct);
        } else {
            qqf.a(R.drawable.sug_bg_trining_defuct, this.f10209b, qqf.e);
        }
        a(false, fitWorkout.acquireCommodityFlag());
    }

    private boolean d() {
        return !LanguageUtil.al(this.itemView.getContext());
    }

    private String a(FitWorkout fitWorkout) {
        if (fitWorkout.isLongExplainVideoCourse()) {
            return btx.c().getString(R.string.IDS_fitness_advice_explain_courses);
        }
        if (fitWorkout.getIntervals() == -2) {
            return btx.c().getString(R.string.IDS_fitness_advice_run_trained_never);
        }
        if (fitWorkout.getIntervals() == -3) {
            return btx.c().getString(R.string.IDS_fitness_advice_run_trained_long_ago);
        }
        if (fitWorkout.getIntervals() == 0) {
            return btx.c().getString(R.string.IDS_fitness_advice_run_trained_today);
        }
        int intervals = fitWorkout.getIntervals();
        return btx.c().getResources().getQuantityString(R.plurals.IDS_fitness_advice_run_trained_ago, intervals, Integer.valueOf(intervals));
    }

    private void e(FitWorkout fitWorkout) {
        int i;
        if (fitWorkout == null) {
            LogUtil.e("SportCourseItemViewHolder", "setCustomCourseWorkout fitWorkout is null.");
            return;
        }
        this.e.setVisibility(8);
        this.f10208a.setMaxWidth(Integer.MAX_VALUE);
        this.f10208a.setText(hjs.a(fitWorkout.getPublishDate()));
        long jI = CommonUtils.i(fitWorkout.acquireId()) % 3;
        if (jI == 0) {
            i = R.drawable.pic_custom_yellow_small;
        } else if (jI == 1) {
            i = R.drawable.pic_custom_red_small;
        } else {
            i = R.drawable.pic_custom_blue_small;
        }
        qqf.a(this.f10209b, i, qqf.e, 0, R.drawable.sug_bg_trining_defuct);
    }

    private void a() {
        FitnessTopicDeleteModel fitnessTopicDeleteModel = this.i;
        if (fitnessTopicDeleteModel == null) {
            return;
        }
        if (fitnessTopicDeleteModel.issDeleteMode()) {
            this.l.setVisibility(0);
            if (this.i.acquireSelects().contains(Integer.valueOf(this.i.acquirePosition()))) {
                this.f.setChecked(true);
            } else {
                this.f.setChecked(false);
            }
        } else {
            this.l.setVisibility(8);
        }
        this.f.setTag(Integer.valueOf(this.i.acquirePosition()));
        this.f.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        if (view.getTag() instanceof Integer) {
            Integer num = (Integer) view.getTag();
            if (this.f.isChecked()) {
                this.i.acquireSelects().add(num);
            } else if (this.i.acquireSelects().contains(num)) {
                this.i.acquireSelects().remove(num);
            } else {
                LogUtil.d("SportCourseItemViewHolder", "else isChecked");
            }
        }
        LogUtil.a("SportCourseItemViewHolder", "after mDeleteModel.acquireSelects():", this.i.acquireSelects());
        ClickItemCount clickItemCount = this.f10210c;
        if (clickItemCount != null) {
            clickItemCount.onClickCheckBoxItem();
        }
    }

    public void b(int i) {
        this.m = i;
    }

    public void c(ClickItemCount clickItemCount) {
        this.f10210c = clickItemCount;
    }
}
