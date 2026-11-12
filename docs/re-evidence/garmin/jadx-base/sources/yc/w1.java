package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w1 implements r53.i<j0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f196564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f196565b;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f196566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f196567b;

        /* JADX INFO: renamed from: yc.w1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @v13.e(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2", f = "PageFetcherSnapshot.kt", l = {223}, m = "emit")
        public static final class C3678a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f196568a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f196569b;

            public C3678a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f196568a = obj;
                this.f196569b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, int i14) {
            this.f196566a = jVar;
            this.f196567b = i14;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C3678a c3678a;
            if (dVar instanceof C3678a) {
                c3678a = (C3678a) dVar;
                int i14 = c3678a.f196569b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3678a.f196569b = i14 - Integer.MIN_VALUE;
                } else {
                    c3678a = new C3678a(dVar);
                }
            } else {
                c3678a = new C3678a(dVar);
            }
            Object obj2 = c3678a.f196568a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3678a.f196569b;
            if (i15 == 0) {
                o13.r.b(obj2);
                j0 j0Var = new j0(this.f196567b, (t4) obj);
                c3678a.f196569b = 1;
                if (this.f196566a.emit(j0Var, c3678a) == aVar) {
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

    public w1(r53.i iVar, int i14) {
        this.f196564a = iVar;
        this.f196565b = i14;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super j0> jVar, t13.d dVar) {
        Object objCollect = this.f196564a.collect(new a(jVar, this.f196565b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
