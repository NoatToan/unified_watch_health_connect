package li;

import e23.p;
import e23.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lr53/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 5, 1})
@v13.e(c = "com.apollographql.apollo3.internal.FlowsKt$transformWhile$1", f = "flows.kt", l = {61}, m = "invokeSuspend")
public final class f extends v13.i implements p<j<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f112573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f112574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r53.i<Object> f112575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q<j<Object>, Object, t13.d<? super Boolean>, Object> f112576d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"li/f$a", "Lr53/j;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements j<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f112577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f112578b;

        /* JADX INFO: renamed from: li.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @v13.e(c = "com.apollographql.apollo3.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "flows.kt", l = {53}, m = "emit")
        public static final class C2161a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a f112579a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f112580b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f112581c;

            public C2161a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f112580b = obj;
                this.f112581c |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(q qVar, j jVar) {
            this.f112577a = qVar;
            this.f112578b = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d<? super Unit> dVar) {
            C2161a c2161a;
            a aVar;
            if (dVar instanceof C2161a) {
                c2161a = (C2161a) dVar;
                int i14 = c2161a.f112581c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2161a.f112581c = i14 - Integer.MIN_VALUE;
                } else {
                    c2161a = new C2161a(dVar);
                }
            } else {
                c2161a = new C2161a(dVar);
            }
            Object objInvoke = c2161a.f112580b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2161a.f112581c;
            if (i15 == 0) {
                r.b(objInvoke);
                c2161a.f112579a = this;
                c2161a.f112581c = 1;
                objInvoke = this.f112577a.invoke(this.f112578b, obj, c2161a);
                if (objInvoke == aVar2) {
                    return aVar2;
                }
                aVar = this;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = c2161a.f112579a;
                r.b(objInvoke);
            }
            if (((Boolean) objInvoke).booleanValue()) {
                return Unit.INSTANCE;
            }
            throw new li.a(aVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f112583a;

        public b(a aVar) {
            this.f112583a = aVar;
        }

        @Override // r53.j
        public final Object emit(T t7, t13.d<? super Unit> dVar) {
            Object objEmit = this.f112583a.emit(t7, dVar);
            return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(r53.i<Object> iVar, q<? super j<Object>, Object, ? super t13.d<? super Boolean>, ? extends Object> qVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f112575c = iVar;
        this.f112576d = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f112575c, this.f112576d, dVar);
        fVar.f112574b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(j<Object> jVar, t13.d<? super Unit> dVar) {
        return ((f) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f112573a;
        if (i14 == 0) {
            r.b(obj);
            j jVar = (j) this.f112574b;
            r53.i<Object> iVar = this.f112575c;
            a aVar3 = new a(this.f112576d, jVar);
            try {
                b bVar = new b(aVar3);
                this.f112574b = aVar3;
                this.f112573a = 1;
                if (iVar.collect(bVar, this) == aVar2) {
                    return aVar2;
                }
            } catch (li.a e4) {
                e = e4;
                aVar = aVar3;
                aVar.getClass();
                if (e.f112561a != aVar) {
                    throw e;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.f112574b;
            try {
                r.b(obj);
            } catch (li.a e14) {
                e = e14;
                aVar.getClass();
                if (e.f112561a != aVar) {
                    throw e;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
