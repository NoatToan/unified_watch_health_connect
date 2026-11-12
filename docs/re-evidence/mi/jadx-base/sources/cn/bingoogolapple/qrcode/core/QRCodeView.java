package cn.bingoogolapple.qrcode.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import defpackage.ael;
import defpackage.jai;
import defpackage.ou1;
import defpackage.zpi;

/* JADX INFO: loaded from: classes.dex */
public abstract class QRCodeView extends RelativeLayout implements Camera.PreviewCallback {
    public static final long[] o = {255, 255, 255, 255};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Camera f5495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CameraPreview f5496b;
    public ScanBoxView c;
    public boolean d;
    public jai e;
    public int f;
    public PointF[] g;
    public Paint h;
    public BarcodeType i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ValueAnimator f5497k;
    public long l;
    public long m;
    public int n;

    public class a implements CameraPreview.b {
        public a() {
        }

        @Override // cn.bingoogolapple.qrcode.core.CameraPreview.b
        public void a() {
            QRCodeView.this.m();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f5499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f5500b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;

        public b(int i, int i2, int i3, String str) {
            this.f5499a = i;
            this.f5500b = i2;
            this.c = i3;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            QRCodeView qRCodeView = QRCodeView.this;
            int i = this.f5499a;
            qRCodeView.o(i, Math.min(this.f5500b + i, this.c), this.d);
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CameraPreview cameraPreview = QRCodeView.this.f5496b;
            if (cameraPreview == null || !cameraPreview.d()) {
                return;
            }
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            Camera.Parameters parameters = QRCodeView.this.f5495a.getParameters();
            parameters.setZoom(iIntValue);
            QRCodeView.this.f5495a.setParameters(parameters);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5502a;

        public d(String str) {
            this.f5502a = str;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            QRCodeView.this.i(new ael(this.f5502a));
        }
    }

    public interface e {
    }

    public QRCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void c(byte[] bArr, Camera camera) {
        CameraPreview cameraPreview = this.f5496b;
        if (cameraPreview == null || !cameraPreview.d()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.m < 150) {
            return;
        }
        this.m = jCurrentTimeMillis;
        long j = camera.getParameters().getPreviewSize().width * camera.getParameters().getPreviewSize().height;
        if (Math.abs(bArr.length - (j * 1.5f)) < 1.0E-5f) {
            long j2 = 0;
            for (int i = 0; i < j; i += 10) {
                j2 += ((long) bArr[i]) & 255;
            }
            long j3 = j2 / (j / ((long) 10));
            long[] jArr = o;
            int length = this.n % jArr.length;
            jArr[length] = j3;
            this.n = length + 1;
            int length2 = jArr.length;
            for (int i2 = 0; i2 < length2 && jArr[i2] <= 60; i2++) {
            }
            ou1.e("摄像头环境亮度为：" + j3);
        }
    }

    public final boolean d(PointF[] pointFArr, String str) {
        if (this.f5495a == null || this.c == null || pointFArr == null || pointFArr.length < 1) {
            return false;
        }
        ValueAnimator valueAnimator = this.f5497k;
        if ((valueAnimator != null && valueAnimator.isRunning()) || System.currentTimeMillis() - this.l < 1200) {
            return true;
        }
        Camera.Parameters parameters = this.f5495a.getParameters();
        if (!parameters.isZoomSupported()) {
            return false;
        }
        PointF pointF = pointFArr[0];
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = pointFArr[1];
        float f3 = pointF2.x;
        float f4 = pointF2.y;
        float fAbs = Math.abs(f - f3);
        float fAbs2 = Math.abs(f2 - f4);
        if (((int) Math.sqrt((fAbs * fAbs) + (fAbs2 * fAbs2))) > this.c.getRectWidth() / 4) {
            return false;
        }
        int maxZoom = parameters.getMaxZoom();
        post(new b(parameters.getZoom(), maxZoom / 4, maxZoom, str));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        PointF[] pointFArr;
        super.dispatchDraw(canvas);
        if (!g() || (pointFArr = this.g) == null) {
            return;
        }
        for (PointF pointF : pointFArr) {
            canvas.drawCircle(pointF.x, pointF.y, 10.0f, this.h);
        }
        this.g = null;
        postInvalidateDelayed(VibrateModeProgressBar.sLongToLong);
    }

    public final void e(Context context, AttributeSet attributeSet) {
        CameraPreview cameraPreview = new CameraPreview(context);
        this.f5496b = cameraPreview;
        cameraPreview.setDelegate(new a());
        ScanBoxView scanBoxView = new ScanBoxView(context);
        this.c = scanBoxView;
        scanBoxView.i(this, attributeSet);
        this.f5496b.setId(zpi.f41552a);
        addView(this.f5496b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(context, attributeSet);
        layoutParams.addRule(6, this.f5496b.getId());
        layoutParams.addRule(8, this.f5496b.getId());
        addView(this.c, layoutParams);
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(getScanBoxView().getCornerColor());
        this.h.setStyle(Paint.Style.FILL);
    }

    public boolean f() {
        ScanBoxView scanBoxView = this.c;
        return scanBoxView != null && scanBoxView.k();
    }

    public boolean g() {
        ScanBoxView scanBoxView = this.c;
        return scanBoxView != null && scanBoxView.m();
    }

    public CameraPreview getCameraPreview() {
        return this.f5496b;
    }

    public boolean getIsScanBarcodeStyle() {
        return this.c.getIsBarcode();
    }

    public ScanBoxView getScanBoxView() {
        return this.c;
    }

    public void h(ael aelVar) {
    }

    public void i(ael aelVar) {
        if (this.d) {
            if (!TextUtils.isEmpty(aelVar == null ? null : aelVar.f929a)) {
                this.d = false;
                return;
            }
            try {
                Camera camera = this.f5495a;
                if (camera != null) {
                    camera.setOneShotPreviewCallback(this);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void j(Rect rect) {
        this.f5496b.e(rect);
    }

    public abstract ael k(Bitmap bitmap);

    public abstract ael l(byte[] bArr, int i, int i2, boolean z);

    public final void m() {
        if (this.d && this.f5496b.d()) {
            try {
                this.f5495a.setOneShotPreviewCallback(this);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public abstract void n();

    public final void o(int i, int i2, String str) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        this.f5497k = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new c());
        this.f5497k.addListener(new d(str));
        this.f5497k.setDuration(600L);
        this.f5497k.setRepeatCount(0);
        this.f5497k.start();
        this.l = System.currentTimeMillis();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f5497k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (ou1.l()) {
            ou1.e("两次 onPreviewFrame 时间间隔：" + (System.currentTimeMillis() - this.j));
            this.j = System.currentTimeMillis();
        }
        CameraPreview cameraPreview = this.f5496b;
        if (cameraPreview != null && cameraPreview.d()) {
            try {
                c(bArr, camera);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (this.d) {
            jai jaiVar = this.e;
            if (jaiVar == null || !(jaiVar.getStatus() == AsyncTask.Status.PENDING || this.e.getStatus() == AsyncTask.Status.RUNNING)) {
                this.e = new jai(camera, bArr, this, ou1.m(getContext())).c();
            }
        }
    }

    public final PointF p(float f, float f2, float f3, float f4, boolean z, int i, Rect rect) {
        PointF pointF;
        int width = getWidth();
        int height = getHeight();
        if (ou1.m(getContext())) {
            float f5 = width;
            float f6 = height;
            pointF = new PointF((f4 - f) * (f5 / f4), (f3 - f2) * (f6 / f3));
            float f7 = f6 - pointF.y;
            pointF.y = f7;
            pointF.x = f5 - pointF.x;
            if (rect == null) {
                pointF.y = f7 + i;
            }
        } else {
            float f8 = width;
            pointF = new PointF(f * (f8 / f3), f2 * (height / f4));
            if (z) {
                pointF.x = f8 - pointF.x;
            }
        }
        if (rect != null) {
            pointF.y += rect.top;
            pointF.x += rect.left;
        }
        return pointF;
    }

    public boolean q(PointF[] pointFArr, Rect rect, boolean z, String str) {
        if (pointFArr != null && pointFArr.length != 0) {
            try {
                Camera.Size previewSize = this.f5495a.getParameters().getPreviewSize();
                boolean z2 = this.f == 1;
                int iK = ou1.k(getContext());
                PointF[] pointFArr2 = new PointF[pointFArr.length];
                int i = 0;
                for (PointF pointF : pointFArr) {
                    pointFArr2[i] = p(pointF.x, pointF.y, previewSize.width, previewSize.height, z2, iK, rect);
                    i++;
                }
                this.g = pointFArr2;
                postInvalidate();
                if (z) {
                    return d(pointFArr2, str);
                }
                return false;
            } catch (Exception e2) {
                this.g = null;
                e2.printStackTrace();
            }
        }
        return false;
    }

    public void setDelegate(e eVar) {
    }

    public QRCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        this.f = 0;
        this.i = BarcodeType.HIGH_FREQUENCY;
        this.j = 0L;
        this.l = 0L;
        this.m = System.currentTimeMillis();
        this.n = 0;
        e(context, attributeSet);
        n();
    }
}
