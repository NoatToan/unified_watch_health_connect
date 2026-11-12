package gn2;

import android.telephony.TelephonyManager;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDIWifiSetup;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.wifi.WifiDataHandler$handleMobileCarrierInfoRequest$1", f = "WifiDataHandler.kt", l = {340}, m = "invokeSuspend")
public final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f78125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dt2.k f78126c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, dt2.k kVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f78125b = cVar;
        this.f78126c = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f78125b, this.f78126c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:5:0x000d, B:12:0x0025, B:14:0x0032, B:17:0x0038, B:19:0x003e, B:23:0x0047, B:28:0x0053, B:24:0x004c, B:27:0x0051), top: B:34:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0051 A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:5:0x000d, B:12:0x0025, B:14:0x0032, B:17:0x0038, B:19:0x003e, B:23:0x0047, B:28:0x0053, B:24:0x004c, B:27:0x0051), top: B:34:0x0009 }] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Iterable<String> iterableC;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f78124a;
        c cVar = this.f78125b;
        try {
            if (i14 == 0) {
                r.b(obj);
                cVar.m().debug("handleMobileCarrierInfoRequest");
                Object systemService = cVar.f78090b.getSystemService("phone");
                TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
                if (telephonyManager == null) {
                    iterableC = j0.f134944a;
                } else {
                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                    if (networkCountryIso == null) {
                        iterableC = j0.f134944a;
                    } else {
                        String str = networkCountryIso.length() > 0 ? networkCountryIso : null;
                        if (str != null) {
                            iterableC = w.c(str);
                        } else {
                            iterableC = j0.f134944a;
                        }
                    }
                    if (iterableC == null) {
                        iterableC = j0.f134944a;
                    }
                }
                GDIWifiSetup.MobileCarrierInfoResponse mobileCarrierInfoResponseBuild = GDIWifiSetup.MobileCarrierInfoResponse.newBuilder().addAllIsoCountryCode(iterableC).build();
                dt2.k kVar = this.f78126c;
                GDISmartProto.Smart smartA = uu2.a.a(GDIWifiSetup.WifiSetupService.newBuilder().setMobileCarrierInfoResponse(mobileCarrierInfoResponseBuild));
                smartA.getClass();
                this.f78124a = 1;
                if (kVar.a(smartA, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            cVar.m().error("handleMobileCarrierInfoRequest", e4);
        }
        return Unit.INSTANCE;
    }
}
