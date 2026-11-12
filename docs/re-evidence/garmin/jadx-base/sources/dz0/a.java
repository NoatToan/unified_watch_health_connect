package dz0;

import android.content.Context;
import c22.s1;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.net.HttpHeaders;
import hb2.h;
import java.util.Locale;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldz0/a;", "Lokhttp3/Interceptor;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-network_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f61663a;

    public a(Context context) {
        context.getClass();
        this.f61663a = context;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        String strN;
        chain.getClass();
        s1.f23251a.getClass();
        Locale localeA = h.a(this.f61663a);
        localeA.getClass();
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        if (s.g(localeA.getLanguage(), "he") || s.g(localeA.getLanguage(), "iw")) {
            strN = fb1.c.n("he_", localeA.getCountry());
        } else if (s.g(localeA.getLanguage(), TtmlNode.ATTR_ID) || s.g(localeA.getLanguage(), "in")) {
            strN = fb1.c.n("in_", localeA.getCountry());
        } else if (lg.d.A(localeA)) {
            strN = fb1.c.n("nn_", localeA.getCountry());
        } else {
            strN = (s.g(localeA.getLanguage(), "yi") || s.g(localeA.getLanguage(), "ji")) ? fb1.c.n("yi_", localeA.getCountry()) : h.d(localeA);
        }
        return chain.proceed(builderNewBuilder.header(HttpHeaders.ACCEPT_LANGUAGE, strN).build());
    }
}
