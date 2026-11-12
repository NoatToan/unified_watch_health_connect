package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.of1;
import defpackage.u4j;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f1976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1977b;
    public Drawable c;
    public Drawable d;
    public float e;
    public float f;
    public float g;
    public Path h;
    public ViewOutlineProvider i;
    public RectF j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable[] f1978k;
    public LayerDrawable l;
    public float m;
    public float n;
    public float o;
    public float p;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterView.this.f) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.g);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f1981a = new float[20];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ColorMatrix f1982b = new ColorMatrix();
        public ColorMatrix c = new ColorMatrix();
        public float d = 1.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = 1.0f;

        public final void a(float f) {
            float[] fArr = this.f1981a;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public final void b(float f) {
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.f1981a;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public void c(ImageView imageView) {
            boolean z;
            this.f1982b.reset();
            float f = this.e;
            boolean z2 = true;
            if (f != 1.0f) {
                b(f);
                this.f1982b.set(this.f1981a);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.f;
            if (f2 != 1.0f) {
                this.c.setScale(f2, f2, f2, 1.0f);
                this.f1982b.postConcat(this.c);
                z = true;
            }
            float f3 = this.g;
            if (f3 != 1.0f) {
                d(f3);
                this.c.set(this.f1981a);
                this.f1982b.postConcat(this.c);
            } else {
                z2 = z;
            }
            float f4 = this.d;
            if (f4 != 1.0f) {
                a(f4);
                this.c.set(this.f1981a);
                this.f1982b.postConcat(this.c);
            } else if (!z2) {
                imageView.clearColorFilter();
                return;
            }
            imageView.setColorFilter(new ColorMatrixColorFilter(this.f1982b));
        }

        public final void d(float f) {
            float fLog;
            float fPow;
            float fLog2;
            if (f <= 0.0f) {
                f = 0.01f;
            }
            float f2 = (5000.0f / f) / 100.0f;
            if (f2 > 66.0f) {
                double d = f2 - 60.0f;
                fPow = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f2)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            if (f2 < 66.0f) {
                fLog2 = f2 > 19.0f ? (((float) Math.log(f2 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f;
            } else {
                fLog2 = 255.0f;
            }
            float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
            float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
            float[] fArr = this.f1981a;
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = fMin6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        this.f1976a = new c();
        this.f1977b = true;
        this.c = null;
        this.d = null;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = Float.NaN;
        this.f1978k = new Drawable[2];
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        e(context, null);
    }

    private void e(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u4j.J5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.c = typedArrayObtainStyledAttributes.getDrawable(u4j.K5);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.N5) {
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == u4j.W5) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == u4j.V5) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == u4j.M5) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == u4j.L5) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == u4j.T5) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == u4j.U5) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == u4j.S5) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f1977b));
                } else if (index == u4j.O5) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.m));
                } else if (index == u4j.P5) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.n));
                } else if (index == u4j.Q5) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.p));
                } else if (index == u4j.R5) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.o));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.d = drawable;
            if (this.c == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.d = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f1978k;
                    Drawable drawableMutate = drawable2.mutate();
                    this.d = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f1978k;
            Drawable drawableMutate2 = getDrawable().mutate();
            this.d = drawableMutate2;
            drawableArr2[0] = drawableMutate2;
            this.f1978k[1] = this.c.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f1978k);
            this.l = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.e * 255.0f));
            if (!this.f1977b) {
                this.l.getDrawable(0).setAlpha((int) ((1.0f - this.e) * 255.0f));
            }
            super.setImageDrawable(this.l);
        }
    }

    private void f() {
        if (Float.isNaN(this.m) && Float.isNaN(this.n) && Float.isNaN(this.o) && Float.isNaN(this.p)) {
            return;
        }
        float f = Float.isNaN(this.m) ? 0.0f : this.m;
        float f2 = Float.isNaN(this.n) ? 0.0f : this.n;
        float f3 = Float.isNaN(this.o) ? 1.0f : this.o;
        float f4 = Float.isNaN(this.p) ? 0.0f : this.p;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f5 = f3 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f5, f5);
        float f6 = intrinsicWidth * f5;
        float f7 = f5 * intrinsicHeight;
        matrix.postTranslate((((f * (width - f6)) + width) - f6) * 0.5f, (((f2 * (height - f7)) + height) - f7) * 0.5f);
        matrix.postRotate(f4, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void g() {
        if (Float.isNaN(this.m) && Float.isNaN(this.n) && Float.isNaN(this.o) && Float.isNaN(this.p)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            f();
        }
    }

    private void setOverlay(boolean z) {
        this.f1977b = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.f1976a.d;
    }

    public float getContrast() {
        return this.f1976a.f;
    }

    public float getCrossfade() {
        return this.e;
    }

    public float getImagePanX() {
        return this.m;
    }

    public float getImagePanY() {
        return this.n;
    }

    public float getImageRotate() {
        return this.p;
    }

    public float getImageZoom() {
        return this.o;
    }

    public float getRound() {
        return this.g;
    }

    public float getRoundPercent() {
        return this.f;
    }

    public float getSaturation() {
        return this.f1976a.e;
    }

    public float getWarmth() {
        return this.f1976a.g;
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        f();
    }

    public void setAltImageResource(int i) {
        Drawable drawableMutate = of1.b(getContext(), i).mutate();
        this.c = drawableMutate;
        Drawable[] drawableArr = this.f1978k;
        drawableArr[0] = this.d;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f1978k);
        this.l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.e);
    }

    public void setBrightness(float f) {
        c cVar = this.f1976a;
        cVar.d = f;
        cVar.c(this);
    }

    public void setContrast(float f) {
        c cVar = this.f1976a;
        cVar.f = f;
        cVar.c(this);
    }

    public void setCrossfade(float f) {
        this.e = f;
        if (this.f1978k != null) {
            if (!this.f1977b) {
                this.l.getDrawable(0).setAlpha((int) ((1.0f - this.e) * 255.0f));
            }
            this.l.getDrawable(1).setAlpha((int) (this.e * 255.0f));
            super.setImageDrawable(this.l);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.c == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.d = drawableMutate;
        Drawable[] drawableArr = this.f1978k;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.c;
        LayerDrawable layerDrawable = new LayerDrawable(this.f1978k);
        this.l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.e);
    }

    public void setImagePanX(float f) {
        this.m = f;
        g();
    }

    public void setImagePanY(float f) {
        this.n = f;
        g();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.c == null) {
            super.setImageResource(i);
            return;
        }
        Drawable drawableMutate = of1.b(getContext(), i).mutate();
        this.d = drawableMutate;
        Drawable[] drawableArr = this.f1978k;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.c;
        LayerDrawable layerDrawable = new LayerDrawable(this.f1978k);
        this.l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.e);
    }

    public void setImageRotate(float f) {
        this.p = f;
        g();
    }

    public void setImageZoom(float f) {
        this.o = f;
        g();
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
            if (this.h == null) {
                this.h = new Path();
            }
            if (this.j == null) {
                this.j = new RectF();
            }
            if (this.i == null) {
                b bVar = new b();
                this.i = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.h.reset();
            Path path = this.h;
            RectF rectF = this.j;
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
            if (this.h == null) {
                this.h = new Path();
            }
            if (this.j == null) {
                this.j = new RectF();
            }
            if (this.i == null) {
                a aVar = new a();
                this.i = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f) / 2.0f;
            this.j.set(0.0f, 0.0f, width, height);
            this.h.reset();
            this.h.addRoundRect(this.j, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        c cVar = this.f1976a;
        cVar.e = f;
        cVar.c(this);
    }

    public void setWarmth(float f) {
        c cVar = this.f1976a;
        cVar.g = f;
        cVar.c(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1976a = new c();
        this.f1977b = true;
        this.c = null;
        this.d = null;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = Float.NaN;
        this.f1978k = new Drawable[2];
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        e(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1976a = new c();
        this.f1977b = true;
        this.c = null;
        this.d = null;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = Float.NaN;
        this.f1978k = new Drawable[2];
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        e(context, attributeSet);
    }
}
