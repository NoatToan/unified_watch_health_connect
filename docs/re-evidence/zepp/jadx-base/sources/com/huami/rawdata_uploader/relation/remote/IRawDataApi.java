package com.huami.rawdata_uploader.relation.remote;

import androidx.exifinterface.media.ExifInterface;
import com.huami.http.HttpKit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/huami/rawdata_uploader/relation/remote/IRawDataApi;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/http/HttpKit;", "", "jsonOfData", "", "postDataList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public interface IRawDataApi<T> extends HttpKit {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static <T> HttpUrl baseUrl(@NotNull IRawDataApi<T> iRawDataApi) {
            return HttpKit.DefaultImpls.baseUrl(iRawDataApi);
        }

        @NotNull
        public static <T> OkHttpClient okHttpClient(@NotNull IRawDataApi<T> iRawDataApi) {
            return HttpKit.DefaultImpls.okHttpClient(iRawDataApi);
        }
    }

    @Nullable
    Object postDataList(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);
}
