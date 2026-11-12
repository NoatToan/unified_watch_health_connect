package pc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import d53.u;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpc2/p;", "Lpc2/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "Lsc2/h;", "theITServiceTicket", "Lsc2/l;", "di2Client", "Lnc2/d;", "integrityTokenProvider", "<init>", "(Landroid/content/Context;Lve2/e;Lsc2/h;Lsc2/l;Lnc2/d;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f137361m = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final sc2.h f137362k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sc2.l f137363l;

    /* JADX WARN: Illegal instructions before constructor call */
    public p(Context context, ve2.e eVar, sc2.h hVar, sc2.l lVar, nc2.d dVar) {
        context.getClass();
        eVar.getClass();
        hVar.getClass();
        lVar.getClass();
        Logger loggerB = nd2.c.b("ITTicketForDI2Request");
        loggerB.getClass();
        super(context, eVar, loggerB, null, lVar, dVar, 8, null);
        this.f137362k = hVar;
        this.f137363l = lVar;
    }

    @Override // pc2.b
    public final Object d() {
        String strI = nd2.c.i(this.f137363l.f158524a);
        sc2.h hVar = this.f137362k;
        String strI2 = nd2.c.i(hVar.f158506b);
        String strI3 = nd2.c.i("https://connectapi.garmin.com/di-oauth2-service/oauth/grant/service_ticket");
        String strI4 = nd2.c.i(hVar.f158505a);
        StringBuilder sbI = p6.b.i("client_id=", strI, "&service_ticket=", strI2, "&grant_type=");
        sbI.append(strI3);
        sbI.append("&service_url=");
        sbI.append(strI4);
        return u.o(sbI.toString());
    }
}
