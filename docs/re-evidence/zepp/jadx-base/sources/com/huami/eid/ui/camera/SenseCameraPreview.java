package com.huami.eid.ui.camera;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.sensetime.senseid.sdk.liveness.silent.common.type.Size;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class SenseCameraPreview extends ViewGroup {
    private Context a;
    private SurfaceView b;
    private boolean c;
    private boolean d;
    private SenseCamera e;
    private StartListener f;
    public Rect scaledRect;

    public interface StartListener {
        void onFail();
    }

    public class a implements SurfaceHolder.Callback {
        private a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            SenseCameraPreview.this.d = true;
            try {
                SenseCameraPreview.this.e();
            } catch (Exception unused) {
                if (SenseCameraPreview.this.f != null) {
                    SenseCameraPreview.this.f.onFail();
                }
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            SenseCameraPreview.this.d = false;
        }
    }

    public SenseCameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scaledRect = null;
        this.a = context;
        this.c = false;
        this.d = false;
        CircleSurfaceView circleSurfaceView = new CircleSurfaceView(context);
        this.b = circleSurfaceView;
        circleSurfaceView.setBackgroundColor(0);
        this.b.getHolder().addCallback(new a());
        addView(this.b);
    }

    private boolean d() {
        return this.a.getResources().getConfiguration().orientation == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() throws IOException, RuntimeException {
        if (this.c && this.d) {
            this.e.q(this.b.getHolder());
            requestLayout();
            this.c = false;
        }
    }

    public Rect convertViewRectToPicture(Rect rect) {
        float f;
        float f2;
        int width = getWidth();
        int height = getHeight();
        int rotationDegrees = this.e.getRotationDegrees();
        int width2 = this.e.getPreviewSize().getWidth();
        int height2 = this.e.getPreviewSize().getHeight();
        if (rotationDegrees == 90 || rotationDegrees == 270) {
            f = height2 / width;
            f2 = width2;
        } else {
            f = width2 / width;
            f2 = height2;
        }
        float f3 = f2 / height;
        if (f < f3) {
            f3 = f;
        }
        this.scaledRect = new Rect((int) ((rect.left * f3) + 0.5f), (int) ((rect.top * f3) + 0.5f), (int) ((rect.right * f3) + 0.5f), (int) ((rect.bottom * f3) + 0.5f));
        Rect rect2 = new Rect(this.scaledRect);
        if (rotationDegrees == 90) {
            Rect rect3 = this.scaledRect;
            rect2 = new Rect(rect3.top, height2 - rect3.right, rect3.bottom, height2 - rect3.left);
        } else if (rotationDegrees == 180) {
            Rect rect4 = this.scaledRect;
            rect2 = new Rect(width2 - rect4.right, height2 - rect4.bottom, width2 - rect4.left, height2 - rect4.top);
        } else if (rotationDegrees == 270) {
            Rect rect5 = this.scaledRect;
            rect2 = new Rect(width2 - rect5.bottom, rect5.left, width2 - rect5.top, rect5.right);
        }
        Rect rect6 = new Rect(rect2);
        if (this.e.j() != 1) {
            return rect6;
        }
        if (rotationDegrees != 0) {
            if (rotationDegrees != 90) {
                if (rotationDegrees != 180) {
                    if (rotationDegrees != 270) {
                        return rect6;
                    }
                }
            }
            return new Rect(rect2.left, height2 - rect2.bottom, rect2.right, height2 - rect2.top);
        }
        return new Rect(width2 - rect2.right, rect2.top, width2 - rect2.left, rect2.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Size previewSize;
        SenseCamera senseCamera = this.e;
        if (senseCamera == null || (previewSize = senseCamera.getPreviewSize()) == null) {
            return;
        }
        int width = previewSize.getWidth();
        int height = previewSize.getHeight();
        if (d()) {
            width = height;
            height = width;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        float f = i5;
        float f2 = i6;
        float f3 = width / height;
        if (Float.compare(f / f2, f3) <= 0) {
            i5 = (int) (f2 * f3);
        } else {
            i6 = (int) (f / f3);
        }
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            getChildAt(i7).layout(0, 0, i5, i6);
        }
        try {
            e();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SecurityException e2) {
            e2.printStackTrace();
        }
    }

    public void release() {
        SenseCamera senseCamera = this.e;
        if (senseCamera != null) {
            senseCamera.m();
            this.e = null;
        }
    }

    public void setStartListener(StartListener startListener) {
        this.f = startListener;
    }

    public void start(SenseCamera senseCamera) throws IOException, RuntimeException {
        if (senseCamera == null) {
            stop();
        }
        this.e = senseCamera;
        if (senseCamera != null) {
            this.c = true;
            e();
        }
    }

    public void stop() {
        SenseCamera senseCamera = this.e;
        if (senseCamera != null) {
            senseCamera.r();
        }
    }
}
