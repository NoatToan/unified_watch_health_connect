package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a4 implements r53.i<m1<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f195751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v3 f195752b;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f195753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v3 f195754b;

        /* JADX INFO: renamed from: yc.a4$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @v13.e(c = "androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2", f = "Separators.kt", l = {224, 223}, m = "emit")
        public static final class C3644a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f195755a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f195756b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public r53.j f195757c;

            public C3644a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f195755a = obj;
                this.f195756b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, v3 v3Var) {
            this.f195753a = jVar;
            this.f195754b = v3Var;
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
            C3644a c3644a;
            r53.j jVar;
            if (dVar instanceof C3644a) {
                c3644a = (C3644a) dVar;
                int i14 = c3644a.f195756b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3644a.f195756b = i14 - Integer.MIN_VALUE;
                } else {
                    c3644a = new C3644a(dVar);
                }
            } else {
                c3644a = new C3644a(dVar);
            }
            Object obj2 = c3644a.f195755a;
            Object obj3 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3644a.f195756b;
            if (i15 != 0) {
                if (i15 == 1) {
                    r53.j jVar2 = c3644a.f195757c;
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
            r53.j jVar3 = this.f195753a;
            c3644a.f195757c = jVar3;
            c3644a.f195756b = 1;
            Object objA = this.f195754b.a((m1) obj, c3644a);
            if (objA != obj3) {
                obj2 = objA;
                jVar = jVar3;
            }
            return obj3;
            c3644a.f195757c = null;
            c3644a.f195756b = 2;
        }
    }

    public a4(r53.i iVar, v3 v3Var) {
        this.f195751a = iVar;
        this.f195752b = v3Var;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super m1<Object>> jVar, t13.d dVar) {
        Object objCollect = this.f195751a.collect(new a(jVar, this.f195752b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
