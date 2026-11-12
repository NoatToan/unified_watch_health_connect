package pc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import d53.w;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpc2/b;", "Lyc2/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "Lorg/slf4j/Logger;", "logger", "", "urlPath", "Lsc2/l;", "di2Client", "Lnc2/d;", "integrityTokenProvider", "<init>", "(Landroid/content/Context;Lve2/e;Lorg/slf4j/Logger;Ljava/lang/String;Lsc2/l;Lnc2/d;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b extends yc2.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ve2.e f137317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f137318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f137319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final sc2.l f137320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nc2.d f137321j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, ve2.e eVar, Logger logger, String str, sc2.l lVar, nc2.d dVar) {
        super(context);
        context.getClass();
        eVar.getClass();
        logger.getClass();
        str.getClass();
        lVar.getClass();
        this.f137317f = eVar;
        this.f137318g = logger;
        this.f137319h = str;
        this.f137320i = lVar;
        this.f137321j = dVar;
    }

    public static final wc2.a.b c(b bVar) throws Exception {
        String strH = nd2.c.h(bVar.f196741b);
        if (strH == null || w.J(strH)) {
            q2.u("empty response body");
            return null;
        }
        sc2.n.f158540c.getClass();
        sc2.n nVarA = sc2.n.a.a(strH);
        String str = "200 POST " + bVar.f196740a;
        if (nd2.c.f125412a) {
            str = str + "\n" + nVarA;
        }
        bVar.f137318g.debug(str);
        return new wc2.a.b(nVarA, 200);
    }

    public abstract Object d();

    public final Object e(boolean z14, v13.i iVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new a(this, z14, null), iVar);
    }

    public /* synthetic */ b(Context context, ve2.e eVar, Logger logger, String str, sc2.l lVar, nc2.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, eVar, logger, (i14 & 8) != 0 ? "/di-oauth2-service/oauth/token" : str, lVar, dVar);
    }
}
