package id2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.common.net.HttpHeaders;
import okhttp3.Interceptor;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lid2/o;", "Lid2/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "libName", "libVersion", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f93064d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f93065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f93066c;

    public o(Context context, String str, String str2) {
        context.getClass();
        o13.n nVar = o13.n.PUBLICATION;
        this.f93065b = o13.m.a(nVar, new n(context, 0, str, str2));
        this.f93066c = o13.m.a(nVar, new ho0.a(context, 5));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, o13.l] */
    @Override // id2.e
    public final Response a(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().header(HttpHeaders.USER_AGENT, (String) this.f93066c.getValue()).header("X-Garmin-User-Agent", (String) this.f93065b.getValue()).build());
    }

    public /* synthetic */ o(Context context, String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2);
    }
}
