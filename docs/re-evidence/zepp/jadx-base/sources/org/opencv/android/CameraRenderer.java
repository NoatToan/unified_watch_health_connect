package org.opencv.android;

import android.annotation.TargetApi;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
@TargetApi(15)
public class CameraRenderer extends CameraGLRendererBase {
    public static final String LOGTAG = "CameraRenderer";
    private Camera t;
    private boolean u;

    public CameraRenderer(CameraGLSurfaceView cameraGLSurfaceView) {
        super(cameraGLSurfaceView);
        this.u = false;
    }

    @Override // org.opencv.android.CameraGLRendererBase
    public synchronized void closeCamera() {
        Log.i(LOGTAG, "closeCamera");
        Camera camera = this.t;
        if (camera != null) {
            camera.stopPreview();
            this.u = false;
            this.t.release();
            this.t = null;
        }
    }

    @Override // org.opencv.android.CameraGLRendererBase
    public synchronized void openCamera(int i) {
        try {
            Log.i(LOGTAG, "openCamera");
            closeCamera();
            int i2 = 0;
            if (i == -1) {
                Log.d(LOGTAG, "Trying to open camera with old open()");
                try {
                    this.t = Camera.open();
                } catch (Exception e) {
                    Log.e(LOGTAG, "Camera is not available (in use or does not exist): " + e.getLocalizedMessage());
                }
                if (this.t == null && Build.VERSION.SDK_INT >= 9) {
                    boolean z = false;
                    while (i2 < Camera.getNumberOfCameras()) {
                        Log.d(LOGTAG, "Trying to open camera with new open(" + i2 + ")");
                        try {
                            this.t = Camera.open(i2);
                            z = true;
                        } catch (RuntimeException e2) {
                            Log.e(LOGTAG, "Camera #" + i2 + "failed to open: " + e2.getLocalizedMessage());
                        }
                        if (z) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 9) {
                int i3 = this.mCameraIndex;
                if (i3 == 99) {
                    Log.i(LOGTAG, "Trying to open BACK camera");
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    while (i2 < Camera.getNumberOfCameras()) {
                        Camera.getCameraInfo(i2, cameraInfo);
                        if (cameraInfo.facing == 0) {
                            i3 = i2;
                            break;
                        }
                        i2++;
                    }
                } else if (i3 == 98) {
                    Log.i(LOGTAG, "Trying to open FRONT camera");
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    while (i2 < Camera.getNumberOfCameras()) {
                        Camera.getCameraInfo(i2, cameraInfo2);
                        if (cameraInfo2.facing == 1) {
                            i3 = i2;
                            break;
                        }
                        i2++;
                    }
                }
                if (i3 == 99) {
                    Log.e(LOGTAG, "Back camera not found!");
                } else if (i3 == 98) {
                    Log.e(LOGTAG, "Front camera not found!");
                } else {
                    Log.d(LOGTAG, "Trying to open camera with new open(" + i3 + ")");
                    try {
                        this.t = Camera.open(i3);
                    } catch (RuntimeException e3) {
                        Log.e(LOGTAG, "Camera #" + i3 + "failed to open: " + e3.getLocalizedMessage());
                    }
                }
            }
            Camera camera = this.t;
            if (camera == null) {
                Log.e(LOGTAG, "Error: can't open camera");
                return;
            }
            Camera.Parameters parameters = camera.getParameters();
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
                parameters.setFocusMode("continuous-video");
            }
            this.t.setParameters(parameters);
            try {
                this.t.setPreviewTexture(this.mSTexture);
            } catch (IOException e4) {
                Log.e(LOGTAG, "setPreviewTexture() failed: " + e4.getMessage());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.opencv.android.CameraGLRendererBase
    public synchronized void setCameraPreviewSize(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        synchronized (this) {
            Log.i(LOGTAG, "setCameraPreviewSize: " + i3 + "x" + i4);
            Camera camera = this.t;
            if (camera == null) {
                Log.e(LOGTAG, "Camera isn't initialized!");
                return;
            }
            int i5 = this.mMaxCameraWidth;
            if (i5 > 0 && i5 < i3) {
                i3 = i5;
            }
            int i6 = this.mMaxCameraHeight;
            if (i6 > 0 && i6 < i4) {
                i4 = i6;
            }
            Camera.Parameters parameters = camera.getParameters();
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            if (supportedPreviewSizes.size() > 0) {
                float f = i3 / i4;
                int i7 = 0;
                int i8 = 0;
                for (Camera.Size size : supportedPreviewSizes) {
                    int i9 = size.width;
                    int i10 = size.height;
                    Log.d(LOGTAG, "checking camera preview size: " + i9 + "x" + i10);
                    if (i9 <= i3 && i10 <= i4 && i9 >= i7 && i10 >= i8 && Math.abs(f - (i9 / i10)) < 0.2d) {
                        i8 = i10;
                        i7 = i9;
                    }
                }
                if (i7 <= 0 || i8 <= 0) {
                    i7 = supportedPreviewSizes.get(0).width;
                    i8 = supportedPreviewSizes.get(0).height;
                    Log.e(LOGTAG, "Error: best size was not selected, using " + i7 + " x " + i8);
                } else {
                    Log.i(LOGTAG, "Selected best size: " + i7 + " x " + i8);
                }
                if (this.u) {
                    this.t.stopPreview();
                    this.u = false;
                }
                this.mCameraWidth = i7;
                this.mCameraHeight = i8;
                parameters.setPreviewSize(i7, i8);
            }
            parameters.set("orientation", "landscape");
            this.t.setParameters(parameters);
            this.t.startPreview();
            this.u = true;
        }
    }
}
