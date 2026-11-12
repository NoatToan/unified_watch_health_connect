package com.xiaomi.wearable.play.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class CustomTextureView extends TextureView implements TextureView.SurfaceTextureListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14426b;
    public SurfaceTexture c;
    public TextureView.SurfaceTextureListener d;

    public CustomTextureView(Context context) {
        super(context);
        this.f14425a = false;
        this.f14426b = false;
        a();
    }

    public final void a() {
        addOnAttachStateChangeListener(this);
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        StringBuilder sb = new StringBuilder();
        sb.append("onDetachedFromWindow: mShouldSavedSurfaceTexture=");
        sb.append(this.f14425a);
        this.c = getSurfaceTexture();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        StringBuilder sb = new StringBuilder();
        sb.append("onPreDraw: onMeasure ");
        sb.append(getContext());
        sb.append(",");
        sb.append(getMeasuredHeight());
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener;
        StringBuilder sb = new StringBuilder();
        sb.append("onSurfaceTextureDestroyed: (mSavedSurfaceTexture == null)");
        sb.append(this.c == null);
        if (this.c == null && (surfaceTextureListener = this.d) != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return this.c == null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @SuppressLint({"NewApi"})
    public void onViewDetachedFromWindow(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append("onViewDetachedFromWindow: mSavedSurfaceTexture=");
        sb.append(this.c);
        if (this.c != null) {
            if (!this.f14426b) {
                SurfaceTexture surfaceTexture = getSurfaceTexture();
                SurfaceTexture surfaceTexture2 = this.c;
                if (surfaceTexture != surfaceTexture2) {
                    setSurfaceTexture(surfaceTexture2);
                }
            }
            this.c = null;
        }
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (surfaceTextureListener != this) {
            this.d = surfaceTextureListener;
        } else {
            super.setSurfaceTextureListener(surfaceTextureListener);
        }
    }

    public CustomTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14425a = false;
        this.f14426b = false;
        a();
    }

    public CustomTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14425a = false;
        this.f14426b = false;
        a();
    }
}
