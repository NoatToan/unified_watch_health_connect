package com.journeyapps.barcodescanner.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.SurfaceHolder;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public class CameraSurface {
    private SurfaceHolder a;
    private SurfaceTexture b;

    public CameraSurface(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalArgumentException("surfaceHolder may not be null");
        }
        this.a = surfaceHolder;
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.a;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.b;
    }

    public void setPreview(Camera camera) throws IOException {
        SurfaceHolder surfaceHolder = this.a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            if (Build.VERSION.SDK_INT < 11) {
                throw new IllegalStateException("SurfaceTexture not supported.");
            }
            camera.setPreviewTexture(this.b);
        }
    }

    public CameraSurface(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }
}
