package com.huawei.phoneservice.feedback.media.impl.wiget.pictureview;

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

/* JADX INFO: loaded from: classes41.dex */
public class l implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f21656a;
    private View.OnClickListener aa;
    private h ab;
    private com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.j ac;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.c f21657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f21658c;
    private GestureDetector l;
    private com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.a m;
    private final ImageView o;
    private f u;
    private g v;
    private com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.e w;
    private View.OnLongClickListener x;
    private com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.d y;
    private i z;
    private boolean j = true;
    private boolean h = false;
    private int g = 200;
    private float i = 1.0f;
    private float f = 1.75f;
    private float n = 3.0f;
    private Interpolator k = new AccelerateDecelerateInterpolator();
    private final float[] r = new float[9];
    private final Matrix q = new Matrix();
    private final Matrix s = new Matrix();
    private final Matrix p = new Matrix();
    private final RectF t = new RectF();
    private boolean ad = true;
    private ImageView.ScaleType af = ImageView.ScaleType.FIT_CENTER;
    private int d = 2;
    private int e = 2;

    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.a aVar;
        GestureDetector gestureDetector;
        boolean zC;
        boolean zA;
        boolean z2;
        boolean z3;
        RectF rectFC;
        b bVar;
        boolean z4 = false;
        if (!this.ad || !n.b((ImageView) view)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            i();
        } else {
            if (action == 1 || action == 3) {
                if (j() < this.i) {
                    RectF rectFC2 = c();
                    if (rectFC2 != null) {
                        bVar = new b(j(), this.i, rectFC2.centerX(), rectFC2.centerY());
                        view.post(bVar);
                        z = true;
                    }
                } else if (j() > this.n && (rectFC = c()) != null) {
                    bVar = new b(j(), this.n, rectFC.centerX(), rectFC.centerY());
                    view.post(bVar);
                    z = true;
                }
                aVar = this.m;
                if (aVar != null) {
                    zC = aVar.c();
                    zA = this.m.a();
                    boolean zC2 = this.m.c(motionEvent);
                    if (!zC || this.m.c()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!zA || this.m.a()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z2 && z3) {
                        z4 = true;
                    }
                    this.h = z4;
                    z = zC2;
                }
                gestureDetector = this.l;
                if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                    return true;
                }
                return z;
            }
            com.huawei.phoneservice.faq.base.util.g.c("PictureViewAttaches", "MotionEvent default!!!");
        }
        z = false;
        aVar = this.m;
        if (aVar != null) {
            zC = aVar.c();
            zA = this.m.a();
            boolean zC3 = this.m.c(motionEvent);
            if (zC) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (zA) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (z2) {
                z4 = true;
            }
            this.h = z4;
            z = zC3;
        }
        gestureDetector = this.l;
        if (gestureDetector == null) {
        }
        return z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        c(this.o.getDrawable());
    }

    public void h() {
        if (this.ad) {
            c(this.o.getDrawable());
        } else {
            k();
        }
    }

    public ImageView.ScaleType g() {
        return this.af;
    }

    public final float j() {
        return (float) Math.sqrt(((float) Math.pow(a(this.q, 0), 2.0d)) + ((float) Math.pow(a(this.q, 3), 2.0d)));
    }

    public float e() {
        return this.i;
    }

    public float a() {
        return this.f;
    }

    public float b() {
        return this.n;
    }

    public void j(float f) {
        e(f, false);
    }

    public Matrix d() {
        return this.p;
    }

    public void d(float f) {
        this.q.setRotate(f % 360.0f);
        f();
    }

    public void b(float f) {
        this.q.postRotate(f % 360.0f);
        f();
    }

    public RectF c() {
        l();
        return d(o());
    }

    public void e(float f) {
        n.c(f, this.f, this.n);
        this.i = f;
    }

    public void a(boolean z) {
        this.ad = z;
        h();
    }

    public void a(float f) {
        n.c(this.i, f, this.n);
        this.f = f;
    }

    public void c(boolean z) {
        this.j = z;
    }

    public void d(com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.j jVar) {
        this.ac = jVar;
    }

    public void e(i iVar) {
        this.z = iVar;
    }

    public void e(h hVar) {
        this.ab = hVar;
    }

    public void c(g gVar) {
        this.v = gVar;
    }

    public void b(f fVar) {
        this.u = fVar;
    }

    public void b(com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.e eVar) {
        this.w = eVar;
    }

    public void d(com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.d dVar) {
        this.y = dVar;
    }

    public void d(ImageView.ScaleType scaleType) {
        if (!n.a(scaleType) || scaleType == this.af) {
            return;
        }
        this.af = scaleType;
        h();
    }

    public void d(View.OnLongClickListener onLongClickListener) {
        this.x = onLongClickListener;
    }

    public void e(View.OnClickListener onClickListener) {
        this.aa = onClickListener;
    }

    public void b(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.l.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void a(int i) {
        this.g = i;
    }

    public void e(float f, boolean z) {
        e(f, this.o.getRight() / 2, this.o.getBottom() / 2, z);
    }

    public void e(float f, float f2, float f3, boolean z) {
        if (f < this.i || f > this.n) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.o.post(new b(j(), f, f2, f3));
        } else {
            this.q.setScale(f, f, f2, f3);
            f();
        }
    }

    public void c(float f) {
        n.c(this.i, this.f, f);
        this.n = f;
    }

    private void k() {
        this.q.reset();
        b(this.f21656a);
        b(o());
        l();
    }

    private void n() {
        this.l.setOnDoubleTapListener(new d());
    }

    private Matrix o() {
        this.p.set(this.s);
        this.p.postConcat(this.q);
        return this.p;
    }

    private boolean l() {
        float f;
        float f2;
        RectF rectFD = d(o());
        if (rectFD == null) {
            return false;
        }
        float fHeight = rectFD.height();
        float fWidth = rectFD.width();
        float fA = a(this.o);
        if (fHeight <= fA) {
            int i = e.e[this.af.ordinal()];
            if (i != 3) {
                if (i != 4) {
                    f2 = (fA - fHeight) / 2.0f;
                } else {
                    f = -rectFD.top;
                }
                this.e = 2;
            } else {
                f2 = fA - fHeight;
            }
            f = f2 - rectFD.top;
            this.e = 2;
        } else {
            float f3 = rectFD.top;
            if (f3 > 0.0f) {
                this.e = 0;
                f = -f3;
            } else {
                float f4 = rectFD.bottom;
                if (f4 < fA) {
                    this.e = 1;
                    f = fA - f4;
                } else {
                    this.e = -1;
                    f = 0.0f;
                }
            }
        }
        return b(rectFD, fWidth, 0.0f, f);
    }

    private void b(Matrix matrix) {
        RectF rectFD;
        this.o.setImageMatrix(matrix);
        if (this.y == null || (rectFD = d(matrix)) == null) {
            return;
        }
        this.y.a(rectFD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (l()) {
            b(o());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(MotionEvent motionEvent) {
        View.OnClickListener onClickListener = this.aa;
        if (onClickListener != null) {
            onClickListener.onClick(this.o);
        }
        RectF rectFC = c();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.j jVar = this.ac;
        if (jVar != null) {
            jVar.a(this.o, x, y);
        }
        if (rectFC == null) {
            return false;
        }
        if (!rectFC.contains(x, y)) {
            com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.e eVar = this.w;
            if (eVar == null) {
                return false;
            }
            eVar.a(this.o);
            return false;
        }
        float fWidth = (x - rectFC.left) / rectFC.width();
        float fHeight = (y - rectFC.top) / rectFC.height();
        f fVar = this.u;
        if (fVar == null) {
            return true;
        }
        fVar.a(this.o, fWidth, fHeight);
        return true;
    }

    private boolean b(RectF rectF, float f, float f2, float f3) {
        int i;
        float f4;
        float f5;
        float fB = b(this.o);
        if (f > fB) {
            float f6 = rectF.left;
            if (f6 > 0.0f) {
                this.d = 0;
                f4 = -f6;
            } else {
                float f7 = rectF.right;
                if (f7 < fB) {
                    f4 = fB - f7;
                    this.d = 1;
                } else {
                    i = -1;
                }
            }
            this.q.postTranslate(f4, f3);
            return true;
        }
        int i2 = e.e[this.af.ordinal()];
        if (i2 != 3) {
            if (i2 != 4) {
                f5 = (fB - f) / 2.0f;
            } else {
                f2 = -rectF.left;
            }
            i = 2;
        } else {
            f5 = fB - f;
        }
        f2 = f5 - rectF.left;
        i = 2;
        this.d = i;
        f4 = f2;
        this.q.postTranslate(f4, f3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(float f, float f2) {
        if (!this.j || this.m.c() || this.h) {
            return true;
        }
        int i = this.d;
        boolean z = i != 2;
        if (i == 0 && f >= 1.0f) {
            z = false;
        }
        if (i == 1 && f <= -1.0f) {
            z = false;
        }
        int i2 = this.e;
        if (i2 == 0 && f2 >= 1.0f) {
            z = false;
        }
        if (i2 != 1 || f2 > -1.0f) {
            return z;
        }
        return false;
    }

    private void c(Drawable drawable) {
        Matrix matrix;
        Matrix.ScaleToFit scaleToFit;
        float fMin;
        if (drawable == null) {
            return;
        }
        float fB = b(this.o);
        float fA = a(this.o);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.s.reset();
        float f = intrinsicWidth;
        float f2 = fB / f;
        float f3 = intrinsicHeight;
        float f4 = fA / f3;
        ImageView.ScaleType scaleType = this.af;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.s.postTranslate((fB - f) / 2.0f, (fA - f3) / 2.0f);
        } else {
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                fMin = Math.max(f2, f4);
            } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                fMin = Math.min(1.0f, Math.min(f2, f4));
            } else {
                RectF rectF = new RectF(0.0f, 0.0f, f, f3);
                RectF rectF2 = new RectF(0.0f, 0.0f, fB, fA);
                if (((int) this.f21656a) % 180 != 0) {
                    rectF = new RectF(0.0f, 0.0f, f3, f);
                }
                int i = e.e[this.af.ordinal()];
                if (i == 1) {
                    matrix = this.s;
                    scaleToFit = Matrix.ScaleToFit.FILL;
                } else if (i == 2) {
                    matrix = this.s;
                    scaleToFit = Matrix.ScaleToFit.CENTER;
                } else if (i == 3) {
                    matrix = this.s;
                    scaleToFit = Matrix.ScaleToFit.END;
                } else if (i == 4) {
                    matrix = this.s;
                    scaleToFit = Matrix.ScaleToFit.START;
                }
                matrix.setRectToRect(rectF, rectF2, scaleToFit);
            }
            this.s.postScale(fMin, fMin);
            this.s.postTranslate((fB - (f * fMin)) / 2.0f, (fA - (f3 * fMin)) / 2.0f);
        }
        k();
    }

    private void i() {
        j jVar = this.f21658c;
        if (jVar != null) {
            jVar.a();
            this.f21658c = null;
        }
    }

    class c implements com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.c {
        @Override // com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.c
        public void a(float f, float f2, float f3, float f4, float f5) {
            if (l.this.j() < l.this.n || f < 1.0f) {
                if (l.this.v != null) {
                    l.this.v.a(f, f2, f3);
                }
                l.this.q.postScale(f, f, f2, f3);
                l.this.q.postTranslate(f4, f5);
                l.this.f();
            }
        }

        @Override // com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.c
        public void a(float f, float f2, float f3, float f4) {
            l lVar = l.this;
            lVar.f21658c = lVar.new j(lVar.o.getContext());
            j jVar = l.this.f21658c;
            l lVar2 = l.this;
            int iB = lVar2.b(lVar2.o);
            l lVar3 = l.this;
            jVar.b(iB, lVar3.a(lVar3.o), (int) f3, (int) f4);
            l.this.o.post(l.this.f21658c);
        }

        @Override // com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.c
        public void a(float f, float f2, float f3) {
            a(f, f2, f3, 0.0f, 0.0f);
        }

        @Override // com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.c
        public void a(float f, float f2) {
            if (l.this.m.c()) {
                return;
            }
            if (l.this.z != null) {
                l.this.z.a(f, f2);
            }
            l.this.q.postTranslate(f, f2);
            l.this.f();
            ViewParent parent = l.this.o.getParent();
            boolean zB = l.this.b(f, f2);
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(zB);
            }
        }

        c() {
        }
    }

    class d implements GestureDetector.OnDoubleTapListener {
        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return l.this.b(motionEvent);
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            l lVar;
            float fE;
            try {
                float fJ = l.this.j();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (fJ < l.this.a()) {
                    lVar = l.this;
                    fE = lVar.a();
                } else if (fJ < l.this.a() || fJ >= l.this.b()) {
                    lVar = l.this;
                    fE = lVar.e();
                } else {
                    lVar = l.this;
                    fE = lVar.b();
                }
                lVar.e(fE, x, y, true);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        d() {
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final OverScroller f21665c;
        private int d;
        private int e;

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f21665c.isFinished() && this.f21665c.computeScrollOffset()) {
                int currX = this.f21665c.getCurrX();
                int currY = this.f21665c.getCurrY();
                l.this.q.postTranslate(this.d - currX, this.e - currY);
                l.this.f();
                this.d = currX;
                this.e = currY;
                com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.b.a(l.this.o, this);
            }
        }

        public void b(int i, int i2, int i3, int i4) {
            int i5;
            int iRound;
            int i6;
            int iRound2;
            RectF rectFC = l.this.c();
            if (rectFC == null) {
                return;
            }
            int iRound3 = Math.round(-rectFC.left);
            float f = i;
            if (f < rectFC.width()) {
                iRound = Math.round(rectFC.width() - f);
                i5 = 0;
            } else {
                i5 = iRound3;
                iRound = i5;
            }
            int iRound4 = Math.round(-rectFC.top);
            float f2 = i2;
            if (f2 < rectFC.height()) {
                iRound2 = Math.round(rectFC.height() - f2);
                i6 = 0;
            } else {
                i6 = iRound4;
                iRound2 = i6;
            }
            this.d = iRound3;
            this.e = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f21665c.fling(iRound3, iRound4, i3, i4, i5, iRound, i6, iRound2, 0, 0);
        }

        public void a() {
            this.f21665c.forceFinished(true);
        }

        j(Context context) {
            this.f21665c = new OverScroller(context);
        }
    }

    private RectF d(Matrix matrix) {
        Drawable drawable = this.o.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.t.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.t);
        return this.t;
    }

    class a extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (l.this.x != null) {
                l.this.x.onLongClick(l.this.o);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (l.this.ab == null || l.this.j() > 1.0f || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1) {
                return false;
            }
            return l.this.ab.onFling(motionEvent, motionEvent2, f, f2);
        }

        a() {
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f21660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f21661c;
        private final long d = System.currentTimeMillis();
        private final float e;
        private final float g;

        @Override // java.lang.Runnable
        public void run() {
            float fD = d();
            float f = this.f21661c;
            l.this.f21657b.a((f + ((this.g - f) * fD)) / l.this.j(), this.f21660b, this.e);
            if (fD < 1.0f) {
                com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.b.a(l.this.o, this);
            }
        }

        private float d() {
            return l.this.k.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.d) * 1.0f) / l.this.g));
        }

        b(float f, float f2, float f3, float f4) {
            this.f21660b = f3;
            this.e = f4;
            this.f21661c = f;
            this.g = f2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    static /* synthetic */ class e {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            e = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private float a(Matrix matrix, int i) {
        matrix.getValues(this.r);
        return this.r[i];
    }

    public l(ImageView imageView) {
        c cVar = new c();
        this.f21657b = cVar;
        this.o = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f21656a = 0.0f;
        this.m = new com.huawei.phoneservice.feedback.media.impl.wiget.pictureview.a(imageView.getContext(), cVar);
        this.l = new GestureDetector(imageView.getContext(), new a());
        n();
    }
}
