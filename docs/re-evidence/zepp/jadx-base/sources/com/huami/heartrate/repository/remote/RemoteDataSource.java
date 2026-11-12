package com.huami.heartrate.repository.remote;

import com.google.gson.reflect.TypeToken;
import com.huami.heartrate.koin.KoinExtKt;
import com.huami.heartrate.repository.entity.PagingRemoteHeartRateData;
import com.huami.heartrate.repository.entity.RemoteHeartRateData;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0017B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/huami/heartrate/repository/remote/RemoteDataSource;", "Lcom/huami/heartrate/repository/remote/IRemoteDataSource;", "Lcom/huami/http/HttpKit;", "Lorg/koin/core/component/KoinComponent;", "", "dateFrom", "dateEnd", "", "limitCount", "Lcom/huami/heartrate/repository/entity/RemoteHeartRateData;", "getRemoteMeasureHrData", "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextSeconds", "limit", "Lcom/huami/heartrate/repository/entity/PagingRemoteHeartRateData;", "fetchMeasureHeartRateData", "(Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "userId", "<init>", "(Ljava/lang/String;)V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class RemoteDataSource implements IRemoteDataSource, HttpKit, KoinComponent {

    @NotNull
    private static final String b = "users/%s/heartRate";

    @NotNull
    private static final String c = "friend/common/datas/%s/manualHeartRateData";

    @NotNull
    private static final String d = "type";

    @NotNull
    private static final String e = "limit";

    @NotNull
    private static final String f = "next";

    @NotNull
    private static final String g = "startTime";

    @NotNull
    private static final String h = "endTime";

    @NotNull
    private static final String i = "sub";

    @NotNull
    private static final String j = "DAY";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    public RemoteDataSource(@NotNull String str) {
        this.userId = str;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.heartrate.repository.remote.IRemoteDataSource
    @Nullable
    public Object fetchMeasureHeartRateData(@Nullable Long l, int i2, @NotNull Continuation<? super PagingRemoteHeartRateData> continuation) throws HttpError {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("type", "2");
        if (l != null) {
            systemParams.put("next", l.toString());
        }
        systemParams.put("limit", String.valueOf(i2));
        String str = String.format(b, Arrays.copyOf(new Object[]{this.userId}, 1));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : systemParams.entrySet()) {
            if (Boxing.boxBoolean(entry.getValue() instanceof String).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(TuplesKt.to(key, (String) value));
        }
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, str, r.toMap(arrayList), null, 4, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return converter.convert(responseBodyBody, new TypeToken<PagingRemoteHeartRateData>() { // from class: com.huami.heartrate.repository.remote.RemoteDataSource$fetchMeasureHeartRateData$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.heartrate.repository.remote.IRemoteDataSource
    @Nullable
    public Object getRemoteMeasureHrData(long j2, long j3, int i2, @NotNull Continuation<? super RemoteHeartRateData> continuation) throws HttpError {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("type", "2");
        systemParams.put("startTime", String.valueOf(j2));
        systemParams.put("endTime", String.valueOf(j3));
        if (i2 > 0) {
            systemParams.put("limit", String.valueOf(i2));
        }
        if (KoinExtKt.isHollywood()) {
            systemParams.put("sub", "DAY");
        }
        String str = String.format(KoinExtKt.isHollywood() ? c : b, Arrays.copyOf(new Object[]{this.userId}, 1));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : systemParams.entrySet()) {
            if (Boxing.boxBoolean(entry.getValue() instanceof String).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(TuplesKt.to(key, (String) value));
        }
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, str, r.toMap(arrayList), null, 4, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return converter.convert(responseBodyBody, new TypeToken<RemoteHeartRateData>() { // from class: com.huami.heartrate.repository.remote.RemoteDataSource$getRemoteMeasureHrData$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}
