package gn2;

import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.WifiSetup;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.wifi.WifiDataHandler$testNetworkConnection$2$3", f = "WifiDataHandler.kt", l = {557}, m = "invokeSuspend")
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f78147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GDISmartProto.Smart f78148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WifiSetup.StoredAccessPoint f78149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o53.j<WifiSetup.StatusType> f78150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(c cVar, GDISmartProto.Smart smart, WifiSetup.StoredAccessPoint storedAccessPoint, o53.j<? super WifiSetup.StatusType> jVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f78147b = cVar;
        this.f78148c = smart;
        this.f78149d = storedAccessPoint;
        this.f78150e = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f78147b, this.f78148c, this.f78149d, this.f78150e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f78146a;
        WifiSetup.StoredAccessPoint storedAccessPoint = this.f78149d;
        c cVar = this.f78147b;
        try {
            if (i14 == 0) {
                r.b(obj);
                dt2.g gVar = cVar.f78098j;
                if (gVar == null) {
                    s.m("messenger");
                    throw null;
                }
                GDISmartProto.Smart smart = this.f78148c;
                this.f78146a = 1;
                if (gVar.c(smart, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            zy2.k kVarM = cVar.m();
            rs2.c cVar2 = cVar.f78099k;
            if (cVar2 == null) {
                s.m("deviceInfo");
                throw null;
            }
            kVarM.debug("testNetworkConnection: using " + cVar2.getF92742f() + " to test ssid[" + storedAccessPoint.getSsid() + "] | end, waiting for device reply...");
            return Unit.INSTANCE;
        } catch (Exception e4) {
            zy2.k kVarM2 = cVar.m();
            rs2.c cVar3 = cVar.f78099k;
            if (cVar3 == null) {
                s.m("deviceInfo");
                throw null;
            }
            kVarM2.error(e0.g("testNetworkConnection: using ", cVar3.getF92742f(), " to test ssid[", storedAccessPoint.getSsid(), "] | end"), e4);
            cVar.f78101m = null;
            cVar.f78102n = null;
            int i15 = q.f128596b;
            this.f78150e.resumeWith(new q.b(e4));
        }
    }
}
