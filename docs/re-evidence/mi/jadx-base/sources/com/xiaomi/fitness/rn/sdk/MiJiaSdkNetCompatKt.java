package com.xiaomi.fitness.rn.sdk;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.smarthome.core.SmartHomeSDK;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u007f\u0010\u0002\u001a\u00020\u0003\"\u0010\b\u0000\u0010\u0004\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\t2\u001e\b\u0004\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00030\rj\b\u0012\u0004\u0012\u0002H\u0006`\f2\u0018\b\u0004\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\rj\u0002`\u000fH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"NET_TAG", "", "requestMiJiaServer", "", "T", "Lcom/xiaomi/fitness/net/response/BaseResult;", "R", "url", "map", "", "", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "sdk_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MiJiaSdkNetCompatKt {

    @NotNull
    public static final String NET_TAG = "MiJiaSdkNetCompat";

    public static final /* synthetic */ <T extends BaseResult<R>, R> void requestMiJiaServer(String url, Map<String, ? extends Object> map, final Function1<? super R, Unit> onSuccess, final Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValuePair("data", xpd.a(map)));
        final NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path(url).addQueries(arrayList).build();
        SmartHomeRc4Api smartHomeRc4Api = SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext());
        Intrinsics.needClassReification();
        smartHomeRc4Api.sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompatKt.requestMiJiaServer.1
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult p0) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError error) {
                String detail;
                Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "onFailure " + (error != null ? Integer.valueOf(error.getCode()) : null) + " " + (error != null ? error.getDetail() : null));
                Function1<ApiException, Unit> function1 = onFail;
                if (error == null || (detail = error.getDetail()) == null) {
                    detail = "onFailure";
                }
                function1.invoke2(new ApiException(detail, error != null ? error.getCode() : 10001));
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netRequestBuild != null) {
                    Intrinsics.checkNotNull(netResult);
                    if (!TextUtils.isEmpty(netResult.mResponse)) {
                        try {
                            String str = netResult.mResponse;
                            Gson gson = MiJiaSDKCompat.INSTANCE.getGson();
                            Intrinsics.reifiedOperationMarker(4, "T");
                            BaseResult baseResult = (BaseResult) gson.fromJson(str, BaseResult.class);
                            if (baseResult.isSuccess() && baseResult.getResult() != null) {
                                Function1<R, Unit> function1 = onSuccess;
                                Object result = baseResult.getResult();
                                Intrinsics.checkNotNull(result);
                                function1.invoke2((R) result);
                                Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "onSuccess " + str);
                                return;
                            }
                            Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "onSuccess failed " + baseResult);
                            onFail.invoke2(new ApiException(baseResult.getMsg(), baseResult.getCode()));
                            return;
                        } catch (Exception e) {
                            Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "onSuccess exception " + e);
                            onFail.invoke2(new ApiException(e));
                            return;
                        }
                    }
                }
                Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "onSuccess netResult is null");
                onFail.invoke2(new ApiException("netResult is null", 10001));
            }
        });
    }
}
