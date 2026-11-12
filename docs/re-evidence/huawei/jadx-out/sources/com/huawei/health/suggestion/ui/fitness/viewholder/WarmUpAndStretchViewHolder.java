package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gzx;
import defpackage.pcd;
import defpackage.pea;
import defpackage.qqf;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public class WarmUpAndStretchViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CourseApi f9508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WarmUpAndStretchViewHolder f9509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f9510c;
    private Context d;
    private Bundle e;
    private HealthTextView g;
    private HealthButton h;
    private HealthTextView i;
    private String j;

    private WarmUpAndStretchViewHolder(View view) {
        super(view);
        this.f9510c = (ImageView) view.findViewById(R.id.sug_img_item_pic);
        this.g = (HealthTextView) view.findViewById(R.id.tv_fe_name);
        this.i = (HealthTextView) view.findViewById(R.id.tv_plan_peoples_num);
        this.h = (HealthButton) view.findViewById(R.id.start_training_button);
    }

    public WarmUpAndStretchViewHolder(View view, Bundle bundle) {
        this(view);
        this.e = bundle;
        this.f9509b = this;
        LogUtil.a("Suggestion_WarmUpAndStretchViewHolder", "mBundle = ", bundle);
        this.f9508a = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
    }

    public void c(final FitWorkout fitWorkout, String str, Context context) {
        if (fitWorkout == null) {
            return;
        }
        this.d = context;
        this.j = str;
        this.i.setText(gzx.c(BaseApplication.getContext(), "\\d+.\\d+|\\d+", gzx.d(com.huawei.health.basefitnessadvice.R.plurals.sug_fitness_personjoin, fitWorkout.acquireUsers(), UnitUtil.e(fitWorkout.acquireUsers(), 1, 0)), com.huawei.health.basefitnessadvice.R.style.sug_reco_train_num, com.huawei.health.basefitnessadvice.R.style.sug_reco_train_desc).toString());
        this.g.setText(fitWorkout.acquireName());
        qqf.b(this.f9510c, fitWorkout.acquirePicture(), qqf.d, 0, R.drawable.sug_bg_trining_defuct);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.WarmUpAndStretchViewHolder.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (WarmUpAndStretchViewHolder.this.f9508a == null) {
                    LogUtil.j("Suggestion_WarmUpAndStretchViewHolder", "setDataAndRefresh, onClick : mCourseApi is null.");
                } else if (fitWorkout.acquireWorkoutActions() != null) {
                    WarmUpAndStretchViewHolder.this.b(fitWorkout);
                } else {
                    WarmUpAndStretchViewHolder.this.f9508a.getCourseById(fitWorkout.acquireId(), fitWorkout.accquireVersion(), null, new e(WarmUpAndStretchViewHolder.this.f9509b));
                }
            }
        });
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.WarmUpAndStretchViewHolder.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WarmUpAndStretchViewHolder.this.d(fitWorkout, false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(FitWorkout fitWorkout, boolean z) {
        boolean zEquals = "R002".equals(fitWorkout.acquireId());
        pcd pcdVar = new pcd(fitWorkout.acquireId());
        pcdVar.a(this.j);
        pcdVar.h(z);
        pcdVar.f(!zEquals);
        pea.a(this.d, fitWorkout, pcdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(FitWorkout fitWorkout) {
        d(fitWorkout, !a(fitWorkout));
    }

    private boolean a(FitWorkout fitWorkout) {
        return fitWorkout != null && this.f9508a.getCourseMediaFilesLength(fitWorkout.acquireId(), fitWorkout.accquireVersion()) == 0;
    }

    static class e extends UiCallback<Workout> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<WarmUpAndStretchViewHolder> f9513a;

        e(WarmUpAndStretchViewHolder warmUpAndStretchViewHolder) {
            this.f9513a = null;
            this.f9513a = new WeakReference<>(warmUpAndStretchViewHolder);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Suggestion_WarmUpAndStretchViewHolder", "errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Workout workout) {
            WeakReference<WarmUpAndStretchViewHolder> weakReference = this.f9513a;
            if (weakReference == null) {
                LogUtil.j("Suggestion_WarmUpAndStretchViewHolder", "mWeakPreference == null");
                return;
            }
            if (workout == null) {
                LogUtil.j("Suggestion_WarmUpAndStretchViewHolder", "GetWorkoutCallback workout is null");
                return;
            }
            WarmUpAndStretchViewHolder warmUpAndStretchViewHolder = weakReference.get();
            if (warmUpAndStretchViewHolder != null) {
                warmUpAndStretchViewHolder.b(pea.d(workout));
            } else {
                LogUtil.j("Suggestion_WarmUpAndStretchViewHolder", "holder is null");
            }
        }
    }
}
