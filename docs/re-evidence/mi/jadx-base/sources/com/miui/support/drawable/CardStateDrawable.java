package com.miui.support.drawable;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.a57;
import defpackage.d4j;
import java.io.IOException;
import miuix.animation.styles.AlphaBlendingStateEffect;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class CardStateDrawable extends Drawable implements AlphaBlendingStateEffect.AlphaObserver {
    public static final boolean w = !a57.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AlphaBlendingStateEffect f10327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f10328b;
    public int c;
    public int d;
    public int e;
    public final RectF f;
    public float[] g;
    public final Path h;
    public final Paint i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10329k;
    public int l;
    public int m;
    public float n;
    public float o;
    public float p;
    public float q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f10330r;
    public float s;
    public float t;
    public int u;
    public int v;

    public static class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10332b;
        public int c;
        public int d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public float j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f10333k;

        public a() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new CardStateDrawable(new a(this), null);
        }

        public a(a aVar) {
            this.f10331a = aVar.f10331a;
            this.f10332b = aVar.f10332b;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.f10333k = aVar.f10333k;
            this.h = aVar.h;
            this.i = aVar.i;
            this.j = aVar.j;
            this.c = aVar.c;
            this.d = aVar.d;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new CardStateDrawable(new a(this), resources);
        }
    }

    public CardStateDrawable() {
        this.d = -1;
        this.f = new RectF();
        this.g = new float[8];
        this.h = new Path();
        this.i = new Paint();
        this.u = -1;
        this.v = -1;
        AlphaBlendingStateEffect alphaBlendingStateEffect = new AlphaBlendingStateEffect(this);
        this.f10327a = alphaBlendingStateEffect;
        alphaBlendingStateEffect.setEnableAnim(w);
        this.f10328b = new a();
        b();
    }

    public final void a() {
        this.i.setColor(this.e);
        AlphaBlendingStateEffect alphaBlendingStateEffect = this.f10327a;
        alphaBlendingStateEffect.normalAlpha = this.n;
        alphaBlendingStateEffect.pressedAlpha = this.o;
        alphaBlendingStateEffect.hoveredAlpha = this.p;
        alphaBlendingStateEffect.focusedAlpha = this.t;
        alphaBlendingStateEffect.checkedAlpha = this.f10330r;
        alphaBlendingStateEffect.activatedAlpha = this.q;
        alphaBlendingStateEffect.hoveredCheckedAlpha = this.s;
        alphaBlendingStateEffect.initStates();
    }

    public void b() {
        g();
        a();
    }

    public void c(int i, int i2, int i3, int i4) {
        this.j = i;
        this.f10329k = i2;
        this.l = i3;
        this.m = i4;
    }

    public void d(int i, int i2) {
        if (i2 == 3) {
            this.g = new float[8];
            return;
        }
        if (i2 == 2) {
            float f = i;
            this.g = new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
        } else if (i2 == 4) {
            float f2 = i;
            this.g = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f2, f2, f2, f2};
        } else {
            float f3 = i;
            this.g = new float[]{f3, f3, f3, f3, f3, f3, f3, f3};
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (isVisible()) {
            this.h.reset();
            this.h.addRoundRect(this.f, this.g, Path.Direction.CW);
            canvas.drawPath(this.h, this.i);
        }
    }

    public void e(int i) {
        if (this.c == i) {
            return;
        }
        this.c = i;
        this.f10328b.f10332b = i;
        this.g = new float[]{i, i, i, i, i, i, i, i};
        invalidateSelf();
    }

    public void f(int i, int i2) {
        this.c = i;
        this.f10328b.f10332b = i;
        this.d = i2;
        d(i, i2);
        invalidateSelf();
    }

    public final void g() {
        a aVar = this.f10328b;
        aVar.f10331a = this.e;
        int i = this.c;
        aVar.f10332b = i;
        aVar.e = this.n;
        aVar.f = this.o;
        aVar.g = this.p;
        aVar.f10333k = this.t;
        aVar.h = this.q;
        aVar.i = this.f10330r;
        aVar.j = this.s;
        aVar.c = this.u;
        aVar.d = this.v;
        d(i, this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f10328b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.v;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, d4j.n, 0, 0) : resources.obtainAttributes(attributeSet, d4j.n);
        this.e = typedArrayObtainStyledAttributes.getColor(d4j.w, -16777216);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(d4j.x, 0);
        this.n = typedArrayObtainStyledAttributes.getFloat(d4j.u, 0.0f);
        this.o = typedArrayObtainStyledAttributes.getFloat(d4j.v, 0.0f);
        float f = typedArrayObtainStyledAttributes.getFloat(d4j.s, 0.0f);
        this.p = f;
        this.t = typedArrayObtainStyledAttributes.getFloat(d4j.q, f);
        this.q = typedArrayObtainStyledAttributes.getFloat(d4j.o, 0.0f);
        this.f10330r = typedArrayObtainStyledAttributes.getFloat(d4j.p, 0.0f);
        this.s = typedArrayObtainStyledAttributes.getFloat(d4j.t, 0.0f);
        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(d4j.y, -1);
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(d4j.f15080r, -1);
        typedArrayObtainStyledAttributes.recycle();
        a();
        g();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f10327a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        return this;
    }

    @Override // miuix.animation.styles.AlphaBlendingStateEffect.AlphaObserver
    public void onAlphaChanged(float f) {
        this.i.setAlpha((int) (Math.min(Math.max(f, 0.0f), 1.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f.set(rect);
        RectF rectF = this.f;
        rectF.left += this.j;
        rectF.top += this.f10329k;
        rectF.right -= this.l;
        rectF.bottom -= this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return this.f10327a.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public CardStateDrawable(a aVar, Resources resources) {
        this.d = -1;
        this.f = new RectF();
        this.g = new float[8];
        this.h = new Path();
        this.i = new Paint();
        this.u = -1;
        this.v = -1;
        AlphaBlendingStateEffect alphaBlendingStateEffect = new AlphaBlendingStateEffect(this);
        this.f10327a = alphaBlendingStateEffect;
        alphaBlendingStateEffect.setEnableAnim(w);
        this.e = aVar.f10331a;
        this.c = aVar.f10332b;
        this.n = aVar.e;
        this.o = aVar.f;
        this.p = aVar.g;
        this.t = aVar.f10333k;
        this.q = aVar.h;
        this.f10330r = aVar.i;
        this.s = aVar.j;
        this.u = aVar.c;
        this.v = aVar.d;
        this.f10328b = new a();
        g();
        a();
    }
}
