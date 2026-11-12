package y92;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements cs2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f195336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o53.r f195337c;

    public /* synthetic */ j(f fVar, o53.r rVar, int i14) {
        this.f195335a = i14;
        this.f195336b = fVar;
        this.f195337c = rVar;
    }

    @Override // cs2.a
    public final void accept(Object obj) {
        int i14;
        f fVar;
        a aVar;
        switch (this.f195335a) {
            case 0:
                pl2.l lVar = (pl2.l) obj;
                lVar.getClass();
                f fVar2 = this.f195336b;
                z92.b bVarH = f.h(fVar2, lVar);
                long j8 = fVar2.f195306a;
                a aVar2 = fVar2.f195307b;
                x92.a.f189663a.getClass();
                x92.a.a("DevicePasscodeRepository", "Change Passcode response: " + bVarH);
                if (!bVarH.f203141a) {
                    z92.b.a aVar3 = bVarH.f203142b;
                    if (aVar3 == z92.b.a.WALLET_LOCKED || aVar3 == z92.b.a.WALLET_BLOCKED) {
                        if (aVar2 != null) {
                            aVar2.a(j8);
                        }
                    } else if (aVar3 == z92.b.a.PASSCODE_MISMATCH && aVar2 != null) {
                        aVar2.f(bVarH.f203143c, j8);
                    }
                } else if (aVar2 != null) {
                    aVar2.b(j8);
                }
                this.f195337c.p(bVarH);
                break;
            case 1:
                pl2.l lVar2 = (pl2.l) obj;
                lVar2.getClass();
                f fVar3 = this.f195336b;
                z92.b bVarH2 = f.h(fVar3, lVar2);
                long j14 = fVar3.f195306a;
                a aVar4 = fVar3.f195307b;
                x92.a.f189663a.getClass();
                x92.a.a("DevicePasscodeRepository", "Check Passcode State response: " + bVarH2);
                if (lVar2.f138589b) {
                    z92.b.a aVar5 = bVarH2.f203142b;
                    if (aVar5 == z92.b.a.WALLET_LOCKED || aVar5 == z92.b.a.WALLET_BLOCKED) {
                        if (aVar4 != null) {
                            aVar4.a(j14);
                        }
                    } else if (aVar5 == z92.b.a.PASSCODE_ALREADY_SET && (i14 = bVarH2.f203143c) > 0 && aVar4 != null) {
                        aVar4.f(i14, j14);
                    }
                }
                this.f195337c.p(bVarH2);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                x92.a.f189663a.getClass();
                x92.a.a("DevicePasscodeRepository", "Delete Owner Data: success=" + bool);
                if (bool.booleanValue() && (aVar = (fVar = this.f195336b).f195307b) != null) {
                    aVar.e(fVar.f195306a);
                }
                this.f195337c.p(bool);
                break;
            default:
                pl2.l lVar3 = (pl2.l) obj;
                lVar3.getClass();
                f fVar4 = this.f195336b;
                z92.b bVarH3 = f.h(fVar4, lVar3);
                long j15 = fVar4.f195306a;
                a aVar6 = fVar4.f195307b;
                x92.a.f189663a.getClass();
                x92.a.a("DevicePasscodeRepository", "Verify Passcode response: " + bVarH3);
                if (!bVarH3.f203141a) {
                    z92.b.a aVar7 = bVarH3.f203142b;
                    if (aVar7 == z92.b.a.WALLET_LOCKED || aVar7 == z92.b.a.WALLET_BLOCKED) {
                        if (aVar6 != null) {
                            aVar6.a(j15);
                        }
                    } else if (aVar7 == z92.b.a.PASSCODE_MISMATCH && aVar6 != null) {
                        aVar6.f(bVarH3.f203143c, j15);
                    }
                } else if (aVar6 != null) {
                    aVar6.d(j15);
                }
                this.f195337c.p(bVarH3);
                break;
        }
    }
}
