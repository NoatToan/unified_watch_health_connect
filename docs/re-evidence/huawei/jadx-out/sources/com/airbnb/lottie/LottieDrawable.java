package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.ct;
import defpackage.cv;
import defpackage.cx;
import defpackage.ed;
import defpackage.ef;
import defpackage.ei;
import defpackage.fj;
import defpackage.fk;
import defpackage.fo;
import defpackage.fs;
import defpackage.fw;
import defpackage.gs;
import defpackage.hy;
import defpackage.iw;
import defpackage.iy;
import defpackage.jc;
import defpackage.jd;
import defpackage.jf;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes21.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f1917a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f1918c = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    private static final Executor j = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new iw());
    private boolean aa;
    private Handler ab;
    private OnVisibleAction ac;
    private final ArrayList<LazyCompositionTask> ad;
    private RenderMode ae;
    private final Matrix af;
    private boolean ag;
    private final ValueAnimator.AnimatorUpdateListener ah;
    private boolean ai;
    private Canvas aj;
    private Bitmap ak;
    private final Semaphore al;
    private boolean am;
    private Rect an;
    private Matrix ao;
    private RectF ap;
    private Rect aq;
    private Matrix ar;
    private Paint as;
    private final Runnable au;
    private RectF av;
    private boolean aw;
    private boolean ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ct f1919b;
    ei d;
    String e;
    private Rect f;
    private int g;
    private final jd h;
    private AsyncUpdates i;
    private boolean k;
    private cx l;
    private boolean m;
    private RectF n;
    private gs o;
    private Map<String, Typeface> p;
    private boolean q;
    private boolean r;
    private ImageAssetDelegate s;
    private fj t;
    private boolean u;
    private fk v;
    private boolean w;
    private Runnable x;
    private String y;
    private float z;

    public interface LazyCompositionTask {
        void run(cx cxVar);
    }

    enum OnVisibleAction {
        NONE,
        PLAY,
        RESUME
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public /* synthetic */ void c(ValueAnimator valueAnimator) {
        if (h()) {
            invalidateSelf();
            return;
        }
        gs gsVar = this.o;
        if (gsVar != null) {
            gsVar.setProgress(this.h.a());
        }
    }

    public /* synthetic */ void ac() {
        gs gsVar = this.o;
        if (gsVar == null) {
            return;
        }
        try {
            this.al.acquire();
            gsVar.setProgress(this.h.a());
            if (f1917a && this.u) {
                if (this.ab == null) {
                    this.ab = new Handler(Looper.getMainLooper());
                    this.x = new Runnable() { // from class: ea
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f32562a.y();
                        }
                    };
                }
                this.ab.post(this.x);
            }
        } catch (InterruptedException unused) {
        } finally {
            this.al.release();
        }
    }

    public /* synthetic */ void y() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public LottieDrawable() {
        jd jdVar = new jd();
        this.h = jdVar;
        this.aw = true;
        this.r = false;
        this.am = false;
        this.ac = OnVisibleAction.NONE;
        this.ad = new ArrayList<>();
        this.aa = false;
        this.k = true;
        this.g = 255;
        this.m = false;
        this.ae = RenderMode.AUTOMATIC;
        this.ax = false;
        this.af = new Matrix();
        this.u = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: dp
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f32170c.c(valueAnimator);
            }
        };
        this.ah = animatorUpdateListener;
        this.al = new Semaphore(1);
        this.au = new Runnable() { // from class: du
            @Override // java.lang.Runnable
            public final void run() {
                this.f32377a.ac();
            }
        };
        this.z = -3.4028235E38f;
        jdVar.addUpdateListener(animatorUpdateListener);
    }

    public boolean c() {
        return this.q;
    }

    public void a(boolean z) {
        if (this.q == z) {
            return;
        }
        this.q = z;
        if (this.l != null) {
            ah();
        }
    }

    public void c(boolean z) {
        if (z != this.k) {
            this.k = z;
            gs gsVar = this.o;
            if (gsVar != null) {
                gsVar.b(z);
            }
            invalidateSelf();
        }
    }

    public boolean f() {
        return this.k;
    }

    public void c(String str) {
        this.y = str;
    }

    public String k() {
        return this.y;
    }

    public void j(boolean z) {
        this.aa = z;
    }

    public boolean m() {
        return this.aa;
    }

    public boolean a(cx cxVar) {
        if (this.l == cxVar) {
            return false;
        }
        this.u = true;
        d();
        this.l = cxVar;
        ah();
        this.h.a(cxVar);
        e(this.h.getAnimatedFraction());
        Iterator it = new ArrayList(this.ad).iterator();
        while (it.hasNext()) {
            LazyCompositionTask lazyCompositionTask = (LazyCompositionTask) it.next();
            if (lazyCompositionTask != null) {
                lazyCompositionTask.run(cxVar);
            }
            it.remove();
        }
        this.ad.clear();
        cxVar.a(this.ai);
        ae();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void d(RenderMode renderMode) {
        this.ae = renderMode;
        ae();
    }

    public AsyncUpdates b() {
        AsyncUpdates asyncUpdates = this.i;
        return asyncUpdates != null ? asyncUpdates : cv.a();
    }

    public boolean h() {
        return b() == AsyncUpdates.ENABLED;
    }

    public void e(AsyncUpdates asyncUpdates) {
        this.i = asyncUpdates;
    }

    public RenderMode s() {
        return this.ax ? RenderMode.SOFTWARE : RenderMode.HARDWARE;
    }

    private void ae() {
        cx cxVar = this.l;
        if (cxVar == null) {
            return;
        }
        this.ax = this.ae.useSoftwareRendering(Build.VERSION.SDK_INT, cxVar.n(), cxVar.h());
    }

    public void i(boolean z) {
        this.ai = z;
        cx cxVar = this.l;
        if (cxVar != null) {
            cxVar.a(z);
        }
    }

    public void g(boolean z) {
        if (this.ag == z) {
            return;
        }
        this.ag = z;
        gs gsVar = this.o;
        if (gsVar != null) {
            gsVar.setOutlineMasksAndMattes(z);
        }
    }

    public PerformanceTracker o() {
        cx cxVar = this.l;
        if (cxVar != null) {
            return cxVar.o();
        }
        return null;
    }

    public void d(boolean z) {
        this.w = z;
    }

    public boolean v() {
        return this.w;
    }

    public boolean g() {
        return this.m;
    }

    public void b(boolean z) {
        if (z != this.m) {
            this.m = z;
            invalidateSelf();
        }
    }

    private void ah() {
        cx cxVar = this.l;
        if (cxVar == null) {
            return;
        }
        gs gsVar = new gs(this, hy.c(cxVar), cxVar.j(), cxVar);
        this.o = gsVar;
        if (this.ag) {
            gsVar.setOutlineMasksAndMattes(true);
        }
        this.o.b(this.k);
    }

    public void d() {
        if (this.h.isRunning()) {
            this.h.cancel();
            if (!isVisible()) {
                this.ac = OnVisibleAction.NONE;
            }
        }
        this.l = null;
        this.o = null;
        this.v = null;
        this.z = -3.4028235E38f;
        this.h.d();
        invalidateSelf();
    }

    public void f(boolean z) {
        this.am = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.u) {
            return;
        }
        this.u = true;
        if ((!f1917a || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.g = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        iy.d("Use addColorFilter instead.");
    }

    private boolean aj() {
        cx cxVar = this.l;
        if (cxVar == null) {
            return false;
        }
        float f = this.z;
        float fA = this.h.a();
        this.z = fA;
        return Math.abs(fA - f) * cxVar.e() >= 50.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        gs gsVar = this.o;
        if (gsVar == null) {
            return;
        }
        boolean zH = h();
        if (zH) {
            try {
                this.al.acquire();
            } catch (InterruptedException unused) {
                if (cv.e()) {
                    cv.e("Drawable#draw");
                }
                if (!zH) {
                    return;
                }
                this.al.release();
                if (gsVar.e() == this.h.a()) {
                    return;
                }
            } catch (Throwable th) {
                if (cv.e()) {
                    cv.e("Drawable#draw");
                }
                if (zH) {
                    this.al.release();
                    if (gsVar.e() != this.h.a()) {
                        j.execute(this.au);
                    }
                }
                throw th;
            }
        }
        if (cv.e()) {
            cv.c("Drawable#draw");
        }
        if (zH && aj()) {
            e(this.h.a());
        }
        if (this.am) {
            try {
                if (this.ax) {
                    a(canvas, gsVar);
                } else {
                    d(canvas);
                }
            } catch (Throwable th2) {
                iy.e("Lottie crashed in draw!", th2);
            }
        } else if (this.ax) {
            a(canvas, gsVar);
        } else {
            d(canvas);
        }
        this.u = false;
        if (cv.e()) {
            cv.e("Drawable#draw");
        }
        if (zH) {
            this.al.release();
            if (gsVar.e() == this.h.a()) {
                return;
            }
            j.execute(this.au);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        aa();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        e();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return u();
    }

    public void aa() {
        if (this.o == null) {
            this.ad.add(new LazyCompositionTask() { // from class: ds
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(cx cxVar) {
                    this.f32291a.e(cxVar);
                }
            });
            return;
        }
        ae();
        if (ag() || q() == 0) {
            if (isVisible()) {
                this.h.f();
                this.ac = OnVisibleAction.NONE;
            } else {
                this.ac = OnVisibleAction.PLAY;
            }
        }
        if (ag()) {
            return;
        }
        fw fwVarAk = ak();
        if (fwVarAk != null) {
            e((int) fwVarAk.f34630a);
        } else {
            e((int) (r() < 0.0f ? n() : l()));
        }
        this.h.c();
        if (isVisible()) {
            return;
        }
        this.ac = OnVisibleAction.NONE;
    }

    public /* synthetic */ void e(cx cxVar) {
        aa();
    }

    private fw ak() {
        Iterator<String> it = f1918c.iterator();
        fw fwVarB = null;
        while (it.hasNext()) {
            fwVarB = this.l.b(it.next());
            if (fwVarB != null) {
                break;
            }
        }
        return fwVarB;
    }

    public void e() {
        this.ad.clear();
        this.h.c();
        if (isVisible()) {
            return;
        }
        this.ac = OnVisibleAction.NONE;
    }

    public void z() {
        if (this.o == null) {
            this.ad.add(new LazyCompositionTask() { // from class: eb
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(cx cxVar) {
                    this.e.c(cxVar);
                }
            });
            return;
        }
        ae();
        if (ag() || q() == 0) {
            if (isVisible()) {
                this.h.o();
                this.ac = OnVisibleAction.NONE;
            } else {
                this.ac = OnVisibleAction.RESUME;
            }
        }
        if (ag()) {
            return;
        }
        e((int) (r() < 0.0f ? n() : l()));
        this.h.c();
        if (isVisible()) {
            return;
        }
        this.ac = OnVisibleAction.NONE;
    }

    public /* synthetic */ void c(cx cxVar) {
        z();
    }

    public void c(final int i) {
        if (this.l == null) {
            this.ad.add(new LazyCompositionTask() { // from class: dy
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(cx cxVar) {
                    this.f32502a.d(i, cxVar);
                }
            });
        } else {
            this.h.d(i);
        }
    }

    public /* synthetic */ void d(int i, cx cxVar) {
        c(i);
    }

    public float n() {
        return this.h.h();
    }

    public void c(final float f) {
        cx cxVar = this.l;
        if (cxVar == null) {
            this.ad.add(new LazyCompositionTask() { // from class: dt
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(cx cxVar2) {
                    this.e.c(f, cxVar2);
                }
            });
        } else {
            c((int) jc.a(cxVar.l(), this.l.b(), f));
        }
    }

    public /* synthetic */ void c(float f, cx cxVar) {
        c(f);
    }

    public void a(final int i) {
        if (this.l == null) {
            this.ad.add(new LazyCompositionTask() { // from class: dv
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(cx cxVar) {
                    this.f32405b.a(i, cxVar);
                }
            });
        } else {
            this.h.b(i + 0.99f);
        }
    }

    public /* synthetic */ void a(int i, cx cxVar) {
        a(i);
    }

    public float l() {
        return this.h.e();
    }

    public void d(final float f) {
        cx cxVar = this.l;
        if (cxVar == null) {
            this.ad.add(new LazyCompositionTask() { // from class: dw
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(cx cxVar2) {
                    this.f32435c.e(f, cxVar2);
                }
            });
        } else {
            this.h.b(jc.a(cxVar.l(), this.l.b(), f));
        }
    }

    public /* synthetic */ void e(float f, cx cxVar) {
        d(f);
    }

    public void j(final String str) {
        cx cxVar = this.l;
        if (cxVar == null) {
            this.ad.add(new LazyCompositionTask() { // from class: dl
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(cx cxVar2) {
                    this.f31933a.d(str, cxVar2);
                }
            });
            return;
        }
        fw fwVarB = cxVar.b(str);
        if (fwVarB == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        c((int) fwVarB.f34630a);
    }

    public /* synthetic */ void d(String str, cx cxVar) {
        j(str);
    }

    public void b(final String str) {
        cx cxVar = this.l;
        if (cxVar == null) {
            this.ad.add(new LazyCompositionTask() { // from class: dm
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(cx cxVar2) {
                    this.f31991c.e(str, cxVar2);
                }
            });
            return;
        }
        fw fwVarB = cxVar.b(str);
        if (fwVarB == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        a((int) (fwVarB.f34630a + fwVarB.f34631c));
    }

    public /* synthetic */ void e(String str, cx cxVar) {
        b(str);
    }

    public void f(final String str) {
        cx cxVar = this.l;
        if (cxVar == null) {
            this.ad.add(new LazyCompositionTask() { // from class: dg
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(cx cxVar2) {
                    this.f31766a.c(str, cxVar2);
                }
            });
            return;
        }
        fw fwVarB = cxVar.b(str);
        if (fwVarB == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i = (int) fwVarB.f34630a;
        c(i, ((int) fwVarB.f34631c) + i);
    }

    public /* synthetic */ void c(String str, cx cxVar) {
        f(str);
    }

    public void c(final String str, final String str2, final boolean z) {
        cx cxVar = this.l;
        if (cxVar == null) {
            this.ad.add(new LazyCompositionTask() { // from class: dn
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(cx cxVar2) {
                    this.f32041c.a(str, str2, z, cxVar2);
                }
            });
            return;
        }
        fw fwVarB = cxVar.b(str);
        if (fwVarB == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i = (int) fwVarB.f34630a;
        fw fwVarB2 = this.l.b(str2);
        if (fwVarB2 == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
        }
        c(i, (int) (fwVarB2.f34630a + (z ? 1.0f : 0.0f)));
    }

    public /* synthetic */ void a(String str, String str2, boolean z, cx cxVar) {
        c(str, str2, z);
    }

    public void c(final int i, final int i2) {
        if (this.l == null) {
            this.ad.add(new LazyCompositionTask() { // from class: dx
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(cx cxVar) {
                    this.f32471c.d(i, i2, cxVar);
                }
            });
        } else {
            this.h.c(i, i2 + 0.99f);
        }
    }

    public /* synthetic */ void d(int i, int i2, cx cxVar) {
        c(i, i2);
    }

    public void c(final float f, final float f2) {
        cx cxVar = this.l;
        if (cxVar == null) {
            this.ad.add(new LazyCompositionTask() { // from class: dq
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(cx cxVar2) {
                    this.d.a(f, f2, cxVar2);
                }
            });
        } else {
            c((int) jc.a(cxVar.l(), this.l.b(), f), (int) jc.a(this.l.l(), this.l.b(), f2));
        }
    }

    public /* synthetic */ void a(float f, float f2, cx cxVar) {
        c(f, f2);
    }

    public void a(float f) {
        this.h.a(f);
    }

    public float r() {
        return this.h.i();
    }

    public void e(Animator.AnimatorListener animatorListener) {
        this.h.addListener(animatorListener);
    }

    public void e(final int i) {
        if (this.l == null) {
            this.ad.add(new LazyCompositionTask() { // from class: do
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(cx cxVar) {
                    this.f32101b.e(i, cxVar);
                }
            });
        } else {
            this.h.e(i);
        }
    }

    public /* synthetic */ void e(int i, cx cxVar) {
        e(i);
    }

    public int i() {
        return (int) this.h.b();
    }

    public void e(final float f) {
        if (this.l == null) {
            this.ad.add(new LazyCompositionTask() { // from class: dr
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(cx cxVar) {
                    this.f32215c.a(f, cxVar);
                }
            });
            return;
        }
        if (cv.e()) {
            cv.c("Drawable#setProgress");
        }
        this.h.e(this.l.b(f));
        if (cv.e()) {
            cv.e("Drawable#setProgress");
        }
    }

    public /* synthetic */ void a(float f, cx cxVar) {
        e(f);
    }

    public void d(int i) {
        this.h.setRepeatMode(i);
    }

    public int p() {
        return this.h.getRepeatMode();
    }

    public void b(int i) {
        this.h.setRepeatCount(i);
    }

    public int q() {
        return this.h.getRepeatCount();
    }

    public boolean u() {
        jd jdVar = this.h;
        if (jdVar == null) {
            return false;
        }
        return jdVar.isRunning();
    }

    boolean w() {
        if (isVisible()) {
            return this.h.isRunning();
        }
        return this.ac == OnVisibleAction.PLAY || this.ac == OnVisibleAction.RESUME;
    }

    private boolean ag() {
        return this.aw || this.r;
    }

    public void b(Boolean bool) {
        this.aw = bool.booleanValue();
    }

    public void e(boolean z) {
        this.r = z;
    }

    public void h(boolean z) {
        this.h.d(z);
    }

    public void b(ImageAssetDelegate imageAssetDelegate) {
        this.s = imageAssetDelegate;
        fk fkVar = this.v;
        if (fkVar != null) {
            fkVar.b(imageAssetDelegate);
        }
    }

    public void a(ct ctVar) {
        this.f1919b = ctVar;
        fj fjVar = this.t;
        if (fjVar != null) {
            fjVar.a(ctVar);
        }
    }

    public void c(Map<String, Typeface> map) {
        if (map == this.p) {
            return;
        }
        this.p = map;
        invalidateSelf();
    }

    public void d(ei eiVar) {
        this.d = eiVar;
    }

    public ei x() {
        return this.d;
    }

    public boolean ad() {
        return this.p == null && this.d == null && this.l.a().size() > 0;
    }

    public cx j() {
        return this.l;
    }

    public void a() {
        this.ad.clear();
        this.h.cancel();
        if (isVisible()) {
            return;
        }
        this.ac = OnVisibleAction.NONE;
    }

    public void ab() {
        this.ad.clear();
        this.h.g();
        if (isVisible()) {
            return;
        }
        this.ac = OnVisibleAction.NONE;
    }

    public float t() {
        return this.h.a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        cx cxVar = this.l;
        if (cxVar == null) {
            return -1;
        }
        return cxVar.c().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        cx cxVar = this.l;
        if (cxVar == null) {
            return -1;
        }
        return cxVar.c().height();
    }

    public List<fo> a(fo foVar) {
        if (this.o == null) {
            iy.d("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.o.resolveKeyPath(foVar, 0, arrayList, new fo(new String[0]));
        return arrayList;
    }

    public <T> void c(final fo foVar, final T t, final jf<T> jfVar) {
        if (this.o == null) {
            this.ad.add(new LazyCompositionTask() { // from class: dz
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(cx cxVar) {
                    this.f32536c.d(foVar, t, jfVar, cxVar);
                }
            });
            return;
        }
        if (foVar == fo.f34302a) {
            this.o.addValueCallback(t, jfVar);
        } else if (foVar.d() != null) {
            foVar.d().addValueCallback(t, jfVar);
        } else {
            List<fo> listA = a(foVar);
            for (int i = 0; i < listA.size(); i++) {
                listA.get(i).d().addValueCallback(t, jfVar);
            }
            if (!(!listA.isEmpty())) {
                return;
            }
        }
        invalidateSelf();
        if (t == LottieProperty.TIME_REMAP) {
            e(t());
        }
    }

    public /* synthetic */ void d(fo foVar, Object obj, jf jfVar, cx cxVar) {
        c(foVar, obj, (jf<Object>) jfVar);
    }

    public Bitmap d(String str) {
        fk fkVarAn = an();
        if (fkVarAn != null) {
            return fkVarAn.d(str);
        }
        return null;
    }

    public ed a(String str) {
        cx cxVar = this.l;
        if (cxVar == null) {
            return null;
        }
        return cxVar.g().get(str);
    }

    private fk an() {
        fk fkVar = this.v;
        if (fkVar != null && !fkVar.b(af())) {
            this.v = null;
        }
        if (this.v == null) {
            this.v = new fk(getCallback(), this.y, this.s, this.l.g());
        }
        return this.v;
    }

    public Typeface b(fs fsVar) {
        Map<String, Typeface> map = this.p;
        if (map != null) {
            String strE = fsVar.e();
            if (map.containsKey(strE)) {
                return map.get(strE);
            }
            String strA = fsVar.a();
            if (map.containsKey(strA)) {
                return map.get(strA);
            }
            String str = fsVar.e() + Constants.LINK + fsVar.d();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        fj fjVarAm = am();
        if (fjVarAm != null) {
            return fjVarAm.d(fsVar);
        }
        return null;
    }

    private fj am() {
        if (getCallback() == null) {
            return null;
        }
        if (this.t == null) {
            fj fjVar = new fj(getCallback(), this.f1919b);
            this.t = fjVar;
            String str = this.e;
            if (str != null) {
                fjVar.b(str);
            }
        }
        return this.t;
    }

    public void e(String str) {
        this.e = str;
        fj fjVarAm = am();
        if (fjVarAm != null) {
            fjVarAm.b(str);
        }
    }

    private Context af() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            if (this.ac == OnVisibleAction.PLAY) {
                aa();
                return visible;
            }
            if (this.ac == OnVisibleAction.RESUME) {
                z();
                return visible;
            }
        } else {
            if (this.h.isRunning()) {
                ab();
                this.ac = OnVisibleAction.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.ac = OnVisibleAction.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    private void d(Canvas canvas) {
        gs gsVar = this.o;
        cx cxVar = this.l;
        if (gsVar == null || cxVar == null) {
            return;
        }
        this.af.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            this.af.preScale(bounds.width() / cxVar.c().width(), bounds.height() / cxVar.c().height());
            this.af.preTranslate(bounds.left, bounds.top);
        }
        gsVar.draw(canvas, this.af, this.g);
    }

    private void a(Canvas canvas, gs gsVar) {
        if (this.l == null || gsVar == null) {
            return;
        }
        ai();
        canvas.getMatrix(this.ar);
        canvas.getClipBounds(this.f);
        a(this.f, this.n);
        this.ar.mapRect(this.n);
        e(this.n, this.f);
        if (this.k) {
            this.av.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            gsVar.getBounds(this.av, null, false);
        }
        this.ar.mapRect(this.av);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        e(this.av, fWidth, fHeight);
        if (!al()) {
            this.av.intersect(this.f.left, this.f.top, this.f.right, this.f.bottom);
        }
        int iCeil = (int) Math.ceil(this.av.width());
        int iCeil2 = (int) Math.ceil(this.av.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        b(iCeil, iCeil2);
        if (this.u) {
            this.af.set(this.ar);
            this.af.preScale(fWidth, fHeight);
            this.af.postTranslate(-this.av.left, -this.av.top);
            this.ak.eraseColor(0);
            gsVar.draw(this.aj, this.af, this.g);
            this.ar.invert(this.ao);
            this.ao.mapRect(this.ap, this.av);
            e(this.ap, this.an);
        }
        this.aq.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.ak, this.aq, this.an, this.as);
    }

    private void ai() {
        if (this.aj != null) {
            return;
        }
        this.aj = new Canvas();
        this.av = new RectF();
        this.ar = new Matrix();
        this.ao = new Matrix();
        this.f = new Rect();
        this.n = new RectF();
        this.as = new ef();
        this.aq = new Rect();
        this.an = new Rect();
        this.ap = new RectF();
    }

    private void b(int i, int i2) {
        Bitmap bitmap = this.ak;
        if (bitmap == null || bitmap.getWidth() < i || this.ak.getHeight() < i2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.ak = bitmapCreateBitmap;
            this.aj.setBitmap(bitmapCreateBitmap);
            this.u = true;
            return;
        }
        if (this.ak.getWidth() > i || this.ak.getHeight() > i2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.ak, 0, 0, i, i2);
            this.ak = bitmapCreateBitmap2;
            this.aj.setBitmap(bitmapCreateBitmap2);
            this.u = true;
        }
    }

    private void e(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void a(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void e(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    private boolean al() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (parent instanceof ViewGroup) {
            return !((ViewGroup) parent).getClipChildren();
        }
        return false;
    }
}
