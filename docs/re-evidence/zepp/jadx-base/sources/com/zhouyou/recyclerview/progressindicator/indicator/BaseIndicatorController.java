package com.zhouyou.recyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BaseIndicatorController {
    private View a;
    private List<Animator> b;

    public enum AnimStatus {
        START,
        END,
        CANCEL
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AnimStatus.values().length];
            a = iArr;
            try {
                iArr[AnimStatus.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AnimStatus.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AnimStatus.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public abstract List<Animator> createAnimation();

    public abstract void draw(Canvas canvas, Paint paint);

    public int getHeight() {
        return this.a.getHeight();
    }

    public View getTarget() {
        return this.a;
    }

    public int getWidth() {
        return this.a.getWidth();
    }

    public void initAnimation() {
        this.b = createAnimation();
    }

    public void postInvalidate() {
        this.a.postInvalidate();
    }

    public void setAnimationStatus(AnimStatus animStatus) {
        List<Animator> list = this.b;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = this.b.get(i);
            boolean zIsRunning = animator.isRunning();
            int i2 = a.a[animStatus.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3 && zIsRunning) {
                        animator.cancel();
                    }
                } else if (zIsRunning) {
                    animator.end();
                }
            } else if (!zIsRunning) {
                animator.start();
            }
        }
    }

    public void setTarget(View view) {
        this.a = view;
    }
}
