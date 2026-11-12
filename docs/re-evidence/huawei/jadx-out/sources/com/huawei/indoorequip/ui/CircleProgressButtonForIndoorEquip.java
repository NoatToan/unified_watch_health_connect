package com.huawei.indoorequip.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class CircleProgressButtonForIndoorEquip extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f17801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CircleProcessListener f17802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f17803c;
    private int d;
    private float e;
    private Bitmap f;
    private Bitmap g;
    private Bitmap h;
    private Handler i;
    private Bitmap j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private c p;
    private Paint q;
    private Bitmap r;
    private Bitmap s;
    private Matrix t;
    private int u;
    private RectF v;
    private Bitmap w;
    private Bitmap x;
    private float y;
    private int z;

    public interface CircleProcessListener {
        void onCancel();

        void onFinished();

        void onStarted();
    }

    static /* synthetic */ float d(CircleProgressButtonForIndoorEquip circleProgressButtonForIndoorEquip, double d) {
        float f = (float) (((double) circleProgressButtonForIndoorEquip.e) - d);
        circleProgressButtonForIndoorEquip.e = f;
        return f;
    }

    static /* synthetic */ float d(CircleProgressButtonForIndoorEquip circleProgressButtonForIndoorEquip, float f) {
        float f2 = circleProgressButtonForIndoorEquip.y + f;
        circleProgressButtonForIndoorEquip.y = f2;
        return f2;
    }

    static /* synthetic */ float e(CircleProgressButtonForIndoorEquip circleProgressButtonForIndoorEquip, double d) {
        float f = (float) (((double) circleProgressButtonForIndoorEquip.e) + d);
        circleProgressButtonForIndoorEquip.e = f;
        return f;
    }

    static /* synthetic */ float e(CircleProgressButtonForIndoorEquip circleProgressButtonForIndoorEquip, float f) {
        float f2 = circleProgressButtonForIndoorEquip.y - f;
        circleProgressButtonForIndoorEquip.y = f2;
        return f2;
    }

    public CircleProgressButtonForIndoorEquip(Context context) {
        this(context, null);
    }

    public CircleProgressButtonForIndoorEquip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleProgressButtonForIndoorEquip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = 0.0f;
        this.z = 0;
        this.o = false;
        this.d = 1;
        this.p = new c(this);
        this.i = new Handler(Looper.getMainLooper()) { // from class: com.huawei.indoorequip.ui.CircleProgressButtonForIndoorEquip.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message == null) {
                    return;
                }
                super.handleMessage(message);
                if (message.what != 999) {
                    return;
                }
                CircleProgressButtonForIndoorEquip.this.p.sendEmptyMessage(9);
            }
        };
        this.u = getResources().getDimensionPixelOffset(R.dimen.ie_hw_sport_control_button_width);
        this.r = BitmapFactory.decodeResource(getResources(), R.drawable.ie_track_ic_health_sporting_stop_normal);
        this.w = BitmapFactory.decodeResource(getResources(), R.drawable.ie_track_ic_health_sporting_stop_pressed);
        this.h = BitmapFactory.decodeResource(getResources(), R.drawable.ie_track_ic_health_sporting_stop_normal);
        this.g = BitmapFactory.decodeResource(getResources(), R.drawable.ie_track_ic_health_sporting_stop_normal);
        this.f = BitmapFactory.decodeResource(getResources(), R.drawable.ie_track_ic_health_sporting_stop_normal);
        this.j = BitmapFactory.decodeResource(getResources(), R.drawable.ie_track_ic_health_sporting_stop_normal);
        this.x = BitmapFactory.decodeResource(getResources(), R.drawable.ie_track_ic_health_sporting_stop_normal);
        this.s = BitmapFactory.decodeResource(getResources(), R.drawable.ie_track_ic_health_sporting_stop_normal);
        Paint paint = new Paint(1);
        this.q = paint;
        paint.setColor(Color.parseColor("#F3301E"));
        this.q.setStyle(Paint.Style.STROKE);
        float dimension = getResources().getDimension(R.dimen.ie_hw_sport_control_button_padding) / 2.0f;
        this.q.setStrokeWidth(dimension);
        this.q.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint(1);
        this.f17801a = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f17801a.setStrokeWidth(dimension);
        this.f17801a.setStrokeCap(Paint.Cap.ROUND);
        this.f17801a.setColor(Color.parseColor("#33F3301E"));
        float f = dimension / 2.0f;
        this.f17803c = f;
        float f2 = dimension * 2.0f;
        int i2 = (int) ((this.u - f2) - f2);
        int i3 = i2 / 2;
        float f3 = ((-i3) - dimension) - f;
        float f4 = i3 + dimension + f;
        this.v = new RectF(f3, f3, f4, f4);
        int width = this.r.getWidth();
        if (width == 0) {
            LogUtil.j("Track_IDEQ_CircleProgressButton", "width == 0");
            return;
        }
        float f5 = i2 / width;
        Matrix matrix = new Matrix();
        this.t = matrix;
        matrix.setTranslate((-this.r.getWidth()) / 2.0f, (-this.r.getHeight()) / 2.0f);
        this.t.postScale(f5, f5);
    }

    public int getState() {
        return this.z;
    }

    public void setState(int i) {
        this.z = i;
        this.p.sendEmptyMessage(9);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.u;
        setMeasuredDimension(i3, i3);
    }

    static class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<CircleProgressButtonForIndoorEquip> f17805a;

        c(CircleProgressButtonForIndoorEquip circleProgressButtonForIndoorEquip) {
            this.f17805a = new WeakReference<>(circleProgressButtonForIndoorEquip);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            CircleProgressButtonForIndoorEquip circleProgressButtonForIndoorEquip = this.f17805a.get();
            if (circleProgressButtonForIndoorEquip == null) {
                return;
            }
            a(message.what, circleProgressButtonForIndoorEquip);
        }

        private void a(int i, CircleProgressButtonForIndoorEquip circleProgressButtonForIndoorEquip) {
            if (i == 0) {
                circleProgressButtonForIndoorEquip.k = circleProgressButtonForIndoorEquip.y == 360.0f;
                if (circleProgressButtonForIndoorEquip.k) {
                    if (circleProgressButtonForIndoorEquip.f17802b != null) {
                        circleProgressButtonForIndoorEquip.f17802b.onFinished();
                        circleProgressButtonForIndoorEquip.y = 0.0f;
                    }
                    removeMessages(0);
                    return;
                }
                CircleProgressButtonForIndoorEquip.d(circleProgressButtonForIndoorEquip, 10.0f);
                circleProgressButtonForIndoorEquip.invalidate();
                sendEmptyMessageDelayed(0, 1L);
                return;
            }
            if (i == 1) {
                circleProgressButtonForIndoorEquip.m = circleProgressButtonForIndoorEquip.y == 0.0f;
                if (!circleProgressButtonForIndoorEquip.m) {
                    CircleProgressButtonForIndoorEquip.e(circleProgressButtonForIndoorEquip, 10.0f);
                    circleProgressButtonForIndoorEquip.invalidate();
                    sendEmptyMessageDelayed(1, 1L);
                    return;
                }
                removeMessages(1);
                return;
            }
            if (i != 2) {
                if (i == 3) {
                    e(circleProgressButtonForIndoorEquip);
                    return;
                } else {
                    if (i != 9) {
                        return;
                    }
                    circleProgressButtonForIndoorEquip.invalidate();
                    return;
                }
            }
            circleProgressButtonForIndoorEquip.n = circleProgressButtonForIndoorEquip.f17803c - circleProgressButtonForIndoorEquip.e <= 0.0f;
            if (!circleProgressButtonForIndoorEquip.n) {
                CircleProgressButtonForIndoorEquip.e(circleProgressButtonForIndoorEquip, 0.5d);
                circleProgressButtonForIndoorEquip.invalidate();
                sendEmptyMessageDelayed(2, 1L);
                return;
            }
            removeMessages(2);
        }

        private void e(CircleProgressButtonForIndoorEquip circleProgressButtonForIndoorEquip) {
            circleProgressButtonForIndoorEquip.l = circleProgressButtonForIndoorEquip.e <= 0.0f;
            if (!circleProgressButtonForIndoorEquip.l) {
                CircleProgressButtonForIndoorEquip.d(circleProgressButtonForIndoorEquip, 0.5d);
                circleProgressButtonForIndoorEquip.invalidate();
                sendEmptyMessageDelayed(3, 1L);
                return;
            }
            removeMessages(3);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CircleProcessListener circleProcessListener;
        int i;
        int action = motionEvent.getAction();
        if (this.o || (i = this.z) == 2 || i == 1 || i == 4 || i == 3 || i == 6) {
            if (action == 0 && (circleProcessListener = this.f17802b) != null) {
                circleProcessListener.onStarted();
            }
            return true;
        }
        if (action == 0) {
            if (this.k) {
                this.y = 0.0f;
            }
            if (!this.l) {
                this.p.sendEmptyMessage(3);
            }
            this.p.sendEmptyMessage(2);
            if (!this.m) {
                this.p.removeMessages(1);
            }
            CircleProcessListener circleProcessListener2 = this.f17802b;
            if (circleProcessListener2 != null) {
                circleProcessListener2.onStarted();
            }
            this.p.sendEmptyMessage(0);
        } else if (action == 1 || action == 3) {
            if (!this.n) {
                this.p.sendEmptyMessage(2);
            }
            this.p.sendEmptyMessage(3);
            if (!this.k) {
                CircleProcessListener circleProcessListener3 = this.f17802b;
                if (circleProcessListener3 != null) {
                    circleProcessListener3.onCancel();
                }
                this.p.sendEmptyMessage(1);
            }
            this.p.removeMessages(0);
        }
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        float f = this.u / 2.0f;
        canvas.translate(f, f);
        int i = this.z;
        if (i == 1) {
            this.i.removeMessages(999);
            this.i.sendEmptyMessageDelayed(999, 500L);
            int i2 = this.d;
            if (i2 == 1) {
                this.d = 2;
                canvas.drawBitmap(this.h, this.t, null);
            } else if (i2 == 2) {
                this.d = 1;
                canvas.drawBitmap(this.g, this.t, null);
            }
        } else if (i == 4) {
            this.d = 1;
            this.i.removeMessages(999);
            canvas.drawBitmap(this.f, this.t, null);
        } else if (i == 5) {
            this.d = 1;
            this.i.removeMessages(999);
            canvas.drawBitmap(this.j, this.t, null);
        } else if (i == 2) {
            this.d = 1;
            this.i.removeMessages(999);
            canvas.drawBitmap(this.x, this.t, null);
        } else if (i == 3) {
            this.d = 1;
            this.i.removeMessages(999);
            canvas.drawBitmap(this.s, this.t, null);
        } else {
            this.d = 1;
            this.i.removeMessages(999);
            if (this.e == 0.0f) {
                canvas.drawBitmap(this.r, this.t, null);
            } else {
                canvas.drawBitmap(this.w, this.t, null);
            }
        }
        if (this.y != 0.0f) {
            canvas.drawArc(this.v, 0.0f, 360.0f, false, this.f17801a);
            canvas.drawArc(this.v, -90.0f, this.y, false, this.q);
        }
    }

    public void c(CircleProcessListener circleProcessListener) {
        this.f17802b = circleProcessListener;
    }
}
