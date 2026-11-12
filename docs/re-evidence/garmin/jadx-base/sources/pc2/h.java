package pc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import d53.u;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpc2/h;", "Lpc2/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "accessToken", "Lsc2/l;", "di2Client", "Lnc2/d;", "integrityTokenProvider", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Lsc2/l;Lnc2/d;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f137335l = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f137336k;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Context context, ve2.e eVar, String str, sc2.l lVar, nc2.d dVar) {
        context.getClass();
        eVar.getClass();
        str.getClass();
        lVar.getClass();
        Logger loggerB = nd2.c.b("DI2ValidateAccessTokenRequest");
        loggerB.getClass();
        super(context, eVar, loggerB, "/di-oauth2-service/token/introspect", lVar, dVar);
        this.f137336k = str;
    }

    @Override // pc2.b
    public final Object d() {
        return u.o("token=".concat(nd2.c.i(this.f137336k)));
    }
}
