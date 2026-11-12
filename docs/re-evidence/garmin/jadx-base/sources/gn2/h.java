package gn2;

import com.garmin.proto.generated.GDIWifiSetup;
import com.garmin.proto.generated.WifiSetup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.wifi.WifiDataHandler$handleScanCompleteNotification$1", f = "WifiDataHandler.kt", l = {}, m = "invokeSuspend")
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GDIWifiSetup.AccessPointScanCompleteNotification f78127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f78128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t13.d<List<WifiSetup.ScannedAccessPoint>> f78129c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(GDIWifiSetup.AccessPointScanCompleteNotification accessPointScanCompleteNotification, c cVar, t13.d<? super List<WifiSetup.ScannedAccessPoint>> dVar, t13.d<? super h> dVar2) {
        super(2, dVar2);
        this.f78127a = accessPointScanCompleteNotification;
        this.f78128b = cVar;
        this.f78129c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f78127a, this.f78128b, this.f78129c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        GDIWifiSetup.AccessPointScanCompleteNotification accessPointScanCompleteNotification = this.f78127a;
        t13.d<List<WifiSetup.ScannedAccessPoint>> dVar = this.f78129c;
        c cVar = this.f78128b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            try {
                if (accessPointScanCompleteNotification.hasEncryptedWifiProtobuf()) {
                    rs2.c cVar2 = cVar.f78099k;
                    if (cVar2 == null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    WifiSetup.WifiSetupDevice from = WifiSetup.WifiSetupDevice.parseFrom(b.a(cVar2.getF92746j(), accessPointScanCompleteNotification.getEncryptedWifiProtobuf().toByteArray()));
                    List<WifiSetup.ServerCredentialType> credentialsTypesList = from.getCredentialsTypesList();
                    credentialsTypesList.getClass();
                    cVar.f78100l = credentialsTypesList;
                    List<WifiSetup.ScannedAccessPoint> scannedApsList = from.getScannedApsList();
                    scannedApsList.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : scannedApsList) {
                        String ssid = ((WifiSetup.ScannedAccessPoint) obj2).getSsid();
                        if (ssid != null && ssid.length() != 0) {
                            arrayList.add(obj2);
                        }
                    }
                    rs2.c cVar3 = cVar.f78099k;
                    if (cVar3 == null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    StringBuilder sb3 = new StringBuilder("handleScanCompleteNotification: " + cVar3.getF92742f() + " found " + arrayList.size() + " access points");
                    if (!arrayList.isEmpty()) {
                        sb3.append(" ->");
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb3.append("\n  ssid=" + ((WifiSetup.ScannedAccessPoint) it.next()).getSsid());
                    }
                    cVar.m().debug(sb3.toString());
                    int i14 = q.f128596b;
                    dVar.resumeWith(arrayList);
                } else {
                    rs2.c cVar4 = cVar.f78099k;
                    if (cVar4 == null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    String str = "handleScanCompleteNotification: " + cVar4.getF92742f() + " sent proto missing 'encryptedWifiProtobuf' message";
                    cVar.m().error(str, null);
                    int i15 = q.f128596b;
                    dVar.resumeWith(new q.b(new Exception(str)));
                }
            } catch (Exception e4) {
                zy2.k kVarM = cVar.m();
                rs2.c cVar5 = cVar.f78099k;
                if (cVar5 == null) {
                    s.m("deviceInfo");
                    throw null;
                }
                kVarM.error("handleScanCompleteNotification (" + cVar5.getF92742f() + ")", e4);
                int i16 = q.f128596b;
                dVar.resumeWith(new q.b(e4));
            }
            cVar.f78103o = null;
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            cVar.f78103o = null;
            throw th3;
        }
    }
}
