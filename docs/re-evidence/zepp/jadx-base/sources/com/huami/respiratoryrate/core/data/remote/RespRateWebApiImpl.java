package com.huami.respiratoryrate.core.data.remote;

import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.respiratoryrate.core.RespRateConstants;
import com.huami.respiratoryrate.core.data.remote.entity.RespRateEventItem;
import com.huami.respiratoryrate.core.data.remote.entity.RespRateUserEvents;
import com.huami.respiratoryrate.core.utils.GsonConvertorKt;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/respiratoryrate/core/data/remote/RespRateWebApiImpl;", "Lcom/huami/respiratoryrate/core/data/remote/IRespRateWebApi;", "Lcom/huami/http/HttpKit;", "", "from", "to", "", "Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventItem;", "getEventList", "dataList", "", "postEventList", "", "a", "Ljava/lang/String;", "postEventsUrl", "Lokhttp3/MediaType;", "b", "Lokhttp3/MediaType;", "mediaType", "<init>", "()V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class RespRateWebApiImpl implements IRespRateWebApi, HttpKit {

    @NotNull
    public static final String LIMIT = "999";

    @NotNull
    private static final String c = "eventType";

    @NotNull
    private static final String d = "subType";

    @NotNull
    private static final String e = "from";

    @NotNull
    private static final String f = "to";

    @NotNull
    private static final String g = "limit";

    @NotNull
    private static final String h = "reverse";

    @NotNull
    private static final String i = "timeZone";

    @NotNull
    private static final String j = "userId";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String postEventsUrl = baseUrl() + "v2/users/me/events";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final MediaType mediaType = MediaType.parse("application/json; charset=utf-8");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ RespRateUserEvents a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RespRateUserEvents respRateUserEvents) {
            super(0);
            this.a = respRateUserEvents;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getRespRateEventFromServer: ", GsonConvertorKt.toJson(this.a));
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.respiratoryrate.core.data.remote.IRespRateWebApi
    @NotNull
    public List<RespRateEventItem> getEventList(long from, long to) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, this.postEventsUrl, r.hashMapOf(TuplesKt.to("eventType", RespRateEventItem.EventType), TuplesKt.to("subType", "real_data"), TuplesKt.to("from", Intrinsics.stringPlus("", Long.valueOf(from))), TuplesKt.to("to", Intrinsics.stringPlus("", Long.valueOf(to))), TuplesKt.to("limit", "999")), null, 4, null);
            ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
            if (!responseHttpGet$default.isSuccessful()) {
                throw new HttpError(responseHttpGet$default);
            }
            ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
            ResponseBody responseBodyBody = responseHttpGet$default.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            Object objConvert = converter.convert(responseBodyBody, new TypeToken<RespRateUserEvents>() { // from class: com.huami.respiratoryrate.core.data.remote.RespRateWebApiImpl$getEventList$lambda-1$$inlined$deserializeOrThrow$1
            }.getType());
            HMLog.debug(RespRateConstants.TAG, new a((RespRateUserEvents) objConvert));
            objM3845constructorimpl = Result.m3845constructorimpl(((RespRateUserEvents) objConvert).getItems());
            if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
                objM3845constructorimpl = CollectionsKt__CollectionsKt.emptyList();
            }
            return (List) objM3845constructorimpl;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.respiratoryrate.core.data.remote.IRespRateWebApi
    public boolean postEventList(@NotNull List<RespRateEventItem> dataList) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(HttpKitKtxKt.httpPost$default(this, this.postEventsUrl, RequestBody.create(this.mediaType, GsonConvertorKt.toJson(dataList)), null, null, 12, null).isSuccessful()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }
}
