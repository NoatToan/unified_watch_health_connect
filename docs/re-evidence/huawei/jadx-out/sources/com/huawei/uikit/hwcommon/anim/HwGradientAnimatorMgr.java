package com.huawei.uikit.hwcommon.anim;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Pair;
import com.huawei.uikit.hwcommon.drawable.HwDrawableWrapper;
import defpackage.xee;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes44.dex */
public class HwGradientAnimatorMgr implements HwDrawableWrapper.OnStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animator f29358a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnAnimatorListener f29359c;
    private Map<String, Pair<Integer, Integer>> d = new HashMap(16);

    public interface OnAnimatorListener {
        void onAnimationCancel(Animator animator, String str);

        void onAnimationEnd(Animator animator, String str);

        void onAnimationStart(Animator animator, String str);

        void onAnimationUpdate(Animator animator, String str, int i);

        boolean onPrepareAnimation(int[] iArr, int[] iArr2, int i, int i2, Map<String, Pair<Integer, Integer>> map);
    }

    class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (HwGradientAnimatorMgr.this.f29359c != null) {
                Iterator it = HwGradientAnimatorMgr.this.d.keySet().iterator();
                while (it.hasNext()) {
                    HwGradientAnimatorMgr.this.f29359c.onAnimationCancel(animator, (String) it.next());
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (HwGradientAnimatorMgr.this.f29359c != null) {
                Iterator it = HwGradientAnimatorMgr.this.d.keySet().iterator();
                while (it.hasNext()) {
                    HwGradientAnimatorMgr.this.f29359c.onAnimationEnd(animator, (String) it.next());
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (HwGradientAnimatorMgr.this.f29359c != null) {
                Iterator it = HwGradientAnimatorMgr.this.d.keySet().iterator();
                while (it.hasNext()) {
                    HwGradientAnimatorMgr.this.f29359c.onAnimationStart(animator, (String) it.next());
                }
            }
        }
    }

    public Animator e(Map<String, Pair<Integer, Integer>> map) {
        this.d = map;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "GradientValue", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(xee.d());
        objectAnimatorOfFloat.setDuration(50L);
        objectAnimatorOfFloat.addListener(new a());
        return objectAnimatorOfFloat;
    }

    @Override // com.huawei.uikit.hwcommon.drawable.HwDrawableWrapper.OnStateChangedListener
    public void onStateChanged(int[] iArr, int[] iArr2, int i, int i2) {
        if (this.f29359c == null || iArr == null || iArr2 == null) {
            return;
        }
        HashMap map = new HashMap(16);
        if (this.f29359c.onPrepareAnimation(iArr, iArr2, i, i2, map)) {
            Animator animator = this.f29358a;
            if (animator != null && animator.isRunning()) {
                this.f29358a.cancel();
            }
            Animator animatorE = e(map);
            this.f29358a = animatorE;
            animatorE.start();
        }
    }
}
