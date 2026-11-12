package com.huawei.health.suggestion.ui.plan.viewholder;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes9.dex */
public class IntAiDialogViewHolder extends AbsFitnessViewHolder<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HealthTextView f9750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HealthTextView f9751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImageView f9752c;
    private final Animation d;
    private final HealthTextView e;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View.OnClickListener f9753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View.OnClickListener f9754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9755c;
        public String d;
        public int e;
        public String j;
    }

    public IntAiDialogViewHolder(View view) {
        super(view);
        this.f9752c = (ImageView) view.findViewById(R.id.warm_up_men);
        this.f9750a = (HealthTextView) view.findViewById(R.id.coach_text);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.coach_yes);
        this.e = healthTextView;
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.coach_no);
        this.f9751b = healthTextView2;
        healthTextView.setVisibility(8);
        healthTextView2.setVisibility(8);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1.0f);
        this.d = alphaAnimation;
        alphaAnimation.setDuration(500L);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    public void init(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.e == 0) {
                this.f9752c.setImageResource(R.drawable.ic_aiplan_assistant);
            } else {
                this.f9752c.setImageResource(bVar.e);
            }
            this.f9750a.setText(bVar.d);
            this.f9750a.setAnimation(this.d);
            this.f9750a.startAnimation(this.d);
            if (bVar.j != null) {
                this.e.setVisibility(0);
                this.e.setText(bVar.j);
                if (bVar.f9754b != null) {
                    this.e.setOnClickListener(bVar.f9754b);
                }
                this.e.setAnimation(this.d);
                this.e.startAnimation(this.d);
            } else {
                this.e.setVisibility(8);
            }
            if (bVar.f9755c != null) {
                this.f9751b.setVisibility(0);
                this.f9751b.setText(bVar.f9755c);
                if (bVar.f9753a != null) {
                    this.f9751b.setOnClickListener(bVar.f9753a);
                }
                this.f9751b.setAnimation(this.d);
                this.f9751b.startAnimation(this.d);
                return;
            }
            this.f9751b.setVisibility(8);
        }
    }
}
