package com.huami.nps.api;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.nps.p003const.NpsConst;
import com.huami.tools.log.HMLog;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002J#\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0016R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/huami/nps/api/NpsApiImpl;", "Lcom/huami/nps/api/INpsApi;", "", "url", "b", "Lkotlin/Pair;", "", "", "a", "type", "", "Lcom/huami/nps/api/NpsVo;", "getNps", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userId", "ratingScore", "survey", "reportRating", "Ljava/lang/String;", "TEST_HOST", "PRODUCT_HOST", "<init>", "()V", "Companion", "nps_release"}, k = 1, mv = {1, 5, 1})
public final class NpsApiImpl implements INpsApi {
    public static final int ONE_THOUSAND = 1000;

    @NotNull
    private static final String c = "ApiRatingImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String TEST_HOST = "https://api-doctor-staging.huami.com/";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String PRODUCT_HOST = "https://api-doctor-cn.huami.com/";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, int i) {
            super(0);
            this.a = j;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fetchZeroTimestampAndCurrentTimeZone zeroTimeZoneTimestamp = " + this.a + " - currentTimeZone = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.nps.api.NpsApiImpl", f = "INpsApi.kt", i = {}, l = {68}, m = "getNps", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return NpsApiImpl.this.getNps(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ PostRatingParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PostRatingParam postRatingParam) {
            super(0);
            this.a = postRatingParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "reportRating = " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "reportRating result = " + this.a;
        }
    }

    private final Pair<Long, Integer> a() {
        Date date = new Date();
        int offset = TimeZone.getDefault().getOffset(date.getTime());
        long time = date.getTime() - ((long) offset);
        HMLog.info(c, new a(time, offset));
        return new Pair<>(Long.valueOf(time / ((long) 1000)), Integer.valueOf(offset / 1000));
    }

    private final String b(String url) {
        if (HMServerDef.isProductUrl()) {
            return HMServerDef.getUrl(url);
        }
        return this.TEST_HOST + url;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return INpsApi.DefaultImpls.baseUrl(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.huami.nps.api.INpsApi
    @Nullable
    public Object getNps(@NotNull String str, @NotNull Continuation<? super List<NpsVo>> continuation) throws HttpError {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object objAwaitHttpGet$default = bVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar2.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitHttpGet$default);
            String strB = b(m.replace$default(m.replace$default(NpsConst.Path.INSTANCE.getDISCOVERY_BASE_URL(), "{type}", str, false, 4, (Object) null), "{config}", "watch", false, 4, (Object) null));
            bVar2.c = 1;
            objAwaitHttpGet$default = HttpKitKtxKt.awaitHttpGet$default(this, strB, null, null, bVar2, 6, null);
            if (objAwaitHttpGet$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitHttpGet$default);
        }
        Response response = (Response) objAwaitHttpGet$default;
        ConverterKt.checkToken(response, ConverterKt.responseToJsonStr(response));
        if (!response.isSuccessful()) {
            throw new HttpError(response);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return converter.convert(responseBodyBody, new TypeToken<List<? extends NpsVo>>() { // from class: com.huami.nps.api.NpsApiImpl$getNps$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return INpsApi.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.nps.api.INpsApi
    @Nullable
    public String reportRating(@NotNull String userId, int ratingScore, @NotNull NpsVo survey) {
        NpsSurvey nps_survey;
        String id;
        Object objM3845constructorimpl;
        NpsSurvey nps_survey2;
        List<Questions> questions;
        Questions questions2;
        List<Options> options;
        Options options2;
        String id2;
        NpsSurvey nps_survey3;
        List<Questions> questions3;
        Questions questions4;
        String id3;
        NpsSurvey nps_survey4;
        String id4;
        AdExtension extensions = survey.getExtensions();
        String strB = b(m.replace$default(NpsConst.Path.REPORT_RATING_URL, "{servey_id}", (extensions == null || (nps_survey = extensions.getNps_survey()) == null || (id = nps_survey.getId()) == null) ? "" : id, false, 4, (Object) null));
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        try {
            Result.Companion companion = Result.Companion;
            JsonObject jsonObject = new JsonObject();
            AdExtension extensions2 = survey.getExtensions();
            if (extensions2 == null || (nps_survey2 = extensions2.getNps_survey()) == null || (questions = nps_survey2.getQuestions()) == null || (questions2 = questions.get(0)) == null || (options = questions2.getOptions()) == null || (options2 = options.get(0)) == null || (id2 = options2.getId()) == null) {
                id2 = EcgData.DEFAULT_DIGIT_VALUE;
            }
            jsonObject.addProperty(id2, String.valueOf(ratingScore));
            AdExtension extensions3 = survey.getExtensions();
            if (extensions3 == null || (nps_survey3 = extensions3.getNps_survey()) == null || (questions3 = nps_survey3.getQuestions()) == null || (questions4 = questions3.get(0)) == null || (id3 = questions4.getId()) == null) {
                id3 = EcgData.DEFAULT_DIGIT_VALUE;
            }
            PostRatingDataParam postRatingDataParam = new PostRatingDataParam(id3, jsonObject);
            Pair<Long, Integer> pairA = a();
            PostRatingTimeParam postRatingTimeParam = new PostRatingTimeParam(pairA.getSecond().intValue(), pairA.getFirst().longValue());
            AdExtension extensions4 = survey.getExtensions();
            PostRatingParam postRatingParam = new PostRatingParam((extensions4 == null || (nps_survey4 = extensions4.getNps_survey()) == null || (id4 = nps_survey4.getId()) == null) ? EcgData.DEFAULT_DIGIT_VALUE : id4, userId, new Gson().toJson(postRatingTimeParam), CollectionsKt__CollectionsKt.mutableListOf(postRatingDataParam), 0L, 16, null);
            HMLog.info(c, new c(postRatingParam));
            String strResponseToJsonStr = ConverterKt.responseToJsonStr(HttpKitKtxKt.httpPost$default(this, strB, RequestBody.create(mediaType, new Gson().toJson(postRatingParam)), null, null, 12, null));
            HMLog.info(c, new d(strResponseToJsonStr));
            objM3845constructorimpl = Result.m3845constructorimpl(strResponseToJsonStr);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (String) objM3845constructorimpl;
    }
}
