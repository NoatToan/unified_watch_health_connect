package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.appcompat.widget.AppCompatImageButton;
import defpackage.of1;
import defpackage.u4j;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {
    public ImageFilterView.c d;
    public float e;
    public float f;
    public float g;
    public Path h;
    public ViewOutlineProvider i;
    public RectF j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable[] f1972k;
    public LayerDrawable l;
    public boolean m;
    public Drawable n;
    public Drawable o;
    public float p;
    public float q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f1973r;
    public float s;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterButton.this.f) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.g);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        this.d = new ImageFilterView.c();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = Float.NaN;
        this.f1972k = new Drawable[2];
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.f1973r = Float.NaN;
        this.s = Float.NaN;
        c(context, null);
    }

    private void setOverlay(boolean z) {
        this.m = z;
    }

    public final void c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u4j.J5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.n = typedArrayObtainStyledAttributes.getDrawable(u4j.K5);
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
                } else if (index == u4j.T5) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == u4j.U5) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == u4j.S5) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.m));
                } else if (index == u4j.O5) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.p));
                } else if (index == u4j.P5) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.q));
                } else if (index == u4j.Q5) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.s));
                } else if (index == u4j.R5) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f1973r));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.o = drawable;
            if (this.n == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.o = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f1972k;
                    Drawable drawableMutate = drawable2.mutate();
                    this.o = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f1972k;
            Drawable drawableMutate2 = getDrawable().mutate();
            this.o = drawableMutate2;
            drawableArr2[0] = drawableMutate2;
            this.f1972k[1] = this.n.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f1972k);
            this.l = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.e * 255.0f));
            if (!this.m) {
                this.l.getDrawable(0).setAlpha((int) ((1.0f - this.e) * 255.0f));
            }
            super.setImageDrawable(this.l);
        }
    }

    public final void d() {
        if (Float.isNaN(this.p) && Float.isNaN(this.q) && Float.isNaN(this.f1973r) && Float.isNaN(this.s)) {
            return;
        }
        float f = Float.isNaN(this.p) ? 0.0f : this.p;
        float f2 = Float.isNaN(this.q) ? 0.0f : this.q;
        float f3 = Float.isNaN(this.f1973r) ? 1.0f : this.f1973r;
        float f4 = Float.isNaN(this.s) ? 0.0f : this.s;
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

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public final void e() {
        if (Float.isNaN(this.p) && Float.isNaN(this.q) && Float.isNaN(this.f1973r) && Float.isNaN(this.s)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            d();
        }
    }

    public float getContrast() {
        return this.d.f;
    }

    public float getCrossfade() {
        return this.e;
    }

    public float getImagePanX() {
        return this.p;
    }

    public float getImagePanY() {
        return this.q;
    }

    public float getImageRotate() {
        return this.s;
    }

    public float getImageZoom() {
        return this.f1973r;
    }

    public float getRound() {
        return this.g;
    }

    public float getRoundPercent() {
        return this.f;
    }

    public float getSaturation() {
        return this.d.e;
    }

    public float getWarmth() {
        return this.d.g;
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        d();
    }

    public void setAltImageResource(int i) {
        Drawable drawableMutate = of1.b(getContext(), i).mutate();
        this.n = drawableMutate;
        Drawable[] drawableArr = this.f1972k;
        drawableArr[0] = this.o;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f1972k);
        this.l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.e);
    }

    public void setBrightness(float f) {
        ImageFilterView.c cVar = this.d;
        cVar.d = f;
        cVar.c(this);
    }

    public void setContrast(float f) {
        ImageFilterView.c cVar = this.d;
        cVar.f = f;
        cVar.c(this);
    }

    public void setCrossfade(float f) {
        this.e = f;
        if (this.f1972k != null) {
            if (!this.m) {
                this.l.getDrawable(0).setAlpha((int) ((1.0f - this.e) * 255.0f));
            }
            this.l.getDrawable(1).setAlpha((int) (this.e * 255.0f));
            super.setImageDrawable(this.l);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.n == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.o = drawableMutate;
        Drawable[] drawableArr = this.f1972k;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.n;
        LayerDrawable layerDrawable = new LayerDrawable(this.f1972k);
        this.l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.e);
    }

    public void setImagePanX(float f) {
        this.p = f;
        e();
    }

    public void setImagePanY(float f) {
        this.q = f;
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.n == null) {
            super.setImageResource(i);
            return;
        }
        Drawable drawableMutate = of1.b(getContext(), i).mutate();
        this.o = drawableMutate;
        Drawable[] drawableArr = this.f1972k;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.n;
        LayerDrawable layerDrawable = new LayerDrawable(this.f1972k);
        this.l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.e);
    }

    public void setImageRotate(float f) {
        this.s = f;
        e();
    }

    public void setImageZoom(float f) {
        this.f1973r = f;
        e();
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
        ImageFilterView.c cVar = this.d;
        cVar.e = f;
        cVar.c(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.c cVar = this.d;
        cVar.g = f;
        cVar.c(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new ImageFilterView.c();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = Float.NaN;
        this.f1972k = new Drawable[2];
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.f1973r = Float.NaN;
        this.s = Float.NaN;
        c(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new ImageFilterView.c();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = Float.NaN;
        this.f1972k = new Drawable[2];
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.f1973r = Float.NaN;
        this.s = Float.NaN;
        c(context, attributeSet);
    }
}
