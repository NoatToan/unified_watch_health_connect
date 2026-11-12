package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l1 implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f150723a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f150724a;

        /* JADX INFO: renamed from: r53.l1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @v13.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50}, m = "emit")
        public static final class C2834a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f150725a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f150726b;

            public C2834a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f150725a = obj;
                this.f150726b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar) {
            this.f150724a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(T t7, t13.d<? super Unit> dVar) {
            C2834a c2834a;
            if (dVar instanceof C2834a) {
                c2834a = (C2834a) dVar;
                int i14 = c2834a.f150726b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2834a.f150726b = i14 - Integer.MIN_VALUE;
                } else {
                    c2834a = new C2834a(dVar);
                }
            } else {
                c2834a = new C2834a(dVar);
            }
            Object obj = c2834a.f150725a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2834a.f150726b;
            if (i15 == 0) {
                o13.r.b(obj);
                if (t7 != null) {
                    c2834a.f150726b = 1;
                    if (this.f150724a.emit(t7, c2834a) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public l1(i iVar) {
        this.f150723a = iVar;
    }

    @Override // r53.i
    public final Object collect(j<? super Object> jVar, t13.d dVar) {
        Object objCollect = this.f150723a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
