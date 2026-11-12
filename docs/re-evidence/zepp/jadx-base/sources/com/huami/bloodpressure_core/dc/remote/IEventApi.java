package com.huami.bloodpressure_core.dc.remote;

import androidx.exifinterface.media.ExifInterface;
import com.huami.http.HttpKit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0081\u0001\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016JC\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/IEventApi;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/http/HttpKit;", "", "url", "userId", "eventType", "subType", "", "from", "to", "next", "", "limit", "", "reverse", "Lcom/huami/bloodpressure_core/dc/remote/UserEventsResponse;", "Lcom/huami/bloodpressure_core/dc/remote/UserEventsNext;", "fetchData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jsonOfData", "uploadData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timestamp", "deleteData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public interface IEventApi<T> extends HttpKit {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static <T> HttpUrl baseUrl(@NotNull IEventApi<T> iEventApi) {
            return HttpKit.DefaultImpls.baseUrl(iEventApi);
        }

        public static /* synthetic */ Object deleteData$default(IEventApi iEventApi, String str, String str2, String str3, String str4, long j, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return iEventApi.deleteData(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, j, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteData");
        }

        public static /* synthetic */ Object fetchData$default(IEventApi iEventApi, String str, String str2, String str3, String str4, Long l, Long l2, Long l3, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iEventApi.fetchData(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : l, (i2 & 32) != 0 ? null : l2, (i2 & 64) != 0 ? null : l3, (i2 & 128) != 0 ? 1000 : i, (i2 & 256) != 0 ? false : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchData");
        }

        @NotNull
        public static <T> OkHttpClient okHttpClient(@NotNull IEventApi<T> iEventApi) {
            return HttpKit.DefaultImpls.okHttpClient(iEventApi);
        }
    }

    @Nullable
    Object deleteData(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, long j, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object fetchData(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, int i, boolean z, @NotNull Continuation<? super UserEventsResponse<T, UserEventsNext>> continuation);

    @Nullable
    Object uploadData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Boolean> continuation);
}
