package sm2;

import android.content.Context;
import com.garmin.device.pairing.PairingException;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a extends r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public pm2.a f160284i;

    public a(Context context, yl2.d dVar, rm2.c cVar, String str) {
        super(context, dVar, cVar, str);
    }

    public void j() {
        String str;
        Logger logger = this.f160340f;
        logger.info("Connect to device");
        pm2.a aVar = this.f160284i;
        rm2.c cVar = this.f160342h;
        if (aVar == null) {
            pm2.a aVar2 = new pm2.a(cVar);
            this.f160284i = aVar2;
            aVar2.a(this.f160339e);
        }
        yl2.d dVar = this.f160338d;
        if (dVar.f197842d != null) {
            lm2.g gVarC = lm2.h.c();
            String strF = dVar.f197842d.f();
            fm2.c cVar2 = (fm2.c) gVarC;
            strF.getClass();
            if (strF.length() != 0 && da2.d.c(cVar2.g()).a(strF) != null) {
                logger.debug("Device already connected and authenticated");
                if (dVar.f197853o) {
                    m(dVar.f197842d);
                    return;
                } else {
                    cVar.v(qm2.k.CONNECTING_SUCCESS);
                    d();
                    return;
                }
            }
        }
        if (dVar.f197841c == null) {
            e(new PairingException(this, yl2.e.ABORTED));
            return;
        }
        fm2.c cVar3 = (fm2.c) lm2.h.c();
        bm2.a aVar3 = dVar.f197841c;
        if (aVar3 != null && (str = aVar3.f18886a) != null && str.length() != 0) {
            vm2.a aVar4 = vm2.a.f178815a;
            fm2.b bVar = new fm2.b(cVar3, 0, aVar3, dVar);
            aVar4.getClass();
            vm2.a.b(aVar3, bVar, true);
        }
        if (cVar != null) {
            cVar.v(qm2.k.CONNECTING);
        }
    }

    public void k(String str) {
        com.airbnb.lottie.animation.keyframe.a.A(".handleConnectingFailure(): ", str, this.f160340f);
        rm2.c cVar = this.f160342h;
        if (cVar != null) {
            cVar.m(qm2.k.CONNECTING_FAILURE, yl2.e.CONNECTION_FAILURE, str);
        }
        e(new PairingException(this, yl2.e.CONNECTION_FAILURE, str));
    }

    public void l(String str) {
        com.airbnb.lottie.animation.keyframe.a.A(".handleConnectingTimeout(): ", str, this.f160340f);
        rm2.c cVar = this.f160342h;
        if (cVar != null) {
            cVar.m(qm2.k.CONNECTING_TIMEOUT, yl2.e.CONNECTION_TIMED_OUT, str);
        }
        e(new PairingException(this, yl2.e.CONNECTION_TIMED_OUT, str));
    }

    public final void m(bm2.d dVar) {
        bm2.f fVar;
        pm2.a aVar = this.f160284i;
        if (aVar != null) {
            aVar.b(this.f160339e);
        }
        yl2.d dVar2 = this.f160338d;
        dVar2.f197842d = dVar;
        if (dVar != null && (fVar = dVar2.f197840b) != null) {
            fVar.b(dVar.getF92746j());
        }
        dVar2.f197853o = false;
        dVar2.f197854p = true;
        this.f160340f.debug("handleHandshakeCompleted: sending milestone STARTED to device");
        lm2.g gVarC = lm2.h.c();
        String strF = dVar.f();
        strF.getClass();
        ((fm2.c) gVarC).p(da2.j.STARTED, strF, null, null);
        rm2.c cVar = this.f160342h;
        if (cVar != null) {
            cVar.v(qm2.k.CONNECTING_SUCCESS);
        }
        d();
    }
}
