package lm0;

import com.garmin.proto.generated.WifiSetup;
import d53.t;
import j70.r;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p13.h0;
import p3.p1;
import sk0.l0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f113583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f113584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f113585d;

    public /* synthetic */ o(e23.l lVar, p1 p1Var, p1 p1Var2, int i14) {
        this.f113582a = i14;
        this.f113583b = lVar;
        this.f113584c = p1Var;
        this.f113585d = p1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        Long lJ;
        switch (this.f113582a) {
            case 0:
                km0.e.a aVar = (km0.e.a) this.f113584c.getF182175a();
                if (aVar != null) {
                    this.f113583b.invoke(aVar);
                }
                this.f113585d.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f113585d.setValue(Boolean.FALSE);
                this.f113583b.invoke(this.f113584c.getF182175a());
                break;
            case 2:
                f12.l.f68084a.getClass();
                f12.l lVarA = f12.l.a.a();
                p1 p1Var = this.f113584c;
                lVarA.B1((LocalDate) p1Var.getF182175a());
                this.f113583b.invoke((LocalDate) p1Var.getF182175a());
                this.f113585d.setValue(Boolean.FALSE);
                break;
            case 3:
                if (!((Boolean) this.f113584c.getF182175a()).booleanValue()) {
                    this.f113583b.invoke(Integer.valueOf(rr0.m.c((String) this.f113585d.getF182175a())));
                }
                break;
            case 4:
                this.f113584c.setValue(Boolean.FALSE);
                this.f113583b.invoke((r) this.f113585d.getF182175a());
                break;
            case 5:
                WifiSetup.ScannedAccessPoint.Builder builderNewBuilder = WifiSetup.ScannedAccessPoint.newBuilder();
                builderNewBuilder.getClass();
                builderNewBuilder.setSsid((String) this.f113584c.getF182175a());
                com.garmin.android.apps.connectmobile.settings.devices.wifi.k.b bVar = com.garmin.android.apps.connectmobile.settings.devices.wifi.k.f43319i;
                com.garmin.android.apps.connectmobile.settings.devices.wifi.k.c cVar = ((com.garmin.android.apps.connectmobile.settings.devices.wifi.p) this.f113585d.getF182175a()).f43399b;
                bVar.getClass();
                builderNewBuilder.setSecurityType(com.garmin.android.apps.connectmobile.settings.devices.wifi.k.b.b(cVar));
                WifiSetup.ScannedAccessPoint scannedAccessPointBuildPartial = builderNewBuilder.buildPartial();
                scannedAccessPointBuildPartial.getClass();
                this.f113583b.invoke(scannedAccessPointBuildPartial);
                break;
            case 6:
                p1 p1Var2 = this.f113584c;
                if (((l0) p1Var2.getF182175a()).f159722c.size() >= 50) {
                    this.f113585d.setValue(Boolean.TRUE);
                } else {
                    this.f113583b.invoke(((l0) p1Var2.getF182175a()).f159722c);
                }
                break;
            case 7:
                p1 p1Var3 = this.f113584c;
                List list = (List) p1Var3.getF182175a();
                p1 p1Var4 = this.f113585d;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()).length() == 0) {
                            p1Var4.setValue(Boolean.TRUE);
                        }
                    }
                    lJ = t.j(h0.k0((List) p1Var3.getF182175a(), "", null, null, null, 62));
                    if (lJ != null || lJ.longValue() <= 0 || lJ.longValue() > 1048575) {
                        p1Var4.setValue(Boolean.TRUE);
                    } else {
                        this.f113583b.invoke(lJ);
                    }
                } else {
                    lJ = t.j(h0.k0((List) p1Var3.getF182175a(), "", null, null, null, 62));
                    if (lJ != null) {
                        p1Var4.setValue(Boolean.TRUE);
                    } else {
                        p1Var4.setValue(Boolean.TRUE);
                    }
                }
                break;
            default:
                String str = (String) this.f113584c.getF182175a();
                if (str != null) {
                    this.f113583b.invoke(str);
                }
                this.f113585d.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ o(p1 p1Var, e23.l lVar, p1 p1Var2, int i14) {
        this.f113582a = i14;
        this.f113584c = p1Var;
        this.f113583b = lVar;
        this.f113585d = p1Var2;
    }
}
