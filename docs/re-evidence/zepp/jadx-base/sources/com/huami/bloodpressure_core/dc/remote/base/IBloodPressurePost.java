package com.huami.bloodpressure_core.dc.remote.base;

import androidx.exifinterface.media.ExifInterface;
import com.huami.http.HttpKit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/base/IBloodPressurePost;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/http/HttpKit;", "data", "", "", "params", "", "postData", "(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public interface IBloodPressurePost<T> extends HttpKit {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static <T> HttpUrl baseUrl(@NotNull IBloodPressurePost<T> iBloodPressurePost) {
            return HttpKit.DefaultImpls.baseUrl(iBloodPressurePost);
        }

        @NotNull
        public static <T> OkHttpClient okHttpClient(@NotNull IBloodPressurePost<T> iBloodPressurePost) {
            return HttpKit.DefaultImpls.okHttpClient(iBloodPressurePost);
        }
    }

    @Nullable
    Object postData(T t, @NotNull String[] strArr, @NotNull Continuation<? super Boolean> continuation);
}
