package com.zhouyou.recyclerview.refresh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Objects;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BaseRefreshHeader extends LinearLayout implements IRefreshHeader {
    private LinearLayout a;
    private int b;
    public int mMeasuredHeight;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseRefreshHeader.this.reset();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseRefreshHeader.this.setState(0);
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseRefreshHeader.this.setVisibleHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public BaseRefreshHeader(Context context) {
        super(context);
        this.b = 0;
        a();
    }

    private void a() {
        this.a = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        setPadding(0, 0, 0, 0);
        View view = getView();
        Objects.requireNonNull(view, "getView() is null!!!");
        this.a.addView(view);
        this.a.setGravity(81);
        addView(this.a, new LinearLayout.LayoutParams(-1, 0));
        setGravity(17);
        measure(-2, -2);
        this.mMeasuredHeight = getMeasuredHeight();
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public View getHeaderView() {
        return this;
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public int getState() {
        return this.b;
    }

    public abstract View getView();

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public int getVisibleHeight() {
        return ((LinearLayout.LayoutParams) this.a.getLayoutParams()).height;
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public boolean isRefreshHreader() {
        return this.b != 0;
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public void onMove(float f) {
        if (getVisibleHeight() > 0 || f > 0.0f) {
            setVisibleHeight(((int) f) + getVisibleHeight());
            if (this.b <= 1) {
                if (getVisibleHeight() > this.mMeasuredHeight) {
                    setState(1);
                } else {
                    setState(0);
                }
            }
        }
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public void refreshComplete() {
        setState(3);
        postDelayed(new a(), 200L);
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public boolean releaseAction() {
        boolean z;
        getVisibleHeight();
        if (getVisibleHeight() <= this.mMeasuredHeight || this.b >= 2) {
            z = false;
        } else {
            setState(2);
            z = true;
        }
        smoothScrollTo(this.b == 2 ? this.mMeasuredHeight : 0);
        return z;
    }

    public void reset() {
        smoothScrollTo(0);
        postDelayed(new b(), 500L);
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public void setArrowImageView(int i) {
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public void setProgressStyle(int i) {
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public void setState(int i) {
        if (i == this.b) {
            return;
        }
        this.b = i;
    }

    public void setVisibleHeight(int i) {
        if (i < 0) {
            i = 0;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.height = i;
        this.a.setLayoutParams(layoutParams);
    }

    public void smoothScrollTo(int i) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getVisibleHeight(), i);
        valueAnimatorOfInt.setDuration(300L).start();
        valueAnimatorOfInt.addUpdateListener(new c());
        valueAnimatorOfInt.start();
    }

    public BaseRefreshHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        a();
    }
}
