package sm2;

import android.content.Context;
import com.garmin.device.pairing.PairingException;
import java.util.UUID;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class v extends r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lm2.f f160348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f160349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public w f160350k;

    public v(Context context, yl2.d dVar, rm2.c cVar, lm2.f fVar, int i14) {
        super(context, dVar, cVar, "RetrieveDeviceXmlOperation");
        this.f160350k = null;
        this.f160348i = fVar;
        this.f160349j = i14;
    }

    public static void j(v vVar, String str) {
        vVar.f160338d.getF197656b();
        Logger logger = vVar.f160340f;
        logger.warn(".handleDeviceXMLDownloadFailure()");
        rm2.c cVar = vVar.f160342h;
        if (cVar != null) {
            cVar.m(qm2.k.RETRIEVING_GARMIN_DEVICE_XML_FAILURE, yl2.e.XML_DOWNLOAD_FAILURE, null);
        }
        logger.debug("  >> .handleDeviceXMLDownloadFailure() - sent milestone PAIRING FAILED to device.");
        vVar.e(new PairingException(vVar, yl2.e.XML_DOWNLOAD_FAILURE, str));
    }

    @Override // sm2.r
    public final void h() {
        yl2.d dVar = this.f160338d;
        byte[] bArr = dVar.f197848j;
        Logger logger = this.f160340f;
        if (bArr != null) {
            logger.debug("GdXml was already retrieved");
            d();
            return;
        }
        logger.debug(".retrieveDeviceXML()");
        rm2.c cVar = this.f160342h;
        if (cVar != null) {
            cVar.v(qm2.k.RETRIEVING_GARMIN_DEVICE_XML);
        }
        bm2.d dVar2 = dVar.f197842d;
        o13.p<byte[], UUID> pVarF = this.f160348i.f(dVar2);
        byte[] bArr2 = pVarF.f128594a;
        if (bArr2 != null && bArr2.length != 0) {
            dVar.f197848j = bArr2;
            UUID uuid = pVarF.f128595b;
            d();
            return;
        }
        String strF = dVar2.f();
        w wVar = this.f160350k;
        if (wVar != null) {
            wVar.b();
        }
        w wVar2 = new w(this.f160340f, strF, new u(this), this.f160349j, true);
        this.f160350k = wVar2;
        wVar2.c();
    }

    public v(Context context, yl2.d dVar, rm2.c cVar, lm2.f fVar) {
        this(context, dVar, cVar, fVar, 0);
    }
}
