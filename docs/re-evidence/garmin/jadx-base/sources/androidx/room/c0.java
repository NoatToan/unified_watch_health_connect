package androidx.room;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<Object> f10795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f10796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<o53.b0, t13.d<Object>, Object> f10797c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", f = "RoomDatabase.android.kt", l = {2087}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f10799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f10800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o53.j<Object> f10801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.p<o53.b0, t13.d<Object>, Object> f10802e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(b0 b0Var, o53.j<Object> jVar, e23.p<? super o53.b0, ? super t13.d<Object>, ? extends Object> pVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f10800c = b0Var;
            this.f10801d = jVar;
            this.f10802e = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f10800c, this.f10801d, this.f10802e, dVar);
            aVar.f10799b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            t13.d dVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f10798a;
            if (i14 == 0) {
                o13.r.b(obj);
                t13.g.a aVar2 = ((o53.b0) this.f10799b).getF195311f().get(t13.e.f161746w0);
                aVar2.getClass();
                t13.e eVar = (t13.e) aVar2;
                t13.g gVarPlus = eVar.plus(new r0(eVar));
                t13.g gVarPlus2 = gVarPlus.plus(new u53.a0(gVarPlus, this.f10800c.getSuspendingTransactionContext()));
                int i15 = o13.q.f128596b;
                o53.j<Object> jVar = this.f10801d;
                this.f10799b = jVar;
                this.f10798a = 1;
                obj = ge1.b.e0(gVarPlus2, this.f10802e, this);
                if (obj == aVar) {
                    return aVar;
                }
                dVar = jVar;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = (t13.d) this.f10799b;
                o13.r.b(obj);
            }
            int i16 = o13.q.f128596b;
            dVar.resumeWith(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(o53.j<Object> jVar, b0 b0Var, e23.p<? super o53.b0, ? super t13.d<Object>, ? extends Object> pVar) {
        this.f10795a = jVar;
        this.f10796b = b0Var;
        this.f10797c = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o53.j<Object> jVar = this.f10795a;
        try {
            ge1.b.W(jVar.getF157466b().minusKey(t13.e.f161746w0), new a(this.f10796b, jVar, this.f10797c, null));
        } catch (Throwable th3) {
            jVar.u(th3);
        }
    }
}
