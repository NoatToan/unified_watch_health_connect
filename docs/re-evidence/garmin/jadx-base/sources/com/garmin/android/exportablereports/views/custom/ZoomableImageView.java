package com.garmin.android.exportablereports.views.custom;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import b00.g;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/exportablereports/views/custom/ZoomableImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "x", "", "setMaxZoom", "(F)V", "Landroid/graphics/Bitmap;", "bm", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "a", "b", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ZoomableImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f49858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f49860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f49861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f49862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScaleGestureDetector f49863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f49864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f49865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f49866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f49867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f49868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f49869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f49870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f49871n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f49872o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f49873p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f49874q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f49875r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f49876t;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/exportablereports/views/custom/ZoomableImageView$b;", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "<init>", "(Lcom/garmin/android/exportablereports/views/custom/ZoomableImageView;)V", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:35:0x00db  */
        /* JADX WARN: Code duplicated, block: B:37:0x00df  */
        /* JADX WARN: Code duplicated, block: B:38:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:40:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:43:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f22;
            scaleGestureDetector.getClass();
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            float f24 = zoomableImageView.f49870m;
            float f25 = f24 * scaleFactor;
            zoomableImageView.f49870m = f25;
            float f26 = zoomableImageView.f49865h;
            if (f25 <= f26) {
                f26 = zoomableImageView.f49864g;
                if (f25 < f26) {
                    zoomableImageView.f49870m = f26;
                }
                f14 = zoomableImageView.f49868k;
                f15 = zoomableImageView.f49870m;
                float f27 = 2;
                zoomableImageView.f49871n = ((f14 * f15) - f14) - ((zoomableImageView.f49866i * f27) * f15);
                f16 = zoomableImageView.f49869l;
                zoomableImageView.f49872o = ((f16 * f15) - f16) - ((zoomableImageView.f49867j * f27) * f15);
                if (zoomableImageView.f49873p * f15 <= f14 && zoomableImageView.f49874q * f15 > f16) {
                    zoomableImageView.f49858a.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    zoomableImageView.f49858a.getValues(zoomableImageView.f49862e);
                    float[] fArr = zoomableImageView.f49862e;
                    float f28 = fArr[2];
                    float f29 = fArr[5];
                    if (scaleFactor >= 1.0f) {
                        return true;
                    }
                    float f34 = zoomableImageView.f49871n;
                    if (f28 < (-f34)) {
                        zoomableImageView.f49858a.postTranslate(-(f28 + f34), 0.0f);
                    } else if (f28 > 0.0f) {
                        zoomableImageView.f49858a.postTranslate(-f28, 0.0f);
                    }
                    float f35 = zoomableImageView.f49872o;
                    if (f29 < (-f35)) {
                        zoomableImageView.f49858a.postTranslate(0.0f, -(f29 + f35));
                        return true;
                    }
                    if (f29 <= 0.0f) {
                        return true;
                    }
                    zoomableImageView.f49858a.postTranslate(0.0f, -f29);
                    return true;
                }
                zoomableImageView.f49858a.postScale(scaleFactor, scaleFactor, f14 / f27, f16 / f27);
                if (scaleFactor < 1.0f) {
                    return true;
                }
                zoomableImageView.f49858a.getValues(zoomableImageView.f49862e);
                float[] fArr2 = zoomableImageView.f49862e;
                f17 = fArr2[2];
                f18 = fArr2[5];
                if (MathKt.d(zoomableImageView.f49873p * zoomableImageView.f49870m) < zoomableImageView.f49868k) {
                    f22 = zoomableImageView.f49872o;
                    if (f18 < (-f22)) {
                        zoomableImageView.f49858a.postTranslate(0.0f, -(f18 + f22));
                        return true;
                    }
                    if (f18 > 0.0f) {
                        return true;
                    }
                    zoomableImageView.f49858a.postTranslate(0.0f, -f18);
                    return true;
                }
                f19 = zoomableImageView.f49871n;
                if (f17 < (-f19)) {
                    zoomableImageView.f49858a.postTranslate(-(f17 + f19), 0.0f);
                    return true;
                }
                if (f17 > 0.0f) {
                    return true;
                }
                zoomableImageView.f49858a.postTranslate(-f17, 0.0f);
                return true;
            }
            zoomableImageView.f49870m = f26;
            scaleFactor = f26 / f24;
            f14 = zoomableImageView.f49868k;
            f15 = zoomableImageView.f49870m;
            float f210 = 2;
            zoomableImageView.f49871n = ((f14 * f15) - f14) - ((zoomableImageView.f49866i * f210) * f15);
            f16 = zoomableImageView.f49869l;
            zoomableImageView.f49872o = ((f16 * f15) - f16) - ((zoomableImageView.f49867j * f210) * f15);
            if (zoomableImageView.f49873p * f15 <= f14) {
            }
            zoomableImageView.f49858a.postScale(scaleFactor, scaleFactor, f14 / f210, f16 / f210);
            if (scaleFactor < 1.0f) {
                return true;
            }
            zoomableImageView.f49858a.getValues(zoomableImageView.f49862e);
            float[] fArr3 = zoomableImageView.f49862e;
            f17 = fArr3[2];
            f18 = fArr3[5];
            if (MathKt.d(zoomableImageView.f49873p * zoomableImageView.f49870m) < zoomableImageView.f49868k) {
                f22 = zoomableImageView.f49872o;
                if (f18 < (-f22)) {
                    zoomableImageView.f49858a.postTranslate(0.0f, -(f18 + f22));
                    return true;
                }
                if (f18 > 0.0f) {
                    return true;
                }
                zoomableImageView.f49858a.postTranslate(0.0f, -f18);
                return true;
            }
            f19 = zoomableImageView.f49871n;
            if (f17 < (-f19)) {
                zoomableImageView.f49858a.postTranslate(-(f17 + f19), 0.0f);
                return true;
            }
            if (f17 > 0.0f) {
                return true;
            }
            zoomableImageView.f49858a.postTranslate(-f17, 0.0f);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            scaleGestureDetector.getClass();
            ZoomableImageView.this.f49859b = 2;
            return true;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        Matrix matrix = new Matrix();
        this.f49858a = matrix;
        this.f49860c = new PointF();
        this.f49861d = new PointF();
        this.f49864g = 1.0f;
        this.f49865h = 4.0f;
        this.f49870m = 1.0f;
        this.f49863f = new ScaleGestureDetector(context, new b());
        matrix.setTranslate(1.0f, 1.0f);
        this.f49862e = new float[9];
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
        setOnTouchListener(new g(this, 14));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        this.f49868k = View.MeasureSpec.getSize(i14);
        float size = View.MeasureSpec.getSize(i15);
        this.f49869l = size;
        float fMin = Math.min(this.f49868k / this.f49875r, size / this.f49876t);
        Matrix matrix = this.f49858a;
        matrix.setScale(fMin, fMin);
        setImageMatrix(matrix);
        this.f49870m = 1.0f;
        float f14 = this.f49869l - (this.f49876t * fMin);
        float f15 = this.f49868k - (fMin * this.f49875r);
        float f16 = f14 / 2.0f;
        this.f49867j = f16;
        float f17 = f15 / 2.0f;
        this.f49866i = f17;
        matrix.postTranslate(f17, f16);
        float f18 = this.f49868k;
        float f19 = 2;
        float f22 = this.f49866i;
        this.f49873p = f18 - (f19 * f22);
        float f24 = this.f49869l;
        float f25 = this.f49867j;
        this.f49874q = f24 - (f19 * f25);
        float f26 = this.f49870m;
        this.f49871n = ((f18 * f26) - f18) - ((f22 * f19) * f26);
        this.f49872o = ((f24 * f26) - f24) - ((f19 * f25) * f26);
        setImageMatrix(matrix);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bm3) {
        bm3.getClass();
        super.setImageBitmap(bm3);
        this.f49875r = bm3.getWidth();
        this.f49876t = bm3.getHeight();
    }

    public final void setMaxZoom(float x14) {
        this.f49865h = x14;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/exportablereports/views/custom/ZoomableImageView$a;", "", "<init>", "()V", "", "NONE", "I", "DRAG", "ZOOM", "CLICK", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
