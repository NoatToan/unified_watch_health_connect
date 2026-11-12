package com.xiaomi.fitness.widget.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.xiaomi.fitness.RTLUtil;
import com.xiaomi.fitness.widget.button.gesture.FGestureManager;
import defpackage.hm8;

/* JADX INFO: loaded from: classes10.dex */
public class SwitchButton extends BaseSwitchButton {
    public FGestureManager j;

    public class a extends FGestureManager.c {
        public a() {
        }

        @Override // com.xiaomi.fitness.widget.button.gesture.FGestureManager.c
        public void c(MotionEvent motionEvent) {
            SwitchButton.this.f((int) SwitchButton.this.getGestureManager().l().b());
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0075  */
        @Override // com.xiaomi.fitness.widget.button.gesture.FGestureManager.c
        public void d(VelocityTracker velocityTracker, MotionEvent motionEvent) {
            if (SwitchButton.this.j.h().b()) {
                return;
            }
            if (SwitchButton.this.getGestureManager().l().f(motionEvent, SwitchButton.this.getContext())) {
                SwitchButton switchButton = SwitchButton.this;
                switchButton.n(switchButton.d.j(), true);
                return;
            }
            if (SwitchButton.this.j.h().a()) {
                velocityTracker.computeCurrentVelocity(1000);
                int xVelocity = (int) velocityTracker.getXVelocity();
                int scaledMinimumFlingVelocity = ViewConfiguration.get(SwitchButton.this.getContext()).getScaledMinimumFlingVelocity() * 8;
                boolean zIsRtl = RTLUtil.INSTANCE.isRtl(SwitchButton.this.getContext());
                boolean z = false;
                if (Math.abs(xVelocity) <= scaledMinimumFlingVelocity) {
                    int leftNormal = (SwitchButton.this.getLeftNormal() + SwitchButton.this.getLeftChecked()) / 2;
                    int left = SwitchButton.this.getViewThumb().getLeft();
                    if (!zIsRtl ? left >= leftNormal : left <= leftNormal) {
                        z = true;
                    }
                } else if (!zIsRtl ? xVelocity > 0 : xVelocity < 0) {
                    z = true;
                }
                SwitchButton switchButton2 = SwitchButton.this;
                if (switchButton2.h) {
                    switchButton2.getDebugTag();
                    StringBuilder sb = new StringBuilder();
                    sb.append("onConsumeEventFinish checked:");
                    sb.append(z);
                }
                SwitchButton.this.i(z, true, true);
            }
        }

        @Override // com.xiaomi.fitness.widget.button.gesture.FGestureManager.c
        public void e(int i, int i2, int i3, int i4) {
            SwitchButton.this.f(i3 - i);
        }

        @Override // com.xiaomi.fitness.widget.button.gesture.FGestureManager.c
        public void f(FGestureManager.State state, FGestureManager.State state2) {
            int i = c.f13452a[state2.ordinal()];
            if (i == 1) {
                SwitchButton.this.setScrollState(ISwitchButton.ScrollState.Drag);
                return;
            }
            if (i == 2) {
                SwitchButton.this.setScrollState(ISwitchButton.ScrollState.Fling);
                androidx.core.view.c.h0(SwitchButton.this);
            } else {
                if (i != 3) {
                    return;
                }
                SwitchButton.this.setScrollState(ISwitchButton.ScrollState.Idle);
            }
        }

        @Override // com.xiaomi.fitness.widget.button.gesture.FGestureManager.c
        public boolean g(MotionEvent motionEvent) {
            boolean z = SwitchButton.this.j.k().b() || SwitchButton.this.s();
            SwitchButton switchButton = SwitchButton.this;
            if (switchButton.h) {
                switchButton.getDebugTag();
                StringBuilder sb = new StringBuilder();
                sb.append("shouldConsumeEvent:");
                sb.append(z);
            }
            return SwitchButton.this.isEnabled();
        }

        @Override // com.xiaomi.fitness.widget.button.gesture.FGestureManager.c
        public boolean h(MotionEvent motionEvent) {
            boolean zS;
            if (motionEvent.getAction() == 0) {
                zS = hm8.g(SwitchButton.this.getViewThumb(), (int) motionEvent.getX(), (int) motionEvent.getY());
            } else {
                zS = SwitchButton.this.s();
            }
            SwitchButton switchButton = SwitchButton.this;
            if (switchButton.h) {
                switchButton.getDebugTag();
                StringBuilder sb = new StringBuilder();
                sb.append("shouldInterceptEvent:");
                sb.append(zS);
            }
            return zS;
        }
    }

    public class b implements FGestureManager.f.a {
        public b() {
        }

        @Override // com.xiaomi.fitness.widget.button.gesture.FGestureManager.f.a
        public void a(boolean z) {
            hm8.i(SwitchButton.this, z);
        }

        @Override // com.xiaomi.fitness.widget.button.gesture.FGestureManager.f.a
        public void b(boolean z) {
            hm8.i(SwitchButton.this, z);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13452a;

        static {
            int[] iArr = new int[FGestureManager.State.values().length];
            f13452a = iArr;
            try {
                iArr[FGestureManager.State.Consume.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13452a[FGestureManager.State.Fling.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13452a[FGestureManager.State.Idle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FGestureManager getGestureManager() {
        if (this.j == null) {
            FGestureManager fGestureManager = new FGestureManager(this, new a());
            this.j = fGestureManager;
            fGestureManager.s(this.h);
            this.j.k().f(new b());
        }
        return this.j;
    }

    @Override // com.xiaomi.fitness.widget.button.BaseSwitchButton
    public void a() {
        getGestureManager().i().a();
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (getGestureManager().i().c()) {
            androidx.core.view.c.h0(this);
        }
    }

    @Override // com.xiaomi.fitness.widget.button.BaseSwitchButton
    public boolean d() {
        return getGestureManager().j() == FGestureManager.State.Idle;
    }

    @Override // com.xiaomi.fitness.widget.button.BaseSwitchButton
    public boolean i(boolean z, boolean z2, boolean z3) {
        getGestureManager().g();
        return super.i(z, z2, z3);
    }

    @Override // com.xiaomi.fitness.widget.button.BaseSwitchButton
    public boolean m(int i, int i2) {
        return getGestureManager().i().j(i, i2, -1);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return getGestureManager().p(motionEvent);
    }

    @Override // com.xiaomi.fitness.widget.button.BaseSwitchButton, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getGestureManager().i().k(getAvailableWidth());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return getGestureManager().q(motionEvent);
        }
        return true;
    }

    public final boolean s() {
        float fC = getGestureManager().l().c();
        if (fC != 0.0f && getGestureManager().l().a() < 30.0d) {
            return (isChecked() && (fC > 0.0f ? 1 : (fC == 0.0f ? 0 : -1)) < 0) || (!isChecked() && (fC > 0.0f ? 1 : (fC == 0.0f ? 0 : -1)) > 0);
        }
        return false;
    }

    @Override // com.xiaomi.fitness.widget.button.BaseSwitchButton
    public void setDebug(boolean z) {
        super.setDebug(z);
        FGestureManager fGestureManager = this.j;
        if (fGestureManager != null) {
            fGestureManager.s(z);
        }
    }
}
