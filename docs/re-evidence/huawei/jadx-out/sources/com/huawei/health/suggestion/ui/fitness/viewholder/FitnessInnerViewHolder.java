package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.btx;
import defpackage.idy;
import defpackage.iec;
import defpackage.ien;
import defpackage.ifp;
import defpackage.pcd;
import defpackage.pea;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessInnerViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f9477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f9478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f9479c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private float i;
    private ImageView j;

    public FitnessInnerViewHolder(View view) {
        super(view);
        this.f9479c = (ImageView) view.findViewById(R.id.sug_img_item_pic);
        this.e = (HealthTextView) view.findViewById(R.id.tv_name);
        this.d = (HealthTextView) view.findViewById(R.id.tv_level);
        this.f9478b = (HealthTextView) view.findViewById(R.id.tv_duration);
        this.f9477a = (HealthTextView) view.findViewById(R.id.tv_calorie);
        this.g = (HealthTextView) view.findViewById(R.id.tv_train_number);
        this.j = (ImageView) view.findViewById(R.id.new_imageView);
        this.f = (HealthTextView) view.findViewById(R.id.sug_sub_title_htv);
        d();
    }

    public void d(FitWorkout fitWorkout, boolean z, boolean z2) {
        c(fitWorkout, z, z2, null);
    }

    public void c(final FitWorkout fitWorkout, boolean z, boolean z2, final Topic topic) {
        if (fitWorkout == null) {
            LogUtil.j("Suggestion_FitnessInnerViewHolder", "setDataAndRefresh, fitWorkout == null");
            return;
        }
        this.itemView.setLayoutParams(e(z, z2, topic));
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.FitnessInnerViewHolder.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Suggestion_FitnessInnerViewHolder", "method:onclick (View view) ---fitWorkout.acquireId():", fitWorkout.acquireId(), "--fitWorkout.accquireVersion():", fitWorkout.accquireVersion());
                pcd pcdVar = new pcd(fitWorkout.acquireId());
                pcdVar.a("5");
                pea.a(btx.c(), fitWorkout, pcdVar);
                Topic topic2 = topic;
                if (topic2 != null) {
                    FitnessInnerViewHolder.this.b(topic2);
                }
            }
        });
        e(fitWorkout);
    }

    private RecyclerView.LayoutParams e(boolean z, boolean z2, Topic topic) {
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            LogUtil.j("Suggestion_FitnessInnerViewHolder", "!(layoutParams instanceof RecyclerView.LayoutParams)");
            return null;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        if (z && z2) {
            layoutParams2.setMarginStart(this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart));
            if (topic != null) {
                layoutParams2.setMarginEnd(this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd));
                return layoutParams2;
            }
        } else {
            if (z) {
                layoutParams2.setMarginStart(this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart));
                return layoutParams2;
            }
            if (topic != null) {
                layoutParams2.setMarginStart(qqp.b(BaseApplication.getContext()));
                if (z2) {
                    layoutParams2.setMarginEnd(this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd));
                }
            } else {
                layoutParams2.setMarginStart(0);
                return layoutParams2;
            }
        }
        return layoutParams2;
    }

    private void e(FitWorkout fitWorkout) {
        if (LanguageUtil.o(this.itemView.getContext()) || LanguageUtil.q(this.itemView.getContext())) {
            ien.a(fitWorkout, this.j);
        } else {
            this.j.setVisibility(8);
        }
        if (!TextUtils.isEmpty(fitWorkout.acquirePicture())) {
            qqf.b(this.f9479c, fitWorkout.acquirePicture(), qqf.d, 0, R.drawable.blank_1008);
        } else {
            qqf.a(R.drawable.blank_1008, this.f9479c, qqf.d);
        }
        if (Utils.j()) {
            this.g.setText(UnitUtil.b(BaseApplication.getContext(), "\\d+.\\d+|\\d+", ifp.c(R.plurals.sug_fitness_personjoin, fitWorkout.acquireUsers(), UnitUtil.e(fitWorkout.acquireUsers(), 1, 0)), R.style.sug_reco_train_num, R.style.sug_reco_train_desc));
        } else {
            this.g.setVisibility(8);
        }
        String strD = ifp.d(btx.c(), R.string.sug_fitness_min, ifp.d(fitWorkout.acquireDuration()));
        String strD2 = ifp.d(btx.c(), R.string.sug_chart_kcal, ifp.a(ifp.b(fitWorkout.acquireCalorie() * this.i)));
        this.e.setText(fitWorkout.acquireName());
        this.d.setText(iec.c(fitWorkout.acquireDifficulty()));
        this.f9478b.setText(strD);
        this.f9477a.setText(strD2);
        if (fitWorkout.isLongExplainVideoCourse()) {
            this.f9477a.setVisibility(8);
        } else {
            this.f9477a.setVisibility(0);
        }
    }

    private void d() {
        this.i = ien.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Topic topic) {
        HashMap map = new HashMap(2);
        map.put("entrance", topic.acquireName());
        map.put("position", 0);
        idy.b("1130015", map);
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f.setVisibility(8);
            return;
        }
        this.f.setVisibility(0);
        this.f.setText(str);
        if (qrs.d(1.3f)) {
            LogUtil.a("Suggestion_FitnessInnerViewHolder", "bindSubTitleData,  isLargeFontScaleMode");
            if (this.e.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.e.getLayoutParams();
                layoutParams.topMargin = this.e.getResources().getDimensionPixelSize(R.dimen.health_common_4dp);
                this.e.setLayoutParams(layoutParams);
            }
            if (this.g.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.g.getLayoutParams();
                layoutParams2.bottomMargin = this.g.getResources().getDimensionPixelSize(R.dimen.health_common_4dp);
                this.g.setLayoutParams(layoutParams2);
            }
        }
    }
}
