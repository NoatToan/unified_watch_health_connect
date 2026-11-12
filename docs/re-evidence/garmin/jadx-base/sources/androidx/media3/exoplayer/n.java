package androidx.media3.exoplayer;

import com.garmin.device.nfc.NfcCommandHandler;
import com.garmin.feature.garminpay.providers.gpay.sync.NewFitPayCreditCardSync;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Track;
import com.google.common.base.Function;
import com.google.common.escape.Escaper;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import p005kotlin.Unit;
import vn2.b1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9284b;

    public /* synthetic */ n(Object obj, int i14) {
        this.f9283a = i14;
        this.f9284b = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) throws NfcCommandHandler.NfcCapabilityException {
        switch (this.f9283a) {
            case 0:
                return (ja.a) this.f9284b;
            case 1:
                return ((FragmentedMp4Extractor) this.f9284b).modifyTrack((Track) obj);
            case 2:
                return ((Escaper) this.f9284b).escape((String) obj);
            case 3:
                f9.e eVar = (f9.e) this.f9284b;
                eVar.f97766e = ((Integer) obj).intValue();
                return Integer.valueOf(eVar.f97766e);
            case 4:
                Set set = (Set) this.f9284b;
                Collection<com.garmin.device.nfc.b> collection = (Collection) obj;
                ListeningScheduledExecutorService listeningScheduledExecutorService = jn2.m.f99646l;
                HashMap map = new HashMap();
                if (collection == null) {
                    return null;
                }
                for (com.garmin.device.nfc.b bVar : collection) {
                    byte[] bArr = bVar.f50848a;
                    bArr.getClass();
                    if (set.contains(new String(bArr, d53.c.f57666b))) {
                        map.put(bVar.f50857j, bVar);
                    }
                }
                return map;
            case 5:
                iz1.f fVar = (iz1.f) this.f9284b;
                Logger logger = kn2.a.f105681g;
                return (com.garmin.device.nfc.h[]) fVar.invoke(obj);
            case 6:
                return ol2.c.a((ol2.a) this.f9284b, (ml2.r) obj);
            case 7:
                rl2.c cVar = (rl2.c) this.f9284b;
                com.garmin.device.nfc.i iVar = (com.garmin.device.nfc.i) obj;
                Logger logger2 = NfcCommandHandler.f50799g;
                if (iVar == null) {
                    throw new NfcCommandHandler.NfcCapabilityException("Received null response from the device", rl2.a.DEVICE_MISSING_NFC_CAPABILITIES);
                }
                byte[] bArrD = iVar.d();
                Logger logger3 = NfcCommandHandler.f50799g;
                logger3.debug("Received GET_CAPABILITIES");
                if (bArrD.length < 17) {
                    logger3.error("getCapabilities() - payload size mismatch!");
                    throw new NfcCommandHandler.NfcCapabilityException("payload size mismatch!", rl2.a.CAPABILITIES_PAYLOAD_SIZE_MISMATCH);
                }
                pl2.f fVar2 = new pl2.f(bArrD);
                synchronized (cVar.f50802c) {
                    cVar.f50803d = fVar2;
                    Unit unit = Unit.INSTANCE;
                }
                return fVar2;
            default:
                b1 b1Var = (b1) this.f9284b;
                Logger logger4 = NewFitPayCreditCardSync.f51340f;
                return (Map) b1Var.invoke(obj);
        }
    }
}
