package defpackage;

import com.xiaomi.push.service.XMPushService;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class xhs extends jws {
    public final /* synthetic */ XMPushService h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhs(XMPushService xMPushService, Map map, int i, String str, ows owsVar) {
        super(map, i, str, owsVar);
        this.h = xMPushService;
    }

    @Override // defpackage.jws
    public byte[] g() {
        try {
            fqs fqsVar = new fqs();
            fqsVar.j(rds.c().a());
            return fqsVar.h();
        } catch (Exception e) {
            x9s.o("getOBBString err: " + e.toString());
            return null;
        }
    }
}
