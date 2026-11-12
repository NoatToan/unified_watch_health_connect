package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0004B[\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lyc/x0;", "", "Key", "Value", "Landroidx/lifecycle/s0;", "Lyc/m2;", "Lo53/b0;", "coroutineScope", "initialKey", "Lyc/m2$d;", "config", "Lyc/m2$a;", "boundaryCallback", "Lkotlin/Function0;", "Lyc/h3;", "pagingSourceFactory", "Lo53/z;", "notifyDispatcher", "fetchDispatcher", "<init>", "(Lo53/b0;Ljava/lang/Object;Lyc/m2$d;Lyc/m2$a;Le23/a;Lo53/z;Lo53/z;)V", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x0<Key, Value> extends androidx.lifecycle.s0<m2<Value>> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o53.b0 f196592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m2.d f196593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m2.a<Value> f196594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e23.a<h3<Key, Value>> f196595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o53.z f196596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o53.z f196597q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m2<Value> f196598r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o53.c2 f196599s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f196600t;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Key", "", "Value", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0<Key, Value> f196601a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0<Key, Value> x0Var) {
            super(0);
            this.f196601a = x0Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f196601a.n(true);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.paging.LivePagedList$invalidate$1", f = "LivePagedList.kt", l = {82, 90}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h3 f196602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f196603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f196604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0<Key, Value> f196605d;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.paging.LivePagedList$invalidate$1$1", f = "LivePagedList.kt", l = {}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x0<Key, Value> f196606a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x0<Key, Value> x0Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f196606a = x0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f196606a, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                this.f196606a.f196598r.o(c1.REFRESH, z0.b.f196664b);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x0<Key, Value> x0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f196605d = x0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f196605d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x009b  */
        /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:30:0x00c5  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            h3<Key, Value> h3Var;
            Object obj2;
            h3<Key, Value> h3Var2;
            h3.b bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f196604c;
            x0<Key, Value> x0Var = this.f196605d;
            if (i14 == 0) {
                o13.r.b(obj);
                m2<Value> m2Var = x0Var.f196598r;
                a aVar2 = x0Var.f196600t;
                h3<?, Value> h3VarG = m2Var.g();
                h3VarG.getClass();
                aVar2.getClass();
                h3VarG.f196005a.c(aVar2);
                h3<Key, Value> h3VarInvoke = x0Var.f196595o.invoke();
                h3VarInvoke.getClass();
                aVar2.getClass();
                h3VarInvoke.f196005a.b(aVar2);
                if (h3VarInvoke instanceof u0) {
                    ((u0) h3VarInvoke).a(x0Var.f196593m.f196228a);
                }
                o53.z zVar = x0Var.f196596p;
                a aVar3 = new a(x0Var, null);
                this.f196602a = h3VarInvoke;
                this.f196604c = 1;
                if (ge1.b.e0(zVar, aVar3, this) != aVar) {
                    h3Var = h3VarInvoke;
                }
                return aVar;
            }
            if (i14 == 1) {
                h3Var = this.f196602a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj3 = this.f196603b;
                h3Var = this.f196602a;
                o13.r.b(obj);
                obj2 = obj3;
            }
            h3Var2 = h3Var;
            bVar = (h3.b) obj;
            if (bVar instanceof h3.b.C3657b) {
                x0Var.f196598r.o(c1.REFRESH, new z0.c(false));
                h3Var2.d();
            } else if (bVar instanceof h3.b.a) {
                x0Var.f196598r.o(c1.REFRESH, new z0.a(((h3.b.a) bVar).f196013a));
            } else if (bVar instanceof h3.b.c) {
                m2.c cVar = m2.f196219i;
                o53.b0 b0Var = x0Var.f196592l;
                o53.z zVar2 = x0Var.f196596p;
                o53.z zVar3 = x0Var.f196597q;
                m2.a<Value> aVar4 = x0Var.f196594n;
                m2.d dVar = x0Var.f196593m;
                cVar.getClass();
                h3Var2.getClass();
                b0Var.getClass();
                zVar2.getClass();
                zVar3.getClass();
                dVar.getClass();
                v vVar = new v(h3Var2, b0Var, zVar2, zVar3, aVar4, dVar, (h3.b.c) bVar, obj2);
                x0Var.f196598r.getClass();
                x0Var.f196598r = vVar;
                x0Var.j(vVar);
            }
            return Unit.INSTANCE;
            Object objF = x0Var.f196598r.f();
            m2.d dVar2 = x0Var.f196593m;
            dVar2.getClass();
            h3.a.d dVar3 = new h3.a.d(objF, dVar2.f196231d, dVar2.f196230c);
            this.f196602a = h3Var;
            this.f196603b = objF;
            this.f196604c = 2;
            Object objE = h3Var.e(dVar3, this);
            if (objE != aVar) {
                obj2 = objF;
                obj = objE;
                h3Var2 = h3Var;
                bVar = (h3.b) obj;
                if (bVar instanceof h3.b.C3657b) {
                    x0Var.f196598r.o(c1.REFRESH, new z0.c(false));
                    h3Var2.d();
                } else if (bVar instanceof h3.b.a) {
                    x0Var.f196598r.o(c1.REFRESH, new z0.a(((h3.b.a) bVar).f196013a));
                } else if (bVar instanceof h3.b.c) {
                    m2.c cVar2 = m2.f196219i;
                    o53.b0 b0Var2 = x0Var.f196592l;
                    o53.z zVar4 = x0Var.f196596p;
                    o53.z zVar5 = x0Var.f196597q;
                    m2.a<Value> aVar5 = x0Var.f196594n;
                    m2.d dVar4 = x0Var.f196593m;
                    cVar2.getClass();
                    h3Var2.getClass();
                    b0Var2.getClass();
                    zVar4.getClass();
                    zVar5.getClass();
                    dVar4.getClass();
                    v vVar2 = new v(h3Var2, b0Var2, zVar4, zVar5, aVar5, dVar4, (h3.b.c) bVar, obj2);
                    x0Var.f196598r.getClass();
                    x0Var.f196598r = vVar2;
                    x0Var.j(vVar2);
                }
                return Unit.INSTANCE;
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(o53.b0 b0Var, Key key, m2.d dVar, m2.a<Value> aVar, e23.a<? extends h3<Key, Value>> aVar2, o53.z zVar, o53.z zVar2) {
        super(new p0(b0Var, zVar, zVar2, dVar, key));
        b0Var.getClass();
        dVar.getClass();
        aVar2.getClass();
        zVar.getClass();
        zVar2.getClass();
        this.f196592l = b0Var;
        this.f196593m = dVar;
        this.f196594n = aVar;
        this.f196595o = aVar2;
        this.f196596p = zVar;
        this.f196597q = zVar2;
        this.f196600t = new a(this);
        new v.b0(this, 26);
        m2<Value> m2VarD = d();
        m2VarD.getClass();
        this.f196598r = m2VarD;
    }

    @Override // androidx.lifecycle.s0
    public final void h() {
        n(false);
    }

    public final void n(boolean z14) {
        o53.c2 c2Var = this.f196599s;
        if (c2Var == null || z14) {
            if (c2Var != null) {
                c2Var.c(null);
            }
            this.f196599s = ge1.b.T(this.f196592l, this.f196597q, null, new b(this, null), 2);
        }
    }
}
