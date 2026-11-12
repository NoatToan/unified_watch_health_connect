package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.btx;
import defpackage.gzx;
import defpackage.idy;
import defpackage.iec;
import defpackage.pea;
import defpackage.ped;
import defpackage.qqf;
import java.util.HashMap;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessMyCourseWithDataViewHolder extends AbsFitnessViewHolder<FitWorkout> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HealthTextView f9484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HealthTextView f9485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HealthDivider f9486c;
    private final HealthTextView d;
    private final HealthTextView e;
    private String f;
    private String g;
    private String h;
    private final ImageView i;

    public FitnessMyCourseWithDataViewHolder(View view) {
        super(view);
        this.i = (ImageView) view.findViewById(R.id.recycle_item_picture);
        this.f9484a = (HealthTextView) view.findViewById(R.id.course_title);
        this.d = (HealthTextView) view.findViewById(R.id.fitness_course_trained);
        this.e = (HealthTextView) view.findViewById(R.id.fitness_course_difficulty);
        this.f9485b = (HealthTextView) view.findViewById(R.id.fitness_course_duration);
        this.f9486c = (HealthDivider) view.findViewById(R.id.fitness_course_divider);
        this.g = view.getContext().getString(R.string.IDS_fitness_advice_run_trained_today);
        this.h = view.getContext().getString(R.string.IDS_fitness_advice_run_trained_long_ago);
        this.f = view.getContext().getString(R.string.IDS_fitness_advice_run_trained_never);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void init(FitWorkout fitWorkout) {
        if (fitWorkout == null) {
            LogUtil.j("Suggestion_FitnessMyCourseWithDataViewHolder", "FitnessMyCourseWithDataViewHolder init fitWorkout null");
        } else {
            h(fitWorkout);
            c(fitWorkout);
        }
    }

    private void h(FitWorkout fitWorkout) {
        if (fitWorkout == null) {
            LogUtil.j("Suggestion_FitnessMyCourseWithDataViewHolder", "setDataAndRefresh fitWorkout null");
            return;
        }
        LogUtil.a("Suggestion_FitnessMyCourseWithDataViewHolder", "setDataAndRefresh success");
        b(fitWorkout);
        this.f9484a.setText(TextUtils.isEmpty(fitWorkout.acquireName()) ? "" : fitWorkout.acquireName());
        this.e.setText(iec.c(fitWorkout.acquireDifficulty()));
        this.f9485b.setText(gzx.c(btx.c(), com.huawei.health.basefitnessadvice.R.string.sug_fitness_min, ped.m(fitWorkout.acquireDuration())));
        e(fitWorkout);
    }

    private void c(final FitWorkout fitWorkout) {
        if (fitWorkout == null) {
            LogUtil.j("Suggestion_FitnessMyCourseWithDataViewHolder", "setClickListener fitWorkout null");
        } else {
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: hnk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.a(fitWorkout, view);
                }
            });
        }
    }

    public /* synthetic */ void a(FitWorkout fitWorkout, View view) {
        if (this.itemView.getParent() instanceof RecyclerView) {
            if (isFastClick()) {
                LogUtil.j("Suggestion_FitnessMyCourseWithDataViewHolder", "FitnessMyCourseWithDataViewHolder is fast click");
            } else {
                f(fitWorkout);
            }
        }
    }

    private void f(FitWorkout fitWorkout) {
        if (fitWorkout == null) {
            LogUtil.j("Suggestion_FitnessMyCourseWithDataViewHolder", "startActivityForTrainDetail fitWorkout null");
        } else {
            a(fitWorkout);
            pea.a(this.itemView.getContext(), fitWorkout);
        }
    }

    private void e(FitWorkout fitWorkout) {
        int intervals = fitWorkout.getIntervals();
        if (intervals == -4) {
            this.d.setVisibility(4);
            return;
        }
        if (intervals == -3) {
            this.d.setText(this.h);
            return;
        }
        if (intervals == -2) {
            this.d.setText(this.f);
        } else {
            if (intervals == 0) {
                this.d.setText(this.g);
                return;
            }
            int intervals2 = fitWorkout.getIntervals();
            this.d.setText(this.itemView.getContext().getResources().getQuantityString(R.plurals.IDS_fitness_advice_run_trained_ago, intervals2, Integer.valueOf(intervals2)));
        }
    }

    private void b(FitWorkout fitWorkout) {
        if (!TextUtils.isEmpty(fitWorkout.getTopicPreviewPicUrl())) {
            qqf.b(this.i, fitWorkout.getTopicPreviewPicUrl(), qqf.e, 0, R.drawable.sug_bg_trining_defuct);
        } else {
            qqf.a(R.drawable.sug_bg_trining_defuct, this.i, qqf.e);
        }
    }

    private void a(FitWorkout fitWorkout) {
        HashMap map = new HashMap(1);
        map.put("entrance", this.itemView.getContext().getString(R.string.sug_my_fitness_class));
        map.put("position", 0);
        map.put("type", 10001);
        map.put(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, TextUtils.isEmpty(fitWorkout.acquireId()) ? "" : fitWorkout.acquireId());
        idy.b("1130015", map);
    }

    public HealthDivider e() {
        return this.f9486c;
    }
}
