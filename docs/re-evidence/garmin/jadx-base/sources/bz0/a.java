package bz0;

import com.github.mikephil.chartingv2.BuildConfig;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        o oVar = o.f22274a;
        chain.getClass();
        Request.Builder builderHeader = chain.request().newBuilder().header("Api-Version", BuildConfig.VERSION_NAME);
        o.f22274a.getClass();
        o.h().getClass();
        return chain.proceed(builderHeader.header("X-garmin-client-id", "GarminConnectMobileAndroid").build());
    }
}
