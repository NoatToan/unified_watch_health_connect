package ps2;

import com.garmin.garminpay.wallet.PasscodeSetFailedException;
import com.garmin.garminpay.wallet.ResetDeviceWalletException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements cs2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f140483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z03.c.a f140484c;

    public /* synthetic */ h(n nVar, z03.c.a aVar, int i14) {
        this.f140482a = i14;
        this.f140483b = nVar;
        this.f140484c = aVar;
    }

    @Override // cs2.a
    public final void accept(Object obj) {
        switch (this.f140482a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                z03.c.a aVar = this.f140484c;
                if (!zBooleanValue) {
                    aVar.c(new ResetDeviceWalletException());
                } else {
                    this.f140483b.d();
                    aVar.a();
                }
                break;
            default:
                js2.d dVar = (js2.d) obj;
                z03.c.a aVar2 = this.f140484c;
                if (dVar == null) {
                    aVar2.c(new PasscodeSetFailedException());
                } else {
                    this.f140483b.f140513p = dVar;
                    aVar2.a();
                }
                break;
        }
    }
}
