package rc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.net.HttpURLConnection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lrc2/a;", "Lrc2/k;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "thisAppOrOtherAppDI2AccessToken", "thisAppIT2ClientId", "thisAppITClientIdLoggingOnly", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f151861i = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f151862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f151863h;

    static {
        new C2857a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ve2.e eVar, String str, String str2, String str3) {
        super(context, "DI2ForIT2Request", eVar, str3, "connect2_exchange");
        context.getClass();
        eVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f151862g = str;
        this.f151863h = str2;
    }

    @Override // rc2.k
    public final byte[] d() {
        return d53.u.o("client_id=" + this.f151863h + "&connect_access_token=" + nd2.c.i(this.f151862g));
    }

    @Override // rc2.k
    public final void g(HttpURLConnection httpURLConnection) {
    }

    /* JADX INFO: renamed from: rc2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrc2/a$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2857a {
        public /* synthetic */ C2857a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2857a() {
        }
    }
}
