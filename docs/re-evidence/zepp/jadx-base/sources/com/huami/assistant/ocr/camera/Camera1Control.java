package com.huami.assistant.ocr.camera;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.huami.assistant.ocr.camera.Camera1Control;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class Camera1Control implements ICameraControl {
    private int e;
    private Context h;
    private Camera i;
    private Camera.Parameters j;
    private PermissionCallback k;
    private c m;
    private View n;
    private ICameraControl.OnDetectPictureCallback p;
    private Camera.Size r;
    private SurfaceTexture t;
    private final int a = 0;
    private final int b = 1;
    private int c = 0;
    private int d = 0;
    private AtomicBoolean f = new AtomicBoolean(false);
    private AtomicBoolean g = new AtomicBoolean(false);
    private Rect l = new Rect();
    private int o = 0;
    private int q = 0;
    private int s = 0;
    private byte[] u = null;
    private Camera.PreviewCallback v = new a();
    private Comparator<Camera.Size> w = new Comparator() { // from class: ei0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Camera1Control.y((Camera.Size) obj, (Camera.Size) obj2);
        }
    };
    private TextureView.SurfaceTextureListener x = new b();

    public class a implements Camera.PreviewCallback {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(byte[] bArr) throws Throwable {
            Camera1Control.this.D(bArr);
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(final byte[] data, Camera camera) {
            if (Camera1Control.this.g.get()) {
                return;
            }
            Camera1Control camera1Control = Camera1Control.this;
            int i = camera1Control.q;
            camera1Control.q = i + 1;
            if (i % 5 == 0 && data.length == ((double) (Camera1Control.this.j.getPreviewSize().width * Camera1Control.this.j.getPreviewSize().height)) * 1.5d) {
                camera.addCallbackBuffer(Camera1Control.this.u);
                CameraThreadPool.execute(new Runnable() { // from class: com.huami.assistant.ocr.camera.a
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.a.b(data);
                    }
                });
            }
        }
    }

    public class b implements TextureView.SurfaceTextureListener {
        public b() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
            Camera1Control.this.t = surface;
            Camera1Control.this.x();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
            Camera1Control camera1Control = Camera1Control.this;
            camera1Control.E(camera1Control.m.getWidth(), Camera1Control.this.m.getHeight());
            Camera1Control.this.J(false);
            Camera1Control.this.G();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surface) {
            Camera1Control.this.G();
        }
    }

    public class c extends FrameLayout {
        private TextureView a;
        private float b;

        public c(Context context) {
            super(context);
            this.b = 0.75f;
        }

        private void c(int w, int h) {
            if (w < h) {
                h = (int) (w * this.b);
            } else {
                w = (int) (h * this.b);
            }
            int width = (getWidth() - w) / 2;
            int height = (getHeight() - h) / 2;
            Camera1Control.this.l.left = width;
            Camera1Control.this.l.top = height;
            Camera1Control.this.l.right = width + w;
            Camera1Control.this.l.bottom = height + h;
        }

        public void d(float ratio) {
            this.b = ratio;
            requestLayout();
            c(getWidth(), getHeight());
        }

        public void e(TextureView textureView) {
            this.a = textureView;
            removeAllViews();
            addView(textureView);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean changed, int left, int top, int right, int bottom) {
            super.onLayout(changed, left, top, right, bottom);
            this.a.layout(Camera1Control.this.l.left, Camera1Control.this.l.top, Camera1Control.this.l.right, Camera1Control.this.l.bottom);
        }

        @Override // android.view.View
        public void onSizeChanged(int w, int h, int oldw, int oldh) {
            super.onSizeChanged(w, h, oldw, oldh);
            c(w, h);
        }
    }

    public Camera1Control(Context context) {
        this.h = context;
        this.m = new c(context);
        F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        synchronized (this) {
            if (this.i != null && !this.f.get()) {
                try {
                    this.i.autoFocus(new Camera.AutoFocusCallback() { // from class: ai0
                        @Override // android.hardware.Camera.AutoFocusCallback
                        public final void onAutoFocus(boolean z, Camera camera) {
                            Camera1Control.z(z, camera);
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(ICameraControl.OnTakePictureCallback onTakePictureCallback, byte[] bArr, Camera camera) {
        J(false);
        this.f.set(false);
        if (onTakePictureCallback != null) {
            onTakePictureCallback.onPictureTaken(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(final ICameraControl.OnTakePictureCallback onTakePictureCallback) {
        this.i.takePicture(null, null, new Camera.PictureCallback() { // from class: bi0
            @Override // android.hardware.Camera.PictureCallback
            public final void onPictureTaken(byte[] bArr, Camera camera) {
                this.a.B(onTakePictureCallback, bArr, camera);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(byte[] data) throws Throwable {
        if (this.i == null || data == null || this.r == null) {
            return;
        }
        Camera.Size size = this.r;
        YuvImage yuvImage = new YuvImage(data, 17, size.width, size.height, null);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(data.length);
                try {
                    Camera.Size size2 = this.r;
                    yuvImage.compressToJpeg(new Rect(0, 0, size2.width, size2.height), 80, byteArrayOutputStream2);
                    if (this.p.onDetect(byteArrayOutputStream2.toByteArray(), u()) == 0) {
                        t();
                    }
                    byteArrayOutputStream2.close();
                } catch (OutOfMemoryError unused) {
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream == null) {
                    } else {
                        byteArrayOutputStream.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        } catch (OutOfMemoryError unused2) {
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(int width, int height) {
        Camera camera;
        if (this.j == null || (camera = this.i) == null || width <= 0) {
            return;
        }
        Camera.Size sizeV = v(camera.getParameters().getSupportedPreviewSizes());
        this.r = sizeV;
        this.j.setPreviewSize(sizeV.width, sizeV.height);
        c cVar = this.m;
        Camera.Size size = this.r;
        cVar.d((size.width * 1.0f) / size.height);
        this.i.setDisplayOrientation(w());
        K();
        try {
            this.i.setParameters(this.j);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    private void F() {
        H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (this.u == null) {
            this.u = new byte[((this.n.getWidth() * this.n.getHeight()) * ImageFormat.getBitsPerPixel(17)) / 8];
        }
        Camera camera = this.i;
        if (camera == null || this.s != 1) {
            return;
        }
        camera.addCallbackBuffer(this.u);
        this.i.setPreviewCallback(this.v);
    }

    private void H() {
        TextureView textureView = new TextureView(this.h);
        this.m.a = textureView;
        this.m.e(textureView);
        this.n = this.m;
        textureView.setSurfaceTextureListener(this.x);
    }

    private void I() {
        CameraThreadPool.createAutoFocusTimerTask(new Runnable() { // from class: ci0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.A();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(boolean checkPermission) {
        PermissionCallback permissionCallback;
        if (ContextCompat.checkSelfPermission(this.h, "android.permission.CAMERA") != 0) {
            if (!checkPermission || (permissionCallback = this.k) == null) {
                return;
            }
            permissionCallback.onRequestPermission();
            return;
        }
        Camera camera = this.i;
        if (camera == null) {
            x();
        } else {
            camera.startPreview();
            I();
        }
    }

    private void K() {
        Camera camera = this.i;
        if (camera != null) {
            camera.stopPreview();
        }
    }

    private void L(int flashMode) {
        if (flashMode == 0) {
            this.j.setFlashMode("off");
        } else if (flashMode == 1) {
            this.j.setFlashMode("torch");
        } else if (flashMode != 2) {
            this.j.setFlashMode("auto");
        } else {
            this.j.setFlashMode("auto");
        }
        this.i.setParameters(this.j);
    }

    private void s() {
        this.i.cancelAutoFocus();
        CameraThreadPool.cancelAutoFocusTimer();
    }

    private void t() {
        Camera camera = this.i;
        if (camera == null || this.s != 1) {
            return;
        }
        camera.setPreviewCallback(null);
        K();
    }

    private int u() {
        return this.o;
    }

    private Camera.Size v(List<Camera.Size> sizes) {
        int i;
        int width = this.m.a.getWidth();
        int height = this.m.a.getHeight();
        Camera.Size size = sizes.get(0);
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size2 : sizes) {
            int i2 = size2.width;
            if (i2 < width || (i = size2.height) < height || i2 * height != i * width) {
                int i3 = size2.height;
                if (i3 >= width && i2 >= height && i2 * width == i3 * height) {
                    arrayList.add(size2);
                }
            } else {
                arrayList.add(size2);
            }
        }
        if (!arrayList.isEmpty()) {
            return (Camera.Size) Collections.min(arrayList, this.w);
        }
        for (Camera.Size size3 : sizes) {
            if (size3.width > width && size3.height > height) {
                return size3;
            }
        }
        return size;
    }

    private int w() {
        int i = this.c;
        if (i != 90) {
            return i != 270 ? 90 : 180;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        try {
            if (this.i == null) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
                    Camera.getCameraInfo(i, cameraInfo);
                    if (cameraInfo.facing == 0) {
                        this.d = i;
                    }
                }
                try {
                    this.i = Camera.open(this.d);
                } catch (Throwable th) {
                    th.printStackTrace();
                    J(true);
                    return;
                }
            }
            if (this.j == null) {
                Camera.Parameters parameters = this.i.getParameters();
                this.j = parameters;
                parameters.setPreviewFormat(17);
            }
            E(this.m.getWidth(), this.m.getHeight());
            this.i.setPreviewTexture(this.t);
            G();
            J(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int y(Camera.Size size, Camera.Size size2) {
        return Long.signum((((long) size.width) * ((long) size.height)) - (((long) size2.width) * ((long) size2.height)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(boolean z, Camera camera) {
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public AtomicBoolean getAbortingScan() {
        return this.g;
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public View getDisplayView() {
        return this.n;
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public int getFlashMode() {
        return this.e;
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public Rect getPreviewFrame() {
        return this.l;
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void pause() {
        if (this.i != null) {
            K();
        }
        setFlashMode(0);
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void refreshPermission() {
        J(true);
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void resume() {
        this.f.set(false);
        if (this.i == null) {
            F();
            return;
        }
        this.m.a.setSurfaceTextureListener(this.x);
        if (this.m.a.isAvailable()) {
            J(false);
        }
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void setDetectCallback(ICameraControl.OnDetectPictureCallback callback) {
        this.s = 1;
        this.p = callback;
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void setDisplayOrientation(@CameraView.Orientation int displayOrientation) {
        this.c = displayOrientation;
        if (displayOrientation == 0) {
            this.o = 90;
        } else if (displayOrientation != 270) {
            this.o = 0;
        } else {
            this.o = 180;
        }
        this.m.requestLayout();
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void setFlashMode(@ICameraControl.FlashMode int flashMode) {
        if (this.e == flashMode) {
            return;
        }
        this.e = flashMode;
        L(flashMode);
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void setPermissionCallback(PermissionCallback callback) {
        this.k = callback;
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void start() {
        J(false);
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void stop() {
        Camera camera = this.i;
        if (camera != null) {
            camera.setPreviewCallback(null);
            K();
            Camera camera2 = this.i;
            this.i = null;
            camera2.release();
            this.i = null;
            this.u = null;
        }
    }

    @Override // com.huami.assistant.ocr.camera.ICameraControl
    public void takePicture(final ICameraControl.OnTakePictureCallback onTakePictureCallback) {
        if (this.f.get()) {
            return;
        }
        int i = this.c;
        if (i == 0) {
            this.j.setRotation(90);
        } else if (i != 270) {
            this.j.setRotation(0);
        } else {
            this.j.setRotation(180);
        }
        try {
            Camera.Size sizeV = v(this.i.getParameters().getSupportedPictureSizes());
            this.j.setPictureSize(sizeV.width, sizeV.height);
            this.i.setParameters(this.j);
            this.f.set(true);
            s();
            CameraThreadPool.execute(new Runnable() { // from class: di0
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.C(onTakePictureCallback);
                }
            });
        } catch (RuntimeException e) {
            e.printStackTrace();
            J(false);
            this.f.set(false);
        }
    }
}
