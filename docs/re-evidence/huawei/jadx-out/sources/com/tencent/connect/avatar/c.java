package com.tencent.connect.avatar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes46.dex */
public class c extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f30916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Matrix f30918c;
    private Matrix d;
    private int e;
    private float f;
    private float g;
    private Bitmap h;
    private boolean i;
    private float j;
    private float k;
    private PointF l;
    private PointF m;
    private float n;
    private float o;
    private Rect p;

    private void a() {
    }

    public c(Context context) {
        super(context);
        this.f30918c = new Matrix();
        this.d = new Matrix();
        this.e = 0;
        this.f = 1.0f;
        this.g = 1.0f;
        this.i = false;
        this.f30916a = "TouchView";
        this.l = new PointF();
        this.m = new PointF();
        this.n = 1.0f;
        this.o = 0.0f;
        this.f30917b = false;
        Rect rect = new Rect();
        this.p = rect;
        getDrawingRect(rect);
        a();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.h = bitmap;
        if (bitmap != null) {
            this.h = bitmap;
        }
    }

    private float a(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return 0.0f;
        }
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public void a(Rect rect) {
        this.p = rect;
        if (this.h != null) {
            c();
        }
    }

    private void a(PointF pointF) {
        if (this.h == null) {
            return;
        }
        float[] fArr = new float[9];
        this.f30918c.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[5];
        float f3 = fArr[0];
        float width = this.h.getWidth();
        float height = this.h.getHeight();
        float f4 = this.p.left - f;
        if (f4 <= 1.0f) {
            f4 = 1.0f;
        }
        float f5 = (f + (width * f3)) - this.p.right;
        if (f5 <= 1.0f) {
            f5 = 1.0f;
        }
        float fWidth = (this.p.width() * f4) / (f5 + f4);
        float f6 = this.p.left;
        float f7 = this.p.top - f2;
        float f8 = (f2 + (height * f3)) - this.p.bottom;
        if (f7 <= 1.0f) {
            f7 = 1.0f;
        }
        pointF.set(fWidth + f6, ((this.p.height() * f7) / ((f8 > 1.0f ? f8 : 1.0f) + f7)) + this.p.top);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.i) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f30918c.set(getImageMatrix());
            this.d.set(this.f30918c);
            this.l.set(motionEvent.getX(), motionEvent.getY());
            this.e = 1;
        } else if (action == 1) {
            b();
            this.e = 0;
        } else if (action == 2) {
            int i = this.e;
            if (i == 1) {
                this.f30918c.set(this.d);
                this.f30918c.postTranslate(motionEvent.getX() - this.l.x, motionEvent.getY() - this.l.y);
                setImageMatrix(this.f30918c);
            } else if (i == 2) {
                Matrix matrix = this.f30918c;
                matrix.set(matrix);
                float fA = a(motionEvent);
                if (fA > 10.0f) {
                    this.f30918c.set(this.d);
                    float f = fA / this.n;
                    this.f30918c.postScale(f, f, this.m.x, this.m.y);
                }
                setImageMatrix(this.f30918c);
            }
        } else if (action == 5) {
            float fA2 = a(motionEvent);
            this.n = fA2;
            if (fA2 > 10.0f) {
                this.d.set(this.f30918c);
                a(this.m);
                this.e = 2;
            }
        } else if (action == 6) {
            b();
            this.e = 0;
        }
        this.f30917b = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Animation translateAnimation;
        if (this.h == null) {
            return;
        }
        float fWidth = this.p.width();
        float fHeight = this.p.height();
        float[] fArr = new float[9];
        this.f30918c.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[5];
        boolean z = false;
        float f3 = fArr[0];
        float f4 = this.f;
        if (f3 > f4) {
            float f5 = f4 / f3;
            this.o = f5;
            this.f30918c.postScale(f5, f5, this.m.x, this.m.y);
            setImageMatrix(this.f30918c);
            float f6 = 1.0f / this.o;
            translateAnimation = new ScaleAnimation(f6, 1.0f, f6, 1.0f, this.m.x, this.m.y);
        } else {
            float f7 = this.g;
            if (f3 < f7) {
                float f8 = f7 / f3;
                this.o = f8;
                this.f30918c.postScale(f8, f8, this.m.x, this.m.y);
                float f9 = this.o;
                translateAnimation = new ScaleAnimation(1.0f, f9, 1.0f, f9, this.m.x, this.m.y);
            } else {
                float width = this.h.getWidth() * f3;
                float height = this.h.getHeight() * f3;
                float f10 = this.p.left - f;
                float f11 = this.p.top - f2;
                if (f10 < 0.0f) {
                    f = this.p.left;
                    z = true;
                }
                if (f11 < 0.0f) {
                    f2 = this.p.top;
                    z = true;
                }
                if (width - f10 < fWidth) {
                    f = this.p.left - (width - fWidth);
                    z = true;
                }
                if (height - f11 < fHeight) {
                    f2 = this.p.top - (height - fHeight);
                    z = true;
                }
                if (z) {
                    float f12 = fArr[2];
                    float f13 = fArr[5];
                    fArr[2] = f;
                    fArr[5] = f2;
                    this.f30918c.setValues(fArr);
                    setImageMatrix(this.f30918c);
                    translateAnimation = new TranslateAnimation(f12 - f, 0.0f, f13 - f2, 0.0f);
                } else {
                    setImageMatrix(this.f30918c);
                    translateAnimation = null;
                }
            }
        }
        if (translateAnimation != null) {
            this.i = true;
            translateAnimation.setDuration(300L);
            startAnimation(translateAnimation);
            new Thread(new Runnable() { // from class: com.tencent.connect.avatar.c.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Thread.sleep(300L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    c.this.post(new Runnable() { // from class: com.tencent.connect.avatar.c.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            c.this.clearAnimation();
                            c.this.b();
                        }
                    });
                    c.this.i = false;
                }
            }).start();
        }
    }

    private void c() {
        if (this.h == null) {
            return;
        }
        float[] fArr = {fMax, 0.0f, this.j, 0.0f, fMax, height, 0.0f, 0.0f, 0.0f};
        this.f30918c.getValues(fArr);
        float fMax = Math.max(this.p.width() / this.h.getWidth(), this.p.height() / this.h.getHeight());
        this.j = this.p.left - (((this.h.getWidth() * fMax) - this.p.width()) / 2.0f);
        float height = this.p.top - (((this.h.getHeight() * fMax) - this.p.height()) / 2.0f);
        this.k = height;
        this.f30918c.setValues(fArr);
        float fMin = Math.min(2048.0f / this.h.getWidth(), 2048.0f / this.h.getHeight());
        this.f = fMin;
        this.g = fMax;
        if (fMin < fMax) {
            this.f = fMax;
        }
        setImageMatrix(this.f30918c);
    }
}
