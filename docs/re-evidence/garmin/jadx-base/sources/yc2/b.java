package yc2;

import am.j;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import d53.w;
import java.net.URL;
import n63.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import r1.q2;
import ve2.e;
import ve2.f;
import ya1.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lyc2/b;", "Lyc2/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "di2AccessToken", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends yc2.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f196743h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f196744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f196745g;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, e eVar, String str) {
        super(context);
        context.getClass();
        eVar.getClass();
        str.getClass();
        this.f196744f = eVar;
        this.f196745g = str;
    }

    public static final URL c(b bVar) {
        bVar.getClass();
        return new URL(j.m("https://", f.c(bVar.f196744f).f204881b, "/garminprofile-service/user?image-version=PROFILE"));
    }

    public static final wc2.a.b d(b bVar, Logger logger) throws Exception {
        String strH = nd2.c.h(bVar.f196741b);
        if (strH == null || w.J(strH)) {
            q2.u("empty response body");
            return null;
        }
        zc2.a aVar = (zc2.a) p.a(new h(5)).c(zc2.a.INSTANCE.serializer(), strH);
        String str = "200 GET " + bVar.f196740a;
        if (nd2.c.f125412a) {
            str = str + "\n" + aVar;
        }
        if (logger != null) {
            logger.debug(str);
        }
        return new wc2.a.b(aVar, 200);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyc2/b$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
