package com.huawei.phoneservice.feedback.photolibrary.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.phoneservice.faq.base.util.g;

/* JADX INFO: loaded from: classes13.dex */
public class BadgeHelper extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f21695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f21696c;
    private int d;
    private Paint e;
    private int f;
    private boolean g;
    private int h;

    public void setBadgeNumber(int i) {
        this.d = i;
        if (this.g) {
            setVisibility(i == 0 ? 4 : 0);
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4 = this.f;
        if (i4 <= 0 || (i3 = this.h) <= 0) {
            throw new IllegalStateException("如果你自定义了小红点的宽高,就不能设置其宽高小于0!");
        }
        setMeasuredDimension(i4, i3);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f21696c;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        this.f21696c.bottom = getHeight();
        canvas.drawRoundRect(this.f21696c, getWidth() / 2.0f, getWidth() / 2.0f, this.e);
    }

    public BadgeHelper d(boolean z, boolean z2) {
        if (!z && z2) {
            g.d("BadgeHelper", "只有重叠模式isOverlap=true时，设置mIgnoreTargetPadding才生效");
        }
        return this;
    }

    public BadgeHelper b(boolean z) {
        return d(z, false);
    }

    public BadgeHelper c(View view) {
        a();
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (view == null) {
            return this;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            e(view, viewGroup, iIndexOfChild);
            this.g = true;
        } else if (view.getParent() == null) {
            throw new IllegalStateException("目标View不能没有父布局!");
        }
        setVisibility(this.d == 0 ? 4 : 0);
        return this;
    }

    private void e(View view, ViewGroup viewGroup, int i) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        frameLayout.setLayoutParams(layoutParams);
        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        viewGroup.addView(frameLayout, i, layoutParams);
        frameLayout.addView(view);
        frameLayout.addView(this);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams2.gravity = 8388661;
        setLayoutParams(layoutParams2);
    }

    private void a() {
        this.f21695b = getResources().getDisplayMetrics().density;
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.e.setFlags(1);
        this.e.setColor(this.f21694a);
        this.h = Math.round(this.f21695b * 7.0f);
        this.f = Math.round(this.f21695b * 7.0f);
    }

    public BadgeHelper(Context context) {
        super(context);
        this.f21696c = new RectF();
        this.f21694a = -2936293;
    }
}
