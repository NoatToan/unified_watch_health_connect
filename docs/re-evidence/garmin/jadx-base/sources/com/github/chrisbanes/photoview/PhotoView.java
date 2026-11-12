package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import ez2.c;
import ez2.d;
import ez2.e;
import ez2.f;
import ez2.g;
import ez2.h;
import ez2.i;
import ez2.j;
import ez2.k;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f52815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView.ScaleType f52816b;

    public PhotoView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f52815a = new j(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f52816b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f52816b = null;
        }
    }

    public j getAttacher() {
        return this.f52815a;
    }

    public RectF getDisplayRect() {
        j jVar = this.f52815a;
        jVar.b();
        Matrix matrixC = jVar.c();
        RectF rectF = jVar.f67558n;
        Drawable drawable = jVar.f67552h.getDrawable();
        if (drawable == null) {
            return null;
        }
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrixC.mapRect(rectF);
        return rectF;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f52815a.f67556l;
    }

    public float getMaximumScale() {
        return this.f52815a.f67549e;
    }

    public float getMediumScale() {
        return this.f52815a.f67548d;
    }

    public float getMinimumScale() {
        return this.f52815a.f67547c;
    }

    public float getScale() {
        return this.f52815a.d();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f52815a.f67567y;
    }

    public void setAllowParentInterceptOnEdge(boolean z14) {
        this.f52815a.f67550f = z14;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i14, int i15, int i16, int i17) {
        boolean frame = super.setFrame(i14, i15, i16, i17);
        if (frame) {
            this.f52815a.f();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        j jVar = this.f52815a;
        if (jVar != null) {
            jVar.f();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i14) {
        super.setImageResource(i14);
        j jVar = this.f52815a;
        if (jVar != null) {
            jVar.f();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        j jVar = this.f52815a;
        if (jVar != null) {
            jVar.f();
        }
    }

    public void setMaximumScale(float f14) {
        j jVar = this.f52815a;
        k.a(jVar.f67547c, jVar.f67548d, f14);
        jVar.f67549e = f14;
    }

    public void setMediumScale(float f14) {
        j jVar = this.f52815a;
        k.a(jVar.f67547c, f14, jVar.f67549e);
        jVar.f67548d = f14;
    }

    public void setMinimumScale(float f14) {
        j jVar = this.f52815a;
        k.a(f14, jVar.f67548d, jVar.f67549e);
        jVar.f67547c = f14;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f52815a.f67561q = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f52815a.f67553i.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f52815a.f67562r = onLongClickListener;
    }

    public void setOnMatrixChangeListener(c cVar) {
        this.f52815a.getClass();
    }

    public void setOnOutsidePhotoTapListener(d dVar) {
        this.f52815a.getClass();
    }

    public void setOnPhotoTapListener(e eVar) {
        this.f52815a.getClass();
    }

    public void setOnScaleChangeListener(f fVar) {
        this.f52815a.getClass();
    }

    public void setOnSingleFlingListener(g gVar) {
        this.f52815a.getClass();
    }

    public void setOnViewDragListener(h hVar) {
        this.f52815a.getClass();
    }

    public void setOnViewTapListener(i iVar) {
        this.f52815a.f67560p = iVar;
    }

    public void setRotationBy(float f14) {
        j jVar = this.f52815a;
        jVar.f67557m.postRotate(f14 % 360.0f);
        jVar.a();
    }

    public void setRotationTo(float f14) {
        j jVar = this.f52815a;
        jVar.f67557m.setRotate(f14 % 360.0f);
        jVar.a();
    }

    public void setScale(float f14) {
        j jVar = this.f52815a;
        ImageView imageView = jVar.f67552h;
        jVar.e(f14, imageView.getRight() / 2, imageView.getBottom() / 2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        j jVar = this.f52815a;
        if (jVar == null) {
            this.f52816b = scaleType;
            return;
        }
        jVar.getClass();
        if (scaleType == null) {
            return;
        }
        if (k.a.f67583a[scaleType.ordinal()] == 1) {
            vb.h.z("Matrix scale type is not supported");
        } else if (scaleType != jVar.f67567y) {
            jVar.f67567y = scaleType;
            jVar.f();
        }
    }

    public void setZoomTransitionDuration(int i14) {
        this.f52815a.f67546b = i14;
    }

    public void setZoomable(boolean z14) {
        j jVar = this.f52815a;
        jVar.f67566x = z14;
        jVar.f();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context) {
        this(context, null);
    }
}
