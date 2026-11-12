package com.huawei.haf.mediaprocess;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import health.compact.a.LogUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class DecodeOutputSurface implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Surface f5990a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5992c;
    private TextureRenderer d;
    private SurfaceTexture e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f5991b = new Object();
    private int j = 0;

    public DecodeOutputSurface() throws IOException {
        d();
    }

    private void d() throws IOException {
        TextureRenderer textureRenderer = new TextureRenderer(this.j);
        this.d = textureRenderer;
        textureRenderer.d();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.d.e());
        this.e = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f5990a = new Surface(this.e);
    }

    public void e() {
        this.f5990a.release();
        this.d = null;
        this.f5990a = null;
        this.e = null;
    }

    public Surface b() {
        return this.f5990a;
    }

    public void a() throws IOException {
        synchronized (this.f5991b) {
            while (!this.f5992c) {
                try {
                    this.f5991b.wait(5000L);
                    if (!this.f5992c) {
                        LogUtil.d("DecodeOutputSurface", "Surface frame wait timed out");
                        throw new IOException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e) {
                    LogUtil.d("DecodeOutputSurface", " awaitNewImage interrupt");
                    throw new IOException(e);
                }
            }
            this.f5992c = false;
        }
        this.d.a("before updateTextImage");
        this.e.updateTexImage();
    }

    public void c() throws IOException {
        this.d.a(this.e, false);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f5991b) {
            if (this.f5992c) {
                LogUtil.d("DecodeOutputSurface", "mIsFrameAvailable already set, frame could be dropped");
            }
            this.f5992c = true;
            this.f5991b.notifyAll();
        }
    }
}
