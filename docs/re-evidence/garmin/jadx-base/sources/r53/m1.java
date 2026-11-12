package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m1 implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f150730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f150731b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f150732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p f150733b;

        /* JADX INFO: renamed from: r53.m1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @v13.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50, 51}, m = "emit")
        public static final class C2835a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f150734a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f150735b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f150737d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public j f150738e;

            public C2835a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f150734a = obj;
                this.f150735b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, e23.p pVar) {
            this.f150732a = jVar;
            this.f150733b = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        
            if (r6.emit(r2, r0) == r1) goto L22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t7, t13.d<? super Unit> dVar) {
            C2835a c2835a;
            Object obj;
            j jVar;
            if (dVar instanceof C2835a) {
                c2835a = (C2835a) dVar;
                int i14 = c2835a.f150735b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2835a.f150735b = i14 - Integer.MIN_VALUE;
                } else {
                    c2835a = new C2835a(dVar);
                }
            } else {
                c2835a = new C2835a(dVar);
            }
            Object obj2 = c2835a.f150734a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2835a.f150735b;
            if (i15 == 0) {
                o13.r.b(obj2);
                c2835a.f150737d = t7;
                j jVar2 = this.f150732a;
                c2835a.f150738e = jVar2;
                c2835a.f150735b = 1;
                if (this.f150733b.invoke(t7, c2835a) != aVar) {
                    obj = t7;
                    jVar = jVar2;
                }
                return aVar;
            }
            if (i15 == 1) {
                j jVar3 = c2835a.f150738e;
                obj = c2835a.f150737d;
                o13.r.b(obj2);
                jVar = jVar3;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj2);
            }
            return Unit.INSTANCE;
            c2835a.f150737d = null;
            c2835a.f150738e = null;
            c2835a.f150735b = 2;
        }
    }

    public m1(i iVar, e23.p pVar) {
        this.f150730a = iVar;
        this.f150731b = pVar;
    }

    @Override // r53.i
    public final Object collect(j<? super Object> jVar, t13.d dVar) {
        Object objCollect = this.f150730a.collect(new a(jVar, this.f150731b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
