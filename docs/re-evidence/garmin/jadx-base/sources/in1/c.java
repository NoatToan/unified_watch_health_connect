package in1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sm1.s f94512b;

    public /* synthetic */ c(sm1.s sVar, int i14) {
        this.f94511a = i14;
        this.f94512b = sVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        String str;
        switch (this.f94511a) {
            case 0:
                this.f94512b.z4(((Boolean) obj).booleanValue());
                break;
            case 1:
                rl1.i iVar = (rl1.i) obj;
                if (iVar != null) {
                    ht.a aVar = ht.a.f85464a;
                    switch (sn1.c.f160415a[iVar.ordinal()]) {
                        case 1:
                            str = "SleepScoreAwakeChip";
                            break;
                        case 2:
                            str = "SleepScoreHeartRateChip";
                            break;
                        case 3:
                            str = "SleepScoreBodyBatteryChip";
                            break;
                        case 4:
                            str = "SleepScorePulseOxChip";
                            break;
                        case 5:
                        case 6:
                            str = "SleepScoreRespirationChip";
                            break;
                        case 7:
                            str = "SleepScoreOvernightHrvChip";
                            break;
                        default:
                            str = "";
                            break;
                    }
                    aVar.getClass();
                    ht.a.a(null, str);
                }
                this.f94512b.B4(iVar);
                break;
            case 2:
                this.f94512b.C4(((Integer) obj).intValue());
                break;
            default:
                this.f94512b.B4((rl1.i) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
