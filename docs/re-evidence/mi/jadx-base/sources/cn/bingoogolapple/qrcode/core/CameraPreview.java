package cn.bingoogolapple.qrcode.core;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import defpackage.bg3;
import defpackage.ou1;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class CameraPreview extends SurfaceView implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Camera f5492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5493b;
    public boolean c;
    public boolean d;
    public float e;
    public bg3 f;
    public b g;

    public class a implements Camera.AutoFocusCallback {
        public a() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            if (z) {
                ou1.e("对焦测光成功");
            } else {
                ou1.h("对焦测光失败");
            }
            CameraPreview.this.g();
        }
    }

    public interface b {
        void a();
    }

    public CameraPreview(Context context) {
        super(context);
        this.f5493b = true;
        this.c = false;
        this.d = false;
        this.e = 1.0f;
    }

    public static void c(boolean z, Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        if (!parameters.isZoomSupported()) {
            ou1.e("不支持缩放");
            return;
        }
        int zoom = parameters.getZoom();
        if (z && zoom < parameters.getMaxZoom()) {
            ou1.e("放大");
            zoom++;
        } else if (z || zoom <= 0) {
            ou1.e("既不放大也不缩小");
        } else {
            ou1.e("缩小");
            zoom--;
        }
        parameters.setZoom(zoom);
        camera.setParameters(parameters);
    }

    public final void b(float f, float f2, int i, int i2) {
        boolean z;
        try {
            Camera.Parameters parameters = this.f5492a.getParameters();
            Camera.Size previewSize = parameters.getPreviewSize();
            if (parameters.getMaxNumFocusAreas() > 0) {
                ou1.e("支持设置对焦区域");
                Rect rectC = ou1.c(1.0f, f, f2, i, i2, previewSize.width, previewSize.height);
                ou1.o("对焦区域", rectC);
                parameters.setFocusAreas(Collections.singletonList(new Camera.Area(rectC, 1000)));
                parameters.setFocusMode("macro");
                z = true;
            } else {
                ou1.e("不支持设置对焦区域");
                z = false;
            }
            if (parameters.getMaxNumMeteringAreas() > 0) {
                ou1.e("支持设置测光区域");
                Rect rectC2 = ou1.c(1.5f, f, f2, i, i2, previewSize.width, previewSize.height);
                ou1.o("测光区域", rectC2);
                parameters.setMeteringAreas(Collections.singletonList(new Camera.Area(rectC2, 1000)));
            } else {
                ou1.e("不支持设置测光区域");
                if (!z) {
                    this.d = false;
                    return;
                }
            }
            this.f5492a.cancelAutoFocus();
            this.f5492a.setParameters(parameters);
            this.f5492a.autoFocus(new a());
        } catch (Exception e) {
            e.printStackTrace();
            ou1.h("对焦测光失败：" + e.getMessage());
            g();
        }
    }

    public boolean d() {
        return this.f5492a != null && this.f5493b && this.c;
    }

    public void e(Rect rect) {
        if (this.f5492a == null || rect == null || rect.left <= 0 || rect.top <= 0) {
            return;
        }
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        int iWidth = rect.width() / 2;
        int iHeight = rect.height() / 2;
        ou1.o("转换前", rect);
        if (ou1.m(getContext())) {
            iCenterY = iCenterX;
            iCenterX = iCenterY;
            iHeight = iWidth;
            iWidth = iHeight;
        }
        Rect rect2 = new Rect(iCenterX - iWidth, iCenterY - iHeight, iCenterX + iWidth, iCenterY + iHeight);
        ou1.o("转换后", rect2);
        ou1.e("扫码框发生变化触发对焦测光");
        b(rect2.centerX(), rect2.centerY(), rect2.width(), rect2.height());
    }

    public final void f() {
        if (this.f5492a != null) {
            try {
                this.f5493b = true;
                SurfaceHolder holder = getHolder();
                holder.setKeepScreenOn(true);
                this.f5492a.setPreviewDisplay(holder);
                this.f.g(this.f5492a);
                this.f5492a.startPreview();
                b bVar = this.g;
                if (bVar != null) {
                    bVar.a();
                }
                g();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void g() {
        this.d = false;
        Camera camera = this.f5492a;
        if (camera == null) {
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFocusMode("continuous-picture");
            this.f5492a.setParameters(parameters);
            this.f5492a.cancelAutoFocus();
        } catch (Exception unused) {
            ou1.h("连续对焦失败");
        }
    }

    public void h() {
        Camera camera = this.f5492a;
        if (camera != null) {
            try {
                this.f5493b = false;
                camera.cancelAutoFocus();
                this.f5492a.setOneShotPreviewCallback(null);
                this.f5492a.stopPreview();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        bg3 bg3Var = this.f;
        if (bg3Var != null && bg3Var.b() != null) {
            Point pointB = this.f.b();
            float f = defaultSize;
            float f2 = defaultSize2;
            float f3 = (f * 1.0f) / f2;
            float f4 = pointB.x;
            float f5 = pointB.y;
            float f6 = (f4 * 1.0f) / f5;
            if (f3 < f6) {
                defaultSize = (int) ((f2 / ((f5 * 1.0f) / f4)) + 0.5f);
            } else {
                defaultSize2 = (int) ((f / f6) + 0.5f);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824), View.MeasureSpec.makeMeasureSpec(defaultSize2, 1073741824));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!d()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getPointerCount() == 1 && (motionEvent.getAction() & 255) == 1) {
            if (this.d) {
                return true;
            }
            this.d = true;
            ou1.e("手指触摸触发对焦测光");
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (ou1.m(getContext())) {
                y = x;
                x = y;
            }
            int iG = ou1.g(getContext(), 120.0f);
            b(x, y, iG, iG);
        }
        if (motionEvent.getPointerCount() == 2) {
            int action = motionEvent.getAction() & 255;
            if (action == 2) {
                float fB = ou1.b(motionEvent);
                float f = this.e;
                if (fB > f) {
                    c(true, this.f5492a);
                } else if (fB < f) {
                    c(false, this.f5492a);
                }
            } else if (action == 5) {
                this.e = ou1.b(motionEvent);
            }
        }
        return true;
    }

    public void setCamera(Camera camera) {
        this.f5492a = camera;
        if (camera != null) {
            bg3 bg3Var = new bg3(getContext());
            this.f = bg3Var;
            bg3Var.e(this.f5492a);
            getHolder().addCallback(this);
            if (this.f5493b) {
                requestLayout();
            } else {
                f();
            }
        }
    }

    public void setDelegate(b bVar) {
        this.g = bVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder.getSurface() == null) {
            return;
        }
        h();
        f();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.c = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.c = false;
        h();
    }
}
