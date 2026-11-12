package com.huawei.ui.commonui.floatview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes16.dex */
public class DragFloatActionButton extends HealthFloatingView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23505c;
    private int d;
    private boolean e;

    public DragFloatActionButton(Context context) {
        super(context);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    @Override // com.huawei.ui.commonui.floatview.FloatingSidingView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            setPressed(true);
            this.e = false;
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f23505c = rawX;
            this.f23503a = rawY;
            if (getParent() != null) {
                ViewGroup viewGroup = (ViewGroup) getParent();
                this.f23504b = viewGroup.getHeight();
                this.d = viewGroup.getWidth();
            }
            return true;
        }
        if (action == 1) {
            if (i()) {
                setPressed(false);
                l();
                return true;
            }
        } else if (action != 2) {
            if (action == 3) {
                if (i()) {
                    setPressed(false);
                    l();
                    return true;
                }
            }
        } else if (this.f23504b <= 0 || this.d <= 0) {
            this.e = false;
        } else {
            int i = rawX - this.f23505c;
            int i2 = rawY - this.f23503a;
            int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            if (Math.abs(scaledTouchSlop) < Math.abs(i) || Math.abs(scaledTouchSlop) < Math.abs(i2)) {
                this.e = true;
            }
            if (this.e) {
                c(getX() + i, getY() + i2);
                this.f23505c = rawX;
                this.f23503a = rawY;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    private void c(float f, float f2) {
        float width = ((float) (this.d - getWidth())) < f ? this.d - getWidth() : f;
        float y = getY();
        float height = getHeight();
        int i = this.f23504b;
        if (y + height > i) {
            f2 = i - getHeight();
        }
        if (0.0f > f) {
            width = 0.0f;
        }
        if (getY() < 0.0f) {
            f2 = 0.0f;
        }
        float f3 = 0.0f <= f2 ? f2 : 0.0f;
        float height2 = this.f23504b - getHeight();
        if (height2 < f3) {
            f3 = height2;
        }
        setX(width);
        setY(f3);
    }

    private boolean i() {
        return this.e;
    }

    private boolean k() {
        return getX() == 0.0f;
    }

    private boolean n() {
        return getX() == ((float) (this.d - getWidth()));
    }

    private void l() {
        if (k() && n()) {
            return;
        }
        if (LanguageUtil.ba(BaseApplication.b())) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "x", getX(), 0.0f);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.start();
            return;
        }
        animate().setInterpolator(new DecelerateInterpolator()).setDuration(500L).xBy((this.d - getWidth()) - getX()).start();
    }
}
