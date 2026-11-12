package gn2;

import com.garmin.proto.generated.GDIWifiSetup;
import com.garmin.proto.generated.WifiSetup;
import java.util.Iterator;
import java.util.List;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.wifi.WifiDataHandler$handleConnectionVerificationStatusNotification$1", f = "WifiDataHandler.kt", l = {}, m = "invokeSuspend")
public final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GDIWifiSetup.ConnectionVerificationStatusNotification f78120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f78121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t13.d<WifiSetup.StatusType> f78122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f78123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(GDIWifiSetup.ConnectionVerificationStatusNotification connectionVerificationStatusNotification, c cVar, t13.d<? super WifiSetup.StatusType> dVar, String str, t13.d<? super f> dVar2) {
        super(2, dVar2);
        this.f78120a = connectionVerificationStatusNotification;
        this.f78121b = cVar;
        this.f78122c = dVar;
        this.f78123d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f78120a, this.f78121b, this.f78122c, this.f78123d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [T, com.garmin.proto.generated.WifiSetup$StatusType] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String str;
        GDIWifiSetup.ConnectionVerificationStatusNotification connectionVerificationStatusNotification = this.f78120a;
        t13.d<WifiSetup.StatusType> dVar = this.f78122c;
        c cVar = this.f78121b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            try {
                if (connectionVerificationStatusNotification.hasEncryptedWifiProtobuf()) {
                    rs2.c cVar2 = cVar.f78099k;
                    if (cVar2 == null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    List<WifiSetup.StoredAccessPoint> storedApsList = WifiSetup.WifiSetupDevice.parseFrom(b.a(cVar2.getF92746j(), connectionVerificationStatusNotification.getEncryptedWifiProtobuf().toByteArray())).getStoredApsList();
                    if (storedApsList == null) {
                        rs2.c cVar3 = cVar.f78099k;
                        if (cVar3 == null) {
                            s.m("deviceInfo");
                            throw null;
                        }
                        throw new IllegalStateException((cVar3.getF92742f() + " sent proto with null list of stored access points").toString());
                    }
                    if (storedApsList.isEmpty()) {
                        rs2.c cVar4 = cVar.f78099k;
                        if (cVar4 == null) {
                            s.m("deviceInfo");
                            throw null;
                        }
                        throw new IllegalStateException((cVar4.getF92742f() + " sent proto with empty list of stored access points").toString());
                    }
                    rs2.c cVar5 = cVar.f78099k;
                    if (cVar5 == null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    StringBuilder sb3 = new StringBuilder("handleConnectionVerificationStatusNotification: " + cVar5.getF92742f() + " reports " + storedApsList.size() + " stored access points ->");
                    r0 r0Var = new r0();
                    r0 r0Var2 = new r0();
                    r0 r0Var3 = new r0();
                    Iterator<T> it = storedApsList.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        str = this.f78123d;
                        if (!zHasNext) {
                            break;
                        }
                        WifiSetup.StoredAccessPoint storedAccessPoint = (WifiSetup.StoredAccessPoint) it.next();
                        String str2 = "";
                        r0Var.f105810a = storedAccessPoint.hasStatusType() ? storedAccessPoint.getStatusType().name() : "";
                        T t7 = str2;
                        if (storedAccessPoint.hasSsid()) {
                            String ssid = storedAccessPoint.getSsid();
                            ssid.getClass();
                            t7 = ssid;
                        }
                        r0Var2.f105810a = t7;
                        sb3.append("\n  ssid=" + t7 + ", status=" + r0Var.f105810a);
                        if (s.g(str, r0Var2.f105810a)) {
                            r0Var3.f105810a = storedAccessPoint.getStatusType();
                        }
                    }
                    Object obj2 = r0Var3.f105810a;
                    if (obj2 != null) {
                        sb3.append("\nRESULT: " + obj2);
                        cVar.m().debug(sb3.toString());
                        int i14 = q.f128596b;
                        T t14 = r0Var3.f105810a;
                        t14.getClass();
                        dVar.resumeWith(t14);
                    } else {
                        sb3.append("\nRESULT: ssid " + str + " not present in returned list");
                        cVar.m().a(null, sb3.toString());
                        int i15 = q.f128596b;
                        dVar.resumeWith(new q.b(new Exception(sb3.toString())));
                    }
                } else {
                    rs2.c cVar6 = cVar.f78099k;
                    if (cVar6 == null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    String str3 = "handleConnectionVerificationStatusNotification: " + cVar6.getF92742f() + " sent proto missing 'encryptedWifiProtobuf' message";
                    cVar.m().error(str3, null);
                    int i16 = q.f128596b;
                    dVar.resumeWith(new q.b(new Exception(str3)));
                }
            } catch (Exception e4) {
                zy2.k kVarM = cVar.m();
                rs2.c cVar7 = cVar.f78099k;
                if (cVar7 == null) {
                    s.m("deviceInfo");
                    throw null;
                }
                kVarM.error("handleConnectionVerificationStatusNotification (" + cVar7.getF92742f() + ")", e4);
                int i17 = q.f128596b;
                dVar.resumeWith(new q.b(e4));
            }
            cVar.f78101m = null;
            cVar.f78102n = null;
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            cVar.f78101m = null;
            cVar.f78102n = null;
            throw th3;
        }
    }
}
