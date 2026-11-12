package pl2;

import com.garmin.device.nfc.NfcCommandHandler;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import org.slf4j.Logger;
import p13.s;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements AsyncFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138581a;

    public /* synthetic */ g(int i14) {
        this.f138581a = i14;
    }

    @Override // com.google.common.util.concurrent.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        switch (this.f138581a) {
            case 0:
                com.garmin.device.nfc.i iVar = (com.garmin.device.nfc.i) obj;
                Logger logger = NfcCommandHandler.f50799g;
                if (iVar == null || iVar.d() == null || iVar.d()[0] != ((byte) NfcCommandHandler.e.SET_EXPRESS_TRANSIT_CARD.f50841a)) {
                    return Futures.immediateFailedFuture(new IOException("Failed to get express card, response incorrect"));
                }
                byte[] bArrD = iVar.d();
                bArrD.getClass();
                return Futures.immediateFuture(s.k(1, iVar.d().length, bArrD));
            case 1:
                com.garmin.device.nfc.i iVar2 = (com.garmin.device.nfc.i) obj;
                Logger logger2 = NfcCommandHandler.f50799g;
                if (iVar2 == null || iVar2.d() == null || iVar2.d()[0] != ((byte) NfcCommandHandler.e.GET_EXPRESS_TRANSIT_CARD.f50841a)) {
                    return Futures.immediateFailedFuture(new IOException("Failed to get express card, response incorrect"));
                }
                byte[] bArrD2 = iVar2.d();
                bArrD2.getClass();
                return Futures.immediateFuture(s.k(1, iVar2.d().length, bArrD2));
            case 2:
                com.garmin.device.nfc.i iVar3 = (com.garmin.device.nfc.i) obj;
                Logger logger3 = NfcCommandHandler.f50799g;
                if (iVar3 == null || iVar3.d() == null || iVar3.d()[0] != ((byte) NfcCommandHandler.e.SET_EXPRESS_TRANSIT_CARD.f50841a)) {
                    return Futures.immediateFailedFuture(new IOException("Failed to get express card, response incorrect"));
                }
                byte[] bArrD3 = iVar3.d();
                bArrD3.getClass();
                return Futures.immediateFuture(s.k(1, iVar3.d().length, bArrD3));
            case 3:
                int i14 = wl2.b.f186020p;
                return Futures.immediateFuture(Boolean.FALSE);
            case 4:
                int i15 = wl2.b.f186020p;
                return Futures.immediateFuture(Boolean.FALSE);
            case 5:
                int i16 = wl2.b.f186020p;
                return Futures.immediateFuture(Boolean.FALSE);
            default:
                int i17 = wl2.b.f186020p;
                return Futures.immediateFuture(Optional.absent());
        }
    }
}
