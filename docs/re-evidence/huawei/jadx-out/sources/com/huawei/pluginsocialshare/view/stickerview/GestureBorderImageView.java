package com.huawei.pluginsocialshare.view.stickerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.media3.common.C;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;

/* JADX INFO: loaded from: classes42.dex */
public class GestureBorderImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f22695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f22696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22697c;
    private float d;
    private Paint e;
    private float f;
    private GestureDetector g;
    private Handler h;
    private Runnable i;
    private float j;
    private boolean k;
    private boolean l;
    private boolean m;
    private HealthBubbleLayout n;
    private Runnable o;
    private GridBackgroundView p;
    private final GestureDetector.OnGestureListener q;
    private final ScaleGestureDetector.OnScaleGestureListener r;
    private final OnRotationGestureListener s;
    private ImageView t;
    private Matrix w;
    private c x;
    private ScaleGestureDetector y;

    public interface OnRotationGestureListener {
        void onRotation(c cVar, float f);
    }

    public GestureBorderImageView(Context context) {
        super(context);
        this.m = false;
        this.l = false;
        this.w = new Matrix();
        this.f22695a = 1.0f;
        this.k = false;
        this.h = new Handler();
        this.o = new Runnable() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.4
            @Override // java.lang.Runnable
            public void run() {
                GestureBorderImageView.this.m = true;
            }
        };
        this.i = new Runnable() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.1
            @Override // java.lang.Runnable
            public void run() {
                GestureBorderImageView.this.k = false;
                GestureBorderImageView.this.e();
                GestureBorderImageView.this.invalidate();
            }
        };
        this.r = new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.5
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float f = GestureBorderImageView.this.f22695a;
                GestureBorderImageView gestureBorderImageView = GestureBorderImageView.this;
                gestureBorderImageView.f22695a = Math.min(Math.max(gestureBorderImageView.f22695a * scaleGestureDetector.getScaleFactor(), 0.2f), 5.0f);
                float f2 = GestureBorderImageView.this.f22695a / f;
                GestureBorderImageView.this.w.postScale(f2, f2, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                GestureBorderImageView gestureBorderImageView2 = GestureBorderImageView.this;
                gestureBorderImageView2.setImageMatrix(gestureBorderImageView2.w);
                return true;
            }
        };
        this.q = new GestureDetector.OnGestureListener() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f22700a = false;
            private Handler d = new Handler(Looper.getMainLooper());

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (GestureBorderImageView.this.getDrawable() == null) {
                    return false;
                }
                if (this.f22700a) {
                    return true;
                }
                RectF rectF = new RectF();
                GestureBorderImageView.this.w.mapRect(rectF, new RectF(0.0f, 0.0f, GestureBorderImageView.this.getDrawable().getIntrinsicWidth(), GestureBorderImageView.this.getDrawable().getIntrinsicHeight()));
                RectF rectF2 = new RectF(rectF);
                float f3 = -f;
                float f4 = -f2;
                rectF2.offset(f3, f4);
                if (rectF2.right < 100.0f || rectF2.left > GestureBorderImageView.this.getWidth() - 100 || rectF2.bottom < 100.0f || rectF2.top > GestureBorderImageView.this.getHeight() - 100) {
                    GestureBorderImageView.this.w.reset();
                    GestureBorderImageView.this.f22695a = 1.0f;
                    GestureBorderImageView gestureBorderImageView = GestureBorderImageView.this;
                    gestureBorderImageView.setImageMatrix(gestureBorderImageView.w);
                    this.f22700a = true;
                    this.d.postDelayed(new Runnable() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.3.3
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass3.this.f22700a = false;
                        }
                    }, 500L);
                } else {
                    GestureBorderImageView gestureBorderImageView2 = GestureBorderImageView.this;
                    if (f == 0.0f) {
                        f = f2;
                    }
                    gestureBorderImageView2.f22696b = f;
                    GestureBorderImageView.this.w.postTranslate(f3, f4);
                    GestureBorderImageView gestureBorderImageView3 = GestureBorderImageView.this;
                    gestureBorderImageView3.setImageMatrix(gestureBorderImageView3.w);
                }
                return true;
            }
        };
        this.s = new OnRotationGestureListener() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.2
            @Override // com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.OnRotationGestureListener
            public void onRotation(c cVar, float f) {
                GestureBorderImageView.this.w.postRotate(f, GestureBorderImageView.this.getWidth() / 2.0f, GestureBorderImageView.this.getHeight() / 2.0f);
                GestureBorderImageView.this.d = f;
                GestureBorderImageView gestureBorderImageView = GestureBorderImageView.this;
                gestureBorderImageView.setImageMatrix(gestureBorderImageView.w);
            }
        };
        c(context);
    }

    public GestureBorderImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = false;
        this.l = false;
        this.w = new Matrix();
        this.f22695a = 1.0f;
        this.k = false;
        this.h = new Handler();
        this.o = new Runnable() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.4
            @Override // java.lang.Runnable
            public void run() {
                GestureBorderImageView.this.m = true;
            }
        };
        this.i = new Runnable() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.1
            @Override // java.lang.Runnable
            public void run() {
                GestureBorderImageView.this.k = false;
                GestureBorderImageView.this.e();
                GestureBorderImageView.this.invalidate();
            }
        };
        this.r = new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.5
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float f = GestureBorderImageView.this.f22695a;
                GestureBorderImageView gestureBorderImageView = GestureBorderImageView.this;
                gestureBorderImageView.f22695a = Math.min(Math.max(gestureBorderImageView.f22695a * scaleGestureDetector.getScaleFactor(), 0.2f), 5.0f);
                float f2 = GestureBorderImageView.this.f22695a / f;
                GestureBorderImageView.this.w.postScale(f2, f2, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                GestureBorderImageView gestureBorderImageView2 = GestureBorderImageView.this;
                gestureBorderImageView2.setImageMatrix(gestureBorderImageView2.w);
                return true;
            }
        };
        this.q = new GestureDetector.OnGestureListener() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f22700a = false;
            private Handler d = new Handler(Looper.getMainLooper());

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (GestureBorderImageView.this.getDrawable() == null) {
                    return false;
                }
                if (this.f22700a) {
                    return true;
                }
                RectF rectF = new RectF();
                GestureBorderImageView.this.w.mapRect(rectF, new RectF(0.0f, 0.0f, GestureBorderImageView.this.getDrawable().getIntrinsicWidth(), GestureBorderImageView.this.getDrawable().getIntrinsicHeight()));
                RectF rectF2 = new RectF(rectF);
                float f3 = -f;
                float f4 = -f2;
                rectF2.offset(f3, f4);
                if (rectF2.right < 100.0f || rectF2.left > GestureBorderImageView.this.getWidth() - 100 || rectF2.bottom < 100.0f || rectF2.top > GestureBorderImageView.this.getHeight() - 100) {
                    GestureBorderImageView.this.w.reset();
                    GestureBorderImageView.this.f22695a = 1.0f;
                    GestureBorderImageView gestureBorderImageView = GestureBorderImageView.this;
                    gestureBorderImageView.setImageMatrix(gestureBorderImageView.w);
                    this.f22700a = true;
                    this.d.postDelayed(new Runnable() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.3.3
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass3.this.f22700a = false;
                        }
                    }, 500L);
                } else {
                    GestureBorderImageView gestureBorderImageView2 = GestureBorderImageView.this;
                    if (f == 0.0f) {
                        f = f2;
                    }
                    gestureBorderImageView2.f22696b = f;
                    GestureBorderImageView.this.w.postTranslate(f3, f4);
                    GestureBorderImageView gestureBorderImageView3 = GestureBorderImageView.this;
                    gestureBorderImageView3.setImageMatrix(gestureBorderImageView3.w);
                }
                return true;
            }
        };
        this.s = new OnRotationGestureListener() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.2
            @Override // com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.OnRotationGestureListener
            public void onRotation(c cVar, float f) {
                GestureBorderImageView.this.w.postRotate(f, GestureBorderImageView.this.getWidth() / 2.0f, GestureBorderImageView.this.getHeight() / 2.0f);
                GestureBorderImageView.this.d = f;
                GestureBorderImageView gestureBorderImageView = GestureBorderImageView.this;
                gestureBorderImageView.setImageMatrix(gestureBorderImageView.w);
            }
        };
        c(context);
    }

    public GestureBorderImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = false;
        this.l = false;
        this.w = new Matrix();
        this.f22695a = 1.0f;
        this.k = false;
        this.h = new Handler();
        this.o = new Runnable() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.4
            @Override // java.lang.Runnable
            public void run() {
                GestureBorderImageView.this.m = true;
            }
        };
        this.i = new Runnable() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.1
            @Override // java.lang.Runnable
            public void run() {
                GestureBorderImageView.this.k = false;
                GestureBorderImageView.this.e();
                GestureBorderImageView.this.invalidate();
            }
        };
        this.r = new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.5
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float f = GestureBorderImageView.this.f22695a;
                GestureBorderImageView gestureBorderImageView = GestureBorderImageView.this;
                gestureBorderImageView.f22695a = Math.min(Math.max(gestureBorderImageView.f22695a * scaleGestureDetector.getScaleFactor(), 0.2f), 5.0f);
                float f2 = GestureBorderImageView.this.f22695a / f;
                GestureBorderImageView.this.w.postScale(f2, f2, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                GestureBorderImageView gestureBorderImageView2 = GestureBorderImageView.this;
                gestureBorderImageView2.setImageMatrix(gestureBorderImageView2.w);
                return true;
            }
        };
        this.q = new GestureDetector.OnGestureListener() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f22700a = false;
            private Handler d = new Handler(Looper.getMainLooper());

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (GestureBorderImageView.this.getDrawable() == null) {
                    return false;
                }
                if (this.f22700a) {
                    return true;
                }
                RectF rectF = new RectF();
                GestureBorderImageView.this.w.mapRect(rectF, new RectF(0.0f, 0.0f, GestureBorderImageView.this.getDrawable().getIntrinsicWidth(), GestureBorderImageView.this.getDrawable().getIntrinsicHeight()));
                RectF rectF2 = new RectF(rectF);
                float f3 = -f;
                float f4 = -f2;
                rectF2.offset(f3, f4);
                if (rectF2.right < 100.0f || rectF2.left > GestureBorderImageView.this.getWidth() - 100 || rectF2.bottom < 100.0f || rectF2.top > GestureBorderImageView.this.getHeight() - 100) {
                    GestureBorderImageView.this.w.reset();
                    GestureBorderImageView.this.f22695a = 1.0f;
                    GestureBorderImageView gestureBorderImageView = GestureBorderImageView.this;
                    gestureBorderImageView.setImageMatrix(gestureBorderImageView.w);
                    this.f22700a = true;
                    this.d.postDelayed(new Runnable() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.3.3
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass3.this.f22700a = false;
                        }
                    }, 500L);
                } else {
                    GestureBorderImageView gestureBorderImageView2 = GestureBorderImageView.this;
                    if (f == 0.0f) {
                        f = f2;
                    }
                    gestureBorderImageView2.f22696b = f;
                    GestureBorderImageView.this.w.postTranslate(f3, f4);
                    GestureBorderImageView gestureBorderImageView3 = GestureBorderImageView.this;
                    gestureBorderImageView3.setImageMatrix(gestureBorderImageView3.w);
                }
                return true;
            }
        };
        this.s = new OnRotationGestureListener() { // from class: com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.2
            @Override // com.huawei.pluginsocialshare.view.stickerview.GestureBorderImageView.OnRotationGestureListener
            public void onRotation(c cVar, float f) {
                GestureBorderImageView.this.w.postRotate(f, GestureBorderImageView.this.getWidth() / 2.0f, GestureBorderImageView.this.getHeight() / 2.0f);
                GestureBorderImageView.this.d = f;
                GestureBorderImageView gestureBorderImageView = GestureBorderImageView.this;
                gestureBorderImageView.setImageMatrix(gestureBorderImageView.w);
            }
        };
        c(context);
    }

    private void c(Context context) {
        this.f22697c = context;
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setStrokeWidth(4.0f);
    }

    public void d(HealthBubbleLayout healthBubbleLayout, ImageView imageView, GridBackgroundView gridBackgroundView) {
        this.n = healthBubbleLayout;
        this.t = imageView;
        this.p = gridBackgroundView;
        if (this.f22695a == 1.0f && this.d == 0.0f && this.f22696b == 0.0f) {
            setScaleType(ImageView.ScaleType.MATRIX);
            this.y = new ScaleGestureDetector(this.f22697c, this.r);
            this.g = new GestureDetector(this.f22697c, this.q);
            this.x = new c(this.s);
            return;
        }
        this.f22695a = 1.0f;
        this.d = 0.0f;
        this.f22696b = 0.0f;
        this.k = false;
        this.w.reset();
        setImageMatrix(this.w);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getDrawable() == null) {
            return;
        }
        if (this.k) {
            c(canvas, -1);
        } else if (this.f22695a != 1.0f) {
            c(canvas, -16777216);
        }
    }

    private void c(Canvas canvas, int i) {
        this.w.mapRect(new RectF(), new RectF(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight()));
        canvas.save();
        canvas.concat(this.w);
        this.e.setColor(i);
        canvas.drawRect(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight(), this.e);
        canvas.restore();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            d(motionEvent);
        } else if (action == 1) {
            a(motionEvent);
        } else if (action == 2) {
            e(motionEvent);
        }
        if (this.k) {
            b(motionEvent);
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    private void d(MotionEvent motionEvent) {
        if (this.k) {
            this.h.removeCallbacks(this.i);
            this.m = true;
            return;
        }
        this.m = false;
        if (this.l) {
            return;
        }
        this.j = motionEvent.getX();
        this.f = motionEvent.getY();
        this.h.postDelayed(this.o, 300L);
        this.l = true;
    }

    private void e(MotionEvent motionEvent) {
        if (this.k) {
            return;
        }
        float fSqrt = (float) Math.sqrt(Math.pow(motionEvent.getX() - this.j, 2.0d) + Math.pow(motionEvent.getY() - this.f, 2.0d));
        if (!this.l || fSqrt <= 100.0f) {
            return;
        }
        this.h.removeCallbacks(this.o);
        this.l = false;
        this.m = false;
    }

    private void a(MotionEvent motionEvent) {
        if (this.m) {
            this.k = true;
            b();
            invalidate();
            this.h.removeCallbacks(this.i);
            this.h.postDelayed(this.i, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        }
        if (this.l) {
            this.h.removeCallbacks(this.o);
            this.l = false;
            this.m = false;
        }
        d();
    }

    private void b(MotionEvent motionEvent) {
        this.y.onTouchEvent(motionEvent);
        this.g.onTouchEvent(motionEvent);
        this.x.e(motionEvent);
    }

    private void d() {
        HealthBubbleLayout healthBubbleLayout = this.n;
        if (healthBubbleLayout != null) {
            healthBubbleLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ImageView imageView = this.t;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        GridBackgroundView gridBackgroundView = this.p;
        if (gridBackgroundView != null) {
            gridBackgroundView.setVisibility(8);
        }
    }

    private void b() {
        ImageView imageView = this.t;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        GridBackgroundView gridBackgroundView = this.p;
        if (gridBackgroundView != null) {
            gridBackgroundView.setVisibility(0);
        }
    }

    class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private OnRotationGestureListener f22704c;
        private float e = 0.0f;

        public c(OnRotationGestureListener onRotationGestureListener) {
            this.f22704c = onRotationGestureListener;
        }

        public void e(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 2) {
                if (actionMasked == 5 && motionEvent.getPointerCount() == 2) {
                    this.e = d(motionEvent);
                    return;
                }
                return;
            }
            if (motionEvent.getPointerCount() == 2) {
                float fD = d(motionEvent);
                this.f22704c.onRotation(this, fD - this.e);
                this.e = fD;
            }
        }

        private float d(MotionEvent motionEvent) {
            return (float) Math.toDegrees(Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0)));
        }
    }
}
