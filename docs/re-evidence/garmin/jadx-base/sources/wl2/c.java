package wl2;

import com.garmin.device.nfc.g;
import com.garmin.device.nfc.i;
import com.google.common.util.concurrent.SettableFuture;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwl2/c;", "Lcom/garmin/device/nfc/g$f;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements g.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f186025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f186026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SettableFuture<i> f186027c;

    public c(b bVar, String str, SettableFuture<i> settableFuture) {
        this.f186025a = bVar;
        this.f186026b = str;
        this.f186027c = settableFuture;
    }

    @Override // com.garmin.device.nfc.g.e
    public final void a(i iVar) {
        int i14 = b.f186020p;
        b bVar = this.f186025a;
        bVar.f165290g.trace("Received response for Wallet Update Type: " + this.f186026b);
        bVar.i();
        this.f186027c.set(iVar);
    }

    @Override // com.garmin.device.nfc.g.f
    public final void b(int i14) {
        int i15 = b.f186020p;
        b bVar = this.f186025a;
        Logger logger = bVar.f165290g;
        StringBuilder sb3 = new StringBuilder("No response for Wallet Update Type: ");
        String str = this.f186026b;
        sb3.append(str);
        logger.trace(sb3.toString());
        bVar.i();
        this.f186027c.setException(new Exception("No response for wallet update type: " + str + ", messageId: " + i14));
    }
}
