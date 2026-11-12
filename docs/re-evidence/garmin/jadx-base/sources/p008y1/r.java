package p008y1;

import b2.e;
import e23.l;
import i3.lc;
import j23.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p3.a4;
import p3.c2;
import p3.d0;
import p3.p0;
import p3.z1;
import s1.k;
import s1.y;
import u1.k1;
import u1.l1;
import v13.c;
import vb.h;
import xd2.m0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0004\u0010\fB5\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0004\u0010\r¨\u0006\u000f"}, d2 = {"Ly1/r;", "T", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "Ly1/w0;", "anchors", "(Ljava/lang/Object;Ly1/w0;)V", "Lkotlin/Function1;", "", "confirmValueChange", "(Ljava/lang/Object;Le23/l;)V", "(Ljava/lang/Object;Ly1/w0;Le23/l;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r<T> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f193578o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<? super T, Boolean> f193579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l<? super Float, Float> f193580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lc f193581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k<Float> f193582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y<Float> f193583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l1 f193584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f193585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c2 f193586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d0 f193587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z1 f193588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z1 f193589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c2 f193590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c2 f193591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f193592n;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y1/r$b", "Ly1/a;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements p008y1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f193593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T f193594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f193595c = Float.NaN;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r<T> f193596d;

        public b(r<T> rVar) {
            this.f193596d = rVar;
        }

        @Override // p008y1.a
        public final void a(float f14, float f15) {
            r<T> rVar = this.f193596d;
            float floatValue = rVar.f193588j.getFloatValue();
            z1 z1Var = rVar.f193588j;
            z1Var.i(f14);
            rVar.f193589k.i(f15);
            if (Float.isNaN(floatValue)) {
                return;
            }
            boolean z14 = f14 >= floatValue;
            w0<T> w0VarB = rVar.b();
            c2 c2Var = rVar.f193585g;
            if (z1Var.getFloatValue() == w0VarB.c(c2Var.getF182175a())) {
                T tB = rVar.b().b(z1Var.getFloatValue() + (z14 ? 1.0f : -1.0f), z14);
                if (tB == null) {
                    tB = c2Var.getF182175a();
                }
                if (z14) {
                    this.f193593a = c2Var.getF182175a();
                    this.f193594b = tB;
                } else {
                    this.f193593a = tB;
                    this.f193594b = c2Var.getF182175a();
                }
            } else {
                T tB2 = rVar.b().b(z1Var.getFloatValue(), false);
                if (tB2 == null) {
                    tB2 = c2Var.getF182175a();
                }
                T tB3 = rVar.b().b(z1Var.getFloatValue(), true);
                if (tB3 == null) {
                    tB3 = c2Var.getF182175a();
                }
                this.f193593a = tB2;
                this.f193594b = tB3;
            }
            w0<T> w0VarB2 = rVar.b();
            T t7 = this.f193593a;
            t7.getClass();
            float fC = w0VarB2.c(t7);
            w0<T> w0VarB3 = rVar.b();
            T t14 = this.f193594b;
            t14.getClass();
            this.f193595c = Math.abs(fC - w0VarB3.c(t14));
            if (Math.abs(z1Var.getFloatValue() - rVar.b().c(c2Var.getF182175a())) >= this.f193595c / 2.0f) {
                T f182175a = z14 ? this.f193594b : this.f193593a;
                if (f182175a == null) {
                    f182175a = c2Var.getF182175a();
                }
                if (rVar.f193579a.invoke(f182175a).booleanValue()) {
                    rVar.f(f182175a);
                }
            }
        }
    }

    static {
        new a(null);
    }

    public r(T t7) {
        this.f193579a = new m0(27);
        this.f193584f = new l1();
        this.f193585g = p0.n(t7);
        this.f193586h = p0.n(t7);
        this.f193587i = p0.f(new q(this, 0));
        this.f193588j = new z1(Float.NaN);
        a4 a4Var = a4.f135041a;
        a4Var.getClass();
        p0.g(a4Var, new q(this, 1));
        this.f193589k = new z1(0.0f);
        this.f193590l = p0.n(null);
        m0 m0Var = e.f193170a;
        this.f193591m = p0.n(new a0(j0.f134944a, new float[0]));
        this.f193592n = new b(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(Object obj, k1 k1Var, e23.r rVar, c cVar) {
        t tVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f193645c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f193645c = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object obj2 = tVar.f193643a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f193645c;
        c2 c2Var = this.f193590l;
        try {
            if (i15 == 0) {
                o13.r.b(obj2);
                if (b().f(obj)) {
                    l1 l1Var = this.f193584f;
                    u uVar = new u(this, obj, rVar, null);
                    tVar.f193645c = 1;
                    if (l1Var.b(k1Var, uVar, tVar) == aVar) {
                        return aVar;
                    }
                } else if (this.f193579a.invoke(obj).booleanValue()) {
                    this.f193586h.setValue(obj);
                    f(obj);
                }
                return Unit.INSTANCE;
            }
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj2);
            c2Var.setValue(null);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            c2Var.setValue(null);
            throw th3;
        }
    }

    public final w0<T> b() {
        return (w0) this.f193591m.getF182175a();
    }

    public final boolean c() {
        return (this.f193580b == null || this.f193581c == null || this.f193582d == null || this.f193583e == null) ? false : true;
    }

    public final float d(float f14) {
        z1 z1Var = this.f193588j;
        return t.d((Float.isNaN(z1Var.getFloatValue()) ? 0.0f : z1Var.getFloatValue()) + f14, b().e(), b().d());
    }

    public final float e() {
        z1 z1Var = this.f193588j;
        if (Float.isNaN(z1Var.getFloatValue())) {
            e.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return z1Var.getFloatValue();
    }

    public final void f(T t7) {
        this.f193585g.setValue(t7);
    }

    public final boolean g(T t7) {
        l1 l1Var = this.f193584f;
        z53.b bVar = l1Var.f167599b;
        z53.b bVar2 = l1Var.f167599b;
        boolean zF = bVar.f();
        if (!zF) {
            return zF;
        }
        try {
            b bVar3 = this.f193592n;
            float fC = b().c(t7);
            if (!Float.isNaN(fC)) {
                bVar3.a(fC, 0.0f);
                this.f193590l.setValue(null);
            }
            f(t7);
            this.f193586h.setValue(t7);
            return zF;
        } finally {
            bVar2.e(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly1/r$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public r(T t7, w0<T> w0Var) {
        this(t7);
        this.f193591m.setValue(w0Var);
        g(t7);
    }

    @o13.e
    public r(T t7, l<? super T, Boolean> lVar) {
        this(t7);
        this.f193579a = lVar;
    }

    public /* synthetic */ r(Object obj, w0 w0Var, l lVar, int i14, j jVar) {
        this(obj, w0Var, (i14 & 4) != 0 ? new m0(27) : lVar);
    }

    @o13.e
    public r(T t7, w0<T> w0Var, l<? super T, Boolean> lVar) {
        this(t7, lVar);
        this.f193591m.setValue(w0Var);
        g(t7);
    }
}
