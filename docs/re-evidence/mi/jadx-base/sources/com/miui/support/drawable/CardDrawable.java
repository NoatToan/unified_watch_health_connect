package com.miui.support.drawable;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import defpackage.d4j;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class CardDrawable extends CardStateDrawable {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public a G;
    public final Paint x;
    public final Rect y;
    public int z;

    public static final class a extends CardStateDrawable.a {
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f10326r;
        public boolean s;

        public a() {
            this.s = true;
        }

        @Override // com.miui.support.drawable.CardStateDrawable.a, android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // com.miui.support.drawable.CardStateDrawable.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new CardDrawable();
        }

        @Override // com.miui.support.drawable.CardStateDrawable.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new CardDrawable(new a(this), resources);
        }

        public a(a aVar) {
            super(aVar);
            this.s = true;
            this.l = aVar.l;
            this.m = aVar.m;
            this.n = aVar.n;
            this.o = aVar.o;
            this.p = aVar.p;
            this.q = aVar.q;
            this.f10326r = aVar.f10326r;
            this.s = aVar.s;
        }
    }

    public CardDrawable() {
        this.x = new Paint();
        this.y = new Rect();
        this.F = true;
        this.G = new a();
    }

    @Override // com.miui.support.drawable.CardStateDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (isVisible()) {
            this.h.reset();
            this.h.addRoundRect(this.f, this.g, Path.Direction.CW);
            canvas.drawPath(this.h, this.x);
        }
        super.draw(canvas);
    }

    @Override // com.miui.support.drawable.CardStateDrawable, android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.G;
    }

    @Override // com.miui.support.drawable.CardStateDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (!this.F) {
            super.getOutline(outline);
        } else if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(this.h);
        } else {
            outline.setRoundRect(getBounds(), this.E);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        rect.set(this.y);
        return true;
    }

    public final void h() {
        a aVar = this.G;
        aVar.l = this.z;
        aVar.q = this.E;
        aVar.m = this.A;
        aVar.o = this.C;
        aVar.n = this.B;
        aVar.p = this.D;
        aVar.f10326r = this.d;
        aVar.s = this.F;
        j();
    }

    public final void i(a aVar) {
        this.x.setStyle(Paint.Style.FILL);
        this.z = aVar.l;
        int i = aVar.m;
        this.A = i;
        int i2 = aVar.n;
        this.B = i2;
        int i3 = aVar.o;
        this.C = i3;
        int i4 = aVar.p;
        this.D = i4;
        this.E = aVar.q;
        this.d = aVar.f10326r;
        this.F = aVar.s;
        this.y.set(i, i3, i2, i4);
        this.x.setColor(this.z);
        f(this.E, this.d);
    }

    @Override // com.miui.support.drawable.CardStateDrawable, android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, d4j.e, 0, 0) : resources.obtainAttributes(attributeSet, d4j.e);
        this.x.setStyle(Paint.Style.FILL);
        this.z = typedArrayObtainStyledAttributes.getColor(d4j.f, -16777216);
        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(d4j.i, 0);
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(d4j.j, 0);
        this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(d4j.f15079k, 0);
        this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(d4j.h, 0);
        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(d4j.g, 0);
        this.d = typedArrayObtainStyledAttributes.getInteger(d4j.l, 0);
        this.F = typedArrayObtainStyledAttributes.getBoolean(d4j.m, true);
        this.y.set(this.A, this.C, this.B, this.D);
        this.x.setColor(this.z);
        f(this.E, this.d);
        h();
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void j() {
        a aVar = this.G;
        aVar.f10331a = this.e;
        aVar.f10332b = this.c;
        aVar.e = this.n;
        aVar.f = this.o;
        aVar.g = this.p;
        aVar.f10333k = this.t;
        aVar.h = this.q;
        aVar.i = this.f10330r;
        aVar.j = this.s;
    }

    public CardDrawable(a aVar, Resources resources) {
        super(aVar, resources);
        this.x = new Paint();
        this.y = new Rect();
        this.F = true;
        this.G = new a(aVar);
        i(aVar);
        h();
    }
}
