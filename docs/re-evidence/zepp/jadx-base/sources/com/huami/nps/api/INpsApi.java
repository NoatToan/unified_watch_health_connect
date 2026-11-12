package com.huami.nps.api;

import com.huami.http.HttpKit;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/huami/nps/api/INpsApi;", "Lcom/huami/http/HttpKit;", "", "type", "", "Lcom/huami/nps/api/NpsVo;", "getNps", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userId", "", "ratingScore", "survey", "reportRating", "nps_release"}, k = 1, mv = {1, 5, 1})
public interface INpsApi extends HttpKit {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static HttpUrl baseUrl(@NotNull INpsApi iNpsApi) {
            return HttpKit.DefaultImpls.baseUrl(iNpsApi);
        }

        @NotNull
        public static OkHttpClient okHttpClient(@NotNull INpsApi iNpsApi) {
            return HttpKit.DefaultImpls.okHttpClient(iNpsApi);
        }
    }

    @Nullable
    Object getNps(@NotNull String str, @NotNull Continuation<? super List<NpsVo>> continuation);

    @Nullable
    String reportRating(@NotNull String userId, int ratingScore, @NotNull NpsVo survey);
}
