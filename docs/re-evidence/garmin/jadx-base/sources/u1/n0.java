package u1;

import com.garmin.proto.generated.GDIInReachMessaging;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u0011B3\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lu1/n0;", "Lh5/m;", "Lh5/y1;", "Lh5/u;", "Lh5/h;", "Lh5/i1;", "Lh5/e2;", "La2/j;", "interactionSource", "Lm4/n0;", "focusability", "Lkotlin/Function1;", "", "", "onFocusChange", "<init>", "(La2/j;ILe23/l;Lkotlin/jvm/internal/j;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0 extends h5.m implements h5.y1, h5.u, h5.h, h5.i1, h5.e2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f167625i = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a2.j f167626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<Boolean, Unit> f167627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a2.b f167628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f5.t1.a f167629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h5.c1 f167630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m4.i0 f167631h;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.a<Boolean> {
        public b(Object obj) {
            super(0, obj, n0.class, "requestFocus", "requestFocus()Z", 0);
        }

        @Override // e23.a
        public final Boolean invoke() {
            return Boolean.valueOf(m4.i0.E0(((n0) this.receiver).f167631h));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", l = {322}, m = "invokeSuspend", v = 1)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f167632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a2.j f167633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a2.h f167634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o53.u0 f167635d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a2.j jVar, a2.h hVar, o53.u0 u0Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f167633b = jVar;
            this.f167634c = hVar;
            this.f167635d = u0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f167633b, this.f167634c, this.f167635d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167632a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f167632a = 1;
                if (this.f167633b.b(this.f167634c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o53.u0 u0Var = this.f167635d;
            if (u0Var != null) {
                u0Var.dispose();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class d extends p005kotlin.jvm.internal.q implements e23.p<m4.g0, m4.g0, Unit> {
        public d(Object obj) {
            super(2, obj, n0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
        }

        @Override // e23.p
        public final Unit invoke(m4.g0 g0Var, m4.g0 g0Var2) {
            boolean zA;
            p0 p0VarY1;
            m4.g0 g0Var3 = g0Var;
            m4.g0 g0Var4 = g0Var2;
            n0 n0Var = (n0) this.receiver;
            a aVar = n0.f167625i;
            if (n0Var.getIsAttached() && (zA = g0Var4.a()) != g0Var3.a()) {
                e23.l<Boolean, Unit> lVar = n0Var.f167627d;
                if (lVar != null) {
                    lVar.invoke(Boolean.valueOf(zA));
                }
                if (zA) {
                    ge1.b.T(n0Var.getCoroutineScope(), null, null, new o0(n0Var, null), 3);
                    p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                    h5.j1.a(n0Var, new tb0.d(19, r0Var, n0Var));
                    f5.t1 t1Var = (f5.t1) r0Var.f105810a;
                    n0Var.f167629f = t1Var != null ? t1Var.a() : null;
                    h5.c1 c1Var = n0Var.f167630g;
                    if (c1Var != null && c1Var.isAttached() && (p0VarY1 = n0Var.Y1()) != null) {
                        p0VarY1.U1(n0Var.f167630g);
                    }
                } else {
                    f5.t1.a aVar2 = n0Var.f167629f;
                    if (aVar2 != null) {
                        aVar2.release();
                    }
                    n0Var.f167629f = null;
                    p0 p0VarY2 = n0Var.Y1();
                    if (p0VarY2 != null) {
                        p0VarY2.U1(null);
                    }
                }
                h5.k.g(n0Var).U();
                a2.j jVar = n0Var.f167626c;
                if (jVar != null) {
                    a2.b bVar = n0Var.f167628e;
                    if (zA) {
                        if (bVar != null) {
                            n0Var.X1(jVar, new a2.c(bVar));
                            n0Var.f167628e = null;
                        }
                        a2.b bVar2 = new a2.b();
                        n0Var.X1(jVar, bVar2);
                        n0Var.f167628e = bVar2;
                    } else if (bVar != null) {
                        n0Var.X1(jVar, new a2.c(bVar));
                        n0Var.f167628e = null;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private n0(a2.j jVar, int i14, e23.l<? super Boolean, Unit> lVar) {
        this.f167626c = jVar;
        this.f167627d = lVar;
        m4.j0 j0Var = new m4.j0(i14, false, new d(this), null, 10, null);
        U1(j0Var);
        this.f167631h = j0Var;
    }

    @Override // h5.y1
    public final void D1(p5.k0 k0Var) {
        boolean zA = ((m4.h0) this.f167631h.a0()).a();
        k23.l<Object>[] lVarArr = p5.h0.f136016a;
        p5.d0.f135959a.getClass();
        p5.j0<Boolean> j0Var = p5.d0.f135971m;
        k23.l<Object> lVar = p5.h0.f136016a[4];
        Boolean boolValueOf = Boolean.valueOf(zA);
        j0Var.getClass();
        k0Var.a(j0Var, boolValueOf);
        b bVar = new b(this);
        p5.p.f136057a.getClass();
        k0Var.a(p5.p.f136080x, new p5.a(null, bVar));
    }

    @Override // h5.e2
    public final Object X() {
        return f167625i;
    }

    public final void X1(a2.j jVar, a2.h hVar) {
        if (!getIsAttached()) {
            jVar.a(hVar);
        } else {
            o53.l1 l1Var = (o53.l1) getCoroutineScope().getF195311f().get(o53.l1.f129368i0);
            ge1.b.T(getCoroutineScope(), null, null, new c(jVar, hVar, l1Var != null ? l1Var.J(new ty1.g2(4, jVar, hVar)) : null, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    public final p0 Y1() {
        h5.e2 e2Var;
        h5.a1 a1Var;
        if (getIsAttached()) {
            p0.a aVar = p0.f167654c;
            boolean z14 = h4.i.f81563e;
            if (!getNode().getIsAttached()) {
                e5.a.b("visitAncestors called on an unattached node");
            }
            h4.r.c parent = getNode().getParent();
            h5.e0 e0VarG = h5.k.g(this);
            loop0: while (true) {
                if (e0VarG == null) {
                    e2Var = null;
                    break;
                }
                if ((e0VarG.P.f81685f.getAggregateChildKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                            q3.c cVar = null;
                            h4.r.c cVarB = parent;
                            while (cVarB != null) {
                                if (cVarB instanceof h5.e2) {
                                    e2Var = (h5.e2) cVarB;
                                    if (p005kotlin.jvm.internal.s.g(aVar, e2Var.X())) {
                                        break loop0;
                                    }
                                    if (z14) {
                                        if ((cVarB.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0 && (cVarB instanceof h5.m)) {
                                            int i14 = 0;
                                            for (h4.r.c child = ((h5.m) cVarB).f81888b; child != null; child = child.getChild()) {
                                                if ((child.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                                                    i14++;
                                                    if (i14 == 1) {
                                                        cVarB = child;
                                                    } else {
                                                        if (cVar == null) {
                                                            cVar = new q3.c(new h4.r.c[16], 0);
                                                        }
                                                        if (cVarB != null) {
                                                            cVar.b(cVarB);
                                                            cVarB = null;
                                                        }
                                                        cVar.b(child);
                                                    }
                                                }
                                            }
                                            if (i14 == 1) {
                                            }
                                        }
                                    }
                                    cVarB = h5.k.b(cVar);
                                } else {
                                    if ((cVarB.getKindSet() & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0) {
                                    }
                                    cVarB = h5.k.b(cVar);
                                }
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                e0VarG = e0VarG.K();
                parent = (e0VarG == null || (a1Var = e0VarG.P) == null) ? null : a1Var.f81684e;
            }
            if (e2Var instanceof p0) {
                return (p0) e2Var;
            }
        }
        return null;
    }

    public final void Z1(a2.j jVar) {
        a2.b bVar;
        if (p005kotlin.jvm.internal.s.g(this.f167626c, jVar)) {
            return;
        }
        a2.j jVar2 = this.f167626c;
        if (jVar2 != null && (bVar = this.f167628e) != null) {
            jVar2.a(new a2.c(bVar));
        }
        this.f167628e = null;
        this.f167626c = jVar;
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // h5.u
    public final void o(h5.c1 c1Var) {
        p0 p0VarY1;
        this.f167630g = c1Var;
        if (((m4.h0) this.f167631h.a0()).a()) {
            if (!c1Var.isAttached()) {
                p0 p0VarY2 = Y1();
                if (p0VarY2 != null) {
                    p0VarY2.U1(null);
                    return;
                }
                return;
            }
            h5.c1 c1Var2 = this.f167630g;
            if (c1Var2 == null || !c1Var2.isAttached() || (p0VarY1 = Y1()) == null) {
                return;
            }
            p0VarY1.U1(this.f167630g);
        }
    }

    @Override // h4.r.c
    public final void onReset() {
        f5.t1.a aVar = this.f167629f;
        if (aVar != null) {
            aVar.release();
        }
        this.f167629f = null;
    }

    @Override // h5.i1
    public final void x1() {
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        h5.j1.a(this, new tb0.d(19, r0Var, this));
        f5.t1 t1Var = (f5.t1) r0Var.f105810a;
        if (((m4.h0) this.f167631h.a0()).a()) {
            f5.t1.a aVar = this.f167629f;
            if (aVar != null) {
                aVar.release();
            }
            this.f167629f = t1Var != null ? t1Var.a() : null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu1/n0$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ n0(a2.j jVar, int i14, e23.l lVar, p005kotlin.jvm.internal.j jVar2) {
        this(jVar, i14, lVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n0(a2.j jVar, int i14, e23.l lVar, int i15, p005kotlin.jvm.internal.j jVar2) {
        if ((i15 & 2) != 0) {
            m4.n0.f116502b.getClass();
            i14 = m4.n0.f116503c;
        }
        this(jVar, i14, (i15 & 4) != 0 ? null : lVar, null);
    }
}
