package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eBC\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0011¨\u0006\u0013"}, d2 = {"Li3/mc;", "", "", "skipPartiallyExpanded", "Lkotlin/Function0;", "", "positionalThreshold", "velocityThreshold", "Li3/pc;", "initialValue", "Lkotlin/Function1;", "confirmValueChange", "skipHiddenState", "<init>", "(ZLe23/a;Le23/a;Li3/pc;Le23/l;Z)V", "Lg6/c;", "density", "(ZLg6/c;Li3/pc;Le23/l;Z)V", "a", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class mc {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f88991h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f88992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<pc, Boolean> f88993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f88994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s1.k<Float> f88995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l3.m<pc> f88996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s1.f0<Float> f88997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s1.f0<Float> f88998g;

    /* JADX WARN: Multi-variable type inference failed */
    public mc(boolean z14, e23.a<Float> aVar, e23.a<Float> aVar2, pc pcVar, e23.l<? super pc, Boolean> lVar, boolean z15) {
        this.f88992a = z14;
        this.f88993b = lVar;
        this.f88994c = z15;
        if (z14 && pcVar == pc.PartiallyExpanded) {
            vb.h.s("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        if (z15 && pcVar == pc.Hidden) {
            vb.h.s("The initial value must not be set to Hidden if skipHiddenState is set to true.");
            throw null;
        }
        this.f88995d = kc.f88703b;
        this.f88996e = new l3.m<>(pcVar, new m8(aVar, 3), aVar2, new f2(this, 2), lVar);
        this.f88997f = s1.l.b();
        this.f88998g = s1.l.b();
    }

    public static Object a(mc mcVar, pc pcVar, s1.f0 f0Var, t13.d dVar) {
        float floatValue = mcVar.f88996e.f109329k.getFloatValue();
        l3.m<pc> mVar = mcVar.f88996e;
        oc ocVar = new oc(mcVar, floatValue, f0Var, null);
        int i14 = l3.m.f109318o;
        Object objA = mVar.a(pcVar, u1.k1.Default, ocVar, dVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    public final Object b(t13.d<? super Unit> dVar) {
        Object objA;
        pc pcVar = pc.Expanded;
        return (this.f88993b.invoke(pcVar).booleanValue() && (objA = a(this, pcVar, this.f88997f, dVar)) == u13.a.COROUTINE_SUSPENDED) ? objA : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final pc c() {
        return (pc) this.f88996e.f109325g.getF182175a();
    }

    public final Object d(t13.d<? super Unit> dVar) {
        Object objA;
        if (this.f88994c) {
            vb.h.z("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
            return null;
        }
        pc pcVar = pc.Hidden;
        return (this.f88993b.invoke(pcVar).booleanValue() && (objA = a(this, pcVar, this.f88998g, dVar)) == u13.a.COROUTINE_SUSPENDED) ? objA : Unit.INSTANCE;
    }

    public final boolean e() {
        return this.f88996e.f109325g.getF182175a() != pc.Hidden;
    }

    public final Object f(t13.d<? super Unit> dVar) {
        Object objA;
        if (this.f88992a) {
            vb.h.z("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        pc pcVar = pc.PartiallyExpanded;
        return (this.f88993b.invoke(pcVar).booleanValue() && (objA = a(this, pcVar, this.f88998g, dVar)) == u13.a.COROUTINE_SUSPENDED) ? objA : Unit.INSTANCE;
    }

    public final Object g(t13.d<? super Unit> dVar) {
        Object objA;
        l3.o0<pc> o0VarE = this.f88996e.e();
        pc pcVar = pc.PartiallyExpanded;
        if (!o0VarE.d(pcVar)) {
            pcVar = pc.Expanded;
        }
        return (this.f88993b.invoke(pcVar).booleanValue() && (objA = a(this, pcVar, this.f88997f, dVar)) == u13.a.COROUTINE_SUSPENDED) ? objA : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/mc$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ mc(boolean z14, e23.a aVar, e23.a aVar2, pc pcVar, e23.l lVar, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(z14, aVar, aVar2, (i14 & 8) != 0 ? pc.Hidden : pcVar, (i14 & 16) != 0 ? new i11.f(27) : lVar, (i14 & 32) != 0 ? false : z15);
    }

    public /* synthetic */ mc(boolean z14, g6.c cVar, pc pcVar, e23.l lVar, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(z14, cVar, (i14 & 4) != 0 ? pc.Hidden : pcVar, (i14 & 8) != 0 ? new i11.f(27) : lVar, (i14 & 16) != 0 ? false : z15);
    }

    @o13.e
    public /* synthetic */ mc(boolean z14, g6.c cVar, pc pcVar, e23.l lVar, boolean z15) {
        this(z14, new lc(cVar, 0), new lc(cVar, 1), pcVar, lVar, z15);
    }
}
