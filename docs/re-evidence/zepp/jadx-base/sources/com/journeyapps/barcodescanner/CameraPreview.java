package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.zxing.client.android.R;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import com.journeyapps.barcodescanner.camera.CameraSurface;
import com.journeyapps.barcodescanner.camera.CenterCropStrategy;
import com.journeyapps.barcodescanner.camera.DisplayConfiguration;
import com.journeyapps.barcodescanner.camera.FitCenterStrategy;
import com.journeyapps.barcodescanner.camera.FitXYStrategy;
import com.journeyapps.barcodescanner.camera.PreviewScalingStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class CameraPreview extends ViewGroup {
    private static final String A = CameraPreview.class.getSimpleName();
    private static final int B = 250;
    private CameraInstance a;
    private WindowManager b;
    private Handler c;
    private boolean d;
    private SurfaceView e;
    private TextureView f;
    private boolean g;
    private RotationListener h;
    private int i;
    private List<StateListener> j;
    private DisplayConfiguration k;
    private CameraSettings l;
    private Size m;
    private Size n;
    private Rect o;
    private Size p;
    private Rect q;
    private Rect r;
    private Size s;
    private double t;
    private PreviewScalingStrategy u;
    private boolean v;
    private final SurfaceHolder.Callback w;
    private final Handler.Callback x;
    private RotationCallback y;
    private final StateListener z;

    public interface StateListener {
        void cameraClosed();

        void cameraError(Exception exc);

        void previewSized();

        void previewStarted();

        void previewStopped();
    }

    public class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            CameraPreview.this.p = new Size(i, i2);
            CameraPreview.this.q();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public class b implements SurfaceHolder.Callback {
        public b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (surfaceHolder == null) {
                Log.e(CameraPreview.A, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            CameraPreview.this.p = new Size(i2, i3);
            CameraPreview.this.q();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            CameraPreview.this.p = null;
        }
    }

    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == R.id.zxing_prewiew_size_ready) {
                CameraPreview.this.m((Size) message.obj);
                return true;
            }
            if (i != R.id.zxing_camera_error) {
                if (i != R.id.zxing_camera_closed) {
                    return false;
                }
                CameraPreview.this.z.cameraClosed();
                return false;
            }
            Exception exc = (Exception) message.obj;
            if (!CameraPreview.this.isActive()) {
                return false;
            }
            CameraPreview.this.pause();
            CameraPreview.this.z.cameraError(exc);
            return false;
        }
    }

    public class d implements RotationCallback {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CameraPreview.this.n();
            }
        }

        public d() {
        }

        @Override // com.journeyapps.barcodescanner.RotationCallback
        public void onRotationChanged(int i) {
            CameraPreview.this.c.postDelayed(new a(), 250L);
        }
    }

    public class e implements StateListener {
        public e() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
        public void cameraClosed() {
            Iterator it2 = CameraPreview.this.j.iterator();
            while (it2.hasNext()) {
                ((StateListener) it2.next()).cameraClosed();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
        public void cameraError(Exception exc) {
            Iterator it2 = CameraPreview.this.j.iterator();
            while (it2.hasNext()) {
                ((StateListener) it2.next()).cameraError(exc);
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
        public void previewSized() {
            Iterator it2 = CameraPreview.this.j.iterator();
            while (it2.hasNext()) {
                ((StateListener) it2.next()).previewSized();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
        public void previewStarted() {
            Iterator it2 = CameraPreview.this.j.iterator();
            while (it2.hasNext()) {
                ((StateListener) it2.next()).previewStarted();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
        public void previewStopped() {
            Iterator it2 = CameraPreview.this.j.iterator();
            while (it2.hasNext()) {
                ((StateListener) it2.next()).previewStopped();
            }
        }
    }

    public CameraPreview(Context context) {
        super(context);
        this.d = false;
        this.g = false;
        this.i = -1;
        this.j = new ArrayList();
        this.l = new CameraSettings();
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = 0.1d;
        this.u = null;
        this.v = false;
        this.w = new b();
        this.x = new c();
        this.y = new d();
        this.z = new e();
        l(context, null, 0, 0);
    }

    private int getDisplayRotation() {
        return this.b.getDefaultDisplay().getRotation();
    }

    private void i() {
        Size size;
        DisplayConfiguration displayConfiguration;
        Size size2 = this.m;
        if (size2 == null || (size = this.n) == null || (displayConfiguration = this.k) == null) {
            this.r = null;
            this.q = null;
            this.o = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i = size.width;
        int i2 = size.height;
        int i3 = size2.width;
        int i4 = size2.height;
        this.o = displayConfiguration.scalePreview(size);
        this.q = calculateFramingRect(new Rect(0, 0, i3, i4), this.o);
        Rect rect = new Rect(this.q);
        Rect rect2 = this.o;
        rect.offset(-rect2.left, -rect2.top);
        Rect rect3 = new Rect((rect.left * i) / this.o.width(), (rect.top * i2) / this.o.height(), (rect.right * i) / this.o.width(), (rect.bottom * i2) / this.o.height());
        this.r = rect3;
        if (rect3.width() > 0 && this.r.height() > 0) {
            this.z.previewSized();
            return;
        }
        this.r = null;
        this.q = null;
        Log.w(A, "Preview frame is too small");
    }

    private void j(Size size) {
        this.m = size;
        CameraInstance cameraInstance = this.a;
        if (cameraInstance == null || cameraInstance.getDisplayConfiguration() != null) {
            return;
        }
        DisplayConfiguration displayConfiguration = new DisplayConfiguration(getDisplayRotation(), size);
        this.k = displayConfiguration;
        displayConfiguration.setPreviewScalingStrategy(getPreviewScalingStrategy());
        this.a.setDisplayConfiguration(this.k);
        this.a.configureCamera();
        boolean z = this.v;
        if (z) {
            this.a.setTorch(z);
        }
    }

    private void k() {
        if (this.a != null) {
            Log.w(A, "initCamera called twice");
            return;
        }
        CameraInstance cameraInstanceCreateCameraInstance = createCameraInstance();
        this.a = cameraInstanceCreateCameraInstance;
        cameraInstanceCreateCameraInstance.setReadyHandler(this.c);
        this.a.open();
        this.i = getDisplayRotation();
    }

    private void l(Context context, AttributeSet attributeSet, int i, int i2) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        initializeAttributes(attributeSet);
        this.b = (WindowManager) context.getSystemService("window");
        this.c = new Handler(this.x);
        this.h = new RotationListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(Size size) {
        this.n = size;
        if (this.m != null) {
            i();
            requestLayout();
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (!isActive() || getDisplayRotation() == this.i) {
            return;
        }
        pause();
        resume();
    }

    @SuppressLint({"NewAPI"})
    private void o() {
        if (this.d && Build.VERSION.SDK_INT >= 14) {
            TextureView textureView = new TextureView(getContext());
            this.f = textureView;
            textureView.setSurfaceTextureListener(r());
            addView(this.f);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.e = surfaceView;
        if (Build.VERSION.SDK_INT < 11) {
            surfaceView.getHolder().setType(3);
        }
        this.e.getHolder().addCallback(this.w);
        addView(this.e);
    }

    private void p(CameraSurface cameraSurface) {
        if (this.g || this.a == null) {
            return;
        }
        Log.i(A, "Starting preview");
        this.a.setSurface(cameraSurface);
        this.a.startPreview();
        this.g = true;
        previewStarted();
        this.z.previewStarted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        Rect rect;
        Size size = this.p;
        if (size == null || this.n == null || (rect = this.o) == null) {
            return;
        }
        if (this.e != null && size.equals(new Size(rect.width(), this.o.height()))) {
            p(new CameraSurface(this.e.getHolder()));
            return;
        }
        TextureView textureView = this.f;
        if (textureView == null || Build.VERSION.SDK_INT < 14 || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.n != null) {
            this.f.setTransform(calculateTextureTransform(new Size(this.f.getWidth(), this.f.getHeight()), this.n));
        }
        p(new CameraSurface(this.f.getSurfaceTexture()));
    }

    @TargetApi(14)
    private TextureView.SurfaceTextureListener r() {
        return new a();
    }

    public void addStateListener(StateListener stateListener) {
        this.j.add(stateListener);
    }

    public Rect calculateFramingRect(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.s != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.s.width) / 2), Math.max(0, (rect3.height() - this.s.height) / 2));
            return rect3;
        }
        int iMin = (int) Math.min(((double) rect3.width()) * this.t, ((double) rect3.height()) * this.t);
        rect3.inset(iMin, iMin);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    public Matrix calculateTextureTransform(Size size, Size size2) {
        float f;
        float f2 = size.width / size.height;
        float f3 = size2.width / size2.height;
        float f4 = 1.0f;
        if (f2 < f3) {
            f4 = f3 / f2;
            f = 1.0f;
        } else {
            f = f2 / f3;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f);
        int i = size.width;
        int i2 = size.height;
        matrix.postTranslate((i - (i * f4)) / 2.0f, (i2 - (i2 * f)) / 2.0f);
        return matrix;
    }

    public CameraInstance createCameraInstance() {
        CameraInstance cameraInstance = new CameraInstance(getContext());
        cameraInstance.setCameraSettings(this.l);
        return cameraInstance;
    }

    public CameraInstance getCameraInstance() {
        return this.a;
    }

    public CameraSettings getCameraSettings() {
        return this.l;
    }

    public Rect getFramingRect() {
        return this.q;
    }

    public Size getFramingRectSize() {
        return this.s;
    }

    public double getMarginFraction() {
        return this.t;
    }

    public Rect getPreviewFramingRect() {
        return this.r;
    }

    public PreviewScalingStrategy getPreviewScalingStrategy() {
        PreviewScalingStrategy previewScalingStrategy = this.u;
        if (previewScalingStrategy != null) {
            return previewScalingStrategy;
        }
        return this.f != null ? new CenterCropStrategy() : new FitCenterStrategy();
    }

    public void initializeAttributes(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.zxing_camera_preview);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.zxing_camera_preview_zxing_framing_rect_width, -1.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.zxing_camera_preview_zxing_framing_rect_height, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.s = new Size(dimension, dimension2);
        }
        this.d = typedArrayObtainStyledAttributes.getBoolean(R.styleable.zxing_camera_preview_zxing_use_texture_view, true);
        int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.zxing_camera_preview_zxing_preview_scaling_strategy, -1);
        if (integer == 1) {
            this.u = new CenterCropStrategy();
        } else if (integer == 2) {
            this.u = new FitCenterStrategy();
        } else if (integer == 3) {
            this.u = new FitXYStrategy();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public boolean isActive() {
        return this.a != null;
    }

    public boolean isCameraClosed() {
        CameraInstance cameraInstance = this.a;
        return cameraInstance == null || cameraInstance.isCameraClosed();
    }

    public boolean isPreviewActive() {
        return this.g;
    }

    public boolean isUseTextureView() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        j(new Size(i3 - i, i4 - i2));
        SurfaceView surfaceView = this.e;
        if (surfaceView != null) {
            Rect rect = this.o;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
                return;
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
        }
        TextureView textureView = this.f;
        if (textureView == null || Build.VERSION.SDK_INT < 14) {
            return;
        }
        textureView.layout(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", parcelableOnSaveInstanceState);
        bundle.putBoolean("torch", this.v);
        return bundle;
    }

    public void pause() {
        TextureView textureView;
        SurfaceView surfaceView;
        Util.validateMainThread();
        Log.d(A, "pause()");
        this.i = -1;
        CameraInstance cameraInstance = this.a;
        if (cameraInstance != null) {
            cameraInstance.close();
            this.a = null;
            this.g = false;
        } else {
            this.c.sendEmptyMessage(R.id.zxing_camera_closed);
        }
        if (this.p == null && (surfaceView = this.e) != null) {
            surfaceView.getHolder().removeCallback(this.w);
        }
        if (this.p == null && (textureView = this.f) != null && Build.VERSION.SDK_INT >= 14) {
            textureView.setSurfaceTextureListener(null);
        }
        this.m = null;
        this.n = null;
        this.r = null;
        this.h.stop();
        this.z.previewStopped();
    }

    public void pauseAndWait() {
        CameraInstance cameraInstance = getCameraInstance();
        pause();
        long jNanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.isCameraClosed() && System.nanoTime() - jNanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public void previewStarted() {
    }

    public void resume() {
        Util.validateMainThread();
        Log.d(A, "resume()");
        k();
        if (this.p != null) {
            q();
        } else {
            SurfaceView surfaceView = this.e;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.w);
            } else {
                TextureView textureView = this.f;
                if (textureView != null && Build.VERSION.SDK_INT >= 14) {
                    if (textureView.isAvailable()) {
                        r().onSurfaceTextureAvailable(this.f.getSurfaceTexture(), this.f.getWidth(), this.f.getHeight());
                    } else {
                        this.f.setSurfaceTextureListener(r());
                    }
                }
            }
        }
        requestLayout();
        this.h.listen(getContext(), this.y);
    }

    public void setCameraSettings(CameraSettings cameraSettings) {
        this.l = cameraSettings;
    }

    public void setFramingRectSize(Size size) {
        this.s = size;
    }

    public void setMarginFraction(double d2) {
        if (d2 >= 0.5d) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.t = d2;
    }

    public void setPreviewScalingStrategy(PreviewScalingStrategy previewScalingStrategy) {
        this.u = previewScalingStrategy;
    }

    public void setTorch(boolean z) {
        this.v = z;
        CameraInstance cameraInstance = this.a;
        if (cameraInstance != null) {
            cameraInstance.setTorch(z);
        }
    }

    public void setUseTextureView(boolean z) {
        this.d = z;
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.g = false;
        this.i = -1;
        this.j = new ArrayList();
        this.l = new CameraSettings();
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = 0.1d;
        this.u = null;
        this.v = false;
        this.w = new b();
        this.x = new c();
        this.y = new d();
        this.z = new e();
        l(context, attributeSet, 0, 0);
    }

    public CameraPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        this.g = false;
        this.i = -1;
        this.j = new ArrayList();
        this.l = new CameraSettings();
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = 0.1d;
        this.u = null;
        this.v = false;
        this.w = new b();
        this.x = new c();
        this.y = new d();
        this.z = new e();
        l(context, attributeSet, i, 0);
    }
}
