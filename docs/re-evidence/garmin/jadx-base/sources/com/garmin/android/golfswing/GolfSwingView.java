package com.garmin.android.golfswing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* JADX INFO: loaded from: classes11.dex */
public class GolfSwingView extends SurfaceView implements SurfaceHolder.Callback {
    public GolfSwingView(Context context) {
        super(context);
        commonConstructorSetup(context);
    }

    private void commonConstructorSetup(Context context) {
        getHolder().addCallback(this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i14, int i15, int i16) {
        GolfSwingViewManager.getInstance().surfaceChanged(surfaceHolder.getSurface(), i15, i16);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public GolfSwingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        commonConstructorSetup(context);
    }

    public GolfSwingView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        commonConstructorSetup(context);
    }
}
