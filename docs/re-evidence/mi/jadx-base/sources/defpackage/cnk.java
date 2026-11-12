package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import com.bumptech.glide.Priority;
import com.bumptech.glide.c;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class cnk<TranscodeType> extends nb2<cnk<TranscodeType>> implements Cloneable {
    public static final vok O = new vok().e(jy6.c).Y(Priority.LOW).f0(true);
    public final Context A;
    public final rok B;
    public final Class<TranscodeType> C;
    public final com.bumptech.glide.a D;
    public final c E;
    public zzp<?, ? super TranscodeType> F;
    public Object G;
    public List<pok<TranscodeType>> H;
    public cnk<TranscodeType> I;
    public cnk<TranscodeType> J;
    public Float K;
    public boolean L = true;
    public boolean M;
    public boolean N;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5580b;

        static {
            int[] iArr = new int[Priority.values().length];
            f5580b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5580b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5580b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5580b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f5579a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5579a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5579a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5579a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5579a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5579a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5579a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5579a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public cnk(com.bumptech.glide.a aVar, rok rokVar, Class<TranscodeType> cls, Context context) {
        this.D = aVar;
        this.B = rokVar;
        this.C = cls;
        this.A = context;
        this.F = rokVar.p(cls);
        this.E = aVar.j();
        t0(rokVar.n());
        a(rokVar.o());
    }

    @CheckResult
    public cnk<TranscodeType> A0(Object obj) {
        return B0(obj);
    }

    public final cnk<TranscodeType> B0(Object obj) {
        if (C()) {
            return clone().B0(obj);
        }
        this.G = obj;
        this.M = true;
        return b0();
    }

    public final zmk C0(Object obj, e0p<TranscodeType> e0pVar, pok<TranscodeType> pokVar, nb2<?> nb2Var, RequestCoordinator requestCoordinator, zzp<?, ? super TranscodeType> zzpVar, Priority priority, int i, int i2, Executor executor) {
        Context context = this.A;
        c cVar = this.E;
        return oem.x(context, cVar, obj, this.G, this.C, nb2Var, i, i2, priority, e0pVar, pokVar, this.H, requestCoordinator, cVar.f(), zzpVar.b(), executor);
    }

    public e0p<TranscodeType> D0() {
        return E0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public e0p<TranscodeType> E0(int i, int i2) {
        return u0(l7i.i(this.B, i, i2));
    }

    @Override // defpackage.nb2
    public boolean equals(Object obj) {
        if (!(obj instanceof cnk)) {
            return false;
        }
        cnk cnkVar = (cnk) obj;
        return super.equals(cnkVar) && Objects.equals(this.C, cnkVar.C) && this.F.equals(cnkVar.F) && Objects.equals(this.G, cnkVar.G) && Objects.equals(this.H, cnkVar.H) && Objects.equals(this.I, cnkVar.I) && Objects.equals(this.J, cnkVar.J) && Objects.equals(this.K, cnkVar.K) && this.L == cnkVar.L && this.M == cnkVar.M;
    }

    @Override // defpackage.nb2
    public int hashCode() {
        return ulq.q(this.M, ulq.q(this.L, ulq.p(this.K, ulq.p(this.J, ulq.p(this.I, ulq.p(this.H, ulq.p(this.G, ulq.p(this.F, ulq.p(this.C, super.hashCode())))))))));
    }

    @CheckResult
    public cnk<TranscodeType> l0(pok<TranscodeType> pokVar) {
        if (C()) {
            return clone().l0(pokVar);
        }
        if (pokVar != null) {
            if (this.H == null) {
                this.H = new ArrayList();
            }
            this.H.add(pokVar);
        }
        return b0();
    }

    @Override // defpackage.nb2
    @CheckResult
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public cnk<TranscodeType> a(nb2<?> nb2Var) {
        a6i.d(nb2Var);
        return (cnk) super.a(nb2Var);
    }

    public final zmk n0(e0p<TranscodeType> e0pVar, pok<TranscodeType> pokVar, nb2<?> nb2Var, Executor executor) {
        return p0(new Object(), e0pVar, pokVar, null, this.F, nb2Var.u(), nb2Var.r(), nb2Var.q(), nb2Var, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zmk p0(Object obj, e0p<TranscodeType> e0pVar, pok<TranscodeType> pokVar, RequestCoordinator requestCoordinator, zzp<?, ? super TranscodeType> zzpVar, Priority priority, int i, int i2, nb2<?> nb2Var, Executor executor) {
        RequestCoordinator requestCoordinator2;
        RequestCoordinator aVar;
        if (this.J != null) {
            aVar = new com.bumptech.glide.request.a(obj, requestCoordinator);
            requestCoordinator2 = aVar;
        } else {
            requestCoordinator2 = null;
            aVar = requestCoordinator;
        }
        zmk zmkVarQ0 = q0(obj, e0pVar, pokVar, aVar, zzpVar, priority, i, i2, nb2Var, executor);
        if (requestCoordinator2 == null) {
            return zmkVarQ0;
        }
        int iR = this.J.r();
        int iQ = this.J.q();
        if (ulq.u(i, i2) && !this.J.N()) {
            iR = nb2Var.r();
            iQ = nb2Var.q();
        }
        cnk<TranscodeType> cnkVar = this.J;
        com.bumptech.glide.request.a aVar2 = requestCoordinator2;
        aVar2.n(zmkVarQ0, cnkVar.p0(obj, e0pVar, pokVar, aVar2, cnkVar.F, cnkVar.u(), iR, iQ, this.J, executor));
        return aVar2;
    }

    public final zmk q0(Object obj, e0p<TranscodeType> e0pVar, pok<TranscodeType> pokVar, RequestCoordinator requestCoordinator, zzp<?, ? super TranscodeType> zzpVar, Priority priority, int i, int i2, nb2<?> nb2Var, Executor executor) {
        cnk<TranscodeType> cnkVar = this.I;
        if (cnkVar == null) {
            if (this.K == null) {
                return C0(obj, e0pVar, pokVar, nb2Var, requestCoordinator, zzpVar, priority, i, i2, executor);
            }
            b bVar = new b(obj, requestCoordinator);
            bVar.m(C0(obj, e0pVar, pokVar, nb2Var, bVar, zzpVar, priority, i, i2, executor), C0(obj, e0pVar, pokVar, nb2Var.clone().e0(this.K.floatValue()), bVar, zzpVar, s0(priority), i, i2, executor));
            return bVar;
        }
        if (this.N) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        zzp<?, ? super TranscodeType> zzpVar2 = cnkVar.L ? zzpVar : cnkVar.F;
        Priority priorityU = cnkVar.G() ? this.I.u() : s0(priority);
        int iR = this.I.r();
        int iQ = this.I.q();
        if (ulq.u(i, i2) && !this.I.N()) {
            iR = nb2Var.r();
            iQ = nb2Var.q();
        }
        b bVar2 = new b(obj, requestCoordinator);
        zmk zmkVarC0 = C0(obj, e0pVar, pokVar, nb2Var, bVar2, zzpVar, priority, i, i2, executor);
        this.N = true;
        cnk<TranscodeType> cnkVar2 = this.I;
        zmk zmkVarP0 = cnkVar2.p0(obj, e0pVar, pokVar, bVar2, zzpVar2, priorityU, iR, iQ, cnkVar2, executor);
        this.N = false;
        bVar2.m(zmkVarC0, zmkVarP0);
        return bVar2;
    }

    @Override // defpackage.nb2
    @CheckResult
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public cnk<TranscodeType> clone() {
        cnk<TranscodeType> cnkVar = (cnk) super.clone();
        cnkVar.F = cnkVar.F.clone();
        if (cnkVar.H != null) {
            cnkVar.H = new ArrayList(cnkVar.H);
        }
        cnk<TranscodeType> cnkVar2 = cnkVar.I;
        if (cnkVar2 != null) {
            cnkVar.I = cnkVar2.clone();
        }
        cnk<TranscodeType> cnkVar3 = cnkVar.J;
        if (cnkVar3 != null) {
            cnkVar.J = cnkVar3.clone();
        }
        return cnkVar;
    }

    public final Priority s0(Priority priority) {
        int i = a.f5580b[priority.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + u());
    }

    @SuppressLint({"CheckResult"})
    public final void t0(List<pok<Object>> list) {
        Iterator<pok<Object>> it = list.iterator();
        while (it.hasNext()) {
            l0((pok) it.next());
        }
    }

    public <Y extends e0p<TranscodeType>> Y u0(Y y) {
        return (Y) w0(y, null, cg8.b());
    }

    public final <Y extends e0p<TranscodeType>> Y v0(Y y, pok<TranscodeType> pokVar, nb2<?> nb2Var, Executor executor) {
        a6i.d(y);
        if (!this.M) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        zmk zmkVarN0 = n0(y, pokVar, nb2Var, executor);
        zmk request = y.getRequest();
        if (zmkVarN0.g(request) && !y0(nb2Var, request)) {
            if (!((zmk) a6i.d(request)).isRunning()) {
                request.begin();
            }
            return y;
        }
        this.B.k(y);
        y.f(zmkVarN0);
        this.B.w(y, zmkVarN0);
        return y;
    }

    public <Y extends e0p<TranscodeType>> Y w0(Y y, pok<TranscodeType> pokVar, Executor executor) {
        return (Y) v0(y, pokVar, this, executor);
    }

    public lxq<ImageView, TranscodeType> x0(ImageView imageView) {
        nb2 nb2VarR;
        ulq.b();
        a6i.d(imageView);
        if (!M() && K() && imageView.getScaleType() != null) {
            switch (a.f5579a[imageView.getScaleType().ordinal()]) {
                case 1:
                    nb2VarR = clone().R();
                    break;
                case 2:
                    nb2VarR = clone().S();
                    break;
                case 3:
                case 4:
                case 5:
                    nb2VarR = clone().T();
                    break;
                case 6:
                    nb2VarR = clone().S();
                    break;
                default:
                    nb2VarR = this;
                    break;
            }
        } else {
            nb2VarR = this;
        }
        return (lxq) v0(this.E.a(imageView, this.C), null, nb2VarR, cg8.b());
    }

    public final boolean y0(nb2<?> nb2Var, zmk zmkVar) {
        return !nb2Var.F() && zmkVar.f();
    }

    @CheckResult
    public cnk<TranscodeType> z0(pok<TranscodeType> pokVar) {
        if (C()) {
            return clone().z0(pokVar);
        }
        this.H = null;
        return l0(pokVar);
    }
}
