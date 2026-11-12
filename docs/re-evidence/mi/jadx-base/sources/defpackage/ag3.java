package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.Camera;
import android.preference.PreferenceManager;
import android.view.Display;
import android.view.WindowManager;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.mi.health.qrcode.camera.FrontLightMode;
import com.mi.health.qrcode.camera.open.CameraFacing;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ag3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f965b;
    public int c;
    public Point d;
    public Point e;
    public Point f;
    public Point g;

    public ag3(Context context) {
        this.f964a = context;
    }

    public final void a(Camera.Parameters parameters, boolean z, boolean z2) {
        cg3.j(parameters, z);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f964a);
        if (z2 || defaultSharedPreferences.getBoolean("preferences_disable_exposure", true)) {
            return;
        }
        cg3.e(parameters, z);
    }

    public Point b() {
        return this.e;
    }

    public Point c() {
        return this.d;
    }

    public boolean d(Camera camera) {
        Camera.Parameters parameters;
        if (camera == null || (parameters = camera.getParameters()) == null) {
            return false;
        }
        String flashMode = parameters.getFlashMode();
        return DebugKt.DEBUG_PROPERTY_VALUE_ON.equals(flashMode) || "torch".equals(flashMode);
    }

    public void e(xah xahVar) {
        int i;
        Camera.Parameters parameters = xahVar.a().getParameters();
        Display defaultDisplay = ((WindowManager) this.f964a.getSystemService("window")).getDefaultDisplay();
        int rotation = defaultDisplay.getRotation();
        if (rotation == 0) {
            i = 0;
        } else if (rotation == 1) {
            i = 90;
        } else if (rotation == 2) {
            i = 180;
        } else if (rotation == 3) {
            i = 270;
        } else {
            if (rotation % 90 != 0) {
                throw new IllegalArgumentException("Bad rotation: " + rotation);
            }
            i = (rotation + SpatialRelationUtil.A_CIRCLE_DEGREE) % SpatialRelationUtil.A_CIRCLE_DEGREE;
        }
        ipe.f("Display at: " + i);
        int iC = xahVar.c();
        ipe.f("Camera at: " + iC);
        CameraFacing cameraFacingB = xahVar.b();
        CameraFacing cameraFacing = CameraFacing.FRONT;
        if (cameraFacingB == cameraFacing) {
            iC = (360 - iC) % SpatialRelationUtil.A_CIRCLE_DEGREE;
            ipe.f("Front camera overriden to: " + iC);
        }
        this.c = ((iC + SpatialRelationUtil.A_CIRCLE_DEGREE) - i) % SpatialRelationUtil.A_CIRCLE_DEGREE;
        ipe.f("Final display orientation: " + this.c);
        if (xahVar.b() == cameraFacing) {
            ipe.f("Compensating rotation for front camera");
            this.f965b = (360 - this.c) % SpatialRelationUtil.A_CIRCLE_DEGREE;
        } else {
            this.f965b = this.c;
        }
        ipe.f("Clockwise rotation from display to camera: " + this.f965b);
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.d = point;
        ipe.f("Screen resolution in current orientation: " + this.d);
        this.e = cg3.b(parameters, this.d);
        ipe.f("Camera resolution: " + this.e);
        this.f = cg3.b(parameters, this.d);
        ipe.f("Best available preview size: " + this.f);
        Point point2 = this.d;
        boolean z = point2.x < point2.y;
        Point point3 = this.f;
        if (z == (point3.x < point3.y)) {
            this.g = point3;
        } else {
            Point point4 = this.f;
            this.g = new Point(point4.y, point4.x);
        }
        ipe.f("Preview size on screen: " + this.g);
    }

    public final void f(Camera.Parameters parameters, SharedPreferences sharedPreferences, boolean z) {
        a(parameters, FrontLightMode.readPref(sharedPreferences) == FrontLightMode.ON, z);
    }

    public void g(xah xahVar, boolean z) {
        Camera cameraA = xahVar.a();
        Camera.Parameters parameters = cameraA.getParameters();
        if (parameters == null) {
            ipe.h("Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        ipe.f("Initial camera parameters: " + parameters.flatten());
        if (z) {
            ipe.h("In camera config safe mode -- most settings will not be honored");
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f964a);
        if (parameters.isZoomSupported()) {
            parameters.setZoom(parameters.getMaxZoom() / 10);
        }
        f(parameters, defaultSharedPreferences, z);
        cg3.f(parameters, defaultSharedPreferences.getBoolean("preferences_auto_focus", true), defaultSharedPreferences.getBoolean("preferences_disable_continuous_focus", true), z);
        if (!z) {
            if (defaultSharedPreferences.getBoolean("preferences_invert_scan", false)) {
                cg3.h(parameters);
            }
            if (!defaultSharedPreferences.getBoolean("preferences_disable_barcode_scene_mode", true)) {
                cg3.d(parameters);
            }
            if (!defaultSharedPreferences.getBoolean("preferences_disable_metering", true)) {
                cg3.k(parameters);
                cg3.g(parameters);
                cg3.i(parameters);
            }
            parameters.setRecordingHint(true);
        }
        Point point = this.f;
        parameters.setPreviewSize(point.x, point.y);
        cameraA.setParameters(parameters);
        cameraA.setDisplayOrientation(this.c);
        Camera.Size previewSize = cameraA.getParameters().getPreviewSize();
        if (previewSize != null) {
            Point point2 = this.f;
            if (point2.x == previewSize.width && point2.y == previewSize.height) {
                return;
            }
            ipe.h("Camera said it supported preview size " + this.f.x + 'x' + this.f.y + ", but after setting it, preview size is " + previewSize.width + 'x' + previewSize.height);
            Point point3 = this.f;
            point3.x = previewSize.width;
            point3.y = previewSize.height;
        }
    }

    public void h(Camera camera, boolean z) {
        Camera.Parameters parameters = camera.getParameters();
        a(parameters, z, false);
        camera.setParameters(parameters);
    }
}
