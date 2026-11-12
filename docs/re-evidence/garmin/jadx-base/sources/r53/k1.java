package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k1 implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f150696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k23.d f150697b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f150698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k23.d f150699b;

        /* JADX INFO: renamed from: r53.k1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @v13.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2", f = "Transform.kt", l = {50}, m = "emit")
        public static final class C2832a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f150700a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f150701b;

            public C2832a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f150700a = obj;
                this.f150701b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, k23.d dVar) {
            this.f150698a = jVar;
            this.f150699b = dVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2832a c2832a;
            if (dVar instanceof C2832a) {
                c2832a = (C2832a) dVar;
                int i14 = c2832a.f150701b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2832a.f150701b = i14 - Integer.MIN_VALUE;
                } else {
                    c2832a = new C2832a(dVar);
                }
            } else {
                c2832a = new C2832a(dVar);
            }
            Object obj2 = c2832a.f150700a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2832a.f150701b;
            if (i15 == 0) {
                o13.r.b(obj2);
                if (this.f150699b.q(obj)) {
                    c2832a.f150701b = 1;
                    if (this.f150698a.emit(obj, c2832a) == aVar) {
                        return aVar;
                    }
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

    public k1(i iVar, k23.d dVar) {
        this.f150696a = iVar;
        this.f150697b = dVar;
    }

    @Override // r53.i
    public final Object collect(j<? super Object> jVar, t13.d dVar) {
        Object objCollect = this.f150696a.collect(new a(jVar, this.f150697b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
