package org.opencv.android;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

/* JADX INFO: loaded from: classes23.dex */
@TargetApi(21)
public class JavaCamera2View extends CameraBridgeViewBase {
    private static final String k = "JavaCamera2View";
    public static final /* synthetic */ boolean l = false;
    private HandlerThread i;
    private final CameraDevice.StateCallback j;
    public Handler mBackgroundHandler;
    public CameraDevice mCameraDevice;
    public String mCameraID;
    public CameraCaptureSession mCaptureSession;
    public ImageReader mImageReader;
    public int mPreviewFormat;
    public CaptureRequest.Builder mPreviewRequestBuilder;
    public Size mPreviewSize;

    public static class JavaCameraSizeAccessor implements CameraBridgeViewBase.ListItemAccessor {
        @Override // org.opencv.android.CameraBridgeViewBase.ListItemAccessor
        public int getHeight(Object obj) {
            return ((Size) obj).getHeight();
        }

        @Override // org.opencv.android.CameraBridgeViewBase.ListItemAccessor
        public int getWidth(Object obj) {
            return ((Size) obj).getWidth();
        }
    }

    public class a extends CameraDevice.StateCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            cameraDevice.close();
            JavaCamera2View.this.mCameraDevice = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            cameraDevice.close();
            JavaCamera2View.this.mCameraDevice = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            JavaCamera2View javaCamera2View = JavaCamera2View.this;
            javaCamera2View.mCameraDevice = cameraDevice;
            javaCamera2View.j();
        }
    }

    public class b implements ImageReader.OnImageAvailableListener {
        public static final /* synthetic */ boolean b = false;

        public b() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireLatestImage = imageReader.acquireLatestImage();
            if (imageAcquireLatestImage == null) {
                return;
            }
            imageAcquireLatestImage.getPlanes();
            d dVar = JavaCamera2View.this.new d(imageAcquireLatestImage);
            JavaCamera2View.this.deliverAndDrawFrame(dVar);
            dVar.a();
            imageAcquireLatestImage.close();
        }
    }

    public class c extends CameraCaptureSession.StateCallback {
        public c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Log.e(JavaCamera2View.k, "createCameraPreviewSession failed");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Log.i(JavaCamera2View.k, "createCaptureSession::onConfigured");
            JavaCamera2View javaCamera2View = JavaCamera2View.this;
            if (javaCamera2View.mCameraDevice == null) {
                return;
            }
            javaCamera2View.mCaptureSession = cameraCaptureSession;
            try {
                javaCamera2View.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 4);
                JavaCamera2View.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 2);
                JavaCamera2View javaCamera2View2 = JavaCamera2View.this;
                javaCamera2View2.mCaptureSession.setRepeatingRequest(javaCamera2View2.mPreviewRequestBuilder.build(), null, JavaCamera2View.this.mBackgroundHandler);
                Log.i(JavaCamera2View.k, "CameraPreviewSession has been started");
            } catch (Exception e) {
                Log.e(JavaCamera2View.k, "createCaptureSession failed", e);
            }
        }
    }

    public class d implements CameraBridgeViewBase.CvCameraViewFrame {
        public static final /* synthetic */ boolean e = false;
        private Image a;
        private Mat b = new Mat();
        private Mat c = new Mat();

        public d(Image image) {
            this.a = image;
        }

        public void a() {
            this.b.release();
            this.c.release();
        }

        @Override // org.opencv.android.CameraBridgeViewBase.CvCameraViewFrame
        public Mat gray() {
            Image.Plane[] planes = this.a.getPlanes();
            Mat mat = new Mat(this.a.getHeight(), this.a.getWidth(), CvType.CV_8UC1, planes[0].getBuffer(), planes[0].getRowStride());
            this.c = mat;
            return mat;
        }

        @Override // org.opencv.android.CameraBridgeViewBase.CvCameraViewFrame
        public Mat rgba() {
            int i;
            Image.Plane[] planes = this.a.getPlanes();
            int width = this.a.getWidth();
            int height = this.a.getHeight();
            if (planes[1].getPixelStride() == 2) {
                ByteBuffer buffer = planes[0].getBuffer();
                int rowStride = planes[0].getRowStride();
                ByteBuffer buffer2 = planes[1].getBuffer();
                int rowStride2 = planes[1].getRowStride();
                ByteBuffer buffer3 = planes[2].getBuffer();
                int rowStride3 = planes[2].getRowStride();
                Mat mat = new Mat(height, width, CvType.CV_8UC1, buffer, rowStride);
                int i2 = height / 2;
                int i3 = width / 2;
                int i4 = CvType.CV_8UC2;
                Mat mat2 = new Mat(i2, i3, i4, buffer2, rowStride2);
                Mat mat3 = new Mat(i2, i3, i4, buffer3, rowStride3);
                if (mat3.dataAddr() - mat2.dataAddr() > 0) {
                    Imgproc.cvtColorTwoPlane(mat, mat2, this.b, 94);
                } else {
                    Imgproc.cvtColorTwoPlane(mat, mat3, this.b, 96);
                }
                return this.b;
            }
            int i5 = height / 2;
            int i6 = height + i5;
            byte[] bArr = new byte[width * i6];
            ByteBuffer buffer4 = planes[0].getBuffer();
            ByteBuffer buffer5 = planes[1].getBuffer();
            ByteBuffer buffer6 = planes[2].getBuffer();
            int rowStride4 = planes[0].getRowStride();
            if (rowStride4 == width) {
                i = width * height;
                buffer4.get(bArr, 0, i);
            } else {
                int i7 = rowStride4 - width;
                int i8 = 0;
                for (int i9 = 0; i9 < height; i9++) {
                    buffer4.get(bArr, i8, width);
                    i8 += width;
                    if (i9 < height - 1) {
                        buffer4.position(buffer4.position() + i7);
                    }
                }
                i = i8;
            }
            int i10 = width / 2;
            int rowStride5 = planes[1].getRowStride() - i10;
            if (rowStride5 == 0) {
                int i11 = (height * width) / 4;
                buffer5.get(bArr, i, i11);
                buffer6.get(bArr, i + i11, i11);
            } else {
                for (int i12 = 0; i12 < i5; i12++) {
                    buffer5.get(bArr, i, i10);
                    i += i10;
                    if (i12 < i5 - 1) {
                        buffer5.position(buffer5.position() + rowStride5);
                    }
                }
                for (int i13 = 0; i13 < i5; i13++) {
                    buffer6.get(bArr, i, i10);
                    i += i10;
                    if (i13 < i5 - 1) {
                        buffer6.position(buffer6.position() + rowStride5);
                    }
                }
            }
            Mat mat4 = new Mat(i6, width, CvType.CV_8UC1);
            mat4.put(0, 0, bArr);
            Imgproc.cvtColor(mat4, this.b, 104, 4);
            return this.b;
        }
    }

    public JavaCamera2View(Context context, int i) {
        super(context, i);
        this.mPreviewFormat = 35;
        this.mPreviewSize = new Size(-1, -1);
        this.j = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        int width = this.mPreviewSize.getWidth();
        int height = this.mPreviewSize.getHeight();
        Log.i(k, "createCameraPreviewSession(" + width + "x" + height + ")");
        if (width < 0 || height < 0) {
            return;
        }
        try {
            if (this.mCameraDevice == null) {
                Log.e(k, "createCameraPreviewSession: camera isn't opened");
                return;
            }
            if (this.mCaptureSession != null) {
                Log.e(k, "createCameraPreviewSession: mCaptureSession is already started");
                return;
            }
            ImageReader imageReaderNewInstance = ImageReader.newInstance(width, height, this.mPreviewFormat, 2);
            this.mImageReader = imageReaderNewInstance;
            imageReaderNewInstance.setOnImageAvailableListener(new b(), this.mBackgroundHandler);
            Surface surface = this.mImageReader.getSurface();
            CaptureRequest.Builder builderCreateCaptureRequest = this.mCameraDevice.createCaptureRequest(1);
            this.mPreviewRequestBuilder = builderCreateCaptureRequest;
            builderCreateCaptureRequest.addTarget(surface);
            this.mCameraDevice.createCaptureSession(Arrays.asList(surface), new c(), null);
        } catch (CameraAccessException e) {
            Log.e(k, "createCameraPreviewSession", e);
        }
    }

    private void k() {
        Log.i(k, "startBackgroundThread");
        l();
        HandlerThread handlerThread = new HandlerThread("OpenCVCameraBackground");
        this.i = handlerThread;
        handlerThread.start();
        this.mBackgroundHandler = new Handler(this.i.getLooper());
    }

    private void l() {
        Log.i(k, "stopBackgroundThread");
        HandlerThread handlerThread = this.i;
        if (handlerThread == null) {
            return;
        }
        handlerThread.quitSafely();
        try {
            this.i.join();
            this.i = null;
            this.mBackgroundHandler = null;
        } catch (InterruptedException e) {
            Log.e(k, "stopBackgroundThread", e);
        }
    }

    @Override // org.opencv.android.CameraBridgeViewBase
    public boolean connectCamera(int i, int i2) {
        Log.i(k, "setCameraPreviewSize(" + i + "x" + i2 + ")");
        k();
        initializeCamera();
        try {
            boolean zI = i(i, i2);
            this.mFrameWidth = this.mPreviewSize.getWidth();
            this.mFrameHeight = this.mPreviewSize.getHeight();
            if (getLayoutParams().width == -1 && getLayoutParams().height == -1) {
                this.mScale = Math.min(i2 / this.mFrameHeight, i / this.mFrameWidth);
            } else {
                this.mScale = 0.0f;
            }
            AllocateCache();
            if (!zI) {
                return true;
            }
            if (this.mCaptureSession != null) {
                Log.d(k, "closing existing previewSession");
                this.mCaptureSession.close();
                this.mCaptureSession = null;
            }
            j();
            return true;
        } catch (RuntimeException e) {
            throw new RuntimeException("Interrupted while setCameraPreviewSize.", e);
        }
    }

    @Override // org.opencv.android.CameraBridgeViewBase
    public void disconnectCamera() {
        Log.i(k, "close camera");
        try {
            CameraDevice cameraDevice = this.mCameraDevice;
            this.mCameraDevice = null;
            CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.mCaptureSession = null;
            }
            if (cameraDevice != null) {
                cameraDevice.close();
            }
            l();
            ImageReader imageReader = this.mImageReader;
            if (imageReader != null) {
                imageReader.close();
                this.mImageReader = null;
            }
            Log.i(k, "camera closed!");
        } catch (Throwable th) {
            l();
            ImageReader imageReader2 = this.mImageReader;
            if (imageReader2 != null) {
                imageReader2.close();
                this.mImageReader = null;
            }
            throw th;
        }
    }

    public boolean i(int i, int i2) {
        Log.i(k, "calcPreviewSize: " + i + "x" + i2);
        if (this.mCameraID == null) {
            Log.e(k, "Camera isn't initialized!");
            return false;
        }
        try {
            org.opencv.core.Size sizeCalculateCameraFrameSize = calculateCameraFrameSize(Arrays.asList(((StreamConfigurationMap) ((CameraManager) getContext().getSystemService("camera")).getCameraCharacteristics(this.mCameraID).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(ImageReader.class)), new JavaCameraSizeAccessor(), i, i2);
            Log.i(k, "Selected preview size to " + Integer.valueOf((int) sizeCalculateCameraFrameSize.width) + "x" + Integer.valueOf((int) sizeCalculateCameraFrameSize.height));
            if (this.mPreviewSize.getWidth() == sizeCalculateCameraFrameSize.width && this.mPreviewSize.getHeight() == sizeCalculateCameraFrameSize.height) {
                return false;
            }
            this.mPreviewSize = new Size((int) sizeCalculateCameraFrameSize.width, (int) sizeCalculateCameraFrameSize.height);
            return true;
        } catch (CameraAccessException e) {
            Log.e(k, "calcPreviewSize - Camera Access Exception", e);
            return false;
        } catch (IllegalArgumentException e2) {
            Log.e(k, "calcPreviewSize - Illegal Argument Exception", e2);
            return false;
        } catch (SecurityException e3) {
            Log.e(k, "calcPreviewSize - Security Exception", e3);
            return false;
        }
    }

    public boolean initializeCamera() {
        Log.i(k, "initializeCamera");
        CameraManager cameraManager = (CameraManager) getContext().getSystemService("camera");
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            if (cameraIdList.length == 0) {
                Log.e(k, "Error: camera isn't detected.");
                return false;
            }
            if (this.mCameraIndex != -1) {
                for (String str : cameraIdList) {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    if ((this.mCameraIndex == 99 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) || (this.mCameraIndex == 98 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                        this.mCameraID = str;
                        break;
                    }
                }
            } else {
                this.mCameraID = cameraIdList[0];
            }
            if (this.mCameraID != null) {
                Log.i(k, "Opening camera: " + this.mCameraID);
                cameraManager.openCamera(this.mCameraID, this.j, this.mBackgroundHandler);
            } else {
                Log.i(k, "Trying to open camera with the value (" + this.mCameraIndex + ")");
                int i = this.mCameraIndex;
                if (i >= cameraIdList.length) {
                    throw new CameraAccessException(2);
                }
                String str2 = cameraIdList[i];
                this.mCameraID = str2;
                cameraManager.openCamera(str2, this.j, this.mBackgroundHandler);
            }
            return true;
        } catch (CameraAccessException e) {
            Log.e(k, "OpenCamera - Camera Access Exception", e);
            return false;
        } catch (IllegalArgumentException e2) {
            Log.e(k, "OpenCamera - Illegal Argument Exception", e2);
            return false;
        } catch (SecurityException e3) {
            Log.e(k, "OpenCamera - Security Exception", e3);
            return false;
        }
    }

    public JavaCamera2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPreviewFormat = 35;
        this.mPreviewSize = new Size(-1, -1);
        this.j = new a();
    }
}
