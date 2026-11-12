package l70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 implements r53.i<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i[] f110665a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<Boolean[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i[] f110666a;

        public a(r53.i[] iVarArr) {
            this.f110666a = iVarArr;
        }

        @Override // e23.a
        public final Boolean[] invoke() {
            return new Boolean[this.f110666a.length];
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lr53/j;", "", "it", "", "<anonymous>", "(Lr53/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$isDashboardLoading$$inlined$combine$1$3", f = "DashboardRepositoryImpl.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.q<r53.j<? super Boolean>, Boolean[], t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f110667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f110668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object[] f110669c;

        public b(t13.d dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super Boolean> jVar, Boolean[] boolArr, t13.d<? super Unit> dVar) {
            b bVar = new b(dVar);
            bVar.f110668b = jVar;
            bVar.f110669c = boolArr;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f110667a;
            if (i14 == 0) {
                o13.r.b(obj);
                r53.j jVar = this.f110668b;
                boolean z14 = false;
                for (Boolean bool : (Boolean[]) this.f110669c) {
                    if (bool.booleanValue()) {
                        z14 = true;
                        break;
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(z14);
                this.f110668b = null;
                this.f110669c = null;
                this.f110667a = 1;
                if (jVar.emit(boolValueOf, this) == aVar) {
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

    public e0(r53.i[] iVarArr) {
        this.f110665a = iVarArr;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
        r53.i[] iVarArr = this.f110665a;
        Object objA = s53.m.a(iVarArr, new a(iVarArr), new b(null), jVar, dVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }
}
