package com.huami.sleep.data.remote.tonality;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.sleep.data.remote.CloudApiConstant;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/sleep/data/remote/tonality/ApiTonalityRatingImpl;", "Lcom/huami/sleep/data/remote/tonality/IApiTonalityRating;", "Lcom/huami/http/HttpKit;", "", "userId", "", "ratingScore", "reportTonalityRating", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class ApiTonalityRatingImpl implements IApiTonalityRating, HttpKit {

    @NotNull
    private static final String a = "ApiTonalityRatingImpl";

    @NotNull
    private static final String b = "225";

    @NotNull
    private static final String c = "1647848510945";

    @NotNull
    private static final String d = "1647848510947";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getStatisticsSleepData url = " + this.a + " - userId = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ PostTonalityRatingParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PostTonalityRatingParam postTonalityRatingParam) {
            super(0);
            this.a = postTonalityRatingParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getStatisticsSleepData postTonalityRatingParam = " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getStatisticsSleepData result = " + this.a;
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.sleep.data.remote.tonality.IApiTonalityRating
    @Nullable
    public String reportTonalityRating(@NotNull String userId, int ratingScore) {
        Object objM3845constructorimpl;
        String str = baseUrl() + m.replace$default(CloudApiConstant.TONALITY_RATING_URL, "{sid}", b, false, 4, (Object) null);
        HMLog.info(a, new a(str, userId));
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        try {
            Result.Companion companion = Result.Companion;
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(d, String.valueOf(ratingScore));
            PostTonalityRatingDataParam postTonalityRatingDataParam = new PostTonalityRatingDataParam(c, jsonObject);
            Pair<Long, Integer> pairFetchZeroTimestampAndCurrentTimeZone = SleepTimeUtil.INSTANCE.fetchZeroTimestampAndCurrentTimeZone();
            PostTonalityRatingParam postTonalityRatingParam = new PostTonalityRatingParam(b, userId, new Gson().toJson(new PostTonalityRatingTimeParam(pairFetchZeroTimestampAndCurrentTimeZone.getSecond().intValue(), pairFetchZeroTimestampAndCurrentTimeZone.getFirst().longValue())), CollectionsKt__CollectionsKt.mutableListOf(postTonalityRatingDataParam), 0L, 16, null);
            HMLog.info(a, new b(postTonalityRatingParam));
            String strResponseToJsonStr = ConverterKt.responseToJsonStr(HttpKitKtxKt.httpPost$default(this, str, RequestBody.create(mediaType, new Gson().toJson(postTonalityRatingParam)), null, null, 12, null));
            HMLog.info(a, new c(strResponseToJsonStr));
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
