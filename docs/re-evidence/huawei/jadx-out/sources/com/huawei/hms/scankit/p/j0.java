package com.huawei.hms.scankit.p;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import android.view.TextureView;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e0 f16145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f16146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Camera.PreviewCallback f16147c;
    private WeakReference d;
    private i0 e;
    private h0 f;
    private n0 g;
    private l0 h;
    private Camera i;
    private f0 j;
    private String k;
    private b l = b.CAMERA_CLOSED;
    private int m = -1;

    public interface c {
        void a();

        void b();

        void c();
    }

    public interface d {
        void a(byte[] bArr);
    }

    public void k() {
        synchronized (this) {
        }
    }

    public j0(Context context, e0 e0Var) {
        if (context != null && e0Var != null) {
            this.d = new WeakReference(context);
            this.f16145a = e0Var;
            this.k = e0Var.f();
            this.j = new f0();
            this.f = new h0();
            this.g = new n0();
            this.h = new l0();
            return;
        }
        throw new IllegalArgumentException("CameraManager constructor param invalid");
    }

    public void m() {
        synchronized (this) {
            b bVar = this.l;
            if (bVar == b.CAMERA_CLOSED || bVar == b.PREVIEW_STOPPED) {
                int iA = a(this.f16145a.b());
                Log.i("CameraManager", "onResume: " + iA);
                try {
                    this.i = Camera.open(iA);
                } catch (RuntimeException e2) {
                    Log.e("CameraManager", "CameraManager::Camera open failed, " + e2.getMessage());
                }
                if (this.i == null) {
                    Log.e("CameraManager", "CameraManager::initCamera failed");
                    c cVar = this.f16146b;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else {
                    c cVar2 = this.f16146b;
                    if (cVar2 != null) {
                        cVar2.a();
                    }
                    this.l = b.CAMERA_OPENED;
                }
            }
        }
    }

    public void l() {
        synchronized (this) {
            try {
                if (this.l.b() == b.PREVIEW_STARTED.b()) {
                    a();
                    q();
                    this.l = b.PREVIEW_STOPPED;
                }
                if (h().equals("torch")) {
                    a("off");
                }
                if (this.l.b() >= b.CAMERA_OPENED.b()) {
                    this.l = b.CAMERA_CLOSED;
                    Camera camera = this.i;
                    if (camera != null) {
                        camera.setPreviewCallback(null);
                        this.i.stopPreview();
                        this.i.release();
                        this.i = null;
                    }
                    c cVar = this.f16146b;
                    if (cVar != null) {
                        cVar.c();
                    }
                }
            } catch (RuntimeException unused) {
                Log.e("CameraManager", "CameraManager::onPause failed");
            }
        }
    }

    public String h() {
        String str;
        synchronized (this) {
            str = this.k;
        }
        return str;
    }

    public void p() {
        synchronized (this) {
            try {
                if (this.l.b() < b.CAMERA_INITIALED.b()) {
                    Log.w("CameraManager", "CameraManager::startPreview camera is not initialed yet");
                    return;
                }
                Camera camera = this.i;
                if (camera != null) {
                    camera.startPreview();
                    this.l = b.PREVIEW_STARTED;
                }
            } catch (RuntimeException unused) {
                Log.w("CameraManager", "stopPreview error");
            }
        }
    }

    public void q() {
        synchronized (this) {
            try {
                if (this.l.b() < b.PREVIEW_STARTED.b()) {
                    Log.w("CameraManager", "CameraManager::startPreview camera is not startPreview yet");
                    return;
                }
                Camera camera = this.i;
                if (camera != null) {
                    camera.setPreviewCallback(null);
                    this.i.stopPreview();
                    this.l = b.PREVIEW_STOPPED;
                }
            } catch (RuntimeException unused) {
                Log.w("CameraManager", "stopPreview error");
            }
        }
    }

    public void o() {
        synchronized (this) {
            if (this.f16145a.c() == 1) {
                Log.d("CameraManager", "CameraManager::requestPreviewFrame PREVIEW_ONE_SHOT");
                if (this.l == b.PREVIEW_STOPPED) {
                    return;
                }
                Camera camera = this.i;
                if (camera != null) {
                    camera.setOneShotPreviewCallback(this.f16147c);
                }
            } else if (this.f16145a.c() == 0) {
                Log.d("CameraManager", "CameraManager::requestPreviewFrame PICTURE_MODE");
                if (this.l == b.PREVIEW_STOPPED) {
                    p();
                }
            } else if (this.f16145a.c() == 2) {
                Log.d("CameraManager", "CameraManager::requestPreviewFrame PREVIEW_MULTI_SHOT");
                if (this.l == b.PREVIEW_STOPPED) {
                    return;
                }
                Camera camera2 = this.i;
                if (camera2 != null) {
                    camera2.setPreviewCallback(this.f16147c);
                }
            } else {
                Log.w("CameraManager", "CameraManager::requestPreviewFrame unknown mode");
            }
        }
    }

    public void a() {
        synchronized (this) {
            i0 i0Var = this.e;
            if (i0Var != null) {
                i0Var.e();
                this.e = null;
            }
        }
    }

    private int a(int i) {
        if (i != 0 && i != 1) {
            return 0;
        }
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i2 = 0; i2 < numberOfCameras; i2++) {
                Camera.getCameraInfo(i2, cameraInfo);
                if (cameraInfo.facing == i) {
                    Log.i("CameraManager", "findCameraId: " + i2);
                    return i2;
                }
            }
        } catch (RuntimeException unused) {
            Log.e("CameraManager", "getCameraInfo RuntimeException");
        } catch (Exception unused2) {
            Log.e("CameraManager", "getCameraInfo Exception");
        }
        return 0;
    }

    public Point e() {
        Point pointA;
        synchronized (this) {
            pointA = this.j.a();
        }
        return pointA;
    }

    public void n() {
        Camera camera;
        synchronized (this) {
            if (this.l.b() < b.CAMERA_OPENED.b()) {
                return;
            }
            if (this.f16145a.c() != 0 && (camera = this.i) != null) {
                camera.setPreviewCallback(new e());
            }
        }
    }

    public boolean j() {
        boolean zB;
        synchronized (this) {
            zB = this.g.b();
        }
        return zB;
    }

    public b f() {
        b bVar;
        synchronized (this) {
            bVar = this.l;
        }
        return bVar;
    }

    public g0 b() {
        synchronized (this) {
            if (this.i == null || this.l.b() == b.CAMERA_CLOSED.b()) {
                return null;
            }
            try {
                return this.f.a();
            } catch (Exception unused) {
                Log.e("CameraManager", "CameraManager::getCameraExposureData failed");
                return null;
            }
        }
    }

    public m0 g() {
        synchronized (this) {
            if (this.i != null && this.l.b() != b.CAMERA_CLOSED.b()) {
                return this.g.a();
            }
            return null;
        }
    }

    public k0 c() {
        synchronized (this) {
            if (this.i != null && this.l.b() != b.CAMERA_CLOSED.b()) {
                return this.h.a();
            }
            return null;
        }
    }

    public int d() {
        int iD;
        synchronized (this) {
            iD = this.f16145a.d();
        }
        return iD;
    }

    public enum b {
        CAMERA_CLOSED(1),
        CAMERA_OPENED(2),
        CAMERA_INITIALED(3),
        PREVIEW_STARTED(4),
        PREVIEW_STOPPED(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16150a;

        b(int i) {
            this.f16150a = i;
        }

        public int b() {
            return this.f16150a;
        }
    }

    public boolean i() {
        boolean z;
        synchronized (this) {
            z = this.i != null && this.l.b() >= b.CAMERA_OPENED.b();
        }
        return z;
    }

    public void c(int i) {
        synchronized (this) {
            if (this.i != null && this.l.b() != b.CAMERA_CLOSED.b()) {
                this.f.a(i);
            }
        }
    }

    public void d(int i) {
        synchronized (this) {
            if (this.i != null && this.l.b() != b.CAMERA_CLOSED.b()) {
                this.g.a(i);
            }
        }
    }

    public void b(int i) {
        synchronized (this) {
            if (this.f16145a != null && this.i != null && this.l.b() >= b.CAMERA_OPENED.b()) {
                this.f16145a.a(i);
                try {
                    try {
                        this.i.setDisplayOrientation(i);
                    } catch (RuntimeException unused) {
                        Log.e("CameraManager", "setDisplayOrientation RuntimeException");
                    }
                } catch (Exception unused2) {
                    Log.e("CameraManager", "setDisplayOrientation Exception");
                }
            }
        }
    }

    public void a(TextureView textureView) {
        synchronized (this) {
            try {
                if (textureView != null) {
                    if (this.l.b() != b.CAMERA_OPENED.b()) {
                        Log.w("CameraManager", "CameraManager::initCamera camera is not opened yet");
                        m();
                    }
                    this.f.a(this.i);
                    this.g.a(this.i);
                    this.h.a(this.i);
                    Camera camera = this.i;
                    if (camera != null) {
                        camera.setPreviewTexture(textureView.getSurfaceTexture());
                    }
                    this.j.a(this.i, this.f16145a);
                    Camera camera2 = this.i;
                    if (camera2 != null) {
                        camera2.setDisplayOrientation(this.f16145a.d());
                    }
                    this.l = b.CAMERA_INITIALED;
                } else {
                    throw new IllegalArgumentException("CameraManager::initCamera SurfaceHolder is null");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Rect rect, boolean z) {
        synchronized (this) {
            if (this.i == null) {
                return;
            }
            if (this.e == null) {
                this.e = new i0(this.i);
            }
            this.e.a(rect, this.j.a().x, this.j.a().y, z, this.f16145a.b() == 1);
        }
    }

    public void a(List list) {
        synchronized (this) {
            if (this.i != null && this.l.b() != b.CAMERA_CLOSED.b()) {
                this.h.a(list);
            }
        }
    }

    public void a(c cVar) {
        synchronized (this) {
            try {
                if (cVar != null) {
                    this.f16146b = cVar;
                } else {
                    throw new IllegalArgumentException("CameraManager::setCameraStatusListener param invalid");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar) {
        synchronized (this) {
            try {
                if (dVar != null) {
                    this.f16147c = new f6(dVar);
                } else {
                    throw new IllegalArgumentException("CameraManager::setFrameCallback param invalid");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str) {
        synchronized (this) {
            try {
                if (this.i != null && this.l.b() != b.CAMERA_CLOSED.b()) {
                    if ("off".equals(str) || "torch".equals(str)) {
                        Camera.Parameters parameters = this.i.getParameters();
                        parameters.setFlashMode(str);
                        this.i.setParameters(parameters);
                        this.k = str;
                    }
                }
            } catch (RuntimeException unused) {
                Log.w("CameraManager", "CameraManager::setTorchStatus error");
            }
        }
    }

    static class e implements Camera.PreviewCallback {
        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
        }

        private e() {
        }
    }
}
