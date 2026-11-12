package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f3 implements r53.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f195950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f195951b;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f195952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p f195953b;

        /* JADX INFO: renamed from: yc.f3$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @v13.e(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2", f = "PagingDataTransforms.kt", l = {225, 223}, m = "emit")
        public static final class C3653a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f195954a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f195955b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public r53.j f195956c;

            public C3653a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f195954a = obj;
                this.f195955b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, e23.p pVar) {
            this.f195952a = jVar;
            this.f195953b = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L22;
         */
        @Override // r53.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, t13.d dVar) {
            C3653a c3653a;
            r53.j jVar;
            if (dVar instanceof C3653a) {
                c3653a = (C3653a) dVar;
                int i14 = c3653a.f195955b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3653a.f195955b = i14 - Integer.MIN_VALUE;
                } else {
                    c3653a = new C3653a(dVar);
                }
            } else {
                c3653a = new C3653a(dVar);
            }
            Object obj2 = c3653a.f195954a;
            Object obj3 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3653a.f195955b;
            if (i15 != 0) {
                if (i15 == 1) {
                    r53.j jVar2 = c3653a.f195956c;
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
            r53.j jVar3 = this.f195952a;
            c3653a.f195956c = jVar3;
            c3653a.f195955b = 1;
            Object objB = ((m1) obj).b(this.f195953b, c3653a);
            if (objB != obj3) {
                obj2 = objB;
                jVar = jVar3;
            }
            return obj3;
            c3653a.f195956c = null;
            c3653a.f195955b = 2;
        }
    }

    public f3(r53.i iVar, e23.p pVar) {
        this.f195950a = iVar;
        this.f195951b = pVar;
    }

    @Override // r53.i
    public final Object collect(r53.j jVar, t13.d dVar) {
        Object objCollect = this.f195950a.collect(new a(jVar, this.f195951b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
