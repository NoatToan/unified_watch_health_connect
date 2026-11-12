package o73;

import o53.b0;
import o53.d0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"K", "V", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "org.jetbrains.compose.resources.AsyncCache$getOrLoad$2", f = "AsyncCache.kt", l = {36, 24}, m = "invokeSuspend")
public final class a extends v13.i implements e23.p<b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f130727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f130728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f130729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.l f130730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f130731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f130732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b<Object, Object> f130733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f130734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<Object>, Object> f130735i;

    /* JADX INFO: renamed from: o73.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"K", "V", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "org.jetbrains.compose.resources.AsyncCache$getOrLoad$2$deferred$1$1", f = "AsyncCache.kt", l = {19}, m = "invokeSuspend")
    public static final class C2483a extends v13.i implements e23.p<b0, t13.d<Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<t13.d<Object>, Object> f130737b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2483a(e23.l<? super t13.d<Object>, ? extends Object> lVar, t13.d<? super C2483a> dVar) {
            super(2, dVar);
            this.f130737b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2483a(this.f130737b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<Object> dVar) {
            return ((C2483a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130736a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f130736a = 1;
                Object objInvoke = this.f130737b.invoke(this);
                return objInvoke == aVar ? aVar : objInvoke;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(b<Object, Object> bVar, Object obj, e23.l<? super t13.d<Object>, ? extends Object> lVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f130733g = bVar;
        this.f130734h = obj;
        this.f130735i = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a aVar = new a(this.f130733g, this.f130734h, this.f130735i, dVar);
        aVar.f130732f = obj;
        return aVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<Object> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        b<Object, Object> bVar;
        z53.b bVar2;
        Object obj2;
        e23.l<t13.d<Object>, Object> lVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f130731e;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                b0Var = (b0) this.f130732f;
                bVar = this.f130733g;
                bVar2 = bVar.f130742a;
                this.f130732f = b0Var;
                this.f130727a = bVar2;
                this.f130728b = bVar;
                obj2 = this.f130734h;
                this.f130729c = obj2;
                lVar = this.f130735i;
                this.f130730d = lVar;
                this.f130731e = 1;
                if (bVar2.c(this) != aVar) {
                }
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lVar = this.f130730d;
            obj2 = this.f130729c;
            bVar = this.f130728b;
            bVar2 = this.f130727a;
            b0Var = (b0) this.f130732f;
            o13.r.b(obj);
            i0 i0VarJ = (i0) bVar.f130743b.get(obj2);
            if (i0VarJ == null || i0VarJ.isCancelled()) {
                i0VarJ = ge1.b.j(b0Var, null, d0.LAZY, new C2483a(lVar, null), 1);
                bVar.f130743b.put(obj2, i0VarJ);
            }
            bVar2.e(null);
            this.f130732f = null;
            this.f130727a = null;
            this.f130728b = null;
            this.f130729c = null;
            this.f130730d = null;
            this.f130731e = 2;
            Object objAwait = i0VarJ.await(this);
            return objAwait == aVar ? aVar : objAwait;
        } catch (Throwable th3) {
            bVar2.e(null);
            throw th3;
        }
    }
}
