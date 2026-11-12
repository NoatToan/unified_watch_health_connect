package wl2;

import com.garmin.device.nfc.NfcCommandHandler;
import com.garmin.device.nfc.g;
import com.garmin.device.nfc.i;
import com.garmin.device.nfc.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwl2/e;", "Lcom/garmin/device/nfc/g$f;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements g.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cs2.a<Boolean> f186031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f186032b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186033a;

        static {
            int[] iArr = new int[j.a.values().length];
            try {
                iArr[j.a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f186033a = iArr;
        }
    }

    public e(cs2.a<Boolean> aVar, b bVar) {
        this.f186031a = aVar;
        this.f186032b = bVar;
    }

    @Override // com.garmin.device.nfc.g.e
    public final void a(i iVar) {
        j.a aVarC = j.c(iVar, NfcCommandHandler.e.WALLET_UPDATE_REQUEST_RESPONSE);
        aVarC.getClass();
        int i14 = a.f186033a[aVarC.ordinal()];
        cs2.a<Boolean> aVar = this.f186031a;
        if (i14 == 1) {
            aVar.accept(Boolean.TRUE);
            return;
        }
        int i15 = b.f186020p;
        this.f186032b.f165290g.error("Failure response from device for wallet update start");
        aVar.accept(Boolean.FALSE);
    }

    @Override // com.garmin.device.nfc.g.f
    public final void b(int i14) {
        int i15 = b.f186020p;
        this.f186032b.f165290g.error("No response from device for wallet update start");
        this.f186031a.accept(Boolean.FALSE);
    }
}
