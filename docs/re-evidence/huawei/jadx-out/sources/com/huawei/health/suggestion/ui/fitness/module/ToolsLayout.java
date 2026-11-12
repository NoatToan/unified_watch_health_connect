package com.huawei.health.suggestion.ui.fitness.module;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qqp;

/* JADX INFO: loaded from: classes9.dex */
public class ToolsLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9419c;
    private MediaProgress d;
    private boolean e;
    private int f;
    private int g;

    private float a(int i, int i2, int i3) {
        if (i != 0) {
            return i2 - i3;
        }
        return 0.0f;
    }

    public ToolsLayout(Context context) {
        super(context);
        this.f9419c = 0;
        this.f9418b = true;
    }

    public ToolsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9419c = 0;
        this.f9418b = true;
    }

    public ToolsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9419c = 0;
        this.f9418b = true;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f = i;
        this.f9417a = i2;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.g = i;
        if (getChildCount() > 0) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (childAt instanceof TimeProgressPlus) {
                    LogUtil.j("Suggestion_ToolsLayout", "childAt instanceof TimeProgressPlus");
                    return;
                }
                if (!this.f9418b && childAt.getId() == R.id.sug_coach_iv_lock) {
                    childAt.setVisibility(i);
                } else if (bottom < qqp.a(getContext(), 136.0f)) {
                    a(childAt, a(i, 0, bottom));
                } else if (this.f9417a - top < qqp.a(getContext(), 136.0f)) {
                    d(childAt, top, i, 0.0f);
                } else if (right < qqp.a(getContext(), 136.0f)) {
                    d(childAt, a(i, 0, right));
                } else {
                    d(childAt, a(i, this.f, left));
                }
            }
        }
    }

    private void d(View view, int i, int i2, float f) {
        if ((view instanceof LinearLayout) && this.d == null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int childCount = linearLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                a(linearLayout, i3);
            }
        }
        int i4 = this.f9419c;
        LogUtil.a("Suggestion_ToolsLayout", "childAt:", view.getClass().getName());
        if (i2 != 0) {
            f = this.f9417a - (i + i4);
        }
        a(view, f);
    }

    private void a(LinearLayout linearLayout, int i) {
        View childAt = linearLayout.getChildAt(i);
        LogUtil.a("Suggestion_ToolsLayout", childAt.getClass().getName());
        if (childAt instanceof MediaProgress) {
            MediaProgress mediaProgress = (MediaProgress) childAt;
            this.d = mediaProgress;
            mediaProgress.setVisibility(0);
        }
        if (childAt instanceof LinearLayout) {
            this.f9419c = childAt.getTop();
        }
    }

    @Override // android.view.View
    public int getVisibility() {
        return this.g;
    }

    public void setIsShowBottomProgress(boolean z) {
        if (this.e == z || this.d == null) {
            return;
        }
        LogUtil.a("Suggestion_ToolsLayout", "isShowBottomProgress:", Boolean.valueOf(z));
        this.e = z;
        if (z && this.g != 0) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(4);
        }
    }

    private void a(View view, float f) {
        view.animate().translationY(f).setDuration(300L).setListener(new AnimatorListenerAdapter() { // from class: com.huawei.health.suggestion.ui.fitness.module.ToolsLayout.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                if (ToolsLayout.this.d != null) {
                    ToolsLayout.this.d.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!ToolsLayout.this.e || ToolsLayout.this.d == null) {
                    return;
                }
                if (ToolsLayout.this.g == 0) {
                    ToolsLayout.this.d.setVisibility(4);
                } else {
                    ToolsLayout.this.d.setVisibility(0);
                }
            }
        }).start();
    }

    private void d(View view, float f) {
        view.animate().translationX(f).setDuration(300L).start();
    }

    public void setIsShowLockAnim(boolean z) {
        this.f9418b = z;
    }
}
