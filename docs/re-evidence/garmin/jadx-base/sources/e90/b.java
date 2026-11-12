package e90;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pi2.g;
import pi2.h;
import q53.t;
import t13.d;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Le90/a;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.connectiontype.GetBleDeviceConnectionStateUseCase$invoke$1", f = "GetBleDeviceConnectionStateUseCase.kt", l = {25}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<t<? super e90.a>, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f63484b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"e90/b$a", "Lxf0/b;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends xf0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t<e90.a> f63485a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t<? super e90.a> tVar) {
            this.f63485a = tVar;
        }

        @Override // xf0.b
        public final void deviceConnected(g gVar) {
            gVar.getClass();
            this.f63485a.i(e90.a.C1339a.f63481a);
        }

        @Override // xf0.b
        public final void deviceDisconnected(h hVar) {
            hVar.getClass();
            this.f63485a.i(e90.a.b.f63482a);
        }
    }

    public b(d<? super b> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        b bVar = new b(dVar);
        bVar.f63484b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super e90.a> tVar, d<? super Unit> dVar) {
        return ((b) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t tVar = (t) this.f63484b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f63483a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(tVar);
            oi2.a.f132270a.getClass();
            oi2.a.C2513a.b(aVar2);
            e40.d dVar = new e40.d(aVar2, 1);
            this.f63484b = null;
            this.f63483a = 1;
            if (q53.r.a(tVar, dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
