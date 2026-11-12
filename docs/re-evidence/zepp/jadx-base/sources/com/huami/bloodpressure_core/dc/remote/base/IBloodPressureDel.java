package com.huami.bloodpressure_core.dc.remote.base;

import com.huami.http.HttpKit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/base/IBloodPressureDel;", "Lcom/huami/http/HttpKit;", "", "", "params", "", "delData", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public interface IBloodPressureDel extends HttpKit {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static HttpUrl baseUrl(@NotNull IBloodPressureDel iBloodPressureDel) {
            return HttpKit.DefaultImpls.baseUrl(iBloodPressureDel);
        }

        @NotNull
        public static OkHttpClient okHttpClient(@NotNull IBloodPressureDel iBloodPressureDel) {
            return HttpKit.DefaultImpls.okHttpClient(iBloodPressureDel);
        }
    }

    @Nullable
    Object delData(@NotNull String[] strArr, @NotNull Continuation<? super Boolean> continuation);
}
