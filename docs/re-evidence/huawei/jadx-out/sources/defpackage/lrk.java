package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
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
import android.view.TextureView;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.camera.CameraStateListener;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class lrk {
    private TextureView aa;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f40721b;
    private Activity d;
    private HandlerThread e;
    private CameraDevice f;
    private String h;
    private CameraStateListener j;
    private Size k;
    private Range<Integer> l;
    private ImageReader m;
    private CameraCaptureSession n;
    private int o;
    private boolean p;
    private CaptureRequest q;
    private boolean s;
    private boolean t;
    private Size u;
    private int v;
    private CaptureRequest.Builder x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f40720a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40722c = false;
    private int y = 0;
    private Semaphore i = new Semaphore(1);
    private CameraCaptureSession.CaptureCallback g = new CameraCaptureSession.CaptureCallback() { // from class: lrk.1
        private void e(CaptureResult captureResult) {
            int i = lrk.this.y;
            if (i != 0) {
                if (i == 1) {
                    Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                    if (num == null) {
                        ReleaseLogUtil.b("R_CameraHelper", "CameraCaptureSession.CaptureCallback afState is null");
                        lrk.this.i();
                        return;
                    }
                    ReleaseLogUtil.c("R_CameraHelper", "CaptureCallback State: WAITING_LOCK, afState:", num);
                    if (num.intValue() == 4 || num.intValue() == 5 || num.intValue() == 2) {
                        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        ReleaseLogUtil.c("R_CameraHelper", "CaptureCallback aeState: ", num2);
                        if (num2 == null || num2.intValue() == 2) {
                            lrk.this.y = 4;
                            lrk.this.i();
                            return;
                        } else {
                            lrk.this.l();
                            return;
                        }
                    }
                    return;
                }
                if (i == 2) {
                    Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    ReleaseLogUtil.c("R_CameraHelper", "CaptureCallback State: WAITING_PRECAPTURE, aeState1:", num3);
                    if (num3 == null || num3.intValue() == 5 || num3.intValue() == 4 || num3.intValue() == 2) {
                        lrk.this.y = 3;
                        return;
                    }
                    return;
                }
                if (i != 3) {
                    ReleaseLogUtil.c("R_CameraHelper", "CaptureCallback other state: ", Integer.valueOf(lrk.this.y));
                    return;
                }
                Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                ReleaseLogUtil.c("R_CameraHelper", "CaptureCallback State: WAITING_NON_PRECAPTURE, aeState2:", num4);
                if (num4 == null || num4.intValue() != 5) {
                    lrk.this.y = 4;
                    lrk.this.i();
                } else {
                    ReleaseLogUtil.c("R_CameraHelper", "Camera is still in pre-capture state 5.");
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            e(captureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            e(totalCaptureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            ReleaseLogUtil.d("CameraHelper", "mCaptureCallback onCaptureFailed session ", cameraCaptureSession, " request ", captureRequest, " failure ", captureFailure);
        }
    };
    private ImageReader.OnImageAvailableListener r = new ImageReader.OnImageAvailableListener() { // from class: lrk.3
        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            if (imageAcquireNextImage == null || imageAcquireNextImage.getPlanes() == null) {
                return;
            }
            if (lrk.this.j != null) {
                lrk.this.j.onPreviewFrame(imageAcquireNextImage, lrk.this.v);
            }
            imageAcquireNextImage.close();
        }
    };
    private final CameraDevice.StateCallback w = new CameraDevice.StateCallback() { // from class: lrk.5
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            LogUtil.b("CameraHelper", "StateCallback camera opened,start preview");
            lrk.this.i.release();
            lrk.this.f = cameraDevice;
            lrk.this.f40722c = true;
            lrk.this.b();
            if (lrk.this.j != null) {
                lrk.this.j.onCameraOpened(lrk.this.v);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            LogUtil.b("CameraHelper", "StateCallback camera disconnected");
            lrk.this.i.release();
            cameraDevice.close();
            lrk.this.f40722c = false;
            lrk.this.f = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            LogUtil.b("CameraHelper", "StateCallback camera error=", Integer.valueOf(i));
            lrk.this.i.release();
            cameraDevice.close();
            lrk.this.f40722c = false;
            lrk.this.f = null;
            if (lrk.this.d != null) {
                lrk.this.d.finish();
            }
            if (lrk.this.j != null) {
                lrk.this.j.onCameraError("CameraDevice.StateCallback int error state, errorCode=" + i);
            }
        }
    };

    public lrk(Activity activity, TextureView textureView, CameraStateListener cameraStateListener, boolean z, int i) {
        this.o = i;
        this.t = z;
        this.d = activity;
        this.aa = textureView;
        this.j = cameraStateListener;
        this.s = d(activity);
    }

    public boolean e() {
        return this.f != null;
    }

    public void b(int i, int i2, boolean z) {
        CameraStateListener cameraStateListener;
        if (PermissionUtil.e(this.d, PermissionUtil.PermissionType.CAMERA) != PermissionUtil.PermissionResult.GRANTED) {
            CameraStateListener cameraStateListener2 = this.j;
            if (cameraStateListener2 != null) {
                cameraStateListener2.onCameraError("openCamera error: camera permission is not permitted!");
                return;
            }
            return;
        }
        LogUtil.b("CameraHelper", "openCamera start");
        Object systemService = this.d.getSystemService("camera");
        CameraManager cameraManager = systemService instanceof CameraManager ? (CameraManager) systemService : null;
        if (cameraManager == null) {
            CameraStateListener cameraStateListener3 = this.j;
            if (cameraStateListener3 != null) {
                cameraStateListener3.onCameraError("openCamera cameraManager is null");
            }
            this.d.finish();
            return;
        }
        try {
            if (!this.i.tryAcquire(2500L, TimeUnit.MILLISECONDS) && (cameraStateListener = this.j) != null) {
                cameraStateListener.onCameraError("Time out waiting to lock camera opening.");
            }
            m();
            c(i, i2, z);
            b(i, i2);
            String str = this.h;
            if (str == null) {
                ReleaseLogUtil.d("CameraHelper", "cameraId is null");
            } else {
                cameraManager.openCamera(str, this.w, this.f40721b);
            }
        } catch (CameraAccessException e) {
            this.i.release();
            CameraStateListener cameraStateListener4 = this.j;
            if (cameraStateListener4 != null) {
                cameraStateListener4.onCameraError("openCamera CameraAccessException: " + ExceptionUtils.c(e));
            }
        } catch (IllegalArgumentException e2) {
            this.i.release();
            CameraStateListener cameraStateListener5 = this.j;
            if (cameraStateListener5 != null) {
                cameraStateListener5.onCameraError("openCamera IllegalArgumentException: " + ExceptionUtils.c(e2));
            }
        } catch (InterruptedException e3) {
            this.i.release();
            CameraStateListener cameraStateListener6 = this.j;
            if (cameraStateListener6 != null) {
                cameraStateListener6.onCameraError("Interrupted while trying to lock camera opening:" + ExceptionUtils.c(e3));
            }
        }
    }

    private void c(int i, int i2, boolean z) {
        StreamConfigurationMap streamConfigurationMap;
        Object systemService = this.d.getSystemService("camera");
        CameraManager cameraManager = systemService instanceof CameraManager ? (CameraManager) systemService : null;
        if (cameraManager == null) {
            LogUtil.d("CameraHelper", "setUpCameraOutputs cameraManager is null");
            this.d.finish();
            return;
        }
        try {
            boolean zBooleanValue = false;
            for (String str : cameraManager.getCameraIdList()) {
                if (this.h == null) {
                    this.h = str;
                }
                LogUtil.b("CameraHelper", "setUpCameraOutputs cameraId=", str);
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                LogUtil.b("CameraHelper", "setUpCameraOutputs facing=", num);
                if ((num == null || num.intValue() != (!z)) && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null) {
                    Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                    int iIntValue = num2.intValue();
                    LogUtil.b("CameraHelper", "setUpCameraOutputs current device support camera 2 level=", num2);
                    if (iIntValue == 2) {
                        LogUtil.d("CameraHelper", "setUpCameraOutputs current device cannot support camera 2");
                    }
                    Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                    if (obj != null && (obj instanceof Integer)) {
                        this.v = ((Integer) obj).intValue();
                    }
                    LogUtil.b("CameraHelper", "isSwappedDimensions mSensorOrientation=", Integer.valueOf(this.v));
                    this.f40720a = j();
                    b(i, i2, streamConfigurationMap);
                    LogUtil.b("CameraHelper", "setUpCameraOutputs mSelectPreviewSize.width=", Integer.valueOf(this.u.getWidth()), " mSelectPreviewSize.height=", Integer.valueOf(this.u.getHeight()));
                    Size sizeB = b(streamConfigurationMap.getOutputSizes(this.o), i, i2, this.f40720a);
                    this.k = sizeB;
                    if (sizeB == null) {
                        this.k = this.u;
                        LogUtil.e("CameraHelper", "mCaptureSize == null use mSelectPreviewSize");
                    }
                    LogUtil.b("CameraHelper", "mCaptureSize.getWidth(): ", Integer.valueOf(this.k.getWidth()), "mCaptureSize.getHeight(): ", Integer.valueOf(this.k.getHeight()));
                    h();
                    Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                    this.p = zBooleanValue;
                    a(cameraManager, str);
                    this.h = str;
                    return;
                }
            }
        } catch (CameraAccessException e) {
            LogUtil.d("CameraHelper", "CameraAccessException: ", ExceptionUtils.c(e));
        } catch (NullPointerException e2) {
            LogUtil.d("CameraHelper", "setUpCameraOutputs NullPointerException: ", ExceptionUtils.c(e2));
        }
    }

    private void a(CameraManager cameraManager, String str) throws CameraAccessException {
        Range[] rangeArr = (Range[]) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        LogUtil.b("CameraHelper", "ranges: ", Arrays.toString(rangeArr));
        Range range = null;
        for (Range range2 : rangeArr) {
            int iIntValue = ((Integer) range2.getLower()).intValue();
            int iIntValue2 = ((Integer) range2.getUpper()).intValue();
            if (range == null || ((Integer) range.getLower()).intValue() < 20 || (iIntValue >= 20 && iIntValue <= ((Integer) range.getLower()).intValue() && iIntValue2 <= ((Integer) range.getUpper()).intValue())) {
                range = range2;
            }
        }
        if (range != null) {
            this.l = new Range<>((Integer) range.getLower(), (Integer) range.getUpper());
            ReleaseLogUtil.c("R_CameraHelper", "mFrameRateRange:  " + this.l.toString());
        }
    }

    private void h() {
        LogUtil.b("CameraHelper", "enter initImageReader");
        Size size = this.k;
        if (size == null) {
            ReleaseLogUtil.d("R_CameraHelper", "mCaptureSize == null ");
            return;
        }
        this.m = ImageReader.newInstance(size.getWidth(), this.k.getHeight(), this.o, 2);
        if (this.f40721b == null) {
            LogUtil.b("CameraHelper", "mBackgroundHandler == null startBackgroundThread");
            m();
        }
        this.m.setOnImageAvailableListener(this.r, this.f40721b);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    private boolean j() {
        int i;
        int rotation = this.d.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            i = this.v;
            if (i != 90 || i == 270) {
                return true;
            }
        } else {
            if (rotation != 1) {
                if (rotation == 2) {
                    i = this.v;
                    if (i != 90) {
                    }
                    return true;
                }
                if (rotation != 3) {
                    LogUtil.e("CameraHelper", "Display rotation is invalid displayRotation=: ", Integer.valueOf(rotation));
                    return false;
                }
            }
            int i2 = this.v;
            if (i2 == 0 || i2 == 180) {
                return true;
            }
        }
        return false;
    }

    private void b(int i, int i2, StreamConfigurationMap streamConfigurationMap) {
        this.d.getWindowManager().getDefaultDisplay().getSize(new Point());
        if (this.f40720a) {
            LogUtil.b("CameraHelper", "getPreviewSize swapped dimensions");
        } else {
            i2 = i;
            i = i2;
        }
        LogUtil.b("CameraHelper", "getPreviewSize previewWidth=", Integer.valueOf(i), " previewHeight=", Integer.valueOf(i2), " isSwappedDimensions=", Boolean.valueOf(this.f40720a));
        this.u = b(streamConfigurationMap.getOutputSizes(SurfaceTexture.class), i, i2, this.f40720a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    private static Size b(Size[] sizeArr, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        Arrays.sort(sizeArr, new Comparator() { // from class: lrl
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size2.getWidth()) * ((long) size2.getHeight())) - (((long) size.getWidth()) * ((long) size.getHeight())));
            }
        });
        float f4 = Float.MAX_VALUE;
        Size size = null;
        for (Size size2 : sizeArr) {
            sb.append("[" + size2.getWidth() + ", " + size2.getHeight() + "]");
            if (size2.getHeight() != 0 && size2.getWidth() != 0) {
                int height = z ? size2.getHeight() : size2.getWidth();
                int width = z ? size2.getWidth() : size2.getHeight();
                float f5 = height;
                if (f5 >= f * 0.8f) {
                    float f6 = width;
                    if (f6 >= 0.8f * f2) {
                        float fFloatValue = new BigDecimal(Math.abs(f3 - ((f5 * 1.0f) / f6))).setScale(4, 4).floatValue();
                        if (fFloatValue <= f4) {
                            size = size2;
                            f4 = fFloatValue;
                        }
                    } else {
                        arrayList.add(size2);
                    }
                } else {
                    arrayList.add(size2);
                }
            }
        }
        LogUtil.b("CameraHelper", "chooseOptimalSize ratio=", Float.valueOf(f3), " deltaRatioMin=", Float.valueOf(f4));
        LogUtil.b("CameraHelper", "chooseOptimalSize: ", sb);
        if (size != null) {
            LogUtil.b("CameraHelper", "chooseOptimalSize get bigEnough size");
            return size;
        }
        if (arrayList.size() > 0) {
            LogUtil.b("CameraHelper", "chooseOptimalSize get notBigEnough size");
            return (Size) Collections.max(arrayList, new b());
        }
        LogUtil.e("CameraHelper", "Couldn't find any suitable preview size");
        return sizeArr[sizeArr.length / 2];
    }

    static class b implements Comparator<Size> {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Size size, Size size2) {
            return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        }
    }

    private void m() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.e = handlerThread;
        handlerThread.start();
        this.f40721b = new Handler(this.e.getLooper());
    }

    private void o() {
        LogUtil.b("CameraHelper", "stopBackgroundThread");
        HandlerThread handlerThread = this.e;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.e.join();
                this.e = null;
                this.f40721b = null;
            } catch (InterruptedException e) {
                LogUtil.d("CameraHelper", "stopBackgroundThread InterruptedException: ", ExceptionUtils.c(e));
            }
        }
    }

    public void d() {
        try {
            try {
                LogUtil.b("CameraHelper", "closeCamera");
                this.i.acquire();
                CameraCaptureSession cameraCaptureSession = this.n;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.close();
                    this.n = null;
                }
                CameraDevice cameraDevice = this.f;
                if (cameraDevice != null) {
                    cameraDevice.close();
                    this.f = null;
                }
                ImageReader imageReader = this.m;
                if (imageReader != null) {
                    imageReader.setOnImageAvailableListener(null, null);
                    this.m.close();
                    this.m = null;
                }
                o();
            } catch (InterruptedException e) {
                LogUtil.d("CameraHelper", "Interrupted while trying to lock camera closing.", ExceptionUtils.c(e));
            }
        } finally {
            this.i.release();
        }
    }

    public void b() {
        try {
            LogUtil.b("CameraHelper", "createCameraPreviewSession start");
            TextureView textureView = this.aa;
            if (textureView == null) {
                LogUtil.e("CameraHelper", "createCameraPreviewSession mTextureView is null");
                return;
            }
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            Size size = this.u;
            if (size != null && surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(size.getWidth(), this.u.getHeight());
                Surface surface = new Surface(surfaceTexture);
                CameraDevice cameraDevice = this.f;
                if (cameraDevice == null) {
                    LogUtil.e("CameraHelper", "mCameraDevice == null");
                    return;
                }
                CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(1);
                this.x = builderCreateCaptureRequest;
                if (this.l != null) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, this.l);
                }
                this.x.addTarget(surface);
                if (this.m == null) {
                    h();
                }
                ImageReader imageReader = this.m;
                if (imageReader == null) {
                    ReleaseLogUtil.d("R_CameraHelper", "mImageReader == null");
                    return;
                }
                if (this.t) {
                    this.x.addTarget(imageReader.getSurface());
                }
                this.f.createCaptureSession(Arrays.asList(surface, this.m.getSurface()), new CameraCaptureSession.StateCallback() { // from class: lrk.2
                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        if (lrk.this.f == null) {
                            LogUtil.d("CameraHelper", "createCameraPreviewSession onConfigured mCameraDevice is null");
                            return;
                        }
                        LogUtil.b("CameraHelper", "createCameraPreviewSession onConfigured");
                        lrk.this.n = cameraCaptureSession;
                        try {
                            lrk.this.x.set(CaptureRequest.CONTROL_AF_MODE, 4);
                            lrk lrkVar = lrk.this;
                            lrkVar.a(lrkVar.x);
                            lrk lrkVar2 = lrk.this;
                            lrkVar2.q = lrkVar2.x.build();
                            lrk.this.n.setRepeatingRequest(lrk.this.q, lrk.this.g, lrk.this.f40721b);
                        } catch (CameraAccessException e) {
                            LogUtil.d("CameraHelper", "createCameraPreviewSession CameraAccessException：", ExceptionUtils.c(e));
                        } catch (IllegalArgumentException e2) {
                            LogUtil.d("CameraHelper", "createCameraPreviewSession IllegalArgumentException：", ExceptionUtils.c(e2));
                        } catch (IllegalStateException e3) {
                            if (lrk.this.j != null) {
                                lrk.this.j.onCameraError("createCameraPreviewSession IllegalStateException: " + ExceptionUtils.c(e3));
                            }
                        } catch (NullPointerException e4) {
                            LogUtil.d("CameraHelper", "createCameraPreviewSession NullPointerException：", ExceptionUtils.c(e4));
                        }
                    }

                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                        LogUtil.b("CameraHelper", "createCameraPreviewSession createCaptureSession failed");
                    }
                }, null);
                return;
            }
            LogUtil.e("CameraHelper", "mSelectPreviewSize or texture is null");
        } catch (CameraAccessException | RuntimeException e) {
            ReleaseLogUtil.b("R_CameraHelper", "createCameraPreviewSession Exception: ", ExceptionUtils.c(e));
        }
    }

    public void b(int i, int i2) {
        Activity activity;
        if (this.aa == null || this.u == null || (activity = this.d) == null) {
            LogUtil.d("CameraHelper", "configureTransform fail");
            return;
        }
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        Matrix matrix = new Matrix();
        float f = i;
        float f2 = i2;
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        RectF rectF2 = new RectF(0.0f, 0.0f, this.u.getHeight(), this.u.getWidth());
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        boolean zD = d(this.d);
        LogUtil.b("CameraHelper", "configureTransform rotation=", Integer.valueOf(rotation), " mIsDefaultInMagicWindow: ", Boolean.valueOf(this.s), " isInMagicWindow:", Boolean.valueOf(zD));
        if (this.s && zD && (rotation == 1 || rotation == 3)) {
            rotation = 0;
        }
        if (rotation == 1 || rotation == 3) {
            rectF2.offset(fCenterX - rectF2.centerX(), fCenterY - rectF2.centerY());
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            float fMax = Math.max(f2 / this.u.getHeight(), f / this.u.getWidth());
            matrix.postScale(fMax, fMax, fCenterX, fCenterY);
            matrix.postRotate((rotation - 2) * 90, fCenterX, fCenterY);
        } else if (rotation == 2) {
            matrix.postRotate(180.0f, fCenterX, fCenterY);
        } else {
            LogUtil.b("CameraHelper", "configureTransform normal rotation");
        }
        this.aa.setTransform(matrix);
    }

    private boolean d(Context context) {
        if (context == null) {
            LogUtil.e("CameraHelper", "isInMagicWindow() context is null!!");
            return false;
        }
        String string = context.getResources().getConfiguration().toString();
        return string.contains("hwMultiwindow-magic") || string.contains("hw-magic-windows");
    }

    private void f() {
        if (this.d == null || this.f == null || this.x == null) {
            LogUtil.d("CameraHelper", "cannot lock focus to take photo");
            return;
        }
        try {
            ReleaseLogUtil.c("R_CameraHelper", "takePicture lockFocus");
            this.x.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            this.y = 1;
            CameraCaptureSession cameraCaptureSession = this.n;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.capture(this.x.build(), this.g, this.f40721b);
            } else {
                LogUtil.d("CameraHelper", "lockFocus mCaptureSession is null");
            }
        } catch (CameraAccessException | IllegalStateException e) {
            LogUtil.d("CameraHelper", "lockFocus CameraAccessException or IllegalStateException: ", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ReleaseLogUtil.c("R_CameraHelper", "runPreCaptureSequence");
        if (this.f == null || this.d == null) {
            ReleaseLogUtil.b("R_CameraHelper", "runPreCaptureSequence cannot run pre capture sequence");
            return;
        }
        try {
            this.x.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            ReleaseLogUtil.c("R_CameraHelper", "runPreCaptureSequence set CONTROL_AE_PRECAPTURE_TRIGGER_START");
            CameraCaptureSession cameraCaptureSession = this.n;
            if (cameraCaptureSession != null) {
                this.y = 2;
                cameraCaptureSession.capture(this.x.build(), this.g, this.f40721b);
                ReleaseLogUtil.c("R_CameraHelper", "runPreCaptureSequence State changed to: WAITING_PRECAPTURE");
                return;
            }
            ReleaseLogUtil.b("R_CameraHelper", "runPreCaptureSequence mCaptureSession is null.");
        } catch (CameraAccessException e) {
            ReleaseLogUtil.b("R_CameraHelper", "runPreCaptureSequence CameraAccessException: ", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        try {
            if (this.d != null && this.f != null && this.f40722c) {
                ReleaseLogUtil.c("R_CameraHelper", "captureStillPicture start");
                CaptureRequest.Builder builderCreateCaptureRequest = this.f.createCaptureRequest(2);
                builderCreateCaptureRequest.addTarget(this.m.getSurface());
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
                a(builderCreateCaptureRequest);
                CameraCaptureSession.CaptureCallback captureCallback = new CameraCaptureSession.CaptureCallback() { // from class: lrk.4
                    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                        ReleaseLogUtil.c("R_CameraHelper", "captureStillPicture onCaptureCompleted");
                    }
                };
                CameraCaptureSession cameraCaptureSession = this.n;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.stopRepeating();
                    this.n.capture(builderCreateCaptureRequest.build(), captureCallback, this.f40721b);
                    return;
                }
                return;
            }
            ReleaseLogUtil.b("R_CameraHelper", "captureStillPicture mActivity|mCameraDevice is null or closed");
        } catch (CameraAccessException e) {
            ReleaseLogUtil.b("R_CameraHelper", "captureStillPicture CameraAccessException: ", ExceptionUtils.c(e));
        } catch (IllegalStateException e2) {
            ReleaseLogUtil.b("R_CameraHelper", "captureStillPicture IllegalStateException: ", ExceptionUtils.c(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CaptureRequest.Builder builder) {
        if (this.p) {
            LogUtil.b("CameraHelper", "setAutoFlash mode on auto flash");
            builder.set(CaptureRequest.CONTROL_AE_MODE, 2);
        }
    }

    public void g() {
        CaptureRequest.Builder builder;
        try {
            ReleaseLogUtil.c("R_CameraHelper", "unlockFocus...");
            if (this.f != null && this.d != null && (builder = this.x) != null) {
                builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                a(this.x);
                CameraCaptureSession cameraCaptureSession = this.n;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.capture(this.x.build(), this.g, this.f40721b);
                    this.y = 0;
                    this.n.setRepeatingRequest(this.q, this.g, this.f40721b);
                    return;
                }
                return;
            }
            ReleaseLogUtil.b("R_CameraHelper", "cannot unlock focus after capture");
        } catch (CameraAccessException | NullPointerException e) {
            ReleaseLogUtil.b("R_CameraHelper", "unlockFocus Exception: ", ExceptionUtils.c(e));
        }
    }

    public void c() {
        f();
    }

    public void b(boolean z) {
        d();
        b(this.aa.getWidth(), this.aa.getHeight(), z);
    }

    public void a() {
        LogUtil.b("CameraHelper", "onDestroy");
        this.aa = null;
        this.d = null;
        this.j = null;
    }
}
