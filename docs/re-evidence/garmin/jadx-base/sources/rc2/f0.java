package rc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.net.HttpURLConnection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\rB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lrc2/f0;", "Lrc2/k;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "Lsc2/h;", "theITServiceTicket", "", "thisAppIT2ClientId", "thisAppITClientIdLoggingOnly", "<init>", "(Landroid/content/Context;Lve2/e;Lsc2/h;Ljava/lang/String;Ljava/lang/String;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 extends k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f151901i = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sc2.h f151902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f151903h;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, ve2.e eVar, sc2.h hVar, String str, String str2) {
        super(context, "ITTicketForIT2Request", eVar, str2, "service_ticket");
        context.getClass();
        eVar.getClass();
        hVar.getClass();
        str.getClass();
        str2.getClass();
        this.f151902g = hVar;
        this.f151903h = str;
    }

    @Override // rc2.k
    public final byte[] d() {
        String strN = fb1.c.n("client_id=", this.f151903h);
        sc2.h hVar = this.f151902g;
        return d53.u.o(strN + "&service_url=".concat(nd2.c.i(hVar.f158505a)) + "&service_ticket=".concat(nd2.c.i(hVar.f158506b)));
    }

    @Override // rc2.k
    public final void g(HttpURLConnection httpURLConnection) {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrc2/f0$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
