package com.huawei.health.suggestion.ui.plan.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.qre;
import defpackage.qrs;

/* JADX INFO: loaded from: classes9.dex */
public class SmartTrainPlanResourceViewHolder extends AbsFitnessViewHolder<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f9787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f9788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthSubHeader f9789c;
    private LinearLayout d;
    private HealthTextView e;

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    public void init(Object obj) {
    }

    public SmartTrainPlanResourceViewHolder(View view) {
        super(view);
        this.f9789c = (HealthSubHeader) view.findViewById(R.id.fit_plan_period);
        this.d = (LinearLayout) view.findViewById(R.id.fit_plan_content_layout);
        this.f9788b = (ImageView) view.findViewById(R.id.fit_plan_pkg_bg);
        this.e = (HealthTextView) view.findViewById(R.id.fit_plan_name);
        this.f9787a = (HealthTextView) view.findViewById(R.id.fit_plan_description);
        if (qrs.ac()) {
            qrs.a(this.e);
            qrs.a(this.f9787a);
        }
        int iB = qrs.af(view.getContext()) ? 0 : qre.b(R.dimen.cardMarginMiddle);
        view.setPadding(iB, 0, iB, 0);
        a();
    }

    private void a() {
        this.f9789c.setMoreLayoutVisibility(8);
        this.f9789c.setHeadTitleText(qre.f(R.string.IDS_train_plan));
        this.f9789c.setSubHeaderBackgroundColor(qre.e(R.color.transparent));
        if (this.f9789c.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9789c.getLayoutParams();
            layoutParams.leftMargin = qre.b(R.dimen.health_common_min_12dp);
            layoutParams.rightMargin = qre.b(R.dimen.health_common_min_12dp);
            layoutParams.topMargin = qre.b(R.dimen.health_common_min_12dp);
            this.f9789c.setLayoutParams(layoutParams);
        }
        if (this.d.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            layoutParams2.topMargin = qre.b(R.dimen.health_common_16dp);
            layoutParams2.gravity = 48;
            this.d.setLayoutParams(layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = this.f9787a.getLayoutParams();
        layoutParams3.width = -2;
        this.f9787a.setLayoutParams(layoutParams3);
        this.e.setText(qre.f(R.string.IDS_train_plan));
        this.f9787a.setText(qre.f(R.string.IDS_train_plan_description));
        this.f9788b.setImageResource(R.drawable.sug_train_plan_create_bg);
        this.f9788b.setOnClickListener(new View.OnClickListener() { // from class: hyn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        JumpUtil.a(this.itemView.getContext(), "#/train_plan_create_guide", "plan_page", "com.huawei.health.h5.intelligent-training-plan");
    }
}
