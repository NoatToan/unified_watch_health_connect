package qm2;

import java.util.UUID;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import sm2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqm2/j;", "Lsm2/w$b;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements w.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f145715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bm2.d f145716b;

    public j(h hVar, bm2.d dVar) {
        this.f145715a = hVar;
        this.f145716b = dVar;
    }

    @Override // sm2.w.b
    public final void a(long j8, long j14) {
    }

    @Override // sm2.w.b
    public final void b(o13.p<byte[], UUID> pVar, String str) {
        byte[] bArr = pVar != null ? pVar.f128594a : null;
        Logger logger = h.f145710g;
        h hVar = this.f145715a;
        hVar.getClass();
        Logger logger2 = h.f145710g;
        bm2.d dVar = this.f145716b;
        if (bArr == null || bArr.length == 0) {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(dVar.getF92746j(), "onGarminDeviceXmlRead(", "-", dVar.f());
            sbK.append(") failure: ");
            sbK.append(str);
            logger2.error(sbK.toString());
            return;
        }
        StringBuilder sbK2 = com.airbnb.lottie.animation.keyframe.a.k(dVar.getF92746j(), "onGarminDeviceXmlRead(", "-", dVar.f());
        sbK2.append(")");
        logger2.info(sbK2.toString());
        logger2.debug("saveGarminDeviceXml");
        ((em2.d) lm2.h.e()).d(dVar, bArr);
        if (bArr.length == 0) {
            logger2.error("checkForFirmwareUpdate: missing required device information (" + dVar.getF92746j() + "), aborting");
            return;
        }
        wr.g.v("checkForFirmwareUpdate(", dVar.getF92746j(), ")", logger2);
        nm2.a aVar = hVar.f145711f;
        if (aVar == null) {
            s.m("mNonSetupDelegate");
            throw null;
        }
        if (aVar.a(dVar.getF92746j())) {
            ((im2.c) lm2.h.f()).c(new yl2.c(dVar, bArr), new i(hVar, dVar, bArr));
        } else {
            logger2.debug("checkForFirmwareUpdate skipped");
        }
    }
}
