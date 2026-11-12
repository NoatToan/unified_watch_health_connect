package com.huawei.openalliance.ad.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.gx;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;

/* JADX INFO: loaded from: classes12.dex */
public class PPSSplashProView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f21026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ScanningRelativeLayout f21027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21028c;
    private TextView d;
    private ImageView e;
    private boolean f;
    private int g;
    private RoundLinearLayout h;
    private AnimatorSet i;
    private AnimatorSet j;
    private AnimatorSet k;
    private AnimatorSet l;
    private AnimatorSet m;
    private AnimatorSet n;

    public void setOrientation(int i) {
        this.g = i;
    }

    public void setMode(int i) {
        this.f21028c = i;
    }

    public void setDesc(String str) {
        if (this.d != null) {
            if (TextUtils.isEmpty(str)) {
                this.d.setText(R.string.hiad_splash_pro_desc);
            } else {
                this.d.setText(str);
            }
        }
    }

    public int getMode() {
        return this.f21028c;
    }

    public void a(boolean z, int i) {
        this.f = z;
        if (this.f21027b != null && i == 0) {
            RoundLinearLayout roundLinearLayout = this.h;
            if (roundLinearLayout != null) {
                roundLinearLayout.setBackground(getResources().getDrawable(R.drawable.hiad_splash_pro_bg_scan));
                this.h.setAlpha(0.0f);
            }
            this.f21027b.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.huawei.openalliance.ad.views.PPSSplashProView.2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    if (i4 - i2 <= 0 || i5 - i3 <= 0 || i6 != 0 || i8 != 0) {
                        return;
                    }
                    PPSSplashProView.this.d();
                }
            });
        }
        c();
    }

    public void a() {
        ScanningRelativeLayout scanningRelativeLayout = this.f21027b;
        if (scanningRelativeLayout != null) {
            scanningRelativeLayout.a();
        }
        AnimatorSet animatorSet = this.j;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.j = null;
        }
        AnimatorSet animatorSet2 = this.i;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.i = null;
        }
        AnimatorSet animatorSet3 = this.k;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.k = null;
        }
        AnimatorSet animatorSet4 = this.l;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
            this.l = null;
        }
        AnimatorSet animatorSet5 = this.m;
        if (animatorSet5 != null) {
            animatorSet5.cancel();
            this.m = null;
        }
        AnimatorSet animatorSet6 = this.n;
        if (animatorSet6 != null) {
            animatorSet6.cancel();
            this.n = null;
        }
    }

    private void e() {
        this.k = new AnimatorSet();
        this.l = new AnimatorSet();
        this.m = new AnimatorSet();
        this.n = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.e, "scaleX", 1.0f, 1.225f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.e, "scaleY", 1.0f, 1.225f);
        objectAnimatorOfFloat.setDuration(350L);
        objectAnimatorOfFloat2.setDuration(350L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.e, "scaleX", 1.225f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.e, "scaleY", 1.225f, 1.0f);
        objectAnimatorOfFloat3.setDuration(500L);
        objectAnimatorOfFloat4.setDuration(500L);
        this.m.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat3);
        this.n.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat4);
        this.m.setInterpolator(new gx(0.2f, 0.0f, 0.2f, 1.0f));
        this.n.setInterpolator(new gx(0.2f, 0.0f, 0.2f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.e, "scaleX", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.e, "scaleY", 1.0f, 0.0f);
        objectAnimatorOfFloat5.setDuration(0L);
        objectAnimatorOfFloat6.setDuration(0L);
        objectAnimatorOfFloat5.addListener(new Animator.AnimatorListener() { // from class: com.huawei.openalliance.ad.views.PPSSplashProView.5
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
                try {
                    PPSSplashProView.this.e.setVisibility(0);
                } catch (Throwable th) {
                    hw.c("PPSSplashProView", "arrowImage set visible err: %s", th.getClass().getSimpleName());
                }
            }
        });
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.e, "scaleX", 0.0f, 1.225f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.e, "scaleY", 0.0f, 1.225f);
        objectAnimatorOfFloat7.setDuration(400L);
        objectAnimatorOfFloat8.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.e, "scaleX", 1.225f, 0.989f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.e, "scaleY", 1.225f, 0.989f);
        objectAnimatorOfFloat9.setDuration(500L);
        objectAnimatorOfFloat10.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(this.e, "scaleX", 0.989f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(this.e, "scaleY", 0.989f, 1.0f);
        objectAnimatorOfFloat11.setDuration(350L);
        objectAnimatorOfFloat12.setDuration(350L);
        this.k.playSequentially(objectAnimatorOfFloat5, objectAnimatorOfFloat7, objectAnimatorOfFloat9, objectAnimatorOfFloat11);
        this.l.playSequentially(objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat10, objectAnimatorOfFloat12);
        this.k.setInterpolator(new gx(0.2f, 0.0f, 0.2f, 1.0f));
        this.l.setInterpolator(new gx(0.2f, 0.0f, 0.2f, 1.0f));
        this.k.addListener(new Animator.AnimatorListener() { // from class: com.huawei.openalliance.ad.views.PPSSplashProView.6
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
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSSplashProView.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (PPSSplashProView.this.m == null || PPSSplashProView.this.n == null) {
                            return;
                        }
                        PPSSplashProView.this.m.start();
                        PPSSplashProView.this.n.start();
                    }
                }, 450L);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        hw.b("PPSSplashProView", "startAnimators");
        try {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.h, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f21027b, "scaleX", 0.85f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f21027b, "scaleY", 0.85f, 1.0f);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat3.setDuration(300L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.i = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat);
            this.i.setInterpolator(new gx(0.2f, 0.0f, 0.2f, 1.0f));
            this.i.addListener(new Animator.AnimatorListener() { // from class: com.huawei.openalliance.ad.views.PPSSplashProView.3
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    try {
                        PPSSplashProView.this.f21027b.c();
                    } catch (Throwable th) {
                        hw.c("PPSSplashProView", "prepare err: %s", th.getClass().getSimpleName());
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    hw.b("PPSSplashProView", "upAndAlphaSet onAnimationEnd");
                    try {
                        PPSSplashProView.this.f21027b.d();
                        if (PPSSplashProView.this.k == null || PPSSplashProView.this.l == null) {
                            return;
                        }
                        PPSSplashProView.this.k.start();
                        PPSSplashProView.this.l.start();
                    } catch (Throwable th) {
                        hw.c("PPSSplashProView", "scale err: %s", th.getClass().getSimpleName());
                    }
                }
            });
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f21027b, "scaleX", 1.0f, 0.85f);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f21027b, "scaleY", 1.0f, 0.85f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.j = animatorSet2;
            animatorSet2.setDuration(0L);
            this.j.setInterpolator(new gx(0.2f, 0.0f, 0.2f, 1.0f));
            this.j.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat5);
            this.j.addListener(new Animator.AnimatorListener() { // from class: com.huawei.openalliance.ad.views.PPSSplashProView.4
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
                    hw.b("PPSSplashProView", "scaleAnimationDown onAnimationEnd");
                    try {
                        PPSSplashProView.this.setVisibility(0);
                        if (PPSSplashProView.this.i != null) {
                            PPSSplashProView.this.i.start();
                        }
                    } catch (Throwable th) {
                        hw.c("PPSSplashProView", "up and alpha err: %s", th.getClass().getSimpleName());
                    }
                }
            });
            this.e.setVisibility(4);
            e();
            this.j.start();
        } catch (Throwable th) {
            hw.c("PPSSplashProView", "anim error: %s", th.getClass().getSimpleName());
            RoundLinearLayout roundLinearLayout = this.h;
            if (roundLinearLayout != null) {
                roundLinearLayout.setBackground(getResources().getDrawable(R.drawable.hiad_splash_pro_bg_scan));
            }
            setVisibility(0);
        }
    }

    private void c() {
        hw.b("PPSSplashProView", "showLogo:" + this.f + ",orientation:" + this.g);
        b();
    }

    private void b() {
        TextView textView;
        float fO;
        Context applicationContext = getContext().getApplicationContext();
        gk gkVarB = fp.b(applicationContext);
        int iA = as.a(applicationContext, gkVarB.N());
        int iP = gkVarB.P();
        int iA2 = as.a(applicationContext, gkVarB.O());
        final int iA3 = as.a(applicationContext, gkVarB.a(applicationContext));
        this.f21027b.setRadius(iP);
        this.h.setRectCornerRadius(as.a(applicationContext, iP));
        this.f21027b.setMinimumHeight(iA);
        int i = 2;
        if (as.n(getContext())) {
            textView = this.d;
            fO = gkVarB.O() * 2;
            i = 1;
        } else {
            textView = this.d;
            fO = gkVarB.O();
        }
        textView.setTextSize(i, fO);
        this.d.setMinimumHeight(iA);
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        layoutParams.height = iA2;
        layoutParams.width = iA2;
        this.e.setLayoutParams(layoutParams);
        this.f21026a.post(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSSplashProView.1
            @Override // java.lang.Runnable
            public void run() {
                ViewGroup.LayoutParams layoutParams2 = PPSSplashProView.this.getLayoutParams();
                if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                    layoutParams3.bottomMargin = (PPSSplashProView.this.f || PPSSplashProView.this.g != 1) ? iA3 : iA3 + dk.f(PPSSplashProView.this.getContext());
                    PPSSplashProView.this.setLayoutParams(layoutParams3);
                }
            }
        });
    }

    private void a(Context context) {
        String str;
        hw.b("PPSSplashProView", "init");
        try {
            View viewInflate = inflate(context, R.layout.hiad_layout_splash_pro, this);
            this.f21026a = viewInflate;
            this.f21027b = (ScanningRelativeLayout) viewInflate.findViewById(R.id.hiad_pro_layout);
            this.h = (RoundLinearLayout) this.f21026a.findViewById(R.id.hiad_pro_desc_layout);
            this.f21027b.setBackground(getResources().getDrawable(R.drawable.hiad_splash_pro_bg));
            this.d = (TextView) this.f21026a.findViewById(R.id.hiad_pro_desc);
            this.e = (ImageView) this.f21026a.findViewById(R.id.hiad_pro_arrow);
        } catch (RuntimeException unused) {
            str = "init RuntimeException";
            hw.c("PPSSplashProView", str);
        } catch (Exception unused2) {
            str = "init error";
            hw.c("PPSSplashProView", str);
        }
    }

    public PPSSplashProView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21028c = 2;
        this.g = 1;
        a(context);
    }

    public PPSSplashProView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21028c = 2;
        this.g = 1;
        a(context);
    }

    public PPSSplashProView(Context context) {
        super(context);
        this.f21028c = 2;
        this.g = 1;
        a(context);
    }
}
