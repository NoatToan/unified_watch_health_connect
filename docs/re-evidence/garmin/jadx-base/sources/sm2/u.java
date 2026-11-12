package sm2;

import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public class u implements w.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f160347a;

    public u(v vVar) {
        this.f160347a = vVar;
    }

    @Override // sm2.w.b
    public final void a(long j8, long j14) {
        rm2.c cVar = this.f160347a.f160342h;
        if (cVar != null) {
            cVar.a(j8, j14);
        }
    }

    @Override // sm2.w.b
    public final void b(o13.p<byte[], UUID> pVar, String str) {
        v vVar = this.f160347a;
        if (pVar != null) {
            byte[] bArr = pVar.f128594a;
            if (bArr.length > 0) {
                vVar.f160340f.debug(".handleDeviceXMLDownloadSuccess()");
                yl2.d dVar = vVar.f160338d;
                if (dVar != null) {
                    dVar.f197848j = bArr;
                    UUID uuid = pVar.f128595b;
                }
                rm2.c cVar = vVar.f160342h;
                if (cVar != null) {
                    cVar.v(qm2.k.RETRIEVING_GARMIN_DEVICE_XML_SUCCESS);
                }
                vVar.d();
                return;
            }
        }
        if (str != null) {
            v.j(vVar, str);
        } else {
            v.j(vVar, "Invalid deviceXMLBytes length");
        }
    }
}
