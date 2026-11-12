package gm0;

import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.i;
import r53.j;
import vb.h;
import yz1.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements i<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f77995a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f77996a;

        /* JADX INFO: renamed from: gm0.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.graphql.data.datasource.GraphQLQueryDataSource$isLoading$$inlined$map$1$2", f = "GraphQLQueryDataSource.kt", l = {50}, m = "emit", v = 2)
        public static final class C1571a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f77997a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f77998b;

            public C1571a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f77997a = obj;
                this.f77998b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar) {
            this.f77996a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1571a c1571a;
            if (dVar instanceof C1571a) {
                c1571a = (C1571a) dVar;
                int i14 = c1571a.f77998b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1571a.f77998b = i14 - Integer.MIN_VALUE;
                } else {
                    c1571a = new C1571a(dVar);
                }
            } else {
                c1571a = new C1571a(dVar);
            }
            Object obj2 = c1571a.f77997a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1571a.f77998b;
            if (i15 == 0) {
                r.b(obj2);
                Boolean boolValueOf = Boolean.valueOf(((e) obj).f78008a.f200298a == u.LOADING);
                c1571a.f77998b = 1;
                if (this.f77996a.emit(boolValueOf, c1571a) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public b(i iVar) {
        this.f77995a = iVar;
    }

    @Override // r53.i
    public final Object collect(j<? super Boolean> jVar, t13.d dVar) {
        Object objCollect = this.f77995a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
