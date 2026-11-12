package com.huawei.ui.commonui.floatview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.qqp;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class SleepCheckFloatButton extends FloatingSidingView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, SleepCheckFloatButton> f23517b = new HashMap();
    private static final String e = "SleepCheckFloatButton";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ImageView f23518a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Activity f23519c;
    ImageView d;
    private Animator.AnimatorListener f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private Handler k;
    private ObjectAnimator m;
    private Runnable n;

    private SleepCheckFloatButton(Activity activity) {
        int i;
        super(activity);
        this.g = true;
        this.j = false;
        this.h = true;
        this.i = true;
        this.k = new Handler(Looper.getMainLooper());
        this.n = new Runnable() { // from class: com.huawei.ui.commonui.floatview.SleepCheckFloatButton.2
            @Override // java.lang.Runnable
            public void run() {
                if (SleepCheckFloatButton.this.m != null) {
                    SleepCheckFloatButton.this.m.reverse();
                }
            }
        };
        this.f = new Animator.AnimatorListener() { // from class: com.huawei.ui.commonui.floatview.SleepCheckFloatButton.1
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
                int i2;
                LogUtil.a(SleepCheckFloatButton.e, "animation end");
                SleepCheckFloatButton sleepCheckFloatButton = SleepCheckFloatButton.this;
                sleepCheckFloatButton.g = !sleepCheckFloatButton.g;
                SleepCheckFloatButton.this.h = true;
                SleepCheckFloatButton.this.i = true;
                ImageView imageView = SleepCheckFloatButton.this.f23518a;
                if (SleepCheckFloatButton.this.g) {
                    i2 = R.drawable.btn_health_list_radio_nor;
                } else {
                    i2 = R.drawable.btn_health_list_radio_sel;
                }
                imageView.setImageResource(i2);
            }
        };
        this.f23519c = activity;
        inflate(activity, R.layout.commonui_custom_sleep_check_float_button, this);
        this.d = (ImageView) findViewById(R.id.icon);
        ImageView imageView = (ImageView) findViewById(R.id.close);
        this.f23518a = imageView;
        imageView.setVisibility(0);
        this.d.setImageResource(R.drawable.weight_card_bg_with_shadow_selected);
        ImageView imageView2 = this.f23518a;
        if (this.g) {
            i = R.drawable.btn_health_list_radio_nor;
        } else {
            i = R.drawable.btn_health_list_radio_sel;
        }
        imageView2.setImageResource(i);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.d, "translationY", 0.0f, qrs.d((Context) activity, 70.0f));
        this.m = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(500L);
        this.m.addListener(this.f);
        this.f23518a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.floatview.SleepCheckFloatButton.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SleepCheckFloatButton.this.g) {
                    SleepCheckFloatButton.this.c();
                } else {
                    SleepCheckFloatButton.this.b();
                }
            }
        });
    }

    public static SleepCheckFloatButton c(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        if (!f23517b.containsKey(simpleName)) {
            f23517b.put(simpleName, new SleepCheckFloatButton(activity));
        }
        return f23517b.get(simpleName);
    }

    @Override // com.huawei.ui.commonui.floatview.FloatingSidingView
    public void a() {
        e(true);
    }

    private void e(boolean z) {
        FrameLayout decorview = getDecorview();
        if (!z) {
            if (this.j) {
                decorview.removeView(this);
                return;
            }
            return;
        }
        if (decorview == null || this.j) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388693;
        if (LanguageUtil.ba(this.f23519c)) {
            layoutParams.setMargins((int) this.f23519c.getResources().getDimension(R.dimen.defaultPaddingEnd), layoutParams.topMargin, layoutParams.rightMargin, qqp.a(this.f23519c, 100.0f));
            this.d.setRotationY(180.0f);
        } else {
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, (int) this.f23519c.getResources().getDimension(R.dimen.defaultPaddingEnd), qqp.a(this.f23519c, 100.0f));
        }
        setLayoutParams(layoutParams);
        decorview.addView(this);
        this.j = true;
        this.g = true;
        this.h = true;
        this.i = true;
    }

    public void e(Activity activity) {
        if (this.f23519c != null) {
            this.f23519c = null;
        }
        ObjectAnimator objectAnimator = this.m;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.m.end();
            this.m = null;
        }
        f23517b.remove(activity.getClass().getSimpleName());
    }

    public void c() {
        synchronized (this) {
            if (this.h && this.g) {
                this.h = false;
                this.m.setStartDelay(200L);
                this.m.start();
            }
        }
    }

    public void b() {
        synchronized (this) {
            LogUtil.e(e, "isreverseAnimator = " + this.i + " isShow = " + this.g);
            if (this.i) {
                this.i = false;
                if (!this.g) {
                    this.m.reverse();
                } else {
                    this.k.postDelayed(this.n, 500L);
                }
            }
        }
    }

    private FrameLayout getDecorview() {
        return (FrameLayout) this.f23519c.getWindow().getDecorView().findViewById(android.R.id.content);
    }
}
