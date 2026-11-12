package com.xiaomi.fitness.sport.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.aki;
import defpackage.t4j;
import defpackage.vw3;

/* JADX INFO: loaded from: classes10.dex */
public class CircularProgressLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vw3 f13011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.xiaomi.fitness.sport.view.widget.a f13012b;
    public float c;
    public long d;

    public class a implements ViewGroup.OnHierarchyChangeListener {
        public a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams.gravity = 17;
            view2.setLayoutParams(layoutParams);
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
        }
    }

    public interface b {
        void a(CircularProgressLayout circularProgressLayout);
    }

    public CircularProgressLayout(Context context) {
        super(context);
    }

    public boolean a() {
        return this.f13012b.b();
    }

    public void b() {
        this.f13012b.e(this.d, 16L);
        this.f13011a.l(this.c);
    }

    public void c() {
        this.f13012b.f();
    }

    public int getBackgroundColor() {
        return this.f13011a.d();
    }

    public int[] getColorSchemeColors() {
        return this.f13011a.e();
    }

    public b getOnTimerFinishedListener() {
        return this.f13012b.a();
    }

    public vw3 getProgressDrawable() {
        return this.f13011a;
    }

    public float getStartingRotation() {
        return this.c;
    }

    public float getStrokeWidth() {
        return this.f13011a.f();
    }

    public long getTotalTime() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13012b.c();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() == 0) {
            this.f13011a.j(0.0f);
        } else {
            View childAt = getChildAt(0);
            this.f13011a.j(Math.min(childAt.getWidth(), childAt.getHeight()) / 2.0f);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f13011a.i(i);
    }

    public void setColorSchemeColors(int... iArr) {
        this.f13011a.k(iArr);
    }

    public void setIndeterminate(boolean z) {
        this.f13012b.d(z);
    }

    public void setOnTimerFinishedListener(b bVar) {
        this.f13012b.setOnTimerFinishedListener(bVar);
    }

    public void setStartingRotation(float f) {
        this.c = f;
    }

    public void setStrokeWidth(float f) {
        this.f13011a.q(f);
    }

    public void setTotalTime(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Total time should be greater than zero.");
        }
        this.d = j;
    }

    public CircularProgressLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0.75f;
        vw3 vw3Var = new vw3(context);
        this.f13011a = vw3Var;
        vw3Var.l(0.75f);
        this.f13011a.p(Paint.Cap.BUTT);
        setBackground(this.f13011a);
        setOnHierarchyChangeListener(new a());
        this.f13012b = new com.xiaomi.fitness.sport.view.widget.a(this);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, t4j.Y);
        setColorSchemeColors(typedArrayObtainAttributes.getColor(t4j.a0, getResources().getColor(aki.common_white)));
        setStrokeWidth(typedArrayObtainAttributes.getDimensionPixelSize(t4j.c0, 10));
        setBackgroundColor(typedArrayObtainAttributes.getColor(t4j.Z, getResources().getColor(aki.common_black)));
        setIndeterminate(typedArrayObtainAttributes.getBoolean(t4j.b0, false));
        typedArrayObtainAttributes.recycle();
    }
}
