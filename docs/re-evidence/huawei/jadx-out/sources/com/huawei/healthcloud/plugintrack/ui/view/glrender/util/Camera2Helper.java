package com.huawei.healthcloud.plugintrack.ui.view.glrender.util;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.WindowManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public class Camera2Helper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HandlerThread f11374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CameraDevice f11375b;
    private String d;
    private Handler e;
    private Range<Integer> f;
    private CameraCaptureSession g;
    private ImageReader i;
    private Activity j;
    private OnPreviewListener k;
    private CaptureRequest m;
    private OnPreviewSizeListener n;
    private int p;
    private Size q;
    private CaptureRequest.Builder r;
    private SurfaceTexture w;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11376c = false;
    private float t = 1.0f;
    private boolean o = false;
    private final CameraDevice.StateCallback s = new CameraDevice.StateCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.view.glrender.util.Camera2Helper.2
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            LogUtil.a("Track_Camera2Helper", "Camera2 onOpened");
            Camera2Helper.this.f11375b = cameraDevice;
            Camera2Helper.this.d();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            LogUtil.a("Track_Camera2Helper", "Camera2 onDisconnected");
            cameraDevice.close();
            Camera2Helper.this.f11375b = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            LogUtil.j("Track_Camera2Helper", "Camera2 error:", Integer.valueOf(i));
            cameraDevice.close();
            Camera2Helper.this.f11375b = null;
        }
    };
    private ImageReader.OnImageAvailableListener l = new ImageReader.OnImageAvailableListener() { // from class: com.huawei.healthcloud.plugintrack.ui.view.glrender.util.Camera2Helper.4
        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            if (imageAcquireNextImage == null) {
                return;
            }
            if (Camera2Helper.this.k != null) {
                Camera2Helper.this.k.onPreviewFrame(imageAcquireNextImage, imageAcquireNextImage.getWidth(), imageAcquireNextImage.getHeight());
            }
            imageAcquireNextImage.close();
        }
    };
    private CameraCaptureSession.CaptureCallback h = new CameraCaptureSession.CaptureCallback(this) { // from class: com.huawei.healthcloud.plugintrack.ui.view.glrender.util.Camera2Helper.1
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }
    };

    public interface OnPreviewListener {
        void onPreviewFrame(Image image, int i, int i2);
    }

    public interface OnPreviewSizeListener {
        void onSize(int i, int i2);
    }

    public Camera2Helper(Activity activity) {
        this.j = activity;
    }

    public void e(int i, int i2, SurfaceTexture surfaceTexture, boolean z, boolean z2) {
        this.w = surfaceTexture;
        this.f11376c = z2;
        a();
        c(i, i2, z);
        CameraManager cameraManager = (CameraManager) this.j.getSystemService("camera");
        String str = this.d;
        if (str == null || str.isEmpty()) {
            ReleaseLogUtil.a("Track_Camera2Helper", "getCameraId failed, please check and try again.");
        } else {
            if (this.j.checkSelfPermission("android.permission.CAMERA") != 0) {
                return;
            }
            try {
                cameraManager.openCamera(this.d, this.s, this.e);
            } catch (CameraAccessException e) {
                LogUtil.e("Track_Camera2Helper", "openCamera failed. pls check.", LogAnonymous.b(e));
            }
        }
    }

    public void b() {
        CameraCaptureSession cameraCaptureSession = this.g;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.g = null;
        }
        CameraDevice cameraDevice = this.f11375b;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f11375b = null;
        }
        ImageReader imageReader = this.i;
        if (imageReader != null) {
            imageReader.close();
            this.i = null;
        }
        c();
    }

    public void c(boolean z) {
        this.o = z;
    }

    public void b(float f) {
        this.t = f;
    }

    private void a() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f11374a = handlerThread;
        handlerThread.start();
        this.e = new Handler(this.f11374a.getLooper());
    }

    private void c() {
        this.f11374a.quitSafely();
        this.f11374a = null;
        this.e = null;
    }

    private void c(int i, int i2, boolean z) {
        StreamConfigurationMap streamConfigurationMap;
        if (!(this.j.getSystemService("camera") instanceof CameraManager)) {
            LogUtil.j("Track_Camera2Helper", "initCameraInfo object instanceof CameraManager false");
            return;
        }
        CameraManager cameraManager = (CameraManager) this.j.getSystemService("camera");
        try {
            for (String str : cameraManager.getCameraIdList()) {
                try {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if ((num == null || num.intValue() != (!z)) && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null) {
                        Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                        if (obj != null) {
                            this.p = ((Integer) obj).intValue();
                        }
                        c(cameraManager, str);
                        if (this.o) {
                            this.q = c(streamConfigurationMap.getOutputSizes(SurfaceTexture.class), i, i2);
                        } else {
                            this.q = e(streamConfigurationMap.getOutputSizes(SurfaceTexture.class), i2, i);
                        }
                        Size size = this.q;
                        if (size == null) {
                            LogUtil.j("Track_Camera2Helper", "setUpCameraParams mPreviewSize is null.");
                            return;
                        }
                        ReleaseLogUtil.d("R_Track_Camera2Helper", "chooseOptimalSize getWidth ", Integer.valueOf(size.getWidth()), " getHeight ", Integer.valueOf(this.q.getHeight()));
                        OnPreviewSizeListener onPreviewSizeListener = this.n;
                        if (onPreviewSizeListener != null) {
                            onPreviewSizeListener.onSize(this.q.getWidth(), this.q.getHeight());
                        }
                        ImageReader imageReaderNewInstance = ImageReader.newInstance(this.q.getWidth(), this.q.getHeight(), 35, 2);
                        this.i = imageReaderNewInstance;
                        imageReaderNewInstance.setOnImageAvailableListener(this.l, this.e);
                        this.d = str;
                        return;
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (CameraAccessException e) {
            LogUtil.e("Track_Camera2Helper", "setUpCameraParams CameraAccessException ", LogAnonymous.b(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            if (this.f11375b == null) {
                LogUtil.e("Track_Camera2Helper", "createCameraPreviewSession() The mCameraDevice is null. pls check");
                return;
            }
            this.w.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
            Surface surface = new Surface(this.w);
            CaptureRequest.Builder builderCreateCaptureRequest = this.f11375b.createCaptureRequest(3);
            this.r = builderCreateCaptureRequest;
            builderCreateCaptureRequest.addTarget(surface);
            if (this.o) {
                this.r.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, this.f);
            }
            if (this.f11376c) {
                this.r.addTarget(this.i.getSurface());
            }
            this.f11375b.createCaptureSession(Arrays.asList(surface, this.i.getSurface()), new CameraCaptureSession.StateCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.view.glrender.util.Camera2Helper.3
                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    if (Camera2Helper.this.f11375b == null) {
                        LogUtil.e("Track_Camera2Helper", "createCameraPreviewSession() The camera is already closed.");
                        return;
                    }
                    Camera2Helper.this.g = cameraCaptureSession;
                    try {
                        Camera2Helper.this.r.set(CaptureRequest.CONTROL_AF_MODE, 4);
                        Camera2Helper camera2Helper = Camera2Helper.this;
                        camera2Helper.m = camera2Helper.r.build();
                        if (Camera2Helper.this.g == null) {
                            ReleaseLogUtil.e("Track_Camera2Helper", "mCaptureSession == null");
                        } else {
                            Camera2Helper.this.g.setRepeatingRequest(Camera2Helper.this.m, Camera2Helper.this.h, Camera2Helper.this.e);
                        }
                    } catch (CameraAccessException | IllegalStateException | SecurityException e) {
                        LogUtil.e("Track_Camera2Helper", "createCameraPreviewSession() start display the camera preview failed.", LogAnonymous.b(e));
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    LogUtil.e("Track_Camera2Helper", "createCaptureSession onConfigureFailed: ");
                }
            }, this.e);
        } catch (CameraAccessException e) {
            LogUtil.e("Track_Camera2Helper", "createCameraPreviewSession() start display the camera preview failed.", LogAnonymous.b(e));
        } catch (Exception e2) {
            LogUtil.e("Track_Camera2Helper", "createCameraPreviewSession Exception ", LogAnonymous.b(e2));
        }
    }

    private void c(CameraManager cameraManager, String str) {
        try {
            Range[] rangeArr = (Range[]) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            LogUtil.a("Track_Camera2Helper", "ranges: ", Arrays.toString(rangeArr));
            Range range = null;
            for (Range range2 : rangeArr) {
                int iIntValue = ((Integer) range2.getLower()).intValue();
                int iIntValue2 = ((Integer) range2.getUpper()).intValue();
                if (range == null || ((Integer) range.getLower()).intValue() < 20 || (iIntValue >= 20 && iIntValue <= ((Integer) range.getLower()).intValue() && iIntValue2 <= ((Integer) range.getUpper()).intValue())) {
                    range = range2;
                }
            }
            if (range != null) {
                this.f = new Range<>((Integer) range.getLower(), (Integer) range.getUpper());
                ReleaseLogUtil.d("R_Track_Camera2Helper", "mFrameRateRange:  " + this.f.toString());
            }
        } catch (CameraAccessException unused) {
            LogUtil.a("Track_Camera2Helper", "CameraAccessException");
        }
    }

    private Size c(Size[] sizeArr, int i, int i2) {
        boolean z;
        float f;
        float f2;
        Size size = null;
        if (sizeArr == null || sizeArr.length == 0 || i == 0 || i2 == 0) {
            return null;
        }
        boolean zE = e();
        StringBuilder sb = new StringBuilder();
        float f3 = i;
        float f4 = i2;
        float f5 = f3 / f4;
        LogUtil.a("Track_Camera2Helper", "screenWidth ", Integer.valueOf(i), " screenHeight ", Integer.valueOf(i2), " ratio is ", Float.valueOf(f5));
        Arrays.sort(sizeArr, new Comparator() { // from class: jsx
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Size size2 = (Size) obj;
                Size size3 = (Size) obj2;
                return Long.signum((((long) size3.getWidth()) * ((long) size3.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            }
        });
        float f6 = Float.MAX_VALUE;
        int i3 = 0;
        while (i3 < sizeArr.length) {
            Size size2 = sizeArr[i3];
            sb.append("[" + size2.getWidth() + ", " + size2.getHeight() + "]");
            if (size2.getHeight() == 0 || size2.getWidth() == 0) {
                z = zE;
            } else {
                int height = zE ? size2.getHeight() : size2.getWidth();
                int width = zE ? size2.getWidth() : size2.getHeight();
                float f7 = height;
                z = zE;
                float f8 = this.t;
                if (f7 >= f8 * f3) {
                    float f9 = width;
                    if (f9 >= f8 * f4) {
                        float fAbs = Math.abs(f5 - ((f7 * 1.0f) / f9));
                        f = f3;
                        f2 = f4;
                        float fFloatValue = new BigDecimal(fAbs).setScale(1, 5).floatValue();
                        if (fFloatValue <= f6) {
                            f6 = fFloatValue;
                            size = size2;
                        }
                    }
                }
                i3++;
                f3 = f;
                zE = z;
                f4 = f2;
            }
            f = f3;
            f2 = f4;
            i3++;
            f3 = f;
            zE = z;
            f4 = f2;
        }
        LogUtil.a("Track_Camera2Helper", "chooseOptimalSize: ", sb);
        if (size != null) {
            LogUtil.a("Track_Camera2Helper", "chooseOptimalSize get bigEnough size");
            return size;
        }
        LogUtil.a("Track_Camera2Helper", "chooseOptimalSize fail, find best preview size");
        return e(sizeArr, i2, i);
    }

    private boolean e() {
        int i;
        int i2;
        Activity activity = this.j;
        if (activity == null) {
            return false;
        }
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        return ((rotation == 0 || rotation == 2) && ((i = this.p) == 90 || i == 270)) || ((rotation == 1 || rotation == 3) && ((i2 = this.p) == 0 || i2 == 180));
    }

    private Size e(Size[] sizeArr, int i, int i2) {
        Size size = null;
        if (sizeArr != null && sizeArr.length != 0) {
            Object systemService = this.j.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
            int rotation = systemService instanceof WindowManager ? ((WindowManager) systemService).getDefaultDisplay().getRotation() : 0;
            if (i <= i2 || rotation == 1 || rotation == 3) {
                i2 = i;
                i = i2;
            }
            for (Size size2 : sizeArr) {
                if (size2.getWidth() == i && size2.getHeight() == i2) {
                    return size2;
                }
            }
            float f = i / i2;
            float f2 = Float.MAX_VALUE;
            for (Size size3 : sizeArr) {
                if (size3.getHeight() != 0) {
                    float fAbs = Math.abs(f - ((size3.getWidth() * 1.0f) / size3.getHeight()));
                    if (fAbs < f2) {
                        size = size3;
                        f2 = fAbs;
                    }
                }
            }
        }
        return size;
    }

    public void a(OnPreviewSizeListener onPreviewSizeListener) {
        this.n = onPreviewSizeListener;
    }

    public void d(OnPreviewListener onPreviewListener) {
        this.k = onPreviewListener;
    }
}
