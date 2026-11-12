package com.huami.android.zxing.camera;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes5.dex */
final class b {
    private static final String e = "CameraConfiguration";
    private final Context a;
    private Point b;
    private Point c;
    private int d = -1;

    public b(Context context) {
        this.a = context;
    }

    private void a(Camera.Parameters parameters, boolean z) {
        CameraConfigurationUtils.setTorch(parameters, z);
    }

    private void f(Camera.Parameters parameters) {
        a(parameters, false);
    }

    private void j(Camera.Parameters parameters) {
        if (this.d < 0 || !parameters.isZoomSupported()) {
            return;
        }
        int maxZoom = parameters.getMaxZoom();
        if (this.d > maxZoom) {
            this.d = maxZoom;
        }
        parameters.setZoom(this.d);
    }

    public Point b() {
        return this.c;
    }

    public Point c() {
        return this.b;
    }

    public boolean d(Camera camera) {
        Camera.Parameters parameters;
        String flashMode;
        if (camera == null || (parameters = camera.getParameters()) == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    public void e(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.b = point;
        Log.i(e, "Screen resolution: " + this.b);
        Point point2 = new Point();
        Point point3 = this.b;
        point2.x = point3.x;
        point2.y = point3.y;
        int i = point3.x;
        int i2 = point3.y;
        if (i < i2) {
            point2.x = i2;
            point2.y = point3.x;
        }
        this.c = CameraConfigurationUtils.findBestPreviewSizeValue(parameters, point2);
        Log.i(e, "Camera resolution: " + this.c);
    }

    public void g(Camera camera, boolean z) {
        Camera.Parameters parameters = camera.getParameters();
        Log.i(e, "Initial camera parameters: " + parameters.flatten());
        if (z) {
            Log.w(e, "In camera config safe mode -- most settings will not be honored");
        }
        f(parameters);
        CameraConfigurationUtils.setFocus(parameters, true, true, z);
        Point point = this.c;
        parameters.setPreviewSize(point.x, point.y);
        j(parameters);
        Log.i(e, "Final camera parameters: " + parameters.flatten());
        camera.setParameters(parameters);
        camera.setDisplayOrientation(90);
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        if (previewSize != null) {
            Point point2 = this.c;
            if (point2.x == previewSize.width && point2.y == previewSize.height) {
                return;
            }
            Log.w(e, "Camera said it supported preview size " + this.c.x + 'x' + this.c.y + ", but after setting it, preview size is " + previewSize.width + 'x' + previewSize.height);
            Point point3 = this.c;
            point3.x = previewSize.width;
            point3.y = previewSize.height;
        }
    }

    public void h(int i) {
        this.d = i;
    }

    public void i(Camera camera, boolean z) {
        Camera.Parameters parameters = camera.getParameters();
        a(parameters, z);
        camera.setParameters(parameters);
    }
}
