package te2;

import android.content.Context;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import java.net.UnknownHostException;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lte2/u;", "", "", "logTag", "Lre2/b$c;", "mode", "Landroid/content/Context;", "appContext", "<init>", "(Ljava/lang/String;Lre2/b$c;Landroid/content/Context;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re2.b.c f164314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f164315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f164316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f164317d;

    public u(String str, re2.b.c cVar, Context context) {
        str.getClass();
        cVar.getClass();
        context.getClass();
        this.f164314a = cVar;
        this.f164315b = context;
        re2.l0.f152316a.getClass();
        this.f164316c = re2.l0.c(str);
    }

    public final Object a(v13.c cVar) {
        x53.c cVar2 = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new t(this, null), cVar);
    }

    public final j2 b() {
        if (re2.b.c.DEFAULT == this.f164314a) {
            return j2.f164115a;
        }
        return null;
    }

    public final void c(String str, Throwable th3) throws Throwable {
        boolean z14 = th3 instanceof RateLimitException;
        Logger logger = this.f164316c;
        if (!z14 && !(th3 instanceof UnknownHostException)) {
            logger.error(str, th3);
            return;
        }
        String strConcat = str.concat(": {}");
        String message = th3.getMessage();
        if (message == null) {
            message = "";
        }
        logger.warn(strConcat, message);
        throw th3;
    }
}
