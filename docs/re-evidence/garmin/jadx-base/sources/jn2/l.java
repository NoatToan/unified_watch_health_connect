package jn2;

import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l implements cs2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f99643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f99644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f99645d;

    public /* synthetic */ l(rl2.c cVar, o53.r rVar, y92.f fVar) {
        this.f99642a = 1;
        this.f99643b = cVar;
        this.f99644c = rVar;
        this.f99645d = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006f  */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x006f, please report this as an issue */
    @Override // cs2.a
    public final void accept(Object obj) {
        Object objT;
        int i14 = this.f99642a;
        Object obj2 = this.f99645d;
        Object obj3 = this.f99643b;
        Object obj4 = this.f99644c;
        switch (i14) {
            case 0:
                m mVar = (m) obj4;
                rl2.c cVar = (rl2.c) obj3;
                ps2.l lVar = (ps2.l) obj2;
                Boolean bool = (Boolean) obj;
                ListeningScheduledExecutorService listeningScheduledExecutorService = m.f99646l;
                if (!bool.booleanValue() && mVar.d()) {
                    mVar.f(hs2.g.RESETTING_SECURE_ELEMENT);
                    lVar.accept(bool);
                } else {
                    cVar.b(new g(1, mVar, lVar));
                }
                break;
            case 1:
                rl2.c cVar2 = (rl2.c) obj3;
                o53.r rVar = (o53.r) obj4;
                y92.f fVar = (y92.f) obj2;
                Boolean bool2 = (Boolean) obj;
                x92.a.f189663a.getClass();
                x92.a.a("DevicePasscodeRepository", "Reset Wallet: success=" + bool2);
                if (!bool2.booleanValue()) {
                    rVar.p(Boolean.FALSE);
                } else {
                    cVar2.b(new y92.j(fVar, rVar, 2));
                }
                break;
            default:
                y92.f fVar2 = (y92.f) obj4;
                y92.e eVar = (y92.e) obj3;
                o53.r rVar2 = (o53.r) obj2;
                pl2.l lVar2 = (pl2.l) obj;
                lVar2.getClass();
                z92.b bVarH = y92.f.h(fVar2, lVar2);
                long j8 = fVar2.f195306a;
                x92.a.f189663a.getClass();
                x92.a.a("DevicePasscodeRepository", "Set Passcode response: " + bVarH);
                if (bVarH.f203141a) {
                    String strK = fVar2.k();
                    if (strK == null) {
                        x92.a.b("DevicePasscodeRepository", "Connection id (mac address) not found for device unit id " + j8);
                        Unit unit = Unit.INSTANCE;
                    } else {
                        y92.b bVar = (y92.b) fVar2.f195308c.f58886a.f111646e.getCapability(strK, y92.b.class);
                        if (bVar != null) {
                            objT = ge1.b.T(fVar2, null, null, new y92.q(bVar, eVar, fVar2, null), 3);
                        } else {
                            x92.a.b("DevicePasscodeRepository", "DevicePasscodeProtobufHandler not found for device unit id " + j8);
                            objT = Unit.INSTANCE;
                        }
                        if (objT == null) {
                            x92.a.b("DevicePasscodeRepository", "Connection id (mac address) not found for device unit id " + j8);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                    y92.a aVar = fVar2.f195307b;
                    if (aVar != null) {
                        aVar.c(j8, eVar);
                    }
                }
                rVar2.p(bVarH);
                break;
        }
    }

    public /* synthetic */ l(Object obj, int i14, Object obj2, Object obj3) {
        this.f99642a = i14;
        this.f99644c = obj;
        this.f99643b = obj2;
        this.f99645d = obj3;
    }
}
