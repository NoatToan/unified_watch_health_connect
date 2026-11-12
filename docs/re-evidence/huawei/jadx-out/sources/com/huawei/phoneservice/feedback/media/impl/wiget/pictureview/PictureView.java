package com.huawei.phoneservice.feedback.media.impl.wiget.pictureview;

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

/* JADX INFO: loaded from: classes41.dex */
public class PictureView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f21650a;
    private ImageView.ScaleType d;

    public void setZoomable(boolean z) {
        this.f21650a.a(z);
    }

    public void setZoomTransitionDuration(int i) {
        this.f21650a.a(i);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        l lVar = this.f21650a;
        if (lVar == null) {
            this.d = scaleType;
        } else {
            lVar.d(scaleType);
        }
    }

    public void setScale(float f) {
        this.f21650a.j(f);
    }

    public void setRotationTo(float f) {
        this.f21650a.d(f);
    }

    public void setRotationBy(float f) {
        this.f21650a.b(f);
    }

    public void setOnViewTapListener(j jVar) {
        this.f21650a.d(jVar);
    }

    public void setOnViewDragListener(i iVar) {
        this.f21650a.e(iVar);
    }

    public void setOnSingleFlingListener(h hVar) {
        this.f21650a.e(hVar);
    }

    public void setOnScaleChangeListener(g gVar) {
        this.f21650a.c(gVar);
    }

    public void setOnPhotoTapListener(f fVar) {
        this.f21650a.b(fVar);
    }

    public void setOnOutsidePhotoTapListener(e eVar) {
        this.f21650a.b(eVar);
    }

    public void setOnMatrixChangeListener(d dVar) {
        this.f21650a.d(dVar);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f21650a.d(onLongClickListener);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f21650a.b(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f21650a.e(onClickListener);
    }

    public void setMinimumScale(float f) {
        this.f21650a.e(f);
    }

    public void setMediumScale(float f) {
        this.f21650a.a(f);
    }

    public void setMaximumScale(float f) {
        this.f21650a.c(f);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        l lVar = this.f21650a;
        if (lVar != null) {
            lVar.h();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        l lVar = this.f21650a;
        if (lVar != null) {
            lVar.h();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        l lVar = this.f21650a;
        if (lVar != null) {
            lVar.h();
        }
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f21650a.h();
        }
        return frame;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f21650a.c(z);
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f21650a.g();
    }

    public float getScale() {
        return this.f21650a.j();
    }

    public float getMinimumScale() {
        return this.f21650a.e();
    }

    public float getMediumScale() {
        return this.f21650a.a();
    }

    public float getMaximumScale() {
        return this.f21650a.b();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f21650a.d();
    }

    public RectF getDisplayRect() {
        return this.f21650a.c();
    }

    public l getAttaches() {
        return this.f21650a;
    }

    private void d() {
        this.f21650a = new l(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.d;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.d = null;
        }
    }

    public PictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d();
    }

    public PictureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PictureView(Context context) {
        this(context, null);
    }
}
