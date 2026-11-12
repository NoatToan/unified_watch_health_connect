package com.huawei.openalliance.ad.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.core.view.GravityCompat;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.df;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.gx;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.listeners.SplashIconListener;
import com.huawei.openalliance.ad.ob;
import com.huawei.openalliance.ad.sn;
import com.huawei.openalliance.ad.tz;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bd;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;

/* JADX INFO: loaded from: classes41.dex */
public class PPSSplashIconView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ContentRecord f21010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ai f21011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ag f21012c;
    private ah d;
    private CornerImageView e;
    private CornerImageView f;
    private CornerImageView g;
    private AutoScaleSizeRelativeLayout h;
    private WindowManager i;
    private SplashIconListener j;
    private ob k;
    private CountDownTimer l;
    private Context m;
    private int n;
    private int o;
    private int p;
    private String q;
    private String r;
    private boolean s;
    private int u;
    private int v;
    private AnimatorSet w;
    private AnimatorSet x;
    private MaterialClickInfo z;
    private boolean t = false;
    private boolean y = false;

    public void updatePos(int i, int i2) {
        if (!this.t) {
            hw.c("PPSSplashIconView", "updatePos, not start");
            return;
        }
        ag agVar = this.f21012c;
        if (agVar == null || !agVar.isAttachedToWindow()) {
            hw.c("PPSSplashIconView", "updatePos, not attach");
            return;
        }
        if (i2 <= 0 || i2 > this.u) {
            i2 = this.v;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.flags = 40;
        layoutParams.format = 1;
        layoutParams.gravity = i == 1 ? 8388659 : 8388661;
        layoutParams.x = as.a(this.m, 4.0f);
        layoutParams.y = as.a(this.m, i2 + 28);
        this.i.updateViewLayout(this.f21012c, layoutParams);
        layoutParams.x = i == 1 ? as.a(this.m, 44.0f) : 0;
        layoutParams.y = as.a(this.m, i2);
        this.i.updateViewLayout(this.d, layoutParams);
    }

    public void start() {
        boolean z = this.t;
        if (z || !this.s) {
            hw.c("PPSSplashIconView", "already start or not init, hasStart= %s", Boolean.valueOf(z));
            h();
            return;
        }
        this.t = true;
        if (df.k() == null || (df.i() == null && df.j() == null)) {
            hw.c("PPSSplashIconView", "not show icon");
            df.a((Bitmap) null);
            df.a((Drawable) null);
            h();
            return;
        }
        df.c(null);
        if (this.f21011b == null || this.e == null) {
            hw.c("PPSSplashIconView", "not real init");
            h();
            return;
        }
        if (df.i() != null) {
            this.e.setImageDrawable(df.i());
            df.a((Drawable) null);
        } else {
            this.e.setImageBitmap(df.j());
            df.a((Bitmap) null);
        }
        if (this.q == null && !TextUtils.isEmpty(this.r)) {
            a(this.r);
            if (this.q == null) {
                hw.c("PPSSplashIconView", "cachedPath is null");
                ob obVar = this.k;
                if (obVar != null) {
                    obVar.a(2);
                }
                h();
                return;
            }
        }
        hw.b("PPSSplashIconView", "start");
        bd.a(this.m, this.q, new bd.a() { // from class: com.huawei.openalliance.ad.views.PPSSplashIconView.2
            @Override // com.huawei.openalliance.ad.utils.bd.a
            public void a(final Drawable drawable) {
                hw.b("PPSSplashIconView", "start - image load success");
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSSplashIconView.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (PPSSplashIconView.this.f != null) {
                            PPSSplashIconView.this.f.setImageDrawable(drawable);
                        }
                        if (PPSSplashIconView.this.g != null) {
                            PPSSplashIconView.this.g.setImageDrawable(drawable);
                        }
                        PPSSplashIconView.this.b();
                        if (PPSSplashIconView.this.k != null) {
                            PPSSplashIconView.this.k.a();
                        }
                    }
                });
            }

            @Override // com.huawei.openalliance.ad.utils.bd.a
            public void a() {
                hw.b("PPSSplashIconView", "start - image load failed");
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSSplashIconView.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (PPSSplashIconView.this.k != null) {
                            PPSSplashIconView.this.k.a(3);
                        }
                        PPSSplashIconView.this.i();
                        PPSSplashIconView.this.h();
                    }
                });
            }
        }, null);
    }

    public void setAdIconListener(SplashIconListener splashIconListener) {
        this.j = splashIconListener;
    }

    public void destroy() {
        SplashIconListener splashIconListener;
        i();
        if (this.f21012c == null || (splashIconListener = this.j) == null || !this.y) {
            return;
        }
        splashIconListener.onIconDismiss(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        g();
        this.e = null;
        a(this.f21011b);
        a(this.f21012c);
        a(this.d);
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.x.cancel();
        }
        AnimatorSet animatorSet2 = this.w;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            return;
        }
        this.w.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        SplashIconListener splashIconListener = this.j;
        if (splashIconListener != null) {
            splashIconListener.onIconDismiss(0);
        }
    }

    private void g() {
        hw.b("PPSSplashIconView", "cancelDisplayCountTask");
        CountDownTimer countDownTimer = this.l;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        hw.b("PPSSplashIconView", "startDisplayCountTask, duration: %s", Integer.valueOf(this.p));
        CountDownTimer countDownTimer = this.l;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = new CountDownTimer(this.p, 1000L) { // from class: com.huawei.openalliance.ad.views.PPSSplashIconView.8
            @Override // android.os.CountDownTimer
            public void onTick(long j) {
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                hw.b("PPSSplashIconView", "onFinish");
                PPSSplashIconView.this.i();
                if (PPSSplashIconView.this.j != null) {
                    PPSSplashIconView.this.j.onIconDismiss(2);
                }
            }
        };
        this.l = countDownTimer2;
        countDownTimer2.start();
    }

    private float e() {
        int iF;
        float fA = cc.a(this.m).a(this.f21011b);
        int i = this.m.getResources().getDisplayMetrics().heightPixels;
        Point point = new Point();
        this.i.getDefaultDisplay().getRealSize(point);
        float fG = (((float) point.y) - fA) - ((float) i) > ((float) dk.j(this.m)) ? dk.g(this.m) : 0.0f;
        if (!cc.a(this.m).a(this.m) || cc.a(this.m).a(this.f21011b) <= 0) {
            iF = dk.f(this.m) - as.h(this.m);
        } else {
            if (fG == 0.0f) {
                return 0.0f;
            }
            iF = cc.a(this.m).a(this.f21011b);
        }
        return (iF * 1.0f) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f21011b == null || this.f21012c == null || this.e == null) {
            hw.c("PPSSplashIconView", "initAndStartAnimation, not init");
            return;
        }
        int width = this.g.getWidth();
        int height = this.g.getHeight();
        float pivotX = this.g.getPivotX();
        float pivotY = this.g.getPivotY();
        int[] iArr = new int[2];
        this.g.getLocationOnScreen(iArr);
        float fE = e();
        hw.b("PPSSplashIconView", "destWidth=%s destHeight=%s destX=%s  destY=%s locationD= %s %s systemDiff = %s", Integer.valueOf(width), Integer.valueOf(height), Float.valueOf(pivotX), Float.valueOf(pivotY), Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Float.valueOf(fE));
        hw.b("PPSSplashIconView", "S= %s %s, I=%s %s ", Float.valueOf(this.e.getPivotX()), Float.valueOf(this.e.getPivotY()), Float.valueOf(this.f.getPivotX()), Float.valueOf(this.f.getPivotY()));
        hw.b("PPSSplashIconView", "splash Width= %s Height=%s, splashIcon Width=%s Height=%s", Integer.valueOf(this.e.getWidth()), Integer.valueOf(this.e.getHeight()), Integer.valueOf(this.f.getWidth()), Integer.valueOf(this.f.getHeight()));
        if (this.e.getHeight() == 0 || this.e.getWidth() == 0 || this.f.getWidth() == 0 || this.f.getHeight() == 0) {
            i();
            h();
            return;
        }
        CornerImageView cornerImageView = this.e;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cornerImageView, "translationX", 0.0f, (iArr[0] + pivotX) - cornerImageView.getPivotX());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.e, "translationY", 0.0f, ((as.a(this.m, this.o + 32) + pivotY) - this.e.getPivotY()) - fE);
        CornerImageView cornerImageView2 = this.e;
        float f = width * 1.0f;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(cornerImageView2, "scaleX", 1.0f, f / (cornerImageView2.getWidth() * 1.0f));
        CornerImageView cornerImageView3 = this.e;
        float f2 = height * 1.0f;
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(cornerImageView3, "scaleY", 1.0f, f2 / (cornerImageView3.getHeight() * 1.0f));
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.e, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f, "translationX", 0.0f, (iArr[0] + pivotX) - this.e.getPivotX());
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f, "translationY", 0.0f, ((as.a(this.m, this.o + 32) + pivotY) - this.e.getPivotY()) - fE);
        float width2 = f / (this.f.getWidth() * 1.0f);
        float height2 = f2 / (this.f.getHeight() * 1.0f);
        hw.b("PPSSplashIconView", "destScaleX= %s  destScaleY = %s", Float.valueOf(width2), Float.valueOf(height2));
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.f, "scaleX", 1.0f, width2);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.f, "scaleY", 1.0f, height2);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.f, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(this.h, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(this.d, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.x = animatorSet;
        animatorSet.setDuration(300L);
        this.x.setInterpolator(new gx(0.2f, 0.0f, 0.2f, 1.0f));
        this.x.playTogether(objectAnimatorOfFloat11, objectAnimatorOfFloat12);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        animatorSet2.setDuration(500L);
        this.w.setInterpolator(new gx(0.2f, 0.0f, 0.2f, 1.0f));
        this.w.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat6, objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat5, objectAnimatorOfFloat10);
        this.w.addListener(new Animator.AnimatorListener() { // from class: com.huawei.openalliance.ad.views.PPSSplashIconView.7
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
                hw.b("PPSSplashIconView", "onAnimationEnd");
                try {
                    PPSSplashIconView.this.g.setAlpha(1.0f);
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSSplashIconView.7.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (PPSSplashIconView.this.f21011b != null) {
                                if (PPSSplashIconView.this.f21011b.isAttachedToWindow()) {
                                    PPSSplashIconView.this.i.removeViewImmediate(PPSSplashIconView.this.f21011b);
                                }
                                if (PPSSplashIconView.this.x != null) {
                                    PPSSplashIconView.this.x.start();
                                }
                            }
                        }
                    }, 20L);
                    PPSSplashIconView.this.f();
                } catch (Throwable th) {
                    hw.b("PPSSplashIconView", "onAnimationEnd err: %s", th.getClass().getSimpleName());
                }
            }
        });
        this.w.start();
    }

    private void c() {
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.flags = 134218760;
            layoutParams.format = 1;
            layoutParams.gravity = GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
            this.i.addView(this.f21011b, layoutParams);
            layoutParams.flags = 40;
            if (this.n == 1) {
                layoutParams.gravity = 8388659;
            } else {
                layoutParams.gravity = 8388661;
            }
            layoutParams.x = as.a(this.m, 4.0f);
            layoutParams.y = as.a(this.m, this.o + 28);
            this.i.addView(this.f21012c, layoutParams);
            if (this.n == 1) {
                layoutParams.x = as.a(this.m, 44.0f);
            } else {
                layoutParams.x = 0;
            }
            layoutParams.y = as.a(this.m, this.o);
            this.i.addView(this.d, layoutParams);
            this.h.setAlpha(0.0f);
            this.g.setAlpha(0.0f);
            this.f.setAlpha(0.0f);
            this.d.setAlpha(0.0f);
            this.y = true;
        } catch (Throwable th) {
            hw.c("PPSSplashIconView", "add icon error: %s", th.getClass().getSimpleName());
            this.k.a(5);
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ag agVar;
        if (this.f21011b == null || (agVar = this.f21012c) == null) {
            hw.c("PPSSplashIconView", "onIconLoaded, not init");
            return;
        }
        ViewTreeObserver viewTreeObserver = agVar.getViewTreeObserver();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            ob obVar = this.k;
            if (obVar != null) {
                obVar.a(4);
            }
            i();
            h();
            return;
        }
        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.huawei.openalliance.ad.views.PPSSplashIconView.3
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (PPSSplashIconView.this.f21012c == null || PPSSplashIconView.this.f21011b == null) {
                    hw.c("PPSSplashIconView", "onPreDraw, View is null");
                    return true;
                }
                PPSSplashIconView.this.f21012c.getViewTreeObserver().removeOnPreDrawListener(this);
                hw.b("PPSSplashIconView", "onPreDraw: start anim");
                PPSSplashIconView.this.d();
                return true;
            }
        });
        this.f21012c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSSplashIconView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PPSSplashIconView.this.k.a(PPSSplashIconView.this.f21010a.aM() != 0 ? Long.valueOf(System.currentTimeMillis() - PPSSplashIconView.this.f21010a.aM()) : null, 100, 1);
                boolean zA = PPSSplashIconView.this.k.a(PPSSplashIconView.this.f21012c.getContext(), PPSSplashIconView.this.z);
                PPSSplashIconView.this.z = null;
                hw.b("PPSSplashIconView", "onclick, result= %s", Boolean.valueOf(zA));
                if (PPSSplashIconView.this.j != null) {
                    PPSSplashIconView.this.j.onIconClick();
                }
                if (zA) {
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSSplashIconView.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            PPSSplashIconView.this.i();
                            if (PPSSplashIconView.this.j != null) {
                                PPSSplashIconView.this.j.onIconDismiss(4);
                            }
                        }
                    }, 200L);
                }
            }
        });
        this.f21012c.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSSplashIconView.5
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    PPSSplashIconView.this.z = tz.a(view, motionEvent);
                }
                if (1 != motionEvent.getAction()) {
                    return false;
                }
                tz.a(view, motionEvent, null, PPSSplashIconView.this.z);
                return false;
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSSplashIconView.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                hw.b("PPSSplashIconView", "click close");
                PPSSplashIconView.this.i();
                if (PPSSplashIconView.this.j != null) {
                    PPSSplashIconView.this.j.onIconDismiss(1);
                }
            }
        });
        c();
    }

    private void a(String str) {
        if (str.startsWith("http")) {
            dn dnVarA = com.huawei.openalliance.ad.dk.a(this.m, "normal");
            this.q = dnVarA.c(dnVarA.e(str));
        }
    }

    private void a(View view) {
        if (view == null || !view.isAttachedToWindow()) {
            return;
        }
        this.i.removeViewImmediate(view);
    }

    private void a(Activity activity, int i, int i2, MetaData metaData) {
        ob obVar;
        a(this.r);
        this.p = (metaData.G() == null || metaData.G().intValue() <= 0) ? 10000 : metaData.G().intValue() * 1000;
        this.n = i;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        this.u = as.b(this.m, displayMetrics.heightPixels) - 92;
        int iB = (int) ((as.b(this.m, displayMetrics.heightPixels) * 0.85f) - 92.0f);
        this.v = iB;
        if (i2 <= 0 || i2 > this.u) {
            i2 = iB;
        }
        this.o = i2;
        a();
        this.f21011b = new ai(activity);
        ag agVar = new ag(activity);
        this.f21012c = agVar;
        this.g = agVar.getIcon();
        this.h = this.f21012c.getRoundLayout();
        this.e = this.f21011b.getSplash();
        this.d = new ah(activity);
        this.f = this.f21011b.getIcon();
        this.i = (WindowManager) activity.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        ag agVar2 = this.f21012c;
        if (agVar2 == null || (obVar = this.k) == null) {
            return;
        }
        obVar.a(agVar2);
    }

    private void a() {
        if (this.q != null) {
            com.huawei.openalliance.ad.utils.o.d(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSSplashIconView.1
                @Override // java.lang.Runnable
                public void run() {
                    sn snVar = new sn();
                    snVar.d(PPSSplashIconView.this.q);
                    bd.a(PPSSplashIconView.this.m, snVar, (bd.a) null);
                }
            });
        }
    }

    public PPSSplashIconView(Activity activity, int i, int i2) {
        this.s = false;
        hw.b("PPSSplashIconView", "init");
        if (this.s) {
            hw.c("PPSSplashIconView", "already init");
            return;
        }
        this.s = true;
        if (df.k() == null || df.k().j() == null) {
            hw.c("PPSSplashIconView", "ad is null");
            return;
        }
        ContentRecord contentRecordK = df.k();
        this.f21010a = contentRecordK;
        MetaData metaDataJ = contentRecordK.j();
        if (metaDataJ == null || bm.a(metaDataJ.g()) || metaDataJ.g().get(0) == null) {
            hw.c("PPSSplashIconView", "Icon info is null");
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        this.m = applicationContext;
        this.k = new ob(applicationContext, this.f21010a, activity.getLocalClassName());
        String strC = metaDataJ.g().get(0).c();
        this.r = strC;
        if (!TextUtils.isEmpty(strC)) {
            a(activity, i, i2, metaDataJ);
        } else {
            hw.c("PPSSplashIconView", "Icon url is null");
            this.k.a(1);
        }
    }
}
