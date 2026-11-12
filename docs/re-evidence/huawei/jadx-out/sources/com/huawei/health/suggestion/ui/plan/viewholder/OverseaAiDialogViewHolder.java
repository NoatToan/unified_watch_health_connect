package com.huawei.health.suggestion.ui.plan.viewholder;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes9.dex */
public class OverseaAiDialogViewHolder extends AbsFitnessViewHolder<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HealthTextView f9768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Animation f9769c;
    private final HealthTextView d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View.OnClickListener f9770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f9771b;
        public String d;
    }

    public OverseaAiDialogViewHolder(View view) {
        super(view);
        this.f9768b = (HealthTextView) view.findViewById(R.id.oversea_guide_text);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.oversea_guide_ok);
        this.d = healthTextView;
        healthTextView.setVisibility(8);
        healthTextView.setAllCaps(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1.0f);
        this.f9769c = alphaAnimation;
        alphaAnimation.setDuration(500L);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    public void init(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            this.f9768b.setText(bVar.d);
            this.f9768b.setAnimation(this.f9769c);
            this.f9768b.startAnimation(this.f9769c);
            if (bVar.f9771b != null) {
                this.d.setVisibility(0);
                this.d.setText(bVar.f9771b);
                if (bVar.f9770a != null) {
                    this.d.setOnClickListener(bVar.f9770a);
                }
                this.d.setAnimation(this.f9769c);
                this.d.startAnimation(this.f9769c);
                return;
            }
            this.d.setVisibility(8);
        }
    }
}
