package defpackage;

import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.huawei.dynamicanimation.DynamicAnimation;
import com.huawei.dynamicanimation.SpringModelBase;
import com.huawei.uikit.hwcommon.anim.HwCubicBezierInterpolator;

/* JADX INFO: loaded from: classes20.dex */
public class xea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f52764c;
    private int d;
    private float g;
    private crb i;
    private long j;
    private int k;
    private int l;
    private e m;
    private int n;
    private View o;
    private crd e = null;
    private boolean h = true;
    private int f = 0;
    private double r = 1.0d;
    private float p = -1.0f;

    /* JADX INFO: loaded from: classes44.dex */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HwCubicBezierInterpolator f52765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f52766b;
        private int d;
        private int e;
        private int h;

        public b() {
        }

        public void a(View view, int i, int i2) {
            if (i2 == 0) {
                xea.this.c();
                return;
            }
            xea.this.f = 2;
            this.f52765a = new HwCubicBezierInterpolator(0.2f, 0.0f, 0.2f, 1.0f);
            xea.this.h = false;
            xea.this.f52764c = AnimationUtils.currentAnimationTimeMillis();
            if (i >= i2) {
                xea.this.j = 300L;
                xea.this.f52763b = i - ((int) ((i - i2) * 0.85f));
                xea.this.f52762a = i2;
                this.h = 200;
                this.f52766b = 0;
            } else {
                xea.this.j = 200L;
                xea.this.f52763b = i;
                int i3 = i2 - ((int) ((i2 - i) * 0.85f));
                this.f52766b = i3;
                xea.this.f52762a = i3;
                this.d = 50;
                this.h = 100;
            }
            xea xeaVar = xea.this;
            xeaVar.d = xeaVar.f52763b;
            xea.this.o = view;
            this.e = i2;
        }

        public boolean a() {
            if (xea.this.i()) {
                return false;
            }
            if (xea.this.j <= 0) {
                xea.this.c();
                return false;
            }
            float fCurrentAnimationTimeMillis = (AnimationUtils.currentAnimationTimeMillis() - xea.this.f52764c) / xea.this.j;
            if (fCurrentAnimationTimeMillis <= 1.0f) {
                xea.this.h = false;
                xea xeaVar = xea.this;
                xeaVar.f52763b = (int) (xeaVar.d - (this.f52765a.getInterpolation(fCurrentAnimationTimeMillis) * (xea.this.d - xea.this.f52762a)));
                if (AnimationUtils.currentAnimationTimeMillis() - xea.this.f52764c > this.h + this.d) {
                    xea.this.f52762a = this.e;
                }
            } else {
                xea.this.h = true;
                xea xeaVar2 = xea.this;
                xeaVar2.f52763b = xeaVar2.f52762a;
                xea.this.c();
            }
            return !xea.this.h;
        }

        public float c() {
            if (this.h <= 0) {
                return 0.0f;
            }
            float fCurrentAnimationTimeMillis = ((AnimationUtils.currentAnimationTimeMillis() - xea.this.f52764c) - ((long) this.d)) / this.h;
            if (xea.this.d > this.f52766b) {
                return fCurrentAnimationTimeMillis;
            }
            if (xea.this.f52763b > this.f52766b) {
                return 0.0f;
            }
            return 1.0f - fCurrentAnimationTimeMillis;
        }
    }

    class e extends SpringModelBase {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f52768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f52769c;
        private float d;
        private float g;
        private float j;

        e(float f, float f2, float f3, float f4, float f5) {
            super(f, f2, 0.001f);
            this.d = f3;
            this.j = f3;
            this.g = f4;
            this.f52768b = f5;
            setValueThreshold(0.5f);
            d(0.0f);
            a(this.g - this.d, f5, -1L);
            this.f52769c = AnimationUtils.currentAnimationTimeMillis();
        }

        boolean b() {
            float fCurrentAnimationTimeMillis = (AnimationUtils.currentAnimationTimeMillis() - this.f52769c) / 1000.0f;
            this.f52768b = getVelocity(fCurrentAnimationTimeMillis);
            float position = getPosition(fCurrentAnimationTimeMillis);
            float f = this.d;
            float f2 = position + f;
            this.j = f2;
            if (!isAtEquilibrium(f2 - f, this.f52768b)) {
                Log.d("HwSpringBackHelper", "isAtEquilibrium is false.");
                return false;
            }
            this.j = getEndPosition() + this.d;
            this.f52768b = 0.0f;
            return true;
        }
    }

    public int a() {
        return this.f52763b;
    }

    public void b(double d) {
        this.r = d;
        this.f52762a = ((int) Math.round(((double) (this.f52762a - this.d)) * d)) + this.d;
    }

    public boolean b() {
        boolean z;
        if (this.h) {
            return false;
        }
        if (this.f == 3) {
            e eVar = this.m;
            if (eVar != null) {
                this.h = eVar.b();
                this.f52763b = (int) this.m.j;
                this.g = this.m.f52768b;
            } else {
                Log.e("HwSpringBackHelper", "computeScrollOffset mSpringModel is null");
                this.h = true;
            }
            if (this.h) {
                c();
            }
            z = this.h;
        } else {
            if (this.j <= 0) {
                c();
                return false;
            }
            float fCurrentAnimationTimeMillis = (AnimationUtils.currentAnimationTimeMillis() - this.f52764c) / this.j;
            if (fCurrentAnimationTimeMillis <= 1.0f) {
                this.h = false;
                if (this.f == 2) {
                    this.f52763b = this.d + ((int) (((double) this.i.e(fCurrentAnimationTimeMillis).a()) * this.r));
                    float fB = this.i.e(fCurrentAnimationTimeMillis).b();
                    this.g = fB;
                    int i = this.f52763b;
                    int i2 = this.k;
                    if (i > i2 || fB >= 0.0f) {
                        int i3 = this.l;
                        if (i >= i3 && fB > 0.0f) {
                            this.n = i - i3;
                            e(this.o, i3);
                        }
                    } else {
                        this.n = i - i2;
                        e(this.o, i2);
                    }
                } else {
                    this.f52763b = (int) (this.d - (this.e.getInterpolation(fCurrentAnimationTimeMillis) * (this.d - this.f52762a)));
                }
            } else {
                this.f52763b = this.f52762a;
                c();
            }
            z = this.h;
        }
        return !z;
    }

    public boolean b(int i, int i2, int i3) {
        this.f = 1;
        int i4 = 0;
        this.h = false;
        this.f52764c = AnimationUtils.currentAnimationTimeMillis();
        this.d = i;
        if (i < i2) {
            i4 = i - i2;
            this.f52762a = i2;
        } else if (i > i3) {
            i4 = i - i3;
            this.f52762a = i3;
        } else {
            c();
        }
        crd crdVar = new crd(DynamicAnimation.SCROLL_Y, 228.0f, 30.0f, i4);
        this.e = crdVar;
        this.j = (long) crdVar.getDuration();
        return !this.h;
    }

    public int c(int i, int i2, int i3) {
        return Math.round(i2 * new crg(i * 0.5f).getRate(Math.abs(i3)));
    }

    public void c() {
        this.f = 0;
        this.g = 0.0f;
        this.h = true;
    }

    public void c(float f) {
        this.p = f;
    }

    public float d() {
        return this.g;
    }

    public void d(View view, int i, int i2, int i3, int i4) {
        if (i2 == 0) {
            c();
            return;
        }
        this.f = 2;
        if (Float.compare(this.p, -1.0f) == 0) {
            this.i = new crb(i2, 0.5f);
        } else {
            this.i = new crb(i2, this.p);
        }
        this.j = (long) this.i.getDuration();
        this.h = false;
        this.f52764c = AnimationUtils.currentAnimationTimeMillis();
        this.f52763b = i;
        this.d = i;
        this.k = i3;
        this.l = i4;
        this.o = view;
        this.g = i2;
        this.n = 0;
        this.f52762a = (int) (i + this.i.getEndOffset() + 0.5f);
    }

    public b e() {
        return new b();
    }

    public void e(View view, int i) {
        this.f = 3;
        this.f52763b = i;
        if (this.o == null) {
            if (view == null) {
                Log.e("HwSpringBackHelper", "overFling: the target view is null.");
                c();
                return;
            }
            this.o = view;
        }
        if (this.g == 0.0f) {
            c();
            return;
        }
        float scrollY = this.n;
        View view2 = this.o;
        if (view2 != null) {
            scrollY += view2.getScrollY();
        }
        this.m = new e(228.0f, 30.0f, scrollY, i, this.g);
        this.f52763b = (int) scrollY;
        this.h = false;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.f52762a;
    }

    public boolean i() {
        return this.h;
    }

    public void c(float f, int i, int i2) {
        this.f = 3;
        this.f52763b = i2;
        if (Float.compare(f, 0.0f) == 0) {
            c();
            return;
        }
        this.m = new e(228.0f, 30.0f, i, i2, f);
        this.f52763b = i;
        this.g = f;
        this.h = false;
        this.f52764c = AnimationUtils.currentAnimationTimeMillis();
    }
}
