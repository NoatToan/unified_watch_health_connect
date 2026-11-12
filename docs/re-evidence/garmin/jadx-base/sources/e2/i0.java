package e2;

import b82.r0;
import com.google.android.gms.wallet.WalletConstants;
import f5.a2;
import f5.z1;
import g2.b1;
import g2.s1;
import g2.y0;
import g2.z0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.e3;
import p008y1.o2;
import p3.c2;
import p3.p0;
import p3.p1;
import p3.t1;
import s1.e2;
import u1.k1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u000bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\f¨\u0006\u000e"}, d2 = {"Le2/i0;", "Ly1/e3;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "Le2/d0;", "prefetchStrategy", "<init>", "(IILe2/d0;)V", "Lg2/t;", "cacheWindow", "(Lg2/t;II)V", "(II)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i0 implements e3 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f62432x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d4.l f62433y = d4.a.b(new e11.w(2), new dv0.n(20));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f62434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f62435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f62436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f62437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0 f62438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f62439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2.k f62440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f62441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p008y1.c0 f62442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f62443j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z1 f62444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f62445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g2.c f62446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g2.b0<y> f62447n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g2.n f62448o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z0 f62449p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f62450q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0 f62451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p1<Unit> f62452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c2 f62453t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c2 f62454u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p1<Unit> f62455v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b1 f62456w;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"e2/i0$b", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public b(i0 i0Var) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"e2/i0$c", "Le2/c0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements c0 {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e2.c0
        public final z0.b a(int i14, r0 r0Var) {
            f4.f.a aVar = f4.f.f68735e;
            i0 i0Var = i0.this;
            aVar.getClass();
            f4.f fVarA = f4.f.a.a();
            e23.l<Object, Unit> f68793s = fVarA != null ? fVarA.getF68799i() : null;
            f4.f fVarB = f4.f.a.b(fVarA);
            try {
                x xVar = (x) i0Var.f62439f.getF182175a();
                return i0Var.f62449p.a(i14, xVar.f62550j, i0Var.f62437d, new ct2.e(r0Var, i14, xVar, 1));
            } finally {
                f4.f.a.e(fVarA, fVarB, f68793s);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"e2/i0$d", "Lf5/a2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements a2 {
        public d() {
        }

        @Override // f5.a2
        public final void I1(h5.e0 e0Var) {
            i0.this.f62444k = e0Var;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1", f = "LazyListState.kt", l = {WalletConstants.ERROR_CODE_UNKNOWN}, m = "invokeSuspend", v = 1)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f62459a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/o2;", "", "<anonymous>", "(Ly1/o2;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1$1", f = "LazyListState.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends v13.i implements e23.p<o2, t13.d<? super Unit>, Object> {
            public a(t13.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(dVar);
            }

            @Override // e23.p
            public final Object invoke(o2 o2Var, t13.d<? super Unit> dVar) {
                return new a(dVar).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
        }

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return i0.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f62459a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = new a(null);
                this.f62459a = 1;
                if (i0.this.b(k1.Default, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {462, 464}, m = "scroll", v = 1)
    public static final class f extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k1 f62461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v13.i f62462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f62463c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f62465e;

        public f(t13.d<? super f> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f62463c = obj;
            this.f62465e |= Integer.MIN_VALUE;
            return i0.this.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/o2;", "", "<anonymous>", "(Ly1/o2;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class g extends v13.i implements e23.p<o2, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f62467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f62468c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i14, int i15, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f62467b = i14;
            this.f62468c = i15;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return i0.this.new g(this.f62467b, this.f62468c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o2 o2Var, t13.d<? super Unit> dVar) {
            return ((g) create(o2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            i0.this.m(this.f62467b, this.f62468c, true);
            return Unit.INSTANCE;
        }
    }

    public i0(int i14, int i15, d0 d0Var) {
        this.f62434a = d0Var;
        this.f62438e = new g0(i14, i15);
        x xVar = k0.f62479a;
        t1 t1Var = t1.f135313a;
        t1Var.getClass();
        this.f62439f = new c2(xVar, t1Var);
        this.f62440g = new a2.k();
        this.f62442i = new p008y1.c0(new ds0.g(this, 4));
        this.f62443j = true;
        this.f62445l = new d();
        this.f62446m = new g2.c();
        this.f62447n = new g2.b0<>();
        this.f62448o = new g2.n();
        d0Var.getClass();
        this.f62449p = new z0(null, new ap.b(this, i14, 2));
        this.f62450q = new c();
        new b(this);
        this.f62451r = new y0();
        this.f62452s = s1.a();
        Boolean bool = Boolean.FALSE;
        this.f62453t = p0.n(bool);
        this.f62454u = p0.n(bool);
        this.f62455v = s1.a();
        this.f62456w = new b1();
    }

    public static Object f(i0 i0Var, int i14, t13.d dVar) {
        i0Var.getClass();
        Object objB = i0Var.b(k1.Default, new j0(i0Var, i14, 0, null), dVar);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    @Override // p008y1.e3
    public final boolean a() {
        return this.f62442i.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r5.f62442i.b(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p008y1.e3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(k1 k1Var, e23.p<? super o2, ? super t13.d<? super Unit>, ? extends Object> pVar, t13.d<? super Unit> dVar) {
        f fVar;
        e23.p pVar2;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i14 = fVar.f62465e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f62465e = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.f62463c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f62465e;
        if (i15 == 0) {
            o13.r.b(obj);
            if (this.f62439f.getF182175a() == k0.f62479a) {
                fVar.f62461a = k1Var;
                fVar.f62462b = (v13.i) pVar;
                fVar.f62465e = 1;
                if (this.f62446m.a(fVar) != obj2) {
                }
            }
            pVar2 = pVar;
            pVar2 = pVar;
            return obj2;
        }
        if (i15 == 1) {
            e23.p pVar3 = (e23.p) fVar.f62462b;
            k1Var = fVar.f62461a;
            o13.r.b(obj);
            pVar2 = pVar3;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        pVar2 = pVar;
        pVar2 = pVar;
        pVar2 = pVar;
        fVar.f62461a = null;
        fVar.f62462b = null;
        fVar.f62465e = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p008y1.e3
    public final boolean c() {
        return ((Boolean) this.f62453t.getF182175a()).booleanValue();
    }

    @Override // p008y1.e3
    public final float d(float f14) {
        return this.f62442i.d(f14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p008y1.e3
    public final boolean e() {
        return ((Boolean) this.f62454u.getF182175a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(x xVar, boolean z14, boolean z15) {
        List<y> list = xVar.f62551k;
        int i14 = xVar.f62542b;
        y yVar = xVar.f62541a;
        this.f62449p.f75317f = list.size();
        b1 b1Var = this.f62456w;
        g0 g0Var = this.f62438e;
        if (!z14 && this.f62435b) {
            this.f62436c = xVar;
            f4.f.f68735e.getClass();
            f4.f fVarA = f4.f.a.a();
            e23.l<Object, Unit> f68793s = fVarA != null ? fVarA.getF68799i() : null;
            f4.f fVarB = f4.f.a.b(fVarA);
            try {
                if (((Number) b1Var.f75057b.f155628b.getF182175a()).floatValue() != 0.0f && yVar != null && yVar.f62559a == g0Var.f62422a.getIntValue() && i14 == g0Var.f62423b.getIntValue()) {
                    o53.c2 c2Var = b1Var.f75056a;
                    if (c2Var != null) {
                        c2Var.c(null);
                    }
                    p005kotlin.jvm.internal.m mVar = p005kotlin.jvm.internal.m.f105803a;
                    b1Var.f75057b = new s1.m<>(e2.f155568a, Float.valueOf(0.0f), null, 0L, 0L, false, 60, null);
                }
                Unit unit = Unit.INSTANCE;
                return;
            } finally {
                f4.f.a.e(fVarA, fVarB, f68793s);
            }
        }
        if (z14) {
            this.f62435b = true;
        }
        this.f62454u.setValue(Boolean.valueOf(((yVar != null ? yVar.f62559a : 0) == 0 && i14 == 0) ? false : true));
        this.f62453t.setValue(Boolean.valueOf(xVar.f62543c));
        this.f62441h -= xVar.f62544d;
        this.f62439f.setValue(xVar);
        if (z15) {
            g0Var.getClass();
            if (!(((float) i14) >= 0.0f)) {
                b2.e.c("scrollOffset should be non-negative");
            }
            g0Var.f62423b.t(i14);
        } else {
            y yVar2 = (y) p13.h0.d0(list);
            y yVar3 = (y) p13.h0.n0(list);
            i6.a.a(yVar2 != null ? yVar2.f62559a : -1L, "firstVisibleItem:index");
            i6.a.a(yVar3 != null ? yVar3.f62559a : -1L, "lastVisibleItem:index");
            g0Var.getClass();
            g0Var.f62425d = yVar != null ? yVar.f62570l : null;
            if (g0Var.f62424c || xVar.f62554n > 0) {
                g0Var.f62424c = true;
                if (!(((float) i14) >= 0.0f)) {
                    b2.e.c("scrollOffset should be non-negative");
                }
                g0Var.a(yVar != null ? yVar.f62559a : 0, i14);
            }
            if (this.f62443j) {
                this.f62434a.c(this.f62450q, xVar);
            }
        }
        if (z14) {
            b1Var.a(xVar.f62546f, xVar.f62549i, xVar.f62548h);
        }
    }

    public final int h() {
        return this.f62438e.f62422a.getIntValue();
    }

    public final int i() {
        return this.f62438e.f62423b.getIntValue();
    }

    public final v j() {
        return (v) this.f62439f.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(int i14, int i15) {
        if (this.f62442i.a()) {
            ge1.b.T(((x) this.f62439f.getF182175a()).f62548h, null, null, new e(null), 3);
        }
        m(i14, i15, false);
    }

    public final Object l(int i14, int i15, t13.d<? super Unit> dVar) {
        Object objB = b(k1.Default, new g(i14, i15, null), dVar);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    public final void m(int i14, int i15, boolean z14) {
        g0 g0Var = this.f62438e;
        if (g0Var.f62422a.getIntValue() != i14 || g0Var.f62423b.getIntValue() != i15) {
            g2.b0<y> b0Var = this.f62447n;
            b0Var.e();
            b0Var.f75036b = null;
            b0Var.f75037c = -1;
            Object obj = this.f62434a;
            g2.e eVar = obj instanceof g2.e ? (g2.e) obj : null;
            if (eVar != null) {
                eVar.m();
            }
        }
        g0Var.a(i14, i15);
        g0Var.f62425d = null;
        if (!z14) {
            this.f62452s.setValue(Unit.INSTANCE);
            return;
        }
        z1 z1Var = this.f62444k;
        if (z1Var != null) {
            z1Var.l();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le2/i0$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public i0(int i14, int i15) {
        this(i14, i15, new e2.a(2));
    }

    public i0(int i14, int i15, d0 d0Var, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? 0 : i14, (i16 & 2) != 0 ? 0 : i15, (i16 & 4) != 0 ? new e2.a(2) : d0Var);
    }

    public i0() {
        this(0, 0, (d0) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public /* synthetic */ i0(g2.t tVar, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(tVar, (i16 & 2) != 0 ? 0 : i14, (i16 & 4) != 0 ? 0 : i15);
    }

    public i0(g2.t tVar, int i14, int i15) {
        this(i14, i15, new i(tVar));
    }

    public /* synthetic */ i0(int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? 0 : i14, (i16 & 2) != 0 ? 0 : i15);
    }
}
