package com.huami.watchfacesstore.api;

import com.huami.watchfacesstore.di.WFUserInfo;
import com.huami.watchfacesstore.ext.KoinExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/huami/watchfacesstore/api/ParamsInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class ParamsInterceptor implements Interceptor {

    @NotNull
    private static final List<String> a = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"store-cdn.huami.com", "store-img.huami.com", "store-testing-cdn.huami.com"});

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        if (a.contains(chain.request().url().host())) {
            return chain.proceed(chain.request());
        }
        WFUserInfo userInfo = KoinExtKt.getUserInfo();
        String userId = userInfo.getUserId();
        String userRegion = userInfo.getUserRegion();
        String userCountry = userInfo.getUserCountry();
        String currentDeviceSn = KoinExtKt.getDeviceManager().getCurrentDeviceSn();
        if (currentDeviceSn == null) {
            currentDeviceSn = "";
        }
        return chain.proceed(chain.request().newBuilder().url(chain.request().url().newBuilder().addQueryParameter("userid", userId).addQueryParameter("user_country", userCountry).addQueryParameter("user_region", userRegion).addQueryParameter("sn", currentDeviceSn).build()).build());
    }
}
