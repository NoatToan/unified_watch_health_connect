package org.opencv.android;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import com.facebook.share.internal.MessengerShareContentUtility;
import java.util.List;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

/* JADX INFO: loaded from: classes23.dex */
public class JavaCameraView extends CameraBridgeViewBase implements Camera.PreviewCallback {
    private static final int q = 10;
    private static final String r = "JavaCameraView";
    private byte[] i;
    private Mat[] j;
    private int k;
    private Thread l;
    private boolean m;
    public Camera mCamera;
    public c[] mCameraFrame;
    private SurfaceTexture n;
    private int o;
    private boolean p;

    public static class JavaCameraSizeAccessor implements CameraBridgeViewBase.ListItemAccessor {
        @Override // org.opencv.android.CameraBridgeViewBase.ListItemAccessor
        public int getHeight(Object obj) {
            return ((Camera.Size) obj).height;
        }

        @Override // org.opencv.android.CameraBridgeViewBase.ListItemAccessor
        public int getWidth(Object obj) {
            return ((Camera.Size) obj).width;
        }
    }

    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            do {
                synchronized (JavaCameraView.this) {
                    while (!JavaCameraView.this.p && !JavaCameraView.this.m) {
                        try {
                            JavaCameraView.this.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    z = false;
                    if (JavaCameraView.this.p) {
                        JavaCameraView javaCameraView = JavaCameraView.this;
                        javaCameraView.k = 1 - javaCameraView.k;
                        JavaCameraView.this.p = false;
                        z = true;
                    }
                }
                if (!JavaCameraView.this.m && z && !JavaCameraView.this.j[1 - JavaCameraView.this.k].empty()) {
                    JavaCameraView javaCameraView2 = JavaCameraView.this;
                    javaCameraView2.deliverAndDrawFrame(javaCameraView2.mCameraFrame[1 - javaCameraView2.k]);
                }
            } while (!JavaCameraView.this.m);
            Log.d(JavaCameraView.r, "Finish processing thread");
        }
    }

    public class c implements CameraBridgeViewBase.CvCameraViewFrame {
        private Mat a;
        private Mat b = new Mat();
        private int c;
        private int d;

        public c(Mat mat, int i, int i2) {
            this.c = i;
            this.d = i2;
            this.a = mat;
        }

        public void a() {
            this.b.release();
        }

        @Override // org.opencv.android.CameraBridgeViewBase.CvCameraViewFrame
        public Mat gray() {
            return this.a.submat(0, this.d, 0, this.c);
        }

        @Override // org.opencv.android.CameraBridgeViewBase.CvCameraViewFrame
        public Mat rgba() {
            if (JavaCameraView.this.o == 17) {
                Imgproc.cvtColor(this.a, this.b, 96, 4);
            } else {
                if (JavaCameraView.this.o != 842094169) {
                    throw new IllegalArgumentException("Preview Format can be NV21 or YV12");
                }
                Imgproc.cvtColor(this.a, this.b, 100, 4);
            }
            return this.b;
        }
    }

    public JavaCameraView(Context context, int i) {
        super(context, i);
        this.k = 0;
        this.o = 17;
        this.p = false;
    }

    @Override // org.opencv.android.CameraBridgeViewBase
    public boolean connectCamera(int i, int i2) {
        Log.d(r, "Connecting to camera");
        if (!initializeCamera(i, i2)) {
            return false;
        }
        this.p = false;
        Log.d(r, "Starting processing thread");
        this.m = false;
        Thread thread = new Thread(new b());
        this.l = thread;
        thread.start();
        return true;
    }

    @Override // org.opencv.android.CameraBridgeViewBase
    public void disconnectCamera() {
        Log.d(r, "Disconnecting from camera");
        try {
            try {
                this.m = true;
                Log.d(r, "Notify thread");
                synchronized (this) {
                    notify();
                }
                Log.d(r, "Waiting for thread");
                Thread thread = this.l;
                if (thread != null) {
                    thread.join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.l = null;
            releaseCamera();
            this.p = false;
        } catch (Throwable th) {
            this.l = null;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0269 A[Catch: Exception -> 0x0302, all -> 0x0308, TryCatch #3 {Exception -> 0x0302, blocks: (B:59:0x014a, B:61:0x015b, B:63:0x016e, B:65:0x0176, B:67:0x0180, B:69:0x0188, B:71:0x0190, B:73:0x019a, B:75:0x01a4, B:77:0x01ae, B:80:0x01b9, B:82:0x01c5, B:84:0x0206, B:86:0x0210, B:87:0x0213, B:89:0x0219, B:91:0x0221, B:92:0x0226, B:94:0x0249, B:96:0x0251, B:98:0x0265, B:100:0x0269, B:101:0x0270, B:103:0x02e0, B:105:0x02f4, B:104:0x02ef, B:97:0x0262, B:81:0x01bf), top: B:119:0x014a, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x02e0 A[Catch: Exception -> 0x0302, all -> 0x0308, TryCatch #3 {Exception -> 0x0302, blocks: (B:59:0x014a, B:61:0x015b, B:63:0x016e, B:65:0x0176, B:67:0x0180, B:69:0x0188, B:71:0x0190, B:73:0x019a, B:75:0x01a4, B:77:0x01ae, B:80:0x01b9, B:82:0x01c5, B:84:0x0206, B:86:0x0210, B:87:0x0213, B:89:0x0219, B:91:0x0221, B:92:0x0226, B:94:0x0249, B:96:0x0251, B:98:0x0265, B:100:0x0269, B:101:0x0270, B:103:0x02e0, B:105:0x02f4, B:104:0x02ef, B:97:0x0262, B:81:0x01bf), top: B:119:0x014a, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x02ef A[Catch: Exception -> 0x0302, all -> 0x0308, TryCatch #3 {Exception -> 0x0302, blocks: (B:59:0x014a, B:61:0x015b, B:63:0x016e, B:65:0x0176, B:67:0x0180, B:69:0x0188, B:71:0x0190, B:73:0x019a, B:75:0x01a4, B:77:0x01ae, B:80:0x01b9, B:82:0x01c5, B:84:0x0206, B:86:0x0210, B:87:0x0213, B:89:0x0219, B:91:0x0221, B:92:0x0226, B:94:0x0249, B:96:0x0251, B:98:0x0265, B:100:0x0269, B:101:0x0270, B:103:0x02e0, B:105:0x02f4, B:104:0x02ef, B:97:0x0262, B:81:0x01bf), top: B:119:0x014a, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0144 A[Catch: all -> 0x0308, EDGE_INSN: B:25:0x0099->B:55:0x0144 BREAK  A[LOOP:0: B:17:0x0047->B:26:0x009b], TryCatch #2 {, blocks: (B:5:0x0009, B:7:0x0014, B:8:0x001b, B:12:0x003d, B:14:0x0041, B:17:0x0047, B:19:0x004d, B:20:0x006c, B:26:0x009b, B:23:0x0075, B:55:0x0144, B:57:0x0148, B:59:0x014a, B:61:0x015b, B:63:0x016e, B:65:0x0176, B:67:0x0180, B:69:0x0188, B:71:0x0190, B:73:0x019a, B:75:0x01a4, B:77:0x01ae, B:80:0x01b9, B:82:0x01c5, B:84:0x0206, B:86:0x0210, B:87:0x0213, B:89:0x0219, B:91:0x0221, B:92:0x0226, B:94:0x0249, B:96:0x0251, B:98:0x0265, B:100:0x0269, B:101:0x0270, B:103:0x02e0, B:105:0x02f4, B:104:0x02ef, B:97:0x0262, B:81:0x01bf, B:109:0x0306, B:108:0x0303, B:11:0x0023, B:27:0x009e, B:31:0x00a8, B:32:0x00b5, B:34:0x00bb, B:37:0x00c3, B:47:0x00e9, B:49:0x00f3, B:50:0x00fb, B:51:0x011a, B:54:0x0122, B:39:0x00c8, B:40:0x00d5, B:42:0x00db, B:45:0x00e4), top: B:118:0x0009, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0148 A[Catch: all -> 0x0308, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {, blocks: (B:5:0x0009, B:7:0x0014, B:8:0x001b, B:12:0x003d, B:14:0x0041, B:17:0x0047, B:19:0x004d, B:20:0x006c, B:26:0x009b, B:23:0x0075, B:55:0x0144, B:57:0x0148, B:59:0x014a, B:61:0x015b, B:63:0x016e, B:65:0x0176, B:67:0x0180, B:69:0x0188, B:71:0x0190, B:73:0x019a, B:75:0x01a4, B:77:0x01ae, B:80:0x01b9, B:82:0x01c5, B:84:0x0206, B:86:0x0210, B:87:0x0213, B:89:0x0219, B:91:0x0221, B:92:0x0226, B:94:0x0249, B:96:0x0251, B:98:0x0265, B:100:0x0269, B:101:0x0270, B:103:0x02e0, B:105:0x02f4, B:104:0x02ef, B:97:0x0262, B:81:0x01bf, B:109:0x0306, B:108:0x0303, B:11:0x0023, B:27:0x009e, B:31:0x00a8, B:32:0x00b5, B:34:0x00bb, B:37:0x00c3, B:47:0x00e9, B:49:0x00f3, B:50:0x00fb, B:51:0x011a, B:54:0x0122, B:39:0x00c8, B:40:0x00d5, B:42:0x00db, B:45:0x00e4), top: B:118:0x0009, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x015b A[Catch: Exception -> 0x0302, all -> 0x0308, TryCatch #3 {Exception -> 0x0302, blocks: (B:59:0x014a, B:61:0x015b, B:63:0x016e, B:65:0x0176, B:67:0x0180, B:69:0x0188, B:71:0x0190, B:73:0x019a, B:75:0x01a4, B:77:0x01ae, B:80:0x01b9, B:82:0x01c5, B:84:0x0206, B:86:0x0210, B:87:0x0213, B:89:0x0219, B:91:0x0221, B:92:0x0226, B:94:0x0249, B:96:0x0251, B:98:0x0265, B:100:0x0269, B:101:0x0270, B:103:0x02e0, B:105:0x02f4, B:104:0x02ef, B:97:0x0262, B:81:0x01bf), top: B:119:0x014a, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x016e A[Catch: Exception -> 0x0302, all -> 0x0308, TryCatch #3 {Exception -> 0x0302, blocks: (B:59:0x014a, B:61:0x015b, B:63:0x016e, B:65:0x0176, B:67:0x0180, B:69:0x0188, B:71:0x0190, B:73:0x019a, B:75:0x01a4, B:77:0x01ae, B:80:0x01b9, B:82:0x01c5, B:84:0x0206, B:86:0x0210, B:87:0x0213, B:89:0x0219, B:91:0x0221, B:92:0x0226, B:94:0x0249, B:96:0x0251, B:98:0x0265, B:100:0x0269, B:101:0x0270, B:103:0x02e0, B:105:0x02f4, B:104:0x02ef, B:97:0x0262, B:81:0x01bf), top: B:119:0x014a, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01bf A[Catch: Exception -> 0x0302, all -> 0x0308, TryCatch #3 {Exception -> 0x0302, blocks: (B:59:0x014a, B:61:0x015b, B:63:0x016e, B:65:0x0176, B:67:0x0180, B:69:0x0188, B:71:0x0190, B:73:0x019a, B:75:0x01a4, B:77:0x01ae, B:80:0x01b9, B:82:0x01c5, B:84:0x0206, B:86:0x0210, B:87:0x0213, B:89:0x0219, B:91:0x0221, B:92:0x0226, B:94:0x0249, B:96:0x0251, B:98:0x0265, B:100:0x0269, B:101:0x0270, B:103:0x02e0, B:105:0x02f4, B:104:0x02ef, B:97:0x0262, B:81:0x01bf), top: B:119:0x014a, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0206 A[Catch: Exception -> 0x0302, all -> 0x0308, TryCatch #3 {Exception -> 0x0302, blocks: (B:59:0x014a, B:61:0x015b, B:63:0x016e, B:65:0x0176, B:67:0x0180, B:69:0x0188, B:71:0x0190, B:73:0x019a, B:75:0x01a4, B:77:0x01ae, B:80:0x01b9, B:82:0x01c5, B:84:0x0206, B:86:0x0210, B:87:0x0213, B:89:0x0219, B:91:0x0221, B:92:0x0226, B:94:0x0249, B:96:0x0251, B:98:0x0265, B:100:0x0269, B:101:0x0270, B:103:0x02e0, B:105:0x02f4, B:104:0x02ef, B:97:0x0262, B:81:0x01bf), top: B:119:0x014a, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0219 A[Catch: Exception -> 0x0302, all -> 0x0308, TryCatch #3 {Exception -> 0x0302, blocks: (B:59:0x014a, B:61:0x015b, B:63:0x016e, B:65:0x0176, B:67:0x0180, B:69:0x0188, B:71:0x0190, B:73:0x019a, B:75:0x01a4, B:77:0x01ae, B:80:0x01b9, B:82:0x01c5, B:84:0x0206, B:86:0x0210, B:87:0x0213, B:89:0x0219, B:91:0x0221, B:92:0x0226, B:94:0x0249, B:96:0x0251, B:98:0x0265, B:100:0x0269, B:101:0x0270, B:103:0x02e0, B:105:0x02f4, B:104:0x02ef, B:97:0x0262, B:81:0x01bf), top: B:119:0x014a, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0249 A[Catch: Exception -> 0x0302, all -> 0x0308, TryCatch #3 {Exception -> 0x0302, blocks: (B:59:0x014a, B:61:0x015b, B:63:0x016e, B:65:0x0176, B:67:0x0180, B:69:0x0188, B:71:0x0190, B:73:0x019a, B:75:0x01a4, B:77:0x01ae, B:80:0x01b9, B:82:0x01c5, B:84:0x0206, B:86:0x0210, B:87:0x0213, B:89:0x0219, B:91:0x0221, B:92:0x0226, B:94:0x0249, B:96:0x0251, B:98:0x0265, B:100:0x0269, B:101:0x0270, B:103:0x02e0, B:105:0x02f4, B:104:0x02ef, B:97:0x0262, B:81:0x01bf), top: B:119:0x014a, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0262 A[Catch: Exception -> 0x0302, all -> 0x0308, TryCatch #3 {Exception -> 0x0302, blocks: (B:59:0x014a, B:61:0x015b, B:63:0x016e, B:65:0x0176, B:67:0x0180, B:69:0x0188, B:71:0x0190, B:73:0x019a, B:75:0x01a4, B:77:0x01ae, B:80:0x01b9, B:82:0x01c5, B:84:0x0206, B:86:0x0210, B:87:0x0213, B:89:0x0219, B:91:0x0221, B:92:0x0226, B:94:0x0249, B:96:0x0251, B:98:0x0265, B:100:0x0269, B:101:0x0270, B:103:0x02e0, B:105:0x02f4, B:104:0x02ef, B:97:0x0262, B:81:0x01bf), top: B:119:0x014a, outer: #2 }] */
    public boolean initializeCamera(int i, int i2) {
        int i3;
        Camera camera;
        Camera.Parameters parameters;
        List<Camera.Size> supportedPreviewSizes;
        String str;
        int i4;
        List<String> supportedFocusModes;
        FpsMeter fpsMeter;
        Log.d(r, "Initialize java camera");
        synchronized (this) {
            this.mCamera = null;
            int i5 = this.mCameraIndex;
            boolean z = false;
            if (i5 != -1) {
                if (Build.VERSION.SDK_INT < 9) {
                    camera = this.mCamera;
                    if (camera == null) {
                        return false;
                    }
                    parameters = camera.getParameters();
                    Log.d(r, "getSupportedPreviewSizes()");
                    supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                    if (supportedPreviewSizes != null) {
                        Size sizeCalculateCameraFrameSize = calculateCameraFrameSize(supportedPreviewSizes, new JavaCameraSizeAccessor(), i, i2);
                        str = Build.FINGERPRINT;
                        if (str.startsWith(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE)) {
                            parameters.setPreviewFormat(842094169);
                        } else {
                            parameters.setPreviewFormat(842094169);
                        }
                        this.o = parameters.getPreviewFormat();
                        Log.d(r, "Set preview size to " + Integer.valueOf((int) sizeCalculateCameraFrameSize.width) + "x" + Integer.valueOf((int) sizeCalculateCameraFrameSize.height));
                        parameters.setPreviewSize((int) sizeCalculateCameraFrameSize.width, (int) sizeCalculateCameraFrameSize.height);
                        i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 14) {
                            parameters.setRecordingHint(true);
                        }
                        supportedFocusModes = parameters.getSupportedFocusModes();
                        if (supportedFocusModes != null) {
                            parameters.setFocusMode("continuous-video");
                        }
                        this.mCamera.setParameters(parameters);
                        Camera.Parameters parameters2 = this.mCamera.getParameters();
                        this.mFrameWidth = parameters2.getPreviewSize().width;
                        this.mFrameHeight = parameters2.getPreviewSize().height;
                        if (getLayoutParams().width == -1) {
                            this.mScale = 0.0f;
                        } else {
                            this.mScale = 0.0f;
                        }
                        fpsMeter = this.mFpsMeter;
                        if (fpsMeter != null) {
                            fpsMeter.setResolution(this.mFrameWidth, this.mFrameHeight);
                        }
                        byte[] bArr = new byte[((this.mFrameWidth * this.mFrameHeight) * ImageFormat.getBitsPerPixel(parameters2.getPreviewFormat())) / 8];
                        this.i = bArr;
                        this.mCamera.addCallbackBuffer(bArr);
                        this.mCamera.setPreviewCallbackWithBuffer(this);
                        Mat[] matArr = new Mat[2];
                        this.j = matArr;
                        int i6 = this.mFrameHeight;
                        int i7 = this.mFrameWidth;
                        int i8 = CvType.CV_8UC1;
                        matArr[0] = new Mat(i6 + (i6 / 2), i7, i8);
                        Mat[] matArr2 = this.j;
                        int i9 = this.mFrameHeight;
                        matArr2[1] = new Mat(i9 + (i9 / 2), this.mFrameWidth, i8);
                        AllocateCache();
                        c[] cVarArr = new c[2];
                        this.mCameraFrame = cVarArr;
                        cVarArr[0] = new c(this.j[0], this.mFrameWidth, this.mFrameHeight);
                        this.mCameraFrame[1] = new c(this.j[1], this.mFrameWidth, this.mFrameHeight);
                        if (i4 >= 11) {
                            SurfaceTexture surfaceTexture = new SurfaceTexture(10);
                            this.n = surfaceTexture;
                            this.mCamera.setPreviewTexture(surfaceTexture);
                        } else {
                            this.mCamera.setPreviewDisplay(null);
                        }
                        Log.d(r, "startPreview");
                        this.mCamera.startPreview();
                        z = true;
                    }
                    return z;
                }
                if (i5 == 99) {
                    Log.i(r, "Trying to open back camera");
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    i3 = 0;
                    while (i3 < Camera.getNumberOfCameras()) {
                        Camera.getCameraInfo(i3, cameraInfo);
                        if (cameraInfo.facing == 0) {
                            i5 = i3;
                            break;
                        }
                        i3++;
                    }
                } else if (i5 == 98) {
                    Log.i(r, "Trying to open front camera");
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    i3 = 0;
                    while (i3 < Camera.getNumberOfCameras()) {
                        Camera.getCameraInfo(i3, cameraInfo2);
                        if (cameraInfo2.facing == 1) {
                            i5 = i3;
                            break;
                        }
                        i3++;
                    }
                }
                if (i5 == 99) {
                    Log.e(r, "Back camera not found!");
                } else if (i5 == 98) {
                    Log.e(r, "Front camera not found!");
                } else {
                    Log.d(r, "Trying to open camera with new open(" + Integer.valueOf(i5) + ")");
                    try {
                        this.mCamera = Camera.open(i5);
                    } catch (RuntimeException e) {
                        Log.e(r, "Camera #" + i5 + "failed to open: " + e.getLocalizedMessage());
                    }
                }
                camera = this.mCamera;
                if (camera == null) {
                    return false;
                }
                parameters = camera.getParameters();
                Log.d(r, "getSupportedPreviewSizes()");
                supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                if (supportedPreviewSizes != null) {
                    Size sizeCalculateCameraFrameSize2 = calculateCameraFrameSize(supportedPreviewSizes, new JavaCameraSizeAccessor(), i, i2);
                    str = Build.FINGERPRINT;
                    if (str.startsWith(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE)) {
                        parameters.setPreviewFormat(842094169);
                    } else {
                        parameters.setPreviewFormat(842094169);
                    }
                    this.o = parameters.getPreviewFormat();
                    Log.d(r, "Set preview size to " + Integer.valueOf((int) sizeCalculateCameraFrameSize2.width) + "x" + Integer.valueOf((int) sizeCalculateCameraFrameSize2.height));
                    parameters.setPreviewSize((int) sizeCalculateCameraFrameSize2.width, (int) sizeCalculateCameraFrameSize2.height);
                    i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 14) {
                        parameters.setRecordingHint(true);
                    }
                    supportedFocusModes = parameters.getSupportedFocusModes();
                    if (supportedFocusModes != null) {
                        parameters.setFocusMode("continuous-video");
                    }
                    this.mCamera.setParameters(parameters);
                    Camera.Parameters parameters3 = this.mCamera.getParameters();
                    this.mFrameWidth = parameters3.getPreviewSize().width;
                    this.mFrameHeight = parameters3.getPreviewSize().height;
                    if (getLayoutParams().width == -1) {
                        this.mScale = 0.0f;
                    } else {
                        this.mScale = 0.0f;
                    }
                    fpsMeter = this.mFpsMeter;
                    if (fpsMeter != null) {
                        fpsMeter.setResolution(this.mFrameWidth, this.mFrameHeight);
                    }
                    byte[] bArr2 = new byte[((this.mFrameWidth * this.mFrameHeight) * ImageFormat.getBitsPerPixel(parameters3.getPreviewFormat())) / 8];
                    this.i = bArr2;
                    this.mCamera.addCallbackBuffer(bArr2);
                    this.mCamera.setPreviewCallbackWithBuffer(this);
                    Mat[] matArr3 = new Mat[2];
                    this.j = matArr3;
                    int i10 = this.mFrameHeight;
                    int i11 = this.mFrameWidth;
                    int i12 = CvType.CV_8UC1;
                    matArr3[0] = new Mat(i10 + (i10 / 2), i11, i12);
                    Mat[] matArr4 = this.j;
                    int i13 = this.mFrameHeight;
                    matArr4[1] = new Mat(i13 + (i13 / 2), this.mFrameWidth, i12);
                    AllocateCache();
                    c[] cVarArr2 = new c[2];
                    this.mCameraFrame = cVarArr2;
                    cVarArr2[0] = new c(this.j[0], this.mFrameWidth, this.mFrameHeight);
                    this.mCameraFrame[1] = new c(this.j[1], this.mFrameWidth, this.mFrameHeight);
                    if (i4 >= 11) {
                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(10);
                        this.n = surfaceTexture2;
                        this.mCamera.setPreviewTexture(surfaceTexture2);
                    } else {
                        this.mCamera.setPreviewDisplay(null);
                    }
                    Log.d(r, "startPreview");
                    this.mCamera.startPreview();
                    z = true;
                }
                return z;
            }
            Log.d(r, "Trying to open camera with old open()");
            try {
                this.mCamera = Camera.open();
            } catch (Exception e2) {
                Log.e(r, "Camera is not available (in use or does not exist): " + e2.getLocalizedMessage());
            }
            if (this.mCamera != null || Build.VERSION.SDK_INT < 9) {
                camera = this.mCamera;
                if (camera == null) {
                    return false;
                }
                try {
                    parameters = camera.getParameters();
                    Log.d(r, "getSupportedPreviewSizes()");
                    supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                    if (supportedPreviewSizes != null) {
                        Size sizeCalculateCameraFrameSize3 = calculateCameraFrameSize(supportedPreviewSizes, new JavaCameraSizeAccessor(), i, i2);
                        str = Build.FINGERPRINT;
                        if (str.startsWith(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE) || str.startsWith("unknown")) {
                            parameters.setPreviewFormat(842094169);
                        } else {
                            String str2 = Build.MODEL;
                            if (str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || ((Build.BRAND.startsWith(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE) && Build.DEVICE.startsWith(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE)) || "google_sdk".equals(Build.PRODUCT))) {
                                parameters.setPreviewFormat(842094169);
                            } else {
                                parameters.setPreviewFormat(17);
                            }
                        }
                        this.o = parameters.getPreviewFormat();
                        Log.d(r, "Set preview size to " + Integer.valueOf((int) sizeCalculateCameraFrameSize3.width) + "x" + Integer.valueOf((int) sizeCalculateCameraFrameSize3.height));
                        parameters.setPreviewSize((int) sizeCalculateCameraFrameSize3.width, (int) sizeCalculateCameraFrameSize3.height);
                        i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 14 && !Build.MODEL.equals("GT-I9100")) {
                            parameters.setRecordingHint(true);
                        }
                        supportedFocusModes = parameters.getSupportedFocusModes();
                        if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
                            parameters.setFocusMode("continuous-video");
                        }
                        this.mCamera.setParameters(parameters);
                        Camera.Parameters parameters4 = this.mCamera.getParameters();
                        this.mFrameWidth = parameters4.getPreviewSize().width;
                        this.mFrameHeight = parameters4.getPreviewSize().height;
                        if (getLayoutParams().width == -1 || getLayoutParams().height != -1) {
                            this.mScale = 0.0f;
                        } else {
                            this.mScale = Math.min(i2 / this.mFrameHeight, i / this.mFrameWidth);
                        }
                        fpsMeter = this.mFpsMeter;
                        if (fpsMeter != null) {
                            fpsMeter.setResolution(this.mFrameWidth, this.mFrameHeight);
                        }
                        byte[] bArr3 = new byte[((this.mFrameWidth * this.mFrameHeight) * ImageFormat.getBitsPerPixel(parameters4.getPreviewFormat())) / 8];
                        this.i = bArr3;
                        this.mCamera.addCallbackBuffer(bArr3);
                        this.mCamera.setPreviewCallbackWithBuffer(this);
                        Mat[] matArr5 = new Mat[2];
                        this.j = matArr5;
                        int i14 = this.mFrameHeight;
                        int i15 = this.mFrameWidth;
                        int i16 = CvType.CV_8UC1;
                        matArr5[0] = new Mat(i14 + (i14 / 2), i15, i16);
                        Mat[] matArr6 = this.j;
                        int i17 = this.mFrameHeight;
                        matArr6[1] = new Mat(i17 + (i17 / 2), this.mFrameWidth, i16);
                        AllocateCache();
                        c[] cVarArr3 = new c[2];
                        this.mCameraFrame = cVarArr3;
                        cVarArr3[0] = new c(this.j[0], this.mFrameWidth, this.mFrameHeight);
                        this.mCameraFrame[1] = new c(this.j[1], this.mFrameWidth, this.mFrameHeight);
                        if (i4 >= 11) {
                            SurfaceTexture surfaceTexture3 = new SurfaceTexture(10);
                            this.n = surfaceTexture3;
                            this.mCamera.setPreviewTexture(surfaceTexture3);
                        } else {
                            this.mCamera.setPreviewDisplay(null);
                        }
                        Log.d(r, "startPreview");
                        this.mCamera.startPreview();
                        z = true;
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                return z;
            }
            boolean z2 = false;
            for (int i18 = 0; i18 < Camera.getNumberOfCameras(); i18++) {
                Log.d(r, "Trying to open camera with new open(" + Integer.valueOf(i18) + ")");
                try {
                    this.mCamera = Camera.open(i18);
                    z2 = true;
                } catch (RuntimeException e4) {
                    Log.e(r, "Camera #" + i18 + "failed to open: " + e4.getLocalizedMessage());
                }
                if (z2) {
                    break;
                }
            }
            camera = this.mCamera;
            if (camera == null) {
                return false;
            }
            parameters = camera.getParameters();
            Log.d(r, "getSupportedPreviewSizes()");
            supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            if (supportedPreviewSizes != null) {
                Size sizeCalculateCameraFrameSize4 = calculateCameraFrameSize(supportedPreviewSizes, new JavaCameraSizeAccessor(), i, i2);
                str = Build.FINGERPRINT;
                if (str.startsWith(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE)) {
                    parameters.setPreviewFormat(842094169);
                } else {
                    parameters.setPreviewFormat(842094169);
                }
                this.o = parameters.getPreviewFormat();
                Log.d(r, "Set preview size to " + Integer.valueOf((int) sizeCalculateCameraFrameSize4.width) + "x" + Integer.valueOf((int) sizeCalculateCameraFrameSize4.height));
                parameters.setPreviewSize((int) sizeCalculateCameraFrameSize4.width, (int) sizeCalculateCameraFrameSize4.height);
                i4 = Build.VERSION.SDK_INT;
                if (i4 >= 14) {
                    parameters.setRecordingHint(true);
                }
                supportedFocusModes = parameters.getSupportedFocusModes();
                if (supportedFocusModes != null) {
                    parameters.setFocusMode("continuous-video");
                }
                this.mCamera.setParameters(parameters);
                Camera.Parameters parameters5 = this.mCamera.getParameters();
                this.mFrameWidth = parameters5.getPreviewSize().width;
                this.mFrameHeight = parameters5.getPreviewSize().height;
                if (getLayoutParams().width == -1) {
                    this.mScale = 0.0f;
                } else {
                    this.mScale = 0.0f;
                }
                fpsMeter = this.mFpsMeter;
                if (fpsMeter != null) {
                    fpsMeter.setResolution(this.mFrameWidth, this.mFrameHeight);
                }
                byte[] bArr4 = new byte[((this.mFrameWidth * this.mFrameHeight) * ImageFormat.getBitsPerPixel(parameters5.getPreviewFormat())) / 8];
                this.i = bArr4;
                this.mCamera.addCallbackBuffer(bArr4);
                this.mCamera.setPreviewCallbackWithBuffer(this);
                Mat[] matArr7 = new Mat[2];
                this.j = matArr7;
                int i19 = this.mFrameHeight;
                int i110 = this.mFrameWidth;
                int i111 = CvType.CV_8UC1;
                matArr7[0] = new Mat(i19 + (i19 / 2), i110, i111);
                Mat[] matArr8 = this.j;
                int i112 = this.mFrameHeight;
                matArr8[1] = new Mat(i112 + (i112 / 2), this.mFrameWidth, i111);
                AllocateCache();
                c[] cVarArr4 = new c[2];
                this.mCameraFrame = cVarArr4;
                cVarArr4[0] = new c(this.j[0], this.mFrameWidth, this.mFrameHeight);
                this.mCameraFrame[1] = new c(this.j[1], this.mFrameWidth, this.mFrameHeight);
                if (i4 >= 11) {
                    SurfaceTexture surfaceTexture4 = new SurfaceTexture(10);
                    this.n = surfaceTexture4;
                    this.mCamera.setPreviewTexture(surfaceTexture4);
                } else {
                    this.mCamera.setPreviewDisplay(null);
                }
                Log.d(r, "startPreview");
                this.mCamera.startPreview();
                z = true;
            }
            return z;
            throw th;
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Log.d(r, "Preview Frame received. Frame size: " + bArr.length);
        synchronized (this) {
            this.j[this.k].put(0, 0, bArr);
            this.p = true;
            notify();
        }
        Camera camera2 = this.mCamera;
        if (camera2 != null) {
            camera2.addCallbackBuffer(this.i);
        }
    }

    public void releaseCamera() {
        synchronized (this) {
            Camera camera = this.mCamera;
            if (camera != null) {
                camera.stopPreview();
                this.mCamera.setPreviewCallback(null);
                this.mCamera.release();
            }
            this.mCamera = null;
            Mat[] matArr = this.j;
            if (matArr != null) {
                matArr[0].release();
                this.j[1].release();
            }
            c[] cVarArr = this.mCameraFrame;
            if (cVarArr != null) {
                cVarArr[0].a();
                this.mCameraFrame[1].a();
            }
        }
    }

    public JavaCameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = 0;
        this.o = 17;
        this.p = false;
    }
}
