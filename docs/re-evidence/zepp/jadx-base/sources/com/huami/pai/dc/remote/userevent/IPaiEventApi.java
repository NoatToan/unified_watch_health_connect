package com.huami.pai.dc.remote.userevent;

import com.huami.http.HttpKit;
import com.huami.pai.vo.PaiEventVo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JU\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/huami/pai/dc/remote/userevent/IPaiEventApi;", "Lcom/huami/http/HttpKit;", "", "userId", "from", "to", "next", "limit", "reverse", "Lcom/huami/pai/vo/PaiEventVo;", "getAllData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jsonOfPai", "", "postDatas", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface IPaiEventApi extends HttpKit {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static HttpUrl baseUrl(@NotNull IPaiEventApi iPaiEventApi) {
            return HttpKit.DefaultImpls.baseUrl(iPaiEventApi);
        }

        public static /* synthetic */ Object getAllData$default(IPaiEventApi iPaiEventApi, String str, String str2, String str3, String str4, String str5, String str6, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return iPaiEventApi.getAllData(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "3000" : str5, (i & 32) != 0 ? "false" : str6, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllData");
        }

        @NotNull
        public static OkHttpClient okHttpClient(@NotNull IPaiEventApi iPaiEventApi) {
            return HttpKit.DefaultImpls.okHttpClient(iPaiEventApi);
        }
    }

    @Nullable
    Object getAllData(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull Continuation<? super PaiEventVo> continuation);

    @Nullable
    Object postDatas(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation);
}
