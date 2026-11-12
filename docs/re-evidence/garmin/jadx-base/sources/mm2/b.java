package mm2;

import android.content.Context;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import java.util.UUID;
import lm2.h;
import o13.p;
import org.slf4j.Logger;
import sm2.w;

/* JADX INFO: loaded from: classes11.dex */
public class b implements w.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bm2.d f119685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f119686b;

    public b(c cVar, bm2.d dVar) {
        this.f119686b = cVar;
        this.f119685a = dVar;
    }

    @Override // sm2.w.b
    public final void a(long j8, long j14) {
    }

    @Override // sm2.w.b
    public final void b(p<byte[], UUID> pVar, String str) {
        bm2.d dVar = this.f119685a;
        c cVar = this.f119686b;
        if (pVar == null) {
            Context context = cVar.f119679c;
            cVar.d(dVar, false);
            return;
        }
        Context context2 = cVar.f119679c;
        byte[] bArr = pVar.f128594a;
        h.d();
        boolean z14 = GarminDeviceWakefulService.f33825e;
        Logger logger = cVar.f119678b;
        if (z14) {
            logger.error("onGarminDeviceXmlRead: User in pairing flow, NonSetupHandshakeStrategy should not have been called. Aborting.");
            return;
        }
        logger.info("onGarminDeviceXmlRead(" + dVar.getF92746j() + "-" + dVar.f() + ")");
        cVar.f119679c = context2;
        ((em2.d) h.e()).d(dVar, bArr);
        cVar.c(dVar, bArr);
        cVar.d(dVar, false);
    }
}
