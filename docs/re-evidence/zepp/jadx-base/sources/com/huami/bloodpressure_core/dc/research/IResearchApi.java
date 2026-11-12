package com.huami.bloodpressure_core.dc.research;

import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.http.HttpKit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/huami/bloodpressure_core/dc/research/IResearchApi;", "Lcom/huami/http/HttpKit;", "", BloodPressureConst.ParamKey.PLANID, "Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchVo;", "getResearch", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "packageName", "getResearchUrl", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public interface IResearchApi extends HttpKit {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static HttpUrl baseUrl(@NotNull IResearchApi iResearchApi) {
            return HttpKit.DefaultImpls.baseUrl(iResearchApi);
        }

        @NotNull
        public static OkHttpClient okHttpClient(@NotNull IResearchApi iResearchApi) {
            return HttpKit.DefaultImpls.okHttpClient(iResearchApi);
        }
    }

    @Nullable
    Object getResearch(@NotNull String str, @NotNull Continuation<? super BloodPressureResearchVo> continuation);

    @Nullable
    Object getResearchUrl(@NotNull String str, @NotNull Continuation<? super String> continuation);
}
