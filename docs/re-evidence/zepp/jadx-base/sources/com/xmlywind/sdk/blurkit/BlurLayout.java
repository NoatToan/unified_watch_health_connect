package com.xmlywind.sdk.blurkit;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes22.dex */
public class BlurLayout extends FrameLayout {
    private float a;
    private int b;
    private int c;
    private float d;
    private float e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private RoundedImageView j;
    private WeakReference<View> k;
    private Point l;
    private Bitmap m;
    private Choreographer.FrameCallback n;

    public BlurLayout(Context context) {
        super(context, null);
        this.a = 0.12f;
        this.b = 12;
        this.c = 24;
        this.d = 0.0f;
        this.e = Float.NaN;
        this.n = new Choreographer.FrameCallback() { // from class: com.xmlywind.sdk.blurkit.BlurLayout.1
            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                BlurLayout.this.invalidate();
                Choreographer.getInstance().postFrameCallbackDelayed(this, 1000 / BlurLayout.this.c);
            }
        };
    }

    public BlurLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0.12f;
        this.b = 12;
        this.c = 24;
        this.d = 0.0f;
        this.e = Float.NaN;
        this.n = new Choreographer.FrameCallback() { // from class: com.xmlywind.sdk.blurkit.BlurLayout.1
            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                BlurLayout.this.invalidate();
                Choreographer.getInstance().postFrameCallbackDelayed(this, 1000 / BlurLayout.this.c);
            }
        };
        if (!isInEditMode()) {
            a.a(context);
        }
        RoundedImageView roundedImageView = new RoundedImageView(getContext());
        this.j = roundedImageView;
        roundedImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(this.j);
        setCornerRadius(this.d);
    }

    private Bitmap a(View view, Rect rect, float f) throws b {
        View rootView = view.getRootView();
        int iWidth = (int) (rect.width() * f);
        int iHeight = (int) (rect.height() * f);
        if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0 || iWidth <= 0 || iHeight <= 0) {
            throw new b("No screen available (width or height = 0)");
        }
        float f2 = -rect.left;
        float f3 = -rect.top;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.preScale(f, f);
        matrix.postTranslate(f2 * f, f3 * f);
        canvas.setMatrix(matrix);
        rootView.draw(canvas);
        return bitmapCreateBitmap;
    }

    private PointF a(View view) {
        if (getParent() == null) {
            return new PointF();
        }
        try {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup == null) {
                return new PointF();
            }
            PointF pointFA = a(viewGroup);
            pointFA.offset(view.getX(), view.getY());
            return pointFA;
        } catch (Exception unused) {
            return new PointF();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:52:0x0123  */
    /* JADX WARN: Code duplicated, block: B:53:0x0126  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private Bitmap d() {
        Point positionInScreen;
        int width;
        int height;
        int width2;
        int i;
        int i2;
        int i3;
        int width3;
        int height2;
        int i4;
        int i5;
        Bitmap bitmapA;
        float f;
        Bitmap bitmap = null;
        if (getContext() != null && !isInEditMode()) {
            WeakReference<View> weakReference = this.k;
            if (weakReference == null || weakReference.get() == null) {
                WeakReference<View> weakReference2 = new WeakReference<>(getActivityView());
                this.k = weakReference2;
                if (weakReference2.get() != null) {
                    if (this.h) {
                        if (this.l == null) {
                            this.l = getPositionInScreen();
                        }
                        positionInScreen = this.l;
                    } else {
                        positionInScreen = getPositionInScreen();
                    }
                    super.setAlpha(0.0f);
                    width = this.k.get().getWidth();
                    height = this.k.get().getHeight();
                    width2 = (int) (getWidth() * this.a);
                    float height3 = getHeight();
                    float f2 = this.a;
                    i = (int) (height3 * f2);
                    i2 = (int) (positionInScreen.x * f2);
                    i3 = (int) (positionInScreen.y * f2);
                    width3 = getWidth() / 8;
                    height2 = getHeight() / 8;
                    i4 = -width3;
                    if (i2 + i4 < 0) {
                        i4 = 0;
                    }
                    if ((i2 + width) - width3 > width) {
                        width3 = (width + width) - i2;
                    }
                    i5 = -height2;
                    if (i3 + i5 < 0) {
                        i5 = 0;
                    }
                    if (getHeight() + i3 + height2 > height) {
                        height2 = 0;
                    }
                    if (this.i) {
                        if (this.m == null) {
                            c();
                        }
                        if (width2 != 0 && i != 0) {
                            bitmapA = Bitmap.createBitmap(this.m, i2, i3, width2, i);
                            if (!this.i) {
                                bitmapA = Bitmap.createBitmap(a.a().a(bitmapA, this.b), (int) (Math.abs(i4) * this.a), (int) (Math.abs(i5) * this.a), width2, i);
                            }
                            bitmap = bitmapA;
                            if (Float.isNaN(this.e)) {
                                f = 1.0f;
                            } else {
                                f = this.e;
                            }
                            super.setAlpha(f);
                        }
                    } else {
                        try {
                            View view = this.k.get();
                            int i6 = positionInScreen.x;
                            bitmapA = a(view, new Rect(i6 + i4, positionInScreen.y + i5, width3 + i6 + getWidth() + Math.abs(i4), positionInScreen.y + getHeight() + Math.abs(i5) + height2), this.a);
                            if (!this.i) {
                                bitmapA = Bitmap.createBitmap(a.a().a(bitmapA, this.b), (int) (Math.abs(i4) * this.a), (int) (Math.abs(i5) * this.a), width2, i);
                            }
                            bitmap = bitmapA;
                            if (Float.isNaN(this.e)) {
                                f = 1.0f;
                            } else {
                                f = this.e;
                            }
                            super.setAlpha(f);
                        } catch (b | NullPointerException unused) {
                        }
                    }
                }
            } else {
                if (this.h) {
                    if (this.l == null) {
                        this.l = getPositionInScreen();
                    }
                    positionInScreen = this.l;
                } else {
                    positionInScreen = getPositionInScreen();
                }
                super.setAlpha(0.0f);
                width = this.k.get().getWidth();
                height = this.k.get().getHeight();
                width2 = (int) (getWidth() * this.a);
                float height4 = getHeight();
                float f3 = this.a;
                i = (int) (height4 * f3);
                i2 = (int) (positionInScreen.x * f3);
                i3 = (int) (positionInScreen.y * f3);
                width3 = getWidth() / 8;
                height2 = getHeight() / 8;
                i4 = -width3;
                if (i2 + i4 < 0) {
                    i4 = 0;
                }
                if ((i2 + width) - width3 > width) {
                    width3 = (width + width) - i2;
                }
                i5 = -height2;
                if (i3 + i5 < 0) {
                    i5 = 0;
                }
                if (getHeight() + i3 + height2 > height) {
                    height2 = 0;
                }
                if (this.i) {
                    if (this.m == null) {
                        c();
                    }
                    if (width2 != 0) {
                        bitmapA = Bitmap.createBitmap(this.m, i2, i3, width2, i);
                        if (!this.i) {
                            bitmapA = Bitmap.createBitmap(a.a().a(bitmapA, this.b), (int) (Math.abs(i4) * this.a), (int) (Math.abs(i5) * this.a), width2, i);
                        }
                        bitmap = bitmapA;
                        if (Float.isNaN(this.e)) {
                            f = 1.0f;
                        } else {
                            f = this.e;
                        }
                        super.setAlpha(f);
                    }
                } else {
                    View view2 = this.k.get();
                    int i7 = positionInScreen.x;
                    bitmapA = a(view2, new Rect(i7 + i4, positionInScreen.y + i5, width3 + i7 + getWidth() + Math.abs(i4), positionInScreen.y + getHeight() + Math.abs(i5) + height2), this.a);
                    if (!this.i) {
                        bitmapA = Bitmap.createBitmap(a.a().a(bitmapA, this.b), (int) (Math.abs(i4) * this.a), (int) (Math.abs(i5) * this.a), width2, i);
                    }
                    bitmap = bitmapA;
                    if (Float.isNaN(this.e)) {
                        f = 1.0f;
                    } else {
                        f = this.e;
                    }
                    super.setAlpha(f);
                }
            }
        }
        return bitmap;
    }

    private View getActivityView() {
        try {
            return ((Activity) getContext()).getWindow().getDecorView().findViewById(R.id.content);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    private Point getPositionInScreen() {
        PointF pointFA = a((View) this);
        return new Point((int) pointFA.x, (int) pointFA.y);
    }

    public void a() {
        if (!this.f && this.c > 0) {
            this.f = true;
            Choreographer.getInstance().postFrameCallback(this.n);
        }
    }

    public void b() {
        if (this.f) {
            this.f = false;
            Choreographer.getInstance().removeFrameCallback(this.n);
        }
    }

    public void c() {
        this.i = true;
        WeakReference<View> weakReference = this.k;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View rootView = this.k.get().getRootView();
        try {
            super.setAlpha(0.0f);
            this.m = a(rootView, new Rect(0, 0, rootView.getWidth(), rootView.getHeight()), this.a);
            if (Float.isNaN(this.e)) {
                super.setAlpha(1.0f);
            } else {
                super.setAlpha(this.e);
            }
            this.m = a.a().a(this.m, this.b);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public float getAlpha() {
        return this.e;
    }

    public int getBlurRadius() {
        return this.b;
    }

    public float getCornerRadius() {
        return this.d;
    }

    public float getDownscaleFactor() {
        return this.a;
    }

    public int getFPS() {
        return this.c;
    }

    public boolean getPositionLocked() {
        return this.h;
    }

    public boolean getViewLocked() {
        return this.i;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Bitmap bitmapD = d();
        if (bitmapD != null) {
            this.j.setImageBitmap(bitmapD);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g = true;
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g = false;
        b();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidate();
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.e = f;
        if (this.i) {
            return;
        }
        super.setAlpha(f);
    }

    public void setBlurRadius(int i) {
        this.b = i;
        this.m = null;
        invalidate();
    }

    public void setCornerRadius(float f) {
        this.d = f;
        RoundedImageView roundedImageView = this.j;
        if (roundedImageView != null) {
            roundedImageView.setCornerRadius(f);
        }
        invalidate();
    }

    public void setDownscaleFactor(float f) {
        this.a = f;
        this.m = null;
        invalidate();
    }

    public void setFPS(int i) {
        if (this.f) {
            b();
        }
        this.c = i;
        if (this.g) {
            a();
        }
    }
}
