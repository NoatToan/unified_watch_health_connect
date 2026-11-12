package cf;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ue.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements r53.i<h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f26985a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f26986a;

        /* JADX INFO: renamed from: cf.v$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @v13.e(c = "androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2", f = "WorkSpecDao.kt", l = {50}, m = "emit")
        public static final class C0414a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f26987a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f26988b;

            public C0414a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f26987a = obj;
                this.f26988b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f26986a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C0414a c0414a;
            if (dVar instanceof C0414a) {
                c0414a = (C0414a) dVar;
                int i14 = c0414a.f26988b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c0414a.f26988b = i14 - Integer.MIN_VALUE;
                } else {
                    c0414a = new C0414a(dVar);
                }
            } else {
                c0414a = new C0414a(dVar);
            }
            Object obj2 = c0414a.f26987a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c0414a.f26988b;
            if (i15 == 0) {
                o13.r.b(obj2);
                t.c cVar = (t.c) p13.h0.d0((List) obj);
                h0 h0VarA = cVar != null ? cVar.a() : null;
                c0414a.f26988b = 1;
                if (this.f26986a.emit(h0VarA, c0414a) == aVar) {
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

    public v(r53.i iVar) {
        this.f26985a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super h0> jVar, t13.d dVar) {
        Object objCollect = this.f26985a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
