package jd;

import androidx.room.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements r53.i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f98222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f98223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f98224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f98225d;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f98226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f98227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f98228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l f98229d;

        /* JADX INFO: renamed from: jd.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @v13.e(c = "androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2", f = "FlowBuilder.kt", l = {220, 219}, m = "emit")
        public static final class C1881a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f98230a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f98231b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public r53.j f98232c;

            public C1881a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f98230a = obj;
                this.f98231b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, b0 b0Var, boolean z14, e23.l lVar) {
            this.f98226a = jVar;
            this.f98227b = b0Var;
            this.f98228c = z14;
            this.f98229d = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L21;
         */
        @Override // r53.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, t13.d dVar) throws Throwable {
            C1881a c1881a;
            r53.j jVar;
            r53.j jVar2;
            if (dVar instanceof C1881a) {
                c1881a = (C1881a) dVar;
                int i14 = c1881a.f98231b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1881a.f98231b = i14 - Integer.MIN_VALUE;
                } else {
                    c1881a = new C1881a(dVar);
                }
            } else {
                c1881a = new C1881a(dVar);
            }
            Object objQ = c1881a.f98230a;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1881a.f98231b;
            if (i15 != 0) {
                if (i15 == 1) {
                    r53.j jVar3 = c1881a.f98232c;
                    o13.r.b(objQ);
                    jVar2 = jVar3;
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(objQ);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(objQ);
            jVar = this.f98226a;
            c1881a.f98232c = jVar;
            c1881a.f98231b = 1;
            objQ = gl1.d.Q(this.f98227b, true, this.f98228c, this.f98229d, c1881a);
            if (objQ != obj2) {
            }
            jVar2 = jVar;
            return obj2;
            jVar2 = jVar;
            c1881a.f98232c = null;
            c1881a.f98231b = 2;
        }
    }

    public g(r53.i iVar, b0 b0Var, boolean z14, e23.l lVar) {
        this.f98222a = iVar;
        this.f98223b = b0Var;
        this.f98224c = z14;
        this.f98225d = lVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super Object> jVar, t13.d dVar) {
        Object objCollect = this.f98222a.collect(new a(jVar, this.f98223b, this.f98224c, this.f98225d), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
