package com.huawei.ui.commonui.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.UnitUtil;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes16.dex */
public class KakaClaimAnimation extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f23987a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f23988c;
    private AnimationDrawable d;
    private AnimatorSet e;

    public KakaClaimAnimation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
    }

    private void c(AttributeSet attributeSet) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.kaka_claim_animation_layout, this);
        this.f23988c = (ImageView) viewInflate.findViewById(R.id.kaka_convert_anim);
        this.f23987a = (HealthTextView) viewInflate.findViewById(R.id.kaka_exchange_result);
        this.d = (AnimationDrawable) this.f23988c.getDrawable();
    }

    private void c(int i) {
        this.f23987a.setText(Marker.ANY_NON_NULL_MARKER + UnitUtil.e(i, 1, 0));
        AnimationDrawable animationDrawable = this.d;
        if (animationDrawable == null) {
            LogUtil.j("KakaClaimAnimation", "showExchangeResultAnimation mKakaConvertAnim is null");
            return;
        }
        animationDrawable.stop();
        if (this.e == null) {
            d();
        }
        this.e.start();
        this.d.start();
    }

    private void d() {
        ObjectAnimator objectAnimatorA = a("alpha", 0.0f, 1.0f, 800L);
        ObjectAnimator objectAnimatorA2 = a("scaleX", 0.8f, 1.0f, 800L);
        ObjectAnimator objectAnimatorA3 = a("scaleY", 0.8f, 1.0f, 800L);
        ObjectAnimator objectAnimatorA4 = a("alpha", 1.0f, 0.0f, 800L);
        ObjectAnimator objectAnimatorA5 = a("scaleX", 1.0f, 1.0f, 800L);
        ObjectAnimator objectAnimatorA6 = a("scaleY", 1.0f, 1.0f, 800L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.e = animatorSet;
        animatorSet.play(objectAnimatorA).with(objectAnimatorA2).with(objectAnimatorA3);
        this.e.play(objectAnimatorA4).with(objectAnimatorA5).with(objectAnimatorA6).after(objectAnimatorA);
        this.e.addListener(getAnimatorListener());
    }

    private ObjectAnimator a(String str, float f, float f2, long j) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f23987a, str, f, f2);
        objectAnimatorOfFloat.setDuration(j);
        return objectAnimatorOfFloat;
    }

    private Animator.AnimatorListener getAnimatorListener() {
        return new Animator.AnimatorListener() { // from class: com.huawei.ui.commonui.view.KakaClaimAnimation.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                LogUtil.a("KakaClaimAnimation", "showExchangeResultAnimation end");
                KakaClaimAnimation.this.setVisibility(8);
            }
        };
    }

    public void e(int i) {
        setVisibility(0);
        c(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimationDrawable animationDrawable = this.d;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
