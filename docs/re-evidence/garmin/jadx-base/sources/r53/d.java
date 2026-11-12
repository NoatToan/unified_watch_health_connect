package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr53/d;", "T", "Lr53/c;", "Lr53/i;", "flow", "<init>", "(Lr53/i;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<T> f150546a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j<T> f150547a;

        /* JADX INFO: renamed from: r53.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @v13.e(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", l = {278}, m = "emit")
        public static final class C2828a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f150548a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a<T> f150549b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f150550c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2828a(a<? super T> aVar, t13.d<? super C2828a> dVar) {
                super(dVar);
                this.f150549b = aVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f150548a = obj;
                this.f150550c |= Integer.MIN_VALUE;
                return this.f150549b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(j<? super T> jVar) {
            this.f150547a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(T t7, t13.d<? super Unit> dVar) {
            C2828a c2828a;
            if (dVar instanceof C2828a) {
                c2828a = (C2828a) dVar;
                int i14 = c2828a.f150550c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2828a.f150550c = i14 - Integer.MIN_VALUE;
                } else {
                    c2828a = new C2828a(this, dVar);
                }
            } else {
                c2828a = new C2828a(this, dVar);
            }
            Object obj = c2828a.f150548a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2828a.f150550c;
            if (i15 == 0) {
                o13.r.b(obj);
                g8.i.v(c2828a.getF157466b());
                c2828a.f150550c = 1;
                if (this.f150547a.emit(t7, c2828a) == aVar) {
                    return aVar;
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

    /* JADX WARN: Multi-variable type inference failed */
    public d(i<? extends T> iVar) {
        this.f150546a = iVar;
    }

    @Override // r53.i
    public final Object collect(j<? super T> jVar, t13.d<? super Unit> dVar) {
        Object objCollect = this.f150546a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
