package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public class jtf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f39007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f39008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SecureRandom f39009c = new SecureRandom();
    private PointF d;
    private final float e;
    private float f;
    private final float g;
    private float h;
    private PointF j;

    public jtf(ImageView imageView, PointF pointF) {
        imageView.setVisibility(4);
        this.f39007a = imageView;
        this.d = pointF;
        this.f39008b = 0.0f;
        this.g = d(0.2f, 1.0f);
        float fD = d(0.4f, 1.6f);
        this.e = fD;
        this.h = fD * 0.4f;
        this.f = d(0.0f, 360.0f);
        int i = qrs.i(imageView.getContext()) / 2;
        this.j = d(d(i - 250, i + 250), pointF, d(0.1f, 6.27f));
        imageView.setAlpha(this.f39008b);
        imageView.setRotation(this.f);
    }

    private PointF d(double d, PointF pointF, double d2) {
        PointF pointF2 = new PointF();
        float fCos = (float) (((double) pointF.x) + (Math.cos(d2) * d));
        float fSin = (float) (((double) pointF.y) + (d * Math.sin(d2)));
        pointF2.x = fCos;
        pointF2.y = fSin;
        return pointF2;
    }

    private float d(float f, float f2) {
        return (this.f39009c.nextFloat() * (f2 - f)) + f;
    }

    private int b() {
        return this.f39009c.nextInt(400) + 2800;
    }

    public void c() {
        final long jB = b();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f39007a, "alpha", this.f39008b, this.g);
        objectAnimatorOfFloat.setDuration(jB / 4);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f39007a, "alpha", this.g, this.f39008b);
        objectAnimatorOfFloat2.setDuration((3 * jB) / 4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f39007a, "scaleX", this.e, this.h);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f39007a, "scaleY", this.e, this.h);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(jB);
        animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        AnimatorSet animatorSet3 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f39007a, "x", this.d.x, this.j.x);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f39007a, "y", this.d.y, this.j.y);
        animatorSet3.setDuration(jB);
        animatorSet3.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(animatorSet3, animatorSet2, animatorSet);
        animatorSet4.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        animatorSet4.addListener(new AnimatorListenerAdapter() { // from class: jtf.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                jtf.this.f39007a.setVisibility(0);
                jtf.this.f39007a.animate().rotationBy(180.0f).setDuration(jB).start();
            }
        });
        animatorSet4.start();
    }
}
