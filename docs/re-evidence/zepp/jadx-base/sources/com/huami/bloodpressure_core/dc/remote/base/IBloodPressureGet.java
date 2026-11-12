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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J'\u0010\u0006\u001a\u00028\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/base/IBloodPressureGet;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/http/HttpKit;", "", "", "params", "getData", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public interface IBloodPressureGet<T> extends HttpKit {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static <T> HttpUrl baseUrl(@NotNull IBloodPressureGet<T> iBloodPressureGet) {
            return HttpKit.DefaultImpls.baseUrl(iBloodPressureGet);
        }

        @NotNull
        public static <T> OkHttpClient okHttpClient(@NotNull IBloodPressureGet<T> iBloodPressureGet) {
            return HttpKit.DefaultImpls.okHttpClient(iBloodPressureGet);
        }
    }

    @Nullable
    Object getData(@NotNull String[] strArr, @NotNull Continuation<? super T> continuation);
}
