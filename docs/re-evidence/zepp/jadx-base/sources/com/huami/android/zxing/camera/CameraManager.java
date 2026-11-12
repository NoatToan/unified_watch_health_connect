package com.huami.android.zxing.camera;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.SurfaceHolder;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.huami.android.zxing.camera.open.OpenCameraInterface;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class CameraManager {
    private static final String m = "CameraManager";
    private static final int n = 240;
    private static final int o = 240;
    private static final int p = 1200;
    private static final int q = 675;
    private final Context a;
    private final b b;
    private Camera c;
    private a d;
    private Rect e;
    private Rect f;
    private boolean g;
    private boolean h;
    private int i = -1;
    private int j;
    private int k;
    private final c l;

    public CameraManager(Context context) {
        this.a = context;
        b bVar = new b(context);
        this.b = bVar;
        this.l = new c(bVar);
    }

    private static int a(int i, int i2, int i3) {
        int i4 = (i * 5) / 8;
        if (i4 < i2) {
            return i2;
        }
        return i4 > i3 ? i3 : i4;
    }

    public PlanarYUVLuminanceSource buildLuminanceSource(byte[] bArr, int i, int i2) {
        Rect framingRectInPreview = getFramingRectInPreview();
        if (framingRectInPreview == null) {
            return null;
        }
        return new PlanarYUVLuminanceSource(bArr, i, i2, framingRectInPreview.left, framingRectInPreview.top, framingRectInPreview.width(), framingRectInPreview.height(), false);
    }

    public synchronized void closeDriver() {
        Camera camera = this.c;
        if (camera != null) {
            camera.release();
            this.c = null;
            this.e = null;
            this.f = null;
        }
    }

    public synchronized Rect getFramingRect() {
        if (this.e == null) {
            if (this.c == null) {
                return null;
            }
            Point pointC = this.b.c();
            if (pointC == null) {
                return null;
            }
            int iApplyDimension = (int) TypedValue.applyDimension(1, 176.0f, this.a.getResources().getDisplayMetrics());
            int i = (pointC.x - iApplyDimension) / 2;
            int iApplyDimension2 = (int) TypedValue.applyDimension(1, 212.0f, this.a.getResources().getDisplayMetrics());
            this.e = new Rect(i, iApplyDimension2, i + iApplyDimension, iApplyDimension + iApplyDimension2);
            Log.d(m, "Calculated framing rect: " + this.e);
        }
        return this.e;
    }

    public synchronized Rect getFramingRectInPreview() {
        if (this.f == null) {
            Rect framingRect = getFramingRect();
            if (framingRect == null) {
                return null;
            }
            Rect rect = new Rect(framingRect);
            Point pointB = this.b.b();
            Point pointC = this.b.c();
            if (pointB != null && pointC != null) {
                int i = rect.left;
                int i2 = pointB.y;
                int i3 = pointC.x;
                rect.left = (i * i2) / i3;
                rect.right = (rect.right * i2) / i3;
                int i4 = rect.top;
                int i5 = pointB.x;
                int i6 = pointC.y;
                rect.top = (i4 * i5) / i6;
                rect.bottom = (rect.bottom * i5) / i6;
                this.f = rect;
            }
            return null;
        }
        return this.f;
    }

    public synchronized boolean isOpen() {
        return this.c != null;
    }

    public synchronized void openDriver(SurfaceHolder surfaceHolder) throws IOException {
        int i;
        Camera cameraOpen = this.c;
        if (cameraOpen == null) {
            cameraOpen = OpenCameraInterface.open(this.i);
            if (cameraOpen == null) {
                throw new IOException();
            }
            this.c = cameraOpen;
        }
        cameraOpen.setPreviewDisplay(surfaceHolder);
        if (!this.g) {
            this.g = true;
            this.b.e(cameraOpen);
            int i2 = this.j;
            if (i2 > 0 && (i = this.k) > 0) {
                setManualFramingRect(i2, i);
                this.j = 0;
                this.k = 0;
            }
        }
        String strFlatten = cameraOpen.getParameters().flatten();
        try {
            this.b.g(cameraOpen, false);
        } catch (RuntimeException unused) {
            String str = m;
            Log.w(str, "Camera rejected parameters. Setting only minimal safe-mode parameters");
            Log.i(str, "Resetting to saved camera params: " + strFlatten);
            Camera.Parameters parameters = cameraOpen.getParameters();
            parameters.unflatten(strFlatten);
            try {
                cameraOpen.setParameters(parameters);
                this.b.g(cameraOpen, true);
            } catch (RuntimeException unused2) {
                Log.w(m, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
    }

    public synchronized void requestPreviewFrame(Handler handler, int i) {
        Camera camera = this.c;
        if (camera != null && this.h) {
            this.l.a(handler, i);
            camera.setOneShotPreviewCallback(this.l);
        }
    }

    public void setDesiredZoom(int i) {
        this.b.h(i);
    }

    public synchronized void setManualCameraId(int i) {
        this.i = i;
    }

    public synchronized void setManualFramingRect(int i, int i2) {
        if (this.g) {
            Point pointC = this.b.c();
            int i3 = pointC.x;
            if (i > i3) {
                i = i3;
            }
            int i4 = pointC.y;
            if (i2 > i4) {
                i2 = i4;
            }
            int i5 = (i3 - i) / 2;
            int i6 = (i4 - i2) / 2;
            this.e = new Rect(i5, i6, i + i5, i2 + i6);
            Log.d(m, "Calculated manual framing rect: " + this.e);
            this.f = null;
        } else {
            this.j = i;
            this.k = i2;
        }
    }

    public synchronized void setTorch(boolean z) {
        if (z != this.b.d(this.c) && this.c != null) {
            a aVar = this.d;
            if (aVar != null) {
                aVar.d();
            }
            this.b.i(this.c, z);
            a aVar2 = this.d;
            if (aVar2 != null) {
                aVar2.c();
            }
        }
    }

    public synchronized void startPreview() {
        Camera camera = this.c;
        if (camera != null && !this.h) {
            camera.startPreview();
            this.h = true;
            this.d = new a(this.c);
        }
    }

    public synchronized void stopPreview() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.d();
            this.d = null;
        }
        Camera camera = this.c;
        if (camera != null && this.h) {
            camera.stopPreview();
            this.l.a(null, 0);
            this.h = false;
        }
    }
}
