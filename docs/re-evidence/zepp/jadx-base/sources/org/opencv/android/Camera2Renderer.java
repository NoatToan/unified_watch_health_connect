package org.opencv.android;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes23.dex */
@TargetApi(21)
public class Camera2Renderer extends CameraGLRendererBase {
    private Semaphore A;
    private final CameraDevice.StateCallback B;
    public final String LOGTAG;
    private CameraDevice t;
    private CameraCaptureSession u;
    private CaptureRequest.Builder v;
    private String w;
    private Size x;
    private HandlerThread y;
    private Handler z;

    public class a extends CameraDevice.StateCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            cameraDevice.close();
            Camera2Renderer.this.t = null;
            Camera2Renderer.this.A.release();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            cameraDevice.close();
            Camera2Renderer.this.t = null;
            Camera2Renderer.this.A.release();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Camera2Renderer.this.t = cameraDevice;
            Camera2Renderer.this.A.release();
            Camera2Renderer.this.r();
        }
    }

    public class b extends CameraCaptureSession.StateCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Log.e("Camera2Renderer", "createCameraPreviewSession failed");
            Camera2Renderer.this.A.release();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Camera2Renderer.this.u = cameraCaptureSession;
            try {
                Camera2Renderer.this.v.set(CaptureRequest.CONTROL_AF_MODE, 4);
                Camera2Renderer.this.v.set(CaptureRequest.CONTROL_AE_MODE, 2);
                Camera2Renderer.this.u.setRepeatingRequest(Camera2Renderer.this.v.build(), null, Camera2Renderer.this.z);
                Log.i("Camera2Renderer", "CameraPreviewSession has been started");
            } catch (CameraAccessException unused) {
                Log.e("Camera2Renderer", "createCaptureSession failed");
            }
            Camera2Renderer.this.A.release();
        }
    }

    public Camera2Renderer(CameraGLSurfaceView cameraGLSurfaceView) {
        super(cameraGLSurfaceView);
        this.LOGTAG = "Camera2Renderer";
        this.x = new Size(-1, -1);
        this.A = new Semaphore(1);
        this.B = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        int width = this.x.getWidth();
        int height = this.x.getHeight();
        Log.i("Camera2Renderer", "createCameraPreviewSession(" + width + "x" + height + ")");
        if (width >= 0) {
            if (height < 0) {
                return;
            }
            try {
                this.A.acquire();
                if (this.t == null) {
                    this.A.release();
                    Log.e("Camera2Renderer", "createCameraPreviewSession: camera isn't opened");
                    return;
                }
                if (this.u != null) {
                    this.A.release();
                    Log.e("Camera2Renderer", "createCameraPreviewSession: mCaptureSession is already started");
                    return;
                }
                SurfaceTexture surfaceTexture = this.mSTexture;
                if (surfaceTexture == null) {
                    this.A.release();
                    Log.e("Camera2Renderer", "createCameraPreviewSession: preview SurfaceTexture is null");
                    return;
                }
                surfaceTexture.setDefaultBufferSize(width, height);
                Surface surface = new Surface(this.mSTexture);
                CaptureRequest.Builder builderCreateCaptureRequest = this.t.createCaptureRequest(1);
                this.v = builderCreateCaptureRequest;
                builderCreateCaptureRequest.addTarget(surface);
                this.t.createCaptureSession(Arrays.asList(surface), new b(), this.z);
            } catch (CameraAccessException unused) {
                Log.e("Camera2Renderer", "createCameraPreviewSession");
            } catch (InterruptedException e) {
                throw new RuntimeException("Interrupted while createCameraPreviewSession", e);
            }
        }
    }

    private void s() {
        Log.i("Camera2Renderer", "startBackgroundThread");
        t();
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.y = handlerThread;
        handlerThread.start();
        this.z = new Handler(this.y.getLooper());
    }

    private void t() {
        Log.i("Camera2Renderer", "stopBackgroundThread");
        HandlerThread handlerThread = this.y;
        if (handlerThread == null) {
            return;
        }
        handlerThread.quitSafely();
        try {
            this.y.join();
            this.y = null;
            this.z = null;
        } catch (InterruptedException unused) {
            Log.e("Camera2Renderer", "stopBackgroundThread");
        }
    }

    @Override // org.opencv.android.CameraGLRendererBase
    public void closeCamera() {
        Log.i("Camera2Renderer", "closeCamera");
        try {
            try {
                this.A.acquire();
                CameraCaptureSession cameraCaptureSession = this.u;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.close();
                    this.u = null;
                }
                CameraDevice cameraDevice = this.t;
                if (cameraDevice != null) {
                    cameraDevice.close();
                    this.t = null;
                }
                this.A.release();
            } catch (InterruptedException e) {
                throw new RuntimeException("Interrupted while trying to lock camera closing.", e);
            }
        } catch (Throwable th) {
            this.A.release();
            throw th;
        }
    }

    @Override // org.opencv.android.CameraGLRendererBase
    public void doStart() {
        Log.d("Camera2Renderer", "doStart");
        s();
        super.doStart();
    }

    @Override // org.opencv.android.CameraGLRendererBase
    public void doStop() {
        Log.d("Camera2Renderer", "doStop");
        super.doStop();
        t();
    }

    @Override // org.opencv.android.CameraGLRendererBase
    public void openCamera(int i) {
        Log.i("Camera2Renderer", "openCamera");
        CameraManager cameraManager = (CameraManager) this.mView.getContext().getSystemService("camera");
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            if (cameraIdList.length == 0) {
                Log.e("Camera2Renderer", "Error: camera isn't detected.");
                return;
            }
            if (i != -1) {
                for (String str : cameraIdList) {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    if ((i == 99 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) || (i == 98 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                        this.w = str;
                        break;
                    }
                }
            } else {
                this.w = cameraIdList[0];
            }
            if (this.w != null) {
                if (!this.A.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                    throw new RuntimeException("Time out waiting to lock camera opening.");
                }
                Log.i("Camera2Renderer", "Opening camera: " + this.w);
                cameraManager.openCamera(this.w, this.B, this.z);
            }
        } catch (CameraAccessException unused) {
            Log.e("Camera2Renderer", "OpenCamera - Camera Access Exception");
        } catch (IllegalArgumentException unused2) {
            Log.e("Camera2Renderer", "OpenCamera - Illegal Argument Exception");
        } catch (InterruptedException unused3) {
            Log.e("Camera2Renderer", "OpenCamera - Interrupted Exception");
        } catch (SecurityException unused4) {
            Log.e("Camera2Renderer", "OpenCamera - Security Exception");
        }
    }

    public boolean q(int i, int i2) {
        Log.i("Camera2Renderer", "cacPreviewSize: " + i + "x" + i2);
        if (this.w == null) {
            Log.e("Camera2Renderer", "Camera isn't initialized!");
            return false;
        }
        try {
            float f = i / i2;
            int i3 = 0;
            int i4 = 0;
            for (Size size : ((StreamConfigurationMap) ((CameraManager) this.mView.getContext().getSystemService("camera")).getCameraCharacteristics(this.w).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class)) {
                int width = size.getWidth();
                int height = size.getHeight();
                Log.d("Camera2Renderer", "trying size: " + width + "x" + height);
                if (i >= width && i2 >= height && i3 <= width && i4 <= height && Math.abs(f - (width / height)) < 0.2d) {
                    i4 = height;
                    i3 = width;
                }
            }
            Log.i("Camera2Renderer", "best size: " + i3 + "x" + i4);
            if (i3 != 0 && i4 != 0 && (this.x.getWidth() != i3 || this.x.getHeight() != i4)) {
                this.x = new Size(i3, i4);
                return true;
            }
            return false;
        } catch (CameraAccessException unused) {
            Log.e("Camera2Renderer", "cacPreviewSize - Camera Access Exception");
            return false;
        } catch (IllegalArgumentException unused2) {
            Log.e("Camera2Renderer", "cacPreviewSize - Illegal Argument Exception");
            return false;
        } catch (SecurityException unused3) {
            Log.e("Camera2Renderer", "cacPreviewSize - Security Exception");
            return false;
        }
    }

    @Override // org.opencv.android.CameraGLRendererBase
    public void setCameraPreviewSize(int i, int i2) {
        Log.i("Camera2Renderer", "setCameraPreviewSize(" + i + "x" + i2 + ")");
        int i3 = this.mMaxCameraWidth;
        if (i3 > 0 && i3 < i) {
            i = i3;
        }
        int i4 = this.mMaxCameraHeight;
        if (i4 > 0 && i4 < i2) {
            i2 = i4;
        }
        try {
            this.A.acquire();
            boolean zQ = q(i, i2);
            this.mCameraWidth = this.x.getWidth();
            this.mCameraHeight = this.x.getHeight();
            if (!zQ) {
                this.A.release();
                return;
            }
            if (this.u != null) {
                Log.d("Camera2Renderer", "closing existing previewSession");
                this.u.close();
                this.u = null;
            }
            this.A.release();
            r();
        } catch (InterruptedException e) {
            this.A.release();
            throw new RuntimeException("Interrupted while setCameraPreviewSize.", e);
        }
    }
}
