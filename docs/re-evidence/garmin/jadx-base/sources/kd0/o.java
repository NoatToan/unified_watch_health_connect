package kd0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements r53.i<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f104255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bu0.j f104256b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f104257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ bu0.j f104258b;

        /* JADX INFO: renamed from: kd0.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.BaseModuleAppDelegateImpl$observeLockedInLiveActivitySessionInProgress$$inlined$map$1$2", f = "BaseModuleAppDelegateImpl.kt", l = {50}, m = "emit", v = 2)
        public static final class C1993a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f104259a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f104260b;

            public C1993a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f104259a = obj;
                this.f104260b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, bu0.j jVar2) {
            this.f104257a = jVar;
            this.f104258b = jVar2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1993a c1993a;
            if (dVar instanceof C1993a) {
                c1993a = (C1993a) dVar;
                int i14 = c1993a.f104260b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1993a.f104260b = i14 - Integer.MIN_VALUE;
                } else {
                    c1993a = new C1993a(dVar);
                }
            } else {
                c1993a = new C1993a(dVar);
            }
            Object obj2 = c1993a.f104259a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1993a.f104260b;
            if (i15 == 0) {
                o13.r.b(obj2);
                Boolean boolValueOf = Boolean.valueOf(this.f104258b.a(((Boolean) obj).booleanValue()));
                c1993a.f104260b = 1;
                if (this.f104257a.emit(boolValueOf, c1993a) == aVar) {
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

    public o(r53.i iVar, bu0.j jVar) {
        this.f104255a = iVar;
        this.f104256b = jVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
        Object objCollect = this.f104255a.collect(new a(jVar, this.f104256b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
