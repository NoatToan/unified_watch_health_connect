package com.huawei.health.marketing.views.dialog;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.huawei.health.servicesui.R;
import defpackage.qso;

/* JADX INFO: loaded from: classes29.dex */
public class MarketingDialog extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f8457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8458b;
    private Context d;
    private LinearLayout e;

    public MarketingDialog(Context context) {
        super(context, R.style.CustomDialog);
        this.f8457a = 0L;
        this.f8458b = false;
        this.d = context;
    }

    private boolean e() {
        Context context = this.d;
        return context == null || ((Activity) context).isFinishing();
    }

    private void b(int i) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.e, "scaleX", 0.3f, 1.0f);
        long j = i;
        objectAnimatorOfFloat.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.e, "scaleY", 0.3f, 1.0f);
        objectAnimatorOfFloat2.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.e, "rotationY", 280.0f, 360.0f);
        objectAnimatorOfFloat3.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.e, "alpha", 0.1f, 1.0f);
        objectAnimatorOfFloat4.setStartDelay(50L);
        objectAnimatorOfFloat4.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setStartDelay(500L);
        animatorSet.setInterpolator(new Interpolator() { // from class: com.huawei.health.marketing.views.dialog.MarketingDialog.3
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (float) Math.sin((float) (((double) f) * 1.5707963267948966d));
            }
        });
        animatorSet.start();
    }

    @Override // android.app.Dialog
    public void show() {
        if (e() || this.f8458b) {
            return;
        }
        super.show();
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        b(400);
        this.f8457a = System.currentTimeMillis();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        qso.d().b(this);
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        qso.d().b(this);
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        qso.d().b(this);
        super.setContentView(view, layoutParams);
    }
}
