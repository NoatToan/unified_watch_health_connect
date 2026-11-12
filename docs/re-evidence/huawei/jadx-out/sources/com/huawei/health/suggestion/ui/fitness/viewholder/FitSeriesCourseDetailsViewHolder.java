package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitSeriesCourseDetailsViewHolder;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.btx;
import defpackage.gzx;
import defpackage.hcu;
import defpackage.iec;
import defpackage.pcd;
import defpackage.pea;
import defpackage.ped;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes9.dex */
public class FitSeriesCourseDetailsViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f9446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f9447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f9448c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView g;
    private HealthTextView i;
    private float j;

    public FitSeriesCourseDetailsViewHolder(View view) {
        super(view);
        this.f9446a = (ImageView) view.findViewById(R.id.sug_img_item_pic);
        this.i = (HealthTextView) view.findViewById(R.id.tv_name);
        this.d = (HealthTextView) view.findViewById(R.id.tv_level);
        this.e = (HealthTextView) view.findViewById(R.id.tv_time);
        this.f9447b = (HealthTextView) view.findViewById(R.id.tv_calorie);
        this.g = (HealthTextView) view.findViewById(R.id.tv_train_number);
        this.f9448c = (ImageView) view.findViewById(R.id.new_imageView);
        d();
    }

    public void e(final FitWorkout fitWorkout, final String str) {
        b(fitWorkout);
        c(fitWorkout);
        this.i.setText(TextUtils.isEmpty(fitWorkout.acquireName()) ? "" : fitWorkout.acquireName());
        a(fitWorkout);
        this.e.setText(gzx.c(btx.c(), com.huawei.health.basefitnessadvice.R.string.sug_fitness_min, ped.m(fitWorkout.acquireDuration())));
        SpannableString spannableStringC = gzx.c(BaseApplication.getContext(), "\\d+.\\d+|\\d+", gzx.d(com.huawei.health.basefitnessadvice.R.plurals.sug_fitness_personjoin, fitWorkout.acquireUsers(), UnitUtil.e(fitWorkout.acquireUsers(), 1, 0)), com.huawei.health.basefitnessadvice.R.style.sug_reco_train_num, com.huawei.health.basefitnessadvice.R.style.sug_reco_train_desc);
        if (qrs.ac()) {
            this.g.setVisibility(8);
        } else {
            this.g.setVisibility(0);
            this.g.setText(spannableStringC);
        }
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: hnd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FitSeriesCourseDetailsViewHolder.a(fitWorkout, str, view);
            }
        });
    }

    public static /* synthetic */ void a(FitWorkout fitWorkout, String str, View view) {
        pcd pcdVar = new pcd(fitWorkout.acquireId());
        pcdVar.a("8");
        pcdVar.f(str);
        pea.a(BaseApplication.getContext(), fitWorkout, pcdVar);
    }

    private void a(FitWorkout fitWorkout) {
        if (fitWorkout.isLongExplainVideoCourse()) {
            this.d.setVisibility(8);
            this.f9447b.setVisibility(8);
            if (this.e.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.e.getLayoutParams();
                layoutParams.setMarginStart(0);
                this.e.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.d.setText(iec.c(fitWorkout.acquireDifficulty()));
        this.f9447b.setText(gzx.c(btx.c(), com.huawei.health.basefitnessadvice.R.string.sug_chart_kcal, ped.f(ped.b(fitWorkout.acquireCalorie() * this.j))));
    }

    private void b(FitWorkout fitWorkout) {
        if (!TextUtils.isEmpty(fitWorkout.acquirePicture())) {
            qqf.b(this.f9446a, fitWorkout.acquirePicture(), qqf.d, 0, com.huawei.health.basefitnessadvice.R.drawable.blank_1008);
        } else {
            qqf.a(com.huawei.health.basefitnessadvice.R.drawable.blank_1008, this.f9446a, qqf.d);
        }
    }

    private void d() {
        this.j = hcu.b().d();
    }

    private void c(FitWorkout fitWorkout) {
        if (this.f9448c == null || fitWorkout == null) {
            return;
        }
        if (fitWorkout.getCornerImgDisplay() == 1) {
            String strE = pea.e(fitWorkout.acquirePriceTagBeanList());
            if (!TextUtils.isEmpty(strE)) {
                this.f9448c.setVisibility(0);
                qqf.b(strE, this.f9448c, 0.0f, qqf.d, 0.0f, 0.0f);
                return;
            }
        }
        this.f9448c.setVisibility(8);
    }
}
