package com.xiaomi.hm.health.bodyfat.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class FatMeasuringView extends LinearLayout {
    private static final String e = "HeadViewManager-FatMeasuringView";
    private static final long f = 320;
    private static final long g = 120;
    private static final int h = 5;
    private static final int i = 1;
    private static final int j = 2;
    private int a;
    private boolean b;
    private List<View> c;
    private Handler d;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    if (!FatMeasuringView.this.b) {
                        return;
                    } else {
                        FatMeasuringView.this.j();
                    }
                }
            } else if (!FatMeasuringView.this.b) {
                return;
            } else {
                FatMeasuringView.this.i();
            }
            super.handleMessage(message);
        }
    }

    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            HMLog.d(FatMeasuringView.e, "--fade in end--", new Object[0]);
            FatMeasuringView.this.d.sendEmptyMessageDelayed(1, FatMeasuringView.f);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            HMLog.d(FatMeasuringView.e, "--fade in start--", new Object[0]);
        }
    }

    public class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            HMLog.d(FatMeasuringView.e, "--fade out end --", new Object[0]);
            FatMeasuringView.this.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            HMLog.d(FatMeasuringView.e, "--fade out start --", new Object[0]);
        }
    }

    public class d implements Animation.AnimationListener {
        public d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            HMLog.d(FatMeasuringView.e, "blink in end , position = " + FatMeasuringView.this.a, new Object[0]);
            ((View) FatMeasuringView.this.c.get(FatMeasuringView.this.a)).setAlpha(0.9f);
            FatMeasuringView.this.d.sendEmptyMessageDelayed(2, 120L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            HMLog.d(FatMeasuringView.e, "blink in start , position = " + FatMeasuringView.this.a, new Object[0]);
        }
    }

    public class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            HMLog.d(FatMeasuringView.e, "blink out end , position = " + FatMeasuringView.this.a, new Object[0]);
            FatMeasuringView.this.m();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            HMLog.d(FatMeasuringView.e, "blink out start , position = " + FatMeasuringView.this.a, new Object[0]);
        }
    }

    public FatMeasuringView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void h() {
        Iterator<View> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().clearAnimation();
        }
        clearAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 0.9f);
        alphaAnimation.setDuration(120L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new d());
        this.c.get(this.a).startAnimation(alphaAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.9f, 0.2f);
        alphaAnimation.setDuration(120L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new e());
        this.c.get(this.a).startAnimation(alphaAnimation);
    }

    private void k() {
        h();
        this.b = true;
        setVisibility(0);
        Iterator<View> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().setAlpha(0.2f);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(f);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new b());
        startAnimation(alphaAnimation);
    }

    private void l() {
        h();
        this.b = false;
        Iterator<View> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().setAlpha(0.2f);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(f);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new c());
        startAnimation(alphaAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        int i2 = this.a;
        if (i2 == 4) {
            this.a = 0;
        } else {
            this.a = i2 + 1;
        }
        i();
    }

    public void hide() {
        HMLog.d(e, "hide------", new Object[0]);
        if (getVisibility() == 0) {
            HMLog.d(e, "hide------", new Object[0]);
            l();
        }
    }

    public void show() {
        this.a = 0;
        if (getVisibility() == 8) {
            HMLog.d(e, "show------", new Object[0]);
            k();
        }
    }

    public FatMeasuringView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = 0;
        this.b = false;
        this.c = new ArrayList(5);
        this.d = new a();
        View.inflate(context, R.layout.view_fat_measuring, this);
        this.c.add(findViewById(R.id.view1));
        this.c.add(findViewById(R.id.view2));
        this.c.add(findViewById(R.id.view3));
        this.c.add(findViewById(R.id.view4));
        this.c.add(findViewById(R.id.view5));
    }
}
