package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Dimension;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.b4j;
import defpackage.iqi;
import defpackage.kwi;
import defpackage.l8f;
import defpackage.qgk;

/* JADX INFO: loaded from: classes5.dex */
class RadialViewGroup extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f8937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8938b;
    public l8f c;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RadialViewGroup.this.e();
        }
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static boolean d(View view) {
        return "skip".equals(view.getTag());
    }

    public final Drawable a() {
        l8f l8fVar = new l8f();
        this.c = l8fVar;
        l8fVar.Z(new qgk(0.5f));
        this.c.b0(ColorStateList.valueOf(-1));
        return this.c;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(androidx.core.view.c.k());
        }
        f();
    }

    @Dimension
    public int b() {
        return this.f8938b;
    }

    public void c(@Dimension int i) {
        this.f8938b = i;
        e();
    }

    public void e() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (d(getChildAt(i2))) {
                i++;
            }
        }
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.s(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != iqi.f21995b && !d(childAt)) {
                aVar.x(childAt.getId(), iqi.f21995b, this.f8938b, f);
                f += 360.0f / (childCount - i);
            }
        }
        aVar.i(this);
    }

    public final void f() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f8937a);
            handler.post(this.f8937a);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        e();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        f();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.c.b0(ColorStateList.valueOf(i));
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(kwi.q, this);
        androidx.core.view.c.v0(this, a());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b4j.a7, i, 0);
        this.f8938b = typedArrayObtainStyledAttributes.getDimensionPixelSize(b4j.b7, 0);
        this.f8937a = new a();
        typedArrayObtainStyledAttributes.recycle();
    }
}
