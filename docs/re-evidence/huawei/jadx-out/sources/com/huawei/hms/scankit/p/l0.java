package com.huawei.hms.scankit.p;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Camera f16190a;

    public k0 a() {
        int maxNumMeteringAreas;
        RuntimeException e;
        Rect rect;
        k0 k0Var;
        synchronized (this) {
            try {
                maxNumMeteringAreas = this.f16190a.getParameters().getMaxNumMeteringAreas();
                try {
                    rect = this.f16190a.getParameters().getMeteringAreas().get(0).rect;
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.w("CameraManager", "CameraMeteringManager::getCameraMeteringData failed: " + e.getMessage());
                    rect = null;
                }
            } catch (RuntimeException e3) {
                maxNumMeteringAreas = 0;
                e = e3;
            }
            k0Var = new k0(maxNumMeteringAreas, rect);
        }
        return k0Var;
    }

    public void a(Camera camera) {
        synchronized (this) {
            this.f16190a = camera;
        }
    }

    public void a(List list) {
        synchronized (this) {
            try {
                Camera camera = this.f16190a;
                if (camera == null) {
                    return;
                }
                Camera.Parameters parameters = camera.getParameters();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < list.size(); i++) {
                    arrayList.add(new Camera.Area(((k0.a) list.get(i)).f16176a, ((k0.a) list.get(i)).f16177b));
                }
                parameters.setMeteringAreas(arrayList);
                try {
                    this.f16190a.setParameters(parameters);
                } catch (RuntimeException e) {
                    Log.w("CameraManager", "CameraMeteringManager::setCameraMeteringArea failed: " + e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
