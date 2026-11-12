package pc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import d53.u;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpc2/n;", "Lpc2/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "thisAppIT2AccessToken", "Lsc2/l;", "thisAppOAuth2DIClient", "Lnc2/d;", "integrityTokenProvider", "", "isAccountSetupExchange", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Lsc2/l;Lnc2/d;Z)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f137356m = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f137357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f137358l;

    /* JADX WARN: Illegal instructions before constructor call */
    public n(Context context, ve2.e eVar, String str, sc2.l lVar, nc2.d dVar, boolean z14) {
        context.getClass();
        eVar.getClass();
        str.getClass();
        lVar.getClass();
        Logger loggerB = nd2.c.b("IT2ThisAppForDI2Request");
        loggerB.getClass();
        super(context, eVar, loggerB, null, lVar, dVar, 8, null);
        this.f137357k = str;
        this.f137358l = z14;
    }

    @Override // pc2.b
    public final Object d() {
        String strI = nd2.c.i(this.f137357k);
        String strI2 = nd2.c.i("https://services.garmin.com/api/oauth/token");
        String strI3 = nd2.c.i("urn:ietf:params:oauth:grant-type:token-exchange");
        StringBuilder sbI = p6.b.i("subject_token=", strI, "&subject_token_type=", strI2, "&grant_type=");
        sbI.append(strI3);
        sbI.append("&user_login=");
        sbI.append(this.f137358l);
        return u.o(sbI.toString());
    }
}
