package cn.bingoogolapple.qrcode.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import defpackage.lxi;
import defpackage.ou1;
import defpackage.u3j;

/* JADX INFO: loaded from: classes.dex */
public class ScanBoxView extends View {
    public int A;
    public boolean B;
    public String C;
    public String D;
    public String E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public Drawable O;
    public Bitmap P;
    public float Q;
    public float R;
    public Bitmap S;
    public Bitmap T;
    public Bitmap U;
    public Bitmap V;
    public float W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5504a;
    public StaticLayout a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5505b;
    public int b0;
    public Rect c;
    public boolean c0;
    public float d;
    public boolean d0;
    public float e;
    public boolean e0;
    public Paint f;
    public QRCodeView f0;
    public TextPaint g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5506k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5507r;
    public boolean s;
    public Drawable t;
    public Bitmap u;
    public int v;
    public int w;
    public int x;
    public float y;
    public int z;

    public ScanBoxView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f = paint;
        paint.setAntiAlias(true);
        this.h = Color.parseColor("#33FFFFFF");
        this.i = -1;
        this.j = ou1.g(context, 20.0f);
        this.f5506k = ou1.g(context, 3.0f);
        this.p = ou1.g(context, 1.0f);
        this.q = -1;
        this.o = ou1.g(context, 90.0f);
        this.l = ou1.g(context, 200.0f);
        this.n = ou1.g(context, 140.0f);
        this.f5507r = 0;
        this.s = false;
        this.t = null;
        this.u = null;
        this.v = ou1.g(context, 1.0f);
        this.w = -1;
        this.x = 1000;
        this.y = -1.0f;
        this.z = 1;
        this.A = 0;
        this.B = false;
        this.f5504a = ou1.g(context, 2.0f);
        this.E = null;
        this.F = ou1.p(context, 14.0f);
        this.G = -1;
        this.H = false;
        this.I = ou1.g(context, 20.0f);
        this.J = false;
        this.K = Color.parseColor("#22000000");
        this.L = false;
        this.M = false;
        this.N = false;
        TextPaint textPaint = new TextPaint();
        this.g = textPaint;
        textPaint.setAntiAlias(true);
        this.b0 = ou1.g(context, 4.0f);
        this.c0 = false;
        this.d0 = false;
        this.e0 = false;
    }

    public final void a() {
        Drawable drawable = this.O;
        if (drawable != null) {
            this.U = ((BitmapDrawable) drawable).getBitmap();
        }
        if (this.U == null) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), lxi.f25524a);
            this.U = bitmapDecodeResource;
            this.U = ou1.n(bitmapDecodeResource, this.q);
        }
        Bitmap bitmapA = ou1.a(this.U, 90);
        this.V = bitmapA;
        Bitmap bitmapA2 = ou1.a(bitmapA, 90);
        this.V = bitmapA2;
        this.V = ou1.a(bitmapA2, 90);
        Drawable drawable2 = this.t;
        if (drawable2 != null) {
            this.S = ((BitmapDrawable) drawable2).getBitmap();
        }
        if (this.S == null) {
            Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(getResources(), lxi.f25525b);
            this.S = bitmapDecodeResource2;
            this.S = ou1.n(bitmapDecodeResource2, this.q);
        }
        this.T = ou1.a(this.S, 90);
        this.o += this.A;
        this.W = (this.f5506k * 1.0f) / 2.0f;
        this.g.setTextSize(this.F);
        this.g.setColor(this.G);
        setIsBarcode(this.B);
    }

    public final void b() {
        int width = (getWidth() - this.l) / 2;
        int i = this.o;
        Rect rect = new Rect(width, i, this.l + width, this.m + i);
        this.c = rect;
        if (this.B) {
            float f = rect.left + this.W + 0.5f;
            this.e = f;
            this.R = f;
        } else {
            float f2 = rect.top + this.W + 0.5f;
            this.d = f2;
            this.Q = f2;
        }
        if (this.f0 == null || !l()) {
            return;
        }
        this.f0.j(new Rect(this.c));
    }

    public final void c(Canvas canvas) {
        if (this.v > 0) {
            this.f.setStyle(Paint.Style.STROKE);
            this.f.setColor(this.w);
            this.f.setStrokeWidth(this.v);
            canvas.drawRect(this.c, this.f);
        }
    }

    public final void d(Canvas canvas) {
        if (this.W > 0.0f) {
            this.f.setStyle(Paint.Style.STROKE);
            this.f.setColor(this.i);
            this.f.setStrokeWidth(this.f5506k);
            int i = this.z;
            if (i == 1) {
                Rect rect = this.c;
                int i2 = rect.left;
                float f = this.W;
                int i3 = rect.top;
                canvas.drawLine(i2 - f, i3, (i2 - f) + this.j, i3, this.f);
                Rect rect2 = this.c;
                int i4 = rect2.left;
                int i5 = rect2.top;
                float f2 = this.W;
                canvas.drawLine(i4, i5 - f2, i4, (i5 - f2) + this.j, this.f);
                Rect rect3 = this.c;
                int i6 = rect3.right;
                float f3 = this.W;
                int i7 = rect3.top;
                canvas.drawLine(i6 + f3, i7, (i6 + f3) - this.j, i7, this.f);
                Rect rect4 = this.c;
                int i8 = rect4.right;
                int i9 = rect4.top;
                float f4 = this.W;
                canvas.drawLine(i8, i9 - f4, i8, (i9 - f4) + this.j, this.f);
                Rect rect5 = this.c;
                int i10 = rect5.left;
                float f5 = this.W;
                int i11 = rect5.bottom;
                canvas.drawLine(i10 - f5, i11, (i10 - f5) + this.j, i11, this.f);
                Rect rect6 = this.c;
                int i12 = rect6.left;
                int i13 = rect6.bottom;
                float f6 = this.W;
                canvas.drawLine(i12, i13 + f6, i12, (i13 + f6) - this.j, this.f);
                Rect rect7 = this.c;
                int i14 = rect7.right;
                float f7 = this.W;
                int i15 = rect7.bottom;
                canvas.drawLine(i14 + f7, i15, (i14 + f7) - this.j, i15, this.f);
                Rect rect8 = this.c;
                int i16 = rect8.right;
                int i17 = rect8.bottom;
                float f8 = this.W;
                canvas.drawLine(i16, i17 + f8, i16, (i17 + f8) - this.j, this.f);
                return;
            }
            if (i == 2) {
                Rect rect9 = this.c;
                int i18 = rect9.left;
                int i19 = rect9.top;
                float f9 = this.W;
                canvas.drawLine(i18, i19 + f9, i18 + this.j, i19 + f9, this.f);
                Rect rect10 = this.c;
                int i20 = rect10.left;
                float f10 = this.W;
                int i21 = rect10.top;
                canvas.drawLine(i20 + f10, i21, i20 + f10, i21 + this.j, this.f);
                Rect rect11 = this.c;
                int i22 = rect11.right;
                int i23 = rect11.top;
                float f11 = this.W;
                canvas.drawLine(i22, i23 + f11, i22 - this.j, i23 + f11, this.f);
                Rect rect12 = this.c;
                int i24 = rect12.right;
                float f12 = this.W;
                int i25 = rect12.top;
                canvas.drawLine(i24 - f12, i25, i24 - f12, i25 + this.j, this.f);
                Rect rect13 = this.c;
                int i26 = rect13.left;
                int i27 = rect13.bottom;
                float f13 = this.W;
                canvas.drawLine(i26, i27 - f13, i26 + this.j, i27 - f13, this.f);
                Rect rect14 = this.c;
                int i28 = rect14.left;
                float f14 = this.W;
                int i29 = rect14.bottom;
                canvas.drawLine(i28 + f14, i29, i28 + f14, i29 - this.j, this.f);
                Rect rect15 = this.c;
                int i30 = rect15.right;
                int i31 = rect15.bottom;
                float f15 = this.W;
                canvas.drawLine(i30, i31 - f15, i30 - this.j, i31 - f15, this.f);
                Rect rect16 = this.c;
                int i32 = rect16.right;
                float f16 = this.W;
                int i33 = rect16.bottom;
                canvas.drawLine(i32 - f16, i33, i32 - f16, i33 - this.j, this.f);
            }
        }
    }

    public final void e(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (this.h != 0) {
            this.f.setStyle(Paint.Style.FILL);
            this.f.setColor(this.h);
            float f = width;
            canvas.drawRect(0.0f, 0.0f, f, this.c.top, this.f);
            Rect rect = this.c;
            canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, this.f);
            Rect rect2 = this.c;
            canvas.drawRect(rect2.right + 1, rect2.top, f, rect2.bottom + 1, this.f);
            canvas.drawRect(0.0f, this.c.bottom + 1, f, height, this.f);
        }
    }

    public final void f(Canvas canvas) {
        if (this.B) {
            if (this.P != null) {
                Rect rect = this.c;
                float f = rect.left;
                float f2 = this.W;
                float f3 = rect.top + f2;
                int i = this.f5507r;
                RectF rectF = new RectF(f + f2 + 0.5f, f3 + i, this.R, (rect.bottom - f2) - i);
                Rect rect2 = new Rect((int) (this.P.getWidth() - rectF.width()), 0, this.P.getWidth(), this.P.getHeight());
                if (rect2.left < 0) {
                    rect2.left = 0;
                    rectF.left = rectF.right - rect2.width();
                }
                canvas.drawBitmap(this.P, rect2, rectF, this.f);
                return;
            }
            if (this.u != null) {
                float f4 = this.e;
                canvas.drawBitmap(this.u, (Rect) null, new RectF(f4, this.c.top + this.W + this.f5507r, this.u.getWidth() + f4, (this.c.bottom - this.W) - this.f5507r), this.f);
                return;
            }
            this.f.setStyle(Paint.Style.FILL);
            this.f.setColor(this.q);
            float f5 = this.e;
            Rect rect3 = this.c;
            float f6 = rect3.top;
            float f7 = this.W;
            int i2 = this.f5507r;
            canvas.drawRect(f5, f6 + f7 + i2, this.p + f5, (rect3.bottom - f7) - i2, this.f);
            return;
        }
        if (this.P != null) {
            Rect rect4 = this.c;
            float f8 = rect4.left;
            float f9 = this.W;
            int i3 = this.f5507r;
            RectF rectF2 = new RectF(f8 + f9 + i3, rect4.top + f9 + 0.5f, (rect4.right - f9) - i3, this.Q);
            Rect rect5 = new Rect(0, (int) (this.P.getHeight() - rectF2.height()), this.P.getWidth(), this.P.getHeight());
            if (rect5.top < 0) {
                rect5.top = 0;
                rectF2.top = rectF2.bottom - rect5.height();
            }
            canvas.drawBitmap(this.P, rect5, rectF2, this.f);
            return;
        }
        if (this.u != null) {
            Rect rect6 = this.c;
            float f10 = rect6.left;
            float f11 = this.W;
            int i4 = this.f5507r;
            float f12 = this.d;
            canvas.drawBitmap(this.u, (Rect) null, new RectF(f10 + f11 + i4, f12, (rect6.right - f11) - i4, this.u.getHeight() + f12), this.f);
            return;
        }
        this.f.setStyle(Paint.Style.FILL);
        this.f.setColor(this.q);
        Rect rect7 = this.c;
        float f13 = rect7.left;
        float f14 = this.W;
        int i5 = this.f5507r;
        float f15 = this.d;
        canvas.drawRect(f13 + f14 + i5, f15, (rect7.right - f14) - i5, f15 + this.p, this.f);
    }

    public final void g(Canvas canvas) {
        if (TextUtils.isEmpty(this.E) || this.a0 == null) {
            return;
        }
        if (this.H) {
            if (this.L) {
                this.f.setColor(this.K);
                this.f.setStyle(Paint.Style.FILL);
                if (this.J) {
                    Rect rect = new Rect();
                    TextPaint textPaint = this.g;
                    String str = this.E;
                    textPaint.getTextBounds(str, 0, str.length(), rect);
                    float width = ((canvas.getWidth() - rect.width()) / 2) - this.b0;
                    RectF rectF = new RectF(width, (this.c.bottom + this.I) - this.b0, rect.width() + width + (this.b0 * 2), this.c.bottom + this.I + this.a0.getHeight() + this.b0);
                    int i = this.b0;
                    canvas.drawRoundRect(rectF, i, i, this.f);
                } else {
                    Rect rect2 = this.c;
                    float f = rect2.left;
                    int i2 = rect2.bottom;
                    int i3 = this.I;
                    RectF rectF2 = new RectF(f, (i2 + i3) - this.b0, rect2.right, i2 + i3 + this.a0.getHeight() + this.b0);
                    int i4 = this.b0;
                    canvas.drawRoundRect(rectF2, i4, i4, this.f);
                }
            }
            canvas.save();
            if (this.J) {
                canvas.translate(0.0f, this.c.bottom + this.I);
            } else {
                Rect rect3 = this.c;
                canvas.translate(rect3.left + this.b0, rect3.bottom + this.I);
            }
            this.a0.draw(canvas);
            canvas.restore();
            return;
        }
        if (this.L) {
            this.f.setColor(this.K);
            this.f.setStyle(Paint.Style.FILL);
            if (this.J) {
                Rect rect4 = new Rect();
                TextPaint textPaint2 = this.g;
                String str2 = this.E;
                textPaint2.getTextBounds(str2, 0, str2.length(), rect4);
                float width2 = ((canvas.getWidth() - rect4.width()) / 2) - this.b0;
                float height = ((this.c.top - this.I) - this.a0.getHeight()) - this.b0;
                float fWidth = rect4.width() + width2;
                int i5 = this.b0;
                RectF rectF3 = new RectF(width2, height, fWidth + (i5 * 2), (this.c.top - this.I) + i5);
                int i6 = this.b0;
                canvas.drawRoundRect(rectF3, i6, i6, this.f);
            } else {
                Rect rect5 = this.c;
                float f2 = rect5.left;
                int height2 = (rect5.top - this.I) - this.a0.getHeight();
                int i7 = this.b0;
                Rect rect6 = this.c;
                RectF rectF4 = new RectF(f2, height2 - i7, rect6.right, (rect6.top - this.I) + i7);
                int i8 = this.b0;
                canvas.drawRoundRect(rectF4, i8, i8, this.f);
            }
        }
        canvas.save();
        if (this.J) {
            canvas.translate(0.0f, (this.c.top - this.I) - this.a0.getHeight());
        } else {
            Rect rect7 = this.c;
            canvas.translate(rect7.left + this.b0, (rect7.top - this.I) - this.a0.getHeight());
        }
        this.a0.draw(canvas);
        canvas.restore();
    }

    public int getAnimTime() {
        return this.x;
    }

    public String getBarCodeTipText() {
        return this.D;
    }

    public int getBarcodeRectHeight() {
        return this.n;
    }

    public int getBorderColor() {
        return this.w;
    }

    public int getBorderSize() {
        return this.v;
    }

    public int getCornerColor() {
        return this.i;
    }

    public int getCornerLength() {
        return this.j;
    }

    public int getCornerSize() {
        return this.f5506k;
    }

    public Drawable getCustomScanLineDrawable() {
        return this.t;
    }

    public float getHalfCornerSize() {
        return this.W;
    }

    public boolean getIsBarcode() {
        return this.B;
    }

    public int getMaskColor() {
        return this.h;
    }

    public String getQRCodeTipText() {
        return this.C;
    }

    public int getRectHeight() {
        return this.m;
    }

    public int getRectWidth() {
        return this.l;
    }

    public Bitmap getScanLineBitmap() {
        return this.u;
    }

    public int getScanLineColor() {
        return this.q;
    }

    public int getScanLineMargin() {
        return this.f5507r;
    }

    public int getScanLineSize() {
        return this.p;
    }

    public int getTipBackgroundColor() {
        return this.K;
    }

    public int getTipBackgroundRadius() {
        return this.b0;
    }

    public String getTipText() {
        return this.E;
    }

    public int getTipTextColor() {
        return this.G;
    }

    public int getTipTextMargin() {
        return this.I;
    }

    public int getTipTextSize() {
        return this.F;
    }

    public StaticLayout getTipTextSl() {
        return this.a0;
    }

    public int getToolbarHeight() {
        return this.A;
    }

    public int getTopOffset() {
        return this.o;
    }

    public float getVerticalBias() {
        return this.y;
    }

    public Rect h(int i) {
        if (!this.c0 || getVisibility() != 0) {
            return null;
        }
        Rect rect = new Rect(this.c);
        float measuredHeight = (i * 1.0f) / getMeasuredHeight();
        float fExactCenterX = rect.exactCenterX();
        float fExactCenterY = rect.exactCenterY();
        float fWidth = (rect.width() / 2.0f) * measuredHeight;
        float fHeight = (rect.height() / 2.0f) * measuredHeight;
        rect.left = (int) (fExactCenterX - fWidth);
        rect.right = (int) (fExactCenterX + fWidth);
        rect.top = (int) (fExactCenterY - fHeight);
        rect.bottom = (int) (fExactCenterY + fHeight);
        return rect;
    }

    public void i(QRCodeView qRCodeView, AttributeSet attributeSet) {
        this.f0 = qRCodeView;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u3j.f35338a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            j(typedArrayObtainStyledAttributes.getIndex(i), typedArrayObtainStyledAttributes);
        }
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    public final void j(int i, TypedArray typedArray) {
        if (i == u3j.H) {
            this.o = typedArray.getDimensionPixelSize(i, this.o);
            return;
        }
        if (i == u3j.j) {
            this.f5506k = typedArray.getDimensionPixelSize(i, this.f5506k);
            return;
        }
        if (i == u3j.i) {
            this.j = typedArray.getDimensionPixelSize(i, this.j);
            return;
        }
        if (i == u3j.B) {
            this.p = typedArray.getDimensionPixelSize(i, this.p);
            return;
        }
        if (i == u3j.y) {
            this.l = typedArray.getDimensionPixelSize(i, this.l);
            return;
        }
        if (i == u3j.w) {
            this.h = typedArray.getColor(i, this.h);
            return;
        }
        if (i == u3j.g) {
            this.i = typedArray.getColor(i, this.i);
            return;
        }
        if (i == u3j.z) {
            this.q = typedArray.getColor(i, this.q);
            return;
        }
        if (i == u3j.A) {
            this.f5507r = typedArray.getDimensionPixelSize(i, this.f5507r);
            return;
        }
        if (i == u3j.f35341r) {
            this.s = typedArray.getBoolean(i, this.s);
            return;
        }
        if (i == u3j.l) {
            this.t = typedArray.getDrawable(i);
            return;
        }
        if (i == u3j.f) {
            this.v = typedArray.getDimensionPixelSize(i, this.v);
            return;
        }
        if (i == u3j.e) {
            this.w = typedArray.getColor(i, this.w);
            return;
        }
        if (i == u3j.f35339b) {
            this.x = typedArray.getInteger(i, this.x);
            return;
        }
        if (i == u3j.I) {
            this.y = typedArray.getFloat(i, this.y);
            return;
        }
        if (i == u3j.h) {
            this.z = typedArray.getInteger(i, this.z);
            return;
        }
        if (i == u3j.G) {
            this.A = typedArray.getDimensionPixelSize(i, this.A);
            return;
        }
        if (i == u3j.d) {
            this.n = typedArray.getDimensionPixelSize(i, this.n);
            return;
        }
        if (i == u3j.n) {
            this.B = typedArray.getBoolean(i, this.B);
            return;
        }
        if (i == u3j.c) {
            this.D = typedArray.getString(i);
            return;
        }
        if (i == u3j.x) {
            this.C = typedArray.getString(i);
            return;
        }
        if (i == u3j.F) {
            this.F = typedArray.getDimensionPixelSize(i, this.F);
            return;
        }
        if (i == u3j.D) {
            this.G = typedArray.getColor(i, this.G);
            return;
        }
        if (i == u3j.v) {
            this.H = typedArray.getBoolean(i, this.H);
            return;
        }
        if (i == u3j.E) {
            this.I = typedArray.getDimensionPixelSize(i, this.I);
            return;
        }
        if (i == u3j.u) {
            this.J = typedArray.getBoolean(i, this.J);
            return;
        }
        if (i == u3j.t) {
            this.L = typedArray.getBoolean(i, this.L);
            return;
        }
        if (i == u3j.C) {
            this.K = typedArray.getColor(i, this.K);
            return;
        }
        if (i == u3j.p) {
            this.M = typedArray.getBoolean(i, this.M);
            return;
        }
        if (i == u3j.q) {
            this.N = typedArray.getBoolean(i, this.N);
            return;
        }
        if (i == u3j.f35340k) {
            this.O = typedArray.getDrawable(i);
            return;
        }
        if (i == u3j.o) {
            this.c0 = typedArray.getBoolean(i, this.c0);
        } else if (i == u3j.s) {
            this.d0 = typedArray.getBoolean(i, this.d0);
        } else if (i == u3j.m) {
            this.e0 = typedArray.getBoolean(i, this.e0);
        }
    }

    public boolean k() {
        return this.e0;
    }

    public boolean l() {
        return this.c0;
    }

    public boolean m() {
        return this.d0;
    }

    public final void n() {
        if (this.B) {
            if (this.P == null) {
                this.e += this.f5504a;
                int width = this.p;
                Bitmap bitmap = this.u;
                if (bitmap != null) {
                    width = bitmap.getWidth();
                }
                if (this.M) {
                    float f = this.e;
                    float f2 = width + f;
                    Rect rect = this.c;
                    float f3 = rect.right;
                    float f4 = this.W;
                    if (f2 > f3 - f4 || f < rect.left + f4) {
                        this.f5504a = -this.f5504a;
                    }
                } else {
                    float f5 = this.e + width;
                    Rect rect2 = this.c;
                    float f6 = rect2.right;
                    float f7 = this.W;
                    if (f5 > f6 - f7) {
                        this.e = rect2.left + f7 + 0.5f;
                    }
                }
            } else {
                float f8 = this.R + this.f5504a;
                this.R = f8;
                Rect rect3 = this.c;
                float f9 = rect3.right;
                float f10 = this.W;
                if (f8 > f9 - f10) {
                    this.R = rect3.left + f10 + 0.5f;
                }
            }
        } else if (this.P == null) {
            this.d += this.f5504a;
            int height = this.p;
            Bitmap bitmap2 = this.u;
            if (bitmap2 != null) {
                height = bitmap2.getHeight();
            }
            if (this.M) {
                float f11 = this.d;
                float f12 = height + f11;
                Rect rect4 = this.c;
                float f13 = rect4.bottom;
                float f14 = this.W;
                if (f12 > f13 - f14 || f11 < rect4.top + f14) {
                    this.f5504a = -this.f5504a;
                }
            } else {
                float f15 = this.d + height;
                Rect rect5 = this.c;
                float f16 = rect5.bottom;
                float f17 = this.W;
                if (f15 > f16 - f17) {
                    this.d = rect5.top + f17 + 0.5f;
                }
            }
        } else {
            float f18 = this.Q + this.f5504a;
            this.Q = f18;
            Rect rect6 = this.c;
            float f19 = rect6.bottom;
            float f20 = this.W;
            if (f18 > f19 - f20) {
                this.Q = rect6.top + f20 + 0.5f;
            }
        }
        long j = this.f5505b;
        Rect rect7 = this.c;
        postInvalidateDelayed(j, rect7.left, rect7.top, rect7.right, rect7.bottom);
    }

    public final void o() {
        if (this.O != null || this.N) {
            if (this.B) {
                this.P = this.V;
            } else {
                this.P = this.U;
            }
        } else if (this.t != null || this.s) {
            if (this.B) {
                this.u = this.T;
            } else {
                this.u = this.S;
            }
        }
        if (this.B) {
            this.E = this.D;
            this.m = this.n;
            this.f5505b = (int) (((this.x * 1.0f) * this.f5504a) / this.l);
        } else {
            this.E = this.C;
            int i = this.l;
            this.m = i;
            this.f5505b = (int) (((this.x * 1.0f) * this.f5504a) / i);
        }
        if (!TextUtils.isEmpty(this.E)) {
            if (this.J) {
                this.a0 = new StaticLayout(this.E, this.g, ou1.j(getContext()).x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
            } else {
                this.a0 = new StaticLayout(this.E, this.g, this.l - (this.b0 * 2), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
            }
        }
        if (this.y != -1.0f) {
            int iK = ou1.j(getContext()).y - ou1.k(getContext());
            int i2 = this.A;
            if (i2 == 0) {
                this.o = (int) ((iK * this.y) - (this.m / 2));
            } else {
                this.o = i2 + ((int) (((iK - i2) * this.y) - (this.m / 2)));
            }
        }
        b();
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.c == null) {
            return;
        }
        e(canvas);
        c(canvas);
        d(canvas);
        f(canvas);
        g(canvas);
        n();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }

    public void setAnimTime(int i) {
        this.x = i;
        o();
    }

    public void setAutoZoom(boolean z) {
        this.e0 = z;
    }

    public void setBarCodeTipText(String str) {
        this.D = str;
        o();
    }

    public void setBarcodeRectHeight(int i) {
        this.n = i;
        o();
    }

    public void setBorderColor(int i) {
        this.w = i;
        o();
    }

    public void setBorderSize(int i) {
        this.v = i;
        o();
    }

    public void setCornerColor(int i) {
        this.i = i;
        o();
    }

    public void setCornerLength(int i) {
        this.j = i;
        o();
    }

    public void setCornerSize(int i) {
        this.f5506k = i;
        o();
    }

    public void setCustomScanLineDrawable(Drawable drawable) {
        this.t = drawable;
        o();
    }

    public void setHalfCornerSize(float f) {
        this.W = f;
        o();
    }

    public void setIsBarcode(boolean z) {
        this.B = z;
        o();
    }

    public void setMaskColor(int i) {
        this.h = i;
        o();
    }

    public void setOnlyDecodeScanBoxArea(boolean z) {
        this.c0 = z;
        b();
    }

    public void setQRCodeTipText(String str) {
        this.C = str;
        o();
    }

    public void setRectHeight(int i) {
        this.m = i;
        o();
    }

    public void setRectWidth(int i) {
        this.l = i;
        o();
    }

    public void setScanLineBitmap(Bitmap bitmap) {
        this.u = bitmap;
        o();
    }

    public void setScanLineColor(int i) {
        this.q = i;
        o();
    }

    public void setScanLineMargin(int i) {
        this.f5507r = i;
        o();
    }

    public void setScanLineReverse(boolean z) {
        this.M = z;
        o();
    }

    public void setScanLineSize(int i) {
        this.p = i;
        o();
    }

    public void setShowDefaultGridScanLineDrawable(boolean z) {
        this.N = z;
        o();
    }

    public void setShowDefaultScanLineDrawable(boolean z) {
        this.s = z;
        o();
    }

    public void setShowLocationPoint(boolean z) {
        this.d0 = z;
    }

    public void setShowTipBackground(boolean z) {
        this.L = z;
        o();
    }

    public void setShowTipTextAsSingleLine(boolean z) {
        this.J = z;
        o();
    }

    public void setTipBackgroundColor(int i) {
        this.K = i;
        o();
    }

    public void setTipBackgroundRadius(int i) {
        this.b0 = i;
        o();
    }

    public void setTipText(String str) {
        if (this.B) {
            this.D = str;
        } else {
            this.C = str;
        }
        o();
    }

    public void setTipTextBelowRect(boolean z) {
        this.H = z;
        o();
    }

    public void setTipTextColor(int i) {
        this.G = i;
        this.g.setColor(i);
        o();
    }

    public void setTipTextMargin(int i) {
        this.I = i;
        o();
    }

    public void setTipTextSize(int i) {
        this.F = i;
        this.g.setTextSize(i);
        o();
    }

    public void setTipTextSl(StaticLayout staticLayout) {
        this.a0 = staticLayout;
        o();
    }

    public void setToolbarHeight(int i) {
        this.A = i;
        o();
    }

    public void setTopOffset(int i) {
        this.o = i;
        o();
    }

    public void setVerticalBias(float f) {
        this.y = f;
        o();
    }
}
