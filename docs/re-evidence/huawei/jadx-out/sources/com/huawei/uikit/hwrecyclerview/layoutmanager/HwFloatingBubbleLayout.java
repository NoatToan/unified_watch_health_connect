package com.huawei.uikit.hwrecyclerview.layoutmanager;

import android.content.Context;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes20.dex */
public class HwFloatingBubbleLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Region f29550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Path f29552c;
    private int d;
    private boolean e;
    private float f;
    private OnSelectedListener h;

    public interface OnSelectedListener {
        void onSelectedChanged(ViewGroup viewGroup, boolean z);
    }

    public HwFloatingBubbleLayout(Context context) {
        super(context);
        this.e = false;
        this.f29552c = new Path();
        this.f = 1.0f;
        d();
    }

    private void b() {
        this.f29550a = new Region();
        this.f29552c.reset();
        Path path = this.f29552c;
        float f = this.f29551b / 2.0f;
        path.addCircle(f, this.d / 2.0f, f, Path.Direction.CW);
        this.f29550a.setPath(this.f29552c, new Region(0, 0, this.f29551b, this.d));
    }

    private void d() {
        this.f = (new SecureRandom().nextInt(10) / 100.0f) + 0.9f;
    }

    public OnSelectedListener getOnSelectedListener() {
        return this.h;
    }

    public float getRandomFactor() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(getParent());
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f29551b = i;
        this.d = i2;
        b();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f29550a.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setOnSelectedListener(OnSelectedListener onSelectedListener) {
        this.h = onSelectedListener;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z != this.e) {
            OnSelectedListener onSelectedListener = this.h;
            if (onSelectedListener != null) {
                onSelectedListener.onSelectedChanged(this, z);
            }
            this.e = z;
        }
    }

    private void b(ViewParent viewParent) {
        if (viewParent != null && (viewParent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) viewParent;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
    }

    public HwFloatingBubbleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        this.f29552c = new Path();
        this.f = 1.0f;
        d();
    }

    public HwFloatingBubbleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
        this.f29552c = new Path();
        this.f = 1.0f;
        d();
    }
}
