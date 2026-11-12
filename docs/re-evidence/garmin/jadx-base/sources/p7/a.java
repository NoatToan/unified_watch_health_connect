package p7;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.core.view.g1;
import androidx.core.view.s0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f136265q = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2579a f136266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f136267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f136268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f136269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f136270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f136271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f136272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f136273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f136274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f136275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f136276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f136277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f136278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f136279n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f136280o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f136281p;

    /* JADX INFO: renamed from: p7.a$a, reason: collision with other inner class name */
    public static class C2579a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f136282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f136283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f136284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f136285d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f136289h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f136290i;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f136286e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f136288g = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f136287f = 0;

        public final float a(long j8) {
            long j14 = this.f136286e;
            if (j8 < j14) {
                return 0.0f;
            }
            long j15 = this.f136288g;
            if (j15 < 0 || j8 < j15) {
                return a.c((j8 - j14) / this.f136282a, 0.0f, 1.0f) * 0.5f;
            }
            float f14 = this.f136289h;
            return (a.c((j8 - j15) / this.f136290i, 0.0f, 1.0f) * f14) + (1.0f - f14);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            boolean z14 = aVar.f136280o;
            View view2 = aVar.f136268c;
            C2579a c2579a = aVar.f136266a;
            if (z14) {
                if (aVar.f136278m) {
                    aVar.f136278m = false;
                    c2579a.getClass();
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c2579a.f136286e = jCurrentAnimationTimeMillis;
                    c2579a.f136288g = -1L;
                    c2579a.f136287f = jCurrentAnimationTimeMillis;
                    c2579a.f136289h = 0.5f;
                }
                if ((c2579a.f136288g > 0 && AnimationUtils.currentAnimationTimeMillis() > c2579a.f136288g + ((long) c2579a.f136290i)) || !aVar.g()) {
                    aVar.f136280o = false;
                    return;
                }
                if (aVar.f136279n) {
                    aVar.f136279n = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view2.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (c2579a.f136287f == 0) {
                    kg.f.n("Cannot compute scroll delta before calling start()");
                    return;
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fA = c2579a.a(jCurrentAnimationTimeMillis2);
                long j8 = jCurrentAnimationTimeMillis2 - c2579a.f136287f;
                c2579a.f136287f = jCurrentAnimationTimeMillis2;
                aVar.f((int) (j8 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * c2579a.f136285d));
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                view2.postOnAnimation(this);
            }
        }
    }

    public a(View view2) {
        C2579a c2579a = new C2579a();
        this.f136266a = c2579a;
        this.f136267b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f136270e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f136271f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f136274i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f136275j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f136276k = fArr5;
        this.f136268c = view2;
        float f14 = Resources.getSystem().getDisplayMetrics().density;
        float f15 = ((int) ((1575.0f * f14) + 0.5f)) / 1000.0f;
        fArr5[0] = f15;
        fArr5[1] = f15;
        float f16 = ((int) ((f14 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f16;
        fArr4[1] = f16;
        this.f136272g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f136273h = f136265q;
        c2579a.f136282a = 500;
        c2579a.f136283b = 500;
    }

    public static float c(float f14, float f15, float f16) {
        if (f14 > f16) {
            return f16;
        }
        return f14 < f15 ? f15 : f14;
    }

    public abstract boolean a(int i14);

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float b(int i14, float f14, float f15, float f16) {
        float fC;
        float interpolation;
        float fC2 = c(this.f136270e[i14] * f15, 0.0f, this.f136271f[i14]);
        float fD = d(f15 - f14, fC2) - d(f14, fC2);
        AccelerateInterpolator accelerateInterpolator = this.f136267b;
        if (fD >= 0.0f) {
            if (fD > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fD);
            } else {
                fC = 0.0f;
            }
            if (fC == 0.0f) {
                return 0.0f;
            }
            float f17 = this.f136274i[i14];
            float f18 = this.f136275j[i14];
            float f19 = this.f136276k[i14];
            float f22 = f17 * f16;
            return fC > 0.0f ? c(fC * f22, f18, f19) : -c((-fC) * f22, f18, f19);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fD);
        fC = c(interpolation, -1.0f, 1.0f);
        if (fC == 0.0f) {
            return 0.0f;
        }
        float f110 = this.f136274i[i14];
        float f111 = this.f136275j[i14];
        float f112 = this.f136276k[i14];
        float f24 = f110 * f16;
        if (fC > 0.0f) {
        }
    }

    public final float d(float f14, float f15) {
        if (f15 != 0.0f) {
            int i14 = this.f136272g;
            if (i14 == 0 || i14 == 1) {
                if (f14 < f15) {
                    if (f14 >= 0.0f) {
                        return 1.0f - (f14 / f15);
                    }
                    if (this.f136280o && i14 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i14 == 2 && f14 < 0.0f) {
                return f14 / (-f15);
            }
        }
        return 0.0f;
    }

    public final void e() {
        int i14 = 0;
        if (this.f136278m) {
            this.f136280o = false;
            return;
        }
        C2579a c2579a = this.f136266a;
        c2579a.getClass();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i15 = (int) (jCurrentAnimationTimeMillis - c2579a.f136286e);
        int i16 = c2579a.f136283b;
        if (i15 > i16) {
            i14 = i16;
        } else if (i15 >= 0) {
            i14 = i15;
        }
        c2579a.f136290i = i14;
        c2579a.f136289h = c2579a.a(jCurrentAnimationTimeMillis);
        c2579a.f136288g = jCurrentAnimationTimeMillis;
    }

    public abstract void f(int i14);

    public final boolean g() {
        C2579a c2579a = this.f136266a;
        float f14 = c2579a.f136285d;
        int iAbs = (int) (f14 / Math.abs(f14));
        Math.abs(c2579a.f136284c);
        return iAbs != 0 && a(iAbs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view2, MotionEvent motionEvent) {
        int i14;
        if (this.f136281p) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                e();
                return false;
            }
            this.f136279n = true;
            this.f136277l = false;
            float x14 = motionEvent.getX();
            float width = view2.getWidth();
            View view3 = this.f136268c;
            float fB = b(0, x14, width, view3.getWidth());
            float fB2 = b(1, motionEvent.getY(), view2.getHeight(), view3.getHeight());
            C2579a c2579a = this.f136266a;
            c2579a.f136284c = fB;
            c2579a.f136285d = fB2;
            if (!this.f136280o && g()) {
                if (this.f136269d == null) {
                    this.f136269d = new b();
                }
                this.f136280o = true;
                this.f136278m = true;
                if (this.f136277l || (i14 = this.f136273h) <= 0) {
                    this.f136269d.run();
                } else {
                    b bVar = this.f136269d;
                    long j8 = i14;
                    WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                    view3.postOnAnimationDelayed(bVar, j8);
                }
                this.f136277l = true;
            }
        }
        return false;
    }
}
