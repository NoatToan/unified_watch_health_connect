package l70;

import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements r53.i<j70.k.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f110755a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f110756a;

        /* JADX INFO: renamed from: l70.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchActivityTrendDismissedPrompts$lambda$1$$inlined$map$1$2", f = "DashboardRepositoryImpl.kt", l = {50}, m = "emit", v = 2)
        public static final class C2121a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f110757a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f110758b;

            public C2121a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f110757a = obj;
                this.f110758b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f110756a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2121a c2121a;
            if (dVar instanceof C2121a) {
                c2121a = (C2121a) dVar;
                int i14 = c2121a.f110758b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2121a.f110758b = i14 - Integer.MIN_VALUE;
                } else {
                    c2121a = new C2121a(dVar);
                }
            } else {
                c2121a = new C2121a(dVar);
            }
            Object obj2 = c2121a.f110757a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2121a.f110758b;
            if (i15 == 0) {
                o13.r.b(obj2);
                j70.k.d dVar2 = new j70.k.d((Set) obj);
                c2121a.f110758b = 1;
                if (this.f110756a.emit(dVar2, c2121a) == aVar) {
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

    public p(r53.i iVar) {
        this.f110755a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super j70.k.d> jVar, t13.d dVar) {
        Object objCollect = this.f110755a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
