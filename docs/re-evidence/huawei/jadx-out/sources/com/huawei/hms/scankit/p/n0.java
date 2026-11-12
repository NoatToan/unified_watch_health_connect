package com.huawei.hms.scankit.p;

import android.hardware.Camera;
import android.util.Log;

/* JADX INFO: loaded from: classes34.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Camera f16220a;

    public m0 a() {
        m0 m0Var;
        synchronized (this) {
            m0Var = new m0(this.f16220a.getParameters().getMaxZoom(), this.f16220a.getParameters().getZoom(), this.f16220a.getParameters().getZoomRatios());
        }
        return m0Var;
    }

    public boolean b() {
        synchronized (this) {
            Camera camera = this.f16220a;
            if (camera == null) {
                return false;
            }
            return camera.getParameters().isZoomSupported();
        }
    }

    public void a(Camera camera) {
        synchronized (this) {
            this.f16220a = camera;
        }
    }

    public void a(int i) {
        synchronized (this) {
            Camera camera = this.f16220a;
            if (camera == null) {
                return;
            }
            Camera.Parameters parameters = camera.getParameters();
            parameters.setZoom(i);
            try {
                this.f16220a.setParameters(parameters);
            } catch (RuntimeException e) {
                Log.e("CameraManager", "CameraZoomManager::setCameraZoomIndex failed: " + e.getMessage());
            }
        }
    }
}
