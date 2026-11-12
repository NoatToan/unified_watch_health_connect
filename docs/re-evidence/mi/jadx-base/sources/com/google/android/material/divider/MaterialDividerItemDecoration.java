package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.c;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.k3j;
import defpackage.k47;
import defpackage.k8f;
import defpackage.pii;
import defpackage.pmi;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialDividerItemDecoration extends RecyclerView.n {
    public static final int i = k3j.F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f8700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8701b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public final Rect h;

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, pii.J, i2);
    }

    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i2 = paddingTop + this.e;
        int i3 = height - this.f;
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.h);
            int iRound = this.h.right + Math.round(childAt.getTranslationX());
            this.f8700a.setBounds((iRound - this.f8700a.getIntrinsicWidth()) - this.f8701b, i2, iRound, i3);
            this.f8700a.draw(canvas);
        }
        canvas.restore();
    }

    public final void d(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        boolean z = c.A(recyclerView) == 1;
        int i2 = paddingLeft + (z ? this.f : this.e);
        int i3 = width - (z ? this.e : this.f);
        int childCount = recyclerView.getChildCount();
        if (!this.g) {
            childCount--;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.h);
            int iRound = this.h.bottom + Math.round(childAt.getTranslationY());
            this.f8700a.setBounds(i2, (iRound - this.f8700a.getIntrinsicHeight()) - this.f8701b, i3, iRound);
            this.f8700a.draw(canvas);
        }
        canvas.restore();
    }

    public void e(int i2) {
        this.c = i2;
        Drawable drawableR = k47.r(this.f8700a);
        this.f8700a = drawableR;
        k47.n(drawableR, i2);
    }

    public void f(int i2) {
        if (i2 == 0 || i2 == 1) {
            this.d = i2;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i2 + ". It should be either HORIZONTAL or VERTICAL");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        rect.set(0, 0, 0, 0);
        if (this.d == 1) {
            rect.bottom = this.f8700a.getIntrinsicHeight() + this.f8701b;
        } else {
            rect.right = this.f8700a.getIntrinsicWidth() + this.f8701b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.d == 1) {
            d(canvas, recyclerView);
        } else {
            c(canvas, recyclerView);
        }
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.h = new Rect();
        TypedArray typedArrayH = c9p.h(context, attributeSet, b4j.a5, i2, i, new int[0]);
        this.c = k8f.b(context, typedArrayH, b4j.b5).getDefaultColor();
        this.f8701b = typedArrayH.getDimensionPixelSize(b4j.e5, context.getResources().getDimensionPixelSize(pmi.B));
        this.e = typedArrayH.getDimensionPixelOffset(b4j.d5, 0);
        this.f = typedArrayH.getDimensionPixelOffset(b4j.c5, 0);
        this.g = typedArrayH.getBoolean(b4j.f5, true);
        typedArrayH.recycle();
        this.f8700a = new ShapeDrawable();
        e(this.c);
        f(i3);
    }
}
