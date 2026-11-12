package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes4.dex */
public class wuh implements View.OnTouchListener, View.OnLayoutChangeListener {
    public static float A = 1.0f;
    public static int B = 200;
    public static float y = 3.0f;
    public static float z = 1.75f;
    public ImageView h;
    public GestureDetector i;
    public rd5 j;
    public View.OnClickListener p;
    public View.OnLongClickListener q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f38367r;
    public float u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Interpolator f38364a = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38365b = B;
    public float c = A;
    public float d = z;
    public float e = y;
    public boolean f = true;
    public boolean g = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Matrix f38366k = new Matrix();
    public final Matrix l = new Matrix();
    public final Matrix m = new Matrix();
    public final RectF n = new RectF();
    public final float[] o = new float[9];
    public int s = 2;
    public int t = 2;
    public boolean v = true;
    public ImageView.ScaleType w = ImageView.ScaleType.FIT_CENTER;
    public k8h x = new a();

    public class a implements k8h {
        public a() {
        }

        @Override // defpackage.k8h
        public void a(float f, float f2, float f3, float f4) {
            wuh wuhVar = wuh.this;
            wuhVar.f38367r = wuhVar.new f(wuhVar.h.getContext());
            f fVar = wuh.this.f38367r;
            wuh wuhVar2 = wuh.this;
            int iG = wuhVar2.G(wuhVar2.h);
            wuh wuhVar3 = wuh.this;
            fVar.b(iG, wuhVar3.F(wuhVar3.h), (int) f3, (int) f4);
            wuh.this.h.post(wuh.this.f38367r);
        }

        @Override // defpackage.k8h
        public void b(float f, float f2) {
            if (wuh.this.j.e()) {
                return;
            }
            wuh.b(wuh.this);
            wuh.this.m.postTranslate(f, f2);
            wuh.this.z();
            ViewParent parent = wuh.this.h.getParent();
            if (!wuh.this.f || wuh.this.j.e() || wuh.this.g) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if ((wuh.this.s == 2 || ((wuh.this.s == 0 && f >= 1.0f) || ((wuh.this.s == 1 && f <= -1.0f) || ((wuh.this.t == 0 && f2 >= 1.0f) || (wuh.this.t == 1 && f2 <= -1.0f))))) && parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }

        @Override // defpackage.k8h
        public void c(float f, float f2, float f3) {
            if (wuh.this.K() < wuh.this.e || f < 1.0f) {
                wuh.f(wuh.this);
                wuh.this.m.postScale(f, f, f2, f3);
                wuh.this.z();
            }
        }
    }

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            wuh.h(wuh.this);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (wuh.this.q != null) {
                wuh.this.q.onLongClick(wuh.this.h);
            }
        }
    }

    public class c implements GestureDetector.OnDoubleTapListener {
        public c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float fK = wuh.this.K();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (fK < wuh.this.I()) {
                    wuh wuhVar = wuh.this;
                    wuhVar.W(wuhVar.I(), x, y, true);
                } else if (fK < wuh.this.I() || fK >= wuh.this.H()) {
                    wuh wuhVar2 = wuh.this;
                    wuhVar2.W(wuhVar2.J(), x, y, true);
                } else {
                    wuh wuhVar3 = wuh.this;
                    wuhVar3.W(wuhVar3.H(), x, y, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (wuh.this.p != null) {
                wuh.this.p.onClick(wuh.this.h);
            }
            RectF rectFB = wuh.this.B();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            wuh.j(wuh.this);
            if (rectFB == null) {
                return false;
            }
            if (!rectFB.contains(x, y)) {
                wuh.m(wuh.this);
                return false;
            }
            rectFB.width();
            rectFB.height();
            wuh.l(wuh.this);
            return true;
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38371a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f38371a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38371a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38371a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38371a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f38372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f38373b;
        public final long c = System.currentTimeMillis();
        public final float d;
        public final float e;

        public e(float f, float f2, float f3, float f4) {
            this.f38372a = f3;
            this.f38373b = f4;
            this.d = f;
            this.e = f2;
        }

        public final float a() {
            return wuh.this.f38364a.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.c) * 1.0f) / wuh.this.f38365b));
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = a();
            float f = this.d;
            wuh.this.x.c((f + ((this.e - f) * fA)) / wuh.this.K(), this.f38372a, this.f38373b);
            if (fA < 1.0f) {
                v94.a(wuh.this.h, this);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OverScroller f38374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38375b;
        public int c;

        public f(Context context) {
            this.f38374a = new OverScroller(context);
        }

        public void a() {
            this.f38374a.forceFinished(true);
        }

        public void b(int i, int i2, int i3, int i4) {
            int i5;
            int iRound;
            int i6;
            int iRound2;
            RectF rectFB = wuh.this.B();
            if (rectFB == null) {
                return;
            }
            int iRound3 = Math.round(-rectFB.left);
            float f = i;
            if (f < rectFB.width()) {
                iRound = Math.round(rectFB.width() - f);
                i5 = 0;
            } else {
                i5 = iRound3;
                iRound = i5;
            }
            int iRound4 = Math.round(-rectFB.top);
            float f2 = i2;
            if (f2 < rectFB.height()) {
                iRound2 = Math.round(rectFB.height() - f2);
                i6 = 0;
            } else {
                i6 = iRound4;
                iRound2 = i6;
            }
            this.f38375b = iRound3;
            this.c = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f38374a.fling(iRound3, iRound4, i3, i4, i5, iRound, i6, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f38374a.isFinished() && this.f38374a.computeScrollOffset()) {
                int currX = this.f38374a.getCurrX();
                int currY = this.f38374a.getCurrY();
                wuh.this.m.postTranslate(this.f38375b - currX, this.c - currY);
                wuh.this.z();
                this.f38375b = currX;
                this.c = currY;
                v94.a(wuh.this.h, this);
            }
        }
    }

    public wuh(ImageView imageView) {
        this.h = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.u = 0.0f;
        this.j = new rd5(imageView.getContext(), this.x);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
        this.i = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
    }

    public static /* synthetic */ iah b(wuh wuhVar) {
        wuhVar.getClass();
        return null;
    }

    public static /* synthetic */ p9h f(wuh wuhVar) {
        wuhVar.getClass();
        return null;
    }

    public static /* synthetic */ u9h h(wuh wuhVar) {
        wuhVar.getClass();
        return null;
    }

    public static /* synthetic */ jah j(wuh wuhVar) {
        wuhVar.getClass();
        return null;
    }

    public static /* synthetic */ j9h l(wuh wuhVar) {
        wuhVar.getClass();
        return null;
    }

    public static /* synthetic */ i9h m(wuh wuhVar) {
        wuhVar.getClass();
        return null;
    }

    public final boolean A() {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        RectF rectFC = C(D());
        if (rectFC == null) {
            return false;
        }
        float fHeight = rectFC.height();
        float fWidth = rectFC.width();
        float F = F(this.h);
        float f7 = 0.0f;
        if (fHeight <= F) {
            int i = d.f38371a[this.w.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    f5 = (F - fHeight) / 2.0f;
                    f6 = rectFC.top;
                } else {
                    f5 = F - fHeight;
                    f6 = rectFC.top;
                }
                f2 = f5 - f6;
            } else {
                f2 = -rectFC.top;
            }
            this.t = 2;
        } else {
            float f8 = rectFC.top;
            if (f8 > 0.0f) {
                this.t = 0;
                f2 = -f8;
            } else {
                float f9 = rectFC.bottom;
                if (f9 < F) {
                    this.t = 1;
                    f2 = F - f9;
                } else {
                    this.t = -1;
                    f2 = 0.0f;
                }
            }
        }
        float fG = G(this.h);
        if (fWidth <= fG) {
            int i2 = d.f38371a[this.w.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f3 = (fG - fWidth) / 2.0f;
                    f4 = rectFC.left;
                } else {
                    f3 = fG - fWidth;
                    f4 = rectFC.left;
                }
                f7 = f3 - f4;
            } else {
                f7 = -rectFC.left;
            }
            this.s = 2;
        } else {
            float f10 = rectFC.left;
            if (f10 > 0.0f) {
                this.s = 0;
                f7 = -f10;
            } else {
                float f11 = rectFC.right;
                if (f11 < fG) {
                    f7 = fG - f11;
                    this.s = 1;
                } else {
                    this.s = -1;
                }
            }
        }
        this.m.postTranslate(f7, f2);
        return true;
    }

    public RectF B() {
        A();
        return C(D());
    }

    public final RectF C(Matrix matrix) {
        Drawable drawable = this.h.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.n.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.n);
        return this.n;
    }

    public final Matrix D() {
        this.l.set(this.f38366k);
        this.l.postConcat(this.m);
        return this.l;
    }

    public Matrix E() {
        return this.l;
    }

    public final int F(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    public final int G(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    public float H() {
        return this.e;
    }

    public float I() {
        return this.d;
    }

    public float J() {
        return this.c;
    }

    public float K() {
        return (float) Math.sqrt(((float) Math.pow(M(this.m, 0), 2.0d)) + ((float) Math.pow(M(this.m, 3), 2.0d)));
    }

    public ImageView.ScaleType L() {
        return this.w;
    }

    public final float M(Matrix matrix, int i) {
        matrix.getValues(this.o);
        return this.o[i];
    }

    public final void N() {
        this.m.reset();
        T(this.u);
        P(D());
        A();
    }

    public void O(boolean z2) {
        this.f = z2;
    }

    public final void P(Matrix matrix) {
        this.h.setImageMatrix(matrix);
    }

    public void Q(float f2) {
        vlq.a(this.c, this.d, f2);
        this.e = f2;
    }

    public void R(float f2) {
        vlq.a(this.c, f2, this.e);
        this.d = f2;
    }

    public void S(float f2) {
        vlq.a(f2, this.d, this.e);
        this.c = f2;
    }

    public void T(float f2) {
        this.m.postRotate(f2 % 360.0f);
        z();
    }

    public void U(float f2) {
        this.m.setRotate(f2 % 360.0f);
        z();
    }

    public void V(float f2) {
        X(f2, false);
    }

    public void W(float f2, float f3, float f4, boolean z2) {
        if (f2 < this.c || f2 > this.e) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z2) {
            this.h.post(new e(K(), f2, f3, f4));
        } else {
            this.m.setScale(f2, f2, f3, f4);
            z();
        }
    }

    public void X(float f2, boolean z2) {
        W(f2, this.h.getRight() / 2, this.h.getBottom() / 2, z2);
    }

    public void Y(ImageView.ScaleType scaleType) {
        if (!vlq.d(scaleType) || scaleType == this.w) {
            return;
        }
        this.w = scaleType;
        b0();
    }

    public void Z(int i) {
        this.f38365b = i;
    }

    public void a0(boolean z2) {
        this.v = z2;
        b0();
    }

    public void b0() {
        if (this.v) {
            c0(this.h.getDrawable());
        } else {
            N();
        }
    }

    public final void c0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float fG = G(this.h);
        float F = F(this.h);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f38366k.reset();
        float f2 = intrinsicWidth;
        float f3 = fG / f2;
        float f4 = intrinsicHeight;
        float f5 = F / f4;
        ImageView.ScaleType scaleType = this.w;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f38366k.postTranslate((fG - f2) / 2.0f, (F - f4) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f3, f5);
            this.f38366k.postScale(fMax, fMax);
            this.f38366k.postTranslate((fG - (f2 * fMax)) / 2.0f, (F - (f4 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f3, f5));
            this.f38366k.postScale(fMin, fMin);
            this.f38366k.postTranslate((fG - (f2 * fMin)) / 2.0f, (F - (f4 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f2, f4);
            RectF rectF2 = new RectF(0.0f, 0.0f, fG, F);
            if (((int) this.u) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f4, f2);
            }
            int i = d.f38371a[this.w.ordinal()];
            if (i == 1) {
                this.f38366k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 2) {
                this.f38366k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                this.f38366k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                this.f38366k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        N();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        c0(this.h.getDrawable());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        rd5 rd5Var;
        boolean z3;
        GestureDetector gestureDetector;
        boolean zE;
        boolean zD;
        boolean z4;
        boolean z5;
        RectF rectFB;
        boolean z6 = false;
        if (!this.v || !vlq.c((ImageView) view)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                if (K() < this.c) {
                    RectF rectFB2 = B();
                    if (rectFB2 != null) {
                        view.post(new e(K(), this.c, rectFB2.centerX(), rectFB2.centerY()));
                        z2 = true;
                    }
                } else if (K() > this.e && (rectFB = B()) != null) {
                    view.post(new e(K(), this.e, rectFB.centerX(), rectFB.centerY()));
                    z2 = true;
                }
            }
            rd5Var = this.j;
            if (rd5Var != null) {
                zE = rd5Var.e();
                zD = this.j.d();
                boolean zF = this.j.f(motionEvent);
                if (!zE || this.j.e()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!zD || this.j.d()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z4 && z5) {
                    z6 = true;
                }
                this.g = z6;
                z3 = zF;
            } else {
                z3 = z2;
            }
            gestureDetector = this.i;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        y();
        z2 = false;
        rd5Var = this.j;
        if (rd5Var != null) {
            zE = rd5Var.e();
            zD = this.j.d();
            boolean zF2 = this.j.f(motionEvent);
            if (zE) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (zD) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (z4) {
                z6 = true;
            }
            this.g = z6;
            z3 = zF2;
        } else {
            z3 = z2;
        }
        gestureDetector = this.i;
        return gestureDetector == null ? z3 : z3;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.p = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.i.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.q = onLongClickListener;
    }

    public void setOnMatrixChangeListener(d9h d9hVar) {
    }

    public void setOnOutsidePhotoTapListener(i9h i9hVar) {
    }

    public void setOnPhotoTapListener(j9h j9hVar) {
    }

    public void setOnScaleChangeListener(p9h p9hVar) {
    }

    public void setOnSingleFlingListener(u9h u9hVar) {
    }

    public void setOnViewDragListener(iah iahVar) {
    }

    public void setOnViewTapListener(jah jahVar) {
    }

    public final void y() {
        f fVar = this.f38367r;
        if (fVar != null) {
            fVar.a();
            this.f38367r = null;
        }
    }

    public final void z() {
        if (A()) {
            P(D());
        }
    }
}
