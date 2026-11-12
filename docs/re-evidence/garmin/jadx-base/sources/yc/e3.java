package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e3 implements r53.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f195895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f195896b;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f195897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p f195898b;

        /* JADX INFO: renamed from: yc.e3$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @v13.e(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2", f = "PagingDataTransforms.kt", l = {225, 223}, m = "emit")
        public static final class C3649a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f195899a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f195900b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public r53.j f195901c;

            public C3649a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f195899a = obj;
                this.f195900b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, e23.p pVar) {
            this.f195897a = jVar;
            this.f195898b = pVar;
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
            C3649a c3649a;
            r53.j jVar;
            if (dVar instanceof C3649a) {
                c3649a = (C3649a) dVar;
                int i14 = c3649a.f195900b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3649a.f195900b = i14 - Integer.MIN_VALUE;
                } else {
                    c3649a = new C3649a(dVar);
                }
            } else {
                c3649a = new C3649a(dVar);
            }
            Object obj2 = c3649a.f195899a;
            Object obj3 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3649a.f195900b;
            if (i15 != 0) {
                if (i15 == 1) {
                    r53.j jVar2 = c3649a.f195901c;
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
            r53.j jVar3 = this.f195897a;
            c3649a.f195901c = jVar3;
            c3649a.f195900b = 1;
            Object objA = ((m1) obj).a(this.f195898b, c3649a);
            if (objA != obj3) {
                obj2 = objA;
                jVar = jVar3;
            }
            return obj3;
            c3649a.f195901c = null;
            c3649a.f195900b = 2;
        }
    }

    public e3(r53.i iVar, e23.p pVar) {
        this.f195895a = iVar;
        this.f195896b = pVar;
    }

    @Override // r53.i
    public final Object collect(r53.j jVar, t13.d dVar) {
        Object objCollect = this.f195895a.collect(new a(jVar, this.f195896b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
