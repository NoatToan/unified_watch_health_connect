package zr1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import yr1.q;
import yr1.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lzr1/c;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.sync.domain.GetSyncStatusUseCase$invoke$1", f = "GetSyncStatusUseCase.kt", l = {45}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<t<? super c>, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f206767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f206768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f206769c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zr1/b$a", "Lyr1/r;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t<c> f206770a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t<? super c> tVar) {
            this.f206770a = tVar;
        }

        @Override // yr1.r
        public final void B1(al2.c cVar) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "GetSyncStatusUseCase", "onSyncStarted: " + cVar);
            this.f206770a.i(new c.e(cVar));
        }

        @Override // yr1.r
        public final void F1(al2.a aVar, boolean z14) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "GetSyncStatusUseCase", "onSyncProgress: " + aVar);
            this.f206770a.i(new c.d(aVar, z14));
        }

        @Override // yr1.r
        public final void g5(al2.c cVar, boolean z14) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "GetSyncStatusUseCase", "onSyncFinished: " + cVar + " successfulSync: " + z14);
            this.f206770a.i(new c.a(cVar, z14));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Long l14, d<? super b> dVar) {
        super(2, dVar);
        this.f206769c = l14;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f206769c, dVar);
        bVar.f206768b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super c> tVar, d<? super Unit> dVar) {
        return ((b) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t tVar = (t) this.f206768b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206767a;
        if (i14 == 0) {
            o13.r.b(obj);
            tVar.i(c.C3852c.f206774a);
            q qVar = new q("GetSyncStatusUseCase", new a(tVar), this.f206769c, null, 8, null);
            qVar.b();
            yr1.p pVar = new yr1.p(qVar, 1);
            this.f206768b = null;
            this.f206767a = 1;
            if (q53.r.a(tVar, pVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
