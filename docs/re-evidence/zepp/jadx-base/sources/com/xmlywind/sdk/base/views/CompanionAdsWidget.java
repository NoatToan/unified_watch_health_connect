package com.xmlywind.sdk.base.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.volley.s;
import com.xmlywind.volley.toolbox.k;

/* JADX INFO: loaded from: classes22.dex */
public class CompanionAdsWidget extends RelativeLayout {
    public int a;
    private final ImageView b;
    private final TextView c;
    private final TextView d;
    private final int e;
    private TextView f;
    private TextView g;
    private FiveStarView h;
    private k.c i;
    private CompanionAdsWidget j;
    private int k;
    private boolean l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private LinearLayout r;
    private BaseAdUnit s;

    public CompanionAdsWidget(Context context, BaseAdUnit baseAdUnit, String str, String str2, float f, String str3, int i, int i2, String str4, int i3, int i4, int i5, int i6, int i7, float f2) {
        super(context);
        this.j = null;
        this.k = 0;
        this.a = com.xmlywind.sdk.common.utils.c.c(f2, context);
        this.n = com.xmlywind.sdk.common.utils.c.c(10.0f, context);
        this.s = baseAdUnit;
        this.k = i;
        this.e = i2;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setText(str);
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(-16777216);
        textView.setSingleLine();
        textView.setTypeface(Typeface.defaultFromStyle(0));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        textView.setId(com.xmlywind.sdk.common.a.r());
        textView.setPadding(this.n / 6, 0, 0, 0);
        this.m = i5;
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(i4);
        textView2.setGravity(17);
        textView.setSingleLine();
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(str2);
        int iC = com.xmlywind.sdk.common.utils.c.c(5.0f, context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i3);
        gradientDrawable.setCornerRadius(iC * 6);
        CircleImageView circleImageView = new CircleImageView(context);
        this.b = circleImageView;
        circleImageView.setScaleType(ImageView.ScaleType.FIT_START);
        circleImageView.setId(com.xmlywind.sdk.common.a.r());
        circleImageView.b = false;
        float f3 = iC * 2;
        circleImageView.a = f3;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 16) {
            textView2.setBackground(gradientDrawable);
        } else {
            textView2.setBackgroundDrawable(gradientDrawable);
        }
        textView2.setId(com.xmlywind.sdk.common.a.r());
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f3);
        gradientDrawable2.setColor(i6);
        gradientDrawable2.setAlpha(i7);
        if (i8 >= 16) {
            setBackground(gradientDrawable2);
        } else {
            setBackgroundDrawable(gradientDrawable2);
        }
        this.j = this;
        if (i2 == 1) {
            a(context, f);
        } else {
            a(context, str3);
        }
        if (baseAdUnit.getMaterial() != null && baseAdUnit.getMaterial().ad_privacy != null) {
            a(context);
        }
        setupUILayout(context);
        circleImageView.setVisibility(4);
        a(str4);
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        int i = this.k;
        if (i == 1) {
            d();
        } else if (i == 2 || i != 3) {
            g();
        } else {
            e();
        }
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    private void d() {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.5f, 0.95f);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.6f, 0.9f);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.7f, 1.0f);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.8f, 0.95f);
        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("scaleX", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6), PropertyValuesHolder.ofKeyframe("scaleY", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6));
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        e();
        this.q = true;
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.xmlywind.sdk.base.views.CompanionAdsWidget.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                CompanionAdsWidget.this.p = false;
                CompanionAdsWidget.this.q = false;
                CompanionAdsWidget.this.j.clearAnimation();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                CompanionAdsWidget.this.p = false;
                CompanionAdsWidget.this.q = false;
                CompanionAdsWidget.this.j.clearAnimation();
            }
        });
        objectAnimatorOfPropertyValuesHolder.start();
    }

    private void e() {
        this.o = true;
        super.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        super.setVisibility(4);
    }

    private void g() {
        SigmobLog.d("startDownToUpAnimator");
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
        translateAnimation.setInterpolator(new LinearInterpolator());
        translateAnimation.setDuration(500L);
        e();
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.xmlywind.sdk.base.views.CompanionAdsWidget.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                CompanionAdsWidget.this.p = false;
                CompanionAdsWidget.this.j.clearAnimation();
                SigmobLog.d("startDownToUpAnimator end");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        this.j.startAnimation(translateAnimation);
    }

    private void h() {
        SigmobLog.d("startUpToDownAnimator");
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, 1.0f);
        translateAnimation.setInterpolator(new LinearInterpolator());
        translateAnimation.setDuration(500L);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.xmlywind.sdk.base.views.CompanionAdsWidget.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                CompanionAdsWidget.this.p = true;
                CompanionAdsWidget.this.j.clearAnimation();
                CompanionAdsWidget.this.f();
                SigmobLog.d("startUpToDownAnimator end");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        this.j.startAnimation(translateAnimation);
    }

    private void setupUILayout(Context context) {
        int iC = com.xmlywind.sdk.common.utils.c.c(60.0f, context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iC, iC);
        layoutParams.addRule(15);
        int i = this.n;
        layoutParams.setMargins(i, i / 4, 0, 0);
        addView(this.b, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, (int) (iC / 1.8f));
        layoutParams2.setMargins(0, 0, this.n, 0);
        layoutParams2.addRule(15);
        layoutParams2.addRule(11);
        TextView textView = this.c;
        int i2 = this.n;
        textView.setPadding(i2, 0, i2, 0);
        addView(this.c, layoutParams2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(this.n / 2, 0, 0, 0);
        layoutParams3.addRule(15);
        layoutParams3.addRule(1, this.b.getId());
        layoutParams3.addRule(0, this.c.getId());
        addView(linearLayout, layoutParams3);
        linearLayout.addView(this.d, new RelativeLayout.LayoutParams(-2, -2));
        if (this.f != null) {
            RelativeLayout relativeLayout = new RelativeLayout(context);
            relativeLayout.addView(this.f, new RelativeLayout.LayoutParams(-2, -2));
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(1, this.f.getId());
            layoutParams4.addRule(6, this.f.getId());
            layoutParams4.addRule(8, this.f.getId());
            relativeLayout.addView(this.h, layoutParams4);
            linearLayout.addView(relativeLayout, new RelativeLayout.LayoutParams(-2, -2));
        } else if (this.g != null) {
            linearLayout.addView(this.g, new RelativeLayout.LayoutParams(-2, -2));
        }
        if (this.r != null) {
            linearLayout.addView(this.r, new RelativeLayout.LayoutParams(-2, -2));
        }
    }

    public void a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.r = linearLayout;
        linearLayout.setOrientation(0);
        this.r.setId(com.xmlywind.sdk.common.a.r());
        int iC = com.xmlywind.sdk.common.utils.c.c(5.0f, context);
        String[] strArr = {"权限", "开发者", "版本", "隐私协议"};
        for (int i = 0; i < 4; i++) {
            TextView textView = new TextView(context);
            textView.setTextSize(1, 10.0f);
            textView.setText(strArr[i]);
            textView.setTextColor(-7829368);
            textView.setAlpha(0.7f);
            int i2 = iC / 2;
            textView.setPadding(i2, 0, i2, 0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, iC, 0);
            this.r.addView(textView, layoutParams);
        }
    }

    public void a(Context context, float f) {
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextSize(1, 14.0f);
        this.f.setId(com.xmlywind.sdk.common.a.r());
        this.f.setGravity(17);
        this.f.setTextColor(-7829368);
        if (f > 0.0f) {
            this.f.setText(String.format("%.1f", Float.valueOf(f)));
        }
        this.h = new FiveStarView(context, f);
    }

    public void a(Context context, String str) {
        TextView textView = new TextView(context);
        this.g = textView;
        textView.setId(com.xmlywind.sdk.common.a.r());
        this.g.setTextColor(-7829368);
        this.g.setSingleLine();
        this.g.setGravity(17);
        this.g.setTextSize(1, 14.0f);
        this.g.setEllipsize(TextUtils.TruncateAt.END);
        this.g.setText(str);
    }

    public void a(String str) {
        k kVarB;
        if (TextUtils.isEmpty(str) || (kVarB = com.xmlywind.sdk.common.e.f.b()) == null) {
            return;
        }
        this.i = kVarB.a(str, new k.d() { // from class: com.xmlywind.sdk.base.views.CompanionAdsWidget.4
            @Override // com.xmlywind.volley.toolbox.k.d
            public void a(k.c cVar, boolean z) {
                if (cVar.b() != null) {
                    CompanionAdsWidget.this.b.setImageBitmap(cVar.b());
                    CompanionAdsWidget.this.b.setVisibility(0);
                    if (CompanionAdsWidget.this.l) {
                        CompanionAdsWidget.this.c();
                    }
                }
            }

            @Override // com.xmlywind.volley.n.a
            public void onErrorResponse(s sVar) {
            }
        });
    }

    public boolean a() {
        return this.o;
    }

    public boolean b() {
        return this.p;
    }

    public LinearLayout getFourElementsLayout() {
        return this.r;
    }

    @Override // android.view.View
    public int getVisibility() {
        return super.getVisibility();
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        if (this.m == 1) {
            this.c.setOnTouchListener(onTouchListener);
        } else {
            super.setOnTouchListener(onTouchListener);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == 8) {
            super.setVisibility(i);
            this.i.a();
            this.l = false;
        } else {
            if (i == 0) {
                this.l = true;
                if (this.j.getAnimation() == null && !this.q && this.b.getVisibility() == 0) {
                    c();
                    return;
                }
                return;
            }
            if (i != 4) {
                super.setVisibility(i);
            } else if (this.j.getAnimation() == null) {
                h();
            }
        }
    }
}
