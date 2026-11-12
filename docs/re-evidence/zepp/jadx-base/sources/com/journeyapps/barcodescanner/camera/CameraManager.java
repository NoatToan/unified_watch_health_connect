package com.journeyapps.barcodescanner.camera;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import android.view.SurfaceHolder;
import com.google.zxing.client.android.AmbientLightManager;
import com.google.zxing.client.android.camera.CameraConfigurationUtils;
import com.google.zxing.client.android.camera.open.OpenCameraInterface;
import com.journeyapps.barcodescanner.Size;
import com.journeyapps.barcodescanner.SourceData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class CameraManager {
    private static final String n = "CameraManager";
    private Camera a;
    private Camera.CameraInfo b;
    private AutoFocusManager c;
    private AmbientLightManager d;
    private boolean e;
    private String f;
    private DisplayConfiguration h;
    private Size i;
    private Size j;
    private Context l;
    private CameraSettings g = new CameraSettings();
    private int k = -1;
    private final a m = new a();

    public final class a implements Camera.PreviewCallback {
        private PreviewCallback a;
        private Size b;

        public a() {
        }

        public void a(PreviewCallback previewCallback) {
            this.a = previewCallback;
        }

        public void b(Size size) {
            this.b = size;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Size size = this.b;
            PreviewCallback previewCallback = this.a;
            if (size == null || previewCallback == null) {
                Log.d(CameraManager.n, "Got preview callback, but no handler or resolution available");
                if (previewCallback != null) {
                    previewCallback.onPreviewError(new Exception("No resolution available"));
                    return;
                }
                return;
            }
            try {
                if (bArr == null) {
                    throw new NullPointerException("No preview data received");
                }
                previewCallback.onPreview(new SourceData(bArr, size.width, size.height, camera.getParameters().getPreviewFormat(), CameraManager.this.getCameraRotation()));
            } catch (RuntimeException e) {
                Log.e(CameraManager.n, "Camera preview failed", e);
                previewCallback.onPreviewError(e);
            }
        }
    }

    public CameraManager(Context context) {
        this.l = context;
    }

    private int b() {
        int rotation = this.h.getRotation();
        int i = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.b;
        int i2 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i) % 360)) % 360 : ((cameraInfo.orientation - i) + 360) % 360;
        Log.i(n, "Camera Display Orientation: " + i2);
        return i2;
    }

    private Camera.Parameters c() {
        Camera.Parameters parameters = this.a.getParameters();
        String str = this.f;
        if (str == null) {
            this.f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    private static List<Size> d(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new Size(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size size : supportedPreviewSizes) {
            arrayList.add(new Size(size.width, size.height));
        }
        return arrayList;
    }

    private void e(int i) {
        this.a.setDisplayOrientation(i);
    }

    private void f(boolean z) {
        Camera.Parameters parametersC = c();
        if (parametersC == null) {
            Log.w(n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = n;
        Log.i(str, "Initial camera parameters: " + parametersC.flatten());
        if (z) {
            Log.w(str, "In camera config safe mode -- most settings will not be honored");
        }
        CameraConfigurationUtils.setFocus(parametersC, this.g.getFocusMode(), z);
        if (!z) {
            CameraConfigurationUtils.setTorch(parametersC, false);
            if (this.g.isScanInverted()) {
                CameraConfigurationUtils.setInvertColor(parametersC);
            }
            if (this.g.isBarcodeSceneModeEnabled()) {
                CameraConfigurationUtils.setBarcodeSceneMode(parametersC);
            }
            if (this.g.isMeteringEnabled() && Build.VERSION.SDK_INT >= 15) {
                CameraConfigurationUtils.setVideoStabilization(parametersC);
                CameraConfigurationUtils.setFocusArea(parametersC);
                CameraConfigurationUtils.setMetering(parametersC);
            }
        }
        List<Size> listD = d(parametersC);
        if (listD.size() == 0) {
            this.i = null;
        } else {
            Size bestPreviewSize = this.h.getBestPreviewSize(listD, isCameraRotated());
            this.i = bestPreviewSize;
            parametersC.setPreviewSize(bestPreviewSize.width, bestPreviewSize.height);
        }
        if (Build.DEVICE.equals("glass-1")) {
            CameraConfigurationUtils.setBestPreviewFPS(parametersC);
        }
        Log.i(str, "Final camera parameters: " + parametersC.flatten());
        this.a.setParameters(parametersC);
    }

    private void g() {
        try {
            int iB = b();
            this.k = iB;
            e(iB);
        } catch (Exception unused) {
            Log.w(n, "Failed to set rotation.");
        }
        try {
            f(false);
        } catch (Exception unused2) {
            try {
                f(true);
            } catch (Exception unused3) {
                Log.w(n, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.j = this.i;
        } else {
            this.j = new Size(previewSize.width, previewSize.height);
        }
        this.m.b(this.j);
    }

    public void close() {
        Camera camera = this.a;
        if (camera != null) {
            camera.release();
            this.a = null;
        }
    }

    public void configure() {
        if (this.a == null) {
            throw new RuntimeException("Camera not open");
        }
        g();
    }

    public Camera getCamera() {
        return this.a;
    }

    public int getCameraRotation() {
        return this.k;
    }

    public CameraSettings getCameraSettings() {
        return this.g;
    }

    public DisplayConfiguration getDisplayConfiguration() {
        return this.h;
    }

    public Size getNaturalPreviewSize() {
        return this.j;
    }

    public Size getPreviewSize() {
        if (this.j == null) {
            return null;
        }
        return isCameraRotated() ? this.j.rotate() : this.j;
    }

    public boolean isCameraRotated() {
        int i = this.k;
        if (i != -1) {
            return i % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    public boolean isOpen() {
        return this.a != null;
    }

    public boolean isTorchOn() {
        String flashMode;
        Camera.Parameters parameters = this.a.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    public void open() {
        Camera cameraOpen = OpenCameraInterface.open(this.g.getRequestedCameraId());
        this.a = cameraOpen;
        if (cameraOpen == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int cameraId = OpenCameraInterface.getCameraId(this.g.getRequestedCameraId());
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.b = cameraInfo;
        Camera.getCameraInfo(cameraId, cameraInfo);
    }

    public void requestPreviewFrame(PreviewCallback previewCallback) {
        Camera camera = this.a;
        if (camera == null || !this.e) {
            return;
        }
        this.m.a(previewCallback);
        camera.setOneShotPreviewCallback(this.m);
    }

    public void setCameraSettings(CameraSettings cameraSettings) {
        this.g = cameraSettings;
    }

    public void setDisplayConfiguration(DisplayConfiguration displayConfiguration) {
        this.h = displayConfiguration;
    }

    public void setPreviewDisplay(SurfaceHolder surfaceHolder) throws IOException {
        setPreviewDisplay(new CameraSurface(surfaceHolder));
    }

    public void setTorch(boolean z) {
        if (this.a != null) {
            try {
                if (z != isTorchOn()) {
                    AutoFocusManager autoFocusManager = this.c;
                    if (autoFocusManager != null) {
                        autoFocusManager.stop();
                    }
                    Camera.Parameters parameters = this.a.getParameters();
                    CameraConfigurationUtils.setTorch(parameters, z);
                    if (this.g.isExposureEnabled()) {
                        CameraConfigurationUtils.setBestExposure(parameters, z);
                    }
                    this.a.setParameters(parameters);
                    AutoFocusManager autoFocusManager2 = this.c;
                    if (autoFocusManager2 != null) {
                        autoFocusManager2.start();
                    }
                }
            } catch (RuntimeException e) {
                Log.e(n, "Failed to set torch", e);
            }
        }
    }

    public void startPreview() {
        Camera camera = this.a;
        if (camera == null || this.e) {
            return;
        }
        camera.startPreview();
        this.e = true;
        this.c = new AutoFocusManager(this.a, this.g);
        AmbientLightManager ambientLightManager = new AmbientLightManager(this.l, this, this.g);
        this.d = ambientLightManager;
        ambientLightManager.start();
    }

    public void stopPreview() {
        AutoFocusManager autoFocusManager = this.c;
        if (autoFocusManager != null) {
            autoFocusManager.stop();
            this.c = null;
        }
        AmbientLightManager ambientLightManager = this.d;
        if (ambientLightManager != null) {
            ambientLightManager.stop();
            this.d = null;
        }
        Camera camera = this.a;
        if (camera == null || !this.e) {
            return;
        }
        camera.stopPreview();
        this.m.a(null);
        this.e = false;
    }

    public void setPreviewDisplay(CameraSurface cameraSurface) throws IOException {
        cameraSurface.setPreview(this.a);
    }
}
