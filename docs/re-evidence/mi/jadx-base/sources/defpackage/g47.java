package defpackage;

import android.graphics.Canvas;
import android.view.MotionEvent;
import com.rd.animation.type.AnimationType;

/* JADX INFO: loaded from: classes6.dex */
public class g47 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gnq f18576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j57 f18577b;
    public s7d c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18578a;

        static {
            int[] iArr = new int[AnimationType.values().length];
            f18578a = iArr;
            try {
                iArr[AnimationType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18578a[AnimationType.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18578a[AnimationType.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18578a[AnimationType.WORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18578a[AnimationType.SLIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18578a[AnimationType.FILL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18578a[AnimationType.THIN_WORM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18578a[AnimationType.DROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18578a[AnimationType.SWAP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18578a[AnimationType.SCALE_DOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface b {
    }

    public g47(s7d s7dVar) {
        this.c = s7dVar;
        this.f18577b = new j57(s7dVar);
    }

    public void a(Canvas canvas) {
        int iC = this.c.c();
        for (int i = 0; i < iC; i++) {
            b(canvas, i, nk4.e(this.c, i), nk4.f(this.c, i));
        }
    }

    public final void b(Canvas canvas, int i, int i2, int i3) {
        boolean zX = this.c.x();
        int iP = this.c.p();
        int iQ = this.c.q();
        boolean z = false;
        boolean z2 = !zX && (i == iP || i == this.c.e());
        if (zX && (i == iP || i == iQ)) {
            z = true;
        }
        boolean z3 = z2 | z;
        this.f18577b.k(i, i2, i3);
        if (this.f18576a == null || !z3) {
            this.f18577b.a(canvas, z3);
        } else {
            c(canvas);
        }
    }

    public final void c(Canvas canvas) {
        switch (a.f18578a[this.c.b().ordinal()]) {
            case 1:
                this.f18577b.a(canvas, true);
                break;
            case 2:
                this.f18577b.b(canvas, this.f18576a);
                break;
            case 3:
                this.f18577b.e(canvas, this.f18576a);
                break;
            case 4:
                this.f18577b.j(canvas, this.f18576a);
                break;
            case 5:
                this.f18577b.g(canvas, this.f18576a);
                break;
            case 6:
                this.f18577b.d(canvas, this.f18576a);
                break;
            case 7:
                this.f18577b.i(canvas, this.f18576a);
                break;
            case 8:
                this.f18577b.c(canvas, this.f18576a);
                break;
            case 9:
                this.f18577b.h(canvas, this.f18576a);
                break;
            case 10:
                this.f18577b.f(canvas, this.f18576a);
                break;
        }
    }

    public final void d(float f, float f2) {
    }

    public void e(b bVar) {
    }

    public void f(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            d(motionEvent.getX(), motionEvent.getY());
        }
    }

    public void g(gnq gnqVar) {
        this.f18576a = gnqVar;
    }
}
