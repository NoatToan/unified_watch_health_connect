package com.huawei.ucd.cloveranimation;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.media3.common.C;
import com.huawei.hms.ads.jsb.constant.Constant;
import defpackage.qhx;
import defpackage.qib;
import defpackage.qic;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes15.dex */
public class CloverView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23189a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private RectF ag;
    private int ah;
    private boolean ai;
    private float aj;
    private float ak;
    private float al;
    private float am;
    private float an;
    private float ao;
    private float ap;
    private float aq;
    private qhx ar;
    private float as;
    private float at;
    private ValueAnimator au;
    private float av;
    private float aw;
    private float ax;
    private float ay;
    private float az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23190b;
    private float ba;
    private float bb;
    private ValueAnimator bc;
    private float bd;
    private float be;
    private Handler bf;
    private Paint bg;
    private float bh;
    private float bi;
    private Paint bj;
    private float bk;
    private Bitmap bl;
    private Paint bm;
    private float bn;
    private float bo;
    private float bp;
    private float bq;
    private ValueAnimator br;
    private Bitmap[] bs;
    private int bt;
    private float bu;
    private float bv;
    private ValueAnimator bw;
    private float bx;
    private Bitmap[] by;
    private Bitmap[] bz;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AddFrameListener f23191c;
    private float ca;
    private float cb;
    private float cc;
    private float cd;
    private float ce;
    private float cf;
    private ValueAnimator cg;
    private OnPetalClickListener ch;
    private Runnable ci;
    private AddFrameListener cl;
    private AddFrameListener d;
    private boolean e;
    private float f;
    private boolean g;
    private float h;
    private Runnable i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public interface OnPetalClickListener {
        void onLeftClick();

        void onRightClick();

        void onTopClick();
    }

    static /* synthetic */ int a(CloverView cloverView) {
        int i = cloverView.bt;
        cloverView.bt = i + 1;
        return i;
    }

    public void setPetalClickListener(OnPetalClickListener onPetalClickListener) {
        this.ch = onPetalClickListener;
    }

    public void setMaxOutsideScale(float f) {
        if (f < 0.88f) {
            this.cf = 0.88f;
        } else {
            this.cf = f;
        }
    }

    public void setDefaultOutsideScale() {
        this.cf = 0.88f;
    }

    public CloverView(Context context) {
        this(context, null);
    }

    public CloverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CloverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23190b = 0.58f;
        this.bd = 1.0f;
        this.aq = 1.0f;
        this.aj = 1.0f;
        this.ax = 0.0f;
        this.as = 0.0f;
        this.ao = 0.0f;
        this.ap = 0.0f;
        this.bv = 0.0f;
        this.bu = 0.0f;
        this.cb = 0.0f;
        this.ak = 0.0f;
        this.al = 0.0f;
        this.am = 0.0f;
        this.ca = 0.0f;
        this.be = 0.0f;
        this.bn = 0.0f;
        this.an = 0.0f;
        this.bx = 0.0f;
        this.bh = 0.0f;
        this.bo = 0.0f;
        this.ce = 0.0f;
        this.bi = 0.0f;
        this.bp = 0.0f;
        this.az = 0.0f;
        this.bq = 1.0f;
        this.at = 0.0f;
        this.ay = 1.0f;
        this.aw = 0.0f;
        this.bb = 1.0f;
        this.av = 0.0f;
        this.ba = 1.0f;
        this.ad = false;
        this.q = false;
        this.r = false;
        this.l = false;
        this.m = false;
        this.t = false;
        this.u = true;
        this.k = false;
        this.o = false;
        this.v = false;
        this.bt = 0;
        this.bs = null;
        this.bz = null;
        this.by = null;
        this.ab = false;
        this.s = false;
        this.z = false;
        this.ai = false;
        this.ae = false;
        this.af = false;
        this.n = false;
        this.aa = true;
        this.y = true;
        this.p = false;
        this.f23189a = 1;
        this.x = false;
        this.g = false;
        this.ac = false;
        this.cf = 0.88f;
        this.e = false;
        this.ci = new Runnable() { // from class: com.huawei.ucd.cloveranimation.CloverView.3
            @Override // java.lang.Runnable
            public void run() {
                CloverView.this.ab = true;
                if (CloverView.this.bt >= 119) {
                    CloverView.this.ab = false;
                    return;
                }
                CloverView.this.bf.postDelayed(CloverView.this.ci, 17L);
                if (CloverView.this.p) {
                    CloverView.this.postInvalidate();
                    CloverView.a(CloverView.this);
                }
            }
        };
        this.i = new Runnable() { // from class: com.huawei.ucd.cloveranimation.CloverView.4
            @Override // java.lang.Runnable
            public void run() {
                final Bitmap[] bitmapArrA;
                final Bitmap[] bitmapArrA2;
                final Bitmap[] bitmapArrA3;
                if (CloverView.this.f23189a == 120) {
                    bitmapArrA = CloverView.this.d(CloverView.this.d(R.drawable.health_model_icon_sport));
                    bitmapArrA2 = CloverView.this.d(CloverView.this.d(R.drawable.health_model_icon_mood));
                    bitmapArrA3 = CloverView.this.d(CloverView.this.d(R.drawable.health_model_icon_slumber));
                } else {
                    bitmapArrA = CloverView.this.a(R.drawable.health_model_static_sport);
                    bitmapArrA2 = CloverView.this.a(R.drawable.health_model_static_mood);
                    bitmapArrA3 = CloverView.this.a(R.drawable.health_model_static_slumber);
                }
                CloverView.this.bf.post(new Runnable() { // from class: com.huawei.ucd.cloveranimation.CloverView.4.3
                    @Override // java.lang.Runnable
                    public void run() {
                        CloverView.this.bs = bitmapArrA;
                        CloverView.this.bz = bitmapArrA2;
                        CloverView.this.by = bitmapArrA3;
                        CloverView.this.p = true;
                        CloverView.this.postInvalidate();
                        if (CloverView.this.d != null) {
                            CloverView.this.d.onFinished();
                        }
                    }
                });
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.cloverView);
        this.j = typedArrayObtainStyledAttributes.getBoolean(R.styleable.cloverView_isAnimator, false);
        this.w = typedArrayObtainStyledAttributes.getBoolean(R.styleable.cloverView_isIconView, false);
        typedArrayObtainStyledAttributes.recycle();
        i();
    }

    private void m() {
        this.bd = Math.min(getWidth(), getHeight()) / (Math.max(this.ar.j(), this.ar.i()) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap[] d(Bitmap bitmap) {
        Bitmap[] bitmapArr = new Bitmap[this.f23189a];
        Matrix matrix = new Matrix();
        if (this.bd <= 0.0f) {
            m();
        }
        float f = this.bd;
        if (f <= 0.0f) {
            for (int i = 0; i < this.f23189a; i++) {
                bitmapArr[i] = Bitmap.createBitmap(10, 10, Bitmap.Config.RGB_565);
            }
        } else {
            matrix.preScale(f, f);
            int width = bitmap.getWidth() / 10;
            int height = bitmap.getHeight() / 12;
            for (int i2 = 0; i2 < this.f23189a; i2++) {
                try {
                    bitmapArr[i2] = Bitmap.createBitmap(bitmap, ((i2 % 10) * bitmap.getWidth()) / 10, ((i2 / 10) * bitmap.getHeight()) / 12, width, height, matrix, true);
                } catch (IllegalArgumentException | OutOfMemoryError unused) {
                    bitmapArr[i2] = Bitmap.createBitmap(10, 10, Bitmap.Config.RGB_565);
                }
            }
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap[] a(int i) {
        Bitmap[] bitmapArr = new Bitmap[this.f23189a];
        Bitmap bitmapD = d(i);
        Matrix matrix = new Matrix();
        if (this.bd <= 0.0f) {
            m();
        }
        float f = this.bd;
        if (f <= 0.0f) {
            bitmapArr[0] = Bitmap.createBitmap(10, 10, Bitmap.Config.RGB_565);
        } else {
            matrix.preScale(f, f);
            try {
                bitmapArr[0] = Bitmap.createBitmap(bitmapD, 0, 0, bitmapD.getWidth(), bitmapD.getHeight(), matrix, true);
            } catch (IllegalArgumentException | OutOfMemoryError unused) {
                bitmapArr[0] = Bitmap.createBitmap(10, 10, Bitmap.Config.RGB_565);
            }
        }
        if (bitmapD != null && !bitmapD.isRecycled()) {
            bitmapD.recycle();
        }
        return bitmapArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap d(int i) {
        byte[] bArrD;
        int memoryClass = ((ActivityManager) getContext().getSystemService("activity")).getMemoryClass();
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (memoryClass < 32) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        } else {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        options.inPurgeable = true;
        options.inInputShareable = true;
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(getResources().openRawResource(i), null, options);
        if ((bitmapDecodeStream == null || bitmapDecodeStream.getWidth() <= 0 || bitmapDecodeStream.getHeight() <= 0) && (bArrD = d(getResources().openRawResource(i))) != null) {
            bitmapDecodeStream = BitmapFactory.decodeByteArray(bArrD, 0, bArrD.length);
        }
        return (bitmapDecodeStream == null || bitmapDecodeStream.getWidth() <= 0 || bitmapDecodeStream.getHeight() <= 0) ? Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888) : bitmapDecodeStream;
    }

    private byte[] d(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    byteArrayOutputStream.close();
                    inputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public void setAddFrameListener(AddFrameListener addFrameListener) {
        this.d = addFrameListener;
    }

    public void setAnimEndListener(AddFrameListener addFrameListener) {
        this.f23191c = addFrameListener;
    }

    public void setValueEndListener(AddFrameListener addFrameListener) {
        this.cl = addFrameListener;
    }

    public void setContentsRunIcon(boolean z) {
        this.n = z;
    }

    public void setInvalid(boolean z) {
        this.u = z;
        invalidate();
    }

    public void setAllFull(boolean z) {
        this.g = z;
    }

    public void setPlayRunAnimAnimator(boolean z) {
        this.aa = z;
    }

    public void setPlayEncourageAnimAnimator(boolean z) {
        this.y = z;
    }

    public qhx getCloverData() {
        return this.ar;
    }

    private void i() {
        this.ar = new qhx();
        this.bm = new Paint(1);
        this.ag = new RectF();
        this.f23189a = 1;
        if (this.w || this.j) {
            this.bj = new Paint(1);
            this.bg = new Paint(1);
            this.bf = new Handler();
            int iMax = Math.max((int) this.ar.j(), (int) this.ar.i()) * 2;
            this.bk = (iMax / 2.0f) - (this.ar.j() / 2.0f);
            if (this.j) {
                this.bl = Bitmap.createBitmap(iMax, iMax, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.bl);
                this.bj.setColor(-16777216);
                this.bj.setFilterBitmap(true);
                canvas.save();
                canvas.translate(this.bk, 0.0f);
                canvas.drawPath(this.ar.f(), this.bj);
                canvas.restore();
                this.bj.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            }
        }
        if (this.j) {
            return;
        }
        setMaxOutsideScale(1.0f);
    }

    private void g() {
        new Thread(this.i).start();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        float f = i;
        float f2 = i2;
        this.ag.set(0.0f, 0.0f, f, f2);
        if (i >= i2) {
            this.f23190b = 0.58f;
        } else {
            this.f23190b = (((i2 - i) / 2.0f) + (0.58f * f)) / f2;
        }
        this.cc = (f / 2.0f) - (this.ar.j() / 2.0f);
        this.cd = (f2 * this.f23190b) - this.ar.i();
        this.bd = Math.min(i, i2) / (Math.max(this.ar.j(), this.ar.i()) * 2.0f);
        if (this.w) {
            g();
        }
        if (this.j) {
            this.f23189a = 120;
            g();
        }
    }

    private void f() {
        this.ca = 0.0f;
        this.be = 0.0f;
        this.bn = 0.0f;
        this.ax = 1.0f;
        this.aq = 1.0f;
        this.ak = 1.0f;
        this.al = 1.0f;
        this.am = 1.0f;
        this.aj = 1.0f;
        this.bx = 0.0f;
        this.bh = 0.0f;
        this.bo = 0.0f;
        this.bv = 1.0f;
        this.bu = 1.0f;
        this.cb = 1.0f;
        this.az = 0.0f;
        this.bq = 1.0f;
        this.at = 0.0f;
        this.ay = 1.0f;
        this.aw = 0.0f;
        this.bb = 1.0f;
        this.av = 0.0f;
        this.ba = 1.0f;
        this.q = false;
        this.r = false;
    }

    public void setCutValuesWithAnim(float f, float f2, float f3) {
        h();
        f();
        if (Float.compare(f, this.ca) != 0 || Float.compare(f2, this.be) != 0 || Float.compare(f3, this.bn) != 0) {
            this.ai = false;
            this.ae = false;
            this.af = false;
            if (f != this.ca) {
                this.ae = true;
            }
            if (f2 != this.be) {
                this.ai = true;
            }
            if (f3 != this.bn) {
                this.af = true;
            }
            this.l = true;
            this.m = true;
            this.t = true;
            if (this.ai || this.ae || this.af) {
                a();
            }
            this.ad = true;
            b(f, f2, f3);
            return;
        }
        invalidate();
    }

    public void setValuesWithAnim(float f, float f2, float f3, AddFrameListener addFrameListener) {
        if (this.s) {
            this.f23191c = addFrameListener;
        } else {
            this.f23191c = null;
            setValuesWithAnim(f, f2, f3);
        }
    }

    public void setValuesWithAnim(float f, float f2, float f3) {
        if (this.s) {
            return;
        }
        h();
        if (Float.compare(f, this.ca) == 0 && Float.compare(f2, this.be) == 0 && Float.compare(f3, this.bn) == 0) {
            return;
        }
        this.ai = false;
        this.ae = false;
        this.af = false;
        if (f != this.ca) {
            this.ae = true;
        }
        if (f2 != this.be) {
            this.ai = true;
        }
        if (f3 != this.bn) {
            this.af = true;
        }
        this.l = true;
        this.m = true;
        this.t = true;
        if (this.ai || this.ae || this.af) {
            a();
        }
        this.ad = true;
        b(f, f2, f3);
    }

    public void e(float f) {
        this.an = f;
        this.o = true;
        this.y = true;
        this.aa = true;
        this.n = true;
        a(f, f, f);
    }

    public void b() {
        this.o = false;
        h();
    }

    public void a(final float f, final float f2, final float f3) {
        h();
        this.s = true;
        this.ad = false;
        e();
        this.ca = f;
        this.be = f2;
        this.bn = f3;
        k();
        e(f, f2, f3);
        this.bf.postDelayed(new Runnable() { // from class: com.huawei.ucd.cloveranimation.CloverView.2
            @Override // java.lang.Runnable
            public void run() {
                CloverView.this.ai = false;
                CloverView.this.ae = false;
                CloverView.this.af = false;
                if (f > 0.0f) {
                    CloverView.this.ae = true;
                }
                if (f2 > 0.0f) {
                    CloverView.this.ai = true;
                }
                if (f3 > 0.0f) {
                    CloverView.this.af = true;
                }
                if (CloverView.this.ai || CloverView.this.ae || CloverView.this.af) {
                    CloverView.this.a();
                }
            }
        }, 400L);
    }

    private void h() {
        ValueAnimator valueAnimator = this.br;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.br.cancel();
            this.br.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.bw;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.bw.cancel();
            this.bw.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.cg;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllListeners();
            this.cg.cancel();
            this.cg.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator4 = this.bc;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllListeners();
            this.bc.cancel();
            this.bc.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator5 = this.au;
        if (valueAnimator5 != null) {
            valueAnimator5.removeAllListeners();
            this.au.cancel();
            this.au.removeAllUpdateListeners();
        }
    }

    public void setPlayAllFrameAnimation(boolean z) {
        this.v = z;
    }

    public void a() {
        if (!this.ab && this.aa && this.f23189a == 120) {
            this.bt = 0;
            this.bf.postDelayed(this.ci, 17L);
        }
    }

    public void e() {
        this.ca = 0.0f;
        this.be = 0.0f;
        this.bn = 0.0f;
        this.aq = 0.0f;
        this.aj = 0.0f;
        this.ax = 0.0f;
        this.as = 0.0f;
        this.ao = 0.0f;
        this.ap = 0.0f;
        this.ak = 0.0f;
        this.al = 0.0f;
        this.am = 0.0f;
        this.ce = 0.0f;
        this.bi = 0.0f;
        this.bp = 0.0f;
        this.az = 0.0f;
        this.bq = 1.0f;
        this.at = 0.0f;
        this.ay = 1.0f;
        this.aw = 0.0f;
        this.bb = 1.0f;
        this.av = 0.0f;
        this.ba = 1.0f;
        this.q = false;
        this.r = false;
        this.bv = 0.0f;
        this.bu = 0.0f;
        this.cb = 0.0f;
        this.l = true;
        this.m = true;
        this.t = true;
        this.u = false;
        this.k = true;
    }

    public void setValuesWithoutAnim(float f, float f2, float f3) {
        this.ca = f;
        this.be = f2;
        this.bn = f3;
        this.aq = 1.0f;
        this.aj = 1.0f;
        this.ax = 1.0f;
        this.as = 1.0f;
        this.ao = 1.0f;
        this.ap = 1.0f;
        this.ak = 1.0f;
        this.al = 1.0f;
        this.am = 1.0f;
        this.ce = 1.0f;
        this.bi = 1.0f;
        this.bp = 1.0f;
        this.az = 1.0f;
        this.bq = 1.0f;
        this.at = 0.0f;
        this.ay = 1.0f;
        this.aw = 0.0f;
        this.bb = 1.0f;
        this.av = 0.0f;
        this.ba = 1.0f;
        this.q = Float.compare(f, 1.0f) == 0 && Float.compare(f2, 1.0f) == 0 && Float.compare(f3, 1.0f) == 0;
        this.r = Float.compare(f, 1.0f) == 0 && Float.compare(f2, 1.0f) == 0 && Float.compare(f3, 1.0f) == 0;
        this.bv = 1.0f;
        this.bu = 1.0f;
        this.cb = 1.0f;
        this.l = false;
        this.m = false;
        this.t = false;
        this.u = false;
        this.k = false;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.bm.setShader(null);
        this.bm.setAlpha((int) (this.aj * 255.0f));
        if (!this.q) {
            b(canvas);
        }
        if (this.u) {
            return;
        }
        this.bm.setAlpha(255);
        if (this.r) {
            b(canvas, this.az);
            c(canvas);
            d(canvas, this.az);
            a(canvas, this.az);
            e(canvas, this.ay, this.at);
            e(canvas, this.bb, this.aw);
            e(canvas, this.ba, this.av);
            b(canvas, this.ay, this.at);
            b(canvas, this.bb, this.aw);
            b(canvas, this.ba, this.av);
        } else {
            d(canvas, 1.0f);
            a(canvas, 1.0f);
            b(canvas, 1.0f);
        }
        if (this.q && this.k) {
            d(canvas);
            e(canvas, this.ay, this.at);
            e(canvas, this.bb, this.aw);
            e(canvas, this.ba, this.av);
            b(canvas, this.ay, this.at);
            b(canvas, this.bb, this.aw);
            b(canvas, this.ba, this.av);
        }
        e(canvas);
    }

    private void a(Canvas canvas, int i, int i2, float f) {
        canvas.save();
        canvas.rotate((this.ak * 90.0f) - 90.0f, getWidth() / 2.0f, getHeight() * this.f23190b);
        this.bg.setAlpha((int) (this.bv * 255.0f));
        int i3 = (this.ca <= 0.0f || !this.ae) ? 0 : this.bt;
        if (this.v) {
            i3 = this.bt;
        }
        Bitmap bitmap = this.bs[i3];
        if (bitmap == null) {
            return;
        }
        canvas.drawBitmap(bitmap, (getWidth() - i) / 2.0f, ((getHeight() * this.f23190b) - i2) - f, this.bg);
        canvas.restore();
    }

    public void b(boolean z) {
        this.ac = z;
        if (z) {
            setValuesWithoutAnim(1.0f, 1.0f, 1.0f);
        } else {
            invalidate();
        }
    }

    private void c(Canvas canvas) {
        if (this.j || !this.ac) {
            return;
        }
        Paint paint = new Paint(1);
        canvas.save();
        Bitmap bitmapD = d(R.drawable.ribbons);
        Matrix matrix = new Matrix();
        float fMin = Math.min(getWidth(), getHeight());
        float width = fMin / bitmapD.getWidth();
        matrix.preScale(width, width);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapD, 0, 0, bitmapD.getWidth(), bitmapD.getHeight(), matrix, true);
        canvas.drawBitmap(bitmapCreateBitmap, (getWidth() - fMin) / 2.0f, ((getHeight() * this.f23190b) + (Math.min(getWidth(), getHeight()) * (1.0f - this.f23190b))) - (bitmapCreateBitmap.getHeight() * 0.95f), paint);
        canvas.restore();
    }

    private void d(Canvas canvas, int i, int i2, float f) {
        int i3 = (this.be <= 0.0f || !this.ai) ? 0 : this.bt;
        if (this.v) {
            i3 = this.bt;
        }
        if (this.by[i3] == null) {
            return;
        }
        canvas.save();
        canvas.rotate((this.al * 90.0f) - 90.0f, getWidth() / 2.0f, getHeight() * this.f23190b);
        this.bg.setAlpha((int) (this.bu * 255.0f));
        canvas.drawBitmap(this.by[i3], ((getWidth() / 2.0f) - i) - f, ((getHeight() * this.f23190b) - (i2 * 0.211f)) + f, this.bg);
        canvas.restore();
    }

    private void c(Canvas canvas, int i, float f) {
        int i2 = (this.bn <= 0.0f || !this.af) ? 0 : this.bt;
        if (this.v) {
            i2 = this.bt;
        }
        if (this.bz[i2] == null) {
            return;
        }
        canvas.save();
        canvas.rotate((this.am * 90.0f) - 90.0f, getWidth() / 2.0f, getHeight() * this.f23190b);
        this.bg.setAlpha((int) (this.cb * 255.0f));
        canvas.drawBitmap(this.bz[i2], (getWidth() / 2.0f) + f, ((getHeight() * this.f23190b) - (i * 0.211f)) + f, this.bg);
        canvas.restore();
    }

    private void e(Canvas canvas) {
        Bitmap[] bitmapArr;
        Bitmap bitmap;
        if (this.p) {
            if ((!this.n && !this.w) || (bitmapArr = this.bs) == null || (bitmap = bitmapArr[0]) == null) {
                return;
            }
            int width = bitmap.getWidth();
            int height = this.bs[0].getHeight();
            float height2 = getHeight() * 0.03f;
            a(canvas, width, height, height2);
            float f = height2 * 0.707f;
            c(canvas, height, f);
            d(canvas, width, height, f);
        }
    }

    private void b(Canvas canvas, float f) {
        float f2 = this.bn;
        if (f2 <= 0.0f) {
            return;
        }
        if (f2 <= 0.3f) {
            f2 = 0.3f;
        }
        int iSaveLayer = canvas.saveLayer(this.ag, null, 31);
        canvas.save();
        float f3 = this.cf;
        float f4 = this.ap;
        float f5 = this.bd;
        float f6 = f2 * f3;
        float f7 = f4 * f6 * f5;
        if (this.ad) {
            f7 = this.bp * f6 * f5;
        }
        if (this.r) {
            f7 = f3 * f5 * f;
        }
        if (this.q) {
            f7 = f3 * f5 * this.bq;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() * this.f23190b);
        canvas.translate(this.cc, this.cd);
        canvas.save();
        canvas.rotate((this.am * 90.0f) + 30.0f, this.ar.g().x, this.ar.g().y);
        setPetalPaintShader(this.ar.l());
        if (this.g) {
            this.bm.setShader(this.ar.a());
        } else {
            this.bm.setShader(this.ar.l());
        }
        canvas.drawPath(this.ar.f(), this.bm);
        canvas.restore();
        canvas.restore();
        i(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    private void setPetalPaintShader(LinearGradient linearGradient) {
        if (this.g) {
            this.bm.setShader(this.ar.a());
        } else {
            this.bm.setShader(linearGradient);
        }
    }

    private void a(Canvas canvas, float f) {
        float f2 = this.ca;
        if (f2 <= 0.0f) {
            return;
        }
        if (f2 <= 0.3f) {
            f2 = 0.3f;
        }
        int iSaveLayer = canvas.saveLayer(this.ag, null, 31);
        canvas.save();
        float f3 = this.cf;
        float f4 = this.as;
        float f5 = this.bd;
        float f6 = f2 * f3;
        float f7 = f4 * f6 * f5;
        if (this.ad) {
            f7 = this.ce * f6 * f5;
        }
        if (this.r) {
            f7 = f3 * f5 * f;
        }
        if (this.q) {
            f7 = f3 * f5 * this.bq;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() * this.f23190b);
        canvas.translate(this.cc, this.cd);
        canvas.save();
        canvas.rotate((this.ak * 90.0f) - 90.0f, this.ar.g().x, this.ar.g().y);
        setPetalPaintShader(this.ar.h());
        this.bm.setAlpha((int) (this.ax * 255.0f));
        canvas.drawPath(this.ar.f(), this.bm);
        canvas.restore();
        canvas.restore();
        f(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    private void d(Canvas canvas, float f) {
        float f2 = this.be;
        if (f2 <= 0.0f) {
            return;
        }
        if (f2 <= 0.3f) {
            f2 = 0.3f;
        }
        float f3 = this.cf;
        float f4 = this.ao;
        float f5 = this.bd;
        float f6 = f2 * f3;
        float f7 = f4 * f6 * f5;
        if (this.ad) {
            f7 = this.bi * f6 * f5;
        }
        if (this.r) {
            f7 = f3 * f5 * f;
        }
        if (this.q) {
            f7 = f3 * f5 * this.bq;
        }
        int iSaveLayer = canvas.saveLayer(this.ag, null, 31);
        canvas.save();
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() * this.f23190b);
        canvas.translate(this.cc, this.cd);
        canvas.save();
        canvas.rotate((this.al * 90.0f) - 210.0f, this.ar.g().x, this.ar.g().y);
        setPetalPaintShader(this.ar.e());
        canvas.drawPath(this.ar.f(), this.bm);
        canvas.restore();
        canvas.restore();
        a(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    private void setPetalBackgroundColor(LinearGradient linearGradient) {
        if (this.u) {
            this.bm.setShader(null);
            this.bm.setColor(this.ar.n());
        } else if (this.g) {
            this.bm.setShader(this.ar.b());
        } else {
            this.bm.setShader(linearGradient);
        }
    }

    private void b(Canvas canvas) {
        canvas.save();
        float f = this.aq * this.bd * this.cf;
        if (this.q || this.r) {
            f *= this.bq;
        }
        canvas.scale(f, f, getWidth() / 2.0f, getHeight() * this.f23190b);
        setPetalBackgroundColor(this.ar.c());
        canvas.translate(this.cc, this.cd);
        canvas.save();
        canvas.rotate((this.aq * 60.0f) - 180.0f, this.ar.g().x, this.ar.g().y);
        canvas.drawPath(this.ar.f(), this.bm);
        canvas.restore();
        canvas.save();
        canvas.rotate((this.aq * 60.0f) + 60.0f, this.ar.g().x, this.ar.g().y);
        setPetalBackgroundColor(this.ar.o());
        canvas.drawPath(this.ar.f(), this.bm);
        canvas.restore();
        canvas.rotate((this.aq * 60.0f) - 60.0f, this.ar.g().x, this.ar.g().y);
        setPetalBackgroundColor(this.ar.d());
        canvas.drawPath(this.ar.f(), this.bm);
        canvas.restore();
    }

    private void f(Canvas canvas) {
        if (this.l) {
            canvas.save();
            float f = this.aq * this.bd * this.cf;
            float f2 = this.as;
            float f3 = f2 > 1.0f ? f2 * f : f;
            float f4 = this.ce;
            if (f4 > 1.0f) {
                f3 = f * f4;
            }
            canvas.scale(f3, f3, getWidth() / 2.0f, getHeight() * this.f23190b);
            canvas.translate(this.cc, this.cd);
            canvas.translate(-this.bk, 0.0f);
            canvas.rotate((this.aq * 60.0f) - 60.0f, this.bl.getWidth() / 2.0f, this.bl.getHeight() / 2.0f);
            canvas.drawBitmap(this.bl, 0.0f, 0.0f, this.bj);
            canvas.restore();
        }
    }

    private void a(Canvas canvas) {
        if (this.m) {
            canvas.save();
            float f = this.aq * this.bd * this.cf;
            float f2 = this.ao;
            float f3 = f2 > 1.0f ? f2 * f : f;
            float f4 = this.bi;
            if (f4 > 1.0f) {
                f3 = f * f4;
            }
            canvas.scale(f3, f3, getWidth() / 2.0f, getHeight() * this.f23190b);
            canvas.translate(this.cc, this.cd);
            canvas.translate(-this.bk, 0.0f);
            canvas.rotate((this.aq * 60.0f) - 180.0f, this.bl.getWidth() / 2.0f, this.bl.getHeight() / 2.0f);
            canvas.drawBitmap(this.bl, 0.0f, 0.0f, this.bj);
            canvas.restore();
        }
    }

    private void i(Canvas canvas) {
        if (this.t) {
            canvas.save();
            float f = this.aq * this.bd * this.cf;
            float f2 = this.ap;
            float f3 = f2 > 1.0f ? f2 * f : f;
            float f4 = this.bp;
            if (f4 > 1.0f) {
                f3 = f * f4;
            }
            canvas.scale(f3, f3, getWidth() / 2.0f, getHeight() * this.f23190b);
            canvas.translate(this.cc, this.cd);
            canvas.translate(-this.bk, 0.0f);
            canvas.rotate((this.aq * 60.0f) + 60.0f, this.bl.getWidth() / 2.0f, this.bl.getHeight() / 2.0f);
            canvas.drawBitmap(this.bl, 0.0f, 0.0f, this.bj);
            canvas.restore();
        }
    }

    private void e(Canvas canvas, float f, float f2) {
        if (this.k && this.y) {
            canvas.save();
            float f3 = this.bd * this.cf * f;
            canvas.scale(f3, f3, getWidth() / 2.0f, getHeight() * this.f23190b);
            if (this.r) {
                setPetalPaintShader(this.ar.e());
            }
            if (this.q) {
                this.bm.setShader(this.ar.a());
            }
            int i = (int) (f2 * 255.0f);
            this.bm.setAlpha(i);
            canvas.translate(this.cc, this.cd);
            canvas.save();
            canvas.rotate(-120.0f, this.ar.g().x, this.ar.g().y);
            canvas.drawPath(this.ar.f(), this.bm);
            canvas.restore();
            canvas.save();
            canvas.rotate(120.0f, this.ar.g().x, this.ar.g().y);
            if (this.r) {
                setPetalPaintShader(this.ar.l());
            }
            this.bm.setAlpha(i);
            canvas.drawPath(this.ar.f(), this.bm);
            canvas.restore();
            canvas.rotate((this.aq * 60.0f) - 60.0f, this.ar.g().x, this.ar.g().y);
            if (this.r) {
                setPetalPaintShader(this.ar.h());
            }
            this.bm.setAlpha(i);
            canvas.drawPath(this.ar.f(), this.bm);
            canvas.restore();
        }
    }

    private void d(Canvas canvas) {
        canvas.save();
        canvas.save();
        float f = this.cf * this.bd * this.az * this.bq;
        canvas.scale(f, f, getWidth() / 2.0f, getHeight() * this.f23190b);
        canvas.translate(this.cc, this.cd);
        canvas.rotate(120.0f, this.ar.g().x, this.ar.g().y);
        this.bm.setShader(this.ar.a());
        canvas.drawPath(this.ar.f(), this.bm);
        canvas.restore();
        c(canvas);
        float f2 = this.cf * this.bd * this.az * this.bq;
        canvas.scale(f2, f2, getWidth() / 2.0f, getHeight() * this.f23190b);
        canvas.translate(this.cc, this.cd);
        canvas.rotate(-120.0f, this.ar.g().x, this.ar.g().y);
        this.bm.setShader(this.ar.a());
        canvas.drawPath(this.ar.f(), this.bm);
        canvas.restore();
        canvas.save();
        float f3 = this.cf * this.bd * this.az * this.bq;
        canvas.scale(f3, f3, getWidth() / 2.0f, getHeight() * this.f23190b);
        canvas.translate(this.cc, this.cd);
        this.bm.setShader(this.ar.a());
        this.bm.setAlpha((int) (this.ax * 255.0f));
        canvas.drawPath(this.ar.f(), this.bm);
        canvas.restore();
    }

    private void b(Canvas canvas, float f, float f2) {
        if (this.k && this.y) {
            this.bm.setStrokeWidth(4.0f);
            this.bm.setStyle(Paint.Style.STROKE);
            if (this.q) {
                this.bm.setShader(this.ar.a());
            }
            if (this.r) {
                setPetalPaintShader(this.ar.e());
            }
            this.bm.setAlpha((int) (f2 * 255.0f));
            canvas.save();
            float f3 = this.cf * this.bd * f;
            canvas.scale(f3, f3, getWidth() / 2.0f, getHeight() * this.f23190b);
            canvas.translate(this.cc, this.cd);
            canvas.rotate(-120.0f, this.ar.g().x, this.ar.g().y);
            canvas.drawPath(this.ar.f(), this.bm);
            canvas.restore();
            canvas.save();
            if (this.r) {
                setPetalPaintShader(this.ar.h());
            }
            float f4 = this.cf * this.bd * f;
            canvas.scale(f4, f4, getWidth() / 2.0f, getHeight() * this.f23190b);
            canvas.translate(this.cc, this.cd);
            canvas.drawPath(this.ar.f(), this.bm);
            canvas.restore();
            canvas.save();
            if (this.r) {
                setPetalPaintShader(this.ar.l());
            }
            float f5 = this.cf * this.bd * f;
            canvas.scale(f5, f5, getWidth() / 2.0f, getHeight() * this.f23190b);
            canvas.translate(this.cc, this.cd);
            canvas.rotate(120.0f, this.ar.g().x, this.ar.g().y);
            canvas.drawPath(this.ar.f(), this.bm);
            canvas.restore();
            this.bm.setStyle(Paint.Style.FILL);
        }
    }

    private void k() {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.33333334f, 1.0f);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.53333336f, 1.0f);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(1.0f, 1.0f);
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("startAlpha", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat4), PropertyValuesHolder.ofKeyframe("topAlpha", keyframeOfFloat, keyframeOfFloat3, keyframeOfFloat4), PropertyValuesHolder.ofKeyframe("rotate", keyframeOfFloat, keyframeOfFloat4));
        this.br = valueAnimatorOfPropertyValuesHolder;
        valueAnimatorOfPropertyValuesHolder.setInterpolator(new qib());
        this.br.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.ucd.cloveranimation.CloverView.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CloverView.this.aj = ((Float) valueAnimator.getAnimatedValue("startAlpha")).floatValue();
                CloverView.this.ax = ((Float) valueAnimator.getAnimatedValue("topAlpha")).floatValue();
                CloverView.this.aq = ((Float) valueAnimator.getAnimatedValue("rotate")).floatValue();
                CloverView.this.invalidate();
            }
        });
        this.br.setDuration(750L);
        this.br.start();
    }

    private PropertyValuesHolder i(qib qibVar) {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.4375f, 1.0f);
        keyframeOfFloat2.setInterpolator(qibVar);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(1.0f, 1.0f);
        keyframeOfFloat3.setInterpolator(qibVar);
        return PropertyValuesHolder.ofKeyframe("topAngel", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3);
    }

    private PropertyValuesHolder a(qib qibVar) {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.16666667f, 0.0f);
        keyframeOfFloat2.setInterpolator(qibVar);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.25f, 1.0f);
        keyframeOfFloat3.setInterpolator(qibVar);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(1.0f, 1.0f);
        keyframeOfFloat4.setInterpolator(qibVar);
        return PropertyValuesHolder.ofKeyframe("runAlpha", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4);
    }

    private PropertyValuesHolder g(qib qibVar) {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.4375f, 1.05f);
        keyframeOfFloat2.setInterpolator(qibVar);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.65625f, 0.98f);
        keyframeOfFloat3.setInterpolator(qibVar);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.71875f, 1.01f);
        keyframeOfFloat4.setInterpolator(qibVar);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.8125f, 1.0f);
        keyframeOfFloat5.setInterpolator(qibVar);
        return PropertyValuesHolder.ofKeyframe(Constant.MAP_KEY_TOP, keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, Keyframe.ofFloat(1.0f, 1.0f));
    }

    private PropertyValuesHolder e(qib qibVar) {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.125f, 0.0f);
        keyframeOfFloat2.setInterpolator(qibVar);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.625f, 1.0f);
        keyframeOfFloat3.setInterpolator(qibVar);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(1.0f, 1.0f);
        keyframeOfFloat4.setInterpolator(qibVar);
        return PropertyValuesHolder.ofKeyframe("leftAngel", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4);
    }

    private PropertyValuesHolder j(qib qibVar) {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.29166666f, 0.0f);
        keyframeOfFloat2.setInterpolator(qibVar);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.375f, 1.0f);
        keyframeOfFloat3.setInterpolator(qibVar);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(1.0f, 1.0f);
        keyframeOfFloat4.setInterpolator(qibVar);
        return PropertyValuesHolder.ofKeyframe("sleepAlpha", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4);
    }

    private PropertyValuesHolder c(qib qibVar) {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.125f, 0.0f);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.625f, 1.05f);
        keyframeOfFloat3.setInterpolator(qibVar);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.84375f, 0.98f);
        keyframeOfFloat4.setInterpolator(qibVar);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.90625f, 1.01f);
        keyframeOfFloat5.setInterpolator(qibVar);
        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        keyframeOfFloat6.setInterpolator(qibVar);
        return PropertyValuesHolder.ofKeyframe("left", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6);
    }

    private PropertyValuesHolder d(qib qibVar) {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.0625f, 0.0f);
        keyframeOfFloat2.setInterpolator(qibVar);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.53125f, 1.0f);
        keyframeOfFloat3.setInterpolator(qibVar);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(1.0f, 1.0f);
        keyframeOfFloat4.setInterpolator(qibVar);
        return PropertyValuesHolder.ofKeyframe("rightAngel", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4);
    }

    private PropertyValuesHolder h(qib qibVar) {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.22916667f, 0.0f);
        keyframeOfFloat2.setInterpolator(qibVar);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.3125f, 1.0f);
        keyframeOfFloat3.setInterpolator(qibVar);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(1.0f, 1.0f);
        keyframeOfFloat4.setInterpolator(qibVar);
        return PropertyValuesHolder.ofKeyframe("smileAlpha", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4);
    }

    private PropertyValuesHolder b(qib qibVar) {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.0625f, 0.0f);
        keyframeOfFloat2.setInterpolator(qibVar);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.53125f, 1.05f);
        keyframeOfFloat3.setInterpolator(qibVar);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.75f, 0.98f);
        keyframeOfFloat4.setInterpolator(qibVar);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.8125f, 1.01f);
        keyframeOfFloat5.setInterpolator(qibVar);
        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(0.90625f, 1.0f);
        keyframeOfFloat6.setInterpolator(qibVar);
        return PropertyValuesHolder.ofKeyframe("right", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6, Keyframe.ofFloat(1.0f, 1.0f));
    }

    private void j() {
        qib qibVar = new qib();
        PropertyValuesHolder propertyValuesHolderI = i(qibVar);
        PropertyValuesHolder propertyValuesHolderA = a(qibVar);
        PropertyValuesHolder propertyValuesHolderG = g(qibVar);
        PropertyValuesHolder propertyValuesHolderE = e(qibVar);
        PropertyValuesHolder propertyValuesHolderJ = j(qibVar);
        PropertyValuesHolder propertyValuesHolderC = c(qibVar);
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(propertyValuesHolderG, propertyValuesHolderA, propertyValuesHolderI, d(qibVar), propertyValuesHolderJ, b(qibVar), propertyValuesHolderE, h(qibVar), propertyValuesHolderC);
        this.bw = valueAnimatorOfPropertyValuesHolder;
        valueAnimatorOfPropertyValuesHolder.setInterpolator(new FastOutSlowInInterpolator());
        this.bw.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.ucd.cloveranimation.CloverView.7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CloverView.this.as = ((Float) valueAnimator.getAnimatedValue(Constant.MAP_KEY_TOP)).floatValue();
                CloverView.this.bv = ((Float) valueAnimator.getAnimatedValue("runAlpha")).floatValue();
                CloverView.this.ak = ((Float) valueAnimator.getAnimatedValue("topAngel")).floatValue();
                CloverView.this.ao = ((Float) valueAnimator.getAnimatedValue("left")).floatValue();
                CloverView.this.bu = ((Float) valueAnimator.getAnimatedValue("sleepAlpha")).floatValue();
                CloverView.this.al = ((Float) valueAnimator.getAnimatedValue("leftAngel")).floatValue();
                CloverView.this.ap = ((Float) valueAnimator.getAnimatedValue("right")).floatValue();
                CloverView.this.cb = ((Float) valueAnimator.getAnimatedValue("smileAlpha")).floatValue();
                CloverView.this.am = ((Float) valueAnimator.getAnimatedValue("rightAngel")).floatValue();
                CloverView.this.invalidate();
            }
        });
        this.bw.setDuration(2400L);
    }

    private void e(final float f, final float f2, final float f3) {
        j();
        this.bw.addListener(new Animator.AnimatorListener() { // from class: com.huawei.ucd.cloveranimation.CloverView.10
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                CloverView.this.bx = f;
                CloverView.this.bh = f2;
                CloverView.this.bo = f3;
                if (CloverView.this.f23191c != null) {
                    CloverView.this.f23191c.onFinished();
                }
                if (CloverView.this.o) {
                    CloverView.this.ad = true;
                    CloverView.this.b(1.0f, 1.0f, 1.0f);
                    CloverView.this.s = false;
                } else {
                    if (!CloverView.this.y || Float.compare(f, 1.0f) != 0 || Float.compare(f2, 1.0f) != 0 || Float.compare(f3, 1.0f) != 0) {
                        CloverView.this.s = false;
                        return;
                    }
                    CloverView.this.r = true;
                    CloverView.this.q = false;
                    CloverView.this.l();
                    CloverView.this.o();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                CloverView.this.s = false;
                if (CloverView.this.f23191c != null) {
                    CloverView.this.f23191c.onFinished();
                }
            }
        });
        this.bw.start();
    }

    private PropertyValuesHolder getValueScaleRotation() {
        qib qibVar = new qib();
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.3030303f, 1.05f);
        keyframeOfFloat2.setInterpolator(qibVar);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.6363636f, 0.98f);
        keyframeOfFloat3.setInterpolator(qibVar);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.8181818f, 1.01f);
        keyframeOfFloat4.setInterpolator(qibVar);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(1.0f, 1.0f);
        keyframeOfFloat5.setInterpolator(qibVar);
        return PropertyValuesHolder.ofKeyframe("valueScale", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScaleRatio(float f) {
        if (this.ae) {
            float f2 = this.bx;
            this.ce = f2 + ((1.0f - f2) * f);
        } else {
            this.ce = 1.0f;
        }
        if (this.ai) {
            float f3 = this.bh;
            this.bi = f3 + ((1.0f - f3) * f);
        } else {
            this.bi = 1.0f;
        }
        if (this.af) {
            float f4 = this.bo;
            this.bp = f4 + ((1.0f - f4) * f);
        } else {
            this.bp = 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final float f, final float f2, final float f3) {
        this.z = true;
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(getValueScaleRotation());
        this.cg = valueAnimatorOfPropertyValuesHolder;
        valueAnimatorOfPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.ucd.cloveranimation.CloverView.8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CloverView.this.setScaleRatio(((Float) valueAnimator.getAnimatedValue("valueScale")).floatValue());
                CloverView.this.ca = f;
                CloverView.this.be = f2;
                CloverView.this.bn = f3;
                CloverView.this.invalidate();
            }
        });
        this.cg.setDuration(825L);
        this.cg.addListener(new Animator.AnimatorListener() { // from class: com.huawei.ucd.cloveranimation.CloverView.6
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                CloverView.this.bx = f;
                CloverView.this.bh = f2;
                CloverView.this.bo = f3;
                if (Float.compare(f, 1.0f) != 0 || Float.compare(f2, 1.0f) != 0 || Float.compare(f3, 1.0f) != 0) {
                    CloverView.this.z = false;
                    return;
                }
                CloverView.this.r = true;
                CloverView.this.q = false;
                CloverView.this.l();
                CloverView.this.o();
            }
        });
        this.cg.start();
    }

    public void c() {
        h();
        this.r = false;
        this.q = true;
        l();
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        qib qibVar = new qib();
        qic qicVar = new qic();
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.6666667f, 1.0f);
        keyframeOfFloat2.setInterpolator(qibVar);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.0f, 1.0f);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.22222222f, 0.95f);
        keyframeOfFloat4.setInterpolator(qicVar);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.6666667f, 1.02f);
        keyframeOfFloat5.setInterpolator(qicVar);
        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        keyframeOfFloat6.setInterpolator(qicVar);
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("scaleIn", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat6), PropertyValuesHolder.ofKeyframe("resilience", keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6));
        this.bc = valueAnimatorOfPropertyValuesHolder;
        valueAnimatorOfPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.ucd.cloveranimation.CloverView.11
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CloverView.this.az = ((Float) valueAnimator.getAnimatedValue("scaleIn")).floatValue();
                CloverView.this.bq = ((Float) valueAnimator.getAnimatedValue("resilience")).floatValue();
                CloverView.this.invalidate();
            }
        });
        this.bc.setDuration(675L);
        this.bc.start();
    }

    private PropertyValuesHolder getAlphaRotation() {
        return PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.09090909f, 0.3f), Keyframe.ofFloat(0.6818182f, 0.0f), Keyframe.ofFloat(1.0f, 0.0f));
    }

    private PropertyValuesHolder a(FastOutSlowInInterpolator fastOutSlowInInterpolator) {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.9f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.6818182f, 1.2f);
        keyframeOfFloat2.setInterpolator(fastOutSlowInInterpolator);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(1.0f, 1.0f);
        keyframeOfFloat3.setInterpolator(fastOutSlowInInterpolator);
        return PropertyValuesHolder.ofKeyframe("scale", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3);
    }

    private PropertyValuesHolder getAlphaRotation1() {
        return PropertyValuesHolder.ofKeyframe("alpha1", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.22727273f, 0.0f), Keyframe.ofFloat(0.3181818f, 0.3f), Keyframe.ofFloat(0.84090906f, 0.0f), Keyframe.ofFloat(1.0f, 0.0f));
    }

    private PropertyValuesHolder b(FastOutSlowInInterpolator fastOutSlowInInterpolator) {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 1.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.22727273f, 0.9f);
        keyframeOfFloat2.setInterpolator(fastOutSlowInInterpolator);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.84090906f, 1.2f);
        keyframeOfFloat3.setInterpolator(fastOutSlowInInterpolator);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(1.0f, 1.0f);
        keyframeOfFloat4.setInterpolator(fastOutSlowInInterpolator);
        return PropertyValuesHolder.ofKeyframe("scale1", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4);
    }

    private PropertyValuesHolder getAlphaRotation2() {
        return PropertyValuesHolder.ofKeyframe("alpha2", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.45454547f, 0.0f), Keyframe.ofFloat(0.54545456f, 0.3f), Keyframe.ofFloat(1.0f, 0.0f));
    }

    private PropertyValuesHolder d(FastOutSlowInInterpolator fastOutSlowInInterpolator) {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 1.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.45454547f, 0.9f);
        keyframeOfFloat2.setInterpolator(fastOutSlowInInterpolator);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(1.0f, 1.2f);
        keyframeOfFloat3.setInterpolator(fastOutSlowInInterpolator);
        return PropertyValuesHolder.ofKeyframe("scale2", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncourageAnimValue(ValueAnimator valueAnimator) {
        this.at = ((Float) valueAnimator.getAnimatedValue("alpha")).floatValue();
        this.ay = ((Float) valueAnimator.getAnimatedValue("scale")).floatValue();
        this.aw = ((Float) valueAnimator.getAnimatedValue("alpha1")).floatValue();
        this.bb = ((Float) valueAnimator.getAnimatedValue("scale1")).floatValue();
        this.av = ((Float) valueAnimator.getAnimatedValue("alpha2")).floatValue();
        this.ba = ((Float) valueAnimator.getAnimatedValue("scale2")).floatValue();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.y) {
            FastOutSlowInInterpolator fastOutSlowInInterpolator = new FastOutSlowInInterpolator();
            ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(getAlphaRotation(), a(fastOutSlowInInterpolator), getAlphaRotation1(), b(fastOutSlowInInterpolator), getAlphaRotation2(), d(fastOutSlowInInterpolator));
            this.au = valueAnimatorOfPropertyValuesHolder;
            valueAnimatorOfPropertyValuesHolder.setInterpolator(new FastOutSlowInInterpolator());
            this.au.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.ucd.cloveranimation.CloverView.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CloverView.this.setEncourageAnimValue(valueAnimator);
                }
            });
            this.au.setDuration(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            this.au.addListener(new Animator.AnimatorListener() { // from class: com.huawei.ucd.cloveranimation.CloverView.5
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    CloverView.this.d();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    if (CloverView.this.cl != null) {
                        CloverView.this.cl.onFinished();
                    }
                }
            });
            this.au.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.r) {
            this.z = false;
            this.s = false;
            AddFrameListener addFrameListener = this.cl;
            if (addFrameListener != null) {
                addFrameListener.onFinished();
            }
        }
        if (this.o) {
            if (this.x) {
                e(this.an);
            } else {
                c();
            }
            this.x = !this.x;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.ch == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.h = motionEvent.getX();
            this.f = motionEvent.getY();
            this.ah = 0;
        } else if (action == 1) {
            int i = this.ah;
            if (i == 0 || (i == 2 && !this.e)) {
                b(motionEvent.getX(), motionEvent.getY());
            }
            this.e = false;
        } else if (action == 2) {
            if (!this.e && (Math.abs(motionEvent.getX() - this.h) > 10.0f || Math.abs(motionEvent.getY() - this.f) > 10.0f)) {
                this.e = true;
            }
            this.ah = 2;
        }
        return true;
    }

    public boolean b(Path path, float f, float f2) {
        RectF rectF = new RectF();
        Region region = new Region();
        path.computeBounds(rectF, true);
        float f3 = this.bd * this.cf;
        region.setPath(path, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        return region.contains((int) (f / f3), (int) (f2 / f3));
    }

    private void b(float f, float f2) {
        float width = (getWidth() / 2.0f) - (((this.ar.j() * this.bd) * this.cf) / 2.0f);
        float height = (getHeight() * this.f23190b) - ((this.ar.i() * this.bd) * this.cf);
        if (b(this.ar.f(), f - width, f2 - height)) {
            this.ch.onTopClick();
            return;
        }
        float width2 = getWidth() / 2.0f;
        float height2 = getHeight() * this.f23190b;
        double d = width2;
        double d2 = f - width2;
        double d3 = f2 - height2;
        double d4 = height2;
        if (b(this.ar.f(), ((float) (((Math.cos(2.0943951023931953d) * d2) + d) - (Math.sin(2.0943951023931953d) * d3))) - width, ((float) ((Math.cos(2.0943951023931953d) * d3) + ((Math.sin(2.0943951023931953d) * d2) + d4))) - height)) {
            this.ch.onLeftClick();
            return;
        }
        if (b(this.ar.f(), ((float) ((d + (Math.cos(-2.0943951023931953d) * d2)) - (Math.sin(-2.0943951023931953d) * d3))) - width, ((float) ((d4 + (d2 * Math.sin(-2.0943951023931953d))) + (d3 * Math.cos(-2.0943951023931953d)))) - height)) {
            this.ch.onRightClick();
        }
    }
}
