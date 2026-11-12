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
import defpackage.d9h;
import defpackage.i9h;
import defpackage.iah;
import defpackage.j9h;
import defpackage.jah;
import defpackage.p9h;
import defpackage.u9h;
import defpackage.wuh;

/* JADX INFO: loaded from: classes4.dex */
public class PhotoView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wuh f7761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView.ScaleType f7762b;

    public PhotoView(Context context) {
        this(context, null);
    }

    private void init() {
        this.f7761a = new wuh(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f7762b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f7762b = null;
        }
    }

    public wuh getAttacher() {
        return this.f7761a;
    }

    public RectF getDisplayRect() {
        return this.f7761a.B();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f7761a.E();
    }

    public float getMaximumScale() {
        return this.f7761a.H();
    }

    public float getMediumScale() {
        return this.f7761a.I();
    }

    public float getMinimumScale() {
        return this.f7761a.J();
    }

    public float getScale() {
        return this.f7761a.K();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f7761a.L();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f7761a.O(z);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f7761a.b0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        wuh wuhVar = this.f7761a;
        if (wuhVar != null) {
            wuhVar.b0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        wuh wuhVar = this.f7761a;
        if (wuhVar != null) {
            wuhVar.b0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        wuh wuhVar = this.f7761a;
        if (wuhVar != null) {
            wuhVar.b0();
        }
    }

    public void setMaximumScale(float f) {
        this.f7761a.Q(f);
    }

    public void setMediumScale(float f) {
        this.f7761a.R(f);
    }

    public void setMinimumScale(float f) {
        this.f7761a.S(f);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7761a.setOnClickListener(onClickListener);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f7761a.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f7761a.setOnLongClickListener(onLongClickListener);
    }

    public void setOnMatrixChangeListener(d9h d9hVar) {
        this.f7761a.setOnMatrixChangeListener(d9hVar);
    }

    public void setOnOutsidePhotoTapListener(i9h i9hVar) {
        this.f7761a.setOnOutsidePhotoTapListener(i9hVar);
    }

    public void setOnPhotoTapListener(j9h j9hVar) {
        this.f7761a.setOnPhotoTapListener(j9hVar);
    }

    public void setOnScaleChangeListener(p9h p9hVar) {
        this.f7761a.setOnScaleChangeListener(p9hVar);
    }

    public void setOnSingleFlingListener(u9h u9hVar) {
        this.f7761a.setOnSingleFlingListener(u9hVar);
    }

    public void setOnViewDragListener(iah iahVar) {
        this.f7761a.setOnViewDragListener(iahVar);
    }

    public void setOnViewTapListener(jah jahVar) {
        this.f7761a.setOnViewTapListener(jahVar);
    }

    public void setRotationBy(float f) {
        this.f7761a.T(f);
    }

    public void setRotationTo(float f) {
        this.f7761a.U(f);
    }

    public void setScale(float f) {
        this.f7761a.V(f);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        wuh wuhVar = this.f7761a;
        if (wuhVar == null) {
            this.f7762b = scaleType;
        } else {
            wuhVar.Y(scaleType);
        }
    }

    public void setZoomTransitionDuration(int i) {
        this.f7761a.Z(i);
    }

    public void setZoomable(boolean z) {
        this.f7761a.a0(z);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
