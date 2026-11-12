package pc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import d53.u;
import d53.w;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpc2/d;", "Lpc2/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "otherAppDI2AccessToken", "Lsc2/l;", "thisAppDI2Client", "mfaToken", "Lnc2/d;", "integrityTokenProvider", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Lsc2/l;Ljava/lang/String;Lnc2/d;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f137324n = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f137325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sc2.l f137326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f137327m;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context, ve2.e eVar, String str, sc2.l lVar, String str2, nc2.d dVar) {
        context.getClass();
        eVar.getClass();
        str.getClass();
        lVar.getClass();
        Logger loggerB = nd2.c.b("DI2ForDI2Request");
        loggerB.getClass();
        super(context, eVar, loggerB, null, lVar, dVar, 8, null);
        this.f137325k = str;
        this.f137326l = lVar;
        this.f137327m = str2;
    }

    @Override // pc2.b
    public final Object d() {
        String strI = nd2.c.i(this.f137325k);
        String strI2 = nd2.c.i(this.f137326l.f158524a);
        String strI3 = nd2.c.i("urn:ietf:params:oauth:token-type:access_token");
        String strI4 = nd2.c.i("urn:ietf:params:oauth:grant-type:token-exchange");
        String str = this.f137327m;
        String strConcat = (str == null || w.J(str)) ? "" : "&mfa_token=".concat(nd2.c.i(str));
        StringBuilder sbI = p6.b.i("subject_token=", strI, "&client_id=", strI2, "&subject_token_type=");
        sbI.append(strI3);
        sbI.append("&grant_type=");
        sbI.append(strI4);
        sbI.append(strConcat);
        return u.o(sbI.toString());
    }
}
