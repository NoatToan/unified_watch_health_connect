package com.xmlywind.sdk.base.views;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.Key;
import com.xmlywind.sdk.common.utils.o;

/* JADX INFO: loaded from: classes22.dex */
public class ShakeView extends RelativeLayout {
    private ImageView a;
    private TextView b;
    private TextView c;
    private ObjectAnimator d;
    private ObjectAnimator e;
    private View f;
    private boolean g;

    public ShakeView(Context context) {
        super(context);
        a(context);
    }

    public ShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ShakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a() {
        int i = this.a.getLayoutParams().height;
        this.a.setPivotX(this.a.getLayoutParams().width);
        this.a.setPivotY(i * 0.8f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.a, Key.ROTATION, 0.0f, 18.0f, 0.0f, -18.0f, 0.0f, 18.0f, 0.0f, -18.0f, 0.0f, 18.0f, 0.0f);
        this.d = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.d.addListener(new Animator.AnimatorListener() { // from class: com.xmlywind.sdk.base.views.ShakeView.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.xmlywind.sdk.base.views.ShakeView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ShakeView.this.g) {
                            return;
                        }
                        ShakeView.this.d.start();
                    }
                }, 300L);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        this.d.setDuration(1500L);
    }

    private void a(Context context) {
        View.inflate(context, b(context), this);
        this.a = (ImageView) findViewById(o.a(context, "sig_shakeImageView"));
        this.b = (TextView) findViewById(o.a(context, "sig_shakeTitleView"));
        this.c = (TextView) findViewById(o.a(context, "sig_shakeDescView"));
        this.f = findViewById(o.a(context, "sig_shake_view"));
        b();
        a();
    }

    private int b(Context context) {
        return o.b(context, "sig_shake_view_layout");
    }

    private void b() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f, "translationY", 0.0f, 30.0f, 0.0f, -30.0f, 0.0f);
        this.e = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.e.setRepeatCount(2);
        this.e.setDuration(400L);
    }

    public void a(int i) {
        ObjectAnimator objectAnimator;
        if (i != 1) {
            this.g = true;
            this.d.cancel();
            objectAnimator = this.e;
        } else {
            objectAnimator = this.d;
        }
        objectAnimator.start();
    }
}
