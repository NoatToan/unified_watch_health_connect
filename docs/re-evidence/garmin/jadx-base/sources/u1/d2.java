package u1;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.e3;
import p008y1.o2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lu1/d2;", "Ly1/e3;", "", "initial", "<init>", "(I)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d2 implements e3 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f167431j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d4.l f167432k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p3.a2 f167433a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f167438f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p3.d0 f167440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p3.d0 f167441i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.a2 f167434b = new p3.a2(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.a2 f167435c = new p3.a2(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2.k f167436d = new a2.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p3.a2 f167437e = new p3.a2(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p008y1.c0 f167439g = new p008y1.c0(new tn2.t(this, 19));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"u1/d2$b", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public b(d2 d2Var) {
        }
    }

    static {
        ty1.q1 q1Var = new ty1.q1(3);
        y1 y1Var = new y1(1);
        d4.l lVar = d4.m.f57455a;
        f167432k = new d4.l(q1Var, y1Var);
    }

    public d2(int i14) {
        this.f167433a = new p3.a2(i14);
        new b(this);
        this.f167440h = p3.p0.f(new ok0.f(this, 2));
        this.f167441i = p3.p0.f(new ok0.f(this, 3));
    }

    @Override // p008y1.e3
    public final boolean a() {
        return this.f167439g.a();
    }

    @Override // p008y1.e3
    public final Object b(k1 k1Var, e23.p<? super o2, ? super t13.d<? super Unit>, ? extends Object> pVar, t13.d<? super Unit> dVar) {
        Object objB = this.f167439g.b(k1Var, pVar, dVar);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    @Override // p008y1.e3
    public final boolean c() {
        return ((Boolean) this.f167440h.getF182175a()).booleanValue();
    }

    @Override // p008y1.e3
    public final float d(float f14) {
        return this.f167439g.d(f14);
    }

    @Override // p008y1.e3
    public final boolean e() {
        return ((Boolean) this.f167441i.getF182175a()).booleanValue();
    }

    public final void f(int i14) {
        p3.a2 a2Var = this.f167433a;
        this.f167437e.t(i14);
        f4.f.f68735e.getClass();
        f4.f fVarA = f4.f.a.a();
        e23.l<Object, Unit> f68793s = fVarA != null ? fVarA.getF68799i() : null;
        f4.f fVarB = f4.f.a.b(fVarA);
        try {
            if (a2Var.getIntValue() > i14) {
                a2Var.t(i14);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            f4.f.a.e(fVarA, fVarB, f68793s);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu1/d2$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
