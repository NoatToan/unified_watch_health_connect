package com.huawei.health.basesport.controls;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes25.dex */
public class CircleProgressButton extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f6207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f6208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f6209c;
    private CircleProcessListener d;
    private float e;
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private Bitmap l;
    private e m;
    private Matrix n;
    private Paint o;
    private RectF p;
    private float r;
    private Bitmap s;
    private int t;

    public interface CircleProcessListener {
        void onCancel();

        void onFinished();

        void onStarted();
    }

    static /* synthetic */ float a(CircleProgressButton circleProgressButton, float f) {
        float f2 = circleProgressButton.f6207a + f;
        circleProgressButton.f6207a = f2;
        return f2;
    }

    static /* synthetic */ float b(CircleProgressButton circleProgressButton, float f) {
        float f2 = circleProgressButton.r - f;
        circleProgressButton.r = f2;
        return f2;
    }

    static /* synthetic */ float c(CircleProgressButton circleProgressButton, float f) {
        float f2 = circleProgressButton.r + f;
        circleProgressButton.r = f2;
        return f2;
    }

    static /* synthetic */ float d(CircleProgressButton circleProgressButton, float f) {
        float f2 = circleProgressButton.f6207a - f;
        circleProgressButton.f6207a = f2;
        return f2;
    }

    public CircleProgressButton(Context context) {
        this(context, null);
    }

    public CircleProgressButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleProgressButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = 10;
        this.m = new e(this);
        this.t = getResources().getDimensionPixelOffset(R.dimen.hw_sport_control_button_width);
        this.l = BitmapFactory.decodeResource(getResources(), R.drawable.track_ic_health_sporting_stop_normal);
        this.s = BitmapFactory.decodeResource(getResources(), R.drawable.track_ic_health_sporting_stop_pressed);
        float dimension = getResources().getDimension(R.dimen.hw_sport_control_button_padding);
        Paint paint = new Paint(1);
        this.o = paint;
        float f = dimension / 2.0f;
        paint.setColor(Color.parseColor("#F3301E"));
        this.o.setStyle(Paint.Style.STROKE);
        this.o.setStrokeWidth(f);
        this.o.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint(1);
        this.f6209c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f6209c.setStrokeWidth(f);
        this.f6209c.setStrokeCap(Paint.Cap.ROUND);
        this.f6209c.setColor(Color.parseColor("#33F3301E"));
        this.f6208b = new Paint(1);
        this.e = f / 2.0f;
        float f2 = f * 2.0f;
        int i2 = (int) ((this.t - f2) - f2);
        int width = this.l.getWidth();
        if (width == 0) {
            LogUtil.j("Track_CircleProgressButton", "width == 0");
            return;
        }
        int width2 = ((int) ((this.l.getWidth() - f2) - f2)) / 2;
        float f3 = this.e;
        float f4 = (-width2) - f3;
        float f5 = width2 + f3;
        this.p = new RectF(f4, f4, f5, f5);
        float f6 = i2 / width;
        Matrix matrix = new Matrix();
        this.n = matrix;
        matrix.setTranslate((-this.l.getWidth()) / 2.0f, (-this.l.getHeight()) / 2.0f);
        this.n.postScale(f6, f6);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.t;
        setMeasuredDimension(i3, i3);
    }

    static class e extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<CircleProgressButton> f6210b;

        e(CircleProgressButton circleProgressButton) {
            this.f6210b = new WeakReference<>(circleProgressButton);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.e("Track_CircleProgressButton", "msg is null!");
                return;
            }
            super.handleMessage(message);
            CircleProgressButton circleProgressButton = this.f6210b.get();
            if (circleProgressButton == null) {
                LogUtil.a("Track_CircleProgressButton", "LongPressHandler weakReference is null");
            } else {
                a(message.what, circleProgressButton);
            }
        }

        private void a(int i, CircleProgressButton circleProgressButton) {
            if (i == 0) {
                circleProgressButton.g = circleProgressButton.r == 360.0f;
                if (circleProgressButton.g) {
                    if (circleProgressButton.d != null) {
                        circleProgressButton.d.onFinished();
                        circleProgressButton.r = 0.0f;
                    }
                    removeMessages(0);
                    return;
                }
                CircleProgressButton.c(circleProgressButton, circleProgressButton.f);
                circleProgressButton.invalidate();
                sendEmptyMessageDelayed(0, 1L);
                return;
            }
            if (i == 1) {
                circleProgressButton.j = circleProgressButton.r == 0.0f;
                if (!circleProgressButton.j) {
                    CircleProgressButton.b(circleProgressButton, circleProgressButton.f);
                    circleProgressButton.invalidate();
                    sendEmptyMessageDelayed(1, 1L);
                    return;
                }
                removeMessages(1);
                return;
            }
            if (i == 2) {
                circleProgressButton.i = circleProgressButton.e - circleProgressButton.f6207a <= 0.0f;
                if (!circleProgressButton.i) {
                    CircleProgressButton.a(circleProgressButton, 0.5f);
                    circleProgressButton.invalidate();
                    sendEmptyMessageDelayed(2, 1L);
                    return;
                }
                removeMessages(2);
                return;
            }
            if (i != 3) {
                return;
            }
            circleProgressButton.h = circleProgressButton.f6207a <= 0.0f;
            if (!circleProgressButton.h) {
                CircleProgressButton.d(circleProgressButton, 0.5f);
                circleProgressButton.invalidate();
                sendEmptyMessageDelayed(3, 1L);
                return;
            }
            removeMessages(3);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.k) {
            return true;
        }
        if (motionEvent == null) {
            LogUtil.e("Track_CircleProgressButton", "event is null");
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.g) {
                this.r = 0.0f;
            }
            if (!this.h) {
                this.m.sendEmptyMessage(3);
            }
            this.m.sendEmptyMessage(2);
            if (!this.j) {
                this.m.removeMessages(1);
            }
            CircleProcessListener circleProcessListener = this.d;
            if (circleProcessListener != null) {
                circleProcessListener.onStarted();
            }
            this.m.sendEmptyMessage(0);
        } else if (action == 1 || action == 3) {
            if (!this.i) {
                this.m.sendEmptyMessage(2);
            }
            this.m.sendEmptyMessage(3);
            if (!this.g) {
                CircleProcessListener circleProcessListener2 = this.d;
                if (circleProcessListener2 != null) {
                    circleProcessListener2.onCancel();
                }
                this.m.sendEmptyMessage(1);
            }
            this.m.removeMessages(0);
        }
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            LogUtil.j("Track_CircleProgressButton", "canvas is null");
            return;
        }
        super.onDraw(canvas);
        float f = this.t / 2.0f;
        canvas.translate(f, f);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        if (this.f6207a == 0.0f && this.r == 0.0f) {
            canvas.drawBitmap(this.l, this.n, this.f6208b);
        } else {
            canvas.drawBitmap(this.s, this.n, this.f6208b);
        }
        if (this.r != 0.0f) {
            canvas.drawArc(this.p, 0.0f, 360.0f, false, this.f6209c);
            canvas.drawArc(this.p, -90.0f, this.r, false, this.o);
        }
    }

    public void d(CircleProcessListener circleProcessListener) {
        if (circleProcessListener == null) {
            return;
        }
        this.d = circleProcessListener;
    }

    public void setProgressZero() {
        this.r = 0.0f;
        invalidate();
    }

    public void d(boolean z) {
        this.k = z;
    }
}
