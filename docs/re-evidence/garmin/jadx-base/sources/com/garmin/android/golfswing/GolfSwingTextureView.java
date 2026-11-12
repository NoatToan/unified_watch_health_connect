package com.garmin.android.golfswing;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;

/* JADX INFO: loaded from: classes11.dex */
public class GolfSwingTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public GolfSwingTextureView(Context context) {
        super(context);
        commonConstructorSetup(context);
    }

    private void commonConstructorSetup(Context context) {
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i14, int i15) {
        GolfSwingViewManager.getInstance().surfaceChanged(new Surface(surfaceTexture), i14, i15);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i14, int i15) {
        GolfSwingViewManager.getInstance().surfaceChanged(new Surface(surfaceTexture), i14, i15);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public GolfSwingTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        commonConstructorSetup(context);
    }

    public GolfSwingTextureView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        commonConstructorSetup(context);
    }
}
