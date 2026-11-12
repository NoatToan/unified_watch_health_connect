package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f1 implements r53.i<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f33193a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f33194a;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.dashboard.data.datasource.f1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.EcgDataSourceImpl$isRefreshing$$inlined$map$1$2", f = "EcgDataSourceImpl.kt", l = {50}, m = "emit", v = 2)
        public static final class C0545a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f33195a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f33196b;

            public C0545a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f33195a = obj;
                this.f33196b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f33194a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C0545a c0545a;
            if (dVar instanceof C0545a) {
                c0545a = (C0545a) dVar;
                int i14 = c0545a.f33196b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c0545a.f33196b = i14 - Integer.MIN_VALUE;
                } else {
                    c0545a = new C0545a(dVar);
                }
            } else {
                c0545a = new C0545a(dVar);
            }
            Object obj2 = c0545a.f33195a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c0545a.f33196b;
            if (i15 == 0) {
                o13.r.b(obj2);
                Boolean boolValueOf = Boolean.valueOf(((j1) obj).f33241a.f200300c);
                c0545a.f33196b = 1;
                if (this.f33194a.emit(boolValueOf, c0545a) == aVar) {
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

    public f1(r53.i iVar) {
        this.f33193a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
        Object objCollect = this.f33193a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
