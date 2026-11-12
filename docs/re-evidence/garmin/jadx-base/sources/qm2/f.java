package qm2;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import bd0.c0;
import com.garmin.device.pairing.PairingException;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqm2/f;", "Llm2/i$b;", "Lvm2/g;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements lm2.i.b<vm2.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f145706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bm2.d f145707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f145708c;

    public f(b bVar, bm2.d dVar, byte[] bArr) {
        this.f145706a = bVar;
        this.f145707b = dVar;
        this.f145708c = bArr;
    }

    @Override // lm2.i.b
    public final void a(vm2.g gVar) {
        String strF;
        Logger logger = b.B;
        logger.info("registerDevice: onSucceed");
        this.f145706a.m(k.REGISTERING_DEVICE_SUCCESS);
        l lVarB = ((c0) lm2.h.d()).b(String.valueOf(this.f145707b.getF92744h()));
        b bVar = this.f145706a;
        bm2.d dVar = this.f145707b;
        byte[] bArr = this.f145708c;
        lm2.g gVar2 = bVar.f145658c;
        if (bVar.f145659d) {
            bm2.d dVar2 = bVar.f145673r;
            if (dVar2 != null) {
                bVar.s(dVar2);
            }
            bm2.d dVar3 = bVar.f145675t;
            if (dVar3 != null) {
                bVar.s(dVar3);
            }
        }
        logger.debug("saveGarminDeviceXml");
        ((em2.d) lm2.h.e()).d(dVar, bArr);
        String strH = bVar.h();
        if (strH != null) {
            logger.info("sendPairingComplete: Sending milestone PAIR_COMPLETE (GFDI #5030 option 4) to remote device");
            fm2.c cVar = (fm2.c) gVar2;
            cVar.getClass();
            cVar.p(da2.j.FINISHED_WITH_SUCCESS, strH, null, null);
            Context context = ((c0) lm2.h.d()).f17547a;
            long jI = bVar.i();
            bm2.d dVar4 = bVar.f145673r;
            Integer numValueOf = dVar4 != null ? Integer.valueOf(dVar4.getF92744h()) : null;
            cn2.d.f28092a.getClass();
            cn2.d.a(context, "com.garmin.device.sharing.management.ACTION_NEW_DEVICE_PAIRED", jI, numValueOf);
        }
        if (bArr.length == 0) {
            logger.error("checkForFirmwareUpdate: missing required device information (" + dVar.getF92746j() + "), aborting");
        } else {
            logger.debug("checkForFirmwareUpdate(" + dVar.getF92746j() + ")");
            ((im2.c) lm2.h.f()).c(new yl2.c(dVar, bArr), null);
        }
        bVar.m(k.COMPLETE);
        if (lVarB.f145762d != 2) {
            logger.info("Sending milestone SYNC_READY (GFDI #5030 option 8) to remote device");
            ((fm2.c) gVar2).j(dVar);
        } else {
            logger.info("Skipping milestone SYNC_READY (GFDI #5030 option 8) App will send later");
        }
        b.e(bVar.f145673r);
        b.e(bVar.f145675t);
        bm2.d dVar5 = bVar.f145675t;
        if (dVar5 == null || (strF = dVar5.f()) == null) {
            strF = dVar.f();
            strF.getClass();
        }
        fm2.c cVar2 = (fm2.c) gVar2;
        cVar2.r(strF);
        String str = bVar.f145674s;
        if (str != null) {
            fm2.d dVar6 = bVar.f145676u;
            cVar2.s(str, dVar6 != null ? dVar6.f72131a.f58871b : null, dVar6 != null ? dVar6.f72131a.f58872c : null, dVar6 != null ? dVar6.f72131a.f58873d : null);
        }
        new Thread(new l0.e(26, bVar, dVar)).start();
        boolean z14 = lVarB.f145762d == 2;
        b bVar2 = this.f145706a;
        synchronized (bVar2.f145661f) {
            b.EnumC2745b enumC2745b = bVar2.f145662g;
            if (enumC2745b != b.EnumC2745b.RUNNING) {
                logger.warn("setupComplete when strategy is " + enumC2745b);
                return;
            }
            bVar2.f145662g = b.EnumC2745b.COMPLETED;
            bVar2.d();
            Unit unit = Unit.INSTANCE;
            long jI2 = bVar2.i();
            BluetoothDevice bluetoothDevice = bVar2.f145670o;
            String address = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
            String str2 = bVar2.f145674s;
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(jI2, "***** BTC PAIRING SUCCESS ***** ", "/", address);
            sbK.append("/");
            sbK.append(str2);
            logger.info(sbK.toString());
            yb2.b.a aVar = lm2.h.f113624g;
            if (aVar != null) {
                aVar.a(bVar2.f145672q, bVar2.f145673r, null);
            }
            bVar2.f145657b.x(z14);
        }
    }

    @Override // lm2.i.b
    public final void onFailure(Throwable th3) {
        th3.getClass();
        if (th3 instanceof PairingException) {
            yl2.e pairingFailure = ((PairingException) th3).getPairingFailure();
            pairingFailure.getClass();
            com.airbnb.lottie.animation.keyframe.a.z("registerDevice: onFail: [", pairingFailure.name(), "]", b.B);
        } else {
            com.airbnb.lottie.animation.keyframe.a.z("registerDevice: onFail: [", th3.getMessage(), "]", b.B);
        }
        k kVar = k.REGISTERING_DEVICE_FAILURE;
        b bVar = this.f145706a;
        bVar.m(kVar);
        String message = th3.getMessage();
        String strF = this.f145707b.f();
        if (strF != null && strF.length() != 0) {
            bVar.l(kVar, yl2.e.NETWORK);
        }
        bVar.n(yl2.e.NETWORK, message);
    }
}
