package com.zhouyou.recyclerview.adapter;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class HelperRecyclerViewAnimAdapter<T> extends HelperRecyclerViewAdapter {
    private AnimationType d;
    private int e;
    private boolean f;
    private Interpolator g;
    private CustomAnimator h;
    private int i;

    public interface CustomAnimator {
        Animator getAnimator(View view);
    }

    public HelperRecyclerViewAnimAdapter(List list, Context context, int... iArr) {
        super(list, context, iArr);
        this.e = 300;
        this.f = false;
        this.i = -1;
    }

    public final void addAnimation(BH bh) {
        int adapterPosition = bh.getAdapterPosition();
        CustomAnimator customAnimator = this.h;
        if (customAnimator != null) {
            customAnimator.getAnimator(bh.itemView).setDuration(this.e).start();
            return;
        }
        if (this.d != null) {
            if (this.f || adapterPosition > this.i) {
                new AnimationUtil().setAnimationType(this.d).setTargetView(bh.itemView).setDuration(this.e).setInterpolator(this.g).start();
                this.i = adapterPosition;
            }
        }
    }

    @Override // com.zhouyou.recyclerview.adapter.BaseRecyclerViewAdapter
    public void onBindViewHolder(BH bh, int i) {
        super.onBindViewHolder(bh, i);
        addAnimation(bh);
    }

    public void setCustomItemAnimator(CustomAnimator customAnimator) {
        this.h = customAnimator;
    }

    public void setItemAnimation(AnimationType animationType) {
        this.d = animationType;
    }

    public void setItemAnimationDuration(int i) {
        this.e = i;
    }

    public void setItemAnimationInterpolator(Interpolator interpolator) {
        this.g = interpolator;
    }

    public void setShowItemAnimationEveryTime(boolean z) {
        this.f = z;
    }

    public HelperRecyclerViewAnimAdapter(Context context, int... iArr) {
        super(context, iArr);
        this.e = 300;
        this.f = false;
        this.i = -1;
    }

    public HelperRecyclerViewAnimAdapter(Context context) {
        super(context, new int[0]);
        this.e = 300;
        this.f = false;
        this.i = -1;
    }

    public HelperRecyclerViewAnimAdapter(List list, Context context) {
        super(list, context);
        this.e = 300;
        this.f = false;
        this.i = -1;
    }
}
