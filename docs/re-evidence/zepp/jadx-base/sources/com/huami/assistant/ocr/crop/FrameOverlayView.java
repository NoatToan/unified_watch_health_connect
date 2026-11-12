package com.huami.assistant.ocr.crop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.huami.watch.util.DensityUtil;

/* JADX INFO: loaded from: classes5.dex */
public class FrameOverlayView extends View {
    private static final int n = 1;
    private static final int o = 2;
    private static final int p = 3;
    private static final int q = 4;
    public int a;
    public int b;
    public int c;
    private int d;
    private int e;
    private Paint f;
    private Paint g;
    private GestureDetector h;
    private RectF i;
    private RectF j;
    private GestureDetector.SimpleOnGestureListener k;
    private b l;
    private int m;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            FrameOverlayView.this.j(distanceX, distanceY);
            return true;
        }
    }

    public interface b {
        void a(RectF newFrame);
    }

    public FrameOverlayView(Context context) {
        super(context);
        this.a = 20;
        this.b = 100;
        this.c = 6;
        this.d = -1;
        this.e = Color.argb(180, 0, 0, 0);
        this.f = new Paint(1);
        this.g = new Paint(1);
        this.i = new RectF();
        this.j = new RectF();
        this.k = new a();
        this.m = 0;
        setLayerType(1, null);
        this.f.setColor(Color.parseColor("#3c9eff"));
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setStrokeWidth(6.0f);
        this.g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        f();
    }

    private void b(Canvas canvas) {
        Paint paint = new Paint(1);
        paint.setColor(Color.parseColor("#3c9eff"));
        paint.setStyle(Paint.Style.FILL);
        RectF rectF = this.j;
        float f = rectF.left;
        float f2 = rectF.top;
        int i = this.b;
        canvas.drawRect(f, f2, i + f, f2 + i, paint);
        RectF rectF2 = this.j;
        float f3 = rectF2.right;
        int i2 = this.b;
        float f4 = rectF2.top;
        canvas.drawRect(f3 - i2, f4 + i2, f3, f4, paint);
        RectF rectF3 = this.j;
        float f5 = rectF3.right;
        int i3 = this.b;
        float f6 = rectF3.bottom;
        canvas.drawRect(f5 - i3, f6 - i3, f5, f6, paint);
        RectF rectF4 = this.j;
        float f7 = rectF4.left;
        float f8 = rectF4.bottom;
        int i4 = this.b;
        canvas.drawRect(f7, f8, i4 + f7, f8 - i4, paint);
    }

    private void c(Canvas canvas) {
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        RectF rectF = this.j;
        float f = rectF.right;
        float f2 = rectF.left;
        float f3 = (f - f2) / 3.0f;
        float f4 = rectF.bottom;
        float f5 = rectF.top;
        float f6 = (f4 - f5) / 3.0f;
        canvas.drawLine(f2 + f3, f5, f2 + f3, f4, paint);
        RectF rectF2 = this.j;
        float f7 = rectF2.left;
        float f8 = f3 * 2.0f;
        canvas.drawLine(f7 + f8, rectF2.top, f7 + f8, rectF2.bottom, paint);
        RectF rectF3 = this.j;
        float f9 = rectF3.left;
        float f10 = rectF3.top;
        canvas.drawLine(f9, f10 + f6, rectF3.right, f10 + f6, paint);
        RectF rectF4 = this.j;
        float f11 = rectF4.left;
        float f12 = rectF4.top;
        float f13 = f6 * 2.0f;
        canvas.drawLine(f11, f12 + f13, rectF4.right, f12 + f13, paint);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    private boolean d(MotionEvent event) {
        int action = event.getAction();
        if (action != 0) {
            if (action == 1) {
                this.d = -1;
            } else {
                if (action == 2) {
                    return e(event);
                }
                if (action == 3) {
                    this.d = -1;
                }
            }
            return false;
        }
        float f = this.b;
        this.i.set(event.getX() - f, event.getY() - f, event.getX() + f, event.getY() + f);
        RectF rectF = this.i;
        RectF rectF2 = this.j;
        if (rectF.contains(rectF2.left, rectF2.top)) {
            this.d = 1;
            return true;
        }
        RectF rectF3 = this.i;
        RectF rectF4 = this.j;
        if (rectF3.contains(rectF4.right, rectF4.top)) {
            this.d = 2;
            return true;
        }
        RectF rectF5 = this.i;
        RectF rectF6 = this.j;
        if (rectF5.contains(rectF6.right, rectF6.bottom)) {
            this.d = 3;
            return true;
        }
        RectF rectF7 = this.i;
        RectF rectF8 = this.j;
        if (!rectF7.contains(rectF8.left, rectF8.bottom)) {
            return false;
        }
        this.d = 4;
        return true;
    }

    private boolean e(MotionEvent event) {
        int i = this.d;
        if (i == 1) {
            float x = event.getX();
            float y = event.getY();
            RectF rectF = this.j;
            i(x, y, rectF.right, rectF.bottom);
            return true;
        }
        if (i == 2) {
            i(this.j.left, event.getY(), event.getX(), this.j.bottom);
            return true;
        }
        if (i == 3) {
            RectF rectF2 = this.j;
            i(rectF2.left, rectF2.top, event.getX(), event.getY());
            return true;
        }
        if (i != 4) {
            return false;
        }
        float x2 = event.getX();
        RectF rectF3 = this.j;
        i(x2, rectF3.top, rectF3.right, event.getY());
        return true;
    }

    private void f() {
        this.h = new GestureDetector(getContext(), this.k);
        this.b = (int) DensityUtil.dpToPx(getContext(), 18.0f);
        this.c = (int) DensityUtil.dpToPx(getContext(), 3.0f);
    }

    private void g() {
        b bVar = this.l;
        if (bVar != null) {
            bVar.a(this.j);
        }
    }

    private float getMinimumFrameHeight() {
        return this.b * 2.4f;
    }

    private float getMinimumFrameWidth() {
        return this.b * 2.4f;
    }

    private void h(int w, int h) {
        int i;
        if (this.m == 1) {
            RectF rectF = this.j;
            float f = (int) (((double) w) * 0.05d);
            rectF.left = f;
            float f2 = (int) (((double) h) * 0.25d);
            rectF.top = f2;
            rectF.right = w - f;
            rectF.bottom = h - f2;
            return;
        }
        if (w < h) {
            i = (int) (((double) w) * 0.8d);
            RectF rectF2 = this.j;
            rectF2.left = (w - i) / 2;
            rectF2.top = (h - i) / 2;
        } else {
            i = (int) (((double) h) * 0.8d);
            RectF rectF3 = this.j;
            rectF3.left = (w - i) / 2;
            rectF3.top = (h - i) / 2;
        }
        RectF rectF4 = this.j;
        float f3 = i;
        rectF4.right = rectF4.left + f3;
        rectF4.bottom = rectF4.top + f3;
    }

    private void i(float left, float top, float right, float bottom) {
        if (bottom - top < getMinimumFrameHeight()) {
            RectF rectF = this.j;
            float f = rectF.top;
            bottom = rectF.bottom;
            top = f;
        }
        if (right - left < getMinimumFrameWidth()) {
            RectF rectF2 = this.j;
            float f2 = rectF2.left;
            right = rectF2.right;
            left = f2;
        }
        this.j.set(Math.max(this.a, left), Math.max(this.a, top), Math.min(getWidth() - this.a, right), Math.min(getHeight() - this.a, bottom));
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(float x, float y) {
        if (x > 0.0f) {
            float f = this.j.left;
            float f2 = f - x;
            int i = this.a;
            if (f2 < i) {
                x = f - i;
            }
        } else if (this.j.right - x > getWidth() - this.a) {
            x = (this.j.right - getWidth()) + this.a;
        }
        if (y > 0.0f) {
            float f3 = this.j.top;
            float f4 = f3 - y;
            int i2 = this.a;
            if (f4 < i2) {
                y = f3 - i2;
            }
        } else if (this.j.bottom - y > getHeight() - this.a) {
            y = (this.j.bottom - getHeight()) + this.a;
        }
        this.j.offset(-x, -y);
        invalidate();
    }

    public Rect getFrameRect() {
        Rect rect = new Rect();
        RectF rectF = this.j;
        rect.left = (int) rectF.left;
        rect.top = (int) rectF.top;
        rect.right = (int) rectF.right;
        rect.bottom = (int) rectF.bottom;
        return rect;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.e);
        this.f.setStrokeWidth(DensityUtil.dpToPx(getContext(), 1.0f));
        canvas.drawRect(this.j, this.f);
        canvas.drawRect(this.j, this.g);
        b(canvas);
        c(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        h(w, h);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        boolean zD = d(event);
        RectF rectF = this.j;
        RectF rectF2 = new RectF(rectF.left - 60.0f, rectF.top - 60.0f, rectF.right + 60.0f, rectF.bottom + 60.0f);
        if (zD || !rectF2.contains(event.getX(), event.getY())) {
            return zD;
        }
        this.h.onTouchEvent(event);
        return true;
    }

    public void setOnFrameChangeListener(b onFrameChangeListener) {
        this.l = onFrameChangeListener;
    }

    public void setTypeWide() {
        this.m = 1;
    }

    public FrameOverlayView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.a = 20;
        this.b = 100;
        this.c = 6;
        this.d = -1;
        this.e = Color.argb(180, 0, 0, 0);
        this.f = new Paint(1);
        this.g = new Paint(1);
        this.i = new RectF();
        this.j = new RectF();
        this.k = new a();
        this.m = 0;
        setLayerType(1, null);
        this.f.setColor(Color.parseColor("#3c9eff"));
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setStrokeWidth(6.0f);
        this.g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        f();
    }

    public FrameOverlayView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.a = 20;
        this.b = 100;
        this.c = 6;
        this.d = -1;
        this.e = Color.argb(180, 0, 0, 0);
        this.f = new Paint(1);
        this.g = new Paint(1);
        this.i = new RectF();
        this.j = new RectF();
        this.k = new a();
        this.m = 0;
        setLayerType(1, null);
        this.f.setColor(Color.parseColor("#3c9eff"));
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setStrokeWidth(6.0f);
        this.g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        f();
    }
}
