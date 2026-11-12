package com.huami.health.afppg.data.remote;

import android.net.Uri;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.reflect.TypeToken;
import com.huami.health.afppg.data.local.bean.AFibData;
import com.huami.health.afppg.data.local.bean.RRPeak;
import com.huami.health.afppg.data.remote.dto.AFResultPostRequest;
import com.huami.health.afppg.data.remote.dto.HealthEvents;
import com.huami.health.afppg.data.remote.dto.RRPeakRequest;
import com.huami.health.afppg.data.remote.dto.RRPeakSummary;
import com.huami.health.afppg.data.remote.dto.RawUrlResponse;
import com.huami.health.afppg.data.remote.dto.UserEvents;
import com.huami.health.afppg.utils.GsonConvertorKt;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001)\u0018\u0000 =2\u00020\u0001:\u0001=B\u0017\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002¢\u0006\u0004\b;\u0010<J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0014\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\r0\bJ\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002J\u0016\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002J\u001f\u0010 \u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!R\u0019\u0010&\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010(\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b'\u0010%R\u001d\u0010,\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b\"\u0010+R\u0016\u0010.\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010#R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010#R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010#R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010#R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010#R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/huami/health/afppg/data/remote/AfPpgWebApi;", "Lcom/huami/http/HttpKit;", "", "fileName", "type", "c", "", "b", "", "Lcom/huami/health/afppg/data/remote/dto/HealthEvents$EventItem;", "list", "", "postEvents", "Lcom/huami/health/afppg/data/local/bean/AFibData;", "postAFResult", "url", "Ljava/io/File;", "file", "uploadRRRawFile", "Lcom/huami/health/afppg/data/remote/dto/RawUrlResponse;", "fetchRawUrl", "Lcom/huami/health/afppg/data/local/bean/RRPeak;", "data", "filePath", "uploadRRPeak", "timeFrom", "timeTo", "Lcom/huami/health/afppg/data/remote/dto/UserEvents;", "getAFibEventFromServer", "", "timeNext", "limit", "getHREventFromServer", "(Ljava/lang/Long;I)Lcom/huami/health/afppg/data/remote/dto/UserEvents;", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "userId", "getAppName", "appName", "com/huami/health/afppg/data/remote/AfPpgWebApi$httpKit$2$1", "Lkotlin/Lazy;", "()Lcom/huami/health/afppg/data/remote/AfPpgWebApi$httpKit$2$1;", "httpKit", GoogleApiAvailabilityLight.a, "postEventsUrl", "e", "postAFResultUrl", "f", "uploadFileUrl", "g", "uploadRRPeakUrl", "h", "dateStrUrl", "Lokhttp3/MediaType;", "i", "Lokhttp3/MediaType;", "mediaType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class AfPpgWebApi implements HttpKit {

    @NotNull
    public static final String HEART_HEALTH_TYPE = "heart_health";

    @NotNull
    public static final String LIMIT = "999";

    @NotNull
    public static final String PARAM_FILE_TYPE_VALUE_RRPEAK = "RR_PEAK_DATA";

    @NotNull
    private static final String j = "af_ppg_PPGApi";
    private static final long k = 3600000;

    @NotNull
    private static final String l = "fileType";

    @NotNull
    private static final String m = "fileName";

    @NotNull
    private static final String n = "eventType";

    @NotNull
    private static final String o = "from";

    @NotNull
    private static final String p = "to";

    @NotNull
    private static final String q = "next";

    @NotNull
    private static final String r = "limit";

    @NotNull
    private static final String s = "reverse";

    @NotNull
    private static final String t = "timeZone";

    @NotNull
    private static final String u = "userId";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy httpKit = LazyKt__LazyJVMKt.lazy(new Function0<AfPpgWebApi$httpKit$2.AnonymousClass1>() { // from class: com.huami.health.afppg.data.remote.AfPpgWebApi$httpKit$2
        /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.health.afppg.data.remote.AfPpgWebApi$httpKit$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            return new HttpKit() { // from class: com.huami.health.afppg.data.remote.AfPpgWebApi$httpKit$2.1
                @Override // com.huami.http.HttpKit
                @NotNull
                public HttpUrl baseUrl() {
                    return HttpKit.DefaultImpls.baseUrl(this);
                }

                @Override // com.huami.http.HttpKit
                @NotNull
                public OkHttpClient okHttpClient() {
                    return new OkHttpClient();
                }
            };
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String postEventsUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String postAFResultUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String uploadFileUrl;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String uploadRRPeakUrl;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String dateStrUrl;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private final MediaType mediaType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ UserEvents a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UserEvents userEvents) {
            super(0);
            this.a = userEvents;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getHREventFromServer: ", GsonConvertorKt.toJson(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ UserEvents a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UserEvents userEvents) {
            super(0);
            this.a = userEvents;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getHREventFromServer: ", GsonConvertorKt.toJson(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "postAFResult list isNullOrEmpty";
        }
    }

    public AfPpgWebApi(@NotNull String str, @NotNull String str2) {
        this.userId = str;
        this.appName = str2;
        this.postEventsUrl = baseUrl() + "users/" + str + "/events";
        this.postAFResultUrl = baseUrl() + "users/" + str + "/ppg/afResult";
        this.uploadFileUrl = baseUrl() + "users/" + str + "/apps/" + str2 + "/fileUploadURIs";
        StringBuilder sb = new StringBuilder();
        sb.append(baseUrl());
        sb.append("users/");
        sb.append(str);
        sb.append("/rrPeak");
        this.uploadRRPeakUrl = sb.toString();
        this.dateStrUrl = baseUrl() + "users/" + str + "/events/dateString";
        this.mediaType = MediaType.parse("application/json; charset=utf-8");
    }

    private final AfPpgWebApi$httpKit$2.AnonymousClass1 a() {
        return (AfPpgWebApi$httpKit$2.AnonymousClass1) this.httpKit.getValue();
    }

    private final int b() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(14, -calendar.get(15));
        return (int) ((Calendar.getInstance().getTimeInMillis() - calendar.getTimeInMillis()) / 3600000);
    }

    private final String c(String fileName, String type) {
        Uri.Builder builder = new Uri.Builder();
        WebUrlConfig webUrlConfig = WebUrlConfigKt.getWebUrlConfig();
        String strUploadFileUrl = webUrlConfig == null ? null : webUrlConfig.uploadFileUrl();
        if (strUploadFileUrl == null) {
            strUploadFileUrl = this.uploadFileUrl;
        }
        builder.encodedPath(strUploadFileUrl);
        builder.appendQueryParameter("fileType", type);
        builder.appendQueryParameter("fileName", fileName);
        return builder.build().toString();
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @NotNull
    public final RawUrlResponse fetchRawUrl(@NotNull String fileName, @NotNull String type) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, c(fileName, type), null, null, 6, null);
            ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
            if (!responseHttpGet$default.isSuccessful()) {
                throw new HttpError(responseHttpGet$default);
            }
            ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
            ResponseBody responseBodyBody = responseHttpGet$default.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            objM3845constructorimpl = Result.m3845constructorimpl((RawUrlResponse) converter.convert(responseBodyBody, new TypeToken<RawUrlResponse>() { // from class: com.huami.health.afppg.data.remote.AfPpgWebApi$fetchRawUrl$lambda-8$$inlined$deserializeOrThrow$1
            }.getType()));
            ResultKt.throwOnFailure(objM3845constructorimpl);
            return (RawUrlResponse) objM3845constructorimpl;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    @NotNull
    public final UserEvents getAFibEventFromServer(@NotNull String timeFrom, @NotNull String timeTo) throws HttpError {
        WebUrlConfig webUrlConfig = WebUrlConfigKt.getWebUrlConfig();
        String strDateStrUrl = webUrlConfig == null ? null : webUrlConfig.dateStrUrl();
        if (strDateStrUrl == null) {
            strDateStrUrl = this.dateStrUrl;
        }
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, strDateStrUrl, r.hashMapOf(TuplesKt.to("eventType", "17_1"), TuplesKt.to("from", timeFrom), TuplesKt.to("to", timeTo), TuplesKt.to("limit", "999"), TuplesKt.to("reverse", "1"), TuplesKt.to("timeZone", TimeZone.getDefault().getID()), TuplesKt.to("userId", this.userId)), null, 4, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        UserEvents userEvents = (UserEvents) converter.convert(responseBodyBody, new TypeToken<UserEvents>() { // from class: com.huami.health.afppg.data.remote.AfPpgWebApi$getAFibEventFromServer$$inlined$deserializeOrThrow$1
        }.getType());
        HMLog.debug(j, new a(userEvents));
        return userEvents;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final UserEvents getHREventFromServer(@Nullable Long timeNext, int limit) throws HttpError {
        Map mapMutableMapOf = r.mutableMapOf(TuplesKt.to("eventType", "heart_health"), TuplesKt.to("limit", String.valueOf(limit)), TuplesKt.to("reverse", "1"));
        if (timeNext != null) {
            timeNext.longValue();
            mapMutableMapOf.put("next", timeNext.toString());
        }
        WebUrlConfig webUrlConfig = WebUrlConfigKt.getWebUrlConfig();
        String strPostEventsUrl = webUrlConfig == null ? null : webUrlConfig.postEventsUrl();
        if (strPostEventsUrl == null) {
            strPostEventsUrl = this.postEventsUrl;
        }
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, strPostEventsUrl, mapMutableMapOf, null, 4, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        UserEvents userEvents = (UserEvents) converter.convert(responseBodyBody, new TypeToken<UserEvents>() { // from class: com.huami.health.afppg.data.remote.AfPpgWebApi$getHREventFromServer$$inlined$deserializeOrThrow$1
        }.getType());
        HMLog.debug(j, new b(userEvents));
        return userEvents;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    public final boolean postAFResult(@NotNull List<AFibData> list) {
        Object objM3845constructorimpl;
        HashMap map = new HashMap();
        if (list.isEmpty()) {
            HMLog.info(j, c.a);
            return false;
        }
        for (AFibData aFibData : list) {
            map.put(String.valueOf(aFibData.getTimestamp()), Integer.valueOf(aFibData.getValue()));
        }
        AFResultPostRequest aFResultPostRequest = new AFResultPostRequest(null, 0, 0, null, 15, null);
        aFResultPostRequest.setResultMap(map);
        aFResultPostRequest.setTimeZone(b());
        aFResultPostRequest.setDeviceSource(list.get(0).getDeviceSource());
        AFibData aFibData2 = list.get(0);
        aFResultPostRequest.setExtra(new AFResultPostRequest.ExtraData(aFibData2.getSn(), aFibData2.getDeviceId(), aFibData2.getFwVer()));
        try {
            Result.Companion companion = Result.Companion;
            WebUrlConfig webUrlConfig = WebUrlConfigKt.getWebUrlConfig();
            String strPostAFResultUrl = webUrlConfig == null ? null : webUrlConfig.postAFResultUrl();
            if (strPostAFResultUrl == null) {
                strPostAFResultUrl = this.postAFResultUrl;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(HttpKitKtxKt.httpPost$default(this, strPostAFResultUrl, RequestBody.create(this.mediaType, GsonConvertorKt.toJson(aFResultPostRequest)), null, null, 12, null).isSuccessful()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    public final boolean postEvents(@NotNull List<HealthEvents.EventItem> list) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            WebUrlConfig webUrlConfig = WebUrlConfigKt.getWebUrlConfig();
            String strPostEventsUrl = webUrlConfig == null ? null : webUrlConfig.postEventsUrl();
            if (strPostEventsUrl == null) {
                strPostEventsUrl = this.postEventsUrl;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(HttpKitKtxKt.httpPost$default(this, strPostEventsUrl, RequestBody.create(this.mediaType, GsonConvertorKt.toJson(list)), null, null, 12, null).isSuccessful()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    public final boolean uploadRRPeak(@NotNull RRPeak data, @NotNull String filePath) {
        RRPeakRequest rRPeakRequest = new RRPeakRequest(filePath, new RRPeakRequest.MetaData(data.getGeneratedTime(), new RRPeakSummary(data.getDeviceSource(), data.getDataType(), data.getFwVer(), data.getLength(), data.getLastRrPackageTime(), data.getAfData(), data.getRrRecordSize(), data.getAfResult(), data.getSn(), data.getDeviceId(), b()), data.getDataType()));
        WebUrlConfig webUrlConfig = WebUrlConfigKt.getWebUrlConfig();
        String strUploadRRPeakUrl = webUrlConfig == null ? null : webUrlConfig.uploadRRPeakUrl();
        if (strUploadRRPeakUrl == null) {
            strUploadRRPeakUrl = this.uploadRRPeakUrl;
        }
        return HttpKitKtxKt.httpPost$default(this, strUploadRRPeakUrl, RequestBody.create(this.mediaType, GsonConvertorKt.toJson(rRPeakRequest)), null, null, 12, null).isSuccessful();
    }

    public final boolean uploadRRRawFile(@NotNull String url, @NotNull File file) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(HttpKitKtxKt.httpPut$default(a(), url, RequestBody.create((MediaType) null, file), null, null, 12, null).isSuccessful()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        ResultKt.throwOnFailure(objM3845constructorimpl);
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }
}
