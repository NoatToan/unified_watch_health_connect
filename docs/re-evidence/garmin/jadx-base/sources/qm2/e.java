package qm2;

import bd0.e0;
import java.util.UUID;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import sm2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqm2/e;", "Lsm2/w$b;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements w.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f145705a;

    public e(b bVar) {
        this.f145705a = bVar;
    }

    @Override // sm2.w.b
    public final void a(long j8, long j14) {
        this.f145705a.f145657b.a(j8, j14);
    }

    @Override // sm2.w.b
    public final void b(o13.p<byte[], UUID> pVar, String str) {
        b bVar = this.f145705a;
        bm2.d dVar = bVar.f145673r;
        if (dVar == null) {
            dVar = bVar.f145675t;
        }
        if (dVar == null) {
            bVar.n(yl2.e.DEVICE_INFO_OBJ_NULL, str);
            return;
        }
        byte[] bArr = pVar != null ? pVar.f128594a : null;
        if (bArr == null || bArr.length == 0) {
            b.B.error(v.h.u(dVar.getF92746j(), "onGarminDeviceXmlRead(", ") failure: ", str));
            k kVar = k.RETRIEVING_GARMIN_DEVICE_XML_FAILURE;
            bVar.m(kVar);
            yl2.e eVar = yl2.e.XML_DOWNLOAD_FAILURE;
            bVar.l(kVar, eVar);
            bVar.n(eVar, str);
            return;
        }
        Logger logger = b.B;
        logger.info("onGarminDeviceXmlRead(" + dVar.getF92746j() + ")");
        bVar.m(k.RETRIEVING_GARMIN_DEVICE_XML_SUCCESS);
        wr.g.v("registerDevice(", dVar.getF92746j(), ")", logger);
        if (bArr.length != 0) {
            bVar.m(k.REGISTERING_DEVICE);
            synchronized (bVar.f145661f) {
                bVar.f145667l = ((e0) lm2.h.f()).k(new yl2.c(dVar, bArr), new f(bVar, dVar, bArr));
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        logger.error("registerDevice: Tried to register device without device XML");
        k kVar2 = k.REGISTERING_DEVICE_FAILURE;
        bVar.m(kVar2);
        String strF = dVar.f();
        if (strF != null && strF.length() != 0) {
            bVar.l(kVar2, yl2.e.NETWORK);
        }
        bVar.n(yl2.e.NETWORK, "No device XML");
    }
}
