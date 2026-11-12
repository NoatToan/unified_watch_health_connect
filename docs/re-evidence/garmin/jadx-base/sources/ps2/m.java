package ps2;

import com.garmin.garminpay.wallet.PasscodeSetFailedException;
import com.garmin.garminpay.wallet.PasscodeVerifyFailedException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m implements cs2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e13.a.C1312a f140497b;

    public /* synthetic */ m(e13.a.C1312a c1312a, int i14) {
        this.f140496a = i14;
        this.f140497b = c1312a;
    }

    @Override // cs2.a
    public final void accept(Object obj) {
        switch (this.f140496a) {
            case 0:
                js2.f fVar = (js2.f) obj;
                Boolean bool = fVar != null ? fVar.f100676a : null;
                e13.a.C1312a c1312a = this.f140497b;
                if (bool == null) {
                    c1312a.a(new PasscodeVerifyFailedException(fVar != null ? fVar.f100677b : -1));
                } else {
                    c1312a.c(fVar);
                }
                break;
            default:
                js2.a aVar = (js2.a) obj;
                e13.a.C1312a c1312a2 = this.f140497b;
                if (aVar == null) {
                    c1312a2.a(new PasscodeSetFailedException());
                } else {
                    c1312a2.c(aVar);
                }
                break;
        }
    }
}
