package com.huami.snore.core.cloud.api;

import android.content.Context;
import com.huami.snore.core.cloud.api.request.UploadVoiceDataRequest;
import com.huami.snore.core.cloud.api.response.SnoreEventsResponse;
import com.huami.tools.analytics.DbUtils;
import com.loopj.android.http.AsyncHttpResponseHandler;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ5\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H¦@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/snore/core/cloud/api/RemoteVoiceDataApi;", "", "", "startTime", "endTime", "", "Lcom/huami/snore/core/cloud/api/response/SnoreEventsResponse;", "syncSnoreData", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeStamp", "findSnoreData", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteSnoreData", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "filePath", "Lcom/huami/snore/core/cloud/api/request/UploadVoiceDataRequest;", "data", "Lcom/loopj/android/http/AsyncHttpResponseHandler;", "handler", "uploadSnoreData", "(Landroid/content/Context;Ljava/lang/String;Lcom/huami/snore/core/cloud/api/request/UploadVoiceDataRequest;Lcom/loopj/android/http/AsyncHttpResponseHandler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "snoreFile", "url", "downloadFile", "snore_release"}, k = 1, mv = {1, 5, 1})
public interface RemoteVoiceDataApi {
    @Nullable
    Object deleteSnoreData(long j, long j2, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object deleteSnoreData(@Nullable Long l, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    File downloadFile(@NotNull File snoreFile, @Nullable String url);

    @Nullable
    Object findSnoreData(long j, @NotNull Continuation<? super SnoreEventsResponse> continuation);

    @Nullable
    Object syncSnoreData(long j, long j2, @NotNull Continuation<? super List<SnoreEventsResponse>> continuation);

    @Nullable
    Object uploadSnoreData(@NotNull Context context, @Nullable String str, @NotNull UploadVoiceDataRequest uploadVoiceDataRequest, @NotNull AsyncHttpResponseHandler asyncHttpResponseHandler, @NotNull Continuation<? super String> continuation);
}
