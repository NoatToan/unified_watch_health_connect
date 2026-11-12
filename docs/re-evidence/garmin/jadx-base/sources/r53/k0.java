package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k0 implements i<i<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f150688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f150689b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f150690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p f150691b;

        /* JADX INFO: renamed from: r53.k0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @v13.e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", l = {50, 50}, m = "emit")
        public static final class C2831a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f150692a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f150693b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public j f150694c;

            public C2831a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f150692a = obj;
                this.f150693b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, e23.p pVar) {
            this.f150690a = jVar;
            this.f150691b = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L22;
         */
        @Override // r53.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, t13.d dVar) {
            C2831a c2831a;
            j jVar;
            if (dVar instanceof C2831a) {
                c2831a = (C2831a) dVar;
                int i14 = c2831a.f150693b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2831a.f150693b = i14 - Integer.MIN_VALUE;
                } else {
                    c2831a = new C2831a(dVar);
                }
            } else {
                c2831a = new C2831a(dVar);
            }
            Object obj2 = c2831a.f150692a;
            Object obj3 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2831a.f150693b;
            if (i15 != 0) {
                if (i15 == 1) {
                    j jVar2 = c2831a.f150694c;
                    o13.r.b(obj2);
                    jVar = jVar2;
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj2);
            j jVar3 = this.f150690a;
            c2831a.f150694c = jVar3;
            c2831a.f150693b = 1;
            Object objInvoke = this.f150691b.invoke(obj, c2831a);
            if (objInvoke != obj3) {
                obj2 = objInvoke;
                jVar = jVar3;
            }
            return obj3;
            c2831a.f150694c = null;
            c2831a.f150693b = 2;
        }
    }

    public k0(i iVar, e23.p pVar) {
        this.f150688a = iVar;
        this.f150689b = pVar;
    }

    @Override // r53.i
    public final Object collect(j<? super i<Object>> jVar, t13.d dVar) {
        Object objCollect = this.f150688a.collect(new a(jVar, this.f150689b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
