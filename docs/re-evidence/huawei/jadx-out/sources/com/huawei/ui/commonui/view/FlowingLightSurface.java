package com.huawei.ui.commonui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Process;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.ui.commonui.R;
import defpackage.qre;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public class FlowingLightSurface extends SurfaceView implements SurfaceHolder.Callback2, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f23974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Choreographer f23975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23976c;
    private boolean d;
    private float e;
    private LinearGradient f;
    private final Paint g;
    private float[] h;
    private final Matrix i;
    private final RectF j;
    private d k;
    private float l;
    private float m;
    private float n;
    private float o;

    public FlowingLightSurface(Context context) {
        super(context);
        this.f23975b = Choreographer.getInstance();
        this.g = new Paint(1);
        this.i = new Matrix();
        this.j = new RectF();
        a(context, (AttributeSet) null);
    }

    public FlowingLightSurface(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23975b = Choreographer.getInstance();
        this.g = new Paint(1);
        this.i = new Matrix();
        this.j = new RectF();
        a(context, attributeSet);
    }

    public FlowingLightSurface(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23975b = Choreographer.getInstance();
        this.g = new Paint(1);
        this.i = new Matrix();
        this.j = new RectF();
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        b(context, attributeSet);
        e();
        setZOrderOnTop(true);
        SurfaceHolder holder = getHolder();
        if (holder == null) {
            return;
        }
        holder.setFormat(-2);
        holder.addCallback(this);
    }

    private void b(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlowingLightSurface);
        this.f23976c = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FlowingLightSurface_flowingLightSurfaceIsNeedReset, false);
        this.o = typedArrayObtainStyledAttributes.getFloat(R.styleable.FlowingLightSurface_flowingLightSurfaceRotateDegrees, 0.0f);
        this.m = typedArrayObtainStyledAttributes.getFloat(R.styleable.FlowingLightSurface_flowingLightSurfaceRotateDegreesOffset, 0.0f);
        this.l = typedArrayObtainStyledAttributes.getDimension(R.styleable.FlowingLightSurface_flowingLightSurfaceWidth, qre.a(R.dimen.health_common_1dp));
        this.n = typedArrayObtainStyledAttributes.getDimension(R.styleable.FlowingLightSurface_flowingLightSurfaceRoundCornerRadius, qre.a(R.dimen.health_common_16dp));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.FlowingLightSurface_flowingLightSurfaceColorArray, 0);
        if (resourceId != 0) {
            this.f23974a = qre.h(resourceId);
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.FlowingLightSurface_flowingLightSurfacePositionArray, 0);
        if (resourceId2 != 0) {
            String[] strArrG = qre.g(resourceId2);
            int length = strArrG.length;
            this.h = new float[length];
            for (int i = 0; i < length; i++) {
                this.h[i] = Float.parseFloat(strArrG[i]);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void e() {
        this.g.setStrokeWidth(this.l);
        this.g.setStyle(Paint.Style.STROKE);
        this.g.setStrokeCap(Paint.Cap.ROUND);
        this.g.setStrokeJoin(Paint.Join.ROUND);
    }

    private void a() {
        a(getWidth(), getHeight());
        postInvalidate();
    }

    private void a(int i, int i2) {
        int length;
        float f = this.l / 2.0f;
        this.j.set(f, f, i - f, i2 - f);
        this.e = this.n + f;
        int[] iArr = this.f23974a;
        if (iArr == null || (length = iArr.length) == 0) {
            return;
        }
        float[] fArr = this.h;
        if (fArr == null || fArr.length != length) {
            fArr = null;
        }
        LinearGradient linearGradient = new LinearGradient(this.j.left, this.j.top, this.j.right, this.j.bottom, this.f23974a, fArr, Shader.TileMode.CLAMP);
        this.f = linearGradient;
        this.g.setShader(linearGradient);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        LogUtil.b("FlowingLightSurface", "surfaceCreated mIsRunning ", Boolean.valueOf(this.d), " holder ", surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        a(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        boolean z = this.d;
        LogUtil.b("FlowingLightSurface", "surfaceDestroyed mIsRunning ", Boolean.valueOf(z), " mRenderThread ", this.k, " holder ", surfaceHolder);
        c();
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        LogUtil.b("FlowingLightSurface", "surfaceRedrawNeeded mIsRunning ", Boolean.valueOf(this.d), " holder ", surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        super.surfaceRedrawNeededAsync(surfaceHolder, runnable);
        LogUtil.b("FlowingLightSurface", "surfaceRedrawNeededAsync mIsRunning ", Boolean.valueOf(this.d), " holder ", surfaceHolder, " drawingFinished ", runnable);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (!this.d) {
            ReleaseLogUtil.c("R_FlowingLightSurface", "doFrame mIsRunning is false frameTimeNanos ", Long.valueOf(j));
        } else {
            this.f23975b.postFrameCallback(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Canvas canvas) {
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        if (this.f != null) {
            if (this.f23976c) {
                this.i.reset();
            }
            float f = (this.o + this.m) % 360.0f;
            this.o = f;
            this.i.setRotate(f, this.j.centerX(), this.j.centerY());
            this.f.setLocalMatrix(this.i);
        }
        RectF rectF = this.j;
        float f2 = this.e;
        canvas.drawRoundRect(rectF, f2, f2, this.g);
    }

    public void setColorArray(int[] iArr) {
        this.f23974a = iArr;
        a();
    }

    public void setPositionArray(float[] fArr) {
        if (Arrays.equals(this.h, fArr)) {
            return;
        }
        this.h = fArr;
        a();
    }

    public void setBorderWidth(int i) {
        float fA = qre.a(i);
        if (Float.compare(this.l, fA) == 0) {
            return;
        }
        this.l = fA;
        this.g.setStrokeWidth(fA);
        a();
    }

    public void setRoundCornerRadius(int i) {
        float fA = qre.a(i);
        if (Float.compare(this.n, fA) == 0) {
            return;
        }
        this.n = fA;
        a();
    }

    public void setRotateDegrees(float f) {
        if (Float.compare(this.o, f) == 0) {
            return;
        }
        this.o = f;
        a();
    }

    public void setRotateDegreesOffset(float f) {
        if (Float.compare(this.m, f) == 0) {
            return;
        }
        this.m = f;
        a();
    }

    public void d() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f23975b.postFrameCallback(this);
        d dVar = new d(this, getHolder());
        this.k = dVar;
        dVar.start();
    }

    public void c() {
        this.d = false;
        this.f23975b.removeFrameCallback(this);
        d dVar = this.k;
        if (dVar == null) {
            return;
        }
        dVar.c();
    }

    static class d extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<FlowingLightSurface> f23977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SurfaceHolder f23978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f23979c = true;

        d(FlowingLightSurface flowingLightSurface, SurfaceHolder surfaceHolder) {
            Process.setThreadPriority(-4);
            this.f23977a = new WeakReference<>(flowingLightSurface);
            this.f23978b = surfaceHolder;
        }

        void c() {
            boolean z = this.f23979c;
            ReleaseLogUtil.c("R_FlowingLightSurface", "safeStop mIsSynchronizedHolder ", Boolean.valueOf(z), " mHolder ", this.f23978b);
            SurfaceHolder surfaceHolder = this.f23978b;
            if (surfaceHolder != null) {
                synchronized (surfaceHolder) {
                    this.f23979c = false;
                }
            }
            super.interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            FlowingLightSurface flowingLightSurface = this.f23977a.get();
            if (flowingLightSurface != null) {
                while (flowingLightSurface.d) {
                    SurfaceHolder surfaceHolder = this.f23978b;
                    if (surfaceHolder == null) {
                        ReleaseLogUtil.d("R_FlowingLightSurface", "run mHolder is null");
                    } else {
                        synchronized (surfaceHolder) {
                            if (!this.f23979c) {
                                ReleaseLogUtil.d("R_FlowingLightSurface", "run mIsSynchronizedHolder is true");
                                return;
                            }
                            a();
                        }
                    }
                }
                return;
            }
            ReleaseLogUtil.d("R_FlowingLightSurface", "run view is null");
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void a() throws Throwable {
            Canvas canvasLockCanvas;
            Object obj = "renderFrame exception ";
            SurfaceHolder surfaceHolder = this.f23978b;
            if (surfaceHolder == null) {
                ReleaseLogUtil.d("R_FlowingLightSurface", "renderFrame mHolder is null");
                return;
            }
            try {
                canvasLockCanvas = surfaceHolder.lockCanvas();
                if (canvasLockCanvas == 0) {
                    if (canvasLockCanvas != 0) {
                        try {
                            this.f23978b.unlockCanvasAndPost(canvasLockCanvas);
                            return;
                        } catch (IllegalStateException e) {
                            ReleaseLogUtil.b("FlowingLightSurface", "renderFrame exception ", ExceptionUtils.c(e));
                            return;
                        }
                    }
                    return;
                }
                try {
                    Surface surface = this.f23978b.getSurface();
                    if (surface == null) {
                        ReleaseLogUtil.d("R_FlowingLightSurface", "renderFrame surface is null");
                        if (canvasLockCanvas != 0) {
                            try {
                                obj = obj;
                                canvasLockCanvas = canvasLockCanvas;
                                this.f23978b.unlockCanvasAndPost(canvasLockCanvas);
                                return;
                            } catch (IllegalStateException e2) {
                                String strC = ExceptionUtils.c(e2);
                                Object[] objArr = {"renderFrame exception ", strC};
                                ReleaseLogUtil.b("FlowingLightSurface", objArr);
                                obj = objArr;
                                canvasLockCanvas = strC;
                            }
                        }
                    } else if (surface.isValid()) {
                        WeakReference<FlowingLightSurface> weakReference = this.f23977a;
                        if (weakReference == null) {
                            ReleaseLogUtil.d("FlowingLightSurface", "renderFrame mWeakReference is null");
                            if (canvasLockCanvas != 0) {
                                try {
                                    obj = obj;
                                    canvasLockCanvas = canvasLockCanvas;
                                    this.f23978b.unlockCanvasAndPost(canvasLockCanvas);
                                    return;
                                } catch (IllegalStateException e3) {
                                    String strC2 = ExceptionUtils.c(e3);
                                    Object[] objArr2 = {"renderFrame exception ", strC2};
                                    ReleaseLogUtil.b("FlowingLightSurface", objArr2);
                                    obj = objArr2;
                                    canvasLockCanvas = strC2;
                                }
                            }
                        } else {
                            FlowingLightSurface flowingLightSurface = weakReference.get();
                            if (flowingLightSurface == null) {
                                ReleaseLogUtil.d("FlowingLightSurface", "renderFrame view is null");
                                if (canvasLockCanvas != 0) {
                                    try {
                                        obj = obj;
                                        canvasLockCanvas = canvasLockCanvas;
                                        this.f23978b.unlockCanvasAndPost(canvasLockCanvas);
                                        return;
                                    } catch (IllegalStateException e4) {
                                        String strC3 = ExceptionUtils.c(e4);
                                        Object[] objArr3 = {"renderFrame exception ", strC3};
                                        ReleaseLogUtil.b("FlowingLightSurface", objArr3);
                                        obj = objArr3;
                                        canvasLockCanvas = strC3;
                                    }
                                }
                            } else {
                                flowingLightSurface.e(canvasLockCanvas);
                                if (canvasLockCanvas != 0) {
                                    try {
                                        obj = obj;
                                        canvasLockCanvas = canvasLockCanvas;
                                        this.f23978b.unlockCanvasAndPost(canvasLockCanvas);
                                        return;
                                    } catch (IllegalStateException e5) {
                                        String strC4 = ExceptionUtils.c(e5);
                                        Object[] objArr4 = {"renderFrame exception ", strC4};
                                        ReleaseLogUtil.b("FlowingLightSurface", objArr4);
                                        obj = objArr4;
                                        canvasLockCanvas = strC4;
                                    }
                                }
                            }
                        }
                    } else {
                        ReleaseLogUtil.d("R_FlowingLightSurface", "renderFrame surface is not valid");
                        if (canvasLockCanvas != 0) {
                            try {
                                obj = obj;
                                canvasLockCanvas = canvasLockCanvas;
                                this.f23978b.unlockCanvasAndPost(canvasLockCanvas);
                                return;
                            } catch (IllegalStateException e6) {
                                String strC5 = ExceptionUtils.c(e6);
                                Object[] objArr5 = {"renderFrame exception ", strC5};
                                ReleaseLogUtil.b("FlowingLightSurface", objArr5);
                                obj = objArr5;
                                canvasLockCanvas = strC5;
                            }
                        }
                    }
                    obj = obj;
                    canvasLockCanvas = canvasLockCanvas;
                    obj = obj;
                    canvasLockCanvas = canvasLockCanvas;
                    obj = obj;
                    canvasLockCanvas = canvasLockCanvas;
                    obj = obj;
                    canvasLockCanvas = canvasLockCanvas;
                    obj = obj;
                    canvasLockCanvas = canvasLockCanvas;
                } catch (Throwable th) {
                    th = th;
                    if (canvasLockCanvas != 0) {
                        try {
                            this.f23978b.unlockCanvasAndPost(canvasLockCanvas);
                        } catch (IllegalStateException e7) {
                            ReleaseLogUtil.b("FlowingLightSurface", obj, ExceptionUtils.c(e7));
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                canvasLockCanvas = 0;
            }
        }
    }
}
