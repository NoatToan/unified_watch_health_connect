package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lr53/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", l = {54, 55}, m = "invokeSuspend")
public final class g0 extends v13.i implements e23.p<r53.j<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f195969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f195970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f195971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f195972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r53.i<Object> f195973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.q<Object, Object, t13.d<Object>, Object> f195974f;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<Object> f195975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.q<Object, T, t13.d<Object>, Object> f195976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r53.j<Object> f195977c;

        /* JADX INFO: renamed from: yc.g0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @v13.e(c = "androidx.paging.FlowExtKt$simpleScan$1$1", f = "FlowExt.kt", l = {56, 57}, m = "emit")
        public static final class C3654a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a f195978a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public p005kotlin.jvm.internal.r0 f195979b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f195980c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a<T> f195981d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f195982e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3654a(a<? super T> aVar, t13.d<? super C3654a> dVar) {
                super(dVar);
                this.f195981d = aVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f195980c = obj;
                this.f195982e |= Integer.MIN_VALUE;
                return this.f195981d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(p005kotlin.jvm.internal.r0<Object> r0Var, e23.q<Object, ? super T, ? super t13.d<Object>, ? extends Object> qVar, r53.j<Object> jVar) {
            this.f195975a = r0Var;
            this.f195976b = qVar;
            this.f195977c = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        
            if (r6.emit(r7, r0) == r1) goto L22;
         */
        @Override // r53.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t7, t13.d<? super Unit> dVar) {
            C3654a c3654a;
            p005kotlin.jvm.internal.r0<Object> r0Var;
            a<T> aVar;
            if (dVar instanceof C3654a) {
                c3654a = (C3654a) dVar;
                int i14 = c3654a.f195982e;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3654a.f195982e = i14 - Integer.MIN_VALUE;
                } else {
                    c3654a = new C3654a(this, dVar);
                }
            } else {
                c3654a = new C3654a(this, dVar);
            }
            T t14 = (T) c3654a.f195980c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3654a.f195982e;
            if (i15 != 0) {
                if (i15 == 1) {
                    r0Var = c3654a.f195979b;
                    aVar = c3654a.f195978a;
                    o13.r.b(t14);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(t14);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(t14);
            p005kotlin.jvm.internal.r0<Object> r0Var2 = this.f195975a;
            Object obj = r0Var2.f105810a;
            c3654a.f195978a = this;
            c3654a.f195979b = r0Var2;
            c3654a.f195982e = 1;
            Object objInvoke = this.f195976b.invoke(obj, t7, c3654a);
            if (objInvoke != aVar2) {
                t14 = (T) objInvoke;
                r0Var = r0Var2;
                aVar = this;
            }
            return aVar2;
            r0Var.f105810a = t14;
            r53.j<Object> jVar = aVar.f195977c;
            Object obj2 = aVar.f195975a.f105810a;
            c3654a.f195978a = null;
            c3654a.f195979b = null;
            c3654a.f195982e = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(Object obj, r53.i<Object> iVar, e23.q<Object, Object, ? super t13.d<Object>, ? extends Object> qVar, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f195972d = obj;
        this.f195973e = iVar;
        this.f195974f = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g0 g0Var = new g0(this.f195972d, this.f195973e, this.f195974f, dVar);
        g0Var.f195971c = obj;
        return g0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<Object> jVar, t13.d<? super Unit> dVar) {
        return ((g0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r5.f195973e.collect(r6, r5) == r0) goto L16;
     */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        p005kotlin.jvm.internal.r0 r0Var;
        r53.j jVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195970b;
        if (i14 != 0) {
            if (i14 == 1) {
                r0Var = this.f195969a;
                jVar = (r53.j) this.f195971c;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        r53.j jVar2 = (r53.j) this.f195971c;
        r0Var = new p005kotlin.jvm.internal.r0();
        ?? r14 = this.f195972d;
        r0Var.f105810a = r14;
        this.f195971c = jVar2;
        this.f195969a = r0Var;
        this.f195970b = 1;
        if (jVar2.emit(r14, this) != aVar) {
            jVar = jVar2;
        }
        return aVar;
        a aVar2 = new a(r0Var, this.f195974f, jVar);
        this.f195971c = null;
        this.f195969a = null;
        this.f195970b = 2;
    }
}
