package com.garmin.android.apps.connectmobile;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.GarminConnectMobileApp$doWhenAppCreated$1", f = "GarminConnectMobileApp.kt", l = {335}, m = "invokeSuspend", v = 2)
public final class c2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GarminConnectMobileApp f30953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f30954c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f30955a;

        public a(e23.a<Unit> aVar) {
            this.f30955a = aVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            ((Boolean) obj).booleanValue();
            this.f30955a.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f30956a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f30957a;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.c2$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.GarminConnectMobileApp$doWhenAppCreated$1$invokeSuspend$$inlined$filter$1$2", f = "GarminConnectMobileApp.kt", l = {50}, m = "emit", v = 2)
            public static final class C0495a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f30958a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f30959b;

                public C0495a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f30958a = obj;
                    this.f30959b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f30957a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C0495a c0495a;
                if (dVar instanceof C0495a) {
                    c0495a = (C0495a) dVar;
                    int i14 = c0495a.f30959b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0495a.f30959b = i14 - Integer.MIN_VALUE;
                    } else {
                        c0495a = new C0495a(dVar);
                    }
                } else {
                    c0495a = new C0495a(dVar);
                }
                Object obj2 = c0495a.f30958a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c0495a.f30959b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    if (((Boolean) obj).booleanValue()) {
                        c0495a.f30959b = 1;
                        if (this.f30957a.emit(obj, c0495a) == aVar) {
                            return aVar;
                        }
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

        public b(r53.i iVar) {
            this.f30956a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f30956a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(GarminConnectMobileApp garminConnectMobileApp, e23.a<Unit> aVar, t13.d<? super c2> dVar) {
        super(2, dVar);
        this.f30953b = garminConnectMobileApp;
        this.f30954c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c2(this.f30953b, this.f30954c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f30952a;
        if (i14 == 0) {
            o13.r.b(obj);
            b bVar = new b(this.f30953b.f28692d);
            a aVar2 = new a(this.f30954c);
            this.f30952a = 1;
            if (bVar.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
