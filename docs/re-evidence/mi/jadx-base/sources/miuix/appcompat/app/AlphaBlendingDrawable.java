package miuix.appcompat.app;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.bie;
import defpackage.g5j;
import java.io.IOException;
import miuix.animation.styles.AlphaBlendingStateEffect;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class AlphaBlendingDrawable extends Drawable implements AlphaBlendingStateEffect.AlphaObserver {
    public static final boolean s = !bie.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AlphaBlendingStateEffect f26298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f26299b;
    public int c;
    public int d;
    public final RectF e;
    public float[] f;
    public final Paint g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26300k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f26301r;

    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26303b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;

        public a() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new AlphaBlendingDrawable(new a(this), null);
        }

        public a(a aVar) {
            this.f26302a = aVar.f26302a;
            this.f26303b = aVar.f26303b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.i = aVar.i;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.h;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new AlphaBlendingDrawable(new a(this), resources);
        }
    }

    public AlphaBlendingDrawable() {
        this.e = new RectF();
        this.f = new float[8];
        this.g = new Paint();
        AlphaBlendingStateEffect alphaBlendingStateEffect = new AlphaBlendingStateEffect(this);
        this.f26298a = alphaBlendingStateEffect;
        alphaBlendingStateEffect.setEnableAnim(s);
        this.f26299b = new a();
    }

    private void a() {
        this.g.setColor(this.d);
        AlphaBlendingStateEffect alphaBlendingStateEffect = this.f26298a;
        alphaBlendingStateEffect.normalAlpha = this.l;
        alphaBlendingStateEffect.pressedAlpha = this.m;
        alphaBlendingStateEffect.hoveredAlpha = this.n;
        alphaBlendingStateEffect.focusedAlpha = this.f26301r;
        alphaBlendingStateEffect.checkedAlpha = this.p;
        alphaBlendingStateEffect.activatedAlpha = this.o;
        alphaBlendingStateEffect.hoveredCheckedAlpha = this.q;
        alphaBlendingStateEffect.initStates();
    }

    private void c() {
        a aVar = this.f26299b;
        aVar.f26302a = this.d;
        aVar.f26303b = this.c;
        aVar.c = this.l;
        aVar.d = this.m;
        aVar.e = this.n;
        aVar.i = this.f26301r;
        aVar.f = this.o;
        aVar.g = this.p;
        aVar.h = this.q;
    }

    public void b(int i) {
        if (this.c == i) {
            return;
        }
        this.c = i;
        this.f26299b.f26303b = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (isVisible()) {
            RectF rectF = this.e;
            int i = this.c;
            canvas.drawRoundRect(rectF, i, i, this.g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f26299b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, g5j.M2, 0, 0) : resources.obtainAttributes(attributeSet, g5j.M2);
        this.d = typedArrayObtainStyledAttributes.getColor(g5j.U2, -16777216);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(g5j.V2, 0);
        this.l = typedArrayObtainStyledAttributes.getFloat(g5j.S2, 0.0f);
        this.m = typedArrayObtainStyledAttributes.getFloat(g5j.T2, 0.0f);
        float f = typedArrayObtainStyledAttributes.getFloat(g5j.Q2, 0.0f);
        this.n = f;
        this.f26301r = typedArrayObtainStyledAttributes.getFloat(g5j.P2, f);
        this.o = typedArrayObtainStyledAttributes.getFloat(g5j.N2, 0.0f);
        this.p = typedArrayObtainStyledAttributes.getFloat(g5j.O2, 0.0f);
        this.q = typedArrayObtainStyledAttributes.getFloat(g5j.R2, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        int i = this.c;
        this.f = new float[]{i, i, i, i, i, i, i, i};
        a();
        c();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f26298a.jumpToCurrentState();
    }

    @Override // miuix.animation.styles.AlphaBlendingStateEffect.AlphaObserver
    public void onAlphaChanged(float f) {
        this.g.setAlpha((int) (Math.min(Math.max(f, 0.0f), 1.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.e.set(rect);
        RectF rectF = this.e;
        rectF.left += this.h;
        rectF.top += this.i;
        rectF.right -= this.j;
        rectF.bottom -= this.f26300k;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return this.f26298a.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AlphaBlendingDrawable(a aVar, Resources resources) {
        this.e = new RectF();
        this.f = new float[8];
        this.g = new Paint();
        AlphaBlendingStateEffect alphaBlendingStateEffect = new AlphaBlendingStateEffect(this);
        this.f26298a = alphaBlendingStateEffect;
        alphaBlendingStateEffect.setEnableAnim(s);
        this.d = aVar.f26302a;
        this.c = aVar.f26303b;
        this.l = aVar.c;
        this.m = aVar.d;
        this.n = aVar.e;
        this.f26301r = aVar.i;
        this.o = aVar.f;
        this.p = aVar.g;
        this.q = aVar.h;
        this.f26299b = new a();
        c();
        a();
    }
}
