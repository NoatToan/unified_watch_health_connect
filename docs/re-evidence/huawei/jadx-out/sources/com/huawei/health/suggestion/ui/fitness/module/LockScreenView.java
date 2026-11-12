package com.huawei.health.suggestion.ui.fitness.module;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.customview.widget.ViewDragHelper;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqp;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes31.dex */
public class LockScreenView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewDragHelper f9379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f9380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9381c;
    private Point d;
    private OnSlidingListener e;

    public LockScreenView(Context context) {
        super(context);
        c(context);
    }

    public LockScreenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    public LockScreenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context);
    }

    private void c(Context context) {
        HealthTextView healthTextView = new HealthTextView(context);
        this.f9380b = healthTextView;
        healthTextView.setLockText(true);
        addView(this.f9380b);
        if (!(this.f9380b.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            LogUtil.j("Suggestion_LockScreenView", "mDragView.getLayoutParams() not instanceof LayoutParams");
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9380b.getLayoutParams();
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        int dimension = (int) getResources().getDimension(LanguageUtil.f(context) ? R.dimen.sug_locktext_padleft : R.dimen.health_common_60dp);
        layoutParams.bottomMargin = dimension;
        this.f9380b.setText(getResources().getString(R.string.sug_finess_hdjs));
        this.f9380b.setPadding(qqp.a(context, 200.0f), dimension, qqp.a(context, 200.0f), (int) getResources().getDimension(R.dimen.sug_locktext_padbutton));
        this.f9380b.setTextSize(0, getResources().getDimension(R.dimen.sug_locktext_size));
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f9379a = ViewDragHelper.create(this, new ViewDragHelper.Callback() { // from class: com.huawei.health.suggestion.ui.fitness.module.LockScreenView.5
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                return true;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                int iMin = Math.min(Math.max(i, (LockScreenView.this.getPaddingLeft() - LockScreenView.this.f9380b.getPaddingLeft()) + 10), ((LockScreenView.this.getWidth() - LockScreenView.this.f9380b.getWidth()) + LockScreenView.this.f9380b.getPaddingRight()) - 10);
                LockScreenView lockScreenView = LockScreenView.this;
                lockScreenView.setAlpha(1.0f - Math.abs(((iMin - lockScreenView.d.x) * 1.0f) / LockScreenView.this.d.x));
                return iMin;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i, int i2) {
                return LockScreenView.this.f9380b.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                LogUtil.a("LockScreenView", "--Math.abs(mDragView.getLeft() - mAutoBackPoint.x): ", Integer.valueOf(Math.abs(LockScreenView.this.f9380b.getLeft() - LockScreenView.this.d.x)), "--", Integer.valueOf((LockScreenView.this.f9381c / 4) - ((LockScreenView.this.f9380b.getWidth() - (LockScreenView.this.f9380b.getPaddingLeft() * 2)) / 2)));
                if (Math.abs(LockScreenView.this.f9380b.getLeft() - LockScreenView.this.d.x) < (LockScreenView.this.f9381c / 4) - ((LockScreenView.this.f9380b.getWidth() - (LockScreenView.this.f9380b.getPaddingLeft() * 2)) / 2)) {
                    LockScreenView.this.f9379a.settleCapturedViewAt(LockScreenView.this.d.x, LockScreenView.this.d.y);
                } else if (LockScreenView.this.d.x < LockScreenView.this.f9380b.getLeft()) {
                    ViewDragHelper viewDragHelper = LockScreenView.this.f9379a;
                    int i = LockScreenView.this.f9381c;
                    int width = LockScreenView.this.f9380b.getWidth();
                    viewDragHelper.settleCapturedViewAt((i - width) + LockScreenView.this.f9380b.getPaddingLeft(), LockScreenView.this.d.y);
                } else {
                    LockScreenView.this.f9379a.settleCapturedViewAt(-LockScreenView.this.f9380b.getPaddingLeft(), LockScreenView.this.d.y);
                }
                LockScreenView.this.postInvalidate();
            }
        });
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f9381c = i;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Point point = new Point(this.f9380b.getLeft(), this.f9380b.getTop());
        this.d = point;
        LogUtil.a("LockScreenView", "mAutoBackPoint.x:", Integer.valueOf(point.x));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f9379a.shouldInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f9379a.processTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f9379a.continueSettling(true)) {
            postInvalidate();
            setAlpha(1.0f - Math.abs(((Math.min(Math.max(this.f9380b.getLeft(), getPaddingLeft() - this.f9380b.getPaddingLeft()), (getWidth() - this.f9380b.getWidth()) + this.f9380b.getPaddingRight()) - this.d.x) * 1.0f) / this.d.x));
            OnSlidingListener onSlidingListener = this.e;
            if (onSlidingListener != null) {
                onSlidingListener.onSliding(this.f9380b.getLeft());
                if (this.f9380b.getLeft() == (this.f9381c - this.f9380b.getWidth()) + this.f9380b.getPaddingLeft() || this.f9380b.getLeft() == (-this.f9380b.getPaddingLeft())) {
                    this.e.onSlidingFinish(true);
                }
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            setAlpha(1.0f);
        }
    }
}
