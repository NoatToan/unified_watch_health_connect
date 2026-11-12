package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class f extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animation f21183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Animation f21184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Animation f21185c;
    private Animation d;
    private ImageView e;
    private ImageView f;

    public void a() {
        a(this.f21184b);
        a(this.f21183a);
        a(this.d);
        a(this.f21185c);
        setVisibility(8);
    }

    private void b(Context context) {
        this.f21183a = AnimationUtils.loadAnimation(context, R.anim.hiad_masking_hand_zoom_in);
        this.f21184b = AnimationUtils.loadAnimation(context, R.anim.hiad_masking_hand_zoom_out);
        this.f21183a.setDuration(400L);
        this.f21184b.setDuration(400L);
        this.f21183a.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.openalliance.ad.views.f.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (f.this.e != null) {
                    f.this.e.startAnimation(f.this.f21184b);
                }
            }
        });
        this.f21184b.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.openalliance.ad.views.f.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (f.this.f != null) {
                    f.this.f.startAnimation(f.this.f21185c);
                }
            }
        });
        this.f21185c = AnimationUtils.loadAnimation(context, R.anim.haid_masking_arc_zoom_in);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.haid_masking_fade_out);
        this.d = animationLoadAnimation;
        animationLoadAnimation.setDuration(400L);
        this.f21185c.setDuration(400L);
        this.f21185c.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.openalliance.ad.views.f.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                if (f.this.f != null) {
                    f.this.f.setVisibility(0);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (f.this.f != null) {
                    f.this.f.startAnimation(f.this.d);
                }
                if (f.this.e != null) {
                    f.this.e.startAnimation(f.this.f21183a);
                }
            }
        });
        this.d.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.openalliance.ad.views.f.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (f.this.f != null) {
                    f.this.f.setVisibility(4);
                }
            }
        });
    }

    private void a(Animation animation) {
        if (animation != null) {
            animation.cancel();
        }
    }

    private void a(Context context) {
        hw.b("MaskingView", "init");
        inflate(context, R.layout.pps_masking_view, this);
        this.e = (ImageView) findViewById(R.id.hiad_click_hand);
        this.f = (ImageView) findViewById(R.id.hiad_click_arc);
        b(context);
        this.e.startAnimation(this.f21184b);
    }

    public f(Context context) {
        super(context);
        a(context);
    }
}
