package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements r53.i<v2<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f196082a;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f196083a;

        /* JADX INFO: renamed from: yc.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @v13.e(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", f = "CachedPagingData.kt", l = {223}, m = "emit")
        public static final class C3661a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f196084a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f196085b;

            public C3661a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f196084a = obj;
                this.f196085b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f196083a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C3661a c3661a;
            if (dVar instanceof C3661a) {
                c3661a = (C3661a) dVar;
                int i14 = c3661a.f196085b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3661a.f196085b = i14 - Integer.MIN_VALUE;
                } else {
                    c3661a = new C3661a(dVar);
                }
            } else {
                c3661a = new C3661a(dVar);
            }
            Object obj2 = c3661a.f196084a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3661a.f196085b;
            if (i15 == 0) {
                o13.r.b(obj2);
                g1 g1Var = (g1) obj;
                g1Var.getClass();
                r53.u uVar = new r53.u(new r53.v(new d1(g1Var, null), g1Var.f195985c.f196028e), new e1(g1Var, null));
                v2<T> v2Var = g1Var.f195984b;
                v2 v2Var2 = new v2(uVar, v2Var.f196539b, v2Var.f196540c, new f1(g1Var));
                c3661a.f196085b = 1;
                if (this.f196083a.emit(v2Var2, c3661a) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public j(r53.i iVar) {
        this.f196082a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super v2<Object>> jVar, t13.d dVar) {
        Object objCollect = this.f196082a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
