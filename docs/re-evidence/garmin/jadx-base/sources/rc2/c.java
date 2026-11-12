package rc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.net.HttpURLConnection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\rB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lrc2/c;", "Lrc2/k;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "thisAppOrOtherAppGC1UserToken", "thisAppIT2ClientId", "thisAppITClientIdLoggingOnly", "mfaToken", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f151878k = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ve2.e f151879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f151880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f151881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f151882j;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, ve2.e eVar, String str, String str2, String str3, String str4) {
        super(context, "GC1ForIT2Request", eVar, str3, "connect_exchange");
        context.getClass();
        eVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f151879g = eVar;
        this.f151880h = str;
        this.f151881i = str2;
        this.f151882j = str4;
    }

    @Override // rc2.k
    public final byte[] d() {
        String strI = nd2.c.i(this.f151881i);
        String strI2 = nd2.c.i(this.f151880h);
        String str = this.f151882j;
        return d53.u.o("client_id=" + strI + "&connect_access_token=" + strI2 + ((str == null || d53.w.J(str)) ? "" : "&sso_mfa_token=".concat(nd2.c.i(str))));
    }

    @Override // rc2.k
    public final void g(HttpURLConnection httpURLConnection) {
        ve2.e eVar = ve2.e.f177704d;
        ve2.e eVar2 = this.f151879g;
        if (eVar2 == eVar || eVar2 == ve2.e.f177705e || eVar2 == ve2.e.f177706f || eVar2 == ve2.e.f177707g || eVar2 == ve2.e.f177708h || eVar2 == ve2.e.f177709i || httpURLConnection == null) {
            return;
        }
        httpURLConnection.setRequestProperty("connect-api-host", eVar2.f177720b);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrc2/c$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
