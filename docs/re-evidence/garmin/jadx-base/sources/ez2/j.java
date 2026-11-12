package ez2;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import j20.x;

/* JADX INFO: loaded from: classes13.dex */
public class j implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f67552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GestureDetector f67553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ez2.a f67554j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i f67560p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View.OnClickListener f67561q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View.OnLongClickListener f67562r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f f67563t;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f67568z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f67545a = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67546b = 200;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f67547c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f67548d = 1.75f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f67549e = 3.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f67550f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f67551g = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Matrix f67555k = new Matrix();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Matrix f67556l = new Matrix();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Matrix f67557m = new Matrix();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RectF f67558n = new RectF();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float[] f67559o = new float[9];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f67564v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f67565w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f67566x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageView.ScaleType f67567y = ImageView.ScaleType.FIT_CENTER;

    public class a implements ez2.b {
        public a() {
        }

        public final void a(float f14, float f15, float f16) {
            j jVar = j.this;
            if (jVar.d() < jVar.f67549e || f14 < 1.0f) {
                jVar.getClass();
                jVar.f67557m.postScale(f14, f14, f15, f16);
                jVar.a();
            }
        }
    }

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f14, float f15) {
            j.this.getClass();
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            j jVar = j.this;
            View.OnLongClickListener onLongClickListener = jVar.f67562r;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(jVar.f67552h);
            }
        }
    }

    public class c implements GestureDetector.OnDoubleTapListener {
        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0027 A[Catch: ArrayIndexOutOfBoundsException -> 0x002c, TRY_LEAVE, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x002c, blocks: (B:3:0x0003, B:5:0x0015, B:8:0x001d, B:10:0x0023, B:11:0x0027), top: B:15:0x0003 }] */
        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            j jVar = j.this;
            try {
                float fD = jVar.d();
                float x14 = motionEvent.getX();
                float y14 = motionEvent.getY();
                float f14 = jVar.f67548d;
                if (fD < f14) {
                    jVar.e(f14, x14, y14, true);
                } else if (fD >= f14) {
                    float f15 = jVar.f67549e;
                    if (fD < f15) {
                        jVar.e(f15, x14, y14, true);
                    } else {
                        jVar.e(jVar.f67547c, x14, y14, true);
                    }
                } else {
                    jVar.e(jVar.f67547c, x14, y14, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            j jVar = j.this;
            View.OnClickListener onClickListener = jVar.f67561q;
            ImageView imageView = jVar.f67552h;
            if (onClickListener != null) {
                onClickListener.onClick(imageView);
            }
            jVar.b();
            Matrix matrixC = jVar.c();
            RectF rectF = jVar.f67558n;
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                matrixC.mapRect(rectF);
            } else {
                rectF = null;
            }
            float x14 = motionEvent.getX();
            float y14 = motionEvent.getY();
            i iVar = jVar.f67560p;
            if (iVar != null) {
                ((cp.b) iVar).u6();
            }
            if (rectF == null || !rectF.contains(x14, y14)) {
                return false;
            }
            rectF.width();
            rectF.height();
            return true;
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67572a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f67572a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67572a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67572a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67572a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f67573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f67574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f67575c = System.currentTimeMillis();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f67576d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f67577e;

        public e(float f14, float f15, float f16, float f17) {
            this.f67573a = f16;
            this.f67574b = f17;
            this.f67576d = f14;
            this.f67577e = f15;
        }

        @Override // java.lang.Runnable
        public final void run() {
            float fCurrentTimeMillis = (System.currentTimeMillis() - this.f67575c) * 1.0f;
            j jVar = j.this;
            float interpolation = jVar.f67545a.getInterpolation(Math.min(1.0f, fCurrentTimeMillis / jVar.f67546b));
            float f14 = this.f67576d;
            jVar.f67568z.a(x.a(this.f67577e, f14, interpolation, f14) / jVar.d(), this.f67573a, this.f67574b);
            if (interpolation < 1.0f) {
                jVar.f67552h.postOnAnimation(this);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OverScroller f67579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f67580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f67581c;

        public f(Context context) {
            this.f67579a = new OverScroller(context);
        }

        @Override // java.lang.Runnable
        public final void run() {
            OverScroller overScroller = this.f67579a;
            if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                j jVar = j.this;
                jVar.f67557m.postTranslate(this.f67580b - currX, this.f67581c - currY);
                jVar.a();
                this.f67580b = currX;
                this.f67581c = currY;
                jVar.f67552h.postOnAnimation(this);
            }
        }
    }

    public j(ImageView imageView) {
        a aVar = new a();
        this.f67568z = aVar;
        this.f67552h = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f67554j = new ez2.a(imageView.getContext(), aVar);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
        this.f67553i = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
    }

    public final void a() {
        if (b()) {
            this.f67552h.setImageMatrix(c());
        }
    }

    public final boolean b() {
        RectF rectF;
        float f14;
        Matrix matrixC = c();
        ImageView imageView = this.f67552h;
        Drawable drawable = imageView.getDrawable();
        float f15 = 0.0f;
        if (drawable != null) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            rectF = this.f67558n;
            rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            matrixC.mapRect(rectF);
        } else {
            rectF = null;
        }
        if (rectF == null) {
            return false;
        }
        float fHeight = rectF.height();
        float fWidth = rectF.width();
        float height = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
        if (fHeight <= height) {
            int i14 = d.f67572a[this.f67567y.ordinal()];
            float f16 = rectF.top;
            if (i14 != 2) {
                f14 = (i14 != 3 ? (height - fHeight) / 2.0f : height - fHeight) - f16;
            } else {
                f14 = -f16;
            }
            this.f67565w = 2;
        } else {
            float f17 = rectF.top;
            if (f17 > 0.0f) {
                this.f67565w = 0;
                f14 = -f17;
            } else {
                float f18 = rectF.bottom;
                if (f18 < height) {
                    this.f67565w = 1;
                    f14 = height - f18;
                } else {
                    this.f67565w = -1;
                    f14 = 0.0f;
                }
            }
        }
        float width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
        if (fWidth <= width) {
            int i15 = d.f67572a[this.f67567y.ordinal()];
            float f19 = rectF.left;
            if (i15 != 2) {
                f15 = (i15 != 3 ? (width - fWidth) / 2.0f : width - fWidth) - f19;
            } else {
                f15 = -f19;
            }
            this.f67564v = 2;
        } else {
            float f22 = rectF.left;
            if (f22 > 0.0f) {
                this.f67564v = 0;
                f15 = -f22;
            } else {
                float f24 = rectF.right;
                if (f24 < width) {
                    f15 = width - f24;
                    this.f67564v = 1;
                } else {
                    this.f67564v = -1;
                }
            }
        }
        this.f67557m.postTranslate(f15, f14);
        return true;
    }

    public final Matrix c() {
        Matrix matrix = this.f67555k;
        Matrix matrix2 = this.f67556l;
        matrix2.set(matrix);
        matrix2.postConcat(this.f67557m);
        return matrix2;
    }

    public final float d() {
        Matrix matrix = this.f67557m;
        float[] fArr = this.f67559o;
        matrix.getValues(fArr);
        float fPow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(fPow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    public final void e(float f14, float f15, float f16, boolean z14) {
        if (f14 < this.f67547c || f14 > this.f67549e) {
            vb.h.s("Scale must be within the range of minScale and maxScale");
        } else if (z14) {
            this.f67552h.post(new e(d(), f14, f15, f16));
        } else {
            this.f67557m.setScale(f14, f14, f15, f16);
            a();
        }
    }

    public final void f() {
        boolean z14 = this.f67566x;
        ImageView imageView = this.f67552h;
        if (z14) {
            g(imageView.getDrawable());
            return;
        }
        Matrix matrix = this.f67557m;
        matrix.reset();
        matrix.postRotate(0.0f);
        a();
        imageView.setImageMatrix(c());
        b();
    }

    public final void g(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        ImageView imageView = this.f67552h;
        float width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
        float height = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.f67555k;
        matrix.reset();
        float f14 = intrinsicWidth;
        float f15 = width / f14;
        float f16 = intrinsicHeight;
        float f17 = height / f16;
        ImageView.ScaleType scaleType = this.f67567y;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((width - f14) / 2.0f, (height - f16) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f15, f17);
            matrix.postScale(fMax, fMax);
            matrix.postTranslate((width - (f14 * fMax)) / 2.0f, hb.a.c(f16, fMax, height, 2.0f));
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f15, f17));
            matrix.postScale(fMin, fMin);
            matrix.postTranslate((width - (f14 * fMin)) / 2.0f, hb.a.c(f16, fMin, height, 2.0f));
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f14, f16);
            RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f16, f14);
            }
            int i14 = d.f67572a[this.f67567y.ordinal()];
            if (i14 == 1) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i14 == 2) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i14 == 3) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i14 == 4) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        Matrix matrix2 = this.f67557m;
        matrix2.reset();
        matrix2.postRotate(0.0f);
        a();
        imageView.setImageMatrix(c());
        b();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        if (i14 == i18 && i15 == i19 && i16 == i24 && i17 == i25) {
            return;
        }
        g(this.f67552h.getDrawable());
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view2, MotionEvent motionEvent) {
        boolean z14;
        ez2.a aVar;
        GestureDetector gestureDetector;
        ScaleGestureDetector scaleGestureDetector;
        boolean zIsInProgress;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18 = false;
        if (!this.f67566x || ((ImageView) view2).getDrawable() == null) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = null;
        if (action != 0) {
            if (action == 1 || action == 3) {
                float fD = d();
                float f14 = this.f67547c;
                ImageView imageView = this.f67552h;
                RectF rectF2 = this.f67558n;
                if (fD < f14) {
                    b();
                    Matrix matrixC = c();
                    Drawable drawable = imageView.getDrawable();
                    if (drawable != null) {
                        rectF2.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                        matrixC.mapRect(rectF2);
                        rectF = rectF2;
                    }
                    if (rectF != null) {
                        RectF rectF3 = rectF;
                        view2.post(new e(d(), this.f67547c, rectF3.centerX(), rectF3.centerY()));
                        z14 = true;
                    }
                } else if (d() > this.f67549e) {
                    b();
                    Matrix matrixC2 = c();
                    Drawable drawable2 = imageView.getDrawable();
                    if (drawable2 != null) {
                        rectF2.set(0.0f, 0.0f, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                        matrixC2.mapRect(rectF2);
                        rectF = rectF2;
                    }
                    if (rectF != null) {
                        RectF rectF4 = rectF;
                        view2.post(new e(d(), this.f67549e, rectF4.centerX(), rectF4.centerY()));
                        z14 = true;
                    }
                }
            }
            aVar = this.f67554j;
            if (aVar != null) {
                scaleGestureDetector = aVar.f67536c;
                zIsInProgress = scaleGestureDetector.isInProgress();
                z15 = aVar.f67538e;
                try {
                    scaleGestureDetector.onTouchEvent(motionEvent);
                    aVar.a(motionEvent);
                } catch (IllegalArgumentException unused) {
                }
                if (!zIsInProgress || scaleGestureDetector.isInProgress()) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if (!z15 || aVar.f67538e) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                if (z16 && z17) {
                    z18 = true;
                }
                this.f67551g = z18;
                z14 = true;
            }
            gestureDetector = this.f67553i;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
            return z14;
        }
        ViewParent parent = view2.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        f fVar = this.f67563t;
        if (fVar != null) {
            fVar.f67579a.forceFinished(true);
            this.f67563t = null;
        }
        z14 = false;
        aVar = this.f67554j;
        if (aVar != null) {
            scaleGestureDetector = aVar.f67536c;
            zIsInProgress = scaleGestureDetector.isInProgress();
            z15 = aVar.f67538e;
            scaleGestureDetector.onTouchEvent(motionEvent);
            aVar.a(motionEvent);
            if (zIsInProgress) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (z15) {
                z17 = false;
            } else {
                z17 = false;
            }
            if (z16) {
                z18 = true;
            }
            this.f67551g = z18;
            z14 = true;
        }
        gestureDetector = this.f67553i;
        if (gestureDetector == null) {
        }
        return z14;
    }
}
