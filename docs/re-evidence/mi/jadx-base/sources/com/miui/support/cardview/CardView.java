package com.miui.support.cardview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import defpackage.d3n;
import defpackage.d4j;
import defpackage.ebk;
import defpackage.pu6;
import defpackage.thi;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends androidx.cardview.widget.CardView {
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10325k;
    public boolean l;
    public RectF m;
    public Path n;

    public CardView(Context context) {
        this(context, null);
    }

    private Drawable getOriginalBackground() {
        Drawable background = getBackground();
        return background instanceof d3n ? ((d3n) background).c() : background;
    }

    private boolean h() {
        return !i() && this.l;
    }

    private boolean i() {
        return pu6.E() || pu6.C();
    }

    @RequiresApi(api = 21)
    private void j(Context context, String str, int i) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(ViewOutlineProvider.class);
            try {
                try {
                    setOutlineProvider((ViewOutlineProvider) clsAsSubclass.getConstructor(Context.class, Integer.TYPE).newInstance(context, Integer.valueOf(i)));
                } catch (IllegalAccessException | NoSuchMethodException unused) {
                    setOutlineProvider((ViewOutlineProvider) clsAsSubclass.getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (InstantiationException e) {
                    e = e;
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (ClassNotFoundException unused2) {
            throw new NoClassDefFoundError(str);
        }
    }

    private void k() {
        Drawable originalBackground = getOriginalBackground();
        d3n d3nVar = new d3n();
        d3nVar.h(originalBackground);
        d3nVar.j(getRadius());
        d3nVar.n(getStrokeWidth());
        d3nVar.m(getStrokeColor());
        setBackground(d3nVar);
    }

    private void setSmoothCornerEnable(boolean z) {
        try {
            ebk.m(View.class, this, "setSmoothCornerEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("setSmoothCornerEnabled failed:");
            sb.append(e.getMessage());
        }
    }

    public int getStrokeColor() {
        return this.f10325k;
    }

    public int getStrokeWidth() {
        return this.j;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.n.reset();
        this.m.left = getPaddingLeft();
        this.m.top = getPaddingTop();
        this.m.right = getWidth() - getPaddingRight();
        this.m.bottom = getHeight() - getPaddingBottom();
        this.n.addRoundRect(this.m, getRadius(), getRadius(), Path.Direction.CW);
        canvas.clipPath(this.n);
        super.onDraw(canvas);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        k();
    }

    public void setStrokeColor(int i) {
        if (this.f10325k != i) {
            this.f10325k = i;
            k();
        }
    }

    public void setStrokeWidth(int i) {
        if (this.j != i) {
            this.j = i;
            k();
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, thi.f34707a);
    }

    @SuppressLint({"CustomViewStyleable"})
    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new RectF();
        this.n = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d4j.z, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(d4j.P, -1);
        if (resourceId != -1) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, d4j.f0);
            String string = typedArrayObtainStyledAttributes2.getString(d4j.g0);
            if (!TextUtils.isEmpty(string)) {
                j(context, string, resourceId);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        this.l = typedArrayObtainStyledAttributes.getBoolean(d4j.O, true);
        if (h()) {
            setSmoothCornerEnable(true);
        }
        setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(d4j.M, 0));
        setStrokeColor(typedArrayObtainStyledAttributes.getColor(d4j.J, 0));
        typedArrayObtainStyledAttributes.recycle();
        k();
    }
}
