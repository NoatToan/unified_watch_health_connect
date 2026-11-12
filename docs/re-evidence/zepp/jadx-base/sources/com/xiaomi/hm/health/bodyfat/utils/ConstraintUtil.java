package com.xiaomi.hm.health.bodyfat.utils;

import android.transition.TransitionManager;
import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

/* JADX INFO: loaded from: classes19.dex */
public class ConstraintUtil {
    private ConstraintLayout a;
    private ConstraintBegin b;
    private ConstraintSet c = new ConstraintSet();
    private ConstraintSet d;

    public ConstraintUtil(ConstraintLayout constraintLayout) {
        ConstraintSet constraintSet = new ConstraintSet();
        this.d = constraintSet;
        this.a = constraintLayout;
        constraintSet.clone(constraintLayout);
    }

    public ConstraintBegin begin() {
        synchronized (ConstraintBegin.class) {
            if (this.b == null) {
                this.b = new ConstraintBegin();
            }
        }
        this.c.clone(this.a);
        return this.b;
    }

    public ConstraintBegin beginWithAnim() {
        TransitionManager.beginDelayedTransition(this.a);
        return begin();
    }

    public void reSet() {
        this.d.applyTo(this.a);
    }

    public void reSetWidthAnim() {
        TransitionManager.beginDelayedTransition(this.a);
        this.d.applyTo(this.a);
    }

    public class ConstraintBegin {
        public ConstraintBegin() {
        }

        public ConstraintBegin Bottom_toBottomOf(@IdRes int i, @IdRes int i2) {
            ConstraintUtil.this.c.connect(i, 4, i2, 4);
            return this;
        }

        public ConstraintBegin Bottom_toTopOf(@IdRes int i, @IdRes int i2) {
            ConstraintUtil.this.c.connect(i, 4, i2, 3);
            return this;
        }

        public ConstraintBegin Left_toLeftOf(@IdRes int i, @IdRes int i2) {
            ConstraintUtil.this.c.connect(i, 1, i2, 1);
            return this;
        }

        public ConstraintBegin Left_toRightOf(@IdRes int i, @IdRes int i2) {
            ConstraintUtil.this.c.connect(i, 1, i2, 2);
            return this;
        }

        public ConstraintBegin Right_toLeftOf(@IdRes int i, @IdRes int i2) {
            ConstraintUtil.this.c.connect(i, 2, i2, 1);
            return this;
        }

        public ConstraintBegin Right_toRightOf(@IdRes int i, @IdRes int i2) {
            ConstraintUtil.this.c.connect(i, 2, i2, 2);
            return this;
        }

        public ConstraintBegin Top_toBottomOf(@IdRes int i, @IdRes int i2) {
            ConstraintUtil.this.c.connect(i, 3, i2, 4);
            return this;
        }

        public ConstraintBegin Top_toTopOf(@IdRes int i, @IdRes int i2) {
            ConstraintUtil.this.c.connect(i, 3, i2, 3);
            return this;
        }

        public ConstraintBegin clear(@IdRes int... iArr) {
            for (int i : iArr) {
                ConstraintUtil.this.c.clear(i);
            }
            return this;
        }

        public void commit() {
            ConstraintUtil.this.c.applyTo(ConstraintUtil.this.a);
        }

        public ConstraintBegin setHeight(@IdRes int i, int i2) {
            ConstraintUtil.this.c.constrainHeight(i, i2);
            return this;
        }

        public ConstraintBegin setMargin(@IdRes int i, int i2, int i3, int i4, int i5) {
            setMarginLeft(i, i2);
            setMarginTop(i, i3);
            setMarginRight(i, i4);
            setMarginBottom(i, i5);
            return this;
        }

        public ConstraintBegin setMarginBottom(@IdRes int i, int i2) {
            ConstraintUtil.this.c.setMargin(i, 4, i2);
            return this;
        }

        public ConstraintBegin setMarginLeft(@IdRes int i, int i2) {
            ConstraintUtil.this.c.setMargin(i, 1, i2);
            return this;
        }

        public ConstraintBegin setMarginRight(@IdRes int i, int i2) {
            ConstraintUtil.this.c.setMargin(i, 2, i2);
            return this;
        }

        public ConstraintBegin setMarginTop(@IdRes int i, int i2) {
            ConstraintUtil.this.c.setMargin(i, 3, i2);
            return this;
        }

        public ConstraintBegin setWidth(@IdRes int i, int i2) {
            ConstraintUtil.this.c.constrainWidth(i, i2);
            return this;
        }

        public ConstraintBegin clear(int i, int i2) {
            ConstraintUtil.this.c.clear(i, i2);
            return this;
        }
    }
}
