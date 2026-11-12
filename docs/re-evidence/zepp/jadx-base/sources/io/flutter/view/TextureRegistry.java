package io.flutter.view;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes22.dex */
public interface TextureRegistry {

    public interface SurfaceTextureEntry {
        long id();

        void release();

        SurfaceTexture surfaceTexture();
    }

    SurfaceTextureEntry createSurfaceTexture();
}
