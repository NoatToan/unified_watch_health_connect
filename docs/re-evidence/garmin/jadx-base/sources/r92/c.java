package r92;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Locale;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr92/c;", "Lokhttp3/Interceptor;", "", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "<init>", "(I)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151438a;

    public c(int i14) {
        this.f151438a = i14;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        builderNewBuilder.header("X-app-ver", String.valueOf(this.f151438a));
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        builderNewBuilder.header("X-lang", language);
        return chain.proceed(builderNewBuilder.build());
    }
}
