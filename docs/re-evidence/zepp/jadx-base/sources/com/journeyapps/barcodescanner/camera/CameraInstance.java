package com.journeyapps.barcodescanner.camera;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import com.google.zxing.client.android.R;
import com.journeyapps.barcodescanner.Size;
import com.journeyapps.barcodescanner.Util;

/* JADX INFO: loaded from: classes18.dex */
public class CameraInstance {
    private static final String m = "CameraInstance";
    private com.journeyapps.barcodescanner.camera.a a;
    private CameraSurface b;
    private CameraManager c;
    private Handler d;
    private DisplayConfiguration e;
    private boolean f = false;
    private boolean g = true;
    private CameraSettings h = new CameraSettings();
    private Runnable i = new c();
    private Runnable j = new d();
    private Runnable k = new e();
    private Runnable l = new f();

    public class a implements Runnable {
        public final /* synthetic */ boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraInstance.this.c.setTorch(this.a);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ PreviewCallback a;

        public b(PreviewCallback previewCallback) {
            this.a = previewCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraInstance.this.c.requestPreviewFrame(this.a);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(CameraInstance.m, "Opening camera");
                CameraInstance.this.c.open();
            } catch (Exception e) {
                CameraInstance.this.j(e);
                Log.e(CameraInstance.m, "Failed to open camera", e);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(CameraInstance.m, "Configuring camera");
                CameraInstance.this.c.configure();
                if (CameraInstance.this.d != null) {
                    CameraInstance.this.d.obtainMessage(R.id.zxing_prewiew_size_ready, CameraInstance.this.i()).sendToTarget();
                }
            } catch (Exception e) {
                CameraInstance.this.j(e);
                Log.e(CameraInstance.m, "Failed to configure camera", e);
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(CameraInstance.m, "Starting preview");
                CameraInstance.this.c.setPreviewDisplay(CameraInstance.this.b);
                CameraInstance.this.c.startPreview();
            } catch (Exception e) {
                CameraInstance.this.j(e);
                Log.e(CameraInstance.m, "Failed to start preview", e);
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(CameraInstance.m, "Closing camera");
                CameraInstance.this.c.stopPreview();
                CameraInstance.this.c.close();
            } catch (Exception e) {
                Log.e(CameraInstance.m, "Failed to close camera", e);
            }
            CameraInstance.this.g = true;
            CameraInstance.this.d.sendEmptyMessage(R.id.zxing_camera_closed);
            CameraInstance.this.a.b();
        }
    }

    public CameraInstance(Context context) {
        Util.validateMainThread();
        this.a = com.journeyapps.barcodescanner.camera.a.e();
        CameraManager cameraManager = new CameraManager(context);
        this.c = cameraManager;
        cameraManager.setCameraSettings(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Size i() {
        return this.c.getPreviewSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Exception exc) {
        Handler handler = this.d;
        if (handler != null) {
            handler.obtainMessage(R.id.zxing_camera_error, exc).sendToTarget();
        }
    }

    private void k() {
        if (!this.f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    public void close() {
        Util.validateMainThread();
        if (this.f) {
            this.a.c(this.l);
        } else {
            this.g = true;
        }
        this.f = false;
    }

    public void configureCamera() {
        Util.validateMainThread();
        k();
        this.a.c(this.j);
    }

    public CameraManager getCameraManager() {
        return this.c;
    }

    public int getCameraRotation() {
        return this.c.getCameraRotation();
    }

    public CameraSettings getCameraSettings() {
        return this.h;
    }

    public com.journeyapps.barcodescanner.camera.a getCameraThread() {
        return this.a;
    }

    public DisplayConfiguration getDisplayConfiguration() {
        return this.e;
    }

    public CameraSurface getSurface() {
        return this.b;
    }

    public boolean isCameraClosed() {
        return this.g;
    }

    public boolean isOpen() {
        return this.f;
    }

    public void open() {
        Util.validateMainThread();
        this.f = true;
        this.g = false;
        this.a.f(this.i);
    }

    public void requestPreview(PreviewCallback previewCallback) {
        k();
        this.a.c(new b(previewCallback));
    }

    public void setCameraSettings(CameraSettings cameraSettings) {
        if (this.f) {
            return;
        }
        this.h = cameraSettings;
        this.c.setCameraSettings(cameraSettings);
    }

    public void setDisplayConfiguration(DisplayConfiguration displayConfiguration) {
        this.e = displayConfiguration;
        this.c.setDisplayConfiguration(displayConfiguration);
    }

    public void setReadyHandler(Handler handler) {
        this.d = handler;
    }

    public void setSurface(CameraSurface cameraSurface) {
        this.b = cameraSurface;
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        setSurface(new CameraSurface(surfaceHolder));
    }

    public void setTorch(boolean z) {
        Util.validateMainThread();
        if (this.f) {
            this.a.c(new a(z));
        }
    }

    public void startPreview() {
        Util.validateMainThread();
        k();
        this.a.c(this.k);
    }

    public CameraInstance(CameraManager cameraManager) {
        Util.validateMainThread();
        this.c = cameraManager;
    }
}
