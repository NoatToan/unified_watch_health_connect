package dz0;

import c22.k;
import com.google.common.net.HttpHeaders;
import d53.w;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldz0/d;", "Lid2/e;", "<init>", "()V", "gcm-network_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends id2.e {
    @Override // id2.e
    public final Response a(Interceptor.Chain chain) throws IOException {
        String string;
        boolean zC = ((k) KoinJavaComponent.get$default(k.class, null, null, 6, null)).c("gcm_oauth2_enabled");
        String strHeader = chain.request().header(HttpHeaders.AUTHORIZATION);
        if (!zC || strHeader == null || (string = w.i0(strHeader).toString()) == null || !string.equals("Bearer")) {
            return chain.proceed(chain.request());
        }
        h.C("Mobile Auth Lib was unable to provide an authorization");
        return null;
    }
}
