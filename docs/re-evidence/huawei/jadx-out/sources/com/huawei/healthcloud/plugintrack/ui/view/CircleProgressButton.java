package com.huawei.healthcloud.plugintrack.ui.view;

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
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class CircleProgressButton extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f11241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CircleProcessListener f11242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f11243c;
    private Paint d;
    private float e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private boolean j;
    private Bitmap k;
    private Matrix l;
    private boolean m;
    private e n;
    private Paint o;
    private float q;
    private int r;
    private Bitmap s;
    private RectF t;

    public interface CircleProcessListener {
        void onCancel();

        void onFinished();

        void onStarted();
    }

    public CircleProgressButton(Context context) {
        this(context, null);
    }

    public CircleProgressButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleProgressButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 10;
        this.n = new e(this);
        this.r = getResources().getDimensionPixelOffset(R.dimen.hw_sport_control_button_width);
        this.k = BitmapFactory.decodeResource(getResources(), R.drawable.track_ic_health_sporting_stop_normal);
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
        this.f11243c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f11243c.setStrokeWidth(f);
        this.f11243c.setStrokeCap(Paint.Cap.ROUND);
        this.f11243c.setColor(Color.parseColor("#33F3301E"));
        this.d = new Paint(1);
        this.e = f / 2.0f;
        float f2 = f * 2.0f;
        int i2 = (int) ((this.r - f2) - f2);
        int width = this.k.getWidth();
        if (width == 0) {
            LogUtil.j("Track_CircleProgressButton", "width == 0");
            return;
        }
        int width2 = ((int) ((this.k.getWidth() - f2) - f2)) / 2;
        float f3 = this.e;
        float f4 = (-width2) - f3;
        float f5 = width2 + f3;
        this.t = new RectF(f4, f4, f5, f5);
        float f6 = i2 / width;
        Matrix matrix = new Matrix();
        this.l = matrix;
        matrix.setTranslate((-this.k.getWidth()) / 2.0f, (-this.k.getHeight()) / 2.0f);
        this.l.postScale(f6, f6);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.r;
        setMeasuredDimension(i3, i3);
    }

    static class e extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<CircleProgressButton> f11244a;

        e(CircleProgressButton circleProgressButton) {
            this.f11244a = new WeakReference<>(circleProgressButton);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.e("Track_CircleProgressButton", "msg is null!");
                return;
            }
            super.handleMessage(message);
            CircleProgressButton circleProgressButton = this.f11244a.get();
            if (circleProgressButton == null) {
                LogUtil.a("Track_CircleProgressButton", "LongPressHandler weakReference is null");
            } else {
                d(message.what, circleProgressButton);
            }
        }

        private void d(int i, CircleProgressButton circleProgressButton) {
            if (i == 0) {
                circleProgressButton.j = circleProgressButton.q == 360.0f;
                if (!circleProgressButton.j) {
                    circleProgressButton.q += circleProgressButton.i;
                    circleProgressButton.invalidate();
                    sendEmptyMessageDelayed(0, 1L);
                    return;
                } else {
                    if (circleProgressButton.f11242b != null) {
                        circleProgressButton.f11242b.onFinished();
                        circleProgressButton.q = 0.0f;
                    }
                    removeMessages(0);
                    return;
                }
            }
            if (i == 1) {
                circleProgressButton.h = circleProgressButton.q == 0.0f;
                if (circleProgressButton.h) {
                    removeMessages(1);
                    return;
                }
                circleProgressButton.q -= circleProgressButton.i;
                circleProgressButton.invalidate();
                sendEmptyMessageDelayed(1, 1L);
                return;
            }
            if (i == 2) {
                circleProgressButton.f = circleProgressButton.e - circleProgressButton.f11241a <= 0.0f;
                if (circleProgressButton.f) {
                    removeMessages(2);
                    return;
                }
                circleProgressButton.f11241a += 0.5f;
                circleProgressButton.invalidate();
                sendEmptyMessageDelayed(2, 1L);
                return;
            }
            if (i != 3) {
                return;
            }
            circleProgressButton.g = circleProgressButton.f11241a <= 0.0f;
            if (circleProgressButton.g) {
                removeMessages(3);
                return;
            }
            circleProgressButton.f11241a -= 0.5f;
            circleProgressButton.invalidate();
            sendEmptyMessageDelayed(3, 1L);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.m) {
            return true;
        }
        if (motionEvent == null) {
            LogUtil.e("Track_CircleProgressButton", "event is null");
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.j) {
                this.q = 0.0f;
            }
            if (!this.g) {
                this.n.sendEmptyMessage(3);
            }
            this.n.sendEmptyMessage(2);
            if (!this.h) {
                this.n.removeMessages(1);
            }
            CircleProcessListener circleProcessListener = this.f11242b;
            if (circleProcessListener != null) {
                circleProcessListener.onStarted();
            }
            this.n.sendEmptyMessage(0);
        } else if (action == 1 || action == 3) {
            if (!this.f) {
                this.n.sendEmptyMessage(2);
            }
            this.n.sendEmptyMessage(3);
            if (!this.j) {
                CircleProcessListener circleProcessListener2 = this.f11242b;
                if (circleProcessListener2 != null) {
                    circleProcessListener2.onCancel();
                }
                this.n.sendEmptyMessage(1);
            }
            this.n.removeMessages(0);
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
        float f = this.r / 2.0f;
        canvas.translate(f, f);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        if (this.f11241a == 0.0f && this.q == 0.0f) {
            canvas.drawBitmap(this.k, this.l, this.d);
        } else {
            canvas.drawBitmap(this.s, this.l, this.d);
        }
        if (this.q != 0.0f) {
            canvas.drawArc(this.t, 0.0f, 360.0f, false, this.f11243c);
            canvas.drawArc(this.t, -90.0f, this.q, false, this.o);
        }
    }

    public void b(CircleProcessListener circleProcessListener) {
        if (circleProcessListener == null) {
            return;
        }
        this.f11242b = circleProcessListener;
    }

    public void setProgressZero() {
        this.q = 0.0f;
        invalidate();
    }

    public void d(boolean z) {
        this.m = z;
    }
}
