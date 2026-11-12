package defpackage;

import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;

/* JADX INFO: loaded from: classes6.dex */
public class jc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mnq f22637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mnq.a f22638b;
    public i22 c;
    public s7d d;
    public float e;
    public boolean f;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22639a;

        static {
            int[] iArr = new int[AnimationType.values().length];
            f22639a = iArr;
            try {
                iArr[AnimationType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22639a[AnimationType.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22639a[AnimationType.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22639a[AnimationType.WORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22639a[AnimationType.FILL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22639a[AnimationType.SLIDE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22639a[AnimationType.THIN_WORM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22639a[AnimationType.DROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22639a[AnimationType.SWAP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22639a[AnimationType.SCALE_DOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public jc1(s7d s7dVar, mnq.a aVar) {
        this.f22637a = new mnq(aVar);
        this.f22638b = aVar;
        this.d = s7dVar;
    }

    public final void a() {
        switch (a.f22639a[this.d.b().ordinal()]) {
            case 1:
                this.f22638b.a(null);
                break;
            case 2:
                c();
                break;
            case 3:
                h();
                break;
            case 4:
                m();
                break;
            case 5:
                f();
                break;
            case 6:
                j();
                break;
            case 7:
                l();
                break;
            case 8:
                d();
                break;
            case 9:
                k();
                break;
            case 10:
                i();
                break;
        }
    }

    public void b() {
        this.f = false;
        this.e = 0.0f;
        a();
    }

    public final void c() {
        int iO = this.d.o();
        int iS = this.d.s();
        i22 i22VarB = this.f22637a.a().l(iS, iO).b(this.d.a());
        if (this.f) {
            i22VarB.m(this.e);
        } else {
            i22VarB.e();
        }
        this.c = i22VarB;
    }

    public final void d() {
        int iP = this.d.x() ? this.d.p() : this.d.e();
        int iQ = this.d.x() ? this.d.q() : this.d.p();
        int iA = nk4.a(this.d, iP);
        int iA2 = nk4.a(this.d, iQ);
        int iK = this.d.k();
        int i = this.d.i();
        if (this.d.f() != Orientation.HORIZONTAL) {
            iK = i;
        }
        int iL = this.d.l();
        z57 z57VarM = this.f22637a.b().i(this.d.a()).m(iA, iA2, (iL * 3) + iK, iL + iK, iL);
        if (this.f) {
            z57VarM.m(this.e);
        } else {
            z57VarM.e();
        }
        this.c = z57VarM;
    }

    public void e() {
        i22 i22Var = this.c;
        if (i22Var != null) {
            i22Var.c();
        }
    }

    public final void f() {
        int iO = this.d.o();
        int iS = this.d.s();
        int iL = this.d.l();
        int iR = this.d.r();
        i22 i22VarB = this.f22637a.c().q(iS, iO, iL, iR).b(this.d.a());
        if (this.f) {
            i22VarB.m(this.e);
        } else {
            i22VarB.e();
        }
        this.c = i22VarB;
    }

    public void g(float f) {
        this.f = true;
        this.e = f;
        a();
    }

    public final void h() {
        int iO = this.d.o();
        int iS = this.d.s();
        int iL = this.d.l();
        float fN = this.d.n();
        i22 i22VarB = this.f22637a.d().p(iS, iO, iL, fN).b(this.d.a());
        if (this.f) {
            i22VarB.m(this.e);
        } else {
            i22VarB.e();
        }
        this.c = i22VarB;
    }

    public final void i() {
        int iO = this.d.o();
        int iS = this.d.s();
        int iL = this.d.l();
        float fN = this.d.n();
        i22 i22VarB = this.f22637a.e().p(iS, iO, iL, fN).b(this.d.a());
        if (this.f) {
            i22VarB.m(this.e);
        } else {
            i22VarB.e();
        }
        this.c = i22VarB;
    }

    public final void j() {
        int iP = this.d.x() ? this.d.p() : this.d.e();
        int iQ = this.d.x() ? this.d.q() : this.d.p();
        i22 i22VarB = this.f22637a.f().l(nk4.a(this.d, iP), nk4.a(this.d, iQ)).b(this.d.a());
        if (this.f) {
            i22VarB.m(this.e);
        } else {
            i22VarB.e();
        }
        this.c = i22VarB;
    }

    public final void k() {
        int iP = this.d.x() ? this.d.p() : this.d.e();
        int iQ = this.d.x() ? this.d.q() : this.d.p();
        i22 i22VarB = this.f22637a.g().l(nk4.a(this.d, iP), nk4.a(this.d, iQ)).b(this.d.a());
        if (this.f) {
            i22VarB.m(this.e);
        } else {
            i22VarB.e();
        }
        this.c = i22VarB;
    }

    public final void l() {
        int iP = this.d.x() ? this.d.p() : this.d.e();
        int iQ = this.d.x() ? this.d.q() : this.d.p();
        int iA = nk4.a(this.d, iP);
        int iA2 = nk4.a(this.d, iQ);
        boolean z = iQ > iP;
        uor uorVarJ = this.f22637a.h().n(iA, iA2, this.d.l(), z).j(this.d.a());
        if (this.f) {
            uorVarJ.m(this.e);
        } else {
            uorVarJ.e();
        }
        this.c = uorVarJ;
    }

    public final void m() {
        int iP = this.d.x() ? this.d.p() : this.d.e();
        int iQ = this.d.x() ? this.d.q() : this.d.p();
        int iA = nk4.a(this.d, iP);
        int iA2 = nk4.a(this.d, iQ);
        boolean z = iQ > iP;
        uor uorVarJ = this.f22637a.i().n(iA, iA2, this.d.l(), z).j(this.d.a());
        if (this.f) {
            uorVarJ.m(this.e);
        } else {
            uorVarJ.e();
        }
        this.c = uorVarJ;
    }
}
