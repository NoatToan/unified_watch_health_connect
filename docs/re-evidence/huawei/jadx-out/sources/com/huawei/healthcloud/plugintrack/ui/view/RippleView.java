package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class RippleView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AnimationSet[] f11277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f11278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f11279c;
    private float d;
    private final Handler e;
    private int f;
    private int g;
    private ImageView[] h;
    private int j;

    public RippleView(Context context) {
        super(context);
        this.g = 400;
        this.f11277a = new AnimationSet[3];
        this.h = new ImageView[3];
        this.f11279c = 80.0f;
        this.d = 80.0f;
        this.e = new d(this);
        c(context);
    }

    public RippleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 400;
        this.f11277a = new AnimationSet[3];
        this.h = new ImageView[3];
        this.f11279c = 80.0f;
        this.d = 80.0f;
        this.e = new d(this);
        e(context, attributeSet);
        c(context);
    }

    private void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RippleView);
        this.g = typedArrayObtainStyledAttributes.getInt(R.styleable.RippleView_showAnimTime, 400);
        this.f11279c = typedArrayObtainStyledAttributes.getDimension(R.styleable.RippleView_imageViewWidth, 80.0f);
        this.d = typedArrayObtainStyledAttributes.getDimension(R.styleable.RippleView_imageViewHeight, 80.0f);
        this.f = typedArrayObtainStyledAttributes.getResourceId(R.styleable.RippleView_rippleCircleImgId, R.drawable.ripple_circle);
        this.j = typedArrayObtainStyledAttributes.getResourceId(R.styleable.RippleView_ripplePointImgId, R.drawable.ripple_bg);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c(Context context) {
        setLayout(context);
        for (int i = 0; i < this.h.length; i++) {
            this.f11277a[i] = d();
        }
    }

    private void setLayout(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) this.f11279c, (int) this.d);
        layoutParams.addRule(13, -1);
        for (int i = 0; i < 3; i++) {
            this.h[i] = new ImageView(context);
            this.h[i].setImageResource(this.f);
            addView(this.h[i], layoutParams);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) this.f11279c, (int) this.d);
        layoutParams2.addRule(13, -1);
        ImageView imageView = new ImageView(context);
        this.f11278b = imageView;
        imageView.setImageResource(this.j);
        addView(this.f11278b, layoutParams2);
    }

    private AnimationSet d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 2.0f, 1.0f, 2.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(this.g * 3);
        scaleAnimation.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.1f);
        alphaAnimation.setDuration(this.g * 3);
        alphaAnimation.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    public void e() {
        AnimationSet animationSet;
        ImageView imageView = this.h[0];
        if (imageView == null || (animationSet = this.f11277a[0]) == null) {
            LogUtil.j("Track_RippleView", "startWaveAnimation null");
            return;
        }
        imageView.startAnimation(animationSet);
        this.e.sendEmptyMessageDelayed(1, this.g);
        this.e.sendEmptyMessageDelayed(2, this.g * 2);
    }

    public void a() {
        for (ImageView imageView : this.h) {
            if (imageView != null) {
                imageView.clearAnimation();
            }
        }
    }

    public int getShowAnimTime() {
        return this.g;
    }

    public void setShowAnimTime(int i) {
        this.g = i;
    }

    /* JADX INFO: loaded from: classes33.dex */
    static class d extends BaseHandler<RippleView> {
        d(RippleView rippleView) {
            super(rippleView);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(RippleView rippleView, Message message) {
            int i = message.what;
            if (i == 1) {
                rippleView.h[1].startAnimation(rippleView.f11277a[1]);
            } else {
                if (i != 2) {
                    return;
                }
                rippleView.h[1].startAnimation(rippleView.f11277a[2]);
            }
        }
    }
}
