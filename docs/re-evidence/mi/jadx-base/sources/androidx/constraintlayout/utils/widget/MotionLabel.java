package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import defpackage.ir5;
import defpackage.px9;
import defpackage.qii;
import defpackage.u4j;

/* JADX INFO: loaded from: classes.dex */
public class MotionLabel extends View implements px9 {
    public float A;
    public float B;
    public float C;
    public Drawable D;
    public Matrix E;
    public Bitmap F;
    public BitmapShader G;
    public Matrix H;
    public float I;
    public float J;
    public float K;
    public float L;
    public Paint M;
    public int N;
    public Rect O;
    public Paint P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextPaint f1988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Path f1989b;
    public int c;
    public int d;
    public boolean e;
    public float f;
    public float g;
    public ViewOutlineProvider h;
    public RectF i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1990k;
    public int l;
    public int m;
    public float n;
    public String o;
    public boolean p;
    public Rect q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1991r;
    public int s;
    public int t;
    public int u;
    public String v;
    public Layout w;
    public int x;
    public int y;
    public boolean z;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = MotionLabel.this.getWidth();
            int height = MotionLabel.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionLabel.this.f) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.g);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.f1988a = new TextPaint();
        this.f1989b = new Path();
        this.c = 65535;
        this.d = 65535;
        this.e = false;
        this.f = 0.0f;
        this.g = Float.NaN;
        this.j = 48.0f;
        this.f1990k = Float.NaN;
        this.n = 0.0f;
        this.o = "Hello World";
        this.p = true;
        this.q = new Rect();
        this.f1991r = 1;
        this.s = 1;
        this.t = 1;
        this.u = 1;
        this.x = 8388659;
        this.y = 0;
        this.z = false;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = new Paint();
        this.N = 0;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        this.U = Float.NaN;
        g(context, null);
    }

    private float getHorizontalOffset() {
        float f = Float.isNaN(this.f1990k) ? 1.0f : this.j / this.f1990k;
        TextPaint textPaint = this.f1988a;
        String str = this.o;
        return (((((Float.isNaN(this.B) ? getMeasuredWidth() : this.B) - getPaddingLeft()) - getPaddingRight()) - (f * textPaint.measureText(str, 0, str.length()))) * (this.K + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f = Float.isNaN(this.f1990k) ? 1.0f : this.j / this.f1990k;
        Paint.FontMetrics fontMetrics = this.f1988a.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.C) ? getMeasuredHeight() : this.C) - getPaddingTop()) - getPaddingBottom();
        float f2 = fontMetrics.descent;
        float f3 = fontMetrics.ascent;
        return (((measuredHeight - ((f2 - f3) * f)) * (1.0f - this.L)) / 2.0f) - (f * f3);
    }

    @Override // defpackage.px9
    public void a(float f, float f2, float f3, float f4) {
        int i = (int) (f + 0.5f);
        this.A = f - i;
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f5 = f3 - f;
        this.B = f5;
        float f6 = f4 - f2;
        this.C = f6;
        d(f, f2, f3, f4);
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.z) {
            if (this.O == null) {
                this.P = new Paint();
                this.O = new Rect();
                this.P.set(this.f1988a);
                this.Q = this.P.getTextSize();
            }
            this.B = f5;
            this.C = f6;
            Paint paint = this.P;
            String str = this.o;
            paint.getTextBounds(str, 0, str.length(), this.O);
            int iWidth = this.O.width();
            float fHeight = this.O.height() * 1.3f;
            float f7 = (f5 - this.s) - this.f1991r;
            float f8 = (f6 - this.u) - this.t;
            float f9 = iWidth;
            if (f9 * f8 > fHeight * f7) {
                this.f1988a.setTextSize((this.Q * f7) / f9);
            } else {
                this.f1988a.setTextSize((this.Q * f8) / fHeight);
            }
            if (this.e || !Float.isNaN(this.f1990k)) {
                f(Float.isNaN(this.f1990k) ? 1.0f : this.j / this.f1990k);
            }
        }
    }

    public final void d(float f, float f2, float f3, float f4) {
        if (this.H == null) {
            return;
        }
        this.B = f3 - f;
        this.C = f4 - f2;
        l();
    }

    public Bitmap e(Bitmap bitmap, int i) {
        System.nanoTime();
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i2 = 0; i2 < i && width >= 32 && height >= 32; i2++) {
            width /= 2;
            height /= 2;
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
        }
        return bitmapCreateScaledBitmap;
    }

    public void f(float f) {
        if (this.e || f != 1.0f) {
            this.f1989b.reset();
            String str = this.o;
            int length = str.length();
            this.f1988a.getTextBounds(str, 0, length, this.q);
            this.f1988a.getTextPath(str, 0, length, 0.0f, 0.0f, this.f1989b);
            if (f != 1.0f) {
                StringBuilder sb = new StringBuilder();
                sb.append(ir5.a());
                sb.append(" scale ");
                sb.append(f);
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.f1989b.transform(matrix);
            }
            Rect rect = this.q;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.p = false;
        }
    }

    public final void g(Context context, AttributeSet attributeSet) {
        i(context, attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u4j.E9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.K9) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == u4j.L9) {
                    this.v = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == u4j.P9) {
                    this.f1990k = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f1990k);
                } else if (index == u4j.F9) {
                    this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.j);
                } else if (index == u4j.H9) {
                    this.l = typedArrayObtainStyledAttributes.getInt(index, this.l);
                } else if (index == u4j.G9) {
                    this.m = typedArrayObtainStyledAttributes.getInt(index, this.m);
                } else if (index == u4j.I9) {
                    this.c = typedArrayObtainStyledAttributes.getColor(index, this.c);
                } else if (index == u4j.N9) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                    this.g = dimension;
                    setRound(dimension);
                } else if (index == u4j.O9) {
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    this.f = f;
                    setRoundPercent(f);
                } else if (index == u4j.J9) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == u4j.M9) {
                    this.y = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == u4j.V9) {
                    this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
                    this.e = true;
                } else if (index == u4j.W9) {
                    this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                    this.e = true;
                } else if (index == u4j.Q9) {
                    this.D = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.e = true;
                } else if (index == u4j.R9) {
                    this.R = typedArrayObtainStyledAttributes.getFloat(index, this.R);
                } else if (index == u4j.S9) {
                    this.S = typedArrayObtainStyledAttributes.getFloat(index, this.S);
                } else if (index == u4j.X9) {
                    this.K = typedArrayObtainStyledAttributes.getFloat(index, this.K);
                } else if (index == u4j.Y9) {
                    this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                } else if (index == u4j.T9) {
                    this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                } else if (index == u4j.U9) {
                    this.T = typedArrayObtainStyledAttributes.getFloat(index, this.T);
                } else if (index == u4j.aa) {
                    this.I = typedArrayObtainStyledAttributes.getDimension(index, this.I);
                } else if (index == u4j.ba) {
                    this.J = typedArrayObtainStyledAttributes.getDimension(index, this.J);
                } else if (index == u4j.Z9) {
                    this.N = typedArrayObtainStyledAttributes.getInt(index, this.N);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        k();
        j();
    }

    public float getRound() {
        return this.g;
    }

    public float getRoundPercent() {
        return this.f;
    }

    public float getScaleFromTextSize() {
        return this.f1990k;
    }

    public float getTextBackgroundPanX() {
        return this.R;
    }

    public float getTextBackgroundPanY() {
        return this.S;
    }

    public float getTextBackgroundRotate() {
        return this.U;
    }

    public float getTextBackgroundZoom() {
        return this.T;
    }

    public int getTextOutlineColor() {
        return this.d;
    }

    public float getTextPanX() {
        return this.K;
    }

    public float getTextPanY() {
        return this.L;
    }

    public float getTextureHeight() {
        return this.I;
    }

    public float getTextureWidth() {
        return this.J;
    }

    public Typeface getTypeface() {
        return this.f1988a.getTypeface();
    }

    public final void h(String str, int i, int i2) {
        Typeface typefaceCreate;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i2);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
                return;
            }
        } else {
            typefaceCreate = null;
        }
        if (i == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (i2 <= 0) {
            this.f1988a.setFakeBoldText(false);
            this.f1988a.setTextSkewX(0.0f);
            setTypeface(typefaceCreate);
        } else {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typefaceCreate, i2);
            setTypeface(typefaceDefaultFromStyle);
            int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i2;
            this.f1988a.setFakeBoldText((i3 & 1) != 0);
            this.f1988a.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public final void i(Context context, AttributeSet attributeSet) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(qii.z, typedValue, true);
        TextPaint textPaint = this.f1988a;
        int i = typedValue.data;
        this.c = i;
        textPaint.setColor(i);
    }

    public void j() {
        this.f1991r = getPaddingLeft();
        this.s = getPaddingRight();
        this.t = getPaddingTop();
        this.u = getPaddingBottom();
        h(this.v, this.m, this.l);
        this.f1988a.setColor(this.c);
        this.f1988a.setStrokeWidth(this.n);
        this.f1988a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f1988a.setFlags(128);
        setTextSize(this.j);
        this.f1988a.setAntiAlias(true);
    }

    public final void k() {
        if (this.D != null) {
            this.H = new Matrix();
            int intrinsicWidth = this.D.getIntrinsicWidth();
            int intrinsicHeight = this.D.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.J) ? 128 : (int) this.J;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.I) ? 128 : (int) this.I;
            }
            if (this.N != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.F = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.F);
            this.D.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.D.setFilterBitmap(true);
            this.D.draw(canvas);
            if (this.N != 0) {
                this.F = e(this.F, 4);
            }
            Bitmap bitmap = this.F;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.G = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public final void l() {
        float f = Float.isNaN(this.R) ? 0.0f : this.R;
        float f2 = Float.isNaN(this.S) ? 0.0f : this.S;
        float f3 = Float.isNaN(this.T) ? 1.0f : this.T;
        float f4 = Float.isNaN(this.U) ? 0.0f : this.U;
        this.H.reset();
        float width = this.F.getWidth();
        float height = this.F.getHeight();
        float f5 = Float.isNaN(this.J) ? this.B : this.J;
        float f6 = Float.isNaN(this.I) ? this.C : this.I;
        float f7 = f3 * (width * f6 < height * f5 ? f5 / width : f6 / height);
        this.H.postScale(f7, f7);
        float f8 = width * f7;
        float f9 = f5 - f8;
        float f10 = f7 * height;
        float f11 = f6 - f10;
        if (!Float.isNaN(this.I)) {
            f11 = this.I / 2.0f;
        }
        if (!Float.isNaN(this.J)) {
            f9 = this.J / 2.0f;
        }
        this.H.postTranslate((((f * f9) + f5) - f8) * 0.5f, (((f2 * f11) + f6) - f10) * 0.5f);
        this.H.postRotate(f4, f5 / 2.0f, f6 / 2.0f);
        this.G.setLocalMatrix(this.H);
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        boolean zIsNaN = Float.isNaN(this.f1990k);
        float f = zIsNaN ? 1.0f : this.j / this.f1990k;
        this.B = i3 - i;
        this.C = i4 - i2;
        if (this.z) {
            if (this.O == null) {
                this.P = new Paint();
                this.O = new Rect();
                this.P.set(this.f1988a);
                this.Q = this.P.getTextSize();
            }
            Paint paint = this.P;
            String str = this.o;
            paint.getTextBounds(str, 0, str.length(), this.O);
            int iWidth = this.O.width();
            int iHeight = (int) (this.O.height() * 1.3f);
            float f2 = (this.B - this.s) - this.f1991r;
            float f3 = (this.C - this.u) - this.t;
            if (zIsNaN) {
                float f4 = iWidth;
                float f5 = iHeight;
                if (f4 * f3 > f5 * f2) {
                    this.f1988a.setTextSize((this.Q * f2) / f4);
                } else {
                    this.f1988a.setTextSize((this.Q * f3) / f5);
                }
            } else {
                float f6 = iWidth;
                float f7 = iHeight;
                f = f6 * f3 > f7 * f2 ? f2 / f6 : f3 / f7;
            }
        }
        if (this.e || !zIsNaN) {
            d(i, i2, i3, i4);
            f(f);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f = Float.isNaN(this.f1990k) ? 1.0f : this.j / this.f1990k;
        super.onDraw(canvas);
        if (!this.e && f == 1.0f) {
            canvas.drawText(this.o, this.A + this.f1991r + getHorizontalOffset(), this.t + getVerticalOffset(), this.f1988a);
            return;
        }
        if (this.p) {
            f(f);
        }
        if (this.E == null) {
            this.E = new Matrix();
        }
        if (!this.e) {
            float horizontalOffset = this.f1991r + getHorizontalOffset();
            float verticalOffset = this.t + getVerticalOffset();
            this.E.reset();
            this.E.preTranslate(horizontalOffset, verticalOffset);
            this.f1989b.transform(this.E);
            this.f1988a.setColor(this.c);
            this.f1988a.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f1988a.setStrokeWidth(this.n);
            canvas.drawPath(this.f1989b, this.f1988a);
            this.E.reset();
            this.E.preTranslate(-horizontalOffset, -verticalOffset);
            this.f1989b.transform(this.E);
            return;
        }
        this.M.set(this.f1988a);
        this.E.reset();
        float horizontalOffset2 = this.f1991r + getHorizontalOffset();
        float verticalOffset2 = this.t + getVerticalOffset();
        this.E.postTranslate(horizontalOffset2, verticalOffset2);
        this.E.preScale(f, f);
        this.f1989b.transform(this.E);
        if (this.G != null) {
            this.f1988a.setFilterBitmap(true);
            this.f1988a.setShader(this.G);
        } else {
            this.f1988a.setColor(this.c);
        }
        this.f1988a.setStyle(Paint.Style.FILL);
        this.f1988a.setStrokeWidth(this.n);
        canvas.drawPath(this.f1989b, this.f1988a);
        if (this.G != null) {
            this.f1988a.setShader(null);
        }
        this.f1988a.setColor(this.d);
        this.f1988a.setStyle(Paint.Style.STROKE);
        this.f1988a.setStrokeWidth(this.n);
        canvas.drawPath(this.f1989b, this.f1988a);
        this.E.reset();
        this.E.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f1989b.transform(this.E);
        this.f1988a.set(this.M);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.z = false;
        this.f1991r = getPaddingLeft();
        this.s = getPaddingRight();
        this.t = getPaddingTop();
        this.u = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f1988a;
            String str = this.o;
            textPaint.getTextBounds(str, 0, str.length(), this.q);
            if (mode != 1073741824) {
                size = (int) (this.q.width() + 0.99999f);
            }
            size += this.f1991r + this.s;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f1988a.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.t + this.u + fontMetricsInt;
            }
        } else if (this.y != 0) {
            this.z = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i) {
        if ((i & 8388615) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.x) {
            invalidate();
        }
        this.x = i;
        int i2 = i & 112;
        if (i2 == 48) {
            this.L = -1.0f;
        } else if (i2 != 80) {
            this.L = 0.0f;
        } else {
            this.L = 1.0f;
        }
        int i3 = i & 8388615;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.K = 0.0f;
                        return;
                    }
                }
            }
            this.K = 1.0f;
            return;
        }
        this.K = -1.0f;
    }

    @RequiresApi(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.g = f;
            float f2 = this.f;
            this.f = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.g != f;
        this.g = f;
        if (f != 0.0f) {
            if (this.f1989b == null) {
                this.f1989b = new Path();
            }
            if (this.i == null) {
                this.i = new RectF();
            }
            if (this.h == null) {
                b bVar = new b();
                this.h = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.i.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f1989b.reset();
            Path path = this.f1989b;
            RectF rectF = this.i;
            float f3 = this.g;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float f) {
        boolean z = this.f != f;
        this.f = f;
        if (f != 0.0f) {
            if (this.f1989b == null) {
                this.f1989b = new Path();
            }
            if (this.i == null) {
                this.i = new RectF();
            }
            if (this.h == null) {
                a aVar = new a();
                this.h = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f) / 2.0f;
            this.i.set(0.0f, 0.0f, width, height);
            this.f1989b.reset();
            this.f1989b.addRoundRect(this.i, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.f1990k = f;
    }

    public void setText(CharSequence charSequence) {
        this.o = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.R = f;
        l();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.S = f;
        l();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.U = f;
        l();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.T = f;
        l();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.c = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.d = i;
        this.e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.n = f;
        this.e = true;
        if (Float.isNaN(f)) {
            this.n = 1.0f;
            this.e = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.K = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.L = f;
        invalidate();
    }

    public void setTextSize(float f) {
        this.j = f;
        StringBuilder sb = new StringBuilder();
        sb.append(ir5.a());
        sb.append("  ");
        sb.append(f);
        sb.append(" / ");
        sb.append(this.f1990k);
        TextPaint textPaint = this.f1988a;
        if (!Float.isNaN(this.f1990k)) {
            f = this.f1990k;
        }
        textPaint.setTextSize(f);
        f(Float.isNaN(this.f1990k) ? 1.0f : this.j / this.f1990k);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.I = f;
        l();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.J = f;
        l();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f1988a.getTypeface() != typeface) {
            this.f1988a.setTypeface(typeface);
            if (this.w != null) {
                this.w = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1988a = new TextPaint();
        this.f1989b = new Path();
        this.c = 65535;
        this.d = 65535;
        this.e = false;
        this.f = 0.0f;
        this.g = Float.NaN;
        this.j = 48.0f;
        this.f1990k = Float.NaN;
        this.n = 0.0f;
        this.o = "Hello World";
        this.p = true;
        this.q = new Rect();
        this.f1991r = 1;
        this.s = 1;
        this.t = 1;
        this.u = 1;
        this.x = 8388659;
        this.y = 0;
        this.z = false;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = new Paint();
        this.N = 0;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        this.U = Float.NaN;
        g(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1988a = new TextPaint();
        this.f1989b = new Path();
        this.c = 65535;
        this.d = 65535;
        this.e = false;
        this.f = 0.0f;
        this.g = Float.NaN;
        this.j = 48.0f;
        this.f1990k = Float.NaN;
        this.n = 0.0f;
        this.o = "Hello World";
        this.p = true;
        this.q = new Rect();
        this.f1991r = 1;
        this.s = 1;
        this.t = 1;
        this.u = 1;
        this.x = 8388659;
        this.y = 0;
        this.z = false;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = new Paint();
        this.N = 0;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        this.U = Float.NaN;
        g(context, attributeSet);
    }
}
