package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.content.ActivityNotFoundException;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.module.FitnessTopicDeleteModel;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.pricetagbean.PriceTagBean;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.btx;
import defpackage.gzx;
import defpackage.hcu;
import defpackage.iec;
import defpackage.ien;
import defpackage.pcd;
import defpackage.pea;
import defpackage.ped;
import defpackage.qqf;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.utils.StringUtils;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessTopicViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f9503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f9504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FitnessTopicDeleteModel f9505c;
    private HealthCheckBox d;
    private HealthTextView e;
    private HealthTextView f;
    private View g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private float n;

    public FitnessTopicViewHolder(View view) {
        super(view);
        this.i = (HealthTextView) view.findViewById(R.id.tv_plan_peoples_num);
        this.f = (HealthTextView) view.findViewById(R.id.tv_fe_name);
        this.e = (HealthTextView) view.findViewById(R.id.tv_Kcal);
        this.j = (HealthTextView) view.findViewById(R.id.tv_parameter_num);
        this.h = (HealthTextView) view.findViewById(R.id.tv_level);
        this.f9504b = (ImageView) view.findViewById(R.id.sug_img_item_pic);
        this.d = (HealthCheckBox) view.findViewById(R.id.sug_rv_checkbox);
        this.f9503a = (ImageView) view.findViewById(R.id.new_imageView);
        this.g = view.findViewById(R.id.sug_view_space);
        e();
    }

    public void b(int i) {
        this.g.setVisibility(i);
    }

    public void e(FitnessTopicDeleteModel fitnessTopicDeleteModel, String str, boolean z, FitWorkout fitWorkout) {
        if (fitWorkout == null) {
            LogUtil.e("Suggestion_FitnessTopicViewHolder", "setDataAndRefresh fitWorkout == null");
            return;
        }
        if (!Utils.o()) {
            this.f.setMaxLines(1);
            this.f.setSingleLine(true);
            this.f.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (Utils.j()) {
            this.i.setText(gzx.c(BaseApplication.getContext(), "\\d+.\\d+|\\d+", gzx.d(com.huawei.health.basefitnessadvice.R.plurals.sug_fitness_personjoin, fitWorkout.acquireUsers(), UnitUtil.e(fitWorkout.acquireUsers(), 1, 0)), com.huawei.health.basefitnessadvice.R.style.sug_reco_train_num, com.huawei.health.basefitnessadvice.R.style.sug_reco_train_desc));
        } else {
            this.i.setVisibility(8);
        }
        if (z && fitnessTopicDeleteModel != null) {
            this.f9505c = fitnessTopicDeleteModel;
            a();
        }
        a(fitWorkout);
        e(fitWorkout, str);
    }

    private void e(final FitWorkout fitWorkout, final String str) {
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.FitnessTopicViewHolder.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (FitnessTopicViewHolder.this.f9505c != null && FitnessTopicViewHolder.this.f9505c.issDeleteMode()) {
                    FitnessTopicViewHolder.this.d.performClick();
                    return;
                }
                LogUtil.a("Suggestion_FitnessTopicViewHolder", "method:onclick (View view) ---fitWorkout.acquireId():", fitWorkout.acquireId(), "--fitWorkout.accquireVersion():", fitWorkout.accquireVersion());
                if (FitnessTopicViewHolder.this.itemView.getParent() instanceof RecyclerView) {
                    try {
                        pcd pcdVar = new pcd(fitWorkout.acquireId());
                        pcdVar.a(str);
                        pea.a(((RecyclerView) FitnessTopicViewHolder.this.itemView.getParent()).getContext(), fitWorkout, pcdVar);
                    } catch (ActivityNotFoundException unused) {
                        LogUtil.e("Suggestion_FitnessTopicViewHolder", "setDataAndRefresh ActivityNotFoundException.");
                    }
                }
            }
        });
    }

    private void a(FitWorkout fitWorkout) {
        String strC = gzx.c(btx.c(), com.huawei.health.basefitnessadvice.R.string.sug_chart_kcal, ped.f(ped.b(fitWorkout.acquireCalorie() * this.n)));
        this.f.setText(fitWorkout.acquireName());
        if (fitWorkout.isLongExplainVideoCourse()) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
        }
        this.e.setText(strC);
        this.h.setText(iec.c(fitWorkout.acquireDifficulty()));
        this.j.setText(gzx.c(btx.c(), com.huawei.health.basefitnessadvice.R.string.sug_fitness_min, ped.m(fitWorkout.acquireDuration())));
        qqf.b(this.f9504b, fitWorkout.acquirePicture(), qqf.d, 0, R.drawable.sug_bg_trining_defuct);
        if (LanguageUtil.o(this.itemView.getContext()) || LanguageUtil.q(this.itemView.getContext())) {
            ien.a(fitWorkout, this.f9503a);
        } else {
            this.f9503a.setVisibility(8);
        }
        List<PriceTagBean> listAcquirePriceTagBeanList = fitWorkout.acquirePriceTagBeanList();
        if (StringUtils.j(pea.e(listAcquirePriceTagBeanList))) {
            this.f9503a.setVisibility(0);
            qqf.c(pea.e(listAcquirePriceTagBeanList), this.f9503a, qqf.d);
        }
    }

    private void a() {
        LogUtil.a("Suggestion_FitnessTopicViewHolder", "mDeleteModel.issDeleteMode():", Boolean.valueOf(this.f9505c.issDeleteMode()), ":mDeleteModel.acquirePosition():", Integer.valueOf(this.f9505c.acquirePosition()));
        if (this.f9505c.issDeleteMode()) {
            this.d.setVisibility(0);
            if (this.f9505c.acquireSelects().contains(Integer.valueOf(this.f9505c.acquirePosition()))) {
                this.d.setChecked(true);
            } else {
                this.d.setChecked(false);
            }
        } else {
            this.d.setVisibility(8);
        }
        this.d.setTag(Integer.valueOf(this.f9505c.acquirePosition()));
        this.d.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view != null && R.id.sug_rv_checkbox == view.getId()) {
            Integer num = (Integer) view.getTag();
            boolean zIsChecked = this.d.isChecked();
            LogUtil.a("Suggestion_FitnessTopicViewHolder", "before mDeleteModel.acquireSelects():", this.f9505c.acquireSelects(), "--isChecked:", Boolean.valueOf(zIsChecked));
            if (zIsChecked) {
                this.f9505c.acquireSelects().add(num);
            } else if (this.f9505c.acquireSelects().contains(num)) {
                this.f9505c.acquireSelects().remove(num);
            }
            LogUtil.a("Suggestion_FitnessTopicViewHolder", "after mDeleteModel.acquireSelects():", this.f9505c.acquireSelects());
        }
    }

    private void e() {
        this.n = hcu.b().d();
    }
}
