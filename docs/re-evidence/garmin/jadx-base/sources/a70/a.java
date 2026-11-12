package a70;

import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.i;
import r53.j;
import t13.d;
import v13.e;
import vb.h;
import yz1.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements i<h61.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f1716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f1717b;

    /* JADX INFO: renamed from: a70.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0017a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f1718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f1719b;

        /* JADX INFO: renamed from: a70.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.cyclingability.domain.dashboard.GetCyclingAbilityDataUseCase$invoke$$inlined$map$1$2", f = "GetCyclingAbilityDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C0018a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f1720a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f1721b;

            public C0018a(d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f1720a = obj;
                this.f1721b |= Integer.MIN_VALUE;
                return C0017a.this.emit(null, this);
            }
        }

        public C0017a(j jVar, c cVar) {
            this.f1718a = jVar;
            this.f1719b = cVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, d dVar) {
            C0018a c0018a;
            if (dVar instanceof C0018a) {
                c0018a = (C0018a) dVar;
                int i14 = c0018a.f1721b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c0018a.f1721b = i14 - Integer.MIN_VALUE;
                } else {
                    c0018a = new C0018a(dVar);
                }
            } else {
                c0018a = new C0018a(dVar);
            }
            Object obj2 = c0018a.f1720a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c0018a.f1721b;
            if (i15 == 0) {
                r.b(obj2);
                String str = (String) ((j70.d) obj).f97521b;
                c cVar = this.f1719b;
                cVar.getClass();
                j61.i iVar = (j61.i) cVar.a(str, new b());
                h61.a aVar2 = new h61.a(new yz1.d(u.SUCCESS, null, false, 6, null), iVar != null ? iVar.f97350d : null, iVar != null ? iVar.f97352f : null, iVar != null ? iVar.f97354h : null, null, null, null, 112, null);
                c0018a.f1721b = 1;
                if (this.f1718a.emit(aVar2, c0018a) == aVar) {
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

    public a(i iVar, c cVar) {
        this.f1716a = iVar;
        this.f1717b = cVar;
    }

    @Override // r53.i
    public final Object collect(j<? super h61.a> jVar, d dVar) {
        Object objCollect = this.f1716a.collect(new C0017a(jVar, this.f1717b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
