package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessDummyViewHolder extends AbsFitnessViewHolder<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f9476a;

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void init(View view) {
        ViewParent parent;
        if (view == null || this.f9476a == null || (parent = view.getParent()) == this.f9476a) {
            return;
        }
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        this.f9476a.addView(view);
    }
}
