package pr2;

import bm.y;
import com.garmin.feature.garminpay.ui.passcode.ResetWalletActivity;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import pk0.m;
import qr2.e;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ResetWalletActivity f139644b;

    public /* synthetic */ d(ResetWalletActivity resetWalletActivity, int i14) {
        this.f139643a = i14;
        this.f139644b = resetWalletActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f139643a;
        ResetWalletActivity resetWalletActivity = this.f139644b;
        switch (i14) {
            case 0:
                ResetWalletActivity.a aVar = ResetWalletActivity.f52134l;
                return resetWalletActivity;
            case 1:
                e eVar = resetWalletActivity.f52135g;
                if (eVar == null) {
                    s.m("viewModel");
                    throw null;
                }
                if (eVar.f()) {
                    e eVar2 = resetWalletActivity.f52135g;
                    if (eVar2 == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    if (eVar2.getIsDeviceConnected()) {
                        br2.c.f19585a.o(resetWalletActivity, new d(resetWalletActivity, 2), null);
                    } else {
                        br2.c cVar = br2.c.f19585a;
                        e eVar3 = resetWalletActivity.f52135g;
                        if (eVar3 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        cVar.d(resetWalletActivity, eVar3.getDeviceName(), new y(15));
                    }
                } else {
                    br2.c.f19585a.a(new m(4), resetWalletActivity);
                }
                return Unit.INSTANCE;
            default:
                e eVar4 = resetWalletActivity.f52135g;
                if (eVar4 != null) {
                    eVar4.N1(resetWalletActivity.f52136h);
                    return Unit.INSTANCE;
                }
                s.m("viewModel");
                throw null;
        }
    }
}
