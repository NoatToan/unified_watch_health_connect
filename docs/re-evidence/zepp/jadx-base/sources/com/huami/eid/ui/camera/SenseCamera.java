package com.huami.eid.ui.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.sensetime.senseid.sdk.liveness.silent.common.type.Size;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class SenseCamera {
    public static final int CAMERA_FACING_FRONT = 1;
    private static final int l = 0;
    private static final float m = 0.01f;
    private final Object a;
    private Context b;
    private Camera c;
    private int d;
    private int e;
    private Size f;
    private float g;
    private int h;
    private int i;
    private Map<byte[], ByteBuffer> j;
    private Camera.PreviewCallback k;

    public static class Builder {
        private final SenseCamera a;

        public Builder(Context context) {
            SenseCamera senseCamera = new SenseCamera();
            this.a = senseCamera;
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            }
            senseCamera.b = context;
        }

        public SenseCamera build() {
            return this.a;
        }

        public Builder setFacing(int i) {
            if (i == 0 || i == 1) {
                this.a.d = i;
                return this;
            }
            throw new IllegalArgumentException("Invalid camera: " + i);
        }

        public Builder setRequestedFps(float f) {
            if (f > 0.0f) {
                this.a.g = f;
                return this;
            }
            throw new IllegalArgumentException("Invalid fps: " + f);
        }

        public Builder setRequestedPreviewSize(int i, int i2) {
            if (i > 0 && i <= 1000000 && i2 > 0 && i2 <= 1000000) {
                this.a.h = i;
                this.a.i = i2;
                return this;
            }
            throw new IllegalArgumentException("Invalid preview size: " + i + "x" + i2);
        }
    }

    public static class a {
        private Size a;
        private Size b;

        private a(Camera.Size size, Camera.Size size2) {
            this.a = new Size(size.width, size.height);
            if (size2 != null) {
                this.b = new Size(size2.width, size2.height);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Size c() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Size d() {
            return this.a;
        }
    }

    private SenseCamera() {
        this.a = new Object();
        this.d = 0;
        this.f = new Size(640, 480);
        this.g = 120.0f;
        this.h = 640;
        this.i = 480;
        this.j = new HashMap();
    }

    private Camera g() throws RuntimeException {
        int iK = k(this.d);
        if (iK == -1) {
            throw new IllegalStateException("Could not find requested camera.");
        }
        Camera cameraOpen = Camera.open(iK);
        if (cameraOpen == null) {
            throw new IllegalStateException("Unknown camera error");
        }
        a aVarO = o(cameraOpen, this.h, this.i);
        if (aVarO == null) {
            throw new IllegalStateException("Could not find suitable preview size.");
        }
        Size sizeC = aVarO.c();
        this.f = aVarO.d();
        int[] iArrN = n(cameraOpen, this.g);
        if (iArrN == null) {
            throw new IllegalStateException("Could not find suitable preview frames per second range.");
        }
        Camera.Parameters parameters = cameraOpen.getParameters();
        if (sizeC != null) {
            parameters.setPictureSize(sizeC.getWidth(), sizeC.getHeight());
        }
        parameters.setPreviewSize(this.f.getWidth(), this.f.getHeight());
        parameters.setPreviewFpsRange(iArrN[0], iArrN[1]);
        parameters.setPreviewFormat(17);
        p(cameraOpen, parameters, iK);
        if (parameters.getSupportedFocusModes().contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
        cameraOpen.setParameters(parameters);
        cameraOpen.setPreviewCallbackWithBuffer(new Camera.PreviewCallback() { // from class: en6
            @Override // android.hardware.Camera.PreviewCallback
            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                this.a.l(bArr, camera);
            }
        });
        cameraOpen.addCallbackBuffer(h(this.f));
        return cameraOpen;
    }

    private byte[] h(Size size) {
        byte[] bArr = new byte[((int) Math.ceil(((double) ((size.getHeight() * size.getWidth()) * ImageFormat.getBitsPerPixel(17))) / 8.0d)) + 1];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (!byteBufferWrap.hasArray() || byteBufferWrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera.");
        }
        this.j.put(bArr, byteBufferWrap);
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List<a> i(Camera camera) {
        Object[] objArr;
        Object[] objArr2;
        Camera.Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        ArrayList arrayList = new ArrayList();
        Iterator<Camera.Size> it2 = supportedPreviewSizes.iterator();
        while (true) {
            objArr2 = 0;
            objArr = 0;
            if (!it2.hasNext()) {
                break;
            }
            Camera.Size next = it2.next();
            float f = next.width / next.height;
            for (Camera.Size size : supportedPictureSizes) {
                if (Math.abs(f - (size.width / size.height)) < 0.01f) {
                    arrayList.add(new a(next, size));
                    break;
                }
            }
        }
        if (arrayList.isEmpty()) {
            Iterator<Camera.Size> it3 = supportedPreviewSizes.iterator();
            while (it3.hasNext()) {
                arrayList.add(new a(it3.next(), objArr == true ? 1 : 0));
            }
        }
        return arrayList;
    }

    private static int k(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(byte[] bArr, Camera camera) {
        ByteBuffer byteBuffer = this.j.get(bArr);
        if (byteBuffer != null) {
            camera.addCallbackBuffer(byteBuffer.array());
            Camera.PreviewCallback previewCallback = this.k;
            if (previewCallback != null) {
                previewCallback.onPreviewFrame(byteBuffer.array(), camera);
            }
        }
    }

    private int[] n(Camera camera, float f) {
        int i = (int) (f * 1000.0f);
        int[] iArr = null;
        int i2 = Integer.MAX_VALUE;
        for (int[] iArr2 : camera.getParameters().getSupportedPreviewFpsRange()) {
            int iAbs = Math.abs(i - iArr2[0]) + Math.abs(i - iArr2[1]);
            if (iAbs < i2) {
                iArr = iArr2;
                i2 = iAbs;
            }
        }
        return iArr;
    }

    private static a o(Camera camera, int i, int i2) {
        a aVar = null;
        int i3 = Integer.MAX_VALUE;
        for (a aVar2 : i(camera)) {
            Size sizeD = aVar2.d();
            int iAbs = Math.abs(sizeD.getWidth() - i) + Math.abs(sizeD.getHeight() - i2);
            if (iAbs < i3) {
                aVar = aVar2;
                i3 = iAbs;
            }
        }
        return aVar;
    }

    private void p(Camera camera, Camera.Parameters parameters, int i) {
        int i2;
        int i3;
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        int i4 = 0;
        int rotation = windowManager != null ? windowManager.getDefaultDisplay().getRotation() : 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i4 = 90;
            } else if (rotation == 2) {
                i4 = 180;
            } else if (rotation == 3) {
                i4 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        if (cameraInfo.facing == 1) {
            i2 = (cameraInfo.orientation + i4) % 360;
            i3 = (360 - i2) % 360;
        } else {
            i2 = ((cameraInfo.orientation - i4) + 360) % 360;
            i3 = i2;
        }
        this.e = i2 / 90;
        camera.setDisplayOrientation(i3);
        parameters.setRotation(i2);
    }

    public Size getPreviewSize() {
        return this.f;
    }

    public int getRotationDegrees() {
        return this.e * 90;
    }

    public int j() {
        return this.d;
    }

    public void m() {
        synchronized (this.a) {
            r();
        }
    }

    @SuppressLint({"MissingPermission"})
    public SenseCamera q(SurfaceHolder surfaceHolder) throws IOException, RuntimeException {
        synchronized (this.a) {
            if (this.c != null) {
                return this;
            }
            Camera cameraG = g();
            this.c = cameraG;
            cameraG.setPreviewDisplay(surfaceHolder);
            this.c.startPreview();
            return this;
        }
    }

    public void r() {
        synchronized (this.a) {
            this.j.clear();
            Camera camera = this.c;
            if (camera != null) {
                camera.stopPreview();
                this.c.setPreviewCallbackWithBuffer(null);
                try {
                    this.c.setPreviewDisplay(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.c.release();
                this.c = null;
            }
        }
    }

    public void setOnPreviewFrameCallback(Camera.PreviewCallback previewCallback) {
        this.k = previewCallback;
    }
}
