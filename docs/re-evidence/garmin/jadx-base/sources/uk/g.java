package uk;

import o53.e2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lo53/b0;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
@v13.e(c = "com.dsi.vivoki.antble.gfdi.OperationQueue$queue$4", f = "OperationQueue.kt", l = {78, 79}, m = "invokeSuspend")
public final class g extends v13.i implements e23.p<o53.b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.b0 f171663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.b0 f171664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f171666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e.b f171667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f171668f;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lo53/b0;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    @v13.e(c = "com.dsi.vivoki.antble.gfdi.OperationQueue$queue$4$1", f = "OperationQueue.kt", l = {79}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o53.b0 f171669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o53.b0 f171670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f171671c;

        public a(t13.d dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            dVar.getClass();
            a aVar = g.this.new a(dVar);
            aVar.f171669a = (o53.b0) obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<Object> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f171671c;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.b0 b0Var = this.f171669a;
            e23.l lVar = g.this.f171668f;
            this.f171670b = b0Var;
            this.f171671c = 1;
            Object objInvoke = lVar.invoke(this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, e.b bVar, e23.l lVar, t13.d dVar) {
        super(2, dVar);
        this.f171666d = eVar;
        this.f171667e = bVar;
        this.f171668f = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        dVar.getClass();
        g gVar = new g(this.f171666d, this.f171667e, this.f171668f, dVar);
        gVar.f171663a = (o53.b0) obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<Object> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o53.b0 b0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f171665c;
        if (i14 == 0) {
            o13.r.b(obj);
            b0Var = this.f171663a;
            this.f171664b = b0Var;
            this.f171665c = 1;
            if (this.f171667e.await(this) != aVar) {
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
        b0Var = this.f171664b;
        o13.r.b(obj);
        e2 e2Var = this.f171666d.f171651a;
        a aVar2 = new a(null);
        this.f171664b = b0Var;
        this.f171665c = 2;
        Object objE0 = ge1.b.e0(e2Var, aVar2, this);
        return objE0 == aVar ? aVar : objE0;
    }
}
