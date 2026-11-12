package miuix.popupwidget.internal.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.c3j;
import defpackage.cii;
import defpackage.cti;
import defpackage.m5j;
import miuix.popupwidget.widget.GuidePopupWindow;

/* JADX INFO: loaded from: classes3.dex */
public class GuidePopupView extends FrameLayout implements View.OnTouchListener {
    public Animator.AnimatorListener A;
    public int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f26765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f26766b;
    public LinearLayout c;
    public LinearLayout d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public GuidePopupWindow i;
    public View.OnTouchListener j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObjectAnimator f26767k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f26768r;
    public float s;
    public float t;
    public int u;
    public int v;
    public ColorStateList w;
    public final Paint x;
    public boolean y;
    public Animator.AnimatorListener z;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f26769a;

        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f26769a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f26769a) {
                return;
            }
            GuidePopupView.this.f26767k = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f26769a = false;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f26771a;

        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f26771a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f26771a) {
                return;
            }
            GuidePopupView.this.l = false;
            GuidePopupView.this.f26767k = null;
            GuidePopupView.this.i.dismiss();
            GuidePopupView.this.setArrowMode(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f26771a = false;
            GuidePopupView.this.l = true;
        }
    }

    public GuidePopupView(Context context) {
        this(context, null);
    }

    private int getMirroredMode() {
        int i = this.B;
        if (i == -1) {
            return -1;
        }
        return i % 2 == 0 ? i + 1 : i - 1;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    public final void d() {
        int i;
        int width = getWidth();
        int height = getHeight();
        int i2 = this.o;
        int i3 = this.q;
        int i4 = this.n;
        int i5 = this.p;
        int[] iArr = {i2, (height - i2) - i3, i4, (width - i4) - i5};
        int i6 = i4 + (i5 / 2);
        int i7 = i2 + (i3 / 2);
        int i8 = 0;
        int i9 = Integer.MIN_VALUE;
        int i10 = 0;
        while (true) {
            i = 4;
            if (i8 >= 4) {
                i8 = i10;
                break;
            }
            int i11 = iArr[i8];
            if (i11 >= this.m) {
                break;
            }
            if (i11 > i9) {
                i10 = i8;
                i9 = i11;
            }
            i8++;
        }
        if (i8 == 0) {
            float f = i6;
            float f2 = this.t;
            if (f < f2) {
                i = 7;
            } else if (width - i6 < f2) {
                i = 5;
            } else {
                i = i8;
            }
        } else if (i8 != 1) {
            if (i8 == 2) {
                float f3 = i7;
                float f4 = this.t;
                if (f3 < f4) {
                    i = 6;
                } else if (height - i7 < f4) {
                    i = 5;
                }
            } else if (i8 == 3) {
                float f5 = i7;
                float f6 = this.t;
                if (f5 >= f6) {
                    if (height - i7 < f6) {
                        i = 7;
                    }
                }
            }
            i = i8;
        } else {
            float f7 = i6;
            float f8 = this.t;
            if (f7 >= f8) {
                if (width - i6 < f8) {
                    i = 6;
                } else {
                    i = i8;
                }
            }
        }
        setArrowMode(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.save();
        canvas.translate(this.n, this.o);
        this.f26766b.setDrawingCacheEnabled(true);
        this.f26766b.buildDrawingCache();
        canvas.drawBitmap(this.f26766b.getDrawingCache(), 0.0f, 0.0f, (Paint) null);
        this.f26766b.setDrawingCacheEnabled(false);
        canvas.restore();
        g(canvas, this.B, this.e, this.f);
        if (this.y) {
            g(canvas, getMirroredMode(), -this.e, -this.f);
        }
    }

    public final void e() {
        f();
        h(this.B, this.c, this.e, this.f);
        if (this.y) {
            h(getMirroredMode(), this.d, -this.e, -this.f);
        }
    }

    public final void f() {
        if (!this.g) {
            this.h = 0;
            return;
        }
        int i = this.p / 2;
        int i2 = this.q / 2;
        int iSqrt = (int) Math.sqrt(Math.pow(i, 2.0d) + Math.pow(i2, 2.0d));
        int i3 = this.B;
        if (i3 == 0 || i3 == 1) {
            this.h = i2;
        } else if (i3 == 2 || i3 == 3) {
            this.h = i;
        } else {
            this.h = iSqrt;
        }
    }

    public final void g(Canvas canvas, int i, int i2, int i3) {
        float f;
        this.x.setAntiAlias(true);
        this.x.setStyle(Paint.Style.FILL);
        float f2 = this.n + (this.p / 2) + i2;
        float f3 = this.o + (this.q / 2) + i3;
        switch (i) {
            case 0:
                f = 180.0f;
                break;
            case 1:
            default:
                f = 0.0f;
                break;
            case 2:
                f = 90.0f;
                break;
            case 3:
                f = -90.0f;
                break;
            case 4:
                f = -45.0f;
                break;
            case 5:
                f = 135.0f;
                break;
            case 6:
                f = 45.0f;
                break;
            case 7:
                f = -135.0f;
                break;
        }
        canvas.save();
        canvas.rotate(f, f2, f3);
        canvas.translate(0.0f, this.h);
        int iSave = canvas.save();
        canvas.clipRect(f2 - 2.0f, f3, f2 + 2.0f, f3 + this.f26768r, Region.Op.DIFFERENCE);
        canvas.drawCircle(f2, f3, this.f26768r, this.x);
        canvas.restoreToCount(iSave);
        Paint paint = this.x;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.x.setStrokeWidth(4.0f);
        canvas.drawLine(f2, f3, f2, f3 + this.s, this.x);
        float f4 = f3 + this.s + this.t;
        this.x.setStyle(style);
        this.x.setStrokeWidth(4.0f);
        canvas.drawCircle(f2, f4, this.t, this.x);
        canvas.restore();
    }

    public int getArrowMode() {
        return this.B;
    }

    public int getColorBackground() {
        return this.u;
    }

    public final void h(int i, LinearLayout linearLayout, int i2, int i3) {
        int measuredWidth;
        float f;
        int measuredHeight;
        int i4;
        int measuredHeight2;
        float f2 = this.h + this.s + this.t;
        int i5 = this.n + (this.p / 2);
        int i6 = this.o + (this.q / 2);
        switch (i) {
            case 0:
            case 5:
            case 7:
                measuredWidth = i5 - (linearLayout.getMeasuredWidth() / 2);
                f = i6 - f2;
                measuredHeight = linearLayout.getMeasuredHeight() / 2;
                i4 = (int) (f - measuredHeight);
                break;
            case 1:
            case 4:
            case 6:
                measuredWidth = i5 - (linearLayout.getMeasuredWidth() / 2);
                f = i6 + f2;
                measuredHeight = linearLayout.getMeasuredHeight() / 2;
                i4 = (int) (f - measuredHeight);
                break;
            case 2:
                measuredWidth = (int) ((i5 - f2) - (linearLayout.getMeasuredWidth() / 2));
                measuredHeight2 = linearLayout.getMeasuredHeight() / 2;
                i4 = i6 - measuredHeight2;
                break;
            case 3:
                measuredWidth = (int) ((i5 + f2) - (linearLayout.getMeasuredWidth() / 2));
                measuredHeight2 = linearLayout.getMeasuredHeight() / 2;
                i4 = i6 - measuredHeight2;
                break;
            default:
                measuredWidth = 0;
                i4 = 0;
                break;
        }
        int iSin = (int) (((double) f2) * Math.sin(0.7853981633974483d));
        int i7 = (int) (f2 - iSin);
        if (i != 4) {
            if (i != 5) {
                if (i == 6) {
                    measuredWidth -= iSin;
                } else if (i == 7) {
                    measuredWidth += iSin;
                }
                int i8 = measuredWidth + i2;
                int i9 = i4 + i3;
                linearLayout.layout(i8, i9, linearLayout.getMeasuredWidth() + i8, linearLayout.getMeasuredHeight() + i9);
            }
            measuredWidth -= iSin;
            i4 += i7;
            int i10 = measuredWidth + i2;
            int i11 = i4 + i3;
            linearLayout.layout(i10, i11, linearLayout.getMeasuredWidth() + i10, linearLayout.getMeasuredHeight() + i11);
        }
        measuredWidth += iSin;
        i4 -= i7;
        int i12 = measuredWidth + i2;
        int i13 = i4 + i3;
        linearLayout.layout(i12, i13, linearLayout.getMeasuredWidth() + i12, linearLayout.getMeasuredHeight() + i13);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (LinearLayout) findViewById(cti.e);
        this.d = (LinearLayout) findViewById(cti.f14704b);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.p == 0 || this.q == 0) {
            setAnchor(this.f26766b);
        }
        this.t = (float) Math.max(Math.sqrt(Math.pow(this.c.getMeasuredWidth(), 2.0d) + Math.pow(this.c.getMeasuredHeight(), 2.0d)) / 2.0d, this.t);
        if (this.y) {
            this.t = (float) Math.max(Math.sqrt(Math.pow(this.d.getMeasuredWidth(), 2.0d) + Math.pow(this.d.getMeasuredHeight(), 2.0d)) / 2.0d, this.t);
        }
        if (this.B == -1) {
            d();
        } else {
            e();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int i = this.n;
        Rect rect = new Rect(i, this.o, this.f26766b.getWidth() + i, this.o + this.f26766b.getHeight());
        if (motionEvent.getAction() == 0 && rect.contains(x, y)) {
            this.f26766b.callOnClick();
            return true;
        }
        this.i.a(true);
        return true;
    }

    public void setAnchor(View view) {
        this.f26766b = view;
        this.p = view.getWidth();
        this.q = this.f26766b.getHeight();
        int[] iArr = new int[2];
        this.f26766b.getLocationInWindow(iArr);
        this.n = iArr[0];
        this.o = iArr[1];
    }

    public void setArrowMode(int i) {
        this.B = i;
    }

    public void setGuidePopupWindow(GuidePopupWindow guidePopupWindow) {
        this.i = guidePopupWindow;
    }

    public void setTouchInterceptor(View.OnTouchListener onTouchListener) {
        this.j = onTouchListener;
    }

    public GuidePopupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, cii.f5377b);
    }

    public GuidePopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = true;
        this.w = null;
        Paint paint = new Paint();
        this.x = paint;
        this.z = new a();
        this.A = new b();
        this.B = -1;
        this.f26765a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m5j.S, i, c3j.f4895k);
        this.f26768r = typedArrayObtainStyledAttributes.getDimension(m5j.Y, 0.0f);
        this.s = typedArrayObtainStyledAttributes.getDimension(m5j.W, 0.0f);
        this.t = typedArrayObtainStyledAttributes.getDimension(m5j.Z, 0.0f);
        this.u = typedArrayObtainStyledAttributes.getColor(m5j.T, 0);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(m5j.X, -1));
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(m5j.U, 15);
        this.w = typedArrayObtainStyledAttributes.getColorStateList(m5j.V);
        typedArrayObtainStyledAttributes.recycle();
        this.m = (int) (this.s + (this.t * 2.5f));
    }
}
