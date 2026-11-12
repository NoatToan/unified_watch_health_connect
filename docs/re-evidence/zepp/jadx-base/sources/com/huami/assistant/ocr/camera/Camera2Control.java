package com.huami.assistant.ocr.camera;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
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
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.huami.assistant.ocr.camera.Camera2Control;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(21)
public class Camera2Control implements ICameraControl {
    private static final int A = 0;
    private static final int B = 1;
    private static final int C = 2;
    private static final int D = 3;
    private static final int E = 4;
    private static final int F = 1920;
    private static final int G = 1080;
    public static final /* synthetic */ boolean H = false;
    private static final SparseIntArray y;
    private static final int z = 2048;
    private int a;
    private Context d;
    private ICameraControl.OnTakePictureCallback e;
    private PermissionCallback g;
    private String h;
    private TextureView i;
    private Size j;
    private HandlerThread l;
    private Handler m;
    private ImageReader n;
    private CameraCaptureSession o;
    private CameraDevice p;
    private CaptureRequest.Builder q;
    private CaptureRequest r;
    private int t;
    private int b = 0;
    private int c = 0;
    private final ImageReader.OnImageAvailableListener f = new a();
    private Rect k = new Rect();
    private Semaphore s = new Semaphore(1);
    private CameraCaptureSession.CaptureCallback u = new b();
    private final CameraDevice.StateCallback v = new c();
    private Comparator<Size> w = new Comparator() { // from class: dj0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Camera2Control.B((Size) obj, (Size) obj2);
        }
    };
    private final TextureView.SurfaceTextureListener x = new d();

    public class a implements ImageReader.OnImageAvailableListener {
        public a() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader reader) {
            if (Camera2Control.this.e != null) {
                Image imageAcquireNextImage = reader.acquireNextImage();
                ByteBuffer buffer = imageAcquireNextImage.getPlanes()[0].getBuffer();
                byte[] bArr = new byte[buffer.remaining()];
                buffer.get(bArr);
                imageAcquireNextImage.close();
                Camera2Control.this.e.onPictureTaken(bArr);
            }
        }
    }

    public class b extends CameraCaptureSession.CaptureCallback {
        public b() {
        }

        private void a(CaptureResult result) {
            int i = Camera2Control.this.c;
            if (i == 1) {
                Integer num = (Integer) result.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    Camera2Control.this.v();
                    return;
                }
                int iIntValue = num.intValue();
                if (iIntValue != 2 && iIntValue != 4 && iIntValue != 5) {
                    Camera2Control.this.v();
                    return;
                }
                Integer num2 = (Integer) result.get(CaptureResult.CONTROL_AE_STATE);
                if (num2 == null || num2.intValue() == 2) {
                    Camera2Control.this.v();
                    return;
                } else {
                    Camera2Control.this.F();
                    return;
                }
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                Integer num3 = (Integer) result.get(CaptureResult.CONTROL_AE_STATE);
                if (num3 == null || num3.intValue() != 5) {
                    Camera2Control.this.v();
                    return;
                }
                return;
            }
            Integer num4 = (Integer) result.get(CaptureResult.CONTROL_AE_STATE);
            if (num4 == null || num4.intValue() == 5 || num4.intValue() == 4) {
                Camera2Control.this.c = 3;
            } else if (num4.intValue() == 2) {
                Camera2Control.this.v();
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession session, @NonNull CaptureRequest request, @NonNull TotalCaptureResult result) {
            a(result);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession session, @NonNull CaptureRequest request, @NonNull CaptureResult partialResult) {
            a(partialResult);
        }
    }

    public class c extends CameraDevice.StateCallback {
        public c() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NonNull CameraDevice cameraDevice) {
            Camera2Control.this.s.release();
            cameraDevice.close();
            Camera2Control.this.p = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NonNull CameraDevice cameraDevice, int error) {
            Camera2Control.this.s.release();
            cameraDevice.close();
            Camera2Control.this.p = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@NonNull CameraDevice cameraDevice) {
            Camera2Control.this.s.release();
            Camera2Control.this.p = cameraDevice;
            Camera2Control.this.y();
        }
    }

    public class d implements TextureView.SurfaceTextureListener {
        public d() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture texture, int width, int height) {
            Camera2Control.this.D(width, height);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture texture) {
            Camera2Control.this.stop();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture texture, int width, int height) {
            Camera2Control.this.x(width, height);
            Camera2Control.this.k.left = 0;
            Camera2Control.this.k.top = 0;
            Camera2Control.this.k.right = width;
            Camera2Control.this.k.bottom = height;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture texture) {
        }
    }

    public class e extends CameraCaptureSession.StateCallback {
        public e() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
            if (Camera2Control.this.p == null) {
                return;
            }
            Camera2Control.this.o = cameraCaptureSession;
            try {
                Camera2Control.this.q.set(CaptureRequest.CONTROL_AF_MODE, 4);
                Camera2Control camera2Control = Camera2Control.this;
                camera2Control.r = camera2Control.q.build();
                Camera2Control.this.o.setRepeatingRequest(Camera2Control.this.r, Camera2Control.this.u, Camera2Control.this.m);
            } catch (CameraAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public class f extends CameraCaptureSession.CaptureCallback {
        public f() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession session, @NonNull CaptureRequest request, @NonNull TotalCaptureResult result) {
            Camera2Control.this.J();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession session, @NonNull CaptureRequest request, @NonNull CaptureFailure failure) {
            super.onCaptureFailed(session, request, failure);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y = sparseIntArray;
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 270);
        sparseIntArray.append(3, 180);
    }

    public Camera2Control(Context activity) {
        this.d = activity;
        this.i = new TextureView(activity);
    }

    private int A(int rotation) {
        return ((y.get(rotation) + this.t) + 270) % 360;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int B(Size size, Size size2) {
        return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
    }

    private void C() {
        if (this.o == null || this.c != 0) {
            return;
        }
        try {
            this.q.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            this.c = 1;
            this.o.capture(this.q.build(), this.u, this.m);
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(int width, int height) {
        if (ContextCompat.checkSelfPermission(this.d, "android.permission.CAMERA") != 0) {
            E();
            return;
        }
        G(width, height);
        x(width, height);
        CameraManager cameraManager = (CameraManager) this.d.getSystemService("camera");
        try {
            if (!this.s.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                throw new RuntimeException("Time out waiting to lock camera opening.");
            }
            cameraManager.openCamera(this.h, this.v, this.m);
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        } catch (InterruptedException e3) {
            throw new RuntimeException("Interrupted while trying to lock camera opening.", e3);
        }
    }

    private void E() {
        PermissionCallback permissionCallback = this.g;
        if (permissionCallback != null) {
            permissionCallback.onRequestPermission();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        try {
            this.q.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            this.c = 2;
            this.o.capture(this.q.build(), this.u, this.m);
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ba  */
    private void G(int width, int height) {
        StreamConfigurationMap streamConfigurationMap;
        int i;
        int i2;
        CameraManager cameraManager = (CameraManager) this.d.getSystemService("camera");
        try {
            boolean z2 = false;
            for (String str : cameraManager.getCameraIdList()) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if ((num == null || num.intValue() != 0) && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null) {
                    WindowManager windowManager = (WindowManager) this.d.getSystemService("window");
                    Point point = new Point();
                    windowManager.getDefaultDisplay().getSize(point);
                    int iMax = Math.max(2048, (point.y * 3) / 2);
                    Size sizeZ = z(streamConfigurationMap.getOutputSizes(256), this.i.getWidth(), this.i.getHeight(), iMax, iMax, new Size(4, 3));
                    ImageReader imageReaderNewInstance = ImageReader.newInstance(sizeZ.getWidth(), sizeZ.getHeight(), 256, 1);
                    this.n = imageReaderNewInstance;
                    imageReaderNewInstance.setOnImageAvailableListener(this.f, this.m);
                    int i3 = this.b;
                    int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                    this.t = iIntValue;
                    if (i3 == 0) {
                        if (iIntValue != 90 || iIntValue == 270) {
                            z2 = true;
                        }
                    } else if (i3 == 1) {
                        if (iIntValue != 0 || iIntValue == 180) {
                            z2 = true;
                        }
                    } else if (i3 != 2) {
                        if (i3 == 3) {
                            if (iIntValue != 0) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                        }
                    } else if (iIntValue != 90) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    int i4 = point.x;
                    int i5 = point.y;
                    if (z2) {
                        i2 = width;
                        i = height;
                        i5 = i4;
                        i4 = i5;
                    } else {
                        i = width;
                        i2 = height;
                    }
                    this.j = z(streamConfigurationMap.getOutputSizes(SurfaceTexture.class), i, i2, Math.min(i4, F), Math.min(i5, G), sizeZ);
                    this.h = str;
                    return;
                }
            }
        } catch (CameraAccessException | NullPointerException e2) {
            e2.printStackTrace();
        }
    }

    private void H() {
        HandlerThread handlerThread = new HandlerThread("ocr_camera");
        this.l = handlerThread;
        handlerThread.start();
        this.m = new Handler(this.l.getLooper());
    }

    private void I() {
        HandlerThread handlerThread = this.l;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.l = null;
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        try {
            this.q.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            this.o.capture(this.q.build(), this.u, this.m);
            this.c = 0;
            this.o.setRepeatingRequest(this.r, this.u, this.m);
            this.i.setSurfaceTextureListener(this.x);
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }

    private void K(@ICameraControl.FlashMode int flashMode, CaptureRequest.Builder builder) {
        if (flashMode == 0) {
            builder.set(CaptureRequest.FLASH_MODE, 0);
        } else if (flashMode != 1) {
            builder.set(CaptureRequest.FLASH_MODE, 1);
        } else {
            builder.set(CaptureRequest.FLASH_MODE, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        CameraDevice cameraDevice;
        try {
            if (this.d != null && (cameraDevice = this.p) != null) {
                CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(2);
                builderCreateCaptureRequest.addTarget(this.n.getSurface());
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
                builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(A(this.b)));
                K(this.a, builderCreateCaptureRequest);
                f fVar = new f();
                this.o.stopRepeating();
                this.o.capture(builderCreateCaptureRequest.build(), fVar, this.m);
                this.c = 4;
            }
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }

    private void w() {
        try {
            try {
                this.s.acquire();
                CameraCaptureSession cameraCaptureSession = this.o;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.close();
                    this.o = null;
                }
                CameraDevice cameraDevice = this.p;
                if (cameraDevice != null) {
                    cameraDevice.close();
                    this.p = null;
                }
                ImageReader imageReader = this.n;
                if (imageReader != null) {
                    imageReader.close();
                    this.n = null;
                }
                this.s.release();
            } catch (InterruptedException e2) {
                throw new RuntimeException("Interrupted while trying to lock camera closing.", e2);
            }
        } catch (Throwable th) {
            this.s.release();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(int viewWidth, int viewHeight) {
        if (this.i == null || this.j == null || this.d == null) {
            return;
        }
        int i = this.b;
        Matrix matrix = new Matrix();
        float f2 = viewWidth;
        float f3 = viewHeight;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
        RectF rectF2 = new RectF(0.0f, 0.0f, this.j.getHeight(), this.j.getWidth());
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        if (1 == i || 3 == i) {
            rectF2.offset(fCenterX - rectF2.centerX(), fCenterY - rectF2.centerY());
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            float fMax = Math.max(f3 / this.j.getHeight(), f2 / this.j.getWidth());
            matrix.postScale(fMax, fMax, fCenterX, fCenterY);
            matrix.postRotate((i - 2) * 90, fCenterX, fCenterY);
        } else if (2 == i) {
            matrix.postRotate(180.0f, fCenterX, fCenterY);
        }
        this.i.setTransform(matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        try {
            SurfaceTexture surfaceTexture = this.i.getSurfaceTexture();
            surfaceTexture.setDefaultBufferSize(this.j.getWidth(), this.j.getHeight());
            Surface surface = new Surface(surfaceTexture);
            CaptureRequest.Builder builderCreateCaptureRequest = this.p.createCaptureRequest(1);
            this.q = builderCreateCaptureRequest;
            builderCreateCaptureRequest.addTarget(surface);
            K(this.a, this.q);
            this.p.createCaptureSession(Arrays.asList(surface, this.n.getSurface()), new e(), null);
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }

    private Size z(Size[] choices, int textureViewWidth, int textureViewHeight, int maxWidth, int maxHeight, Size aspectRatio) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int width = aspectRatio.getWidth();
        int height = aspectRatio.getHeight();
        for (Size size : choices) {
            if (size.getWidth() <= maxWidth && size.getHeight() <= maxHeight && size.getHeight() == (size.getWidth() * height) / width) {
                if (size.getWidth() < textureViewWidth || size.getHeight() < textureViewHeight) {
                    arrayList2.add(size);
                } else {
                    arrayList.add(size);
                }
            }
        }
        if (arrayList.size() > 0) {
            return (Size) Collections.min(arrayList, this.w);
        }
        for (Size size2 : choices) {
            if (size2.getWidth() >= maxWidth && size2.getHeight() >= maxHeight) {
                return size2;
            }
        }
        return arrayList2.size() > 0 ? (Size) Collections.max(arrayList2, this.w) : choices[0];
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public AtomicBoolean getAbortingScan() {
        return null;
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public View getDisplayView() {
        return this.i;
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public int getFlashMode() {
        return this.a;
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public Rect getPreviewFrame() {
        return this.k;
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void pause() {
        setFlashMode(0);
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void refreshPermission() {
        D(this.i.getWidth(), this.i.getHeight());
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void resume() {
        this.c = 0;
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void setDetectCallback(ICameraControl.OnDetectPictureCallback callback) {
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void setDisplayOrientation(@CameraView.Orientation int displayOrientation) {
        this.b = displayOrientation / 90;
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void setFlashMode(@ICameraControl.FlashMode int flashMode) {
        if (this.a == flashMode) {
            return;
        }
        this.a = flashMode;
        try {
            this.q.set(CaptureRequest.CONTROL_AF_MODE, 4);
            K(flashMode, this.q);
            CaptureRequest captureRequestBuild = this.q.build();
            this.r = captureRequestBuild;
            this.o.setRepeatingRequest(captureRequestBuild, this.u, this.m);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void setPermissionCallback(PermissionCallback callback) {
        this.g = callback;
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void start() {
        H();
        if (!this.i.isAvailable()) {
            this.i.setSurfaceTextureListener(this.x);
        } else {
            D(this.i.getWidth(), this.i.getHeight());
            this.i.setSurfaceTextureListener(this.x);
        }
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void stop() {
        this.i.setSurfaceTextureListener(null);
        w();
        I();
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void takePicture(ICameraControl.OnTakePictureCallback callback) {
        this.e = callback;
        C();
    }
}
