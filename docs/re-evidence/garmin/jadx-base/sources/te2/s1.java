package te2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.lib.networking.authentication.gcapi.GCSaveUserTimezoneWorker;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lte2/s1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsc2/h;", "serviceTicket", "", "isCreateAcctWebFlow", "Lve2/l;", "mobileAuthConfig", "Lve2/e;", "environment", "Lre2/b$c;", "mode", "<init>", "(Landroid/content/Context;Lsc2/h;ZLve2/l;Lve2/e;Lre2/b$c;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f164288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sc2.h f164289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ve2.l f164291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ve2.e f164292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final re2.b.c f164293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f164294g;

    public s1(Context context, sc2.h hVar, boolean z14, ve2.l lVar, ve2.e eVar, re2.b.c cVar) {
        context.getClass();
        hVar.getClass();
        lVar.getClass();
        eVar.getClass();
        cVar.getClass();
        this.f164288a = context;
        this.f164289b = hVar;
        this.f164290c = z14;
        this.f164291d = lVar;
        this.f164292e = eVar;
        this.f164293f = cVar;
        re2.l0.f152316a.getClass();
        this.f164294g = re2.l0.c("ITTicketForCredentialExchanger");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(s1 s1Var, String str, v13.c cVar) {
        r1 r1Var;
        Logger logger = s1Var.f164294g;
        if (cVar instanceof r1) {
            r1Var = (r1) cVar;
            int i14 = r1Var.f164277c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r1Var.f164277c = i14 - Integer.MIN_VALUE;
            } else {
                r1Var = new r1(s1Var, cVar);
            }
        } else {
            r1Var = new r1(s1Var, cVar);
        }
        Object obj = r1Var.f164275a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = r1Var.f164277c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                if (s1Var.f164290c && !s1Var.f164291d.f177766g) {
                    logger.debug("isCreateAcctWebFlow TRUE, enqueuing 'GCSaveUserTimezoneWorker'...");
                    GCSaveUserTimezoneWorker.a aVar = GCSaveUserTimezoneWorker.f50069e;
                    Context context = s1Var.f164288a;
                    String str2 = s1Var.f164292e.f177720b;
                    re2.b.f152215a.getClass();
                    String str3 = (String) re2.b.f152225k.getValue();
                    String strK = re2.b.k();
                    r1Var.f164277c = 1;
                    aVar.getClass();
                    if (str == null || d53.w.J(str)) {
                        throw new IllegalArgumentException("'oAuth2DIAccessToken' is null/blank and 'oAuth1GCCredential' is null");
                    }
                    Object objE0 = ge1.b.e0(o53.s0.f129406a, new com.garmin.android.lib.networking.authentication.gcapi.a(str2, str3, strK, str, null, context, null), r1Var);
                    if (objE0 != obj2) {
                        objE0 = Unit.INSTANCE;
                    }
                    if (objE0 == obj2) {
                        return obj2;
                    }
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (Throwable th3) {
            logger.error("scheduleSaveUserTimezone: GCSaveUserTimezoneWorker.enqueue", th3);
        }
        return Unit.INSTANCE;
    }

    public static final void b(s1 s1Var, String str, String str2) {
        s1Var.getClass();
        if (d53.w.J(str2)) {
            String strConcat = str.concat(" is blank");
            s1Var.f164294g.error(strConcat);
            vb.h.s(strConcat);
        }
    }
}
